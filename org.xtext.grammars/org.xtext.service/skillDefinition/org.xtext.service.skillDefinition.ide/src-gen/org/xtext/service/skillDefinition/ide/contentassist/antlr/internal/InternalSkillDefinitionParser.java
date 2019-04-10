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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'*'", "'ERROR'", "'SUCCESS'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'", "'SkillDefinitionRepository'", "'{'", "'}'", "'CoordinationModuleDefinition'", "'SkillDefinition'", "'results'", "'in'", "'out'", "'value'", "'='", "';'", "':'", "'.'", "'-'", "'InlineEnumeration'", "'['", "']'", "','"
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
    // InternalSkillDefinition.g:94:1: entryRuleSkillDefinitionModel : ruleSkillDefinitionModel EOF ;
    public final void entryRuleSkillDefinitionModel() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:95:1: ( ruleSkillDefinitionModel EOF )
            // InternalSkillDefinition.g:96:1: ruleSkillDefinitionModel EOF
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
    // InternalSkillDefinition.g:103:1: ruleSkillDefinitionModel : ( ( rule__SkillDefinitionModel__Group__0 ) ) ;
    public final void ruleSkillDefinitionModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:107:2: ( ( ( rule__SkillDefinitionModel__Group__0 ) ) )
            // InternalSkillDefinition.g:108:2: ( ( rule__SkillDefinitionModel__Group__0 ) )
            {
            // InternalSkillDefinition.g:108:2: ( ( rule__SkillDefinitionModel__Group__0 ) )
            // InternalSkillDefinition.g:109:3: ( rule__SkillDefinitionModel__Group__0 )
            {
             before(grammarAccess.getSkillDefinitionModelAccess().getGroup()); 
            // InternalSkillDefinition.g:110:3: ( rule__SkillDefinitionModel__Group__0 )
            // InternalSkillDefinition.g:110:4: rule__SkillDefinitionModel__Group__0
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
    // InternalSkillDefinition.g:119:1: entryRuleSkillDefinitionRepository : ruleSkillDefinitionRepository EOF ;
    public final void entryRuleSkillDefinitionRepository() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:120:1: ( ruleSkillDefinitionRepository EOF )
            // InternalSkillDefinition.g:121:1: ruleSkillDefinitionRepository EOF
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
    // InternalSkillDefinition.g:128:1: ruleSkillDefinitionRepository : ( ( rule__SkillDefinitionRepository__Group__0 ) ) ;
    public final void ruleSkillDefinitionRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:132:2: ( ( ( rule__SkillDefinitionRepository__Group__0 ) ) )
            // InternalSkillDefinition.g:133:2: ( ( rule__SkillDefinitionRepository__Group__0 ) )
            {
            // InternalSkillDefinition.g:133:2: ( ( rule__SkillDefinitionRepository__Group__0 ) )
            // InternalSkillDefinition.g:134:3: ( rule__SkillDefinitionRepository__Group__0 )
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getGroup()); 
            // InternalSkillDefinition.g:135:3: ( rule__SkillDefinitionRepository__Group__0 )
            // InternalSkillDefinition.g:135:4: rule__SkillDefinitionRepository__Group__0
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
    // InternalSkillDefinition.g:144:1: entryRuleCoordinationModuleDefinition : ruleCoordinationModuleDefinition EOF ;
    public final void entryRuleCoordinationModuleDefinition() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:145:1: ( ruleCoordinationModuleDefinition EOF )
            // InternalSkillDefinition.g:146:1: ruleCoordinationModuleDefinition EOF
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
    // InternalSkillDefinition.g:153:1: ruleCoordinationModuleDefinition : ( ( rule__CoordinationModuleDefinition__Group__0 ) ) ;
    public final void ruleCoordinationModuleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:157:2: ( ( ( rule__CoordinationModuleDefinition__Group__0 ) ) )
            // InternalSkillDefinition.g:158:2: ( ( rule__CoordinationModuleDefinition__Group__0 ) )
            {
            // InternalSkillDefinition.g:158:2: ( ( rule__CoordinationModuleDefinition__Group__0 ) )
            // InternalSkillDefinition.g:159:3: ( rule__CoordinationModuleDefinition__Group__0 )
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getGroup()); 
            // InternalSkillDefinition.g:160:3: ( rule__CoordinationModuleDefinition__Group__0 )
            // InternalSkillDefinition.g:160:4: rule__CoordinationModuleDefinition__Group__0
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
    // InternalSkillDefinition.g:169:1: entryRuleSkillDefinition : ruleSkillDefinition EOF ;
    public final void entryRuleSkillDefinition() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:170:1: ( ruleSkillDefinition EOF )
            // InternalSkillDefinition.g:171:1: ruleSkillDefinition EOF
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
    // InternalSkillDefinition.g:178:1: ruleSkillDefinition : ( ( rule__SkillDefinition__Group__0 ) ) ;
    public final void ruleSkillDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:182:2: ( ( ( rule__SkillDefinition__Group__0 ) ) )
            // InternalSkillDefinition.g:183:2: ( ( rule__SkillDefinition__Group__0 ) )
            {
            // InternalSkillDefinition.g:183:2: ( ( rule__SkillDefinition__Group__0 ) )
            // InternalSkillDefinition.g:184:3: ( rule__SkillDefinition__Group__0 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup()); 
            // InternalSkillDefinition.g:185:3: ( rule__SkillDefinition__Group__0 )
            // InternalSkillDefinition.g:185:4: rule__SkillDefinition__Group__0
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
    // InternalSkillDefinition.g:194:1: entryRuleSkillResult : ruleSkillResult EOF ;
    public final void entryRuleSkillResult() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:195:1: ( ruleSkillResult EOF )
            // InternalSkillDefinition.g:196:1: ruleSkillResult EOF
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
    // InternalSkillDefinition.g:203:1: ruleSkillResult : ( ( rule__SkillResult__Group__0 ) ) ;
    public final void ruleSkillResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:207:2: ( ( ( rule__SkillResult__Group__0 ) ) )
            // InternalSkillDefinition.g:208:2: ( ( rule__SkillResult__Group__0 ) )
            {
            // InternalSkillDefinition.g:208:2: ( ( rule__SkillResult__Group__0 ) )
            // InternalSkillDefinition.g:209:3: ( rule__SkillResult__Group__0 )
            {
             before(grammarAccess.getSkillResultAccess().getGroup()); 
            // InternalSkillDefinition.g:210:3: ( rule__SkillResult__Group__0 )
            // InternalSkillDefinition.g:210:4: rule__SkillResult__Group__0
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
    // InternalSkillDefinition.g:219:1: entryRuleAttributeDefinition : ruleAttributeDefinition EOF ;
    public final void entryRuleAttributeDefinition() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:220:1: ( ruleAttributeDefinition EOF )
            // InternalSkillDefinition.g:221:1: ruleAttributeDefinition EOF
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
    // InternalSkillDefinition.g:228:1: ruleAttributeDefinition : ( ( rule__AttributeDefinition__Group__0 ) ) ;
    public final void ruleAttributeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:232:2: ( ( ( rule__AttributeDefinition__Group__0 ) ) )
            // InternalSkillDefinition.g:233:2: ( ( rule__AttributeDefinition__Group__0 ) )
            {
            // InternalSkillDefinition.g:233:2: ( ( rule__AttributeDefinition__Group__0 ) )
            // InternalSkillDefinition.g:234:3: ( rule__AttributeDefinition__Group__0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            // InternalSkillDefinition.g:235:3: ( rule__AttributeDefinition__Group__0 )
            // InternalSkillDefinition.g:235:4: rule__AttributeDefinition__Group__0
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
    // InternalSkillDefinition.g:244:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:245:1: ( ruleFQN EOF )
            // InternalSkillDefinition.g:246:1: ruleFQN EOF
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
    // InternalSkillDefinition.g:253:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:257:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalSkillDefinition.g:258:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalSkillDefinition.g:258:2: ( ( rule__FQN__Group__0 ) )
            // InternalSkillDefinition.g:259:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalSkillDefinition.g:260:3: ( rule__FQN__Group__0 )
            // InternalSkillDefinition.g:260:4: rule__FQN__Group__0
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
    // InternalSkillDefinition.g:269:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:270:1: ( ruleEBoolean EOF )
            // InternalSkillDefinition.g:271:1: ruleEBoolean EOF
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
    // InternalSkillDefinition.g:278:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:282:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalSkillDefinition.g:283:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalSkillDefinition.g:283:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalSkillDefinition.g:284:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalSkillDefinition.g:285:3: ( rule__EBoolean__Alternatives )
            // InternalSkillDefinition.g:285:4: rule__EBoolean__Alternatives
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
    // InternalSkillDefinition.g:294:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:295:1: ( ruleEString EOF )
            // InternalSkillDefinition.g:296:1: ruleEString EOF
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
    // InternalSkillDefinition.g:303:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:307:2: ( ( RULE_STRING ) )
            // InternalSkillDefinition.g:308:2: ( RULE_STRING )
            {
            // InternalSkillDefinition.g:308:2: ( RULE_STRING )
            // InternalSkillDefinition.g:309:3: RULE_STRING
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
    // InternalSkillDefinition.g:319:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:320:1: ( ruleEInt EOF )
            // InternalSkillDefinition.g:321:1: ruleEInt EOF
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
    // InternalSkillDefinition.g:328:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:332:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSkillDefinition.g:333:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSkillDefinition.g:333:2: ( ( rule__EInt__Group__0 ) )
            // InternalSkillDefinition.g:334:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSkillDefinition.g:335:3: ( rule__EInt__Group__0 )
            // InternalSkillDefinition.g:335:4: rule__EInt__Group__0
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
    // InternalSkillDefinition.g:344:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:345:1: ( ruleEDouble EOF )
            // InternalSkillDefinition.g:346:1: ruleEDouble EOF
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
    // InternalSkillDefinition.g:353:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:357:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalSkillDefinition.g:358:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalSkillDefinition.g:358:2: ( ( rule__EDouble__Group__0 ) )
            // InternalSkillDefinition.g:359:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalSkillDefinition.g:360:3: ( rule__EDouble__Group__0 )
            // InternalSkillDefinition.g:360:4: rule__EDouble__Group__0
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
    // InternalSkillDefinition.g:369:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:370:1: ( ruleEnumerationElement EOF )
            // InternalSkillDefinition.g:371:1: ruleEnumerationElement EOF
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
    // InternalSkillDefinition.g:378:1: ruleEnumerationElement : ( ( rule__EnumerationElement__Group__0 ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:382:2: ( ( ( rule__EnumerationElement__Group__0 ) ) )
            // InternalSkillDefinition.g:383:2: ( ( rule__EnumerationElement__Group__0 ) )
            {
            // InternalSkillDefinition.g:383:2: ( ( rule__EnumerationElement__Group__0 ) )
            // InternalSkillDefinition.g:384:3: ( rule__EnumerationElement__Group__0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup()); 
            // InternalSkillDefinition.g:385:3: ( rule__EnumerationElement__Group__0 )
            // InternalSkillDefinition.g:385:4: rule__EnumerationElement__Group__0
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
    // InternalSkillDefinition.g:394:1: entryRuleAbstractAttributeType : ruleAbstractAttributeType EOF ;
    public final void entryRuleAbstractAttributeType() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:395:1: ( ruleAbstractAttributeType EOF )
            // InternalSkillDefinition.g:396:1: ruleAbstractAttributeType EOF
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
    // InternalSkillDefinition.g:403:1: ruleAbstractAttributeType : ( ( rule__AbstractAttributeType__Alternatives ) ) ;
    public final void ruleAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:407:2: ( ( ( rule__AbstractAttributeType__Alternatives ) ) )
            // InternalSkillDefinition.g:408:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            {
            // InternalSkillDefinition.g:408:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            // InternalSkillDefinition.g:409:3: ( rule__AbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalSkillDefinition.g:410:3: ( rule__AbstractAttributeType__Alternatives )
            // InternalSkillDefinition.g:410:4: rule__AbstractAttributeType__Alternatives
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
    // InternalSkillDefinition.g:419:1: entryRuleInlineEnumerationType : ruleInlineEnumerationType EOF ;
    public final void entryRuleInlineEnumerationType() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:420:1: ( ruleInlineEnumerationType EOF )
            // InternalSkillDefinition.g:421:1: ruleInlineEnumerationType EOF
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
    // InternalSkillDefinition.g:428:1: ruleInlineEnumerationType : ( ( rule__InlineEnumerationType__Group__0 ) ) ;
    public final void ruleInlineEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:432:2: ( ( ( rule__InlineEnumerationType__Group__0 ) ) )
            // InternalSkillDefinition.g:433:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            {
            // InternalSkillDefinition.g:433:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            // InternalSkillDefinition.g:434:3: ( rule__InlineEnumerationType__Group__0 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 
            // InternalSkillDefinition.g:435:3: ( rule__InlineEnumerationType__Group__0 )
            // InternalSkillDefinition.g:435:4: rule__InlineEnumerationType__Group__0
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
    // InternalSkillDefinition.g:444:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:445:1: ( ruleArrayType EOF )
            // InternalSkillDefinition.g:446:1: ruleArrayType EOF
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
    // InternalSkillDefinition.g:453:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:457:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalSkillDefinition.g:458:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalSkillDefinition.g:458:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalSkillDefinition.g:459:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalSkillDefinition.g:460:3: ( rule__ArrayType__Group__0 )
            // InternalSkillDefinition.g:460:4: rule__ArrayType__Group__0
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
    // InternalSkillDefinition.g:469:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:470:1: ( ruleCardinality EOF )
            // InternalSkillDefinition.g:471:1: ruleCardinality EOF
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
    // InternalSkillDefinition.g:478:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:482:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalSkillDefinition.g:483:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalSkillDefinition.g:483:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalSkillDefinition.g:484:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalSkillDefinition.g:485:3: ( rule__Cardinality__Alternatives )
            // InternalSkillDefinition.g:485:4: rule__Cardinality__Alternatives
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
    // InternalSkillDefinition.g:494:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:495:1: ( rulePrimitiveType EOF )
            // InternalSkillDefinition.g:496:1: rulePrimitiveType EOF
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
    // InternalSkillDefinition.g:503:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:507:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalSkillDefinition.g:508:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalSkillDefinition.g:508:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalSkillDefinition.g:509:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalSkillDefinition.g:510:3: ( rule__PrimitiveType__Group__0 )
            // InternalSkillDefinition.g:510:4: rule__PrimitiveType__Group__0
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
    // InternalSkillDefinition.g:519:1: entryRuleAbstractValue : ruleAbstractValue EOF ;
    public final void entryRuleAbstractValue() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:520:1: ( ruleAbstractValue EOF )
            // InternalSkillDefinition.g:521:1: ruleAbstractValue EOF
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
    // InternalSkillDefinition.g:528:1: ruleAbstractValue : ( ( rule__AbstractValue__Alternatives ) ) ;
    public final void ruleAbstractValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:532:2: ( ( ( rule__AbstractValue__Alternatives ) ) )
            // InternalSkillDefinition.g:533:2: ( ( rule__AbstractValue__Alternatives ) )
            {
            // InternalSkillDefinition.g:533:2: ( ( rule__AbstractValue__Alternatives ) )
            // InternalSkillDefinition.g:534:3: ( rule__AbstractValue__Alternatives )
            {
             before(grammarAccess.getAbstractValueAccess().getAlternatives()); 
            // InternalSkillDefinition.g:535:3: ( rule__AbstractValue__Alternatives )
            // InternalSkillDefinition.g:535:4: rule__AbstractValue__Alternatives
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
    // InternalSkillDefinition.g:544:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:545:1: ( ruleArrayValue EOF )
            // InternalSkillDefinition.g:546:1: ruleArrayValue EOF
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
    // InternalSkillDefinition.g:553:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:557:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalSkillDefinition.g:558:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalSkillDefinition.g:558:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalSkillDefinition.g:559:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalSkillDefinition.g:560:3: ( rule__ArrayValue__Group__0 )
            // InternalSkillDefinition.g:560:4: rule__ArrayValue__Group__0
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
    // InternalSkillDefinition.g:569:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalSkillDefinition.g:570:1: ( ruleSingleValue EOF )
            // InternalSkillDefinition.g:571:1: ruleSingleValue EOF
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
    // InternalSkillDefinition.g:578:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:582:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalSkillDefinition.g:583:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalSkillDefinition.g:583:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalSkillDefinition.g:584:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalSkillDefinition.g:585:3: ( rule__SingleValue__Alternatives )
            // InternalSkillDefinition.g:585:4: rule__SingleValue__Alternatives
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
    // InternalSkillDefinition.g:594:1: ruleSKILL_RESULT_TYPES : ( ( rule__SKILL_RESULT_TYPES__Alternatives ) ) ;
    public final void ruleSKILL_RESULT_TYPES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:598:1: ( ( ( rule__SKILL_RESULT_TYPES__Alternatives ) ) )
            // InternalSkillDefinition.g:599:2: ( ( rule__SKILL_RESULT_TYPES__Alternatives ) )
            {
            // InternalSkillDefinition.g:599:2: ( ( rule__SKILL_RESULT_TYPES__Alternatives ) )
            // InternalSkillDefinition.g:600:3: ( rule__SKILL_RESULT_TYPES__Alternatives )
            {
             before(grammarAccess.getSKILL_RESULT_TYPESAccess().getAlternatives()); 
            // InternalSkillDefinition.g:601:3: ( rule__SKILL_RESULT_TYPES__Alternatives )
            // InternalSkillDefinition.g:601:4: rule__SKILL_RESULT_TYPES__Alternatives
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
    // InternalSkillDefinition.g:610:1: rulePRIMITIVE_TYPE_NAME : ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) ;
    public final void rulePRIMITIVE_TYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:614:1: ( ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) )
            // InternalSkillDefinition.g:615:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            {
            // InternalSkillDefinition.g:615:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            // InternalSkillDefinition.g:616:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            {
             before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 
            // InternalSkillDefinition.g:617:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            // InternalSkillDefinition.g:617:4: rule__PRIMITIVE_TYPE_NAME__Alternatives
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
    // InternalSkillDefinition.g:625:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:629:1: ( ( 'true' ) | ( 'false' ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalSkillDefinition.g:630:2: ( 'true' )
                    {
                    // InternalSkillDefinition.g:630:2: ( 'true' )
                    // InternalSkillDefinition.g:631:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:636:2: ( 'false' )
                    {
                    // InternalSkillDefinition.g:636:2: ( 'false' )
                    // InternalSkillDefinition.g:637:3: 'false'
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
    // InternalSkillDefinition.g:646:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:650:1: ( ( 'E' ) | ( 'e' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalSkillDefinition.g:651:2: ( 'E' )
                    {
                    // InternalSkillDefinition.g:651:2: ( 'E' )
                    // InternalSkillDefinition.g:652:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:657:2: ( 'e' )
                    {
                    // InternalSkillDefinition.g:657:2: ( 'e' )
                    // InternalSkillDefinition.g:658:3: 'e'
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
    // InternalSkillDefinition.g:667:1: rule__AbstractAttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) );
    public final void rule__AbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:671:1: ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=29)) ) {
                alt3=1;
            }
            else if ( (LA3_0==44) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSkillDefinition.g:672:2: ( rulePrimitiveType )
                    {
                    // InternalSkillDefinition.g:672:2: ( rulePrimitiveType )
                    // InternalSkillDefinition.g:673:3: rulePrimitiveType
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
                    // InternalSkillDefinition.g:678:2: ( ruleInlineEnumerationType )
                    {
                    // InternalSkillDefinition.g:678:2: ( ruleInlineEnumerationType )
                    // InternalSkillDefinition.g:679:3: ruleInlineEnumerationType
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
    // InternalSkillDefinition.g:688:1: rule__Cardinality__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:692:1: ( ( RULE_INT ) | ( '*' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_INT) ) {
                alt4=1;
            }
            else if ( (LA4_0==15) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSkillDefinition.g:693:2: ( RULE_INT )
                    {
                    // InternalSkillDefinition.g:693:2: ( RULE_INT )
                    // InternalSkillDefinition.g:694:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:699:2: ( '*' )
                    {
                    // InternalSkillDefinition.g:699:2: ( '*' )
                    // InternalSkillDefinition.g:700:3: '*'
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
    // InternalSkillDefinition.g:709:1: rule__AbstractValue__Alternatives : ( ( ruleSingleValue ) | ( ruleArrayValue ) );
    public final void rule__AbstractValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:713:1: ( ( ruleSingleValue ) | ( ruleArrayValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||(LA5_0>=11 && LA5_0<=12)||(LA5_0>=42 && LA5_0<=43)) ) {
                alt5=1;
            }
            else if ( (LA5_0==45) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSkillDefinition.g:714:2: ( ruleSingleValue )
                    {
                    // InternalSkillDefinition.g:714:2: ( ruleSingleValue )
                    // InternalSkillDefinition.g:715:3: ruleSingleValue
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
                    // InternalSkillDefinition.g:720:2: ( ruleArrayValue )
                    {
                    // InternalSkillDefinition.g:720:2: ( ruleArrayValue )
                    // InternalSkillDefinition.g:721:3: ruleArrayValue
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
    // InternalSkillDefinition.g:730:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:734:1: ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 43:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_INT) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==EOF||LA6_2==RULE_ID||LA6_2==32||LA6_2==40||(LA6_2>=46 && LA6_2<=47)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==42) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==42) ) {
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

                if ( (LA6_2==EOF||LA6_2==RULE_ID||LA6_2==32||LA6_2==40||(LA6_2>=46 && LA6_2<=47)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==42) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 42:
                {
                alt6=2;
                }
                break;
            case RULE_STRING:
                {
                alt6=3;
                }
                break;
            case 11:
            case 12:
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
                    // InternalSkillDefinition.g:735:2: ( ( rule__SingleValue__Group_0__0 ) )
                    {
                    // InternalSkillDefinition.g:735:2: ( ( rule__SingleValue__Group_0__0 ) )
                    // InternalSkillDefinition.g:736:3: ( rule__SingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_0()); 
                    // InternalSkillDefinition.g:737:3: ( rule__SingleValue__Group_0__0 )
                    // InternalSkillDefinition.g:737:4: rule__SingleValue__Group_0__0
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
                    // InternalSkillDefinition.g:741:2: ( ( rule__SingleValue__Group_1__0 ) )
                    {
                    // InternalSkillDefinition.g:741:2: ( ( rule__SingleValue__Group_1__0 ) )
                    // InternalSkillDefinition.g:742:3: ( rule__SingleValue__Group_1__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_1()); 
                    // InternalSkillDefinition.g:743:3: ( rule__SingleValue__Group_1__0 )
                    // InternalSkillDefinition.g:743:4: rule__SingleValue__Group_1__0
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
                    // InternalSkillDefinition.g:747:2: ( ( rule__SingleValue__Group_2__0 ) )
                    {
                    // InternalSkillDefinition.g:747:2: ( ( rule__SingleValue__Group_2__0 ) )
                    // InternalSkillDefinition.g:748:3: ( rule__SingleValue__Group_2__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_2()); 
                    // InternalSkillDefinition.g:749:3: ( rule__SingleValue__Group_2__0 )
                    // InternalSkillDefinition.g:749:4: rule__SingleValue__Group_2__0
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
                    // InternalSkillDefinition.g:753:2: ( ( rule__SingleValue__Group_3__0 ) )
                    {
                    // InternalSkillDefinition.g:753:2: ( ( rule__SingleValue__Group_3__0 ) )
                    // InternalSkillDefinition.g:754:3: ( rule__SingleValue__Group_3__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_3()); 
                    // InternalSkillDefinition.g:755:3: ( rule__SingleValue__Group_3__0 )
                    // InternalSkillDefinition.g:755:4: rule__SingleValue__Group_3__0
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
                    // InternalSkillDefinition.g:759:2: ( ( rule__SingleValue__Group_4__0 ) )
                    {
                    // InternalSkillDefinition.g:759:2: ( ( rule__SingleValue__Group_4__0 ) )
                    // InternalSkillDefinition.g:760:3: ( rule__SingleValue__Group_4__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_4()); 
                    // InternalSkillDefinition.g:761:3: ( rule__SingleValue__Group_4__0 )
                    // InternalSkillDefinition.g:761:4: rule__SingleValue__Group_4__0
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
    // InternalSkillDefinition.g:769:1: rule__SKILL_RESULT_TYPES__Alternatives : ( ( ( 'ERROR' ) ) | ( ( 'SUCCESS' ) ) );
    public final void rule__SKILL_RESULT_TYPES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:773:1: ( ( ( 'ERROR' ) ) | ( ( 'SUCCESS' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            else if ( (LA7_0==17) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalSkillDefinition.g:774:2: ( ( 'ERROR' ) )
                    {
                    // InternalSkillDefinition.g:774:2: ( ( 'ERROR' ) )
                    // InternalSkillDefinition.g:775:3: ( 'ERROR' )
                    {
                     before(grammarAccess.getSKILL_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_0()); 
                    // InternalSkillDefinition.g:776:3: ( 'ERROR' )
                    // InternalSkillDefinition.g:776:4: 'ERROR'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getSKILL_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:780:2: ( ( 'SUCCESS' ) )
                    {
                    // InternalSkillDefinition.g:780:2: ( ( 'SUCCESS' ) )
                    // InternalSkillDefinition.g:781:3: ( 'SUCCESS' )
                    {
                     before(grammarAccess.getSKILL_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_1()); 
                    // InternalSkillDefinition.g:782:3: ( 'SUCCESS' )
                    // InternalSkillDefinition.g:782:4: 'SUCCESS'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalSkillDefinition.g:790:1: rule__PRIMITIVE_TYPE_NAME__Alternatives : ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PRIMITIVE_TYPE_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:794:1: ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) )
            int alt8=12;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt8=1;
                }
                break;
            case 19:
                {
                alt8=2;
                }
                break;
            case 20:
                {
                alt8=3;
                }
                break;
            case 21:
                {
                alt8=4;
                }
                break;
            case 22:
                {
                alt8=5;
                }
                break;
            case 23:
                {
                alt8=6;
                }
                break;
            case 24:
                {
                alt8=7;
                }
                break;
            case 25:
                {
                alt8=8;
                }
                break;
            case 26:
                {
                alt8=9;
                }
                break;
            case 27:
                {
                alt8=10;
                }
                break;
            case 28:
                {
                alt8=11;
                }
                break;
            case 29:
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
                    // InternalSkillDefinition.g:795:2: ( ( 'Int8' ) )
                    {
                    // InternalSkillDefinition.g:795:2: ( ( 'Int8' ) )
                    // InternalSkillDefinition.g:796:3: ( 'Int8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 
                    // InternalSkillDefinition.g:797:3: ( 'Int8' )
                    // InternalSkillDefinition.g:797:4: 'Int8'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSkillDefinition.g:801:2: ( ( 'Int16' ) )
                    {
                    // InternalSkillDefinition.g:801:2: ( ( 'Int16' ) )
                    // InternalSkillDefinition.g:802:3: ( 'Int16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 
                    // InternalSkillDefinition.g:803:3: ( 'Int16' )
                    // InternalSkillDefinition.g:803:4: 'Int16'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSkillDefinition.g:807:2: ( ( 'Int32' ) )
                    {
                    // InternalSkillDefinition.g:807:2: ( ( 'Int32' ) )
                    // InternalSkillDefinition.g:808:3: ( 'Int32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 
                    // InternalSkillDefinition.g:809:3: ( 'Int32' )
                    // InternalSkillDefinition.g:809:4: 'Int32'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSkillDefinition.g:813:2: ( ( 'Int64' ) )
                    {
                    // InternalSkillDefinition.g:813:2: ( ( 'Int64' ) )
                    // InternalSkillDefinition.g:814:3: ( 'Int64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 
                    // InternalSkillDefinition.g:815:3: ( 'Int64' )
                    // InternalSkillDefinition.g:815:4: 'Int64'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSkillDefinition.g:819:2: ( ( 'UInt8' ) )
                    {
                    // InternalSkillDefinition.g:819:2: ( ( 'UInt8' ) )
                    // InternalSkillDefinition.g:820:3: ( 'UInt8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 
                    // InternalSkillDefinition.g:821:3: ( 'UInt8' )
                    // InternalSkillDefinition.g:821:4: 'UInt8'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSkillDefinition.g:825:2: ( ( 'UInt16' ) )
                    {
                    // InternalSkillDefinition.g:825:2: ( ( 'UInt16' ) )
                    // InternalSkillDefinition.g:826:3: ( 'UInt16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 
                    // InternalSkillDefinition.g:827:3: ( 'UInt16' )
                    // InternalSkillDefinition.g:827:4: 'UInt16'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSkillDefinition.g:831:2: ( ( 'UInt32' ) )
                    {
                    // InternalSkillDefinition.g:831:2: ( ( 'UInt32' ) )
                    // InternalSkillDefinition.g:832:3: ( 'UInt32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 
                    // InternalSkillDefinition.g:833:3: ( 'UInt32' )
                    // InternalSkillDefinition.g:833:4: 'UInt32'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSkillDefinition.g:837:2: ( ( 'UInt64' ) )
                    {
                    // InternalSkillDefinition.g:837:2: ( ( 'UInt64' ) )
                    // InternalSkillDefinition.g:838:3: ( 'UInt64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 
                    // InternalSkillDefinition.g:839:3: ( 'UInt64' )
                    // InternalSkillDefinition.g:839:4: 'UInt64'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSkillDefinition.g:843:2: ( ( 'Float' ) )
                    {
                    // InternalSkillDefinition.g:843:2: ( ( 'Float' ) )
                    // InternalSkillDefinition.g:844:3: ( 'Float' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 
                    // InternalSkillDefinition.g:845:3: ( 'Float' )
                    // InternalSkillDefinition.g:845:4: 'Float'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSkillDefinition.g:849:2: ( ( 'Double' ) )
                    {
                    // InternalSkillDefinition.g:849:2: ( ( 'Double' ) )
                    // InternalSkillDefinition.g:850:3: ( 'Double' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 
                    // InternalSkillDefinition.g:851:3: ( 'Double' )
                    // InternalSkillDefinition.g:851:4: 'Double'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSkillDefinition.g:855:2: ( ( 'String' ) )
                    {
                    // InternalSkillDefinition.g:855:2: ( ( 'String' ) )
                    // InternalSkillDefinition.g:856:3: ( 'String' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 
                    // InternalSkillDefinition.g:857:3: ( 'String' )
                    // InternalSkillDefinition.g:857:4: 'String'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSkillDefinition.g:861:2: ( ( 'Boolean' ) )
                    {
                    // InternalSkillDefinition.g:861:2: ( ( 'Boolean' ) )
                    // InternalSkillDefinition.g:862:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 
                    // InternalSkillDefinition.g:863:3: ( 'Boolean' )
                    // InternalSkillDefinition.g:863:4: 'Boolean'
                    {
                    match(input,29,FOLLOW_2); 

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
    // InternalSkillDefinition.g:871:1: rule__SkillDefinitionModel__Group__0 : rule__SkillDefinitionModel__Group__0__Impl rule__SkillDefinitionModel__Group__1 ;
    public final void rule__SkillDefinitionModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:875:1: ( rule__SkillDefinitionModel__Group__0__Impl rule__SkillDefinitionModel__Group__1 )
            // InternalSkillDefinition.g:876:2: rule__SkillDefinitionModel__Group__0__Impl rule__SkillDefinitionModel__Group__1
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
    // InternalSkillDefinition.g:883:1: rule__SkillDefinitionModel__Group__0__Impl : ( () ) ;
    public final void rule__SkillDefinitionModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:887:1: ( ( () ) )
            // InternalSkillDefinition.g:888:1: ( () )
            {
            // InternalSkillDefinition.g:888:1: ( () )
            // InternalSkillDefinition.g:889:2: ()
            {
             before(grammarAccess.getSkillDefinitionModelAccess().getSkillDefinitionModelAction_0()); 
            // InternalSkillDefinition.g:890:2: ()
            // InternalSkillDefinition.g:890:3: 
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
    // InternalSkillDefinition.g:898:1: rule__SkillDefinitionModel__Group__1 : rule__SkillDefinitionModel__Group__1__Impl ;
    public final void rule__SkillDefinitionModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:902:1: ( rule__SkillDefinitionModel__Group__1__Impl )
            // InternalSkillDefinition.g:903:2: rule__SkillDefinitionModel__Group__1__Impl
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
    // InternalSkillDefinition.g:909:1: rule__SkillDefinitionModel__Group__1__Impl : ( ( rule__SkillDefinitionModel__RepositoryAssignment_1 )? ) ;
    public final void rule__SkillDefinitionModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:913:1: ( ( ( rule__SkillDefinitionModel__RepositoryAssignment_1 )? ) )
            // InternalSkillDefinition.g:914:1: ( ( rule__SkillDefinitionModel__RepositoryAssignment_1 )? )
            {
            // InternalSkillDefinition.g:914:1: ( ( rule__SkillDefinitionModel__RepositoryAssignment_1 )? )
            // InternalSkillDefinition.g:915:2: ( rule__SkillDefinitionModel__RepositoryAssignment_1 )?
            {
             before(grammarAccess.getSkillDefinitionModelAccess().getRepositoryAssignment_1()); 
            // InternalSkillDefinition.g:916:2: ( rule__SkillDefinitionModel__RepositoryAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSkillDefinition.g:916:3: rule__SkillDefinitionModel__RepositoryAssignment_1
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
    // InternalSkillDefinition.g:925:1: rule__SkillDefinitionRepository__Group__0 : rule__SkillDefinitionRepository__Group__0__Impl rule__SkillDefinitionRepository__Group__1 ;
    public final void rule__SkillDefinitionRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:929:1: ( rule__SkillDefinitionRepository__Group__0__Impl rule__SkillDefinitionRepository__Group__1 )
            // InternalSkillDefinition.g:930:2: rule__SkillDefinitionRepository__Group__0__Impl rule__SkillDefinitionRepository__Group__1
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
    // InternalSkillDefinition.g:937:1: rule__SkillDefinitionRepository__Group__0__Impl : ( 'SkillDefinitionRepository' ) ;
    public final void rule__SkillDefinitionRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:941:1: ( ( 'SkillDefinitionRepository' ) )
            // InternalSkillDefinition.g:942:1: ( 'SkillDefinitionRepository' )
            {
            // InternalSkillDefinition.g:942:1: ( 'SkillDefinitionRepository' )
            // InternalSkillDefinition.g:943:2: 'SkillDefinitionRepository'
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getSkillDefinitionRepositoryKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSkillDefinition.g:952:1: rule__SkillDefinitionRepository__Group__1 : rule__SkillDefinitionRepository__Group__1__Impl rule__SkillDefinitionRepository__Group__2 ;
    public final void rule__SkillDefinitionRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:956:1: ( rule__SkillDefinitionRepository__Group__1__Impl rule__SkillDefinitionRepository__Group__2 )
            // InternalSkillDefinition.g:957:2: rule__SkillDefinitionRepository__Group__1__Impl rule__SkillDefinitionRepository__Group__2
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
    // InternalSkillDefinition.g:964:1: rule__SkillDefinitionRepository__Group__1__Impl : ( ( rule__SkillDefinitionRepository__NameAssignment_1 ) ) ;
    public final void rule__SkillDefinitionRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:968:1: ( ( ( rule__SkillDefinitionRepository__NameAssignment_1 ) ) )
            // InternalSkillDefinition.g:969:1: ( ( rule__SkillDefinitionRepository__NameAssignment_1 ) )
            {
            // InternalSkillDefinition.g:969:1: ( ( rule__SkillDefinitionRepository__NameAssignment_1 ) )
            // InternalSkillDefinition.g:970:2: ( rule__SkillDefinitionRepository__NameAssignment_1 )
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getNameAssignment_1()); 
            // InternalSkillDefinition.g:971:2: ( rule__SkillDefinitionRepository__NameAssignment_1 )
            // InternalSkillDefinition.g:971:3: rule__SkillDefinitionRepository__NameAssignment_1
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
    // InternalSkillDefinition.g:979:1: rule__SkillDefinitionRepository__Group__2 : rule__SkillDefinitionRepository__Group__2__Impl rule__SkillDefinitionRepository__Group__3 ;
    public final void rule__SkillDefinitionRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:983:1: ( rule__SkillDefinitionRepository__Group__2__Impl rule__SkillDefinitionRepository__Group__3 )
            // InternalSkillDefinition.g:984:2: rule__SkillDefinitionRepository__Group__2__Impl rule__SkillDefinitionRepository__Group__3
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
    // InternalSkillDefinition.g:991:1: rule__SkillDefinitionRepository__Group__2__Impl : ( '{' ) ;
    public final void rule__SkillDefinitionRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:995:1: ( ( '{' ) )
            // InternalSkillDefinition.g:996:1: ( '{' )
            {
            // InternalSkillDefinition.g:996:1: ( '{' )
            // InternalSkillDefinition.g:997:2: '{'
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1006:1: rule__SkillDefinitionRepository__Group__3 : rule__SkillDefinitionRepository__Group__3__Impl rule__SkillDefinitionRepository__Group__4 ;
    public final void rule__SkillDefinitionRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1010:1: ( rule__SkillDefinitionRepository__Group__3__Impl rule__SkillDefinitionRepository__Group__4 )
            // InternalSkillDefinition.g:1011:2: rule__SkillDefinitionRepository__Group__3__Impl rule__SkillDefinitionRepository__Group__4
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
    // InternalSkillDefinition.g:1018:1: rule__SkillDefinitionRepository__Group__3__Impl : ( ( rule__SkillDefinitionRepository__ModulesAssignment_3 )* ) ;
    public final void rule__SkillDefinitionRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1022:1: ( ( ( rule__SkillDefinitionRepository__ModulesAssignment_3 )* ) )
            // InternalSkillDefinition.g:1023:1: ( ( rule__SkillDefinitionRepository__ModulesAssignment_3 )* )
            {
            // InternalSkillDefinition.g:1023:1: ( ( rule__SkillDefinitionRepository__ModulesAssignment_3 )* )
            // InternalSkillDefinition.g:1024:2: ( rule__SkillDefinitionRepository__ModulesAssignment_3 )*
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getModulesAssignment_3()); 
            // InternalSkillDefinition.g:1025:2: ( rule__SkillDefinitionRepository__ModulesAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSkillDefinition.g:1025:3: rule__SkillDefinitionRepository__ModulesAssignment_3
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
    // InternalSkillDefinition.g:1033:1: rule__SkillDefinitionRepository__Group__4 : rule__SkillDefinitionRepository__Group__4__Impl ;
    public final void rule__SkillDefinitionRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1037:1: ( rule__SkillDefinitionRepository__Group__4__Impl )
            // InternalSkillDefinition.g:1038:2: rule__SkillDefinitionRepository__Group__4__Impl
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
    // InternalSkillDefinition.g:1044:1: rule__SkillDefinitionRepository__Group__4__Impl : ( '}' ) ;
    public final void rule__SkillDefinitionRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1048:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1049:1: ( '}' )
            {
            // InternalSkillDefinition.g:1049:1: ( '}' )
            // InternalSkillDefinition.g:1050:2: '}'
            {
             before(grammarAccess.getSkillDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1060:1: rule__CoordinationModuleDefinition__Group__0 : rule__CoordinationModuleDefinition__Group__0__Impl rule__CoordinationModuleDefinition__Group__1 ;
    public final void rule__CoordinationModuleDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1064:1: ( rule__CoordinationModuleDefinition__Group__0__Impl rule__CoordinationModuleDefinition__Group__1 )
            // InternalSkillDefinition.g:1065:2: rule__CoordinationModuleDefinition__Group__0__Impl rule__CoordinationModuleDefinition__Group__1
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
    // InternalSkillDefinition.g:1072:1: rule__CoordinationModuleDefinition__Group__0__Impl : ( 'CoordinationModuleDefinition' ) ;
    public final void rule__CoordinationModuleDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1076:1: ( ( 'CoordinationModuleDefinition' ) )
            // InternalSkillDefinition.g:1077:1: ( 'CoordinationModuleDefinition' )
            {
            // InternalSkillDefinition.g:1077:1: ( 'CoordinationModuleDefinition' )
            // InternalSkillDefinition.g:1078:2: 'CoordinationModuleDefinition'
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getCoordinationModuleDefinitionKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1087:1: rule__CoordinationModuleDefinition__Group__1 : rule__CoordinationModuleDefinition__Group__1__Impl rule__CoordinationModuleDefinition__Group__2 ;
    public final void rule__CoordinationModuleDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1091:1: ( rule__CoordinationModuleDefinition__Group__1__Impl rule__CoordinationModuleDefinition__Group__2 )
            // InternalSkillDefinition.g:1092:2: rule__CoordinationModuleDefinition__Group__1__Impl rule__CoordinationModuleDefinition__Group__2
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
    // InternalSkillDefinition.g:1099:1: rule__CoordinationModuleDefinition__Group__1__Impl : ( ( rule__CoordinationModuleDefinition__NameAssignment_1 ) ) ;
    public final void rule__CoordinationModuleDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1103:1: ( ( ( rule__CoordinationModuleDefinition__NameAssignment_1 ) ) )
            // InternalSkillDefinition.g:1104:1: ( ( rule__CoordinationModuleDefinition__NameAssignment_1 ) )
            {
            // InternalSkillDefinition.g:1104:1: ( ( rule__CoordinationModuleDefinition__NameAssignment_1 ) )
            // InternalSkillDefinition.g:1105:2: ( rule__CoordinationModuleDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getNameAssignment_1()); 
            // InternalSkillDefinition.g:1106:2: ( rule__CoordinationModuleDefinition__NameAssignment_1 )
            // InternalSkillDefinition.g:1106:3: rule__CoordinationModuleDefinition__NameAssignment_1
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
    // InternalSkillDefinition.g:1114:1: rule__CoordinationModuleDefinition__Group__2 : rule__CoordinationModuleDefinition__Group__2__Impl rule__CoordinationModuleDefinition__Group__3 ;
    public final void rule__CoordinationModuleDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1118:1: ( rule__CoordinationModuleDefinition__Group__2__Impl rule__CoordinationModuleDefinition__Group__3 )
            // InternalSkillDefinition.g:1119:2: rule__CoordinationModuleDefinition__Group__2__Impl rule__CoordinationModuleDefinition__Group__3
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
    // InternalSkillDefinition.g:1126:1: rule__CoordinationModuleDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__CoordinationModuleDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1130:1: ( ( '{' ) )
            // InternalSkillDefinition.g:1131:1: ( '{' )
            {
            // InternalSkillDefinition.g:1131:1: ( '{' )
            // InternalSkillDefinition.g:1132:2: '{'
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1141:1: rule__CoordinationModuleDefinition__Group__3 : rule__CoordinationModuleDefinition__Group__3__Impl rule__CoordinationModuleDefinition__Group__4 ;
    public final void rule__CoordinationModuleDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1145:1: ( rule__CoordinationModuleDefinition__Group__3__Impl rule__CoordinationModuleDefinition__Group__4 )
            // InternalSkillDefinition.g:1146:2: rule__CoordinationModuleDefinition__Group__3__Impl rule__CoordinationModuleDefinition__Group__4
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
    // InternalSkillDefinition.g:1153:1: rule__CoordinationModuleDefinition__Group__3__Impl : ( ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )* ) ;
    public final void rule__CoordinationModuleDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1157:1: ( ( ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )* ) )
            // InternalSkillDefinition.g:1158:1: ( ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )* )
            {
            // InternalSkillDefinition.g:1158:1: ( ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )* )
            // InternalSkillDefinition.g:1159:2: ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )*
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getSkillsAssignment_3()); 
            // InternalSkillDefinition.g:1160:2: ( rule__CoordinationModuleDefinition__SkillsAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==34) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSkillDefinition.g:1160:3: rule__CoordinationModuleDefinition__SkillsAssignment_3
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
    // InternalSkillDefinition.g:1168:1: rule__CoordinationModuleDefinition__Group__4 : rule__CoordinationModuleDefinition__Group__4__Impl ;
    public final void rule__CoordinationModuleDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1172:1: ( rule__CoordinationModuleDefinition__Group__4__Impl )
            // InternalSkillDefinition.g:1173:2: rule__CoordinationModuleDefinition__Group__4__Impl
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
    // InternalSkillDefinition.g:1179:1: rule__CoordinationModuleDefinition__Group__4__Impl : ( '}' ) ;
    public final void rule__CoordinationModuleDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1183:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1184:1: ( '}' )
            {
            // InternalSkillDefinition.g:1184:1: ( '}' )
            // InternalSkillDefinition.g:1185:2: '}'
            {
             before(grammarAccess.getCoordinationModuleDefinitionAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1195:1: rule__SkillDefinition__Group__0 : rule__SkillDefinition__Group__0__Impl rule__SkillDefinition__Group__1 ;
    public final void rule__SkillDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1199:1: ( rule__SkillDefinition__Group__0__Impl rule__SkillDefinition__Group__1 )
            // InternalSkillDefinition.g:1200:2: rule__SkillDefinition__Group__0__Impl rule__SkillDefinition__Group__1
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
    // InternalSkillDefinition.g:1207:1: rule__SkillDefinition__Group__0__Impl : ( 'SkillDefinition' ) ;
    public final void rule__SkillDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1211:1: ( ( 'SkillDefinition' ) )
            // InternalSkillDefinition.g:1212:1: ( 'SkillDefinition' )
            {
            // InternalSkillDefinition.g:1212:1: ( 'SkillDefinition' )
            // InternalSkillDefinition.g:1213:2: 'SkillDefinition'
            {
             before(grammarAccess.getSkillDefinitionAccess().getSkillDefinitionKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1222:1: rule__SkillDefinition__Group__1 : rule__SkillDefinition__Group__1__Impl rule__SkillDefinition__Group__2 ;
    public final void rule__SkillDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1226:1: ( rule__SkillDefinition__Group__1__Impl rule__SkillDefinition__Group__2 )
            // InternalSkillDefinition.g:1227:2: rule__SkillDefinition__Group__1__Impl rule__SkillDefinition__Group__2
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
    // InternalSkillDefinition.g:1234:1: rule__SkillDefinition__Group__1__Impl : ( ( rule__SkillDefinition__NameAssignment_1 ) ) ;
    public final void rule__SkillDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1238:1: ( ( ( rule__SkillDefinition__NameAssignment_1 ) ) )
            // InternalSkillDefinition.g:1239:1: ( ( rule__SkillDefinition__NameAssignment_1 ) )
            {
            // InternalSkillDefinition.g:1239:1: ( ( rule__SkillDefinition__NameAssignment_1 ) )
            // InternalSkillDefinition.g:1240:2: ( rule__SkillDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getNameAssignment_1()); 
            // InternalSkillDefinition.g:1241:2: ( rule__SkillDefinition__NameAssignment_1 )
            // InternalSkillDefinition.g:1241:3: rule__SkillDefinition__NameAssignment_1
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
    // InternalSkillDefinition.g:1249:1: rule__SkillDefinition__Group__2 : rule__SkillDefinition__Group__2__Impl rule__SkillDefinition__Group__3 ;
    public final void rule__SkillDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1253:1: ( rule__SkillDefinition__Group__2__Impl rule__SkillDefinition__Group__3 )
            // InternalSkillDefinition.g:1254:2: rule__SkillDefinition__Group__2__Impl rule__SkillDefinition__Group__3
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
    // InternalSkillDefinition.g:1261:1: rule__SkillDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1265:1: ( ( '{' ) )
            // InternalSkillDefinition.g:1266:1: ( '{' )
            {
            // InternalSkillDefinition.g:1266:1: ( '{' )
            // InternalSkillDefinition.g:1267:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1276:1: rule__SkillDefinition__Group__3 : rule__SkillDefinition__Group__3__Impl rule__SkillDefinition__Group__4 ;
    public final void rule__SkillDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1280:1: ( rule__SkillDefinition__Group__3__Impl rule__SkillDefinition__Group__4 )
            // InternalSkillDefinition.g:1281:2: rule__SkillDefinition__Group__3__Impl rule__SkillDefinition__Group__4
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
    // InternalSkillDefinition.g:1288:1: rule__SkillDefinition__Group__3__Impl : ( ( rule__SkillDefinition__Group_3__0 )? ) ;
    public final void rule__SkillDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1292:1: ( ( ( rule__SkillDefinition__Group_3__0 )? ) )
            // InternalSkillDefinition.g:1293:1: ( ( rule__SkillDefinition__Group_3__0 )? )
            {
            // InternalSkillDefinition.g:1293:1: ( ( rule__SkillDefinition__Group_3__0 )? )
            // InternalSkillDefinition.g:1294:2: ( rule__SkillDefinition__Group_3__0 )?
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup_3()); 
            // InternalSkillDefinition.g:1295:2: ( rule__SkillDefinition__Group_3__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSkillDefinition.g:1295:3: rule__SkillDefinition__Group_3__0
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
    // InternalSkillDefinition.g:1303:1: rule__SkillDefinition__Group__4 : rule__SkillDefinition__Group__4__Impl rule__SkillDefinition__Group__5 ;
    public final void rule__SkillDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1307:1: ( rule__SkillDefinition__Group__4__Impl rule__SkillDefinition__Group__5 )
            // InternalSkillDefinition.g:1308:2: rule__SkillDefinition__Group__4__Impl rule__SkillDefinition__Group__5
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
    // InternalSkillDefinition.g:1315:1: rule__SkillDefinition__Group__4__Impl : ( ( rule__SkillDefinition__Group_4__0 )? ) ;
    public final void rule__SkillDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1319:1: ( ( ( rule__SkillDefinition__Group_4__0 )? ) )
            // InternalSkillDefinition.g:1320:1: ( ( rule__SkillDefinition__Group_4__0 )? )
            {
            // InternalSkillDefinition.g:1320:1: ( ( rule__SkillDefinition__Group_4__0 )? )
            // InternalSkillDefinition.g:1321:2: ( rule__SkillDefinition__Group_4__0 )?
            {
             before(grammarAccess.getSkillDefinitionAccess().getGroup_4()); 
            // InternalSkillDefinition.g:1322:2: ( rule__SkillDefinition__Group_4__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSkillDefinition.g:1322:3: rule__SkillDefinition__Group_4__0
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
    // InternalSkillDefinition.g:1330:1: rule__SkillDefinition__Group__5 : rule__SkillDefinition__Group__5__Impl rule__SkillDefinition__Group__6 ;
    public final void rule__SkillDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1334:1: ( rule__SkillDefinition__Group__5__Impl rule__SkillDefinition__Group__6 )
            // InternalSkillDefinition.g:1335:2: rule__SkillDefinition__Group__5__Impl rule__SkillDefinition__Group__6
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
    // InternalSkillDefinition.g:1342:1: rule__SkillDefinition__Group__5__Impl : ( 'results' ) ;
    public final void rule__SkillDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1346:1: ( ( 'results' ) )
            // InternalSkillDefinition.g:1347:1: ( 'results' )
            {
            // InternalSkillDefinition.g:1347:1: ( 'results' )
            // InternalSkillDefinition.g:1348:2: 'results'
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultsKeyword_5()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1357:1: rule__SkillDefinition__Group__6 : rule__SkillDefinition__Group__6__Impl rule__SkillDefinition__Group__7 ;
    public final void rule__SkillDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1361:1: ( rule__SkillDefinition__Group__6__Impl rule__SkillDefinition__Group__7 )
            // InternalSkillDefinition.g:1362:2: rule__SkillDefinition__Group__6__Impl rule__SkillDefinition__Group__7
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
    // InternalSkillDefinition.g:1369:1: rule__SkillDefinition__Group__6__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1373:1: ( ( '{' ) )
            // InternalSkillDefinition.g:1374:1: ( '{' )
            {
            // InternalSkillDefinition.g:1374:1: ( '{' )
            // InternalSkillDefinition.g:1375:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1384:1: rule__SkillDefinition__Group__7 : rule__SkillDefinition__Group__7__Impl rule__SkillDefinition__Group__8 ;
    public final void rule__SkillDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1388:1: ( rule__SkillDefinition__Group__7__Impl rule__SkillDefinition__Group__8 )
            // InternalSkillDefinition.g:1389:2: rule__SkillDefinition__Group__7__Impl rule__SkillDefinition__Group__8
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
    // InternalSkillDefinition.g:1396:1: rule__SkillDefinition__Group__7__Impl : ( ( ( rule__SkillDefinition__ResultsAssignment_7 ) ) ( ( rule__SkillDefinition__ResultsAssignment_7 )* ) ) ;
    public final void rule__SkillDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1400:1: ( ( ( ( rule__SkillDefinition__ResultsAssignment_7 ) ) ( ( rule__SkillDefinition__ResultsAssignment_7 )* ) ) )
            // InternalSkillDefinition.g:1401:1: ( ( ( rule__SkillDefinition__ResultsAssignment_7 ) ) ( ( rule__SkillDefinition__ResultsAssignment_7 )* ) )
            {
            // InternalSkillDefinition.g:1401:1: ( ( ( rule__SkillDefinition__ResultsAssignment_7 ) ) ( ( rule__SkillDefinition__ResultsAssignment_7 )* ) )
            // InternalSkillDefinition.g:1402:2: ( ( rule__SkillDefinition__ResultsAssignment_7 ) ) ( ( rule__SkillDefinition__ResultsAssignment_7 )* )
            {
            // InternalSkillDefinition.g:1402:2: ( ( rule__SkillDefinition__ResultsAssignment_7 ) )
            // InternalSkillDefinition.g:1403:3: ( rule__SkillDefinition__ResultsAssignment_7 )
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultsAssignment_7()); 
            // InternalSkillDefinition.g:1404:3: ( rule__SkillDefinition__ResultsAssignment_7 )
            // InternalSkillDefinition.g:1404:4: rule__SkillDefinition__ResultsAssignment_7
            {
            pushFollow(FOLLOW_13);
            rule__SkillDefinition__ResultsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getSkillDefinitionAccess().getResultsAssignment_7()); 

            }

            // InternalSkillDefinition.g:1407:2: ( ( rule__SkillDefinition__ResultsAssignment_7 )* )
            // InternalSkillDefinition.g:1408:3: ( rule__SkillDefinition__ResultsAssignment_7 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getResultsAssignment_7()); 
            // InternalSkillDefinition.g:1409:3: ( rule__SkillDefinition__ResultsAssignment_7 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=16 && LA14_0<=17)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSkillDefinition.g:1409:4: rule__SkillDefinition__ResultsAssignment_7
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
    // InternalSkillDefinition.g:1418:1: rule__SkillDefinition__Group__8 : rule__SkillDefinition__Group__8__Impl rule__SkillDefinition__Group__9 ;
    public final void rule__SkillDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1422:1: ( rule__SkillDefinition__Group__8__Impl rule__SkillDefinition__Group__9 )
            // InternalSkillDefinition.g:1423:2: rule__SkillDefinition__Group__8__Impl rule__SkillDefinition__Group__9
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
    // InternalSkillDefinition.g:1430:1: rule__SkillDefinition__Group__8__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1434:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1435:1: ( '}' )
            {
            // InternalSkillDefinition.g:1435:1: ( '}' )
            // InternalSkillDefinition.g:1436:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1445:1: rule__SkillDefinition__Group__9 : rule__SkillDefinition__Group__9__Impl ;
    public final void rule__SkillDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1449:1: ( rule__SkillDefinition__Group__9__Impl )
            // InternalSkillDefinition.g:1450:2: rule__SkillDefinition__Group__9__Impl
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
    // InternalSkillDefinition.g:1456:1: rule__SkillDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1460:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1461:1: ( '}' )
            {
            // InternalSkillDefinition.g:1461:1: ( '}' )
            // InternalSkillDefinition.g:1462:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1472:1: rule__SkillDefinition__Group_3__0 : rule__SkillDefinition__Group_3__0__Impl rule__SkillDefinition__Group_3__1 ;
    public final void rule__SkillDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1476:1: ( rule__SkillDefinition__Group_3__0__Impl rule__SkillDefinition__Group_3__1 )
            // InternalSkillDefinition.g:1477:2: rule__SkillDefinition__Group_3__0__Impl rule__SkillDefinition__Group_3__1
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
    // InternalSkillDefinition.g:1484:1: rule__SkillDefinition__Group_3__0__Impl : ( 'in' ) ;
    public final void rule__SkillDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1488:1: ( ( 'in' ) )
            // InternalSkillDefinition.g:1489:1: ( 'in' )
            {
            // InternalSkillDefinition.g:1489:1: ( 'in' )
            // InternalSkillDefinition.g:1490:2: 'in'
            {
             before(grammarAccess.getSkillDefinitionAccess().getInKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1499:1: rule__SkillDefinition__Group_3__1 : rule__SkillDefinition__Group_3__1__Impl rule__SkillDefinition__Group_3__2 ;
    public final void rule__SkillDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1503:1: ( rule__SkillDefinition__Group_3__1__Impl rule__SkillDefinition__Group_3__2 )
            // InternalSkillDefinition.g:1504:2: rule__SkillDefinition__Group_3__1__Impl rule__SkillDefinition__Group_3__2
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
    // InternalSkillDefinition.g:1511:1: rule__SkillDefinition__Group_3__1__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1515:1: ( ( '{' ) )
            // InternalSkillDefinition.g:1516:1: ( '{' )
            {
            // InternalSkillDefinition.g:1516:1: ( '{' )
            // InternalSkillDefinition.g:1517:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1526:1: rule__SkillDefinition__Group_3__2 : rule__SkillDefinition__Group_3__2__Impl rule__SkillDefinition__Group_3__3 ;
    public final void rule__SkillDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1530:1: ( rule__SkillDefinition__Group_3__2__Impl rule__SkillDefinition__Group_3__3 )
            // InternalSkillDefinition.g:1531:2: rule__SkillDefinition__Group_3__2__Impl rule__SkillDefinition__Group_3__3
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
    // InternalSkillDefinition.g:1538:1: rule__SkillDefinition__Group_3__2__Impl : ( ( rule__SkillDefinition__InAttributeAssignment_3_2 )* ) ;
    public final void rule__SkillDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1542:1: ( ( ( rule__SkillDefinition__InAttributeAssignment_3_2 )* ) )
            // InternalSkillDefinition.g:1543:1: ( ( rule__SkillDefinition__InAttributeAssignment_3_2 )* )
            {
            // InternalSkillDefinition.g:1543:1: ( ( rule__SkillDefinition__InAttributeAssignment_3_2 )* )
            // InternalSkillDefinition.g:1544:2: ( rule__SkillDefinition__InAttributeAssignment_3_2 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getInAttributeAssignment_3_2()); 
            // InternalSkillDefinition.g:1545:2: ( rule__SkillDefinition__InAttributeAssignment_3_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalSkillDefinition.g:1545:3: rule__SkillDefinition__InAttributeAssignment_3_2
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
    // InternalSkillDefinition.g:1553:1: rule__SkillDefinition__Group_3__3 : rule__SkillDefinition__Group_3__3__Impl ;
    public final void rule__SkillDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1557:1: ( rule__SkillDefinition__Group_3__3__Impl )
            // InternalSkillDefinition.g:1558:2: rule__SkillDefinition__Group_3__3__Impl
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
    // InternalSkillDefinition.g:1564:1: rule__SkillDefinition__Group_3__3__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1568:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1569:1: ( '}' )
            {
            // InternalSkillDefinition.g:1569:1: ( '}' )
            // InternalSkillDefinition.g:1570:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1580:1: rule__SkillDefinition__Group_4__0 : rule__SkillDefinition__Group_4__0__Impl rule__SkillDefinition__Group_4__1 ;
    public final void rule__SkillDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1584:1: ( rule__SkillDefinition__Group_4__0__Impl rule__SkillDefinition__Group_4__1 )
            // InternalSkillDefinition.g:1585:2: rule__SkillDefinition__Group_4__0__Impl rule__SkillDefinition__Group_4__1
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
    // InternalSkillDefinition.g:1592:1: rule__SkillDefinition__Group_4__0__Impl : ( 'out' ) ;
    public final void rule__SkillDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1596:1: ( ( 'out' ) )
            // InternalSkillDefinition.g:1597:1: ( 'out' )
            {
            // InternalSkillDefinition.g:1597:1: ( 'out' )
            // InternalSkillDefinition.g:1598:2: 'out'
            {
             before(grammarAccess.getSkillDefinitionAccess().getOutKeyword_4_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1607:1: rule__SkillDefinition__Group_4__1 : rule__SkillDefinition__Group_4__1__Impl rule__SkillDefinition__Group_4__2 ;
    public final void rule__SkillDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1611:1: ( rule__SkillDefinition__Group_4__1__Impl rule__SkillDefinition__Group_4__2 )
            // InternalSkillDefinition.g:1612:2: rule__SkillDefinition__Group_4__1__Impl rule__SkillDefinition__Group_4__2
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
    // InternalSkillDefinition.g:1619:1: rule__SkillDefinition__Group_4__1__Impl : ( '{' ) ;
    public final void rule__SkillDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1623:1: ( ( '{' ) )
            // InternalSkillDefinition.g:1624:1: ( '{' )
            {
            // InternalSkillDefinition.g:1624:1: ( '{' )
            // InternalSkillDefinition.g:1625:2: '{'
            {
             before(grammarAccess.getSkillDefinitionAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1634:1: rule__SkillDefinition__Group_4__2 : rule__SkillDefinition__Group_4__2__Impl rule__SkillDefinition__Group_4__3 ;
    public final void rule__SkillDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1638:1: ( rule__SkillDefinition__Group_4__2__Impl rule__SkillDefinition__Group_4__3 )
            // InternalSkillDefinition.g:1639:2: rule__SkillDefinition__Group_4__2__Impl rule__SkillDefinition__Group_4__3
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
    // InternalSkillDefinition.g:1646:1: rule__SkillDefinition__Group_4__2__Impl : ( ( rule__SkillDefinition__OutAttributeAssignment_4_2 )* ) ;
    public final void rule__SkillDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1650:1: ( ( ( rule__SkillDefinition__OutAttributeAssignment_4_2 )* ) )
            // InternalSkillDefinition.g:1651:1: ( ( rule__SkillDefinition__OutAttributeAssignment_4_2 )* )
            {
            // InternalSkillDefinition.g:1651:1: ( ( rule__SkillDefinition__OutAttributeAssignment_4_2 )* )
            // InternalSkillDefinition.g:1652:2: ( rule__SkillDefinition__OutAttributeAssignment_4_2 )*
            {
             before(grammarAccess.getSkillDefinitionAccess().getOutAttributeAssignment_4_2()); 
            // InternalSkillDefinition.g:1653:2: ( rule__SkillDefinition__OutAttributeAssignment_4_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_ID) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalSkillDefinition.g:1653:3: rule__SkillDefinition__OutAttributeAssignment_4_2
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
    // InternalSkillDefinition.g:1661:1: rule__SkillDefinition__Group_4__3 : rule__SkillDefinition__Group_4__3__Impl ;
    public final void rule__SkillDefinition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1665:1: ( rule__SkillDefinition__Group_4__3__Impl )
            // InternalSkillDefinition.g:1666:2: rule__SkillDefinition__Group_4__3__Impl
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
    // InternalSkillDefinition.g:1672:1: rule__SkillDefinition__Group_4__3__Impl : ( '}' ) ;
    public final void rule__SkillDefinition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1676:1: ( ( '}' ) )
            // InternalSkillDefinition.g:1677:1: ( '}' )
            {
            // InternalSkillDefinition.g:1677:1: ( '}' )
            // InternalSkillDefinition.g:1678:2: '}'
            {
             before(grammarAccess.getSkillDefinitionAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1688:1: rule__SkillResult__Group__0 : rule__SkillResult__Group__0__Impl rule__SkillResult__Group__1 ;
    public final void rule__SkillResult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1692:1: ( rule__SkillResult__Group__0__Impl rule__SkillResult__Group__1 )
            // InternalSkillDefinition.g:1693:2: rule__SkillResult__Group__0__Impl rule__SkillResult__Group__1
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
    // InternalSkillDefinition.g:1700:1: rule__SkillResult__Group__0__Impl : ( ( rule__SkillResult__ResultAssignment_0 ) ) ;
    public final void rule__SkillResult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1704:1: ( ( ( rule__SkillResult__ResultAssignment_0 ) ) )
            // InternalSkillDefinition.g:1705:1: ( ( rule__SkillResult__ResultAssignment_0 ) )
            {
            // InternalSkillDefinition.g:1705:1: ( ( rule__SkillResult__ResultAssignment_0 ) )
            // InternalSkillDefinition.g:1706:2: ( rule__SkillResult__ResultAssignment_0 )
            {
             before(grammarAccess.getSkillResultAccess().getResultAssignment_0()); 
            // InternalSkillDefinition.g:1707:2: ( rule__SkillResult__ResultAssignment_0 )
            // InternalSkillDefinition.g:1707:3: rule__SkillResult__ResultAssignment_0
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
    // InternalSkillDefinition.g:1715:1: rule__SkillResult__Group__1 : rule__SkillResult__Group__1__Impl rule__SkillResult__Group__2 ;
    public final void rule__SkillResult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1719:1: ( rule__SkillResult__Group__1__Impl rule__SkillResult__Group__2 )
            // InternalSkillDefinition.g:1720:2: rule__SkillResult__Group__1__Impl rule__SkillResult__Group__2
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
    // InternalSkillDefinition.g:1727:1: rule__SkillResult__Group__1__Impl : ( 'value' ) ;
    public final void rule__SkillResult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1731:1: ( ( 'value' ) )
            // InternalSkillDefinition.g:1732:1: ( 'value' )
            {
            // InternalSkillDefinition.g:1732:1: ( 'value' )
            // InternalSkillDefinition.g:1733:2: 'value'
            {
             before(grammarAccess.getSkillResultAccess().getValueKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1742:1: rule__SkillResult__Group__2 : rule__SkillResult__Group__2__Impl rule__SkillResult__Group__3 ;
    public final void rule__SkillResult__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1746:1: ( rule__SkillResult__Group__2__Impl rule__SkillResult__Group__3 )
            // InternalSkillDefinition.g:1747:2: rule__SkillResult__Group__2__Impl rule__SkillResult__Group__3
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
    // InternalSkillDefinition.g:1754:1: rule__SkillResult__Group__2__Impl : ( '=' ) ;
    public final void rule__SkillResult__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1758:1: ( ( '=' ) )
            // InternalSkillDefinition.g:1759:1: ( '=' )
            {
            // InternalSkillDefinition.g:1759:1: ( '=' )
            // InternalSkillDefinition.g:1760:2: '='
            {
             before(grammarAccess.getSkillResultAccess().getEqualsSignKeyword_2()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1769:1: rule__SkillResult__Group__3 : rule__SkillResult__Group__3__Impl rule__SkillResult__Group__4 ;
    public final void rule__SkillResult__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1773:1: ( rule__SkillResult__Group__3__Impl rule__SkillResult__Group__4 )
            // InternalSkillDefinition.g:1774:2: rule__SkillResult__Group__3__Impl rule__SkillResult__Group__4
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
    // InternalSkillDefinition.g:1781:1: rule__SkillResult__Group__3__Impl : ( ( rule__SkillResult__ResultValueAssignment_3 ) ) ;
    public final void rule__SkillResult__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1785:1: ( ( ( rule__SkillResult__ResultValueAssignment_3 ) ) )
            // InternalSkillDefinition.g:1786:1: ( ( rule__SkillResult__ResultValueAssignment_3 ) )
            {
            // InternalSkillDefinition.g:1786:1: ( ( rule__SkillResult__ResultValueAssignment_3 ) )
            // InternalSkillDefinition.g:1787:2: ( rule__SkillResult__ResultValueAssignment_3 )
            {
             before(grammarAccess.getSkillResultAccess().getResultValueAssignment_3()); 
            // InternalSkillDefinition.g:1788:2: ( rule__SkillResult__ResultValueAssignment_3 )
            // InternalSkillDefinition.g:1788:3: rule__SkillResult__ResultValueAssignment_3
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
    // InternalSkillDefinition.g:1796:1: rule__SkillResult__Group__4 : rule__SkillResult__Group__4__Impl ;
    public final void rule__SkillResult__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1800:1: ( rule__SkillResult__Group__4__Impl )
            // InternalSkillDefinition.g:1801:2: rule__SkillResult__Group__4__Impl
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
    // InternalSkillDefinition.g:1807:1: rule__SkillResult__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__SkillResult__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1811:1: ( ( ( ';' )? ) )
            // InternalSkillDefinition.g:1812:1: ( ( ';' )? )
            {
            // InternalSkillDefinition.g:1812:1: ( ( ';' )? )
            // InternalSkillDefinition.g:1813:2: ( ';' )?
            {
             before(grammarAccess.getSkillResultAccess().getSemicolonKeyword_4()); 
            // InternalSkillDefinition.g:1814:2: ( ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==40) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSkillDefinition.g:1814:3: ';'
                    {
                    match(input,40,FOLLOW_2); 

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
    // InternalSkillDefinition.g:1823:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1827:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalSkillDefinition.g:1828:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
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
    // InternalSkillDefinition.g:1835:1: rule__AttributeDefinition__Group__0__Impl : ( ( rule__AttributeDefinition__NameAssignment_0 ) ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1839:1: ( ( ( rule__AttributeDefinition__NameAssignment_0 ) ) )
            // InternalSkillDefinition.g:1840:1: ( ( rule__AttributeDefinition__NameAssignment_0 ) )
            {
            // InternalSkillDefinition.g:1840:1: ( ( rule__AttributeDefinition__NameAssignment_0 ) )
            // InternalSkillDefinition.g:1841:2: ( rule__AttributeDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_0()); 
            // InternalSkillDefinition.g:1842:2: ( rule__AttributeDefinition__NameAssignment_0 )
            // InternalSkillDefinition.g:1842:3: rule__AttributeDefinition__NameAssignment_0
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
    // InternalSkillDefinition.g:1850:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1854:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalSkillDefinition.g:1855:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
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
    // InternalSkillDefinition.g:1862:1: rule__AttributeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1866:1: ( ( ':' ) )
            // InternalSkillDefinition.g:1867:1: ( ':' )
            {
            // InternalSkillDefinition.g:1867:1: ( ':' )
            // InternalSkillDefinition.g:1868:2: ':'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1877:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1881:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalSkillDefinition.g:1882:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
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
    // InternalSkillDefinition.g:1889:1: rule__AttributeDefinition__Group__2__Impl : ( ( rule__AttributeDefinition__TypeAssignment_2 ) ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1893:1: ( ( ( rule__AttributeDefinition__TypeAssignment_2 ) ) )
            // InternalSkillDefinition.g:1894:1: ( ( rule__AttributeDefinition__TypeAssignment_2 ) )
            {
            // InternalSkillDefinition.g:1894:1: ( ( rule__AttributeDefinition__TypeAssignment_2 ) )
            // InternalSkillDefinition.g:1895:2: ( rule__AttributeDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2()); 
            // InternalSkillDefinition.g:1896:2: ( rule__AttributeDefinition__TypeAssignment_2 )
            // InternalSkillDefinition.g:1896:3: rule__AttributeDefinition__TypeAssignment_2
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
    // InternalSkillDefinition.g:1904:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1908:1: ( rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 )
            // InternalSkillDefinition.g:1909:2: rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalSkillDefinition.g:1916:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__Group_3__0 )? ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1920:1: ( ( ( rule__AttributeDefinition__Group_3__0 )? ) )
            // InternalSkillDefinition.g:1921:1: ( ( rule__AttributeDefinition__Group_3__0 )? )
            {
            // InternalSkillDefinition.g:1921:1: ( ( rule__AttributeDefinition__Group_3__0 )? )
            // InternalSkillDefinition.g:1922:2: ( rule__AttributeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup_3()); 
            // InternalSkillDefinition.g:1923:2: ( rule__AttributeDefinition__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSkillDefinition.g:1923:3: rule__AttributeDefinition__Group_3__0
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
    // InternalSkillDefinition.g:1931:1: rule__AttributeDefinition__Group__4 : rule__AttributeDefinition__Group__4__Impl ;
    public final void rule__AttributeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1935:1: ( rule__AttributeDefinition__Group__4__Impl )
            // InternalSkillDefinition.g:1936:2: rule__AttributeDefinition__Group__4__Impl
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
    // InternalSkillDefinition.g:1942:1: rule__AttributeDefinition__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__AttributeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1946:1: ( ( ( ';' )? ) )
            // InternalSkillDefinition.g:1947:1: ( ( ';' )? )
            {
            // InternalSkillDefinition.g:1947:1: ( ( ';' )? )
            // InternalSkillDefinition.g:1948:2: ( ';' )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4()); 
            // InternalSkillDefinition.g:1949:2: ( ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSkillDefinition.g:1949:3: ';'
                    {
                    match(input,40,FOLLOW_2); 

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
    // InternalSkillDefinition.g:1958:1: rule__AttributeDefinition__Group_3__0 : rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1 ;
    public final void rule__AttributeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1962:1: ( rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1 )
            // InternalSkillDefinition.g:1963:2: rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSkillDefinition.g:1970:1: rule__AttributeDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__AttributeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1974:1: ( ( '=' ) )
            // InternalSkillDefinition.g:1975:1: ( '=' )
            {
            // InternalSkillDefinition.g:1975:1: ( '=' )
            // InternalSkillDefinition.g:1976:2: '='
            {
             before(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSkillDefinition.g:1985:1: rule__AttributeDefinition__Group_3__1 : rule__AttributeDefinition__Group_3__1__Impl ;
    public final void rule__AttributeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:1989:1: ( rule__AttributeDefinition__Group_3__1__Impl )
            // InternalSkillDefinition.g:1990:2: rule__AttributeDefinition__Group_3__1__Impl
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
    // InternalSkillDefinition.g:1996:1: rule__AttributeDefinition__Group_3__1__Impl : ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) ) ;
    public final void rule__AttributeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2000:1: ( ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) ) )
            // InternalSkillDefinition.g:2001:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) )
            {
            // InternalSkillDefinition.g:2001:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) )
            // InternalSkillDefinition.g:2002:2: ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_3_1()); 
            // InternalSkillDefinition.g:2003:2: ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 )
            // InternalSkillDefinition.g:2003:3: rule__AttributeDefinition__DefaultvalueAssignment_3_1
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
    // InternalSkillDefinition.g:2012:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2016:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSkillDefinition.g:2017:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSkillDefinition.g:2024:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2028:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:2029:1: ( RULE_ID )
            {
            // InternalSkillDefinition.g:2029:1: ( RULE_ID )
            // InternalSkillDefinition.g:2030:2: RULE_ID
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
    // InternalSkillDefinition.g:2039:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2043:1: ( rule__FQN__Group__1__Impl )
            // InternalSkillDefinition.g:2044:2: rule__FQN__Group__1__Impl
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
    // InternalSkillDefinition.g:2050:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2054:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSkillDefinition.g:2055:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSkillDefinition.g:2055:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSkillDefinition.g:2056:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSkillDefinition.g:2057:2: ( rule__FQN__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==42) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSkillDefinition.g:2057:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalSkillDefinition.g:2066:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2070:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSkillDefinition.g:2071:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalSkillDefinition.g:2078:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2082:1: ( ( '.' ) )
            // InternalSkillDefinition.g:2083:1: ( '.' )
            {
            // InternalSkillDefinition.g:2083:1: ( '.' )
            // InternalSkillDefinition.g:2084:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2093:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2097:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSkillDefinition.g:2098:2: rule__FQN__Group_1__1__Impl
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
    // InternalSkillDefinition.g:2104:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2108:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:2109:1: ( RULE_ID )
            {
            // InternalSkillDefinition.g:2109:1: ( RULE_ID )
            // InternalSkillDefinition.g:2110:2: RULE_ID
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
    // InternalSkillDefinition.g:2120:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2124:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSkillDefinition.g:2125:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSkillDefinition.g:2132:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2136:1: ( ( ( '-' )? ) )
            // InternalSkillDefinition.g:2137:1: ( ( '-' )? )
            {
            // InternalSkillDefinition.g:2137:1: ( ( '-' )? )
            // InternalSkillDefinition.g:2138:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSkillDefinition.g:2139:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==43) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSkillDefinition.g:2139:3: '-'
                    {
                    match(input,43,FOLLOW_2); 

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
    // InternalSkillDefinition.g:2147:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2151:1: ( rule__EInt__Group__1__Impl )
            // InternalSkillDefinition.g:2152:2: rule__EInt__Group__1__Impl
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
    // InternalSkillDefinition.g:2158:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2162:1: ( ( RULE_INT ) )
            // InternalSkillDefinition.g:2163:1: ( RULE_INT )
            {
            // InternalSkillDefinition.g:2163:1: ( RULE_INT )
            // InternalSkillDefinition.g:2164:2: RULE_INT
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
    // InternalSkillDefinition.g:2174:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2178:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalSkillDefinition.g:2179:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSkillDefinition.g:2186:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2190:1: ( ( ( '-' )? ) )
            // InternalSkillDefinition.g:2191:1: ( ( '-' )? )
            {
            // InternalSkillDefinition.g:2191:1: ( ( '-' )? )
            // InternalSkillDefinition.g:2192:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalSkillDefinition.g:2193:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==43) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSkillDefinition.g:2193:3: '-'
                    {
                    match(input,43,FOLLOW_2); 

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
    // InternalSkillDefinition.g:2201:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2205:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalSkillDefinition.g:2206:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSkillDefinition.g:2213:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2217:1: ( ( ( RULE_INT )? ) )
            // InternalSkillDefinition.g:2218:1: ( ( RULE_INT )? )
            {
            // InternalSkillDefinition.g:2218:1: ( ( RULE_INT )? )
            // InternalSkillDefinition.g:2219:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalSkillDefinition.g:2220:2: ( RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSkillDefinition.g:2220:3: RULE_INT
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
    // InternalSkillDefinition.g:2228:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2232:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalSkillDefinition.g:2233:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_28);
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
    // InternalSkillDefinition.g:2240:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2244:1: ( ( '.' ) )
            // InternalSkillDefinition.g:2245:1: ( '.' )
            {
            // InternalSkillDefinition.g:2245:1: ( '.' )
            // InternalSkillDefinition.g:2246:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2255:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2259:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalSkillDefinition.g:2260:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalSkillDefinition.g:2267:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2271:1: ( ( RULE_INT ) )
            // InternalSkillDefinition.g:2272:1: ( RULE_INT )
            {
            // InternalSkillDefinition.g:2272:1: ( RULE_INT )
            // InternalSkillDefinition.g:2273:2: RULE_INT
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
    // InternalSkillDefinition.g:2282:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2286:1: ( rule__EDouble__Group__4__Impl )
            // InternalSkillDefinition.g:2287:2: rule__EDouble__Group__4__Impl
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
    // InternalSkillDefinition.g:2293:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2297:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalSkillDefinition.g:2298:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalSkillDefinition.g:2298:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalSkillDefinition.g:2299:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalSkillDefinition.g:2300:2: ( rule__EDouble__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=13 && LA24_0<=14)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSkillDefinition.g:2300:3: rule__EDouble__Group_4__0
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
    // InternalSkillDefinition.g:2309:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2313:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalSkillDefinition.g:2314:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSkillDefinition.g:2321:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2325:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalSkillDefinition.g:2326:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalSkillDefinition.g:2326:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalSkillDefinition.g:2327:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalSkillDefinition.g:2328:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalSkillDefinition.g:2328:3: rule__EDouble__Alternatives_4_0
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
    // InternalSkillDefinition.g:2336:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2340:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalSkillDefinition.g:2341:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalSkillDefinition.g:2348:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2352:1: ( ( ( '-' )? ) )
            // InternalSkillDefinition.g:2353:1: ( ( '-' )? )
            {
            // InternalSkillDefinition.g:2353:1: ( ( '-' )? )
            // InternalSkillDefinition.g:2354:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalSkillDefinition.g:2355:2: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalSkillDefinition.g:2355:3: '-'
                    {
                    match(input,43,FOLLOW_2); 

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
    // InternalSkillDefinition.g:2363:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2367:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalSkillDefinition.g:2368:2: rule__EDouble__Group_4__2__Impl
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
    // InternalSkillDefinition.g:2374:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2378:1: ( ( RULE_INT ) )
            // InternalSkillDefinition.g:2379:1: ( RULE_INT )
            {
            // InternalSkillDefinition.g:2379:1: ( RULE_INT )
            // InternalSkillDefinition.g:2380:2: RULE_INT
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
    // InternalSkillDefinition.g:2390:1: rule__EnumerationElement__Group__0 : rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 ;
    public final void rule__EnumerationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2394:1: ( rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 )
            // InternalSkillDefinition.g:2395:2: rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalSkillDefinition.g:2402:1: rule__EnumerationElement__Group__0__Impl : ( ( rule__EnumerationElement__NameAssignment_0 ) ) ;
    public final void rule__EnumerationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2406:1: ( ( ( rule__EnumerationElement__NameAssignment_0 ) ) )
            // InternalSkillDefinition.g:2407:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            {
            // InternalSkillDefinition.g:2407:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            // InternalSkillDefinition.g:2408:2: ( rule__EnumerationElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 
            // InternalSkillDefinition.g:2409:2: ( rule__EnumerationElement__NameAssignment_0 )
            // InternalSkillDefinition.g:2409:3: rule__EnumerationElement__NameAssignment_0
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
    // InternalSkillDefinition.g:2417:1: rule__EnumerationElement__Group__1 : rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 ;
    public final void rule__EnumerationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2421:1: ( rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 )
            // InternalSkillDefinition.g:2422:2: rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2
            {
            pushFollow(FOLLOW_22);
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
    // InternalSkillDefinition.g:2429:1: rule__EnumerationElement__Group__1__Impl : ( ( rule__EnumerationElement__Group_1__0 )? ) ;
    public final void rule__EnumerationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2433:1: ( ( ( rule__EnumerationElement__Group_1__0 )? ) )
            // InternalSkillDefinition.g:2434:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            {
            // InternalSkillDefinition.g:2434:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            // InternalSkillDefinition.g:2435:2: ( rule__EnumerationElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup_1()); 
            // InternalSkillDefinition.g:2436:2: ( rule__EnumerationElement__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalSkillDefinition.g:2436:3: rule__EnumerationElement__Group_1__0
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
    // InternalSkillDefinition.g:2444:1: rule__EnumerationElement__Group__2 : rule__EnumerationElement__Group__2__Impl ;
    public final void rule__EnumerationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2448:1: ( rule__EnumerationElement__Group__2__Impl )
            // InternalSkillDefinition.g:2449:2: rule__EnumerationElement__Group__2__Impl
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
    // InternalSkillDefinition.g:2455:1: rule__EnumerationElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__EnumerationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2459:1: ( ( ( ';' )? ) )
            // InternalSkillDefinition.g:2460:1: ( ( ';' )? )
            {
            // InternalSkillDefinition.g:2460:1: ( ( ';' )? )
            // InternalSkillDefinition.g:2461:2: ( ';' )?
            {
             before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 
            // InternalSkillDefinition.g:2462:2: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==40) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalSkillDefinition.g:2462:3: ';'
                    {
                    match(input,40,FOLLOW_2); 

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
    // InternalSkillDefinition.g:2471:1: rule__EnumerationElement__Group_1__0 : rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 ;
    public final void rule__EnumerationElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2475:1: ( rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 )
            // InternalSkillDefinition.g:2476:2: rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSkillDefinition.g:2483:1: rule__EnumerationElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2487:1: ( ( '=' ) )
            // InternalSkillDefinition.g:2488:1: ( '=' )
            {
            // InternalSkillDefinition.g:2488:1: ( '=' )
            // InternalSkillDefinition.g:2489:2: '='
            {
             before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2498:1: rule__EnumerationElement__Group_1__1 : rule__EnumerationElement__Group_1__1__Impl ;
    public final void rule__EnumerationElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2502:1: ( rule__EnumerationElement__Group_1__1__Impl )
            // InternalSkillDefinition.g:2503:2: rule__EnumerationElement__Group_1__1__Impl
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
    // InternalSkillDefinition.g:2509:1: rule__EnumerationElement__Group_1__1__Impl : ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2513:1: ( ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) )
            // InternalSkillDefinition.g:2514:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            {
            // InternalSkillDefinition.g:2514:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            // InternalSkillDefinition.g:2515:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 
            // InternalSkillDefinition.g:2516:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            // InternalSkillDefinition.g:2516:3: rule__EnumerationElement__ValueAssignment_1_1
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
    // InternalSkillDefinition.g:2525:1: rule__InlineEnumerationType__Group__0 : rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 ;
    public final void rule__InlineEnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2529:1: ( rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 )
            // InternalSkillDefinition.g:2530:2: rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1
            {
            pushFollow(FOLLOW_30);
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
    // InternalSkillDefinition.g:2537:1: rule__InlineEnumerationType__Group__0__Impl : ( 'InlineEnumeration' ) ;
    public final void rule__InlineEnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2541:1: ( ( 'InlineEnumeration' ) )
            // InternalSkillDefinition.g:2542:1: ( 'InlineEnumeration' )
            {
            // InternalSkillDefinition.g:2542:1: ( 'InlineEnumeration' )
            // InternalSkillDefinition.g:2543:2: 'InlineEnumeration'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2552:1: rule__InlineEnumerationType__Group__1 : rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 ;
    public final void rule__InlineEnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2556:1: ( rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 )
            // InternalSkillDefinition.g:2557:2: rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalSkillDefinition.g:2564:1: rule__InlineEnumerationType__Group__1__Impl : ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) ;
    public final void rule__InlineEnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2568:1: ( ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) )
            // InternalSkillDefinition.g:2569:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            {
            // InternalSkillDefinition.g:2569:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            // InternalSkillDefinition.g:2570:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 
            // InternalSkillDefinition.g:2571:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==45) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalSkillDefinition.g:2571:3: rule__InlineEnumerationType__ArrayAssignment_1
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
    // InternalSkillDefinition.g:2579:1: rule__InlineEnumerationType__Group__2 : rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 ;
    public final void rule__InlineEnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2583:1: ( rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 )
            // InternalSkillDefinition.g:2584:2: rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3
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
    // InternalSkillDefinition.g:2591:1: rule__InlineEnumerationType__Group__2__Impl : ( '{' ) ;
    public final void rule__InlineEnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2595:1: ( ( '{' ) )
            // InternalSkillDefinition.g:2596:1: ( '{' )
            {
            // InternalSkillDefinition.g:2596:1: ( '{' )
            // InternalSkillDefinition.g:2597:2: '{'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2606:1: rule__InlineEnumerationType__Group__3 : rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 ;
    public final void rule__InlineEnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2610:1: ( rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 )
            // InternalSkillDefinition.g:2611:2: rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4
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
    // InternalSkillDefinition.g:2618:1: rule__InlineEnumerationType__Group__3__Impl : ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) ;
    public final void rule__InlineEnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2622:1: ( ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) )
            // InternalSkillDefinition.g:2623:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            {
            // InternalSkillDefinition.g:2623:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            // InternalSkillDefinition.g:2624:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            {
            // InternalSkillDefinition.g:2624:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) )
            // InternalSkillDefinition.g:2625:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalSkillDefinition.g:2626:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            // InternalSkillDefinition.g:2626:4: rule__InlineEnumerationType__EnumsAssignment_3
            {
            pushFollow(FOLLOW_15);
            rule__InlineEnumerationType__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }

            // InternalSkillDefinition.g:2629:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            // InternalSkillDefinition.g:2630:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalSkillDefinition.g:2631:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalSkillDefinition.g:2631:4: rule__InlineEnumerationType__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__InlineEnumerationType__EnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalSkillDefinition.g:2640:1: rule__InlineEnumerationType__Group__4 : rule__InlineEnumerationType__Group__4__Impl ;
    public final void rule__InlineEnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2644:1: ( rule__InlineEnumerationType__Group__4__Impl )
            // InternalSkillDefinition.g:2645:2: rule__InlineEnumerationType__Group__4__Impl
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
    // InternalSkillDefinition.g:2651:1: rule__InlineEnumerationType__Group__4__Impl : ( '}' ) ;
    public final void rule__InlineEnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2655:1: ( ( '}' ) )
            // InternalSkillDefinition.g:2656:1: ( '}' )
            {
            // InternalSkillDefinition.g:2656:1: ( '}' )
            // InternalSkillDefinition.g:2657:2: '}'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2667:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2671:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalSkillDefinition.g:2672:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSkillDefinition.g:2679:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2683:1: ( ( () ) )
            // InternalSkillDefinition.g:2684:1: ( () )
            {
            // InternalSkillDefinition.g:2684:1: ( () )
            // InternalSkillDefinition.g:2685:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // InternalSkillDefinition.g:2686:2: ()
            // InternalSkillDefinition.g:2686:3: 
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
    // InternalSkillDefinition.g:2694:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2698:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalSkillDefinition.g:2699:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalSkillDefinition.g:2706:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2710:1: ( ( '[' ) )
            // InternalSkillDefinition.g:2711:1: ( '[' )
            {
            // InternalSkillDefinition.g:2711:1: ( '[' )
            // InternalSkillDefinition.g:2712:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2721:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2725:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalSkillDefinition.g:2726:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalSkillDefinition.g:2733:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__LengthAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2737:1: ( ( ( rule__ArrayType__LengthAssignment_2 )? ) )
            // InternalSkillDefinition.g:2738:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            {
            // InternalSkillDefinition.g:2738:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            // InternalSkillDefinition.g:2739:2: ( rule__ArrayType__LengthAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 
            // InternalSkillDefinition.g:2740:2: ( rule__ArrayType__LengthAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==15) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalSkillDefinition.g:2740:3: rule__ArrayType__LengthAssignment_2
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
    // InternalSkillDefinition.g:2748:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2752:1: ( rule__ArrayType__Group__3__Impl )
            // InternalSkillDefinition.g:2753:2: rule__ArrayType__Group__3__Impl
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
    // InternalSkillDefinition.g:2759:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2763:1: ( ( ']' ) )
            // InternalSkillDefinition.g:2764:1: ( ']' )
            {
            // InternalSkillDefinition.g:2764:1: ( ']' )
            // InternalSkillDefinition.g:2765:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2775:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2779:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalSkillDefinition.g:2780:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSkillDefinition.g:2787:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2791:1: ( ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) )
            // InternalSkillDefinition.g:2792:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            {
            // InternalSkillDefinition.g:2792:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            // InternalSkillDefinition.g:2793:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 
            // InternalSkillDefinition.g:2794:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            // InternalSkillDefinition.g:2794:3: rule__PrimitiveType__TypeNameAssignment_0
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
    // InternalSkillDefinition.g:2802:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2806:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalSkillDefinition.g:2807:2: rule__PrimitiveType__Group__1__Impl
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
    // InternalSkillDefinition.g:2813:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2817:1: ( ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) )
            // InternalSkillDefinition.g:2818:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            {
            // InternalSkillDefinition.g:2818:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            // InternalSkillDefinition.g:2819:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 
            // InternalSkillDefinition.g:2820:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==45) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalSkillDefinition.g:2820:3: rule__PrimitiveType__ArrayAssignment_1
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
    // InternalSkillDefinition.g:2829:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2833:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalSkillDefinition.g:2834:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSkillDefinition.g:2841:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2845:1: ( ( '[' ) )
            // InternalSkillDefinition.g:2846:1: ( '[' )
            {
            // InternalSkillDefinition.g:2846:1: ( '[' )
            // InternalSkillDefinition.g:2847:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2856:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2860:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalSkillDefinition.g:2861:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalSkillDefinition.g:2868:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2872:1: ( ( ( rule__ArrayValue__ValuesAssignment_1 ) ) )
            // InternalSkillDefinition.g:2873:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            {
            // InternalSkillDefinition.g:2873:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            // InternalSkillDefinition.g:2874:2: ( rule__ArrayValue__ValuesAssignment_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 
            // InternalSkillDefinition.g:2875:2: ( rule__ArrayValue__ValuesAssignment_1 )
            // InternalSkillDefinition.g:2875:3: rule__ArrayValue__ValuesAssignment_1
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
    // InternalSkillDefinition.g:2883:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2887:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalSkillDefinition.g:2888:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalSkillDefinition.g:2895:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )* ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2899:1: ( ( ( rule__ArrayValue__Group_2__0 )* ) )
            // InternalSkillDefinition.g:2900:1: ( ( rule__ArrayValue__Group_2__0 )* )
            {
            // InternalSkillDefinition.g:2900:1: ( ( rule__ArrayValue__Group_2__0 )* )
            // InternalSkillDefinition.g:2901:2: ( rule__ArrayValue__Group_2__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalSkillDefinition.g:2902:2: ( rule__ArrayValue__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==47) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalSkillDefinition.g:2902:3: rule__ArrayValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_35);
            	    rule__ArrayValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalSkillDefinition.g:2910:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2914:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalSkillDefinition.g:2915:2: rule__ArrayValue__Group__3__Impl
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
    // InternalSkillDefinition.g:2921:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2925:1: ( ( ']' ) )
            // InternalSkillDefinition.g:2926:1: ( ']' )
            {
            // InternalSkillDefinition.g:2926:1: ( ']' )
            // InternalSkillDefinition.g:2927:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,46,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2937:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2941:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalSkillDefinition.g:2942:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSkillDefinition.g:2949:1: rule__ArrayValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2953:1: ( ( ',' ) )
            // InternalSkillDefinition.g:2954:1: ( ',' )
            {
            // InternalSkillDefinition.g:2954:1: ( ',' )
            // InternalSkillDefinition.g:2955:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalSkillDefinition.g:2964:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2968:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalSkillDefinition.g:2969:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalSkillDefinition.g:2975:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2979:1: ( ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) )
            // InternalSkillDefinition.g:2980:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            {
            // InternalSkillDefinition.g:2980:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            // InternalSkillDefinition.g:2981:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 
            // InternalSkillDefinition.g:2982:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            // InternalSkillDefinition.g:2982:3: rule__ArrayValue__ValuesAssignment_2_1
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
    // InternalSkillDefinition.g:2991:1: rule__SingleValue__Group_0__0 : rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 ;
    public final void rule__SingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:2995:1: ( rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 )
            // InternalSkillDefinition.g:2996:2: rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSkillDefinition.g:3003:1: rule__SingleValue__Group_0__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3007:1: ( ( () ) )
            // InternalSkillDefinition.g:3008:1: ( () )
            {
            // InternalSkillDefinition.g:3008:1: ( () )
            // InternalSkillDefinition.g:3009:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); 
            // InternalSkillDefinition.g:3010:2: ()
            // InternalSkillDefinition.g:3010:3: 
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
    // InternalSkillDefinition.g:3018:1: rule__SingleValue__Group_0__1 : rule__SingleValue__Group_0__1__Impl ;
    public final void rule__SingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3022:1: ( rule__SingleValue__Group_0__1__Impl )
            // InternalSkillDefinition.g:3023:2: rule__SingleValue__Group_0__1__Impl
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
    // InternalSkillDefinition.g:3029:1: rule__SingleValue__Group_0__1__Impl : ( ( rule__SingleValue__ValueAssignment_0_1 ) ) ;
    public final void rule__SingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3033:1: ( ( ( rule__SingleValue__ValueAssignment_0_1 ) ) )
            // InternalSkillDefinition.g:3034:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            {
            // InternalSkillDefinition.g:3034:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            // InternalSkillDefinition.g:3035:2: ( rule__SingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 
            // InternalSkillDefinition.g:3036:2: ( rule__SingleValue__ValueAssignment_0_1 )
            // InternalSkillDefinition.g:3036:3: rule__SingleValue__ValueAssignment_0_1
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
    // InternalSkillDefinition.g:3045:1: rule__SingleValue__Group_1__0 : rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 ;
    public final void rule__SingleValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3049:1: ( rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 )
            // InternalSkillDefinition.g:3050:2: rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1
            {
            pushFollow(FOLLOW_27);
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
    // InternalSkillDefinition.g:3057:1: rule__SingleValue__Group_1__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3061:1: ( ( () ) )
            // InternalSkillDefinition.g:3062:1: ( () )
            {
            // InternalSkillDefinition.g:3062:1: ( () )
            // InternalSkillDefinition.g:3063:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); 
            // InternalSkillDefinition.g:3064:2: ()
            // InternalSkillDefinition.g:3064:3: 
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
    // InternalSkillDefinition.g:3072:1: rule__SingleValue__Group_1__1 : rule__SingleValue__Group_1__1__Impl ;
    public final void rule__SingleValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3076:1: ( rule__SingleValue__Group_1__1__Impl )
            // InternalSkillDefinition.g:3077:2: rule__SingleValue__Group_1__1__Impl
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
    // InternalSkillDefinition.g:3083:1: rule__SingleValue__Group_1__1__Impl : ( ( rule__SingleValue__ValueAssignment_1_1 ) ) ;
    public final void rule__SingleValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3087:1: ( ( ( rule__SingleValue__ValueAssignment_1_1 ) ) )
            // InternalSkillDefinition.g:3088:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            {
            // InternalSkillDefinition.g:3088:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            // InternalSkillDefinition.g:3089:2: ( rule__SingleValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); 
            // InternalSkillDefinition.g:3090:2: ( rule__SingleValue__ValueAssignment_1_1 )
            // InternalSkillDefinition.g:3090:3: rule__SingleValue__ValueAssignment_1_1
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
    // InternalSkillDefinition.g:3099:1: rule__SingleValue__Group_2__0 : rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 ;
    public final void rule__SingleValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3103:1: ( rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 )
            // InternalSkillDefinition.g:3104:2: rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1
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
    // InternalSkillDefinition.g:3111:1: rule__SingleValue__Group_2__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3115:1: ( ( () ) )
            // InternalSkillDefinition.g:3116:1: ( () )
            {
            // InternalSkillDefinition.g:3116:1: ( () )
            // InternalSkillDefinition.g:3117:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); 
            // InternalSkillDefinition.g:3118:2: ()
            // InternalSkillDefinition.g:3118:3: 
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
    // InternalSkillDefinition.g:3126:1: rule__SingleValue__Group_2__1 : rule__SingleValue__Group_2__1__Impl ;
    public final void rule__SingleValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3130:1: ( rule__SingleValue__Group_2__1__Impl )
            // InternalSkillDefinition.g:3131:2: rule__SingleValue__Group_2__1__Impl
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
    // InternalSkillDefinition.g:3137:1: rule__SingleValue__Group_2__1__Impl : ( ( rule__SingleValue__ValueAssignment_2_1 ) ) ;
    public final void rule__SingleValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3141:1: ( ( ( rule__SingleValue__ValueAssignment_2_1 ) ) )
            // InternalSkillDefinition.g:3142:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            {
            // InternalSkillDefinition.g:3142:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            // InternalSkillDefinition.g:3143:2: ( rule__SingleValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); 
            // InternalSkillDefinition.g:3144:2: ( rule__SingleValue__ValueAssignment_2_1 )
            // InternalSkillDefinition.g:3144:3: rule__SingleValue__ValueAssignment_2_1
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
    // InternalSkillDefinition.g:3153:1: rule__SingleValue__Group_3__0 : rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 ;
    public final void rule__SingleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3157:1: ( rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 )
            // InternalSkillDefinition.g:3158:2: rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalSkillDefinition.g:3165:1: rule__SingleValue__Group_3__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3169:1: ( ( () ) )
            // InternalSkillDefinition.g:3170:1: ( () )
            {
            // InternalSkillDefinition.g:3170:1: ( () )
            // InternalSkillDefinition.g:3171:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); 
            // InternalSkillDefinition.g:3172:2: ()
            // InternalSkillDefinition.g:3172:3: 
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
    // InternalSkillDefinition.g:3180:1: rule__SingleValue__Group_3__1 : rule__SingleValue__Group_3__1__Impl ;
    public final void rule__SingleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3184:1: ( rule__SingleValue__Group_3__1__Impl )
            // InternalSkillDefinition.g:3185:2: rule__SingleValue__Group_3__1__Impl
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
    // InternalSkillDefinition.g:3191:1: rule__SingleValue__Group_3__1__Impl : ( ( rule__SingleValue__ValueAssignment_3_1 ) ) ;
    public final void rule__SingleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3195:1: ( ( ( rule__SingleValue__ValueAssignment_3_1 ) ) )
            // InternalSkillDefinition.g:3196:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            {
            // InternalSkillDefinition.g:3196:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            // InternalSkillDefinition.g:3197:2: ( rule__SingleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); 
            // InternalSkillDefinition.g:3198:2: ( rule__SingleValue__ValueAssignment_3_1 )
            // InternalSkillDefinition.g:3198:3: rule__SingleValue__ValueAssignment_3_1
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
    // InternalSkillDefinition.g:3207:1: rule__SingleValue__Group_4__0 : rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 ;
    public final void rule__SingleValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3211:1: ( rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 )
            // InternalSkillDefinition.g:3212:2: rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalSkillDefinition.g:3219:1: rule__SingleValue__Group_4__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3223:1: ( ( () ) )
            // InternalSkillDefinition.g:3224:1: ( () )
            {
            // InternalSkillDefinition.g:3224:1: ( () )
            // InternalSkillDefinition.g:3225:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); 
            // InternalSkillDefinition.g:3226:2: ()
            // InternalSkillDefinition.g:3226:3: 
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
    // InternalSkillDefinition.g:3234:1: rule__SingleValue__Group_4__1 : rule__SingleValue__Group_4__1__Impl ;
    public final void rule__SingleValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3238:1: ( rule__SingleValue__Group_4__1__Impl )
            // InternalSkillDefinition.g:3239:2: rule__SingleValue__Group_4__1__Impl
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
    // InternalSkillDefinition.g:3245:1: rule__SingleValue__Group_4__1__Impl : ( ( rule__SingleValue__ValueAssignment_4_1 ) ) ;
    public final void rule__SingleValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3249:1: ( ( ( rule__SingleValue__ValueAssignment_4_1 ) ) )
            // InternalSkillDefinition.g:3250:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            {
            // InternalSkillDefinition.g:3250:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            // InternalSkillDefinition.g:3251:2: ( rule__SingleValue__ValueAssignment_4_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); 
            // InternalSkillDefinition.g:3252:2: ( rule__SingleValue__ValueAssignment_4_1 )
            // InternalSkillDefinition.g:3252:3: rule__SingleValue__ValueAssignment_4_1
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
    // InternalSkillDefinition.g:3261:1: rule__SkillDefinitionModel__RepositoryAssignment_1 : ( ruleSkillDefinitionRepository ) ;
    public final void rule__SkillDefinitionModel__RepositoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3265:1: ( ( ruleSkillDefinitionRepository ) )
            // InternalSkillDefinition.g:3266:2: ( ruleSkillDefinitionRepository )
            {
            // InternalSkillDefinition.g:3266:2: ( ruleSkillDefinitionRepository )
            // InternalSkillDefinition.g:3267:3: ruleSkillDefinitionRepository
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
    // InternalSkillDefinition.g:3276:1: rule__SkillDefinitionRepository__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SkillDefinitionRepository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3280:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:3281:2: ( RULE_ID )
            {
            // InternalSkillDefinition.g:3281:2: ( RULE_ID )
            // InternalSkillDefinition.g:3282:3: RULE_ID
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
    // InternalSkillDefinition.g:3291:1: rule__SkillDefinitionRepository__ModulesAssignment_3 : ( ruleCoordinationModuleDefinition ) ;
    public final void rule__SkillDefinitionRepository__ModulesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3295:1: ( ( ruleCoordinationModuleDefinition ) )
            // InternalSkillDefinition.g:3296:2: ( ruleCoordinationModuleDefinition )
            {
            // InternalSkillDefinition.g:3296:2: ( ruleCoordinationModuleDefinition )
            // InternalSkillDefinition.g:3297:3: ruleCoordinationModuleDefinition
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
    // InternalSkillDefinition.g:3306:1: rule__CoordinationModuleDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoordinationModuleDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3310:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:3311:2: ( RULE_ID )
            {
            // InternalSkillDefinition.g:3311:2: ( RULE_ID )
            // InternalSkillDefinition.g:3312:3: RULE_ID
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
    // InternalSkillDefinition.g:3321:1: rule__CoordinationModuleDefinition__SkillsAssignment_3 : ( ruleSkillDefinition ) ;
    public final void rule__CoordinationModuleDefinition__SkillsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3325:1: ( ( ruleSkillDefinition ) )
            // InternalSkillDefinition.g:3326:2: ( ruleSkillDefinition )
            {
            // InternalSkillDefinition.g:3326:2: ( ruleSkillDefinition )
            // InternalSkillDefinition.g:3327:3: ruleSkillDefinition
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
    // InternalSkillDefinition.g:3336:1: rule__SkillDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SkillDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3340:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:3341:2: ( RULE_ID )
            {
            // InternalSkillDefinition.g:3341:2: ( RULE_ID )
            // InternalSkillDefinition.g:3342:3: RULE_ID
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
    // InternalSkillDefinition.g:3351:1: rule__SkillDefinition__InAttributeAssignment_3_2 : ( ruleAttributeDefinition ) ;
    public final void rule__SkillDefinition__InAttributeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3355:1: ( ( ruleAttributeDefinition ) )
            // InternalSkillDefinition.g:3356:2: ( ruleAttributeDefinition )
            {
            // InternalSkillDefinition.g:3356:2: ( ruleAttributeDefinition )
            // InternalSkillDefinition.g:3357:3: ruleAttributeDefinition
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
    // InternalSkillDefinition.g:3366:1: rule__SkillDefinition__OutAttributeAssignment_4_2 : ( ruleAttributeDefinition ) ;
    public final void rule__SkillDefinition__OutAttributeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3370:1: ( ( ruleAttributeDefinition ) )
            // InternalSkillDefinition.g:3371:2: ( ruleAttributeDefinition )
            {
            // InternalSkillDefinition.g:3371:2: ( ruleAttributeDefinition )
            // InternalSkillDefinition.g:3372:3: ruleAttributeDefinition
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
    // InternalSkillDefinition.g:3381:1: rule__SkillDefinition__ResultsAssignment_7 : ( ruleSkillResult ) ;
    public final void rule__SkillDefinition__ResultsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3385:1: ( ( ruleSkillResult ) )
            // InternalSkillDefinition.g:3386:2: ( ruleSkillResult )
            {
            // InternalSkillDefinition.g:3386:2: ( ruleSkillResult )
            // InternalSkillDefinition.g:3387:3: ruleSkillResult
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
    // InternalSkillDefinition.g:3396:1: rule__SkillResult__ResultAssignment_0 : ( ruleSKILL_RESULT_TYPES ) ;
    public final void rule__SkillResult__ResultAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3400:1: ( ( ruleSKILL_RESULT_TYPES ) )
            // InternalSkillDefinition.g:3401:2: ( ruleSKILL_RESULT_TYPES )
            {
            // InternalSkillDefinition.g:3401:2: ( ruleSKILL_RESULT_TYPES )
            // InternalSkillDefinition.g:3402:3: ruleSKILL_RESULT_TYPES
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
    // InternalSkillDefinition.g:3411:1: rule__SkillResult__ResultValueAssignment_3 : ( ruleEString ) ;
    public final void rule__SkillResult__ResultValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3415:1: ( ( ruleEString ) )
            // InternalSkillDefinition.g:3416:2: ( ruleEString )
            {
            // InternalSkillDefinition.g:3416:2: ( ruleEString )
            // InternalSkillDefinition.g:3417:3: ruleEString
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


    // $ANTLR start "rule__AttributeDefinition__NameAssignment_0"
    // InternalSkillDefinition.g:3426:1: rule__AttributeDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributeDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3430:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:3431:2: ( RULE_ID )
            {
            // InternalSkillDefinition.g:3431:2: ( RULE_ID )
            // InternalSkillDefinition.g:3432:3: RULE_ID
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
    // InternalSkillDefinition.g:3441:1: rule__AttributeDefinition__TypeAssignment_2 : ( ruleAbstractAttributeType ) ;
    public final void rule__AttributeDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3445:1: ( ( ruleAbstractAttributeType ) )
            // InternalSkillDefinition.g:3446:2: ( ruleAbstractAttributeType )
            {
            // InternalSkillDefinition.g:3446:2: ( ruleAbstractAttributeType )
            // InternalSkillDefinition.g:3447:3: ruleAbstractAttributeType
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
    // InternalSkillDefinition.g:3456:1: rule__AttributeDefinition__DefaultvalueAssignment_3_1 : ( ruleAbstractValue ) ;
    public final void rule__AttributeDefinition__DefaultvalueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3460:1: ( ( ruleAbstractValue ) )
            // InternalSkillDefinition.g:3461:2: ( ruleAbstractValue )
            {
            // InternalSkillDefinition.g:3461:2: ( ruleAbstractValue )
            // InternalSkillDefinition.g:3462:3: ruleAbstractValue
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
    // InternalSkillDefinition.g:3471:1: rule__EnumerationElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3475:1: ( ( RULE_ID ) )
            // InternalSkillDefinition.g:3476:2: ( RULE_ID )
            {
            // InternalSkillDefinition.g:3476:2: ( RULE_ID )
            // InternalSkillDefinition.g:3477:3: RULE_ID
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
    // InternalSkillDefinition.g:3486:1: rule__EnumerationElement__ValueAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3490:1: ( ( ruleEInt ) )
            // InternalSkillDefinition.g:3491:2: ( ruleEInt )
            {
            // InternalSkillDefinition.g:3491:2: ( ruleEInt )
            // InternalSkillDefinition.g:3492:3: ruleEInt
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
    // InternalSkillDefinition.g:3501:1: rule__InlineEnumerationType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__InlineEnumerationType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3505:1: ( ( ruleArrayType ) )
            // InternalSkillDefinition.g:3506:2: ( ruleArrayType )
            {
            // InternalSkillDefinition.g:3506:2: ( ruleArrayType )
            // InternalSkillDefinition.g:3507:3: ruleArrayType
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
    // InternalSkillDefinition.g:3516:1: rule__InlineEnumerationType__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__InlineEnumerationType__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3520:1: ( ( ruleEnumerationElement ) )
            // InternalSkillDefinition.g:3521:2: ( ruleEnumerationElement )
            {
            // InternalSkillDefinition.g:3521:2: ( ruleEnumerationElement )
            // InternalSkillDefinition.g:3522:3: ruleEnumerationElement
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
    // InternalSkillDefinition.g:3531:1: rule__ArrayType__LengthAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ArrayType__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3535:1: ( ( ruleCardinality ) )
            // InternalSkillDefinition.g:3536:2: ( ruleCardinality )
            {
            // InternalSkillDefinition.g:3536:2: ( ruleCardinality )
            // InternalSkillDefinition.g:3537:3: ruleCardinality
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
    // InternalSkillDefinition.g:3546:1: rule__PrimitiveType__TypeNameAssignment_0 : ( rulePRIMITIVE_TYPE_NAME ) ;
    public final void rule__PrimitiveType__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3550:1: ( ( rulePRIMITIVE_TYPE_NAME ) )
            // InternalSkillDefinition.g:3551:2: ( rulePRIMITIVE_TYPE_NAME )
            {
            // InternalSkillDefinition.g:3551:2: ( rulePRIMITIVE_TYPE_NAME )
            // InternalSkillDefinition.g:3552:3: rulePRIMITIVE_TYPE_NAME
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
    // InternalSkillDefinition.g:3561:1: rule__PrimitiveType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__PrimitiveType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3565:1: ( ( ruleArrayType ) )
            // InternalSkillDefinition.g:3566:2: ( ruleArrayType )
            {
            // InternalSkillDefinition.g:3566:2: ( ruleArrayType )
            // InternalSkillDefinition.g:3567:3: ruleArrayType
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
    // InternalSkillDefinition.g:3576:1: rule__ArrayValue__ValuesAssignment_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3580:1: ( ( ruleSingleValue ) )
            // InternalSkillDefinition.g:3581:2: ( ruleSingleValue )
            {
            // InternalSkillDefinition.g:3581:2: ( ruleSingleValue )
            // InternalSkillDefinition.g:3582:3: ruleSingleValue
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
    // InternalSkillDefinition.g:3591:1: rule__ArrayValue__ValuesAssignment_2_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3595:1: ( ( ruleSingleValue ) )
            // InternalSkillDefinition.g:3596:2: ( ruleSingleValue )
            {
            // InternalSkillDefinition.g:3596:2: ( ruleSingleValue )
            // InternalSkillDefinition.g:3597:3: ruleSingleValue
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
    // InternalSkillDefinition.g:3606:1: rule__SingleValue__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__SingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3610:1: ( ( ruleEInt ) )
            // InternalSkillDefinition.g:3611:2: ( ruleEInt )
            {
            // InternalSkillDefinition.g:3611:2: ( ruleEInt )
            // InternalSkillDefinition.g:3612:3: ruleEInt
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
    // InternalSkillDefinition.g:3621:1: rule__SingleValue__ValueAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__SingleValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3625:1: ( ( ruleEDouble ) )
            // InternalSkillDefinition.g:3626:2: ( ruleEDouble )
            {
            // InternalSkillDefinition.g:3626:2: ( ruleEDouble )
            // InternalSkillDefinition.g:3627:3: ruleEDouble
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
    // InternalSkillDefinition.g:3636:1: rule__SingleValue__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__SingleValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3640:1: ( ( ruleEString ) )
            // InternalSkillDefinition.g:3641:2: ( ruleEString )
            {
            // InternalSkillDefinition.g:3641:2: ( ruleEString )
            // InternalSkillDefinition.g:3642:3: ruleEString
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
    // InternalSkillDefinition.g:3651:1: rule__SingleValue__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__SingleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3655:1: ( ( ruleEBoolean ) )
            // InternalSkillDefinition.g:3656:2: ( ruleEBoolean )
            {
            // InternalSkillDefinition.g:3656:2: ( ruleEBoolean )
            // InternalSkillDefinition.g:3657:3: ruleEBoolean
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
    // InternalSkillDefinition.g:3666:1: rule__SingleValue__ValueAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__SingleValue__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSkillDefinition.g:3670:1: ( ( ( ruleFQN ) ) )
            // InternalSkillDefinition.g:3671:2: ( ( ruleFQN ) )
            {
            // InternalSkillDefinition.g:3671:2: ( ( ruleFQN ) )
            // InternalSkillDefinition.g:3672:3: ( ruleFQN )
            {
             before(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 
            // InternalSkillDefinition.g:3673:3: ( ruleFQN )
            // InternalSkillDefinition.g:3674:4: ruleFQN
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000500000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000003800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000010003FFC0000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00002C0000001870L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00000C0000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000400000008020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000C0000001870L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000001800L});

}