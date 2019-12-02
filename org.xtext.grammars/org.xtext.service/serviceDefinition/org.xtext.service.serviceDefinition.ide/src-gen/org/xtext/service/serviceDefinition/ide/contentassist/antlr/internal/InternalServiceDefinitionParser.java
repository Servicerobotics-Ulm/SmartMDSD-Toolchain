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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_DOCU_COMMENT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_STRING", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'.*'", "'-'", "'ServiceDefRepository'", "'{'", "'}'", "'version'", "'#import'", "';'", "'ForkingServiceDefinition'", "'JoiningServiceDefinition'", "'RequestAnswerServiceDefinition'", "'CoordinationServiceDefinition'", "'CommunicationServiceUsage'", "'uses'", "'StatePattern'", "'<'", "'lifecycle'", "'>'", "'with'", "'ParameterPattern'", "'DynamicWiringPattern'", "'MonitoringPattern'", "'PushPattern'", "'DataType'", "'='", "'EventPattern'", "'EventType'", "'ActivationType'", "'EventStateType'", "'QueryPattern'", "'RequestType'", "'AnswerType'", "'SendPattern'", "'ServiceProperty'"
    };
    public static final int RULE_ML_DOCUMENTATION=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=11;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=10;
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
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalServiceDefinition.g:68:1: entryRuleServiceDefModel : ruleServiceDefModel EOF ;
    public final void entryRuleServiceDefModel() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:69:1: ( ruleServiceDefModel EOF )
            // InternalServiceDefinition.g:70:1: ruleServiceDefModel EOF
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
    // InternalServiceDefinition.g:77:1: ruleServiceDefModel : ( ( rule__ServiceDefModel__Group__0 ) ) ;
    public final void ruleServiceDefModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:81:2: ( ( ( rule__ServiceDefModel__Group__0 ) ) )
            // InternalServiceDefinition.g:82:2: ( ( rule__ServiceDefModel__Group__0 ) )
            {
            // InternalServiceDefinition.g:82:2: ( ( rule__ServiceDefModel__Group__0 ) )
            // InternalServiceDefinition.g:83:3: ( rule__ServiceDefModel__Group__0 )
            {
             before(grammarAccess.getServiceDefModelAccess().getGroup()); 
            // InternalServiceDefinition.g:84:3: ( rule__ServiceDefModel__Group__0 )
            // InternalServiceDefinition.g:84:4: rule__ServiceDefModel__Group__0
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
    // InternalServiceDefinition.g:93:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:94:1: ( ruleFQN EOF )
            // InternalServiceDefinition.g:95:1: ruleFQN EOF
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
    // InternalServiceDefinition.g:102:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:106:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalServiceDefinition.g:107:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalServiceDefinition.g:107:2: ( ( rule__FQN__Group__0 ) )
            // InternalServiceDefinition.g:108:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalServiceDefinition.g:109:3: ( rule__FQN__Group__0 )
            // InternalServiceDefinition.g:109:4: rule__FQN__Group__0
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
    // InternalServiceDefinition.g:118:1: entryRuleFQNW : ruleFQNW EOF ;
    public final void entryRuleFQNW() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:119:1: ( ruleFQNW EOF )
            // InternalServiceDefinition.g:120:1: ruleFQNW EOF
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
    // InternalServiceDefinition.g:127:1: ruleFQNW : ( ( rule__FQNW__Group__0 ) ) ;
    public final void ruleFQNW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:131:2: ( ( ( rule__FQNW__Group__0 ) ) )
            // InternalServiceDefinition.g:132:2: ( ( rule__FQNW__Group__0 ) )
            {
            // InternalServiceDefinition.g:132:2: ( ( rule__FQNW__Group__0 ) )
            // InternalServiceDefinition.g:133:3: ( rule__FQNW__Group__0 )
            {
             before(grammarAccess.getFQNWAccess().getGroup()); 
            // InternalServiceDefinition.g:134:3: ( rule__FQNW__Group__0 )
            // InternalServiceDefinition.g:134:4: rule__FQNW__Group__0
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
    // InternalServiceDefinition.g:143:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:144:1: ( ruleEInt EOF )
            // InternalServiceDefinition.g:145:1: ruleEInt EOF
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
    // InternalServiceDefinition.g:152:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:156:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalServiceDefinition.g:157:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalServiceDefinition.g:157:2: ( ( rule__EInt__Group__0 ) )
            // InternalServiceDefinition.g:158:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalServiceDefinition.g:159:3: ( rule__EInt__Group__0 )
            // InternalServiceDefinition.g:159:4: rule__EInt__Group__0
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
    // InternalServiceDefinition.g:168:1: entryRuleServiceDefRepository : ruleServiceDefRepository EOF ;
    public final void entryRuleServiceDefRepository() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:169:1: ( ruleServiceDefRepository EOF )
            // InternalServiceDefinition.g:170:1: ruleServiceDefRepository EOF
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
    // InternalServiceDefinition.g:177:1: ruleServiceDefRepository : ( ( rule__ServiceDefRepository__Group__0 ) ) ;
    public final void ruleServiceDefRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:181:2: ( ( ( rule__ServiceDefRepository__Group__0 ) ) )
            // InternalServiceDefinition.g:182:2: ( ( rule__ServiceDefRepository__Group__0 ) )
            {
            // InternalServiceDefinition.g:182:2: ( ( rule__ServiceDefRepository__Group__0 ) )
            // InternalServiceDefinition.g:183:3: ( rule__ServiceDefRepository__Group__0 )
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getGroup()); 
            // InternalServiceDefinition.g:184:3: ( rule__ServiceDefRepository__Group__0 )
            // InternalServiceDefinition.g:184:4: rule__ServiceDefRepository__Group__0
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
    // InternalServiceDefinition.g:193:1: entryRuleServiceRepoVersion : ruleServiceRepoVersion EOF ;
    public final void entryRuleServiceRepoVersion() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:194:1: ( ruleServiceRepoVersion EOF )
            // InternalServiceDefinition.g:195:1: ruleServiceRepoVersion EOF
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
    // InternalServiceDefinition.g:202:1: ruleServiceRepoVersion : ( ( rule__ServiceRepoVersion__Group__0 ) ) ;
    public final void ruleServiceRepoVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:206:2: ( ( ( rule__ServiceRepoVersion__Group__0 ) ) )
            // InternalServiceDefinition.g:207:2: ( ( rule__ServiceRepoVersion__Group__0 ) )
            {
            // InternalServiceDefinition.g:207:2: ( ( rule__ServiceRepoVersion__Group__0 ) )
            // InternalServiceDefinition.g:208:3: ( rule__ServiceRepoVersion__Group__0 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getGroup()); 
            // InternalServiceDefinition.g:209:3: ( rule__ServiceRepoVersion__Group__0 )
            // InternalServiceDefinition.g:209:4: rule__ServiceRepoVersion__Group__0
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
    // InternalServiceDefinition.g:218:1: entryRuleCommRepoImport : ruleCommRepoImport EOF ;
    public final void entryRuleCommRepoImport() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:219:1: ( ruleCommRepoImport EOF )
            // InternalServiceDefinition.g:220:1: ruleCommRepoImport EOF
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
    // InternalServiceDefinition.g:227:1: ruleCommRepoImport : ( ( rule__CommRepoImport__Group__0 ) ) ;
    public final void ruleCommRepoImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:231:2: ( ( ( rule__CommRepoImport__Group__0 ) ) )
            // InternalServiceDefinition.g:232:2: ( ( rule__CommRepoImport__Group__0 ) )
            {
            // InternalServiceDefinition.g:232:2: ( ( rule__CommRepoImport__Group__0 ) )
            // InternalServiceDefinition.g:233:3: ( rule__CommRepoImport__Group__0 )
            {
             before(grammarAccess.getCommRepoImportAccess().getGroup()); 
            // InternalServiceDefinition.g:234:3: ( rule__CommRepoImport__Group__0 )
            // InternalServiceDefinition.g:234:4: rule__CommRepoImport__Group__0
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
    // InternalServiceDefinition.g:243:1: entryRuleAbstractServiceDefinition : ruleAbstractServiceDefinition EOF ;
    public final void entryRuleAbstractServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:244:1: ( ruleAbstractServiceDefinition EOF )
            // InternalServiceDefinition.g:245:1: ruleAbstractServiceDefinition EOF
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
    // InternalServiceDefinition.g:252:1: ruleAbstractServiceDefinition : ( ( rule__AbstractServiceDefinition__Alternatives ) ) ;
    public final void ruleAbstractServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:256:2: ( ( ( rule__AbstractServiceDefinition__Alternatives ) ) )
            // InternalServiceDefinition.g:257:2: ( ( rule__AbstractServiceDefinition__Alternatives ) )
            {
            // InternalServiceDefinition.g:257:2: ( ( rule__AbstractServiceDefinition__Alternatives ) )
            // InternalServiceDefinition.g:258:3: ( rule__AbstractServiceDefinition__Alternatives )
            {
             before(grammarAccess.getAbstractServiceDefinitionAccess().getAlternatives()); 
            // InternalServiceDefinition.g:259:3: ( rule__AbstractServiceDefinition__Alternatives )
            // InternalServiceDefinition.g:259:4: rule__AbstractServiceDefinition__Alternatives
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
    // InternalServiceDefinition.g:268:1: entryRuleCommunicationServiceDefinition : ruleCommunicationServiceDefinition EOF ;
    public final void entryRuleCommunicationServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:269:1: ( ruleCommunicationServiceDefinition EOF )
            // InternalServiceDefinition.g:270:1: ruleCommunicationServiceDefinition EOF
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
    // InternalServiceDefinition.g:277:1: ruleCommunicationServiceDefinition : ( ( rule__CommunicationServiceDefinition__Alternatives ) ) ;
    public final void ruleCommunicationServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:281:2: ( ( ( rule__CommunicationServiceDefinition__Alternatives ) ) )
            // InternalServiceDefinition.g:282:2: ( ( rule__CommunicationServiceDefinition__Alternatives ) )
            {
            // InternalServiceDefinition.g:282:2: ( ( rule__CommunicationServiceDefinition__Alternatives ) )
            // InternalServiceDefinition.g:283:3: ( rule__CommunicationServiceDefinition__Alternatives )
            {
             before(grammarAccess.getCommunicationServiceDefinitionAccess().getAlternatives()); 
            // InternalServiceDefinition.g:284:3: ( rule__CommunicationServiceDefinition__Alternatives )
            // InternalServiceDefinition.g:284:4: rule__CommunicationServiceDefinition__Alternatives
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
    // InternalServiceDefinition.g:293:1: entryRuleForkingServiceDefinition : ruleForkingServiceDefinition EOF ;
    public final void entryRuleForkingServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:294:1: ( ruleForkingServiceDefinition EOF )
            // InternalServiceDefinition.g:295:1: ruleForkingServiceDefinition EOF
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
    // InternalServiceDefinition.g:302:1: ruleForkingServiceDefinition : ( ( rule__ForkingServiceDefinition__Group__0 ) ) ;
    public final void ruleForkingServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:306:2: ( ( ( rule__ForkingServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:307:2: ( ( rule__ForkingServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:307:2: ( ( rule__ForkingServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:308:3: ( rule__ForkingServiceDefinition__Group__0 )
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:309:3: ( rule__ForkingServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:309:4: rule__ForkingServiceDefinition__Group__0
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
    // InternalServiceDefinition.g:318:1: entryRuleJoyningServiceDefinition : ruleJoyningServiceDefinition EOF ;
    public final void entryRuleJoyningServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:319:1: ( ruleJoyningServiceDefinition EOF )
            // InternalServiceDefinition.g:320:1: ruleJoyningServiceDefinition EOF
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
    // InternalServiceDefinition.g:327:1: ruleJoyningServiceDefinition : ( ( rule__JoyningServiceDefinition__Group__0 ) ) ;
    public final void ruleJoyningServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:331:2: ( ( ( rule__JoyningServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:332:2: ( ( rule__JoyningServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:332:2: ( ( rule__JoyningServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:333:3: ( rule__JoyningServiceDefinition__Group__0 )
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:334:3: ( rule__JoyningServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:334:4: rule__JoyningServiceDefinition__Group__0
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
    // InternalServiceDefinition.g:343:1: entryRuleRequestAnswerServiceDefinition : ruleRequestAnswerServiceDefinition EOF ;
    public final void entryRuleRequestAnswerServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:344:1: ( ruleRequestAnswerServiceDefinition EOF )
            // InternalServiceDefinition.g:345:1: ruleRequestAnswerServiceDefinition EOF
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
    // InternalServiceDefinition.g:352:1: ruleRequestAnswerServiceDefinition : ( ( rule__RequestAnswerServiceDefinition__Group__0 ) ) ;
    public final void ruleRequestAnswerServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:356:2: ( ( ( rule__RequestAnswerServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:357:2: ( ( rule__RequestAnswerServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:357:2: ( ( rule__RequestAnswerServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:358:3: ( rule__RequestAnswerServiceDefinition__Group__0 )
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:359:3: ( rule__RequestAnswerServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:359:4: rule__RequestAnswerServiceDefinition__Group__0
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
    // InternalServiceDefinition.g:368:1: entryRuleCoordinationServiceDefinition : ruleCoordinationServiceDefinition EOF ;
    public final void entryRuleCoordinationServiceDefinition() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:369:1: ( ruleCoordinationServiceDefinition EOF )
            // InternalServiceDefinition.g:370:1: ruleCoordinationServiceDefinition EOF
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
    // InternalServiceDefinition.g:377:1: ruleCoordinationServiceDefinition : ( ( rule__CoordinationServiceDefinition__Group__0 ) ) ;
    public final void ruleCoordinationServiceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:381:2: ( ( ( rule__CoordinationServiceDefinition__Group__0 ) ) )
            // InternalServiceDefinition.g:382:2: ( ( rule__CoordinationServiceDefinition__Group__0 ) )
            {
            // InternalServiceDefinition.g:382:2: ( ( rule__CoordinationServiceDefinition__Group__0 ) )
            // InternalServiceDefinition.g:383:3: ( rule__CoordinationServiceDefinition__Group__0 )
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getGroup()); 
            // InternalServiceDefinition.g:384:3: ( rule__CoordinationServiceDefinition__Group__0 )
            // InternalServiceDefinition.g:384:4: rule__CoordinationServiceDefinition__Group__0
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
    // InternalServiceDefinition.g:393:1: entryRuleCommunicationServiceUsage : ruleCommunicationServiceUsage EOF ;
    public final void entryRuleCommunicationServiceUsage() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:394:1: ( ruleCommunicationServiceUsage EOF )
            // InternalServiceDefinition.g:395:1: ruleCommunicationServiceUsage EOF
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
    // InternalServiceDefinition.g:402:1: ruleCommunicationServiceUsage : ( ( rule__CommunicationServiceUsage__Group__0 ) ) ;
    public final void ruleCommunicationServiceUsage() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:406:2: ( ( ( rule__CommunicationServiceUsage__Group__0 ) ) )
            // InternalServiceDefinition.g:407:2: ( ( rule__CommunicationServiceUsage__Group__0 ) )
            {
            // InternalServiceDefinition.g:407:2: ( ( rule__CommunicationServiceUsage__Group__0 ) )
            // InternalServiceDefinition.g:408:3: ( rule__CommunicationServiceUsage__Group__0 )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getGroup()); 
            // InternalServiceDefinition.g:409:3: ( rule__CommunicationServiceUsage__Group__0 )
            // InternalServiceDefinition.g:409:4: rule__CommunicationServiceUsage__Group__0
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
    // InternalServiceDefinition.g:418:1: entryRuleStatePattern : ruleStatePattern EOF ;
    public final void entryRuleStatePattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:419:1: ( ruleStatePattern EOF )
            // InternalServiceDefinition.g:420:1: ruleStatePattern EOF
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
    // InternalServiceDefinition.g:427:1: ruleStatePattern : ( ( rule__StatePattern__Group__0 ) ) ;
    public final void ruleStatePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:431:2: ( ( ( rule__StatePattern__Group__0 ) ) )
            // InternalServiceDefinition.g:432:2: ( ( rule__StatePattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:432:2: ( ( rule__StatePattern__Group__0 ) )
            // InternalServiceDefinition.g:433:3: ( rule__StatePattern__Group__0 )
            {
             before(grammarAccess.getStatePatternAccess().getGroup()); 
            // InternalServiceDefinition.g:434:3: ( rule__StatePattern__Group__0 )
            // InternalServiceDefinition.g:434:4: rule__StatePattern__Group__0
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
    // InternalServiceDefinition.g:443:1: entryRuleParameterPattern : ruleParameterPattern EOF ;
    public final void entryRuleParameterPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:444:1: ( ruleParameterPattern EOF )
            // InternalServiceDefinition.g:445:1: ruleParameterPattern EOF
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
    // InternalServiceDefinition.g:452:1: ruleParameterPattern : ( ( rule__ParameterPattern__Group__0 ) ) ;
    public final void ruleParameterPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:456:2: ( ( ( rule__ParameterPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:457:2: ( ( rule__ParameterPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:457:2: ( ( rule__ParameterPattern__Group__0 ) )
            // InternalServiceDefinition.g:458:3: ( rule__ParameterPattern__Group__0 )
            {
             before(grammarAccess.getParameterPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:459:3: ( rule__ParameterPattern__Group__0 )
            // InternalServiceDefinition.g:459:4: rule__ParameterPattern__Group__0
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
    // InternalServiceDefinition.g:468:1: entryRuleDynamicWiringPattern : ruleDynamicWiringPattern EOF ;
    public final void entryRuleDynamicWiringPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:469:1: ( ruleDynamicWiringPattern EOF )
            // InternalServiceDefinition.g:470:1: ruleDynamicWiringPattern EOF
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
    // InternalServiceDefinition.g:477:1: ruleDynamicWiringPattern : ( ( rule__DynamicWiringPattern__Group__0 ) ) ;
    public final void ruleDynamicWiringPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:481:2: ( ( ( rule__DynamicWiringPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:482:2: ( ( rule__DynamicWiringPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:482:2: ( ( rule__DynamicWiringPattern__Group__0 ) )
            // InternalServiceDefinition.g:483:3: ( rule__DynamicWiringPattern__Group__0 )
            {
             before(grammarAccess.getDynamicWiringPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:484:3: ( rule__DynamicWiringPattern__Group__0 )
            // InternalServiceDefinition.g:484:4: rule__DynamicWiringPattern__Group__0
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
    // InternalServiceDefinition.g:493:1: entryRuleMonitoringPattern : ruleMonitoringPattern EOF ;
    public final void entryRuleMonitoringPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:494:1: ( ruleMonitoringPattern EOF )
            // InternalServiceDefinition.g:495:1: ruleMonitoringPattern EOF
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
    // InternalServiceDefinition.g:502:1: ruleMonitoringPattern : ( ( rule__MonitoringPattern__Group__0 ) ) ;
    public final void ruleMonitoringPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:506:2: ( ( ( rule__MonitoringPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:507:2: ( ( rule__MonitoringPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:507:2: ( ( rule__MonitoringPattern__Group__0 ) )
            // InternalServiceDefinition.g:508:3: ( rule__MonitoringPattern__Group__0 )
            {
             before(grammarAccess.getMonitoringPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:509:3: ( rule__MonitoringPattern__Group__0 )
            // InternalServiceDefinition.g:509:4: rule__MonitoringPattern__Group__0
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
    // InternalServiceDefinition.g:518:1: entryRuleForkingPatternInstance : ruleForkingPatternInstance EOF ;
    public final void entryRuleForkingPatternInstance() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:519:1: ( ruleForkingPatternInstance EOF )
            // InternalServiceDefinition.g:520:1: ruleForkingPatternInstance EOF
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
    // InternalServiceDefinition.g:527:1: ruleForkingPatternInstance : ( ( rule__ForkingPatternInstance__Alternatives ) ) ;
    public final void ruleForkingPatternInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:531:2: ( ( ( rule__ForkingPatternInstance__Alternatives ) ) )
            // InternalServiceDefinition.g:532:2: ( ( rule__ForkingPatternInstance__Alternatives ) )
            {
            // InternalServiceDefinition.g:532:2: ( ( rule__ForkingPatternInstance__Alternatives ) )
            // InternalServiceDefinition.g:533:3: ( rule__ForkingPatternInstance__Alternatives )
            {
             before(grammarAccess.getForkingPatternInstanceAccess().getAlternatives()); 
            // InternalServiceDefinition.g:534:3: ( rule__ForkingPatternInstance__Alternatives )
            // InternalServiceDefinition.g:534:4: rule__ForkingPatternInstance__Alternatives
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
    // InternalServiceDefinition.g:543:1: entryRuleJoiningPatternInstance : ruleJoiningPatternInstance EOF ;
    public final void entryRuleJoiningPatternInstance() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:544:1: ( ruleJoiningPatternInstance EOF )
            // InternalServiceDefinition.g:545:1: ruleJoiningPatternInstance EOF
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
    // InternalServiceDefinition.g:552:1: ruleJoiningPatternInstance : ( ruleSendPattern ) ;
    public final void ruleJoiningPatternInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:556:2: ( ( ruleSendPattern ) )
            // InternalServiceDefinition.g:557:2: ( ruleSendPattern )
            {
            // InternalServiceDefinition.g:557:2: ( ruleSendPattern )
            // InternalServiceDefinition.g:558:3: ruleSendPattern
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
    // InternalServiceDefinition.g:568:1: entryRuleRequestAnswerPattern : ruleRequestAnswerPattern EOF ;
    public final void entryRuleRequestAnswerPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:569:1: ( ruleRequestAnswerPattern EOF )
            // InternalServiceDefinition.g:570:1: ruleRequestAnswerPattern EOF
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
    // InternalServiceDefinition.g:577:1: ruleRequestAnswerPattern : ( ruleQueryPattern ) ;
    public final void ruleRequestAnswerPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:581:2: ( ( ruleQueryPattern ) )
            // InternalServiceDefinition.g:582:2: ( ruleQueryPattern )
            {
            // InternalServiceDefinition.g:582:2: ( ruleQueryPattern )
            // InternalServiceDefinition.g:583:3: ruleQueryPattern
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
    // InternalServiceDefinition.g:593:1: entryRulePushPattern : rulePushPattern EOF ;
    public final void entryRulePushPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:594:1: ( rulePushPattern EOF )
            // InternalServiceDefinition.g:595:1: rulePushPattern EOF
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
    // InternalServiceDefinition.g:602:1: rulePushPattern : ( ( rule__PushPattern__Group__0 ) ) ;
    public final void rulePushPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:606:2: ( ( ( rule__PushPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:607:2: ( ( rule__PushPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:607:2: ( ( rule__PushPattern__Group__0 ) )
            // InternalServiceDefinition.g:608:3: ( rule__PushPattern__Group__0 )
            {
             before(grammarAccess.getPushPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:609:3: ( rule__PushPattern__Group__0 )
            // InternalServiceDefinition.g:609:4: rule__PushPattern__Group__0
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
    // InternalServiceDefinition.g:618:1: entryRuleEventPattern : ruleEventPattern EOF ;
    public final void entryRuleEventPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:619:1: ( ruleEventPattern EOF )
            // InternalServiceDefinition.g:620:1: ruleEventPattern EOF
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
    // InternalServiceDefinition.g:627:1: ruleEventPattern : ( ( rule__EventPattern__Group__0 ) ) ;
    public final void ruleEventPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:631:2: ( ( ( rule__EventPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:632:2: ( ( rule__EventPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:632:2: ( ( rule__EventPattern__Group__0 ) )
            // InternalServiceDefinition.g:633:3: ( rule__EventPattern__Group__0 )
            {
             before(grammarAccess.getEventPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:634:3: ( rule__EventPattern__Group__0 )
            // InternalServiceDefinition.g:634:4: rule__EventPattern__Group__0
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
    // InternalServiceDefinition.g:643:1: entryRuleQueryPattern : ruleQueryPattern EOF ;
    public final void entryRuleQueryPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:644:1: ( ruleQueryPattern EOF )
            // InternalServiceDefinition.g:645:1: ruleQueryPattern EOF
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
    // InternalServiceDefinition.g:652:1: ruleQueryPattern : ( ( rule__QueryPattern__Group__0 ) ) ;
    public final void ruleQueryPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:656:2: ( ( ( rule__QueryPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:657:2: ( ( rule__QueryPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:657:2: ( ( rule__QueryPattern__Group__0 ) )
            // InternalServiceDefinition.g:658:3: ( rule__QueryPattern__Group__0 )
            {
             before(grammarAccess.getQueryPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:659:3: ( rule__QueryPattern__Group__0 )
            // InternalServiceDefinition.g:659:4: rule__QueryPattern__Group__0
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
    // InternalServiceDefinition.g:668:1: entryRuleSendPattern : ruleSendPattern EOF ;
    public final void entryRuleSendPattern() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:669:1: ( ruleSendPattern EOF )
            // InternalServiceDefinition.g:670:1: ruleSendPattern EOF
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
    // InternalServiceDefinition.g:677:1: ruleSendPattern : ( ( rule__SendPattern__Group__0 ) ) ;
    public final void ruleSendPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:681:2: ( ( ( rule__SendPattern__Group__0 ) ) )
            // InternalServiceDefinition.g:682:2: ( ( rule__SendPattern__Group__0 ) )
            {
            // InternalServiceDefinition.g:682:2: ( ( rule__SendPattern__Group__0 ) )
            // InternalServiceDefinition.g:683:3: ( rule__SendPattern__Group__0 )
            {
             before(grammarAccess.getSendPatternAccess().getGroup()); 
            // InternalServiceDefinition.g:684:3: ( rule__SendPattern__Group__0 )
            // InternalServiceDefinition.g:684:4: rule__SendPattern__Group__0
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
    // InternalServiceDefinition.g:693:1: entryRuleServiceProperty : ruleServiceProperty EOF ;
    public final void entryRuleServiceProperty() throws RecognitionException {
        try {
            // InternalServiceDefinition.g:694:1: ( ruleServiceProperty EOF )
            // InternalServiceDefinition.g:695:1: ruleServiceProperty EOF
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
    // InternalServiceDefinition.g:702:1: ruleServiceProperty : ( ( rule__ServiceProperty__Group__0 ) ) ;
    public final void ruleServiceProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:706:2: ( ( ( rule__ServiceProperty__Group__0 ) ) )
            // InternalServiceDefinition.g:707:2: ( ( rule__ServiceProperty__Group__0 ) )
            {
            // InternalServiceDefinition.g:707:2: ( ( rule__ServiceProperty__Group__0 ) )
            // InternalServiceDefinition.g:708:3: ( rule__ServiceProperty__Group__0 )
            {
             before(grammarAccess.getServicePropertyAccess().getGroup()); 
            // InternalServiceDefinition.g:709:3: ( rule__ServiceProperty__Group__0 )
            // InternalServiceDefinition.g:709:4: rule__ServiceProperty__Group__0
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
    // InternalServiceDefinition.g:717:1: rule__AbstractServiceDefinition__Alternatives : ( ( ruleCommunicationServiceDefinition ) | ( ruleCoordinationServiceDefinition ) );
    public final void rule__AbstractServiceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:721:1: ( ( ruleCommunicationServiceDefinition ) | ( ruleCoordinationServiceDefinition ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                int LA1_1 = input.LA(2);

                if ( ((LA1_1>=23 && LA1_1<=25)) ) {
                    alt1=1;
                }
                else if ( (LA1_1==26) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 23:
            case 24:
            case 25:
                {
                alt1=1;
                }
                break;
            case 26:
                {
                alt1=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalServiceDefinition.g:722:2: ( ruleCommunicationServiceDefinition )
                    {
                    // InternalServiceDefinition.g:722:2: ( ruleCommunicationServiceDefinition )
                    // InternalServiceDefinition.g:723:3: ruleCommunicationServiceDefinition
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
                    // InternalServiceDefinition.g:728:2: ( ruleCoordinationServiceDefinition )
                    {
                    // InternalServiceDefinition.g:728:2: ( ruleCoordinationServiceDefinition )
                    // InternalServiceDefinition.g:729:3: ruleCoordinationServiceDefinition
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
    // InternalServiceDefinition.g:738:1: rule__CommunicationServiceDefinition__Alternatives : ( ( ruleForkingServiceDefinition ) | ( ruleJoyningServiceDefinition ) | ( ruleRequestAnswerServiceDefinition ) );
    public final void rule__CommunicationServiceDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:742:1: ( ( ruleForkingServiceDefinition ) | ( ruleJoyningServiceDefinition ) | ( ruleRequestAnswerServiceDefinition ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 23:
                    {
                    alt2=1;
                    }
                    break;
                case 24:
                    {
                    alt2=2;
                    }
                    break;
                case 25:
                    {
                    alt2=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }

                }
                break;
            case 23:
                {
                alt2=1;
                }
                break;
            case 24:
                {
                alt2=2;
                }
                break;
            case 25:
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
                    // InternalServiceDefinition.g:743:2: ( ruleForkingServiceDefinition )
                    {
                    // InternalServiceDefinition.g:743:2: ( ruleForkingServiceDefinition )
                    // InternalServiceDefinition.g:744:3: ruleForkingServiceDefinition
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
                    // InternalServiceDefinition.g:749:2: ( ruleJoyningServiceDefinition )
                    {
                    // InternalServiceDefinition.g:749:2: ( ruleJoyningServiceDefinition )
                    // InternalServiceDefinition.g:750:3: ruleJoyningServiceDefinition
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
                    // InternalServiceDefinition.g:755:2: ( ruleRequestAnswerServiceDefinition )
                    {
                    // InternalServiceDefinition.g:755:2: ( ruleRequestAnswerServiceDefinition )
                    // InternalServiceDefinition.g:756:3: ruleRequestAnswerServiceDefinition
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
    // InternalServiceDefinition.g:765:1: rule__ForkingPatternInstance__Alternatives : ( ( rulePushPattern ) | ( ruleEventPattern ) );
    public final void rule__ForkingPatternInstance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:769:1: ( ( rulePushPattern ) | ( ruleEventPattern ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==37) ) {
                alt3=1;
            }
            else if ( (LA3_0==40) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalServiceDefinition.g:770:2: ( rulePushPattern )
                    {
                    // InternalServiceDefinition.g:770:2: ( rulePushPattern )
                    // InternalServiceDefinition.g:771:3: rulePushPattern
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
                    // InternalServiceDefinition.g:776:2: ( ruleEventPattern )
                    {
                    // InternalServiceDefinition.g:776:2: ( ruleEventPattern )
                    // InternalServiceDefinition.g:777:3: ruleEventPattern
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
    // InternalServiceDefinition.g:786:1: rule__ServiceDefModel__Group__0 : rule__ServiceDefModel__Group__0__Impl rule__ServiceDefModel__Group__1 ;
    public final void rule__ServiceDefModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:790:1: ( rule__ServiceDefModel__Group__0__Impl rule__ServiceDefModel__Group__1 )
            // InternalServiceDefinition.g:791:2: rule__ServiceDefModel__Group__0__Impl rule__ServiceDefModel__Group__1
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
    // InternalServiceDefinition.g:798:1: rule__ServiceDefModel__Group__0__Impl : ( () ) ;
    public final void rule__ServiceDefModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:802:1: ( ( () ) )
            // InternalServiceDefinition.g:803:1: ( () )
            {
            // InternalServiceDefinition.g:803:1: ( () )
            // InternalServiceDefinition.g:804:2: ()
            {
             before(grammarAccess.getServiceDefModelAccess().getServiceDefModelAction_0()); 
            // InternalServiceDefinition.g:805:2: ()
            // InternalServiceDefinition.g:805:3: 
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
    // InternalServiceDefinition.g:813:1: rule__ServiceDefModel__Group__1 : rule__ServiceDefModel__Group__1__Impl rule__ServiceDefModel__Group__2 ;
    public final void rule__ServiceDefModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:817:1: ( rule__ServiceDefModel__Group__1__Impl rule__ServiceDefModel__Group__2 )
            // InternalServiceDefinition.g:818:2: rule__ServiceDefModel__Group__1__Impl rule__ServiceDefModel__Group__2
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
    // InternalServiceDefinition.g:825:1: rule__ServiceDefModel__Group__1__Impl : ( ( rule__ServiceDefModel__ImportsAssignment_1 )* ) ;
    public final void rule__ServiceDefModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:829:1: ( ( ( rule__ServiceDefModel__ImportsAssignment_1 )* ) )
            // InternalServiceDefinition.g:830:1: ( ( rule__ServiceDefModel__ImportsAssignment_1 )* )
            {
            // InternalServiceDefinition.g:830:1: ( ( rule__ServiceDefModel__ImportsAssignment_1 )* )
            // InternalServiceDefinition.g:831:2: ( rule__ServiceDefModel__ImportsAssignment_1 )*
            {
             before(grammarAccess.getServiceDefModelAccess().getImportsAssignment_1()); 
            // InternalServiceDefinition.g:832:2: ( rule__ServiceDefModel__ImportsAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalServiceDefinition.g:832:3: rule__ServiceDefModel__ImportsAssignment_1
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
    // InternalServiceDefinition.g:840:1: rule__ServiceDefModel__Group__2 : rule__ServiceDefModel__Group__2__Impl ;
    public final void rule__ServiceDefModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:844:1: ( rule__ServiceDefModel__Group__2__Impl )
            // InternalServiceDefinition.g:845:2: rule__ServiceDefModel__Group__2__Impl
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
    // InternalServiceDefinition.g:851:1: rule__ServiceDefModel__Group__2__Impl : ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? ) ;
    public final void rule__ServiceDefModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:855:1: ( ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? ) )
            // InternalServiceDefinition.g:856:1: ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? )
            {
            // InternalServiceDefinition.g:856:1: ( ( rule__ServiceDefModel__RepositoryAssignment_2 )? )
            // InternalServiceDefinition.g:857:2: ( rule__ServiceDefModel__RepositoryAssignment_2 )?
            {
             before(grammarAccess.getServiceDefModelAccess().getRepositoryAssignment_2()); 
            // InternalServiceDefinition.g:858:2: ( rule__ServiceDefModel__RepositoryAssignment_2 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_DOCU_COMMENT||LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalServiceDefinition.g:858:3: rule__ServiceDefModel__RepositoryAssignment_2
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
    // InternalServiceDefinition.g:867:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:871:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalServiceDefinition.g:872:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalServiceDefinition.g:879:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:883:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:884:1: ( RULE_ID )
            {
            // InternalServiceDefinition.g:884:1: ( RULE_ID )
            // InternalServiceDefinition.g:885:2: RULE_ID
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
    // InternalServiceDefinition.g:894:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:898:1: ( rule__FQN__Group__1__Impl )
            // InternalServiceDefinition.g:899:2: rule__FQN__Group__1__Impl
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
    // InternalServiceDefinition.g:905:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:909:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalServiceDefinition.g:910:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalServiceDefinition.g:910:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalServiceDefinition.g:911:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalServiceDefinition.g:912:2: ( rule__FQN__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==14) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalServiceDefinition.g:912:3: rule__FQN__Group_1__0
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
    // InternalServiceDefinition.g:921:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:925:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalServiceDefinition.g:926:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalServiceDefinition.g:933:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:937:1: ( ( '.' ) )
            // InternalServiceDefinition.g:938:1: ( '.' )
            {
            // InternalServiceDefinition.g:938:1: ( '.' )
            // InternalServiceDefinition.g:939:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalServiceDefinition.g:948:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:952:1: ( rule__FQN__Group_1__1__Impl )
            // InternalServiceDefinition.g:953:2: rule__FQN__Group_1__1__Impl
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
    // InternalServiceDefinition.g:959:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:963:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:964:1: ( RULE_ID )
            {
            // InternalServiceDefinition.g:964:1: ( RULE_ID )
            // InternalServiceDefinition.g:965:2: RULE_ID
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
    // InternalServiceDefinition.g:975:1: rule__FQNW__Group__0 : rule__FQNW__Group__0__Impl rule__FQNW__Group__1 ;
    public final void rule__FQNW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:979:1: ( rule__FQNW__Group__0__Impl rule__FQNW__Group__1 )
            // InternalServiceDefinition.g:980:2: rule__FQNW__Group__0__Impl rule__FQNW__Group__1
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
    // InternalServiceDefinition.g:987:1: rule__FQNW__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:991:1: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:992:1: ( ruleFQN )
            {
            // InternalServiceDefinition.g:992:1: ( ruleFQN )
            // InternalServiceDefinition.g:993:2: ruleFQN
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
    // InternalServiceDefinition.g:1002:1: rule__FQNW__Group__1 : rule__FQNW__Group__1__Impl ;
    public final void rule__FQNW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1006:1: ( rule__FQNW__Group__1__Impl )
            // InternalServiceDefinition.g:1007:2: rule__FQNW__Group__1__Impl
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
    // InternalServiceDefinition.g:1013:1: rule__FQNW__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1017:1: ( ( ( '.*' )? ) )
            // InternalServiceDefinition.g:1018:1: ( ( '.*' )? )
            {
            // InternalServiceDefinition.g:1018:1: ( ( '.*' )? )
            // InternalServiceDefinition.g:1019:2: ( '.*' )?
            {
             before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); 
            // InternalServiceDefinition.g:1020:2: ( '.*' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalServiceDefinition.g:1020:3: '.*'
                    {
                    match(input,15,FOLLOW_2); 

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
    // InternalServiceDefinition.g:1029:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1033:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalServiceDefinition.g:1034:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalServiceDefinition.g:1041:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1045:1: ( ( ( '-' )? ) )
            // InternalServiceDefinition.g:1046:1: ( ( '-' )? )
            {
            // InternalServiceDefinition.g:1046:1: ( ( '-' )? )
            // InternalServiceDefinition.g:1047:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalServiceDefinition.g:1048:2: ( '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==16) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalServiceDefinition.g:1048:3: '-'
                    {
                    match(input,16,FOLLOW_2); 

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
    // InternalServiceDefinition.g:1056:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1060:1: ( rule__EInt__Group__1__Impl )
            // InternalServiceDefinition.g:1061:2: rule__EInt__Group__1__Impl
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
    // InternalServiceDefinition.g:1067:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1071:1: ( ( RULE_INT ) )
            // InternalServiceDefinition.g:1072:1: ( RULE_INT )
            {
            // InternalServiceDefinition.g:1072:1: ( RULE_INT )
            // InternalServiceDefinition.g:1073:2: RULE_INT
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
    // InternalServiceDefinition.g:1083:1: rule__ServiceDefRepository__Group__0 : rule__ServiceDefRepository__Group__0__Impl rule__ServiceDefRepository__Group__1 ;
    public final void rule__ServiceDefRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1087:1: ( rule__ServiceDefRepository__Group__0__Impl rule__ServiceDefRepository__Group__1 )
            // InternalServiceDefinition.g:1088:2: rule__ServiceDefRepository__Group__0__Impl rule__ServiceDefRepository__Group__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalServiceDefinition.g:1095:1: rule__ServiceDefRepository__Group__0__Impl : ( ( rule__ServiceDefRepository__DocumentationAssignment_0 )? ) ;
    public final void rule__ServiceDefRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1099:1: ( ( ( rule__ServiceDefRepository__DocumentationAssignment_0 )? ) )
            // InternalServiceDefinition.g:1100:1: ( ( rule__ServiceDefRepository__DocumentationAssignment_0 )? )
            {
            // InternalServiceDefinition.g:1100:1: ( ( rule__ServiceDefRepository__DocumentationAssignment_0 )? )
            // InternalServiceDefinition.g:1101:2: ( rule__ServiceDefRepository__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getDocumentationAssignment_0()); 
            // InternalServiceDefinition.g:1102:2: ( rule__ServiceDefRepository__DocumentationAssignment_0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_DOCU_COMMENT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalServiceDefinition.g:1102:3: rule__ServiceDefRepository__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceDefRepository__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceDefRepositoryAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1110:1: rule__ServiceDefRepository__Group__1 : rule__ServiceDefRepository__Group__1__Impl rule__ServiceDefRepository__Group__2 ;
    public final void rule__ServiceDefRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1114:1: ( rule__ServiceDefRepository__Group__1__Impl rule__ServiceDefRepository__Group__2 )
            // InternalServiceDefinition.g:1115:2: rule__ServiceDefRepository__Group__1__Impl rule__ServiceDefRepository__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalServiceDefinition.g:1122:1: rule__ServiceDefRepository__Group__1__Impl : ( 'ServiceDefRepository' ) ;
    public final void rule__ServiceDefRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1126:1: ( ( 'ServiceDefRepository' ) )
            // InternalServiceDefinition.g:1127:1: ( 'ServiceDefRepository' )
            {
            // InternalServiceDefinition.g:1127:1: ( 'ServiceDefRepository' )
            // InternalServiceDefinition.g:1128:2: 'ServiceDefRepository'
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getServiceDefRepositoryKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getServiceDefRepositoryAccess().getServiceDefRepositoryKeyword_1()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1137:1: rule__ServiceDefRepository__Group__2 : rule__ServiceDefRepository__Group__2__Impl rule__ServiceDefRepository__Group__3 ;
    public final void rule__ServiceDefRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1141:1: ( rule__ServiceDefRepository__Group__2__Impl rule__ServiceDefRepository__Group__3 )
            // InternalServiceDefinition.g:1142:2: rule__ServiceDefRepository__Group__2__Impl rule__ServiceDefRepository__Group__3
            {
            pushFollow(FOLLOW_11);
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
    // InternalServiceDefinition.g:1149:1: rule__ServiceDefRepository__Group__2__Impl : ( ( rule__ServiceDefRepository__NameAssignment_2 ) ) ;
    public final void rule__ServiceDefRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1153:1: ( ( ( rule__ServiceDefRepository__NameAssignment_2 ) ) )
            // InternalServiceDefinition.g:1154:1: ( ( rule__ServiceDefRepository__NameAssignment_2 ) )
            {
            // InternalServiceDefinition.g:1154:1: ( ( rule__ServiceDefRepository__NameAssignment_2 ) )
            // InternalServiceDefinition.g:1155:2: ( rule__ServiceDefRepository__NameAssignment_2 )
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getNameAssignment_2()); 
            // InternalServiceDefinition.g:1156:2: ( rule__ServiceDefRepository__NameAssignment_2 )
            // InternalServiceDefinition.g:1156:3: rule__ServiceDefRepository__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceDefRepositoryAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1164:1: rule__ServiceDefRepository__Group__3 : rule__ServiceDefRepository__Group__3__Impl rule__ServiceDefRepository__Group__4 ;
    public final void rule__ServiceDefRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1168:1: ( rule__ServiceDefRepository__Group__3__Impl rule__ServiceDefRepository__Group__4 )
            // InternalServiceDefinition.g:1169:2: rule__ServiceDefRepository__Group__3__Impl rule__ServiceDefRepository__Group__4
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
    // InternalServiceDefinition.g:1176:1: rule__ServiceDefRepository__Group__3__Impl : ( ( rule__ServiceDefRepository__Group_3__0 )? ) ;
    public final void rule__ServiceDefRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1180:1: ( ( ( rule__ServiceDefRepository__Group_3__0 )? ) )
            // InternalServiceDefinition.g:1181:1: ( ( rule__ServiceDefRepository__Group_3__0 )? )
            {
            // InternalServiceDefinition.g:1181:1: ( ( rule__ServiceDefRepository__Group_3__0 )? )
            // InternalServiceDefinition.g:1182:2: ( rule__ServiceDefRepository__Group_3__0 )?
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getGroup_3()); 
            // InternalServiceDefinition.g:1183:2: ( rule__ServiceDefRepository__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalServiceDefinition.g:1183:3: rule__ServiceDefRepository__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceDefRepository__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceDefRepositoryAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1191:1: rule__ServiceDefRepository__Group__4 : rule__ServiceDefRepository__Group__4__Impl rule__ServiceDefRepository__Group__5 ;
    public final void rule__ServiceDefRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1195:1: ( rule__ServiceDefRepository__Group__4__Impl rule__ServiceDefRepository__Group__5 )
            // InternalServiceDefinition.g:1196:2: rule__ServiceDefRepository__Group__4__Impl rule__ServiceDefRepository__Group__5
            {
            pushFollow(FOLLOW_12);
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
    // InternalServiceDefinition.g:1203:1: rule__ServiceDefRepository__Group__4__Impl : ( '{' ) ;
    public final void rule__ServiceDefRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1207:1: ( ( '{' ) )
            // InternalServiceDefinition.g:1208:1: ( '{' )
            {
            // InternalServiceDefinition.g:1208:1: ( '{' )
            // InternalServiceDefinition.g:1209:2: '{'
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getServiceDefRepositoryAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1218:1: rule__ServiceDefRepository__Group__5 : rule__ServiceDefRepository__Group__5__Impl rule__ServiceDefRepository__Group__6 ;
    public final void rule__ServiceDefRepository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1222:1: ( rule__ServiceDefRepository__Group__5__Impl rule__ServiceDefRepository__Group__6 )
            // InternalServiceDefinition.g:1223:2: rule__ServiceDefRepository__Group__5__Impl rule__ServiceDefRepository__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__ServiceDefRepository__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group__6();

            state._fsp--;


            }

        }
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
    // InternalServiceDefinition.g:1230:1: rule__ServiceDefRepository__Group__5__Impl : ( ( rule__ServiceDefRepository__ServicesAssignment_5 )* ) ;
    public final void rule__ServiceDefRepository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1234:1: ( ( ( rule__ServiceDefRepository__ServicesAssignment_5 )* ) )
            // InternalServiceDefinition.g:1235:1: ( ( rule__ServiceDefRepository__ServicesAssignment_5 )* )
            {
            // InternalServiceDefinition.g:1235:1: ( ( rule__ServiceDefRepository__ServicesAssignment_5 )* )
            // InternalServiceDefinition.g:1236:2: ( rule__ServiceDefRepository__ServicesAssignment_5 )*
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getServicesAssignment_5()); 
            // InternalServiceDefinition.g:1237:2: ( rule__ServiceDefRepository__ServicesAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DOCU_COMMENT||(LA11_0>=23 && LA11_0<=26)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalServiceDefinition.g:1237:3: rule__ServiceDefRepository__ServicesAssignment_5
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ServiceDefRepository__ServicesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getServiceDefRepositoryAccess().getServicesAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__ServiceDefRepository__Group__6"
    // InternalServiceDefinition.g:1245:1: rule__ServiceDefRepository__Group__6 : rule__ServiceDefRepository__Group__6__Impl ;
    public final void rule__ServiceDefRepository__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1249:1: ( rule__ServiceDefRepository__Group__6__Impl )
            // InternalServiceDefinition.g:1250:2: rule__ServiceDefRepository__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__6"


    // $ANTLR start "rule__ServiceDefRepository__Group__6__Impl"
    // InternalServiceDefinition.g:1256:1: rule__ServiceDefRepository__Group__6__Impl : ( '}' ) ;
    public final void rule__ServiceDefRepository__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1260:1: ( ( '}' ) )
            // InternalServiceDefinition.g:1261:1: ( '}' )
            {
            // InternalServiceDefinition.g:1261:1: ( '}' )
            // InternalServiceDefinition.g:1262:2: '}'
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getServiceDefRepositoryAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group__6__Impl"


    // $ANTLR start "rule__ServiceDefRepository__Group_3__0"
    // InternalServiceDefinition.g:1272:1: rule__ServiceDefRepository__Group_3__0 : rule__ServiceDefRepository__Group_3__0__Impl rule__ServiceDefRepository__Group_3__1 ;
    public final void rule__ServiceDefRepository__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1276:1: ( rule__ServiceDefRepository__Group_3__0__Impl rule__ServiceDefRepository__Group_3__1 )
            // InternalServiceDefinition.g:1277:2: rule__ServiceDefRepository__Group_3__0__Impl rule__ServiceDefRepository__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ServiceDefRepository__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group_3__0"


    // $ANTLR start "rule__ServiceDefRepository__Group_3__0__Impl"
    // InternalServiceDefinition.g:1284:1: rule__ServiceDefRepository__Group_3__0__Impl : ( 'version' ) ;
    public final void rule__ServiceDefRepository__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1288:1: ( ( 'version' ) )
            // InternalServiceDefinition.g:1289:1: ( 'version' )
            {
            // InternalServiceDefinition.g:1289:1: ( 'version' )
            // InternalServiceDefinition.g:1290:2: 'version'
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getVersionKeyword_3_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getServiceDefRepositoryAccess().getVersionKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group_3__0__Impl"


    // $ANTLR start "rule__ServiceDefRepository__Group_3__1"
    // InternalServiceDefinition.g:1299:1: rule__ServiceDefRepository__Group_3__1 : rule__ServiceDefRepository__Group_3__1__Impl ;
    public final void rule__ServiceDefRepository__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1303:1: ( rule__ServiceDefRepository__Group_3__1__Impl )
            // InternalServiceDefinition.g:1304:2: rule__ServiceDefRepository__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group_3__1"


    // $ANTLR start "rule__ServiceDefRepository__Group_3__1__Impl"
    // InternalServiceDefinition.g:1310:1: rule__ServiceDefRepository__Group_3__1__Impl : ( ( rule__ServiceDefRepository__VersionAssignment_3_1 ) ) ;
    public final void rule__ServiceDefRepository__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1314:1: ( ( ( rule__ServiceDefRepository__VersionAssignment_3_1 ) ) )
            // InternalServiceDefinition.g:1315:1: ( ( rule__ServiceDefRepository__VersionAssignment_3_1 ) )
            {
            // InternalServiceDefinition.g:1315:1: ( ( rule__ServiceDefRepository__VersionAssignment_3_1 ) )
            // InternalServiceDefinition.g:1316:2: ( rule__ServiceDefRepository__VersionAssignment_3_1 )
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getVersionAssignment_3_1()); 
            // InternalServiceDefinition.g:1317:2: ( rule__ServiceDefRepository__VersionAssignment_3_1 )
            // InternalServiceDefinition.g:1317:3: rule__ServiceDefRepository__VersionAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceDefRepository__VersionAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceDefRepositoryAccess().getVersionAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__Group_3__1__Impl"


    // $ANTLR start "rule__ServiceRepoVersion__Group__0"
    // InternalServiceDefinition.g:1326:1: rule__ServiceRepoVersion__Group__0 : rule__ServiceRepoVersion__Group__0__Impl rule__ServiceRepoVersion__Group__1 ;
    public final void rule__ServiceRepoVersion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1330:1: ( rule__ServiceRepoVersion__Group__0__Impl rule__ServiceRepoVersion__Group__1 )
            // InternalServiceDefinition.g:1331:2: rule__ServiceRepoVersion__Group__0__Impl rule__ServiceRepoVersion__Group__1
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
    // InternalServiceDefinition.g:1338:1: rule__ServiceRepoVersion__Group__0__Impl : ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) ) ;
    public final void rule__ServiceRepoVersion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1342:1: ( ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) ) )
            // InternalServiceDefinition.g:1343:1: ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) )
            {
            // InternalServiceDefinition.g:1343:1: ( ( rule__ServiceRepoVersion__MajorAssignment_0 ) )
            // InternalServiceDefinition.g:1344:2: ( rule__ServiceRepoVersion__MajorAssignment_0 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getMajorAssignment_0()); 
            // InternalServiceDefinition.g:1345:2: ( rule__ServiceRepoVersion__MajorAssignment_0 )
            // InternalServiceDefinition.g:1345:3: rule__ServiceRepoVersion__MajorAssignment_0
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
    // InternalServiceDefinition.g:1353:1: rule__ServiceRepoVersion__Group__1 : rule__ServiceRepoVersion__Group__1__Impl rule__ServiceRepoVersion__Group__2 ;
    public final void rule__ServiceRepoVersion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1357:1: ( rule__ServiceRepoVersion__Group__1__Impl rule__ServiceRepoVersion__Group__2 )
            // InternalServiceDefinition.g:1358:2: rule__ServiceRepoVersion__Group__1__Impl rule__ServiceRepoVersion__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalServiceDefinition.g:1365:1: rule__ServiceRepoVersion__Group__1__Impl : ( '.' ) ;
    public final void rule__ServiceRepoVersion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1369:1: ( ( '.' ) )
            // InternalServiceDefinition.g:1370:1: ( '.' )
            {
            // InternalServiceDefinition.g:1370:1: ( '.' )
            // InternalServiceDefinition.g:1371:2: '.'
            {
             before(grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalServiceDefinition.g:1380:1: rule__ServiceRepoVersion__Group__2 : rule__ServiceRepoVersion__Group__2__Impl rule__ServiceRepoVersion__Group__3 ;
    public final void rule__ServiceRepoVersion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1384:1: ( rule__ServiceRepoVersion__Group__2__Impl rule__ServiceRepoVersion__Group__3 )
            // InternalServiceDefinition.g:1385:2: rule__ServiceRepoVersion__Group__2__Impl rule__ServiceRepoVersion__Group__3
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
    // InternalServiceDefinition.g:1392:1: rule__ServiceRepoVersion__Group__2__Impl : ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) ) ;
    public final void rule__ServiceRepoVersion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1396:1: ( ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) ) )
            // InternalServiceDefinition.g:1397:1: ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) )
            {
            // InternalServiceDefinition.g:1397:1: ( ( rule__ServiceRepoVersion__MinorAssignment_2 ) )
            // InternalServiceDefinition.g:1398:2: ( rule__ServiceRepoVersion__MinorAssignment_2 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getMinorAssignment_2()); 
            // InternalServiceDefinition.g:1399:2: ( rule__ServiceRepoVersion__MinorAssignment_2 )
            // InternalServiceDefinition.g:1399:3: rule__ServiceRepoVersion__MinorAssignment_2
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
    // InternalServiceDefinition.g:1407:1: rule__ServiceRepoVersion__Group__3 : rule__ServiceRepoVersion__Group__3__Impl ;
    public final void rule__ServiceRepoVersion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1411:1: ( rule__ServiceRepoVersion__Group__3__Impl )
            // InternalServiceDefinition.g:1412:2: rule__ServiceRepoVersion__Group__3__Impl
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
    // InternalServiceDefinition.g:1418:1: rule__ServiceRepoVersion__Group__3__Impl : ( ( rule__ServiceRepoVersion__Group_3__0 )? ) ;
    public final void rule__ServiceRepoVersion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1422:1: ( ( ( rule__ServiceRepoVersion__Group_3__0 )? ) )
            // InternalServiceDefinition.g:1423:1: ( ( rule__ServiceRepoVersion__Group_3__0 )? )
            {
            // InternalServiceDefinition.g:1423:1: ( ( rule__ServiceRepoVersion__Group_3__0 )? )
            // InternalServiceDefinition.g:1424:2: ( rule__ServiceRepoVersion__Group_3__0 )?
            {
             before(grammarAccess.getServiceRepoVersionAccess().getGroup_3()); 
            // InternalServiceDefinition.g:1425:2: ( rule__ServiceRepoVersion__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalServiceDefinition.g:1425:3: rule__ServiceRepoVersion__Group_3__0
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
    // InternalServiceDefinition.g:1434:1: rule__ServiceRepoVersion__Group_3__0 : rule__ServiceRepoVersion__Group_3__0__Impl rule__ServiceRepoVersion__Group_3__1 ;
    public final void rule__ServiceRepoVersion__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1438:1: ( rule__ServiceRepoVersion__Group_3__0__Impl rule__ServiceRepoVersion__Group_3__1 )
            // InternalServiceDefinition.g:1439:2: rule__ServiceRepoVersion__Group_3__0__Impl rule__ServiceRepoVersion__Group_3__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalServiceDefinition.g:1446:1: rule__ServiceRepoVersion__Group_3__0__Impl : ( '.' ) ;
    public final void rule__ServiceRepoVersion__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1450:1: ( ( '.' ) )
            // InternalServiceDefinition.g:1451:1: ( '.' )
            {
            // InternalServiceDefinition.g:1451:1: ( '.' )
            // InternalServiceDefinition.g:1452:2: '.'
            {
             before(grammarAccess.getServiceRepoVersionAccess().getFullStopKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalServiceDefinition.g:1461:1: rule__ServiceRepoVersion__Group_3__1 : rule__ServiceRepoVersion__Group_3__1__Impl ;
    public final void rule__ServiceRepoVersion__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1465:1: ( rule__ServiceRepoVersion__Group_3__1__Impl )
            // InternalServiceDefinition.g:1466:2: rule__ServiceRepoVersion__Group_3__1__Impl
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
    // InternalServiceDefinition.g:1472:1: rule__ServiceRepoVersion__Group_3__1__Impl : ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) ) ;
    public final void rule__ServiceRepoVersion__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1476:1: ( ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) ) )
            // InternalServiceDefinition.g:1477:1: ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) )
            {
            // InternalServiceDefinition.g:1477:1: ( ( rule__ServiceRepoVersion__PatchAssignment_3_1 ) )
            // InternalServiceDefinition.g:1478:2: ( rule__ServiceRepoVersion__PatchAssignment_3_1 )
            {
             before(grammarAccess.getServiceRepoVersionAccess().getPatchAssignment_3_1()); 
            // InternalServiceDefinition.g:1479:2: ( rule__ServiceRepoVersion__PatchAssignment_3_1 )
            // InternalServiceDefinition.g:1479:3: rule__ServiceRepoVersion__PatchAssignment_3_1
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
    // InternalServiceDefinition.g:1488:1: rule__CommRepoImport__Group__0 : rule__CommRepoImport__Group__0__Impl rule__CommRepoImport__Group__1 ;
    public final void rule__CommRepoImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1492:1: ( rule__CommRepoImport__Group__0__Impl rule__CommRepoImport__Group__1 )
            // InternalServiceDefinition.g:1493:2: rule__CommRepoImport__Group__0__Impl rule__CommRepoImport__Group__1
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
    // InternalServiceDefinition.g:1500:1: rule__CommRepoImport__Group__0__Impl : ( '#import' ) ;
    public final void rule__CommRepoImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1504:1: ( ( '#import' ) )
            // InternalServiceDefinition.g:1505:1: ( '#import' )
            {
            // InternalServiceDefinition.g:1505:1: ( '#import' )
            // InternalServiceDefinition.g:1506:2: '#import'
            {
             before(grammarAccess.getCommRepoImportAccess().getImportKeyword_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalServiceDefinition.g:1515:1: rule__CommRepoImport__Group__1 : rule__CommRepoImport__Group__1__Impl rule__CommRepoImport__Group__2 ;
    public final void rule__CommRepoImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1519:1: ( rule__CommRepoImport__Group__1__Impl rule__CommRepoImport__Group__2 )
            // InternalServiceDefinition.g:1520:2: rule__CommRepoImport__Group__1__Impl rule__CommRepoImport__Group__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalServiceDefinition.g:1527:1: rule__CommRepoImport__Group__1__Impl : ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__CommRepoImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1531:1: ( ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalServiceDefinition.g:1532:1: ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalServiceDefinition.g:1532:1: ( ( rule__CommRepoImport__ImportedNamespaceAssignment_1 ) )
            // InternalServiceDefinition.g:1533:2: ( rule__CommRepoImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getCommRepoImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalServiceDefinition.g:1534:2: ( rule__CommRepoImport__ImportedNamespaceAssignment_1 )
            // InternalServiceDefinition.g:1534:3: rule__CommRepoImport__ImportedNamespaceAssignment_1
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
    // InternalServiceDefinition.g:1542:1: rule__CommRepoImport__Group__2 : rule__CommRepoImport__Group__2__Impl ;
    public final void rule__CommRepoImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1546:1: ( rule__CommRepoImport__Group__2__Impl )
            // InternalServiceDefinition.g:1547:2: rule__CommRepoImport__Group__2__Impl
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
    // InternalServiceDefinition.g:1553:1: rule__CommRepoImport__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__CommRepoImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1557:1: ( ( ( ';' )? ) )
            // InternalServiceDefinition.g:1558:1: ( ( ';' )? )
            {
            // InternalServiceDefinition.g:1558:1: ( ( ';' )? )
            // InternalServiceDefinition.g:1559:2: ( ';' )?
            {
             before(grammarAccess.getCommRepoImportAccess().getSemicolonKeyword_2()); 
            // InternalServiceDefinition.g:1560:2: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalServiceDefinition.g:1560:3: ';'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalServiceDefinition.g:1569:1: rule__ForkingServiceDefinition__Group__0 : rule__ForkingServiceDefinition__Group__0__Impl rule__ForkingServiceDefinition__Group__1 ;
    public final void rule__ForkingServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1573:1: ( rule__ForkingServiceDefinition__Group__0__Impl rule__ForkingServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:1574:2: rule__ForkingServiceDefinition__Group__0__Impl rule__ForkingServiceDefinition__Group__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalServiceDefinition.g:1581:1: rule__ForkingServiceDefinition__Group__0__Impl : ( ( rule__ForkingServiceDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__ForkingServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1585:1: ( ( ( rule__ForkingServiceDefinition__DocumentationAssignment_0 )? ) )
            // InternalServiceDefinition.g:1586:1: ( ( rule__ForkingServiceDefinition__DocumentationAssignment_0 )? )
            {
            // InternalServiceDefinition.g:1586:1: ( ( rule__ForkingServiceDefinition__DocumentationAssignment_0 )? )
            // InternalServiceDefinition.g:1587:2: ( rule__ForkingServiceDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalServiceDefinition.g:1588:2: ( rule__ForkingServiceDefinition__DocumentationAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DOCU_COMMENT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalServiceDefinition.g:1588:3: rule__ForkingServiceDefinition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ForkingServiceDefinition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getForkingServiceDefinitionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1596:1: rule__ForkingServiceDefinition__Group__1 : rule__ForkingServiceDefinition__Group__1__Impl rule__ForkingServiceDefinition__Group__2 ;
    public final void rule__ForkingServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1600:1: ( rule__ForkingServiceDefinition__Group__1__Impl rule__ForkingServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:1601:2: rule__ForkingServiceDefinition__Group__1__Impl rule__ForkingServiceDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalServiceDefinition.g:1608:1: rule__ForkingServiceDefinition__Group__1__Impl : ( 'ForkingServiceDefinition' ) ;
    public final void rule__ForkingServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1612:1: ( ( 'ForkingServiceDefinition' ) )
            // InternalServiceDefinition.g:1613:1: ( 'ForkingServiceDefinition' )
            {
            // InternalServiceDefinition.g:1613:1: ( 'ForkingServiceDefinition' )
            // InternalServiceDefinition.g:1614:2: 'ForkingServiceDefinition'
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getForkingServiceDefinitionKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getForkingServiceDefinitionAccess().getForkingServiceDefinitionKeyword_1()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1623:1: rule__ForkingServiceDefinition__Group__2 : rule__ForkingServiceDefinition__Group__2__Impl rule__ForkingServiceDefinition__Group__3 ;
    public final void rule__ForkingServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1627:1: ( rule__ForkingServiceDefinition__Group__2__Impl rule__ForkingServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:1628:2: rule__ForkingServiceDefinition__Group__2__Impl rule__ForkingServiceDefinition__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalServiceDefinition.g:1635:1: rule__ForkingServiceDefinition__Group__2__Impl : ( ( rule__ForkingServiceDefinition__NameAssignment_2 ) ) ;
    public final void rule__ForkingServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1639:1: ( ( ( rule__ForkingServiceDefinition__NameAssignment_2 ) ) )
            // InternalServiceDefinition.g:1640:1: ( ( rule__ForkingServiceDefinition__NameAssignment_2 ) )
            {
            // InternalServiceDefinition.g:1640:1: ( ( rule__ForkingServiceDefinition__NameAssignment_2 ) )
            // InternalServiceDefinition.g:1641:2: ( rule__ForkingServiceDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getNameAssignment_2()); 
            // InternalServiceDefinition.g:1642:2: ( rule__ForkingServiceDefinition__NameAssignment_2 )
            // InternalServiceDefinition.g:1642:3: rule__ForkingServiceDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getForkingServiceDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1650:1: rule__ForkingServiceDefinition__Group__3 : rule__ForkingServiceDefinition__Group__3__Impl rule__ForkingServiceDefinition__Group__4 ;
    public final void rule__ForkingServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1654:1: ( rule__ForkingServiceDefinition__Group__3__Impl rule__ForkingServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:1655:2: rule__ForkingServiceDefinition__Group__3__Impl rule__ForkingServiceDefinition__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalServiceDefinition.g:1662:1: rule__ForkingServiceDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ForkingServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1666:1: ( ( '{' ) )
            // InternalServiceDefinition.g:1667:1: ( '{' )
            {
            // InternalServiceDefinition.g:1667:1: ( '{' )
            // InternalServiceDefinition.g:1668:2: '{'
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getForkingServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1677:1: rule__ForkingServiceDefinition__Group__4 : rule__ForkingServiceDefinition__Group__4__Impl rule__ForkingServiceDefinition__Group__5 ;
    public final void rule__ForkingServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1681:1: ( rule__ForkingServiceDefinition__Group__4__Impl rule__ForkingServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:1682:2: rule__ForkingServiceDefinition__Group__4__Impl rule__ForkingServiceDefinition__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalServiceDefinition.g:1689:1: rule__ForkingServiceDefinition__Group__4__Impl : ( ( rule__ForkingServiceDefinition__PatternAssignment_4 ) ) ;
    public final void rule__ForkingServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1693:1: ( ( ( rule__ForkingServiceDefinition__PatternAssignment_4 ) ) )
            // InternalServiceDefinition.g:1694:1: ( ( rule__ForkingServiceDefinition__PatternAssignment_4 ) )
            {
            // InternalServiceDefinition.g:1694:1: ( ( rule__ForkingServiceDefinition__PatternAssignment_4 ) )
            // InternalServiceDefinition.g:1695:2: ( rule__ForkingServiceDefinition__PatternAssignment_4 )
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPatternAssignment_4()); 
            // InternalServiceDefinition.g:1696:2: ( rule__ForkingServiceDefinition__PatternAssignment_4 )
            // InternalServiceDefinition.g:1696:3: rule__ForkingServiceDefinition__PatternAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ForkingServiceDefinition__PatternAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getForkingServiceDefinitionAccess().getPatternAssignment_4()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1704:1: rule__ForkingServiceDefinition__Group__5 : rule__ForkingServiceDefinition__Group__5__Impl rule__ForkingServiceDefinition__Group__6 ;
    public final void rule__ForkingServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1708:1: ( rule__ForkingServiceDefinition__Group__5__Impl rule__ForkingServiceDefinition__Group__6 )
            // InternalServiceDefinition.g:1709:2: rule__ForkingServiceDefinition__Group__5__Impl rule__ForkingServiceDefinition__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalServiceDefinition.g:1716:1: rule__ForkingServiceDefinition__Group__5__Impl : ( ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )* ) ;
    public final void rule__ForkingServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1720:1: ( ( ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )* ) )
            // InternalServiceDefinition.g:1721:1: ( ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )* )
            {
            // InternalServiceDefinition.g:1721:1: ( ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )* )
            // InternalServiceDefinition.g:1722:2: ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPropertiesAssignment_5()); 
            // InternalServiceDefinition.g:1723:2: ( rule__ForkingServiceDefinition__PropertiesAssignment_5 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==48) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalServiceDefinition.g:1723:3: rule__ForkingServiceDefinition__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ForkingServiceDefinition__PropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
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
    // InternalServiceDefinition.g:1731:1: rule__ForkingServiceDefinition__Group__6 : rule__ForkingServiceDefinition__Group__6__Impl ;
    public final void rule__ForkingServiceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1735:1: ( rule__ForkingServiceDefinition__Group__6__Impl )
            // InternalServiceDefinition.g:1736:2: rule__ForkingServiceDefinition__Group__6__Impl
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
    // InternalServiceDefinition.g:1742:1: rule__ForkingServiceDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__ForkingServiceDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1746:1: ( ( '}' ) )
            // InternalServiceDefinition.g:1747:1: ( '}' )
            {
            // InternalServiceDefinition.g:1747:1: ( '}' )
            // InternalServiceDefinition.g:1748:2: '}'
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__JoyningServiceDefinition__Group__0"
    // InternalServiceDefinition.g:1758:1: rule__JoyningServiceDefinition__Group__0 : rule__JoyningServiceDefinition__Group__0__Impl rule__JoyningServiceDefinition__Group__1 ;
    public final void rule__JoyningServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1762:1: ( rule__JoyningServiceDefinition__Group__0__Impl rule__JoyningServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:1763:2: rule__JoyningServiceDefinition__Group__0__Impl rule__JoyningServiceDefinition__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalServiceDefinition.g:1770:1: rule__JoyningServiceDefinition__Group__0__Impl : ( ( rule__JoyningServiceDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__JoyningServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1774:1: ( ( ( rule__JoyningServiceDefinition__DocumentationAssignment_0 )? ) )
            // InternalServiceDefinition.g:1775:1: ( ( rule__JoyningServiceDefinition__DocumentationAssignment_0 )? )
            {
            // InternalServiceDefinition.g:1775:1: ( ( rule__JoyningServiceDefinition__DocumentationAssignment_0 )? )
            // InternalServiceDefinition.g:1776:2: ( rule__JoyningServiceDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalServiceDefinition.g:1777:2: ( rule__JoyningServiceDefinition__DocumentationAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DOCU_COMMENT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalServiceDefinition.g:1777:3: rule__JoyningServiceDefinition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__JoyningServiceDefinition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoyningServiceDefinitionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1785:1: rule__JoyningServiceDefinition__Group__1 : rule__JoyningServiceDefinition__Group__1__Impl rule__JoyningServiceDefinition__Group__2 ;
    public final void rule__JoyningServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1789:1: ( rule__JoyningServiceDefinition__Group__1__Impl rule__JoyningServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:1790:2: rule__JoyningServiceDefinition__Group__1__Impl rule__JoyningServiceDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalServiceDefinition.g:1797:1: rule__JoyningServiceDefinition__Group__1__Impl : ( 'JoiningServiceDefinition' ) ;
    public final void rule__JoyningServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1801:1: ( ( 'JoiningServiceDefinition' ) )
            // InternalServiceDefinition.g:1802:1: ( 'JoiningServiceDefinition' )
            {
            // InternalServiceDefinition.g:1802:1: ( 'JoiningServiceDefinition' )
            // InternalServiceDefinition.g:1803:2: 'JoiningServiceDefinition'
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getJoiningServiceDefinitionKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getJoyningServiceDefinitionAccess().getJoiningServiceDefinitionKeyword_1()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1812:1: rule__JoyningServiceDefinition__Group__2 : rule__JoyningServiceDefinition__Group__2__Impl rule__JoyningServiceDefinition__Group__3 ;
    public final void rule__JoyningServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1816:1: ( rule__JoyningServiceDefinition__Group__2__Impl rule__JoyningServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:1817:2: rule__JoyningServiceDefinition__Group__2__Impl rule__JoyningServiceDefinition__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalServiceDefinition.g:1824:1: rule__JoyningServiceDefinition__Group__2__Impl : ( ( rule__JoyningServiceDefinition__NameAssignment_2 ) ) ;
    public final void rule__JoyningServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1828:1: ( ( ( rule__JoyningServiceDefinition__NameAssignment_2 ) ) )
            // InternalServiceDefinition.g:1829:1: ( ( rule__JoyningServiceDefinition__NameAssignment_2 ) )
            {
            // InternalServiceDefinition.g:1829:1: ( ( rule__JoyningServiceDefinition__NameAssignment_2 ) )
            // InternalServiceDefinition.g:1830:2: ( rule__JoyningServiceDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getNameAssignment_2()); 
            // InternalServiceDefinition.g:1831:2: ( rule__JoyningServiceDefinition__NameAssignment_2 )
            // InternalServiceDefinition.g:1831:3: rule__JoyningServiceDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJoyningServiceDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1839:1: rule__JoyningServiceDefinition__Group__3 : rule__JoyningServiceDefinition__Group__3__Impl rule__JoyningServiceDefinition__Group__4 ;
    public final void rule__JoyningServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1843:1: ( rule__JoyningServiceDefinition__Group__3__Impl rule__JoyningServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:1844:2: rule__JoyningServiceDefinition__Group__3__Impl rule__JoyningServiceDefinition__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalServiceDefinition.g:1851:1: rule__JoyningServiceDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__JoyningServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1855:1: ( ( '{' ) )
            // InternalServiceDefinition.g:1856:1: ( '{' )
            {
            // InternalServiceDefinition.g:1856:1: ( '{' )
            // InternalServiceDefinition.g:1857:2: '{'
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getJoyningServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1866:1: rule__JoyningServiceDefinition__Group__4 : rule__JoyningServiceDefinition__Group__4__Impl rule__JoyningServiceDefinition__Group__5 ;
    public final void rule__JoyningServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1870:1: ( rule__JoyningServiceDefinition__Group__4__Impl rule__JoyningServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:1871:2: rule__JoyningServiceDefinition__Group__4__Impl rule__JoyningServiceDefinition__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalServiceDefinition.g:1878:1: rule__JoyningServiceDefinition__Group__4__Impl : ( ( rule__JoyningServiceDefinition__PatternAssignment_4 ) ) ;
    public final void rule__JoyningServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1882:1: ( ( ( rule__JoyningServiceDefinition__PatternAssignment_4 ) ) )
            // InternalServiceDefinition.g:1883:1: ( ( rule__JoyningServiceDefinition__PatternAssignment_4 ) )
            {
            // InternalServiceDefinition.g:1883:1: ( ( rule__JoyningServiceDefinition__PatternAssignment_4 ) )
            // InternalServiceDefinition.g:1884:2: ( rule__JoyningServiceDefinition__PatternAssignment_4 )
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPatternAssignment_4()); 
            // InternalServiceDefinition.g:1885:2: ( rule__JoyningServiceDefinition__PatternAssignment_4 )
            // InternalServiceDefinition.g:1885:3: rule__JoyningServiceDefinition__PatternAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__JoyningServiceDefinition__PatternAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getJoyningServiceDefinitionAccess().getPatternAssignment_4()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1893:1: rule__JoyningServiceDefinition__Group__5 : rule__JoyningServiceDefinition__Group__5__Impl rule__JoyningServiceDefinition__Group__6 ;
    public final void rule__JoyningServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1897:1: ( rule__JoyningServiceDefinition__Group__5__Impl rule__JoyningServiceDefinition__Group__6 )
            // InternalServiceDefinition.g:1898:2: rule__JoyningServiceDefinition__Group__5__Impl rule__JoyningServiceDefinition__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalServiceDefinition.g:1905:1: rule__JoyningServiceDefinition__Group__5__Impl : ( ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )* ) ;
    public final void rule__JoyningServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1909:1: ( ( ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )* ) )
            // InternalServiceDefinition.g:1910:1: ( ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )* )
            {
            // InternalServiceDefinition.g:1910:1: ( ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )* )
            // InternalServiceDefinition.g:1911:2: ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPropertiesAssignment_5()); 
            // InternalServiceDefinition.g:1912:2: ( rule__JoyningServiceDefinition__PropertiesAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==48) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalServiceDefinition.g:1912:3: rule__JoyningServiceDefinition__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__JoyningServiceDefinition__PropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalServiceDefinition.g:1920:1: rule__JoyningServiceDefinition__Group__6 : rule__JoyningServiceDefinition__Group__6__Impl ;
    public final void rule__JoyningServiceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1924:1: ( rule__JoyningServiceDefinition__Group__6__Impl )
            // InternalServiceDefinition.g:1925:2: rule__JoyningServiceDefinition__Group__6__Impl
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
    // InternalServiceDefinition.g:1931:1: rule__JoyningServiceDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__JoyningServiceDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1935:1: ( ( '}' ) )
            // InternalServiceDefinition.g:1936:1: ( '}' )
            {
            // InternalServiceDefinition.g:1936:1: ( '}' )
            // InternalServiceDefinition.g:1937:2: '}'
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__RequestAnswerServiceDefinition__Group__0"
    // InternalServiceDefinition.g:1947:1: rule__RequestAnswerServiceDefinition__Group__0 : rule__RequestAnswerServiceDefinition__Group__0__Impl rule__RequestAnswerServiceDefinition__Group__1 ;
    public final void rule__RequestAnswerServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1951:1: ( rule__RequestAnswerServiceDefinition__Group__0__Impl rule__RequestAnswerServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:1952:2: rule__RequestAnswerServiceDefinition__Group__0__Impl rule__RequestAnswerServiceDefinition__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalServiceDefinition.g:1959:1: rule__RequestAnswerServiceDefinition__Group__0__Impl : ( ( rule__RequestAnswerServiceDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1963:1: ( ( ( rule__RequestAnswerServiceDefinition__DocumentationAssignment_0 )? ) )
            // InternalServiceDefinition.g:1964:1: ( ( rule__RequestAnswerServiceDefinition__DocumentationAssignment_0 )? )
            {
            // InternalServiceDefinition.g:1964:1: ( ( rule__RequestAnswerServiceDefinition__DocumentationAssignment_0 )? )
            // InternalServiceDefinition.g:1965:2: ( rule__RequestAnswerServiceDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalServiceDefinition.g:1966:2: ( rule__RequestAnswerServiceDefinition__DocumentationAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DOCU_COMMENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalServiceDefinition.g:1966:3: rule__RequestAnswerServiceDefinition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequestAnswerServiceDefinition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:1974:1: rule__RequestAnswerServiceDefinition__Group__1 : rule__RequestAnswerServiceDefinition__Group__1__Impl rule__RequestAnswerServiceDefinition__Group__2 ;
    public final void rule__RequestAnswerServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1978:1: ( rule__RequestAnswerServiceDefinition__Group__1__Impl rule__RequestAnswerServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:1979:2: rule__RequestAnswerServiceDefinition__Group__1__Impl rule__RequestAnswerServiceDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalServiceDefinition.g:1986:1: rule__RequestAnswerServiceDefinition__Group__1__Impl : ( 'RequestAnswerServiceDefinition' ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:1990:1: ( ( 'RequestAnswerServiceDefinition' ) )
            // InternalServiceDefinition.g:1991:1: ( 'RequestAnswerServiceDefinition' )
            {
            // InternalServiceDefinition.g:1991:1: ( 'RequestAnswerServiceDefinition' )
            // InternalServiceDefinition.g:1992:2: 'RequestAnswerServiceDefinition'
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRequestAnswerServiceDefinitionKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRequestAnswerServiceDefinitionKeyword_1()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:2001:1: rule__RequestAnswerServiceDefinition__Group__2 : rule__RequestAnswerServiceDefinition__Group__2__Impl rule__RequestAnswerServiceDefinition__Group__3 ;
    public final void rule__RequestAnswerServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2005:1: ( rule__RequestAnswerServiceDefinition__Group__2__Impl rule__RequestAnswerServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:2006:2: rule__RequestAnswerServiceDefinition__Group__2__Impl rule__RequestAnswerServiceDefinition__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalServiceDefinition.g:2013:1: rule__RequestAnswerServiceDefinition__Group__2__Impl : ( ( rule__RequestAnswerServiceDefinition__NameAssignment_2 ) ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2017:1: ( ( ( rule__RequestAnswerServiceDefinition__NameAssignment_2 ) ) )
            // InternalServiceDefinition.g:2018:1: ( ( rule__RequestAnswerServiceDefinition__NameAssignment_2 ) )
            {
            // InternalServiceDefinition.g:2018:1: ( ( rule__RequestAnswerServiceDefinition__NameAssignment_2 ) )
            // InternalServiceDefinition.g:2019:2: ( rule__RequestAnswerServiceDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameAssignment_2()); 
            // InternalServiceDefinition.g:2020:2: ( rule__RequestAnswerServiceDefinition__NameAssignment_2 )
            // InternalServiceDefinition.g:2020:3: rule__RequestAnswerServiceDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:2028:1: rule__RequestAnswerServiceDefinition__Group__3 : rule__RequestAnswerServiceDefinition__Group__3__Impl rule__RequestAnswerServiceDefinition__Group__4 ;
    public final void rule__RequestAnswerServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2032:1: ( rule__RequestAnswerServiceDefinition__Group__3__Impl rule__RequestAnswerServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:2033:2: rule__RequestAnswerServiceDefinition__Group__3__Impl rule__RequestAnswerServiceDefinition__Group__4
            {
            pushFollow(FOLLOW_24);
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
    // InternalServiceDefinition.g:2040:1: rule__RequestAnswerServiceDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2044:1: ( ( '{' ) )
            // InternalServiceDefinition.g:2045:1: ( '{' )
            {
            // InternalServiceDefinition.g:2045:1: ( '{' )
            // InternalServiceDefinition.g:2046:2: '{'
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:2055:1: rule__RequestAnswerServiceDefinition__Group__4 : rule__RequestAnswerServiceDefinition__Group__4__Impl rule__RequestAnswerServiceDefinition__Group__5 ;
    public final void rule__RequestAnswerServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2059:1: ( rule__RequestAnswerServiceDefinition__Group__4__Impl rule__RequestAnswerServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:2060:2: rule__RequestAnswerServiceDefinition__Group__4__Impl rule__RequestAnswerServiceDefinition__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalServiceDefinition.g:2067:1: rule__RequestAnswerServiceDefinition__Group__4__Impl : ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_4 ) ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2071:1: ( ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_4 ) ) )
            // InternalServiceDefinition.g:2072:1: ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_4 ) )
            {
            // InternalServiceDefinition.g:2072:1: ( ( rule__RequestAnswerServiceDefinition__PatternAssignment_4 ) )
            // InternalServiceDefinition.g:2073:2: ( rule__RequestAnswerServiceDefinition__PatternAssignment_4 )
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternAssignment_4()); 
            // InternalServiceDefinition.g:2074:2: ( rule__RequestAnswerServiceDefinition__PatternAssignment_4 )
            // InternalServiceDefinition.g:2074:3: rule__RequestAnswerServiceDefinition__PatternAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RequestAnswerServiceDefinition__PatternAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternAssignment_4()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:2082:1: rule__RequestAnswerServiceDefinition__Group__5 : rule__RequestAnswerServiceDefinition__Group__5__Impl rule__RequestAnswerServiceDefinition__Group__6 ;
    public final void rule__RequestAnswerServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2086:1: ( rule__RequestAnswerServiceDefinition__Group__5__Impl rule__RequestAnswerServiceDefinition__Group__6 )
            // InternalServiceDefinition.g:2087:2: rule__RequestAnswerServiceDefinition__Group__5__Impl rule__RequestAnswerServiceDefinition__Group__6
            {
            pushFollow(FOLLOW_19);
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
    // InternalServiceDefinition.g:2094:1: rule__RequestAnswerServiceDefinition__Group__5__Impl : ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )* ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2098:1: ( ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )* ) )
            // InternalServiceDefinition.g:2099:1: ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )* )
            {
            // InternalServiceDefinition.g:2099:1: ( ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )* )
            // InternalServiceDefinition.g:2100:2: ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )*
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPropertiesAssignment_5()); 
            // InternalServiceDefinition.g:2101:2: ( rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==48) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalServiceDefinition.g:2101:3: rule__RequestAnswerServiceDefinition__PropertiesAssignment_5
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__RequestAnswerServiceDefinition__PropertiesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalServiceDefinition.g:2109:1: rule__RequestAnswerServiceDefinition__Group__6 : rule__RequestAnswerServiceDefinition__Group__6__Impl ;
    public final void rule__RequestAnswerServiceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2113:1: ( rule__RequestAnswerServiceDefinition__Group__6__Impl )
            // InternalServiceDefinition.g:2114:2: rule__RequestAnswerServiceDefinition__Group__6__Impl
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
    // InternalServiceDefinition.g:2120:1: rule__RequestAnswerServiceDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__RequestAnswerServiceDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2124:1: ( ( '}' ) )
            // InternalServiceDefinition.g:2125:1: ( '}' )
            {
            // InternalServiceDefinition.g:2125:1: ( '}' )
            // InternalServiceDefinition.g:2126:2: '}'
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__0"
    // InternalServiceDefinition.g:2136:1: rule__CoordinationServiceDefinition__Group__0 : rule__CoordinationServiceDefinition__Group__0__Impl rule__CoordinationServiceDefinition__Group__1 ;
    public final void rule__CoordinationServiceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2140:1: ( rule__CoordinationServiceDefinition__Group__0__Impl rule__CoordinationServiceDefinition__Group__1 )
            // InternalServiceDefinition.g:2141:2: rule__CoordinationServiceDefinition__Group__0__Impl rule__CoordinationServiceDefinition__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalServiceDefinition.g:2148:1: rule__CoordinationServiceDefinition__Group__0__Impl : ( ( rule__CoordinationServiceDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__CoordinationServiceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2152:1: ( ( ( rule__CoordinationServiceDefinition__DocumentationAssignment_0 )? ) )
            // InternalServiceDefinition.g:2153:1: ( ( rule__CoordinationServiceDefinition__DocumentationAssignment_0 )? )
            {
            // InternalServiceDefinition.g:2153:1: ( ( rule__CoordinationServiceDefinition__DocumentationAssignment_0 )? )
            // InternalServiceDefinition.g:2154:2: ( rule__CoordinationServiceDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalServiceDefinition.g:2155:2: ( rule__CoordinationServiceDefinition__DocumentationAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DOCU_COMMENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalServiceDefinition.g:2155:3: rule__CoordinationServiceDefinition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:2163:1: rule__CoordinationServiceDefinition__Group__1 : rule__CoordinationServiceDefinition__Group__1__Impl rule__CoordinationServiceDefinition__Group__2 ;
    public final void rule__CoordinationServiceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2167:1: ( rule__CoordinationServiceDefinition__Group__1__Impl rule__CoordinationServiceDefinition__Group__2 )
            // InternalServiceDefinition.g:2168:2: rule__CoordinationServiceDefinition__Group__1__Impl rule__CoordinationServiceDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
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
    // InternalServiceDefinition.g:2175:1: rule__CoordinationServiceDefinition__Group__1__Impl : ( 'CoordinationServiceDefinition' ) ;
    public final void rule__CoordinationServiceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2179:1: ( ( 'CoordinationServiceDefinition' ) )
            // InternalServiceDefinition.g:2180:1: ( 'CoordinationServiceDefinition' )
            {
            // InternalServiceDefinition.g:2180:1: ( 'CoordinationServiceDefinition' )
            // InternalServiceDefinition.g:2181:2: 'CoordinationServiceDefinition'
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getCoordinationServiceDefinitionKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getCoordinationServiceDefinitionAccess().getCoordinationServiceDefinitionKeyword_1()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:2190:1: rule__CoordinationServiceDefinition__Group__2 : rule__CoordinationServiceDefinition__Group__2__Impl rule__CoordinationServiceDefinition__Group__3 ;
    public final void rule__CoordinationServiceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2194:1: ( rule__CoordinationServiceDefinition__Group__2__Impl rule__CoordinationServiceDefinition__Group__3 )
            // InternalServiceDefinition.g:2195:2: rule__CoordinationServiceDefinition__Group__2__Impl rule__CoordinationServiceDefinition__Group__3
            {
            pushFollow(FOLLOW_17);
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
    // InternalServiceDefinition.g:2202:1: rule__CoordinationServiceDefinition__Group__2__Impl : ( ( rule__CoordinationServiceDefinition__NameAssignment_2 ) ) ;
    public final void rule__CoordinationServiceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2206:1: ( ( ( rule__CoordinationServiceDefinition__NameAssignment_2 ) ) )
            // InternalServiceDefinition.g:2207:1: ( ( rule__CoordinationServiceDefinition__NameAssignment_2 ) )
            {
            // InternalServiceDefinition.g:2207:1: ( ( rule__CoordinationServiceDefinition__NameAssignment_2 ) )
            // InternalServiceDefinition.g:2208:2: ( rule__CoordinationServiceDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getNameAssignment_2()); 
            // InternalServiceDefinition.g:2209:2: ( rule__CoordinationServiceDefinition__NameAssignment_2 )
            // InternalServiceDefinition.g:2209:3: rule__CoordinationServiceDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:2217:1: rule__CoordinationServiceDefinition__Group__3 : rule__CoordinationServiceDefinition__Group__3__Impl rule__CoordinationServiceDefinition__Group__4 ;
    public final void rule__CoordinationServiceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2221:1: ( rule__CoordinationServiceDefinition__Group__3__Impl rule__CoordinationServiceDefinition__Group__4 )
            // InternalServiceDefinition.g:2222:2: rule__CoordinationServiceDefinition__Group__3__Impl rule__CoordinationServiceDefinition__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalServiceDefinition.g:2229:1: rule__CoordinationServiceDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__CoordinationServiceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2233:1: ( ( '{' ) )
            // InternalServiceDefinition.g:2234:1: ( '{' )
            {
            // InternalServiceDefinition.g:2234:1: ( '{' )
            // InternalServiceDefinition.g:2235:2: '{'
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCoordinationServiceDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:2244:1: rule__CoordinationServiceDefinition__Group__4 : rule__CoordinationServiceDefinition__Group__4__Impl rule__CoordinationServiceDefinition__Group__5 ;
    public final void rule__CoordinationServiceDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2248:1: ( rule__CoordinationServiceDefinition__Group__4__Impl rule__CoordinationServiceDefinition__Group__5 )
            // InternalServiceDefinition.g:2249:2: rule__CoordinationServiceDefinition__Group__4__Impl rule__CoordinationServiceDefinition__Group__5
            {
            pushFollow(FOLLOW_27);
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
    // InternalServiceDefinition.g:2256:1: rule__CoordinationServiceDefinition__Group__4__Impl : ( ( rule__CoordinationServiceDefinition__UnorderedGroup_4 ) ) ;
    public final void rule__CoordinationServiceDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2260:1: ( ( ( rule__CoordinationServiceDefinition__UnorderedGroup_4 ) ) )
            // InternalServiceDefinition.g:2261:1: ( ( rule__CoordinationServiceDefinition__UnorderedGroup_4 ) )
            {
            // InternalServiceDefinition.g:2261:1: ( ( rule__CoordinationServiceDefinition__UnorderedGroup_4 ) )
            // InternalServiceDefinition.g:2262:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_4 )
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4()); 
            // InternalServiceDefinition.g:2263:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_4 )
            // InternalServiceDefinition.g:2263:3: rule__CoordinationServiceDefinition__UnorderedGroup_4
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:2271:1: rule__CoordinationServiceDefinition__Group__5 : rule__CoordinationServiceDefinition__Group__5__Impl rule__CoordinationServiceDefinition__Group__6 ;
    public final void rule__CoordinationServiceDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2275:1: ( rule__CoordinationServiceDefinition__Group__5__Impl rule__CoordinationServiceDefinition__Group__6 )
            // InternalServiceDefinition.g:2276:2: rule__CoordinationServiceDefinition__Group__5__Impl rule__CoordinationServiceDefinition__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalServiceDefinition.g:2283:1: rule__CoordinationServiceDefinition__Group__5__Impl : ( ( rule__CoordinationServiceDefinition__ServicesAssignment_5 )* ) ;
    public final void rule__CoordinationServiceDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2287:1: ( ( ( rule__CoordinationServiceDefinition__ServicesAssignment_5 )* ) )
            // InternalServiceDefinition.g:2288:1: ( ( rule__CoordinationServiceDefinition__ServicesAssignment_5 )* )
            {
            // InternalServiceDefinition.g:2288:1: ( ( rule__CoordinationServiceDefinition__ServicesAssignment_5 )* )
            // InternalServiceDefinition.g:2289:2: ( rule__CoordinationServiceDefinition__ServicesAssignment_5 )*
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesAssignment_5()); 
            // InternalServiceDefinition.g:2290:2: ( rule__CoordinationServiceDefinition__ServicesAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalServiceDefinition.g:2290:3: rule__CoordinationServiceDefinition__ServicesAssignment_5
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__CoordinationServiceDefinition__ServicesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesAssignment_5()); 

            }


            }

        }
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
    // InternalServiceDefinition.g:2298:1: rule__CoordinationServiceDefinition__Group__6 : rule__CoordinationServiceDefinition__Group__6__Impl rule__CoordinationServiceDefinition__Group__7 ;
    public final void rule__CoordinationServiceDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2302:1: ( rule__CoordinationServiceDefinition__Group__6__Impl rule__CoordinationServiceDefinition__Group__7 )
            // InternalServiceDefinition.g:2303:2: rule__CoordinationServiceDefinition__Group__6__Impl rule__CoordinationServiceDefinition__Group__7
            {
            pushFollow(FOLLOW_27);
            rule__CoordinationServiceDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group__7();

            state._fsp--;


            }

        }
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
    // InternalServiceDefinition.g:2310:1: rule__CoordinationServiceDefinition__Group__6__Impl : ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_6 )* ) ;
    public final void rule__CoordinationServiceDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2314:1: ( ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_6 )* ) )
            // InternalServiceDefinition.g:2315:1: ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_6 )* )
            {
            // InternalServiceDefinition.g:2315:1: ( ( rule__CoordinationServiceDefinition__PropertiesAssignment_6 )* )
            // InternalServiceDefinition.g:2316:2: ( rule__CoordinationServiceDefinition__PropertiesAssignment_6 )*
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesAssignment_6()); 
            // InternalServiceDefinition.g:2317:2: ( rule__CoordinationServiceDefinition__PropertiesAssignment_6 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==48) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalServiceDefinition.g:2317:3: rule__CoordinationServiceDefinition__PropertiesAssignment_6
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__CoordinationServiceDefinition__PropertiesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__7"
    // InternalServiceDefinition.g:2325:1: rule__CoordinationServiceDefinition__Group__7 : rule__CoordinationServiceDefinition__Group__7__Impl ;
    public final void rule__CoordinationServiceDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2329:1: ( rule__CoordinationServiceDefinition__Group__7__Impl )
            // InternalServiceDefinition.g:2330:2: rule__CoordinationServiceDefinition__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__7"


    // $ANTLR start "rule__CoordinationServiceDefinition__Group__7__Impl"
    // InternalServiceDefinition.g:2336:1: rule__CoordinationServiceDefinition__Group__7__Impl : ( '}' ) ;
    public final void rule__CoordinationServiceDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2340:1: ( ( '}' ) )
            // InternalServiceDefinition.g:2341:1: ( '}' )
            {
            // InternalServiceDefinition.g:2341:1: ( '}' )
            // InternalServiceDefinition.g:2342:2: '}'
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCoordinationServiceDefinitionAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__Group__7__Impl"


    // $ANTLR start "rule__CommunicationServiceUsage__Group__0"
    // InternalServiceDefinition.g:2352:1: rule__CommunicationServiceUsage__Group__0 : rule__CommunicationServiceUsage__Group__0__Impl rule__CommunicationServiceUsage__Group__1 ;
    public final void rule__CommunicationServiceUsage__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2356:1: ( rule__CommunicationServiceUsage__Group__0__Impl rule__CommunicationServiceUsage__Group__1 )
            // InternalServiceDefinition.g:2357:2: rule__CommunicationServiceUsage__Group__0__Impl rule__CommunicationServiceUsage__Group__1
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
    // InternalServiceDefinition.g:2364:1: rule__CommunicationServiceUsage__Group__0__Impl : ( 'CommunicationServiceUsage' ) ;
    public final void rule__CommunicationServiceUsage__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2368:1: ( ( 'CommunicationServiceUsage' ) )
            // InternalServiceDefinition.g:2369:1: ( 'CommunicationServiceUsage' )
            {
            // InternalServiceDefinition.g:2369:1: ( 'CommunicationServiceUsage' )
            // InternalServiceDefinition.g:2370:2: 'CommunicationServiceUsage'
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getCommunicationServiceUsageKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2379:1: rule__CommunicationServiceUsage__Group__1 : rule__CommunicationServiceUsage__Group__1__Impl rule__CommunicationServiceUsage__Group__2 ;
    public final void rule__CommunicationServiceUsage__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2383:1: ( rule__CommunicationServiceUsage__Group__1__Impl rule__CommunicationServiceUsage__Group__2 )
            // InternalServiceDefinition.g:2384:2: rule__CommunicationServiceUsage__Group__1__Impl rule__CommunicationServiceUsage__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalServiceDefinition.g:2391:1: rule__CommunicationServiceUsage__Group__1__Impl : ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) ) ;
    public final void rule__CommunicationServiceUsage__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2395:1: ( ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:2396:1: ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:2396:1: ( ( rule__CommunicationServiceUsage__NameAssignment_1 ) )
            // InternalServiceDefinition.g:2397:2: ( rule__CommunicationServiceUsage__NameAssignment_1 )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:2398:2: ( rule__CommunicationServiceUsage__NameAssignment_1 )
            // InternalServiceDefinition.g:2398:3: rule__CommunicationServiceUsage__NameAssignment_1
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
    // InternalServiceDefinition.g:2406:1: rule__CommunicationServiceUsage__Group__2 : rule__CommunicationServiceUsage__Group__2__Impl rule__CommunicationServiceUsage__Group__3 ;
    public final void rule__CommunicationServiceUsage__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2410:1: ( rule__CommunicationServiceUsage__Group__2__Impl rule__CommunicationServiceUsage__Group__3 )
            // InternalServiceDefinition.g:2411:2: rule__CommunicationServiceUsage__Group__2__Impl rule__CommunicationServiceUsage__Group__3
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
    // InternalServiceDefinition.g:2418:1: rule__CommunicationServiceUsage__Group__2__Impl : ( 'uses' ) ;
    public final void rule__CommunicationServiceUsage__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2422:1: ( ( 'uses' ) )
            // InternalServiceDefinition.g:2423:1: ( 'uses' )
            {
            // InternalServiceDefinition.g:2423:1: ( 'uses' )
            // InternalServiceDefinition.g:2424:2: 'uses'
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getUsesKeyword_2()); 
            match(input,28,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2433:1: rule__CommunicationServiceUsage__Group__3 : rule__CommunicationServiceUsage__Group__3__Impl ;
    public final void rule__CommunicationServiceUsage__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2437:1: ( rule__CommunicationServiceUsage__Group__3__Impl )
            // InternalServiceDefinition.g:2438:2: rule__CommunicationServiceUsage__Group__3__Impl
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
    // InternalServiceDefinition.g:2444:1: rule__CommunicationServiceUsage__Group__3__Impl : ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) ) ;
    public final void rule__CommunicationServiceUsage__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2448:1: ( ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) ) )
            // InternalServiceDefinition.g:2449:1: ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) )
            {
            // InternalServiceDefinition.g:2449:1: ( ( rule__CommunicationServiceUsage__UsesAssignment_3 ) )
            // InternalServiceDefinition.g:2450:2: ( rule__CommunicationServiceUsage__UsesAssignment_3 )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getUsesAssignment_3()); 
            // InternalServiceDefinition.g:2451:2: ( rule__CommunicationServiceUsage__UsesAssignment_3 )
            // InternalServiceDefinition.g:2451:3: rule__CommunicationServiceUsage__UsesAssignment_3
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
    // InternalServiceDefinition.g:2460:1: rule__StatePattern__Group__0 : rule__StatePattern__Group__0__Impl rule__StatePattern__Group__1 ;
    public final void rule__StatePattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2464:1: ( rule__StatePattern__Group__0__Impl rule__StatePattern__Group__1 )
            // InternalServiceDefinition.g:2465:2: rule__StatePattern__Group__0__Impl rule__StatePattern__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalServiceDefinition.g:2472:1: rule__StatePattern__Group__0__Impl : ( () ) ;
    public final void rule__StatePattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2476:1: ( ( () ) )
            // InternalServiceDefinition.g:2477:1: ( () )
            {
            // InternalServiceDefinition.g:2477:1: ( () )
            // InternalServiceDefinition.g:2478:2: ()
            {
             before(grammarAccess.getStatePatternAccess().getStatePatternAction_0()); 
            // InternalServiceDefinition.g:2479:2: ()
            // InternalServiceDefinition.g:2479:3: 
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
    // InternalServiceDefinition.g:2487:1: rule__StatePattern__Group__1 : rule__StatePattern__Group__1__Impl rule__StatePattern__Group__2 ;
    public final void rule__StatePattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2491:1: ( rule__StatePattern__Group__1__Impl rule__StatePattern__Group__2 )
            // InternalServiceDefinition.g:2492:2: rule__StatePattern__Group__1__Impl rule__StatePattern__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalServiceDefinition.g:2499:1: rule__StatePattern__Group__1__Impl : ( 'StatePattern' ) ;
    public final void rule__StatePattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2503:1: ( ( 'StatePattern' ) )
            // InternalServiceDefinition.g:2504:1: ( 'StatePattern' )
            {
            // InternalServiceDefinition.g:2504:1: ( 'StatePattern' )
            // InternalServiceDefinition.g:2505:2: 'StatePattern'
            {
             before(grammarAccess.getStatePatternAccess().getStatePatternKeyword_1()); 
            match(input,29,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2514:1: rule__StatePattern__Group__2 : rule__StatePattern__Group__2__Impl rule__StatePattern__Group__3 ;
    public final void rule__StatePattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2518:1: ( rule__StatePattern__Group__2__Impl rule__StatePattern__Group__3 )
            // InternalServiceDefinition.g:2519:2: rule__StatePattern__Group__2__Impl rule__StatePattern__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalServiceDefinition.g:2526:1: rule__StatePattern__Group__2__Impl : ( '<' ) ;
    public final void rule__StatePattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2530:1: ( ( '<' ) )
            // InternalServiceDefinition.g:2531:1: ( '<' )
            {
            // InternalServiceDefinition.g:2531:1: ( '<' )
            // InternalServiceDefinition.g:2532:2: '<'
            {
             before(grammarAccess.getStatePatternAccess().getLessThanSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2541:1: rule__StatePattern__Group__3 : rule__StatePattern__Group__3__Impl rule__StatePattern__Group__4 ;
    public final void rule__StatePattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2545:1: ( rule__StatePattern__Group__3__Impl rule__StatePattern__Group__4 )
            // InternalServiceDefinition.g:2546:2: rule__StatePattern__Group__3__Impl rule__StatePattern__Group__4
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
    // InternalServiceDefinition.g:2553:1: rule__StatePattern__Group__3__Impl : ( 'lifecycle' ) ;
    public final void rule__StatePattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2557:1: ( ( 'lifecycle' ) )
            // InternalServiceDefinition.g:2558:1: ( 'lifecycle' )
            {
            // InternalServiceDefinition.g:2558:1: ( 'lifecycle' )
            // InternalServiceDefinition.g:2559:2: 'lifecycle'
            {
             before(grammarAccess.getStatePatternAccess().getLifecycleKeyword_3()); 
            match(input,31,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2568:1: rule__StatePattern__Group__4 : rule__StatePattern__Group__4__Impl rule__StatePattern__Group__5 ;
    public final void rule__StatePattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2572:1: ( rule__StatePattern__Group__4__Impl rule__StatePattern__Group__5 )
            // InternalServiceDefinition.g:2573:2: rule__StatePattern__Group__4__Impl rule__StatePattern__Group__5
            {
            pushFollow(FOLLOW_33);
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
    // InternalServiceDefinition.g:2580:1: rule__StatePattern__Group__4__Impl : ( ( rule__StatePattern__LifecycleAssignment_4 ) ) ;
    public final void rule__StatePattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2584:1: ( ( ( rule__StatePattern__LifecycleAssignment_4 ) ) )
            // InternalServiceDefinition.g:2585:1: ( ( rule__StatePattern__LifecycleAssignment_4 ) )
            {
            // InternalServiceDefinition.g:2585:1: ( ( rule__StatePattern__LifecycleAssignment_4 ) )
            // InternalServiceDefinition.g:2586:2: ( rule__StatePattern__LifecycleAssignment_4 )
            {
             before(grammarAccess.getStatePatternAccess().getLifecycleAssignment_4()); 
            // InternalServiceDefinition.g:2587:2: ( rule__StatePattern__LifecycleAssignment_4 )
            // InternalServiceDefinition.g:2587:3: rule__StatePattern__LifecycleAssignment_4
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
    // InternalServiceDefinition.g:2595:1: rule__StatePattern__Group__5 : rule__StatePattern__Group__5__Impl rule__StatePattern__Group__6 ;
    public final void rule__StatePattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2599:1: ( rule__StatePattern__Group__5__Impl rule__StatePattern__Group__6 )
            // InternalServiceDefinition.g:2600:2: rule__StatePattern__Group__5__Impl rule__StatePattern__Group__6
            {
            pushFollow(FOLLOW_33);
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
    // InternalServiceDefinition.g:2607:1: rule__StatePattern__Group__5__Impl : ( ( rule__StatePattern__Group_5__0 )? ) ;
    public final void rule__StatePattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2611:1: ( ( ( rule__StatePattern__Group_5__0 )? ) )
            // InternalServiceDefinition.g:2612:1: ( ( rule__StatePattern__Group_5__0 )? )
            {
            // InternalServiceDefinition.g:2612:1: ( ( rule__StatePattern__Group_5__0 )? )
            // InternalServiceDefinition.g:2613:2: ( rule__StatePattern__Group_5__0 )?
            {
             before(grammarAccess.getStatePatternAccess().getGroup_5()); 
            // InternalServiceDefinition.g:2614:2: ( rule__StatePattern__Group_5__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==33) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalServiceDefinition.g:2614:3: rule__StatePattern__Group_5__0
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
    // InternalServiceDefinition.g:2622:1: rule__StatePattern__Group__6 : rule__StatePattern__Group__6__Impl ;
    public final void rule__StatePattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2626:1: ( rule__StatePattern__Group__6__Impl )
            // InternalServiceDefinition.g:2627:2: rule__StatePattern__Group__6__Impl
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
    // InternalServiceDefinition.g:2633:1: rule__StatePattern__Group__6__Impl : ( '>' ) ;
    public final void rule__StatePattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2637:1: ( ( '>' ) )
            // InternalServiceDefinition.g:2638:1: ( '>' )
            {
            // InternalServiceDefinition.g:2638:1: ( '>' )
            // InternalServiceDefinition.g:2639:2: '>'
            {
             before(grammarAccess.getStatePatternAccess().getGreaterThanSignKeyword_6()); 
            match(input,32,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2649:1: rule__StatePattern__Group_5__0 : rule__StatePattern__Group_5__0__Impl rule__StatePattern__Group_5__1 ;
    public final void rule__StatePattern__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2653:1: ( rule__StatePattern__Group_5__0__Impl rule__StatePattern__Group_5__1 )
            // InternalServiceDefinition.g:2654:2: rule__StatePattern__Group_5__0__Impl rule__StatePattern__Group_5__1
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
    // InternalServiceDefinition.g:2661:1: rule__StatePattern__Group_5__0__Impl : ( 'with' ) ;
    public final void rule__StatePattern__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2665:1: ( ( 'with' ) )
            // InternalServiceDefinition.g:2666:1: ( 'with' )
            {
            // InternalServiceDefinition.g:2666:1: ( 'with' )
            // InternalServiceDefinition.g:2667:2: 'with'
            {
             before(grammarAccess.getStatePatternAccess().getWithKeyword_5_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2676:1: rule__StatePattern__Group_5__1 : rule__StatePattern__Group_5__1__Impl ;
    public final void rule__StatePattern__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2680:1: ( rule__StatePattern__Group_5__1__Impl )
            // InternalServiceDefinition.g:2681:2: rule__StatePattern__Group_5__1__Impl
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
    // InternalServiceDefinition.g:2687:1: rule__StatePattern__Group_5__1__Impl : ( ( rule__StatePattern__ModesAssignment_5_1 ) ) ;
    public final void rule__StatePattern__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2691:1: ( ( ( rule__StatePattern__ModesAssignment_5_1 ) ) )
            // InternalServiceDefinition.g:2692:1: ( ( rule__StatePattern__ModesAssignment_5_1 ) )
            {
            // InternalServiceDefinition.g:2692:1: ( ( rule__StatePattern__ModesAssignment_5_1 ) )
            // InternalServiceDefinition.g:2693:2: ( rule__StatePattern__ModesAssignment_5_1 )
            {
             before(grammarAccess.getStatePatternAccess().getModesAssignment_5_1()); 
            // InternalServiceDefinition.g:2694:2: ( rule__StatePattern__ModesAssignment_5_1 )
            // InternalServiceDefinition.g:2694:3: rule__StatePattern__ModesAssignment_5_1
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
    // InternalServiceDefinition.g:2703:1: rule__ParameterPattern__Group__0 : rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 ;
    public final void rule__ParameterPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2707:1: ( rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1 )
            // InternalServiceDefinition.g:2708:2: rule__ParameterPattern__Group__0__Impl rule__ParameterPattern__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalServiceDefinition.g:2715:1: rule__ParameterPattern__Group__0__Impl : ( () ) ;
    public final void rule__ParameterPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2719:1: ( ( () ) )
            // InternalServiceDefinition.g:2720:1: ( () )
            {
            // InternalServiceDefinition.g:2720:1: ( () )
            // InternalServiceDefinition.g:2721:2: ()
            {
             before(grammarAccess.getParameterPatternAccess().getParameterPatternAction_0()); 
            // InternalServiceDefinition.g:2722:2: ()
            // InternalServiceDefinition.g:2722:3: 
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
    // InternalServiceDefinition.g:2730:1: rule__ParameterPattern__Group__1 : rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 ;
    public final void rule__ParameterPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2734:1: ( rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2 )
            // InternalServiceDefinition.g:2735:2: rule__ParameterPattern__Group__1__Impl rule__ParameterPattern__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalServiceDefinition.g:2742:1: rule__ParameterPattern__Group__1__Impl : ( 'ParameterPattern' ) ;
    public final void rule__ParameterPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2746:1: ( ( 'ParameterPattern' ) )
            // InternalServiceDefinition.g:2747:1: ( 'ParameterPattern' )
            {
            // InternalServiceDefinition.g:2747:1: ( 'ParameterPattern' )
            // InternalServiceDefinition.g:2748:2: 'ParameterPattern'
            {
             before(grammarAccess.getParameterPatternAccess().getParameterPatternKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2757:1: rule__ParameterPattern__Group__2 : rule__ParameterPattern__Group__2__Impl rule__ParameterPattern__Group__3 ;
    public final void rule__ParameterPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2761:1: ( rule__ParameterPattern__Group__2__Impl rule__ParameterPattern__Group__3 )
            // InternalServiceDefinition.g:2762:2: rule__ParameterPattern__Group__2__Impl rule__ParameterPattern__Group__3
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
    // InternalServiceDefinition.g:2769:1: rule__ParameterPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__ParameterPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2773:1: ( ( '<' ) )
            // InternalServiceDefinition.g:2774:1: ( '<' )
            {
            // InternalServiceDefinition.g:2774:1: ( '<' )
            // InternalServiceDefinition.g:2775:2: '<'
            {
             before(grammarAccess.getParameterPatternAccess().getLessThanSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2784:1: rule__ParameterPattern__Group__3 : rule__ParameterPattern__Group__3__Impl rule__ParameterPattern__Group__4 ;
    public final void rule__ParameterPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2788:1: ( rule__ParameterPattern__Group__3__Impl rule__ParameterPattern__Group__4 )
            // InternalServiceDefinition.g:2789:2: rule__ParameterPattern__Group__3__Impl rule__ParameterPattern__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalServiceDefinition.g:2796:1: rule__ParameterPattern__Group__3__Impl : ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) ) ;
    public final void rule__ParameterPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2800:1: ( ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) ) )
            // InternalServiceDefinition.g:2801:1: ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) )
            {
            // InternalServiceDefinition.g:2801:1: ( ( rule__ParameterPattern__ParameterSetAssignment_3 ) )
            // InternalServiceDefinition.g:2802:2: ( rule__ParameterPattern__ParameterSetAssignment_3 )
            {
             before(grammarAccess.getParameterPatternAccess().getParameterSetAssignment_3()); 
            // InternalServiceDefinition.g:2803:2: ( rule__ParameterPattern__ParameterSetAssignment_3 )
            // InternalServiceDefinition.g:2803:3: rule__ParameterPattern__ParameterSetAssignment_3
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
    // InternalServiceDefinition.g:2811:1: rule__ParameterPattern__Group__4 : rule__ParameterPattern__Group__4__Impl ;
    public final void rule__ParameterPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2815:1: ( rule__ParameterPattern__Group__4__Impl )
            // InternalServiceDefinition.g:2816:2: rule__ParameterPattern__Group__4__Impl
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
    // InternalServiceDefinition.g:2822:1: rule__ParameterPattern__Group__4__Impl : ( '>' ) ;
    public final void rule__ParameterPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2826:1: ( ( '>' ) )
            // InternalServiceDefinition.g:2827:1: ( '>' )
            {
            // InternalServiceDefinition.g:2827:1: ( '>' )
            // InternalServiceDefinition.g:2828:2: '>'
            {
             before(grammarAccess.getParameterPatternAccess().getGreaterThanSignKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2838:1: rule__DynamicWiringPattern__Group__0 : rule__DynamicWiringPattern__Group__0__Impl rule__DynamicWiringPattern__Group__1 ;
    public final void rule__DynamicWiringPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2842:1: ( rule__DynamicWiringPattern__Group__0__Impl rule__DynamicWiringPattern__Group__1 )
            // InternalServiceDefinition.g:2843:2: rule__DynamicWiringPattern__Group__0__Impl rule__DynamicWiringPattern__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalServiceDefinition.g:2850:1: rule__DynamicWiringPattern__Group__0__Impl : ( () ) ;
    public final void rule__DynamicWiringPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2854:1: ( ( () ) )
            // InternalServiceDefinition.g:2855:1: ( () )
            {
            // InternalServiceDefinition.g:2855:1: ( () )
            // InternalServiceDefinition.g:2856:2: ()
            {
             before(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternAction_0()); 
            // InternalServiceDefinition.g:2857:2: ()
            // InternalServiceDefinition.g:2857:3: 
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
    // InternalServiceDefinition.g:2865:1: rule__DynamicWiringPattern__Group__1 : rule__DynamicWiringPattern__Group__1__Impl ;
    public final void rule__DynamicWiringPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2869:1: ( rule__DynamicWiringPattern__Group__1__Impl )
            // InternalServiceDefinition.g:2870:2: rule__DynamicWiringPattern__Group__1__Impl
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
    // InternalServiceDefinition.g:2876:1: rule__DynamicWiringPattern__Group__1__Impl : ( 'DynamicWiringPattern' ) ;
    public final void rule__DynamicWiringPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2880:1: ( ( 'DynamicWiringPattern' ) )
            // InternalServiceDefinition.g:2881:1: ( 'DynamicWiringPattern' )
            {
            // InternalServiceDefinition.g:2881:1: ( 'DynamicWiringPattern' )
            // InternalServiceDefinition.g:2882:2: 'DynamicWiringPattern'
            {
             before(grammarAccess.getDynamicWiringPatternAccess().getDynamicWiringPatternKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2892:1: rule__MonitoringPattern__Group__0 : rule__MonitoringPattern__Group__0__Impl rule__MonitoringPattern__Group__1 ;
    public final void rule__MonitoringPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2896:1: ( rule__MonitoringPattern__Group__0__Impl rule__MonitoringPattern__Group__1 )
            // InternalServiceDefinition.g:2897:2: rule__MonitoringPattern__Group__0__Impl rule__MonitoringPattern__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalServiceDefinition.g:2904:1: rule__MonitoringPattern__Group__0__Impl : ( () ) ;
    public final void rule__MonitoringPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2908:1: ( ( () ) )
            // InternalServiceDefinition.g:2909:1: ( () )
            {
            // InternalServiceDefinition.g:2909:1: ( () )
            // InternalServiceDefinition.g:2910:2: ()
            {
             before(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternAction_0()); 
            // InternalServiceDefinition.g:2911:2: ()
            // InternalServiceDefinition.g:2911:3: 
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
    // InternalServiceDefinition.g:2919:1: rule__MonitoringPattern__Group__1 : rule__MonitoringPattern__Group__1__Impl ;
    public final void rule__MonitoringPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2923:1: ( rule__MonitoringPattern__Group__1__Impl )
            // InternalServiceDefinition.g:2924:2: rule__MonitoringPattern__Group__1__Impl
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
    // InternalServiceDefinition.g:2930:1: rule__MonitoringPattern__Group__1__Impl : ( 'MonitoringPattern' ) ;
    public final void rule__MonitoringPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2934:1: ( ( 'MonitoringPattern' ) )
            // InternalServiceDefinition.g:2935:1: ( 'MonitoringPattern' )
            {
            // InternalServiceDefinition.g:2935:1: ( 'MonitoringPattern' )
            // InternalServiceDefinition.g:2936:2: 'MonitoringPattern'
            {
             before(grammarAccess.getMonitoringPatternAccess().getMonitoringPatternKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalServiceDefinition.g:2946:1: rule__PushPattern__Group__0 : rule__PushPattern__Group__0__Impl rule__PushPattern__Group__1 ;
    public final void rule__PushPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2950:1: ( rule__PushPattern__Group__0__Impl rule__PushPattern__Group__1 )
            // InternalServiceDefinition.g:2951:2: rule__PushPattern__Group__0__Impl rule__PushPattern__Group__1
            {
            pushFollow(FOLLOW_37);
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
    // InternalServiceDefinition.g:2958:1: rule__PushPattern__Group__0__Impl : ( () ) ;
    public final void rule__PushPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2962:1: ( ( () ) )
            // InternalServiceDefinition.g:2963:1: ( () )
            {
            // InternalServiceDefinition.g:2963:1: ( () )
            // InternalServiceDefinition.g:2964:2: ()
            {
             before(grammarAccess.getPushPatternAccess().getPushPatternAction_0()); 
            // InternalServiceDefinition.g:2965:2: ()
            // InternalServiceDefinition.g:2965:3: 
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
    // InternalServiceDefinition.g:2973:1: rule__PushPattern__Group__1 : rule__PushPattern__Group__1__Impl rule__PushPattern__Group__2 ;
    public final void rule__PushPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2977:1: ( rule__PushPattern__Group__1__Impl rule__PushPattern__Group__2 )
            // InternalServiceDefinition.g:2978:2: rule__PushPattern__Group__1__Impl rule__PushPattern__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalServiceDefinition.g:2985:1: rule__PushPattern__Group__1__Impl : ( 'PushPattern' ) ;
    public final void rule__PushPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:2989:1: ( ( 'PushPattern' ) )
            // InternalServiceDefinition.g:2990:1: ( 'PushPattern' )
            {
            // InternalServiceDefinition.g:2990:1: ( 'PushPattern' )
            // InternalServiceDefinition.g:2991:2: 'PushPattern'
            {
             before(grammarAccess.getPushPatternAccess().getPushPatternKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3000:1: rule__PushPattern__Group__2 : rule__PushPattern__Group__2__Impl rule__PushPattern__Group__3 ;
    public final void rule__PushPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3004:1: ( rule__PushPattern__Group__2__Impl rule__PushPattern__Group__3 )
            // InternalServiceDefinition.g:3005:2: rule__PushPattern__Group__2__Impl rule__PushPattern__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalServiceDefinition.g:3012:1: rule__PushPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__PushPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3016:1: ( ( '<' ) )
            // InternalServiceDefinition.g:3017:1: ( '<' )
            {
            // InternalServiceDefinition.g:3017:1: ( '<' )
            // InternalServiceDefinition.g:3018:2: '<'
            {
             before(grammarAccess.getPushPatternAccess().getLessThanSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3027:1: rule__PushPattern__Group__3 : rule__PushPattern__Group__3__Impl rule__PushPattern__Group__4 ;
    public final void rule__PushPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3031:1: ( rule__PushPattern__Group__3__Impl rule__PushPattern__Group__4 )
            // InternalServiceDefinition.g:3032:2: rule__PushPattern__Group__3__Impl rule__PushPattern__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalServiceDefinition.g:3039:1: rule__PushPattern__Group__3__Impl : ( 'DataType' ) ;
    public final void rule__PushPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3043:1: ( ( 'DataType' ) )
            // InternalServiceDefinition.g:3044:1: ( 'DataType' )
            {
            // InternalServiceDefinition.g:3044:1: ( 'DataType' )
            // InternalServiceDefinition.g:3045:2: 'DataType'
            {
             before(grammarAccess.getPushPatternAccess().getDataTypeKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3054:1: rule__PushPattern__Group__4 : rule__PushPattern__Group__4__Impl rule__PushPattern__Group__5 ;
    public final void rule__PushPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3058:1: ( rule__PushPattern__Group__4__Impl rule__PushPattern__Group__5 )
            // InternalServiceDefinition.g:3059:2: rule__PushPattern__Group__4__Impl rule__PushPattern__Group__5
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
    // InternalServiceDefinition.g:3066:1: rule__PushPattern__Group__4__Impl : ( '=' ) ;
    public final void rule__PushPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3070:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3071:1: ( '=' )
            {
            // InternalServiceDefinition.g:3071:1: ( '=' )
            // InternalServiceDefinition.g:3072:2: '='
            {
             before(grammarAccess.getPushPatternAccess().getEqualsSignKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3081:1: rule__PushPattern__Group__5 : rule__PushPattern__Group__5__Impl rule__PushPattern__Group__6 ;
    public final void rule__PushPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3085:1: ( rule__PushPattern__Group__5__Impl rule__PushPattern__Group__6 )
            // InternalServiceDefinition.g:3086:2: rule__PushPattern__Group__5__Impl rule__PushPattern__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalServiceDefinition.g:3093:1: rule__PushPattern__Group__5__Impl : ( ( rule__PushPattern__DataTypeAssignment_5 ) ) ;
    public final void rule__PushPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3097:1: ( ( ( rule__PushPattern__DataTypeAssignment_5 ) ) )
            // InternalServiceDefinition.g:3098:1: ( ( rule__PushPattern__DataTypeAssignment_5 ) )
            {
            // InternalServiceDefinition.g:3098:1: ( ( rule__PushPattern__DataTypeAssignment_5 ) )
            // InternalServiceDefinition.g:3099:2: ( rule__PushPattern__DataTypeAssignment_5 )
            {
             before(grammarAccess.getPushPatternAccess().getDataTypeAssignment_5()); 
            // InternalServiceDefinition.g:3100:2: ( rule__PushPattern__DataTypeAssignment_5 )
            // InternalServiceDefinition.g:3100:3: rule__PushPattern__DataTypeAssignment_5
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
    // InternalServiceDefinition.g:3108:1: rule__PushPattern__Group__6 : rule__PushPattern__Group__6__Impl ;
    public final void rule__PushPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3112:1: ( rule__PushPattern__Group__6__Impl )
            // InternalServiceDefinition.g:3113:2: rule__PushPattern__Group__6__Impl
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
    // InternalServiceDefinition.g:3119:1: rule__PushPattern__Group__6__Impl : ( '>' ) ;
    public final void rule__PushPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3123:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3124:1: ( '>' )
            {
            // InternalServiceDefinition.g:3124:1: ( '>' )
            // InternalServiceDefinition.g:3125:2: '>'
            {
             before(grammarAccess.getPushPatternAccess().getGreaterThanSignKeyword_6()); 
            match(input,32,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3135:1: rule__EventPattern__Group__0 : rule__EventPattern__Group__0__Impl rule__EventPattern__Group__1 ;
    public final void rule__EventPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3139:1: ( rule__EventPattern__Group__0__Impl rule__EventPattern__Group__1 )
            // InternalServiceDefinition.g:3140:2: rule__EventPattern__Group__0__Impl rule__EventPattern__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalServiceDefinition.g:3147:1: rule__EventPattern__Group__0__Impl : ( () ) ;
    public final void rule__EventPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3151:1: ( ( () ) )
            // InternalServiceDefinition.g:3152:1: ( () )
            {
            // InternalServiceDefinition.g:3152:1: ( () )
            // InternalServiceDefinition.g:3153:2: ()
            {
             before(grammarAccess.getEventPatternAccess().getEventPatternAction_0()); 
            // InternalServiceDefinition.g:3154:2: ()
            // InternalServiceDefinition.g:3154:3: 
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
    // InternalServiceDefinition.g:3162:1: rule__EventPattern__Group__1 : rule__EventPattern__Group__1__Impl rule__EventPattern__Group__2 ;
    public final void rule__EventPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3166:1: ( rule__EventPattern__Group__1__Impl rule__EventPattern__Group__2 )
            // InternalServiceDefinition.g:3167:2: rule__EventPattern__Group__1__Impl rule__EventPattern__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalServiceDefinition.g:3174:1: rule__EventPattern__Group__1__Impl : ( 'EventPattern' ) ;
    public final void rule__EventPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3178:1: ( ( 'EventPattern' ) )
            // InternalServiceDefinition.g:3179:1: ( 'EventPattern' )
            {
            // InternalServiceDefinition.g:3179:1: ( 'EventPattern' )
            // InternalServiceDefinition.g:3180:2: 'EventPattern'
            {
             before(grammarAccess.getEventPatternAccess().getEventPatternKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3189:1: rule__EventPattern__Group__2 : rule__EventPattern__Group__2__Impl rule__EventPattern__Group__3 ;
    public final void rule__EventPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3193:1: ( rule__EventPattern__Group__2__Impl rule__EventPattern__Group__3 )
            // InternalServiceDefinition.g:3194:2: rule__EventPattern__Group__2__Impl rule__EventPattern__Group__3
            {
            pushFollow(FOLLOW_40);
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
    // InternalServiceDefinition.g:3201:1: rule__EventPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__EventPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3205:1: ( ( '<' ) )
            // InternalServiceDefinition.g:3206:1: ( '<' )
            {
            // InternalServiceDefinition.g:3206:1: ( '<' )
            // InternalServiceDefinition.g:3207:2: '<'
            {
             before(grammarAccess.getEventPatternAccess().getLessThanSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3216:1: rule__EventPattern__Group__3 : rule__EventPattern__Group__3__Impl rule__EventPattern__Group__4 ;
    public final void rule__EventPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3220:1: ( rule__EventPattern__Group__3__Impl rule__EventPattern__Group__4 )
            // InternalServiceDefinition.g:3221:2: rule__EventPattern__Group__3__Impl rule__EventPattern__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalServiceDefinition.g:3228:1: rule__EventPattern__Group__3__Impl : ( ( rule__EventPattern__UnorderedGroup_3 ) ) ;
    public final void rule__EventPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3232:1: ( ( ( rule__EventPattern__UnorderedGroup_3 ) ) )
            // InternalServiceDefinition.g:3233:1: ( ( rule__EventPattern__UnorderedGroup_3 ) )
            {
            // InternalServiceDefinition.g:3233:1: ( ( rule__EventPattern__UnorderedGroup_3 ) )
            // InternalServiceDefinition.g:3234:2: ( rule__EventPattern__UnorderedGroup_3 )
            {
             before(grammarAccess.getEventPatternAccess().getUnorderedGroup_3()); 
            // InternalServiceDefinition.g:3235:2: ( rule__EventPattern__UnorderedGroup_3 )
            // InternalServiceDefinition.g:3235:3: rule__EventPattern__UnorderedGroup_3
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
    // InternalServiceDefinition.g:3243:1: rule__EventPattern__Group__4 : rule__EventPattern__Group__4__Impl ;
    public final void rule__EventPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3247:1: ( rule__EventPattern__Group__4__Impl )
            // InternalServiceDefinition.g:3248:2: rule__EventPattern__Group__4__Impl
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
    // InternalServiceDefinition.g:3254:1: rule__EventPattern__Group__4__Impl : ( '>' ) ;
    public final void rule__EventPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3258:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3259:1: ( '>' )
            {
            // InternalServiceDefinition.g:3259:1: ( '>' )
            // InternalServiceDefinition.g:3260:2: '>'
            {
             before(grammarAccess.getEventPatternAccess().getGreaterThanSignKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3270:1: rule__EventPattern__Group_3_0__0 : rule__EventPattern__Group_3_0__0__Impl rule__EventPattern__Group_3_0__1 ;
    public final void rule__EventPattern__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3274:1: ( rule__EventPattern__Group_3_0__0__Impl rule__EventPattern__Group_3_0__1 )
            // InternalServiceDefinition.g:3275:2: rule__EventPattern__Group_3_0__0__Impl rule__EventPattern__Group_3_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalServiceDefinition.g:3282:1: rule__EventPattern__Group_3_0__0__Impl : ( 'EventType' ) ;
    public final void rule__EventPattern__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3286:1: ( ( 'EventType' ) )
            // InternalServiceDefinition.g:3287:1: ( 'EventType' )
            {
            // InternalServiceDefinition.g:3287:1: ( 'EventType' )
            // InternalServiceDefinition.g:3288:2: 'EventType'
            {
             before(grammarAccess.getEventPatternAccess().getEventTypeKeyword_3_0_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3297:1: rule__EventPattern__Group_3_0__1 : rule__EventPattern__Group_3_0__1__Impl rule__EventPattern__Group_3_0__2 ;
    public final void rule__EventPattern__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3301:1: ( rule__EventPattern__Group_3_0__1__Impl rule__EventPattern__Group_3_0__2 )
            // InternalServiceDefinition.g:3302:2: rule__EventPattern__Group_3_0__1__Impl rule__EventPattern__Group_3_0__2
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
    // InternalServiceDefinition.g:3309:1: rule__EventPattern__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__EventPattern__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3313:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3314:1: ( '=' )
            {
            // InternalServiceDefinition.g:3314:1: ( '=' )
            // InternalServiceDefinition.g:3315:2: '='
            {
             before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_0_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3324:1: rule__EventPattern__Group_3_0__2 : rule__EventPattern__Group_3_0__2__Impl ;
    public final void rule__EventPattern__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3328:1: ( rule__EventPattern__Group_3_0__2__Impl )
            // InternalServiceDefinition.g:3329:2: rule__EventPattern__Group_3_0__2__Impl
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
    // InternalServiceDefinition.g:3335:1: rule__EventPattern__Group_3_0__2__Impl : ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) ) ;
    public final void rule__EventPattern__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3339:1: ( ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) ) )
            // InternalServiceDefinition.g:3340:1: ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) )
            {
            // InternalServiceDefinition.g:3340:1: ( ( rule__EventPattern__EventTypeAssignment_3_0_2 ) )
            // InternalServiceDefinition.g:3341:2: ( rule__EventPattern__EventTypeAssignment_3_0_2 )
            {
             before(grammarAccess.getEventPatternAccess().getEventTypeAssignment_3_0_2()); 
            // InternalServiceDefinition.g:3342:2: ( rule__EventPattern__EventTypeAssignment_3_0_2 )
            // InternalServiceDefinition.g:3342:3: rule__EventPattern__EventTypeAssignment_3_0_2
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
    // InternalServiceDefinition.g:3351:1: rule__EventPattern__Group_3_1__0 : rule__EventPattern__Group_3_1__0__Impl rule__EventPattern__Group_3_1__1 ;
    public final void rule__EventPattern__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3355:1: ( rule__EventPattern__Group_3_1__0__Impl rule__EventPattern__Group_3_1__1 )
            // InternalServiceDefinition.g:3356:2: rule__EventPattern__Group_3_1__0__Impl rule__EventPattern__Group_3_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalServiceDefinition.g:3363:1: rule__EventPattern__Group_3_1__0__Impl : ( 'ActivationType' ) ;
    public final void rule__EventPattern__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3367:1: ( ( 'ActivationType' ) )
            // InternalServiceDefinition.g:3368:1: ( 'ActivationType' )
            {
            // InternalServiceDefinition.g:3368:1: ( 'ActivationType' )
            // InternalServiceDefinition.g:3369:2: 'ActivationType'
            {
             before(grammarAccess.getEventPatternAccess().getActivationTypeKeyword_3_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3378:1: rule__EventPattern__Group_3_1__1 : rule__EventPattern__Group_3_1__1__Impl rule__EventPattern__Group_3_1__2 ;
    public final void rule__EventPattern__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3382:1: ( rule__EventPattern__Group_3_1__1__Impl rule__EventPattern__Group_3_1__2 )
            // InternalServiceDefinition.g:3383:2: rule__EventPattern__Group_3_1__1__Impl rule__EventPattern__Group_3_1__2
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
    // InternalServiceDefinition.g:3390:1: rule__EventPattern__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__EventPattern__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3394:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3395:1: ( '=' )
            {
            // InternalServiceDefinition.g:3395:1: ( '=' )
            // InternalServiceDefinition.g:3396:2: '='
            {
             before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3405:1: rule__EventPattern__Group_3_1__2 : rule__EventPattern__Group_3_1__2__Impl ;
    public final void rule__EventPattern__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3409:1: ( rule__EventPattern__Group_3_1__2__Impl )
            // InternalServiceDefinition.g:3410:2: rule__EventPattern__Group_3_1__2__Impl
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
    // InternalServiceDefinition.g:3416:1: rule__EventPattern__Group_3_1__2__Impl : ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) ) ;
    public final void rule__EventPattern__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3420:1: ( ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) ) )
            // InternalServiceDefinition.g:3421:1: ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) )
            {
            // InternalServiceDefinition.g:3421:1: ( ( rule__EventPattern__ActivationTypeAssignment_3_1_2 ) )
            // InternalServiceDefinition.g:3422:2: ( rule__EventPattern__ActivationTypeAssignment_3_1_2 )
            {
             before(grammarAccess.getEventPatternAccess().getActivationTypeAssignment_3_1_2()); 
            // InternalServiceDefinition.g:3423:2: ( rule__EventPattern__ActivationTypeAssignment_3_1_2 )
            // InternalServiceDefinition.g:3423:3: rule__EventPattern__ActivationTypeAssignment_3_1_2
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
    // InternalServiceDefinition.g:3432:1: rule__EventPattern__Group_3_2__0 : rule__EventPattern__Group_3_2__0__Impl rule__EventPattern__Group_3_2__1 ;
    public final void rule__EventPattern__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3436:1: ( rule__EventPattern__Group_3_2__0__Impl rule__EventPattern__Group_3_2__1 )
            // InternalServiceDefinition.g:3437:2: rule__EventPattern__Group_3_2__0__Impl rule__EventPattern__Group_3_2__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalServiceDefinition.g:3444:1: rule__EventPattern__Group_3_2__0__Impl : ( 'EventStateType' ) ;
    public final void rule__EventPattern__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3448:1: ( ( 'EventStateType' ) )
            // InternalServiceDefinition.g:3449:1: ( 'EventStateType' )
            {
            // InternalServiceDefinition.g:3449:1: ( 'EventStateType' )
            // InternalServiceDefinition.g:3450:2: 'EventStateType'
            {
             before(grammarAccess.getEventPatternAccess().getEventStateTypeKeyword_3_2_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3459:1: rule__EventPattern__Group_3_2__1 : rule__EventPattern__Group_3_2__1__Impl rule__EventPattern__Group_3_2__2 ;
    public final void rule__EventPattern__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3463:1: ( rule__EventPattern__Group_3_2__1__Impl rule__EventPattern__Group_3_2__2 )
            // InternalServiceDefinition.g:3464:2: rule__EventPattern__Group_3_2__1__Impl rule__EventPattern__Group_3_2__2
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
    // InternalServiceDefinition.g:3471:1: rule__EventPattern__Group_3_2__1__Impl : ( '=' ) ;
    public final void rule__EventPattern__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3475:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3476:1: ( '=' )
            {
            // InternalServiceDefinition.g:3476:1: ( '=' )
            // InternalServiceDefinition.g:3477:2: '='
            {
             before(grammarAccess.getEventPatternAccess().getEqualsSignKeyword_3_2_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3486:1: rule__EventPattern__Group_3_2__2 : rule__EventPattern__Group_3_2__2__Impl ;
    public final void rule__EventPattern__Group_3_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3490:1: ( rule__EventPattern__Group_3_2__2__Impl )
            // InternalServiceDefinition.g:3491:2: rule__EventPattern__Group_3_2__2__Impl
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
    // InternalServiceDefinition.g:3497:1: rule__EventPattern__Group_3_2__2__Impl : ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) ) ;
    public final void rule__EventPattern__Group_3_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3501:1: ( ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) ) )
            // InternalServiceDefinition.g:3502:1: ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) )
            {
            // InternalServiceDefinition.g:3502:1: ( ( rule__EventPattern__EventStateTypeAssignment_3_2_2 ) )
            // InternalServiceDefinition.g:3503:2: ( rule__EventPattern__EventStateTypeAssignment_3_2_2 )
            {
             before(grammarAccess.getEventPatternAccess().getEventStateTypeAssignment_3_2_2()); 
            // InternalServiceDefinition.g:3504:2: ( rule__EventPattern__EventStateTypeAssignment_3_2_2 )
            // InternalServiceDefinition.g:3504:3: rule__EventPattern__EventStateTypeAssignment_3_2_2
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
    // InternalServiceDefinition.g:3513:1: rule__QueryPattern__Group__0 : rule__QueryPattern__Group__0__Impl rule__QueryPattern__Group__1 ;
    public final void rule__QueryPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3517:1: ( rule__QueryPattern__Group__0__Impl rule__QueryPattern__Group__1 )
            // InternalServiceDefinition.g:3518:2: rule__QueryPattern__Group__0__Impl rule__QueryPattern__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalServiceDefinition.g:3525:1: rule__QueryPattern__Group__0__Impl : ( () ) ;
    public final void rule__QueryPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3529:1: ( ( () ) )
            // InternalServiceDefinition.g:3530:1: ( () )
            {
            // InternalServiceDefinition.g:3530:1: ( () )
            // InternalServiceDefinition.g:3531:2: ()
            {
             before(grammarAccess.getQueryPatternAccess().getQueryPatternAction_0()); 
            // InternalServiceDefinition.g:3532:2: ()
            // InternalServiceDefinition.g:3532:3: 
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
    // InternalServiceDefinition.g:3540:1: rule__QueryPattern__Group__1 : rule__QueryPattern__Group__1__Impl rule__QueryPattern__Group__2 ;
    public final void rule__QueryPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3544:1: ( rule__QueryPattern__Group__1__Impl rule__QueryPattern__Group__2 )
            // InternalServiceDefinition.g:3545:2: rule__QueryPattern__Group__1__Impl rule__QueryPattern__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalServiceDefinition.g:3552:1: rule__QueryPattern__Group__1__Impl : ( 'QueryPattern' ) ;
    public final void rule__QueryPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3556:1: ( ( 'QueryPattern' ) )
            // InternalServiceDefinition.g:3557:1: ( 'QueryPattern' )
            {
            // InternalServiceDefinition.g:3557:1: ( 'QueryPattern' )
            // InternalServiceDefinition.g:3558:2: 'QueryPattern'
            {
             before(grammarAccess.getQueryPatternAccess().getQueryPatternKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3567:1: rule__QueryPattern__Group__2 : rule__QueryPattern__Group__2__Impl rule__QueryPattern__Group__3 ;
    public final void rule__QueryPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3571:1: ( rule__QueryPattern__Group__2__Impl rule__QueryPattern__Group__3 )
            // InternalServiceDefinition.g:3572:2: rule__QueryPattern__Group__2__Impl rule__QueryPattern__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalServiceDefinition.g:3579:1: rule__QueryPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__QueryPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3583:1: ( ( '<' ) )
            // InternalServiceDefinition.g:3584:1: ( '<' )
            {
            // InternalServiceDefinition.g:3584:1: ( '<' )
            // InternalServiceDefinition.g:3585:2: '<'
            {
             before(grammarAccess.getQueryPatternAccess().getLessThanSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3594:1: rule__QueryPattern__Group__3 : rule__QueryPattern__Group__3__Impl rule__QueryPattern__Group__4 ;
    public final void rule__QueryPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3598:1: ( rule__QueryPattern__Group__3__Impl rule__QueryPattern__Group__4 )
            // InternalServiceDefinition.g:3599:2: rule__QueryPattern__Group__3__Impl rule__QueryPattern__Group__4
            {
            pushFollow(FOLLOW_35);
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
    // InternalServiceDefinition.g:3606:1: rule__QueryPattern__Group__3__Impl : ( ( rule__QueryPattern__UnorderedGroup_3 ) ) ;
    public final void rule__QueryPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3610:1: ( ( ( rule__QueryPattern__UnorderedGroup_3 ) ) )
            // InternalServiceDefinition.g:3611:1: ( ( rule__QueryPattern__UnorderedGroup_3 ) )
            {
            // InternalServiceDefinition.g:3611:1: ( ( rule__QueryPattern__UnorderedGroup_3 ) )
            // InternalServiceDefinition.g:3612:2: ( rule__QueryPattern__UnorderedGroup_3 )
            {
             before(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3()); 
            // InternalServiceDefinition.g:3613:2: ( rule__QueryPattern__UnorderedGroup_3 )
            // InternalServiceDefinition.g:3613:3: rule__QueryPattern__UnorderedGroup_3
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
    // InternalServiceDefinition.g:3621:1: rule__QueryPattern__Group__4 : rule__QueryPattern__Group__4__Impl ;
    public final void rule__QueryPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3625:1: ( rule__QueryPattern__Group__4__Impl )
            // InternalServiceDefinition.g:3626:2: rule__QueryPattern__Group__4__Impl
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
    // InternalServiceDefinition.g:3632:1: rule__QueryPattern__Group__4__Impl : ( '>' ) ;
    public final void rule__QueryPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3636:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3637:1: ( '>' )
            {
            // InternalServiceDefinition.g:3637:1: ( '>' )
            // InternalServiceDefinition.g:3638:2: '>'
            {
             before(grammarAccess.getQueryPatternAccess().getGreaterThanSignKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3648:1: rule__QueryPattern__Group_3_0__0 : rule__QueryPattern__Group_3_0__0__Impl rule__QueryPattern__Group_3_0__1 ;
    public final void rule__QueryPattern__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3652:1: ( rule__QueryPattern__Group_3_0__0__Impl rule__QueryPattern__Group_3_0__1 )
            // InternalServiceDefinition.g:3653:2: rule__QueryPattern__Group_3_0__0__Impl rule__QueryPattern__Group_3_0__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalServiceDefinition.g:3660:1: rule__QueryPattern__Group_3_0__0__Impl : ( 'RequestType' ) ;
    public final void rule__QueryPattern__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3664:1: ( ( 'RequestType' ) )
            // InternalServiceDefinition.g:3665:1: ( 'RequestType' )
            {
            // InternalServiceDefinition.g:3665:1: ( 'RequestType' )
            // InternalServiceDefinition.g:3666:2: 'RequestType'
            {
             before(grammarAccess.getQueryPatternAccess().getRequestTypeKeyword_3_0_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3675:1: rule__QueryPattern__Group_3_0__1 : rule__QueryPattern__Group_3_0__1__Impl rule__QueryPattern__Group_3_0__2 ;
    public final void rule__QueryPattern__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3679:1: ( rule__QueryPattern__Group_3_0__1__Impl rule__QueryPattern__Group_3_0__2 )
            // InternalServiceDefinition.g:3680:2: rule__QueryPattern__Group_3_0__1__Impl rule__QueryPattern__Group_3_0__2
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
    // InternalServiceDefinition.g:3687:1: rule__QueryPattern__Group_3_0__1__Impl : ( '=' ) ;
    public final void rule__QueryPattern__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3691:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3692:1: ( '=' )
            {
            // InternalServiceDefinition.g:3692:1: ( '=' )
            // InternalServiceDefinition.g:3693:2: '='
            {
             before(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_0_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3702:1: rule__QueryPattern__Group_3_0__2 : rule__QueryPattern__Group_3_0__2__Impl ;
    public final void rule__QueryPattern__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3706:1: ( rule__QueryPattern__Group_3_0__2__Impl )
            // InternalServiceDefinition.g:3707:2: rule__QueryPattern__Group_3_0__2__Impl
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
    // InternalServiceDefinition.g:3713:1: rule__QueryPattern__Group_3_0__2__Impl : ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) ) ;
    public final void rule__QueryPattern__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3717:1: ( ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) ) )
            // InternalServiceDefinition.g:3718:1: ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) )
            {
            // InternalServiceDefinition.g:3718:1: ( ( rule__QueryPattern__RequestTypeAssignment_3_0_2 ) )
            // InternalServiceDefinition.g:3719:2: ( rule__QueryPattern__RequestTypeAssignment_3_0_2 )
            {
             before(grammarAccess.getQueryPatternAccess().getRequestTypeAssignment_3_0_2()); 
            // InternalServiceDefinition.g:3720:2: ( rule__QueryPattern__RequestTypeAssignment_3_0_2 )
            // InternalServiceDefinition.g:3720:3: rule__QueryPattern__RequestTypeAssignment_3_0_2
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
    // InternalServiceDefinition.g:3729:1: rule__QueryPattern__Group_3_1__0 : rule__QueryPattern__Group_3_1__0__Impl rule__QueryPattern__Group_3_1__1 ;
    public final void rule__QueryPattern__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3733:1: ( rule__QueryPattern__Group_3_1__0__Impl rule__QueryPattern__Group_3_1__1 )
            // InternalServiceDefinition.g:3734:2: rule__QueryPattern__Group_3_1__0__Impl rule__QueryPattern__Group_3_1__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalServiceDefinition.g:3741:1: rule__QueryPattern__Group_3_1__0__Impl : ( 'AnswerType' ) ;
    public final void rule__QueryPattern__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3745:1: ( ( 'AnswerType' ) )
            // InternalServiceDefinition.g:3746:1: ( 'AnswerType' )
            {
            // InternalServiceDefinition.g:3746:1: ( 'AnswerType' )
            // InternalServiceDefinition.g:3747:2: 'AnswerType'
            {
             before(grammarAccess.getQueryPatternAccess().getAnswerTypeKeyword_3_1_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3756:1: rule__QueryPattern__Group_3_1__1 : rule__QueryPattern__Group_3_1__1__Impl rule__QueryPattern__Group_3_1__2 ;
    public final void rule__QueryPattern__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3760:1: ( rule__QueryPattern__Group_3_1__1__Impl rule__QueryPattern__Group_3_1__2 )
            // InternalServiceDefinition.g:3761:2: rule__QueryPattern__Group_3_1__1__Impl rule__QueryPattern__Group_3_1__2
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
    // InternalServiceDefinition.g:3768:1: rule__QueryPattern__Group_3_1__1__Impl : ( '=' ) ;
    public final void rule__QueryPattern__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3772:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3773:1: ( '=' )
            {
            // InternalServiceDefinition.g:3773:1: ( '=' )
            // InternalServiceDefinition.g:3774:2: '='
            {
             before(grammarAccess.getQueryPatternAccess().getEqualsSignKeyword_3_1_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3783:1: rule__QueryPattern__Group_3_1__2 : rule__QueryPattern__Group_3_1__2__Impl ;
    public final void rule__QueryPattern__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3787:1: ( rule__QueryPattern__Group_3_1__2__Impl )
            // InternalServiceDefinition.g:3788:2: rule__QueryPattern__Group_3_1__2__Impl
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
    // InternalServiceDefinition.g:3794:1: rule__QueryPattern__Group_3_1__2__Impl : ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) ) ;
    public final void rule__QueryPattern__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3798:1: ( ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) ) )
            // InternalServiceDefinition.g:3799:1: ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) )
            {
            // InternalServiceDefinition.g:3799:1: ( ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 ) )
            // InternalServiceDefinition.g:3800:2: ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 )
            {
             before(grammarAccess.getQueryPatternAccess().getAnswerTypeAssignment_3_1_2()); 
            // InternalServiceDefinition.g:3801:2: ( rule__QueryPattern__AnswerTypeAssignment_3_1_2 )
            // InternalServiceDefinition.g:3801:3: rule__QueryPattern__AnswerTypeAssignment_3_1_2
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
    // InternalServiceDefinition.g:3810:1: rule__SendPattern__Group__0 : rule__SendPattern__Group__0__Impl rule__SendPattern__Group__1 ;
    public final void rule__SendPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3814:1: ( rule__SendPattern__Group__0__Impl rule__SendPattern__Group__1 )
            // InternalServiceDefinition.g:3815:2: rule__SendPattern__Group__0__Impl rule__SendPattern__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalServiceDefinition.g:3822:1: rule__SendPattern__Group__0__Impl : ( () ) ;
    public final void rule__SendPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3826:1: ( ( () ) )
            // InternalServiceDefinition.g:3827:1: ( () )
            {
            // InternalServiceDefinition.g:3827:1: ( () )
            // InternalServiceDefinition.g:3828:2: ()
            {
             before(grammarAccess.getSendPatternAccess().getSendPatternAction_0()); 
            // InternalServiceDefinition.g:3829:2: ()
            // InternalServiceDefinition.g:3829:3: 
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
    // InternalServiceDefinition.g:3837:1: rule__SendPattern__Group__1 : rule__SendPattern__Group__1__Impl rule__SendPattern__Group__2 ;
    public final void rule__SendPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3841:1: ( rule__SendPattern__Group__1__Impl rule__SendPattern__Group__2 )
            // InternalServiceDefinition.g:3842:2: rule__SendPattern__Group__1__Impl rule__SendPattern__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalServiceDefinition.g:3849:1: rule__SendPattern__Group__1__Impl : ( 'SendPattern' ) ;
    public final void rule__SendPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3853:1: ( ( 'SendPattern' ) )
            // InternalServiceDefinition.g:3854:1: ( 'SendPattern' )
            {
            // InternalServiceDefinition.g:3854:1: ( 'SendPattern' )
            // InternalServiceDefinition.g:3855:2: 'SendPattern'
            {
             before(grammarAccess.getSendPatternAccess().getSendPatternKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3864:1: rule__SendPattern__Group__2 : rule__SendPattern__Group__2__Impl rule__SendPattern__Group__3 ;
    public final void rule__SendPattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3868:1: ( rule__SendPattern__Group__2__Impl rule__SendPattern__Group__3 )
            // InternalServiceDefinition.g:3869:2: rule__SendPattern__Group__2__Impl rule__SendPattern__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalServiceDefinition.g:3876:1: rule__SendPattern__Group__2__Impl : ( '<' ) ;
    public final void rule__SendPattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3880:1: ( ( '<' ) )
            // InternalServiceDefinition.g:3881:1: ( '<' )
            {
            // InternalServiceDefinition.g:3881:1: ( '<' )
            // InternalServiceDefinition.g:3882:2: '<'
            {
             before(grammarAccess.getSendPatternAccess().getLessThanSignKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3891:1: rule__SendPattern__Group__3 : rule__SendPattern__Group__3__Impl rule__SendPattern__Group__4 ;
    public final void rule__SendPattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3895:1: ( rule__SendPattern__Group__3__Impl rule__SendPattern__Group__4 )
            // InternalServiceDefinition.g:3896:2: rule__SendPattern__Group__3__Impl rule__SendPattern__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalServiceDefinition.g:3903:1: rule__SendPattern__Group__3__Impl : ( 'DataType' ) ;
    public final void rule__SendPattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3907:1: ( ( 'DataType' ) )
            // InternalServiceDefinition.g:3908:1: ( 'DataType' )
            {
            // InternalServiceDefinition.g:3908:1: ( 'DataType' )
            // InternalServiceDefinition.g:3909:2: 'DataType'
            {
             before(grammarAccess.getSendPatternAccess().getDataTypeKeyword_3()); 
            match(input,38,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3918:1: rule__SendPattern__Group__4 : rule__SendPattern__Group__4__Impl rule__SendPattern__Group__5 ;
    public final void rule__SendPattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3922:1: ( rule__SendPattern__Group__4__Impl rule__SendPattern__Group__5 )
            // InternalServiceDefinition.g:3923:2: rule__SendPattern__Group__4__Impl rule__SendPattern__Group__5
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
    // InternalServiceDefinition.g:3930:1: rule__SendPattern__Group__4__Impl : ( '=' ) ;
    public final void rule__SendPattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3934:1: ( ( '=' ) )
            // InternalServiceDefinition.g:3935:1: ( '=' )
            {
            // InternalServiceDefinition.g:3935:1: ( '=' )
            // InternalServiceDefinition.g:3936:2: '='
            {
             before(grammarAccess.getSendPatternAccess().getEqualsSignKeyword_4()); 
            match(input,39,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3945:1: rule__SendPattern__Group__5 : rule__SendPattern__Group__5__Impl rule__SendPattern__Group__6 ;
    public final void rule__SendPattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3949:1: ( rule__SendPattern__Group__5__Impl rule__SendPattern__Group__6 )
            // InternalServiceDefinition.g:3950:2: rule__SendPattern__Group__5__Impl rule__SendPattern__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalServiceDefinition.g:3957:1: rule__SendPattern__Group__5__Impl : ( ( rule__SendPattern__DataTypeAssignment_5 ) ) ;
    public final void rule__SendPattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3961:1: ( ( ( rule__SendPattern__DataTypeAssignment_5 ) ) )
            // InternalServiceDefinition.g:3962:1: ( ( rule__SendPattern__DataTypeAssignment_5 ) )
            {
            // InternalServiceDefinition.g:3962:1: ( ( rule__SendPattern__DataTypeAssignment_5 ) )
            // InternalServiceDefinition.g:3963:2: ( rule__SendPattern__DataTypeAssignment_5 )
            {
             before(grammarAccess.getSendPatternAccess().getDataTypeAssignment_5()); 
            // InternalServiceDefinition.g:3964:2: ( rule__SendPattern__DataTypeAssignment_5 )
            // InternalServiceDefinition.g:3964:3: rule__SendPattern__DataTypeAssignment_5
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
    // InternalServiceDefinition.g:3972:1: rule__SendPattern__Group__6 : rule__SendPattern__Group__6__Impl ;
    public final void rule__SendPattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3976:1: ( rule__SendPattern__Group__6__Impl )
            // InternalServiceDefinition.g:3977:2: rule__SendPattern__Group__6__Impl
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
    // InternalServiceDefinition.g:3983:1: rule__SendPattern__Group__6__Impl : ( '>' ) ;
    public final void rule__SendPattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:3987:1: ( ( '>' ) )
            // InternalServiceDefinition.g:3988:1: ( '>' )
            {
            // InternalServiceDefinition.g:3988:1: ( '>' )
            // InternalServiceDefinition.g:3989:2: '>'
            {
             before(grammarAccess.getSendPatternAccess().getGreaterThanSignKeyword_6()); 
            match(input,32,FOLLOW_2); 
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
    // InternalServiceDefinition.g:3999:1: rule__ServiceProperty__Group__0 : rule__ServiceProperty__Group__0__Impl rule__ServiceProperty__Group__1 ;
    public final void rule__ServiceProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4003:1: ( rule__ServiceProperty__Group__0__Impl rule__ServiceProperty__Group__1 )
            // InternalServiceDefinition.g:4004:2: rule__ServiceProperty__Group__0__Impl rule__ServiceProperty__Group__1
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
    // InternalServiceDefinition.g:4011:1: rule__ServiceProperty__Group__0__Impl : ( 'ServiceProperty' ) ;
    public final void rule__ServiceProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4015:1: ( ( 'ServiceProperty' ) )
            // InternalServiceDefinition.g:4016:1: ( 'ServiceProperty' )
            {
            // InternalServiceDefinition.g:4016:1: ( 'ServiceProperty' )
            // InternalServiceDefinition.g:4017:2: 'ServiceProperty'
            {
             before(grammarAccess.getServicePropertyAccess().getServicePropertyKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalServiceDefinition.g:4026:1: rule__ServiceProperty__Group__1 : rule__ServiceProperty__Group__1__Impl rule__ServiceProperty__Group__2 ;
    public final void rule__ServiceProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4030:1: ( rule__ServiceProperty__Group__1__Impl rule__ServiceProperty__Group__2 )
            // InternalServiceDefinition.g:4031:2: rule__ServiceProperty__Group__1__Impl rule__ServiceProperty__Group__2
            {
            pushFollow(FOLLOW_17);
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
    // InternalServiceDefinition.g:4038:1: rule__ServiceProperty__Group__1__Impl : ( ( rule__ServiceProperty__NameAssignment_1 ) ) ;
    public final void rule__ServiceProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4042:1: ( ( ( rule__ServiceProperty__NameAssignment_1 ) ) )
            // InternalServiceDefinition.g:4043:1: ( ( rule__ServiceProperty__NameAssignment_1 ) )
            {
            // InternalServiceDefinition.g:4043:1: ( ( rule__ServiceProperty__NameAssignment_1 ) )
            // InternalServiceDefinition.g:4044:2: ( rule__ServiceProperty__NameAssignment_1 )
            {
             before(grammarAccess.getServicePropertyAccess().getNameAssignment_1()); 
            // InternalServiceDefinition.g:4045:2: ( rule__ServiceProperty__NameAssignment_1 )
            // InternalServiceDefinition.g:4045:3: rule__ServiceProperty__NameAssignment_1
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
    // InternalServiceDefinition.g:4053:1: rule__ServiceProperty__Group__2 : rule__ServiceProperty__Group__2__Impl rule__ServiceProperty__Group__3 ;
    public final void rule__ServiceProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4057:1: ( rule__ServiceProperty__Group__2__Impl rule__ServiceProperty__Group__3 )
            // InternalServiceDefinition.g:4058:2: rule__ServiceProperty__Group__2__Impl rule__ServiceProperty__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalServiceDefinition.g:4065:1: rule__ServiceProperty__Group__2__Impl : ( '{' ) ;
    public final void rule__ServiceProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4069:1: ( ( '{' ) )
            // InternalServiceDefinition.g:4070:1: ( '{' )
            {
            // InternalServiceDefinition.g:4070:1: ( '{' )
            // InternalServiceDefinition.g:4071:2: '{'
            {
             before(grammarAccess.getServicePropertyAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
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
    // InternalServiceDefinition.g:4080:1: rule__ServiceProperty__Group__3 : rule__ServiceProperty__Group__3__Impl ;
    public final void rule__ServiceProperty__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4084:1: ( rule__ServiceProperty__Group__3__Impl )
            // InternalServiceDefinition.g:4085:2: rule__ServiceProperty__Group__3__Impl
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
    // InternalServiceDefinition.g:4091:1: rule__ServiceProperty__Group__3__Impl : ( '}' ) ;
    public final void rule__ServiceProperty__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4095:1: ( ( '}' ) )
            // InternalServiceDefinition.g:4096:1: ( '}' )
            {
            // InternalServiceDefinition.g:4096:1: ( '}' )
            // InternalServiceDefinition.g:4097:2: '}'
            {
             before(grammarAccess.getServicePropertyAccess().getRightCurlyBracketKeyword_3()); 
            match(input,19,FOLLOW_2); 
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


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_4"
    // InternalServiceDefinition.g:4107:1: rule__CoordinationServiceDefinition__UnorderedGroup_4 : ( rule__CoordinationServiceDefinition__UnorderedGroup_4__0 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
        	
        try {
            // InternalServiceDefinition.g:4112:1: ( ( rule__CoordinationServiceDefinition__UnorderedGroup_4__0 )? )
            // InternalServiceDefinition.g:4113:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_4__0 )?
            {
            // InternalServiceDefinition.g:4113:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt24=1;
            }
            else if ( LA24_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt24=1;
            }
            else if ( LA24_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalServiceDefinition.g:4113:2: rule__CoordinationServiceDefinition__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__UnorderedGroup_4__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_4"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl"
    // InternalServiceDefinition.g:4121:1: rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 ) ) ) ) ) ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalServiceDefinition.g:4126:1: ( ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 ) ) ) ) ) )
            // InternalServiceDefinition.g:4127:3: ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 ) ) ) ) )
            {
            // InternalServiceDefinition.g:4127:3: ( ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 ) ) ) ) | ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 ) ) ) ) )
            int alt25=4;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt25=2;
            }
            else if ( LA25_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt25=3;
            }
            else if ( LA25_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt25=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalServiceDefinition.g:4128:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4128:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 ) ) ) )
                    // InternalServiceDefinition.g:4129:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalServiceDefinition.g:4129:125: ( ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 ) ) )
                    // InternalServiceDefinition.g:4130:5: ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4136:5: ( ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 ) )
                    // InternalServiceDefinition.g:4137:6: ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternAssignment_4_0()); 
                    // InternalServiceDefinition.g:4138:6: ( rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 )
                    // InternalServiceDefinition.g:4138:7: rule__CoordinationServiceDefinition__StatePatternAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__StatePatternAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternAssignment_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalServiceDefinition.g:4143:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4143:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 ) ) ) )
                    // InternalServiceDefinition.g:4144:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalServiceDefinition.g:4144:125: ( ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 ) ) )
                    // InternalServiceDefinition.g:4145:5: ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4151:5: ( ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 ) )
                    // InternalServiceDefinition.g:4152:6: ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternAssignment_4_1()); 
                    // InternalServiceDefinition.g:4153:6: ( rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 )
                    // InternalServiceDefinition.g:4153:7: rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternAssignment_4_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalServiceDefinition.g:4158:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4158:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 ) ) ) )
                    // InternalServiceDefinition.g:4159:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalServiceDefinition.g:4159:125: ( ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 ) ) )
                    // InternalServiceDefinition.g:4160:5: ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4166:5: ( ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 ) )
                    // InternalServiceDefinition.g:4167:6: ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternAssignment_4_2()); 
                    // InternalServiceDefinition.g:4168:6: ( rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 )
                    // InternalServiceDefinition.g:4168:7: rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternAssignment_4_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalServiceDefinition.g:4173:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4173:3: ({...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 ) ) ) )
                    // InternalServiceDefinition.g:4174:4: {...}? => ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                        throw new FailedPredicateException(input, "rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3)");
                    }
                    // InternalServiceDefinition.g:4174:125: ( ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 ) ) )
                    // InternalServiceDefinition.g:4175:5: ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4181:5: ( ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 ) )
                    // InternalServiceDefinition.g:4182:6: ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 )
                    {
                     before(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternAssignment_4_3()); 
                    // InternalServiceDefinition.g:4183:6: ( rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 )
                    // InternalServiceDefinition.g:4183:7: rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternAssignment_4_3()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_4__0"
    // InternalServiceDefinition.g:4196:1: rule__CoordinationServiceDefinition__UnorderedGroup_4__0 : rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_4__1 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4200:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_4__1 )? )
            // InternalServiceDefinition.g:4201:2: rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_43);
            rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4202:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_4__1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt26=1;
            }
            else if ( LA26_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt26=1;
            }
            else if ( LA26_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalServiceDefinition.g:4202:2: rule__CoordinationServiceDefinition__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__UnorderedGroup_4__1();

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
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_4__0"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_4__1"
    // InternalServiceDefinition.g:4208:1: rule__CoordinationServiceDefinition__UnorderedGroup_4__1 : rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_4__2 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4212:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_4__2 )? )
            // InternalServiceDefinition.g:4213:2: rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_43);
            rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4214:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_4__2 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt27=1;
            }
            else if ( LA27_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt27=1;
            }
            else if ( LA27_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalServiceDefinition.g:4214:2: rule__CoordinationServiceDefinition__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__UnorderedGroup_4__2();

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
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_4__1"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_4__2"
    // InternalServiceDefinition.g:4220:1: rule__CoordinationServiceDefinition__UnorderedGroup_4__2 : rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_4__3 )? ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4224:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_4__3 )? )
            // InternalServiceDefinition.g:4225:2: rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl ( rule__CoordinationServiceDefinition__UnorderedGroup_4__3 )?
            {
            pushFollow(FOLLOW_43);
            rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4226:2: ( rule__CoordinationServiceDefinition__UnorderedGroup_4__3 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 1) ) {
                alt28=1;
            }
            else if ( LA28_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 2) ) {
                alt28=1;
            }
            else if ( LA28_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getCoordinationServiceDefinitionAccess().getUnorderedGroup_4(), 3) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalServiceDefinition.g:4226:2: rule__CoordinationServiceDefinition__UnorderedGroup_4__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationServiceDefinition__UnorderedGroup_4__3();

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
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_4__2"


    // $ANTLR start "rule__CoordinationServiceDefinition__UnorderedGroup_4__3"
    // InternalServiceDefinition.g:4232:1: rule__CoordinationServiceDefinition__UnorderedGroup_4__3 : rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl ;
    public final void rule__CoordinationServiceDefinition__UnorderedGroup_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4236:1: ( rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl )
            // InternalServiceDefinition.g:4237:2: rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationServiceDefinition__UnorderedGroup_4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__UnorderedGroup_4__3"


    // $ANTLR start "rule__EventPattern__UnorderedGroup_3"
    // InternalServiceDefinition.g:4244:1: rule__EventPattern__UnorderedGroup_3 : rule__EventPattern__UnorderedGroup_3__0 {...}?;
    public final void rule__EventPattern__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getEventPatternAccess().getUnorderedGroup_3());
        	
        try {
            // InternalServiceDefinition.g:4249:1: ( rule__EventPattern__UnorderedGroup_3__0 {...}?)
            // InternalServiceDefinition.g:4250:2: rule__EventPattern__UnorderedGroup_3__0 {...}?
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
    // InternalServiceDefinition.g:4258:1: rule__EventPattern__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__EventPattern__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalServiceDefinition.g:4263:1: ( ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) ) )
            // InternalServiceDefinition.g:4264:3: ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) )
            {
            // InternalServiceDefinition.g:4264:3: ( ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) ) )
            int alt29=3;
            int LA29_0 = input.LA(1);

            if ( LA29_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt29=2;
            }
            else if ( LA29_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                alt29=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalServiceDefinition.g:4265:3: ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4265:3: ({...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) ) )
                    // InternalServiceDefinition.g:4266:4: {...}? => ( ( ( rule__EventPattern__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__EventPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalServiceDefinition.g:4266:108: ( ( ( rule__EventPattern__Group_3_0__0 ) ) )
                    // InternalServiceDefinition.g:4267:5: ( ( rule__EventPattern__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4273:5: ( ( rule__EventPattern__Group_3_0__0 ) )
                    // InternalServiceDefinition.g:4274:6: ( rule__EventPattern__Group_3_0__0 )
                    {
                     before(grammarAccess.getEventPatternAccess().getGroup_3_0()); 
                    // InternalServiceDefinition.g:4275:6: ( rule__EventPattern__Group_3_0__0 )
                    // InternalServiceDefinition.g:4275:7: rule__EventPattern__Group_3_0__0
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
                    // InternalServiceDefinition.g:4280:3: ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4280:3: ({...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) ) )
                    // InternalServiceDefinition.g:4281:4: {...}? => ( ( ( rule__EventPattern__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__EventPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalServiceDefinition.g:4281:108: ( ( ( rule__EventPattern__Group_3_1__0 ) ) )
                    // InternalServiceDefinition.g:4282:5: ( ( rule__EventPattern__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4288:5: ( ( rule__EventPattern__Group_3_1__0 ) )
                    // InternalServiceDefinition.g:4289:6: ( rule__EventPattern__Group_3_1__0 )
                    {
                     before(grammarAccess.getEventPatternAccess().getGroup_3_1()); 
                    // InternalServiceDefinition.g:4290:6: ( rule__EventPattern__Group_3_1__0 )
                    // InternalServiceDefinition.g:4290:7: rule__EventPattern__Group_3_1__0
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
                    // InternalServiceDefinition.g:4295:3: ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4295:3: ({...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) ) )
                    // InternalServiceDefinition.g:4296:4: {...}? => ( ( ( rule__EventPattern__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__EventPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalServiceDefinition.g:4296:108: ( ( ( rule__EventPattern__Group_3_2__0 ) ) )
                    // InternalServiceDefinition.g:4297:5: ( ( rule__EventPattern__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4303:5: ( ( rule__EventPattern__Group_3_2__0 ) )
                    // InternalServiceDefinition.g:4304:6: ( rule__EventPattern__Group_3_2__0 )
                    {
                     before(grammarAccess.getEventPatternAccess().getGroup_3_2()); 
                    // InternalServiceDefinition.g:4305:6: ( rule__EventPattern__Group_3_2__0 )
                    // InternalServiceDefinition.g:4305:7: rule__EventPattern__Group_3_2__0
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
    // InternalServiceDefinition.g:4318:1: rule__EventPattern__UnorderedGroup_3__0 : rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__1 )? ;
    public final void rule__EventPattern__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4322:1: ( rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__1 )? )
            // InternalServiceDefinition.g:4323:2: rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_44);
            rule__EventPattern__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4324:2: ( rule__EventPattern__UnorderedGroup_3__1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( LA30_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt30=1;
            }
            else if ( LA30_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt30=1;
            }
            else if ( LA30_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalServiceDefinition.g:4324:2: rule__EventPattern__UnorderedGroup_3__1
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
    // InternalServiceDefinition.g:4330:1: rule__EventPattern__UnorderedGroup_3__1 : rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__2 )? ;
    public final void rule__EventPattern__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4334:1: ( rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__2 )? )
            // InternalServiceDefinition.g:4335:2: rule__EventPattern__UnorderedGroup_3__Impl ( rule__EventPattern__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_44);
            rule__EventPattern__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4336:2: ( rule__EventPattern__UnorderedGroup_3__2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( LA31_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt31=1;
            }
            else if ( LA31_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt31=1;
            }
            else if ( LA31_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getEventPatternAccess().getUnorderedGroup_3(), 2) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalServiceDefinition.g:4336:2: rule__EventPattern__UnorderedGroup_3__2
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
    // InternalServiceDefinition.g:4342:1: rule__EventPattern__UnorderedGroup_3__2 : rule__EventPattern__UnorderedGroup_3__Impl ;
    public final void rule__EventPattern__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4346:1: ( rule__EventPattern__UnorderedGroup_3__Impl )
            // InternalServiceDefinition.g:4347:2: rule__EventPattern__UnorderedGroup_3__Impl
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
    // InternalServiceDefinition.g:4354:1: rule__QueryPattern__UnorderedGroup_3 : rule__QueryPattern__UnorderedGroup_3__0 {...}?;
    public final void rule__QueryPattern__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3());
        	
        try {
            // InternalServiceDefinition.g:4359:1: ( rule__QueryPattern__UnorderedGroup_3__0 {...}?)
            // InternalServiceDefinition.g:4360:2: rule__QueryPattern__UnorderedGroup_3__0 {...}?
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
    // InternalServiceDefinition.g:4368:1: rule__QueryPattern__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__QueryPattern__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalServiceDefinition.g:4373:1: ( ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) ) )
            // InternalServiceDefinition.g:4374:3: ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) )
            {
            // InternalServiceDefinition.g:4374:3: ( ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) ) )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalServiceDefinition.g:4375:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4375:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) ) )
                    // InternalServiceDefinition.g:4376:4: {...}? => ( ( ( rule__QueryPattern__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__QueryPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalServiceDefinition.g:4376:108: ( ( ( rule__QueryPattern__Group_3_0__0 ) ) )
                    // InternalServiceDefinition.g:4377:5: ( ( rule__QueryPattern__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4383:5: ( ( rule__QueryPattern__Group_3_0__0 ) )
                    // InternalServiceDefinition.g:4384:6: ( rule__QueryPattern__Group_3_0__0 )
                    {
                     before(grammarAccess.getQueryPatternAccess().getGroup_3_0()); 
                    // InternalServiceDefinition.g:4385:6: ( rule__QueryPattern__Group_3_0__0 )
                    // InternalServiceDefinition.g:4385:7: rule__QueryPattern__Group_3_0__0
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
                    // InternalServiceDefinition.g:4390:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) )
                    {
                    // InternalServiceDefinition.g:4390:3: ({...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) ) )
                    // InternalServiceDefinition.g:4391:4: {...}? => ( ( ( rule__QueryPattern__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__QueryPattern__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalServiceDefinition.g:4391:108: ( ( ( rule__QueryPattern__Group_3_1__0 ) ) )
                    // InternalServiceDefinition.g:4392:5: ( ( rule__QueryPattern__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalServiceDefinition.g:4398:5: ( ( rule__QueryPattern__Group_3_1__0 ) )
                    // InternalServiceDefinition.g:4399:6: ( rule__QueryPattern__Group_3_1__0 )
                    {
                     before(grammarAccess.getQueryPatternAccess().getGroup_3_1()); 
                    // InternalServiceDefinition.g:4400:6: ( rule__QueryPattern__Group_3_1__0 )
                    // InternalServiceDefinition.g:4400:7: rule__QueryPattern__Group_3_1__0
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
    // InternalServiceDefinition.g:4413:1: rule__QueryPattern__UnorderedGroup_3__0 : rule__QueryPattern__UnorderedGroup_3__Impl ( rule__QueryPattern__UnorderedGroup_3__1 )? ;
    public final void rule__QueryPattern__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4417:1: ( rule__QueryPattern__UnorderedGroup_3__Impl ( rule__QueryPattern__UnorderedGroup_3__1 )? )
            // InternalServiceDefinition.g:4418:2: rule__QueryPattern__UnorderedGroup_3__Impl ( rule__QueryPattern__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_45);
            rule__QueryPattern__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalServiceDefinition.g:4419:2: ( rule__QueryPattern__UnorderedGroup_3__1 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getQueryPatternAccess().getUnorderedGroup_3(), 1) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalServiceDefinition.g:4419:2: rule__QueryPattern__UnorderedGroup_3__1
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
    // InternalServiceDefinition.g:4425:1: rule__QueryPattern__UnorderedGroup_3__1 : rule__QueryPattern__UnorderedGroup_3__Impl ;
    public final void rule__QueryPattern__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4429:1: ( rule__QueryPattern__UnorderedGroup_3__Impl )
            // InternalServiceDefinition.g:4430:2: rule__QueryPattern__UnorderedGroup_3__Impl
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
    // InternalServiceDefinition.g:4437:1: rule__ServiceDefModel__ImportsAssignment_1 : ( ruleCommRepoImport ) ;
    public final void rule__ServiceDefModel__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4441:1: ( ( ruleCommRepoImport ) )
            // InternalServiceDefinition.g:4442:2: ( ruleCommRepoImport )
            {
            // InternalServiceDefinition.g:4442:2: ( ruleCommRepoImport )
            // InternalServiceDefinition.g:4443:3: ruleCommRepoImport
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
    // InternalServiceDefinition.g:4452:1: rule__ServiceDefModel__RepositoryAssignment_2 : ( ruleServiceDefRepository ) ;
    public final void rule__ServiceDefModel__RepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4456:1: ( ( ruleServiceDefRepository ) )
            // InternalServiceDefinition.g:4457:2: ( ruleServiceDefRepository )
            {
            // InternalServiceDefinition.g:4457:2: ( ruleServiceDefRepository )
            // InternalServiceDefinition.g:4458:3: ruleServiceDefRepository
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


    // $ANTLR start "rule__ServiceDefRepository__DocumentationAssignment_0"
    // InternalServiceDefinition.g:4467:1: rule__ServiceDefRepository__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__ServiceDefRepository__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4471:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalServiceDefinition.g:4472:2: ( RULE_DOCU_COMMENT )
            {
            // InternalServiceDefinition.g:4472:2: ( RULE_DOCU_COMMENT )
            // InternalServiceDefinition.g:4473:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getServiceDefRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__DocumentationAssignment_0"


    // $ANTLR start "rule__ServiceDefRepository__NameAssignment_2"
    // InternalServiceDefinition.g:4482:1: rule__ServiceDefRepository__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ServiceDefRepository__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4486:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4487:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4487:2: ( RULE_ID )
            // InternalServiceDefinition.g:4488:3: RULE_ID
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceDefRepositoryAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__NameAssignment_2"


    // $ANTLR start "rule__ServiceDefRepository__VersionAssignment_3_1"
    // InternalServiceDefinition.g:4497:1: rule__ServiceDefRepository__VersionAssignment_3_1 : ( ruleServiceRepoVersion ) ;
    public final void rule__ServiceDefRepository__VersionAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4501:1: ( ( ruleServiceRepoVersion ) )
            // InternalServiceDefinition.g:4502:2: ( ruleServiceRepoVersion )
            {
            // InternalServiceDefinition.g:4502:2: ( ruleServiceRepoVersion )
            // InternalServiceDefinition.g:4503:3: ruleServiceRepoVersion
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getVersionServiceRepoVersionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceRepoVersion();

            state._fsp--;

             after(grammarAccess.getServiceDefRepositoryAccess().getVersionServiceRepoVersionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__VersionAssignment_3_1"


    // $ANTLR start "rule__ServiceDefRepository__ServicesAssignment_5"
    // InternalServiceDefinition.g:4512:1: rule__ServiceDefRepository__ServicesAssignment_5 : ( ruleAbstractServiceDefinition ) ;
    public final void rule__ServiceDefRepository__ServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4516:1: ( ( ruleAbstractServiceDefinition ) )
            // InternalServiceDefinition.g:4517:2: ( ruleAbstractServiceDefinition )
            {
            // InternalServiceDefinition.g:4517:2: ( ruleAbstractServiceDefinition )
            // InternalServiceDefinition.g:4518:3: ruleAbstractServiceDefinition
            {
             before(grammarAccess.getServiceDefRepositoryAccess().getServicesAbstractServiceDefinitionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractServiceDefinition();

            state._fsp--;

             after(grammarAccess.getServiceDefRepositoryAccess().getServicesAbstractServiceDefinitionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceDefRepository__ServicesAssignment_5"


    // $ANTLR start "rule__ServiceRepoVersion__MajorAssignment_0"
    // InternalServiceDefinition.g:4527:1: rule__ServiceRepoVersion__MajorAssignment_0 : ( ruleEInt ) ;
    public final void rule__ServiceRepoVersion__MajorAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4531:1: ( ( ruleEInt ) )
            // InternalServiceDefinition.g:4532:2: ( ruleEInt )
            {
            // InternalServiceDefinition.g:4532:2: ( ruleEInt )
            // InternalServiceDefinition.g:4533:3: ruleEInt
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
    // InternalServiceDefinition.g:4542:1: rule__ServiceRepoVersion__MinorAssignment_2 : ( ruleEInt ) ;
    public final void rule__ServiceRepoVersion__MinorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4546:1: ( ( ruleEInt ) )
            // InternalServiceDefinition.g:4547:2: ( ruleEInt )
            {
            // InternalServiceDefinition.g:4547:2: ( ruleEInt )
            // InternalServiceDefinition.g:4548:3: ruleEInt
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
    // InternalServiceDefinition.g:4557:1: rule__ServiceRepoVersion__PatchAssignment_3_1 : ( ruleEInt ) ;
    public final void rule__ServiceRepoVersion__PatchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4561:1: ( ( ruleEInt ) )
            // InternalServiceDefinition.g:4562:2: ( ruleEInt )
            {
            // InternalServiceDefinition.g:4562:2: ( ruleEInt )
            // InternalServiceDefinition.g:4563:3: ruleEInt
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
    // InternalServiceDefinition.g:4572:1: rule__CommRepoImport__ImportedNamespaceAssignment_1 : ( ruleFQNW ) ;
    public final void rule__CommRepoImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4576:1: ( ( ruleFQNW ) )
            // InternalServiceDefinition.g:4577:2: ( ruleFQNW )
            {
            // InternalServiceDefinition.g:4577:2: ( ruleFQNW )
            // InternalServiceDefinition.g:4578:3: ruleFQNW
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


    // $ANTLR start "rule__ForkingServiceDefinition__DocumentationAssignment_0"
    // InternalServiceDefinition.g:4587:1: rule__ForkingServiceDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__ForkingServiceDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4591:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalServiceDefinition.g:4592:2: ( RULE_DOCU_COMMENT )
            {
            // InternalServiceDefinition.g:4592:2: ( RULE_DOCU_COMMENT )
            // InternalServiceDefinition.g:4593:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getForkingServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__DocumentationAssignment_0"


    // $ANTLR start "rule__ForkingServiceDefinition__NameAssignment_2"
    // InternalServiceDefinition.g:4602:1: rule__ForkingServiceDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ForkingServiceDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4606:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4607:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4607:2: ( RULE_ID )
            // InternalServiceDefinition.g:4608:3: RULE_ID
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getForkingServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__NameAssignment_2"


    // $ANTLR start "rule__ForkingServiceDefinition__PatternAssignment_4"
    // InternalServiceDefinition.g:4617:1: rule__ForkingServiceDefinition__PatternAssignment_4 : ( ruleForkingPatternInstance ) ;
    public final void rule__ForkingServiceDefinition__PatternAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4621:1: ( ( ruleForkingPatternInstance ) )
            // InternalServiceDefinition.g:4622:2: ( ruleForkingPatternInstance )
            {
            // InternalServiceDefinition.g:4622:2: ( ruleForkingPatternInstance )
            // InternalServiceDefinition.g:4623:3: ruleForkingPatternInstance
            {
             before(grammarAccess.getForkingServiceDefinitionAccess().getPatternForkingPatternInstanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleForkingPatternInstance();

            state._fsp--;

             after(grammarAccess.getForkingServiceDefinitionAccess().getPatternForkingPatternInstanceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ForkingServiceDefinition__PatternAssignment_4"


    // $ANTLR start "rule__ForkingServiceDefinition__PropertiesAssignment_5"
    // InternalServiceDefinition.g:4632:1: rule__ForkingServiceDefinition__PropertiesAssignment_5 : ( ruleServiceProperty ) ;
    public final void rule__ForkingServiceDefinition__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4636:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:4637:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:4637:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:4638:3: ruleServiceProperty
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


    // $ANTLR start "rule__JoyningServiceDefinition__DocumentationAssignment_0"
    // InternalServiceDefinition.g:4647:1: rule__JoyningServiceDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__JoyningServiceDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4651:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalServiceDefinition.g:4652:2: ( RULE_DOCU_COMMENT )
            {
            // InternalServiceDefinition.g:4652:2: ( RULE_DOCU_COMMENT )
            // InternalServiceDefinition.g:4653:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getJoyningServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__DocumentationAssignment_0"


    // $ANTLR start "rule__JoyningServiceDefinition__NameAssignment_2"
    // InternalServiceDefinition.g:4662:1: rule__JoyningServiceDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__JoyningServiceDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4666:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4667:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4667:2: ( RULE_ID )
            // InternalServiceDefinition.g:4668:3: RULE_ID
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJoyningServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__NameAssignment_2"


    // $ANTLR start "rule__JoyningServiceDefinition__PatternAssignment_4"
    // InternalServiceDefinition.g:4677:1: rule__JoyningServiceDefinition__PatternAssignment_4 : ( ruleJoiningPatternInstance ) ;
    public final void rule__JoyningServiceDefinition__PatternAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4681:1: ( ( ruleJoiningPatternInstance ) )
            // InternalServiceDefinition.g:4682:2: ( ruleJoiningPatternInstance )
            {
            // InternalServiceDefinition.g:4682:2: ( ruleJoiningPatternInstance )
            // InternalServiceDefinition.g:4683:3: ruleJoiningPatternInstance
            {
             before(grammarAccess.getJoyningServiceDefinitionAccess().getPatternJoiningPatternInstanceParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleJoiningPatternInstance();

            state._fsp--;

             after(grammarAccess.getJoyningServiceDefinitionAccess().getPatternJoiningPatternInstanceParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JoyningServiceDefinition__PatternAssignment_4"


    // $ANTLR start "rule__JoyningServiceDefinition__PropertiesAssignment_5"
    // InternalServiceDefinition.g:4692:1: rule__JoyningServiceDefinition__PropertiesAssignment_5 : ( ruleServiceProperty ) ;
    public final void rule__JoyningServiceDefinition__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4696:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:4697:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:4697:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:4698:3: ruleServiceProperty
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


    // $ANTLR start "rule__RequestAnswerServiceDefinition__DocumentationAssignment_0"
    // InternalServiceDefinition.g:4707:1: rule__RequestAnswerServiceDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__RequestAnswerServiceDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4711:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalServiceDefinition.g:4712:2: ( RULE_DOCU_COMMENT )
            {
            // InternalServiceDefinition.g:4712:2: ( RULE_DOCU_COMMENT )
            // InternalServiceDefinition.g:4713:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__DocumentationAssignment_0"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__NameAssignment_2"
    // InternalServiceDefinition.g:4722:1: rule__RequestAnswerServiceDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RequestAnswerServiceDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4726:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4727:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4727:2: ( RULE_ID )
            // InternalServiceDefinition.g:4728:3: RULE_ID
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__NameAssignment_2"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__PatternAssignment_4"
    // InternalServiceDefinition.g:4737:1: rule__RequestAnswerServiceDefinition__PatternAssignment_4 : ( ruleRequestAnswerPattern ) ;
    public final void rule__RequestAnswerServiceDefinition__PatternAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4741:1: ( ( ruleRequestAnswerPattern ) )
            // InternalServiceDefinition.g:4742:2: ( ruleRequestAnswerPattern )
            {
            // InternalServiceDefinition.g:4742:2: ( ruleRequestAnswerPattern )
            // InternalServiceDefinition.g:4743:3: ruleRequestAnswerPattern
            {
             before(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternRequestAnswerPatternParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleRequestAnswerPattern();

            state._fsp--;

             after(grammarAccess.getRequestAnswerServiceDefinitionAccess().getPatternRequestAnswerPatternParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestAnswerServiceDefinition__PatternAssignment_4"


    // $ANTLR start "rule__RequestAnswerServiceDefinition__PropertiesAssignment_5"
    // InternalServiceDefinition.g:4752:1: rule__RequestAnswerServiceDefinition__PropertiesAssignment_5 : ( ruleServiceProperty ) ;
    public final void rule__RequestAnswerServiceDefinition__PropertiesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4756:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:4757:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:4757:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:4758:3: ruleServiceProperty
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


    // $ANTLR start "rule__CoordinationServiceDefinition__DocumentationAssignment_0"
    // InternalServiceDefinition.g:4767:1: rule__CoordinationServiceDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__CoordinationServiceDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4771:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalServiceDefinition.g:4772:2: ( RULE_DOCU_COMMENT )
            {
            // InternalServiceDefinition.g:4772:2: ( RULE_DOCU_COMMENT )
            // InternalServiceDefinition.g:4773:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getCoordinationServiceDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__DocumentationAssignment_0"


    // $ANTLR start "rule__CoordinationServiceDefinition__NameAssignment_2"
    // InternalServiceDefinition.g:4782:1: rule__CoordinationServiceDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CoordinationServiceDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4786:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4787:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4787:2: ( RULE_ID )
            // InternalServiceDefinition.g:4788:3: RULE_ID
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoordinationServiceDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__NameAssignment_2"


    // $ANTLR start "rule__CoordinationServiceDefinition__StatePatternAssignment_4_0"
    // InternalServiceDefinition.g:4797:1: rule__CoordinationServiceDefinition__StatePatternAssignment_4_0 : ( ruleStatePattern ) ;
    public final void rule__CoordinationServiceDefinition__StatePatternAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4801:1: ( ( ruleStatePattern ) )
            // InternalServiceDefinition.g:4802:2: ( ruleStatePattern )
            {
            // InternalServiceDefinition.g:4802:2: ( ruleStatePattern )
            // InternalServiceDefinition.g:4803:3: ruleStatePattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternStatePatternParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleStatePattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getStatePatternStatePatternParserRuleCall_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__StatePatternAssignment_4_0"


    // $ANTLR start "rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1"
    // InternalServiceDefinition.g:4812:1: rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1 : ( ruleParameterPattern ) ;
    public final void rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4816:1: ( ( ruleParameterPattern ) )
            // InternalServiceDefinition.g:4817:2: ( ruleParameterPattern )
            {
            // InternalServiceDefinition.g:4817:2: ( ruleParameterPattern )
            // InternalServiceDefinition.g:4818:3: ruleParameterPattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternParameterPatternParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterPattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getParameterPatternParameterPatternParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__ParameterPatternAssignment_4_1"


    // $ANTLR start "rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2"
    // InternalServiceDefinition.g:4827:1: rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2 : ( ruleMonitoringPattern ) ;
    public final void rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4831:1: ( ( ruleMonitoringPattern ) )
            // InternalServiceDefinition.g:4832:2: ( ruleMonitoringPattern )
            {
            // InternalServiceDefinition.g:4832:2: ( ruleMonitoringPattern )
            // InternalServiceDefinition.g:4833:3: ruleMonitoringPattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternMonitoringPatternParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMonitoringPattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getMonitoringPatternMonitoringPatternParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__MonitoringPatternAssignment_4_2"


    // $ANTLR start "rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3"
    // InternalServiceDefinition.g:4842:1: rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3 : ( ruleDynamicWiringPattern ) ;
    public final void rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4846:1: ( ( ruleDynamicWiringPattern ) )
            // InternalServiceDefinition.g:4847:2: ( ruleDynamicWiringPattern )
            {
            // InternalServiceDefinition.g:4847:2: ( ruleDynamicWiringPattern )
            // InternalServiceDefinition.g:4848:3: ruleDynamicWiringPattern
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternDynamicWiringPatternParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDynamicWiringPattern();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getWiringPatternDynamicWiringPatternParserRuleCall_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__WiringPatternAssignment_4_3"


    // $ANTLR start "rule__CoordinationServiceDefinition__ServicesAssignment_5"
    // InternalServiceDefinition.g:4857:1: rule__CoordinationServiceDefinition__ServicesAssignment_5 : ( ruleCommunicationServiceUsage ) ;
    public final void rule__CoordinationServiceDefinition__ServicesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4861:1: ( ( ruleCommunicationServiceUsage ) )
            // InternalServiceDefinition.g:4862:2: ( ruleCommunicationServiceUsage )
            {
            // InternalServiceDefinition.g:4862:2: ( ruleCommunicationServiceUsage )
            // InternalServiceDefinition.g:4863:3: ruleCommunicationServiceUsage
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesCommunicationServiceUsageParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleCommunicationServiceUsage();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getServicesCommunicationServiceUsageParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__ServicesAssignment_5"


    // $ANTLR start "rule__CoordinationServiceDefinition__PropertiesAssignment_6"
    // InternalServiceDefinition.g:4872:1: rule__CoordinationServiceDefinition__PropertiesAssignment_6 : ( ruleServiceProperty ) ;
    public final void rule__CoordinationServiceDefinition__PropertiesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4876:1: ( ( ruleServiceProperty ) )
            // InternalServiceDefinition.g:4877:2: ( ruleServiceProperty )
            {
            // InternalServiceDefinition.g:4877:2: ( ruleServiceProperty )
            // InternalServiceDefinition.g:4878:3: ruleServiceProperty
            {
             before(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceProperty();

            state._fsp--;

             after(grammarAccess.getCoordinationServiceDefinitionAccess().getPropertiesServicePropertyParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationServiceDefinition__PropertiesAssignment_6"


    // $ANTLR start "rule__CommunicationServiceUsage__NameAssignment_1"
    // InternalServiceDefinition.g:4887:1: rule__CommunicationServiceUsage__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CommunicationServiceUsage__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4891:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:4892:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:4892:2: ( RULE_ID )
            // InternalServiceDefinition.g:4893:3: RULE_ID
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
    // InternalServiceDefinition.g:4902:1: rule__CommunicationServiceUsage__UsesAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CommunicationServiceUsage__UsesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4906:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4907:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4907:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4908:3: ( ruleFQN )
            {
             before(grammarAccess.getCommunicationServiceUsageAccess().getUsesCommunicationServiceDefinitionCrossReference_3_0()); 
            // InternalServiceDefinition.g:4909:3: ( ruleFQN )
            // InternalServiceDefinition.g:4910:4: ruleFQN
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
    // InternalServiceDefinition.g:4921:1: rule__StatePattern__LifecycleAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__StatePattern__LifecycleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4925:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4926:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4926:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4927:3: ( ruleFQN )
            {
             before(grammarAccess.getStatePatternAccess().getLifecycleStateMachineCrossReference_4_0()); 
            // InternalServiceDefinition.g:4928:3: ( ruleFQN )
            // InternalServiceDefinition.g:4929:4: ruleFQN
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
    // InternalServiceDefinition.g:4940:1: rule__StatePattern__ModesAssignment_5_1 : ( ( ruleFQN ) ) ;
    public final void rule__StatePattern__ModesAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4944:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4945:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4945:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4946:3: ( ruleFQN )
            {
             before(grammarAccess.getStatePatternAccess().getModesComponentModeCollectionCrossReference_5_1_0()); 
            // InternalServiceDefinition.g:4947:3: ( ruleFQN )
            // InternalServiceDefinition.g:4948:4: ruleFQN
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
    // InternalServiceDefinition.g:4959:1: rule__ParameterPattern__ParameterSetAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterPattern__ParameterSetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4963:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4964:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4964:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4965:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterPatternAccess().getParameterSetParameterSetDefinitionCrossReference_3_0()); 
            // InternalServiceDefinition.g:4966:3: ( ruleFQN )
            // InternalServiceDefinition.g:4967:4: ruleFQN
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
    // InternalServiceDefinition.g:4978:1: rule__PushPattern__DataTypeAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__PushPattern__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:4982:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:4983:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:4983:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:4984:3: ( ruleFQN )
            {
             before(grammarAccess.getPushPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); 
            // InternalServiceDefinition.g:4985:3: ( ruleFQN )
            // InternalServiceDefinition.g:4986:4: ruleFQN
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
    // InternalServiceDefinition.g:4997:1: rule__EventPattern__EventTypeAssignment_3_0_2 : ( ( ruleFQN ) ) ;
    public final void rule__EventPattern__EventTypeAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5001:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5002:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5002:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5003:3: ( ruleFQN )
            {
             before(grammarAccess.getEventPatternAccess().getEventTypeCommunicationObjectCrossReference_3_0_2_0()); 
            // InternalServiceDefinition.g:5004:3: ( ruleFQN )
            // InternalServiceDefinition.g:5005:4: ruleFQN
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
    // InternalServiceDefinition.g:5016:1: rule__EventPattern__ActivationTypeAssignment_3_1_2 : ( ( ruleFQN ) ) ;
    public final void rule__EventPattern__ActivationTypeAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5020:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5021:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5021:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5022:3: ( ruleFQN )
            {
             before(grammarAccess.getEventPatternAccess().getActivationTypeCommunicationObjectCrossReference_3_1_2_0()); 
            // InternalServiceDefinition.g:5023:3: ( ruleFQN )
            // InternalServiceDefinition.g:5024:4: ruleFQN
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
    // InternalServiceDefinition.g:5035:1: rule__EventPattern__EventStateTypeAssignment_3_2_2 : ( ( ruleFQN ) ) ;
    public final void rule__EventPattern__EventStateTypeAssignment_3_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5039:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5040:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5040:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5041:3: ( ruleFQN )
            {
             before(grammarAccess.getEventPatternAccess().getEventStateTypeCommunicationObjectCrossReference_3_2_2_0()); 
            // InternalServiceDefinition.g:5042:3: ( ruleFQN )
            // InternalServiceDefinition.g:5043:4: ruleFQN
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
    // InternalServiceDefinition.g:5054:1: rule__QueryPattern__RequestTypeAssignment_3_0_2 : ( ( ruleFQN ) ) ;
    public final void rule__QueryPattern__RequestTypeAssignment_3_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5058:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5059:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5059:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5060:3: ( ruleFQN )
            {
             before(grammarAccess.getQueryPatternAccess().getRequestTypeCommunicationObjectCrossReference_3_0_2_0()); 
            // InternalServiceDefinition.g:5061:3: ( ruleFQN )
            // InternalServiceDefinition.g:5062:4: ruleFQN
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
    // InternalServiceDefinition.g:5073:1: rule__QueryPattern__AnswerTypeAssignment_3_1_2 : ( ( ruleFQN ) ) ;
    public final void rule__QueryPattern__AnswerTypeAssignment_3_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5077:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5078:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5078:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5079:3: ( ruleFQN )
            {
             before(grammarAccess.getQueryPatternAccess().getAnswerTypeCommunicationObjectCrossReference_3_1_2_0()); 
            // InternalServiceDefinition.g:5080:3: ( ruleFQN )
            // InternalServiceDefinition.g:5081:4: ruleFQN
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
    // InternalServiceDefinition.g:5092:1: rule__SendPattern__DataTypeAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__SendPattern__DataTypeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5096:1: ( ( ( ruleFQN ) ) )
            // InternalServiceDefinition.g:5097:2: ( ( ruleFQN ) )
            {
            // InternalServiceDefinition.g:5097:2: ( ( ruleFQN ) )
            // InternalServiceDefinition.g:5098:3: ( ruleFQN )
            {
             before(grammarAccess.getSendPatternAccess().getDataTypeCommunicationObjectCrossReference_5_0()); 
            // InternalServiceDefinition.g:5099:3: ( ruleFQN )
            // InternalServiceDefinition.g:5100:4: ruleFQN
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
    // InternalServiceDefinition.g:5111:1: rule__ServiceProperty__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ServiceProperty__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalServiceDefinition.g:5115:1: ( ( RULE_ID ) )
            // InternalServiceDefinition.g:5116:2: ( RULE_ID )
            {
            // InternalServiceDefinition.g:5116:2: ( RULE_ID )
            // InternalServiceDefinition.g:5117:3: RULE_ID
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000220040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000007880040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000007800042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001000000080000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000003800040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000007800040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001C20000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001000008080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000001C20000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000600000000002L});

}
