package org.xtext.base.stateMachine.ide.contentassist.antlr.internal;

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
import org.xtext.base.stateMachine.services.StateMachineGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalStateMachineParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'public'", "'private'", "'StateMachine'", "'{'", "'}'", "'.'", "'State'", "';'", "'StateTransition'", "'->'"
    };
    public static final int RULE_STRING=6;
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
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;

    // delegates
    // delegators


        public InternalStateMachineParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalStateMachineParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalStateMachineParser.tokenNames; }
    public String getGrammarFileName() { return "InternalStateMachine.g"; }


    	private StateMachineGrammarAccess grammarAccess;

    	public void setGrammarAccess(StateMachineGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleStateMachine"
    // InternalStateMachine.g:94:1: entryRuleStateMachine : ruleStateMachine EOF ;
    public final void entryRuleStateMachine() throws RecognitionException {
        try {
            // InternalStateMachine.g:95:1: ( ruleStateMachine EOF )
            // InternalStateMachine.g:96:1: ruleStateMachine EOF
            {
             before(grammarAccess.getStateMachineRule()); 
            pushFollow(FOLLOW_1);
            ruleStateMachine();

            state._fsp--;

             after(grammarAccess.getStateMachineRule()); 
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
    // $ANTLR end "entryRuleStateMachine"


    // $ANTLR start "ruleStateMachine"
    // InternalStateMachine.g:103:1: ruleStateMachine : ( ( rule__StateMachine__Group__0 ) ) ;
    public final void ruleStateMachine() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:107:2: ( ( ( rule__StateMachine__Group__0 ) ) )
            // InternalStateMachine.g:108:2: ( ( rule__StateMachine__Group__0 ) )
            {
            // InternalStateMachine.g:108:2: ( ( rule__StateMachine__Group__0 ) )
            // InternalStateMachine.g:109:3: ( rule__StateMachine__Group__0 )
            {
             before(grammarAccess.getStateMachineAccess().getGroup()); 
            // InternalStateMachine.g:110:3: ( rule__StateMachine__Group__0 )
            // InternalStateMachine.g:110:4: rule__StateMachine__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateMachine"


    // $ANTLR start "entryRuleFQN"
    // InternalStateMachine.g:119:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalStateMachine.g:120:1: ( ruleFQN EOF )
            // InternalStateMachine.g:121:1: ruleFQN EOF
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
    // InternalStateMachine.g:128:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:132:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalStateMachine.g:133:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalStateMachine.g:133:2: ( ( rule__FQN__Group__0 ) )
            // InternalStateMachine.g:134:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalStateMachine.g:135:3: ( rule__FQN__Group__0 )
            // InternalStateMachine.g:135:4: rule__FQN__Group__0
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


    // $ANTLR start "entryRuleAbstractMachineElement"
    // InternalStateMachine.g:144:1: entryRuleAbstractMachineElement : ruleAbstractMachineElement EOF ;
    public final void entryRuleAbstractMachineElement() throws RecognitionException {
        try {
            // InternalStateMachine.g:145:1: ( ruleAbstractMachineElement EOF )
            // InternalStateMachine.g:146:1: ruleAbstractMachineElement EOF
            {
             before(grammarAccess.getAbstractMachineElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractMachineElement();

            state._fsp--;

             after(grammarAccess.getAbstractMachineElementRule()); 
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
    // $ANTLR end "entryRuleAbstractMachineElement"


    // $ANTLR start "ruleAbstractMachineElement"
    // InternalStateMachine.g:153:1: ruleAbstractMachineElement : ( ( rule__AbstractMachineElement__Alternatives ) ) ;
    public final void ruleAbstractMachineElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:157:2: ( ( ( rule__AbstractMachineElement__Alternatives ) ) )
            // InternalStateMachine.g:158:2: ( ( rule__AbstractMachineElement__Alternatives ) )
            {
            // InternalStateMachine.g:158:2: ( ( rule__AbstractMachineElement__Alternatives ) )
            // InternalStateMachine.g:159:3: ( rule__AbstractMachineElement__Alternatives )
            {
             before(grammarAccess.getAbstractMachineElementAccess().getAlternatives()); 
            // InternalStateMachine.g:160:3: ( rule__AbstractMachineElement__Alternatives )
            // InternalStateMachine.g:160:4: rule__AbstractMachineElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractMachineElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractMachineElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractMachineElement"


    // $ANTLR start "entryRuleAbstractStateElement"
    // InternalStateMachine.g:169:1: entryRuleAbstractStateElement : ruleAbstractStateElement EOF ;
    public final void entryRuleAbstractStateElement() throws RecognitionException {
        try {
            // InternalStateMachine.g:170:1: ( ruleAbstractStateElement EOF )
            // InternalStateMachine.g:171:1: ruleAbstractStateElement EOF
            {
             before(grammarAccess.getAbstractStateElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractStateElement();

            state._fsp--;

             after(grammarAccess.getAbstractStateElementRule()); 
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
    // $ANTLR end "entryRuleAbstractStateElement"


    // $ANTLR start "ruleAbstractStateElement"
    // InternalStateMachine.g:178:1: ruleAbstractStateElement : ( ruleState ) ;
    public final void ruleAbstractStateElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:182:2: ( ( ruleState ) )
            // InternalStateMachine.g:183:2: ( ruleState )
            {
            // InternalStateMachine.g:183:2: ( ruleState )
            // InternalStateMachine.g:184:3: ruleState
            {
             before(grammarAccess.getAbstractStateElementAccess().getStateParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleState();

            state._fsp--;

             after(grammarAccess.getAbstractStateElementAccess().getStateParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractStateElement"


    // $ANTLR start "entryRuleState"
    // InternalStateMachine.g:194:1: entryRuleState : ruleState EOF ;
    public final void entryRuleState() throws RecognitionException {
        try {
            // InternalStateMachine.g:195:1: ( ruleState EOF )
            // InternalStateMachine.g:196:1: ruleState EOF
            {
             before(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            ruleState();

            state._fsp--;

             after(grammarAccess.getStateRule()); 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalStateMachine.g:203:1: ruleState : ( ( rule__State__Group__0 ) ) ;
    public final void ruleState() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:207:2: ( ( ( rule__State__Group__0 ) ) )
            // InternalStateMachine.g:208:2: ( ( rule__State__Group__0 ) )
            {
            // InternalStateMachine.g:208:2: ( ( rule__State__Group__0 ) )
            // InternalStateMachine.g:209:3: ( rule__State__Group__0 )
            {
             before(grammarAccess.getStateAccess().getGroup()); 
            // InternalStateMachine.g:210:3: ( rule__State__Group__0 )
            // InternalStateMachine.g:210:4: rule__State__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleStateTransition"
    // InternalStateMachine.g:219:1: entryRuleStateTransition : ruleStateTransition EOF ;
    public final void entryRuleStateTransition() throws RecognitionException {
        try {
            // InternalStateMachine.g:220:1: ( ruleStateTransition EOF )
            // InternalStateMachine.g:221:1: ruleStateTransition EOF
            {
             before(grammarAccess.getStateTransitionRule()); 
            pushFollow(FOLLOW_1);
            ruleStateTransition();

            state._fsp--;

             after(grammarAccess.getStateTransitionRule()); 
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
    // $ANTLR end "entryRuleStateTransition"


    // $ANTLR start "ruleStateTransition"
    // InternalStateMachine.g:228:1: ruleStateTransition : ( ( rule__StateTransition__Group__0 ) ) ;
    public final void ruleStateTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:232:2: ( ( ( rule__StateTransition__Group__0 ) ) )
            // InternalStateMachine.g:233:2: ( ( rule__StateTransition__Group__0 ) )
            {
            // InternalStateMachine.g:233:2: ( ( rule__StateTransition__Group__0 ) )
            // InternalStateMachine.g:234:3: ( rule__StateTransition__Group__0 )
            {
             before(grammarAccess.getStateTransitionAccess().getGroup()); 
            // InternalStateMachine.g:235:3: ( rule__StateTransition__Group__0 )
            // InternalStateMachine.g:235:4: rule__StateTransition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StateTransition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStateTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStateTransition"


    // $ANTLR start "ruleVisibilityType"
    // InternalStateMachine.g:244:1: ruleVisibilityType : ( ( rule__VisibilityType__Alternatives ) ) ;
    public final void ruleVisibilityType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:248:1: ( ( ( rule__VisibilityType__Alternatives ) ) )
            // InternalStateMachine.g:249:2: ( ( rule__VisibilityType__Alternatives ) )
            {
            // InternalStateMachine.g:249:2: ( ( rule__VisibilityType__Alternatives ) )
            // InternalStateMachine.g:250:3: ( rule__VisibilityType__Alternatives )
            {
             before(grammarAccess.getVisibilityTypeAccess().getAlternatives()); 
            // InternalStateMachine.g:251:3: ( rule__VisibilityType__Alternatives )
            // InternalStateMachine.g:251:4: rule__VisibilityType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VisibilityType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVisibilityTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVisibilityType"


    // $ANTLR start "rule__AbstractMachineElement__Alternatives"
    // InternalStateMachine.g:259:1: rule__AbstractMachineElement__Alternatives : ( ( ruleAbstractStateElement ) | ( ruleStateTransition ) );
    public final void rule__AbstractMachineElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:263:1: ( ( ruleAbstractStateElement ) | ( ruleStateTransition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=12)||LA1_0==19) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalStateMachine.g:264:2: ( ruleAbstractStateElement )
                    {
                    // InternalStateMachine.g:264:2: ( ruleAbstractStateElement )
                    // InternalStateMachine.g:265:3: ruleAbstractStateElement
                    {
                     before(grammarAccess.getAbstractMachineElementAccess().getAbstractStateElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractStateElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractMachineElementAccess().getAbstractStateElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:270:2: ( ruleStateTransition )
                    {
                    // InternalStateMachine.g:270:2: ( ruleStateTransition )
                    // InternalStateMachine.g:271:3: ruleStateTransition
                    {
                     before(grammarAccess.getAbstractMachineElementAccess().getStateTransitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleStateTransition();

                    state._fsp--;

                     after(grammarAccess.getAbstractMachineElementAccess().getStateTransitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractMachineElement__Alternatives"


    // $ANTLR start "rule__VisibilityType__Alternatives"
    // InternalStateMachine.g:280:1: rule__VisibilityType__Alternatives : ( ( ( 'public' ) ) | ( ( 'private' ) ) );
    public final void rule__VisibilityType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:284:1: ( ( ( 'public' ) ) | ( ( 'private' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalStateMachine.g:285:2: ( ( 'public' ) )
                    {
                    // InternalStateMachine.g:285:2: ( ( 'public' ) )
                    // InternalStateMachine.g:286:3: ( 'public' )
                    {
                     before(grammarAccess.getVisibilityTypeAccess().getPUBLICEnumLiteralDeclaration_0()); 
                    // InternalStateMachine.g:287:3: ( 'public' )
                    // InternalStateMachine.g:287:4: 'public'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityTypeAccess().getPUBLICEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalStateMachine.g:291:2: ( ( 'private' ) )
                    {
                    // InternalStateMachine.g:291:2: ( ( 'private' ) )
                    // InternalStateMachine.g:292:3: ( 'private' )
                    {
                     before(grammarAccess.getVisibilityTypeAccess().getPRIVATEEnumLiteralDeclaration_1()); 
                    // InternalStateMachine.g:293:3: ( 'private' )
                    // InternalStateMachine.g:293:4: 'private'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getVisibilityTypeAccess().getPRIVATEEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__VisibilityType__Alternatives"


    // $ANTLR start "rule__StateMachine__Group__0"
    // InternalStateMachine.g:301:1: rule__StateMachine__Group__0 : rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 ;
    public final void rule__StateMachine__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:305:1: ( rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1 )
            // InternalStateMachine.g:306:2: rule__StateMachine__Group__0__Impl rule__StateMachine__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__StateMachine__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0"


    // $ANTLR start "rule__StateMachine__Group__0__Impl"
    // InternalStateMachine.g:313:1: rule__StateMachine__Group__0__Impl : ( 'StateMachine' ) ;
    public final void rule__StateMachine__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:317:1: ( ( 'StateMachine' ) )
            // InternalStateMachine.g:318:1: ( 'StateMachine' )
            {
            // InternalStateMachine.g:318:1: ( 'StateMachine' )
            // InternalStateMachine.g:319:2: 'StateMachine'
            {
             before(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getStateMachineKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__0__Impl"


    // $ANTLR start "rule__StateMachine__Group__1"
    // InternalStateMachine.g:328:1: rule__StateMachine__Group__1 : rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 ;
    public final void rule__StateMachine__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:332:1: ( rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2 )
            // InternalStateMachine.g:333:2: rule__StateMachine__Group__1__Impl rule__StateMachine__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__StateMachine__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1"


    // $ANTLR start "rule__StateMachine__Group__1__Impl"
    // InternalStateMachine.g:340:1: rule__StateMachine__Group__1__Impl : ( ( rule__StateMachine__NameAssignment_1 ) ) ;
    public final void rule__StateMachine__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:344:1: ( ( ( rule__StateMachine__NameAssignment_1 ) ) )
            // InternalStateMachine.g:345:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            {
            // InternalStateMachine.g:345:1: ( ( rule__StateMachine__NameAssignment_1 ) )
            // InternalStateMachine.g:346:2: ( rule__StateMachine__NameAssignment_1 )
            {
             before(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 
            // InternalStateMachine.g:347:2: ( rule__StateMachine__NameAssignment_1 )
            // InternalStateMachine.g:347:3: rule__StateMachine__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateMachineAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__1__Impl"


    // $ANTLR start "rule__StateMachine__Group__2"
    // InternalStateMachine.g:355:1: rule__StateMachine__Group__2 : rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 ;
    public final void rule__StateMachine__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:359:1: ( rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3 )
            // InternalStateMachine.g:360:2: rule__StateMachine__Group__2__Impl rule__StateMachine__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2"


    // $ANTLR start "rule__StateMachine__Group__2__Impl"
    // InternalStateMachine.g:367:1: rule__StateMachine__Group__2__Impl : ( '{' ) ;
    public final void rule__StateMachine__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:371:1: ( ( '{' ) )
            // InternalStateMachine.g:372:1: ( '{' )
            {
            // InternalStateMachine.g:372:1: ( '{' )
            // InternalStateMachine.g:373:2: '{'
            {
             before(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__2__Impl"


    // $ANTLR start "rule__StateMachine__Group__3"
    // InternalStateMachine.g:382:1: rule__StateMachine__Group__3 : rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 ;
    public final void rule__StateMachine__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:386:1: ( rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4 )
            // InternalStateMachine.g:387:2: rule__StateMachine__Group__3__Impl rule__StateMachine__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__StateMachine__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3"


    // $ANTLR start "rule__StateMachine__Group__3__Impl"
    // InternalStateMachine.g:394:1: rule__StateMachine__Group__3__Impl : ( ( rule__StateMachine__ElementsAssignment_3 )* ) ;
    public final void rule__StateMachine__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:398:1: ( ( ( rule__StateMachine__ElementsAssignment_3 )* ) )
            // InternalStateMachine.g:399:1: ( ( rule__StateMachine__ElementsAssignment_3 )* )
            {
            // InternalStateMachine.g:399:1: ( ( rule__StateMachine__ElementsAssignment_3 )* )
            // InternalStateMachine.g:400:2: ( rule__StateMachine__ElementsAssignment_3 )*
            {
             before(grammarAccess.getStateMachineAccess().getElementsAssignment_3()); 
            // InternalStateMachine.g:401:2: ( rule__StateMachine__ElementsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=11 && LA3_0<=12)||LA3_0==17||LA3_0==19) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalStateMachine.g:401:3: rule__StateMachine__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__StateMachine__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStateMachineAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__3__Impl"


    // $ANTLR start "rule__StateMachine__Group__4"
    // InternalStateMachine.g:409:1: rule__StateMachine__Group__4 : rule__StateMachine__Group__4__Impl ;
    public final void rule__StateMachine__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:413:1: ( rule__StateMachine__Group__4__Impl )
            // InternalStateMachine.g:414:2: rule__StateMachine__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateMachine__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4"


    // $ANTLR start "rule__StateMachine__Group__4__Impl"
    // InternalStateMachine.g:420:1: rule__StateMachine__Group__4__Impl : ( '}' ) ;
    public final void rule__StateMachine__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:424:1: ( ( '}' ) )
            // InternalStateMachine.g:425:1: ( '}' )
            {
            // InternalStateMachine.g:425:1: ( '}' )
            // InternalStateMachine.g:426:2: '}'
            {
             before(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__Group__4__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalStateMachine.g:436:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:440:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalStateMachine.g:441:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalStateMachine.g:448:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:452:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:453:1: ( RULE_ID )
            {
            // InternalStateMachine.g:453:1: ( RULE_ID )
            // InternalStateMachine.g:454:2: RULE_ID
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
    // InternalStateMachine.g:463:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:467:1: ( rule__FQN__Group__1__Impl )
            // InternalStateMachine.g:468:2: rule__FQN__Group__1__Impl
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
    // InternalStateMachine.g:474:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:478:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalStateMachine.g:479:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalStateMachine.g:479:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalStateMachine.g:480:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalStateMachine.g:481:2: ( rule__FQN__Group_1__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalStateMachine.g:481:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
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
    // InternalStateMachine.g:490:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:494:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalStateMachine.g:495:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalStateMachine.g:502:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:506:1: ( ( '.' ) )
            // InternalStateMachine.g:507:1: ( '.' )
            {
            // InternalStateMachine.g:507:1: ( '.' )
            // InternalStateMachine.g:508:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalStateMachine.g:517:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:521:1: ( rule__FQN__Group_1__1__Impl )
            // InternalStateMachine.g:522:2: rule__FQN__Group_1__1__Impl
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
    // InternalStateMachine.g:528:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:532:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:533:1: ( RULE_ID )
            {
            // InternalStateMachine.g:533:1: ( RULE_ID )
            // InternalStateMachine.g:534:2: RULE_ID
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


    // $ANTLR start "rule__State__Group__0"
    // InternalStateMachine.g:544:1: rule__State__Group__0 : rule__State__Group__0__Impl rule__State__Group__1 ;
    public final void rule__State__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:548:1: ( rule__State__Group__0__Impl rule__State__Group__1 )
            // InternalStateMachine.g:549:2: rule__State__Group__0__Impl rule__State__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__State__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0"


    // $ANTLR start "rule__State__Group__0__Impl"
    // InternalStateMachine.g:556:1: rule__State__Group__0__Impl : ( 'State' ) ;
    public final void rule__State__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:560:1: ( ( 'State' ) )
            // InternalStateMachine.g:561:1: ( 'State' )
            {
            // InternalStateMachine.g:561:1: ( 'State' )
            // InternalStateMachine.g:562:2: 'State'
            {
             before(grammarAccess.getStateAccess().getStateKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getStateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__0__Impl"


    // $ANTLR start "rule__State__Group__1"
    // InternalStateMachine.g:571:1: rule__State__Group__1 : rule__State__Group__1__Impl rule__State__Group__2 ;
    public final void rule__State__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:575:1: ( rule__State__Group__1__Impl rule__State__Group__2 )
            // InternalStateMachine.g:576:2: rule__State__Group__1__Impl rule__State__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__State__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__State__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1"


    // $ANTLR start "rule__State__Group__1__Impl"
    // InternalStateMachine.g:583:1: rule__State__Group__1__Impl : ( ( rule__State__NameAssignment_1 ) ) ;
    public final void rule__State__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:587:1: ( ( ( rule__State__NameAssignment_1 ) ) )
            // InternalStateMachine.g:588:1: ( ( rule__State__NameAssignment_1 ) )
            {
            // InternalStateMachine.g:588:1: ( ( rule__State__NameAssignment_1 ) )
            // InternalStateMachine.g:589:2: ( rule__State__NameAssignment_1 )
            {
             before(grammarAccess.getStateAccess().getNameAssignment_1()); 
            // InternalStateMachine.g:590:2: ( rule__State__NameAssignment_1 )
            // InternalStateMachine.g:590:3: rule__State__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__State__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStateAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__1__Impl"


    // $ANTLR start "rule__State__Group__2"
    // InternalStateMachine.g:598:1: rule__State__Group__2 : rule__State__Group__2__Impl ;
    public final void rule__State__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:602:1: ( rule__State__Group__2__Impl )
            // InternalStateMachine.g:603:2: rule__State__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__State__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2"


    // $ANTLR start "rule__State__Group__2__Impl"
    // InternalStateMachine.g:609:1: rule__State__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__State__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:613:1: ( ( ( ';' )? ) )
            // InternalStateMachine.g:614:1: ( ( ';' )? )
            {
            // InternalStateMachine.g:614:1: ( ( ';' )? )
            // InternalStateMachine.g:615:2: ( ';' )?
            {
             before(grammarAccess.getStateAccess().getSemicolonKeyword_2()); 
            // InternalStateMachine.g:616:2: ( ';' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalStateMachine.g:616:3: ';'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStateAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__Group__2__Impl"


    // $ANTLR start "rule__StateTransition__Group__0"
    // InternalStateMachine.g:625:1: rule__StateTransition__Group__0 : rule__StateTransition__Group__0__Impl rule__StateTransition__Group__1 ;
    public final void rule__StateTransition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:629:1: ( rule__StateTransition__Group__0__Impl rule__StateTransition__Group__1 )
            // InternalStateMachine.g:630:2: rule__StateTransition__Group__0__Impl rule__StateTransition__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__StateTransition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateTransition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__0"


    // $ANTLR start "rule__StateTransition__Group__0__Impl"
    // InternalStateMachine.g:637:1: rule__StateTransition__Group__0__Impl : ( ( rule__StateTransition__VisibilityAssignment_0 )? ) ;
    public final void rule__StateTransition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:641:1: ( ( ( rule__StateTransition__VisibilityAssignment_0 )? ) )
            // InternalStateMachine.g:642:1: ( ( rule__StateTransition__VisibilityAssignment_0 )? )
            {
            // InternalStateMachine.g:642:1: ( ( rule__StateTransition__VisibilityAssignment_0 )? )
            // InternalStateMachine.g:643:2: ( rule__StateTransition__VisibilityAssignment_0 )?
            {
             before(grammarAccess.getStateTransitionAccess().getVisibilityAssignment_0()); 
            // InternalStateMachine.g:644:2: ( rule__StateTransition__VisibilityAssignment_0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=11 && LA6_0<=12)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalStateMachine.g:644:3: rule__StateTransition__VisibilityAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StateTransition__VisibilityAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStateTransitionAccess().getVisibilityAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__0__Impl"


    // $ANTLR start "rule__StateTransition__Group__1"
    // InternalStateMachine.g:652:1: rule__StateTransition__Group__1 : rule__StateTransition__Group__1__Impl rule__StateTransition__Group__2 ;
    public final void rule__StateTransition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:656:1: ( rule__StateTransition__Group__1__Impl rule__StateTransition__Group__2 )
            // InternalStateMachine.g:657:2: rule__StateTransition__Group__1__Impl rule__StateTransition__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__StateTransition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateTransition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__1"


    // $ANTLR start "rule__StateTransition__Group__1__Impl"
    // InternalStateMachine.g:664:1: rule__StateTransition__Group__1__Impl : ( 'StateTransition' ) ;
    public final void rule__StateTransition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:668:1: ( ( 'StateTransition' ) )
            // InternalStateMachine.g:669:1: ( 'StateTransition' )
            {
            // InternalStateMachine.g:669:1: ( 'StateTransition' )
            // InternalStateMachine.g:670:2: 'StateTransition'
            {
             before(grammarAccess.getStateTransitionAccess().getStateTransitionKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getStateTransitionAccess().getStateTransitionKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__1__Impl"


    // $ANTLR start "rule__StateTransition__Group__2"
    // InternalStateMachine.g:679:1: rule__StateTransition__Group__2 : rule__StateTransition__Group__2__Impl rule__StateTransition__Group__3 ;
    public final void rule__StateTransition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:683:1: ( rule__StateTransition__Group__2__Impl rule__StateTransition__Group__3 )
            // InternalStateMachine.g:684:2: rule__StateTransition__Group__2__Impl rule__StateTransition__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__StateTransition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateTransition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__2"


    // $ANTLR start "rule__StateTransition__Group__2__Impl"
    // InternalStateMachine.g:691:1: rule__StateTransition__Group__2__Impl : ( ( rule__StateTransition__FromAssignment_2 ) ) ;
    public final void rule__StateTransition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:695:1: ( ( ( rule__StateTransition__FromAssignment_2 ) ) )
            // InternalStateMachine.g:696:1: ( ( rule__StateTransition__FromAssignment_2 ) )
            {
            // InternalStateMachine.g:696:1: ( ( rule__StateTransition__FromAssignment_2 ) )
            // InternalStateMachine.g:697:2: ( rule__StateTransition__FromAssignment_2 )
            {
             before(grammarAccess.getStateTransitionAccess().getFromAssignment_2()); 
            // InternalStateMachine.g:698:2: ( rule__StateTransition__FromAssignment_2 )
            // InternalStateMachine.g:698:3: rule__StateTransition__FromAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StateTransition__FromAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStateTransitionAccess().getFromAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__2__Impl"


    // $ANTLR start "rule__StateTransition__Group__3"
    // InternalStateMachine.g:706:1: rule__StateTransition__Group__3 : rule__StateTransition__Group__3__Impl rule__StateTransition__Group__4 ;
    public final void rule__StateTransition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:710:1: ( rule__StateTransition__Group__3__Impl rule__StateTransition__Group__4 )
            // InternalStateMachine.g:711:2: rule__StateTransition__Group__3__Impl rule__StateTransition__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__StateTransition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateTransition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__3"


    // $ANTLR start "rule__StateTransition__Group__3__Impl"
    // InternalStateMachine.g:718:1: rule__StateTransition__Group__3__Impl : ( '->' ) ;
    public final void rule__StateTransition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:722:1: ( ( '->' ) )
            // InternalStateMachine.g:723:1: ( '->' )
            {
            // InternalStateMachine.g:723:1: ( '->' )
            // InternalStateMachine.g:724:2: '->'
            {
             before(grammarAccess.getStateTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getStateTransitionAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__3__Impl"


    // $ANTLR start "rule__StateTransition__Group__4"
    // InternalStateMachine.g:733:1: rule__StateTransition__Group__4 : rule__StateTransition__Group__4__Impl rule__StateTransition__Group__5 ;
    public final void rule__StateTransition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:737:1: ( rule__StateTransition__Group__4__Impl rule__StateTransition__Group__5 )
            // InternalStateMachine.g:738:2: rule__StateTransition__Group__4__Impl rule__StateTransition__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__StateTransition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StateTransition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__4"


    // $ANTLR start "rule__StateTransition__Group__4__Impl"
    // InternalStateMachine.g:745:1: rule__StateTransition__Group__4__Impl : ( ( rule__StateTransition__ToAssignment_4 ) ) ;
    public final void rule__StateTransition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:749:1: ( ( ( rule__StateTransition__ToAssignment_4 ) ) )
            // InternalStateMachine.g:750:1: ( ( rule__StateTransition__ToAssignment_4 ) )
            {
            // InternalStateMachine.g:750:1: ( ( rule__StateTransition__ToAssignment_4 ) )
            // InternalStateMachine.g:751:2: ( rule__StateTransition__ToAssignment_4 )
            {
             before(grammarAccess.getStateTransitionAccess().getToAssignment_4()); 
            // InternalStateMachine.g:752:2: ( rule__StateTransition__ToAssignment_4 )
            // InternalStateMachine.g:752:3: rule__StateTransition__ToAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StateTransition__ToAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStateTransitionAccess().getToAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__4__Impl"


    // $ANTLR start "rule__StateTransition__Group__5"
    // InternalStateMachine.g:760:1: rule__StateTransition__Group__5 : rule__StateTransition__Group__5__Impl ;
    public final void rule__StateTransition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:764:1: ( rule__StateTransition__Group__5__Impl )
            // InternalStateMachine.g:765:2: rule__StateTransition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StateTransition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__5"


    // $ANTLR start "rule__StateTransition__Group__5__Impl"
    // InternalStateMachine.g:771:1: rule__StateTransition__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__StateTransition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:775:1: ( ( ( ';' )? ) )
            // InternalStateMachine.g:776:1: ( ( ';' )? )
            {
            // InternalStateMachine.g:776:1: ( ( ';' )? )
            // InternalStateMachine.g:777:2: ( ';' )?
            {
             before(grammarAccess.getStateTransitionAccess().getSemicolonKeyword_5()); 
            // InternalStateMachine.g:778:2: ( ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalStateMachine.g:778:3: ';'
                    {
                    match(input,18,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getStateTransitionAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__Group__5__Impl"


    // $ANTLR start "rule__StateMachine__NameAssignment_1"
    // InternalStateMachine.g:787:1: rule__StateMachine__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__StateMachine__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:791:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:792:2: ( RULE_ID )
            {
            // InternalStateMachine.g:792:2: ( RULE_ID )
            // InternalStateMachine.g:793:3: RULE_ID
            {
             before(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateMachineAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__NameAssignment_1"


    // $ANTLR start "rule__StateMachine__ElementsAssignment_3"
    // InternalStateMachine.g:802:1: rule__StateMachine__ElementsAssignment_3 : ( ruleAbstractMachineElement ) ;
    public final void rule__StateMachine__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:806:1: ( ( ruleAbstractMachineElement ) )
            // InternalStateMachine.g:807:2: ( ruleAbstractMachineElement )
            {
            // InternalStateMachine.g:807:2: ( ruleAbstractMachineElement )
            // InternalStateMachine.g:808:3: ruleAbstractMachineElement
            {
             before(grammarAccess.getStateMachineAccess().getElementsAbstractMachineElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractMachineElement();

            state._fsp--;

             after(grammarAccess.getStateMachineAccess().getElementsAbstractMachineElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateMachine__ElementsAssignment_3"


    // $ANTLR start "rule__State__NameAssignment_1"
    // InternalStateMachine.g:817:1: rule__State__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__State__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:821:1: ( ( RULE_ID ) )
            // InternalStateMachine.g:822:2: ( RULE_ID )
            {
            // InternalStateMachine.g:822:2: ( RULE_ID )
            // InternalStateMachine.g:823:3: RULE_ID
            {
             before(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getStateAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__State__NameAssignment_1"


    // $ANTLR start "rule__StateTransition__VisibilityAssignment_0"
    // InternalStateMachine.g:832:1: rule__StateTransition__VisibilityAssignment_0 : ( ruleVisibilityType ) ;
    public final void rule__StateTransition__VisibilityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:836:1: ( ( ruleVisibilityType ) )
            // InternalStateMachine.g:837:2: ( ruleVisibilityType )
            {
            // InternalStateMachine.g:837:2: ( ruleVisibilityType )
            // InternalStateMachine.g:838:3: ruleVisibilityType
            {
             before(grammarAccess.getStateTransitionAccess().getVisibilityVisibilityTypeEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleVisibilityType();

            state._fsp--;

             after(grammarAccess.getStateTransitionAccess().getVisibilityVisibilityTypeEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__VisibilityAssignment_0"


    // $ANTLR start "rule__StateTransition__FromAssignment_2"
    // InternalStateMachine.g:847:1: rule__StateTransition__FromAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__StateTransition__FromAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:851:1: ( ( ( ruleFQN ) ) )
            // InternalStateMachine.g:852:2: ( ( ruleFQN ) )
            {
            // InternalStateMachine.g:852:2: ( ( ruleFQN ) )
            // InternalStateMachine.g:853:3: ( ruleFQN )
            {
             before(grammarAccess.getStateTransitionAccess().getFromAbstractStateElementCrossReference_2_0()); 
            // InternalStateMachine.g:854:3: ( ruleFQN )
            // InternalStateMachine.g:855:4: ruleFQN
            {
             before(grammarAccess.getStateTransitionAccess().getFromAbstractStateElementFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getStateTransitionAccess().getFromAbstractStateElementFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getStateTransitionAccess().getFromAbstractStateElementCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__FromAssignment_2"


    // $ANTLR start "rule__StateTransition__ToAssignment_4"
    // InternalStateMachine.g:866:1: rule__StateTransition__ToAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__StateTransition__ToAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalStateMachine.g:870:1: ( ( ( ruleFQN ) ) )
            // InternalStateMachine.g:871:2: ( ( ruleFQN ) )
            {
            // InternalStateMachine.g:871:2: ( ( ruleFQN ) )
            // InternalStateMachine.g:872:3: ( ruleFQN )
            {
             before(grammarAccess.getStateTransitionAccess().getToAbstractStateElementCrossReference_4_0()); 
            // InternalStateMachine.g:873:3: ( ruleFQN )
            // InternalStateMachine.g:874:4: ruleFQN
            {
             before(grammarAccess.getStateTransitionAccess().getToAbstractStateElementFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getStateTransitionAccess().getToAbstractStateElementFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getStateTransitionAccess().getToAbstractStateElementCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StateTransition__ToAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000A9800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A1802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000A1800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});

}