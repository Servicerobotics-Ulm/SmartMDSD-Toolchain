package org.xtext.component.componentDefinition.ide.contentassist.antlr.internal;

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
import org.xtext.component.componentDefinition.services.ComponentDefinitionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentDefinitionParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'true'", "'false'", "'#import'", "';'", "'ComponentDefinition'", "'{'", "'}'", "'logo'", "'RequestPort'", "'implements'", "'OutputPort'", "'realizedBy'", "'AnswerPort'", "'InputPort'", "'SupportedMiddleware'", "'Activity'", "'InputHandler'", "'triggeredFrom'", "'RequestHandler'", "'RequestPortLink'", "'OpcUaClientLink'", "'MixedPortROSLink'", "'Observe'", "'InputPortLink'", "'ActivationConstraints'", "'configurable'", "'='", "'minActFreq'", "'Hz'", "'maxActFreq'", "'OperationModeBinding'", "'DefaultTrigger'", "'InputPortTrigger'", "'prescale'", "'PeriodicTimer'", "'ObservedElement'", "'OpcUaDeviceClient'", "'deviceURI'", "'opcuaXmlFile'", "'OpcUaReadServer'", "'dataProviderPort'", "'portNumber'", "'MixedPortROS'", "'MixedPortYARP'", "'CoordinationSlavePort'", "'SkillRealizationsRef'", "'with'", "'PublicOperationMode'", "'activates'", "'('", "')'", "','", "'PrivateOperationMode'", "'CoordinationMasterPort'", "'ComponentParameters'", "'slave'", "'.'", "'.*'", "'-'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'", "'default'", "'activeQueue'", "'optional'", "'oversamplingOk'", "'undersamplingOk'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
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


        public InternalComponentDefinitionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentDefinitionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentDefinitionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentDefinition.g"; }


    	private ComponentDefinitionGrammarAccess grammarAccess;

    	public void setGrammarAccess(ComponentDefinitionGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleComponentDefModel"
    // InternalComponentDefinition.g:94:1: entryRuleComponentDefModel : ruleComponentDefModel EOF ;
    public final void entryRuleComponentDefModel() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:95:1: ( ruleComponentDefModel EOF )
            // InternalComponentDefinition.g:96:1: ruleComponentDefModel EOF
            {
             before(grammarAccess.getComponentDefModelRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentDefModel();

            state._fsp--;

             after(grammarAccess.getComponentDefModelRule()); 
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
    // $ANTLR end "entryRuleComponentDefModel"


    // $ANTLR start "ruleComponentDefModel"
    // InternalComponentDefinition.g:103:1: ruleComponentDefModel : ( ( rule__ComponentDefModel__Group__0 ) ) ;
    public final void ruleComponentDefModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:107:2: ( ( ( rule__ComponentDefModel__Group__0 ) ) )
            // InternalComponentDefinition.g:108:2: ( ( rule__ComponentDefModel__Group__0 ) )
            {
            // InternalComponentDefinition.g:108:2: ( ( rule__ComponentDefModel__Group__0 ) )
            // InternalComponentDefinition.g:109:3: ( rule__ComponentDefModel__Group__0 )
            {
             before(grammarAccess.getComponentDefModelAccess().getGroup()); 
            // InternalComponentDefinition.g:110:3: ( rule__ComponentDefModel__Group__0 )
            // InternalComponentDefinition.g:110:4: rule__ComponentDefModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentDefModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentDefModel"


    // $ANTLR start "entryRuleServiceRepoImport"
    // InternalComponentDefinition.g:119:1: entryRuleServiceRepoImport : ruleServiceRepoImport EOF ;
    public final void entryRuleServiceRepoImport() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:120:1: ( ruleServiceRepoImport EOF )
            // InternalComponentDefinition.g:121:1: ruleServiceRepoImport EOF
            {
             before(grammarAccess.getServiceRepoImportRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceRepoImport();

            state._fsp--;

             after(grammarAccess.getServiceRepoImportRule()); 
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
    // $ANTLR end "entryRuleServiceRepoImport"


    // $ANTLR start "ruleServiceRepoImport"
    // InternalComponentDefinition.g:128:1: ruleServiceRepoImport : ( ( rule__ServiceRepoImport__Group__0 ) ) ;
    public final void ruleServiceRepoImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:132:2: ( ( ( rule__ServiceRepoImport__Group__0 ) ) )
            // InternalComponentDefinition.g:133:2: ( ( rule__ServiceRepoImport__Group__0 ) )
            {
            // InternalComponentDefinition.g:133:2: ( ( rule__ServiceRepoImport__Group__0 ) )
            // InternalComponentDefinition.g:134:3: ( rule__ServiceRepoImport__Group__0 )
            {
             before(grammarAccess.getServiceRepoImportAccess().getGroup()); 
            // InternalComponentDefinition.g:135:3: ( rule__ServiceRepoImport__Group__0 )
            // InternalComponentDefinition.g:135:4: rule__ServiceRepoImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceRepoImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceRepoImportAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceRepoImport"


    // $ANTLR start "entryRuleComponentDefinition"
    // InternalComponentDefinition.g:144:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:145:1: ( ruleComponentDefinition EOF )
            // InternalComponentDefinition.g:146:1: ruleComponentDefinition EOF
            {
             before(grammarAccess.getComponentDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getComponentDefinitionRule()); 
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
    // $ANTLR end "entryRuleComponentDefinition"


    // $ANTLR start "ruleComponentDefinition"
    // InternalComponentDefinition.g:153:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Group__0 ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:157:2: ( ( ( rule__ComponentDefinition__Group__0 ) ) )
            // InternalComponentDefinition.g:158:2: ( ( rule__ComponentDefinition__Group__0 ) )
            {
            // InternalComponentDefinition.g:158:2: ( ( rule__ComponentDefinition__Group__0 ) )
            // InternalComponentDefinition.g:159:3: ( rule__ComponentDefinition__Group__0 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getGroup()); 
            // InternalComponentDefinition.g:160:3: ( rule__ComponentDefinition__Group__0 )
            // InternalComponentDefinition.g:160:4: rule__ComponentDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentDefinition"


    // $ANTLR start "entryRuleAbstractComponentElement"
    // InternalComponentDefinition.g:169:1: entryRuleAbstractComponentElement : ruleAbstractComponentElement EOF ;
    public final void entryRuleAbstractComponentElement() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:170:1: ( ruleAbstractComponentElement EOF )
            // InternalComponentDefinition.g:171:1: ruleAbstractComponentElement EOF
            {
             before(grammarAccess.getAbstractComponentElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractComponentElement();

            state._fsp--;

             after(grammarAccess.getAbstractComponentElementRule()); 
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
    // $ANTLR end "entryRuleAbstractComponentElement"


    // $ANTLR start "ruleAbstractComponentElement"
    // InternalComponentDefinition.g:178:1: ruleAbstractComponentElement : ( ( rule__AbstractComponentElement__Alternatives ) ) ;
    public final void ruleAbstractComponentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:182:2: ( ( ( rule__AbstractComponentElement__Alternatives ) ) )
            // InternalComponentDefinition.g:183:2: ( ( rule__AbstractComponentElement__Alternatives ) )
            {
            // InternalComponentDefinition.g:183:2: ( ( rule__AbstractComponentElement__Alternatives ) )
            // InternalComponentDefinition.g:184:3: ( rule__AbstractComponentElement__Alternatives )
            {
             before(grammarAccess.getAbstractComponentElementAccess().getAlternatives()); 
            // InternalComponentDefinition.g:185:3: ( rule__AbstractComponentElement__Alternatives )
            // InternalComponentDefinition.g:185:4: rule__AbstractComponentElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractComponentElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractComponentElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractComponentElement"


    // $ANTLR start "entryRuleDerivedComponentElement"
    // InternalComponentDefinition.g:194:1: entryRuleDerivedComponentElement : ruleDerivedComponentElement EOF ;
    public final void entryRuleDerivedComponentElement() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:195:1: ( ruleDerivedComponentElement EOF )
            // InternalComponentDefinition.g:196:1: ruleDerivedComponentElement EOF
            {
             before(grammarAccess.getDerivedComponentElementRule()); 
            pushFollow(FOLLOW_1);
            ruleDerivedComponentElement();

            state._fsp--;

             after(grammarAccess.getDerivedComponentElementRule()); 
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
    // $ANTLR end "entryRuleDerivedComponentElement"


    // $ANTLR start "ruleDerivedComponentElement"
    // InternalComponentDefinition.g:203:1: ruleDerivedComponentElement : ( ( rule__DerivedComponentElement__Alternatives ) ) ;
    public final void ruleDerivedComponentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:207:2: ( ( ( rule__DerivedComponentElement__Alternatives ) ) )
            // InternalComponentDefinition.g:208:2: ( ( rule__DerivedComponentElement__Alternatives ) )
            {
            // InternalComponentDefinition.g:208:2: ( ( rule__DerivedComponentElement__Alternatives ) )
            // InternalComponentDefinition.g:209:3: ( rule__DerivedComponentElement__Alternatives )
            {
             before(grammarAccess.getDerivedComponentElementAccess().getAlternatives()); 
            // InternalComponentDefinition.g:210:3: ( rule__DerivedComponentElement__Alternatives )
            // InternalComponentDefinition.g:210:4: rule__DerivedComponentElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DerivedComponentElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDerivedComponentElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDerivedComponentElement"


    // $ANTLR start "entryRuleNamedComponentElement"
    // InternalComponentDefinition.g:219:1: entryRuleNamedComponentElement : ruleNamedComponentElement EOF ;
    public final void entryRuleNamedComponentElement() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:220:1: ( ruleNamedComponentElement EOF )
            // InternalComponentDefinition.g:221:1: ruleNamedComponentElement EOF
            {
             before(grammarAccess.getNamedComponentElementRule()); 
            pushFollow(FOLLOW_1);
            ruleNamedComponentElement();

            state._fsp--;

             after(grammarAccess.getNamedComponentElementRule()); 
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
    // $ANTLR end "entryRuleNamedComponentElement"


    // $ANTLR start "ruleNamedComponentElement"
    // InternalComponentDefinition.g:228:1: ruleNamedComponentElement : ( ( rule__NamedComponentElement__Alternatives ) ) ;
    public final void ruleNamedComponentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:232:2: ( ( ( rule__NamedComponentElement__Alternatives ) ) )
            // InternalComponentDefinition.g:233:2: ( ( rule__NamedComponentElement__Alternatives ) )
            {
            // InternalComponentDefinition.g:233:2: ( ( rule__NamedComponentElement__Alternatives ) )
            // InternalComponentDefinition.g:234:3: ( rule__NamedComponentElement__Alternatives )
            {
             before(grammarAccess.getNamedComponentElementAccess().getAlternatives()); 
            // InternalComponentDefinition.g:235:3: ( rule__NamedComponentElement__Alternatives )
            // InternalComponentDefinition.g:235:4: rule__NamedComponentElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__NamedComponentElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNamedComponentElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNamedComponentElement"


    // $ANTLR start "entryRuleComponentSubNode"
    // InternalComponentDefinition.g:244:1: entryRuleComponentSubNode : ruleComponentSubNode EOF ;
    public final void entryRuleComponentSubNode() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:245:1: ( ruleComponentSubNode EOF )
            // InternalComponentDefinition.g:246:1: ruleComponentSubNode EOF
            {
             before(grammarAccess.getComponentSubNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentSubNode();

            state._fsp--;

             after(grammarAccess.getComponentSubNodeRule()); 
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
    // $ANTLR end "entryRuleComponentSubNode"


    // $ANTLR start "ruleComponentSubNode"
    // InternalComponentDefinition.g:253:1: ruleComponentSubNode : ( ( rule__ComponentSubNode__Alternatives ) ) ;
    public final void ruleComponentSubNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:257:2: ( ( ( rule__ComponentSubNode__Alternatives ) ) )
            // InternalComponentDefinition.g:258:2: ( ( rule__ComponentSubNode__Alternatives ) )
            {
            // InternalComponentDefinition.g:258:2: ( ( rule__ComponentSubNode__Alternatives ) )
            // InternalComponentDefinition.g:259:3: ( rule__ComponentSubNode__Alternatives )
            {
             before(grammarAccess.getComponentSubNodeAccess().getAlternatives()); 
            // InternalComponentDefinition.g:260:3: ( rule__ComponentSubNode__Alternatives )
            // InternalComponentDefinition.g:260:4: rule__ComponentSubNode__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComponentSubNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentSubNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentSubNode"


    // $ANTLR start "entryRuleComponentPort"
    // InternalComponentDefinition.g:269:1: entryRuleComponentPort : ruleComponentPort EOF ;
    public final void entryRuleComponentPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:270:1: ( ruleComponentPort EOF )
            // InternalComponentDefinition.g:271:1: ruleComponentPort EOF
            {
             before(grammarAccess.getComponentPortRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentPort();

            state._fsp--;

             after(grammarAccess.getComponentPortRule()); 
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
    // $ANTLR end "entryRuleComponentPort"


    // $ANTLR start "ruleComponentPort"
    // InternalComponentDefinition.g:278:1: ruleComponentPort : ( ( rule__ComponentPort__Alternatives ) ) ;
    public final void ruleComponentPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:282:2: ( ( ( rule__ComponentPort__Alternatives ) ) )
            // InternalComponentDefinition.g:283:2: ( ( rule__ComponentPort__Alternatives ) )
            {
            // InternalComponentDefinition.g:283:2: ( ( rule__ComponentPort__Alternatives ) )
            // InternalComponentDefinition.g:284:3: ( rule__ComponentPort__Alternatives )
            {
             before(grammarAccess.getComponentPortAccess().getAlternatives()); 
            // InternalComponentDefinition.g:285:3: ( rule__ComponentPort__Alternatives )
            // InternalComponentDefinition.g:285:4: rule__ComponentPort__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComponentPort__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentPort"


    // $ANTLR start "entryRuleRequestPort"
    // InternalComponentDefinition.g:294:1: entryRuleRequestPort : ruleRequestPort EOF ;
    public final void entryRuleRequestPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:295:1: ( ruleRequestPort EOF )
            // InternalComponentDefinition.g:296:1: ruleRequestPort EOF
            {
             before(grammarAccess.getRequestPortRule()); 
            pushFollow(FOLLOW_1);
            ruleRequestPort();

            state._fsp--;

             after(grammarAccess.getRequestPortRule()); 
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
    // $ANTLR end "entryRuleRequestPort"


    // $ANTLR start "ruleRequestPort"
    // InternalComponentDefinition.g:303:1: ruleRequestPort : ( ( rule__RequestPort__Group__0 ) ) ;
    public final void ruleRequestPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:307:2: ( ( ( rule__RequestPort__Group__0 ) ) )
            // InternalComponentDefinition.g:308:2: ( ( rule__RequestPort__Group__0 ) )
            {
            // InternalComponentDefinition.g:308:2: ( ( rule__RequestPort__Group__0 ) )
            // InternalComponentDefinition.g:309:3: ( rule__RequestPort__Group__0 )
            {
             before(grammarAccess.getRequestPortAccess().getGroup()); 
            // InternalComponentDefinition.g:310:3: ( rule__RequestPort__Group__0 )
            // InternalComponentDefinition.g:310:4: rule__RequestPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequestPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequestPort"


    // $ANTLR start "entryRuleOutputPort"
    // InternalComponentDefinition.g:319:1: entryRuleOutputPort : ruleOutputPort EOF ;
    public final void entryRuleOutputPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:320:1: ( ruleOutputPort EOF )
            // InternalComponentDefinition.g:321:1: ruleOutputPort EOF
            {
             before(grammarAccess.getOutputPortRule()); 
            pushFollow(FOLLOW_1);
            ruleOutputPort();

            state._fsp--;

             after(grammarAccess.getOutputPortRule()); 
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
    // $ANTLR end "entryRuleOutputPort"


    // $ANTLR start "ruleOutputPort"
    // InternalComponentDefinition.g:328:1: ruleOutputPort : ( ( rule__OutputPort__Group__0 ) ) ;
    public final void ruleOutputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:332:2: ( ( ( rule__OutputPort__Group__0 ) ) )
            // InternalComponentDefinition.g:333:2: ( ( rule__OutputPort__Group__0 ) )
            {
            // InternalComponentDefinition.g:333:2: ( ( rule__OutputPort__Group__0 ) )
            // InternalComponentDefinition.g:334:3: ( rule__OutputPort__Group__0 )
            {
             before(grammarAccess.getOutputPortAccess().getGroup()); 
            // InternalComponentDefinition.g:335:3: ( rule__OutputPort__Group__0 )
            // InternalComponentDefinition.g:335:4: rule__OutputPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOutputPort"


    // $ANTLR start "entryRuleAnswerPort"
    // InternalComponentDefinition.g:344:1: entryRuleAnswerPort : ruleAnswerPort EOF ;
    public final void entryRuleAnswerPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:345:1: ( ruleAnswerPort EOF )
            // InternalComponentDefinition.g:346:1: ruleAnswerPort EOF
            {
             before(grammarAccess.getAnswerPortRule()); 
            pushFollow(FOLLOW_1);
            ruleAnswerPort();

            state._fsp--;

             after(grammarAccess.getAnswerPortRule()); 
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
    // $ANTLR end "entryRuleAnswerPort"


    // $ANTLR start "ruleAnswerPort"
    // InternalComponentDefinition.g:353:1: ruleAnswerPort : ( ( rule__AnswerPort__Group__0 ) ) ;
    public final void ruleAnswerPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:357:2: ( ( ( rule__AnswerPort__Group__0 ) ) )
            // InternalComponentDefinition.g:358:2: ( ( rule__AnswerPort__Group__0 ) )
            {
            // InternalComponentDefinition.g:358:2: ( ( rule__AnswerPort__Group__0 ) )
            // InternalComponentDefinition.g:359:3: ( rule__AnswerPort__Group__0 )
            {
             before(grammarAccess.getAnswerPortAccess().getGroup()); 
            // InternalComponentDefinition.g:360:3: ( rule__AnswerPort__Group__0 )
            // InternalComponentDefinition.g:360:4: rule__AnswerPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AnswerPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAnswerPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnswerPort"


    // $ANTLR start "entryRuleInputPort"
    // InternalComponentDefinition.g:369:1: entryRuleInputPort : ruleInputPort EOF ;
    public final void entryRuleInputPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:370:1: ( ruleInputPort EOF )
            // InternalComponentDefinition.g:371:1: ruleInputPort EOF
            {
             before(grammarAccess.getInputPortRule()); 
            pushFollow(FOLLOW_1);
            ruleInputPort();

            state._fsp--;

             after(grammarAccess.getInputPortRule()); 
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
    // $ANTLR end "entryRuleInputPort"


    // $ANTLR start "ruleInputPort"
    // InternalComponentDefinition.g:378:1: ruleInputPort : ( ( rule__InputPort__Group__0 ) ) ;
    public final void ruleInputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:382:2: ( ( ( rule__InputPort__Group__0 ) ) )
            // InternalComponentDefinition.g:383:2: ( ( rule__InputPort__Group__0 ) )
            {
            // InternalComponentDefinition.g:383:2: ( ( rule__InputPort__Group__0 ) )
            // InternalComponentDefinition.g:384:3: ( rule__InputPort__Group__0 )
            {
             before(grammarAccess.getInputPortAccess().getGroup()); 
            // InternalComponentDefinition.g:385:3: ( rule__InputPort__Group__0 )
            // InternalComponentDefinition.g:385:4: rule__InputPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputPort"


    // $ANTLR start "entryRuleComponentPortExtension"
    // InternalComponentDefinition.g:394:1: entryRuleComponentPortExtension : ruleComponentPortExtension EOF ;
    public final void entryRuleComponentPortExtension() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:395:1: ( ruleComponentPortExtension EOF )
            // InternalComponentDefinition.g:396:1: ruleComponentPortExtension EOF
            {
             before(grammarAccess.getComponentPortExtensionRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentPortExtension();

            state._fsp--;

             after(grammarAccess.getComponentPortExtensionRule()); 
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
    // $ANTLR end "entryRuleComponentPortExtension"


    // $ANTLR start "ruleComponentPortExtension"
    // InternalComponentDefinition.g:403:1: ruleComponentPortExtension : ( ruleSupportedMiddleware ) ;
    public final void ruleComponentPortExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:407:2: ( ( ruleSupportedMiddleware ) )
            // InternalComponentDefinition.g:408:2: ( ruleSupportedMiddleware )
            {
            // InternalComponentDefinition.g:408:2: ( ruleSupportedMiddleware )
            // InternalComponentDefinition.g:409:3: ruleSupportedMiddleware
            {
             before(grammarAccess.getComponentPortExtensionAccess().getSupportedMiddlewareParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleSupportedMiddleware();

            state._fsp--;

             after(grammarAccess.getComponentPortExtensionAccess().getSupportedMiddlewareParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentPortExtension"


    // $ANTLR start "entryRuleSupportedMiddleware"
    // InternalComponentDefinition.g:419:1: entryRuleSupportedMiddleware : ruleSupportedMiddleware EOF ;
    public final void entryRuleSupportedMiddleware() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:420:1: ( ruleSupportedMiddleware EOF )
            // InternalComponentDefinition.g:421:1: ruleSupportedMiddleware EOF
            {
             before(grammarAccess.getSupportedMiddlewareRule()); 
            pushFollow(FOLLOW_1);
            ruleSupportedMiddleware();

            state._fsp--;

             after(grammarAccess.getSupportedMiddlewareRule()); 
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
    // $ANTLR end "entryRuleSupportedMiddleware"


    // $ANTLR start "ruleSupportedMiddleware"
    // InternalComponentDefinition.g:428:1: ruleSupportedMiddleware : ( ( rule__SupportedMiddleware__Group__0 ) ) ;
    public final void ruleSupportedMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:432:2: ( ( ( rule__SupportedMiddleware__Group__0 ) ) )
            // InternalComponentDefinition.g:433:2: ( ( rule__SupportedMiddleware__Group__0 ) )
            {
            // InternalComponentDefinition.g:433:2: ( ( rule__SupportedMiddleware__Group__0 ) )
            // InternalComponentDefinition.g:434:3: ( rule__SupportedMiddleware__Group__0 )
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getGroup()); 
            // InternalComponentDefinition.g:435:3: ( rule__SupportedMiddleware__Group__0 )
            // InternalComponentDefinition.g:435:4: rule__SupportedMiddleware__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SupportedMiddleware__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSupportedMiddlewareAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSupportedMiddleware"


    // $ANTLR start "entryRuleActivity"
    // InternalComponentDefinition.g:444:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:445:1: ( ruleActivity EOF )
            // InternalComponentDefinition.g:446:1: ruleActivity EOF
            {
             before(grammarAccess.getActivityRule()); 
            pushFollow(FOLLOW_1);
            ruleActivity();

            state._fsp--;

             after(grammarAccess.getActivityRule()); 
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
    // $ANTLR end "entryRuleActivity"


    // $ANTLR start "ruleActivity"
    // InternalComponentDefinition.g:453:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:457:2: ( ( ( rule__Activity__Group__0 ) ) )
            // InternalComponentDefinition.g:458:2: ( ( rule__Activity__Group__0 ) )
            {
            // InternalComponentDefinition.g:458:2: ( ( rule__Activity__Group__0 ) )
            // InternalComponentDefinition.g:459:3: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // InternalComponentDefinition.g:460:3: ( rule__Activity__Group__0 )
            // InternalComponentDefinition.g:460:4: rule__Activity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivity"


    // $ANTLR start "entryRuleInputHandler"
    // InternalComponentDefinition.g:469:1: entryRuleInputHandler : ruleInputHandler EOF ;
    public final void entryRuleInputHandler() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:470:1: ( ruleInputHandler EOF )
            // InternalComponentDefinition.g:471:1: ruleInputHandler EOF
            {
             before(grammarAccess.getInputHandlerRule()); 
            pushFollow(FOLLOW_1);
            ruleInputHandler();

            state._fsp--;

             after(grammarAccess.getInputHandlerRule()); 
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
    // $ANTLR end "entryRuleInputHandler"


    // $ANTLR start "ruleInputHandler"
    // InternalComponentDefinition.g:478:1: ruleInputHandler : ( ( rule__InputHandler__Group__0 ) ) ;
    public final void ruleInputHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:482:2: ( ( ( rule__InputHandler__Group__0 ) ) )
            // InternalComponentDefinition.g:483:2: ( ( rule__InputHandler__Group__0 ) )
            {
            // InternalComponentDefinition.g:483:2: ( ( rule__InputHandler__Group__0 ) )
            // InternalComponentDefinition.g:484:3: ( rule__InputHandler__Group__0 )
            {
             before(grammarAccess.getInputHandlerAccess().getGroup()); 
            // InternalComponentDefinition.g:485:3: ( rule__InputHandler__Group__0 )
            // InternalComponentDefinition.g:485:4: rule__InputHandler__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputHandler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputHandlerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputHandler"


    // $ANTLR start "entryRuleRequestHandler"
    // InternalComponentDefinition.g:494:1: entryRuleRequestHandler : ruleRequestHandler EOF ;
    public final void entryRuleRequestHandler() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:495:1: ( ruleRequestHandler EOF )
            // InternalComponentDefinition.g:496:1: ruleRequestHandler EOF
            {
             before(grammarAccess.getRequestHandlerRule()); 
            pushFollow(FOLLOW_1);
            ruleRequestHandler();

            state._fsp--;

             after(grammarAccess.getRequestHandlerRule()); 
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
    // $ANTLR end "entryRuleRequestHandler"


    // $ANTLR start "ruleRequestHandler"
    // InternalComponentDefinition.g:503:1: ruleRequestHandler : ( ( rule__RequestHandler__Group__0 ) ) ;
    public final void ruleRequestHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:507:2: ( ( ( rule__RequestHandler__Group__0 ) ) )
            // InternalComponentDefinition.g:508:2: ( ( rule__RequestHandler__Group__0 ) )
            {
            // InternalComponentDefinition.g:508:2: ( ( rule__RequestHandler__Group__0 ) )
            // InternalComponentDefinition.g:509:3: ( rule__RequestHandler__Group__0 )
            {
             before(grammarAccess.getRequestHandlerAccess().getGroup()); 
            // InternalComponentDefinition.g:510:3: ( rule__RequestHandler__Group__0 )
            // InternalComponentDefinition.g:510:4: rule__RequestHandler__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequestHandler__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestHandlerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequestHandler"


    // $ANTLR start "entryRuleAbstractComponentLink"
    // InternalComponentDefinition.g:519:1: entryRuleAbstractComponentLink : ruleAbstractComponentLink EOF ;
    public final void entryRuleAbstractComponentLink() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:520:1: ( ruleAbstractComponentLink EOF )
            // InternalComponentDefinition.g:521:1: ruleAbstractComponentLink EOF
            {
             before(grammarAccess.getAbstractComponentLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractComponentLink();

            state._fsp--;

             after(grammarAccess.getAbstractComponentLinkRule()); 
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
    // $ANTLR end "entryRuleAbstractComponentLink"


    // $ANTLR start "ruleAbstractComponentLink"
    // InternalComponentDefinition.g:528:1: ruleAbstractComponentLink : ( ( rule__AbstractComponentLink__Alternatives ) ) ;
    public final void ruleAbstractComponentLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:532:2: ( ( ( rule__AbstractComponentLink__Alternatives ) ) )
            // InternalComponentDefinition.g:533:2: ( ( rule__AbstractComponentLink__Alternatives ) )
            {
            // InternalComponentDefinition.g:533:2: ( ( rule__AbstractComponentLink__Alternatives ) )
            // InternalComponentDefinition.g:534:3: ( rule__AbstractComponentLink__Alternatives )
            {
             before(grammarAccess.getAbstractComponentLinkAccess().getAlternatives()); 
            // InternalComponentDefinition.g:535:3: ( rule__AbstractComponentLink__Alternatives )
            // InternalComponentDefinition.g:535:4: rule__AbstractComponentLink__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractComponentLink__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractComponentLinkAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractComponentLink"


    // $ANTLR start "entryRuleRequestPortLink"
    // InternalComponentDefinition.g:544:1: entryRuleRequestPortLink : ruleRequestPortLink EOF ;
    public final void entryRuleRequestPortLink() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:545:1: ( ruleRequestPortLink EOF )
            // InternalComponentDefinition.g:546:1: ruleRequestPortLink EOF
            {
             before(grammarAccess.getRequestPortLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleRequestPortLink();

            state._fsp--;

             after(grammarAccess.getRequestPortLinkRule()); 
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
    // $ANTLR end "entryRuleRequestPortLink"


    // $ANTLR start "ruleRequestPortLink"
    // InternalComponentDefinition.g:553:1: ruleRequestPortLink : ( ( rule__RequestPortLink__Group__0 ) ) ;
    public final void ruleRequestPortLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:557:2: ( ( ( rule__RequestPortLink__Group__0 ) ) )
            // InternalComponentDefinition.g:558:2: ( ( rule__RequestPortLink__Group__0 ) )
            {
            // InternalComponentDefinition.g:558:2: ( ( rule__RequestPortLink__Group__0 ) )
            // InternalComponentDefinition.g:559:3: ( rule__RequestPortLink__Group__0 )
            {
             before(grammarAccess.getRequestPortLinkAccess().getGroup()); 
            // InternalComponentDefinition.g:560:3: ( rule__RequestPortLink__Group__0 )
            // InternalComponentDefinition.g:560:4: rule__RequestPortLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequestPortLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestPortLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequestPortLink"


    // $ANTLR start "entryRuleOpcUaClientLink"
    // InternalComponentDefinition.g:569:1: entryRuleOpcUaClientLink : ruleOpcUaClientLink EOF ;
    public final void entryRuleOpcUaClientLink() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:570:1: ( ruleOpcUaClientLink EOF )
            // InternalComponentDefinition.g:571:1: ruleOpcUaClientLink EOF
            {
             before(grammarAccess.getOpcUaClientLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleOpcUaClientLink();

            state._fsp--;

             after(grammarAccess.getOpcUaClientLinkRule()); 
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
    // $ANTLR end "entryRuleOpcUaClientLink"


    // $ANTLR start "ruleOpcUaClientLink"
    // InternalComponentDefinition.g:578:1: ruleOpcUaClientLink : ( ( rule__OpcUaClientLink__Group__0 ) ) ;
    public final void ruleOpcUaClientLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:582:2: ( ( ( rule__OpcUaClientLink__Group__0 ) ) )
            // InternalComponentDefinition.g:583:2: ( ( rule__OpcUaClientLink__Group__0 ) )
            {
            // InternalComponentDefinition.g:583:2: ( ( rule__OpcUaClientLink__Group__0 ) )
            // InternalComponentDefinition.g:584:3: ( rule__OpcUaClientLink__Group__0 )
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getGroup()); 
            // InternalComponentDefinition.g:585:3: ( rule__OpcUaClientLink__Group__0 )
            // InternalComponentDefinition.g:585:4: rule__OpcUaClientLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaClientLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaClientLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpcUaClientLink"


    // $ANTLR start "entryRuleMixedPortROSLink"
    // InternalComponentDefinition.g:594:1: entryRuleMixedPortROSLink : ruleMixedPortROSLink EOF ;
    public final void entryRuleMixedPortROSLink() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:595:1: ( ruleMixedPortROSLink EOF )
            // InternalComponentDefinition.g:596:1: ruleMixedPortROSLink EOF
            {
             before(grammarAccess.getMixedPortROSLinkRule()); 
            pushFollow(FOLLOW_1);
            ruleMixedPortROSLink();

            state._fsp--;

             after(grammarAccess.getMixedPortROSLinkRule()); 
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
    // $ANTLR end "entryRuleMixedPortROSLink"


    // $ANTLR start "ruleMixedPortROSLink"
    // InternalComponentDefinition.g:603:1: ruleMixedPortROSLink : ( ( rule__MixedPortROSLink__Group__0 ) ) ;
    public final void ruleMixedPortROSLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:607:2: ( ( ( rule__MixedPortROSLink__Group__0 ) ) )
            // InternalComponentDefinition.g:608:2: ( ( rule__MixedPortROSLink__Group__0 ) )
            {
            // InternalComponentDefinition.g:608:2: ( ( rule__MixedPortROSLink__Group__0 ) )
            // InternalComponentDefinition.g:609:3: ( rule__MixedPortROSLink__Group__0 )
            {
             before(grammarAccess.getMixedPortROSLinkAccess().getGroup()); 
            // InternalComponentDefinition.g:610:3: ( rule__MixedPortROSLink__Group__0 )
            // InternalComponentDefinition.g:610:4: rule__MixedPortROSLink__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MixedPortROSLink__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMixedPortROSLinkAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMixedPortROSLink"


    // $ANTLR start "entryRuleComponentSubNodeObserver"
    // InternalComponentDefinition.g:619:1: entryRuleComponentSubNodeObserver : ruleComponentSubNodeObserver EOF ;
    public final void entryRuleComponentSubNodeObserver() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:620:1: ( ruleComponentSubNodeObserver EOF )
            // InternalComponentDefinition.g:621:1: ruleComponentSubNodeObserver EOF
            {
             before(grammarAccess.getComponentSubNodeObserverRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentSubNodeObserver();

            state._fsp--;

             after(grammarAccess.getComponentSubNodeObserverRule()); 
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
    // $ANTLR end "entryRuleComponentSubNodeObserver"


    // $ANTLR start "ruleComponentSubNodeObserver"
    // InternalComponentDefinition.g:628:1: ruleComponentSubNodeObserver : ( ( rule__ComponentSubNodeObserver__Group__0 ) ) ;
    public final void ruleComponentSubNodeObserver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:632:2: ( ( ( rule__ComponentSubNodeObserver__Group__0 ) ) )
            // InternalComponentDefinition.g:633:2: ( ( rule__ComponentSubNodeObserver__Group__0 ) )
            {
            // InternalComponentDefinition.g:633:2: ( ( rule__ComponentSubNodeObserver__Group__0 ) )
            // InternalComponentDefinition.g:634:3: ( rule__ComponentSubNodeObserver__Group__0 )
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getGroup()); 
            // InternalComponentDefinition.g:635:3: ( rule__ComponentSubNodeObserver__Group__0 )
            // InternalComponentDefinition.g:635:4: rule__ComponentSubNodeObserver__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentSubNodeObserver__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentSubNodeObserverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentSubNodeObserver"


    // $ANTLR start "entryRuleInputLinkExtension"
    // InternalComponentDefinition.g:644:1: entryRuleInputLinkExtension : ruleInputLinkExtension EOF ;
    public final void entryRuleInputLinkExtension() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:645:1: ( ruleInputLinkExtension EOF )
            // InternalComponentDefinition.g:646:1: ruleInputLinkExtension EOF
            {
             before(grammarAccess.getInputLinkExtensionRule()); 
            pushFollow(FOLLOW_1);
            ruleInputLinkExtension();

            state._fsp--;

             after(grammarAccess.getInputLinkExtensionRule()); 
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
    // $ANTLR end "entryRuleInputLinkExtension"


    // $ANTLR start "ruleInputLinkExtension"
    // InternalComponentDefinition.g:653:1: ruleInputLinkExtension : ( ( rule__InputLinkExtension__Group__0 ) ) ;
    public final void ruleInputLinkExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:657:2: ( ( ( rule__InputLinkExtension__Group__0 ) ) )
            // InternalComponentDefinition.g:658:2: ( ( rule__InputLinkExtension__Group__0 ) )
            {
            // InternalComponentDefinition.g:658:2: ( ( rule__InputLinkExtension__Group__0 ) )
            // InternalComponentDefinition.g:659:3: ( rule__InputLinkExtension__Group__0 )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getGroup()); 
            // InternalComponentDefinition.g:660:3: ( rule__InputLinkExtension__Group__0 )
            // InternalComponentDefinition.g:660:4: rule__InputLinkExtension__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputLinkExtension__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputLinkExtensionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputLinkExtension"


    // $ANTLR start "entryRuleActivityExtension"
    // InternalComponentDefinition.g:669:1: entryRuleActivityExtension : ruleActivityExtension EOF ;
    public final void entryRuleActivityExtension() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:670:1: ( ruleActivityExtension EOF )
            // InternalComponentDefinition.g:671:1: ruleActivityExtension EOF
            {
             before(grammarAccess.getActivityExtensionRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityExtension();

            state._fsp--;

             after(grammarAccess.getActivityExtensionRule()); 
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
    // $ANTLR end "entryRuleActivityExtension"


    // $ANTLR start "ruleActivityExtension"
    // InternalComponentDefinition.g:678:1: ruleActivityExtension : ( ( rule__ActivityExtension__Alternatives ) ) ;
    public final void ruleActivityExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:682:2: ( ( ( rule__ActivityExtension__Alternatives ) ) )
            // InternalComponentDefinition.g:683:2: ( ( rule__ActivityExtension__Alternatives ) )
            {
            // InternalComponentDefinition.g:683:2: ( ( rule__ActivityExtension__Alternatives ) )
            // InternalComponentDefinition.g:684:3: ( rule__ActivityExtension__Alternatives )
            {
             before(grammarAccess.getActivityExtensionAccess().getAlternatives()); 
            // InternalComponentDefinition.g:685:3: ( rule__ActivityExtension__Alternatives )
            // InternalComponentDefinition.g:685:4: rule__ActivityExtension__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ActivityExtension__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActivityExtensionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityExtension"


    // $ANTLR start "entryRuleActivationConstraints"
    // InternalComponentDefinition.g:694:1: entryRuleActivationConstraints : ruleActivationConstraints EOF ;
    public final void entryRuleActivationConstraints() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:695:1: ( ruleActivationConstraints EOF )
            // InternalComponentDefinition.g:696:1: ruleActivationConstraints EOF
            {
             before(grammarAccess.getActivationConstraintsRule()); 
            pushFollow(FOLLOW_1);
            ruleActivationConstraints();

            state._fsp--;

             after(grammarAccess.getActivationConstraintsRule()); 
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
    // $ANTLR end "entryRuleActivationConstraints"


    // $ANTLR start "ruleActivationConstraints"
    // InternalComponentDefinition.g:703:1: ruleActivationConstraints : ( ( rule__ActivationConstraints__Group__0 ) ) ;
    public final void ruleActivationConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:707:2: ( ( ( rule__ActivationConstraints__Group__0 ) ) )
            // InternalComponentDefinition.g:708:2: ( ( rule__ActivationConstraints__Group__0 ) )
            {
            // InternalComponentDefinition.g:708:2: ( ( rule__ActivationConstraints__Group__0 ) )
            // InternalComponentDefinition.g:709:3: ( rule__ActivationConstraints__Group__0 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getGroup()); 
            // InternalComponentDefinition.g:710:3: ( rule__ActivationConstraints__Group__0 )
            // InternalComponentDefinition.g:710:4: rule__ActivationConstraints__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivationConstraintsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivationConstraints"


    // $ANTLR start "entryRuleOperationModeBinding"
    // InternalComponentDefinition.g:719:1: entryRuleOperationModeBinding : ruleOperationModeBinding EOF ;
    public final void entryRuleOperationModeBinding() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:720:1: ( ruleOperationModeBinding EOF )
            // InternalComponentDefinition.g:721:1: ruleOperationModeBinding EOF
            {
             before(grammarAccess.getOperationModeBindingRule()); 
            pushFollow(FOLLOW_1);
            ruleOperationModeBinding();

            state._fsp--;

             after(grammarAccess.getOperationModeBindingRule()); 
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
    // $ANTLR end "entryRuleOperationModeBinding"


    // $ANTLR start "ruleOperationModeBinding"
    // InternalComponentDefinition.g:728:1: ruleOperationModeBinding : ( ( rule__OperationModeBinding__Group__0 ) ) ;
    public final void ruleOperationModeBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:732:2: ( ( ( rule__OperationModeBinding__Group__0 ) ) )
            // InternalComponentDefinition.g:733:2: ( ( rule__OperationModeBinding__Group__0 ) )
            {
            // InternalComponentDefinition.g:733:2: ( ( rule__OperationModeBinding__Group__0 ) )
            // InternalComponentDefinition.g:734:3: ( rule__OperationModeBinding__Group__0 )
            {
             before(grammarAccess.getOperationModeBindingAccess().getGroup()); 
            // InternalComponentDefinition.g:735:3: ( rule__OperationModeBinding__Group__0 )
            // InternalComponentDefinition.g:735:4: rule__OperationModeBinding__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OperationModeBinding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationModeBindingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperationModeBinding"


    // $ANTLR start "entryRuleDefaultTrigger"
    // InternalComponentDefinition.g:744:1: entryRuleDefaultTrigger : ruleDefaultTrigger EOF ;
    public final void entryRuleDefaultTrigger() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:745:1: ( ruleDefaultTrigger EOF )
            // InternalComponentDefinition.g:746:1: ruleDefaultTrigger EOF
            {
             before(grammarAccess.getDefaultTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleDefaultTrigger();

            state._fsp--;

             after(grammarAccess.getDefaultTriggerRule()); 
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
    // $ANTLR end "entryRuleDefaultTrigger"


    // $ANTLR start "ruleDefaultTrigger"
    // InternalComponentDefinition.g:753:1: ruleDefaultTrigger : ( ( rule__DefaultTrigger__Group__0 ) ) ;
    public final void ruleDefaultTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:757:2: ( ( ( rule__DefaultTrigger__Group__0 ) ) )
            // InternalComponentDefinition.g:758:2: ( ( rule__DefaultTrigger__Group__0 ) )
            {
            // InternalComponentDefinition.g:758:2: ( ( rule__DefaultTrigger__Group__0 ) )
            // InternalComponentDefinition.g:759:3: ( rule__DefaultTrigger__Group__0 )
            {
             before(grammarAccess.getDefaultTriggerAccess().getGroup()); 
            // InternalComponentDefinition.g:760:3: ( rule__DefaultTrigger__Group__0 )
            // InternalComponentDefinition.g:760:4: rule__DefaultTrigger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefaultTrigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultTriggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultTrigger"


    // $ANTLR start "entryRuleDefaultInputTrigger"
    // InternalComponentDefinition.g:769:1: entryRuleDefaultInputTrigger : ruleDefaultInputTrigger EOF ;
    public final void entryRuleDefaultInputTrigger() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:770:1: ( ruleDefaultInputTrigger EOF )
            // InternalComponentDefinition.g:771:1: ruleDefaultInputTrigger EOF
            {
             before(grammarAccess.getDefaultInputTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleDefaultInputTrigger();

            state._fsp--;

             after(grammarAccess.getDefaultInputTriggerRule()); 
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
    // $ANTLR end "entryRuleDefaultInputTrigger"


    // $ANTLR start "ruleDefaultInputTrigger"
    // InternalComponentDefinition.g:778:1: ruleDefaultInputTrigger : ( ( rule__DefaultInputTrigger__Group__0 ) ) ;
    public final void ruleDefaultInputTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:782:2: ( ( ( rule__DefaultInputTrigger__Group__0 ) ) )
            // InternalComponentDefinition.g:783:2: ( ( rule__DefaultInputTrigger__Group__0 ) )
            {
            // InternalComponentDefinition.g:783:2: ( ( rule__DefaultInputTrigger__Group__0 ) )
            // InternalComponentDefinition.g:784:3: ( rule__DefaultInputTrigger__Group__0 )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getGroup()); 
            // InternalComponentDefinition.g:785:3: ( rule__DefaultInputTrigger__Group__0 )
            // InternalComponentDefinition.g:785:4: rule__DefaultInputTrigger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefaultInputTrigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultInputTriggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultInputTrigger"


    // $ANTLR start "entryRuleDefaultPeriodicTimer"
    // InternalComponentDefinition.g:794:1: entryRuleDefaultPeriodicTimer : ruleDefaultPeriodicTimer EOF ;
    public final void entryRuleDefaultPeriodicTimer() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:795:1: ( ruleDefaultPeriodicTimer EOF )
            // InternalComponentDefinition.g:796:1: ruleDefaultPeriodicTimer EOF
            {
             before(grammarAccess.getDefaultPeriodicTimerRule()); 
            pushFollow(FOLLOW_1);
            ruleDefaultPeriodicTimer();

            state._fsp--;

             after(grammarAccess.getDefaultPeriodicTimerRule()); 
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
    // $ANTLR end "entryRuleDefaultPeriodicTimer"


    // $ANTLR start "ruleDefaultPeriodicTimer"
    // InternalComponentDefinition.g:803:1: ruleDefaultPeriodicTimer : ( ( rule__DefaultPeriodicTimer__Group__0 ) ) ;
    public final void ruleDefaultPeriodicTimer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:807:2: ( ( ( rule__DefaultPeriodicTimer__Group__0 ) ) )
            // InternalComponentDefinition.g:808:2: ( ( rule__DefaultPeriodicTimer__Group__0 ) )
            {
            // InternalComponentDefinition.g:808:2: ( ( rule__DefaultPeriodicTimer__Group__0 ) )
            // InternalComponentDefinition.g:809:3: ( rule__DefaultPeriodicTimer__Group__0 )
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getGroup()); 
            // InternalComponentDefinition.g:810:3: ( rule__DefaultPeriodicTimer__Group__0 )
            // InternalComponentDefinition.g:810:4: rule__DefaultPeriodicTimer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefaultPeriodicTimer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultPeriodicTimerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultPeriodicTimer"


    // $ANTLR start "entryRuleDefaultObservedElementTrigger"
    // InternalComponentDefinition.g:819:1: entryRuleDefaultObservedElementTrigger : ruleDefaultObservedElementTrigger EOF ;
    public final void entryRuleDefaultObservedElementTrigger() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:820:1: ( ruleDefaultObservedElementTrigger EOF )
            // InternalComponentDefinition.g:821:1: ruleDefaultObservedElementTrigger EOF
            {
             before(grammarAccess.getDefaultObservedElementTriggerRule()); 
            pushFollow(FOLLOW_1);
            ruleDefaultObservedElementTrigger();

            state._fsp--;

             after(grammarAccess.getDefaultObservedElementTriggerRule()); 
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
    // $ANTLR end "entryRuleDefaultObservedElementTrigger"


    // $ANTLR start "ruleDefaultObservedElementTrigger"
    // InternalComponentDefinition.g:828:1: ruleDefaultObservedElementTrigger : ( ( rule__DefaultObservedElementTrigger__Group__0 ) ) ;
    public final void ruleDefaultObservedElementTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:832:2: ( ( ( rule__DefaultObservedElementTrigger__Group__0 ) ) )
            // InternalComponentDefinition.g:833:2: ( ( rule__DefaultObservedElementTrigger__Group__0 ) )
            {
            // InternalComponentDefinition.g:833:2: ( ( rule__DefaultObservedElementTrigger__Group__0 ) )
            // InternalComponentDefinition.g:834:3: ( rule__DefaultObservedElementTrigger__Group__0 )
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getGroup()); 
            // InternalComponentDefinition.g:835:3: ( rule__DefaultObservedElementTrigger__Group__0 )
            // InternalComponentDefinition.g:835:4: rule__DefaultObservedElementTrigger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DefaultObservedElementTrigger__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDefaultObservedElementTriggerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefaultObservedElementTrigger"


    // $ANTLR start "entryRulePlainOpcUaPort"
    // InternalComponentDefinition.g:844:1: entryRulePlainOpcUaPort : rulePlainOpcUaPort EOF ;
    public final void entryRulePlainOpcUaPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:845:1: ( rulePlainOpcUaPort EOF )
            // InternalComponentDefinition.g:846:1: rulePlainOpcUaPort EOF
            {
             before(grammarAccess.getPlainOpcUaPortRule()); 
            pushFollow(FOLLOW_1);
            rulePlainOpcUaPort();

            state._fsp--;

             after(grammarAccess.getPlainOpcUaPortRule()); 
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
    // $ANTLR end "entryRulePlainOpcUaPort"


    // $ANTLR start "rulePlainOpcUaPort"
    // InternalComponentDefinition.g:853:1: rulePlainOpcUaPort : ( ( rule__PlainOpcUaPort__Alternatives ) ) ;
    public final void rulePlainOpcUaPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:857:2: ( ( ( rule__PlainOpcUaPort__Alternatives ) ) )
            // InternalComponentDefinition.g:858:2: ( ( rule__PlainOpcUaPort__Alternatives ) )
            {
            // InternalComponentDefinition.g:858:2: ( ( rule__PlainOpcUaPort__Alternatives ) )
            // InternalComponentDefinition.g:859:3: ( rule__PlainOpcUaPort__Alternatives )
            {
             before(grammarAccess.getPlainOpcUaPortAccess().getAlternatives()); 
            // InternalComponentDefinition.g:860:3: ( rule__PlainOpcUaPort__Alternatives )
            // InternalComponentDefinition.g:860:4: rule__PlainOpcUaPort__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PlainOpcUaPort__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPlainOpcUaPortAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlainOpcUaPort"


    // $ANTLR start "entryRuleOpcUaDeviceClient"
    // InternalComponentDefinition.g:869:1: entryRuleOpcUaDeviceClient : ruleOpcUaDeviceClient EOF ;
    public final void entryRuleOpcUaDeviceClient() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:870:1: ( ruleOpcUaDeviceClient EOF )
            // InternalComponentDefinition.g:871:1: ruleOpcUaDeviceClient EOF
            {
             before(grammarAccess.getOpcUaDeviceClientRule()); 
            pushFollow(FOLLOW_1);
            ruleOpcUaDeviceClient();

            state._fsp--;

             after(grammarAccess.getOpcUaDeviceClientRule()); 
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
    // $ANTLR end "entryRuleOpcUaDeviceClient"


    // $ANTLR start "ruleOpcUaDeviceClient"
    // InternalComponentDefinition.g:878:1: ruleOpcUaDeviceClient : ( ( rule__OpcUaDeviceClient__Group__0 ) ) ;
    public final void ruleOpcUaDeviceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:882:2: ( ( ( rule__OpcUaDeviceClient__Group__0 ) ) )
            // InternalComponentDefinition.g:883:2: ( ( rule__OpcUaDeviceClient__Group__0 ) )
            {
            // InternalComponentDefinition.g:883:2: ( ( rule__OpcUaDeviceClient__Group__0 ) )
            // InternalComponentDefinition.g:884:3: ( rule__OpcUaDeviceClient__Group__0 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getGroup()); 
            // InternalComponentDefinition.g:885:3: ( rule__OpcUaDeviceClient__Group__0 )
            // InternalComponentDefinition.g:885:4: rule__OpcUaDeviceClient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpcUaDeviceClient"


    // $ANTLR start "entryRuleOpcUaReadServer"
    // InternalComponentDefinition.g:894:1: entryRuleOpcUaReadServer : ruleOpcUaReadServer EOF ;
    public final void entryRuleOpcUaReadServer() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:895:1: ( ruleOpcUaReadServer EOF )
            // InternalComponentDefinition.g:896:1: ruleOpcUaReadServer EOF
            {
             before(grammarAccess.getOpcUaReadServerRule()); 
            pushFollow(FOLLOW_1);
            ruleOpcUaReadServer();

            state._fsp--;

             after(grammarAccess.getOpcUaReadServerRule()); 
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
    // $ANTLR end "entryRuleOpcUaReadServer"


    // $ANTLR start "ruleOpcUaReadServer"
    // InternalComponentDefinition.g:903:1: ruleOpcUaReadServer : ( ( rule__OpcUaReadServer__Group__0 ) ) ;
    public final void ruleOpcUaReadServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:907:2: ( ( ( rule__OpcUaReadServer__Group__0 ) ) )
            // InternalComponentDefinition.g:908:2: ( ( rule__OpcUaReadServer__Group__0 ) )
            {
            // InternalComponentDefinition.g:908:2: ( ( rule__OpcUaReadServer__Group__0 ) )
            // InternalComponentDefinition.g:909:3: ( rule__OpcUaReadServer__Group__0 )
            {
             before(grammarAccess.getOpcUaReadServerAccess().getGroup()); 
            // InternalComponentDefinition.g:910:3: ( rule__OpcUaReadServer__Group__0 )
            // InternalComponentDefinition.g:910:4: rule__OpcUaReadServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaReadServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpcUaReadServer"


    // $ANTLR start "entryRuleMixedPortROS"
    // InternalComponentDefinition.g:919:1: entryRuleMixedPortROS : ruleMixedPortROS EOF ;
    public final void entryRuleMixedPortROS() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:920:1: ( ruleMixedPortROS EOF )
            // InternalComponentDefinition.g:921:1: ruleMixedPortROS EOF
            {
             before(grammarAccess.getMixedPortROSRule()); 
            pushFollow(FOLLOW_1);
            ruleMixedPortROS();

            state._fsp--;

             after(grammarAccess.getMixedPortROSRule()); 
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
    // $ANTLR end "entryRuleMixedPortROS"


    // $ANTLR start "ruleMixedPortROS"
    // InternalComponentDefinition.g:928:1: ruleMixedPortROS : ( ( rule__MixedPortROS__Group__0 ) ) ;
    public final void ruleMixedPortROS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:932:2: ( ( ( rule__MixedPortROS__Group__0 ) ) )
            // InternalComponentDefinition.g:933:2: ( ( rule__MixedPortROS__Group__0 ) )
            {
            // InternalComponentDefinition.g:933:2: ( ( rule__MixedPortROS__Group__0 ) )
            // InternalComponentDefinition.g:934:3: ( rule__MixedPortROS__Group__0 )
            {
             before(grammarAccess.getMixedPortROSAccess().getGroup()); 
            // InternalComponentDefinition.g:935:3: ( rule__MixedPortROS__Group__0 )
            // InternalComponentDefinition.g:935:4: rule__MixedPortROS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MixedPortROS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMixedPortROSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMixedPortROS"


    // $ANTLR start "entryRuleMixedPortYARP"
    // InternalComponentDefinition.g:944:1: entryRuleMixedPortYARP : ruleMixedPortYARP EOF ;
    public final void entryRuleMixedPortYARP() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:945:1: ( ruleMixedPortYARP EOF )
            // InternalComponentDefinition.g:946:1: ruleMixedPortYARP EOF
            {
             before(grammarAccess.getMixedPortYARPRule()); 
            pushFollow(FOLLOW_1);
            ruleMixedPortYARP();

            state._fsp--;

             after(grammarAccess.getMixedPortYARPRule()); 
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
    // $ANTLR end "entryRuleMixedPortYARP"


    // $ANTLR start "ruleMixedPortYARP"
    // InternalComponentDefinition.g:953:1: ruleMixedPortYARP : ( ( rule__MixedPortYARP__Group__0 ) ) ;
    public final void ruleMixedPortYARP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:957:2: ( ( ( rule__MixedPortYARP__Group__0 ) ) )
            // InternalComponentDefinition.g:958:2: ( ( rule__MixedPortYARP__Group__0 ) )
            {
            // InternalComponentDefinition.g:958:2: ( ( rule__MixedPortYARP__Group__0 ) )
            // InternalComponentDefinition.g:959:3: ( rule__MixedPortYARP__Group__0 )
            {
             before(grammarAccess.getMixedPortYARPAccess().getGroup()); 
            // InternalComponentDefinition.g:960:3: ( rule__MixedPortYARP__Group__0 )
            // InternalComponentDefinition.g:960:4: rule__MixedPortYARP__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MixedPortYARP__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMixedPortYARPAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMixedPortYARP"


    // $ANTLR start "entryRuleCoordinationSlavePort"
    // InternalComponentDefinition.g:969:1: entryRuleCoordinationSlavePort : ruleCoordinationSlavePort EOF ;
    public final void entryRuleCoordinationSlavePort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:970:1: ( ruleCoordinationSlavePort EOF )
            // InternalComponentDefinition.g:971:1: ruleCoordinationSlavePort EOF
            {
             before(grammarAccess.getCoordinationSlavePortRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinationSlavePort();

            state._fsp--;

             after(grammarAccess.getCoordinationSlavePortRule()); 
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
    // $ANTLR end "entryRuleCoordinationSlavePort"


    // $ANTLR start "ruleCoordinationSlavePort"
    // InternalComponentDefinition.g:978:1: ruleCoordinationSlavePort : ( ( rule__CoordinationSlavePort__Group__0 ) ) ;
    public final void ruleCoordinationSlavePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:982:2: ( ( ( rule__CoordinationSlavePort__Group__0 ) ) )
            // InternalComponentDefinition.g:983:2: ( ( rule__CoordinationSlavePort__Group__0 ) )
            {
            // InternalComponentDefinition.g:983:2: ( ( rule__CoordinationSlavePort__Group__0 ) )
            // InternalComponentDefinition.g:984:3: ( rule__CoordinationSlavePort__Group__0 )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getGroup()); 
            // InternalComponentDefinition.g:985:3: ( rule__CoordinationSlavePort__Group__0 )
            // InternalComponentDefinition.g:985:4: rule__CoordinationSlavePort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinationSlavePort"


    // $ANTLR start "entryRuleAbstractCoordinationElement"
    // InternalComponentDefinition.g:994:1: entryRuleAbstractCoordinationElement : ruleAbstractCoordinationElement EOF ;
    public final void entryRuleAbstractCoordinationElement() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:995:1: ( ruleAbstractCoordinationElement EOF )
            // InternalComponentDefinition.g:996:1: ruleAbstractCoordinationElement EOF
            {
             before(grammarAccess.getAbstractCoordinationElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractCoordinationElement();

            state._fsp--;

             after(grammarAccess.getAbstractCoordinationElementRule()); 
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
    // $ANTLR end "entryRuleAbstractCoordinationElement"


    // $ANTLR start "ruleAbstractCoordinationElement"
    // InternalComponentDefinition.g:1003:1: ruleAbstractCoordinationElement : ( ( rule__AbstractCoordinationElement__Alternatives ) ) ;
    public final void ruleAbstractCoordinationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1007:2: ( ( ( rule__AbstractCoordinationElement__Alternatives ) ) )
            // InternalComponentDefinition.g:1008:2: ( ( rule__AbstractCoordinationElement__Alternatives ) )
            {
            // InternalComponentDefinition.g:1008:2: ( ( rule__AbstractCoordinationElement__Alternatives ) )
            // InternalComponentDefinition.g:1009:3: ( rule__AbstractCoordinationElement__Alternatives )
            {
             before(grammarAccess.getAbstractCoordinationElementAccess().getAlternatives()); 
            // InternalComponentDefinition.g:1010:3: ( rule__AbstractCoordinationElement__Alternatives )
            // InternalComponentDefinition.g:1010:4: rule__AbstractCoordinationElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractCoordinationElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractCoordinationElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractCoordinationElement"


    // $ANTLR start "entryRuleSkillRealizationsRef"
    // InternalComponentDefinition.g:1019:1: entryRuleSkillRealizationsRef : ruleSkillRealizationsRef EOF ;
    public final void entryRuleSkillRealizationsRef() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1020:1: ( ruleSkillRealizationsRef EOF )
            // InternalComponentDefinition.g:1021:1: ruleSkillRealizationsRef EOF
            {
             before(grammarAccess.getSkillRealizationsRefRule()); 
            pushFollow(FOLLOW_1);
            ruleSkillRealizationsRef();

            state._fsp--;

             after(grammarAccess.getSkillRealizationsRefRule()); 
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
    // $ANTLR end "entryRuleSkillRealizationsRef"


    // $ANTLR start "ruleSkillRealizationsRef"
    // InternalComponentDefinition.g:1028:1: ruleSkillRealizationsRef : ( ( rule__SkillRealizationsRef__Group__0 ) ) ;
    public final void ruleSkillRealizationsRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1032:2: ( ( ( rule__SkillRealizationsRef__Group__0 ) ) )
            // InternalComponentDefinition.g:1033:2: ( ( rule__SkillRealizationsRef__Group__0 ) )
            {
            // InternalComponentDefinition.g:1033:2: ( ( rule__SkillRealizationsRef__Group__0 ) )
            // InternalComponentDefinition.g:1034:3: ( rule__SkillRealizationsRef__Group__0 )
            {
             before(grammarAccess.getSkillRealizationsRefAccess().getGroup()); 
            // InternalComponentDefinition.g:1035:3: ( rule__SkillRealizationsRef__Group__0 )
            // InternalComponentDefinition.g:1035:4: rule__SkillRealizationsRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealizationsRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSkillRealizationsRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSkillRealizationsRef"


    // $ANTLR start "entryRuleCommunicationServiceUsageRealization"
    // InternalComponentDefinition.g:1044:1: entryRuleCommunicationServiceUsageRealization : ruleCommunicationServiceUsageRealization EOF ;
    public final void entryRuleCommunicationServiceUsageRealization() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1045:1: ( ruleCommunicationServiceUsageRealization EOF )
            // InternalComponentDefinition.g:1046:1: ruleCommunicationServiceUsageRealization EOF
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationRule()); 
            pushFollow(FOLLOW_1);
            ruleCommunicationServiceUsageRealization();

            state._fsp--;

             after(grammarAccess.getCommunicationServiceUsageRealizationRule()); 
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
    // $ANTLR end "entryRuleCommunicationServiceUsageRealization"


    // $ANTLR start "ruleCommunicationServiceUsageRealization"
    // InternalComponentDefinition.g:1053:1: ruleCommunicationServiceUsageRealization : ( ( rule__CommunicationServiceUsageRealization__Group__0 ) ) ;
    public final void ruleCommunicationServiceUsageRealization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1057:2: ( ( ( rule__CommunicationServiceUsageRealization__Group__0 ) ) )
            // InternalComponentDefinition.g:1058:2: ( ( rule__CommunicationServiceUsageRealization__Group__0 ) )
            {
            // InternalComponentDefinition.g:1058:2: ( ( rule__CommunicationServiceUsageRealization__Group__0 ) )
            // InternalComponentDefinition.g:1059:3: ( rule__CommunicationServiceUsageRealization__Group__0 )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getGroup()); 
            // InternalComponentDefinition.g:1060:3: ( rule__CommunicationServiceUsageRealization__Group__0 )
            // InternalComponentDefinition.g:1060:4: rule__CommunicationServiceUsageRealization__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsageRealization__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCommunicationServiceUsageRealization"


    // $ANTLR start "entryRulePublicOperationMode"
    // InternalComponentDefinition.g:1069:1: entryRulePublicOperationMode : rulePublicOperationMode EOF ;
    public final void entryRulePublicOperationMode() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1070:1: ( rulePublicOperationMode EOF )
            // InternalComponentDefinition.g:1071:1: rulePublicOperationMode EOF
            {
             before(grammarAccess.getPublicOperationModeRule()); 
            pushFollow(FOLLOW_1);
            rulePublicOperationMode();

            state._fsp--;

             after(grammarAccess.getPublicOperationModeRule()); 
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
    // $ANTLR end "entryRulePublicOperationMode"


    // $ANTLR start "rulePublicOperationMode"
    // InternalComponentDefinition.g:1078:1: rulePublicOperationMode : ( ( rule__PublicOperationMode__Group__0 ) ) ;
    public final void rulePublicOperationMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1082:2: ( ( ( rule__PublicOperationMode__Group__0 ) ) )
            // InternalComponentDefinition.g:1083:2: ( ( rule__PublicOperationMode__Group__0 ) )
            {
            // InternalComponentDefinition.g:1083:2: ( ( rule__PublicOperationMode__Group__0 ) )
            // InternalComponentDefinition.g:1084:3: ( rule__PublicOperationMode__Group__0 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getGroup()); 
            // InternalComponentDefinition.g:1085:3: ( rule__PublicOperationMode__Group__0 )
            // InternalComponentDefinition.g:1085:4: rule__PublicOperationMode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPublicOperationModeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePublicOperationMode"


    // $ANTLR start "entryRulePrivateOperationMode"
    // InternalComponentDefinition.g:1094:1: entryRulePrivateOperationMode : rulePrivateOperationMode EOF ;
    public final void entryRulePrivateOperationMode() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1095:1: ( rulePrivateOperationMode EOF )
            // InternalComponentDefinition.g:1096:1: rulePrivateOperationMode EOF
            {
             before(grammarAccess.getPrivateOperationModeRule()); 
            pushFollow(FOLLOW_1);
            rulePrivateOperationMode();

            state._fsp--;

             after(grammarAccess.getPrivateOperationModeRule()); 
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
    // $ANTLR end "entryRulePrivateOperationMode"


    // $ANTLR start "rulePrivateOperationMode"
    // InternalComponentDefinition.g:1103:1: rulePrivateOperationMode : ( ( rule__PrivateOperationMode__Group__0 ) ) ;
    public final void rulePrivateOperationMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1107:2: ( ( ( rule__PrivateOperationMode__Group__0 ) ) )
            // InternalComponentDefinition.g:1108:2: ( ( rule__PrivateOperationMode__Group__0 ) )
            {
            // InternalComponentDefinition.g:1108:2: ( ( rule__PrivateOperationMode__Group__0 ) )
            // InternalComponentDefinition.g:1109:3: ( rule__PrivateOperationMode__Group__0 )
            {
             before(grammarAccess.getPrivateOperationModeAccess().getGroup()); 
            // InternalComponentDefinition.g:1110:3: ( rule__PrivateOperationMode__Group__0 )
            // InternalComponentDefinition.g:1110:4: rule__PrivateOperationMode__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PrivateOperationMode__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPrivateOperationModeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrivateOperationMode"


    // $ANTLR start "entryRuleCoordinationMasterPort"
    // InternalComponentDefinition.g:1119:1: entryRuleCoordinationMasterPort : ruleCoordinationMasterPort EOF ;
    public final void entryRuleCoordinationMasterPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1120:1: ( ruleCoordinationMasterPort EOF )
            // InternalComponentDefinition.g:1121:1: ruleCoordinationMasterPort EOF
            {
             before(grammarAccess.getCoordinationMasterPortRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinationMasterPort();

            state._fsp--;

             after(grammarAccess.getCoordinationMasterPortRule()); 
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
    // $ANTLR end "entryRuleCoordinationMasterPort"


    // $ANTLR start "ruleCoordinationMasterPort"
    // InternalComponentDefinition.g:1128:1: ruleCoordinationMasterPort : ( ( rule__CoordinationMasterPort__Group__0 ) ) ;
    public final void ruleCoordinationMasterPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1132:2: ( ( ( rule__CoordinationMasterPort__Group__0 ) ) )
            // InternalComponentDefinition.g:1133:2: ( ( rule__CoordinationMasterPort__Group__0 ) )
            {
            // InternalComponentDefinition.g:1133:2: ( ( rule__CoordinationMasterPort__Group__0 ) )
            // InternalComponentDefinition.g:1134:3: ( rule__CoordinationMasterPort__Group__0 )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getGroup()); 
            // InternalComponentDefinition.g:1135:3: ( rule__CoordinationMasterPort__Group__0 )
            // InternalComponentDefinition.g:1135:4: rule__CoordinationMasterPort__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationMasterPort__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationMasterPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinationMasterPort"


    // $ANTLR start "entryRuleComponentParametersRef"
    // InternalComponentDefinition.g:1144:1: entryRuleComponentParametersRef : ruleComponentParametersRef EOF ;
    public final void entryRuleComponentParametersRef() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1145:1: ( ruleComponentParametersRef EOF )
            // InternalComponentDefinition.g:1146:1: ruleComponentParametersRef EOF
            {
             before(grammarAccess.getComponentParametersRefRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentParametersRef();

            state._fsp--;

             after(grammarAccess.getComponentParametersRefRule()); 
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
    // $ANTLR end "entryRuleComponentParametersRef"


    // $ANTLR start "ruleComponentParametersRef"
    // InternalComponentDefinition.g:1153:1: ruleComponentParametersRef : ( ( rule__ComponentParametersRef__Group__0 ) ) ;
    public final void ruleComponentParametersRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1157:2: ( ( ( rule__ComponentParametersRef__Group__0 ) ) )
            // InternalComponentDefinition.g:1158:2: ( ( rule__ComponentParametersRef__Group__0 ) )
            {
            // InternalComponentDefinition.g:1158:2: ( ( rule__ComponentParametersRef__Group__0 ) )
            // InternalComponentDefinition.g:1159:3: ( rule__ComponentParametersRef__Group__0 )
            {
             before(grammarAccess.getComponentParametersRefAccess().getGroup()); 
            // InternalComponentDefinition.g:1160:3: ( rule__ComponentParametersRef__Group__0 )
            // InternalComponentDefinition.g:1160:4: rule__ComponentParametersRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentParametersRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentParametersRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentParametersRef"


    // $ANTLR start "entryRuleRoboticMiddleware"
    // InternalComponentDefinition.g:1169:1: entryRuleRoboticMiddleware : ruleRoboticMiddleware EOF ;
    public final void entryRuleRoboticMiddleware() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1170:1: ( ruleRoboticMiddleware EOF )
            // InternalComponentDefinition.g:1171:1: ruleRoboticMiddleware EOF
            {
             before(grammarAccess.getRoboticMiddlewareRule()); 
            pushFollow(FOLLOW_1);
            ruleRoboticMiddleware();

            state._fsp--;

             after(grammarAccess.getRoboticMiddlewareRule()); 
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
    // $ANTLR end "entryRuleRoboticMiddleware"


    // $ANTLR start "ruleRoboticMiddleware"
    // InternalComponentDefinition.g:1178:1: ruleRoboticMiddleware : ( ( rule__RoboticMiddleware__Alternatives ) ) ;
    public final void ruleRoboticMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1182:2: ( ( ( rule__RoboticMiddleware__Alternatives ) ) )
            // InternalComponentDefinition.g:1183:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            {
            // InternalComponentDefinition.g:1183:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            // InternalComponentDefinition.g:1184:3: ( rule__RoboticMiddleware__Alternatives )
            {
             before(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); 
            // InternalComponentDefinition.g:1185:3: ( rule__RoboticMiddleware__Alternatives )
            // InternalComponentDefinition.g:1185:4: rule__RoboticMiddleware__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__RoboticMiddleware__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRoboticMiddleware"


    // $ANTLR start "entryRuleFQN"
    // InternalComponentDefinition.g:1194:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1195:1: ( ruleFQN EOF )
            // InternalComponentDefinition.g:1196:1: ruleFQN EOF
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
    // InternalComponentDefinition.g:1203:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1207:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalComponentDefinition.g:1208:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalComponentDefinition.g:1208:2: ( ( rule__FQN__Group__0 ) )
            // InternalComponentDefinition.g:1209:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalComponentDefinition.g:1210:3: ( rule__FQN__Group__0 )
            // InternalComponentDefinition.g:1210:4: rule__FQN__Group__0
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
    // InternalComponentDefinition.g:1219:1: entryRuleFQNW : ruleFQNW EOF ;
    public final void entryRuleFQNW() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1220:1: ( ruleFQNW EOF )
            // InternalComponentDefinition.g:1221:1: ruleFQNW EOF
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
    // InternalComponentDefinition.g:1228:1: ruleFQNW : ( ( rule__FQNW__Group__0 ) ) ;
    public final void ruleFQNW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1232:2: ( ( ( rule__FQNW__Group__0 ) ) )
            // InternalComponentDefinition.g:1233:2: ( ( rule__FQNW__Group__0 ) )
            {
            // InternalComponentDefinition.g:1233:2: ( ( rule__FQNW__Group__0 ) )
            // InternalComponentDefinition.g:1234:3: ( rule__FQNW__Group__0 )
            {
             before(grammarAccess.getFQNWAccess().getGroup()); 
            // InternalComponentDefinition.g:1235:3: ( rule__FQNW__Group__0 )
            // InternalComponentDefinition.g:1235:4: rule__FQNW__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalComponentDefinition.g:1244:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1245:1: ( ruleEString EOF )
            // InternalComponentDefinition.g:1246:1: ruleEString EOF
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
    // InternalComponentDefinition.g:1253:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1257:2: ( ( RULE_STRING ) )
            // InternalComponentDefinition.g:1258:2: ( RULE_STRING )
            {
            // InternalComponentDefinition.g:1258:2: ( RULE_STRING )
            // InternalComponentDefinition.g:1259:3: RULE_STRING
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
    // InternalComponentDefinition.g:1269:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1270:1: ( ruleEInt EOF )
            // InternalComponentDefinition.g:1271:1: ruleEInt EOF
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
    // InternalComponentDefinition.g:1278:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1282:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalComponentDefinition.g:1283:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalComponentDefinition.g:1283:2: ( ( rule__EInt__Group__0 ) )
            // InternalComponentDefinition.g:1284:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalComponentDefinition.g:1285:3: ( rule__EInt__Group__0 )
            // InternalComponentDefinition.g:1285:4: rule__EInt__Group__0
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
    // InternalComponentDefinition.g:1294:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1295:1: ( ruleEDouble EOF )
            // InternalComponentDefinition.g:1296:1: ruleEDouble EOF
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
    // InternalComponentDefinition.g:1303:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1307:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalComponentDefinition.g:1308:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalComponentDefinition.g:1308:2: ( ( rule__EDouble__Group__0 ) )
            // InternalComponentDefinition.g:1309:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalComponentDefinition.g:1310:3: ( rule__EDouble__Group__0 )
            // InternalComponentDefinition.g:1310:4: rule__EDouble__Group__0
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


    // $ANTLR start "entryRuleEBoolean"
    // InternalComponentDefinition.g:1319:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1320:1: ( ruleEBoolean EOF )
            // InternalComponentDefinition.g:1321:1: ruleEBoolean EOF
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
    // InternalComponentDefinition.g:1328:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1332:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalComponentDefinition.g:1333:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalComponentDefinition.g:1333:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalComponentDefinition.g:1334:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalComponentDefinition.g:1335:3: ( rule__EBoolean__Alternatives )
            // InternalComponentDefinition.g:1335:4: rule__EBoolean__Alternatives
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


    // $ANTLR start "entryRuleACE_SmartSoft"
    // InternalComponentDefinition.g:1344:1: entryRuleACE_SmartSoft : ruleACE_SmartSoft EOF ;
    public final void entryRuleACE_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1345:1: ( ruleACE_SmartSoft EOF )
            // InternalComponentDefinition.g:1346:1: ruleACE_SmartSoft EOF
            {
             before(grammarAccess.getACE_SmartSoftRule()); 
            pushFollow(FOLLOW_1);
            ruleACE_SmartSoft();

            state._fsp--;

             after(grammarAccess.getACE_SmartSoftRule()); 
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
    // $ANTLR end "entryRuleACE_SmartSoft"


    // $ANTLR start "ruleACE_SmartSoft"
    // InternalComponentDefinition.g:1353:1: ruleACE_SmartSoft : ( ( rule__ACE_SmartSoft__Group__0 ) ) ;
    public final void ruleACE_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1357:2: ( ( ( rule__ACE_SmartSoft__Group__0 ) ) )
            // InternalComponentDefinition.g:1358:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            {
            // InternalComponentDefinition.g:1358:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            // InternalComponentDefinition.g:1359:3: ( rule__ACE_SmartSoft__Group__0 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup()); 
            // InternalComponentDefinition.g:1360:3: ( rule__ACE_SmartSoft__Group__0 )
            // InternalComponentDefinition.g:1360:4: rule__ACE_SmartSoft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getACE_SmartSoftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleACE_SmartSoft"


    // $ANTLR start "entryRuleOpcUa_SeRoNet"
    // InternalComponentDefinition.g:1369:1: entryRuleOpcUa_SeRoNet : ruleOpcUa_SeRoNet EOF ;
    public final void entryRuleOpcUa_SeRoNet() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1370:1: ( ruleOpcUa_SeRoNet EOF )
            // InternalComponentDefinition.g:1371:1: ruleOpcUa_SeRoNet EOF
            {
             before(grammarAccess.getOpcUa_SeRoNetRule()); 
            pushFollow(FOLLOW_1);
            ruleOpcUa_SeRoNet();

            state._fsp--;

             after(grammarAccess.getOpcUa_SeRoNetRule()); 
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
    // $ANTLR end "entryRuleOpcUa_SeRoNet"


    // $ANTLR start "ruleOpcUa_SeRoNet"
    // InternalComponentDefinition.g:1378:1: ruleOpcUa_SeRoNet : ( ( rule__OpcUa_SeRoNet__Group__0 ) ) ;
    public final void ruleOpcUa_SeRoNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1382:2: ( ( ( rule__OpcUa_SeRoNet__Group__0 ) ) )
            // InternalComponentDefinition.g:1383:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            {
            // InternalComponentDefinition.g:1383:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            // InternalComponentDefinition.g:1384:3: ( rule__OpcUa_SeRoNet__Group__0 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); 
            // InternalComponentDefinition.g:1385:3: ( rule__OpcUa_SeRoNet__Group__0 )
            // InternalComponentDefinition.g:1385:4: rule__OpcUa_SeRoNet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpcUa_SeRoNet"


    // $ANTLR start "entryRuleCORBA_SmartSoft"
    // InternalComponentDefinition.g:1394:1: entryRuleCORBA_SmartSoft : ruleCORBA_SmartSoft EOF ;
    public final void entryRuleCORBA_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1395:1: ( ruleCORBA_SmartSoft EOF )
            // InternalComponentDefinition.g:1396:1: ruleCORBA_SmartSoft EOF
            {
             before(grammarAccess.getCORBA_SmartSoftRule()); 
            pushFollow(FOLLOW_1);
            ruleCORBA_SmartSoft();

            state._fsp--;

             after(grammarAccess.getCORBA_SmartSoftRule()); 
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
    // $ANTLR end "entryRuleCORBA_SmartSoft"


    // $ANTLR start "ruleCORBA_SmartSoft"
    // InternalComponentDefinition.g:1403:1: ruleCORBA_SmartSoft : ( ( rule__CORBA_SmartSoft__Group__0 ) ) ;
    public final void ruleCORBA_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1407:2: ( ( ( rule__CORBA_SmartSoft__Group__0 ) ) )
            // InternalComponentDefinition.g:1408:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            {
            // InternalComponentDefinition.g:1408:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            // InternalComponentDefinition.g:1409:3: ( rule__CORBA_SmartSoft__Group__0 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); 
            // InternalComponentDefinition.g:1410:3: ( rule__CORBA_SmartSoft__Group__0 )
            // InternalComponentDefinition.g:1410:4: rule__CORBA_SmartSoft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCORBA_SmartSoft"


    // $ANTLR start "entryRuleDDS_SmartSoft"
    // InternalComponentDefinition.g:1419:1: entryRuleDDS_SmartSoft : ruleDDS_SmartSoft EOF ;
    public final void entryRuleDDS_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1420:1: ( ruleDDS_SmartSoft EOF )
            // InternalComponentDefinition.g:1421:1: ruleDDS_SmartSoft EOF
            {
             before(grammarAccess.getDDS_SmartSoftRule()); 
            pushFollow(FOLLOW_1);
            ruleDDS_SmartSoft();

            state._fsp--;

             after(grammarAccess.getDDS_SmartSoftRule()); 
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
    // $ANTLR end "entryRuleDDS_SmartSoft"


    // $ANTLR start "ruleDDS_SmartSoft"
    // InternalComponentDefinition.g:1428:1: ruleDDS_SmartSoft : ( ( rule__DDS_SmartSoft__Group__0 ) ) ;
    public final void ruleDDS_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1432:2: ( ( ( rule__DDS_SmartSoft__Group__0 ) ) )
            // InternalComponentDefinition.g:1433:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            {
            // InternalComponentDefinition.g:1433:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            // InternalComponentDefinition.g:1434:3: ( rule__DDS_SmartSoft__Group__0 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup()); 
            // InternalComponentDefinition.g:1435:3: ( rule__DDS_SmartSoft__Group__0 )
            // InternalComponentDefinition.g:1435:4: rule__DDS_SmartSoft__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDDS_SmartSoftAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDDS_SmartSoft"


    // $ANTLR start "rule__AbstractComponentElement__Alternatives"
    // InternalComponentDefinition.g:1443:1: rule__AbstractComponentElement__Alternatives : ( ( ruleNamedComponentElement ) | ( ruleDerivedComponentElement ) | ( rulePlainOpcUaPort ) );
    public final void rule__AbstractComponentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1447:1: ( ( ruleNamedComponentElement ) | ( ruleDerivedComponentElement ) | ( rulePlainOpcUaPort ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 21:
            case 23:
            case 25:
            case 26:
            case 28:
            case 29:
            case 31:
            case 57:
            case 66:
                {
                alt1=1;
                }
                break;
            case 55:
            case 56:
            case 67:
                {
                alt1=2;
                }
                break;
            case 49:
            case 52:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalComponentDefinition.g:1448:2: ( ruleNamedComponentElement )
                    {
                    // InternalComponentDefinition.g:1448:2: ( ruleNamedComponentElement )
                    // InternalComponentDefinition.g:1449:3: ruleNamedComponentElement
                    {
                     before(grammarAccess.getAbstractComponentElementAccess().getNamedComponentElementParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNamedComponentElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentElementAccess().getNamedComponentElementParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1454:2: ( ruleDerivedComponentElement )
                    {
                    // InternalComponentDefinition.g:1454:2: ( ruleDerivedComponentElement )
                    // InternalComponentDefinition.g:1455:3: ruleDerivedComponentElement
                    {
                     before(grammarAccess.getAbstractComponentElementAccess().getDerivedComponentElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDerivedComponentElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentElementAccess().getDerivedComponentElementParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1460:2: ( rulePlainOpcUaPort )
                    {
                    // InternalComponentDefinition.g:1460:2: ( rulePlainOpcUaPort )
                    // InternalComponentDefinition.g:1461:3: rulePlainOpcUaPort
                    {
                     before(grammarAccess.getAbstractComponentElementAccess().getPlainOpcUaPortParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePlainOpcUaPort();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentElementAccess().getPlainOpcUaPortParserRuleCall_2()); 

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
    // $ANTLR end "rule__AbstractComponentElement__Alternatives"


    // $ANTLR start "rule__DerivedComponentElement__Alternatives"
    // InternalComponentDefinition.g:1470:1: rule__DerivedComponentElement__Alternatives : ( ( ruleComponentParametersRef ) | ( ruleMixedPortROS ) | ( ruleMixedPortYARP ) );
    public final void rule__DerivedComponentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1474:1: ( ( ruleComponentParametersRef ) | ( ruleMixedPortROS ) | ( ruleMixedPortYARP ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt2=1;
                }
                break;
            case 55:
                {
                alt2=2;
                }
                break;
            case 56:
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
                    // InternalComponentDefinition.g:1475:2: ( ruleComponentParametersRef )
                    {
                    // InternalComponentDefinition.g:1475:2: ( ruleComponentParametersRef )
                    // InternalComponentDefinition.g:1476:3: ruleComponentParametersRef
                    {
                     before(grammarAccess.getDerivedComponentElementAccess().getComponentParametersRefParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentParametersRef();

                    state._fsp--;

                     after(grammarAccess.getDerivedComponentElementAccess().getComponentParametersRefParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1481:2: ( ruleMixedPortROS )
                    {
                    // InternalComponentDefinition.g:1481:2: ( ruleMixedPortROS )
                    // InternalComponentDefinition.g:1482:3: ruleMixedPortROS
                    {
                     before(grammarAccess.getDerivedComponentElementAccess().getMixedPortROSParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMixedPortROS();

                    state._fsp--;

                     after(grammarAccess.getDerivedComponentElementAccess().getMixedPortROSParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1487:2: ( ruleMixedPortYARP )
                    {
                    // InternalComponentDefinition.g:1487:2: ( ruleMixedPortYARP )
                    // InternalComponentDefinition.g:1488:3: ruleMixedPortYARP
                    {
                     before(grammarAccess.getDerivedComponentElementAccess().getMixedPortYARPParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMixedPortYARP();

                    state._fsp--;

                     after(grammarAccess.getDerivedComponentElementAccess().getMixedPortYARPParserRuleCall_2()); 

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
    // $ANTLR end "rule__DerivedComponentElement__Alternatives"


    // $ANTLR start "rule__NamedComponentElement__Alternatives"
    // InternalComponentDefinition.g:1497:1: rule__NamedComponentElement__Alternatives : ( ( ruleComponentSubNode ) | ( ruleComponentPort ) | ( ruleCoordinationSlavePort ) | ( ruleCoordinationMasterPort ) );
    public final void rule__NamedComponentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1501:1: ( ( ruleComponentSubNode ) | ( ruleComponentPort ) | ( ruleCoordinationSlavePort ) | ( ruleCoordinationMasterPort ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 31:
                {
                alt3=1;
                }
                break;
            case 21:
            case 23:
            case 25:
            case 26:
                {
                alt3=2;
                }
                break;
            case 57:
                {
                alt3=3;
                }
                break;
            case 66:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalComponentDefinition.g:1502:2: ( ruleComponentSubNode )
                    {
                    // InternalComponentDefinition.g:1502:2: ( ruleComponentSubNode )
                    // InternalComponentDefinition.g:1503:3: ruleComponentSubNode
                    {
                     before(grammarAccess.getNamedComponentElementAccess().getComponentSubNodeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentSubNode();

                    state._fsp--;

                     after(grammarAccess.getNamedComponentElementAccess().getComponentSubNodeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1508:2: ( ruleComponentPort )
                    {
                    // InternalComponentDefinition.g:1508:2: ( ruleComponentPort )
                    // InternalComponentDefinition.g:1509:3: ruleComponentPort
                    {
                     before(grammarAccess.getNamedComponentElementAccess().getComponentPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentPort();

                    state._fsp--;

                     after(grammarAccess.getNamedComponentElementAccess().getComponentPortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1514:2: ( ruleCoordinationSlavePort )
                    {
                    // InternalComponentDefinition.g:1514:2: ( ruleCoordinationSlavePort )
                    // InternalComponentDefinition.g:1515:3: ruleCoordinationSlavePort
                    {
                     before(grammarAccess.getNamedComponentElementAccess().getCoordinationSlavePortParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCoordinationSlavePort();

                    state._fsp--;

                     after(grammarAccess.getNamedComponentElementAccess().getCoordinationSlavePortParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDefinition.g:1520:2: ( ruleCoordinationMasterPort )
                    {
                    // InternalComponentDefinition.g:1520:2: ( ruleCoordinationMasterPort )
                    // InternalComponentDefinition.g:1521:3: ruleCoordinationMasterPort
                    {
                     before(grammarAccess.getNamedComponentElementAccess().getCoordinationMasterPortParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCoordinationMasterPort();

                    state._fsp--;

                     after(grammarAccess.getNamedComponentElementAccess().getCoordinationMasterPortParserRuleCall_3()); 

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
    // $ANTLR end "rule__NamedComponentElement__Alternatives"


    // $ANTLR start "rule__ComponentSubNode__Alternatives"
    // InternalComponentDefinition.g:1530:1: rule__ComponentSubNode__Alternatives : ( ( ruleActivity ) | ( ruleInputHandler ) | ( ruleRequestHandler ) );
    public final void rule__ComponentSubNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1534:1: ( ( ruleActivity ) | ( ruleInputHandler ) | ( ruleRequestHandler ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt4=1;
                }
                break;
            case 29:
                {
                alt4=2;
                }
                break;
            case 31:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalComponentDefinition.g:1535:2: ( ruleActivity )
                    {
                    // InternalComponentDefinition.g:1535:2: ( ruleActivity )
                    // InternalComponentDefinition.g:1536:3: ruleActivity
                    {
                     before(grammarAccess.getComponentSubNodeAccess().getActivityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActivity();

                    state._fsp--;

                     after(grammarAccess.getComponentSubNodeAccess().getActivityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1541:2: ( ruleInputHandler )
                    {
                    // InternalComponentDefinition.g:1541:2: ( ruleInputHandler )
                    // InternalComponentDefinition.g:1542:3: ruleInputHandler
                    {
                     before(grammarAccess.getComponentSubNodeAccess().getInputHandlerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleInputHandler();

                    state._fsp--;

                     after(grammarAccess.getComponentSubNodeAccess().getInputHandlerParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1547:2: ( ruleRequestHandler )
                    {
                    // InternalComponentDefinition.g:1547:2: ( ruleRequestHandler )
                    // InternalComponentDefinition.g:1548:3: ruleRequestHandler
                    {
                     before(grammarAccess.getComponentSubNodeAccess().getRequestHandlerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleRequestHandler();

                    state._fsp--;

                     after(grammarAccess.getComponentSubNodeAccess().getRequestHandlerParserRuleCall_2()); 

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
    // $ANTLR end "rule__ComponentSubNode__Alternatives"


    // $ANTLR start "rule__ComponentPort__Alternatives"
    // InternalComponentDefinition.g:1557:1: rule__ComponentPort__Alternatives : ( ( ruleInputPort ) | ( ruleAnswerPort ) | ( ruleOutputPort ) | ( ruleRequestPort ) );
    public final void rule__ComponentPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1561:1: ( ( ruleInputPort ) | ( ruleAnswerPort ) | ( ruleOutputPort ) | ( ruleRequestPort ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt5=1;
                }
                break;
            case 25:
                {
                alt5=2;
                }
                break;
            case 23:
                {
                alt5=3;
                }
                break;
            case 21:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalComponentDefinition.g:1562:2: ( ruleInputPort )
                    {
                    // InternalComponentDefinition.g:1562:2: ( ruleInputPort )
                    // InternalComponentDefinition.g:1563:3: ruleInputPort
                    {
                     before(grammarAccess.getComponentPortAccess().getInputPortParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleInputPort();

                    state._fsp--;

                     after(grammarAccess.getComponentPortAccess().getInputPortParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1568:2: ( ruleAnswerPort )
                    {
                    // InternalComponentDefinition.g:1568:2: ( ruleAnswerPort )
                    // InternalComponentDefinition.g:1569:3: ruleAnswerPort
                    {
                     before(grammarAccess.getComponentPortAccess().getAnswerPortParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAnswerPort();

                    state._fsp--;

                     after(grammarAccess.getComponentPortAccess().getAnswerPortParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1574:2: ( ruleOutputPort )
                    {
                    // InternalComponentDefinition.g:1574:2: ( ruleOutputPort )
                    // InternalComponentDefinition.g:1575:3: ruleOutputPort
                    {
                     before(grammarAccess.getComponentPortAccess().getOutputPortParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleOutputPort();

                    state._fsp--;

                     after(grammarAccess.getComponentPortAccess().getOutputPortParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDefinition.g:1580:2: ( ruleRequestPort )
                    {
                    // InternalComponentDefinition.g:1580:2: ( ruleRequestPort )
                    // InternalComponentDefinition.g:1581:3: ruleRequestPort
                    {
                     before(grammarAccess.getComponentPortAccess().getRequestPortParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleRequestPort();

                    state._fsp--;

                     after(grammarAccess.getComponentPortAccess().getRequestPortParserRuleCall_3()); 

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
    // $ANTLR end "rule__ComponentPort__Alternatives"


    // $ANTLR start "rule__AbstractComponentLink__Alternatives"
    // InternalComponentDefinition.g:1590:1: rule__AbstractComponentLink__Alternatives : ( ( ruleComponentSubNodeObserver ) | ( ruleRequestPortLink ) | ( ruleInputLinkExtension ) | ( ruleOpcUaClientLink ) | ( ruleMixedPortROSLink ) );
    public final void rule__AbstractComponentLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1594:1: ( ( ruleComponentSubNodeObserver ) | ( ruleRequestPortLink ) | ( ruleInputLinkExtension ) | ( ruleOpcUaClientLink ) | ( ruleMixedPortROSLink ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 36:
                {
                alt6=3;
                }
                break;
            case 33:
                {
                alt6=4;
                }
                break;
            case 34:
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
                    // InternalComponentDefinition.g:1595:2: ( ruleComponentSubNodeObserver )
                    {
                    // InternalComponentDefinition.g:1595:2: ( ruleComponentSubNodeObserver )
                    // InternalComponentDefinition.g:1596:3: ruleComponentSubNodeObserver
                    {
                     before(grammarAccess.getAbstractComponentLinkAccess().getComponentSubNodeObserverParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentSubNodeObserver();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentLinkAccess().getComponentSubNodeObserverParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1601:2: ( ruleRequestPortLink )
                    {
                    // InternalComponentDefinition.g:1601:2: ( ruleRequestPortLink )
                    // InternalComponentDefinition.g:1602:3: ruleRequestPortLink
                    {
                     before(grammarAccess.getAbstractComponentLinkAccess().getRequestPortLinkParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRequestPortLink();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentLinkAccess().getRequestPortLinkParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1607:2: ( ruleInputLinkExtension )
                    {
                    // InternalComponentDefinition.g:1607:2: ( ruleInputLinkExtension )
                    // InternalComponentDefinition.g:1608:3: ruleInputLinkExtension
                    {
                     before(grammarAccess.getAbstractComponentLinkAccess().getInputLinkExtensionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInputLinkExtension();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentLinkAccess().getInputLinkExtensionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDefinition.g:1613:2: ( ruleOpcUaClientLink )
                    {
                    // InternalComponentDefinition.g:1613:2: ( ruleOpcUaClientLink )
                    // InternalComponentDefinition.g:1614:3: ruleOpcUaClientLink
                    {
                     before(grammarAccess.getAbstractComponentLinkAccess().getOpcUaClientLinkParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOpcUaClientLink();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentLinkAccess().getOpcUaClientLinkParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentDefinition.g:1619:2: ( ruleMixedPortROSLink )
                    {
                    // InternalComponentDefinition.g:1619:2: ( ruleMixedPortROSLink )
                    // InternalComponentDefinition.g:1620:3: ruleMixedPortROSLink
                    {
                     before(grammarAccess.getAbstractComponentLinkAccess().getMixedPortROSLinkParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMixedPortROSLink();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentLinkAccess().getMixedPortROSLinkParserRuleCall_4()); 

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
    // $ANTLR end "rule__AbstractComponentLink__Alternatives"


    // $ANTLR start "rule__ActivityExtension__Alternatives"
    // InternalComponentDefinition.g:1629:1: rule__ActivityExtension__Alternatives : ( ( ruleActivationConstraints ) | ( ruleOperationModeBinding ) | ( ruleDefaultTrigger ) );
    public final void rule__ActivityExtension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1633:1: ( ( ruleActivationConstraints ) | ( ruleOperationModeBinding ) | ( ruleDefaultTrigger ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt7=1;
                }
                break;
            case 43:
                {
                alt7=2;
                }
                break;
            case 44:
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
                    // InternalComponentDefinition.g:1634:2: ( ruleActivationConstraints )
                    {
                    // InternalComponentDefinition.g:1634:2: ( ruleActivationConstraints )
                    // InternalComponentDefinition.g:1635:3: ruleActivationConstraints
                    {
                     before(grammarAccess.getActivityExtensionAccess().getActivationConstraintsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleActivationConstraints();

                    state._fsp--;

                     after(grammarAccess.getActivityExtensionAccess().getActivationConstraintsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1640:2: ( ruleOperationModeBinding )
                    {
                    // InternalComponentDefinition.g:1640:2: ( ruleOperationModeBinding )
                    // InternalComponentDefinition.g:1641:3: ruleOperationModeBinding
                    {
                     before(grammarAccess.getActivityExtensionAccess().getOperationModeBindingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOperationModeBinding();

                    state._fsp--;

                     after(grammarAccess.getActivityExtensionAccess().getOperationModeBindingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1646:2: ( ruleDefaultTrigger )
                    {
                    // InternalComponentDefinition.g:1646:2: ( ruleDefaultTrigger )
                    // InternalComponentDefinition.g:1647:3: ruleDefaultTrigger
                    {
                     before(grammarAccess.getActivityExtensionAccess().getDefaultTriggerParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDefaultTrigger();

                    state._fsp--;

                     after(grammarAccess.getActivityExtensionAccess().getDefaultTriggerParserRuleCall_2()); 

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
    // $ANTLR end "rule__ActivityExtension__Alternatives"


    // $ANTLR start "rule__DefaultTrigger__Alternatives_1"
    // InternalComponentDefinition.g:1656:1: rule__DefaultTrigger__Alternatives_1 : ( ( ruleDefaultInputTrigger ) | ( ruleDefaultPeriodicTimer ) | ( ruleDefaultObservedElementTrigger ) );
    public final void rule__DefaultTrigger__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1660:1: ( ( ruleDefaultInputTrigger ) | ( ruleDefaultPeriodicTimer ) | ( ruleDefaultObservedElementTrigger ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 45:
                {
                alt8=1;
                }
                break;
            case 47:
                {
                alt8=2;
                }
                break;
            case 48:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalComponentDefinition.g:1661:2: ( ruleDefaultInputTrigger )
                    {
                    // InternalComponentDefinition.g:1661:2: ( ruleDefaultInputTrigger )
                    // InternalComponentDefinition.g:1662:3: ruleDefaultInputTrigger
                    {
                     before(grammarAccess.getDefaultTriggerAccess().getDefaultInputTriggerParserRuleCall_1_0()); 
                    pushFollow(FOLLOW_2);
                    ruleDefaultInputTrigger();

                    state._fsp--;

                     after(grammarAccess.getDefaultTriggerAccess().getDefaultInputTriggerParserRuleCall_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1667:2: ( ruleDefaultPeriodicTimer )
                    {
                    // InternalComponentDefinition.g:1667:2: ( ruleDefaultPeriodicTimer )
                    // InternalComponentDefinition.g:1668:3: ruleDefaultPeriodicTimer
                    {
                     before(grammarAccess.getDefaultTriggerAccess().getDefaultPeriodicTimerParserRuleCall_1_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDefaultPeriodicTimer();

                    state._fsp--;

                     after(grammarAccess.getDefaultTriggerAccess().getDefaultPeriodicTimerParserRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1673:2: ( ruleDefaultObservedElementTrigger )
                    {
                    // InternalComponentDefinition.g:1673:2: ( ruleDefaultObservedElementTrigger )
                    // InternalComponentDefinition.g:1674:3: ruleDefaultObservedElementTrigger
                    {
                     before(grammarAccess.getDefaultTriggerAccess().getDefaultObservedElementTriggerParserRuleCall_1_2()); 
                    pushFollow(FOLLOW_2);
                    ruleDefaultObservedElementTrigger();

                    state._fsp--;

                     after(grammarAccess.getDefaultTriggerAccess().getDefaultObservedElementTriggerParserRuleCall_1_2()); 

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
    // $ANTLR end "rule__DefaultTrigger__Alternatives_1"


    // $ANTLR start "rule__PlainOpcUaPort__Alternatives"
    // InternalComponentDefinition.g:1683:1: rule__PlainOpcUaPort__Alternatives : ( ( ruleOpcUaDeviceClient ) | ( ruleOpcUaReadServer ) );
    public final void rule__PlainOpcUaPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1687:1: ( ( ruleOpcUaDeviceClient ) | ( ruleOpcUaReadServer ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==49) ) {
                alt9=1;
            }
            else if ( (LA9_0==52) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentDefinition.g:1688:2: ( ruleOpcUaDeviceClient )
                    {
                    // InternalComponentDefinition.g:1688:2: ( ruleOpcUaDeviceClient )
                    // InternalComponentDefinition.g:1689:3: ruleOpcUaDeviceClient
                    {
                     before(grammarAccess.getPlainOpcUaPortAccess().getOpcUaDeviceClientParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleOpcUaDeviceClient();

                    state._fsp--;

                     after(grammarAccess.getPlainOpcUaPortAccess().getOpcUaDeviceClientParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1694:2: ( ruleOpcUaReadServer )
                    {
                    // InternalComponentDefinition.g:1694:2: ( ruleOpcUaReadServer )
                    // InternalComponentDefinition.g:1695:3: ruleOpcUaReadServer
                    {
                     before(grammarAccess.getPlainOpcUaPortAccess().getOpcUaReadServerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOpcUaReadServer();

                    state._fsp--;

                     after(grammarAccess.getPlainOpcUaPortAccess().getOpcUaReadServerParserRuleCall_1()); 

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
    // $ANTLR end "rule__PlainOpcUaPort__Alternatives"


    // $ANTLR start "rule__AbstractCoordinationElement__Alternatives"
    // InternalComponentDefinition.g:1704:1: rule__AbstractCoordinationElement__Alternatives : ( ( rulePublicOperationMode ) | ( rulePrivateOperationMode ) | ( ruleCommunicationServiceUsageRealization ) | ( ruleSkillRealizationsRef ) );
    public final void rule__AbstractCoordinationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1708:1: ( ( rulePublicOperationMode ) | ( rulePrivateOperationMode ) | ( ruleCommunicationServiceUsageRealization ) | ( ruleSkillRealizationsRef ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 60:
            case 77:
                {
                alt10=1;
                }
                break;
            case 65:
                {
                alt10=2;
                }
                break;
            case 59:
                {
                alt10=3;
                }
                break;
            case 58:
                {
                alt10=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalComponentDefinition.g:1709:2: ( rulePublicOperationMode )
                    {
                    // InternalComponentDefinition.g:1709:2: ( rulePublicOperationMode )
                    // InternalComponentDefinition.g:1710:3: rulePublicOperationMode
                    {
                     before(grammarAccess.getAbstractCoordinationElementAccess().getPublicOperationModeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePublicOperationMode();

                    state._fsp--;

                     after(grammarAccess.getAbstractCoordinationElementAccess().getPublicOperationModeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1715:2: ( rulePrivateOperationMode )
                    {
                    // InternalComponentDefinition.g:1715:2: ( rulePrivateOperationMode )
                    // InternalComponentDefinition.g:1716:3: rulePrivateOperationMode
                    {
                     before(grammarAccess.getAbstractCoordinationElementAccess().getPrivateOperationModeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePrivateOperationMode();

                    state._fsp--;

                     after(grammarAccess.getAbstractCoordinationElementAccess().getPrivateOperationModeParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1721:2: ( ruleCommunicationServiceUsageRealization )
                    {
                    // InternalComponentDefinition.g:1721:2: ( ruleCommunicationServiceUsageRealization )
                    // InternalComponentDefinition.g:1722:3: ruleCommunicationServiceUsageRealization
                    {
                     before(grammarAccess.getAbstractCoordinationElementAccess().getCommunicationServiceUsageRealizationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCommunicationServiceUsageRealization();

                    state._fsp--;

                     after(grammarAccess.getAbstractCoordinationElementAccess().getCommunicationServiceUsageRealizationParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDefinition.g:1727:2: ( ruleSkillRealizationsRef )
                    {
                    // InternalComponentDefinition.g:1727:2: ( ruleSkillRealizationsRef )
                    // InternalComponentDefinition.g:1728:3: ruleSkillRealizationsRef
                    {
                     before(grammarAccess.getAbstractCoordinationElementAccess().getSkillRealizationsRefParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleSkillRealizationsRef();

                    state._fsp--;

                     after(grammarAccess.getAbstractCoordinationElementAccess().getSkillRealizationsRefParserRuleCall_3()); 

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
    // $ANTLR end "rule__AbstractCoordinationElement__Alternatives"


    // $ANTLR start "rule__RoboticMiddleware__Alternatives"
    // InternalComponentDefinition.g:1737:1: rule__RoboticMiddleware__Alternatives : ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) );
    public final void rule__RoboticMiddleware__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1741:1: ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt11=1;
                }
                break;
            case 74:
                {
                alt11=2;
                }
                break;
            case 75:
                {
                alt11=3;
                }
                break;
            case 76:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalComponentDefinition.g:1742:2: ( ruleACE_SmartSoft )
                    {
                    // InternalComponentDefinition.g:1742:2: ( ruleACE_SmartSoft )
                    // InternalComponentDefinition.g:1743:3: ruleACE_SmartSoft
                    {
                     before(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleACE_SmartSoft();

                    state._fsp--;

                     after(grammarAccess.getRoboticMiddlewareAccess().getACE_SmartSoftParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1748:2: ( ruleOpcUa_SeRoNet )
                    {
                    // InternalComponentDefinition.g:1748:2: ( ruleOpcUa_SeRoNet )
                    // InternalComponentDefinition.g:1749:3: ruleOpcUa_SeRoNet
                    {
                     before(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOpcUa_SeRoNet();

                    state._fsp--;

                     after(grammarAccess.getRoboticMiddlewareAccess().getOpcUa_SeRoNetParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:1754:2: ( ruleCORBA_SmartSoft )
                    {
                    // InternalComponentDefinition.g:1754:2: ( ruleCORBA_SmartSoft )
                    // InternalComponentDefinition.g:1755:3: ruleCORBA_SmartSoft
                    {
                     before(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCORBA_SmartSoft();

                    state._fsp--;

                     after(grammarAccess.getRoboticMiddlewareAccess().getCORBA_SmartSoftParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDefinition.g:1760:2: ( ruleDDS_SmartSoft )
                    {
                    // InternalComponentDefinition.g:1760:2: ( ruleDDS_SmartSoft )
                    // InternalComponentDefinition.g:1761:3: ruleDDS_SmartSoft
                    {
                     before(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleDDS_SmartSoft();

                    state._fsp--;

                     after(grammarAccess.getRoboticMiddlewareAccess().getDDS_SmartSoftParserRuleCall_3()); 

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
    // $ANTLR end "rule__RoboticMiddleware__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalComponentDefinition.g:1770:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1774:1: ( ( 'E' ) | ( 'e' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==11) ) {
                alt12=1;
            }
            else if ( (LA12_0==12) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentDefinition.g:1775:2: ( 'E' )
                    {
                    // InternalComponentDefinition.g:1775:2: ( 'E' )
                    // InternalComponentDefinition.g:1776:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1781:2: ( 'e' )
                    {
                    // InternalComponentDefinition.g:1781:2: ( 'e' )
                    // InternalComponentDefinition.g:1782:3: 'e'
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


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalComponentDefinition.g:1791:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1795:1: ( ( 'true' ) | ( 'false' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==13) ) {
                alt13=1;
            }
            else if ( (LA13_0==14) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentDefinition.g:1796:2: ( 'true' )
                    {
                    // InternalComponentDefinition.g:1796:2: ( 'true' )
                    // InternalComponentDefinition.g:1797:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1802:2: ( 'false' )
                    {
                    // InternalComponentDefinition.g:1802:2: ( 'false' )
                    // InternalComponentDefinition.g:1803:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_2); 
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


    // $ANTLR start "rule__ComponentDefModel__Group__0"
    // InternalComponentDefinition.g:1812:1: rule__ComponentDefModel__Group__0 : rule__ComponentDefModel__Group__0__Impl rule__ComponentDefModel__Group__1 ;
    public final void rule__ComponentDefModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1816:1: ( rule__ComponentDefModel__Group__0__Impl rule__ComponentDefModel__Group__1 )
            // InternalComponentDefinition.g:1817:2: rule__ComponentDefModel__Group__0__Impl rule__ComponentDefModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ComponentDefModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefModel__Group__0"


    // $ANTLR start "rule__ComponentDefModel__Group__0__Impl"
    // InternalComponentDefinition.g:1824:1: rule__ComponentDefModel__Group__0__Impl : ( () ) ;
    public final void rule__ComponentDefModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1828:1: ( ( () ) )
            // InternalComponentDefinition.g:1829:1: ( () )
            {
            // InternalComponentDefinition.g:1829:1: ( () )
            // InternalComponentDefinition.g:1830:2: ()
            {
             before(grammarAccess.getComponentDefModelAccess().getComponentDefModelAction_0()); 
            // InternalComponentDefinition.g:1831:2: ()
            // InternalComponentDefinition.g:1831:3: 
            {
            }

             after(grammarAccess.getComponentDefModelAccess().getComponentDefModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefModel__Group__0__Impl"


    // $ANTLR start "rule__ComponentDefModel__Group__1"
    // InternalComponentDefinition.g:1839:1: rule__ComponentDefModel__Group__1 : rule__ComponentDefModel__Group__1__Impl rule__ComponentDefModel__Group__2 ;
    public final void rule__ComponentDefModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1843:1: ( rule__ComponentDefModel__Group__1__Impl rule__ComponentDefModel__Group__2 )
            // InternalComponentDefinition.g:1844:2: rule__ComponentDefModel__Group__1__Impl rule__ComponentDefModel__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__ComponentDefModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefModel__Group__1"


    // $ANTLR start "rule__ComponentDefModel__Group__1__Impl"
    // InternalComponentDefinition.g:1851:1: rule__ComponentDefModel__Group__1__Impl : ( ( rule__ComponentDefModel__ImportsAssignment_1 )* ) ;
    public final void rule__ComponentDefModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1855:1: ( ( ( rule__ComponentDefModel__ImportsAssignment_1 )* ) )
            // InternalComponentDefinition.g:1856:1: ( ( rule__ComponentDefModel__ImportsAssignment_1 )* )
            {
            // InternalComponentDefinition.g:1856:1: ( ( rule__ComponentDefModel__ImportsAssignment_1 )* )
            // InternalComponentDefinition.g:1857:2: ( rule__ComponentDefModel__ImportsAssignment_1 )*
            {
             before(grammarAccess.getComponentDefModelAccess().getImportsAssignment_1()); 
            // InternalComponentDefinition.g:1858:2: ( rule__ComponentDefModel__ImportsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentDefinition.g:1858:3: rule__ComponentDefModel__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ComponentDefModel__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getComponentDefModelAccess().getImportsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefModel__Group__1__Impl"


    // $ANTLR start "rule__ComponentDefModel__Group__2"
    // InternalComponentDefinition.g:1866:1: rule__ComponentDefModel__Group__2 : rule__ComponentDefModel__Group__2__Impl ;
    public final void rule__ComponentDefModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1870:1: ( rule__ComponentDefModel__Group__2__Impl )
            // InternalComponentDefinition.g:1871:2: rule__ComponentDefModel__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefModel__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefModel__Group__2"


    // $ANTLR start "rule__ComponentDefModel__Group__2__Impl"
    // InternalComponentDefinition.g:1877:1: rule__ComponentDefModel__Group__2__Impl : ( ( rule__ComponentDefModel__ComponentAssignment_2 )? ) ;
    public final void rule__ComponentDefModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1881:1: ( ( ( rule__ComponentDefModel__ComponentAssignment_2 )? ) )
            // InternalComponentDefinition.g:1882:1: ( ( rule__ComponentDefModel__ComponentAssignment_2 )? )
            {
            // InternalComponentDefinition.g:1882:1: ( ( rule__ComponentDefModel__ComponentAssignment_2 )? )
            // InternalComponentDefinition.g:1883:2: ( rule__ComponentDefModel__ComponentAssignment_2 )?
            {
             before(grammarAccess.getComponentDefModelAccess().getComponentAssignment_2()); 
            // InternalComponentDefinition.g:1884:2: ( rule__ComponentDefModel__ComponentAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentDefinition.g:1884:3: rule__ComponentDefModel__ComponentAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDefModel__ComponentAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentDefModelAccess().getComponentAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefModel__Group__2__Impl"


    // $ANTLR start "rule__ServiceRepoImport__Group__0"
    // InternalComponentDefinition.g:1893:1: rule__ServiceRepoImport__Group__0 : rule__ServiceRepoImport__Group__0__Impl rule__ServiceRepoImport__Group__1 ;
    public final void rule__ServiceRepoImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1897:1: ( rule__ServiceRepoImport__Group__0__Impl rule__ServiceRepoImport__Group__1 )
            // InternalComponentDefinition.g:1898:2: rule__ServiceRepoImport__Group__0__Impl rule__ServiceRepoImport__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ServiceRepoImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceRepoImport__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoImport__Group__0"


    // $ANTLR start "rule__ServiceRepoImport__Group__0__Impl"
    // InternalComponentDefinition.g:1905:1: rule__ServiceRepoImport__Group__0__Impl : ( '#import' ) ;
    public final void rule__ServiceRepoImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1909:1: ( ( '#import' ) )
            // InternalComponentDefinition.g:1910:1: ( '#import' )
            {
            // InternalComponentDefinition.g:1910:1: ( '#import' )
            // InternalComponentDefinition.g:1911:2: '#import'
            {
             before(grammarAccess.getServiceRepoImportAccess().getImportKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getServiceRepoImportAccess().getImportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoImport__Group__0__Impl"


    // $ANTLR start "rule__ServiceRepoImport__Group__1"
    // InternalComponentDefinition.g:1920:1: rule__ServiceRepoImport__Group__1 : rule__ServiceRepoImport__Group__1__Impl rule__ServiceRepoImport__Group__2 ;
    public final void rule__ServiceRepoImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1924:1: ( rule__ServiceRepoImport__Group__1__Impl rule__ServiceRepoImport__Group__2 )
            // InternalComponentDefinition.g:1925:2: rule__ServiceRepoImport__Group__1__Impl rule__ServiceRepoImport__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ServiceRepoImport__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceRepoImport__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoImport__Group__1"


    // $ANTLR start "rule__ServiceRepoImport__Group__1__Impl"
    // InternalComponentDefinition.g:1932:1: rule__ServiceRepoImport__Group__1__Impl : ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__ServiceRepoImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1936:1: ( ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalComponentDefinition.g:1937:1: ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalComponentDefinition.g:1937:1: ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) )
            // InternalComponentDefinition.g:1938:2: ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalComponentDefinition.g:1939:2: ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 )
            // InternalComponentDefinition.g:1939:3: rule__ServiceRepoImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServiceRepoImport__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoImport__Group__1__Impl"


    // $ANTLR start "rule__ServiceRepoImport__Group__2"
    // InternalComponentDefinition.g:1947:1: rule__ServiceRepoImport__Group__2 : rule__ServiceRepoImport__Group__2__Impl ;
    public final void rule__ServiceRepoImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1951:1: ( rule__ServiceRepoImport__Group__2__Impl )
            // InternalComponentDefinition.g:1952:2: rule__ServiceRepoImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceRepoImport__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoImport__Group__2"


    // $ANTLR start "rule__ServiceRepoImport__Group__2__Impl"
    // InternalComponentDefinition.g:1958:1: rule__ServiceRepoImport__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ServiceRepoImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1962:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:1963:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:1963:1: ( ( ';' )? )
            // InternalComponentDefinition.g:1964:2: ( ';' )?
            {
             before(grammarAccess.getServiceRepoImportAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:1965:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentDefinition.g:1965:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getServiceRepoImportAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoImport__Group__2__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group__0"
    // InternalComponentDefinition.g:1974:1: rule__ComponentDefinition__Group__0 : rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 ;
    public final void rule__ComponentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1978:1: ( rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 )
            // InternalComponentDefinition.g:1979:2: rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ComponentDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__0"


    // $ANTLR start "rule__ComponentDefinition__Group__0__Impl"
    // InternalComponentDefinition.g:1986:1: rule__ComponentDefinition__Group__0__Impl : ( 'ComponentDefinition' ) ;
    public final void rule__ComponentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1990:1: ( ( 'ComponentDefinition' ) )
            // InternalComponentDefinition.g:1991:1: ( 'ComponentDefinition' )
            {
            // InternalComponentDefinition.g:1991:1: ( 'ComponentDefinition' )
            // InternalComponentDefinition.g:1992:2: 'ComponentDefinition'
            {
             before(grammarAccess.getComponentDefinitionAccess().getComponentDefinitionKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getComponentDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__0__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group__1"
    // InternalComponentDefinition.g:2001:1: rule__ComponentDefinition__Group__1 : rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 ;
    public final void rule__ComponentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2005:1: ( rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 )
            // InternalComponentDefinition.g:2006:2: rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__1"


    // $ANTLR start "rule__ComponentDefinition__Group__1__Impl"
    // InternalComponentDefinition.g:2013:1: rule__ComponentDefinition__Group__1__Impl : ( ( rule__ComponentDefinition__NameAssignment_1 ) ) ;
    public final void rule__ComponentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2017:1: ( ( ( rule__ComponentDefinition__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:2018:1: ( ( rule__ComponentDefinition__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:2018:1: ( ( rule__ComponentDefinition__NameAssignment_1 ) )
            // InternalComponentDefinition.g:2019:2: ( rule__ComponentDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:2020:2: ( rule__ComponentDefinition__NameAssignment_1 )
            // InternalComponentDefinition.g:2020:3: rule__ComponentDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__1__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group__2"
    // InternalComponentDefinition.g:2028:1: rule__ComponentDefinition__Group__2 : rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3 ;
    public final void rule__ComponentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2032:1: ( rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3 )
            // InternalComponentDefinition.g:2033:2: rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__ComponentDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__2"


    // $ANTLR start "rule__ComponentDefinition__Group__2__Impl"
    // InternalComponentDefinition.g:2040:1: rule__ComponentDefinition__Group__2__Impl : ( ( rule__ComponentDefinition__Group_2__0 )? ) ;
    public final void rule__ComponentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2044:1: ( ( ( rule__ComponentDefinition__Group_2__0 )? ) )
            // InternalComponentDefinition.g:2045:1: ( ( rule__ComponentDefinition__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:2045:1: ( ( rule__ComponentDefinition__Group_2__0 )? )
            // InternalComponentDefinition.g:2046:2: ( rule__ComponentDefinition__Group_2__0 )?
            {
             before(grammarAccess.getComponentDefinitionAccess().getGroup_2()); 
            // InternalComponentDefinition.g:2047:2: ( rule__ComponentDefinition__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentDefinition.g:2047:3: rule__ComponentDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDefinition__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentDefinitionAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__2__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group__3"
    // InternalComponentDefinition.g:2055:1: rule__ComponentDefinition__Group__3 : rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4 ;
    public final void rule__ComponentDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2059:1: ( rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4 )
            // InternalComponentDefinition.g:2060:2: rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__3"


    // $ANTLR start "rule__ComponentDefinition__Group__3__Impl"
    // InternalComponentDefinition.g:2067:1: rule__ComponentDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2071:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2072:1: ( '{' )
            {
            // InternalComponentDefinition.g:2072:1: ( '{' )
            // InternalComponentDefinition.g:2073:2: '{'
            {
             before(grammarAccess.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__3__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group__4"
    // InternalComponentDefinition.g:2082:1: rule__ComponentDefinition__Group__4 : rule__ComponentDefinition__Group__4__Impl rule__ComponentDefinition__Group__5 ;
    public final void rule__ComponentDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2086:1: ( rule__ComponentDefinition__Group__4__Impl rule__ComponentDefinition__Group__5 )
            // InternalComponentDefinition.g:2087:2: rule__ComponentDefinition__Group__4__Impl rule__ComponentDefinition__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__ComponentDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__4"


    // $ANTLR start "rule__ComponentDefinition__Group__4__Impl"
    // InternalComponentDefinition.g:2094:1: rule__ComponentDefinition__Group__4__Impl : ( ( rule__ComponentDefinition__ElementsAssignment_4 )* ) ;
    public final void rule__ComponentDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2098:1: ( ( ( rule__ComponentDefinition__ElementsAssignment_4 )* ) )
            // InternalComponentDefinition.g:2099:1: ( ( rule__ComponentDefinition__ElementsAssignment_4 )* )
            {
            // InternalComponentDefinition.g:2099:1: ( ( rule__ComponentDefinition__ElementsAssignment_4 )* )
            // InternalComponentDefinition.g:2100:2: ( rule__ComponentDefinition__ElementsAssignment_4 )*
            {
             before(grammarAccess.getComponentDefinitionAccess().getElementsAssignment_4()); 
            // InternalComponentDefinition.g:2101:2: ( rule__ComponentDefinition__ElementsAssignment_4 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==21||LA18_0==23||(LA18_0>=25 && LA18_0<=26)||(LA18_0>=28 && LA18_0<=29)||LA18_0==31||LA18_0==49||LA18_0==52||(LA18_0>=55 && LA18_0<=57)||(LA18_0>=66 && LA18_0<=67)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalComponentDefinition.g:2101:3: rule__ComponentDefinition__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentDefinition__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getComponentDefinitionAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__4__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group__5"
    // InternalComponentDefinition.g:2109:1: rule__ComponentDefinition__Group__5 : rule__ComponentDefinition__Group__5__Impl ;
    public final void rule__ComponentDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2113:1: ( rule__ComponentDefinition__Group__5__Impl )
            // InternalComponentDefinition.g:2114:2: rule__ComponentDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__5"


    // $ANTLR start "rule__ComponentDefinition__Group__5__Impl"
    // InternalComponentDefinition.g:2120:1: rule__ComponentDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2124:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2125:1: ( '}' )
            {
            // InternalComponentDefinition.g:2125:1: ( '}' )
            // InternalComponentDefinition.g:2126:2: '}'
            {
             before(grammarAccess.getComponentDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__5__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group_2__0"
    // InternalComponentDefinition.g:2136:1: rule__ComponentDefinition__Group_2__0 : rule__ComponentDefinition__Group_2__0__Impl rule__ComponentDefinition__Group_2__1 ;
    public final void rule__ComponentDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2140:1: ( rule__ComponentDefinition__Group_2__0__Impl rule__ComponentDefinition__Group_2__1 )
            // InternalComponentDefinition.g:2141:2: rule__ComponentDefinition__Group_2__0__Impl rule__ComponentDefinition__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__ComponentDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group_2__0"


    // $ANTLR start "rule__ComponentDefinition__Group_2__0__Impl"
    // InternalComponentDefinition.g:2148:1: rule__ComponentDefinition__Group_2__0__Impl : ( 'logo' ) ;
    public final void rule__ComponentDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2152:1: ( ( 'logo' ) )
            // InternalComponentDefinition.g:2153:1: ( 'logo' )
            {
            // InternalComponentDefinition.g:2153:1: ( 'logo' )
            // InternalComponentDefinition.g:2154:2: 'logo'
            {
             before(grammarAccess.getComponentDefinitionAccess().getLogoKeyword_2_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getLogoKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group_2__1"
    // InternalComponentDefinition.g:2163:1: rule__ComponentDefinition__Group_2__1 : rule__ComponentDefinition__Group_2__1__Impl ;
    public final void rule__ComponentDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2167:1: ( rule__ComponentDefinition__Group_2__1__Impl )
            // InternalComponentDefinition.g:2168:2: rule__ComponentDefinition__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group_2__1"


    // $ANTLR start "rule__ComponentDefinition__Group_2__1__Impl"
    // InternalComponentDefinition.g:2174:1: rule__ComponentDefinition__Group_2__1__Impl : ( ( rule__ComponentDefinition__LogoAssignment_2_1 ) ) ;
    public final void rule__ComponentDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2178:1: ( ( ( rule__ComponentDefinition__LogoAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:2179:1: ( ( rule__ComponentDefinition__LogoAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:2179:1: ( ( rule__ComponentDefinition__LogoAssignment_2_1 ) )
            // InternalComponentDefinition.g:2180:2: ( rule__ComponentDefinition__LogoAssignment_2_1 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getLogoAssignment_2_1()); 
            // InternalComponentDefinition.g:2181:2: ( rule__ComponentDefinition__LogoAssignment_2_1 )
            // InternalComponentDefinition.g:2181:3: rule__ComponentDefinition__LogoAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__LogoAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentDefinitionAccess().getLogoAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__RequestPort__Group__0"
    // InternalComponentDefinition.g:2190:1: rule__RequestPort__Group__0 : rule__RequestPort__Group__0__Impl rule__RequestPort__Group__1 ;
    public final void rule__RequestPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2194:1: ( rule__RequestPort__Group__0__Impl rule__RequestPort__Group__1 )
            // InternalComponentDefinition.g:2195:2: rule__RequestPort__Group__0__Impl rule__RequestPort__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RequestPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__0"


    // $ANTLR start "rule__RequestPort__Group__0__Impl"
    // InternalComponentDefinition.g:2202:1: rule__RequestPort__Group__0__Impl : ( 'RequestPort' ) ;
    public final void rule__RequestPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2206:1: ( ( 'RequestPort' ) )
            // InternalComponentDefinition.g:2207:1: ( 'RequestPort' )
            {
            // InternalComponentDefinition.g:2207:1: ( 'RequestPort' )
            // InternalComponentDefinition.g:2208:2: 'RequestPort'
            {
             before(grammarAccess.getRequestPortAccess().getRequestPortKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRequestPortAccess().getRequestPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__0__Impl"


    // $ANTLR start "rule__RequestPort__Group__1"
    // InternalComponentDefinition.g:2217:1: rule__RequestPort__Group__1 : rule__RequestPort__Group__1__Impl rule__RequestPort__Group__2 ;
    public final void rule__RequestPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2221:1: ( rule__RequestPort__Group__1__Impl rule__RequestPort__Group__2 )
            // InternalComponentDefinition.g:2222:2: rule__RequestPort__Group__1__Impl rule__RequestPort__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__RequestPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__1"


    // $ANTLR start "rule__RequestPort__Group__1__Impl"
    // InternalComponentDefinition.g:2229:1: rule__RequestPort__Group__1__Impl : ( ( rule__RequestPort__NameAssignment_1 ) ) ;
    public final void rule__RequestPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2233:1: ( ( ( rule__RequestPort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:2234:1: ( ( rule__RequestPort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:2234:1: ( ( rule__RequestPort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:2235:2: ( rule__RequestPort__NameAssignment_1 )
            {
             before(grammarAccess.getRequestPortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:2236:2: ( rule__RequestPort__NameAssignment_1 )
            // InternalComponentDefinition.g:2236:3: rule__RequestPort__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequestPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequestPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__1__Impl"


    // $ANTLR start "rule__RequestPort__Group__2"
    // InternalComponentDefinition.g:2244:1: rule__RequestPort__Group__2 : rule__RequestPort__Group__2__Impl rule__RequestPort__Group__3 ;
    public final void rule__RequestPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2248:1: ( rule__RequestPort__Group__2__Impl rule__RequestPort__Group__3 )
            // InternalComponentDefinition.g:2249:2: rule__RequestPort__Group__2__Impl rule__RequestPort__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RequestPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__2"


    // $ANTLR start "rule__RequestPort__Group__2__Impl"
    // InternalComponentDefinition.g:2256:1: rule__RequestPort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__RequestPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2260:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2261:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2261:1: ( 'implements' )
            // InternalComponentDefinition.g:2262:2: 'implements'
            {
             before(grammarAccess.getRequestPortAccess().getImplementsKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRequestPortAccess().getImplementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__2__Impl"


    // $ANTLR start "rule__RequestPort__Group__3"
    // InternalComponentDefinition.g:2271:1: rule__RequestPort__Group__3 : rule__RequestPort__Group__3__Impl rule__RequestPort__Group__4 ;
    public final void rule__RequestPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2275:1: ( rule__RequestPort__Group__3__Impl rule__RequestPort__Group__4 )
            // InternalComponentDefinition.g:2276:2: rule__RequestPort__Group__3__Impl rule__RequestPort__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__RequestPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestPort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__3"


    // $ANTLR start "rule__RequestPort__Group__3__Impl"
    // InternalComponentDefinition.g:2283:1: rule__RequestPort__Group__3__Impl : ( ( rule__RequestPort__ServiceAssignment_3 ) ) ;
    public final void rule__RequestPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2287:1: ( ( ( rule__RequestPort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:2288:1: ( ( rule__RequestPort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:2288:1: ( ( rule__RequestPort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:2289:2: ( rule__RequestPort__ServiceAssignment_3 )
            {
             before(grammarAccess.getRequestPortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:2290:2: ( rule__RequestPort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:2290:3: rule__RequestPort__ServiceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RequestPort__ServiceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRequestPortAccess().getServiceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__3__Impl"


    // $ANTLR start "rule__RequestPort__Group__4"
    // InternalComponentDefinition.g:2298:1: rule__RequestPort__Group__4 : rule__RequestPort__Group__4__Impl rule__RequestPort__Group__5 ;
    public final void rule__RequestPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2302:1: ( rule__RequestPort__Group__4__Impl rule__RequestPort__Group__5 )
            // InternalComponentDefinition.g:2303:2: rule__RequestPort__Group__4__Impl rule__RequestPort__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__RequestPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestPort__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__4"


    // $ANTLR start "rule__RequestPort__Group__4__Impl"
    // InternalComponentDefinition.g:2310:1: rule__RequestPort__Group__4__Impl : ( '{' ) ;
    public final void rule__RequestPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2314:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2315:1: ( '{' )
            {
            // InternalComponentDefinition.g:2315:1: ( '{' )
            // InternalComponentDefinition.g:2316:2: '{'
            {
             before(grammarAccess.getRequestPortAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRequestPortAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__4__Impl"


    // $ANTLR start "rule__RequestPort__Group__5"
    // InternalComponentDefinition.g:2325:1: rule__RequestPort__Group__5 : rule__RequestPort__Group__5__Impl rule__RequestPort__Group__6 ;
    public final void rule__RequestPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2329:1: ( rule__RequestPort__Group__5__Impl rule__RequestPort__Group__6 )
            // InternalComponentDefinition.g:2330:2: rule__RequestPort__Group__5__Impl rule__RequestPort__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__RequestPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestPort__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__5"


    // $ANTLR start "rule__RequestPort__Group__5__Impl"
    // InternalComponentDefinition.g:2337:1: rule__RequestPort__Group__5__Impl : ( ( rule__RequestPort__ExtensionsAssignment_5 )* ) ;
    public final void rule__RequestPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2341:1: ( ( ( rule__RequestPort__ExtensionsAssignment_5 )* ) )
            // InternalComponentDefinition.g:2342:1: ( ( rule__RequestPort__ExtensionsAssignment_5 )* )
            {
            // InternalComponentDefinition.g:2342:1: ( ( rule__RequestPort__ExtensionsAssignment_5 )* )
            // InternalComponentDefinition.g:2343:2: ( rule__RequestPort__ExtensionsAssignment_5 )*
            {
             before(grammarAccess.getRequestPortAccess().getExtensionsAssignment_5()); 
            // InternalComponentDefinition.g:2344:2: ( rule__RequestPort__ExtensionsAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalComponentDefinition.g:2344:3: rule__RequestPort__ExtensionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__RequestPort__ExtensionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getRequestPortAccess().getExtensionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__5__Impl"


    // $ANTLR start "rule__RequestPort__Group__6"
    // InternalComponentDefinition.g:2352:1: rule__RequestPort__Group__6 : rule__RequestPort__Group__6__Impl ;
    public final void rule__RequestPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2356:1: ( rule__RequestPort__Group__6__Impl )
            // InternalComponentDefinition.g:2357:2: rule__RequestPort__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequestPort__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__6"


    // $ANTLR start "rule__RequestPort__Group__6__Impl"
    // InternalComponentDefinition.g:2363:1: rule__RequestPort__Group__6__Impl : ( '}' ) ;
    public final void rule__RequestPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2367:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2368:1: ( '}' )
            {
            // InternalComponentDefinition.g:2368:1: ( '}' )
            // InternalComponentDefinition.g:2369:2: '}'
            {
             before(grammarAccess.getRequestPortAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRequestPortAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__6__Impl"


    // $ANTLR start "rule__OutputPort__Group__0"
    // InternalComponentDefinition.g:2379:1: rule__OutputPort__Group__0 : rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 ;
    public final void rule__OutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2383:1: ( rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 )
            // InternalComponentDefinition.g:2384:2: rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__OutputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__0"


    // $ANTLR start "rule__OutputPort__Group__0__Impl"
    // InternalComponentDefinition.g:2391:1: rule__OutputPort__Group__0__Impl : ( 'OutputPort' ) ;
    public final void rule__OutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2395:1: ( ( 'OutputPort' ) )
            // InternalComponentDefinition.g:2396:1: ( 'OutputPort' )
            {
            // InternalComponentDefinition.g:2396:1: ( 'OutputPort' )
            // InternalComponentDefinition.g:2397:2: 'OutputPort'
            {
             before(grammarAccess.getOutputPortAccess().getOutputPortKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getOutputPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__0__Impl"


    // $ANTLR start "rule__OutputPort__Group__1"
    // InternalComponentDefinition.g:2406:1: rule__OutputPort__Group__1 : rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 ;
    public final void rule__OutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2410:1: ( rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 )
            // InternalComponentDefinition.g:2411:2: rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__OutputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__1"


    // $ANTLR start "rule__OutputPort__Group__1__Impl"
    // InternalComponentDefinition.g:2418:1: rule__OutputPort__Group__1__Impl : ( ( rule__OutputPort__NameAssignment_1 ) ) ;
    public final void rule__OutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2422:1: ( ( ( rule__OutputPort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:2423:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:2423:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:2424:2: ( rule__OutputPort__NameAssignment_1 )
            {
             before(grammarAccess.getOutputPortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:2425:2: ( rule__OutputPort__NameAssignment_1 )
            // InternalComponentDefinition.g:2425:3: rule__OutputPort__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__1__Impl"


    // $ANTLR start "rule__OutputPort__Group__2"
    // InternalComponentDefinition.g:2433:1: rule__OutputPort__Group__2 : rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 ;
    public final void rule__OutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2437:1: ( rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 )
            // InternalComponentDefinition.g:2438:2: rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__OutputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__2"


    // $ANTLR start "rule__OutputPort__Group__2__Impl"
    // InternalComponentDefinition.g:2445:1: rule__OutputPort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__OutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2449:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2450:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2450:1: ( 'implements' )
            // InternalComponentDefinition.g:2451:2: 'implements'
            {
             before(grammarAccess.getOutputPortAccess().getImplementsKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getImplementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__2__Impl"


    // $ANTLR start "rule__OutputPort__Group__3"
    // InternalComponentDefinition.g:2460:1: rule__OutputPort__Group__3 : rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 ;
    public final void rule__OutputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2464:1: ( rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 )
            // InternalComponentDefinition.g:2465:2: rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4
            {
            pushFollow(FOLLOW_15);
            rule__OutputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__3"


    // $ANTLR start "rule__OutputPort__Group__3__Impl"
    // InternalComponentDefinition.g:2472:1: rule__OutputPort__Group__3__Impl : ( ( rule__OutputPort__ServiceAssignment_3 ) ) ;
    public final void rule__OutputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2476:1: ( ( ( rule__OutputPort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:2477:1: ( ( rule__OutputPort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:2477:1: ( ( rule__OutputPort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:2478:2: ( rule__OutputPort__ServiceAssignment_3 )
            {
             before(grammarAccess.getOutputPortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:2479:2: ( rule__OutputPort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:2479:3: rule__OutputPort__ServiceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__ServiceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getServiceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__3__Impl"


    // $ANTLR start "rule__OutputPort__Group__4"
    // InternalComponentDefinition.g:2487:1: rule__OutputPort__Group__4 : rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 ;
    public final void rule__OutputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2491:1: ( rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 )
            // InternalComponentDefinition.g:2492:2: rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5
            {
            pushFollow(FOLLOW_5);
            rule__OutputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__4"


    // $ANTLR start "rule__OutputPort__Group__4__Impl"
    // InternalComponentDefinition.g:2499:1: rule__OutputPort__Group__4__Impl : ( 'realizedBy' ) ;
    public final void rule__OutputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2503:1: ( ( 'realizedBy' ) )
            // InternalComponentDefinition.g:2504:1: ( 'realizedBy' )
            {
            // InternalComponentDefinition.g:2504:1: ( 'realizedBy' )
            // InternalComponentDefinition.g:2505:2: 'realizedBy'
            {
             before(grammarAccess.getOutputPortAccess().getRealizedByKeyword_4()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getRealizedByKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__4__Impl"


    // $ANTLR start "rule__OutputPort__Group__5"
    // InternalComponentDefinition.g:2514:1: rule__OutputPort__Group__5 : rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6 ;
    public final void rule__OutputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2518:1: ( rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6 )
            // InternalComponentDefinition.g:2519:2: rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__OutputPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__5"


    // $ANTLR start "rule__OutputPort__Group__5__Impl"
    // InternalComponentDefinition.g:2526:1: rule__OutputPort__Group__5__Impl : ( ( rule__OutputPort__ActivityAssignment_5 ) ) ;
    public final void rule__OutputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2530:1: ( ( ( rule__OutputPort__ActivityAssignment_5 ) ) )
            // InternalComponentDefinition.g:2531:1: ( ( rule__OutputPort__ActivityAssignment_5 ) )
            {
            // InternalComponentDefinition.g:2531:1: ( ( rule__OutputPort__ActivityAssignment_5 ) )
            // InternalComponentDefinition.g:2532:2: ( rule__OutputPort__ActivityAssignment_5 )
            {
             before(grammarAccess.getOutputPortAccess().getActivityAssignment_5()); 
            // InternalComponentDefinition.g:2533:2: ( rule__OutputPort__ActivityAssignment_5 )
            // InternalComponentDefinition.g:2533:3: rule__OutputPort__ActivityAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__ActivityAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getActivityAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__5__Impl"


    // $ANTLR start "rule__OutputPort__Group__6"
    // InternalComponentDefinition.g:2541:1: rule__OutputPort__Group__6 : rule__OutputPort__Group__6__Impl rule__OutputPort__Group__7 ;
    public final void rule__OutputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2545:1: ( rule__OutputPort__Group__6__Impl rule__OutputPort__Group__7 )
            // InternalComponentDefinition.g:2546:2: rule__OutputPort__Group__6__Impl rule__OutputPort__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__OutputPort__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__6"


    // $ANTLR start "rule__OutputPort__Group__6__Impl"
    // InternalComponentDefinition.g:2553:1: rule__OutputPort__Group__6__Impl : ( '{' ) ;
    public final void rule__OutputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2557:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2558:1: ( '{' )
            {
            // InternalComponentDefinition.g:2558:1: ( '{' )
            // InternalComponentDefinition.g:2559:2: '{'
            {
             before(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__6__Impl"


    // $ANTLR start "rule__OutputPort__Group__7"
    // InternalComponentDefinition.g:2568:1: rule__OutputPort__Group__7 : rule__OutputPort__Group__7__Impl rule__OutputPort__Group__8 ;
    public final void rule__OutputPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2572:1: ( rule__OutputPort__Group__7__Impl rule__OutputPort__Group__8 )
            // InternalComponentDefinition.g:2573:2: rule__OutputPort__Group__7__Impl rule__OutputPort__Group__8
            {
            pushFollow(FOLLOW_13);
            rule__OutputPort__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__7"


    // $ANTLR start "rule__OutputPort__Group__7__Impl"
    // InternalComponentDefinition.g:2580:1: rule__OutputPort__Group__7__Impl : ( ( rule__OutputPort__ExtensionsAssignment_7 )* ) ;
    public final void rule__OutputPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2584:1: ( ( ( rule__OutputPort__ExtensionsAssignment_7 )* ) )
            // InternalComponentDefinition.g:2585:1: ( ( rule__OutputPort__ExtensionsAssignment_7 )* )
            {
            // InternalComponentDefinition.g:2585:1: ( ( rule__OutputPort__ExtensionsAssignment_7 )* )
            // InternalComponentDefinition.g:2586:2: ( rule__OutputPort__ExtensionsAssignment_7 )*
            {
             before(grammarAccess.getOutputPortAccess().getExtensionsAssignment_7()); 
            // InternalComponentDefinition.g:2587:2: ( rule__OutputPort__ExtensionsAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalComponentDefinition.g:2587:3: rule__OutputPort__ExtensionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__OutputPort__ExtensionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getOutputPortAccess().getExtensionsAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__7__Impl"


    // $ANTLR start "rule__OutputPort__Group__8"
    // InternalComponentDefinition.g:2595:1: rule__OutputPort__Group__8 : rule__OutputPort__Group__8__Impl ;
    public final void rule__OutputPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2599:1: ( rule__OutputPort__Group__8__Impl )
            // InternalComponentDefinition.g:2600:2: rule__OutputPort__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__8"


    // $ANTLR start "rule__OutputPort__Group__8__Impl"
    // InternalComponentDefinition.g:2606:1: rule__OutputPort__Group__8__Impl : ( '}' ) ;
    public final void rule__OutputPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2610:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2611:1: ( '}' )
            {
            // InternalComponentDefinition.g:2611:1: ( '}' )
            // InternalComponentDefinition.g:2612:2: '}'
            {
             before(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__8__Impl"


    // $ANTLR start "rule__AnswerPort__Group__0"
    // InternalComponentDefinition.g:2622:1: rule__AnswerPort__Group__0 : rule__AnswerPort__Group__0__Impl rule__AnswerPort__Group__1 ;
    public final void rule__AnswerPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2626:1: ( rule__AnswerPort__Group__0__Impl rule__AnswerPort__Group__1 )
            // InternalComponentDefinition.g:2627:2: rule__AnswerPort__Group__0__Impl rule__AnswerPort__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AnswerPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnswerPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__0"


    // $ANTLR start "rule__AnswerPort__Group__0__Impl"
    // InternalComponentDefinition.g:2634:1: rule__AnswerPort__Group__0__Impl : ( 'AnswerPort' ) ;
    public final void rule__AnswerPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2638:1: ( ( 'AnswerPort' ) )
            // InternalComponentDefinition.g:2639:1: ( 'AnswerPort' )
            {
            // InternalComponentDefinition.g:2639:1: ( 'AnswerPort' )
            // InternalComponentDefinition.g:2640:2: 'AnswerPort'
            {
             before(grammarAccess.getAnswerPortAccess().getAnswerPortKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAnswerPortAccess().getAnswerPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__0__Impl"


    // $ANTLR start "rule__AnswerPort__Group__1"
    // InternalComponentDefinition.g:2649:1: rule__AnswerPort__Group__1 : rule__AnswerPort__Group__1__Impl rule__AnswerPort__Group__2 ;
    public final void rule__AnswerPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2653:1: ( rule__AnswerPort__Group__1__Impl rule__AnswerPort__Group__2 )
            // InternalComponentDefinition.g:2654:2: rule__AnswerPort__Group__1__Impl rule__AnswerPort__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__AnswerPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnswerPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__1"


    // $ANTLR start "rule__AnswerPort__Group__1__Impl"
    // InternalComponentDefinition.g:2661:1: rule__AnswerPort__Group__1__Impl : ( ( rule__AnswerPort__NameAssignment_1 ) ) ;
    public final void rule__AnswerPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2665:1: ( ( ( rule__AnswerPort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:2666:1: ( ( rule__AnswerPort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:2666:1: ( ( rule__AnswerPort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:2667:2: ( rule__AnswerPort__NameAssignment_1 )
            {
             before(grammarAccess.getAnswerPortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:2668:2: ( rule__AnswerPort__NameAssignment_1 )
            // InternalComponentDefinition.g:2668:3: rule__AnswerPort__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AnswerPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAnswerPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__1__Impl"


    // $ANTLR start "rule__AnswerPort__Group__2"
    // InternalComponentDefinition.g:2676:1: rule__AnswerPort__Group__2 : rule__AnswerPort__Group__2__Impl rule__AnswerPort__Group__3 ;
    public final void rule__AnswerPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2680:1: ( rule__AnswerPort__Group__2__Impl rule__AnswerPort__Group__3 )
            // InternalComponentDefinition.g:2681:2: rule__AnswerPort__Group__2__Impl rule__AnswerPort__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__AnswerPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnswerPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__2"


    // $ANTLR start "rule__AnswerPort__Group__2__Impl"
    // InternalComponentDefinition.g:2688:1: rule__AnswerPort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__AnswerPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2692:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2693:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2693:1: ( 'implements' )
            // InternalComponentDefinition.g:2694:2: 'implements'
            {
             before(grammarAccess.getAnswerPortAccess().getImplementsKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAnswerPortAccess().getImplementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__2__Impl"


    // $ANTLR start "rule__AnswerPort__Group__3"
    // InternalComponentDefinition.g:2703:1: rule__AnswerPort__Group__3 : rule__AnswerPort__Group__3__Impl rule__AnswerPort__Group__4 ;
    public final void rule__AnswerPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2707:1: ( rule__AnswerPort__Group__3__Impl rule__AnswerPort__Group__4 )
            // InternalComponentDefinition.g:2708:2: rule__AnswerPort__Group__3__Impl rule__AnswerPort__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__AnswerPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnswerPort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__3"


    // $ANTLR start "rule__AnswerPort__Group__3__Impl"
    // InternalComponentDefinition.g:2715:1: rule__AnswerPort__Group__3__Impl : ( ( rule__AnswerPort__ServiceAssignment_3 ) ) ;
    public final void rule__AnswerPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2719:1: ( ( ( rule__AnswerPort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:2720:1: ( ( rule__AnswerPort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:2720:1: ( ( rule__AnswerPort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:2721:2: ( rule__AnswerPort__ServiceAssignment_3 )
            {
             before(grammarAccess.getAnswerPortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:2722:2: ( rule__AnswerPort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:2722:3: rule__AnswerPort__ServiceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AnswerPort__ServiceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAnswerPortAccess().getServiceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__3__Impl"


    // $ANTLR start "rule__AnswerPort__Group__4"
    // InternalComponentDefinition.g:2730:1: rule__AnswerPort__Group__4 : rule__AnswerPort__Group__4__Impl rule__AnswerPort__Group__5 ;
    public final void rule__AnswerPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2734:1: ( rule__AnswerPort__Group__4__Impl rule__AnswerPort__Group__5 )
            // InternalComponentDefinition.g:2735:2: rule__AnswerPort__Group__4__Impl rule__AnswerPort__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__AnswerPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnswerPort__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__4"


    // $ANTLR start "rule__AnswerPort__Group__4__Impl"
    // InternalComponentDefinition.g:2742:1: rule__AnswerPort__Group__4__Impl : ( '{' ) ;
    public final void rule__AnswerPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2746:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2747:1: ( '{' )
            {
            // InternalComponentDefinition.g:2747:1: ( '{' )
            // InternalComponentDefinition.g:2748:2: '{'
            {
             before(grammarAccess.getAnswerPortAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getAnswerPortAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__4__Impl"


    // $ANTLR start "rule__AnswerPort__Group__5"
    // InternalComponentDefinition.g:2757:1: rule__AnswerPort__Group__5 : rule__AnswerPort__Group__5__Impl rule__AnswerPort__Group__6 ;
    public final void rule__AnswerPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2761:1: ( rule__AnswerPort__Group__5__Impl rule__AnswerPort__Group__6 )
            // InternalComponentDefinition.g:2762:2: rule__AnswerPort__Group__5__Impl rule__AnswerPort__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__AnswerPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnswerPort__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__5"


    // $ANTLR start "rule__AnswerPort__Group__5__Impl"
    // InternalComponentDefinition.g:2769:1: rule__AnswerPort__Group__5__Impl : ( ( rule__AnswerPort__ExtensionsAssignment_5 )* ) ;
    public final void rule__AnswerPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2773:1: ( ( ( rule__AnswerPort__ExtensionsAssignment_5 )* ) )
            // InternalComponentDefinition.g:2774:1: ( ( rule__AnswerPort__ExtensionsAssignment_5 )* )
            {
            // InternalComponentDefinition.g:2774:1: ( ( rule__AnswerPort__ExtensionsAssignment_5 )* )
            // InternalComponentDefinition.g:2775:2: ( rule__AnswerPort__ExtensionsAssignment_5 )*
            {
             before(grammarAccess.getAnswerPortAccess().getExtensionsAssignment_5()); 
            // InternalComponentDefinition.g:2776:2: ( rule__AnswerPort__ExtensionsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComponentDefinition.g:2776:3: rule__AnswerPort__ExtensionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AnswerPort__ExtensionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAnswerPortAccess().getExtensionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__5__Impl"


    // $ANTLR start "rule__AnswerPort__Group__6"
    // InternalComponentDefinition.g:2784:1: rule__AnswerPort__Group__6 : rule__AnswerPort__Group__6__Impl ;
    public final void rule__AnswerPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2788:1: ( rule__AnswerPort__Group__6__Impl )
            // InternalComponentDefinition.g:2789:2: rule__AnswerPort__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnswerPort__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__6"


    // $ANTLR start "rule__AnswerPort__Group__6__Impl"
    // InternalComponentDefinition.g:2795:1: rule__AnswerPort__Group__6__Impl : ( '}' ) ;
    public final void rule__AnswerPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2799:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2800:1: ( '}' )
            {
            // InternalComponentDefinition.g:2800:1: ( '}' )
            // InternalComponentDefinition.g:2801:2: '}'
            {
             before(grammarAccess.getAnswerPortAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getAnswerPortAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__6__Impl"


    // $ANTLR start "rule__InputPort__Group__0"
    // InternalComponentDefinition.g:2811:1: rule__InputPort__Group__0 : rule__InputPort__Group__0__Impl rule__InputPort__Group__1 ;
    public final void rule__InputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2815:1: ( rule__InputPort__Group__0__Impl rule__InputPort__Group__1 )
            // InternalComponentDefinition.g:2816:2: rule__InputPort__Group__0__Impl rule__InputPort__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InputPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__0"


    // $ANTLR start "rule__InputPort__Group__0__Impl"
    // InternalComponentDefinition.g:2823:1: rule__InputPort__Group__0__Impl : ( 'InputPort' ) ;
    public final void rule__InputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2827:1: ( ( 'InputPort' ) )
            // InternalComponentDefinition.g:2828:1: ( 'InputPort' )
            {
            // InternalComponentDefinition.g:2828:1: ( 'InputPort' )
            // InternalComponentDefinition.g:2829:2: 'InputPort'
            {
             before(grammarAccess.getInputPortAccess().getInputPortKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getInputPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__0__Impl"


    // $ANTLR start "rule__InputPort__Group__1"
    // InternalComponentDefinition.g:2838:1: rule__InputPort__Group__1 : rule__InputPort__Group__1__Impl rule__InputPort__Group__2 ;
    public final void rule__InputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2842:1: ( rule__InputPort__Group__1__Impl rule__InputPort__Group__2 )
            // InternalComponentDefinition.g:2843:2: rule__InputPort__Group__1__Impl rule__InputPort__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__InputPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__1"


    // $ANTLR start "rule__InputPort__Group__1__Impl"
    // InternalComponentDefinition.g:2850:1: rule__InputPort__Group__1__Impl : ( ( rule__InputPort__NameAssignment_1 ) ) ;
    public final void rule__InputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2854:1: ( ( ( rule__InputPort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:2855:1: ( ( rule__InputPort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:2855:1: ( ( rule__InputPort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:2856:2: ( rule__InputPort__NameAssignment_1 )
            {
             before(grammarAccess.getInputPortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:2857:2: ( rule__InputPort__NameAssignment_1 )
            // InternalComponentDefinition.g:2857:3: rule__InputPort__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__1__Impl"


    // $ANTLR start "rule__InputPort__Group__2"
    // InternalComponentDefinition.g:2865:1: rule__InputPort__Group__2 : rule__InputPort__Group__2__Impl rule__InputPort__Group__3 ;
    public final void rule__InputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2869:1: ( rule__InputPort__Group__2__Impl rule__InputPort__Group__3 )
            // InternalComponentDefinition.g:2870:2: rule__InputPort__Group__2__Impl rule__InputPort__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__InputPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__2"


    // $ANTLR start "rule__InputPort__Group__2__Impl"
    // InternalComponentDefinition.g:2877:1: rule__InputPort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__InputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2881:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2882:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2882:1: ( 'implements' )
            // InternalComponentDefinition.g:2883:2: 'implements'
            {
             before(grammarAccess.getInputPortAccess().getImplementsKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getImplementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__2__Impl"


    // $ANTLR start "rule__InputPort__Group__3"
    // InternalComponentDefinition.g:2892:1: rule__InputPort__Group__3 : rule__InputPort__Group__3__Impl rule__InputPort__Group__4 ;
    public final void rule__InputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2896:1: ( rule__InputPort__Group__3__Impl rule__InputPort__Group__4 )
            // InternalComponentDefinition.g:2897:2: rule__InputPort__Group__3__Impl rule__InputPort__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__InputPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__3"


    // $ANTLR start "rule__InputPort__Group__3__Impl"
    // InternalComponentDefinition.g:2904:1: rule__InputPort__Group__3__Impl : ( ( rule__InputPort__ServiceAssignment_3 ) ) ;
    public final void rule__InputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2908:1: ( ( ( rule__InputPort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:2909:1: ( ( rule__InputPort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:2909:1: ( ( rule__InputPort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:2910:2: ( rule__InputPort__ServiceAssignment_3 )
            {
             before(grammarAccess.getInputPortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:2911:2: ( rule__InputPort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:2911:3: rule__InputPort__ServiceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__ServiceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getServiceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__3__Impl"


    // $ANTLR start "rule__InputPort__Group__4"
    // InternalComponentDefinition.g:2919:1: rule__InputPort__Group__4 : rule__InputPort__Group__4__Impl rule__InputPort__Group__5 ;
    public final void rule__InputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2923:1: ( rule__InputPort__Group__4__Impl rule__InputPort__Group__5 )
            // InternalComponentDefinition.g:2924:2: rule__InputPort__Group__4__Impl rule__InputPort__Group__5
            {
            pushFollow(FOLLOW_13);
            rule__InputPort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__4"


    // $ANTLR start "rule__InputPort__Group__4__Impl"
    // InternalComponentDefinition.g:2931:1: rule__InputPort__Group__4__Impl : ( '{' ) ;
    public final void rule__InputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2935:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2936:1: ( '{' )
            {
            // InternalComponentDefinition.g:2936:1: ( '{' )
            // InternalComponentDefinition.g:2937:2: '{'
            {
             before(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__4__Impl"


    // $ANTLR start "rule__InputPort__Group__5"
    // InternalComponentDefinition.g:2946:1: rule__InputPort__Group__5 : rule__InputPort__Group__5__Impl rule__InputPort__Group__6 ;
    public final void rule__InputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2950:1: ( rule__InputPort__Group__5__Impl rule__InputPort__Group__6 )
            // InternalComponentDefinition.g:2951:2: rule__InputPort__Group__5__Impl rule__InputPort__Group__6
            {
            pushFollow(FOLLOW_13);
            rule__InputPort__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__5"


    // $ANTLR start "rule__InputPort__Group__5__Impl"
    // InternalComponentDefinition.g:2958:1: rule__InputPort__Group__5__Impl : ( ( rule__InputPort__ExtensionsAssignment_5 )* ) ;
    public final void rule__InputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2962:1: ( ( ( rule__InputPort__ExtensionsAssignment_5 )* ) )
            // InternalComponentDefinition.g:2963:1: ( ( rule__InputPort__ExtensionsAssignment_5 )* )
            {
            // InternalComponentDefinition.g:2963:1: ( ( rule__InputPort__ExtensionsAssignment_5 )* )
            // InternalComponentDefinition.g:2964:2: ( rule__InputPort__ExtensionsAssignment_5 )*
            {
             before(grammarAccess.getInputPortAccess().getExtensionsAssignment_5()); 
            // InternalComponentDefinition.g:2965:2: ( rule__InputPort__ExtensionsAssignment_5 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalComponentDefinition.g:2965:3: rule__InputPort__ExtensionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__InputPort__ExtensionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getInputPortAccess().getExtensionsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__5__Impl"


    // $ANTLR start "rule__InputPort__Group__6"
    // InternalComponentDefinition.g:2973:1: rule__InputPort__Group__6 : rule__InputPort__Group__6__Impl ;
    public final void rule__InputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2977:1: ( rule__InputPort__Group__6__Impl )
            // InternalComponentDefinition.g:2978:2: rule__InputPort__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__6"


    // $ANTLR start "rule__InputPort__Group__6__Impl"
    // InternalComponentDefinition.g:2984:1: rule__InputPort__Group__6__Impl : ( '}' ) ;
    public final void rule__InputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2988:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2989:1: ( '}' )
            {
            // InternalComponentDefinition.g:2989:1: ( '}' )
            // InternalComponentDefinition.g:2990:2: '}'
            {
             before(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__6__Impl"


    // $ANTLR start "rule__SupportedMiddleware__Group__0"
    // InternalComponentDefinition.g:3000:1: rule__SupportedMiddleware__Group__0 : rule__SupportedMiddleware__Group__0__Impl rule__SupportedMiddleware__Group__1 ;
    public final void rule__SupportedMiddleware__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3004:1: ( rule__SupportedMiddleware__Group__0__Impl rule__SupportedMiddleware__Group__1 )
            // InternalComponentDefinition.g:3005:2: rule__SupportedMiddleware__Group__0__Impl rule__SupportedMiddleware__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__SupportedMiddleware__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SupportedMiddleware__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedMiddleware__Group__0"


    // $ANTLR start "rule__SupportedMiddleware__Group__0__Impl"
    // InternalComponentDefinition.g:3012:1: rule__SupportedMiddleware__Group__0__Impl : ( 'SupportedMiddleware' ) ;
    public final void rule__SupportedMiddleware__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3016:1: ( ( 'SupportedMiddleware' ) )
            // InternalComponentDefinition.g:3017:1: ( 'SupportedMiddleware' )
            {
            // InternalComponentDefinition.g:3017:1: ( 'SupportedMiddleware' )
            // InternalComponentDefinition.g:3018:2: 'SupportedMiddleware'
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getSupportedMiddlewareKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getSupportedMiddlewareAccess().getSupportedMiddlewareKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedMiddleware__Group__0__Impl"


    // $ANTLR start "rule__SupportedMiddleware__Group__1"
    // InternalComponentDefinition.g:3027:1: rule__SupportedMiddleware__Group__1 : rule__SupportedMiddleware__Group__1__Impl rule__SupportedMiddleware__Group__2 ;
    public final void rule__SupportedMiddleware__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3031:1: ( rule__SupportedMiddleware__Group__1__Impl rule__SupportedMiddleware__Group__2 )
            // InternalComponentDefinition.g:3032:2: rule__SupportedMiddleware__Group__1__Impl rule__SupportedMiddleware__Group__2
            {
            pushFollow(FOLLOW_16);
            rule__SupportedMiddleware__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SupportedMiddleware__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedMiddleware__Group__1"


    // $ANTLR start "rule__SupportedMiddleware__Group__1__Impl"
    // InternalComponentDefinition.g:3039:1: rule__SupportedMiddleware__Group__1__Impl : ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? ) ;
    public final void rule__SupportedMiddleware__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3043:1: ( ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? ) )
            // InternalComponentDefinition.g:3044:1: ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? )
            {
            // InternalComponentDefinition.g:3044:1: ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? )
            // InternalComponentDefinition.g:3045:2: ( rule__SupportedMiddleware__DefaultAssignment_1 )?
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getDefaultAssignment_1()); 
            // InternalComponentDefinition.g:3046:2: ( rule__SupportedMiddleware__DefaultAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==77) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentDefinition.g:3046:3: rule__SupportedMiddleware__DefaultAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SupportedMiddleware__DefaultAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSupportedMiddlewareAccess().getDefaultAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedMiddleware__Group__1__Impl"


    // $ANTLR start "rule__SupportedMiddleware__Group__2"
    // InternalComponentDefinition.g:3054:1: rule__SupportedMiddleware__Group__2 : rule__SupportedMiddleware__Group__2__Impl rule__SupportedMiddleware__Group__3 ;
    public final void rule__SupportedMiddleware__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3058:1: ( rule__SupportedMiddleware__Group__2__Impl rule__SupportedMiddleware__Group__3 )
            // InternalComponentDefinition.g:3059:2: rule__SupportedMiddleware__Group__2__Impl rule__SupportedMiddleware__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__SupportedMiddleware__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SupportedMiddleware__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedMiddleware__Group__2"


    // $ANTLR start "rule__SupportedMiddleware__Group__2__Impl"
    // InternalComponentDefinition.g:3066:1: rule__SupportedMiddleware__Group__2__Impl : ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) ) ;
    public final void rule__SupportedMiddleware__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3070:1: ( ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) ) )
            // InternalComponentDefinition.g:3071:1: ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) )
            {
            // InternalComponentDefinition.g:3071:1: ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) )
            // InternalComponentDefinition.g:3072:2: ( rule__SupportedMiddleware__MiddlewareAssignment_2 )
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareAssignment_2()); 
            // InternalComponentDefinition.g:3073:2: ( rule__SupportedMiddleware__MiddlewareAssignment_2 )
            // InternalComponentDefinition.g:3073:3: rule__SupportedMiddleware__MiddlewareAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SupportedMiddleware__MiddlewareAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedMiddleware__Group__2__Impl"


    // $ANTLR start "rule__SupportedMiddleware__Group__3"
    // InternalComponentDefinition.g:3081:1: rule__SupportedMiddleware__Group__3 : rule__SupportedMiddleware__Group__3__Impl ;
    public final void rule__SupportedMiddleware__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3085:1: ( rule__SupportedMiddleware__Group__3__Impl )
            // InternalComponentDefinition.g:3086:2: rule__SupportedMiddleware__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SupportedMiddleware__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedMiddleware__Group__3"


    // $ANTLR start "rule__SupportedMiddleware__Group__3__Impl"
    // InternalComponentDefinition.g:3092:1: rule__SupportedMiddleware__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__SupportedMiddleware__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3096:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:3097:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:3097:1: ( ( ';' )? )
            // InternalComponentDefinition.g:3098:2: ( ';' )?
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getSemicolonKeyword_3()); 
            // InternalComponentDefinition.g:3099:2: ( ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==16) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentDefinition.g:3099:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSupportedMiddlewareAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedMiddleware__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__0"
    // InternalComponentDefinition.g:3108:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3112:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // InternalComponentDefinition.g:3113:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Activity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0"


    // $ANTLR start "rule__Activity__Group__0__Impl"
    // InternalComponentDefinition.g:3120:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3124:1: ( ( 'Activity' ) )
            // InternalComponentDefinition.g:3125:1: ( 'Activity' )
            {
            // InternalComponentDefinition.g:3125:1: ( 'Activity' )
            // InternalComponentDefinition.g:3126:2: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__0__Impl"


    // $ANTLR start "rule__Activity__Group__1"
    // InternalComponentDefinition.g:3135:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3139:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // InternalComponentDefinition.g:3140:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Activity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1"


    // $ANTLR start "rule__Activity__Group__1__Impl"
    // InternalComponentDefinition.g:3147:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3151:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:3152:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3152:1: ( ( rule__Activity__NameAssignment_1 ) )
            // InternalComponentDefinition.g:3153:2: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:3154:2: ( rule__Activity__NameAssignment_1 )
            // InternalComponentDefinition.g:3154:3: rule__Activity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Activity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__1__Impl"


    // $ANTLR start "rule__Activity__Group__2"
    // InternalComponentDefinition.g:3162:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3166:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // InternalComponentDefinition.g:3167:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__Activity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2"


    // $ANTLR start "rule__Activity__Group__2__Impl"
    // InternalComponentDefinition.g:3174:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3178:1: ( ( '{' ) )
            // InternalComponentDefinition.g:3179:1: ( '{' )
            {
            // InternalComponentDefinition.g:3179:1: ( '{' )
            // InternalComponentDefinition.g:3180:2: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__2__Impl"


    // $ANTLR start "rule__Activity__Group__3"
    // InternalComponentDefinition.g:3189:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3193:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // InternalComponentDefinition.g:3194:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Activity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3"


    // $ANTLR start "rule__Activity__Group__3__Impl"
    // InternalComponentDefinition.g:3201:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__LinksAssignment_3 )* ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3205:1: ( ( ( rule__Activity__LinksAssignment_3 )* ) )
            // InternalComponentDefinition.g:3206:1: ( ( rule__Activity__LinksAssignment_3 )* )
            {
            // InternalComponentDefinition.g:3206:1: ( ( rule__Activity__LinksAssignment_3 )* )
            // InternalComponentDefinition.g:3207:2: ( rule__Activity__LinksAssignment_3 )*
            {
             before(grammarAccess.getActivityAccess().getLinksAssignment_3()); 
            // InternalComponentDefinition.g:3208:2: ( rule__Activity__LinksAssignment_3 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=32 && LA25_0<=36)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalComponentDefinition.g:3208:3: rule__Activity__LinksAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Activity__LinksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getLinksAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__3__Impl"


    // $ANTLR start "rule__Activity__Group__4"
    // InternalComponentDefinition.g:3216:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3220:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // InternalComponentDefinition.g:3221:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Activity__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Activity__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4"


    // $ANTLR start "rule__Activity__Group__4__Impl"
    // InternalComponentDefinition.g:3228:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__ExtensionsAssignment_4 )* ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3232:1: ( ( ( rule__Activity__ExtensionsAssignment_4 )* ) )
            // InternalComponentDefinition.g:3233:1: ( ( rule__Activity__ExtensionsAssignment_4 )* )
            {
            // InternalComponentDefinition.g:3233:1: ( ( rule__Activity__ExtensionsAssignment_4 )* )
            // InternalComponentDefinition.g:3234:2: ( rule__Activity__ExtensionsAssignment_4 )*
            {
             before(grammarAccess.getActivityAccess().getExtensionsAssignment_4()); 
            // InternalComponentDefinition.g:3235:2: ( rule__Activity__ExtensionsAssignment_4 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==37||(LA26_0>=43 && LA26_0<=44)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalComponentDefinition.g:3235:3: rule__Activity__ExtensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Activity__ExtensionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getActivityAccess().getExtensionsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__4__Impl"


    // $ANTLR start "rule__Activity__Group__5"
    // InternalComponentDefinition.g:3243:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3247:1: ( rule__Activity__Group__5__Impl )
            // InternalComponentDefinition.g:3248:2: rule__Activity__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Activity__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5"


    // $ANTLR start "rule__Activity__Group__5__Impl"
    // InternalComponentDefinition.g:3254:1: rule__Activity__Group__5__Impl : ( '}' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3258:1: ( ( '}' ) )
            // InternalComponentDefinition.g:3259:1: ( '}' )
            {
            // InternalComponentDefinition.g:3259:1: ( '}' )
            // InternalComponentDefinition.g:3260:2: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__Group__5__Impl"


    // $ANTLR start "rule__InputHandler__Group__0"
    // InternalComponentDefinition.g:3270:1: rule__InputHandler__Group__0 : rule__InputHandler__Group__0__Impl rule__InputHandler__Group__1 ;
    public final void rule__InputHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3274:1: ( rule__InputHandler__Group__0__Impl rule__InputHandler__Group__1 )
            // InternalComponentDefinition.g:3275:2: rule__InputHandler__Group__0__Impl rule__InputHandler__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__InputHandler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandler__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__0"


    // $ANTLR start "rule__InputHandler__Group__0__Impl"
    // InternalComponentDefinition.g:3282:1: rule__InputHandler__Group__0__Impl : ( 'InputHandler' ) ;
    public final void rule__InputHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3286:1: ( ( 'InputHandler' ) )
            // InternalComponentDefinition.g:3287:1: ( 'InputHandler' )
            {
            // InternalComponentDefinition.g:3287:1: ( 'InputHandler' )
            // InternalComponentDefinition.g:3288:2: 'InputHandler'
            {
             before(grammarAccess.getInputHandlerAccess().getInputHandlerKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInputHandlerAccess().getInputHandlerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__0__Impl"


    // $ANTLR start "rule__InputHandler__Group__1"
    // InternalComponentDefinition.g:3297:1: rule__InputHandler__Group__1 : rule__InputHandler__Group__1__Impl rule__InputHandler__Group__2 ;
    public final void rule__InputHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3301:1: ( rule__InputHandler__Group__1__Impl rule__InputHandler__Group__2 )
            // InternalComponentDefinition.g:3302:2: rule__InputHandler__Group__1__Impl rule__InputHandler__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__InputHandler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandler__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__1"


    // $ANTLR start "rule__InputHandler__Group__1__Impl"
    // InternalComponentDefinition.g:3309:1: rule__InputHandler__Group__1__Impl : ( ( rule__InputHandler__NameAssignment_1 ) ) ;
    public final void rule__InputHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3313:1: ( ( ( rule__InputHandler__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:3314:1: ( ( rule__InputHandler__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3314:1: ( ( rule__InputHandler__NameAssignment_1 ) )
            // InternalComponentDefinition.g:3315:2: ( rule__InputHandler__NameAssignment_1 )
            {
             before(grammarAccess.getInputHandlerAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:3316:2: ( rule__InputHandler__NameAssignment_1 )
            // InternalComponentDefinition.g:3316:3: rule__InputHandler__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InputHandler__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputHandlerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__1__Impl"


    // $ANTLR start "rule__InputHandler__Group__2"
    // InternalComponentDefinition.g:3324:1: rule__InputHandler__Group__2 : rule__InputHandler__Group__2__Impl rule__InputHandler__Group__3 ;
    public final void rule__InputHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3328:1: ( rule__InputHandler__Group__2__Impl rule__InputHandler__Group__3 )
            // InternalComponentDefinition.g:3329:2: rule__InputHandler__Group__2__Impl rule__InputHandler__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__InputHandler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandler__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__2"


    // $ANTLR start "rule__InputHandler__Group__2__Impl"
    // InternalComponentDefinition.g:3336:1: rule__InputHandler__Group__2__Impl : ( 'triggeredFrom' ) ;
    public final void rule__InputHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3340:1: ( ( 'triggeredFrom' ) )
            // InternalComponentDefinition.g:3341:1: ( 'triggeredFrom' )
            {
            // InternalComponentDefinition.g:3341:1: ( 'triggeredFrom' )
            // InternalComponentDefinition.g:3342:2: 'triggeredFrom'
            {
             before(grammarAccess.getInputHandlerAccess().getTriggeredFromKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getInputHandlerAccess().getTriggeredFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__2__Impl"


    // $ANTLR start "rule__InputHandler__Group__3"
    // InternalComponentDefinition.g:3351:1: rule__InputHandler__Group__3 : rule__InputHandler__Group__3__Impl rule__InputHandler__Group__4 ;
    public final void rule__InputHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3355:1: ( rule__InputHandler__Group__3__Impl rule__InputHandler__Group__4 )
            // InternalComponentDefinition.g:3356:2: rule__InputHandler__Group__3__Impl rule__InputHandler__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__InputHandler__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandler__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__3"


    // $ANTLR start "rule__InputHandler__Group__3__Impl"
    // InternalComponentDefinition.g:3363:1: rule__InputHandler__Group__3__Impl : ( ( rule__InputHandler__InputPortAssignment_3 ) ) ;
    public final void rule__InputHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3367:1: ( ( ( rule__InputHandler__InputPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:3368:1: ( ( rule__InputHandler__InputPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:3368:1: ( ( rule__InputHandler__InputPortAssignment_3 ) )
            // InternalComponentDefinition.g:3369:2: ( rule__InputHandler__InputPortAssignment_3 )
            {
             before(grammarAccess.getInputHandlerAccess().getInputPortAssignment_3()); 
            // InternalComponentDefinition.g:3370:2: ( rule__InputHandler__InputPortAssignment_3 )
            // InternalComponentDefinition.g:3370:3: rule__InputHandler__InputPortAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InputHandler__InputPortAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputHandlerAccess().getInputPortAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__3__Impl"


    // $ANTLR start "rule__InputHandler__Group__4"
    // InternalComponentDefinition.g:3378:1: rule__InputHandler__Group__4 : rule__InputHandler__Group__4__Impl rule__InputHandler__Group__5 ;
    public final void rule__InputHandler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3382:1: ( rule__InputHandler__Group__4__Impl rule__InputHandler__Group__5 )
            // InternalComponentDefinition.g:3383:2: rule__InputHandler__Group__4__Impl rule__InputHandler__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__InputHandler__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandler__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__4"


    // $ANTLR start "rule__InputHandler__Group__4__Impl"
    // InternalComponentDefinition.g:3390:1: rule__InputHandler__Group__4__Impl : ( ( rule__InputHandler__ActiveQueueAssignment_4 )? ) ;
    public final void rule__InputHandler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3394:1: ( ( ( rule__InputHandler__ActiveQueueAssignment_4 )? ) )
            // InternalComponentDefinition.g:3395:1: ( ( rule__InputHandler__ActiveQueueAssignment_4 )? )
            {
            // InternalComponentDefinition.g:3395:1: ( ( rule__InputHandler__ActiveQueueAssignment_4 )? )
            // InternalComponentDefinition.g:3396:2: ( rule__InputHandler__ActiveQueueAssignment_4 )?
            {
             before(grammarAccess.getInputHandlerAccess().getActiveQueueAssignment_4()); 
            // InternalComponentDefinition.g:3397:2: ( rule__InputHandler__ActiveQueueAssignment_4 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==78) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentDefinition.g:3397:3: rule__InputHandler__ActiveQueueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputHandler__ActiveQueueAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputHandlerAccess().getActiveQueueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__4__Impl"


    // $ANTLR start "rule__InputHandler__Group__5"
    // InternalComponentDefinition.g:3405:1: rule__InputHandler__Group__5 : rule__InputHandler__Group__5__Impl rule__InputHandler__Group__6 ;
    public final void rule__InputHandler__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3409:1: ( rule__InputHandler__Group__5__Impl rule__InputHandler__Group__6 )
            // InternalComponentDefinition.g:3410:2: rule__InputHandler__Group__5__Impl rule__InputHandler__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__InputHandler__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandler__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__5"


    // $ANTLR start "rule__InputHandler__Group__5__Impl"
    // InternalComponentDefinition.g:3417:1: rule__InputHandler__Group__5__Impl : ( '{' ) ;
    public final void rule__InputHandler__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3421:1: ( ( '{' ) )
            // InternalComponentDefinition.g:3422:1: ( '{' )
            {
            // InternalComponentDefinition.g:3422:1: ( '{' )
            // InternalComponentDefinition.g:3423:2: '{'
            {
             before(grammarAccess.getInputHandlerAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInputHandlerAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__5__Impl"


    // $ANTLR start "rule__InputHandler__Group__6"
    // InternalComponentDefinition.g:3432:1: rule__InputHandler__Group__6 : rule__InputHandler__Group__6__Impl rule__InputHandler__Group__7 ;
    public final void rule__InputHandler__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3436:1: ( rule__InputHandler__Group__6__Impl rule__InputHandler__Group__7 )
            // InternalComponentDefinition.g:3437:2: rule__InputHandler__Group__6__Impl rule__InputHandler__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__InputHandler__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandler__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__6"


    // $ANTLR start "rule__InputHandler__Group__6__Impl"
    // InternalComponentDefinition.g:3444:1: rule__InputHandler__Group__6__Impl : ( ( rule__InputHandler__LinksAssignment_6 )* ) ;
    public final void rule__InputHandler__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3448:1: ( ( ( rule__InputHandler__LinksAssignment_6 )* ) )
            // InternalComponentDefinition.g:3449:1: ( ( rule__InputHandler__LinksAssignment_6 )* )
            {
            // InternalComponentDefinition.g:3449:1: ( ( rule__InputHandler__LinksAssignment_6 )* )
            // InternalComponentDefinition.g:3450:2: ( rule__InputHandler__LinksAssignment_6 )*
            {
             before(grammarAccess.getInputHandlerAccess().getLinksAssignment_6()); 
            // InternalComponentDefinition.g:3451:2: ( rule__InputHandler__LinksAssignment_6 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=32 && LA28_0<=36)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalComponentDefinition.g:3451:3: rule__InputHandler__LinksAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InputHandler__LinksAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getInputHandlerAccess().getLinksAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__6__Impl"


    // $ANTLR start "rule__InputHandler__Group__7"
    // InternalComponentDefinition.g:3459:1: rule__InputHandler__Group__7 : rule__InputHandler__Group__7__Impl ;
    public final void rule__InputHandler__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3463:1: ( rule__InputHandler__Group__7__Impl )
            // InternalComponentDefinition.g:3464:2: rule__InputHandler__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputHandler__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__7"


    // $ANTLR start "rule__InputHandler__Group__7__Impl"
    // InternalComponentDefinition.g:3470:1: rule__InputHandler__Group__7__Impl : ( '}' ) ;
    public final void rule__InputHandler__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3474:1: ( ( '}' ) )
            // InternalComponentDefinition.g:3475:1: ( '}' )
            {
            // InternalComponentDefinition.g:3475:1: ( '}' )
            // InternalComponentDefinition.g:3476:2: '}'
            {
             before(grammarAccess.getInputHandlerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInputHandlerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__Group__7__Impl"


    // $ANTLR start "rule__RequestHandler__Group__0"
    // InternalComponentDefinition.g:3486:1: rule__RequestHandler__Group__0 : rule__RequestHandler__Group__0__Impl rule__RequestHandler__Group__1 ;
    public final void rule__RequestHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3490:1: ( rule__RequestHandler__Group__0__Impl rule__RequestHandler__Group__1 )
            // InternalComponentDefinition.g:3491:2: rule__RequestHandler__Group__0__Impl rule__RequestHandler__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RequestHandler__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestHandler__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__0"


    // $ANTLR start "rule__RequestHandler__Group__0__Impl"
    // InternalComponentDefinition.g:3498:1: rule__RequestHandler__Group__0__Impl : ( 'RequestHandler' ) ;
    public final void rule__RequestHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3502:1: ( ( 'RequestHandler' ) )
            // InternalComponentDefinition.g:3503:1: ( 'RequestHandler' )
            {
            // InternalComponentDefinition.g:3503:1: ( 'RequestHandler' )
            // InternalComponentDefinition.g:3504:2: 'RequestHandler'
            {
             before(grammarAccess.getRequestHandlerAccess().getRequestHandlerKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getRequestHandlerAccess().getRequestHandlerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__0__Impl"


    // $ANTLR start "rule__RequestHandler__Group__1"
    // InternalComponentDefinition.g:3513:1: rule__RequestHandler__Group__1 : rule__RequestHandler__Group__1__Impl rule__RequestHandler__Group__2 ;
    public final void rule__RequestHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3517:1: ( rule__RequestHandler__Group__1__Impl rule__RequestHandler__Group__2 )
            // InternalComponentDefinition.g:3518:2: rule__RequestHandler__Group__1__Impl rule__RequestHandler__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__RequestHandler__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestHandler__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__1"


    // $ANTLR start "rule__RequestHandler__Group__1__Impl"
    // InternalComponentDefinition.g:3525:1: rule__RequestHandler__Group__1__Impl : ( ( rule__RequestHandler__NameAssignment_1 ) ) ;
    public final void rule__RequestHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3529:1: ( ( ( rule__RequestHandler__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:3530:1: ( ( rule__RequestHandler__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3530:1: ( ( rule__RequestHandler__NameAssignment_1 ) )
            // InternalComponentDefinition.g:3531:2: ( rule__RequestHandler__NameAssignment_1 )
            {
             before(grammarAccess.getRequestHandlerAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:3532:2: ( rule__RequestHandler__NameAssignment_1 )
            // InternalComponentDefinition.g:3532:3: rule__RequestHandler__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequestHandler__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequestHandlerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__1__Impl"


    // $ANTLR start "rule__RequestHandler__Group__2"
    // InternalComponentDefinition.g:3540:1: rule__RequestHandler__Group__2 : rule__RequestHandler__Group__2__Impl rule__RequestHandler__Group__3 ;
    public final void rule__RequestHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3544:1: ( rule__RequestHandler__Group__2__Impl rule__RequestHandler__Group__3 )
            // InternalComponentDefinition.g:3545:2: rule__RequestHandler__Group__2__Impl rule__RequestHandler__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__RequestHandler__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestHandler__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__2"


    // $ANTLR start "rule__RequestHandler__Group__2__Impl"
    // InternalComponentDefinition.g:3552:1: rule__RequestHandler__Group__2__Impl : ( 'triggeredFrom' ) ;
    public final void rule__RequestHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3556:1: ( ( 'triggeredFrom' ) )
            // InternalComponentDefinition.g:3557:1: ( 'triggeredFrom' )
            {
            // InternalComponentDefinition.g:3557:1: ( 'triggeredFrom' )
            // InternalComponentDefinition.g:3558:2: 'triggeredFrom'
            {
             before(grammarAccess.getRequestHandlerAccess().getTriggeredFromKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getRequestHandlerAccess().getTriggeredFromKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__2__Impl"


    // $ANTLR start "rule__RequestHandler__Group__3"
    // InternalComponentDefinition.g:3567:1: rule__RequestHandler__Group__3 : rule__RequestHandler__Group__3__Impl rule__RequestHandler__Group__4 ;
    public final void rule__RequestHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3571:1: ( rule__RequestHandler__Group__3__Impl rule__RequestHandler__Group__4 )
            // InternalComponentDefinition.g:3572:2: rule__RequestHandler__Group__3__Impl rule__RequestHandler__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__RequestHandler__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestHandler__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__3"


    // $ANTLR start "rule__RequestHandler__Group__3__Impl"
    // InternalComponentDefinition.g:3579:1: rule__RequestHandler__Group__3__Impl : ( ( rule__RequestHandler__AnswerPortAssignment_3 ) ) ;
    public final void rule__RequestHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3583:1: ( ( ( rule__RequestHandler__AnswerPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:3584:1: ( ( rule__RequestHandler__AnswerPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:3584:1: ( ( rule__RequestHandler__AnswerPortAssignment_3 ) )
            // InternalComponentDefinition.g:3585:2: ( rule__RequestHandler__AnswerPortAssignment_3 )
            {
             before(grammarAccess.getRequestHandlerAccess().getAnswerPortAssignment_3()); 
            // InternalComponentDefinition.g:3586:2: ( rule__RequestHandler__AnswerPortAssignment_3 )
            // InternalComponentDefinition.g:3586:3: rule__RequestHandler__AnswerPortAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__RequestHandler__AnswerPortAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRequestHandlerAccess().getAnswerPortAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__3__Impl"


    // $ANTLR start "rule__RequestHandler__Group__4"
    // InternalComponentDefinition.g:3594:1: rule__RequestHandler__Group__4 : rule__RequestHandler__Group__4__Impl rule__RequestHandler__Group__5 ;
    public final void rule__RequestHandler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3598:1: ( rule__RequestHandler__Group__4__Impl rule__RequestHandler__Group__5 )
            // InternalComponentDefinition.g:3599:2: rule__RequestHandler__Group__4__Impl rule__RequestHandler__Group__5
            {
            pushFollow(FOLLOW_21);
            rule__RequestHandler__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestHandler__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__4"


    // $ANTLR start "rule__RequestHandler__Group__4__Impl"
    // InternalComponentDefinition.g:3606:1: rule__RequestHandler__Group__4__Impl : ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? ) ;
    public final void rule__RequestHandler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3610:1: ( ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? ) )
            // InternalComponentDefinition.g:3611:1: ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? )
            {
            // InternalComponentDefinition.g:3611:1: ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? )
            // InternalComponentDefinition.g:3612:2: ( rule__RequestHandler__ActiveQueueAssignment_4 )?
            {
             before(grammarAccess.getRequestHandlerAccess().getActiveQueueAssignment_4()); 
            // InternalComponentDefinition.g:3613:2: ( rule__RequestHandler__ActiveQueueAssignment_4 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==78) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponentDefinition.g:3613:3: rule__RequestHandler__ActiveQueueAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequestHandler__ActiveQueueAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestHandlerAccess().getActiveQueueAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__4__Impl"


    // $ANTLR start "rule__RequestHandler__Group__5"
    // InternalComponentDefinition.g:3621:1: rule__RequestHandler__Group__5 : rule__RequestHandler__Group__5__Impl rule__RequestHandler__Group__6 ;
    public final void rule__RequestHandler__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3625:1: ( rule__RequestHandler__Group__5__Impl rule__RequestHandler__Group__6 )
            // InternalComponentDefinition.g:3626:2: rule__RequestHandler__Group__5__Impl rule__RequestHandler__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__RequestHandler__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestHandler__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__5"


    // $ANTLR start "rule__RequestHandler__Group__5__Impl"
    // InternalComponentDefinition.g:3633:1: rule__RequestHandler__Group__5__Impl : ( '{' ) ;
    public final void rule__RequestHandler__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3637:1: ( ( '{' ) )
            // InternalComponentDefinition.g:3638:1: ( '{' )
            {
            // InternalComponentDefinition.g:3638:1: ( '{' )
            // InternalComponentDefinition.g:3639:2: '{'
            {
             before(grammarAccess.getRequestHandlerAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getRequestHandlerAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__5__Impl"


    // $ANTLR start "rule__RequestHandler__Group__6"
    // InternalComponentDefinition.g:3648:1: rule__RequestHandler__Group__6 : rule__RequestHandler__Group__6__Impl rule__RequestHandler__Group__7 ;
    public final void rule__RequestHandler__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3652:1: ( rule__RequestHandler__Group__6__Impl rule__RequestHandler__Group__7 )
            // InternalComponentDefinition.g:3653:2: rule__RequestHandler__Group__6__Impl rule__RequestHandler__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__RequestHandler__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestHandler__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__6"


    // $ANTLR start "rule__RequestHandler__Group__6__Impl"
    // InternalComponentDefinition.g:3660:1: rule__RequestHandler__Group__6__Impl : ( ( rule__RequestHandler__LinksAssignment_6 )* ) ;
    public final void rule__RequestHandler__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3664:1: ( ( ( rule__RequestHandler__LinksAssignment_6 )* ) )
            // InternalComponentDefinition.g:3665:1: ( ( rule__RequestHandler__LinksAssignment_6 )* )
            {
            // InternalComponentDefinition.g:3665:1: ( ( rule__RequestHandler__LinksAssignment_6 )* )
            // InternalComponentDefinition.g:3666:2: ( rule__RequestHandler__LinksAssignment_6 )*
            {
             before(grammarAccess.getRequestHandlerAccess().getLinksAssignment_6()); 
            // InternalComponentDefinition.g:3667:2: ( rule__RequestHandler__LinksAssignment_6 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=32 && LA30_0<=36)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalComponentDefinition.g:3667:3: rule__RequestHandler__LinksAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__RequestHandler__LinksAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getRequestHandlerAccess().getLinksAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__6__Impl"


    // $ANTLR start "rule__RequestHandler__Group__7"
    // InternalComponentDefinition.g:3675:1: rule__RequestHandler__Group__7 : rule__RequestHandler__Group__7__Impl ;
    public final void rule__RequestHandler__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3679:1: ( rule__RequestHandler__Group__7__Impl )
            // InternalComponentDefinition.g:3680:2: rule__RequestHandler__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequestHandler__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__7"


    // $ANTLR start "rule__RequestHandler__Group__7__Impl"
    // InternalComponentDefinition.g:3686:1: rule__RequestHandler__Group__7__Impl : ( '}' ) ;
    public final void rule__RequestHandler__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3690:1: ( ( '}' ) )
            // InternalComponentDefinition.g:3691:1: ( '}' )
            {
            // InternalComponentDefinition.g:3691:1: ( '}' )
            // InternalComponentDefinition.g:3692:2: '}'
            {
             before(grammarAccess.getRequestHandlerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getRequestHandlerAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__Group__7__Impl"


    // $ANTLR start "rule__RequestPortLink__Group__0"
    // InternalComponentDefinition.g:3702:1: rule__RequestPortLink__Group__0 : rule__RequestPortLink__Group__0__Impl rule__RequestPortLink__Group__1 ;
    public final void rule__RequestPortLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3706:1: ( rule__RequestPortLink__Group__0__Impl rule__RequestPortLink__Group__1 )
            // InternalComponentDefinition.g:3707:2: rule__RequestPortLink__Group__0__Impl rule__RequestPortLink__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__RequestPortLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestPortLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPortLink__Group__0"


    // $ANTLR start "rule__RequestPortLink__Group__0__Impl"
    // InternalComponentDefinition.g:3714:1: rule__RequestPortLink__Group__0__Impl : ( 'RequestPortLink' ) ;
    public final void rule__RequestPortLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3718:1: ( ( 'RequestPortLink' ) )
            // InternalComponentDefinition.g:3719:1: ( 'RequestPortLink' )
            {
            // InternalComponentDefinition.g:3719:1: ( 'RequestPortLink' )
            // InternalComponentDefinition.g:3720:2: 'RequestPortLink'
            {
             before(grammarAccess.getRequestPortLinkAccess().getRequestPortLinkKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getRequestPortLinkAccess().getRequestPortLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPortLink__Group__0__Impl"


    // $ANTLR start "rule__RequestPortLink__Group__1"
    // InternalComponentDefinition.g:3729:1: rule__RequestPortLink__Group__1 : rule__RequestPortLink__Group__1__Impl rule__RequestPortLink__Group__2 ;
    public final void rule__RequestPortLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3733:1: ( rule__RequestPortLink__Group__1__Impl rule__RequestPortLink__Group__2 )
            // InternalComponentDefinition.g:3734:2: rule__RequestPortLink__Group__1__Impl rule__RequestPortLink__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__RequestPortLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestPortLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPortLink__Group__1"


    // $ANTLR start "rule__RequestPortLink__Group__1__Impl"
    // InternalComponentDefinition.g:3741:1: rule__RequestPortLink__Group__1__Impl : ( ( rule__RequestPortLink__RequestPortAssignment_1 ) ) ;
    public final void rule__RequestPortLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3745:1: ( ( ( rule__RequestPortLink__RequestPortAssignment_1 ) ) )
            // InternalComponentDefinition.g:3746:1: ( ( rule__RequestPortLink__RequestPortAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3746:1: ( ( rule__RequestPortLink__RequestPortAssignment_1 ) )
            // InternalComponentDefinition.g:3747:2: ( rule__RequestPortLink__RequestPortAssignment_1 )
            {
             before(grammarAccess.getRequestPortLinkAccess().getRequestPortAssignment_1()); 
            // InternalComponentDefinition.g:3748:2: ( rule__RequestPortLink__RequestPortAssignment_1 )
            // InternalComponentDefinition.g:3748:3: rule__RequestPortLink__RequestPortAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequestPortLink__RequestPortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequestPortLinkAccess().getRequestPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPortLink__Group__1__Impl"


    // $ANTLR start "rule__RequestPortLink__Group__2"
    // InternalComponentDefinition.g:3756:1: rule__RequestPortLink__Group__2 : rule__RequestPortLink__Group__2__Impl ;
    public final void rule__RequestPortLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3760:1: ( rule__RequestPortLink__Group__2__Impl )
            // InternalComponentDefinition.g:3761:2: rule__RequestPortLink__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequestPortLink__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPortLink__Group__2"


    // $ANTLR start "rule__RequestPortLink__Group__2__Impl"
    // InternalComponentDefinition.g:3767:1: rule__RequestPortLink__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__RequestPortLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3771:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:3772:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:3772:1: ( ( ';' )? )
            // InternalComponentDefinition.g:3773:2: ( ';' )?
            {
             before(grammarAccess.getRequestPortLinkAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:3774:2: ( ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalComponentDefinition.g:3774:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRequestPortLinkAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPortLink__Group__2__Impl"


    // $ANTLR start "rule__OpcUaClientLink__Group__0"
    // InternalComponentDefinition.g:3783:1: rule__OpcUaClientLink__Group__0 : rule__OpcUaClientLink__Group__0__Impl rule__OpcUaClientLink__Group__1 ;
    public final void rule__OpcUaClientLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3787:1: ( rule__OpcUaClientLink__Group__0__Impl rule__OpcUaClientLink__Group__1 )
            // InternalComponentDefinition.g:3788:2: rule__OpcUaClientLink__Group__0__Impl rule__OpcUaClientLink__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__OpcUaClientLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaClientLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaClientLink__Group__0"


    // $ANTLR start "rule__OpcUaClientLink__Group__0__Impl"
    // InternalComponentDefinition.g:3795:1: rule__OpcUaClientLink__Group__0__Impl : ( 'OpcUaClientLink' ) ;
    public final void rule__OpcUaClientLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3799:1: ( ( 'OpcUaClientLink' ) )
            // InternalComponentDefinition.g:3800:1: ( 'OpcUaClientLink' )
            {
            // InternalComponentDefinition.g:3800:1: ( 'OpcUaClientLink' )
            // InternalComponentDefinition.g:3801:2: 'OpcUaClientLink'
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getOpcUaClientLinkKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getOpcUaClientLinkAccess().getOpcUaClientLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaClientLink__Group__0__Impl"


    // $ANTLR start "rule__OpcUaClientLink__Group__1"
    // InternalComponentDefinition.g:3810:1: rule__OpcUaClientLink__Group__1 : rule__OpcUaClientLink__Group__1__Impl rule__OpcUaClientLink__Group__2 ;
    public final void rule__OpcUaClientLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3814:1: ( rule__OpcUaClientLink__Group__1__Impl rule__OpcUaClientLink__Group__2 )
            // InternalComponentDefinition.g:3815:2: rule__OpcUaClientLink__Group__1__Impl rule__OpcUaClientLink__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__OpcUaClientLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaClientLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaClientLink__Group__1"


    // $ANTLR start "rule__OpcUaClientLink__Group__1__Impl"
    // InternalComponentDefinition.g:3822:1: rule__OpcUaClientLink__Group__1__Impl : ( ( rule__OpcUaClientLink__ClientAssignment_1 ) ) ;
    public final void rule__OpcUaClientLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3826:1: ( ( ( rule__OpcUaClientLink__ClientAssignment_1 ) ) )
            // InternalComponentDefinition.g:3827:1: ( ( rule__OpcUaClientLink__ClientAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3827:1: ( ( rule__OpcUaClientLink__ClientAssignment_1 ) )
            // InternalComponentDefinition.g:3828:2: ( rule__OpcUaClientLink__ClientAssignment_1 )
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getClientAssignment_1()); 
            // InternalComponentDefinition.g:3829:2: ( rule__OpcUaClientLink__ClientAssignment_1 )
            // InternalComponentDefinition.g:3829:3: rule__OpcUaClientLink__ClientAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaClientLink__ClientAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaClientLinkAccess().getClientAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaClientLink__Group__1__Impl"


    // $ANTLR start "rule__OpcUaClientLink__Group__2"
    // InternalComponentDefinition.g:3837:1: rule__OpcUaClientLink__Group__2 : rule__OpcUaClientLink__Group__2__Impl ;
    public final void rule__OpcUaClientLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3841:1: ( rule__OpcUaClientLink__Group__2__Impl )
            // InternalComponentDefinition.g:3842:2: rule__OpcUaClientLink__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaClientLink__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaClientLink__Group__2"


    // $ANTLR start "rule__OpcUaClientLink__Group__2__Impl"
    // InternalComponentDefinition.g:3848:1: rule__OpcUaClientLink__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaClientLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3852:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:3853:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:3853:1: ( ( ';' )? )
            // InternalComponentDefinition.g:3854:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:3855:2: ( ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponentDefinition.g:3855:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOpcUaClientLinkAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaClientLink__Group__2__Impl"


    // $ANTLR start "rule__MixedPortROSLink__Group__0"
    // InternalComponentDefinition.g:3864:1: rule__MixedPortROSLink__Group__0 : rule__MixedPortROSLink__Group__0__Impl rule__MixedPortROSLink__Group__1 ;
    public final void rule__MixedPortROSLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3868:1: ( rule__MixedPortROSLink__Group__0__Impl rule__MixedPortROSLink__Group__1 )
            // InternalComponentDefinition.g:3869:2: rule__MixedPortROSLink__Group__0__Impl rule__MixedPortROSLink__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MixedPortROSLink__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MixedPortROSLink__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROSLink__Group__0"


    // $ANTLR start "rule__MixedPortROSLink__Group__0__Impl"
    // InternalComponentDefinition.g:3876:1: rule__MixedPortROSLink__Group__0__Impl : ( 'MixedPortROSLink' ) ;
    public final void rule__MixedPortROSLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3880:1: ( ( 'MixedPortROSLink' ) )
            // InternalComponentDefinition.g:3881:1: ( 'MixedPortROSLink' )
            {
            // InternalComponentDefinition.g:3881:1: ( 'MixedPortROSLink' )
            // InternalComponentDefinition.g:3882:2: 'MixedPortROSLink'
            {
             before(grammarAccess.getMixedPortROSLinkAccess().getMixedPortROSLinkKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMixedPortROSLinkAccess().getMixedPortROSLinkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROSLink__Group__0__Impl"


    // $ANTLR start "rule__MixedPortROSLink__Group__1"
    // InternalComponentDefinition.g:3891:1: rule__MixedPortROSLink__Group__1 : rule__MixedPortROSLink__Group__1__Impl rule__MixedPortROSLink__Group__2 ;
    public final void rule__MixedPortROSLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3895:1: ( rule__MixedPortROSLink__Group__1__Impl rule__MixedPortROSLink__Group__2 )
            // InternalComponentDefinition.g:3896:2: rule__MixedPortROSLink__Group__1__Impl rule__MixedPortROSLink__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MixedPortROSLink__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MixedPortROSLink__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROSLink__Group__1"


    // $ANTLR start "rule__MixedPortROSLink__Group__1__Impl"
    // InternalComponentDefinition.g:3903:1: rule__MixedPortROSLink__Group__1__Impl : ( ( rule__MixedPortROSLink__MixedportrosAssignment_1 ) ) ;
    public final void rule__MixedPortROSLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3907:1: ( ( ( rule__MixedPortROSLink__MixedportrosAssignment_1 ) ) )
            // InternalComponentDefinition.g:3908:1: ( ( rule__MixedPortROSLink__MixedportrosAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3908:1: ( ( rule__MixedPortROSLink__MixedportrosAssignment_1 ) )
            // InternalComponentDefinition.g:3909:2: ( rule__MixedPortROSLink__MixedportrosAssignment_1 )
            {
             before(grammarAccess.getMixedPortROSLinkAccess().getMixedportrosAssignment_1()); 
            // InternalComponentDefinition.g:3910:2: ( rule__MixedPortROSLink__MixedportrosAssignment_1 )
            // InternalComponentDefinition.g:3910:3: rule__MixedPortROSLink__MixedportrosAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MixedPortROSLink__MixedportrosAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMixedPortROSLinkAccess().getMixedportrosAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROSLink__Group__1__Impl"


    // $ANTLR start "rule__MixedPortROSLink__Group__2"
    // InternalComponentDefinition.g:3918:1: rule__MixedPortROSLink__Group__2 : rule__MixedPortROSLink__Group__2__Impl ;
    public final void rule__MixedPortROSLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3922:1: ( rule__MixedPortROSLink__Group__2__Impl )
            // InternalComponentDefinition.g:3923:2: rule__MixedPortROSLink__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MixedPortROSLink__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROSLink__Group__2"


    // $ANTLR start "rule__MixedPortROSLink__Group__2__Impl"
    // InternalComponentDefinition.g:3929:1: rule__MixedPortROSLink__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__MixedPortROSLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3933:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:3934:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:3934:1: ( ( ';' )? )
            // InternalComponentDefinition.g:3935:2: ( ';' )?
            {
             before(grammarAccess.getMixedPortROSLinkAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:3936:2: ( ';' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalComponentDefinition.g:3936:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMixedPortROSLinkAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROSLink__Group__2__Impl"


    // $ANTLR start "rule__ComponentSubNodeObserver__Group__0"
    // InternalComponentDefinition.g:3945:1: rule__ComponentSubNodeObserver__Group__0 : rule__ComponentSubNodeObserver__Group__0__Impl rule__ComponentSubNodeObserver__Group__1 ;
    public final void rule__ComponentSubNodeObserver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3949:1: ( rule__ComponentSubNodeObserver__Group__0__Impl rule__ComponentSubNodeObserver__Group__1 )
            // InternalComponentDefinition.g:3950:2: rule__ComponentSubNodeObserver__Group__0__Impl rule__ComponentSubNodeObserver__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ComponentSubNodeObserver__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentSubNodeObserver__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSubNodeObserver__Group__0"


    // $ANTLR start "rule__ComponentSubNodeObserver__Group__0__Impl"
    // InternalComponentDefinition.g:3957:1: rule__ComponentSubNodeObserver__Group__0__Impl : ( 'Observe' ) ;
    public final void rule__ComponentSubNodeObserver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3961:1: ( ( 'Observe' ) )
            // InternalComponentDefinition.g:3962:1: ( 'Observe' )
            {
            // InternalComponentDefinition.g:3962:1: ( 'Observe' )
            // InternalComponentDefinition.g:3963:2: 'Observe'
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getObserveKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getComponentSubNodeObserverAccess().getObserveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSubNodeObserver__Group__0__Impl"


    // $ANTLR start "rule__ComponentSubNodeObserver__Group__1"
    // InternalComponentDefinition.g:3972:1: rule__ComponentSubNodeObserver__Group__1 : rule__ComponentSubNodeObserver__Group__1__Impl rule__ComponentSubNodeObserver__Group__2 ;
    public final void rule__ComponentSubNodeObserver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3976:1: ( rule__ComponentSubNodeObserver__Group__1__Impl rule__ComponentSubNodeObserver__Group__2 )
            // InternalComponentDefinition.g:3977:2: rule__ComponentSubNodeObserver__Group__1__Impl rule__ComponentSubNodeObserver__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ComponentSubNodeObserver__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentSubNodeObserver__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSubNodeObserver__Group__1"


    // $ANTLR start "rule__ComponentSubNodeObserver__Group__1__Impl"
    // InternalComponentDefinition.g:3984:1: rule__ComponentSubNodeObserver__Group__1__Impl : ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) ) ;
    public final void rule__ComponentSubNodeObserver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3988:1: ( ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) ) )
            // InternalComponentDefinition.g:3989:1: ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3989:1: ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) )
            // InternalComponentDefinition.g:3990:2: ( rule__ComponentSubNodeObserver__SubjectAssignment_1 )
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getSubjectAssignment_1()); 
            // InternalComponentDefinition.g:3991:2: ( rule__ComponentSubNodeObserver__SubjectAssignment_1 )
            // InternalComponentDefinition.g:3991:3: rule__ComponentSubNodeObserver__SubjectAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentSubNodeObserver__SubjectAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentSubNodeObserverAccess().getSubjectAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSubNodeObserver__Group__1__Impl"


    // $ANTLR start "rule__ComponentSubNodeObserver__Group__2"
    // InternalComponentDefinition.g:3999:1: rule__ComponentSubNodeObserver__Group__2 : rule__ComponentSubNodeObserver__Group__2__Impl ;
    public final void rule__ComponentSubNodeObserver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4003:1: ( rule__ComponentSubNodeObserver__Group__2__Impl )
            // InternalComponentDefinition.g:4004:2: rule__ComponentSubNodeObserver__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentSubNodeObserver__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSubNodeObserver__Group__2"


    // $ANTLR start "rule__ComponentSubNodeObserver__Group__2__Impl"
    // InternalComponentDefinition.g:4010:1: rule__ComponentSubNodeObserver__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ComponentSubNodeObserver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4014:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4015:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4015:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4016:2: ( ';' )?
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:4017:2: ( ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalComponentDefinition.g:4017:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentSubNodeObserverAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSubNodeObserver__Group__2__Impl"


    // $ANTLR start "rule__InputLinkExtension__Group__0"
    // InternalComponentDefinition.g:4026:1: rule__InputLinkExtension__Group__0 : rule__InputLinkExtension__Group__0__Impl rule__InputLinkExtension__Group__1 ;
    public final void rule__InputLinkExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4030:1: ( rule__InputLinkExtension__Group__0__Impl rule__InputLinkExtension__Group__1 )
            // InternalComponentDefinition.g:4031:2: rule__InputLinkExtension__Group__0__Impl rule__InputLinkExtension__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__InputLinkExtension__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputLinkExtension__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__0"


    // $ANTLR start "rule__InputLinkExtension__Group__0__Impl"
    // InternalComponentDefinition.g:4038:1: rule__InputLinkExtension__Group__0__Impl : ( () ) ;
    public final void rule__InputLinkExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4042:1: ( ( () ) )
            // InternalComponentDefinition.g:4043:1: ( () )
            {
            // InternalComponentDefinition.g:4043:1: ( () )
            // InternalComponentDefinition.g:4044:2: ()
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputLinkExtensionAction_0()); 
            // InternalComponentDefinition.g:4045:2: ()
            // InternalComponentDefinition.g:4045:3: 
            {
            }

             after(grammarAccess.getInputLinkExtensionAccess().getInputLinkExtensionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__0__Impl"


    // $ANTLR start "rule__InputLinkExtension__Group__1"
    // InternalComponentDefinition.g:4053:1: rule__InputLinkExtension__Group__1 : rule__InputLinkExtension__Group__1__Impl rule__InputLinkExtension__Group__2 ;
    public final void rule__InputLinkExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4057:1: ( rule__InputLinkExtension__Group__1__Impl rule__InputLinkExtension__Group__2 )
            // InternalComponentDefinition.g:4058:2: rule__InputLinkExtension__Group__1__Impl rule__InputLinkExtension__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__InputLinkExtension__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputLinkExtension__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__1"


    // $ANTLR start "rule__InputLinkExtension__Group__1__Impl"
    // InternalComponentDefinition.g:4065:1: rule__InputLinkExtension__Group__1__Impl : ( 'InputPortLink' ) ;
    public final void rule__InputLinkExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4069:1: ( ( 'InputPortLink' ) )
            // InternalComponentDefinition.g:4070:1: ( 'InputPortLink' )
            {
            // InternalComponentDefinition.g:4070:1: ( 'InputPortLink' )
            // InternalComponentDefinition.g:4071:2: 'InputPortLink'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputPortLinkKeyword_1()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getInputLinkExtensionAccess().getInputPortLinkKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__1__Impl"


    // $ANTLR start "rule__InputLinkExtension__Group__2"
    // InternalComponentDefinition.g:4080:1: rule__InputLinkExtension__Group__2 : rule__InputLinkExtension__Group__2__Impl rule__InputLinkExtension__Group__3 ;
    public final void rule__InputLinkExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4084:1: ( rule__InputLinkExtension__Group__2__Impl rule__InputLinkExtension__Group__3 )
            // InternalComponentDefinition.g:4085:2: rule__InputLinkExtension__Group__2__Impl rule__InputLinkExtension__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__InputLinkExtension__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputLinkExtension__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__2"


    // $ANTLR start "rule__InputLinkExtension__Group__2__Impl"
    // InternalComponentDefinition.g:4092:1: rule__InputLinkExtension__Group__2__Impl : ( ( rule__InputLinkExtension__InputPortAssignment_2 ) ) ;
    public final void rule__InputLinkExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4096:1: ( ( ( rule__InputLinkExtension__InputPortAssignment_2 ) ) )
            // InternalComponentDefinition.g:4097:1: ( ( rule__InputLinkExtension__InputPortAssignment_2 ) )
            {
            // InternalComponentDefinition.g:4097:1: ( ( rule__InputLinkExtension__InputPortAssignment_2 ) )
            // InternalComponentDefinition.g:4098:2: ( rule__InputLinkExtension__InputPortAssignment_2 )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputPortAssignment_2()); 
            // InternalComponentDefinition.g:4099:2: ( rule__InputLinkExtension__InputPortAssignment_2 )
            // InternalComponentDefinition.g:4099:3: rule__InputLinkExtension__InputPortAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InputLinkExtension__InputPortAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputLinkExtensionAccess().getInputPortAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__2__Impl"


    // $ANTLR start "rule__InputLinkExtension__Group__3"
    // InternalComponentDefinition.g:4107:1: rule__InputLinkExtension__Group__3 : rule__InputLinkExtension__Group__3__Impl rule__InputLinkExtension__Group__4 ;
    public final void rule__InputLinkExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4111:1: ( rule__InputLinkExtension__Group__3__Impl rule__InputLinkExtension__Group__4 )
            // InternalComponentDefinition.g:4112:2: rule__InputLinkExtension__Group__3__Impl rule__InputLinkExtension__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__InputLinkExtension__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputLinkExtension__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__3"


    // $ANTLR start "rule__InputLinkExtension__Group__3__Impl"
    // InternalComponentDefinition.g:4119:1: rule__InputLinkExtension__Group__3__Impl : ( '{' ) ;
    public final void rule__InputLinkExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4123:1: ( ( '{' ) )
            // InternalComponentDefinition.g:4124:1: ( '{' )
            {
            // InternalComponentDefinition.g:4124:1: ( '{' )
            // InternalComponentDefinition.g:4125:2: '{'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getInputLinkExtensionAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__3__Impl"


    // $ANTLR start "rule__InputLinkExtension__Group__4"
    // InternalComponentDefinition.g:4134:1: rule__InputLinkExtension__Group__4 : rule__InputLinkExtension__Group__4__Impl rule__InputLinkExtension__Group__5 ;
    public final void rule__InputLinkExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4138:1: ( rule__InputLinkExtension__Group__4__Impl rule__InputLinkExtension__Group__5 )
            // InternalComponentDefinition.g:4139:2: rule__InputLinkExtension__Group__4__Impl rule__InputLinkExtension__Group__5
            {
            pushFollow(FOLLOW_25);
            rule__InputLinkExtension__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputLinkExtension__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__4"


    // $ANTLR start "rule__InputLinkExtension__Group__4__Impl"
    // InternalComponentDefinition.g:4146:1: rule__InputLinkExtension__Group__4__Impl : ( ( rule__InputLinkExtension__UnorderedGroup_4 ) ) ;
    public final void rule__InputLinkExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4150:1: ( ( ( rule__InputLinkExtension__UnorderedGroup_4 ) ) )
            // InternalComponentDefinition.g:4151:1: ( ( rule__InputLinkExtension__UnorderedGroup_4 ) )
            {
            // InternalComponentDefinition.g:4151:1: ( ( rule__InputLinkExtension__UnorderedGroup_4 ) )
            // InternalComponentDefinition.g:4152:2: ( rule__InputLinkExtension__UnorderedGroup_4 )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4()); 
            // InternalComponentDefinition.g:4153:2: ( rule__InputLinkExtension__UnorderedGroup_4 )
            // InternalComponentDefinition.g:4153:3: rule__InputLinkExtension__UnorderedGroup_4
            {
            pushFollow(FOLLOW_2);
            rule__InputLinkExtension__UnorderedGroup_4();

            state._fsp--;


            }

             after(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__4__Impl"


    // $ANTLR start "rule__InputLinkExtension__Group__5"
    // InternalComponentDefinition.g:4161:1: rule__InputLinkExtension__Group__5 : rule__InputLinkExtension__Group__5__Impl ;
    public final void rule__InputLinkExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4165:1: ( rule__InputLinkExtension__Group__5__Impl )
            // InternalComponentDefinition.g:4166:2: rule__InputLinkExtension__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputLinkExtension__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__5"


    // $ANTLR start "rule__InputLinkExtension__Group__5__Impl"
    // InternalComponentDefinition.g:4172:1: rule__InputLinkExtension__Group__5__Impl : ( '}' ) ;
    public final void rule__InputLinkExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4176:1: ( ( '}' ) )
            // InternalComponentDefinition.g:4177:1: ( '}' )
            {
            // InternalComponentDefinition.g:4177:1: ( '}' )
            // InternalComponentDefinition.g:4178:2: '}'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getInputLinkExtensionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__Group__5__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group__0"
    // InternalComponentDefinition.g:4188:1: rule__ActivationConstraints__Group__0 : rule__ActivationConstraints__Group__0__Impl rule__ActivationConstraints__Group__1 ;
    public final void rule__ActivationConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4192:1: ( rule__ActivationConstraints__Group__0__Impl rule__ActivationConstraints__Group__1 )
            // InternalComponentDefinition.g:4193:2: rule__ActivationConstraints__Group__0__Impl rule__ActivationConstraints__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__ActivationConstraints__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__0"


    // $ANTLR start "rule__ActivationConstraints__Group__0__Impl"
    // InternalComponentDefinition.g:4200:1: rule__ActivationConstraints__Group__0__Impl : ( () ) ;
    public final void rule__ActivationConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4204:1: ( ( () ) )
            // InternalComponentDefinition.g:4205:1: ( () )
            {
            // InternalComponentDefinition.g:4205:1: ( () )
            // InternalComponentDefinition.g:4206:2: ()
            {
             before(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsAction_0()); 
            // InternalComponentDefinition.g:4207:2: ()
            // InternalComponentDefinition.g:4207:3: 
            {
            }

             after(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__0__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group__1"
    // InternalComponentDefinition.g:4215:1: rule__ActivationConstraints__Group__1 : rule__ActivationConstraints__Group__1__Impl rule__ActivationConstraints__Group__2 ;
    public final void rule__ActivationConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4219:1: ( rule__ActivationConstraints__Group__1__Impl rule__ActivationConstraints__Group__2 )
            // InternalComponentDefinition.g:4220:2: rule__ActivationConstraints__Group__1__Impl rule__ActivationConstraints__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ActivationConstraints__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__1"


    // $ANTLR start "rule__ActivationConstraints__Group__1__Impl"
    // InternalComponentDefinition.g:4227:1: rule__ActivationConstraints__Group__1__Impl : ( 'ActivationConstraints' ) ;
    public final void rule__ActivationConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4231:1: ( ( 'ActivationConstraints' ) )
            // InternalComponentDefinition.g:4232:1: ( 'ActivationConstraints' )
            {
            // InternalComponentDefinition.g:4232:1: ( 'ActivationConstraints' )
            // InternalComponentDefinition.g:4233:2: 'ActivationConstraints'
            {
             before(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__1__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group__2"
    // InternalComponentDefinition.g:4242:1: rule__ActivationConstraints__Group__2 : rule__ActivationConstraints__Group__2__Impl rule__ActivationConstraints__Group__3 ;
    public final void rule__ActivationConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4246:1: ( rule__ActivationConstraints__Group__2__Impl rule__ActivationConstraints__Group__3 )
            // InternalComponentDefinition.g:4247:2: rule__ActivationConstraints__Group__2__Impl rule__ActivationConstraints__Group__3
            {
            pushFollow(FOLLOW_27);
            rule__ActivationConstraints__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__2"


    // $ANTLR start "rule__ActivationConstraints__Group__2__Impl"
    // InternalComponentDefinition.g:4254:1: rule__ActivationConstraints__Group__2__Impl : ( '{' ) ;
    public final void rule__ActivationConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4258:1: ( ( '{' ) )
            // InternalComponentDefinition.g:4259:1: ( '{' )
            {
            // InternalComponentDefinition.g:4259:1: ( '{' )
            // InternalComponentDefinition.g:4260:2: '{'
            {
             before(grammarAccess.getActivationConstraintsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getActivationConstraintsAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__2__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group__3"
    // InternalComponentDefinition.g:4269:1: rule__ActivationConstraints__Group__3 : rule__ActivationConstraints__Group__3__Impl rule__ActivationConstraints__Group__4 ;
    public final void rule__ActivationConstraints__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4273:1: ( rule__ActivationConstraints__Group__3__Impl rule__ActivationConstraints__Group__4 )
            // InternalComponentDefinition.g:4274:2: rule__ActivationConstraints__Group__3__Impl rule__ActivationConstraints__Group__4
            {
            pushFollow(FOLLOW_28);
            rule__ActivationConstraints__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__3"


    // $ANTLR start "rule__ActivationConstraints__Group__3__Impl"
    // InternalComponentDefinition.g:4281:1: rule__ActivationConstraints__Group__3__Impl : ( 'configurable' ) ;
    public final void rule__ActivationConstraints__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4285:1: ( ( 'configurable' ) )
            // InternalComponentDefinition.g:4286:1: ( 'configurable' )
            {
            // InternalComponentDefinition.g:4286:1: ( 'configurable' )
            // InternalComponentDefinition.g:4287:2: 'configurable'
            {
             before(grammarAccess.getActivationConstraintsAccess().getConfigurableKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getActivationConstraintsAccess().getConfigurableKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__3__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group__4"
    // InternalComponentDefinition.g:4296:1: rule__ActivationConstraints__Group__4 : rule__ActivationConstraints__Group__4__Impl rule__ActivationConstraints__Group__5 ;
    public final void rule__ActivationConstraints__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4300:1: ( rule__ActivationConstraints__Group__4__Impl rule__ActivationConstraints__Group__5 )
            // InternalComponentDefinition.g:4301:2: rule__ActivationConstraints__Group__4__Impl rule__ActivationConstraints__Group__5
            {
            pushFollow(FOLLOW_29);
            rule__ActivationConstraints__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__4"


    // $ANTLR start "rule__ActivationConstraints__Group__4__Impl"
    // InternalComponentDefinition.g:4308:1: rule__ActivationConstraints__Group__4__Impl : ( '=' ) ;
    public final void rule__ActivationConstraints__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4312:1: ( ( '=' ) )
            // InternalComponentDefinition.g:4313:1: ( '=' )
            {
            // InternalComponentDefinition.g:4313:1: ( '=' )
            // InternalComponentDefinition.g:4314:2: '='
            {
             before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__4__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group__5"
    // InternalComponentDefinition.g:4323:1: rule__ActivationConstraints__Group__5 : rule__ActivationConstraints__Group__5__Impl rule__ActivationConstraints__Group__6 ;
    public final void rule__ActivationConstraints__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4327:1: ( rule__ActivationConstraints__Group__5__Impl rule__ActivationConstraints__Group__6 )
            // InternalComponentDefinition.g:4328:2: rule__ActivationConstraints__Group__5__Impl rule__ActivationConstraints__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__ActivationConstraints__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__5"


    // $ANTLR start "rule__ActivationConstraints__Group__5__Impl"
    // InternalComponentDefinition.g:4335:1: rule__ActivationConstraints__Group__5__Impl : ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) ) ;
    public final void rule__ActivationConstraints__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4339:1: ( ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) ) )
            // InternalComponentDefinition.g:4340:1: ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) )
            {
            // InternalComponentDefinition.g:4340:1: ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) )
            // InternalComponentDefinition.g:4341:2: ( rule__ActivationConstraints__ConfigurableAssignment_5 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getConfigurableAssignment_5()); 
            // InternalComponentDefinition.g:4342:2: ( rule__ActivationConstraints__ConfigurableAssignment_5 )
            // InternalComponentDefinition.g:4342:3: rule__ActivationConstraints__ConfigurableAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__ConfigurableAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getActivationConstraintsAccess().getConfigurableAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__5__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group__6"
    // InternalComponentDefinition.g:4350:1: rule__ActivationConstraints__Group__6 : rule__ActivationConstraints__Group__6__Impl rule__ActivationConstraints__Group__7 ;
    public final void rule__ActivationConstraints__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4354:1: ( rule__ActivationConstraints__Group__6__Impl rule__ActivationConstraints__Group__7 )
            // InternalComponentDefinition.g:4355:2: rule__ActivationConstraints__Group__6__Impl rule__ActivationConstraints__Group__7
            {
            pushFollow(FOLLOW_30);
            rule__ActivationConstraints__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__6"


    // $ANTLR start "rule__ActivationConstraints__Group__6__Impl"
    // InternalComponentDefinition.g:4362:1: rule__ActivationConstraints__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__ActivationConstraints__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4366:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4367:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4367:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4368:2: ( ';' )?
            {
             before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_6()); 
            // InternalComponentDefinition.g:4369:2: ( ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==16) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalComponentDefinition.g:4369:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__6__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group__7"
    // InternalComponentDefinition.g:4377:1: rule__ActivationConstraints__Group__7 : rule__ActivationConstraints__Group__7__Impl rule__ActivationConstraints__Group__8 ;
    public final void rule__ActivationConstraints__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4381:1: ( rule__ActivationConstraints__Group__7__Impl rule__ActivationConstraints__Group__8 )
            // InternalComponentDefinition.g:4382:2: rule__ActivationConstraints__Group__7__Impl rule__ActivationConstraints__Group__8
            {
            pushFollow(FOLLOW_25);
            rule__ActivationConstraints__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__7"


    // $ANTLR start "rule__ActivationConstraints__Group__7__Impl"
    // InternalComponentDefinition.g:4389:1: rule__ActivationConstraints__Group__7__Impl : ( ( rule__ActivationConstraints__UnorderedGroup_7 ) ) ;
    public final void rule__ActivationConstraints__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4393:1: ( ( ( rule__ActivationConstraints__UnorderedGroup_7 ) ) )
            // InternalComponentDefinition.g:4394:1: ( ( rule__ActivationConstraints__UnorderedGroup_7 ) )
            {
            // InternalComponentDefinition.g:4394:1: ( ( rule__ActivationConstraints__UnorderedGroup_7 ) )
            // InternalComponentDefinition.g:4395:2: ( rule__ActivationConstraints__UnorderedGroup_7 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7()); 
            // InternalComponentDefinition.g:4396:2: ( rule__ActivationConstraints__UnorderedGroup_7 )
            // InternalComponentDefinition.g:4396:3: rule__ActivationConstraints__UnorderedGroup_7
            {
            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__UnorderedGroup_7();

            state._fsp--;


            }

             after(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__7__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group__8"
    // InternalComponentDefinition.g:4404:1: rule__ActivationConstraints__Group__8 : rule__ActivationConstraints__Group__8__Impl ;
    public final void rule__ActivationConstraints__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4408:1: ( rule__ActivationConstraints__Group__8__Impl )
            // InternalComponentDefinition.g:4409:2: rule__ActivationConstraints__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__8"


    // $ANTLR start "rule__ActivationConstraints__Group__8__Impl"
    // InternalComponentDefinition.g:4415:1: rule__ActivationConstraints__Group__8__Impl : ( '}' ) ;
    public final void rule__ActivationConstraints__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4419:1: ( ( '}' ) )
            // InternalComponentDefinition.g:4420:1: ( '}' )
            {
            // InternalComponentDefinition.g:4420:1: ( '}' )
            // InternalComponentDefinition.g:4421:2: '}'
            {
             before(grammarAccess.getActivationConstraintsAccess().getRightCurlyBracketKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getActivationConstraintsAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group__8__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group_7_0__0"
    // InternalComponentDefinition.g:4431:1: rule__ActivationConstraints__Group_7_0__0 : rule__ActivationConstraints__Group_7_0__0__Impl rule__ActivationConstraints__Group_7_0__1 ;
    public final void rule__ActivationConstraints__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4435:1: ( rule__ActivationConstraints__Group_7_0__0__Impl rule__ActivationConstraints__Group_7_0__1 )
            // InternalComponentDefinition.g:4436:2: rule__ActivationConstraints__Group_7_0__0__Impl rule__ActivationConstraints__Group_7_0__1
            {
            pushFollow(FOLLOW_28);
            rule__ActivationConstraints__Group_7_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group_7_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_0__0"


    // $ANTLR start "rule__ActivationConstraints__Group_7_0__0__Impl"
    // InternalComponentDefinition.g:4443:1: rule__ActivationConstraints__Group_7_0__0__Impl : ( 'minActFreq' ) ;
    public final void rule__ActivationConstraints__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4447:1: ( ( 'minActFreq' ) )
            // InternalComponentDefinition.g:4448:1: ( 'minActFreq' )
            {
            // InternalComponentDefinition.g:4448:1: ( 'minActFreq' )
            // InternalComponentDefinition.g:4449:2: 'minActFreq'
            {
             before(grammarAccess.getActivationConstraintsAccess().getMinActFreqKeyword_7_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getActivationConstraintsAccess().getMinActFreqKeyword_7_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_0__0__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group_7_0__1"
    // InternalComponentDefinition.g:4458:1: rule__ActivationConstraints__Group_7_0__1 : rule__ActivationConstraints__Group_7_0__1__Impl rule__ActivationConstraints__Group_7_0__2 ;
    public final void rule__ActivationConstraints__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4462:1: ( rule__ActivationConstraints__Group_7_0__1__Impl rule__ActivationConstraints__Group_7_0__2 )
            // InternalComponentDefinition.g:4463:2: rule__ActivationConstraints__Group_7_0__1__Impl rule__ActivationConstraints__Group_7_0__2
            {
            pushFollow(FOLLOW_31);
            rule__ActivationConstraints__Group_7_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group_7_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_0__1"


    // $ANTLR start "rule__ActivationConstraints__Group_7_0__1__Impl"
    // InternalComponentDefinition.g:4470:1: rule__ActivationConstraints__Group_7_0__1__Impl : ( '=' ) ;
    public final void rule__ActivationConstraints__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4474:1: ( ( '=' ) )
            // InternalComponentDefinition.g:4475:1: ( '=' )
            {
            // InternalComponentDefinition.g:4475:1: ( '=' )
            // InternalComponentDefinition.g:4476:2: '='
            {
             before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_0_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_0__1__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group_7_0__2"
    // InternalComponentDefinition.g:4485:1: rule__ActivationConstraints__Group_7_0__2 : rule__ActivationConstraints__Group_7_0__2__Impl rule__ActivationConstraints__Group_7_0__3 ;
    public final void rule__ActivationConstraints__Group_7_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4489:1: ( rule__ActivationConstraints__Group_7_0__2__Impl rule__ActivationConstraints__Group_7_0__3 )
            // InternalComponentDefinition.g:4490:2: rule__ActivationConstraints__Group_7_0__2__Impl rule__ActivationConstraints__Group_7_0__3
            {
            pushFollow(FOLLOW_32);
            rule__ActivationConstraints__Group_7_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group_7_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_0__2"


    // $ANTLR start "rule__ActivationConstraints__Group_7_0__2__Impl"
    // InternalComponentDefinition.g:4497:1: rule__ActivationConstraints__Group_7_0__2__Impl : ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) ) ;
    public final void rule__ActivationConstraints__Group_7_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4501:1: ( ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) ) )
            // InternalComponentDefinition.g:4502:1: ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) )
            {
            // InternalComponentDefinition.g:4502:1: ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) )
            // InternalComponentDefinition.g:4503:2: ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getMinActFreqAssignment_7_0_2()); 
            // InternalComponentDefinition.g:4504:2: ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 )
            // InternalComponentDefinition.g:4504:3: rule__ActivationConstraints__MinActFreqAssignment_7_0_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__MinActFreqAssignment_7_0_2();

            state._fsp--;


            }

             after(grammarAccess.getActivationConstraintsAccess().getMinActFreqAssignment_7_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_0__2__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group_7_0__3"
    // InternalComponentDefinition.g:4512:1: rule__ActivationConstraints__Group_7_0__3 : rule__ActivationConstraints__Group_7_0__3__Impl rule__ActivationConstraints__Group_7_0__4 ;
    public final void rule__ActivationConstraints__Group_7_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4516:1: ( rule__ActivationConstraints__Group_7_0__3__Impl rule__ActivationConstraints__Group_7_0__4 )
            // InternalComponentDefinition.g:4517:2: rule__ActivationConstraints__Group_7_0__3__Impl rule__ActivationConstraints__Group_7_0__4
            {
            pushFollow(FOLLOW_6);
            rule__ActivationConstraints__Group_7_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group_7_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_0__3"


    // $ANTLR start "rule__ActivationConstraints__Group_7_0__3__Impl"
    // InternalComponentDefinition.g:4524:1: rule__ActivationConstraints__Group_7_0__3__Impl : ( 'Hz' ) ;
    public final void rule__ActivationConstraints__Group_7_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4528:1: ( ( 'Hz' ) )
            // InternalComponentDefinition.g:4529:1: ( 'Hz' )
            {
            // InternalComponentDefinition.g:4529:1: ( 'Hz' )
            // InternalComponentDefinition.g:4530:2: 'Hz'
            {
             before(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_0_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_0__3__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group_7_0__4"
    // InternalComponentDefinition.g:4539:1: rule__ActivationConstraints__Group_7_0__4 : rule__ActivationConstraints__Group_7_0__4__Impl ;
    public final void rule__ActivationConstraints__Group_7_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4543:1: ( rule__ActivationConstraints__Group_7_0__4__Impl )
            // InternalComponentDefinition.g:4544:2: rule__ActivationConstraints__Group_7_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group_7_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_0__4"


    // $ANTLR start "rule__ActivationConstraints__Group_7_0__4__Impl"
    // InternalComponentDefinition.g:4550:1: rule__ActivationConstraints__Group_7_0__4__Impl : ( ( ';' )? ) ;
    public final void rule__ActivationConstraints__Group_7_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4554:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4555:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4555:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4556:2: ( ';' )?
            {
             before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_0_4()); 
            // InternalComponentDefinition.g:4557:2: ( ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalComponentDefinition.g:4557:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_0__4__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group_7_1__0"
    // InternalComponentDefinition.g:4566:1: rule__ActivationConstraints__Group_7_1__0 : rule__ActivationConstraints__Group_7_1__0__Impl rule__ActivationConstraints__Group_7_1__1 ;
    public final void rule__ActivationConstraints__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4570:1: ( rule__ActivationConstraints__Group_7_1__0__Impl rule__ActivationConstraints__Group_7_1__1 )
            // InternalComponentDefinition.g:4571:2: rule__ActivationConstraints__Group_7_1__0__Impl rule__ActivationConstraints__Group_7_1__1
            {
            pushFollow(FOLLOW_28);
            rule__ActivationConstraints__Group_7_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group_7_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_1__0"


    // $ANTLR start "rule__ActivationConstraints__Group_7_1__0__Impl"
    // InternalComponentDefinition.g:4578:1: rule__ActivationConstraints__Group_7_1__0__Impl : ( 'maxActFreq' ) ;
    public final void rule__ActivationConstraints__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4582:1: ( ( 'maxActFreq' ) )
            // InternalComponentDefinition.g:4583:1: ( 'maxActFreq' )
            {
            // InternalComponentDefinition.g:4583:1: ( 'maxActFreq' )
            // InternalComponentDefinition.g:4584:2: 'maxActFreq'
            {
             before(grammarAccess.getActivationConstraintsAccess().getMaxActFreqKeyword_7_1_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getActivationConstraintsAccess().getMaxActFreqKeyword_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_1__0__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group_7_1__1"
    // InternalComponentDefinition.g:4593:1: rule__ActivationConstraints__Group_7_1__1 : rule__ActivationConstraints__Group_7_1__1__Impl rule__ActivationConstraints__Group_7_1__2 ;
    public final void rule__ActivationConstraints__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4597:1: ( rule__ActivationConstraints__Group_7_1__1__Impl rule__ActivationConstraints__Group_7_1__2 )
            // InternalComponentDefinition.g:4598:2: rule__ActivationConstraints__Group_7_1__1__Impl rule__ActivationConstraints__Group_7_1__2
            {
            pushFollow(FOLLOW_31);
            rule__ActivationConstraints__Group_7_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group_7_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_1__1"


    // $ANTLR start "rule__ActivationConstraints__Group_7_1__1__Impl"
    // InternalComponentDefinition.g:4605:1: rule__ActivationConstraints__Group_7_1__1__Impl : ( '=' ) ;
    public final void rule__ActivationConstraints__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4609:1: ( ( '=' ) )
            // InternalComponentDefinition.g:4610:1: ( '=' )
            {
            // InternalComponentDefinition.g:4610:1: ( '=' )
            // InternalComponentDefinition.g:4611:2: '='
            {
             before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_1_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_1__1__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group_7_1__2"
    // InternalComponentDefinition.g:4620:1: rule__ActivationConstraints__Group_7_1__2 : rule__ActivationConstraints__Group_7_1__2__Impl rule__ActivationConstraints__Group_7_1__3 ;
    public final void rule__ActivationConstraints__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4624:1: ( rule__ActivationConstraints__Group_7_1__2__Impl rule__ActivationConstraints__Group_7_1__3 )
            // InternalComponentDefinition.g:4625:2: rule__ActivationConstraints__Group_7_1__2__Impl rule__ActivationConstraints__Group_7_1__3
            {
            pushFollow(FOLLOW_32);
            rule__ActivationConstraints__Group_7_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group_7_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_1__2"


    // $ANTLR start "rule__ActivationConstraints__Group_7_1__2__Impl"
    // InternalComponentDefinition.g:4632:1: rule__ActivationConstraints__Group_7_1__2__Impl : ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) ) ;
    public final void rule__ActivationConstraints__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4636:1: ( ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) ) )
            // InternalComponentDefinition.g:4637:1: ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) )
            {
            // InternalComponentDefinition.g:4637:1: ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) )
            // InternalComponentDefinition.g:4638:2: ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getMaxActFreqAssignment_7_1_2()); 
            // InternalComponentDefinition.g:4639:2: ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 )
            // InternalComponentDefinition.g:4639:3: rule__ActivationConstraints__MaxActFreqAssignment_7_1_2
            {
            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__MaxActFreqAssignment_7_1_2();

            state._fsp--;


            }

             after(grammarAccess.getActivationConstraintsAccess().getMaxActFreqAssignment_7_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_1__2__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group_7_1__3"
    // InternalComponentDefinition.g:4647:1: rule__ActivationConstraints__Group_7_1__3 : rule__ActivationConstraints__Group_7_1__3__Impl rule__ActivationConstraints__Group_7_1__4 ;
    public final void rule__ActivationConstraints__Group_7_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4651:1: ( rule__ActivationConstraints__Group_7_1__3__Impl rule__ActivationConstraints__Group_7_1__4 )
            // InternalComponentDefinition.g:4652:2: rule__ActivationConstraints__Group_7_1__3__Impl rule__ActivationConstraints__Group_7_1__4
            {
            pushFollow(FOLLOW_6);
            rule__ActivationConstraints__Group_7_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group_7_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_1__3"


    // $ANTLR start "rule__ActivationConstraints__Group_7_1__3__Impl"
    // InternalComponentDefinition.g:4659:1: rule__ActivationConstraints__Group_7_1__3__Impl : ( 'Hz' ) ;
    public final void rule__ActivationConstraints__Group_7_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4663:1: ( ( 'Hz' ) )
            // InternalComponentDefinition.g:4664:1: ( 'Hz' )
            {
            // InternalComponentDefinition.g:4664:1: ( 'Hz' )
            // InternalComponentDefinition.g:4665:2: 'Hz'
            {
             before(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_1_3()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_1__3__Impl"


    // $ANTLR start "rule__ActivationConstraints__Group_7_1__4"
    // InternalComponentDefinition.g:4674:1: rule__ActivationConstraints__Group_7_1__4 : rule__ActivationConstraints__Group_7_1__4__Impl ;
    public final void rule__ActivationConstraints__Group_7_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4678:1: ( rule__ActivationConstraints__Group_7_1__4__Impl )
            // InternalComponentDefinition.g:4679:2: rule__ActivationConstraints__Group_7_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__Group_7_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_1__4"


    // $ANTLR start "rule__ActivationConstraints__Group_7_1__4__Impl"
    // InternalComponentDefinition.g:4685:1: rule__ActivationConstraints__Group_7_1__4__Impl : ( ( ';' )? ) ;
    public final void rule__ActivationConstraints__Group_7_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4689:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4690:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4690:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4691:2: ( ';' )?
            {
             before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_1_4()); 
            // InternalComponentDefinition.g:4692:2: ( ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==16) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalComponentDefinition.g:4692:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__Group_7_1__4__Impl"


    // $ANTLR start "rule__OperationModeBinding__Group__0"
    // InternalComponentDefinition.g:4701:1: rule__OperationModeBinding__Group__0 : rule__OperationModeBinding__Group__0__Impl rule__OperationModeBinding__Group__1 ;
    public final void rule__OperationModeBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4705:1: ( rule__OperationModeBinding__Group__0__Impl rule__OperationModeBinding__Group__1 )
            // InternalComponentDefinition.g:4706:2: rule__OperationModeBinding__Group__0__Impl rule__OperationModeBinding__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__OperationModeBinding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationModeBinding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationModeBinding__Group__0"


    // $ANTLR start "rule__OperationModeBinding__Group__0__Impl"
    // InternalComponentDefinition.g:4713:1: rule__OperationModeBinding__Group__0__Impl : ( 'OperationModeBinding' ) ;
    public final void rule__OperationModeBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4717:1: ( ( 'OperationModeBinding' ) )
            // InternalComponentDefinition.g:4718:1: ( 'OperationModeBinding' )
            {
            // InternalComponentDefinition.g:4718:1: ( 'OperationModeBinding' )
            // InternalComponentDefinition.g:4719:2: 'OperationModeBinding'
            {
             before(grammarAccess.getOperationModeBindingAccess().getOperationModeBindingKeyword_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOperationModeBindingAccess().getOperationModeBindingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationModeBinding__Group__0__Impl"


    // $ANTLR start "rule__OperationModeBinding__Group__1"
    // InternalComponentDefinition.g:4728:1: rule__OperationModeBinding__Group__1 : rule__OperationModeBinding__Group__1__Impl rule__OperationModeBinding__Group__2 ;
    public final void rule__OperationModeBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4732:1: ( rule__OperationModeBinding__Group__1__Impl rule__OperationModeBinding__Group__2 )
            // InternalComponentDefinition.g:4733:2: rule__OperationModeBinding__Group__1__Impl rule__OperationModeBinding__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__OperationModeBinding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OperationModeBinding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationModeBinding__Group__1"


    // $ANTLR start "rule__OperationModeBinding__Group__1__Impl"
    // InternalComponentDefinition.g:4740:1: rule__OperationModeBinding__Group__1__Impl : ( ( rule__OperationModeBinding__ModeAssignment_1 ) ) ;
    public final void rule__OperationModeBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4744:1: ( ( ( rule__OperationModeBinding__ModeAssignment_1 ) ) )
            // InternalComponentDefinition.g:4745:1: ( ( rule__OperationModeBinding__ModeAssignment_1 ) )
            {
            // InternalComponentDefinition.g:4745:1: ( ( rule__OperationModeBinding__ModeAssignment_1 ) )
            // InternalComponentDefinition.g:4746:2: ( rule__OperationModeBinding__ModeAssignment_1 )
            {
             before(grammarAccess.getOperationModeBindingAccess().getModeAssignment_1()); 
            // InternalComponentDefinition.g:4747:2: ( rule__OperationModeBinding__ModeAssignment_1 )
            // InternalComponentDefinition.g:4747:3: rule__OperationModeBinding__ModeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OperationModeBinding__ModeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationModeBindingAccess().getModeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationModeBinding__Group__1__Impl"


    // $ANTLR start "rule__OperationModeBinding__Group__2"
    // InternalComponentDefinition.g:4755:1: rule__OperationModeBinding__Group__2 : rule__OperationModeBinding__Group__2__Impl ;
    public final void rule__OperationModeBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4759:1: ( rule__OperationModeBinding__Group__2__Impl )
            // InternalComponentDefinition.g:4760:2: rule__OperationModeBinding__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OperationModeBinding__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationModeBinding__Group__2"


    // $ANTLR start "rule__OperationModeBinding__Group__2__Impl"
    // InternalComponentDefinition.g:4766:1: rule__OperationModeBinding__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__OperationModeBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4770:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4771:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4771:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4772:2: ( ';' )?
            {
             before(grammarAccess.getOperationModeBindingAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:4773:2: ( ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==16) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalComponentDefinition.g:4773:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOperationModeBindingAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationModeBinding__Group__2__Impl"


    // $ANTLR start "rule__DefaultTrigger__Group__0"
    // InternalComponentDefinition.g:4782:1: rule__DefaultTrigger__Group__0 : rule__DefaultTrigger__Group__0__Impl rule__DefaultTrigger__Group__1 ;
    public final void rule__DefaultTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4786:1: ( rule__DefaultTrigger__Group__0__Impl rule__DefaultTrigger__Group__1 )
            // InternalComponentDefinition.g:4787:2: rule__DefaultTrigger__Group__0__Impl rule__DefaultTrigger__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__DefaultTrigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultTrigger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultTrigger__Group__0"


    // $ANTLR start "rule__DefaultTrigger__Group__0__Impl"
    // InternalComponentDefinition.g:4794:1: rule__DefaultTrigger__Group__0__Impl : ( 'DefaultTrigger' ) ;
    public final void rule__DefaultTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4798:1: ( ( 'DefaultTrigger' ) )
            // InternalComponentDefinition.g:4799:1: ( 'DefaultTrigger' )
            {
            // InternalComponentDefinition.g:4799:1: ( 'DefaultTrigger' )
            // InternalComponentDefinition.g:4800:2: 'DefaultTrigger'
            {
             before(grammarAccess.getDefaultTriggerAccess().getDefaultTriggerKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getDefaultTriggerAccess().getDefaultTriggerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultTrigger__Group__0__Impl"


    // $ANTLR start "rule__DefaultTrigger__Group__1"
    // InternalComponentDefinition.g:4809:1: rule__DefaultTrigger__Group__1 : rule__DefaultTrigger__Group__1__Impl rule__DefaultTrigger__Group__2 ;
    public final void rule__DefaultTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4813:1: ( rule__DefaultTrigger__Group__1__Impl rule__DefaultTrigger__Group__2 )
            // InternalComponentDefinition.g:4814:2: rule__DefaultTrigger__Group__1__Impl rule__DefaultTrigger__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__DefaultTrigger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultTrigger__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultTrigger__Group__1"


    // $ANTLR start "rule__DefaultTrigger__Group__1__Impl"
    // InternalComponentDefinition.g:4821:1: rule__DefaultTrigger__Group__1__Impl : ( ( rule__DefaultTrigger__Alternatives_1 ) ) ;
    public final void rule__DefaultTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4825:1: ( ( ( rule__DefaultTrigger__Alternatives_1 ) ) )
            // InternalComponentDefinition.g:4826:1: ( ( rule__DefaultTrigger__Alternatives_1 ) )
            {
            // InternalComponentDefinition.g:4826:1: ( ( rule__DefaultTrigger__Alternatives_1 ) )
            // InternalComponentDefinition.g:4827:2: ( rule__DefaultTrigger__Alternatives_1 )
            {
             before(grammarAccess.getDefaultTriggerAccess().getAlternatives_1()); 
            // InternalComponentDefinition.g:4828:2: ( rule__DefaultTrigger__Alternatives_1 )
            // InternalComponentDefinition.g:4828:3: rule__DefaultTrigger__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__DefaultTrigger__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultTriggerAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultTrigger__Group__1__Impl"


    // $ANTLR start "rule__DefaultTrigger__Group__2"
    // InternalComponentDefinition.g:4836:1: rule__DefaultTrigger__Group__2 : rule__DefaultTrigger__Group__2__Impl ;
    public final void rule__DefaultTrigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4840:1: ( rule__DefaultTrigger__Group__2__Impl )
            // InternalComponentDefinition.g:4841:2: rule__DefaultTrigger__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefaultTrigger__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultTrigger__Group__2"


    // $ANTLR start "rule__DefaultTrigger__Group__2__Impl"
    // InternalComponentDefinition.g:4847:1: rule__DefaultTrigger__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__DefaultTrigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4851:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4852:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4852:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4853:2: ( ';' )?
            {
             before(grammarAccess.getDefaultTriggerAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:4854:2: ( ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalComponentDefinition.g:4854:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getDefaultTriggerAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultTrigger__Group__2__Impl"


    // $ANTLR start "rule__DefaultInputTrigger__Group__0"
    // InternalComponentDefinition.g:4863:1: rule__DefaultInputTrigger__Group__0 : rule__DefaultInputTrigger__Group__0__Impl rule__DefaultInputTrigger__Group__1 ;
    public final void rule__DefaultInputTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4867:1: ( rule__DefaultInputTrigger__Group__0__Impl rule__DefaultInputTrigger__Group__1 )
            // InternalComponentDefinition.g:4868:2: rule__DefaultInputTrigger__Group__0__Impl rule__DefaultInputTrigger__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DefaultInputTrigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultInputTrigger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__Group__0"


    // $ANTLR start "rule__DefaultInputTrigger__Group__0__Impl"
    // InternalComponentDefinition.g:4875:1: rule__DefaultInputTrigger__Group__0__Impl : ( 'InputPortTrigger' ) ;
    public final void rule__DefaultInputTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4879:1: ( ( 'InputPortTrigger' ) )
            // InternalComponentDefinition.g:4880:1: ( 'InputPortTrigger' )
            {
            // InternalComponentDefinition.g:4880:1: ( 'InputPortTrigger' )
            // InternalComponentDefinition.g:4881:2: 'InputPortTrigger'
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getInputPortTriggerKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getDefaultInputTriggerAccess().getInputPortTriggerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__Group__0__Impl"


    // $ANTLR start "rule__DefaultInputTrigger__Group__1"
    // InternalComponentDefinition.g:4890:1: rule__DefaultInputTrigger__Group__1 : rule__DefaultInputTrigger__Group__1__Impl rule__DefaultInputTrigger__Group__2 ;
    public final void rule__DefaultInputTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4894:1: ( rule__DefaultInputTrigger__Group__1__Impl rule__DefaultInputTrigger__Group__2 )
            // InternalComponentDefinition.g:4895:2: rule__DefaultInputTrigger__Group__1__Impl rule__DefaultInputTrigger__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__DefaultInputTrigger__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultInputTrigger__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__Group__1"


    // $ANTLR start "rule__DefaultInputTrigger__Group__1__Impl"
    // InternalComponentDefinition.g:4902:1: rule__DefaultInputTrigger__Group__1__Impl : ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) ) ;
    public final void rule__DefaultInputTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4906:1: ( ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) ) )
            // InternalComponentDefinition.g:4907:1: ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) )
            {
            // InternalComponentDefinition.g:4907:1: ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) )
            // InternalComponentDefinition.g:4908:2: ( rule__DefaultInputTrigger__InputLinkAssignment_1 )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getInputLinkAssignment_1()); 
            // InternalComponentDefinition.g:4909:2: ( rule__DefaultInputTrigger__InputLinkAssignment_1 )
            // InternalComponentDefinition.g:4909:3: rule__DefaultInputTrigger__InputLinkAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefaultInputTrigger__InputLinkAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultInputTriggerAccess().getInputLinkAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__Group__1__Impl"


    // $ANTLR start "rule__DefaultInputTrigger__Group__2"
    // InternalComponentDefinition.g:4917:1: rule__DefaultInputTrigger__Group__2 : rule__DefaultInputTrigger__Group__2__Impl ;
    public final void rule__DefaultInputTrigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4921:1: ( rule__DefaultInputTrigger__Group__2__Impl )
            // InternalComponentDefinition.g:4922:2: rule__DefaultInputTrigger__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefaultInputTrigger__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__Group__2"


    // $ANTLR start "rule__DefaultInputTrigger__Group__2__Impl"
    // InternalComponentDefinition.g:4928:1: rule__DefaultInputTrigger__Group__2__Impl : ( ( rule__DefaultInputTrigger__Group_2__0 )? ) ;
    public final void rule__DefaultInputTrigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4932:1: ( ( ( rule__DefaultInputTrigger__Group_2__0 )? ) )
            // InternalComponentDefinition.g:4933:1: ( ( rule__DefaultInputTrigger__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:4933:1: ( ( rule__DefaultInputTrigger__Group_2__0 )? )
            // InternalComponentDefinition.g:4934:2: ( rule__DefaultInputTrigger__Group_2__0 )?
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getGroup_2()); 
            // InternalComponentDefinition.g:4935:2: ( rule__DefaultInputTrigger__Group_2__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalComponentDefinition.g:4935:3: rule__DefaultInputTrigger__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DefaultInputTrigger__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDefaultInputTriggerAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__Group__2__Impl"


    // $ANTLR start "rule__DefaultInputTrigger__Group_2__0"
    // InternalComponentDefinition.g:4944:1: rule__DefaultInputTrigger__Group_2__0 : rule__DefaultInputTrigger__Group_2__0__Impl rule__DefaultInputTrigger__Group_2__1 ;
    public final void rule__DefaultInputTrigger__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4948:1: ( rule__DefaultInputTrigger__Group_2__0__Impl rule__DefaultInputTrigger__Group_2__1 )
            // InternalComponentDefinition.g:4949:2: rule__DefaultInputTrigger__Group_2__0__Impl rule__DefaultInputTrigger__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__DefaultInputTrigger__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultInputTrigger__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__Group_2__0"


    // $ANTLR start "rule__DefaultInputTrigger__Group_2__0__Impl"
    // InternalComponentDefinition.g:4956:1: rule__DefaultInputTrigger__Group_2__0__Impl : ( 'prescale' ) ;
    public final void rule__DefaultInputTrigger__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4960:1: ( ( 'prescale' ) )
            // InternalComponentDefinition.g:4961:1: ( 'prescale' )
            {
            // InternalComponentDefinition.g:4961:1: ( 'prescale' )
            // InternalComponentDefinition.g:4962:2: 'prescale'
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getPrescaleKeyword_2_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getDefaultInputTriggerAccess().getPrescaleKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__Group_2__0__Impl"


    // $ANTLR start "rule__DefaultInputTrigger__Group_2__1"
    // InternalComponentDefinition.g:4971:1: rule__DefaultInputTrigger__Group_2__1 : rule__DefaultInputTrigger__Group_2__1__Impl ;
    public final void rule__DefaultInputTrigger__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4975:1: ( rule__DefaultInputTrigger__Group_2__1__Impl )
            // InternalComponentDefinition.g:4976:2: rule__DefaultInputTrigger__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefaultInputTrigger__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__Group_2__1"


    // $ANTLR start "rule__DefaultInputTrigger__Group_2__1__Impl"
    // InternalComponentDefinition.g:4982:1: rule__DefaultInputTrigger__Group_2__1__Impl : ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) ) ;
    public final void rule__DefaultInputTrigger__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4986:1: ( ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:4987:1: ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:4987:1: ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) )
            // InternalComponentDefinition.g:4988:2: ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getPrescaleAssignment_2_1()); 
            // InternalComponentDefinition.g:4989:2: ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 )
            // InternalComponentDefinition.g:4989:3: rule__DefaultInputTrigger__PrescaleAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DefaultInputTrigger__PrescaleAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultInputTriggerAccess().getPrescaleAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__Group_2__1__Impl"


    // $ANTLR start "rule__DefaultPeriodicTimer__Group__0"
    // InternalComponentDefinition.g:4998:1: rule__DefaultPeriodicTimer__Group__0 : rule__DefaultPeriodicTimer__Group__0__Impl rule__DefaultPeriodicTimer__Group__1 ;
    public final void rule__DefaultPeriodicTimer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5002:1: ( rule__DefaultPeriodicTimer__Group__0__Impl rule__DefaultPeriodicTimer__Group__1 )
            // InternalComponentDefinition.g:5003:2: rule__DefaultPeriodicTimer__Group__0__Impl rule__DefaultPeriodicTimer__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__DefaultPeriodicTimer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultPeriodicTimer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultPeriodicTimer__Group__0"


    // $ANTLR start "rule__DefaultPeriodicTimer__Group__0__Impl"
    // InternalComponentDefinition.g:5010:1: rule__DefaultPeriodicTimer__Group__0__Impl : ( 'PeriodicTimer' ) ;
    public final void rule__DefaultPeriodicTimer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5014:1: ( ( 'PeriodicTimer' ) )
            // InternalComponentDefinition.g:5015:1: ( 'PeriodicTimer' )
            {
            // InternalComponentDefinition.g:5015:1: ( 'PeriodicTimer' )
            // InternalComponentDefinition.g:5016:2: 'PeriodicTimer'
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicTimerKeyword_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicTimerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultPeriodicTimer__Group__0__Impl"


    // $ANTLR start "rule__DefaultPeriodicTimer__Group__1"
    // InternalComponentDefinition.g:5025:1: rule__DefaultPeriodicTimer__Group__1 : rule__DefaultPeriodicTimer__Group__1__Impl rule__DefaultPeriodicTimer__Group__2 ;
    public final void rule__DefaultPeriodicTimer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5029:1: ( rule__DefaultPeriodicTimer__Group__1__Impl rule__DefaultPeriodicTimer__Group__2 )
            // InternalComponentDefinition.g:5030:2: rule__DefaultPeriodicTimer__Group__1__Impl rule__DefaultPeriodicTimer__Group__2
            {
            pushFollow(FOLLOW_32);
            rule__DefaultPeriodicTimer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultPeriodicTimer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultPeriodicTimer__Group__1"


    // $ANTLR start "rule__DefaultPeriodicTimer__Group__1__Impl"
    // InternalComponentDefinition.g:5037:1: rule__DefaultPeriodicTimer__Group__1__Impl : ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) ) ;
    public final void rule__DefaultPeriodicTimer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5041:1: ( ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) ) )
            // InternalComponentDefinition.g:5042:1: ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5042:1: ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) )
            // InternalComponentDefinition.g:5043:2: ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 )
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqAssignment_1()); 
            // InternalComponentDefinition.g:5044:2: ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 )
            // InternalComponentDefinition.g:5044:3: rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultPeriodicTimer__Group__1__Impl"


    // $ANTLR start "rule__DefaultPeriodicTimer__Group__2"
    // InternalComponentDefinition.g:5052:1: rule__DefaultPeriodicTimer__Group__2 : rule__DefaultPeriodicTimer__Group__2__Impl ;
    public final void rule__DefaultPeriodicTimer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5056:1: ( rule__DefaultPeriodicTimer__Group__2__Impl )
            // InternalComponentDefinition.g:5057:2: rule__DefaultPeriodicTimer__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefaultPeriodicTimer__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultPeriodicTimer__Group__2"


    // $ANTLR start "rule__DefaultPeriodicTimer__Group__2__Impl"
    // InternalComponentDefinition.g:5063:1: rule__DefaultPeriodicTimer__Group__2__Impl : ( 'Hz' ) ;
    public final void rule__DefaultPeriodicTimer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5067:1: ( ( 'Hz' ) )
            // InternalComponentDefinition.g:5068:1: ( 'Hz' )
            {
            // InternalComponentDefinition.g:5068:1: ( 'Hz' )
            // InternalComponentDefinition.g:5069:2: 'Hz'
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getHzKeyword_2()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getDefaultPeriodicTimerAccess().getHzKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultPeriodicTimer__Group__2__Impl"


    // $ANTLR start "rule__DefaultObservedElementTrigger__Group__0"
    // InternalComponentDefinition.g:5079:1: rule__DefaultObservedElementTrigger__Group__0 : rule__DefaultObservedElementTrigger__Group__0__Impl rule__DefaultObservedElementTrigger__Group__1 ;
    public final void rule__DefaultObservedElementTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5083:1: ( rule__DefaultObservedElementTrigger__Group__0__Impl rule__DefaultObservedElementTrigger__Group__1 )
            // InternalComponentDefinition.g:5084:2: rule__DefaultObservedElementTrigger__Group__0__Impl rule__DefaultObservedElementTrigger__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__DefaultObservedElementTrigger__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DefaultObservedElementTrigger__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultObservedElementTrigger__Group__0"


    // $ANTLR start "rule__DefaultObservedElementTrigger__Group__0__Impl"
    // InternalComponentDefinition.g:5091:1: rule__DefaultObservedElementTrigger__Group__0__Impl : ( 'ObservedElement' ) ;
    public final void rule__DefaultObservedElementTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5095:1: ( ( 'ObservedElement' ) )
            // InternalComponentDefinition.g:5096:1: ( 'ObservedElement' )
            {
            // InternalComponentDefinition.g:5096:1: ( 'ObservedElement' )
            // InternalComponentDefinition.g:5097:2: 'ObservedElement'
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getObservedElementKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getDefaultObservedElementTriggerAccess().getObservedElementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultObservedElementTrigger__Group__0__Impl"


    // $ANTLR start "rule__DefaultObservedElementTrigger__Group__1"
    // InternalComponentDefinition.g:5106:1: rule__DefaultObservedElementTrigger__Group__1 : rule__DefaultObservedElementTrigger__Group__1__Impl ;
    public final void rule__DefaultObservedElementTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5110:1: ( rule__DefaultObservedElementTrigger__Group__1__Impl )
            // InternalComponentDefinition.g:5111:2: rule__DefaultObservedElementTrigger__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DefaultObservedElementTrigger__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultObservedElementTrigger__Group__1"


    // $ANTLR start "rule__DefaultObservedElementTrigger__Group__1__Impl"
    // InternalComponentDefinition.g:5117:1: rule__DefaultObservedElementTrigger__Group__1__Impl : ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) ) ;
    public final void rule__DefaultObservedElementTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5121:1: ( ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) ) )
            // InternalComponentDefinition.g:5122:1: ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5122:1: ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) )
            // InternalComponentDefinition.g:5123:2: ( rule__DefaultObservedElementTrigger__ElementAssignment_1 )
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getElementAssignment_1()); 
            // InternalComponentDefinition.g:5124:2: ( rule__DefaultObservedElementTrigger__ElementAssignment_1 )
            // InternalComponentDefinition.g:5124:3: rule__DefaultObservedElementTrigger__ElementAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DefaultObservedElementTrigger__ElementAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDefaultObservedElementTriggerAccess().getElementAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultObservedElementTrigger__Group__1__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group__0"
    // InternalComponentDefinition.g:5133:1: rule__OpcUaDeviceClient__Group__0 : rule__OpcUaDeviceClient__Group__0__Impl rule__OpcUaDeviceClient__Group__1 ;
    public final void rule__OpcUaDeviceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5137:1: ( rule__OpcUaDeviceClient__Group__0__Impl rule__OpcUaDeviceClient__Group__1 )
            // InternalComponentDefinition.g:5138:2: rule__OpcUaDeviceClient__Group__0__Impl rule__OpcUaDeviceClient__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__OpcUaDeviceClient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group__0"


    // $ANTLR start "rule__OpcUaDeviceClient__Group__0__Impl"
    // InternalComponentDefinition.g:5145:1: rule__OpcUaDeviceClient__Group__0__Impl : ( 'OpcUaDeviceClient' ) ;
    public final void rule__OpcUaDeviceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5149:1: ( ( 'OpcUaDeviceClient' ) )
            // InternalComponentDefinition.g:5150:1: ( 'OpcUaDeviceClient' )
            {
            // InternalComponentDefinition.g:5150:1: ( 'OpcUaDeviceClient' )
            // InternalComponentDefinition.g:5151:2: 'OpcUaDeviceClient'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getOpcUaDeviceClientKeyword_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientAccess().getOpcUaDeviceClientKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group__0__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group__1"
    // InternalComponentDefinition.g:5160:1: rule__OpcUaDeviceClient__Group__1 : rule__OpcUaDeviceClient__Group__1__Impl rule__OpcUaDeviceClient__Group__2 ;
    public final void rule__OpcUaDeviceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5164:1: ( rule__OpcUaDeviceClient__Group__1__Impl rule__OpcUaDeviceClient__Group__2 )
            // InternalComponentDefinition.g:5165:2: rule__OpcUaDeviceClient__Group__1__Impl rule__OpcUaDeviceClient__Group__2
            {
            pushFollow(FOLLOW_36);
            rule__OpcUaDeviceClient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group__1"


    // $ANTLR start "rule__OpcUaDeviceClient__Group__1__Impl"
    // InternalComponentDefinition.g:5172:1: rule__OpcUaDeviceClient__Group__1__Impl : ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) ) ;
    public final void rule__OpcUaDeviceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5176:1: ( ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:5177:1: ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5177:1: ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) )
            // InternalComponentDefinition.g:5178:2: ( rule__OpcUaDeviceClient__NameAssignment_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:5179:2: ( rule__OpcUaDeviceClient__NameAssignment_1 )
            // InternalComponentDefinition.g:5179:3: rule__OpcUaDeviceClient__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group__1__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group__2"
    // InternalComponentDefinition.g:5187:1: rule__OpcUaDeviceClient__Group__2 : rule__OpcUaDeviceClient__Group__2__Impl rule__OpcUaDeviceClient__Group__3 ;
    public final void rule__OpcUaDeviceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5191:1: ( rule__OpcUaDeviceClient__Group__2__Impl rule__OpcUaDeviceClient__Group__3 )
            // InternalComponentDefinition.g:5192:2: rule__OpcUaDeviceClient__Group__2__Impl rule__OpcUaDeviceClient__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__OpcUaDeviceClient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group__2"


    // $ANTLR start "rule__OpcUaDeviceClient__Group__2__Impl"
    // InternalComponentDefinition.g:5199:1: rule__OpcUaDeviceClient__Group__2__Impl : ( ( rule__OpcUaDeviceClient__UnorderedGroup_2 ) ) ;
    public final void rule__OpcUaDeviceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5203:1: ( ( ( rule__OpcUaDeviceClient__UnorderedGroup_2 ) ) )
            // InternalComponentDefinition.g:5204:1: ( ( rule__OpcUaDeviceClient__UnorderedGroup_2 ) )
            {
            // InternalComponentDefinition.g:5204:1: ( ( rule__OpcUaDeviceClient__UnorderedGroup_2 ) )
            // InternalComponentDefinition.g:5205:2: ( rule__OpcUaDeviceClient__UnorderedGroup_2 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2()); 
            // InternalComponentDefinition.g:5206:2: ( rule__OpcUaDeviceClient__UnorderedGroup_2 )
            // InternalComponentDefinition.g:5206:3: rule__OpcUaDeviceClient__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group__2__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group__3"
    // InternalComponentDefinition.g:5214:1: rule__OpcUaDeviceClient__Group__3 : rule__OpcUaDeviceClient__Group__3__Impl ;
    public final void rule__OpcUaDeviceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5218:1: ( rule__OpcUaDeviceClient__Group__3__Impl )
            // InternalComponentDefinition.g:5219:2: rule__OpcUaDeviceClient__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group__3"


    // $ANTLR start "rule__OpcUaDeviceClient__Group__3__Impl"
    // InternalComponentDefinition.g:5225:1: rule__OpcUaDeviceClient__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaDeviceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5229:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:5230:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:5230:1: ( ( ';' )? )
            // InternalComponentDefinition.g:5231:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getSemicolonKeyword_3()); 
            // InternalComponentDefinition.g:5232:2: ( ';' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==16) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalComponentDefinition.g:5232:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOpcUaDeviceClientAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group__3__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_2_0__0"
    // InternalComponentDefinition.g:5241:1: rule__OpcUaDeviceClient__Group_2_0__0 : rule__OpcUaDeviceClient__Group_2_0__0__Impl rule__OpcUaDeviceClient__Group_2_0__1 ;
    public final void rule__OpcUaDeviceClient__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5245:1: ( rule__OpcUaDeviceClient__Group_2_0__0__Impl rule__OpcUaDeviceClient__Group_2_0__1 )
            // InternalComponentDefinition.g:5246:2: rule__OpcUaDeviceClient__Group_2_0__0__Impl rule__OpcUaDeviceClient__Group_2_0__1
            {
            pushFollow(FOLLOW_10);
            rule__OpcUaDeviceClient__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_2_0__0"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_2_0__0__Impl"
    // InternalComponentDefinition.g:5253:1: rule__OpcUaDeviceClient__Group_2_0__0__Impl : ( 'deviceURI' ) ;
    public final void rule__OpcUaDeviceClient__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5257:1: ( ( 'deviceURI' ) )
            // InternalComponentDefinition.g:5258:1: ( 'deviceURI' )
            {
            // InternalComponentDefinition.g:5258:1: ( 'deviceURI' )
            // InternalComponentDefinition.g:5259:2: 'deviceURI'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIKeyword_2_0_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_2_0__0__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_2_0__1"
    // InternalComponentDefinition.g:5268:1: rule__OpcUaDeviceClient__Group_2_0__1 : rule__OpcUaDeviceClient__Group_2_0__1__Impl ;
    public final void rule__OpcUaDeviceClient__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5272:1: ( rule__OpcUaDeviceClient__Group_2_0__1__Impl )
            // InternalComponentDefinition.g:5273:2: rule__OpcUaDeviceClient__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_2_0__1"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_2_0__1__Impl"
    // InternalComponentDefinition.g:5279:1: rule__OpcUaDeviceClient__Group_2_0__1__Impl : ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 ) ) ;
    public final void rule__OpcUaDeviceClient__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5283:1: ( ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 ) ) )
            // InternalComponentDefinition.g:5284:1: ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 ) )
            {
            // InternalComponentDefinition.g:5284:1: ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 ) )
            // InternalComponentDefinition.g:5285:2: ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIAssignment_2_0_1()); 
            // InternalComponentDefinition.g:5286:2: ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 )
            // InternalComponentDefinition.g:5286:3: rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_2_0__1__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_2_1__0"
    // InternalComponentDefinition.g:5295:1: rule__OpcUaDeviceClient__Group_2_1__0 : rule__OpcUaDeviceClient__Group_2_1__0__Impl rule__OpcUaDeviceClient__Group_2_1__1 ;
    public final void rule__OpcUaDeviceClient__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5299:1: ( rule__OpcUaDeviceClient__Group_2_1__0__Impl rule__OpcUaDeviceClient__Group_2_1__1 )
            // InternalComponentDefinition.g:5300:2: rule__OpcUaDeviceClient__Group_2_1__0__Impl rule__OpcUaDeviceClient__Group_2_1__1
            {
            pushFollow(FOLLOW_10);
            rule__OpcUaDeviceClient__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_2_1__0"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_2_1__0__Impl"
    // InternalComponentDefinition.g:5307:1: rule__OpcUaDeviceClient__Group_2_1__0__Impl : ( 'opcuaXmlFile' ) ;
    public final void rule__OpcUaDeviceClient__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5311:1: ( ( 'opcuaXmlFile' ) )
            // InternalComponentDefinition.g:5312:1: ( 'opcuaXmlFile' )
            {
            // InternalComponentDefinition.g:5312:1: ( 'opcuaXmlFile' )
            // InternalComponentDefinition.g:5313:2: 'opcuaXmlFile'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileKeyword_2_1_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_2_1__0__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_2_1__1"
    // InternalComponentDefinition.g:5322:1: rule__OpcUaDeviceClient__Group_2_1__1 : rule__OpcUaDeviceClient__Group_2_1__1__Impl ;
    public final void rule__OpcUaDeviceClient__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5326:1: ( rule__OpcUaDeviceClient__Group_2_1__1__Impl )
            // InternalComponentDefinition.g:5327:2: rule__OpcUaDeviceClient__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_2_1__1"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_2_1__1__Impl"
    // InternalComponentDefinition.g:5333:1: rule__OpcUaDeviceClient__Group_2_1__1__Impl : ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 ) ) ;
    public final void rule__OpcUaDeviceClient__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5337:1: ( ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 ) ) )
            // InternalComponentDefinition.g:5338:1: ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 ) )
            {
            // InternalComponentDefinition.g:5338:1: ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 ) )
            // InternalComponentDefinition.g:5339:2: ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileAssignment_2_1_1()); 
            // InternalComponentDefinition.g:5340:2: ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 )
            // InternalComponentDefinition.g:5340:3: rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_2_1__1__Impl"


    // $ANTLR start "rule__OpcUaReadServer__Group__0"
    // InternalComponentDefinition.g:5349:1: rule__OpcUaReadServer__Group__0 : rule__OpcUaReadServer__Group__0__Impl rule__OpcUaReadServer__Group__1 ;
    public final void rule__OpcUaReadServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5353:1: ( rule__OpcUaReadServer__Group__0__Impl rule__OpcUaReadServer__Group__1 )
            // InternalComponentDefinition.g:5354:2: rule__OpcUaReadServer__Group__0__Impl rule__OpcUaReadServer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__OpcUaReadServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__0"


    // $ANTLR start "rule__OpcUaReadServer__Group__0__Impl"
    // InternalComponentDefinition.g:5361:1: rule__OpcUaReadServer__Group__0__Impl : ( 'OpcUaReadServer' ) ;
    public final void rule__OpcUaReadServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5365:1: ( ( 'OpcUaReadServer' ) )
            // InternalComponentDefinition.g:5366:1: ( 'OpcUaReadServer' )
            {
            // InternalComponentDefinition.g:5366:1: ( 'OpcUaReadServer' )
            // InternalComponentDefinition.g:5367:2: 'OpcUaReadServer'
            {
             before(grammarAccess.getOpcUaReadServerAccess().getOpcUaReadServerKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getOpcUaReadServerAccess().getOpcUaReadServerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__0__Impl"


    // $ANTLR start "rule__OpcUaReadServer__Group__1"
    // InternalComponentDefinition.g:5376:1: rule__OpcUaReadServer__Group__1 : rule__OpcUaReadServer__Group__1__Impl rule__OpcUaReadServer__Group__2 ;
    public final void rule__OpcUaReadServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5380:1: ( rule__OpcUaReadServer__Group__1__Impl rule__OpcUaReadServer__Group__2 )
            // InternalComponentDefinition.g:5381:2: rule__OpcUaReadServer__Group__1__Impl rule__OpcUaReadServer__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__OpcUaReadServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__1"


    // $ANTLR start "rule__OpcUaReadServer__Group__1__Impl"
    // InternalComponentDefinition.g:5388:1: rule__OpcUaReadServer__Group__1__Impl : ( ( rule__OpcUaReadServer__NameAssignment_1 ) ) ;
    public final void rule__OpcUaReadServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5392:1: ( ( ( rule__OpcUaReadServer__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:5393:1: ( ( rule__OpcUaReadServer__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5393:1: ( ( rule__OpcUaReadServer__NameAssignment_1 ) )
            // InternalComponentDefinition.g:5394:2: ( rule__OpcUaReadServer__NameAssignment_1 )
            {
             before(grammarAccess.getOpcUaReadServerAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:5395:2: ( rule__OpcUaReadServer__NameAssignment_1 )
            // InternalComponentDefinition.g:5395:3: rule__OpcUaReadServer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaReadServerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__1__Impl"


    // $ANTLR start "rule__OpcUaReadServer__Group__2"
    // InternalComponentDefinition.g:5403:1: rule__OpcUaReadServer__Group__2 : rule__OpcUaReadServer__Group__2__Impl rule__OpcUaReadServer__Group__3 ;
    public final void rule__OpcUaReadServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5407:1: ( rule__OpcUaReadServer__Group__2__Impl rule__OpcUaReadServer__Group__3 )
            // InternalComponentDefinition.g:5408:2: rule__OpcUaReadServer__Group__2__Impl rule__OpcUaReadServer__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__OpcUaReadServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__2"


    // $ANTLR start "rule__OpcUaReadServer__Group__2__Impl"
    // InternalComponentDefinition.g:5415:1: rule__OpcUaReadServer__Group__2__Impl : ( 'dataProviderPort' ) ;
    public final void rule__OpcUaReadServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5419:1: ( ( 'dataProviderPort' ) )
            // InternalComponentDefinition.g:5420:1: ( 'dataProviderPort' )
            {
            // InternalComponentDefinition.g:5420:1: ( 'dataProviderPort' )
            // InternalComponentDefinition.g:5421:2: 'dataProviderPort'
            {
             before(grammarAccess.getOpcUaReadServerAccess().getDataProviderPortKeyword_2()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getOpcUaReadServerAccess().getDataProviderPortKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__2__Impl"


    // $ANTLR start "rule__OpcUaReadServer__Group__3"
    // InternalComponentDefinition.g:5430:1: rule__OpcUaReadServer__Group__3 : rule__OpcUaReadServer__Group__3__Impl rule__OpcUaReadServer__Group__4 ;
    public final void rule__OpcUaReadServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5434:1: ( rule__OpcUaReadServer__Group__3__Impl rule__OpcUaReadServer__Group__4 )
            // InternalComponentDefinition.g:5435:2: rule__OpcUaReadServer__Group__3__Impl rule__OpcUaReadServer__Group__4
            {
            pushFollow(FOLLOW_38);
            rule__OpcUaReadServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__3"


    // $ANTLR start "rule__OpcUaReadServer__Group__3__Impl"
    // InternalComponentDefinition.g:5442:1: rule__OpcUaReadServer__Group__3__Impl : ( ( rule__OpcUaReadServer__OutPortAssignment_3 ) ) ;
    public final void rule__OpcUaReadServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5446:1: ( ( ( rule__OpcUaReadServer__OutPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:5447:1: ( ( rule__OpcUaReadServer__OutPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:5447:1: ( ( rule__OpcUaReadServer__OutPortAssignment_3 ) )
            // InternalComponentDefinition.g:5448:2: ( rule__OpcUaReadServer__OutPortAssignment_3 )
            {
             before(grammarAccess.getOpcUaReadServerAccess().getOutPortAssignment_3()); 
            // InternalComponentDefinition.g:5449:2: ( rule__OpcUaReadServer__OutPortAssignment_3 )
            // InternalComponentDefinition.g:5449:3: rule__OpcUaReadServer__OutPortAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__OutPortAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaReadServerAccess().getOutPortAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__3__Impl"


    // $ANTLR start "rule__OpcUaReadServer__Group__4"
    // InternalComponentDefinition.g:5457:1: rule__OpcUaReadServer__Group__4 : rule__OpcUaReadServer__Group__4__Impl rule__OpcUaReadServer__Group__5 ;
    public final void rule__OpcUaReadServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5461:1: ( rule__OpcUaReadServer__Group__4__Impl rule__OpcUaReadServer__Group__5 )
            // InternalComponentDefinition.g:5462:2: rule__OpcUaReadServer__Group__4__Impl rule__OpcUaReadServer__Group__5
            {
            pushFollow(FOLLOW_38);
            rule__OpcUaReadServer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__4"


    // $ANTLR start "rule__OpcUaReadServer__Group__4__Impl"
    // InternalComponentDefinition.g:5469:1: rule__OpcUaReadServer__Group__4__Impl : ( ( rule__OpcUaReadServer__Group_4__0 )? ) ;
    public final void rule__OpcUaReadServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5473:1: ( ( ( rule__OpcUaReadServer__Group_4__0 )? ) )
            // InternalComponentDefinition.g:5474:1: ( ( rule__OpcUaReadServer__Group_4__0 )? )
            {
            // InternalComponentDefinition.g:5474:1: ( ( rule__OpcUaReadServer__Group_4__0 )? )
            // InternalComponentDefinition.g:5475:2: ( rule__OpcUaReadServer__Group_4__0 )?
            {
             before(grammarAccess.getOpcUaReadServerAccess().getGroup_4()); 
            // InternalComponentDefinition.g:5476:2: ( rule__OpcUaReadServer__Group_4__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==54) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalComponentDefinition.g:5476:3: rule__OpcUaReadServer__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaReadServer__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpcUaReadServerAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__4__Impl"


    // $ANTLR start "rule__OpcUaReadServer__Group__5"
    // InternalComponentDefinition.g:5484:1: rule__OpcUaReadServer__Group__5 : rule__OpcUaReadServer__Group__5__Impl ;
    public final void rule__OpcUaReadServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5488:1: ( rule__OpcUaReadServer__Group__5__Impl )
            // InternalComponentDefinition.g:5489:2: rule__OpcUaReadServer__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__5"


    // $ANTLR start "rule__OpcUaReadServer__Group__5__Impl"
    // InternalComponentDefinition.g:5495:1: rule__OpcUaReadServer__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaReadServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5499:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:5500:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:5500:1: ( ( ';' )? )
            // InternalComponentDefinition.g:5501:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaReadServerAccess().getSemicolonKeyword_5()); 
            // InternalComponentDefinition.g:5502:2: ( ';' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==16) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalComponentDefinition.g:5502:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOpcUaReadServerAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group__5__Impl"


    // $ANTLR start "rule__OpcUaReadServer__Group_4__0"
    // InternalComponentDefinition.g:5511:1: rule__OpcUaReadServer__Group_4__0 : rule__OpcUaReadServer__Group_4__0__Impl rule__OpcUaReadServer__Group_4__1 ;
    public final void rule__OpcUaReadServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5515:1: ( rule__OpcUaReadServer__Group_4__0__Impl rule__OpcUaReadServer__Group_4__1 )
            // InternalComponentDefinition.g:5516:2: rule__OpcUaReadServer__Group_4__0__Impl rule__OpcUaReadServer__Group_4__1
            {
            pushFollow(FOLLOW_35);
            rule__OpcUaReadServer__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group_4__0"


    // $ANTLR start "rule__OpcUaReadServer__Group_4__0__Impl"
    // InternalComponentDefinition.g:5523:1: rule__OpcUaReadServer__Group_4__0__Impl : ( 'portNumber' ) ;
    public final void rule__OpcUaReadServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5527:1: ( ( 'portNumber' ) )
            // InternalComponentDefinition.g:5528:1: ( 'portNumber' )
            {
            // InternalComponentDefinition.g:5528:1: ( 'portNumber' )
            // InternalComponentDefinition.g:5529:2: 'portNumber'
            {
             before(grammarAccess.getOpcUaReadServerAccess().getPortNumberKeyword_4_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getOpcUaReadServerAccess().getPortNumberKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group_4__0__Impl"


    // $ANTLR start "rule__OpcUaReadServer__Group_4__1"
    // InternalComponentDefinition.g:5538:1: rule__OpcUaReadServer__Group_4__1 : rule__OpcUaReadServer__Group_4__1__Impl ;
    public final void rule__OpcUaReadServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5542:1: ( rule__OpcUaReadServer__Group_4__1__Impl )
            // InternalComponentDefinition.g:5543:2: rule__OpcUaReadServer__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group_4__1"


    // $ANTLR start "rule__OpcUaReadServer__Group_4__1__Impl"
    // InternalComponentDefinition.g:5549:1: rule__OpcUaReadServer__Group_4__1__Impl : ( ( rule__OpcUaReadServer__PortNumberAssignment_4_1 ) ) ;
    public final void rule__OpcUaReadServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5553:1: ( ( ( rule__OpcUaReadServer__PortNumberAssignment_4_1 ) ) )
            // InternalComponentDefinition.g:5554:1: ( ( rule__OpcUaReadServer__PortNumberAssignment_4_1 ) )
            {
            // InternalComponentDefinition.g:5554:1: ( ( rule__OpcUaReadServer__PortNumberAssignment_4_1 ) )
            // InternalComponentDefinition.g:5555:2: ( rule__OpcUaReadServer__PortNumberAssignment_4_1 )
            {
             before(grammarAccess.getOpcUaReadServerAccess().getPortNumberAssignment_4_1()); 
            // InternalComponentDefinition.g:5556:2: ( rule__OpcUaReadServer__PortNumberAssignment_4_1 )
            // InternalComponentDefinition.g:5556:3: rule__OpcUaReadServer__PortNumberAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaReadServer__PortNumberAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaReadServerAccess().getPortNumberAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__Group_4__1__Impl"


    // $ANTLR start "rule__MixedPortROS__Group__0"
    // InternalComponentDefinition.g:5565:1: rule__MixedPortROS__Group__0 : rule__MixedPortROS__Group__0__Impl rule__MixedPortROS__Group__1 ;
    public final void rule__MixedPortROS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5569:1: ( rule__MixedPortROS__Group__0__Impl rule__MixedPortROS__Group__1 )
            // InternalComponentDefinition.g:5570:2: rule__MixedPortROS__Group__0__Impl rule__MixedPortROS__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MixedPortROS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MixedPortROS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROS__Group__0"


    // $ANTLR start "rule__MixedPortROS__Group__0__Impl"
    // InternalComponentDefinition.g:5577:1: rule__MixedPortROS__Group__0__Impl : ( 'MixedPortROS' ) ;
    public final void rule__MixedPortROS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5581:1: ( ( 'MixedPortROS' ) )
            // InternalComponentDefinition.g:5582:1: ( 'MixedPortROS' )
            {
            // InternalComponentDefinition.g:5582:1: ( 'MixedPortROS' )
            // InternalComponentDefinition.g:5583:2: 'MixedPortROS'
            {
             before(grammarAccess.getMixedPortROSAccess().getMixedPortROSKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getMixedPortROSAccess().getMixedPortROSKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROS__Group__0__Impl"


    // $ANTLR start "rule__MixedPortROS__Group__1"
    // InternalComponentDefinition.g:5592:1: rule__MixedPortROS__Group__1 : rule__MixedPortROS__Group__1__Impl rule__MixedPortROS__Group__2 ;
    public final void rule__MixedPortROS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5596:1: ( rule__MixedPortROS__Group__1__Impl rule__MixedPortROS__Group__2 )
            // InternalComponentDefinition.g:5597:2: rule__MixedPortROS__Group__1__Impl rule__MixedPortROS__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MixedPortROS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MixedPortROS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROS__Group__1"


    // $ANTLR start "rule__MixedPortROS__Group__1__Impl"
    // InternalComponentDefinition.g:5604:1: rule__MixedPortROS__Group__1__Impl : ( ( rule__MixedPortROS__PortAssignment_1 ) ) ;
    public final void rule__MixedPortROS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5608:1: ( ( ( rule__MixedPortROS__PortAssignment_1 ) ) )
            // InternalComponentDefinition.g:5609:1: ( ( rule__MixedPortROS__PortAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5609:1: ( ( rule__MixedPortROS__PortAssignment_1 ) )
            // InternalComponentDefinition.g:5610:2: ( rule__MixedPortROS__PortAssignment_1 )
            {
             before(grammarAccess.getMixedPortROSAccess().getPortAssignment_1()); 
            // InternalComponentDefinition.g:5611:2: ( rule__MixedPortROS__PortAssignment_1 )
            // InternalComponentDefinition.g:5611:3: rule__MixedPortROS__PortAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MixedPortROS__PortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMixedPortROSAccess().getPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROS__Group__1__Impl"


    // $ANTLR start "rule__MixedPortROS__Group__2"
    // InternalComponentDefinition.g:5619:1: rule__MixedPortROS__Group__2 : rule__MixedPortROS__Group__2__Impl ;
    public final void rule__MixedPortROS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5623:1: ( rule__MixedPortROS__Group__2__Impl )
            // InternalComponentDefinition.g:5624:2: rule__MixedPortROS__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MixedPortROS__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROS__Group__2"


    // $ANTLR start "rule__MixedPortROS__Group__2__Impl"
    // InternalComponentDefinition.g:5630:1: rule__MixedPortROS__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__MixedPortROS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5634:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:5635:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:5635:1: ( ( ';' )? )
            // InternalComponentDefinition.g:5636:2: ( ';' )?
            {
             before(grammarAccess.getMixedPortROSAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:5637:2: ( ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==16) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalComponentDefinition.g:5637:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMixedPortROSAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROS__Group__2__Impl"


    // $ANTLR start "rule__MixedPortYARP__Group__0"
    // InternalComponentDefinition.g:5646:1: rule__MixedPortYARP__Group__0 : rule__MixedPortYARP__Group__0__Impl rule__MixedPortYARP__Group__1 ;
    public final void rule__MixedPortYARP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5650:1: ( rule__MixedPortYARP__Group__0__Impl rule__MixedPortYARP__Group__1 )
            // InternalComponentDefinition.g:5651:2: rule__MixedPortYARP__Group__0__Impl rule__MixedPortYARP__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__MixedPortYARP__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MixedPortYARP__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortYARP__Group__0"


    // $ANTLR start "rule__MixedPortYARP__Group__0__Impl"
    // InternalComponentDefinition.g:5658:1: rule__MixedPortYARP__Group__0__Impl : ( 'MixedPortYARP' ) ;
    public final void rule__MixedPortYARP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5662:1: ( ( 'MixedPortYARP' ) )
            // InternalComponentDefinition.g:5663:1: ( 'MixedPortYARP' )
            {
            // InternalComponentDefinition.g:5663:1: ( 'MixedPortYARP' )
            // InternalComponentDefinition.g:5664:2: 'MixedPortYARP'
            {
             before(grammarAccess.getMixedPortYARPAccess().getMixedPortYARPKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getMixedPortYARPAccess().getMixedPortYARPKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortYARP__Group__0__Impl"


    // $ANTLR start "rule__MixedPortYARP__Group__1"
    // InternalComponentDefinition.g:5673:1: rule__MixedPortYARP__Group__1 : rule__MixedPortYARP__Group__1__Impl rule__MixedPortYARP__Group__2 ;
    public final void rule__MixedPortYARP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5677:1: ( rule__MixedPortYARP__Group__1__Impl rule__MixedPortYARP__Group__2 )
            // InternalComponentDefinition.g:5678:2: rule__MixedPortYARP__Group__1__Impl rule__MixedPortYARP__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MixedPortYARP__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MixedPortYARP__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortYARP__Group__1"


    // $ANTLR start "rule__MixedPortYARP__Group__1__Impl"
    // InternalComponentDefinition.g:5685:1: rule__MixedPortYARP__Group__1__Impl : ( ( rule__MixedPortYARP__PortAssignment_1 ) ) ;
    public final void rule__MixedPortYARP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5689:1: ( ( ( rule__MixedPortYARP__PortAssignment_1 ) ) )
            // InternalComponentDefinition.g:5690:1: ( ( rule__MixedPortYARP__PortAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5690:1: ( ( rule__MixedPortYARP__PortAssignment_1 ) )
            // InternalComponentDefinition.g:5691:2: ( rule__MixedPortYARP__PortAssignment_1 )
            {
             before(grammarAccess.getMixedPortYARPAccess().getPortAssignment_1()); 
            // InternalComponentDefinition.g:5692:2: ( rule__MixedPortYARP__PortAssignment_1 )
            // InternalComponentDefinition.g:5692:3: rule__MixedPortYARP__PortAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MixedPortYARP__PortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMixedPortYARPAccess().getPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortYARP__Group__1__Impl"


    // $ANTLR start "rule__MixedPortYARP__Group__2"
    // InternalComponentDefinition.g:5700:1: rule__MixedPortYARP__Group__2 : rule__MixedPortYARP__Group__2__Impl ;
    public final void rule__MixedPortYARP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5704:1: ( rule__MixedPortYARP__Group__2__Impl )
            // InternalComponentDefinition.g:5705:2: rule__MixedPortYARP__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MixedPortYARP__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortYARP__Group__2"


    // $ANTLR start "rule__MixedPortYARP__Group__2__Impl"
    // InternalComponentDefinition.g:5711:1: rule__MixedPortYARP__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__MixedPortYARP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5715:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:5716:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:5716:1: ( ( ';' )? )
            // InternalComponentDefinition.g:5717:2: ( ';' )?
            {
             before(grammarAccess.getMixedPortYARPAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:5718:2: ( ';' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==16) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalComponentDefinition.g:5718:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMixedPortYARPAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortYARP__Group__2__Impl"


    // $ANTLR start "rule__CoordinationSlavePort__Group__0"
    // InternalComponentDefinition.g:5727:1: rule__CoordinationSlavePort__Group__0 : rule__CoordinationSlavePort__Group__0__Impl rule__CoordinationSlavePort__Group__1 ;
    public final void rule__CoordinationSlavePort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5731:1: ( rule__CoordinationSlavePort__Group__0__Impl rule__CoordinationSlavePort__Group__1 )
            // InternalComponentDefinition.g:5732:2: rule__CoordinationSlavePort__Group__0__Impl rule__CoordinationSlavePort__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CoordinationSlavePort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__0"


    // $ANTLR start "rule__CoordinationSlavePort__Group__0__Impl"
    // InternalComponentDefinition.g:5739:1: rule__CoordinationSlavePort__Group__0__Impl : ( 'CoordinationSlavePort' ) ;
    public final void rule__CoordinationSlavePort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5743:1: ( ( 'CoordinationSlavePort' ) )
            // InternalComponentDefinition.g:5744:1: ( 'CoordinationSlavePort' )
            {
            // InternalComponentDefinition.g:5744:1: ( 'CoordinationSlavePort' )
            // InternalComponentDefinition.g:5745:2: 'CoordinationSlavePort'
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getCoordinationSlavePortKeyword_0()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortAccess().getCoordinationSlavePortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__0__Impl"


    // $ANTLR start "rule__CoordinationSlavePort__Group__1"
    // InternalComponentDefinition.g:5754:1: rule__CoordinationSlavePort__Group__1 : rule__CoordinationSlavePort__Group__1__Impl rule__CoordinationSlavePort__Group__2 ;
    public final void rule__CoordinationSlavePort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5758:1: ( rule__CoordinationSlavePort__Group__1__Impl rule__CoordinationSlavePort__Group__2 )
            // InternalComponentDefinition.g:5759:2: rule__CoordinationSlavePort__Group__1__Impl rule__CoordinationSlavePort__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__CoordinationSlavePort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__1"


    // $ANTLR start "rule__CoordinationSlavePort__Group__1__Impl"
    // InternalComponentDefinition.g:5766:1: rule__CoordinationSlavePort__Group__1__Impl : ( ( rule__CoordinationSlavePort__NameAssignment_1 ) ) ;
    public final void rule__CoordinationSlavePort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5770:1: ( ( ( rule__CoordinationSlavePort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:5771:1: ( ( rule__CoordinationSlavePort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5771:1: ( ( rule__CoordinationSlavePort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:5772:2: ( rule__CoordinationSlavePort__NameAssignment_1 )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:5773:2: ( rule__CoordinationSlavePort__NameAssignment_1 )
            // InternalComponentDefinition.g:5773:3: rule__CoordinationSlavePort__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__1__Impl"


    // $ANTLR start "rule__CoordinationSlavePort__Group__2"
    // InternalComponentDefinition.g:5781:1: rule__CoordinationSlavePort__Group__2 : rule__CoordinationSlavePort__Group__2__Impl rule__CoordinationSlavePort__Group__3 ;
    public final void rule__CoordinationSlavePort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5785:1: ( rule__CoordinationSlavePort__Group__2__Impl rule__CoordinationSlavePort__Group__3 )
            // InternalComponentDefinition.g:5786:2: rule__CoordinationSlavePort__Group__2__Impl rule__CoordinationSlavePort__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CoordinationSlavePort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__2"


    // $ANTLR start "rule__CoordinationSlavePort__Group__2__Impl"
    // InternalComponentDefinition.g:5793:1: rule__CoordinationSlavePort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__CoordinationSlavePort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5797:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:5798:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:5798:1: ( 'implements' )
            // InternalComponentDefinition.g:5799:2: 'implements'
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getImplementsKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortAccess().getImplementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__2__Impl"


    // $ANTLR start "rule__CoordinationSlavePort__Group__3"
    // InternalComponentDefinition.g:5808:1: rule__CoordinationSlavePort__Group__3 : rule__CoordinationSlavePort__Group__3__Impl rule__CoordinationSlavePort__Group__4 ;
    public final void rule__CoordinationSlavePort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5812:1: ( rule__CoordinationSlavePort__Group__3__Impl rule__CoordinationSlavePort__Group__4 )
            // InternalComponentDefinition.g:5813:2: rule__CoordinationSlavePort__Group__3__Impl rule__CoordinationSlavePort__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__CoordinationSlavePort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__3"


    // $ANTLR start "rule__CoordinationSlavePort__Group__3__Impl"
    // InternalComponentDefinition.g:5820:1: rule__CoordinationSlavePort__Group__3__Impl : ( ( rule__CoordinationSlavePort__ServiceAssignment_3 ) ) ;
    public final void rule__CoordinationSlavePort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5824:1: ( ( ( rule__CoordinationSlavePort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:5825:1: ( ( rule__CoordinationSlavePort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:5825:1: ( ( rule__CoordinationSlavePort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:5826:2: ( rule__CoordinationSlavePort__ServiceAssignment_3 )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:5827:2: ( rule__CoordinationSlavePort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:5827:3: rule__CoordinationSlavePort__ServiceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__ServiceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortAccess().getServiceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__3__Impl"


    // $ANTLR start "rule__CoordinationSlavePort__Group__4"
    // InternalComponentDefinition.g:5835:1: rule__CoordinationSlavePort__Group__4 : rule__CoordinationSlavePort__Group__4__Impl rule__CoordinationSlavePort__Group__5 ;
    public final void rule__CoordinationSlavePort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5839:1: ( rule__CoordinationSlavePort__Group__4__Impl rule__CoordinationSlavePort__Group__5 )
            // InternalComponentDefinition.g:5840:2: rule__CoordinationSlavePort__Group__4__Impl rule__CoordinationSlavePort__Group__5
            {
            pushFollow(FOLLOW_39);
            rule__CoordinationSlavePort__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__4"


    // $ANTLR start "rule__CoordinationSlavePort__Group__4__Impl"
    // InternalComponentDefinition.g:5847:1: rule__CoordinationSlavePort__Group__4__Impl : ( '{' ) ;
    public final void rule__CoordinationSlavePort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5851:1: ( ( '{' ) )
            // InternalComponentDefinition.g:5852:1: ( '{' )
            {
            // InternalComponentDefinition.g:5852:1: ( '{' )
            // InternalComponentDefinition.g:5853:2: '{'
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__4__Impl"


    // $ANTLR start "rule__CoordinationSlavePort__Group__5"
    // InternalComponentDefinition.g:5862:1: rule__CoordinationSlavePort__Group__5 : rule__CoordinationSlavePort__Group__5__Impl rule__CoordinationSlavePort__Group__6 ;
    public final void rule__CoordinationSlavePort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5866:1: ( rule__CoordinationSlavePort__Group__5__Impl rule__CoordinationSlavePort__Group__6 )
            // InternalComponentDefinition.g:5867:2: rule__CoordinationSlavePort__Group__5__Impl rule__CoordinationSlavePort__Group__6
            {
            pushFollow(FOLLOW_39);
            rule__CoordinationSlavePort__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__5"


    // $ANTLR start "rule__CoordinationSlavePort__Group__5__Impl"
    // InternalComponentDefinition.g:5874:1: rule__CoordinationSlavePort__Group__5__Impl : ( ( rule__CoordinationSlavePort__ElementsAssignment_5 )* ) ;
    public final void rule__CoordinationSlavePort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5878:1: ( ( ( rule__CoordinationSlavePort__ElementsAssignment_5 )* ) )
            // InternalComponentDefinition.g:5879:1: ( ( rule__CoordinationSlavePort__ElementsAssignment_5 )* )
            {
            // InternalComponentDefinition.g:5879:1: ( ( rule__CoordinationSlavePort__ElementsAssignment_5 )* )
            // InternalComponentDefinition.g:5880:2: ( rule__CoordinationSlavePort__ElementsAssignment_5 )*
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getElementsAssignment_5()); 
            // InternalComponentDefinition.g:5881:2: ( rule__CoordinationSlavePort__ElementsAssignment_5 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( ((LA46_0>=58 && LA46_0<=60)||LA46_0==65||LA46_0==77) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalComponentDefinition.g:5881:3: rule__CoordinationSlavePort__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_40);
            	    rule__CoordinationSlavePort__ElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

             after(grammarAccess.getCoordinationSlavePortAccess().getElementsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__5__Impl"


    // $ANTLR start "rule__CoordinationSlavePort__Group__6"
    // InternalComponentDefinition.g:5889:1: rule__CoordinationSlavePort__Group__6 : rule__CoordinationSlavePort__Group__6__Impl ;
    public final void rule__CoordinationSlavePort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5893:1: ( rule__CoordinationSlavePort__Group__6__Impl )
            // InternalComponentDefinition.g:5894:2: rule__CoordinationSlavePort__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__6"


    // $ANTLR start "rule__CoordinationSlavePort__Group__6__Impl"
    // InternalComponentDefinition.g:5900:1: rule__CoordinationSlavePort__Group__6__Impl : ( '}' ) ;
    public final void rule__CoordinationSlavePort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5904:1: ( ( '}' ) )
            // InternalComponentDefinition.g:5905:1: ( '}' )
            {
            // InternalComponentDefinition.g:5905:1: ( '}' )
            // InternalComponentDefinition.g:5906:2: '}'
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__6__Impl"


    // $ANTLR start "rule__SkillRealizationsRef__Group__0"
    // InternalComponentDefinition.g:5916:1: rule__SkillRealizationsRef__Group__0 : rule__SkillRealizationsRef__Group__0__Impl rule__SkillRealizationsRef__Group__1 ;
    public final void rule__SkillRealizationsRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5920:1: ( rule__SkillRealizationsRef__Group__0__Impl rule__SkillRealizationsRef__Group__1 )
            // InternalComponentDefinition.g:5921:2: rule__SkillRealizationsRef__Group__0__Impl rule__SkillRealizationsRef__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__SkillRealizationsRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealizationsRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealizationsRef__Group__0"


    // $ANTLR start "rule__SkillRealizationsRef__Group__0__Impl"
    // InternalComponentDefinition.g:5928:1: rule__SkillRealizationsRef__Group__0__Impl : ( 'SkillRealizationsRef' ) ;
    public final void rule__SkillRealizationsRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5932:1: ( ( 'SkillRealizationsRef' ) )
            // InternalComponentDefinition.g:5933:1: ( 'SkillRealizationsRef' )
            {
            // InternalComponentDefinition.g:5933:1: ( 'SkillRealizationsRef' )
            // InternalComponentDefinition.g:5934:2: 'SkillRealizationsRef'
            {
             before(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationsRefKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationsRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealizationsRef__Group__0__Impl"


    // $ANTLR start "rule__SkillRealizationsRef__Group__1"
    // InternalComponentDefinition.g:5943:1: rule__SkillRealizationsRef__Group__1 : rule__SkillRealizationsRef__Group__1__Impl rule__SkillRealizationsRef__Group__2 ;
    public final void rule__SkillRealizationsRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5947:1: ( rule__SkillRealizationsRef__Group__1__Impl rule__SkillRealizationsRef__Group__2 )
            // InternalComponentDefinition.g:5948:2: rule__SkillRealizationsRef__Group__1__Impl rule__SkillRealizationsRef__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__SkillRealizationsRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SkillRealizationsRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealizationsRef__Group__1"


    // $ANTLR start "rule__SkillRealizationsRef__Group__1__Impl"
    // InternalComponentDefinition.g:5955:1: rule__SkillRealizationsRef__Group__1__Impl : ( ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 ) ) ;
    public final void rule__SkillRealizationsRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5959:1: ( ( ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 ) ) )
            // InternalComponentDefinition.g:5960:1: ( ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5960:1: ( ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 ) )
            // InternalComponentDefinition.g:5961:2: ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 )
            {
             before(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefAssignment_1()); 
            // InternalComponentDefinition.g:5962:2: ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 )
            // InternalComponentDefinition.g:5962:3: rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealizationsRef__Group__1__Impl"


    // $ANTLR start "rule__SkillRealizationsRef__Group__2"
    // InternalComponentDefinition.g:5970:1: rule__SkillRealizationsRef__Group__2 : rule__SkillRealizationsRef__Group__2__Impl ;
    public final void rule__SkillRealizationsRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5974:1: ( rule__SkillRealizationsRef__Group__2__Impl )
            // InternalComponentDefinition.g:5975:2: rule__SkillRealizationsRef__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SkillRealizationsRef__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealizationsRef__Group__2"


    // $ANTLR start "rule__SkillRealizationsRef__Group__2__Impl"
    // InternalComponentDefinition.g:5981:1: rule__SkillRealizationsRef__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__SkillRealizationsRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5985:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:5986:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:5986:1: ( ( ';' )? )
            // InternalComponentDefinition.g:5987:2: ( ';' )?
            {
             before(grammarAccess.getSkillRealizationsRefAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:5988:2: ( ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==16) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalComponentDefinition.g:5988:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getSkillRealizationsRefAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealizationsRef__Group__2__Impl"


    // $ANTLR start "rule__CommunicationServiceUsageRealization__Group__0"
    // InternalComponentDefinition.g:5997:1: rule__CommunicationServiceUsageRealization__Group__0 : rule__CommunicationServiceUsageRealization__Group__0__Impl rule__CommunicationServiceUsageRealization__Group__1 ;
    public final void rule__CommunicationServiceUsageRealization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6001:1: ( rule__CommunicationServiceUsageRealization__Group__0__Impl rule__CommunicationServiceUsageRealization__Group__1 )
            // InternalComponentDefinition.g:6002:2: rule__CommunicationServiceUsageRealization__Group__0__Impl rule__CommunicationServiceUsageRealization__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CommunicationServiceUsageRealization__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsageRealization__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsageRealization__Group__0"


    // $ANTLR start "rule__CommunicationServiceUsageRealization__Group__0__Impl"
    // InternalComponentDefinition.g:6009:1: rule__CommunicationServiceUsageRealization__Group__0__Impl : ( 'with' ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6013:1: ( ( 'with' ) )
            // InternalComponentDefinition.g:6014:1: ( 'with' )
            {
            // InternalComponentDefinition.g:6014:1: ( 'with' )
            // InternalComponentDefinition.g:6015:2: 'with'
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getWithKeyword_0()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getWithKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsageRealization__Group__0__Impl"


    // $ANTLR start "rule__CommunicationServiceUsageRealization__Group__1"
    // InternalComponentDefinition.g:6024:1: rule__CommunicationServiceUsageRealization__Group__1 : rule__CommunicationServiceUsageRealization__Group__1__Impl rule__CommunicationServiceUsageRealization__Group__2 ;
    public final void rule__CommunicationServiceUsageRealization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6028:1: ( rule__CommunicationServiceUsageRealization__Group__1__Impl rule__CommunicationServiceUsageRealization__Group__2 )
            // InternalComponentDefinition.g:6029:2: rule__CommunicationServiceUsageRealization__Group__1__Impl rule__CommunicationServiceUsageRealization__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__CommunicationServiceUsageRealization__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsageRealization__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsageRealization__Group__1"


    // $ANTLR start "rule__CommunicationServiceUsageRealization__Group__1__Impl"
    // InternalComponentDefinition.g:6036:1: rule__CommunicationServiceUsageRealization__Group__1__Impl : ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6040:1: ( ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) ) )
            // InternalComponentDefinition.g:6041:1: ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) )
            {
            // InternalComponentDefinition.g:6041:1: ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) )
            // InternalComponentDefinition.g:6042:2: ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageAssignment_1()); 
            // InternalComponentDefinition.g:6043:2: ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 )
            // InternalComponentDefinition.g:6043:3: rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsageRealization__Group__1__Impl"


    // $ANTLR start "rule__CommunicationServiceUsageRealization__Group__2"
    // InternalComponentDefinition.g:6051:1: rule__CommunicationServiceUsageRealization__Group__2 : rule__CommunicationServiceUsageRealization__Group__2__Impl rule__CommunicationServiceUsageRealization__Group__3 ;
    public final void rule__CommunicationServiceUsageRealization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6055:1: ( rule__CommunicationServiceUsageRealization__Group__2__Impl rule__CommunicationServiceUsageRealization__Group__3 )
            // InternalComponentDefinition.g:6056:2: rule__CommunicationServiceUsageRealization__Group__2__Impl rule__CommunicationServiceUsageRealization__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CommunicationServiceUsageRealization__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsageRealization__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsageRealization__Group__2"


    // $ANTLR start "rule__CommunicationServiceUsageRealization__Group__2__Impl"
    // InternalComponentDefinition.g:6063:1: rule__CommunicationServiceUsageRealization__Group__2__Impl : ( 'realizedBy' ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6067:1: ( ( 'realizedBy' ) )
            // InternalComponentDefinition.g:6068:1: ( 'realizedBy' )
            {
            // InternalComponentDefinition.g:6068:1: ( 'realizedBy' )
            // InternalComponentDefinition.g:6069:2: 'realizedBy'
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getRealizedByKeyword_2()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getRealizedByKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsageRealization__Group__2__Impl"


    // $ANTLR start "rule__CommunicationServiceUsageRealization__Group__3"
    // InternalComponentDefinition.g:6078:1: rule__CommunicationServiceUsageRealization__Group__3 : rule__CommunicationServiceUsageRealization__Group__3__Impl ;
    public final void rule__CommunicationServiceUsageRealization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6082:1: ( rule__CommunicationServiceUsageRealization__Group__3__Impl )
            // InternalComponentDefinition.g:6083:2: rule__CommunicationServiceUsageRealization__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsageRealization__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsageRealization__Group__3"


    // $ANTLR start "rule__CommunicationServiceUsageRealization__Group__3__Impl"
    // InternalComponentDefinition.g:6089:1: rule__CommunicationServiceUsageRealization__Group__3__Impl : ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6093:1: ( ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:6094:1: ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:6094:1: ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) )
            // InternalComponentDefinition.g:6095:2: ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortAssignment_3()); 
            // InternalComponentDefinition.g:6096:2: ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 )
            // InternalComponentDefinition.g:6096:3: rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsageRealization__Group__3__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group__0"
    // InternalComponentDefinition.g:6105:1: rule__PublicOperationMode__Group__0 : rule__PublicOperationMode__Group__0__Impl rule__PublicOperationMode__Group__1 ;
    public final void rule__PublicOperationMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6109:1: ( rule__PublicOperationMode__Group__0__Impl rule__PublicOperationMode__Group__1 )
            // InternalComponentDefinition.g:6110:2: rule__PublicOperationMode__Group__0__Impl rule__PublicOperationMode__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__PublicOperationMode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__0"


    // $ANTLR start "rule__PublicOperationMode__Group__0__Impl"
    // InternalComponentDefinition.g:6117:1: rule__PublicOperationMode__Group__0__Impl : ( () ) ;
    public final void rule__PublicOperationMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6121:1: ( ( () ) )
            // InternalComponentDefinition.g:6122:1: ( () )
            {
            // InternalComponentDefinition.g:6122:1: ( () )
            // InternalComponentDefinition.g:6123:2: ()
            {
             before(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeAction_0()); 
            // InternalComponentDefinition.g:6124:2: ()
            // InternalComponentDefinition.g:6124:3: 
            {
            }

             after(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__0__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group__1"
    // InternalComponentDefinition.g:6132:1: rule__PublicOperationMode__Group__1 : rule__PublicOperationMode__Group__1__Impl rule__PublicOperationMode__Group__2 ;
    public final void rule__PublicOperationMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6136:1: ( rule__PublicOperationMode__Group__1__Impl rule__PublicOperationMode__Group__2 )
            // InternalComponentDefinition.g:6137:2: rule__PublicOperationMode__Group__1__Impl rule__PublicOperationMode__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__PublicOperationMode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__1"


    // $ANTLR start "rule__PublicOperationMode__Group__1__Impl"
    // InternalComponentDefinition.g:6144:1: rule__PublicOperationMode__Group__1__Impl : ( ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )? ) ;
    public final void rule__PublicOperationMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6148:1: ( ( ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )? ) )
            // InternalComponentDefinition.g:6149:1: ( ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )? )
            {
            // InternalComponentDefinition.g:6149:1: ( ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )? )
            // InternalComponentDefinition.g:6150:2: ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )?
            {
             before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitAssignment_1()); 
            // InternalComponentDefinition.g:6151:2: ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==77) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalComponentDefinition.g:6151:3: rule__PublicOperationMode__IsDefaultInitAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PublicOperationMode__IsDefaultInitAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__1__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group__2"
    // InternalComponentDefinition.g:6159:1: rule__PublicOperationMode__Group__2 : rule__PublicOperationMode__Group__2__Impl rule__PublicOperationMode__Group__3 ;
    public final void rule__PublicOperationMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6163:1: ( rule__PublicOperationMode__Group__2__Impl rule__PublicOperationMode__Group__3 )
            // InternalComponentDefinition.g:6164:2: rule__PublicOperationMode__Group__2__Impl rule__PublicOperationMode__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PublicOperationMode__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__2"


    // $ANTLR start "rule__PublicOperationMode__Group__2__Impl"
    // InternalComponentDefinition.g:6171:1: rule__PublicOperationMode__Group__2__Impl : ( 'PublicOperationMode' ) ;
    public final void rule__PublicOperationMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6175:1: ( ( 'PublicOperationMode' ) )
            // InternalComponentDefinition.g:6176:1: ( 'PublicOperationMode' )
            {
            // InternalComponentDefinition.g:6176:1: ( 'PublicOperationMode' )
            // InternalComponentDefinition.g:6177:2: 'PublicOperationMode'
            {
             before(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeKeyword_2()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__2__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group__3"
    // InternalComponentDefinition.g:6186:1: rule__PublicOperationMode__Group__3 : rule__PublicOperationMode__Group__3__Impl rule__PublicOperationMode__Group__4 ;
    public final void rule__PublicOperationMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6190:1: ( rule__PublicOperationMode__Group__3__Impl rule__PublicOperationMode__Group__4 )
            // InternalComponentDefinition.g:6191:2: rule__PublicOperationMode__Group__3__Impl rule__PublicOperationMode__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__PublicOperationMode__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__3"


    // $ANTLR start "rule__PublicOperationMode__Group__3__Impl"
    // InternalComponentDefinition.g:6198:1: rule__PublicOperationMode__Group__3__Impl : ( ( rule__PublicOperationMode__ModeAssignment_3 ) ) ;
    public final void rule__PublicOperationMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6202:1: ( ( ( rule__PublicOperationMode__ModeAssignment_3 ) ) )
            // InternalComponentDefinition.g:6203:1: ( ( rule__PublicOperationMode__ModeAssignment_3 ) )
            {
            // InternalComponentDefinition.g:6203:1: ( ( rule__PublicOperationMode__ModeAssignment_3 ) )
            // InternalComponentDefinition.g:6204:2: ( rule__PublicOperationMode__ModeAssignment_3 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getModeAssignment_3()); 
            // InternalComponentDefinition.g:6205:2: ( rule__PublicOperationMode__ModeAssignment_3 )
            // InternalComponentDefinition.g:6205:3: rule__PublicOperationMode__ModeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__ModeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPublicOperationModeAccess().getModeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__3__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group__4"
    // InternalComponentDefinition.g:6213:1: rule__PublicOperationMode__Group__4 : rule__PublicOperationMode__Group__4__Impl rule__PublicOperationMode__Group__5 ;
    public final void rule__PublicOperationMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6217:1: ( rule__PublicOperationMode__Group__4__Impl rule__PublicOperationMode__Group__5 )
            // InternalComponentDefinition.g:6218:2: rule__PublicOperationMode__Group__4__Impl rule__PublicOperationMode__Group__5
            {
            pushFollow(FOLLOW_42);
            rule__PublicOperationMode__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__4"


    // $ANTLR start "rule__PublicOperationMode__Group__4__Impl"
    // InternalComponentDefinition.g:6225:1: rule__PublicOperationMode__Group__4__Impl : ( '{' ) ;
    public final void rule__PublicOperationMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6229:1: ( ( '{' ) )
            // InternalComponentDefinition.g:6230:1: ( '{' )
            {
            // InternalComponentDefinition.g:6230:1: ( '{' )
            // InternalComponentDefinition.g:6231:2: '{'
            {
             before(grammarAccess.getPublicOperationModeAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__4__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group__5"
    // InternalComponentDefinition.g:6240:1: rule__PublicOperationMode__Group__5 : rule__PublicOperationMode__Group__5__Impl rule__PublicOperationMode__Group__6 ;
    public final void rule__PublicOperationMode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6244:1: ( rule__PublicOperationMode__Group__5__Impl rule__PublicOperationMode__Group__6 )
            // InternalComponentDefinition.g:6245:2: rule__PublicOperationMode__Group__5__Impl rule__PublicOperationMode__Group__6
            {
            pushFollow(FOLLOW_42);
            rule__PublicOperationMode__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__5"


    // $ANTLR start "rule__PublicOperationMode__Group__5__Impl"
    // InternalComponentDefinition.g:6252:1: rule__PublicOperationMode__Group__5__Impl : ( ( rule__PublicOperationMode__Group_5__0 )? ) ;
    public final void rule__PublicOperationMode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6256:1: ( ( ( rule__PublicOperationMode__Group_5__0 )? ) )
            // InternalComponentDefinition.g:6257:1: ( ( rule__PublicOperationMode__Group_5__0 )? )
            {
            // InternalComponentDefinition.g:6257:1: ( ( rule__PublicOperationMode__Group_5__0 )? )
            // InternalComponentDefinition.g:6258:2: ( rule__PublicOperationMode__Group_5__0 )?
            {
             before(grammarAccess.getPublicOperationModeAccess().getGroup_5()); 
            // InternalComponentDefinition.g:6259:2: ( rule__PublicOperationMode__Group_5__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==61) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalComponentDefinition.g:6259:3: rule__PublicOperationMode__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PublicOperationMode__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublicOperationModeAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__5__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group__6"
    // InternalComponentDefinition.g:6267:1: rule__PublicOperationMode__Group__6 : rule__PublicOperationMode__Group__6__Impl ;
    public final void rule__PublicOperationMode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6271:1: ( rule__PublicOperationMode__Group__6__Impl )
            // InternalComponentDefinition.g:6272:2: rule__PublicOperationMode__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__6"


    // $ANTLR start "rule__PublicOperationMode__Group__6__Impl"
    // InternalComponentDefinition.g:6278:1: rule__PublicOperationMode__Group__6__Impl : ( '}' ) ;
    public final void rule__PublicOperationMode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6282:1: ( ( '}' ) )
            // InternalComponentDefinition.g:6283:1: ( '}' )
            {
            // InternalComponentDefinition.g:6283:1: ( '}' )
            // InternalComponentDefinition.g:6284:2: '}'
            {
             before(grammarAccess.getPublicOperationModeAccess().getRightCurlyBracketKeyword_6()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__6__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_5__0"
    // InternalComponentDefinition.g:6294:1: rule__PublicOperationMode__Group_5__0 : rule__PublicOperationMode__Group_5__0__Impl rule__PublicOperationMode__Group_5__1 ;
    public final void rule__PublicOperationMode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6298:1: ( rule__PublicOperationMode__Group_5__0__Impl rule__PublicOperationMode__Group_5__1 )
            // InternalComponentDefinition.g:6299:2: rule__PublicOperationMode__Group_5__0__Impl rule__PublicOperationMode__Group_5__1
            {
            pushFollow(FOLLOW_43);
            rule__PublicOperationMode__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5__0"


    // $ANTLR start "rule__PublicOperationMode__Group_5__0__Impl"
    // InternalComponentDefinition.g:6306:1: rule__PublicOperationMode__Group_5__0__Impl : ( 'activates' ) ;
    public final void rule__PublicOperationMode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6310:1: ( ( 'activates' ) )
            // InternalComponentDefinition.g:6311:1: ( 'activates' )
            {
            // InternalComponentDefinition.g:6311:1: ( 'activates' )
            // InternalComponentDefinition.g:6312:2: 'activates'
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesKeyword_5_0()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getActivatesKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5__0__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_5__1"
    // InternalComponentDefinition.g:6321:1: rule__PublicOperationMode__Group_5__1 : rule__PublicOperationMode__Group_5__1__Impl rule__PublicOperationMode__Group_5__2 ;
    public final void rule__PublicOperationMode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6325:1: ( rule__PublicOperationMode__Group_5__1__Impl rule__PublicOperationMode__Group_5__2 )
            // InternalComponentDefinition.g:6326:2: rule__PublicOperationMode__Group_5__1__Impl rule__PublicOperationMode__Group_5__2
            {
            pushFollow(FOLLOW_5);
            rule__PublicOperationMode__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5__1"


    // $ANTLR start "rule__PublicOperationMode__Group_5__1__Impl"
    // InternalComponentDefinition.g:6333:1: rule__PublicOperationMode__Group_5__1__Impl : ( '(' ) ;
    public final void rule__PublicOperationMode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6337:1: ( ( '(' ) )
            // InternalComponentDefinition.g:6338:1: ( '(' )
            {
            // InternalComponentDefinition.g:6338:1: ( '(' )
            // InternalComponentDefinition.g:6339:2: '('
            {
             before(grammarAccess.getPublicOperationModeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getLeftParenthesisKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5__1__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_5__2"
    // InternalComponentDefinition.g:6348:1: rule__PublicOperationMode__Group_5__2 : rule__PublicOperationMode__Group_5__2__Impl rule__PublicOperationMode__Group_5__3 ;
    public final void rule__PublicOperationMode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6352:1: ( rule__PublicOperationMode__Group_5__2__Impl rule__PublicOperationMode__Group_5__3 )
            // InternalComponentDefinition.g:6353:2: rule__PublicOperationMode__Group_5__2__Impl rule__PublicOperationMode__Group_5__3
            {
            pushFollow(FOLLOW_44);
            rule__PublicOperationMode__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5__2"


    // $ANTLR start "rule__PublicOperationMode__Group_5__2__Impl"
    // InternalComponentDefinition.g:6360:1: rule__PublicOperationMode__Group_5__2__Impl : ( ( rule__PublicOperationMode__ActivatesAssignment_5_2 ) ) ;
    public final void rule__PublicOperationMode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6364:1: ( ( ( rule__PublicOperationMode__ActivatesAssignment_5_2 ) ) )
            // InternalComponentDefinition.g:6365:1: ( ( rule__PublicOperationMode__ActivatesAssignment_5_2 ) )
            {
            // InternalComponentDefinition.g:6365:1: ( ( rule__PublicOperationMode__ActivatesAssignment_5_2 ) )
            // InternalComponentDefinition.g:6366:2: ( rule__PublicOperationMode__ActivatesAssignment_5_2 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_5_2()); 
            // InternalComponentDefinition.g:6367:2: ( rule__PublicOperationMode__ActivatesAssignment_5_2 )
            // InternalComponentDefinition.g:6367:3: rule__PublicOperationMode__ActivatesAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__ActivatesAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5__2__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_5__3"
    // InternalComponentDefinition.g:6375:1: rule__PublicOperationMode__Group_5__3 : rule__PublicOperationMode__Group_5__3__Impl rule__PublicOperationMode__Group_5__4 ;
    public final void rule__PublicOperationMode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6379:1: ( rule__PublicOperationMode__Group_5__3__Impl rule__PublicOperationMode__Group_5__4 )
            // InternalComponentDefinition.g:6380:2: rule__PublicOperationMode__Group_5__3__Impl rule__PublicOperationMode__Group_5__4
            {
            pushFollow(FOLLOW_44);
            rule__PublicOperationMode__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5__3"


    // $ANTLR start "rule__PublicOperationMode__Group_5__3__Impl"
    // InternalComponentDefinition.g:6387:1: rule__PublicOperationMode__Group_5__3__Impl : ( ( rule__PublicOperationMode__Group_5_3__0 )* ) ;
    public final void rule__PublicOperationMode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6391:1: ( ( ( rule__PublicOperationMode__Group_5_3__0 )* ) )
            // InternalComponentDefinition.g:6392:1: ( ( rule__PublicOperationMode__Group_5_3__0 )* )
            {
            // InternalComponentDefinition.g:6392:1: ( ( rule__PublicOperationMode__Group_5_3__0 )* )
            // InternalComponentDefinition.g:6393:2: ( rule__PublicOperationMode__Group_5_3__0 )*
            {
             before(grammarAccess.getPublicOperationModeAccess().getGroup_5_3()); 
            // InternalComponentDefinition.g:6394:2: ( rule__PublicOperationMode__Group_5_3__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==64) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalComponentDefinition.g:6394:3: rule__PublicOperationMode__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__PublicOperationMode__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

             after(grammarAccess.getPublicOperationModeAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5__3__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_5__4"
    // InternalComponentDefinition.g:6402:1: rule__PublicOperationMode__Group_5__4 : rule__PublicOperationMode__Group_5__4__Impl ;
    public final void rule__PublicOperationMode__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6406:1: ( rule__PublicOperationMode__Group_5__4__Impl )
            // InternalComponentDefinition.g:6407:2: rule__PublicOperationMode__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5__4"


    // $ANTLR start "rule__PublicOperationMode__Group_5__4__Impl"
    // InternalComponentDefinition.g:6413:1: rule__PublicOperationMode__Group_5__4__Impl : ( ')' ) ;
    public final void rule__PublicOperationMode__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6417:1: ( ( ')' ) )
            // InternalComponentDefinition.g:6418:1: ( ')' )
            {
            // InternalComponentDefinition.g:6418:1: ( ')' )
            // InternalComponentDefinition.g:6419:2: ')'
            {
             before(grammarAccess.getPublicOperationModeAccess().getRightParenthesisKeyword_5_4()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getRightParenthesisKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5__4__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_5_3__0"
    // InternalComponentDefinition.g:6429:1: rule__PublicOperationMode__Group_5_3__0 : rule__PublicOperationMode__Group_5_3__0__Impl rule__PublicOperationMode__Group_5_3__1 ;
    public final void rule__PublicOperationMode__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6433:1: ( rule__PublicOperationMode__Group_5_3__0__Impl rule__PublicOperationMode__Group_5_3__1 )
            // InternalComponentDefinition.g:6434:2: rule__PublicOperationMode__Group_5_3__0__Impl rule__PublicOperationMode__Group_5_3__1
            {
            pushFollow(FOLLOW_5);
            rule__PublicOperationMode__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5_3__0"


    // $ANTLR start "rule__PublicOperationMode__Group_5_3__0__Impl"
    // InternalComponentDefinition.g:6441:1: rule__PublicOperationMode__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__PublicOperationMode__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6445:1: ( ( ',' ) )
            // InternalComponentDefinition.g:6446:1: ( ',' )
            {
            // InternalComponentDefinition.g:6446:1: ( ',' )
            // InternalComponentDefinition.g:6447:2: ','
            {
             before(grammarAccess.getPublicOperationModeAccess().getCommaKeyword_5_3_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5_3__0__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_5_3__1"
    // InternalComponentDefinition.g:6456:1: rule__PublicOperationMode__Group_5_3__1 : rule__PublicOperationMode__Group_5_3__1__Impl ;
    public final void rule__PublicOperationMode__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6460:1: ( rule__PublicOperationMode__Group_5_3__1__Impl )
            // InternalComponentDefinition.g:6461:2: rule__PublicOperationMode__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5_3__1"


    // $ANTLR start "rule__PublicOperationMode__Group_5_3__1__Impl"
    // InternalComponentDefinition.g:6467:1: rule__PublicOperationMode__Group_5_3__1__Impl : ( ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 ) ) ;
    public final void rule__PublicOperationMode__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6471:1: ( ( ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 ) ) )
            // InternalComponentDefinition.g:6472:1: ( ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 ) )
            {
            // InternalComponentDefinition.g:6472:1: ( ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 ) )
            // InternalComponentDefinition.g:6473:2: ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_5_3_1()); 
            // InternalComponentDefinition.g:6474:2: ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 )
            // InternalComponentDefinition.g:6474:3: rule__PublicOperationMode__ActivatesAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__ActivatesAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_5_3__1__Impl"


    // $ANTLR start "rule__PrivateOperationMode__Group__0"
    // InternalComponentDefinition.g:6483:1: rule__PrivateOperationMode__Group__0 : rule__PrivateOperationMode__Group__0__Impl rule__PrivateOperationMode__Group__1 ;
    public final void rule__PrivateOperationMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6487:1: ( rule__PrivateOperationMode__Group__0__Impl rule__PrivateOperationMode__Group__1 )
            // InternalComponentDefinition.g:6488:2: rule__PrivateOperationMode__Group__0__Impl rule__PrivateOperationMode__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PrivateOperationMode__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateOperationMode__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateOperationMode__Group__0"


    // $ANTLR start "rule__PrivateOperationMode__Group__0__Impl"
    // InternalComponentDefinition.g:6495:1: rule__PrivateOperationMode__Group__0__Impl : ( 'PrivateOperationMode' ) ;
    public final void rule__PrivateOperationMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6499:1: ( ( 'PrivateOperationMode' ) )
            // InternalComponentDefinition.g:6500:1: ( 'PrivateOperationMode' )
            {
            // InternalComponentDefinition.g:6500:1: ( 'PrivateOperationMode' )
            // InternalComponentDefinition.g:6501:2: 'PrivateOperationMode'
            {
             before(grammarAccess.getPrivateOperationModeAccess().getPrivateOperationModeKeyword_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getPrivateOperationModeAccess().getPrivateOperationModeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateOperationMode__Group__0__Impl"


    // $ANTLR start "rule__PrivateOperationMode__Group__1"
    // InternalComponentDefinition.g:6510:1: rule__PrivateOperationMode__Group__1 : rule__PrivateOperationMode__Group__1__Impl rule__PrivateOperationMode__Group__2 ;
    public final void rule__PrivateOperationMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6514:1: ( rule__PrivateOperationMode__Group__1__Impl rule__PrivateOperationMode__Group__2 )
            // InternalComponentDefinition.g:6515:2: rule__PrivateOperationMode__Group__1__Impl rule__PrivateOperationMode__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__PrivateOperationMode__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PrivateOperationMode__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateOperationMode__Group__1"


    // $ANTLR start "rule__PrivateOperationMode__Group__1__Impl"
    // InternalComponentDefinition.g:6522:1: rule__PrivateOperationMode__Group__1__Impl : ( ( rule__PrivateOperationMode__NameAssignment_1 ) ) ;
    public final void rule__PrivateOperationMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6526:1: ( ( ( rule__PrivateOperationMode__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:6527:1: ( ( rule__PrivateOperationMode__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:6527:1: ( ( rule__PrivateOperationMode__NameAssignment_1 ) )
            // InternalComponentDefinition.g:6528:2: ( rule__PrivateOperationMode__NameAssignment_1 )
            {
             before(grammarAccess.getPrivateOperationModeAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:6529:2: ( rule__PrivateOperationMode__NameAssignment_1 )
            // InternalComponentDefinition.g:6529:3: rule__PrivateOperationMode__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PrivateOperationMode__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPrivateOperationModeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateOperationMode__Group__1__Impl"


    // $ANTLR start "rule__PrivateOperationMode__Group__2"
    // InternalComponentDefinition.g:6537:1: rule__PrivateOperationMode__Group__2 : rule__PrivateOperationMode__Group__2__Impl ;
    public final void rule__PrivateOperationMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6541:1: ( rule__PrivateOperationMode__Group__2__Impl )
            // InternalComponentDefinition.g:6542:2: rule__PrivateOperationMode__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PrivateOperationMode__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateOperationMode__Group__2"


    // $ANTLR start "rule__PrivateOperationMode__Group__2__Impl"
    // InternalComponentDefinition.g:6548:1: rule__PrivateOperationMode__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__PrivateOperationMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6552:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:6553:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:6553:1: ( ( ';' )? )
            // InternalComponentDefinition.g:6554:2: ( ';' )?
            {
             before(grammarAccess.getPrivateOperationModeAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:6555:2: ( ';' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==16) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalComponentDefinition.g:6555:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPrivateOperationModeAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateOperationMode__Group__2__Impl"


    // $ANTLR start "rule__CoordinationMasterPort__Group__0"
    // InternalComponentDefinition.g:6564:1: rule__CoordinationMasterPort__Group__0 : rule__CoordinationMasterPort__Group__0__Impl rule__CoordinationMasterPort__Group__1 ;
    public final void rule__CoordinationMasterPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6568:1: ( rule__CoordinationMasterPort__Group__0__Impl rule__CoordinationMasterPort__Group__1 )
            // InternalComponentDefinition.g:6569:2: rule__CoordinationMasterPort__Group__0__Impl rule__CoordinationMasterPort__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__CoordinationMasterPort__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationMasterPort__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__Group__0"


    // $ANTLR start "rule__CoordinationMasterPort__Group__0__Impl"
    // InternalComponentDefinition.g:6576:1: rule__CoordinationMasterPort__Group__0__Impl : ( 'CoordinationMasterPort' ) ;
    public final void rule__CoordinationMasterPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6580:1: ( ( 'CoordinationMasterPort' ) )
            // InternalComponentDefinition.g:6581:1: ( 'CoordinationMasterPort' )
            {
            // InternalComponentDefinition.g:6581:1: ( 'CoordinationMasterPort' )
            // InternalComponentDefinition.g:6582:2: 'CoordinationMasterPort'
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getCoordinationMasterPortKeyword_0()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getCoordinationMasterPortAccess().getCoordinationMasterPortKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__Group__0__Impl"


    // $ANTLR start "rule__CoordinationMasterPort__Group__1"
    // InternalComponentDefinition.g:6591:1: rule__CoordinationMasterPort__Group__1 : rule__CoordinationMasterPort__Group__1__Impl rule__CoordinationMasterPort__Group__2 ;
    public final void rule__CoordinationMasterPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6595:1: ( rule__CoordinationMasterPort__Group__1__Impl rule__CoordinationMasterPort__Group__2 )
            // InternalComponentDefinition.g:6596:2: rule__CoordinationMasterPort__Group__1__Impl rule__CoordinationMasterPort__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__CoordinationMasterPort__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationMasterPort__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__Group__1"


    // $ANTLR start "rule__CoordinationMasterPort__Group__1__Impl"
    // InternalComponentDefinition.g:6603:1: rule__CoordinationMasterPort__Group__1__Impl : ( ( rule__CoordinationMasterPort__NameAssignment_1 ) ) ;
    public final void rule__CoordinationMasterPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6607:1: ( ( ( rule__CoordinationMasterPort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:6608:1: ( ( rule__CoordinationMasterPort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:6608:1: ( ( rule__CoordinationMasterPort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:6609:2: ( rule__CoordinationMasterPort__NameAssignment_1 )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:6610:2: ( rule__CoordinationMasterPort__NameAssignment_1 )
            // InternalComponentDefinition.g:6610:3: rule__CoordinationMasterPort__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationMasterPort__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationMasterPortAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__Group__1__Impl"


    // $ANTLR start "rule__CoordinationMasterPort__Group__2"
    // InternalComponentDefinition.g:6618:1: rule__CoordinationMasterPort__Group__2 : rule__CoordinationMasterPort__Group__2__Impl rule__CoordinationMasterPort__Group__3 ;
    public final void rule__CoordinationMasterPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6622:1: ( rule__CoordinationMasterPort__Group__2__Impl rule__CoordinationMasterPort__Group__3 )
            // InternalComponentDefinition.g:6623:2: rule__CoordinationMasterPort__Group__2__Impl rule__CoordinationMasterPort__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__CoordinationMasterPort__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationMasterPort__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__Group__2"


    // $ANTLR start "rule__CoordinationMasterPort__Group__2__Impl"
    // InternalComponentDefinition.g:6630:1: rule__CoordinationMasterPort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__CoordinationMasterPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6634:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:6635:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:6635:1: ( 'implements' )
            // InternalComponentDefinition.g:6636:2: 'implements'
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getImplementsKeyword_2()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCoordinationMasterPortAccess().getImplementsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__Group__2__Impl"


    // $ANTLR start "rule__CoordinationMasterPort__Group__3"
    // InternalComponentDefinition.g:6645:1: rule__CoordinationMasterPort__Group__3 : rule__CoordinationMasterPort__Group__3__Impl rule__CoordinationMasterPort__Group__4 ;
    public final void rule__CoordinationMasterPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6649:1: ( rule__CoordinationMasterPort__Group__3__Impl rule__CoordinationMasterPort__Group__4 )
            // InternalComponentDefinition.g:6650:2: rule__CoordinationMasterPort__Group__3__Impl rule__CoordinationMasterPort__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__CoordinationMasterPort__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationMasterPort__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__Group__3"


    // $ANTLR start "rule__CoordinationMasterPort__Group__3__Impl"
    // InternalComponentDefinition.g:6657:1: rule__CoordinationMasterPort__Group__3__Impl : ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) ) ;
    public final void rule__CoordinationMasterPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6661:1: ( ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:6662:1: ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:6662:1: ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:6663:2: ( rule__CoordinationMasterPort__ServiceAssignment_3 )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:6664:2: ( rule__CoordinationMasterPort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:6664:3: rule__CoordinationMasterPort__ServiceAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationMasterPort__ServiceAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationMasterPortAccess().getServiceAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__Group__3__Impl"


    // $ANTLR start "rule__CoordinationMasterPort__Group__4"
    // InternalComponentDefinition.g:6672:1: rule__CoordinationMasterPort__Group__4 : rule__CoordinationMasterPort__Group__4__Impl ;
    public final void rule__CoordinationMasterPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6676:1: ( rule__CoordinationMasterPort__Group__4__Impl )
            // InternalComponentDefinition.g:6677:2: rule__CoordinationMasterPort__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationMasterPort__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__Group__4"


    // $ANTLR start "rule__CoordinationMasterPort__Group__4__Impl"
    // InternalComponentDefinition.g:6683:1: rule__CoordinationMasterPort__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__CoordinationMasterPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6687:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:6688:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:6688:1: ( ( ';' )? )
            // InternalComponentDefinition.g:6689:2: ( ';' )?
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getSemicolonKeyword_4()); 
            // InternalComponentDefinition.g:6690:2: ( ';' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==16) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalComponentDefinition.g:6690:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getCoordinationMasterPortAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__Group__4__Impl"


    // $ANTLR start "rule__ComponentParametersRef__Group__0"
    // InternalComponentDefinition.g:6699:1: rule__ComponentParametersRef__Group__0 : rule__ComponentParametersRef__Group__0__Impl rule__ComponentParametersRef__Group__1 ;
    public final void rule__ComponentParametersRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6703:1: ( rule__ComponentParametersRef__Group__0__Impl rule__ComponentParametersRef__Group__1 )
            // InternalComponentDefinition.g:6704:2: rule__ComponentParametersRef__Group__0__Impl rule__ComponentParametersRef__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ComponentParametersRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentParametersRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group__0"


    // $ANTLR start "rule__ComponentParametersRef__Group__0__Impl"
    // InternalComponentDefinition.g:6711:1: rule__ComponentParametersRef__Group__0__Impl : ( 'ComponentParameters' ) ;
    public final void rule__ComponentParametersRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6715:1: ( ( 'ComponentParameters' ) )
            // InternalComponentDefinition.g:6716:1: ( 'ComponentParameters' )
            {
            // InternalComponentDefinition.g:6716:1: ( 'ComponentParameters' )
            // InternalComponentDefinition.g:6717:2: 'ComponentParameters'
            {
             before(grammarAccess.getComponentParametersRefAccess().getComponentParametersKeyword_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getComponentParametersRefAccess().getComponentParametersKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group__0__Impl"


    // $ANTLR start "rule__ComponentParametersRef__Group__1"
    // InternalComponentDefinition.g:6726:1: rule__ComponentParametersRef__Group__1 : rule__ComponentParametersRef__Group__1__Impl rule__ComponentParametersRef__Group__2 ;
    public final void rule__ComponentParametersRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6730:1: ( rule__ComponentParametersRef__Group__1__Impl rule__ComponentParametersRef__Group__2 )
            // InternalComponentDefinition.g:6731:2: rule__ComponentParametersRef__Group__1__Impl rule__ComponentParametersRef__Group__2
            {
            pushFollow(FOLLOW_46);
            rule__ComponentParametersRef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentParametersRef__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group__1"


    // $ANTLR start "rule__ComponentParametersRef__Group__1__Impl"
    // InternalComponentDefinition.g:6738:1: rule__ComponentParametersRef__Group__1__Impl : ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) ) ;
    public final void rule__ComponentParametersRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6742:1: ( ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) ) )
            // InternalComponentDefinition.g:6743:1: ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) )
            {
            // InternalComponentDefinition.g:6743:1: ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) )
            // InternalComponentDefinition.g:6744:2: ( rule__ComponentParametersRef__ParameterAssignment_1 )
            {
             before(grammarAccess.getComponentParametersRefAccess().getParameterAssignment_1()); 
            // InternalComponentDefinition.g:6745:2: ( rule__ComponentParametersRef__ParameterAssignment_1 )
            // InternalComponentDefinition.g:6745:3: rule__ComponentParametersRef__ParameterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentParametersRef__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentParametersRefAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group__1__Impl"


    // $ANTLR start "rule__ComponentParametersRef__Group__2"
    // InternalComponentDefinition.g:6753:1: rule__ComponentParametersRef__Group__2 : rule__ComponentParametersRef__Group__2__Impl rule__ComponentParametersRef__Group__3 ;
    public final void rule__ComponentParametersRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6757:1: ( rule__ComponentParametersRef__Group__2__Impl rule__ComponentParametersRef__Group__3 )
            // InternalComponentDefinition.g:6758:2: rule__ComponentParametersRef__Group__2__Impl rule__ComponentParametersRef__Group__3
            {
            pushFollow(FOLLOW_46);
            rule__ComponentParametersRef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentParametersRef__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group__2"


    // $ANTLR start "rule__ComponentParametersRef__Group__2__Impl"
    // InternalComponentDefinition.g:6765:1: rule__ComponentParametersRef__Group__2__Impl : ( ( rule__ComponentParametersRef__Group_2__0 )? ) ;
    public final void rule__ComponentParametersRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6769:1: ( ( ( rule__ComponentParametersRef__Group_2__0 )? ) )
            // InternalComponentDefinition.g:6770:1: ( ( rule__ComponentParametersRef__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:6770:1: ( ( rule__ComponentParametersRef__Group_2__0 )? )
            // InternalComponentDefinition.g:6771:2: ( rule__ComponentParametersRef__Group_2__0 )?
            {
             before(grammarAccess.getComponentParametersRefAccess().getGroup_2()); 
            // InternalComponentDefinition.g:6772:2: ( rule__ComponentParametersRef__Group_2__0 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==68) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalComponentDefinition.g:6772:3: rule__ComponentParametersRef__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentParametersRef__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentParametersRefAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group__2__Impl"


    // $ANTLR start "rule__ComponentParametersRef__Group__3"
    // InternalComponentDefinition.g:6780:1: rule__ComponentParametersRef__Group__3 : rule__ComponentParametersRef__Group__3__Impl ;
    public final void rule__ComponentParametersRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6784:1: ( rule__ComponentParametersRef__Group__3__Impl )
            // InternalComponentDefinition.g:6785:2: rule__ComponentParametersRef__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentParametersRef__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group__3"


    // $ANTLR start "rule__ComponentParametersRef__Group__3__Impl"
    // InternalComponentDefinition.g:6791:1: rule__ComponentParametersRef__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__ComponentParametersRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6795:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:6796:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:6796:1: ( ( ';' )? )
            // InternalComponentDefinition.g:6797:2: ( ';' )?
            {
             before(grammarAccess.getComponentParametersRefAccess().getSemicolonKeyword_3()); 
            // InternalComponentDefinition.g:6798:2: ( ';' )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==16) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalComponentDefinition.g:6798:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getComponentParametersRefAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group__3__Impl"


    // $ANTLR start "rule__ComponentParametersRef__Group_2__0"
    // InternalComponentDefinition.g:6807:1: rule__ComponentParametersRef__Group_2__0 : rule__ComponentParametersRef__Group_2__0__Impl rule__ComponentParametersRef__Group_2__1 ;
    public final void rule__ComponentParametersRef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6811:1: ( rule__ComponentParametersRef__Group_2__0__Impl rule__ComponentParametersRef__Group_2__1 )
            // InternalComponentDefinition.g:6812:2: rule__ComponentParametersRef__Group_2__0__Impl rule__ComponentParametersRef__Group_2__1
            {
            pushFollow(FOLLOW_5);
            rule__ComponentParametersRef__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentParametersRef__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group_2__0"


    // $ANTLR start "rule__ComponentParametersRef__Group_2__0__Impl"
    // InternalComponentDefinition.g:6819:1: rule__ComponentParametersRef__Group_2__0__Impl : ( 'slave' ) ;
    public final void rule__ComponentParametersRef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6823:1: ( ( 'slave' ) )
            // InternalComponentDefinition.g:6824:1: ( 'slave' )
            {
            // InternalComponentDefinition.g:6824:1: ( 'slave' )
            // InternalComponentDefinition.g:6825:2: 'slave'
            {
             before(grammarAccess.getComponentParametersRefAccess().getSlaveKeyword_2_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getComponentParametersRefAccess().getSlaveKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group_2__0__Impl"


    // $ANTLR start "rule__ComponentParametersRef__Group_2__1"
    // InternalComponentDefinition.g:6834:1: rule__ComponentParametersRef__Group_2__1 : rule__ComponentParametersRef__Group_2__1__Impl ;
    public final void rule__ComponentParametersRef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6838:1: ( rule__ComponentParametersRef__Group_2__1__Impl )
            // InternalComponentDefinition.g:6839:2: rule__ComponentParametersRef__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentParametersRef__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group_2__1"


    // $ANTLR start "rule__ComponentParametersRef__Group_2__1__Impl"
    // InternalComponentDefinition.g:6845:1: rule__ComponentParametersRef__Group_2__1__Impl : ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) ) ;
    public final void rule__ComponentParametersRef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6849:1: ( ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:6850:1: ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:6850:1: ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) )
            // InternalComponentDefinition.g:6851:2: ( rule__ComponentParametersRef__SlaveAssignment_2_1 )
            {
             before(grammarAccess.getComponentParametersRefAccess().getSlaveAssignment_2_1()); 
            // InternalComponentDefinition.g:6852:2: ( rule__ComponentParametersRef__SlaveAssignment_2_1 )
            // InternalComponentDefinition.g:6852:3: rule__ComponentParametersRef__SlaveAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentParametersRef__SlaveAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentParametersRefAccess().getSlaveAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__Group_2__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalComponentDefinition.g:6861:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6865:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalComponentDefinition.g:6866:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalComponentDefinition.g:6873:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6877:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:6878:1: ( RULE_ID )
            {
            // InternalComponentDefinition.g:6878:1: ( RULE_ID )
            // InternalComponentDefinition.g:6879:2: RULE_ID
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
    // InternalComponentDefinition.g:6888:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6892:1: ( rule__FQN__Group__1__Impl )
            // InternalComponentDefinition.g:6893:2: rule__FQN__Group__1__Impl
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
    // InternalComponentDefinition.g:6899:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6903:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalComponentDefinition.g:6904:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalComponentDefinition.g:6904:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalComponentDefinition.g:6905:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalComponentDefinition.g:6906:2: ( rule__FQN__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==69) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalComponentDefinition.g:6906:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_48);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalComponentDefinition.g:6915:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6919:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalComponentDefinition.g:6920:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:6927:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6931:1: ( ( '.' ) )
            // InternalComponentDefinition.g:6932:1: ( '.' )
            {
            // InternalComponentDefinition.g:6932:1: ( '.' )
            // InternalComponentDefinition.g:6933:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6942:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6946:1: ( rule__FQN__Group_1__1__Impl )
            // InternalComponentDefinition.g:6947:2: rule__FQN__Group_1__1__Impl
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
    // InternalComponentDefinition.g:6953:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6957:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:6958:1: ( RULE_ID )
            {
            // InternalComponentDefinition.g:6958:1: ( RULE_ID )
            // InternalComponentDefinition.g:6959:2: RULE_ID
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
    // InternalComponentDefinition.g:6969:1: rule__FQNW__Group__0 : rule__FQNW__Group__0__Impl rule__FQNW__Group__1 ;
    public final void rule__FQNW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6973:1: ( rule__FQNW__Group__0__Impl rule__FQNW__Group__1 )
            // InternalComponentDefinition.g:6974:2: rule__FQNW__Group__0__Impl rule__FQNW__Group__1
            {
            pushFollow(FOLLOW_49);
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
    // InternalComponentDefinition.g:6981:1: rule__FQNW__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6985:1: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:6986:1: ( ruleFQN )
            {
            // InternalComponentDefinition.g:6986:1: ( ruleFQN )
            // InternalComponentDefinition.g:6987:2: ruleFQN
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
    // InternalComponentDefinition.g:6996:1: rule__FQNW__Group__1 : rule__FQNW__Group__1__Impl ;
    public final void rule__FQNW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7000:1: ( rule__FQNW__Group__1__Impl )
            // InternalComponentDefinition.g:7001:2: rule__FQNW__Group__1__Impl
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
    // InternalComponentDefinition.g:7007:1: rule__FQNW__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7011:1: ( ( ( '.*' )? ) )
            // InternalComponentDefinition.g:7012:1: ( ( '.*' )? )
            {
            // InternalComponentDefinition.g:7012:1: ( ( '.*' )? )
            // InternalComponentDefinition.g:7013:2: ( '.*' )?
            {
             before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); 
            // InternalComponentDefinition.g:7014:2: ( '.*' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==70) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalComponentDefinition.g:7014:3: '.*'
                    {
                    match(input,70,FOLLOW_2); 

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
    // InternalComponentDefinition.g:7023:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7027:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalComponentDefinition.g:7028:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalComponentDefinition.g:7035:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7039:1: ( ( ( '-' )? ) )
            // InternalComponentDefinition.g:7040:1: ( ( '-' )? )
            {
            // InternalComponentDefinition.g:7040:1: ( ( '-' )? )
            // InternalComponentDefinition.g:7041:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalComponentDefinition.g:7042:2: ( '-' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==71) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalComponentDefinition.g:7042:3: '-'
                    {
                    match(input,71,FOLLOW_2); 

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
    // InternalComponentDefinition.g:7050:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7054:1: ( rule__EInt__Group__1__Impl )
            // InternalComponentDefinition.g:7055:2: rule__EInt__Group__1__Impl
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
    // InternalComponentDefinition.g:7061:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7065:1: ( ( RULE_INT ) )
            // InternalComponentDefinition.g:7066:1: ( RULE_INT )
            {
            // InternalComponentDefinition.g:7066:1: ( RULE_INT )
            // InternalComponentDefinition.g:7067:2: RULE_INT
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
    // InternalComponentDefinition.g:7077:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7081:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalComponentDefinition.g:7082:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalComponentDefinition.g:7089:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7093:1: ( ( ( '-' )? ) )
            // InternalComponentDefinition.g:7094:1: ( ( '-' )? )
            {
            // InternalComponentDefinition.g:7094:1: ( ( '-' )? )
            // InternalComponentDefinition.g:7095:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalComponentDefinition.g:7096:2: ( '-' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==71) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalComponentDefinition.g:7096:3: '-'
                    {
                    match(input,71,FOLLOW_2); 

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
    // InternalComponentDefinition.g:7104:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7108:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalComponentDefinition.g:7109:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_31);
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
    // InternalComponentDefinition.g:7116:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7120:1: ( ( ( RULE_INT )? ) )
            // InternalComponentDefinition.g:7121:1: ( ( RULE_INT )? )
            {
            // InternalComponentDefinition.g:7121:1: ( ( RULE_INT )? )
            // InternalComponentDefinition.g:7122:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalComponentDefinition.g:7123:2: ( RULE_INT )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_INT) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalComponentDefinition.g:7123:3: RULE_INT
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
    // InternalComponentDefinition.g:7131:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7135:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalComponentDefinition.g:7136:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_50);
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
    // InternalComponentDefinition.g:7143:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7147:1: ( ( '.' ) )
            // InternalComponentDefinition.g:7148:1: ( '.' )
            {
            // InternalComponentDefinition.g:7148:1: ( '.' )
            // InternalComponentDefinition.g:7149:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,69,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7158:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7162:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalComponentDefinition.g:7163:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_51);
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
    // InternalComponentDefinition.g:7170:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7174:1: ( ( RULE_INT ) )
            // InternalComponentDefinition.g:7175:1: ( RULE_INT )
            {
            // InternalComponentDefinition.g:7175:1: ( RULE_INT )
            // InternalComponentDefinition.g:7176:2: RULE_INT
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
    // InternalComponentDefinition.g:7185:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7189:1: ( rule__EDouble__Group__4__Impl )
            // InternalComponentDefinition.g:7190:2: rule__EDouble__Group__4__Impl
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
    // InternalComponentDefinition.g:7196:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7200:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalComponentDefinition.g:7201:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalComponentDefinition.g:7201:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalComponentDefinition.g:7202:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalComponentDefinition.g:7203:2: ( rule__EDouble__Group_4__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( ((LA60_0>=11 && LA60_0<=12)) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalComponentDefinition.g:7203:3: rule__EDouble__Group_4__0
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
    // InternalComponentDefinition.g:7212:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7216:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalComponentDefinition.g:7217:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalComponentDefinition.g:7224:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7228:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalComponentDefinition.g:7229:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalComponentDefinition.g:7229:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalComponentDefinition.g:7230:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalComponentDefinition.g:7231:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalComponentDefinition.g:7231:3: rule__EDouble__Alternatives_4_0
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
    // InternalComponentDefinition.g:7239:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7243:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalComponentDefinition.g:7244:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_35);
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
    // InternalComponentDefinition.g:7251:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7255:1: ( ( ( '-' )? ) )
            // InternalComponentDefinition.g:7256:1: ( ( '-' )? )
            {
            // InternalComponentDefinition.g:7256:1: ( ( '-' )? )
            // InternalComponentDefinition.g:7257:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalComponentDefinition.g:7258:2: ( '-' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==71) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalComponentDefinition.g:7258:3: '-'
                    {
                    match(input,71,FOLLOW_2); 

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
    // InternalComponentDefinition.g:7266:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7270:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalComponentDefinition.g:7271:2: rule__EDouble__Group_4__2__Impl
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
    // InternalComponentDefinition.g:7277:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7281:1: ( ( RULE_INT ) )
            // InternalComponentDefinition.g:7282:1: ( RULE_INT )
            {
            // InternalComponentDefinition.g:7282:1: ( RULE_INT )
            // InternalComponentDefinition.g:7283:2: RULE_INT
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


    // $ANTLR start "rule__ACE_SmartSoft__Group__0"
    // InternalComponentDefinition.g:7293:1: rule__ACE_SmartSoft__Group__0 : rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 ;
    public final void rule__ACE_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7297:1: ( rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 )
            // InternalComponentDefinition.g:7298:2: rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__ACE_SmartSoft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__0"


    // $ANTLR start "rule__ACE_SmartSoft__Group__0__Impl"
    // InternalComponentDefinition.g:7305:1: rule__ACE_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__ACE_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7309:1: ( ( () ) )
            // InternalComponentDefinition.g:7310:1: ( () )
            {
            // InternalComponentDefinition.g:7310:1: ( () )
            // InternalComponentDefinition.g:7311:2: ()
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); 
            // InternalComponentDefinition.g:7312:2: ()
            // InternalComponentDefinition.g:7312:3: 
            {
            }

             after(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__0__Impl"


    // $ANTLR start "rule__ACE_SmartSoft__Group__1"
    // InternalComponentDefinition.g:7320:1: rule__ACE_SmartSoft__Group__1 : rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 ;
    public final void rule__ACE_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7324:1: ( rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 )
            // InternalComponentDefinition.g:7325:2: rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__ACE_SmartSoft__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__1"


    // $ANTLR start "rule__ACE_SmartSoft__Group__1__Impl"
    // InternalComponentDefinition.g:7332:1: rule__ACE_SmartSoft__Group__1__Impl : ( 'ACE_SmartSoft' ) ;
    public final void rule__ACE_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7336:1: ( ( 'ACE_SmartSoft' ) )
            // InternalComponentDefinition.g:7337:1: ( 'ACE_SmartSoft' )
            {
            // InternalComponentDefinition.g:7337:1: ( 'ACE_SmartSoft' )
            // InternalComponentDefinition.g:7338:2: 'ACE_SmartSoft'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__1__Impl"


    // $ANTLR start "rule__ACE_SmartSoft__Group__2"
    // InternalComponentDefinition.g:7347:1: rule__ACE_SmartSoft__Group__2 : rule__ACE_SmartSoft__Group__2__Impl ;
    public final void rule__ACE_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7351:1: ( rule__ACE_SmartSoft__Group__2__Impl )
            // InternalComponentDefinition.g:7352:2: rule__ACE_SmartSoft__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__2"


    // $ANTLR start "rule__ACE_SmartSoft__Group__2__Impl"
    // InternalComponentDefinition.g:7358:1: rule__ACE_SmartSoft__Group__2__Impl : ( ( rule__ACE_SmartSoft__Group_2__0 )? ) ;
    public final void rule__ACE_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7362:1: ( ( ( rule__ACE_SmartSoft__Group_2__0 )? ) )
            // InternalComponentDefinition.g:7363:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:7363:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            // InternalComponentDefinition.g:7364:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); 
            // InternalComponentDefinition.g:7365:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==73) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalComponentDefinition.g:7365:3: rule__ACE_SmartSoft__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ACE_SmartSoft__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group__2__Impl"


    // $ANTLR start "rule__ACE_SmartSoft__Group_2__0"
    // InternalComponentDefinition.g:7374:1: rule__ACE_SmartSoft__Group_2__0 : rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 ;
    public final void rule__ACE_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7378:1: ( rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 )
            // InternalComponentDefinition.g:7379:2: rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__ACE_SmartSoft__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group_2__0"


    // $ANTLR start "rule__ACE_SmartSoft__Group_2__0__Impl"
    // InternalComponentDefinition.g:7386:1: rule__ACE_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__ACE_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7390:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:7391:1: ( 'description' )
            {
            // InternalComponentDefinition.g:7391:1: ( 'description' )
            // InternalComponentDefinition.g:7392:2: 'description'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group_2__0__Impl"


    // $ANTLR start "rule__ACE_SmartSoft__Group_2__1"
    // InternalComponentDefinition.g:7401:1: rule__ACE_SmartSoft__Group_2__1 : rule__ACE_SmartSoft__Group_2__1__Impl ;
    public final void rule__ACE_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7405:1: ( rule__ACE_SmartSoft__Group_2__1__Impl )
            // InternalComponentDefinition.g:7406:2: rule__ACE_SmartSoft__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group_2__1"


    // $ANTLR start "rule__ACE_SmartSoft__Group_2__1__Impl"
    // InternalComponentDefinition.g:7412:1: rule__ACE_SmartSoft__Group_2__1__Impl : ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__ACE_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7416:1: ( ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:7417:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:7417:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:7418:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:7419:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:7419:3: rule__ACE_SmartSoft__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ACE_SmartSoft__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__Group_2__1__Impl"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__0"
    // InternalComponentDefinition.g:7428:1: rule__OpcUa_SeRoNet__Group__0 : rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 ;
    public final void rule__OpcUa_SeRoNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7432:1: ( rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 )
            // InternalComponentDefinition.g:7433:2: rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__OpcUa_SeRoNet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__0"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__0__Impl"
    // InternalComponentDefinition.g:7440:1: rule__OpcUa_SeRoNet__Group__0__Impl : ( () ) ;
    public final void rule__OpcUa_SeRoNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7444:1: ( ( () ) )
            // InternalComponentDefinition.g:7445:1: ( () )
            {
            // InternalComponentDefinition.g:7445:1: ( () )
            // InternalComponentDefinition.g:7446:2: ()
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); 
            // InternalComponentDefinition.g:7447:2: ()
            // InternalComponentDefinition.g:7447:3: 
            {
            }

             after(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__0__Impl"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__1"
    // InternalComponentDefinition.g:7455:1: rule__OpcUa_SeRoNet__Group__1 : rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 ;
    public final void rule__OpcUa_SeRoNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7459:1: ( rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 )
            // InternalComponentDefinition.g:7460:2: rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__OpcUa_SeRoNet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__1"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__1__Impl"
    // InternalComponentDefinition.g:7467:1: rule__OpcUa_SeRoNet__Group__1__Impl : ( 'OpcUa_SeRoNet' ) ;
    public final void rule__OpcUa_SeRoNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7471:1: ( ( 'OpcUa_SeRoNet' ) )
            // InternalComponentDefinition.g:7472:1: ( 'OpcUa_SeRoNet' )
            {
            // InternalComponentDefinition.g:7472:1: ( 'OpcUa_SeRoNet' )
            // InternalComponentDefinition.g:7473:2: 'OpcUa_SeRoNet'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); 
            match(input,74,FOLLOW_2); 
             after(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__1__Impl"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__2"
    // InternalComponentDefinition.g:7482:1: rule__OpcUa_SeRoNet__Group__2 : rule__OpcUa_SeRoNet__Group__2__Impl ;
    public final void rule__OpcUa_SeRoNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7486:1: ( rule__OpcUa_SeRoNet__Group__2__Impl )
            // InternalComponentDefinition.g:7487:2: rule__OpcUa_SeRoNet__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__2"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group__2__Impl"
    // InternalComponentDefinition.g:7493:1: rule__OpcUa_SeRoNet__Group__2__Impl : ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) ;
    public final void rule__OpcUa_SeRoNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7497:1: ( ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) )
            // InternalComponentDefinition.g:7498:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:7498:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            // InternalComponentDefinition.g:7499:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); 
            // InternalComponentDefinition.g:7500:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==73) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalComponentDefinition.g:7500:3: rule__OpcUa_SeRoNet__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUa_SeRoNet__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group__2__Impl"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group_2__0"
    // InternalComponentDefinition.g:7509:1: rule__OpcUa_SeRoNet__Group_2__0 : rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 ;
    public final void rule__OpcUa_SeRoNet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7513:1: ( rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 )
            // InternalComponentDefinition.g:7514:2: rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__OpcUa_SeRoNet__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group_2__0"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group_2__0__Impl"
    // InternalComponentDefinition.g:7521:1: rule__OpcUa_SeRoNet__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7525:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:7526:1: ( 'description' )
            {
            // InternalComponentDefinition.g:7526:1: ( 'description' )
            // InternalComponentDefinition.g:7527:2: 'description'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group_2__0__Impl"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group_2__1"
    // InternalComponentDefinition.g:7536:1: rule__OpcUa_SeRoNet__Group_2__1 : rule__OpcUa_SeRoNet__Group_2__1__Impl ;
    public final void rule__OpcUa_SeRoNet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7540:1: ( rule__OpcUa_SeRoNet__Group_2__1__Impl )
            // InternalComponentDefinition.g:7541:2: rule__OpcUa_SeRoNet__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group_2__1"


    // $ANTLR start "rule__OpcUa_SeRoNet__Group_2__1__Impl"
    // InternalComponentDefinition.g:7547:1: rule__OpcUa_SeRoNet__Group_2__1__Impl : ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7551:1: ( ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:7552:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:7552:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:7553:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:7554:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:7554:3: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUa_SeRoNet__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__Group_2__1__Impl"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__0"
    // InternalComponentDefinition.g:7563:1: rule__CORBA_SmartSoft__Group__0 : rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 ;
    public final void rule__CORBA_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7567:1: ( rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 )
            // InternalComponentDefinition.g:7568:2: rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_55);
            rule__CORBA_SmartSoft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__0"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__0__Impl"
    // InternalComponentDefinition.g:7575:1: rule__CORBA_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__CORBA_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7579:1: ( ( () ) )
            // InternalComponentDefinition.g:7580:1: ( () )
            {
            // InternalComponentDefinition.g:7580:1: ( () )
            // InternalComponentDefinition.g:7581:2: ()
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); 
            // InternalComponentDefinition.g:7582:2: ()
            // InternalComponentDefinition.g:7582:3: 
            {
            }

             after(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__0__Impl"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__1"
    // InternalComponentDefinition.g:7590:1: rule__CORBA_SmartSoft__Group__1 : rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 ;
    public final void rule__CORBA_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7594:1: ( rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 )
            // InternalComponentDefinition.g:7595:2: rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__CORBA_SmartSoft__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__1"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__1__Impl"
    // InternalComponentDefinition.g:7602:1: rule__CORBA_SmartSoft__Group__1__Impl : ( 'CORBA_SmartSoft' ) ;
    public final void rule__CORBA_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7606:1: ( ( 'CORBA_SmartSoft' ) )
            // InternalComponentDefinition.g:7607:1: ( 'CORBA_SmartSoft' )
            {
            // InternalComponentDefinition.g:7607:1: ( 'CORBA_SmartSoft' )
            // InternalComponentDefinition.g:7608:2: 'CORBA_SmartSoft'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); 
            match(input,75,FOLLOW_2); 
             after(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__1__Impl"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__2"
    // InternalComponentDefinition.g:7617:1: rule__CORBA_SmartSoft__Group__2 : rule__CORBA_SmartSoft__Group__2__Impl ;
    public final void rule__CORBA_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7621:1: ( rule__CORBA_SmartSoft__Group__2__Impl )
            // InternalComponentDefinition.g:7622:2: rule__CORBA_SmartSoft__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__2"


    // $ANTLR start "rule__CORBA_SmartSoft__Group__2__Impl"
    // InternalComponentDefinition.g:7628:1: rule__CORBA_SmartSoft__Group__2__Impl : ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) ;
    public final void rule__CORBA_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7632:1: ( ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) )
            // InternalComponentDefinition.g:7633:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:7633:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            // InternalComponentDefinition.g:7634:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); 
            // InternalComponentDefinition.g:7635:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==73) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalComponentDefinition.g:7635:3: rule__CORBA_SmartSoft__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CORBA_SmartSoft__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group__2__Impl"


    // $ANTLR start "rule__CORBA_SmartSoft__Group_2__0"
    // InternalComponentDefinition.g:7644:1: rule__CORBA_SmartSoft__Group_2__0 : rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 ;
    public final void rule__CORBA_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7648:1: ( rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 )
            // InternalComponentDefinition.g:7649:2: rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__CORBA_SmartSoft__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group_2__0"


    // $ANTLR start "rule__CORBA_SmartSoft__Group_2__0__Impl"
    // InternalComponentDefinition.g:7656:1: rule__CORBA_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__CORBA_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7660:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:7661:1: ( 'description' )
            {
            // InternalComponentDefinition.g:7661:1: ( 'description' )
            // InternalComponentDefinition.g:7662:2: 'description'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group_2__0__Impl"


    // $ANTLR start "rule__CORBA_SmartSoft__Group_2__1"
    // InternalComponentDefinition.g:7671:1: rule__CORBA_SmartSoft__Group_2__1 : rule__CORBA_SmartSoft__Group_2__1__Impl ;
    public final void rule__CORBA_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7675:1: ( rule__CORBA_SmartSoft__Group_2__1__Impl )
            // InternalComponentDefinition.g:7676:2: rule__CORBA_SmartSoft__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group_2__1"


    // $ANTLR start "rule__CORBA_SmartSoft__Group_2__1__Impl"
    // InternalComponentDefinition.g:7682:1: rule__CORBA_SmartSoft__Group_2__1__Impl : ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__CORBA_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7686:1: ( ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:7687:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:7687:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:7688:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:7689:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:7689:3: rule__CORBA_SmartSoft__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__CORBA_SmartSoft__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__Group_2__1__Impl"


    // $ANTLR start "rule__DDS_SmartSoft__Group__0"
    // InternalComponentDefinition.g:7698:1: rule__DDS_SmartSoft__Group__0 : rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 ;
    public final void rule__DDS_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7702:1: ( rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 )
            // InternalComponentDefinition.g:7703:2: rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__DDS_SmartSoft__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__0"


    // $ANTLR start "rule__DDS_SmartSoft__Group__0__Impl"
    // InternalComponentDefinition.g:7710:1: rule__DDS_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__DDS_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7714:1: ( ( () ) )
            // InternalComponentDefinition.g:7715:1: ( () )
            {
            // InternalComponentDefinition.g:7715:1: ( () )
            // InternalComponentDefinition.g:7716:2: ()
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); 
            // InternalComponentDefinition.g:7717:2: ()
            // InternalComponentDefinition.g:7717:3: 
            {
            }

             after(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__0__Impl"


    // $ANTLR start "rule__DDS_SmartSoft__Group__1"
    // InternalComponentDefinition.g:7725:1: rule__DDS_SmartSoft__Group__1 : rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 ;
    public final void rule__DDS_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7729:1: ( rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 )
            // InternalComponentDefinition.g:7730:2: rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_53);
            rule__DDS_SmartSoft__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__1"


    // $ANTLR start "rule__DDS_SmartSoft__Group__1__Impl"
    // InternalComponentDefinition.g:7737:1: rule__DDS_SmartSoft__Group__1__Impl : ( 'DDS_SmartSoft' ) ;
    public final void rule__DDS_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7741:1: ( ( 'DDS_SmartSoft' ) )
            // InternalComponentDefinition.g:7742:1: ( 'DDS_SmartSoft' )
            {
            // InternalComponentDefinition.g:7742:1: ( 'DDS_SmartSoft' )
            // InternalComponentDefinition.g:7743:2: 'DDS_SmartSoft'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); 
            match(input,76,FOLLOW_2); 
             after(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__1__Impl"


    // $ANTLR start "rule__DDS_SmartSoft__Group__2"
    // InternalComponentDefinition.g:7752:1: rule__DDS_SmartSoft__Group__2 : rule__DDS_SmartSoft__Group__2__Impl ;
    public final void rule__DDS_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7756:1: ( rule__DDS_SmartSoft__Group__2__Impl )
            // InternalComponentDefinition.g:7757:2: rule__DDS_SmartSoft__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__2"


    // $ANTLR start "rule__DDS_SmartSoft__Group__2__Impl"
    // InternalComponentDefinition.g:7763:1: rule__DDS_SmartSoft__Group__2__Impl : ( ( rule__DDS_SmartSoft__Group_2__0 )? ) ;
    public final void rule__DDS_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7767:1: ( ( ( rule__DDS_SmartSoft__Group_2__0 )? ) )
            // InternalComponentDefinition.g:7768:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:7768:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            // InternalComponentDefinition.g:7769:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); 
            // InternalComponentDefinition.g:7770:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==73) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalComponentDefinition.g:7770:3: rule__DDS_SmartSoft__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DDS_SmartSoft__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group__2__Impl"


    // $ANTLR start "rule__DDS_SmartSoft__Group_2__0"
    // InternalComponentDefinition.g:7779:1: rule__DDS_SmartSoft__Group_2__0 : rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 ;
    public final void rule__DDS_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7783:1: ( rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 )
            // InternalComponentDefinition.g:7784:2: rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_10);
            rule__DDS_SmartSoft__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group_2__0"


    // $ANTLR start "rule__DDS_SmartSoft__Group_2__0__Impl"
    // InternalComponentDefinition.g:7791:1: rule__DDS_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__DDS_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7795:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:7796:1: ( 'description' )
            {
            // InternalComponentDefinition.g:7796:1: ( 'description' )
            // InternalComponentDefinition.g:7797:2: 'description'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group_2__0__Impl"


    // $ANTLR start "rule__DDS_SmartSoft__Group_2__1"
    // InternalComponentDefinition.g:7806:1: rule__DDS_SmartSoft__Group_2__1 : rule__DDS_SmartSoft__Group_2__1__Impl ;
    public final void rule__DDS_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7810:1: ( rule__DDS_SmartSoft__Group_2__1__Impl )
            // InternalComponentDefinition.g:7811:2: rule__DDS_SmartSoft__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group_2__1"


    // $ANTLR start "rule__DDS_SmartSoft__Group_2__1__Impl"
    // InternalComponentDefinition.g:7817:1: rule__DDS_SmartSoft__Group_2__1__Impl : ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__DDS_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7821:1: ( ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:7822:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:7822:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:7823:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:7824:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:7824:3: rule__DDS_SmartSoft__DescriptionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DDS_SmartSoft__DescriptionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__Group_2__1__Impl"


    // $ANTLR start "rule__InputLinkExtension__UnorderedGroup_4"
    // InternalComponentDefinition.g:7833:1: rule__InputLinkExtension__UnorderedGroup_4 : ( rule__InputLinkExtension__UnorderedGroup_4__0 )? ;
    public final void rule__InputLinkExtension__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
        	
        try {
            // InternalComponentDefinition.g:7838:1: ( ( rule__InputLinkExtension__UnorderedGroup_4__0 )? )
            // InternalComponentDefinition.g:7839:2: ( rule__InputLinkExtension__UnorderedGroup_4__0 )?
            {
            // InternalComponentDefinition.g:7839:2: ( rule__InputLinkExtension__UnorderedGroup_4__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( LA66_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt66=1;
            }
            else if ( LA66_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt66=1;
            }
            else if ( LA66_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalComponentDefinition.g:7839:2: rule__InputLinkExtension__UnorderedGroup_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputLinkExtension__UnorderedGroup_4__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__UnorderedGroup_4"


    // $ANTLR start "rule__InputLinkExtension__UnorderedGroup_4__Impl"
    // InternalComponentDefinition.g:7847:1: rule__InputLinkExtension__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) ) ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDefinition.g:7852:1: ( ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) ) )
            // InternalComponentDefinition.g:7853:3: ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) )
            {
            // InternalComponentDefinition.g:7853:3: ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) )
            int alt67=3;
            int LA67_0 = input.LA(1);

            if ( LA67_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt67=1;
            }
            else if ( LA67_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt67=2;
            }
            else if ( LA67_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt67=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalComponentDefinition.g:7854:3: ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7854:3: ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) )
                    // InternalComponentDefinition.g:7855:4: {...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__InputLinkExtension__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalComponentDefinition.g:7855:114: ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) )
                    // InternalComponentDefinition.g:7856:5: ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7862:5: ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) )
                    // InternalComponentDefinition.g:7863:6: ( rule__InputLinkExtension__OptionalAssignment_4_0 )
                    {
                     before(grammarAccess.getInputLinkExtensionAccess().getOptionalAssignment_4_0()); 
                    // InternalComponentDefinition.g:7864:6: ( rule__InputLinkExtension__OptionalAssignment_4_0 )
                    // InternalComponentDefinition.g:7864:7: rule__InputLinkExtension__OptionalAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputLinkExtension__OptionalAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputLinkExtensionAccess().getOptionalAssignment_4_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:7869:3: ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7869:3: ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) )
                    // InternalComponentDefinition.g:7870:4: {...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__InputLinkExtension__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalComponentDefinition.g:7870:114: ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) )
                    // InternalComponentDefinition.g:7871:5: ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7877:5: ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) )
                    // InternalComponentDefinition.g:7878:6: ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 )
                    {
                     before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkAssignment_4_1()); 
                    // InternalComponentDefinition.g:7879:6: ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 )
                    // InternalComponentDefinition.g:7879:7: rule__InputLinkExtension__OversamplingOkAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputLinkExtension__OversamplingOkAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkAssignment_4_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:7884:3: ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7884:3: ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) )
                    // InternalComponentDefinition.g:7885:4: {...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__InputLinkExtension__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalComponentDefinition.g:7885:114: ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) )
                    // InternalComponentDefinition.g:7886:5: ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7892:5: ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) )
                    // InternalComponentDefinition.g:7893:6: ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 )
                    {
                     before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkAssignment_4_2()); 
                    // InternalComponentDefinition.g:7894:6: ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 )
                    // InternalComponentDefinition.g:7894:7: rule__InputLinkExtension__UndersamplingOkAssignment_4_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputLinkExtension__UndersamplingOkAssignment_4_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkAssignment_4_2()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__UnorderedGroup_4__Impl"


    // $ANTLR start "rule__InputLinkExtension__UnorderedGroup_4__0"
    // InternalComponentDefinition.g:7907:1: rule__InputLinkExtension__UnorderedGroup_4__0 : rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__1 )? ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7911:1: ( rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__1 )? )
            // InternalComponentDefinition.g:7912:2: rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_56);
            rule__InputLinkExtension__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:7913:2: ( rule__InputLinkExtension__UnorderedGroup_4__1 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( LA68_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt68=1;
            }
            else if ( LA68_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt68=1;
            }
            else if ( LA68_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalComponentDefinition.g:7913:2: rule__InputLinkExtension__UnorderedGroup_4__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputLinkExtension__UnorderedGroup_4__1();

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
    // $ANTLR end "rule__InputLinkExtension__UnorderedGroup_4__0"


    // $ANTLR start "rule__InputLinkExtension__UnorderedGroup_4__1"
    // InternalComponentDefinition.g:7919:1: rule__InputLinkExtension__UnorderedGroup_4__1 : rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__2 )? ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7923:1: ( rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__2 )? )
            // InternalComponentDefinition.g:7924:2: rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_56);
            rule__InputLinkExtension__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:7925:2: ( rule__InputLinkExtension__UnorderedGroup_4__2 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( LA69_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt69=1;
            }
            else if ( LA69_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt69=1;
            }
            else if ( LA69_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalComponentDefinition.g:7925:2: rule__InputLinkExtension__UnorderedGroup_4__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputLinkExtension__UnorderedGroup_4__2();

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
    // $ANTLR end "rule__InputLinkExtension__UnorderedGroup_4__1"


    // $ANTLR start "rule__InputLinkExtension__UnorderedGroup_4__2"
    // InternalComponentDefinition.g:7931:1: rule__InputLinkExtension__UnorderedGroup_4__2 : rule__InputLinkExtension__UnorderedGroup_4__Impl ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7935:1: ( rule__InputLinkExtension__UnorderedGroup_4__Impl )
            // InternalComponentDefinition.g:7936:2: rule__InputLinkExtension__UnorderedGroup_4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputLinkExtension__UnorderedGroup_4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__UnorderedGroup_4__2"


    // $ANTLR start "rule__ActivationConstraints__UnorderedGroup_7"
    // InternalComponentDefinition.g:7943:1: rule__ActivationConstraints__UnorderedGroup_7 : ( rule__ActivationConstraints__UnorderedGroup_7__0 )? ;
    public final void rule__ActivationConstraints__UnorderedGroup_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
        	
        try {
            // InternalComponentDefinition.g:7948:1: ( ( rule__ActivationConstraints__UnorderedGroup_7__0 )? )
            // InternalComponentDefinition.g:7949:2: ( rule__ActivationConstraints__UnorderedGroup_7__0 )?
            {
            // InternalComponentDefinition.g:7949:2: ( rule__ActivationConstraints__UnorderedGroup_7__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( LA70_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                alt70=1;
            }
            else if ( LA70_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalComponentDefinition.g:7949:2: rule__ActivationConstraints__UnorderedGroup_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivationConstraints__UnorderedGroup_7__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__UnorderedGroup_7"


    // $ANTLR start "rule__ActivationConstraints__UnorderedGroup_7__Impl"
    // InternalComponentDefinition.g:7957:1: rule__ActivationConstraints__UnorderedGroup_7__Impl : ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) ) ;
    public final void rule__ActivationConstraints__UnorderedGroup_7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDefinition.g:7962:1: ( ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) ) )
            // InternalComponentDefinition.g:7963:3: ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) )
            {
            // InternalComponentDefinition.g:7963:3: ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( LA71_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                alt71=1;
            }
            else if ( LA71_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalComponentDefinition.g:7964:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7964:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) )
                    // InternalComponentDefinition.g:7965:4: {...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ActivationConstraints__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0)");
                    }
                    // InternalComponentDefinition.g:7965:117: ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) )
                    // InternalComponentDefinition.g:7966:5: ( ( rule__ActivationConstraints__Group_7_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7972:5: ( ( rule__ActivationConstraints__Group_7_0__0 ) )
                    // InternalComponentDefinition.g:7973:6: ( rule__ActivationConstraints__Group_7_0__0 )
                    {
                     before(grammarAccess.getActivationConstraintsAccess().getGroup_7_0()); 
                    // InternalComponentDefinition.g:7974:6: ( rule__ActivationConstraints__Group_7_0__0 )
                    // InternalComponentDefinition.g:7974:7: rule__ActivationConstraints__Group_7_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivationConstraints__Group_7_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivationConstraintsAccess().getGroup_7_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:7979:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7979:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) )
                    // InternalComponentDefinition.g:7980:4: {...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ActivationConstraints__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1)");
                    }
                    // InternalComponentDefinition.g:7980:117: ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) )
                    // InternalComponentDefinition.g:7981:5: ( ( rule__ActivationConstraints__Group_7_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7987:5: ( ( rule__ActivationConstraints__Group_7_1__0 ) )
                    // InternalComponentDefinition.g:7988:6: ( rule__ActivationConstraints__Group_7_1__0 )
                    {
                     before(grammarAccess.getActivationConstraintsAccess().getGroup_7_1()); 
                    // InternalComponentDefinition.g:7989:6: ( rule__ActivationConstraints__Group_7_1__0 )
                    // InternalComponentDefinition.g:7989:7: rule__ActivationConstraints__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivationConstraints__Group_7_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActivationConstraintsAccess().getGroup_7_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__UnorderedGroup_7__Impl"


    // $ANTLR start "rule__ActivationConstraints__UnorderedGroup_7__0"
    // InternalComponentDefinition.g:8002:1: rule__ActivationConstraints__UnorderedGroup_7__0 : rule__ActivationConstraints__UnorderedGroup_7__Impl ( rule__ActivationConstraints__UnorderedGroup_7__1 )? ;
    public final void rule__ActivationConstraints__UnorderedGroup_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8006:1: ( rule__ActivationConstraints__UnorderedGroup_7__Impl ( rule__ActivationConstraints__UnorderedGroup_7__1 )? )
            // InternalComponentDefinition.g:8007:2: rule__ActivationConstraints__UnorderedGroup_7__Impl ( rule__ActivationConstraints__UnorderedGroup_7__1 )?
            {
            pushFollow(FOLLOW_57);
            rule__ActivationConstraints__UnorderedGroup_7__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:8008:2: ( rule__ActivationConstraints__UnorderedGroup_7__1 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( LA72_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                alt72=1;
            }
            else if ( LA72_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalComponentDefinition.g:8008:2: rule__ActivationConstraints__UnorderedGroup_7__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ActivationConstraints__UnorderedGroup_7__1();

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
    // $ANTLR end "rule__ActivationConstraints__UnorderedGroup_7__0"


    // $ANTLR start "rule__ActivationConstraints__UnorderedGroup_7__1"
    // InternalComponentDefinition.g:8014:1: rule__ActivationConstraints__UnorderedGroup_7__1 : rule__ActivationConstraints__UnorderedGroup_7__Impl ;
    public final void rule__ActivationConstraints__UnorderedGroup_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8018:1: ( rule__ActivationConstraints__UnorderedGroup_7__Impl )
            // InternalComponentDefinition.g:8019:2: rule__ActivationConstraints__UnorderedGroup_7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivationConstraints__UnorderedGroup_7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__UnorderedGroup_7__1"


    // $ANTLR start "rule__OpcUaDeviceClient__UnorderedGroup_2"
    // InternalComponentDefinition.g:8026:1: rule__OpcUaDeviceClient__UnorderedGroup_2 : rule__OpcUaDeviceClient__UnorderedGroup_2__0 {...}?;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
        	
        try {
            // InternalComponentDefinition.g:8031:1: ( rule__OpcUaDeviceClient__UnorderedGroup_2__0 {...}?)
            // InternalComponentDefinition.g:8032:2: rule__OpcUaDeviceClient__UnorderedGroup_2__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__UnorderedGroup_2__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "rule__OpcUaDeviceClient__UnorderedGroup_2", "getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__UnorderedGroup_2"


    // $ANTLR start "rule__OpcUaDeviceClient__UnorderedGroup_2__Impl"
    // InternalComponentDefinition.g:8040:1: rule__OpcUaDeviceClient__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDefinition.g:8045:1: ( ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) ) ) )
            // InternalComponentDefinition.g:8046:3: ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) ) )
            {
            // InternalComponentDefinition.g:8046:3: ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( LA73_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0) ) {
                alt73=1;
            }
            else if ( LA73_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalComponentDefinition.g:8047:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:8047:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) )
                    // InternalComponentDefinition.g:8048:4: {...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__OpcUaDeviceClient__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalComponentDefinition.g:8048:113: ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) )
                    // InternalComponentDefinition.g:8049:5: ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:8055:5: ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) )
                    // InternalComponentDefinition.g:8056:6: ( rule__OpcUaDeviceClient__Group_2_0__0 )
                    {
                     before(grammarAccess.getOpcUaDeviceClientAccess().getGroup_2_0()); 
                    // InternalComponentDefinition.g:8057:6: ( rule__OpcUaDeviceClient__Group_2_0__0 )
                    // InternalComponentDefinition.g:8057:7: rule__OpcUaDeviceClient__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaDeviceClient__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpcUaDeviceClientAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:8062:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:8062:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) )
                    // InternalComponentDefinition.g:8063:4: {...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__OpcUaDeviceClient__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalComponentDefinition.g:8063:113: ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) )
                    // InternalComponentDefinition.g:8064:5: ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:8070:5: ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) )
                    // InternalComponentDefinition.g:8071:6: ( rule__OpcUaDeviceClient__Group_2_1__0 )
                    {
                     before(grammarAccess.getOpcUaDeviceClientAccess().getGroup_2_1()); 
                    // InternalComponentDefinition.g:8072:6: ( rule__OpcUaDeviceClient__Group_2_1__0 )
                    // InternalComponentDefinition.g:8072:7: rule__OpcUaDeviceClient__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaDeviceClient__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpcUaDeviceClientAccess().getGroup_2_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__UnorderedGroup_2__0"
    // InternalComponentDefinition.g:8085:1: rule__OpcUaDeviceClient__UnorderedGroup_2__0 : rule__OpcUaDeviceClient__UnorderedGroup_2__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_2__1 )? ;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8089:1: ( rule__OpcUaDeviceClient__UnorderedGroup_2__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_2__1 )? )
            // InternalComponentDefinition.g:8090:2: rule__OpcUaDeviceClient__UnorderedGroup_2__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_58);
            rule__OpcUaDeviceClient__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:8091:2: ( rule__OpcUaDeviceClient__UnorderedGroup_2__1 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( LA74_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0) ) {
                alt74=1;
            }
            else if ( LA74_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalComponentDefinition.g:8091:2: rule__OpcUaDeviceClient__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaDeviceClient__UnorderedGroup_2__1();

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
    // $ANTLR end "rule__OpcUaDeviceClient__UnorderedGroup_2__0"


    // $ANTLR start "rule__OpcUaDeviceClient__UnorderedGroup_2__1"
    // InternalComponentDefinition.g:8097:1: rule__OpcUaDeviceClient__UnorderedGroup_2__1 : rule__OpcUaDeviceClient__UnorderedGroup_2__Impl ;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8101:1: ( rule__OpcUaDeviceClient__UnorderedGroup_2__Impl )
            // InternalComponentDefinition.g:8102:2: rule__OpcUaDeviceClient__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__UnorderedGroup_2__1"


    // $ANTLR start "rule__ComponentDefModel__ImportsAssignment_1"
    // InternalComponentDefinition.g:8109:1: rule__ComponentDefModel__ImportsAssignment_1 : ( ruleServiceRepoImport ) ;
    public final void rule__ComponentDefModel__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8113:1: ( ( ruleServiceRepoImport ) )
            // InternalComponentDefinition.g:8114:2: ( ruleServiceRepoImport )
            {
            // InternalComponentDefinition.g:8114:2: ( ruleServiceRepoImport )
            // InternalComponentDefinition.g:8115:3: ruleServiceRepoImport
            {
             before(grammarAccess.getComponentDefModelAccess().getImportsServiceRepoImportParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceRepoImport();

            state._fsp--;

             after(grammarAccess.getComponentDefModelAccess().getImportsServiceRepoImportParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefModel__ImportsAssignment_1"


    // $ANTLR start "rule__ComponentDefModel__ComponentAssignment_2"
    // InternalComponentDefinition.g:8124:1: rule__ComponentDefModel__ComponentAssignment_2 : ( ruleComponentDefinition ) ;
    public final void rule__ComponentDefModel__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8128:1: ( ( ruleComponentDefinition ) )
            // InternalComponentDefinition.g:8129:2: ( ruleComponentDefinition )
            {
            // InternalComponentDefinition.g:8129:2: ( ruleComponentDefinition )
            // InternalComponentDefinition.g:8130:3: ruleComponentDefinition
            {
             before(grammarAccess.getComponentDefModelAccess().getComponentComponentDefinitionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentDefinition();

            state._fsp--;

             after(grammarAccess.getComponentDefModelAccess().getComponentComponentDefinitionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefModel__ComponentAssignment_2"


    // $ANTLR start "rule__ServiceRepoImport__ImportedNamespaceAssignment_1"
    // InternalComponentDefinition.g:8139:1: rule__ServiceRepoImport__ImportedNamespaceAssignment_1 : ( ruleFQNW ) ;
    public final void rule__ServiceRepoImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8143:1: ( ( ruleFQNW ) )
            // InternalComponentDefinition.g:8144:2: ( ruleFQNW )
            {
            // InternalComponentDefinition.g:8144:2: ( ruleFQNW )
            // InternalComponentDefinition.g:8145:3: ruleFQNW
            {
             before(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFQNW();

            state._fsp--;

             after(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceFQNWParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceRepoImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__ComponentDefinition__NameAssignment_1"
    // InternalComponentDefinition.g:8154:1: rule__ComponentDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8158:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8159:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8159:2: ( RULE_ID )
            // InternalComponentDefinition.g:8160:3: RULE_ID
            {
             before(grammarAccess.getComponentDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__NameAssignment_1"


    // $ANTLR start "rule__ComponentDefinition__LogoAssignment_2_1"
    // InternalComponentDefinition.g:8169:1: rule__ComponentDefinition__LogoAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ComponentDefinition__LogoAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8173:1: ( ( RULE_STRING ) )
            // InternalComponentDefinition.g:8174:2: ( RULE_STRING )
            {
            // InternalComponentDefinition.g:8174:2: ( RULE_STRING )
            // InternalComponentDefinition.g:8175:3: RULE_STRING
            {
             before(grammarAccess.getComponentDefinitionAccess().getLogoSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getLogoSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__LogoAssignment_2_1"


    // $ANTLR start "rule__ComponentDefinition__ElementsAssignment_4"
    // InternalComponentDefinition.g:8184:1: rule__ComponentDefinition__ElementsAssignment_4 : ( ruleAbstractComponentElement ) ;
    public final void rule__ComponentDefinition__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8188:1: ( ( ruleAbstractComponentElement ) )
            // InternalComponentDefinition.g:8189:2: ( ruleAbstractComponentElement )
            {
            // InternalComponentDefinition.g:8189:2: ( ruleAbstractComponentElement )
            // InternalComponentDefinition.g:8190:3: ruleAbstractComponentElement
            {
             before(grammarAccess.getComponentDefinitionAccess().getElementsAbstractComponentElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractComponentElement();

            state._fsp--;

             after(grammarAccess.getComponentDefinitionAccess().getElementsAbstractComponentElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__ElementsAssignment_4"


    // $ANTLR start "rule__RequestPort__NameAssignment_1"
    // InternalComponentDefinition.g:8199:1: rule__RequestPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RequestPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8203:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8204:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8204:2: ( RULE_ID )
            // InternalComponentDefinition.g:8205:3: RULE_ID
            {
             before(grammarAccess.getRequestPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequestPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__NameAssignment_1"


    // $ANTLR start "rule__RequestPort__ServiceAssignment_3"
    // InternalComponentDefinition.g:8214:1: rule__RequestPort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__RequestPort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8218:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8219:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8219:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8220:3: ( ruleFQN )
            {
             before(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0()); 
            // InternalComponentDefinition.g:8221:3: ( ruleFQN )
            // InternalComponentDefinition.g:8222:4: ruleFQN
            {
             before(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__ServiceAssignment_3"


    // $ANTLR start "rule__RequestPort__ExtensionsAssignment_5"
    // InternalComponentDefinition.g:8233:1: rule__RequestPort__ExtensionsAssignment_5 : ( ruleComponentPortExtension ) ;
    public final void rule__RequestPort__ExtensionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8237:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:8238:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:8238:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:8239:3: ruleComponentPortExtension
            {
             before(grammarAccess.getRequestPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentPortExtension();

            state._fsp--;

             after(grammarAccess.getRequestPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__ExtensionsAssignment_5"


    // $ANTLR start "rule__OutputPort__NameAssignment_1"
    // InternalComponentDefinition.g:8248:1: rule__OutputPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OutputPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8252:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8253:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8253:2: ( RULE_ID )
            // InternalComponentDefinition.g:8254:3: RULE_ID
            {
             before(grammarAccess.getOutputPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__NameAssignment_1"


    // $ANTLR start "rule__OutputPort__ServiceAssignment_3"
    // InternalComponentDefinition.g:8263:1: rule__OutputPort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__OutputPort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8267:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8268:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8268:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8269:3: ( ruleFQN )
            {
             before(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0()); 
            // InternalComponentDefinition.g:8270:3: ( ruleFQN )
            // InternalComponentDefinition.g:8271:4: ruleFQN
            {
             before(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__ServiceAssignment_3"


    // $ANTLR start "rule__OutputPort__ActivityAssignment_5"
    // InternalComponentDefinition.g:8282:1: rule__OutputPort__ActivityAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__OutputPort__ActivityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8286:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8287:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8287:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8288:3: ( ruleFQN )
            {
             before(grammarAccess.getOutputPortAccess().getActivityActivityCrossReference_5_0()); 
            // InternalComponentDefinition.g:8289:3: ( ruleFQN )
            // InternalComponentDefinition.g:8290:4: ruleFQN
            {
             before(grammarAccess.getOutputPortAccess().getActivityActivityFQNParserRuleCall_5_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getActivityActivityFQNParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getOutputPortAccess().getActivityActivityCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__ActivityAssignment_5"


    // $ANTLR start "rule__OutputPort__ExtensionsAssignment_7"
    // InternalComponentDefinition.g:8301:1: rule__OutputPort__ExtensionsAssignment_7 : ( ruleComponentPortExtension ) ;
    public final void rule__OutputPort__ExtensionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8305:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:8306:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:8306:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:8307:3: ruleComponentPortExtension
            {
             before(grammarAccess.getOutputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentPortExtension();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__ExtensionsAssignment_7"


    // $ANTLR start "rule__AnswerPort__NameAssignment_1"
    // InternalComponentDefinition.g:8316:1: rule__AnswerPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AnswerPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8320:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8321:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8321:2: ( RULE_ID )
            // InternalComponentDefinition.g:8322:3: RULE_ID
            {
             before(grammarAccess.getAnswerPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnswerPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__NameAssignment_1"


    // $ANTLR start "rule__AnswerPort__ServiceAssignment_3"
    // InternalComponentDefinition.g:8331:1: rule__AnswerPort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__AnswerPort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8335:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8336:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8336:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8337:3: ( ruleFQN )
            {
             before(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0()); 
            // InternalComponentDefinition.g:8338:3: ( ruleFQN )
            // InternalComponentDefinition.g:8339:4: ruleFQN
            {
             before(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__ServiceAssignment_3"


    // $ANTLR start "rule__AnswerPort__ExtensionsAssignment_5"
    // InternalComponentDefinition.g:8350:1: rule__AnswerPort__ExtensionsAssignment_5 : ( ruleComponentPortExtension ) ;
    public final void rule__AnswerPort__ExtensionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8354:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:8355:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:8355:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:8356:3: ruleComponentPortExtension
            {
             before(grammarAccess.getAnswerPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentPortExtension();

            state._fsp--;

             after(grammarAccess.getAnswerPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__ExtensionsAssignment_5"


    // $ANTLR start "rule__InputPort__NameAssignment_1"
    // InternalComponentDefinition.g:8365:1: rule__InputPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InputPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8369:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8370:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8370:2: ( RULE_ID )
            // InternalComponentDefinition.g:8371:3: RULE_ID
            {
             before(grammarAccess.getInputPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__NameAssignment_1"


    // $ANTLR start "rule__InputPort__ServiceAssignment_3"
    // InternalComponentDefinition.g:8380:1: rule__InputPort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__InputPort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8384:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8385:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8385:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8386:3: ( ruleFQN )
            {
             before(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0()); 
            // InternalComponentDefinition.g:8387:3: ( ruleFQN )
            // InternalComponentDefinition.g:8388:4: ruleFQN
            {
             before(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__ServiceAssignment_3"


    // $ANTLR start "rule__InputPort__ExtensionsAssignment_5"
    // InternalComponentDefinition.g:8399:1: rule__InputPort__ExtensionsAssignment_5 : ( ruleComponentPortExtension ) ;
    public final void rule__InputPort__ExtensionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8403:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:8404:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:8404:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:8405:3: ruleComponentPortExtension
            {
             before(grammarAccess.getInputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentPortExtension();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__ExtensionsAssignment_5"


    // $ANTLR start "rule__SupportedMiddleware__DefaultAssignment_1"
    // InternalComponentDefinition.g:8414:1: rule__SupportedMiddleware__DefaultAssignment_1 : ( ( 'default' ) ) ;
    public final void rule__SupportedMiddleware__DefaultAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8418:1: ( ( ( 'default' ) ) )
            // InternalComponentDefinition.g:8419:2: ( ( 'default' ) )
            {
            // InternalComponentDefinition.g:8419:2: ( ( 'default' ) )
            // InternalComponentDefinition.g:8420:3: ( 'default' )
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); 
            // InternalComponentDefinition.g:8421:3: ( 'default' )
            // InternalComponentDefinition.g:8422:4: 'default'
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); 

            }

             after(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedMiddleware__DefaultAssignment_1"


    // $ANTLR start "rule__SupportedMiddleware__MiddlewareAssignment_2"
    // InternalComponentDefinition.g:8433:1: rule__SupportedMiddleware__MiddlewareAssignment_2 : ( ruleRoboticMiddleware ) ;
    public final void rule__SupportedMiddleware__MiddlewareAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8437:1: ( ( ruleRoboticMiddleware ) )
            // InternalComponentDefinition.g:8438:2: ( ruleRoboticMiddleware )
            {
            // InternalComponentDefinition.g:8438:2: ( ruleRoboticMiddleware )
            // InternalComponentDefinition.g:8439:3: ruleRoboticMiddleware
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleRoboticMiddleware();

            state._fsp--;

             after(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SupportedMiddleware__MiddlewareAssignment_2"


    // $ANTLR start "rule__Activity__NameAssignment_1"
    // InternalComponentDefinition.g:8448:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8452:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8453:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8453:2: ( RULE_ID )
            // InternalComponentDefinition.g:8454:3: RULE_ID
            {
             before(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getActivityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__NameAssignment_1"


    // $ANTLR start "rule__Activity__LinksAssignment_3"
    // InternalComponentDefinition.g:8463:1: rule__Activity__LinksAssignment_3 : ( ruleAbstractComponentLink ) ;
    public final void rule__Activity__LinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8467:1: ( ( ruleAbstractComponentLink ) )
            // InternalComponentDefinition.g:8468:2: ( ruleAbstractComponentLink )
            {
            // InternalComponentDefinition.g:8468:2: ( ruleAbstractComponentLink )
            // InternalComponentDefinition.g:8469:3: ruleAbstractComponentLink
            {
             before(grammarAccess.getActivityAccess().getLinksAbstractComponentLinkParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractComponentLink();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getLinksAbstractComponentLinkParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__LinksAssignment_3"


    // $ANTLR start "rule__Activity__ExtensionsAssignment_4"
    // InternalComponentDefinition.g:8478:1: rule__Activity__ExtensionsAssignment_4 : ( ruleActivityExtension ) ;
    public final void rule__Activity__ExtensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8482:1: ( ( ruleActivityExtension ) )
            // InternalComponentDefinition.g:8483:2: ( ruleActivityExtension )
            {
            // InternalComponentDefinition.g:8483:2: ( ruleActivityExtension )
            // InternalComponentDefinition.g:8484:3: ruleActivityExtension
            {
             before(grammarAccess.getActivityAccess().getExtensionsActivityExtensionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleActivityExtension();

            state._fsp--;

             after(grammarAccess.getActivityAccess().getExtensionsActivityExtensionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Activity__ExtensionsAssignment_4"


    // $ANTLR start "rule__InputHandler__NameAssignment_1"
    // InternalComponentDefinition.g:8493:1: rule__InputHandler__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InputHandler__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8497:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8498:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8498:2: ( RULE_ID )
            // InternalComponentDefinition.g:8499:3: RULE_ID
            {
             before(grammarAccess.getInputHandlerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputHandlerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__NameAssignment_1"


    // $ANTLR start "rule__InputHandler__InputPortAssignment_3"
    // InternalComponentDefinition.g:8508:1: rule__InputHandler__InputPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__InputHandler__InputPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8512:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8513:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8513:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8514:3: ( ruleFQN )
            {
             before(grammarAccess.getInputHandlerAccess().getInputPortInputPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:8515:3: ( ruleFQN )
            // InternalComponentDefinition.g:8516:4: ruleFQN
            {
             before(grammarAccess.getInputHandlerAccess().getInputPortInputPortFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getInputHandlerAccess().getInputPortInputPortFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInputHandlerAccess().getInputPortInputPortCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__InputPortAssignment_3"


    // $ANTLR start "rule__InputHandler__ActiveQueueAssignment_4"
    // InternalComponentDefinition.g:8527:1: rule__InputHandler__ActiveQueueAssignment_4 : ( ( 'activeQueue' ) ) ;
    public final void rule__InputHandler__ActiveQueueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8531:1: ( ( ( 'activeQueue' ) ) )
            // InternalComponentDefinition.g:8532:2: ( ( 'activeQueue' ) )
            {
            // InternalComponentDefinition.g:8532:2: ( ( 'activeQueue' ) )
            // InternalComponentDefinition.g:8533:3: ( 'activeQueue' )
            {
             before(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            // InternalComponentDefinition.g:8534:3: ( 'activeQueue' )
            // InternalComponentDefinition.g:8535:4: 'activeQueue'
            {
             before(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 

            }

             after(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__ActiveQueueAssignment_4"


    // $ANTLR start "rule__InputHandler__LinksAssignment_6"
    // InternalComponentDefinition.g:8546:1: rule__InputHandler__LinksAssignment_6 : ( ruleAbstractComponentLink ) ;
    public final void rule__InputHandler__LinksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8550:1: ( ( ruleAbstractComponentLink ) )
            // InternalComponentDefinition.g:8551:2: ( ruleAbstractComponentLink )
            {
            // InternalComponentDefinition.g:8551:2: ( ruleAbstractComponentLink )
            // InternalComponentDefinition.g:8552:3: ruleAbstractComponentLink
            {
             before(grammarAccess.getInputHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractComponentLink();

            state._fsp--;

             after(grammarAccess.getInputHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandler__LinksAssignment_6"


    // $ANTLR start "rule__RequestHandler__NameAssignment_1"
    // InternalComponentDefinition.g:8561:1: rule__RequestHandler__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RequestHandler__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8565:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8566:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8566:2: ( RULE_ID )
            // InternalComponentDefinition.g:8567:3: RULE_ID
            {
             before(grammarAccess.getRequestHandlerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequestHandlerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__NameAssignment_1"


    // $ANTLR start "rule__RequestHandler__AnswerPortAssignment_3"
    // InternalComponentDefinition.g:8576:1: rule__RequestHandler__AnswerPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__RequestHandler__AnswerPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8580:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8581:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8581:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8582:3: ( ruleFQN )
            {
             before(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:8583:3: ( ruleFQN )
            // InternalComponentDefinition.g:8584:4: ruleFQN
            {
             before(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__AnswerPortAssignment_3"


    // $ANTLR start "rule__RequestHandler__ActiveQueueAssignment_4"
    // InternalComponentDefinition.g:8595:1: rule__RequestHandler__ActiveQueueAssignment_4 : ( ( 'activeQueue' ) ) ;
    public final void rule__RequestHandler__ActiveQueueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8599:1: ( ( ( 'activeQueue' ) ) )
            // InternalComponentDefinition.g:8600:2: ( ( 'activeQueue' ) )
            {
            // InternalComponentDefinition.g:8600:2: ( ( 'activeQueue' ) )
            // InternalComponentDefinition.g:8601:3: ( 'activeQueue' )
            {
             before(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            // InternalComponentDefinition.g:8602:3: ( 'activeQueue' )
            // InternalComponentDefinition.g:8603:4: 'activeQueue'
            {
             before(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            match(input,78,FOLLOW_2); 
             after(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 

            }

             after(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__ActiveQueueAssignment_4"


    // $ANTLR start "rule__RequestHandler__LinksAssignment_6"
    // InternalComponentDefinition.g:8614:1: rule__RequestHandler__LinksAssignment_6 : ( ruleAbstractComponentLink ) ;
    public final void rule__RequestHandler__LinksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8618:1: ( ( ruleAbstractComponentLink ) )
            // InternalComponentDefinition.g:8619:2: ( ruleAbstractComponentLink )
            {
            // InternalComponentDefinition.g:8619:2: ( ruleAbstractComponentLink )
            // InternalComponentDefinition.g:8620:3: ruleAbstractComponentLink
            {
             before(grammarAccess.getRequestHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractComponentLink();

            state._fsp--;

             after(grammarAccess.getRequestHandlerAccess().getLinksAbstractComponentLinkParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestHandler__LinksAssignment_6"


    // $ANTLR start "rule__RequestPortLink__RequestPortAssignment_1"
    // InternalComponentDefinition.g:8629:1: rule__RequestPortLink__RequestPortAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__RequestPortLink__RequestPortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8633:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8634:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8634:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8635:3: ( ruleFQN )
            {
             before(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortCrossReference_1_0()); 
            // InternalComponentDefinition.g:8636:3: ( ruleFQN )
            // InternalComponentDefinition.g:8637:4: ruleFQN
            {
             before(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPortLink__RequestPortAssignment_1"


    // $ANTLR start "rule__OpcUaClientLink__ClientAssignment_1"
    // InternalComponentDefinition.g:8648:1: rule__OpcUaClientLink__ClientAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__OpcUaClientLink__ClientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8652:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8653:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8653:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8654:3: ( ruleFQN )
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientCrossReference_1_0()); 
            // InternalComponentDefinition.g:8655:3: ( ruleFQN )
            // InternalComponentDefinition.g:8656:4: ruleFQN
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaClientLink__ClientAssignment_1"


    // $ANTLR start "rule__MixedPortROSLink__MixedportrosAssignment_1"
    // InternalComponentDefinition.g:8667:1: rule__MixedPortROSLink__MixedportrosAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__MixedPortROSLink__MixedportrosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8671:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8672:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8672:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8673:3: ( ruleFQN )
            {
             before(grammarAccess.getMixedPortROSLinkAccess().getMixedportrosMixedPortROSCrossReference_1_0()); 
            // InternalComponentDefinition.g:8674:3: ( ruleFQN )
            // InternalComponentDefinition.g:8675:4: ruleFQN
            {
             before(grammarAccess.getMixedPortROSLinkAccess().getMixedportrosMixedPortROSFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getMixedPortROSLinkAccess().getMixedportrosMixedPortROSFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMixedPortROSLinkAccess().getMixedportrosMixedPortROSCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROSLink__MixedportrosAssignment_1"


    // $ANTLR start "rule__ComponentSubNodeObserver__SubjectAssignment_1"
    // InternalComponentDefinition.g:8686:1: rule__ComponentSubNodeObserver__SubjectAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentSubNodeObserver__SubjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8690:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8691:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8691:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8692:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeCrossReference_1_0()); 
            // InternalComponentDefinition.g:8693:3: ( ruleFQN )
            // InternalComponentDefinition.g:8694:4: ruleFQN
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentSubNodeObserver__SubjectAssignment_1"


    // $ANTLR start "rule__InputLinkExtension__InputPortAssignment_2"
    // InternalComponentDefinition.g:8705:1: rule__InputLinkExtension__InputPortAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__InputLinkExtension__InputPortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8709:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8710:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8710:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8711:3: ( ruleFQN )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortCrossReference_2_0()); 
            // InternalComponentDefinition.g:8712:3: ( ruleFQN )
            // InternalComponentDefinition.g:8713:4: ruleFQN
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__InputPortAssignment_2"


    // $ANTLR start "rule__InputLinkExtension__OptionalAssignment_4_0"
    // InternalComponentDefinition.g:8724:1: rule__InputLinkExtension__OptionalAssignment_4_0 : ( ( 'optional' ) ) ;
    public final void rule__InputLinkExtension__OptionalAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8728:1: ( ( ( 'optional' ) ) )
            // InternalComponentDefinition.g:8729:2: ( ( 'optional' ) )
            {
            // InternalComponentDefinition.g:8729:2: ( ( 'optional' ) )
            // InternalComponentDefinition.g:8730:3: ( 'optional' )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); 
            // InternalComponentDefinition.g:8731:3: ( 'optional' )
            // InternalComponentDefinition.g:8732:4: 'optional'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); 
            match(input,79,FOLLOW_2); 
             after(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); 

            }

             after(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__OptionalAssignment_4_0"


    // $ANTLR start "rule__InputLinkExtension__OversamplingOkAssignment_4_1"
    // InternalComponentDefinition.g:8743:1: rule__InputLinkExtension__OversamplingOkAssignment_4_1 : ( ( 'oversamplingOk' ) ) ;
    public final void rule__InputLinkExtension__OversamplingOkAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8747:1: ( ( ( 'oversamplingOk' ) ) )
            // InternalComponentDefinition.g:8748:2: ( ( 'oversamplingOk' ) )
            {
            // InternalComponentDefinition.g:8748:2: ( ( 'oversamplingOk' ) )
            // InternalComponentDefinition.g:8749:3: ( 'oversamplingOk' )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); 
            // InternalComponentDefinition.g:8750:3: ( 'oversamplingOk' )
            // InternalComponentDefinition.g:8751:4: 'oversamplingOk'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); 
            match(input,80,FOLLOW_2); 
             after(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); 

            }

             after(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__OversamplingOkAssignment_4_1"


    // $ANTLR start "rule__InputLinkExtension__UndersamplingOkAssignment_4_2"
    // InternalComponentDefinition.g:8762:1: rule__InputLinkExtension__UndersamplingOkAssignment_4_2 : ( ( 'undersamplingOk' ) ) ;
    public final void rule__InputLinkExtension__UndersamplingOkAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8766:1: ( ( ( 'undersamplingOk' ) ) )
            // InternalComponentDefinition.g:8767:2: ( ( 'undersamplingOk' ) )
            {
            // InternalComponentDefinition.g:8767:2: ( ( 'undersamplingOk' ) )
            // InternalComponentDefinition.g:8768:3: ( 'undersamplingOk' )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); 
            // InternalComponentDefinition.g:8769:3: ( 'undersamplingOk' )
            // InternalComponentDefinition.g:8770:4: 'undersamplingOk'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); 

            }

             after(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputLinkExtension__UndersamplingOkAssignment_4_2"


    // $ANTLR start "rule__ActivationConstraints__ConfigurableAssignment_5"
    // InternalComponentDefinition.g:8781:1: rule__ActivationConstraints__ConfigurableAssignment_5 : ( ruleEBoolean ) ;
    public final void rule__ActivationConstraints__ConfigurableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8785:1: ( ( ruleEBoolean ) )
            // InternalComponentDefinition.g:8786:2: ( ruleEBoolean )
            {
            // InternalComponentDefinition.g:8786:2: ( ruleEBoolean )
            // InternalComponentDefinition.g:8787:3: ruleEBoolean
            {
             before(grammarAccess.getActivationConstraintsAccess().getConfigurableEBooleanParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getActivationConstraintsAccess().getConfigurableEBooleanParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__ConfigurableAssignment_5"


    // $ANTLR start "rule__ActivationConstraints__MinActFreqAssignment_7_0_2"
    // InternalComponentDefinition.g:8796:1: rule__ActivationConstraints__MinActFreqAssignment_7_0_2 : ( ruleEDouble ) ;
    public final void rule__ActivationConstraints__MinActFreqAssignment_7_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8800:1: ( ( ruleEDouble ) )
            // InternalComponentDefinition.g:8801:2: ( ruleEDouble )
            {
            // InternalComponentDefinition.g:8801:2: ( ruleEDouble )
            // InternalComponentDefinition.g:8802:3: ruleEDouble
            {
             before(grammarAccess.getActivationConstraintsAccess().getMinActFreqEDoubleParserRuleCall_7_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getActivationConstraintsAccess().getMinActFreqEDoubleParserRuleCall_7_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__MinActFreqAssignment_7_0_2"


    // $ANTLR start "rule__ActivationConstraints__MaxActFreqAssignment_7_1_2"
    // InternalComponentDefinition.g:8811:1: rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 : ( ruleEDouble ) ;
    public final void rule__ActivationConstraints__MaxActFreqAssignment_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8815:1: ( ( ruleEDouble ) )
            // InternalComponentDefinition.g:8816:2: ( ruleEDouble )
            {
            // InternalComponentDefinition.g:8816:2: ( ruleEDouble )
            // InternalComponentDefinition.g:8817:3: ruleEDouble
            {
             before(grammarAccess.getActivationConstraintsAccess().getMaxActFreqEDoubleParserRuleCall_7_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getActivationConstraintsAccess().getMaxActFreqEDoubleParserRuleCall_7_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivationConstraints__MaxActFreqAssignment_7_1_2"


    // $ANTLR start "rule__OperationModeBinding__ModeAssignment_1"
    // InternalComponentDefinition.g:8826:1: rule__OperationModeBinding__ModeAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__OperationModeBinding__ModeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8830:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8831:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8831:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8832:3: ( ruleFQN )
            {
             before(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeCrossReference_1_0()); 
            // InternalComponentDefinition.g:8833:3: ( ruleFQN )
            // InternalComponentDefinition.g:8834:4: ruleFQN
            {
             before(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OperationModeBinding__ModeAssignment_1"


    // $ANTLR start "rule__DefaultInputTrigger__InputLinkAssignment_1"
    // InternalComponentDefinition.g:8845:1: rule__DefaultInputTrigger__InputLinkAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DefaultInputTrigger__InputLinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8849:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8850:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8850:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8851:3: ( ruleFQN )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionCrossReference_1_0()); 
            // InternalComponentDefinition.g:8852:3: ( ruleFQN )
            // InternalComponentDefinition.g:8853:4: ruleFQN
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__InputLinkAssignment_1"


    // $ANTLR start "rule__DefaultInputTrigger__PrescaleAssignment_2_1"
    // InternalComponentDefinition.g:8864:1: rule__DefaultInputTrigger__PrescaleAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__DefaultInputTrigger__PrescaleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8868:1: ( ( ruleEInt ) )
            // InternalComponentDefinition.g:8869:2: ( ruleEInt )
            {
            // InternalComponentDefinition.g:8869:2: ( ruleEInt )
            // InternalComponentDefinition.g:8870:3: ruleEInt
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getPrescaleEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getDefaultInputTriggerAccess().getPrescaleEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultInputTrigger__PrescaleAssignment_2_1"


    // $ANTLR start "rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1"
    // InternalComponentDefinition.g:8879:1: rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 : ( ruleEDouble ) ;
    public final void rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8883:1: ( ( ruleEDouble ) )
            // InternalComponentDefinition.g:8884:2: ( ruleEDouble )
            {
            // InternalComponentDefinition.g:8884:2: ( ruleEDouble )
            // InternalComponentDefinition.g:8885:3: ruleEDouble
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqEDoubleParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1"


    // $ANTLR start "rule__DefaultObservedElementTrigger__ElementAssignment_1"
    // InternalComponentDefinition.g:8894:1: rule__DefaultObservedElementTrigger__ElementAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DefaultObservedElementTrigger__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8898:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8899:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8899:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8900:3: ( ruleFQN )
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeCrossReference_1_0()); 
            // InternalComponentDefinition.g:8901:3: ( ruleFQN )
            // InternalComponentDefinition.g:8902:4: ruleFQN
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DefaultObservedElementTrigger__ElementAssignment_1"


    // $ANTLR start "rule__OpcUaDeviceClient__NameAssignment_1"
    // InternalComponentDefinition.g:8913:1: rule__OpcUaDeviceClient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OpcUaDeviceClient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8917:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8918:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8918:2: ( RULE_ID )
            // InternalComponentDefinition.g:8919:3: RULE_ID
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__NameAssignment_1"


    // $ANTLR start "rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1"
    // InternalComponentDefinition.g:8928:1: rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 : ( ruleEString ) ;
    public final void rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8932:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:8933:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:8933:2: ( ruleEString )
            // InternalComponentDefinition.g:8934:3: ruleEString
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIEStringParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIEStringParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1"


    // $ANTLR start "rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1"
    // InternalComponentDefinition.g:8943:1: rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 : ( ruleEString ) ;
    public final void rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8947:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:8948:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:8948:2: ( ruleEString )
            // InternalComponentDefinition.g:8949:3: ruleEString
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileEStringParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileEStringParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1"


    // $ANTLR start "rule__OpcUaReadServer__NameAssignment_1"
    // InternalComponentDefinition.g:8958:1: rule__OpcUaReadServer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OpcUaReadServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8962:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8963:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8963:2: ( RULE_ID )
            // InternalComponentDefinition.g:8964:3: RULE_ID
            {
             before(grammarAccess.getOpcUaReadServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOpcUaReadServerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__NameAssignment_1"


    // $ANTLR start "rule__OpcUaReadServer__OutPortAssignment_3"
    // InternalComponentDefinition.g:8973:1: rule__OpcUaReadServer__OutPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__OpcUaReadServer__OutPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8977:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8978:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8978:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8979:3: ( ruleFQN )
            {
             before(grammarAccess.getOpcUaReadServerAccess().getOutPortOutputPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:8980:3: ( ruleFQN )
            // InternalComponentDefinition.g:8981:4: ruleFQN
            {
             before(grammarAccess.getOpcUaReadServerAccess().getOutPortOutputPortFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOpcUaReadServerAccess().getOutPortOutputPortFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOpcUaReadServerAccess().getOutPortOutputPortCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__OutPortAssignment_3"


    // $ANTLR start "rule__OpcUaReadServer__PortNumberAssignment_4_1"
    // InternalComponentDefinition.g:8992:1: rule__OpcUaReadServer__PortNumberAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__OpcUaReadServer__PortNumberAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8996:1: ( ( ruleEInt ) )
            // InternalComponentDefinition.g:8997:2: ( ruleEInt )
            {
            // InternalComponentDefinition.g:8997:2: ( ruleEInt )
            // InternalComponentDefinition.g:8998:3: ruleEInt
            {
             before(grammarAccess.getOpcUaReadServerAccess().getPortNumberEIntParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOpcUaReadServerAccess().getPortNumberEIntParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServer__PortNumberAssignment_4_1"


    // $ANTLR start "rule__MixedPortROS__PortAssignment_1"
    // InternalComponentDefinition.g:9007:1: rule__MixedPortROS__PortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MixedPortROS__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9011:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDefinition.g:9012:2: ( ( RULE_ID ) )
            {
            // InternalComponentDefinition.g:9012:2: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9013:3: ( RULE_ID )
            {
             before(grammarAccess.getMixedPortROSAccess().getPortMixedPortROSBaseCrossReference_1_0()); 
            // InternalComponentDefinition.g:9014:3: ( RULE_ID )
            // InternalComponentDefinition.g:9015:4: RULE_ID
            {
             before(grammarAccess.getMixedPortROSAccess().getPortMixedPortROSBaseIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMixedPortROSAccess().getPortMixedPortROSBaseIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMixedPortROSAccess().getPortMixedPortROSBaseCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortROS__PortAssignment_1"


    // $ANTLR start "rule__MixedPortYARP__PortAssignment_1"
    // InternalComponentDefinition.g:9026:1: rule__MixedPortYARP__PortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MixedPortYARP__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9030:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDefinition.g:9031:2: ( ( RULE_ID ) )
            {
            // InternalComponentDefinition.g:9031:2: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9032:3: ( RULE_ID )
            {
             before(grammarAccess.getMixedPortYARPAccess().getPortMixedPortYARPBaseCrossReference_1_0()); 
            // InternalComponentDefinition.g:9033:3: ( RULE_ID )
            // InternalComponentDefinition.g:9034:4: RULE_ID
            {
             before(grammarAccess.getMixedPortYARPAccess().getPortMixedPortYARPBaseIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMixedPortYARPAccess().getPortMixedPortYARPBaseIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMixedPortYARPAccess().getPortMixedPortYARPBaseCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MixedPortYARP__PortAssignment_1"


    // $ANTLR start "rule__CoordinationSlavePort__NameAssignment_1"
    // InternalComponentDefinition.g:9045:1: rule__CoordinationSlavePort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoordinationSlavePort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9049:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9050:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:9050:2: ( RULE_ID )
            // InternalComponentDefinition.g:9051:3: RULE_ID
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__NameAssignment_1"


    // $ANTLR start "rule__CoordinationSlavePort__ServiceAssignment_3"
    // InternalComponentDefinition.g:9060:1: rule__CoordinationSlavePort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CoordinationSlavePort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9064:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9065:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9065:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9066:3: ( ruleFQN )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0()); 
            // InternalComponentDefinition.g:9067:3: ( ruleFQN )
            // InternalComponentDefinition.g:9068:4: ruleFQN
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__ServiceAssignment_3"


    // $ANTLR start "rule__CoordinationSlavePort__ElementsAssignment_5"
    // InternalComponentDefinition.g:9079:1: rule__CoordinationSlavePort__ElementsAssignment_5 : ( ruleAbstractCoordinationElement ) ;
    public final void rule__CoordinationSlavePort__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9083:1: ( ( ruleAbstractCoordinationElement ) )
            // InternalComponentDefinition.g:9084:2: ( ruleAbstractCoordinationElement )
            {
            // InternalComponentDefinition.g:9084:2: ( ruleAbstractCoordinationElement )
            // InternalComponentDefinition.g:9085:3: ruleAbstractCoordinationElement
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getElementsAbstractCoordinationElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractCoordinationElement();

            state._fsp--;

             after(grammarAccess.getCoordinationSlavePortAccess().getElementsAbstractCoordinationElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__ElementsAssignment_5"


    // $ANTLR start "rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1"
    // InternalComponentDefinition.g:9094:1: rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9098:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9099:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9099:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9100:3: ( ruleFQN )
            {
             before(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefCoordinationModuleRealizationCrossReference_1_0()); 
            // InternalComponentDefinition.g:9101:3: ( ruleFQN )
            // InternalComponentDefinition.g:9102:4: ruleFQN
            {
             before(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefCoordinationModuleRealizationFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefCoordinationModuleRealizationFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefCoordinationModuleRealizationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1"


    // $ANTLR start "rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1"
    // InternalComponentDefinition.g:9113:1: rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9117:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9118:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9118:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9119:3: ( ruleFQN )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageCrossReference_1_0()); 
            // InternalComponentDefinition.g:9120:3: ( ruleFQN )
            // InternalComponentDefinition.g:9121:4: ruleFQN
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1"


    // $ANTLR start "rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3"
    // InternalComponentDefinition.g:9132:1: rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9136:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9137:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9137:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9138:3: ( ruleFQN )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:9139:3: ( ruleFQN )
            // InternalComponentDefinition.g:9140:4: ruleFQN
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3"


    // $ANTLR start "rule__PublicOperationMode__IsDefaultInitAssignment_1"
    // InternalComponentDefinition.g:9151:1: rule__PublicOperationMode__IsDefaultInitAssignment_1 : ( ( 'default' ) ) ;
    public final void rule__PublicOperationMode__IsDefaultInitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9155:1: ( ( ( 'default' ) ) )
            // InternalComponentDefinition.g:9156:2: ( ( 'default' ) )
            {
            // InternalComponentDefinition.g:9156:2: ( ( 'default' ) )
            // InternalComponentDefinition.g:9157:3: ( 'default' )
            {
             before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0()); 
            // InternalComponentDefinition.g:9158:3: ( 'default' )
            // InternalComponentDefinition.g:9159:4: 'default'
            {
             before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0()); 
            match(input,77,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0()); 

            }

             after(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__IsDefaultInitAssignment_1"


    // $ANTLR start "rule__PublicOperationMode__ModeAssignment_3"
    // InternalComponentDefinition.g:9170:1: rule__PublicOperationMode__ModeAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__PublicOperationMode__ModeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9174:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9175:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9175:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9176:3: ( ruleFQN )
            {
             before(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionCrossReference_3_0()); 
            // InternalComponentDefinition.g:9177:3: ( ruleFQN )
            // InternalComponentDefinition.g:9178:4: ruleFQN
            {
             before(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__ModeAssignment_3"


    // $ANTLR start "rule__PublicOperationMode__ActivatesAssignment_5_2"
    // InternalComponentDefinition.g:9189:1: rule__PublicOperationMode__ActivatesAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__PublicOperationMode__ActivatesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9193:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDefinition.g:9194:2: ( ( RULE_ID ) )
            {
            // InternalComponentDefinition.g:9194:2: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9195:3: ( RULE_ID )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_2_0()); 
            // InternalComponentDefinition.g:9196:3: ( RULE_ID )
            // InternalComponentDefinition.g:9197:4: RULE_ID
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_5_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_5_2_0_1()); 

            }

             after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__ActivatesAssignment_5_2"


    // $ANTLR start "rule__PublicOperationMode__ActivatesAssignment_5_3_1"
    // InternalComponentDefinition.g:9208:1: rule__PublicOperationMode__ActivatesAssignment_5_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PublicOperationMode__ActivatesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9212:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDefinition.g:9213:2: ( ( RULE_ID ) )
            {
            // InternalComponentDefinition.g:9213:2: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9214:3: ( RULE_ID )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_3_1_0()); 
            // InternalComponentDefinition.g:9215:3: ( RULE_ID )
            // InternalComponentDefinition.g:9216:4: RULE_ID
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_5_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_5_3_1_0_1()); 

            }

             after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__ActivatesAssignment_5_3_1"


    // $ANTLR start "rule__PrivateOperationMode__NameAssignment_1"
    // InternalComponentDefinition.g:9227:1: rule__PrivateOperationMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrivateOperationMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9231:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9232:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:9232:2: ( RULE_ID )
            // InternalComponentDefinition.g:9233:3: RULE_ID
            {
             before(grammarAccess.getPrivateOperationModeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPrivateOperationModeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrivateOperationMode__NameAssignment_1"


    // $ANTLR start "rule__CoordinationMasterPort__NameAssignment_1"
    // InternalComponentDefinition.g:9242:1: rule__CoordinationMasterPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoordinationMasterPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9246:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9247:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:9247:2: ( RULE_ID )
            // InternalComponentDefinition.g:9248:3: RULE_ID
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoordinationMasterPortAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__NameAssignment_1"


    // $ANTLR start "rule__CoordinationMasterPort__ServiceAssignment_3"
    // InternalComponentDefinition.g:9257:1: rule__CoordinationMasterPort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CoordinationMasterPort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9261:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9262:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9262:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9263:3: ( ruleFQN )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0()); 
            // InternalComponentDefinition.g:9264:3: ( ruleFQN )
            // InternalComponentDefinition.g:9265:4: ruleFQN
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationMasterPort__ServiceAssignment_3"


    // $ANTLR start "rule__ComponentParametersRef__ParameterAssignment_1"
    // InternalComponentDefinition.g:9276:1: rule__ComponentParametersRef__ParameterAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentParametersRef__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9280:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9281:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9281:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9282:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterCrossReference_1_0()); 
            // InternalComponentDefinition.g:9283:3: ( ruleFQN )
            // InternalComponentDefinition.g:9284:4: ruleFQN
            {
             before(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__ParameterAssignment_1"


    // $ANTLR start "rule__ComponentParametersRef__SlaveAssignment_2_1"
    // InternalComponentDefinition.g:9295:1: rule__ComponentParametersRef__SlaveAssignment_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentParametersRef__SlaveAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9299:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9300:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9300:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9301:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortCrossReference_2_1_0()); 
            // InternalComponentDefinition.g:9302:3: ( ruleFQN )
            // InternalComponentDefinition.g:9303:4: ruleFQN
            {
             before(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortFQNParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortFQNParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParametersRef__SlaveAssignment_2_1"


    // $ANTLR start "rule__ACE_SmartSoft__DescriptionAssignment_2_1"
    // InternalComponentDefinition.g:9314:1: rule__ACE_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ACE_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9318:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:9319:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:9319:2: ( ruleEString )
            // InternalComponentDefinition.g:9320:3: ruleEString
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getACE_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ACE_SmartSoft__DescriptionAssignment_2_1"


    // $ANTLR start "rule__OpcUa_SeRoNet__DescriptionAssignment_2_1"
    // InternalComponentDefinition.g:9329:1: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpcUa_SeRoNet__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9333:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:9334:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:9334:2: ( ruleEString )
            // InternalComponentDefinition.g:9335:3: ruleEString
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUa_SeRoNet__DescriptionAssignment_2_1"


    // $ANTLR start "rule__CORBA_SmartSoft__DescriptionAssignment_2_1"
    // InternalComponentDefinition.g:9344:1: rule__CORBA_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CORBA_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9348:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:9349:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:9349:2: ( ruleEString )
            // InternalComponentDefinition.g:9350:3: ruleEString
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CORBA_SmartSoft__DescriptionAssignment_2_1"


    // $ANTLR start "rule__DDS_SmartSoft__DescriptionAssignment_2_1"
    // InternalComponentDefinition.g:9359:1: rule__DDS_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DDS_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9363:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:9364:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:9364:2: ( ruleEString )
            // InternalComponentDefinition.g:9365:3: ruleEString
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getDDS_SmartSoftAccess().getDescriptionEStringParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DDS_SmartSoft__DescriptionAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x03920000B6A80000L,0x000000000000000CL});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x03920000B6A00002L,0x000000000000000CL});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003D00L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000183F00080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001F00000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000182000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L,0x0000000000004000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001F00080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000050000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L,0x00000000000000A0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001A00000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000080L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000010000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1C00000000080000L,0x0000000000002002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1C00000000000002L,0x0000000000002002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x1000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x2000000000080000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000000038000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000050000000002L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x000C000000000002L});

}
