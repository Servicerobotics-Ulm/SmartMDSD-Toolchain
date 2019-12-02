package org.xtext.service.skillDefinition.ide.contentassist.antlr.internal;

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
import org.xtext.service.skillDefinition.services.SkillDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSkillDefinitionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOCU_COMMENT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'*'", "'ERROR'", "'SUCCESS'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'", "'SkillDefinitionRepository'", "'{'", "'}'", "'CoordinationModuleDefinition'", "'SkillDefinition'", "'results'", "'in'", "'out'", "'value'", "'='", "';'", "':'", "'.'", "'-'", "'InlineEnumeration'", "'['", "']'", "','"
    };
    public static final int T__50=50;
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
    public static final int T__49=49;
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


        public InternalSkillDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSkillDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSkillDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSkillDefinition.g"; }


    	private SkillDefinitionGrammarAccess grammarAccess;

    	public void setGrammarAccess(SkillDefinitionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSkillDefinitionModel"
    // InternalSkillDefinition.g:68:1: entryRuleSkillDefinitionModel : ruleSkillDefinitionModel EOF ;
    public final void entryRuleSkillDefinitionModel() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:69:1: ( ruleSkillDefinitionModel EOF )
            // InternalSkillDefinition.g:70:1: ruleSkillDefinitionModel EOF
            {
             before(grammarAccess.getSkillDefinitionModelRule()); 
            pushFollow(FOLLOW_1);
            ruleSkillDefinitionModel();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionModelRule()); 
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
    // $ANTLR end "entryRuleSkillDefinitionModel"


    // $ANTLR start "ruleSkillDefinitionModel"
    // InternalSkillDefinition.g:77:1: ruleSkillDefinitionModel : ( ( rule__SkillDefinitionModel__Group__0 ) ) ;
    public final void ruleSkillDefinitionModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:81:2: ( ( ( rule__SkillDefinitionModel__Group__0 ) ) )
            // InternalSkillDefinition.g:82:2: ( ( rule__SkillDefinitionModel__Group__0 ) )
            {
            // InternalSkillDefinition.g:82:2: ( ( rule__SkillDefinitionModel__Group__0 ) )
            // InternalSkillDefinition.g:83:3: ( rule__SkillDefinitionModel__Group__0 )
            {
             before(grammarAccess.getSkillDefinitionModelAccess().getGroup()); 
            // InternalSkillDefinition.g:84:3: ( rule__SkillDefinitionModel__Group__0 )
            // InternalSkillDefinition.g:84:4: rule__SkillDefinitionModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinitionModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkillDefinitionModel"


    // $ANTLR start "entryRuleSkillDefinitionRepository"
    // InternalSkillDefinition.g:93:1: entryRuleSkillDefinitionRepository : ruleSkillDefinitionRepository EOF ;
    public final void entryRuleSkillDefinitionRepository() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:94:1: ( ruleSkillDefinitionRepository EOF )
            // InternalSkillDefinition.g:95:1: ruleSkillDefinitionRepository EOF
            {
             before(grammarAccess.getSkillDefinitionRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleSkillDefinitionRepository();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionRepositoryRule()); 
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
    // $ANTLR end "entryRuleSkillDefinitionRepository"


    // $ANTLR start "ruleSkillDefinitionRepository"
    // InternalSkillDefinition.g:102:1: ruleSkillDefinitionRepository : ( ( rule__SkillDefinitionRepository__Group__0 ) ) ;
    public final void ruleSkillDefinitionRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:106:2: ( ( ( rule__SkillDefinitionRepository__Group__0 ) ) )
            // InternalSkillDefinition.g:107:2: ( ( rule__SkillDefinitionRepository__Group__0 ) )
            {
            // InternalSkillDefinition.g:107:2: ( ( rule__SkillDefinitionRepository__Group__0 ) )
            // InternalSkillDefinition.g:108:3: ( rule__SkillDefinitionRepository__Group__0 )
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getGroup()); 
            // InternalSkillDefinition.g:109:3: ( rule__SkillDefinitionRepository__Group__0 )
            // InternalSkillDefinition.g:109:4: rule__SkillDefinitionRepository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinitionRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkillDefinitionRepository"


    // $ANTLR start "entryRuleCoordinationModuleDefinition"
    // InternalSkillDefinition.g:118:1: entryRuleCoordinationModuleDefinition : ruleCoordinationModuleDefinition EOF ;
    public final void entryRuleCoordinationModuleDefinition() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:119:1: ( ruleCoordinationModuleDefinition EOF )
            // InternalSkillDefinition.g:120:1: ruleCoordinationModuleDefinition EOF
            {
             before(grammarAccess.getCoordinationModuleDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinationModuleDefinition();

            state._fsp--;

             after(grammarAccess.getCoordinationModuleDefinitionRule()); 
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
    // $ANTLR end "entryRuleCoordinationModuleDefinition"


    // $ANTLR start "ruleCoordinationModuleDefinition"
    // InternalSkillDefinition.g:127:1: ruleCoordinationModuleDefinition : ( ( rule__CoordinationModuleDefinition__Group__0 ) ) ;
    public final void ruleCoordinationModuleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:131:2: ( ( ( rule__CoordinationModuleDefinition__Group__0 ) ) )
            // InternalSkillDefinition.g:132:2: ( ( rule__CoordinationModuleDefinition__Group__0 ) )
            {
            // InternalSkillDefinition.g:132:2: ( ( rule__CoordinationModuleDefinition__Group__0 ) )
            // InternalSkillDefinition.g:133:3: ( rule__CoordinationModuleDefinition__Group__0 )
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getGroup()); 
            // InternalSkillDefinition.g:134:3: ( rule__CoordinationModuleDefinition__Group__0 )
            // InternalSkillDefinition.g:134:4: rule__CoordinationModuleDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationModuleDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationModuleDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinationModuleDefinition"


    // $ANTLR start "entryRuleSkillDefinition"
    // InternalSkillDefinition.g:143:1: entryRuleSkillDefinition : ruleSkillDefinition EOF ;
    public final void entryRuleSkillDefinition() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:144:1: ( ruleSkillDefinition EOF )
            // InternalSkillDefinition.g:145:1: ruleSkillDefinition EOF
            {
             before(grammarAccess.getSkillDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleSkillDefinition();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionRule()); 
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
    // $ANTLR end "entryRuleSkillDefinition"


    // $ANTLR start "ruleSkillDefinition"
    // InternalSkillDefinition.g:152:1: ruleSkillDefinition : ( ( rule__SkillDefinition__Group__0 ) ) ;
    public final void ruleSkillDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:156:2: ( ( ( rule__SkillDefinition__Group__0 ) ) )
            // InternalSkillDefinition.g:157:2: ( ( rule__SkillDefinition__Group__0 ) )
            {
            // InternalSkillDefinition.g:157:2: ( ( rule__SkillDefinition__Group__0 ) )
            // InternalSkillDefinition.g:158:3: ( rule__SkillDefinition__Group__0 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup()); 
            // InternalSkillDefinition.g:159:3: ( rule__SkillDefinition__Group__0 )
            // InternalSkillDefinition.g:159:4: rule__SkillDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkillDefinition"


    // $ANTLR start "entryRuleSkillResult"
    // InternalSkillDefinition.g:168:1: entryRuleSkillResult : ruleSkillResult EOF ;
    public final void entryRuleSkillResult() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:169:1: ( ruleSkillResult EOF )
            // InternalSkillDefinition.g:170:1: ruleSkillResult EOF
            {
             before(grammarAccess.getSkillResultRule()); 
            pushFollow(FOLLOW_1);
            ruleSkillResult();

            state._fsp--;

             after(grammarAccess.getSkillResultRule()); 
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
    // $ANTLR end "entryRuleSkillResult"


    // $ANTLR start "ruleSkillResult"
    // InternalSkillDefinition.g:177:1: ruleSkillResult : ( ( rule__SkillResult__Group__0 ) ) ;
    public final void ruleSkillResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:181:2: ( ( ( rule__SkillResult__Group__0 ) ) )
            // InternalSkillDefinition.g:182:2: ( ( rule__SkillResult__Group__0 ) )
            {
            // InternalSkillDefinition.g:182:2: ( ( rule__SkillResult__Group__0 ) )
            // InternalSkillDefinition.g:183:3: ( rule__SkillResult__Group__0 )
            {
             before(grammarAccess.getSkillResultAccess().getGroup()); 
            // InternalSkillDefinition.g:184:3: ( rule__SkillResult__Group__0 )
            // InternalSkillDefinition.g:184:4: rule__SkillResult__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SkillResult__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkillResultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkillResult"


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalSkillDefinition.g:193:1: entryRuleAttributeDefinition : ruleAttributeDefinition EOF ;
    public final void entryRuleAttributeDefinition() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:194:1: ( ruleAttributeDefinition EOF )
            // InternalSkillDefinition.g:195:1: ruleAttributeDefinition EOF
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
    // InternalSkillDefinition.g:202:1: ruleAttributeDefinition : ( ( rule__AttributeDefinition__Group__0 ) ) ;
    public final void ruleAttributeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:206:2: ( ( ( rule__AttributeDefinition__Group__0 ) ) )
            // InternalSkillDefinition.g:207:2: ( ( rule__AttributeDefinition__Group__0 ) )
            {
            // InternalSkillDefinition.g:207:2: ( ( rule__AttributeDefinition__Group__0 ) )
            // InternalSkillDefinition.g:208:3: ( rule__AttributeDefinition__Group__0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            // InternalSkillDefinition.g:209:3: ( rule__AttributeDefinition__Group__0 )
            // InternalSkillDefinition.g:209:4: rule__AttributeDefinition__Group__0
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
    // InternalSkillDefinition.g:218:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:219:1: ( ruleFQN EOF )
            // InternalSkillDefinition.g:220:1: ruleFQN EOF
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
    // InternalSkillDefinition.g:227:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:231:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalSkillDefinition.g:232:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalSkillDefinition.g:232:2: ( ( rule__FQN__Group__0 ) )
            // InternalSkillDefinition.g:233:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalSkillDefinition.g:234:3: ( rule__FQN__Group__0 )
            // InternalSkillDefinition.g:234:4: rule__FQN__Group__0
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
    // InternalSkillDefinition.g:243:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:244:1: ( ruleEBoolean EOF )
            // InternalSkillDefinition.g:245:1: ruleEBoolean EOF
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
    // InternalSkillDefinition.g:252:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:256:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalSkillDefinition.g:257:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalSkillDefinition.g:257:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalSkillDefinition.g:258:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalSkillDefinition.g:259:3: ( rule__EBoolean__Alternatives )
            // InternalSkillDefinition.g:259:4: rule__EBoolean__Alternatives
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
    // InternalSkillDefinition.g:268:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:269:1: ( ruleEString EOF )
            // InternalSkillDefinition.g:270:1: ruleEString EOF
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
    // InternalSkillDefinition.g:277:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:281:2: ( ( RULE_STRING ) )
            // InternalSkillDefinition.g:282:2: ( RULE_STRING )
            {
            // InternalSkillDefinition.g:282:2: ( RULE_STRING )
            // InternalSkillDefinition.g:283:3: RULE_STRING
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
    // InternalSkillDefinition.g:293:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:294:1: ( ruleEInt EOF )
            // InternalSkillDefinition.g:295:1: ruleEInt EOF
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
    // InternalSkillDefinition.g:302:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:306:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSkillDefinition.g:307:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSkillDefinition.g:307:2: ( ( rule__EInt__Group__0 ) )
            // InternalSkillDefinition.g:308:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSkillDefinition.g:309:3: ( rule__EInt__Group__0 )
            // InternalSkillDefinition.g:309:4: rule__EInt__Group__0
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
    // InternalSkillDefinition.g:318:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:319:1: ( ruleEDouble EOF )
            // InternalSkillDefinition.g:320:1: ruleEDouble EOF
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
    // InternalSkillDefinition.g:327:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:331:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalSkillDefinition.g:332:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalSkillDefinition.g:332:2: ( ( rule__EDouble__Group__0 ) )
            // InternalSkillDefinition.g:333:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalSkillDefinition.g:334:3: ( rule__EDouble__Group__0 )
            // InternalSkillDefinition.g:334:4: rule__EDouble__Group__0
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
    // InternalSkillDefinition.g:343:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:344:1: ( ruleEnumerationElement EOF )
            // InternalSkillDefinition.g:345:1: ruleEnumerationElement EOF
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
    // InternalSkillDefinition.g:352:1: ruleEnumerationElement : ( ( rule__EnumerationElement__Group__0 ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:356:2: ( ( ( rule__EnumerationElement__Group__0 ) ) )
            // InternalSkillDefinition.g:357:2: ( ( rule__EnumerationElement__Group__0 ) )
            {
            // InternalSkillDefinition.g:357:2: ( ( rule__EnumerationElement__Group__0 ) )
            // InternalSkillDefinition.g:358:3: ( rule__EnumerationElement__Group__0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup()); 
            // InternalSkillDefinition.g:359:3: ( rule__EnumerationElement__Group__0 )
            // InternalSkillDefinition.g:359:4: rule__EnumerationElement__Group__0
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
    // InternalSkillDefinition.g:368:1: entryRuleAbstractAttributeType : ruleAbstractAttributeType EOF ;
    public final void entryRuleAbstractAttributeType() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:369:1: ( ruleAbstractAttributeType EOF )
            // InternalSkillDefinition.g:370:1: ruleAbstractAttributeType EOF
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
    // InternalSkillDefinition.g:377:1: ruleAbstractAttributeType : ( ( rule__AbstractAttributeType__Alternatives ) ) ;
    public final void ruleAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:381:2: ( ( ( rule__AbstractAttributeType__Alternatives ) ) )
            // InternalSkillDefinition.g:382:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            {
            // InternalSkillDefinition.g:382:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            // InternalSkillDefinition.g:383:3: ( rule__AbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalSkillDefinition.g:384:3: ( rule__AbstractAttributeType__Alternatives )
            // InternalSkillDefinition.g:384:4: rule__AbstractAttributeType__Alternatives
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
    // InternalSkillDefinition.g:393:1: entryRuleInlineEnumerationType : ruleInlineEnumerationType EOF ;
    public final void entryRuleInlineEnumerationType() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:394:1: ( ruleInlineEnumerationType EOF )
            // InternalSkillDefinition.g:395:1: ruleInlineEnumerationType EOF
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
    // InternalSkillDefinition.g:402:1: ruleInlineEnumerationType : ( ( rule__InlineEnumerationType__Group__0 ) ) ;
    public final void ruleInlineEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:406:2: ( ( ( rule__InlineEnumerationType__Group__0 ) ) )
            // InternalSkillDefinition.g:407:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            {
            // InternalSkillDefinition.g:407:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            // InternalSkillDefinition.g:408:3: ( rule__InlineEnumerationType__Group__0 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 
            // InternalSkillDefinition.g:409:3: ( rule__InlineEnumerationType__Group__0 )
            // InternalSkillDefinition.g:409:4: rule__InlineEnumerationType__Group__0
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
    // InternalSkillDefinition.g:418:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:419:1: ( ruleArrayType EOF )
            // InternalSkillDefinition.g:420:1: ruleArrayType EOF
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
    // InternalSkillDefinition.g:427:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:431:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalSkillDefinition.g:432:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalSkillDefinition.g:432:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalSkillDefinition.g:433:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalSkillDefinition.g:434:3: ( rule__ArrayType__Group__0 )
            // InternalSkillDefinition.g:434:4: rule__ArrayType__Group__0
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
    // InternalSkillDefinition.g:443:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:444:1: ( ruleCardinality EOF )
            // InternalSkillDefinition.g:445:1: ruleCardinality EOF
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
    // InternalSkillDefinition.g:452:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:456:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalSkillDefinition.g:457:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalSkillDefinition.g:457:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalSkillDefinition.g:458:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalSkillDefinition.g:459:3: ( rule__Cardinality__Alternatives )
            // InternalSkillDefinition.g:459:4: rule__Cardinality__Alternatives
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
    // InternalSkillDefinition.g:468:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:469:1: ( rulePrimitiveType EOF )
            // InternalSkillDefinition.g:470:1: rulePrimitiveType EOF
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
    // InternalSkillDefinition.g:477:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:481:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalSkillDefinition.g:482:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalSkillDefinition.g:482:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalSkillDefinition.g:483:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalSkillDefinition.g:484:3: ( rule__PrimitiveType__Group__0 )
            // InternalSkillDefinition.g:484:4: rule__PrimitiveType__Group__0
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
    // InternalSkillDefinition.g:493:1: entryRuleAbstractValue : ruleAbstractValue EOF ;
    public final void entryRuleAbstractValue() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:494:1: ( ruleAbstractValue EOF )
            // InternalSkillDefinition.g:495:1: ruleAbstractValue EOF
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
    // InternalSkillDefinition.g:502:1: ruleAbstractValue : ( ( rule__AbstractValue__Alternatives ) ) ;
    public final void ruleAbstractValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:506:2: ( ( ( rule__AbstractValue__Alternatives ) ) )
            // InternalSkillDefinition.g:507:2: ( ( rule__AbstractValue__Alternatives ) )
            {
            // InternalSkillDefinition.g:507:2: ( ( rule__AbstractValue__Alternatives ) )
            // InternalSkillDefinition.g:508:3: ( rule__AbstractValue__Alternatives )
            {
             before(grammarAccess.getAbstractValueAccess().getAlternatives()); 
            // InternalSkillDefinition.g:509:3: ( rule__AbstractValue__Alternatives )
            // InternalSkillDefinition.g:509:4: rule__AbstractValue__Alternatives
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
    // InternalSkillDefinition.g:518:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:519:1: ( ruleArrayValue EOF )
            // InternalSkillDefinition.g:520:1: ruleArrayValue EOF
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
    // InternalSkillDefinition.g:527:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:531:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalSkillDefinition.g:532:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalSkillDefinition.g:532:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalSkillDefinition.g:533:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalSkillDefinition.g:534:3: ( rule__ArrayValue__Group__0 )
            // InternalSkillDefinition.g:534:4: rule__ArrayValue__Group__0
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
    // InternalSkillDefinition.g:543:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:544:1: ( ruleSingleValue EOF )
            // InternalSkillDefinition.g:545:1: ruleSingleValue EOF
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
    // InternalSkillDefinition.g:552:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:556:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalSkillDefinition.g:557:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalSkillDefinition.g:557:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalSkillDefinition.g:558:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalSkillDefinition.g:559:3: ( rule__SingleValue__Alternatives )
            // InternalSkillDefinition.g:559:4: rule__SingleValue__Alternatives
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


    // $ANTLR start "ruleSKILL_RESULT_TYPES"
    // InternalSkillDefinition.g:568:1: ruleSKILL_RESULT_TYPES : ( ( rule__SKILL_RESULT_TYPES__Alternatives ) ) ;
    public final void ruleSKILL_RESULT_TYPES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:572:1: ( ( ( rule__SKILL_RESULT_TYPES__Alternatives ) ) )
            // InternalSkillDefinition.g:573:2: ( ( rule__SKILL_RESULT_TYPES__Alternatives ) )
            {
            // InternalSkillDefinition.g:573:2: ( ( rule__SKILL_RESULT_TYPES__Alternatives ) )
            // InternalSkillDefinition.g:574:3: ( rule__SKILL_RESULT_TYPES__Alternatives )
            {
             before(grammarAccess.getSKILL_RESULT_TYPESAccess().getAlternatives()); 
            // InternalSkillDefinition.g:575:3: ( rule__SKILL_RESULT_TYPES__Alternatives )
            // InternalSkillDefinition.g:575:4: rule__SKILL_RESULT_TYPES__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SKILL_RESULT_TYPES__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSKILL_RESULT_TYPESAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSKILL_RESULT_TYPES"


    // $ANTLR start "rulePRIMITIVE_TYPE_NAME"
    // InternalSkillDefinition.g:584:1: rulePRIMITIVE_TYPE_NAME : ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) ;
    public final void rulePRIMITIVE_TYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:588:1: ( ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) )
            // InternalSkillDefinition.g:589:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            {
            // InternalSkillDefinition.g:589:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            // InternalSkillDefinition.g:590:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            {
             before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 
            // InternalSkillDefinition.g:591:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            // InternalSkillDefinition.g:591:4: rule__PRIMITIVE_TYPE_NAME__Alternatives
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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalSkillDefinition.g:599:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:603:1: ( ( 'true' ) | ( 'false' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSkillDefinition.g:604:2: ( 'true' )
                    {
                    // InternalSkillDefinition.g:604:2: ( 'true' )
                    // InternalSkillDefinition.g:605:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:610:2: ( 'false' )
                    {
                    // InternalSkillDefinition.g:610:2: ( 'false' )
                    // InternalSkillDefinition.g:611:3: 'false'
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
    // InternalSkillDefinition.g:620:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:624:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSkillDefinition.g:625:2: ( 'E' )
                    {
                    // InternalSkillDefinition.g:625:2: ( 'E' )
                    // InternalSkillDefinition.g:626:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:631:2: ( 'e' )
                    {
                    // InternalSkillDefinition.g:631:2: ( 'e' )
                    // InternalSkillDefinition.g:632:3: 'e'
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
    // InternalSkillDefinition.g:641:1: rule__AbstractAttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) );
    public final void rule__AbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:645:1: ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=21 && LA3_0<=32)) ) {
                alt3=1;
            }
            else if ( (LA3_0==47) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSkillDefinition.g:646:2: ( rulePrimitiveType )
                    {
                    // InternalSkillDefinition.g:646:2: ( rulePrimitiveType )
                    // InternalSkillDefinition.g:647:3: rulePrimitiveType
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
                    // InternalSkillDefinition.g:652:2: ( ruleInlineEnumerationType )
                    {
                    // InternalSkillDefinition.g:652:2: ( ruleInlineEnumerationType )
                    // InternalSkillDefinition.g:653:3: ruleInlineEnumerationType
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
    // InternalSkillDefinition.g:662:1: rule__Cardinality__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:666:1: ( ( RULE_INT ) | ( '*' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==18) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSkillDefinition.g:667:2: ( RULE_INT )
                    {
                    // InternalSkillDefinition.g:667:2: ( RULE_INT )
                    // InternalSkillDefinition.g:668:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:673:2: ( '*' )
                    {
                    // InternalSkillDefinition.g:673:2: ( '*' )
                    // InternalSkillDefinition.g:674:3: '*'
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
    // InternalSkillDefinition.g:683:1: rule__AbstractValue__Alternatives : ( ( ruleSingleValue ) | ( ruleArrayValue ) );
    public final void rule__AbstractValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:687:1: ( ( ruleSingleValue ) | ( ruleArrayValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||(LA5_0>=14 && LA5_0<=15)||(LA5_0>=45 && LA5_0<=46)) ) {
                alt5=1;
            }
            else if ( (LA5_0==48) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSkillDefinition.g:688:2: ( ruleSingleValue )
                    {
                    // InternalSkillDefinition.g:688:2: ( ruleSingleValue )
                    // InternalSkillDefinition.g:689:3: ruleSingleValue
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
                    // InternalSkillDefinition.g:694:2: ( ruleArrayValue )
                    {
                    // InternalSkillDefinition.g:694:2: ( ruleArrayValue )
                    // InternalSkillDefinition.g:695:3: ruleArrayValue
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
    // InternalSkillDefinition.g:704:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:708:1: ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 46:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_INT) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==EOF||(LA6_2>=RULE_ID && LA6_2<=RULE_DOCU_COMMENT)||LA6_2==35||LA6_2==43||(LA6_2>=49 && LA6_2<=50)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==45) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==45) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==EOF||(LA6_2>=RULE_ID && LA6_2<=RULE_DOCU_COMMENT)||LA6_2==35||LA6_2==43||(LA6_2>=49 && LA6_2<=50)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==45) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case 14:
            case 15:
                {
                alt6=4;
                }
                break;
            case RULE_ID:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSkillDefinition.g:709:2: ( ( rule__SingleValue__Group_0__0 ) )
                    {
                    // InternalSkillDefinition.g:709:2: ( ( rule__SingleValue__Group_0__0 ) )
                    // InternalSkillDefinition.g:710:3: ( rule__SingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_0()); 
                    // InternalSkillDefinition.g:711:3: ( rule__SingleValue__Group_0__0 )
                    // InternalSkillDefinition.g:711:4: rule__SingleValue__Group_0__0
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
                    // InternalSkillDefinition.g:715:2: ( ( rule__SingleValue__Group_1__0 ) )
                    {
                    // InternalSkillDefinition.g:715:2: ( ( rule__SingleValue__Group_1__0 ) )
                    // InternalSkillDefinition.g:716:3: ( rule__SingleValue__Group_1__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_1()); 
                    // InternalSkillDefinition.g:717:3: ( rule__SingleValue__Group_1__0 )
                    // InternalSkillDefinition.g:717:4: rule__SingleValue__Group_1__0
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
                    // InternalSkillDefinition.g:721:2: ( ( rule__SingleValue__Group_2__0 ) )
                    {
                    // InternalSkillDefinition.g:721:2: ( ( rule__SingleValue__Group_2__0 ) )
                    // InternalSkillDefinition.g:722:3: ( rule__SingleValue__Group_2__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_2()); 
                    // InternalSkillDefinition.g:723:3: ( rule__SingleValue__Group_2__0 )
                    // InternalSkillDefinition.g:723:4: rule__SingleValue__Group_2__0
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
                    // InternalSkillDefinition.g:727:2: ( ( rule__SingleValue__Group_3__0 ) )
                    {
                    // InternalSkillDefinition.g:727:2: ( ( rule__SingleValue__Group_3__0 ) )
                    // InternalSkillDefinition.g:728:3: ( rule__SingleValue__Group_3__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_3()); 
                    // InternalSkillDefinition.g:729:3: ( rule__SingleValue__Group_3__0 )
                    // InternalSkillDefinition.g:729:4: rule__SingleValue__Group_3__0
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
                    // InternalSkillDefinition.g:733:2: ( ( rule__SingleValue__Group_4__0 ) )
                    {
                    // InternalSkillDefinition.g:733:2: ( ( rule__SingleValue__Group_4__0 ) )
                    // InternalSkillDefinition.g:734:3: ( rule__SingleValue__Group_4__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_4()); 
                    // InternalSkillDefinition.g:735:3: ( rule__SingleValue__Group_4__0 )
                    // InternalSkillDefinition.g:735:4: rule__SingleValue__Group_4__0
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


    // $ANTLR start "rule__SKILL_RESULT_TYPES__Alternatives"
    // InternalSkillDefinition.g:743:1: rule__SKILL_RESULT_TYPES__Alternatives : ( ( ( 'ERROR' ) ) | ( ( 'SUCCESS' ) ) );
    public final void rule__SKILL_RESULT_TYPES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:747:1: ( ( ( 'ERROR' ) ) | ( ( 'SUCCESS' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSkillDefinition.g:748:2: ( ( 'ERROR' ) )
                    {
                    // InternalSkillDefinition.g:748:2: ( ( 'ERROR' ) )
                    // InternalSkillDefinition.g:749:3: ( 'ERROR' )
                    {
                     before(grammarAccess.getSKILL_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_0()); 
                    // InternalSkillDefinition.g:750:3: ( 'ERROR' )
                    // InternalSkillDefinition.g:750:4: 'ERROR'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getSKILL_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:754:2: ( ( 'SUCCESS' ) )
                    {
                    // InternalSkillDefinition.g:754:2: ( ( 'SUCCESS' ) )
                    // InternalSkillDefinition.g:755:3: ( 'SUCCESS' )
                    {
                     before(grammarAccess.getSKILL_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_1()); 
                    // InternalSkillDefinition.g:756:3: ( 'SUCCESS' )
                    // InternalSkillDefinition.g:756:4: 'SUCCESS'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getSKILL_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__SKILL_RESULT_TYPES__Alternatives"


    // $ANTLR start "rule__PRIMITIVE_TYPE_NAME__Alternatives"
    // InternalSkillDefinition.g:764:1: rule__PRIMITIVE_TYPE_NAME__Alternatives : ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PRIMITIVE_TYPE_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:768:1: ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) )
            int alt8=12;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 26:
                {
                alt8=6;
                }
                break;
            case 27:
                {
                alt8=7;
                }
                break;
            case 28:
                {
                alt8=8;
                }
                break;
            case 29:
                {
                alt8=9;
                }
                break;
            case 30:
                {
                alt8=10;
                }
                break;
            case 31:
                {
                alt8=11;
                }
                break;
            case 32:
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
                    // InternalSkillDefinition.g:769:2: ( ( 'Int8' ) )
                    {
                    // InternalSkillDefinition.g:769:2: ( ( 'Int8' ) )
                    // InternalSkillDefinition.g:770:3: ( 'Int8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 
                    // InternalSkillDefinition.g:771:3: ( 'Int8' )
                    // InternalSkillDefinition.g:771:4: 'Int8'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:775:2: ( ( 'Int16' ) )
                    {
                    // InternalSkillDefinition.g:775:2: ( ( 'Int16' ) )
                    // InternalSkillDefinition.g:776:3: ( 'Int16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 
                    // InternalSkillDefinition.g:777:3: ( 'Int16' )
                    // InternalSkillDefinition.g:777:4: 'Int16'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSkillDefinition.g:781:2: ( ( 'Int32' ) )
                    {
                    // InternalSkillDefinition.g:781:2: ( ( 'Int32' ) )
                    // InternalSkillDefinition.g:782:3: ( 'Int32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 
                    // InternalSkillDefinition.g:783:3: ( 'Int32' )
                    // InternalSkillDefinition.g:783:4: 'Int32'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSkillDefinition.g:787:2: ( ( 'Int64' ) )
                    {
                    // InternalSkillDefinition.g:787:2: ( ( 'Int64' ) )
                    // InternalSkillDefinition.g:788:3: ( 'Int64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 
                    // InternalSkillDefinition.g:789:3: ( 'Int64' )
                    // InternalSkillDefinition.g:789:4: 'Int64'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSkillDefinition.g:793:2: ( ( 'UInt8' ) )
                    {
                    // InternalSkillDefinition.g:793:2: ( ( 'UInt8' ) )
                    // InternalSkillDefinition.g:794:3: ( 'UInt8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 
                    // InternalSkillDefinition.g:795:3: ( 'UInt8' )
                    // InternalSkillDefinition.g:795:4: 'UInt8'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSkillDefinition.g:799:2: ( ( 'UInt16' ) )
                    {
                    // InternalSkillDefinition.g:799:2: ( ( 'UInt16' ) )
                    // InternalSkillDefinition.g:800:3: ( 'UInt16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 
                    // InternalSkillDefinition.g:801:3: ( 'UInt16' )
                    // InternalSkillDefinition.g:801:4: 'UInt16'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSkillDefinition.g:805:2: ( ( 'UInt32' ) )
                    {
                    // InternalSkillDefinition.g:805:2: ( ( 'UInt32' ) )
                    // InternalSkillDefinition.g:806:3: ( 'UInt32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 
                    // InternalSkillDefinition.g:807:3: ( 'UInt32' )
                    // InternalSkillDefinition.g:807:4: 'UInt32'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSkillDefinition.g:811:2: ( ( 'UInt64' ) )
                    {
                    // InternalSkillDefinition.g:811:2: ( ( 'UInt64' ) )
                    // InternalSkillDefinition.g:812:3: ( 'UInt64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 
                    // InternalSkillDefinition.g:813:3: ( 'UInt64' )
                    // InternalSkillDefinition.g:813:4: 'UInt64'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSkillDefinition.g:817:2: ( ( 'Float' ) )
                    {
                    // InternalSkillDefinition.g:817:2: ( ( 'Float' ) )
                    // InternalSkillDefinition.g:818:3: ( 'Float' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 
                    // InternalSkillDefinition.g:819:3: ( 'Float' )
                    // InternalSkillDefinition.g:819:4: 'Float'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSkillDefinition.g:823:2: ( ( 'Double' ) )
                    {
                    // InternalSkillDefinition.g:823:2: ( ( 'Double' ) )
                    // InternalSkillDefinition.g:824:3: ( 'Double' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 
                    // InternalSkillDefinition.g:825:3: ( 'Double' )
                    // InternalSkillDefinition.g:825:4: 'Double'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSkillDefinition.g:829:2: ( ( 'String' ) )
                    {
                    // InternalSkillDefinition.g:829:2: ( ( 'String' ) )
                    // InternalSkillDefinition.g:830:3: ( 'String' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 
                    // InternalSkillDefinition.g:831:3: ( 'String' )
                    // InternalSkillDefinition.g:831:4: 'String'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSkillDefinition.g:835:2: ( ( 'Boolean' ) )
                    {
                    // InternalSkillDefinition.g:835:2: ( ( 'Boolean' ) )
                    // InternalSkillDefinition.g:836:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 
                    // InternalSkillDefinition.g:837:3: ( 'Boolean' )
                    // InternalSkillDefinition.g:837:4: 'Boolean'
                    {
                    match(input,32,FOLLOW_2); 

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


    // $ANTLR start "rule__SkillDefinitionModel__Group__0"
    // InternalSkillDefinition.g:845:1: rule__SkillDefinitionModel__Group__0 : rule__SkillDefinitionModel__Group__0__Impl rule__SkillDefinitionModel__Group__1 ;
    public final void rule__SkillDefinitionModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:849:1: ( rule__SkillDefinitionModel__Group__0__Impl rule__SkillDefinitionModel__Group__1 )
            // InternalSkillDefinition.g:850:2: rule__SkillDefinitionModel__Group__0__Impl rule__SkillDefinitionModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SkillDefinitionModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinitionModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionModel__Group__0"


    // $ANTLR start "rule__SkillDefinitionModel__Group__0__Impl"
    // InternalSkillDefinition.g:857:1: rule__SkillDefinitionModel__Group__0__Impl : ( () ) ;
    public final void rule__SkillDefinitionModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:861:1: ( ( () ) )
            // InternalSkillDefinition.g:862:1: ( () )
            {
            // InternalSkillDefinition.g:862:1: ( () )
            // InternalSkillDefinition.g:863:2: ()
            {
             before(grammarAccess.getSkillDefinitionModelAccess().getSkillDefinitionModelAction_0()); 
            // InternalSkillDefinition.g:864:2: ()
            // InternalSkillDefinition.g:864:3: 
            {
            }

             after(grammarAccess.getSkillDefinitionModelAccess().getSkillDefinitionModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionModel__Group__0__Impl"


    // $ANTLR start "rule__SkillDefinitionModel__Group__1"
    // InternalSkillDefinition.g:872:1: rule__SkillDefinitionModel__Group__1 : rule__SkillDefinitionModel__Group__1__Impl ;
    public final void rule__SkillDefinitionModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:876:1: ( rule__SkillDefinitionModel__Group__1__Impl )
            // InternalSkillDefinition.g:877:2: rule__SkillDefinitionModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinitionModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionModel__Group__1"


    // $ANTLR start "rule__SkillDefinitionModel__Group__1__Impl"
    // InternalSkillDefinition.g:883:1: rule__SkillDefinitionModel__Group__1__Impl : ( ( rule__SkillDefinitionModel__RepositoryAssignment_1 )? ) ;
    public final void rule__SkillDefinitionModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:887:1: ( ( ( rule__SkillDefinitionModel__RepositoryAssignment_1 )? ) )
            // InternalSkillDefinition.g:888:1: ( ( rule__SkillDefinitionModel__RepositoryAssignment_1 )? )
            {
            // InternalSkillDefinition.g:888:1: ( ( rule__SkillDefinitionModel__RepositoryAssignment_1 )? )
            // InternalSkillDefinition.g:889:2: ( rule__SkillDefinitionModel__RepositoryAssignment_1 )?
            {
             before(grammarAccess.getSkillDefinitionModelAccess().getRepositoryAssignment_1()); 
            // InternalSkillDefinition.g:890:2: ( rule__SkillDefinitionModel__RepositoryAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSkillDefinition.g:890:3: rule__SkillDefinitionModel__RepositoryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SkillDefinitionModel__RepositoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSkillDefinitionModelAccess().getRepositoryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionModel__Group__1__Impl"


    // $ANTLR start "rule__SkillDefinitionRepository__Group__0"
    // InternalSkillDefinition.g:899:1: rule__SkillDefinitionRepository__Group__0 : rule__SkillDefinitionRepository__Group__0__Impl rule__SkillDefinitionRepository__Group__1 ;
    public final void rule__SkillDefinitionRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:903:1: ( rule__SkillDefinitionRepository__Group__0__Impl rule__SkillDefinitionRepository__Group__1 )
            // InternalSkillDefinition.g:904:2: rule__SkillDefinitionRepository__Group__0__Impl rule__SkillDefinitionRepository__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SkillDefinitionRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinitionRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__Group__0"


    // $ANTLR start "rule__SkillDefinitionRepository__Group__0__Impl"
    // InternalSkillDefinition.g:911:1: rule__SkillDefinitionRepository__Group__0__Impl : ( 'SkillDefinitionRepository' ) ;
    public final void rule__SkillDefinitionRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:915:1: ( ( 'SkillDefinitionRepository' ) )
            // InternalSkillDefinition.g:916:1: ( 'SkillDefinitionRepository' )
            {
            // InternalSkillDefinition.g:916:1: ( 'SkillDefinitionRepository' )
            // InternalSkillDefinition.g:917:2: 'SkillDefinitionRepository'
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getSkillDefinitionRepositoryKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionRepositoryAccess().getSkillDefinitionRepositoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__Group__0__Impl"


    // $ANTLR start "rule__SkillDefinitionRepository__Group__1"
    // InternalSkillDefinition.g:926:1: rule__SkillDefinitionRepository__Group__1 : rule__SkillDefinitionRepository__Group__1__Impl rule__SkillDefinitionRepository__Group__2 ;
    public final void rule__SkillDefinitionRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:930:1: ( rule__SkillDefinitionRepository__Group__1__Impl rule__SkillDefinitionRepository__Group__2 )
            // InternalSkillDefinition.g:931:2: rule__SkillDefinitionRepository__Group__1__Impl rule__SkillDefinitionRepository__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SkillDefinitionRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinitionRepository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__Group__1"


    // $ANTLR start "rule__SkillDefinitionRepository__Group__1__Impl"
    // InternalSkillDefinition.g:938:1: rule__SkillDefinitionRepository__Group__1__Impl : ( ( rule__SkillDefinitionRepository__NameAssignment_1 ) ) ;
    public final void rule__SkillDefinitionRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:942:1: ( ( ( rule__SkillDefinitionRepository__NameAssignment_1 ) ) )
            // InternalSkillDefinition.g:943:1: ( ( rule__SkillDefinitionRepository__NameAssignment_1 ) )
            {
            // InternalSkillDefinition.g:943:1: ( ( rule__SkillDefinitionRepository__NameAssignment_1 ) )
            // InternalSkillDefinition.g:944:2: ( rule__SkillDefinitionRepository__NameAssignment_1 )
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getNameAssignment_1()); 
            // InternalSkillDefinition.g:945:2: ( rule__SkillDefinitionRepository__NameAssignment_1 )
            // InternalSkillDefinition.g:945:3: rule__SkillDefinitionRepository__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinitionRepository__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionRepositoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__Group__1__Impl"


    // $ANTLR start "rule__SkillDefinitionRepository__Group__2"
    // InternalSkillDefinition.g:953:1: rule__SkillDefinitionRepository__Group__2 : rule__SkillDefinitionRepository__Group__2__Impl rule__SkillDefinitionRepository__Group__3 ;
    public final void rule__SkillDefinitionRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:957:1: ( rule__SkillDefinitionRepository__Group__2__Impl rule__SkillDefinitionRepository__Group__3 )
            // InternalSkillDefinition.g:958:2: rule__SkillDefinitionRepository__Group__2__Impl rule__SkillDefinitionRepository__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SkillDefinitionRepository__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinitionRepository__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__Group__2"


    // $ANTLR start "rule__SkillDefinitionRepository__Group__2__Impl"
    // InternalSkillDefinition.g:965:1: rule__SkillDefinitionRepository__Group__2__Impl : ( '{' ) ;
    public final void rule__SkillDefinitionRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:969:1: ( ( '{' ) )
            // InternalSkillDefinition.g:970:1: ( '{' )
            {
            // InternalSkillDefinition.g:970:1: ( '{' )
            // InternalSkillDefinition.g:971:2: '{'
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__Group__2__Impl"


    // $ANTLR start "rule__SkillDefinitionRepository__Group__3"
    // InternalSkillDefinition.g:980:1: rule__SkillDefinitionRepository__Group__3 : rule__SkillDefinitionRepository__Group__3__Impl rule__SkillDefinitionRepository__Group__4 ;
    public final void rule__SkillDefinitionRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:984:1: ( rule__SkillDefinitionRepository__Group__3__Impl rule__SkillDefinitionRepository__Group__4 )
            // InternalSkillDefinition.g:985:2: rule__SkillDefinitionRepository__Group__3__Impl rule__SkillDefinitionRepository__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__SkillDefinitionRepository__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinitionRepository__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__Group__3"


    // $ANTLR start "rule__SkillDefinitionRepository__Group__3__Impl"
    // InternalSkillDefinition.g:992:1: rule__SkillDefinitionRepository__Group__3__Impl : ( ( rule__SkillDefinitionRepository__ModulesAssignment_3 )* ) ;
    public final void rule__SkillDefinitionRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:996:1: ( ( ( rule__SkillDefinitionRepository__ModulesAssignment_3 )* ) )
            // InternalSkillDefinition.g:997:1: ( ( rule__SkillDefinitionRepository__ModulesAssignment_3 )* )
            {
            // InternalSkillDefinition.g:997:1: ( ( rule__SkillDefinitionRepository__ModulesAssignment_3 )* )
            // InternalSkillDefinition.g:998:2: ( rule__SkillDefinitionRepository__ModulesAssignment_3 )*
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getModulesAssignment_3()); 
            // InternalSkillDefinition.g:999:2: ( rule__SkillDefinitionRepository__ModulesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSkillDefinition.g:999:3: rule__SkillDefinitionRepository__ModulesAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SkillDefinitionRepository__ModulesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getSkillDefinitionRepositoryAccess().getModulesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__Group__3__Impl"


    // $ANTLR start "rule__SkillDefinitionRepository__Group__4"
    // InternalSkillDefinition.g:1007:1: rule__SkillDefinitionRepository__Group__4 : rule__SkillDefinitionRepository__Group__4__Impl ;
    public final void rule__SkillDefinitionRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1011:1: ( rule__SkillDefinitionRepository__Group__4__Impl )
            // InternalSkillDefinition.g:1012:2: rule__SkillDefinitionRepository__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinitionRepository__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__Group__4"


    // $ANTLR start "rule__SkillDefinitionRepository__Group__4__Impl"
    // InternalSkillDefinition.g:1018:1: rule__SkillDefinitionRepository__Group__4__Impl : ( '}' ) ;
    public final void rule__SkillDefinitionRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1022:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1023:1: ( '}' )
            {
            // InternalSkillDefinition.g:1023:1: ( '}' )
            // InternalSkillDefinition.g:1024:2: '}'
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__Group__4__Impl"


    // $ANTLR start "rule__CoordinationModuleDefinition__Group__0"
    // InternalSkillDefinition.g:1034:1: rule__CoordinationModuleDefinition__Group__0 : rule__CoordinationModuleDefinition__Group__0__Impl rule__CoordinationModuleDefinition__Group__1 ;
    public final void rule__CoordinationModuleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1038:1: ( rule__CoordinationModuleDefinition__Group__0__Impl rule__CoordinationModuleDefinition__Group__1 )
            // InternalSkillDefinition.g:1039:2: rule__CoordinationModuleDefinition__Group__0__Impl rule__CoordinationModuleDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CoordinationModuleDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__Group__0"


    // $ANTLR start "rule__CoordinationModuleDefinition__Group__0__Impl"
    // InternalSkillDefinition.g:1046:1: rule__CoordinationModuleDefinition__Group__0__Impl : ( 'CoordinationModuleDefinition' ) ;
    public final void rule__CoordinationModuleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1050:1: ( ( 'CoordinationModuleDefinition' ) )
            // InternalSkillDefinition.g:1051:1: ( 'CoordinationModuleDefinition' )
            {
            // InternalSkillDefinition.g:1051:1: ( 'CoordinationModuleDefinition' )
            // InternalSkillDefinition.g:1052:2: 'CoordinationModuleDefinition'
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getCoordinationModuleDefinitionKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleDefinitionAccess().getCoordinationModuleDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__Group__0__Impl"


    // $ANTLR start "rule__CoordinationModuleDefinition__Group__1"
    // InternalSkillDefinition.g:1061:1: rule__CoordinationModuleDefinition__Group__1 : rule__CoordinationModuleDefinition__Group__1__Impl rule__CoordinationModuleDefinition__Group__2 ;
    public final void rule__CoordinationModuleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1065:1: ( rule__CoordinationModuleDefinition__Group__1__Impl rule__CoordinationModuleDefinition__Group__2 )
            // InternalSkillDefinition.g:1066:2: rule__CoordinationModuleDefinition__Group__1__Impl rule__CoordinationModuleDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CoordinationModuleDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__Group__1"


    // $ANTLR start "rule__CoordinationModuleDefinition__Group__1__Impl"
    // InternalSkillDefinition.g:1073:1: rule__CoordinationModuleDefinition__Group__1__Impl : ( ( rule__CoordinationModuleDefinition__NameAssignment_1 ) ) ;
    public final void rule__CoordinationModuleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1077:1: ( ( ( rule__CoordinationModuleDefinition__NameAssignment_1 ) ) )
            // InternalSkillDefinition.g:1078:1: ( ( rule__CoordinationModuleDefinition__NameAssignment_1 ) )
            {
            // InternalSkillDefinition.g:1078:1: ( ( rule__CoordinationModuleDefinition__NameAssignment_1 ) )
            // InternalSkillDefinition.g:1079:2: ( rule__CoordinationModuleDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getNameAssignment_1()); 
            // InternalSkillDefinition.g:1080:2: ( rule__CoordinationModuleDefinition__NameAssignment_1 )
            // InternalSkillDefinition.g:1080:3: rule__CoordinationModuleDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationModuleDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationModuleDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__Group__1__Impl"


    // $ANTLR start "rule__CoordinationModuleDefinition__Group__2"
    // InternalSkillDefinition.g:1088:1: rule__CoordinationModuleDefinition__Group__2 : rule__CoordinationModuleDefinition__Group__2__Impl rule__CoordinationModuleDefinition__Group__3 ;
    public final void rule__CoordinationModuleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1092:1: ( rule__CoordinationModuleDefinition__Group__2__Impl rule__CoordinationModuleDefinition__Group__3 )
            // InternalSkillDefinition.g:1093:2: rule__CoordinationModuleDefinition__Group__2__Impl rule__CoordinationModuleDefinition__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__CoordinationModuleDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__Group__2"


    // $ANTLR start "rule__CoordinationModuleDefinition__Group__2__Impl"
    // InternalSkillDefinition.g:1100:1: rule__CoordinationModuleDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__CoordinationModuleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1104:1: ( ( '{' ) )
            // InternalSkillDefinition.g:1105:1: ( '{' )
            {
            // InternalSkillDefinition.g:1105:1: ( '{' )
            // InternalSkillDefinition.g:1106:2: '{'
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__Group__2__Impl"


    // $ANTLR start "rule__CoordinationModuleDefinition__Group__3"
    // InternalSkillDefinition.g:1115:1: rule__CoordinationModuleDefinition__Group__3 : rule__CoordinationModuleDefinition__Group__3__Impl rule__CoordinationModuleDefinition__Group__4 ;
    public final void rule__CoordinationModuleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1119:1: ( rule__CoordinationModuleDefinition__Group__3__Impl rule__CoordinationModuleDefinition__Group__4 )
            // InternalSkillDefinition.g:1120:2: rule__CoordinationModuleDefinition__Group__3__Impl rule__CoordinationModuleDefinition__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__CoordinationModuleDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__Group__3"


    // $ANTLR start "rule__CoordinationModuleDefinition__Group__3__Impl"
    // InternalSkillDefinition.g:1127:1: rule__CoordinationModuleDefinition__Group__3__Impl : ( ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )* ) ;
    public final void rule__CoordinationModuleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1131:1: ( ( ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )* ) )
            // InternalSkillDefinition.g:1132:1: ( ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )* )
            {
            // InternalSkillDefinition.g:1132:1: ( ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )* )
            // InternalSkillDefinition.g:1133:2: ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )*
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getSkillsAssignment_3()); 
            // InternalSkillDefinition.g:1134:2: ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==37) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSkillDefinition.g:1134:3: rule__CoordinationModuleDefinition__SkillsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__CoordinationModuleDefinition__SkillsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getCoordinationModuleDefinitionAccess().getSkillsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__Group__3__Impl"


    // $ANTLR start "rule__CoordinationModuleDefinition__Group__4"
    // InternalSkillDefinition.g:1142:1: rule__CoordinationModuleDefinition__Group__4 : rule__CoordinationModuleDefinition__Group__4__Impl ;
    public final void rule__CoordinationModuleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1146:1: ( rule__CoordinationModuleDefinition__Group__4__Impl )
            // InternalSkillDefinition.g:1147:2: rule__CoordinationModuleDefinition__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationModuleDefinition__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__Group__4"


    // $ANTLR start "rule__CoordinationModuleDefinition__Group__4__Impl"
    // InternalSkillDefinition.g:1153:1: rule__CoordinationModuleDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__CoordinationModuleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1157:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1158:1: ( '}' )
            {
            // InternalSkillDefinition.g:1158:1: ( '}' )
            // InternalSkillDefinition.g:1159:2: '}'
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleDefinitionAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__Group__4__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__0"
    // InternalSkillDefinition.g:1169:1: rule__SkillDefinition__Group__0 : rule__SkillDefinition__Group__0__Impl rule__SkillDefinition__Group__1 ;
    public final void rule__SkillDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1173:1: ( rule__SkillDefinition__Group__0__Impl rule__SkillDefinition__Group__1 )
            // InternalSkillDefinition.g:1174:2: rule__SkillDefinition__Group__0__Impl rule__SkillDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__SkillDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__0"


    // $ANTLR start "rule__SkillDefinition__Group__0__Impl"
    // InternalSkillDefinition.g:1181:1: rule__SkillDefinition__Group__0__Impl : ( 'SkillDefinition' ) ;
    public final void rule__SkillDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1185:1: ( ( 'SkillDefinition' ) )
            // InternalSkillDefinition.g:1186:1: ( 'SkillDefinition' )
            {
            // InternalSkillDefinition.g:1186:1: ( 'SkillDefinition' )
            // InternalSkillDefinition.g:1187:2: 'SkillDefinition'
            {
             before(grammarAccess.getSkillDefinitionAccess().getSkillDefinitionKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getSkillDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__0__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__1"
    // InternalSkillDefinition.g:1196:1: rule__SkillDefinition__Group__1 : rule__SkillDefinition__Group__1__Impl rule__SkillDefinition__Group__2 ;
    public final void rule__SkillDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1200:1: ( rule__SkillDefinition__Group__1__Impl rule__SkillDefinition__Group__2 )
            // InternalSkillDefinition.g:1201:2: rule__SkillDefinition__Group__1__Impl rule__SkillDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__SkillDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__1"


    // $ANTLR start "rule__SkillDefinition__Group__1__Impl"
    // InternalSkillDefinition.g:1208:1: rule__SkillDefinition__Group__1__Impl : ( ( rule__SkillDefinition__NameAssignment_1 ) ) ;
    public final void rule__SkillDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1212:1: ( ( ( rule__SkillDefinition__NameAssignment_1 ) ) )
            // InternalSkillDefinition.g:1213:1: ( ( rule__SkillDefinition__NameAssignment_1 ) )
            {
            // InternalSkillDefinition.g:1213:1: ( ( rule__SkillDefinition__NameAssignment_1 ) )
            // InternalSkillDefinition.g:1214:2: ( rule__SkillDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getNameAssignment_1()); 
            // InternalSkillDefinition.g:1215:2: ( rule__SkillDefinition__NameAssignment_1 )
            // InternalSkillDefinition.g:1215:3: rule__SkillDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__1__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__2"
    // InternalSkillDefinition.g:1223:1: rule__SkillDefinition__Group__2 : rule__SkillDefinition__Group__2__Impl rule__SkillDefinition__Group__3 ;
    public final void rule__SkillDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1227:1: ( rule__SkillDefinition__Group__2__Impl rule__SkillDefinition__Group__3 )
            // InternalSkillDefinition.g:1228:2: rule__SkillDefinition__Group__2__Impl rule__SkillDefinition__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__SkillDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__2"


    // $ANTLR start "rule__SkillDefinition__Group__2__Impl"
    // InternalSkillDefinition.g:1235:1: rule__SkillDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1239:1: ( ( '{' ) )
            // InternalSkillDefinition.g:1240:1: ( '{' )
            {
            // InternalSkillDefinition.g:1240:1: ( '{' )
            // InternalSkillDefinition.g:1241:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__2__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__3"
    // InternalSkillDefinition.g:1250:1: rule__SkillDefinition__Group__3 : rule__SkillDefinition__Group__3__Impl rule__SkillDefinition__Group__4 ;
    public final void rule__SkillDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1254:1: ( rule__SkillDefinition__Group__3__Impl rule__SkillDefinition__Group__4 )
            // InternalSkillDefinition.g:1255:2: rule__SkillDefinition__Group__3__Impl rule__SkillDefinition__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__SkillDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__3"


    // $ANTLR start "rule__SkillDefinition__Group__3__Impl"
    // InternalSkillDefinition.g:1262:1: rule__SkillDefinition__Group__3__Impl : ( ( rule__SkillDefinition__Group_3__0 )? ) ;
    public final void rule__SkillDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1266:1: ( ( ( rule__SkillDefinition__Group_3__0 )? ) )
            // InternalSkillDefinition.g:1267:1: ( ( rule__SkillDefinition__Group_3__0 )? )
            {
            // InternalSkillDefinition.g:1267:1: ( ( rule__SkillDefinition__Group_3__0 )? )
            // InternalSkillDefinition.g:1268:2: ( rule__SkillDefinition__Group_3__0 )?
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup_3()); 
            // InternalSkillDefinition.g:1269:2: ( rule__SkillDefinition__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSkillDefinition.g:1269:3: rule__SkillDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SkillDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSkillDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__3__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__4"
    // InternalSkillDefinition.g:1277:1: rule__SkillDefinition__Group__4 : rule__SkillDefinition__Group__4__Impl rule__SkillDefinition__Group__5 ;
    public final void rule__SkillDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1281:1: ( rule__SkillDefinition__Group__4__Impl rule__SkillDefinition__Group__5 )
            // InternalSkillDefinition.g:1282:2: rule__SkillDefinition__Group__4__Impl rule__SkillDefinition__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__SkillDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__4"


    // $ANTLR start "rule__SkillDefinition__Group__4__Impl"
    // InternalSkillDefinition.g:1289:1: rule__SkillDefinition__Group__4__Impl : ( ( rule__SkillDefinition__Group_4__0 )? ) ;
    public final void rule__SkillDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1293:1: ( ( ( rule__SkillDefinition__Group_4__0 )? ) )
            // InternalSkillDefinition.g:1294:1: ( ( rule__SkillDefinition__Group_4__0 )? )
            {
            // InternalSkillDefinition.g:1294:1: ( ( rule__SkillDefinition__Group_4__0 )? )
            // InternalSkillDefinition.g:1295:2: ( rule__SkillDefinition__Group_4__0 )?
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup_4()); 
            // InternalSkillDefinition.g:1296:2: ( rule__SkillDefinition__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSkillDefinition.g:1296:3: rule__SkillDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SkillDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSkillDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__4__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__5"
    // InternalSkillDefinition.g:1304:1: rule__SkillDefinition__Group__5 : rule__SkillDefinition__Group__5__Impl rule__SkillDefinition__Group__6 ;
    public final void rule__SkillDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1308:1: ( rule__SkillDefinition__Group__5__Impl rule__SkillDefinition__Group__6 )
            // InternalSkillDefinition.g:1309:2: rule__SkillDefinition__Group__5__Impl rule__SkillDefinition__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__SkillDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__5"


    // $ANTLR start "rule__SkillDefinition__Group__5__Impl"
    // InternalSkillDefinition.g:1316:1: rule__SkillDefinition__Group__5__Impl : ( 'results' ) ;
    public final void rule__SkillDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1320:1: ( ( 'results' ) )
            // InternalSkillDefinition.g:1321:1: ( 'results' )
            {
            // InternalSkillDefinition.g:1321:1: ( 'results' )
            // InternalSkillDefinition.g:1322:2: 'results'
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultsKeyword_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getResultsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__5__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__6"
    // InternalSkillDefinition.g:1331:1: rule__SkillDefinition__Group__6 : rule__SkillDefinition__Group__6__Impl rule__SkillDefinition__Group__7 ;
    public final void rule__SkillDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1335:1: ( rule__SkillDefinition__Group__6__Impl rule__SkillDefinition__Group__7 )
            // InternalSkillDefinition.g:1336:2: rule__SkillDefinition__Group__6__Impl rule__SkillDefinition__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__SkillDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__6"


    // $ANTLR start "rule__SkillDefinition__Group__6__Impl"
    // InternalSkillDefinition.g:1343:1: rule__SkillDefinition__Group__6__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1347:1: ( ( '{' ) )
            // InternalSkillDefinition.g:1348:1: ( '{' )
            {
            // InternalSkillDefinition.g:1348:1: ( '{' )
            // InternalSkillDefinition.g:1349:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__6__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__7"
    // InternalSkillDefinition.g:1358:1: rule__SkillDefinition__Group__7 : rule__SkillDefinition__Group__7__Impl rule__SkillDefinition__Group__8 ;
    public final void rule__SkillDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1362:1: ( rule__SkillDefinition__Group__7__Impl rule__SkillDefinition__Group__8 )
            // InternalSkillDefinition.g:1363:2: rule__SkillDefinition__Group__7__Impl rule__SkillDefinition__Group__8
            {
            pushFollow(FOLLOW_12);
            rule__SkillDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__7"


    // $ANTLR start "rule__SkillDefinition__Group__7__Impl"
    // InternalSkillDefinition.g:1370:1: rule__SkillDefinition__Group__7__Impl : ( ( ( rule__SkillDefinition__ResultsAssignment_7 ) ) ( ( rule__SkillDefinition__ResultsAssignment_7 )* ) ) ;
    public final void rule__SkillDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1374:1: ( ( ( ( rule__SkillDefinition__ResultsAssignment_7 ) ) ( ( rule__SkillDefinition__ResultsAssignment_7 )* ) ) )
            // InternalSkillDefinition.g:1375:1: ( ( ( rule__SkillDefinition__ResultsAssignment_7 ) ) ( ( rule__SkillDefinition__ResultsAssignment_7 )* ) )
            {
            // InternalSkillDefinition.g:1375:1: ( ( ( rule__SkillDefinition__ResultsAssignment_7 ) ) ( ( rule__SkillDefinition__ResultsAssignment_7 )* ) )
            // InternalSkillDefinition.g:1376:2: ( ( rule__SkillDefinition__ResultsAssignment_7 ) ) ( ( rule__SkillDefinition__ResultsAssignment_7 )* )
            {
            // InternalSkillDefinition.g:1376:2: ( ( rule__SkillDefinition__ResultsAssignment_7 ) )
            // InternalSkillDefinition.g:1377:3: ( rule__SkillDefinition__ResultsAssignment_7 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultsAssignment_7()); 
            // InternalSkillDefinition.g:1378:3: ( rule__SkillDefinition__ResultsAssignment_7 )
            // InternalSkillDefinition.g:1378:4: rule__SkillDefinition__ResultsAssignment_7
            {
            pushFollow(FOLLOW_13);
            rule__SkillDefinition__ResultsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getResultsAssignment_7()); 

            }

            // InternalSkillDefinition.g:1381:2: ( ( rule__SkillDefinition__ResultsAssignment_7 )* )
            // InternalSkillDefinition.g:1382:3: ( rule__SkillDefinition__ResultsAssignment_7 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultsAssignment_7()); 
            // InternalSkillDefinition.g:1383:3: ( rule__SkillDefinition__ResultsAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=19 && LA14_0<=20)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSkillDefinition.g:1383:4: rule__SkillDefinition__ResultsAssignment_7
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__SkillDefinition__ResultsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSkillDefinitionAccess().getResultsAssignment_7()); 

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
    // $ANTLR end "rule__SkillDefinition__Group__7__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__8"
    // InternalSkillDefinition.g:1392:1: rule__SkillDefinition__Group__8 : rule__SkillDefinition__Group__8__Impl rule__SkillDefinition__Group__9 ;
    public final void rule__SkillDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1396:1: ( rule__SkillDefinition__Group__8__Impl rule__SkillDefinition__Group__9 )
            // InternalSkillDefinition.g:1397:2: rule__SkillDefinition__Group__8__Impl rule__SkillDefinition__Group__9
            {
            pushFollow(FOLLOW_12);
            rule__SkillDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__8"


    // $ANTLR start "rule__SkillDefinition__Group__8__Impl"
    // InternalSkillDefinition.g:1404:1: rule__SkillDefinition__Group__8__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1408:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1409:1: ( '}' )
            {
            // InternalSkillDefinition.g:1409:1: ( '}' )
            // InternalSkillDefinition.g:1410:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__8__Impl"


    // $ANTLR start "rule__SkillDefinition__Group__9"
    // InternalSkillDefinition.g:1419:1: rule__SkillDefinition__Group__9 : rule__SkillDefinition__Group__9__Impl ;
    public final void rule__SkillDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1423:1: ( rule__SkillDefinition__Group__9__Impl )
            // InternalSkillDefinition.g:1424:2: rule__SkillDefinition__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__9"


    // $ANTLR start "rule__SkillDefinition__Group__9__Impl"
    // InternalSkillDefinition.g:1430:1: rule__SkillDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1434:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1435:1: ( '}' )
            {
            // InternalSkillDefinition.g:1435:1: ( '}' )
            // InternalSkillDefinition.g:1436:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group__9__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_3__0"
    // InternalSkillDefinition.g:1446:1: rule__SkillDefinition__Group_3__0 : rule__SkillDefinition__Group_3__0__Impl rule__SkillDefinition__Group_3__1 ;
    public final void rule__SkillDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1450:1: ( rule__SkillDefinition__Group_3__0__Impl rule__SkillDefinition__Group_3__1 )
            // InternalSkillDefinition.g:1451:2: rule__SkillDefinition__Group_3__0__Impl rule__SkillDefinition__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__SkillDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_3__0"


    // $ANTLR start "rule__SkillDefinition__Group_3__0__Impl"
    // InternalSkillDefinition.g:1458:1: rule__SkillDefinition__Group_3__0__Impl : ( 'in' ) ;
    public final void rule__SkillDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1462:1: ( ( 'in' ) )
            // InternalSkillDefinition.g:1463:1: ( 'in' )
            {
            // InternalSkillDefinition.g:1463:1: ( 'in' )
            // InternalSkillDefinition.g:1464:2: 'in'
            {
             before(grammarAccess.getSkillDefinitionAccess().getInKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getInKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_3__1"
    // InternalSkillDefinition.g:1473:1: rule__SkillDefinition__Group_3__1 : rule__SkillDefinition__Group_3__1__Impl rule__SkillDefinition__Group_3__2 ;
    public final void rule__SkillDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1477:1: ( rule__SkillDefinition__Group_3__1__Impl rule__SkillDefinition__Group_3__2 )
            // InternalSkillDefinition.g:1478:2: rule__SkillDefinition__Group_3__1__Impl rule__SkillDefinition__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__SkillDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_3__1"


    // $ANTLR start "rule__SkillDefinition__Group_3__1__Impl"
    // InternalSkillDefinition.g:1485:1: rule__SkillDefinition__Group_3__1__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1489:1: ( ( '{' ) )
            // InternalSkillDefinition.g:1490:1: ( '{' )
            {
            // InternalSkillDefinition.g:1490:1: ( '{' )
            // InternalSkillDefinition.g:1491:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_3__2"
    // InternalSkillDefinition.g:1500:1: rule__SkillDefinition__Group_3__2 : rule__SkillDefinition__Group_3__2__Impl rule__SkillDefinition__Group_3__3 ;
    public final void rule__SkillDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1504:1: ( rule__SkillDefinition__Group_3__2__Impl rule__SkillDefinition__Group_3__3 )
            // InternalSkillDefinition.g:1505:2: rule__SkillDefinition__Group_3__2__Impl rule__SkillDefinition__Group_3__3
            {
            pushFollow(FOLLOW_14);
            rule__SkillDefinition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_3__2"


    // $ANTLR start "rule__SkillDefinition__Group_3__2__Impl"
    // InternalSkillDefinition.g:1512:1: rule__SkillDefinition__Group_3__2__Impl : ( ( rule__SkillDefinition__InAttributeAssignment_3_2 )* ) ;
    public final void rule__SkillDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1516:1: ( ( ( rule__SkillDefinition__InAttributeAssignment_3_2 )* ) )
            // InternalSkillDefinition.g:1517:1: ( ( rule__SkillDefinition__InAttributeAssignment_3_2 )* )
            {
            // InternalSkillDefinition.g:1517:1: ( ( rule__SkillDefinition__InAttributeAssignment_3_2 )* )
            // InternalSkillDefinition.g:1518:2: ( rule__SkillDefinition__InAttributeAssignment_3_2 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getInAttributeAssignment_3_2()); 
            // InternalSkillDefinition.g:1519:2: ( rule__SkillDefinition__InAttributeAssignment_3_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_DOCU_COMMENT)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSkillDefinition.g:1519:3: rule__SkillDefinition__InAttributeAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SkillDefinition__InAttributeAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSkillDefinitionAccess().getInAttributeAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_3__3"
    // InternalSkillDefinition.g:1527:1: rule__SkillDefinition__Group_3__3 : rule__SkillDefinition__Group_3__3__Impl ;
    public final void rule__SkillDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1531:1: ( rule__SkillDefinition__Group_3__3__Impl )
            // InternalSkillDefinition.g:1532:2: rule__SkillDefinition__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_3__3"


    // $ANTLR start "rule__SkillDefinition__Group_3__3__Impl"
    // InternalSkillDefinition.g:1538:1: rule__SkillDefinition__Group_3__3__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1542:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1543:1: ( '}' )
            {
            // InternalSkillDefinition.g:1543:1: ( '}' )
            // InternalSkillDefinition.g:1544:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_3__3__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_4__0"
    // InternalSkillDefinition.g:1554:1: rule__SkillDefinition__Group_4__0 : rule__SkillDefinition__Group_4__0__Impl rule__SkillDefinition__Group_4__1 ;
    public final void rule__SkillDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1558:1: ( rule__SkillDefinition__Group_4__0__Impl rule__SkillDefinition__Group_4__1 )
            // InternalSkillDefinition.g:1559:2: rule__SkillDefinition__Group_4__0__Impl rule__SkillDefinition__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__SkillDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_4__0"


    // $ANTLR start "rule__SkillDefinition__Group_4__0__Impl"
    // InternalSkillDefinition.g:1566:1: rule__SkillDefinition__Group_4__0__Impl : ( 'out' ) ;
    public final void rule__SkillDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1570:1: ( ( 'out' ) )
            // InternalSkillDefinition.g:1571:1: ( 'out' )
            {
            // InternalSkillDefinition.g:1571:1: ( 'out' )
            // InternalSkillDefinition.g:1572:2: 'out'
            {
             before(grammarAccess.getSkillDefinitionAccess().getOutKeyword_4_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getOutKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_4__1"
    // InternalSkillDefinition.g:1581:1: rule__SkillDefinition__Group_4__1 : rule__SkillDefinition__Group_4__1__Impl rule__SkillDefinition__Group_4__2 ;
    public final void rule__SkillDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1585:1: ( rule__SkillDefinition__Group_4__1__Impl rule__SkillDefinition__Group_4__2 )
            // InternalSkillDefinition.g:1586:2: rule__SkillDefinition__Group_4__1__Impl rule__SkillDefinition__Group_4__2
            {
            pushFollow(FOLLOW_14);
            rule__SkillDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_4__1"


    // $ANTLR start "rule__SkillDefinition__Group_4__1__Impl"
    // InternalSkillDefinition.g:1593:1: rule__SkillDefinition__Group_4__1__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1597:1: ( ( '{' ) )
            // InternalSkillDefinition.g:1598:1: ( '{' )
            {
            // InternalSkillDefinition.g:1598:1: ( '{' )
            // InternalSkillDefinition.g:1599:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_4__2"
    // InternalSkillDefinition.g:1608:1: rule__SkillDefinition__Group_4__2 : rule__SkillDefinition__Group_4__2__Impl rule__SkillDefinition__Group_4__3 ;
    public final void rule__SkillDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1612:1: ( rule__SkillDefinition__Group_4__2__Impl rule__SkillDefinition__Group_4__3 )
            // InternalSkillDefinition.g:1613:2: rule__SkillDefinition__Group_4__2__Impl rule__SkillDefinition__Group_4__3
            {
            pushFollow(FOLLOW_14);
            rule__SkillDefinition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_4__2"


    // $ANTLR start "rule__SkillDefinition__Group_4__2__Impl"
    // InternalSkillDefinition.g:1620:1: rule__SkillDefinition__Group_4__2__Impl : ( ( rule__SkillDefinition__OutAttributeAssignment_4_2 )* ) ;
    public final void rule__SkillDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1624:1: ( ( ( rule__SkillDefinition__OutAttributeAssignment_4_2 )* ) )
            // InternalSkillDefinition.g:1625:1: ( ( rule__SkillDefinition__OutAttributeAssignment_4_2 )* )
            {
            // InternalSkillDefinition.g:1625:1: ( ( rule__SkillDefinition__OutAttributeAssignment_4_2 )* )
            // InternalSkillDefinition.g:1626:2: ( rule__SkillDefinition__OutAttributeAssignment_4_2 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getOutAttributeAssignment_4_2()); 
            // InternalSkillDefinition.g:1627:2: ( rule__SkillDefinition__OutAttributeAssignment_4_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_DOCU_COMMENT)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSkillDefinition.g:1627:3: rule__SkillDefinition__OutAttributeAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__SkillDefinition__OutAttributeAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSkillDefinitionAccess().getOutAttributeAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__SkillDefinition__Group_4__3"
    // InternalSkillDefinition.g:1635:1: rule__SkillDefinition__Group_4__3 : rule__SkillDefinition__Group_4__3__Impl ;
    public final void rule__SkillDefinition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1639:1: ( rule__SkillDefinition__Group_4__3__Impl )
            // InternalSkillDefinition.g:1640:2: rule__SkillDefinition__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillDefinition__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_4__3"


    // $ANTLR start "rule__SkillDefinition__Group_4__3__Impl"
    // InternalSkillDefinition.g:1646:1: rule__SkillDefinition__Group_4__3__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1650:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1651:1: ( '}' )
            {
            // InternalSkillDefinition.g:1651:1: ( '}' )
            // InternalSkillDefinition.g:1652:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__Group_4__3__Impl"


    // $ANTLR start "rule__SkillResult__Group__0"
    // InternalSkillDefinition.g:1662:1: rule__SkillResult__Group__0 : rule__SkillResult__Group__0__Impl rule__SkillResult__Group__1 ;
    public final void rule__SkillResult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1666:1: ( rule__SkillResult__Group__0__Impl rule__SkillResult__Group__1 )
            // InternalSkillDefinition.g:1667:2: rule__SkillResult__Group__0__Impl rule__SkillResult__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SkillResult__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillResult__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__Group__0"


    // $ANTLR start "rule__SkillResult__Group__0__Impl"
    // InternalSkillDefinition.g:1674:1: rule__SkillResult__Group__0__Impl : ( ( rule__SkillResult__ResultAssignment_0 ) ) ;
    public final void rule__SkillResult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1678:1: ( ( ( rule__SkillResult__ResultAssignment_0 ) ) )
            // InternalSkillDefinition.g:1679:1: ( ( rule__SkillResult__ResultAssignment_0 ) )
            {
            // InternalSkillDefinition.g:1679:1: ( ( rule__SkillResult__ResultAssignment_0 ) )
            // InternalSkillDefinition.g:1680:2: ( rule__SkillResult__ResultAssignment_0 )
            {
             before(grammarAccess.getSkillResultAccess().getResultAssignment_0()); 
            // InternalSkillDefinition.g:1681:2: ( rule__SkillResult__ResultAssignment_0 )
            // InternalSkillDefinition.g:1681:3: rule__SkillResult__ResultAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__SkillResult__ResultAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSkillResultAccess().getResultAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__Group__0__Impl"


    // $ANTLR start "rule__SkillResult__Group__1"
    // InternalSkillDefinition.g:1689:1: rule__SkillResult__Group__1 : rule__SkillResult__Group__1__Impl rule__SkillResult__Group__2 ;
    public final void rule__SkillResult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1693:1: ( rule__SkillResult__Group__1__Impl rule__SkillResult__Group__2 )
            // InternalSkillDefinition.g:1694:2: rule__SkillResult__Group__1__Impl rule__SkillResult__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__SkillResult__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillResult__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__Group__1"


    // $ANTLR start "rule__SkillResult__Group__1__Impl"
    // InternalSkillDefinition.g:1701:1: rule__SkillResult__Group__1__Impl : ( 'value' ) ;
    public final void rule__SkillResult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1705:1: ( ( 'value' ) )
            // InternalSkillDefinition.g:1706:1: ( 'value' )
            {
            // InternalSkillDefinition.g:1706:1: ( 'value' )
            // InternalSkillDefinition.g:1707:2: 'value'
            {
             before(grammarAccess.getSkillResultAccess().getValueKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSkillResultAccess().getValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__Group__1__Impl"


    // $ANTLR start "rule__SkillResult__Group__2"
    // InternalSkillDefinition.g:1716:1: rule__SkillResult__Group__2 : rule__SkillResult__Group__2__Impl rule__SkillResult__Group__3 ;
    public final void rule__SkillResult__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1720:1: ( rule__SkillResult__Group__2__Impl rule__SkillResult__Group__3 )
            // InternalSkillDefinition.g:1721:2: rule__SkillResult__Group__2__Impl rule__SkillResult__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__SkillResult__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillResult__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__Group__2"


    // $ANTLR start "rule__SkillResult__Group__2__Impl"
    // InternalSkillDefinition.g:1728:1: rule__SkillResult__Group__2__Impl : ( '=' ) ;
    public final void rule__SkillResult__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1732:1: ( ( '=' ) )
            // InternalSkillDefinition.g:1733:1: ( '=' )
            {
            // InternalSkillDefinition.g:1733:1: ( '=' )
            // InternalSkillDefinition.g:1734:2: '='
            {
             before(grammarAccess.getSkillResultAccess().getEqualsSignKeyword_2()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSkillResultAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__Group__2__Impl"


    // $ANTLR start "rule__SkillResult__Group__3"
    // InternalSkillDefinition.g:1743:1: rule__SkillResult__Group__3 : rule__SkillResult__Group__3__Impl rule__SkillResult__Group__4 ;
    public final void rule__SkillResult__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1747:1: ( rule__SkillResult__Group__3__Impl rule__SkillResult__Group__4 )
            // InternalSkillDefinition.g:1748:2: rule__SkillResult__Group__3__Impl rule__SkillResult__Group__4
            {
            pushFollow(FOLLOW_19);
            rule__SkillResult__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillResult__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__Group__3"


    // $ANTLR start "rule__SkillResult__Group__3__Impl"
    // InternalSkillDefinition.g:1755:1: rule__SkillResult__Group__3__Impl : ( ( rule__SkillResult__ResultValueAssignment_3 ) ) ;
    public final void rule__SkillResult__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1759:1: ( ( ( rule__SkillResult__ResultValueAssignment_3 ) ) )
            // InternalSkillDefinition.g:1760:1: ( ( rule__SkillResult__ResultValueAssignment_3 ) )
            {
            // InternalSkillDefinition.g:1760:1: ( ( rule__SkillResult__ResultValueAssignment_3 ) )
            // InternalSkillDefinition.g:1761:2: ( rule__SkillResult__ResultValueAssignment_3 )
            {
             before(grammarAccess.getSkillResultAccess().getResultValueAssignment_3()); 
            // InternalSkillDefinition.g:1762:2: ( rule__SkillResult__ResultValueAssignment_3 )
            // InternalSkillDefinition.g:1762:3: rule__SkillResult__ResultValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SkillResult__ResultValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSkillResultAccess().getResultValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__Group__3__Impl"


    // $ANTLR start "rule__SkillResult__Group__4"
    // InternalSkillDefinition.g:1770:1: rule__SkillResult__Group__4 : rule__SkillResult__Group__4__Impl ;
    public final void rule__SkillResult__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1774:1: ( rule__SkillResult__Group__4__Impl )
            // InternalSkillDefinition.g:1775:2: rule__SkillResult__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillResult__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__Group__4"


    // $ANTLR start "rule__SkillResult__Group__4__Impl"
    // InternalSkillDefinition.g:1781:1: rule__SkillResult__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__SkillResult__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1785:1: ( ( ( ';' )? ) )
            // InternalSkillDefinition.g:1786:1: ( ( ';' )? )
            {
            // InternalSkillDefinition.g:1786:1: ( ( ';' )? )
            // InternalSkillDefinition.g:1787:2: ( ';' )?
            {
             before(grammarAccess.getSkillResultAccess().getSemicolonKeyword_4()); 
            // InternalSkillDefinition.g:1788:2: ( ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==43) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSkillDefinition.g:1788:3: ';'
                    {
                    match(input,43,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSkillResultAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__Group__4__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__0"
    // InternalSkillDefinition.g:1797:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1801:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalSkillDefinition.g:1802:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSkillDefinition.g:1809:1: rule__AttributeDefinition__Group__0__Impl : ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1813:1: ( ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? ) )
            // InternalSkillDefinition.g:1814:1: ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? )
            {
            // InternalSkillDefinition.g:1814:1: ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? )
            // InternalSkillDefinition.g:1815:2: ( rule__AttributeDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalSkillDefinition.g:1816:2: ( rule__AttributeDefinition__DocumentationAssignment_0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DOCU_COMMENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSkillDefinition.g:1816:3: rule__AttributeDefinition__DocumentationAssignment_0
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
    // InternalSkillDefinition.g:1824:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1828:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalSkillDefinition.g:1829:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalSkillDefinition.g:1836:1: rule__AttributeDefinition__Group__1__Impl : ( ( rule__AttributeDefinition__NameAssignment_1 ) ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1840:1: ( ( ( rule__AttributeDefinition__NameAssignment_1 ) ) )
            // InternalSkillDefinition.g:1841:1: ( ( rule__AttributeDefinition__NameAssignment_1 ) )
            {
            // InternalSkillDefinition.g:1841:1: ( ( rule__AttributeDefinition__NameAssignment_1 ) )
            // InternalSkillDefinition.g:1842:2: ( rule__AttributeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_1()); 
            // InternalSkillDefinition.g:1843:2: ( rule__AttributeDefinition__NameAssignment_1 )
            // InternalSkillDefinition.g:1843:3: rule__AttributeDefinition__NameAssignment_1
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
    // InternalSkillDefinition.g:1851:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1855:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalSkillDefinition.g:1856:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalSkillDefinition.g:1863:1: rule__AttributeDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1867:1: ( ( ':' ) )
            // InternalSkillDefinition.g:1868:1: ( ':' )
            {
            // InternalSkillDefinition.g:1868:1: ( ':' )
            // InternalSkillDefinition.g:1869:2: ':'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1878:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1882:1: ( rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 )
            // InternalSkillDefinition.g:1883:2: rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4
            {
            pushFollow(FOLLOW_23);
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
    // InternalSkillDefinition.g:1890:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__TypeAssignment_3 ) ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1894:1: ( ( ( rule__AttributeDefinition__TypeAssignment_3 ) ) )
            // InternalSkillDefinition.g:1895:1: ( ( rule__AttributeDefinition__TypeAssignment_3 ) )
            {
            // InternalSkillDefinition.g:1895:1: ( ( rule__AttributeDefinition__TypeAssignment_3 ) )
            // InternalSkillDefinition.g:1896:2: ( rule__AttributeDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_3()); 
            // InternalSkillDefinition.g:1897:2: ( rule__AttributeDefinition__TypeAssignment_3 )
            // InternalSkillDefinition.g:1897:3: rule__AttributeDefinition__TypeAssignment_3
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
    // InternalSkillDefinition.g:1905:1: rule__AttributeDefinition__Group__4 : rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5 ;
    public final void rule__AttributeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1909:1: ( rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5 )
            // InternalSkillDefinition.g:1910:2: rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5
            {
            pushFollow(FOLLOW_23);
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
    // InternalSkillDefinition.g:1917:1: rule__AttributeDefinition__Group__4__Impl : ( ( rule__AttributeDefinition__Group_4__0 )? ) ;
    public final void rule__AttributeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1921:1: ( ( ( rule__AttributeDefinition__Group_4__0 )? ) )
            // InternalSkillDefinition.g:1922:1: ( ( rule__AttributeDefinition__Group_4__0 )? )
            {
            // InternalSkillDefinition.g:1922:1: ( ( rule__AttributeDefinition__Group_4__0 )? )
            // InternalSkillDefinition.g:1923:2: ( rule__AttributeDefinition__Group_4__0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup_4()); 
            // InternalSkillDefinition.g:1924:2: ( rule__AttributeDefinition__Group_4__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSkillDefinition.g:1924:3: rule__AttributeDefinition__Group_4__0
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
    // InternalSkillDefinition.g:1932:1: rule__AttributeDefinition__Group__5 : rule__AttributeDefinition__Group__5__Impl ;
    public final void rule__AttributeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1936:1: ( rule__AttributeDefinition__Group__5__Impl )
            // InternalSkillDefinition.g:1937:2: rule__AttributeDefinition__Group__5__Impl
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
    // InternalSkillDefinition.g:1943:1: rule__AttributeDefinition__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__AttributeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1947:1: ( ( ( ';' )? ) )
            // InternalSkillDefinition.g:1948:1: ( ( ';' )? )
            {
            // InternalSkillDefinition.g:1948:1: ( ( ';' )? )
            // InternalSkillDefinition.g:1949:2: ( ';' )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5()); 
            // InternalSkillDefinition.g:1950:2: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==43) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSkillDefinition.g:1950:3: ';'
                    {
                    match(input,43,FOLLOW_2); 

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
    // InternalSkillDefinition.g:1959:1: rule__AttributeDefinition__Group_4__0 : rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1 ;
    public final void rule__AttributeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1963:1: ( rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1 )
            // InternalSkillDefinition.g:1964:2: rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSkillDefinition.g:1971:1: rule__AttributeDefinition__Group_4__0__Impl : ( '=' ) ;
    public final void rule__AttributeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1975:1: ( ( '=' ) )
            // InternalSkillDefinition.g:1976:1: ( '=' )
            {
            // InternalSkillDefinition.g:1976:1: ( '=' )
            // InternalSkillDefinition.g:1977:2: '='
            {
             before(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1986:1: rule__AttributeDefinition__Group_4__1 : rule__AttributeDefinition__Group_4__1__Impl ;
    public final void rule__AttributeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1990:1: ( rule__AttributeDefinition__Group_4__1__Impl )
            // InternalSkillDefinition.g:1991:2: rule__AttributeDefinition__Group_4__1__Impl
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
    // InternalSkillDefinition.g:1997:1: rule__AttributeDefinition__Group_4__1__Impl : ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) ) ;
    public final void rule__AttributeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2001:1: ( ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) ) )
            // InternalSkillDefinition.g:2002:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) )
            {
            // InternalSkillDefinition.g:2002:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) )
            // InternalSkillDefinition.g:2003:2: ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_4_1()); 
            // InternalSkillDefinition.g:2004:2: ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 )
            // InternalSkillDefinition.g:2004:3: rule__AttributeDefinition__DefaultvalueAssignment_4_1
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
    // InternalSkillDefinition.g:2013:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2017:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSkillDefinition.g:2018:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalSkillDefinition.g:2025:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2029:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:2030:1: ( RULE_ID )
            {
            // InternalSkillDefinition.g:2030:1: ( RULE_ID )
            // InternalSkillDefinition.g:2031:2: RULE_ID
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
    // InternalSkillDefinition.g:2040:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2044:1: ( rule__FQN__Group__1__Impl )
            // InternalSkillDefinition.g:2045:2: rule__FQN__Group__1__Impl
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
    // InternalSkillDefinition.g:2051:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2055:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSkillDefinition.g:2056:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSkillDefinition.g:2056:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSkillDefinition.g:2057:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSkillDefinition.g:2058:2: ( rule__FQN__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==45) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalSkillDefinition.g:2058:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_26);
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
    // InternalSkillDefinition.g:2067:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2071:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSkillDefinition.g:2072:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalSkillDefinition.g:2079:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2083:1: ( ( '.' ) )
            // InternalSkillDefinition.g:2084:1: ( '.' )
            {
            // InternalSkillDefinition.g:2084:1: ( '.' )
            // InternalSkillDefinition.g:2085:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2094:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2098:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSkillDefinition.g:2099:2: rule__FQN__Group_1__1__Impl
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
    // InternalSkillDefinition.g:2105:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2109:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:2110:1: ( RULE_ID )
            {
            // InternalSkillDefinition.g:2110:1: ( RULE_ID )
            // InternalSkillDefinition.g:2111:2: RULE_ID
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
    // InternalSkillDefinition.g:2121:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2125:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSkillDefinition.g:2126:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSkillDefinition.g:2133:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2137:1: ( ( ( '-' )? ) )
            // InternalSkillDefinition.g:2138:1: ( ( '-' )? )
            {
            // InternalSkillDefinition.g:2138:1: ( ( '-' )? )
            // InternalSkillDefinition.g:2139:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSkillDefinition.g:2140:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==46) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSkillDefinition.g:2140:3: '-'
                    {
                    match(input,46,FOLLOW_2); 

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
    // InternalSkillDefinition.g:2148:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2152:1: ( rule__EInt__Group__1__Impl )
            // InternalSkillDefinition.g:2153:2: rule__EInt__Group__1__Impl
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
    // InternalSkillDefinition.g:2159:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2163:1: ( ( RULE_INT ) )
            // InternalSkillDefinition.g:2164:1: ( RULE_INT )
            {
            // InternalSkillDefinition.g:2164:1: ( RULE_INT )
            // InternalSkillDefinition.g:2165:2: RULE_INT
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
    // InternalSkillDefinition.g:2175:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2179:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalSkillDefinition.g:2180:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSkillDefinition.g:2187:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2191:1: ( ( ( '-' )? ) )
            // InternalSkillDefinition.g:2192:1: ( ( '-' )? )
            {
            // InternalSkillDefinition.g:2192:1: ( ( '-' )? )
            // InternalSkillDefinition.g:2193:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalSkillDefinition.g:2194:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==46) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSkillDefinition.g:2194:3: '-'
                    {
                    match(input,46,FOLLOW_2); 

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
    // InternalSkillDefinition.g:2202:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2206:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalSkillDefinition.g:2207:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_28);
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
    // InternalSkillDefinition.g:2214:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2218:1: ( ( ( RULE_INT )? ) )
            // InternalSkillDefinition.g:2219:1: ( ( RULE_INT )? )
            {
            // InternalSkillDefinition.g:2219:1: ( ( RULE_INT )? )
            // InternalSkillDefinition.g:2220:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalSkillDefinition.g:2221:2: ( RULE_INT )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_INT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSkillDefinition.g:2221:3: RULE_INT
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
    // InternalSkillDefinition.g:2229:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2233:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalSkillDefinition.g:2234:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalSkillDefinition.g:2241:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2245:1: ( ( '.' ) )
            // InternalSkillDefinition.g:2246:1: ( '.' )
            {
            // InternalSkillDefinition.g:2246:1: ( '.' )
            // InternalSkillDefinition.g:2247:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2256:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2260:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalSkillDefinition.g:2261:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalSkillDefinition.g:2268:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2272:1: ( ( RULE_INT ) )
            // InternalSkillDefinition.g:2273:1: ( RULE_INT )
            {
            // InternalSkillDefinition.g:2273:1: ( RULE_INT )
            // InternalSkillDefinition.g:2274:2: RULE_INT
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
    // InternalSkillDefinition.g:2283:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2287:1: ( rule__EDouble__Group__4__Impl )
            // InternalSkillDefinition.g:2288:2: rule__EDouble__Group__4__Impl
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
    // InternalSkillDefinition.g:2294:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2298:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalSkillDefinition.g:2299:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalSkillDefinition.g:2299:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalSkillDefinition.g:2300:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalSkillDefinition.g:2301:2: ( rule__EDouble__Group_4__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=16 && LA25_0<=17)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSkillDefinition.g:2301:3: rule__EDouble__Group_4__0
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
    // InternalSkillDefinition.g:2310:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2314:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalSkillDefinition.g:2315:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSkillDefinition.g:2322:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2326:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalSkillDefinition.g:2327:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalSkillDefinition.g:2327:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalSkillDefinition.g:2328:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalSkillDefinition.g:2329:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalSkillDefinition.g:2329:3: rule__EDouble__Alternatives_4_0
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
    // InternalSkillDefinition.g:2337:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2341:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalSkillDefinition.g:2342:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSkillDefinition.g:2349:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2353:1: ( ( ( '-' )? ) )
            // InternalSkillDefinition.g:2354:1: ( ( '-' )? )
            {
            // InternalSkillDefinition.g:2354:1: ( ( '-' )? )
            // InternalSkillDefinition.g:2355:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalSkillDefinition.g:2356:2: ( '-' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==46) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSkillDefinition.g:2356:3: '-'
                    {
                    match(input,46,FOLLOW_2); 

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
    // InternalSkillDefinition.g:2364:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2368:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalSkillDefinition.g:2369:2: rule__EDouble__Group_4__2__Impl
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
    // InternalSkillDefinition.g:2375:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2379:1: ( ( RULE_INT ) )
            // InternalSkillDefinition.g:2380:1: ( RULE_INT )
            {
            // InternalSkillDefinition.g:2380:1: ( RULE_INT )
            // InternalSkillDefinition.g:2381:2: RULE_INT
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
    // InternalSkillDefinition.g:2391:1: rule__EnumerationElement__Group__0 : rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 ;
    public final void rule__EnumerationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2395:1: ( rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 )
            // InternalSkillDefinition.g:2396:2: rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSkillDefinition.g:2403:1: rule__EnumerationElement__Group__0__Impl : ( ( rule__EnumerationElement__NameAssignment_0 ) ) ;
    public final void rule__EnumerationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2407:1: ( ( ( rule__EnumerationElement__NameAssignment_0 ) ) )
            // InternalSkillDefinition.g:2408:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            {
            // InternalSkillDefinition.g:2408:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            // InternalSkillDefinition.g:2409:2: ( rule__EnumerationElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 
            // InternalSkillDefinition.g:2410:2: ( rule__EnumerationElement__NameAssignment_0 )
            // InternalSkillDefinition.g:2410:3: rule__EnumerationElement__NameAssignment_0
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
    // InternalSkillDefinition.g:2418:1: rule__EnumerationElement__Group__1 : rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 ;
    public final void rule__EnumerationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2422:1: ( rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 )
            // InternalSkillDefinition.g:2423:2: rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSkillDefinition.g:2430:1: rule__EnumerationElement__Group__1__Impl : ( ( rule__EnumerationElement__Group_1__0 )? ) ;
    public final void rule__EnumerationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2434:1: ( ( ( rule__EnumerationElement__Group_1__0 )? ) )
            // InternalSkillDefinition.g:2435:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            {
            // InternalSkillDefinition.g:2435:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            // InternalSkillDefinition.g:2436:2: ( rule__EnumerationElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup_1()); 
            // InternalSkillDefinition.g:2437:2: ( rule__EnumerationElement__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSkillDefinition.g:2437:3: rule__EnumerationElement__Group_1__0
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
    // InternalSkillDefinition.g:2445:1: rule__EnumerationElement__Group__2 : rule__EnumerationElement__Group__2__Impl ;
    public final void rule__EnumerationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2449:1: ( rule__EnumerationElement__Group__2__Impl )
            // InternalSkillDefinition.g:2450:2: rule__EnumerationElement__Group__2__Impl
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
    // InternalSkillDefinition.g:2456:1: rule__EnumerationElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__EnumerationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2460:1: ( ( ( ';' )? ) )
            // InternalSkillDefinition.g:2461:1: ( ( ';' )? )
            {
            // InternalSkillDefinition.g:2461:1: ( ( ';' )? )
            // InternalSkillDefinition.g:2462:2: ( ';' )?
            {
             before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 
            // InternalSkillDefinition.g:2463:2: ( ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==43) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSkillDefinition.g:2463:3: ';'
                    {
                    match(input,43,FOLLOW_2); 

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
    // InternalSkillDefinition.g:2472:1: rule__EnumerationElement__Group_1__0 : rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 ;
    public final void rule__EnumerationElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2476:1: ( rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 )
            // InternalSkillDefinition.g:2477:2: rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSkillDefinition.g:2484:1: rule__EnumerationElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2488:1: ( ( '=' ) )
            // InternalSkillDefinition.g:2489:1: ( '=' )
            {
            // InternalSkillDefinition.g:2489:1: ( '=' )
            // InternalSkillDefinition.g:2490:2: '='
            {
             before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2499:1: rule__EnumerationElement__Group_1__1 : rule__EnumerationElement__Group_1__1__Impl ;
    public final void rule__EnumerationElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2503:1: ( rule__EnumerationElement__Group_1__1__Impl )
            // InternalSkillDefinition.g:2504:2: rule__EnumerationElement__Group_1__1__Impl
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
    // InternalSkillDefinition.g:2510:1: rule__EnumerationElement__Group_1__1__Impl : ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2514:1: ( ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) )
            // InternalSkillDefinition.g:2515:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            {
            // InternalSkillDefinition.g:2515:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            // InternalSkillDefinition.g:2516:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 
            // InternalSkillDefinition.g:2517:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            // InternalSkillDefinition.g:2517:3: rule__EnumerationElement__ValueAssignment_1_1
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
    // InternalSkillDefinition.g:2526:1: rule__InlineEnumerationType__Group__0 : rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 ;
    public final void rule__InlineEnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2530:1: ( rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 )
            // InternalSkillDefinition.g:2531:2: rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSkillDefinition.g:2538:1: rule__InlineEnumerationType__Group__0__Impl : ( 'InlineEnumeration' ) ;
    public final void rule__InlineEnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2542:1: ( ( 'InlineEnumeration' ) )
            // InternalSkillDefinition.g:2543:1: ( 'InlineEnumeration' )
            {
            // InternalSkillDefinition.g:2543:1: ( 'InlineEnumeration' )
            // InternalSkillDefinition.g:2544:2: 'InlineEnumeration'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2553:1: rule__InlineEnumerationType__Group__1 : rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 ;
    public final void rule__InlineEnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2557:1: ( rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 )
            // InternalSkillDefinition.g:2558:2: rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalSkillDefinition.g:2565:1: rule__InlineEnumerationType__Group__1__Impl : ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) ;
    public final void rule__InlineEnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2569:1: ( ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) )
            // InternalSkillDefinition.g:2570:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            {
            // InternalSkillDefinition.g:2570:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            // InternalSkillDefinition.g:2571:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 
            // InternalSkillDefinition.g:2572:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==48) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalSkillDefinition.g:2572:3: rule__InlineEnumerationType__ArrayAssignment_1
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
    // InternalSkillDefinition.g:2580:1: rule__InlineEnumerationType__Group__2 : rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 ;
    public final void rule__InlineEnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2584:1: ( rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 )
            // InternalSkillDefinition.g:2585:2: rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3
            {
            pushFollow(FOLLOW_4);
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
    // InternalSkillDefinition.g:2592:1: rule__InlineEnumerationType__Group__2__Impl : ( '{' ) ;
    public final void rule__InlineEnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2596:1: ( ( '{' ) )
            // InternalSkillDefinition.g:2597:1: ( '{' )
            {
            // InternalSkillDefinition.g:2597:1: ( '{' )
            // InternalSkillDefinition.g:2598:2: '{'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2607:1: rule__InlineEnumerationType__Group__3 : rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 ;
    public final void rule__InlineEnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2611:1: ( rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 )
            // InternalSkillDefinition.g:2612:2: rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4
            {
            pushFollow(FOLLOW_12);
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
    // InternalSkillDefinition.g:2619:1: rule__InlineEnumerationType__Group__3__Impl : ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) ;
    public final void rule__InlineEnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2623:1: ( ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) )
            // InternalSkillDefinition.g:2624:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            {
            // InternalSkillDefinition.g:2624:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            // InternalSkillDefinition.g:2625:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            {
            // InternalSkillDefinition.g:2625:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) )
            // InternalSkillDefinition.g:2626:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalSkillDefinition.g:2627:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            // InternalSkillDefinition.g:2627:4: rule__InlineEnumerationType__EnumsAssignment_3
            {
            pushFollow(FOLLOW_32);
            rule__InlineEnumerationType__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }

            // InternalSkillDefinition.g:2630:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            // InternalSkillDefinition.g:2631:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalSkillDefinition.g:2632:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalSkillDefinition.g:2632:4: rule__InlineEnumerationType__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_32);
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
    // InternalSkillDefinition.g:2641:1: rule__InlineEnumerationType__Group__4 : rule__InlineEnumerationType__Group__4__Impl ;
    public final void rule__InlineEnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2645:1: ( rule__InlineEnumerationType__Group__4__Impl )
            // InternalSkillDefinition.g:2646:2: rule__InlineEnumerationType__Group__4__Impl
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
    // InternalSkillDefinition.g:2652:1: rule__InlineEnumerationType__Group__4__Impl : ( '}' ) ;
    public final void rule__InlineEnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2656:1: ( ( '}' ) )
            // InternalSkillDefinition.g:2657:1: ( '}' )
            {
            // InternalSkillDefinition.g:2657:1: ( '}' )
            // InternalSkillDefinition.g:2658:2: '}'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2668:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2672:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalSkillDefinition.g:2673:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSkillDefinition.g:2680:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2684:1: ( ( () ) )
            // InternalSkillDefinition.g:2685:1: ( () )
            {
            // InternalSkillDefinition.g:2685:1: ( () )
            // InternalSkillDefinition.g:2686:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // InternalSkillDefinition.g:2687:2: ()
            // InternalSkillDefinition.g:2687:3: 
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
    // InternalSkillDefinition.g:2695:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2699:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalSkillDefinition.g:2700:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalSkillDefinition.g:2707:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2711:1: ( ( '[' ) )
            // InternalSkillDefinition.g:2712:1: ( '[' )
            {
            // InternalSkillDefinition.g:2712:1: ( '[' )
            // InternalSkillDefinition.g:2713:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2722:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2726:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalSkillDefinition.g:2727:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalSkillDefinition.g:2734:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__LengthAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2738:1: ( ( ( rule__ArrayType__LengthAssignment_2 )? ) )
            // InternalSkillDefinition.g:2739:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            {
            // InternalSkillDefinition.g:2739:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            // InternalSkillDefinition.g:2740:2: ( rule__ArrayType__LengthAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 
            // InternalSkillDefinition.g:2741:2: ( rule__ArrayType__LengthAssignment_2 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_INT||LA31_0==18) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSkillDefinition.g:2741:3: rule__ArrayType__LengthAssignment_2
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
    // InternalSkillDefinition.g:2749:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2753:1: ( rule__ArrayType__Group__3__Impl )
            // InternalSkillDefinition.g:2754:2: rule__ArrayType__Group__3__Impl
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
    // InternalSkillDefinition.g:2760:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2764:1: ( ( ']' ) )
            // InternalSkillDefinition.g:2765:1: ( ']' )
            {
            // InternalSkillDefinition.g:2765:1: ( ']' )
            // InternalSkillDefinition.g:2766:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2776:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2780:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalSkillDefinition.g:2781:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSkillDefinition.g:2788:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2792:1: ( ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) )
            // InternalSkillDefinition.g:2793:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            {
            // InternalSkillDefinition.g:2793:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            // InternalSkillDefinition.g:2794:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 
            // InternalSkillDefinition.g:2795:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            // InternalSkillDefinition.g:2795:3: rule__PrimitiveType__TypeNameAssignment_0
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
    // InternalSkillDefinition.g:2803:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2807:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalSkillDefinition.g:2808:2: rule__PrimitiveType__Group__1__Impl
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
    // InternalSkillDefinition.g:2814:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2818:1: ( ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) )
            // InternalSkillDefinition.g:2819:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            {
            // InternalSkillDefinition.g:2819:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            // InternalSkillDefinition.g:2820:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 
            // InternalSkillDefinition.g:2821:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==48) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalSkillDefinition.g:2821:3: rule__PrimitiveType__ArrayAssignment_1
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
    // InternalSkillDefinition.g:2830:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2834:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalSkillDefinition.g:2835:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSkillDefinition.g:2842:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2846:1: ( ( '[' ) )
            // InternalSkillDefinition.g:2847:1: ( '[' )
            {
            // InternalSkillDefinition.g:2847:1: ( '[' )
            // InternalSkillDefinition.g:2848:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2857:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2861:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalSkillDefinition.g:2862:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalSkillDefinition.g:2869:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2873:1: ( ( ( rule__ArrayValue__ValuesAssignment_1 ) ) )
            // InternalSkillDefinition.g:2874:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            {
            // InternalSkillDefinition.g:2874:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            // InternalSkillDefinition.g:2875:2: ( rule__ArrayValue__ValuesAssignment_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 
            // InternalSkillDefinition.g:2876:2: ( rule__ArrayValue__ValuesAssignment_1 )
            // InternalSkillDefinition.g:2876:3: rule__ArrayValue__ValuesAssignment_1
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
    // InternalSkillDefinition.g:2884:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2888:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalSkillDefinition.g:2889:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_36);
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
    // InternalSkillDefinition.g:2896:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )* ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2900:1: ( ( ( rule__ArrayValue__Group_2__0 )* ) )
            // InternalSkillDefinition.g:2901:1: ( ( rule__ArrayValue__Group_2__0 )* )
            {
            // InternalSkillDefinition.g:2901:1: ( ( rule__ArrayValue__Group_2__0 )* )
            // InternalSkillDefinition.g:2902:2: ( rule__ArrayValue__Group_2__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalSkillDefinition.g:2903:2: ( rule__ArrayValue__Group_2__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==50) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalSkillDefinition.g:2903:3: rule__ArrayValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_37);
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
    // InternalSkillDefinition.g:2911:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2915:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalSkillDefinition.g:2916:2: rule__ArrayValue__Group__3__Impl
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
    // InternalSkillDefinition.g:2922:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2926:1: ( ( ']' ) )
            // InternalSkillDefinition.g:2927:1: ( ']' )
            {
            // InternalSkillDefinition.g:2927:1: ( ']' )
            // InternalSkillDefinition.g:2928:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,49,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2938:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2942:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalSkillDefinition.g:2943:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSkillDefinition.g:2950:1: rule__ArrayValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2954:1: ( ( ',' ) )
            // InternalSkillDefinition.g:2955:1: ( ',' )
            {
            // InternalSkillDefinition.g:2955:1: ( ',' )
            // InternalSkillDefinition.g:2956:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2965:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2969:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalSkillDefinition.g:2970:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalSkillDefinition.g:2976:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2980:1: ( ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) )
            // InternalSkillDefinition.g:2981:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            {
            // InternalSkillDefinition.g:2981:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            // InternalSkillDefinition.g:2982:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 
            // InternalSkillDefinition.g:2983:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            // InternalSkillDefinition.g:2983:3: rule__ArrayValue__ValuesAssignment_2_1
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
    // InternalSkillDefinition.g:2992:1: rule__SingleValue__Group_0__0 : rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 ;
    public final void rule__SingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2996:1: ( rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 )
            // InternalSkillDefinition.g:2997:2: rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSkillDefinition.g:3004:1: rule__SingleValue__Group_0__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3008:1: ( ( () ) )
            // InternalSkillDefinition.g:3009:1: ( () )
            {
            // InternalSkillDefinition.g:3009:1: ( () )
            // InternalSkillDefinition.g:3010:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); 
            // InternalSkillDefinition.g:3011:2: ()
            // InternalSkillDefinition.g:3011:3: 
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
    // InternalSkillDefinition.g:3019:1: rule__SingleValue__Group_0__1 : rule__SingleValue__Group_0__1__Impl ;
    public final void rule__SingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3023:1: ( rule__SingleValue__Group_0__1__Impl )
            // InternalSkillDefinition.g:3024:2: rule__SingleValue__Group_0__1__Impl
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
    // InternalSkillDefinition.g:3030:1: rule__SingleValue__Group_0__1__Impl : ( ( rule__SingleValue__ValueAssignment_0_1 ) ) ;
    public final void rule__SingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3034:1: ( ( ( rule__SingleValue__ValueAssignment_0_1 ) ) )
            // InternalSkillDefinition.g:3035:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            {
            // InternalSkillDefinition.g:3035:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            // InternalSkillDefinition.g:3036:2: ( rule__SingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 
            // InternalSkillDefinition.g:3037:2: ( rule__SingleValue__ValueAssignment_0_1 )
            // InternalSkillDefinition.g:3037:3: rule__SingleValue__ValueAssignment_0_1
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
    // InternalSkillDefinition.g:3046:1: rule__SingleValue__Group_1__0 : rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 ;
    public final void rule__SingleValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3050:1: ( rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 )
            // InternalSkillDefinition.g:3051:2: rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSkillDefinition.g:3058:1: rule__SingleValue__Group_1__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3062:1: ( ( () ) )
            // InternalSkillDefinition.g:3063:1: ( () )
            {
            // InternalSkillDefinition.g:3063:1: ( () )
            // InternalSkillDefinition.g:3064:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); 
            // InternalSkillDefinition.g:3065:2: ()
            // InternalSkillDefinition.g:3065:3: 
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
    // InternalSkillDefinition.g:3073:1: rule__SingleValue__Group_1__1 : rule__SingleValue__Group_1__1__Impl ;
    public final void rule__SingleValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3077:1: ( rule__SingleValue__Group_1__1__Impl )
            // InternalSkillDefinition.g:3078:2: rule__SingleValue__Group_1__1__Impl
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
    // InternalSkillDefinition.g:3084:1: rule__SingleValue__Group_1__1__Impl : ( ( rule__SingleValue__ValueAssignment_1_1 ) ) ;
    public final void rule__SingleValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3088:1: ( ( ( rule__SingleValue__ValueAssignment_1_1 ) ) )
            // InternalSkillDefinition.g:3089:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            {
            // InternalSkillDefinition.g:3089:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            // InternalSkillDefinition.g:3090:2: ( rule__SingleValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); 
            // InternalSkillDefinition.g:3091:2: ( rule__SingleValue__ValueAssignment_1_1 )
            // InternalSkillDefinition.g:3091:3: rule__SingleValue__ValueAssignment_1_1
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
    // InternalSkillDefinition.g:3100:1: rule__SingleValue__Group_2__0 : rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 ;
    public final void rule__SingleValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3104:1: ( rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 )
            // InternalSkillDefinition.g:3105:2: rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1
            {
            pushFollow(FOLLOW_18);
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
    // InternalSkillDefinition.g:3112:1: rule__SingleValue__Group_2__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3116:1: ( ( () ) )
            // InternalSkillDefinition.g:3117:1: ( () )
            {
            // InternalSkillDefinition.g:3117:1: ( () )
            // InternalSkillDefinition.g:3118:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); 
            // InternalSkillDefinition.g:3119:2: ()
            // InternalSkillDefinition.g:3119:3: 
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
    // InternalSkillDefinition.g:3127:1: rule__SingleValue__Group_2__1 : rule__SingleValue__Group_2__1__Impl ;
    public final void rule__SingleValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3131:1: ( rule__SingleValue__Group_2__1__Impl )
            // InternalSkillDefinition.g:3132:2: rule__SingleValue__Group_2__1__Impl
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
    // InternalSkillDefinition.g:3138:1: rule__SingleValue__Group_2__1__Impl : ( ( rule__SingleValue__ValueAssignment_2_1 ) ) ;
    public final void rule__SingleValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3142:1: ( ( ( rule__SingleValue__ValueAssignment_2_1 ) ) )
            // InternalSkillDefinition.g:3143:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            {
            // InternalSkillDefinition.g:3143:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            // InternalSkillDefinition.g:3144:2: ( rule__SingleValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); 
            // InternalSkillDefinition.g:3145:2: ( rule__SingleValue__ValueAssignment_2_1 )
            // InternalSkillDefinition.g:3145:3: rule__SingleValue__ValueAssignment_2_1
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
    // InternalSkillDefinition.g:3154:1: rule__SingleValue__Group_3__0 : rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 ;
    public final void rule__SingleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3158:1: ( rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 )
            // InternalSkillDefinition.g:3159:2: rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalSkillDefinition.g:3166:1: rule__SingleValue__Group_3__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3170:1: ( ( () ) )
            // InternalSkillDefinition.g:3171:1: ( () )
            {
            // InternalSkillDefinition.g:3171:1: ( () )
            // InternalSkillDefinition.g:3172:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); 
            // InternalSkillDefinition.g:3173:2: ()
            // InternalSkillDefinition.g:3173:3: 
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
    // InternalSkillDefinition.g:3181:1: rule__SingleValue__Group_3__1 : rule__SingleValue__Group_3__1__Impl ;
    public final void rule__SingleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3185:1: ( rule__SingleValue__Group_3__1__Impl )
            // InternalSkillDefinition.g:3186:2: rule__SingleValue__Group_3__1__Impl
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
    // InternalSkillDefinition.g:3192:1: rule__SingleValue__Group_3__1__Impl : ( ( rule__SingleValue__ValueAssignment_3_1 ) ) ;
    public final void rule__SingleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3196:1: ( ( ( rule__SingleValue__ValueAssignment_3_1 ) ) )
            // InternalSkillDefinition.g:3197:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            {
            // InternalSkillDefinition.g:3197:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            // InternalSkillDefinition.g:3198:2: ( rule__SingleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); 
            // InternalSkillDefinition.g:3199:2: ( rule__SingleValue__ValueAssignment_3_1 )
            // InternalSkillDefinition.g:3199:3: rule__SingleValue__ValueAssignment_3_1
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
    // InternalSkillDefinition.g:3208:1: rule__SingleValue__Group_4__0 : rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 ;
    public final void rule__SingleValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3212:1: ( rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 )
            // InternalSkillDefinition.g:3213:2: rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalSkillDefinition.g:3220:1: rule__SingleValue__Group_4__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3224:1: ( ( () ) )
            // InternalSkillDefinition.g:3225:1: ( () )
            {
            // InternalSkillDefinition.g:3225:1: ( () )
            // InternalSkillDefinition.g:3226:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); 
            // InternalSkillDefinition.g:3227:2: ()
            // InternalSkillDefinition.g:3227:3: 
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
    // InternalSkillDefinition.g:3235:1: rule__SingleValue__Group_4__1 : rule__SingleValue__Group_4__1__Impl ;
    public final void rule__SingleValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3239:1: ( rule__SingleValue__Group_4__1__Impl )
            // InternalSkillDefinition.g:3240:2: rule__SingleValue__Group_4__1__Impl
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
    // InternalSkillDefinition.g:3246:1: rule__SingleValue__Group_4__1__Impl : ( ( rule__SingleValue__ValueAssignment_4_1 ) ) ;
    public final void rule__SingleValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3250:1: ( ( ( rule__SingleValue__ValueAssignment_4_1 ) ) )
            // InternalSkillDefinition.g:3251:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            {
            // InternalSkillDefinition.g:3251:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            // InternalSkillDefinition.g:3252:2: ( rule__SingleValue__ValueAssignment_4_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); 
            // InternalSkillDefinition.g:3253:2: ( rule__SingleValue__ValueAssignment_4_1 )
            // InternalSkillDefinition.g:3253:3: rule__SingleValue__ValueAssignment_4_1
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


    // $ANTLR start "rule__SkillDefinitionModel__RepositoryAssignment_1"
    // InternalSkillDefinition.g:3262:1: rule__SkillDefinitionModel__RepositoryAssignment_1 : ( ruleSkillDefinitionRepository ) ;
    public final void rule__SkillDefinitionModel__RepositoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3266:1: ( ( ruleSkillDefinitionRepository ) )
            // InternalSkillDefinition.g:3267:2: ( ruleSkillDefinitionRepository )
            {
            // InternalSkillDefinition.g:3267:2: ( ruleSkillDefinitionRepository )
            // InternalSkillDefinition.g:3268:3: ruleSkillDefinitionRepository
            {
             before(grammarAccess.getSkillDefinitionModelAccess().getRepositorySkillDefinitionRepositoryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSkillDefinitionRepository();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionModelAccess().getRepositorySkillDefinitionRepositoryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionModel__RepositoryAssignment_1"


    // $ANTLR start "rule__SkillDefinitionRepository__NameAssignment_1"
    // InternalSkillDefinition.g:3277:1: rule__SkillDefinitionRepository__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SkillDefinitionRepository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3281:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:3282:2: ( RULE_ID )
            {
            // InternalSkillDefinition.g:3282:2: ( RULE_ID )
            // InternalSkillDefinition.g:3283:3: RULE_ID
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__NameAssignment_1"


    // $ANTLR start "rule__SkillDefinitionRepository__ModulesAssignment_3"
    // InternalSkillDefinition.g:3292:1: rule__SkillDefinitionRepository__ModulesAssignment_3 : ( ruleCoordinationModuleDefinition ) ;
    public final void rule__SkillDefinitionRepository__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3296:1: ( ( ruleCoordinationModuleDefinition ) )
            // InternalSkillDefinition.g:3297:2: ( ruleCoordinationModuleDefinition )
            {
            // InternalSkillDefinition.g:3297:2: ( ruleCoordinationModuleDefinition )
            // InternalSkillDefinition.g:3298:3: ruleCoordinationModuleDefinition
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getModulesCoordinationModuleDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinationModuleDefinition();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionRepositoryAccess().getModulesCoordinationModuleDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinitionRepository__ModulesAssignment_3"


    // $ANTLR start "rule__CoordinationModuleDefinition__NameAssignment_1"
    // InternalSkillDefinition.g:3307:1: rule__CoordinationModuleDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoordinationModuleDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3311:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:3312:2: ( RULE_ID )
            {
            // InternalSkillDefinition.g:3312:2: ( RULE_ID )
            // InternalSkillDefinition.g:3313:3: RULE_ID
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__NameAssignment_1"


    // $ANTLR start "rule__CoordinationModuleDefinition__SkillsAssignment_3"
    // InternalSkillDefinition.g:3322:1: rule__CoordinationModuleDefinition__SkillsAssignment_3 : ( ruleSkillDefinition ) ;
    public final void rule__CoordinationModuleDefinition__SkillsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3326:1: ( ( ruleSkillDefinition ) )
            // InternalSkillDefinition.g:3327:2: ( ruleSkillDefinition )
            {
            // InternalSkillDefinition.g:3327:2: ( ruleSkillDefinition )
            // InternalSkillDefinition.g:3328:3: ruleSkillDefinition
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getSkillsSkillDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSkillDefinition();

            state._fsp--;

             after(grammarAccess.getCoordinationModuleDefinitionAccess().getSkillsSkillDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleDefinition__SkillsAssignment_3"


    // $ANTLR start "rule__SkillDefinition__NameAssignment_1"
    // InternalSkillDefinition.g:3337:1: rule__SkillDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SkillDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3341:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:3342:2: ( RULE_ID )
            {
            // InternalSkillDefinition.g:3342:2: ( RULE_ID )
            // InternalSkillDefinition.g:3343:3: RULE_ID
            {
             before(grammarAccess.getSkillDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSkillDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__NameAssignment_1"


    // $ANTLR start "rule__SkillDefinition__InAttributeAssignment_3_2"
    // InternalSkillDefinition.g:3352:1: rule__SkillDefinition__InAttributeAssignment_3_2 : ( ruleAttributeDefinition ) ;
    public final void rule__SkillDefinition__InAttributeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3356:1: ( ( ruleAttributeDefinition ) )
            // InternalSkillDefinition.g:3357:2: ( ruleAttributeDefinition )
            {
            // InternalSkillDefinition.g:3357:2: ( ruleAttributeDefinition )
            // InternalSkillDefinition.g:3358:3: ruleAttributeDefinition
            {
             before(grammarAccess.getSkillDefinitionAccess().getInAttributeAttributeDefinitionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getInAttributeAttributeDefinitionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__InAttributeAssignment_3_2"


    // $ANTLR start "rule__SkillDefinition__OutAttributeAssignment_4_2"
    // InternalSkillDefinition.g:3367:1: rule__SkillDefinition__OutAttributeAssignment_4_2 : ( ruleAttributeDefinition ) ;
    public final void rule__SkillDefinition__OutAttributeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3371:1: ( ( ruleAttributeDefinition ) )
            // InternalSkillDefinition.g:3372:2: ( ruleAttributeDefinition )
            {
            // InternalSkillDefinition.g:3372:2: ( ruleAttributeDefinition )
            // InternalSkillDefinition.g:3373:3: ruleAttributeDefinition
            {
             before(grammarAccess.getSkillDefinitionAccess().getOutAttributeAttributeDefinitionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getOutAttributeAttributeDefinitionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__OutAttributeAssignment_4_2"


    // $ANTLR start "rule__SkillDefinition__ResultsAssignment_7"
    // InternalSkillDefinition.g:3382:1: rule__SkillDefinition__ResultsAssignment_7 : ( ruleSkillResult ) ;
    public final void rule__SkillDefinition__ResultsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3386:1: ( ( ruleSkillResult ) )
            // InternalSkillDefinition.g:3387:2: ( ruleSkillResult )
            {
            // InternalSkillDefinition.g:3387:2: ( ruleSkillResult )
            // InternalSkillDefinition.g:3388:3: ruleSkillResult
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultsSkillResultParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSkillResult();

            state._fsp--;

             after(grammarAccess.getSkillDefinitionAccess().getResultsSkillResultParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillDefinition__ResultsAssignment_7"


    // $ANTLR start "rule__SkillResult__ResultAssignment_0"
    // InternalSkillDefinition.g:3397:1: rule__SkillResult__ResultAssignment_0 : ( ruleSKILL_RESULT_TYPES ) ;
    public final void rule__SkillResult__ResultAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3401:1: ( ( ruleSKILL_RESULT_TYPES ) )
            // InternalSkillDefinition.g:3402:2: ( ruleSKILL_RESULT_TYPES )
            {
            // InternalSkillDefinition.g:3402:2: ( ruleSKILL_RESULT_TYPES )
            // InternalSkillDefinition.g:3403:3: ruleSKILL_RESULT_TYPES
            {
             before(grammarAccess.getSkillResultAccess().getResultSKILL_RESULT_TYPESEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSKILL_RESULT_TYPES();

            state._fsp--;

             after(grammarAccess.getSkillResultAccess().getResultSKILL_RESULT_TYPESEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__ResultAssignment_0"


    // $ANTLR start "rule__SkillResult__ResultValueAssignment_3"
    // InternalSkillDefinition.g:3412:1: rule__SkillResult__ResultValueAssignment_3 : ( ruleEString ) ;
    public final void rule__SkillResult__ResultValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3416:1: ( ( ruleEString ) )
            // InternalSkillDefinition.g:3417:2: ( ruleEString )
            {
            // InternalSkillDefinition.g:3417:2: ( ruleEString )
            // InternalSkillDefinition.g:3418:3: ruleEString
            {
             before(grammarAccess.getSkillResultAccess().getResultValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getSkillResultAccess().getResultValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillResult__ResultValueAssignment_3"


    // $ANTLR start "rule__AttributeDefinition__DocumentationAssignment_0"
    // InternalSkillDefinition.g:3427:1: rule__AttributeDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__AttributeDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3431:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalSkillDefinition.g:3432:2: ( RULE_DOCU_COMMENT )
            {
            // InternalSkillDefinition.g:3432:2: ( RULE_DOCU_COMMENT )
            // InternalSkillDefinition.g:3433:3: RULE_DOCU_COMMENT
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
    // InternalSkillDefinition.g:3442:1: rule__AttributeDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3446:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:3447:2: ( RULE_ID )
            {
            // InternalSkillDefinition.g:3447:2: ( RULE_ID )
            // InternalSkillDefinition.g:3448:3: RULE_ID
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
    // InternalSkillDefinition.g:3457:1: rule__AttributeDefinition__TypeAssignment_3 : ( ruleAbstractAttributeType ) ;
    public final void rule__AttributeDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3461:1: ( ( ruleAbstractAttributeType ) )
            // InternalSkillDefinition.g:3462:2: ( ruleAbstractAttributeType )
            {
            // InternalSkillDefinition.g:3462:2: ( ruleAbstractAttributeType )
            // InternalSkillDefinition.g:3463:3: ruleAbstractAttributeType
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
    // InternalSkillDefinition.g:3472:1: rule__AttributeDefinition__DefaultvalueAssignment_4_1 : ( ruleAbstractValue ) ;
    public final void rule__AttributeDefinition__DefaultvalueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3476:1: ( ( ruleAbstractValue ) )
            // InternalSkillDefinition.g:3477:2: ( ruleAbstractValue )
            {
            // InternalSkillDefinition.g:3477:2: ( ruleAbstractValue )
            // InternalSkillDefinition.g:3478:3: ruleAbstractValue
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
    // InternalSkillDefinition.g:3487:1: rule__EnumerationElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3491:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:3492:2: ( RULE_ID )
            {
            // InternalSkillDefinition.g:3492:2: ( RULE_ID )
            // InternalSkillDefinition.g:3493:3: RULE_ID
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
    // InternalSkillDefinition.g:3502:1: rule__EnumerationElement__ValueAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3506:1: ( ( ruleEInt ) )
            // InternalSkillDefinition.g:3507:2: ( ruleEInt )
            {
            // InternalSkillDefinition.g:3507:2: ( ruleEInt )
            // InternalSkillDefinition.g:3508:3: ruleEInt
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
    // InternalSkillDefinition.g:3517:1: rule__InlineEnumerationType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__InlineEnumerationType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3521:1: ( ( ruleArrayType ) )
            // InternalSkillDefinition.g:3522:2: ( ruleArrayType )
            {
            // InternalSkillDefinition.g:3522:2: ( ruleArrayType )
            // InternalSkillDefinition.g:3523:3: ruleArrayType
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
    // InternalSkillDefinition.g:3532:1: rule__InlineEnumerationType__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__InlineEnumerationType__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3536:1: ( ( ruleEnumerationElement ) )
            // InternalSkillDefinition.g:3537:2: ( ruleEnumerationElement )
            {
            // InternalSkillDefinition.g:3537:2: ( ruleEnumerationElement )
            // InternalSkillDefinition.g:3538:3: ruleEnumerationElement
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
    // InternalSkillDefinition.g:3547:1: rule__ArrayType__LengthAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ArrayType__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3551:1: ( ( ruleCardinality ) )
            // InternalSkillDefinition.g:3552:2: ( ruleCardinality )
            {
            // InternalSkillDefinition.g:3552:2: ( ruleCardinality )
            // InternalSkillDefinition.g:3553:3: ruleCardinality
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
    // InternalSkillDefinition.g:3562:1: rule__PrimitiveType__TypeNameAssignment_0 : ( rulePRIMITIVE_TYPE_NAME ) ;
    public final void rule__PrimitiveType__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3566:1: ( ( rulePRIMITIVE_TYPE_NAME ) )
            // InternalSkillDefinition.g:3567:2: ( rulePRIMITIVE_TYPE_NAME )
            {
            // InternalSkillDefinition.g:3567:2: ( rulePRIMITIVE_TYPE_NAME )
            // InternalSkillDefinition.g:3568:3: rulePRIMITIVE_TYPE_NAME
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
    // InternalSkillDefinition.g:3577:1: rule__PrimitiveType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__PrimitiveType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3581:1: ( ( ruleArrayType ) )
            // InternalSkillDefinition.g:3582:2: ( ruleArrayType )
            {
            // InternalSkillDefinition.g:3582:2: ( ruleArrayType )
            // InternalSkillDefinition.g:3583:3: ruleArrayType
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
    // InternalSkillDefinition.g:3592:1: rule__ArrayValue__ValuesAssignment_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3596:1: ( ( ruleSingleValue ) )
            // InternalSkillDefinition.g:3597:2: ( ruleSingleValue )
            {
            // InternalSkillDefinition.g:3597:2: ( ruleSingleValue )
            // InternalSkillDefinition.g:3598:3: ruleSingleValue
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
    // InternalSkillDefinition.g:3607:1: rule__ArrayValue__ValuesAssignment_2_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3611:1: ( ( ruleSingleValue ) )
            // InternalSkillDefinition.g:3612:2: ( ruleSingleValue )
            {
            // InternalSkillDefinition.g:3612:2: ( ruleSingleValue )
            // InternalSkillDefinition.g:3613:3: ruleSingleValue
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
    // InternalSkillDefinition.g:3622:1: rule__SingleValue__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__SingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3626:1: ( ( ruleEInt ) )
            // InternalSkillDefinition.g:3627:2: ( ruleEInt )
            {
            // InternalSkillDefinition.g:3627:2: ( ruleEInt )
            // InternalSkillDefinition.g:3628:3: ruleEInt
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
    // InternalSkillDefinition.g:3637:1: rule__SingleValue__ValueAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__SingleValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3641:1: ( ( ruleEDouble ) )
            // InternalSkillDefinition.g:3642:2: ( ruleEDouble )
            {
            // InternalSkillDefinition.g:3642:2: ( ruleEDouble )
            // InternalSkillDefinition.g:3643:3: ruleEDouble
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
    // InternalSkillDefinition.g:3652:1: rule__SingleValue__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__SingleValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3656:1: ( ( ruleEString ) )
            // InternalSkillDefinition.g:3657:2: ( ruleEString )
            {
            // InternalSkillDefinition.g:3657:2: ( ruleEString )
            // InternalSkillDefinition.g:3658:3: ruleEString
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
    // InternalSkillDefinition.g:3667:1: rule__SingleValue__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__SingleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3671:1: ( ( ruleEBoolean ) )
            // InternalSkillDefinition.g:3672:2: ( ruleEBoolean )
            {
            // InternalSkillDefinition.g:3672:2: ( ruleEBoolean )
            // InternalSkillDefinition.g:3673:3: ruleEBoolean
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
    // InternalSkillDefinition.g:3682:1: rule__SingleValue__ValueAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__SingleValue__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3686:1: ( ( ( ruleFQN ) ) )
            // InternalSkillDefinition.g:3687:2: ( ( ruleFQN ) )
            {
            // InternalSkillDefinition.g:3687:2: ( ( ruleFQN ) )
            // InternalSkillDefinition.g:3688:3: ( ruleFQN )
            {
             before(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 
            // InternalSkillDefinition.g:3689:3: ( ruleFQN )
            // InternalSkillDefinition.g:3690:4: ruleFQN
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000001C000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000008000000C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00008001FFE00000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000160000000C070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000400000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000600000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0001000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0002000000040020L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x000060000000C070L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000000000000C000L});

}