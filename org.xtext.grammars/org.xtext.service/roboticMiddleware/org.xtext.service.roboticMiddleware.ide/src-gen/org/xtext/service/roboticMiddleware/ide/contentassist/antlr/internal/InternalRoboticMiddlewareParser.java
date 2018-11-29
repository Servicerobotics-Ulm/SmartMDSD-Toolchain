package org.xtext.service.roboticMiddleware.ide.contentassist.antlr.internal;

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
import org.xtext.service.roboticMiddleware.services.RoboticMiddlewareGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRoboticMiddlewareParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalRoboticMiddlewareParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRoboticMiddlewareParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRoboticMiddlewareParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRoboticMiddleware.g"; }


    	private RoboticMiddlewareGrammarAccess grammarAccess;

    	public void setGrammarAccess(RoboticMiddlewareGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleRoboticMiddleware"
    // InternalRoboticMiddleware.g:94:1: entryRuleRoboticMiddleware : ruleRoboticMiddleware EOF ;
    public final void entryRuleRoboticMiddleware() throws RecognitionException {
        try {
            // InternalRoboticMiddleware.g:95:1: ( ruleRoboticMiddleware EOF )
            // InternalRoboticMiddleware.g:96:1: ruleRoboticMiddleware EOF
            {
             before(grammarAccess.getRoboticMiddlewareRule()); 
            pushFollow(FOLLOW_1);
            ruleRoboticMiddleware();

            state._fsp--;

             after(grammarAccess.getRoboticMiddlewareRule()); 
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
    // $ANTLR end "entryRuleRoboticMiddleware"


    // $ANTLR start "ruleRoboticMiddleware"
    // InternalRoboticMiddleware.g:103:1: ruleRoboticMiddleware : ( ( rule__RoboticMiddleware__Alternatives ) ) ;
    public final void ruleRoboticMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:107:2: ( ( ( rule__RoboticMiddleware__Alternatives ) ) )
            // InternalRoboticMiddleware.g:108:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            {
            // InternalRoboticMiddleware.g:108:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            // InternalRoboticMiddleware.g:109:3: ( rule__RoboticMiddleware__Alternatives )
            {
             before(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); 
            // InternalRoboticMiddleware.g:110:3: ( rule__RoboticMiddleware__Alternatives )
            // InternalRoboticMiddleware.g:110:4: rule__RoboticMiddleware__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoboticMiddleware__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoboticMiddleware"


    // $ANTLR start "entryRuleFQN"
    // InternalRoboticMiddleware.g:119:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalRoboticMiddleware.g:120:1: ( ruleFQN EOF )
            // InternalRoboticMiddleware.g:121:1: ruleFQN EOF
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
    // InternalRoboticMiddleware.g:128:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:132:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalRoboticMiddleware.g:133:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalRoboticMiddleware.g:133:2: ( ( rule__FQN__Group__0 ) )
            // InternalRoboticMiddleware.g:134:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalRoboticMiddleware.g:135:3: ( rule__FQN__Group__0 )
            // InternalRoboticMiddleware.g:135:4: rule__FQN__Group__0
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
    // InternalRoboticMiddleware.g:144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalRoboticMiddleware.g:145:1: ( ruleEString EOF )
            // InternalRoboticMiddleware.g:146:1: ruleEString EOF
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
    // InternalRoboticMiddleware.g:153:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:157:2: ( ( RULE_STRING ) )
            // InternalRoboticMiddleware.g:158:2: ( RULE_STRING )
            {
            // InternalRoboticMiddleware.g:158:2: ( RULE_STRING )
            // InternalRoboticMiddleware.g:159:3: RULE_STRING
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


    // $ANTLR start "entryRuleACE_SmartSoft"
    // InternalRoboticMiddleware.g:169:1: entryRuleACE_SmartSoft : ruleACE_SmartSoft EOF ;
    public final void entryRuleACE_SmartSoft() throws RecognitionException {
        try {
            // InternalRoboticMiddleware.g:170:1: ( ruleACE_SmartSoft EOF )
            // InternalRoboticMiddleware.g:171:1: ruleACE_SmartSoft EOF
            {
             before(grammarAccess.getACE_SmartSoftRule()); 
            pushFollow(FOLLOW_1);
            ruleACE_SmartSoft();

            state._fsp--;

             after(grammarAccess.getACE_SmartSoftRule()); 
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
    // $ANTLR end "entryRuleACE_SmartSoft"


    // $ANTLR start "ruleACE_SmartSoft"
    // InternalRoboticMiddleware.g:178:1: ruleACE_SmartSoft : ( ( rule__ACE_SmartSoft__Group__0 ) ) ;
    public final void ruleACE_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:182:2: ( ( ( rule__ACE_SmartSoft__Group__0 ) ) )
            // InternalRoboticMiddleware.g:183:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            {
            // InternalRoboticMiddleware.g:183:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            // InternalRoboticMiddleware.g:184:3: ( rule__ACE_SmartSoft__Group__0 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup()); 
            // InternalRoboticMiddleware.g:185:3: ( rule__ACE_SmartSoft__Group__0 )
            // InternalRoboticMiddleware.g:185:4: rule__ACE_SmartSoft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getACE_SmartSoftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACE_SmartSoft"


    // $ANTLR start "entryRuleOpcUa_SeRoNet"
    // InternalRoboticMiddleware.g:194:1: entryRuleOpcUa_SeRoNet : ruleOpcUa_SeRoNet EOF ;
    public final void entryRuleOpcUa_SeRoNet() throws RecognitionException {
        try {
            // InternalRoboticMiddleware.g:195:1: ( ruleOpcUa_SeRoNet EOF )
            // InternalRoboticMiddleware.g:196:1: ruleOpcUa_SeRoNet EOF
            {
             before(grammarAccess.getOpcUa_SeRoNetRule()); 
            pushFollow(FOLLOW_1);
            ruleOpcUa_SeRoNet();

            state._fsp--;

             after(grammarAccess.getOpcUa_SeRoNetRule()); 
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
    // $ANTLR end "entryRuleOpcUa_SeRoNet"


    // $ANTLR start "ruleOpcUa_SeRoNet"
    // InternalRoboticMiddleware.g:203:1: ruleOpcUa_SeRoNet : ( ( rule__OpcUa_SeRoNet__Group__0 ) ) ;
    public final void ruleOpcUa_SeRoNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:207:2: ( ( ( rule__OpcUa_SeRoNet__Group__0 ) ) )
            // InternalRoboticMiddleware.g:208:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            {
            // InternalRoboticMiddleware.g:208:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            // InternalRoboticMiddleware.g:209:3: ( rule__OpcUa_SeRoNet__Group__0 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); 
            // InternalRoboticMiddleware.g:210:3: ( rule__OpcUa_SeRoNet__Group__0 )
            // InternalRoboticMiddleware.g:210:4: rule__OpcUa_SeRoNet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpcUa_SeRoNet"


    // $ANTLR start "entryRuleCORBA_SmartSoft"
    // InternalRoboticMiddleware.g:219:1: entryRuleCORBA_SmartSoft : ruleCORBA_SmartSoft EOF ;
    public final void entryRuleCORBA_SmartSoft() throws RecognitionException {
        try {
            // InternalRoboticMiddleware.g:220:1: ( ruleCORBA_SmartSoft EOF )
            // InternalRoboticMiddleware.g:221:1: ruleCORBA_SmartSoft EOF
            {
             before(grammarAccess.getCORBA_SmartSoftRule()); 
            pushFollow(FOLLOW_1);
            ruleCORBA_SmartSoft();

            state._fsp--;

             after(grammarAccess.getCORBA_SmartSoftRule()); 
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
    // $ANTLR end "entryRuleCORBA_SmartSoft"


    // $ANTLR start "ruleCORBA_SmartSoft"
    // InternalRoboticMiddleware.g:228:1: ruleCORBA_SmartSoft : ( ( rule__CORBA_SmartSoft__Group__0 ) ) ;
    public final void ruleCORBA_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:232:2: ( ( ( rule__CORBA_SmartSoft__Group__0 ) ) )
            // InternalRoboticMiddleware.g:233:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            {
            // InternalRoboticMiddleware.g:233:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            // InternalRoboticMiddleware.g:234:3: ( rule__CORBA_SmartSoft__Group__0 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); 
            // InternalRoboticMiddleware.g:235:3: ( rule__CORBA_SmartSoft__Group__0 )
            // InternalRoboticMiddleware.g:235:4: rule__CORBA_SmartSoft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCORBA_SmartSoft"


    // $ANTLR start "entryRuleDDS_SmartSoft"
    // InternalRoboticMiddleware.g:244:1: entryRuleDDS_SmartSoft : ruleDDS_SmartSoft EOF ;
    public final void entryRuleDDS_SmartSoft() throws RecognitionException {
        try {
            // InternalRoboticMiddleware.g:245:1: ( ruleDDS_SmartSoft EOF )
            // InternalRoboticMiddleware.g:246:1: ruleDDS_SmartSoft EOF
            {
             before(grammarAccess.getDDS_SmartSoftRule()); 
            pushFollow(FOLLOW_1);
            ruleDDS_SmartSoft();

            state._fsp--;

             after(grammarAccess.getDDS_SmartSoftRule()); 
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
    // $ANTLR end "entryRuleDDS_SmartSoft"


    // $ANTLR start "ruleDDS_SmartSoft"
    // InternalRoboticMiddleware.g:253:1: ruleDDS_SmartSoft : ( ( rule__DDS_SmartSoft__Group__0 ) ) ;
    public final void ruleDDS_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:257:2: ( ( ( rule__DDS_SmartSoft__Group__0 ) ) )
            // InternalRoboticMiddleware.g:258:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            {
            // InternalRoboticMiddleware.g:258:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            // InternalRoboticMiddleware.g:259:3: ( rule__DDS_SmartSoft__Group__0 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup()); 
            // InternalRoboticMiddleware.g:260:3: ( rule__DDS_SmartSoft__Group__0 )
            // InternalRoboticMiddleware.g:260:4: rule__DDS_SmartSoft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDDS_SmartSoftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDDS_SmartSoft"


    // $ANTLR start "rule__RoboticMiddleware__Alternatives"
    // InternalRoboticMiddleware.g:268:1: rule__RoboticMiddleware__Alternatives : ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) );
    public final void rule__RoboticMiddleware__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:272:1: ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt1=1;
                }
                break;
            case 14:
                {
                alt1=2;
                }
                break;
            case 15:
                {
                alt1=3;
                }
                break;
            case 16:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalRoboticMiddleware.g:273:2: ( ruleACE_SmartSoft )
                    {
                    // InternalRoboticMiddleware.g:273:2: ( ruleACE_SmartSoft )
                    // InternalRoboticMiddleware.g:274:3: ruleACE_SmartSoft
                    {
                     before(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleACE_SmartSoft();

                    state._fsp--;

                     after(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoboticMiddleware.g:279:2: ( ruleOpcUa_SeRoNet )
                    {
                    // InternalRoboticMiddleware.g:279:2: ( ruleOpcUa_SeRoNet )
                    // InternalRoboticMiddleware.g:280:3: ruleOpcUa_SeRoNet
                    {
                     before(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOpcUa_SeRoNet();

                    state._fsp--;

                     after(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoboticMiddleware.g:285:2: ( ruleCORBA_SmartSoft )
                    {
                    // InternalRoboticMiddleware.g:285:2: ( ruleCORBA_SmartSoft )
                    // InternalRoboticMiddleware.g:286:3: ruleCORBA_SmartSoft
                    {
                     before(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCORBA_SmartSoft();

                    state._fsp--;

                     after(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoboticMiddleware.g:291:2: ( ruleDDS_SmartSoft )
                    {
                    // InternalRoboticMiddleware.g:291:2: ( ruleDDS_SmartSoft )
                    // InternalRoboticMiddleware.g:292:3: ruleDDS_SmartSoft
                    {
                     before(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDDS_SmartSoft();

                    state._fsp--;

                     after(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3()); 

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
    // $ANTLR end "rule__RoboticMiddleware__Alternatives"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalRoboticMiddleware.g:301:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:305:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalRoboticMiddleware.g:306:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalRoboticMiddleware.g:313:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:317:1: ( ( RULE_ID ) )
            // InternalRoboticMiddleware.g:318:1: ( RULE_ID )
            {
            // InternalRoboticMiddleware.g:318:1: ( RULE_ID )
            // InternalRoboticMiddleware.g:319:2: RULE_ID
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
    // InternalRoboticMiddleware.g:328:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:332:1: ( rule__FQN__Group__1__Impl )
            // InternalRoboticMiddleware.g:333:2: rule__FQN__Group__1__Impl
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
    // InternalRoboticMiddleware.g:339:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:343:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalRoboticMiddleware.g:344:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalRoboticMiddleware.g:344:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalRoboticMiddleware.g:345:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalRoboticMiddleware.g:346:2: ( rule__FQN__Group_1__0 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRoboticMiddleware.g:346:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // InternalRoboticMiddleware.g:355:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:359:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalRoboticMiddleware.g:360:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalRoboticMiddleware.g:367:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:371:1: ( ( '.' ) )
            // InternalRoboticMiddleware.g:372:1: ( '.' )
            {
            // InternalRoboticMiddleware.g:372:1: ( '.' )
            // InternalRoboticMiddleware.g:373:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalRoboticMiddleware.g:382:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:386:1: ( rule__FQN__Group_1__1__Impl )
            // InternalRoboticMiddleware.g:387:2: rule__FQN__Group_1__1__Impl
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
    // InternalRoboticMiddleware.g:393:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:397:1: ( ( RULE_ID ) )
            // InternalRoboticMiddleware.g:398:1: ( RULE_ID )
            {
            // InternalRoboticMiddleware.g:398:1: ( RULE_ID )
            // InternalRoboticMiddleware.g:399:2: RULE_ID
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


    // $ANTLR start "rule__ACE_SmartSoft__Group__0"
    // InternalRoboticMiddleware.g:409:1: rule__ACE_SmartSoft__Group__0 : rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 ;
    public final void rule__ACE_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:413:1: ( rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 )
            // InternalRoboticMiddleware.g:414:2: rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ACE_SmartSoft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__0"


    // $ANTLR start "rule__ACE_SmartSoft__Group__0__Impl"
    // InternalRoboticMiddleware.g:421:1: rule__ACE_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__ACE_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:425:1: ( ( () ) )
            // InternalRoboticMiddleware.g:426:1: ( () )
            {
            // InternalRoboticMiddleware.g:426:1: ( () )
            // InternalRoboticMiddleware.g:427:2: ()
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); 
            // InternalRoboticMiddleware.g:428:2: ()
            // InternalRoboticMiddleware.g:428:3: 
            {
            }

             after(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__0__Impl"


    // $ANTLR start "rule__ACE_SmartSoft__Group__1"
    // InternalRoboticMiddleware.g:436:1: rule__ACE_SmartSoft__Group__1 : rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 ;
    public final void rule__ACE_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:440:1: ( rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 )
            // InternalRoboticMiddleware.g:441:2: rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ACE_SmartSoft__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__1"


    // $ANTLR start "rule__ACE_SmartSoft__Group__1__Impl"
    // InternalRoboticMiddleware.g:448:1: rule__ACE_SmartSoft__Group__1__Impl : ( 'ACE_SmartSoft' ) ;
    public final void rule__ACE_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:452:1: ( ( 'ACE_SmartSoft' ) )
            // InternalRoboticMiddleware.g:453:1: ( 'ACE_SmartSoft' )
            {
            // InternalRoboticMiddleware.g:453:1: ( 'ACE_SmartSoft' )
            // InternalRoboticMiddleware.g:454:2: 'ACE_SmartSoft'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__1__Impl"


    // $ANTLR start "rule__ACE_SmartSoft__Group__2"
    // InternalRoboticMiddleware.g:463:1: rule__ACE_SmartSoft__Group__2 : rule__ACE_SmartSoft__Group__2__Impl ;
    public final void rule__ACE_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:467:1: ( rule__ACE_SmartSoft__Group__2__Impl )
            // InternalRoboticMiddleware.g:468:2: rule__ACE_SmartSoft__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__2"


    // $ANTLR start "rule__ACE_SmartSoft__Group__2__Impl"
    // InternalRoboticMiddleware.g:474:1: rule__ACE_SmartSoft__Group__2__Impl : ( ( rule__ACE_SmartSoft__Group_2__0 )? ) ;
    public final void rule__ACE_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:478:1: ( ( ( rule__ACE_SmartSoft__Group_2__0 )? ) )
            // InternalRoboticMiddleware.g:479:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            {
            // InternalRoboticMiddleware.g:479:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            // InternalRoboticMiddleware.g:480:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); 
            // InternalRoboticMiddleware.g:481:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoboticMiddleware.g:481:3: rule__ACE_SmartSoft__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ACE_SmartSoft__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__2__Impl"


    // $ANTLR start "rule__ACE_SmartSoft__Group_2__0"
    // InternalRoboticMiddleware.g:490:1: rule__ACE_SmartSoft__Group_2__0 : rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 ;
    public final void rule__ACE_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:494:1: ( rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 )
            // InternalRoboticMiddleware.g:495:2: rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__ACE_SmartSoft__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group_2__0"


    // $ANTLR start "rule__ACE_SmartSoft__Group_2__0__Impl"
    // InternalRoboticMiddleware.g:502:1: rule__ACE_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__ACE_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:506:1: ( ( 'description' ) )
            // InternalRoboticMiddleware.g:507:1: ( 'description' )
            {
            // InternalRoboticMiddleware.g:507:1: ( 'description' )
            // InternalRoboticMiddleware.g:508:2: 'description'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group_2__0__Impl"


    // $ANTLR start "rule__ACE_SmartSoft__Group_2__1"
    // InternalRoboticMiddleware.g:517:1: rule__ACE_SmartSoft__Group_2__1 : rule__ACE_SmartSoft__Group_2__1__Impl ;
    public final void rule__ACE_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:521:1: ( rule__ACE_SmartSoft__Group_2__1__Impl )
            // InternalRoboticMiddleware.g:522:2: rule__ACE_SmartSoft__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group_2__1"


    // $ANTLR start "rule__ACE_SmartSoft__Group_2__1__Impl"
    // InternalRoboticMiddleware.g:528:1: rule__ACE_SmartSoft__Group_2__1__Impl : ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__ACE_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:532:1: ( ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalRoboticMiddleware.g:533:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalRoboticMiddleware.g:533:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalRoboticMiddleware.g:534:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalRoboticMiddleware.g:535:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            // InternalRoboticMiddleware.g:535:3: rule__ACE_SmartSoft__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group_2__1__Impl"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__0"
    // InternalRoboticMiddleware.g:544:1: rule__OpcUa_SeRoNet__Group__0 : rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 ;
    public final void rule__OpcUa_SeRoNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:548:1: ( rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 )
            // InternalRoboticMiddleware.g:549:2: rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__OpcUa_SeRoNet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__0"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__0__Impl"
    // InternalRoboticMiddleware.g:556:1: rule__OpcUa_SeRoNet__Group__0__Impl : ( () ) ;
    public final void rule__OpcUa_SeRoNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:560:1: ( ( () ) )
            // InternalRoboticMiddleware.g:561:1: ( () )
            {
            // InternalRoboticMiddleware.g:561:1: ( () )
            // InternalRoboticMiddleware.g:562:2: ()
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); 
            // InternalRoboticMiddleware.g:563:2: ()
            // InternalRoboticMiddleware.g:563:3: 
            {
            }

             after(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__0__Impl"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__1"
    // InternalRoboticMiddleware.g:571:1: rule__OpcUa_SeRoNet__Group__1 : rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 ;
    public final void rule__OpcUa_SeRoNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:575:1: ( rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 )
            // InternalRoboticMiddleware.g:576:2: rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__OpcUa_SeRoNet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__1"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__1__Impl"
    // InternalRoboticMiddleware.g:583:1: rule__OpcUa_SeRoNet__Group__1__Impl : ( 'OpcUa_SeRoNet' ) ;
    public final void rule__OpcUa_SeRoNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:587:1: ( ( 'OpcUa_SeRoNet' ) )
            // InternalRoboticMiddleware.g:588:1: ( 'OpcUa_SeRoNet' )
            {
            // InternalRoboticMiddleware.g:588:1: ( 'OpcUa_SeRoNet' )
            // InternalRoboticMiddleware.g:589:2: 'OpcUa_SeRoNet'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__1__Impl"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__2"
    // InternalRoboticMiddleware.g:598:1: rule__OpcUa_SeRoNet__Group__2 : rule__OpcUa_SeRoNet__Group__2__Impl ;
    public final void rule__OpcUa_SeRoNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:602:1: ( rule__OpcUa_SeRoNet__Group__2__Impl )
            // InternalRoboticMiddleware.g:603:2: rule__OpcUa_SeRoNet__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__2"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__2__Impl"
    // InternalRoboticMiddleware.g:609:1: rule__OpcUa_SeRoNet__Group__2__Impl : ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) ;
    public final void rule__OpcUa_SeRoNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:613:1: ( ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) )
            // InternalRoboticMiddleware.g:614:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            {
            // InternalRoboticMiddleware.g:614:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            // InternalRoboticMiddleware.g:615:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); 
            // InternalRoboticMiddleware.g:616:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoboticMiddleware.g:616:3: rule__OpcUa_SeRoNet__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUa_SeRoNet__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__2__Impl"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group_2__0"
    // InternalRoboticMiddleware.g:625:1: rule__OpcUa_SeRoNet__Group_2__0 : rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 ;
    public final void rule__OpcUa_SeRoNet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:629:1: ( rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 )
            // InternalRoboticMiddleware.g:630:2: rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__OpcUa_SeRoNet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group_2__0"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group_2__0__Impl"
    // InternalRoboticMiddleware.g:637:1: rule__OpcUa_SeRoNet__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:641:1: ( ( 'description' ) )
            // InternalRoboticMiddleware.g:642:1: ( 'description' )
            {
            // InternalRoboticMiddleware.g:642:1: ( 'description' )
            // InternalRoboticMiddleware.g:643:2: 'description'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group_2__0__Impl"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group_2__1"
    // InternalRoboticMiddleware.g:652:1: rule__OpcUa_SeRoNet__Group_2__1 : rule__OpcUa_SeRoNet__Group_2__1__Impl ;
    public final void rule__OpcUa_SeRoNet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:656:1: ( rule__OpcUa_SeRoNet__Group_2__1__Impl )
            // InternalRoboticMiddleware.g:657:2: rule__OpcUa_SeRoNet__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group_2__1"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group_2__1__Impl"
    // InternalRoboticMiddleware.g:663:1: rule__OpcUa_SeRoNet__Group_2__1__Impl : ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:667:1: ( ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) )
            // InternalRoboticMiddleware.g:668:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            {
            // InternalRoboticMiddleware.g:668:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            // InternalRoboticMiddleware.g:669:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); 
            // InternalRoboticMiddleware.g:670:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            // InternalRoboticMiddleware.g:670:3: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group_2__1__Impl"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__0"
    // InternalRoboticMiddleware.g:679:1: rule__CORBA_SmartSoft__Group__0 : rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 ;
    public final void rule__CORBA_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:683:1: ( rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 )
            // InternalRoboticMiddleware.g:684:2: rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__CORBA_SmartSoft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__0"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__0__Impl"
    // InternalRoboticMiddleware.g:691:1: rule__CORBA_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__CORBA_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:695:1: ( ( () ) )
            // InternalRoboticMiddleware.g:696:1: ( () )
            {
            // InternalRoboticMiddleware.g:696:1: ( () )
            // InternalRoboticMiddleware.g:697:2: ()
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); 
            // InternalRoboticMiddleware.g:698:2: ()
            // InternalRoboticMiddleware.g:698:3: 
            {
            }

             after(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__0__Impl"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__1"
    // InternalRoboticMiddleware.g:706:1: rule__CORBA_SmartSoft__Group__1 : rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 ;
    public final void rule__CORBA_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:710:1: ( rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 )
            // InternalRoboticMiddleware.g:711:2: rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__CORBA_SmartSoft__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__1"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__1__Impl"
    // InternalRoboticMiddleware.g:718:1: rule__CORBA_SmartSoft__Group__1__Impl : ( 'CORBA_SmartSoft' ) ;
    public final void rule__CORBA_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:722:1: ( ( 'CORBA_SmartSoft' ) )
            // InternalRoboticMiddleware.g:723:1: ( 'CORBA_SmartSoft' )
            {
            // InternalRoboticMiddleware.g:723:1: ( 'CORBA_SmartSoft' )
            // InternalRoboticMiddleware.g:724:2: 'CORBA_SmartSoft'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__1__Impl"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__2"
    // InternalRoboticMiddleware.g:733:1: rule__CORBA_SmartSoft__Group__2 : rule__CORBA_SmartSoft__Group__2__Impl ;
    public final void rule__CORBA_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:737:1: ( rule__CORBA_SmartSoft__Group__2__Impl )
            // InternalRoboticMiddleware.g:738:2: rule__CORBA_SmartSoft__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__2"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__2__Impl"
    // InternalRoboticMiddleware.g:744:1: rule__CORBA_SmartSoft__Group__2__Impl : ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) ;
    public final void rule__CORBA_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:748:1: ( ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) )
            // InternalRoboticMiddleware.g:749:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            {
            // InternalRoboticMiddleware.g:749:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            // InternalRoboticMiddleware.g:750:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); 
            // InternalRoboticMiddleware.g:751:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoboticMiddleware.g:751:3: rule__CORBA_SmartSoft__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CORBA_SmartSoft__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__2__Impl"


    // $ANTLR start "rule__CORBA_SmartSoft__Group_2__0"
    // InternalRoboticMiddleware.g:760:1: rule__CORBA_SmartSoft__Group_2__0 : rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 ;
    public final void rule__CORBA_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:764:1: ( rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 )
            // InternalRoboticMiddleware.g:765:2: rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__CORBA_SmartSoft__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group_2__0"


    // $ANTLR start "rule__CORBA_SmartSoft__Group_2__0__Impl"
    // InternalRoboticMiddleware.g:772:1: rule__CORBA_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__CORBA_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:776:1: ( ( 'description' ) )
            // InternalRoboticMiddleware.g:777:1: ( 'description' )
            {
            // InternalRoboticMiddleware.g:777:1: ( 'description' )
            // InternalRoboticMiddleware.g:778:2: 'description'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group_2__0__Impl"


    // $ANTLR start "rule__CORBA_SmartSoft__Group_2__1"
    // InternalRoboticMiddleware.g:787:1: rule__CORBA_SmartSoft__Group_2__1 : rule__CORBA_SmartSoft__Group_2__1__Impl ;
    public final void rule__CORBA_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:791:1: ( rule__CORBA_SmartSoft__Group_2__1__Impl )
            // InternalRoboticMiddleware.g:792:2: rule__CORBA_SmartSoft__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group_2__1"


    // $ANTLR start "rule__CORBA_SmartSoft__Group_2__1__Impl"
    // InternalRoboticMiddleware.g:798:1: rule__CORBA_SmartSoft__Group_2__1__Impl : ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__CORBA_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:802:1: ( ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalRoboticMiddleware.g:803:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalRoboticMiddleware.g:803:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalRoboticMiddleware.g:804:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalRoboticMiddleware.g:805:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            // InternalRoboticMiddleware.g:805:3: rule__CORBA_SmartSoft__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group_2__1__Impl"


    // $ANTLR start "rule__DDS_SmartSoft__Group__0"
    // InternalRoboticMiddleware.g:814:1: rule__DDS_SmartSoft__Group__0 : rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 ;
    public final void rule__DDS_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:818:1: ( rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 )
            // InternalRoboticMiddleware.g:819:2: rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__DDS_SmartSoft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__0"


    // $ANTLR start "rule__DDS_SmartSoft__Group__0__Impl"
    // InternalRoboticMiddleware.g:826:1: rule__DDS_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__DDS_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:830:1: ( ( () ) )
            // InternalRoboticMiddleware.g:831:1: ( () )
            {
            // InternalRoboticMiddleware.g:831:1: ( () )
            // InternalRoboticMiddleware.g:832:2: ()
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); 
            // InternalRoboticMiddleware.g:833:2: ()
            // InternalRoboticMiddleware.g:833:3: 
            {
            }

             after(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__0__Impl"


    // $ANTLR start "rule__DDS_SmartSoft__Group__1"
    // InternalRoboticMiddleware.g:841:1: rule__DDS_SmartSoft__Group__1 : rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 ;
    public final void rule__DDS_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:845:1: ( rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 )
            // InternalRoboticMiddleware.g:846:2: rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__DDS_SmartSoft__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__1"


    // $ANTLR start "rule__DDS_SmartSoft__Group__1__Impl"
    // InternalRoboticMiddleware.g:853:1: rule__DDS_SmartSoft__Group__1__Impl : ( 'DDS_SmartSoft' ) ;
    public final void rule__DDS_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:857:1: ( ( 'DDS_SmartSoft' ) )
            // InternalRoboticMiddleware.g:858:1: ( 'DDS_SmartSoft' )
            {
            // InternalRoboticMiddleware.g:858:1: ( 'DDS_SmartSoft' )
            // InternalRoboticMiddleware.g:859:2: 'DDS_SmartSoft'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__1__Impl"


    // $ANTLR start "rule__DDS_SmartSoft__Group__2"
    // InternalRoboticMiddleware.g:868:1: rule__DDS_SmartSoft__Group__2 : rule__DDS_SmartSoft__Group__2__Impl ;
    public final void rule__DDS_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:872:1: ( rule__DDS_SmartSoft__Group__2__Impl )
            // InternalRoboticMiddleware.g:873:2: rule__DDS_SmartSoft__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__2"


    // $ANTLR start "rule__DDS_SmartSoft__Group__2__Impl"
    // InternalRoboticMiddleware.g:879:1: rule__DDS_SmartSoft__Group__2__Impl : ( ( rule__DDS_SmartSoft__Group_2__0 )? ) ;
    public final void rule__DDS_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:883:1: ( ( ( rule__DDS_SmartSoft__Group_2__0 )? ) )
            // InternalRoboticMiddleware.g:884:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            {
            // InternalRoboticMiddleware.g:884:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            // InternalRoboticMiddleware.g:885:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); 
            // InternalRoboticMiddleware.g:886:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoboticMiddleware.g:886:3: rule__DDS_SmartSoft__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DDS_SmartSoft__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__2__Impl"


    // $ANTLR start "rule__DDS_SmartSoft__Group_2__0"
    // InternalRoboticMiddleware.g:895:1: rule__DDS_SmartSoft__Group_2__0 : rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 ;
    public final void rule__DDS_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:899:1: ( rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 )
            // InternalRoboticMiddleware.g:900:2: rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_8);
            rule__DDS_SmartSoft__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group_2__0"


    // $ANTLR start "rule__DDS_SmartSoft__Group_2__0__Impl"
    // InternalRoboticMiddleware.g:907:1: rule__DDS_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__DDS_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:911:1: ( ( 'description' ) )
            // InternalRoboticMiddleware.g:912:1: ( 'description' )
            {
            // InternalRoboticMiddleware.g:912:1: ( 'description' )
            // InternalRoboticMiddleware.g:913:2: 'description'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group_2__0__Impl"


    // $ANTLR start "rule__DDS_SmartSoft__Group_2__1"
    // InternalRoboticMiddleware.g:922:1: rule__DDS_SmartSoft__Group_2__1 : rule__DDS_SmartSoft__Group_2__1__Impl ;
    public final void rule__DDS_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:926:1: ( rule__DDS_SmartSoft__Group_2__1__Impl )
            // InternalRoboticMiddleware.g:927:2: rule__DDS_SmartSoft__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group_2__1"


    // $ANTLR start "rule__DDS_SmartSoft__Group_2__1__Impl"
    // InternalRoboticMiddleware.g:933:1: rule__DDS_SmartSoft__Group_2__1__Impl : ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__DDS_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:937:1: ( ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalRoboticMiddleware.g:938:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalRoboticMiddleware.g:938:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalRoboticMiddleware.g:939:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalRoboticMiddleware.g:940:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            // InternalRoboticMiddleware.g:940:3: rule__DDS_SmartSoft__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group_2__1__Impl"


    // $ANTLR start "rule__ACE_SmartSoft__DescriptionAssignment_2_1"
    // InternalRoboticMiddleware.g:949:1: rule__ACE_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ACE_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:953:1: ( ( ruleEString ) )
            // InternalRoboticMiddleware.g:954:2: ( ruleEString )
            {
            // InternalRoboticMiddleware.g:954:2: ( ruleEString )
            // InternalRoboticMiddleware.g:955:3: ruleEString
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__DescriptionAssignment_2_1"


    // $ANTLR start "rule__OpcUa_SeRoNet__DescriptionAssignment_2_1"
    // InternalRoboticMiddleware.g:964:1: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpcUa_SeRoNet__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:968:1: ( ( ruleEString ) )
            // InternalRoboticMiddleware.g:969:2: ( ruleEString )
            {
            // InternalRoboticMiddleware.g:969:2: ( ruleEString )
            // InternalRoboticMiddleware.g:970:3: ruleEString
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__DescriptionAssignment_2_1"


    // $ANTLR start "rule__CORBA_SmartSoft__DescriptionAssignment_2_1"
    // InternalRoboticMiddleware.g:979:1: rule__CORBA_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CORBA_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:983:1: ( ( ruleEString ) )
            // InternalRoboticMiddleware.g:984:2: ( ruleEString )
            {
            // InternalRoboticMiddleware.g:984:2: ( ruleEString )
            // InternalRoboticMiddleware.g:985:3: ruleEString
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__DescriptionAssignment_2_1"


    // $ANTLR start "rule__DDS_SmartSoft__DescriptionAssignment_2_1"
    // InternalRoboticMiddleware.g:994:1: rule__DDS_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DDS_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoboticMiddleware.g:998:1: ( ( ruleEString ) )
            // InternalRoboticMiddleware.g:999:2: ( ruleEString )
            {
            // InternalRoboticMiddleware.g:999:2: ( ruleEString )
            // InternalRoboticMiddleware.g:1000:3: ruleEString
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__DescriptionAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});

}