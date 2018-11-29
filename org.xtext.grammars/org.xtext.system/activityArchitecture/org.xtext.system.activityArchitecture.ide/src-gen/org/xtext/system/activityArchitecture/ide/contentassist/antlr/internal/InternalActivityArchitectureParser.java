package org.xtext.system.activityArchitecture.ide.contentassist.antlr.internal;

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
import org.xtext.system.activityArchitecture.services.ActivityArchitectureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActivityArchitectureParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'DEFAULT'", "'FIFO'", "'RR'", "'sec'", "'ms'", "'us'", "'ActivityArchitectureModel'", "'{'", "'}'", "'-'", "'.'", "'DataFlow'", "'source'", "'destination'", "'InputHandlerNode'", "'input'", "'prescale'", "'TriggerInputNode'", "';'", "'ActivityNode'", "'inputs'", "'cpuAffinity'", "'activationSource'", "'executionTime'", "'scheduler'", "'RegisterInputNode'", "'Sporadic'", "'minActFreq'", "'Hz'", "'maxActFreq'", "'DataTriggered'", "'PeriodicTimer'", "'periodicActFreq'", "'type'", "'priority'", "'CPUCore'", "'coreNumber'", "'minTime'", "'maxTime'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
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


        public InternalActivityArchitectureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActivityArchitectureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActivityArchitectureParser.tokenNames; }
    public String getGrammarFileName() { return "InternalActivityArchitecture.g"; }


    	private ActivityArchitectureGrammarAccess grammarAccess;

    	public void setGrammarAccess(ActivityArchitectureGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleActivityArchitectureModel"
    // InternalActivityArchitecture.g:94:1: entryRuleActivityArchitectureModel : ruleActivityArchitectureModel EOF ;
    public final void entryRuleActivityArchitectureModel() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:95:1: ( ruleActivityArchitectureModel EOF )
            // InternalActivityArchitecture.g:96:1: ruleActivityArchitectureModel EOF
            {
             before(grammarAccess.getActivityArchitectureModelRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityArchitectureModel();

            state._fsp--;

             after(grammarAccess.getActivityArchitectureModelRule()); 
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
    // $ANTLR end "entryRuleActivityArchitectureModel"


    // $ANTLR start "ruleActivityArchitectureModel"
    // InternalActivityArchitecture.g:103:1: ruleActivityArchitectureModel : ( ( rule__ActivityArchitectureModel__Group__0 ) ) ;
    public final void ruleActivityArchitectureModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:107:2: ( ( ( rule__ActivityArchitectureModel__Group__0 ) ) )
            // InternalActivityArchitecture.g:108:2: ( ( rule__ActivityArchitectureModel__Group__0 ) )
            {
            // InternalActivityArchitecture.g:108:2: ( ( rule__ActivityArchitectureModel__Group__0 ) )
            // InternalActivityArchitecture.g:109:3: ( rule__ActivityArchitectureModel__Group__0 )
            {
             before(grammarAccess.getActivityArchitectureModelAccess().getGroup()); 
            // InternalActivityArchitecture.g:110:3: ( rule__ActivityArchitectureModel__Group__0 )
            // InternalActivityArchitecture.g:110:4: rule__ActivityArchitectureModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityArchitectureModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityArchitectureModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityArchitectureModel"


    // $ANTLR start "entryRuleEDouble"
    // InternalActivityArchitecture.g:119:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:120:1: ( ruleEDouble EOF )
            // InternalActivityArchitecture.g:121:1: ruleEDouble EOF
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
    // InternalActivityArchitecture.g:128:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:132:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalActivityArchitecture.g:133:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalActivityArchitecture.g:133:2: ( ( rule__EDouble__Group__0 ) )
            // InternalActivityArchitecture.g:134:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalActivityArchitecture.g:135:3: ( rule__EDouble__Group__0 )
            // InternalActivityArchitecture.g:135:4: rule__EDouble__Group__0
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


    // $ANTLR start "entryRuleEInt"
    // InternalActivityArchitecture.g:144:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:145:1: ( ruleEInt EOF )
            // InternalActivityArchitecture.g:146:1: ruleEInt EOF
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
    // InternalActivityArchitecture.g:153:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:157:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalActivityArchitecture.g:158:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalActivityArchitecture.g:158:2: ( ( rule__EInt__Group__0 ) )
            // InternalActivityArchitecture.g:159:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalActivityArchitecture.g:160:3: ( rule__EInt__Group__0 )
            // InternalActivityArchitecture.g:160:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleFQN"
    // InternalActivityArchitecture.g:169:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:170:1: ( ruleFQN EOF )
            // InternalActivityArchitecture.g:171:1: ruleFQN EOF
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
    // InternalActivityArchitecture.g:178:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:182:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalActivityArchitecture.g:183:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalActivityArchitecture.g:183:2: ( ( rule__FQN__Group__0 ) )
            // InternalActivityArchitecture.g:184:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalActivityArchitecture.g:185:3: ( rule__FQN__Group__0 )
            // InternalActivityArchitecture.g:185:4: rule__FQN__Group__0
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


    // $ANTLR start "entryRuleAbstractActivityArchitectureElement"
    // InternalActivityArchitecture.g:194:1: entryRuleAbstractActivityArchitectureElement : ruleAbstractActivityArchitectureElement EOF ;
    public final void entryRuleAbstractActivityArchitectureElement() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:195:1: ( ruleAbstractActivityArchitectureElement EOF )
            // InternalActivityArchitecture.g:196:1: ruleAbstractActivityArchitectureElement EOF
            {
             before(grammarAccess.getAbstractActivityArchitectureElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractActivityArchitectureElement();

            state._fsp--;

             after(grammarAccess.getAbstractActivityArchitectureElementRule()); 
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
    // $ANTLR end "entryRuleAbstractActivityArchitectureElement"


    // $ANTLR start "ruleAbstractActivityArchitectureElement"
    // InternalActivityArchitecture.g:203:1: ruleAbstractActivityArchitectureElement : ( ( rule__AbstractActivityArchitectureElement__Alternatives ) ) ;
    public final void ruleAbstractActivityArchitectureElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:207:2: ( ( ( rule__AbstractActivityArchitectureElement__Alternatives ) ) )
            // InternalActivityArchitecture.g:208:2: ( ( rule__AbstractActivityArchitectureElement__Alternatives ) )
            {
            // InternalActivityArchitecture.g:208:2: ( ( rule__AbstractActivityArchitectureElement__Alternatives ) )
            // InternalActivityArchitecture.g:209:3: ( rule__AbstractActivityArchitectureElement__Alternatives )
            {
             before(grammarAccess.getAbstractActivityArchitectureElementAccess().getAlternatives()); 
            // InternalActivityArchitecture.g:210:3: ( rule__AbstractActivityArchitectureElement__Alternatives )
            // InternalActivityArchitecture.g:210:4: rule__AbstractActivityArchitectureElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractActivityArchitectureElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractActivityArchitectureElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractActivityArchitectureElement"


    // $ANTLR start "entryRuleDataFlow"
    // InternalActivityArchitecture.g:219:1: entryRuleDataFlow : ruleDataFlow EOF ;
    public final void entryRuleDataFlow() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:220:1: ( ruleDataFlow EOF )
            // InternalActivityArchitecture.g:221:1: ruleDataFlow EOF
            {
             before(grammarAccess.getDataFlowRule()); 
            pushFollow(FOLLOW_1);
            ruleDataFlow();

            state._fsp--;

             after(grammarAccess.getDataFlowRule()); 
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
    // $ANTLR end "entryRuleDataFlow"


    // $ANTLR start "ruleDataFlow"
    // InternalActivityArchitecture.g:228:1: ruleDataFlow : ( ( rule__DataFlow__Group__0 ) ) ;
    public final void ruleDataFlow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:232:2: ( ( ( rule__DataFlow__Group__0 ) ) )
            // InternalActivityArchitecture.g:233:2: ( ( rule__DataFlow__Group__0 ) )
            {
            // InternalActivityArchitecture.g:233:2: ( ( rule__DataFlow__Group__0 ) )
            // InternalActivityArchitecture.g:234:3: ( rule__DataFlow__Group__0 )
            {
             before(grammarAccess.getDataFlowAccess().getGroup()); 
            // InternalActivityArchitecture.g:235:3: ( rule__DataFlow__Group__0 )
            // InternalActivityArchitecture.g:235:4: rule__DataFlow__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataFlow__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataFlowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataFlow"


    // $ANTLR start "entryRuleAbstractSourceNode"
    // InternalActivityArchitecture.g:244:1: entryRuleAbstractSourceNode : ruleAbstractSourceNode EOF ;
    public final void entryRuleAbstractSourceNode() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:245:1: ( ruleAbstractSourceNode EOF )
            // InternalActivityArchitecture.g:246:1: ruleAbstractSourceNode EOF
            {
             before(grammarAccess.getAbstractSourceNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractSourceNode();

            state._fsp--;

             after(grammarAccess.getAbstractSourceNodeRule()); 
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
    // $ANTLR end "entryRuleAbstractSourceNode"


    // $ANTLR start "ruleAbstractSourceNode"
    // InternalActivityArchitecture.g:253:1: ruleAbstractSourceNode : ( ( rule__AbstractSourceNode__Alternatives ) ) ;
    public final void ruleAbstractSourceNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:257:2: ( ( ( rule__AbstractSourceNode__Alternatives ) ) )
            // InternalActivityArchitecture.g:258:2: ( ( rule__AbstractSourceNode__Alternatives ) )
            {
            // InternalActivityArchitecture.g:258:2: ( ( rule__AbstractSourceNode__Alternatives ) )
            // InternalActivityArchitecture.g:259:3: ( rule__AbstractSourceNode__Alternatives )
            {
             before(grammarAccess.getAbstractSourceNodeAccess().getAlternatives()); 
            // InternalActivityArchitecture.g:260:3: ( rule__AbstractSourceNode__Alternatives )
            // InternalActivityArchitecture.g:260:4: rule__AbstractSourceNode__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractSourceNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractSourceNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractSourceNode"


    // $ANTLR start "entryRuleInputHandlerNode"
    // InternalActivityArchitecture.g:269:1: entryRuleInputHandlerNode : ruleInputHandlerNode EOF ;
    public final void entryRuleInputHandlerNode() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:270:1: ( ruleInputHandlerNode EOF )
            // InternalActivityArchitecture.g:271:1: ruleInputHandlerNode EOF
            {
             before(grammarAccess.getInputHandlerNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleInputHandlerNode();

            state._fsp--;

             after(grammarAccess.getInputHandlerNodeRule()); 
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
    // $ANTLR end "entryRuleInputHandlerNode"


    // $ANTLR start "ruleInputHandlerNode"
    // InternalActivityArchitecture.g:278:1: ruleInputHandlerNode : ( ( rule__InputHandlerNode__Group__0 ) ) ;
    public final void ruleInputHandlerNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:282:2: ( ( ( rule__InputHandlerNode__Group__0 ) ) )
            // InternalActivityArchitecture.g:283:2: ( ( rule__InputHandlerNode__Group__0 ) )
            {
            // InternalActivityArchitecture.g:283:2: ( ( rule__InputHandlerNode__Group__0 ) )
            // InternalActivityArchitecture.g:284:3: ( rule__InputHandlerNode__Group__0 )
            {
             before(grammarAccess.getInputHandlerNodeAccess().getGroup()); 
            // InternalActivityArchitecture.g:285:3: ( rule__InputHandlerNode__Group__0 )
            // InternalActivityArchitecture.g:285:4: rule__InputHandlerNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputHandlerNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputHandlerNode"


    // $ANTLR start "entryRuleHandlerTriggerInputNode"
    // InternalActivityArchitecture.g:294:1: entryRuleHandlerTriggerInputNode : ruleHandlerTriggerInputNode EOF ;
    public final void entryRuleHandlerTriggerInputNode() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:295:1: ( ruleHandlerTriggerInputNode EOF )
            // InternalActivityArchitecture.g:296:1: ruleHandlerTriggerInputNode EOF
            {
             before(grammarAccess.getHandlerTriggerInputNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleHandlerTriggerInputNode();

            state._fsp--;

             after(grammarAccess.getHandlerTriggerInputNodeRule()); 
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
    // $ANTLR end "entryRuleHandlerTriggerInputNode"


    // $ANTLR start "ruleHandlerTriggerInputNode"
    // InternalActivityArchitecture.g:303:1: ruleHandlerTriggerInputNode : ( ( rule__HandlerTriggerInputNode__Group__0 ) ) ;
    public final void ruleHandlerTriggerInputNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:307:2: ( ( ( rule__HandlerTriggerInputNode__Group__0 ) ) )
            // InternalActivityArchitecture.g:308:2: ( ( rule__HandlerTriggerInputNode__Group__0 ) )
            {
            // InternalActivityArchitecture.g:308:2: ( ( rule__HandlerTriggerInputNode__Group__0 ) )
            // InternalActivityArchitecture.g:309:3: ( rule__HandlerTriggerInputNode__Group__0 )
            {
             before(grammarAccess.getHandlerTriggerInputNodeAccess().getGroup()); 
            // InternalActivityArchitecture.g:310:3: ( rule__HandlerTriggerInputNode__Group__0 )
            // InternalActivityArchitecture.g:310:4: rule__HandlerTriggerInputNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__HandlerTriggerInputNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getHandlerTriggerInputNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleHandlerTriggerInputNode"


    // $ANTLR start "entryRuleActivityNode"
    // InternalActivityArchitecture.g:319:1: entryRuleActivityNode : ruleActivityNode EOF ;
    public final void entryRuleActivityNode() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:320:1: ( ruleActivityNode EOF )
            // InternalActivityArchitecture.g:321:1: ruleActivityNode EOF
            {
             before(grammarAccess.getActivityNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityNode();

            state._fsp--;

             after(grammarAccess.getActivityNodeRule()); 
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
    // $ANTLR end "entryRuleActivityNode"


    // $ANTLR start "ruleActivityNode"
    // InternalActivityArchitecture.g:328:1: ruleActivityNode : ( ( rule__ActivityNode__Group__0 ) ) ;
    public final void ruleActivityNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:332:2: ( ( ( rule__ActivityNode__Group__0 ) ) )
            // InternalActivityArchitecture.g:333:2: ( ( rule__ActivityNode__Group__0 ) )
            {
            // InternalActivityArchitecture.g:333:2: ( ( rule__ActivityNode__Group__0 ) )
            // InternalActivityArchitecture.g:334:3: ( rule__ActivityNode__Group__0 )
            {
             before(grammarAccess.getActivityNodeAccess().getGroup()); 
            // InternalActivityArchitecture.g:335:3: ( rule__ActivityNode__Group__0 )
            // InternalActivityArchitecture.g:335:4: rule__ActivityNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityNode"


    // $ANTLR start "entryRuleAbstractInputNode"
    // InternalActivityArchitecture.g:344:1: entryRuleAbstractInputNode : ruleAbstractInputNode EOF ;
    public final void entryRuleAbstractInputNode() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:345:1: ( ruleAbstractInputNode EOF )
            // InternalActivityArchitecture.g:346:1: ruleAbstractInputNode EOF
            {
             before(grammarAccess.getAbstractInputNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractInputNode();

            state._fsp--;

             after(grammarAccess.getAbstractInputNodeRule()); 
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
    // $ANTLR end "entryRuleAbstractInputNode"


    // $ANTLR start "ruleAbstractInputNode"
    // InternalActivityArchitecture.g:353:1: ruleAbstractInputNode : ( ( rule__AbstractInputNode__Alternatives ) ) ;
    public final void ruleAbstractInputNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:357:2: ( ( ( rule__AbstractInputNode__Alternatives ) ) )
            // InternalActivityArchitecture.g:358:2: ( ( rule__AbstractInputNode__Alternatives ) )
            {
            // InternalActivityArchitecture.g:358:2: ( ( rule__AbstractInputNode__Alternatives ) )
            // InternalActivityArchitecture.g:359:3: ( rule__AbstractInputNode__Alternatives )
            {
             before(grammarAccess.getAbstractInputNodeAccess().getAlternatives()); 
            // InternalActivityArchitecture.g:360:3: ( rule__AbstractInputNode__Alternatives )
            // InternalActivityArchitecture.g:360:4: rule__AbstractInputNode__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractInputNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractInputNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractInputNode"


    // $ANTLR start "entryRuleRegisterInputNode"
    // InternalActivityArchitecture.g:369:1: entryRuleRegisterInputNode : ruleRegisterInputNode EOF ;
    public final void entryRuleRegisterInputNode() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:370:1: ( ruleRegisterInputNode EOF )
            // InternalActivityArchitecture.g:371:1: ruleRegisterInputNode EOF
            {
             before(grammarAccess.getRegisterInputNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleRegisterInputNode();

            state._fsp--;

             after(grammarAccess.getRegisterInputNodeRule()); 
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
    // $ANTLR end "entryRuleRegisterInputNode"


    // $ANTLR start "ruleRegisterInputNode"
    // InternalActivityArchitecture.g:378:1: ruleRegisterInputNode : ( ( rule__RegisterInputNode__Group__0 ) ) ;
    public final void ruleRegisterInputNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:382:2: ( ( ( rule__RegisterInputNode__Group__0 ) ) )
            // InternalActivityArchitecture.g:383:2: ( ( rule__RegisterInputNode__Group__0 ) )
            {
            // InternalActivityArchitecture.g:383:2: ( ( rule__RegisterInputNode__Group__0 ) )
            // InternalActivityArchitecture.g:384:3: ( rule__RegisterInputNode__Group__0 )
            {
             before(grammarAccess.getRegisterInputNodeAccess().getGroup()); 
            // InternalActivityArchitecture.g:385:3: ( rule__RegisterInputNode__Group__0 )
            // InternalActivityArchitecture.g:385:4: rule__RegisterInputNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RegisterInputNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRegisterInputNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRegisterInputNode"


    // $ANTLR start "entryRuleTriggerInputNode"
    // InternalActivityArchitecture.g:394:1: entryRuleTriggerInputNode : ruleTriggerInputNode EOF ;
    public final void entryRuleTriggerInputNode() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:395:1: ( ruleTriggerInputNode EOF )
            // InternalActivityArchitecture.g:396:1: ruleTriggerInputNode EOF
            {
             before(grammarAccess.getTriggerInputNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleTriggerInputNode();

            state._fsp--;

             after(grammarAccess.getTriggerInputNodeRule()); 
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
    // $ANTLR end "entryRuleTriggerInputNode"


    // $ANTLR start "ruleTriggerInputNode"
    // InternalActivityArchitecture.g:403:1: ruleTriggerInputNode : ( ( rule__TriggerInputNode__Group__0 ) ) ;
    public final void ruleTriggerInputNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:407:2: ( ( ( rule__TriggerInputNode__Group__0 ) ) )
            // InternalActivityArchitecture.g:408:2: ( ( rule__TriggerInputNode__Group__0 ) )
            {
            // InternalActivityArchitecture.g:408:2: ( ( rule__TriggerInputNode__Group__0 ) )
            // InternalActivityArchitecture.g:409:3: ( rule__TriggerInputNode__Group__0 )
            {
             before(grammarAccess.getTriggerInputNodeAccess().getGroup()); 
            // InternalActivityArchitecture.g:410:3: ( rule__TriggerInputNode__Group__0 )
            // InternalActivityArchitecture.g:410:4: rule__TriggerInputNode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TriggerInputNode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTriggerInputNodeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTriggerInputNode"


    // $ANTLR start "entryRuleActivationSource"
    // InternalActivityArchitecture.g:419:1: entryRuleActivationSource : ruleActivationSource EOF ;
    public final void entryRuleActivationSource() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:420:1: ( ruleActivationSource EOF )
            // InternalActivityArchitecture.g:421:1: ruleActivationSource EOF
            {
             before(grammarAccess.getActivationSourceRule()); 
            pushFollow(FOLLOW_1);
            ruleActivationSource();

            state._fsp--;

             after(grammarAccess.getActivationSourceRule()); 
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
    // $ANTLR end "entryRuleActivationSource"


    // $ANTLR start "ruleActivationSource"
    // InternalActivityArchitecture.g:428:1: ruleActivationSource : ( ( rule__ActivationSource__Alternatives ) ) ;
    public final void ruleActivationSource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:432:2: ( ( ( rule__ActivationSource__Alternatives ) ) )
            // InternalActivityArchitecture.g:433:2: ( ( rule__ActivationSource__Alternatives ) )
            {
            // InternalActivityArchitecture.g:433:2: ( ( rule__ActivationSource__Alternatives ) )
            // InternalActivityArchitecture.g:434:3: ( rule__ActivationSource__Alternatives )
            {
             before(grammarAccess.getActivationSourceAccess().getAlternatives()); 
            // InternalActivityArchitecture.g:435:3: ( rule__ActivationSource__Alternatives )
            // InternalActivityArchitecture.g:435:4: rule__ActivationSource__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActivationSource__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivationSourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivationSource"


    // $ANTLR start "entryRuleSporadic"
    // InternalActivityArchitecture.g:444:1: entryRuleSporadic : ruleSporadic EOF ;
    public final void entryRuleSporadic() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:445:1: ( ruleSporadic EOF )
            // InternalActivityArchitecture.g:446:1: ruleSporadic EOF
            {
             before(grammarAccess.getSporadicRule()); 
            pushFollow(FOLLOW_1);
            ruleSporadic();

            state._fsp--;

             after(grammarAccess.getSporadicRule()); 
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
    // $ANTLR end "entryRuleSporadic"


    // $ANTLR start "ruleSporadic"
    // InternalActivityArchitecture.g:453:1: ruleSporadic : ( ( rule__Sporadic__Group__0 ) ) ;
    public final void ruleSporadic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:457:2: ( ( ( rule__Sporadic__Group__0 ) ) )
            // InternalActivityArchitecture.g:458:2: ( ( rule__Sporadic__Group__0 ) )
            {
            // InternalActivityArchitecture.g:458:2: ( ( rule__Sporadic__Group__0 ) )
            // InternalActivityArchitecture.g:459:3: ( rule__Sporadic__Group__0 )
            {
             before(grammarAccess.getSporadicAccess().getGroup()); 
            // InternalActivityArchitecture.g:460:3: ( rule__Sporadic__Group__0 )
            // InternalActivityArchitecture.g:460:4: rule__Sporadic__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sporadic__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSporadicAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSporadic"


    // $ANTLR start "entryRuleDataTriggered"
    // InternalActivityArchitecture.g:469:1: entryRuleDataTriggered : ruleDataTriggered EOF ;
    public final void entryRuleDataTriggered() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:470:1: ( ruleDataTriggered EOF )
            // InternalActivityArchitecture.g:471:1: ruleDataTriggered EOF
            {
             before(grammarAccess.getDataTriggeredRule()); 
            pushFollow(FOLLOW_1);
            ruleDataTriggered();

            state._fsp--;

             after(grammarAccess.getDataTriggeredRule()); 
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
    // $ANTLR end "entryRuleDataTriggered"


    // $ANTLR start "ruleDataTriggered"
    // InternalActivityArchitecture.g:478:1: ruleDataTriggered : ( ( rule__DataTriggered__Group__0 ) ) ;
    public final void ruleDataTriggered() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:482:2: ( ( ( rule__DataTriggered__Group__0 ) ) )
            // InternalActivityArchitecture.g:483:2: ( ( rule__DataTriggered__Group__0 ) )
            {
            // InternalActivityArchitecture.g:483:2: ( ( rule__DataTriggered__Group__0 ) )
            // InternalActivityArchitecture.g:484:3: ( rule__DataTriggered__Group__0 )
            {
             before(grammarAccess.getDataTriggeredAccess().getGroup()); 
            // InternalActivityArchitecture.g:485:3: ( rule__DataTriggered__Group__0 )
            // InternalActivityArchitecture.g:485:4: rule__DataTriggered__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DataTriggered__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataTriggeredAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTriggered"


    // $ANTLR start "entryRulePeriodicTimer"
    // InternalActivityArchitecture.g:494:1: entryRulePeriodicTimer : rulePeriodicTimer EOF ;
    public final void entryRulePeriodicTimer() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:495:1: ( rulePeriodicTimer EOF )
            // InternalActivityArchitecture.g:496:1: rulePeriodicTimer EOF
            {
             before(grammarAccess.getPeriodicTimerRule()); 
            pushFollow(FOLLOW_1);
            rulePeriodicTimer();

            state._fsp--;

             after(grammarAccess.getPeriodicTimerRule()); 
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
    // $ANTLR end "entryRulePeriodicTimer"


    // $ANTLR start "rulePeriodicTimer"
    // InternalActivityArchitecture.g:503:1: rulePeriodicTimer : ( ( rule__PeriodicTimer__Group__0 ) ) ;
    public final void rulePeriodicTimer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:507:2: ( ( ( rule__PeriodicTimer__Group__0 ) ) )
            // InternalActivityArchitecture.g:508:2: ( ( rule__PeriodicTimer__Group__0 ) )
            {
            // InternalActivityArchitecture.g:508:2: ( ( rule__PeriodicTimer__Group__0 ) )
            // InternalActivityArchitecture.g:509:3: ( rule__PeriodicTimer__Group__0 )
            {
             before(grammarAccess.getPeriodicTimerAccess().getGroup()); 
            // InternalActivityArchitecture.g:510:3: ( rule__PeriodicTimer__Group__0 )
            // InternalActivityArchitecture.g:510:4: rule__PeriodicTimer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PeriodicTimer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicTimerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePeriodicTimer"


    // $ANTLR start "entryRuleScheduler"
    // InternalActivityArchitecture.g:519:1: entryRuleScheduler : ruleScheduler EOF ;
    public final void entryRuleScheduler() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:520:1: ( ruleScheduler EOF )
            // InternalActivityArchitecture.g:521:1: ruleScheduler EOF
            {
             before(grammarAccess.getSchedulerRule()); 
            pushFollow(FOLLOW_1);
            ruleScheduler();

            state._fsp--;

             after(grammarAccess.getSchedulerRule()); 
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
    // $ANTLR end "entryRuleScheduler"


    // $ANTLR start "ruleScheduler"
    // InternalActivityArchitecture.g:528:1: ruleScheduler : ( ( rule__Scheduler__Group__0 ) ) ;
    public final void ruleScheduler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:532:2: ( ( ( rule__Scheduler__Group__0 ) ) )
            // InternalActivityArchitecture.g:533:2: ( ( rule__Scheduler__Group__0 ) )
            {
            // InternalActivityArchitecture.g:533:2: ( ( rule__Scheduler__Group__0 ) )
            // InternalActivityArchitecture.g:534:3: ( rule__Scheduler__Group__0 )
            {
             before(grammarAccess.getSchedulerAccess().getGroup()); 
            // InternalActivityArchitecture.g:535:3: ( rule__Scheduler__Group__0 )
            // InternalActivityArchitecture.g:535:4: rule__Scheduler__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Scheduler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchedulerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScheduler"


    // $ANTLR start "entryRuleCPUCore"
    // InternalActivityArchitecture.g:544:1: entryRuleCPUCore : ruleCPUCore EOF ;
    public final void entryRuleCPUCore() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:545:1: ( ruleCPUCore EOF )
            // InternalActivityArchitecture.g:546:1: ruleCPUCore EOF
            {
             before(grammarAccess.getCPUCoreRule()); 
            pushFollow(FOLLOW_1);
            ruleCPUCore();

            state._fsp--;

             after(grammarAccess.getCPUCoreRule()); 
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
    // $ANTLR end "entryRuleCPUCore"


    // $ANTLR start "ruleCPUCore"
    // InternalActivityArchitecture.g:553:1: ruleCPUCore : ( ( rule__CPUCore__Group__0 ) ) ;
    public final void ruleCPUCore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:557:2: ( ( ( rule__CPUCore__Group__0 ) ) )
            // InternalActivityArchitecture.g:558:2: ( ( rule__CPUCore__Group__0 ) )
            {
            // InternalActivityArchitecture.g:558:2: ( ( rule__CPUCore__Group__0 ) )
            // InternalActivityArchitecture.g:559:3: ( rule__CPUCore__Group__0 )
            {
             before(grammarAccess.getCPUCoreAccess().getGroup()); 
            // InternalActivityArchitecture.g:560:3: ( rule__CPUCore__Group__0 )
            // InternalActivityArchitecture.g:560:4: rule__CPUCore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CPUCore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCPUCoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCPUCore"


    // $ANTLR start "entryRuleExecutionTime"
    // InternalActivityArchitecture.g:569:1: entryRuleExecutionTime : ruleExecutionTime EOF ;
    public final void entryRuleExecutionTime() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:570:1: ( ruleExecutionTime EOF )
            // InternalActivityArchitecture.g:571:1: ruleExecutionTime EOF
            {
             before(grammarAccess.getExecutionTimeRule()); 
            pushFollow(FOLLOW_1);
            ruleExecutionTime();

            state._fsp--;

             after(grammarAccess.getExecutionTimeRule()); 
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
    // $ANTLR end "entryRuleExecutionTime"


    // $ANTLR start "ruleExecutionTime"
    // InternalActivityArchitecture.g:578:1: ruleExecutionTime : ( ( rule__ExecutionTime__Group__0 ) ) ;
    public final void ruleExecutionTime() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:582:2: ( ( ( rule__ExecutionTime__Group__0 ) ) )
            // InternalActivityArchitecture.g:583:2: ( ( rule__ExecutionTime__Group__0 ) )
            {
            // InternalActivityArchitecture.g:583:2: ( ( rule__ExecutionTime__Group__0 ) )
            // InternalActivityArchitecture.g:584:3: ( rule__ExecutionTime__Group__0 )
            {
             before(grammarAccess.getExecutionTimeAccess().getGroup()); 
            // InternalActivityArchitecture.g:585:3: ( rule__ExecutionTime__Group__0 )
            // InternalActivityArchitecture.g:585:4: rule__ExecutionTime__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionTime__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExecutionTimeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExecutionTime"


    // $ANTLR start "entryRuleTimeValue"
    // InternalActivityArchitecture.g:594:1: entryRuleTimeValue : ruleTimeValue EOF ;
    public final void entryRuleTimeValue() throws RecognitionException {
        try {
            // InternalActivityArchitecture.g:595:1: ( ruleTimeValue EOF )
            // InternalActivityArchitecture.g:596:1: ruleTimeValue EOF
            {
             before(grammarAccess.getTimeValueRule()); 
            pushFollow(FOLLOW_1);
            ruleTimeValue();

            state._fsp--;

             after(grammarAccess.getTimeValueRule()); 
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
    // $ANTLR end "entryRuleTimeValue"


    // $ANTLR start "ruleTimeValue"
    // InternalActivityArchitecture.g:603:1: ruleTimeValue : ( ( rule__TimeValue__Group__0 ) ) ;
    public final void ruleTimeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:607:2: ( ( ( rule__TimeValue__Group__0 ) ) )
            // InternalActivityArchitecture.g:608:2: ( ( rule__TimeValue__Group__0 ) )
            {
            // InternalActivityArchitecture.g:608:2: ( ( rule__TimeValue__Group__0 ) )
            // InternalActivityArchitecture.g:609:3: ( rule__TimeValue__Group__0 )
            {
             before(grammarAccess.getTimeValueAccess().getGroup()); 
            // InternalActivityArchitecture.g:610:3: ( rule__TimeValue__Group__0 )
            // InternalActivityArchitecture.g:610:4: rule__TimeValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TimeValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTimeValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeValue"


    // $ANTLR start "ruleSchedulerType"
    // InternalActivityArchitecture.g:619:1: ruleSchedulerType : ( ( rule__SchedulerType__Alternatives ) ) ;
    public final void ruleSchedulerType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:623:1: ( ( ( rule__SchedulerType__Alternatives ) ) )
            // InternalActivityArchitecture.g:624:2: ( ( rule__SchedulerType__Alternatives ) )
            {
            // InternalActivityArchitecture.g:624:2: ( ( rule__SchedulerType__Alternatives ) )
            // InternalActivityArchitecture.g:625:3: ( rule__SchedulerType__Alternatives )
            {
             before(grammarAccess.getSchedulerTypeAccess().getAlternatives()); 
            // InternalActivityArchitecture.g:626:3: ( rule__SchedulerType__Alternatives )
            // InternalActivityArchitecture.g:626:4: rule__SchedulerType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SchedulerType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSchedulerTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchedulerType"


    // $ANTLR start "ruleTimeUnit"
    // InternalActivityArchitecture.g:635:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:639:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalActivityArchitecture.g:640:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalActivityArchitecture.g:640:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalActivityArchitecture.g:641:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalActivityArchitecture.g:642:3: ( rule__TimeUnit__Alternatives )
            // InternalActivityArchitecture.g:642:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalActivityArchitecture.g:650:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:654:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalActivityArchitecture.g:655:2: ( 'E' )
                    {
                    // InternalActivityArchitecture.g:655:2: ( 'E' )
                    // InternalActivityArchitecture.g:656:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:661:2: ( 'e' )
                    {
                    // InternalActivityArchitecture.g:661:2: ( 'e' )
                    // InternalActivityArchitecture.g:662:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
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


    // $ANTLR start "rule__AbstractActivityArchitectureElement__Alternatives"
    // InternalActivityArchitecture.g:671:1: rule__AbstractActivityArchitectureElement__Alternatives : ( ( ruleCPUCore ) | ( ruleAbstractSourceNode ) | ( ruleDataFlow ) );
    public final void rule__AbstractActivityArchitectureElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:675:1: ( ( ruleCPUCore ) | ( ruleAbstractSourceNode ) | ( ruleDataFlow ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt2=1;
                }
                break;
            case 27:
            case 32:
                {
                alt2=2;
                }
                break;
            case 24:
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
                    // InternalActivityArchitecture.g:676:2: ( ruleCPUCore )
                    {
                    // InternalActivityArchitecture.g:676:2: ( ruleCPUCore )
                    // InternalActivityArchitecture.g:677:3: ruleCPUCore
                    {
                     before(grammarAccess.getAbstractActivityArchitectureElementAccess().getCPUCoreParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCPUCore();

                    state._fsp--;

                     after(grammarAccess.getAbstractActivityArchitectureElementAccess().getCPUCoreParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:682:2: ( ruleAbstractSourceNode )
                    {
                    // InternalActivityArchitecture.g:682:2: ( ruleAbstractSourceNode )
                    // InternalActivityArchitecture.g:683:3: ruleAbstractSourceNode
                    {
                     before(grammarAccess.getAbstractActivityArchitectureElementAccess().getAbstractSourceNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractSourceNode();

                    state._fsp--;

                     after(grammarAccess.getAbstractActivityArchitectureElementAccess().getAbstractSourceNodeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActivityArchitecture.g:688:2: ( ruleDataFlow )
                    {
                    // InternalActivityArchitecture.g:688:2: ( ruleDataFlow )
                    // InternalActivityArchitecture.g:689:3: ruleDataFlow
                    {
                     before(grammarAccess.getAbstractActivityArchitectureElementAccess().getDataFlowParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDataFlow();

                    state._fsp--;

                     after(grammarAccess.getAbstractActivityArchitectureElementAccess().getDataFlowParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractActivityArchitectureElement__Alternatives"


    // $ANTLR start "rule__AbstractSourceNode__Alternatives"
    // InternalActivityArchitecture.g:698:1: rule__AbstractSourceNode__Alternatives : ( ( ruleActivityNode ) | ( ruleInputHandlerNode ) );
    public final void rule__AbstractSourceNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:702:1: ( ( ruleActivityNode ) | ( ruleInputHandlerNode ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            else if ( (LA3_0==27) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalActivityArchitecture.g:703:2: ( ruleActivityNode )
                    {
                    // InternalActivityArchitecture.g:703:2: ( ruleActivityNode )
                    // InternalActivityArchitecture.g:704:3: ruleActivityNode
                    {
                     before(grammarAccess.getAbstractSourceNodeAccess().getActivityNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActivityNode();

                    state._fsp--;

                     after(grammarAccess.getAbstractSourceNodeAccess().getActivityNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:709:2: ( ruleInputHandlerNode )
                    {
                    // InternalActivityArchitecture.g:709:2: ( ruleInputHandlerNode )
                    // InternalActivityArchitecture.g:710:3: ruleInputHandlerNode
                    {
                     before(grammarAccess.getAbstractSourceNodeAccess().getInputHandlerNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInputHandlerNode();

                    state._fsp--;

                     after(grammarAccess.getAbstractSourceNodeAccess().getInputHandlerNodeParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractSourceNode__Alternatives"


    // $ANTLR start "rule__AbstractInputNode__Alternatives"
    // InternalActivityArchitecture.g:719:1: rule__AbstractInputNode__Alternatives : ( ( ruleRegisterInputNode ) | ( ruleTriggerInputNode ) );
    public final void rule__AbstractInputNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:723:1: ( ( ruleRegisterInputNode ) | ( ruleTriggerInputNode ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==38) ) {
                alt4=1;
            }
            else if ( (LA4_0==30) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalActivityArchitecture.g:724:2: ( ruleRegisterInputNode )
                    {
                    // InternalActivityArchitecture.g:724:2: ( ruleRegisterInputNode )
                    // InternalActivityArchitecture.g:725:3: ruleRegisterInputNode
                    {
                     before(grammarAccess.getAbstractInputNodeAccess().getRegisterInputNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRegisterInputNode();

                    state._fsp--;

                     after(grammarAccess.getAbstractInputNodeAccess().getRegisterInputNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:730:2: ( ruleTriggerInputNode )
                    {
                    // InternalActivityArchitecture.g:730:2: ( ruleTriggerInputNode )
                    // InternalActivityArchitecture.g:731:3: ruleTriggerInputNode
                    {
                     before(grammarAccess.getAbstractInputNodeAccess().getTriggerInputNodeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTriggerInputNode();

                    state._fsp--;

                     after(grammarAccess.getAbstractInputNodeAccess().getTriggerInputNodeParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractInputNode__Alternatives"


    // $ANTLR start "rule__ActivationSource__Alternatives"
    // InternalActivityArchitecture.g:740:1: rule__ActivationSource__Alternatives : ( ( ruleSporadic ) | ( ruleDataTriggered ) | ( rulePeriodicTimer ) );
    public final void rule__ActivationSource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:744:1: ( ( ruleSporadic ) | ( ruleDataTriggered ) | ( rulePeriodicTimer ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt5=1;
                }
                break;
            case 43:
                {
                alt5=2;
                }
                break;
            case 44:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalActivityArchitecture.g:745:2: ( ruleSporadic )
                    {
                    // InternalActivityArchitecture.g:745:2: ( ruleSporadic )
                    // InternalActivityArchitecture.g:746:3: ruleSporadic
                    {
                     before(grammarAccess.getActivationSourceAccess().getSporadicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSporadic();

                    state._fsp--;

                     after(grammarAccess.getActivationSourceAccess().getSporadicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:751:2: ( ruleDataTriggered )
                    {
                    // InternalActivityArchitecture.g:751:2: ( ruleDataTriggered )
                    // InternalActivityArchitecture.g:752:3: ruleDataTriggered
                    {
                     before(grammarAccess.getActivationSourceAccess().getDataTriggeredParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDataTriggered();

                    state._fsp--;

                     after(grammarAccess.getActivationSourceAccess().getDataTriggeredParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActivityArchitecture.g:757:2: ( rulePeriodicTimer )
                    {
                    // InternalActivityArchitecture.g:757:2: ( rulePeriodicTimer )
                    // InternalActivityArchitecture.g:758:3: rulePeriodicTimer
                    {
                     before(grammarAccess.getActivationSourceAccess().getPeriodicTimerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePeriodicTimer();

                    state._fsp--;

                     after(grammarAccess.getActivationSourceAccess().getPeriodicTimerParserRuleCall_2()); 

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
    // $ANTLR end "rule__ActivationSource__Alternatives"


    // $ANTLR start "rule__SchedulerType__Alternatives"
    // InternalActivityArchitecture.g:767:1: rule__SchedulerType__Alternatives : ( ( ( 'DEFAULT' ) ) | ( ( 'FIFO' ) ) | ( ( 'RR' ) ) );
    public final void rule__SchedulerType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:771:1: ( ( ( 'DEFAULT' ) ) | ( ( 'FIFO' ) ) | ( ( 'RR' ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt6=1;
                }
                break;
            case 14:
                {
                alt6=2;
                }
                break;
            case 15:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalActivityArchitecture.g:772:2: ( ( 'DEFAULT' ) )
                    {
                    // InternalActivityArchitecture.g:772:2: ( ( 'DEFAULT' ) )
                    // InternalActivityArchitecture.g:773:3: ( 'DEFAULT' )
                    {
                     before(grammarAccess.getSchedulerTypeAccess().getDEFAULTEnumLiteralDeclaration_0()); 
                    // InternalActivityArchitecture.g:774:3: ( 'DEFAULT' )
                    // InternalActivityArchitecture.g:774:4: 'DEFAULT'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getSchedulerTypeAccess().getDEFAULTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:778:2: ( ( 'FIFO' ) )
                    {
                    // InternalActivityArchitecture.g:778:2: ( ( 'FIFO' ) )
                    // InternalActivityArchitecture.g:779:3: ( 'FIFO' )
                    {
                     before(grammarAccess.getSchedulerTypeAccess().getFIFOEnumLiteralDeclaration_1()); 
                    // InternalActivityArchitecture.g:780:3: ( 'FIFO' )
                    // InternalActivityArchitecture.g:780:4: 'FIFO'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getSchedulerTypeAccess().getFIFOEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActivityArchitecture.g:784:2: ( ( 'RR' ) )
                    {
                    // InternalActivityArchitecture.g:784:2: ( ( 'RR' ) )
                    // InternalActivityArchitecture.g:785:3: ( 'RR' )
                    {
                     before(grammarAccess.getSchedulerTypeAccess().getRREnumLiteralDeclaration_2()); 
                    // InternalActivityArchitecture.g:786:3: ( 'RR' )
                    // InternalActivityArchitecture.g:786:4: 'RR'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getSchedulerTypeAccess().getRREnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__SchedulerType__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalActivityArchitecture.g:794:1: rule__TimeUnit__Alternatives : ( ( ( 'sec' ) ) | ( ( 'ms' ) ) | ( ( 'us' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:798:1: ( ( ( 'sec' ) ) | ( ( 'ms' ) ) | ( ( 'us' ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt7=1;
                }
                break;
            case 17:
                {
                alt7=2;
                }
                break;
            case 18:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalActivityArchitecture.g:799:2: ( ( 'sec' ) )
                    {
                    // InternalActivityArchitecture.g:799:2: ( ( 'sec' ) )
                    // InternalActivityArchitecture.g:800:3: ( 'sec' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0()); 
                    // InternalActivityArchitecture.g:801:3: ( 'sec' )
                    // InternalActivityArchitecture.g:801:4: 'sec'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getSECEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:805:2: ( ( 'ms' ) )
                    {
                    // InternalActivityArchitecture.g:805:2: ( ( 'ms' ) )
                    // InternalActivityArchitecture.g:806:3: ( 'ms' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1()); 
                    // InternalActivityArchitecture.g:807:3: ( 'ms' )
                    // InternalActivityArchitecture.g:807:4: 'ms'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMSECEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalActivityArchitecture.g:811:2: ( ( 'us' ) )
                    {
                    // InternalActivityArchitecture.g:811:2: ( ( 'us' ) )
                    // InternalActivityArchitecture.g:812:3: ( 'us' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2()); 
                    // InternalActivityArchitecture.g:813:3: ( 'us' )
                    // InternalActivityArchitecture.g:813:4: 'us'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getUSECEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__0"
    // InternalActivityArchitecture.g:821:1: rule__ActivityArchitectureModel__Group__0 : rule__ActivityArchitectureModel__Group__0__Impl rule__ActivityArchitectureModel__Group__1 ;
    public final void rule__ActivityArchitectureModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:825:1: ( rule__ActivityArchitectureModel__Group__0__Impl rule__ActivityArchitectureModel__Group__1 )
            // InternalActivityArchitecture.g:826:2: rule__ActivityArchitectureModel__Group__0__Impl rule__ActivityArchitectureModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ActivityArchitectureModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityArchitectureModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__0"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__0__Impl"
    // InternalActivityArchitecture.g:833:1: rule__ActivityArchitectureModel__Group__0__Impl : ( () ) ;
    public final void rule__ActivityArchitectureModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:837:1: ( ( () ) )
            // InternalActivityArchitecture.g:838:1: ( () )
            {
            // InternalActivityArchitecture.g:838:1: ( () )
            // InternalActivityArchitecture.g:839:2: ()
            {
             before(grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelAction_0()); 
            // InternalActivityArchitecture.g:840:2: ()
            // InternalActivityArchitecture.g:840:3: 
            {
            }

             after(grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__0__Impl"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__1"
    // InternalActivityArchitecture.g:848:1: rule__ActivityArchitectureModel__Group__1 : rule__ActivityArchitectureModel__Group__1__Impl rule__ActivityArchitectureModel__Group__2 ;
    public final void rule__ActivityArchitectureModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:852:1: ( rule__ActivityArchitectureModel__Group__1__Impl rule__ActivityArchitectureModel__Group__2 )
            // InternalActivityArchitecture.g:853:2: rule__ActivityArchitectureModel__Group__1__Impl rule__ActivityArchitectureModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ActivityArchitectureModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityArchitectureModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__1"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__1__Impl"
    // InternalActivityArchitecture.g:860:1: rule__ActivityArchitectureModel__Group__1__Impl : ( 'ActivityArchitectureModel' ) ;
    public final void rule__ActivityArchitectureModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:864:1: ( ( 'ActivityArchitectureModel' ) )
            // InternalActivityArchitecture.g:865:1: ( 'ActivityArchitectureModel' )
            {
            // InternalActivityArchitecture.g:865:1: ( 'ActivityArchitectureModel' )
            // InternalActivityArchitecture.g:866:2: 'ActivityArchitectureModel'
            {
             before(grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActivityArchitectureModelAccess().getActivityArchitectureModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__1__Impl"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__2"
    // InternalActivityArchitecture.g:875:1: rule__ActivityArchitectureModel__Group__2 : rule__ActivityArchitectureModel__Group__2__Impl rule__ActivityArchitectureModel__Group__3 ;
    public final void rule__ActivityArchitectureModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:879:1: ( rule__ActivityArchitectureModel__Group__2__Impl rule__ActivityArchitectureModel__Group__3 )
            // InternalActivityArchitecture.g:880:2: rule__ActivityArchitectureModel__Group__2__Impl rule__ActivityArchitectureModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ActivityArchitectureModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityArchitectureModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__2"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__2__Impl"
    // InternalActivityArchitecture.g:887:1: rule__ActivityArchitectureModel__Group__2__Impl : ( ( rule__ActivityArchitectureModel__NameAssignment_2 ) ) ;
    public final void rule__ActivityArchitectureModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:891:1: ( ( ( rule__ActivityArchitectureModel__NameAssignment_2 ) ) )
            // InternalActivityArchitecture.g:892:1: ( ( rule__ActivityArchitectureModel__NameAssignment_2 ) )
            {
            // InternalActivityArchitecture.g:892:1: ( ( rule__ActivityArchitectureModel__NameAssignment_2 ) )
            // InternalActivityArchitecture.g:893:2: ( rule__ActivityArchitectureModel__NameAssignment_2 )
            {
             before(grammarAccess.getActivityArchitectureModelAccess().getNameAssignment_2()); 
            // InternalActivityArchitecture.g:894:2: ( rule__ActivityArchitectureModel__NameAssignment_2 )
            // InternalActivityArchitecture.g:894:3: rule__ActivityArchitectureModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityArchitectureModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityArchitectureModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__2__Impl"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__3"
    // InternalActivityArchitecture.g:902:1: rule__ActivityArchitectureModel__Group__3 : rule__ActivityArchitectureModel__Group__3__Impl rule__ActivityArchitectureModel__Group__4 ;
    public final void rule__ActivityArchitectureModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:906:1: ( rule__ActivityArchitectureModel__Group__3__Impl rule__ActivityArchitectureModel__Group__4 )
            // InternalActivityArchitecture.g:907:2: rule__ActivityArchitectureModel__Group__3__Impl rule__ActivityArchitectureModel__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__ActivityArchitectureModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityArchitectureModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__3"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__3__Impl"
    // InternalActivityArchitecture.g:914:1: rule__ActivityArchitectureModel__Group__3__Impl : ( '{' ) ;
    public final void rule__ActivityArchitectureModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:918:1: ( ( '{' ) )
            // InternalActivityArchitecture.g:919:1: ( '{' )
            {
            // InternalActivityArchitecture.g:919:1: ( '{' )
            // InternalActivityArchitecture.g:920:2: '{'
            {
             before(grammarAccess.getActivityArchitectureModelAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActivityArchitectureModelAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__3__Impl"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__4"
    // InternalActivityArchitecture.g:929:1: rule__ActivityArchitectureModel__Group__4 : rule__ActivityArchitectureModel__Group__4__Impl rule__ActivityArchitectureModel__Group__5 ;
    public final void rule__ActivityArchitectureModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:933:1: ( rule__ActivityArchitectureModel__Group__4__Impl rule__ActivityArchitectureModel__Group__5 )
            // InternalActivityArchitecture.g:934:2: rule__ActivityArchitectureModel__Group__4__Impl rule__ActivityArchitectureModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__ActivityArchitectureModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityArchitectureModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__4"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__4__Impl"
    // InternalActivityArchitecture.g:941:1: rule__ActivityArchitectureModel__Group__4__Impl : ( ( rule__ActivityArchitectureModel__ElementsAssignment_4 )* ) ;
    public final void rule__ActivityArchitectureModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:945:1: ( ( ( rule__ActivityArchitectureModel__ElementsAssignment_4 )* ) )
            // InternalActivityArchitecture.g:946:1: ( ( rule__ActivityArchitectureModel__ElementsAssignment_4 )* )
            {
            // InternalActivityArchitecture.g:946:1: ( ( rule__ActivityArchitectureModel__ElementsAssignment_4 )* )
            // InternalActivityArchitecture.g:947:2: ( rule__ActivityArchitectureModel__ElementsAssignment_4 )*
            {
             before(grammarAccess.getActivityArchitectureModelAccess().getElementsAssignment_4()); 
            // InternalActivityArchitecture.g:948:2: ( rule__ActivityArchitectureModel__ElementsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==24||LA8_0==27||LA8_0==32||LA8_0==48) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalActivityArchitecture.g:948:3: rule__ActivityArchitectureModel__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__ActivityArchitectureModel__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getActivityArchitectureModelAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__4__Impl"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__5"
    // InternalActivityArchitecture.g:956:1: rule__ActivityArchitectureModel__Group__5 : rule__ActivityArchitectureModel__Group__5__Impl ;
    public final void rule__ActivityArchitectureModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:960:1: ( rule__ActivityArchitectureModel__Group__5__Impl )
            // InternalActivityArchitecture.g:961:2: rule__ActivityArchitectureModel__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityArchitectureModel__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__5"


    // $ANTLR start "rule__ActivityArchitectureModel__Group__5__Impl"
    // InternalActivityArchitecture.g:967:1: rule__ActivityArchitectureModel__Group__5__Impl : ( '}' ) ;
    public final void rule__ActivityArchitectureModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:971:1: ( ( '}' ) )
            // InternalActivityArchitecture.g:972:1: ( '}' )
            {
            // InternalActivityArchitecture.g:972:1: ( '}' )
            // InternalActivityArchitecture.g:973:2: '}'
            {
             before(grammarAccess.getActivityArchitectureModelAccess().getRightCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActivityArchitectureModelAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__Group__5__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalActivityArchitecture.g:983:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:987:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalActivityArchitecture.g:988:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_8);
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
    // InternalActivityArchitecture.g:995:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:999:1: ( ( ( '-' )? ) )
            // InternalActivityArchitecture.g:1000:1: ( ( '-' )? )
            {
            // InternalActivityArchitecture.g:1000:1: ( ( '-' )? )
            // InternalActivityArchitecture.g:1001:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalActivityArchitecture.g:1002:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==22) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalActivityArchitecture.g:1002:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalActivityArchitecture.g:1010:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1014:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalActivityArchitecture.g:1015:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_8);
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
    // InternalActivityArchitecture.g:1022:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1026:1: ( ( ( RULE_INT )? ) )
            // InternalActivityArchitecture.g:1027:1: ( ( RULE_INT )? )
            {
            // InternalActivityArchitecture.g:1027:1: ( ( RULE_INT )? )
            // InternalActivityArchitecture.g:1028:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalActivityArchitecture.g:1029:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalActivityArchitecture.g:1029:3: RULE_INT
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
    // InternalActivityArchitecture.g:1037:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1041:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalActivityArchitecture.g:1042:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_9);
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
    // InternalActivityArchitecture.g:1049:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1053:1: ( ( '.' ) )
            // InternalActivityArchitecture.g:1054:1: ( '.' )
            {
            // InternalActivityArchitecture.g:1054:1: ( '.' )
            // InternalActivityArchitecture.g:1055:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalActivityArchitecture.g:1064:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1068:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalActivityArchitecture.g:1069:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_10);
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
    // InternalActivityArchitecture.g:1076:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1080:1: ( ( RULE_INT ) )
            // InternalActivityArchitecture.g:1081:1: ( RULE_INT )
            {
            // InternalActivityArchitecture.g:1081:1: ( RULE_INT )
            // InternalActivityArchitecture.g:1082:2: RULE_INT
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
    // InternalActivityArchitecture.g:1091:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1095:1: ( rule__EDouble__Group__4__Impl )
            // InternalActivityArchitecture.g:1096:2: rule__EDouble__Group__4__Impl
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
    // InternalActivityArchitecture.g:1102:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1106:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalActivityArchitecture.g:1107:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalActivityArchitecture.g:1107:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalActivityArchitecture.g:1108:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalActivityArchitecture.g:1109:2: ( rule__EDouble__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalActivityArchitecture.g:1109:3: rule__EDouble__Group_4__0
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
    // InternalActivityArchitecture.g:1118:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1122:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalActivityArchitecture.g:1123:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalActivityArchitecture.g:1130:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1134:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalActivityArchitecture.g:1135:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalActivityArchitecture.g:1135:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalActivityArchitecture.g:1136:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalActivityArchitecture.g:1137:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalActivityArchitecture.g:1137:3: rule__EDouble__Alternatives_4_0
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
    // InternalActivityArchitecture.g:1145:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1149:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalActivityArchitecture.g:1150:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_11);
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
    // InternalActivityArchitecture.g:1157:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1161:1: ( ( ( '-' )? ) )
            // InternalActivityArchitecture.g:1162:1: ( ( '-' )? )
            {
            // InternalActivityArchitecture.g:1162:1: ( ( '-' )? )
            // InternalActivityArchitecture.g:1163:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalActivityArchitecture.g:1164:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalActivityArchitecture.g:1164:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalActivityArchitecture.g:1172:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1176:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalActivityArchitecture.g:1177:2: rule__EDouble__Group_4__2__Impl
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
    // InternalActivityArchitecture.g:1183:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1187:1: ( ( RULE_INT ) )
            // InternalActivityArchitecture.g:1188:1: ( RULE_INT )
            {
            // InternalActivityArchitecture.g:1188:1: ( RULE_INT )
            // InternalActivityArchitecture.g:1189:2: RULE_INT
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


    // $ANTLR start "rule__EInt__Group__0"
    // InternalActivityArchitecture.g:1199:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1203:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalActivityArchitecture.g:1204:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalActivityArchitecture.g:1211:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1215:1: ( ( ( '-' )? ) )
            // InternalActivityArchitecture.g:1216:1: ( ( '-' )? )
            {
            // InternalActivityArchitecture.g:1216:1: ( ( '-' )? )
            // InternalActivityArchitecture.g:1217:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalActivityArchitecture.g:1218:2: ( '-' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalActivityArchitecture.g:1218:3: '-'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalActivityArchitecture.g:1226:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1230:1: ( rule__EInt__Group__1__Impl )
            // InternalActivityArchitecture.g:1231:2: rule__EInt__Group__1__Impl
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
    // InternalActivityArchitecture.g:1237:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1241:1: ( ( RULE_INT ) )
            // InternalActivityArchitecture.g:1242:1: ( RULE_INT )
            {
            // InternalActivityArchitecture.g:1242:1: ( RULE_INT )
            // InternalActivityArchitecture.g:1243:2: RULE_INT
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


    // $ANTLR start "rule__FQN__Group__0"
    // InternalActivityArchitecture.g:1253:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1257:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalActivityArchitecture.g:1258:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalActivityArchitecture.g:1265:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1269:1: ( ( RULE_ID ) )
            // InternalActivityArchitecture.g:1270:1: ( RULE_ID )
            {
            // InternalActivityArchitecture.g:1270:1: ( RULE_ID )
            // InternalActivityArchitecture.g:1271:2: RULE_ID
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
    // InternalActivityArchitecture.g:1280:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1284:1: ( rule__FQN__Group__1__Impl )
            // InternalActivityArchitecture.g:1285:2: rule__FQN__Group__1__Impl
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
    // InternalActivityArchitecture.g:1291:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1295:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalActivityArchitecture.g:1296:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalActivityArchitecture.g:1296:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalActivityArchitecture.g:1297:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalActivityArchitecture.g:1298:2: ( rule__FQN__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==23) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalActivityArchitecture.g:1298:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // InternalActivityArchitecture.g:1307:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1311:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalActivityArchitecture.g:1312:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalActivityArchitecture.g:1319:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1323:1: ( ( '.' ) )
            // InternalActivityArchitecture.g:1324:1: ( '.' )
            {
            // InternalActivityArchitecture.g:1324:1: ( '.' )
            // InternalActivityArchitecture.g:1325:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalActivityArchitecture.g:1334:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1338:1: ( rule__FQN__Group_1__1__Impl )
            // InternalActivityArchitecture.g:1339:2: rule__FQN__Group_1__1__Impl
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
    // InternalActivityArchitecture.g:1345:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1349:1: ( ( RULE_ID ) )
            // InternalActivityArchitecture.g:1350:1: ( RULE_ID )
            {
            // InternalActivityArchitecture.g:1350:1: ( RULE_ID )
            // InternalActivityArchitecture.g:1351:2: RULE_ID
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


    // $ANTLR start "rule__DataFlow__Group__0"
    // InternalActivityArchitecture.g:1361:1: rule__DataFlow__Group__0 : rule__DataFlow__Group__0__Impl rule__DataFlow__Group__1 ;
    public final void rule__DataFlow__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1365:1: ( rule__DataFlow__Group__0__Impl rule__DataFlow__Group__1 )
            // InternalActivityArchitecture.g:1366:2: rule__DataFlow__Group__0__Impl rule__DataFlow__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DataFlow__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFlow__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__0"


    // $ANTLR start "rule__DataFlow__Group__0__Impl"
    // InternalActivityArchitecture.g:1373:1: rule__DataFlow__Group__0__Impl : ( 'DataFlow' ) ;
    public final void rule__DataFlow__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1377:1: ( ( 'DataFlow' ) )
            // InternalActivityArchitecture.g:1378:1: ( 'DataFlow' )
            {
            // InternalActivityArchitecture.g:1378:1: ( 'DataFlow' )
            // InternalActivityArchitecture.g:1379:2: 'DataFlow'
            {
             before(grammarAccess.getDataFlowAccess().getDataFlowKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDataFlowAccess().getDataFlowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__0__Impl"


    // $ANTLR start "rule__DataFlow__Group__1"
    // InternalActivityArchitecture.g:1388:1: rule__DataFlow__Group__1 : rule__DataFlow__Group__1__Impl rule__DataFlow__Group__2 ;
    public final void rule__DataFlow__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1392:1: ( rule__DataFlow__Group__1__Impl rule__DataFlow__Group__2 )
            // InternalActivityArchitecture.g:1393:2: rule__DataFlow__Group__1__Impl rule__DataFlow__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__DataFlow__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFlow__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__1"


    // $ANTLR start "rule__DataFlow__Group__1__Impl"
    // InternalActivityArchitecture.g:1400:1: rule__DataFlow__Group__1__Impl : ( '{' ) ;
    public final void rule__DataFlow__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1404:1: ( ( '{' ) )
            // InternalActivityArchitecture.g:1405:1: ( '{' )
            {
            // InternalActivityArchitecture.g:1405:1: ( '{' )
            // InternalActivityArchitecture.g:1406:2: '{'
            {
             before(grammarAccess.getDataFlowAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataFlowAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__1__Impl"


    // $ANTLR start "rule__DataFlow__Group__2"
    // InternalActivityArchitecture.g:1415:1: rule__DataFlow__Group__2 : rule__DataFlow__Group__2__Impl rule__DataFlow__Group__3 ;
    public final void rule__DataFlow__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1419:1: ( rule__DataFlow__Group__2__Impl rule__DataFlow__Group__3 )
            // InternalActivityArchitecture.g:1420:2: rule__DataFlow__Group__2__Impl rule__DataFlow__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__DataFlow__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFlow__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__2"


    // $ANTLR start "rule__DataFlow__Group__2__Impl"
    // InternalActivityArchitecture.g:1427:1: rule__DataFlow__Group__2__Impl : ( 'source' ) ;
    public final void rule__DataFlow__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1431:1: ( ( 'source' ) )
            // InternalActivityArchitecture.g:1432:1: ( 'source' )
            {
            // InternalActivityArchitecture.g:1432:1: ( 'source' )
            // InternalActivityArchitecture.g:1433:2: 'source'
            {
             before(grammarAccess.getDataFlowAccess().getSourceKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDataFlowAccess().getSourceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__2__Impl"


    // $ANTLR start "rule__DataFlow__Group__3"
    // InternalActivityArchitecture.g:1442:1: rule__DataFlow__Group__3 : rule__DataFlow__Group__3__Impl rule__DataFlow__Group__4 ;
    public final void rule__DataFlow__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1446:1: ( rule__DataFlow__Group__3__Impl rule__DataFlow__Group__4 )
            // InternalActivityArchitecture.g:1447:2: rule__DataFlow__Group__3__Impl rule__DataFlow__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__DataFlow__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFlow__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__3"


    // $ANTLR start "rule__DataFlow__Group__3__Impl"
    // InternalActivityArchitecture.g:1454:1: rule__DataFlow__Group__3__Impl : ( ( rule__DataFlow__SourceAssignment_3 ) ) ;
    public final void rule__DataFlow__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1458:1: ( ( ( rule__DataFlow__SourceAssignment_3 ) ) )
            // InternalActivityArchitecture.g:1459:1: ( ( rule__DataFlow__SourceAssignment_3 ) )
            {
            // InternalActivityArchitecture.g:1459:1: ( ( rule__DataFlow__SourceAssignment_3 ) )
            // InternalActivityArchitecture.g:1460:2: ( rule__DataFlow__SourceAssignment_3 )
            {
             before(grammarAccess.getDataFlowAccess().getSourceAssignment_3()); 
            // InternalActivityArchitecture.g:1461:2: ( rule__DataFlow__SourceAssignment_3 )
            // InternalActivityArchitecture.g:1461:3: rule__DataFlow__SourceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__DataFlow__SourceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDataFlowAccess().getSourceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__3__Impl"


    // $ANTLR start "rule__DataFlow__Group__4"
    // InternalActivityArchitecture.g:1469:1: rule__DataFlow__Group__4 : rule__DataFlow__Group__4__Impl rule__DataFlow__Group__5 ;
    public final void rule__DataFlow__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1473:1: ( rule__DataFlow__Group__4__Impl rule__DataFlow__Group__5 )
            // InternalActivityArchitecture.g:1474:2: rule__DataFlow__Group__4__Impl rule__DataFlow__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__DataFlow__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFlow__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__4"


    // $ANTLR start "rule__DataFlow__Group__4__Impl"
    // InternalActivityArchitecture.g:1481:1: rule__DataFlow__Group__4__Impl : ( 'destination' ) ;
    public final void rule__DataFlow__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1485:1: ( ( 'destination' ) )
            // InternalActivityArchitecture.g:1486:1: ( 'destination' )
            {
            // InternalActivityArchitecture.g:1486:1: ( 'destination' )
            // InternalActivityArchitecture.g:1487:2: 'destination'
            {
             before(grammarAccess.getDataFlowAccess().getDestinationKeyword_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getDataFlowAccess().getDestinationKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__4__Impl"


    // $ANTLR start "rule__DataFlow__Group__5"
    // InternalActivityArchitecture.g:1496:1: rule__DataFlow__Group__5 : rule__DataFlow__Group__5__Impl rule__DataFlow__Group__6 ;
    public final void rule__DataFlow__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1500:1: ( rule__DataFlow__Group__5__Impl rule__DataFlow__Group__6 )
            // InternalActivityArchitecture.g:1501:2: rule__DataFlow__Group__5__Impl rule__DataFlow__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__DataFlow__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataFlow__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__5"


    // $ANTLR start "rule__DataFlow__Group__5__Impl"
    // InternalActivityArchitecture.g:1508:1: rule__DataFlow__Group__5__Impl : ( ( rule__DataFlow__DestinationAssignment_5 ) ) ;
    public final void rule__DataFlow__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1512:1: ( ( ( rule__DataFlow__DestinationAssignment_5 ) ) )
            // InternalActivityArchitecture.g:1513:1: ( ( rule__DataFlow__DestinationAssignment_5 ) )
            {
            // InternalActivityArchitecture.g:1513:1: ( ( rule__DataFlow__DestinationAssignment_5 ) )
            // InternalActivityArchitecture.g:1514:2: ( rule__DataFlow__DestinationAssignment_5 )
            {
             before(grammarAccess.getDataFlowAccess().getDestinationAssignment_5()); 
            // InternalActivityArchitecture.g:1515:2: ( rule__DataFlow__DestinationAssignment_5 )
            // InternalActivityArchitecture.g:1515:3: rule__DataFlow__DestinationAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__DataFlow__DestinationAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getDataFlowAccess().getDestinationAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__5__Impl"


    // $ANTLR start "rule__DataFlow__Group__6"
    // InternalActivityArchitecture.g:1523:1: rule__DataFlow__Group__6 : rule__DataFlow__Group__6__Impl ;
    public final void rule__DataFlow__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1527:1: ( rule__DataFlow__Group__6__Impl )
            // InternalActivityArchitecture.g:1528:2: rule__DataFlow__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataFlow__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__6"


    // $ANTLR start "rule__DataFlow__Group__6__Impl"
    // InternalActivityArchitecture.g:1534:1: rule__DataFlow__Group__6__Impl : ( '}' ) ;
    public final void rule__DataFlow__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1538:1: ( ( '}' ) )
            // InternalActivityArchitecture.g:1539:1: ( '}' )
            {
            // InternalActivityArchitecture.g:1539:1: ( '}' )
            // InternalActivityArchitecture.g:1540:2: '}'
            {
             before(grammarAccess.getDataFlowAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataFlowAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__Group__6__Impl"


    // $ANTLR start "rule__InputHandlerNode__Group__0"
    // InternalActivityArchitecture.g:1550:1: rule__InputHandlerNode__Group__0 : rule__InputHandlerNode__Group__0__Impl rule__InputHandlerNode__Group__1 ;
    public final void rule__InputHandlerNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1554:1: ( rule__InputHandlerNode__Group__0__Impl rule__InputHandlerNode__Group__1 )
            // InternalActivityArchitecture.g:1555:2: rule__InputHandlerNode__Group__0__Impl rule__InputHandlerNode__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__InputHandlerNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__0"


    // $ANTLR start "rule__InputHandlerNode__Group__0__Impl"
    // InternalActivityArchitecture.g:1562:1: rule__InputHandlerNode__Group__0__Impl : ( () ) ;
    public final void rule__InputHandlerNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1566:1: ( ( () ) )
            // InternalActivityArchitecture.g:1567:1: ( () )
            {
            // InternalActivityArchitecture.g:1567:1: ( () )
            // InternalActivityArchitecture.g:1568:2: ()
            {
             before(grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeAction_0()); 
            // InternalActivityArchitecture.g:1569:2: ()
            // InternalActivityArchitecture.g:1569:3: 
            {
            }

             after(grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__0__Impl"


    // $ANTLR start "rule__InputHandlerNode__Group__1"
    // InternalActivityArchitecture.g:1577:1: rule__InputHandlerNode__Group__1 : rule__InputHandlerNode__Group__1__Impl rule__InputHandlerNode__Group__2 ;
    public final void rule__InputHandlerNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1581:1: ( rule__InputHandlerNode__Group__1__Impl rule__InputHandlerNode__Group__2 )
            // InternalActivityArchitecture.g:1582:2: rule__InputHandlerNode__Group__1__Impl rule__InputHandlerNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__InputHandlerNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__1"


    // $ANTLR start "rule__InputHandlerNode__Group__1__Impl"
    // InternalActivityArchitecture.g:1589:1: rule__InputHandlerNode__Group__1__Impl : ( 'InputHandlerNode' ) ;
    public final void rule__InputHandlerNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1593:1: ( ( 'InputHandlerNode' ) )
            // InternalActivityArchitecture.g:1594:1: ( 'InputHandlerNode' )
            {
            // InternalActivityArchitecture.g:1594:1: ( 'InputHandlerNode' )
            // InternalActivityArchitecture.g:1595:2: 'InputHandlerNode'
            {
             before(grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getInputHandlerNodeAccess().getInputHandlerNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__1__Impl"


    // $ANTLR start "rule__InputHandlerNode__Group__2"
    // InternalActivityArchitecture.g:1604:1: rule__InputHandlerNode__Group__2 : rule__InputHandlerNode__Group__2__Impl rule__InputHandlerNode__Group__3 ;
    public final void rule__InputHandlerNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1608:1: ( rule__InputHandlerNode__Group__2__Impl rule__InputHandlerNode__Group__3 )
            // InternalActivityArchitecture.g:1609:2: rule__InputHandlerNode__Group__2__Impl rule__InputHandlerNode__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__InputHandlerNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__2"


    // $ANTLR start "rule__InputHandlerNode__Group__2__Impl"
    // InternalActivityArchitecture.g:1616:1: rule__InputHandlerNode__Group__2__Impl : ( ( rule__InputHandlerNode__NameAssignment_2 ) ) ;
    public final void rule__InputHandlerNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1620:1: ( ( ( rule__InputHandlerNode__NameAssignment_2 ) ) )
            // InternalActivityArchitecture.g:1621:1: ( ( rule__InputHandlerNode__NameAssignment_2 ) )
            {
            // InternalActivityArchitecture.g:1621:1: ( ( rule__InputHandlerNode__NameAssignment_2 ) )
            // InternalActivityArchitecture.g:1622:2: ( rule__InputHandlerNode__NameAssignment_2 )
            {
             before(grammarAccess.getInputHandlerNodeAccess().getNameAssignment_2()); 
            // InternalActivityArchitecture.g:1623:2: ( rule__InputHandlerNode__NameAssignment_2 )
            // InternalActivityArchitecture.g:1623:3: rule__InputHandlerNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputHandlerNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__2__Impl"


    // $ANTLR start "rule__InputHandlerNode__Group__3"
    // InternalActivityArchitecture.g:1631:1: rule__InputHandlerNode__Group__3 : rule__InputHandlerNode__Group__3__Impl rule__InputHandlerNode__Group__4 ;
    public final void rule__InputHandlerNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1635:1: ( rule__InputHandlerNode__Group__3__Impl rule__InputHandlerNode__Group__4 )
            // InternalActivityArchitecture.g:1636:2: rule__InputHandlerNode__Group__3__Impl rule__InputHandlerNode__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__InputHandlerNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__3"


    // $ANTLR start "rule__InputHandlerNode__Group__3__Impl"
    // InternalActivityArchitecture.g:1643:1: rule__InputHandlerNode__Group__3__Impl : ( '{' ) ;
    public final void rule__InputHandlerNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1647:1: ( ( '{' ) )
            // InternalActivityArchitecture.g:1648:1: ( '{' )
            {
            // InternalActivityArchitecture.g:1648:1: ( '{' )
            // InternalActivityArchitecture.g:1649:2: '{'
            {
             before(grammarAccess.getInputHandlerNodeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getInputHandlerNodeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__3__Impl"


    // $ANTLR start "rule__InputHandlerNode__Group__4"
    // InternalActivityArchitecture.g:1658:1: rule__InputHandlerNode__Group__4 : rule__InputHandlerNode__Group__4__Impl rule__InputHandlerNode__Group__5 ;
    public final void rule__InputHandlerNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1662:1: ( rule__InputHandlerNode__Group__4__Impl rule__InputHandlerNode__Group__5 )
            // InternalActivityArchitecture.g:1663:2: rule__InputHandlerNode__Group__4__Impl rule__InputHandlerNode__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__InputHandlerNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__4"


    // $ANTLR start "rule__InputHandlerNode__Group__4__Impl"
    // InternalActivityArchitecture.g:1670:1: rule__InputHandlerNode__Group__4__Impl : ( ( rule__InputHandlerNode__Group_4__0 )? ) ;
    public final void rule__InputHandlerNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1674:1: ( ( ( rule__InputHandlerNode__Group_4__0 )? ) )
            // InternalActivityArchitecture.g:1675:1: ( ( rule__InputHandlerNode__Group_4__0 )? )
            {
            // InternalActivityArchitecture.g:1675:1: ( ( rule__InputHandlerNode__Group_4__0 )? )
            // InternalActivityArchitecture.g:1676:2: ( rule__InputHandlerNode__Group_4__0 )?
            {
             before(grammarAccess.getInputHandlerNodeAccess().getGroup_4()); 
            // InternalActivityArchitecture.g:1677:2: ( rule__InputHandlerNode__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==28) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalActivityArchitecture.g:1677:3: rule__InputHandlerNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputHandlerNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputHandlerNodeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__4__Impl"


    // $ANTLR start "rule__InputHandlerNode__Group__5"
    // InternalActivityArchitecture.g:1685:1: rule__InputHandlerNode__Group__5 : rule__InputHandlerNode__Group__5__Impl rule__InputHandlerNode__Group__6 ;
    public final void rule__InputHandlerNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1689:1: ( rule__InputHandlerNode__Group__5__Impl rule__InputHandlerNode__Group__6 )
            // InternalActivityArchitecture.g:1690:2: rule__InputHandlerNode__Group__5__Impl rule__InputHandlerNode__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__InputHandlerNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__5"


    // $ANTLR start "rule__InputHandlerNode__Group__5__Impl"
    // InternalActivityArchitecture.g:1697:1: rule__InputHandlerNode__Group__5__Impl : ( ( rule__InputHandlerNode__Group_5__0 )? ) ;
    public final void rule__InputHandlerNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1701:1: ( ( ( rule__InputHandlerNode__Group_5__0 )? ) )
            // InternalActivityArchitecture.g:1702:1: ( ( rule__InputHandlerNode__Group_5__0 )? )
            {
            // InternalActivityArchitecture.g:1702:1: ( ( rule__InputHandlerNode__Group_5__0 )? )
            // InternalActivityArchitecture.g:1703:2: ( rule__InputHandlerNode__Group_5__0 )?
            {
             before(grammarAccess.getInputHandlerNodeAccess().getGroup_5()); 
            // InternalActivityArchitecture.g:1704:2: ( rule__InputHandlerNode__Group_5__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==29) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalActivityArchitecture.g:1704:3: rule__InputHandlerNode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputHandlerNode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputHandlerNodeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__5__Impl"


    // $ANTLR start "rule__InputHandlerNode__Group__6"
    // InternalActivityArchitecture.g:1712:1: rule__InputHandlerNode__Group__6 : rule__InputHandlerNode__Group__6__Impl ;
    public final void rule__InputHandlerNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1716:1: ( rule__InputHandlerNode__Group__6__Impl )
            // InternalActivityArchitecture.g:1717:2: rule__InputHandlerNode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__6"


    // $ANTLR start "rule__InputHandlerNode__Group__6__Impl"
    // InternalActivityArchitecture.g:1723:1: rule__InputHandlerNode__Group__6__Impl : ( '}' ) ;
    public final void rule__InputHandlerNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1727:1: ( ( '}' ) )
            // InternalActivityArchitecture.g:1728:1: ( '}' )
            {
            // InternalActivityArchitecture.g:1728:1: ( '}' )
            // InternalActivityArchitecture.g:1729:2: '}'
            {
             before(grammarAccess.getInputHandlerNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInputHandlerNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group__6__Impl"


    // $ANTLR start "rule__InputHandlerNode__Group_4__0"
    // InternalActivityArchitecture.g:1739:1: rule__InputHandlerNode__Group_4__0 : rule__InputHandlerNode__Group_4__0__Impl rule__InputHandlerNode__Group_4__1 ;
    public final void rule__InputHandlerNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1743:1: ( rule__InputHandlerNode__Group_4__0__Impl rule__InputHandlerNode__Group_4__1 )
            // InternalActivityArchitecture.g:1744:2: rule__InputHandlerNode__Group_4__0__Impl rule__InputHandlerNode__Group_4__1
            {
            pushFollow(FOLLOW_19);
            rule__InputHandlerNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group_4__0"


    // $ANTLR start "rule__InputHandlerNode__Group_4__0__Impl"
    // InternalActivityArchitecture.g:1751:1: rule__InputHandlerNode__Group_4__0__Impl : ( 'input' ) ;
    public final void rule__InputHandlerNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1755:1: ( ( 'input' ) )
            // InternalActivityArchitecture.g:1756:1: ( 'input' )
            {
            // InternalActivityArchitecture.g:1756:1: ( 'input' )
            // InternalActivityArchitecture.g:1757:2: 'input'
            {
             before(grammarAccess.getInputHandlerNodeAccess().getInputKeyword_4_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getInputHandlerNodeAccess().getInputKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group_4__0__Impl"


    // $ANTLR start "rule__InputHandlerNode__Group_4__1"
    // InternalActivityArchitecture.g:1766:1: rule__InputHandlerNode__Group_4__1 : rule__InputHandlerNode__Group_4__1__Impl ;
    public final void rule__InputHandlerNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1770:1: ( rule__InputHandlerNode__Group_4__1__Impl )
            // InternalActivityArchitecture.g:1771:2: rule__InputHandlerNode__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group_4__1"


    // $ANTLR start "rule__InputHandlerNode__Group_4__1__Impl"
    // InternalActivityArchitecture.g:1777:1: rule__InputHandlerNode__Group_4__1__Impl : ( ( rule__InputHandlerNode__InputNodeAssignment_4_1 ) ) ;
    public final void rule__InputHandlerNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1781:1: ( ( ( rule__InputHandlerNode__InputNodeAssignment_4_1 ) ) )
            // InternalActivityArchitecture.g:1782:1: ( ( rule__InputHandlerNode__InputNodeAssignment_4_1 ) )
            {
            // InternalActivityArchitecture.g:1782:1: ( ( rule__InputHandlerNode__InputNodeAssignment_4_1 ) )
            // InternalActivityArchitecture.g:1783:2: ( rule__InputHandlerNode__InputNodeAssignment_4_1 )
            {
             before(grammarAccess.getInputHandlerNodeAccess().getInputNodeAssignment_4_1()); 
            // InternalActivityArchitecture.g:1784:2: ( rule__InputHandlerNode__InputNodeAssignment_4_1 )
            // InternalActivityArchitecture.g:1784:3: rule__InputHandlerNode__InputNodeAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__InputNodeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getInputHandlerNodeAccess().getInputNodeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group_4__1__Impl"


    // $ANTLR start "rule__InputHandlerNode__Group_5__0"
    // InternalActivityArchitecture.g:1793:1: rule__InputHandlerNode__Group_5__0 : rule__InputHandlerNode__Group_5__0__Impl rule__InputHandlerNode__Group_5__1 ;
    public final void rule__InputHandlerNode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1797:1: ( rule__InputHandlerNode__Group_5__0__Impl rule__InputHandlerNode__Group_5__1 )
            // InternalActivityArchitecture.g:1798:2: rule__InputHandlerNode__Group_5__0__Impl rule__InputHandlerNode__Group_5__1
            {
            pushFollow(FOLLOW_11);
            rule__InputHandlerNode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group_5__0"


    // $ANTLR start "rule__InputHandlerNode__Group_5__0__Impl"
    // InternalActivityArchitecture.g:1805:1: rule__InputHandlerNode__Group_5__0__Impl : ( 'prescale' ) ;
    public final void rule__InputHandlerNode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1809:1: ( ( 'prescale' ) )
            // InternalActivityArchitecture.g:1810:1: ( 'prescale' )
            {
            // InternalActivityArchitecture.g:1810:1: ( 'prescale' )
            // InternalActivityArchitecture.g:1811:2: 'prescale'
            {
             before(grammarAccess.getInputHandlerNodeAccess().getPrescaleKeyword_5_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInputHandlerNodeAccess().getPrescaleKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group_5__0__Impl"


    // $ANTLR start "rule__InputHandlerNode__Group_5__1"
    // InternalActivityArchitecture.g:1820:1: rule__InputHandlerNode__Group_5__1 : rule__InputHandlerNode__Group_5__1__Impl ;
    public final void rule__InputHandlerNode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1824:1: ( rule__InputHandlerNode__Group_5__1__Impl )
            // InternalActivityArchitecture.g:1825:2: rule__InputHandlerNode__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group_5__1"


    // $ANTLR start "rule__InputHandlerNode__Group_5__1__Impl"
    // InternalActivityArchitecture.g:1831:1: rule__InputHandlerNode__Group_5__1__Impl : ( ( rule__InputHandlerNode__PrescaleAssignment_5_1 ) ) ;
    public final void rule__InputHandlerNode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1835:1: ( ( ( rule__InputHandlerNode__PrescaleAssignment_5_1 ) ) )
            // InternalActivityArchitecture.g:1836:1: ( ( rule__InputHandlerNode__PrescaleAssignment_5_1 ) )
            {
            // InternalActivityArchitecture.g:1836:1: ( ( rule__InputHandlerNode__PrescaleAssignment_5_1 ) )
            // InternalActivityArchitecture.g:1837:2: ( rule__InputHandlerNode__PrescaleAssignment_5_1 )
            {
             before(grammarAccess.getInputHandlerNodeAccess().getPrescaleAssignment_5_1()); 
            // InternalActivityArchitecture.g:1838:2: ( rule__InputHandlerNode__PrescaleAssignment_5_1 )
            // InternalActivityArchitecture.g:1838:3: rule__InputHandlerNode__PrescaleAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__InputHandlerNode__PrescaleAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getInputHandlerNodeAccess().getPrescaleAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__Group_5__1__Impl"


    // $ANTLR start "rule__HandlerTriggerInputNode__Group__0"
    // InternalActivityArchitecture.g:1847:1: rule__HandlerTriggerInputNode__Group__0 : rule__HandlerTriggerInputNode__Group__0__Impl rule__HandlerTriggerInputNode__Group__1 ;
    public final void rule__HandlerTriggerInputNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1851:1: ( rule__HandlerTriggerInputNode__Group__0__Impl rule__HandlerTriggerInputNode__Group__1 )
            // InternalActivityArchitecture.g:1852:2: rule__HandlerTriggerInputNode__Group__0__Impl rule__HandlerTriggerInputNode__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__HandlerTriggerInputNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandlerTriggerInputNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerTriggerInputNode__Group__0"


    // $ANTLR start "rule__HandlerTriggerInputNode__Group__0__Impl"
    // InternalActivityArchitecture.g:1859:1: rule__HandlerTriggerInputNode__Group__0__Impl : ( () ) ;
    public final void rule__HandlerTriggerInputNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1863:1: ( ( () ) )
            // InternalActivityArchitecture.g:1864:1: ( () )
            {
            // InternalActivityArchitecture.g:1864:1: ( () )
            // InternalActivityArchitecture.g:1865:2: ()
            {
             before(grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeAction_0()); 
            // InternalActivityArchitecture.g:1866:2: ()
            // InternalActivityArchitecture.g:1866:3: 
            {
            }

             after(grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerTriggerInputNode__Group__0__Impl"


    // $ANTLR start "rule__HandlerTriggerInputNode__Group__1"
    // InternalActivityArchitecture.g:1874:1: rule__HandlerTriggerInputNode__Group__1 : rule__HandlerTriggerInputNode__Group__1__Impl rule__HandlerTriggerInputNode__Group__2 ;
    public final void rule__HandlerTriggerInputNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1878:1: ( rule__HandlerTriggerInputNode__Group__1__Impl rule__HandlerTriggerInputNode__Group__2 )
            // InternalActivityArchitecture.g:1879:2: rule__HandlerTriggerInputNode__Group__1__Impl rule__HandlerTriggerInputNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__HandlerTriggerInputNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandlerTriggerInputNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerTriggerInputNode__Group__1"


    // $ANTLR start "rule__HandlerTriggerInputNode__Group__1__Impl"
    // InternalActivityArchitecture.g:1886:1: rule__HandlerTriggerInputNode__Group__1__Impl : ( 'TriggerInputNode' ) ;
    public final void rule__HandlerTriggerInputNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1890:1: ( ( 'TriggerInputNode' ) )
            // InternalActivityArchitecture.g:1891:1: ( 'TriggerInputNode' )
            {
            // InternalActivityArchitecture.g:1891:1: ( 'TriggerInputNode' )
            // InternalActivityArchitecture.g:1892:2: 'TriggerInputNode'
            {
             before(grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getHandlerTriggerInputNodeAccess().getTriggerInputNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerTriggerInputNode__Group__1__Impl"


    // $ANTLR start "rule__HandlerTriggerInputNode__Group__2"
    // InternalActivityArchitecture.g:1901:1: rule__HandlerTriggerInputNode__Group__2 : rule__HandlerTriggerInputNode__Group__2__Impl rule__HandlerTriggerInputNode__Group__3 ;
    public final void rule__HandlerTriggerInputNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1905:1: ( rule__HandlerTriggerInputNode__Group__2__Impl rule__HandlerTriggerInputNode__Group__3 )
            // InternalActivityArchitecture.g:1906:2: rule__HandlerTriggerInputNode__Group__2__Impl rule__HandlerTriggerInputNode__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__HandlerTriggerInputNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__HandlerTriggerInputNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerTriggerInputNode__Group__2"


    // $ANTLR start "rule__HandlerTriggerInputNode__Group__2__Impl"
    // InternalActivityArchitecture.g:1913:1: rule__HandlerTriggerInputNode__Group__2__Impl : ( ( rule__HandlerTriggerInputNode__NameAssignment_2 ) ) ;
    public final void rule__HandlerTriggerInputNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1917:1: ( ( ( rule__HandlerTriggerInputNode__NameAssignment_2 ) ) )
            // InternalActivityArchitecture.g:1918:1: ( ( rule__HandlerTriggerInputNode__NameAssignment_2 ) )
            {
            // InternalActivityArchitecture.g:1918:1: ( ( rule__HandlerTriggerInputNode__NameAssignment_2 ) )
            // InternalActivityArchitecture.g:1919:2: ( rule__HandlerTriggerInputNode__NameAssignment_2 )
            {
             before(grammarAccess.getHandlerTriggerInputNodeAccess().getNameAssignment_2()); 
            // InternalActivityArchitecture.g:1920:2: ( rule__HandlerTriggerInputNode__NameAssignment_2 )
            // InternalActivityArchitecture.g:1920:3: rule__HandlerTriggerInputNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__HandlerTriggerInputNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getHandlerTriggerInputNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerTriggerInputNode__Group__2__Impl"


    // $ANTLR start "rule__HandlerTriggerInputNode__Group__3"
    // InternalActivityArchitecture.g:1928:1: rule__HandlerTriggerInputNode__Group__3 : rule__HandlerTriggerInputNode__Group__3__Impl ;
    public final void rule__HandlerTriggerInputNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1932:1: ( rule__HandlerTriggerInputNode__Group__3__Impl )
            // InternalActivityArchitecture.g:1933:2: rule__HandlerTriggerInputNode__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__HandlerTriggerInputNode__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerTriggerInputNode__Group__3"


    // $ANTLR start "rule__HandlerTriggerInputNode__Group__3__Impl"
    // InternalActivityArchitecture.g:1939:1: rule__HandlerTriggerInputNode__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__HandlerTriggerInputNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1943:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:1944:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:1944:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:1945:2: ( ';' )?
            {
             before(grammarAccess.getHandlerTriggerInputNodeAccess().getSemicolonKeyword_3()); 
            // InternalActivityArchitecture.g:1946:2: ( ';' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalActivityArchitecture.g:1946:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getHandlerTriggerInputNodeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerTriggerInputNode__Group__3__Impl"


    // $ANTLR start "rule__ActivityNode__Group__0"
    // InternalActivityArchitecture.g:1955:1: rule__ActivityNode__Group__0 : rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1 ;
    public final void rule__ActivityNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1959:1: ( rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1 )
            // InternalActivityArchitecture.g:1960:2: rule__ActivityNode__Group__0__Impl rule__ActivityNode__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ActivityNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__0"


    // $ANTLR start "rule__ActivityNode__Group__0__Impl"
    // InternalActivityArchitecture.g:1967:1: rule__ActivityNode__Group__0__Impl : ( () ) ;
    public final void rule__ActivityNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1971:1: ( ( () ) )
            // InternalActivityArchitecture.g:1972:1: ( () )
            {
            // InternalActivityArchitecture.g:1972:1: ( () )
            // InternalActivityArchitecture.g:1973:2: ()
            {
             before(grammarAccess.getActivityNodeAccess().getActivityNodeAction_0()); 
            // InternalActivityArchitecture.g:1974:2: ()
            // InternalActivityArchitecture.g:1974:3: 
            {
            }

             after(grammarAccess.getActivityNodeAccess().getActivityNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group__1"
    // InternalActivityArchitecture.g:1982:1: rule__ActivityNode__Group__1 : rule__ActivityNode__Group__1__Impl rule__ActivityNode__Group__2 ;
    public final void rule__ActivityNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1986:1: ( rule__ActivityNode__Group__1__Impl rule__ActivityNode__Group__2 )
            // InternalActivityArchitecture.g:1987:2: rule__ActivityNode__Group__1__Impl rule__ActivityNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__ActivityNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__1"


    // $ANTLR start "rule__ActivityNode__Group__1__Impl"
    // InternalActivityArchitecture.g:1994:1: rule__ActivityNode__Group__1__Impl : ( 'ActivityNode' ) ;
    public final void rule__ActivityNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:1998:1: ( ( 'ActivityNode' ) )
            // InternalActivityArchitecture.g:1999:1: ( 'ActivityNode' )
            {
            // InternalActivityArchitecture.g:1999:1: ( 'ActivityNode' )
            // InternalActivityArchitecture.g:2000:2: 'ActivityNode'
            {
             before(grammarAccess.getActivityNodeAccess().getActivityNodeKeyword_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getActivityNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group__2"
    // InternalActivityArchitecture.g:2009:1: rule__ActivityNode__Group__2 : rule__ActivityNode__Group__2__Impl rule__ActivityNode__Group__3 ;
    public final void rule__ActivityNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2013:1: ( rule__ActivityNode__Group__2__Impl rule__ActivityNode__Group__3 )
            // InternalActivityArchitecture.g:2014:2: rule__ActivityNode__Group__2__Impl rule__ActivityNode__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__ActivityNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__2"


    // $ANTLR start "rule__ActivityNode__Group__2__Impl"
    // InternalActivityArchitecture.g:2021:1: rule__ActivityNode__Group__2__Impl : ( ( rule__ActivityNode__NameAssignment_2 ) ) ;
    public final void rule__ActivityNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2025:1: ( ( ( rule__ActivityNode__NameAssignment_2 ) ) )
            // InternalActivityArchitecture.g:2026:1: ( ( rule__ActivityNode__NameAssignment_2 ) )
            {
            // InternalActivityArchitecture.g:2026:1: ( ( rule__ActivityNode__NameAssignment_2 ) )
            // InternalActivityArchitecture.g:2027:2: ( rule__ActivityNode__NameAssignment_2 )
            {
             before(grammarAccess.getActivityNodeAccess().getNameAssignment_2()); 
            // InternalActivityArchitecture.g:2028:2: ( rule__ActivityNode__NameAssignment_2 )
            // InternalActivityArchitecture.g:2028:3: rule__ActivityNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__2__Impl"


    // $ANTLR start "rule__ActivityNode__Group__3"
    // InternalActivityArchitecture.g:2036:1: rule__ActivityNode__Group__3 : rule__ActivityNode__Group__3__Impl rule__ActivityNode__Group__4 ;
    public final void rule__ActivityNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2040:1: ( rule__ActivityNode__Group__3__Impl rule__ActivityNode__Group__4 )
            // InternalActivityArchitecture.g:2041:2: rule__ActivityNode__Group__3__Impl rule__ActivityNode__Group__4
            {
            pushFollow(FOLLOW_22);
            rule__ActivityNode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__3"


    // $ANTLR start "rule__ActivityNode__Group__3__Impl"
    // InternalActivityArchitecture.g:2048:1: rule__ActivityNode__Group__3__Impl : ( '{' ) ;
    public final void rule__ActivityNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2052:1: ( ( '{' ) )
            // InternalActivityArchitecture.g:2053:1: ( '{' )
            {
            // InternalActivityArchitecture.g:2053:1: ( '{' )
            // InternalActivityArchitecture.g:2054:2: '{'
            {
             before(grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__3__Impl"


    // $ANTLR start "rule__ActivityNode__Group__4"
    // InternalActivityArchitecture.g:2063:1: rule__ActivityNode__Group__4 : rule__ActivityNode__Group__4__Impl rule__ActivityNode__Group__5 ;
    public final void rule__ActivityNode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2067:1: ( rule__ActivityNode__Group__4__Impl rule__ActivityNode__Group__5 )
            // InternalActivityArchitecture.g:2068:2: rule__ActivityNode__Group__4__Impl rule__ActivityNode__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__ActivityNode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__4"


    // $ANTLR start "rule__ActivityNode__Group__4__Impl"
    // InternalActivityArchitecture.g:2075:1: rule__ActivityNode__Group__4__Impl : ( ( rule__ActivityNode__Group_4__0 )? ) ;
    public final void rule__ActivityNode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2079:1: ( ( ( rule__ActivityNode__Group_4__0 )? ) )
            // InternalActivityArchitecture.g:2080:1: ( ( rule__ActivityNode__Group_4__0 )? )
            {
            // InternalActivityArchitecture.g:2080:1: ( ( rule__ActivityNode__Group_4__0 )? )
            // InternalActivityArchitecture.g:2081:2: ( rule__ActivityNode__Group_4__0 )?
            {
             before(grammarAccess.getActivityNodeAccess().getGroup_4()); 
            // InternalActivityArchitecture.g:2082:2: ( rule__ActivityNode__Group_4__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalActivityArchitecture.g:2082:3: rule__ActivityNode__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActivityNodeAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__4__Impl"


    // $ANTLR start "rule__ActivityNode__Group__5"
    // InternalActivityArchitecture.g:2090:1: rule__ActivityNode__Group__5 : rule__ActivityNode__Group__5__Impl rule__ActivityNode__Group__6 ;
    public final void rule__ActivityNode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2094:1: ( rule__ActivityNode__Group__5__Impl rule__ActivityNode__Group__6 )
            // InternalActivityArchitecture.g:2095:2: rule__ActivityNode__Group__5__Impl rule__ActivityNode__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__ActivityNode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__5"


    // $ANTLR start "rule__ActivityNode__Group__5__Impl"
    // InternalActivityArchitecture.g:2102:1: rule__ActivityNode__Group__5__Impl : ( ( rule__ActivityNode__UnorderedGroup_5 ) ) ;
    public final void rule__ActivityNode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2106:1: ( ( ( rule__ActivityNode__UnorderedGroup_5 ) ) )
            // InternalActivityArchitecture.g:2107:1: ( ( rule__ActivityNode__UnorderedGroup_5 ) )
            {
            // InternalActivityArchitecture.g:2107:1: ( ( rule__ActivityNode__UnorderedGroup_5 ) )
            // InternalActivityArchitecture.g:2108:2: ( rule__ActivityNode__UnorderedGroup_5 )
            {
             before(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5()); 
            // InternalActivityArchitecture.g:2109:2: ( rule__ActivityNode__UnorderedGroup_5 )
            // InternalActivityArchitecture.g:2109:3: rule__ActivityNode__UnorderedGroup_5
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__UnorderedGroup_5();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__5__Impl"


    // $ANTLR start "rule__ActivityNode__Group__6"
    // InternalActivityArchitecture.g:2117:1: rule__ActivityNode__Group__6 : rule__ActivityNode__Group__6__Impl ;
    public final void rule__ActivityNode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2121:1: ( rule__ActivityNode__Group__6__Impl )
            // InternalActivityArchitecture.g:2122:2: rule__ActivityNode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__6"


    // $ANTLR start "rule__ActivityNode__Group__6__Impl"
    // InternalActivityArchitecture.g:2128:1: rule__ActivityNode__Group__6__Impl : ( '}' ) ;
    public final void rule__ActivityNode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2132:1: ( ( '}' ) )
            // InternalActivityArchitecture.g:2133:1: ( '}' )
            {
            // InternalActivityArchitecture.g:2133:1: ( '}' )
            // InternalActivityArchitecture.g:2134:2: '}'
            {
             before(grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group__6__Impl"


    // $ANTLR start "rule__ActivityNode__Group_4__0"
    // InternalActivityArchitecture.g:2144:1: rule__ActivityNode__Group_4__0 : rule__ActivityNode__Group_4__0__Impl rule__ActivityNode__Group_4__1 ;
    public final void rule__ActivityNode__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2148:1: ( rule__ActivityNode__Group_4__0__Impl rule__ActivityNode__Group_4__1 )
            // InternalActivityArchitecture.g:2149:2: rule__ActivityNode__Group_4__0__Impl rule__ActivityNode__Group_4__1
            {
            pushFollow(FOLLOW_5);
            rule__ActivityNode__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__0"


    // $ANTLR start "rule__ActivityNode__Group_4__0__Impl"
    // InternalActivityArchitecture.g:2156:1: rule__ActivityNode__Group_4__0__Impl : ( 'inputs' ) ;
    public final void rule__ActivityNode__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2160:1: ( ( 'inputs' ) )
            // InternalActivityArchitecture.g:2161:1: ( 'inputs' )
            {
            // InternalActivityArchitecture.g:2161:1: ( 'inputs' )
            // InternalActivityArchitecture.g:2162:2: 'inputs'
            {
             before(grammarAccess.getActivityNodeAccess().getInputsKeyword_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getInputsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group_4__1"
    // InternalActivityArchitecture.g:2171:1: rule__ActivityNode__Group_4__1 : rule__ActivityNode__Group_4__1__Impl rule__ActivityNode__Group_4__2 ;
    public final void rule__ActivityNode__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2175:1: ( rule__ActivityNode__Group_4__1__Impl rule__ActivityNode__Group_4__2 )
            // InternalActivityArchitecture.g:2176:2: rule__ActivityNode__Group_4__1__Impl rule__ActivityNode__Group_4__2
            {
            pushFollow(FOLLOW_23);
            rule__ActivityNode__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__1"


    // $ANTLR start "rule__ActivityNode__Group_4__1__Impl"
    // InternalActivityArchitecture.g:2183:1: rule__ActivityNode__Group_4__1__Impl : ( '{' ) ;
    public final void rule__ActivityNode__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2187:1: ( ( '{' ) )
            // InternalActivityArchitecture.g:2188:1: ( '{' )
            {
            // InternalActivityArchitecture.g:2188:1: ( '{' )
            // InternalActivityArchitecture.g:2189:2: '{'
            {
             before(grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group_4__2"
    // InternalActivityArchitecture.g:2198:1: rule__ActivityNode__Group_4__2 : rule__ActivityNode__Group_4__2__Impl rule__ActivityNode__Group_4__3 ;
    public final void rule__ActivityNode__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2202:1: ( rule__ActivityNode__Group_4__2__Impl rule__ActivityNode__Group_4__3 )
            // InternalActivityArchitecture.g:2203:2: rule__ActivityNode__Group_4__2__Impl rule__ActivityNode__Group_4__3
            {
            pushFollow(FOLLOW_23);
            rule__ActivityNode__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__2"


    // $ANTLR start "rule__ActivityNode__Group_4__2__Impl"
    // InternalActivityArchitecture.g:2210:1: rule__ActivityNode__Group_4__2__Impl : ( ( rule__ActivityNode__InputsAssignment_4_2 )* ) ;
    public final void rule__ActivityNode__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2214:1: ( ( ( rule__ActivityNode__InputsAssignment_4_2 )* ) )
            // InternalActivityArchitecture.g:2215:1: ( ( rule__ActivityNode__InputsAssignment_4_2 )* )
            {
            // InternalActivityArchitecture.g:2215:1: ( ( rule__ActivityNode__InputsAssignment_4_2 )* )
            // InternalActivityArchitecture.g:2216:2: ( rule__ActivityNode__InputsAssignment_4_2 )*
            {
             before(grammarAccess.getActivityNodeAccess().getInputsAssignment_4_2()); 
            // InternalActivityArchitecture.g:2217:2: ( rule__ActivityNode__InputsAssignment_4_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==30||LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalActivityArchitecture.g:2217:3: rule__ActivityNode__InputsAssignment_4_2
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__ActivityNode__InputsAssignment_4_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getActivityNodeAccess().getInputsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__2__Impl"


    // $ANTLR start "rule__ActivityNode__Group_4__3"
    // InternalActivityArchitecture.g:2225:1: rule__ActivityNode__Group_4__3 : rule__ActivityNode__Group_4__3__Impl ;
    public final void rule__ActivityNode__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2229:1: ( rule__ActivityNode__Group_4__3__Impl )
            // InternalActivityArchitecture.g:2230:2: rule__ActivityNode__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__3"


    // $ANTLR start "rule__ActivityNode__Group_4__3__Impl"
    // InternalActivityArchitecture.g:2236:1: rule__ActivityNode__Group_4__3__Impl : ( '}' ) ;
    public final void rule__ActivityNode__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2240:1: ( ( '}' ) )
            // InternalActivityArchitecture.g:2241:1: ( '}' )
            {
            // InternalActivityArchitecture.g:2241:1: ( '}' )
            // InternalActivityArchitecture.g:2242:2: '}'
            {
             before(grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_4_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getRightCurlyBracketKeyword_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_4__3__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5_0__0"
    // InternalActivityArchitecture.g:2252:1: rule__ActivityNode__Group_5_0__0 : rule__ActivityNode__Group_5_0__0__Impl rule__ActivityNode__Group_5_0__1 ;
    public final void rule__ActivityNode__Group_5_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2256:1: ( rule__ActivityNode__Group_5_0__0__Impl rule__ActivityNode__Group_5_0__1 )
            // InternalActivityArchitecture.g:2257:2: rule__ActivityNode__Group_5_0__0__Impl rule__ActivityNode__Group_5_0__1
            {
            pushFollow(FOLLOW_4);
            rule__ActivityNode__Group_5_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_0__0"


    // $ANTLR start "rule__ActivityNode__Group_5_0__0__Impl"
    // InternalActivityArchitecture.g:2264:1: rule__ActivityNode__Group_5_0__0__Impl : ( 'cpuAffinity' ) ;
    public final void rule__ActivityNode__Group_5_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2268:1: ( ( 'cpuAffinity' ) )
            // InternalActivityArchitecture.g:2269:1: ( 'cpuAffinity' )
            {
            // InternalActivityArchitecture.g:2269:1: ( 'cpuAffinity' )
            // InternalActivityArchitecture.g:2270:2: 'cpuAffinity'
            {
             before(grammarAccess.getActivityNodeAccess().getCpuAffinityKeyword_5_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getCpuAffinityKeyword_5_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_0__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5_0__1"
    // InternalActivityArchitecture.g:2279:1: rule__ActivityNode__Group_5_0__1 : rule__ActivityNode__Group_5_0__1__Impl rule__ActivityNode__Group_5_0__2 ;
    public final void rule__ActivityNode__Group_5_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2283:1: ( rule__ActivityNode__Group_5_0__1__Impl rule__ActivityNode__Group_5_0__2 )
            // InternalActivityArchitecture.g:2284:2: rule__ActivityNode__Group_5_0__1__Impl rule__ActivityNode__Group_5_0__2
            {
            pushFollow(FOLLOW_20);
            rule__ActivityNode__Group_5_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_0__1"


    // $ANTLR start "rule__ActivityNode__Group_5_0__1__Impl"
    // InternalActivityArchitecture.g:2291:1: rule__ActivityNode__Group_5_0__1__Impl : ( ( rule__ActivityNode__AffinityAssignment_5_0_1 ) ) ;
    public final void rule__ActivityNode__Group_5_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2295:1: ( ( ( rule__ActivityNode__AffinityAssignment_5_0_1 ) ) )
            // InternalActivityArchitecture.g:2296:1: ( ( rule__ActivityNode__AffinityAssignment_5_0_1 ) )
            {
            // InternalActivityArchitecture.g:2296:1: ( ( rule__ActivityNode__AffinityAssignment_5_0_1 ) )
            // InternalActivityArchitecture.g:2297:2: ( rule__ActivityNode__AffinityAssignment_5_0_1 )
            {
             before(grammarAccess.getActivityNodeAccess().getAffinityAssignment_5_0_1()); 
            // InternalActivityArchitecture.g:2298:2: ( rule__ActivityNode__AffinityAssignment_5_0_1 )
            // InternalActivityArchitecture.g:2298:3: rule__ActivityNode__AffinityAssignment_5_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__AffinityAssignment_5_0_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getAffinityAssignment_5_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_0__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5_0__2"
    // InternalActivityArchitecture.g:2306:1: rule__ActivityNode__Group_5_0__2 : rule__ActivityNode__Group_5_0__2__Impl ;
    public final void rule__ActivityNode__Group_5_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2310:1: ( rule__ActivityNode__Group_5_0__2__Impl )
            // InternalActivityArchitecture.g:2311:2: rule__ActivityNode__Group_5_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_0__2"


    // $ANTLR start "rule__ActivityNode__Group_5_0__2__Impl"
    // InternalActivityArchitecture.g:2317:1: rule__ActivityNode__Group_5_0__2__Impl : ( ( ';' )? ) ;
    public final void rule__ActivityNode__Group_5_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2321:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:2322:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:2322:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:2323:2: ( ';' )?
            {
             before(grammarAccess.getActivityNodeAccess().getSemicolonKeyword_5_0_2()); 
            // InternalActivityArchitecture.g:2324:2: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalActivityArchitecture.g:2324:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getActivityNodeAccess().getSemicolonKeyword_5_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_0__2__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5_1__0"
    // InternalActivityArchitecture.g:2333:1: rule__ActivityNode__Group_5_1__0 : rule__ActivityNode__Group_5_1__0__Impl rule__ActivityNode__Group_5_1__1 ;
    public final void rule__ActivityNode__Group_5_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2337:1: ( rule__ActivityNode__Group_5_1__0__Impl rule__ActivityNode__Group_5_1__1 )
            // InternalActivityArchitecture.g:2338:2: rule__ActivityNode__Group_5_1__0__Impl rule__ActivityNode__Group_5_1__1
            {
            pushFollow(FOLLOW_25);
            rule__ActivityNode__Group_5_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_1__0"


    // $ANTLR start "rule__ActivityNode__Group_5_1__0__Impl"
    // InternalActivityArchitecture.g:2345:1: rule__ActivityNode__Group_5_1__0__Impl : ( 'activationSource' ) ;
    public final void rule__ActivityNode__Group_5_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2349:1: ( ( 'activationSource' ) )
            // InternalActivityArchitecture.g:2350:1: ( 'activationSource' )
            {
            // InternalActivityArchitecture.g:2350:1: ( 'activationSource' )
            // InternalActivityArchitecture.g:2351:2: 'activationSource'
            {
             before(grammarAccess.getActivityNodeAccess().getActivationSourceKeyword_5_1_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getActivationSourceKeyword_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_1__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5_1__1"
    // InternalActivityArchitecture.g:2360:1: rule__ActivityNode__Group_5_1__1 : rule__ActivityNode__Group_5_1__1__Impl ;
    public final void rule__ActivityNode__Group_5_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2364:1: ( rule__ActivityNode__Group_5_1__1__Impl )
            // InternalActivityArchitecture.g:2365:2: rule__ActivityNode__Group_5_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_1__1"


    // $ANTLR start "rule__ActivityNode__Group_5_1__1__Impl"
    // InternalActivityArchitecture.g:2371:1: rule__ActivityNode__Group_5_1__1__Impl : ( ( rule__ActivityNode__ActivationSourceAssignment_5_1_1 ) ) ;
    public final void rule__ActivityNode__Group_5_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2375:1: ( ( ( rule__ActivityNode__ActivationSourceAssignment_5_1_1 ) ) )
            // InternalActivityArchitecture.g:2376:1: ( ( rule__ActivityNode__ActivationSourceAssignment_5_1_1 ) )
            {
            // InternalActivityArchitecture.g:2376:1: ( ( rule__ActivityNode__ActivationSourceAssignment_5_1_1 ) )
            // InternalActivityArchitecture.g:2377:2: ( rule__ActivityNode__ActivationSourceAssignment_5_1_1 )
            {
             before(grammarAccess.getActivityNodeAccess().getActivationSourceAssignment_5_1_1()); 
            // InternalActivityArchitecture.g:2378:2: ( rule__ActivityNode__ActivationSourceAssignment_5_1_1 )
            // InternalActivityArchitecture.g:2378:3: rule__ActivityNode__ActivationSourceAssignment_5_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__ActivationSourceAssignment_5_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getActivationSourceAssignment_5_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_1__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5_2__0"
    // InternalActivityArchitecture.g:2387:1: rule__ActivityNode__Group_5_2__0 : rule__ActivityNode__Group_5_2__0__Impl rule__ActivityNode__Group_5_2__1 ;
    public final void rule__ActivityNode__Group_5_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2391:1: ( rule__ActivityNode__Group_5_2__0__Impl rule__ActivityNode__Group_5_2__1 )
            // InternalActivityArchitecture.g:2392:2: rule__ActivityNode__Group_5_2__0__Impl rule__ActivityNode__Group_5_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ActivityNode__Group_5_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_2__0"


    // $ANTLR start "rule__ActivityNode__Group_5_2__0__Impl"
    // InternalActivityArchitecture.g:2399:1: rule__ActivityNode__Group_5_2__0__Impl : ( 'executionTime' ) ;
    public final void rule__ActivityNode__Group_5_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2403:1: ( ( 'executionTime' ) )
            // InternalActivityArchitecture.g:2404:1: ( 'executionTime' )
            {
            // InternalActivityArchitecture.g:2404:1: ( 'executionTime' )
            // InternalActivityArchitecture.g:2405:2: 'executionTime'
            {
             before(grammarAccess.getActivityNodeAccess().getExecutionTimeKeyword_5_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getExecutionTimeKeyword_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_2__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5_2__1"
    // InternalActivityArchitecture.g:2414:1: rule__ActivityNode__Group_5_2__1 : rule__ActivityNode__Group_5_2__1__Impl ;
    public final void rule__ActivityNode__Group_5_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2418:1: ( rule__ActivityNode__Group_5_2__1__Impl )
            // InternalActivityArchitecture.g:2419:2: rule__ActivityNode__Group_5_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_2__1"


    // $ANTLR start "rule__ActivityNode__Group_5_2__1__Impl"
    // InternalActivityArchitecture.g:2425:1: rule__ActivityNode__Group_5_2__1__Impl : ( ( rule__ActivityNode__ExecutionTimeAssignment_5_2_1 ) ) ;
    public final void rule__ActivityNode__Group_5_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2429:1: ( ( ( rule__ActivityNode__ExecutionTimeAssignment_5_2_1 ) ) )
            // InternalActivityArchitecture.g:2430:1: ( ( rule__ActivityNode__ExecutionTimeAssignment_5_2_1 ) )
            {
            // InternalActivityArchitecture.g:2430:1: ( ( rule__ActivityNode__ExecutionTimeAssignment_5_2_1 ) )
            // InternalActivityArchitecture.g:2431:2: ( rule__ActivityNode__ExecutionTimeAssignment_5_2_1 )
            {
             before(grammarAccess.getActivityNodeAccess().getExecutionTimeAssignment_5_2_1()); 
            // InternalActivityArchitecture.g:2432:2: ( rule__ActivityNode__ExecutionTimeAssignment_5_2_1 )
            // InternalActivityArchitecture.g:2432:3: rule__ActivityNode__ExecutionTimeAssignment_5_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__ExecutionTimeAssignment_5_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getExecutionTimeAssignment_5_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_2__1__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5_3__0"
    // InternalActivityArchitecture.g:2441:1: rule__ActivityNode__Group_5_3__0 : rule__ActivityNode__Group_5_3__0__Impl rule__ActivityNode__Group_5_3__1 ;
    public final void rule__ActivityNode__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2445:1: ( rule__ActivityNode__Group_5_3__0__Impl rule__ActivityNode__Group_5_3__1 )
            // InternalActivityArchitecture.g:2446:2: rule__ActivityNode__Group_5_3__0__Impl rule__ActivityNode__Group_5_3__1
            {
            pushFollow(FOLLOW_5);
            rule__ActivityNode__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_3__0"


    // $ANTLR start "rule__ActivityNode__Group_5_3__0__Impl"
    // InternalActivityArchitecture.g:2453:1: rule__ActivityNode__Group_5_3__0__Impl : ( 'scheduler' ) ;
    public final void rule__ActivityNode__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2457:1: ( ( 'scheduler' ) )
            // InternalActivityArchitecture.g:2458:1: ( 'scheduler' )
            {
            // InternalActivityArchitecture.g:2458:1: ( 'scheduler' )
            // InternalActivityArchitecture.g:2459:2: 'scheduler'
            {
             before(grammarAccess.getActivityNodeAccess().getSchedulerKeyword_5_3_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getSchedulerKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_3__0__Impl"


    // $ANTLR start "rule__ActivityNode__Group_5_3__1"
    // InternalActivityArchitecture.g:2468:1: rule__ActivityNode__Group_5_3__1 : rule__ActivityNode__Group_5_3__1__Impl ;
    public final void rule__ActivityNode__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2472:1: ( rule__ActivityNode__Group_5_3__1__Impl )
            // InternalActivityArchitecture.g:2473:2: rule__ActivityNode__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_3__1"


    // $ANTLR start "rule__ActivityNode__Group_5_3__1__Impl"
    // InternalActivityArchitecture.g:2479:1: rule__ActivityNode__Group_5_3__1__Impl : ( ( rule__ActivityNode__SchedulerAssignment_5_3_1 ) ) ;
    public final void rule__ActivityNode__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2483:1: ( ( ( rule__ActivityNode__SchedulerAssignment_5_3_1 ) ) )
            // InternalActivityArchitecture.g:2484:1: ( ( rule__ActivityNode__SchedulerAssignment_5_3_1 ) )
            {
            // InternalActivityArchitecture.g:2484:1: ( ( rule__ActivityNode__SchedulerAssignment_5_3_1 ) )
            // InternalActivityArchitecture.g:2485:2: ( rule__ActivityNode__SchedulerAssignment_5_3_1 )
            {
             before(grammarAccess.getActivityNodeAccess().getSchedulerAssignment_5_3_1()); 
            // InternalActivityArchitecture.g:2486:2: ( rule__ActivityNode__SchedulerAssignment_5_3_1 )
            // InternalActivityArchitecture.g:2486:3: rule__ActivityNode__SchedulerAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__SchedulerAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityNodeAccess().getSchedulerAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__Group_5_3__1__Impl"


    // $ANTLR start "rule__RegisterInputNode__Group__0"
    // InternalActivityArchitecture.g:2495:1: rule__RegisterInputNode__Group__0 : rule__RegisterInputNode__Group__0__Impl rule__RegisterInputNode__Group__1 ;
    public final void rule__RegisterInputNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2499:1: ( rule__RegisterInputNode__Group__0__Impl rule__RegisterInputNode__Group__1 )
            // InternalActivityArchitecture.g:2500:2: rule__RegisterInputNode__Group__0__Impl rule__RegisterInputNode__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__RegisterInputNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisterInputNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterInputNode__Group__0"


    // $ANTLR start "rule__RegisterInputNode__Group__0__Impl"
    // InternalActivityArchitecture.g:2507:1: rule__RegisterInputNode__Group__0__Impl : ( () ) ;
    public final void rule__RegisterInputNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2511:1: ( ( () ) )
            // InternalActivityArchitecture.g:2512:1: ( () )
            {
            // InternalActivityArchitecture.g:2512:1: ( () )
            // InternalActivityArchitecture.g:2513:2: ()
            {
             before(grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeAction_0()); 
            // InternalActivityArchitecture.g:2514:2: ()
            // InternalActivityArchitecture.g:2514:3: 
            {
            }

             after(grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterInputNode__Group__0__Impl"


    // $ANTLR start "rule__RegisterInputNode__Group__1"
    // InternalActivityArchitecture.g:2522:1: rule__RegisterInputNode__Group__1 : rule__RegisterInputNode__Group__1__Impl rule__RegisterInputNode__Group__2 ;
    public final void rule__RegisterInputNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2526:1: ( rule__RegisterInputNode__Group__1__Impl rule__RegisterInputNode__Group__2 )
            // InternalActivityArchitecture.g:2527:2: rule__RegisterInputNode__Group__1__Impl rule__RegisterInputNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__RegisterInputNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisterInputNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterInputNode__Group__1"


    // $ANTLR start "rule__RegisterInputNode__Group__1__Impl"
    // InternalActivityArchitecture.g:2534:1: rule__RegisterInputNode__Group__1__Impl : ( 'RegisterInputNode' ) ;
    public final void rule__RegisterInputNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2538:1: ( ( 'RegisterInputNode' ) )
            // InternalActivityArchitecture.g:2539:1: ( 'RegisterInputNode' )
            {
            // InternalActivityArchitecture.g:2539:1: ( 'RegisterInputNode' )
            // InternalActivityArchitecture.g:2540:2: 'RegisterInputNode'
            {
             before(grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getRegisterInputNodeAccess().getRegisterInputNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterInputNode__Group__1__Impl"


    // $ANTLR start "rule__RegisterInputNode__Group__2"
    // InternalActivityArchitecture.g:2549:1: rule__RegisterInputNode__Group__2 : rule__RegisterInputNode__Group__2__Impl rule__RegisterInputNode__Group__3 ;
    public final void rule__RegisterInputNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2553:1: ( rule__RegisterInputNode__Group__2__Impl rule__RegisterInputNode__Group__3 )
            // InternalActivityArchitecture.g:2554:2: rule__RegisterInputNode__Group__2__Impl rule__RegisterInputNode__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__RegisterInputNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RegisterInputNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterInputNode__Group__2"


    // $ANTLR start "rule__RegisterInputNode__Group__2__Impl"
    // InternalActivityArchitecture.g:2561:1: rule__RegisterInputNode__Group__2__Impl : ( ( rule__RegisterInputNode__NameAssignment_2 ) ) ;
    public final void rule__RegisterInputNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2565:1: ( ( ( rule__RegisterInputNode__NameAssignment_2 ) ) )
            // InternalActivityArchitecture.g:2566:1: ( ( rule__RegisterInputNode__NameAssignment_2 ) )
            {
            // InternalActivityArchitecture.g:2566:1: ( ( rule__RegisterInputNode__NameAssignment_2 ) )
            // InternalActivityArchitecture.g:2567:2: ( rule__RegisterInputNode__NameAssignment_2 )
            {
             before(grammarAccess.getRegisterInputNodeAccess().getNameAssignment_2()); 
            // InternalActivityArchitecture.g:2568:2: ( rule__RegisterInputNode__NameAssignment_2 )
            // InternalActivityArchitecture.g:2568:3: rule__RegisterInputNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RegisterInputNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRegisterInputNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterInputNode__Group__2__Impl"


    // $ANTLR start "rule__RegisterInputNode__Group__3"
    // InternalActivityArchitecture.g:2576:1: rule__RegisterInputNode__Group__3 : rule__RegisterInputNode__Group__3__Impl ;
    public final void rule__RegisterInputNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2580:1: ( rule__RegisterInputNode__Group__3__Impl )
            // InternalActivityArchitecture.g:2581:2: rule__RegisterInputNode__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RegisterInputNode__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterInputNode__Group__3"


    // $ANTLR start "rule__RegisterInputNode__Group__3__Impl"
    // InternalActivityArchitecture.g:2587:1: rule__RegisterInputNode__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__RegisterInputNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2591:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:2592:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:2592:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:2593:2: ( ';' )?
            {
             before(grammarAccess.getRegisterInputNodeAccess().getSemicolonKeyword_3()); 
            // InternalActivityArchitecture.g:2594:2: ( ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalActivityArchitecture.g:2594:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRegisterInputNodeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterInputNode__Group__3__Impl"


    // $ANTLR start "rule__TriggerInputNode__Group__0"
    // InternalActivityArchitecture.g:2603:1: rule__TriggerInputNode__Group__0 : rule__TriggerInputNode__Group__0__Impl rule__TriggerInputNode__Group__1 ;
    public final void rule__TriggerInputNode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2607:1: ( rule__TriggerInputNode__Group__0__Impl rule__TriggerInputNode__Group__1 )
            // InternalActivityArchitecture.g:2608:2: rule__TriggerInputNode__Group__0__Impl rule__TriggerInputNode__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__TriggerInputNode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerInputNode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerInputNode__Group__0"


    // $ANTLR start "rule__TriggerInputNode__Group__0__Impl"
    // InternalActivityArchitecture.g:2615:1: rule__TriggerInputNode__Group__0__Impl : ( () ) ;
    public final void rule__TriggerInputNode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2619:1: ( ( () ) )
            // InternalActivityArchitecture.g:2620:1: ( () )
            {
            // InternalActivityArchitecture.g:2620:1: ( () )
            // InternalActivityArchitecture.g:2621:2: ()
            {
             before(grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeAction_0()); 
            // InternalActivityArchitecture.g:2622:2: ()
            // InternalActivityArchitecture.g:2622:3: 
            {
            }

             after(grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerInputNode__Group__0__Impl"


    // $ANTLR start "rule__TriggerInputNode__Group__1"
    // InternalActivityArchitecture.g:2630:1: rule__TriggerInputNode__Group__1 : rule__TriggerInputNode__Group__1__Impl rule__TriggerInputNode__Group__2 ;
    public final void rule__TriggerInputNode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2634:1: ( rule__TriggerInputNode__Group__1__Impl rule__TriggerInputNode__Group__2 )
            // InternalActivityArchitecture.g:2635:2: rule__TriggerInputNode__Group__1__Impl rule__TriggerInputNode__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TriggerInputNode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerInputNode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerInputNode__Group__1"


    // $ANTLR start "rule__TriggerInputNode__Group__1__Impl"
    // InternalActivityArchitecture.g:2642:1: rule__TriggerInputNode__Group__1__Impl : ( 'TriggerInputNode' ) ;
    public final void rule__TriggerInputNode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2646:1: ( ( 'TriggerInputNode' ) )
            // InternalActivityArchitecture.g:2647:1: ( 'TriggerInputNode' )
            {
            // InternalActivityArchitecture.g:2647:1: ( 'TriggerInputNode' )
            // InternalActivityArchitecture.g:2648:2: 'TriggerInputNode'
            {
             before(grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeKeyword_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getTriggerInputNodeAccess().getTriggerInputNodeKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerInputNode__Group__1__Impl"


    // $ANTLR start "rule__TriggerInputNode__Group__2"
    // InternalActivityArchitecture.g:2657:1: rule__TriggerInputNode__Group__2 : rule__TriggerInputNode__Group__2__Impl rule__TriggerInputNode__Group__3 ;
    public final void rule__TriggerInputNode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2661:1: ( rule__TriggerInputNode__Group__2__Impl rule__TriggerInputNode__Group__3 )
            // InternalActivityArchitecture.g:2662:2: rule__TriggerInputNode__Group__2__Impl rule__TriggerInputNode__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__TriggerInputNode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TriggerInputNode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerInputNode__Group__2"


    // $ANTLR start "rule__TriggerInputNode__Group__2__Impl"
    // InternalActivityArchitecture.g:2669:1: rule__TriggerInputNode__Group__2__Impl : ( ( rule__TriggerInputNode__NameAssignment_2 ) ) ;
    public final void rule__TriggerInputNode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2673:1: ( ( ( rule__TriggerInputNode__NameAssignment_2 ) ) )
            // InternalActivityArchitecture.g:2674:1: ( ( rule__TriggerInputNode__NameAssignment_2 ) )
            {
            // InternalActivityArchitecture.g:2674:1: ( ( rule__TriggerInputNode__NameAssignment_2 ) )
            // InternalActivityArchitecture.g:2675:2: ( rule__TriggerInputNode__NameAssignment_2 )
            {
             before(grammarAccess.getTriggerInputNodeAccess().getNameAssignment_2()); 
            // InternalActivityArchitecture.g:2676:2: ( rule__TriggerInputNode__NameAssignment_2 )
            // InternalActivityArchitecture.g:2676:3: rule__TriggerInputNode__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__TriggerInputNode__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTriggerInputNodeAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerInputNode__Group__2__Impl"


    // $ANTLR start "rule__TriggerInputNode__Group__3"
    // InternalActivityArchitecture.g:2684:1: rule__TriggerInputNode__Group__3 : rule__TriggerInputNode__Group__3__Impl ;
    public final void rule__TriggerInputNode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2688:1: ( rule__TriggerInputNode__Group__3__Impl )
            // InternalActivityArchitecture.g:2689:2: rule__TriggerInputNode__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TriggerInputNode__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerInputNode__Group__3"


    // $ANTLR start "rule__TriggerInputNode__Group__3__Impl"
    // InternalActivityArchitecture.g:2695:1: rule__TriggerInputNode__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__TriggerInputNode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2699:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:2700:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:2700:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:2701:2: ( ';' )?
            {
             before(grammarAccess.getTriggerInputNodeAccess().getSemicolonKeyword_3()); 
            // InternalActivityArchitecture.g:2702:2: ( ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalActivityArchitecture.g:2702:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTriggerInputNodeAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerInputNode__Group__3__Impl"


    // $ANTLR start "rule__Sporadic__Group__0"
    // InternalActivityArchitecture.g:2711:1: rule__Sporadic__Group__0 : rule__Sporadic__Group__0__Impl rule__Sporadic__Group__1 ;
    public final void rule__Sporadic__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2715:1: ( rule__Sporadic__Group__0__Impl rule__Sporadic__Group__1 )
            // InternalActivityArchitecture.g:2716:2: rule__Sporadic__Group__0__Impl rule__Sporadic__Group__1
            {
            pushFollow(FOLLOW_28);
            rule__Sporadic__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sporadic__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group__0"


    // $ANTLR start "rule__Sporadic__Group__0__Impl"
    // InternalActivityArchitecture.g:2723:1: rule__Sporadic__Group__0__Impl : ( () ) ;
    public final void rule__Sporadic__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2727:1: ( ( () ) )
            // InternalActivityArchitecture.g:2728:1: ( () )
            {
            // InternalActivityArchitecture.g:2728:1: ( () )
            // InternalActivityArchitecture.g:2729:2: ()
            {
             before(grammarAccess.getSporadicAccess().getSporadicAction_0()); 
            // InternalActivityArchitecture.g:2730:2: ()
            // InternalActivityArchitecture.g:2730:3: 
            {
            }

             after(grammarAccess.getSporadicAccess().getSporadicAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group__0__Impl"


    // $ANTLR start "rule__Sporadic__Group__1"
    // InternalActivityArchitecture.g:2738:1: rule__Sporadic__Group__1 : rule__Sporadic__Group__1__Impl rule__Sporadic__Group__2 ;
    public final void rule__Sporadic__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2742:1: ( rule__Sporadic__Group__1__Impl rule__Sporadic__Group__2 )
            // InternalActivityArchitecture.g:2743:2: rule__Sporadic__Group__1__Impl rule__Sporadic__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Sporadic__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sporadic__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group__1"


    // $ANTLR start "rule__Sporadic__Group__1__Impl"
    // InternalActivityArchitecture.g:2750:1: rule__Sporadic__Group__1__Impl : ( 'Sporadic' ) ;
    public final void rule__Sporadic__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2754:1: ( ( 'Sporadic' ) )
            // InternalActivityArchitecture.g:2755:1: ( 'Sporadic' )
            {
            // InternalActivityArchitecture.g:2755:1: ( 'Sporadic' )
            // InternalActivityArchitecture.g:2756:2: 'Sporadic'
            {
             before(grammarAccess.getSporadicAccess().getSporadicKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSporadicAccess().getSporadicKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group__1__Impl"


    // $ANTLR start "rule__Sporadic__Group__2"
    // InternalActivityArchitecture.g:2765:1: rule__Sporadic__Group__2 : rule__Sporadic__Group__2__Impl rule__Sporadic__Group__3 ;
    public final void rule__Sporadic__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2769:1: ( rule__Sporadic__Group__2__Impl rule__Sporadic__Group__3 )
            // InternalActivityArchitecture.g:2770:2: rule__Sporadic__Group__2__Impl rule__Sporadic__Group__3
            {
            pushFollow(FOLLOW_29);
            rule__Sporadic__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sporadic__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group__2"


    // $ANTLR start "rule__Sporadic__Group__2__Impl"
    // InternalActivityArchitecture.g:2777:1: rule__Sporadic__Group__2__Impl : ( '{' ) ;
    public final void rule__Sporadic__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2781:1: ( ( '{' ) )
            // InternalActivityArchitecture.g:2782:1: ( '{' )
            {
            // InternalActivityArchitecture.g:2782:1: ( '{' )
            // InternalActivityArchitecture.g:2783:2: '{'
            {
             before(grammarAccess.getSporadicAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSporadicAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group__2__Impl"


    // $ANTLR start "rule__Sporadic__Group__3"
    // InternalActivityArchitecture.g:2792:1: rule__Sporadic__Group__3 : rule__Sporadic__Group__3__Impl rule__Sporadic__Group__4 ;
    public final void rule__Sporadic__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2796:1: ( rule__Sporadic__Group__3__Impl rule__Sporadic__Group__4 )
            // InternalActivityArchitecture.g:2797:2: rule__Sporadic__Group__3__Impl rule__Sporadic__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Sporadic__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sporadic__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group__3"


    // $ANTLR start "rule__Sporadic__Group__3__Impl"
    // InternalActivityArchitecture.g:2804:1: rule__Sporadic__Group__3__Impl : ( ( rule__Sporadic__UnorderedGroup_3 ) ) ;
    public final void rule__Sporadic__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2808:1: ( ( ( rule__Sporadic__UnorderedGroup_3 ) ) )
            // InternalActivityArchitecture.g:2809:1: ( ( rule__Sporadic__UnorderedGroup_3 ) )
            {
            // InternalActivityArchitecture.g:2809:1: ( ( rule__Sporadic__UnorderedGroup_3 ) )
            // InternalActivityArchitecture.g:2810:2: ( rule__Sporadic__UnorderedGroup_3 )
            {
             before(grammarAccess.getSporadicAccess().getUnorderedGroup_3()); 
            // InternalActivityArchitecture.g:2811:2: ( rule__Sporadic__UnorderedGroup_3 )
            // InternalActivityArchitecture.g:2811:3: rule__Sporadic__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__Sporadic__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getSporadicAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group__3__Impl"


    // $ANTLR start "rule__Sporadic__Group__4"
    // InternalActivityArchitecture.g:2819:1: rule__Sporadic__Group__4 : rule__Sporadic__Group__4__Impl ;
    public final void rule__Sporadic__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2823:1: ( rule__Sporadic__Group__4__Impl )
            // InternalActivityArchitecture.g:2824:2: rule__Sporadic__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sporadic__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group__4"


    // $ANTLR start "rule__Sporadic__Group__4__Impl"
    // InternalActivityArchitecture.g:2830:1: rule__Sporadic__Group__4__Impl : ( '}' ) ;
    public final void rule__Sporadic__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2834:1: ( ( '}' ) )
            // InternalActivityArchitecture.g:2835:1: ( '}' )
            {
            // InternalActivityArchitecture.g:2835:1: ( '}' )
            // InternalActivityArchitecture.g:2836:2: '}'
            {
             before(grammarAccess.getSporadicAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSporadicAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group__4__Impl"


    // $ANTLR start "rule__Sporadic__Group_3_0__0"
    // InternalActivityArchitecture.g:2846:1: rule__Sporadic__Group_3_0__0 : rule__Sporadic__Group_3_0__0__Impl rule__Sporadic__Group_3_0__1 ;
    public final void rule__Sporadic__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2850:1: ( rule__Sporadic__Group_3_0__0__Impl rule__Sporadic__Group_3_0__1 )
            // InternalActivityArchitecture.g:2851:2: rule__Sporadic__Group_3_0__0__Impl rule__Sporadic__Group_3_0__1
            {
            pushFollow(FOLLOW_30);
            rule__Sporadic__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sporadic__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_0__0"


    // $ANTLR start "rule__Sporadic__Group_3_0__0__Impl"
    // InternalActivityArchitecture.g:2858:1: rule__Sporadic__Group_3_0__0__Impl : ( 'minActFreq' ) ;
    public final void rule__Sporadic__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2862:1: ( ( 'minActFreq' ) )
            // InternalActivityArchitecture.g:2863:1: ( 'minActFreq' )
            {
            // InternalActivityArchitecture.g:2863:1: ( 'minActFreq' )
            // InternalActivityArchitecture.g:2864:2: 'minActFreq'
            {
             before(grammarAccess.getSporadicAccess().getMinActFreqKeyword_3_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSporadicAccess().getMinActFreqKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_0__0__Impl"


    // $ANTLR start "rule__Sporadic__Group_3_0__1"
    // InternalActivityArchitecture.g:2873:1: rule__Sporadic__Group_3_0__1 : rule__Sporadic__Group_3_0__1__Impl rule__Sporadic__Group_3_0__2 ;
    public final void rule__Sporadic__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2877:1: ( rule__Sporadic__Group_3_0__1__Impl rule__Sporadic__Group_3_0__2 )
            // InternalActivityArchitecture.g:2878:2: rule__Sporadic__Group_3_0__1__Impl rule__Sporadic__Group_3_0__2
            {
            pushFollow(FOLLOW_31);
            rule__Sporadic__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sporadic__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_0__1"


    // $ANTLR start "rule__Sporadic__Group_3_0__1__Impl"
    // InternalActivityArchitecture.g:2885:1: rule__Sporadic__Group_3_0__1__Impl : ( ( rule__Sporadic__MinActFreqAssignment_3_0_1 ) ) ;
    public final void rule__Sporadic__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2889:1: ( ( ( rule__Sporadic__MinActFreqAssignment_3_0_1 ) ) )
            // InternalActivityArchitecture.g:2890:1: ( ( rule__Sporadic__MinActFreqAssignment_3_0_1 ) )
            {
            // InternalActivityArchitecture.g:2890:1: ( ( rule__Sporadic__MinActFreqAssignment_3_0_1 ) )
            // InternalActivityArchitecture.g:2891:2: ( rule__Sporadic__MinActFreqAssignment_3_0_1 )
            {
             before(grammarAccess.getSporadicAccess().getMinActFreqAssignment_3_0_1()); 
            // InternalActivityArchitecture.g:2892:2: ( rule__Sporadic__MinActFreqAssignment_3_0_1 )
            // InternalActivityArchitecture.g:2892:3: rule__Sporadic__MinActFreqAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Sporadic__MinActFreqAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSporadicAccess().getMinActFreqAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_0__1__Impl"


    // $ANTLR start "rule__Sporadic__Group_3_0__2"
    // InternalActivityArchitecture.g:2900:1: rule__Sporadic__Group_3_0__2 : rule__Sporadic__Group_3_0__2__Impl rule__Sporadic__Group_3_0__3 ;
    public final void rule__Sporadic__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2904:1: ( rule__Sporadic__Group_3_0__2__Impl rule__Sporadic__Group_3_0__3 )
            // InternalActivityArchitecture.g:2905:2: rule__Sporadic__Group_3_0__2__Impl rule__Sporadic__Group_3_0__3
            {
            pushFollow(FOLLOW_20);
            rule__Sporadic__Group_3_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sporadic__Group_3_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_0__2"


    // $ANTLR start "rule__Sporadic__Group_3_0__2__Impl"
    // InternalActivityArchitecture.g:2912:1: rule__Sporadic__Group_3_0__2__Impl : ( 'Hz' ) ;
    public final void rule__Sporadic__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2916:1: ( ( 'Hz' ) )
            // InternalActivityArchitecture.g:2917:1: ( 'Hz' )
            {
            // InternalActivityArchitecture.g:2917:1: ( 'Hz' )
            // InternalActivityArchitecture.g:2918:2: 'Hz'
            {
             before(grammarAccess.getSporadicAccess().getHzKeyword_3_0_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSporadicAccess().getHzKeyword_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_0__2__Impl"


    // $ANTLR start "rule__Sporadic__Group_3_0__3"
    // InternalActivityArchitecture.g:2927:1: rule__Sporadic__Group_3_0__3 : rule__Sporadic__Group_3_0__3__Impl ;
    public final void rule__Sporadic__Group_3_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2931:1: ( rule__Sporadic__Group_3_0__3__Impl )
            // InternalActivityArchitecture.g:2932:2: rule__Sporadic__Group_3_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sporadic__Group_3_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_0__3"


    // $ANTLR start "rule__Sporadic__Group_3_0__3__Impl"
    // InternalActivityArchitecture.g:2938:1: rule__Sporadic__Group_3_0__3__Impl : ( ( ';' )? ) ;
    public final void rule__Sporadic__Group_3_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2942:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:2943:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:2943:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:2944:2: ( ';' )?
            {
             before(grammarAccess.getSporadicAccess().getSemicolonKeyword_3_0_3()); 
            // InternalActivityArchitecture.g:2945:2: ( ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==31) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalActivityArchitecture.g:2945:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSporadicAccess().getSemicolonKeyword_3_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_0__3__Impl"


    // $ANTLR start "rule__Sporadic__Group_3_1__0"
    // InternalActivityArchitecture.g:2954:1: rule__Sporadic__Group_3_1__0 : rule__Sporadic__Group_3_1__0__Impl rule__Sporadic__Group_3_1__1 ;
    public final void rule__Sporadic__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2958:1: ( rule__Sporadic__Group_3_1__0__Impl rule__Sporadic__Group_3_1__1 )
            // InternalActivityArchitecture.g:2959:2: rule__Sporadic__Group_3_1__0__Impl rule__Sporadic__Group_3_1__1
            {
            pushFollow(FOLLOW_30);
            rule__Sporadic__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sporadic__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_1__0"


    // $ANTLR start "rule__Sporadic__Group_3_1__0__Impl"
    // InternalActivityArchitecture.g:2966:1: rule__Sporadic__Group_3_1__0__Impl : ( 'maxActFreq' ) ;
    public final void rule__Sporadic__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2970:1: ( ( 'maxActFreq' ) )
            // InternalActivityArchitecture.g:2971:1: ( 'maxActFreq' )
            {
            // InternalActivityArchitecture.g:2971:1: ( 'maxActFreq' )
            // InternalActivityArchitecture.g:2972:2: 'maxActFreq'
            {
             before(grammarAccess.getSporadicAccess().getMaxActFreqKeyword_3_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSporadicAccess().getMaxActFreqKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_1__0__Impl"


    // $ANTLR start "rule__Sporadic__Group_3_1__1"
    // InternalActivityArchitecture.g:2981:1: rule__Sporadic__Group_3_1__1 : rule__Sporadic__Group_3_1__1__Impl rule__Sporadic__Group_3_1__2 ;
    public final void rule__Sporadic__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2985:1: ( rule__Sporadic__Group_3_1__1__Impl rule__Sporadic__Group_3_1__2 )
            // InternalActivityArchitecture.g:2986:2: rule__Sporadic__Group_3_1__1__Impl rule__Sporadic__Group_3_1__2
            {
            pushFollow(FOLLOW_31);
            rule__Sporadic__Group_3_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sporadic__Group_3_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_1__1"


    // $ANTLR start "rule__Sporadic__Group_3_1__1__Impl"
    // InternalActivityArchitecture.g:2993:1: rule__Sporadic__Group_3_1__1__Impl : ( ( rule__Sporadic__MaxActFreqAssignment_3_1_1 ) ) ;
    public final void rule__Sporadic__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:2997:1: ( ( ( rule__Sporadic__MaxActFreqAssignment_3_1_1 ) ) )
            // InternalActivityArchitecture.g:2998:1: ( ( rule__Sporadic__MaxActFreqAssignment_3_1_1 ) )
            {
            // InternalActivityArchitecture.g:2998:1: ( ( rule__Sporadic__MaxActFreqAssignment_3_1_1 ) )
            // InternalActivityArchitecture.g:2999:2: ( rule__Sporadic__MaxActFreqAssignment_3_1_1 )
            {
             before(grammarAccess.getSporadicAccess().getMaxActFreqAssignment_3_1_1()); 
            // InternalActivityArchitecture.g:3000:2: ( rule__Sporadic__MaxActFreqAssignment_3_1_1 )
            // InternalActivityArchitecture.g:3000:3: rule__Sporadic__MaxActFreqAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Sporadic__MaxActFreqAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSporadicAccess().getMaxActFreqAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_1__1__Impl"


    // $ANTLR start "rule__Sporadic__Group_3_1__2"
    // InternalActivityArchitecture.g:3008:1: rule__Sporadic__Group_3_1__2 : rule__Sporadic__Group_3_1__2__Impl rule__Sporadic__Group_3_1__3 ;
    public final void rule__Sporadic__Group_3_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3012:1: ( rule__Sporadic__Group_3_1__2__Impl rule__Sporadic__Group_3_1__3 )
            // InternalActivityArchitecture.g:3013:2: rule__Sporadic__Group_3_1__2__Impl rule__Sporadic__Group_3_1__3
            {
            pushFollow(FOLLOW_20);
            rule__Sporadic__Group_3_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sporadic__Group_3_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_1__2"


    // $ANTLR start "rule__Sporadic__Group_3_1__2__Impl"
    // InternalActivityArchitecture.g:3020:1: rule__Sporadic__Group_3_1__2__Impl : ( 'Hz' ) ;
    public final void rule__Sporadic__Group_3_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3024:1: ( ( 'Hz' ) )
            // InternalActivityArchitecture.g:3025:1: ( 'Hz' )
            {
            // InternalActivityArchitecture.g:3025:1: ( 'Hz' )
            // InternalActivityArchitecture.g:3026:2: 'Hz'
            {
             before(grammarAccess.getSporadicAccess().getHzKeyword_3_1_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSporadicAccess().getHzKeyword_3_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_1__2__Impl"


    // $ANTLR start "rule__Sporadic__Group_3_1__3"
    // InternalActivityArchitecture.g:3035:1: rule__Sporadic__Group_3_1__3 : rule__Sporadic__Group_3_1__3__Impl ;
    public final void rule__Sporadic__Group_3_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3039:1: ( rule__Sporadic__Group_3_1__3__Impl )
            // InternalActivityArchitecture.g:3040:2: rule__Sporadic__Group_3_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sporadic__Group_3_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_1__3"


    // $ANTLR start "rule__Sporadic__Group_3_1__3__Impl"
    // InternalActivityArchitecture.g:3046:1: rule__Sporadic__Group_3_1__3__Impl : ( ( ';' )? ) ;
    public final void rule__Sporadic__Group_3_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3050:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:3051:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:3051:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:3052:2: ( ';' )?
            {
             before(grammarAccess.getSporadicAccess().getSemicolonKeyword_3_1_3()); 
            // InternalActivityArchitecture.g:3053:2: ( ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==31) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalActivityArchitecture.g:3053:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSporadicAccess().getSemicolonKeyword_3_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__Group_3_1__3__Impl"


    // $ANTLR start "rule__DataTriggered__Group__0"
    // InternalActivityArchitecture.g:3062:1: rule__DataTriggered__Group__0 : rule__DataTriggered__Group__0__Impl rule__DataTriggered__Group__1 ;
    public final void rule__DataTriggered__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3066:1: ( rule__DataTriggered__Group__0__Impl rule__DataTriggered__Group__1 )
            // InternalActivityArchitecture.g:3067:2: rule__DataTriggered__Group__0__Impl rule__DataTriggered__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__DataTriggered__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTriggered__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__0"


    // $ANTLR start "rule__DataTriggered__Group__0__Impl"
    // InternalActivityArchitecture.g:3074:1: rule__DataTriggered__Group__0__Impl : ( 'DataTriggered' ) ;
    public final void rule__DataTriggered__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3078:1: ( ( 'DataTriggered' ) )
            // InternalActivityArchitecture.g:3079:1: ( 'DataTriggered' )
            {
            // InternalActivityArchitecture.g:3079:1: ( 'DataTriggered' )
            // InternalActivityArchitecture.g:3080:2: 'DataTriggered'
            {
             before(grammarAccess.getDataTriggeredAccess().getDataTriggeredKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getDataTriggeredAccess().getDataTriggeredKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__0__Impl"


    // $ANTLR start "rule__DataTriggered__Group__1"
    // InternalActivityArchitecture.g:3089:1: rule__DataTriggered__Group__1 : rule__DataTriggered__Group__1__Impl rule__DataTriggered__Group__2 ;
    public final void rule__DataTriggered__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3093:1: ( rule__DataTriggered__Group__1__Impl rule__DataTriggered__Group__2 )
            // InternalActivityArchitecture.g:3094:2: rule__DataTriggered__Group__1__Impl rule__DataTriggered__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__DataTriggered__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTriggered__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__1"


    // $ANTLR start "rule__DataTriggered__Group__1__Impl"
    // InternalActivityArchitecture.g:3101:1: rule__DataTriggered__Group__1__Impl : ( ( rule__DataTriggered__TriggerRefAssignment_1 ) ) ;
    public final void rule__DataTriggered__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3105:1: ( ( ( rule__DataTriggered__TriggerRefAssignment_1 ) ) )
            // InternalActivityArchitecture.g:3106:1: ( ( rule__DataTriggered__TriggerRefAssignment_1 ) )
            {
            // InternalActivityArchitecture.g:3106:1: ( ( rule__DataTriggered__TriggerRefAssignment_1 ) )
            // InternalActivityArchitecture.g:3107:2: ( rule__DataTriggered__TriggerRefAssignment_1 )
            {
             before(grammarAccess.getDataTriggeredAccess().getTriggerRefAssignment_1()); 
            // InternalActivityArchitecture.g:3108:2: ( rule__DataTriggered__TriggerRefAssignment_1 )
            // InternalActivityArchitecture.g:3108:3: rule__DataTriggered__TriggerRefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DataTriggered__TriggerRefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDataTriggeredAccess().getTriggerRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__1__Impl"


    // $ANTLR start "rule__DataTriggered__Group__2"
    // InternalActivityArchitecture.g:3116:1: rule__DataTriggered__Group__2 : rule__DataTriggered__Group__2__Impl rule__DataTriggered__Group__3 ;
    public final void rule__DataTriggered__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3120:1: ( rule__DataTriggered__Group__2__Impl rule__DataTriggered__Group__3 )
            // InternalActivityArchitecture.g:3121:2: rule__DataTriggered__Group__2__Impl rule__DataTriggered__Group__3
            {
            pushFollow(FOLLOW_32);
            rule__DataTriggered__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTriggered__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__2"


    // $ANTLR start "rule__DataTriggered__Group__2__Impl"
    // InternalActivityArchitecture.g:3128:1: rule__DataTriggered__Group__2__Impl : ( '{' ) ;
    public final void rule__DataTriggered__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3132:1: ( ( '{' ) )
            // InternalActivityArchitecture.g:3133:1: ( '{' )
            {
            // InternalActivityArchitecture.g:3133:1: ( '{' )
            // InternalActivityArchitecture.g:3134:2: '{'
            {
             before(grammarAccess.getDataTriggeredAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getDataTriggeredAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__2__Impl"


    // $ANTLR start "rule__DataTriggered__Group__3"
    // InternalActivityArchitecture.g:3143:1: rule__DataTriggered__Group__3 : rule__DataTriggered__Group__3__Impl rule__DataTriggered__Group__4 ;
    public final void rule__DataTriggered__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3147:1: ( rule__DataTriggered__Group__3__Impl rule__DataTriggered__Group__4 )
            // InternalActivityArchitecture.g:3148:2: rule__DataTriggered__Group__3__Impl rule__DataTriggered__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__DataTriggered__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTriggered__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__3"


    // $ANTLR start "rule__DataTriggered__Group__3__Impl"
    // InternalActivityArchitecture.g:3155:1: rule__DataTriggered__Group__3__Impl : ( 'prescale' ) ;
    public final void rule__DataTriggered__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3159:1: ( ( 'prescale' ) )
            // InternalActivityArchitecture.g:3160:1: ( 'prescale' )
            {
            // InternalActivityArchitecture.g:3160:1: ( 'prescale' )
            // InternalActivityArchitecture.g:3161:2: 'prescale'
            {
             before(grammarAccess.getDataTriggeredAccess().getPrescaleKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getDataTriggeredAccess().getPrescaleKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__3__Impl"


    // $ANTLR start "rule__DataTriggered__Group__4"
    // InternalActivityArchitecture.g:3170:1: rule__DataTriggered__Group__4 : rule__DataTriggered__Group__4__Impl rule__DataTriggered__Group__5 ;
    public final void rule__DataTriggered__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3174:1: ( rule__DataTriggered__Group__4__Impl rule__DataTriggered__Group__5 )
            // InternalActivityArchitecture.g:3175:2: rule__DataTriggered__Group__4__Impl rule__DataTriggered__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__DataTriggered__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTriggered__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__4"


    // $ANTLR start "rule__DataTriggered__Group__4__Impl"
    // InternalActivityArchitecture.g:3182:1: rule__DataTriggered__Group__4__Impl : ( ( rule__DataTriggered__PrescaleAssignment_4 ) ) ;
    public final void rule__DataTriggered__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3186:1: ( ( ( rule__DataTriggered__PrescaleAssignment_4 ) ) )
            // InternalActivityArchitecture.g:3187:1: ( ( rule__DataTriggered__PrescaleAssignment_4 ) )
            {
            // InternalActivityArchitecture.g:3187:1: ( ( rule__DataTriggered__PrescaleAssignment_4 ) )
            // InternalActivityArchitecture.g:3188:2: ( rule__DataTriggered__PrescaleAssignment_4 )
            {
             before(grammarAccess.getDataTriggeredAccess().getPrescaleAssignment_4()); 
            // InternalActivityArchitecture.g:3189:2: ( rule__DataTriggered__PrescaleAssignment_4 )
            // InternalActivityArchitecture.g:3189:3: rule__DataTriggered__PrescaleAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__DataTriggered__PrescaleAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getDataTriggeredAccess().getPrescaleAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__4__Impl"


    // $ANTLR start "rule__DataTriggered__Group__5"
    // InternalActivityArchitecture.g:3197:1: rule__DataTriggered__Group__5 : rule__DataTriggered__Group__5__Impl rule__DataTriggered__Group__6 ;
    public final void rule__DataTriggered__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3201:1: ( rule__DataTriggered__Group__5__Impl rule__DataTriggered__Group__6 )
            // InternalActivityArchitecture.g:3202:2: rule__DataTriggered__Group__5__Impl rule__DataTriggered__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__DataTriggered__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DataTriggered__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__5"


    // $ANTLR start "rule__DataTriggered__Group__5__Impl"
    // InternalActivityArchitecture.g:3209:1: rule__DataTriggered__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__DataTriggered__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3213:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:3214:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:3214:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:3215:2: ( ';' )?
            {
             before(grammarAccess.getDataTriggeredAccess().getSemicolonKeyword_5()); 
            // InternalActivityArchitecture.g:3216:2: ( ';' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalActivityArchitecture.g:3216:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDataTriggeredAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__5__Impl"


    // $ANTLR start "rule__DataTriggered__Group__6"
    // InternalActivityArchitecture.g:3224:1: rule__DataTriggered__Group__6 : rule__DataTriggered__Group__6__Impl ;
    public final void rule__DataTriggered__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3228:1: ( rule__DataTriggered__Group__6__Impl )
            // InternalActivityArchitecture.g:3229:2: rule__DataTriggered__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DataTriggered__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__6"


    // $ANTLR start "rule__DataTriggered__Group__6__Impl"
    // InternalActivityArchitecture.g:3235:1: rule__DataTriggered__Group__6__Impl : ( '}' ) ;
    public final void rule__DataTriggered__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3239:1: ( ( '}' ) )
            // InternalActivityArchitecture.g:3240:1: ( '}' )
            {
            // InternalActivityArchitecture.g:3240:1: ( '}' )
            // InternalActivityArchitecture.g:3241:2: '}'
            {
             before(grammarAccess.getDataTriggeredAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getDataTriggeredAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__Group__6__Impl"


    // $ANTLR start "rule__PeriodicTimer__Group__0"
    // InternalActivityArchitecture.g:3251:1: rule__PeriodicTimer__Group__0 : rule__PeriodicTimer__Group__0__Impl rule__PeriodicTimer__Group__1 ;
    public final void rule__PeriodicTimer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3255:1: ( rule__PeriodicTimer__Group__0__Impl rule__PeriodicTimer__Group__1 )
            // InternalActivityArchitecture.g:3256:2: rule__PeriodicTimer__Group__0__Impl rule__PeriodicTimer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PeriodicTimer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeriodicTimer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__0"


    // $ANTLR start "rule__PeriodicTimer__Group__0__Impl"
    // InternalActivityArchitecture.g:3263:1: rule__PeriodicTimer__Group__0__Impl : ( 'PeriodicTimer' ) ;
    public final void rule__PeriodicTimer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3267:1: ( ( 'PeriodicTimer' ) )
            // InternalActivityArchitecture.g:3268:1: ( 'PeriodicTimer' )
            {
            // InternalActivityArchitecture.g:3268:1: ( 'PeriodicTimer' )
            // InternalActivityArchitecture.g:3269:2: 'PeriodicTimer'
            {
             before(grammarAccess.getPeriodicTimerAccess().getPeriodicTimerKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPeriodicTimerAccess().getPeriodicTimerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__0__Impl"


    // $ANTLR start "rule__PeriodicTimer__Group__1"
    // InternalActivityArchitecture.g:3278:1: rule__PeriodicTimer__Group__1 : rule__PeriodicTimer__Group__1__Impl rule__PeriodicTimer__Group__2 ;
    public final void rule__PeriodicTimer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3282:1: ( rule__PeriodicTimer__Group__1__Impl rule__PeriodicTimer__Group__2 )
            // InternalActivityArchitecture.g:3283:2: rule__PeriodicTimer__Group__1__Impl rule__PeriodicTimer__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__PeriodicTimer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeriodicTimer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__1"


    // $ANTLR start "rule__PeriodicTimer__Group__1__Impl"
    // InternalActivityArchitecture.g:3290:1: rule__PeriodicTimer__Group__1__Impl : ( '{' ) ;
    public final void rule__PeriodicTimer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3294:1: ( ( '{' ) )
            // InternalActivityArchitecture.g:3295:1: ( '{' )
            {
            // InternalActivityArchitecture.g:3295:1: ( '{' )
            // InternalActivityArchitecture.g:3296:2: '{'
            {
             before(grammarAccess.getPeriodicTimerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPeriodicTimerAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__1__Impl"


    // $ANTLR start "rule__PeriodicTimer__Group__2"
    // InternalActivityArchitecture.g:3305:1: rule__PeriodicTimer__Group__2 : rule__PeriodicTimer__Group__2__Impl rule__PeriodicTimer__Group__3 ;
    public final void rule__PeriodicTimer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3309:1: ( rule__PeriodicTimer__Group__2__Impl rule__PeriodicTimer__Group__3 )
            // InternalActivityArchitecture.g:3310:2: rule__PeriodicTimer__Group__2__Impl rule__PeriodicTimer__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__PeriodicTimer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeriodicTimer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__2"


    // $ANTLR start "rule__PeriodicTimer__Group__2__Impl"
    // InternalActivityArchitecture.g:3317:1: rule__PeriodicTimer__Group__2__Impl : ( 'periodicActFreq' ) ;
    public final void rule__PeriodicTimer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3321:1: ( ( 'periodicActFreq' ) )
            // InternalActivityArchitecture.g:3322:1: ( 'periodicActFreq' )
            {
            // InternalActivityArchitecture.g:3322:1: ( 'periodicActFreq' )
            // InternalActivityArchitecture.g:3323:2: 'periodicActFreq'
            {
             before(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqKeyword_2()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__2__Impl"


    // $ANTLR start "rule__PeriodicTimer__Group__3"
    // InternalActivityArchitecture.g:3332:1: rule__PeriodicTimer__Group__3 : rule__PeriodicTimer__Group__3__Impl rule__PeriodicTimer__Group__4 ;
    public final void rule__PeriodicTimer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3336:1: ( rule__PeriodicTimer__Group__3__Impl rule__PeriodicTimer__Group__4 )
            // InternalActivityArchitecture.g:3337:2: rule__PeriodicTimer__Group__3__Impl rule__PeriodicTimer__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__PeriodicTimer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeriodicTimer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__3"


    // $ANTLR start "rule__PeriodicTimer__Group__3__Impl"
    // InternalActivityArchitecture.g:3344:1: rule__PeriodicTimer__Group__3__Impl : ( ( rule__PeriodicTimer__PeriodicActFreqAssignment_3 ) ) ;
    public final void rule__PeriodicTimer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3348:1: ( ( ( rule__PeriodicTimer__PeriodicActFreqAssignment_3 ) ) )
            // InternalActivityArchitecture.g:3349:1: ( ( rule__PeriodicTimer__PeriodicActFreqAssignment_3 ) )
            {
            // InternalActivityArchitecture.g:3349:1: ( ( rule__PeriodicTimer__PeriodicActFreqAssignment_3 ) )
            // InternalActivityArchitecture.g:3350:2: ( rule__PeriodicTimer__PeriodicActFreqAssignment_3 )
            {
             before(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqAssignment_3()); 
            // InternalActivityArchitecture.g:3351:2: ( rule__PeriodicTimer__PeriodicActFreqAssignment_3 )
            // InternalActivityArchitecture.g:3351:3: rule__PeriodicTimer__PeriodicActFreqAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PeriodicTimer__PeriodicActFreqAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__3__Impl"


    // $ANTLR start "rule__PeriodicTimer__Group__4"
    // InternalActivityArchitecture.g:3359:1: rule__PeriodicTimer__Group__4 : rule__PeriodicTimer__Group__4__Impl rule__PeriodicTimer__Group__5 ;
    public final void rule__PeriodicTimer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3363:1: ( rule__PeriodicTimer__Group__4__Impl rule__PeriodicTimer__Group__5 )
            // InternalActivityArchitecture.g:3364:2: rule__PeriodicTimer__Group__4__Impl rule__PeriodicTimer__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__PeriodicTimer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeriodicTimer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__4"


    // $ANTLR start "rule__PeriodicTimer__Group__4__Impl"
    // InternalActivityArchitecture.g:3371:1: rule__PeriodicTimer__Group__4__Impl : ( 'Hz' ) ;
    public final void rule__PeriodicTimer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3375:1: ( ( 'Hz' ) )
            // InternalActivityArchitecture.g:3376:1: ( 'Hz' )
            {
            // InternalActivityArchitecture.g:3376:1: ( 'Hz' )
            // InternalActivityArchitecture.g:3377:2: 'Hz'
            {
             before(grammarAccess.getPeriodicTimerAccess().getHzKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPeriodicTimerAccess().getHzKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__4__Impl"


    // $ANTLR start "rule__PeriodicTimer__Group__5"
    // InternalActivityArchitecture.g:3386:1: rule__PeriodicTimer__Group__5 : rule__PeriodicTimer__Group__5__Impl rule__PeriodicTimer__Group__6 ;
    public final void rule__PeriodicTimer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3390:1: ( rule__PeriodicTimer__Group__5__Impl rule__PeriodicTimer__Group__6 )
            // InternalActivityArchitecture.g:3391:2: rule__PeriodicTimer__Group__5__Impl rule__PeriodicTimer__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__PeriodicTimer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PeriodicTimer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__5"


    // $ANTLR start "rule__PeriodicTimer__Group__5__Impl"
    // InternalActivityArchitecture.g:3398:1: rule__PeriodicTimer__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__PeriodicTimer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3402:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:3403:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:3403:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:3404:2: ( ';' )?
            {
             before(grammarAccess.getPeriodicTimerAccess().getSemicolonKeyword_5()); 
            // InternalActivityArchitecture.g:3405:2: ( ';' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==31) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalActivityArchitecture.g:3405:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPeriodicTimerAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__5__Impl"


    // $ANTLR start "rule__PeriodicTimer__Group__6"
    // InternalActivityArchitecture.g:3413:1: rule__PeriodicTimer__Group__6 : rule__PeriodicTimer__Group__6__Impl ;
    public final void rule__PeriodicTimer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3417:1: ( rule__PeriodicTimer__Group__6__Impl )
            // InternalActivityArchitecture.g:3418:2: rule__PeriodicTimer__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PeriodicTimer__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__6"


    // $ANTLR start "rule__PeriodicTimer__Group__6__Impl"
    // InternalActivityArchitecture.g:3424:1: rule__PeriodicTimer__Group__6__Impl : ( '}' ) ;
    public final void rule__PeriodicTimer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3428:1: ( ( '}' ) )
            // InternalActivityArchitecture.g:3429:1: ( '}' )
            {
            // InternalActivityArchitecture.g:3429:1: ( '}' )
            // InternalActivityArchitecture.g:3430:2: '}'
            {
             before(grammarAccess.getPeriodicTimerAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPeriodicTimerAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__Group__6__Impl"


    // $ANTLR start "rule__Scheduler__Group__0"
    // InternalActivityArchitecture.g:3440:1: rule__Scheduler__Group__0 : rule__Scheduler__Group__0__Impl rule__Scheduler__Group__1 ;
    public final void rule__Scheduler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3444:1: ( rule__Scheduler__Group__0__Impl rule__Scheduler__Group__1 )
            // InternalActivityArchitecture.g:3445:2: rule__Scheduler__Group__0__Impl rule__Scheduler__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Scheduler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scheduler__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group__0"


    // $ANTLR start "rule__Scheduler__Group__0__Impl"
    // InternalActivityArchitecture.g:3452:1: rule__Scheduler__Group__0__Impl : ( () ) ;
    public final void rule__Scheduler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3456:1: ( ( () ) )
            // InternalActivityArchitecture.g:3457:1: ( () )
            {
            // InternalActivityArchitecture.g:3457:1: ( () )
            // InternalActivityArchitecture.g:3458:2: ()
            {
             before(grammarAccess.getSchedulerAccess().getSchedulerAction_0()); 
            // InternalActivityArchitecture.g:3459:2: ()
            // InternalActivityArchitecture.g:3459:3: 
            {
            }

             after(grammarAccess.getSchedulerAccess().getSchedulerAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group__0__Impl"


    // $ANTLR start "rule__Scheduler__Group__1"
    // InternalActivityArchitecture.g:3467:1: rule__Scheduler__Group__1 : rule__Scheduler__Group__1__Impl rule__Scheduler__Group__2 ;
    public final void rule__Scheduler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3471:1: ( rule__Scheduler__Group__1__Impl rule__Scheduler__Group__2 )
            // InternalActivityArchitecture.g:3472:2: rule__Scheduler__Group__1__Impl rule__Scheduler__Group__2
            {
            pushFollow(FOLLOW_35);
            rule__Scheduler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scheduler__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group__1"


    // $ANTLR start "rule__Scheduler__Group__1__Impl"
    // InternalActivityArchitecture.g:3479:1: rule__Scheduler__Group__1__Impl : ( '{' ) ;
    public final void rule__Scheduler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3483:1: ( ( '{' ) )
            // InternalActivityArchitecture.g:3484:1: ( '{' )
            {
            // InternalActivityArchitecture.g:3484:1: ( '{' )
            // InternalActivityArchitecture.g:3485:2: '{'
            {
             before(grammarAccess.getSchedulerAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getSchedulerAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group__1__Impl"


    // $ANTLR start "rule__Scheduler__Group__2"
    // InternalActivityArchitecture.g:3494:1: rule__Scheduler__Group__2 : rule__Scheduler__Group__2__Impl rule__Scheduler__Group__3 ;
    public final void rule__Scheduler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3498:1: ( rule__Scheduler__Group__2__Impl rule__Scheduler__Group__3 )
            // InternalActivityArchitecture.g:3499:2: rule__Scheduler__Group__2__Impl rule__Scheduler__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Scheduler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scheduler__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group__2"


    // $ANTLR start "rule__Scheduler__Group__2__Impl"
    // InternalActivityArchitecture.g:3506:1: rule__Scheduler__Group__2__Impl : ( ( rule__Scheduler__UnorderedGroup_2 ) ) ;
    public final void rule__Scheduler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3510:1: ( ( ( rule__Scheduler__UnorderedGroup_2 ) ) )
            // InternalActivityArchitecture.g:3511:1: ( ( rule__Scheduler__UnorderedGroup_2 ) )
            {
            // InternalActivityArchitecture.g:3511:1: ( ( rule__Scheduler__UnorderedGroup_2 ) )
            // InternalActivityArchitecture.g:3512:2: ( rule__Scheduler__UnorderedGroup_2 )
            {
             before(grammarAccess.getSchedulerAccess().getUnorderedGroup_2()); 
            // InternalActivityArchitecture.g:3513:2: ( rule__Scheduler__UnorderedGroup_2 )
            // InternalActivityArchitecture.g:3513:3: rule__Scheduler__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__Scheduler__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getSchedulerAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group__2__Impl"


    // $ANTLR start "rule__Scheduler__Group__3"
    // InternalActivityArchitecture.g:3521:1: rule__Scheduler__Group__3 : rule__Scheduler__Group__3__Impl ;
    public final void rule__Scheduler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3525:1: ( rule__Scheduler__Group__3__Impl )
            // InternalActivityArchitecture.g:3526:2: rule__Scheduler__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scheduler__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group__3"


    // $ANTLR start "rule__Scheduler__Group__3__Impl"
    // InternalActivityArchitecture.g:3532:1: rule__Scheduler__Group__3__Impl : ( '}' ) ;
    public final void rule__Scheduler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3536:1: ( ( '}' ) )
            // InternalActivityArchitecture.g:3537:1: ( '}' )
            {
            // InternalActivityArchitecture.g:3537:1: ( '}' )
            // InternalActivityArchitecture.g:3538:2: '}'
            {
             before(grammarAccess.getSchedulerAccess().getRightCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getSchedulerAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group__3__Impl"


    // $ANTLR start "rule__Scheduler__Group_2_0__0"
    // InternalActivityArchitecture.g:3548:1: rule__Scheduler__Group_2_0__0 : rule__Scheduler__Group_2_0__0__Impl rule__Scheduler__Group_2_0__1 ;
    public final void rule__Scheduler__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3552:1: ( rule__Scheduler__Group_2_0__0__Impl rule__Scheduler__Group_2_0__1 )
            // InternalActivityArchitecture.g:3553:2: rule__Scheduler__Group_2_0__0__Impl rule__Scheduler__Group_2_0__1
            {
            pushFollow(FOLLOW_36);
            rule__Scheduler__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scheduler__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_0__0"


    // $ANTLR start "rule__Scheduler__Group_2_0__0__Impl"
    // InternalActivityArchitecture.g:3560:1: rule__Scheduler__Group_2_0__0__Impl : ( 'type' ) ;
    public final void rule__Scheduler__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3564:1: ( ( 'type' ) )
            // InternalActivityArchitecture.g:3565:1: ( 'type' )
            {
            // InternalActivityArchitecture.g:3565:1: ( 'type' )
            // InternalActivityArchitecture.g:3566:2: 'type'
            {
             before(grammarAccess.getSchedulerAccess().getTypeKeyword_2_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getSchedulerAccess().getTypeKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_0__0__Impl"


    // $ANTLR start "rule__Scheduler__Group_2_0__1"
    // InternalActivityArchitecture.g:3575:1: rule__Scheduler__Group_2_0__1 : rule__Scheduler__Group_2_0__1__Impl rule__Scheduler__Group_2_0__2 ;
    public final void rule__Scheduler__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3579:1: ( rule__Scheduler__Group_2_0__1__Impl rule__Scheduler__Group_2_0__2 )
            // InternalActivityArchitecture.g:3580:2: rule__Scheduler__Group_2_0__1__Impl rule__Scheduler__Group_2_0__2
            {
            pushFollow(FOLLOW_20);
            rule__Scheduler__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scheduler__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_0__1"


    // $ANTLR start "rule__Scheduler__Group_2_0__1__Impl"
    // InternalActivityArchitecture.g:3587:1: rule__Scheduler__Group_2_0__1__Impl : ( ( rule__Scheduler__TypeAssignment_2_0_1 ) ) ;
    public final void rule__Scheduler__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3591:1: ( ( ( rule__Scheduler__TypeAssignment_2_0_1 ) ) )
            // InternalActivityArchitecture.g:3592:1: ( ( rule__Scheduler__TypeAssignment_2_0_1 ) )
            {
            // InternalActivityArchitecture.g:3592:1: ( ( rule__Scheduler__TypeAssignment_2_0_1 ) )
            // InternalActivityArchitecture.g:3593:2: ( rule__Scheduler__TypeAssignment_2_0_1 )
            {
             before(grammarAccess.getSchedulerAccess().getTypeAssignment_2_0_1()); 
            // InternalActivityArchitecture.g:3594:2: ( rule__Scheduler__TypeAssignment_2_0_1 )
            // InternalActivityArchitecture.g:3594:3: rule__Scheduler__TypeAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Scheduler__TypeAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSchedulerAccess().getTypeAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_0__1__Impl"


    // $ANTLR start "rule__Scheduler__Group_2_0__2"
    // InternalActivityArchitecture.g:3602:1: rule__Scheduler__Group_2_0__2 : rule__Scheduler__Group_2_0__2__Impl ;
    public final void rule__Scheduler__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3606:1: ( rule__Scheduler__Group_2_0__2__Impl )
            // InternalActivityArchitecture.g:3607:2: rule__Scheduler__Group_2_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scheduler__Group_2_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_0__2"


    // $ANTLR start "rule__Scheduler__Group_2_0__2__Impl"
    // InternalActivityArchitecture.g:3613:1: rule__Scheduler__Group_2_0__2__Impl : ( ( ';' )? ) ;
    public final void rule__Scheduler__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3617:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:3618:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:3618:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:3619:2: ( ';' )?
            {
             before(grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_0_2()); 
            // InternalActivityArchitecture.g:3620:2: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==31) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalActivityArchitecture.g:3620:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_0__2__Impl"


    // $ANTLR start "rule__Scheduler__Group_2_1__0"
    // InternalActivityArchitecture.g:3629:1: rule__Scheduler__Group_2_1__0 : rule__Scheduler__Group_2_1__0__Impl rule__Scheduler__Group_2_1__1 ;
    public final void rule__Scheduler__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3633:1: ( rule__Scheduler__Group_2_1__0__Impl rule__Scheduler__Group_2_1__1 )
            // InternalActivityArchitecture.g:3634:2: rule__Scheduler__Group_2_1__0__Impl rule__Scheduler__Group_2_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Scheduler__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scheduler__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_1__0"


    // $ANTLR start "rule__Scheduler__Group_2_1__0__Impl"
    // InternalActivityArchitecture.g:3641:1: rule__Scheduler__Group_2_1__0__Impl : ( 'priority' ) ;
    public final void rule__Scheduler__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3645:1: ( ( 'priority' ) )
            // InternalActivityArchitecture.g:3646:1: ( 'priority' )
            {
            // InternalActivityArchitecture.g:3646:1: ( 'priority' )
            // InternalActivityArchitecture.g:3647:2: 'priority'
            {
             before(grammarAccess.getSchedulerAccess().getPriorityKeyword_2_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getSchedulerAccess().getPriorityKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_1__0__Impl"


    // $ANTLR start "rule__Scheduler__Group_2_1__1"
    // InternalActivityArchitecture.g:3656:1: rule__Scheduler__Group_2_1__1 : rule__Scheduler__Group_2_1__1__Impl rule__Scheduler__Group_2_1__2 ;
    public final void rule__Scheduler__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3660:1: ( rule__Scheduler__Group_2_1__1__Impl rule__Scheduler__Group_2_1__2 )
            // InternalActivityArchitecture.g:3661:2: rule__Scheduler__Group_2_1__1__Impl rule__Scheduler__Group_2_1__2
            {
            pushFollow(FOLLOW_20);
            rule__Scheduler__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scheduler__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_1__1"


    // $ANTLR start "rule__Scheduler__Group_2_1__1__Impl"
    // InternalActivityArchitecture.g:3668:1: rule__Scheduler__Group_2_1__1__Impl : ( ( rule__Scheduler__PriorityAssignment_2_1_1 ) ) ;
    public final void rule__Scheduler__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3672:1: ( ( ( rule__Scheduler__PriorityAssignment_2_1_1 ) ) )
            // InternalActivityArchitecture.g:3673:1: ( ( rule__Scheduler__PriorityAssignment_2_1_1 ) )
            {
            // InternalActivityArchitecture.g:3673:1: ( ( rule__Scheduler__PriorityAssignment_2_1_1 ) )
            // InternalActivityArchitecture.g:3674:2: ( rule__Scheduler__PriorityAssignment_2_1_1 )
            {
             before(grammarAccess.getSchedulerAccess().getPriorityAssignment_2_1_1()); 
            // InternalActivityArchitecture.g:3675:2: ( rule__Scheduler__PriorityAssignment_2_1_1 )
            // InternalActivityArchitecture.g:3675:3: rule__Scheduler__PriorityAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Scheduler__PriorityAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSchedulerAccess().getPriorityAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_1__1__Impl"


    // $ANTLR start "rule__Scheduler__Group_2_1__2"
    // InternalActivityArchitecture.g:3683:1: rule__Scheduler__Group_2_1__2 : rule__Scheduler__Group_2_1__2__Impl ;
    public final void rule__Scheduler__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3687:1: ( rule__Scheduler__Group_2_1__2__Impl )
            // InternalActivityArchitecture.g:3688:2: rule__Scheduler__Group_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scheduler__Group_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_1__2"


    // $ANTLR start "rule__Scheduler__Group_2_1__2__Impl"
    // InternalActivityArchitecture.g:3694:1: rule__Scheduler__Group_2_1__2__Impl : ( ( ';' )? ) ;
    public final void rule__Scheduler__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3698:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:3699:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:3699:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:3700:2: ( ';' )?
            {
             before(grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_1_2()); 
            // InternalActivityArchitecture.g:3701:2: ( ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==31) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalActivityArchitecture.g:3701:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSchedulerAccess().getSemicolonKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__Group_2_1__2__Impl"


    // $ANTLR start "rule__CPUCore__Group__0"
    // InternalActivityArchitecture.g:3710:1: rule__CPUCore__Group__0 : rule__CPUCore__Group__0__Impl rule__CPUCore__Group__1 ;
    public final void rule__CPUCore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3714:1: ( rule__CPUCore__Group__0__Impl rule__CPUCore__Group__1 )
            // InternalActivityArchitecture.g:3715:2: rule__CPUCore__Group__0__Impl rule__CPUCore__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CPUCore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPUCore__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__0"


    // $ANTLR start "rule__CPUCore__Group__0__Impl"
    // InternalActivityArchitecture.g:3722:1: rule__CPUCore__Group__0__Impl : ( 'CPUCore' ) ;
    public final void rule__CPUCore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3726:1: ( ( 'CPUCore' ) )
            // InternalActivityArchitecture.g:3727:1: ( 'CPUCore' )
            {
            // InternalActivityArchitecture.g:3727:1: ( 'CPUCore' )
            // InternalActivityArchitecture.g:3728:2: 'CPUCore'
            {
             before(grammarAccess.getCPUCoreAccess().getCPUCoreKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getCPUCoreAccess().getCPUCoreKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__0__Impl"


    // $ANTLR start "rule__CPUCore__Group__1"
    // InternalActivityArchitecture.g:3737:1: rule__CPUCore__Group__1 : rule__CPUCore__Group__1__Impl rule__CPUCore__Group__2 ;
    public final void rule__CPUCore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3741:1: ( rule__CPUCore__Group__1__Impl rule__CPUCore__Group__2 )
            // InternalActivityArchitecture.g:3742:2: rule__CPUCore__Group__1__Impl rule__CPUCore__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__CPUCore__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPUCore__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__1"


    // $ANTLR start "rule__CPUCore__Group__1__Impl"
    // InternalActivityArchitecture.g:3749:1: rule__CPUCore__Group__1__Impl : ( ( rule__CPUCore__NameAssignment_1 ) ) ;
    public final void rule__CPUCore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3753:1: ( ( ( rule__CPUCore__NameAssignment_1 ) ) )
            // InternalActivityArchitecture.g:3754:1: ( ( rule__CPUCore__NameAssignment_1 ) )
            {
            // InternalActivityArchitecture.g:3754:1: ( ( rule__CPUCore__NameAssignment_1 ) )
            // InternalActivityArchitecture.g:3755:2: ( rule__CPUCore__NameAssignment_1 )
            {
             before(grammarAccess.getCPUCoreAccess().getNameAssignment_1()); 
            // InternalActivityArchitecture.g:3756:2: ( rule__CPUCore__NameAssignment_1 )
            // InternalActivityArchitecture.g:3756:3: rule__CPUCore__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CPUCore__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCPUCoreAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__1__Impl"


    // $ANTLR start "rule__CPUCore__Group__2"
    // InternalActivityArchitecture.g:3764:1: rule__CPUCore__Group__2 : rule__CPUCore__Group__2__Impl rule__CPUCore__Group__3 ;
    public final void rule__CPUCore__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3768:1: ( rule__CPUCore__Group__2__Impl rule__CPUCore__Group__3 )
            // InternalActivityArchitecture.g:3769:2: rule__CPUCore__Group__2__Impl rule__CPUCore__Group__3
            {
            pushFollow(FOLLOW_37);
            rule__CPUCore__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPUCore__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__2"


    // $ANTLR start "rule__CPUCore__Group__2__Impl"
    // InternalActivityArchitecture.g:3776:1: rule__CPUCore__Group__2__Impl : ( '{' ) ;
    public final void rule__CPUCore__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3780:1: ( ( '{' ) )
            // InternalActivityArchitecture.g:3781:1: ( '{' )
            {
            // InternalActivityArchitecture.g:3781:1: ( '{' )
            // InternalActivityArchitecture.g:3782:2: '{'
            {
             before(grammarAccess.getCPUCoreAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCPUCoreAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__2__Impl"


    // $ANTLR start "rule__CPUCore__Group__3"
    // InternalActivityArchitecture.g:3791:1: rule__CPUCore__Group__3 : rule__CPUCore__Group__3__Impl rule__CPUCore__Group__4 ;
    public final void rule__CPUCore__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3795:1: ( rule__CPUCore__Group__3__Impl rule__CPUCore__Group__4 )
            // InternalActivityArchitecture.g:3796:2: rule__CPUCore__Group__3__Impl rule__CPUCore__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__CPUCore__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPUCore__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__3"


    // $ANTLR start "rule__CPUCore__Group__3__Impl"
    // InternalActivityArchitecture.g:3803:1: rule__CPUCore__Group__3__Impl : ( 'coreNumber' ) ;
    public final void rule__CPUCore__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3807:1: ( ( 'coreNumber' ) )
            // InternalActivityArchitecture.g:3808:1: ( 'coreNumber' )
            {
            // InternalActivityArchitecture.g:3808:1: ( 'coreNumber' )
            // InternalActivityArchitecture.g:3809:2: 'coreNumber'
            {
             before(grammarAccess.getCPUCoreAccess().getCoreNumberKeyword_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getCPUCoreAccess().getCoreNumberKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__3__Impl"


    // $ANTLR start "rule__CPUCore__Group__4"
    // InternalActivityArchitecture.g:3818:1: rule__CPUCore__Group__4 : rule__CPUCore__Group__4__Impl rule__CPUCore__Group__5 ;
    public final void rule__CPUCore__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3822:1: ( rule__CPUCore__Group__4__Impl rule__CPUCore__Group__5 )
            // InternalActivityArchitecture.g:3823:2: rule__CPUCore__Group__4__Impl rule__CPUCore__Group__5
            {
            pushFollow(FOLLOW_33);
            rule__CPUCore__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPUCore__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__4"


    // $ANTLR start "rule__CPUCore__Group__4__Impl"
    // InternalActivityArchitecture.g:3830:1: rule__CPUCore__Group__4__Impl : ( ( rule__CPUCore__CoreNumberAssignment_4 ) ) ;
    public final void rule__CPUCore__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3834:1: ( ( ( rule__CPUCore__CoreNumberAssignment_4 ) ) )
            // InternalActivityArchitecture.g:3835:1: ( ( rule__CPUCore__CoreNumberAssignment_4 ) )
            {
            // InternalActivityArchitecture.g:3835:1: ( ( rule__CPUCore__CoreNumberAssignment_4 ) )
            // InternalActivityArchitecture.g:3836:2: ( rule__CPUCore__CoreNumberAssignment_4 )
            {
             before(grammarAccess.getCPUCoreAccess().getCoreNumberAssignment_4()); 
            // InternalActivityArchitecture.g:3837:2: ( rule__CPUCore__CoreNumberAssignment_4 )
            // InternalActivityArchitecture.g:3837:3: rule__CPUCore__CoreNumberAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CPUCore__CoreNumberAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCPUCoreAccess().getCoreNumberAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__4__Impl"


    // $ANTLR start "rule__CPUCore__Group__5"
    // InternalActivityArchitecture.g:3845:1: rule__CPUCore__Group__5 : rule__CPUCore__Group__5__Impl rule__CPUCore__Group__6 ;
    public final void rule__CPUCore__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3849:1: ( rule__CPUCore__Group__5__Impl rule__CPUCore__Group__6 )
            // InternalActivityArchitecture.g:3850:2: rule__CPUCore__Group__5__Impl rule__CPUCore__Group__6
            {
            pushFollow(FOLLOW_33);
            rule__CPUCore__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPUCore__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__5"


    // $ANTLR start "rule__CPUCore__Group__5__Impl"
    // InternalActivityArchitecture.g:3857:1: rule__CPUCore__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__CPUCore__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3861:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:3862:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:3862:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:3863:2: ( ';' )?
            {
             before(grammarAccess.getCPUCoreAccess().getSemicolonKeyword_5()); 
            // InternalActivityArchitecture.g:3864:2: ( ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==31) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalActivityArchitecture.g:3864:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCPUCoreAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__5__Impl"


    // $ANTLR start "rule__CPUCore__Group__6"
    // InternalActivityArchitecture.g:3872:1: rule__CPUCore__Group__6 : rule__CPUCore__Group__6__Impl ;
    public final void rule__CPUCore__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3876:1: ( rule__CPUCore__Group__6__Impl )
            // InternalActivityArchitecture.g:3877:2: rule__CPUCore__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CPUCore__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__6"


    // $ANTLR start "rule__CPUCore__Group__6__Impl"
    // InternalActivityArchitecture.g:3883:1: rule__CPUCore__Group__6__Impl : ( '}' ) ;
    public final void rule__CPUCore__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3887:1: ( ( '}' ) )
            // InternalActivityArchitecture.g:3888:1: ( '}' )
            {
            // InternalActivityArchitecture.g:3888:1: ( '}' )
            // InternalActivityArchitecture.g:3889:2: '}'
            {
             before(grammarAccess.getCPUCoreAccess().getRightCurlyBracketKeyword_6()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCPUCoreAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__Group__6__Impl"


    // $ANTLR start "rule__ExecutionTime__Group__0"
    // InternalActivityArchitecture.g:3899:1: rule__ExecutionTime__Group__0 : rule__ExecutionTime__Group__0__Impl rule__ExecutionTime__Group__1 ;
    public final void rule__ExecutionTime__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3903:1: ( rule__ExecutionTime__Group__0__Impl rule__ExecutionTime__Group__1 )
            // InternalActivityArchitecture.g:3904:2: rule__ExecutionTime__Group__0__Impl rule__ExecutionTime__Group__1
            {
            pushFollow(FOLLOW_38);
            rule__ExecutionTime__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutionTime__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group__0"


    // $ANTLR start "rule__ExecutionTime__Group__0__Impl"
    // InternalActivityArchitecture.g:3911:1: rule__ExecutionTime__Group__0__Impl : ( '{' ) ;
    public final void rule__ExecutionTime__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3915:1: ( ( '{' ) )
            // InternalActivityArchitecture.g:3916:1: ( '{' )
            {
            // InternalActivityArchitecture.g:3916:1: ( '{' )
            // InternalActivityArchitecture.g:3917:2: '{'
            {
             before(grammarAccess.getExecutionTimeAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getExecutionTimeAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group__0__Impl"


    // $ANTLR start "rule__ExecutionTime__Group__1"
    // InternalActivityArchitecture.g:3926:1: rule__ExecutionTime__Group__1 : rule__ExecutionTime__Group__1__Impl rule__ExecutionTime__Group__2 ;
    public final void rule__ExecutionTime__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3930:1: ( rule__ExecutionTime__Group__1__Impl rule__ExecutionTime__Group__2 )
            // InternalActivityArchitecture.g:3931:2: rule__ExecutionTime__Group__1__Impl rule__ExecutionTime__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__ExecutionTime__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutionTime__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group__1"


    // $ANTLR start "rule__ExecutionTime__Group__1__Impl"
    // InternalActivityArchitecture.g:3938:1: rule__ExecutionTime__Group__1__Impl : ( ( rule__ExecutionTime__UnorderedGroup_1 ) ) ;
    public final void rule__ExecutionTime__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3942:1: ( ( ( rule__ExecutionTime__UnorderedGroup_1 ) ) )
            // InternalActivityArchitecture.g:3943:1: ( ( rule__ExecutionTime__UnorderedGroup_1 ) )
            {
            // InternalActivityArchitecture.g:3943:1: ( ( rule__ExecutionTime__UnorderedGroup_1 ) )
            // InternalActivityArchitecture.g:3944:2: ( rule__ExecutionTime__UnorderedGroup_1 )
            {
             before(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1()); 
            // InternalActivityArchitecture.g:3945:2: ( rule__ExecutionTime__UnorderedGroup_1 )
            // InternalActivityArchitecture.g:3945:3: rule__ExecutionTime__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionTime__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group__1__Impl"


    // $ANTLR start "rule__ExecutionTime__Group__2"
    // InternalActivityArchitecture.g:3953:1: rule__ExecutionTime__Group__2 : rule__ExecutionTime__Group__2__Impl ;
    public final void rule__ExecutionTime__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3957:1: ( rule__ExecutionTime__Group__2__Impl )
            // InternalActivityArchitecture.g:3958:2: rule__ExecutionTime__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionTime__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group__2"


    // $ANTLR start "rule__ExecutionTime__Group__2__Impl"
    // InternalActivityArchitecture.g:3964:1: rule__ExecutionTime__Group__2__Impl : ( '}' ) ;
    public final void rule__ExecutionTime__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3968:1: ( ( '}' ) )
            // InternalActivityArchitecture.g:3969:1: ( '}' )
            {
            // InternalActivityArchitecture.g:3969:1: ( '}' )
            // InternalActivityArchitecture.g:3970:2: '}'
            {
             before(grammarAccess.getExecutionTimeAccess().getRightCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getExecutionTimeAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group__2__Impl"


    // $ANTLR start "rule__ExecutionTime__Group_1_0__0"
    // InternalActivityArchitecture.g:3980:1: rule__ExecutionTime__Group_1_0__0 : rule__ExecutionTime__Group_1_0__0__Impl rule__ExecutionTime__Group_1_0__1 ;
    public final void rule__ExecutionTime__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3984:1: ( rule__ExecutionTime__Group_1_0__0__Impl rule__ExecutionTime__Group_1_0__1 )
            // InternalActivityArchitecture.g:3985:2: rule__ExecutionTime__Group_1_0__0__Impl rule__ExecutionTime__Group_1_0__1
            {
            pushFollow(FOLLOW_11);
            rule__ExecutionTime__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutionTime__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_0__0"


    // $ANTLR start "rule__ExecutionTime__Group_1_0__0__Impl"
    // InternalActivityArchitecture.g:3992:1: rule__ExecutionTime__Group_1_0__0__Impl : ( 'minTime' ) ;
    public final void rule__ExecutionTime__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:3996:1: ( ( 'minTime' ) )
            // InternalActivityArchitecture.g:3997:1: ( 'minTime' )
            {
            // InternalActivityArchitecture.g:3997:1: ( 'minTime' )
            // InternalActivityArchitecture.g:3998:2: 'minTime'
            {
             before(grammarAccess.getExecutionTimeAccess().getMinTimeKeyword_1_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getExecutionTimeAccess().getMinTimeKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_0__0__Impl"


    // $ANTLR start "rule__ExecutionTime__Group_1_0__1"
    // InternalActivityArchitecture.g:4007:1: rule__ExecutionTime__Group_1_0__1 : rule__ExecutionTime__Group_1_0__1__Impl rule__ExecutionTime__Group_1_0__2 ;
    public final void rule__ExecutionTime__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4011:1: ( rule__ExecutionTime__Group_1_0__1__Impl rule__ExecutionTime__Group_1_0__2 )
            // InternalActivityArchitecture.g:4012:2: rule__ExecutionTime__Group_1_0__1__Impl rule__ExecutionTime__Group_1_0__2
            {
            pushFollow(FOLLOW_20);
            rule__ExecutionTime__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutionTime__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_0__1"


    // $ANTLR start "rule__ExecutionTime__Group_1_0__1__Impl"
    // InternalActivityArchitecture.g:4019:1: rule__ExecutionTime__Group_1_0__1__Impl : ( ( rule__ExecutionTime__MinTimeAssignment_1_0_1 ) ) ;
    public final void rule__ExecutionTime__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4023:1: ( ( ( rule__ExecutionTime__MinTimeAssignment_1_0_1 ) ) )
            // InternalActivityArchitecture.g:4024:1: ( ( rule__ExecutionTime__MinTimeAssignment_1_0_1 ) )
            {
            // InternalActivityArchitecture.g:4024:1: ( ( rule__ExecutionTime__MinTimeAssignment_1_0_1 ) )
            // InternalActivityArchitecture.g:4025:2: ( rule__ExecutionTime__MinTimeAssignment_1_0_1 )
            {
             before(grammarAccess.getExecutionTimeAccess().getMinTimeAssignment_1_0_1()); 
            // InternalActivityArchitecture.g:4026:2: ( rule__ExecutionTime__MinTimeAssignment_1_0_1 )
            // InternalActivityArchitecture.g:4026:3: rule__ExecutionTime__MinTimeAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionTime__MinTimeAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getExecutionTimeAccess().getMinTimeAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_0__1__Impl"


    // $ANTLR start "rule__ExecutionTime__Group_1_0__2"
    // InternalActivityArchitecture.g:4034:1: rule__ExecutionTime__Group_1_0__2 : rule__ExecutionTime__Group_1_0__2__Impl ;
    public final void rule__ExecutionTime__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4038:1: ( rule__ExecutionTime__Group_1_0__2__Impl )
            // InternalActivityArchitecture.g:4039:2: rule__ExecutionTime__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionTime__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_0__2"


    // $ANTLR start "rule__ExecutionTime__Group_1_0__2__Impl"
    // InternalActivityArchitecture.g:4045:1: rule__ExecutionTime__Group_1_0__2__Impl : ( ( ';' )? ) ;
    public final void rule__ExecutionTime__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4049:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:4050:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:4050:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:4051:2: ( ';' )?
            {
             before(grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_0_2()); 
            // InternalActivityArchitecture.g:4052:2: ( ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalActivityArchitecture.g:4052:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_0__2__Impl"


    // $ANTLR start "rule__ExecutionTime__Group_1_1__0"
    // InternalActivityArchitecture.g:4061:1: rule__ExecutionTime__Group_1_1__0 : rule__ExecutionTime__Group_1_1__0__Impl rule__ExecutionTime__Group_1_1__1 ;
    public final void rule__ExecutionTime__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4065:1: ( rule__ExecutionTime__Group_1_1__0__Impl rule__ExecutionTime__Group_1_1__1 )
            // InternalActivityArchitecture.g:4066:2: rule__ExecutionTime__Group_1_1__0__Impl rule__ExecutionTime__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__ExecutionTime__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutionTime__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_1__0"


    // $ANTLR start "rule__ExecutionTime__Group_1_1__0__Impl"
    // InternalActivityArchitecture.g:4073:1: rule__ExecutionTime__Group_1_1__0__Impl : ( 'maxTime' ) ;
    public final void rule__ExecutionTime__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4077:1: ( ( 'maxTime' ) )
            // InternalActivityArchitecture.g:4078:1: ( 'maxTime' )
            {
            // InternalActivityArchitecture.g:4078:1: ( 'maxTime' )
            // InternalActivityArchitecture.g:4079:2: 'maxTime'
            {
             before(grammarAccess.getExecutionTimeAccess().getMaxTimeKeyword_1_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getExecutionTimeAccess().getMaxTimeKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_1__0__Impl"


    // $ANTLR start "rule__ExecutionTime__Group_1_1__1"
    // InternalActivityArchitecture.g:4088:1: rule__ExecutionTime__Group_1_1__1 : rule__ExecutionTime__Group_1_1__1__Impl rule__ExecutionTime__Group_1_1__2 ;
    public final void rule__ExecutionTime__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4092:1: ( rule__ExecutionTime__Group_1_1__1__Impl rule__ExecutionTime__Group_1_1__2 )
            // InternalActivityArchitecture.g:4093:2: rule__ExecutionTime__Group_1_1__1__Impl rule__ExecutionTime__Group_1_1__2
            {
            pushFollow(FOLLOW_20);
            rule__ExecutionTime__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExecutionTime__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_1__1"


    // $ANTLR start "rule__ExecutionTime__Group_1_1__1__Impl"
    // InternalActivityArchitecture.g:4100:1: rule__ExecutionTime__Group_1_1__1__Impl : ( ( rule__ExecutionTime__MaxTimeAssignment_1_1_1 ) ) ;
    public final void rule__ExecutionTime__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4104:1: ( ( ( rule__ExecutionTime__MaxTimeAssignment_1_1_1 ) ) )
            // InternalActivityArchitecture.g:4105:1: ( ( rule__ExecutionTime__MaxTimeAssignment_1_1_1 ) )
            {
            // InternalActivityArchitecture.g:4105:1: ( ( rule__ExecutionTime__MaxTimeAssignment_1_1_1 ) )
            // InternalActivityArchitecture.g:4106:2: ( rule__ExecutionTime__MaxTimeAssignment_1_1_1 )
            {
             before(grammarAccess.getExecutionTimeAccess().getMaxTimeAssignment_1_1_1()); 
            // InternalActivityArchitecture.g:4107:2: ( rule__ExecutionTime__MaxTimeAssignment_1_1_1 )
            // InternalActivityArchitecture.g:4107:3: rule__ExecutionTime__MaxTimeAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionTime__MaxTimeAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExecutionTimeAccess().getMaxTimeAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_1__1__Impl"


    // $ANTLR start "rule__ExecutionTime__Group_1_1__2"
    // InternalActivityArchitecture.g:4115:1: rule__ExecutionTime__Group_1_1__2 : rule__ExecutionTime__Group_1_1__2__Impl ;
    public final void rule__ExecutionTime__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4119:1: ( rule__ExecutionTime__Group_1_1__2__Impl )
            // InternalActivityArchitecture.g:4120:2: rule__ExecutionTime__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionTime__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_1__2"


    // $ANTLR start "rule__ExecutionTime__Group_1_1__2__Impl"
    // InternalActivityArchitecture.g:4126:1: rule__ExecutionTime__Group_1_1__2__Impl : ( ( ';' )? ) ;
    public final void rule__ExecutionTime__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4130:1: ( ( ( ';' )? ) )
            // InternalActivityArchitecture.g:4131:1: ( ( ';' )? )
            {
            // InternalActivityArchitecture.g:4131:1: ( ( ';' )? )
            // InternalActivityArchitecture.g:4132:2: ( ';' )?
            {
             before(grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_1_2()); 
            // InternalActivityArchitecture.g:4133:2: ( ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalActivityArchitecture.g:4133:3: ';'
                    {
                    match(input,31,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getExecutionTimeAccess().getSemicolonKeyword_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__Group_1_1__2__Impl"


    // $ANTLR start "rule__TimeValue__Group__0"
    // InternalActivityArchitecture.g:4142:1: rule__TimeValue__Group__0 : rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1 ;
    public final void rule__TimeValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4146:1: ( rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1 )
            // InternalActivityArchitecture.g:4147:2: rule__TimeValue__Group__0__Impl rule__TimeValue__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__TimeValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TimeValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__Group__0"


    // $ANTLR start "rule__TimeValue__Group__0__Impl"
    // InternalActivityArchitecture.g:4154:1: rule__TimeValue__Group__0__Impl : ( ( rule__TimeValue__ValueAssignment_0 ) ) ;
    public final void rule__TimeValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4158:1: ( ( ( rule__TimeValue__ValueAssignment_0 ) ) )
            // InternalActivityArchitecture.g:4159:1: ( ( rule__TimeValue__ValueAssignment_0 ) )
            {
            // InternalActivityArchitecture.g:4159:1: ( ( rule__TimeValue__ValueAssignment_0 ) )
            // InternalActivityArchitecture.g:4160:2: ( rule__TimeValue__ValueAssignment_0 )
            {
             before(grammarAccess.getTimeValueAccess().getValueAssignment_0()); 
            // InternalActivityArchitecture.g:4161:2: ( rule__TimeValue__ValueAssignment_0 )
            // InternalActivityArchitecture.g:4161:3: rule__TimeValue__ValueAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TimeValue__ValueAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTimeValueAccess().getValueAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__Group__0__Impl"


    // $ANTLR start "rule__TimeValue__Group__1"
    // InternalActivityArchitecture.g:4169:1: rule__TimeValue__Group__1 : rule__TimeValue__Group__1__Impl ;
    public final void rule__TimeValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4173:1: ( rule__TimeValue__Group__1__Impl )
            // InternalActivityArchitecture.g:4174:2: rule__TimeValue__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TimeValue__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__Group__1"


    // $ANTLR start "rule__TimeValue__Group__1__Impl"
    // InternalActivityArchitecture.g:4180:1: rule__TimeValue__Group__1__Impl : ( ( rule__TimeValue__UnitAssignment_1 ) ) ;
    public final void rule__TimeValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4184:1: ( ( ( rule__TimeValue__UnitAssignment_1 ) ) )
            // InternalActivityArchitecture.g:4185:1: ( ( rule__TimeValue__UnitAssignment_1 ) )
            {
            // InternalActivityArchitecture.g:4185:1: ( ( rule__TimeValue__UnitAssignment_1 ) )
            // InternalActivityArchitecture.g:4186:2: ( rule__TimeValue__UnitAssignment_1 )
            {
             before(grammarAccess.getTimeValueAccess().getUnitAssignment_1()); 
            // InternalActivityArchitecture.g:4187:2: ( rule__TimeValue__UnitAssignment_1 )
            // InternalActivityArchitecture.g:4187:3: rule__TimeValue__UnitAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TimeValue__UnitAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTimeValueAccess().getUnitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__Group__1__Impl"


    // $ANTLR start "rule__ActivityNode__UnorderedGroup_5"
    // InternalActivityArchitecture.g:4196:1: rule__ActivityNode__UnorderedGroup_5 : ( rule__ActivityNode__UnorderedGroup_5__0 )? ;
    public final void rule__ActivityNode__UnorderedGroup_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
        	
        try {
            // InternalActivityArchitecture.g:4201:1: ( ( rule__ActivityNode__UnorderedGroup_5__0 )? )
            // InternalActivityArchitecture.g:4202:2: ( rule__ActivityNode__UnorderedGroup_5__0 )?
            {
            // InternalActivityArchitecture.g:4202:2: ( rule__ActivityNode__UnorderedGroup_5__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( LA32_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0) ) {
                alt32=1;
            }
            else if ( LA32_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1) ) {
                alt32=1;
            }
            else if ( LA32_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2) ) {
                alt32=1;
            }
            else if ( LA32_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalActivityArchitecture.g:4202:2: rule__ActivityNode__UnorderedGroup_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__UnorderedGroup_5__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__UnorderedGroup_5"


    // $ANTLR start "rule__ActivityNode__UnorderedGroup_5__Impl"
    // InternalActivityArchitecture.g:4210:1: rule__ActivityNode__UnorderedGroup_5__Impl : ( ({...}? => ( ( ( rule__ActivityNode__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_3__0 ) ) ) ) ) ;
    public final void rule__ActivityNode__UnorderedGroup_5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalActivityArchitecture.g:4215:1: ( ( ({...}? => ( ( ( rule__ActivityNode__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_3__0 ) ) ) ) ) )
            // InternalActivityArchitecture.g:4216:3: ( ({...}? => ( ( ( rule__ActivityNode__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_3__0 ) ) ) ) )
            {
            // InternalActivityArchitecture.g:4216:3: ( ({...}? => ( ( ( rule__ActivityNode__Group_5_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_1__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_2__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivityNode__Group_5_3__0 ) ) ) ) )
            int alt33=4;
            int LA33_0 = input.LA(1);

            if ( LA33_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0) ) {
                alt33=1;
            }
            else if ( LA33_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1) ) {
                alt33=2;
            }
            else if ( LA33_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2) ) {
                alt33=3;
            }
            else if ( LA33_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3) ) {
                alt33=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // InternalActivityArchitecture.g:4217:3: ({...}? => ( ( ( rule__ActivityNode__Group_5_0__0 ) ) ) )
                    {
                    // InternalActivityArchitecture.g:4217:3: ({...}? => ( ( ( rule__ActivityNode__Group_5_0__0 ) ) ) )
                    // InternalActivityArchitecture.g:4218:4: {...}? => ( ( ( rule__ActivityNode__Group_5_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ActivityNode__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0)");
                    }
                    // InternalActivityArchitecture.g:4218:108: ( ( ( rule__ActivityNode__Group_5_0__0 ) ) )
                    // InternalActivityArchitecture.g:4219:5: ( ( rule__ActivityNode__Group_5_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0);
                    				

                    					selected = true;
                    				
                    // InternalActivityArchitecture.g:4225:5: ( ( rule__ActivityNode__Group_5_0__0 ) )
                    // InternalActivityArchitecture.g:4226:6: ( rule__ActivityNode__Group_5_0__0 )
                    {
                     before(grammarAccess.getActivityNodeAccess().getGroup_5_0()); 
                    // InternalActivityArchitecture.g:4227:6: ( rule__ActivityNode__Group_5_0__0 )
                    // InternalActivityArchitecture.g:4227:7: rule__ActivityNode__Group_5_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__Group_5_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityNodeAccess().getGroup_5_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:4232:3: ({...}? => ( ( ( rule__ActivityNode__Group_5_1__0 ) ) ) )
                    {
                    // InternalActivityArchitecture.g:4232:3: ({...}? => ( ( ( rule__ActivityNode__Group_5_1__0 ) ) ) )
                    // InternalActivityArchitecture.g:4233:4: {...}? => ( ( ( rule__ActivityNode__Group_5_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ActivityNode__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1)");
                    }
                    // InternalActivityArchitecture.g:4233:108: ( ( ( rule__ActivityNode__Group_5_1__0 ) ) )
                    // InternalActivityArchitecture.g:4234:5: ( ( rule__ActivityNode__Group_5_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1);
                    				

                    					selected = true;
                    				
                    // InternalActivityArchitecture.g:4240:5: ( ( rule__ActivityNode__Group_5_1__0 ) )
                    // InternalActivityArchitecture.g:4241:6: ( rule__ActivityNode__Group_5_1__0 )
                    {
                     before(grammarAccess.getActivityNodeAccess().getGroup_5_1()); 
                    // InternalActivityArchitecture.g:4242:6: ( rule__ActivityNode__Group_5_1__0 )
                    // InternalActivityArchitecture.g:4242:7: rule__ActivityNode__Group_5_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__Group_5_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityNodeAccess().getGroup_5_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalActivityArchitecture.g:4247:3: ({...}? => ( ( ( rule__ActivityNode__Group_5_2__0 ) ) ) )
                    {
                    // InternalActivityArchitecture.g:4247:3: ({...}? => ( ( ( rule__ActivityNode__Group_5_2__0 ) ) ) )
                    // InternalActivityArchitecture.g:4248:4: {...}? => ( ( ( rule__ActivityNode__Group_5_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2) ) {
                        throw new FailedPredicateException(input, "rule__ActivityNode__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2)");
                    }
                    // InternalActivityArchitecture.g:4248:108: ( ( ( rule__ActivityNode__Group_5_2__0 ) ) )
                    // InternalActivityArchitecture.g:4249:5: ( ( rule__ActivityNode__Group_5_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2);
                    				

                    					selected = true;
                    				
                    // InternalActivityArchitecture.g:4255:5: ( ( rule__ActivityNode__Group_5_2__0 ) )
                    // InternalActivityArchitecture.g:4256:6: ( rule__ActivityNode__Group_5_2__0 )
                    {
                     before(grammarAccess.getActivityNodeAccess().getGroup_5_2()); 
                    // InternalActivityArchitecture.g:4257:6: ( rule__ActivityNode__Group_5_2__0 )
                    // InternalActivityArchitecture.g:4257:7: rule__ActivityNode__Group_5_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__Group_5_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityNodeAccess().getGroup_5_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalActivityArchitecture.g:4262:3: ({...}? => ( ( ( rule__ActivityNode__Group_5_3__0 ) ) ) )
                    {
                    // InternalActivityArchitecture.g:4262:3: ({...}? => ( ( ( rule__ActivityNode__Group_5_3__0 ) ) ) )
                    // InternalActivityArchitecture.g:4263:4: {...}? => ( ( ( rule__ActivityNode__Group_5_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3) ) {
                        throw new FailedPredicateException(input, "rule__ActivityNode__UnorderedGroup_5__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3)");
                    }
                    // InternalActivityArchitecture.g:4263:108: ( ( ( rule__ActivityNode__Group_5_3__0 ) ) )
                    // InternalActivityArchitecture.g:4264:5: ( ( rule__ActivityNode__Group_5_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3);
                    				

                    					selected = true;
                    				
                    // InternalActivityArchitecture.g:4270:5: ( ( rule__ActivityNode__Group_5_3__0 ) )
                    // InternalActivityArchitecture.g:4271:6: ( rule__ActivityNode__Group_5_3__0 )
                    {
                     before(grammarAccess.getActivityNodeAccess().getGroup_5_3()); 
                    // InternalActivityArchitecture.g:4272:6: ( rule__ActivityNode__Group_5_3__0 )
                    // InternalActivityArchitecture.g:4272:7: rule__ActivityNode__Group_5_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__Group_5_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivityNodeAccess().getGroup_5_3()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__UnorderedGroup_5__Impl"


    // $ANTLR start "rule__ActivityNode__UnorderedGroup_5__0"
    // InternalActivityArchitecture.g:4285:1: rule__ActivityNode__UnorderedGroup_5__0 : rule__ActivityNode__UnorderedGroup_5__Impl ( rule__ActivityNode__UnorderedGroup_5__1 )? ;
    public final void rule__ActivityNode__UnorderedGroup_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4289:1: ( rule__ActivityNode__UnorderedGroup_5__Impl ( rule__ActivityNode__UnorderedGroup_5__1 )? )
            // InternalActivityArchitecture.g:4290:2: rule__ActivityNode__UnorderedGroup_5__Impl ( rule__ActivityNode__UnorderedGroup_5__1 )?
            {
            pushFollow(FOLLOW_40);
            rule__ActivityNode__UnorderedGroup_5__Impl();

            state._fsp--;

            // InternalActivityArchitecture.g:4291:2: ( rule__ActivityNode__UnorderedGroup_5__1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( LA34_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0) ) {
                alt34=1;
            }
            else if ( LA34_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1) ) {
                alt34=1;
            }
            else if ( LA34_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2) ) {
                alt34=1;
            }
            else if ( LA34_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalActivityArchitecture.g:4291:2: rule__ActivityNode__UnorderedGroup_5__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__UnorderedGroup_5__1();

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
    // $ANTLR end "rule__ActivityNode__UnorderedGroup_5__0"


    // $ANTLR start "rule__ActivityNode__UnorderedGroup_5__1"
    // InternalActivityArchitecture.g:4297:1: rule__ActivityNode__UnorderedGroup_5__1 : rule__ActivityNode__UnorderedGroup_5__Impl ( rule__ActivityNode__UnorderedGroup_5__2 )? ;
    public final void rule__ActivityNode__UnorderedGroup_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4301:1: ( rule__ActivityNode__UnorderedGroup_5__Impl ( rule__ActivityNode__UnorderedGroup_5__2 )? )
            // InternalActivityArchitecture.g:4302:2: rule__ActivityNode__UnorderedGroup_5__Impl ( rule__ActivityNode__UnorderedGroup_5__2 )?
            {
            pushFollow(FOLLOW_40);
            rule__ActivityNode__UnorderedGroup_5__Impl();

            state._fsp--;

            // InternalActivityArchitecture.g:4303:2: ( rule__ActivityNode__UnorderedGroup_5__2 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( LA35_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0) ) {
                alt35=1;
            }
            else if ( LA35_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1) ) {
                alt35=1;
            }
            else if ( LA35_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2) ) {
                alt35=1;
            }
            else if ( LA35_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalActivityArchitecture.g:4303:2: rule__ActivityNode__UnorderedGroup_5__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__UnorderedGroup_5__2();

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
    // $ANTLR end "rule__ActivityNode__UnorderedGroup_5__1"


    // $ANTLR start "rule__ActivityNode__UnorderedGroup_5__2"
    // InternalActivityArchitecture.g:4309:1: rule__ActivityNode__UnorderedGroup_5__2 : rule__ActivityNode__UnorderedGroup_5__Impl ( rule__ActivityNode__UnorderedGroup_5__3 )? ;
    public final void rule__ActivityNode__UnorderedGroup_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4313:1: ( rule__ActivityNode__UnorderedGroup_5__Impl ( rule__ActivityNode__UnorderedGroup_5__3 )? )
            // InternalActivityArchitecture.g:4314:2: rule__ActivityNode__UnorderedGroup_5__Impl ( rule__ActivityNode__UnorderedGroup_5__3 )?
            {
            pushFollow(FOLLOW_40);
            rule__ActivityNode__UnorderedGroup_5__Impl();

            state._fsp--;

            // InternalActivityArchitecture.g:4315:2: ( rule__ActivityNode__UnorderedGroup_5__3 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( LA36_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 0) ) {
                alt36=1;
            }
            else if ( LA36_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 1) ) {
                alt36=1;
            }
            else if ( LA36_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 2) ) {
                alt36=1;
            }
            else if ( LA36_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivityNodeAccess().getUnorderedGroup_5(), 3) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalActivityArchitecture.g:4315:2: rule__ActivityNode__UnorderedGroup_5__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivityNode__UnorderedGroup_5__3();

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
    // $ANTLR end "rule__ActivityNode__UnorderedGroup_5__2"


    // $ANTLR start "rule__ActivityNode__UnorderedGroup_5__3"
    // InternalActivityArchitecture.g:4321:1: rule__ActivityNode__UnorderedGroup_5__3 : rule__ActivityNode__UnorderedGroup_5__Impl ;
    public final void rule__ActivityNode__UnorderedGroup_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4325:1: ( rule__ActivityNode__UnorderedGroup_5__Impl )
            // InternalActivityArchitecture.g:4326:2: rule__ActivityNode__UnorderedGroup_5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityNode__UnorderedGroup_5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__UnorderedGroup_5__3"


    // $ANTLR start "rule__Sporadic__UnorderedGroup_3"
    // InternalActivityArchitecture.g:4333:1: rule__Sporadic__UnorderedGroup_3 : ( rule__Sporadic__UnorderedGroup_3__0 )? ;
    public final void rule__Sporadic__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
        	
        try {
            // InternalActivityArchitecture.g:4338:1: ( ( rule__Sporadic__UnorderedGroup_3__0 )? )
            // InternalActivityArchitecture.g:4339:2: ( rule__Sporadic__UnorderedGroup_3__0 )?
            {
            // InternalActivityArchitecture.g:4339:2: ( rule__Sporadic__UnorderedGroup_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( LA37_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0) ) {
                alt37=1;
            }
            else if ( LA37_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalActivityArchitecture.g:4339:2: rule__Sporadic__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sporadic__UnorderedGroup_3__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__UnorderedGroup_3"


    // $ANTLR start "rule__Sporadic__UnorderedGroup_3__Impl"
    // InternalActivityArchitecture.g:4347:1: rule__Sporadic__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Sporadic__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sporadic__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__Sporadic__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalActivityArchitecture.g:4352:1: ( ( ({...}? => ( ( ( rule__Sporadic__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sporadic__Group_3_1__0 ) ) ) ) ) )
            // InternalActivityArchitecture.g:4353:3: ( ({...}? => ( ( ( rule__Sporadic__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sporadic__Group_3_1__0 ) ) ) ) )
            {
            // InternalActivityArchitecture.g:4353:3: ( ({...}? => ( ( ( rule__Sporadic__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sporadic__Group_3_1__0 ) ) ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( LA38_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0) ) {
                alt38=1;
            }
            else if ( LA38_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalActivityArchitecture.g:4354:3: ({...}? => ( ( ( rule__Sporadic__Group_3_0__0 ) ) ) )
                    {
                    // InternalActivityArchitecture.g:4354:3: ({...}? => ( ( ( rule__Sporadic__Group_3_0__0 ) ) ) )
                    // InternalActivityArchitecture.g:4355:4: {...}? => ( ( ( rule__Sporadic__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Sporadic__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalActivityArchitecture.g:4355:104: ( ( ( rule__Sporadic__Group_3_0__0 ) ) )
                    // InternalActivityArchitecture.g:4356:5: ( ( rule__Sporadic__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalActivityArchitecture.g:4362:5: ( ( rule__Sporadic__Group_3_0__0 ) )
                    // InternalActivityArchitecture.g:4363:6: ( rule__Sporadic__Group_3_0__0 )
                    {
                     before(grammarAccess.getSporadicAccess().getGroup_3_0()); 
                    // InternalActivityArchitecture.g:4364:6: ( rule__Sporadic__Group_3_0__0 )
                    // InternalActivityArchitecture.g:4364:7: rule__Sporadic__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sporadic__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSporadicAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:4369:3: ({...}? => ( ( ( rule__Sporadic__Group_3_1__0 ) ) ) )
                    {
                    // InternalActivityArchitecture.g:4369:3: ({...}? => ( ( ( rule__Sporadic__Group_3_1__0 ) ) ) )
                    // InternalActivityArchitecture.g:4370:4: {...}? => ( ( ( rule__Sporadic__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Sporadic__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalActivityArchitecture.g:4370:104: ( ( ( rule__Sporadic__Group_3_1__0 ) ) )
                    // InternalActivityArchitecture.g:4371:5: ( ( rule__Sporadic__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalActivityArchitecture.g:4377:5: ( ( rule__Sporadic__Group_3_1__0 ) )
                    // InternalActivityArchitecture.g:4378:6: ( rule__Sporadic__Group_3_1__0 )
                    {
                     before(grammarAccess.getSporadicAccess().getGroup_3_1()); 
                    // InternalActivityArchitecture.g:4379:6: ( rule__Sporadic__Group_3_1__0 )
                    // InternalActivityArchitecture.g:4379:7: rule__Sporadic__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sporadic__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSporadicAccess().getGroup_3_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSporadicAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Sporadic__UnorderedGroup_3__0"
    // InternalActivityArchitecture.g:4392:1: rule__Sporadic__UnorderedGroup_3__0 : rule__Sporadic__UnorderedGroup_3__Impl ( rule__Sporadic__UnorderedGroup_3__1 )? ;
    public final void rule__Sporadic__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4396:1: ( rule__Sporadic__UnorderedGroup_3__Impl ( rule__Sporadic__UnorderedGroup_3__1 )? )
            // InternalActivityArchitecture.g:4397:2: rule__Sporadic__UnorderedGroup_3__Impl ( rule__Sporadic__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_41);
            rule__Sporadic__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalActivityArchitecture.g:4398:2: ( rule__Sporadic__UnorderedGroup_3__1 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getSporadicAccess().getUnorderedGroup_3(), 1) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalActivityArchitecture.g:4398:2: rule__Sporadic__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Sporadic__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__Sporadic__UnorderedGroup_3__0"


    // $ANTLR start "rule__Sporadic__UnorderedGroup_3__1"
    // InternalActivityArchitecture.g:4404:1: rule__Sporadic__UnorderedGroup_3__1 : rule__Sporadic__UnorderedGroup_3__Impl ;
    public final void rule__Sporadic__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4408:1: ( rule__Sporadic__UnorderedGroup_3__Impl )
            // InternalActivityArchitecture.g:4409:2: rule__Sporadic__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sporadic__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__UnorderedGroup_3__1"


    // $ANTLR start "rule__Scheduler__UnorderedGroup_2"
    // InternalActivityArchitecture.g:4416:1: rule__Scheduler__UnorderedGroup_2 : ( rule__Scheduler__UnorderedGroup_2__0 )? ;
    public final void rule__Scheduler__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
        	
        try {
            // InternalActivityArchitecture.g:4421:1: ( ( rule__Scheduler__UnorderedGroup_2__0 )? )
            // InternalActivityArchitecture.g:4422:2: ( rule__Scheduler__UnorderedGroup_2__0 )?
            {
            // InternalActivityArchitecture.g:4422:2: ( rule__Scheduler__UnorderedGroup_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalActivityArchitecture.g:4422:2: rule__Scheduler__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scheduler__UnorderedGroup_2__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__UnorderedGroup_2"


    // $ANTLR start "rule__Scheduler__UnorderedGroup_2__Impl"
    // InternalActivityArchitecture.g:4430:1: rule__Scheduler__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__Scheduler__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Scheduler__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__Scheduler__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalActivityArchitecture.g:4435:1: ( ( ({...}? => ( ( ( rule__Scheduler__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Scheduler__Group_2_1__0 ) ) ) ) ) )
            // InternalActivityArchitecture.g:4436:3: ( ({...}? => ( ( ( rule__Scheduler__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Scheduler__Group_2_1__0 ) ) ) ) )
            {
            // InternalActivityArchitecture.g:4436:3: ( ({...}? => ( ( ( rule__Scheduler__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Scheduler__Group_2_1__0 ) ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalActivityArchitecture.g:4437:3: ({...}? => ( ( ( rule__Scheduler__Group_2_0__0 ) ) ) )
                    {
                    // InternalActivityArchitecture.g:4437:3: ({...}? => ( ( ( rule__Scheduler__Group_2_0__0 ) ) ) )
                    // InternalActivityArchitecture.g:4438:4: {...}? => ( ( ( rule__Scheduler__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Scheduler__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalActivityArchitecture.g:4438:105: ( ( ( rule__Scheduler__Group_2_0__0 ) ) )
                    // InternalActivityArchitecture.g:4439:5: ( ( rule__Scheduler__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalActivityArchitecture.g:4445:5: ( ( rule__Scheduler__Group_2_0__0 ) )
                    // InternalActivityArchitecture.g:4446:6: ( rule__Scheduler__Group_2_0__0 )
                    {
                     before(grammarAccess.getSchedulerAccess().getGroup_2_0()); 
                    // InternalActivityArchitecture.g:4447:6: ( rule__Scheduler__Group_2_0__0 )
                    // InternalActivityArchitecture.g:4447:7: rule__Scheduler__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scheduler__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSchedulerAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:4452:3: ({...}? => ( ( ( rule__Scheduler__Group_2_1__0 ) ) ) )
                    {
                    // InternalActivityArchitecture.g:4452:3: ({...}? => ( ( ( rule__Scheduler__Group_2_1__0 ) ) ) )
                    // InternalActivityArchitecture.g:4453:4: {...}? => ( ( ( rule__Scheduler__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Scheduler__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalActivityArchitecture.g:4453:105: ( ( ( rule__Scheduler__Group_2_1__0 ) ) )
                    // InternalActivityArchitecture.g:4454:5: ( ( rule__Scheduler__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalActivityArchitecture.g:4460:5: ( ( rule__Scheduler__Group_2_1__0 ) )
                    // InternalActivityArchitecture.g:4461:6: ( rule__Scheduler__Group_2_1__0 )
                    {
                     before(grammarAccess.getSchedulerAccess().getGroup_2_1()); 
                    // InternalActivityArchitecture.g:4462:6: ( rule__Scheduler__Group_2_1__0 )
                    // InternalActivityArchitecture.g:4462:7: rule__Scheduler__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scheduler__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSchedulerAccess().getGroup_2_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSchedulerAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__Scheduler__UnorderedGroup_2__0"
    // InternalActivityArchitecture.g:4475:1: rule__Scheduler__UnorderedGroup_2__0 : rule__Scheduler__UnorderedGroup_2__Impl ( rule__Scheduler__UnorderedGroup_2__1 )? ;
    public final void rule__Scheduler__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4479:1: ( rule__Scheduler__UnorderedGroup_2__Impl ( rule__Scheduler__UnorderedGroup_2__1 )? )
            // InternalActivityArchitecture.g:4480:2: rule__Scheduler__UnorderedGroup_2__Impl ( rule__Scheduler__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_42);
            rule__Scheduler__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalActivityArchitecture.g:4481:2: ( rule__Scheduler__UnorderedGroup_2__1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getSchedulerAccess().getUnorderedGroup_2(), 1) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalActivityArchitecture.g:4481:2: rule__Scheduler__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scheduler__UnorderedGroup_2__1();

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
    // $ANTLR end "rule__Scheduler__UnorderedGroup_2__0"


    // $ANTLR start "rule__Scheduler__UnorderedGroup_2__1"
    // InternalActivityArchitecture.g:4487:1: rule__Scheduler__UnorderedGroup_2__1 : rule__Scheduler__UnorderedGroup_2__Impl ;
    public final void rule__Scheduler__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4491:1: ( rule__Scheduler__UnorderedGroup_2__Impl )
            // InternalActivityArchitecture.g:4492:2: rule__Scheduler__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scheduler__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__UnorderedGroup_2__1"


    // $ANTLR start "rule__ExecutionTime__UnorderedGroup_1"
    // InternalActivityArchitecture.g:4499:1: rule__ExecutionTime__UnorderedGroup_1 : rule__ExecutionTime__UnorderedGroup_1__0 {...}?;
    public final void rule__ExecutionTime__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
        	
        try {
            // InternalActivityArchitecture.g:4504:1: ( rule__ExecutionTime__UnorderedGroup_1__0 {...}?)
            // InternalActivityArchitecture.g:4505:2: rule__ExecutionTime__UnorderedGroup_1__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionTime__UnorderedGroup_1__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1()) ) {
                throw new FailedPredicateException(input, "rule__ExecutionTime__UnorderedGroup_1", "getUnorderedGroupHelper().canLeave(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__UnorderedGroup_1"


    // $ANTLR start "rule__ExecutionTime__UnorderedGroup_1__Impl"
    // InternalActivityArchitecture.g:4513:1: rule__ExecutionTime__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__ExecutionTime__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ExecutionTime__Group_1_1__0 ) ) ) ) ) ;
    public final void rule__ExecutionTime__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalActivityArchitecture.g:4518:1: ( ( ({...}? => ( ( ( rule__ExecutionTime__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ExecutionTime__Group_1_1__0 ) ) ) ) ) )
            // InternalActivityArchitecture.g:4519:3: ( ({...}? => ( ( ( rule__ExecutionTime__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ExecutionTime__Group_1_1__0 ) ) ) ) )
            {
            // InternalActivityArchitecture.g:4519:3: ( ({...}? => ( ( ( rule__ExecutionTime__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ExecutionTime__Group_1_1__0 ) ) ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalActivityArchitecture.g:4520:3: ({...}? => ( ( ( rule__ExecutionTime__Group_1_0__0 ) ) ) )
                    {
                    // InternalActivityArchitecture.g:4520:3: ({...}? => ( ( ( rule__ExecutionTime__Group_1_0__0 ) ) ) )
                    // InternalActivityArchitecture.g:4521:4: {...}? => ( ( ( rule__ExecutionTime__Group_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ExecutionTime__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalActivityArchitecture.g:4521:109: ( ( ( rule__ExecutionTime__Group_1_0__0 ) ) )
                    // InternalActivityArchitecture.g:4522:5: ( ( rule__ExecutionTime__Group_1_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalActivityArchitecture.g:4528:5: ( ( rule__ExecutionTime__Group_1_0__0 ) )
                    // InternalActivityArchitecture.g:4529:6: ( rule__ExecutionTime__Group_1_0__0 )
                    {
                     before(grammarAccess.getExecutionTimeAccess().getGroup_1_0()); 
                    // InternalActivityArchitecture.g:4530:6: ( rule__ExecutionTime__Group_1_0__0 )
                    // InternalActivityArchitecture.g:4530:7: rule__ExecutionTime__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExecutionTime__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecutionTimeAccess().getGroup_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalActivityArchitecture.g:4535:3: ({...}? => ( ( ( rule__ExecutionTime__Group_1_1__0 ) ) ) )
                    {
                    // InternalActivityArchitecture.g:4535:3: ({...}? => ( ( ( rule__ExecutionTime__Group_1_1__0 ) ) ) )
                    // InternalActivityArchitecture.g:4536:4: {...}? => ( ( ( rule__ExecutionTime__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ExecutionTime__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalActivityArchitecture.g:4536:109: ( ( ( rule__ExecutionTime__Group_1_1__0 ) ) )
                    // InternalActivityArchitecture.g:4537:5: ( ( rule__ExecutionTime__Group_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalActivityArchitecture.g:4543:5: ( ( rule__ExecutionTime__Group_1_1__0 ) )
                    // InternalActivityArchitecture.g:4544:6: ( rule__ExecutionTime__Group_1_1__0 )
                    {
                     before(grammarAccess.getExecutionTimeAccess().getGroup_1_1()); 
                    // InternalActivityArchitecture.g:4545:6: ( rule__ExecutionTime__Group_1_1__0 )
                    // InternalActivityArchitecture.g:4545:7: rule__ExecutionTime__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExecutionTime__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExecutionTimeAccess().getGroup_1_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__ExecutionTime__UnorderedGroup_1__0"
    // InternalActivityArchitecture.g:4558:1: rule__ExecutionTime__UnorderedGroup_1__0 : rule__ExecutionTime__UnorderedGroup_1__Impl ( rule__ExecutionTime__UnorderedGroup_1__1 )? ;
    public final void rule__ExecutionTime__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4562:1: ( rule__ExecutionTime__UnorderedGroup_1__Impl ( rule__ExecutionTime__UnorderedGroup_1__1 )? )
            // InternalActivityArchitecture.g:4563:2: rule__ExecutionTime__UnorderedGroup_1__Impl ( rule__ExecutionTime__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_43);
            rule__ExecutionTime__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalActivityArchitecture.g:4564:2: ( rule__ExecutionTime__UnorderedGroup_1__1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getExecutionTimeAccess().getUnorderedGroup_1(), 1) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalActivityArchitecture.g:4564:2: rule__ExecutionTime__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExecutionTime__UnorderedGroup_1__1();

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
    // $ANTLR end "rule__ExecutionTime__UnorderedGroup_1__0"


    // $ANTLR start "rule__ExecutionTime__UnorderedGroup_1__1"
    // InternalActivityArchitecture.g:4570:1: rule__ExecutionTime__UnorderedGroup_1__1 : rule__ExecutionTime__UnorderedGroup_1__Impl ;
    public final void rule__ExecutionTime__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4574:1: ( rule__ExecutionTime__UnorderedGroup_1__Impl )
            // InternalActivityArchitecture.g:4575:2: rule__ExecutionTime__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExecutionTime__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__UnorderedGroup_1__1"


    // $ANTLR start "rule__ActivityArchitectureModel__NameAssignment_2"
    // InternalActivityArchitecture.g:4582:1: rule__ActivityArchitectureModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActivityArchitectureModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4586:1: ( ( RULE_ID ) )
            // InternalActivityArchitecture.g:4587:2: ( RULE_ID )
            {
            // InternalActivityArchitecture.g:4587:2: ( RULE_ID )
            // InternalActivityArchitecture.g:4588:3: RULE_ID
            {
             before(grammarAccess.getActivityArchitectureModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityArchitectureModelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__NameAssignment_2"


    // $ANTLR start "rule__ActivityArchitectureModel__ElementsAssignment_4"
    // InternalActivityArchitecture.g:4597:1: rule__ActivityArchitectureModel__ElementsAssignment_4 : ( ruleAbstractActivityArchitectureElement ) ;
    public final void rule__ActivityArchitectureModel__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4601:1: ( ( ruleAbstractActivityArchitectureElement ) )
            // InternalActivityArchitecture.g:4602:2: ( ruleAbstractActivityArchitectureElement )
            {
            // InternalActivityArchitecture.g:4602:2: ( ruleAbstractActivityArchitectureElement )
            // InternalActivityArchitecture.g:4603:3: ruleAbstractActivityArchitectureElement
            {
             before(grammarAccess.getActivityArchitectureModelAccess().getElementsAbstractActivityArchitectureElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractActivityArchitectureElement();

            state._fsp--;

             after(grammarAccess.getActivityArchitectureModelAccess().getElementsAbstractActivityArchitectureElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityArchitectureModel__ElementsAssignment_4"


    // $ANTLR start "rule__DataFlow__SourceAssignment_3"
    // InternalActivityArchitecture.g:4612:1: rule__DataFlow__SourceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__DataFlow__SourceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4616:1: ( ( ( ruleFQN ) ) )
            // InternalActivityArchitecture.g:4617:2: ( ( ruleFQN ) )
            {
            // InternalActivityArchitecture.g:4617:2: ( ( ruleFQN ) )
            // InternalActivityArchitecture.g:4618:3: ( ruleFQN )
            {
             before(grammarAccess.getDataFlowAccess().getSourceAbstractSourceNodeCrossReference_3_0()); 
            // InternalActivityArchitecture.g:4619:3: ( ruleFQN )
            // InternalActivityArchitecture.g:4620:4: ruleFQN
            {
             before(grammarAccess.getDataFlowAccess().getSourceAbstractSourceNodeFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDataFlowAccess().getSourceAbstractSourceNodeFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getDataFlowAccess().getSourceAbstractSourceNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__SourceAssignment_3"


    // $ANTLR start "rule__DataFlow__DestinationAssignment_5"
    // InternalActivityArchitecture.g:4631:1: rule__DataFlow__DestinationAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__DataFlow__DestinationAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4635:1: ( ( ( ruleFQN ) ) )
            // InternalActivityArchitecture.g:4636:2: ( ( ruleFQN ) )
            {
            // InternalActivityArchitecture.g:4636:2: ( ( ruleFQN ) )
            // InternalActivityArchitecture.g:4637:3: ( ruleFQN )
            {
             before(grammarAccess.getDataFlowAccess().getDestinationAbstractInputNodeCrossReference_5_0()); 
            // InternalActivityArchitecture.g:4638:3: ( ruleFQN )
            // InternalActivityArchitecture.g:4639:4: ruleFQN
            {
             before(grammarAccess.getDataFlowAccess().getDestinationAbstractInputNodeFQNParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDataFlowAccess().getDestinationAbstractInputNodeFQNParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getDataFlowAccess().getDestinationAbstractInputNodeCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataFlow__DestinationAssignment_5"


    // $ANTLR start "rule__InputHandlerNode__NameAssignment_2"
    // InternalActivityArchitecture.g:4650:1: rule__InputHandlerNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InputHandlerNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4654:1: ( ( RULE_ID ) )
            // InternalActivityArchitecture.g:4655:2: ( RULE_ID )
            {
            // InternalActivityArchitecture.g:4655:2: ( RULE_ID )
            // InternalActivityArchitecture.g:4656:3: RULE_ID
            {
             before(grammarAccess.getInputHandlerNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputHandlerNodeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__NameAssignment_2"


    // $ANTLR start "rule__InputHandlerNode__InputNodeAssignment_4_1"
    // InternalActivityArchitecture.g:4665:1: rule__InputHandlerNode__InputNodeAssignment_4_1 : ( ruleHandlerTriggerInputNode ) ;
    public final void rule__InputHandlerNode__InputNodeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4669:1: ( ( ruleHandlerTriggerInputNode ) )
            // InternalActivityArchitecture.g:4670:2: ( ruleHandlerTriggerInputNode )
            {
            // InternalActivityArchitecture.g:4670:2: ( ruleHandlerTriggerInputNode )
            // InternalActivityArchitecture.g:4671:3: ruleHandlerTriggerInputNode
            {
             before(grammarAccess.getInputHandlerNodeAccess().getInputNodeHandlerTriggerInputNodeParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleHandlerTriggerInputNode();

            state._fsp--;

             after(grammarAccess.getInputHandlerNodeAccess().getInputNodeHandlerTriggerInputNodeParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__InputNodeAssignment_4_1"


    // $ANTLR start "rule__InputHandlerNode__PrescaleAssignment_5_1"
    // InternalActivityArchitecture.g:4680:1: rule__InputHandlerNode__PrescaleAssignment_5_1 : ( ruleEInt ) ;
    public final void rule__InputHandlerNode__PrescaleAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4684:1: ( ( ruleEInt ) )
            // InternalActivityArchitecture.g:4685:2: ( ruleEInt )
            {
            // InternalActivityArchitecture.g:4685:2: ( ruleEInt )
            // InternalActivityArchitecture.g:4686:3: ruleEInt
            {
             before(grammarAccess.getInputHandlerNodeAccess().getPrescaleEIntParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getInputHandlerNodeAccess().getPrescaleEIntParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerNode__PrescaleAssignment_5_1"


    // $ANTLR start "rule__HandlerTriggerInputNode__NameAssignment_2"
    // InternalActivityArchitecture.g:4695:1: rule__HandlerTriggerInputNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__HandlerTriggerInputNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4699:1: ( ( RULE_ID ) )
            // InternalActivityArchitecture.g:4700:2: ( RULE_ID )
            {
            // InternalActivityArchitecture.g:4700:2: ( RULE_ID )
            // InternalActivityArchitecture.g:4701:3: RULE_ID
            {
             before(grammarAccess.getHandlerTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getHandlerTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__HandlerTriggerInputNode__NameAssignment_2"


    // $ANTLR start "rule__ActivityNode__NameAssignment_2"
    // InternalActivityArchitecture.g:4710:1: rule__ActivityNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ActivityNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4714:1: ( ( RULE_ID ) )
            // InternalActivityArchitecture.g:4715:2: ( RULE_ID )
            {
            // InternalActivityArchitecture.g:4715:2: ( RULE_ID )
            // InternalActivityArchitecture.g:4716:3: RULE_ID
            {
             before(grammarAccess.getActivityNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityNodeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__NameAssignment_2"


    // $ANTLR start "rule__ActivityNode__InputsAssignment_4_2"
    // InternalActivityArchitecture.g:4725:1: rule__ActivityNode__InputsAssignment_4_2 : ( ruleAbstractInputNode ) ;
    public final void rule__ActivityNode__InputsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4729:1: ( ( ruleAbstractInputNode ) )
            // InternalActivityArchitecture.g:4730:2: ( ruleAbstractInputNode )
            {
            // InternalActivityArchitecture.g:4730:2: ( ruleAbstractInputNode )
            // InternalActivityArchitecture.g:4731:3: ruleAbstractInputNode
            {
             before(grammarAccess.getActivityNodeAccess().getInputsAbstractInputNodeParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractInputNode();

            state._fsp--;

             after(grammarAccess.getActivityNodeAccess().getInputsAbstractInputNodeParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__InputsAssignment_4_2"


    // $ANTLR start "rule__ActivityNode__AffinityAssignment_5_0_1"
    // InternalActivityArchitecture.g:4740:1: rule__ActivityNode__AffinityAssignment_5_0_1 : ( ( ruleFQN ) ) ;
    public final void rule__ActivityNode__AffinityAssignment_5_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4744:1: ( ( ( ruleFQN ) ) )
            // InternalActivityArchitecture.g:4745:2: ( ( ruleFQN ) )
            {
            // InternalActivityArchitecture.g:4745:2: ( ( ruleFQN ) )
            // InternalActivityArchitecture.g:4746:3: ( ruleFQN )
            {
             before(grammarAccess.getActivityNodeAccess().getAffinityCPUCoreCrossReference_5_0_1_0()); 
            // InternalActivityArchitecture.g:4747:3: ( ruleFQN )
            // InternalActivityArchitecture.g:4748:4: ruleFQN
            {
             before(grammarAccess.getActivityNodeAccess().getAffinityCPUCoreFQNParserRuleCall_5_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActivityNodeAccess().getAffinityCPUCoreFQNParserRuleCall_5_0_1_0_1()); 

            }

             after(grammarAccess.getActivityNodeAccess().getAffinityCPUCoreCrossReference_5_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__AffinityAssignment_5_0_1"


    // $ANTLR start "rule__ActivityNode__ActivationSourceAssignment_5_1_1"
    // InternalActivityArchitecture.g:4759:1: rule__ActivityNode__ActivationSourceAssignment_5_1_1 : ( ruleActivationSource ) ;
    public final void rule__ActivityNode__ActivationSourceAssignment_5_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4763:1: ( ( ruleActivationSource ) )
            // InternalActivityArchitecture.g:4764:2: ( ruleActivationSource )
            {
            // InternalActivityArchitecture.g:4764:2: ( ruleActivationSource )
            // InternalActivityArchitecture.g:4765:3: ruleActivationSource
            {
             before(grammarAccess.getActivityNodeAccess().getActivationSourceActivationSourceParserRuleCall_5_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleActivationSource();

            state._fsp--;

             after(grammarAccess.getActivityNodeAccess().getActivationSourceActivationSourceParserRuleCall_5_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__ActivationSourceAssignment_5_1_1"


    // $ANTLR start "rule__ActivityNode__ExecutionTimeAssignment_5_2_1"
    // InternalActivityArchitecture.g:4774:1: rule__ActivityNode__ExecutionTimeAssignment_5_2_1 : ( ruleExecutionTime ) ;
    public final void rule__ActivityNode__ExecutionTimeAssignment_5_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4778:1: ( ( ruleExecutionTime ) )
            // InternalActivityArchitecture.g:4779:2: ( ruleExecutionTime )
            {
            // InternalActivityArchitecture.g:4779:2: ( ruleExecutionTime )
            // InternalActivityArchitecture.g:4780:3: ruleExecutionTime
            {
             before(grammarAccess.getActivityNodeAccess().getExecutionTimeExecutionTimeParserRuleCall_5_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExecutionTime();

            state._fsp--;

             after(grammarAccess.getActivityNodeAccess().getExecutionTimeExecutionTimeParserRuleCall_5_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__ExecutionTimeAssignment_5_2_1"


    // $ANTLR start "rule__ActivityNode__SchedulerAssignment_5_3_1"
    // InternalActivityArchitecture.g:4789:1: rule__ActivityNode__SchedulerAssignment_5_3_1 : ( ruleScheduler ) ;
    public final void rule__ActivityNode__SchedulerAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4793:1: ( ( ruleScheduler ) )
            // InternalActivityArchitecture.g:4794:2: ( ruleScheduler )
            {
            // InternalActivityArchitecture.g:4794:2: ( ruleScheduler )
            // InternalActivityArchitecture.g:4795:3: ruleScheduler
            {
             before(grammarAccess.getActivityNodeAccess().getSchedulerSchedulerParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScheduler();

            state._fsp--;

             after(grammarAccess.getActivityNodeAccess().getSchedulerSchedulerParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityNode__SchedulerAssignment_5_3_1"


    // $ANTLR start "rule__RegisterInputNode__NameAssignment_2"
    // InternalActivityArchitecture.g:4804:1: rule__RegisterInputNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RegisterInputNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4808:1: ( ( RULE_ID ) )
            // InternalActivityArchitecture.g:4809:2: ( RULE_ID )
            {
            // InternalActivityArchitecture.g:4809:2: ( RULE_ID )
            // InternalActivityArchitecture.g:4810:3: RULE_ID
            {
             before(grammarAccess.getRegisterInputNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRegisterInputNodeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RegisterInputNode__NameAssignment_2"


    // $ANTLR start "rule__TriggerInputNode__NameAssignment_2"
    // InternalActivityArchitecture.g:4819:1: rule__TriggerInputNode__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__TriggerInputNode__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4823:1: ( ( RULE_ID ) )
            // InternalActivityArchitecture.g:4824:2: ( RULE_ID )
            {
            // InternalActivityArchitecture.g:4824:2: ( RULE_ID )
            // InternalActivityArchitecture.g:4825:3: RULE_ID
            {
             before(grammarAccess.getTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTriggerInputNodeAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TriggerInputNode__NameAssignment_2"


    // $ANTLR start "rule__Sporadic__MinActFreqAssignment_3_0_1"
    // InternalActivityArchitecture.g:4834:1: rule__Sporadic__MinActFreqAssignment_3_0_1 : ( ruleEDouble ) ;
    public final void rule__Sporadic__MinActFreqAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4838:1: ( ( ruleEDouble ) )
            // InternalActivityArchitecture.g:4839:2: ( ruleEDouble )
            {
            // InternalActivityArchitecture.g:4839:2: ( ruleEDouble )
            // InternalActivityArchitecture.g:4840:3: ruleEDouble
            {
             before(grammarAccess.getSporadicAccess().getMinActFreqEDoubleParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSporadicAccess().getMinActFreqEDoubleParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__MinActFreqAssignment_3_0_1"


    // $ANTLR start "rule__Sporadic__MaxActFreqAssignment_3_1_1"
    // InternalActivityArchitecture.g:4849:1: rule__Sporadic__MaxActFreqAssignment_3_1_1 : ( ruleEDouble ) ;
    public final void rule__Sporadic__MaxActFreqAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4853:1: ( ( ruleEDouble ) )
            // InternalActivityArchitecture.g:4854:2: ( ruleEDouble )
            {
            // InternalActivityArchitecture.g:4854:2: ( ruleEDouble )
            // InternalActivityArchitecture.g:4855:3: ruleEDouble
            {
             before(grammarAccess.getSporadicAccess().getMaxActFreqEDoubleParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getSporadicAccess().getMaxActFreqEDoubleParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sporadic__MaxActFreqAssignment_3_1_1"


    // $ANTLR start "rule__DataTriggered__TriggerRefAssignment_1"
    // InternalActivityArchitecture.g:4864:1: rule__DataTriggered__TriggerRefAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DataTriggered__TriggerRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4868:1: ( ( ( ruleFQN ) ) )
            // InternalActivityArchitecture.g:4869:2: ( ( ruleFQN ) )
            {
            // InternalActivityArchitecture.g:4869:2: ( ( ruleFQN ) )
            // InternalActivityArchitecture.g:4870:3: ( ruleFQN )
            {
             before(grammarAccess.getDataTriggeredAccess().getTriggerRefTriggerInputNodeCrossReference_1_0()); 
            // InternalActivityArchitecture.g:4871:3: ( ruleFQN )
            // InternalActivityArchitecture.g:4872:4: ruleFQN
            {
             before(grammarAccess.getDataTriggeredAccess().getTriggerRefTriggerInputNodeFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDataTriggeredAccess().getTriggerRefTriggerInputNodeFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDataTriggeredAccess().getTriggerRefTriggerInputNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__TriggerRefAssignment_1"


    // $ANTLR start "rule__DataTriggered__PrescaleAssignment_4"
    // InternalActivityArchitecture.g:4883:1: rule__DataTriggered__PrescaleAssignment_4 : ( ruleEInt ) ;
    public final void rule__DataTriggered__PrescaleAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4887:1: ( ( ruleEInt ) )
            // InternalActivityArchitecture.g:4888:2: ( ruleEInt )
            {
            // InternalActivityArchitecture.g:4888:2: ( ruleEInt )
            // InternalActivityArchitecture.g:4889:3: ruleEInt
            {
             before(grammarAccess.getDataTriggeredAccess().getPrescaleEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDataTriggeredAccess().getPrescaleEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTriggered__PrescaleAssignment_4"


    // $ANTLR start "rule__PeriodicTimer__PeriodicActFreqAssignment_3"
    // InternalActivityArchitecture.g:4898:1: rule__PeriodicTimer__PeriodicActFreqAssignment_3 : ( ruleEDouble ) ;
    public final void rule__PeriodicTimer__PeriodicActFreqAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4902:1: ( ( ruleEDouble ) )
            // InternalActivityArchitecture.g:4903:2: ( ruleEDouble )
            {
            // InternalActivityArchitecture.g:4903:2: ( ruleEDouble )
            // InternalActivityArchitecture.g:4904:3: ruleEDouble
            {
             before(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PeriodicTimer__PeriodicActFreqAssignment_3"


    // $ANTLR start "rule__Scheduler__TypeAssignment_2_0_1"
    // InternalActivityArchitecture.g:4913:1: rule__Scheduler__TypeAssignment_2_0_1 : ( ruleSchedulerType ) ;
    public final void rule__Scheduler__TypeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4917:1: ( ( ruleSchedulerType ) )
            // InternalActivityArchitecture.g:4918:2: ( ruleSchedulerType )
            {
            // InternalActivityArchitecture.g:4918:2: ( ruleSchedulerType )
            // InternalActivityArchitecture.g:4919:3: ruleSchedulerType
            {
             before(grammarAccess.getSchedulerAccess().getTypeSchedulerTypeEnumRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSchedulerType();

            state._fsp--;

             after(grammarAccess.getSchedulerAccess().getTypeSchedulerTypeEnumRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__TypeAssignment_2_0_1"


    // $ANTLR start "rule__Scheduler__PriorityAssignment_2_1_1"
    // InternalActivityArchitecture.g:4928:1: rule__Scheduler__PriorityAssignment_2_1_1 : ( ruleEInt ) ;
    public final void rule__Scheduler__PriorityAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4932:1: ( ( ruleEInt ) )
            // InternalActivityArchitecture.g:4933:2: ( ruleEInt )
            {
            // InternalActivityArchitecture.g:4933:2: ( ruleEInt )
            // InternalActivityArchitecture.g:4934:3: ruleEInt
            {
             before(grammarAccess.getSchedulerAccess().getPriorityEIntParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getSchedulerAccess().getPriorityEIntParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scheduler__PriorityAssignment_2_1_1"


    // $ANTLR start "rule__CPUCore__NameAssignment_1"
    // InternalActivityArchitecture.g:4943:1: rule__CPUCore__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CPUCore__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4947:1: ( ( RULE_ID ) )
            // InternalActivityArchitecture.g:4948:2: ( RULE_ID )
            {
            // InternalActivityArchitecture.g:4948:2: ( RULE_ID )
            // InternalActivityArchitecture.g:4949:3: RULE_ID
            {
             before(grammarAccess.getCPUCoreAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCPUCoreAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__NameAssignment_1"


    // $ANTLR start "rule__CPUCore__CoreNumberAssignment_4"
    // InternalActivityArchitecture.g:4958:1: rule__CPUCore__CoreNumberAssignment_4 : ( ruleEInt ) ;
    public final void rule__CPUCore__CoreNumberAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4962:1: ( ( ruleEInt ) )
            // InternalActivityArchitecture.g:4963:2: ( ruleEInt )
            {
            // InternalActivityArchitecture.g:4963:2: ( ruleEInt )
            // InternalActivityArchitecture.g:4964:3: ruleEInt
            {
             before(grammarAccess.getCPUCoreAccess().getCoreNumberEIntParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCPUCoreAccess().getCoreNumberEIntParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPUCore__CoreNumberAssignment_4"


    // $ANTLR start "rule__ExecutionTime__MinTimeAssignment_1_0_1"
    // InternalActivityArchitecture.g:4973:1: rule__ExecutionTime__MinTimeAssignment_1_0_1 : ( ruleTimeValue ) ;
    public final void rule__ExecutionTime__MinTimeAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4977:1: ( ( ruleTimeValue ) )
            // InternalActivityArchitecture.g:4978:2: ( ruleTimeValue )
            {
            // InternalActivityArchitecture.g:4978:2: ( ruleTimeValue )
            // InternalActivityArchitecture.g:4979:3: ruleTimeValue
            {
             before(grammarAccess.getExecutionTimeAccess().getMinTimeTimeValueParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeValue();

            state._fsp--;

             after(grammarAccess.getExecutionTimeAccess().getMinTimeTimeValueParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__MinTimeAssignment_1_0_1"


    // $ANTLR start "rule__ExecutionTime__MaxTimeAssignment_1_1_1"
    // InternalActivityArchitecture.g:4988:1: rule__ExecutionTime__MaxTimeAssignment_1_1_1 : ( ruleTimeValue ) ;
    public final void rule__ExecutionTime__MaxTimeAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:4992:1: ( ( ruleTimeValue ) )
            // InternalActivityArchitecture.g:4993:2: ( ruleTimeValue )
            {
            // InternalActivityArchitecture.g:4993:2: ( ruleTimeValue )
            // InternalActivityArchitecture.g:4994:3: ruleTimeValue
            {
             before(grammarAccess.getExecutionTimeAccess().getMaxTimeTimeValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeValue();

            state._fsp--;

             after(grammarAccess.getExecutionTimeAccess().getMaxTimeTimeValueParserRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExecutionTime__MaxTimeAssignment_1_1_1"


    // $ANTLR start "rule__TimeValue__ValueAssignment_0"
    // InternalActivityArchitecture.g:5003:1: rule__TimeValue__ValueAssignment_0 : ( ruleEInt ) ;
    public final void rule__TimeValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:5007:1: ( ( ruleEInt ) )
            // InternalActivityArchitecture.g:5008:2: ( ruleEInt )
            {
            // InternalActivityArchitecture.g:5008:2: ( ruleEInt )
            // InternalActivityArchitecture.g:5009:3: ruleEInt
            {
             before(grammarAccess.getTimeValueAccess().getValueEIntParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getTimeValueAccess().getValueEIntParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__ValueAssignment_0"


    // $ANTLR start "rule__TimeValue__UnitAssignment_1"
    // InternalActivityArchitecture.g:5018:1: rule__TimeValue__UnitAssignment_1 : ( ruleTimeUnit ) ;
    public final void rule__TimeValue__UnitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalActivityArchitecture.g:5022:1: ( ( ruleTimeUnit ) )
            // InternalActivityArchitecture.g:5023:2: ( ruleTimeUnit )
            {
            // InternalActivityArchitecture.g:5023:2: ( ruleTimeUnit )
            // InternalActivityArchitecture.g:5024:3: ruleTimeUnit
            {
             before(grammarAccess.getTimeValueAccess().getUnitTimeUnitEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getTimeValueAccess().getUnitTimeUnitEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeValue__UnitAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0001000109200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0001000109000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000108000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000030200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000003E00000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004040200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004040000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000188000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000050000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000C00010L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000003C00000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000C00000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x000C000000000002L});

}
