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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOCU_COMMENT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'*'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'", "'.*'", "'#import'", "';'", "'ParameterSetRepository'", "'{'", "'}'", "'ParameterSet'", "'extends'", "','", "'Parameter'", "'Trigger'", "':'", "'='", "'.'", "'-'", "'InlineEnumeration'", "'['", "']'"
    };
    public static final int RULE_ML_DOCUMENTATION=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=6;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=7;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=11;
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
    // InternalParameterDefinition.g:68:1: entryRuleParamDefModel : ruleParamDefModel EOF ;
    public final void entryRuleParamDefModel() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:69:1: ( ruleParamDefModel EOF )
            // InternalParameterDefinition.g:70:1: ruleParamDefModel EOF
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
    // InternalParameterDefinition.g:77:1: ruleParamDefModel : ( ( rule__ParamDefModel__Group__0 ) ) ;
    public final void ruleParamDefModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:81:2: ( ( ( rule__ParamDefModel__Group__0 ) ) )
            // InternalParameterDefinition.g:82:2: ( ( rule__ParamDefModel__Group__0 ) )
            {
            // InternalParameterDefinition.g:82:2: ( ( rule__ParamDefModel__Group__0 ) )
            // InternalParameterDefinition.g:83:3: ( rule__ParamDefModel__Group__0 )
            {
             before(grammarAccess.getParamDefModelAccess().getGroup()); 
            // InternalParameterDefinition.g:84:3: ( rule__ParamDefModel__Group__0 )
            // InternalParameterDefinition.g:84:4: rule__ParamDefModel__Group__0
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
    // InternalParameterDefinition.g:93:1: entryRuleFQNW : ruleFQNW EOF ;
    public final void entryRuleFQNW() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:94:1: ( ruleFQNW EOF )
            // InternalParameterDefinition.g:95:1: ruleFQNW EOF
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
    // InternalParameterDefinition.g:102:1: ruleFQNW : ( ( rule__FQNW__Group__0 ) ) ;
    public final void ruleFQNW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:106:2: ( ( ( rule__FQNW__Group__0 ) ) )
            // InternalParameterDefinition.g:107:2: ( ( rule__FQNW__Group__0 ) )
            {
            // InternalParameterDefinition.g:107:2: ( ( rule__FQNW__Group__0 ) )
            // InternalParameterDefinition.g:108:3: ( rule__FQNW__Group__0 )
            {
             before(grammarAccess.getFQNWAccess().getGroup()); 
            // InternalParameterDefinition.g:109:3: ( rule__FQNW__Group__0 )
            // InternalParameterDefinition.g:109:4: rule__FQNW__Group__0
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
    // InternalParameterDefinition.g:118:1: entryRuleParamDefRepoImport : ruleParamDefRepoImport EOF ;
    public final void entryRuleParamDefRepoImport() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:119:1: ( ruleParamDefRepoImport EOF )
            // InternalParameterDefinition.g:120:1: ruleParamDefRepoImport EOF
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
    // InternalParameterDefinition.g:127:1: ruleParamDefRepoImport : ( ( rule__ParamDefRepoImport__Group__0 ) ) ;
    public final void ruleParamDefRepoImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:131:2: ( ( ( rule__ParamDefRepoImport__Group__0 ) ) )
            // InternalParameterDefinition.g:132:2: ( ( rule__ParamDefRepoImport__Group__0 ) )
            {
            // InternalParameterDefinition.g:132:2: ( ( rule__ParamDefRepoImport__Group__0 ) )
            // InternalParameterDefinition.g:133:3: ( rule__ParamDefRepoImport__Group__0 )
            {
             before(grammarAccess.getParamDefRepoImportAccess().getGroup()); 
            // InternalParameterDefinition.g:134:3: ( rule__ParamDefRepoImport__Group__0 )
            // InternalParameterDefinition.g:134:4: rule__ParamDefRepoImport__Group__0
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
    // InternalParameterDefinition.g:143:1: entryRuleParameterSetRepository : ruleParameterSetRepository EOF ;
    public final void entryRuleParameterSetRepository() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:144:1: ( ruleParameterSetRepository EOF )
            // InternalParameterDefinition.g:145:1: ruleParameterSetRepository EOF
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
    // InternalParameterDefinition.g:152:1: ruleParameterSetRepository : ( ( rule__ParameterSetRepository__Group__0 ) ) ;
    public final void ruleParameterSetRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:156:2: ( ( ( rule__ParameterSetRepository__Group__0 ) ) )
            // InternalParameterDefinition.g:157:2: ( ( rule__ParameterSetRepository__Group__0 ) )
            {
            // InternalParameterDefinition.g:157:2: ( ( rule__ParameterSetRepository__Group__0 ) )
            // InternalParameterDefinition.g:158:3: ( rule__ParameterSetRepository__Group__0 )
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getGroup()); 
            // InternalParameterDefinition.g:159:3: ( rule__ParameterSetRepository__Group__0 )
            // InternalParameterDefinition.g:159:4: rule__ParameterSetRepository__Group__0
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
    // InternalParameterDefinition.g:168:1: entryRuleParameterSetDefinition : ruleParameterSetDefinition EOF ;
    public final void entryRuleParameterSetDefinition() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:169:1: ( ruleParameterSetDefinition EOF )
            // InternalParameterDefinition.g:170:1: ruleParameterSetDefinition EOF
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
    // InternalParameterDefinition.g:177:1: ruleParameterSetDefinition : ( ( rule__ParameterSetDefinition__Group__0 ) ) ;
    public final void ruleParameterSetDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:181:2: ( ( ( rule__ParameterSetDefinition__Group__0 ) ) )
            // InternalParameterDefinition.g:182:2: ( ( rule__ParameterSetDefinition__Group__0 ) )
            {
            // InternalParameterDefinition.g:182:2: ( ( rule__ParameterSetDefinition__Group__0 ) )
            // InternalParameterDefinition.g:183:3: ( rule__ParameterSetDefinition__Group__0 )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getGroup()); 
            // InternalParameterDefinition.g:184:3: ( rule__ParameterSetDefinition__Group__0 )
            // InternalParameterDefinition.g:184:4: rule__ParameterSetDefinition__Group__0
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
    // InternalParameterDefinition.g:193:1: entryRuleAbstractParameter : ruleAbstractParameter EOF ;
    public final void entryRuleAbstractParameter() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:194:1: ( ruleAbstractParameter EOF )
            // InternalParameterDefinition.g:195:1: ruleAbstractParameter EOF
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
    // InternalParameterDefinition.g:202:1: ruleAbstractParameter : ( ( rule__AbstractParameter__Alternatives ) ) ;
    public final void ruleAbstractParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:206:2: ( ( ( rule__AbstractParameter__Alternatives ) ) )
            // InternalParameterDefinition.g:207:2: ( ( rule__AbstractParameter__Alternatives ) )
            {
            // InternalParameterDefinition.g:207:2: ( ( rule__AbstractParameter__Alternatives ) )
            // InternalParameterDefinition.g:208:3: ( rule__AbstractParameter__Alternatives )
            {
             before(grammarAccess.getAbstractParameterAccess().getAlternatives()); 
            // InternalParameterDefinition.g:209:3: ( rule__AbstractParameter__Alternatives )
            // InternalParameterDefinition.g:209:4: rule__AbstractParameter__Alternatives
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
    // InternalParameterDefinition.g:218:1: entryRuleParameterDefinition : ruleParameterDefinition EOF ;
    public final void entryRuleParameterDefinition() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:219:1: ( ruleParameterDefinition EOF )
            // InternalParameterDefinition.g:220:1: ruleParameterDefinition EOF
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
    // InternalParameterDefinition.g:227:1: ruleParameterDefinition : ( ( rule__ParameterDefinition__Group__0 ) ) ;
    public final void ruleParameterDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:231:2: ( ( ( rule__ParameterDefinition__Group__0 ) ) )
            // InternalParameterDefinition.g:232:2: ( ( rule__ParameterDefinition__Group__0 ) )
            {
            // InternalParameterDefinition.g:232:2: ( ( rule__ParameterDefinition__Group__0 ) )
            // InternalParameterDefinition.g:233:3: ( rule__ParameterDefinition__Group__0 )
            {
             before(grammarAccess.getParameterDefinitionAccess().getGroup()); 
            // InternalParameterDefinition.g:234:3: ( rule__ParameterDefinition__Group__0 )
            // InternalParameterDefinition.g:234:4: rule__ParameterDefinition__Group__0
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
    // InternalParameterDefinition.g:243:1: entryRuleTriggerDefinition : ruleTriggerDefinition EOF ;
    public final void entryRuleTriggerDefinition() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:244:1: ( ruleTriggerDefinition EOF )
            // InternalParameterDefinition.g:245:1: ruleTriggerDefinition EOF
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
    // InternalParameterDefinition.g:252:1: ruleTriggerDefinition : ( ( rule__TriggerDefinition__Group__0 ) ) ;
    public final void ruleTriggerDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:256:2: ( ( ( rule__TriggerDefinition__Group__0 ) ) )
            // InternalParameterDefinition.g:257:2: ( ( rule__TriggerDefinition__Group__0 ) )
            {
            // InternalParameterDefinition.g:257:2: ( ( rule__TriggerDefinition__Group__0 ) )
            // InternalParameterDefinition.g:258:3: ( rule__TriggerDefinition__Group__0 )
            {
             before(grammarAccess.getTriggerDefinitionAccess().getGroup()); 
            // InternalParameterDefinition.g:259:3: ( rule__TriggerDefinition__Group__0 )
            // InternalParameterDefinition.g:259:4: rule__TriggerDefinition__Group__0
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
    // InternalParameterDefinition.g:268:1: entryRuleAttributeDefinition : ruleAttributeDefinition EOF ;
    public final void entryRuleAttributeDefinition() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:269:1: ( ruleAttributeDefinition EOF )
            // InternalParameterDefinition.g:270:1: ruleAttributeDefinition EOF
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
    // InternalParameterDefinition.g:277:1: ruleAttributeDefinition : ( ( rule__AttributeDefinition__Group__0 ) ) ;
    public final void ruleAttributeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:281:2: ( ( ( rule__AttributeDefinition__Group__0 ) ) )
            // InternalParameterDefinition.g:282:2: ( ( rule__AttributeDefinition__Group__0 ) )
            {
            // InternalParameterDefinition.g:282:2: ( ( rule__AttributeDefinition__Group__0 ) )
            // InternalParameterDefinition.g:283:3: ( rule__AttributeDefinition__Group__0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            // InternalParameterDefinition.g:284:3: ( rule__AttributeDefinition__Group__0 )
            // InternalParameterDefinition.g:284:4: rule__AttributeDefinition__Group__0
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
    // InternalParameterDefinition.g:293:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:294:1: ( ruleFQN EOF )
            // InternalParameterDefinition.g:295:1: ruleFQN EOF
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
    // InternalParameterDefinition.g:302:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:306:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalParameterDefinition.g:307:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalParameterDefinition.g:307:2: ( ( rule__FQN__Group__0 ) )
            // InternalParameterDefinition.g:308:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalParameterDefinition.g:309:3: ( rule__FQN__Group__0 )
            // InternalParameterDefinition.g:309:4: rule__FQN__Group__0
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
    // InternalParameterDefinition.g:318:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:319:1: ( ruleEBoolean EOF )
            // InternalParameterDefinition.g:320:1: ruleEBoolean EOF
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
    // InternalParameterDefinition.g:327:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:331:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalParameterDefinition.g:332:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalParameterDefinition.g:332:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalParameterDefinition.g:333:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalParameterDefinition.g:334:3: ( rule__EBoolean__Alternatives )
            // InternalParameterDefinition.g:334:4: rule__EBoolean__Alternatives
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
    // InternalParameterDefinition.g:343:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:344:1: ( ruleEString EOF )
            // InternalParameterDefinition.g:345:1: ruleEString EOF
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
    // InternalParameterDefinition.g:352:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:356:2: ( ( RULE_STRING ) )
            // InternalParameterDefinition.g:357:2: ( RULE_STRING )
            {
            // InternalParameterDefinition.g:357:2: ( RULE_STRING )
            // InternalParameterDefinition.g:358:3: RULE_STRING
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
    // InternalParameterDefinition.g:368:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:369:1: ( ruleEInt EOF )
            // InternalParameterDefinition.g:370:1: ruleEInt EOF
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
    // InternalParameterDefinition.g:377:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:381:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalParameterDefinition.g:382:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalParameterDefinition.g:382:2: ( ( rule__EInt__Group__0 ) )
            // InternalParameterDefinition.g:383:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalParameterDefinition.g:384:3: ( rule__EInt__Group__0 )
            // InternalParameterDefinition.g:384:4: rule__EInt__Group__0
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
    // InternalParameterDefinition.g:393:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:394:1: ( ruleEDouble EOF )
            // InternalParameterDefinition.g:395:1: ruleEDouble EOF
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
    // InternalParameterDefinition.g:402:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:406:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalParameterDefinition.g:407:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalParameterDefinition.g:407:2: ( ( rule__EDouble__Group__0 ) )
            // InternalParameterDefinition.g:408:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalParameterDefinition.g:409:3: ( rule__EDouble__Group__0 )
            // InternalParameterDefinition.g:409:4: rule__EDouble__Group__0
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
    // InternalParameterDefinition.g:418:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:419:1: ( ruleEnumerationElement EOF )
            // InternalParameterDefinition.g:420:1: ruleEnumerationElement EOF
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
    // InternalParameterDefinition.g:427:1: ruleEnumerationElement : ( ( rule__EnumerationElement__Group__0 ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:431:2: ( ( ( rule__EnumerationElement__Group__0 ) ) )
            // InternalParameterDefinition.g:432:2: ( ( rule__EnumerationElement__Group__0 ) )
            {
            // InternalParameterDefinition.g:432:2: ( ( rule__EnumerationElement__Group__0 ) )
            // InternalParameterDefinition.g:433:3: ( rule__EnumerationElement__Group__0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup()); 
            // InternalParameterDefinition.g:434:3: ( rule__EnumerationElement__Group__0 )
            // InternalParameterDefinition.g:434:4: rule__EnumerationElement__Group__0
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
    // InternalParameterDefinition.g:443:1: entryRuleAbstractAttributeType : ruleAbstractAttributeType EOF ;
    public final void entryRuleAbstractAttributeType() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:444:1: ( ruleAbstractAttributeType EOF )
            // InternalParameterDefinition.g:445:1: ruleAbstractAttributeType EOF
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
    // InternalParameterDefinition.g:452:1: ruleAbstractAttributeType : ( ( rule__AbstractAttributeType__Alternatives ) ) ;
    public final void ruleAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:456:2: ( ( ( rule__AbstractAttributeType__Alternatives ) ) )
            // InternalParameterDefinition.g:457:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            {
            // InternalParameterDefinition.g:457:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            // InternalParameterDefinition.g:458:3: ( rule__AbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalParameterDefinition.g:459:3: ( rule__AbstractAttributeType__Alternatives )
            // InternalParameterDefinition.g:459:4: rule__AbstractAttributeType__Alternatives
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
    // InternalParameterDefinition.g:468:1: entryRuleInlineEnumerationType : ruleInlineEnumerationType EOF ;
    public final void entryRuleInlineEnumerationType() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:469:1: ( ruleInlineEnumerationType EOF )
            // InternalParameterDefinition.g:470:1: ruleInlineEnumerationType EOF
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
    // InternalParameterDefinition.g:477:1: ruleInlineEnumerationType : ( ( rule__InlineEnumerationType__Group__0 ) ) ;
    public final void ruleInlineEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:481:2: ( ( ( rule__InlineEnumerationType__Group__0 ) ) )
            // InternalParameterDefinition.g:482:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            {
            // InternalParameterDefinition.g:482:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            // InternalParameterDefinition.g:483:3: ( rule__InlineEnumerationType__Group__0 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 
            // InternalParameterDefinition.g:484:3: ( rule__InlineEnumerationType__Group__0 )
            // InternalParameterDefinition.g:484:4: rule__InlineEnumerationType__Group__0
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
    // InternalParameterDefinition.g:493:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:494:1: ( ruleArrayType EOF )
            // InternalParameterDefinition.g:495:1: ruleArrayType EOF
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
    // InternalParameterDefinition.g:502:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:506:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalParameterDefinition.g:507:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalParameterDefinition.g:507:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalParameterDefinition.g:508:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalParameterDefinition.g:509:3: ( rule__ArrayType__Group__0 )
            // InternalParameterDefinition.g:509:4: rule__ArrayType__Group__0
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
    // InternalParameterDefinition.g:518:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:519:1: ( ruleCardinality EOF )
            // InternalParameterDefinition.g:520:1: ruleCardinality EOF
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
    // InternalParameterDefinition.g:527:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:531:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalParameterDefinition.g:532:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalParameterDefinition.g:532:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalParameterDefinition.g:533:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalParameterDefinition.g:534:3: ( rule__Cardinality__Alternatives )
            // InternalParameterDefinition.g:534:4: rule__Cardinality__Alternatives
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
    // InternalParameterDefinition.g:543:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:544:1: ( rulePrimitiveType EOF )
            // InternalParameterDefinition.g:545:1: rulePrimitiveType EOF
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
    // InternalParameterDefinition.g:552:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:556:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalParameterDefinition.g:557:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalParameterDefinition.g:557:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalParameterDefinition.g:558:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalParameterDefinition.g:559:3: ( rule__PrimitiveType__Group__0 )
            // InternalParameterDefinition.g:559:4: rule__PrimitiveType__Group__0
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
    // InternalParameterDefinition.g:568:1: entryRuleAbstractValue : ruleAbstractValue EOF ;
    public final void entryRuleAbstractValue() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:569:1: ( ruleAbstractValue EOF )
            // InternalParameterDefinition.g:570:1: ruleAbstractValue EOF
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
    // InternalParameterDefinition.g:577:1: ruleAbstractValue : ( ( rule__AbstractValue__Alternatives ) ) ;
    public final void ruleAbstractValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:581:2: ( ( ( rule__AbstractValue__Alternatives ) ) )
            // InternalParameterDefinition.g:582:2: ( ( rule__AbstractValue__Alternatives ) )
            {
            // InternalParameterDefinition.g:582:2: ( ( rule__AbstractValue__Alternatives ) )
            // InternalParameterDefinition.g:583:3: ( rule__AbstractValue__Alternatives )
            {
             before(grammarAccess.getAbstractValueAccess().getAlternatives()); 
            // InternalParameterDefinition.g:584:3: ( rule__AbstractValue__Alternatives )
            // InternalParameterDefinition.g:584:4: rule__AbstractValue__Alternatives
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
    // InternalParameterDefinition.g:593:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:594:1: ( ruleArrayValue EOF )
            // InternalParameterDefinition.g:595:1: ruleArrayValue EOF
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
    // InternalParameterDefinition.g:602:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:606:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalParameterDefinition.g:607:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalParameterDefinition.g:607:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalParameterDefinition.g:608:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalParameterDefinition.g:609:3: ( rule__ArrayValue__Group__0 )
            // InternalParameterDefinition.g:609:4: rule__ArrayValue__Group__0
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
    // InternalParameterDefinition.g:618:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalParameterDefinition.g:619:1: ( ruleSingleValue EOF )
            // InternalParameterDefinition.g:620:1: ruleSingleValue EOF
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
    // InternalParameterDefinition.g:627:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:631:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalParameterDefinition.g:632:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalParameterDefinition.g:632:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalParameterDefinition.g:633:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalParameterDefinition.g:634:3: ( rule__SingleValue__Alternatives )
            // InternalParameterDefinition.g:634:4: rule__SingleValue__Alternatives
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
    // InternalParameterDefinition.g:643:1: rulePRIMITIVE_TYPE_NAME : ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) ;
    public final void rulePRIMITIVE_TYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:647:1: ( ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) )
            // InternalParameterDefinition.g:648:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            {
            // InternalParameterDefinition.g:648:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            // InternalParameterDefinition.g:649:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            {
             before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 
            // InternalParameterDefinition.g:650:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            // InternalParameterDefinition.g:650:4: rule__PRIMITIVE_TYPE_NAME__Alternatives
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
    // InternalParameterDefinition.g:658:1: rule__AbstractParameter__Alternatives : ( ( ruleParameterDefinition ) | ( ruleTriggerDefinition ) );
    public final void rule__AbstractParameter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:662:1: ( ( ruleParameterDefinition ) | ( ruleTriggerDefinition ) )
            int alt1=2;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==41) ) {
                    alt1=2;
                }
                else if ( (LA1_1==40) ) {
                    alt1=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
                }
                break;
            case 40:
                {
                alt1=1;
                }
                break;
            case 41:
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
                    // InternalParameterDefinition.g:663:2: ( ruleParameterDefinition )
                    {
                    // InternalParameterDefinition.g:663:2: ( ruleParameterDefinition )
                    // InternalParameterDefinition.g:664:3: ruleParameterDefinition
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
                    // InternalParameterDefinition.g:669:2: ( ruleTriggerDefinition )
                    {
                    // InternalParameterDefinition.g:669:2: ( ruleTriggerDefinition )
                    // InternalParameterDefinition.g:670:3: ruleTriggerDefinition
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
    // InternalParameterDefinition.g:679:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:683:1: ( ( 'true' ) | ( 'false' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalParameterDefinition.g:684:2: ( 'true' )
                    {
                    // InternalParameterDefinition.g:684:2: ( 'true' )
                    // InternalParameterDefinition.g:685:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:690:2: ( 'false' )
                    {
                    // InternalParameterDefinition.g:690:2: ( 'false' )
                    // InternalParameterDefinition.g:691:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalParameterDefinition.g:700:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:704:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            else if ( (LA3_0==17) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalParameterDefinition.g:705:2: ( 'E' )
                    {
                    // InternalParameterDefinition.g:705:2: ( 'E' )
                    // InternalParameterDefinition.g:706:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:711:2: ( 'e' )
                    {
                    // InternalParameterDefinition.g:711:2: ( 'e' )
                    // InternalParameterDefinition.g:712:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalParameterDefinition.g:721:1: rule__AbstractAttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) );
    public final void rule__AbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:725:1: ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=19 && LA4_0<=30)) ) {
                alt4=1;
            }
            else if ( (LA4_0==46) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalParameterDefinition.g:726:2: ( rulePrimitiveType )
                    {
                    // InternalParameterDefinition.g:726:2: ( rulePrimitiveType )
                    // InternalParameterDefinition.g:727:3: rulePrimitiveType
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
                    // InternalParameterDefinition.g:732:2: ( ruleInlineEnumerationType )
                    {
                    // InternalParameterDefinition.g:732:2: ( ruleInlineEnumerationType )
                    // InternalParameterDefinition.g:733:3: ruleInlineEnumerationType
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
    // InternalParameterDefinition.g:742:1: rule__Cardinality__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:746:1: ( ( RULE_INT ) | ( '*' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==18) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalParameterDefinition.g:747:2: ( RULE_INT )
                    {
                    // InternalParameterDefinition.g:747:2: ( RULE_INT )
                    // InternalParameterDefinition.g:748:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:753:2: ( '*' )
                    {
                    // InternalParameterDefinition.g:753:2: ( '*' )
                    // InternalParameterDefinition.g:754:3: '*'
                    {
                     before(grammarAccess.getCardinalityAccess().getAsteriskKeyword_1()); 
                    match(input,18,FOLLOW_2); 
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
    // InternalParameterDefinition.g:763:1: rule__AbstractValue__Alternatives : ( ( ruleSingleValue ) | ( ruleArrayValue ) );
    public final void rule__AbstractValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:767:1: ( ( ruleSingleValue ) | ( ruleArrayValue ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)||(LA6_0>=14 && LA6_0<=15)||(LA6_0>=44 && LA6_0<=45)) ) {
                alt6=1;
            }
            else if ( (LA6_0==47) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalParameterDefinition.g:768:2: ( ruleSingleValue )
                    {
                    // InternalParameterDefinition.g:768:2: ( ruleSingleValue )
                    // InternalParameterDefinition.g:769:3: ruleSingleValue
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
                    // InternalParameterDefinition.g:774:2: ( ruleArrayValue )
                    {
                    // InternalParameterDefinition.g:774:2: ( ruleArrayValue )
                    // InternalParameterDefinition.g:775:3: ruleArrayValue
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
    // InternalParameterDefinition.g:784:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:788:1: ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) )
            int alt7=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_INT) ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_DOCU_COMMENT)||LA7_2==33||LA7_2==36||LA7_2==39||LA7_2==48) ) {
                        alt7=1;
                    }
                    else if ( (LA7_2==44) ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA7_1==44) ) {
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

                if ( (LA7_2==EOF||(LA7_2>=RULE_ID && LA7_2<=RULE_DOCU_COMMENT)||LA7_2==33||LA7_2==36||LA7_2==39||LA7_2==48) ) {
                    alt7=1;
                }
                else if ( (LA7_2==44) ) {
                    alt7=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 2, input);

                    throw nvae;
                }
                }
                break;
            case 44:
                {
                alt7=2;
                }
                break;
            case RULE_STRING:
                {
                alt7=3;
                }
                break;
            case 14:
            case 15:
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
                    // InternalParameterDefinition.g:789:2: ( ( rule__SingleValue__Group_0__0 ) )
                    {
                    // InternalParameterDefinition.g:789:2: ( ( rule__SingleValue__Group_0__0 ) )
                    // InternalParameterDefinition.g:790:3: ( rule__SingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_0()); 
                    // InternalParameterDefinition.g:791:3: ( rule__SingleValue__Group_0__0 )
                    // InternalParameterDefinition.g:791:4: rule__SingleValue__Group_0__0
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
                    // InternalParameterDefinition.g:795:2: ( ( rule__SingleValue__Group_1__0 ) )
                    {
                    // InternalParameterDefinition.g:795:2: ( ( rule__SingleValue__Group_1__0 ) )
                    // InternalParameterDefinition.g:796:3: ( rule__SingleValue__Group_1__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_1()); 
                    // InternalParameterDefinition.g:797:3: ( rule__SingleValue__Group_1__0 )
                    // InternalParameterDefinition.g:797:4: rule__SingleValue__Group_1__0
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
                    // InternalParameterDefinition.g:801:2: ( ( rule__SingleValue__Group_2__0 ) )
                    {
                    // InternalParameterDefinition.g:801:2: ( ( rule__SingleValue__Group_2__0 ) )
                    // InternalParameterDefinition.g:802:3: ( rule__SingleValue__Group_2__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_2()); 
                    // InternalParameterDefinition.g:803:3: ( rule__SingleValue__Group_2__0 )
                    // InternalParameterDefinition.g:803:4: rule__SingleValue__Group_2__0
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
                    // InternalParameterDefinition.g:807:2: ( ( rule__SingleValue__Group_3__0 ) )
                    {
                    // InternalParameterDefinition.g:807:2: ( ( rule__SingleValue__Group_3__0 ) )
                    // InternalParameterDefinition.g:808:3: ( rule__SingleValue__Group_3__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_3()); 
                    // InternalParameterDefinition.g:809:3: ( rule__SingleValue__Group_3__0 )
                    // InternalParameterDefinition.g:809:4: rule__SingleValue__Group_3__0
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
                    // InternalParameterDefinition.g:813:2: ( ( rule__SingleValue__Group_4__0 ) )
                    {
                    // InternalParameterDefinition.g:813:2: ( ( rule__SingleValue__Group_4__0 ) )
                    // InternalParameterDefinition.g:814:3: ( rule__SingleValue__Group_4__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_4()); 
                    // InternalParameterDefinition.g:815:3: ( rule__SingleValue__Group_4__0 )
                    // InternalParameterDefinition.g:815:4: rule__SingleValue__Group_4__0
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
    // InternalParameterDefinition.g:823:1: rule__PRIMITIVE_TYPE_NAME__Alternatives : ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PRIMITIVE_TYPE_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:827:1: ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) )
            int alt8=12;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt8=1;
                }
                break;
            case 20:
                {
                alt8=2;
                }
                break;
            case 21:
                {
                alt8=3;
                }
                break;
            case 22:
                {
                alt8=4;
                }
                break;
            case 23:
                {
                alt8=5;
                }
                break;
            case 24:
                {
                alt8=6;
                }
                break;
            case 25:
                {
                alt8=7;
                }
                break;
            case 26:
                {
                alt8=8;
                }
                break;
            case 27:
                {
                alt8=9;
                }
                break;
            case 28:
                {
                alt8=10;
                }
                break;
            case 29:
                {
                alt8=11;
                }
                break;
            case 30:
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
                    // InternalParameterDefinition.g:828:2: ( ( 'Int8' ) )
                    {
                    // InternalParameterDefinition.g:828:2: ( ( 'Int8' ) )
                    // InternalParameterDefinition.g:829:3: ( 'Int8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 
                    // InternalParameterDefinition.g:830:3: ( 'Int8' )
                    // InternalParameterDefinition.g:830:4: 'Int8'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalParameterDefinition.g:834:2: ( ( 'Int16' ) )
                    {
                    // InternalParameterDefinition.g:834:2: ( ( 'Int16' ) )
                    // InternalParameterDefinition.g:835:3: ( 'Int16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 
                    // InternalParameterDefinition.g:836:3: ( 'Int16' )
                    // InternalParameterDefinition.g:836:4: 'Int16'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalParameterDefinition.g:840:2: ( ( 'Int32' ) )
                    {
                    // InternalParameterDefinition.g:840:2: ( ( 'Int32' ) )
                    // InternalParameterDefinition.g:841:3: ( 'Int32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 
                    // InternalParameterDefinition.g:842:3: ( 'Int32' )
                    // InternalParameterDefinition.g:842:4: 'Int32'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalParameterDefinition.g:846:2: ( ( 'Int64' ) )
                    {
                    // InternalParameterDefinition.g:846:2: ( ( 'Int64' ) )
                    // InternalParameterDefinition.g:847:3: ( 'Int64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 
                    // InternalParameterDefinition.g:848:3: ( 'Int64' )
                    // InternalParameterDefinition.g:848:4: 'Int64'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalParameterDefinition.g:852:2: ( ( 'UInt8' ) )
                    {
                    // InternalParameterDefinition.g:852:2: ( ( 'UInt8' ) )
                    // InternalParameterDefinition.g:853:3: ( 'UInt8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 
                    // InternalParameterDefinition.g:854:3: ( 'UInt8' )
                    // InternalParameterDefinition.g:854:4: 'UInt8'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalParameterDefinition.g:858:2: ( ( 'UInt16' ) )
                    {
                    // InternalParameterDefinition.g:858:2: ( ( 'UInt16' ) )
                    // InternalParameterDefinition.g:859:3: ( 'UInt16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 
                    // InternalParameterDefinition.g:860:3: ( 'UInt16' )
                    // InternalParameterDefinition.g:860:4: 'UInt16'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalParameterDefinition.g:864:2: ( ( 'UInt32' ) )
                    {
                    // InternalParameterDefinition.g:864:2: ( ( 'UInt32' ) )
                    // InternalParameterDefinition.g:865:3: ( 'UInt32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 
                    // InternalParameterDefinition.g:866:3: ( 'UInt32' )
                    // InternalParameterDefinition.g:866:4: 'UInt32'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalParameterDefinition.g:870:2: ( ( 'UInt64' ) )
                    {
                    // InternalParameterDefinition.g:870:2: ( ( 'UInt64' ) )
                    // InternalParameterDefinition.g:871:3: ( 'UInt64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 
                    // InternalParameterDefinition.g:872:3: ( 'UInt64' )
                    // InternalParameterDefinition.g:872:4: 'UInt64'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalParameterDefinition.g:876:2: ( ( 'Float' ) )
                    {
                    // InternalParameterDefinition.g:876:2: ( ( 'Float' ) )
                    // InternalParameterDefinition.g:877:3: ( 'Float' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 
                    // InternalParameterDefinition.g:878:3: ( 'Float' )
                    // InternalParameterDefinition.g:878:4: 'Float'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalParameterDefinition.g:882:2: ( ( 'Double' ) )
                    {
                    // InternalParameterDefinition.g:882:2: ( ( 'Double' ) )
                    // InternalParameterDefinition.g:883:3: ( 'Double' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 
                    // InternalParameterDefinition.g:884:3: ( 'Double' )
                    // InternalParameterDefinition.g:884:4: 'Double'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalParameterDefinition.g:888:2: ( ( 'String' ) )
                    {
                    // InternalParameterDefinition.g:888:2: ( ( 'String' ) )
                    // InternalParameterDefinition.g:889:3: ( 'String' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 
                    // InternalParameterDefinition.g:890:3: ( 'String' )
                    // InternalParameterDefinition.g:890:4: 'String'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalParameterDefinition.g:894:2: ( ( 'Boolean' ) )
                    {
                    // InternalParameterDefinition.g:894:2: ( ( 'Boolean' ) )
                    // InternalParameterDefinition.g:895:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 
                    // InternalParameterDefinition.g:896:3: ( 'Boolean' )
                    // InternalParameterDefinition.g:896:4: 'Boolean'
                    {
                    match(input,30,FOLLOW_2); 

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
    // InternalParameterDefinition.g:904:1: rule__ParamDefModel__Group__0 : rule__ParamDefModel__Group__0__Impl rule__ParamDefModel__Group__1 ;
    public final void rule__ParamDefModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:908:1: ( rule__ParamDefModel__Group__0__Impl rule__ParamDefModel__Group__1 )
            // InternalParameterDefinition.g:909:2: rule__ParamDefModel__Group__0__Impl rule__ParamDefModel__Group__1
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
    // InternalParameterDefinition.g:916:1: rule__ParamDefModel__Group__0__Impl : ( () ) ;
    public final void rule__ParamDefModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:920:1: ( ( () ) )
            // InternalParameterDefinition.g:921:1: ( () )
            {
            // InternalParameterDefinition.g:921:1: ( () )
            // InternalParameterDefinition.g:922:2: ()
            {
             before(grammarAccess.getParamDefModelAccess().getParamDefModelAction_0()); 
            // InternalParameterDefinition.g:923:2: ()
            // InternalParameterDefinition.g:923:3: 
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
    // InternalParameterDefinition.g:931:1: rule__ParamDefModel__Group__1 : rule__ParamDefModel__Group__1__Impl rule__ParamDefModel__Group__2 ;
    public final void rule__ParamDefModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:935:1: ( rule__ParamDefModel__Group__1__Impl rule__ParamDefModel__Group__2 )
            // InternalParameterDefinition.g:936:2: rule__ParamDefModel__Group__1__Impl rule__ParamDefModel__Group__2
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
    // InternalParameterDefinition.g:943:1: rule__ParamDefModel__Group__1__Impl : ( ( rule__ParamDefModel__ImportsAssignment_1 )* ) ;
    public final void rule__ParamDefModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:947:1: ( ( ( rule__ParamDefModel__ImportsAssignment_1 )* ) )
            // InternalParameterDefinition.g:948:1: ( ( rule__ParamDefModel__ImportsAssignment_1 )* )
            {
            // InternalParameterDefinition.g:948:1: ( ( rule__ParamDefModel__ImportsAssignment_1 )* )
            // InternalParameterDefinition.g:949:2: ( rule__ParamDefModel__ImportsAssignment_1 )*
            {
             before(grammarAccess.getParamDefModelAccess().getImportsAssignment_1()); 
            // InternalParameterDefinition.g:950:2: ( rule__ParamDefModel__ImportsAssignment_1 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==32) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalParameterDefinition.g:950:3: rule__ParamDefModel__ImportsAssignment_1
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
    // InternalParameterDefinition.g:958:1: rule__ParamDefModel__Group__2 : rule__ParamDefModel__Group__2__Impl ;
    public final void rule__ParamDefModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:962:1: ( rule__ParamDefModel__Group__2__Impl )
            // InternalParameterDefinition.g:963:2: rule__ParamDefModel__Group__2__Impl
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
    // InternalParameterDefinition.g:969:1: rule__ParamDefModel__Group__2__Impl : ( ( rule__ParamDefModel__RepositoryAssignment_2 )? ) ;
    public final void rule__ParamDefModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:973:1: ( ( ( rule__ParamDefModel__RepositoryAssignment_2 )? ) )
            // InternalParameterDefinition.g:974:1: ( ( rule__ParamDefModel__RepositoryAssignment_2 )? )
            {
            // InternalParameterDefinition.g:974:1: ( ( rule__ParamDefModel__RepositoryAssignment_2 )? )
            // InternalParameterDefinition.g:975:2: ( rule__ParamDefModel__RepositoryAssignment_2 )?
            {
             before(grammarAccess.getParamDefModelAccess().getRepositoryAssignment_2()); 
            // InternalParameterDefinition.g:976:2: ( rule__ParamDefModel__RepositoryAssignment_2 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_DOCU_COMMENT||LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalParameterDefinition.g:976:3: rule__ParamDefModel__RepositoryAssignment_2
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
    // InternalParameterDefinition.g:985:1: rule__FQNW__Group__0 : rule__FQNW__Group__0__Impl rule__FQNW__Group__1 ;
    public final void rule__FQNW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:989:1: ( rule__FQNW__Group__0__Impl rule__FQNW__Group__1 )
            // InternalParameterDefinition.g:990:2: rule__FQNW__Group__0__Impl rule__FQNW__Group__1
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
    // InternalParameterDefinition.g:997:1: rule__FQNW__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1001:1: ( ( ruleFQN ) )
            // InternalParameterDefinition.g:1002:1: ( ruleFQN )
            {
            // InternalParameterDefinition.g:1002:1: ( ruleFQN )
            // InternalParameterDefinition.g:1003:2: ruleFQN
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
    // InternalParameterDefinition.g:1012:1: rule__FQNW__Group__1 : rule__FQNW__Group__1__Impl ;
    public final void rule__FQNW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1016:1: ( rule__FQNW__Group__1__Impl )
            // InternalParameterDefinition.g:1017:2: rule__FQNW__Group__1__Impl
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
    // InternalParameterDefinition.g:1023:1: rule__FQNW__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1027:1: ( ( ( '.*' )? ) )
            // InternalParameterDefinition.g:1028:1: ( ( '.*' )? )
            {
            // InternalParameterDefinition.g:1028:1: ( ( '.*' )? )
            // InternalParameterDefinition.g:1029:2: ( '.*' )?
            {
             before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); 
            // InternalParameterDefinition.g:1030:2: ( '.*' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==31) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalParameterDefinition.g:1030:3: '.*'
                    {
                    match(input,31,FOLLOW_2); 

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
    // InternalParameterDefinition.g:1039:1: rule__ParamDefRepoImport__Group__0 : rule__ParamDefRepoImport__Group__0__Impl rule__ParamDefRepoImport__Group__1 ;
    public final void rule__ParamDefRepoImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1043:1: ( rule__ParamDefRepoImport__Group__0__Impl rule__ParamDefRepoImport__Group__1 )
            // InternalParameterDefinition.g:1044:2: rule__ParamDefRepoImport__Group__0__Impl rule__ParamDefRepoImport__Group__1
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
    // InternalParameterDefinition.g:1051:1: rule__ParamDefRepoImport__Group__0__Impl : ( '#import' ) ;
    public final void rule__ParamDefRepoImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1055:1: ( ( '#import' ) )
            // InternalParameterDefinition.g:1056:1: ( '#import' )
            {
            // InternalParameterDefinition.g:1056:1: ( '#import' )
            // InternalParameterDefinition.g:1057:2: '#import'
            {
             before(grammarAccess.getParamDefRepoImportAccess().getImportKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalParameterDefinition.g:1066:1: rule__ParamDefRepoImport__Group__1 : rule__ParamDefRepoImport__Group__1__Impl rule__ParamDefRepoImport__Group__2 ;
    public final void rule__ParamDefRepoImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1070:1: ( rule__ParamDefRepoImport__Group__1__Impl rule__ParamDefRepoImport__Group__2 )
            // InternalParameterDefinition.g:1071:2: rule__ParamDefRepoImport__Group__1__Impl rule__ParamDefRepoImport__Group__2
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
    // InternalParameterDefinition.g:1078:1: rule__ParamDefRepoImport__Group__1__Impl : ( ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__ParamDefRepoImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1082:1: ( ( ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalParameterDefinition.g:1083:1: ( ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalParameterDefinition.g:1083:1: ( ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 ) )
            // InternalParameterDefinition.g:1084:2: ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getParamDefRepoImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalParameterDefinition.g:1085:2: ( rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 )
            // InternalParameterDefinition.g:1085:3: rule__ParamDefRepoImport__ImportedNamespaceAssignment_1
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
    // InternalParameterDefinition.g:1093:1: rule__ParamDefRepoImport__Group__2 : rule__ParamDefRepoImport__Group__2__Impl ;
    public final void rule__ParamDefRepoImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1097:1: ( rule__ParamDefRepoImport__Group__2__Impl )
            // InternalParameterDefinition.g:1098:2: rule__ParamDefRepoImport__Group__2__Impl
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
    // InternalParameterDefinition.g:1104:1: rule__ParamDefRepoImport__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ParamDefRepoImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1108:1: ( ( ( ';' )? ) )
            // InternalParameterDefinition.g:1109:1: ( ( ';' )? )
            {
            // InternalParameterDefinition.g:1109:1: ( ( ';' )? )
            // InternalParameterDefinition.g:1110:2: ( ';' )?
            {
             before(grammarAccess.getParamDefRepoImportAccess().getSemicolonKeyword_2()); 
            // InternalParameterDefinition.g:1111:2: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==33) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalParameterDefinition.g:1111:3: ';'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalParameterDefinition.g:1120:1: rule__ParameterSetRepository__Group__0 : rule__ParameterSetRepository__Group__0__Impl rule__ParameterSetRepository__Group__1 ;
    public final void rule__ParameterSetRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1124:1: ( rule__ParameterSetRepository__Group__0__Impl rule__ParameterSetRepository__Group__1 )
            // InternalParameterDefinition.g:1125:2: rule__ParameterSetRepository__Group__0__Impl rule__ParameterSetRepository__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalParameterDefinition.g:1132:1: rule__ParameterSetRepository__Group__0__Impl : ( ( rule__ParameterSetRepository__DocumentationAssignment_0 )? ) ;
    public final void rule__ParameterSetRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1136:1: ( ( ( rule__ParameterSetRepository__DocumentationAssignment_0 )? ) )
            // InternalParameterDefinition.g:1137:1: ( ( rule__ParameterSetRepository__DocumentationAssignment_0 )? )
            {
            // InternalParameterDefinition.g:1137:1: ( ( rule__ParameterSetRepository__DocumentationAssignment_0 )? )
            // InternalParameterDefinition.g:1138:2: ( rule__ParameterSetRepository__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getDocumentationAssignment_0()); 
            // InternalParameterDefinition.g:1139:2: ( rule__ParameterSetRepository__DocumentationAssignment_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DOCU_COMMENT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalParameterDefinition.g:1139:3: rule__ParameterSetRepository__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterSetRepository__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterSetRepositoryAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1147:1: rule__ParameterSetRepository__Group__1 : rule__ParameterSetRepository__Group__1__Impl rule__ParameterSetRepository__Group__2 ;
    public final void rule__ParameterSetRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1151:1: ( rule__ParameterSetRepository__Group__1__Impl rule__ParameterSetRepository__Group__2 )
            // InternalParameterDefinition.g:1152:2: rule__ParameterSetRepository__Group__1__Impl rule__ParameterSetRepository__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalParameterDefinition.g:1159:1: rule__ParameterSetRepository__Group__1__Impl : ( 'ParameterSetRepository' ) ;
    public final void rule__ParameterSetRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1163:1: ( ( 'ParameterSetRepository' ) )
            // InternalParameterDefinition.g:1164:1: ( 'ParameterSetRepository' )
            {
            // InternalParameterDefinition.g:1164:1: ( 'ParameterSetRepository' )
            // InternalParameterDefinition.g:1165:2: 'ParameterSetRepository'
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getParameterSetRepositoryKeyword_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParameterSetRepositoryAccess().getParameterSetRepositoryKeyword_1()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1174:1: rule__ParameterSetRepository__Group__2 : rule__ParameterSetRepository__Group__2__Impl rule__ParameterSetRepository__Group__3 ;
    public final void rule__ParameterSetRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1178:1: ( rule__ParameterSetRepository__Group__2__Impl rule__ParameterSetRepository__Group__3 )
            // InternalParameterDefinition.g:1179:2: rule__ParameterSetRepository__Group__2__Impl rule__ParameterSetRepository__Group__3
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
    // InternalParameterDefinition.g:1186:1: rule__ParameterSetRepository__Group__2__Impl : ( ( rule__ParameterSetRepository__NameAssignment_2 ) ) ;
    public final void rule__ParameterSetRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1190:1: ( ( ( rule__ParameterSetRepository__NameAssignment_2 ) ) )
            // InternalParameterDefinition.g:1191:1: ( ( rule__ParameterSetRepository__NameAssignment_2 ) )
            {
            // InternalParameterDefinition.g:1191:1: ( ( rule__ParameterSetRepository__NameAssignment_2 ) )
            // InternalParameterDefinition.g:1192:2: ( rule__ParameterSetRepository__NameAssignment_2 )
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getNameAssignment_2()); 
            // InternalParameterDefinition.g:1193:2: ( rule__ParameterSetRepository__NameAssignment_2 )
            // InternalParameterDefinition.g:1193:3: rule__ParameterSetRepository__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetRepository__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterSetRepositoryAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1201:1: rule__ParameterSetRepository__Group__3 : rule__ParameterSetRepository__Group__3__Impl rule__ParameterSetRepository__Group__4 ;
    public final void rule__ParameterSetRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1205:1: ( rule__ParameterSetRepository__Group__3__Impl rule__ParameterSetRepository__Group__4 )
            // InternalParameterDefinition.g:1206:2: rule__ParameterSetRepository__Group__3__Impl rule__ParameterSetRepository__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalParameterDefinition.g:1213:1: rule__ParameterSetRepository__Group__3__Impl : ( '{' ) ;
    public final void rule__ParameterSetRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1217:1: ( ( '{' ) )
            // InternalParameterDefinition.g:1218:1: ( '{' )
            {
            // InternalParameterDefinition.g:1218:1: ( '{' )
            // InternalParameterDefinition.g:1219:2: '{'
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getParameterSetRepositoryAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1228:1: rule__ParameterSetRepository__Group__4 : rule__ParameterSetRepository__Group__4__Impl rule__ParameterSetRepository__Group__5 ;
    public final void rule__ParameterSetRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1232:1: ( rule__ParameterSetRepository__Group__4__Impl rule__ParameterSetRepository__Group__5 )
            // InternalParameterDefinition.g:1233:2: rule__ParameterSetRepository__Group__4__Impl rule__ParameterSetRepository__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ParameterSetRepository__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetRepository__Group__5();

            state._fsp--;


            }

        }
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
    // InternalParameterDefinition.g:1240:1: rule__ParameterSetRepository__Group__4__Impl : ( ( rule__ParameterSetRepository__SetsAssignment_4 )* ) ;
    public final void rule__ParameterSetRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1244:1: ( ( ( rule__ParameterSetRepository__SetsAssignment_4 )* ) )
            // InternalParameterDefinition.g:1245:1: ( ( rule__ParameterSetRepository__SetsAssignment_4 )* )
            {
            // InternalParameterDefinition.g:1245:1: ( ( rule__ParameterSetRepository__SetsAssignment_4 )* )
            // InternalParameterDefinition.g:1246:2: ( rule__ParameterSetRepository__SetsAssignment_4 )*
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getSetsAssignment_4()); 
            // InternalParameterDefinition.g:1247:2: ( rule__ParameterSetRepository__SetsAssignment_4 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_DOCU_COMMENT||LA14_0==37) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalParameterDefinition.g:1247:3: rule__ParameterSetRepository__SetsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ParameterSetRepository__SetsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getParameterSetRepositoryAccess().getSetsAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ParameterSetRepository__Group__5"
    // InternalParameterDefinition.g:1255:1: rule__ParameterSetRepository__Group__5 : rule__ParameterSetRepository__Group__5__Impl ;
    public final void rule__ParameterSetRepository__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1259:1: ( rule__ParameterSetRepository__Group__5__Impl )
            // InternalParameterDefinition.g:1260:2: rule__ParameterSetRepository__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetRepository__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__5"


    // $ANTLR start "rule__ParameterSetRepository__Group__5__Impl"
    // InternalParameterDefinition.g:1266:1: rule__ParameterSetRepository__Group__5__Impl : ( '}' ) ;
    public final void rule__ParameterSetRepository__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1270:1: ( ( '}' ) )
            // InternalParameterDefinition.g:1271:1: ( '}' )
            {
            // InternalParameterDefinition.g:1271:1: ( '}' )
            // InternalParameterDefinition.g:1272:2: '}'
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getParameterSetRepositoryAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__Group__5__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group__0"
    // InternalParameterDefinition.g:1282:1: rule__ParameterSetDefinition__Group__0 : rule__ParameterSetDefinition__Group__0__Impl rule__ParameterSetDefinition__Group__1 ;
    public final void rule__ParameterSetDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1286:1: ( rule__ParameterSetDefinition__Group__0__Impl rule__ParameterSetDefinition__Group__1 )
            // InternalParameterDefinition.g:1287:2: rule__ParameterSetDefinition__Group__0__Impl rule__ParameterSetDefinition__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalParameterDefinition.g:1294:1: rule__ParameterSetDefinition__Group__0__Impl : ( ( rule__ParameterSetDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__ParameterSetDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1298:1: ( ( ( rule__ParameterSetDefinition__DocumentationAssignment_0 )? ) )
            // InternalParameterDefinition.g:1299:1: ( ( rule__ParameterSetDefinition__DocumentationAssignment_0 )? )
            {
            // InternalParameterDefinition.g:1299:1: ( ( rule__ParameterSetDefinition__DocumentationAssignment_0 )? )
            // InternalParameterDefinition.g:1300:2: ( rule__ParameterSetDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalParameterDefinition.g:1301:2: ( rule__ParameterSetDefinition__DocumentationAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DOCU_COMMENT) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalParameterDefinition.g:1301:3: rule__ParameterSetDefinition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterSetDefinition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterSetDefinitionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1309:1: rule__ParameterSetDefinition__Group__1 : rule__ParameterSetDefinition__Group__1__Impl rule__ParameterSetDefinition__Group__2 ;
    public final void rule__ParameterSetDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1313:1: ( rule__ParameterSetDefinition__Group__1__Impl rule__ParameterSetDefinition__Group__2 )
            // InternalParameterDefinition.g:1314:2: rule__ParameterSetDefinition__Group__1__Impl rule__ParameterSetDefinition__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalParameterDefinition.g:1321:1: rule__ParameterSetDefinition__Group__1__Impl : ( 'ParameterSet' ) ;
    public final void rule__ParameterSetDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1325:1: ( ( 'ParameterSet' ) )
            // InternalParameterDefinition.g:1326:1: ( 'ParameterSet' )
            {
            // InternalParameterDefinition.g:1326:1: ( 'ParameterSet' )
            // InternalParameterDefinition.g:1327:2: 'ParameterSet'
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getParameterSetKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getParameterSetKeyword_1()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1336:1: rule__ParameterSetDefinition__Group__2 : rule__ParameterSetDefinition__Group__2__Impl rule__ParameterSetDefinition__Group__3 ;
    public final void rule__ParameterSetDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1340:1: ( rule__ParameterSetDefinition__Group__2__Impl rule__ParameterSetDefinition__Group__3 )
            // InternalParameterDefinition.g:1341:2: rule__ParameterSetDefinition__Group__2__Impl rule__ParameterSetDefinition__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalParameterDefinition.g:1348:1: rule__ParameterSetDefinition__Group__2__Impl : ( ( rule__ParameterSetDefinition__NameAssignment_2 ) ) ;
    public final void rule__ParameterSetDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1352:1: ( ( ( rule__ParameterSetDefinition__NameAssignment_2 ) ) )
            // InternalParameterDefinition.g:1353:1: ( ( rule__ParameterSetDefinition__NameAssignment_2 ) )
            {
            // InternalParameterDefinition.g:1353:1: ( ( rule__ParameterSetDefinition__NameAssignment_2 ) )
            // InternalParameterDefinition.g:1354:2: ( rule__ParameterSetDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getNameAssignment_2()); 
            // InternalParameterDefinition.g:1355:2: ( rule__ParameterSetDefinition__NameAssignment_2 )
            // InternalParameterDefinition.g:1355:3: rule__ParameterSetDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterSetDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1363:1: rule__ParameterSetDefinition__Group__3 : rule__ParameterSetDefinition__Group__3__Impl rule__ParameterSetDefinition__Group__4 ;
    public final void rule__ParameterSetDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1367:1: ( rule__ParameterSetDefinition__Group__3__Impl rule__ParameterSetDefinition__Group__4 )
            // InternalParameterDefinition.g:1368:2: rule__ParameterSetDefinition__Group__3__Impl rule__ParameterSetDefinition__Group__4
            {
            pushFollow(FOLLOW_13);
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
    // InternalParameterDefinition.g:1375:1: rule__ParameterSetDefinition__Group__3__Impl : ( ( rule__ParameterSetDefinition__Group_3__0 )? ) ;
    public final void rule__ParameterSetDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1379:1: ( ( ( rule__ParameterSetDefinition__Group_3__0 )? ) )
            // InternalParameterDefinition.g:1380:1: ( ( rule__ParameterSetDefinition__Group_3__0 )? )
            {
            // InternalParameterDefinition.g:1380:1: ( ( rule__ParameterSetDefinition__Group_3__0 )? )
            // InternalParameterDefinition.g:1381:2: ( rule__ParameterSetDefinition__Group_3__0 )?
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getGroup_3()); 
            // InternalParameterDefinition.g:1382:2: ( rule__ParameterSetDefinition__Group_3__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==38) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalParameterDefinition.g:1382:3: rule__ParameterSetDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterSetDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterSetDefinitionAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1390:1: rule__ParameterSetDefinition__Group__4 : rule__ParameterSetDefinition__Group__4__Impl rule__ParameterSetDefinition__Group__5 ;
    public final void rule__ParameterSetDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1394:1: ( rule__ParameterSetDefinition__Group__4__Impl rule__ParameterSetDefinition__Group__5 )
            // InternalParameterDefinition.g:1395:2: rule__ParameterSetDefinition__Group__4__Impl rule__ParameterSetDefinition__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalParameterDefinition.g:1402:1: rule__ParameterSetDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__ParameterSetDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1406:1: ( ( '{' ) )
            // InternalParameterDefinition.g:1407:1: ( '{' )
            {
            // InternalParameterDefinition.g:1407:1: ( '{' )
            // InternalParameterDefinition.g:1408:2: '{'
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1417:1: rule__ParameterSetDefinition__Group__5 : rule__ParameterSetDefinition__Group__5__Impl rule__ParameterSetDefinition__Group__6 ;
    public final void rule__ParameterSetDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1421:1: ( rule__ParameterSetDefinition__Group__5__Impl rule__ParameterSetDefinition__Group__6 )
            // InternalParameterDefinition.g:1422:2: rule__ParameterSetDefinition__Group__5__Impl rule__ParameterSetDefinition__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ParameterSetDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group__6();

            state._fsp--;


            }

        }
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
    // InternalParameterDefinition.g:1429:1: rule__ParameterSetDefinition__Group__5__Impl : ( ( rule__ParameterSetDefinition__ParametersAssignment_5 )* ) ;
    public final void rule__ParameterSetDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1433:1: ( ( ( rule__ParameterSetDefinition__ParametersAssignment_5 )* ) )
            // InternalParameterDefinition.g:1434:1: ( ( rule__ParameterSetDefinition__ParametersAssignment_5 )* )
            {
            // InternalParameterDefinition.g:1434:1: ( ( rule__ParameterSetDefinition__ParametersAssignment_5 )* )
            // InternalParameterDefinition.g:1435:2: ( rule__ParameterSetDefinition__ParametersAssignment_5 )*
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getParametersAssignment_5()); 
            // InternalParameterDefinition.g:1436:2: ( rule__ParameterSetDefinition__ParametersAssignment_5 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_DOCU_COMMENT||(LA17_0>=40 && LA17_0<=41)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalParameterDefinition.g:1436:3: rule__ParameterSetDefinition__ParametersAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ParameterSetDefinition__ParametersAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getParameterSetDefinitionAccess().getParametersAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__ParameterSetDefinition__Group__6"
    // InternalParameterDefinition.g:1444:1: rule__ParameterSetDefinition__Group__6 : rule__ParameterSetDefinition__Group__6__Impl ;
    public final void rule__ParameterSetDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1448:1: ( rule__ParameterSetDefinition__Group__6__Impl )
            // InternalParameterDefinition.g:1449:2: rule__ParameterSetDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__6"


    // $ANTLR start "rule__ParameterSetDefinition__Group__6__Impl"
    // InternalParameterDefinition.g:1455:1: rule__ParameterSetDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__ParameterSetDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1459:1: ( ( '}' ) )
            // InternalParameterDefinition.g:1460:1: ( '}' )
            {
            // InternalParameterDefinition.g:1460:1: ( '}' )
            // InternalParameterDefinition.g:1461:2: '}'
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group__6__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group_3__0"
    // InternalParameterDefinition.g:1471:1: rule__ParameterSetDefinition__Group_3__0 : rule__ParameterSetDefinition__Group_3__0__Impl rule__ParameterSetDefinition__Group_3__1 ;
    public final void rule__ParameterSetDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1475:1: ( rule__ParameterSetDefinition__Group_3__0__Impl rule__ParameterSetDefinition__Group_3__1 )
            // InternalParameterDefinition.g:1476:2: rule__ParameterSetDefinition__Group_3__0__Impl rule__ParameterSetDefinition__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__ParameterSetDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_3__0"


    // $ANTLR start "rule__ParameterSetDefinition__Group_3__0__Impl"
    // InternalParameterDefinition.g:1483:1: rule__ParameterSetDefinition__Group_3__0__Impl : ( 'extends' ) ;
    public final void rule__ParameterSetDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1487:1: ( ( 'extends' ) )
            // InternalParameterDefinition.g:1488:1: ( 'extends' )
            {
            // InternalParameterDefinition.g:1488:1: ( 'extends' )
            // InternalParameterDefinition.g:1489:2: 'extends'
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group_3__1"
    // InternalParameterDefinition.g:1498:1: rule__ParameterSetDefinition__Group_3__1 : rule__ParameterSetDefinition__Group_3__1__Impl rule__ParameterSetDefinition__Group_3__2 ;
    public final void rule__ParameterSetDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1502:1: ( rule__ParameterSetDefinition__Group_3__1__Impl rule__ParameterSetDefinition__Group_3__2 )
            // InternalParameterDefinition.g:1503:2: rule__ParameterSetDefinition__Group_3__1__Impl rule__ParameterSetDefinition__Group_3__2
            {
            pushFollow(FOLLOW_16);
            rule__ParameterSetDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_3__1"


    // $ANTLR start "rule__ParameterSetDefinition__Group_3__1__Impl"
    // InternalParameterDefinition.g:1510:1: rule__ParameterSetDefinition__Group_3__1__Impl : ( ( rule__ParameterSetDefinition__ExtendsAssignment_3_1 ) ) ;
    public final void rule__ParameterSetDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1514:1: ( ( ( rule__ParameterSetDefinition__ExtendsAssignment_3_1 ) ) )
            // InternalParameterDefinition.g:1515:1: ( ( rule__ParameterSetDefinition__ExtendsAssignment_3_1 ) )
            {
            // InternalParameterDefinition.g:1515:1: ( ( rule__ParameterSetDefinition__ExtendsAssignment_3_1 ) )
            // InternalParameterDefinition.g:1516:2: ( rule__ParameterSetDefinition__ExtendsAssignment_3_1 )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_3_1()); 
            // InternalParameterDefinition.g:1517:2: ( rule__ParameterSetDefinition__ExtendsAssignment_3_1 )
            // InternalParameterDefinition.g:1517:3: rule__ParameterSetDefinition__ExtendsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__ExtendsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group_3__2"
    // InternalParameterDefinition.g:1525:1: rule__ParameterSetDefinition__Group_3__2 : rule__ParameterSetDefinition__Group_3__2__Impl ;
    public final void rule__ParameterSetDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1529:1: ( rule__ParameterSetDefinition__Group_3__2__Impl )
            // InternalParameterDefinition.g:1530:2: rule__ParameterSetDefinition__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_3__2"


    // $ANTLR start "rule__ParameterSetDefinition__Group_3__2__Impl"
    // InternalParameterDefinition.g:1536:1: rule__ParameterSetDefinition__Group_3__2__Impl : ( ( rule__ParameterSetDefinition__Group_3_2__0 )* ) ;
    public final void rule__ParameterSetDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1540:1: ( ( ( rule__ParameterSetDefinition__Group_3_2__0 )* ) )
            // InternalParameterDefinition.g:1541:1: ( ( rule__ParameterSetDefinition__Group_3_2__0 )* )
            {
            // InternalParameterDefinition.g:1541:1: ( ( rule__ParameterSetDefinition__Group_3_2__0 )* )
            // InternalParameterDefinition.g:1542:2: ( rule__ParameterSetDefinition__Group_3_2__0 )*
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getGroup_3_2()); 
            // InternalParameterDefinition.g:1543:2: ( rule__ParameterSetDefinition__Group_3_2__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==39) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalParameterDefinition.g:1543:3: rule__ParameterSetDefinition__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ParameterSetDefinition__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getParameterSetDefinitionAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group_3_2__0"
    // InternalParameterDefinition.g:1552:1: rule__ParameterSetDefinition__Group_3_2__0 : rule__ParameterSetDefinition__Group_3_2__0__Impl rule__ParameterSetDefinition__Group_3_2__1 ;
    public final void rule__ParameterSetDefinition__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1556:1: ( rule__ParameterSetDefinition__Group_3_2__0__Impl rule__ParameterSetDefinition__Group_3_2__1 )
            // InternalParameterDefinition.g:1557:2: rule__ParameterSetDefinition__Group_3_2__0__Impl rule__ParameterSetDefinition__Group_3_2__1
            {
            pushFollow(FOLLOW_6);
            rule__ParameterSetDefinition__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_3_2__0"


    // $ANTLR start "rule__ParameterSetDefinition__Group_3_2__0__Impl"
    // InternalParameterDefinition.g:1564:1: rule__ParameterSetDefinition__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__ParameterSetDefinition__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1568:1: ( ( ',' ) )
            // InternalParameterDefinition.g:1569:1: ( ',' )
            {
            // InternalParameterDefinition.g:1569:1: ( ',' )
            // InternalParameterDefinition.g:1570:2: ','
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getCommaKeyword_3_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_3_2__0__Impl"


    // $ANTLR start "rule__ParameterSetDefinition__Group_3_2__1"
    // InternalParameterDefinition.g:1579:1: rule__ParameterSetDefinition__Group_3_2__1 : rule__ParameterSetDefinition__Group_3_2__1__Impl ;
    public final void rule__ParameterSetDefinition__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1583:1: ( rule__ParameterSetDefinition__Group_3_2__1__Impl )
            // InternalParameterDefinition.g:1584:2: rule__ParameterSetDefinition__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_3_2__1"


    // $ANTLR start "rule__ParameterSetDefinition__Group_3_2__1__Impl"
    // InternalParameterDefinition.g:1590:1: rule__ParameterSetDefinition__Group_3_2__1__Impl : ( ( rule__ParameterSetDefinition__ExtendsAssignment_3_2_1 ) ) ;
    public final void rule__ParameterSetDefinition__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1594:1: ( ( ( rule__ParameterSetDefinition__ExtendsAssignment_3_2_1 ) ) )
            // InternalParameterDefinition.g:1595:1: ( ( rule__ParameterSetDefinition__ExtendsAssignment_3_2_1 ) )
            {
            // InternalParameterDefinition.g:1595:1: ( ( rule__ParameterSetDefinition__ExtendsAssignment_3_2_1 ) )
            // InternalParameterDefinition.g:1596:2: ( rule__ParameterSetDefinition__ExtendsAssignment_3_2_1 )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_3_2_1()); 
            // InternalParameterDefinition.g:1597:2: ( rule__ParameterSetDefinition__ExtendsAssignment_3_2_1 )
            // InternalParameterDefinition.g:1597:3: rule__ParameterSetDefinition__ExtendsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterSetDefinition__ExtendsAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__Group_3_2__1__Impl"


    // $ANTLR start "rule__ParameterDefinition__Group__0"
    // InternalParameterDefinition.g:1606:1: rule__ParameterDefinition__Group__0 : rule__ParameterDefinition__Group__0__Impl rule__ParameterDefinition__Group__1 ;
    public final void rule__ParameterDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1610:1: ( rule__ParameterDefinition__Group__0__Impl rule__ParameterDefinition__Group__1 )
            // InternalParameterDefinition.g:1611:2: rule__ParameterDefinition__Group__0__Impl rule__ParameterDefinition__Group__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalParameterDefinition.g:1618:1: rule__ParameterDefinition__Group__0__Impl : ( ( rule__ParameterDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__ParameterDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1622:1: ( ( ( rule__ParameterDefinition__DocumentationAssignment_0 )? ) )
            // InternalParameterDefinition.g:1623:1: ( ( rule__ParameterDefinition__DocumentationAssignment_0 )? )
            {
            // InternalParameterDefinition.g:1623:1: ( ( rule__ParameterDefinition__DocumentationAssignment_0 )? )
            // InternalParameterDefinition.g:1624:2: ( rule__ParameterDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getParameterDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalParameterDefinition.g:1625:2: ( rule__ParameterDefinition__DocumentationAssignment_0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_DOCU_COMMENT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalParameterDefinition.g:1625:3: rule__ParameterDefinition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterDefinition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getParameterDefinitionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1633:1: rule__ParameterDefinition__Group__1 : rule__ParameterDefinition__Group__1__Impl rule__ParameterDefinition__Group__2 ;
    public final void rule__ParameterDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1637:1: ( rule__ParameterDefinition__Group__1__Impl rule__ParameterDefinition__Group__2 )
            // InternalParameterDefinition.g:1638:2: rule__ParameterDefinition__Group__1__Impl rule__ParameterDefinition__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalParameterDefinition.g:1645:1: rule__ParameterDefinition__Group__1__Impl : ( 'Parameter' ) ;
    public final void rule__ParameterDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1649:1: ( ( 'Parameter' ) )
            // InternalParameterDefinition.g:1650:1: ( 'Parameter' )
            {
            // InternalParameterDefinition.g:1650:1: ( 'Parameter' )
            // InternalParameterDefinition.g:1651:2: 'Parameter'
            {
             before(grammarAccess.getParameterDefinitionAccess().getParameterKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getParameterDefinitionAccess().getParameterKeyword_1()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1660:1: rule__ParameterDefinition__Group__2 : rule__ParameterDefinition__Group__2__Impl rule__ParameterDefinition__Group__3 ;
    public final void rule__ParameterDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1664:1: ( rule__ParameterDefinition__Group__2__Impl rule__ParameterDefinition__Group__3 )
            // InternalParameterDefinition.g:1665:2: rule__ParameterDefinition__Group__2__Impl rule__ParameterDefinition__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalParameterDefinition.g:1672:1: rule__ParameterDefinition__Group__2__Impl : ( ( rule__ParameterDefinition__NameAssignment_2 ) ) ;
    public final void rule__ParameterDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1676:1: ( ( ( rule__ParameterDefinition__NameAssignment_2 ) ) )
            // InternalParameterDefinition.g:1677:1: ( ( rule__ParameterDefinition__NameAssignment_2 ) )
            {
            // InternalParameterDefinition.g:1677:1: ( ( rule__ParameterDefinition__NameAssignment_2 ) )
            // InternalParameterDefinition.g:1678:2: ( rule__ParameterDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getParameterDefinitionAccess().getNameAssignment_2()); 
            // InternalParameterDefinition.g:1679:2: ( rule__ParameterDefinition__NameAssignment_2 )
            // InternalParameterDefinition.g:1679:3: rule__ParameterDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getParameterDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1687:1: rule__ParameterDefinition__Group__3 : rule__ParameterDefinition__Group__3__Impl rule__ParameterDefinition__Group__4 ;
    public final void rule__ParameterDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1691:1: ( rule__ParameterDefinition__Group__3__Impl rule__ParameterDefinition__Group__4 )
            // InternalParameterDefinition.g:1692:2: rule__ParameterDefinition__Group__3__Impl rule__ParameterDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalParameterDefinition.g:1699:1: rule__ParameterDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ParameterDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1703:1: ( ( '{' ) )
            // InternalParameterDefinition.g:1704:1: ( '{' )
            {
            // InternalParameterDefinition.g:1704:1: ( '{' )
            // InternalParameterDefinition.g:1705:2: '{'
            {
             before(grammarAccess.getParameterDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getParameterDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1714:1: rule__ParameterDefinition__Group__4 : rule__ParameterDefinition__Group__4__Impl rule__ParameterDefinition__Group__5 ;
    public final void rule__ParameterDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1718:1: ( rule__ParameterDefinition__Group__4__Impl rule__ParameterDefinition__Group__5 )
            // InternalParameterDefinition.g:1719:2: rule__ParameterDefinition__Group__4__Impl rule__ParameterDefinition__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__ParameterDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterDefinition__Group__5();

            state._fsp--;


            }

        }
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
    // InternalParameterDefinition.g:1726:1: rule__ParameterDefinition__Group__4__Impl : ( ( rule__ParameterDefinition__AttributesAssignment_4 )* ) ;
    public final void rule__ParameterDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1730:1: ( ( ( rule__ParameterDefinition__AttributesAssignment_4 )* ) )
            // InternalParameterDefinition.g:1731:1: ( ( rule__ParameterDefinition__AttributesAssignment_4 )* )
            {
            // InternalParameterDefinition.g:1731:1: ( ( rule__ParameterDefinition__AttributesAssignment_4 )* )
            // InternalParameterDefinition.g:1732:2: ( rule__ParameterDefinition__AttributesAssignment_4 )*
            {
             before(grammarAccess.getParameterDefinitionAccess().getAttributesAssignment_4()); 
            // InternalParameterDefinition.g:1733:2: ( rule__ParameterDefinition__AttributesAssignment_4 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=RULE_ID && LA20_0<=RULE_DOCU_COMMENT)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalParameterDefinition.g:1733:3: rule__ParameterDefinition__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__ParameterDefinition__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getParameterDefinitionAccess().getAttributesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__ParameterDefinition__Group__5"
    // InternalParameterDefinition.g:1741:1: rule__ParameterDefinition__Group__5 : rule__ParameterDefinition__Group__5__Impl ;
    public final void rule__ParameterDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1745:1: ( rule__ParameterDefinition__Group__5__Impl )
            // InternalParameterDefinition.g:1746:2: rule__ParameterDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__5"


    // $ANTLR start "rule__ParameterDefinition__Group__5__Impl"
    // InternalParameterDefinition.g:1752:1: rule__ParameterDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ParameterDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1756:1: ( ( '}' ) )
            // InternalParameterDefinition.g:1757:1: ( '}' )
            {
            // InternalParameterDefinition.g:1757:1: ( '}' )
            // InternalParameterDefinition.g:1758:2: '}'
            {
             before(grammarAccess.getParameterDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getParameterDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__Group__5__Impl"


    // $ANTLR start "rule__TriggerDefinition__Group__0"
    // InternalParameterDefinition.g:1768:1: rule__TriggerDefinition__Group__0 : rule__TriggerDefinition__Group__0__Impl rule__TriggerDefinition__Group__1 ;
    public final void rule__TriggerDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1772:1: ( rule__TriggerDefinition__Group__0__Impl rule__TriggerDefinition__Group__1 )
            // InternalParameterDefinition.g:1773:2: rule__TriggerDefinition__Group__0__Impl rule__TriggerDefinition__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalParameterDefinition.g:1780:1: rule__TriggerDefinition__Group__0__Impl : ( ( rule__TriggerDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__TriggerDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1784:1: ( ( ( rule__TriggerDefinition__DocumentationAssignment_0 )? ) )
            // InternalParameterDefinition.g:1785:1: ( ( rule__TriggerDefinition__DocumentationAssignment_0 )? )
            {
            // InternalParameterDefinition.g:1785:1: ( ( rule__TriggerDefinition__DocumentationAssignment_0 )? )
            // InternalParameterDefinition.g:1786:2: ( rule__TriggerDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getTriggerDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalParameterDefinition.g:1787:2: ( rule__TriggerDefinition__DocumentationAssignment_0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_DOCU_COMMENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalParameterDefinition.g:1787:3: rule__TriggerDefinition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TriggerDefinition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTriggerDefinitionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1795:1: rule__TriggerDefinition__Group__1 : rule__TriggerDefinition__Group__1__Impl rule__TriggerDefinition__Group__2 ;
    public final void rule__TriggerDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1799:1: ( rule__TriggerDefinition__Group__1__Impl rule__TriggerDefinition__Group__2 )
            // InternalParameterDefinition.g:1800:2: rule__TriggerDefinition__Group__1__Impl rule__TriggerDefinition__Group__2
            {
            pushFollow(FOLLOW_6);
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
    // InternalParameterDefinition.g:1807:1: rule__TriggerDefinition__Group__1__Impl : ( 'Trigger' ) ;
    public final void rule__TriggerDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1811:1: ( ( 'Trigger' ) )
            // InternalParameterDefinition.g:1812:1: ( 'Trigger' )
            {
            // InternalParameterDefinition.g:1812:1: ( 'Trigger' )
            // InternalParameterDefinition.g:1813:2: 'Trigger'
            {
             before(grammarAccess.getTriggerDefinitionAccess().getTriggerKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTriggerDefinitionAccess().getTriggerKeyword_1()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1822:1: rule__TriggerDefinition__Group__2 : rule__TriggerDefinition__Group__2__Impl rule__TriggerDefinition__Group__3 ;
    public final void rule__TriggerDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1826:1: ( rule__TriggerDefinition__Group__2__Impl rule__TriggerDefinition__Group__3 )
            // InternalParameterDefinition.g:1827:2: rule__TriggerDefinition__Group__2__Impl rule__TriggerDefinition__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalParameterDefinition.g:1834:1: rule__TriggerDefinition__Group__2__Impl : ( ( rule__TriggerDefinition__NameAssignment_2 ) ) ;
    public final void rule__TriggerDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1838:1: ( ( ( rule__TriggerDefinition__NameAssignment_2 ) ) )
            // InternalParameterDefinition.g:1839:1: ( ( rule__TriggerDefinition__NameAssignment_2 ) )
            {
            // InternalParameterDefinition.g:1839:1: ( ( rule__TriggerDefinition__NameAssignment_2 ) )
            // InternalParameterDefinition.g:1840:2: ( rule__TriggerDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getTriggerDefinitionAccess().getNameAssignment_2()); 
            // InternalParameterDefinition.g:1841:2: ( rule__TriggerDefinition__NameAssignment_2 )
            // InternalParameterDefinition.g:1841:3: rule__TriggerDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TriggerDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTriggerDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1849:1: rule__TriggerDefinition__Group__3 : rule__TriggerDefinition__Group__3__Impl rule__TriggerDefinition__Group__4 ;
    public final void rule__TriggerDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1853:1: ( rule__TriggerDefinition__Group__3__Impl rule__TriggerDefinition__Group__4 )
            // InternalParameterDefinition.g:1854:2: rule__TriggerDefinition__Group__3__Impl rule__TriggerDefinition__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalParameterDefinition.g:1861:1: rule__TriggerDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__TriggerDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1865:1: ( ( '{' ) )
            // InternalParameterDefinition.g:1866:1: ( '{' )
            {
            // InternalParameterDefinition.g:1866:1: ( '{' )
            // InternalParameterDefinition.g:1867:2: '{'
            {
             before(grammarAccess.getTriggerDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTriggerDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1876:1: rule__TriggerDefinition__Group__4 : rule__TriggerDefinition__Group__4__Impl rule__TriggerDefinition__Group__5 ;
    public final void rule__TriggerDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1880:1: ( rule__TriggerDefinition__Group__4__Impl rule__TriggerDefinition__Group__5 )
            // InternalParameterDefinition.g:1881:2: rule__TriggerDefinition__Group__4__Impl rule__TriggerDefinition__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__TriggerDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerDefinition__Group__5();

            state._fsp--;


            }

        }
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
    // InternalParameterDefinition.g:1888:1: rule__TriggerDefinition__Group__4__Impl : ( ( rule__TriggerDefinition__AttributesAssignment_4 )* ) ;
    public final void rule__TriggerDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1892:1: ( ( ( rule__TriggerDefinition__AttributesAssignment_4 )* ) )
            // InternalParameterDefinition.g:1893:1: ( ( rule__TriggerDefinition__AttributesAssignment_4 )* )
            {
            // InternalParameterDefinition.g:1893:1: ( ( rule__TriggerDefinition__AttributesAssignment_4 )* )
            // InternalParameterDefinition.g:1894:2: ( rule__TriggerDefinition__AttributesAssignment_4 )*
            {
             before(grammarAccess.getTriggerDefinitionAccess().getAttributesAssignment_4()); 
            // InternalParameterDefinition.g:1895:2: ( rule__TriggerDefinition__AttributesAssignment_4 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_DOCU_COMMENT)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalParameterDefinition.g:1895:3: rule__TriggerDefinition__AttributesAssignment_4
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__TriggerDefinition__AttributesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getTriggerDefinitionAccess().getAttributesAssignment_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__TriggerDefinition__Group__5"
    // InternalParameterDefinition.g:1903:1: rule__TriggerDefinition__Group__5 : rule__TriggerDefinition__Group__5__Impl ;
    public final void rule__TriggerDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1907:1: ( rule__TriggerDefinition__Group__5__Impl )
            // InternalParameterDefinition.g:1908:2: rule__TriggerDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TriggerDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__5"


    // $ANTLR start "rule__TriggerDefinition__Group__5__Impl"
    // InternalParameterDefinition.g:1914:1: rule__TriggerDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__TriggerDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1918:1: ( ( '}' ) )
            // InternalParameterDefinition.g:1919:1: ( '}' )
            {
            // InternalParameterDefinition.g:1919:1: ( '}' )
            // InternalParameterDefinition.g:1920:2: '}'
            {
             before(grammarAccess.getTriggerDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTriggerDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__Group__5__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__0"
    // InternalParameterDefinition.g:1930:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1934:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalParameterDefinition.g:1935:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalParameterDefinition.g:1942:1: rule__AttributeDefinition__Group__0__Impl : ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1946:1: ( ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? ) )
            // InternalParameterDefinition.g:1947:1: ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? )
            {
            // InternalParameterDefinition.g:1947:1: ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? )
            // InternalParameterDefinition.g:1948:2: ( rule__AttributeDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalParameterDefinition.g:1949:2: ( rule__AttributeDefinition__DocumentationAssignment_0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_DOCU_COMMENT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalParameterDefinition.g:1949:3: rule__AttributeDefinition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeDefinition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeDefinitionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1957:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1961:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalParameterDefinition.g:1962:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalParameterDefinition.g:1969:1: rule__AttributeDefinition__Group__1__Impl : ( ( rule__AttributeDefinition__NameAssignment_1 ) ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1973:1: ( ( ( rule__AttributeDefinition__NameAssignment_1 ) ) )
            // InternalParameterDefinition.g:1974:1: ( ( rule__AttributeDefinition__NameAssignment_1 ) )
            {
            // InternalParameterDefinition.g:1974:1: ( ( rule__AttributeDefinition__NameAssignment_1 ) )
            // InternalParameterDefinition.g:1975:2: ( rule__AttributeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_1()); 
            // InternalParameterDefinition.g:1976:2: ( rule__AttributeDefinition__NameAssignment_1 )
            // InternalParameterDefinition.g:1976:3: rule__AttributeDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:1984:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:1988:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalParameterDefinition.g:1989:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
            {
            pushFollow(FOLLOW_24);
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
    // InternalParameterDefinition.g:1996:1: rule__AttributeDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2000:1: ( ( ':' ) )
            // InternalParameterDefinition.g:2001:1: ( ':' )
            {
            // InternalParameterDefinition.g:2001:1: ( ':' )
            // InternalParameterDefinition.g:2002:2: ':'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:2011:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2015:1: ( rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 )
            // InternalParameterDefinition.g:2016:2: rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalParameterDefinition.g:2023:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__TypeAssignment_3 ) ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2027:1: ( ( ( rule__AttributeDefinition__TypeAssignment_3 ) ) )
            // InternalParameterDefinition.g:2028:1: ( ( rule__AttributeDefinition__TypeAssignment_3 ) )
            {
            // InternalParameterDefinition.g:2028:1: ( ( rule__AttributeDefinition__TypeAssignment_3 ) )
            // InternalParameterDefinition.g:2029:2: ( rule__AttributeDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_3()); 
            // InternalParameterDefinition.g:2030:2: ( rule__AttributeDefinition__TypeAssignment_3 )
            // InternalParameterDefinition.g:2030:3: rule__AttributeDefinition__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_3()); 

            }


            }

        }
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
    // InternalParameterDefinition.g:2038:1: rule__AttributeDefinition__Group__4 : rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5 ;
    public final void rule__AttributeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2042:1: ( rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5 )
            // InternalParameterDefinition.g:2043:2: rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__AttributeDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__5();

            state._fsp--;


            }

        }
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
    // InternalParameterDefinition.g:2050:1: rule__AttributeDefinition__Group__4__Impl : ( ( rule__AttributeDefinition__Group_4__0 )? ) ;
    public final void rule__AttributeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2054:1: ( ( ( rule__AttributeDefinition__Group_4__0 )? ) )
            // InternalParameterDefinition.g:2055:1: ( ( rule__AttributeDefinition__Group_4__0 )? )
            {
            // InternalParameterDefinition.g:2055:1: ( ( rule__AttributeDefinition__Group_4__0 )? )
            // InternalParameterDefinition.g:2056:2: ( rule__AttributeDefinition__Group_4__0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup_4()); 
            // InternalParameterDefinition.g:2057:2: ( rule__AttributeDefinition__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==43) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalParameterDefinition.g:2057:3: rule__AttributeDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AttributeDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeDefinitionAccess().getGroup_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__AttributeDefinition__Group__5"
    // InternalParameterDefinition.g:2065:1: rule__AttributeDefinition__Group__5 : rule__AttributeDefinition__Group__5__Impl ;
    public final void rule__AttributeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2069:1: ( rule__AttributeDefinition__Group__5__Impl )
            // InternalParameterDefinition.g:2070:2: rule__AttributeDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__5"


    // $ANTLR start "rule__AttributeDefinition__Group__5__Impl"
    // InternalParameterDefinition.g:2076:1: rule__AttributeDefinition__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__AttributeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2080:1: ( ( ( ';' )? ) )
            // InternalParameterDefinition.g:2081:1: ( ( ';' )? )
            {
            // InternalParameterDefinition.g:2081:1: ( ( ';' )? )
            // InternalParameterDefinition.g:2082:2: ( ';' )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5()); 
            // InternalParameterDefinition.g:2083:2: ( ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalParameterDefinition.g:2083:3: ';'
                    {
                    match(input,33,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group__5__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group_4__0"
    // InternalParameterDefinition.g:2092:1: rule__AttributeDefinition__Group_4__0 : rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1 ;
    public final void rule__AttributeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2096:1: ( rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1 )
            // InternalParameterDefinition.g:2097:2: rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__AttributeDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_4__0"


    // $ANTLR start "rule__AttributeDefinition__Group_4__0__Impl"
    // InternalParameterDefinition.g:2104:1: rule__AttributeDefinition__Group_4__0__Impl : ( '=' ) ;
    public final void rule__AttributeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2108:1: ( ( '=' ) )
            // InternalParameterDefinition.g:2109:1: ( '=' )
            {
            // InternalParameterDefinition.g:2109:1: ( '=' )
            // InternalParameterDefinition.g:2110:2: '='
            {
             before(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group_4__1"
    // InternalParameterDefinition.g:2119:1: rule__AttributeDefinition__Group_4__1 : rule__AttributeDefinition__Group_4__1__Impl ;
    public final void rule__AttributeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2123:1: ( rule__AttributeDefinition__Group_4__1__Impl )
            // InternalParameterDefinition.g:2124:2: rule__AttributeDefinition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_4__1"


    // $ANTLR start "rule__AttributeDefinition__Group_4__1__Impl"
    // InternalParameterDefinition.g:2130:1: rule__AttributeDefinition__Group_4__1__Impl : ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) ) ;
    public final void rule__AttributeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2134:1: ( ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) ) )
            // InternalParameterDefinition.g:2135:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) )
            {
            // InternalParameterDefinition.g:2135:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) )
            // InternalParameterDefinition.g:2136:2: ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_4_1()); 
            // InternalParameterDefinition.g:2137:2: ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 )
            // InternalParameterDefinition.g:2137:3: rule__AttributeDefinition__DefaultvalueAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__AttributeDefinition__DefaultvalueAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalParameterDefinition.g:2146:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2150:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalParameterDefinition.g:2151:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalParameterDefinition.g:2158:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2162:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:2163:1: ( RULE_ID )
            {
            // InternalParameterDefinition.g:2163:1: ( RULE_ID )
            // InternalParameterDefinition.g:2164:2: RULE_ID
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
    // InternalParameterDefinition.g:2173:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2177:1: ( rule__FQN__Group__1__Impl )
            // InternalParameterDefinition.g:2178:2: rule__FQN__Group__1__Impl
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
    // InternalParameterDefinition.g:2184:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2188:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalParameterDefinition.g:2189:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalParameterDefinition.g:2189:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalParameterDefinition.g:2190:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalParameterDefinition.g:2191:2: ( rule__FQN__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==44) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalParameterDefinition.g:2191:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // InternalParameterDefinition.g:2200:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2204:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalParameterDefinition.g:2205:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalParameterDefinition.g:2212:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2216:1: ( ( '.' ) )
            // InternalParameterDefinition.g:2217:1: ( '.' )
            {
            // InternalParameterDefinition.g:2217:1: ( '.' )
            // InternalParameterDefinition.g:2218:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalParameterDefinition.g:2227:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2231:1: ( rule__FQN__Group_1__1__Impl )
            // InternalParameterDefinition.g:2232:2: rule__FQN__Group_1__1__Impl
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
    // InternalParameterDefinition.g:2238:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2242:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:2243:1: ( RULE_ID )
            {
            // InternalParameterDefinition.g:2243:1: ( RULE_ID )
            // InternalParameterDefinition.g:2244:2: RULE_ID
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
    // InternalParameterDefinition.g:2254:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2258:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalParameterDefinition.g:2259:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalParameterDefinition.g:2266:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2270:1: ( ( ( '-' )? ) )
            // InternalParameterDefinition.g:2271:1: ( ( '-' )? )
            {
            // InternalParameterDefinition.g:2271:1: ( ( '-' )? )
            // InternalParameterDefinition.g:2272:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalParameterDefinition.g:2273:2: ( '-' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==45) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalParameterDefinition.g:2273:3: '-'
                    {
                    match(input,45,FOLLOW_2); 

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
    // InternalParameterDefinition.g:2281:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2285:1: ( rule__EInt__Group__1__Impl )
            // InternalParameterDefinition.g:2286:2: rule__EInt__Group__1__Impl
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
    // InternalParameterDefinition.g:2292:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2296:1: ( ( RULE_INT ) )
            // InternalParameterDefinition.g:2297:1: ( RULE_INT )
            {
            // InternalParameterDefinition.g:2297:1: ( RULE_INT )
            // InternalParameterDefinition.g:2298:2: RULE_INT
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
    // InternalParameterDefinition.g:2308:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2312:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalParameterDefinition.g:2313:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalParameterDefinition.g:2320:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2324:1: ( ( ( '-' )? ) )
            // InternalParameterDefinition.g:2325:1: ( ( '-' )? )
            {
            // InternalParameterDefinition.g:2325:1: ( ( '-' )? )
            // InternalParameterDefinition.g:2326:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalParameterDefinition.g:2327:2: ( '-' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalParameterDefinition.g:2327:3: '-'
                    {
                    match(input,45,FOLLOW_2); 

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
    // InternalParameterDefinition.g:2335:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2339:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalParameterDefinition.g:2340:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalParameterDefinition.g:2347:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2351:1: ( ( ( RULE_INT )? ) )
            // InternalParameterDefinition.g:2352:1: ( ( RULE_INT )? )
            {
            // InternalParameterDefinition.g:2352:1: ( ( RULE_INT )? )
            // InternalParameterDefinition.g:2353:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalParameterDefinition.g:2354:2: ( RULE_INT )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalParameterDefinition.g:2354:3: RULE_INT
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
    // InternalParameterDefinition.g:2362:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2366:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalParameterDefinition.g:2367:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_31);
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
    // InternalParameterDefinition.g:2374:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2378:1: ( ( '.' ) )
            // InternalParameterDefinition.g:2379:1: ( '.' )
            {
            // InternalParameterDefinition.g:2379:1: ( '.' )
            // InternalParameterDefinition.g:2380:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalParameterDefinition.g:2389:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2393:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalParameterDefinition.g:2394:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_32);
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
    // InternalParameterDefinition.g:2401:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2405:1: ( ( RULE_INT ) )
            // InternalParameterDefinition.g:2406:1: ( RULE_INT )
            {
            // InternalParameterDefinition.g:2406:1: ( RULE_INT )
            // InternalParameterDefinition.g:2407:2: RULE_INT
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
    // InternalParameterDefinition.g:2416:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2420:1: ( rule__EDouble__Group__4__Impl )
            // InternalParameterDefinition.g:2421:2: rule__EDouble__Group__4__Impl
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
    // InternalParameterDefinition.g:2427:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2431:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalParameterDefinition.g:2432:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalParameterDefinition.g:2432:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalParameterDefinition.g:2433:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalParameterDefinition.g:2434:2: ( rule__EDouble__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=16 && LA30_0<=17)) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalParameterDefinition.g:2434:3: rule__EDouble__Group_4__0
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
    // InternalParameterDefinition.g:2443:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2447:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalParameterDefinition.g:2448:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalParameterDefinition.g:2455:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2459:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalParameterDefinition.g:2460:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalParameterDefinition.g:2460:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalParameterDefinition.g:2461:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalParameterDefinition.g:2462:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalParameterDefinition.g:2462:3: rule__EDouble__Alternatives_4_0
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
    // InternalParameterDefinition.g:2470:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2474:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalParameterDefinition.g:2475:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalParameterDefinition.g:2482:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2486:1: ( ( ( '-' )? ) )
            // InternalParameterDefinition.g:2487:1: ( ( '-' )? )
            {
            // InternalParameterDefinition.g:2487:1: ( ( '-' )? )
            // InternalParameterDefinition.g:2488:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalParameterDefinition.g:2489:2: ( '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalParameterDefinition.g:2489:3: '-'
                    {
                    match(input,45,FOLLOW_2); 

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
    // InternalParameterDefinition.g:2497:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2501:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalParameterDefinition.g:2502:2: rule__EDouble__Group_4__2__Impl
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
    // InternalParameterDefinition.g:2508:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2512:1: ( ( RULE_INT ) )
            // InternalParameterDefinition.g:2513:1: ( RULE_INT )
            {
            // InternalParameterDefinition.g:2513:1: ( RULE_INT )
            // InternalParameterDefinition.g:2514:2: RULE_INT
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
    // InternalParameterDefinition.g:2524:1: rule__EnumerationElement__Group__0 : rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 ;
    public final void rule__EnumerationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2528:1: ( rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 )
            // InternalParameterDefinition.g:2529:2: rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalParameterDefinition.g:2536:1: rule__EnumerationElement__Group__0__Impl : ( ( rule__EnumerationElement__NameAssignment_0 ) ) ;
    public final void rule__EnumerationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2540:1: ( ( ( rule__EnumerationElement__NameAssignment_0 ) ) )
            // InternalParameterDefinition.g:2541:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            {
            // InternalParameterDefinition.g:2541:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            // InternalParameterDefinition.g:2542:2: ( rule__EnumerationElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 
            // InternalParameterDefinition.g:2543:2: ( rule__EnumerationElement__NameAssignment_0 )
            // InternalParameterDefinition.g:2543:3: rule__EnumerationElement__NameAssignment_0
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
    // InternalParameterDefinition.g:2551:1: rule__EnumerationElement__Group__1 : rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 ;
    public final void rule__EnumerationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2555:1: ( rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 )
            // InternalParameterDefinition.g:2556:2: rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalParameterDefinition.g:2563:1: rule__EnumerationElement__Group__1__Impl : ( ( rule__EnumerationElement__Group_1__0 )? ) ;
    public final void rule__EnumerationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2567:1: ( ( ( rule__EnumerationElement__Group_1__0 )? ) )
            // InternalParameterDefinition.g:2568:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            {
            // InternalParameterDefinition.g:2568:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            // InternalParameterDefinition.g:2569:2: ( rule__EnumerationElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup_1()); 
            // InternalParameterDefinition.g:2570:2: ( rule__EnumerationElement__Group_1__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalParameterDefinition.g:2570:3: rule__EnumerationElement__Group_1__0
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
    // InternalParameterDefinition.g:2578:1: rule__EnumerationElement__Group__2 : rule__EnumerationElement__Group__2__Impl ;
    public final void rule__EnumerationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2582:1: ( rule__EnumerationElement__Group__2__Impl )
            // InternalParameterDefinition.g:2583:2: rule__EnumerationElement__Group__2__Impl
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
    // InternalParameterDefinition.g:2589:1: rule__EnumerationElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__EnumerationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2593:1: ( ( ( ';' )? ) )
            // InternalParameterDefinition.g:2594:1: ( ( ';' )? )
            {
            // InternalParameterDefinition.g:2594:1: ( ( ';' )? )
            // InternalParameterDefinition.g:2595:2: ( ';' )?
            {
             before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 
            // InternalParameterDefinition.g:2596:2: ( ';' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==33) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalParameterDefinition.g:2596:3: ';'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalParameterDefinition.g:2605:1: rule__EnumerationElement__Group_1__0 : rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 ;
    public final void rule__EnumerationElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2609:1: ( rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 )
            // InternalParameterDefinition.g:2610:2: rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalParameterDefinition.g:2617:1: rule__EnumerationElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2621:1: ( ( '=' ) )
            // InternalParameterDefinition.g:2622:1: ( '=' )
            {
            // InternalParameterDefinition.g:2622:1: ( '=' )
            // InternalParameterDefinition.g:2623:2: '='
            {
             before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalParameterDefinition.g:2632:1: rule__EnumerationElement__Group_1__1 : rule__EnumerationElement__Group_1__1__Impl ;
    public final void rule__EnumerationElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2636:1: ( rule__EnumerationElement__Group_1__1__Impl )
            // InternalParameterDefinition.g:2637:2: rule__EnumerationElement__Group_1__1__Impl
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
    // InternalParameterDefinition.g:2643:1: rule__EnumerationElement__Group_1__1__Impl : ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2647:1: ( ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) )
            // InternalParameterDefinition.g:2648:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            {
            // InternalParameterDefinition.g:2648:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            // InternalParameterDefinition.g:2649:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 
            // InternalParameterDefinition.g:2650:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            // InternalParameterDefinition.g:2650:3: rule__EnumerationElement__ValueAssignment_1_1
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
    // InternalParameterDefinition.g:2659:1: rule__InlineEnumerationType__Group__0 : rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 ;
    public final void rule__InlineEnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2663:1: ( rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 )
            // InternalParameterDefinition.g:2664:2: rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalParameterDefinition.g:2671:1: rule__InlineEnumerationType__Group__0__Impl : ( 'InlineEnumeration' ) ;
    public final void rule__InlineEnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2675:1: ( ( 'InlineEnumeration' ) )
            // InternalParameterDefinition.g:2676:1: ( 'InlineEnumeration' )
            {
            // InternalParameterDefinition.g:2676:1: ( 'InlineEnumeration' )
            // InternalParameterDefinition.g:2677:2: 'InlineEnumeration'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalParameterDefinition.g:2686:1: rule__InlineEnumerationType__Group__1 : rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 ;
    public final void rule__InlineEnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2690:1: ( rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 )
            // InternalParameterDefinition.g:2691:2: rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2
            {
            pushFollow(FOLLOW_33);
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
    // InternalParameterDefinition.g:2698:1: rule__InlineEnumerationType__Group__1__Impl : ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) ;
    public final void rule__InlineEnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2702:1: ( ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) )
            // InternalParameterDefinition.g:2703:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            {
            // InternalParameterDefinition.g:2703:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            // InternalParameterDefinition.g:2704:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 
            // InternalParameterDefinition.g:2705:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==47) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalParameterDefinition.g:2705:3: rule__InlineEnumerationType__ArrayAssignment_1
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
    // InternalParameterDefinition.g:2713:1: rule__InlineEnumerationType__Group__2 : rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 ;
    public final void rule__InlineEnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2717:1: ( rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 )
            // InternalParameterDefinition.g:2718:2: rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3
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
    // InternalParameterDefinition.g:2725:1: rule__InlineEnumerationType__Group__2__Impl : ( '{' ) ;
    public final void rule__InlineEnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2729:1: ( ( '{' ) )
            // InternalParameterDefinition.g:2730:1: ( '{' )
            {
            // InternalParameterDefinition.g:2730:1: ( '{' )
            // InternalParameterDefinition.g:2731:2: '{'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalParameterDefinition.g:2740:1: rule__InlineEnumerationType__Group__3 : rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 ;
    public final void rule__InlineEnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2744:1: ( rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 )
            // InternalParameterDefinition.g:2745:2: rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4
            {
            pushFollow(FOLLOW_34);
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
    // InternalParameterDefinition.g:2752:1: rule__InlineEnumerationType__Group__3__Impl : ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) ;
    public final void rule__InlineEnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2756:1: ( ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) )
            // InternalParameterDefinition.g:2757:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            {
            // InternalParameterDefinition.g:2757:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            // InternalParameterDefinition.g:2758:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            {
            // InternalParameterDefinition.g:2758:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) )
            // InternalParameterDefinition.g:2759:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalParameterDefinition.g:2760:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            // InternalParameterDefinition.g:2760:4: rule__InlineEnumerationType__EnumsAssignment_3
            {
            pushFollow(FOLLOW_35);
            rule__InlineEnumerationType__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }

            // InternalParameterDefinition.g:2763:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            // InternalParameterDefinition.g:2764:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalParameterDefinition.g:2765:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalParameterDefinition.g:2765:4: rule__InlineEnumerationType__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__InlineEnumerationType__EnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalParameterDefinition.g:2774:1: rule__InlineEnumerationType__Group__4 : rule__InlineEnumerationType__Group__4__Impl ;
    public final void rule__InlineEnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2778:1: ( rule__InlineEnumerationType__Group__4__Impl )
            // InternalParameterDefinition.g:2779:2: rule__InlineEnumerationType__Group__4__Impl
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
    // InternalParameterDefinition.g:2785:1: rule__InlineEnumerationType__Group__4__Impl : ( '}' ) ;
    public final void rule__InlineEnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2789:1: ( ( '}' ) )
            // InternalParameterDefinition.g:2790:1: ( '}' )
            {
            // InternalParameterDefinition.g:2790:1: ( '}' )
            // InternalParameterDefinition.g:2791:2: '}'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalParameterDefinition.g:2801:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2805:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalParameterDefinition.g:2806:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalParameterDefinition.g:2813:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2817:1: ( ( () ) )
            // InternalParameterDefinition.g:2818:1: ( () )
            {
            // InternalParameterDefinition.g:2818:1: ( () )
            // InternalParameterDefinition.g:2819:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // InternalParameterDefinition.g:2820:2: ()
            // InternalParameterDefinition.g:2820:3: 
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
    // InternalParameterDefinition.g:2828:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2832:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalParameterDefinition.g:2833:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalParameterDefinition.g:2840:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2844:1: ( ( '[' ) )
            // InternalParameterDefinition.g:2845:1: ( '[' )
            {
            // InternalParameterDefinition.g:2845:1: ( '[' )
            // InternalParameterDefinition.g:2846:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,47,FOLLOW_2); 
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
    // InternalParameterDefinition.g:2855:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2859:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalParameterDefinition.g:2860:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalParameterDefinition.g:2867:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__LengthAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2871:1: ( ( ( rule__ArrayType__LengthAssignment_2 )? ) )
            // InternalParameterDefinition.g:2872:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            {
            // InternalParameterDefinition.g:2872:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            // InternalParameterDefinition.g:2873:2: ( rule__ArrayType__LengthAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 
            // InternalParameterDefinition.g:2874:2: ( rule__ArrayType__LengthAssignment_2 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_INT||LA36_0==18) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalParameterDefinition.g:2874:3: rule__ArrayType__LengthAssignment_2
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
    // InternalParameterDefinition.g:2882:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2886:1: ( rule__ArrayType__Group__3__Impl )
            // InternalParameterDefinition.g:2887:2: rule__ArrayType__Group__3__Impl
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
    // InternalParameterDefinition.g:2893:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2897:1: ( ( ']' ) )
            // InternalParameterDefinition.g:2898:1: ( ']' )
            {
            // InternalParameterDefinition.g:2898:1: ( ']' )
            // InternalParameterDefinition.g:2899:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalParameterDefinition.g:2909:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2913:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalParameterDefinition.g:2914:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalParameterDefinition.g:2921:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2925:1: ( ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) )
            // InternalParameterDefinition.g:2926:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            {
            // InternalParameterDefinition.g:2926:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            // InternalParameterDefinition.g:2927:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 
            // InternalParameterDefinition.g:2928:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            // InternalParameterDefinition.g:2928:3: rule__PrimitiveType__TypeNameAssignment_0
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
    // InternalParameterDefinition.g:2936:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2940:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalParameterDefinition.g:2941:2: rule__PrimitiveType__Group__1__Impl
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
    // InternalParameterDefinition.g:2947:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2951:1: ( ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) )
            // InternalParameterDefinition.g:2952:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            {
            // InternalParameterDefinition.g:2952:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            // InternalParameterDefinition.g:2953:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 
            // InternalParameterDefinition.g:2954:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==47) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalParameterDefinition.g:2954:3: rule__PrimitiveType__ArrayAssignment_1
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
    // InternalParameterDefinition.g:2963:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2967:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalParameterDefinition.g:2968:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalParameterDefinition.g:2975:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2979:1: ( ( '[' ) )
            // InternalParameterDefinition.g:2980:1: ( '[' )
            {
            // InternalParameterDefinition.g:2980:1: ( '[' )
            // InternalParameterDefinition.g:2981:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalParameterDefinition.g:2990:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:2994:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalParameterDefinition.g:2995:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalParameterDefinition.g:3002:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3006:1: ( ( ( rule__ArrayValue__ValuesAssignment_1 ) ) )
            // InternalParameterDefinition.g:3007:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            {
            // InternalParameterDefinition.g:3007:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            // InternalParameterDefinition.g:3008:2: ( rule__ArrayValue__ValuesAssignment_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 
            // InternalParameterDefinition.g:3009:2: ( rule__ArrayValue__ValuesAssignment_1 )
            // InternalParameterDefinition.g:3009:3: rule__ArrayValue__ValuesAssignment_1
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
    // InternalParameterDefinition.g:3017:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3021:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalParameterDefinition.g:3022:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_39);
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
    // InternalParameterDefinition.g:3029:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )* ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3033:1: ( ( ( rule__ArrayValue__Group_2__0 )* ) )
            // InternalParameterDefinition.g:3034:1: ( ( rule__ArrayValue__Group_2__0 )* )
            {
            // InternalParameterDefinition.g:3034:1: ( ( rule__ArrayValue__Group_2__0 )* )
            // InternalParameterDefinition.g:3035:2: ( rule__ArrayValue__Group_2__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalParameterDefinition.g:3036:2: ( rule__ArrayValue__Group_2__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==39) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalParameterDefinition.g:3036:3: rule__ArrayValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ArrayValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // InternalParameterDefinition.g:3044:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3048:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalParameterDefinition.g:3049:2: rule__ArrayValue__Group__3__Impl
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
    // InternalParameterDefinition.g:3055:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3059:1: ( ( ']' ) )
            // InternalParameterDefinition.g:3060:1: ( ']' )
            {
            // InternalParameterDefinition.g:3060:1: ( ']' )
            // InternalParameterDefinition.g:3061:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,48,FOLLOW_2); 
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
    // InternalParameterDefinition.g:3071:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3075:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalParameterDefinition.g:3076:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalParameterDefinition.g:3083:1: rule__ArrayValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3087:1: ( ( ',' ) )
            // InternalParameterDefinition.g:3088:1: ( ',' )
            {
            // InternalParameterDefinition.g:3088:1: ( ',' )
            // InternalParameterDefinition.g:3089:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalParameterDefinition.g:3098:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3102:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalParameterDefinition.g:3103:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalParameterDefinition.g:3109:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3113:1: ( ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) )
            // InternalParameterDefinition.g:3114:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            {
            // InternalParameterDefinition.g:3114:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            // InternalParameterDefinition.g:3115:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 
            // InternalParameterDefinition.g:3116:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            // InternalParameterDefinition.g:3116:3: rule__ArrayValue__ValuesAssignment_2_1
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
    // InternalParameterDefinition.g:3125:1: rule__SingleValue__Group_0__0 : rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 ;
    public final void rule__SingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3129:1: ( rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 )
            // InternalParameterDefinition.g:3130:2: rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalParameterDefinition.g:3137:1: rule__SingleValue__Group_0__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3141:1: ( ( () ) )
            // InternalParameterDefinition.g:3142:1: ( () )
            {
            // InternalParameterDefinition.g:3142:1: ( () )
            // InternalParameterDefinition.g:3143:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); 
            // InternalParameterDefinition.g:3144:2: ()
            // InternalParameterDefinition.g:3144:3: 
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
    // InternalParameterDefinition.g:3152:1: rule__SingleValue__Group_0__1 : rule__SingleValue__Group_0__1__Impl ;
    public final void rule__SingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3156:1: ( rule__SingleValue__Group_0__1__Impl )
            // InternalParameterDefinition.g:3157:2: rule__SingleValue__Group_0__1__Impl
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
    // InternalParameterDefinition.g:3163:1: rule__SingleValue__Group_0__1__Impl : ( ( rule__SingleValue__ValueAssignment_0_1 ) ) ;
    public final void rule__SingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3167:1: ( ( ( rule__SingleValue__ValueAssignment_0_1 ) ) )
            // InternalParameterDefinition.g:3168:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            {
            // InternalParameterDefinition.g:3168:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            // InternalParameterDefinition.g:3169:2: ( rule__SingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 
            // InternalParameterDefinition.g:3170:2: ( rule__SingleValue__ValueAssignment_0_1 )
            // InternalParameterDefinition.g:3170:3: rule__SingleValue__ValueAssignment_0_1
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
    // InternalParameterDefinition.g:3179:1: rule__SingleValue__Group_1__0 : rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 ;
    public final void rule__SingleValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3183:1: ( rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 )
            // InternalParameterDefinition.g:3184:2: rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalParameterDefinition.g:3191:1: rule__SingleValue__Group_1__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3195:1: ( ( () ) )
            // InternalParameterDefinition.g:3196:1: ( () )
            {
            // InternalParameterDefinition.g:3196:1: ( () )
            // InternalParameterDefinition.g:3197:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); 
            // InternalParameterDefinition.g:3198:2: ()
            // InternalParameterDefinition.g:3198:3: 
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
    // InternalParameterDefinition.g:3206:1: rule__SingleValue__Group_1__1 : rule__SingleValue__Group_1__1__Impl ;
    public final void rule__SingleValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3210:1: ( rule__SingleValue__Group_1__1__Impl )
            // InternalParameterDefinition.g:3211:2: rule__SingleValue__Group_1__1__Impl
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
    // InternalParameterDefinition.g:3217:1: rule__SingleValue__Group_1__1__Impl : ( ( rule__SingleValue__ValueAssignment_1_1 ) ) ;
    public final void rule__SingleValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3221:1: ( ( ( rule__SingleValue__ValueAssignment_1_1 ) ) )
            // InternalParameterDefinition.g:3222:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            {
            // InternalParameterDefinition.g:3222:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            // InternalParameterDefinition.g:3223:2: ( rule__SingleValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); 
            // InternalParameterDefinition.g:3224:2: ( rule__SingleValue__ValueAssignment_1_1 )
            // InternalParameterDefinition.g:3224:3: rule__SingleValue__ValueAssignment_1_1
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
    // InternalParameterDefinition.g:3233:1: rule__SingleValue__Group_2__0 : rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 ;
    public final void rule__SingleValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3237:1: ( rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 )
            // InternalParameterDefinition.g:3238:2: rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalParameterDefinition.g:3245:1: rule__SingleValue__Group_2__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3249:1: ( ( () ) )
            // InternalParameterDefinition.g:3250:1: ( () )
            {
            // InternalParameterDefinition.g:3250:1: ( () )
            // InternalParameterDefinition.g:3251:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); 
            // InternalParameterDefinition.g:3252:2: ()
            // InternalParameterDefinition.g:3252:3: 
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
    // InternalParameterDefinition.g:3260:1: rule__SingleValue__Group_2__1 : rule__SingleValue__Group_2__1__Impl ;
    public final void rule__SingleValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3264:1: ( rule__SingleValue__Group_2__1__Impl )
            // InternalParameterDefinition.g:3265:2: rule__SingleValue__Group_2__1__Impl
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
    // InternalParameterDefinition.g:3271:1: rule__SingleValue__Group_2__1__Impl : ( ( rule__SingleValue__ValueAssignment_2_1 ) ) ;
    public final void rule__SingleValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3275:1: ( ( ( rule__SingleValue__ValueAssignment_2_1 ) ) )
            // InternalParameterDefinition.g:3276:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            {
            // InternalParameterDefinition.g:3276:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            // InternalParameterDefinition.g:3277:2: ( rule__SingleValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); 
            // InternalParameterDefinition.g:3278:2: ( rule__SingleValue__ValueAssignment_2_1 )
            // InternalParameterDefinition.g:3278:3: rule__SingleValue__ValueAssignment_2_1
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
    // InternalParameterDefinition.g:3287:1: rule__SingleValue__Group_3__0 : rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 ;
    public final void rule__SingleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3291:1: ( rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 )
            // InternalParameterDefinition.g:3292:2: rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalParameterDefinition.g:3299:1: rule__SingleValue__Group_3__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3303:1: ( ( () ) )
            // InternalParameterDefinition.g:3304:1: ( () )
            {
            // InternalParameterDefinition.g:3304:1: ( () )
            // InternalParameterDefinition.g:3305:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); 
            // InternalParameterDefinition.g:3306:2: ()
            // InternalParameterDefinition.g:3306:3: 
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
    // InternalParameterDefinition.g:3314:1: rule__SingleValue__Group_3__1 : rule__SingleValue__Group_3__1__Impl ;
    public final void rule__SingleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3318:1: ( rule__SingleValue__Group_3__1__Impl )
            // InternalParameterDefinition.g:3319:2: rule__SingleValue__Group_3__1__Impl
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
    // InternalParameterDefinition.g:3325:1: rule__SingleValue__Group_3__1__Impl : ( ( rule__SingleValue__ValueAssignment_3_1 ) ) ;
    public final void rule__SingleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3329:1: ( ( ( rule__SingleValue__ValueAssignment_3_1 ) ) )
            // InternalParameterDefinition.g:3330:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            {
            // InternalParameterDefinition.g:3330:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            // InternalParameterDefinition.g:3331:2: ( rule__SingleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); 
            // InternalParameterDefinition.g:3332:2: ( rule__SingleValue__ValueAssignment_3_1 )
            // InternalParameterDefinition.g:3332:3: rule__SingleValue__ValueAssignment_3_1
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
    // InternalParameterDefinition.g:3341:1: rule__SingleValue__Group_4__0 : rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 ;
    public final void rule__SingleValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3345:1: ( rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 )
            // InternalParameterDefinition.g:3346:2: rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalParameterDefinition.g:3353:1: rule__SingleValue__Group_4__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3357:1: ( ( () ) )
            // InternalParameterDefinition.g:3358:1: ( () )
            {
            // InternalParameterDefinition.g:3358:1: ( () )
            // InternalParameterDefinition.g:3359:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); 
            // InternalParameterDefinition.g:3360:2: ()
            // InternalParameterDefinition.g:3360:3: 
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
    // InternalParameterDefinition.g:3368:1: rule__SingleValue__Group_4__1 : rule__SingleValue__Group_4__1__Impl ;
    public final void rule__SingleValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3372:1: ( rule__SingleValue__Group_4__1__Impl )
            // InternalParameterDefinition.g:3373:2: rule__SingleValue__Group_4__1__Impl
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
    // InternalParameterDefinition.g:3379:1: rule__SingleValue__Group_4__1__Impl : ( ( rule__SingleValue__ValueAssignment_4_1 ) ) ;
    public final void rule__SingleValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3383:1: ( ( ( rule__SingleValue__ValueAssignment_4_1 ) ) )
            // InternalParameterDefinition.g:3384:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            {
            // InternalParameterDefinition.g:3384:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            // InternalParameterDefinition.g:3385:2: ( rule__SingleValue__ValueAssignment_4_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); 
            // InternalParameterDefinition.g:3386:2: ( rule__SingleValue__ValueAssignment_4_1 )
            // InternalParameterDefinition.g:3386:3: rule__SingleValue__ValueAssignment_4_1
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
    // InternalParameterDefinition.g:3395:1: rule__ParamDefModel__ImportsAssignment_1 : ( ruleParamDefRepoImport ) ;
    public final void rule__ParamDefModel__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3399:1: ( ( ruleParamDefRepoImport ) )
            // InternalParameterDefinition.g:3400:2: ( ruleParamDefRepoImport )
            {
            // InternalParameterDefinition.g:3400:2: ( ruleParamDefRepoImport )
            // InternalParameterDefinition.g:3401:3: ruleParamDefRepoImport
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
    // InternalParameterDefinition.g:3410:1: rule__ParamDefModel__RepositoryAssignment_2 : ( ruleParameterSetRepository ) ;
    public final void rule__ParamDefModel__RepositoryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3414:1: ( ( ruleParameterSetRepository ) )
            // InternalParameterDefinition.g:3415:2: ( ruleParameterSetRepository )
            {
            // InternalParameterDefinition.g:3415:2: ( ruleParameterSetRepository )
            // InternalParameterDefinition.g:3416:3: ruleParameterSetRepository
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
    // InternalParameterDefinition.g:3425:1: rule__ParamDefRepoImport__ImportedNamespaceAssignment_1 : ( ruleFQNW ) ;
    public final void rule__ParamDefRepoImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3429:1: ( ( ruleFQNW ) )
            // InternalParameterDefinition.g:3430:2: ( ruleFQNW )
            {
            // InternalParameterDefinition.g:3430:2: ( ruleFQNW )
            // InternalParameterDefinition.g:3431:3: ruleFQNW
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


    // $ANTLR start "rule__ParameterSetRepository__DocumentationAssignment_0"
    // InternalParameterDefinition.g:3440:1: rule__ParameterSetRepository__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__ParameterSetRepository__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3444:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalParameterDefinition.g:3445:2: ( RULE_DOCU_COMMENT )
            {
            // InternalParameterDefinition.g:3445:2: ( RULE_DOCU_COMMENT )
            // InternalParameterDefinition.g:3446:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getParameterSetRepositoryAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__DocumentationAssignment_0"


    // $ANTLR start "rule__ParameterSetRepository__NameAssignment_2"
    // InternalParameterDefinition.g:3455:1: rule__ParameterSetRepository__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterSetRepository__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3459:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3460:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3460:2: ( RULE_ID )
            // InternalParameterDefinition.g:3461:3: RULE_ID
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterSetRepositoryAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__NameAssignment_2"


    // $ANTLR start "rule__ParameterSetRepository__SetsAssignment_4"
    // InternalParameterDefinition.g:3470:1: rule__ParameterSetRepository__SetsAssignment_4 : ( ruleParameterSetDefinition ) ;
    public final void rule__ParameterSetRepository__SetsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3474:1: ( ( ruleParameterSetDefinition ) )
            // InternalParameterDefinition.g:3475:2: ( ruleParameterSetDefinition )
            {
            // InternalParameterDefinition.g:3475:2: ( ruleParameterSetDefinition )
            // InternalParameterDefinition.g:3476:3: ruleParameterSetDefinition
            {
             before(grammarAccess.getParameterSetRepositoryAccess().getSetsParameterSetDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterSetDefinition();

            state._fsp--;

             after(grammarAccess.getParameterSetRepositoryAccess().getSetsParameterSetDefinitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetRepository__SetsAssignment_4"


    // $ANTLR start "rule__ParameterSetDefinition__DocumentationAssignment_0"
    // InternalParameterDefinition.g:3485:1: rule__ParameterSetDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__ParameterSetDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3489:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalParameterDefinition.g:3490:2: ( RULE_DOCU_COMMENT )
            {
            // InternalParameterDefinition.g:3490:2: ( RULE_DOCU_COMMENT )
            // InternalParameterDefinition.g:3491:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__DocumentationAssignment_0"


    // $ANTLR start "rule__ParameterSetDefinition__NameAssignment_2"
    // InternalParameterDefinition.g:3500:1: rule__ParameterSetDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterSetDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3504:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3505:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3505:2: ( RULE_ID )
            // InternalParameterDefinition.g:3506:3: RULE_ID
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterSetDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__NameAssignment_2"


    // $ANTLR start "rule__ParameterSetDefinition__ExtendsAssignment_3_1"
    // InternalParameterDefinition.g:3515:1: rule__ParameterSetDefinition__ExtendsAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterSetDefinition__ExtendsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3519:1: ( ( ( ruleFQN ) ) )
            // InternalParameterDefinition.g:3520:2: ( ( ruleFQN ) )
            {
            // InternalParameterDefinition.g:3520:2: ( ( ruleFQN ) )
            // InternalParameterDefinition.g:3521:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_3_1_0()); 
            // InternalParameterDefinition.g:3522:3: ( ruleFQN )
            // InternalParameterDefinition.g:3523:4: ruleFQN
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__ExtendsAssignment_3_1"


    // $ANTLR start "rule__ParameterSetDefinition__ExtendsAssignment_3_2_1"
    // InternalParameterDefinition.g:3534:1: rule__ParameterSetDefinition__ExtendsAssignment_3_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterSetDefinition__ExtendsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3538:1: ( ( ( ruleFQN ) ) )
            // InternalParameterDefinition.g:3539:2: ( ( ruleFQN ) )
            {
            // InternalParameterDefinition.g:3539:2: ( ( ruleFQN ) )
            // InternalParameterDefinition.g:3540:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_3_2_1_0()); 
            // InternalParameterDefinition.g:3541:3: ( ruleFQN )
            // InternalParameterDefinition.g:3542:4: ruleFQN
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_3_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionFQNParserRuleCall_3_2_1_0_1()); 

            }

             after(grammarAccess.getParameterSetDefinitionAccess().getExtendsParameterSetDefinitionCrossReference_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__ExtendsAssignment_3_2_1"


    // $ANTLR start "rule__ParameterSetDefinition__ParametersAssignment_5"
    // InternalParameterDefinition.g:3553:1: rule__ParameterSetDefinition__ParametersAssignment_5 : ( ruleAbstractParameter ) ;
    public final void rule__ParameterSetDefinition__ParametersAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3557:1: ( ( ruleAbstractParameter ) )
            // InternalParameterDefinition.g:3558:2: ( ruleAbstractParameter )
            {
            // InternalParameterDefinition.g:3558:2: ( ruleAbstractParameter )
            // InternalParameterDefinition.g:3559:3: ruleAbstractParameter
            {
             before(grammarAccess.getParameterSetDefinitionAccess().getParametersAbstractParameterParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractParameter();

            state._fsp--;

             after(grammarAccess.getParameterSetDefinitionAccess().getParametersAbstractParameterParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterSetDefinition__ParametersAssignment_5"


    // $ANTLR start "rule__ParameterDefinition__DocumentationAssignment_0"
    // InternalParameterDefinition.g:3568:1: rule__ParameterDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__ParameterDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3572:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalParameterDefinition.g:3573:2: ( RULE_DOCU_COMMENT )
            {
            // InternalParameterDefinition.g:3573:2: ( RULE_DOCU_COMMENT )
            // InternalParameterDefinition.g:3574:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getParameterDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getParameterDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__DocumentationAssignment_0"


    // $ANTLR start "rule__ParameterDefinition__NameAssignment_2"
    // InternalParameterDefinition.g:3583:1: rule__ParameterDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ParameterDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3587:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3588:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3588:2: ( RULE_ID )
            // InternalParameterDefinition.g:3589:3: RULE_ID
            {
             before(grammarAccess.getParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getParameterDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__NameAssignment_2"


    // $ANTLR start "rule__ParameterDefinition__AttributesAssignment_4"
    // InternalParameterDefinition.g:3598:1: rule__ParameterDefinition__AttributesAssignment_4 : ( ruleAttributeDefinition ) ;
    public final void rule__ParameterDefinition__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3602:1: ( ( ruleAttributeDefinition ) )
            // InternalParameterDefinition.g:3603:2: ( ruleAttributeDefinition )
            {
            // InternalParameterDefinition.g:3603:2: ( ruleAttributeDefinition )
            // InternalParameterDefinition.g:3604:3: ruleAttributeDefinition
            {
             before(grammarAccess.getParameterDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getParameterDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDefinition__AttributesAssignment_4"


    // $ANTLR start "rule__TriggerDefinition__DocumentationAssignment_0"
    // InternalParameterDefinition.g:3613:1: rule__TriggerDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__TriggerDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3617:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalParameterDefinition.g:3618:2: ( RULE_DOCU_COMMENT )
            {
            // InternalParameterDefinition.g:3618:2: ( RULE_DOCU_COMMENT )
            // InternalParameterDefinition.g:3619:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getTriggerDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getTriggerDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__DocumentationAssignment_0"


    // $ANTLR start "rule__TriggerDefinition__NameAssignment_2"
    // InternalParameterDefinition.g:3628:1: rule__TriggerDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TriggerDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3632:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3633:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3633:2: ( RULE_ID )
            // InternalParameterDefinition.g:3634:3: RULE_ID
            {
             before(grammarAccess.getTriggerDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTriggerDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__NameAssignment_2"


    // $ANTLR start "rule__TriggerDefinition__AttributesAssignment_4"
    // InternalParameterDefinition.g:3643:1: rule__TriggerDefinition__AttributesAssignment_4 : ( ruleAttributeDefinition ) ;
    public final void rule__TriggerDefinition__AttributesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3647:1: ( ( ruleAttributeDefinition ) )
            // InternalParameterDefinition.g:3648:2: ( ruleAttributeDefinition )
            {
            // InternalParameterDefinition.g:3648:2: ( ruleAttributeDefinition )
            // InternalParameterDefinition.g:3649:3: ruleAttributeDefinition
            {
             before(grammarAccess.getTriggerDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getTriggerDefinitionAccess().getAttributesAttributeDefinitionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerDefinition__AttributesAssignment_4"


    // $ANTLR start "rule__AttributeDefinition__DocumentationAssignment_0"
    // InternalParameterDefinition.g:3658:1: rule__AttributeDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__AttributeDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3662:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalParameterDefinition.g:3663:2: ( RULE_DOCU_COMMENT )
            {
            // InternalParameterDefinition.g:3663:2: ( RULE_DOCU_COMMENT )
            // InternalParameterDefinition.g:3664:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__DocumentationAssignment_0"


    // $ANTLR start "rule__AttributeDefinition__NameAssignment_1"
    // InternalParameterDefinition.g:3673:1: rule__AttributeDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3677:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3678:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3678:2: ( RULE_ID )
            // InternalParameterDefinition.g:3679:3: RULE_ID
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAttributeDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__NameAssignment_1"


    // $ANTLR start "rule__AttributeDefinition__TypeAssignment_3"
    // InternalParameterDefinition.g:3688:1: rule__AttributeDefinition__TypeAssignment_3 : ( ruleAbstractAttributeType ) ;
    public final void rule__AttributeDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3692:1: ( ( ruleAbstractAttributeType ) )
            // InternalParameterDefinition.g:3693:2: ( ruleAbstractAttributeType )
            {
            // InternalParameterDefinition.g:3693:2: ( ruleAbstractAttributeType )
            // InternalParameterDefinition.g:3694:3: ruleAbstractAttributeType
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionAccess().getTypeAbstractAttributeTypeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__TypeAssignment_3"


    // $ANTLR start "rule__AttributeDefinition__DefaultvalueAssignment_4_1"
    // InternalParameterDefinition.g:3703:1: rule__AttributeDefinition__DefaultvalueAssignment_4_1 : ( ruleAbstractValue ) ;
    public final void rule__AttributeDefinition__DefaultvalueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3707:1: ( ( ruleAbstractValue ) )
            // InternalParameterDefinition.g:3708:2: ( ruleAbstractValue )
            {
            // InternalParameterDefinition.g:3708:2: ( ruleAbstractValue )
            // InternalParameterDefinition.g:3709:3: ruleAbstractValue
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractValue();

            state._fsp--;

             after(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAbstractValueParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeDefinition__DefaultvalueAssignment_4_1"


    // $ANTLR start "rule__EnumerationElement__NameAssignment_0"
    // InternalParameterDefinition.g:3718:1: rule__EnumerationElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3722:1: ( ( RULE_ID ) )
            // InternalParameterDefinition.g:3723:2: ( RULE_ID )
            {
            // InternalParameterDefinition.g:3723:2: ( RULE_ID )
            // InternalParameterDefinition.g:3724:3: RULE_ID
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
    // InternalParameterDefinition.g:3733:1: rule__EnumerationElement__ValueAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3737:1: ( ( ruleEInt ) )
            // InternalParameterDefinition.g:3738:2: ( ruleEInt )
            {
            // InternalParameterDefinition.g:3738:2: ( ruleEInt )
            // InternalParameterDefinition.g:3739:3: ruleEInt
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
    // InternalParameterDefinition.g:3748:1: rule__InlineEnumerationType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__InlineEnumerationType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3752:1: ( ( ruleArrayType ) )
            // InternalParameterDefinition.g:3753:2: ( ruleArrayType )
            {
            // InternalParameterDefinition.g:3753:2: ( ruleArrayType )
            // InternalParameterDefinition.g:3754:3: ruleArrayType
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
    // InternalParameterDefinition.g:3763:1: rule__InlineEnumerationType__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__InlineEnumerationType__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3767:1: ( ( ruleEnumerationElement ) )
            // InternalParameterDefinition.g:3768:2: ( ruleEnumerationElement )
            {
            // InternalParameterDefinition.g:3768:2: ( ruleEnumerationElement )
            // InternalParameterDefinition.g:3769:3: ruleEnumerationElement
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
    // InternalParameterDefinition.g:3778:1: rule__ArrayType__LengthAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ArrayType__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3782:1: ( ( ruleCardinality ) )
            // InternalParameterDefinition.g:3783:2: ( ruleCardinality )
            {
            // InternalParameterDefinition.g:3783:2: ( ruleCardinality )
            // InternalParameterDefinition.g:3784:3: ruleCardinality
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
    // InternalParameterDefinition.g:3793:1: rule__PrimitiveType__TypeNameAssignment_0 : ( rulePRIMITIVE_TYPE_NAME ) ;
    public final void rule__PrimitiveType__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3797:1: ( ( rulePRIMITIVE_TYPE_NAME ) )
            // InternalParameterDefinition.g:3798:2: ( rulePRIMITIVE_TYPE_NAME )
            {
            // InternalParameterDefinition.g:3798:2: ( rulePRIMITIVE_TYPE_NAME )
            // InternalParameterDefinition.g:3799:3: rulePRIMITIVE_TYPE_NAME
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
    // InternalParameterDefinition.g:3808:1: rule__PrimitiveType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__PrimitiveType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3812:1: ( ( ruleArrayType ) )
            // InternalParameterDefinition.g:3813:2: ( ruleArrayType )
            {
            // InternalParameterDefinition.g:3813:2: ( ruleArrayType )
            // InternalParameterDefinition.g:3814:3: ruleArrayType
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
    // InternalParameterDefinition.g:3823:1: rule__ArrayValue__ValuesAssignment_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3827:1: ( ( ruleSingleValue ) )
            // InternalParameterDefinition.g:3828:2: ( ruleSingleValue )
            {
            // InternalParameterDefinition.g:3828:2: ( ruleSingleValue )
            // InternalParameterDefinition.g:3829:3: ruleSingleValue
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
    // InternalParameterDefinition.g:3838:1: rule__ArrayValue__ValuesAssignment_2_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3842:1: ( ( ruleSingleValue ) )
            // InternalParameterDefinition.g:3843:2: ( ruleSingleValue )
            {
            // InternalParameterDefinition.g:3843:2: ( ruleSingleValue )
            // InternalParameterDefinition.g:3844:3: ruleSingleValue
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
    // InternalParameterDefinition.g:3853:1: rule__SingleValue__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__SingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3857:1: ( ( ruleEInt ) )
            // InternalParameterDefinition.g:3858:2: ( ruleEInt )
            {
            // InternalParameterDefinition.g:3858:2: ( ruleEInt )
            // InternalParameterDefinition.g:3859:3: ruleEInt
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
    // InternalParameterDefinition.g:3868:1: rule__SingleValue__ValueAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__SingleValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3872:1: ( ( ruleEDouble ) )
            // InternalParameterDefinition.g:3873:2: ( ruleEDouble )
            {
            // InternalParameterDefinition.g:3873:2: ( ruleEDouble )
            // InternalParameterDefinition.g:3874:3: ruleEDouble
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
    // InternalParameterDefinition.g:3883:1: rule__SingleValue__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__SingleValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3887:1: ( ( ruleEString ) )
            // InternalParameterDefinition.g:3888:2: ( ruleEString )
            {
            // InternalParameterDefinition.g:3888:2: ( ruleEString )
            // InternalParameterDefinition.g:3889:3: ruleEString
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
    // InternalParameterDefinition.g:3898:1: rule__SingleValue__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__SingleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3902:1: ( ( ruleEBoolean ) )
            // InternalParameterDefinition.g:3903:2: ( ruleEBoolean )
            {
            // InternalParameterDefinition.g:3903:2: ( ruleEBoolean )
            // InternalParameterDefinition.g:3904:3: ruleEBoolean
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
    // InternalParameterDefinition.g:3913:1: rule__SingleValue__ValueAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__SingleValue__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalParameterDefinition.g:3917:1: ( ( ( ruleFQN ) ) )
            // InternalParameterDefinition.g:3918:2: ( ( ruleFQN ) )
            {
            // InternalParameterDefinition.g:3918:2: ( ( ruleFQN ) )
            // InternalParameterDefinition.g:3919:3: ( ruleFQN )
            {
             before(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 
            // InternalParameterDefinition.g:3920:3: ( ruleFQN )
            // InternalParameterDefinition.g:3921:4: ruleFQN
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000500000080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000400000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000003000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000002000000082L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000031000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000030000000082L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000010000000C0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000030000000080L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000040007FF80000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000080200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000B0000000C070L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000300000000020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000800800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000040020L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000030000000C070L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x000000000000C000L});

}