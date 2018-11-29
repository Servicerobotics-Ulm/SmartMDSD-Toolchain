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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'.*'", "'-'", "'ServiceDefRepository'", "'{'", "'}'", "'version'", "'#import'", "';'", "'ForkingServiceDefinition'", "'JoiningServiceDefinition'", "'RequestAnswerServiceDefinition'", "'CoordinationServiceDefinition'", "'CommunicationServiceUsage'", "'uses'", "'StatePattern'", "'<'", "'lifecycle'", "'>'", "'with'", "'ParameterPattern'", "'DynamicWiringPattern'", "'MonitoringPattern'", "'PushPattern'", "'DataType'", "'='", "'EventPattern'", "'EventType'", "'ActivationType'", "'EventStateType'", "'QueryPattern'", "'RequestType'", "'AnswerType'", "'SendPattern'", "'ServiceProperty'"
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
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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


    // $ANTLR start "entryRuleServiceDefRepository"
    // InternalServiceDefinition.g:194:1: entryRuleServiceDefRepository : ruleServiceDefRepository EOF ;
    public final void entryRuleServiceDefRepository() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:195:1: ( ruleServiceDefRepository EOF )
            // InternalServiceDefinition.g:196:1: ruleServiceDefRepository EOF
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
    // InternalServiceDefinition.g:203:1: ruleServiceDefRepository : ( ( rule__ServiceDefRepository__Group__0 ) ) ;
    public final void ruleServiceDefRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:207:2: ( ( ( rule__ServiceDefRepository__Group__0 ) ) )
            // InternalServiceDefinition.g:208:2: ( ( rule__ServiceDefRepository__Group__0 ) )
            {
            // InternalServiceDefinition.g:208:2: ( ( rule__ServiceDefRepository__Group__0 ) )
            // InternalServiceDefinition.g:209:3: ( rule__ServiceDefRepository__Group__0 )
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getGroup()); 
            // InternalServiceDefinition.g:210:3: ( rule__ServiceDefRepository__Group__0 )
            // InternalServiceDefinition.g:210:4: rule__ServiceDefRepository__Group__0
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
    // InternalServiceDefinition.g:219:1: entryRuleServiceRepoVersion : ruleServiceRepoVersion EOF ;
    public final void entryRuleServiceRepoVersion() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:220:1: ( ruleServiceRepoVersion EOF )
            // InternalServiceDefinition.g:221:1: ruleServiceRepoVersion EOF
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
    // InternalServiceDefinition.g:228:1: ruleServiceRepoVersion : ( ( rule__ServiceRepoVersion__Group__0 ) ) ;
    public final void ruleServiceRepoVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:232:2: ( ( ( rule__ServiceRepoVersion__Group__0 ) ) )
            // InternalServiceDefinition.g:233:2: ( ( rule__ServiceRepoVersion__Group__0 ) )
            {
            // InternalServiceDefinition.g:233:2: ( ( rule__ServiceRepoVersion__Group__0 ) )
            // InternalServiceDefinition.g:234:3: ( rule__ServiceRepoVersion__Group__0 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getGroup()); 
            // InternalServiceDefinition.g:235:3: ( rule__ServiceRepoVersion__Group__0 )
            // InternalServiceDefinition.g:235:4: rule__ServiceRepoVersion__Group__0
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
    // InternalServiceDefinition.g:244:1: entryRuleCommRepoImport : ruleCommRepoImport EOF ;
    public final void entryRuleCommRepoImport() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:245:1: ( ruleCommRepoImport EOF )
            // InternalServiceDefinition.g:246:1: ruleCommRepoImport EOF
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
    // InternalServiceDefinition.g:253:1: ruleCommRepoImport : ( ( rule__CommRepoImport__Group__0 ) ) ;
    public final void ruleCommRepoImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:257:2: ( ( ( rule__CommRepoImport__Group__0 ) ) )
            // InternalServiceDefinition.g:258:2: ( ( rule__CommRepoImport__Group__0 ) )
            {
            // InternalServiceDefinition.g:258:2: ( ( rule__CommRepoImport__Group__0 ) )
            // InternalServiceDefinition.g:259:3: ( rule__CommRepoImport__Group__0 )
            {
             before(grammarAccess.getCommRepoImportAccess().getGroup()); 
            // InternalServiceDefinition.g:260:3: ( rule__CommRepoImport__Group__0 )
            // InternalServiceDefinition.g:260:4: rule__CommRepoImport__Group__0
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
    // InternalServiceDefinition.g:269:1: entryRuleAbstractServiceDefinition : ruleAbstractServiceDefinition EOF ;
    public final void entryRuleAbstractServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:270:1: ( ruleAbstractServiceDefinition EOF )
            // InternalServiceDefinition.g:271:1: ruleAbstractServiceDefinition EOF
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
    // InternalServiceDefinition.g:278:1: ruleAbstractServiceDefinition : ( ( rule__AbstractServiceDefinition__Alternatives ) ) ;
    public final void ruleAbstractServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:282:2: ( ( ( rule__AbstractServiceDefinition__Alternatives ) ) )
            // InternalServiceDefinition.g:283:2: ( ( rule__AbstractServiceDefinition__Alternatives ) )
            {
            // InternalServiceDefinition.g:283:2: ( ( rule__AbstractServiceDefinition__Alternatives ) )
            // InternalServiceDefinition.g:284:3: ( rule__AbstractServiceDefinition__Alternatives )
            {
             before(grammarAccess.getAbstractServiceDefinitionAccess().getAlternatives()); 
            // InternalServiceDefinition.g:285:3: ( rule__AbstractServiceDefinition__Alternatives )
            // InternalServiceDefinition.g:285:4: rule__AbstractServiceDefinition__Alternatives
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
    // InternalServiceDefinition.g:294:1: entryRuleCommunicationServiceDefinition : ruleCommunicationServiceDefinition EOF ;
    public final void entryRuleCommunicationServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:295:1: ( ruleCommunicationServiceDefinition EOF )
            // InternalServiceDefinition.g:296:1: ruleCommunicationServiceDefinition EOF
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
    // InternalServiceDefinition.g:303:1: ruleCommunicationServiceDefinition : ( ( rule__CommunicationServiceDefinition__Alternatives ) ) ;
    public final void ruleCommunicationServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:307:2: ( ( ( rule__CommunicationServiceDefinition__Alternatives ) ) )
            // InternalServiceDefinition.g:308:2: ( ( rule__CommunicationServiceDefinition__Alternatives ) )
            {
            // InternalServiceDefinition.g:308:2: ( ( rule__CommunicationServiceDefinition__Alternatives ) )
            // InternalServiceDefinition.g:309:3: ( rule__CommunicationServiceDefinition__Alternatives )
            {
             before(grammarAccess.getCommunicationServiceDefinitionAccess().getAlternatives()); 
            // InternalServiceDefinition.g:310:3: ( rule__CommunicationServiceDefinition__Alternatives )
            // InternalServiceDefinition.g:310:4: rule__CommunicationServiceDefinition__Alternatives
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
    // InternalServiceDefinition.g:319:1: entryRuleForkingServiceDefinition : ruleForkingServiceDefinition EOF ;
    public final void entryRuleForkingServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:320:1: ( ruleForkingServiceDefinition EOF )
            // InternalServiceDefinition.g:321:1: ruleForkingServiceDefinition EOF
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
    // InternalServiceDefinition.g:328:1: ruleForkingServiceDefinition : ( ( rule__ForkingServiceDefinition__Group__0 ) ) ;
    public final void ruleForkingServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:332:2: ( ( ( rule__ForkingServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:333:2: ( ( rule__ForkingServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:333:2: ( ( rule__ForkingServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:334:3: ( rule__ForkingServiceDefinition__Group__0 )
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:335:3: ( rule__ForkingServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:335:4: rule__ForkingServiceDefinition__Group__0
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
    // InternalServiceDefinition.g:344:1: entryRuleJoyningServiceDefinition : ruleJoyningServiceDefinition EOF ;
    public final void entryRuleJoyningServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:345:1: ( ruleJoyningServiceDefinition EOF )
            // InternalServiceDefinition.g:346:1: ruleJoyningServiceDefinition EOF
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
    // InternalServiceDefinition.g:353:1: ruleJoyningServiceDefinition : ( ( rule__JoyningServiceDefinition__Group__0 ) ) ;
    public final void ruleJoyningServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:357:2: ( ( ( rule__JoyningServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:358:2: ( ( rule__JoyningServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:358:2: ( ( rule__JoyningServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:359:3: ( rule__JoyningServiceDefinition__Group__0 )
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:360:3: ( rule__JoyningServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:360:4: rule__JoyningServiceDefinition__Group__0
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
    // InternalServiceDefinition.g:369:1: entryRuleRequestAnswerServiceDefinition : ruleRequestAnswerServiceDefinition EOF ;
    public final void entryRuleRequestAnswerServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:370:1: ( ruleRequestAnswerServiceDefinition EOF )
            // InternalServiceDefinition.g:371:1: ruleRequestAnswerServiceDefinition EOF
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
    // InternalServiceDefinition.g:378:1: ruleRequestAnswerServiceDefinition : ( ( rule__RequestAnswerServiceDefinition__Group__0 ) ) ;
    public final void ruleRequestAnswerServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:382:2: ( ( ( rule__RequestAnswerServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:383:2: ( ( rule__RequestAnswerServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:383:2: ( ( rule__RequestAnswerServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:384:3: ( rule__RequestAnswerServiceDefinition__Group__0 )
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:385:3: ( rule__RequestAnswerServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:385:4: rule__RequestAnswerServiceDefinition__Group__0
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
    // InternalServiceDefinition.g:394:1: entryRuleCoordinationServiceDefinition : ruleCoordinationServiceDefinition EOF ;
    public final void entryRuleCoordinationServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:395:1: ( ruleCoordinationServiceDefinition EOF )
            // InternalServiceDefinition.g:396:1: ruleCoordinationServiceDefinition EOF
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
    // InternalServiceDefinition.g:403:1: ruleCoordinationServiceDefinition : ( ( rule__CoordinationServiceDefinition__Group__0 ) ) ;
    public final void ruleCoordinationServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:407:2: ( ( ( rule__CoordinationServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:408:2: ( ( rule__CoordinationServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:408:2: ( ( rule__CoordinationServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:409:3: ( rule__CoordinationServiceDefinition__Group__0 )
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:410:3: ( rule__CoordinationServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:410:4: rule__CoordinationServiceDefinition__Group__0
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
    // InternalServiceDefinition.g:419:1: entryRuleCommunicationServiceUsage : ruleCommunicationServiceUsage EOF ;
    public final void entryRuleCommunicationServiceUsage() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:420:1: ( ruleCommunicationServiceUsage EOF )
            // InternalServiceDefinition.g:421:1: ruleCommunicationServiceUsage EOF
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
    // InternalServiceDefinition.g:428:1: ruleCommunicationServiceUsage : ( ( rule__CommunicationServiceUsage__Group__0 ) ) ;
    public final void ruleCommunicationServiceUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:432:2: ( ( ( rule__CommunicationServiceUsage__Group__0 ) ) )
            // InternalServiceDefinition.g:433:2: ( ( rule__CommunicationServiceUsage__Group__0 ) )
            {
            // InternalServiceDefinition.g:433:2: ( ( rule__CommunicationServiceUsage__Group__0 ) )
            // InternalServiceDefinition.g:434:3: ( rule__CommunicationServiceUsage__Group__0 )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getGroup()); 
            // InternalServiceDefinition.g:435:3: ( rule__CommunicationServiceUsage__Group__0 )
            // InternalServiceDefinition.g:435:4: rule__CommunicationServiceUsage__Group__0
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
    // InternalServiceDefinition.g:444:1: entryRuleStatePattern : ruleStatePattern EOF ;
    public final void entryRuleStatePattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:445:1: ( ruleStatePattern EOF )
            // InternalServiceDefinition.g:446:1: ruleStatePattern EOF
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
    // InternalServiceDefinition.g:453:1: ruleStatePattern : ( ( rule__StatePattern__Group__0 ) ) ;
    public final void ruleStatePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:457:2: ( ( ( rule__StatePattern__Group__0 ) ) )
            // InternalServiceDefinition.g:458:2: ( ( rule__StatePattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:458:2: ( ( rule__StatePattern__Group__0 ) )
            // InternalServiceDefinition.g:459:3: ( rule__StatePattern__Group__0 )
            {
             before(grammarAccess.getStatePatternAccess().getGroup()); 
            // InternalServiceDefinition.g:460:3: ( rule__StatePattern__Group__0 )
            // InternalServiceDefinition.g:460:4: rule__StatePattern__Group__0
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
    // InternalServiceDefinition.g:469:1: entryRuleParameterPattern : ruleParameterPattern EOF ;
    public final void entryRuleParameterPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:470:1: ( ruleParameterPattern EOF )
            // InternalServiceDefinition.g:471:1: ruleParameterPattern EOF
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
    // InternalServiceDefinition.g:478:1: ruleParameterPattern : ( ( rule__ParameterPattern__Group__0 ) ) ;
    public final void ruleParameterPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:482:2: ( ( ( rule__ParameterPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:483:2: ( ( rule__ParameterPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:483:2: ( ( rule__ParameterPattern__Group__0 ) )
            // InternalServiceDefinition.g:484:3: ( rule__ParameterPattern__Group__0 )
            {
             before(grammarAccess.getParameterPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:485:3: ( rule__ParameterPattern__Group__0 )
            // InternalServiceDefinition.g:485:4: rule__ParameterPattern__Group__0
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
    // InternalServiceDefinition.g:494:1: entryRuleDynamicWiringPattern : ruleDynamicWiringPattern EOF ;
    public final void entryRuleDynamicWiringPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:495:1: ( ruleDynamicWiringPattern EOF )
            // InternalServiceDefinition.g:496:1: ruleDynamicWiringPattern EOF
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
    // InternalServiceDefinition.g:503:1: ruleDynamicWiringPattern : ( ( rule__DynamicWiringPattern__Group__0 ) ) ;
    public final void ruleDynamicWiringPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:507:2: ( ( ( rule__DynamicWiringPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:508:2: ( ( rule__DynamicWiringPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:508:2: ( ( rule__DynamicWiringPattern__Group__0 ) )
            // InternalServiceDefinition.g:509:3: ( rule__DynamicWiringPattern__Group__0 )
            {
             before(grammarAccess.getDynamicWiringPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:510:3: ( rule__DynamicWiringPattern__Group__0 )
            // InternalServiceDefinition.g:510:4: rule__DynamicWiringPattern__Group__0
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
    // InternalServiceDefinition.g:519:1: entryRuleMonitoringPattern : ruleMonitoringPattern EOF ;
    public final void entryRuleMonitoringPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:520:1: ( ruleMonitoringPattern EOF )
            // InternalServiceDefinition.g:521:1: ruleMonitoringPattern EOF
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
    // InternalServiceDefinition.g:528:1: ruleMonitoringPattern : ( ( rule__MonitoringPattern__Group__0 ) ) ;
    public final void ruleMonitoringPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:532:2: ( ( ( rule__MonitoringPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:533:2: ( ( rule__MonitoringPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:533:2: ( ( rule__MonitoringPattern__Group__0 ) )
            // InternalServiceDefinition.g:534:3: ( rule__MonitoringPattern__Group__0 )
            {
             before(grammarAccess.getMonitoringPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:535:3: ( rule__MonitoringPattern__Group__0 )
            // InternalServiceDefinition.g:535:4: rule__MonitoringPattern__Group__0
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
    // InternalServiceDefinition.g:544:1: entryRuleForkingPatternInstance : ruleForkingPatternInstance EOF ;
    public final void entryRuleForkingPatternInstance() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:545:1: ( ruleForkingPatternInstance EOF )
            // InternalServiceDefinition.g:546:1: ruleForkingPatternInstance EOF
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
    // InternalServiceDefinition.g:553:1: ruleForkingPatternInstance : ( ( rule__ForkingPatternInstance__Alternatives ) ) ;
    public final void ruleForkingPatternInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:557:2: ( ( ( rule__ForkingPatternInstance__Alternatives ) ) )
            // InternalServiceDefinition.g:558:2: ( ( rule__ForkingPatternInstance__Alternatives ) )
            {
            // InternalServiceDefinition.g:558:2: ( ( rule__ForkingPatternInstance__Alternatives ) )
            // InternalServiceDefinition.g:559:3: ( rule__ForkingPatternInstance__Alternatives )
            {
             before(grammarAccess.getForkingPatternInstanceAccess().getAlternatives()); 
            // InternalServiceDefinition.g:560:3: ( rule__ForkingPatternInstance__Alternatives )
            // InternalServiceDefinition.g:560:4: rule__ForkingPatternInstance__Alternatives
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
    // InternalServiceDefinition.g:569:1: entryRuleJoiningPatternInstance : ruleJoiningPatternInstance EOF ;
    public final void entryRuleJoiningPatternInstance() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:570:1: ( ruleJoiningPatternInstance EOF )
            // InternalServiceDefinition.g:571:1: ruleJoiningPatternInstance EOF
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
    // InternalServiceDefinition.g:578:1: ruleJoiningPatternInstance : ( ruleSendPattern ) ;
    public final void ruleJoiningPatternInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:582:2: ( ( ruleSendPattern ) )
            // InternalServiceDefinition.g:583:2: ( ruleSendPattern )
            {
            // InternalServiceDefinition.g:583:2: ( ruleSendPattern )
            // InternalServiceDefinition.g:584:3: ruleSendPattern
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
    // InternalServiceDefinition.g:594:1: entryRuleRequestAnswerPattern : ruleRequestAnswerPattern EOF ;
    public final void entryRuleRequestAnswerPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:595:1: ( ruleRequestAnswerPattern EOF )
            // InternalServiceDefinition.g:596:1: ruleRequestAnswerPattern EOF
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
    // InternalServiceDefinition.g:603:1: ruleRequestAnswerPattern : ( ruleQueryPattern ) ;
    public final void ruleRequestAnswerPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:607:2: ( ( ruleQueryPattern ) )
            // InternalServiceDefinition.g:608:2: ( ruleQueryPattern )
            {
            // InternalServiceDefinition.g:608:2: ( ruleQueryPattern )
            // InternalServiceDefinition.g:609:3: ruleQueryPattern
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
    // InternalServiceDefinition.g:619:1: entryRulePushPattern : rulePushPattern EOF ;
    public final void entryRulePushPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:620:1: ( rulePushPattern EOF )
            // InternalServiceDefinition.g:621:1: rulePushPattern EOF
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
    // InternalServiceDefinition.g:628:1: rulePushPattern : ( ( rule__PushPattern__Group__0 ) ) ;
    public final void rulePushPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:632:2: ( ( ( rule__PushPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:633:2: ( ( rule__PushPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:633:2: ( ( rule__PushPattern__Group__0 ) )
            // InternalServiceDefinition.g:634:3: ( rule__PushPattern__Group__0 )
            {
             before(grammarAccess.getPushPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:635:3: ( rule__PushPattern__Group__0 )
            // InternalServiceDefinition.g:635:4: rule__PushPattern__Group__0
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
    // InternalServiceDefinition.g:644:1: entryRuleEventPattern : ruleEventPattern EOF ;
    public final void entryRuleEventPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:645:1: ( ruleEventPattern EOF )
            // InternalServiceDefinition.g:646:1: ruleEventPattern EOF
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
    // InternalServiceDefinition.g:653:1: ruleEventPattern : ( ( rule__EventPattern__Group__0 ) ) ;
    public final void ruleEventPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:657:2: ( ( ( rule__EventPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:658:2: ( ( rule__EventPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:658:2: ( ( rule__EventPattern__Group__0 ) )
            // InternalServiceDefinition.g:659:3: ( rule__EventPattern__Group__0 )
            {
             before(grammarAccess.getEventPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:660:3: ( rule__EventPattern__Group__0 )
            // InternalServiceDefinition.g:660:4: rule__EventPattern__Group__0
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
    // InternalServiceDefinition.g:669:1: entryRuleQueryPattern : ruleQueryPattern EOF ;
    public final void entryRuleQueryPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:670:1: ( ruleQueryPattern EOF )
            // InternalServiceDefinition.g:671:1: ruleQueryPattern EOF
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
    // InternalServiceDefinition.g:678:1: ruleQueryPattern : ( ( rule__QueryPattern__Group__0 ) ) ;
    public final void ruleQueryPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:682:2: ( ( ( rule__QueryPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:683:2: ( ( rule__QueryPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:683:2: ( ( rule__QueryPattern__Group__0 ) )
            // InternalServiceDefinition.g:684:3: ( rule__QueryPattern__Group__0 )
            {
             before(grammarAccess.getQueryPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:685:3: ( rule__QueryPattern__Group__0 )
            // InternalServiceDefinition.g:685:4: rule__QueryPattern__Group__0
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
    // InternalServiceDefinition.g:694:1: entryRuleSendPattern : ruleSendPattern EOF ;
    public final void entryRuleSendPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:695:1: ( ruleSendPattern EOF )
            // InternalServiceDefinition.g:696:1: ruleSendPattern EOF
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
    // InternalServiceDefinition.g:703:1: ruleSendPattern : ( ( rule__SendPattern__Group__0 ) ) ;
    public final void ruleSendPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:707:2: ( ( ( rule__SendPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:708:2: ( ( rule__SendPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:708:2: ( ( rule__SendPattern__Group__0 ) )
            // InternalServiceDefinition.g:709:3: ( rule__SendPattern__Group__0 )
            {
             before(grammarAccess.getSendPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:710:3: ( rule__SendPattern__Group__0 )
            // InternalServiceDefinition.g:710:4: rule__SendPattern__Group__0
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
    // InternalServiceDefinition.g:719:1: entryRuleServiceProperty : ruleServiceProperty EOF ;
    public final void entryRuleServiceProperty() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:720:1: ( ruleServiceProperty EOF )
            // InternalServiceDefinition.g:721:1: ruleServiceProperty EOF
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
    // InternalServiceDefinition.g:728:1: ruleServiceProperty : ( ( rule__ServiceProperty__Group__0 ) ) ;
    public final void ruleServiceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:732:2: ( ( ( rule__ServiceProperty__Group__0 ) ) )
            // InternalServiceDefinition.g:733:2: ( ( rule__ServiceProperty__Group__0 ) )
            {
            // InternalServiceDefinition.g:733:2: ( ( rule__ServiceProperty__Group__0 ) )
            // InternalServiceDefinition.g:734:3: ( rule__ServiceProperty__Group__0 )
            {
             before(grammarAccess.getServicePropertyAccess().getGroup()); 
            // InternalServiceDefinition.g:735:3: ( rule__ServiceProperty__Group__0 )
            // InternalServiceDefinition.g:735:4: rule__ServiceProperty__Group__0
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
    // InternalServiceDefinition.g:743:1: rule__AbstractServiceDefinition__Alternatives : ( ( ruleCommunicationServiceDefinition ) | ( ruleCoordinationServiceDefinition ) );
    public final void rule__AbstractServiceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:747:1: ( ( ruleCommunicationServiceDefinition ) | ( ruleCoordinationServiceDefinition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=20 && LA1_0<=22)) ) {
                alt1=1;
            }
            else if ( (LA1_0==23) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalServiceDefinition.g:748:2: ( ruleCommunicationServiceDefinition )
                    {
                    // InternalServiceDefinition.g:748:2: ( ruleCommunicationServiceDefinition )
                    // InternalServiceDefinition.g:749:3: ruleCommunicationServiceDefinition
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
                    // InternalServiceDefinition.g:754:2: ( ruleCoordinationServiceDefinition )
                    {
                    // InternalServiceDefinition.g:754:2: ( ruleCoordinationServiceDefinition )
                    // InternalServiceDefinition.g:755:3: ruleCoordinationServiceDefinition
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
    // InternalServiceDefinition.g:764:1: rule__CommunicationServiceDefinition__Alternatives : ( ( ruleForkingServiceDefinition ) | ( ruleJoyningServiceDefinition ) | ( ruleRequestAnswerServiceDefinition ) );
    public final void rule__CommunicationServiceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:768:1: ( ( ruleForkingServiceDefinition ) | ( ruleJoyningServiceDefinition ) | ( ruleRequestAnswerServiceDefinition ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt2=1;
                }
                break;
            case 21:
                {
                alt2=2;
                }
                break;
            case 22:
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
                    // InternalServiceDefinition.g:769:2: ( ruleForkingServiceDefinition )
                    {
                    // InternalServiceDefinition.g:769:2: ( ruleForkingServiceDefinition )
                    // InternalServiceDefinition.g:770:3: ruleForkingServiceDefinition
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
                    // InternalServiceDefinition.g:775:2: ( ruleJoyningServiceDefinition )
                    {
                    // InternalServiceDefinition.g:775:2: ( ruleJoyningServiceDefinition )
                    // InternalServiceDefinition.g:776:3: ruleJoyningServiceDefinition
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
                    // InternalServiceDefinition.g:781:2: ( ruleRequestAnswerServiceDefinition )
                    {
                    // InternalServiceDefinition.g:781:2: ( ruleRequestAnswerServiceDefinition )
                    // InternalServiceDefinition.g:782:3: ruleRequestAnswerServiceDefinition
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
    // InternalServiceDefinition.g:791:1: rule__ForkingPatternInstance__Alternatives : ( ( rulePushPattern ) | ( ruleEventPattern ) );
    public final void rule__ForkingPatternInstance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:795:1: ( ( rulePushPattern ) | ( ruleEventPattern ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==34) ) {
                alt3=1;
            }
            else if ( (LA3_0==37) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalServiceDefinition.g:796:2: ( rulePushPattern )
                    {
                    // InternalServiceDefinition.g:796:2: ( rulePushPattern )
                    // InternalServiceDefinition.g:797:3: rulePushPattern
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
                    // InternalServiceDefinition.g:802:2: ( ruleEventPattern )
                    {
                    // InternalServiceDefinition.g:802:2: ( ruleEventPattern )
                    // InternalServiceDefinition.g:803:3: ruleEventPattern
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
    // InternalServiceDefinition.g:812:1: rule__ServiceDefModel__Group__0 : rule__ServiceDefModel__Group__0__Impl rule__ServiceDefModel__Group__1 ;
    public final void rule__ServiceDefModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:816:1: ( rule__ServiceDefModel__Group__0__Impl rule__ServiceDefModel__Group__1 )
            // InternalServiceDefinition.g:817:2: rule__ServiceDefModel__Group__0__Impl rule__ServiceDefModel__Group__1
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
    // InternalServiceDefinition.g:824:1: rule__ServiceDefModel__Group__0__Impl : ( () ) ;
    public final void rule__ServiceDefModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:828:1: ( ( () ) )
            // InternalServiceDefinition.g:829:1: ( () )
            {
            // InternalServiceDefinition.g:829:1: ( () )
            // InternalServiceDefinition.g:830:2: ()
            {
             before(grammarAccess.getServiceDefModelAccess().getServiceDefModelAction_0()); 
            // InternalServiceDefinition.g:831:2: ()
            // InternalServiceDefinition.g:831:3: 
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
    // InternalServiceDefinition.g:839:1: rule__ServiceDefModel__Group__1 : rule__ServiceDefModel__Group__1__Impl rule__ServiceDefModel__Group__2 ;
    public final void rule__ServiceDefModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:843:1: ( rule__ServiceDefModel__Group__1__Impl rule__ServiceDefModel__Group__2 )
            // InternalServiceDefinition.g:844:2: rule__ServiceDefModel__Group__1__Impl rule__ServiceDefModel__Group__2
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
    // InternalServiceDefinition.g:851:1: rule__ServiceDefModel__Group__1__Impl : ( ( rule__ServiceDefModel__ImportsAssignment_1 )* ) ;
    public final void rule__ServiceDefModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:855:1: ( ( ( rule__ServiceDefModel__ImportsAssignment_1 )* ) )
            // InternalServiceDefinition.g:856:1: ( ( rule__ServiceDefModel__ImportsAssignment_1 )* )
            {
            // InternalServiceDefinition.g:856:1: ( ( rule__ServiceDefModel__ImportsAssignment_1 )* )
            // InternalServiceDefinition.g:857:2: ( rule__ServiceDefModel__ImportsAssignment_1 )*
            {
             before(grammarAccess.getServiceDefModelAccess().getImportsAssignment_1()); 
            // InternalServiceDefinition.g:858:2: ( rule__ServiceDefModel__ImportsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalServiceDefinition.g:858:3: rule__ServiceDefModel__ImportsAssignment_1
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
    // InternalServiceDefinition.g:866:1: rule__ServiceDefModel__Group__2 : rule__ServiceDefModel__Group__2__Impl ;
    public final void rule__ServiceDefModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:870:1: ( rule__ServiceDefModel__Group__2__Impl )
            // InternalServiceDefinition.g:871:2: rule__ServiceDefModel__Group__2__Impl
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
    // InternalServiceDefinition.g:877:1: rule__ServiceDefModel__Group__2__Impl : ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? ) ;
    public final void rule__ServiceDefModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:881:1: ( ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? ) )
            // InternalServiceDefinition.g:882:1: ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? )
            {
            // InternalServiceDefinition.g:882:1: ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? )
            // InternalServiceDefinition.g:883:2: ( rule__ServiceDefModel__RepositoryAssignment_2 )?
            {
             before(grammarAccess.getServiceDefModelAccess().getRepositoryAssignment_2()); 
            // InternalServiceDefinition.g:884:2: ( rule__ServiceDefModel__RepositoryAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalServiceDefinition.g:884:3: rule__ServiceDefModel__RepositoryAssignment_2
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
    // InternalServiceDefinition.g:893:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:897:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalServiceDefinition.g:898:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalServiceDefinition.g:905:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:909:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:910:1: ( RULE_ID )
            {
            // InternalServiceDefinition.g:910:1: ( RULE_ID )
            // InternalServiceDefinition.g:911:2: RULE_ID
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
    // InternalServiceDefinition.g:920:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:924:1: ( rule__FQN__Group__1__Impl )
            // InternalServiceDefinition.g:925:2: rule__FQN__Group__1__Impl
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
    // InternalServiceDefinition.g:931:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:935:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalServiceDefinition.g:936:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalServiceDefinition.g:936:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalServiceDefinition.g:937:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalServiceDefinition.g:938:2: ( rule__FQN__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==11) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalServiceDefinition.g:938:3: rule__FQN__Group_1__0
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
    // InternalServiceDefinition.g:947:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:951:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalServiceDefinition.g:952:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalServiceDefinition.g:959:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:963:1: ( ( '.' ) )
            // InternalServiceDefinition.g:964:1: ( '.' )
            {
            // InternalServiceDefinition.g:964:1: ( '.' )
            // InternalServiceDefinition.g:965:2: '.'
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
    // InternalServiceDefinition.g:974:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:978:1: ( rule__FQN__Group_1__1__Impl )
            // InternalServiceDefinition.g:979:2: rule__FQN__Group_1__1__Impl
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
    // InternalServiceDefinition.g:985:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:989:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:990:1: ( RULE_ID )
            {
            // InternalServiceDefinition.g:990:1: ( RULE_ID )
            // InternalServiceDefinition.g:991:2: RULE_ID
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
    // InternalServiceDefinition.g:1001:1: rule__FQNW__Group__0 : rule__FQNW__Group__0__Impl rule__FQNW__Group__1 ;
    public final void rule__FQNW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1005:1: ( rule__FQNW__Group__0__Impl rule__FQNW__Group__1 )
            // InternalServiceDefinition.g:1006:2: rule__FQNW__Group__0__Impl rule__FQNW__Group__1
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
    // InternalServiceDefinition.g:1013:1: rule__FQNW__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1017:1: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:1018:1: ( ruleFQN )
            {
            // InternalServiceDefinition.g:1018:1: ( ruleFQN )
            // InternalServiceDefinition.g:1019:2: ruleFQN
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
    // InternalServiceDefinition.g:1028:1: rule__FQNW__Group__1 : rule__FQNW__Group__1__Impl ;
    public final void rule__FQNW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1032:1: ( rule__FQNW__Group__1__Impl )
            // InternalServiceDefinition.g:1033:2: rule__FQNW__Group__1__Impl
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
    // InternalServiceDefinition.g:1039:1: rule__FQNW__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1043:1: ( ( ( '.*' )? ) )
            // InternalServiceDefinition.g:1044:1: ( ( '.*' )? )
            {
            // InternalServiceDefinition.g:1044:1: ( ( '.*' )? )
            // InternalServiceDefinition.g:1045:2: ( '.*' )?
            {
             before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); 
            // InternalServiceDefinition.g:1046:2: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==12) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalServiceDefinition.g:1046:3: '.*'
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
    // InternalServiceDefinition.g:1055:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1059:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalServiceDefinition.g:1060:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalServiceDefinition.g:1067:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1071:1: ( ( ( '-' )? ) )
            // InternalServiceDefinition.g:1072:1: ( ( '-' )? )
            {
            // InternalServiceDefinition.g:1072:1: ( ( '-' )? )
            // InternalServiceDefinition.g:1073:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalServiceDefinition.g:1074:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==13) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalServiceDefinition.g:1074:3: '-'
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
    // InternalServiceDefinition.g:1082:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1086:1: ( rule__EInt__Group__1__Impl )
            // InternalServiceDefinition.g:1087:2: rule__EInt__Group__1__Impl
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
    // InternalServiceDefinition.g:1093:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1097:1: ( ( RULE_INT ) )
            // InternalServiceDefinition.g:1098:1: ( RULE_INT )
            {
            // InternalServiceDefinition.g:1098:1: ( RULE_INT )
            // InternalServiceDefinition.g:1099:2: RULE_INT
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
    // InternalServiceDefinition.g:1109:1: rule__ServiceDefRepository__Group__0 : rule__ServiceDefRepository__Group__0__Impl rule__ServiceDefRepository__Group__1 ;
    public final void rule__ServiceDefRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1113:1: ( rule__ServiceDefRepository__Group__0__Impl rule__ServiceDefRepository__Group__1 )
            // InternalServiceDefinition.g:1114:2: rule__ServiceDefRepository__Group__0__Impl rule__ServiceDefRepository__Group__1
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
    // InternalServiceDefinition.g:1121:1: rule__ServiceDefRepository__Group__0__Impl : ( 'ServiceDefRepository' ) ;
    public final void rule__ServiceDefRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1125:1: ( ( 'ServiceDefRepository' ) )
            // InternalServiceDefinition.g:1126:1: ( 'ServiceDefRepository' )
            {
            // InternalServiceDefinition.g:1126:1: ( 'ServiceDefRepository' )
            // InternalServiceDefinition.g:1127:2: 'ServiceDefRepository'
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
    // InternalServiceDefinition.g:1136:1: rule__ServiceDefRepository__Group__1 : rule__ServiceDefRepository__Group__1__Impl rule__ServiceDefRepository__Group__2 ;
    public final void rule__ServiceDefRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1140:1: ( rule__ServiceDefRepository__Group__1__Impl rule__ServiceDefRepository__Group__2 )
            // InternalServiceDefinition.g:1141:2: rule__ServiceDefRepository__Group__1__Impl rule__ServiceDefRepository__Group__2
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
    // InternalServiceDefinition.g:1148:1: rule__ServiceDefRepository__Group__1__Impl : ( ( rule__ServiceDefRepository__NameAssignment_1 ) ) ;
    public final void rule__ServiceDefRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1152:1: ( ( ( rule__ServiceDefRepository__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:1153:1: ( ( rule__ServiceDefRepository__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:1153:1: ( ( rule__ServiceDefRepository__NameAssignment_1 ) )
            // InternalServiceDefinition.g:1154:2: ( rule__ServiceDefRepository__NameAssignment_1 )
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:1155:2: ( rule__ServiceDefRepository__NameAssignment_1 )
            // InternalServiceDefinition.g:1155:3: rule__ServiceDefRepository__NameAssignment_1
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
    // InternalServiceDefinition.g:1163:1: rule__ServiceDefRepository__Group__2 : rule__ServiceDefRepository__Group__2__Impl rule__ServiceDefRepository__Group__3 ;
    public final void rule__ServiceDefRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1167:1: ( rule__ServiceDefRepository__Group__2__Impl rule__ServiceDefRepository__Group__3 )
            // InternalServiceDefinition.g:1168:2: rule__ServiceDefRepository__Group__2__Impl rule__ServiceDefRepository__Group__3
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
    // InternalServiceDefinition.g:1175:1: rule__ServiceDefRepository__Group__2__Impl : ( ( rule__ServiceDefRepository__Group_2__0 )? ) ;
    public final void rule__ServiceDefRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1179:1: ( ( ( rule__ServiceDefRepository__Group_2__0 )? ) )
            // InternalServiceDefinition.g:1180:1: ( ( rule__ServiceDefRepository__Group_2__0 )? )
            {
            // InternalServiceDefinition.g:1180:1: ( ( rule__ServiceDefRepository__Group_2__0 )? )
            // InternalServiceDefinition.g:1181:2: ( rule__ServiceDefRepository__Group_2__0 )?
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getGroup_2()); 
            // InternalServiceDefinition.g:1182:2: ( rule__ServiceDefRepository__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==17) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalServiceDefinition.g:1182:3: rule__ServiceDefRepository__Group_2__0
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
    // InternalServiceDefinition.g:1190:1: rule__ServiceDefRepository__Group__3 : rule__ServiceDefRepository__Group__3__Impl rule__ServiceDefRepository__Group__4 ;
    public final void rule__ServiceDefRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1194:1: ( rule__ServiceDefRepository__Group__3__Impl rule__ServiceDefRepository__Group__4 )
            // InternalServiceDefinition.g:1195:2: rule__ServiceDefRepository__Group__3__Impl rule__ServiceDefRepository__Group__4
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
    // InternalServiceDefinition.g:1202:1: rule__ServiceDefRepository__Group__3__Impl : ( '{' ) ;
    public final void rule__ServiceDefRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1206:1: ( ( '{' ) )
            // InternalServiceDefinition.g:1207:1: ( '{' )
            {
            // InternalServiceDefinition.g:1207:1: ( '{' )
            // InternalServiceDefinition.g:1208:2: '{'
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
    // InternalServiceDefinition.g:1217:1: rule__ServiceDefRepository__Group__4 : rule__ServiceDefRepository__Group__4__Impl rule__ServiceDefRepository__Group__5 ;
    public final void rule__ServiceDefRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1221:1: ( rule__ServiceDefRepository__Group__4__Impl rule__ServiceDefRepository__Group__5 )
            // InternalServiceDefinition.g:1222:2: rule__ServiceDefRepository__Group__4__Impl rule__ServiceDefRepository__Group__5
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
    // InternalServiceDefinition.g:1229:1: rule__ServiceDefRepository__Group__4__Impl : ( ( rule__ServiceDefRepository__ServicesAssignment_4 )* ) ;
    public final void rule__ServiceDefRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1233:1: ( ( ( rule__ServiceDefRepository__ServicesAssignment_4 )* ) )
            // InternalServiceDefinition.g:1234:1: ( ( rule__ServiceDefRepository__ServicesAssignment_4 )* )
            {
            // InternalServiceDefinition.g:1234:1: ( ( rule__ServiceDefRepository__ServicesAssignment_4 )* )
            // InternalServiceDefinition.g:1235:2: ( rule__ServiceDefRepository__ServicesAssignment_4 )*
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getServicesAssignment_4()); 
            // InternalServiceDefinition.g:1236:2: ( rule__ServiceDefRepository__ServicesAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=20 && LA10_0<=23)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalServiceDefinition.g:1236:3: rule__ServiceDefRepository__ServicesAssignment_4
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
    // InternalServiceDefinition.g:1244:1: rule__ServiceDefRepository__Group__5 : rule__ServiceDefRepository__Group__5__Impl ;
    public final void rule__ServiceDefRepository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1248:1: ( rule__ServiceDefRepository__Group__5__Impl )
            // InternalServiceDefinition.g:1249:2: rule__ServiceDefRepository__Group__5__Impl
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
    // InternalServiceDefinition.g:1255:1: rule__ServiceDefRepository__Group__5__Impl : ( '}' ) ;
    public final void rule__ServiceDefRepository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1259:1: ( ( '}' ) )
            // InternalServiceDefinition.g:1260:1: ( '}' )
            {
            // InternalServiceDefinition.g:1260:1: ( '}' )
            // InternalServiceDefinition.g:1261:2: '}'
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
    // InternalServiceDefinition.g:1271:1: rule__ServiceDefRepository__Group_2__0 : rule__ServiceDefRepository__Group_2__0__Impl rule__ServiceDefRepository__Group_2__1 ;
    public final void rule__ServiceDefRepository__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1275:1: ( rule__ServiceDefRepository__Group_2__0__Impl rule__ServiceDefRepository__Group_2__1 )
            // InternalServiceDefinition.g:1276:2: rule__ServiceDefRepository__Group_2__0__Impl rule__ServiceDefRepository__Group_2__1
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
    // InternalServiceDefinition.g:1283:1: rule__ServiceDefRepository__Group_2__0__Impl : ( 'version' ) ;
    public final void rule__ServiceDefRepository__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1287:1: ( ( 'version' ) )
            // InternalServiceDefinition.g:1288:1: ( 'version' )
            {
            // InternalServiceDefinition.g:1288:1: ( 'version' )
            // InternalServiceDefinition.g:1289:2: 'version'
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
    // InternalServiceDefinition.g:1298:1: rule__ServiceDefRepository__Group_2__1 : rule__ServiceDefRepository__Group_2__1__Impl ;
    public final void rule__ServiceDefRepository__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1302:1: ( rule__ServiceDefRepository__Group_2__1__Impl )
            // InternalServiceDefinition.g:1303:2: rule__ServiceDefRepository__Group_2__1__Impl
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
    // InternalServiceDefinition.g:1309:1: rule__ServiceDefRepository__Group_2__1__Impl : ( ( rule__ServiceDefRepository__VersionAssignment_2_1 ) ) ;
    public final void rule__ServiceDefRepository__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1313:1: ( ( ( rule__ServiceDefRepository__VersionAssignment_2_1 ) ) )
            // InternalServiceDefinition.g:1314:1: ( ( rule__ServiceDefRepository__VersionAssignment_2_1 ) )
            {
            // InternalServiceDefinition.g:1314:1: ( ( rule__ServiceDefRepository__VersionAssignment_2_1 ) )
            // InternalServiceDefinition.g:1315:2: ( rule__ServiceDefRepository__VersionAssignment_2_1 )
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getVersionAssignment_2_1()); 
            // InternalServiceDefinition.g:1316:2: ( rule__ServiceDefRepository__VersionAssignment_2_1 )
            // InternalServiceDefinition.g:1316:3: rule__ServiceDefRepository__VersionAssignment_2_1
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
    // InternalServiceDefinition.g:1325:1: rule__ServiceRepoVersion__Group__0 : rule__ServiceRepoVersion__Group__0__Impl rule__ServiceRepoVersion__Group__1 ;
    public final void rule__ServiceRepoVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1329:1: ( rule__ServiceRepoVersion__Group__0__Impl rule__ServiceRepoVersion__Group__1 )
            // InternalServiceDefinition.g:1330:2: rule__ServiceRepoVersion__Group__0__Impl rule__ServiceRepoVersion__Group__1
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
    // InternalServiceDefinition.g:1337:1: rule__ServiceRepoVersion__Group__0__Impl : ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) ) ;
    public final void rule__ServiceRepoVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1341:1: ( ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) ) )
            // InternalServiceDefinition.g:1342:1: ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) )
            {
            // InternalServiceDefinition.g:1342:1: ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) )
            // InternalServiceDefinition.g:1343:2: ( rule__ServiceRepoVersion__MajorAssignment_0 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getMajorAssignment_0()); 
            // InternalServiceDefinition.g:1344:2: ( rule__ServiceRepoVersion__MajorAssignment_0 )
            // InternalServiceDefinition.g:1344:3: rule__ServiceRepoVersion__MajorAssignment_0
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
    // InternalServiceDefinition.g:1352:1: rule__ServiceRepoVersion__Group__1 : rule__ServiceRepoVersion__Group__1__Impl rule__ServiceRepoVersion__Group__2 ;
    public final void rule__ServiceRepoVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1356:1: ( rule__ServiceRepoVersion__Group__1__Impl rule__ServiceRepoVersion__Group__2 )
            // InternalServiceDefinition.g:1357:2: rule__ServiceRepoVersion__Group__1__Impl rule__ServiceRepoVersion__Group__2
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
    // InternalServiceDefinition.g:1364:1: rule__ServiceRepoVersion__Group__1__Impl : ( '.' ) ;
    public final void rule__ServiceRepoVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1368:1: ( ( '.' ) )
            // InternalServiceDefinition.g:1369:1: ( '.' )
            {
            // InternalServiceDefinition.g:1369:1: ( '.' )
            // InternalServiceDefinition.g:1370:2: '.'
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
    // InternalServiceDefinition.g:1379:1: rule__ServiceRepoVersion__Group__2 : rule__ServiceRepoVersion__Group__2__Impl rule__ServiceRepoVersion__Group__3 ;
    public final void rule__ServiceRepoVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1383:1: ( rule__ServiceRepoVersion__Group__2__Impl rule__ServiceRepoVersion__Group__3 )
            // InternalServiceDefinition.g:1384:2: rule__ServiceRepoVersion__Group__2__Impl rule__ServiceRepoVersion__Group__3
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
    // InternalServiceDefinition.g:1391:1: rule__ServiceRepoVersion__Group__2__Impl : ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) ) ;
    public final void rule__ServiceRepoVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1395:1: ( ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) ) )
            // InternalServiceDefinition.g:1396:1: ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) )
            {
            // InternalServiceDefinition.g:1396:1: ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) )
            // InternalServiceDefinition.g:1397:2: ( rule__ServiceRepoVersion__MinorAssignment_2 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getMinorAssignment_2()); 
            // InternalServiceDefinition.g:1398:2: ( rule__ServiceRepoVersion__MinorAssignment_2 )
            // InternalServiceDefinition.g:1398:3: rule__ServiceRepoVersion__MinorAssignment_2
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
    // InternalServiceDefinition.g:1406:1: rule__ServiceRepoVersion__Group__3 : rule__ServiceRepoVersion__Group__3__Impl ;
    public final void rule__ServiceRepoVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1410:1: ( rule__ServiceRepoVersion__Group__3__Impl )
            // InternalServiceDefinition.g:1411:2: rule__ServiceRepoVersion__Group__3__Impl
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
    // InternalServiceDefinition.g:1417:1: rule__ServiceRepoVersion__Group__3__Impl : ( ( rule__ServiceRepoVersion__Group_3__0 )? ) ;
    public final void rule__ServiceRepoVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1421:1: ( ( ( rule__ServiceRepoVersion__Group_3__0 )? ) )
            // InternalServiceDefinition.g:1422:1: ( ( rule__ServiceRepoVersion__Group_3__0 )? )
            {
            // InternalServiceDefinition.g:1422:1: ( ( rule__ServiceRepoVersion__Group_3__0 )? )
            // InternalServiceDefinition.g:1423:2: ( rule__ServiceRepoVersion__Group_3__0 )?
            {
             before(grammarAccess.getServiceRepoVersionAccess().getGroup_3()); 
            // InternalServiceDefinition.g:1424:2: ( rule__ServiceRepoVersion__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalServiceDefinition.g:1424:3: rule__ServiceRepoVersion__Group_3__0
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
    // InternalServiceDefinition.g:1433:1: rule__ServiceRepoVersion__Group_3__0 : rule__ServiceRepoVersion__Group_3__0__Impl rule__ServiceRepoVersion__Group_3__1 ;
    public final void rule__ServiceRepoVersion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1437:1: ( rule__ServiceRepoVersion__Group_3__0__Impl rule__ServiceRepoVersion__Group_3__1 )
            // InternalServiceDefinition.g:1438:2: rule__ServiceRepoVersion__Group_3__0__Impl rule__ServiceRepoVersion__Group_3__1
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
    // InternalServiceDefinition.g:1445:1: rule__ServiceRepoVersion__Group_3__0__Impl : ( '.' ) ;
    public final void rule__ServiceRepoVersion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1449:1: ( ( '.' ) )
            // InternalServiceDefinition.g:1450:1: ( '.' )
            {
            // InternalServiceDefinition.g:1450:1: ( '.' )
            // InternalServiceDefinition.g:1451:2: '.'
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
    // InternalServiceDefinition.g:1460:1: rule__ServiceRepoVersion__Group_3__1 : rule__ServiceRepoVersion__Group_3__1__Impl ;
    public final void rule__ServiceRepoVersion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1464:1: ( rule__ServiceRepoVersion__Group_3__1__Impl )
            // InternalServiceDefinition.g:1465:2: rule__ServiceRepoVersion__Group_3__1__Impl
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
    // InternalServiceDefinition.g:1471:1: rule__ServiceRepoVersion__Group_3__1__Impl : ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) ) ;
    public final void rule__ServiceRepoVersion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1475:1: ( ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) ) )
            // InternalServiceDefinition.g:1476:1: ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) )
            {
            // InternalServiceDefinition.g:1476:1: ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) )
            // InternalServiceDefinition.g:1477:2: ( rule__ServiceRepoVersion__PatchAssignment_3_1 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getPatchAssignment_3_1()); 
            // InternalServiceDefinition.g:1478:2: ( rule__ServiceRepoVersion__PatchAssignment_3_1 )
            // InternalServiceDefinition.g:1478:3: rule__ServiceRepoVersion__PatchAssignment_3_1
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
    // InternalServiceDefinition.g:1487:1: rule__CommRepoImport__Group__0 : rule__CommRepoImport__Group__0__Impl rule__CommRepoImport__Group__1 ;
    public final void rule__CommRepoImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1491:1: ( rule__CommRepoImport__Group__0__Impl rule__CommRepoImport__Group__1 )
            // InternalServiceDefinition.g:1492:2: rule__CommRepoImport__Group__0__Impl rule__CommRepoImport__Group__1
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
    // InternalServiceDefinition.g:1499:1: rule__CommRepoImport__Group__0__Impl : ( '#import' ) ;
    public final void rule__CommRepoImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1503:1: ( ( '#import' ) )
            // InternalServiceDefinition.g:1504:1: ( '#import' )
            {
            // InternalServiceDefinition.g:1504:1: ( '#import' )
            // InternalServiceDefinition.g:1505:2: '#import'
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
    // InternalServiceDefinition.g:1514:1: rule__CommRepoImport__Group__1 : rule__CommRepoImport__Group__1__Impl rule__CommRepoImport__Group__2 ;
    public final void rule__CommRepoImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1518:1: ( rule__CommRepoImport__Group__1__Impl rule__CommRepoImport__Group__2 )
            // InternalServiceDefinition.g:1519:2: rule__CommRepoImport__Group__1__Impl rule__CommRepoImport__Group__2
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
    // InternalServiceDefinition.g:1526:1: rule__CommRepoImport__Group__1__Impl : ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__CommRepoImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1530:1: ( ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalServiceDefinition.g:1531:1: ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalServiceDefinition.g:1531:1: ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) )
            // InternalServiceDefinition.g:1532:2: ( rule__CommRepoImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getCommRepoImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalServiceDefinition.g:1533:2: ( rule__CommRepoImport__ImportedNamespaceAssignment_1 )
            // InternalServiceDefinition.g:1533:3: rule__CommRepoImport__ImportedNamespaceAssignment_1
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
    // InternalServiceDefinition.g:1541:1: rule__CommRepoImport__Group__2 : rule__CommRepoImport__Group__2__Impl ;
    public final void rule__CommRepoImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1545:1: ( rule__CommRepoImport__Group__2__Impl )
            // InternalServiceDefinition.g:1546:2: rule__CommRepoImport__Group__2__Impl
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
    // InternalServiceDefinition.g:1552:1: rule__CommRepoImport__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__CommRepoImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1556:1: ( ( ( ';' )? ) )
            // InternalServiceDefinition.g:1557:1: ( ( ';' )? )
            {
            // InternalServiceDefinition.g:1557:1: ( ( ';' )? )
            // InternalServiceDefinition.g:1558:2: ( ';' )?
            {
             before(grammarAccess.getCommRepoImportAccess().getSemicolonKeyword_2()); 
            // InternalServiceDefinition.g:1559:2: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalServiceDefinition.g:1559:3: ';'
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
    // InternalServiceDefinition.g:1568:1: rule__ForkingServiceDefinition__Group__0 : rule__ForkingServiceDefinition__Group__0__Impl rule__ForkingServiceDefinition__Group__1 ;
    public final void rule__ForkingServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1572:1: ( rule__ForkingServiceDefinition__Group__0__Impl rule__ForkingServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:1573:2: rule__ForkingServiceDefinition__Group__0__Impl rule__ForkingServiceDefinition__Group__1
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
    // InternalServiceDefinition.g:1580:1: rule__ForkingServiceDefinition__Group__0__Impl : ( 'ForkingServiceDefinition' ) ;
    public final void rule__ForkingServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1584:1: ( ( 'ForkingServiceDefinition' ) )
            // InternalServiceDefinition.g:1585:1: ( 'ForkingServiceDefinition' )
            {
            // InternalServiceDefinition.g:1585:1: ( 'ForkingServiceDefinition' )
            // InternalServiceDefinition.g:1586:2: 'ForkingServiceDefinition'
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
    // InternalServiceDefinition.g:1595:1: rule__ForkingServiceDefinition__Group__1 : rule__ForkingServiceDefinition__Group__1__Impl rule__ForkingServiceDefinition__Group__2 ;
    public final void rule__ForkingServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1599:1: ( rule__ForkingServiceDefinition__Group__1__Impl rule__ForkingServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:1600:2: rule__ForkingServiceDefinition__Group__1__Impl rule__ForkingServiceDefinition__Group__2
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
    // InternalServiceDefinition.g:1607:1: rule__ForkingServiceDefinition__Group__1__Impl : ( ( rule__ForkingServiceDefinition__NameAssignment_1 ) ) ;
    public final void rule__ForkingServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1611:1: ( ( ( rule__ForkingServiceDefinition__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:1612:1: ( ( rule__ForkingServiceDefinition__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:1612:1: ( ( rule__ForkingServiceDefinition__NameAssignment_1 ) )
            // InternalServiceDefinition.g:1613:2: ( rule__ForkingServiceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:1614:2: ( rule__ForkingServiceDefinition__NameAssignment_1 )
            // InternalServiceDefinition.g:1614:3: rule__ForkingServiceDefinition__NameAssignment_1
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
    // InternalServiceDefinition.g:1622:1: rule__ForkingServiceDefinition__Group__2 : rule__ForkingServiceDefinition__Group__2__Impl rule__ForkingServiceDefinition__Group__3 ;
    public final void rule__ForkingServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1626:1: ( rule__ForkingServiceDefinition__Group__2__Impl rule__ForkingServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:1627:2: rule__ForkingServiceDefinition__Group__2__Impl rule__ForkingServiceDefinition__Group__3
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
    // InternalServiceDefinition.g:1634:1: rule__ForkingServiceDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__ForkingServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1638:1: ( ( '{' ) )
            // InternalServiceDefinition.g:1639:1: ( '{' )
            {
            // InternalServiceDefinition.g:1639:1: ( '{' )
            // InternalServiceDefinition.g:1640:2: '{'
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
    // InternalServiceDefinition.g:1649:1: rule__ForkingServiceDefinition__Group__3 : rule__ForkingServiceDefinition__Group__3__Impl rule__ForkingServiceDefinition__Group__4 ;
    public final void rule__ForkingServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1653:1: ( rule__ForkingServiceDefinition__Group__3__Impl rule__ForkingServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:1654:2: rule__ForkingServiceDefinition__Group__3__Impl rule__ForkingServiceDefinition__Group__4
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
    // InternalServiceDefinition.g:1661:1: rule__ForkingServiceDefinition__Group__3__Impl : ( ( rule__ForkingServiceDefinition__PatternAssignment_3 ) ) ;
    public final void rule__ForkingServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1665:1: ( ( ( rule__ForkingServiceDefinition__PatternAssignment_3 ) ) )
            // InternalServiceDefinition.g:1666:1: ( ( rule__ForkingServiceDefinition__PatternAssignment_3 ) )
            {
            // InternalServiceDefinition.g:1666:1: ( ( rule__ForkingServiceDefinition__PatternAssignment_3 ) )
            // InternalServiceDefinition.g:1667:2: ( rule__ForkingServiceDefinition__PatternAssignment_3 )
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPatternAssignment_3()); 
            // InternalServiceDefinition.g:1668:2: ( rule__ForkingServiceDefinition__PatternAssignment_3 )
            // InternalServiceDefinition.g:1668:3: rule__ForkingServiceDefinition__PatternAssignment_3
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
    // InternalServiceDefinition.g:1676:1: rule__ForkingServiceDefinition__Group__4 : rule__ForkingServiceDefinition__Group__4__Impl rule__ForkingServiceDefinition__Group__5 ;
    public final void rule__ForkingServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1680:1: ( rule__ForkingServiceDefinition__Group__4__Impl rule__ForkingServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:1681:2: rule__ForkingServiceDefinition__Group__4__Impl rule__ForkingServiceDefinition__Group__5
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
    // InternalServiceDefinition.g:1688:1: rule__ForkingServiceDefinition__Group__4__Impl : ( ( rule__ForkingServiceDefinition__PropertiesAssignment_4 )* ) ;
    public final void rule__ForkingServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1692:1: ( ( ( rule__ForkingServiceDefinition__PropertiesAssignment_4 )* ) )
            // InternalServiceDefinition.g:1693:1: ( ( rule__ForkingServiceDefinition__PropertiesAssignment_4 )* )
            {
            // InternalServiceDefinition.g:1693:1: ( ( rule__ForkingServiceDefinition__PropertiesAssignment_4 )* )
            // InternalServiceDefinition.g:1694:2: ( rule__ForkingServiceDefinition__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesAssignment_4()); 
            // InternalServiceDefinition.g:1695:2: ( rule__ForkingServiceDefinition__PropertiesAssignment_4 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==45) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalServiceDefinition.g:1695:3: rule__ForkingServiceDefinition__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__ForkingServiceDefinition__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesAssignment_4()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1703:1: rule__ForkingServiceDefinition__Group__5 : rule__ForkingServiceDefinition__Group__5__Impl ;
    public final void rule__ForkingServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1707:1: ( rule__ForkingServiceDefinition__Group__5__Impl )
            // InternalServiceDefinition.g:1708:2: rule__ForkingServiceDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalServiceDefinition.g:1714:1: rule__ForkingServiceDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ForkingServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1718:1: ( ( '}' ) )
            // InternalServiceDefinition.g:1719:1: ( '}' )
            {
            // InternalServiceDefinition.g:1719:1: ( '}' )
            // InternalServiceDefinition.g:1720:2: '}'
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getForkingServiceDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__JoyningServiceDefinition__Group__0"
    // InternalServiceDefinition.g:1730:1: rule__JoyningServiceDefinition__Group__0 : rule__JoyningServiceDefinition__Group__0__Impl rule__JoyningServiceDefinition__Group__1 ;
    public final void rule__JoyningServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1734:1: ( rule__JoyningServiceDefinition__Group__0__Impl rule__JoyningServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:1735:2: rule__JoyningServiceDefinition__Group__0__Impl rule__JoyningServiceDefinition__Group__1
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
    // InternalServiceDefinition.g:1742:1: rule__JoyningServiceDefinition__Group__0__Impl : ( 'JoiningServiceDefinition' ) ;
    public final void rule__JoyningServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1746:1: ( ( 'JoiningServiceDefinition' ) )
            // InternalServiceDefinition.g:1747:1: ( 'JoiningServiceDefinition' )
            {
            // InternalServiceDefinition.g:1747:1: ( 'JoiningServiceDefinition' )
            // InternalServiceDefinition.g:1748:2: 'JoiningServiceDefinition'
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getJoiningServiceDefinitionKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalServiceDefinition.g:1757:1: rule__JoyningServiceDefinition__Group__1 : rule__JoyningServiceDefinition__Group__1__Impl rule__JoyningServiceDefinition__Group__2 ;
    public final void rule__JoyningServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1761:1: ( rule__JoyningServiceDefinition__Group__1__Impl rule__JoyningServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:1762:2: rule__JoyningServiceDefinition__Group__1__Impl rule__JoyningServiceDefinition__Group__2
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
    // InternalServiceDefinition.g:1769:1: rule__JoyningServiceDefinition__Group__1__Impl : ( ( rule__JoyningServiceDefinition__NameAssignment_1 ) ) ;
    public final void rule__JoyningServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1773:1: ( ( ( rule__JoyningServiceDefinition__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:1774:1: ( ( rule__JoyningServiceDefinition__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:1774:1: ( ( rule__JoyningServiceDefinition__NameAssignment_1 ) )
            // InternalServiceDefinition.g:1775:2: ( rule__JoyningServiceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:1776:2: ( rule__JoyningServiceDefinition__NameAssignment_1 )
            // InternalServiceDefinition.g:1776:3: rule__JoyningServiceDefinition__NameAssignment_1
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
    // InternalServiceDefinition.g:1784:1: rule__JoyningServiceDefinition__Group__2 : rule__JoyningServiceDefinition__Group__2__Impl rule__JoyningServiceDefinition__Group__3 ;
    public final void rule__JoyningServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1788:1: ( rule__JoyningServiceDefinition__Group__2__Impl rule__JoyningServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:1789:2: rule__JoyningServiceDefinition__Group__2__Impl rule__JoyningServiceDefinition__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalServiceDefinition.g:1796:1: rule__JoyningServiceDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__JoyningServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1800:1: ( ( '{' ) )
            // InternalServiceDefinition.g:1801:1: ( '{' )
            {
            // InternalServiceDefinition.g:1801:1: ( '{' )
            // InternalServiceDefinition.g:1802:2: '{'
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
    // InternalServiceDefinition.g:1811:1: rule__JoyningServiceDefinition__Group__3 : rule__JoyningServiceDefinition__Group__3__Impl rule__JoyningServiceDefinition__Group__4 ;
    public final void rule__JoyningServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1815:1: ( rule__JoyningServiceDefinition__Group__3__Impl rule__JoyningServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:1816:2: rule__JoyningServiceDefinition__Group__3__Impl rule__JoyningServiceDefinition__Group__4
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
    // InternalServiceDefinition.g:1823:1: rule__JoyningServiceDefinition__Group__3__Impl : ( ( rule__JoyningServiceDefinition__PatternAssignment_3 ) ) ;
    public final void rule__JoyningServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1827:1: ( ( ( rule__JoyningServiceDefinition__PatternAssignment_3 ) ) )
            // InternalServiceDefinition.g:1828:1: ( ( rule__JoyningServiceDefinition__PatternAssignment_3 ) )
            {
            // InternalServiceDefinition.g:1828:1: ( ( rule__JoyningServiceDefinition__PatternAssignment_3 ) )
            // InternalServiceDefinition.g:1829:2: ( rule__JoyningServiceDefinition__PatternAssignment_3 )
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPatternAssignment_3()); 
            // InternalServiceDefinition.g:1830:2: ( rule__JoyningServiceDefinition__PatternAssignment_3 )
            // InternalServiceDefinition.g:1830:3: rule__JoyningServiceDefinition__PatternAssignment_3
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
    // InternalServiceDefinition.g:1838:1: rule__JoyningServiceDefinition__Group__4 : rule__JoyningServiceDefinition__Group__4__Impl rule__JoyningServiceDefinition__Group__5 ;
    public final void rule__JoyningServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1842:1: ( rule__JoyningServiceDefinition__Group__4__Impl rule__JoyningServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:1843:2: rule__JoyningServiceDefinition__Group__4__Impl rule__JoyningServiceDefinition__Group__5
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
    // InternalServiceDefinition.g:1850:1: rule__JoyningServiceDefinition__Group__4__Impl : ( ( rule__JoyningServiceDefinition__PropertiesAssignment_4 )* ) ;
    public final void rule__JoyningServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1854:1: ( ( ( rule__JoyningServiceDefinition__PropertiesAssignment_4 )* ) )
            // InternalServiceDefinition.g:1855:1: ( ( rule__JoyningServiceDefinition__PropertiesAssignment_4 )* )
            {
            // InternalServiceDefinition.g:1855:1: ( ( rule__JoyningServiceDefinition__PropertiesAssignment_4 )* )
            // InternalServiceDefinition.g:1856:2: ( rule__JoyningServiceDefinition__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesAssignment_4()); 
            // InternalServiceDefinition.g:1857:2: ( rule__JoyningServiceDefinition__PropertiesAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==45) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalServiceDefinition.g:1857:3: rule__JoyningServiceDefinition__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__JoyningServiceDefinition__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesAssignment_4()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1865:1: rule__JoyningServiceDefinition__Group__5 : rule__JoyningServiceDefinition__Group__5__Impl ;
    public final void rule__JoyningServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1869:1: ( rule__JoyningServiceDefinition__Group__5__Impl )
            // InternalServiceDefinition.g:1870:2: rule__JoyningServiceDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalServiceDefinition.g:1876:1: rule__JoyningServiceDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__JoyningServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1880:1: ( ( '}' ) )
            // InternalServiceDefinition.g:1881:1: ( '}' )
            {
            // InternalServiceDefinition.g:1881:1: ( '}' )
            // InternalServiceDefinition.g:1882:2: '}'
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getJoyningServiceDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__0"
    // InternalServiceDefinition.g:1892:1: rule__RequestAnswerServiceDefinition__Group__0 : rule__RequestAnswerServiceDefinition__Group__0__Impl rule__RequestAnswerServiceDefinition__Group__1 ;
    public final void rule__RequestAnswerServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1896:1: ( rule__RequestAnswerServiceDefinition__Group__0__Impl rule__RequestAnswerServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:1897:2: rule__RequestAnswerServiceDefinition__Group__0__Impl rule__RequestAnswerServiceDefinition__Group__1
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
    // InternalServiceDefinition.g:1904:1: rule__RequestAnswerServiceDefinition__Group__0__Impl : ( 'RequestAnswerServiceDefinition' ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1908:1: ( ( 'RequestAnswerServiceDefinition' ) )
            // InternalServiceDefinition.g:1909:1: ( 'RequestAnswerServiceDefinition' )
            {
            // InternalServiceDefinition.g:1909:1: ( 'RequestAnswerServiceDefinition' )
            // InternalServiceDefinition.g:1910:2: 'RequestAnswerServiceDefinition'
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRequestAnswerServiceDefinitionKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalServiceDefinition.g:1919:1: rule__RequestAnswerServiceDefinition__Group__1 : rule__RequestAnswerServiceDefinition__Group__1__Impl rule__RequestAnswerServiceDefinition__Group__2 ;
    public final void rule__RequestAnswerServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1923:1: ( rule__RequestAnswerServiceDefinition__Group__1__Impl rule__RequestAnswerServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:1924:2: rule__RequestAnswerServiceDefinition__Group__1__Impl rule__RequestAnswerServiceDefinition__Group__2
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
    // InternalServiceDefinition.g:1931:1: rule__RequestAnswerServiceDefinition__Group__1__Impl : ( ( rule__RequestAnswerServiceDefinition__NameAssignment_1 ) ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1935:1: ( ( ( rule__RequestAnswerServiceDefinition__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:1936:1: ( ( rule__RequestAnswerServiceDefinition__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:1936:1: ( ( rule__RequestAnswerServiceDefinition__NameAssignment_1 ) )
            // InternalServiceDefinition.g:1937:2: ( rule__RequestAnswerServiceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:1938:2: ( rule__RequestAnswerServiceDefinition__NameAssignment_1 )
            // InternalServiceDefinition.g:1938:3: rule__RequestAnswerServiceDefinition__NameAssignment_1
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
    // InternalServiceDefinition.g:1946:1: rule__RequestAnswerServiceDefinition__Group__2 : rule__RequestAnswerServiceDefinition__Group__2__Impl rule__RequestAnswerServiceDefinition__Group__3 ;
    public final void rule__RequestAnswerServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1950:1: ( rule__RequestAnswerServiceDefinition__Group__2__Impl rule__RequestAnswerServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:1951:2: rule__RequestAnswerServiceDefinition__Group__2__Impl rule__RequestAnswerServiceDefinition__Group__3
            {
            pushFollow(FOLLOW_20);
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
    // InternalServiceDefinition.g:1958:1: rule__RequestAnswerServiceDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1962:1: ( ( '{' ) )
            // InternalServiceDefinition.g:1963:1: ( '{' )
            {
            // InternalServiceDefinition.g:1963:1: ( '{' )
            // InternalServiceDefinition.g:1964:2: '{'
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
    // InternalServiceDefinition.g:1973:1: rule__RequestAnswerServiceDefinition__Group__3 : rule__RequestAnswerServiceDefinition__Group__3__Impl rule__RequestAnswerServiceDefinition__Group__4 ;
    public final void rule__RequestAnswerServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1977:1: ( rule__RequestAnswerServiceDefinition__Group__3__Impl rule__RequestAnswerServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:1978:2: rule__RequestAnswerServiceDefinition__Group__3__Impl rule__RequestAnswerServiceDefinition__Group__4
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
    // InternalServiceDefinition.g:1985:1: rule__RequestAnswerServiceDefinition__Group__3__Impl : ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 ) ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1989:1: ( ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 ) ) )
            // InternalServiceDefinition.g:1990:1: ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 ) )
            {
            // InternalServiceDefinition.g:1990:1: ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 ) )
            // InternalServiceDefinition.g:1991:2: ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 )
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternAssignment_3()); 
            // InternalServiceDefinition.g:1992:2: ( rule__RequestAnswerServiceDefinition__PatternAssignment_3 )
            // InternalServiceDefinition.g:1992:3: rule__RequestAnswerServiceDefinition__PatternAssignment_3
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
    // InternalServiceDefinition.g:2000:1: rule__RequestAnswerServiceDefinition__Group__4 : rule__RequestAnswerServiceDefinition__Group__4__Impl rule__RequestAnswerServiceDefinition__Group__5 ;
    public final void rule__RequestAnswerServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2004:1: ( rule__RequestAnswerServiceDefinition__Group__4__Impl rule__RequestAnswerServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:2005:2: rule__RequestAnswerServiceDefinition__Group__4__Impl rule__RequestAnswerServiceDefinition__Group__5
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
    // InternalServiceDefinition.g:2012:1: rule__RequestAnswerServiceDefinition__Group__4__Impl : ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_4 )* ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2016:1: ( ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_4 )* ) )
            // InternalServiceDefinition.g:2017:1: ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_4 )* )
            {
            // InternalServiceDefinition.g:2017:1: ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_4 )* )
            // InternalServiceDefinition.g:2018:2: ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_4 )*
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesAssignment_4()); 
            // InternalServiceDefinition.g:2019:2: ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==45) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalServiceDefinition.g:2019:3: rule__RequestAnswerServiceDefinition__PropertiesAssignment_4
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__RequestAnswerServiceDefinition__PropertiesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesAssignment_4()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:2027:1: rule__RequestAnswerServiceDefinition__Group__5 : rule__RequestAnswerServiceDefinition__Group__5__Impl ;
    public final void rule__RequestAnswerServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2031:1: ( rule__RequestAnswerServiceDefinition__Group__5__Impl )
            // InternalServiceDefinition.g:2032:2: rule__RequestAnswerServiceDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
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
    // InternalServiceDefinition.g:2038:1: rule__RequestAnswerServiceDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2042:1: ( ( '}' ) )
            // InternalServiceDefinition.g:2043:1: ( '}' )
            {
            // InternalServiceDefinition.g:2043:1: ( '}' )
            // InternalServiceDefinition.g:2044:2: '}'
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__0"
    // InternalServiceDefinition.g:2054:1: rule__CoordinationServiceDefinition__Group__0 : rule__CoordinationServiceDefinition__Group__0__Impl rule__CoordinationServiceDefinition__Group__1 ;
    public final void rule__CoordinationServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2058:1: ( rule__CoordinationServiceDefinition__Group__0__Impl rule__CoordinationServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:2059:2: rule__CoordinationServiceDefinition__Group__0__Impl rule__CoordinationServiceDefinition__Group__1
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
    // InternalServiceDefinition.g:2066:1: rule__CoordinationServiceDefinition__Group__0__Impl : ( 'CoordinationServiceDefinition' ) ;
    public final void rule__CoordinationServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2070:1: ( ( 'CoordinationServiceDefinition' ) )
            // InternalServiceDefinition.g:2071:1: ( 'CoordinationServiceDefinition' )
            {
            // InternalServiceDefinition.g:2071:1: ( 'CoordinationServiceDefinition' )
            // InternalServiceDefinition.g:2072:2: 'CoordinationServiceDefinition'
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getCoordinationServiceDefinitionKeyword_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2081:1: rule__CoordinationServiceDefinition__Group__1 : rule__CoordinationServiceDefinition__Group__1__Impl rule__CoordinationServiceDefinition__Group__2 ;
    public final void rule__CoordinationServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2085:1: ( rule__CoordinationServiceDefinition__Group__1__Impl rule__CoordinationServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:2086:2: rule__CoordinationServiceDefinition__Group__1__Impl rule__CoordinationServiceDefinition__Group__2
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
    // InternalServiceDefinition.g:2093:1: rule__CoordinationServiceDefinition__Group__1__Impl : ( ( rule__CoordinationServiceDefinition__NameAssignment_1 ) ) ;
    public final void rule__CoordinationServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2097:1: ( ( ( rule__CoordinationServiceDefinition__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:2098:1: ( ( rule__CoordinationServiceDefinition__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:2098:1: ( ( rule__CoordinationServiceDefinition__NameAssignment_1 ) )
            // InternalServiceDefinition.g:2099:2: ( rule__CoordinationServiceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:2100:2: ( rule__CoordinationServiceDefinition__NameAssignment_1 )
            // InternalServiceDefinition.g:2100:3: rule__CoordinationServiceDefinition__NameAssignment_1
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
    // InternalServiceDefinition.g:2108:1: rule__CoordinationServiceDefinition__Group__2 : rule__CoordinationServiceDefinition__Group__2__Impl rule__CoordinationServiceDefinition__Group__3 ;
    public final void rule__CoordinationServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2112:1: ( rule__CoordinationServiceDefinition__Group__2__Impl rule__CoordinationServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:2113:2: rule__CoordinationServiceDefinition__Group__2__Impl rule__CoordinationServiceDefinition__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalServiceDefinition.g:2120:1: rule__CoordinationServiceDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__CoordinationServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2124:1: ( ( '{' ) )
            // InternalServiceDefinition.g:2125:1: ( '{' )
            {
            // InternalServiceDefinition.g:2125:1: ( '{' )
            // InternalServiceDefinition.g:2126:2: '{'
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
    // InternalServiceDefinition.g:2135:1: rule__CoordinationServiceDefinition__Group__3 : rule__CoordinationServiceDefinition__Group__3__Impl rule__CoordinationServiceDefinition__Group__4 ;
    public final void rule__CoordinationServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2139:1: ( rule__CoordinationServiceDefinition__Group__3__Impl rule__CoordinationServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:2140:2: rule__CoordinationServiceDefinition__Group__3__Impl rule__CoordinationServiceDefinition__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalServiceDefinition.g:2147:1: rule__CoordinationServiceDefinition__Group__3__Impl : ( ( rule__CoordinationServiceDefinition__UnorderedGroup_3 ) ) ;
    public final void rule__CoordinationServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2151:1: ( ( ( rule__CoordinationServiceDefinition__UnorderedGroup_3 ) ) )
            // InternalServiceDefinition.g:2152:1: ( ( rule__CoordinationServiceDefinition__UnorderedGroup_3 ) )
            {
            // InternalServiceDefinition.g:2152:1: ( ( rule__CoordinationServiceDefinition__UnorderedGroup_3 ) )
            // InternalServiceDefinition.g:2153:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3 )
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3()); 
            // InternalServiceDefinition.g:2154:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3 )
            // InternalServiceDefinition.g:2154:3: rule__CoordinationServiceDefinition__UnorderedGroup_3
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
    // InternalServiceDefinition.g:2162:1: rule__CoordinationServiceDefinition__Group__4 : rule__CoordinationServiceDefinition__Group__4__Impl rule__CoordinationServiceDefinition__Group__5 ;
    public final void rule__CoordinationServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2166:1: ( rule__CoordinationServiceDefinition__Group__4__Impl rule__CoordinationServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:2167:2: rule__CoordinationServiceDefinition__Group__4__Impl rule__CoordinationServiceDefinition__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalServiceDefinition.g:2174:1: rule__CoordinationServiceDefinition__Group__4__Impl : ( ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )* ) ;
    public final void rule__CoordinationServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2178:1: ( ( ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )* ) )
            // InternalServiceDefinition.g:2179:1: ( ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )* )
            {
            // InternalServiceDefinition.g:2179:1: ( ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )* )
            // InternalServiceDefinition.g:2180:2: ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )*
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesAssignment_4()); 
            // InternalServiceDefinition.g:2181:2: ( rule__CoordinationServiceDefinition__ServicesAssignment_4 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==24) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalServiceDefinition.g:2181:3: rule__CoordinationServiceDefinition__ServicesAssignment_4
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__CoordinationServiceDefinition__ServicesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
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
    // InternalServiceDefinition.g:2189:1: rule__CoordinationServiceDefinition__Group__5 : rule__CoordinationServiceDefinition__Group__5__Impl rule__CoordinationServiceDefinition__Group__6 ;
    public final void rule__CoordinationServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2193:1: ( rule__CoordinationServiceDefinition__Group__5__Impl rule__CoordinationServiceDefinition__Group__6 )
            // InternalServiceDefinition.g:2194:2: rule__CoordinationServiceDefinition__Group__5__Impl rule__CoordinationServiceDefinition__Group__6
            {
            pushFollow(FOLLOW_22);
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
    // InternalServiceDefinition.g:2201:1: rule__CoordinationServiceDefinition__Group__5__Impl : ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )* ) ;
    public final void rule__CoordinationServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2205:1: ( ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )* ) )
            // InternalServiceDefinition.g:2206:1: ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )* )
            {
            // InternalServiceDefinition.g:2206:1: ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )* )
            // InternalServiceDefinition.g:2207:2: ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesAssignment_5()); 
            // InternalServiceDefinition.g:2208:2: ( rule__CoordinationServiceDefinition__PropertiesAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==45) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalServiceDefinition.g:2208:3: rule__CoordinationServiceDefinition__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__CoordinationServiceDefinition__PropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalServiceDefinition.g:2216:1: rule__CoordinationServiceDefinition__Group__6 : rule__CoordinationServiceDefinition__Group__6__Impl ;
    public final void rule__CoordinationServiceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2220:1: ( rule__CoordinationServiceDefinition__Group__6__Impl )
            // InternalServiceDefinition.g:2221:2: rule__CoordinationServiceDefinition__Group__6__Impl
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
    // InternalServiceDefinition.g:2227:1: rule__CoordinationServiceDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__CoordinationServiceDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2231:1: ( ( '}' ) )
            // InternalServiceDefinition.g:2232:1: ( '}' )
            {
            // InternalServiceDefinition.g:2232:1: ( '}' )
            // InternalServiceDefinition.g:2233:2: '}'
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


    // $ANTLR start "rule__CommunicationServiceUsage__Group__0"
    // InternalServiceDefinition.g:2243:1: rule__CommunicationServiceUsage__Group__0 : rule__CommunicationServiceUsage__Group__0__Impl rule__CommunicationServiceUsage__Group__1 ;
    public final void rule__CommunicationServiceUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2247:1: ( rule__CommunicationServiceUsage__Group__0__Impl rule__CommunicationServiceUsage__Group__1 )
            // InternalServiceDefinition.g:2248:2: rule__CommunicationServiceUsage__Group__0__Impl rule__CommunicationServiceUsage__Group__1
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
    // InternalServiceDefinition.g:2255:1: rule__CommunicationServiceUsage__Group__0__Impl : ( 'CommunicationServiceUsage' ) ;
    public final void rule__CommunicationServiceUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2259:1: ( ( 'CommunicationServiceUsage' ) )
            // InternalServiceDefinition.g:2260:1: ( 'CommunicationServiceUsage' )
            {
            // InternalServiceDefinition.g:2260:1: ( 'CommunicationServiceUsage' )
            // InternalServiceDefinition.g:2261:2: 'CommunicationServiceUsage'
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getCommunicationServiceUsageKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2270:1: rule__CommunicationServiceUsage__Group__1 : rule__CommunicationServiceUsage__Group__1__Impl rule__CommunicationServiceUsage__Group__2 ;
    public final void rule__CommunicationServiceUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2274:1: ( rule__CommunicationServiceUsage__Group__1__Impl rule__CommunicationServiceUsage__Group__2 )
            // InternalServiceDefinition.g:2275:2: rule__CommunicationServiceUsage__Group__1__Impl rule__CommunicationServiceUsage__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalServiceDefinition.g:2282:1: rule__CommunicationServiceUsage__Group__1__Impl : ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) ) ;
    public final void rule__CommunicationServiceUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2286:1: ( ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:2287:1: ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:2287:1: ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) )
            // InternalServiceDefinition.g:2288:2: ( rule__CommunicationServiceUsage__NameAssignment_1 )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:2289:2: ( rule__CommunicationServiceUsage__NameAssignment_1 )
            // InternalServiceDefinition.g:2289:3: rule__CommunicationServiceUsage__NameAssignment_1
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
    // InternalServiceDefinition.g:2297:1: rule__CommunicationServiceUsage__Group__2 : rule__CommunicationServiceUsage__Group__2__Impl rule__CommunicationServiceUsage__Group__3 ;
    public final void rule__CommunicationServiceUsage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2301:1: ( rule__CommunicationServiceUsage__Group__2__Impl rule__CommunicationServiceUsage__Group__3 )
            // InternalServiceDefinition.g:2302:2: rule__CommunicationServiceUsage__Group__2__Impl rule__CommunicationServiceUsage__Group__3
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
    // InternalServiceDefinition.g:2309:1: rule__CommunicationServiceUsage__Group__2__Impl : ( 'uses' ) ;
    public final void rule__CommunicationServiceUsage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2313:1: ( ( 'uses' ) )
            // InternalServiceDefinition.g:2314:1: ( 'uses' )
            {
            // InternalServiceDefinition.g:2314:1: ( 'uses' )
            // InternalServiceDefinition.g:2315:2: 'uses'
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getUsesKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2324:1: rule__CommunicationServiceUsage__Group__3 : rule__CommunicationServiceUsage__Group__3__Impl ;
    public final void rule__CommunicationServiceUsage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2328:1: ( rule__CommunicationServiceUsage__Group__3__Impl )
            // InternalServiceDefinition.g:2329:2: rule__CommunicationServiceUsage__Group__3__Impl
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
    // InternalServiceDefinition.g:2335:1: rule__CommunicationServiceUsage__Group__3__Impl : ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) ) ;
    public final void rule__CommunicationServiceUsage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2339:1: ( ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) ) )
            // InternalServiceDefinition.g:2340:1: ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) )
            {
            // InternalServiceDefinition.g:2340:1: ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) )
            // InternalServiceDefinition.g:2341:2: ( rule__CommunicationServiceUsage__UsesAssignment_3 )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getUsesAssignment_3()); 
            // InternalServiceDefinition.g:2342:2: ( rule__CommunicationServiceUsage__UsesAssignment_3 )
            // InternalServiceDefinition.g:2342:3: rule__CommunicationServiceUsage__UsesAssignment_3
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
    // InternalServiceDefinition.g:2351:1: rule__StatePattern__Group__0 : rule__StatePattern__Group__0__Impl rule__StatePattern__Group__1 ;
    public final void rule__StatePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2355:1: ( rule__StatePattern__Group__0__Impl rule__StatePattern__Group__1 )
            // InternalServiceDefinition.g:2356:2: rule__StatePattern__Group__0__Impl rule__StatePattern__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalServiceDefinition.g:2363:1: rule__StatePattern__Group__0__Impl : ( () ) ;
    public final void rule__StatePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2367:1: ( ( () ) )
            // InternalServiceDefinition.g:2368:1: ( () )
            {
            // InternalServiceDefinition.g:2368:1: ( () )
            // InternalServiceDefinition.g:2369:2: ()
            {
             before(grammarAccess.getStatePatternAccess().getStatePatternAction_0()); 
            // InternalServiceDefinition.g:2370:2: ()
            // InternalServiceDefinition.g:2370:3: 
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
    // InternalServiceDefinition.g:2378:1: rule__StatePattern__Group__1 : rule__StatePattern__Group__1__Impl rule__StatePattern__Group__2 ;
    public final void rule__StatePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2382:1: ( rule__StatePattern__Group__1__Impl rule__StatePattern__Group__2 )
            // InternalServiceDefinition.g:2383:2: rule__StatePattern__Group__1__Impl rule__StatePattern__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalServiceDefinition.g:2390:1: rule__StatePattern__Group__1__Impl : ( 'StatePattern' ) ;
    public final void rule__StatePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2394:1: ( ( 'StatePattern' ) )
            // InternalServiceDefinition.g:2395:1: ( 'StatePattern' )
            {
            // InternalServiceDefinition.g:2395:1: ( 'StatePattern' )
            // InternalServiceDefinition.g:2396:2: 'StatePattern'
            {
             before(grammarAccess.getStatePatternAccess().getStatePatternKeyword_1()); 
            match(input,26,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2405:1: rule__StatePattern__Group__2 : rule__StatePattern__Group__2__Impl rule__StatePattern__Group__3 ;
    public final void rule__StatePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2409:1: ( rule__StatePattern__Group__2__Impl rule__StatePattern__Group__3 )
            // InternalServiceDefinition.g:2410:2: rule__StatePattern__Group__2__Impl rule__StatePattern__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalServiceDefinition.g:2417:1: rule__StatePattern__Group__2__Impl : ( '<' ) ;
    public final void rule__StatePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2421:1: ( ( '<' ) )
            // InternalServiceDefinition.g:2422:1: ( '<' )
            {
            // InternalServiceDefinition.g:2422:1: ( '<' )
            // InternalServiceDefinition.g:2423:2: '<'
            {
             before(grammarAccess.getStatePatternAccess().getLessThanSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2432:1: rule__StatePattern__Group__3 : rule__StatePattern__Group__3__Impl rule__StatePattern__Group__4 ;
    public final void rule__StatePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2436:1: ( rule__StatePattern__Group__3__Impl rule__StatePattern__Group__4 )
            // InternalServiceDefinition.g:2437:2: rule__StatePattern__Group__3__Impl rule__StatePattern__Group__4
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
    // InternalServiceDefinition.g:2444:1: rule__StatePattern__Group__3__Impl : ( 'lifecycle' ) ;
    public final void rule__StatePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2448:1: ( ( 'lifecycle' ) )
            // InternalServiceDefinition.g:2449:1: ( 'lifecycle' )
            {
            // InternalServiceDefinition.g:2449:1: ( 'lifecycle' )
            // InternalServiceDefinition.g:2450:2: 'lifecycle'
            {
             before(grammarAccess.getStatePatternAccess().getLifecycleKeyword_3()); 
            match(input,28,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2459:1: rule__StatePattern__Group__4 : rule__StatePattern__Group__4__Impl rule__StatePattern__Group__5 ;
    public final void rule__StatePattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2463:1: ( rule__StatePattern__Group__4__Impl rule__StatePattern__Group__5 )
            // InternalServiceDefinition.g:2464:2: rule__StatePattern__Group__4__Impl rule__StatePattern__Group__5
            {
            pushFollow(FOLLOW_28);
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
    // InternalServiceDefinition.g:2471:1: rule__StatePattern__Group__4__Impl : ( ( rule__StatePattern__LifecycleAssignment_4 ) ) ;
    public final void rule__StatePattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2475:1: ( ( ( rule__StatePattern__LifecycleAssignment_4 ) ) )
            // InternalServiceDefinition.g:2476:1: ( ( rule__StatePattern__LifecycleAssignment_4 ) )
            {
            // InternalServiceDefinition.g:2476:1: ( ( rule__StatePattern__LifecycleAssignment_4 ) )
            // InternalServiceDefinition.g:2477:2: ( rule__StatePattern__LifecycleAssignment_4 )
            {
             before(grammarAccess.getStatePatternAccess().getLifecycleAssignment_4()); 
            // InternalServiceDefinition.g:2478:2: ( rule__StatePattern__LifecycleAssignment_4 )
            // InternalServiceDefinition.g:2478:3: rule__StatePattern__LifecycleAssignment_4
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
    // InternalServiceDefinition.g:2486:1: rule__StatePattern__Group__5 : rule__StatePattern__Group__5__Impl rule__StatePattern__Group__6 ;
    public final void rule__StatePattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2490:1: ( rule__StatePattern__Group__5__Impl rule__StatePattern__Group__6 )
            // InternalServiceDefinition.g:2491:2: rule__StatePattern__Group__5__Impl rule__StatePattern__Group__6
            {
            pushFollow(FOLLOW_28);
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
    // InternalServiceDefinition.g:2498:1: rule__StatePattern__Group__5__Impl : ( ( rule__StatePattern__Group_5__0 )? ) ;
    public final void rule__StatePattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2502:1: ( ( ( rule__StatePattern__Group_5__0 )? ) )
            // InternalServiceDefinition.g:2503:1: ( ( rule__StatePattern__Group_5__0 )? )
            {
            // InternalServiceDefinition.g:2503:1: ( ( rule__StatePattern__Group_5__0 )? )
            // InternalServiceDefinition.g:2504:2: ( rule__StatePattern__Group_5__0 )?
            {
             before(grammarAccess.getStatePatternAccess().getGroup_5()); 
            // InternalServiceDefinition.g:2505:2: ( rule__StatePattern__Group_5__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalServiceDefinition.g:2505:3: rule__StatePattern__Group_5__0
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
    // InternalServiceDefinition.g:2513:1: rule__StatePattern__Group__6 : rule__StatePattern__Group__6__Impl ;
    public final void rule__StatePattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2517:1: ( rule__StatePattern__Group__6__Impl )
            // InternalServiceDefinition.g:2518:2: rule__StatePattern__Group__6__Impl
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
    // InternalServiceDefinition.g:2524:1: rule__StatePattern__Group__6__Impl : ( '>' ) ;
    public final void rule__StatePattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2528:1: ( ( '>' ) )
            // InternalServiceDefinition.g:2529:1: ( '>' )
            {
            // InternalServiceDefinition.g:2529:1: ( '>' )
            // InternalServiceDefinition.g:2530:2: '>'
            {
             before(grammarAccess.getStatePatternAccess().getGreaterThanSignKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2540:1: rule__StatePattern__Group_5__0 : rule__StatePattern__Group_5__0__Impl rule__StatePattern__Group_5__1 ;
    public final void rule__StatePattern__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2544:1: ( rule__StatePattern__Group_5__0__Impl rule__StatePattern__Group_5__1 )
            // InternalServiceDefinition.g:2545:2: rule__StatePattern__Group_5__0__Impl rule__StatePattern__Group_5__1
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
    // InternalServiceDefinition.g:2552:1: rule__StatePattern__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__StatePattern__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2556:1: ( ( 'with' ) )
            // InternalServiceDefinition.g:2557:1: ( 'with' )
            {
            // InternalServiceDefinition.g:2557:1: ( 'with' )
            // InternalServiceDefinition.g:2558:2: 'with'
            {
             before(grammarAccess.getStatePatternAccess().getWithKeyword_5_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2567:1: rule__StatePattern__Group_5__1 : rule__StatePattern__Group_5__1__Impl ;
    public final void rule__StatePattern__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2571:1: ( rule__StatePattern__Group_5__1__Impl )
            // InternalServiceDefinition.g:2572:2: rule__StatePattern__Group_5__1__Impl
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
    // InternalServiceDefinition.g:2578:1: rule__StatePattern__Group_5__1__Impl : ( ( rule__StatePattern__ModesAssignment_5_1 ) ) ;
    public final void rule__StatePattern__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2582:1: ( ( ( rule__StatePattern__ModesAssignment_5_1 ) ) )
            // InternalServiceDefinition.g:2583:1: ( ( rule__StatePattern__ModesAssignment_5_1 ) )
            {
            // InternalServiceDefinition.g:2583:1: ( ( rule__StatePattern__ModesAssignment_5_1 ) )
            // InternalServiceDefinition.g:2584:2: ( rule__StatePattern__ModesAssignment_5_1 )
            {
             before(grammarAccess.getStatePatternAccess().getModesAssignment_5_1()); 
            // InternalServiceDefinition.g:2585:2: ( rule__StatePattern__ModesAssignment_5_1 )
            // InternalServiceDefinition.g:2585:3: rule__StatePattern__ModesAssignment_5_1
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
    // InternalServiceDefinition.g:2594:1: rule__ParameterPattern__Group__0 : rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 ;
    public final void rule__ParameterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2598:1: ( rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 )
            // InternalServiceDefinition.g:2599:2: rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalServiceDefinition.g:2606:1: rule__ParameterPattern__Group__0__Impl : ( () ) ;
    public final void rule__ParameterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2610:1: ( ( () ) )
            // InternalServiceDefinition.g:2611:1: ( () )
            {
            // InternalServiceDefinition.g:2611:1: ( () )
            // InternalServiceDefinition.g:2612:2: ()
            {
             before(grammarAccess.getParameterPatternAccess().getParameterPatternAction_0()); 
            // InternalServiceDefinition.g:2613:2: ()
            // InternalServiceDefinition.g:2613:3: 
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
    // InternalServiceDefinition.g:2621:1: rule__ParameterPattern__Group__1 : rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 ;
    public final void rule__ParameterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2625:1: ( rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 )
            // InternalServiceDefinition.g:2626:2: rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalServiceDefinition.g:2633:1: rule__ParameterPattern__Group__1__Impl : ( 'ParameterPattern' ) ;
    public final void rule__ParameterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2637:1: ( ( 'ParameterPattern' ) )
            // InternalServiceDefinition.g:2638:1: ( 'ParameterPattern' )
            {
            // InternalServiceDefinition.g:2638:1: ( 'ParameterPattern' )
            // InternalServiceDefinition.g:2639:2: 'ParameterPattern'
            {
             before(grammarAccess.getParameterPatternAccess().getParameterPatternKeyword_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2648:1: rule__ParameterPattern__Group__2 : rule__ParameterPattern__Group__2__Impl rule__ParameterPattern__Group__3 ;
    public final void rule__ParameterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2652:1: ( rule__ParameterPattern__Group__2__Impl rule__ParameterPattern__Group__3 )
            // InternalServiceDefinition.g:2653:2: rule__ParameterPattern__Group__2__Impl rule__ParameterPattern__Group__3
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
    // InternalServiceDefinition.g:2660:1: rule__ParameterPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__ParameterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2664:1: ( ( '<' ) )
            // InternalServiceDefinition.g:2665:1: ( '<' )
            {
            // InternalServiceDefinition.g:2665:1: ( '<' )
            // InternalServiceDefinition.g:2666:2: '<'
            {
             before(grammarAccess.getParameterPatternAccess().getLessThanSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2675:1: rule__ParameterPattern__Group__3 : rule__ParameterPattern__Group__3__Impl rule__ParameterPattern__Group__4 ;
    public final void rule__ParameterPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2679:1: ( rule__ParameterPattern__Group__3__Impl rule__ParameterPattern__Group__4 )
            // InternalServiceDefinition.g:2680:2: rule__ParameterPattern__Group__3__Impl rule__ParameterPattern__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalServiceDefinition.g:2687:1: rule__ParameterPattern__Group__3__Impl : ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) ) ;
    public final void rule__ParameterPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2691:1: ( ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) ) )
            // InternalServiceDefinition.g:2692:1: ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) )
            {
            // InternalServiceDefinition.g:2692:1: ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) )
            // InternalServiceDefinition.g:2693:2: ( rule__ParameterPattern__ParameterSetAssignment_3 )
            {
             before(grammarAccess.getParameterPatternAccess().getParameterSetAssignment_3()); 
            // InternalServiceDefinition.g:2694:2: ( rule__ParameterPattern__ParameterSetAssignment_3 )
            // InternalServiceDefinition.g:2694:3: rule__ParameterPattern__ParameterSetAssignment_3
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
    // InternalServiceDefinition.g:2702:1: rule__ParameterPattern__Group__4 : rule__ParameterPattern__Group__4__Impl ;
    public final void rule__ParameterPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2706:1: ( rule__ParameterPattern__Group__4__Impl )
            // InternalServiceDefinition.g:2707:2: rule__ParameterPattern__Group__4__Impl
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
    // InternalServiceDefinition.g:2713:1: rule__ParameterPattern__Group__4__Impl : ( '>' ) ;
    public final void rule__ParameterPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2717:1: ( ( '>' ) )
            // InternalServiceDefinition.g:2718:1: ( '>' )
            {
            // InternalServiceDefinition.g:2718:1: ( '>' )
            // InternalServiceDefinition.g:2719:2: '>'
            {
             before(grammarAccess.getParameterPatternAccess().getGreaterThanSignKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2729:1: rule__DynamicWiringPattern__Group__0 : rule__DynamicWiringPattern__Group__0__Impl rule__DynamicWiringPattern__Group__1 ;
    public final void rule__DynamicWiringPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2733:1: ( rule__DynamicWiringPattern__Group__0__Impl rule__DynamicWiringPattern__Group__1 )
            // InternalServiceDefinition.g:2734:2: rule__DynamicWiringPattern__Group__0__Impl rule__DynamicWiringPattern__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalServiceDefinition.g:2741:1: rule__DynamicWiringPattern__Group__0__Impl : ( () ) ;
    public final void rule__DynamicWiringPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2745:1: ( ( () ) )
            // InternalServiceDefinition.g:2746:1: ( () )
            {
            // InternalServiceDefinition.g:2746:1: ( () )
            // InternalServiceDefinition.g:2747:2: ()
            {
             before(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternAction_0()); 
            // InternalServiceDefinition.g:2748:2: ()
            // InternalServiceDefinition.g:2748:3: 
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
    // InternalServiceDefinition.g:2756:1: rule__DynamicWiringPattern__Group__1 : rule__DynamicWiringPattern__Group__1__Impl ;
    public final void rule__DynamicWiringPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2760:1: ( rule__DynamicWiringPattern__Group__1__Impl )
            // InternalServiceDefinition.g:2761:2: rule__DynamicWiringPattern__Group__1__Impl
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
    // InternalServiceDefinition.g:2767:1: rule__DynamicWiringPattern__Group__1__Impl : ( 'DynamicWiringPattern' ) ;
    public final void rule__DynamicWiringPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2771:1: ( ( 'DynamicWiringPattern' ) )
            // InternalServiceDefinition.g:2772:1: ( 'DynamicWiringPattern' )
            {
            // InternalServiceDefinition.g:2772:1: ( 'DynamicWiringPattern' )
            // InternalServiceDefinition.g:2773:2: 'DynamicWiringPattern'
            {
             before(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2783:1: rule__MonitoringPattern__Group__0 : rule__MonitoringPattern__Group__0__Impl rule__MonitoringPattern__Group__1 ;
    public final void rule__MonitoringPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2787:1: ( rule__MonitoringPattern__Group__0__Impl rule__MonitoringPattern__Group__1 )
            // InternalServiceDefinition.g:2788:2: rule__MonitoringPattern__Group__0__Impl rule__MonitoringPattern__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalServiceDefinition.g:2795:1: rule__MonitoringPattern__Group__0__Impl : ( () ) ;
    public final void rule__MonitoringPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2799:1: ( ( () ) )
            // InternalServiceDefinition.g:2800:1: ( () )
            {
            // InternalServiceDefinition.g:2800:1: ( () )
            // InternalServiceDefinition.g:2801:2: ()
            {
             before(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternAction_0()); 
            // InternalServiceDefinition.g:2802:2: ()
            // InternalServiceDefinition.g:2802:3: 
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
    // InternalServiceDefinition.g:2810:1: rule__MonitoringPattern__Group__1 : rule__MonitoringPattern__Group__1__Impl ;
    public final void rule__MonitoringPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2814:1: ( rule__MonitoringPattern__Group__1__Impl )
            // InternalServiceDefinition.g:2815:2: rule__MonitoringPattern__Group__1__Impl
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
    // InternalServiceDefinition.g:2821:1: rule__MonitoringPattern__Group__1__Impl : ( 'MonitoringPattern' ) ;
    public final void rule__MonitoringPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2825:1: ( ( 'MonitoringPattern' ) )
            // InternalServiceDefinition.g:2826:1: ( 'MonitoringPattern' )
            {
            // InternalServiceDefinition.g:2826:1: ( 'MonitoringPattern' )
            // InternalServiceDefinition.g:2827:2: 'MonitoringPattern'
            {
             before(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2837:1: rule__PushPattern__Group__0 : rule__PushPattern__Group__0__Impl rule__PushPattern__Group__1 ;
    public final void rule__PushPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2841:1: ( rule__PushPattern__Group__0__Impl rule__PushPattern__Group__1 )
            // InternalServiceDefinition.g:2842:2: rule__PushPattern__Group__0__Impl rule__PushPattern__Group__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalServiceDefinition.g:2849:1: rule__PushPattern__Group__0__Impl : ( () ) ;
    public final void rule__PushPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2853:1: ( ( () ) )
            // InternalServiceDefinition.g:2854:1: ( () )
            {
            // InternalServiceDefinition.g:2854:1: ( () )
            // InternalServiceDefinition.g:2855:2: ()
            {
             before(grammarAccess.getPushPatternAccess().getPushPatternAction_0()); 
            // InternalServiceDefinition.g:2856:2: ()
            // InternalServiceDefinition.g:2856:3: 
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
    // InternalServiceDefinition.g:2864:1: rule__PushPattern__Group__1 : rule__PushPattern__Group__1__Impl rule__PushPattern__Group__2 ;
    public final void rule__PushPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2868:1: ( rule__PushPattern__Group__1__Impl rule__PushPattern__Group__2 )
            // InternalServiceDefinition.g:2869:2: rule__PushPattern__Group__1__Impl rule__PushPattern__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalServiceDefinition.g:2876:1: rule__PushPattern__Group__1__Impl : ( 'PushPattern' ) ;
    public final void rule__PushPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2880:1: ( ( 'PushPattern' ) )
            // InternalServiceDefinition.g:2881:1: ( 'PushPattern' )
            {
            // InternalServiceDefinition.g:2881:1: ( 'PushPattern' )
            // InternalServiceDefinition.g:2882:2: 'PushPattern'
            {
             before(grammarAccess.getPushPatternAccess().getPushPatternKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2891:1: rule__PushPattern__Group__2 : rule__PushPattern__Group__2__Impl rule__PushPattern__Group__3 ;
    public final void rule__PushPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2895:1: ( rule__PushPattern__Group__2__Impl rule__PushPattern__Group__3 )
            // InternalServiceDefinition.g:2896:2: rule__PushPattern__Group__2__Impl rule__PushPattern__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalServiceDefinition.g:2903:1: rule__PushPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__PushPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2907:1: ( ( '<' ) )
            // InternalServiceDefinition.g:2908:1: ( '<' )
            {
            // InternalServiceDefinition.g:2908:1: ( '<' )
            // InternalServiceDefinition.g:2909:2: '<'
            {
             before(grammarAccess.getPushPatternAccess().getLessThanSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2918:1: rule__PushPattern__Group__3 : rule__PushPattern__Group__3__Impl rule__PushPattern__Group__4 ;
    public final void rule__PushPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2922:1: ( rule__PushPattern__Group__3__Impl rule__PushPattern__Group__4 )
            // InternalServiceDefinition.g:2923:2: rule__PushPattern__Group__3__Impl rule__PushPattern__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalServiceDefinition.g:2930:1: rule__PushPattern__Group__3__Impl : ( 'DataType' ) ;
    public final void rule__PushPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2934:1: ( ( 'DataType' ) )
            // InternalServiceDefinition.g:2935:1: ( 'DataType' )
            {
            // InternalServiceDefinition.g:2935:1: ( 'DataType' )
            // InternalServiceDefinition.g:2936:2: 'DataType'
            {
             before(grammarAccess.getPushPatternAccess().getDataTypeKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2945:1: rule__PushPattern__Group__4 : rule__PushPattern__Group__4__Impl rule__PushPattern__Group__5 ;
    public final void rule__PushPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2949:1: ( rule__PushPattern__Group__4__Impl rule__PushPattern__Group__5 )
            // InternalServiceDefinition.g:2950:2: rule__PushPattern__Group__4__Impl rule__PushPattern__Group__5
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
    // InternalServiceDefinition.g:2957:1: rule__PushPattern__Group__4__Impl : ( '=' ) ;
    public final void rule__PushPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2961:1: ( ( '=' ) )
            // InternalServiceDefinition.g:2962:1: ( '=' )
            {
            // InternalServiceDefinition.g:2962:1: ( '=' )
            // InternalServiceDefinition.g:2963:2: '='
            {
             before(grammarAccess.getPushPatternAccess().getEqualsSignKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2972:1: rule__PushPattern__Group__5 : rule__PushPattern__Group__5__Impl rule__PushPattern__Group__6 ;
    public final void rule__PushPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2976:1: ( rule__PushPattern__Group__5__Impl rule__PushPattern__Group__6 )
            // InternalServiceDefinition.g:2977:2: rule__PushPattern__Group__5__Impl rule__PushPattern__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalServiceDefinition.g:2984:1: rule__PushPattern__Group__5__Impl : ( ( rule__PushPattern__DataTypeAssignment_5 ) ) ;
    public final void rule__PushPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2988:1: ( ( ( rule__PushPattern__DataTypeAssignment_5 ) ) )
            // InternalServiceDefinition.g:2989:1: ( ( rule__PushPattern__DataTypeAssignment_5 ) )
            {
            // InternalServiceDefinition.g:2989:1: ( ( rule__PushPattern__DataTypeAssignment_5 ) )
            // InternalServiceDefinition.g:2990:2: ( rule__PushPattern__DataTypeAssignment_5 )
            {
             before(grammarAccess.getPushPatternAccess().getDataTypeAssignment_5()); 
            // InternalServiceDefinition.g:2991:2: ( rule__PushPattern__DataTypeAssignment_5 )
            // InternalServiceDefinition.g:2991:3: rule__PushPattern__DataTypeAssignment_5
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
    // InternalServiceDefinition.g:2999:1: rule__PushPattern__Group__6 : rule__PushPattern__Group__6__Impl ;
    public final void rule__PushPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3003:1: ( rule__PushPattern__Group__6__Impl )
            // InternalServiceDefinition.g:3004:2: rule__PushPattern__Group__6__Impl
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
    // InternalServiceDefinition.g:3010:1: rule__PushPattern__Group__6__Impl : ( '>' ) ;
    public final void rule__PushPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3014:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3015:1: ( '>' )
            {
            // InternalServiceDefinition.g:3015:1: ( '>' )
            // InternalServiceDefinition.g:3016:2: '>'
            {
             before(grammarAccess.getPushPatternAccess().getGreaterThanSignKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3026:1: rule__EventPattern__Group__0 : rule__EventPattern__Group__0__Impl rule__EventPattern__Group__1 ;
    public final void rule__EventPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3030:1: ( rule__EventPattern__Group__0__Impl rule__EventPattern__Group__1 )
            // InternalServiceDefinition.g:3031:2: rule__EventPattern__Group__0__Impl rule__EventPattern__Group__1
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
    // InternalServiceDefinition.g:3038:1: rule__EventPattern__Group__0__Impl : ( () ) ;
    public final void rule__EventPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3042:1: ( ( () ) )
            // InternalServiceDefinition.g:3043:1: ( () )
            {
            // InternalServiceDefinition.g:3043:1: ( () )
            // InternalServiceDefinition.g:3044:2: ()
            {
             before(grammarAccess.getEventPatternAccess().getEventPatternAction_0()); 
            // InternalServiceDefinition.g:3045:2: ()
            // InternalServiceDefinition.g:3045:3: 
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
    // InternalServiceDefinition.g:3053:1: rule__EventPattern__Group__1 : rule__EventPattern__Group__1__Impl rule__EventPattern__Group__2 ;
    public final void rule__EventPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3057:1: ( rule__EventPattern__Group__1__Impl rule__EventPattern__Group__2 )
            // InternalServiceDefinition.g:3058:2: rule__EventPattern__Group__1__Impl rule__EventPattern__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalServiceDefinition.g:3065:1: rule__EventPattern__Group__1__Impl : ( 'EventPattern' ) ;
    public final void rule__EventPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3069:1: ( ( 'EventPattern' ) )
            // InternalServiceDefinition.g:3070:1: ( 'EventPattern' )
            {
            // InternalServiceDefinition.g:3070:1: ( 'EventPattern' )
            // InternalServiceDefinition.g:3071:2: 'EventPattern'
            {
             before(grammarAccess.getEventPatternAccess().getEventPatternKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3080:1: rule__EventPattern__Group__2 : rule__EventPattern__Group__2__Impl rule__EventPattern__Group__3 ;
    public final void rule__EventPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3084:1: ( rule__EventPattern__Group__2__Impl rule__EventPattern__Group__3 )
            // InternalServiceDefinition.g:3085:2: rule__EventPattern__Group__2__Impl rule__EventPattern__Group__3
            {
            pushFollow(FOLLOW_35);
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
    // InternalServiceDefinition.g:3092:1: rule__EventPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__EventPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3096:1: ( ( '<' ) )
            // InternalServiceDefinition.g:3097:1: ( '<' )
            {
            // InternalServiceDefinition.g:3097:1: ( '<' )
            // InternalServiceDefinition.g:3098:2: '<'
            {
             before(grammarAccess.getEventPatternAccess().getLessThanSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3107:1: rule__EventPattern__Group__3 : rule__EventPattern__Group__3__Impl rule__EventPattern__Group__4 ;
    public final void rule__EventPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3111:1: ( rule__EventPattern__Group__3__Impl rule__EventPattern__Group__4 )
            // InternalServiceDefinition.g:3112:2: rule__EventPattern__Group__3__Impl rule__EventPattern__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalServiceDefinition.g:3119:1: rule__EventPattern__Group__3__Impl : ( ( rule__EventPattern__UnorderedGroup_3 ) ) ;
    public final void rule__EventPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3123:1: ( ( ( rule__EventPattern__UnorderedGroup_3 ) ) )
            // InternalServiceDefinition.g:3124:1: ( ( rule__EventPattern__UnorderedGroup_3 ) )
            {
            // InternalServiceDefinition.g:3124:1: ( ( rule__EventPattern__UnorderedGroup_3 ) )
            // InternalServiceDefinition.g:3125:2: ( rule__EventPattern__UnorderedGroup_3 )
            {
             before(grammarAccess.getEventPatternAccess().getUnorderedGroup_3()); 
            // InternalServiceDefinition.g:3126:2: ( rule__EventPattern__UnorderedGroup_3 )
            // InternalServiceDefinition.g:3126:3: rule__EventPattern__UnorderedGroup_3
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
    // InternalServiceDefinition.g:3134:1: rule__EventPattern__Group__4 : rule__EventPattern__Group__4__Impl ;
    public final void rule__EventPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3138:1: ( rule__EventPattern__Group__4__Impl )
            // InternalServiceDefinition.g:3139:2: rule__EventPattern__Group__4__Impl
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
    // InternalServiceDefinition.g:3145:1: rule__EventPattern__Group__4__Impl : ( '>' ) ;
    public final void rule__EventPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3149:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3150:1: ( '>' )
            {
            // InternalServiceDefinition.g:3150:1: ( '>' )
            // InternalServiceDefinition.g:3151:2: '>'
            {
             before(grammarAccess.getEventPatternAccess().getGreaterThanSignKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3161:1: rule__EventPattern__Group_3_0__0 : rule__EventPattern__Group_3_0__0__Impl rule__EventPattern__Group_3_0__1 ;
    public final void rule__EventPattern__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3165:1: ( rule__EventPattern__Group_3_0__0__Impl rule__EventPattern__Group_3_0__1 )
            // InternalServiceDefinition.g:3166:2: rule__EventPattern__Group_3_0__0__Impl rule__EventPattern__Group_3_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalServiceDefinition.g:3173:1: rule__EventPattern__Group_3_0__0__Impl : ( 'EventType' ) ;
    public final void rule__EventPattern__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3177:1: ( ( 'EventType' ) )
            // InternalServiceDefinition.g:3178:1: ( 'EventType' )
            {
            // InternalServiceDefinition.g:3178:1: ( 'EventType' )
            // InternalServiceDefinition.g:3179:2: 'EventType'
            {
             before(grammarAccess.getEventPatternAccess().getEventTypeKeyword_3_0_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3188:1: rule__EventPattern__Group_3_0__1 : rule__EventPattern__Group_3_0__1__Impl rule__EventPattern__Group_3_0__2 ;
    public final void rule__EventPattern__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3192:1: ( rule__EventPattern__Group_3_0__1__Impl rule__EventPattern__Group_3_0__2 )
            // InternalServiceDefinition.g:3193:2: rule__EventPattern__Group_3_0__1__Impl rule__EventPattern__Group_3_0__2
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
    // InternalServiceDefinition.g:3200:1: rule__EventPattern__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__EventPattern__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3204:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3205:1: ( '=' )
            {
            // InternalServiceDefinition.g:3205:1: ( '=' )
            // InternalServiceDefinition.g:3206:2: '='
            {
             before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_0_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3215:1: rule__EventPattern__Group_3_0__2 : rule__EventPattern__Group_3_0__2__Impl ;
    public final void rule__EventPattern__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3219:1: ( rule__EventPattern__Group_3_0__2__Impl )
            // InternalServiceDefinition.g:3220:2: rule__EventPattern__Group_3_0__2__Impl
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
    // InternalServiceDefinition.g:3226:1: rule__EventPattern__Group_3_0__2__Impl : ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) ) ;
    public final void rule__EventPattern__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3230:1: ( ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) ) )
            // InternalServiceDefinition.g:3231:1: ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) )
            {
            // InternalServiceDefinition.g:3231:1: ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) )
            // InternalServiceDefinition.g:3232:2: ( rule__EventPattern__EventTypeAssignment_3_0_2 )
            {
             before(grammarAccess.getEventPatternAccess().getEventTypeAssignment_3_0_2()); 
            // InternalServiceDefinition.g:3233:2: ( rule__EventPattern__EventTypeAssignment_3_0_2 )
            // InternalServiceDefinition.g:3233:3: rule__EventPattern__EventTypeAssignment_3_0_2
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
    // InternalServiceDefinition.g:3242:1: rule__EventPattern__Group_3_1__0 : rule__EventPattern__Group_3_1__0__Impl rule__EventPattern__Group_3_1__1 ;
    public final void rule__EventPattern__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3246:1: ( rule__EventPattern__Group_3_1__0__Impl rule__EventPattern__Group_3_1__1 )
            // InternalServiceDefinition.g:3247:2: rule__EventPattern__Group_3_1__0__Impl rule__EventPattern__Group_3_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalServiceDefinition.g:3254:1: rule__EventPattern__Group_3_1__0__Impl : ( 'ActivationType' ) ;
    public final void rule__EventPattern__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3258:1: ( ( 'ActivationType' ) )
            // InternalServiceDefinition.g:3259:1: ( 'ActivationType' )
            {
            // InternalServiceDefinition.g:3259:1: ( 'ActivationType' )
            // InternalServiceDefinition.g:3260:2: 'ActivationType'
            {
             before(grammarAccess.getEventPatternAccess().getActivationTypeKeyword_3_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3269:1: rule__EventPattern__Group_3_1__1 : rule__EventPattern__Group_3_1__1__Impl rule__EventPattern__Group_3_1__2 ;
    public final void rule__EventPattern__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3273:1: ( rule__EventPattern__Group_3_1__1__Impl rule__EventPattern__Group_3_1__2 )
            // InternalServiceDefinition.g:3274:2: rule__EventPattern__Group_3_1__1__Impl rule__EventPattern__Group_3_1__2
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
    // InternalServiceDefinition.g:3281:1: rule__EventPattern__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__EventPattern__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3285:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3286:1: ( '=' )
            {
            // InternalServiceDefinition.g:3286:1: ( '=' )
            // InternalServiceDefinition.g:3287:2: '='
            {
             before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3296:1: rule__EventPattern__Group_3_1__2 : rule__EventPattern__Group_3_1__2__Impl ;
    public final void rule__EventPattern__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3300:1: ( rule__EventPattern__Group_3_1__2__Impl )
            // InternalServiceDefinition.g:3301:2: rule__EventPattern__Group_3_1__2__Impl
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
    // InternalServiceDefinition.g:3307:1: rule__EventPattern__Group_3_1__2__Impl : ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) ) ;
    public final void rule__EventPattern__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3311:1: ( ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) ) )
            // InternalServiceDefinition.g:3312:1: ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) )
            {
            // InternalServiceDefinition.g:3312:1: ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) )
            // InternalServiceDefinition.g:3313:2: ( rule__EventPattern__ActivationTypeAssignment_3_1_2 )
            {
             before(grammarAccess.getEventPatternAccess().getActivationTypeAssignment_3_1_2()); 
            // InternalServiceDefinition.g:3314:2: ( rule__EventPattern__ActivationTypeAssignment_3_1_2 )
            // InternalServiceDefinition.g:3314:3: rule__EventPattern__ActivationTypeAssignment_3_1_2
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
    // InternalServiceDefinition.g:3323:1: rule__EventPattern__Group_3_2__0 : rule__EventPattern__Group_3_2__0__Impl rule__EventPattern__Group_3_2__1 ;
    public final void rule__EventPattern__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3327:1: ( rule__EventPattern__Group_3_2__0__Impl rule__EventPattern__Group_3_2__1 )
            // InternalServiceDefinition.g:3328:2: rule__EventPattern__Group_3_2__0__Impl rule__EventPattern__Group_3_2__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalServiceDefinition.g:3335:1: rule__EventPattern__Group_3_2__0__Impl : ( 'EventStateType' ) ;
    public final void rule__EventPattern__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3339:1: ( ( 'EventStateType' ) )
            // InternalServiceDefinition.g:3340:1: ( 'EventStateType' )
            {
            // InternalServiceDefinition.g:3340:1: ( 'EventStateType' )
            // InternalServiceDefinition.g:3341:2: 'EventStateType'
            {
             before(grammarAccess.getEventPatternAccess().getEventStateTypeKeyword_3_2_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3350:1: rule__EventPattern__Group_3_2__1 : rule__EventPattern__Group_3_2__1__Impl rule__EventPattern__Group_3_2__2 ;
    public final void rule__EventPattern__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3354:1: ( rule__EventPattern__Group_3_2__1__Impl rule__EventPattern__Group_3_2__2 )
            // InternalServiceDefinition.g:3355:2: rule__EventPattern__Group_3_2__1__Impl rule__EventPattern__Group_3_2__2
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
    // InternalServiceDefinition.g:3362:1: rule__EventPattern__Group_3_2__1__Impl : ( '=' ) ;
    public final void rule__EventPattern__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3366:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3367:1: ( '=' )
            {
            // InternalServiceDefinition.g:3367:1: ( '=' )
            // InternalServiceDefinition.g:3368:2: '='
            {
             before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_2_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3377:1: rule__EventPattern__Group_3_2__2 : rule__EventPattern__Group_3_2__2__Impl ;
    public final void rule__EventPattern__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3381:1: ( rule__EventPattern__Group_3_2__2__Impl )
            // InternalServiceDefinition.g:3382:2: rule__EventPattern__Group_3_2__2__Impl
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
    // InternalServiceDefinition.g:3388:1: rule__EventPattern__Group_3_2__2__Impl : ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) ) ;
    public final void rule__EventPattern__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3392:1: ( ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) ) )
            // InternalServiceDefinition.g:3393:1: ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) )
            {
            // InternalServiceDefinition.g:3393:1: ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) )
            // InternalServiceDefinition.g:3394:2: ( rule__EventPattern__EventStateTypeAssignment_3_2_2 )
            {
             before(grammarAccess.getEventPatternAccess().getEventStateTypeAssignment_3_2_2()); 
            // InternalServiceDefinition.g:3395:2: ( rule__EventPattern__EventStateTypeAssignment_3_2_2 )
            // InternalServiceDefinition.g:3395:3: rule__EventPattern__EventStateTypeAssignment_3_2_2
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
    // InternalServiceDefinition.g:3404:1: rule__QueryPattern__Group__0 : rule__QueryPattern__Group__0__Impl rule__QueryPattern__Group__1 ;
    public final void rule__QueryPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3408:1: ( rule__QueryPattern__Group__0__Impl rule__QueryPattern__Group__1 )
            // InternalServiceDefinition.g:3409:2: rule__QueryPattern__Group__0__Impl rule__QueryPattern__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalServiceDefinition.g:3416:1: rule__QueryPattern__Group__0__Impl : ( () ) ;
    public final void rule__QueryPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3420:1: ( ( () ) )
            // InternalServiceDefinition.g:3421:1: ( () )
            {
            // InternalServiceDefinition.g:3421:1: ( () )
            // InternalServiceDefinition.g:3422:2: ()
            {
             before(grammarAccess.getQueryPatternAccess().getQueryPatternAction_0()); 
            // InternalServiceDefinition.g:3423:2: ()
            // InternalServiceDefinition.g:3423:3: 
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
    // InternalServiceDefinition.g:3431:1: rule__QueryPattern__Group__1 : rule__QueryPattern__Group__1__Impl rule__QueryPattern__Group__2 ;
    public final void rule__QueryPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3435:1: ( rule__QueryPattern__Group__1__Impl rule__QueryPattern__Group__2 )
            // InternalServiceDefinition.g:3436:2: rule__QueryPattern__Group__1__Impl rule__QueryPattern__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalServiceDefinition.g:3443:1: rule__QueryPattern__Group__1__Impl : ( 'QueryPattern' ) ;
    public final void rule__QueryPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3447:1: ( ( 'QueryPattern' ) )
            // InternalServiceDefinition.g:3448:1: ( 'QueryPattern' )
            {
            // InternalServiceDefinition.g:3448:1: ( 'QueryPattern' )
            // InternalServiceDefinition.g:3449:2: 'QueryPattern'
            {
             before(grammarAccess.getQueryPatternAccess().getQueryPatternKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3458:1: rule__QueryPattern__Group__2 : rule__QueryPattern__Group__2__Impl rule__QueryPattern__Group__3 ;
    public final void rule__QueryPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3462:1: ( rule__QueryPattern__Group__2__Impl rule__QueryPattern__Group__3 )
            // InternalServiceDefinition.g:3463:2: rule__QueryPattern__Group__2__Impl rule__QueryPattern__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalServiceDefinition.g:3470:1: rule__QueryPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__QueryPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3474:1: ( ( '<' ) )
            // InternalServiceDefinition.g:3475:1: ( '<' )
            {
            // InternalServiceDefinition.g:3475:1: ( '<' )
            // InternalServiceDefinition.g:3476:2: '<'
            {
             before(grammarAccess.getQueryPatternAccess().getLessThanSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3485:1: rule__QueryPattern__Group__3 : rule__QueryPattern__Group__3__Impl rule__QueryPattern__Group__4 ;
    public final void rule__QueryPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3489:1: ( rule__QueryPattern__Group__3__Impl rule__QueryPattern__Group__4 )
            // InternalServiceDefinition.g:3490:2: rule__QueryPattern__Group__3__Impl rule__QueryPattern__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalServiceDefinition.g:3497:1: rule__QueryPattern__Group__3__Impl : ( ( rule__QueryPattern__UnorderedGroup_3 ) ) ;
    public final void rule__QueryPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3501:1: ( ( ( rule__QueryPattern__UnorderedGroup_3 ) ) )
            // InternalServiceDefinition.g:3502:1: ( ( rule__QueryPattern__UnorderedGroup_3 ) )
            {
            // InternalServiceDefinition.g:3502:1: ( ( rule__QueryPattern__UnorderedGroup_3 ) )
            // InternalServiceDefinition.g:3503:2: ( rule__QueryPattern__UnorderedGroup_3 )
            {
             before(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3()); 
            // InternalServiceDefinition.g:3504:2: ( rule__QueryPattern__UnorderedGroup_3 )
            // InternalServiceDefinition.g:3504:3: rule__QueryPattern__UnorderedGroup_3
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
    // InternalServiceDefinition.g:3512:1: rule__QueryPattern__Group__4 : rule__QueryPattern__Group__4__Impl ;
    public final void rule__QueryPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3516:1: ( rule__QueryPattern__Group__4__Impl )
            // InternalServiceDefinition.g:3517:2: rule__QueryPattern__Group__4__Impl
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
    // InternalServiceDefinition.g:3523:1: rule__QueryPattern__Group__4__Impl : ( '>' ) ;
    public final void rule__QueryPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3527:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3528:1: ( '>' )
            {
            // InternalServiceDefinition.g:3528:1: ( '>' )
            // InternalServiceDefinition.g:3529:2: '>'
            {
             before(grammarAccess.getQueryPatternAccess().getGreaterThanSignKeyword_4()); 
            match(input,29,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3539:1: rule__QueryPattern__Group_3_0__0 : rule__QueryPattern__Group_3_0__0__Impl rule__QueryPattern__Group_3_0__1 ;
    public final void rule__QueryPattern__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3543:1: ( rule__QueryPattern__Group_3_0__0__Impl rule__QueryPattern__Group_3_0__1 )
            // InternalServiceDefinition.g:3544:2: rule__QueryPattern__Group_3_0__0__Impl rule__QueryPattern__Group_3_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalServiceDefinition.g:3551:1: rule__QueryPattern__Group_3_0__0__Impl : ( 'RequestType' ) ;
    public final void rule__QueryPattern__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3555:1: ( ( 'RequestType' ) )
            // InternalServiceDefinition.g:3556:1: ( 'RequestType' )
            {
            // InternalServiceDefinition.g:3556:1: ( 'RequestType' )
            // InternalServiceDefinition.g:3557:2: 'RequestType'
            {
             before(grammarAccess.getQueryPatternAccess().getRequestTypeKeyword_3_0_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3566:1: rule__QueryPattern__Group_3_0__1 : rule__QueryPattern__Group_3_0__1__Impl rule__QueryPattern__Group_3_0__2 ;
    public final void rule__QueryPattern__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3570:1: ( rule__QueryPattern__Group_3_0__1__Impl rule__QueryPattern__Group_3_0__2 )
            // InternalServiceDefinition.g:3571:2: rule__QueryPattern__Group_3_0__1__Impl rule__QueryPattern__Group_3_0__2
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
    // InternalServiceDefinition.g:3578:1: rule__QueryPattern__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__QueryPattern__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3582:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3583:1: ( '=' )
            {
            // InternalServiceDefinition.g:3583:1: ( '=' )
            // InternalServiceDefinition.g:3584:2: '='
            {
             before(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_0_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3593:1: rule__QueryPattern__Group_3_0__2 : rule__QueryPattern__Group_3_0__2__Impl ;
    public final void rule__QueryPattern__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3597:1: ( rule__QueryPattern__Group_3_0__2__Impl )
            // InternalServiceDefinition.g:3598:2: rule__QueryPattern__Group_3_0__2__Impl
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
    // InternalServiceDefinition.g:3604:1: rule__QueryPattern__Group_3_0__2__Impl : ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) ) ;
    public final void rule__QueryPattern__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3608:1: ( ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) ) )
            // InternalServiceDefinition.g:3609:1: ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) )
            {
            // InternalServiceDefinition.g:3609:1: ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) )
            // InternalServiceDefinition.g:3610:2: ( rule__QueryPattern__RequestTypeAssignment_3_0_2 )
            {
             before(grammarAccess.getQueryPatternAccess().getRequestTypeAssignment_3_0_2()); 
            // InternalServiceDefinition.g:3611:2: ( rule__QueryPattern__RequestTypeAssignment_3_0_2 )
            // InternalServiceDefinition.g:3611:3: rule__QueryPattern__RequestTypeAssignment_3_0_2
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
    // InternalServiceDefinition.g:3620:1: rule__QueryPattern__Group_3_1__0 : rule__QueryPattern__Group_3_1__0__Impl rule__QueryPattern__Group_3_1__1 ;
    public final void rule__QueryPattern__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3624:1: ( rule__QueryPattern__Group_3_1__0__Impl rule__QueryPattern__Group_3_1__1 )
            // InternalServiceDefinition.g:3625:2: rule__QueryPattern__Group_3_1__0__Impl rule__QueryPattern__Group_3_1__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalServiceDefinition.g:3632:1: rule__QueryPattern__Group_3_1__0__Impl : ( 'AnswerType' ) ;
    public final void rule__QueryPattern__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3636:1: ( ( 'AnswerType' ) )
            // InternalServiceDefinition.g:3637:1: ( 'AnswerType' )
            {
            // InternalServiceDefinition.g:3637:1: ( 'AnswerType' )
            // InternalServiceDefinition.g:3638:2: 'AnswerType'
            {
             before(grammarAccess.getQueryPatternAccess().getAnswerTypeKeyword_3_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3647:1: rule__QueryPattern__Group_3_1__1 : rule__QueryPattern__Group_3_1__1__Impl rule__QueryPattern__Group_3_1__2 ;
    public final void rule__QueryPattern__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3651:1: ( rule__QueryPattern__Group_3_1__1__Impl rule__QueryPattern__Group_3_1__2 )
            // InternalServiceDefinition.g:3652:2: rule__QueryPattern__Group_3_1__1__Impl rule__QueryPattern__Group_3_1__2
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
    // InternalServiceDefinition.g:3659:1: rule__QueryPattern__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__QueryPattern__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3663:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3664:1: ( '=' )
            {
            // InternalServiceDefinition.g:3664:1: ( '=' )
            // InternalServiceDefinition.g:3665:2: '='
            {
             before(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_1_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3674:1: rule__QueryPattern__Group_3_1__2 : rule__QueryPattern__Group_3_1__2__Impl ;
    public final void rule__QueryPattern__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3678:1: ( rule__QueryPattern__Group_3_1__2__Impl )
            // InternalServiceDefinition.g:3679:2: rule__QueryPattern__Group_3_1__2__Impl
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
    // InternalServiceDefinition.g:3685:1: rule__QueryPattern__Group_3_1__2__Impl : ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) ) ;
    public final void rule__QueryPattern__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3689:1: ( ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) ) )
            // InternalServiceDefinition.g:3690:1: ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) )
            {
            // InternalServiceDefinition.g:3690:1: ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) )
            // InternalServiceDefinition.g:3691:2: ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 )
            {
             before(grammarAccess.getQueryPatternAccess().getAnswerTypeAssignment_3_1_2()); 
            // InternalServiceDefinition.g:3692:2: ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 )
            // InternalServiceDefinition.g:3692:3: rule__QueryPattern__AnswerTypeAssignment_3_1_2
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
    // InternalServiceDefinition.g:3701:1: rule__SendPattern__Group__0 : rule__SendPattern__Group__0__Impl rule__SendPattern__Group__1 ;
    public final void rule__SendPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3705:1: ( rule__SendPattern__Group__0__Impl rule__SendPattern__Group__1 )
            // InternalServiceDefinition.g:3706:2: rule__SendPattern__Group__0__Impl rule__SendPattern__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalServiceDefinition.g:3713:1: rule__SendPattern__Group__0__Impl : ( () ) ;
    public final void rule__SendPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3717:1: ( ( () ) )
            // InternalServiceDefinition.g:3718:1: ( () )
            {
            // InternalServiceDefinition.g:3718:1: ( () )
            // InternalServiceDefinition.g:3719:2: ()
            {
             before(grammarAccess.getSendPatternAccess().getSendPatternAction_0()); 
            // InternalServiceDefinition.g:3720:2: ()
            // InternalServiceDefinition.g:3720:3: 
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
    // InternalServiceDefinition.g:3728:1: rule__SendPattern__Group__1 : rule__SendPattern__Group__1__Impl rule__SendPattern__Group__2 ;
    public final void rule__SendPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3732:1: ( rule__SendPattern__Group__1__Impl rule__SendPattern__Group__2 )
            // InternalServiceDefinition.g:3733:2: rule__SendPattern__Group__1__Impl rule__SendPattern__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalServiceDefinition.g:3740:1: rule__SendPattern__Group__1__Impl : ( 'SendPattern' ) ;
    public final void rule__SendPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3744:1: ( ( 'SendPattern' ) )
            // InternalServiceDefinition.g:3745:1: ( 'SendPattern' )
            {
            // InternalServiceDefinition.g:3745:1: ( 'SendPattern' )
            // InternalServiceDefinition.g:3746:2: 'SendPattern'
            {
             before(grammarAccess.getSendPatternAccess().getSendPatternKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3755:1: rule__SendPattern__Group__2 : rule__SendPattern__Group__2__Impl rule__SendPattern__Group__3 ;
    public final void rule__SendPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3759:1: ( rule__SendPattern__Group__2__Impl rule__SendPattern__Group__3 )
            // InternalServiceDefinition.g:3760:2: rule__SendPattern__Group__2__Impl rule__SendPattern__Group__3
            {
            pushFollow(FOLLOW_33);
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
    // InternalServiceDefinition.g:3767:1: rule__SendPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__SendPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3771:1: ( ( '<' ) )
            // InternalServiceDefinition.g:3772:1: ( '<' )
            {
            // InternalServiceDefinition.g:3772:1: ( '<' )
            // InternalServiceDefinition.g:3773:2: '<'
            {
             before(grammarAccess.getSendPatternAccess().getLessThanSignKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3782:1: rule__SendPattern__Group__3 : rule__SendPattern__Group__3__Impl rule__SendPattern__Group__4 ;
    public final void rule__SendPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3786:1: ( rule__SendPattern__Group__3__Impl rule__SendPattern__Group__4 )
            // InternalServiceDefinition.g:3787:2: rule__SendPattern__Group__3__Impl rule__SendPattern__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalServiceDefinition.g:3794:1: rule__SendPattern__Group__3__Impl : ( 'DataType' ) ;
    public final void rule__SendPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3798:1: ( ( 'DataType' ) )
            // InternalServiceDefinition.g:3799:1: ( 'DataType' )
            {
            // InternalServiceDefinition.g:3799:1: ( 'DataType' )
            // InternalServiceDefinition.g:3800:2: 'DataType'
            {
             before(grammarAccess.getSendPatternAccess().getDataTypeKeyword_3()); 
            match(input,35,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3809:1: rule__SendPattern__Group__4 : rule__SendPattern__Group__4__Impl rule__SendPattern__Group__5 ;
    public final void rule__SendPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3813:1: ( rule__SendPattern__Group__4__Impl rule__SendPattern__Group__5 )
            // InternalServiceDefinition.g:3814:2: rule__SendPattern__Group__4__Impl rule__SendPattern__Group__5
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
    // InternalServiceDefinition.g:3821:1: rule__SendPattern__Group__4__Impl : ( '=' ) ;
    public final void rule__SendPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3825:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3826:1: ( '=' )
            {
            // InternalServiceDefinition.g:3826:1: ( '=' )
            // InternalServiceDefinition.g:3827:2: '='
            {
             before(grammarAccess.getSendPatternAccess().getEqualsSignKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3836:1: rule__SendPattern__Group__5 : rule__SendPattern__Group__5__Impl rule__SendPattern__Group__6 ;
    public final void rule__SendPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3840:1: ( rule__SendPattern__Group__5__Impl rule__SendPattern__Group__6 )
            // InternalServiceDefinition.g:3841:2: rule__SendPattern__Group__5__Impl rule__SendPattern__Group__6
            {
            pushFollow(FOLLOW_30);
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
    // InternalServiceDefinition.g:3848:1: rule__SendPattern__Group__5__Impl : ( ( rule__SendPattern__DataTypeAssignment_5 ) ) ;
    public final void rule__SendPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3852:1: ( ( ( rule__SendPattern__DataTypeAssignment_5 ) ) )
            // InternalServiceDefinition.g:3853:1: ( ( rule__SendPattern__DataTypeAssignment_5 ) )
            {
            // InternalServiceDefinition.g:3853:1: ( ( rule__SendPattern__DataTypeAssignment_5 ) )
            // InternalServiceDefinition.g:3854:2: ( rule__SendPattern__DataTypeAssignment_5 )
            {
             before(grammarAccess.getSendPatternAccess().getDataTypeAssignment_5()); 
            // InternalServiceDefinition.g:3855:2: ( rule__SendPattern__DataTypeAssignment_5 )
            // InternalServiceDefinition.g:3855:3: rule__SendPattern__DataTypeAssignment_5
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
    // InternalServiceDefinition.g:3863:1: rule__SendPattern__Group__6 : rule__SendPattern__Group__6__Impl ;
    public final void rule__SendPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3867:1: ( rule__SendPattern__Group__6__Impl )
            // InternalServiceDefinition.g:3868:2: rule__SendPattern__Group__6__Impl
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
    // InternalServiceDefinition.g:3874:1: rule__SendPattern__Group__6__Impl : ( '>' ) ;
    public final void rule__SendPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3878:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3879:1: ( '>' )
            {
            // InternalServiceDefinition.g:3879:1: ( '>' )
            // InternalServiceDefinition.g:3880:2: '>'
            {
             before(grammarAccess.getSendPatternAccess().getGreaterThanSignKeyword_6()); 
            match(input,29,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3890:1: rule__ServiceProperty__Group__0 : rule__ServiceProperty__Group__0__Impl rule__ServiceProperty__Group__1 ;
    public final void rule__ServiceProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3894:1: ( rule__ServiceProperty__Group__0__Impl rule__ServiceProperty__Group__1 )
            // InternalServiceDefinition.g:3895:2: rule__ServiceProperty__Group__0__Impl rule__ServiceProperty__Group__1
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
    // InternalServiceDefinition.g:3902:1: rule__ServiceProperty__Group__0__Impl : ( 'ServiceProperty' ) ;
    public final void rule__ServiceProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3906:1: ( ( 'ServiceProperty' ) )
            // InternalServiceDefinition.g:3907:1: ( 'ServiceProperty' )
            {
            // InternalServiceDefinition.g:3907:1: ( 'ServiceProperty' )
            // InternalServiceDefinition.g:3908:2: 'ServiceProperty'
            {
             before(grammarAccess.getServicePropertyAccess().getServicePropertyKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3917:1: rule__ServiceProperty__Group__1 : rule__ServiceProperty__Group__1__Impl rule__ServiceProperty__Group__2 ;
    public final void rule__ServiceProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3921:1: ( rule__ServiceProperty__Group__1__Impl rule__ServiceProperty__Group__2 )
            // InternalServiceDefinition.g:3922:2: rule__ServiceProperty__Group__1__Impl rule__ServiceProperty__Group__2
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
    // InternalServiceDefinition.g:3929:1: rule__ServiceProperty__Group__1__Impl : ( ( rule__ServiceProperty__NameAssignment_1 ) ) ;
    public final void rule__ServiceProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3933:1: ( ( ( rule__ServiceProperty__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:3934:1: ( ( rule__ServiceProperty__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:3934:1: ( ( rule__ServiceProperty__NameAssignment_1 ) )
            // InternalServiceDefinition.g:3935:2: ( rule__ServiceProperty__NameAssignment_1 )
            {
             before(grammarAccess.getServicePropertyAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:3936:2: ( rule__ServiceProperty__NameAssignment_1 )
            // InternalServiceDefinition.g:3936:3: rule__ServiceProperty__NameAssignment_1
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
    // InternalServiceDefinition.g:3944:1: rule__ServiceProperty__Group__2 : rule__ServiceProperty__Group__2__Impl rule__ServiceProperty__Group__3 ;
    public final void rule__ServiceProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3948:1: ( rule__ServiceProperty__Group__2__Impl rule__ServiceProperty__Group__3 )
            // InternalServiceDefinition.g:3949:2: rule__ServiceProperty__Group__2__Impl rule__ServiceProperty__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalServiceDefinition.g:3956:1: rule__ServiceProperty__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3960:1: ( ( '{' ) )
            // InternalServiceDefinition.g:3961:1: ( '{' )
            {
            // InternalServiceDefinition.g:3961:1: ( '{' )
            // InternalServiceDefinition.g:3962:2: '{'
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
    // InternalServiceDefinition.g:3971:1: rule__ServiceProperty__Group__3 : rule__ServiceProperty__Group__3__Impl ;
    public final void rule__ServiceProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3975:1: ( rule__ServiceProperty__Group__3__Impl )
            // InternalServiceDefinition.g:3976:2: rule__ServiceProperty__Group__3__Impl
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
    // InternalServiceDefinition.g:3982:1: rule__ServiceProperty__Group__3__Impl : ( '}' ) ;
    public final void rule__ServiceProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3986:1: ( ( '}' ) )
            // InternalServiceDefinition.g:3987:1: ( '}' )
            {
            // InternalServiceDefinition.g:3987:1: ( '}' )
            // InternalServiceDefinition.g:3988:2: '}'
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
    // InternalServiceDefinition.g:3998:1: rule__CoordinationServiceDefinition__UnorderedGroup_3 : ( rule__CoordinationServiceDefinition__UnorderedGroup_3__0 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3());
        	
        try {
            // InternalServiceDefinition.g:4003:1: ( ( rule__CoordinationServiceDefinition__UnorderedGroup_3__0 )? )
            // InternalServiceDefinition.g:4004:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__0 )?
            {
            // InternalServiceDefinition.g:4004:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( LA19_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt19=1;
            }
            else if ( LA19_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt19=1;
            }
            else if ( LA19_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt19=1;
            }
            else if ( LA19_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalServiceDefinition.g:4004:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__0
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
    // InternalServiceDefinition.g:4012:1: rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 ) ) ) ) ) ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalServiceDefinition.g:4017:1: ( ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 ) ) ) ) ) )
            // InternalServiceDefinition.g:4018:3: ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 ) ) ) ) )
            {
            // InternalServiceDefinition.g:4018:3: ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 ) ) ) ) )
            int alt20=4;
            int LA20_0 = input.LA(1);

            if ( LA20_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt20=1;
            }
            else if ( LA20_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt20=2;
            }
            else if ( LA20_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt20=3;
            }
            else if ( LA20_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                alt20=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalServiceDefinition.g:4019:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4019:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 ) ) ) )
                    // InternalServiceDefinition.g:4020:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalServiceDefinition.g:4020:125: ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 ) ) )
                    // InternalServiceDefinition.g:4021:5: ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4027:5: ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 ) )
                    // InternalServiceDefinition.g:4028:6: ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternAssignment_3_0()); 
                    // InternalServiceDefinition.g:4029:6: ( rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 )
                    // InternalServiceDefinition.g:4029:7: rule__CoordinationServiceDefinition__StatePatternAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__StatePatternAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternAssignment_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalServiceDefinition.g:4034:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4034:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 ) ) ) )
                    // InternalServiceDefinition.g:4035:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalServiceDefinition.g:4035:125: ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 ) ) )
                    // InternalServiceDefinition.g:4036:5: ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4042:5: ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 ) )
                    // InternalServiceDefinition.g:4043:6: ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternAssignment_3_1()); 
                    // InternalServiceDefinition.g:4044:6: ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 )
                    // InternalServiceDefinition.g:4044:7: rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternAssignment_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalServiceDefinition.g:4049:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4049:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 ) ) ) )
                    // InternalServiceDefinition.g:4050:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalServiceDefinition.g:4050:125: ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 ) ) )
                    // InternalServiceDefinition.g:4051:5: ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4057:5: ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 ) )
                    // InternalServiceDefinition.g:4058:6: ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternAssignment_3_2()); 
                    // InternalServiceDefinition.g:4059:6: ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 )
                    // InternalServiceDefinition.g:4059:7: rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternAssignment_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalServiceDefinition.g:4064:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4064:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 ) ) ) )
                    // InternalServiceDefinition.g:4065:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalServiceDefinition.g:4065:125: ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 ) ) )
                    // InternalServiceDefinition.g:4066:5: ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4072:5: ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 ) )
                    // InternalServiceDefinition.g:4073:6: ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternAssignment_3_3()); 
                    // InternalServiceDefinition.g:4074:6: ( rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 )
                    // InternalServiceDefinition.g:4074:7: rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternAssignment_3_3()); 

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
    // InternalServiceDefinition.g:4087:1: rule__CoordinationServiceDefinition__UnorderedGroup_3__0 : rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__1 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4091:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__1 )? )
            // InternalServiceDefinition.g:4092:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_38);
            rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4093:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( LA21_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt21=1;
            }
            else if ( LA21_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt21=1;
            }
            else if ( LA21_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt21=1;
            }
            else if ( LA21_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalServiceDefinition.g:4093:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__1
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
    // InternalServiceDefinition.g:4099:1: rule__CoordinationServiceDefinition__UnorderedGroup_3__1 : rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__2 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4103:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__2 )? )
            // InternalServiceDefinition.g:4104:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_38);
            rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4105:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( LA22_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt22=1;
            }
            else if ( LA22_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt22=1;
            }
            else if ( LA22_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt22=1;
            }
            else if ( LA22_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalServiceDefinition.g:4105:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__2
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
    // InternalServiceDefinition.g:4111:1: rule__CoordinationServiceDefinition__UnorderedGroup_3__2 : rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__3 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4115:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__3 )? )
            // InternalServiceDefinition.g:4116:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_38);
            rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4117:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__3 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 1) ) {
                alt23=1;
            }
            else if ( LA23_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 2) ) {
                alt23=1;
            }
            else if ( LA23_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_3(), 3) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalServiceDefinition.g:4117:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__3
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
    // InternalServiceDefinition.g:4123:1: rule__CoordinationServiceDefinition__UnorderedGroup_3__3 : rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4127:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl )
            // InternalServiceDefinition.g:4128:2: rule__CoordinationServiceDefinition__UnorderedGroup_3__Impl
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
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_3__3"


    // $ANTLR start "rule__EventPattern__UnorderedGroup_3"
    // InternalServiceDefinition.g:4135:1: rule__EventPattern__UnorderedGroup_3 : rule__EventPattern__UnorderedGroup_3__0 {...}?;
    public final void rule__EventPattern__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
        	
        try {
            // InternalServiceDefinition.g:4140:1: ( rule__EventPattern__UnorderedGroup_3__0 {...}?)
            // InternalServiceDefinition.g:4141:2: rule__EventPattern__UnorderedGroup_3__0 {...}?
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
    // InternalServiceDefinition.g:4149:1: rule__EventPattern__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__EventPattern__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalServiceDefinition.g:4154:1: ( ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) ) )
            // InternalServiceDefinition.g:4155:3: ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) )
            {
            // InternalServiceDefinition.g:4155:3: ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) )
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt24=2;
            }
            else if ( LA24_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                alt24=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalServiceDefinition.g:4156:3: ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4156:3: ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) )
                    // InternalServiceDefinition.g:4157:4: {...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EventPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalServiceDefinition.g:4157:108: ( ( ( rule__EventPattern__Group_3_0__0 ) ) )
                    // InternalServiceDefinition.g:4158:5: ( ( rule__EventPattern__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4164:5: ( ( rule__EventPattern__Group_3_0__0 ) )
                    // InternalServiceDefinition.g:4165:6: ( rule__EventPattern__Group_3_0__0 )
                    {
                     before(grammarAccess.getEventPatternAccess().getGroup_3_0()); 
                    // InternalServiceDefinition.g:4166:6: ( rule__EventPattern__Group_3_0__0 )
                    // InternalServiceDefinition.g:4166:7: rule__EventPattern__Group_3_0__0
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
                    // InternalServiceDefinition.g:4171:3: ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4171:3: ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) )
                    // InternalServiceDefinition.g:4172:4: {...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EventPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalServiceDefinition.g:4172:108: ( ( ( rule__EventPattern__Group_3_1__0 ) ) )
                    // InternalServiceDefinition.g:4173:5: ( ( rule__EventPattern__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4179:5: ( ( rule__EventPattern__Group_3_1__0 ) )
                    // InternalServiceDefinition.g:4180:6: ( rule__EventPattern__Group_3_1__0 )
                    {
                     before(grammarAccess.getEventPatternAccess().getGroup_3_1()); 
                    // InternalServiceDefinition.g:4181:6: ( rule__EventPattern__Group_3_1__0 )
                    // InternalServiceDefinition.g:4181:7: rule__EventPattern__Group_3_1__0
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
                    // InternalServiceDefinition.g:4186:3: ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4186:3: ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) )
                    // InternalServiceDefinition.g:4187:4: {...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__EventPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalServiceDefinition.g:4187:108: ( ( ( rule__EventPattern__Group_3_2__0 ) ) )
                    // InternalServiceDefinition.g:4188:5: ( ( rule__EventPattern__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4194:5: ( ( rule__EventPattern__Group_3_2__0 ) )
                    // InternalServiceDefinition.g:4195:6: ( rule__EventPattern__Group_3_2__0 )
                    {
                     before(grammarAccess.getEventPatternAccess().getGroup_3_2()); 
                    // InternalServiceDefinition.g:4196:6: ( rule__EventPattern__Group_3_2__0 )
                    // InternalServiceDefinition.g:4196:7: rule__EventPattern__Group_3_2__0
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
    // InternalServiceDefinition.g:4209:1: rule__EventPattern__UnorderedGroup_3__0 : rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__1 )? ;
    public final void rule__EventPattern__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4213:1: ( rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__1 )? )
            // InternalServiceDefinition.g:4214:2: rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_39);
            rule__EventPattern__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4215:2: ( rule__EventPattern__UnorderedGroup_3__1 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt25=1;
            }
            else if ( LA25_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalServiceDefinition.g:4215:2: rule__EventPattern__UnorderedGroup_3__1
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
    // InternalServiceDefinition.g:4221:1: rule__EventPattern__UnorderedGroup_3__1 : rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__2 )? ;
    public final void rule__EventPattern__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4225:1: ( rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__2 )? )
            // InternalServiceDefinition.g:4226:2: rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_39);
            rule__EventPattern__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4227:2: ( rule__EventPattern__UnorderedGroup_3__2 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalServiceDefinition.g:4227:2: rule__EventPattern__UnorderedGroup_3__2
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
    // InternalServiceDefinition.g:4233:1: rule__EventPattern__UnorderedGroup_3__2 : rule__EventPattern__UnorderedGroup_3__Impl ;
    public final void rule__EventPattern__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4237:1: ( rule__EventPattern__UnorderedGroup_3__Impl )
            // InternalServiceDefinition.g:4238:2: rule__EventPattern__UnorderedGroup_3__Impl
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
    // InternalServiceDefinition.g:4245:1: rule__QueryPattern__UnorderedGroup_3 : rule__QueryPattern__UnorderedGroup_3__0 {...}?;
    public final void rule__QueryPattern__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
        	
        try {
            // InternalServiceDefinition.g:4250:1: ( rule__QueryPattern__UnorderedGroup_3__0 {...}?)
            // InternalServiceDefinition.g:4251:2: rule__QueryPattern__UnorderedGroup_3__0 {...}?
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
    // InternalServiceDefinition.g:4259:1: rule__QueryPattern__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__QueryPattern__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalServiceDefinition.g:4264:1: ( ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) ) )
            // InternalServiceDefinition.g:4265:3: ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) )
            {
            // InternalServiceDefinition.g:4265:3: ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalServiceDefinition.g:4266:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4266:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) )
                    // InternalServiceDefinition.g:4267:4: {...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__QueryPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalServiceDefinition.g:4267:108: ( ( ( rule__QueryPattern__Group_3_0__0 ) ) )
                    // InternalServiceDefinition.g:4268:5: ( ( rule__QueryPattern__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4274:5: ( ( rule__QueryPattern__Group_3_0__0 ) )
                    // InternalServiceDefinition.g:4275:6: ( rule__QueryPattern__Group_3_0__0 )
                    {
                     before(grammarAccess.getQueryPatternAccess().getGroup_3_0()); 
                    // InternalServiceDefinition.g:4276:6: ( rule__QueryPattern__Group_3_0__0 )
                    // InternalServiceDefinition.g:4276:7: rule__QueryPattern__Group_3_0__0
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
                    // InternalServiceDefinition.g:4281:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4281:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) )
                    // InternalServiceDefinition.g:4282:4: {...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__QueryPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalServiceDefinition.g:4282:108: ( ( ( rule__QueryPattern__Group_3_1__0 ) ) )
                    // InternalServiceDefinition.g:4283:5: ( ( rule__QueryPattern__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4289:5: ( ( rule__QueryPattern__Group_3_1__0 ) )
                    // InternalServiceDefinition.g:4290:6: ( rule__QueryPattern__Group_3_1__0 )
                    {
                     before(grammarAccess.getQueryPatternAccess().getGroup_3_1()); 
                    // InternalServiceDefinition.g:4291:6: ( rule__QueryPattern__Group_3_1__0 )
                    // InternalServiceDefinition.g:4291:7: rule__QueryPattern__Group_3_1__0
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
    // InternalServiceDefinition.g:4304:1: rule__QueryPattern__UnorderedGroup_3__0 : rule__QueryPattern__UnorderedGroup_3__Impl ( rule__QueryPattern__UnorderedGroup_3__1 )? ;
    public final void rule__QueryPattern__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4308:1: ( rule__QueryPattern__UnorderedGroup_3__Impl ( rule__QueryPattern__UnorderedGroup_3__1 )? )
            // InternalServiceDefinition.g:4309:2: rule__QueryPattern__UnorderedGroup_3__Impl ( rule__QueryPattern__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_40);
            rule__QueryPattern__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4310:2: ( rule__QueryPattern__UnorderedGroup_3__1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalServiceDefinition.g:4310:2: rule__QueryPattern__UnorderedGroup_3__1
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
    // InternalServiceDefinition.g:4316:1: rule__QueryPattern__UnorderedGroup_3__1 : rule__QueryPattern__UnorderedGroup_3__Impl ;
    public final void rule__QueryPattern__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4320:1: ( rule__QueryPattern__UnorderedGroup_3__Impl )
            // InternalServiceDefinition.g:4321:2: rule__QueryPattern__UnorderedGroup_3__Impl
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
    // InternalServiceDefinition.g:4328:1: rule__ServiceDefModel__ImportsAssignment_1 : ( ruleCommRepoImport ) ;
    public final void rule__ServiceDefModel__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4332:1: ( ( ruleCommRepoImport ) )
            // InternalServiceDefinition.g:4333:2: ( ruleCommRepoImport )
            {
            // InternalServiceDefinition.g:4333:2: ( ruleCommRepoImport )
            // InternalServiceDefinition.g:4334:3: ruleCommRepoImport
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
    // InternalServiceDefinition.g:4343:1: rule__ServiceDefModel__RepositoryAssignment_2 : ( ruleServiceDefRepository ) ;
    public final void rule__ServiceDefModel__RepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4347:1: ( ( ruleServiceDefRepository ) )
            // InternalServiceDefinition.g:4348:2: ( ruleServiceDefRepository )
            {
            // InternalServiceDefinition.g:4348:2: ( ruleServiceDefRepository )
            // InternalServiceDefinition.g:4349:3: ruleServiceDefRepository
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
    // InternalServiceDefinition.g:4358:1: rule__ServiceDefRepository__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceDefRepository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4362:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4363:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4363:2: ( RULE_ID )
            // InternalServiceDefinition.g:4364:3: RULE_ID
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
    // InternalServiceDefinition.g:4373:1: rule__ServiceDefRepository__VersionAssignment_2_1 : ( ruleServiceRepoVersion ) ;
    public final void rule__ServiceDefRepository__VersionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4377:1: ( ( ruleServiceRepoVersion ) )
            // InternalServiceDefinition.g:4378:2: ( ruleServiceRepoVersion )
            {
            // InternalServiceDefinition.g:4378:2: ( ruleServiceRepoVersion )
            // InternalServiceDefinition.g:4379:3: ruleServiceRepoVersion
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
    // InternalServiceDefinition.g:4388:1: rule__ServiceDefRepository__ServicesAssignment_4 : ( ruleAbstractServiceDefinition ) ;
    public final void rule__ServiceDefRepository__ServicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4392:1: ( ( ruleAbstractServiceDefinition ) )
            // InternalServiceDefinition.g:4393:2: ( ruleAbstractServiceDefinition )
            {
            // InternalServiceDefinition.g:4393:2: ( ruleAbstractServiceDefinition )
            // InternalServiceDefinition.g:4394:3: ruleAbstractServiceDefinition
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
    // InternalServiceDefinition.g:4403:1: rule__ServiceRepoVersion__MajorAssignment_0 : ( ruleEInt ) ;
    public final void rule__ServiceRepoVersion__MajorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4407:1: ( ( ruleEInt ) )
            // InternalServiceDefinition.g:4408:2: ( ruleEInt )
            {
            // InternalServiceDefinition.g:4408:2: ( ruleEInt )
            // InternalServiceDefinition.g:4409:3: ruleEInt
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
    // InternalServiceDefinition.g:4418:1: rule__ServiceRepoVersion__MinorAssignment_2 : ( ruleEInt ) ;
    public final void rule__ServiceRepoVersion__MinorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4422:1: ( ( ruleEInt ) )
            // InternalServiceDefinition.g:4423:2: ( ruleEInt )
            {
            // InternalServiceDefinition.g:4423:2: ( ruleEInt )
            // InternalServiceDefinition.g:4424:3: ruleEInt
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
    // InternalServiceDefinition.g:4433:1: rule__ServiceRepoVersion__PatchAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__ServiceRepoVersion__PatchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4437:1: ( ( ruleEInt ) )
            // InternalServiceDefinition.g:4438:2: ( ruleEInt )
            {
            // InternalServiceDefinition.g:4438:2: ( ruleEInt )
            // InternalServiceDefinition.g:4439:3: ruleEInt
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
    // InternalServiceDefinition.g:4448:1: rule__CommRepoImport__ImportedNamespaceAssignment_1 : ( ruleFQNW ) ;
    public final void rule__CommRepoImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4452:1: ( ( ruleFQNW ) )
            // InternalServiceDefinition.g:4453:2: ( ruleFQNW )
            {
            // InternalServiceDefinition.g:4453:2: ( ruleFQNW )
            // InternalServiceDefinition.g:4454:3: ruleFQNW
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
    // InternalServiceDefinition.g:4463:1: rule__ForkingServiceDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ForkingServiceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4467:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4468:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4468:2: ( RULE_ID )
            // InternalServiceDefinition.g:4469:3: RULE_ID
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
    // InternalServiceDefinition.g:4478:1: rule__ForkingServiceDefinition__PatternAssignment_3 : ( ruleForkingPatternInstance ) ;
    public final void rule__ForkingServiceDefinition__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4482:1: ( ( ruleForkingPatternInstance ) )
            // InternalServiceDefinition.g:4483:2: ( ruleForkingPatternInstance )
            {
            // InternalServiceDefinition.g:4483:2: ( ruleForkingPatternInstance )
            // InternalServiceDefinition.g:4484:3: ruleForkingPatternInstance
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


    // $ANTLR start "rule__ForkingServiceDefinition__PropertiesAssignment_4"
    // InternalServiceDefinition.g:4493:1: rule__ForkingServiceDefinition__PropertiesAssignment_4 : ( ruleServiceProperty ) ;
    public final void rule__ForkingServiceDefinition__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4497:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:4498:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:4498:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:4499:3: ruleServiceProperty
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceProperty();

            state._fsp--;

             after(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__PropertiesAssignment_4"


    // $ANTLR start "rule__JoyningServiceDefinition__NameAssignment_1"
    // InternalServiceDefinition.g:4508:1: rule__JoyningServiceDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__JoyningServiceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4512:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4513:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4513:2: ( RULE_ID )
            // InternalServiceDefinition.g:4514:3: RULE_ID
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
    // InternalServiceDefinition.g:4523:1: rule__JoyningServiceDefinition__PatternAssignment_3 : ( ruleJoiningPatternInstance ) ;
    public final void rule__JoyningServiceDefinition__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4527:1: ( ( ruleJoiningPatternInstance ) )
            // InternalServiceDefinition.g:4528:2: ( ruleJoiningPatternInstance )
            {
            // InternalServiceDefinition.g:4528:2: ( ruleJoiningPatternInstance )
            // InternalServiceDefinition.g:4529:3: ruleJoiningPatternInstance
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


    // $ANTLR start "rule__JoyningServiceDefinition__PropertiesAssignment_4"
    // InternalServiceDefinition.g:4538:1: rule__JoyningServiceDefinition__PropertiesAssignment_4 : ( ruleServiceProperty ) ;
    public final void rule__JoyningServiceDefinition__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4542:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:4543:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:4543:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:4544:3: ruleServiceProperty
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceProperty();

            state._fsp--;

             after(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__PropertiesAssignment_4"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__NameAssignment_1"
    // InternalServiceDefinition.g:4553:1: rule__RequestAnswerServiceDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RequestAnswerServiceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4557:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4558:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4558:2: ( RULE_ID )
            // InternalServiceDefinition.g:4559:3: RULE_ID
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
    // InternalServiceDefinition.g:4568:1: rule__RequestAnswerServiceDefinition__PatternAssignment_3 : ( ruleRequestAnswerPattern ) ;
    public final void rule__RequestAnswerServiceDefinition__PatternAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4572:1: ( ( ruleRequestAnswerPattern ) )
            // InternalServiceDefinition.g:4573:2: ( ruleRequestAnswerPattern )
            {
            // InternalServiceDefinition.g:4573:2: ( ruleRequestAnswerPattern )
            // InternalServiceDefinition.g:4574:3: ruleRequestAnswerPattern
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


    // $ANTLR start "rule__RequestAnswerServiceDefinition__PropertiesAssignment_4"
    // InternalServiceDefinition.g:4583:1: rule__RequestAnswerServiceDefinition__PropertiesAssignment_4 : ( ruleServiceProperty ) ;
    public final void rule__RequestAnswerServiceDefinition__PropertiesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4587:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:4588:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:4588:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:4589:3: ruleServiceProperty
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceProperty();

            state._fsp--;

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__PropertiesAssignment_4"


    // $ANTLR start "rule__CoordinationServiceDefinition__NameAssignment_1"
    // InternalServiceDefinition.g:4598:1: rule__CoordinationServiceDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoordinationServiceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4602:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4603:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4603:2: ( RULE_ID )
            // InternalServiceDefinition.g:4604:3: RULE_ID
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


    // $ANTLR start "rule__CoordinationServiceDefinition__StatePatternAssignment_3_0"
    // InternalServiceDefinition.g:4613:1: rule__CoordinationServiceDefinition__StatePatternAssignment_3_0 : ( ruleStatePattern ) ;
    public final void rule__CoordinationServiceDefinition__StatePatternAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4617:1: ( ( ruleStatePattern ) )
            // InternalServiceDefinition.g:4618:2: ( ruleStatePattern )
            {
            // InternalServiceDefinition.g:4618:2: ( ruleStatePattern )
            // InternalServiceDefinition.g:4619:3: ruleStatePattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternStatePatternParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatePattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternStatePatternParserRuleCall_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__StatePatternAssignment_3_0"


    // $ANTLR start "rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1"
    // InternalServiceDefinition.g:4628:1: rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1 : ( ruleParameterPattern ) ;
    public final void rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4632:1: ( ( ruleParameterPattern ) )
            // InternalServiceDefinition.g:4633:2: ( ruleParameterPattern )
            {
            // InternalServiceDefinition.g:4633:2: ( ruleParameterPattern )
            // InternalServiceDefinition.g:4634:3: ruleParameterPattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternParameterPatternParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterPattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternParameterPatternParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__ParameterPatternAssignment_3_1"


    // $ANTLR start "rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2"
    // InternalServiceDefinition.g:4643:1: rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2 : ( ruleMonitoringPattern ) ;
    public final void rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4647:1: ( ( ruleMonitoringPattern ) )
            // InternalServiceDefinition.g:4648:2: ( ruleMonitoringPattern )
            {
            // InternalServiceDefinition.g:4648:2: ( ruleMonitoringPattern )
            // InternalServiceDefinition.g:4649:3: ruleMonitoringPattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternMonitoringPatternParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMonitoringPattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternMonitoringPatternParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__MonitoringPatternAssignment_3_2"


    // $ANTLR start "rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3"
    // InternalServiceDefinition.g:4658:1: rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3 : ( ruleDynamicWiringPattern ) ;
    public final void rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4662:1: ( ( ruleDynamicWiringPattern ) )
            // InternalServiceDefinition.g:4663:2: ( ruleDynamicWiringPattern )
            {
            // InternalServiceDefinition.g:4663:2: ( ruleDynamicWiringPattern )
            // InternalServiceDefinition.g:4664:3: ruleDynamicWiringPattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternDynamicWiringPatternParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamicWiringPattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternDynamicWiringPatternParserRuleCall_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__WiringPatternAssignment_3_3"


    // $ANTLR start "rule__CoordinationServiceDefinition__ServicesAssignment_4"
    // InternalServiceDefinition.g:4673:1: rule__CoordinationServiceDefinition__ServicesAssignment_4 : ( ruleCommunicationServiceUsage ) ;
    public final void rule__CoordinationServiceDefinition__ServicesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4677:1: ( ( ruleCommunicationServiceUsage ) )
            // InternalServiceDefinition.g:4678:2: ( ruleCommunicationServiceUsage )
            {
            // InternalServiceDefinition.g:4678:2: ( ruleCommunicationServiceUsage )
            // InternalServiceDefinition.g:4679:3: ruleCommunicationServiceUsage
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
    // InternalServiceDefinition.g:4688:1: rule__CoordinationServiceDefinition__PropertiesAssignment_5 : ( ruleServiceProperty ) ;
    public final void rule__CoordinationServiceDefinition__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4692:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:4693:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:4693:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:4694:3: ruleServiceProperty
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
    // InternalServiceDefinition.g:4703:1: rule__CommunicationServiceUsage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CommunicationServiceUsage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4707:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4708:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4708:2: ( RULE_ID )
            // InternalServiceDefinition.g:4709:3: RULE_ID
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
    // InternalServiceDefinition.g:4718:1: rule__CommunicationServiceUsage__UsesAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CommunicationServiceUsage__UsesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4722:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4723:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4723:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4724:3: ( ruleFQN )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionCrossReference_3_0()); 
            // InternalServiceDefinition.g:4725:3: ( ruleFQN )
            // InternalServiceDefinition.g:4726:4: ruleFQN
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
    // InternalServiceDefinition.g:4737:1: rule__StatePattern__LifecycleAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__StatePattern__LifecycleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4741:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4742:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4742:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4743:3: ( ruleFQN )
            {
             before(grammarAccess.getStatePatternAccess().getLifecycleStateMachineCrossReference_4_0()); 
            // InternalServiceDefinition.g:4744:3: ( ruleFQN )
            // InternalServiceDefinition.g:4745:4: ruleFQN
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
    // InternalServiceDefinition.g:4756:1: rule__StatePattern__ModesAssignment_5_1 : ( ( ruleFQN ) ) ;
    public final void rule__StatePattern__ModesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4760:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4761:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4761:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4762:3: ( ruleFQN )
            {
             before(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionCrossReference_5_1_0()); 
            // InternalServiceDefinition.g:4763:3: ( ruleFQN )
            // InternalServiceDefinition.g:4764:4: ruleFQN
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
    // InternalServiceDefinition.g:4775:1: rule__ParameterPattern__ParameterSetAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterPattern__ParameterSetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4779:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4780:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4780:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4781:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionCrossReference_3_0()); 
            // InternalServiceDefinition.g:4782:3: ( ruleFQN )
            // InternalServiceDefinition.g:4783:4: ruleFQN
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
    // InternalServiceDefinition.g:4794:1: rule__PushPattern__DataTypeAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__PushPattern__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4798:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4799:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4799:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4800:3: ( ruleFQN )
            {
             before(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); 
            // InternalServiceDefinition.g:4801:3: ( ruleFQN )
            // InternalServiceDefinition.g:4802:4: ruleFQN
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
    // InternalServiceDefinition.g:4813:1: rule__EventPattern__EventTypeAssignment_3_0_2 : ( ( ruleFQN ) ) ;
    public final void rule__EventPattern__EventTypeAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4817:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4818:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4818:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4819:3: ( ruleFQN )
            {
             before(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectCrossReference_3_0_2_0()); 
            // InternalServiceDefinition.g:4820:3: ( ruleFQN )
            // InternalServiceDefinition.g:4821:4: ruleFQN
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
    // InternalServiceDefinition.g:4832:1: rule__EventPattern__ActivationTypeAssignment_3_1_2 : ( ( ruleFQN ) ) ;
    public final void rule__EventPattern__ActivationTypeAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4836:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4837:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4837:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4838:3: ( ruleFQN )
            {
             before(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectCrossReference_3_1_2_0()); 
            // InternalServiceDefinition.g:4839:3: ( ruleFQN )
            // InternalServiceDefinition.g:4840:4: ruleFQN
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
    // InternalServiceDefinition.g:4851:1: rule__EventPattern__EventStateTypeAssignment_3_2_2 : ( ( ruleFQN ) ) ;
    public final void rule__EventPattern__EventStateTypeAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4855:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4856:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4856:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4857:3: ( ruleFQN )
            {
             before(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectCrossReference_3_2_2_0()); 
            // InternalServiceDefinition.g:4858:3: ( ruleFQN )
            // InternalServiceDefinition.g:4859:4: ruleFQN
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
    // InternalServiceDefinition.g:4870:1: rule__QueryPattern__RequestTypeAssignment_3_0_2 : ( ( ruleFQN ) ) ;
    public final void rule__QueryPattern__RequestTypeAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4874:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4875:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4875:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4876:3: ( ruleFQN )
            {
             before(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectCrossReference_3_0_2_0()); 
            // InternalServiceDefinition.g:4877:3: ( ruleFQN )
            // InternalServiceDefinition.g:4878:4: ruleFQN
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
    // InternalServiceDefinition.g:4889:1: rule__QueryPattern__AnswerTypeAssignment_3_1_2 : ( ( ruleFQN ) ) ;
    public final void rule__QueryPattern__AnswerTypeAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4893:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4894:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4894:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4895:3: ( ruleFQN )
            {
             before(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectCrossReference_3_1_2_0()); 
            // InternalServiceDefinition.g:4896:3: ( ruleFQN )
            // InternalServiceDefinition.g:4897:4: ruleFQN
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
    // InternalServiceDefinition.g:4908:1: rule__SendPattern__DataTypeAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__SendPattern__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4912:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4913:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4913:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4914:3: ( ruleFQN )
            {
             before(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); 
            // InternalServiceDefinition.g:4915:3: ( ruleFQN )
            // InternalServiceDefinition.g:4916:4: ruleFQN
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
    // InternalServiceDefinition.g:4927:1: rule__ServiceProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4931:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4932:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4932:2: ( RULE_ID )
            // InternalServiceDefinition.g:4933:3: RULE_ID
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
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000F10000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000F00002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000200000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000384000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000200001010000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000384000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000001C000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000C0000000002L});

}
