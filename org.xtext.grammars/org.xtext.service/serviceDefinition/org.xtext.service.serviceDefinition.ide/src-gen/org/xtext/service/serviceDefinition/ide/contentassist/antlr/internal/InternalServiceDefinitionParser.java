package org.xtext.service.serviceDefinition.ide.contentassist.antlr.internal;

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
import org.xtext.service.serviceDefinition.services.ServiceDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalServiceDefinitionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'.*'", "'-'", "'ServiceDefRepository'", "'{'", "'}'", "'version'", "'#import'", "';'", "'ForkingServiceDefinition'", "'purposeDescription'", "'JoiningServiceDefinition'", "'RequestAnswerServiceDefinition'", "'CoordinationServiceDefinition'", "'CommunicationServiceUsage'", "'uses'", "'StatePattern'", "'<'", "'lifecycle'", "'>'", "'with'", "'ParameterPattern'", "'DynamicWiringPattern'", "'MonitoringPattern'", "'PushPattern'", "'DataType'", "'='", "'EventPattern'", "'EventType'", "'ActivationType'", "'EventStateType'", "'QueryPattern'", "'RequestType'", "'AnswerType'", "'SendPattern'", "'ServiceProperty'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalServiceDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalServiceDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalServiceDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalServiceDefinition.g"; }


    	private ServiceDefinitionGrammarAccess grammarAccess;

    	public void setGrammarAccess(ServiceDefinitionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleServiceDefModel"
    // InternalServiceDefinition.g:94:1: entryRuleServiceDefModel : ruleServiceDefModel EOF ;
    public final void entryRuleServiceDefModel() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:95:1: ( ruleServiceDefModel EOF )
            // InternalServiceDefinition.g:96:1: ruleServiceDefModel EOF
            {
             before(grammarAccess.getServiceDefModelRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceDefModel();

            state._fsp--;

             after(grammarAccess.getServiceDefModelRule()); 
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
    // $ANTLR end "entryRuleServiceDefModel"


    // $ANTLR start "ruleServiceDefModel"
    // InternalServiceDefinition.g:103:1: ruleServiceDefModel : ( ( rule__ServiceDefModel__Group__0 ) ) ;
    public final void ruleServiceDefModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:107:2: ( ( ( rule__ServiceDefModel__Group__0 ) ) )
            // InternalServiceDefinition.g:108:2: ( ( rule__ServiceDefModel__Group__0 ) )
            {
            // InternalServiceDefinition.g:108:2: ( ( rule__ServiceDefModel__Group__0 ) )
            // InternalServiceDefinition.g:109:3: ( rule__ServiceDefModel__Group__0 )
            {
             before(grammarAccess.getServiceDefModelAccess().getGroup()); 
            // InternalServiceDefinition.g:110:3: ( rule__ServiceDefModel__Group__0 )
            // InternalServiceDefinition.g:110:4: rule__ServiceDefModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceDefModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceDefModel"


    // $ANTLR start "entryRuleFQN"
    // InternalServiceDefinition.g:119:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:120:1: ( ruleFQN EOF )
            // InternalServiceDefinition.g:121:1: ruleFQN EOF
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
    // InternalServiceDefinition.g:128:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:132:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalServiceDefinition.g:133:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalServiceDefinition.g:133:2: ( ( rule__FQN__Group__0 ) )
            // InternalServiceDefinition.g:134:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalServiceDefinition.g:135:3: ( rule__FQN__Group__0 )
            // InternalServiceDefinition.g:135:4: rule__FQN__Group__0
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


    // $ANTLR start "entryRuleFQNW"
    // InternalServiceDefinition.g:144:1: entryRuleFQNW : ruleFQNW EOF ;
    public final void entryRuleFQNW() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:145:1: ( ruleFQNW EOF )
            // InternalServiceDefinition.g:146:1: ruleFQNW EOF
            {
             before(grammarAccess.getFQNWRule()); 
            pushFollow(FOLLOW_1);
            ruleFQNW();

            state._fsp--;

             after(grammarAccess.getFQNWRule()); 
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
    // $ANTLR end "entryRuleFQNW"


    // $ANTLR start "ruleFQNW"
    // InternalServiceDefinition.g:153:1: ruleFQNW : ( ( rule__FQNW__Group__0 ) ) ;
    public final void ruleFQNW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:157:2: ( ( ( rule__FQNW__Group__0 ) ) )
            // InternalServiceDefinition.g:158:2: ( ( rule__FQNW__Group__0 ) )
            {
            // InternalServiceDefinition.g:158:2: ( ( rule__FQNW__Group__0 ) )
            // InternalServiceDefinition.g:159:3: ( rule__FQNW__Group__0 )
            {
             before(grammarAccess.getFQNWAccess().getGroup()); 
            // InternalServiceDefinition.g:160:3: ( rule__FQNW__Group__0 )
            // InternalServiceDefinition.g:160:4: rule__FQNW__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQNW__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNWAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQNW"


    // $ANTLR start "entryRuleEInt"
    // InternalServiceDefinition.g:169:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:170:1: ( ruleEInt EOF )
            // InternalServiceDefinition.g:171:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalServiceDefinition.g:178:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:182:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalServiceDefinition.g:183:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalServiceDefinition.g:183:2: ( ( rule__EInt__Group__0 ) )
            // InternalServiceDefinition.g:184:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalServiceDefinition.g:185:3: ( rule__EInt__Group__0 )
            // InternalServiceDefinition.g:185:4: rule__EInt__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalServiceDefinition.g:194:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:195:1: ( ruleEString EOF )
            // InternalServiceDefinition.g:196:1: ruleEString EOF
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
    // InternalServiceDefinition.g:203:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:207:2: ( ( RULE_STRING ) )
            // InternalServiceDefinition.g:208:2: ( RULE_STRING )
            {
            // InternalServiceDefinition.g:208:2: ( RULE_STRING )
            // InternalServiceDefinition.g:209:3: RULE_STRING
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


    // $ANTLR start "entryRuleServiceDefRepository"
    // InternalServiceDefinition.g:219:1: entryRuleServiceDefRepository : ruleServiceDefRepository EOF ;
    public final void entryRuleServiceDefRepository() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:220:1: ( ruleServiceDefRepository EOF )
            // InternalServiceDefinition.g:221:1: ruleServiceDefRepository EOF
            {
             before(grammarAccess.getServiceDefRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceDefRepository();

            state._fsp--;

             after(grammarAccess.getServiceDefRepositoryRule()); 
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
    // $ANTLR end "entryRuleServiceDefRepository"


    // $ANTLR start "ruleServiceDefRepository"
    // InternalServiceDefinition.g:228:1: ruleServiceDefRepository : ( ( rule__ServiceDefRepository__Group__0 ) ) ;
    public final void ruleServiceDefRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:232:2: ( ( ( rule__ServiceDefRepository__Group__0 ) ) )
            // InternalServiceDefinition.g:233:2: ( ( rule__ServiceDefRepository__Group__0 ) )
            {
            // InternalServiceDefinition.g:233:2: ( ( rule__ServiceDefRepository__Group__0 ) )
            // InternalServiceDefinition.g:234:3: ( rule__ServiceDefRepository__Group__0 )
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getGroup()); 
            // InternalServiceDefinition.g:235:3: ( rule__ServiceDefRepository__Group__0 )
            // InternalServiceDefinition.g:235:4: rule__ServiceDefRepository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceDefRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceDefRepository"


    // $ANTLR start "entryRuleServiceRepoVersion"
    // InternalServiceDefinition.g:244:1: entryRuleServiceRepoVersion : ruleServiceRepoVersion EOF ;
    public final void entryRuleServiceRepoVersion() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:245:1: ( ruleServiceRepoVersion EOF )
            // InternalServiceDefinition.g:246:1: ruleServiceRepoVersion EOF
            {
             before(grammarAccess.getServiceRepoVersionRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceRepoVersion();

            state._fsp--;

             after(grammarAccess.getServiceRepoVersionRule()); 
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
    // $ANTLR end "entryRuleServiceRepoVersion"


    // $ANTLR start "ruleServiceRepoVersion"
    // InternalServiceDefinition.g:253:1: ruleServiceRepoVersion : ( ( rule__ServiceRepoVersion__Group__0 ) ) ;
    public final void ruleServiceRepoVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:257:2: ( ( ( rule__ServiceRepoVersion__Group__0 ) ) )
            // InternalServiceDefinition.g:258:2: ( ( rule__ServiceRepoVersion__Group__0 ) )
            {
            // InternalServiceDefinition.g:258:2: ( ( rule__ServiceRepoVersion__Group__0 ) )
            // InternalServiceDefinition.g:259:3: ( rule__ServiceRepoVersion__Group__0 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getGroup()); 
            // InternalServiceDefinition.g:260:3: ( rule__ServiceRepoVersion__Group__0 )
            // InternalServiceDefinition.g:260:4: rule__ServiceRepoVersion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceRepoVersion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceRepoVersionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceRepoVersion"


    // $ANTLR start "entryRuleCommRepoImport"
    // InternalServiceDefinition.g:269:1: entryRuleCommRepoImport : ruleCommRepoImport EOF ;
    public final void entryRuleCommRepoImport() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:270:1: ( ruleCommRepoImport EOF )
            // InternalServiceDefinition.g:271:1: ruleCommRepoImport EOF
            {
             before(grammarAccess.getCommRepoImportRule()); 
            pushFollow(FOLLOW_1);
            ruleCommRepoImport();

            state._fsp--;

             after(grammarAccess.getCommRepoImportRule()); 
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
    // $ANTLR end "entryRuleCommRepoImport"


    // $ANTLR start "ruleCommRepoImport"
    // InternalServiceDefinition.g:278:1: ruleCommRepoImport : ( ( rule__CommRepoImport__Group__0 ) ) ;
    public final void ruleCommRepoImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:282:2: ( ( ( rule__CommRepoImport__Group__0 ) ) )
            // InternalServiceDefinition.g:283:2: ( ( rule__CommRepoImport__Group__0 ) )
            {
            // InternalServiceDefinition.g:283:2: ( ( rule__CommRepoImport__Group__0 ) )
            // InternalServiceDefinition.g:284:3: ( rule__CommRepoImport__Group__0 )
            {
             before(grammarAccess.getCommRepoImportAccess().getGroup()); 
            // InternalServiceDefinition.g:285:3: ( rule__CommRepoImport__Group__0 )
            // InternalServiceDefinition.g:285:4: rule__CommRepoImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommRepoImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommRepoImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommRepoImport"


    // $ANTLR start "entryRuleAbstractServiceDefinition"
    // InternalServiceDefinition.g:294:1: entryRuleAbstractServiceDefinition : ruleAbstractServiceDefinition EOF ;
    public final void entryRuleAbstractServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:295:1: ( ruleAbstractServiceDefinition EOF )
            // InternalServiceDefinition.g:296:1: ruleAbstractServiceDefinition EOF
            {
             before(grammarAccess.getAbstractServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractServiceDefinition();

            state._fsp--;

             after(grammarAccess.getAbstractServiceDefinitionRule()); 
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
    // $ANTLR end "entryRuleAbstractServiceDefinition"


    // $ANTLR start "ruleAbstractServiceDefinition"
    // InternalServiceDefinition.g:303:1: ruleAbstractServiceDefinition : ( ( rule__AbstractServiceDefinition__Alternatives ) ) ;
    public final void ruleAbstractServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:307:2: ( ( ( rule__AbstractServiceDefinition__Alternatives ) ) )
            // InternalServiceDefinition.g:308:2: ( ( rule__AbstractServiceDefinition__Alternatives ) )
            {
            // InternalServiceDefinition.g:308:2: ( ( rule__AbstractServiceDefinition__Alternatives ) )
            // InternalServiceDefinition.g:309:3: ( rule__AbstractServiceDefinition__Alternatives )
            {
             before(grammarAccess.getAbstractServiceDefinitionAccess().getAlternatives()); 
            // InternalServiceDefinition.g:310:3: ( rule__AbstractServiceDefinition__Alternatives )
            // InternalServiceDefinition.g:310:4: rule__AbstractServiceDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractServiceDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractServiceDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractServiceDefinition"


    // $ANTLR start "entryRuleCommunicationServiceDefinition"
    // InternalServiceDefinition.g:319:1: entryRuleCommunicationServiceDefinition : ruleCommunicationServiceDefinition EOF ;
    public final void entryRuleCommunicationServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:320:1: ( ruleCommunicationServiceDefinition EOF )
            // InternalServiceDefinition.g:321:1: ruleCommunicationServiceDefinition EOF
            {
             before(grammarAccess.getCommunicationServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleCommunicationServiceDefinition();

            state._fsp--;

             after(grammarAccess.getCommunicationServiceDefinitionRule()); 
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
    // $ANTLR end "entryRuleCommunicationServiceDefinition"


    // $ANTLR start "ruleCommunicationServiceDefinition"
    // InternalServiceDefinition.g:328:1: ruleCommunicationServiceDefinition : ( ( rule__CommunicationServiceDefinition__Alternatives ) ) ;
    public final void ruleCommunicationServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:332:2: ( ( ( rule__CommunicationServiceDefinition__Alternatives ) ) )
            // InternalServiceDefinition.g:333:2: ( ( rule__CommunicationServiceDefinition__Alternatives ) )
            {
            // InternalServiceDefinition.g:333:2: ( ( rule__CommunicationServiceDefinition__Alternatives ) )
            // InternalServiceDefinition.g:334:3: ( rule__CommunicationServiceDefinition__Alternatives )
            {
             before(grammarAccess.getCommunicationServiceDefinitionAccess().getAlternatives()); 
            // InternalServiceDefinition.g:335:3: ( rule__CommunicationServiceDefinition__Alternatives )
            // InternalServiceDefinition.g:335:4: rule__CommunicationServiceDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationServiceDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationServiceDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommunicationServiceDefinition"


    // $ANTLR start "entryRuleForkingServiceDefinition"
    // InternalServiceDefinition.g:344:1: entryRuleForkingServiceDefinition : ruleForkingServiceDefinition EOF ;
    public final void entryRuleForkingServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:345:1: ( ruleForkingServiceDefinition EOF )
            // InternalServiceDefinition.g:346:1: ruleForkingServiceDefinition EOF
            {
             before(grammarAccess.getForkingServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleForkingServiceDefinition();

            state._fsp--;

             after(grammarAccess.getForkingServiceDefinitionRule()); 
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
    // $ANTLR end "entryRuleForkingServiceDefinition"


    // $ANTLR start "ruleForkingServiceDefinition"
    // InternalServiceDefinition.g:353:1: ruleForkingServiceDefinition : ( ( rule__ForkingServiceDefinition__Group__0 ) ) ;
    public final void ruleForkingServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:357:2: ( ( ( rule__ForkingServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:358:2: ( ( rule__ForkingServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:358:2: ( ( rule__ForkingServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:359:3: ( rule__ForkingServiceDefinition__Group__0 )
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:360:3: ( rule__ForkingServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:360:4: rule__ForkingServiceDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getForkingServiceDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForkingServiceDefinition"


    // $ANTLR start "entryRuleJoyningServiceDefinition"
    // InternalServiceDefinition.g:369:1: entryRuleJoyningServiceDefinition : ruleJoyningServiceDefinition EOF ;
    public final void entryRuleJoyningServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:370:1: ( ruleJoyningServiceDefinition EOF )
            // InternalServiceDefinition.g:371:1: ruleJoyningServiceDefinition EOF
            {
             before(grammarAccess.getJoyningServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleJoyningServiceDefinition();

            state._fsp--;

             after(grammarAccess.getJoyningServiceDefinitionRule()); 
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
    // $ANTLR end "entryRuleJoyningServiceDefinition"


    // $ANTLR start "ruleJoyningServiceDefinition"
    // InternalServiceDefinition.g:378:1: ruleJoyningServiceDefinition : ( ( rule__JoyningServiceDefinition__Group__0 ) ) ;
    public final void ruleJoyningServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:382:2: ( ( ( rule__JoyningServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:383:2: ( ( rule__JoyningServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:383:2: ( ( rule__JoyningServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:384:3: ( rule__JoyningServiceDefinition__Group__0 )
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:385:3: ( rule__JoyningServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:385:4: rule__JoyningServiceDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoyningServiceDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoyningServiceDefinition"


    // $ANTLR start "entryRuleRequestAnswerServiceDefinition"
    // InternalServiceDefinition.g:394:1: entryRuleRequestAnswerServiceDefinition : ruleRequestAnswerServiceDefinition EOF ;
    public final void entryRuleRequestAnswerServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:395:1: ( ruleRequestAnswerServiceDefinition EOF )
            // InternalServiceDefinition.g:396:1: ruleRequestAnswerServiceDefinition EOF
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleRequestAnswerServiceDefinition();

            state._fsp--;

             after(grammarAccess.getRequestAnswerServiceDefinitionRule()); 
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
    // $ANTLR end "entryRuleRequestAnswerServiceDefinition"


    // $ANTLR start "ruleRequestAnswerServiceDefinition"
    // InternalServiceDefinition.g:403:1: ruleRequestAnswerServiceDefinition : ( ( rule__RequestAnswerServiceDefinition__Group__0 ) ) ;
    public final void ruleRequestAnswerServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:407:2: ( ( ( rule__RequestAnswerServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:408:2: ( ( rule__RequestAnswerServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:408:2: ( ( rule__RequestAnswerServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:409:3: ( rule__RequestAnswerServiceDefinition__Group__0 )
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:410:3: ( rule__RequestAnswerServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:410:4: rule__RequestAnswerServiceDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequestAnswerServiceDefinition"


    // $ANTLR start "entryRuleCoordinationServiceDefinition"
    // InternalServiceDefinition.g:419:1: entryRuleCoordinationServiceDefinition : ruleCoordinationServiceDefinition EOF ;
    public final void entryRuleCoordinationServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:420:1: ( ruleCoordinationServiceDefinition EOF )
            // InternalServiceDefinition.g:421:1: ruleCoordinationServiceDefinition EOF
            {
             before(grammarAccess.getCoordinationServiceDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinationServiceDefinition();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionRule()); 
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
    // $ANTLR end "entryRuleCoordinationServiceDefinition"


    // $ANTLR start "ruleCoordinationServiceDefinition"
    // InternalServiceDefinition.g:428:1: ruleCoordinationServiceDefinition : ( ( rule__CoordinationServiceDefinition__Group__0 ) ) ;
    public final void ruleCoordinationServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:432:2: ( ( ( rule__CoordinationServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:433:2: ( ( rule__CoordinationServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:433:2: ( ( rule__CoordinationServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:434:3: ( rule__CoordinationServiceDefinition__Group__0 )
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:435:3: ( rule__CoordinationServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:435:4: rule__CoordinationServiceDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinationServiceDefinition"


    // $ANTLR start "entryRuleCommunicationServiceUsage"
    // InternalServiceDefinition.g:444:1: entryRuleCommunicationServiceUsage : ruleCommunicationServiceUsage EOF ;
    public final void entryRuleCommunicationServiceUsage() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:445:1: ( ruleCommunicationServiceUsage EOF )
            // InternalServiceDefinition.g:446:1: ruleCommunicationServiceUsage EOF
            {
             before(grammarAccess.getCommunicationServiceUsageRule()); 
            pushFollow(FOLLOW_1);
            ruleCommunicationServiceUsage();

            state._fsp--;

             after(grammarAccess.getCommunicationServiceUsageRule()); 
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
    // $ANTLR end "entryRuleCommunicationServiceUsage"


    // $ANTLR start "ruleCommunicationServiceUsage"
    // InternalServiceDefinition.g:453:1: ruleCommunicationServiceUsage : ( ( rule__CommunicationServiceUsage__Group__0 ) ) ;
    public final void ruleCommunicationServiceUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:457:2: ( ( ( rule__CommunicationServiceUsage__Group__0 ) ) )
            // InternalServiceDefinition.g:458:2: ( ( rule__CommunicationServiceUsage__Group__0 ) )
            {
            // InternalServiceDefinition.g:458:2: ( ( rule__CommunicationServiceUsage__Group__0 ) )
            // InternalServiceDefinition.g:459:3: ( rule__CommunicationServiceUsage__Group__0 )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getGroup()); 
            // InternalServiceDefinition.g:460:3: ( rule__CommunicationServiceUsage__Group__0 )
            // InternalServiceDefinition.g:460:4: rule__CommunicationServiceUsage__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsage__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationServiceUsageAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommunicationServiceUsage"


    // $ANTLR start "entryRuleStatePattern"
    // InternalServiceDefinition.g:469:1: entryRuleStatePattern : ruleStatePattern EOF ;
    public final void entryRuleStatePattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:470:1: ( ruleStatePattern EOF )
            // InternalServiceDefinition.g:471:1: ruleStatePattern EOF
            {
             before(grammarAccess.getStatePatternRule()); 
            pushFollow(FOLLOW_1);
            ruleStatePattern();

            state._fsp--;

             after(grammarAccess.getStatePatternRule()); 
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
    // $ANTLR end "entryRuleStatePattern"


    // $ANTLR start "ruleStatePattern"
    // InternalServiceDefinition.g:478:1: ruleStatePattern : ( ( rule__StatePattern__Group__0 ) ) ;
    public final void ruleStatePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:482:2: ( ( ( rule__StatePattern__Group__0 ) ) )
            // InternalServiceDefinition.g:483:2: ( ( rule__StatePattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:483:2: ( ( rule__StatePattern__Group__0 ) )
            // InternalServiceDefinition.g:484:3: ( rule__StatePattern__Group__0 )
            {
             before(grammarAccess.getStatePatternAccess().getGroup()); 
            // InternalServiceDefinition.g:485:3: ( rule__StatePattern__Group__0 )
            // InternalServiceDefinition.g:485:4: rule__StatePattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StatePattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStatePatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatePattern"


    // $ANTLR start "entryRuleParameterPattern"
    // InternalServiceDefinition.g:494:1: entryRuleParameterPattern : ruleParameterPattern EOF ;
    public final void entryRuleParameterPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:495:1: ( ruleParameterPattern EOF )
            // InternalServiceDefinition.g:496:1: ruleParameterPattern EOF
            {
             before(grammarAccess.getParameterPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterPattern();

            state._fsp--;

             after(grammarAccess.getParameterPatternRule()); 
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
    // $ANTLR end "entryRuleParameterPattern"


    // $ANTLR start "ruleParameterPattern"
    // InternalServiceDefinition.g:503:1: ruleParameterPattern : ( ( rule__ParameterPattern__Group__0 ) ) ;
    public final void ruleParameterPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:507:2: ( ( ( rule__ParameterPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:508:2: ( ( rule__ParameterPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:508:2: ( ( rule__ParameterPattern__Group__0 ) )
            // InternalServiceDefinition.g:509:3: ( rule__ParameterPattern__Group__0 )
            {
             before(grammarAccess.getParameterPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:510:3: ( rule__ParameterPattern__Group__0 )
            // InternalServiceDefinition.g:510:4: rule__ParameterPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterPattern"


    // $ANTLR start "entryRuleDynamicWiringPattern"
    // InternalServiceDefinition.g:519:1: entryRuleDynamicWiringPattern : ruleDynamicWiringPattern EOF ;
    public final void entryRuleDynamicWiringPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:520:1: ( ruleDynamicWiringPattern EOF )
            // InternalServiceDefinition.g:521:1: ruleDynamicWiringPattern EOF
            {
             before(grammarAccess.getDynamicWiringPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleDynamicWiringPattern();

            state._fsp--;

             after(grammarAccess.getDynamicWiringPatternRule()); 
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
    // $ANTLR end "entryRuleDynamicWiringPattern"


    // $ANTLR start "ruleDynamicWiringPattern"
    // InternalServiceDefinition.g:528:1: ruleDynamicWiringPattern : ( ( rule__DynamicWiringPattern__Group__0 ) ) ;
    public final void ruleDynamicWiringPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:532:2: ( ( ( rule__DynamicWiringPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:533:2: ( ( rule__DynamicWiringPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:533:2: ( ( rule__DynamicWiringPattern__Group__0 ) )
            // InternalServiceDefinition.g:534:3: ( rule__DynamicWiringPattern__Group__0 )
            {
             before(grammarAccess.getDynamicWiringPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:535:3: ( rule__DynamicWiringPattern__Group__0 )
            // InternalServiceDefinition.g:535:4: rule__DynamicWiringPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DynamicWiringPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDynamicWiringPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDynamicWiringPattern"


    // $ANTLR start "entryRuleMonitoringPattern"
    // InternalServiceDefinition.g:544:1: entryRuleMonitoringPattern : ruleMonitoringPattern EOF ;
    public final void entryRuleMonitoringPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:545:1: ( ruleMonitoringPattern EOF )
            // InternalServiceDefinition.g:546:1: ruleMonitoringPattern EOF
            {
             before(grammarAccess.getMonitoringPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleMonitoringPattern();

            state._fsp--;

             after(grammarAccess.getMonitoringPatternRule()); 
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
    // $ANTLR end "entryRuleMonitoringPattern"


    // $ANTLR start "ruleMonitoringPattern"
    // InternalServiceDefinition.g:553:1: ruleMonitoringPattern : ( ( rule__MonitoringPattern__Group__0 ) ) ;
    public final void ruleMonitoringPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:557:2: ( ( ( rule__MonitoringPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:558:2: ( ( rule__MonitoringPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:558:2: ( ( rule__MonitoringPattern__Group__0 ) )
            // InternalServiceDefinition.g:559:3: ( rule__MonitoringPattern__Group__0 )
            {
             before(grammarAccess.getMonitoringPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:560:3: ( rule__MonitoringPattern__Group__0 )
            // InternalServiceDefinition.g:560:4: rule__MonitoringPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMonitoringPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMonitoringPattern"


    // $ANTLR start "entryRuleForkingPatternInstance"
    // InternalServiceDefinition.g:569:1: entryRuleForkingPatternInstance : ruleForkingPatternInstance EOF ;
    public final void entryRuleForkingPatternInstance() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:570:1: ( ruleForkingPatternInstance EOF )
            // InternalServiceDefinition.g:571:1: ruleForkingPatternInstance EOF
            {
             before(grammarAccess.getForkingPatternInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleForkingPatternInstance();

            state._fsp--;

             after(grammarAccess.getForkingPatternInstanceRule()); 
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
    // $ANTLR end "entryRuleForkingPatternInstance"


    // $ANTLR start "ruleForkingPatternInstance"
    // InternalServiceDefinition.g:578:1: ruleForkingPatternInstance : ( ( rule__ForkingPatternInstance__Alternatives ) ) ;
    public final void ruleForkingPatternInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:582:2: ( ( ( rule__ForkingPatternInstance__Alternatives ) ) )
            // InternalServiceDefinition.g:583:2: ( ( rule__ForkingPatternInstance__Alternatives ) )
            {
            // InternalServiceDefinition.g:583:2: ( ( rule__ForkingPatternInstance__Alternatives ) )
            // InternalServiceDefinition.g:584:3: ( rule__ForkingPatternInstance__Alternatives )
            {
             before(grammarAccess.getForkingPatternInstanceAccess().getAlternatives()); 
            // InternalServiceDefinition.g:585:3: ( rule__ForkingPatternInstance__Alternatives )
            // InternalServiceDefinition.g:585:4: rule__ForkingPatternInstance__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ForkingPatternInstance__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getForkingPatternInstanceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleForkingPatternInstance"


    // $ANTLR start "entryRuleJoiningPatternInstance"
    // InternalServiceDefinition.g:594:1: entryRuleJoiningPatternInstance : ruleJoiningPatternInstance EOF ;
    public final void entryRuleJoiningPatternInstance() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:595:1: ( ruleJoiningPatternInstance EOF )
            // InternalServiceDefinition.g:596:1: ruleJoiningPatternInstance EOF
            {
             before(grammarAccess.getJoiningPatternInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleJoiningPatternInstance();

            state._fsp--;

             after(grammarAccess.getJoiningPatternInstanceRule()); 
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
    // $ANTLR end "entryRuleJoiningPatternInstance"


    // $ANTLR start "ruleJoiningPatternInstance"
    // InternalServiceDefinition.g:603:1: ruleJoiningPatternInstance : ( ruleSendPattern ) ;
    public final void ruleJoiningPatternInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:607:2: ( ( ruleSendPattern ) )
            // InternalServiceDefinition.g:608:2: ( ruleSendPattern )
            {
            // InternalServiceDefinition.g:608:2: ( ruleSendPattern )
            // InternalServiceDefinition.g:609:3: ruleSendPattern
            {
             before(grammarAccess.getJoiningPatternInstanceAccess().getSendPatternParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSendPattern();

            state._fsp--;

             after(grammarAccess.getJoiningPatternInstanceAccess().getSendPatternParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJoiningPatternInstance"


    // $ANTLR start "entryRuleRequestAnswerPattern"
    // InternalServiceDefinition.g:619:1: entryRuleRequestAnswerPattern : ruleRequestAnswerPattern EOF ;
    public final void entryRuleRequestAnswerPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:620:1: ( ruleRequestAnswerPattern EOF )
            // InternalServiceDefinition.g:621:1: ruleRequestAnswerPattern EOF
            {
             before(grammarAccess.getRequestAnswerPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleRequestAnswerPattern();

            state._fsp--;

             after(grammarAccess.getRequestAnswerPatternRule()); 
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
    // $ANTLR end "entryRuleRequestAnswerPattern"


    // $ANTLR start "ruleRequestAnswerPattern"
    // InternalServiceDefinition.g:628:1: ruleRequestAnswerPattern : ( ruleQueryPattern ) ;
    public final void ruleRequestAnswerPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:632:2: ( ( ruleQueryPattern ) )
            // InternalServiceDefinition.g:633:2: ( ruleQueryPattern )
            {
            // InternalServiceDefinition.g:633:2: ( ruleQueryPattern )
            // InternalServiceDefinition.g:634:3: ruleQueryPattern
            {
             before(grammarAccess.getRequestAnswerPatternAccess().getQueryPatternParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleQueryPattern();

            state._fsp--;

             after(grammarAccess.getRequestAnswerPatternAccess().getQueryPatternParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequestAnswerPattern"


    // $ANTLR start "entryRulePushPattern"
    // InternalServiceDefinition.g:644:1: entryRulePushPattern : rulePushPattern EOF ;
    public final void entryRulePushPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:645:1: ( rulePushPattern EOF )
            // InternalServiceDefinition.g:646:1: rulePushPattern EOF
            {
             before(grammarAccess.getPushPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePushPattern();

            state._fsp--;

             after(grammarAccess.getPushPatternRule()); 
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
    // $ANTLR end "entryRulePushPattern"


    // $ANTLR start "rulePushPattern"
    // InternalServiceDefinition.g:653:1: rulePushPattern : ( ( rule__PushPattern__Group__0 ) ) ;
    public final void rulePushPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:657:2: ( ( ( rule__PushPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:658:2: ( ( rule__PushPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:658:2: ( ( rule__PushPattern__Group__0 ) )
            // InternalServiceDefinition.g:659:3: ( rule__PushPattern__Group__0 )
            {
             before(grammarAccess.getPushPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:660:3: ( rule__PushPattern__Group__0 )
            // InternalServiceDefinition.g:660:4: rule__PushPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PushPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPushPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePushPattern"


    // $ANTLR start "entryRuleEventPattern"
    // InternalServiceDefinition.g:669:1: entryRuleEventPattern : ruleEventPattern EOF ;
    public final void entryRuleEventPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:670:1: ( ruleEventPattern EOF )
            // InternalServiceDefinition.g:671:1: ruleEventPattern EOF
            {
             before(grammarAccess.getEventPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleEventPattern();

            state._fsp--;

             after(grammarAccess.getEventPatternRule()); 
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
    // $ANTLR end "entryRuleEventPattern"


    // $ANTLR start "ruleEventPattern"
    // InternalServiceDefinition.g:678:1: ruleEventPattern : ( ( rule__EventPattern__Group__0 ) ) ;
    public final void ruleEventPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:682:2: ( ( ( rule__EventPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:683:2: ( ( rule__EventPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:683:2: ( ( rule__EventPattern__Group__0 ) )
            // InternalServiceDefinition.g:684:3: ( rule__EventPattern__Group__0 )
            {
             before(grammarAccess.getEventPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:685:3: ( rule__EventPattern__Group__0 )
            // InternalServiceDefinition.g:685:4: rule__EventPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventPattern"


    // $ANTLR start "entryRuleQueryPattern"
    // InternalServiceDefinition.g:694:1: entryRuleQueryPattern : ruleQueryPattern EOF ;
    public final void entryRuleQueryPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:695:1: ( ruleQueryPattern EOF )
            // InternalServiceDefinition.g:696:1: ruleQueryPattern EOF
            {
             before(grammarAccess.getQueryPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryPattern();

            state._fsp--;

             after(grammarAccess.getQueryPatternRule()); 
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
    // $ANTLR end "entryRuleQueryPattern"


    // $ANTLR start "ruleQueryPattern"
    // InternalServiceDefinition.g:703:1: ruleQueryPattern : ( ( rule__QueryPattern__Group__0 ) ) ;
    public final void ruleQueryPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:707:2: ( ( ( rule__QueryPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:708:2: ( ( rule__QueryPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:708:2: ( ( rule__QueryPattern__Group__0 ) )
            // InternalServiceDefinition.g:709:3: ( rule__QueryPattern__Group__0 )
            {
             before(grammarAccess.getQueryPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:710:3: ( rule__QueryPattern__Group__0 )
            // InternalServiceDefinition.g:710:4: rule__QueryPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryPattern"


    // $ANTLR start "entryRuleSendPattern"
    // InternalServiceDefinition.g:719:1: entryRuleSendPattern : ruleSendPattern EOF ;
    public final void entryRuleSendPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:720:1: ( ruleSendPattern EOF )
            // InternalServiceDefinition.g:721:1: ruleSendPattern EOF
            {
             before(grammarAccess.getSendPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleSendPattern();

            state._fsp--;

             after(grammarAccess.getSendPatternRule()); 
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
    // $ANTLR end "entryRuleSendPattern"


    // $ANTLR start "ruleSendPattern"
    // InternalServiceDefinition.g:728:1: ruleSendPattern : ( ( rule__SendPattern__Group__0 ) ) ;
    public final void ruleSendPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:732:2: ( ( ( rule__SendPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:733:2: ( ( rule__SendPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:733:2: ( ( rule__SendPattern__Group__0 ) )
            // InternalServiceDefinition.g:734:3: ( rule__SendPattern__Group__0 )
            {
             before(grammarAccess.getSendPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:735:3: ( rule__SendPattern__Group__0 )
            // InternalServiceDefinition.g:735:4: rule__SendPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SendPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSendPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSendPattern"


    // $ANTLR start "entryRuleServiceProperty"
    // InternalServiceDefinition.g:744:1: entryRuleServiceProperty : ruleServiceProperty EOF ;
    public final void entryRuleServiceProperty() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:745:1: ( ruleServiceProperty EOF )
            // InternalServiceDefinition.g:746:1: ruleServiceProperty EOF
            {
             before(grammarAccess.getServicePropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceProperty();

            state._fsp--;

             after(grammarAccess.getServicePropertyRule()); 
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
    // $ANTLR end "entryRuleServiceProperty"


    // $ANTLR start "ruleServiceProperty"
    // InternalServiceDefinition.g:753:1: ruleServiceProperty : ( ( rule__ServiceProperty__Group__0 ) ) ;
    public final void ruleServiceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:757:2: ( ( ( rule__ServiceProperty__Group__0 ) ) )
            // InternalServiceDefinition.g:758:2: ( ( rule__ServiceProperty__Group__0 ) )
            {
            // InternalServiceDefinition.g:758:2: ( ( rule__ServiceProperty__Group__0 ) )
            // InternalServiceDefinition.g:759:3: ( rule__ServiceProperty__Group__0 )
            {
             before(grammarAccess.getServicePropertyAccess().getGroup()); 
            // InternalServiceDefinition.g:760:3: ( rule__ServiceProperty__Group__0 )
            // InternalServiceDefinition.g:760:4: rule__ServiceProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServicePropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceProperty"


    // $ANTLR start "rule__AbstractServiceDefinition__Alternatives"
    // InternalServiceDefinition.g:768:1: rule__AbstractServiceDefinition__Alternatives : ( ( ruleCommunicationServiceDefinition ) | ( ruleCoordinationServiceDefinition ) );
    public final void rule__AbstractServiceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:772:1: ( ( ruleCommunicationServiceDefinition ) | ( ruleCoordinationServiceDefinition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20||(LA1_0>=22 && LA1_0<=23)) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalServiceDefinition.g:773:2: ( ruleCommunicationServiceDefinition )
                    {
                    // InternalServiceDefinition.g:773:2: ( ruleCommunicationServiceDefinition )
                    // InternalServiceDefinition.g:774:3: ruleCommunicationServiceDefinition
                    {
                     before(grammarAccess.getAbstractServiceDefinitionAccess().getCommunicationServiceDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCommunicationServiceDefinition();

                    state._fsp--;

                     after(grammarAccess.getAbstractServiceDefinitionAccess().getCommunicationServiceDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalServiceDefinition.g:779:2: ( ruleCoordinationServiceDefinition )
                    {
                    // InternalServiceDefinition.g:779:2: ( ruleCoordinationServiceDefinition )
                    // InternalServiceDefinition.g:780:3: ruleCoordinationServiceDefinition
                    {
                     before(grammarAccess.getAbstractServiceDefinitionAccess().getCoordinationServiceDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCoordinationServiceDefinition();

                    state._fsp--;

                     after(grammarAccess.getAbstractServiceDefinitionAccess().getCoordinationServiceDefinitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractServiceDefinition__Alternatives"


    // $ANTLR start "rule__CommunicationServiceDefinition__Alternatives"
    // InternalServiceDefinition.g:789:1: rule__CommunicationServiceDefinition__Alternatives : ( ( ruleForkingServiceDefinition ) | ( ruleJoyningServiceDefinition ) | ( ruleRequestAnswerServiceDefinition ) );
    public final void rule__CommunicationServiceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:793:1: ( ( ruleForkingServiceDefinition ) | ( ruleJoyningServiceDefinition ) | ( ruleRequestAnswerServiceDefinition ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
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
                    // InternalServiceDefinition.g:794:2: ( ruleForkingServiceDefinition )
                    {
                    // InternalServiceDefinition.g:794:2: ( ruleForkingServiceDefinition )
                    // InternalServiceDefinition.g:795:3: ruleForkingServiceDefinition
                    {
                     before(grammarAccess.getCommunicationServiceDefinitionAccess().getForkingServiceDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleForkingServiceDefinition();

                    state._fsp--;

                     after(grammarAccess.getCommunicationServiceDefinitionAccess().getForkingServiceDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalServiceDefinition.g:800:2: ( ruleJoyningServiceDefinition )
                    {
                    // InternalServiceDefinition.g:800:2: ( ruleJoyningServiceDefinition )
                    // InternalServiceDefinition.g:801:3: ruleJoyningServiceDefinition
                    {
                     before(grammarAccess.getCommunicationServiceDefinitionAccess().getJoyningServiceDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleJoyningServiceDefinition();

                    state._fsp--;

                     after(grammarAccess.getCommunicationServiceDefinitionAccess().getJoyningServiceDefinitionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalServiceDefinition.g:806:2: ( ruleRequestAnswerServiceDefinition )
                    {
                    // InternalServiceDefinition.g:806:2: ( ruleRequestAnswerServiceDefinition )
                    // InternalServiceDefinition.g:807:3: ruleRequestAnswerServiceDefinition
                    {
                     before(grammarAccess.getCommunicationServiceDefinitionAccess().getRequestAnswerServiceDefinitionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRequestAnswerServiceDefinition();

                    state._fsp--;

                     after(grammarAccess.getCommunicationServiceDefinitionAccess().getRequestAnswerServiceDefinitionParserRuleCall_2()); 

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
    // $ANTLR end "rule__CommunicationServiceDefinition__Alternatives"


    // $ANTLR start "rule__ForkingPatternInstance__Alternatives"
    // InternalServiceDefinition.g:816:1: rule__ForkingPatternInstance__Alternatives : ( ( rulePushPattern ) | ( ruleEventPattern ) );
    public final void rule__ForkingPatternInstance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:820:1: ( ( rulePushPattern ) | ( ruleEventPattern ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==35) ) {
                alt3=1;
            }
            else if ( (LA3_0==38) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalServiceDefinition.g:821:2: ( rulePushPattern )
                    {
                    // InternalServiceDefinition.g:821:2: ( rulePushPattern )
                    // InternalServiceDefinition.g:822:3: rulePushPattern
                    {
                     before(grammarAccess.getForkingPatternInstanceAccess().getPushPatternParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePushPattern();

                    state._fsp--;

                     after(grammarAccess.getForkingPatternInstanceAccess().getPushPatternParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalServiceDefinition.g:827:2: ( ruleEventPattern )
                    {
                    // InternalServiceDefinition.g:827:2: ( ruleEventPattern )
                    // InternalServiceDefinition.g:828:3: ruleEventPattern
                    {
                     before(grammarAccess.getForkingPatternInstanceAccess().getEventPatternParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleEventPattern();

                    state._fsp--;

                     after(grammarAccess.getForkingPatternInstanceAccess().getEventPatternParserRuleCall_1()); 

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
    // $ANTLR end "rule__ForkingPatternInstance__Alternatives"


    // $ANTLR start "rule__ServiceDefModel__Group__0"
    // InternalServiceDefinition.g:837:1: rule__ServiceDefModel__Group__0 : rule__ServiceDefModel__Group__0__Impl rule__ServiceDefModel__Group__1 ;
    public final void rule__ServiceDefModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:841:1: ( rule__ServiceDefModel__Group__0__Impl rule__ServiceDefModel__Group__1 )
            // InternalServiceDefinition.g:842:2: rule__ServiceDefModel__Group__0__Impl rule__ServiceDefModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ServiceDefModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDefModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefModel__Group__0"


    // $ANTLR start "rule__ServiceDefModel__Group__0__Impl"
    // InternalServiceDefinition.g:849:1: rule__ServiceDefModel__Group__0__Impl : ( () ) ;
    public final void rule__ServiceDefModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:853:1: ( ( () ) )
            // InternalServiceDefinition.g:854:1: ( () )
            {
            // InternalServiceDefinition.g:854:1: ( () )
            // InternalServiceDefinition.g:855:2: ()
            {
             before(grammarAccess.getServiceDefModelAccess().getServiceDefModelAction_0()); 
            // InternalServiceDefinition.g:856:2: ()
            // InternalServiceDefinition.g:856:3: 
            {
            }

             after(grammarAccess.getServiceDefModelAccess().getServiceDefModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefModel__Group__0__Impl"


    // $ANTLR start "rule__ServiceDefModel__Group__1"
    // InternalServiceDefinition.g:864:1: rule__ServiceDefModel__Group__1 : rule__ServiceDefModel__Group__1__Impl rule__ServiceDefModel__Group__2 ;
    public final void rule__ServiceDefModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:868:1: ( rule__ServiceDefModel__Group__1__Impl rule__ServiceDefModel__Group__2 )
            // InternalServiceDefinition.g:869:2: rule__ServiceDefModel__Group__1__Impl rule__ServiceDefModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ServiceDefModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDefModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefModel__Group__1"


    // $ANTLR start "rule__ServiceDefModel__Group__1__Impl"
    // InternalServiceDefinition.g:876:1: rule__ServiceDefModel__Group__1__Impl : ( ( rule__ServiceDefModel__ImportsAssignment_1 )* ) ;
    public final void rule__ServiceDefModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:880:1: ( ( ( rule__ServiceDefModel__ImportsAssignment_1 )* ) )
            // InternalServiceDefinition.g:881:1: ( ( rule__ServiceDefModel__ImportsAssignment_1 )* )
            {
            // InternalServiceDefinition.g:881:1: ( ( rule__ServiceDefModel__ImportsAssignment_1 )* )
            // InternalServiceDefinition.g:882:2: ( rule__ServiceDefModel__ImportsAssignment_1 )*
            {
             before(grammarAccess.getServiceDefModelAccess().getImportsAssignment_1()); 
            // InternalServiceDefinition.g:883:2: ( rule__ServiceDefModel__ImportsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalServiceDefinition.g:883:3: rule__ServiceDefModel__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ServiceDefModel__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getServiceDefModelAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefModel__Group__1__Impl"


    // $ANTLR start "rule__ServiceDefModel__Group__2"
    // InternalServiceDefinition.g:891:1: rule__ServiceDefModel__Group__2 : rule__ServiceDefModel__Group__2__Impl ;
    public final void rule__ServiceDefModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:895:1: ( rule__ServiceDefModel__Group__2__Impl )
            // InternalServiceDefinition.g:896:2: rule__ServiceDefModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefModel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefModel__Group__2"


    // $ANTLR start "rule__ServiceDefModel__Group__2__Impl"
    // InternalServiceDefinition.g:902:1: rule__ServiceDefModel__Group__2__Impl : ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? ) ;
    public final void rule__ServiceDefModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:906:1: ( ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? ) )
            // InternalServiceDefinition.g:907:1: ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? )
            {
            // InternalServiceDefinition.g:907:1: ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? )
            // InternalServiceDefinition.g:908:2: ( rule__ServiceDefModel__RepositoryAssignment_2 )?
            {
             before(grammarAccess.getServiceDefModelAccess().getRepositoryAssignment_2()); 
            // InternalServiceDefinition.g:909:2: ( rule__ServiceDefModel__RepositoryAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalServiceDefinition.g:909:3: rule__ServiceDefModel__RepositoryAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceDefModel__RepositoryAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceDefModelAccess().getRepositoryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefModel__Group__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalServiceDefinition.g:918:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:922:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalServiceDefinition.g:923:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalServiceDefinition.g:930:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:934:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:935:1: ( RULE_ID )
            {
            // InternalServiceDefinition.g:935:1: ( RULE_ID )
            // InternalServiceDefinition.g:936:2: RULE_ID
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
    // InternalServiceDefinition.g:945:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:949:1: ( rule__FQN__Group__1__Impl )
            // InternalServiceDefinition.g:950:2: rule__FQN__Group__1__Impl
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
    // InternalServiceDefinition.g:956:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:960:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalServiceDefinition.g:961:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalServiceDefinition.g:961:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalServiceDefinition.g:962:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalServiceDefinition.g:963:2: ( rule__FQN__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalServiceDefinition.g:963:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalServiceDefinition.g:972:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:976:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalServiceDefinition.g:977:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalServiceDefinition.g:984:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:988:1: ( ( '.' ) )
            // InternalServiceDefinition.g:989:1: ( '.' )
            {
            // InternalServiceDefinition.g:989:1: ( '.' )
            // InternalServiceDefinition.g:990:2: '.'
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
    // InternalServiceDefinition.g:999:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1003:1: ( rule__FQN__Group_1__1__Impl )
            // InternalServiceDefinition.g:1004:2: rule__FQN__Group_1__1__Impl
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
    // InternalServiceDefinition.g:1010:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1014:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:1015:1: ( RULE_ID )
            {
            // InternalServiceDefinition.g:1015:1: ( RULE_ID )
            // InternalServiceDefinition.g:1016:2: RULE_ID
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


    // $ANTLR start "rule__FQNW__Group__0"
    // InternalServiceDefinition.g:1026:1: rule__FQNW__Group__0 : rule__FQNW__Group__0__Impl rule__FQNW__Group__1 ;
    public final void rule__FQNW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1030:1: ( rule__FQNW__Group__0__Impl rule__FQNW__Group__1 )
            // InternalServiceDefinition.g:1031:2: rule__FQNW__Group__0__Impl rule__FQNW__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__FQNW__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQNW__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNW__Group__0"


    // $ANTLR start "rule__FQNW__Group__0__Impl"
    // InternalServiceDefinition.g:1038:1: rule__FQNW__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1042:1: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1043:1: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1043:1: ( ruleFQN )
            // InternalServiceDefinition.g:1044:2: ruleFQN
            {
             before(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNWAccess().getFQNParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNW__Group__0__Impl"


    // $ANTLR start "rule__FQNW__Group__1"
    // InternalServiceDefinition.g:1053:1: rule__FQNW__Group__1 : rule__FQNW__Group__1__Impl ;
    public final void rule__FQNW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1057:1: ( rule__FQNW__Group__1__Impl )
            // InternalServiceDefinition.g:1058:2: rule__FQNW__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQNW__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNW__Group__1"


    // $ANTLR start "rule__FQNW__Group__1__Impl"
    // InternalServiceDefinition.g:1064:1: rule__FQNW__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1068:1: ( ( ( '.*' )? ) )
            // InternalServiceDefinition.g:1069:1: ( ( '.*' )? )
            {
            // InternalServiceDefinition.g:1069:1: ( ( '.*' )? )
            // InternalServiceDefinition.g:1070:2: ( '.*' )?
            {
             before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); 
            // InternalServiceDefinition.g:1071:2: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalServiceDefinition.g:1071:3: '.*'
                    {
                    match(input,12,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQNW__Group__1__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // InternalServiceDefinition.g:1080:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1084:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalServiceDefinition.g:1085:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EInt__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // InternalServiceDefinition.g:1092:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1096:1: ( ( ( '-' )? ) )
            // InternalServiceDefinition.g:1097:1: ( ( '-' )? )
            {
            // InternalServiceDefinition.g:1097:1: ( ( '-' )? )
            // InternalServiceDefinition.g:1098:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalServiceDefinition.g:1099:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalServiceDefinition.g:1099:3: '-'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // InternalServiceDefinition.g:1107:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1111:1: ( rule__EInt__Group__1__Impl )
            // InternalServiceDefinition.g:1112:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EInt__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // InternalServiceDefinition.g:1118:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1122:1: ( ( RULE_INT ) )
            // InternalServiceDefinition.g:1123:1: ( RULE_INT )
            {
            // InternalServiceDefinition.g:1123:1: ( RULE_INT )
            // InternalServiceDefinition.g:1124:2: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__ServiceDefRepository__Group__0"
    // InternalServiceDefinition.g:1134:1: rule__ServiceDefRepository__Group__0 : rule__ServiceDefRepository__Group__0__Impl rule__ServiceDefRepository__Group__1 ;
    public final void rule__ServiceDefRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1138:1: ( rule__ServiceDefRepository__Group__0__Impl rule__ServiceDefRepository__Group__1 )
            // InternalServiceDefinition.g:1139:2: rule__ServiceDefRepository__Group__0__Impl rule__ServiceDefRepository__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ServiceDefRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__0"


    // $ANTLR start "rule__ServiceDefRepository__Group__0__Impl"
    // InternalServiceDefinition.g:1146:1: rule__ServiceDefRepository__Group__0__Impl : ( 'ServiceDefRepository' ) ;
    public final void rule__ServiceDefRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1150:1: ( ( 'ServiceDefRepository' ) )
            // InternalServiceDefinition.g:1151:1: ( 'ServiceDefRepository' )
            {
            // InternalServiceDefinition.g:1151:1: ( 'ServiceDefRepository' )
            // InternalServiceDefinition.g:1152:2: 'ServiceDefRepository'
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getServiceDefRepositoryKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getServiceDefRepositoryAccess().getServiceDefRepositoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__0__Impl"


    // $ANTLR start "rule__ServiceDefRepository__Group__1"
    // InternalServiceDefinition.g:1161:1: rule__ServiceDefRepository__Group__1 : rule__ServiceDefRepository__Group__1__Impl rule__ServiceDefRepository__Group__2 ;
    public final void rule__ServiceDefRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1165:1: ( rule__ServiceDefRepository__Group__1__Impl rule__ServiceDefRepository__Group__2 )
            // InternalServiceDefinition.g:1166:2: rule__ServiceDefRepository__Group__1__Impl rule__ServiceDefRepository__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ServiceDefRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__1"


    // $ANTLR start "rule__ServiceDefRepository__Group__1__Impl"
    // InternalServiceDefinition.g:1173:1: rule__ServiceDefRepository__Group__1__Impl : ( ( rule__ServiceDefRepository__NameAssignment_1 ) ) ;
    public final void rule__ServiceDefRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1177:1: ( ( ( rule__ServiceDefRepository__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:1178:1: ( ( rule__ServiceDefRepository__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:1178:1: ( ( rule__ServiceDefRepository__NameAssignment_1 ) )
            // InternalServiceDefinition.g:1179:2: ( rule__ServiceDefRepository__NameAssignment_1 )
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:1180:2: ( rule__ServiceDefRepository__NameAssignment_1 )
            // InternalServiceDefinition.g:1180:3: rule__ServiceDefRepository__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceDefRepositoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__1__Impl"


    // $ANTLR start "rule__ServiceDefRepository__Group__2"
    // InternalServiceDefinition.g:1188:1: rule__ServiceDefRepository__Group__2 : rule__ServiceDefRepository__Group__2__Impl rule__ServiceDefRepository__Group__3 ;
    public final void rule__ServiceDefRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1192:1: ( rule__ServiceDefRepository__Group__2__Impl rule__ServiceDefRepository__Group__3 )
            // InternalServiceDefinition.g:1193:2: rule__ServiceDefRepository__Group__2__Impl rule__ServiceDefRepository__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__ServiceDefRepository__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__2"


    // $ANTLR start "rule__ServiceDefRepository__Group__2__Impl"
    // InternalServiceDefinition.g:1200:1: rule__ServiceDefRepository__Group__2__Impl : ( ( rule__ServiceDefRepository__Group_2__0 )? ) ;
    public final void rule__ServiceDefRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1204:1: ( ( ( rule__ServiceDefRepository__Group_2__0 )? ) )
            // InternalServiceDefinition.g:1205:1: ( ( rule__ServiceDefRepository__Group_2__0 )? )
            {
            // InternalServiceDefinition.g:1205:1: ( ( rule__ServiceDefRepository__Group_2__0 )? )
            // InternalServiceDefinition.g:1206:2: ( rule__ServiceDefRepository__Group_2__0 )?
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getGroup_2()); 
            // InternalServiceDefinition.g:1207:2: ( rule__ServiceDefRepository__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalServiceDefinition.g:1207:3: rule__ServiceDefRepository__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceDefRepository__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceDefRepositoryAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__2__Impl"


    // $ANTLR start "rule__ServiceDefRepository__Group__3"
    // InternalServiceDefinition.g:1215:1: rule__ServiceDefRepository__Group__3 : rule__ServiceDefRepository__Group__3__Impl rule__ServiceDefRepository__Group__4 ;
    public final void rule__ServiceDefRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1219:1: ( rule__ServiceDefRepository__Group__3__Impl rule__ServiceDefRepository__Group__4 )
            // InternalServiceDefinition.g:1220:2: rule__ServiceDefRepository__Group__3__Impl rule__ServiceDefRepository__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__ServiceDefRepository__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__3"


    // $ANTLR start "rule__ServiceDefRepository__Group__3__Impl"
    // InternalServiceDefinition.g:1227:1: rule__ServiceDefRepository__Group__3__Impl : ( '{' ) ;
    public final void rule__ServiceDefRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1231:1: ( ( '{' ) )
            // InternalServiceDefinition.g:1232:1: ( '{' )
            {
            // InternalServiceDefinition.g:1232:1: ( '{' )
            // InternalServiceDefinition.g:1233:2: '{'
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceDefRepositoryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__3__Impl"


    // $ANTLR start "rule__ServiceDefRepository__Group__4"
    // InternalServiceDefinition.g:1242:1: rule__ServiceDefRepository__Group__4 : rule__ServiceDefRepository__Group__4__Impl rule__ServiceDefRepository__Group__5 ;
    public final void rule__ServiceDefRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1246:1: ( rule__ServiceDefRepository__Group__4__Impl rule__ServiceDefRepository__Group__5 )
            // InternalServiceDefinition.g:1247:2: rule__ServiceDefRepository__Group__4__Impl rule__ServiceDefRepository__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__ServiceDefRepository__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__4"


    // $ANTLR start "rule__ServiceDefRepository__Group__4__Impl"
    // InternalServiceDefinition.g:1254:1: rule__ServiceDefRepository__Group__4__Impl : ( ( rule__ServiceDefRepository__ServicesAssignment_4 )* ) ;
    public final void rule__ServiceDefRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1258:1: ( ( ( rule__ServiceDefRepository__ServicesAssignment_4 )* ) )
            // InternalServiceDefinition.g:1259:1: ( ( rule__ServiceDefRepository__ServicesAssignment_4 )* )
            {
            // InternalServiceDefinition.g:1259:1: ( ( rule__ServiceDefRepository__ServicesAssignment_4 )* )
            // InternalServiceDefinition.g:1260:2: ( rule__ServiceDefRepository__ServicesAssignment_4 )*
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getServicesAssignment_4()); 
            // InternalServiceDefinition.g:1261:2: ( rule__ServiceDefRepository__ServicesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20||(LA10_0>=22 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalServiceDefinition.g:1261:3: rule__ServiceDefRepository__ServicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ServiceDefRepository__ServicesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getServiceDefRepositoryAccess().getServicesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__4__Impl"


    // $ANTLR start "rule__ServiceDefRepository__Group__5"
    // InternalServiceDefinition.g:1269:1: rule__ServiceDefRepository__Group__5 : rule__ServiceDefRepository__Group__5__Impl ;
    public final void rule__ServiceDefRepository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1273:1: ( rule__ServiceDefRepository__Group__5__Impl )
            // InternalServiceDefinition.g:1274:2: rule__ServiceDefRepository__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__5"


    // $ANTLR start "rule__ServiceDefRepository__Group__5__Impl"
    // InternalServiceDefinition.g:1280:1: rule__ServiceDefRepository__Group__5__Impl : ( '}' ) ;
    public final void rule__ServiceDefRepository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1284:1: ( ( '}' ) )
            // InternalServiceDefinition.g:1285:1: ( '}' )
            {
            // InternalServiceDefinition.g:1285:1: ( '}' )
            // InternalServiceDefinition.g:1286:2: '}'
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServiceDefRepositoryAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__5__Impl"


    // $ANTLR start "rule__ServiceDefRepository__Group_2__0"
    // InternalServiceDefinition.g:1296:1: rule__ServiceDefRepository__Group_2__0 : rule__ServiceDefRepository__Group_2__0__Impl rule__ServiceDefRepository__Group_2__1 ;
    public final void rule__ServiceDefRepository__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1300:1: ( rule__ServiceDefRepository__Group_2__0__Impl rule__ServiceDefRepository__Group_2__1 )
            // InternalServiceDefinition.g:1301:2: rule__ServiceDefRepository__Group_2__0__Impl rule__ServiceDefRepository__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__ServiceDefRepository__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group_2__0"


    // $ANTLR start "rule__ServiceDefRepository__Group_2__0__Impl"
    // InternalServiceDefinition.g:1308:1: rule__ServiceDefRepository__Group_2__0__Impl : ( 'version' ) ;
    public final void rule__ServiceDefRepository__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1312:1: ( ( 'version' ) )
            // InternalServiceDefinition.g:1313:1: ( 'version' )
            {
            // InternalServiceDefinition.g:1313:1: ( 'version' )
            // InternalServiceDefinition.g:1314:2: 'version'
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getVersionKeyword_2_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getServiceDefRepositoryAccess().getVersionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group_2__0__Impl"


    // $ANTLR start "rule__ServiceDefRepository__Group_2__1"
    // InternalServiceDefinition.g:1323:1: rule__ServiceDefRepository__Group_2__1 : rule__ServiceDefRepository__Group_2__1__Impl ;
    public final void rule__ServiceDefRepository__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1327:1: ( rule__ServiceDefRepository__Group_2__1__Impl )
            // InternalServiceDefinition.g:1328:2: rule__ServiceDefRepository__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group_2__1"


    // $ANTLR start "rule__ServiceDefRepository__Group_2__1__Impl"
    // InternalServiceDefinition.g:1334:1: rule__ServiceDefRepository__Group_2__1__Impl : ( ( rule__ServiceDefRepository__VersionAssignment_2_1 ) ) ;
    public final void rule__ServiceDefRepository__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1338:1: ( ( ( rule__ServiceDefRepository__VersionAssignment_2_1 ) ) )
            // InternalServiceDefinition.g:1339:1: ( ( rule__ServiceDefRepository__VersionAssignment_2_1 ) )
            {
            // InternalServiceDefinition.g:1339:1: ( ( rule__ServiceDefRepository__VersionAssignment_2_1 ) )
            // InternalServiceDefinition.g:1340:2: ( rule__ServiceDefRepository__VersionAssignment_2_1 )
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getVersionAssignment_2_1()); 
            // InternalServiceDefinition.g:1341:2: ( rule__ServiceDefRepository__VersionAssignment_2_1 )
            // InternalServiceDefinition.g:1341:3: rule__ServiceDefRepository__VersionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__VersionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceDefRepositoryAccess().getVersionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group_2__1__Impl"


    // $ANTLR start "rule__ServiceRepoVersion__Group__0"
    // InternalServiceDefinition.g:1350:1: rule__ServiceRepoVersion__Group__0 : rule__ServiceRepoVersion__Group__0__Impl rule__ServiceRepoVersion__Group__1 ;
    public final void rule__ServiceRepoVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1354:1: ( rule__ServiceRepoVersion__Group__0__Impl rule__ServiceRepoVersion__Group__1 )
            // InternalServiceDefinition.g:1355:2: rule__ServiceRepoVersion__Group__0__Impl rule__ServiceRepoVersion__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceRepoVersion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceRepoVersion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group__0"


    // $ANTLR start "rule__ServiceRepoVersion__Group__0__Impl"
    // InternalServiceDefinition.g:1362:1: rule__ServiceRepoVersion__Group__0__Impl : ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) ) ;
    public final void rule__ServiceRepoVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1366:1: ( ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) ) )
            // InternalServiceDefinition.g:1367:1: ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) )
            {
            // InternalServiceDefinition.g:1367:1: ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) )
            // InternalServiceDefinition.g:1368:2: ( rule__ServiceRepoVersion__MajorAssignment_0 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getMajorAssignment_0()); 
            // InternalServiceDefinition.g:1369:2: ( rule__ServiceRepoVersion__MajorAssignment_0 )
            // InternalServiceDefinition.g:1369:3: rule__ServiceRepoVersion__MajorAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceRepoVersion__MajorAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getServiceRepoVersionAccess().getMajorAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group__0__Impl"


    // $ANTLR start "rule__ServiceRepoVersion__Group__1"
    // InternalServiceDefinition.g:1377:1: rule__ServiceRepoVersion__Group__1 : rule__ServiceRepoVersion__Group__1__Impl rule__ServiceRepoVersion__Group__2 ;
    public final void rule__ServiceRepoVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1381:1: ( rule__ServiceRepoVersion__Group__1__Impl rule__ServiceRepoVersion__Group__2 )
            // InternalServiceDefinition.g:1382:2: rule__ServiceRepoVersion__Group__1__Impl rule__ServiceRepoVersion__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ServiceRepoVersion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceRepoVersion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group__1"


    // $ANTLR start "rule__ServiceRepoVersion__Group__1__Impl"
    // InternalServiceDefinition.g:1389:1: rule__ServiceRepoVersion__Group__1__Impl : ( '.' ) ;
    public final void rule__ServiceRepoVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1393:1: ( ( '.' ) )
            // InternalServiceDefinition.g:1394:1: ( '.' )
            {
            // InternalServiceDefinition.g:1394:1: ( '.' )
            // InternalServiceDefinition.g:1395:2: '.'
            {
             before(grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group__1__Impl"


    // $ANTLR start "rule__ServiceRepoVersion__Group__2"
    // InternalServiceDefinition.g:1404:1: rule__ServiceRepoVersion__Group__2 : rule__ServiceRepoVersion__Group__2__Impl rule__ServiceRepoVersion__Group__3 ;
    public final void rule__ServiceRepoVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1408:1: ( rule__ServiceRepoVersion__Group__2__Impl rule__ServiceRepoVersion__Group__3 )
            // InternalServiceDefinition.g:1409:2: rule__ServiceRepoVersion__Group__2__Impl rule__ServiceRepoVersion__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ServiceRepoVersion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceRepoVersion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group__2"


    // $ANTLR start "rule__ServiceRepoVersion__Group__2__Impl"
    // InternalServiceDefinition.g:1416:1: rule__ServiceRepoVersion__Group__2__Impl : ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) ) ;
    public final void rule__ServiceRepoVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1420:1: ( ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) ) )
            // InternalServiceDefinition.g:1421:1: ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) )
            {
            // InternalServiceDefinition.g:1421:1: ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) )
            // InternalServiceDefinition.g:1422:2: ( rule__ServiceRepoVersion__MinorAssignment_2 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getMinorAssignment_2()); 
            // InternalServiceDefinition.g:1423:2: ( rule__ServiceRepoVersion__MinorAssignment_2 )
            // InternalServiceDefinition.g:1423:3: rule__ServiceRepoVersion__MinorAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ServiceRepoVersion__MinorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceRepoVersionAccess().getMinorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group__2__Impl"


    // $ANTLR start "rule__ServiceRepoVersion__Group__3"
    // InternalServiceDefinition.g:1431:1: rule__ServiceRepoVersion__Group__3 : rule__ServiceRepoVersion__Group__3__Impl ;
    public final void rule__ServiceRepoVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1435:1: ( rule__ServiceRepoVersion__Group__3__Impl )
            // InternalServiceDefinition.g:1436:2: rule__ServiceRepoVersion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceRepoVersion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group__3"


    // $ANTLR start "rule__ServiceRepoVersion__Group__3__Impl"
    // InternalServiceDefinition.g:1442:1: rule__ServiceRepoVersion__Group__3__Impl : ( ( rule__ServiceRepoVersion__Group_3__0 )? ) ;
    public final void rule__ServiceRepoVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1446:1: ( ( ( rule__ServiceRepoVersion__Group_3__0 )? ) )
            // InternalServiceDefinition.g:1447:1: ( ( rule__ServiceRepoVersion__Group_3__0 )? )
            {
            // InternalServiceDefinition.g:1447:1: ( ( rule__ServiceRepoVersion__Group_3__0 )? )
            // InternalServiceDefinition.g:1448:2: ( rule__ServiceRepoVersion__Group_3__0 )?
            {
             before(grammarAccess.getServiceRepoVersionAccess().getGroup_3()); 
            // InternalServiceDefinition.g:1449:2: ( rule__ServiceRepoVersion__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalServiceDefinition.g:1449:3: rule__ServiceRepoVersion__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceRepoVersion__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceRepoVersionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group__3__Impl"


    // $ANTLR start "rule__ServiceRepoVersion__Group_3__0"
    // InternalServiceDefinition.g:1458:1: rule__ServiceRepoVersion__Group_3__0 : rule__ServiceRepoVersion__Group_3__0__Impl rule__ServiceRepoVersion__Group_3__1 ;
    public final void rule__ServiceRepoVersion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1462:1: ( rule__ServiceRepoVersion__Group_3__0__Impl rule__ServiceRepoVersion__Group_3__1 )
            // InternalServiceDefinition.g:1463:2: rule__ServiceRepoVersion__Group_3__0__Impl rule__ServiceRepoVersion__Group_3__1
            {
            pushFollow(FOLLOW_13);
            rule__ServiceRepoVersion__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceRepoVersion__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group_3__0"


    // $ANTLR start "rule__ServiceRepoVersion__Group_3__0__Impl"
    // InternalServiceDefinition.g:1470:1: rule__ServiceRepoVersion__Group_3__0__Impl : ( '.' ) ;
    public final void rule__ServiceRepoVersion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1474:1: ( ( '.' ) )
            // InternalServiceDefinition.g:1475:1: ( '.' )
            {
            // InternalServiceDefinition.g:1475:1: ( '.' )
            // InternalServiceDefinition.g:1476:2: '.'
            {
             before(grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_3_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group_3__0__Impl"


    // $ANTLR start "rule__ServiceRepoVersion__Group_3__1"
    // InternalServiceDefinition.g:1485:1: rule__ServiceRepoVersion__Group_3__1 : rule__ServiceRepoVersion__Group_3__1__Impl ;
    public final void rule__ServiceRepoVersion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1489:1: ( rule__ServiceRepoVersion__Group_3__1__Impl )
            // InternalServiceDefinition.g:1490:2: rule__ServiceRepoVersion__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceRepoVersion__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group_3__1"


    // $ANTLR start "rule__ServiceRepoVersion__Group_3__1__Impl"
    // InternalServiceDefinition.g:1496:1: rule__ServiceRepoVersion__Group_3__1__Impl : ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) ) ;
    public final void rule__ServiceRepoVersion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1500:1: ( ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) ) )
            // InternalServiceDefinition.g:1501:1: ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) )
            {
            // InternalServiceDefinition.g:1501:1: ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) )
            // InternalServiceDefinition.g:1502:2: ( rule__ServiceRepoVersion__PatchAssignment_3_1 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getPatchAssignment_3_1()); 
            // InternalServiceDefinition.g:1503:2: ( rule__ServiceRepoVersion__PatchAssignment_3_1 )
            // InternalServiceDefinition.g:1503:3: rule__ServiceRepoVersion__PatchAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceRepoVersion__PatchAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceRepoVersionAccess().getPatchAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__Group_3__1__Impl"


    // $ANTLR start "rule__CommRepoImport__Group__0"
    // InternalServiceDefinition.g:1512:1: rule__CommRepoImport__Group__0 : rule__CommRepoImport__Group__0__Impl rule__CommRepoImport__Group__1 ;
    public final void rule__CommRepoImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1516:1: ( rule__CommRepoImport__Group__0__Impl rule__CommRepoImport__Group__1 )
            // InternalServiceDefinition.g:1517:2: rule__CommRepoImport__Group__0__Impl rule__CommRepoImport__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CommRepoImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommRepoImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepoImport__Group__0"


    // $ANTLR start "rule__CommRepoImport__Group__0__Impl"
    // InternalServiceDefinition.g:1524:1: rule__CommRepoImport__Group__0__Impl : ( '#import' ) ;
    public final void rule__CommRepoImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1528:1: ( ( '#import' ) )
            // InternalServiceDefinition.g:1529:1: ( '#import' )
            {
            // InternalServiceDefinition.g:1529:1: ( '#import' )
            // InternalServiceDefinition.g:1530:2: '#import'
            {
             before(grammarAccess.getCommRepoImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCommRepoImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepoImport__Group__0__Impl"


    // $ANTLR start "rule__CommRepoImport__Group__1"
    // InternalServiceDefinition.g:1539:1: rule__CommRepoImport__Group__1 : rule__CommRepoImport__Group__1__Impl rule__CommRepoImport__Group__2 ;
    public final void rule__CommRepoImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1543:1: ( rule__CommRepoImport__Group__1__Impl rule__CommRepoImport__Group__2 )
            // InternalServiceDefinition.g:1544:2: rule__CommRepoImport__Group__1__Impl rule__CommRepoImport__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__CommRepoImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommRepoImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepoImport__Group__1"


    // $ANTLR start "rule__CommRepoImport__Group__1__Impl"
    // InternalServiceDefinition.g:1551:1: rule__CommRepoImport__Group__1__Impl : ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__CommRepoImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1555:1: ( ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalServiceDefinition.g:1556:1: ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalServiceDefinition.g:1556:1: ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) )
            // InternalServiceDefinition.g:1557:2: ( rule__CommRepoImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getCommRepoImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalServiceDefinition.g:1558:2: ( rule__CommRepoImport__ImportedNamespaceAssignment_1 )
            // InternalServiceDefinition.g:1558:3: rule__CommRepoImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommRepoImport__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommRepoImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepoImport__Group__1__Impl"


    // $ANTLR start "rule__CommRepoImport__Group__2"
    // InternalServiceDefinition.g:1566:1: rule__CommRepoImport__Group__2 : rule__CommRepoImport__Group__2__Impl ;
    public final void rule__CommRepoImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1570:1: ( rule__CommRepoImport__Group__2__Impl )
            // InternalServiceDefinition.g:1571:2: rule__CommRepoImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommRepoImport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepoImport__Group__2"


    // $ANTLR start "rule__CommRepoImport__Group__2__Impl"
    // InternalServiceDefinition.g:1577:1: rule__CommRepoImport__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__CommRepoImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1581:1: ( ( ( ';' )? ) )
            // InternalServiceDefinition.g:1582:1: ( ( ';' )? )
            {
            // InternalServiceDefinition.g:1582:1: ( ( ';' )? )
            // InternalServiceDefinition.g:1583:2: ( ';' )?
            {
             before(grammarAccess.getCommRepoImportAccess().getSemicolonKeyword_2()); 
            // InternalServiceDefinition.g:1584:2: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalServiceDefinition.g:1584:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCommRepoImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepoImport__Group__2__Impl"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__0"
    // InternalServiceDefinition.g:1593:1: rule__ForkingServiceDefinition__Group__0 : rule__ForkingServiceDefinition__Group__0__Impl rule__ForkingServiceDefinition__Group__1 ;
    public final void rule__ForkingServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1597:1: ( rule__ForkingServiceDefinition__Group__0__Impl rule__ForkingServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:1598:2: rule__ForkingServiceDefinition__Group__0__Impl rule__ForkingServiceDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ForkingServiceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__0"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__0__Impl"
    // InternalServiceDefinition.g:1605:1: rule__ForkingServiceDefinition__Group__0__Impl : ( 'ForkingServiceDefinition' ) ;
    public final void rule__ForkingServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1609:1: ( ( 'ForkingServiceDefinition' ) )
            // InternalServiceDefinition.g:1610:1: ( 'ForkingServiceDefinition' )
            {
            // InternalServiceDefinition.g:1610:1: ( 'ForkingServiceDefinition' )
            // InternalServiceDefinition.g:1611:2: 'ForkingServiceDefinition'
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getForkingServiceDefinitionKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getForkingServiceDefinitionAccess().getForkingServiceDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__0__Impl"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__1"
    // InternalServiceDefinition.g:1620:1: rule__ForkingServiceDefinition__Group__1 : rule__ForkingServiceDefinition__Group__1__Impl rule__ForkingServiceDefinition__Group__2 ;
    public final void rule__ForkingServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1624:1: ( rule__ForkingServiceDefinition__Group__1__Impl rule__ForkingServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:1625:2: rule__ForkingServiceDefinition__Group__1__Impl rule__ForkingServiceDefinition__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ForkingServiceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__1"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__1__Impl"
    // InternalServiceDefinition.g:1632:1: rule__ForkingServiceDefinition__Group__1__Impl : ( ( rule__ForkingServiceDefinition__NameAssignment_1 ) ) ;
    public final void rule__ForkingServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1636:1: ( ( ( rule__ForkingServiceDefinition__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:1637:1: ( ( rule__ForkingServiceDefinition__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:1637:1: ( ( rule__ForkingServiceDefinition__NameAssignment_1 ) )
            // InternalServiceDefinition.g:1638:2: ( rule__ForkingServiceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:1639:2: ( rule__ForkingServiceDefinition__NameAssignment_1 )
            // InternalServiceDefinition.g:1639:3: rule__ForkingServiceDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getForkingServiceDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__1__Impl"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__2"
    // InternalServiceDefinition.g:1647:1: rule__ForkingServiceDefinition__Group__2 : rule__ForkingServiceDefinition__Group__2__Impl rule__ForkingServiceDefinition__Group__3 ;
    public final void rule__ForkingServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1651:1: ( rule__ForkingServiceDefinition__Group__2__Impl rule__ForkingServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:1652:2: rule__ForkingServiceDefinition__Group__2__Impl rule__ForkingServiceDefinition__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ForkingServiceDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__2"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__2__Impl"
    // InternalServiceDefinition.g:1659:1: rule__ForkingServiceDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__ForkingServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1663:1: ( ( '{' ) )
            // InternalServiceDefinition.g:1664:1: ( '{' )
            {
            // InternalServiceDefinition.g:1664:1: ( '{' )
            // InternalServiceDefinition.g:1665:2: '{'
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getForkingServiceDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__2__Impl"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__3"
    // InternalServiceDefinition.g:1674:1: rule__ForkingServiceDefinition__Group__3 : rule__ForkingServiceDefinition__Group__3__Impl rule__ForkingServiceDefinition__Group__4 ;
    public final void rule__ForkingServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1678:1: ( rule__ForkingServiceDefinition__Group__3__Impl rule__ForkingServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:1679:2: rule__ForkingServiceDefinition__Group__3__Impl rule__ForkingServiceDefinition__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ForkingServiceDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__3"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__3__Impl"
    // InternalServiceDefinition.g:1686:1: rule__ForkingServiceDefinition__Group__3__Impl : ( ( rule__ForkingServiceDefinition__PatternAssignment_3 ) ) ;
    public final void rule__ForkingServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1690:1: ( ( ( rule__ForkingServiceDefinition__PatternAssignment_3 ) ) )
            // InternalServiceDefinition.g:1691:1: ( ( rule__ForkingServiceDefinition__PatternAssignment_3 ) )
            {
            // InternalServiceDefinition.g:1691:1: ( ( rule__ForkingServiceDefinition__PatternAssignment_3 ) )
            // InternalServiceDefinition.g:1692:2: ( rule__ForkingServiceDefinition__PatternAssignment_3 )
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPatternAssignment_3()); 
            // InternalServiceDefinition.g:1693:2: ( rule__ForkingServiceDefinition__PatternAssignment_3 )
            // InternalServiceDefinition.g:1693:3: rule__ForkingServiceDefinition__PatternAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__PatternAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getForkingServiceDefinitionAccess().getPatternAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__3__Impl"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__4"
    // InternalServiceDefinition.g:1701:1: rule__ForkingServiceDefinition__Group__4 : rule__ForkingServiceDefinition__Group__4__Impl rule__ForkingServiceDefinition__Group__5 ;
    public final void rule__ForkingServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1705:1: ( rule__ForkingServiceDefinition__Group__4__Impl rule__ForkingServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:1706:2: rule__ForkingServiceDefinition__Group__4__Impl rule__ForkingServiceDefinition__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__ForkingServiceDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__4"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__4__Impl"
    // InternalServiceDefinition.g:1713:1: rule__ForkingServiceDefinition__Group__4__Impl : ( ( rule__ForkingServiceDefinition__Group_4__0 )? ) ;
    public final void rule__ForkingServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1717:1: ( ( ( rule__ForkingServiceDefinition__Group_4__0 )? ) )
            // InternalServiceDefinition.g:1718:1: ( ( rule__ForkingServiceDefinition__Group_4__0 )? )
            {
            // InternalServiceDefinition.g:1718:1: ( ( rule__ForkingServiceDefinition__Group_4__0 )? )
            // InternalServiceDefinition.g:1719:2: ( rule__ForkingServiceDefinition__Group_4__0 )?
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getGroup_4()); 
            // InternalServiceDefinition.g:1720:2: ( rule__ForkingServiceDefinition__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalServiceDefinition.g:1720:3: rule__ForkingServiceDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForkingServiceDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkingServiceDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__4__Impl"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__5"
    // InternalServiceDefinition.g:1728:1: rule__ForkingServiceDefinition__Group__5 : rule__ForkingServiceDefinition__Group__5__Impl rule__ForkingServiceDefinition__Group__6 ;
    public final void rule__ForkingServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1732:1: ( rule__ForkingServiceDefinition__Group__5__Impl rule__ForkingServiceDefinition__Group__6 )
            // InternalServiceDefinition.g:1733:2: rule__ForkingServiceDefinition__Group__5__Impl rule__ForkingServiceDefinition__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__ForkingServiceDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__5"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__5__Impl"
    // InternalServiceDefinition.g:1740:1: rule__ForkingServiceDefinition__Group__5__Impl : ( ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )* ) ;
    public final void rule__ForkingServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1744:1: ( ( ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )* ) )
            // InternalServiceDefinition.g:1745:1: ( ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )* )
            {
            // InternalServiceDefinition.g:1745:1: ( ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )* )
            // InternalServiceDefinition.g:1746:2: ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesAssignment_5()); 
            // InternalServiceDefinition.g:1747:2: ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==46) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalServiceDefinition.g:1747:3: rule__ForkingServiceDefinition__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ForkingServiceDefinition__PropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__5__Impl"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__6"
    // InternalServiceDefinition.g:1755:1: rule__ForkingServiceDefinition__Group__6 : rule__ForkingServiceDefinition__Group__6__Impl ;
    public final void rule__ForkingServiceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1759:1: ( rule__ForkingServiceDefinition__Group__6__Impl )
            // InternalServiceDefinition.g:1760:2: rule__ForkingServiceDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__6"


    // $ANTLR start "rule__ForkingServiceDefinition__Group__6__Impl"
    // InternalServiceDefinition.g:1766:1: rule__ForkingServiceDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__ForkingServiceDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1770:1: ( ( '}' ) )
            // InternalServiceDefinition.g:1771:1: ( '}' )
            {
            // InternalServiceDefinition.g:1771:1: ( '}' )
            // InternalServiceDefinition.g:1772:2: '}'
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getForkingServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group__6__Impl"


    // $ANTLR start "rule__ForkingServiceDefinition__Group_4__0"
    // InternalServiceDefinition.g:1782:1: rule__ForkingServiceDefinition__Group_4__0 : rule__ForkingServiceDefinition__Group_4__0__Impl rule__ForkingServiceDefinition__Group_4__1 ;
    public final void rule__ForkingServiceDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1786:1: ( rule__ForkingServiceDefinition__Group_4__0__Impl rule__ForkingServiceDefinition__Group_4__1 )
            // InternalServiceDefinition.g:1787:2: rule__ForkingServiceDefinition__Group_4__0__Impl rule__ForkingServiceDefinition__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__ForkingServiceDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group_4__0"


    // $ANTLR start "rule__ForkingServiceDefinition__Group_4__0__Impl"
    // InternalServiceDefinition.g:1794:1: rule__ForkingServiceDefinition__Group_4__0__Impl : ( 'purposeDescription' ) ;
    public final void rule__ForkingServiceDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1798:1: ( ( 'purposeDescription' ) )
            // InternalServiceDefinition.g:1799:1: ( 'purposeDescription' )
            {
            // InternalServiceDefinition.g:1799:1: ( 'purposeDescription' )
            // InternalServiceDefinition.g:1800:2: 'purposeDescription'
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getForkingServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__ForkingServiceDefinition__Group_4__1"
    // InternalServiceDefinition.g:1809:1: rule__ForkingServiceDefinition__Group_4__1 : rule__ForkingServiceDefinition__Group_4__1__Impl ;
    public final void rule__ForkingServiceDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1813:1: ( rule__ForkingServiceDefinition__Group_4__1__Impl )
            // InternalServiceDefinition.g:1814:2: rule__ForkingServiceDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group_4__1"


    // $ANTLR start "rule__ForkingServiceDefinition__Group_4__1__Impl"
    // InternalServiceDefinition.g:1820:1: rule__ForkingServiceDefinition__Group_4__1__Impl : ( ( rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1 ) ) ;
    public final void rule__ForkingServiceDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1824:1: ( ( ( rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1 ) ) )
            // InternalServiceDefinition.g:1825:1: ( ( rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1 ) )
            {
            // InternalServiceDefinition.g:1825:1: ( ( rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1 ) )
            // InternalServiceDefinition.g:1826:2: ( rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1 )
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPurposeDescriptionAssignment_4_1()); 
            // InternalServiceDefinition.g:1827:2: ( rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1 )
            // InternalServiceDefinition.g:1827:3: rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getForkingServiceDefinitionAccess().getPurposeDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__0"
    // InternalServiceDefinition.g:1836:1: rule__JoyningServiceDefinition__Group__0 : rule__JoyningServiceDefinition__Group__0__Impl rule__JoyningServiceDefinition__Group__1 ;
    public final void rule__JoyningServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1840:1: ( rule__JoyningServiceDefinition__Group__0__Impl rule__JoyningServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:1841:2: rule__JoyningServiceDefinition__Group__0__Impl rule__JoyningServiceDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__JoyningServiceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__0"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__0__Impl"
    // InternalServiceDefinition.g:1848:1: rule__JoyningServiceDefinition__Group__0__Impl : ( 'JoiningServiceDefinition' ) ;
    public final void rule__JoyningServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1852:1: ( ( 'JoiningServiceDefinition' ) )
            // InternalServiceDefinition.g:1853:1: ( 'JoiningServiceDefinition' )
            {
            // InternalServiceDefinition.g:1853:1: ( 'JoiningServiceDefinition' )
            // InternalServiceDefinition.g:1854:2: 'JoiningServiceDefinition'
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getJoiningServiceDefinitionKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getJoyningServiceDefinitionAccess().getJoiningServiceDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__0__Impl"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__1"
    // InternalServiceDefinition.g:1863:1: rule__JoyningServiceDefinition__Group__1 : rule__JoyningServiceDefinition__Group__1__Impl rule__JoyningServiceDefinition__Group__2 ;
    public final void rule__JoyningServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1867:1: ( rule__JoyningServiceDefinition__Group__1__Impl rule__JoyningServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:1868:2: rule__JoyningServiceDefinition__Group__1__Impl rule__JoyningServiceDefinition__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__JoyningServiceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__1"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__1__Impl"
    // InternalServiceDefinition.g:1875:1: rule__JoyningServiceDefinition__Group__1__Impl : ( ( rule__JoyningServiceDefinition__NameAssignment_1 ) ) ;
    public final void rule__JoyningServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1879:1: ( ( ( rule__JoyningServiceDefinition__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:1880:1: ( ( rule__JoyningServiceDefinition__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:1880:1: ( ( rule__JoyningServiceDefinition__NameAssignment_1 ) )
            // InternalServiceDefinition.g:1881:2: ( rule__JoyningServiceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:1882:2: ( rule__JoyningServiceDefinition__NameAssignment_1 )
            // InternalServiceDefinition.g:1882:3: rule__JoyningServiceDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJoyningServiceDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__1__Impl"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__2"
    // InternalServiceDefinition.g:1890:1: rule__JoyningServiceDefinition__Group__2 : rule__JoyningServiceDefinition__Group__2__Impl rule__JoyningServiceDefinition__Group__3 ;
    public final void rule__JoyningServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1894:1: ( rule__JoyningServiceDefinition__Group__2__Impl rule__JoyningServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:1895:2: rule__JoyningServiceDefinition__Group__2__Impl rule__JoyningServiceDefinition__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__JoyningServiceDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__2"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__2__Impl"
    // InternalServiceDefinition.g:1902:1: rule__JoyningServiceDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__JoyningServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1906:1: ( ( '{' ) )
            // InternalServiceDefinition.g:1907:1: ( '{' )
            {
            // InternalServiceDefinition.g:1907:1: ( '{' )
            // InternalServiceDefinition.g:1908:2: '{'
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getJoyningServiceDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__2__Impl"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__3"
    // InternalServiceDefinition.g:1917:1: rule__JoyningServiceDefinition__Group__3 : rule__JoyningServiceDefinition__Group__3__Impl rule__JoyningServiceDefinition__Group__4 ;
    public final void rule__JoyningServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1921:1: ( rule__JoyningServiceDefinition__Group__3__Impl rule__JoyningServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:1922:2: rule__JoyningServiceDefinition__Group__3__Impl rule__JoyningServiceDefinition__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__JoyningServiceDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__3"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__3__Impl"
    // InternalServiceDefinition.g:1929:1: rule__JoyningServiceDefinition__Group__3__Impl : ( ( rule__JoyningServiceDefinition__PatternAssignment_3 ) ) ;
    public final void rule__JoyningServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1933:1: ( ( ( rule__JoyningServiceDefinition__PatternAssignment_3 ) ) )
            // InternalServiceDefinition.g:1934:1: ( ( rule__JoyningServiceDefinition__PatternAssignment_3 ) )
            {
            // InternalServiceDefinition.g:1934:1: ( ( rule__JoyningServiceDefinition__PatternAssignment_3 ) )
            // InternalServiceDefinition.g:1935:2: ( rule__JoyningServiceDefinition__PatternAssignment_3 )
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPatternAssignment_3()); 
            // InternalServiceDefinition.g:1936:2: ( rule__JoyningServiceDefinition__PatternAssignment_3 )
            // InternalServiceDefinition.g:1936:3: rule__JoyningServiceDefinition__PatternAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__PatternAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJoyningServiceDefinitionAccess().getPatternAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__3__Impl"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__4"
    // InternalServiceDefinition.g:1944:1: rule__JoyningServiceDefinition__Group__4 : rule__JoyningServiceDefinition__Group__4__Impl rule__JoyningServiceDefinition__Group__5 ;
    public final void rule__JoyningServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1948:1: ( rule__JoyningServiceDefinition__Group__4__Impl rule__JoyningServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:1949:2: rule__JoyningServiceDefinition__Group__4__Impl rule__JoyningServiceDefinition__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__JoyningServiceDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__4"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__4__Impl"
    // InternalServiceDefinition.g:1956:1: rule__JoyningServiceDefinition__Group__4__Impl : ( ( rule__JoyningServiceDefinition__Group_4__0 )? ) ;
    public final void rule__JoyningServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1960:1: ( ( ( rule__JoyningServiceDefinition__Group_4__0 )? ) )
            // InternalServiceDefinition.g:1961:1: ( ( rule__JoyningServiceDefinition__Group_4__0 )? )
            {
            // InternalServiceDefinition.g:1961:1: ( ( rule__JoyningServiceDefinition__Group_4__0 )? )
            // InternalServiceDefinition.g:1962:2: ( rule__JoyningServiceDefinition__Group_4__0 )?
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getGroup_4()); 
            // InternalServiceDefinition.g:1963:2: ( rule__JoyningServiceDefinition__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalServiceDefinition.g:1963:3: rule__JoyningServiceDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JoyningServiceDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoyningServiceDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__4__Impl"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__5"
    // InternalServiceDefinition.g:1971:1: rule__JoyningServiceDefinition__Group__5 : rule__JoyningServiceDefinition__Group__5__Impl rule__JoyningServiceDefinition__Group__6 ;
    public final void rule__JoyningServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1975:1: ( rule__JoyningServiceDefinition__Group__5__Impl rule__JoyningServiceDefinition__Group__6 )
            // InternalServiceDefinition.g:1976:2: rule__JoyningServiceDefinition__Group__5__Impl rule__JoyningServiceDefinition__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__JoyningServiceDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__5"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__5__Impl"
    // InternalServiceDefinition.g:1983:1: rule__JoyningServiceDefinition__Group__5__Impl : ( ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )* ) ;
    public final void rule__JoyningServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1987:1: ( ( ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )* ) )
            // InternalServiceDefinition.g:1988:1: ( ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )* )
            {
            // InternalServiceDefinition.g:1988:1: ( ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )* )
            // InternalServiceDefinition.g:1989:2: ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesAssignment_5()); 
            // InternalServiceDefinition.g:1990:2: ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==46) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalServiceDefinition.g:1990:3: rule__JoyningServiceDefinition__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__JoyningServiceDefinition__PropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__5__Impl"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__6"
    // InternalServiceDefinition.g:1998:1: rule__JoyningServiceDefinition__Group__6 : rule__JoyningServiceDefinition__Group__6__Impl ;
    public final void rule__JoyningServiceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2002:1: ( rule__JoyningServiceDefinition__Group__6__Impl )
            // InternalServiceDefinition.g:2003:2: rule__JoyningServiceDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__6"


    // $ANTLR start "rule__JoyningServiceDefinition__Group__6__Impl"
    // InternalServiceDefinition.g:2009:1: rule__JoyningServiceDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__JoyningServiceDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2013:1: ( ( '}' ) )
            // InternalServiceDefinition.g:2014:1: ( '}' )
            {
            // InternalServiceDefinition.g:2014:1: ( '}' )
            // InternalServiceDefinition.g:2015:2: '}'
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJoyningServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group__6__Impl"


    // $ANTLR start "rule__JoyningServiceDefinition__Group_4__0"
    // InternalServiceDefinition.g:2025:1: rule__JoyningServiceDefinition__Group_4__0 : rule__JoyningServiceDefinition__Group_4__0__Impl rule__JoyningServiceDefinition__Group_4__1 ;
    public final void rule__JoyningServiceDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2029:1: ( rule__JoyningServiceDefinition__Group_4__0__Impl rule__JoyningServiceDefinition__Group_4__1 )
            // InternalServiceDefinition.g:2030:2: rule__JoyningServiceDefinition__Group_4__0__Impl rule__JoyningServiceDefinition__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__JoyningServiceDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group_4__0"


    // $ANTLR start "rule__JoyningServiceDefinition__Group_4__0__Impl"
    // InternalServiceDefinition.g:2037:1: rule__JoyningServiceDefinition__Group_4__0__Impl : ( 'purposeDescription' ) ;
    public final void rule__JoyningServiceDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2041:1: ( ( 'purposeDescription' ) )
            // InternalServiceDefinition.g:2042:1: ( 'purposeDescription' )
            {
            // InternalServiceDefinition.g:2042:1: ( 'purposeDescription' )
            // InternalServiceDefinition.g:2043:2: 'purposeDescription'
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getJoyningServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__JoyningServiceDefinition__Group_4__1"
    // InternalServiceDefinition.g:2052:1: rule__JoyningServiceDefinition__Group_4__1 : rule__JoyningServiceDefinition__Group_4__1__Impl ;
    public final void rule__JoyningServiceDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2056:1: ( rule__JoyningServiceDefinition__Group_4__1__Impl )
            // InternalServiceDefinition.g:2057:2: rule__JoyningServiceDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group_4__1"


    // $ANTLR start "rule__JoyningServiceDefinition__Group_4__1__Impl"
    // InternalServiceDefinition.g:2063:1: rule__JoyningServiceDefinition__Group_4__1__Impl : ( ( rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1 ) ) ;
    public final void rule__JoyningServiceDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2067:1: ( ( ( rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1 ) ) )
            // InternalServiceDefinition.g:2068:1: ( ( rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1 ) )
            {
            // InternalServiceDefinition.g:2068:1: ( ( rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1 ) )
            // InternalServiceDefinition.g:2069:2: ( rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1 )
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPurposeDescriptionAssignment_4_1()); 
            // InternalServiceDefinition.g:2070:2: ( rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1 )
            // InternalServiceDefinition.g:2070:3: rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getJoyningServiceDefinitionAccess().getPurposeDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__0"
    // InternalServiceDefinition.g:2079:1: rule__RequestAnswerServiceDefinition__Group__0 : rule__RequestAnswerServiceDefinition__Group__0__Impl rule__RequestAnswerServiceDefinition__Group__1 ;
    public final void rule__RequestAnswerServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2083:1: ( rule__RequestAnswerServiceDefinition__Group__0__Impl rule__RequestAnswerServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:2084:2: rule__RequestAnswerServiceDefinition__Group__0__Impl rule__RequestAnswerServiceDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__RequestAnswerServiceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__0"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__0__Impl"
    // InternalServiceDefinition.g:2091:1: rule__RequestAnswerServiceDefinition__Group__0__Impl : ( 'RequestAnswerServiceDefinition' ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2095:1: ( ( 'RequestAnswerServiceDefinition' ) )
            // InternalServiceDefinition.g:2096:1: ( 'RequestAnswerServiceDefinition' )
            {
            // InternalServiceDefinition.g:2096:1: ( 'RequestAnswerServiceDefinition' )
            // InternalServiceDefinition.g:2097:2: 'RequestAnswerServiceDefinition'
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRequestAnswerServiceDefinitionKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRequestAnswerServiceDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__0__Impl"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__1"
    // InternalServiceDefinition.g:2106:1: rule__RequestAnswerServiceDefinition__Group__1 : rule__RequestAnswerServiceDefinition__Group__1__Impl rule__RequestAnswerServiceDefinition__Group__2 ;
    public final void rule__RequestAnswerServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2110:1: ( rule__RequestAnswerServiceDefinition__Group__1__Impl rule__RequestAnswerServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:2111:2: rule__RequestAnswerServiceDefinition__Group__1__Impl rule__RequestAnswerServiceDefinition__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__RequestAnswerServiceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__1"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__1__Impl"
    // InternalServiceDefinition.g:2118:1: rule__RequestAnswerServiceDefinition__Group__1__Impl : ( ( rule__RequestAnswerServiceDefinition__NameAssignment_1 ) ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2122:1: ( ( ( rule__RequestAnswerServiceDefinition__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:2123:1: ( ( rule__RequestAnswerServiceDefinition__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:2123:1: ( ( rule__RequestAnswerServiceDefinition__NameAssignment_1 ) )
            // InternalServiceDefinition.g:2124:2: ( rule__RequestAnswerServiceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:2125:2: ( rule__RequestAnswerServiceDefinition__NameAssignment_1 )
            // InternalServiceDefinition.g:2125:3: rule__RequestAnswerServiceDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__1__Impl"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__2"
    // InternalServiceDefinition.g:2133:1: rule__RequestAnswerServiceDefinition__Group__2 : rule__RequestAnswerServiceDefinition__Group__2__Impl rule__RequestAnswerServiceDefinition__Group__3 ;
    public final void rule__RequestAnswerServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2137:1: ( rule__RequestAnswerServiceDefinition__Group__2__Impl rule__RequestAnswerServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:2138:2: rule__RequestAnswerServiceDefinition__Group__2__Impl rule__RequestAnswerServiceDefinition__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__RequestAnswerServiceDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__2"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__2__Impl"
    // InternalServiceDefinition.g:2145:1: rule__RequestAnswerServiceDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2149:1: ( ( '{' ) )
            // InternalServiceDefinition.g:2150:1: ( '{' )
            {
            // InternalServiceDefinition.g:2150:1: ( '{' )
            // InternalServiceDefinition.g:2151:2: '{'
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__2__Impl"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__3"
    // InternalServiceDefinition.g:2160:1: rule__RequestAnswerServiceDefinition__Group__3 : rule__RequestAnswerServiceDefinition__Group__3__Impl rule__RequestAnswerServiceDefinition__Group__4 ;
    public final void rule__RequestAnswerServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2164:1: ( rule__RequestAnswerServiceDefinition__Group__3__Impl rule__RequestAnswerServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:2165:2: rule__RequestAnswerServiceDefinition__Group__3__Impl rule__RequestAnswerServiceDefinition__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__RequestAnswerServiceDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__3"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__3__Impl"
    // InternalServiceDefinition.g:2172:1: rule__RequestAnswerServiceDefinition__Group__3__Impl : ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 ) ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2176:1: ( ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 ) ) )
            // InternalServiceDefinition.g:2177:1: ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 ) )
            {
            // InternalServiceDefinition.g:2177:1: ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 ) )
            // InternalServiceDefinition.g:2178:2: ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 )
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternAssignment_3()); 
            // InternalServiceDefinition.g:2179:2: ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 )
            // InternalServiceDefinition.g:2179:3: rule__RequestAnswerServiceDefinition__PatternAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__PatternAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__3__Impl"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__4"
    // InternalServiceDefinition.g:2187:1: rule__RequestAnswerServiceDefinition__Group__4 : rule__RequestAnswerServiceDefinition__Group__4__Impl rule__RequestAnswerServiceDefinition__Group__5 ;
    public final void rule__RequestAnswerServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2191:1: ( rule__RequestAnswerServiceDefinition__Group__4__Impl rule__RequestAnswerServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:2192:2: rule__RequestAnswerServiceDefinition__Group__4__Impl rule__RequestAnswerServiceDefinition__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__RequestAnswerServiceDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__4"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__4__Impl"
    // InternalServiceDefinition.g:2199:1: rule__RequestAnswerServiceDefinition__Group__4__Impl : ( ( rule__RequestAnswerServiceDefinition__Group_4__0 )? ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2203:1: ( ( ( rule__RequestAnswerServiceDefinition__Group_4__0 )? ) )
            // InternalServiceDefinition.g:2204:1: ( ( rule__RequestAnswerServiceDefinition__Group_4__0 )? )
            {
            // InternalServiceDefinition.g:2204:1: ( ( rule__RequestAnswerServiceDefinition__Group_4__0 )? )
            // InternalServiceDefinition.g:2205:2: ( rule__RequestAnswerServiceDefinition__Group_4__0 )?
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getGroup_4()); 
            // InternalServiceDefinition.g:2206:2: ( rule__RequestAnswerServiceDefinition__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalServiceDefinition.g:2206:3: rule__RequestAnswerServiceDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequestAnswerServiceDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__4__Impl"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__5"
    // InternalServiceDefinition.g:2214:1: rule__RequestAnswerServiceDefinition__Group__5 : rule__RequestAnswerServiceDefinition__Group__5__Impl rule__RequestAnswerServiceDefinition__Group__6 ;
    public final void rule__RequestAnswerServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2218:1: ( rule__RequestAnswerServiceDefinition__Group__5__Impl rule__RequestAnswerServiceDefinition__Group__6 )
            // InternalServiceDefinition.g:2219:2: rule__RequestAnswerServiceDefinition__Group__5__Impl rule__RequestAnswerServiceDefinition__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__RequestAnswerServiceDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__5"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__5__Impl"
    // InternalServiceDefinition.g:2226:1: rule__RequestAnswerServiceDefinition__Group__5__Impl : ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )* ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2230:1: ( ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )* ) )
            // InternalServiceDefinition.g:2231:1: ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )* )
            {
            // InternalServiceDefinition.g:2231:1: ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )* )
            // InternalServiceDefinition.g:2232:2: ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesAssignment_5()); 
            // InternalServiceDefinition.g:2233:2: ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==46) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalServiceDefinition.g:2233:3: rule__RequestAnswerServiceDefinition__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__RequestAnswerServiceDefinition__PropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__5__Impl"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__6"
    // InternalServiceDefinition.g:2241:1: rule__RequestAnswerServiceDefinition__Group__6 : rule__RequestAnswerServiceDefinition__Group__6__Impl ;
    public final void rule__RequestAnswerServiceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2245:1: ( rule__RequestAnswerServiceDefinition__Group__6__Impl )
            // InternalServiceDefinition.g:2246:2: rule__RequestAnswerServiceDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__6"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__6__Impl"
    // InternalServiceDefinition.g:2252:1: rule__RequestAnswerServiceDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2256:1: ( ( '}' ) )
            // InternalServiceDefinition.g:2257:1: ( '}' )
            {
            // InternalServiceDefinition.g:2257:1: ( '}' )
            // InternalServiceDefinition.g:2258:2: '}'
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group__6__Impl"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group_4__0"
    // InternalServiceDefinition.g:2268:1: rule__RequestAnswerServiceDefinition__Group_4__0 : rule__RequestAnswerServiceDefinition__Group_4__0__Impl rule__RequestAnswerServiceDefinition__Group_4__1 ;
    public final void rule__RequestAnswerServiceDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2272:1: ( rule__RequestAnswerServiceDefinition__Group_4__0__Impl rule__RequestAnswerServiceDefinition__Group_4__1 )
            // InternalServiceDefinition.g:2273:2: rule__RequestAnswerServiceDefinition__Group_4__0__Impl rule__RequestAnswerServiceDefinition__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__RequestAnswerServiceDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group_4__0"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group_4__0__Impl"
    // InternalServiceDefinition.g:2280:1: rule__RequestAnswerServiceDefinition__Group_4__0__Impl : ( 'purposeDescription' ) ;
    public final void rule__RequestAnswerServiceDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2284:1: ( ( 'purposeDescription' ) )
            // InternalServiceDefinition.g:2285:1: ( 'purposeDescription' )
            {
            // InternalServiceDefinition.g:2285:1: ( 'purposeDescription' )
            // InternalServiceDefinition.g:2286:2: 'purposeDescription'
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPurposeDescriptionKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group_4__1"
    // InternalServiceDefinition.g:2295:1: rule__RequestAnswerServiceDefinition__Group_4__1 : rule__RequestAnswerServiceDefinition__Group_4__1__Impl ;
    public final void rule__RequestAnswerServiceDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2299:1: ( rule__RequestAnswerServiceDefinition__Group_4__1__Impl )
            // InternalServiceDefinition.g:2300:2: rule__RequestAnswerServiceDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group_4__1"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group_4__1__Impl"
    // InternalServiceDefinition.g:2306:1: rule__RequestAnswerServiceDefinition__Group_4__1__Impl : ( ( rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1 ) ) ;
    public final void rule__RequestAnswerServiceDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2310:1: ( ( ( rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1 ) ) )
            // InternalServiceDefinition.g:2311:1: ( ( rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1 ) )
            {
            // InternalServiceDefinition.g:2311:1: ( ( rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1 ) )
            // InternalServiceDefinition.g:2312:2: ( rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1 )
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPurposeDescriptionAssignment_4_1()); 
            // InternalServiceDefinition.g:2313:2: ( rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1 )
            // InternalServiceDefinition.g:2313:3: rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPurposeDescriptionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__0"
    // InternalServiceDefinition.g:2322:1: rule__CoordinationServiceDefinition__Group__0 : rule__CoordinationServiceDefinition__Group__0__Impl rule__CoordinationServiceDefinition__Group__1 ;
    public final void rule__CoordinationServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2326:1: ( rule__CoordinationServiceDefinition__Group__0__Impl rule__CoordinationServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:2327:2: rule__CoordinationServiceDefinition__Group__0__Impl rule__CoordinationServiceDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CoordinationServiceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__0"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__0__Impl"
    // InternalServiceDefinition.g:2334:1: rule__CoordinationServiceDefinition__Group__0__Impl : ( 'CoordinationServiceDefinition' ) ;
    public final void rule__CoordinationServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2338:1: ( ( 'CoordinationServiceDefinition' ) )
            // InternalServiceDefinition.g:2339:1: ( 'CoordinationServiceDefinition' )
            {
            // InternalServiceDefinition.g:2339:1: ( 'CoordinationServiceDefinition' )
            // InternalServiceDefinition.g:2340:2: 'CoordinationServiceDefinition'
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getCoordinationServiceDefinitionKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCoordinationServiceDefinitionAccess().getCoordinationServiceDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__0__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__1"
    // InternalServiceDefinition.g:2349:1: rule__CoordinationServiceDefinition__Group__1 : rule__CoordinationServiceDefinition__Group__1__Impl rule__CoordinationServiceDefinition__Group__2 ;
    public final void rule__CoordinationServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2353:1: ( rule__CoordinationServiceDefinition__Group__1__Impl rule__CoordinationServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:2354:2: rule__CoordinationServiceDefinition__Group__1__Impl rule__CoordinationServiceDefinition__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CoordinationServiceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__1"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__1__Impl"
    // InternalServiceDefinition.g:2361:1: rule__CoordinationServiceDefinition__Group__1__Impl : ( ( rule__CoordinationServiceDefinition__NameAssignment_1 ) ) ;
    public final void rule__CoordinationServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2365:1: ( ( ( rule__CoordinationServiceDefinition__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:2366:1: ( ( rule__CoordinationServiceDefinition__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:2366:1: ( ( rule__CoordinationServiceDefinition__NameAssignment_1 ) )
            // InternalServiceDefinition.g:2367:2: ( rule__CoordinationServiceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:2368:2: ( rule__CoordinationServiceDefinition__NameAssignment_1 )
            // InternalServiceDefinition.g:2368:3: rule__CoordinationServiceDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__1__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__2"
    // InternalServiceDefinition.g:2376:1: rule__CoordinationServiceDefinition__Group__2 : rule__CoordinationServiceDefinition__Group__2__Impl rule__CoordinationServiceDefinition__Group__3 ;
    public final void rule__CoordinationServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2380:1: ( rule__CoordinationServiceDefinition__Group__2__Impl rule__CoordinationServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:2381:2: rule__CoordinationServiceDefinition__Group__2__Impl rule__CoordinationServiceDefinition__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__CoordinationServiceDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__2"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__2__Impl"
    // InternalServiceDefinition.g:2388:1: rule__CoordinationServiceDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__CoordinationServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2392:1: ( ( '{' ) )
            // InternalServiceDefinition.g:2393:1: ( '{' )
            {
            // InternalServiceDefinition.g:2393:1: ( '{' )
            // InternalServiceDefinition.g:2394:2: '{'
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCoordinationServiceDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__2__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__3"
    // InternalServiceDefinition.g:2403:1: rule__CoordinationServiceDefinition__Group__3 : rule__CoordinationServiceDefinition__Group__3__Impl rule__CoordinationServiceDefinition__Group__4 ;
    public final void rule__CoordinationServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2407:1: ( rule__CoordinationServiceDefinition__Group__3__Impl rule__CoordinationServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:2408:2: rule__CoordinationServiceDefinition__Group__3__Impl rule__CoordinationServiceDefinition__Group__4
            {
            pushFollow(FOLLOW_23);
            rule__CoordinationServiceDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__3"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__3__Impl"
    // InternalServiceDefinition.g:2415:1: rule__CoordinationServiceDefinition__Group__3__Impl : ( ( rule__CoordinationServiceDefinition__UnorderedGroup_3 ) ) ;
    public final void rule__CoordinationServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2419:1: ( ( ( rule__CoordinationServiceDefinition__UnorderedGroup_3 ) ) )
            // InternalServiceDefinition.g:2420:1: ( ( rule__CoordinationServiceDefinition__UnorderedGroup_3 ) )
            {
            // InternalServiceDefinition.g:2420:1: ( ( rule__CoordinationServiceDefinition__UnorderedGroup_3 ) )
            // InternalServiceDefinition.g:2421:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3 )
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3()); 
            // InternalServiceDefinition.g:2422:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3 )
            // InternalServiceDefinition.g:2422:3: rule__CoordinationServiceDefinition__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__3__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__4"
    // InternalServiceDefinition.g:2430:1: rule__CoordinationServiceDefinition__Group__4 : rule__CoordinationServiceDefinition__Group__4__Impl rule__CoordinationServiceDefinition__Group__5 ;
    public final void rule__CoordinationServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2434:1: ( rule__CoordinationServiceDefinition__Group__4__Impl rule__CoordinationServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:2435:2: rule__CoordinationServiceDefinition__Group__4__Impl rule__CoordinationServiceDefinition__Group__5
            {
            pushFollow(FOLLOW_23);
            rule__CoordinationServiceDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__4"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__4__Impl"
    // InternalServiceDefinition.g:2442:1: rule__CoordinationServiceDefinition__Group__4__Impl : ( ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )* ) ;
    public final void rule__CoordinationServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2446:1: ( ( ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )* ) )
            // InternalServiceDefinition.g:2447:1: ( ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )* )
            {
            // InternalServiceDefinition.g:2447:1: ( ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )* )
            // InternalServiceDefinition.g:2448:2: ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )*
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesAssignment_4()); 
            // InternalServiceDefinition.g:2449:2: ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==25) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalServiceDefinition.g:2449:3: rule__CoordinationServiceDefinition__ServicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__CoordinationServiceDefinition__ServicesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__4__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__5"
    // InternalServiceDefinition.g:2457:1: rule__CoordinationServiceDefinition__Group__5 : rule__CoordinationServiceDefinition__Group__5__Impl rule__CoordinationServiceDefinition__Group__6 ;
    public final void rule__CoordinationServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2461:1: ( rule__CoordinationServiceDefinition__Group__5__Impl rule__CoordinationServiceDefinition__Group__6 )
            // InternalServiceDefinition.g:2462:2: rule__CoordinationServiceDefinition__Group__5__Impl rule__CoordinationServiceDefinition__Group__6
            {
            pushFollow(FOLLOW_23);
            rule__CoordinationServiceDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__5"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__5__Impl"
    // InternalServiceDefinition.g:2469:1: rule__CoordinationServiceDefinition__Group__5__Impl : ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )* ) ;
    public final void rule__CoordinationServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2473:1: ( ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )* ) )
            // InternalServiceDefinition.g:2474:1: ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )* )
            {
            // InternalServiceDefinition.g:2474:1: ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )* )
            // InternalServiceDefinition.g:2475:2: ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesAssignment_5()); 
            // InternalServiceDefinition.g:2476:2: ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==46) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalServiceDefinition.g:2476:3: rule__CoordinationServiceDefinition__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__CoordinationServiceDefinition__PropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__5__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__6"
    // InternalServiceDefinition.g:2484:1: rule__CoordinationServiceDefinition__Group__6 : rule__CoordinationServiceDefinition__Group__6__Impl ;
    public final void rule__CoordinationServiceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2488:1: ( rule__CoordinationServiceDefinition__Group__6__Impl )
            // InternalServiceDefinition.g:2489:2: rule__CoordinationServiceDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__6"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__6__Impl"
    // InternalServiceDefinition.g:2495:1: rule__CoordinationServiceDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__CoordinationServiceDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2499:1: ( ( '}' ) )
            // InternalServiceDefinition.g:2500:1: ( '}' )
            {
            // InternalServiceDefinition.g:2500:1: ( '}' )
            // InternalServiceDefinition.g:2501:2: '}'
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCoordinationServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__6__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group_3_0__0"
    // InternalServiceDefinition.g:2511:1: rule__CoordinationServiceDefinition__Group_3_0__0 : rule__CoordinationServiceDefinition__Group_3_0__0__Impl rule__CoordinationServiceDefinition__Group_3_0__1 ;
    public final void rule__CoordinationServiceDefinition__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2515:1: ( rule__CoordinationServiceDefinition__Group_3_0__0__Impl rule__CoordinationServiceDefinition__Group_3_0__1 )
            // InternalServiceDefinition.g:2516:2: rule__CoordinationServiceDefinition__Group_3_0__0__Impl rule__CoordinationServiceDefinition__Group_3_0__1
            {
            pushFollow(FOLLOW_19);
            rule__CoordinationServiceDefinition__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group_3_0__0"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group_3_0__0__Impl"
    // InternalServiceDefinition.g:2523:1: rule__CoordinationServiceDefinition__Group_3_0__0__Impl : ( 'purposeDescription' ) ;
    public final void rule__CoordinationServiceDefinition__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2527:1: ( ( 'purposeDescription' ) )
            // InternalServiceDefinition.g:2528:1: ( 'purposeDescription' )
            {
            // InternalServiceDefinition.g:2528:1: ( 'purposeDescription' )
            // InternalServiceDefinition.g:2529:2: 'purposeDescription'
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getPurposeDescriptionKeyword_3_0_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCoordinationServiceDefinitionAccess().getPurposeDescriptionKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group_3_0__0__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group_3_0__1"
    // InternalServiceDefinition.g:2538:1: rule__CoordinationServiceDefinition__Group_3_0__1 : rule__CoordinationServiceDefinition__Group_3_0__1__Impl ;
    public final void rule__CoordinationServiceDefinition__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2542:1: ( rule__CoordinationServiceDefinition__Group_3_0__1__Impl )
            // InternalServiceDefinition.g:2543:2: rule__CoordinationServiceDefinition__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group_3_0__1"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group_3_0__1__Impl"
    // InternalServiceDefinition.g:2549:1: rule__CoordinationServiceDefinition__Group_3_0__1__Impl : ( ( rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1 ) ) ;
    public final void rule__CoordinationServiceDefinition__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2553:1: ( ( ( rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1 ) ) )
            // InternalServiceDefinition.g:2554:1: ( ( rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1 ) )
            {
            // InternalServiceDefinition.g:2554:1: ( ( rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1 ) )
            // InternalServiceDefinition.g:2555:2: ( rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1 )
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getPurposeDescriptionAssignment_3_0_1()); 
            // InternalServiceDefinition.g:2556:2: ( rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1 )
            // InternalServiceDefinition.g:2556:3: rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getPurposeDescriptionAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group_3_0__1__Impl"


    // $ANTLR start "rule__CommunicationServiceUsage__Group__0"
    // InternalServiceDefinition.g:2565:1: rule__CommunicationServiceUsage__Group__0 : rule__CommunicationServiceUsage__Group__0__Impl rule__CommunicationServiceUsage__Group__1 ;
    public final void rule__CommunicationServiceUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2569:1: ( rule__CommunicationServiceUsage__Group__0__Impl rule__CommunicationServiceUsage__Group__1 )
            // InternalServiceDefinition.g:2570:2: rule__CommunicationServiceUsage__Group__0__Impl rule__CommunicationServiceUsage__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__CommunicationServiceUsage__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsage__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsage__Group__0"


    // $ANTLR start "rule__CommunicationServiceUsage__Group__0__Impl"
    // InternalServiceDefinition.g:2577:1: rule__CommunicationServiceUsage__Group__0__Impl : ( 'CommunicationServiceUsage' ) ;
    public final void rule__CommunicationServiceUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2581:1: ( ( 'CommunicationServiceUsage' ) )
            // InternalServiceDefinition.g:2582:1: ( 'CommunicationServiceUsage' )
            {
            // InternalServiceDefinition.g:2582:1: ( 'CommunicationServiceUsage' )
            // InternalServiceDefinition.g:2583:2: 'CommunicationServiceUsage'
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getCommunicationServiceUsageKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCommunicationServiceUsageAccess().getCommunicationServiceUsageKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsage__Group__0__Impl"


    // $ANTLR start "rule__CommunicationServiceUsage__Group__1"
    // InternalServiceDefinition.g:2592:1: rule__CommunicationServiceUsage__Group__1 : rule__CommunicationServiceUsage__Group__1__Impl rule__CommunicationServiceUsage__Group__2 ;
    public final void rule__CommunicationServiceUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2596:1: ( rule__CommunicationServiceUsage__Group__1__Impl rule__CommunicationServiceUsage__Group__2 )
            // InternalServiceDefinition.g:2597:2: rule__CommunicationServiceUsage__Group__1__Impl rule__CommunicationServiceUsage__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__CommunicationServiceUsage__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsage__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsage__Group__1"


    // $ANTLR start "rule__CommunicationServiceUsage__Group__1__Impl"
    // InternalServiceDefinition.g:2604:1: rule__CommunicationServiceUsage__Group__1__Impl : ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) ) ;
    public final void rule__CommunicationServiceUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2608:1: ( ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:2609:1: ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:2609:1: ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) )
            // InternalServiceDefinition.g:2610:2: ( rule__CommunicationServiceUsage__NameAssignment_1 )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:2611:2: ( rule__CommunicationServiceUsage__NameAssignment_1 )
            // InternalServiceDefinition.g:2611:3: rule__CommunicationServiceUsage__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsage__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationServiceUsageAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsage__Group__1__Impl"


    // $ANTLR start "rule__CommunicationServiceUsage__Group__2"
    // InternalServiceDefinition.g:2619:1: rule__CommunicationServiceUsage__Group__2 : rule__CommunicationServiceUsage__Group__2__Impl rule__CommunicationServiceUsage__Group__3 ;
    public final void rule__CommunicationServiceUsage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2623:1: ( rule__CommunicationServiceUsage__Group__2__Impl rule__CommunicationServiceUsage__Group__3 )
            // InternalServiceDefinition.g:2624:2: rule__CommunicationServiceUsage__Group__2__Impl rule__CommunicationServiceUsage__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__CommunicationServiceUsage__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsage__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsage__Group__2"


    // $ANTLR start "rule__CommunicationServiceUsage__Group__2__Impl"
    // InternalServiceDefinition.g:2631:1: rule__CommunicationServiceUsage__Group__2__Impl : ( 'uses' ) ;
    public final void rule__CommunicationServiceUsage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2635:1: ( ( 'uses' ) )
            // InternalServiceDefinition.g:2636:1: ( 'uses' )
            {
            // InternalServiceDefinition.g:2636:1: ( 'uses' )
            // InternalServiceDefinition.g:2637:2: 'uses'
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getUsesKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCommunicationServiceUsageAccess().getUsesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsage__Group__2__Impl"


    // $ANTLR start "rule__CommunicationServiceUsage__Group__3"
    // InternalServiceDefinition.g:2646:1: rule__CommunicationServiceUsage__Group__3 : rule__CommunicationServiceUsage__Group__3__Impl ;
    public final void rule__CommunicationServiceUsage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2650:1: ( rule__CommunicationServiceUsage__Group__3__Impl )
            // InternalServiceDefinition.g:2651:2: rule__CommunicationServiceUsage__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsage__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsage__Group__3"


    // $ANTLR start "rule__CommunicationServiceUsage__Group__3__Impl"
    // InternalServiceDefinition.g:2657:1: rule__CommunicationServiceUsage__Group__3__Impl : ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) ) ;
    public final void rule__CommunicationServiceUsage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2661:1: ( ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) ) )
            // InternalServiceDefinition.g:2662:1: ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) )
            {
            // InternalServiceDefinition.g:2662:1: ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) )
            // InternalServiceDefinition.g:2663:2: ( rule__CommunicationServiceUsage__UsesAssignment_3 )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getUsesAssignment_3()); 
            // InternalServiceDefinition.g:2664:2: ( rule__CommunicationServiceUsage__UsesAssignment_3 )
            // InternalServiceDefinition.g:2664:3: rule__CommunicationServiceUsage__UsesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsage__UsesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationServiceUsageAccess().getUsesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsage__Group__3__Impl"


    // $ANTLR start "rule__StatePattern__Group__0"
    // InternalServiceDefinition.g:2673:1: rule__StatePattern__Group__0 : rule__StatePattern__Group__0__Impl rule__StatePattern__Group__1 ;
    public final void rule__StatePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2677:1: ( rule__StatePattern__Group__0__Impl rule__StatePattern__Group__1 )
            // InternalServiceDefinition.g:2678:2: rule__StatePattern__Group__0__Impl rule__StatePattern__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__StatePattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__0"


    // $ANTLR start "rule__StatePattern__Group__0__Impl"
    // InternalServiceDefinition.g:2685:1: rule__StatePattern__Group__0__Impl : ( () ) ;
    public final void rule__StatePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2689:1: ( ( () ) )
            // InternalServiceDefinition.g:2690:1: ( () )
            {
            // InternalServiceDefinition.g:2690:1: ( () )
            // InternalServiceDefinition.g:2691:2: ()
            {
             before(grammarAccess.getStatePatternAccess().getStatePatternAction_0()); 
            // InternalServiceDefinition.g:2692:2: ()
            // InternalServiceDefinition.g:2692:3: 
            {
            }

             after(grammarAccess.getStatePatternAccess().getStatePatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__0__Impl"


    // $ANTLR start "rule__StatePattern__Group__1"
    // InternalServiceDefinition.g:2700:1: rule__StatePattern__Group__1 : rule__StatePattern__Group__1__Impl rule__StatePattern__Group__2 ;
    public final void rule__StatePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2704:1: ( rule__StatePattern__Group__1__Impl rule__StatePattern__Group__2 )
            // InternalServiceDefinition.g:2705:2: rule__StatePattern__Group__1__Impl rule__StatePattern__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__StatePattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__1"


    // $ANTLR start "rule__StatePattern__Group__1__Impl"
    // InternalServiceDefinition.g:2712:1: rule__StatePattern__Group__1__Impl : ( 'StatePattern' ) ;
    public final void rule__StatePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2716:1: ( ( 'StatePattern' ) )
            // InternalServiceDefinition.g:2717:1: ( 'StatePattern' )
            {
            // InternalServiceDefinition.g:2717:1: ( 'StatePattern' )
            // InternalServiceDefinition.g:2718:2: 'StatePattern'
            {
             before(grammarAccess.getStatePatternAccess().getStatePatternKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStatePatternAccess().getStatePatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__1__Impl"


    // $ANTLR start "rule__StatePattern__Group__2"
    // InternalServiceDefinition.g:2727:1: rule__StatePattern__Group__2 : rule__StatePattern__Group__2__Impl rule__StatePattern__Group__3 ;
    public final void rule__StatePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2731:1: ( rule__StatePattern__Group__2__Impl rule__StatePattern__Group__3 )
            // InternalServiceDefinition.g:2732:2: rule__StatePattern__Group__2__Impl rule__StatePattern__Group__3
            {
            pushFollow(FOLLOW_28);
            rule__StatePattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__2"


    // $ANTLR start "rule__StatePattern__Group__2__Impl"
    // InternalServiceDefinition.g:2739:1: rule__StatePattern__Group__2__Impl : ( '<' ) ;
    public final void rule__StatePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2743:1: ( ( '<' ) )
            // InternalServiceDefinition.g:2744:1: ( '<' )
            {
            // InternalServiceDefinition.g:2744:1: ( '<' )
            // InternalServiceDefinition.g:2745:2: '<'
            {
             before(grammarAccess.getStatePatternAccess().getLessThanSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStatePatternAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__2__Impl"


    // $ANTLR start "rule__StatePattern__Group__3"
    // InternalServiceDefinition.g:2754:1: rule__StatePattern__Group__3 : rule__StatePattern__Group__3__Impl rule__StatePattern__Group__4 ;
    public final void rule__StatePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2758:1: ( rule__StatePattern__Group__3__Impl rule__StatePattern__Group__4 )
            // InternalServiceDefinition.g:2759:2: rule__StatePattern__Group__3__Impl rule__StatePattern__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__StatePattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__3"


    // $ANTLR start "rule__StatePattern__Group__3__Impl"
    // InternalServiceDefinition.g:2766:1: rule__StatePattern__Group__3__Impl : ( 'lifecycle' ) ;
    public final void rule__StatePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2770:1: ( ( 'lifecycle' ) )
            // InternalServiceDefinition.g:2771:1: ( 'lifecycle' )
            {
            // InternalServiceDefinition.g:2771:1: ( 'lifecycle' )
            // InternalServiceDefinition.g:2772:2: 'lifecycle'
            {
             before(grammarAccess.getStatePatternAccess().getLifecycleKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getStatePatternAccess().getLifecycleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__3__Impl"


    // $ANTLR start "rule__StatePattern__Group__4"
    // InternalServiceDefinition.g:2781:1: rule__StatePattern__Group__4 : rule__StatePattern__Group__4__Impl rule__StatePattern__Group__5 ;
    public final void rule__StatePattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2785:1: ( rule__StatePattern__Group__4__Impl rule__StatePattern__Group__5 )
            // InternalServiceDefinition.g:2786:2: rule__StatePattern__Group__4__Impl rule__StatePattern__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__StatePattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePattern__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__4"


    // $ANTLR start "rule__StatePattern__Group__4__Impl"
    // InternalServiceDefinition.g:2793:1: rule__StatePattern__Group__4__Impl : ( ( rule__StatePattern__LifecycleAssignment_4 ) ) ;
    public final void rule__StatePattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2797:1: ( ( ( rule__StatePattern__LifecycleAssignment_4 ) ) )
            // InternalServiceDefinition.g:2798:1: ( ( rule__StatePattern__LifecycleAssignment_4 ) )
            {
            // InternalServiceDefinition.g:2798:1: ( ( rule__StatePattern__LifecycleAssignment_4 ) )
            // InternalServiceDefinition.g:2799:2: ( rule__StatePattern__LifecycleAssignment_4 )
            {
             before(grammarAccess.getStatePatternAccess().getLifecycleAssignment_4()); 
            // InternalServiceDefinition.g:2800:2: ( rule__StatePattern__LifecycleAssignment_4 )
            // InternalServiceDefinition.g:2800:3: rule__StatePattern__LifecycleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__StatePattern__LifecycleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getStatePatternAccess().getLifecycleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__4__Impl"


    // $ANTLR start "rule__StatePattern__Group__5"
    // InternalServiceDefinition.g:2808:1: rule__StatePattern__Group__5 : rule__StatePattern__Group__5__Impl rule__StatePattern__Group__6 ;
    public final void rule__StatePattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2812:1: ( rule__StatePattern__Group__5__Impl rule__StatePattern__Group__6 )
            // InternalServiceDefinition.g:2813:2: rule__StatePattern__Group__5__Impl rule__StatePattern__Group__6
            {
            pushFollow(FOLLOW_29);
            rule__StatePattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePattern__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__5"


    // $ANTLR start "rule__StatePattern__Group__5__Impl"
    // InternalServiceDefinition.g:2820:1: rule__StatePattern__Group__5__Impl : ( ( rule__StatePattern__Group_5__0 )? ) ;
    public final void rule__StatePattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2824:1: ( ( ( rule__StatePattern__Group_5__0 )? ) )
            // InternalServiceDefinition.g:2825:1: ( ( rule__StatePattern__Group_5__0 )? )
            {
            // InternalServiceDefinition.g:2825:1: ( ( rule__StatePattern__Group_5__0 )? )
            // InternalServiceDefinition.g:2826:2: ( rule__StatePattern__Group_5__0 )?
            {
             before(grammarAccess.getStatePatternAccess().getGroup_5()); 
            // InternalServiceDefinition.g:2827:2: ( rule__StatePattern__Group_5__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalServiceDefinition.g:2827:3: rule__StatePattern__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StatePattern__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStatePatternAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__5__Impl"


    // $ANTLR start "rule__StatePattern__Group__6"
    // InternalServiceDefinition.g:2835:1: rule__StatePattern__Group__6 : rule__StatePattern__Group__6__Impl ;
    public final void rule__StatePattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2839:1: ( rule__StatePattern__Group__6__Impl )
            // InternalServiceDefinition.g:2840:2: rule__StatePattern__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatePattern__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__6"


    // $ANTLR start "rule__StatePattern__Group__6__Impl"
    // InternalServiceDefinition.g:2846:1: rule__StatePattern__Group__6__Impl : ( '>' ) ;
    public final void rule__StatePattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2850:1: ( ( '>' ) )
            // InternalServiceDefinition.g:2851:1: ( '>' )
            {
            // InternalServiceDefinition.g:2851:1: ( '>' )
            // InternalServiceDefinition.g:2852:2: '>'
            {
             before(grammarAccess.getStatePatternAccess().getGreaterThanSignKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStatePatternAccess().getGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group__6__Impl"


    // $ANTLR start "rule__StatePattern__Group_5__0"
    // InternalServiceDefinition.g:2862:1: rule__StatePattern__Group_5__0 : rule__StatePattern__Group_5__0__Impl rule__StatePattern__Group_5__1 ;
    public final void rule__StatePattern__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2866:1: ( rule__StatePattern__Group_5__0__Impl rule__StatePattern__Group_5__1 )
            // InternalServiceDefinition.g:2867:2: rule__StatePattern__Group_5__0__Impl rule__StatePattern__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__StatePattern__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StatePattern__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group_5__0"


    // $ANTLR start "rule__StatePattern__Group_5__0__Impl"
    // InternalServiceDefinition.g:2874:1: rule__StatePattern__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__StatePattern__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2878:1: ( ( 'with' ) )
            // InternalServiceDefinition.g:2879:1: ( 'with' )
            {
            // InternalServiceDefinition.g:2879:1: ( 'with' )
            // InternalServiceDefinition.g:2880:2: 'with'
            {
             before(grammarAccess.getStatePatternAccess().getWithKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getStatePatternAccess().getWithKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group_5__0__Impl"


    // $ANTLR start "rule__StatePattern__Group_5__1"
    // InternalServiceDefinition.g:2889:1: rule__StatePattern__Group_5__1 : rule__StatePattern__Group_5__1__Impl ;
    public final void rule__StatePattern__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2893:1: ( rule__StatePattern__Group_5__1__Impl )
            // InternalServiceDefinition.g:2894:2: rule__StatePattern__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StatePattern__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group_5__1"


    // $ANTLR start "rule__StatePattern__Group_5__1__Impl"
    // InternalServiceDefinition.g:2900:1: rule__StatePattern__Group_5__1__Impl : ( ( rule__StatePattern__ModesAssignment_5_1 ) ) ;
    public final void rule__StatePattern__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2904:1: ( ( ( rule__StatePattern__ModesAssignment_5_1 ) ) )
            // InternalServiceDefinition.g:2905:1: ( ( rule__StatePattern__ModesAssignment_5_1 ) )
            {
            // InternalServiceDefinition.g:2905:1: ( ( rule__StatePattern__ModesAssignment_5_1 ) )
            // InternalServiceDefinition.g:2906:2: ( rule__StatePattern__ModesAssignment_5_1 )
            {
             before(grammarAccess.getStatePatternAccess().getModesAssignment_5_1()); 
            // InternalServiceDefinition.g:2907:2: ( rule__StatePattern__ModesAssignment_5_1 )
            // InternalServiceDefinition.g:2907:3: rule__StatePattern__ModesAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__StatePattern__ModesAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getStatePatternAccess().getModesAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__Group_5__1__Impl"


    // $ANTLR start "rule__ParameterPattern__Group__0"
    // InternalServiceDefinition.g:2916:1: rule__ParameterPattern__Group__0 : rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 ;
    public final void rule__ParameterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2920:1: ( rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 )
            // InternalServiceDefinition.g:2921:2: rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ParameterPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__0"


    // $ANTLR start "rule__ParameterPattern__Group__0__Impl"
    // InternalServiceDefinition.g:2928:1: rule__ParameterPattern__Group__0__Impl : ( () ) ;
    public final void rule__ParameterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2932:1: ( ( () ) )
            // InternalServiceDefinition.g:2933:1: ( () )
            {
            // InternalServiceDefinition.g:2933:1: ( () )
            // InternalServiceDefinition.g:2934:2: ()
            {
             before(grammarAccess.getParameterPatternAccess().getParameterPatternAction_0()); 
            // InternalServiceDefinition.g:2935:2: ()
            // InternalServiceDefinition.g:2935:3: 
            {
            }

             after(grammarAccess.getParameterPatternAccess().getParameterPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__0__Impl"


    // $ANTLR start "rule__ParameterPattern__Group__1"
    // InternalServiceDefinition.g:2943:1: rule__ParameterPattern__Group__1 : rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 ;
    public final void rule__ParameterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2947:1: ( rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 )
            // InternalServiceDefinition.g:2948:2: rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__ParameterPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__1"


    // $ANTLR start "rule__ParameterPattern__Group__1__Impl"
    // InternalServiceDefinition.g:2955:1: rule__ParameterPattern__Group__1__Impl : ( 'ParameterPattern' ) ;
    public final void rule__ParameterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2959:1: ( ( 'ParameterPattern' ) )
            // InternalServiceDefinition.g:2960:1: ( 'ParameterPattern' )
            {
            // InternalServiceDefinition.g:2960:1: ( 'ParameterPattern' )
            // InternalServiceDefinition.g:2961:2: 'ParameterPattern'
            {
             before(grammarAccess.getParameterPatternAccess().getParameterPatternKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParameterPatternAccess().getParameterPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__1__Impl"


    // $ANTLR start "rule__ParameterPattern__Group__2"
    // InternalServiceDefinition.g:2970:1: rule__ParameterPattern__Group__2 : rule__ParameterPattern__Group__2__Impl rule__ParameterPattern__Group__3 ;
    public final void rule__ParameterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2974:1: ( rule__ParameterPattern__Group__2__Impl rule__ParameterPattern__Group__3 )
            // InternalServiceDefinition.g:2975:2: rule__ParameterPattern__Group__2__Impl rule__ParameterPattern__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ParameterPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterPattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__2"


    // $ANTLR start "rule__ParameterPattern__Group__2__Impl"
    // InternalServiceDefinition.g:2982:1: rule__ParameterPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__ParameterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2986:1: ( ( '<' ) )
            // InternalServiceDefinition.g:2987:1: ( '<' )
            {
            // InternalServiceDefinition.g:2987:1: ( '<' )
            // InternalServiceDefinition.g:2988:2: '<'
            {
             before(grammarAccess.getParameterPatternAccess().getLessThanSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getParameterPatternAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__2__Impl"


    // $ANTLR start "rule__ParameterPattern__Group__3"
    // InternalServiceDefinition.g:2997:1: rule__ParameterPattern__Group__3 : rule__ParameterPattern__Group__3__Impl rule__ParameterPattern__Group__4 ;
    public final void rule__ParameterPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3001:1: ( rule__ParameterPattern__Group__3__Impl rule__ParameterPattern__Group__4 )
            // InternalServiceDefinition.g:3002:2: rule__ParameterPattern__Group__3__Impl rule__ParameterPattern__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__ParameterPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterPattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__3"


    // $ANTLR start "rule__ParameterPattern__Group__3__Impl"
    // InternalServiceDefinition.g:3009:1: rule__ParameterPattern__Group__3__Impl : ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) ) ;
    public final void rule__ParameterPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3013:1: ( ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) ) )
            // InternalServiceDefinition.g:3014:1: ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) )
            {
            // InternalServiceDefinition.g:3014:1: ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) )
            // InternalServiceDefinition.g:3015:2: ( rule__ParameterPattern__ParameterSetAssignment_3 )
            {
             before(grammarAccess.getParameterPatternAccess().getParameterSetAssignment_3()); 
            // InternalServiceDefinition.g:3016:2: ( rule__ParameterPattern__ParameterSetAssignment_3 )
            // InternalServiceDefinition.g:3016:3: rule__ParameterPattern__ParameterSetAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ParameterPattern__ParameterSetAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getParameterPatternAccess().getParameterSetAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__3__Impl"


    // $ANTLR start "rule__ParameterPattern__Group__4"
    // InternalServiceDefinition.g:3024:1: rule__ParameterPattern__Group__4 : rule__ParameterPattern__Group__4__Impl ;
    public final void rule__ParameterPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3028:1: ( rule__ParameterPattern__Group__4__Impl )
            // InternalServiceDefinition.g:3029:2: rule__ParameterPattern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterPattern__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__4"


    // $ANTLR start "rule__ParameterPattern__Group__4__Impl"
    // InternalServiceDefinition.g:3035:1: rule__ParameterPattern__Group__4__Impl : ( '>' ) ;
    public final void rule__ParameterPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3039:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3040:1: ( '>' )
            {
            // InternalServiceDefinition.g:3040:1: ( '>' )
            // InternalServiceDefinition.g:3041:2: '>'
            {
             before(grammarAccess.getParameterPatternAccess().getGreaterThanSignKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getParameterPatternAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__Group__4__Impl"


    // $ANTLR start "rule__DynamicWiringPattern__Group__0"
    // InternalServiceDefinition.g:3051:1: rule__DynamicWiringPattern__Group__0 : rule__DynamicWiringPattern__Group__0__Impl rule__DynamicWiringPattern__Group__1 ;
    public final void rule__DynamicWiringPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3055:1: ( rule__DynamicWiringPattern__Group__0__Impl rule__DynamicWiringPattern__Group__1 )
            // InternalServiceDefinition.g:3056:2: rule__DynamicWiringPattern__Group__0__Impl rule__DynamicWiringPattern__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__DynamicWiringPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DynamicWiringPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicWiringPattern__Group__0"


    // $ANTLR start "rule__DynamicWiringPattern__Group__0__Impl"
    // InternalServiceDefinition.g:3063:1: rule__DynamicWiringPattern__Group__0__Impl : ( () ) ;
    public final void rule__DynamicWiringPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3067:1: ( ( () ) )
            // InternalServiceDefinition.g:3068:1: ( () )
            {
            // InternalServiceDefinition.g:3068:1: ( () )
            // InternalServiceDefinition.g:3069:2: ()
            {
             before(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternAction_0()); 
            // InternalServiceDefinition.g:3070:2: ()
            // InternalServiceDefinition.g:3070:3: 
            {
            }

             after(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicWiringPattern__Group__0__Impl"


    // $ANTLR start "rule__DynamicWiringPattern__Group__1"
    // InternalServiceDefinition.g:3078:1: rule__DynamicWiringPattern__Group__1 : rule__DynamicWiringPattern__Group__1__Impl ;
    public final void rule__DynamicWiringPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3082:1: ( rule__DynamicWiringPattern__Group__1__Impl )
            // InternalServiceDefinition.g:3083:2: rule__DynamicWiringPattern__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DynamicWiringPattern__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicWiringPattern__Group__1"


    // $ANTLR start "rule__DynamicWiringPattern__Group__1__Impl"
    // InternalServiceDefinition.g:3089:1: rule__DynamicWiringPattern__Group__1__Impl : ( 'DynamicWiringPattern' ) ;
    public final void rule__DynamicWiringPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3093:1: ( ( 'DynamicWiringPattern' ) )
            // InternalServiceDefinition.g:3094:1: ( 'DynamicWiringPattern' )
            {
            // InternalServiceDefinition.g:3094:1: ( 'DynamicWiringPattern' )
            // InternalServiceDefinition.g:3095:2: 'DynamicWiringPattern'
            {
             before(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternKeyword_1()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DynamicWiringPattern__Group__1__Impl"


    // $ANTLR start "rule__MonitoringPattern__Group__0"
    // InternalServiceDefinition.g:3105:1: rule__MonitoringPattern__Group__0 : rule__MonitoringPattern__Group__0__Impl rule__MonitoringPattern__Group__1 ;
    public final void rule__MonitoringPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3109:1: ( rule__MonitoringPattern__Group__0__Impl rule__MonitoringPattern__Group__1 )
            // InternalServiceDefinition.g:3110:2: rule__MonitoringPattern__Group__0__Impl rule__MonitoringPattern__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__MonitoringPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MonitoringPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringPattern__Group__0"


    // $ANTLR start "rule__MonitoringPattern__Group__0__Impl"
    // InternalServiceDefinition.g:3117:1: rule__MonitoringPattern__Group__0__Impl : ( () ) ;
    public final void rule__MonitoringPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3121:1: ( ( () ) )
            // InternalServiceDefinition.g:3122:1: ( () )
            {
            // InternalServiceDefinition.g:3122:1: ( () )
            // InternalServiceDefinition.g:3123:2: ()
            {
             before(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternAction_0()); 
            // InternalServiceDefinition.g:3124:2: ()
            // InternalServiceDefinition.g:3124:3: 
            {
            }

             after(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringPattern__Group__0__Impl"


    // $ANTLR start "rule__MonitoringPattern__Group__1"
    // InternalServiceDefinition.g:3132:1: rule__MonitoringPattern__Group__1 : rule__MonitoringPattern__Group__1__Impl ;
    public final void rule__MonitoringPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3136:1: ( rule__MonitoringPattern__Group__1__Impl )
            // InternalServiceDefinition.g:3137:2: rule__MonitoringPattern__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MonitoringPattern__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringPattern__Group__1"


    // $ANTLR start "rule__MonitoringPattern__Group__1__Impl"
    // InternalServiceDefinition.g:3143:1: rule__MonitoringPattern__Group__1__Impl : ( 'MonitoringPattern' ) ;
    public final void rule__MonitoringPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3147:1: ( ( 'MonitoringPattern' ) )
            // InternalServiceDefinition.g:3148:1: ( 'MonitoringPattern' )
            {
            // InternalServiceDefinition.g:3148:1: ( 'MonitoringPattern' )
            // InternalServiceDefinition.g:3149:2: 'MonitoringPattern'
            {
             before(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MonitoringPattern__Group__1__Impl"


    // $ANTLR start "rule__PushPattern__Group__0"
    // InternalServiceDefinition.g:3159:1: rule__PushPattern__Group__0 : rule__PushPattern__Group__0__Impl rule__PushPattern__Group__1 ;
    public final void rule__PushPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3163:1: ( rule__PushPattern__Group__0__Impl rule__PushPattern__Group__1 )
            // InternalServiceDefinition.g:3164:2: rule__PushPattern__Group__0__Impl rule__PushPattern__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__PushPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PushPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__0"


    // $ANTLR start "rule__PushPattern__Group__0__Impl"
    // InternalServiceDefinition.g:3171:1: rule__PushPattern__Group__0__Impl : ( () ) ;
    public final void rule__PushPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3175:1: ( ( () ) )
            // InternalServiceDefinition.g:3176:1: ( () )
            {
            // InternalServiceDefinition.g:3176:1: ( () )
            // InternalServiceDefinition.g:3177:2: ()
            {
             before(grammarAccess.getPushPatternAccess().getPushPatternAction_0()); 
            // InternalServiceDefinition.g:3178:2: ()
            // InternalServiceDefinition.g:3178:3: 
            {
            }

             after(grammarAccess.getPushPatternAccess().getPushPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__0__Impl"


    // $ANTLR start "rule__PushPattern__Group__1"
    // InternalServiceDefinition.g:3186:1: rule__PushPattern__Group__1 : rule__PushPattern__Group__1__Impl rule__PushPattern__Group__2 ;
    public final void rule__PushPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3190:1: ( rule__PushPattern__Group__1__Impl rule__PushPattern__Group__2 )
            // InternalServiceDefinition.g:3191:2: rule__PushPattern__Group__1__Impl rule__PushPattern__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__PushPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PushPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__1"


    // $ANTLR start "rule__PushPattern__Group__1__Impl"
    // InternalServiceDefinition.g:3198:1: rule__PushPattern__Group__1__Impl : ( 'PushPattern' ) ;
    public final void rule__PushPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3202:1: ( ( 'PushPattern' ) )
            // InternalServiceDefinition.g:3203:1: ( 'PushPattern' )
            {
            // InternalServiceDefinition.g:3203:1: ( 'PushPattern' )
            // InternalServiceDefinition.g:3204:2: 'PushPattern'
            {
             before(grammarAccess.getPushPatternAccess().getPushPatternKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPushPatternAccess().getPushPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__1__Impl"


    // $ANTLR start "rule__PushPattern__Group__2"
    // InternalServiceDefinition.g:3213:1: rule__PushPattern__Group__2 : rule__PushPattern__Group__2__Impl rule__PushPattern__Group__3 ;
    public final void rule__PushPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3217:1: ( rule__PushPattern__Group__2__Impl rule__PushPattern__Group__3 )
            // InternalServiceDefinition.g:3218:2: rule__PushPattern__Group__2__Impl rule__PushPattern__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__PushPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PushPattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__2"


    // $ANTLR start "rule__PushPattern__Group__2__Impl"
    // InternalServiceDefinition.g:3225:1: rule__PushPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__PushPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3229:1: ( ( '<' ) )
            // InternalServiceDefinition.g:3230:1: ( '<' )
            {
            // InternalServiceDefinition.g:3230:1: ( '<' )
            // InternalServiceDefinition.g:3231:2: '<'
            {
             before(grammarAccess.getPushPatternAccess().getLessThanSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPushPatternAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__2__Impl"


    // $ANTLR start "rule__PushPattern__Group__3"
    // InternalServiceDefinition.g:3240:1: rule__PushPattern__Group__3 : rule__PushPattern__Group__3__Impl rule__PushPattern__Group__4 ;
    public final void rule__PushPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3244:1: ( rule__PushPattern__Group__3__Impl rule__PushPattern__Group__4 )
            // InternalServiceDefinition.g:3245:2: rule__PushPattern__Group__3__Impl rule__PushPattern__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__PushPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PushPattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__3"


    // $ANTLR start "rule__PushPattern__Group__3__Impl"
    // InternalServiceDefinition.g:3252:1: rule__PushPattern__Group__3__Impl : ( 'DataType' ) ;
    public final void rule__PushPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3256:1: ( ( 'DataType' ) )
            // InternalServiceDefinition.g:3257:1: ( 'DataType' )
            {
            // InternalServiceDefinition.g:3257:1: ( 'DataType' )
            // InternalServiceDefinition.g:3258:2: 'DataType'
            {
             before(grammarAccess.getPushPatternAccess().getDataTypeKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPushPatternAccess().getDataTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__3__Impl"


    // $ANTLR start "rule__PushPattern__Group__4"
    // InternalServiceDefinition.g:3267:1: rule__PushPattern__Group__4 : rule__PushPattern__Group__4__Impl rule__PushPattern__Group__5 ;
    public final void rule__PushPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3271:1: ( rule__PushPattern__Group__4__Impl rule__PushPattern__Group__5 )
            // InternalServiceDefinition.g:3272:2: rule__PushPattern__Group__4__Impl rule__PushPattern__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__PushPattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PushPattern__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__4"


    // $ANTLR start "rule__PushPattern__Group__4__Impl"
    // InternalServiceDefinition.g:3279:1: rule__PushPattern__Group__4__Impl : ( '=' ) ;
    public final void rule__PushPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3283:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3284:1: ( '=' )
            {
            // InternalServiceDefinition.g:3284:1: ( '=' )
            // InternalServiceDefinition.g:3285:2: '='
            {
             before(grammarAccess.getPushPatternAccess().getEqualsSignKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPushPatternAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__4__Impl"


    // $ANTLR start "rule__PushPattern__Group__5"
    // InternalServiceDefinition.g:3294:1: rule__PushPattern__Group__5 : rule__PushPattern__Group__5__Impl rule__PushPattern__Group__6 ;
    public final void rule__PushPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3298:1: ( rule__PushPattern__Group__5__Impl rule__PushPattern__Group__6 )
            // InternalServiceDefinition.g:3299:2: rule__PushPattern__Group__5__Impl rule__PushPattern__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__PushPattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PushPattern__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__5"


    // $ANTLR start "rule__PushPattern__Group__5__Impl"
    // InternalServiceDefinition.g:3306:1: rule__PushPattern__Group__5__Impl : ( ( rule__PushPattern__DataTypeAssignment_5 ) ) ;
    public final void rule__PushPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3310:1: ( ( ( rule__PushPattern__DataTypeAssignment_5 ) ) )
            // InternalServiceDefinition.g:3311:1: ( ( rule__PushPattern__DataTypeAssignment_5 ) )
            {
            // InternalServiceDefinition.g:3311:1: ( ( rule__PushPattern__DataTypeAssignment_5 ) )
            // InternalServiceDefinition.g:3312:2: ( rule__PushPattern__DataTypeAssignment_5 )
            {
             before(grammarAccess.getPushPatternAccess().getDataTypeAssignment_5()); 
            // InternalServiceDefinition.g:3313:2: ( rule__PushPattern__DataTypeAssignment_5 )
            // InternalServiceDefinition.g:3313:3: rule__PushPattern__DataTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__PushPattern__DataTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPushPatternAccess().getDataTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__5__Impl"


    // $ANTLR start "rule__PushPattern__Group__6"
    // InternalServiceDefinition.g:3321:1: rule__PushPattern__Group__6 : rule__PushPattern__Group__6__Impl ;
    public final void rule__PushPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3325:1: ( rule__PushPattern__Group__6__Impl )
            // InternalServiceDefinition.g:3326:2: rule__PushPattern__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PushPattern__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__6"


    // $ANTLR start "rule__PushPattern__Group__6__Impl"
    // InternalServiceDefinition.g:3332:1: rule__PushPattern__Group__6__Impl : ( '>' ) ;
    public final void rule__PushPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3336:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3337:1: ( '>' )
            {
            // InternalServiceDefinition.g:3337:1: ( '>' )
            // InternalServiceDefinition.g:3338:2: '>'
            {
             before(grammarAccess.getPushPatternAccess().getGreaterThanSignKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPushPatternAccess().getGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__Group__6__Impl"


    // $ANTLR start "rule__EventPattern__Group__0"
    // InternalServiceDefinition.g:3348:1: rule__EventPattern__Group__0 : rule__EventPattern__Group__0__Impl rule__EventPattern__Group__1 ;
    public final void rule__EventPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3352:1: ( rule__EventPattern__Group__0__Impl rule__EventPattern__Group__1 )
            // InternalServiceDefinition.g:3353:2: rule__EventPattern__Group__0__Impl rule__EventPattern__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__EventPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group__0"


    // $ANTLR start "rule__EventPattern__Group__0__Impl"
    // InternalServiceDefinition.g:3360:1: rule__EventPattern__Group__0__Impl : ( () ) ;
    public final void rule__EventPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3364:1: ( ( () ) )
            // InternalServiceDefinition.g:3365:1: ( () )
            {
            // InternalServiceDefinition.g:3365:1: ( () )
            // InternalServiceDefinition.g:3366:2: ()
            {
             before(grammarAccess.getEventPatternAccess().getEventPatternAction_0()); 
            // InternalServiceDefinition.g:3367:2: ()
            // InternalServiceDefinition.g:3367:3: 
            {
            }

             after(grammarAccess.getEventPatternAccess().getEventPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group__0__Impl"


    // $ANTLR start "rule__EventPattern__Group__1"
    // InternalServiceDefinition.g:3375:1: rule__EventPattern__Group__1 : rule__EventPattern__Group__1__Impl rule__EventPattern__Group__2 ;
    public final void rule__EventPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3379:1: ( rule__EventPattern__Group__1__Impl rule__EventPattern__Group__2 )
            // InternalServiceDefinition.g:3380:2: rule__EventPattern__Group__1__Impl rule__EventPattern__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__EventPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group__1"


    // $ANTLR start "rule__EventPattern__Group__1__Impl"
    // InternalServiceDefinition.g:3387:1: rule__EventPattern__Group__1__Impl : ( 'EventPattern' ) ;
    public final void rule__EventPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3391:1: ( ( 'EventPattern' ) )
            // InternalServiceDefinition.g:3392:1: ( 'EventPattern' )
            {
            // InternalServiceDefinition.g:3392:1: ( 'EventPattern' )
            // InternalServiceDefinition.g:3393:2: 'EventPattern'
            {
             before(grammarAccess.getEventPatternAccess().getEventPatternKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getEventPatternAccess().getEventPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group__1__Impl"


    // $ANTLR start "rule__EventPattern__Group__2"
    // InternalServiceDefinition.g:3402:1: rule__EventPattern__Group__2 : rule__EventPattern__Group__2__Impl rule__EventPattern__Group__3 ;
    public final void rule__EventPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3406:1: ( rule__EventPattern__Group__2__Impl rule__EventPattern__Group__3 )
            // InternalServiceDefinition.g:3407:2: rule__EventPattern__Group__2__Impl rule__EventPattern__Group__3
            {
            pushFollow(FOLLOW_36);
            rule__EventPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventPattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group__2"


    // $ANTLR start "rule__EventPattern__Group__2__Impl"
    // InternalServiceDefinition.g:3414:1: rule__EventPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__EventPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3418:1: ( ( '<' ) )
            // InternalServiceDefinition.g:3419:1: ( '<' )
            {
            // InternalServiceDefinition.g:3419:1: ( '<' )
            // InternalServiceDefinition.g:3420:2: '<'
            {
             before(grammarAccess.getEventPatternAccess().getLessThanSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getEventPatternAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group__2__Impl"


    // $ANTLR start "rule__EventPattern__Group__3"
    // InternalServiceDefinition.g:3429:1: rule__EventPattern__Group__3 : rule__EventPattern__Group__3__Impl rule__EventPattern__Group__4 ;
    public final void rule__EventPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3433:1: ( rule__EventPattern__Group__3__Impl rule__EventPattern__Group__4 )
            // InternalServiceDefinition.g:3434:2: rule__EventPattern__Group__3__Impl rule__EventPattern__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__EventPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventPattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group__3"


    // $ANTLR start "rule__EventPattern__Group__3__Impl"
    // InternalServiceDefinition.g:3441:1: rule__EventPattern__Group__3__Impl : ( ( rule__EventPattern__UnorderedGroup_3 ) ) ;
    public final void rule__EventPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3445:1: ( ( ( rule__EventPattern__UnorderedGroup_3 ) ) )
            // InternalServiceDefinition.g:3446:1: ( ( rule__EventPattern__UnorderedGroup_3 ) )
            {
            // InternalServiceDefinition.g:3446:1: ( ( rule__EventPattern__UnorderedGroup_3 ) )
            // InternalServiceDefinition.g:3447:2: ( rule__EventPattern__UnorderedGroup_3 )
            {
             before(grammarAccess.getEventPatternAccess().getUnorderedGroup_3()); 
            // InternalServiceDefinition.g:3448:2: ( rule__EventPattern__UnorderedGroup_3 )
            // InternalServiceDefinition.g:3448:3: rule__EventPattern__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__EventPattern__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getEventPatternAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group__3__Impl"


    // $ANTLR start "rule__EventPattern__Group__4"
    // InternalServiceDefinition.g:3456:1: rule__EventPattern__Group__4 : rule__EventPattern__Group__4__Impl ;
    public final void rule__EventPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3460:1: ( rule__EventPattern__Group__4__Impl )
            // InternalServiceDefinition.g:3461:2: rule__EventPattern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventPattern__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group__4"


    // $ANTLR start "rule__EventPattern__Group__4__Impl"
    // InternalServiceDefinition.g:3467:1: rule__EventPattern__Group__4__Impl : ( '>' ) ;
    public final void rule__EventPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3471:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3472:1: ( '>' )
            {
            // InternalServiceDefinition.g:3472:1: ( '>' )
            // InternalServiceDefinition.g:3473:2: '>'
            {
             before(grammarAccess.getEventPatternAccess().getGreaterThanSignKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEventPatternAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group__4__Impl"


    // $ANTLR start "rule__EventPattern__Group_3_0__0"
    // InternalServiceDefinition.g:3483:1: rule__EventPattern__Group_3_0__0 : rule__EventPattern__Group_3_0__0__Impl rule__EventPattern__Group_3_0__1 ;
    public final void rule__EventPattern__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3487:1: ( rule__EventPattern__Group_3_0__0__Impl rule__EventPattern__Group_3_0__1 )
            // InternalServiceDefinition.g:3488:2: rule__EventPattern__Group_3_0__0__Impl rule__EventPattern__Group_3_0__1
            {
            pushFollow(FOLLOW_35);
            rule__EventPattern__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventPattern__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_0__0"


    // $ANTLR start "rule__EventPattern__Group_3_0__0__Impl"
    // InternalServiceDefinition.g:3495:1: rule__EventPattern__Group_3_0__0__Impl : ( 'EventType' ) ;
    public final void rule__EventPattern__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3499:1: ( ( 'EventType' ) )
            // InternalServiceDefinition.g:3500:1: ( 'EventType' )
            {
            // InternalServiceDefinition.g:3500:1: ( 'EventType' )
            // InternalServiceDefinition.g:3501:2: 'EventType'
            {
             before(grammarAccess.getEventPatternAccess().getEventTypeKeyword_3_0_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getEventPatternAccess().getEventTypeKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_0__0__Impl"


    // $ANTLR start "rule__EventPattern__Group_3_0__1"
    // InternalServiceDefinition.g:3510:1: rule__EventPattern__Group_3_0__1 : rule__EventPattern__Group_3_0__1__Impl rule__EventPattern__Group_3_0__2 ;
    public final void rule__EventPattern__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3514:1: ( rule__EventPattern__Group_3_0__1__Impl rule__EventPattern__Group_3_0__2 )
            // InternalServiceDefinition.g:3515:2: rule__EventPattern__Group_3_0__1__Impl rule__EventPattern__Group_3_0__2
            {
            pushFollow(FOLLOW_7);
            rule__EventPattern__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventPattern__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_0__1"


    // $ANTLR start "rule__EventPattern__Group_3_0__1__Impl"
    // InternalServiceDefinition.g:3522:1: rule__EventPattern__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__EventPattern__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3526:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3527:1: ( '=' )
            {
            // InternalServiceDefinition.g:3527:1: ( '=' )
            // InternalServiceDefinition.g:3528:2: '='
            {
             before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_0__1__Impl"


    // $ANTLR start "rule__EventPattern__Group_3_0__2"
    // InternalServiceDefinition.g:3537:1: rule__EventPattern__Group_3_0__2 : rule__EventPattern__Group_3_0__2__Impl ;
    public final void rule__EventPattern__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3541:1: ( rule__EventPattern__Group_3_0__2__Impl )
            // InternalServiceDefinition.g:3542:2: rule__EventPattern__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventPattern__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_0__2"


    // $ANTLR start "rule__EventPattern__Group_3_0__2__Impl"
    // InternalServiceDefinition.g:3548:1: rule__EventPattern__Group_3_0__2__Impl : ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) ) ;
    public final void rule__EventPattern__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3552:1: ( ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) ) )
            // InternalServiceDefinition.g:3553:1: ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) )
            {
            // InternalServiceDefinition.g:3553:1: ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) )
            // InternalServiceDefinition.g:3554:2: ( rule__EventPattern__EventTypeAssignment_3_0_2 )
            {
             before(grammarAccess.getEventPatternAccess().getEventTypeAssignment_3_0_2()); 
            // InternalServiceDefinition.g:3555:2: ( rule__EventPattern__EventTypeAssignment_3_0_2 )
            // InternalServiceDefinition.g:3555:3: rule__EventPattern__EventTypeAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__EventPattern__EventTypeAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEventPatternAccess().getEventTypeAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_0__2__Impl"


    // $ANTLR start "rule__EventPattern__Group_3_1__0"
    // InternalServiceDefinition.g:3564:1: rule__EventPattern__Group_3_1__0 : rule__EventPattern__Group_3_1__0__Impl rule__EventPattern__Group_3_1__1 ;
    public final void rule__EventPattern__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3568:1: ( rule__EventPattern__Group_3_1__0__Impl rule__EventPattern__Group_3_1__1 )
            // InternalServiceDefinition.g:3569:2: rule__EventPattern__Group_3_1__0__Impl rule__EventPattern__Group_3_1__1
            {
            pushFollow(FOLLOW_35);
            rule__EventPattern__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventPattern__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_1__0"


    // $ANTLR start "rule__EventPattern__Group_3_1__0__Impl"
    // InternalServiceDefinition.g:3576:1: rule__EventPattern__Group_3_1__0__Impl : ( 'ActivationType' ) ;
    public final void rule__EventPattern__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3580:1: ( ( 'ActivationType' ) )
            // InternalServiceDefinition.g:3581:1: ( 'ActivationType' )
            {
            // InternalServiceDefinition.g:3581:1: ( 'ActivationType' )
            // InternalServiceDefinition.g:3582:2: 'ActivationType'
            {
             before(grammarAccess.getEventPatternAccess().getActivationTypeKeyword_3_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEventPatternAccess().getActivationTypeKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_1__0__Impl"


    // $ANTLR start "rule__EventPattern__Group_3_1__1"
    // InternalServiceDefinition.g:3591:1: rule__EventPattern__Group_3_1__1 : rule__EventPattern__Group_3_1__1__Impl rule__EventPattern__Group_3_1__2 ;
    public final void rule__EventPattern__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3595:1: ( rule__EventPattern__Group_3_1__1__Impl rule__EventPattern__Group_3_1__2 )
            // InternalServiceDefinition.g:3596:2: rule__EventPattern__Group_3_1__1__Impl rule__EventPattern__Group_3_1__2
            {
            pushFollow(FOLLOW_7);
            rule__EventPattern__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventPattern__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_1__1"


    // $ANTLR start "rule__EventPattern__Group_3_1__1__Impl"
    // InternalServiceDefinition.g:3603:1: rule__EventPattern__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__EventPattern__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3607:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3608:1: ( '=' )
            {
            // InternalServiceDefinition.g:3608:1: ( '=' )
            // InternalServiceDefinition.g:3609:2: '='
            {
             before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_1__1__Impl"


    // $ANTLR start "rule__EventPattern__Group_3_1__2"
    // InternalServiceDefinition.g:3618:1: rule__EventPattern__Group_3_1__2 : rule__EventPattern__Group_3_1__2__Impl ;
    public final void rule__EventPattern__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3622:1: ( rule__EventPattern__Group_3_1__2__Impl )
            // InternalServiceDefinition.g:3623:2: rule__EventPattern__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventPattern__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_1__2"


    // $ANTLR start "rule__EventPattern__Group_3_1__2__Impl"
    // InternalServiceDefinition.g:3629:1: rule__EventPattern__Group_3_1__2__Impl : ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) ) ;
    public final void rule__EventPattern__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3633:1: ( ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) ) )
            // InternalServiceDefinition.g:3634:1: ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) )
            {
            // InternalServiceDefinition.g:3634:1: ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) )
            // InternalServiceDefinition.g:3635:2: ( rule__EventPattern__ActivationTypeAssignment_3_1_2 )
            {
             before(grammarAccess.getEventPatternAccess().getActivationTypeAssignment_3_1_2()); 
            // InternalServiceDefinition.g:3636:2: ( rule__EventPattern__ActivationTypeAssignment_3_1_2 )
            // InternalServiceDefinition.g:3636:3: rule__EventPattern__ActivationTypeAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__EventPattern__ActivationTypeAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEventPatternAccess().getActivationTypeAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_1__2__Impl"


    // $ANTLR start "rule__EventPattern__Group_3_2__0"
    // InternalServiceDefinition.g:3645:1: rule__EventPattern__Group_3_2__0 : rule__EventPattern__Group_3_2__0__Impl rule__EventPattern__Group_3_2__1 ;
    public final void rule__EventPattern__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3649:1: ( rule__EventPattern__Group_3_2__0__Impl rule__EventPattern__Group_3_2__1 )
            // InternalServiceDefinition.g:3650:2: rule__EventPattern__Group_3_2__0__Impl rule__EventPattern__Group_3_2__1
            {
            pushFollow(FOLLOW_35);
            rule__EventPattern__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventPattern__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_2__0"


    // $ANTLR start "rule__EventPattern__Group_3_2__0__Impl"
    // InternalServiceDefinition.g:3657:1: rule__EventPattern__Group_3_2__0__Impl : ( 'EventStateType' ) ;
    public final void rule__EventPattern__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3661:1: ( ( 'EventStateType' ) )
            // InternalServiceDefinition.g:3662:1: ( 'EventStateType' )
            {
            // InternalServiceDefinition.g:3662:1: ( 'EventStateType' )
            // InternalServiceDefinition.g:3663:2: 'EventStateType'
            {
             before(grammarAccess.getEventPatternAccess().getEventStateTypeKeyword_3_2_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEventPatternAccess().getEventStateTypeKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_2__0__Impl"


    // $ANTLR start "rule__EventPattern__Group_3_2__1"
    // InternalServiceDefinition.g:3672:1: rule__EventPattern__Group_3_2__1 : rule__EventPattern__Group_3_2__1__Impl rule__EventPattern__Group_3_2__2 ;
    public final void rule__EventPattern__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3676:1: ( rule__EventPattern__Group_3_2__1__Impl rule__EventPattern__Group_3_2__2 )
            // InternalServiceDefinition.g:3677:2: rule__EventPattern__Group_3_2__1__Impl rule__EventPattern__Group_3_2__2
            {
            pushFollow(FOLLOW_7);
            rule__EventPattern__Group_3_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventPattern__Group_3_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_2__1"


    // $ANTLR start "rule__EventPattern__Group_3_2__1__Impl"
    // InternalServiceDefinition.g:3684:1: rule__EventPattern__Group_3_2__1__Impl : ( '=' ) ;
    public final void rule__EventPattern__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3688:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3689:1: ( '=' )
            {
            // InternalServiceDefinition.g:3689:1: ( '=' )
            // InternalServiceDefinition.g:3690:2: '='
            {
             before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_2_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_2__1__Impl"


    // $ANTLR start "rule__EventPattern__Group_3_2__2"
    // InternalServiceDefinition.g:3699:1: rule__EventPattern__Group_3_2__2 : rule__EventPattern__Group_3_2__2__Impl ;
    public final void rule__EventPattern__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3703:1: ( rule__EventPattern__Group_3_2__2__Impl )
            // InternalServiceDefinition.g:3704:2: rule__EventPattern__Group_3_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventPattern__Group_3_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_2__2"


    // $ANTLR start "rule__EventPattern__Group_3_2__2__Impl"
    // InternalServiceDefinition.g:3710:1: rule__EventPattern__Group_3_2__2__Impl : ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) ) ;
    public final void rule__EventPattern__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3714:1: ( ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) ) )
            // InternalServiceDefinition.g:3715:1: ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) )
            {
            // InternalServiceDefinition.g:3715:1: ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) )
            // InternalServiceDefinition.g:3716:2: ( rule__EventPattern__EventStateTypeAssignment_3_2_2 )
            {
             before(grammarAccess.getEventPatternAccess().getEventStateTypeAssignment_3_2_2()); 
            // InternalServiceDefinition.g:3717:2: ( rule__EventPattern__EventStateTypeAssignment_3_2_2 )
            // InternalServiceDefinition.g:3717:3: rule__EventPattern__EventStateTypeAssignment_3_2_2
            {
            pushFollow(FOLLOW_2);
            rule__EventPattern__EventStateTypeAssignment_3_2_2();

            state._fsp--;


            }

             after(grammarAccess.getEventPatternAccess().getEventStateTypeAssignment_3_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__Group_3_2__2__Impl"


    // $ANTLR start "rule__QueryPattern__Group__0"
    // InternalServiceDefinition.g:3726:1: rule__QueryPattern__Group__0 : rule__QueryPattern__Group__0__Impl rule__QueryPattern__Group__1 ;
    public final void rule__QueryPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3730:1: ( rule__QueryPattern__Group__0__Impl rule__QueryPattern__Group__1 )
            // InternalServiceDefinition.g:3731:2: rule__QueryPattern__Group__0__Impl rule__QueryPattern__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__QueryPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group__0"


    // $ANTLR start "rule__QueryPattern__Group__0__Impl"
    // InternalServiceDefinition.g:3738:1: rule__QueryPattern__Group__0__Impl : ( () ) ;
    public final void rule__QueryPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3742:1: ( ( () ) )
            // InternalServiceDefinition.g:3743:1: ( () )
            {
            // InternalServiceDefinition.g:3743:1: ( () )
            // InternalServiceDefinition.g:3744:2: ()
            {
             before(grammarAccess.getQueryPatternAccess().getQueryPatternAction_0()); 
            // InternalServiceDefinition.g:3745:2: ()
            // InternalServiceDefinition.g:3745:3: 
            {
            }

             after(grammarAccess.getQueryPatternAccess().getQueryPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group__0__Impl"


    // $ANTLR start "rule__QueryPattern__Group__1"
    // InternalServiceDefinition.g:3753:1: rule__QueryPattern__Group__1 : rule__QueryPattern__Group__1__Impl rule__QueryPattern__Group__2 ;
    public final void rule__QueryPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3757:1: ( rule__QueryPattern__Group__1__Impl rule__QueryPattern__Group__2 )
            // InternalServiceDefinition.g:3758:2: rule__QueryPattern__Group__1__Impl rule__QueryPattern__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__QueryPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group__1"


    // $ANTLR start "rule__QueryPattern__Group__1__Impl"
    // InternalServiceDefinition.g:3765:1: rule__QueryPattern__Group__1__Impl : ( 'QueryPattern' ) ;
    public final void rule__QueryPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3769:1: ( ( 'QueryPattern' ) )
            // InternalServiceDefinition.g:3770:1: ( 'QueryPattern' )
            {
            // InternalServiceDefinition.g:3770:1: ( 'QueryPattern' )
            // InternalServiceDefinition.g:3771:2: 'QueryPattern'
            {
             before(grammarAccess.getQueryPatternAccess().getQueryPatternKeyword_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getQueryPatternAccess().getQueryPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group__1__Impl"


    // $ANTLR start "rule__QueryPattern__Group__2"
    // InternalServiceDefinition.g:3780:1: rule__QueryPattern__Group__2 : rule__QueryPattern__Group__2__Impl rule__QueryPattern__Group__3 ;
    public final void rule__QueryPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3784:1: ( rule__QueryPattern__Group__2__Impl rule__QueryPattern__Group__3 )
            // InternalServiceDefinition.g:3785:2: rule__QueryPattern__Group__2__Impl rule__QueryPattern__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__QueryPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group__2"


    // $ANTLR start "rule__QueryPattern__Group__2__Impl"
    // InternalServiceDefinition.g:3792:1: rule__QueryPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__QueryPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3796:1: ( ( '<' ) )
            // InternalServiceDefinition.g:3797:1: ( '<' )
            {
            // InternalServiceDefinition.g:3797:1: ( '<' )
            // InternalServiceDefinition.g:3798:2: '<'
            {
             before(grammarAccess.getQueryPatternAccess().getLessThanSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getQueryPatternAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group__2__Impl"


    // $ANTLR start "rule__QueryPattern__Group__3"
    // InternalServiceDefinition.g:3807:1: rule__QueryPattern__Group__3 : rule__QueryPattern__Group__3__Impl rule__QueryPattern__Group__4 ;
    public final void rule__QueryPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3811:1: ( rule__QueryPattern__Group__3__Impl rule__QueryPattern__Group__4 )
            // InternalServiceDefinition.g:3812:2: rule__QueryPattern__Group__3__Impl rule__QueryPattern__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__QueryPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group__3"


    // $ANTLR start "rule__QueryPattern__Group__3__Impl"
    // InternalServiceDefinition.g:3819:1: rule__QueryPattern__Group__3__Impl : ( ( rule__QueryPattern__UnorderedGroup_3 ) ) ;
    public final void rule__QueryPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3823:1: ( ( ( rule__QueryPattern__UnorderedGroup_3 ) ) )
            // InternalServiceDefinition.g:3824:1: ( ( rule__QueryPattern__UnorderedGroup_3 ) )
            {
            // InternalServiceDefinition.g:3824:1: ( ( rule__QueryPattern__UnorderedGroup_3 ) )
            // InternalServiceDefinition.g:3825:2: ( rule__QueryPattern__UnorderedGroup_3 )
            {
             before(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3()); 
            // InternalServiceDefinition.g:3826:2: ( rule__QueryPattern__UnorderedGroup_3 )
            // InternalServiceDefinition.g:3826:3: rule__QueryPattern__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__QueryPattern__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group__3__Impl"


    // $ANTLR start "rule__QueryPattern__Group__4"
    // InternalServiceDefinition.g:3834:1: rule__QueryPattern__Group__4 : rule__QueryPattern__Group__4__Impl ;
    public final void rule__QueryPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3838:1: ( rule__QueryPattern__Group__4__Impl )
            // InternalServiceDefinition.g:3839:2: rule__QueryPattern__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group__4"


    // $ANTLR start "rule__QueryPattern__Group__4__Impl"
    // InternalServiceDefinition.g:3845:1: rule__QueryPattern__Group__4__Impl : ( '>' ) ;
    public final void rule__QueryPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3849:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3850:1: ( '>' )
            {
            // InternalServiceDefinition.g:3850:1: ( '>' )
            // InternalServiceDefinition.g:3851:2: '>'
            {
             before(grammarAccess.getQueryPatternAccess().getGreaterThanSignKeyword_4()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getQueryPatternAccess().getGreaterThanSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group__4__Impl"


    // $ANTLR start "rule__QueryPattern__Group_3_0__0"
    // InternalServiceDefinition.g:3861:1: rule__QueryPattern__Group_3_0__0 : rule__QueryPattern__Group_3_0__0__Impl rule__QueryPattern__Group_3_0__1 ;
    public final void rule__QueryPattern__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3865:1: ( rule__QueryPattern__Group_3_0__0__Impl rule__QueryPattern__Group_3_0__1 )
            // InternalServiceDefinition.g:3866:2: rule__QueryPattern__Group_3_0__0__Impl rule__QueryPattern__Group_3_0__1
            {
            pushFollow(FOLLOW_35);
            rule__QueryPattern__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_0__0"


    // $ANTLR start "rule__QueryPattern__Group_3_0__0__Impl"
    // InternalServiceDefinition.g:3873:1: rule__QueryPattern__Group_3_0__0__Impl : ( 'RequestType' ) ;
    public final void rule__QueryPattern__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3877:1: ( ( 'RequestType' ) )
            // InternalServiceDefinition.g:3878:1: ( 'RequestType' )
            {
            // InternalServiceDefinition.g:3878:1: ( 'RequestType' )
            // InternalServiceDefinition.g:3879:2: 'RequestType'
            {
             before(grammarAccess.getQueryPatternAccess().getRequestTypeKeyword_3_0_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getQueryPatternAccess().getRequestTypeKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_0__0__Impl"


    // $ANTLR start "rule__QueryPattern__Group_3_0__1"
    // InternalServiceDefinition.g:3888:1: rule__QueryPattern__Group_3_0__1 : rule__QueryPattern__Group_3_0__1__Impl rule__QueryPattern__Group_3_0__2 ;
    public final void rule__QueryPattern__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3892:1: ( rule__QueryPattern__Group_3_0__1__Impl rule__QueryPattern__Group_3_0__2 )
            // InternalServiceDefinition.g:3893:2: rule__QueryPattern__Group_3_0__1__Impl rule__QueryPattern__Group_3_0__2
            {
            pushFollow(FOLLOW_7);
            rule__QueryPattern__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_0__1"


    // $ANTLR start "rule__QueryPattern__Group_3_0__1__Impl"
    // InternalServiceDefinition.g:3900:1: rule__QueryPattern__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__QueryPattern__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3904:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3905:1: ( '=' )
            {
            // InternalServiceDefinition.g:3905:1: ( '=' )
            // InternalServiceDefinition.g:3906:2: '='
            {
             before(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_0__1__Impl"


    // $ANTLR start "rule__QueryPattern__Group_3_0__2"
    // InternalServiceDefinition.g:3915:1: rule__QueryPattern__Group_3_0__2 : rule__QueryPattern__Group_3_0__2__Impl ;
    public final void rule__QueryPattern__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3919:1: ( rule__QueryPattern__Group_3_0__2__Impl )
            // InternalServiceDefinition.g:3920:2: rule__QueryPattern__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_0__2"


    // $ANTLR start "rule__QueryPattern__Group_3_0__2__Impl"
    // InternalServiceDefinition.g:3926:1: rule__QueryPattern__Group_3_0__2__Impl : ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) ) ;
    public final void rule__QueryPattern__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3930:1: ( ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) ) )
            // InternalServiceDefinition.g:3931:1: ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) )
            {
            // InternalServiceDefinition.g:3931:1: ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) )
            // InternalServiceDefinition.g:3932:2: ( rule__QueryPattern__RequestTypeAssignment_3_0_2 )
            {
             before(grammarAccess.getQueryPatternAccess().getRequestTypeAssignment_3_0_2()); 
            // InternalServiceDefinition.g:3933:2: ( rule__QueryPattern__RequestTypeAssignment_3_0_2 )
            // InternalServiceDefinition.g:3933:3: rule__QueryPattern__RequestTypeAssignment_3_0_2
            {
            pushFollow(FOLLOW_2);
            rule__QueryPattern__RequestTypeAssignment_3_0_2();

            state._fsp--;


            }

             after(grammarAccess.getQueryPatternAccess().getRequestTypeAssignment_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_0__2__Impl"


    // $ANTLR start "rule__QueryPattern__Group_3_1__0"
    // InternalServiceDefinition.g:3942:1: rule__QueryPattern__Group_3_1__0 : rule__QueryPattern__Group_3_1__0__Impl rule__QueryPattern__Group_3_1__1 ;
    public final void rule__QueryPattern__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3946:1: ( rule__QueryPattern__Group_3_1__0__Impl rule__QueryPattern__Group_3_1__1 )
            // InternalServiceDefinition.g:3947:2: rule__QueryPattern__Group_3_1__0__Impl rule__QueryPattern__Group_3_1__1
            {
            pushFollow(FOLLOW_35);
            rule__QueryPattern__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_1__0"


    // $ANTLR start "rule__QueryPattern__Group_3_1__0__Impl"
    // InternalServiceDefinition.g:3954:1: rule__QueryPattern__Group_3_1__0__Impl : ( 'AnswerType' ) ;
    public final void rule__QueryPattern__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3958:1: ( ( 'AnswerType' ) )
            // InternalServiceDefinition.g:3959:1: ( 'AnswerType' )
            {
            // InternalServiceDefinition.g:3959:1: ( 'AnswerType' )
            // InternalServiceDefinition.g:3960:2: 'AnswerType'
            {
             before(grammarAccess.getQueryPatternAccess().getAnswerTypeKeyword_3_1_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getQueryPatternAccess().getAnswerTypeKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_1__0__Impl"


    // $ANTLR start "rule__QueryPattern__Group_3_1__1"
    // InternalServiceDefinition.g:3969:1: rule__QueryPattern__Group_3_1__1 : rule__QueryPattern__Group_3_1__1__Impl rule__QueryPattern__Group_3_1__2 ;
    public final void rule__QueryPattern__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3973:1: ( rule__QueryPattern__Group_3_1__1__Impl rule__QueryPattern__Group_3_1__2 )
            // InternalServiceDefinition.g:3974:2: rule__QueryPattern__Group_3_1__1__Impl rule__QueryPattern__Group_3_1__2
            {
            pushFollow(FOLLOW_7);
            rule__QueryPattern__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_1__1"


    // $ANTLR start "rule__QueryPattern__Group_3_1__1__Impl"
    // InternalServiceDefinition.g:3981:1: rule__QueryPattern__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__QueryPattern__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3985:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3986:1: ( '=' )
            {
            // InternalServiceDefinition.g:3986:1: ( '=' )
            // InternalServiceDefinition.g:3987:2: '='
            {
             before(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_1__1__Impl"


    // $ANTLR start "rule__QueryPattern__Group_3_1__2"
    // InternalServiceDefinition.g:3996:1: rule__QueryPattern__Group_3_1__2 : rule__QueryPattern__Group_3_1__2__Impl ;
    public final void rule__QueryPattern__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4000:1: ( rule__QueryPattern__Group_3_1__2__Impl )
            // InternalServiceDefinition.g:4001:2: rule__QueryPattern__Group_3_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryPattern__Group_3_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_1__2"


    // $ANTLR start "rule__QueryPattern__Group_3_1__2__Impl"
    // InternalServiceDefinition.g:4007:1: rule__QueryPattern__Group_3_1__2__Impl : ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) ) ;
    public final void rule__QueryPattern__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4011:1: ( ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) ) )
            // InternalServiceDefinition.g:4012:1: ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) )
            {
            // InternalServiceDefinition.g:4012:1: ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) )
            // InternalServiceDefinition.g:4013:2: ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 )
            {
             before(grammarAccess.getQueryPatternAccess().getAnswerTypeAssignment_3_1_2()); 
            // InternalServiceDefinition.g:4014:2: ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 )
            // InternalServiceDefinition.g:4014:3: rule__QueryPattern__AnswerTypeAssignment_3_1_2
            {
            pushFollow(FOLLOW_2);
            rule__QueryPattern__AnswerTypeAssignment_3_1_2();

            state._fsp--;


            }

             after(grammarAccess.getQueryPatternAccess().getAnswerTypeAssignment_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__Group_3_1__2__Impl"


    // $ANTLR start "rule__SendPattern__Group__0"
    // InternalServiceDefinition.g:4023:1: rule__SendPattern__Group__0 : rule__SendPattern__Group__0__Impl rule__SendPattern__Group__1 ;
    public final void rule__SendPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4027:1: ( rule__SendPattern__Group__0__Impl rule__SendPattern__Group__1 )
            // InternalServiceDefinition.g:4028:2: rule__SendPattern__Group__0__Impl rule__SendPattern__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__SendPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendPattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__0"


    // $ANTLR start "rule__SendPattern__Group__0__Impl"
    // InternalServiceDefinition.g:4035:1: rule__SendPattern__Group__0__Impl : ( () ) ;
    public final void rule__SendPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4039:1: ( ( () ) )
            // InternalServiceDefinition.g:4040:1: ( () )
            {
            // InternalServiceDefinition.g:4040:1: ( () )
            // InternalServiceDefinition.g:4041:2: ()
            {
             before(grammarAccess.getSendPatternAccess().getSendPatternAction_0()); 
            // InternalServiceDefinition.g:4042:2: ()
            // InternalServiceDefinition.g:4042:3: 
            {
            }

             after(grammarAccess.getSendPatternAccess().getSendPatternAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__0__Impl"


    // $ANTLR start "rule__SendPattern__Group__1"
    // InternalServiceDefinition.g:4050:1: rule__SendPattern__Group__1 : rule__SendPattern__Group__1__Impl rule__SendPattern__Group__2 ;
    public final void rule__SendPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4054:1: ( rule__SendPattern__Group__1__Impl rule__SendPattern__Group__2 )
            // InternalServiceDefinition.g:4055:2: rule__SendPattern__Group__1__Impl rule__SendPattern__Group__2
            {
            pushFollow(FOLLOW_27);
            rule__SendPattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendPattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__1"


    // $ANTLR start "rule__SendPattern__Group__1__Impl"
    // InternalServiceDefinition.g:4062:1: rule__SendPattern__Group__1__Impl : ( 'SendPattern' ) ;
    public final void rule__SendPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4066:1: ( ( 'SendPattern' ) )
            // InternalServiceDefinition.g:4067:1: ( 'SendPattern' )
            {
            // InternalServiceDefinition.g:4067:1: ( 'SendPattern' )
            // InternalServiceDefinition.g:4068:2: 'SendPattern'
            {
             before(grammarAccess.getSendPatternAccess().getSendPatternKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSendPatternAccess().getSendPatternKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__1__Impl"


    // $ANTLR start "rule__SendPattern__Group__2"
    // InternalServiceDefinition.g:4077:1: rule__SendPattern__Group__2 : rule__SendPattern__Group__2__Impl rule__SendPattern__Group__3 ;
    public final void rule__SendPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4081:1: ( rule__SendPattern__Group__2__Impl rule__SendPattern__Group__3 )
            // InternalServiceDefinition.g:4082:2: rule__SendPattern__Group__2__Impl rule__SendPattern__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__SendPattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendPattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__2"


    // $ANTLR start "rule__SendPattern__Group__2__Impl"
    // InternalServiceDefinition.g:4089:1: rule__SendPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__SendPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4093:1: ( ( '<' ) )
            // InternalServiceDefinition.g:4094:1: ( '<' )
            {
            // InternalServiceDefinition.g:4094:1: ( '<' )
            // InternalServiceDefinition.g:4095:2: '<'
            {
             before(grammarAccess.getSendPatternAccess().getLessThanSignKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSendPatternAccess().getLessThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__2__Impl"


    // $ANTLR start "rule__SendPattern__Group__3"
    // InternalServiceDefinition.g:4104:1: rule__SendPattern__Group__3 : rule__SendPattern__Group__3__Impl rule__SendPattern__Group__4 ;
    public final void rule__SendPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4108:1: ( rule__SendPattern__Group__3__Impl rule__SendPattern__Group__4 )
            // InternalServiceDefinition.g:4109:2: rule__SendPattern__Group__3__Impl rule__SendPattern__Group__4
            {
            pushFollow(FOLLOW_35);
            rule__SendPattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendPattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__3"


    // $ANTLR start "rule__SendPattern__Group__3__Impl"
    // InternalServiceDefinition.g:4116:1: rule__SendPattern__Group__3__Impl : ( 'DataType' ) ;
    public final void rule__SendPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4120:1: ( ( 'DataType' ) )
            // InternalServiceDefinition.g:4121:1: ( 'DataType' )
            {
            // InternalServiceDefinition.g:4121:1: ( 'DataType' )
            // InternalServiceDefinition.g:4122:2: 'DataType'
            {
             before(grammarAccess.getSendPatternAccess().getDataTypeKeyword_3()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getSendPatternAccess().getDataTypeKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__3__Impl"


    // $ANTLR start "rule__SendPattern__Group__4"
    // InternalServiceDefinition.g:4131:1: rule__SendPattern__Group__4 : rule__SendPattern__Group__4__Impl rule__SendPattern__Group__5 ;
    public final void rule__SendPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4135:1: ( rule__SendPattern__Group__4__Impl rule__SendPattern__Group__5 )
            // InternalServiceDefinition.g:4136:2: rule__SendPattern__Group__4__Impl rule__SendPattern__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__SendPattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendPattern__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__4"


    // $ANTLR start "rule__SendPattern__Group__4__Impl"
    // InternalServiceDefinition.g:4143:1: rule__SendPattern__Group__4__Impl : ( '=' ) ;
    public final void rule__SendPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4147:1: ( ( '=' ) )
            // InternalServiceDefinition.g:4148:1: ( '=' )
            {
            // InternalServiceDefinition.g:4148:1: ( '=' )
            // InternalServiceDefinition.g:4149:2: '='
            {
             before(grammarAccess.getSendPatternAccess().getEqualsSignKeyword_4()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSendPatternAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__4__Impl"


    // $ANTLR start "rule__SendPattern__Group__5"
    // InternalServiceDefinition.g:4158:1: rule__SendPattern__Group__5 : rule__SendPattern__Group__5__Impl rule__SendPattern__Group__6 ;
    public final void rule__SendPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4162:1: ( rule__SendPattern__Group__5__Impl rule__SendPattern__Group__6 )
            // InternalServiceDefinition.g:4163:2: rule__SendPattern__Group__5__Impl rule__SendPattern__Group__6
            {
            pushFollow(FOLLOW_31);
            rule__SendPattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SendPattern__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__5"


    // $ANTLR start "rule__SendPattern__Group__5__Impl"
    // InternalServiceDefinition.g:4170:1: rule__SendPattern__Group__5__Impl : ( ( rule__SendPattern__DataTypeAssignment_5 ) ) ;
    public final void rule__SendPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4174:1: ( ( ( rule__SendPattern__DataTypeAssignment_5 ) ) )
            // InternalServiceDefinition.g:4175:1: ( ( rule__SendPattern__DataTypeAssignment_5 ) )
            {
            // InternalServiceDefinition.g:4175:1: ( ( rule__SendPattern__DataTypeAssignment_5 ) )
            // InternalServiceDefinition.g:4176:2: ( rule__SendPattern__DataTypeAssignment_5 )
            {
             before(grammarAccess.getSendPatternAccess().getDataTypeAssignment_5()); 
            // InternalServiceDefinition.g:4177:2: ( rule__SendPattern__DataTypeAssignment_5 )
            // InternalServiceDefinition.g:4177:3: rule__SendPattern__DataTypeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__SendPattern__DataTypeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getSendPatternAccess().getDataTypeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__5__Impl"


    // $ANTLR start "rule__SendPattern__Group__6"
    // InternalServiceDefinition.g:4185:1: rule__SendPattern__Group__6 : rule__SendPattern__Group__6__Impl ;
    public final void rule__SendPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4189:1: ( rule__SendPattern__Group__6__Impl )
            // InternalServiceDefinition.g:4190:2: rule__SendPattern__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SendPattern__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__6"


    // $ANTLR start "rule__SendPattern__Group__6__Impl"
    // InternalServiceDefinition.g:4196:1: rule__SendPattern__Group__6__Impl : ( '>' ) ;
    public final void rule__SendPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4200:1: ( ( '>' ) )
            // InternalServiceDefinition.g:4201:1: ( '>' )
            {
            // InternalServiceDefinition.g:4201:1: ( '>' )
            // InternalServiceDefinition.g:4202:2: '>'
            {
             before(grammarAccess.getSendPatternAccess().getGreaterThanSignKeyword_6()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSendPatternAccess().getGreaterThanSignKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__Group__6__Impl"


    // $ANTLR start "rule__ServiceProperty__Group__0"
    // InternalServiceDefinition.g:4212:1: rule__ServiceProperty__Group__0 : rule__ServiceProperty__Group__0__Impl rule__ServiceProperty__Group__1 ;
    public final void rule__ServiceProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4216:1: ( rule__ServiceProperty__Group__0__Impl rule__ServiceProperty__Group__1 )
            // InternalServiceDefinition.g:4217:2: rule__ServiceProperty__Group__0__Impl rule__ServiceProperty__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ServiceProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceProperty__Group__0"


    // $ANTLR start "rule__ServiceProperty__Group__0__Impl"
    // InternalServiceDefinition.g:4224:1: rule__ServiceProperty__Group__0__Impl : ( 'ServiceProperty' ) ;
    public final void rule__ServiceProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4228:1: ( ( 'ServiceProperty' ) )
            // InternalServiceDefinition.g:4229:1: ( 'ServiceProperty' )
            {
            // InternalServiceDefinition.g:4229:1: ( 'ServiceProperty' )
            // InternalServiceDefinition.g:4230:2: 'ServiceProperty'
            {
             before(grammarAccess.getServicePropertyAccess().getServicePropertyKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getServicePropertyAccess().getServicePropertyKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceProperty__Group__0__Impl"


    // $ANTLR start "rule__ServiceProperty__Group__1"
    // InternalServiceDefinition.g:4239:1: rule__ServiceProperty__Group__1 : rule__ServiceProperty__Group__1__Impl rule__ServiceProperty__Group__2 ;
    public final void rule__ServiceProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4243:1: ( rule__ServiceProperty__Group__1__Impl rule__ServiceProperty__Group__2 )
            // InternalServiceDefinition.g:4244:2: rule__ServiceProperty__Group__1__Impl rule__ServiceProperty__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__ServiceProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceProperty__Group__1"


    // $ANTLR start "rule__ServiceProperty__Group__1__Impl"
    // InternalServiceDefinition.g:4251:1: rule__ServiceProperty__Group__1__Impl : ( ( rule__ServiceProperty__NameAssignment_1 ) ) ;
    public final void rule__ServiceProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4255:1: ( ( ( rule__ServiceProperty__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:4256:1: ( ( rule__ServiceProperty__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:4256:1: ( ( rule__ServiceProperty__NameAssignment_1 ) )
            // InternalServiceDefinition.g:4257:2: ( rule__ServiceProperty__NameAssignment_1 )
            {
             before(grammarAccess.getServicePropertyAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:4258:2: ( rule__ServiceProperty__NameAssignment_1 )
            // InternalServiceDefinition.g:4258:3: rule__ServiceProperty__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceProperty__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServicePropertyAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceProperty__Group__1__Impl"


    // $ANTLR start "rule__ServiceProperty__Group__2"
    // InternalServiceDefinition.g:4266:1: rule__ServiceProperty__Group__2 : rule__ServiceProperty__Group__2__Impl rule__ServiceProperty__Group__3 ;
    public final void rule__ServiceProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4270:1: ( rule__ServiceProperty__Group__2__Impl rule__ServiceProperty__Group__3 )
            // InternalServiceDefinition.g:4271:2: rule__ServiceProperty__Group__2__Impl rule__ServiceProperty__Group__3
            {
            pushFollow(FOLLOW_38);
            rule__ServiceProperty__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceProperty__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceProperty__Group__2"


    // $ANTLR start "rule__ServiceProperty__Group__2__Impl"
    // InternalServiceDefinition.g:4278:1: rule__ServiceProperty__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4282:1: ( ( '{' ) )
            // InternalServiceDefinition.g:4283:1: ( '{' )
            {
            // InternalServiceDefinition.g:4283:1: ( '{' )
            // InternalServiceDefinition.g:4284:2: '{'
            {
             before(grammarAccess.getServicePropertyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServicePropertyAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceProperty__Group__2__Impl"


    // $ANTLR start "rule__ServiceProperty__Group__3"
    // InternalServiceDefinition.g:4293:1: rule__ServiceProperty__Group__3 : rule__ServiceProperty__Group__3__Impl ;
    public final void rule__ServiceProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4297:1: ( rule__ServiceProperty__Group__3__Impl )
            // InternalServiceDefinition.g:4298:2: rule__ServiceProperty__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceProperty__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceProperty__Group__3"


    // $ANTLR start "rule__ServiceProperty__Group__3__Impl"
    // InternalServiceDefinition.g:4304:1: rule__ServiceProperty__Group__3__Impl : ( '}' ) ;
    public final void rule__ServiceProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4308:1: ( ( '}' ) )
            // InternalServiceDefinition.g:4309:1: ( '}' )
            {
            // InternalServiceDefinition.g:4309:1: ( '}' )
            // InternalServiceDefinition.g:4310:2: '}'
            {
             before(grammarAccess.getServicePropertyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getServicePropertyAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceProperty__Group__3__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_3"
    // InternalServiceDefinition.g:4320:1: rule__CoordinationServiceDefinition__UnorderedGroup_3 : ( rule__CoordinationServiceDefinition__UnorderedGroup_3__0 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
        	
        try {
            // InternalServiceDefinition.g:4325:1: ( ( rule__CoordinationServiceDefinition__UnorderedGroup_3__0 )? )
            // InternalServiceDefinition.g:4326:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__0 )?
            {
            // InternalServiceDefinition.g:4326:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt22=1;
            }
            else if ( LA22_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                alt22=1;
            }
            else if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalServiceDefinition.g:4326:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__UnorderedGroup_3__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_3"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl"
    // InternalServiceDefinition.g:4334:1: rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 ) ) ) ) ) ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalServiceDefinition.g:4339:1: ( ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 ) ) ) ) ) )
            // InternalServiceDefinition.g:4340:3: ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 ) ) ) ) )
            {
            // InternalServiceDefinition.g:4340:3: ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 ) ) ) ) )
            int alt23=5;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt23=2;
            }
            else if ( LA23_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt23=3;
            }
            else if ( LA23_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                alt23=4;
            }
            else if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4) ) {
                alt23=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalServiceDefinition.g:4341:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__Group_3_0__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4341:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__Group_3_0__0 ) ) ) )
                    // InternalServiceDefinition.g:4342:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalServiceDefinition.g:4342:125: ( ( ( rule__CoordinationServiceDefinition__Group_3_0__0 ) ) )
                    // InternalServiceDefinition.g:4343:5: ( ( rule__CoordinationServiceDefinition__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4349:5: ( ( rule__CoordinationServiceDefinition__Group_3_0__0 ) )
                    // InternalServiceDefinition.g:4350:6: ( rule__CoordinationServiceDefinition__Group_3_0__0 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getGroup_3_0()); 
                    // InternalServiceDefinition.g:4351:6: ( rule__CoordinationServiceDefinition__Group_3_0__0 )
                    // InternalServiceDefinition.g:4351:7: rule__CoordinationServiceDefinition__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalServiceDefinition.g:4356:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4356:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 ) ) ) )
                    // InternalServiceDefinition.g:4357:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalServiceDefinition.g:4357:125: ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 ) ) )
                    // InternalServiceDefinition.g:4358:5: ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4364:5: ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 ) )
                    // InternalServiceDefinition.g:4365:6: ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternAssignment_3_1()); 
                    // InternalServiceDefinition.g:4366:6: ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 )
                    // InternalServiceDefinition.g:4366:7: rule__CoordinationServiceDefinition__StatePatternAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__StatePatternAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternAssignment_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalServiceDefinition.g:4371:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4371:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 ) ) ) )
                    // InternalServiceDefinition.g:4372:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalServiceDefinition.g:4372:125: ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 ) ) )
                    // InternalServiceDefinition.g:4373:5: ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4379:5: ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 ) )
                    // InternalServiceDefinition.g:4380:6: ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternAssignment_3_2()); 
                    // InternalServiceDefinition.g:4381:6: ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 )
                    // InternalServiceDefinition.g:4381:7: rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternAssignment_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalServiceDefinition.g:4386:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4386:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 ) ) ) )
                    // InternalServiceDefinition.g:4387:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalServiceDefinition.g:4387:125: ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 ) ) )
                    // InternalServiceDefinition.g:4388:5: ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4394:5: ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 ) )
                    // InternalServiceDefinition.g:4395:6: ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternAssignment_3_3()); 
                    // InternalServiceDefinition.g:4396:6: ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 )
                    // InternalServiceDefinition.g:4396:7: rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternAssignment_3_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalServiceDefinition.g:4401:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4401:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 ) ) ) )
                    // InternalServiceDefinition.g:4402:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4)");
                    }
                    // InternalServiceDefinition.g:4402:125: ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 ) ) )
                    // InternalServiceDefinition.g:4403:5: ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4409:5: ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 ) )
                    // InternalServiceDefinition.g:4410:6: ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternAssignment_3_4()); 
                    // InternalServiceDefinition.g:4411:6: ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 )
                    // InternalServiceDefinition.g:4411:7: rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternAssignment_3_4()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_3__0"
    // InternalServiceDefinition.g:4424:1: rule__CoordinationServiceDefinition__UnorderedGroup_3__0 : rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__1 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4428:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__1 )? )
            // InternalServiceDefinition.g:4429:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_39);
            rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4430:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                alt24=1;
            }
            else if ( LA24_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalServiceDefinition.g:4430:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_3__0"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_3__1"
    // InternalServiceDefinition.g:4436:1: rule__CoordinationServiceDefinition__UnorderedGroup_3__1 : rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__2 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4440:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__2 )? )
            // InternalServiceDefinition.g:4441:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_39);
            rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4442:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__2 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt25=1;
            }
            else if ( LA25_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                alt25=1;
            }
            else if ( LA25_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalServiceDefinition.g:4442:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_3__1"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_3__2"
    // InternalServiceDefinition.g:4448:1: rule__CoordinationServiceDefinition__UnorderedGroup_3__2 : rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__3 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4452:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__3 )? )
            // InternalServiceDefinition.g:4453:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_39);
            rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4454:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__3 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt26=1;
            }
            else if ( LA26_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                alt26=1;
            }
            else if ( LA26_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalServiceDefinition.g:4454:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__UnorderedGroup_3__3();

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
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_3__2"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_3__3"
    // InternalServiceDefinition.g:4460:1: rule__CoordinationServiceDefinition__UnorderedGroup_3__3 : rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__4 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4464:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__4 )? )
            // InternalServiceDefinition.g:4465:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__4 )?
            {
            pushFollow(FOLLOW_39);
            rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4466:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt27=1;
            }
            else if ( LA27_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt27=1;
            }
            else if ( LA27_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                alt27=1;
            }
            else if ( LA27_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 4) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalServiceDefinition.g:4466:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__UnorderedGroup_3__4();

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
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_3__3"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_3__4"
    // InternalServiceDefinition.g:4472:1: rule__CoordinationServiceDefinition__UnorderedGroup_3__4 : rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4476:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl )
            // InternalServiceDefinition.g:4477:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_3__4"


    // $ANTLR start "rule__EventPattern__UnorderedGroup_3"
    // InternalServiceDefinition.g:4484:1: rule__EventPattern__UnorderedGroup_3 : rule__EventPattern__UnorderedGroup_3__0 {...}?;
    public final void rule__EventPattern__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
        	
        try {
            // InternalServiceDefinition.g:4489:1: ( rule__EventPattern__UnorderedGroup_3__0 {...}?)
            // InternalServiceDefinition.g:4490:2: rule__EventPattern__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__EventPattern__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__EventPattern__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__UnorderedGroup_3"


    // $ANTLR start "rule__EventPattern__UnorderedGroup_3__Impl"
    // InternalServiceDefinition.g:4498:1: rule__EventPattern__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__EventPattern__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalServiceDefinition.g:4503:1: ( ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) ) )
            // InternalServiceDefinition.g:4504:3: ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) )
            {
            // InternalServiceDefinition.g:4504:3: ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) )
            int alt28=3;
            int LA28_0 = input.LA(1);

            if ( LA28_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt28=2;
            }
            else if ( LA28_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                alt28=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalServiceDefinition.g:4505:3: ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4505:3: ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) )
                    // InternalServiceDefinition.g:4506:4: {...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EventPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalServiceDefinition.g:4506:108: ( ( ( rule__EventPattern__Group_3_0__0 ) ) )
                    // InternalServiceDefinition.g:4507:5: ( ( rule__EventPattern__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4513:5: ( ( rule__EventPattern__Group_3_0__0 ) )
                    // InternalServiceDefinition.g:4514:6: ( rule__EventPattern__Group_3_0__0 )
                    {
                     before(grammarAccess.getEventPatternAccess().getGroup_3_0()); 
                    // InternalServiceDefinition.g:4515:6: ( rule__EventPattern__Group_3_0__0 )
                    // InternalServiceDefinition.g:4515:7: rule__EventPattern__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventPattern__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventPatternAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalServiceDefinition.g:4520:3: ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4520:3: ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) )
                    // InternalServiceDefinition.g:4521:4: {...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EventPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalServiceDefinition.g:4521:108: ( ( ( rule__EventPattern__Group_3_1__0 ) ) )
                    // InternalServiceDefinition.g:4522:5: ( ( rule__EventPattern__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4528:5: ( ( rule__EventPattern__Group_3_1__0 ) )
                    // InternalServiceDefinition.g:4529:6: ( rule__EventPattern__Group_3_1__0 )
                    {
                     before(grammarAccess.getEventPatternAccess().getGroup_3_1()); 
                    // InternalServiceDefinition.g:4530:6: ( rule__EventPattern__Group_3_1__0 )
                    // InternalServiceDefinition.g:4530:7: rule__EventPattern__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventPattern__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventPatternAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalServiceDefinition.g:4535:3: ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4535:3: ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) )
                    // InternalServiceDefinition.g:4536:4: {...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__EventPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalServiceDefinition.g:4536:108: ( ( ( rule__EventPattern__Group_3_2__0 ) ) )
                    // InternalServiceDefinition.g:4537:5: ( ( rule__EventPattern__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4543:5: ( ( rule__EventPattern__Group_3_2__0 ) )
                    // InternalServiceDefinition.g:4544:6: ( rule__EventPattern__Group_3_2__0 )
                    {
                     before(grammarAccess.getEventPatternAccess().getGroup_3_2()); 
                    // InternalServiceDefinition.g:4545:6: ( rule__EventPattern__Group_3_2__0 )
                    // InternalServiceDefinition.g:4545:7: rule__EventPattern__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventPattern__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEventPatternAccess().getGroup_3_2()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__EventPattern__UnorderedGroup_3__0"
    // InternalServiceDefinition.g:4558:1: rule__EventPattern__UnorderedGroup_3__0 : rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__1 )? ;
    public final void rule__EventPattern__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4562:1: ( rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__1 )? )
            // InternalServiceDefinition.g:4563:2: rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_40);
            rule__EventPattern__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4564:2: ( rule__EventPattern__UnorderedGroup_3__1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt29=1;
            }
            else if ( LA29_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalServiceDefinition.g:4564:2: rule__EventPattern__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventPattern__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__EventPattern__UnorderedGroup_3__0"


    // $ANTLR start "rule__EventPattern__UnorderedGroup_3__1"
    // InternalServiceDefinition.g:4570:1: rule__EventPattern__UnorderedGroup_3__1 : rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__2 )? ;
    public final void rule__EventPattern__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4574:1: ( rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__2 )? )
            // InternalServiceDefinition.g:4575:2: rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_40);
            rule__EventPattern__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4576:2: ( rule__EventPattern__UnorderedGroup_3__2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalServiceDefinition.g:4576:2: rule__EventPattern__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__EventPattern__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__EventPattern__UnorderedGroup_3__1"


    // $ANTLR start "rule__EventPattern__UnorderedGroup_3__2"
    // InternalServiceDefinition.g:4582:1: rule__EventPattern__UnorderedGroup_3__2 : rule__EventPattern__UnorderedGroup_3__Impl ;
    public final void rule__EventPattern__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4586:1: ( rule__EventPattern__UnorderedGroup_3__Impl )
            // InternalServiceDefinition.g:4587:2: rule__EventPattern__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventPattern__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__UnorderedGroup_3__2"


    // $ANTLR start "rule__QueryPattern__UnorderedGroup_3"
    // InternalServiceDefinition.g:4594:1: rule__QueryPattern__UnorderedGroup_3 : rule__QueryPattern__UnorderedGroup_3__0 {...}?;
    public final void rule__QueryPattern__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
        	
        try {
            // InternalServiceDefinition.g:4599:1: ( rule__QueryPattern__UnorderedGroup_3__0 {...}?)
            // InternalServiceDefinition.g:4600:2: rule__QueryPattern__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__QueryPattern__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__QueryPattern__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__UnorderedGroup_3"


    // $ANTLR start "rule__QueryPattern__UnorderedGroup_3__Impl"
    // InternalServiceDefinition.g:4608:1: rule__QueryPattern__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__QueryPattern__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalServiceDefinition.g:4613:1: ( ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) ) )
            // InternalServiceDefinition.g:4614:3: ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) )
            {
            // InternalServiceDefinition.g:4614:3: ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalServiceDefinition.g:4615:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4615:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) )
                    // InternalServiceDefinition.g:4616:4: {...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__QueryPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalServiceDefinition.g:4616:108: ( ( ( rule__QueryPattern__Group_3_0__0 ) ) )
                    // InternalServiceDefinition.g:4617:5: ( ( rule__QueryPattern__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4623:5: ( ( rule__QueryPattern__Group_3_0__0 ) )
                    // InternalServiceDefinition.g:4624:6: ( rule__QueryPattern__Group_3_0__0 )
                    {
                     before(grammarAccess.getQueryPatternAccess().getGroup_3_0()); 
                    // InternalServiceDefinition.g:4625:6: ( rule__QueryPattern__Group_3_0__0 )
                    // InternalServiceDefinition.g:4625:7: rule__QueryPattern__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryPattern__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQueryPatternAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalServiceDefinition.g:4630:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4630:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) )
                    // InternalServiceDefinition.g:4631:4: {...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__QueryPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalServiceDefinition.g:4631:108: ( ( ( rule__QueryPattern__Group_3_1__0 ) ) )
                    // InternalServiceDefinition.g:4632:5: ( ( rule__QueryPattern__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4638:5: ( ( rule__QueryPattern__Group_3_1__0 ) )
                    // InternalServiceDefinition.g:4639:6: ( rule__QueryPattern__Group_3_1__0 )
                    {
                     before(grammarAccess.getQueryPatternAccess().getGroup_3_1()); 
                    // InternalServiceDefinition.g:4640:6: ( rule__QueryPattern__Group_3_1__0 )
                    // InternalServiceDefinition.g:4640:7: rule__QueryPattern__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryPattern__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getQueryPatternAccess().getGroup_3_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__QueryPattern__UnorderedGroup_3__0"
    // InternalServiceDefinition.g:4653:1: rule__QueryPattern__UnorderedGroup_3__0 : rule__QueryPattern__UnorderedGroup_3__Impl ( rule__QueryPattern__UnorderedGroup_3__1 )? ;
    public final void rule__QueryPattern__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4657:1: ( rule__QueryPattern__UnorderedGroup_3__Impl ( rule__QueryPattern__UnorderedGroup_3__1 )? )
            // InternalServiceDefinition.g:4658:2: rule__QueryPattern__UnorderedGroup_3__Impl ( rule__QueryPattern__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_41);
            rule__QueryPattern__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4659:2: ( rule__QueryPattern__UnorderedGroup_3__1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalServiceDefinition.g:4659:2: rule__QueryPattern__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__QueryPattern__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__QueryPattern__UnorderedGroup_3__0"


    // $ANTLR start "rule__QueryPattern__UnorderedGroup_3__1"
    // InternalServiceDefinition.g:4665:1: rule__QueryPattern__UnorderedGroup_3__1 : rule__QueryPattern__UnorderedGroup_3__Impl ;
    public final void rule__QueryPattern__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4669:1: ( rule__QueryPattern__UnorderedGroup_3__Impl )
            // InternalServiceDefinition.g:4670:2: rule__QueryPattern__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryPattern__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__UnorderedGroup_3__1"


    // $ANTLR start "rule__ServiceDefModel__ImportsAssignment_1"
    // InternalServiceDefinition.g:4677:1: rule__ServiceDefModel__ImportsAssignment_1 : ( ruleCommRepoImport ) ;
    public final void rule__ServiceDefModel__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4681:1: ( ( ruleCommRepoImport ) )
            // InternalServiceDefinition.g:4682:2: ( ruleCommRepoImport )
            {
            // InternalServiceDefinition.g:4682:2: ( ruleCommRepoImport )
            // InternalServiceDefinition.g:4683:3: ruleCommRepoImport
            {
             before(grammarAccess.getServiceDefModelAccess().getImportsCommRepoImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCommRepoImport();

            state._fsp--;

             after(grammarAccess.getServiceDefModelAccess().getImportsCommRepoImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefModel__ImportsAssignment_1"


    // $ANTLR start "rule__ServiceDefModel__RepositoryAssignment_2"
    // InternalServiceDefinition.g:4692:1: rule__ServiceDefModel__RepositoryAssignment_2 : ( ruleServiceDefRepository ) ;
    public final void rule__ServiceDefModel__RepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4696:1: ( ( ruleServiceDefRepository ) )
            // InternalServiceDefinition.g:4697:2: ( ruleServiceDefRepository )
            {
            // InternalServiceDefinition.g:4697:2: ( ruleServiceDefRepository )
            // InternalServiceDefinition.g:4698:3: ruleServiceDefRepository
            {
             before(grammarAccess.getServiceDefModelAccess().getRepositoryServiceDefRepositoryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceDefRepository();

            state._fsp--;

             after(grammarAccess.getServiceDefModelAccess().getRepositoryServiceDefRepositoryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefModel__RepositoryAssignment_2"


    // $ANTLR start "rule__ServiceDefRepository__NameAssignment_1"
    // InternalServiceDefinition.g:4707:1: rule__ServiceDefRepository__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceDefRepository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4711:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4712:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4712:2: ( RULE_ID )
            // InternalServiceDefinition.g:4713:3: RULE_ID
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceDefRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__NameAssignment_1"


    // $ANTLR start "rule__ServiceDefRepository__VersionAssignment_2_1"
    // InternalServiceDefinition.g:4722:1: rule__ServiceDefRepository__VersionAssignment_2_1 : ( ruleServiceRepoVersion ) ;
    public final void rule__ServiceDefRepository__VersionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4726:1: ( ( ruleServiceRepoVersion ) )
            // InternalServiceDefinition.g:4727:2: ( ruleServiceRepoVersion )
            {
            // InternalServiceDefinition.g:4727:2: ( ruleServiceRepoVersion )
            // InternalServiceDefinition.g:4728:3: ruleServiceRepoVersion
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getVersionServiceRepoVersionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceRepoVersion();

            state._fsp--;

             after(grammarAccess.getServiceDefRepositoryAccess().getVersionServiceRepoVersionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__VersionAssignment_2_1"


    // $ANTLR start "rule__ServiceDefRepository__ServicesAssignment_4"
    // InternalServiceDefinition.g:4737:1: rule__ServiceDefRepository__ServicesAssignment_4 : ( ruleAbstractServiceDefinition ) ;
    public final void rule__ServiceDefRepository__ServicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4741:1: ( ( ruleAbstractServiceDefinition ) )
            // InternalServiceDefinition.g:4742:2: ( ruleAbstractServiceDefinition )
            {
            // InternalServiceDefinition.g:4742:2: ( ruleAbstractServiceDefinition )
            // InternalServiceDefinition.g:4743:3: ruleAbstractServiceDefinition
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getServicesAbstractServiceDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractServiceDefinition();

            state._fsp--;

             after(grammarAccess.getServiceDefRepositoryAccess().getServicesAbstractServiceDefinitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__ServicesAssignment_4"


    // $ANTLR start "rule__ServiceRepoVersion__MajorAssignment_0"
    // InternalServiceDefinition.g:4752:1: rule__ServiceRepoVersion__MajorAssignment_0 : ( ruleEInt ) ;
    public final void rule__ServiceRepoVersion__MajorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4756:1: ( ( ruleEInt ) )
            // InternalServiceDefinition.g:4757:2: ( ruleEInt )
            {
            // InternalServiceDefinition.g:4757:2: ( ruleEInt )
            // InternalServiceDefinition.g:4758:3: ruleEInt
            {
             before(grammarAccess.getServiceRepoVersionAccess().getMajorEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getServiceRepoVersionAccess().getMajorEIntParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__MajorAssignment_0"


    // $ANTLR start "rule__ServiceRepoVersion__MinorAssignment_2"
    // InternalServiceDefinition.g:4767:1: rule__ServiceRepoVersion__MinorAssignment_2 : ( ruleEInt ) ;
    public final void rule__ServiceRepoVersion__MinorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4771:1: ( ( ruleEInt ) )
            // InternalServiceDefinition.g:4772:2: ( ruleEInt )
            {
            // InternalServiceDefinition.g:4772:2: ( ruleEInt )
            // InternalServiceDefinition.g:4773:3: ruleEInt
            {
             before(grammarAccess.getServiceRepoVersionAccess().getMinorEIntParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getServiceRepoVersionAccess().getMinorEIntParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__MinorAssignment_2"


    // $ANTLR start "rule__ServiceRepoVersion__PatchAssignment_3_1"
    // InternalServiceDefinition.g:4782:1: rule__ServiceRepoVersion__PatchAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__ServiceRepoVersion__PatchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4786:1: ( ( ruleEInt ) )
            // InternalServiceDefinition.g:4787:2: ( ruleEInt )
            {
            // InternalServiceDefinition.g:4787:2: ( ruleEInt )
            // InternalServiceDefinition.g:4788:3: ruleEInt
            {
             before(grammarAccess.getServiceRepoVersionAccess().getPatchEIntParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getServiceRepoVersionAccess().getPatchEIntParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoVersion__PatchAssignment_3_1"


    // $ANTLR start "rule__CommRepoImport__ImportedNamespaceAssignment_1"
    // InternalServiceDefinition.g:4797:1: rule__CommRepoImport__ImportedNamespaceAssignment_1 : ( ruleFQNW ) ;
    public final void rule__CommRepoImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4801:1: ( ( ruleFQNW ) )
            // InternalServiceDefinition.g:4802:2: ( ruleFQNW )
            {
            // InternalServiceDefinition.g:4802:2: ( ruleFQNW )
            // InternalServiceDefinition.g:4803:3: ruleFQNW
            {
             before(grammarAccess.getCommRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQNW();

            state._fsp--;

             after(grammarAccess.getCommRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommRepoImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__ForkingServiceDefinition__NameAssignment_1"
    // InternalServiceDefinition.g:4812:1: rule__ForkingServiceDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForkingServiceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4816:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4817:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4817:2: ( RULE_ID )
            // InternalServiceDefinition.g:4818:3: RULE_ID
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForkingServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__NameAssignment_1"


    // $ANTLR start "rule__ForkingServiceDefinition__PatternAssignment_3"
    // InternalServiceDefinition.g:4827:1: rule__ForkingServiceDefinition__PatternAssignment_3 : ( ruleForkingPatternInstance ) ;
    public final void rule__ForkingServiceDefinition__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4831:1: ( ( ruleForkingPatternInstance ) )
            // InternalServiceDefinition.g:4832:2: ( ruleForkingPatternInstance )
            {
            // InternalServiceDefinition.g:4832:2: ( ruleForkingPatternInstance )
            // InternalServiceDefinition.g:4833:3: ruleForkingPatternInstance
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPatternForkingPatternInstanceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleForkingPatternInstance();

            state._fsp--;

             after(grammarAccess.getForkingServiceDefinitionAccess().getPatternForkingPatternInstanceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__PatternAssignment_3"


    // $ANTLR start "rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1"
    // InternalServiceDefinition.g:4842:1: rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4846:1: ( ( ruleEString ) )
            // InternalServiceDefinition.g:4847:2: ( ruleEString )
            {
            // InternalServiceDefinition.g:4847:2: ( ruleEString )
            // InternalServiceDefinition.g:4848:3: ruleEString
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getForkingServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__PurposeDescriptionAssignment_4_1"


    // $ANTLR start "rule__ForkingServiceDefinition__PropertiesAssignment_5"
    // InternalServiceDefinition.g:4857:1: rule__ForkingServiceDefinition__PropertiesAssignment_5 : ( ruleServiceProperty ) ;
    public final void rule__ForkingServiceDefinition__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4861:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:4862:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:4862:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:4863:3: ruleServiceProperty
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceProperty();

            state._fsp--;

             after(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__PropertiesAssignment_5"


    // $ANTLR start "rule__JoyningServiceDefinition__NameAssignment_1"
    // InternalServiceDefinition.g:4872:1: rule__JoyningServiceDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JoyningServiceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4876:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4877:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4877:2: ( RULE_ID )
            // InternalServiceDefinition.g:4878:3: RULE_ID
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoyningServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__NameAssignment_1"


    // $ANTLR start "rule__JoyningServiceDefinition__PatternAssignment_3"
    // InternalServiceDefinition.g:4887:1: rule__JoyningServiceDefinition__PatternAssignment_3 : ( ruleJoiningPatternInstance ) ;
    public final void rule__JoyningServiceDefinition__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4891:1: ( ( ruleJoiningPatternInstance ) )
            // InternalServiceDefinition.g:4892:2: ( ruleJoiningPatternInstance )
            {
            // InternalServiceDefinition.g:4892:2: ( ruleJoiningPatternInstance )
            // InternalServiceDefinition.g:4893:3: ruleJoiningPatternInstance
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPatternJoiningPatternInstanceParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleJoiningPatternInstance();

            state._fsp--;

             after(grammarAccess.getJoyningServiceDefinitionAccess().getPatternJoiningPatternInstanceParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__PatternAssignment_3"


    // $ANTLR start "rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1"
    // InternalServiceDefinition.g:4902:1: rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4906:1: ( ( ruleEString ) )
            // InternalServiceDefinition.g:4907:2: ( ruleEString )
            {
            // InternalServiceDefinition.g:4907:2: ( ruleEString )
            // InternalServiceDefinition.g:4908:3: ruleEString
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getJoyningServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__PurposeDescriptionAssignment_4_1"


    // $ANTLR start "rule__JoyningServiceDefinition__PropertiesAssignment_5"
    // InternalServiceDefinition.g:4917:1: rule__JoyningServiceDefinition__PropertiesAssignment_5 : ( ruleServiceProperty ) ;
    public final void rule__JoyningServiceDefinition__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4921:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:4922:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:4922:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:4923:3: ruleServiceProperty
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceProperty();

            state._fsp--;

             after(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__PropertiesAssignment_5"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__NameAssignment_1"
    // InternalServiceDefinition.g:4932:1: rule__RequestAnswerServiceDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RequestAnswerServiceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4936:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4937:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4937:2: ( RULE_ID )
            // InternalServiceDefinition.g:4938:3: RULE_ID
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__NameAssignment_1"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__PatternAssignment_3"
    // InternalServiceDefinition.g:4947:1: rule__RequestAnswerServiceDefinition__PatternAssignment_3 : ( ruleRequestAnswerPattern ) ;
    public final void rule__RequestAnswerServiceDefinition__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4951:1: ( ( ruleRequestAnswerPattern ) )
            // InternalServiceDefinition.g:4952:2: ( ruleRequestAnswerPattern )
            {
            // InternalServiceDefinition.g:4952:2: ( ruleRequestAnswerPattern )
            // InternalServiceDefinition.g:4953:3: ruleRequestAnswerPattern
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternRequestAnswerPatternParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleRequestAnswerPattern();

            state._fsp--;

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternRequestAnswerPatternParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__PatternAssignment_3"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1"
    // InternalServiceDefinition.g:4962:1: rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1 : ( ruleEString ) ;
    public final void rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4966:1: ( ( ruleEString ) )
            // InternalServiceDefinition.g:4967:2: ( ruleEString )
            {
            // InternalServiceDefinition.g:4967:2: ( ruleEString )
            // InternalServiceDefinition.g:4968:3: ruleEString
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__PurposeDescriptionAssignment_4_1"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__PropertiesAssignment_5"
    // InternalServiceDefinition.g:4977:1: rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 : ( ruleServiceProperty ) ;
    public final void rule__RequestAnswerServiceDefinition__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4981:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:4982:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:4982:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:4983:3: ruleServiceProperty
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceProperty();

            state._fsp--;

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__PropertiesAssignment_5"


    // $ANTLR start "rule__CoordinationServiceDefinition__NameAssignment_1"
    // InternalServiceDefinition.g:4992:1: rule__CoordinationServiceDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoordinationServiceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4996:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4997:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4997:2: ( RULE_ID )
            // InternalServiceDefinition.g:4998:3: RULE_ID
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoordinationServiceDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__NameAssignment_1"


    // $ANTLR start "rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1"
    // InternalServiceDefinition.g:5007:1: rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1 : ( ruleEString ) ;
    public final void rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5011:1: ( ( ruleEString ) )
            // InternalServiceDefinition.g:5012:2: ( ruleEString )
            {
            // InternalServiceDefinition.g:5012:2: ( ruleEString )
            // InternalServiceDefinition.g:5013:3: ruleEString
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getPurposeDescriptionEStringParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__PurposeDescriptionAssignment_3_0_1"


    // $ANTLR start "rule__CoordinationServiceDefinition__StatePatternAssignment_3_1"
    // InternalServiceDefinition.g:5022:1: rule__CoordinationServiceDefinition__StatePatternAssignment_3_1 : ( ruleStatePattern ) ;
    public final void rule__CoordinationServiceDefinition__StatePatternAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5026:1: ( ( ruleStatePattern ) )
            // InternalServiceDefinition.g:5027:2: ( ruleStatePattern )
            {
            // InternalServiceDefinition.g:5027:2: ( ruleStatePattern )
            // InternalServiceDefinition.g:5028:3: ruleStatePattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternStatePatternParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStatePattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternStatePatternParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__StatePatternAssignment_3_1"


    // $ANTLR start "rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2"
    // InternalServiceDefinition.g:5037:1: rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2 : ( ruleParameterPattern ) ;
    public final void rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5041:1: ( ( ruleParameterPattern ) )
            // InternalServiceDefinition.g:5042:2: ( ruleParameterPattern )
            {
            // InternalServiceDefinition.g:5042:2: ( ruleParameterPattern )
            // InternalServiceDefinition.g:5043:3: ruleParameterPattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternParameterPatternParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterPattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternParameterPatternParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_2"


    // $ANTLR start "rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3"
    // InternalServiceDefinition.g:5052:1: rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3 : ( ruleMonitoringPattern ) ;
    public final void rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5056:1: ( ( ruleMonitoringPattern ) )
            // InternalServiceDefinition.g:5057:2: ( ruleMonitoringPattern )
            {
            // InternalServiceDefinition.g:5057:2: ( ruleMonitoringPattern )
            // InternalServiceDefinition.g:5058:3: ruleMonitoringPattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternMonitoringPatternParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMonitoringPattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternMonitoringPatternParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_3"


    // $ANTLR start "rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4"
    // InternalServiceDefinition.g:5067:1: rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4 : ( ruleDynamicWiringPattern ) ;
    public final void rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5071:1: ( ( ruleDynamicWiringPattern ) )
            // InternalServiceDefinition.g:5072:2: ( ruleDynamicWiringPattern )
            {
            // InternalServiceDefinition.g:5072:2: ( ruleDynamicWiringPattern )
            // InternalServiceDefinition.g:5073:3: ruleDynamicWiringPattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternDynamicWiringPatternParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamicWiringPattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternDynamicWiringPatternParserRuleCall_3_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__WiringPatternAssignment_3_4"


    // $ANTLR start "rule__CoordinationServiceDefinition__ServicesAssignment_4"
    // InternalServiceDefinition.g:5082:1: rule__CoordinationServiceDefinition__ServicesAssignment_4 : ( ruleCommunicationServiceUsage ) ;
    public final void rule__CoordinationServiceDefinition__ServicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5086:1: ( ( ruleCommunicationServiceUsage ) )
            // InternalServiceDefinition.g:5087:2: ( ruleCommunicationServiceUsage )
            {
            // InternalServiceDefinition.g:5087:2: ( ruleCommunicationServiceUsage )
            // InternalServiceDefinition.g:5088:3: ruleCommunicationServiceUsage
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesCommunicationServiceUsageParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleCommunicationServiceUsage();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesCommunicationServiceUsageParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__ServicesAssignment_4"


    // $ANTLR start "rule__CoordinationServiceDefinition__PropertiesAssignment_5"
    // InternalServiceDefinition.g:5097:1: rule__CoordinationServiceDefinition__PropertiesAssignment_5 : ( ruleServiceProperty ) ;
    public final void rule__CoordinationServiceDefinition__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5101:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:5102:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:5102:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:5103:3: ruleServiceProperty
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceProperty();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__PropertiesAssignment_5"


    // $ANTLR start "rule__CommunicationServiceUsage__NameAssignment_1"
    // InternalServiceDefinition.g:5112:1: rule__CommunicationServiceUsage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CommunicationServiceUsage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5116:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:5117:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:5117:2: ( RULE_ID )
            // InternalServiceDefinition.g:5118:3: RULE_ID
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCommunicationServiceUsageAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsage__NameAssignment_1"


    // $ANTLR start "rule__CommunicationServiceUsage__UsesAssignment_3"
    // InternalServiceDefinition.g:5127:1: rule__CommunicationServiceUsage__UsesAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CommunicationServiceUsage__UsesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5131:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5132:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5132:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5133:3: ( ruleFQN )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionCrossReference_3_0()); 
            // InternalServiceDefinition.g:5134:3: ( ruleFQN )
            // InternalServiceDefinition.g:5135:4: ruleFQN
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsage__UsesAssignment_3"


    // $ANTLR start "rule__StatePattern__LifecycleAssignment_4"
    // InternalServiceDefinition.g:5146:1: rule__StatePattern__LifecycleAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__StatePattern__LifecycleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5150:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5151:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5151:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5152:3: ( ruleFQN )
            {
             before(grammarAccess.getStatePatternAccess().getLifecycleStateMachineCrossReference_4_0()); 
            // InternalServiceDefinition.g:5153:3: ( ruleFQN )
            // InternalServiceDefinition.g:5154:4: ruleFQN
            {
             before(grammarAccess.getStatePatternAccess().getLifecycleStateMachineFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getStatePatternAccess().getLifecycleStateMachineFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getStatePatternAccess().getLifecycleStateMachineCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__LifecycleAssignment_4"


    // $ANTLR start "rule__StatePattern__ModesAssignment_5_1"
    // InternalServiceDefinition.g:5165:1: rule__StatePattern__ModesAssignment_5_1 : ( ( ruleFQN ) ) ;
    public final void rule__StatePattern__ModesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5169:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5170:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5170:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5171:3: ( ruleFQN )
            {
             before(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionCrossReference_5_1_0()); 
            // InternalServiceDefinition.g:5172:3: ( ruleFQN )
            // InternalServiceDefinition.g:5173:4: ruleFQN
            {
             before(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionFQNParserRuleCall_5_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionFQNParserRuleCall_5_1_0_1()); 

            }

             after(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionCrossReference_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StatePattern__ModesAssignment_5_1"


    // $ANTLR start "rule__ParameterPattern__ParameterSetAssignment_3"
    // InternalServiceDefinition.g:5184:1: rule__ParameterPattern__ParameterSetAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterPattern__ParameterSetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5188:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5189:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5189:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5190:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionCrossReference_3_0()); 
            // InternalServiceDefinition.g:5191:3: ( ruleFQN )
            // InternalServiceDefinition.g:5192:4: ruleFQN
            {
             before(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterPattern__ParameterSetAssignment_3"


    // $ANTLR start "rule__PushPattern__DataTypeAssignment_5"
    // InternalServiceDefinition.g:5203:1: rule__PushPattern__DataTypeAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__PushPattern__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5207:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5208:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5208:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5209:3: ( ruleFQN )
            {
             before(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); 
            // InternalServiceDefinition.g:5210:3: ( ruleFQN )
            // InternalServiceDefinition.g:5211:4: ruleFQN
            {
             before(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PushPattern__DataTypeAssignment_5"


    // $ANTLR start "rule__EventPattern__EventTypeAssignment_3_0_2"
    // InternalServiceDefinition.g:5222:1: rule__EventPattern__EventTypeAssignment_3_0_2 : ( ( ruleFQN ) ) ;
    public final void rule__EventPattern__EventTypeAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5226:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5227:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5227:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5228:3: ( ruleFQN )
            {
             before(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectCrossReference_3_0_2_0()); 
            // InternalServiceDefinition.g:5229:3: ( ruleFQN )
            // InternalServiceDefinition.g:5230:4: ruleFQN
            {
             before(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1()); 

            }

             after(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectCrossReference_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__EventTypeAssignment_3_0_2"


    // $ANTLR start "rule__EventPattern__ActivationTypeAssignment_3_1_2"
    // InternalServiceDefinition.g:5241:1: rule__EventPattern__ActivationTypeAssignment_3_1_2 : ( ( ruleFQN ) ) ;
    public final void rule__EventPattern__ActivationTypeAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5245:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5246:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5246:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5247:3: ( ruleFQN )
            {
             before(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectCrossReference_3_1_2_0()); 
            // InternalServiceDefinition.g:5248:3: ( ruleFQN )
            // InternalServiceDefinition.g:5249:4: ruleFQN
            {
             before(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectCrossReference_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__ActivationTypeAssignment_3_1_2"


    // $ANTLR start "rule__EventPattern__EventStateTypeAssignment_3_2_2"
    // InternalServiceDefinition.g:5260:1: rule__EventPattern__EventStateTypeAssignment_3_2_2 : ( ( ruleFQN ) ) ;
    public final void rule__EventPattern__EventStateTypeAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5264:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5265:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5265:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5266:3: ( ruleFQN )
            {
             before(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectCrossReference_3_2_2_0()); 
            // InternalServiceDefinition.g:5267:3: ( ruleFQN )
            // InternalServiceDefinition.g:5268:4: ruleFQN
            {
             before(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectFQNParserRuleCall_3_2_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectFQNParserRuleCall_3_2_2_0_1()); 

            }

             after(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectCrossReference_3_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventPattern__EventStateTypeAssignment_3_2_2"


    // $ANTLR start "rule__QueryPattern__RequestTypeAssignment_3_0_2"
    // InternalServiceDefinition.g:5279:1: rule__QueryPattern__RequestTypeAssignment_3_0_2 : ( ( ruleFQN ) ) ;
    public final void rule__QueryPattern__RequestTypeAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5283:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5284:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5284:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5285:3: ( ruleFQN )
            {
             before(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectCrossReference_3_0_2_0()); 
            // InternalServiceDefinition.g:5286:3: ( ruleFQN )
            // InternalServiceDefinition.g:5287:4: ruleFQN
            {
             before(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectFQNParserRuleCall_3_0_2_0_1()); 

            }

             after(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectCrossReference_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__RequestTypeAssignment_3_0_2"


    // $ANTLR start "rule__QueryPattern__AnswerTypeAssignment_3_1_2"
    // InternalServiceDefinition.g:5298:1: rule__QueryPattern__AnswerTypeAssignment_3_1_2 : ( ( ruleFQN ) ) ;
    public final void rule__QueryPattern__AnswerTypeAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5302:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5303:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5303:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5304:3: ( ruleFQN )
            {
             before(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectCrossReference_3_1_2_0()); 
            // InternalServiceDefinition.g:5305:3: ( ruleFQN )
            // InternalServiceDefinition.g:5306:4: ruleFQN
            {
             before(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectFQNParserRuleCall_3_1_2_0_1()); 

            }

             after(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectCrossReference_3_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryPattern__AnswerTypeAssignment_3_1_2"


    // $ANTLR start "rule__SendPattern__DataTypeAssignment_5"
    // InternalServiceDefinition.g:5317:1: rule__SendPattern__DataTypeAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__SendPattern__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5321:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5322:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5322:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5323:3: ( ruleFQN )
            {
             before(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); 
            // InternalServiceDefinition.g:5324:3: ( ruleFQN )
            // InternalServiceDefinition.g:5325:4: ruleFQN
            {
             before(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectFQNParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SendPattern__DataTypeAssignment_5"


    // $ANTLR start "rule__ServiceProperty__NameAssignment_1"
    // InternalServiceDefinition.g:5336:1: rule__ServiceProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5340:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:5341:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:5341:2: ( RULE_ID )
            // InternalServiceDefinition.g:5342:3: RULE_ID
            {
             before(grammarAccess.getServicePropertyAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServicePropertyAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceProperty__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000044000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001D10000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001D00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000210000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000708200000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000400002010000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000708200002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000180000000002L});

}
