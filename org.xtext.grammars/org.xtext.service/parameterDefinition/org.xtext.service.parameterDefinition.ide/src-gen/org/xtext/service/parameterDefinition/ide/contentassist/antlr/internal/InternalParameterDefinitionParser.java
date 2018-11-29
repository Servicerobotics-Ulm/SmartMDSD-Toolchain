package org.xtext.service.parameterDefinition.ide.contentassist.antlr.internal;

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
import org.xtext.service.parameterDefinition.services.ParameterDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalParameterDefinitionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'*'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'", "'.*'", "'#import'", "';'", "'ParameterSetRepository'", "'{'", "'}'", "'ParameterSet'", "'extends'", "','", "'Parameter'", "'Trigger'", "':'", "'='", "'.'", "'-'", "'InlineEnumeration'", "'['", "']'"
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
    public static final int RULE_ID=6;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalParameterDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalParameterDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalParameterDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalParameterDefinition.g"; }


    	private ParameterDefinitionGrammarAccess grammarAccess;

    	public void setGrammarAccess(ParameterDefinitionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleParamDefModel"
    // InternalParameterDefinition.g:94:1: entryRuleParamDefModel : ruleParamDefModel EOF ;
    public final void entryRuleParamDefModel() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:95:1: ( ruleParamDefModel EOF )
            // InternalParameterDefinition.g:96:1: ruleParamDefModel EOF
            {
             before(grammarAccess.getParamDefModelRule()); 
            pushFollow(FOLLOW_1);
            ruleParamDefModel();

            state._fsp--;

             after(grammarAccess.getParamDefModelRule()); 
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
    // $ANTLR end "entryRuleParamDefModel"


    // $ANTLR start "ruleParamDefModel"
    // InternalParameterDefinition.g:103:1: ruleParamDefModel : ( ( rule__ParamDefModel__Group__0 ) ) ;
    public final void ruleParamDefModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:107:2: ( ( ( rule__ParamDefModel__Group__0 ) ) )
            // InternalParameterDefinition.g:108:2: ( ( rule__ParamDefModel__Group__0 ) )
            {
            // InternalParameterDefinition.g:108:2: ( ( rule__ParamDefModel__Group__0 ) )
            // InternalParameterDefinition.g:109:3: ( rule__ParamDefModel__Group__0 )
            {
             before(grammarAccess.getParamDefModelAccess().getGroup()); 
            // InternalParameterDefinition.g:110:3: ( rule__ParamDefModel__Group__0 )
            // InternalParameterDefinition.g:110:4: rule__ParamDefModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamDefModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamDefModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamDefModel"


    // $ANTLR start "entryRuleFQNW"
    // InternalParameterDefinition.g:119:1: entryRuleFQNW : ruleFQNW EOF ;
    public final void entryRuleFQNW() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:120:1: ( ruleFQNW EOF )
            // InternalParameterDefinition.g:121:1: ruleFQNW EOF
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
    // InternalParameterDefinition.g:128:1: ruleFQNW : ( ( rule__FQNW__Group__0 ) ) ;
    public final void ruleFQNW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:132:2: ( ( ( rule__FQNW__Group__0 ) ) )
            // InternalParameterDefinition.g:133:2: ( ( rule__FQNW__Group__0 ) )
            {
            // InternalParameterDefinition.g:133:2: ( ( rule__FQNW__Group__0 ) )
            // InternalParameterDefinition.g:134:3: ( rule__FQNW__Group__0 )
            {
             before(grammarAccess.getFQNWAccess().getGroup()); 
            // InternalParameterDefinition.g:135:3: ( rule__FQNW__Group__0 )
            // InternalParameterDefinition.g:135:4: rule__FQNW__Group__0
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


    // $ANTLR start "entryRuleParamDefRepoImport"
    // InternalParameterDefinition.g:144:1: entryRuleParamDefRepoImport : ruleParamDefRepoImport EOF ;
    public final void entryRuleParamDefRepoImport() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:145:1: ( ruleParamDefRepoImport EOF )
            // InternalParameterDefinition.g:146:1: ruleParamDefRepoImport EOF
            {
             before(grammarAccess.getParamDefRepoImportRule()); 
            pushFollow(FOLLOW_1);
            ruleParamDefRepoImport();

            state._fsp--;

             after(grammarAccess.getParamDefRepoImportRule()); 
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
    // $ANTLR end "entryRuleParamDefRepoImport"


    // $ANTLR start "ruleParamDefRepoImport"
    // InternalParameterDefinition.g:153:1: ruleParamDefRepoImport : ( ( rule__ParamDefRepoImport__Group__0 ) ) ;
    public final void ruleParamDefRepoImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:157:2: ( ( ( rule__ParamDefRepoImport__Group__0 ) ) )
            // InternalParameterDefinition.g:158:2: ( ( rule__ParamDefRepoImport__Group__0 ) )
            {
            // InternalParameterDefinition.g:158:2: ( ( rule__ParamDefRepoImport__Group__0 ) )
            // InternalParameterDefinition.g:159:3: ( rule__ParamDefRepoImport__Group__0 )
            {
             before(grammarAccess.getParamDefRepoImportAccess().getGroup()); 
            // InternalParameterDefinition.g:160:3: ( rule__ParamDefRepoImport__Group__0 )
            // InternalParameterDefinition.g:160:4: rule__ParamDefRepoImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParamDefRepoImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParamDefRepoImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParamDefRepoImport"


    // $ANTLR start "entryRuleParameterSetRepository"
    // InternalParameterDefinition.g:169:1: entryRuleParameterSetRepository : ruleParameterSetRepository EOF ;
    public final void entryRuleParameterSetRepository() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:170:1: ( ruleParameterSetRepository EOF )
            // InternalParameterDefinition.g:171:1: ruleParameterSetRepository EOF
            {
             before(grammarAccess.getParameterSetRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterSetRepository();

            state._fsp--;

             after(grammarAccess.getParameterSetRepositoryRule()); 
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
    // $ANTLR end "entryRuleParameterSetRepository"


    // $ANTLR start "ruleParameterSetRepository"
    // InternalParameterDefinition.g:178:1: ruleParameterSetRepository : ( ( rule__ParameterSetRepository__Group__0 ) ) ;
    public final void ruleParameterSetRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:182:2: ( ( ( rule__ParameterSetRepository__Group__0 ) ) )
            // InternalParameterDefinition.g:183:2: ( ( rule__ParameterSetRepository__Group__0 ) )
            {
            // InternalParameterDefinition.g:183:2: ( ( rule__ParameterSetRepository__Group__0 ) )
            // InternalParameterDefinition.g:184:3: ( rule__ParameterSetRepository__Group__0 )
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getGroup()); 
            // InternalParameterDefinition.g:185:3: ( rule__ParameterSetRepository__Group__0 )
            // InternalParameterDefinition.g:185:4: rule__ParameterSetRepository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterSetRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterSetRepository"


    // $ANTLR start "entryRuleParameterSetDefinition"
    // InternalParameterDefinition.g:194:1: entryRuleParameterSetDefinition : ruleParameterSetDefinition EOF ;
    public final void entryRuleParameterSetDefinition() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:195:1: ( ruleParameterSetDefinition EOF )
            // InternalParameterDefinition.g:196:1: ruleParameterSetDefinition EOF
            {
             before(grammarAccess.getParameterSetDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterSetDefinition();

            state._fsp--;

             after(grammarAccess.getParameterSetDefinitionRule()); 
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
    // $ANTLR end "entryRuleParameterSetDefinition"


    // $ANTLR start "ruleParameterSetDefinition"
    // InternalParameterDefinition.g:203:1: ruleParameterSetDefinition : ( ( rule__ParameterSetDefinition__Group__0 ) ) ;
    public final void ruleParameterSetDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:207:2: ( ( ( rule__ParameterSetDefinition__Group__0 ) ) )
            // InternalParameterDefinition.g:208:2: ( ( rule__ParameterSetDefinition__Group__0 ) )
            {
            // InternalParameterDefinition.g:208:2: ( ( rule__ParameterSetDefinition__Group__0 ) )
            // InternalParameterDefinition.g:209:3: ( rule__ParameterSetDefinition__Group__0 )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getGroup()); 
            // InternalParameterDefinition.g:210:3: ( rule__ParameterSetDefinition__Group__0 )
            // InternalParameterDefinition.g:210:4: rule__ParameterSetDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterSetDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterSetDefinition"


    // $ANTLR start "entryRuleAbstractParameter"
    // InternalParameterDefinition.g:219:1: entryRuleAbstractParameter : ruleAbstractParameter EOF ;
    public final void entryRuleAbstractParameter() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:220:1: ( ruleAbstractParameter EOF )
            // InternalParameterDefinition.g:221:1: ruleAbstractParameter EOF
            {
             before(grammarAccess.getAbstractParameterRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractParameter();

            state._fsp--;

             after(grammarAccess.getAbstractParameterRule()); 
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
    // $ANTLR end "entryRuleAbstractParameter"


    // $ANTLR start "ruleAbstractParameter"
    // InternalParameterDefinition.g:228:1: ruleAbstractParameter : ( ( rule__AbstractParameter__Alternatives ) ) ;
    public final void ruleAbstractParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:232:2: ( ( ( rule__AbstractParameter__Alternatives ) ) )
            // InternalParameterDefinition.g:233:2: ( ( rule__AbstractParameter__Alternatives ) )
            {
            // InternalParameterDefinition.g:233:2: ( ( rule__AbstractParameter__Alternatives ) )
            // InternalParameterDefinition.g:234:3: ( rule__AbstractParameter__Alternatives )
            {
             before(grammarAccess.getAbstractParameterAccess().getAlternatives()); 
            // InternalParameterDefinition.g:235:3: ( rule__AbstractParameter__Alternatives )
            // InternalParameterDefinition.g:235:4: rule__AbstractParameter__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractParameter__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractParameterAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractParameter"


    // $ANTLR start "entryRuleParameterDefinition"
    // InternalParameterDefinition.g:244:1: entryRuleParameterDefinition : ruleParameterDefinition EOF ;
    public final void entryRuleParameterDefinition() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:245:1: ( ruleParameterDefinition EOF )
            // InternalParameterDefinition.g:246:1: ruleParameterDefinition EOF
            {
             before(grammarAccess.getParameterDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterDefinition();

            state._fsp--;

             after(grammarAccess.getParameterDefinitionRule()); 
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
    // $ANTLR end "entryRuleParameterDefinition"


    // $ANTLR start "ruleParameterDefinition"
    // InternalParameterDefinition.g:253:1: ruleParameterDefinition : ( ( rule__ParameterDefinition__Group__0 ) ) ;
    public final void ruleParameterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:257:2: ( ( ( rule__ParameterDefinition__Group__0 ) ) )
            // InternalParameterDefinition.g:258:2: ( ( rule__ParameterDefinition__Group__0 ) )
            {
            // InternalParameterDefinition.g:258:2: ( ( rule__ParameterDefinition__Group__0 ) )
            // InternalParameterDefinition.g:259:3: ( rule__ParameterDefinition__Group__0 )
            {
             before(grammarAccess.getParameterDefinitionAccess().getGroup()); 
            // InternalParameterDefinition.g:260:3: ( rule__ParameterDefinition__Group__0 )
            // InternalParameterDefinition.g:260:4: rule__ParameterDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDefinition"


    // $ANTLR start "entryRuleTriggerDefinition"
    // InternalParameterDefinition.g:269:1: entryRuleTriggerDefinition : ruleTriggerDefinition EOF ;
    public final void entryRuleTriggerDefinition() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:270:1: ( ruleTriggerDefinition EOF )
            // InternalParameterDefinition.g:271:1: ruleTriggerDefinition EOF
            {
             before(grammarAccess.getTriggerDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTriggerDefinition();

            state._fsp--;

             after(grammarAccess.getTriggerDefinitionRule()); 
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
    // $ANTLR end "entryRuleTriggerDefinition"


    // $ANTLR start "ruleTriggerDefinition"
    // InternalParameterDefinition.g:278:1: ruleTriggerDefinition : ( ( rule__TriggerDefinition__Group__0 ) ) ;
    public final void ruleTriggerDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:282:2: ( ( ( rule__TriggerDefinition__Group__0 ) ) )
            // InternalParameterDefinition.g:283:2: ( ( rule__TriggerDefinition__Group__0 ) )
            {
            // InternalParameterDefinition.g:283:2: ( ( rule__TriggerDefinition__Group__0 ) )
            // InternalParameterDefinition.g:284:3: ( rule__TriggerDefinition__Group__0 )
            {
             before(grammarAccess.getTriggerDefinitionAccess().getGroup()); 
            // InternalParameterDefinition.g:285:3: ( rule__TriggerDefinition__Group__0 )
            // InternalParameterDefinition.g:285:4: rule__TriggerDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TriggerDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriggerDefinition"


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalParameterDefinition.g:294:1: entryRuleAttributeDefinition : ruleAttributeDefinition EOF ;
    public final void entryRuleAttributeDefinition() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:295:1: ( ruleAttributeDefinition EOF )
            // InternalParameterDefinition.g:296:1: ruleAttributeDefinition EOF
            {
             before(grammarAccess.getAttributeDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionRule()); 
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
    // $ANTLR end "entryRuleAttributeDefinition"


    // $ANTLR start "ruleAttributeDefinition"
    // InternalParameterDefinition.g:303:1: ruleAttributeDefinition : ( ( rule__AttributeDefinition__Group__0 ) ) ;
    public final void ruleAttributeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:307:2: ( ( ( rule__AttributeDefinition__Group__0 ) ) )
            // InternalParameterDefinition.g:308:2: ( ( rule__AttributeDefinition__Group__0 ) )
            {
            // InternalParameterDefinition.g:308:2: ( ( rule__AttributeDefinition__Group__0 ) )
            // InternalParameterDefinition.g:309:3: ( rule__AttributeDefinition__Group__0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            // InternalParameterDefinition.g:310:3: ( rule__AttributeDefinition__Group__0 )
            // InternalParameterDefinition.g:310:4: rule__AttributeDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeDefinition"


    // $ANTLR start "entryRuleFQN"
    // InternalParameterDefinition.g:319:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:320:1: ( ruleFQN EOF )
            // InternalParameterDefinition.g:321:1: ruleFQN EOF
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
    // InternalParameterDefinition.g:328:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:332:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalParameterDefinition.g:333:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalParameterDefinition.g:333:2: ( ( rule__FQN__Group__0 ) )
            // InternalParameterDefinition.g:334:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalParameterDefinition.g:335:3: ( rule__FQN__Group__0 )
            // InternalParameterDefinition.g:335:4: rule__FQN__Group__0
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalParameterDefinition.g:344:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:345:1: ( ruleEBoolean EOF )
            // InternalParameterDefinition.g:346:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
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
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalParameterDefinition.g:353:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:357:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalParameterDefinition.g:358:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalParameterDefinition.g:358:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalParameterDefinition.g:359:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalParameterDefinition.g:360:3: ( rule__EBoolean__Alternatives )
            // InternalParameterDefinition.g:360:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEString"
    // InternalParameterDefinition.g:369:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:370:1: ( ruleEString EOF )
            // InternalParameterDefinition.g:371:1: ruleEString EOF
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
    // InternalParameterDefinition.g:378:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:382:2: ( ( RULE_STRING ) )
            // InternalParameterDefinition.g:383:2: ( RULE_STRING )
            {
            // InternalParameterDefinition.g:383:2: ( RULE_STRING )
            // InternalParameterDefinition.g:384:3: RULE_STRING
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


    // $ANTLR start "entryRuleEInt"
    // InternalParameterDefinition.g:394:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:395:1: ( ruleEInt EOF )
            // InternalParameterDefinition.g:396:1: ruleEInt EOF
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
    // InternalParameterDefinition.g:403:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:407:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalParameterDefinition.g:408:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalParameterDefinition.g:408:2: ( ( rule__EInt__Group__0 ) )
            // InternalParameterDefinition.g:409:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalParameterDefinition.g:410:3: ( rule__EInt__Group__0 )
            // InternalParameterDefinition.g:410:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleEDouble"
    // InternalParameterDefinition.g:419:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:420:1: ( ruleEDouble EOF )
            // InternalParameterDefinition.g:421:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
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
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalParameterDefinition.g:428:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:432:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalParameterDefinition.g:433:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalParameterDefinition.g:433:2: ( ( rule__EDouble__Group__0 ) )
            // InternalParameterDefinition.g:434:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalParameterDefinition.g:435:3: ( rule__EDouble__Group__0 )
            // InternalParameterDefinition.g:435:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleEnumerationElement"
    // InternalParameterDefinition.g:444:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:445:1: ( ruleEnumerationElement EOF )
            // InternalParameterDefinition.g:446:1: ruleEnumerationElement EOF
            {
             before(grammarAccess.getEnumerationElementRule()); 
            pushFollow(FOLLOW_1);
            ruleEnumerationElement();

            state._fsp--;

             after(grammarAccess.getEnumerationElementRule()); 
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
    // $ANTLR end "entryRuleEnumerationElement"


    // $ANTLR start "ruleEnumerationElement"
    // InternalParameterDefinition.g:453:1: ruleEnumerationElement : ( ( rule__EnumerationElement__Group__0 ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:457:2: ( ( ( rule__EnumerationElement__Group__0 ) ) )
            // InternalParameterDefinition.g:458:2: ( ( rule__EnumerationElement__Group__0 ) )
            {
            // InternalParameterDefinition.g:458:2: ( ( rule__EnumerationElement__Group__0 ) )
            // InternalParameterDefinition.g:459:3: ( rule__EnumerationElement__Group__0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup()); 
            // InternalParameterDefinition.g:460:3: ( rule__EnumerationElement__Group__0 )
            // InternalParameterDefinition.g:460:4: rule__EnumerationElement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEnumerationElement"


    // $ANTLR start "entryRuleAbstractAttributeType"
    // InternalParameterDefinition.g:469:1: entryRuleAbstractAttributeType : ruleAbstractAttributeType EOF ;
    public final void entryRuleAbstractAttributeType() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:470:1: ( ruleAbstractAttributeType EOF )
            // InternalParameterDefinition.g:471:1: ruleAbstractAttributeType EOF
            {
             before(grammarAccess.getAbstractAttributeTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractAttributeType();

            state._fsp--;

             after(grammarAccess.getAbstractAttributeTypeRule()); 
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
    // $ANTLR end "entryRuleAbstractAttributeType"


    // $ANTLR start "ruleAbstractAttributeType"
    // InternalParameterDefinition.g:478:1: ruleAbstractAttributeType : ( ( rule__AbstractAttributeType__Alternatives ) ) ;
    public final void ruleAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:482:2: ( ( ( rule__AbstractAttributeType__Alternatives ) ) )
            // InternalParameterDefinition.g:483:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            {
            // InternalParameterDefinition.g:483:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            // InternalParameterDefinition.g:484:3: ( rule__AbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalParameterDefinition.g:485:3: ( rule__AbstractAttributeType__Alternatives )
            // InternalParameterDefinition.g:485:4: rule__AbstractAttributeType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractAttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractAttributeType"


    // $ANTLR start "entryRuleInlineEnumerationType"
    // InternalParameterDefinition.g:494:1: entryRuleInlineEnumerationType : ruleInlineEnumerationType EOF ;
    public final void entryRuleInlineEnumerationType() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:495:1: ( ruleInlineEnumerationType EOF )
            // InternalParameterDefinition.g:496:1: ruleInlineEnumerationType EOF
            {
             before(grammarAccess.getInlineEnumerationTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleInlineEnumerationType();

            state._fsp--;

             after(grammarAccess.getInlineEnumerationTypeRule()); 
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
    // $ANTLR end "entryRuleInlineEnumerationType"


    // $ANTLR start "ruleInlineEnumerationType"
    // InternalParameterDefinition.g:503:1: ruleInlineEnumerationType : ( ( rule__InlineEnumerationType__Group__0 ) ) ;
    public final void ruleInlineEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:507:2: ( ( ( rule__InlineEnumerationType__Group__0 ) ) )
            // InternalParameterDefinition.g:508:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            {
            // InternalParameterDefinition.g:508:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            // InternalParameterDefinition.g:509:3: ( rule__InlineEnumerationType__Group__0 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 
            // InternalParameterDefinition.g:510:3: ( rule__InlineEnumerationType__Group__0 )
            // InternalParameterDefinition.g:510:4: rule__InlineEnumerationType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InlineEnumerationType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInlineEnumerationType"


    // $ANTLR start "entryRuleArrayType"
    // InternalParameterDefinition.g:519:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:520:1: ( ruleArrayType EOF )
            // InternalParameterDefinition.g:521:1: ruleArrayType EOF
            {
             before(grammarAccess.getArrayTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getArrayTypeRule()); 
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
    // $ANTLR end "entryRuleArrayType"


    // $ANTLR start "ruleArrayType"
    // InternalParameterDefinition.g:528:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:532:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalParameterDefinition.g:533:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalParameterDefinition.g:533:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalParameterDefinition.g:534:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalParameterDefinition.g:535:3: ( rule__ArrayType__Group__0 )
            // InternalParameterDefinition.g:535:4: rule__ArrayType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayType"


    // $ANTLR start "entryRuleCardinality"
    // InternalParameterDefinition.g:544:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:545:1: ( ruleCardinality EOF )
            // InternalParameterDefinition.g:546:1: ruleCardinality EOF
            {
             before(grammarAccess.getCardinalityRule()); 
            pushFollow(FOLLOW_1);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getCardinalityRule()); 
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
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalParameterDefinition.g:553:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:557:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalParameterDefinition.g:558:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalParameterDefinition.g:558:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalParameterDefinition.g:559:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalParameterDefinition.g:560:3: ( rule__Cardinality__Alternatives )
            // InternalParameterDefinition.g:560:4: rule__Cardinality__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Cardinality__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getCardinalityAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalParameterDefinition.g:569:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:570:1: ( rulePrimitiveType EOF )
            // InternalParameterDefinition.g:571:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalParameterDefinition.g:578:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:582:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalParameterDefinition.g:583:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalParameterDefinition.g:583:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalParameterDefinition.g:584:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalParameterDefinition.g:585:3: ( rule__PrimitiveType__Group__0 )
            // InternalParameterDefinition.g:585:4: rule__PrimitiveType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleAbstractValue"
    // InternalParameterDefinition.g:594:1: entryRuleAbstractValue : ruleAbstractValue EOF ;
    public final void entryRuleAbstractValue() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:595:1: ( ruleAbstractValue EOF )
            // InternalParameterDefinition.g:596:1: ruleAbstractValue EOF
            {
             before(grammarAccess.getAbstractValueRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractValue();

            state._fsp--;

             after(grammarAccess.getAbstractValueRule()); 
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
    // $ANTLR end "entryRuleAbstractValue"


    // $ANTLR start "ruleAbstractValue"
    // InternalParameterDefinition.g:603:1: ruleAbstractValue : ( ( rule__AbstractValue__Alternatives ) ) ;
    public final void ruleAbstractValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:607:2: ( ( ( rule__AbstractValue__Alternatives ) ) )
            // InternalParameterDefinition.g:608:2: ( ( rule__AbstractValue__Alternatives ) )
            {
            // InternalParameterDefinition.g:608:2: ( ( rule__AbstractValue__Alternatives ) )
            // InternalParameterDefinition.g:609:3: ( rule__AbstractValue__Alternatives )
            {
             before(grammarAccess.getAbstractValueAccess().getAlternatives()); 
            // InternalParameterDefinition.g:610:3: ( rule__AbstractValue__Alternatives )
            // InternalParameterDefinition.g:610:4: rule__AbstractValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractValue"


    // $ANTLR start "entryRuleArrayValue"
    // InternalParameterDefinition.g:619:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:620:1: ( ruleArrayValue EOF )
            // InternalParameterDefinition.g:621:1: ruleArrayValue EOF
            {
             before(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayValue();

            state._fsp--;

             after(grammarAccess.getArrayValueRule()); 
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
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalParameterDefinition.g:628:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:632:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalParameterDefinition.g:633:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalParameterDefinition.g:633:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalParameterDefinition.g:634:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalParameterDefinition.g:635:3: ( rule__ArrayValue__Group__0 )
            // InternalParameterDefinition.g:635:4: rule__ArrayValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleSingleValue"
    // InternalParameterDefinition.g:644:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:645:1: ( ruleSingleValue EOF )
            // InternalParameterDefinition.g:646:1: ruleSingleValue EOF
            {
             before(grammarAccess.getSingleValueRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleValue();

            state._fsp--;

             after(grammarAccess.getSingleValueRule()); 
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
    // $ANTLR end "entryRuleSingleValue"


    // $ANTLR start "ruleSingleValue"
    // InternalParameterDefinition.g:653:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:657:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalParameterDefinition.g:658:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalParameterDefinition.g:658:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalParameterDefinition.g:659:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalParameterDefinition.g:660:3: ( rule__SingleValue__Alternatives )
            // InternalParameterDefinition.g:660:4: rule__SingleValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSingleValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSingleValue"


    // $ANTLR start "rulePRIMITIVE_TYPE_NAME"
    // InternalParameterDefinition.g:669:1: rulePRIMITIVE_TYPE_NAME : ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) ;
    public final void rulePRIMITIVE_TYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:673:1: ( ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) )
            // InternalParameterDefinition.g:674:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            {
            // InternalParameterDefinition.g:674:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            // InternalParameterDefinition.g:675:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            {
             before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 
            // InternalParameterDefinition.g:676:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            // InternalParameterDefinition.g:676:4: rule__PRIMITIVE_TYPE_NAME__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PRIMITIVE_TYPE_NAME__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePRIMITIVE_TYPE_NAME"


    // $ANTLR start "rule__AbstractParameter__Alternatives"
    // InternalParameterDefinition.g:684:1: rule__AbstractParameter__Alternatives : ( ( ruleParameterDefinition ) | ( ruleTriggerDefinition ) );
    public final void rule__AbstractParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:688:1: ( ( ruleParameterDefinition ) | ( ruleTriggerDefinition ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==37) ) {
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
                    // InternalParameterDefinition.g:689:2: ( ruleParameterDefinition )
                    {
                    // InternalParameterDefinition.g:689:2: ( ruleParameterDefinition )
                    // InternalParameterDefinition.g:690:3: ruleParameterDefinition
                    {
                     before(grammarAccess.getAbstractParameterAccess().getParameterDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterDefinition();

                    state._fsp--;

                     after(grammarAccess.getAbstractParameterAccess().getParameterDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:695:2: ( ruleTriggerDefinition )
                    {
                    // InternalParameterDefinition.g:695:2: ( ruleTriggerDefinition )
                    // InternalParameterDefinition.g:696:3: ruleTriggerDefinition
                    {
                     before(grammarAccess.getAbstractParameterAccess().getTriggerDefinitionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTriggerDefinition();

                    state._fsp--;

                     after(grammarAccess.getAbstractParameterAccess().getTriggerDefinitionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractParameter__Alternatives"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalParameterDefinition.g:705:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:709:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalParameterDefinition.g:710:2: ( 'true' )
                    {
                    // InternalParameterDefinition.g:710:2: ( 'true' )
                    // InternalParameterDefinition.g:711:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:716:2: ( 'false' )
                    {
                    // InternalParameterDefinition.g:716:2: ( 'false' )
                    // InternalParameterDefinition.g:717:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

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
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalParameterDefinition.g:726:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:730:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            else if ( (LA3_0==14) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalParameterDefinition.g:731:2: ( 'E' )
                    {
                    // InternalParameterDefinition.g:731:2: ( 'E' )
                    // InternalParameterDefinition.g:732:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:737:2: ( 'e' )
                    {
                    // InternalParameterDefinition.g:737:2: ( 'e' )
                    // InternalParameterDefinition.g:738:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

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
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__AbstractAttributeType__Alternatives"
    // InternalParameterDefinition.g:747:1: rule__AbstractAttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) );
    public final void rule__AbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:751:1: ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=16 && LA4_0<=27)) ) {
                alt4=1;
            }
            else if ( (LA4_0==43) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalParameterDefinition.g:752:2: ( rulePrimitiveType )
                    {
                    // InternalParameterDefinition.g:752:2: ( rulePrimitiveType )
                    // InternalParameterDefinition.g:753:3: rulePrimitiveType
                    {
                     before(grammarAccess.getAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getAbstractAttributeTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:758:2: ( ruleInlineEnumerationType )
                    {
                    // InternalParameterDefinition.g:758:2: ( ruleInlineEnumerationType )
                    // InternalParameterDefinition.g:759:3: ruleInlineEnumerationType
                    {
                     before(grammarAccess.getAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInlineEnumerationType();

                    state._fsp--;

                     after(grammarAccess.getAbstractAttributeTypeAccess().getInlineEnumerationTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractAttributeType__Alternatives"


    // $ANTLR start "rule__Cardinality__Alternatives"
    // InternalParameterDefinition.g:768:1: rule__Cardinality__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:772:1: ( ( RULE_INT ) | ( '*' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==15) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalParameterDefinition.g:773:2: ( RULE_INT )
                    {
                    // InternalParameterDefinition.g:773:2: ( RULE_INT )
                    // InternalParameterDefinition.g:774:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:779:2: ( '*' )
                    {
                    // InternalParameterDefinition.g:779:2: ( '*' )
                    // InternalParameterDefinition.g:780:3: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1()); 
                    match(input,15,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__Cardinality__Alternatives"


    // $ANTLR start "rule__AbstractValue__Alternatives"
    // InternalParameterDefinition.g:789:1: rule__AbstractValue__Alternatives : ( ( ruleSingleValue ) | ( ruleArrayValue ) );
    public final void rule__AbstractValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:793:1: ( ( ruleSingleValue ) | ( ruleArrayValue ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||(LA6_0>=11 && LA6_0<=12)||(LA6_0>=41 && LA6_0<=42)) ) {
                alt6=1;
            }
            else if ( (LA6_0==44) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalParameterDefinition.g:794:2: ( ruleSingleValue )
                    {
                    // InternalParameterDefinition.g:794:2: ( ruleSingleValue )
                    // InternalParameterDefinition.g:795:3: ruleSingleValue
                    {
                     before(grammarAccess.getAbstractValueAccess().getSingleValueParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSingleValue();

                    state._fsp--;

                     after(grammarAccess.getAbstractValueAccess().getSingleValueParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:800:2: ( ruleArrayValue )
                    {
                    // InternalParameterDefinition.g:800:2: ( ruleArrayValue )
                    // InternalParameterDefinition.g:801:3: ruleArrayValue
                    {
                     before(grammarAccess.getAbstractValueAccess().getArrayValueParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayValue();

                    state._fsp--;

                     after(grammarAccess.getAbstractValueAccess().getArrayValueParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractValue__Alternatives"


    // $ANTLR start "rule__SingleValue__Alternatives"
    // InternalParameterDefinition.g:810:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:814:1: ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_INT) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==EOF||LA7_2==RULE_ID||LA7_2==30||LA7_2==33||LA7_2==36||LA7_2==45) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==41) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==41) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA7_2 = input.LA(2);

                if ( (LA7_2==EOF||LA7_2==RULE_ID||LA7_2==30||LA7_2==33||LA7_2==36||LA7_2==45) ) {
                    alt7=1;
                }
                else if ( (LA7_2==41) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            case 11:
            case 12:
                {
                alt7=4;
                }
                break;
            case RULE_ID:
                {
                alt7=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalParameterDefinition.g:815:2: ( ( rule__SingleValue__Group_0__0 ) )
                    {
                    // InternalParameterDefinition.g:815:2: ( ( rule__SingleValue__Group_0__0 ) )
                    // InternalParameterDefinition.g:816:3: ( rule__SingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_0()); 
                    // InternalParameterDefinition.g:817:3: ( rule__SingleValue__Group_0__0 )
                    // InternalParameterDefinition.g:817:4: rule__SingleValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleValueAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:821:2: ( ( rule__SingleValue__Group_1__0 ) )
                    {
                    // InternalParameterDefinition.g:821:2: ( ( rule__SingleValue__Group_1__0 ) )
                    // InternalParameterDefinition.g:822:3: ( rule__SingleValue__Group_1__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_1()); 
                    // InternalParameterDefinition.g:823:3: ( rule__SingleValue__Group_1__0 )
                    // InternalParameterDefinition.g:823:4: rule__SingleValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleValueAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalParameterDefinition.g:827:2: ( ( rule__SingleValue__Group_2__0 ) )
                    {
                    // InternalParameterDefinition.g:827:2: ( ( rule__SingleValue__Group_2__0 ) )
                    // InternalParameterDefinition.g:828:3: ( rule__SingleValue__Group_2__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_2()); 
                    // InternalParameterDefinition.g:829:3: ( rule__SingleValue__Group_2__0 )
                    // InternalParameterDefinition.g:829:4: rule__SingleValue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleValueAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalParameterDefinition.g:833:2: ( ( rule__SingleValue__Group_3__0 ) )
                    {
                    // InternalParameterDefinition.g:833:2: ( ( rule__SingleValue__Group_3__0 ) )
                    // InternalParameterDefinition.g:834:3: ( rule__SingleValue__Group_3__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_3()); 
                    // InternalParameterDefinition.g:835:3: ( rule__SingleValue__Group_3__0 )
                    // InternalParameterDefinition.g:835:4: rule__SingleValue__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleValueAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalParameterDefinition.g:839:2: ( ( rule__SingleValue__Group_4__0 ) )
                    {
                    // InternalParameterDefinition.g:839:2: ( ( rule__SingleValue__Group_4__0 ) )
                    // InternalParameterDefinition.g:840:3: ( rule__SingleValue__Group_4__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_4()); 
                    // InternalParameterDefinition.g:841:3: ( rule__SingleValue__Group_4__0 )
                    // InternalParameterDefinition.g:841:4: rule__SingleValue__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleValue__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleValueAccess().getGroup_4()); 

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
    // $ANTLR end "rule__SingleValue__Alternatives"


    // $ANTLR start "rule__PRIMITIVE_TYPE_NAME__Alternatives"
    // InternalParameterDefinition.g:849:1: rule__PRIMITIVE_TYPE_NAME__Alternatives : ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PRIMITIVE_TYPE_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:853:1: ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) )
            int alt8=12;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt8=1;
                }
                break;
            case 17:
                {
                alt8=2;
                }
                break;
            case 18:
                {
                alt8=3;
                }
                break;
            case 19:
                {
                alt8=4;
                }
                break;
            case 20:
                {
                alt8=5;
                }
                break;
            case 21:
                {
                alt8=6;
                }
                break;
            case 22:
                {
                alt8=7;
                }
                break;
            case 23:
                {
                alt8=8;
                }
                break;
            case 24:
                {
                alt8=9;
                }
                break;
            case 25:
                {
                alt8=10;
                }
                break;
            case 26:
                {
                alt8=11;
                }
                break;
            case 27:
                {
                alt8=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalParameterDefinition.g:854:2: ( ( 'Int8' ) )
                    {
                    // InternalParameterDefinition.g:854:2: ( ( 'Int8' ) )
                    // InternalParameterDefinition.g:855:3: ( 'Int8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 
                    // InternalParameterDefinition.g:856:3: ( 'Int8' )
                    // InternalParameterDefinition.g:856:4: 'Int8'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:860:2: ( ( 'Int16' ) )
                    {
                    // InternalParameterDefinition.g:860:2: ( ( 'Int16' ) )
                    // InternalParameterDefinition.g:861:3: ( 'Int16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 
                    // InternalParameterDefinition.g:862:3: ( 'Int16' )
                    // InternalParameterDefinition.g:862:4: 'Int16'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalParameterDefinition.g:866:2: ( ( 'Int32' ) )
                    {
                    // InternalParameterDefinition.g:866:2: ( ( 'Int32' ) )
                    // InternalParameterDefinition.g:867:3: ( 'Int32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 
                    // InternalParameterDefinition.g:868:3: ( 'Int32' )
                    // InternalParameterDefinition.g:868:4: 'Int32'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalParameterDefinition.g:872:2: ( ( 'Int64' ) )
                    {
                    // InternalParameterDefinition.g:872:2: ( ( 'Int64' ) )
                    // InternalParameterDefinition.g:873:3: ( 'Int64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 
                    // InternalParameterDefinition.g:874:3: ( 'Int64' )
                    // InternalParameterDefinition.g:874:4: 'Int64'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalParameterDefinition.g:878:2: ( ( 'UInt8' ) )
                    {
                    // InternalParameterDefinition.g:878:2: ( ( 'UInt8' ) )
                    // InternalParameterDefinition.g:879:3: ( 'UInt8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 
                    // InternalParameterDefinition.g:880:3: ( 'UInt8' )
                    // InternalParameterDefinition.g:880:4: 'UInt8'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalParameterDefinition.g:884:2: ( ( 'UInt16' ) )
                    {
                    // InternalParameterDefinition.g:884:2: ( ( 'UInt16' ) )
                    // InternalParameterDefinition.g:885:3: ( 'UInt16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 
                    // InternalParameterDefinition.g:886:3: ( 'UInt16' )
                    // InternalParameterDefinition.g:886:4: 'UInt16'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalParameterDefinition.g:890:2: ( ( 'UInt32' ) )
                    {
                    // InternalParameterDefinition.g:890:2: ( ( 'UInt32' ) )
                    // InternalParameterDefinition.g:891:3: ( 'UInt32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 
                    // InternalParameterDefinition.g:892:3: ( 'UInt32' )
                    // InternalParameterDefinition.g:892:4: 'UInt32'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalParameterDefinition.g:896:2: ( ( 'UInt64' ) )
                    {
                    // InternalParameterDefinition.g:896:2: ( ( 'UInt64' ) )
                    // InternalParameterDefinition.g:897:3: ( 'UInt64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 
                    // InternalParameterDefinition.g:898:3: ( 'UInt64' )
                    // InternalParameterDefinition.g:898:4: 'UInt64'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalParameterDefinition.g:902:2: ( ( 'Float' ) )
                    {
                    // InternalParameterDefinition.g:902:2: ( ( 'Float' ) )
                    // InternalParameterDefinition.g:903:3: ( 'Float' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 
                    // InternalParameterDefinition.g:904:3: ( 'Float' )
                    // InternalParameterDefinition.g:904:4: 'Float'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalParameterDefinition.g:908:2: ( ( 'Double' ) )
                    {
                    // InternalParameterDefinition.g:908:2: ( ( 'Double' ) )
                    // InternalParameterDefinition.g:909:3: ( 'Double' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 
                    // InternalParameterDefinition.g:910:3: ( 'Double' )
                    // InternalParameterDefinition.g:910:4: 'Double'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalParameterDefinition.g:914:2: ( ( 'String' ) )
                    {
                    // InternalParameterDefinition.g:914:2: ( ( 'String' ) )
                    // InternalParameterDefinition.g:915:3: ( 'String' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 
                    // InternalParameterDefinition.g:916:3: ( 'String' )
                    // InternalParameterDefinition.g:916:4: 'String'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalParameterDefinition.g:920:2: ( ( 'Boolean' ) )
                    {
                    // InternalParameterDefinition.g:920:2: ( ( 'Boolean' ) )
                    // InternalParameterDefinition.g:921:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 
                    // InternalParameterDefinition.g:922:3: ( 'Boolean' )
                    // InternalParameterDefinition.g:922:4: 'Boolean'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 

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
    // $ANTLR end "rule__PRIMITIVE_TYPE_NAME__Alternatives"


    // $ANTLR start "rule__ParamDefModel__Group__0"
    // InternalParameterDefinition.g:930:1: rule__ParamDefModel__Group__0 : rule__ParamDefModel__Group__0__Impl rule__ParamDefModel__Group__1 ;
    public final void rule__ParamDefModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:934:1: ( rule__ParamDefModel__Group__0__Impl rule__ParamDefModel__Group__1 )
            // InternalParameterDefinition.g:935:2: rule__ParamDefModel__Group__0__Impl rule__ParamDefModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParamDefModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamDefModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefModel__Group__0"


    // $ANTLR start "rule__ParamDefModel__Group__0__Impl"
    // InternalParameterDefinition.g:942:1: rule__ParamDefModel__Group__0__Impl : ( () ) ;
    public final void rule__ParamDefModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:946:1: ( ( () ) )
            // InternalParameterDefinition.g:947:1: ( () )
            {
            // InternalParameterDefinition.g:947:1: ( () )
            // InternalParameterDefinition.g:948:2: ()
            {
             before(grammarAccess.getParamDefModelAccess().getParamDefModelAction_0()); 
            // InternalParameterDefinition.g:949:2: ()
            // InternalParameterDefinition.g:949:3: 
            {
            }

             after(grammarAccess.getParamDefModelAccess().getParamDefModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefModel__Group__0__Impl"


    // $ANTLR start "rule__ParamDefModel__Group__1"
    // InternalParameterDefinition.g:957:1: rule__ParamDefModel__Group__1 : rule__ParamDefModel__Group__1__Impl rule__ParamDefModel__Group__2 ;
    public final void rule__ParamDefModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:961:1: ( rule__ParamDefModel__Group__1__Impl rule__ParamDefModel__Group__2 )
            // InternalParameterDefinition.g:962:2: rule__ParamDefModel__Group__1__Impl rule__ParamDefModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ParamDefModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamDefModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefModel__Group__1"


    // $ANTLR start "rule__ParamDefModel__Group__1__Impl"
    // InternalParameterDefinition.g:969:1: rule__ParamDefModel__Group__1__Impl : ( ( rule__ParamDefModel__ImportsAssignment_1 )* ) ;
    public final void rule__ParamDefModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:973:1: ( ( ( rule__ParamDefModel__ImportsAssignment_1 )* ) )
            // InternalParameterDefinition.g:974:1: ( ( rule__ParamDefModel__ImportsAssignment_1 )* )
            {
            // InternalParameterDefinition.g:974:1: ( ( rule__ParamDefModel__ImportsAssignment_1 )* )
            // InternalParameterDefinition.g:975:2: ( rule__ParamDefModel__ImportsAssignment_1 )*
            {
             before(grammarAccess.getParamDefModelAccess().getImportsAssignment_1()); 
            // InternalParameterDefinition.g:976:2: ( rule__ParamDefModel__ImportsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==29) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalParameterDefinition.g:976:3: rule__ParamDefModel__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ParamDefModel__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getParamDefModelAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefModel__Group__1__Impl"


    // $ANTLR start "rule__ParamDefModel__Group__2"
    // InternalParameterDefinition.g:984:1: rule__ParamDefModel__Group__2 : rule__ParamDefModel__Group__2__Impl ;
    public final void rule__ParamDefModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:988:1: ( rule__ParamDefModel__Group__2__Impl )
            // InternalParameterDefinition.g:989:2: rule__ParamDefModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamDefModel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefModel__Group__2"


    // $ANTLR start "rule__ParamDefModel__Group__2__Impl"
    // InternalParameterDefinition.g:995:1: rule__ParamDefModel__Group__2__Impl : ( ( rule__ParamDefModel__RepositoryAssignment_2 )? ) ;
    public final void rule__ParamDefModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:999:1: ( ( ( rule__ParamDefModel__RepositoryAssignment_2 )? ) )
            // InternalParameterDefinition.g:1000:1: ( ( rule__ParamDefModel__RepositoryAssignment_2 )? )
            {
            // InternalParameterDefinition.g:1000:1: ( ( rule__ParamDefModel__RepositoryAssignment_2 )? )
            // InternalParameterDefinition.g:1001:2: ( rule__ParamDefModel__RepositoryAssignment_2 )?
            {
             before(grammarAccess.getParamDefModelAccess().getRepositoryAssignment_2()); 
            // InternalParameterDefinition.g:1002:2: ( rule__ParamDefModel__RepositoryAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==31) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalParameterDefinition.g:1002:3: rule__ParamDefModel__RepositoryAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParamDefModel__RepositoryAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParamDefModelAccess().getRepositoryAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefModel__Group__2__Impl"


    // $ANTLR start "rule__FQNW__Group__0"
    // InternalParameterDefinition.g:1011:1: rule__FQNW__Group__0 : rule__FQNW__Group__0__Impl rule__FQNW__Group__1 ;
    public final void rule__FQNW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1015:1: ( rule__FQNW__Group__0__Impl rule__FQNW__Group__1 )
            // InternalParameterDefinition.g:1016:2: rule__FQNW__Group__0__Impl rule__FQNW__Group__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalParameterDefinition.g:1023:1: rule__FQNW__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1027:1: ( ( ruleFQN ) )
            // InternalParameterDefinition.g:1028:1: ( ruleFQN )
            {
            // InternalParameterDefinition.g:1028:1: ( ruleFQN )
            // InternalParameterDefinition.g:1029:2: ruleFQN
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
    // InternalParameterDefinition.g:1038:1: rule__FQNW__Group__1 : rule__FQNW__Group__1__Impl ;
    public final void rule__FQNW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1042:1: ( rule__FQNW__Group__1__Impl )
            // InternalParameterDefinition.g:1043:2: rule__FQNW__Group__1__Impl
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
    // InternalParameterDefinition.g:1049:1: rule__FQNW__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1053:1: ( ( ( '.*' )? ) )
            // InternalParameterDefinition.g:1054:1: ( ( '.*' )? )
            {
            // InternalParameterDefinition.g:1054:1: ( ( '.*' )? )
            // InternalParameterDefinition.g:1055:2: ( '.*' )?
            {
             before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); 
            // InternalParameterDefinition.g:1056:2: ( '.*' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==28) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalParameterDefinition.g:1056:3: '.*'
                    {
                    match(input,28,FOLLOW_2); 

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


    // $ANTLR start "rule__ParamDefRepoImport__Group__0"
    // InternalParameterDefinition.g:1065:1: rule__ParamDefRepoImport__Group__0 : rule__ParamDefRepoImport__Group__0__Impl rule__ParamDefRepoImport__Group__1 ;
    public final void rule__ParamDefRepoImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1069:1: ( rule__ParamDefRepoImport__Group__0__Impl rule__ParamDefRepoImport__Group__1 )
            // InternalParameterDefinition.g:1070:2: rule__ParamDefRepoImport__Group__0__Impl rule__ParamDefRepoImport__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ParamDefRepoImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamDefRepoImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefRepoImport__Group__0"


    // $ANTLR start "rule__ParamDefRepoImport__Group__0__Impl"
    // InternalParameterDefinition.g:1077:1: rule__ParamDefRepoImport__Group__0__Impl : ( '#import' ) ;
    public final void rule__ParamDefRepoImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1081:1: ( ( '#import' ) )
            // InternalParameterDefinition.g:1082:1: ( '#import' )
            {
            // InternalParameterDefinition.g:1082:1: ( '#import' )
            // InternalParameterDefinition.g:1083:2: '#import'
            {
             before(grammarAccess.getParamDefRepoImportAccess().getImportKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getParamDefRepoImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefRepoImport__Group__0__Impl"


    // $ANTLR start "rule__ParamDefRepoImport__Group__1"
    // InternalParameterDefinition.g:1092:1: rule__ParamDefRepoImport__Group__1 : rule__ParamDefRepoImport__Group__1__Impl rule__ParamDefRepoImport__Group__2 ;
    public final void rule__ParamDefRepoImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1096:1: ( rule__ParamDefRepoImport__Group__1__Impl rule__ParamDefRepoImport__Group__2 )
            // InternalParameterDefinition.g:1097:2: rule__ParamDefRepoImport__Group__1__Impl rule__ParamDefRepoImport__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ParamDefRepoImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParamDefRepoImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefRepoImport__Group__1"


    // $ANTLR start "rule__ParamDefRepoImport__Group__1__Impl"
    // InternalParameterDefinition.g:1104:1: rule__ParamDefRepoImport__Group__1__Impl : ( ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__ParamDefRepoImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1108:1: ( ( ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalParameterDefinition.g:1109:1: ( ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalParameterDefinition.g:1109:1: ( ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 ) )
            // InternalParameterDefinition.g:1110:2: ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalParameterDefinition.g:1111:2: ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 )
            // InternalParameterDefinition.g:1111:3: rule__ParamDefRepoImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParamDefRepoImport__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefRepoImport__Group__1__Impl"


    // $ANTLR start "rule__ParamDefRepoImport__Group__2"
    // InternalParameterDefinition.g:1119:1: rule__ParamDefRepoImport__Group__2 : rule__ParamDefRepoImport__Group__2__Impl ;
    public final void rule__ParamDefRepoImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1123:1: ( rule__ParamDefRepoImport__Group__2__Impl )
            // InternalParameterDefinition.g:1124:2: rule__ParamDefRepoImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParamDefRepoImport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefRepoImport__Group__2"


    // $ANTLR start "rule__ParamDefRepoImport__Group__2__Impl"
    // InternalParameterDefinition.g:1130:1: rule__ParamDefRepoImport__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ParamDefRepoImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1134:1: ( ( ( ';' )? ) )
            // InternalParameterDefinition.g:1135:1: ( ( ';' )? )
            {
            // InternalParameterDefinition.g:1135:1: ( ( ';' )? )
            // InternalParameterDefinition.g:1136:2: ( ';' )?
            {
             before(grammarAccess.getParamDefRepoImportAccess().getSemicolonKeyword_2()); 
            // InternalParameterDefinition.g:1137:2: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalParameterDefinition.g:1137:3: ';'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParamDefRepoImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefRepoImport__Group__2__Impl"


    // $ANTLR start "rule__ParameterSetRepository__Group__0"
    // InternalParameterDefinition.g:1146:1: rule__ParameterSetRepository__Group__0 : rule__ParameterSetRepository__Group__0__Impl rule__ParameterSetRepository__Group__1 ;
    public final void rule__ParameterSetRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1150:1: ( rule__ParameterSetRepository__Group__0__Impl rule__ParameterSetRepository__Group__1 )
            // InternalParameterDefinition.g:1151:2: rule__ParameterSetRepository__Group__0__Impl rule__ParameterSetRepository__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ParameterSetRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__0"


    // $ANTLR start "rule__ParameterSetRepository__Group__0__Impl"
    // InternalParameterDefinition.g:1158:1: rule__ParameterSetRepository__Group__0__Impl : ( 'ParameterSetRepository' ) ;
    public final void rule__ParameterSetRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1162:1: ( ( 'ParameterSetRepository' ) )
            // InternalParameterDefinition.g:1163:1: ( 'ParameterSetRepository' )
            {
            // InternalParameterDefinition.g:1163:1: ( 'ParameterSetRepository' )
            // InternalParameterDefinition.g:1164:2: 'ParameterSetRepository'
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getParameterSetRepositoryKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getParameterSetRepositoryAccess().getParameterSetRepositoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__0__Impl"


    // $ANTLR start "rule__ParameterSetRepository__Group__1"
    // InternalParameterDefinition.g:1173:1: rule__ParameterSetRepository__Group__1 : rule__ParameterSetRepository__Group__1__Impl rule__ParameterSetRepository__Group__2 ;
    public final void rule__ParameterSetRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1177:1: ( rule__ParameterSetRepository__Group__1__Impl rule__ParameterSetRepository__Group__2 )
            // InternalParameterDefinition.g:1178:2: rule__ParameterSetRepository__Group__1__Impl rule__ParameterSetRepository__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ParameterSetRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetRepository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__1"


    // $ANTLR start "rule__ParameterSetRepository__Group__1__Impl"
    // InternalParameterDefinition.g:1185:1: rule__ParameterSetRepository__Group__1__Impl : ( ( rule__ParameterSetRepository__NameAssignment_1 ) ) ;
    public final void rule__ParameterSetRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1189:1: ( ( ( rule__ParameterSetRepository__NameAssignment_1 ) ) )
            // InternalParameterDefinition.g:1190:1: ( ( rule__ParameterSetRepository__NameAssignment_1 ) )
            {
            // InternalParameterDefinition.g:1190:1: ( ( rule__ParameterSetRepository__NameAssignment_1 ) )
            // InternalParameterDefinition.g:1191:2: ( rule__ParameterSetRepository__NameAssignment_1 )
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getNameAssignment_1()); 
            // InternalParameterDefinition.g:1192:2: ( rule__ParameterSetRepository__NameAssignment_1 )
            // InternalParameterDefinition.g:1192:3: rule__ParameterSetRepository__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetRepository__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterSetRepositoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__1__Impl"


    // $ANTLR start "rule__ParameterSetRepository__Group__2"
    // InternalParameterDefinition.g:1200:1: rule__ParameterSetRepository__Group__2 : rule__ParameterSetRepository__Group__2__Impl rule__ParameterSetRepository__Group__3 ;
    public final void rule__ParameterSetRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1204:1: ( rule__ParameterSetRepository__Group__2__Impl rule__ParameterSetRepository__Group__3 )
            // InternalParameterDefinition.g:1205:2: rule__ParameterSetRepository__Group__2__Impl rule__ParameterSetRepository__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ParameterSetRepository__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetRepository__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__2"


    // $ANTLR start "rule__ParameterSetRepository__Group__2__Impl"
    // InternalParameterDefinition.g:1212:1: rule__ParameterSetRepository__Group__2__Impl : ( '{' ) ;
    public final void rule__ParameterSetRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1216:1: ( ( '{' ) )
            // InternalParameterDefinition.g:1217:1: ( '{' )
            {
            // InternalParameterDefinition.g:1217:1: ( '{' )
            // InternalParameterDefinition.g:1218:2: '{'
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParameterSetRepositoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__2__Impl"


    // $ANTLR start "rule__ParameterSetRepository__Group__3"
    // InternalParameterDefinition.g:1227:1: rule__ParameterSetRepository__Group__3 : rule__ParameterSetRepository__Group__3__Impl rule__ParameterSetRepository__Group__4 ;
    public final void rule__ParameterSetRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1231:1: ( rule__ParameterSetRepository__Group__3__Impl rule__ParameterSetRepository__Group__4 )
            // InternalParameterDefinition.g:1232:2: rule__ParameterSetRepository__Group__3__Impl rule__ParameterSetRepository__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__ParameterSetRepository__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetRepository__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__3"


    // $ANTLR start "rule__ParameterSetRepository__Group__3__Impl"
    // InternalParameterDefinition.g:1239:1: rule__ParameterSetRepository__Group__3__Impl : ( ( rule__ParameterSetRepository__SetsAssignment_3 )* ) ;
    public final void rule__ParameterSetRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1243:1: ( ( ( rule__ParameterSetRepository__SetsAssignment_3 )* ) )
            // InternalParameterDefinition.g:1244:1: ( ( rule__ParameterSetRepository__SetsAssignment_3 )* )
            {
            // InternalParameterDefinition.g:1244:1: ( ( rule__ParameterSetRepository__SetsAssignment_3 )* )
            // InternalParameterDefinition.g:1245:2: ( rule__ParameterSetRepository__SetsAssignment_3 )*
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getSetsAssignment_3()); 
            // InternalParameterDefinition.g:1246:2: ( rule__ParameterSetRepository__SetsAssignment_3 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalParameterDefinition.g:1246:3: rule__ParameterSetRepository__SetsAssignment_3
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ParameterSetRepository__SetsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getParameterSetRepositoryAccess().getSetsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__3__Impl"


    // $ANTLR start "rule__ParameterSetRepository__Group__4"
    // InternalParameterDefinition.g:1254:1: rule__ParameterSetRepository__Group__4 : rule__ParameterSetRepository__Group__4__Impl ;
    public final void rule__ParameterSetRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1258:1: ( rule__ParameterSetRepository__Group__4__Impl )
            // InternalParameterDefinition.g:1259:2: rule__ParameterSetRepository__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetRepository__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__4"


    // $ANTLR start "rule__ParameterSetRepository__Group__4__Impl"
    // InternalParameterDefinition.g:1265:1: rule__ParameterSetRepository__Group__4__Impl : ( '}' ) ;
    public final void rule__ParameterSetRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1269:1: ( ( '}' ) )
            // InternalParameterDefinition.g:1270:1: ( '}' )
            {
            // InternalParameterDefinition.g:1270:1: ( '}' )
            // InternalParameterDefinition.g:1271:2: '}'
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getParameterSetRepositoryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__4__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group__0"
    // InternalParameterDefinition.g:1281:1: rule__ParameterSetDefinition__Group__0 : rule__ParameterSetDefinition__Group__0__Impl rule__ParameterSetDefinition__Group__1 ;
    public final void rule__ParameterSetDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1285:1: ( rule__ParameterSetDefinition__Group__0__Impl rule__ParameterSetDefinition__Group__1 )
            // InternalParameterDefinition.g:1286:2: rule__ParameterSetDefinition__Group__0__Impl rule__ParameterSetDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ParameterSetDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__0"


    // $ANTLR start "rule__ParameterSetDefinition__Group__0__Impl"
    // InternalParameterDefinition.g:1293:1: rule__ParameterSetDefinition__Group__0__Impl : ( 'ParameterSet' ) ;
    public final void rule__ParameterSetDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1297:1: ( ( 'ParameterSet' ) )
            // InternalParameterDefinition.g:1298:1: ( 'ParameterSet' )
            {
            // InternalParameterDefinition.g:1298:1: ( 'ParameterSet' )
            // InternalParameterDefinition.g:1299:2: 'ParameterSet'
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getParameterSetKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getParameterSetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__0__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group__1"
    // InternalParameterDefinition.g:1308:1: rule__ParameterSetDefinition__Group__1 : rule__ParameterSetDefinition__Group__1__Impl rule__ParameterSetDefinition__Group__2 ;
    public final void rule__ParameterSetDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1312:1: ( rule__ParameterSetDefinition__Group__1__Impl rule__ParameterSetDefinition__Group__2 )
            // InternalParameterDefinition.g:1313:2: rule__ParameterSetDefinition__Group__1__Impl rule__ParameterSetDefinition__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__ParameterSetDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__1"


    // $ANTLR start "rule__ParameterSetDefinition__Group__1__Impl"
    // InternalParameterDefinition.g:1320:1: rule__ParameterSetDefinition__Group__1__Impl : ( ( rule__ParameterSetDefinition__NameAssignment_1 ) ) ;
    public final void rule__ParameterSetDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1324:1: ( ( ( rule__ParameterSetDefinition__NameAssignment_1 ) ) )
            // InternalParameterDefinition.g:1325:1: ( ( rule__ParameterSetDefinition__NameAssignment_1 ) )
            {
            // InternalParameterDefinition.g:1325:1: ( ( rule__ParameterSetDefinition__NameAssignment_1 ) )
            // InternalParameterDefinition.g:1326:2: ( rule__ParameterSetDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getNameAssignment_1()); 
            // InternalParameterDefinition.g:1327:2: ( rule__ParameterSetDefinition__NameAssignment_1 )
            // InternalParameterDefinition.g:1327:3: rule__ParameterSetDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterSetDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__1__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group__2"
    // InternalParameterDefinition.g:1335:1: rule__ParameterSetDefinition__Group__2 : rule__ParameterSetDefinition__Group__2__Impl rule__ParameterSetDefinition__Group__3 ;
    public final void rule__ParameterSetDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1339:1: ( rule__ParameterSetDefinition__Group__2__Impl rule__ParameterSetDefinition__Group__3 )
            // InternalParameterDefinition.g:1340:2: rule__ParameterSetDefinition__Group__2__Impl rule__ParameterSetDefinition__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__ParameterSetDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__2"


    // $ANTLR start "rule__ParameterSetDefinition__Group__2__Impl"
    // InternalParameterDefinition.g:1347:1: rule__ParameterSetDefinition__Group__2__Impl : ( ( rule__ParameterSetDefinition__Group_2__0 )? ) ;
    public final void rule__ParameterSetDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1351:1: ( ( ( rule__ParameterSetDefinition__Group_2__0 )? ) )
            // InternalParameterDefinition.g:1352:1: ( ( rule__ParameterSetDefinition__Group_2__0 )? )
            {
            // InternalParameterDefinition.g:1352:1: ( ( rule__ParameterSetDefinition__Group_2__0 )? )
            // InternalParameterDefinition.g:1353:2: ( rule__ParameterSetDefinition__Group_2__0 )?
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getGroup_2()); 
            // InternalParameterDefinition.g:1354:2: ( rule__ParameterSetDefinition__Group_2__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalParameterDefinition.g:1354:3: rule__ParameterSetDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterSetDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterSetDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__2__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group__3"
    // InternalParameterDefinition.g:1362:1: rule__ParameterSetDefinition__Group__3 : rule__ParameterSetDefinition__Group__3__Impl rule__ParameterSetDefinition__Group__4 ;
    public final void rule__ParameterSetDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1366:1: ( rule__ParameterSetDefinition__Group__3__Impl rule__ParameterSetDefinition__Group__4 )
            // InternalParameterDefinition.g:1367:2: rule__ParameterSetDefinition__Group__3__Impl rule__ParameterSetDefinition__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ParameterSetDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__3"


    // $ANTLR start "rule__ParameterSetDefinition__Group__3__Impl"
    // InternalParameterDefinition.g:1374:1: rule__ParameterSetDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ParameterSetDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1378:1: ( ( '{' ) )
            // InternalParameterDefinition.g:1379:1: ( '{' )
            {
            // InternalParameterDefinition.g:1379:1: ( '{' )
            // InternalParameterDefinition.g:1380:2: '{'
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__3__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group__4"
    // InternalParameterDefinition.g:1389:1: rule__ParameterSetDefinition__Group__4 : rule__ParameterSetDefinition__Group__4__Impl rule__ParameterSetDefinition__Group__5 ;
    public final void rule__ParameterSetDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1393:1: ( rule__ParameterSetDefinition__Group__4__Impl rule__ParameterSetDefinition__Group__5 )
            // InternalParameterDefinition.g:1394:2: rule__ParameterSetDefinition__Group__4__Impl rule__ParameterSetDefinition__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__ParameterSetDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__4"


    // $ANTLR start "rule__ParameterSetDefinition__Group__4__Impl"
    // InternalParameterDefinition.g:1401:1: rule__ParameterSetDefinition__Group__4__Impl : ( ( rule__ParameterSetDefinition__ParametersAssignment_4 )* ) ;
    public final void rule__ParameterSetDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1405:1: ( ( ( rule__ParameterSetDefinition__ParametersAssignment_4 )* ) )
            // InternalParameterDefinition.g:1406:1: ( ( rule__ParameterSetDefinition__ParametersAssignment_4 )* )
            {
            // InternalParameterDefinition.g:1406:1: ( ( rule__ParameterSetDefinition__ParametersAssignment_4 )* )
            // InternalParameterDefinition.g:1407:2: ( rule__ParameterSetDefinition__ParametersAssignment_4 )*
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getParametersAssignment_4()); 
            // InternalParameterDefinition.g:1408:2: ( rule__ParameterSetDefinition__ParametersAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=37 && LA15_0<=38)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalParameterDefinition.g:1408:3: rule__ParameterSetDefinition__ParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ParameterSetDefinition__ParametersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getParameterSetDefinitionAccess().getParametersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__4__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group__5"
    // InternalParameterDefinition.g:1416:1: rule__ParameterSetDefinition__Group__5 : rule__ParameterSetDefinition__Group__5__Impl ;
    public final void rule__ParameterSetDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1420:1: ( rule__ParameterSetDefinition__Group__5__Impl )
            // InternalParameterDefinition.g:1421:2: rule__ParameterSetDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__5"


    // $ANTLR start "rule__ParameterSetDefinition__Group__5__Impl"
    // InternalParameterDefinition.g:1427:1: rule__ParameterSetDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ParameterSetDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1431:1: ( ( '}' ) )
            // InternalParameterDefinition.g:1432:1: ( '}' )
            {
            // InternalParameterDefinition.g:1432:1: ( '}' )
            // InternalParameterDefinition.g:1433:2: '}'
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__5__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group_2__0"
    // InternalParameterDefinition.g:1443:1: rule__ParameterSetDefinition__Group_2__0 : rule__ParameterSetDefinition__Group_2__0__Impl rule__ParameterSetDefinition__Group_2__1 ;
    public final void rule__ParameterSetDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1447:1: ( rule__ParameterSetDefinition__Group_2__0__Impl rule__ParameterSetDefinition__Group_2__1 )
            // InternalParameterDefinition.g:1448:2: rule__ParameterSetDefinition__Group_2__0__Impl rule__ParameterSetDefinition__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ParameterSetDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_2__0"


    // $ANTLR start "rule__ParameterSetDefinition__Group_2__0__Impl"
    // InternalParameterDefinition.g:1455:1: rule__ParameterSetDefinition__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__ParameterSetDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1459:1: ( ( 'extends' ) )
            // InternalParameterDefinition.g:1460:1: ( 'extends' )
            {
            // InternalParameterDefinition.g:1460:1: ( 'extends' )
            // InternalParameterDefinition.g:1461:2: 'extends'
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group_2__1"
    // InternalParameterDefinition.g:1470:1: rule__ParameterSetDefinition__Group_2__1 : rule__ParameterSetDefinition__Group_2__1__Impl rule__ParameterSetDefinition__Group_2__2 ;
    public final void rule__ParameterSetDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1474:1: ( rule__ParameterSetDefinition__Group_2__1__Impl rule__ParameterSetDefinition__Group_2__2 )
            // InternalParameterDefinition.g:1475:2: rule__ParameterSetDefinition__Group_2__1__Impl rule__ParameterSetDefinition__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__ParameterSetDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_2__1"


    // $ANTLR start "rule__ParameterSetDefinition__Group_2__1__Impl"
    // InternalParameterDefinition.g:1482:1: rule__ParameterSetDefinition__Group_2__1__Impl : ( ( rule__ParameterSetDefinition__ExtendsAssignment_2_1 ) ) ;
    public final void rule__ParameterSetDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1486:1: ( ( ( rule__ParameterSetDefinition__ExtendsAssignment_2_1 ) ) )
            // InternalParameterDefinition.g:1487:1: ( ( rule__ParameterSetDefinition__ExtendsAssignment_2_1 ) )
            {
            // InternalParameterDefinition.g:1487:1: ( ( rule__ParameterSetDefinition__ExtendsAssignment_2_1 ) )
            // InternalParameterDefinition.g:1488:2: ( rule__ParameterSetDefinition__ExtendsAssignment_2_1 )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_2_1()); 
            // InternalParameterDefinition.g:1489:2: ( rule__ParameterSetDefinition__ExtendsAssignment_2_1 )
            // InternalParameterDefinition.g:1489:3: rule__ParameterSetDefinition__ExtendsAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__ExtendsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group_2__2"
    // InternalParameterDefinition.g:1497:1: rule__ParameterSetDefinition__Group_2__2 : rule__ParameterSetDefinition__Group_2__2__Impl ;
    public final void rule__ParameterSetDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1501:1: ( rule__ParameterSetDefinition__Group_2__2__Impl )
            // InternalParameterDefinition.g:1502:2: rule__ParameterSetDefinition__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_2__2"


    // $ANTLR start "rule__ParameterSetDefinition__Group_2__2__Impl"
    // InternalParameterDefinition.g:1508:1: rule__ParameterSetDefinition__Group_2__2__Impl : ( ( rule__ParameterSetDefinition__Group_2_2__0 )* ) ;
    public final void rule__ParameterSetDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1512:1: ( ( ( rule__ParameterSetDefinition__Group_2_2__0 )* ) )
            // InternalParameterDefinition.g:1513:1: ( ( rule__ParameterSetDefinition__Group_2_2__0 )* )
            {
            // InternalParameterDefinition.g:1513:1: ( ( rule__ParameterSetDefinition__Group_2_2__0 )* )
            // InternalParameterDefinition.g:1514:2: ( rule__ParameterSetDefinition__Group_2_2__0 )*
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getGroup_2_2()); 
            // InternalParameterDefinition.g:1515:2: ( rule__ParameterSetDefinition__Group_2_2__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==36) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalParameterDefinition.g:1515:3: rule__ParameterSetDefinition__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ParameterSetDefinition__Group_2_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getParameterSetDefinitionAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group_2_2__0"
    // InternalParameterDefinition.g:1524:1: rule__ParameterSetDefinition__Group_2_2__0 : rule__ParameterSetDefinition__Group_2_2__0__Impl rule__ParameterSetDefinition__Group_2_2__1 ;
    public final void rule__ParameterSetDefinition__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1528:1: ( rule__ParameterSetDefinition__Group_2_2__0__Impl rule__ParameterSetDefinition__Group_2_2__1 )
            // InternalParameterDefinition.g:1529:2: rule__ParameterSetDefinition__Group_2_2__0__Impl rule__ParameterSetDefinition__Group_2_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ParameterSetDefinition__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_2_2__0"


    // $ANTLR start "rule__ParameterSetDefinition__Group_2_2__0__Impl"
    // InternalParameterDefinition.g:1536:1: rule__ParameterSetDefinition__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ParameterSetDefinition__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1540:1: ( ( ',' ) )
            // InternalParameterDefinition.g:1541:1: ( ',' )
            {
            // InternalParameterDefinition.g:1541:1: ( ',' )
            // InternalParameterDefinition.g:1542:2: ','
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getCommaKeyword_2_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getCommaKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_2_2__0__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group_2_2__1"
    // InternalParameterDefinition.g:1551:1: rule__ParameterSetDefinition__Group_2_2__1 : rule__ParameterSetDefinition__Group_2_2__1__Impl ;
    public final void rule__ParameterSetDefinition__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1555:1: ( rule__ParameterSetDefinition__Group_2_2__1__Impl )
            // InternalParameterDefinition.g:1556:2: rule__ParameterSetDefinition__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_2_2__1"


    // $ANTLR start "rule__ParameterSetDefinition__Group_2_2__1__Impl"
    // InternalParameterDefinition.g:1562:1: rule__ParameterSetDefinition__Group_2_2__1__Impl : ( ( rule__ParameterSetDefinition__ExtendsAssignment_2_2_1 ) ) ;
    public final void rule__ParameterSetDefinition__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1566:1: ( ( ( rule__ParameterSetDefinition__ExtendsAssignment_2_2_1 ) ) )
            // InternalParameterDefinition.g:1567:1: ( ( rule__ParameterSetDefinition__ExtendsAssignment_2_2_1 ) )
            {
            // InternalParameterDefinition.g:1567:1: ( ( rule__ParameterSetDefinition__ExtendsAssignment_2_2_1 ) )
            // InternalParameterDefinition.g:1568:2: ( rule__ParameterSetDefinition__ExtendsAssignment_2_2_1 )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_2_2_1()); 
            // InternalParameterDefinition.g:1569:2: ( rule__ParameterSetDefinition__ExtendsAssignment_2_2_1 )
            // InternalParameterDefinition.g:1569:3: rule__ParameterSetDefinition__ExtendsAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__ExtendsAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_2_2__1__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group__0"
    // InternalParameterDefinition.g:1578:1: rule__ParameterDefinition__Group__0 : rule__ParameterDefinition__Group__0__Impl rule__ParameterDefinition__Group__1 ;
    public final void rule__ParameterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1582:1: ( rule__ParameterDefinition__Group__0__Impl rule__ParameterDefinition__Group__1 )
            // InternalParameterDefinition.g:1583:2: rule__ParameterDefinition__Group__0__Impl rule__ParameterDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__ParameterDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__0"


    // $ANTLR start "rule__ParameterDefinition__Group__0__Impl"
    // InternalParameterDefinition.g:1590:1: rule__ParameterDefinition__Group__0__Impl : ( 'Parameter' ) ;
    public final void rule__ParameterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1594:1: ( ( 'Parameter' ) )
            // InternalParameterDefinition.g:1595:1: ( 'Parameter' )
            {
            // InternalParameterDefinition.g:1595:1: ( 'Parameter' )
            // InternalParameterDefinition.g:1596:2: 'Parameter'
            {
             before(grammarAccess.getParameterDefinitionAccess().getParameterKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParameterDefinitionAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__0__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group__1"
    // InternalParameterDefinition.g:1605:1: rule__ParameterDefinition__Group__1 : rule__ParameterDefinition__Group__1__Impl rule__ParameterDefinition__Group__2 ;
    public final void rule__ParameterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1609:1: ( rule__ParameterDefinition__Group__1__Impl rule__ParameterDefinition__Group__2 )
            // InternalParameterDefinition.g:1610:2: rule__ParameterDefinition__Group__1__Impl rule__ParameterDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__ParameterDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__1"


    // $ANTLR start "rule__ParameterDefinition__Group__1__Impl"
    // InternalParameterDefinition.g:1617:1: rule__ParameterDefinition__Group__1__Impl : ( ( rule__ParameterDefinition__NameAssignment_1 ) ) ;
    public final void rule__ParameterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1621:1: ( ( ( rule__ParameterDefinition__NameAssignment_1 ) ) )
            // InternalParameterDefinition.g:1622:1: ( ( rule__ParameterDefinition__NameAssignment_1 ) )
            {
            // InternalParameterDefinition.g:1622:1: ( ( rule__ParameterDefinition__NameAssignment_1 ) )
            // InternalParameterDefinition.g:1623:2: ( rule__ParameterDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getParameterDefinitionAccess().getNameAssignment_1()); 
            // InternalParameterDefinition.g:1624:2: ( rule__ParameterDefinition__NameAssignment_1 )
            // InternalParameterDefinition.g:1624:3: rule__ParameterDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__1__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group__2"
    // InternalParameterDefinition.g:1632:1: rule__ParameterDefinition__Group__2 : rule__ParameterDefinition__Group__2__Impl rule__ParameterDefinition__Group__3 ;
    public final void rule__ParameterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1636:1: ( rule__ParameterDefinition__Group__2__Impl rule__ParameterDefinition__Group__3 )
            // InternalParameterDefinition.g:1637:2: rule__ParameterDefinition__Group__2__Impl rule__ParameterDefinition__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__ParameterDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__2"


    // $ANTLR start "rule__ParameterDefinition__Group__2__Impl"
    // InternalParameterDefinition.g:1644:1: rule__ParameterDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__ParameterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1648:1: ( ( '{' ) )
            // InternalParameterDefinition.g:1649:1: ( '{' )
            {
            // InternalParameterDefinition.g:1649:1: ( '{' )
            // InternalParameterDefinition.g:1650:2: '{'
            {
             before(grammarAccess.getParameterDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getParameterDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__2__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group__3"
    // InternalParameterDefinition.g:1659:1: rule__ParameterDefinition__Group__3 : rule__ParameterDefinition__Group__3__Impl rule__ParameterDefinition__Group__4 ;
    public final void rule__ParameterDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1663:1: ( rule__ParameterDefinition__Group__3__Impl rule__ParameterDefinition__Group__4 )
            // InternalParameterDefinition.g:1664:2: rule__ParameterDefinition__Group__3__Impl rule__ParameterDefinition__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__ParameterDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__3"


    // $ANTLR start "rule__ParameterDefinition__Group__3__Impl"
    // InternalParameterDefinition.g:1671:1: rule__ParameterDefinition__Group__3__Impl : ( ( rule__ParameterDefinition__AttributesAssignment_3 )* ) ;
    public final void rule__ParameterDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1675:1: ( ( ( rule__ParameterDefinition__AttributesAssignment_3 )* ) )
            // InternalParameterDefinition.g:1676:1: ( ( rule__ParameterDefinition__AttributesAssignment_3 )* )
            {
            // InternalParameterDefinition.g:1676:1: ( ( rule__ParameterDefinition__AttributesAssignment_3 )* )
            // InternalParameterDefinition.g:1677:2: ( rule__ParameterDefinition__AttributesAssignment_3 )*
            {
             before(grammarAccess.getParameterDefinitionAccess().getAttributesAssignment_3()); 
            // InternalParameterDefinition.g:1678:2: ( rule__ParameterDefinition__AttributesAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ID) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalParameterDefinition.g:1678:3: rule__ParameterDefinition__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ParameterDefinition__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getParameterDefinitionAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__3__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group__4"
    // InternalParameterDefinition.g:1686:1: rule__ParameterDefinition__Group__4 : rule__ParameterDefinition__Group__4__Impl ;
    public final void rule__ParameterDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1690:1: ( rule__ParameterDefinition__Group__4__Impl )
            // InternalParameterDefinition.g:1691:2: rule__ParameterDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__4"


    // $ANTLR start "rule__ParameterDefinition__Group__4__Impl"
    // InternalParameterDefinition.g:1697:1: rule__ParameterDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__ParameterDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1701:1: ( ( '}' ) )
            // InternalParameterDefinition.g:1702:1: ( '}' )
            {
            // InternalParameterDefinition.g:1702:1: ( '}' )
            // InternalParameterDefinition.g:1703:2: '}'
            {
             before(grammarAccess.getParameterDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getParameterDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__4__Impl"


    // $ANTLR start "rule__TriggerDefinition__Group__0"
    // InternalParameterDefinition.g:1713:1: rule__TriggerDefinition__Group__0 : rule__TriggerDefinition__Group__0__Impl rule__TriggerDefinition__Group__1 ;
    public final void rule__TriggerDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1717:1: ( rule__TriggerDefinition__Group__0__Impl rule__TriggerDefinition__Group__1 )
            // InternalParameterDefinition.g:1718:2: rule__TriggerDefinition__Group__0__Impl rule__TriggerDefinition__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__TriggerDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__0"


    // $ANTLR start "rule__TriggerDefinition__Group__0__Impl"
    // InternalParameterDefinition.g:1725:1: rule__TriggerDefinition__Group__0__Impl : ( 'Trigger' ) ;
    public final void rule__TriggerDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1729:1: ( ( 'Trigger' ) )
            // InternalParameterDefinition.g:1730:1: ( 'Trigger' )
            {
            // InternalParameterDefinition.g:1730:1: ( 'Trigger' )
            // InternalParameterDefinition.g:1731:2: 'Trigger'
            {
             before(grammarAccess.getTriggerDefinitionAccess().getTriggerKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTriggerDefinitionAccess().getTriggerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__0__Impl"


    // $ANTLR start "rule__TriggerDefinition__Group__1"
    // InternalParameterDefinition.g:1740:1: rule__TriggerDefinition__Group__1 : rule__TriggerDefinition__Group__1__Impl rule__TriggerDefinition__Group__2 ;
    public final void rule__TriggerDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1744:1: ( rule__TriggerDefinition__Group__1__Impl rule__TriggerDefinition__Group__2 )
            // InternalParameterDefinition.g:1745:2: rule__TriggerDefinition__Group__1__Impl rule__TriggerDefinition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__TriggerDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__1"


    // $ANTLR start "rule__TriggerDefinition__Group__1__Impl"
    // InternalParameterDefinition.g:1752:1: rule__TriggerDefinition__Group__1__Impl : ( ( rule__TriggerDefinition__NameAssignment_1 ) ) ;
    public final void rule__TriggerDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1756:1: ( ( ( rule__TriggerDefinition__NameAssignment_1 ) ) )
            // InternalParameterDefinition.g:1757:1: ( ( rule__TriggerDefinition__NameAssignment_1 ) )
            {
            // InternalParameterDefinition.g:1757:1: ( ( rule__TriggerDefinition__NameAssignment_1 ) )
            // InternalParameterDefinition.g:1758:2: ( rule__TriggerDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getTriggerDefinitionAccess().getNameAssignment_1()); 
            // InternalParameterDefinition.g:1759:2: ( rule__TriggerDefinition__NameAssignment_1 )
            // InternalParameterDefinition.g:1759:3: rule__TriggerDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TriggerDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTriggerDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__1__Impl"


    // $ANTLR start "rule__TriggerDefinition__Group__2"
    // InternalParameterDefinition.g:1767:1: rule__TriggerDefinition__Group__2 : rule__TriggerDefinition__Group__2__Impl rule__TriggerDefinition__Group__3 ;
    public final void rule__TriggerDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1771:1: ( rule__TriggerDefinition__Group__2__Impl rule__TriggerDefinition__Group__3 )
            // InternalParameterDefinition.g:1772:2: rule__TriggerDefinition__Group__2__Impl rule__TriggerDefinition__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__TriggerDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__2"


    // $ANTLR start "rule__TriggerDefinition__Group__2__Impl"
    // InternalParameterDefinition.g:1779:1: rule__TriggerDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__TriggerDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1783:1: ( ( '{' ) )
            // InternalParameterDefinition.g:1784:1: ( '{' )
            {
            // InternalParameterDefinition.g:1784:1: ( '{' )
            // InternalParameterDefinition.g:1785:2: '{'
            {
             before(grammarAccess.getTriggerDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getTriggerDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__2__Impl"


    // $ANTLR start "rule__TriggerDefinition__Group__3"
    // InternalParameterDefinition.g:1794:1: rule__TriggerDefinition__Group__3 : rule__TriggerDefinition__Group__3__Impl rule__TriggerDefinition__Group__4 ;
    public final void rule__TriggerDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1798:1: ( rule__TriggerDefinition__Group__3__Impl rule__TriggerDefinition__Group__4 )
            // InternalParameterDefinition.g:1799:2: rule__TriggerDefinition__Group__3__Impl rule__TriggerDefinition__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__TriggerDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__3"


    // $ANTLR start "rule__TriggerDefinition__Group__3__Impl"
    // InternalParameterDefinition.g:1806:1: rule__TriggerDefinition__Group__3__Impl : ( ( rule__TriggerDefinition__AttributesAssignment_3 )* ) ;
    public final void rule__TriggerDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1810:1: ( ( ( rule__TriggerDefinition__AttributesAssignment_3 )* ) )
            // InternalParameterDefinition.g:1811:1: ( ( rule__TriggerDefinition__AttributesAssignment_3 )* )
            {
            // InternalParameterDefinition.g:1811:1: ( ( rule__TriggerDefinition__AttributesAssignment_3 )* )
            // InternalParameterDefinition.g:1812:2: ( rule__TriggerDefinition__AttributesAssignment_3 )*
            {
             before(grammarAccess.getTriggerDefinitionAccess().getAttributesAssignment_3()); 
            // InternalParameterDefinition.g:1813:2: ( rule__TriggerDefinition__AttributesAssignment_3 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_ID) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalParameterDefinition.g:1813:3: rule__TriggerDefinition__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__TriggerDefinition__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getTriggerDefinitionAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__3__Impl"


    // $ANTLR start "rule__TriggerDefinition__Group__4"
    // InternalParameterDefinition.g:1821:1: rule__TriggerDefinition__Group__4 : rule__TriggerDefinition__Group__4__Impl ;
    public final void rule__TriggerDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1825:1: ( rule__TriggerDefinition__Group__4__Impl )
            // InternalParameterDefinition.g:1826:2: rule__TriggerDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TriggerDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__4"


    // $ANTLR start "rule__TriggerDefinition__Group__4__Impl"
    // InternalParameterDefinition.g:1832:1: rule__TriggerDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__TriggerDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1836:1: ( ( '}' ) )
            // InternalParameterDefinition.g:1837:1: ( '}' )
            {
            // InternalParameterDefinition.g:1837:1: ( '}' )
            // InternalParameterDefinition.g:1838:2: '}'
            {
             before(grammarAccess.getTriggerDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTriggerDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__4__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__0"
    // InternalParameterDefinition.g:1848:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1852:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalParameterDefinition.g:1853:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__AttributeDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__0"


    // $ANTLR start "rule__AttributeDefinition__Group__0__Impl"
    // InternalParameterDefinition.g:1860:1: rule__AttributeDefinition__Group__0__Impl : ( ( rule__AttributeDefinition__NameAssignment_0 ) ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1864:1: ( ( ( rule__AttributeDefinition__NameAssignment_0 ) ) )
            // InternalParameterDefinition.g:1865:1: ( ( rule__AttributeDefinition__NameAssignment_0 ) )
            {
            // InternalParameterDefinition.g:1865:1: ( ( rule__AttributeDefinition__NameAssignment_0 ) )
            // InternalParameterDefinition.g:1866:2: ( rule__AttributeDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_0()); 
            // InternalParameterDefinition.g:1867:2: ( rule__AttributeDefinition__NameAssignment_0 )
            // InternalParameterDefinition.g:1867:3: rule__AttributeDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__0__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__1"
    // InternalParameterDefinition.g:1875:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1879:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalParameterDefinition.g:1880:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__AttributeDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__1"


    // $ANTLR start "rule__AttributeDefinition__Group__1__Impl"
    // InternalParameterDefinition.g:1887:1: rule__AttributeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1891:1: ( ( ':' ) )
            // InternalParameterDefinition.g:1892:1: ( ':' )
            {
            // InternalParameterDefinition.g:1892:1: ( ':' )
            // InternalParameterDefinition.g:1893:2: ':'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__1__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__2"
    // InternalParameterDefinition.g:1902:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1906:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalParameterDefinition.g:1907:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__AttributeDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__2"


    // $ANTLR start "rule__AttributeDefinition__Group__2__Impl"
    // InternalParameterDefinition.g:1914:1: rule__AttributeDefinition__Group__2__Impl : ( ( rule__AttributeDefinition__TypeAssignment_2 ) ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1918:1: ( ( ( rule__AttributeDefinition__TypeAssignment_2 ) ) )
            // InternalParameterDefinition.g:1919:1: ( ( rule__AttributeDefinition__TypeAssignment_2 ) )
            {
            // InternalParameterDefinition.g:1919:1: ( ( rule__AttributeDefinition__TypeAssignment_2 ) )
            // InternalParameterDefinition.g:1920:2: ( rule__AttributeDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2()); 
            // InternalParameterDefinition.g:1921:2: ( rule__AttributeDefinition__TypeAssignment_2 )
            // InternalParameterDefinition.g:1921:3: rule__AttributeDefinition__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__2__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__3"
    // InternalParameterDefinition.g:1929:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1933:1: ( rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 )
            // InternalParameterDefinition.g:1934:2: rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__AttributeDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__3"


    // $ANTLR start "rule__AttributeDefinition__Group__3__Impl"
    // InternalParameterDefinition.g:1941:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__Group_3__0 )? ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1945:1: ( ( ( rule__AttributeDefinition__Group_3__0 )? ) )
            // InternalParameterDefinition.g:1946:1: ( ( rule__AttributeDefinition__Group_3__0 )? )
            {
            // InternalParameterDefinition.g:1946:1: ( ( rule__AttributeDefinition__Group_3__0 )? )
            // InternalParameterDefinition.g:1947:2: ( rule__AttributeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup_3()); 
            // InternalParameterDefinition.g:1948:2: ( rule__AttributeDefinition__Group_3__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalParameterDefinition.g:1948:3: rule__AttributeDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__3__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__4"
    // InternalParameterDefinition.g:1956:1: rule__AttributeDefinition__Group__4 : rule__AttributeDefinition__Group__4__Impl ;
    public final void rule__AttributeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1960:1: ( rule__AttributeDefinition__Group__4__Impl )
            // InternalParameterDefinition.g:1961:2: rule__AttributeDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__4"


    // $ANTLR start "rule__AttributeDefinition__Group__4__Impl"
    // InternalParameterDefinition.g:1967:1: rule__AttributeDefinition__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__AttributeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1971:1: ( ( ( ';' )? ) )
            // InternalParameterDefinition.g:1972:1: ( ( ';' )? )
            {
            // InternalParameterDefinition.g:1972:1: ( ( ';' )? )
            // InternalParameterDefinition.g:1973:2: ( ';' )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4()); 
            // InternalParameterDefinition.g:1974:2: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==30) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalParameterDefinition.g:1974:3: ';'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__4__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group_3__0"
    // InternalParameterDefinition.g:1983:1: rule__AttributeDefinition__Group_3__0 : rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1 ;
    public final void rule__AttributeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1987:1: ( rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1 )
            // InternalParameterDefinition.g:1988:2: rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_21);
            rule__AttributeDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3__0"


    // $ANTLR start "rule__AttributeDefinition__Group_3__0__Impl"
    // InternalParameterDefinition.g:1995:1: rule__AttributeDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__AttributeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1999:1: ( ( '=' ) )
            // InternalParameterDefinition.g:2000:1: ( '=' )
            {
            // InternalParameterDefinition.g:2000:1: ( '=' )
            // InternalParameterDefinition.g:2001:2: '='
            {
             before(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group_3__1"
    // InternalParameterDefinition.g:2010:1: rule__AttributeDefinition__Group_3__1 : rule__AttributeDefinition__Group_3__1__Impl ;
    public final void rule__AttributeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2014:1: ( rule__AttributeDefinition__Group_3__1__Impl )
            // InternalParameterDefinition.g:2015:2: rule__AttributeDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3__1"


    // $ANTLR start "rule__AttributeDefinition__Group_3__1__Impl"
    // InternalParameterDefinition.g:2021:1: rule__AttributeDefinition__Group_3__1__Impl : ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) ) ;
    public final void rule__AttributeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2025:1: ( ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) ) )
            // InternalParameterDefinition.g:2026:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) )
            {
            // InternalParameterDefinition.g:2026:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) )
            // InternalParameterDefinition.g:2027:2: ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_3_1()); 
            // InternalParameterDefinition.g:2028:2: ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 )
            // InternalParameterDefinition.g:2028:3: rule__AttributeDefinition__DefaultvalueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__DefaultvalueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalParameterDefinition.g:2037:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2041:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalParameterDefinition.g:2042:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalParameterDefinition.g:2049:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2053:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:2054:1: ( RULE_ID )
            {
            // InternalParameterDefinition.g:2054:1: ( RULE_ID )
            // InternalParameterDefinition.g:2055:2: RULE_ID
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
    // InternalParameterDefinition.g:2064:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2068:1: ( rule__FQN__Group__1__Impl )
            // InternalParameterDefinition.g:2069:2: rule__FQN__Group__1__Impl
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
    // InternalParameterDefinition.g:2075:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2079:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalParameterDefinition.g:2080:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalParameterDefinition.g:2080:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalParameterDefinition.g:2081:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalParameterDefinition.g:2082:2: ( rule__FQN__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==41) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalParameterDefinition.g:2082:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalParameterDefinition.g:2091:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2095:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalParameterDefinition.g:2096:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalParameterDefinition.g:2103:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2107:1: ( ( '.' ) )
            // InternalParameterDefinition.g:2108:1: ( '.' )
            {
            // InternalParameterDefinition.g:2108:1: ( '.' )
            // InternalParameterDefinition.g:2109:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalParameterDefinition.g:2118:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2122:1: ( rule__FQN__Group_1__1__Impl )
            // InternalParameterDefinition.g:2123:2: rule__FQN__Group_1__1__Impl
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
    // InternalParameterDefinition.g:2129:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2133:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:2134:1: ( RULE_ID )
            {
            // InternalParameterDefinition.g:2134:1: ( RULE_ID )
            // InternalParameterDefinition.g:2135:2: RULE_ID
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalParameterDefinition.g:2145:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2149:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalParameterDefinition.g:2150:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalParameterDefinition.g:2157:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2161:1: ( ( ( '-' )? ) )
            // InternalParameterDefinition.g:2162:1: ( ( '-' )? )
            {
            // InternalParameterDefinition.g:2162:1: ( ( '-' )? )
            // InternalParameterDefinition.g:2163:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalParameterDefinition.g:2164:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==42) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalParameterDefinition.g:2164:3: '-'
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalParameterDefinition.g:2172:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2176:1: ( rule__EInt__Group__1__Impl )
            // InternalParameterDefinition.g:2177:2: rule__EInt__Group__1__Impl
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
    // InternalParameterDefinition.g:2183:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2187:1: ( ( RULE_INT ) )
            // InternalParameterDefinition.g:2188:1: ( RULE_INT )
            {
            // InternalParameterDefinition.g:2188:1: ( RULE_INT )
            // InternalParameterDefinition.g:2189:2: RULE_INT
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


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalParameterDefinition.g:2199:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2203:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalParameterDefinition.g:2204:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalParameterDefinition.g:2211:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2215:1: ( ( ( '-' )? ) )
            // InternalParameterDefinition.g:2216:1: ( ( '-' )? )
            {
            // InternalParameterDefinition.g:2216:1: ( ( '-' )? )
            // InternalParameterDefinition.g:2217:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalParameterDefinition.g:2218:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==42) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalParameterDefinition.g:2218:3: '-'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalParameterDefinition.g:2226:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2230:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalParameterDefinition.g:2231:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalParameterDefinition.g:2238:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2242:1: ( ( ( RULE_INT )? ) )
            // InternalParameterDefinition.g:2243:1: ( ( RULE_INT )? )
            {
            // InternalParameterDefinition.g:2243:1: ( ( RULE_INT )? )
            // InternalParameterDefinition.g:2244:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalParameterDefinition.g:2245:2: ( RULE_INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalParameterDefinition.g:2245:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalParameterDefinition.g:2253:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2257:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalParameterDefinition.g:2258:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalParameterDefinition.g:2265:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2269:1: ( ( '.' ) )
            // InternalParameterDefinition.g:2270:1: ( '.' )
            {
            // InternalParameterDefinition.g:2270:1: ( '.' )
            // InternalParameterDefinition.g:2271:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalParameterDefinition.g:2280:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2284:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalParameterDefinition.g:2285:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalParameterDefinition.g:2292:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2296:1: ( ( RULE_INT ) )
            // InternalParameterDefinition.g:2297:1: ( RULE_INT )
            {
            // InternalParameterDefinition.g:2297:1: ( RULE_INT )
            // InternalParameterDefinition.g:2298:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalParameterDefinition.g:2307:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2311:1: ( rule__EDouble__Group__4__Impl )
            // InternalParameterDefinition.g:2312:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalParameterDefinition.g:2318:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2322:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalParameterDefinition.g:2323:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalParameterDefinition.g:2323:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalParameterDefinition.g:2324:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalParameterDefinition.g:2325:2: ( rule__EDouble__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=13 && LA25_0<=14)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalParameterDefinition.g:2325:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalParameterDefinition.g:2334:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2338:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalParameterDefinition.g:2339:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalParameterDefinition.g:2346:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2350:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalParameterDefinition.g:2351:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalParameterDefinition.g:2351:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalParameterDefinition.g:2352:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalParameterDefinition.g:2353:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalParameterDefinition.g:2353:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalParameterDefinition.g:2361:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2365:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalParameterDefinition.g:2366:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_24);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalParameterDefinition.g:2373:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2377:1: ( ( ( '-' )? ) )
            // InternalParameterDefinition.g:2378:1: ( ( '-' )? )
            {
            // InternalParameterDefinition.g:2378:1: ( ( '-' )? )
            // InternalParameterDefinition.g:2379:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalParameterDefinition.g:2380:2: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalParameterDefinition.g:2380:3: '-'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalParameterDefinition.g:2388:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2392:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalParameterDefinition.g:2393:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalParameterDefinition.g:2399:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2403:1: ( ( RULE_INT ) )
            // InternalParameterDefinition.g:2404:1: ( RULE_INT )
            {
            // InternalParameterDefinition.g:2404:1: ( RULE_INT )
            // InternalParameterDefinition.g:2405:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__EnumerationElement__Group__0"
    // InternalParameterDefinition.g:2415:1: rule__EnumerationElement__Group__0 : rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 ;
    public final void rule__EnumerationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2419:1: ( rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 )
            // InternalParameterDefinition.g:2420:2: rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__EnumerationElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__Group__0"


    // $ANTLR start "rule__EnumerationElement__Group__0__Impl"
    // InternalParameterDefinition.g:2427:1: rule__EnumerationElement__Group__0__Impl : ( ( rule__EnumerationElement__NameAssignment_0 ) ) ;
    public final void rule__EnumerationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2431:1: ( ( ( rule__EnumerationElement__NameAssignment_0 ) ) )
            // InternalParameterDefinition.g:2432:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            {
            // InternalParameterDefinition.g:2432:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            // InternalParameterDefinition.g:2433:2: ( rule__EnumerationElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 
            // InternalParameterDefinition.g:2434:2: ( rule__EnumerationElement__NameAssignment_0 )
            // InternalParameterDefinition.g:2434:3: rule__EnumerationElement__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__Group__0__Impl"


    // $ANTLR start "rule__EnumerationElement__Group__1"
    // InternalParameterDefinition.g:2442:1: rule__EnumerationElement__Group__1 : rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 ;
    public final void rule__EnumerationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2446:1: ( rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 )
            // InternalParameterDefinition.g:2447:2: rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__EnumerationElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__Group__1"


    // $ANTLR start "rule__EnumerationElement__Group__1__Impl"
    // InternalParameterDefinition.g:2454:1: rule__EnumerationElement__Group__1__Impl : ( ( rule__EnumerationElement__Group_1__0 )? ) ;
    public final void rule__EnumerationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2458:1: ( ( ( rule__EnumerationElement__Group_1__0 )? ) )
            // InternalParameterDefinition.g:2459:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            {
            // InternalParameterDefinition.g:2459:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            // InternalParameterDefinition.g:2460:2: ( rule__EnumerationElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup_1()); 
            // InternalParameterDefinition.g:2461:2: ( rule__EnumerationElement__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalParameterDefinition.g:2461:3: rule__EnumerationElement__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EnumerationElement__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEnumerationElementAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__Group__1__Impl"


    // $ANTLR start "rule__EnumerationElement__Group__2"
    // InternalParameterDefinition.g:2469:1: rule__EnumerationElement__Group__2 : rule__EnumerationElement__Group__2__Impl ;
    public final void rule__EnumerationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2473:1: ( rule__EnumerationElement__Group__2__Impl )
            // InternalParameterDefinition.g:2474:2: rule__EnumerationElement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__Group__2"


    // $ANTLR start "rule__EnumerationElement__Group__2__Impl"
    // InternalParameterDefinition.g:2480:1: rule__EnumerationElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__EnumerationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2484:1: ( ( ( ';' )? ) )
            // InternalParameterDefinition.g:2485:1: ( ( ';' )? )
            {
            // InternalParameterDefinition.g:2485:1: ( ( ';' )? )
            // InternalParameterDefinition.g:2486:2: ( ';' )?
            {
             before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 
            // InternalParameterDefinition.g:2487:2: ( ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalParameterDefinition.g:2487:3: ';'
                    {
                    match(input,30,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__Group__2__Impl"


    // $ANTLR start "rule__EnumerationElement__Group_1__0"
    // InternalParameterDefinition.g:2496:1: rule__EnumerationElement__Group_1__0 : rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 ;
    public final void rule__EnumerationElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2500:1: ( rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 )
            // InternalParameterDefinition.g:2501:2: rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__EnumerationElement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EnumerationElement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__Group_1__0"


    // $ANTLR start "rule__EnumerationElement__Group_1__0__Impl"
    // InternalParameterDefinition.g:2508:1: rule__EnumerationElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2512:1: ( ( '=' ) )
            // InternalParameterDefinition.g:2513:1: ( '=' )
            {
            // InternalParameterDefinition.g:2513:1: ( '=' )
            // InternalParameterDefinition.g:2514:2: '='
            {
             before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__Group_1__0__Impl"


    // $ANTLR start "rule__EnumerationElement__Group_1__1"
    // InternalParameterDefinition.g:2523:1: rule__EnumerationElement__Group_1__1 : rule__EnumerationElement__Group_1__1__Impl ;
    public final void rule__EnumerationElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2527:1: ( rule__EnumerationElement__Group_1__1__Impl )
            // InternalParameterDefinition.g:2528:2: rule__EnumerationElement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationElement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__Group_1__1"


    // $ANTLR start "rule__EnumerationElement__Group_1__1__Impl"
    // InternalParameterDefinition.g:2534:1: rule__EnumerationElement__Group_1__1__Impl : ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2538:1: ( ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) )
            // InternalParameterDefinition.g:2539:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            {
            // InternalParameterDefinition.g:2539:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            // InternalParameterDefinition.g:2540:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 
            // InternalParameterDefinition.g:2541:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            // InternalParameterDefinition.g:2541:3: rule__EnumerationElement__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EnumerationElement__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__Group_1__1__Impl"


    // $ANTLR start "rule__InlineEnumerationType__Group__0"
    // InternalParameterDefinition.g:2550:1: rule__InlineEnumerationType__Group__0 : rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 ;
    public final void rule__InlineEnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2554:1: ( rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 )
            // InternalParameterDefinition.g:2555:2: rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__InlineEnumerationType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineEnumerationType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__Group__0"


    // $ANTLR start "rule__InlineEnumerationType__Group__0__Impl"
    // InternalParameterDefinition.g:2562:1: rule__InlineEnumerationType__Group__0__Impl : ( 'InlineEnumeration' ) ;
    public final void rule__InlineEnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2566:1: ( ( 'InlineEnumeration' ) )
            // InternalParameterDefinition.g:2567:1: ( 'InlineEnumeration' )
            {
            // InternalParameterDefinition.g:2567:1: ( 'InlineEnumeration' )
            // InternalParameterDefinition.g:2568:2: 'InlineEnumeration'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__Group__0__Impl"


    // $ANTLR start "rule__InlineEnumerationType__Group__1"
    // InternalParameterDefinition.g:2577:1: rule__InlineEnumerationType__Group__1 : rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 ;
    public final void rule__InlineEnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2581:1: ( rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 )
            // InternalParameterDefinition.g:2582:2: rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__InlineEnumerationType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineEnumerationType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__Group__1"


    // $ANTLR start "rule__InlineEnumerationType__Group__1__Impl"
    // InternalParameterDefinition.g:2589:1: rule__InlineEnumerationType__Group__1__Impl : ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) ;
    public final void rule__InlineEnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2593:1: ( ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) )
            // InternalParameterDefinition.g:2594:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            {
            // InternalParameterDefinition.g:2594:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            // InternalParameterDefinition.g:2595:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 
            // InternalParameterDefinition.g:2596:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==44) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalParameterDefinition.g:2596:3: rule__InlineEnumerationType__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InlineEnumerationType__ArrayAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__Group__1__Impl"


    // $ANTLR start "rule__InlineEnumerationType__Group__2"
    // InternalParameterDefinition.g:2604:1: rule__InlineEnumerationType__Group__2 : rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 ;
    public final void rule__InlineEnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2608:1: ( rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 )
            // InternalParameterDefinition.g:2609:2: rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__InlineEnumerationType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineEnumerationType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__Group__2"


    // $ANTLR start "rule__InlineEnumerationType__Group__2__Impl"
    // InternalParameterDefinition.g:2616:1: rule__InlineEnumerationType__Group__2__Impl : ( '{' ) ;
    public final void rule__InlineEnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2620:1: ( ( '{' ) )
            // InternalParameterDefinition.g:2621:1: ( '{' )
            {
            // InternalParameterDefinition.g:2621:1: ( '{' )
            // InternalParameterDefinition.g:2622:2: '{'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__Group__2__Impl"


    // $ANTLR start "rule__InlineEnumerationType__Group__3"
    // InternalParameterDefinition.g:2631:1: rule__InlineEnumerationType__Group__3 : rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 ;
    public final void rule__InlineEnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2635:1: ( rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 )
            // InternalParameterDefinition.g:2636:2: rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__InlineEnumerationType__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InlineEnumerationType__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__Group__3"


    // $ANTLR start "rule__InlineEnumerationType__Group__3__Impl"
    // InternalParameterDefinition.g:2643:1: rule__InlineEnumerationType__Group__3__Impl : ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) ;
    public final void rule__InlineEnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2647:1: ( ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) )
            // InternalParameterDefinition.g:2648:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            {
            // InternalParameterDefinition.g:2648:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            // InternalParameterDefinition.g:2649:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            {
            // InternalParameterDefinition.g:2649:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) )
            // InternalParameterDefinition.g:2650:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalParameterDefinition.g:2651:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            // InternalParameterDefinition.g:2651:4: rule__InlineEnumerationType__EnumsAssignment_3
            {
            pushFollow(FOLLOW_17);
            rule__InlineEnumerationType__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }

            // InternalParameterDefinition.g:2654:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            // InternalParameterDefinition.g:2655:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalParameterDefinition.g:2656:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalParameterDefinition.g:2656:4: rule__InlineEnumerationType__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__InlineEnumerationType__EnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__Group__3__Impl"


    // $ANTLR start "rule__InlineEnumerationType__Group__4"
    // InternalParameterDefinition.g:2665:1: rule__InlineEnumerationType__Group__4 : rule__InlineEnumerationType__Group__4__Impl ;
    public final void rule__InlineEnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2669:1: ( rule__InlineEnumerationType__Group__4__Impl )
            // InternalParameterDefinition.g:2670:2: rule__InlineEnumerationType__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InlineEnumerationType__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__Group__4"


    // $ANTLR start "rule__InlineEnumerationType__Group__4__Impl"
    // InternalParameterDefinition.g:2676:1: rule__InlineEnumerationType__Group__4__Impl : ( '}' ) ;
    public final void rule__InlineEnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2680:1: ( ( '}' ) )
            // InternalParameterDefinition.g:2681:1: ( '}' )
            {
            // InternalParameterDefinition.g:2681:1: ( '}' )
            // InternalParameterDefinition.g:2682:2: '}'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__Group__4__Impl"


    // $ANTLR start "rule__ArrayType__Group__0"
    // InternalParameterDefinition.g:2692:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2696:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalParameterDefinition.g:2697:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__ArrayType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0"


    // $ANTLR start "rule__ArrayType__Group__0__Impl"
    // InternalParameterDefinition.g:2704:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2708:1: ( ( () ) )
            // InternalParameterDefinition.g:2709:1: ( () )
            {
            // InternalParameterDefinition.g:2709:1: ( () )
            // InternalParameterDefinition.g:2710:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // InternalParameterDefinition.g:2711:2: ()
            // InternalParameterDefinition.g:2711:3: 
            {
            }

             after(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__0__Impl"


    // $ANTLR start "rule__ArrayType__Group__1"
    // InternalParameterDefinition.g:2719:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2723:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalParameterDefinition.g:2724:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__ArrayType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1"


    // $ANTLR start "rule__ArrayType__Group__1__Impl"
    // InternalParameterDefinition.g:2731:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2735:1: ( ( '[' ) )
            // InternalParameterDefinition.g:2736:1: ( '[' )
            {
            // InternalParameterDefinition.g:2736:1: ( '[' )
            // InternalParameterDefinition.g:2737:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__1__Impl"


    // $ANTLR start "rule__ArrayType__Group__2"
    // InternalParameterDefinition.g:2746:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2750:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalParameterDefinition.g:2751:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__ArrayType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2"


    // $ANTLR start "rule__ArrayType__Group__2__Impl"
    // InternalParameterDefinition.g:2758:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__LengthAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2762:1: ( ( ( rule__ArrayType__LengthAssignment_2 )? ) )
            // InternalParameterDefinition.g:2763:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            {
            // InternalParameterDefinition.g:2763:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            // InternalParameterDefinition.g:2764:2: ( rule__ArrayType__LengthAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 
            // InternalParameterDefinition.g:2765:2: ( rule__ArrayType__LengthAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT||LA31_0==15) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalParameterDefinition.g:2765:3: rule__ArrayType__LengthAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayType__LengthAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__2__Impl"


    // $ANTLR start "rule__ArrayType__Group__3"
    // InternalParameterDefinition.g:2773:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2777:1: ( rule__ArrayType__Group__3__Impl )
            // InternalParameterDefinition.g:2778:2: rule__ArrayType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3"


    // $ANTLR start "rule__ArrayType__Group__3__Impl"
    // InternalParameterDefinition.g:2784:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2788:1: ( ( ']' ) )
            // InternalParameterDefinition.g:2789:1: ( ']' )
            {
            // InternalParameterDefinition.g:2789:1: ( ']' )
            // InternalParameterDefinition.g:2790:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__Group__3__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__0"
    // InternalParameterDefinition.g:2800:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2804:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalParameterDefinition.g:2805:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__PrimitiveType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__0"


    // $ANTLR start "rule__PrimitiveType__Group__0__Impl"
    // InternalParameterDefinition.g:2812:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2816:1: ( ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) )
            // InternalParameterDefinition.g:2817:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            {
            // InternalParameterDefinition.g:2817:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            // InternalParameterDefinition.g:2818:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 
            // InternalParameterDefinition.g:2819:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            // InternalParameterDefinition.g:2819:3: rule__PrimitiveType__TypeNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__TypeNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__0__Impl"


    // $ANTLR start "rule__PrimitiveType__Group__1"
    // InternalParameterDefinition.g:2827:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2831:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalParameterDefinition.g:2832:2: rule__PrimitiveType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__1"


    // $ANTLR start "rule__PrimitiveType__Group__1__Impl"
    // InternalParameterDefinition.g:2838:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2842:1: ( ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) )
            // InternalParameterDefinition.g:2843:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            {
            // InternalParameterDefinition.g:2843:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            // InternalParameterDefinition.g:2844:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 
            // InternalParameterDefinition.g:2845:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==44) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalParameterDefinition.g:2845:3: rule__PrimitiveType__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PrimitiveType__ArrayAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__Group__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalParameterDefinition.g:2854:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2858:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalParameterDefinition.g:2859:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__ArrayValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__0"


    // $ANTLR start "rule__ArrayValue__Group__0__Impl"
    // InternalParameterDefinition.g:2866:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2870:1: ( ( '[' ) )
            // InternalParameterDefinition.g:2871:1: ( '[' )
            {
            // InternalParameterDefinition.g:2871:1: ( '[' )
            // InternalParameterDefinition.g:2872:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group__1"
    // InternalParameterDefinition.g:2881:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2885:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalParameterDefinition.g:2886:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_33);
            rule__ArrayValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__1"


    // $ANTLR start "rule__ArrayValue__Group__1__Impl"
    // InternalParameterDefinition.g:2893:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2897:1: ( ( ( rule__ArrayValue__ValuesAssignment_1 ) ) )
            // InternalParameterDefinition.g:2898:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            {
            // InternalParameterDefinition.g:2898:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            // InternalParameterDefinition.g:2899:2: ( rule__ArrayValue__ValuesAssignment_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 
            // InternalParameterDefinition.g:2900:2: ( rule__ArrayValue__ValuesAssignment_1 )
            // InternalParameterDefinition.g:2900:3: rule__ArrayValue__ValuesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__ValuesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group__2"
    // InternalParameterDefinition.g:2908:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2912:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalParameterDefinition.g:2913:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_33);
            rule__ArrayValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__2"


    // $ANTLR start "rule__ArrayValue__Group__2__Impl"
    // InternalParameterDefinition.g:2920:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )* ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2924:1: ( ( ( rule__ArrayValue__Group_2__0 )* ) )
            // InternalParameterDefinition.g:2925:1: ( ( rule__ArrayValue__Group_2__0 )* )
            {
            // InternalParameterDefinition.g:2925:1: ( ( rule__ArrayValue__Group_2__0 )* )
            // InternalParameterDefinition.g:2926:2: ( rule__ArrayValue__Group_2__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalParameterDefinition.g:2927:2: ( rule__ArrayValue__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==36) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalParameterDefinition.g:2927:3: rule__ArrayValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ArrayValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getArrayValueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__3"
    // InternalParameterDefinition.g:2935:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2939:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalParameterDefinition.g:2940:2: rule__ArrayValue__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__3"


    // $ANTLR start "rule__ArrayValue__Group__3__Impl"
    // InternalParameterDefinition.g:2946:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2950:1: ( ( ']' ) )
            // InternalParameterDefinition.g:2951:1: ( ']' )
            {
            // InternalParameterDefinition.g:2951:1: ( ']' )
            // InternalParameterDefinition.g:2952:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group__3__Impl"


    // $ANTLR start "rule__ArrayValue__Group_2__0"
    // InternalParameterDefinition.g:2962:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2966:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalParameterDefinition.g:2967:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_32);
            rule__ArrayValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__0"


    // $ANTLR start "rule__ArrayValue__Group_2__0__Impl"
    // InternalParameterDefinition.g:2974:1: rule__ArrayValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2978:1: ( ( ',' ) )
            // InternalParameterDefinition.g:2979:1: ( ',' )
            {
            // InternalParameterDefinition.g:2979:1: ( ',' )
            // InternalParameterDefinition.g:2980:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group_2__1"
    // InternalParameterDefinition.g:2989:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2993:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalParameterDefinition.g:2994:2: rule__ArrayValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__1"


    // $ANTLR start "rule__ArrayValue__Group_2__1__Impl"
    // InternalParameterDefinition.g:3000:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3004:1: ( ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) )
            // InternalParameterDefinition.g:3005:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            {
            // InternalParameterDefinition.g:3005:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            // InternalParameterDefinition.g:3006:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 
            // InternalParameterDefinition.g:3007:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            // InternalParameterDefinition.g:3007:3: rule__ArrayValue__ValuesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__ValuesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__Group_2__1__Impl"


    // $ANTLR start "rule__SingleValue__Group_0__0"
    // InternalParameterDefinition.g:3016:1: rule__SingleValue__Group_0__0 : rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 ;
    public final void rule__SingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3020:1: ( rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 )
            // InternalParameterDefinition.g:3021:2: rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1
            {
            pushFollow(FOLLOW_24);
            rule__SingleValue__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_0__0"


    // $ANTLR start "rule__SingleValue__Group_0__0__Impl"
    // InternalParameterDefinition.g:3028:1: rule__SingleValue__Group_0__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3032:1: ( ( () ) )
            // InternalParameterDefinition.g:3033:1: ( () )
            {
            // InternalParameterDefinition.g:3033:1: ( () )
            // InternalParameterDefinition.g:3034:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); 
            // InternalParameterDefinition.g:3035:2: ()
            // InternalParameterDefinition.g:3035:3: 
            {
            }

             after(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_0__0__Impl"


    // $ANTLR start "rule__SingleValue__Group_0__1"
    // InternalParameterDefinition.g:3043:1: rule__SingleValue__Group_0__1 : rule__SingleValue__Group_0__1__Impl ;
    public final void rule__SingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3047:1: ( rule__SingleValue__Group_0__1__Impl )
            // InternalParameterDefinition.g:3048:2: rule__SingleValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_0__1"


    // $ANTLR start "rule__SingleValue__Group_0__1__Impl"
    // InternalParameterDefinition.g:3054:1: rule__SingleValue__Group_0__1__Impl : ( ( rule__SingleValue__ValueAssignment_0_1 ) ) ;
    public final void rule__SingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3058:1: ( ( ( rule__SingleValue__ValueAssignment_0_1 ) ) )
            // InternalParameterDefinition.g:3059:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            {
            // InternalParameterDefinition.g:3059:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            // InternalParameterDefinition.g:3060:2: ( rule__SingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 
            // InternalParameterDefinition.g:3061:2: ( rule__SingleValue__ValueAssignment_0_1 )
            // InternalParameterDefinition.g:3061:3: rule__SingleValue__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_0__1__Impl"


    // $ANTLR start "rule__SingleValue__Group_1__0"
    // InternalParameterDefinition.g:3070:1: rule__SingleValue__Group_1__0 : rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 ;
    public final void rule__SingleValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3074:1: ( rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 )
            // InternalParameterDefinition.g:3075:2: rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__SingleValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_1__0"


    // $ANTLR start "rule__SingleValue__Group_1__0__Impl"
    // InternalParameterDefinition.g:3082:1: rule__SingleValue__Group_1__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3086:1: ( ( () ) )
            // InternalParameterDefinition.g:3087:1: ( () )
            {
            // InternalParameterDefinition.g:3087:1: ( () )
            // InternalParameterDefinition.g:3088:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); 
            // InternalParameterDefinition.g:3089:2: ()
            // InternalParameterDefinition.g:3089:3: 
            {
            }

             after(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_1__0__Impl"


    // $ANTLR start "rule__SingleValue__Group_1__1"
    // InternalParameterDefinition.g:3097:1: rule__SingleValue__Group_1__1 : rule__SingleValue__Group_1__1__Impl ;
    public final void rule__SingleValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3101:1: ( rule__SingleValue__Group_1__1__Impl )
            // InternalParameterDefinition.g:3102:2: rule__SingleValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_1__1"


    // $ANTLR start "rule__SingleValue__Group_1__1__Impl"
    // InternalParameterDefinition.g:3108:1: rule__SingleValue__Group_1__1__Impl : ( ( rule__SingleValue__ValueAssignment_1_1 ) ) ;
    public final void rule__SingleValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3112:1: ( ( ( rule__SingleValue__ValueAssignment_1_1 ) ) )
            // InternalParameterDefinition.g:3113:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            {
            // InternalParameterDefinition.g:3113:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            // InternalParameterDefinition.g:3114:2: ( rule__SingleValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); 
            // InternalParameterDefinition.g:3115:2: ( rule__SingleValue__ValueAssignment_1_1 )
            // InternalParameterDefinition.g:3115:3: rule__SingleValue__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_1__1__Impl"


    // $ANTLR start "rule__SingleValue__Group_2__0"
    // InternalParameterDefinition.g:3124:1: rule__SingleValue__Group_2__0 : rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 ;
    public final void rule__SingleValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3128:1: ( rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 )
            // InternalParameterDefinition.g:3129:2: rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__SingleValue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_2__0"


    // $ANTLR start "rule__SingleValue__Group_2__0__Impl"
    // InternalParameterDefinition.g:3136:1: rule__SingleValue__Group_2__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3140:1: ( ( () ) )
            // InternalParameterDefinition.g:3141:1: ( () )
            {
            // InternalParameterDefinition.g:3141:1: ( () )
            // InternalParameterDefinition.g:3142:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); 
            // InternalParameterDefinition.g:3143:2: ()
            // InternalParameterDefinition.g:3143:3: 
            {
            }

             after(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_2__0__Impl"


    // $ANTLR start "rule__SingleValue__Group_2__1"
    // InternalParameterDefinition.g:3151:1: rule__SingleValue__Group_2__1 : rule__SingleValue__Group_2__1__Impl ;
    public final void rule__SingleValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3155:1: ( rule__SingleValue__Group_2__1__Impl )
            // InternalParameterDefinition.g:3156:2: rule__SingleValue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_2__1"


    // $ANTLR start "rule__SingleValue__Group_2__1__Impl"
    // InternalParameterDefinition.g:3162:1: rule__SingleValue__Group_2__1__Impl : ( ( rule__SingleValue__ValueAssignment_2_1 ) ) ;
    public final void rule__SingleValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3166:1: ( ( ( rule__SingleValue__ValueAssignment_2_1 ) ) )
            // InternalParameterDefinition.g:3167:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            {
            // InternalParameterDefinition.g:3167:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            // InternalParameterDefinition.g:3168:2: ( rule__SingleValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); 
            // InternalParameterDefinition.g:3169:2: ( rule__SingleValue__ValueAssignment_2_1 )
            // InternalParameterDefinition.g:3169:3: rule__SingleValue__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_2__1__Impl"


    // $ANTLR start "rule__SingleValue__Group_3__0"
    // InternalParameterDefinition.g:3178:1: rule__SingleValue__Group_3__0 : rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 ;
    public final void rule__SingleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3182:1: ( rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 )
            // InternalParameterDefinition.g:3183:2: rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__SingleValue__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_3__0"


    // $ANTLR start "rule__SingleValue__Group_3__0__Impl"
    // InternalParameterDefinition.g:3190:1: rule__SingleValue__Group_3__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3194:1: ( ( () ) )
            // InternalParameterDefinition.g:3195:1: ( () )
            {
            // InternalParameterDefinition.g:3195:1: ( () )
            // InternalParameterDefinition.g:3196:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); 
            // InternalParameterDefinition.g:3197:2: ()
            // InternalParameterDefinition.g:3197:3: 
            {
            }

             after(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_3__0__Impl"


    // $ANTLR start "rule__SingleValue__Group_3__1"
    // InternalParameterDefinition.g:3205:1: rule__SingleValue__Group_3__1 : rule__SingleValue__Group_3__1__Impl ;
    public final void rule__SingleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3209:1: ( rule__SingleValue__Group_3__1__Impl )
            // InternalParameterDefinition.g:3210:2: rule__SingleValue__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_3__1"


    // $ANTLR start "rule__SingleValue__Group_3__1__Impl"
    // InternalParameterDefinition.g:3216:1: rule__SingleValue__Group_3__1__Impl : ( ( rule__SingleValue__ValueAssignment_3_1 ) ) ;
    public final void rule__SingleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3220:1: ( ( ( rule__SingleValue__ValueAssignment_3_1 ) ) )
            // InternalParameterDefinition.g:3221:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            {
            // InternalParameterDefinition.g:3221:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            // InternalParameterDefinition.g:3222:2: ( rule__SingleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); 
            // InternalParameterDefinition.g:3223:2: ( rule__SingleValue__ValueAssignment_3_1 )
            // InternalParameterDefinition.g:3223:3: rule__SingleValue__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__ValueAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_3__1__Impl"


    // $ANTLR start "rule__SingleValue__Group_4__0"
    // InternalParameterDefinition.g:3232:1: rule__SingleValue__Group_4__0 : rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 ;
    public final void rule__SingleValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3236:1: ( rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 )
            // InternalParameterDefinition.g:3237:2: rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1
            {
            pushFollow(FOLLOW_32);
            rule__SingleValue__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_4__0"


    // $ANTLR start "rule__SingleValue__Group_4__0__Impl"
    // InternalParameterDefinition.g:3244:1: rule__SingleValue__Group_4__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3248:1: ( ( () ) )
            // InternalParameterDefinition.g:3249:1: ( () )
            {
            // InternalParameterDefinition.g:3249:1: ( () )
            // InternalParameterDefinition.g:3250:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); 
            // InternalParameterDefinition.g:3251:2: ()
            // InternalParameterDefinition.g:3251:3: 
            {
            }

             after(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_4__0__Impl"


    // $ANTLR start "rule__SingleValue__Group_4__1"
    // InternalParameterDefinition.g:3259:1: rule__SingleValue__Group_4__1 : rule__SingleValue__Group_4__1__Impl ;
    public final void rule__SingleValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3263:1: ( rule__SingleValue__Group_4__1__Impl )
            // InternalParameterDefinition.g:3264:2: rule__SingleValue__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_4__1"


    // $ANTLR start "rule__SingleValue__Group_4__1__Impl"
    // InternalParameterDefinition.g:3270:1: rule__SingleValue__Group_4__1__Impl : ( ( rule__SingleValue__ValueAssignment_4_1 ) ) ;
    public final void rule__SingleValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3274:1: ( ( ( rule__SingleValue__ValueAssignment_4_1 ) ) )
            // InternalParameterDefinition.g:3275:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            {
            // InternalParameterDefinition.g:3275:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            // InternalParameterDefinition.g:3276:2: ( rule__SingleValue__ValueAssignment_4_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); 
            // InternalParameterDefinition.g:3277:2: ( rule__SingleValue__ValueAssignment_4_1 )
            // InternalParameterDefinition.g:3277:3: rule__SingleValue__ValueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SingleValue__ValueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__Group_4__1__Impl"


    // $ANTLR start "rule__ParamDefModel__ImportsAssignment_1"
    // InternalParameterDefinition.g:3286:1: rule__ParamDefModel__ImportsAssignment_1 : ( ruleParamDefRepoImport ) ;
    public final void rule__ParamDefModel__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3290:1: ( ( ruleParamDefRepoImport ) )
            // InternalParameterDefinition.g:3291:2: ( ruleParamDefRepoImport )
            {
            // InternalParameterDefinition.g:3291:2: ( ruleParamDefRepoImport )
            // InternalParameterDefinition.g:3292:3: ruleParamDefRepoImport
            {
             before(grammarAccess.getParamDefModelAccess().getImportsParamDefRepoImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleParamDefRepoImport();

            state._fsp--;

             after(grammarAccess.getParamDefModelAccess().getImportsParamDefRepoImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefModel__ImportsAssignment_1"


    // $ANTLR start "rule__ParamDefModel__RepositoryAssignment_2"
    // InternalParameterDefinition.g:3301:1: rule__ParamDefModel__RepositoryAssignment_2 : ( ruleParameterSetRepository ) ;
    public final void rule__ParamDefModel__RepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3305:1: ( ( ruleParameterSetRepository ) )
            // InternalParameterDefinition.g:3306:2: ( ruleParameterSetRepository )
            {
            // InternalParameterDefinition.g:3306:2: ( ruleParameterSetRepository )
            // InternalParameterDefinition.g:3307:3: ruleParameterSetRepository
            {
             before(grammarAccess.getParamDefModelAccess().getRepositoryParameterSetRepositoryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterSetRepository();

            state._fsp--;

             after(grammarAccess.getParamDefModelAccess().getRepositoryParameterSetRepositoryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefModel__RepositoryAssignment_2"


    // $ANTLR start "rule__ParamDefRepoImport__ImportedNamespaceAssignment_1"
    // InternalParameterDefinition.g:3316:1: rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 : ( ruleFQNW ) ;
    public final void rule__ParamDefRepoImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3320:1: ( ( ruleFQNW ) )
            // InternalParameterDefinition.g:3321:2: ( ruleFQNW )
            {
            // InternalParameterDefinition.g:3321:2: ( ruleFQNW )
            // InternalParameterDefinition.g:3322:3: ruleFQNW
            {
             before(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQNW();

            state._fsp--;

             after(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParamDefRepoImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__ParameterSetRepository__NameAssignment_1"
    // InternalParameterDefinition.g:3331:1: rule__ParameterSetRepository__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterSetRepository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3335:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3336:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3336:2: ( RULE_ID )
            // InternalParameterDefinition.g:3337:3: RULE_ID
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterSetRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__NameAssignment_1"


    // $ANTLR start "rule__ParameterSetRepository__SetsAssignment_3"
    // InternalParameterDefinition.g:3346:1: rule__ParameterSetRepository__SetsAssignment_3 : ( ruleParameterSetDefinition ) ;
    public final void rule__ParameterSetRepository__SetsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3350:1: ( ( ruleParameterSetDefinition ) )
            // InternalParameterDefinition.g:3351:2: ( ruleParameterSetDefinition )
            {
            // InternalParameterDefinition.g:3351:2: ( ruleParameterSetDefinition )
            // InternalParameterDefinition.g:3352:3: ruleParameterSetDefinition
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getSetsParameterSetDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterSetDefinition();

            state._fsp--;

             after(grammarAccess.getParameterSetRepositoryAccess().getSetsParameterSetDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__SetsAssignment_3"


    // $ANTLR start "rule__ParameterSetDefinition__NameAssignment_1"
    // InternalParameterDefinition.g:3361:1: rule__ParameterSetDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterSetDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3365:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3366:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3366:2: ( RULE_ID )
            // InternalParameterDefinition.g:3367:3: RULE_ID
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__NameAssignment_1"


    // $ANTLR start "rule__ParameterSetDefinition__ExtendsAssignment_2_1"
    // InternalParameterDefinition.g:3376:1: rule__ParameterSetDefinition__ExtendsAssignment_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterSetDefinition__ExtendsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3380:1: ( ( ( ruleFQN ) ) )
            // InternalParameterDefinition.g:3381:2: ( ( ruleFQN ) )
            {
            // InternalParameterDefinition.g:3381:2: ( ( ruleFQN ) )
            // InternalParameterDefinition.g:3382:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_1_0()); 
            // InternalParameterDefinition.g:3383:3: ( ruleFQN )
            // InternalParameterDefinition.g:3384:4: ruleFQN
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__ExtendsAssignment_2_1"


    // $ANTLR start "rule__ParameterSetDefinition__ExtendsAssignment_2_2_1"
    // InternalParameterDefinition.g:3395:1: rule__ParameterSetDefinition__ExtendsAssignment_2_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterSetDefinition__ExtendsAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3399:1: ( ( ( ruleFQN ) ) )
            // InternalParameterDefinition.g:3400:2: ( ( ruleFQN ) )
            {
            // InternalParameterDefinition.g:3400:2: ( ( ruleFQN ) )
            // InternalParameterDefinition.g:3401:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_2_1_0()); 
            // InternalParameterDefinition.g:3402:3: ( ruleFQN )
            // InternalParameterDefinition.g:3403:4: ruleFQN
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_2_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_2_2_1_0_1()); 

            }

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__ExtendsAssignment_2_2_1"


    // $ANTLR start "rule__ParameterSetDefinition__ParametersAssignment_4"
    // InternalParameterDefinition.g:3414:1: rule__ParameterSetDefinition__ParametersAssignment_4 : ( ruleAbstractParameter ) ;
    public final void rule__ParameterSetDefinition__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3418:1: ( ( ruleAbstractParameter ) )
            // InternalParameterDefinition.g:3419:2: ( ruleAbstractParameter )
            {
            // InternalParameterDefinition.g:3419:2: ( ruleAbstractParameter )
            // InternalParameterDefinition.g:3420:3: ruleAbstractParameter
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getParametersAbstractParameterParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractParameter();

            state._fsp--;

             after(grammarAccess.getParameterSetDefinitionAccess().getParametersAbstractParameterParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__ParametersAssignment_4"


    // $ANTLR start "rule__ParameterDefinition__NameAssignment_1"
    // InternalParameterDefinition.g:3429:1: rule__ParameterDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ParameterDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3433:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3434:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3434:2: ( RULE_ID )
            // InternalParameterDefinition.g:3435:3: RULE_ID
            {
             before(grammarAccess.getParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__NameAssignment_1"


    // $ANTLR start "rule__ParameterDefinition__AttributesAssignment_3"
    // InternalParameterDefinition.g:3444:1: rule__ParameterDefinition__AttributesAssignment_3 : ( ruleAttributeDefinition ) ;
    public final void rule__ParameterDefinition__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3448:1: ( ( ruleAttributeDefinition ) )
            // InternalParameterDefinition.g:3449:2: ( ruleAttributeDefinition )
            {
            // InternalParameterDefinition.g:3449:2: ( ruleAttributeDefinition )
            // InternalParameterDefinition.g:3450:3: ruleAttributeDefinition
            {
             before(grammarAccess.getParameterDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getParameterDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__AttributesAssignment_3"


    // $ANTLR start "rule__TriggerDefinition__NameAssignment_1"
    // InternalParameterDefinition.g:3459:1: rule__TriggerDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TriggerDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3463:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3464:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3464:2: ( RULE_ID )
            // InternalParameterDefinition.g:3465:3: RULE_ID
            {
             before(grammarAccess.getTriggerDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTriggerDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__NameAssignment_1"


    // $ANTLR start "rule__TriggerDefinition__AttributesAssignment_3"
    // InternalParameterDefinition.g:3474:1: rule__TriggerDefinition__AttributesAssignment_3 : ( ruleAttributeDefinition ) ;
    public final void rule__TriggerDefinition__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3478:1: ( ( ruleAttributeDefinition ) )
            // InternalParameterDefinition.g:3479:2: ( ruleAttributeDefinition )
            {
            // InternalParameterDefinition.g:3479:2: ( ruleAttributeDefinition )
            // InternalParameterDefinition.g:3480:3: ruleAttributeDefinition
            {
             before(grammarAccess.getTriggerDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getTriggerDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__AttributesAssignment_3"


    // $ANTLR start "rule__AttributeDefinition__NameAssignment_0"
    // InternalParameterDefinition.g:3489:1: rule__AttributeDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributeDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3493:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3494:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3494:2: ( RULE_ID )
            // InternalParameterDefinition.g:3495:3: RULE_ID
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__NameAssignment_0"


    // $ANTLR start "rule__AttributeDefinition__TypeAssignment_2"
    // InternalParameterDefinition.g:3504:1: rule__AttributeDefinition__TypeAssignment_2 : ( ruleAbstractAttributeType ) ;
    public final void rule__AttributeDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3508:1: ( ( ruleAbstractAttributeType ) )
            // InternalParameterDefinition.g:3509:2: ( ruleAbstractAttributeType )
            {
            // InternalParameterDefinition.g:3509:2: ( ruleAbstractAttributeType )
            // InternalParameterDefinition.g:3510:3: ruleAbstractAttributeType
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__TypeAssignment_2"


    // $ANTLR start "rule__AttributeDefinition__DefaultvalueAssignment_3_1"
    // InternalParameterDefinition.g:3519:1: rule__AttributeDefinition__DefaultvalueAssignment_3_1 : ( ruleAbstractValue ) ;
    public final void rule__AttributeDefinition__DefaultvalueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3523:1: ( ( ruleAbstractValue ) )
            // InternalParameterDefinition.g:3524:2: ( ruleAbstractValue )
            {
            // InternalParameterDefinition.g:3524:2: ( ruleAbstractValue )
            // InternalParameterDefinition.g:3525:3: ruleAbstractValue
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractValue();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__DefaultvalueAssignment_3_1"


    // $ANTLR start "rule__EnumerationElement__NameAssignment_0"
    // InternalParameterDefinition.g:3534:1: rule__EnumerationElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3538:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3539:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3539:2: ( RULE_ID )
            // InternalParameterDefinition.g:3540:3: RULE_ID
            {
             before(grammarAccess.getEnumerationElementAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEnumerationElementAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__NameAssignment_0"


    // $ANTLR start "rule__EnumerationElement__ValueAssignment_1_1"
    // InternalParameterDefinition.g:3549:1: rule__EnumerationElement__ValueAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3553:1: ( ( ruleEInt ) )
            // InternalParameterDefinition.g:3554:2: ( ruleEInt )
            {
            // InternalParameterDefinition.g:3554:2: ( ruleEInt )
            // InternalParameterDefinition.g:3555:3: ruleEInt
            {
             before(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEnumerationElementAccess().getValueEIntParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EnumerationElement__ValueAssignment_1_1"


    // $ANTLR start "rule__InlineEnumerationType__ArrayAssignment_1"
    // InternalParameterDefinition.g:3564:1: rule__InlineEnumerationType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__InlineEnumerationType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3568:1: ( ( ruleArrayType ) )
            // InternalParameterDefinition.g:3569:2: ( ruleArrayType )
            {
            // InternalParameterDefinition.g:3569:2: ( ruleArrayType )
            // InternalParameterDefinition.g:3570:3: ruleArrayType
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getInlineEnumerationTypeAccess().getArrayArrayTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__ArrayAssignment_1"


    // $ANTLR start "rule__InlineEnumerationType__EnumsAssignment_3"
    // InternalParameterDefinition.g:3579:1: rule__InlineEnumerationType__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__InlineEnumerationType__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3583:1: ( ( ruleEnumerationElement ) )
            // InternalParameterDefinition.g:3584:2: ( ruleEnumerationElement )
            {
            // InternalParameterDefinition.g:3584:2: ( ruleEnumerationElement )
            // InternalParameterDefinition.g:3585:3: ruleEnumerationElement
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEnumerationElement();

            state._fsp--;

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsEnumerationElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InlineEnumerationType__EnumsAssignment_3"


    // $ANTLR start "rule__ArrayType__LengthAssignment_2"
    // InternalParameterDefinition.g:3594:1: rule__ArrayType__LengthAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ArrayType__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3598:1: ( ( ruleCardinality ) )
            // InternalParameterDefinition.g:3599:2: ( ruleCardinality )
            {
            // InternalParameterDefinition.g:3599:2: ( ruleCardinality )
            // InternalParameterDefinition.g:3600:3: ruleCardinality
            {
             before(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCardinality();

            state._fsp--;

             after(grammarAccess.getArrayTypeAccess().getLengthCardinalityParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayType__LengthAssignment_2"


    // $ANTLR start "rule__PrimitiveType__TypeNameAssignment_0"
    // InternalParameterDefinition.g:3609:1: rule__PrimitiveType__TypeNameAssignment_0 : ( rulePRIMITIVE_TYPE_NAME ) ;
    public final void rule__PrimitiveType__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3613:1: ( ( rulePRIMITIVE_TYPE_NAME ) )
            // InternalParameterDefinition.g:3614:2: ( rulePRIMITIVE_TYPE_NAME )
            {
            // InternalParameterDefinition.g:3614:2: ( rulePRIMITIVE_TYPE_NAME )
            // InternalParameterDefinition.g:3615:3: rulePRIMITIVE_TYPE_NAME
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePRIMITIVE_TYPE_NAME();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getTypeNamePRIMITIVE_TYPE_NAMEEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__TypeNameAssignment_0"


    // $ANTLR start "rule__PrimitiveType__ArrayAssignment_1"
    // InternalParameterDefinition.g:3624:1: rule__PrimitiveType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__PrimitiveType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3628:1: ( ( ruleArrayType ) )
            // InternalParameterDefinition.g:3629:2: ( ruleArrayType )
            {
            // InternalParameterDefinition.g:3629:2: ( ruleArrayType )
            // InternalParameterDefinition.g:3630:3: ruleArrayType
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayArrayTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleArrayType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getArrayArrayTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__ArrayAssignment_1"


    // $ANTLR start "rule__ArrayValue__ValuesAssignment_1"
    // InternalParameterDefinition.g:3639:1: rule__ArrayValue__ValuesAssignment_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3643:1: ( ( ruleSingleValue ) )
            // InternalParameterDefinition.g:3644:2: ( ruleSingleValue )
            {
            // InternalParameterDefinition.g:3644:2: ( ruleSingleValue )
            // InternalParameterDefinition.g:3645:3: ruleSingleValue
            {
             before(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleValue();

            state._fsp--;

             after(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__ValuesAssignment_1"


    // $ANTLR start "rule__ArrayValue__ValuesAssignment_2_1"
    // InternalParameterDefinition.g:3654:1: rule__ArrayValue__ValuesAssignment_2_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3658:1: ( ( ruleSingleValue ) )
            // InternalParameterDefinition.g:3659:2: ( ruleSingleValue )
            {
            // InternalParameterDefinition.g:3659:2: ( ruleSingleValue )
            // InternalParameterDefinition.g:3660:3: ruleSingleValue
            {
             before(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleValue();

            state._fsp--;

             after(grammarAccess.getArrayValueAccess().getValuesSingleValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArrayValue__ValuesAssignment_2_1"


    // $ANTLR start "rule__SingleValue__ValueAssignment_0_1"
    // InternalParameterDefinition.g:3669:1: rule__SingleValue__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__SingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3673:1: ( ( ruleEInt ) )
            // InternalParameterDefinition.g:3674:2: ( ruleEInt )
            {
            // InternalParameterDefinition.g:3674:2: ( ruleEInt )
            // InternalParameterDefinition.g:3675:3: ruleEInt
            {
             before(grammarAccess.getSingleValueAccess().getValueEIntParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSingleValueAccess().getValueEIntParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_0_1"


    // $ANTLR start "rule__SingleValue__ValueAssignment_1_1"
    // InternalParameterDefinition.g:3684:1: rule__SingleValue__ValueAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__SingleValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3688:1: ( ( ruleEDouble ) )
            // InternalParameterDefinition.g:3689:2: ( ruleEDouble )
            {
            // InternalParameterDefinition.g:3689:2: ( ruleEDouble )
            // InternalParameterDefinition.g:3690:3: ruleEDouble
            {
             before(grammarAccess.getSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSingleValueAccess().getValueEDoubleParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_1_1"


    // $ANTLR start "rule__SingleValue__ValueAssignment_2_1"
    // InternalParameterDefinition.g:3699:1: rule__SingleValue__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__SingleValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3703:1: ( ( ruleEString ) )
            // InternalParameterDefinition.g:3704:2: ( ruleEString )
            {
            // InternalParameterDefinition.g:3704:2: ( ruleEString )
            // InternalParameterDefinition.g:3705:3: ruleEString
            {
             before(grammarAccess.getSingleValueAccess().getValueEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSingleValueAccess().getValueEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_2_1"


    // $ANTLR start "rule__SingleValue__ValueAssignment_3_1"
    // InternalParameterDefinition.g:3714:1: rule__SingleValue__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__SingleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3718:1: ( ( ruleEBoolean ) )
            // InternalParameterDefinition.g:3719:2: ( ruleEBoolean )
            {
            // InternalParameterDefinition.g:3719:2: ( ruleEBoolean )
            // InternalParameterDefinition.g:3720:3: ruleEBoolean
            {
             before(grammarAccess.getSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getSingleValueAccess().getValueEBooleanParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_3_1"


    // $ANTLR start "rule__SingleValue__ValueAssignment_4_1"
    // InternalParameterDefinition.g:3729:1: rule__SingleValue__ValueAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__SingleValue__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3733:1: ( ( ( ruleFQN ) ) )
            // InternalParameterDefinition.g:3734:2: ( ( ruleFQN ) )
            {
            // InternalParameterDefinition.g:3734:2: ( ( ruleFQN ) )
            // InternalParameterDefinition.g:3735:3: ( ruleFQN )
            {
             before(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 
            // InternalParameterDefinition.g:3736:3: ( ruleFQN )
            // InternalParameterDefinition.g:3737:4: ruleFQN
            {
             before(grammarAccess.getSingleValueAccess().getValueEnumerationElementFQNParserRuleCall_4_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSingleValueAccess().getValueEnumerationElementFQNParserRuleCall_4_1_0_1()); 

            }

             after(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SingleValue__ValueAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000900000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000006200000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000008000FFF0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000160000001870L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000060000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100100000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000008020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000060000001870L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000201000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000001800L});

}