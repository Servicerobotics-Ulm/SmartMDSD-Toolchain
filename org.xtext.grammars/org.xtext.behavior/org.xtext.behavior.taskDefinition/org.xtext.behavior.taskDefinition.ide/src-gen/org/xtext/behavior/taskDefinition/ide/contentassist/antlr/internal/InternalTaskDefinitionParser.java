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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'*'", "'SUCCESS'", "'ERROR'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'", "'TaskDefinitionRepository'", "'{'", "'}'", "'TaskDefinition'", "'results'", "'in'", "'out'", "'value'", "'='", "';'", "':'", "'.'", "'-'", "'InlineEnumeration'", "'['", "']'", "','"
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
    // InternalTaskDefinition.g:94:1: entryRuleTaskDefinitionModel : ruleTaskDefinitionModel EOF ;
    public final void entryRuleTaskDefinitionModel() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:95:1: ( ruleTaskDefinitionModel EOF )
            // InternalTaskDefinition.g:96:1: ruleTaskDefinitionModel EOF
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
    // InternalTaskDefinition.g:103:1: ruleTaskDefinitionModel : ( ( rule__TaskDefinitionModel__Group__0 ) ) ;
    public final void ruleTaskDefinitionModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:107:2: ( ( ( rule__TaskDefinitionModel__Group__0 ) ) )
            // InternalTaskDefinition.g:108:2: ( ( rule__TaskDefinitionModel__Group__0 ) )
            {
            // InternalTaskDefinition.g:108:2: ( ( rule__TaskDefinitionModel__Group__0 ) )
            // InternalTaskDefinition.g:109:3: ( rule__TaskDefinitionModel__Group__0 )
            {
             before(grammarAccess.getTaskDefinitionModelAccess().getGroup()); 
            // InternalTaskDefinition.g:110:3: ( rule__TaskDefinitionModel__Group__0 )
            // InternalTaskDefinition.g:110:4: rule__TaskDefinitionModel__Group__0
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
    // InternalTaskDefinition.g:119:1: entryRuleTaskDefinitionRepository : ruleTaskDefinitionRepository EOF ;
    public final void entryRuleTaskDefinitionRepository() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:120:1: ( ruleTaskDefinitionRepository EOF )
            // InternalTaskDefinition.g:121:1: ruleTaskDefinitionRepository EOF
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
    // InternalTaskDefinition.g:128:1: ruleTaskDefinitionRepository : ( ( rule__TaskDefinitionRepository__Group__0 ) ) ;
    public final void ruleTaskDefinitionRepository() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:132:2: ( ( ( rule__TaskDefinitionRepository__Group__0 ) ) )
            // InternalTaskDefinition.g:133:2: ( ( rule__TaskDefinitionRepository__Group__0 ) )
            {
            // InternalTaskDefinition.g:133:2: ( ( rule__TaskDefinitionRepository__Group__0 ) )
            // InternalTaskDefinition.g:134:3: ( rule__TaskDefinitionRepository__Group__0 )
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getGroup()); 
            // InternalTaskDefinition.g:135:3: ( rule__TaskDefinitionRepository__Group__0 )
            // InternalTaskDefinition.g:135:4: rule__TaskDefinitionRepository__Group__0
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
    // InternalTaskDefinition.g:144:1: entryRuleTaskDefinition : ruleTaskDefinition EOF ;
    public final void entryRuleTaskDefinition() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:145:1: ( ruleTaskDefinition EOF )
            // InternalTaskDefinition.g:146:1: ruleTaskDefinition EOF
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
    // InternalTaskDefinition.g:153:1: ruleTaskDefinition : ( ( rule__TaskDefinition__Group__0 ) ) ;
    public final void ruleTaskDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:157:2: ( ( ( rule__TaskDefinition__Group__0 ) ) )
            // InternalTaskDefinition.g:158:2: ( ( rule__TaskDefinition__Group__0 ) )
            {
            // InternalTaskDefinition.g:158:2: ( ( rule__TaskDefinition__Group__0 ) )
            // InternalTaskDefinition.g:159:3: ( rule__TaskDefinition__Group__0 )
            {
             before(grammarAccess.getTaskDefinitionAccess().getGroup()); 
            // InternalTaskDefinition.g:160:3: ( rule__TaskDefinition__Group__0 )
            // InternalTaskDefinition.g:160:4: rule__TaskDefinition__Group__0
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
    // InternalTaskDefinition.g:169:1: entryRuleTaskResult : ruleTaskResult EOF ;
    public final void entryRuleTaskResult() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:170:1: ( ruleTaskResult EOF )
            // InternalTaskDefinition.g:171:1: ruleTaskResult EOF
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
    // InternalTaskDefinition.g:178:1: ruleTaskResult : ( ( rule__TaskResult__Group__0 ) ) ;
    public final void ruleTaskResult() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:182:2: ( ( ( rule__TaskResult__Group__0 ) ) )
            // InternalTaskDefinition.g:183:2: ( ( rule__TaskResult__Group__0 ) )
            {
            // InternalTaskDefinition.g:183:2: ( ( rule__TaskResult__Group__0 ) )
            // InternalTaskDefinition.g:184:3: ( rule__TaskResult__Group__0 )
            {
             before(grammarAccess.getTaskResultAccess().getGroup()); 
            // InternalTaskDefinition.g:185:3: ( rule__TaskResult__Group__0 )
            // InternalTaskDefinition.g:185:4: rule__TaskResult__Group__0
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
    // InternalTaskDefinition.g:194:1: entryRuleAttributeDefinition : ruleAttributeDefinition EOF ;
    public final void entryRuleAttributeDefinition() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:195:1: ( ruleAttributeDefinition EOF )
            // InternalTaskDefinition.g:196:1: ruleAttributeDefinition EOF
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
    // InternalTaskDefinition.g:203:1: ruleAttributeDefinition : ( ( rule__AttributeDefinition__Group__0 ) ) ;
    public final void ruleAttributeDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:207:2: ( ( ( rule__AttributeDefinition__Group__0 ) ) )
            // InternalTaskDefinition.g:208:2: ( ( rule__AttributeDefinition__Group__0 ) )
            {
            // InternalTaskDefinition.g:208:2: ( ( rule__AttributeDefinition__Group__0 ) )
            // InternalTaskDefinition.g:209:3: ( rule__AttributeDefinition__Group__0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup()); 
            // InternalTaskDefinition.g:210:3: ( rule__AttributeDefinition__Group__0 )
            // InternalTaskDefinition.g:210:4: rule__AttributeDefinition__Group__0
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
    // InternalTaskDefinition.g:219:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:220:1: ( ruleFQN EOF )
            // InternalTaskDefinition.g:221:1: ruleFQN EOF
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
    // InternalTaskDefinition.g:228:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:232:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalTaskDefinition.g:233:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalTaskDefinition.g:233:2: ( ( rule__FQN__Group__0 ) )
            // InternalTaskDefinition.g:234:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalTaskDefinition.g:235:3: ( rule__FQN__Group__0 )
            // InternalTaskDefinition.g:235:4: rule__FQN__Group__0
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
    // InternalTaskDefinition.g:244:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:245:1: ( ruleEBoolean EOF )
            // InternalTaskDefinition.g:246:1: ruleEBoolean EOF
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
    // InternalTaskDefinition.g:253:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:257:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalTaskDefinition.g:258:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalTaskDefinition.g:258:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalTaskDefinition.g:259:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalTaskDefinition.g:260:3: ( rule__EBoolean__Alternatives )
            // InternalTaskDefinition.g:260:4: rule__EBoolean__Alternatives
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
    // InternalTaskDefinition.g:269:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:270:1: ( ruleEString EOF )
            // InternalTaskDefinition.g:271:1: ruleEString EOF
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
    // InternalTaskDefinition.g:278:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:282:2: ( ( RULE_STRING ) )
            // InternalTaskDefinition.g:283:2: ( RULE_STRING )
            {
            // InternalTaskDefinition.g:283:2: ( RULE_STRING )
            // InternalTaskDefinition.g:284:3: RULE_STRING
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
    // InternalTaskDefinition.g:294:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:295:1: ( ruleEInt EOF )
            // InternalTaskDefinition.g:296:1: ruleEInt EOF
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
    // InternalTaskDefinition.g:303:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:307:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTaskDefinition.g:308:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTaskDefinition.g:308:2: ( ( rule__EInt__Group__0 ) )
            // InternalTaskDefinition.g:309:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTaskDefinition.g:310:3: ( rule__EInt__Group__0 )
            // InternalTaskDefinition.g:310:4: rule__EInt__Group__0
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
    // InternalTaskDefinition.g:319:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:320:1: ( ruleEDouble EOF )
            // InternalTaskDefinition.g:321:1: ruleEDouble EOF
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
    // InternalTaskDefinition.g:328:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:332:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalTaskDefinition.g:333:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalTaskDefinition.g:333:2: ( ( rule__EDouble__Group__0 ) )
            // InternalTaskDefinition.g:334:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalTaskDefinition.g:335:3: ( rule__EDouble__Group__0 )
            // InternalTaskDefinition.g:335:4: rule__EDouble__Group__0
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
    // InternalTaskDefinition.g:344:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:345:1: ( ruleEnumerationElement EOF )
            // InternalTaskDefinition.g:346:1: ruleEnumerationElement EOF
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
    // InternalTaskDefinition.g:353:1: ruleEnumerationElement : ( ( rule__EnumerationElement__Group__0 ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:357:2: ( ( ( rule__EnumerationElement__Group__0 ) ) )
            // InternalTaskDefinition.g:358:2: ( ( rule__EnumerationElement__Group__0 ) )
            {
            // InternalTaskDefinition.g:358:2: ( ( rule__EnumerationElement__Group__0 ) )
            // InternalTaskDefinition.g:359:3: ( rule__EnumerationElement__Group__0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup()); 
            // InternalTaskDefinition.g:360:3: ( rule__EnumerationElement__Group__0 )
            // InternalTaskDefinition.g:360:4: rule__EnumerationElement__Group__0
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
    // InternalTaskDefinition.g:369:1: entryRuleAbstractAttributeType : ruleAbstractAttributeType EOF ;
    public final void entryRuleAbstractAttributeType() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:370:1: ( ruleAbstractAttributeType EOF )
            // InternalTaskDefinition.g:371:1: ruleAbstractAttributeType EOF
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
    // InternalTaskDefinition.g:378:1: ruleAbstractAttributeType : ( ( rule__AbstractAttributeType__Alternatives ) ) ;
    public final void ruleAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:382:2: ( ( ( rule__AbstractAttributeType__Alternatives ) ) )
            // InternalTaskDefinition.g:383:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            {
            // InternalTaskDefinition.g:383:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            // InternalTaskDefinition.g:384:3: ( rule__AbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalTaskDefinition.g:385:3: ( rule__AbstractAttributeType__Alternatives )
            // InternalTaskDefinition.g:385:4: rule__AbstractAttributeType__Alternatives
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
    // InternalTaskDefinition.g:394:1: entryRuleInlineEnumerationType : ruleInlineEnumerationType EOF ;
    public final void entryRuleInlineEnumerationType() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:395:1: ( ruleInlineEnumerationType EOF )
            // InternalTaskDefinition.g:396:1: ruleInlineEnumerationType EOF
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
    // InternalTaskDefinition.g:403:1: ruleInlineEnumerationType : ( ( rule__InlineEnumerationType__Group__0 ) ) ;
    public final void ruleInlineEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:407:2: ( ( ( rule__InlineEnumerationType__Group__0 ) ) )
            // InternalTaskDefinition.g:408:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            {
            // InternalTaskDefinition.g:408:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            // InternalTaskDefinition.g:409:3: ( rule__InlineEnumerationType__Group__0 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 
            // InternalTaskDefinition.g:410:3: ( rule__InlineEnumerationType__Group__0 )
            // InternalTaskDefinition.g:410:4: rule__InlineEnumerationType__Group__0
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
    // InternalTaskDefinition.g:419:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:420:1: ( ruleArrayType EOF )
            // InternalTaskDefinition.g:421:1: ruleArrayType EOF
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
    // InternalTaskDefinition.g:428:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:432:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalTaskDefinition.g:433:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalTaskDefinition.g:433:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalTaskDefinition.g:434:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalTaskDefinition.g:435:3: ( rule__ArrayType__Group__0 )
            // InternalTaskDefinition.g:435:4: rule__ArrayType__Group__0
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
    // InternalTaskDefinition.g:444:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:445:1: ( ruleCardinality EOF )
            // InternalTaskDefinition.g:446:1: ruleCardinality EOF
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
    // InternalTaskDefinition.g:453:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:457:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalTaskDefinition.g:458:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalTaskDefinition.g:458:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalTaskDefinition.g:459:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalTaskDefinition.g:460:3: ( rule__Cardinality__Alternatives )
            // InternalTaskDefinition.g:460:4: rule__Cardinality__Alternatives
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
    // InternalTaskDefinition.g:469:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:470:1: ( rulePrimitiveType EOF )
            // InternalTaskDefinition.g:471:1: rulePrimitiveType EOF
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
    // InternalTaskDefinition.g:478:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:482:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalTaskDefinition.g:483:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalTaskDefinition.g:483:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalTaskDefinition.g:484:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalTaskDefinition.g:485:3: ( rule__PrimitiveType__Group__0 )
            // InternalTaskDefinition.g:485:4: rule__PrimitiveType__Group__0
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
    // InternalTaskDefinition.g:494:1: entryRuleAbstractValue : ruleAbstractValue EOF ;
    public final void entryRuleAbstractValue() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:495:1: ( ruleAbstractValue EOF )
            // InternalTaskDefinition.g:496:1: ruleAbstractValue EOF
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
    // InternalTaskDefinition.g:503:1: ruleAbstractValue : ( ( rule__AbstractValue__Alternatives ) ) ;
    public final void ruleAbstractValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:507:2: ( ( ( rule__AbstractValue__Alternatives ) ) )
            // InternalTaskDefinition.g:508:2: ( ( rule__AbstractValue__Alternatives ) )
            {
            // InternalTaskDefinition.g:508:2: ( ( rule__AbstractValue__Alternatives ) )
            // InternalTaskDefinition.g:509:3: ( rule__AbstractValue__Alternatives )
            {
             before(grammarAccess.getAbstractValueAccess().getAlternatives()); 
            // InternalTaskDefinition.g:510:3: ( rule__AbstractValue__Alternatives )
            // InternalTaskDefinition.g:510:4: rule__AbstractValue__Alternatives
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
    // InternalTaskDefinition.g:519:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:520:1: ( ruleArrayValue EOF )
            // InternalTaskDefinition.g:521:1: ruleArrayValue EOF
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
    // InternalTaskDefinition.g:528:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:532:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalTaskDefinition.g:533:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalTaskDefinition.g:533:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalTaskDefinition.g:534:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalTaskDefinition.g:535:3: ( rule__ArrayValue__Group__0 )
            // InternalTaskDefinition.g:535:4: rule__ArrayValue__Group__0
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
    // InternalTaskDefinition.g:544:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalTaskDefinition.g:545:1: ( ruleSingleValue EOF )
            // InternalTaskDefinition.g:546:1: ruleSingleValue EOF
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
    // InternalTaskDefinition.g:553:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:557:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalTaskDefinition.g:558:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalTaskDefinition.g:558:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalTaskDefinition.g:559:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalTaskDefinition.g:560:3: ( rule__SingleValue__Alternatives )
            // InternalTaskDefinition.g:560:4: rule__SingleValue__Alternatives
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
    // InternalTaskDefinition.g:569:1: ruleTASK_RESULT_TYPES : ( ( rule__TASK_RESULT_TYPES__Alternatives ) ) ;
    public final void ruleTASK_RESULT_TYPES() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:573:1: ( ( ( rule__TASK_RESULT_TYPES__Alternatives ) ) )
            // InternalTaskDefinition.g:574:2: ( ( rule__TASK_RESULT_TYPES__Alternatives ) )
            {
            // InternalTaskDefinition.g:574:2: ( ( rule__TASK_RESULT_TYPES__Alternatives ) )
            // InternalTaskDefinition.g:575:3: ( rule__TASK_RESULT_TYPES__Alternatives )
            {
             before(grammarAccess.getTASK_RESULT_TYPESAccess().getAlternatives()); 
            // InternalTaskDefinition.g:576:3: ( rule__TASK_RESULT_TYPES__Alternatives )
            // InternalTaskDefinition.g:576:4: rule__TASK_RESULT_TYPES__Alternatives
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
    // InternalTaskDefinition.g:585:1: rulePRIMITIVE_TYPE_NAME : ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) ;
    public final void rulePRIMITIVE_TYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:589:1: ( ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) )
            // InternalTaskDefinition.g:590:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            {
            // InternalTaskDefinition.g:590:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            // InternalTaskDefinition.g:591:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            {
             before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 
            // InternalTaskDefinition.g:592:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            // InternalTaskDefinition.g:592:4: rule__PRIMITIVE_TYPE_NAME__Alternatives
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
    // InternalTaskDefinition.g:600:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:604:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalTaskDefinition.g:605:2: ( 'true' )
                    {
                    // InternalTaskDefinition.g:605:2: ( 'true' )
                    // InternalTaskDefinition.g:606:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:611:2: ( 'false' )
                    {
                    // InternalTaskDefinition.g:611:2: ( 'false' )
                    // InternalTaskDefinition.g:612:3: 'false'
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
    // InternalTaskDefinition.g:621:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:625:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalTaskDefinition.g:626:2: ( 'E' )
                    {
                    // InternalTaskDefinition.g:626:2: ( 'E' )
                    // InternalTaskDefinition.g:627:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:632:2: ( 'e' )
                    {
                    // InternalTaskDefinition.g:632:2: ( 'e' )
                    // InternalTaskDefinition.g:633:3: 'e'
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
    // InternalTaskDefinition.g:642:1: rule__AbstractAttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) );
    public final void rule__AbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:646:1: ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=18 && LA3_0<=29)) ) {
                alt3=1;
            }
            else if ( (LA3_0==43) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalTaskDefinition.g:647:2: ( rulePrimitiveType )
                    {
                    // InternalTaskDefinition.g:647:2: ( rulePrimitiveType )
                    // InternalTaskDefinition.g:648:3: rulePrimitiveType
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
                    // InternalTaskDefinition.g:653:2: ( ruleInlineEnumerationType )
                    {
                    // InternalTaskDefinition.g:653:2: ( ruleInlineEnumerationType )
                    // InternalTaskDefinition.g:654:3: ruleInlineEnumerationType
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
    // InternalTaskDefinition.g:663:1: rule__Cardinality__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:667:1: ( ( RULE_INT ) | ( '*' ) )
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
                    // InternalTaskDefinition.g:668:2: ( RULE_INT )
                    {
                    // InternalTaskDefinition.g:668:2: ( RULE_INT )
                    // InternalTaskDefinition.g:669:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:674:2: ( '*' )
                    {
                    // InternalTaskDefinition.g:674:2: ( '*' )
                    // InternalTaskDefinition.g:675:3: '*'
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
    // InternalTaskDefinition.g:684:1: rule__AbstractValue__Alternatives : ( ( ruleSingleValue ) | ( ruleArrayValue ) );
    public final void rule__AbstractValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:688:1: ( ( ruleSingleValue ) | ( ruleArrayValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||(LA5_0>=11 && LA5_0<=12)||(LA5_0>=41 && LA5_0<=42)) ) {
                alt5=1;
            }
            else if ( (LA5_0==44) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalTaskDefinition.g:689:2: ( ruleSingleValue )
                    {
                    // InternalTaskDefinition.g:689:2: ( ruleSingleValue )
                    // InternalTaskDefinition.g:690:3: ruleSingleValue
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
                    // InternalTaskDefinition.g:695:2: ( ruleArrayValue )
                    {
                    // InternalTaskDefinition.g:695:2: ( ruleArrayValue )
                    // InternalTaskDefinition.g:696:3: ruleArrayValue
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
    // InternalTaskDefinition.g:705:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:709:1: ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 42:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_INT) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==EOF||LA6_2==RULE_ID||LA6_2==32||LA6_2==39||(LA6_2>=45 && LA6_2<=46)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==41) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==41) ) {
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

                if ( (LA6_2==EOF||LA6_2==RULE_ID||LA6_2==32||LA6_2==39||(LA6_2>=45 && LA6_2<=46)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==41) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 41:
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
                    // InternalTaskDefinition.g:710:2: ( ( rule__SingleValue__Group_0__0 ) )
                    {
                    // InternalTaskDefinition.g:710:2: ( ( rule__SingleValue__Group_0__0 ) )
                    // InternalTaskDefinition.g:711:3: ( rule__SingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_0()); 
                    // InternalTaskDefinition.g:712:3: ( rule__SingleValue__Group_0__0 )
                    // InternalTaskDefinition.g:712:4: rule__SingleValue__Group_0__0
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
                    // InternalTaskDefinition.g:716:2: ( ( rule__SingleValue__Group_1__0 ) )
                    {
                    // InternalTaskDefinition.g:716:2: ( ( rule__SingleValue__Group_1__0 ) )
                    // InternalTaskDefinition.g:717:3: ( rule__SingleValue__Group_1__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_1()); 
                    // InternalTaskDefinition.g:718:3: ( rule__SingleValue__Group_1__0 )
                    // InternalTaskDefinition.g:718:4: rule__SingleValue__Group_1__0
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
                    // InternalTaskDefinition.g:722:2: ( ( rule__SingleValue__Group_2__0 ) )
                    {
                    // InternalTaskDefinition.g:722:2: ( ( rule__SingleValue__Group_2__0 ) )
                    // InternalTaskDefinition.g:723:3: ( rule__SingleValue__Group_2__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_2()); 
                    // InternalTaskDefinition.g:724:3: ( rule__SingleValue__Group_2__0 )
                    // InternalTaskDefinition.g:724:4: rule__SingleValue__Group_2__0
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
                    // InternalTaskDefinition.g:728:2: ( ( rule__SingleValue__Group_3__0 ) )
                    {
                    // InternalTaskDefinition.g:728:2: ( ( rule__SingleValue__Group_3__0 ) )
                    // InternalTaskDefinition.g:729:3: ( rule__SingleValue__Group_3__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_3()); 
                    // InternalTaskDefinition.g:730:3: ( rule__SingleValue__Group_3__0 )
                    // InternalTaskDefinition.g:730:4: rule__SingleValue__Group_3__0
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
                    // InternalTaskDefinition.g:734:2: ( ( rule__SingleValue__Group_4__0 ) )
                    {
                    // InternalTaskDefinition.g:734:2: ( ( rule__SingleValue__Group_4__0 ) )
                    // InternalTaskDefinition.g:735:3: ( rule__SingleValue__Group_4__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_4()); 
                    // InternalTaskDefinition.g:736:3: ( rule__SingleValue__Group_4__0 )
                    // InternalTaskDefinition.g:736:4: rule__SingleValue__Group_4__0
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
    // InternalTaskDefinition.g:744:1: rule__TASK_RESULT_TYPES__Alternatives : ( ( ( 'SUCCESS' ) ) | ( ( 'ERROR' ) ) );
    public final void rule__TASK_RESULT_TYPES__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:748:1: ( ( ( 'SUCCESS' ) ) | ( ( 'ERROR' ) ) )
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
                    // InternalTaskDefinition.g:749:2: ( ( 'SUCCESS' ) )
                    {
                    // InternalTaskDefinition.g:749:2: ( ( 'SUCCESS' ) )
                    // InternalTaskDefinition.g:750:3: ( 'SUCCESS' )
                    {
                     before(grammarAccess.getTASK_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_0()); 
                    // InternalTaskDefinition.g:751:3: ( 'SUCCESS' )
                    // InternalTaskDefinition.g:751:4: 'SUCCESS'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTASK_RESULT_TYPESAccess().getSUCCESSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:755:2: ( ( 'ERROR' ) )
                    {
                    // InternalTaskDefinition.g:755:2: ( ( 'ERROR' ) )
                    // InternalTaskDefinition.g:756:3: ( 'ERROR' )
                    {
                     before(grammarAccess.getTASK_RESULT_TYPESAccess().getERROREnumLiteralDeclaration_1()); 
                    // InternalTaskDefinition.g:757:3: ( 'ERROR' )
                    // InternalTaskDefinition.g:757:4: 'ERROR'
                    {
                    match(input,17,FOLLOW_2); 

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
    // InternalTaskDefinition.g:765:1: rule__PRIMITIVE_TYPE_NAME__Alternatives : ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PRIMITIVE_TYPE_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:769:1: ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) )
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
                    // InternalTaskDefinition.g:770:2: ( ( 'Int8' ) )
                    {
                    // InternalTaskDefinition.g:770:2: ( ( 'Int8' ) )
                    // InternalTaskDefinition.g:771:3: ( 'Int8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 
                    // InternalTaskDefinition.g:772:3: ( 'Int8' )
                    // InternalTaskDefinition.g:772:4: 'Int8'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTaskDefinition.g:776:2: ( ( 'Int16' ) )
                    {
                    // InternalTaskDefinition.g:776:2: ( ( 'Int16' ) )
                    // InternalTaskDefinition.g:777:3: ( 'Int16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 
                    // InternalTaskDefinition.g:778:3: ( 'Int16' )
                    // InternalTaskDefinition.g:778:4: 'Int16'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTaskDefinition.g:782:2: ( ( 'Int32' ) )
                    {
                    // InternalTaskDefinition.g:782:2: ( ( 'Int32' ) )
                    // InternalTaskDefinition.g:783:3: ( 'Int32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 
                    // InternalTaskDefinition.g:784:3: ( 'Int32' )
                    // InternalTaskDefinition.g:784:4: 'Int32'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTaskDefinition.g:788:2: ( ( 'Int64' ) )
                    {
                    // InternalTaskDefinition.g:788:2: ( ( 'Int64' ) )
                    // InternalTaskDefinition.g:789:3: ( 'Int64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 
                    // InternalTaskDefinition.g:790:3: ( 'Int64' )
                    // InternalTaskDefinition.g:790:4: 'Int64'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalTaskDefinition.g:794:2: ( ( 'UInt8' ) )
                    {
                    // InternalTaskDefinition.g:794:2: ( ( 'UInt8' ) )
                    // InternalTaskDefinition.g:795:3: ( 'UInt8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 
                    // InternalTaskDefinition.g:796:3: ( 'UInt8' )
                    // InternalTaskDefinition.g:796:4: 'UInt8'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalTaskDefinition.g:800:2: ( ( 'UInt16' ) )
                    {
                    // InternalTaskDefinition.g:800:2: ( ( 'UInt16' ) )
                    // InternalTaskDefinition.g:801:3: ( 'UInt16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 
                    // InternalTaskDefinition.g:802:3: ( 'UInt16' )
                    // InternalTaskDefinition.g:802:4: 'UInt16'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalTaskDefinition.g:806:2: ( ( 'UInt32' ) )
                    {
                    // InternalTaskDefinition.g:806:2: ( ( 'UInt32' ) )
                    // InternalTaskDefinition.g:807:3: ( 'UInt32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 
                    // InternalTaskDefinition.g:808:3: ( 'UInt32' )
                    // InternalTaskDefinition.g:808:4: 'UInt32'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalTaskDefinition.g:812:2: ( ( 'UInt64' ) )
                    {
                    // InternalTaskDefinition.g:812:2: ( ( 'UInt64' ) )
                    // InternalTaskDefinition.g:813:3: ( 'UInt64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 
                    // InternalTaskDefinition.g:814:3: ( 'UInt64' )
                    // InternalTaskDefinition.g:814:4: 'UInt64'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalTaskDefinition.g:818:2: ( ( 'Float' ) )
                    {
                    // InternalTaskDefinition.g:818:2: ( ( 'Float' ) )
                    // InternalTaskDefinition.g:819:3: ( 'Float' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 
                    // InternalTaskDefinition.g:820:3: ( 'Float' )
                    // InternalTaskDefinition.g:820:4: 'Float'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalTaskDefinition.g:824:2: ( ( 'Double' ) )
                    {
                    // InternalTaskDefinition.g:824:2: ( ( 'Double' ) )
                    // InternalTaskDefinition.g:825:3: ( 'Double' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 
                    // InternalTaskDefinition.g:826:3: ( 'Double' )
                    // InternalTaskDefinition.g:826:4: 'Double'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalTaskDefinition.g:830:2: ( ( 'String' ) )
                    {
                    // InternalTaskDefinition.g:830:2: ( ( 'String' ) )
                    // InternalTaskDefinition.g:831:3: ( 'String' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 
                    // InternalTaskDefinition.g:832:3: ( 'String' )
                    // InternalTaskDefinition.g:832:4: 'String'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalTaskDefinition.g:836:2: ( ( 'Boolean' ) )
                    {
                    // InternalTaskDefinition.g:836:2: ( ( 'Boolean' ) )
                    // InternalTaskDefinition.g:837:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 
                    // InternalTaskDefinition.g:838:3: ( 'Boolean' )
                    // InternalTaskDefinition.g:838:4: 'Boolean'
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


    // $ANTLR start "rule__TaskDefinitionModel__Group__0"
    // InternalTaskDefinition.g:846:1: rule__TaskDefinitionModel__Group__0 : rule__TaskDefinitionModel__Group__0__Impl rule__TaskDefinitionModel__Group__1 ;
    public final void rule__TaskDefinitionModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:850:1: ( rule__TaskDefinitionModel__Group__0__Impl rule__TaskDefinitionModel__Group__1 )
            // InternalTaskDefinition.g:851:2: rule__TaskDefinitionModel__Group__0__Impl rule__TaskDefinitionModel__Group__1
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
    // InternalTaskDefinition.g:858:1: rule__TaskDefinitionModel__Group__0__Impl : ( () ) ;
    public final void rule__TaskDefinitionModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:862:1: ( ( () ) )
            // InternalTaskDefinition.g:863:1: ( () )
            {
            // InternalTaskDefinition.g:863:1: ( () )
            // InternalTaskDefinition.g:864:2: ()
            {
             before(grammarAccess.getTaskDefinitionModelAccess().getTaskDefinitionModelAction_0()); 
            // InternalTaskDefinition.g:865:2: ()
            // InternalTaskDefinition.g:865:3: 
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
    // InternalTaskDefinition.g:873:1: rule__TaskDefinitionModel__Group__1 : rule__TaskDefinitionModel__Group__1__Impl ;
    public final void rule__TaskDefinitionModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:877:1: ( rule__TaskDefinitionModel__Group__1__Impl )
            // InternalTaskDefinition.g:878:2: rule__TaskDefinitionModel__Group__1__Impl
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
    // InternalTaskDefinition.g:884:1: rule__TaskDefinitionModel__Group__1__Impl : ( ( rule__TaskDefinitionModel__RepositoryAssignment_1 )? ) ;
    public final void rule__TaskDefinitionModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:888:1: ( ( ( rule__TaskDefinitionModel__RepositoryAssignment_1 )? ) )
            // InternalTaskDefinition.g:889:1: ( ( rule__TaskDefinitionModel__RepositoryAssignment_1 )? )
            {
            // InternalTaskDefinition.g:889:1: ( ( rule__TaskDefinitionModel__RepositoryAssignment_1 )? )
            // InternalTaskDefinition.g:890:2: ( rule__TaskDefinitionModel__RepositoryAssignment_1 )?
            {
             before(grammarAccess.getTaskDefinitionModelAccess().getRepositoryAssignment_1()); 
            // InternalTaskDefinition.g:891:2: ( rule__TaskDefinitionModel__RepositoryAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==30) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTaskDefinition.g:891:3: rule__TaskDefinitionModel__RepositoryAssignment_1
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
    // InternalTaskDefinition.g:900:1: rule__TaskDefinitionRepository__Group__0 : rule__TaskDefinitionRepository__Group__0__Impl rule__TaskDefinitionRepository__Group__1 ;
    public final void rule__TaskDefinitionRepository__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:904:1: ( rule__TaskDefinitionRepository__Group__0__Impl rule__TaskDefinitionRepository__Group__1 )
            // InternalTaskDefinition.g:905:2: rule__TaskDefinitionRepository__Group__0__Impl rule__TaskDefinitionRepository__Group__1
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
    // InternalTaskDefinition.g:912:1: rule__TaskDefinitionRepository__Group__0__Impl : ( 'TaskDefinitionRepository' ) ;
    public final void rule__TaskDefinitionRepository__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:916:1: ( ( 'TaskDefinitionRepository' ) )
            // InternalTaskDefinition.g:917:1: ( 'TaskDefinitionRepository' )
            {
            // InternalTaskDefinition.g:917:1: ( 'TaskDefinitionRepository' )
            // InternalTaskDefinition.g:918:2: 'TaskDefinitionRepository'
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getTaskDefinitionRepositoryKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTaskDefinition.g:927:1: rule__TaskDefinitionRepository__Group__1 : rule__TaskDefinitionRepository__Group__1__Impl rule__TaskDefinitionRepository__Group__2 ;
    public final void rule__TaskDefinitionRepository__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:931:1: ( rule__TaskDefinitionRepository__Group__1__Impl rule__TaskDefinitionRepository__Group__2 )
            // InternalTaskDefinition.g:932:2: rule__TaskDefinitionRepository__Group__1__Impl rule__TaskDefinitionRepository__Group__2
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
    // InternalTaskDefinition.g:939:1: rule__TaskDefinitionRepository__Group__1__Impl : ( ( rule__TaskDefinitionRepository__NameAssignment_1 ) ) ;
    public final void rule__TaskDefinitionRepository__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:943:1: ( ( ( rule__TaskDefinitionRepository__NameAssignment_1 ) ) )
            // InternalTaskDefinition.g:944:1: ( ( rule__TaskDefinitionRepository__NameAssignment_1 ) )
            {
            // InternalTaskDefinition.g:944:1: ( ( rule__TaskDefinitionRepository__NameAssignment_1 ) )
            // InternalTaskDefinition.g:945:2: ( rule__TaskDefinitionRepository__NameAssignment_1 )
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getNameAssignment_1()); 
            // InternalTaskDefinition.g:946:2: ( rule__TaskDefinitionRepository__NameAssignment_1 )
            // InternalTaskDefinition.g:946:3: rule__TaskDefinitionRepository__NameAssignment_1
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
    // InternalTaskDefinition.g:954:1: rule__TaskDefinitionRepository__Group__2 : rule__TaskDefinitionRepository__Group__2__Impl rule__TaskDefinitionRepository__Group__3 ;
    public final void rule__TaskDefinitionRepository__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:958:1: ( rule__TaskDefinitionRepository__Group__2__Impl rule__TaskDefinitionRepository__Group__3 )
            // InternalTaskDefinition.g:959:2: rule__TaskDefinitionRepository__Group__2__Impl rule__TaskDefinitionRepository__Group__3
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
    // InternalTaskDefinition.g:966:1: rule__TaskDefinitionRepository__Group__2__Impl : ( '{' ) ;
    public final void rule__TaskDefinitionRepository__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:970:1: ( ( '{' ) )
            // InternalTaskDefinition.g:971:1: ( '{' )
            {
            // InternalTaskDefinition.g:971:1: ( '{' )
            // InternalTaskDefinition.g:972:2: '{'
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTaskDefinition.g:981:1: rule__TaskDefinitionRepository__Group__3 : rule__TaskDefinitionRepository__Group__3__Impl rule__TaskDefinitionRepository__Group__4 ;
    public final void rule__TaskDefinitionRepository__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:985:1: ( rule__TaskDefinitionRepository__Group__3__Impl rule__TaskDefinitionRepository__Group__4 )
            // InternalTaskDefinition.g:986:2: rule__TaskDefinitionRepository__Group__3__Impl rule__TaskDefinitionRepository__Group__4
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
    // InternalTaskDefinition.g:993:1: rule__TaskDefinitionRepository__Group__3__Impl : ( ( rule__TaskDefinitionRepository__TasksAssignment_3 )* ) ;
    public final void rule__TaskDefinitionRepository__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:997:1: ( ( ( rule__TaskDefinitionRepository__TasksAssignment_3 )* ) )
            // InternalTaskDefinition.g:998:1: ( ( rule__TaskDefinitionRepository__TasksAssignment_3 )* )
            {
            // InternalTaskDefinition.g:998:1: ( ( rule__TaskDefinitionRepository__TasksAssignment_3 )* )
            // InternalTaskDefinition.g:999:2: ( rule__TaskDefinitionRepository__TasksAssignment_3 )*
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getTasksAssignment_3()); 
            // InternalTaskDefinition.g:1000:2: ( rule__TaskDefinitionRepository__TasksAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==33) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalTaskDefinition.g:1000:3: rule__TaskDefinitionRepository__TasksAssignment_3
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
    // InternalTaskDefinition.g:1008:1: rule__TaskDefinitionRepository__Group__4 : rule__TaskDefinitionRepository__Group__4__Impl ;
    public final void rule__TaskDefinitionRepository__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1012:1: ( rule__TaskDefinitionRepository__Group__4__Impl )
            // InternalTaskDefinition.g:1013:2: rule__TaskDefinitionRepository__Group__4__Impl
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
    // InternalTaskDefinition.g:1019:1: rule__TaskDefinitionRepository__Group__4__Impl : ( '}' ) ;
    public final void rule__TaskDefinitionRepository__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1023:1: ( ( '}' ) )
            // InternalTaskDefinition.g:1024:1: ( '}' )
            {
            // InternalTaskDefinition.g:1024:1: ( '}' )
            // InternalTaskDefinition.g:1025:2: '}'
            {
             before(grammarAccess.getTaskDefinitionRepositoryAccess().getRightCurlyBracketKeyword_4()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1035:1: rule__TaskDefinition__Group__0 : rule__TaskDefinition__Group__0__Impl rule__TaskDefinition__Group__1 ;
    public final void rule__TaskDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1039:1: ( rule__TaskDefinition__Group__0__Impl rule__TaskDefinition__Group__1 )
            // InternalTaskDefinition.g:1040:2: rule__TaskDefinition__Group__0__Impl rule__TaskDefinition__Group__1
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
    // InternalTaskDefinition.g:1047:1: rule__TaskDefinition__Group__0__Impl : ( 'TaskDefinition' ) ;
    public final void rule__TaskDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1051:1: ( ( 'TaskDefinition' ) )
            // InternalTaskDefinition.g:1052:1: ( 'TaskDefinition' )
            {
            // InternalTaskDefinition.g:1052:1: ( 'TaskDefinition' )
            // InternalTaskDefinition.g:1053:2: 'TaskDefinition'
            {
             before(grammarAccess.getTaskDefinitionAccess().getTaskDefinitionKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1062:1: rule__TaskDefinition__Group__1 : rule__TaskDefinition__Group__1__Impl rule__TaskDefinition__Group__2 ;
    public final void rule__TaskDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1066:1: ( rule__TaskDefinition__Group__1__Impl rule__TaskDefinition__Group__2 )
            // InternalTaskDefinition.g:1067:2: rule__TaskDefinition__Group__1__Impl rule__TaskDefinition__Group__2
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
    // InternalTaskDefinition.g:1074:1: rule__TaskDefinition__Group__1__Impl : ( ( rule__TaskDefinition__NameAssignment_1 ) ) ;
    public final void rule__TaskDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1078:1: ( ( ( rule__TaskDefinition__NameAssignment_1 ) ) )
            // InternalTaskDefinition.g:1079:1: ( ( rule__TaskDefinition__NameAssignment_1 ) )
            {
            // InternalTaskDefinition.g:1079:1: ( ( rule__TaskDefinition__NameAssignment_1 ) )
            // InternalTaskDefinition.g:1080:2: ( rule__TaskDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getTaskDefinitionAccess().getNameAssignment_1()); 
            // InternalTaskDefinition.g:1081:2: ( rule__TaskDefinition__NameAssignment_1 )
            // InternalTaskDefinition.g:1081:3: rule__TaskDefinition__NameAssignment_1
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
    // InternalTaskDefinition.g:1089:1: rule__TaskDefinition__Group__2 : rule__TaskDefinition__Group__2__Impl rule__TaskDefinition__Group__3 ;
    public final void rule__TaskDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1093:1: ( rule__TaskDefinition__Group__2__Impl rule__TaskDefinition__Group__3 )
            // InternalTaskDefinition.g:1094:2: rule__TaskDefinition__Group__2__Impl rule__TaskDefinition__Group__3
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
    // InternalTaskDefinition.g:1101:1: rule__TaskDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1105:1: ( ( '{' ) )
            // InternalTaskDefinition.g:1106:1: ( '{' )
            {
            // InternalTaskDefinition.g:1106:1: ( '{' )
            // InternalTaskDefinition.g:1107:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1116:1: rule__TaskDefinition__Group__3 : rule__TaskDefinition__Group__3__Impl rule__TaskDefinition__Group__4 ;
    public final void rule__TaskDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1120:1: ( rule__TaskDefinition__Group__3__Impl rule__TaskDefinition__Group__4 )
            // InternalTaskDefinition.g:1121:2: rule__TaskDefinition__Group__3__Impl rule__TaskDefinition__Group__4
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
    // InternalTaskDefinition.g:1128:1: rule__TaskDefinition__Group__3__Impl : ( ( rule__TaskDefinition__Group_3__0 )? ) ;
    public final void rule__TaskDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1132:1: ( ( ( rule__TaskDefinition__Group_3__0 )? ) )
            // InternalTaskDefinition.g:1133:1: ( ( rule__TaskDefinition__Group_3__0 )? )
            {
            // InternalTaskDefinition.g:1133:1: ( ( rule__TaskDefinition__Group_3__0 )? )
            // InternalTaskDefinition.g:1134:2: ( rule__TaskDefinition__Group_3__0 )?
            {
             before(grammarAccess.getTaskDefinitionAccess().getGroup_3()); 
            // InternalTaskDefinition.g:1135:2: ( rule__TaskDefinition__Group_3__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==35) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTaskDefinition.g:1135:3: rule__TaskDefinition__Group_3__0
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
    // InternalTaskDefinition.g:1143:1: rule__TaskDefinition__Group__4 : rule__TaskDefinition__Group__4__Impl rule__TaskDefinition__Group__5 ;
    public final void rule__TaskDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1147:1: ( rule__TaskDefinition__Group__4__Impl rule__TaskDefinition__Group__5 )
            // InternalTaskDefinition.g:1148:2: rule__TaskDefinition__Group__4__Impl rule__TaskDefinition__Group__5
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
    // InternalTaskDefinition.g:1155:1: rule__TaskDefinition__Group__4__Impl : ( ( rule__TaskDefinition__Group_4__0 )? ) ;
    public final void rule__TaskDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1159:1: ( ( ( rule__TaskDefinition__Group_4__0 )? ) )
            // InternalTaskDefinition.g:1160:1: ( ( rule__TaskDefinition__Group_4__0 )? )
            {
            // InternalTaskDefinition.g:1160:1: ( ( rule__TaskDefinition__Group_4__0 )? )
            // InternalTaskDefinition.g:1161:2: ( rule__TaskDefinition__Group_4__0 )?
            {
             before(grammarAccess.getTaskDefinitionAccess().getGroup_4()); 
            // InternalTaskDefinition.g:1162:2: ( rule__TaskDefinition__Group_4__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTaskDefinition.g:1162:3: rule__TaskDefinition__Group_4__0
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
    // InternalTaskDefinition.g:1170:1: rule__TaskDefinition__Group__5 : rule__TaskDefinition__Group__5__Impl rule__TaskDefinition__Group__6 ;
    public final void rule__TaskDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1174:1: ( rule__TaskDefinition__Group__5__Impl rule__TaskDefinition__Group__6 )
            // InternalTaskDefinition.g:1175:2: rule__TaskDefinition__Group__5__Impl rule__TaskDefinition__Group__6
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
    // InternalTaskDefinition.g:1182:1: rule__TaskDefinition__Group__5__Impl : ( 'results' ) ;
    public final void rule__TaskDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1186:1: ( ( 'results' ) )
            // InternalTaskDefinition.g:1187:1: ( 'results' )
            {
            // InternalTaskDefinition.g:1187:1: ( 'results' )
            // InternalTaskDefinition.g:1188:2: 'results'
            {
             before(grammarAccess.getTaskDefinitionAccess().getResultsKeyword_5()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1197:1: rule__TaskDefinition__Group__6 : rule__TaskDefinition__Group__6__Impl rule__TaskDefinition__Group__7 ;
    public final void rule__TaskDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1201:1: ( rule__TaskDefinition__Group__6__Impl rule__TaskDefinition__Group__7 )
            // InternalTaskDefinition.g:1202:2: rule__TaskDefinition__Group__6__Impl rule__TaskDefinition__Group__7
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
    // InternalTaskDefinition.g:1209:1: rule__TaskDefinition__Group__6__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1213:1: ( ( '{' ) )
            // InternalTaskDefinition.g:1214:1: ( '{' )
            {
            // InternalTaskDefinition.g:1214:1: ( '{' )
            // InternalTaskDefinition.g:1215:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1224:1: rule__TaskDefinition__Group__7 : rule__TaskDefinition__Group__7__Impl rule__TaskDefinition__Group__8 ;
    public final void rule__TaskDefinition__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1228:1: ( rule__TaskDefinition__Group__7__Impl rule__TaskDefinition__Group__8 )
            // InternalTaskDefinition.g:1229:2: rule__TaskDefinition__Group__7__Impl rule__TaskDefinition__Group__8
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
    // InternalTaskDefinition.g:1236:1: rule__TaskDefinition__Group__7__Impl : ( ( ( rule__TaskDefinition__ResultsAssignment_7 ) ) ( ( rule__TaskDefinition__ResultsAssignment_7 )* ) ) ;
    public final void rule__TaskDefinition__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1240:1: ( ( ( ( rule__TaskDefinition__ResultsAssignment_7 ) ) ( ( rule__TaskDefinition__ResultsAssignment_7 )* ) ) )
            // InternalTaskDefinition.g:1241:1: ( ( ( rule__TaskDefinition__ResultsAssignment_7 ) ) ( ( rule__TaskDefinition__ResultsAssignment_7 )* ) )
            {
            // InternalTaskDefinition.g:1241:1: ( ( ( rule__TaskDefinition__ResultsAssignment_7 ) ) ( ( rule__TaskDefinition__ResultsAssignment_7 )* ) )
            // InternalTaskDefinition.g:1242:2: ( ( rule__TaskDefinition__ResultsAssignment_7 ) ) ( ( rule__TaskDefinition__ResultsAssignment_7 )* )
            {
            // InternalTaskDefinition.g:1242:2: ( ( rule__TaskDefinition__ResultsAssignment_7 ) )
            // InternalTaskDefinition.g:1243:3: ( rule__TaskDefinition__ResultsAssignment_7 )
            {
             before(grammarAccess.getTaskDefinitionAccess().getResultsAssignment_7()); 
            // InternalTaskDefinition.g:1244:3: ( rule__TaskDefinition__ResultsAssignment_7 )
            // InternalTaskDefinition.g:1244:4: rule__TaskDefinition__ResultsAssignment_7
            {
            pushFollow(FOLLOW_11);
            rule__TaskDefinition__ResultsAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getTaskDefinitionAccess().getResultsAssignment_7()); 

            }

            // InternalTaskDefinition.g:1247:2: ( ( rule__TaskDefinition__ResultsAssignment_7 )* )
            // InternalTaskDefinition.g:1248:3: ( rule__TaskDefinition__ResultsAssignment_7 )*
            {
             before(grammarAccess.getTaskDefinitionAccess().getResultsAssignment_7()); 
            // InternalTaskDefinition.g:1249:3: ( rule__TaskDefinition__ResultsAssignment_7 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=16 && LA13_0<=17)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalTaskDefinition.g:1249:4: rule__TaskDefinition__ResultsAssignment_7
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
    // InternalTaskDefinition.g:1258:1: rule__TaskDefinition__Group__8 : rule__TaskDefinition__Group__8__Impl rule__TaskDefinition__Group__9 ;
    public final void rule__TaskDefinition__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1262:1: ( rule__TaskDefinition__Group__8__Impl rule__TaskDefinition__Group__9 )
            // InternalTaskDefinition.g:1263:2: rule__TaskDefinition__Group__8__Impl rule__TaskDefinition__Group__9
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
    // InternalTaskDefinition.g:1270:1: rule__TaskDefinition__Group__8__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1274:1: ( ( '}' ) )
            // InternalTaskDefinition.g:1275:1: ( '}' )
            {
            // InternalTaskDefinition.g:1275:1: ( '}' )
            // InternalTaskDefinition.g:1276:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_8()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1285:1: rule__TaskDefinition__Group__9 : rule__TaskDefinition__Group__9__Impl ;
    public final void rule__TaskDefinition__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1289:1: ( rule__TaskDefinition__Group__9__Impl )
            // InternalTaskDefinition.g:1290:2: rule__TaskDefinition__Group__9__Impl
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
    // InternalTaskDefinition.g:1296:1: rule__TaskDefinition__Group__9__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1300:1: ( ( '}' ) )
            // InternalTaskDefinition.g:1301:1: ( '}' )
            {
            // InternalTaskDefinition.g:1301:1: ( '}' )
            // InternalTaskDefinition.g:1302:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_9()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1312:1: rule__TaskDefinition__Group_3__0 : rule__TaskDefinition__Group_3__0__Impl rule__TaskDefinition__Group_3__1 ;
    public final void rule__TaskDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1316:1: ( rule__TaskDefinition__Group_3__0__Impl rule__TaskDefinition__Group_3__1 )
            // InternalTaskDefinition.g:1317:2: rule__TaskDefinition__Group_3__0__Impl rule__TaskDefinition__Group_3__1
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
    // InternalTaskDefinition.g:1324:1: rule__TaskDefinition__Group_3__0__Impl : ( 'in' ) ;
    public final void rule__TaskDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1328:1: ( ( 'in' ) )
            // InternalTaskDefinition.g:1329:1: ( 'in' )
            {
            // InternalTaskDefinition.g:1329:1: ( 'in' )
            // InternalTaskDefinition.g:1330:2: 'in'
            {
             before(grammarAccess.getTaskDefinitionAccess().getInKeyword_3_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1339:1: rule__TaskDefinition__Group_3__1 : rule__TaskDefinition__Group_3__1__Impl rule__TaskDefinition__Group_3__2 ;
    public final void rule__TaskDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1343:1: ( rule__TaskDefinition__Group_3__1__Impl rule__TaskDefinition__Group_3__2 )
            // InternalTaskDefinition.g:1344:2: rule__TaskDefinition__Group_3__1__Impl rule__TaskDefinition__Group_3__2
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
    // InternalTaskDefinition.g:1351:1: rule__TaskDefinition__Group_3__1__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1355:1: ( ( '{' ) )
            // InternalTaskDefinition.g:1356:1: ( '{' )
            {
            // InternalTaskDefinition.g:1356:1: ( '{' )
            // InternalTaskDefinition.g:1357:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_3_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1366:1: rule__TaskDefinition__Group_3__2 : rule__TaskDefinition__Group_3__2__Impl rule__TaskDefinition__Group_3__3 ;
    public final void rule__TaskDefinition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1370:1: ( rule__TaskDefinition__Group_3__2__Impl rule__TaskDefinition__Group_3__3 )
            // InternalTaskDefinition.g:1371:2: rule__TaskDefinition__Group_3__2__Impl rule__TaskDefinition__Group_3__3
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
    // InternalTaskDefinition.g:1378:1: rule__TaskDefinition__Group_3__2__Impl : ( ( rule__TaskDefinition__InAttributeAssignment_3_2 )* ) ;
    public final void rule__TaskDefinition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1382:1: ( ( ( rule__TaskDefinition__InAttributeAssignment_3_2 )* ) )
            // InternalTaskDefinition.g:1383:1: ( ( rule__TaskDefinition__InAttributeAssignment_3_2 )* )
            {
            // InternalTaskDefinition.g:1383:1: ( ( rule__TaskDefinition__InAttributeAssignment_3_2 )* )
            // InternalTaskDefinition.g:1384:2: ( rule__TaskDefinition__InAttributeAssignment_3_2 )*
            {
             before(grammarAccess.getTaskDefinitionAccess().getInAttributeAssignment_3_2()); 
            // InternalTaskDefinition.g:1385:2: ( rule__TaskDefinition__InAttributeAssignment_3_2 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalTaskDefinition.g:1385:3: rule__TaskDefinition__InAttributeAssignment_3_2
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
    // InternalTaskDefinition.g:1393:1: rule__TaskDefinition__Group_3__3 : rule__TaskDefinition__Group_3__3__Impl ;
    public final void rule__TaskDefinition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1397:1: ( rule__TaskDefinition__Group_3__3__Impl )
            // InternalTaskDefinition.g:1398:2: rule__TaskDefinition__Group_3__3__Impl
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
    // InternalTaskDefinition.g:1404:1: rule__TaskDefinition__Group_3__3__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1408:1: ( ( '}' ) )
            // InternalTaskDefinition.g:1409:1: ( '}' )
            {
            // InternalTaskDefinition.g:1409:1: ( '}' )
            // InternalTaskDefinition.g:1410:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_3_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1420:1: rule__TaskDefinition__Group_4__0 : rule__TaskDefinition__Group_4__0__Impl rule__TaskDefinition__Group_4__1 ;
    public final void rule__TaskDefinition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1424:1: ( rule__TaskDefinition__Group_4__0__Impl rule__TaskDefinition__Group_4__1 )
            // InternalTaskDefinition.g:1425:2: rule__TaskDefinition__Group_4__0__Impl rule__TaskDefinition__Group_4__1
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
    // InternalTaskDefinition.g:1432:1: rule__TaskDefinition__Group_4__0__Impl : ( 'out' ) ;
    public final void rule__TaskDefinition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1436:1: ( ( 'out' ) )
            // InternalTaskDefinition.g:1437:1: ( 'out' )
            {
            // InternalTaskDefinition.g:1437:1: ( 'out' )
            // InternalTaskDefinition.g:1438:2: 'out'
            {
             before(grammarAccess.getTaskDefinitionAccess().getOutKeyword_4_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1447:1: rule__TaskDefinition__Group_4__1 : rule__TaskDefinition__Group_4__1__Impl rule__TaskDefinition__Group_4__2 ;
    public final void rule__TaskDefinition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1451:1: ( rule__TaskDefinition__Group_4__1__Impl rule__TaskDefinition__Group_4__2 )
            // InternalTaskDefinition.g:1452:2: rule__TaskDefinition__Group_4__1__Impl rule__TaskDefinition__Group_4__2
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
    // InternalTaskDefinition.g:1459:1: rule__TaskDefinition__Group_4__1__Impl : ( '{' ) ;
    public final void rule__TaskDefinition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1463:1: ( ( '{' ) )
            // InternalTaskDefinition.g:1464:1: ( '{' )
            {
            // InternalTaskDefinition.g:1464:1: ( '{' )
            // InternalTaskDefinition.g:1465:2: '{'
            {
             before(grammarAccess.getTaskDefinitionAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1474:1: rule__TaskDefinition__Group_4__2 : rule__TaskDefinition__Group_4__2__Impl rule__TaskDefinition__Group_4__3 ;
    public final void rule__TaskDefinition__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1478:1: ( rule__TaskDefinition__Group_4__2__Impl rule__TaskDefinition__Group_4__3 )
            // InternalTaskDefinition.g:1479:2: rule__TaskDefinition__Group_4__2__Impl rule__TaskDefinition__Group_4__3
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
    // InternalTaskDefinition.g:1486:1: rule__TaskDefinition__Group_4__2__Impl : ( ( rule__TaskDefinition__OutAttributeAssignment_4_2 )* ) ;
    public final void rule__TaskDefinition__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1490:1: ( ( ( rule__TaskDefinition__OutAttributeAssignment_4_2 )* ) )
            // InternalTaskDefinition.g:1491:1: ( ( rule__TaskDefinition__OutAttributeAssignment_4_2 )* )
            {
            // InternalTaskDefinition.g:1491:1: ( ( rule__TaskDefinition__OutAttributeAssignment_4_2 )* )
            // InternalTaskDefinition.g:1492:2: ( rule__TaskDefinition__OutAttributeAssignment_4_2 )*
            {
             before(grammarAccess.getTaskDefinitionAccess().getOutAttributeAssignment_4_2()); 
            // InternalTaskDefinition.g:1493:2: ( rule__TaskDefinition__OutAttributeAssignment_4_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalTaskDefinition.g:1493:3: rule__TaskDefinition__OutAttributeAssignment_4_2
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
    // InternalTaskDefinition.g:1501:1: rule__TaskDefinition__Group_4__3 : rule__TaskDefinition__Group_4__3__Impl ;
    public final void rule__TaskDefinition__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1505:1: ( rule__TaskDefinition__Group_4__3__Impl )
            // InternalTaskDefinition.g:1506:2: rule__TaskDefinition__Group_4__3__Impl
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
    // InternalTaskDefinition.g:1512:1: rule__TaskDefinition__Group_4__3__Impl : ( '}' ) ;
    public final void rule__TaskDefinition__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1516:1: ( ( '}' ) )
            // InternalTaskDefinition.g:1517:1: ( '}' )
            {
            // InternalTaskDefinition.g:1517:1: ( '}' )
            // InternalTaskDefinition.g:1518:2: '}'
            {
             before(grammarAccess.getTaskDefinitionAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1528:1: rule__TaskResult__Group__0 : rule__TaskResult__Group__0__Impl rule__TaskResult__Group__1 ;
    public final void rule__TaskResult__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1532:1: ( rule__TaskResult__Group__0__Impl rule__TaskResult__Group__1 )
            // InternalTaskDefinition.g:1533:2: rule__TaskResult__Group__0__Impl rule__TaskResult__Group__1
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
    // InternalTaskDefinition.g:1540:1: rule__TaskResult__Group__0__Impl : ( ( rule__TaskResult__ResultAssignment_0 ) ) ;
    public final void rule__TaskResult__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1544:1: ( ( ( rule__TaskResult__ResultAssignment_0 ) ) )
            // InternalTaskDefinition.g:1545:1: ( ( rule__TaskResult__ResultAssignment_0 ) )
            {
            // InternalTaskDefinition.g:1545:1: ( ( rule__TaskResult__ResultAssignment_0 ) )
            // InternalTaskDefinition.g:1546:2: ( rule__TaskResult__ResultAssignment_0 )
            {
             before(grammarAccess.getTaskResultAccess().getResultAssignment_0()); 
            // InternalTaskDefinition.g:1547:2: ( rule__TaskResult__ResultAssignment_0 )
            // InternalTaskDefinition.g:1547:3: rule__TaskResult__ResultAssignment_0
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
    // InternalTaskDefinition.g:1555:1: rule__TaskResult__Group__1 : rule__TaskResult__Group__1__Impl rule__TaskResult__Group__2 ;
    public final void rule__TaskResult__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1559:1: ( rule__TaskResult__Group__1__Impl rule__TaskResult__Group__2 )
            // InternalTaskDefinition.g:1560:2: rule__TaskResult__Group__1__Impl rule__TaskResult__Group__2
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
    // InternalTaskDefinition.g:1567:1: rule__TaskResult__Group__1__Impl : ( 'value' ) ;
    public final void rule__TaskResult__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1571:1: ( ( 'value' ) )
            // InternalTaskDefinition.g:1572:1: ( 'value' )
            {
            // InternalTaskDefinition.g:1572:1: ( 'value' )
            // InternalTaskDefinition.g:1573:2: 'value'
            {
             before(grammarAccess.getTaskResultAccess().getValueKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1582:1: rule__TaskResult__Group__2 : rule__TaskResult__Group__2__Impl rule__TaskResult__Group__3 ;
    public final void rule__TaskResult__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1586:1: ( rule__TaskResult__Group__2__Impl rule__TaskResult__Group__3 )
            // InternalTaskDefinition.g:1587:2: rule__TaskResult__Group__2__Impl rule__TaskResult__Group__3
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
    // InternalTaskDefinition.g:1594:1: rule__TaskResult__Group__2__Impl : ( '=' ) ;
    public final void rule__TaskResult__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1598:1: ( ( '=' ) )
            // InternalTaskDefinition.g:1599:1: ( '=' )
            {
            // InternalTaskDefinition.g:1599:1: ( '=' )
            // InternalTaskDefinition.g:1600:2: '='
            {
             before(grammarAccess.getTaskResultAccess().getEqualsSignKeyword_2()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1609:1: rule__TaskResult__Group__3 : rule__TaskResult__Group__3__Impl rule__TaskResult__Group__4 ;
    public final void rule__TaskResult__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1613:1: ( rule__TaskResult__Group__3__Impl rule__TaskResult__Group__4 )
            // InternalTaskDefinition.g:1614:2: rule__TaskResult__Group__3__Impl rule__TaskResult__Group__4
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
    // InternalTaskDefinition.g:1621:1: rule__TaskResult__Group__3__Impl : ( ( rule__TaskResult__ResultValueAssignment_3 ) ) ;
    public final void rule__TaskResult__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1625:1: ( ( ( rule__TaskResult__ResultValueAssignment_3 ) ) )
            // InternalTaskDefinition.g:1626:1: ( ( rule__TaskResult__ResultValueAssignment_3 ) )
            {
            // InternalTaskDefinition.g:1626:1: ( ( rule__TaskResult__ResultValueAssignment_3 ) )
            // InternalTaskDefinition.g:1627:2: ( rule__TaskResult__ResultValueAssignment_3 )
            {
             before(grammarAccess.getTaskResultAccess().getResultValueAssignment_3()); 
            // InternalTaskDefinition.g:1628:2: ( rule__TaskResult__ResultValueAssignment_3 )
            // InternalTaskDefinition.g:1628:3: rule__TaskResult__ResultValueAssignment_3
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
    // InternalTaskDefinition.g:1636:1: rule__TaskResult__Group__4 : rule__TaskResult__Group__4__Impl ;
    public final void rule__TaskResult__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1640:1: ( rule__TaskResult__Group__4__Impl )
            // InternalTaskDefinition.g:1641:2: rule__TaskResult__Group__4__Impl
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
    // InternalTaskDefinition.g:1647:1: rule__TaskResult__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__TaskResult__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1651:1: ( ( ( ';' )? ) )
            // InternalTaskDefinition.g:1652:1: ( ( ';' )? )
            {
            // InternalTaskDefinition.g:1652:1: ( ( ';' )? )
            // InternalTaskDefinition.g:1653:2: ( ';' )?
            {
             before(grammarAccess.getTaskResultAccess().getSemicolonKeyword_4()); 
            // InternalTaskDefinition.g:1654:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==39) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTaskDefinition.g:1654:3: ';'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalTaskDefinition.g:1663:1: rule__AttributeDefinition__Group__0 : rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 ;
    public final void rule__AttributeDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1667:1: ( rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1 )
            // InternalTaskDefinition.g:1668:2: rule__AttributeDefinition__Group__0__Impl rule__AttributeDefinition__Group__1
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
    // InternalTaskDefinition.g:1675:1: rule__AttributeDefinition__Group__0__Impl : ( ( rule__AttributeDefinition__NameAssignment_0 ) ) ;
    public final void rule__AttributeDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1679:1: ( ( ( rule__AttributeDefinition__NameAssignment_0 ) ) )
            // InternalTaskDefinition.g:1680:1: ( ( rule__AttributeDefinition__NameAssignment_0 ) )
            {
            // InternalTaskDefinition.g:1680:1: ( ( rule__AttributeDefinition__NameAssignment_0 ) )
            // InternalTaskDefinition.g:1681:2: ( rule__AttributeDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getNameAssignment_0()); 
            // InternalTaskDefinition.g:1682:2: ( rule__AttributeDefinition__NameAssignment_0 )
            // InternalTaskDefinition.g:1682:3: rule__AttributeDefinition__NameAssignment_0
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
    // InternalTaskDefinition.g:1690:1: rule__AttributeDefinition__Group__1 : rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 ;
    public final void rule__AttributeDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1694:1: ( rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2 )
            // InternalTaskDefinition.g:1695:2: rule__AttributeDefinition__Group__1__Impl rule__AttributeDefinition__Group__2
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
    // InternalTaskDefinition.g:1702:1: rule__AttributeDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__AttributeDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1706:1: ( ( ':' ) )
            // InternalTaskDefinition.g:1707:1: ( ':' )
            {
            // InternalTaskDefinition.g:1707:1: ( ':' )
            // InternalTaskDefinition.g:1708:2: ':'
            {
             before(grammarAccess.getAttributeDefinitionAccess().getColonKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1717:1: rule__AttributeDefinition__Group__2 : rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 ;
    public final void rule__AttributeDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1721:1: ( rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3 )
            // InternalTaskDefinition.g:1722:2: rule__AttributeDefinition__Group__2__Impl rule__AttributeDefinition__Group__3
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
    // InternalTaskDefinition.g:1729:1: rule__AttributeDefinition__Group__2__Impl : ( ( rule__AttributeDefinition__TypeAssignment_2 ) ) ;
    public final void rule__AttributeDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1733:1: ( ( ( rule__AttributeDefinition__TypeAssignment_2 ) ) )
            // InternalTaskDefinition.g:1734:1: ( ( rule__AttributeDefinition__TypeAssignment_2 ) )
            {
            // InternalTaskDefinition.g:1734:1: ( ( rule__AttributeDefinition__TypeAssignment_2 ) )
            // InternalTaskDefinition.g:1735:2: ( rule__AttributeDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getTypeAssignment_2()); 
            // InternalTaskDefinition.g:1736:2: ( rule__AttributeDefinition__TypeAssignment_2 )
            // InternalTaskDefinition.g:1736:3: rule__AttributeDefinition__TypeAssignment_2
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
    // InternalTaskDefinition.g:1744:1: rule__AttributeDefinition__Group__3 : rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 ;
    public final void rule__AttributeDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1748:1: ( rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4 )
            // InternalTaskDefinition.g:1749:2: rule__AttributeDefinition__Group__3__Impl rule__AttributeDefinition__Group__4
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
    // InternalTaskDefinition.g:1756:1: rule__AttributeDefinition__Group__3__Impl : ( ( rule__AttributeDefinition__Group_3__0 )? ) ;
    public final void rule__AttributeDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1760:1: ( ( ( rule__AttributeDefinition__Group_3__0 )? ) )
            // InternalTaskDefinition.g:1761:1: ( ( rule__AttributeDefinition__Group_3__0 )? )
            {
            // InternalTaskDefinition.g:1761:1: ( ( rule__AttributeDefinition__Group_3__0 )? )
            // InternalTaskDefinition.g:1762:2: ( rule__AttributeDefinition__Group_3__0 )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getGroup_3()); 
            // InternalTaskDefinition.g:1763:2: ( rule__AttributeDefinition__Group_3__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalTaskDefinition.g:1763:3: rule__AttributeDefinition__Group_3__0
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
    // InternalTaskDefinition.g:1771:1: rule__AttributeDefinition__Group__4 : rule__AttributeDefinition__Group__4__Impl ;
    public final void rule__AttributeDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1775:1: ( rule__AttributeDefinition__Group__4__Impl )
            // InternalTaskDefinition.g:1776:2: rule__AttributeDefinition__Group__4__Impl
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
    // InternalTaskDefinition.g:1782:1: rule__AttributeDefinition__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__AttributeDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1786:1: ( ( ( ';' )? ) )
            // InternalTaskDefinition.g:1787:1: ( ( ';' )? )
            {
            // InternalTaskDefinition.g:1787:1: ( ( ';' )? )
            // InternalTaskDefinition.g:1788:2: ( ';' )?
            {
             before(grammarAccess.getAttributeDefinitionAccess().getSemicolonKeyword_4()); 
            // InternalTaskDefinition.g:1789:2: ( ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTaskDefinition.g:1789:3: ';'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalTaskDefinition.g:1798:1: rule__AttributeDefinition__Group_3__0 : rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1 ;
    public final void rule__AttributeDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1802:1: ( rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1 )
            // InternalTaskDefinition.g:1803:2: rule__AttributeDefinition__Group_3__0__Impl rule__AttributeDefinition__Group_3__1
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
    // InternalTaskDefinition.g:1810:1: rule__AttributeDefinition__Group_3__0__Impl : ( '=' ) ;
    public final void rule__AttributeDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1814:1: ( ( '=' ) )
            // InternalTaskDefinition.g:1815:1: ( '=' )
            {
            // InternalTaskDefinition.g:1815:1: ( '=' )
            // InternalTaskDefinition.g:1816:2: '='
            {
             before(grammarAccess.getAttributeDefinitionAccess().getEqualsSignKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTaskDefinition.g:1825:1: rule__AttributeDefinition__Group_3__1 : rule__AttributeDefinition__Group_3__1__Impl ;
    public final void rule__AttributeDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1829:1: ( rule__AttributeDefinition__Group_3__1__Impl )
            // InternalTaskDefinition.g:1830:2: rule__AttributeDefinition__Group_3__1__Impl
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
    // InternalTaskDefinition.g:1836:1: rule__AttributeDefinition__Group_3__1__Impl : ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) ) ;
    public final void rule__AttributeDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1840:1: ( ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) ) )
            // InternalTaskDefinition.g:1841:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) )
            {
            // InternalTaskDefinition.g:1841:1: ( ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 ) )
            // InternalTaskDefinition.g:1842:2: ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 )
            {
             before(grammarAccess.getAttributeDefinitionAccess().getDefaultvalueAssignment_3_1()); 
            // InternalTaskDefinition.g:1843:2: ( rule__AttributeDefinition__DefaultvalueAssignment_3_1 )
            // InternalTaskDefinition.g:1843:3: rule__AttributeDefinition__DefaultvalueAssignment_3_1
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
    // InternalTaskDefinition.g:1852:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1856:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalTaskDefinition.g:1857:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalTaskDefinition.g:1864:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1868:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:1869:1: ( RULE_ID )
            {
            // InternalTaskDefinition.g:1869:1: ( RULE_ID )
            // InternalTaskDefinition.g:1870:2: RULE_ID
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
    // InternalTaskDefinition.g:1879:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1883:1: ( rule__FQN__Group__1__Impl )
            // InternalTaskDefinition.g:1884:2: rule__FQN__Group__1__Impl
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
    // InternalTaskDefinition.g:1890:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1894:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalTaskDefinition.g:1895:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalTaskDefinition.g:1895:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalTaskDefinition.g:1896:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalTaskDefinition.g:1897:2: ( rule__FQN__Group_1__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==41) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalTaskDefinition.g:1897:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalTaskDefinition.g:1906:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1910:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalTaskDefinition.g:1911:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalTaskDefinition.g:1918:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1922:1: ( ( '.' ) )
            // InternalTaskDefinition.g:1923:1: ( '.' )
            {
            // InternalTaskDefinition.g:1923:1: ( '.' )
            // InternalTaskDefinition.g:1924:2: '.'
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
    // InternalTaskDefinition.g:1933:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1937:1: ( rule__FQN__Group_1__1__Impl )
            // InternalTaskDefinition.g:1938:2: rule__FQN__Group_1__1__Impl
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
    // InternalTaskDefinition.g:1944:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1948:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:1949:1: ( RULE_ID )
            {
            // InternalTaskDefinition.g:1949:1: ( RULE_ID )
            // InternalTaskDefinition.g:1950:2: RULE_ID
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
    // InternalTaskDefinition.g:1960:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1964:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTaskDefinition.g:1965:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalTaskDefinition.g:1972:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1976:1: ( ( ( '-' )? ) )
            // InternalTaskDefinition.g:1977:1: ( ( '-' )? )
            {
            // InternalTaskDefinition.g:1977:1: ( ( '-' )? )
            // InternalTaskDefinition.g:1978:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTaskDefinition.g:1979:2: ( '-' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTaskDefinition.g:1979:3: '-'
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
    // InternalTaskDefinition.g:1987:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:1991:1: ( rule__EInt__Group__1__Impl )
            // InternalTaskDefinition.g:1992:2: rule__EInt__Group__1__Impl
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
    // InternalTaskDefinition.g:1998:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2002:1: ( ( RULE_INT ) )
            // InternalTaskDefinition.g:2003:1: ( RULE_INT )
            {
            // InternalTaskDefinition.g:2003:1: ( RULE_INT )
            // InternalTaskDefinition.g:2004:2: RULE_INT
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
    // InternalTaskDefinition.g:2014:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2018:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalTaskDefinition.g:2019:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
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
    // InternalTaskDefinition.g:2026:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2030:1: ( ( ( '-' )? ) )
            // InternalTaskDefinition.g:2031:1: ( ( '-' )? )
            {
            // InternalTaskDefinition.g:2031:1: ( ( '-' )? )
            // InternalTaskDefinition.g:2032:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalTaskDefinition.g:2033:2: ( '-' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==42) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTaskDefinition.g:2033:3: '-'
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
    // InternalTaskDefinition.g:2041:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2045:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalTaskDefinition.g:2046:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
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
    // InternalTaskDefinition.g:2053:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2057:1: ( ( ( RULE_INT )? ) )
            // InternalTaskDefinition.g:2058:1: ( ( RULE_INT )? )
            {
            // InternalTaskDefinition.g:2058:1: ( ( RULE_INT )? )
            // InternalTaskDefinition.g:2059:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalTaskDefinition.g:2060:2: ( RULE_INT )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_INT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTaskDefinition.g:2060:3: RULE_INT
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
    // InternalTaskDefinition.g:2068:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2072:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalTaskDefinition.g:2073:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
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
    // InternalTaskDefinition.g:2080:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2084:1: ( ( '.' ) )
            // InternalTaskDefinition.g:2085:1: ( '.' )
            {
            // InternalTaskDefinition.g:2085:1: ( '.' )
            // InternalTaskDefinition.g:2086:2: '.'
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
    // InternalTaskDefinition.g:2095:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2099:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalTaskDefinition.g:2100:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
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
    // InternalTaskDefinition.g:2107:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2111:1: ( ( RULE_INT ) )
            // InternalTaskDefinition.g:2112:1: ( RULE_INT )
            {
            // InternalTaskDefinition.g:2112:1: ( RULE_INT )
            // InternalTaskDefinition.g:2113:2: RULE_INT
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
    // InternalTaskDefinition.g:2122:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2126:1: ( rule__EDouble__Group__4__Impl )
            // InternalTaskDefinition.g:2127:2: rule__EDouble__Group__4__Impl
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
    // InternalTaskDefinition.g:2133:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2137:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalTaskDefinition.g:2138:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalTaskDefinition.g:2138:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalTaskDefinition.g:2139:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalTaskDefinition.g:2140:2: ( rule__EDouble__Group_4__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=13 && LA23_0<=14)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalTaskDefinition.g:2140:3: rule__EDouble__Group_4__0
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
    // InternalTaskDefinition.g:2149:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2153:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalTaskDefinition.g:2154:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
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
    // InternalTaskDefinition.g:2161:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2165:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalTaskDefinition.g:2166:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalTaskDefinition.g:2166:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalTaskDefinition.g:2167:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalTaskDefinition.g:2168:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalTaskDefinition.g:2168:3: rule__EDouble__Alternatives_4_0
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
    // InternalTaskDefinition.g:2176:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2180:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalTaskDefinition.g:2181:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
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
    // InternalTaskDefinition.g:2188:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2192:1: ( ( ( '-' )? ) )
            // InternalTaskDefinition.g:2193:1: ( ( '-' )? )
            {
            // InternalTaskDefinition.g:2193:1: ( ( '-' )? )
            // InternalTaskDefinition.g:2194:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalTaskDefinition.g:2195:2: ( '-' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTaskDefinition.g:2195:3: '-'
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
    // InternalTaskDefinition.g:2203:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2207:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalTaskDefinition.g:2208:2: rule__EDouble__Group_4__2__Impl
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
    // InternalTaskDefinition.g:2214:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2218:1: ( ( RULE_INT ) )
            // InternalTaskDefinition.g:2219:1: ( RULE_INT )
            {
            // InternalTaskDefinition.g:2219:1: ( RULE_INT )
            // InternalTaskDefinition.g:2220:2: RULE_INT
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
    // InternalTaskDefinition.g:2230:1: rule__EnumerationElement__Group__0 : rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 ;
    public final void rule__EnumerationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2234:1: ( rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 )
            // InternalTaskDefinition.g:2235:2: rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1
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
    // InternalTaskDefinition.g:2242:1: rule__EnumerationElement__Group__0__Impl : ( ( rule__EnumerationElement__NameAssignment_0 ) ) ;
    public final void rule__EnumerationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2246:1: ( ( ( rule__EnumerationElement__NameAssignment_0 ) ) )
            // InternalTaskDefinition.g:2247:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            {
            // InternalTaskDefinition.g:2247:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            // InternalTaskDefinition.g:2248:2: ( rule__EnumerationElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 
            // InternalTaskDefinition.g:2249:2: ( rule__EnumerationElement__NameAssignment_0 )
            // InternalTaskDefinition.g:2249:3: rule__EnumerationElement__NameAssignment_0
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
    // InternalTaskDefinition.g:2257:1: rule__EnumerationElement__Group__1 : rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 ;
    public final void rule__EnumerationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2261:1: ( rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 )
            // InternalTaskDefinition.g:2262:2: rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2
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
    // InternalTaskDefinition.g:2269:1: rule__EnumerationElement__Group__1__Impl : ( ( rule__EnumerationElement__Group_1__0 )? ) ;
    public final void rule__EnumerationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2273:1: ( ( ( rule__EnumerationElement__Group_1__0 )? ) )
            // InternalTaskDefinition.g:2274:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            {
            // InternalTaskDefinition.g:2274:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            // InternalTaskDefinition.g:2275:2: ( rule__EnumerationElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup_1()); 
            // InternalTaskDefinition.g:2276:2: ( rule__EnumerationElement__Group_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==38) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalTaskDefinition.g:2276:3: rule__EnumerationElement__Group_1__0
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
    // InternalTaskDefinition.g:2284:1: rule__EnumerationElement__Group__2 : rule__EnumerationElement__Group__2__Impl ;
    public final void rule__EnumerationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2288:1: ( rule__EnumerationElement__Group__2__Impl )
            // InternalTaskDefinition.g:2289:2: rule__EnumerationElement__Group__2__Impl
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
    // InternalTaskDefinition.g:2295:1: rule__EnumerationElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__EnumerationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2299:1: ( ( ( ';' )? ) )
            // InternalTaskDefinition.g:2300:1: ( ( ';' )? )
            {
            // InternalTaskDefinition.g:2300:1: ( ( ';' )? )
            // InternalTaskDefinition.g:2301:2: ( ';' )?
            {
             before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 
            // InternalTaskDefinition.g:2302:2: ( ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTaskDefinition.g:2302:3: ';'
                    {
                    match(input,39,FOLLOW_2); 

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
    // InternalTaskDefinition.g:2311:1: rule__EnumerationElement__Group_1__0 : rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 ;
    public final void rule__EnumerationElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2315:1: ( rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 )
            // InternalTaskDefinition.g:2316:2: rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1
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
    // InternalTaskDefinition.g:2323:1: rule__EnumerationElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2327:1: ( ( '=' ) )
            // InternalTaskDefinition.g:2328:1: ( '=' )
            {
            // InternalTaskDefinition.g:2328:1: ( '=' )
            // InternalTaskDefinition.g:2329:2: '='
            {
             before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTaskDefinition.g:2338:1: rule__EnumerationElement__Group_1__1 : rule__EnumerationElement__Group_1__1__Impl ;
    public final void rule__EnumerationElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2342:1: ( rule__EnumerationElement__Group_1__1__Impl )
            // InternalTaskDefinition.g:2343:2: rule__EnumerationElement__Group_1__1__Impl
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
    // InternalTaskDefinition.g:2349:1: rule__EnumerationElement__Group_1__1__Impl : ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2353:1: ( ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) )
            // InternalTaskDefinition.g:2354:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            {
            // InternalTaskDefinition.g:2354:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            // InternalTaskDefinition.g:2355:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 
            // InternalTaskDefinition.g:2356:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            // InternalTaskDefinition.g:2356:3: rule__EnumerationElement__ValueAssignment_1_1
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
    // InternalTaskDefinition.g:2365:1: rule__InlineEnumerationType__Group__0 : rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 ;
    public final void rule__InlineEnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2369:1: ( rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 )
            // InternalTaskDefinition.g:2370:2: rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1
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
    // InternalTaskDefinition.g:2377:1: rule__InlineEnumerationType__Group__0__Impl : ( 'InlineEnumeration' ) ;
    public final void rule__InlineEnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2381:1: ( ( 'InlineEnumeration' ) )
            // InternalTaskDefinition.g:2382:1: ( 'InlineEnumeration' )
            {
            // InternalTaskDefinition.g:2382:1: ( 'InlineEnumeration' )
            // InternalTaskDefinition.g:2383:2: 'InlineEnumeration'
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
    // InternalTaskDefinition.g:2392:1: rule__InlineEnumerationType__Group__1 : rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 ;
    public final void rule__InlineEnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2396:1: ( rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 )
            // InternalTaskDefinition.g:2397:2: rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2
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
    // InternalTaskDefinition.g:2404:1: rule__InlineEnumerationType__Group__1__Impl : ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) ;
    public final void rule__InlineEnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2408:1: ( ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) )
            // InternalTaskDefinition.g:2409:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            {
            // InternalTaskDefinition.g:2409:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            // InternalTaskDefinition.g:2410:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 
            // InternalTaskDefinition.g:2411:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==44) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTaskDefinition.g:2411:3: rule__InlineEnumerationType__ArrayAssignment_1
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
    // InternalTaskDefinition.g:2419:1: rule__InlineEnumerationType__Group__2 : rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 ;
    public final void rule__InlineEnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2423:1: ( rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 )
            // InternalTaskDefinition.g:2424:2: rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3
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
    // InternalTaskDefinition.g:2431:1: rule__InlineEnumerationType__Group__2__Impl : ( '{' ) ;
    public final void rule__InlineEnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2435:1: ( ( '{' ) )
            // InternalTaskDefinition.g:2436:1: ( '{' )
            {
            // InternalTaskDefinition.g:2436:1: ( '{' )
            // InternalTaskDefinition.g:2437:2: '{'
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
    // InternalTaskDefinition.g:2446:1: rule__InlineEnumerationType__Group__3 : rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 ;
    public final void rule__InlineEnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2450:1: ( rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 )
            // InternalTaskDefinition.g:2451:2: rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4
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
    // InternalTaskDefinition.g:2458:1: rule__InlineEnumerationType__Group__3__Impl : ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) ;
    public final void rule__InlineEnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2462:1: ( ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) )
            // InternalTaskDefinition.g:2463:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            {
            // InternalTaskDefinition.g:2463:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            // InternalTaskDefinition.g:2464:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            {
            // InternalTaskDefinition.g:2464:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) )
            // InternalTaskDefinition.g:2465:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalTaskDefinition.g:2466:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            // InternalTaskDefinition.g:2466:4: rule__InlineEnumerationType__EnumsAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__InlineEnumerationType__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }

            // InternalTaskDefinition.g:2469:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            // InternalTaskDefinition.g:2470:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalTaskDefinition.g:2471:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RULE_ID) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalTaskDefinition.g:2471:4: rule__InlineEnumerationType__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InlineEnumerationType__EnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalTaskDefinition.g:2480:1: rule__InlineEnumerationType__Group__4 : rule__InlineEnumerationType__Group__4__Impl ;
    public final void rule__InlineEnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2484:1: ( rule__InlineEnumerationType__Group__4__Impl )
            // InternalTaskDefinition.g:2485:2: rule__InlineEnumerationType__Group__4__Impl
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
    // InternalTaskDefinition.g:2491:1: rule__InlineEnumerationType__Group__4__Impl : ( '}' ) ;
    public final void rule__InlineEnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2495:1: ( ( '}' ) )
            // InternalTaskDefinition.g:2496:1: ( '}' )
            {
            // InternalTaskDefinition.g:2496:1: ( '}' )
            // InternalTaskDefinition.g:2497:2: '}'
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
    // InternalTaskDefinition.g:2507:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2511:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalTaskDefinition.g:2512:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTaskDefinition.g:2519:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2523:1: ( ( () ) )
            // InternalTaskDefinition.g:2524:1: ( () )
            {
            // InternalTaskDefinition.g:2524:1: ( () )
            // InternalTaskDefinition.g:2525:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // InternalTaskDefinition.g:2526:2: ()
            // InternalTaskDefinition.g:2526:3: 
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
    // InternalTaskDefinition.g:2534:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2538:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalTaskDefinition.g:2539:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_30);
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
    // InternalTaskDefinition.g:2546:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2550:1: ( ( '[' ) )
            // InternalTaskDefinition.g:2551:1: ( '[' )
            {
            // InternalTaskDefinition.g:2551:1: ( '[' )
            // InternalTaskDefinition.g:2552:2: '['
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
    // InternalTaskDefinition.g:2561:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2565:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalTaskDefinition.g:2566:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalTaskDefinition.g:2573:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__LengthAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2577:1: ( ( ( rule__ArrayType__LengthAssignment_2 )? ) )
            // InternalTaskDefinition.g:2578:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            {
            // InternalTaskDefinition.g:2578:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            // InternalTaskDefinition.g:2579:2: ( rule__ArrayType__LengthAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 
            // InternalTaskDefinition.g:2580:2: ( rule__ArrayType__LengthAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_INT||LA29_0==15) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTaskDefinition.g:2580:3: rule__ArrayType__LengthAssignment_2
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
    // InternalTaskDefinition.g:2588:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2592:1: ( rule__ArrayType__Group__3__Impl )
            // InternalTaskDefinition.g:2593:2: rule__ArrayType__Group__3__Impl
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
    // InternalTaskDefinition.g:2599:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2603:1: ( ( ']' ) )
            // InternalTaskDefinition.g:2604:1: ( ']' )
            {
            // InternalTaskDefinition.g:2604:1: ( ']' )
            // InternalTaskDefinition.g:2605:2: ']'
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
    // InternalTaskDefinition.g:2615:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2619:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalTaskDefinition.g:2620:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTaskDefinition.g:2627:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2631:1: ( ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) )
            // InternalTaskDefinition.g:2632:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            {
            // InternalTaskDefinition.g:2632:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            // InternalTaskDefinition.g:2633:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 
            // InternalTaskDefinition.g:2634:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            // InternalTaskDefinition.g:2634:3: rule__PrimitiveType__TypeNameAssignment_0
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
    // InternalTaskDefinition.g:2642:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2646:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalTaskDefinition.g:2647:2: rule__PrimitiveType__Group__1__Impl
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
    // InternalTaskDefinition.g:2653:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2657:1: ( ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) )
            // InternalTaskDefinition.g:2658:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            {
            // InternalTaskDefinition.g:2658:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            // InternalTaskDefinition.g:2659:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 
            // InternalTaskDefinition.g:2660:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==44) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalTaskDefinition.g:2660:3: rule__PrimitiveType__ArrayAssignment_1
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
    // InternalTaskDefinition.g:2669:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2673:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalTaskDefinition.g:2674:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTaskDefinition.g:2681:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2685:1: ( ( '[' ) )
            // InternalTaskDefinition.g:2686:1: ( '[' )
            {
            // InternalTaskDefinition.g:2686:1: ( '[' )
            // InternalTaskDefinition.g:2687:2: '['
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
    // InternalTaskDefinition.g:2696:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2700:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalTaskDefinition.g:2701:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalTaskDefinition.g:2708:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2712:1: ( ( ( rule__ArrayValue__ValuesAssignment_1 ) ) )
            // InternalTaskDefinition.g:2713:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            {
            // InternalTaskDefinition.g:2713:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            // InternalTaskDefinition.g:2714:2: ( rule__ArrayValue__ValuesAssignment_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 
            // InternalTaskDefinition.g:2715:2: ( rule__ArrayValue__ValuesAssignment_1 )
            // InternalTaskDefinition.g:2715:3: rule__ArrayValue__ValuesAssignment_1
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
    // InternalTaskDefinition.g:2723:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2727:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalTaskDefinition.g:2728:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalTaskDefinition.g:2735:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )* ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2739:1: ( ( ( rule__ArrayValue__Group_2__0 )* ) )
            // InternalTaskDefinition.g:2740:1: ( ( rule__ArrayValue__Group_2__0 )* )
            {
            // InternalTaskDefinition.g:2740:1: ( ( rule__ArrayValue__Group_2__0 )* )
            // InternalTaskDefinition.g:2741:2: ( rule__ArrayValue__Group_2__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalTaskDefinition.g:2742:2: ( rule__ArrayValue__Group_2__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==46) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalTaskDefinition.g:2742:3: rule__ArrayValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__ArrayValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalTaskDefinition.g:2750:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2754:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalTaskDefinition.g:2755:2: rule__ArrayValue__Group__3__Impl
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
    // InternalTaskDefinition.g:2761:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2765:1: ( ( ']' ) )
            // InternalTaskDefinition.g:2766:1: ( ']' )
            {
            // InternalTaskDefinition.g:2766:1: ( ']' )
            // InternalTaskDefinition.g:2767:2: ']'
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
    // InternalTaskDefinition.g:2777:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2781:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalTaskDefinition.g:2782:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTaskDefinition.g:2789:1: rule__ArrayValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2793:1: ( ( ',' ) )
            // InternalTaskDefinition.g:2794:1: ( ',' )
            {
            // InternalTaskDefinition.g:2794:1: ( ',' )
            // InternalTaskDefinition.g:2795:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalTaskDefinition.g:2804:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2808:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalTaskDefinition.g:2809:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalTaskDefinition.g:2815:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2819:1: ( ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) )
            // InternalTaskDefinition.g:2820:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            {
            // InternalTaskDefinition.g:2820:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            // InternalTaskDefinition.g:2821:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 
            // InternalTaskDefinition.g:2822:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            // InternalTaskDefinition.g:2822:3: rule__ArrayValue__ValuesAssignment_2_1
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
    // InternalTaskDefinition.g:2831:1: rule__SingleValue__Group_0__0 : rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 ;
    public final void rule__SingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2835:1: ( rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 )
            // InternalTaskDefinition.g:2836:2: rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1
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
    // InternalTaskDefinition.g:2843:1: rule__SingleValue__Group_0__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2847:1: ( ( () ) )
            // InternalTaskDefinition.g:2848:1: ( () )
            {
            // InternalTaskDefinition.g:2848:1: ( () )
            // InternalTaskDefinition.g:2849:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); 
            // InternalTaskDefinition.g:2850:2: ()
            // InternalTaskDefinition.g:2850:3: 
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
    // InternalTaskDefinition.g:2858:1: rule__SingleValue__Group_0__1 : rule__SingleValue__Group_0__1__Impl ;
    public final void rule__SingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2862:1: ( rule__SingleValue__Group_0__1__Impl )
            // InternalTaskDefinition.g:2863:2: rule__SingleValue__Group_0__1__Impl
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
    // InternalTaskDefinition.g:2869:1: rule__SingleValue__Group_0__1__Impl : ( ( rule__SingleValue__ValueAssignment_0_1 ) ) ;
    public final void rule__SingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2873:1: ( ( ( rule__SingleValue__ValueAssignment_0_1 ) ) )
            // InternalTaskDefinition.g:2874:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            {
            // InternalTaskDefinition.g:2874:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            // InternalTaskDefinition.g:2875:2: ( rule__SingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 
            // InternalTaskDefinition.g:2876:2: ( rule__SingleValue__ValueAssignment_0_1 )
            // InternalTaskDefinition.g:2876:3: rule__SingleValue__ValueAssignment_0_1
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
    // InternalTaskDefinition.g:2885:1: rule__SingleValue__Group_1__0 : rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 ;
    public final void rule__SingleValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2889:1: ( rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 )
            // InternalTaskDefinition.g:2890:2: rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1
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
    // InternalTaskDefinition.g:2897:1: rule__SingleValue__Group_1__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2901:1: ( ( () ) )
            // InternalTaskDefinition.g:2902:1: ( () )
            {
            // InternalTaskDefinition.g:2902:1: ( () )
            // InternalTaskDefinition.g:2903:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); 
            // InternalTaskDefinition.g:2904:2: ()
            // InternalTaskDefinition.g:2904:3: 
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
    // InternalTaskDefinition.g:2912:1: rule__SingleValue__Group_1__1 : rule__SingleValue__Group_1__1__Impl ;
    public final void rule__SingleValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2916:1: ( rule__SingleValue__Group_1__1__Impl )
            // InternalTaskDefinition.g:2917:2: rule__SingleValue__Group_1__1__Impl
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
    // InternalTaskDefinition.g:2923:1: rule__SingleValue__Group_1__1__Impl : ( ( rule__SingleValue__ValueAssignment_1_1 ) ) ;
    public final void rule__SingleValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2927:1: ( ( ( rule__SingleValue__ValueAssignment_1_1 ) ) )
            // InternalTaskDefinition.g:2928:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            {
            // InternalTaskDefinition.g:2928:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            // InternalTaskDefinition.g:2929:2: ( rule__SingleValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); 
            // InternalTaskDefinition.g:2930:2: ( rule__SingleValue__ValueAssignment_1_1 )
            // InternalTaskDefinition.g:2930:3: rule__SingleValue__ValueAssignment_1_1
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
    // InternalTaskDefinition.g:2939:1: rule__SingleValue__Group_2__0 : rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 ;
    public final void rule__SingleValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2943:1: ( rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 )
            // InternalTaskDefinition.g:2944:2: rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1
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
    // InternalTaskDefinition.g:2951:1: rule__SingleValue__Group_2__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2955:1: ( ( () ) )
            // InternalTaskDefinition.g:2956:1: ( () )
            {
            // InternalTaskDefinition.g:2956:1: ( () )
            // InternalTaskDefinition.g:2957:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); 
            // InternalTaskDefinition.g:2958:2: ()
            // InternalTaskDefinition.g:2958:3: 
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
    // InternalTaskDefinition.g:2966:1: rule__SingleValue__Group_2__1 : rule__SingleValue__Group_2__1__Impl ;
    public final void rule__SingleValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2970:1: ( rule__SingleValue__Group_2__1__Impl )
            // InternalTaskDefinition.g:2971:2: rule__SingleValue__Group_2__1__Impl
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
    // InternalTaskDefinition.g:2977:1: rule__SingleValue__Group_2__1__Impl : ( ( rule__SingleValue__ValueAssignment_2_1 ) ) ;
    public final void rule__SingleValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2981:1: ( ( ( rule__SingleValue__ValueAssignment_2_1 ) ) )
            // InternalTaskDefinition.g:2982:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            {
            // InternalTaskDefinition.g:2982:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            // InternalTaskDefinition.g:2983:2: ( rule__SingleValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); 
            // InternalTaskDefinition.g:2984:2: ( rule__SingleValue__ValueAssignment_2_1 )
            // InternalTaskDefinition.g:2984:3: rule__SingleValue__ValueAssignment_2_1
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
    // InternalTaskDefinition.g:2993:1: rule__SingleValue__Group_3__0 : rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 ;
    public final void rule__SingleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:2997:1: ( rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 )
            // InternalTaskDefinition.g:2998:2: rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalTaskDefinition.g:3005:1: rule__SingleValue__Group_3__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3009:1: ( ( () ) )
            // InternalTaskDefinition.g:3010:1: ( () )
            {
            // InternalTaskDefinition.g:3010:1: ( () )
            // InternalTaskDefinition.g:3011:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); 
            // InternalTaskDefinition.g:3012:2: ()
            // InternalTaskDefinition.g:3012:3: 
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
    // InternalTaskDefinition.g:3020:1: rule__SingleValue__Group_3__1 : rule__SingleValue__Group_3__1__Impl ;
    public final void rule__SingleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3024:1: ( rule__SingleValue__Group_3__1__Impl )
            // InternalTaskDefinition.g:3025:2: rule__SingleValue__Group_3__1__Impl
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
    // InternalTaskDefinition.g:3031:1: rule__SingleValue__Group_3__1__Impl : ( ( rule__SingleValue__ValueAssignment_3_1 ) ) ;
    public final void rule__SingleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3035:1: ( ( ( rule__SingleValue__ValueAssignment_3_1 ) ) )
            // InternalTaskDefinition.g:3036:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            {
            // InternalTaskDefinition.g:3036:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            // InternalTaskDefinition.g:3037:2: ( rule__SingleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); 
            // InternalTaskDefinition.g:3038:2: ( rule__SingleValue__ValueAssignment_3_1 )
            // InternalTaskDefinition.g:3038:3: rule__SingleValue__ValueAssignment_3_1
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
    // InternalTaskDefinition.g:3047:1: rule__SingleValue__Group_4__0 : rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 ;
    public final void rule__SingleValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3051:1: ( rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 )
            // InternalTaskDefinition.g:3052:2: rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalTaskDefinition.g:3059:1: rule__SingleValue__Group_4__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3063:1: ( ( () ) )
            // InternalTaskDefinition.g:3064:1: ( () )
            {
            // InternalTaskDefinition.g:3064:1: ( () )
            // InternalTaskDefinition.g:3065:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); 
            // InternalTaskDefinition.g:3066:2: ()
            // InternalTaskDefinition.g:3066:3: 
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
    // InternalTaskDefinition.g:3074:1: rule__SingleValue__Group_4__1 : rule__SingleValue__Group_4__1__Impl ;
    public final void rule__SingleValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3078:1: ( rule__SingleValue__Group_4__1__Impl )
            // InternalTaskDefinition.g:3079:2: rule__SingleValue__Group_4__1__Impl
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
    // InternalTaskDefinition.g:3085:1: rule__SingleValue__Group_4__1__Impl : ( ( rule__SingleValue__ValueAssignment_4_1 ) ) ;
    public final void rule__SingleValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3089:1: ( ( ( rule__SingleValue__ValueAssignment_4_1 ) ) )
            // InternalTaskDefinition.g:3090:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            {
            // InternalTaskDefinition.g:3090:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            // InternalTaskDefinition.g:3091:2: ( rule__SingleValue__ValueAssignment_4_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); 
            // InternalTaskDefinition.g:3092:2: ( rule__SingleValue__ValueAssignment_4_1 )
            // InternalTaskDefinition.g:3092:3: rule__SingleValue__ValueAssignment_4_1
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
    // InternalTaskDefinition.g:3101:1: rule__TaskDefinitionModel__RepositoryAssignment_1 : ( ruleTaskDefinitionRepository ) ;
    public final void rule__TaskDefinitionModel__RepositoryAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3105:1: ( ( ruleTaskDefinitionRepository ) )
            // InternalTaskDefinition.g:3106:2: ( ruleTaskDefinitionRepository )
            {
            // InternalTaskDefinition.g:3106:2: ( ruleTaskDefinitionRepository )
            // InternalTaskDefinition.g:3107:3: ruleTaskDefinitionRepository
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
    // InternalTaskDefinition.g:3116:1: rule__TaskDefinitionRepository__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TaskDefinitionRepository__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3120:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:3121:2: ( RULE_ID )
            {
            // InternalTaskDefinition.g:3121:2: ( RULE_ID )
            // InternalTaskDefinition.g:3122:3: RULE_ID
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
    // InternalTaskDefinition.g:3131:1: rule__TaskDefinitionRepository__TasksAssignment_3 : ( ruleTaskDefinition ) ;
    public final void rule__TaskDefinitionRepository__TasksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3135:1: ( ( ruleTaskDefinition ) )
            // InternalTaskDefinition.g:3136:2: ( ruleTaskDefinition )
            {
            // InternalTaskDefinition.g:3136:2: ( ruleTaskDefinition )
            // InternalTaskDefinition.g:3137:3: ruleTaskDefinition
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
    // InternalTaskDefinition.g:3146:1: rule__TaskDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TaskDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3150:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:3151:2: ( RULE_ID )
            {
            // InternalTaskDefinition.g:3151:2: ( RULE_ID )
            // InternalTaskDefinition.g:3152:3: RULE_ID
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
    // InternalTaskDefinition.g:3161:1: rule__TaskDefinition__InAttributeAssignment_3_2 : ( ruleAttributeDefinition ) ;
    public final void rule__TaskDefinition__InAttributeAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3165:1: ( ( ruleAttributeDefinition ) )
            // InternalTaskDefinition.g:3166:2: ( ruleAttributeDefinition )
            {
            // InternalTaskDefinition.g:3166:2: ( ruleAttributeDefinition )
            // InternalTaskDefinition.g:3167:3: ruleAttributeDefinition
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
    // InternalTaskDefinition.g:3176:1: rule__TaskDefinition__OutAttributeAssignment_4_2 : ( ruleAttributeDefinition ) ;
    public final void rule__TaskDefinition__OutAttributeAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3180:1: ( ( ruleAttributeDefinition ) )
            // InternalTaskDefinition.g:3181:2: ( ruleAttributeDefinition )
            {
            // InternalTaskDefinition.g:3181:2: ( ruleAttributeDefinition )
            // InternalTaskDefinition.g:3182:3: ruleAttributeDefinition
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
    // InternalTaskDefinition.g:3191:1: rule__TaskDefinition__ResultsAssignment_7 : ( ruleTaskResult ) ;
    public final void rule__TaskDefinition__ResultsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3195:1: ( ( ruleTaskResult ) )
            // InternalTaskDefinition.g:3196:2: ( ruleTaskResult )
            {
            // InternalTaskDefinition.g:3196:2: ( ruleTaskResult )
            // InternalTaskDefinition.g:3197:3: ruleTaskResult
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
    // InternalTaskDefinition.g:3206:1: rule__TaskResult__ResultAssignment_0 : ( ruleTASK_RESULT_TYPES ) ;
    public final void rule__TaskResult__ResultAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3210:1: ( ( ruleTASK_RESULT_TYPES ) )
            // InternalTaskDefinition.g:3211:2: ( ruleTASK_RESULT_TYPES )
            {
            // InternalTaskDefinition.g:3211:2: ( ruleTASK_RESULT_TYPES )
            // InternalTaskDefinition.g:3212:3: ruleTASK_RESULT_TYPES
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
    // InternalTaskDefinition.g:3221:1: rule__TaskResult__ResultValueAssignment_3 : ( ruleEString ) ;
    public final void rule__TaskResult__ResultValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3225:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:3226:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:3226:2: ( ruleEString )
            // InternalTaskDefinition.g:3227:3: ruleEString
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


    // $ANTLR start "rule__AttributeDefinition__NameAssignment_0"
    // InternalTaskDefinition.g:3236:1: rule__AttributeDefinition__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__AttributeDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3240:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:3241:2: ( RULE_ID )
            {
            // InternalTaskDefinition.g:3241:2: ( RULE_ID )
            // InternalTaskDefinition.g:3242:3: RULE_ID
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
    // InternalTaskDefinition.g:3251:1: rule__AttributeDefinition__TypeAssignment_2 : ( ruleAbstractAttributeType ) ;
    public final void rule__AttributeDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3255:1: ( ( ruleAbstractAttributeType ) )
            // InternalTaskDefinition.g:3256:2: ( ruleAbstractAttributeType )
            {
            // InternalTaskDefinition.g:3256:2: ( ruleAbstractAttributeType )
            // InternalTaskDefinition.g:3257:3: ruleAbstractAttributeType
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
    // InternalTaskDefinition.g:3266:1: rule__AttributeDefinition__DefaultvalueAssignment_3_1 : ( ruleAbstractValue ) ;
    public final void rule__AttributeDefinition__DefaultvalueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3270:1: ( ( ruleAbstractValue ) )
            // InternalTaskDefinition.g:3271:2: ( ruleAbstractValue )
            {
            // InternalTaskDefinition.g:3271:2: ( ruleAbstractValue )
            // InternalTaskDefinition.g:3272:3: ruleAbstractValue
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
    // InternalTaskDefinition.g:3281:1: rule__EnumerationElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3285:1: ( ( RULE_ID ) )
            // InternalTaskDefinition.g:3286:2: ( RULE_ID )
            {
            // InternalTaskDefinition.g:3286:2: ( RULE_ID )
            // InternalTaskDefinition.g:3287:3: RULE_ID
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
    // InternalTaskDefinition.g:3296:1: rule__EnumerationElement__ValueAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3300:1: ( ( ruleEInt ) )
            // InternalTaskDefinition.g:3301:2: ( ruleEInt )
            {
            // InternalTaskDefinition.g:3301:2: ( ruleEInt )
            // InternalTaskDefinition.g:3302:3: ruleEInt
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
    // InternalTaskDefinition.g:3311:1: rule__InlineEnumerationType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__InlineEnumerationType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3315:1: ( ( ruleArrayType ) )
            // InternalTaskDefinition.g:3316:2: ( ruleArrayType )
            {
            // InternalTaskDefinition.g:3316:2: ( ruleArrayType )
            // InternalTaskDefinition.g:3317:3: ruleArrayType
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
    // InternalTaskDefinition.g:3326:1: rule__InlineEnumerationType__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__InlineEnumerationType__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3330:1: ( ( ruleEnumerationElement ) )
            // InternalTaskDefinition.g:3331:2: ( ruleEnumerationElement )
            {
            // InternalTaskDefinition.g:3331:2: ( ruleEnumerationElement )
            // InternalTaskDefinition.g:3332:3: ruleEnumerationElement
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
    // InternalTaskDefinition.g:3341:1: rule__ArrayType__LengthAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ArrayType__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3345:1: ( ( ruleCardinality ) )
            // InternalTaskDefinition.g:3346:2: ( ruleCardinality )
            {
            // InternalTaskDefinition.g:3346:2: ( ruleCardinality )
            // InternalTaskDefinition.g:3347:3: ruleCardinality
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
    // InternalTaskDefinition.g:3356:1: rule__PrimitiveType__TypeNameAssignment_0 : ( rulePRIMITIVE_TYPE_NAME ) ;
    public final void rule__PrimitiveType__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3360:1: ( ( rulePRIMITIVE_TYPE_NAME ) )
            // InternalTaskDefinition.g:3361:2: ( rulePRIMITIVE_TYPE_NAME )
            {
            // InternalTaskDefinition.g:3361:2: ( rulePRIMITIVE_TYPE_NAME )
            // InternalTaskDefinition.g:3362:3: rulePRIMITIVE_TYPE_NAME
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
    // InternalTaskDefinition.g:3371:1: rule__PrimitiveType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__PrimitiveType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3375:1: ( ( ruleArrayType ) )
            // InternalTaskDefinition.g:3376:2: ( ruleArrayType )
            {
            // InternalTaskDefinition.g:3376:2: ( ruleArrayType )
            // InternalTaskDefinition.g:3377:3: ruleArrayType
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
    // InternalTaskDefinition.g:3386:1: rule__ArrayValue__ValuesAssignment_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3390:1: ( ( ruleSingleValue ) )
            // InternalTaskDefinition.g:3391:2: ( ruleSingleValue )
            {
            // InternalTaskDefinition.g:3391:2: ( ruleSingleValue )
            // InternalTaskDefinition.g:3392:3: ruleSingleValue
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
    // InternalTaskDefinition.g:3401:1: rule__ArrayValue__ValuesAssignment_2_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3405:1: ( ( ruleSingleValue ) )
            // InternalTaskDefinition.g:3406:2: ( ruleSingleValue )
            {
            // InternalTaskDefinition.g:3406:2: ( ruleSingleValue )
            // InternalTaskDefinition.g:3407:3: ruleSingleValue
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
    // InternalTaskDefinition.g:3416:1: rule__SingleValue__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__SingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3420:1: ( ( ruleEInt ) )
            // InternalTaskDefinition.g:3421:2: ( ruleEInt )
            {
            // InternalTaskDefinition.g:3421:2: ( ruleEInt )
            // InternalTaskDefinition.g:3422:3: ruleEInt
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
    // InternalTaskDefinition.g:3431:1: rule__SingleValue__ValueAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__SingleValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3435:1: ( ( ruleEDouble ) )
            // InternalTaskDefinition.g:3436:2: ( ruleEDouble )
            {
            // InternalTaskDefinition.g:3436:2: ( ruleEDouble )
            // InternalTaskDefinition.g:3437:3: ruleEDouble
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
    // InternalTaskDefinition.g:3446:1: rule__SingleValue__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__SingleValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3450:1: ( ( ruleEString ) )
            // InternalTaskDefinition.g:3451:2: ( ruleEString )
            {
            // InternalTaskDefinition.g:3451:2: ( ruleEString )
            // InternalTaskDefinition.g:3452:3: ruleEString
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
    // InternalTaskDefinition.g:3461:1: rule__SingleValue__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__SingleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3465:1: ( ( ruleEBoolean ) )
            // InternalTaskDefinition.g:3466:2: ( ruleEBoolean )
            {
            // InternalTaskDefinition.g:3466:2: ( ruleEBoolean )
            // InternalTaskDefinition.g:3467:3: ruleEBoolean
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
    // InternalTaskDefinition.g:3476:1: rule__SingleValue__ValueAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__SingleValue__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTaskDefinition.g:3480:1: ( ( ( ruleFQN ) ) )
            // InternalTaskDefinition.g:3481:2: ( ( ruleFQN ) )
            {
            // InternalTaskDefinition.g:3481:2: ( ( ruleFQN ) )
            // InternalTaskDefinition.g:3482:3: ( ruleFQN )
            {
             before(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 
            // InternalTaskDefinition.g:3483:3: ( ruleFQN )
            // InternalTaskDefinition.g:3484:4: ruleFQN
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x000008003FFC0000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000160000001870L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000040000000020L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000060000000020L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000100080000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000008020L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000060000001870L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000001800L});

}