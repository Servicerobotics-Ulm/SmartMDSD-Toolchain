package org.xtext.behavior.taskDefinition.ide.contentassist.antlr.internal;

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
import org.xtext.behavior.taskDefinition.services.TaskDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTaskDefinitionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_DOCU_COMMENT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'*'", "'SUCCESS'", "'ERROR'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'", "'TaskDefinitionRepository'", "'{'", "'}'", "'TaskDefinition'", "'results'", "'in'", "'out'", "'value'", "'='", "';'", "':'", "'.'", "'-'", "'InlineEnumeration'", "'['", "']'", "','"
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


        public InternalTaskDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTaskDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTaskDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTaskDefinition.g"; }


    	private TaskDefinitionGrammarAccess grammarAccess;

    	public void setGrammarAccess(TaskDefinitionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTaskDefinitionModel"
    // InternalTaskDefinition.g:68:1: entryRuleTaskDefinitionModel : ruleTaskDefinitionModel EOF ;
    public final void entryRuleTaskDefinitionModel() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:69:1: ( ruleTaskDefinitionModel EOF )
            // InternalTaskDefinition.g:70:1: ruleTaskDefinitionModel EOF
            {
             before(grammarAccess.getTaskDefinitionModelRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskDefinitionModel();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionModelRule()); 
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
    // $ANTLR end "entryRuleTaskDefinitionModel"


    // $ANTLR start "ruleTaskDefinitionModel"
    // InternalTaskDefinition.g:77:1: ruleTaskDefinitionModel : ( ( rule__TaskDefinitionModel__Group__0 ) ) ;
    public final void ruleTaskDefinitionModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:81:2: ( ( ( rule__TaskDefinitionModel__Group__0 ) ) )
            // InternalTaskDefinition.g:82:2: ( ( rule__TaskDefinitionModel__Group__0 ) )
            {
            // InternalTaskDefinition.g:82:2: ( ( rule__TaskDefinitionModel__Group__0 ) )
            // InternalTaskDefinition.g:83:3: ( rule__TaskDefinitionModel__Group__0 )
            {
             before(grammarAccess.getTaskDefinitionModelAccess().getGroup()); 
            // InternalTaskDefinition.g:84:3: ( rule__TaskDefinitionModel__Group__0 )
            // InternalTaskDefinition.g:84:4: rule__TaskDefinitionModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinitionModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskDefinitionModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskDefinitionModel"


    // $ANTLR start "entryRuleTaskDefinitionRepository"
    // InternalTaskDefinition.g:93:1: entryRuleTaskDefinitionRepository : ruleTaskDefinitionRepository EOF ;
    public final void entryRuleTaskDefinitionRepository() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:94:1: ( ruleTaskDefinitionRepository EOF )
            // InternalTaskDefinition.g:95:1: ruleTaskDefinitionRepository EOF
            {
             before(grammarAccess.getTaskDefinitionRepositoryRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskDefinitionRepository();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionRepositoryRule()); 
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
    // $ANTLR end "entryRuleTaskDefinitionRepository"


    // $ANTLR start "ruleTaskDefinitionRepository"
    // InternalTaskDefinition.g:102:1: ruleTaskDefinitionRepository : ( ( rule__TaskDefinitionRepository__Group__0 ) ) ;
    public final void ruleTaskDefinitionRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:106:2: ( ( ( rule__TaskDefinitionRepository__Group__0 ) ) )
            // InternalTaskDefinition.g:107:2: ( ( rule__TaskDefinitionRepository__Group__0 ) )
            {
            // InternalTaskDefinition.g:107:2: ( ( rule__TaskDefinitionRepository__Group__0 ) )
            // InternalTaskDefinition.g:108:3: ( rule__TaskDefinitionRepository__Group__0 )
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getGroup()); 
            // InternalTaskDefinition.g:109:3: ( rule__TaskDefinitionRepository__Group__0 )
            // InternalTaskDefinition.g:109:4: rule__TaskDefinitionRepository__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinitionRepository__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskDefinitionRepositoryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskDefinitionRepository"


    // $ANTLR start "entryRuleTaskDefinition"
    // InternalTaskDefinition.g:118:1: entryRuleTaskDefinition : ruleTaskDefinition EOF ;
    public final void entryRuleTaskDefinition() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:119:1: ( ruleTaskDefinition EOF )
            // InternalTaskDefinition.g:120:1: ruleTaskDefinition EOF
            {
             before(grammarAccess.getTaskDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskDefinition();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionRule()); 
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
    // $ANTLR end "entryRuleTaskDefinition"


    // $ANTLR start "ruleTaskDefinition"
    // InternalTaskDefinition.g:127:1: ruleTaskDefinition : ( ( rule__TaskDefinition__Group__0 ) ) ;
    public final void ruleTaskDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:131:2: ( ( ( rule__TaskDefinition__Group__0 ) ) )
            // InternalTaskDefinition.g:132:2: ( ( rule__TaskDefinition__Group__0 ) )
            {
            // InternalTaskDefinition.g:132:2: ( ( rule__TaskDefinition__Group__0 ) )
            // InternalTaskDefinition.g:133:3: ( rule__TaskDefinition__Group__0 )
            {
             before(grammarAccess.getTaskDefinitionAccess().getGroup()); 
            // InternalTaskDefinition.g:134:3: ( rule__TaskDefinition__Group__0 )
            // InternalTaskDefinition.g:134:4: rule__TaskDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskDefinition"


    // $ANTLR start "entryRuleTaskResult"
    // InternalTaskDefinition.g:143:1: entryRuleTaskResult : ruleTaskResult EOF ;
    public final void entryRuleTaskResult() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:144:1: ( ruleTaskResult EOF )
            // InternalTaskDefinition.g:145:1: ruleTaskResult EOF
            {
             before(grammarAccess.getTaskResultRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskResult();

            state._fsp--;

             after(grammarAccess.getTaskResultRule()); 
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
    // $ANTLR end "entryRuleTaskResult"


    // $ANTLR start "ruleTaskResult"
    // InternalTaskDefinition.g:152:1: ruleTaskResult : ( ( rule__TaskResult__Group__0 ) ) ;
    public final void ruleTaskResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:156:2: ( ( ( rule__TaskResult__Group__0 ) ) )
            // InternalTaskDefinition.g:157:2: ( ( rule__TaskResult__Group__0 ) )
            {
            // InternalTaskDefinition.g:157:2: ( ( rule__TaskResult__Group__0 ) )
            // InternalTaskDefinition.g:158:3: ( rule__TaskResult__Group__0 )
            {
             before(grammarAccess.getTaskResultAccess().getGroup()); 
            // InternalTaskDefinition.g:159:3: ( rule__TaskResult__Group__0 )
            // InternalTaskDefinition.g:159:4: rule__TaskResult__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskResult__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskResultAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskResult"


    // $ANTLR start "entryRuleAttributeDefinition"
    // InternalTaskDefinition.g:168:1: entryRuleAttributeDefinition : ruleAttributeDefinition EOF ;
    public final void entryRuleAttributeDefinition() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:169:1: ( ruleAttributeDefinition EOF )
            // InternalTaskDefinition.g:170:1: ruleAttributeDefinition EOF
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
    // InternalTaskDefinition.g:177:1: ruleAttributeDefinition : ( ( rule__AttributeDefinition__Group__0 ) ) ;
    public final void ruleAttributeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:181:2: ( ( ( rule__AttributeDefinition__Group__0 ) ) )
            // InternalTaskDefinition.g:182:2: ( ( rule__AttributeDefinition__Group__0 ) )
            {
            // InternalTaskDefinition.g:182:2: ( ( rule__AttributeDefinition__Group__0 ) )
            // InternalTaskDefinition.g:183:3: ( rule__AttributeDefinition__Group__0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            // InternalTaskDefinition.g:184:3: ( rule__AttributeDefinition__Group__0 )
            // InternalTaskDefinition.g:184:4: rule__AttributeDefinition__Group__0
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
    // InternalTaskDefinition.g:193:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:194:1: ( ruleFQN EOF )
            // InternalTaskDefinition.g:195:1: ruleFQN EOF
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
    // InternalTaskDefinition.g:202:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:206:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalTaskDefinition.g:207:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalTaskDefinition.g:207:2: ( ( rule__FQN__Group__0 ) )
            // InternalTaskDefinition.g:208:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalTaskDefinition.g:209:3: ( rule__FQN__Group__0 )
            // InternalTaskDefinition.g:209:4: rule__FQN__Group__0
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
    // InternalTaskDefinition.g:218:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:219:1: ( ruleEBoolean EOF )
            // InternalTaskDefinition.g:220:1: ruleEBoolean EOF
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
    // InternalTaskDefinition.g:227:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:231:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalTaskDefinition.g:232:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalTaskDefinition.g:232:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalTaskDefinition.g:233:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalTaskDefinition.g:234:3: ( rule__EBoolean__Alternatives )
            // InternalTaskDefinition.g:234:4: rule__EBoolean__Alternatives
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
    // InternalTaskDefinition.g:243:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:244:1: ( ruleEString EOF )
            // InternalTaskDefinition.g:245:1: ruleEString EOF
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
    // InternalTaskDefinition.g:252:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:256:2: ( ( RULE_STRING ) )
            // InternalTaskDefinition.g:257:2: ( RULE_STRING )
            {
            // InternalTaskDefinition.g:257:2: ( RULE_STRING )
            // InternalTaskDefinition.g:258:3: RULE_STRING
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
    // InternalTaskDefinition.g:268:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:269:1: ( ruleEInt EOF )
            // InternalTaskDefinition.g:270:1: ruleEInt EOF
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
    // InternalTaskDefinition.g:277:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:281:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTaskDefinition.g:282:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTaskDefinition.g:282:2: ( ( rule__EInt__Group__0 ) )
            // InternalTaskDefinition.g:283:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTaskDefinition.g:284:3: ( rule__EInt__Group__0 )
            // InternalTaskDefinition.g:284:4: rule__EInt__Group__0
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
    // InternalTaskDefinition.g:293:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:294:1: ( ruleEDouble EOF )
            // InternalTaskDefinition.g:295:1: ruleEDouble EOF
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
    // InternalTaskDefinition.g:302:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:306:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalTaskDefinition.g:307:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalTaskDefinition.g:307:2: ( ( rule__EDouble__Group__0 ) )
            // InternalTaskDefinition.g:308:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalTaskDefinition.g:309:3: ( rule__EDouble__Group__0 )
            // InternalTaskDefinition.g:309:4: rule__EDouble__Group__0
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
    // InternalTaskDefinition.g:318:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:319:1: ( ruleEnumerationElement EOF )
            // InternalTaskDefinition.g:320:1: ruleEnumerationElement EOF
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
    // InternalTaskDefinition.g:327:1: ruleEnumerationElement : ( ( rule__EnumerationElement__Group__0 ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:331:2: ( ( ( rule__EnumerationElement__Group__0 ) ) )
            // InternalTaskDefinition.g:332:2: ( ( rule__EnumerationElement__Group__0 ) )
            {
            // InternalTaskDefinition.g:332:2: ( ( rule__EnumerationElement__Group__0 ) )
            // InternalTaskDefinition.g:333:3: ( rule__EnumerationElement__Group__0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup()); 
            // InternalTaskDefinition.g:334:3: ( rule__EnumerationElement__Group__0 )
            // InternalTaskDefinition.g:334:4: rule__EnumerationElement__Group__0
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
    // InternalTaskDefinition.g:343:1: entryRuleAbstractAttributeType : ruleAbstractAttributeType EOF ;
    public final void entryRuleAbstractAttributeType() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:344:1: ( ruleAbstractAttributeType EOF )
            // InternalTaskDefinition.g:345:1: ruleAbstractAttributeType EOF
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
    // InternalTaskDefinition.g:352:1: ruleAbstractAttributeType : ( ( rule__AbstractAttributeType__Alternatives ) ) ;
    public final void ruleAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:356:2: ( ( ( rule__AbstractAttributeType__Alternatives ) ) )
            // InternalTaskDefinition.g:357:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            {
            // InternalTaskDefinition.g:357:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            // InternalTaskDefinition.g:358:3: ( rule__AbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalTaskDefinition.g:359:3: ( rule__AbstractAttributeType__Alternatives )
            // InternalTaskDefinition.g:359:4: rule__AbstractAttributeType__Alternatives
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
    // InternalTaskDefinition.g:368:1: entryRuleInlineEnumerationType : ruleInlineEnumerationType EOF ;
    public final void entryRuleInlineEnumerationType() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:369:1: ( ruleInlineEnumerationType EOF )
            // InternalTaskDefinition.g:370:1: ruleInlineEnumerationType EOF
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
    // InternalTaskDefinition.g:377:1: ruleInlineEnumerationType : ( ( rule__InlineEnumerationType__Group__0 ) ) ;
    public final void ruleInlineEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:381:2: ( ( ( rule__InlineEnumerationType__Group__0 ) ) )
            // InternalTaskDefinition.g:382:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            {
            // InternalTaskDefinition.g:382:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            // InternalTaskDefinition.g:383:3: ( rule__InlineEnumerationType__Group__0 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 
            // InternalTaskDefinition.g:384:3: ( rule__InlineEnumerationType__Group__0 )
            // InternalTaskDefinition.g:384:4: rule__InlineEnumerationType__Group__0
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
    // InternalTaskDefinition.g:393:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:394:1: ( ruleArrayType EOF )
            // InternalTaskDefinition.g:395:1: ruleArrayType EOF
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
    // InternalTaskDefinition.g:402:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:406:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalTaskDefinition.g:407:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalTaskDefinition.g:407:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalTaskDefinition.g:408:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalTaskDefinition.g:409:3: ( rule__ArrayType__Group__0 )
            // InternalTaskDefinition.g:409:4: rule__ArrayType__Group__0
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
    // InternalTaskDefinition.g:418:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:419:1: ( ruleCardinality EOF )
            // InternalTaskDefinition.g:420:1: ruleCardinality EOF
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
    // InternalTaskDefinition.g:427:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:431:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalTaskDefinition.g:432:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalTaskDefinition.g:432:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalTaskDefinition.g:433:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalTaskDefinition.g:434:3: ( rule__Cardinality__Alternatives )
            // InternalTaskDefinition.g:434:4: rule__Cardinality__Alternatives
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
    // InternalTaskDefinition.g:443:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:444:1: ( rulePrimitiveType EOF )
            // InternalTaskDefinition.g:445:1: rulePrimitiveType EOF
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
    // InternalTaskDefinition.g:452:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:456:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalTaskDefinition.g:457:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalTaskDefinition.g:457:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalTaskDefinition.g:458:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalTaskDefinition.g:459:3: ( rule__PrimitiveType__Group__0 )
            // InternalTaskDefinition.g:459:4: rule__PrimitiveType__Group__0
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
    // InternalTaskDefinition.g:468:1: entryRuleAbstractValue : ruleAbstractValue EOF ;
    public final void entryRuleAbstractValue() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:469:1: ( ruleAbstractValue EOF )
            // InternalTaskDefinition.g:470:1: ruleAbstractValue EOF
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
    // InternalTaskDefinition.g:477:1: ruleAbstractValue : ( ( rule__AbstractValue__Alternatives ) ) ;
    public final void ruleAbstractValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:481:2: ( ( ( rule__AbstractValue__Alternatives ) ) )
            // InternalTaskDefinition.g:482:2: ( ( rule__AbstractValue__Alternatives ) )
            {
            // InternalTaskDefinition.g:482:2: ( ( rule__AbstractValue__Alternatives ) )
            // InternalTaskDefinition.g:483:3: ( rule__AbstractValue__Alternatives )
            {
             before(grammarAccess.getAbstractValueAccess().getAlternatives()); 
            // InternalTaskDefinition.g:484:3: ( rule__AbstractValue__Alternatives )
            // InternalTaskDefinition.g:484:4: rule__AbstractValue__Alternatives
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
    // InternalTaskDefinition.g:493:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:494:1: ( ruleArrayValue EOF )
            // InternalTaskDefinition.g:495:1: ruleArrayValue EOF
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
    // InternalTaskDefinition.g:502:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:506:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalTaskDefinition.g:507:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalTaskDefinition.g:507:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalTaskDefinition.g:508:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalTaskDefinition.g:509:3: ( rule__ArrayValue__Group__0 )
            // InternalTaskDefinition.g:509:4: rule__ArrayValue__Group__0
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
    // InternalTaskDefinition.g:518:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:519:1: ( ruleSingleValue EOF )
            // InternalTaskDefinition.g:520:1: ruleSingleValue EOF
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
    // InternalTaskDefinition.g:527:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:531:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalTaskDefinition.g:532:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalTaskDefinition.g:532:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalTaskDefinition.g:533:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalTaskDefinition.g:534:3: ( rule__SingleValue__Alternatives )
            // InternalTaskDefinition.g:534:4: rule__SingleValue__Alternatives
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


    // $ANTLR start "ruleTASK_RESULT_TYPES"
    // InternalTaskDefinition.g:543:1: ruleTASK_RESULT_TYPES : ( ( rule__TASK_RESULT_TYPES__Alternatives ) ) ;
    public final void ruleTASK_RESULT_TYPES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:547:1: ( ( ( rule__TASK_RESULT_TYPES__Alternatives ) ) )
            // InternalTaskDefinition.g:548:2: ( ( rule__TASK_RESULT_TYPES__Alternatives ) )
            {
            // InternalTaskDefinition.g:548:2: ( ( rule__TASK_RESULT_TYPES__Alternatives ) )
            // InternalTaskDefinition.g:549:3: ( rule__TASK_RESULT_TYPES__Alternatives )
            {
             before(grammarAccess.getTASK_RESULT_TYPESAccess().getAlternatives()); 
            // InternalTaskDefinition.g:550:3: ( rule__TASK_RESULT_TYPES__Alternatives )
            // InternalTaskDefinition.g:550:4: rule__TASK_RESULT_TYPES__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TASK_RESULT_TYPES__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTASK_RESULT_TYPESAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTASK_RESULT_TYPES"


    // $ANTLR start "rulePRIMITIVE_TYPE_NAME"
    // InternalTaskDefinition.g:559:1: rulePRIMITIVE_TYPE_NAME : ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) ;
    public final void rulePRIMITIVE_TYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:563:1: ( ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) )
            // InternalTaskDefinition.g:564:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            {
            // InternalTaskDefinition.g:564:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            // InternalTaskDefinition.g:565:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            {
             before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 
            // InternalTaskDefinition.g:566:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            // InternalTaskDefinition.g:566:4: rule__PRIMITIVE_TYPE_NAME__Alternatives
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
    // InternalTaskDefinition.g:574:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:578:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalTaskDefinition.g:579:2: ( 'true' )
                    {
                    // InternalTaskDefinition.g:579:2: ( 'true' )
                    // InternalTaskDefinition.g:580:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:585:2: ( 'false' )
                    {
                    // InternalTaskDefinition.g:585:2: ( 'false' )
                    // InternalTaskDefinition.g:586:3: 'false'
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
    // InternalTaskDefinition.g:595:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:599:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalTaskDefinition.g:600:2: ( 'E' )
                    {
                    // InternalTaskDefinition.g:600:2: ( 'E' )
                    // InternalTaskDefinition.g:601:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:606:2: ( 'e' )
                    {
                    // InternalTaskDefinition.g:606:2: ( 'e' )
                    // InternalTaskDefinition.g:607:3: 'e'
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
    // InternalTaskDefinition.g:616:1: rule__AbstractAttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) );
    public final void rule__AbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:620:1: ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=21 && LA3_0<=32)) ) {
                alt3=1;
            }
            else if ( (LA3_0==46) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTaskDefinition.g:621:2: ( rulePrimitiveType )
                    {
                    // InternalTaskDefinition.g:621:2: ( rulePrimitiveType )
                    // InternalTaskDefinition.g:622:3: rulePrimitiveType
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
                    // InternalTaskDefinition.g:627:2: ( ruleInlineEnumerationType )
                    {
                    // InternalTaskDefinition.g:627:2: ( ruleInlineEnumerationType )
                    // InternalTaskDefinition.g:628:3: ruleInlineEnumerationType
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
    // InternalTaskDefinition.g:637:1: rule__Cardinality__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:641:1: ( ( RULE_INT ) | ( '*' ) )
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
                    // InternalTaskDefinition.g:642:2: ( RULE_INT )
                    {
                    // InternalTaskDefinition.g:642:2: ( RULE_INT )
                    // InternalTaskDefinition.g:643:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:648:2: ( '*' )
                    {
                    // InternalTaskDefinition.g:648:2: ( '*' )
                    // InternalTaskDefinition.g:649:3: '*'
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
    // InternalTaskDefinition.g:658:1: rule__AbstractValue__Alternatives : ( ( ruleSingleValue ) | ( ruleArrayValue ) );
    public final void rule__AbstractValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:662:1: ( ( ruleSingleValue ) | ( ruleArrayValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||(LA5_0>=14 && LA5_0<=15)||(LA5_0>=44 && LA5_0<=45)) ) {
                alt5=1;
            }
            else if ( (LA5_0==47) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTaskDefinition.g:663:2: ( ruleSingleValue )
                    {
                    // InternalTaskDefinition.g:663:2: ( ruleSingleValue )
                    // InternalTaskDefinition.g:664:3: ruleSingleValue
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
                    // InternalTaskDefinition.g:669:2: ( ruleArrayValue )
                    {
                    // InternalTaskDefinition.g:669:2: ( ruleArrayValue )
                    // InternalTaskDefinition.g:670:3: ruleArrayValue
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
    // InternalTaskDefinition.g:679:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:683:1: ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 45:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_INT) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==EOF||(LA6_2>=RULE_ID && LA6_2<=RULE_DOCU_COMMENT)||LA6_2==35||LA6_2==42||(LA6_2>=48 && LA6_2<=49)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==44) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==44) ) {
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

                if ( (LA6_2==EOF||(LA6_2>=RULE_ID && LA6_2<=RULE_DOCU_COMMENT)||LA6_2==35||LA6_2==42||(LA6_2>=48 && LA6_2<=49)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==44) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 44:
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
                    // InternalTaskDefinition.g:684:2: ( ( rule__SingleValue__Group_0__0 ) )
                    {
                    // InternalTaskDefinition.g:684:2: ( ( rule__SingleValue__Group_0__0 ) )
                    // InternalTaskDefinition.g:685:3: ( rule__SingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_0()); 
                    // InternalTaskDefinition.g:686:3: ( rule__SingleValue__Group_0__0 )
                    // InternalTaskDefinition.g:686:4: rule__SingleValue__Group_0__0
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
                    // InternalTaskDefinition.g:690:2: ( ( rule__SingleValue__Group_1__0 ) )
                    {
                    // InternalTaskDefinition.g:690:2: ( ( rule__SingleValue__Group_1__0 ) )
                    // InternalTaskDefinition.g:691:3: ( rule__SingleValue__Group_1__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_1()); 
                    // InternalTaskDefinition.g:692:3: ( rule__SingleValue__Group_1__0 )
                    // InternalTaskDefinition.g:692:4: rule__SingleValue__Group_1__0
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
                    // InternalTaskDefinition.g:696:2: ( ( rule__SingleValue__Group_2__0 ) )
                    {
                    // InternalTaskDefinition.g:696:2: ( ( rule__SingleValue__Group_2__0 ) )
                    // InternalTaskDefinition.g:697:3: ( rule__SingleValue__Group_2__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_2()); 
                    // InternalTaskDefinition.g:698:3: ( rule__SingleValue__Group_2__0 )
                    // InternalTaskDefinition.g:698:4: rule__SingleValue__Group_2__0
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
                    // InternalTaskDefinition.g:702:2: ( ( rule__SingleValue__Group_3__0 ) )
                    {
                    // InternalTaskDefinition.g:702:2: ( ( rule__SingleValue__Group_3__0 ) )
                    // InternalTaskDefinition.g:703:3: ( rule__SingleValue__Group_3__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_3()); 
                    // InternalTaskDefinition.g:704:3: ( rule__SingleValue__Group_3__0 )
                    // InternalTaskDefinition.g:704:4: rule__SingleValue__Group_3__0
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
                    // InternalTaskDefinition.g:708:2: ( ( rule__SingleValue__Group_4__0 ) )
                    {
                    // InternalTaskDefinition.g:708:2: ( ( rule__SingleValue__Group_4__0 ) )
                    // InternalTaskDefinition.g:709:3: ( rule__SingleValue__Group_4__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_4()); 
                    // InternalTaskDefinition.g:710:3: ( rule__SingleValue__Group_4__0 )
                    // InternalTaskDefinition.g:710:4: rule__SingleValue__Group_4__0
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


    // $ANTLR start "rule__TASK_RESULT_TYPES__Alternatives"
    // InternalTaskDefinition.g:718:1: rule__TASK_RESULT_TYPES__Alternatives : ( ( ( 'SUCCESS' ) ) | ( ( 'ERROR' ) ) );
    public final void rule__TASK_RESULT_TYPES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:722:1: ( ( ( 'SUCCESS' ) ) | ( ( 'ERROR' ) ) )
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
                    // InternalTaskDefinition.g:723:2: ( ( 'SUCCESS' ) )
                    {
                    // InternalTaskDefinition.g:723:2: ( ( 'SUCCESS' ) )
                    // InternalTaskDefinition.g:724:3: ( 'SUCCESS' )
                    {
                     before(grammarAccess.getTASK_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_0()); 
                    // InternalTaskDefinition.g:725:3: ( 'SUCCESS' )
                    // InternalTaskDefinition.g:725:4: 'SUCCESS'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTASK_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:729:2: ( ( 'ERROR' ) )
                    {
                    // InternalTaskDefinition.g:729:2: ( ( 'ERROR' ) )
                    // InternalTaskDefinition.g:730:3: ( 'ERROR' )
                    {
                     before(grammarAccess.getTASK_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_1()); 
                    // InternalTaskDefinition.g:731:3: ( 'ERROR' )
                    // InternalTaskDefinition.g:731:4: 'ERROR'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTASK_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_1()); 

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
    // $ANTLR end "rule__TASK_RESULT_TYPES__Alternatives"


    // $ANTLR start "rule__PRIMITIVE_TYPE_NAME__Alternatives"
    // InternalTaskDefinition.g:739:1: rule__PRIMITIVE_TYPE_NAME__Alternatives : ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PRIMITIVE_TYPE_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:743:1: ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) )
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
                    // InternalTaskDefinition.g:744:2: ( ( 'Int8' ) )
                    {
                    // InternalTaskDefinition.g:744:2: ( ( 'Int8' ) )
                    // InternalTaskDefinition.g:745:3: ( 'Int8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 
                    // InternalTaskDefinition.g:746:3: ( 'Int8' )
                    // InternalTaskDefinition.g:746:4: 'Int8'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:750:2: ( ( 'Int16' ) )
                    {
                    // InternalTaskDefinition.g:750:2: ( ( 'Int16' ) )
                    // InternalTaskDefinition.g:751:3: ( 'Int16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 
                    // InternalTaskDefinition.g:752:3: ( 'Int16' )
                    // InternalTaskDefinition.g:752:4: 'Int16'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDefinition.g:756:2: ( ( 'Int32' ) )
                    {
                    // InternalTaskDefinition.g:756:2: ( ( 'Int32' ) )
                    // InternalTaskDefinition.g:757:3: ( 'Int32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 
                    // InternalTaskDefinition.g:758:3: ( 'Int32' )
                    // InternalTaskDefinition.g:758:4: 'Int32'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDefinition.g:762:2: ( ( 'Int64' ) )
                    {
                    // InternalTaskDefinition.g:762:2: ( ( 'Int64' ) )
                    // InternalTaskDefinition.g:763:3: ( 'Int64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 
                    // InternalTaskDefinition.g:764:3: ( 'Int64' )
                    // InternalTaskDefinition.g:764:4: 'Int64'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDefinition.g:768:2: ( ( 'UInt8' ) )
                    {
                    // InternalTaskDefinition.g:768:2: ( ( 'UInt8' ) )
                    // InternalTaskDefinition.g:769:3: ( 'UInt8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 
                    // InternalTaskDefinition.g:770:3: ( 'UInt8' )
                    // InternalTaskDefinition.g:770:4: 'UInt8'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTaskDefinition.g:774:2: ( ( 'UInt16' ) )
                    {
                    // InternalTaskDefinition.g:774:2: ( ( 'UInt16' ) )
                    // InternalTaskDefinition.g:775:3: ( 'UInt16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 
                    // InternalTaskDefinition.g:776:3: ( 'UInt16' )
                    // InternalTaskDefinition.g:776:4: 'UInt16'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTaskDefinition.g:780:2: ( ( 'UInt32' ) )
                    {
                    // InternalTaskDefinition.g:780:2: ( ( 'UInt32' ) )
                    // InternalTaskDefinition.g:781:3: ( 'UInt32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 
                    // InternalTaskDefinition.g:782:3: ( 'UInt32' )
                    // InternalTaskDefinition.g:782:4: 'UInt32'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTaskDefinition.g:786:2: ( ( 'UInt64' ) )
                    {
                    // InternalTaskDefinition.g:786:2: ( ( 'UInt64' ) )
                    // InternalTaskDefinition.g:787:3: ( 'UInt64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 
                    // InternalTaskDefinition.g:788:3: ( 'UInt64' )
                    // InternalTaskDefinition.g:788:4: 'UInt64'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTaskDefinition.g:792:2: ( ( 'Float' ) )
                    {
                    // InternalTaskDefinition.g:792:2: ( ( 'Float' ) )
                    // InternalTaskDefinition.g:793:3: ( 'Float' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 
                    // InternalTaskDefinition.g:794:3: ( 'Float' )
                    // InternalTaskDefinition.g:794:4: 'Float'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTaskDefinition.g:798:2: ( ( 'Double' ) )
                    {
                    // InternalTaskDefinition.g:798:2: ( ( 'Double' ) )
                    // InternalTaskDefinition.g:799:3: ( 'Double' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 
                    // InternalTaskDefinition.g:800:3: ( 'Double' )
                    // InternalTaskDefinition.g:800:4: 'Double'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTaskDefinition.g:804:2: ( ( 'String' ) )
                    {
                    // InternalTaskDefinition.g:804:2: ( ( 'String' ) )
                    // InternalTaskDefinition.g:805:3: ( 'String' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 
                    // InternalTaskDefinition.g:806:3: ( 'String' )
                    // InternalTaskDefinition.g:806:4: 'String'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTaskDefinition.g:810:2: ( ( 'Boolean' ) )
                    {
                    // InternalTaskDefinition.g:810:2: ( ( 'Boolean' ) )
                    // InternalTaskDefinition.g:811:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 
                    // InternalTaskDefinition.g:812:3: ( 'Boolean' )
                    // InternalTaskDefinition.g:812:4: 'Boolean'
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


    // $ANTLR start "rule__TaskDefinitionModel__Group__0"
    // InternalTaskDefinition.g:820:1: rule__TaskDefinitionModel__Group__0 : rule__TaskDefinitionModel__Group__0__Impl rule__TaskDefinitionModel__Group__1 ;
    public final void rule__TaskDefinitionModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:824:1: ( rule__TaskDefinitionModel__Group__0__Impl rule__TaskDefinitionModel__Group__1 )
            // InternalTaskDefinition.g:825:2: rule__TaskDefinitionModel__Group__0__Impl rule__TaskDefinitionModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TaskDefinitionModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinitionModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionModel__Group__0"


    // $ANTLR start "rule__TaskDefinitionModel__Group__0__Impl"
    // InternalTaskDefinition.g:832:1: rule__TaskDefinitionModel__Group__0__Impl : ( () ) ;
    public final void rule__TaskDefinitionModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:836:1: ( ( () ) )
            // InternalTaskDefinition.g:837:1: ( () )
            {
            // InternalTaskDefinition.g:837:1: ( () )
            // InternalTaskDefinition.g:838:2: ()
            {
             before(grammarAccess.getTaskDefinitionModelAccess().getTaskDefinitionModelAction_0()); 
            // InternalTaskDefinition.g:839:2: ()
            // InternalTaskDefinition.g:839:3: 
            {
            }

             after(grammarAccess.getTaskDefinitionModelAccess().getTaskDefinitionModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionModel__Group__0__Impl"


    // $ANTLR start "rule__TaskDefinitionModel__Group__1"
    // InternalTaskDefinition.g:847:1: rule__TaskDefinitionModel__Group__1 : rule__TaskDefinitionModel__Group__1__Impl ;
    public final void rule__TaskDefinitionModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:851:1: ( rule__TaskDefinitionModel__Group__1__Impl )
            // InternalTaskDefinition.g:852:2: rule__TaskDefinitionModel__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinitionModel__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionModel__Group__1"


    // $ANTLR start "rule__TaskDefinitionModel__Group__1__Impl"
    // InternalTaskDefinition.g:858:1: rule__TaskDefinitionModel__Group__1__Impl : ( ( rule__TaskDefinitionModel__RepositoryAssignment_1 )? ) ;
    public final void rule__TaskDefinitionModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:862:1: ( ( ( rule__TaskDefinitionModel__RepositoryAssignment_1 )? ) )
            // InternalTaskDefinition.g:863:1: ( ( rule__TaskDefinitionModel__RepositoryAssignment_1 )? )
            {
            // InternalTaskDefinition.g:863:1: ( ( rule__TaskDefinitionModel__RepositoryAssignment_1 )? )
            // InternalTaskDefinition.g:864:2: ( rule__TaskDefinitionModel__RepositoryAssignment_1 )?
            {
             before(grammarAccess.getTaskDefinitionModelAccess().getRepositoryAssignment_1()); 
            // InternalTaskDefinition.g:865:2: ( rule__TaskDefinitionModel__RepositoryAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDefinition.g:865:3: rule__TaskDefinitionModel__RepositoryAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDefinitionModel__RepositoryAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskDefinitionModelAccess().getRepositoryAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionModel__Group__1__Impl"


    // $ANTLR start "rule__TaskDefinitionRepository__Group__0"
    // InternalTaskDefinition.g:874:1: rule__TaskDefinitionRepository__Group__0 : rule__TaskDefinitionRepository__Group__0__Impl rule__TaskDefinitionRepository__Group__1 ;
    public final void rule__TaskDefinitionRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:878:1: ( rule__TaskDefinitionRepository__Group__0__Impl rule__TaskDefinitionRepository__Group__1 )
            // InternalTaskDefinition.g:879:2: rule__TaskDefinitionRepository__Group__0__Impl rule__TaskDefinitionRepository__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TaskDefinitionRepository__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinitionRepository__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__Group__0"


    // $ANTLR start "rule__TaskDefinitionRepository__Group__0__Impl"
    // InternalTaskDefinition.g:886:1: rule__TaskDefinitionRepository__Group__0__Impl : ( 'TaskDefinitionRepository' ) ;
    public final void rule__TaskDefinitionRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:890:1: ( ( 'TaskDefinitionRepository' ) )
            // InternalTaskDefinition.g:891:1: ( 'TaskDefinitionRepository' )
            {
            // InternalTaskDefinition.g:891:1: ( 'TaskDefinitionRepository' )
            // InternalTaskDefinition.g:892:2: 'TaskDefinitionRepository'
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getTaskDefinitionRepositoryKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionRepositoryAccess().getTaskDefinitionRepositoryKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__Group__0__Impl"


    // $ANTLR start "rule__TaskDefinitionRepository__Group__1"
    // InternalTaskDefinition.g:901:1: rule__TaskDefinitionRepository__Group__1 : rule__TaskDefinitionRepository__Group__1__Impl rule__TaskDefinitionRepository__Group__2 ;
    public final void rule__TaskDefinitionRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:905:1: ( rule__TaskDefinitionRepository__Group__1__Impl rule__TaskDefinitionRepository__Group__2 )
            // InternalTaskDefinition.g:906:2: rule__TaskDefinitionRepository__Group__1__Impl rule__TaskDefinitionRepository__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TaskDefinitionRepository__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinitionRepository__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__Group__1"


    // $ANTLR start "rule__TaskDefinitionRepository__Group__1__Impl"
    // InternalTaskDefinition.g:913:1: rule__TaskDefinitionRepository__Group__1__Impl : ( ( rule__TaskDefinitionRepository__NameAssignment_1 ) ) ;
    public final void rule__TaskDefinitionRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:917:1: ( ( ( rule__TaskDefinitionRepository__NameAssignment_1 ) ) )
            // InternalTaskDefinition.g:918:1: ( ( rule__TaskDefinitionRepository__NameAssignment_1 ) )
            {
            // InternalTaskDefinition.g:918:1: ( ( rule__TaskDefinitionRepository__NameAssignment_1 ) )
            // InternalTaskDefinition.g:919:2: ( rule__TaskDefinitionRepository__NameAssignment_1 )
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getNameAssignment_1()); 
            // InternalTaskDefinition.g:920:2: ( rule__TaskDefinitionRepository__NameAssignment_1 )
            // InternalTaskDefinition.g:920:3: rule__TaskDefinitionRepository__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinitionRepository__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskDefinitionRepositoryAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__Group__1__Impl"


    // $ANTLR start "rule__TaskDefinitionRepository__Group__2"
    // InternalTaskDefinition.g:928:1: rule__TaskDefinitionRepository__Group__2 : rule__TaskDefinitionRepository__Group__2__Impl rule__TaskDefinitionRepository__Group__3 ;
    public final void rule__TaskDefinitionRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:932:1: ( rule__TaskDefinitionRepository__Group__2__Impl rule__TaskDefinitionRepository__Group__3 )
            // InternalTaskDefinition.g:933:2: rule__TaskDefinitionRepository__Group__2__Impl rule__TaskDefinitionRepository__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__TaskDefinitionRepository__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinitionRepository__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__Group__2"


    // $ANTLR start "rule__TaskDefinitionRepository__Group__2__Impl"
    // InternalTaskDefinition.g:940:1: rule__TaskDefinitionRepository__Group__2__Impl : ( '{' ) ;
    public final void rule__TaskDefinitionRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:944:1: ( ( '{' ) )
            // InternalTaskDefinition.g:945:1: ( '{' )
            {
            // InternalTaskDefinition.g:945:1: ( '{' )
            // InternalTaskDefinition.g:946:2: '{'
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__Group__2__Impl"


    // $ANTLR start "rule__TaskDefinitionRepository__Group__3"
    // InternalTaskDefinition.g:955:1: rule__TaskDefinitionRepository__Group__3 : rule__TaskDefinitionRepository__Group__3__Impl rule__TaskDefinitionRepository__Group__4 ;
    public final void rule__TaskDefinitionRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:959:1: ( rule__TaskDefinitionRepository__Group__3__Impl rule__TaskDefinitionRepository__Group__4 )
            // InternalTaskDefinition.g:960:2: rule__TaskDefinitionRepository__Group__3__Impl rule__TaskDefinitionRepository__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__TaskDefinitionRepository__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinitionRepository__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__Group__3"


    // $ANTLR start "rule__TaskDefinitionRepository__Group__3__Impl"
    // InternalTaskDefinition.g:967:1: rule__TaskDefinitionRepository__Group__3__Impl : ( ( rule__TaskDefinitionRepository__TasksAssignment_3 )* ) ;
    public final void rule__TaskDefinitionRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:971:1: ( ( ( rule__TaskDefinitionRepository__TasksAssignment_3 )* ) )
            // InternalTaskDefinition.g:972:1: ( ( rule__TaskDefinitionRepository__TasksAssignment_3 )* )
            {
            // InternalTaskDefinition.g:972:1: ( ( rule__TaskDefinitionRepository__TasksAssignment_3 )* )
            // InternalTaskDefinition.g:973:2: ( rule__TaskDefinitionRepository__TasksAssignment_3 )*
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getTasksAssignment_3()); 
            // InternalTaskDefinition.g:974:2: ( rule__TaskDefinitionRepository__TasksAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==36) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTaskDefinition.g:974:3: rule__TaskDefinitionRepository__TasksAssignment_3
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__TaskDefinitionRepository__TasksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getTaskDefinitionRepositoryAccess().getTasksAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__Group__3__Impl"


    // $ANTLR start "rule__TaskDefinitionRepository__Group__4"
    // InternalTaskDefinition.g:982:1: rule__TaskDefinitionRepository__Group__4 : rule__TaskDefinitionRepository__Group__4__Impl ;
    public final void rule__TaskDefinitionRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:986:1: ( rule__TaskDefinitionRepository__Group__4__Impl )
            // InternalTaskDefinition.g:987:2: rule__TaskDefinitionRepository__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinitionRepository__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__Group__4"


    // $ANTLR start "rule__TaskDefinitionRepository__Group__4__Impl"
    // InternalTaskDefinition.g:993:1: rule__TaskDefinitionRepository__Group__4__Impl : ( '}' ) ;
    public final void rule__TaskDefinitionRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:997:1: ( ( '}' ) )
            // InternalTaskDefinition.g:998:1: ( '}' )
            {
            // InternalTaskDefinition.g:998:1: ( '}' )
            // InternalTaskDefinition.g:999:2: '}'
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__Group__4__Impl"


    // $ANTLR start "rule__TaskDefinition__Group__0"
    // InternalTaskDefinition.g:1009:1: rule__TaskDefinition__Group__0 : rule__TaskDefinition__Group__0__Impl rule__TaskDefinition__Group__1 ;
    public final void rule__TaskDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1013:1: ( rule__TaskDefinition__Group__0__Impl rule__TaskDefinition__Group__1 )
            // InternalTaskDefinition.g:1014:2: rule__TaskDefinition__Group__0__Impl rule__TaskDefinition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TaskDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__0"


    // $ANTLR start "rule__TaskDefinition__Group__0__Impl"
    // InternalTaskDefinition.g:1021:1: rule__TaskDefinition__Group__0__Impl : ( 'TaskDefinition' ) ;
    public final void rule__TaskDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1025:1: ( ( 'TaskDefinition' ) )
            // InternalTaskDefinition.g:1026:1: ( 'TaskDefinition' )
            {
            // InternalTaskDefinition.g:1026:1: ( 'TaskDefinition' )
            // InternalTaskDefinition.g:1027:2: 'TaskDefinition'
            {
             before(grammarAccess.getTaskDefinitionAccess().getTaskDefinitionKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getTaskDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__0__Impl"


    // $ANTLR start "rule__TaskDefinition__Group__1"
    // InternalTaskDefinition.g:1036:1: rule__TaskDefinition__Group__1 : rule__TaskDefinition__Group__1__Impl rule__TaskDefinition__Group__2 ;
    public final void rule__TaskDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1040:1: ( rule__TaskDefinition__Group__1__Impl rule__TaskDefinition__Group__2 )
            // InternalTaskDefinition.g:1041:2: rule__TaskDefinition__Group__1__Impl rule__TaskDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__TaskDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__1"


    // $ANTLR start "rule__TaskDefinition__Group__1__Impl"
    // InternalTaskDefinition.g:1048:1: rule__TaskDefinition__Group__1__Impl : ( ( rule__TaskDefinition__NameAssignment_1 ) ) ;
    public final void rule__TaskDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1052:1: ( ( ( rule__TaskDefinition__NameAssignment_1 ) ) )
            // InternalTaskDefinition.g:1053:1: ( ( rule__TaskDefinition__NameAssignment_1 ) )
            {
            // InternalTaskDefinition.g:1053:1: ( ( rule__TaskDefinition__NameAssignment_1 ) )
            // InternalTaskDefinition.g:1054:2: ( rule__TaskDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getTaskDefinitionAccess().getNameAssignment_1()); 
            // InternalTaskDefinition.g:1055:2: ( rule__TaskDefinition__NameAssignment_1 )
            // InternalTaskDefinition.g:1055:3: rule__TaskDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__1__Impl"


    // $ANTLR start "rule__TaskDefinition__Group__2"
    // InternalTaskDefinition.g:1063:1: rule__TaskDefinition__Group__2 : rule__TaskDefinition__Group__2__Impl rule__TaskDefinition__Group__3 ;
    public final void rule__TaskDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1067:1: ( rule__TaskDefinition__Group__2__Impl rule__TaskDefinition__Group__3 )
            // InternalTaskDefinition.g:1068:2: rule__TaskDefinition__Group__2__Impl rule__TaskDefinition__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TaskDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__2"


    // $ANTLR start "rule__TaskDefinition__Group__2__Impl"
    // InternalTaskDefinition.g:1075:1: rule__TaskDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1079:1: ( ( '{' ) )
            // InternalTaskDefinition.g:1080:1: ( '{' )
            {
            // InternalTaskDefinition.g:1080:1: ( '{' )
            // InternalTaskDefinition.g:1081:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__2__Impl"


    // $ANTLR start "rule__TaskDefinition__Group__3"
    // InternalTaskDefinition.g:1090:1: rule__TaskDefinition__Group__3 : rule__TaskDefinition__Group__3__Impl rule__TaskDefinition__Group__4 ;
    public final void rule__TaskDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1094:1: ( rule__TaskDefinition__Group__3__Impl rule__TaskDefinition__Group__4 )
            // InternalTaskDefinition.g:1095:2: rule__TaskDefinition__Group__3__Impl rule__TaskDefinition__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__TaskDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__3"


    // $ANTLR start "rule__TaskDefinition__Group__3__Impl"
    // InternalTaskDefinition.g:1102:1: rule__TaskDefinition__Group__3__Impl : ( ( rule__TaskDefinition__Group_3__0 )? ) ;
    public final void rule__TaskDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1106:1: ( ( ( rule__TaskDefinition__Group_3__0 )? ) )
            // InternalTaskDefinition.g:1107:1: ( ( rule__TaskDefinition__Group_3__0 )? )
            {
            // InternalTaskDefinition.g:1107:1: ( ( rule__TaskDefinition__Group_3__0 )? )
            // InternalTaskDefinition.g:1108:2: ( rule__TaskDefinition__Group_3__0 )?
            {
             before(grammarAccess.getTaskDefinitionAccess().getGroup_3()); 
            // InternalTaskDefinition.g:1109:2: ( rule__TaskDefinition__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTaskDefinition.g:1109:3: rule__TaskDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskDefinitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__3__Impl"


    // $ANTLR start "rule__TaskDefinition__Group__4"
    // InternalTaskDefinition.g:1117:1: rule__TaskDefinition__Group__4 : rule__TaskDefinition__Group__4__Impl rule__TaskDefinition__Group__5 ;
    public final void rule__TaskDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1121:1: ( rule__TaskDefinition__Group__4__Impl rule__TaskDefinition__Group__5 )
            // InternalTaskDefinition.g:1122:2: rule__TaskDefinition__Group__4__Impl rule__TaskDefinition__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__TaskDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__4"


    // $ANTLR start "rule__TaskDefinition__Group__4__Impl"
    // InternalTaskDefinition.g:1129:1: rule__TaskDefinition__Group__4__Impl : ( ( rule__TaskDefinition__Group_4__0 )? ) ;
    public final void rule__TaskDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1133:1: ( ( ( rule__TaskDefinition__Group_4__0 )? ) )
            // InternalTaskDefinition.g:1134:1: ( ( rule__TaskDefinition__Group_4__0 )? )
            {
            // InternalTaskDefinition.g:1134:1: ( ( rule__TaskDefinition__Group_4__0 )? )
            // InternalTaskDefinition.g:1135:2: ( rule__TaskDefinition__Group_4__0 )?
            {
             before(grammarAccess.getTaskDefinitionAccess().getGroup_4()); 
            // InternalTaskDefinition.g:1136:2: ( rule__TaskDefinition__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==39) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTaskDefinition.g:1136:3: rule__TaskDefinition__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TaskDefinition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskDefinitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__4__Impl"


    // $ANTLR start "rule__TaskDefinition__Group__5"
    // InternalTaskDefinition.g:1144:1: rule__TaskDefinition__Group__5 : rule__TaskDefinition__Group__5__Impl rule__TaskDefinition__Group__6 ;
    public final void rule__TaskDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1148:1: ( rule__TaskDefinition__Group__5__Impl rule__TaskDefinition__Group__6 )
            // InternalTaskDefinition.g:1149:2: rule__TaskDefinition__Group__5__Impl rule__TaskDefinition__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__TaskDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__5"


    // $ANTLR start "rule__TaskDefinition__Group__5__Impl"
    // InternalTaskDefinition.g:1156:1: rule__TaskDefinition__Group__5__Impl : ( 'results' ) ;
    public final void rule__TaskDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1160:1: ( ( 'results' ) )
            // InternalTaskDefinition.g:1161:1: ( 'results' )
            {
            // InternalTaskDefinition.g:1161:1: ( 'results' )
            // InternalTaskDefinition.g:1162:2: 'results'
            {
             before(grammarAccess.getTaskDefinitionAccess().getResultsKeyword_5()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getResultsKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__5__Impl"


    // $ANTLR start "rule__TaskDefinition__Group__6"
    // InternalTaskDefinition.g:1171:1: rule__TaskDefinition__Group__6 : rule__TaskDefinition__Group__6__Impl rule__TaskDefinition__Group__7 ;
    public final void rule__TaskDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1175:1: ( rule__TaskDefinition__Group__6__Impl rule__TaskDefinition__Group__7 )
            // InternalTaskDefinition.g:1176:2: rule__TaskDefinition__Group__6__Impl rule__TaskDefinition__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__TaskDefinition__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__6"


    // $ANTLR start "rule__TaskDefinition__Group__6__Impl"
    // InternalTaskDefinition.g:1183:1: rule__TaskDefinition__Group__6__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1187:1: ( ( '{' ) )
            // InternalTaskDefinition.g:1188:1: ( '{' )
            {
            // InternalTaskDefinition.g:1188:1: ( '{' )
            // InternalTaskDefinition.g:1189:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__6__Impl"


    // $ANTLR start "rule__TaskDefinition__Group__7"
    // InternalTaskDefinition.g:1198:1: rule__TaskDefinition__Group__7 : rule__TaskDefinition__Group__7__Impl rule__TaskDefinition__Group__8 ;
    public final void rule__TaskDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1202:1: ( rule__TaskDefinition__Group__7__Impl rule__TaskDefinition__Group__8 )
            // InternalTaskDefinition.g:1203:2: rule__TaskDefinition__Group__7__Impl rule__TaskDefinition__Group__8
            {
            pushFollow(FOLLOW_10);
            rule__TaskDefinition__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__7"


    // $ANTLR start "rule__TaskDefinition__Group__7__Impl"
    // InternalTaskDefinition.g:1210:1: rule__TaskDefinition__Group__7__Impl : ( ( ( rule__TaskDefinition__ResultsAssignment_7 ) ) ( ( rule__TaskDefinition__ResultsAssignment_7 )* ) ) ;
    public final void rule__TaskDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1214:1: ( ( ( ( rule__TaskDefinition__ResultsAssignment_7 ) ) ( ( rule__TaskDefinition__ResultsAssignment_7 )* ) ) )
            // InternalTaskDefinition.g:1215:1: ( ( ( rule__TaskDefinition__ResultsAssignment_7 ) ) ( ( rule__TaskDefinition__ResultsAssignment_7 )* ) )
            {
            // InternalTaskDefinition.g:1215:1: ( ( ( rule__TaskDefinition__ResultsAssignment_7 ) ) ( ( rule__TaskDefinition__ResultsAssignment_7 )* ) )
            // InternalTaskDefinition.g:1216:2: ( ( rule__TaskDefinition__ResultsAssignment_7 ) ) ( ( rule__TaskDefinition__ResultsAssignment_7 )* )
            {
            // InternalTaskDefinition.g:1216:2: ( ( rule__TaskDefinition__ResultsAssignment_7 ) )
            // InternalTaskDefinition.g:1217:3: ( rule__TaskDefinition__ResultsAssignment_7 )
            {
             before(grammarAccess.getTaskDefinitionAccess().getResultsAssignment_7()); 
            // InternalTaskDefinition.g:1218:3: ( rule__TaskDefinition__ResultsAssignment_7 )
            // InternalTaskDefinition.g:1218:4: rule__TaskDefinition__ResultsAssignment_7
            {
            pushFollow(FOLLOW_11);
            rule__TaskDefinition__ResultsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTaskDefinitionAccess().getResultsAssignment_7()); 

            }

            // InternalTaskDefinition.g:1221:2: ( ( rule__TaskDefinition__ResultsAssignment_7 )* )
            // InternalTaskDefinition.g:1222:3: ( rule__TaskDefinition__ResultsAssignment_7 )*
            {
             before(grammarAccess.getTaskDefinitionAccess().getResultsAssignment_7()); 
            // InternalTaskDefinition.g:1223:3: ( rule__TaskDefinition__ResultsAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=19 && LA13_0<=20)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTaskDefinition.g:1223:4: rule__TaskDefinition__ResultsAssignment_7
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TaskDefinition__ResultsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getTaskDefinitionAccess().getResultsAssignment_7()); 

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
    // $ANTLR end "rule__TaskDefinition__Group__7__Impl"


    // $ANTLR start "rule__TaskDefinition__Group__8"
    // InternalTaskDefinition.g:1232:1: rule__TaskDefinition__Group__8 : rule__TaskDefinition__Group__8__Impl rule__TaskDefinition__Group__9 ;
    public final void rule__TaskDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1236:1: ( rule__TaskDefinition__Group__8__Impl rule__TaskDefinition__Group__9 )
            // InternalTaskDefinition.g:1237:2: rule__TaskDefinition__Group__8__Impl rule__TaskDefinition__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__TaskDefinition__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__8"


    // $ANTLR start "rule__TaskDefinition__Group__8__Impl"
    // InternalTaskDefinition.g:1244:1: rule__TaskDefinition__Group__8__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1248:1: ( ( '}' ) )
            // InternalTaskDefinition.g:1249:1: ( '}' )
            {
            // InternalTaskDefinition.g:1249:1: ( '}' )
            // InternalTaskDefinition.g:1250:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__8__Impl"


    // $ANTLR start "rule__TaskDefinition__Group__9"
    // InternalTaskDefinition.g:1259:1: rule__TaskDefinition__Group__9 : rule__TaskDefinition__Group__9__Impl ;
    public final void rule__TaskDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1263:1: ( rule__TaskDefinition__Group__9__Impl )
            // InternalTaskDefinition.g:1264:2: rule__TaskDefinition__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__9"


    // $ANTLR start "rule__TaskDefinition__Group__9__Impl"
    // InternalTaskDefinition.g:1270:1: rule__TaskDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1274:1: ( ( '}' ) )
            // InternalTaskDefinition.g:1275:1: ( '}' )
            {
            // InternalTaskDefinition.g:1275:1: ( '}' )
            // InternalTaskDefinition.g:1276:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group__9__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_3__0"
    // InternalTaskDefinition.g:1286:1: rule__TaskDefinition__Group_3__0 : rule__TaskDefinition__Group_3__0__Impl rule__TaskDefinition__Group_3__1 ;
    public final void rule__TaskDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1290:1: ( rule__TaskDefinition__Group_3__0__Impl rule__TaskDefinition__Group_3__1 )
            // InternalTaskDefinition.g:1291:2: rule__TaskDefinition__Group_3__0__Impl rule__TaskDefinition__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__TaskDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_3__0"


    // $ANTLR start "rule__TaskDefinition__Group_3__0__Impl"
    // InternalTaskDefinition.g:1298:1: rule__TaskDefinition__Group_3__0__Impl : ( 'in' ) ;
    public final void rule__TaskDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1302:1: ( ( 'in' ) )
            // InternalTaskDefinition.g:1303:1: ( 'in' )
            {
            // InternalTaskDefinition.g:1303:1: ( 'in' )
            // InternalTaskDefinition.g:1304:2: 'in'
            {
             before(grammarAccess.getTaskDefinitionAccess().getInKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getInKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_3__1"
    // InternalTaskDefinition.g:1313:1: rule__TaskDefinition__Group_3__1 : rule__TaskDefinition__Group_3__1__Impl rule__TaskDefinition__Group_3__2 ;
    public final void rule__TaskDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1317:1: ( rule__TaskDefinition__Group_3__1__Impl rule__TaskDefinition__Group_3__2 )
            // InternalTaskDefinition.g:1318:2: rule__TaskDefinition__Group_3__1__Impl rule__TaskDefinition__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__TaskDefinition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_3__1"


    // $ANTLR start "rule__TaskDefinition__Group_3__1__Impl"
    // InternalTaskDefinition.g:1325:1: rule__TaskDefinition__Group_3__1__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1329:1: ( ( '{' ) )
            // InternalTaskDefinition.g:1330:1: ( '{' )
            {
            // InternalTaskDefinition.g:1330:1: ( '{' )
            // InternalTaskDefinition.g:1331:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_3__2"
    // InternalTaskDefinition.g:1340:1: rule__TaskDefinition__Group_3__2 : rule__TaskDefinition__Group_3__2__Impl rule__TaskDefinition__Group_3__3 ;
    public final void rule__TaskDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1344:1: ( rule__TaskDefinition__Group_3__2__Impl rule__TaskDefinition__Group_3__3 )
            // InternalTaskDefinition.g:1345:2: rule__TaskDefinition__Group_3__2__Impl rule__TaskDefinition__Group_3__3
            {
            pushFollow(FOLLOW_12);
            rule__TaskDefinition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_3__2"


    // $ANTLR start "rule__TaskDefinition__Group_3__2__Impl"
    // InternalTaskDefinition.g:1352:1: rule__TaskDefinition__Group_3__2__Impl : ( ( rule__TaskDefinition__InAttributeAssignment_3_2 )* ) ;
    public final void rule__TaskDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1356:1: ( ( ( rule__TaskDefinition__InAttributeAssignment_3_2 )* ) )
            // InternalTaskDefinition.g:1357:1: ( ( rule__TaskDefinition__InAttributeAssignment_3_2 )* )
            {
            // InternalTaskDefinition.g:1357:1: ( ( rule__TaskDefinition__InAttributeAssignment_3_2 )* )
            // InternalTaskDefinition.g:1358:2: ( rule__TaskDefinition__InAttributeAssignment_3_2 )*
            {
             before(grammarAccess.getTaskDefinitionAccess().getInAttributeAssignment_3_2()); 
            // InternalTaskDefinition.g:1359:2: ( rule__TaskDefinition__InAttributeAssignment_3_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_ID && LA14_0<=RULE_DOCU_COMMENT)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTaskDefinition.g:1359:3: rule__TaskDefinition__InAttributeAssignment_3_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__TaskDefinition__InAttributeAssignment_3_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getTaskDefinitionAccess().getInAttributeAssignment_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_3__2__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_3__3"
    // InternalTaskDefinition.g:1367:1: rule__TaskDefinition__Group_3__3 : rule__TaskDefinition__Group_3__3__Impl ;
    public final void rule__TaskDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1371:1: ( rule__TaskDefinition__Group_3__3__Impl )
            // InternalTaskDefinition.g:1372:2: rule__TaskDefinition__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_3__3"


    // $ANTLR start "rule__TaskDefinition__Group_3__3__Impl"
    // InternalTaskDefinition.g:1378:1: rule__TaskDefinition__Group_3__3__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1382:1: ( ( '}' ) )
            // InternalTaskDefinition.g:1383:1: ( '}' )
            {
            // InternalTaskDefinition.g:1383:1: ( '}' )
            // InternalTaskDefinition.g:1384:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_3__3__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_4__0"
    // InternalTaskDefinition.g:1394:1: rule__TaskDefinition__Group_4__0 : rule__TaskDefinition__Group_4__0__Impl rule__TaskDefinition__Group_4__1 ;
    public final void rule__TaskDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1398:1: ( rule__TaskDefinition__Group_4__0__Impl rule__TaskDefinition__Group_4__1 )
            // InternalTaskDefinition.g:1399:2: rule__TaskDefinition__Group_4__0__Impl rule__TaskDefinition__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__TaskDefinition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_4__0"


    // $ANTLR start "rule__TaskDefinition__Group_4__0__Impl"
    // InternalTaskDefinition.g:1406:1: rule__TaskDefinition__Group_4__0__Impl : ( 'out' ) ;
    public final void rule__TaskDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1410:1: ( ( 'out' ) )
            // InternalTaskDefinition.g:1411:1: ( 'out' )
            {
            // InternalTaskDefinition.g:1411:1: ( 'out' )
            // InternalTaskDefinition.g:1412:2: 'out'
            {
             before(grammarAccess.getTaskDefinitionAccess().getOutKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getOutKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_4__0__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_4__1"
    // InternalTaskDefinition.g:1421:1: rule__TaskDefinition__Group_4__1 : rule__TaskDefinition__Group_4__1__Impl rule__TaskDefinition__Group_4__2 ;
    public final void rule__TaskDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1425:1: ( rule__TaskDefinition__Group_4__1__Impl rule__TaskDefinition__Group_4__2 )
            // InternalTaskDefinition.g:1426:2: rule__TaskDefinition__Group_4__1__Impl rule__TaskDefinition__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__TaskDefinition__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_4__1"


    // $ANTLR start "rule__TaskDefinition__Group_4__1__Impl"
    // InternalTaskDefinition.g:1433:1: rule__TaskDefinition__Group_4__1__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1437:1: ( ( '{' ) )
            // InternalTaskDefinition.g:1438:1: ( '{' )
            {
            // InternalTaskDefinition.g:1438:1: ( '{' )
            // InternalTaskDefinition.g:1439:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_4__1__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_4__2"
    // InternalTaskDefinition.g:1448:1: rule__TaskDefinition__Group_4__2 : rule__TaskDefinition__Group_4__2__Impl rule__TaskDefinition__Group_4__3 ;
    public final void rule__TaskDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1452:1: ( rule__TaskDefinition__Group_4__2__Impl rule__TaskDefinition__Group_4__3 )
            // InternalTaskDefinition.g:1453:2: rule__TaskDefinition__Group_4__2__Impl rule__TaskDefinition__Group_4__3
            {
            pushFollow(FOLLOW_12);
            rule__TaskDefinition__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_4__2"


    // $ANTLR start "rule__TaskDefinition__Group_4__2__Impl"
    // InternalTaskDefinition.g:1460:1: rule__TaskDefinition__Group_4__2__Impl : ( ( rule__TaskDefinition__OutAttributeAssignment_4_2 )* ) ;
    public final void rule__TaskDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1464:1: ( ( ( rule__TaskDefinition__OutAttributeAssignment_4_2 )* ) )
            // InternalTaskDefinition.g:1465:1: ( ( rule__TaskDefinition__OutAttributeAssignment_4_2 )* )
            {
            // InternalTaskDefinition.g:1465:1: ( ( rule__TaskDefinition__OutAttributeAssignment_4_2 )* )
            // InternalTaskDefinition.g:1466:2: ( rule__TaskDefinition__OutAttributeAssignment_4_2 )*
            {
             before(grammarAccess.getTaskDefinitionAccess().getOutAttributeAssignment_4_2()); 
            // InternalTaskDefinition.g:1467:2: ( rule__TaskDefinition__OutAttributeAssignment_4_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_DOCU_COMMENT)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTaskDefinition.g:1467:3: rule__TaskDefinition__OutAttributeAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__TaskDefinition__OutAttributeAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getTaskDefinitionAccess().getOutAttributeAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_4__2__Impl"


    // $ANTLR start "rule__TaskDefinition__Group_4__3"
    // InternalTaskDefinition.g:1475:1: rule__TaskDefinition__Group_4__3 : rule__TaskDefinition__Group_4__3__Impl ;
    public final void rule__TaskDefinition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1479:1: ( rule__TaskDefinition__Group_4__3__Impl )
            // InternalTaskDefinition.g:1480:2: rule__TaskDefinition__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskDefinition__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_4__3"


    // $ANTLR start "rule__TaskDefinition__Group_4__3__Impl"
    // InternalTaskDefinition.g:1486:1: rule__TaskDefinition__Group_4__3__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1490:1: ( ( '}' ) )
            // InternalTaskDefinition.g:1491:1: ( '}' )
            {
            // InternalTaskDefinition.g:1491:1: ( '}' )
            // InternalTaskDefinition.g:1492:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__Group_4__3__Impl"


    // $ANTLR start "rule__TaskResult__Group__0"
    // InternalTaskDefinition.g:1502:1: rule__TaskResult__Group__0 : rule__TaskResult__Group__0__Impl rule__TaskResult__Group__1 ;
    public final void rule__TaskResult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1506:1: ( rule__TaskResult__Group__0__Impl rule__TaskResult__Group__1 )
            // InternalTaskDefinition.g:1507:2: rule__TaskResult__Group__0__Impl rule__TaskResult__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__TaskResult__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskResult__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__Group__0"


    // $ANTLR start "rule__TaskResult__Group__0__Impl"
    // InternalTaskDefinition.g:1514:1: rule__TaskResult__Group__0__Impl : ( ( rule__TaskResult__ResultAssignment_0 ) ) ;
    public final void rule__TaskResult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1518:1: ( ( ( rule__TaskResult__ResultAssignment_0 ) ) )
            // InternalTaskDefinition.g:1519:1: ( ( rule__TaskResult__ResultAssignment_0 ) )
            {
            // InternalTaskDefinition.g:1519:1: ( ( rule__TaskResult__ResultAssignment_0 ) )
            // InternalTaskDefinition.g:1520:2: ( rule__TaskResult__ResultAssignment_0 )
            {
             before(grammarAccess.getTaskResultAccess().getResultAssignment_0()); 
            // InternalTaskDefinition.g:1521:2: ( rule__TaskResult__ResultAssignment_0 )
            // InternalTaskDefinition.g:1521:3: rule__TaskResult__ResultAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TaskResult__ResultAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTaskResultAccess().getResultAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__Group__0__Impl"


    // $ANTLR start "rule__TaskResult__Group__1"
    // InternalTaskDefinition.g:1529:1: rule__TaskResult__Group__1 : rule__TaskResult__Group__1__Impl rule__TaskResult__Group__2 ;
    public final void rule__TaskResult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1533:1: ( rule__TaskResult__Group__1__Impl rule__TaskResult__Group__2 )
            // InternalTaskDefinition.g:1534:2: rule__TaskResult__Group__1__Impl rule__TaskResult__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__TaskResult__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskResult__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__Group__1"


    // $ANTLR start "rule__TaskResult__Group__1__Impl"
    // InternalTaskDefinition.g:1541:1: rule__TaskResult__Group__1__Impl : ( 'value' ) ;
    public final void rule__TaskResult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1545:1: ( ( 'value' ) )
            // InternalTaskDefinition.g:1546:1: ( 'value' )
            {
            // InternalTaskDefinition.g:1546:1: ( 'value' )
            // InternalTaskDefinition.g:1547:2: 'value'
            {
             before(grammarAccess.getTaskResultAccess().getValueKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getTaskResultAccess().getValueKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__Group__1__Impl"


    // $ANTLR start "rule__TaskResult__Group__2"
    // InternalTaskDefinition.g:1556:1: rule__TaskResult__Group__2 : rule__TaskResult__Group__2__Impl rule__TaskResult__Group__3 ;
    public final void rule__TaskResult__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1560:1: ( rule__TaskResult__Group__2__Impl rule__TaskResult__Group__3 )
            // InternalTaskDefinition.g:1561:2: rule__TaskResult__Group__2__Impl rule__TaskResult__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__TaskResult__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskResult__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__Group__2"


    // $ANTLR start "rule__TaskResult__Group__2__Impl"
    // InternalTaskDefinition.g:1568:1: rule__TaskResult__Group__2__Impl : ( '=' ) ;
    public final void rule__TaskResult__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1572:1: ( ( '=' ) )
            // InternalTaskDefinition.g:1573:1: ( '=' )
            {
            // InternalTaskDefinition.g:1573:1: ( '=' )
            // InternalTaskDefinition.g:1574:2: '='
            {
             before(grammarAccess.getTaskResultAccess().getEqualsSignKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getTaskResultAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__Group__2__Impl"


    // $ANTLR start "rule__TaskResult__Group__3"
    // InternalTaskDefinition.g:1583:1: rule__TaskResult__Group__3 : rule__TaskResult__Group__3__Impl rule__TaskResult__Group__4 ;
    public final void rule__TaskResult__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1587:1: ( rule__TaskResult__Group__3__Impl rule__TaskResult__Group__4 )
            // InternalTaskDefinition.g:1588:2: rule__TaskResult__Group__3__Impl rule__TaskResult__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__TaskResult__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskResult__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__Group__3"


    // $ANTLR start "rule__TaskResult__Group__3__Impl"
    // InternalTaskDefinition.g:1595:1: rule__TaskResult__Group__3__Impl : ( ( rule__TaskResult__ResultValueAssignment_3 ) ) ;
    public final void rule__TaskResult__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1599:1: ( ( ( rule__TaskResult__ResultValueAssignment_3 ) ) )
            // InternalTaskDefinition.g:1600:1: ( ( rule__TaskResult__ResultValueAssignment_3 ) )
            {
            // InternalTaskDefinition.g:1600:1: ( ( rule__TaskResult__ResultValueAssignment_3 ) )
            // InternalTaskDefinition.g:1601:2: ( rule__TaskResult__ResultValueAssignment_3 )
            {
             before(grammarAccess.getTaskResultAccess().getResultValueAssignment_3()); 
            // InternalTaskDefinition.g:1602:2: ( rule__TaskResult__ResultValueAssignment_3 )
            // InternalTaskDefinition.g:1602:3: rule__TaskResult__ResultValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__TaskResult__ResultValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskResultAccess().getResultValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__Group__3__Impl"


    // $ANTLR start "rule__TaskResult__Group__4"
    // InternalTaskDefinition.g:1610:1: rule__TaskResult__Group__4 : rule__TaskResult__Group__4__Impl ;
    public final void rule__TaskResult__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1614:1: ( rule__TaskResult__Group__4__Impl )
            // InternalTaskDefinition.g:1615:2: rule__TaskResult__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskResult__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__Group__4"


    // $ANTLR start "rule__TaskResult__Group__4__Impl"
    // InternalTaskDefinition.g:1621:1: rule__TaskResult__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__TaskResult__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1625:1: ( ( ( ';' )? ) )
            // InternalTaskDefinition.g:1626:1: ( ( ';' )? )
            {
            // InternalTaskDefinition.g:1626:1: ( ( ';' )? )
            // InternalTaskDefinition.g:1627:2: ( ';' )?
            {
             before(grammarAccess.getTaskResultAccess().getSemicolonKeyword_4()); 
            // InternalTaskDefinition.g:1628:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTaskDefinition.g:1628:3: ';'
                    {
                    match(input,42,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTaskResultAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__Group__4__Impl"


    // $ANTLR start "rule__AttributeDefinition__Group__0"
    // InternalTaskDefinition.g:1637:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1641:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalTaskDefinition.g:1642:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
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
    // InternalTaskDefinition.g:1649:1: rule__AttributeDefinition__Group__0__Impl : ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1653:1: ( ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? ) )
            // InternalTaskDefinition.g:1654:1: ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? )
            {
            // InternalTaskDefinition.g:1654:1: ( ( rule__AttributeDefinition__DocumentationAssignment_0 )? )
            // InternalTaskDefinition.g:1655:2: ( rule__AttributeDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalTaskDefinition.g:1656:2: ( rule__AttributeDefinition__DocumentationAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOCU_COMMENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTaskDefinition.g:1656:3: rule__AttributeDefinition__DocumentationAssignment_0
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
    // InternalTaskDefinition.g:1664:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1668:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalTaskDefinition.g:1669:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
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
    // InternalTaskDefinition.g:1676:1: rule__AttributeDefinition__Group__1__Impl : ( ( rule__AttributeDefinition__NameAssignment_1 ) ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1680:1: ( ( ( rule__AttributeDefinition__NameAssignment_1 ) ) )
            // InternalTaskDefinition.g:1681:1: ( ( rule__AttributeDefinition__NameAssignment_1 ) )
            {
            // InternalTaskDefinition.g:1681:1: ( ( rule__AttributeDefinition__NameAssignment_1 ) )
            // InternalTaskDefinition.g:1682:2: ( rule__AttributeDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_1()); 
            // InternalTaskDefinition.g:1683:2: ( rule__AttributeDefinition__NameAssignment_1 )
            // InternalTaskDefinition.g:1683:3: rule__AttributeDefinition__NameAssignment_1
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
    // InternalTaskDefinition.g:1691:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1695:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalTaskDefinition.g:1696:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
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
    // InternalTaskDefinition.g:1703:1: rule__AttributeDefinition__Group__2__Impl : ( ':' ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1707:1: ( ( ':' ) )
            // InternalTaskDefinition.g:1708:1: ( ':' )
            {
            // InternalTaskDefinition.g:1708:1: ( ':' )
            // InternalTaskDefinition.g:1709:2: ':'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_2()); 
            match(input,43,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1718:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1722:1: ( rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 )
            // InternalTaskDefinition.g:1723:2: rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4
            {
            pushFollow(FOLLOW_21);
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
    // InternalTaskDefinition.g:1730:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__TypeAssignment_3 ) ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1734:1: ( ( ( rule__AttributeDefinition__TypeAssignment_3 ) ) )
            // InternalTaskDefinition.g:1735:1: ( ( rule__AttributeDefinition__TypeAssignment_3 ) )
            {
            // InternalTaskDefinition.g:1735:1: ( ( rule__AttributeDefinition__TypeAssignment_3 ) )
            // InternalTaskDefinition.g:1736:2: ( rule__AttributeDefinition__TypeAssignment_3 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_3()); 
            // InternalTaskDefinition.g:1737:2: ( rule__AttributeDefinition__TypeAssignment_3 )
            // InternalTaskDefinition.g:1737:3: rule__AttributeDefinition__TypeAssignment_3
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
    // InternalTaskDefinition.g:1745:1: rule__AttributeDefinition__Group__4 : rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5 ;
    public final void rule__AttributeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1749:1: ( rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5 )
            // InternalTaskDefinition.g:1750:2: rule__AttributeDefinition__Group__4__Impl rule__AttributeDefinition__Group__5
            {
            pushFollow(FOLLOW_21);
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
    // InternalTaskDefinition.g:1757:1: rule__AttributeDefinition__Group__4__Impl : ( ( rule__AttributeDefinition__Group_4__0 )? ) ;
    public final void rule__AttributeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1761:1: ( ( ( rule__AttributeDefinition__Group_4__0 )? ) )
            // InternalTaskDefinition.g:1762:1: ( ( rule__AttributeDefinition__Group_4__0 )? )
            {
            // InternalTaskDefinition.g:1762:1: ( ( rule__AttributeDefinition__Group_4__0 )? )
            // InternalTaskDefinition.g:1763:2: ( rule__AttributeDefinition__Group_4__0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup_4()); 
            // InternalTaskDefinition.g:1764:2: ( rule__AttributeDefinition__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==41) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTaskDefinition.g:1764:3: rule__AttributeDefinition__Group_4__0
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
    // InternalTaskDefinition.g:1772:1: rule__AttributeDefinition__Group__5 : rule__AttributeDefinition__Group__5__Impl ;
    public final void rule__AttributeDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1776:1: ( rule__AttributeDefinition__Group__5__Impl )
            // InternalTaskDefinition.g:1777:2: rule__AttributeDefinition__Group__5__Impl
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
    // InternalTaskDefinition.g:1783:1: rule__AttributeDefinition__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__AttributeDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1787:1: ( ( ( ';' )? ) )
            // InternalTaskDefinition.g:1788:1: ( ( ';' )? )
            {
            // InternalTaskDefinition.g:1788:1: ( ( ';' )? )
            // InternalTaskDefinition.g:1789:2: ( ';' )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_5()); 
            // InternalTaskDefinition.g:1790:2: ( ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==42) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTaskDefinition.g:1790:3: ';'
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalTaskDefinition.g:1799:1: rule__AttributeDefinition__Group_4__0 : rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1 ;
    public final void rule__AttributeDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1803:1: ( rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1 )
            // InternalTaskDefinition.g:1804:2: rule__AttributeDefinition__Group_4__0__Impl rule__AttributeDefinition__Group_4__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTaskDefinition.g:1811:1: rule__AttributeDefinition__Group_4__0__Impl : ( '=' ) ;
    public final void rule__AttributeDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1815:1: ( ( '=' ) )
            // InternalTaskDefinition.g:1816:1: ( '=' )
            {
            // InternalTaskDefinition.g:1816:1: ( '=' )
            // InternalTaskDefinition.g:1817:2: '='
            {
             before(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1826:1: rule__AttributeDefinition__Group_4__1 : rule__AttributeDefinition__Group_4__1__Impl ;
    public final void rule__AttributeDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1830:1: ( rule__AttributeDefinition__Group_4__1__Impl )
            // InternalTaskDefinition.g:1831:2: rule__AttributeDefinition__Group_4__1__Impl
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
    // InternalTaskDefinition.g:1837:1: rule__AttributeDefinition__Group_4__1__Impl : ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) ) ;
    public final void rule__AttributeDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1841:1: ( ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) ) )
            // InternalTaskDefinition.g:1842:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) )
            {
            // InternalTaskDefinition.g:1842:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 ) )
            // InternalTaskDefinition.g:1843:2: ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_4_1()); 
            // InternalTaskDefinition.g:1844:2: ( rule__AttributeDefinition__DefaultvalueAssignment_4_1 )
            // InternalTaskDefinition.g:1844:3: rule__AttributeDefinition__DefaultvalueAssignment_4_1
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
    // InternalTaskDefinition.g:1853:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1857:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalTaskDefinition.g:1858:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalTaskDefinition.g:1865:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1869:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:1870:1: ( RULE_ID )
            {
            // InternalTaskDefinition.g:1870:1: ( RULE_ID )
            // InternalTaskDefinition.g:1871:2: RULE_ID
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
    // InternalTaskDefinition.g:1880:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1884:1: ( rule__FQN__Group__1__Impl )
            // InternalTaskDefinition.g:1885:2: rule__FQN__Group__1__Impl
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
    // InternalTaskDefinition.g:1891:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1895:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalTaskDefinition.g:1896:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalTaskDefinition.g:1896:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalTaskDefinition.g:1897:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalTaskDefinition.g:1898:2: ( rule__FQN__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==44) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalTaskDefinition.g:1898:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_24);
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
    // InternalTaskDefinition.g:1907:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1911:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalTaskDefinition.g:1912:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalTaskDefinition.g:1919:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1923:1: ( ( '.' ) )
            // InternalTaskDefinition.g:1924:1: ( '.' )
            {
            // InternalTaskDefinition.g:1924:1: ( '.' )
            // InternalTaskDefinition.g:1925:2: '.'
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
    // InternalTaskDefinition.g:1934:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1938:1: ( rule__FQN__Group_1__1__Impl )
            // InternalTaskDefinition.g:1939:2: rule__FQN__Group_1__1__Impl
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
    // InternalTaskDefinition.g:1945:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1949:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:1950:1: ( RULE_ID )
            {
            // InternalTaskDefinition.g:1950:1: ( RULE_ID )
            // InternalTaskDefinition.g:1951:2: RULE_ID
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
    // InternalTaskDefinition.g:1961:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1965:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTaskDefinition.g:1966:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTaskDefinition.g:1973:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1977:1: ( ( ( '-' )? ) )
            // InternalTaskDefinition.g:1978:1: ( ( '-' )? )
            {
            // InternalTaskDefinition.g:1978:1: ( ( '-' )? )
            // InternalTaskDefinition.g:1979:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTaskDefinition.g:1980:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==45) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTaskDefinition.g:1980:3: '-'
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
    // InternalTaskDefinition.g:1988:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1992:1: ( rule__EInt__Group__1__Impl )
            // InternalTaskDefinition.g:1993:2: rule__EInt__Group__1__Impl
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
    // InternalTaskDefinition.g:1999:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2003:1: ( ( RULE_INT ) )
            // InternalTaskDefinition.g:2004:1: ( RULE_INT )
            {
            // InternalTaskDefinition.g:2004:1: ( RULE_INT )
            // InternalTaskDefinition.g:2005:2: RULE_INT
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
    // InternalTaskDefinition.g:2015:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2019:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalTaskDefinition.g:2020:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTaskDefinition.g:2027:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2031:1: ( ( ( '-' )? ) )
            // InternalTaskDefinition.g:2032:1: ( ( '-' )? )
            {
            // InternalTaskDefinition.g:2032:1: ( ( '-' )? )
            // InternalTaskDefinition.g:2033:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalTaskDefinition.g:2034:2: ( '-' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==45) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTaskDefinition.g:2034:3: '-'
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
    // InternalTaskDefinition.g:2042:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2046:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalTaskDefinition.g:2047:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalTaskDefinition.g:2054:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2058:1: ( ( ( RULE_INT )? ) )
            // InternalTaskDefinition.g:2059:1: ( ( RULE_INT )? )
            {
            // InternalTaskDefinition.g:2059:1: ( ( RULE_INT )? )
            // InternalTaskDefinition.g:2060:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalTaskDefinition.g:2061:2: ( RULE_INT )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTaskDefinition.g:2061:3: RULE_INT
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
    // InternalTaskDefinition.g:2069:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2073:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalTaskDefinition.g:2074:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalTaskDefinition.g:2081:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2085:1: ( ( '.' ) )
            // InternalTaskDefinition.g:2086:1: ( '.' )
            {
            // InternalTaskDefinition.g:2086:1: ( '.' )
            // InternalTaskDefinition.g:2087:2: '.'
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
    // InternalTaskDefinition.g:2096:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2100:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalTaskDefinition.g:2101:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_28);
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
    // InternalTaskDefinition.g:2108:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2112:1: ( ( RULE_INT ) )
            // InternalTaskDefinition.g:2113:1: ( RULE_INT )
            {
            // InternalTaskDefinition.g:2113:1: ( RULE_INT )
            // InternalTaskDefinition.g:2114:2: RULE_INT
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
    // InternalTaskDefinition.g:2123:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2127:1: ( rule__EDouble__Group__4__Impl )
            // InternalTaskDefinition.g:2128:2: rule__EDouble__Group__4__Impl
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
    // InternalTaskDefinition.g:2134:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2138:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalTaskDefinition.g:2139:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalTaskDefinition.g:2139:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalTaskDefinition.g:2140:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalTaskDefinition.g:2141:2: ( rule__EDouble__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( ((LA24_0>=16 && LA24_0<=17)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTaskDefinition.g:2141:3: rule__EDouble__Group_4__0
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
    // InternalTaskDefinition.g:2150:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2154:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalTaskDefinition.g:2155:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTaskDefinition.g:2162:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2166:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalTaskDefinition.g:2167:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalTaskDefinition.g:2167:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalTaskDefinition.g:2168:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalTaskDefinition.g:2169:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalTaskDefinition.g:2169:3: rule__EDouble__Alternatives_4_0
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
    // InternalTaskDefinition.g:2177:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2181:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalTaskDefinition.g:2182:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalTaskDefinition.g:2189:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2193:1: ( ( ( '-' )? ) )
            // InternalTaskDefinition.g:2194:1: ( ( '-' )? )
            {
            // InternalTaskDefinition.g:2194:1: ( ( '-' )? )
            // InternalTaskDefinition.g:2195:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalTaskDefinition.g:2196:2: ( '-' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==45) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTaskDefinition.g:2196:3: '-'
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
    // InternalTaskDefinition.g:2204:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2208:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalTaskDefinition.g:2209:2: rule__EDouble__Group_4__2__Impl
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
    // InternalTaskDefinition.g:2215:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2219:1: ( ( RULE_INT ) )
            // InternalTaskDefinition.g:2220:1: ( RULE_INT )
            {
            // InternalTaskDefinition.g:2220:1: ( RULE_INT )
            // InternalTaskDefinition.g:2221:2: RULE_INT
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
    // InternalTaskDefinition.g:2231:1: rule__EnumerationElement__Group__0 : rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 ;
    public final void rule__EnumerationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2235:1: ( rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 )
            // InternalTaskDefinition.g:2236:2: rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalTaskDefinition.g:2243:1: rule__EnumerationElement__Group__0__Impl : ( ( rule__EnumerationElement__NameAssignment_0 ) ) ;
    public final void rule__EnumerationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2247:1: ( ( ( rule__EnumerationElement__NameAssignment_0 ) ) )
            // InternalTaskDefinition.g:2248:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            {
            // InternalTaskDefinition.g:2248:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            // InternalTaskDefinition.g:2249:2: ( rule__EnumerationElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 
            // InternalTaskDefinition.g:2250:2: ( rule__EnumerationElement__NameAssignment_0 )
            // InternalTaskDefinition.g:2250:3: rule__EnumerationElement__NameAssignment_0
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
    // InternalTaskDefinition.g:2258:1: rule__EnumerationElement__Group__1 : rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 ;
    public final void rule__EnumerationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2262:1: ( rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 )
            // InternalTaskDefinition.g:2263:2: rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalTaskDefinition.g:2270:1: rule__EnumerationElement__Group__1__Impl : ( ( rule__EnumerationElement__Group_1__0 )? ) ;
    public final void rule__EnumerationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2274:1: ( ( ( rule__EnumerationElement__Group_1__0 )? ) )
            // InternalTaskDefinition.g:2275:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            {
            // InternalTaskDefinition.g:2275:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            // InternalTaskDefinition.g:2276:2: ( rule__EnumerationElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup_1()); 
            // InternalTaskDefinition.g:2277:2: ( rule__EnumerationElement__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==41) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTaskDefinition.g:2277:3: rule__EnumerationElement__Group_1__0
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
    // InternalTaskDefinition.g:2285:1: rule__EnumerationElement__Group__2 : rule__EnumerationElement__Group__2__Impl ;
    public final void rule__EnumerationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2289:1: ( rule__EnumerationElement__Group__2__Impl )
            // InternalTaskDefinition.g:2290:2: rule__EnumerationElement__Group__2__Impl
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
    // InternalTaskDefinition.g:2296:1: rule__EnumerationElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__EnumerationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2300:1: ( ( ( ';' )? ) )
            // InternalTaskDefinition.g:2301:1: ( ( ';' )? )
            {
            // InternalTaskDefinition.g:2301:1: ( ( ';' )? )
            // InternalTaskDefinition.g:2302:2: ( ';' )?
            {
             before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 
            // InternalTaskDefinition.g:2303:2: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTaskDefinition.g:2303:3: ';'
                    {
                    match(input,42,FOLLOW_2); 

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
    // InternalTaskDefinition.g:2312:1: rule__EnumerationElement__Group_1__0 : rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 ;
    public final void rule__EnumerationElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2316:1: ( rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 )
            // InternalTaskDefinition.g:2317:2: rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTaskDefinition.g:2324:1: rule__EnumerationElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2328:1: ( ( '=' ) )
            // InternalTaskDefinition.g:2329:1: ( '=' )
            {
            // InternalTaskDefinition.g:2329:1: ( '=' )
            // InternalTaskDefinition.g:2330:2: '='
            {
             before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTaskDefinition.g:2339:1: rule__EnumerationElement__Group_1__1 : rule__EnumerationElement__Group_1__1__Impl ;
    public final void rule__EnumerationElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2343:1: ( rule__EnumerationElement__Group_1__1__Impl )
            // InternalTaskDefinition.g:2344:2: rule__EnumerationElement__Group_1__1__Impl
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
    // InternalTaskDefinition.g:2350:1: rule__EnumerationElement__Group_1__1__Impl : ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2354:1: ( ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) )
            // InternalTaskDefinition.g:2355:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            {
            // InternalTaskDefinition.g:2355:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            // InternalTaskDefinition.g:2356:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 
            // InternalTaskDefinition.g:2357:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            // InternalTaskDefinition.g:2357:3: rule__EnumerationElement__ValueAssignment_1_1
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
    // InternalTaskDefinition.g:2366:1: rule__InlineEnumerationType__Group__0 : rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 ;
    public final void rule__InlineEnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2370:1: ( rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 )
            // InternalTaskDefinition.g:2371:2: rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTaskDefinition.g:2378:1: rule__InlineEnumerationType__Group__0__Impl : ( 'InlineEnumeration' ) ;
    public final void rule__InlineEnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2382:1: ( ( 'InlineEnumeration' ) )
            // InternalTaskDefinition.g:2383:1: ( 'InlineEnumeration' )
            {
            // InternalTaskDefinition.g:2383:1: ( 'InlineEnumeration' )
            // InternalTaskDefinition.g:2384:2: 'InlineEnumeration'
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
    // InternalTaskDefinition.g:2393:1: rule__InlineEnumerationType__Group__1 : rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 ;
    public final void rule__InlineEnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2397:1: ( rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 )
            // InternalTaskDefinition.g:2398:2: rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalTaskDefinition.g:2405:1: rule__InlineEnumerationType__Group__1__Impl : ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) ;
    public final void rule__InlineEnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2409:1: ( ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) )
            // InternalTaskDefinition.g:2410:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            {
            // InternalTaskDefinition.g:2410:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            // InternalTaskDefinition.g:2411:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 
            // InternalTaskDefinition.g:2412:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==47) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalTaskDefinition.g:2412:3: rule__InlineEnumerationType__ArrayAssignment_1
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
    // InternalTaskDefinition.g:2420:1: rule__InlineEnumerationType__Group__2 : rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 ;
    public final void rule__InlineEnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2424:1: ( rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 )
            // InternalTaskDefinition.g:2425:2: rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3
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
    // InternalTaskDefinition.g:2432:1: rule__InlineEnumerationType__Group__2__Impl : ( '{' ) ;
    public final void rule__InlineEnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2436:1: ( ( '{' ) )
            // InternalTaskDefinition.g:2437:1: ( '{' )
            {
            // InternalTaskDefinition.g:2437:1: ( '{' )
            // InternalTaskDefinition.g:2438:2: '{'
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
    // InternalTaskDefinition.g:2447:1: rule__InlineEnumerationType__Group__3 : rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 ;
    public final void rule__InlineEnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2451:1: ( rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 )
            // InternalTaskDefinition.g:2452:2: rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalTaskDefinition.g:2459:1: rule__InlineEnumerationType__Group__3__Impl : ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) ;
    public final void rule__InlineEnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2463:1: ( ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) )
            // InternalTaskDefinition.g:2464:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            {
            // InternalTaskDefinition.g:2464:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            // InternalTaskDefinition.g:2465:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            {
            // InternalTaskDefinition.g:2465:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) )
            // InternalTaskDefinition.g:2466:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalTaskDefinition.g:2467:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            // InternalTaskDefinition.g:2467:4: rule__InlineEnumerationType__EnumsAssignment_3
            {
            pushFollow(FOLLOW_30);
            rule__InlineEnumerationType__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }

            // InternalTaskDefinition.g:2470:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            // InternalTaskDefinition.g:2471:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalTaskDefinition.g:2472:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_ID) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalTaskDefinition.g:2472:4: rule__InlineEnumerationType__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_30);
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
    // InternalTaskDefinition.g:2481:1: rule__InlineEnumerationType__Group__4 : rule__InlineEnumerationType__Group__4__Impl ;
    public final void rule__InlineEnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2485:1: ( rule__InlineEnumerationType__Group__4__Impl )
            // InternalTaskDefinition.g:2486:2: rule__InlineEnumerationType__Group__4__Impl
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
    // InternalTaskDefinition.g:2492:1: rule__InlineEnumerationType__Group__4__Impl : ( '}' ) ;
    public final void rule__InlineEnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2496:1: ( ( '}' ) )
            // InternalTaskDefinition.g:2497:1: ( '}' )
            {
            // InternalTaskDefinition.g:2497:1: ( '}' )
            // InternalTaskDefinition.g:2498:2: '}'
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
    // InternalTaskDefinition.g:2508:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2512:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalTaskDefinition.g:2513:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
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
    // InternalTaskDefinition.g:2520:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2524:1: ( ( () ) )
            // InternalTaskDefinition.g:2525:1: ( () )
            {
            // InternalTaskDefinition.g:2525:1: ( () )
            // InternalTaskDefinition.g:2526:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // InternalTaskDefinition.g:2527:2: ()
            // InternalTaskDefinition.g:2527:3: 
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
    // InternalTaskDefinition.g:2535:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2539:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalTaskDefinition.g:2540:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
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
    // InternalTaskDefinition.g:2547:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2551:1: ( ( '[' ) )
            // InternalTaskDefinition.g:2552:1: ( '[' )
            {
            // InternalTaskDefinition.g:2552:1: ( '[' )
            // InternalTaskDefinition.g:2553:2: '['
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
    // InternalTaskDefinition.g:2562:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2566:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalTaskDefinition.g:2567:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
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
    // InternalTaskDefinition.g:2574:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__LengthAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2578:1: ( ( ( rule__ArrayType__LengthAssignment_2 )? ) )
            // InternalTaskDefinition.g:2579:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            {
            // InternalTaskDefinition.g:2579:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            // InternalTaskDefinition.g:2580:2: ( rule__ArrayType__LengthAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 
            // InternalTaskDefinition.g:2581:2: ( rule__ArrayType__LengthAssignment_2 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_INT||LA30_0==18) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTaskDefinition.g:2581:3: rule__ArrayType__LengthAssignment_2
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
    // InternalTaskDefinition.g:2589:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2593:1: ( rule__ArrayType__Group__3__Impl )
            // InternalTaskDefinition.g:2594:2: rule__ArrayType__Group__3__Impl
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
    // InternalTaskDefinition.g:2600:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2604:1: ( ( ']' ) )
            // InternalTaskDefinition.g:2605:1: ( ']' )
            {
            // InternalTaskDefinition.g:2605:1: ( ']' )
            // InternalTaskDefinition.g:2606:2: ']'
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
    // InternalTaskDefinition.g:2616:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2620:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalTaskDefinition.g:2621:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
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
    // InternalTaskDefinition.g:2628:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2632:1: ( ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) )
            // InternalTaskDefinition.g:2633:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            {
            // InternalTaskDefinition.g:2633:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            // InternalTaskDefinition.g:2634:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 
            // InternalTaskDefinition.g:2635:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            // InternalTaskDefinition.g:2635:3: rule__PrimitiveType__TypeNameAssignment_0
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
    // InternalTaskDefinition.g:2643:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2647:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalTaskDefinition.g:2648:2: rule__PrimitiveType__Group__1__Impl
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
    // InternalTaskDefinition.g:2654:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2658:1: ( ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) )
            // InternalTaskDefinition.g:2659:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            {
            // InternalTaskDefinition.g:2659:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            // InternalTaskDefinition.g:2660:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 
            // InternalTaskDefinition.g:2661:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalTaskDefinition.g:2661:3: rule__PrimitiveType__ArrayAssignment_1
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
    // InternalTaskDefinition.g:2670:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2674:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalTaskDefinition.g:2675:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
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
    // InternalTaskDefinition.g:2682:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2686:1: ( ( '[' ) )
            // InternalTaskDefinition.g:2687:1: ( '[' )
            {
            // InternalTaskDefinition.g:2687:1: ( '[' )
            // InternalTaskDefinition.g:2688:2: '['
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
    // InternalTaskDefinition.g:2697:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2701:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalTaskDefinition.g:2702:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
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
    // InternalTaskDefinition.g:2709:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2713:1: ( ( ( rule__ArrayValue__ValuesAssignment_1 ) ) )
            // InternalTaskDefinition.g:2714:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            {
            // InternalTaskDefinition.g:2714:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            // InternalTaskDefinition.g:2715:2: ( rule__ArrayValue__ValuesAssignment_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 
            // InternalTaskDefinition.g:2716:2: ( rule__ArrayValue__ValuesAssignment_1 )
            // InternalTaskDefinition.g:2716:3: rule__ArrayValue__ValuesAssignment_1
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
    // InternalTaskDefinition.g:2724:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2728:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalTaskDefinition.g:2729:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
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
    // InternalTaskDefinition.g:2736:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )* ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2740:1: ( ( ( rule__ArrayValue__Group_2__0 )* ) )
            // InternalTaskDefinition.g:2741:1: ( ( rule__ArrayValue__Group_2__0 )* )
            {
            // InternalTaskDefinition.g:2741:1: ( ( rule__ArrayValue__Group_2__0 )* )
            // InternalTaskDefinition.g:2742:2: ( rule__ArrayValue__Group_2__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalTaskDefinition.g:2743:2: ( rule__ArrayValue__Group_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==49) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalTaskDefinition.g:2743:3: rule__ArrayValue__Group_2__0
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
    // InternalTaskDefinition.g:2751:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2755:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalTaskDefinition.g:2756:2: rule__ArrayValue__Group__3__Impl
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
    // InternalTaskDefinition.g:2762:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2766:1: ( ( ']' ) )
            // InternalTaskDefinition.g:2767:1: ( ']' )
            {
            // InternalTaskDefinition.g:2767:1: ( ']' )
            // InternalTaskDefinition.g:2768:2: ']'
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
    // InternalTaskDefinition.g:2778:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2782:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalTaskDefinition.g:2783:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
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
    // InternalTaskDefinition.g:2790:1: rule__ArrayValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2794:1: ( ( ',' ) )
            // InternalTaskDefinition.g:2795:1: ( ',' )
            {
            // InternalTaskDefinition.g:2795:1: ( ',' )
            // InternalTaskDefinition.g:2796:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalTaskDefinition.g:2805:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2809:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalTaskDefinition.g:2810:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalTaskDefinition.g:2816:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2820:1: ( ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) )
            // InternalTaskDefinition.g:2821:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            {
            // InternalTaskDefinition.g:2821:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            // InternalTaskDefinition.g:2822:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 
            // InternalTaskDefinition.g:2823:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            // InternalTaskDefinition.g:2823:3: rule__ArrayValue__ValuesAssignment_2_1
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
    // InternalTaskDefinition.g:2832:1: rule__SingleValue__Group_0__0 : rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 ;
    public final void rule__SingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2836:1: ( rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 )
            // InternalTaskDefinition.g:2837:2: rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalTaskDefinition.g:2844:1: rule__SingleValue__Group_0__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2848:1: ( ( () ) )
            // InternalTaskDefinition.g:2849:1: ( () )
            {
            // InternalTaskDefinition.g:2849:1: ( () )
            // InternalTaskDefinition.g:2850:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); 
            // InternalTaskDefinition.g:2851:2: ()
            // InternalTaskDefinition.g:2851:3: 
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
    // InternalTaskDefinition.g:2859:1: rule__SingleValue__Group_0__1 : rule__SingleValue__Group_0__1__Impl ;
    public final void rule__SingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2863:1: ( rule__SingleValue__Group_0__1__Impl )
            // InternalTaskDefinition.g:2864:2: rule__SingleValue__Group_0__1__Impl
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
    // InternalTaskDefinition.g:2870:1: rule__SingleValue__Group_0__1__Impl : ( ( rule__SingleValue__ValueAssignment_0_1 ) ) ;
    public final void rule__SingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2874:1: ( ( ( rule__SingleValue__ValueAssignment_0_1 ) ) )
            // InternalTaskDefinition.g:2875:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            {
            // InternalTaskDefinition.g:2875:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            // InternalTaskDefinition.g:2876:2: ( rule__SingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 
            // InternalTaskDefinition.g:2877:2: ( rule__SingleValue__ValueAssignment_0_1 )
            // InternalTaskDefinition.g:2877:3: rule__SingleValue__ValueAssignment_0_1
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
    // InternalTaskDefinition.g:2886:1: rule__SingleValue__Group_1__0 : rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 ;
    public final void rule__SingleValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2890:1: ( rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 )
            // InternalTaskDefinition.g:2891:2: rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTaskDefinition.g:2898:1: rule__SingleValue__Group_1__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2902:1: ( ( () ) )
            // InternalTaskDefinition.g:2903:1: ( () )
            {
            // InternalTaskDefinition.g:2903:1: ( () )
            // InternalTaskDefinition.g:2904:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); 
            // InternalTaskDefinition.g:2905:2: ()
            // InternalTaskDefinition.g:2905:3: 
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
    // InternalTaskDefinition.g:2913:1: rule__SingleValue__Group_1__1 : rule__SingleValue__Group_1__1__Impl ;
    public final void rule__SingleValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2917:1: ( rule__SingleValue__Group_1__1__Impl )
            // InternalTaskDefinition.g:2918:2: rule__SingleValue__Group_1__1__Impl
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
    // InternalTaskDefinition.g:2924:1: rule__SingleValue__Group_1__1__Impl : ( ( rule__SingleValue__ValueAssignment_1_1 ) ) ;
    public final void rule__SingleValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2928:1: ( ( ( rule__SingleValue__ValueAssignment_1_1 ) ) )
            // InternalTaskDefinition.g:2929:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            {
            // InternalTaskDefinition.g:2929:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            // InternalTaskDefinition.g:2930:2: ( rule__SingleValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); 
            // InternalTaskDefinition.g:2931:2: ( rule__SingleValue__ValueAssignment_1_1 )
            // InternalTaskDefinition.g:2931:3: rule__SingleValue__ValueAssignment_1_1
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
    // InternalTaskDefinition.g:2940:1: rule__SingleValue__Group_2__0 : rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 ;
    public final void rule__SingleValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2944:1: ( rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 )
            // InternalTaskDefinition.g:2945:2: rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1
            {
            pushFollow(FOLLOW_16);
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
    // InternalTaskDefinition.g:2952:1: rule__SingleValue__Group_2__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2956:1: ( ( () ) )
            // InternalTaskDefinition.g:2957:1: ( () )
            {
            // InternalTaskDefinition.g:2957:1: ( () )
            // InternalTaskDefinition.g:2958:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); 
            // InternalTaskDefinition.g:2959:2: ()
            // InternalTaskDefinition.g:2959:3: 
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
    // InternalTaskDefinition.g:2967:1: rule__SingleValue__Group_2__1 : rule__SingleValue__Group_2__1__Impl ;
    public final void rule__SingleValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2971:1: ( rule__SingleValue__Group_2__1__Impl )
            // InternalTaskDefinition.g:2972:2: rule__SingleValue__Group_2__1__Impl
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
    // InternalTaskDefinition.g:2978:1: rule__SingleValue__Group_2__1__Impl : ( ( rule__SingleValue__ValueAssignment_2_1 ) ) ;
    public final void rule__SingleValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2982:1: ( ( ( rule__SingleValue__ValueAssignment_2_1 ) ) )
            // InternalTaskDefinition.g:2983:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            {
            // InternalTaskDefinition.g:2983:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            // InternalTaskDefinition.g:2984:2: ( rule__SingleValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); 
            // InternalTaskDefinition.g:2985:2: ( rule__SingleValue__ValueAssignment_2_1 )
            // InternalTaskDefinition.g:2985:3: rule__SingleValue__ValueAssignment_2_1
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
    // InternalTaskDefinition.g:2994:1: rule__SingleValue__Group_3__0 : rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 ;
    public final void rule__SingleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2998:1: ( rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 )
            // InternalTaskDefinition.g:2999:2: rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1
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
    // InternalTaskDefinition.g:3006:1: rule__SingleValue__Group_3__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3010:1: ( ( () ) )
            // InternalTaskDefinition.g:3011:1: ( () )
            {
            // InternalTaskDefinition.g:3011:1: ( () )
            // InternalTaskDefinition.g:3012:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); 
            // InternalTaskDefinition.g:3013:2: ()
            // InternalTaskDefinition.g:3013:3: 
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
    // InternalTaskDefinition.g:3021:1: rule__SingleValue__Group_3__1 : rule__SingleValue__Group_3__1__Impl ;
    public final void rule__SingleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3025:1: ( rule__SingleValue__Group_3__1__Impl )
            // InternalTaskDefinition.g:3026:2: rule__SingleValue__Group_3__1__Impl
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
    // InternalTaskDefinition.g:3032:1: rule__SingleValue__Group_3__1__Impl : ( ( rule__SingleValue__ValueAssignment_3_1 ) ) ;
    public final void rule__SingleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3036:1: ( ( ( rule__SingleValue__ValueAssignment_3_1 ) ) )
            // InternalTaskDefinition.g:3037:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            {
            // InternalTaskDefinition.g:3037:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            // InternalTaskDefinition.g:3038:2: ( rule__SingleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); 
            // InternalTaskDefinition.g:3039:2: ( rule__SingleValue__ValueAssignment_3_1 )
            // InternalTaskDefinition.g:3039:3: rule__SingleValue__ValueAssignment_3_1
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
    // InternalTaskDefinition.g:3048:1: rule__SingleValue__Group_4__0 : rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 ;
    public final void rule__SingleValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3052:1: ( rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 )
            // InternalTaskDefinition.g:3053:2: rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1
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
    // InternalTaskDefinition.g:3060:1: rule__SingleValue__Group_4__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3064:1: ( ( () ) )
            // InternalTaskDefinition.g:3065:1: ( () )
            {
            // InternalTaskDefinition.g:3065:1: ( () )
            // InternalTaskDefinition.g:3066:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); 
            // InternalTaskDefinition.g:3067:2: ()
            // InternalTaskDefinition.g:3067:3: 
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
    // InternalTaskDefinition.g:3075:1: rule__SingleValue__Group_4__1 : rule__SingleValue__Group_4__1__Impl ;
    public final void rule__SingleValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3079:1: ( rule__SingleValue__Group_4__1__Impl )
            // InternalTaskDefinition.g:3080:2: rule__SingleValue__Group_4__1__Impl
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
    // InternalTaskDefinition.g:3086:1: rule__SingleValue__Group_4__1__Impl : ( ( rule__SingleValue__ValueAssignment_4_1 ) ) ;
    public final void rule__SingleValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3090:1: ( ( ( rule__SingleValue__ValueAssignment_4_1 ) ) )
            // InternalTaskDefinition.g:3091:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            {
            // InternalTaskDefinition.g:3091:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            // InternalTaskDefinition.g:3092:2: ( rule__SingleValue__ValueAssignment_4_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); 
            // InternalTaskDefinition.g:3093:2: ( rule__SingleValue__ValueAssignment_4_1 )
            // InternalTaskDefinition.g:3093:3: rule__SingleValue__ValueAssignment_4_1
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


    // $ANTLR start "rule__TaskDefinitionModel__RepositoryAssignment_1"
    // InternalTaskDefinition.g:3102:1: rule__TaskDefinitionModel__RepositoryAssignment_1 : ( ruleTaskDefinitionRepository ) ;
    public final void rule__TaskDefinitionModel__RepositoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3106:1: ( ( ruleTaskDefinitionRepository ) )
            // InternalTaskDefinition.g:3107:2: ( ruleTaskDefinitionRepository )
            {
            // InternalTaskDefinition.g:3107:2: ( ruleTaskDefinitionRepository )
            // InternalTaskDefinition.g:3108:3: ruleTaskDefinitionRepository
            {
             before(grammarAccess.getTaskDefinitionModelAccess().getRepositoryTaskDefinitionRepositoryParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskDefinitionRepository();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionModelAccess().getRepositoryTaskDefinitionRepositoryParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionModel__RepositoryAssignment_1"


    // $ANTLR start "rule__TaskDefinitionRepository__NameAssignment_1"
    // InternalTaskDefinition.g:3117:1: rule__TaskDefinitionRepository__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TaskDefinitionRepository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3121:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:3122:2: ( RULE_ID )
            {
            // InternalTaskDefinition.g:3122:2: ( RULE_ID )
            // InternalTaskDefinition.g:3123:3: RULE_ID
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionRepositoryAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__NameAssignment_1"


    // $ANTLR start "rule__TaskDefinitionRepository__TasksAssignment_3"
    // InternalTaskDefinition.g:3132:1: rule__TaskDefinitionRepository__TasksAssignment_3 : ( ruleTaskDefinition ) ;
    public final void rule__TaskDefinitionRepository__TasksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3136:1: ( ( ruleTaskDefinition ) )
            // InternalTaskDefinition.g:3137:2: ( ruleTaskDefinition )
            {
            // InternalTaskDefinition.g:3137:2: ( ruleTaskDefinition )
            // InternalTaskDefinition.g:3138:3: ruleTaskDefinition
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getTasksTaskDefinitionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskDefinition();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionRepositoryAccess().getTasksTaskDefinitionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinitionRepository__TasksAssignment_3"


    // $ANTLR start "rule__TaskDefinition__NameAssignment_1"
    // InternalTaskDefinition.g:3147:1: rule__TaskDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TaskDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3151:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:3152:2: ( RULE_ID )
            {
            // InternalTaskDefinition.g:3152:2: ( RULE_ID )
            // InternalTaskDefinition.g:3153:3: RULE_ID
            {
             before(grammarAccess.getTaskDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__NameAssignment_1"


    // $ANTLR start "rule__TaskDefinition__InAttributeAssignment_3_2"
    // InternalTaskDefinition.g:3162:1: rule__TaskDefinition__InAttributeAssignment_3_2 : ( ruleAttributeDefinition ) ;
    public final void rule__TaskDefinition__InAttributeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3166:1: ( ( ruleAttributeDefinition ) )
            // InternalTaskDefinition.g:3167:2: ( ruleAttributeDefinition )
            {
            // InternalTaskDefinition.g:3167:2: ( ruleAttributeDefinition )
            // InternalTaskDefinition.g:3168:3: ruleAttributeDefinition
            {
             before(grammarAccess.getTaskDefinitionAccess().getInAttributeAttributeDefinitionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionAccess().getInAttributeAttributeDefinitionParserRuleCall_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__InAttributeAssignment_3_2"


    // $ANTLR start "rule__TaskDefinition__OutAttributeAssignment_4_2"
    // InternalTaskDefinition.g:3177:1: rule__TaskDefinition__OutAttributeAssignment_4_2 : ( ruleAttributeDefinition ) ;
    public final void rule__TaskDefinition__OutAttributeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3181:1: ( ( ruleAttributeDefinition ) )
            // InternalTaskDefinition.g:3182:2: ( ruleAttributeDefinition )
            {
            // InternalTaskDefinition.g:3182:2: ( ruleAttributeDefinition )
            // InternalTaskDefinition.g:3183:3: ruleAttributeDefinition
            {
             before(grammarAccess.getTaskDefinitionAccess().getOutAttributeAttributeDefinitionParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeDefinition();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionAccess().getOutAttributeAttributeDefinitionParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__OutAttributeAssignment_4_2"


    // $ANTLR start "rule__TaskDefinition__ResultsAssignment_7"
    // InternalTaskDefinition.g:3192:1: rule__TaskDefinition__ResultsAssignment_7 : ( ruleTaskResult ) ;
    public final void rule__TaskDefinition__ResultsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3196:1: ( ( ruleTaskResult ) )
            // InternalTaskDefinition.g:3197:2: ( ruleTaskResult )
            {
            // InternalTaskDefinition.g:3197:2: ( ruleTaskResult )
            // InternalTaskDefinition.g:3198:3: ruleTaskResult
            {
             before(grammarAccess.getTaskDefinitionAccess().getResultsTaskResultParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleTaskResult();

            state._fsp--;

             after(grammarAccess.getTaskDefinitionAccess().getResultsTaskResultParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskDefinition__ResultsAssignment_7"


    // $ANTLR start "rule__TaskResult__ResultAssignment_0"
    // InternalTaskDefinition.g:3207:1: rule__TaskResult__ResultAssignment_0 : ( ruleTASK_RESULT_TYPES ) ;
    public final void rule__TaskResult__ResultAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3211:1: ( ( ruleTASK_RESULT_TYPES ) )
            // InternalTaskDefinition.g:3212:2: ( ruleTASK_RESULT_TYPES )
            {
            // InternalTaskDefinition.g:3212:2: ( ruleTASK_RESULT_TYPES )
            // InternalTaskDefinition.g:3213:3: ruleTASK_RESULT_TYPES
            {
             before(grammarAccess.getTaskResultAccess().getResultTASK_RESULT_TYPESEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTASK_RESULT_TYPES();

            state._fsp--;

             after(grammarAccess.getTaskResultAccess().getResultTASK_RESULT_TYPESEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__ResultAssignment_0"


    // $ANTLR start "rule__TaskResult__ResultValueAssignment_3"
    // InternalTaskDefinition.g:3222:1: rule__TaskResult__ResultValueAssignment_3 : ( ruleEString ) ;
    public final void rule__TaskResult__ResultValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3226:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:3227:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:3227:2: ( ruleEString )
            // InternalTaskDefinition.g:3228:3: ruleEString
            {
             before(grammarAccess.getTaskResultAccess().getResultValueEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTaskResultAccess().getResultValueEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskResult__ResultValueAssignment_3"


    // $ANTLR start "rule__AttributeDefinition__DocumentationAssignment_0"
    // InternalTaskDefinition.g:3237:1: rule__AttributeDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__AttributeDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3241:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalTaskDefinition.g:3242:2: ( RULE_DOCU_COMMENT )
            {
            // InternalTaskDefinition.g:3242:2: ( RULE_DOCU_COMMENT )
            // InternalTaskDefinition.g:3243:3: RULE_DOCU_COMMENT
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
    // InternalTaskDefinition.g:3252:1: rule__AttributeDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AttributeDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3256:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:3257:2: ( RULE_ID )
            {
            // InternalTaskDefinition.g:3257:2: ( RULE_ID )
            // InternalTaskDefinition.g:3258:3: RULE_ID
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
    // InternalTaskDefinition.g:3267:1: rule__AttributeDefinition__TypeAssignment_3 : ( ruleAbstractAttributeType ) ;
    public final void rule__AttributeDefinition__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3271:1: ( ( ruleAbstractAttributeType ) )
            // InternalTaskDefinition.g:3272:2: ( ruleAbstractAttributeType )
            {
            // InternalTaskDefinition.g:3272:2: ( ruleAbstractAttributeType )
            // InternalTaskDefinition.g:3273:3: ruleAbstractAttributeType
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
    // InternalTaskDefinition.g:3282:1: rule__AttributeDefinition__DefaultvalueAssignment_4_1 : ( ruleAbstractValue ) ;
    public final void rule__AttributeDefinition__DefaultvalueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3286:1: ( ( ruleAbstractValue ) )
            // InternalTaskDefinition.g:3287:2: ( ruleAbstractValue )
            {
            // InternalTaskDefinition.g:3287:2: ( ruleAbstractValue )
            // InternalTaskDefinition.g:3288:3: ruleAbstractValue
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
    // InternalTaskDefinition.g:3297:1: rule__EnumerationElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3301:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:3302:2: ( RULE_ID )
            {
            // InternalTaskDefinition.g:3302:2: ( RULE_ID )
            // InternalTaskDefinition.g:3303:3: RULE_ID
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
    // InternalTaskDefinition.g:3312:1: rule__EnumerationElement__ValueAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3316:1: ( ( ruleEInt ) )
            // InternalTaskDefinition.g:3317:2: ( ruleEInt )
            {
            // InternalTaskDefinition.g:3317:2: ( ruleEInt )
            // InternalTaskDefinition.g:3318:3: ruleEInt
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
    // InternalTaskDefinition.g:3327:1: rule__InlineEnumerationType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__InlineEnumerationType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3331:1: ( ( ruleArrayType ) )
            // InternalTaskDefinition.g:3332:2: ( ruleArrayType )
            {
            // InternalTaskDefinition.g:3332:2: ( ruleArrayType )
            // InternalTaskDefinition.g:3333:3: ruleArrayType
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
    // InternalTaskDefinition.g:3342:1: rule__InlineEnumerationType__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__InlineEnumerationType__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3346:1: ( ( ruleEnumerationElement ) )
            // InternalTaskDefinition.g:3347:2: ( ruleEnumerationElement )
            {
            // InternalTaskDefinition.g:3347:2: ( ruleEnumerationElement )
            // InternalTaskDefinition.g:3348:3: ruleEnumerationElement
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
    // InternalTaskDefinition.g:3357:1: rule__ArrayType__LengthAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ArrayType__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3361:1: ( ( ruleCardinality ) )
            // InternalTaskDefinition.g:3362:2: ( ruleCardinality )
            {
            // InternalTaskDefinition.g:3362:2: ( ruleCardinality )
            // InternalTaskDefinition.g:3363:3: ruleCardinality
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
    // InternalTaskDefinition.g:3372:1: rule__PrimitiveType__TypeNameAssignment_0 : ( rulePRIMITIVE_TYPE_NAME ) ;
    public final void rule__PrimitiveType__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3376:1: ( ( rulePRIMITIVE_TYPE_NAME ) )
            // InternalTaskDefinition.g:3377:2: ( rulePRIMITIVE_TYPE_NAME )
            {
            // InternalTaskDefinition.g:3377:2: ( rulePRIMITIVE_TYPE_NAME )
            // InternalTaskDefinition.g:3378:3: rulePRIMITIVE_TYPE_NAME
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
    // InternalTaskDefinition.g:3387:1: rule__PrimitiveType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__PrimitiveType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3391:1: ( ( ruleArrayType ) )
            // InternalTaskDefinition.g:3392:2: ( ruleArrayType )
            {
            // InternalTaskDefinition.g:3392:2: ( ruleArrayType )
            // InternalTaskDefinition.g:3393:3: ruleArrayType
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
    // InternalTaskDefinition.g:3402:1: rule__ArrayValue__ValuesAssignment_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3406:1: ( ( ruleSingleValue ) )
            // InternalTaskDefinition.g:3407:2: ( ruleSingleValue )
            {
            // InternalTaskDefinition.g:3407:2: ( ruleSingleValue )
            // InternalTaskDefinition.g:3408:3: ruleSingleValue
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
    // InternalTaskDefinition.g:3417:1: rule__ArrayValue__ValuesAssignment_2_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3421:1: ( ( ruleSingleValue ) )
            // InternalTaskDefinition.g:3422:2: ( ruleSingleValue )
            {
            // InternalTaskDefinition.g:3422:2: ( ruleSingleValue )
            // InternalTaskDefinition.g:3423:3: ruleSingleValue
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
    // InternalTaskDefinition.g:3432:1: rule__SingleValue__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__SingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3436:1: ( ( ruleEInt ) )
            // InternalTaskDefinition.g:3437:2: ( ruleEInt )
            {
            // InternalTaskDefinition.g:3437:2: ( ruleEInt )
            // InternalTaskDefinition.g:3438:3: ruleEInt
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
    // InternalTaskDefinition.g:3447:1: rule__SingleValue__ValueAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__SingleValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3451:1: ( ( ruleEDouble ) )
            // InternalTaskDefinition.g:3452:2: ( ruleEDouble )
            {
            // InternalTaskDefinition.g:3452:2: ( ruleEDouble )
            // InternalTaskDefinition.g:3453:3: ruleEDouble
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
    // InternalTaskDefinition.g:3462:1: rule__SingleValue__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__SingleValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3466:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:3467:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:3467:2: ( ruleEString )
            // InternalTaskDefinition.g:3468:3: ruleEString
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
    // InternalTaskDefinition.g:3477:1: rule__SingleValue__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__SingleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3481:1: ( ( ruleEBoolean ) )
            // InternalTaskDefinition.g:3482:2: ( ruleEBoolean )
            {
            // InternalTaskDefinition.g:3482:2: ( ruleEBoolean )
            // InternalTaskDefinition.g:3483:3: ruleEBoolean
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
    // InternalTaskDefinition.g:3492:1: rule__SingleValue__ValueAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__SingleValue__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3496:1: ( ( ( ruleFQN ) ) )
            // InternalTaskDefinition.g:3497:2: ( ( ruleFQN ) )
            {
            // InternalTaskDefinition.g:3497:2: ( ( ruleFQN ) )
            // InternalTaskDefinition.g:3498:3: ( ruleFQN )
            {
             before(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 
            // InternalTaskDefinition.g:3499:3: ( ruleFQN )
            // InternalTaskDefinition.g:3500:4: ruleFQN
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000180002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000008000000C0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000000C2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00004001FFE00000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000B0000000C070L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000200000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000300000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000040020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000030000000C070L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000000C000L});

}