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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'true'", "'false'", "'#import'", "';'", "'ComponentDefinition'", "'{'", "'}'", "'logo'", "'RequestPort'", "'implements'", "'OutputPort'", "'realizedBy'", "'AnswerPort'", "'InputPort'", "'SupportedMiddleware'", "'Activity'", "'InputHandler'", "'triggeredFrom'", "'RequestHandler'", "'RequestPortLink'", "'OpcUaClientLink'", "'Observe'", "'InputPortLink'", "'ActivationConstraints'", "'configurable'", "'='", "'minActFreq'", "'Hz'", "'maxActFreq'", "'OperationModeBinding'", "'DefaultTrigger'", "'InputPortTrigger'", "'prescale'", "'PeriodicTimer'", "'ObservedElement'", "'OpcUaDeviceClient'", "'deviceURI'", "'opcuaXmlFile'", "'OpcUaStatusServer'", "'dataProviderPort'", "'CoordinationSlavePort'", "'with'", "'PublicOperationMode'", "'activates'", "'('", "')'", "','", "'PrivateOperationMode'", "'CoordinationMasterPort'", "'ComponentParameters'", "'slave'", "'.'", "'.*'", "'-'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'", "'default'", "'activeQueue'", "'optional'", "'oversamplingOk'", "'undersamplingOk'"
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
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
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
    // InternalComponentDefinition.g:203:1: ruleDerivedComponentElement : ( ruleComponentParametersRef ) ;
    public final void ruleDerivedComponentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:207:2: ( ( ruleComponentParametersRef ) )
            // InternalComponentDefinition.g:208:2: ( ruleComponentParametersRef )
            {
            // InternalComponentDefinition.g:208:2: ( ruleComponentParametersRef )
            // InternalComponentDefinition.g:209:3: ruleComponentParametersRef
            {
             before(grammarAccess.getDerivedComponentElementAccess().getComponentParametersRefParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleComponentParametersRef();

            state._fsp--;

             after(grammarAccess.getDerivedComponentElementAccess().getComponentParametersRefParserRuleCall()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleComponentSubNodeObserver"
    // InternalComponentDefinition.g:594:1: entryRuleComponentSubNodeObserver : ruleComponentSubNodeObserver EOF ;
    public final void entryRuleComponentSubNodeObserver() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:595:1: ( ruleComponentSubNodeObserver EOF )
            // InternalComponentDefinition.g:596:1: ruleComponentSubNodeObserver EOF
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
    // InternalComponentDefinition.g:603:1: ruleComponentSubNodeObserver : ( ( rule__ComponentSubNodeObserver__Group__0 ) ) ;
    public final void ruleComponentSubNodeObserver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:607:2: ( ( ( rule__ComponentSubNodeObserver__Group__0 ) ) )
            // InternalComponentDefinition.g:608:2: ( ( rule__ComponentSubNodeObserver__Group__0 ) )
            {
            // InternalComponentDefinition.g:608:2: ( ( rule__ComponentSubNodeObserver__Group__0 ) )
            // InternalComponentDefinition.g:609:3: ( rule__ComponentSubNodeObserver__Group__0 )
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getGroup()); 
            // InternalComponentDefinition.g:610:3: ( rule__ComponentSubNodeObserver__Group__0 )
            // InternalComponentDefinition.g:610:4: rule__ComponentSubNodeObserver__Group__0
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
    // InternalComponentDefinition.g:619:1: entryRuleInputLinkExtension : ruleInputLinkExtension EOF ;
    public final void entryRuleInputLinkExtension() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:620:1: ( ruleInputLinkExtension EOF )
            // InternalComponentDefinition.g:621:1: ruleInputLinkExtension EOF
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
    // InternalComponentDefinition.g:628:1: ruleInputLinkExtension : ( ( rule__InputLinkExtension__Group__0 ) ) ;
    public final void ruleInputLinkExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:632:2: ( ( ( rule__InputLinkExtension__Group__0 ) ) )
            // InternalComponentDefinition.g:633:2: ( ( rule__InputLinkExtension__Group__0 ) )
            {
            // InternalComponentDefinition.g:633:2: ( ( rule__InputLinkExtension__Group__0 ) )
            // InternalComponentDefinition.g:634:3: ( rule__InputLinkExtension__Group__0 )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getGroup()); 
            // InternalComponentDefinition.g:635:3: ( rule__InputLinkExtension__Group__0 )
            // InternalComponentDefinition.g:635:4: rule__InputLinkExtension__Group__0
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
    // InternalComponentDefinition.g:644:1: entryRuleActivityExtension : ruleActivityExtension EOF ;
    public final void entryRuleActivityExtension() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:645:1: ( ruleActivityExtension EOF )
            // InternalComponentDefinition.g:646:1: ruleActivityExtension EOF
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
    // InternalComponentDefinition.g:653:1: ruleActivityExtension : ( ( rule__ActivityExtension__Alternatives ) ) ;
    public final void ruleActivityExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:657:2: ( ( ( rule__ActivityExtension__Alternatives ) ) )
            // InternalComponentDefinition.g:658:2: ( ( rule__ActivityExtension__Alternatives ) )
            {
            // InternalComponentDefinition.g:658:2: ( ( rule__ActivityExtension__Alternatives ) )
            // InternalComponentDefinition.g:659:3: ( rule__ActivityExtension__Alternatives )
            {
             before(grammarAccess.getActivityExtensionAccess().getAlternatives()); 
            // InternalComponentDefinition.g:660:3: ( rule__ActivityExtension__Alternatives )
            // InternalComponentDefinition.g:660:4: rule__ActivityExtension__Alternatives
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
    // InternalComponentDefinition.g:669:1: entryRuleActivationConstraints : ruleActivationConstraints EOF ;
    public final void entryRuleActivationConstraints() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:670:1: ( ruleActivationConstraints EOF )
            // InternalComponentDefinition.g:671:1: ruleActivationConstraints EOF
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
    // InternalComponentDefinition.g:678:1: ruleActivationConstraints : ( ( rule__ActivationConstraints__Group__0 ) ) ;
    public final void ruleActivationConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:682:2: ( ( ( rule__ActivationConstraints__Group__0 ) ) )
            // InternalComponentDefinition.g:683:2: ( ( rule__ActivationConstraints__Group__0 ) )
            {
            // InternalComponentDefinition.g:683:2: ( ( rule__ActivationConstraints__Group__0 ) )
            // InternalComponentDefinition.g:684:3: ( rule__ActivationConstraints__Group__0 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getGroup()); 
            // InternalComponentDefinition.g:685:3: ( rule__ActivationConstraints__Group__0 )
            // InternalComponentDefinition.g:685:4: rule__ActivationConstraints__Group__0
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
    // InternalComponentDefinition.g:694:1: entryRuleOperationModeBinding : ruleOperationModeBinding EOF ;
    public final void entryRuleOperationModeBinding() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:695:1: ( ruleOperationModeBinding EOF )
            // InternalComponentDefinition.g:696:1: ruleOperationModeBinding EOF
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
    // InternalComponentDefinition.g:703:1: ruleOperationModeBinding : ( ( rule__OperationModeBinding__Group__0 ) ) ;
    public final void ruleOperationModeBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:707:2: ( ( ( rule__OperationModeBinding__Group__0 ) ) )
            // InternalComponentDefinition.g:708:2: ( ( rule__OperationModeBinding__Group__0 ) )
            {
            // InternalComponentDefinition.g:708:2: ( ( rule__OperationModeBinding__Group__0 ) )
            // InternalComponentDefinition.g:709:3: ( rule__OperationModeBinding__Group__0 )
            {
             before(grammarAccess.getOperationModeBindingAccess().getGroup()); 
            // InternalComponentDefinition.g:710:3: ( rule__OperationModeBinding__Group__0 )
            // InternalComponentDefinition.g:710:4: rule__OperationModeBinding__Group__0
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
    // InternalComponentDefinition.g:719:1: entryRuleDefaultTrigger : ruleDefaultTrigger EOF ;
    public final void entryRuleDefaultTrigger() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:720:1: ( ruleDefaultTrigger EOF )
            // InternalComponentDefinition.g:721:1: ruleDefaultTrigger EOF
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
    // InternalComponentDefinition.g:728:1: ruleDefaultTrigger : ( ( rule__DefaultTrigger__Group__0 ) ) ;
    public final void ruleDefaultTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:732:2: ( ( ( rule__DefaultTrigger__Group__0 ) ) )
            // InternalComponentDefinition.g:733:2: ( ( rule__DefaultTrigger__Group__0 ) )
            {
            // InternalComponentDefinition.g:733:2: ( ( rule__DefaultTrigger__Group__0 ) )
            // InternalComponentDefinition.g:734:3: ( rule__DefaultTrigger__Group__0 )
            {
             before(grammarAccess.getDefaultTriggerAccess().getGroup()); 
            // InternalComponentDefinition.g:735:3: ( rule__DefaultTrigger__Group__0 )
            // InternalComponentDefinition.g:735:4: rule__DefaultTrigger__Group__0
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
    // InternalComponentDefinition.g:744:1: entryRuleDefaultInputTrigger : ruleDefaultInputTrigger EOF ;
    public final void entryRuleDefaultInputTrigger() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:745:1: ( ruleDefaultInputTrigger EOF )
            // InternalComponentDefinition.g:746:1: ruleDefaultInputTrigger EOF
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
    // InternalComponentDefinition.g:753:1: ruleDefaultInputTrigger : ( ( rule__DefaultInputTrigger__Group__0 ) ) ;
    public final void ruleDefaultInputTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:757:2: ( ( ( rule__DefaultInputTrigger__Group__0 ) ) )
            // InternalComponentDefinition.g:758:2: ( ( rule__DefaultInputTrigger__Group__0 ) )
            {
            // InternalComponentDefinition.g:758:2: ( ( rule__DefaultInputTrigger__Group__0 ) )
            // InternalComponentDefinition.g:759:3: ( rule__DefaultInputTrigger__Group__0 )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getGroup()); 
            // InternalComponentDefinition.g:760:3: ( rule__DefaultInputTrigger__Group__0 )
            // InternalComponentDefinition.g:760:4: rule__DefaultInputTrigger__Group__0
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
    // InternalComponentDefinition.g:769:1: entryRuleDefaultPeriodicTimer : ruleDefaultPeriodicTimer EOF ;
    public final void entryRuleDefaultPeriodicTimer() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:770:1: ( ruleDefaultPeriodicTimer EOF )
            // InternalComponentDefinition.g:771:1: ruleDefaultPeriodicTimer EOF
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
    // InternalComponentDefinition.g:778:1: ruleDefaultPeriodicTimer : ( ( rule__DefaultPeriodicTimer__Group__0 ) ) ;
    public final void ruleDefaultPeriodicTimer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:782:2: ( ( ( rule__DefaultPeriodicTimer__Group__0 ) ) )
            // InternalComponentDefinition.g:783:2: ( ( rule__DefaultPeriodicTimer__Group__0 ) )
            {
            // InternalComponentDefinition.g:783:2: ( ( rule__DefaultPeriodicTimer__Group__0 ) )
            // InternalComponentDefinition.g:784:3: ( rule__DefaultPeriodicTimer__Group__0 )
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getGroup()); 
            // InternalComponentDefinition.g:785:3: ( rule__DefaultPeriodicTimer__Group__0 )
            // InternalComponentDefinition.g:785:4: rule__DefaultPeriodicTimer__Group__0
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
    // InternalComponentDefinition.g:794:1: entryRuleDefaultObservedElementTrigger : ruleDefaultObservedElementTrigger EOF ;
    public final void entryRuleDefaultObservedElementTrigger() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:795:1: ( ruleDefaultObservedElementTrigger EOF )
            // InternalComponentDefinition.g:796:1: ruleDefaultObservedElementTrigger EOF
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
    // InternalComponentDefinition.g:803:1: ruleDefaultObservedElementTrigger : ( ( rule__DefaultObservedElementTrigger__Group__0 ) ) ;
    public final void ruleDefaultObservedElementTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:807:2: ( ( ( rule__DefaultObservedElementTrigger__Group__0 ) ) )
            // InternalComponentDefinition.g:808:2: ( ( rule__DefaultObservedElementTrigger__Group__0 ) )
            {
            // InternalComponentDefinition.g:808:2: ( ( rule__DefaultObservedElementTrigger__Group__0 ) )
            // InternalComponentDefinition.g:809:3: ( rule__DefaultObservedElementTrigger__Group__0 )
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getGroup()); 
            // InternalComponentDefinition.g:810:3: ( rule__DefaultObservedElementTrigger__Group__0 )
            // InternalComponentDefinition.g:810:4: rule__DefaultObservedElementTrigger__Group__0
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
    // InternalComponentDefinition.g:819:1: entryRulePlainOpcUaPort : rulePlainOpcUaPort EOF ;
    public final void entryRulePlainOpcUaPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:820:1: ( rulePlainOpcUaPort EOF )
            // InternalComponentDefinition.g:821:1: rulePlainOpcUaPort EOF
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
    // InternalComponentDefinition.g:828:1: rulePlainOpcUaPort : ( ( rule__PlainOpcUaPort__Alternatives ) ) ;
    public final void rulePlainOpcUaPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:832:2: ( ( ( rule__PlainOpcUaPort__Alternatives ) ) )
            // InternalComponentDefinition.g:833:2: ( ( rule__PlainOpcUaPort__Alternatives ) )
            {
            // InternalComponentDefinition.g:833:2: ( ( rule__PlainOpcUaPort__Alternatives ) )
            // InternalComponentDefinition.g:834:3: ( rule__PlainOpcUaPort__Alternatives )
            {
             before(grammarAccess.getPlainOpcUaPortAccess().getAlternatives()); 
            // InternalComponentDefinition.g:835:3: ( rule__PlainOpcUaPort__Alternatives )
            // InternalComponentDefinition.g:835:4: rule__PlainOpcUaPort__Alternatives
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
    // InternalComponentDefinition.g:844:1: entryRuleOpcUaDeviceClient : ruleOpcUaDeviceClient EOF ;
    public final void entryRuleOpcUaDeviceClient() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:845:1: ( ruleOpcUaDeviceClient EOF )
            // InternalComponentDefinition.g:846:1: ruleOpcUaDeviceClient EOF
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
    // InternalComponentDefinition.g:853:1: ruleOpcUaDeviceClient : ( ( rule__OpcUaDeviceClient__Group__0 ) ) ;
    public final void ruleOpcUaDeviceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:857:2: ( ( ( rule__OpcUaDeviceClient__Group__0 ) ) )
            // InternalComponentDefinition.g:858:2: ( ( rule__OpcUaDeviceClient__Group__0 ) )
            {
            // InternalComponentDefinition.g:858:2: ( ( rule__OpcUaDeviceClient__Group__0 ) )
            // InternalComponentDefinition.g:859:3: ( rule__OpcUaDeviceClient__Group__0 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getGroup()); 
            // InternalComponentDefinition.g:860:3: ( rule__OpcUaDeviceClient__Group__0 )
            // InternalComponentDefinition.g:860:4: rule__OpcUaDeviceClient__Group__0
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


    // $ANTLR start "entryRuleOpcUaStatusServer"
    // InternalComponentDefinition.g:869:1: entryRuleOpcUaStatusServer : ruleOpcUaStatusServer EOF ;
    public final void entryRuleOpcUaStatusServer() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:870:1: ( ruleOpcUaStatusServer EOF )
            // InternalComponentDefinition.g:871:1: ruleOpcUaStatusServer EOF
            {
             before(grammarAccess.getOpcUaStatusServerRule()); 
            pushFollow(FOLLOW_1);
            ruleOpcUaStatusServer();

            state._fsp--;

             after(grammarAccess.getOpcUaStatusServerRule()); 
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
    // $ANTLR end "entryRuleOpcUaStatusServer"


    // $ANTLR start "ruleOpcUaStatusServer"
    // InternalComponentDefinition.g:878:1: ruleOpcUaStatusServer : ( ( rule__OpcUaStatusServer__Group__0 ) ) ;
    public final void ruleOpcUaStatusServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:882:2: ( ( ( rule__OpcUaStatusServer__Group__0 ) ) )
            // InternalComponentDefinition.g:883:2: ( ( rule__OpcUaStatusServer__Group__0 ) )
            {
            // InternalComponentDefinition.g:883:2: ( ( rule__OpcUaStatusServer__Group__0 ) )
            // InternalComponentDefinition.g:884:3: ( rule__OpcUaStatusServer__Group__0 )
            {
             before(grammarAccess.getOpcUaStatusServerAccess().getGroup()); 
            // InternalComponentDefinition.g:885:3: ( rule__OpcUaStatusServer__Group__0 )
            // InternalComponentDefinition.g:885:4: rule__OpcUaStatusServer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaStatusServer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaStatusServerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpcUaStatusServer"


    // $ANTLR start "entryRuleCoordinationSlavePort"
    // InternalComponentDefinition.g:894:1: entryRuleCoordinationSlavePort : ruleCoordinationSlavePort EOF ;
    public final void entryRuleCoordinationSlavePort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:895:1: ( ruleCoordinationSlavePort EOF )
            // InternalComponentDefinition.g:896:1: ruleCoordinationSlavePort EOF
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
    // InternalComponentDefinition.g:903:1: ruleCoordinationSlavePort : ( ( rule__CoordinationSlavePort__Group__0 ) ) ;
    public final void ruleCoordinationSlavePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:907:2: ( ( ( rule__CoordinationSlavePort__Group__0 ) ) )
            // InternalComponentDefinition.g:908:2: ( ( rule__CoordinationSlavePort__Group__0 ) )
            {
            // InternalComponentDefinition.g:908:2: ( ( rule__CoordinationSlavePort__Group__0 ) )
            // InternalComponentDefinition.g:909:3: ( rule__CoordinationSlavePort__Group__0 )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getGroup()); 
            // InternalComponentDefinition.g:910:3: ( rule__CoordinationSlavePort__Group__0 )
            // InternalComponentDefinition.g:910:4: rule__CoordinationSlavePort__Group__0
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
    // InternalComponentDefinition.g:919:1: entryRuleAbstractCoordinationElement : ruleAbstractCoordinationElement EOF ;
    public final void entryRuleAbstractCoordinationElement() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:920:1: ( ruleAbstractCoordinationElement EOF )
            // InternalComponentDefinition.g:921:1: ruleAbstractCoordinationElement EOF
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
    // InternalComponentDefinition.g:928:1: ruleAbstractCoordinationElement : ( ( rule__AbstractCoordinationElement__Alternatives ) ) ;
    public final void ruleAbstractCoordinationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:932:2: ( ( ( rule__AbstractCoordinationElement__Alternatives ) ) )
            // InternalComponentDefinition.g:933:2: ( ( rule__AbstractCoordinationElement__Alternatives ) )
            {
            // InternalComponentDefinition.g:933:2: ( ( rule__AbstractCoordinationElement__Alternatives ) )
            // InternalComponentDefinition.g:934:3: ( rule__AbstractCoordinationElement__Alternatives )
            {
             before(grammarAccess.getAbstractCoordinationElementAccess().getAlternatives()); 
            // InternalComponentDefinition.g:935:3: ( rule__AbstractCoordinationElement__Alternatives )
            // InternalComponentDefinition.g:935:4: rule__AbstractCoordinationElement__Alternatives
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


    // $ANTLR start "entryRuleCommunicationServiceUsageRealization"
    // InternalComponentDefinition.g:944:1: entryRuleCommunicationServiceUsageRealization : ruleCommunicationServiceUsageRealization EOF ;
    public final void entryRuleCommunicationServiceUsageRealization() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:945:1: ( ruleCommunicationServiceUsageRealization EOF )
            // InternalComponentDefinition.g:946:1: ruleCommunicationServiceUsageRealization EOF
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
    // InternalComponentDefinition.g:953:1: ruleCommunicationServiceUsageRealization : ( ( rule__CommunicationServiceUsageRealization__Group__0 ) ) ;
    public final void ruleCommunicationServiceUsageRealization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:957:2: ( ( ( rule__CommunicationServiceUsageRealization__Group__0 ) ) )
            // InternalComponentDefinition.g:958:2: ( ( rule__CommunicationServiceUsageRealization__Group__0 ) )
            {
            // InternalComponentDefinition.g:958:2: ( ( rule__CommunicationServiceUsageRealization__Group__0 ) )
            // InternalComponentDefinition.g:959:3: ( rule__CommunicationServiceUsageRealization__Group__0 )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getGroup()); 
            // InternalComponentDefinition.g:960:3: ( rule__CommunicationServiceUsageRealization__Group__0 )
            // InternalComponentDefinition.g:960:4: rule__CommunicationServiceUsageRealization__Group__0
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
    // InternalComponentDefinition.g:969:1: entryRulePublicOperationMode : rulePublicOperationMode EOF ;
    public final void entryRulePublicOperationMode() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:970:1: ( rulePublicOperationMode EOF )
            // InternalComponentDefinition.g:971:1: rulePublicOperationMode EOF
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
    // InternalComponentDefinition.g:978:1: rulePublicOperationMode : ( ( rule__PublicOperationMode__Group__0 ) ) ;
    public final void rulePublicOperationMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:982:2: ( ( ( rule__PublicOperationMode__Group__0 ) ) )
            // InternalComponentDefinition.g:983:2: ( ( rule__PublicOperationMode__Group__0 ) )
            {
            // InternalComponentDefinition.g:983:2: ( ( rule__PublicOperationMode__Group__0 ) )
            // InternalComponentDefinition.g:984:3: ( rule__PublicOperationMode__Group__0 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getGroup()); 
            // InternalComponentDefinition.g:985:3: ( rule__PublicOperationMode__Group__0 )
            // InternalComponentDefinition.g:985:4: rule__PublicOperationMode__Group__0
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
    // InternalComponentDefinition.g:994:1: entryRulePrivateOperationMode : rulePrivateOperationMode EOF ;
    public final void entryRulePrivateOperationMode() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:995:1: ( rulePrivateOperationMode EOF )
            // InternalComponentDefinition.g:996:1: rulePrivateOperationMode EOF
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
    // InternalComponentDefinition.g:1003:1: rulePrivateOperationMode : ( ( rule__PrivateOperationMode__Group__0 ) ) ;
    public final void rulePrivateOperationMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1007:2: ( ( ( rule__PrivateOperationMode__Group__0 ) ) )
            // InternalComponentDefinition.g:1008:2: ( ( rule__PrivateOperationMode__Group__0 ) )
            {
            // InternalComponentDefinition.g:1008:2: ( ( rule__PrivateOperationMode__Group__0 ) )
            // InternalComponentDefinition.g:1009:3: ( rule__PrivateOperationMode__Group__0 )
            {
             before(grammarAccess.getPrivateOperationModeAccess().getGroup()); 
            // InternalComponentDefinition.g:1010:3: ( rule__PrivateOperationMode__Group__0 )
            // InternalComponentDefinition.g:1010:4: rule__PrivateOperationMode__Group__0
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
    // InternalComponentDefinition.g:1019:1: entryRuleCoordinationMasterPort : ruleCoordinationMasterPort EOF ;
    public final void entryRuleCoordinationMasterPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1020:1: ( ruleCoordinationMasterPort EOF )
            // InternalComponentDefinition.g:1021:1: ruleCoordinationMasterPort EOF
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
    // InternalComponentDefinition.g:1028:1: ruleCoordinationMasterPort : ( ( rule__CoordinationMasterPort__Group__0 ) ) ;
    public final void ruleCoordinationMasterPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1032:2: ( ( ( rule__CoordinationMasterPort__Group__0 ) ) )
            // InternalComponentDefinition.g:1033:2: ( ( rule__CoordinationMasterPort__Group__0 ) )
            {
            // InternalComponentDefinition.g:1033:2: ( ( rule__CoordinationMasterPort__Group__0 ) )
            // InternalComponentDefinition.g:1034:3: ( rule__CoordinationMasterPort__Group__0 )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getGroup()); 
            // InternalComponentDefinition.g:1035:3: ( rule__CoordinationMasterPort__Group__0 )
            // InternalComponentDefinition.g:1035:4: rule__CoordinationMasterPort__Group__0
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
    // InternalComponentDefinition.g:1044:1: entryRuleComponentParametersRef : ruleComponentParametersRef EOF ;
    public final void entryRuleComponentParametersRef() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1045:1: ( ruleComponentParametersRef EOF )
            // InternalComponentDefinition.g:1046:1: ruleComponentParametersRef EOF
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
    // InternalComponentDefinition.g:1053:1: ruleComponentParametersRef : ( ( rule__ComponentParametersRef__Group__0 ) ) ;
    public final void ruleComponentParametersRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1057:2: ( ( ( rule__ComponentParametersRef__Group__0 ) ) )
            // InternalComponentDefinition.g:1058:2: ( ( rule__ComponentParametersRef__Group__0 ) )
            {
            // InternalComponentDefinition.g:1058:2: ( ( rule__ComponentParametersRef__Group__0 ) )
            // InternalComponentDefinition.g:1059:3: ( rule__ComponentParametersRef__Group__0 )
            {
             before(grammarAccess.getComponentParametersRefAccess().getGroup()); 
            // InternalComponentDefinition.g:1060:3: ( rule__ComponentParametersRef__Group__0 )
            // InternalComponentDefinition.g:1060:4: rule__ComponentParametersRef__Group__0
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
    // InternalComponentDefinition.g:1069:1: entryRuleRoboticMiddleware : ruleRoboticMiddleware EOF ;
    public final void entryRuleRoboticMiddleware() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1070:1: ( ruleRoboticMiddleware EOF )
            // InternalComponentDefinition.g:1071:1: ruleRoboticMiddleware EOF
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
    // InternalComponentDefinition.g:1078:1: ruleRoboticMiddleware : ( ( rule__RoboticMiddleware__Alternatives ) ) ;
    public final void ruleRoboticMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1082:2: ( ( ( rule__RoboticMiddleware__Alternatives ) ) )
            // InternalComponentDefinition.g:1083:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            {
            // InternalComponentDefinition.g:1083:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            // InternalComponentDefinition.g:1084:3: ( rule__RoboticMiddleware__Alternatives )
            {
             before(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); 
            // InternalComponentDefinition.g:1085:3: ( rule__RoboticMiddleware__Alternatives )
            // InternalComponentDefinition.g:1085:4: rule__RoboticMiddleware__Alternatives
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
    // InternalComponentDefinition.g:1094:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1095:1: ( ruleFQN EOF )
            // InternalComponentDefinition.g:1096:1: ruleFQN EOF
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
    // InternalComponentDefinition.g:1103:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1107:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalComponentDefinition.g:1108:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalComponentDefinition.g:1108:2: ( ( rule__FQN__Group__0 ) )
            // InternalComponentDefinition.g:1109:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalComponentDefinition.g:1110:3: ( rule__FQN__Group__0 )
            // InternalComponentDefinition.g:1110:4: rule__FQN__Group__0
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
    // InternalComponentDefinition.g:1119:1: entryRuleFQNW : ruleFQNW EOF ;
    public final void entryRuleFQNW() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1120:1: ( ruleFQNW EOF )
            // InternalComponentDefinition.g:1121:1: ruleFQNW EOF
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
    // InternalComponentDefinition.g:1128:1: ruleFQNW : ( ( rule__FQNW__Group__0 ) ) ;
    public final void ruleFQNW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1132:2: ( ( ( rule__FQNW__Group__0 ) ) )
            // InternalComponentDefinition.g:1133:2: ( ( rule__FQNW__Group__0 ) )
            {
            // InternalComponentDefinition.g:1133:2: ( ( rule__FQNW__Group__0 ) )
            // InternalComponentDefinition.g:1134:3: ( rule__FQNW__Group__0 )
            {
             before(grammarAccess.getFQNWAccess().getGroup()); 
            // InternalComponentDefinition.g:1135:3: ( rule__FQNW__Group__0 )
            // InternalComponentDefinition.g:1135:4: rule__FQNW__Group__0
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
    // InternalComponentDefinition.g:1144:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1145:1: ( ruleEString EOF )
            // InternalComponentDefinition.g:1146:1: ruleEString EOF
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
    // InternalComponentDefinition.g:1153:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1157:2: ( ( RULE_STRING ) )
            // InternalComponentDefinition.g:1158:2: ( RULE_STRING )
            {
            // InternalComponentDefinition.g:1158:2: ( RULE_STRING )
            // InternalComponentDefinition.g:1159:3: RULE_STRING
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
    // InternalComponentDefinition.g:1169:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1170:1: ( ruleEInt EOF )
            // InternalComponentDefinition.g:1171:1: ruleEInt EOF
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
    // InternalComponentDefinition.g:1178:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1182:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalComponentDefinition.g:1183:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalComponentDefinition.g:1183:2: ( ( rule__EInt__Group__0 ) )
            // InternalComponentDefinition.g:1184:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalComponentDefinition.g:1185:3: ( rule__EInt__Group__0 )
            // InternalComponentDefinition.g:1185:4: rule__EInt__Group__0
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
    // InternalComponentDefinition.g:1194:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1195:1: ( ruleEDouble EOF )
            // InternalComponentDefinition.g:1196:1: ruleEDouble EOF
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
    // InternalComponentDefinition.g:1203:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1207:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalComponentDefinition.g:1208:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalComponentDefinition.g:1208:2: ( ( rule__EDouble__Group__0 ) )
            // InternalComponentDefinition.g:1209:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalComponentDefinition.g:1210:3: ( rule__EDouble__Group__0 )
            // InternalComponentDefinition.g:1210:4: rule__EDouble__Group__0
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
    // InternalComponentDefinition.g:1219:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1220:1: ( ruleEBoolean EOF )
            // InternalComponentDefinition.g:1221:1: ruleEBoolean EOF
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
    // InternalComponentDefinition.g:1228:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1232:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalComponentDefinition.g:1233:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalComponentDefinition.g:1233:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalComponentDefinition.g:1234:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalComponentDefinition.g:1235:3: ( rule__EBoolean__Alternatives )
            // InternalComponentDefinition.g:1235:4: rule__EBoolean__Alternatives
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
    // InternalComponentDefinition.g:1244:1: entryRuleACE_SmartSoft : ruleACE_SmartSoft EOF ;
    public final void entryRuleACE_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1245:1: ( ruleACE_SmartSoft EOF )
            // InternalComponentDefinition.g:1246:1: ruleACE_SmartSoft EOF
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
    // InternalComponentDefinition.g:1253:1: ruleACE_SmartSoft : ( ( rule__ACE_SmartSoft__Group__0 ) ) ;
    public final void ruleACE_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1257:2: ( ( ( rule__ACE_SmartSoft__Group__0 ) ) )
            // InternalComponentDefinition.g:1258:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            {
            // InternalComponentDefinition.g:1258:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            // InternalComponentDefinition.g:1259:3: ( rule__ACE_SmartSoft__Group__0 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup()); 
            // InternalComponentDefinition.g:1260:3: ( rule__ACE_SmartSoft__Group__0 )
            // InternalComponentDefinition.g:1260:4: rule__ACE_SmartSoft__Group__0
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
    // InternalComponentDefinition.g:1269:1: entryRuleOpcUa_SeRoNet : ruleOpcUa_SeRoNet EOF ;
    public final void entryRuleOpcUa_SeRoNet() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1270:1: ( ruleOpcUa_SeRoNet EOF )
            // InternalComponentDefinition.g:1271:1: ruleOpcUa_SeRoNet EOF
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
    // InternalComponentDefinition.g:1278:1: ruleOpcUa_SeRoNet : ( ( rule__OpcUa_SeRoNet__Group__0 ) ) ;
    public final void ruleOpcUa_SeRoNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1282:2: ( ( ( rule__OpcUa_SeRoNet__Group__0 ) ) )
            // InternalComponentDefinition.g:1283:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            {
            // InternalComponentDefinition.g:1283:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            // InternalComponentDefinition.g:1284:3: ( rule__OpcUa_SeRoNet__Group__0 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); 
            // InternalComponentDefinition.g:1285:3: ( rule__OpcUa_SeRoNet__Group__0 )
            // InternalComponentDefinition.g:1285:4: rule__OpcUa_SeRoNet__Group__0
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
    // InternalComponentDefinition.g:1294:1: entryRuleCORBA_SmartSoft : ruleCORBA_SmartSoft EOF ;
    public final void entryRuleCORBA_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1295:1: ( ruleCORBA_SmartSoft EOF )
            // InternalComponentDefinition.g:1296:1: ruleCORBA_SmartSoft EOF
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
    // InternalComponentDefinition.g:1303:1: ruleCORBA_SmartSoft : ( ( rule__CORBA_SmartSoft__Group__0 ) ) ;
    public final void ruleCORBA_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1307:2: ( ( ( rule__CORBA_SmartSoft__Group__0 ) ) )
            // InternalComponentDefinition.g:1308:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            {
            // InternalComponentDefinition.g:1308:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            // InternalComponentDefinition.g:1309:3: ( rule__CORBA_SmartSoft__Group__0 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); 
            // InternalComponentDefinition.g:1310:3: ( rule__CORBA_SmartSoft__Group__0 )
            // InternalComponentDefinition.g:1310:4: rule__CORBA_SmartSoft__Group__0
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
    // InternalComponentDefinition.g:1319:1: entryRuleDDS_SmartSoft : ruleDDS_SmartSoft EOF ;
    public final void entryRuleDDS_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1320:1: ( ruleDDS_SmartSoft EOF )
            // InternalComponentDefinition.g:1321:1: ruleDDS_SmartSoft EOF
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
    // InternalComponentDefinition.g:1328:1: ruleDDS_SmartSoft : ( ( rule__DDS_SmartSoft__Group__0 ) ) ;
    public final void ruleDDS_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1332:2: ( ( ( rule__DDS_SmartSoft__Group__0 ) ) )
            // InternalComponentDefinition.g:1333:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            {
            // InternalComponentDefinition.g:1333:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            // InternalComponentDefinition.g:1334:3: ( rule__DDS_SmartSoft__Group__0 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup()); 
            // InternalComponentDefinition.g:1335:3: ( rule__DDS_SmartSoft__Group__0 )
            // InternalComponentDefinition.g:1335:4: rule__DDS_SmartSoft__Group__0
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
    // InternalComponentDefinition.g:1343:1: rule__AbstractComponentElement__Alternatives : ( ( ruleNamedComponentElement ) | ( ruleDerivedComponentElement ) );
    public final void rule__AbstractComponentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1347:1: ( ( ruleNamedComponentElement ) | ( ruleDerivedComponentElement ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21||LA1_0==23||(LA1_0>=25 && LA1_0<=26)||(LA1_0>=28 && LA1_0<=29)||LA1_0==31||LA1_0==48||LA1_0==51||LA1_0==53||LA1_0==61) ) {
                alt1=1;
            }
            else if ( (LA1_0==62) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentDefinition.g:1348:2: ( ruleNamedComponentElement )
                    {
                    // InternalComponentDefinition.g:1348:2: ( ruleNamedComponentElement )
                    // InternalComponentDefinition.g:1349:3: ruleNamedComponentElement
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
                    // InternalComponentDefinition.g:1354:2: ( ruleDerivedComponentElement )
                    {
                    // InternalComponentDefinition.g:1354:2: ( ruleDerivedComponentElement )
                    // InternalComponentDefinition.g:1355:3: ruleDerivedComponentElement
                    {
                     before(grammarAccess.getAbstractComponentElementAccess().getDerivedComponentElementParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleDerivedComponentElement();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentElementAccess().getDerivedComponentElementParserRuleCall_1()); 

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


    // $ANTLR start "rule__NamedComponentElement__Alternatives"
    // InternalComponentDefinition.g:1364:1: rule__NamedComponentElement__Alternatives : ( ( ruleComponentSubNode ) | ( ruleComponentPort ) | ( ruleCoordinationSlavePort ) | ( ruleCoordinationMasterPort ) | ( rulePlainOpcUaPort ) );
    public final void rule__NamedComponentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1368:1: ( ( ruleComponentSubNode ) | ( ruleComponentPort ) | ( ruleCoordinationSlavePort ) | ( ruleCoordinationMasterPort ) | ( rulePlainOpcUaPort ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 28:
            case 29:
            case 31:
                {
                alt2=1;
                }
                break;
            case 21:
            case 23:
            case 25:
            case 26:
                {
                alt2=2;
                }
                break;
            case 53:
                {
                alt2=3;
                }
                break;
            case 61:
                {
                alt2=4;
                }
                break;
            case 48:
            case 51:
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalComponentDefinition.g:1369:2: ( ruleComponentSubNode )
                    {
                    // InternalComponentDefinition.g:1369:2: ( ruleComponentSubNode )
                    // InternalComponentDefinition.g:1370:3: ruleComponentSubNode
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
                    // InternalComponentDefinition.g:1375:2: ( ruleComponentPort )
                    {
                    // InternalComponentDefinition.g:1375:2: ( ruleComponentPort )
                    // InternalComponentDefinition.g:1376:3: ruleComponentPort
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
                    // InternalComponentDefinition.g:1381:2: ( ruleCoordinationSlavePort )
                    {
                    // InternalComponentDefinition.g:1381:2: ( ruleCoordinationSlavePort )
                    // InternalComponentDefinition.g:1382:3: ruleCoordinationSlavePort
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
                    // InternalComponentDefinition.g:1387:2: ( ruleCoordinationMasterPort )
                    {
                    // InternalComponentDefinition.g:1387:2: ( ruleCoordinationMasterPort )
                    // InternalComponentDefinition.g:1388:3: ruleCoordinationMasterPort
                    {
                     before(grammarAccess.getNamedComponentElementAccess().getCoordinationMasterPortParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleCoordinationMasterPort();

                    state._fsp--;

                     after(grammarAccess.getNamedComponentElementAccess().getCoordinationMasterPortParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentDefinition.g:1393:2: ( rulePlainOpcUaPort )
                    {
                    // InternalComponentDefinition.g:1393:2: ( rulePlainOpcUaPort )
                    // InternalComponentDefinition.g:1394:3: rulePlainOpcUaPort
                    {
                     before(grammarAccess.getNamedComponentElementAccess().getPlainOpcUaPortParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    rulePlainOpcUaPort();

                    state._fsp--;

                     after(grammarAccess.getNamedComponentElementAccess().getPlainOpcUaPortParserRuleCall_4()); 

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
    // InternalComponentDefinition.g:1403:1: rule__ComponentSubNode__Alternatives : ( ( ruleActivity ) | ( ruleInputHandler ) | ( ruleRequestHandler ) );
    public final void rule__ComponentSubNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1407:1: ( ( ruleActivity ) | ( ruleInputHandler ) | ( ruleRequestHandler ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt3=1;
                }
                break;
            case 29:
                {
                alt3=2;
                }
                break;
            case 31:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalComponentDefinition.g:1408:2: ( ruleActivity )
                    {
                    // InternalComponentDefinition.g:1408:2: ( ruleActivity )
                    // InternalComponentDefinition.g:1409:3: ruleActivity
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
                    // InternalComponentDefinition.g:1414:2: ( ruleInputHandler )
                    {
                    // InternalComponentDefinition.g:1414:2: ( ruleInputHandler )
                    // InternalComponentDefinition.g:1415:3: ruleInputHandler
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
                    // InternalComponentDefinition.g:1420:2: ( ruleRequestHandler )
                    {
                    // InternalComponentDefinition.g:1420:2: ( ruleRequestHandler )
                    // InternalComponentDefinition.g:1421:3: ruleRequestHandler
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
    // InternalComponentDefinition.g:1430:1: rule__ComponentPort__Alternatives : ( ( ruleInputPort ) | ( ruleAnswerPort ) | ( ruleOutputPort ) | ( ruleRequestPort ) );
    public final void rule__ComponentPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1434:1: ( ( ruleInputPort ) | ( ruleAnswerPort ) | ( ruleOutputPort ) | ( ruleRequestPort ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt4=1;
                }
                break;
            case 25:
                {
                alt4=2;
                }
                break;
            case 23:
                {
                alt4=3;
                }
                break;
            case 21:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalComponentDefinition.g:1435:2: ( ruleInputPort )
                    {
                    // InternalComponentDefinition.g:1435:2: ( ruleInputPort )
                    // InternalComponentDefinition.g:1436:3: ruleInputPort
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
                    // InternalComponentDefinition.g:1441:2: ( ruleAnswerPort )
                    {
                    // InternalComponentDefinition.g:1441:2: ( ruleAnswerPort )
                    // InternalComponentDefinition.g:1442:3: ruleAnswerPort
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
                    // InternalComponentDefinition.g:1447:2: ( ruleOutputPort )
                    {
                    // InternalComponentDefinition.g:1447:2: ( ruleOutputPort )
                    // InternalComponentDefinition.g:1448:3: ruleOutputPort
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
                    // InternalComponentDefinition.g:1453:2: ( ruleRequestPort )
                    {
                    // InternalComponentDefinition.g:1453:2: ( ruleRequestPort )
                    // InternalComponentDefinition.g:1454:3: ruleRequestPort
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
    // InternalComponentDefinition.g:1463:1: rule__AbstractComponentLink__Alternatives : ( ( ruleComponentSubNodeObserver ) | ( ruleRequestPortLink ) | ( ruleInputLinkExtension ) | ( ruleOpcUaClientLink ) );
    public final void rule__AbstractComponentLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1467:1: ( ( ruleComponentSubNodeObserver ) | ( ruleRequestPortLink ) | ( ruleInputLinkExtension ) | ( ruleOpcUaClientLink ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 35:
                {
                alt5=3;
                }
                break;
            case 33:
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
                    // InternalComponentDefinition.g:1468:2: ( ruleComponentSubNodeObserver )
                    {
                    // InternalComponentDefinition.g:1468:2: ( ruleComponentSubNodeObserver )
                    // InternalComponentDefinition.g:1469:3: ruleComponentSubNodeObserver
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
                    // InternalComponentDefinition.g:1474:2: ( ruleRequestPortLink )
                    {
                    // InternalComponentDefinition.g:1474:2: ( ruleRequestPortLink )
                    // InternalComponentDefinition.g:1475:3: ruleRequestPortLink
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
                    // InternalComponentDefinition.g:1480:2: ( ruleInputLinkExtension )
                    {
                    // InternalComponentDefinition.g:1480:2: ( ruleInputLinkExtension )
                    // InternalComponentDefinition.g:1481:3: ruleInputLinkExtension
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
                    // InternalComponentDefinition.g:1486:2: ( ruleOpcUaClientLink )
                    {
                    // InternalComponentDefinition.g:1486:2: ( ruleOpcUaClientLink )
                    // InternalComponentDefinition.g:1487:3: ruleOpcUaClientLink
                    {
                     before(grammarAccess.getAbstractComponentLinkAccess().getOpcUaClientLinkParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOpcUaClientLink();

                    state._fsp--;

                     after(grammarAccess.getAbstractComponentLinkAccess().getOpcUaClientLinkParserRuleCall_3()); 

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
    // InternalComponentDefinition.g:1496:1: rule__ActivityExtension__Alternatives : ( ( ruleActivationConstraints ) | ( ruleOperationModeBinding ) | ( ruleDefaultTrigger ) );
    public final void rule__ActivityExtension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1500:1: ( ( ruleActivationConstraints ) | ( ruleOperationModeBinding ) | ( ruleDefaultTrigger ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt6=1;
                }
                break;
            case 42:
                {
                alt6=2;
                }
                break;
            case 43:
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
                    // InternalComponentDefinition.g:1501:2: ( ruleActivationConstraints )
                    {
                    // InternalComponentDefinition.g:1501:2: ( ruleActivationConstraints )
                    // InternalComponentDefinition.g:1502:3: ruleActivationConstraints
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
                    // InternalComponentDefinition.g:1507:2: ( ruleOperationModeBinding )
                    {
                    // InternalComponentDefinition.g:1507:2: ( ruleOperationModeBinding )
                    // InternalComponentDefinition.g:1508:3: ruleOperationModeBinding
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
                    // InternalComponentDefinition.g:1513:2: ( ruleDefaultTrigger )
                    {
                    // InternalComponentDefinition.g:1513:2: ( ruleDefaultTrigger )
                    // InternalComponentDefinition.g:1514:3: ruleDefaultTrigger
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
    // InternalComponentDefinition.g:1523:1: rule__DefaultTrigger__Alternatives_1 : ( ( ruleDefaultInputTrigger ) | ( ruleDefaultPeriodicTimer ) | ( ruleDefaultObservedElementTrigger ) );
    public final void rule__DefaultTrigger__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1527:1: ( ( ruleDefaultInputTrigger ) | ( ruleDefaultPeriodicTimer ) | ( ruleDefaultObservedElementTrigger ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt7=1;
                }
                break;
            case 46:
                {
                alt7=2;
                }
                break;
            case 47:
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
                    // InternalComponentDefinition.g:1528:2: ( ruleDefaultInputTrigger )
                    {
                    // InternalComponentDefinition.g:1528:2: ( ruleDefaultInputTrigger )
                    // InternalComponentDefinition.g:1529:3: ruleDefaultInputTrigger
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
                    // InternalComponentDefinition.g:1534:2: ( ruleDefaultPeriodicTimer )
                    {
                    // InternalComponentDefinition.g:1534:2: ( ruleDefaultPeriodicTimer )
                    // InternalComponentDefinition.g:1535:3: ruleDefaultPeriodicTimer
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
                    // InternalComponentDefinition.g:1540:2: ( ruleDefaultObservedElementTrigger )
                    {
                    // InternalComponentDefinition.g:1540:2: ( ruleDefaultObservedElementTrigger )
                    // InternalComponentDefinition.g:1541:3: ruleDefaultObservedElementTrigger
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
    // InternalComponentDefinition.g:1550:1: rule__PlainOpcUaPort__Alternatives : ( ( ruleOpcUaDeviceClient ) | ( ruleOpcUaStatusServer ) );
    public final void rule__PlainOpcUaPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1554:1: ( ( ruleOpcUaDeviceClient ) | ( ruleOpcUaStatusServer ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==48) ) {
                alt8=1;
            }
            else if ( (LA8_0==51) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentDefinition.g:1555:2: ( ruleOpcUaDeviceClient )
                    {
                    // InternalComponentDefinition.g:1555:2: ( ruleOpcUaDeviceClient )
                    // InternalComponentDefinition.g:1556:3: ruleOpcUaDeviceClient
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
                    // InternalComponentDefinition.g:1561:2: ( ruleOpcUaStatusServer )
                    {
                    // InternalComponentDefinition.g:1561:2: ( ruleOpcUaStatusServer )
                    // InternalComponentDefinition.g:1562:3: ruleOpcUaStatusServer
                    {
                     before(grammarAccess.getPlainOpcUaPortAccess().getOpcUaStatusServerParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleOpcUaStatusServer();

                    state._fsp--;

                     after(grammarAccess.getPlainOpcUaPortAccess().getOpcUaStatusServerParserRuleCall_1()); 

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
    // InternalComponentDefinition.g:1571:1: rule__AbstractCoordinationElement__Alternatives : ( ( rulePublicOperationMode ) | ( rulePrivateOperationMode ) | ( ruleCommunicationServiceUsageRealization ) );
    public final void rule__AbstractCoordinationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1575:1: ( ( rulePublicOperationMode ) | ( rulePrivateOperationMode ) | ( ruleCommunicationServiceUsageRealization ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 55:
            case 72:
                {
                alt9=1;
                }
                break;
            case 60:
                {
                alt9=2;
                }
                break;
            case 54:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalComponentDefinition.g:1576:2: ( rulePublicOperationMode )
                    {
                    // InternalComponentDefinition.g:1576:2: ( rulePublicOperationMode )
                    // InternalComponentDefinition.g:1577:3: rulePublicOperationMode
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
                    // InternalComponentDefinition.g:1582:2: ( rulePrivateOperationMode )
                    {
                    // InternalComponentDefinition.g:1582:2: ( rulePrivateOperationMode )
                    // InternalComponentDefinition.g:1583:3: rulePrivateOperationMode
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
                    // InternalComponentDefinition.g:1588:2: ( ruleCommunicationServiceUsageRealization )
                    {
                    // InternalComponentDefinition.g:1588:2: ( ruleCommunicationServiceUsageRealization )
                    // InternalComponentDefinition.g:1589:3: ruleCommunicationServiceUsageRealization
                    {
                     before(grammarAccess.getAbstractCoordinationElementAccess().getCommunicationServiceUsageRealizationParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleCommunicationServiceUsageRealization();

                    state._fsp--;

                     after(grammarAccess.getAbstractCoordinationElementAccess().getCommunicationServiceUsageRealizationParserRuleCall_2()); 

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
    // InternalComponentDefinition.g:1598:1: rule__RoboticMiddleware__Alternatives : ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) );
    public final void rule__RoboticMiddleware__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1602:1: ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt10=1;
                }
                break;
            case 69:
                {
                alt10=2;
                }
                break;
            case 70:
                {
                alt10=3;
                }
                break;
            case 71:
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
                    // InternalComponentDefinition.g:1603:2: ( ruleACE_SmartSoft )
                    {
                    // InternalComponentDefinition.g:1603:2: ( ruleACE_SmartSoft )
                    // InternalComponentDefinition.g:1604:3: ruleACE_SmartSoft
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
                    // InternalComponentDefinition.g:1609:2: ( ruleOpcUa_SeRoNet )
                    {
                    // InternalComponentDefinition.g:1609:2: ( ruleOpcUa_SeRoNet )
                    // InternalComponentDefinition.g:1610:3: ruleOpcUa_SeRoNet
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
                    // InternalComponentDefinition.g:1615:2: ( ruleCORBA_SmartSoft )
                    {
                    // InternalComponentDefinition.g:1615:2: ( ruleCORBA_SmartSoft )
                    // InternalComponentDefinition.g:1616:3: ruleCORBA_SmartSoft
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
                    // InternalComponentDefinition.g:1621:2: ( ruleDDS_SmartSoft )
                    {
                    // InternalComponentDefinition.g:1621:2: ( ruleDDS_SmartSoft )
                    // InternalComponentDefinition.g:1622:3: ruleDDS_SmartSoft
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
    // InternalComponentDefinition.g:1631:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1635:1: ( ( 'E' ) | ( 'e' ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==11) ) {
                alt11=1;
            }
            else if ( (LA11_0==12) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentDefinition.g:1636:2: ( 'E' )
                    {
                    // InternalComponentDefinition.g:1636:2: ( 'E' )
                    // InternalComponentDefinition.g:1637:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1642:2: ( 'e' )
                    {
                    // InternalComponentDefinition.g:1642:2: ( 'e' )
                    // InternalComponentDefinition.g:1643:3: 'e'
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
    // InternalComponentDefinition.g:1652:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1656:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentDefinition.g:1657:2: ( 'true' )
                    {
                    // InternalComponentDefinition.g:1657:2: ( 'true' )
                    // InternalComponentDefinition.g:1658:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1663:2: ( 'false' )
                    {
                    // InternalComponentDefinition.g:1663:2: ( 'false' )
                    // InternalComponentDefinition.g:1664:3: 'false'
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
    // InternalComponentDefinition.g:1673:1: rule__ComponentDefModel__Group__0 : rule__ComponentDefModel__Group__0__Impl rule__ComponentDefModel__Group__1 ;
    public final void rule__ComponentDefModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1677:1: ( rule__ComponentDefModel__Group__0__Impl rule__ComponentDefModel__Group__1 )
            // InternalComponentDefinition.g:1678:2: rule__ComponentDefModel__Group__0__Impl rule__ComponentDefModel__Group__1
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
    // InternalComponentDefinition.g:1685:1: rule__ComponentDefModel__Group__0__Impl : ( () ) ;
    public final void rule__ComponentDefModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1689:1: ( ( () ) )
            // InternalComponentDefinition.g:1690:1: ( () )
            {
            // InternalComponentDefinition.g:1690:1: ( () )
            // InternalComponentDefinition.g:1691:2: ()
            {
             before(grammarAccess.getComponentDefModelAccess().getComponentDefModelAction_0()); 
            // InternalComponentDefinition.g:1692:2: ()
            // InternalComponentDefinition.g:1692:3: 
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
    // InternalComponentDefinition.g:1700:1: rule__ComponentDefModel__Group__1 : rule__ComponentDefModel__Group__1__Impl rule__ComponentDefModel__Group__2 ;
    public final void rule__ComponentDefModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1704:1: ( rule__ComponentDefModel__Group__1__Impl rule__ComponentDefModel__Group__2 )
            // InternalComponentDefinition.g:1705:2: rule__ComponentDefModel__Group__1__Impl rule__ComponentDefModel__Group__2
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
    // InternalComponentDefinition.g:1712:1: rule__ComponentDefModel__Group__1__Impl : ( ( rule__ComponentDefModel__ImportsAssignment_1 )* ) ;
    public final void rule__ComponentDefModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1716:1: ( ( ( rule__ComponentDefModel__ImportsAssignment_1 )* ) )
            // InternalComponentDefinition.g:1717:1: ( ( rule__ComponentDefModel__ImportsAssignment_1 )* )
            {
            // InternalComponentDefinition.g:1717:1: ( ( rule__ComponentDefModel__ImportsAssignment_1 )* )
            // InternalComponentDefinition.g:1718:2: ( rule__ComponentDefModel__ImportsAssignment_1 )*
            {
             before(grammarAccess.getComponentDefModelAccess().getImportsAssignment_1()); 
            // InternalComponentDefinition.g:1719:2: ( rule__ComponentDefModel__ImportsAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==15) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalComponentDefinition.g:1719:3: rule__ComponentDefModel__ImportsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__ComponentDefModel__ImportsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalComponentDefinition.g:1727:1: rule__ComponentDefModel__Group__2 : rule__ComponentDefModel__Group__2__Impl ;
    public final void rule__ComponentDefModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1731:1: ( rule__ComponentDefModel__Group__2__Impl )
            // InternalComponentDefinition.g:1732:2: rule__ComponentDefModel__Group__2__Impl
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
    // InternalComponentDefinition.g:1738:1: rule__ComponentDefModel__Group__2__Impl : ( ( rule__ComponentDefModel__ComponentAssignment_2 )? ) ;
    public final void rule__ComponentDefModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1742:1: ( ( ( rule__ComponentDefModel__ComponentAssignment_2 )? ) )
            // InternalComponentDefinition.g:1743:1: ( ( rule__ComponentDefModel__ComponentAssignment_2 )? )
            {
            // InternalComponentDefinition.g:1743:1: ( ( rule__ComponentDefModel__ComponentAssignment_2 )? )
            // InternalComponentDefinition.g:1744:2: ( rule__ComponentDefModel__ComponentAssignment_2 )?
            {
             before(grammarAccess.getComponentDefModelAccess().getComponentAssignment_2()); 
            // InternalComponentDefinition.g:1745:2: ( rule__ComponentDefModel__ComponentAssignment_2 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentDefinition.g:1745:3: rule__ComponentDefModel__ComponentAssignment_2
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
    // InternalComponentDefinition.g:1754:1: rule__ServiceRepoImport__Group__0 : rule__ServiceRepoImport__Group__0__Impl rule__ServiceRepoImport__Group__1 ;
    public final void rule__ServiceRepoImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1758:1: ( rule__ServiceRepoImport__Group__0__Impl rule__ServiceRepoImport__Group__1 )
            // InternalComponentDefinition.g:1759:2: rule__ServiceRepoImport__Group__0__Impl rule__ServiceRepoImport__Group__1
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
    // InternalComponentDefinition.g:1766:1: rule__ServiceRepoImport__Group__0__Impl : ( '#import' ) ;
    public final void rule__ServiceRepoImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1770:1: ( ( '#import' ) )
            // InternalComponentDefinition.g:1771:1: ( '#import' )
            {
            // InternalComponentDefinition.g:1771:1: ( '#import' )
            // InternalComponentDefinition.g:1772:2: '#import'
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
    // InternalComponentDefinition.g:1781:1: rule__ServiceRepoImport__Group__1 : rule__ServiceRepoImport__Group__1__Impl rule__ServiceRepoImport__Group__2 ;
    public final void rule__ServiceRepoImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1785:1: ( rule__ServiceRepoImport__Group__1__Impl rule__ServiceRepoImport__Group__2 )
            // InternalComponentDefinition.g:1786:2: rule__ServiceRepoImport__Group__1__Impl rule__ServiceRepoImport__Group__2
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
    // InternalComponentDefinition.g:1793:1: rule__ServiceRepoImport__Group__1__Impl : ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__ServiceRepoImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1797:1: ( ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalComponentDefinition.g:1798:1: ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalComponentDefinition.g:1798:1: ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) )
            // InternalComponentDefinition.g:1799:2: ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalComponentDefinition.g:1800:2: ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 )
            // InternalComponentDefinition.g:1800:3: rule__ServiceRepoImport__ImportedNamespaceAssignment_1
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
    // InternalComponentDefinition.g:1808:1: rule__ServiceRepoImport__Group__2 : rule__ServiceRepoImport__Group__2__Impl ;
    public final void rule__ServiceRepoImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1812:1: ( rule__ServiceRepoImport__Group__2__Impl )
            // InternalComponentDefinition.g:1813:2: rule__ServiceRepoImport__Group__2__Impl
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
    // InternalComponentDefinition.g:1819:1: rule__ServiceRepoImport__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ServiceRepoImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1823:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:1824:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:1824:1: ( ( ';' )? )
            // InternalComponentDefinition.g:1825:2: ( ';' )?
            {
             before(grammarAccess.getServiceRepoImportAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:1826:2: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentDefinition.g:1826:3: ';'
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
    // InternalComponentDefinition.g:1835:1: rule__ComponentDefinition__Group__0 : rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 ;
    public final void rule__ComponentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1839:1: ( rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 )
            // InternalComponentDefinition.g:1840:2: rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1
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
    // InternalComponentDefinition.g:1847:1: rule__ComponentDefinition__Group__0__Impl : ( 'ComponentDefinition' ) ;
    public final void rule__ComponentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1851:1: ( ( 'ComponentDefinition' ) )
            // InternalComponentDefinition.g:1852:1: ( 'ComponentDefinition' )
            {
            // InternalComponentDefinition.g:1852:1: ( 'ComponentDefinition' )
            // InternalComponentDefinition.g:1853:2: 'ComponentDefinition'
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
    // InternalComponentDefinition.g:1862:1: rule__ComponentDefinition__Group__1 : rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 ;
    public final void rule__ComponentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1866:1: ( rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 )
            // InternalComponentDefinition.g:1867:2: rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2
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
    // InternalComponentDefinition.g:1874:1: rule__ComponentDefinition__Group__1__Impl : ( ( rule__ComponentDefinition__NameAssignment_1 ) ) ;
    public final void rule__ComponentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1878:1: ( ( ( rule__ComponentDefinition__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:1879:1: ( ( rule__ComponentDefinition__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:1879:1: ( ( rule__ComponentDefinition__NameAssignment_1 ) )
            // InternalComponentDefinition.g:1880:2: ( rule__ComponentDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:1881:2: ( rule__ComponentDefinition__NameAssignment_1 )
            // InternalComponentDefinition.g:1881:3: rule__ComponentDefinition__NameAssignment_1
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
    // InternalComponentDefinition.g:1889:1: rule__ComponentDefinition__Group__2 : rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3 ;
    public final void rule__ComponentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1893:1: ( rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3 )
            // InternalComponentDefinition.g:1894:2: rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3
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
    // InternalComponentDefinition.g:1901:1: rule__ComponentDefinition__Group__2__Impl : ( ( rule__ComponentDefinition__Group_2__0 )? ) ;
    public final void rule__ComponentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1905:1: ( ( ( rule__ComponentDefinition__Group_2__0 )? ) )
            // InternalComponentDefinition.g:1906:1: ( ( rule__ComponentDefinition__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:1906:1: ( ( rule__ComponentDefinition__Group_2__0 )? )
            // InternalComponentDefinition.g:1907:2: ( rule__ComponentDefinition__Group_2__0 )?
            {
             before(grammarAccess.getComponentDefinitionAccess().getGroup_2()); 
            // InternalComponentDefinition.g:1908:2: ( rule__ComponentDefinition__Group_2__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentDefinition.g:1908:3: rule__ComponentDefinition__Group_2__0
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
    // InternalComponentDefinition.g:1916:1: rule__ComponentDefinition__Group__3 : rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4 ;
    public final void rule__ComponentDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1920:1: ( rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4 )
            // InternalComponentDefinition.g:1921:2: rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4
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
    // InternalComponentDefinition.g:1928:1: rule__ComponentDefinition__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1932:1: ( ( '{' ) )
            // InternalComponentDefinition.g:1933:1: ( '{' )
            {
            // InternalComponentDefinition.g:1933:1: ( '{' )
            // InternalComponentDefinition.g:1934:2: '{'
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
    // InternalComponentDefinition.g:1943:1: rule__ComponentDefinition__Group__4 : rule__ComponentDefinition__Group__4__Impl rule__ComponentDefinition__Group__5 ;
    public final void rule__ComponentDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1947:1: ( rule__ComponentDefinition__Group__4__Impl rule__ComponentDefinition__Group__5 )
            // InternalComponentDefinition.g:1948:2: rule__ComponentDefinition__Group__4__Impl rule__ComponentDefinition__Group__5
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
    // InternalComponentDefinition.g:1955:1: rule__ComponentDefinition__Group__4__Impl : ( ( rule__ComponentDefinition__ElementsAssignment_4 )* ) ;
    public final void rule__ComponentDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1959:1: ( ( ( rule__ComponentDefinition__ElementsAssignment_4 )* ) )
            // InternalComponentDefinition.g:1960:1: ( ( rule__ComponentDefinition__ElementsAssignment_4 )* )
            {
            // InternalComponentDefinition.g:1960:1: ( ( rule__ComponentDefinition__ElementsAssignment_4 )* )
            // InternalComponentDefinition.g:1961:2: ( rule__ComponentDefinition__ElementsAssignment_4 )*
            {
             before(grammarAccess.getComponentDefinitionAccess().getElementsAssignment_4()); 
            // InternalComponentDefinition.g:1962:2: ( rule__ComponentDefinition__ElementsAssignment_4 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==21||LA17_0==23||(LA17_0>=25 && LA17_0<=26)||(LA17_0>=28 && LA17_0<=29)||LA17_0==31||LA17_0==48||LA17_0==51||LA17_0==53||(LA17_0>=61 && LA17_0<=62)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComponentDefinition.g:1962:3: rule__ComponentDefinition__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__ComponentDefinition__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalComponentDefinition.g:1970:1: rule__ComponentDefinition__Group__5 : rule__ComponentDefinition__Group__5__Impl ;
    public final void rule__ComponentDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1974:1: ( rule__ComponentDefinition__Group__5__Impl )
            // InternalComponentDefinition.g:1975:2: rule__ComponentDefinition__Group__5__Impl
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
    // InternalComponentDefinition.g:1981:1: rule__ComponentDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1985:1: ( ( '}' ) )
            // InternalComponentDefinition.g:1986:1: ( '}' )
            {
            // InternalComponentDefinition.g:1986:1: ( '}' )
            // InternalComponentDefinition.g:1987:2: '}'
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
    // InternalComponentDefinition.g:1997:1: rule__ComponentDefinition__Group_2__0 : rule__ComponentDefinition__Group_2__0__Impl rule__ComponentDefinition__Group_2__1 ;
    public final void rule__ComponentDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2001:1: ( rule__ComponentDefinition__Group_2__0__Impl rule__ComponentDefinition__Group_2__1 )
            // InternalComponentDefinition.g:2002:2: rule__ComponentDefinition__Group_2__0__Impl rule__ComponentDefinition__Group_2__1
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
    // InternalComponentDefinition.g:2009:1: rule__ComponentDefinition__Group_2__0__Impl : ( 'logo' ) ;
    public final void rule__ComponentDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2013:1: ( ( 'logo' ) )
            // InternalComponentDefinition.g:2014:1: ( 'logo' )
            {
            // InternalComponentDefinition.g:2014:1: ( 'logo' )
            // InternalComponentDefinition.g:2015:2: 'logo'
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
    // InternalComponentDefinition.g:2024:1: rule__ComponentDefinition__Group_2__1 : rule__ComponentDefinition__Group_2__1__Impl ;
    public final void rule__ComponentDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2028:1: ( rule__ComponentDefinition__Group_2__1__Impl )
            // InternalComponentDefinition.g:2029:2: rule__ComponentDefinition__Group_2__1__Impl
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
    // InternalComponentDefinition.g:2035:1: rule__ComponentDefinition__Group_2__1__Impl : ( ( rule__ComponentDefinition__LogoAssignment_2_1 ) ) ;
    public final void rule__ComponentDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2039:1: ( ( ( rule__ComponentDefinition__LogoAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:2040:1: ( ( rule__ComponentDefinition__LogoAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:2040:1: ( ( rule__ComponentDefinition__LogoAssignment_2_1 ) )
            // InternalComponentDefinition.g:2041:2: ( rule__ComponentDefinition__LogoAssignment_2_1 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getLogoAssignment_2_1()); 
            // InternalComponentDefinition.g:2042:2: ( rule__ComponentDefinition__LogoAssignment_2_1 )
            // InternalComponentDefinition.g:2042:3: rule__ComponentDefinition__LogoAssignment_2_1
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
    // InternalComponentDefinition.g:2051:1: rule__RequestPort__Group__0 : rule__RequestPort__Group__0__Impl rule__RequestPort__Group__1 ;
    public final void rule__RequestPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2055:1: ( rule__RequestPort__Group__0__Impl rule__RequestPort__Group__1 )
            // InternalComponentDefinition.g:2056:2: rule__RequestPort__Group__0__Impl rule__RequestPort__Group__1
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
    // InternalComponentDefinition.g:2063:1: rule__RequestPort__Group__0__Impl : ( 'RequestPort' ) ;
    public final void rule__RequestPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2067:1: ( ( 'RequestPort' ) )
            // InternalComponentDefinition.g:2068:1: ( 'RequestPort' )
            {
            // InternalComponentDefinition.g:2068:1: ( 'RequestPort' )
            // InternalComponentDefinition.g:2069:2: 'RequestPort'
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
    // InternalComponentDefinition.g:2078:1: rule__RequestPort__Group__1 : rule__RequestPort__Group__1__Impl rule__RequestPort__Group__2 ;
    public final void rule__RequestPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2082:1: ( rule__RequestPort__Group__1__Impl rule__RequestPort__Group__2 )
            // InternalComponentDefinition.g:2083:2: rule__RequestPort__Group__1__Impl rule__RequestPort__Group__2
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
    // InternalComponentDefinition.g:2090:1: rule__RequestPort__Group__1__Impl : ( ( rule__RequestPort__NameAssignment_1 ) ) ;
    public final void rule__RequestPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2094:1: ( ( ( rule__RequestPort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:2095:1: ( ( rule__RequestPort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:2095:1: ( ( rule__RequestPort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:2096:2: ( rule__RequestPort__NameAssignment_1 )
            {
             before(grammarAccess.getRequestPortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:2097:2: ( rule__RequestPort__NameAssignment_1 )
            // InternalComponentDefinition.g:2097:3: rule__RequestPort__NameAssignment_1
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
    // InternalComponentDefinition.g:2105:1: rule__RequestPort__Group__2 : rule__RequestPort__Group__2__Impl rule__RequestPort__Group__3 ;
    public final void rule__RequestPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2109:1: ( rule__RequestPort__Group__2__Impl rule__RequestPort__Group__3 )
            // InternalComponentDefinition.g:2110:2: rule__RequestPort__Group__2__Impl rule__RequestPort__Group__3
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
    // InternalComponentDefinition.g:2117:1: rule__RequestPort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__RequestPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2121:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2122:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2122:1: ( 'implements' )
            // InternalComponentDefinition.g:2123:2: 'implements'
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
    // InternalComponentDefinition.g:2132:1: rule__RequestPort__Group__3 : rule__RequestPort__Group__3__Impl rule__RequestPort__Group__4 ;
    public final void rule__RequestPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2136:1: ( rule__RequestPort__Group__3__Impl rule__RequestPort__Group__4 )
            // InternalComponentDefinition.g:2137:2: rule__RequestPort__Group__3__Impl rule__RequestPort__Group__4
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
    // InternalComponentDefinition.g:2144:1: rule__RequestPort__Group__3__Impl : ( ( rule__RequestPort__ServiceAssignment_3 ) ) ;
    public final void rule__RequestPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2148:1: ( ( ( rule__RequestPort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:2149:1: ( ( rule__RequestPort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:2149:1: ( ( rule__RequestPort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:2150:2: ( rule__RequestPort__ServiceAssignment_3 )
            {
             before(grammarAccess.getRequestPortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:2151:2: ( rule__RequestPort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:2151:3: rule__RequestPort__ServiceAssignment_3
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
    // InternalComponentDefinition.g:2159:1: rule__RequestPort__Group__4 : rule__RequestPort__Group__4__Impl rule__RequestPort__Group__5 ;
    public final void rule__RequestPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2163:1: ( rule__RequestPort__Group__4__Impl rule__RequestPort__Group__5 )
            // InternalComponentDefinition.g:2164:2: rule__RequestPort__Group__4__Impl rule__RequestPort__Group__5
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
    // InternalComponentDefinition.g:2171:1: rule__RequestPort__Group__4__Impl : ( '{' ) ;
    public final void rule__RequestPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2175:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2176:1: ( '{' )
            {
            // InternalComponentDefinition.g:2176:1: ( '{' )
            // InternalComponentDefinition.g:2177:2: '{'
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
    // InternalComponentDefinition.g:2186:1: rule__RequestPort__Group__5 : rule__RequestPort__Group__5__Impl rule__RequestPort__Group__6 ;
    public final void rule__RequestPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2190:1: ( rule__RequestPort__Group__5__Impl rule__RequestPort__Group__6 )
            // InternalComponentDefinition.g:2191:2: rule__RequestPort__Group__5__Impl rule__RequestPort__Group__6
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
    // InternalComponentDefinition.g:2198:1: rule__RequestPort__Group__5__Impl : ( ( rule__RequestPort__ExtensionsAssignment_5 )* ) ;
    public final void rule__RequestPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2202:1: ( ( ( rule__RequestPort__ExtensionsAssignment_5 )* ) )
            // InternalComponentDefinition.g:2203:1: ( ( rule__RequestPort__ExtensionsAssignment_5 )* )
            {
            // InternalComponentDefinition.g:2203:1: ( ( rule__RequestPort__ExtensionsAssignment_5 )* )
            // InternalComponentDefinition.g:2204:2: ( rule__RequestPort__ExtensionsAssignment_5 )*
            {
             before(grammarAccess.getRequestPortAccess().getExtensionsAssignment_5()); 
            // InternalComponentDefinition.g:2205:2: ( rule__RequestPort__ExtensionsAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==27) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalComponentDefinition.g:2205:3: rule__RequestPort__ExtensionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__RequestPort__ExtensionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // InternalComponentDefinition.g:2213:1: rule__RequestPort__Group__6 : rule__RequestPort__Group__6__Impl ;
    public final void rule__RequestPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2217:1: ( rule__RequestPort__Group__6__Impl )
            // InternalComponentDefinition.g:2218:2: rule__RequestPort__Group__6__Impl
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
    // InternalComponentDefinition.g:2224:1: rule__RequestPort__Group__6__Impl : ( '}' ) ;
    public final void rule__RequestPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2228:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2229:1: ( '}' )
            {
            // InternalComponentDefinition.g:2229:1: ( '}' )
            // InternalComponentDefinition.g:2230:2: '}'
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
    // InternalComponentDefinition.g:2240:1: rule__OutputPort__Group__0 : rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 ;
    public final void rule__OutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2244:1: ( rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 )
            // InternalComponentDefinition.g:2245:2: rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1
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
    // InternalComponentDefinition.g:2252:1: rule__OutputPort__Group__0__Impl : ( 'OutputPort' ) ;
    public final void rule__OutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2256:1: ( ( 'OutputPort' ) )
            // InternalComponentDefinition.g:2257:1: ( 'OutputPort' )
            {
            // InternalComponentDefinition.g:2257:1: ( 'OutputPort' )
            // InternalComponentDefinition.g:2258:2: 'OutputPort'
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
    // InternalComponentDefinition.g:2267:1: rule__OutputPort__Group__1 : rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 ;
    public final void rule__OutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2271:1: ( rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 )
            // InternalComponentDefinition.g:2272:2: rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2
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
    // InternalComponentDefinition.g:2279:1: rule__OutputPort__Group__1__Impl : ( ( rule__OutputPort__NameAssignment_1 ) ) ;
    public final void rule__OutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2283:1: ( ( ( rule__OutputPort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:2284:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:2284:1: ( ( rule__OutputPort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:2285:2: ( rule__OutputPort__NameAssignment_1 )
            {
             before(grammarAccess.getOutputPortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:2286:2: ( rule__OutputPort__NameAssignment_1 )
            // InternalComponentDefinition.g:2286:3: rule__OutputPort__NameAssignment_1
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
    // InternalComponentDefinition.g:2294:1: rule__OutputPort__Group__2 : rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 ;
    public final void rule__OutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2298:1: ( rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 )
            // InternalComponentDefinition.g:2299:2: rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3
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
    // InternalComponentDefinition.g:2306:1: rule__OutputPort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__OutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2310:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2311:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2311:1: ( 'implements' )
            // InternalComponentDefinition.g:2312:2: 'implements'
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
    // InternalComponentDefinition.g:2321:1: rule__OutputPort__Group__3 : rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 ;
    public final void rule__OutputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2325:1: ( rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 )
            // InternalComponentDefinition.g:2326:2: rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4
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
    // InternalComponentDefinition.g:2333:1: rule__OutputPort__Group__3__Impl : ( ( rule__OutputPort__ServiceAssignment_3 ) ) ;
    public final void rule__OutputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2337:1: ( ( ( rule__OutputPort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:2338:1: ( ( rule__OutputPort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:2338:1: ( ( rule__OutputPort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:2339:2: ( rule__OutputPort__ServiceAssignment_3 )
            {
             before(grammarAccess.getOutputPortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:2340:2: ( rule__OutputPort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:2340:3: rule__OutputPort__ServiceAssignment_3
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
    // InternalComponentDefinition.g:2348:1: rule__OutputPort__Group__4 : rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 ;
    public final void rule__OutputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2352:1: ( rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 )
            // InternalComponentDefinition.g:2353:2: rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5
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
    // InternalComponentDefinition.g:2360:1: rule__OutputPort__Group__4__Impl : ( 'realizedBy' ) ;
    public final void rule__OutputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2364:1: ( ( 'realizedBy' ) )
            // InternalComponentDefinition.g:2365:1: ( 'realizedBy' )
            {
            // InternalComponentDefinition.g:2365:1: ( 'realizedBy' )
            // InternalComponentDefinition.g:2366:2: 'realizedBy'
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
    // InternalComponentDefinition.g:2375:1: rule__OutputPort__Group__5 : rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6 ;
    public final void rule__OutputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2379:1: ( rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6 )
            // InternalComponentDefinition.g:2380:2: rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6
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
    // InternalComponentDefinition.g:2387:1: rule__OutputPort__Group__5__Impl : ( ( rule__OutputPort__ActivityAssignment_5 ) ) ;
    public final void rule__OutputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2391:1: ( ( ( rule__OutputPort__ActivityAssignment_5 ) ) )
            // InternalComponentDefinition.g:2392:1: ( ( rule__OutputPort__ActivityAssignment_5 ) )
            {
            // InternalComponentDefinition.g:2392:1: ( ( rule__OutputPort__ActivityAssignment_5 ) )
            // InternalComponentDefinition.g:2393:2: ( rule__OutputPort__ActivityAssignment_5 )
            {
             before(grammarAccess.getOutputPortAccess().getActivityAssignment_5()); 
            // InternalComponentDefinition.g:2394:2: ( rule__OutputPort__ActivityAssignment_5 )
            // InternalComponentDefinition.g:2394:3: rule__OutputPort__ActivityAssignment_5
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
    // InternalComponentDefinition.g:2402:1: rule__OutputPort__Group__6 : rule__OutputPort__Group__6__Impl rule__OutputPort__Group__7 ;
    public final void rule__OutputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2406:1: ( rule__OutputPort__Group__6__Impl rule__OutputPort__Group__7 )
            // InternalComponentDefinition.g:2407:2: rule__OutputPort__Group__6__Impl rule__OutputPort__Group__7
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
    // InternalComponentDefinition.g:2414:1: rule__OutputPort__Group__6__Impl : ( '{' ) ;
    public final void rule__OutputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2418:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2419:1: ( '{' )
            {
            // InternalComponentDefinition.g:2419:1: ( '{' )
            // InternalComponentDefinition.g:2420:2: '{'
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
    // InternalComponentDefinition.g:2429:1: rule__OutputPort__Group__7 : rule__OutputPort__Group__7__Impl rule__OutputPort__Group__8 ;
    public final void rule__OutputPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2433:1: ( rule__OutputPort__Group__7__Impl rule__OutputPort__Group__8 )
            // InternalComponentDefinition.g:2434:2: rule__OutputPort__Group__7__Impl rule__OutputPort__Group__8
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
    // InternalComponentDefinition.g:2441:1: rule__OutputPort__Group__7__Impl : ( ( rule__OutputPort__ExtensionsAssignment_7 )* ) ;
    public final void rule__OutputPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2445:1: ( ( ( rule__OutputPort__ExtensionsAssignment_7 )* ) )
            // InternalComponentDefinition.g:2446:1: ( ( rule__OutputPort__ExtensionsAssignment_7 )* )
            {
            // InternalComponentDefinition.g:2446:1: ( ( rule__OutputPort__ExtensionsAssignment_7 )* )
            // InternalComponentDefinition.g:2447:2: ( rule__OutputPort__ExtensionsAssignment_7 )*
            {
             before(grammarAccess.getOutputPortAccess().getExtensionsAssignment_7()); 
            // InternalComponentDefinition.g:2448:2: ( rule__OutputPort__ExtensionsAssignment_7 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==27) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalComponentDefinition.g:2448:3: rule__OutputPort__ExtensionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__OutputPort__ExtensionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
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
    // InternalComponentDefinition.g:2456:1: rule__OutputPort__Group__8 : rule__OutputPort__Group__8__Impl ;
    public final void rule__OutputPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2460:1: ( rule__OutputPort__Group__8__Impl )
            // InternalComponentDefinition.g:2461:2: rule__OutputPort__Group__8__Impl
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
    // InternalComponentDefinition.g:2467:1: rule__OutputPort__Group__8__Impl : ( '}' ) ;
    public final void rule__OutputPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2471:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2472:1: ( '}' )
            {
            // InternalComponentDefinition.g:2472:1: ( '}' )
            // InternalComponentDefinition.g:2473:2: '}'
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
    // InternalComponentDefinition.g:2483:1: rule__AnswerPort__Group__0 : rule__AnswerPort__Group__0__Impl rule__AnswerPort__Group__1 ;
    public final void rule__AnswerPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2487:1: ( rule__AnswerPort__Group__0__Impl rule__AnswerPort__Group__1 )
            // InternalComponentDefinition.g:2488:2: rule__AnswerPort__Group__0__Impl rule__AnswerPort__Group__1
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
    // InternalComponentDefinition.g:2495:1: rule__AnswerPort__Group__0__Impl : ( 'AnswerPort' ) ;
    public final void rule__AnswerPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2499:1: ( ( 'AnswerPort' ) )
            // InternalComponentDefinition.g:2500:1: ( 'AnswerPort' )
            {
            // InternalComponentDefinition.g:2500:1: ( 'AnswerPort' )
            // InternalComponentDefinition.g:2501:2: 'AnswerPort'
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
    // InternalComponentDefinition.g:2510:1: rule__AnswerPort__Group__1 : rule__AnswerPort__Group__1__Impl rule__AnswerPort__Group__2 ;
    public final void rule__AnswerPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2514:1: ( rule__AnswerPort__Group__1__Impl rule__AnswerPort__Group__2 )
            // InternalComponentDefinition.g:2515:2: rule__AnswerPort__Group__1__Impl rule__AnswerPort__Group__2
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
    // InternalComponentDefinition.g:2522:1: rule__AnswerPort__Group__1__Impl : ( ( rule__AnswerPort__NameAssignment_1 ) ) ;
    public final void rule__AnswerPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2526:1: ( ( ( rule__AnswerPort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:2527:1: ( ( rule__AnswerPort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:2527:1: ( ( rule__AnswerPort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:2528:2: ( rule__AnswerPort__NameAssignment_1 )
            {
             before(grammarAccess.getAnswerPortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:2529:2: ( rule__AnswerPort__NameAssignment_1 )
            // InternalComponentDefinition.g:2529:3: rule__AnswerPort__NameAssignment_1
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
    // InternalComponentDefinition.g:2537:1: rule__AnswerPort__Group__2 : rule__AnswerPort__Group__2__Impl rule__AnswerPort__Group__3 ;
    public final void rule__AnswerPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2541:1: ( rule__AnswerPort__Group__2__Impl rule__AnswerPort__Group__3 )
            // InternalComponentDefinition.g:2542:2: rule__AnswerPort__Group__2__Impl rule__AnswerPort__Group__3
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
    // InternalComponentDefinition.g:2549:1: rule__AnswerPort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__AnswerPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2553:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2554:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2554:1: ( 'implements' )
            // InternalComponentDefinition.g:2555:2: 'implements'
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
    // InternalComponentDefinition.g:2564:1: rule__AnswerPort__Group__3 : rule__AnswerPort__Group__3__Impl rule__AnswerPort__Group__4 ;
    public final void rule__AnswerPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2568:1: ( rule__AnswerPort__Group__3__Impl rule__AnswerPort__Group__4 )
            // InternalComponentDefinition.g:2569:2: rule__AnswerPort__Group__3__Impl rule__AnswerPort__Group__4
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
    // InternalComponentDefinition.g:2576:1: rule__AnswerPort__Group__3__Impl : ( ( rule__AnswerPort__ServiceAssignment_3 ) ) ;
    public final void rule__AnswerPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2580:1: ( ( ( rule__AnswerPort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:2581:1: ( ( rule__AnswerPort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:2581:1: ( ( rule__AnswerPort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:2582:2: ( rule__AnswerPort__ServiceAssignment_3 )
            {
             before(grammarAccess.getAnswerPortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:2583:2: ( rule__AnswerPort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:2583:3: rule__AnswerPort__ServiceAssignment_3
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
    // InternalComponentDefinition.g:2591:1: rule__AnswerPort__Group__4 : rule__AnswerPort__Group__4__Impl rule__AnswerPort__Group__5 ;
    public final void rule__AnswerPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2595:1: ( rule__AnswerPort__Group__4__Impl rule__AnswerPort__Group__5 )
            // InternalComponentDefinition.g:2596:2: rule__AnswerPort__Group__4__Impl rule__AnswerPort__Group__5
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
    // InternalComponentDefinition.g:2603:1: rule__AnswerPort__Group__4__Impl : ( '{' ) ;
    public final void rule__AnswerPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2607:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2608:1: ( '{' )
            {
            // InternalComponentDefinition.g:2608:1: ( '{' )
            // InternalComponentDefinition.g:2609:2: '{'
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
    // InternalComponentDefinition.g:2618:1: rule__AnswerPort__Group__5 : rule__AnswerPort__Group__5__Impl rule__AnswerPort__Group__6 ;
    public final void rule__AnswerPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2622:1: ( rule__AnswerPort__Group__5__Impl rule__AnswerPort__Group__6 )
            // InternalComponentDefinition.g:2623:2: rule__AnswerPort__Group__5__Impl rule__AnswerPort__Group__6
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
    // InternalComponentDefinition.g:2630:1: rule__AnswerPort__Group__5__Impl : ( ( rule__AnswerPort__ExtensionsAssignment_5 )* ) ;
    public final void rule__AnswerPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2634:1: ( ( ( rule__AnswerPort__ExtensionsAssignment_5 )* ) )
            // InternalComponentDefinition.g:2635:1: ( ( rule__AnswerPort__ExtensionsAssignment_5 )* )
            {
            // InternalComponentDefinition.g:2635:1: ( ( rule__AnswerPort__ExtensionsAssignment_5 )* )
            // InternalComponentDefinition.g:2636:2: ( rule__AnswerPort__ExtensionsAssignment_5 )*
            {
             before(grammarAccess.getAnswerPortAccess().getExtensionsAssignment_5()); 
            // InternalComponentDefinition.g:2637:2: ( rule__AnswerPort__ExtensionsAssignment_5 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalComponentDefinition.g:2637:3: rule__AnswerPort__ExtensionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__AnswerPort__ExtensionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // InternalComponentDefinition.g:2645:1: rule__AnswerPort__Group__6 : rule__AnswerPort__Group__6__Impl ;
    public final void rule__AnswerPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2649:1: ( rule__AnswerPort__Group__6__Impl )
            // InternalComponentDefinition.g:2650:2: rule__AnswerPort__Group__6__Impl
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
    // InternalComponentDefinition.g:2656:1: rule__AnswerPort__Group__6__Impl : ( '}' ) ;
    public final void rule__AnswerPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2660:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2661:1: ( '}' )
            {
            // InternalComponentDefinition.g:2661:1: ( '}' )
            // InternalComponentDefinition.g:2662:2: '}'
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
    // InternalComponentDefinition.g:2672:1: rule__InputPort__Group__0 : rule__InputPort__Group__0__Impl rule__InputPort__Group__1 ;
    public final void rule__InputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2676:1: ( rule__InputPort__Group__0__Impl rule__InputPort__Group__1 )
            // InternalComponentDefinition.g:2677:2: rule__InputPort__Group__0__Impl rule__InputPort__Group__1
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
    // InternalComponentDefinition.g:2684:1: rule__InputPort__Group__0__Impl : ( 'InputPort' ) ;
    public final void rule__InputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2688:1: ( ( 'InputPort' ) )
            // InternalComponentDefinition.g:2689:1: ( 'InputPort' )
            {
            // InternalComponentDefinition.g:2689:1: ( 'InputPort' )
            // InternalComponentDefinition.g:2690:2: 'InputPort'
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
    // InternalComponentDefinition.g:2699:1: rule__InputPort__Group__1 : rule__InputPort__Group__1__Impl rule__InputPort__Group__2 ;
    public final void rule__InputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2703:1: ( rule__InputPort__Group__1__Impl rule__InputPort__Group__2 )
            // InternalComponentDefinition.g:2704:2: rule__InputPort__Group__1__Impl rule__InputPort__Group__2
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
    // InternalComponentDefinition.g:2711:1: rule__InputPort__Group__1__Impl : ( ( rule__InputPort__NameAssignment_1 ) ) ;
    public final void rule__InputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2715:1: ( ( ( rule__InputPort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:2716:1: ( ( rule__InputPort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:2716:1: ( ( rule__InputPort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:2717:2: ( rule__InputPort__NameAssignment_1 )
            {
             before(grammarAccess.getInputPortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:2718:2: ( rule__InputPort__NameAssignment_1 )
            // InternalComponentDefinition.g:2718:3: rule__InputPort__NameAssignment_1
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
    // InternalComponentDefinition.g:2726:1: rule__InputPort__Group__2 : rule__InputPort__Group__2__Impl rule__InputPort__Group__3 ;
    public final void rule__InputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2730:1: ( rule__InputPort__Group__2__Impl rule__InputPort__Group__3 )
            // InternalComponentDefinition.g:2731:2: rule__InputPort__Group__2__Impl rule__InputPort__Group__3
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
    // InternalComponentDefinition.g:2738:1: rule__InputPort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__InputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2742:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2743:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2743:1: ( 'implements' )
            // InternalComponentDefinition.g:2744:2: 'implements'
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
    // InternalComponentDefinition.g:2753:1: rule__InputPort__Group__3 : rule__InputPort__Group__3__Impl rule__InputPort__Group__4 ;
    public final void rule__InputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2757:1: ( rule__InputPort__Group__3__Impl rule__InputPort__Group__4 )
            // InternalComponentDefinition.g:2758:2: rule__InputPort__Group__3__Impl rule__InputPort__Group__4
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
    // InternalComponentDefinition.g:2765:1: rule__InputPort__Group__3__Impl : ( ( rule__InputPort__ServiceAssignment_3 ) ) ;
    public final void rule__InputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2769:1: ( ( ( rule__InputPort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:2770:1: ( ( rule__InputPort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:2770:1: ( ( rule__InputPort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:2771:2: ( rule__InputPort__ServiceAssignment_3 )
            {
             before(grammarAccess.getInputPortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:2772:2: ( rule__InputPort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:2772:3: rule__InputPort__ServiceAssignment_3
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
    // InternalComponentDefinition.g:2780:1: rule__InputPort__Group__4 : rule__InputPort__Group__4__Impl rule__InputPort__Group__5 ;
    public final void rule__InputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2784:1: ( rule__InputPort__Group__4__Impl rule__InputPort__Group__5 )
            // InternalComponentDefinition.g:2785:2: rule__InputPort__Group__4__Impl rule__InputPort__Group__5
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
    // InternalComponentDefinition.g:2792:1: rule__InputPort__Group__4__Impl : ( '{' ) ;
    public final void rule__InputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2796:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2797:1: ( '{' )
            {
            // InternalComponentDefinition.g:2797:1: ( '{' )
            // InternalComponentDefinition.g:2798:2: '{'
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
    // InternalComponentDefinition.g:2807:1: rule__InputPort__Group__5 : rule__InputPort__Group__5__Impl rule__InputPort__Group__6 ;
    public final void rule__InputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2811:1: ( rule__InputPort__Group__5__Impl rule__InputPort__Group__6 )
            // InternalComponentDefinition.g:2812:2: rule__InputPort__Group__5__Impl rule__InputPort__Group__6
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
    // InternalComponentDefinition.g:2819:1: rule__InputPort__Group__5__Impl : ( ( rule__InputPort__ExtensionsAssignment_5 )* ) ;
    public final void rule__InputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2823:1: ( ( ( rule__InputPort__ExtensionsAssignment_5 )* ) )
            // InternalComponentDefinition.g:2824:1: ( ( rule__InputPort__ExtensionsAssignment_5 )* )
            {
            // InternalComponentDefinition.g:2824:1: ( ( rule__InputPort__ExtensionsAssignment_5 )* )
            // InternalComponentDefinition.g:2825:2: ( rule__InputPort__ExtensionsAssignment_5 )*
            {
             before(grammarAccess.getInputPortAccess().getExtensionsAssignment_5()); 
            // InternalComponentDefinition.g:2826:2: ( rule__InputPort__ExtensionsAssignment_5 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==27) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComponentDefinition.g:2826:3: rule__InputPort__ExtensionsAssignment_5
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__InputPort__ExtensionsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // InternalComponentDefinition.g:2834:1: rule__InputPort__Group__6 : rule__InputPort__Group__6__Impl ;
    public final void rule__InputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2838:1: ( rule__InputPort__Group__6__Impl )
            // InternalComponentDefinition.g:2839:2: rule__InputPort__Group__6__Impl
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
    // InternalComponentDefinition.g:2845:1: rule__InputPort__Group__6__Impl : ( '}' ) ;
    public final void rule__InputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2849:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2850:1: ( '}' )
            {
            // InternalComponentDefinition.g:2850:1: ( '}' )
            // InternalComponentDefinition.g:2851:2: '}'
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
    // InternalComponentDefinition.g:2861:1: rule__SupportedMiddleware__Group__0 : rule__SupportedMiddleware__Group__0__Impl rule__SupportedMiddleware__Group__1 ;
    public final void rule__SupportedMiddleware__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2865:1: ( rule__SupportedMiddleware__Group__0__Impl rule__SupportedMiddleware__Group__1 )
            // InternalComponentDefinition.g:2866:2: rule__SupportedMiddleware__Group__0__Impl rule__SupportedMiddleware__Group__1
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
    // InternalComponentDefinition.g:2873:1: rule__SupportedMiddleware__Group__0__Impl : ( 'SupportedMiddleware' ) ;
    public final void rule__SupportedMiddleware__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2877:1: ( ( 'SupportedMiddleware' ) )
            // InternalComponentDefinition.g:2878:1: ( 'SupportedMiddleware' )
            {
            // InternalComponentDefinition.g:2878:1: ( 'SupportedMiddleware' )
            // InternalComponentDefinition.g:2879:2: 'SupportedMiddleware'
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
    // InternalComponentDefinition.g:2888:1: rule__SupportedMiddleware__Group__1 : rule__SupportedMiddleware__Group__1__Impl rule__SupportedMiddleware__Group__2 ;
    public final void rule__SupportedMiddleware__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2892:1: ( rule__SupportedMiddleware__Group__1__Impl rule__SupportedMiddleware__Group__2 )
            // InternalComponentDefinition.g:2893:2: rule__SupportedMiddleware__Group__1__Impl rule__SupportedMiddleware__Group__2
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
    // InternalComponentDefinition.g:2900:1: rule__SupportedMiddleware__Group__1__Impl : ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? ) ;
    public final void rule__SupportedMiddleware__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2904:1: ( ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? ) )
            // InternalComponentDefinition.g:2905:1: ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? )
            {
            // InternalComponentDefinition.g:2905:1: ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? )
            // InternalComponentDefinition.g:2906:2: ( rule__SupportedMiddleware__DefaultAssignment_1 )?
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getDefaultAssignment_1()); 
            // InternalComponentDefinition.g:2907:2: ( rule__SupportedMiddleware__DefaultAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==72) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentDefinition.g:2907:3: rule__SupportedMiddleware__DefaultAssignment_1
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
    // InternalComponentDefinition.g:2915:1: rule__SupportedMiddleware__Group__2 : rule__SupportedMiddleware__Group__2__Impl rule__SupportedMiddleware__Group__3 ;
    public final void rule__SupportedMiddleware__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2919:1: ( rule__SupportedMiddleware__Group__2__Impl rule__SupportedMiddleware__Group__3 )
            // InternalComponentDefinition.g:2920:2: rule__SupportedMiddleware__Group__2__Impl rule__SupportedMiddleware__Group__3
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
    // InternalComponentDefinition.g:2927:1: rule__SupportedMiddleware__Group__2__Impl : ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) ) ;
    public final void rule__SupportedMiddleware__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2931:1: ( ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) ) )
            // InternalComponentDefinition.g:2932:1: ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) )
            {
            // InternalComponentDefinition.g:2932:1: ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) )
            // InternalComponentDefinition.g:2933:2: ( rule__SupportedMiddleware__MiddlewareAssignment_2 )
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareAssignment_2()); 
            // InternalComponentDefinition.g:2934:2: ( rule__SupportedMiddleware__MiddlewareAssignment_2 )
            // InternalComponentDefinition.g:2934:3: rule__SupportedMiddleware__MiddlewareAssignment_2
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
    // InternalComponentDefinition.g:2942:1: rule__SupportedMiddleware__Group__3 : rule__SupportedMiddleware__Group__3__Impl ;
    public final void rule__SupportedMiddleware__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2946:1: ( rule__SupportedMiddleware__Group__3__Impl )
            // InternalComponentDefinition.g:2947:2: rule__SupportedMiddleware__Group__3__Impl
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
    // InternalComponentDefinition.g:2953:1: rule__SupportedMiddleware__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__SupportedMiddleware__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2957:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:2958:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:2958:1: ( ( ';' )? )
            // InternalComponentDefinition.g:2959:2: ( ';' )?
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getSemicolonKeyword_3()); 
            // InternalComponentDefinition.g:2960:2: ( ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentDefinition.g:2960:3: ';'
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
    // InternalComponentDefinition.g:2969:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2973:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // InternalComponentDefinition.g:2974:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
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
    // InternalComponentDefinition.g:2981:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2985:1: ( ( 'Activity' ) )
            // InternalComponentDefinition.g:2986:1: ( 'Activity' )
            {
            // InternalComponentDefinition.g:2986:1: ( 'Activity' )
            // InternalComponentDefinition.g:2987:2: 'Activity'
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
    // InternalComponentDefinition.g:2996:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3000:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // InternalComponentDefinition.g:3001:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
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
    // InternalComponentDefinition.g:3008:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3012:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:3013:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3013:1: ( ( rule__Activity__NameAssignment_1 ) )
            // InternalComponentDefinition.g:3014:2: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:3015:2: ( rule__Activity__NameAssignment_1 )
            // InternalComponentDefinition.g:3015:3: rule__Activity__NameAssignment_1
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
    // InternalComponentDefinition.g:3023:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3027:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // InternalComponentDefinition.g:3028:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
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
    // InternalComponentDefinition.g:3035:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3039:1: ( ( '{' ) )
            // InternalComponentDefinition.g:3040:1: ( '{' )
            {
            // InternalComponentDefinition.g:3040:1: ( '{' )
            // InternalComponentDefinition.g:3041:2: '{'
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
    // InternalComponentDefinition.g:3050:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3054:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // InternalComponentDefinition.g:3055:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
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
    // InternalComponentDefinition.g:3062:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__LinksAssignment_3 )* ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3066:1: ( ( ( rule__Activity__LinksAssignment_3 )* ) )
            // InternalComponentDefinition.g:3067:1: ( ( rule__Activity__LinksAssignment_3 )* )
            {
            // InternalComponentDefinition.g:3067:1: ( ( rule__Activity__LinksAssignment_3 )* )
            // InternalComponentDefinition.g:3068:2: ( rule__Activity__LinksAssignment_3 )*
            {
             before(grammarAccess.getActivityAccess().getLinksAssignment_3()); 
            // InternalComponentDefinition.g:3069:2: ( rule__Activity__LinksAssignment_3 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=32 && LA24_0<=35)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalComponentDefinition.g:3069:3: rule__Activity__LinksAssignment_3
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__Activity__LinksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
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
    // InternalComponentDefinition.g:3077:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3081:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // InternalComponentDefinition.g:3082:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
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
    // InternalComponentDefinition.g:3089:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__ExtensionsAssignment_4 )* ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3093:1: ( ( ( rule__Activity__ExtensionsAssignment_4 )* ) )
            // InternalComponentDefinition.g:3094:1: ( ( rule__Activity__ExtensionsAssignment_4 )* )
            {
            // InternalComponentDefinition.g:3094:1: ( ( rule__Activity__ExtensionsAssignment_4 )* )
            // InternalComponentDefinition.g:3095:2: ( rule__Activity__ExtensionsAssignment_4 )*
            {
             before(grammarAccess.getActivityAccess().getExtensionsAssignment_4()); 
            // InternalComponentDefinition.g:3096:2: ( rule__Activity__ExtensionsAssignment_4 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==36||(LA25_0>=42 && LA25_0<=43)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalComponentDefinition.g:3096:3: rule__Activity__ExtensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Activity__ExtensionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalComponentDefinition.g:3104:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3108:1: ( rule__Activity__Group__5__Impl )
            // InternalComponentDefinition.g:3109:2: rule__Activity__Group__5__Impl
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
    // InternalComponentDefinition.g:3115:1: rule__Activity__Group__5__Impl : ( '}' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3119:1: ( ( '}' ) )
            // InternalComponentDefinition.g:3120:1: ( '}' )
            {
            // InternalComponentDefinition.g:3120:1: ( '}' )
            // InternalComponentDefinition.g:3121:2: '}'
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
    // InternalComponentDefinition.g:3131:1: rule__InputHandler__Group__0 : rule__InputHandler__Group__0__Impl rule__InputHandler__Group__1 ;
    public final void rule__InputHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3135:1: ( rule__InputHandler__Group__0__Impl rule__InputHandler__Group__1 )
            // InternalComponentDefinition.g:3136:2: rule__InputHandler__Group__0__Impl rule__InputHandler__Group__1
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
    // InternalComponentDefinition.g:3143:1: rule__InputHandler__Group__0__Impl : ( 'InputHandler' ) ;
    public final void rule__InputHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3147:1: ( ( 'InputHandler' ) )
            // InternalComponentDefinition.g:3148:1: ( 'InputHandler' )
            {
            // InternalComponentDefinition.g:3148:1: ( 'InputHandler' )
            // InternalComponentDefinition.g:3149:2: 'InputHandler'
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
    // InternalComponentDefinition.g:3158:1: rule__InputHandler__Group__1 : rule__InputHandler__Group__1__Impl rule__InputHandler__Group__2 ;
    public final void rule__InputHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3162:1: ( rule__InputHandler__Group__1__Impl rule__InputHandler__Group__2 )
            // InternalComponentDefinition.g:3163:2: rule__InputHandler__Group__1__Impl rule__InputHandler__Group__2
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
    // InternalComponentDefinition.g:3170:1: rule__InputHandler__Group__1__Impl : ( ( rule__InputHandler__NameAssignment_1 ) ) ;
    public final void rule__InputHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3174:1: ( ( ( rule__InputHandler__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:3175:1: ( ( rule__InputHandler__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3175:1: ( ( rule__InputHandler__NameAssignment_1 ) )
            // InternalComponentDefinition.g:3176:2: ( rule__InputHandler__NameAssignment_1 )
            {
             before(grammarAccess.getInputHandlerAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:3177:2: ( rule__InputHandler__NameAssignment_1 )
            // InternalComponentDefinition.g:3177:3: rule__InputHandler__NameAssignment_1
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
    // InternalComponentDefinition.g:3185:1: rule__InputHandler__Group__2 : rule__InputHandler__Group__2__Impl rule__InputHandler__Group__3 ;
    public final void rule__InputHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3189:1: ( rule__InputHandler__Group__2__Impl rule__InputHandler__Group__3 )
            // InternalComponentDefinition.g:3190:2: rule__InputHandler__Group__2__Impl rule__InputHandler__Group__3
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
    // InternalComponentDefinition.g:3197:1: rule__InputHandler__Group__2__Impl : ( 'triggeredFrom' ) ;
    public final void rule__InputHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3201:1: ( ( 'triggeredFrom' ) )
            // InternalComponentDefinition.g:3202:1: ( 'triggeredFrom' )
            {
            // InternalComponentDefinition.g:3202:1: ( 'triggeredFrom' )
            // InternalComponentDefinition.g:3203:2: 'triggeredFrom'
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
    // InternalComponentDefinition.g:3212:1: rule__InputHandler__Group__3 : rule__InputHandler__Group__3__Impl rule__InputHandler__Group__4 ;
    public final void rule__InputHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3216:1: ( rule__InputHandler__Group__3__Impl rule__InputHandler__Group__4 )
            // InternalComponentDefinition.g:3217:2: rule__InputHandler__Group__3__Impl rule__InputHandler__Group__4
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
    // InternalComponentDefinition.g:3224:1: rule__InputHandler__Group__3__Impl : ( ( rule__InputHandler__InputPortAssignment_3 ) ) ;
    public final void rule__InputHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3228:1: ( ( ( rule__InputHandler__InputPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:3229:1: ( ( rule__InputHandler__InputPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:3229:1: ( ( rule__InputHandler__InputPortAssignment_3 ) )
            // InternalComponentDefinition.g:3230:2: ( rule__InputHandler__InputPortAssignment_3 )
            {
             before(grammarAccess.getInputHandlerAccess().getInputPortAssignment_3()); 
            // InternalComponentDefinition.g:3231:2: ( rule__InputHandler__InputPortAssignment_3 )
            // InternalComponentDefinition.g:3231:3: rule__InputHandler__InputPortAssignment_3
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
    // InternalComponentDefinition.g:3239:1: rule__InputHandler__Group__4 : rule__InputHandler__Group__4__Impl rule__InputHandler__Group__5 ;
    public final void rule__InputHandler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3243:1: ( rule__InputHandler__Group__4__Impl rule__InputHandler__Group__5 )
            // InternalComponentDefinition.g:3244:2: rule__InputHandler__Group__4__Impl rule__InputHandler__Group__5
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
    // InternalComponentDefinition.g:3251:1: rule__InputHandler__Group__4__Impl : ( ( rule__InputHandler__ActiveQueueAssignment_4 )? ) ;
    public final void rule__InputHandler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3255:1: ( ( ( rule__InputHandler__ActiveQueueAssignment_4 )? ) )
            // InternalComponentDefinition.g:3256:1: ( ( rule__InputHandler__ActiveQueueAssignment_4 )? )
            {
            // InternalComponentDefinition.g:3256:1: ( ( rule__InputHandler__ActiveQueueAssignment_4 )? )
            // InternalComponentDefinition.g:3257:2: ( rule__InputHandler__ActiveQueueAssignment_4 )?
            {
             before(grammarAccess.getInputHandlerAccess().getActiveQueueAssignment_4()); 
            // InternalComponentDefinition.g:3258:2: ( rule__InputHandler__ActiveQueueAssignment_4 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==73) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentDefinition.g:3258:3: rule__InputHandler__ActiveQueueAssignment_4
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
    // InternalComponentDefinition.g:3266:1: rule__InputHandler__Group__5 : rule__InputHandler__Group__5__Impl rule__InputHandler__Group__6 ;
    public final void rule__InputHandler__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3270:1: ( rule__InputHandler__Group__5__Impl rule__InputHandler__Group__6 )
            // InternalComponentDefinition.g:3271:2: rule__InputHandler__Group__5__Impl rule__InputHandler__Group__6
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
    // InternalComponentDefinition.g:3278:1: rule__InputHandler__Group__5__Impl : ( '{' ) ;
    public final void rule__InputHandler__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3282:1: ( ( '{' ) )
            // InternalComponentDefinition.g:3283:1: ( '{' )
            {
            // InternalComponentDefinition.g:3283:1: ( '{' )
            // InternalComponentDefinition.g:3284:2: '{'
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
    // InternalComponentDefinition.g:3293:1: rule__InputHandler__Group__6 : rule__InputHandler__Group__6__Impl rule__InputHandler__Group__7 ;
    public final void rule__InputHandler__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3297:1: ( rule__InputHandler__Group__6__Impl rule__InputHandler__Group__7 )
            // InternalComponentDefinition.g:3298:2: rule__InputHandler__Group__6__Impl rule__InputHandler__Group__7
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
    // InternalComponentDefinition.g:3305:1: rule__InputHandler__Group__6__Impl : ( ( rule__InputHandler__LinksAssignment_6 )* ) ;
    public final void rule__InputHandler__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3309:1: ( ( ( rule__InputHandler__LinksAssignment_6 )* ) )
            // InternalComponentDefinition.g:3310:1: ( ( rule__InputHandler__LinksAssignment_6 )* )
            {
            // InternalComponentDefinition.g:3310:1: ( ( rule__InputHandler__LinksAssignment_6 )* )
            // InternalComponentDefinition.g:3311:2: ( rule__InputHandler__LinksAssignment_6 )*
            {
             before(grammarAccess.getInputHandlerAccess().getLinksAssignment_6()); 
            // InternalComponentDefinition.g:3312:2: ( rule__InputHandler__LinksAssignment_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=32 && LA27_0<=35)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalComponentDefinition.g:3312:3: rule__InputHandler__LinksAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__InputHandler__LinksAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // InternalComponentDefinition.g:3320:1: rule__InputHandler__Group__7 : rule__InputHandler__Group__7__Impl ;
    public final void rule__InputHandler__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3324:1: ( rule__InputHandler__Group__7__Impl )
            // InternalComponentDefinition.g:3325:2: rule__InputHandler__Group__7__Impl
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
    // InternalComponentDefinition.g:3331:1: rule__InputHandler__Group__7__Impl : ( '}' ) ;
    public final void rule__InputHandler__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3335:1: ( ( '}' ) )
            // InternalComponentDefinition.g:3336:1: ( '}' )
            {
            // InternalComponentDefinition.g:3336:1: ( '}' )
            // InternalComponentDefinition.g:3337:2: '}'
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
    // InternalComponentDefinition.g:3347:1: rule__RequestHandler__Group__0 : rule__RequestHandler__Group__0__Impl rule__RequestHandler__Group__1 ;
    public final void rule__RequestHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3351:1: ( rule__RequestHandler__Group__0__Impl rule__RequestHandler__Group__1 )
            // InternalComponentDefinition.g:3352:2: rule__RequestHandler__Group__0__Impl rule__RequestHandler__Group__1
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
    // InternalComponentDefinition.g:3359:1: rule__RequestHandler__Group__0__Impl : ( 'RequestHandler' ) ;
    public final void rule__RequestHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3363:1: ( ( 'RequestHandler' ) )
            // InternalComponentDefinition.g:3364:1: ( 'RequestHandler' )
            {
            // InternalComponentDefinition.g:3364:1: ( 'RequestHandler' )
            // InternalComponentDefinition.g:3365:2: 'RequestHandler'
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
    // InternalComponentDefinition.g:3374:1: rule__RequestHandler__Group__1 : rule__RequestHandler__Group__1__Impl rule__RequestHandler__Group__2 ;
    public final void rule__RequestHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3378:1: ( rule__RequestHandler__Group__1__Impl rule__RequestHandler__Group__2 )
            // InternalComponentDefinition.g:3379:2: rule__RequestHandler__Group__1__Impl rule__RequestHandler__Group__2
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
    // InternalComponentDefinition.g:3386:1: rule__RequestHandler__Group__1__Impl : ( ( rule__RequestHandler__NameAssignment_1 ) ) ;
    public final void rule__RequestHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3390:1: ( ( ( rule__RequestHandler__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:3391:1: ( ( rule__RequestHandler__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3391:1: ( ( rule__RequestHandler__NameAssignment_1 ) )
            // InternalComponentDefinition.g:3392:2: ( rule__RequestHandler__NameAssignment_1 )
            {
             before(grammarAccess.getRequestHandlerAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:3393:2: ( rule__RequestHandler__NameAssignment_1 )
            // InternalComponentDefinition.g:3393:3: rule__RequestHandler__NameAssignment_1
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
    // InternalComponentDefinition.g:3401:1: rule__RequestHandler__Group__2 : rule__RequestHandler__Group__2__Impl rule__RequestHandler__Group__3 ;
    public final void rule__RequestHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3405:1: ( rule__RequestHandler__Group__2__Impl rule__RequestHandler__Group__3 )
            // InternalComponentDefinition.g:3406:2: rule__RequestHandler__Group__2__Impl rule__RequestHandler__Group__3
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
    // InternalComponentDefinition.g:3413:1: rule__RequestHandler__Group__2__Impl : ( 'triggeredFrom' ) ;
    public final void rule__RequestHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3417:1: ( ( 'triggeredFrom' ) )
            // InternalComponentDefinition.g:3418:1: ( 'triggeredFrom' )
            {
            // InternalComponentDefinition.g:3418:1: ( 'triggeredFrom' )
            // InternalComponentDefinition.g:3419:2: 'triggeredFrom'
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
    // InternalComponentDefinition.g:3428:1: rule__RequestHandler__Group__3 : rule__RequestHandler__Group__3__Impl rule__RequestHandler__Group__4 ;
    public final void rule__RequestHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3432:1: ( rule__RequestHandler__Group__3__Impl rule__RequestHandler__Group__4 )
            // InternalComponentDefinition.g:3433:2: rule__RequestHandler__Group__3__Impl rule__RequestHandler__Group__4
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
    // InternalComponentDefinition.g:3440:1: rule__RequestHandler__Group__3__Impl : ( ( rule__RequestHandler__AnswerPortAssignment_3 ) ) ;
    public final void rule__RequestHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3444:1: ( ( ( rule__RequestHandler__AnswerPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:3445:1: ( ( rule__RequestHandler__AnswerPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:3445:1: ( ( rule__RequestHandler__AnswerPortAssignment_3 ) )
            // InternalComponentDefinition.g:3446:2: ( rule__RequestHandler__AnswerPortAssignment_3 )
            {
             before(grammarAccess.getRequestHandlerAccess().getAnswerPortAssignment_3()); 
            // InternalComponentDefinition.g:3447:2: ( rule__RequestHandler__AnswerPortAssignment_3 )
            // InternalComponentDefinition.g:3447:3: rule__RequestHandler__AnswerPortAssignment_3
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
    // InternalComponentDefinition.g:3455:1: rule__RequestHandler__Group__4 : rule__RequestHandler__Group__4__Impl rule__RequestHandler__Group__5 ;
    public final void rule__RequestHandler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3459:1: ( rule__RequestHandler__Group__4__Impl rule__RequestHandler__Group__5 )
            // InternalComponentDefinition.g:3460:2: rule__RequestHandler__Group__4__Impl rule__RequestHandler__Group__5
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
    // InternalComponentDefinition.g:3467:1: rule__RequestHandler__Group__4__Impl : ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? ) ;
    public final void rule__RequestHandler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3471:1: ( ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? ) )
            // InternalComponentDefinition.g:3472:1: ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? )
            {
            // InternalComponentDefinition.g:3472:1: ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? )
            // InternalComponentDefinition.g:3473:2: ( rule__RequestHandler__ActiveQueueAssignment_4 )?
            {
             before(grammarAccess.getRequestHandlerAccess().getActiveQueueAssignment_4()); 
            // InternalComponentDefinition.g:3474:2: ( rule__RequestHandler__ActiveQueueAssignment_4 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==73) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponentDefinition.g:3474:3: rule__RequestHandler__ActiveQueueAssignment_4
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
    // InternalComponentDefinition.g:3482:1: rule__RequestHandler__Group__5 : rule__RequestHandler__Group__5__Impl rule__RequestHandler__Group__6 ;
    public final void rule__RequestHandler__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3486:1: ( rule__RequestHandler__Group__5__Impl rule__RequestHandler__Group__6 )
            // InternalComponentDefinition.g:3487:2: rule__RequestHandler__Group__5__Impl rule__RequestHandler__Group__6
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
    // InternalComponentDefinition.g:3494:1: rule__RequestHandler__Group__5__Impl : ( '{' ) ;
    public final void rule__RequestHandler__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3498:1: ( ( '{' ) )
            // InternalComponentDefinition.g:3499:1: ( '{' )
            {
            // InternalComponentDefinition.g:3499:1: ( '{' )
            // InternalComponentDefinition.g:3500:2: '{'
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
    // InternalComponentDefinition.g:3509:1: rule__RequestHandler__Group__6 : rule__RequestHandler__Group__6__Impl rule__RequestHandler__Group__7 ;
    public final void rule__RequestHandler__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3513:1: ( rule__RequestHandler__Group__6__Impl rule__RequestHandler__Group__7 )
            // InternalComponentDefinition.g:3514:2: rule__RequestHandler__Group__6__Impl rule__RequestHandler__Group__7
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
    // InternalComponentDefinition.g:3521:1: rule__RequestHandler__Group__6__Impl : ( ( rule__RequestHandler__LinksAssignment_6 )* ) ;
    public final void rule__RequestHandler__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3525:1: ( ( ( rule__RequestHandler__LinksAssignment_6 )* ) )
            // InternalComponentDefinition.g:3526:1: ( ( rule__RequestHandler__LinksAssignment_6 )* )
            {
            // InternalComponentDefinition.g:3526:1: ( ( rule__RequestHandler__LinksAssignment_6 )* )
            // InternalComponentDefinition.g:3527:2: ( rule__RequestHandler__LinksAssignment_6 )*
            {
             before(grammarAccess.getRequestHandlerAccess().getLinksAssignment_6()); 
            // InternalComponentDefinition.g:3528:2: ( rule__RequestHandler__LinksAssignment_6 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=32 && LA29_0<=35)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalComponentDefinition.g:3528:3: rule__RequestHandler__LinksAssignment_6
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__RequestHandler__LinksAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalComponentDefinition.g:3536:1: rule__RequestHandler__Group__7 : rule__RequestHandler__Group__7__Impl ;
    public final void rule__RequestHandler__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3540:1: ( rule__RequestHandler__Group__7__Impl )
            // InternalComponentDefinition.g:3541:2: rule__RequestHandler__Group__7__Impl
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
    // InternalComponentDefinition.g:3547:1: rule__RequestHandler__Group__7__Impl : ( '}' ) ;
    public final void rule__RequestHandler__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3551:1: ( ( '}' ) )
            // InternalComponentDefinition.g:3552:1: ( '}' )
            {
            // InternalComponentDefinition.g:3552:1: ( '}' )
            // InternalComponentDefinition.g:3553:2: '}'
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
    // InternalComponentDefinition.g:3563:1: rule__RequestPortLink__Group__0 : rule__RequestPortLink__Group__0__Impl rule__RequestPortLink__Group__1 ;
    public final void rule__RequestPortLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3567:1: ( rule__RequestPortLink__Group__0__Impl rule__RequestPortLink__Group__1 )
            // InternalComponentDefinition.g:3568:2: rule__RequestPortLink__Group__0__Impl rule__RequestPortLink__Group__1
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
    // InternalComponentDefinition.g:3575:1: rule__RequestPortLink__Group__0__Impl : ( 'RequestPortLink' ) ;
    public final void rule__RequestPortLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3579:1: ( ( 'RequestPortLink' ) )
            // InternalComponentDefinition.g:3580:1: ( 'RequestPortLink' )
            {
            // InternalComponentDefinition.g:3580:1: ( 'RequestPortLink' )
            // InternalComponentDefinition.g:3581:2: 'RequestPortLink'
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
    // InternalComponentDefinition.g:3590:1: rule__RequestPortLink__Group__1 : rule__RequestPortLink__Group__1__Impl rule__RequestPortLink__Group__2 ;
    public final void rule__RequestPortLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3594:1: ( rule__RequestPortLink__Group__1__Impl rule__RequestPortLink__Group__2 )
            // InternalComponentDefinition.g:3595:2: rule__RequestPortLink__Group__1__Impl rule__RequestPortLink__Group__2
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
    // InternalComponentDefinition.g:3602:1: rule__RequestPortLink__Group__1__Impl : ( ( rule__RequestPortLink__RequestPortAssignment_1 ) ) ;
    public final void rule__RequestPortLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3606:1: ( ( ( rule__RequestPortLink__RequestPortAssignment_1 ) ) )
            // InternalComponentDefinition.g:3607:1: ( ( rule__RequestPortLink__RequestPortAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3607:1: ( ( rule__RequestPortLink__RequestPortAssignment_1 ) )
            // InternalComponentDefinition.g:3608:2: ( rule__RequestPortLink__RequestPortAssignment_1 )
            {
             before(grammarAccess.getRequestPortLinkAccess().getRequestPortAssignment_1()); 
            // InternalComponentDefinition.g:3609:2: ( rule__RequestPortLink__RequestPortAssignment_1 )
            // InternalComponentDefinition.g:3609:3: rule__RequestPortLink__RequestPortAssignment_1
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
    // InternalComponentDefinition.g:3617:1: rule__RequestPortLink__Group__2 : rule__RequestPortLink__Group__2__Impl ;
    public final void rule__RequestPortLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3621:1: ( rule__RequestPortLink__Group__2__Impl )
            // InternalComponentDefinition.g:3622:2: rule__RequestPortLink__Group__2__Impl
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
    // InternalComponentDefinition.g:3628:1: rule__RequestPortLink__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__RequestPortLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3632:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:3633:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:3633:1: ( ( ';' )? )
            // InternalComponentDefinition.g:3634:2: ( ';' )?
            {
             before(grammarAccess.getRequestPortLinkAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:3635:2: ( ';' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==16) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalComponentDefinition.g:3635:3: ';'
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
    // InternalComponentDefinition.g:3644:1: rule__OpcUaClientLink__Group__0 : rule__OpcUaClientLink__Group__0__Impl rule__OpcUaClientLink__Group__1 ;
    public final void rule__OpcUaClientLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3648:1: ( rule__OpcUaClientLink__Group__0__Impl rule__OpcUaClientLink__Group__1 )
            // InternalComponentDefinition.g:3649:2: rule__OpcUaClientLink__Group__0__Impl rule__OpcUaClientLink__Group__1
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
    // InternalComponentDefinition.g:3656:1: rule__OpcUaClientLink__Group__0__Impl : ( 'OpcUaClientLink' ) ;
    public final void rule__OpcUaClientLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3660:1: ( ( 'OpcUaClientLink' ) )
            // InternalComponentDefinition.g:3661:1: ( 'OpcUaClientLink' )
            {
            // InternalComponentDefinition.g:3661:1: ( 'OpcUaClientLink' )
            // InternalComponentDefinition.g:3662:2: 'OpcUaClientLink'
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
    // InternalComponentDefinition.g:3671:1: rule__OpcUaClientLink__Group__1 : rule__OpcUaClientLink__Group__1__Impl rule__OpcUaClientLink__Group__2 ;
    public final void rule__OpcUaClientLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3675:1: ( rule__OpcUaClientLink__Group__1__Impl rule__OpcUaClientLink__Group__2 )
            // InternalComponentDefinition.g:3676:2: rule__OpcUaClientLink__Group__1__Impl rule__OpcUaClientLink__Group__2
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
    // InternalComponentDefinition.g:3683:1: rule__OpcUaClientLink__Group__1__Impl : ( ( rule__OpcUaClientLink__ClientAssignment_1 ) ) ;
    public final void rule__OpcUaClientLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3687:1: ( ( ( rule__OpcUaClientLink__ClientAssignment_1 ) ) )
            // InternalComponentDefinition.g:3688:1: ( ( rule__OpcUaClientLink__ClientAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3688:1: ( ( rule__OpcUaClientLink__ClientAssignment_1 ) )
            // InternalComponentDefinition.g:3689:2: ( rule__OpcUaClientLink__ClientAssignment_1 )
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getClientAssignment_1()); 
            // InternalComponentDefinition.g:3690:2: ( rule__OpcUaClientLink__ClientAssignment_1 )
            // InternalComponentDefinition.g:3690:3: rule__OpcUaClientLink__ClientAssignment_1
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
    // InternalComponentDefinition.g:3698:1: rule__OpcUaClientLink__Group__2 : rule__OpcUaClientLink__Group__2__Impl ;
    public final void rule__OpcUaClientLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3702:1: ( rule__OpcUaClientLink__Group__2__Impl )
            // InternalComponentDefinition.g:3703:2: rule__OpcUaClientLink__Group__2__Impl
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
    // InternalComponentDefinition.g:3709:1: rule__OpcUaClientLink__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaClientLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3713:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:3714:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:3714:1: ( ( ';' )? )
            // InternalComponentDefinition.g:3715:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:3716:2: ( ';' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==16) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalComponentDefinition.g:3716:3: ';'
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


    // $ANTLR start "rule__ComponentSubNodeObserver__Group__0"
    // InternalComponentDefinition.g:3725:1: rule__ComponentSubNodeObserver__Group__0 : rule__ComponentSubNodeObserver__Group__0__Impl rule__ComponentSubNodeObserver__Group__1 ;
    public final void rule__ComponentSubNodeObserver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3729:1: ( rule__ComponentSubNodeObserver__Group__0__Impl rule__ComponentSubNodeObserver__Group__1 )
            // InternalComponentDefinition.g:3730:2: rule__ComponentSubNodeObserver__Group__0__Impl rule__ComponentSubNodeObserver__Group__1
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
    // InternalComponentDefinition.g:3737:1: rule__ComponentSubNodeObserver__Group__0__Impl : ( 'Observe' ) ;
    public final void rule__ComponentSubNodeObserver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3741:1: ( ( 'Observe' ) )
            // InternalComponentDefinition.g:3742:1: ( 'Observe' )
            {
            // InternalComponentDefinition.g:3742:1: ( 'Observe' )
            // InternalComponentDefinition.g:3743:2: 'Observe'
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getObserveKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3752:1: rule__ComponentSubNodeObserver__Group__1 : rule__ComponentSubNodeObserver__Group__1__Impl rule__ComponentSubNodeObserver__Group__2 ;
    public final void rule__ComponentSubNodeObserver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3756:1: ( rule__ComponentSubNodeObserver__Group__1__Impl rule__ComponentSubNodeObserver__Group__2 )
            // InternalComponentDefinition.g:3757:2: rule__ComponentSubNodeObserver__Group__1__Impl rule__ComponentSubNodeObserver__Group__2
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
    // InternalComponentDefinition.g:3764:1: rule__ComponentSubNodeObserver__Group__1__Impl : ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) ) ;
    public final void rule__ComponentSubNodeObserver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3768:1: ( ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) ) )
            // InternalComponentDefinition.g:3769:1: ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3769:1: ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) )
            // InternalComponentDefinition.g:3770:2: ( rule__ComponentSubNodeObserver__SubjectAssignment_1 )
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getSubjectAssignment_1()); 
            // InternalComponentDefinition.g:3771:2: ( rule__ComponentSubNodeObserver__SubjectAssignment_1 )
            // InternalComponentDefinition.g:3771:3: rule__ComponentSubNodeObserver__SubjectAssignment_1
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
    // InternalComponentDefinition.g:3779:1: rule__ComponentSubNodeObserver__Group__2 : rule__ComponentSubNodeObserver__Group__2__Impl ;
    public final void rule__ComponentSubNodeObserver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3783:1: ( rule__ComponentSubNodeObserver__Group__2__Impl )
            // InternalComponentDefinition.g:3784:2: rule__ComponentSubNodeObserver__Group__2__Impl
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
    // InternalComponentDefinition.g:3790:1: rule__ComponentSubNodeObserver__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ComponentSubNodeObserver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3794:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:3795:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:3795:1: ( ( ';' )? )
            // InternalComponentDefinition.g:3796:2: ( ';' )?
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:3797:2: ( ';' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==16) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponentDefinition.g:3797:3: ';'
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
    // InternalComponentDefinition.g:3806:1: rule__InputLinkExtension__Group__0 : rule__InputLinkExtension__Group__0__Impl rule__InputLinkExtension__Group__1 ;
    public final void rule__InputLinkExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3810:1: ( rule__InputLinkExtension__Group__0__Impl rule__InputLinkExtension__Group__1 )
            // InternalComponentDefinition.g:3811:2: rule__InputLinkExtension__Group__0__Impl rule__InputLinkExtension__Group__1
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
    // InternalComponentDefinition.g:3818:1: rule__InputLinkExtension__Group__0__Impl : ( () ) ;
    public final void rule__InputLinkExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3822:1: ( ( () ) )
            // InternalComponentDefinition.g:3823:1: ( () )
            {
            // InternalComponentDefinition.g:3823:1: ( () )
            // InternalComponentDefinition.g:3824:2: ()
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputLinkExtensionAction_0()); 
            // InternalComponentDefinition.g:3825:2: ()
            // InternalComponentDefinition.g:3825:3: 
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
    // InternalComponentDefinition.g:3833:1: rule__InputLinkExtension__Group__1 : rule__InputLinkExtension__Group__1__Impl rule__InputLinkExtension__Group__2 ;
    public final void rule__InputLinkExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3837:1: ( rule__InputLinkExtension__Group__1__Impl rule__InputLinkExtension__Group__2 )
            // InternalComponentDefinition.g:3838:2: rule__InputLinkExtension__Group__1__Impl rule__InputLinkExtension__Group__2
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
    // InternalComponentDefinition.g:3845:1: rule__InputLinkExtension__Group__1__Impl : ( 'InputPortLink' ) ;
    public final void rule__InputLinkExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3849:1: ( ( 'InputPortLink' ) )
            // InternalComponentDefinition.g:3850:1: ( 'InputPortLink' )
            {
            // InternalComponentDefinition.g:3850:1: ( 'InputPortLink' )
            // InternalComponentDefinition.g:3851:2: 'InputPortLink'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputPortLinkKeyword_1()); 
            match(input,35,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3860:1: rule__InputLinkExtension__Group__2 : rule__InputLinkExtension__Group__2__Impl rule__InputLinkExtension__Group__3 ;
    public final void rule__InputLinkExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3864:1: ( rule__InputLinkExtension__Group__2__Impl rule__InputLinkExtension__Group__3 )
            // InternalComponentDefinition.g:3865:2: rule__InputLinkExtension__Group__2__Impl rule__InputLinkExtension__Group__3
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
    // InternalComponentDefinition.g:3872:1: rule__InputLinkExtension__Group__2__Impl : ( ( rule__InputLinkExtension__InputPortAssignment_2 ) ) ;
    public final void rule__InputLinkExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3876:1: ( ( ( rule__InputLinkExtension__InputPortAssignment_2 ) ) )
            // InternalComponentDefinition.g:3877:1: ( ( rule__InputLinkExtension__InputPortAssignment_2 ) )
            {
            // InternalComponentDefinition.g:3877:1: ( ( rule__InputLinkExtension__InputPortAssignment_2 ) )
            // InternalComponentDefinition.g:3878:2: ( rule__InputLinkExtension__InputPortAssignment_2 )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputPortAssignment_2()); 
            // InternalComponentDefinition.g:3879:2: ( rule__InputLinkExtension__InputPortAssignment_2 )
            // InternalComponentDefinition.g:3879:3: rule__InputLinkExtension__InputPortAssignment_2
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
    // InternalComponentDefinition.g:3887:1: rule__InputLinkExtension__Group__3 : rule__InputLinkExtension__Group__3__Impl rule__InputLinkExtension__Group__4 ;
    public final void rule__InputLinkExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3891:1: ( rule__InputLinkExtension__Group__3__Impl rule__InputLinkExtension__Group__4 )
            // InternalComponentDefinition.g:3892:2: rule__InputLinkExtension__Group__3__Impl rule__InputLinkExtension__Group__4
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
    // InternalComponentDefinition.g:3899:1: rule__InputLinkExtension__Group__3__Impl : ( '{' ) ;
    public final void rule__InputLinkExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3903:1: ( ( '{' ) )
            // InternalComponentDefinition.g:3904:1: ( '{' )
            {
            // InternalComponentDefinition.g:3904:1: ( '{' )
            // InternalComponentDefinition.g:3905:2: '{'
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
    // InternalComponentDefinition.g:3914:1: rule__InputLinkExtension__Group__4 : rule__InputLinkExtension__Group__4__Impl rule__InputLinkExtension__Group__5 ;
    public final void rule__InputLinkExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3918:1: ( rule__InputLinkExtension__Group__4__Impl rule__InputLinkExtension__Group__5 )
            // InternalComponentDefinition.g:3919:2: rule__InputLinkExtension__Group__4__Impl rule__InputLinkExtension__Group__5
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
    // InternalComponentDefinition.g:3926:1: rule__InputLinkExtension__Group__4__Impl : ( ( rule__InputLinkExtension__UnorderedGroup_4 ) ) ;
    public final void rule__InputLinkExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3930:1: ( ( ( rule__InputLinkExtension__UnorderedGroup_4 ) ) )
            // InternalComponentDefinition.g:3931:1: ( ( rule__InputLinkExtension__UnorderedGroup_4 ) )
            {
            // InternalComponentDefinition.g:3931:1: ( ( rule__InputLinkExtension__UnorderedGroup_4 ) )
            // InternalComponentDefinition.g:3932:2: ( rule__InputLinkExtension__UnorderedGroup_4 )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4()); 
            // InternalComponentDefinition.g:3933:2: ( rule__InputLinkExtension__UnorderedGroup_4 )
            // InternalComponentDefinition.g:3933:3: rule__InputLinkExtension__UnorderedGroup_4
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
    // InternalComponentDefinition.g:3941:1: rule__InputLinkExtension__Group__5 : rule__InputLinkExtension__Group__5__Impl ;
    public final void rule__InputLinkExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3945:1: ( rule__InputLinkExtension__Group__5__Impl )
            // InternalComponentDefinition.g:3946:2: rule__InputLinkExtension__Group__5__Impl
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
    // InternalComponentDefinition.g:3952:1: rule__InputLinkExtension__Group__5__Impl : ( '}' ) ;
    public final void rule__InputLinkExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3956:1: ( ( '}' ) )
            // InternalComponentDefinition.g:3957:1: ( '}' )
            {
            // InternalComponentDefinition.g:3957:1: ( '}' )
            // InternalComponentDefinition.g:3958:2: '}'
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
    // InternalComponentDefinition.g:3968:1: rule__ActivationConstraints__Group__0 : rule__ActivationConstraints__Group__0__Impl rule__ActivationConstraints__Group__1 ;
    public final void rule__ActivationConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3972:1: ( rule__ActivationConstraints__Group__0__Impl rule__ActivationConstraints__Group__1 )
            // InternalComponentDefinition.g:3973:2: rule__ActivationConstraints__Group__0__Impl rule__ActivationConstraints__Group__1
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
    // InternalComponentDefinition.g:3980:1: rule__ActivationConstraints__Group__0__Impl : ( () ) ;
    public final void rule__ActivationConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3984:1: ( ( () ) )
            // InternalComponentDefinition.g:3985:1: ( () )
            {
            // InternalComponentDefinition.g:3985:1: ( () )
            // InternalComponentDefinition.g:3986:2: ()
            {
             before(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsAction_0()); 
            // InternalComponentDefinition.g:3987:2: ()
            // InternalComponentDefinition.g:3987:3: 
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
    // InternalComponentDefinition.g:3995:1: rule__ActivationConstraints__Group__1 : rule__ActivationConstraints__Group__1__Impl rule__ActivationConstraints__Group__2 ;
    public final void rule__ActivationConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3999:1: ( rule__ActivationConstraints__Group__1__Impl rule__ActivationConstraints__Group__2 )
            // InternalComponentDefinition.g:4000:2: rule__ActivationConstraints__Group__1__Impl rule__ActivationConstraints__Group__2
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
    // InternalComponentDefinition.g:4007:1: rule__ActivationConstraints__Group__1__Impl : ( 'ActivationConstraints' ) ;
    public final void rule__ActivationConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4011:1: ( ( 'ActivationConstraints' ) )
            // InternalComponentDefinition.g:4012:1: ( 'ActivationConstraints' )
            {
            // InternalComponentDefinition.g:4012:1: ( 'ActivationConstraints' )
            // InternalComponentDefinition.g:4013:2: 'ActivationConstraints'
            {
             before(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4022:1: rule__ActivationConstraints__Group__2 : rule__ActivationConstraints__Group__2__Impl rule__ActivationConstraints__Group__3 ;
    public final void rule__ActivationConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4026:1: ( rule__ActivationConstraints__Group__2__Impl rule__ActivationConstraints__Group__3 )
            // InternalComponentDefinition.g:4027:2: rule__ActivationConstraints__Group__2__Impl rule__ActivationConstraints__Group__3
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
    // InternalComponentDefinition.g:4034:1: rule__ActivationConstraints__Group__2__Impl : ( '{' ) ;
    public final void rule__ActivationConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4038:1: ( ( '{' ) )
            // InternalComponentDefinition.g:4039:1: ( '{' )
            {
            // InternalComponentDefinition.g:4039:1: ( '{' )
            // InternalComponentDefinition.g:4040:2: '{'
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
    // InternalComponentDefinition.g:4049:1: rule__ActivationConstraints__Group__3 : rule__ActivationConstraints__Group__3__Impl rule__ActivationConstraints__Group__4 ;
    public final void rule__ActivationConstraints__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4053:1: ( rule__ActivationConstraints__Group__3__Impl rule__ActivationConstraints__Group__4 )
            // InternalComponentDefinition.g:4054:2: rule__ActivationConstraints__Group__3__Impl rule__ActivationConstraints__Group__4
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
    // InternalComponentDefinition.g:4061:1: rule__ActivationConstraints__Group__3__Impl : ( 'configurable' ) ;
    public final void rule__ActivationConstraints__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4065:1: ( ( 'configurable' ) )
            // InternalComponentDefinition.g:4066:1: ( 'configurable' )
            {
            // InternalComponentDefinition.g:4066:1: ( 'configurable' )
            // InternalComponentDefinition.g:4067:2: 'configurable'
            {
             before(grammarAccess.getActivationConstraintsAccess().getConfigurableKeyword_3()); 
            match(input,37,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4076:1: rule__ActivationConstraints__Group__4 : rule__ActivationConstraints__Group__4__Impl rule__ActivationConstraints__Group__5 ;
    public final void rule__ActivationConstraints__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4080:1: ( rule__ActivationConstraints__Group__4__Impl rule__ActivationConstraints__Group__5 )
            // InternalComponentDefinition.g:4081:2: rule__ActivationConstraints__Group__4__Impl rule__ActivationConstraints__Group__5
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
    // InternalComponentDefinition.g:4088:1: rule__ActivationConstraints__Group__4__Impl : ( '=' ) ;
    public final void rule__ActivationConstraints__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4092:1: ( ( '=' ) )
            // InternalComponentDefinition.g:4093:1: ( '=' )
            {
            // InternalComponentDefinition.g:4093:1: ( '=' )
            // InternalComponentDefinition.g:4094:2: '='
            {
             before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4103:1: rule__ActivationConstraints__Group__5 : rule__ActivationConstraints__Group__5__Impl rule__ActivationConstraints__Group__6 ;
    public final void rule__ActivationConstraints__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4107:1: ( rule__ActivationConstraints__Group__5__Impl rule__ActivationConstraints__Group__6 )
            // InternalComponentDefinition.g:4108:2: rule__ActivationConstraints__Group__5__Impl rule__ActivationConstraints__Group__6
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
    // InternalComponentDefinition.g:4115:1: rule__ActivationConstraints__Group__5__Impl : ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) ) ;
    public final void rule__ActivationConstraints__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4119:1: ( ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) ) )
            // InternalComponentDefinition.g:4120:1: ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) )
            {
            // InternalComponentDefinition.g:4120:1: ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) )
            // InternalComponentDefinition.g:4121:2: ( rule__ActivationConstraints__ConfigurableAssignment_5 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getConfigurableAssignment_5()); 
            // InternalComponentDefinition.g:4122:2: ( rule__ActivationConstraints__ConfigurableAssignment_5 )
            // InternalComponentDefinition.g:4122:3: rule__ActivationConstraints__ConfigurableAssignment_5
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
    // InternalComponentDefinition.g:4130:1: rule__ActivationConstraints__Group__6 : rule__ActivationConstraints__Group__6__Impl rule__ActivationConstraints__Group__7 ;
    public final void rule__ActivationConstraints__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4134:1: ( rule__ActivationConstraints__Group__6__Impl rule__ActivationConstraints__Group__7 )
            // InternalComponentDefinition.g:4135:2: rule__ActivationConstraints__Group__6__Impl rule__ActivationConstraints__Group__7
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
    // InternalComponentDefinition.g:4142:1: rule__ActivationConstraints__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__ActivationConstraints__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4146:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4147:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4147:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4148:2: ( ';' )?
            {
             before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_6()); 
            // InternalComponentDefinition.g:4149:2: ( ';' )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==16) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalComponentDefinition.g:4149:3: ';'
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
    // InternalComponentDefinition.g:4157:1: rule__ActivationConstraints__Group__7 : rule__ActivationConstraints__Group__7__Impl rule__ActivationConstraints__Group__8 ;
    public final void rule__ActivationConstraints__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4161:1: ( rule__ActivationConstraints__Group__7__Impl rule__ActivationConstraints__Group__8 )
            // InternalComponentDefinition.g:4162:2: rule__ActivationConstraints__Group__7__Impl rule__ActivationConstraints__Group__8
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
    // InternalComponentDefinition.g:4169:1: rule__ActivationConstraints__Group__7__Impl : ( ( rule__ActivationConstraints__UnorderedGroup_7 ) ) ;
    public final void rule__ActivationConstraints__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4173:1: ( ( ( rule__ActivationConstraints__UnorderedGroup_7 ) ) )
            // InternalComponentDefinition.g:4174:1: ( ( rule__ActivationConstraints__UnorderedGroup_7 ) )
            {
            // InternalComponentDefinition.g:4174:1: ( ( rule__ActivationConstraints__UnorderedGroup_7 ) )
            // InternalComponentDefinition.g:4175:2: ( rule__ActivationConstraints__UnorderedGroup_7 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7()); 
            // InternalComponentDefinition.g:4176:2: ( rule__ActivationConstraints__UnorderedGroup_7 )
            // InternalComponentDefinition.g:4176:3: rule__ActivationConstraints__UnorderedGroup_7
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
    // InternalComponentDefinition.g:4184:1: rule__ActivationConstraints__Group__8 : rule__ActivationConstraints__Group__8__Impl ;
    public final void rule__ActivationConstraints__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4188:1: ( rule__ActivationConstraints__Group__8__Impl )
            // InternalComponentDefinition.g:4189:2: rule__ActivationConstraints__Group__8__Impl
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
    // InternalComponentDefinition.g:4195:1: rule__ActivationConstraints__Group__8__Impl : ( '}' ) ;
    public final void rule__ActivationConstraints__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4199:1: ( ( '}' ) )
            // InternalComponentDefinition.g:4200:1: ( '}' )
            {
            // InternalComponentDefinition.g:4200:1: ( '}' )
            // InternalComponentDefinition.g:4201:2: '}'
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
    // InternalComponentDefinition.g:4211:1: rule__ActivationConstraints__Group_7_0__0 : rule__ActivationConstraints__Group_7_0__0__Impl rule__ActivationConstraints__Group_7_0__1 ;
    public final void rule__ActivationConstraints__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4215:1: ( rule__ActivationConstraints__Group_7_0__0__Impl rule__ActivationConstraints__Group_7_0__1 )
            // InternalComponentDefinition.g:4216:2: rule__ActivationConstraints__Group_7_0__0__Impl rule__ActivationConstraints__Group_7_0__1
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
    // InternalComponentDefinition.g:4223:1: rule__ActivationConstraints__Group_7_0__0__Impl : ( 'minActFreq' ) ;
    public final void rule__ActivationConstraints__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4227:1: ( ( 'minActFreq' ) )
            // InternalComponentDefinition.g:4228:1: ( 'minActFreq' )
            {
            // InternalComponentDefinition.g:4228:1: ( 'minActFreq' )
            // InternalComponentDefinition.g:4229:2: 'minActFreq'
            {
             before(grammarAccess.getActivationConstraintsAccess().getMinActFreqKeyword_7_0_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4238:1: rule__ActivationConstraints__Group_7_0__1 : rule__ActivationConstraints__Group_7_0__1__Impl rule__ActivationConstraints__Group_7_0__2 ;
    public final void rule__ActivationConstraints__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4242:1: ( rule__ActivationConstraints__Group_7_0__1__Impl rule__ActivationConstraints__Group_7_0__2 )
            // InternalComponentDefinition.g:4243:2: rule__ActivationConstraints__Group_7_0__1__Impl rule__ActivationConstraints__Group_7_0__2
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
    // InternalComponentDefinition.g:4250:1: rule__ActivationConstraints__Group_7_0__1__Impl : ( '=' ) ;
    public final void rule__ActivationConstraints__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4254:1: ( ( '=' ) )
            // InternalComponentDefinition.g:4255:1: ( '=' )
            {
            // InternalComponentDefinition.g:4255:1: ( '=' )
            // InternalComponentDefinition.g:4256:2: '='
            {
             before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_0_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4265:1: rule__ActivationConstraints__Group_7_0__2 : rule__ActivationConstraints__Group_7_0__2__Impl rule__ActivationConstraints__Group_7_0__3 ;
    public final void rule__ActivationConstraints__Group_7_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4269:1: ( rule__ActivationConstraints__Group_7_0__2__Impl rule__ActivationConstraints__Group_7_0__3 )
            // InternalComponentDefinition.g:4270:2: rule__ActivationConstraints__Group_7_0__2__Impl rule__ActivationConstraints__Group_7_0__3
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
    // InternalComponentDefinition.g:4277:1: rule__ActivationConstraints__Group_7_0__2__Impl : ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) ) ;
    public final void rule__ActivationConstraints__Group_7_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4281:1: ( ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) ) )
            // InternalComponentDefinition.g:4282:1: ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) )
            {
            // InternalComponentDefinition.g:4282:1: ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) )
            // InternalComponentDefinition.g:4283:2: ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getMinActFreqAssignment_7_0_2()); 
            // InternalComponentDefinition.g:4284:2: ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 )
            // InternalComponentDefinition.g:4284:3: rule__ActivationConstraints__MinActFreqAssignment_7_0_2
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
    // InternalComponentDefinition.g:4292:1: rule__ActivationConstraints__Group_7_0__3 : rule__ActivationConstraints__Group_7_0__3__Impl rule__ActivationConstraints__Group_7_0__4 ;
    public final void rule__ActivationConstraints__Group_7_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4296:1: ( rule__ActivationConstraints__Group_7_0__3__Impl rule__ActivationConstraints__Group_7_0__4 )
            // InternalComponentDefinition.g:4297:2: rule__ActivationConstraints__Group_7_0__3__Impl rule__ActivationConstraints__Group_7_0__4
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
    // InternalComponentDefinition.g:4304:1: rule__ActivationConstraints__Group_7_0__3__Impl : ( 'Hz' ) ;
    public final void rule__ActivationConstraints__Group_7_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4308:1: ( ( 'Hz' ) )
            // InternalComponentDefinition.g:4309:1: ( 'Hz' )
            {
            // InternalComponentDefinition.g:4309:1: ( 'Hz' )
            // InternalComponentDefinition.g:4310:2: 'Hz'
            {
             before(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_0_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4319:1: rule__ActivationConstraints__Group_7_0__4 : rule__ActivationConstraints__Group_7_0__4__Impl ;
    public final void rule__ActivationConstraints__Group_7_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4323:1: ( rule__ActivationConstraints__Group_7_0__4__Impl )
            // InternalComponentDefinition.g:4324:2: rule__ActivationConstraints__Group_7_0__4__Impl
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
    // InternalComponentDefinition.g:4330:1: rule__ActivationConstraints__Group_7_0__4__Impl : ( ( ';' )? ) ;
    public final void rule__ActivationConstraints__Group_7_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4334:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4335:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4335:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4336:2: ( ';' )?
            {
             before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_0_4()); 
            // InternalComponentDefinition.g:4337:2: ( ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==16) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalComponentDefinition.g:4337:3: ';'
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
    // InternalComponentDefinition.g:4346:1: rule__ActivationConstraints__Group_7_1__0 : rule__ActivationConstraints__Group_7_1__0__Impl rule__ActivationConstraints__Group_7_1__1 ;
    public final void rule__ActivationConstraints__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4350:1: ( rule__ActivationConstraints__Group_7_1__0__Impl rule__ActivationConstraints__Group_7_1__1 )
            // InternalComponentDefinition.g:4351:2: rule__ActivationConstraints__Group_7_1__0__Impl rule__ActivationConstraints__Group_7_1__1
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
    // InternalComponentDefinition.g:4358:1: rule__ActivationConstraints__Group_7_1__0__Impl : ( 'maxActFreq' ) ;
    public final void rule__ActivationConstraints__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4362:1: ( ( 'maxActFreq' ) )
            // InternalComponentDefinition.g:4363:1: ( 'maxActFreq' )
            {
            // InternalComponentDefinition.g:4363:1: ( 'maxActFreq' )
            // InternalComponentDefinition.g:4364:2: 'maxActFreq'
            {
             before(grammarAccess.getActivationConstraintsAccess().getMaxActFreqKeyword_7_1_0()); 
            match(input,41,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4373:1: rule__ActivationConstraints__Group_7_1__1 : rule__ActivationConstraints__Group_7_1__1__Impl rule__ActivationConstraints__Group_7_1__2 ;
    public final void rule__ActivationConstraints__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4377:1: ( rule__ActivationConstraints__Group_7_1__1__Impl rule__ActivationConstraints__Group_7_1__2 )
            // InternalComponentDefinition.g:4378:2: rule__ActivationConstraints__Group_7_1__1__Impl rule__ActivationConstraints__Group_7_1__2
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
    // InternalComponentDefinition.g:4385:1: rule__ActivationConstraints__Group_7_1__1__Impl : ( '=' ) ;
    public final void rule__ActivationConstraints__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4389:1: ( ( '=' ) )
            // InternalComponentDefinition.g:4390:1: ( '=' )
            {
            // InternalComponentDefinition.g:4390:1: ( '=' )
            // InternalComponentDefinition.g:4391:2: '='
            {
             before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_1_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4400:1: rule__ActivationConstraints__Group_7_1__2 : rule__ActivationConstraints__Group_7_1__2__Impl rule__ActivationConstraints__Group_7_1__3 ;
    public final void rule__ActivationConstraints__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4404:1: ( rule__ActivationConstraints__Group_7_1__2__Impl rule__ActivationConstraints__Group_7_1__3 )
            // InternalComponentDefinition.g:4405:2: rule__ActivationConstraints__Group_7_1__2__Impl rule__ActivationConstraints__Group_7_1__3
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
    // InternalComponentDefinition.g:4412:1: rule__ActivationConstraints__Group_7_1__2__Impl : ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) ) ;
    public final void rule__ActivationConstraints__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4416:1: ( ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) ) )
            // InternalComponentDefinition.g:4417:1: ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) )
            {
            // InternalComponentDefinition.g:4417:1: ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) )
            // InternalComponentDefinition.g:4418:2: ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getMaxActFreqAssignment_7_1_2()); 
            // InternalComponentDefinition.g:4419:2: ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 )
            // InternalComponentDefinition.g:4419:3: rule__ActivationConstraints__MaxActFreqAssignment_7_1_2
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
    // InternalComponentDefinition.g:4427:1: rule__ActivationConstraints__Group_7_1__3 : rule__ActivationConstraints__Group_7_1__3__Impl rule__ActivationConstraints__Group_7_1__4 ;
    public final void rule__ActivationConstraints__Group_7_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4431:1: ( rule__ActivationConstraints__Group_7_1__3__Impl rule__ActivationConstraints__Group_7_1__4 )
            // InternalComponentDefinition.g:4432:2: rule__ActivationConstraints__Group_7_1__3__Impl rule__ActivationConstraints__Group_7_1__4
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
    // InternalComponentDefinition.g:4439:1: rule__ActivationConstraints__Group_7_1__3__Impl : ( 'Hz' ) ;
    public final void rule__ActivationConstraints__Group_7_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4443:1: ( ( 'Hz' ) )
            // InternalComponentDefinition.g:4444:1: ( 'Hz' )
            {
            // InternalComponentDefinition.g:4444:1: ( 'Hz' )
            // InternalComponentDefinition.g:4445:2: 'Hz'
            {
             before(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_1_3()); 
            match(input,40,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4454:1: rule__ActivationConstraints__Group_7_1__4 : rule__ActivationConstraints__Group_7_1__4__Impl ;
    public final void rule__ActivationConstraints__Group_7_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4458:1: ( rule__ActivationConstraints__Group_7_1__4__Impl )
            // InternalComponentDefinition.g:4459:2: rule__ActivationConstraints__Group_7_1__4__Impl
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
    // InternalComponentDefinition.g:4465:1: rule__ActivationConstraints__Group_7_1__4__Impl : ( ( ';' )? ) ;
    public final void rule__ActivationConstraints__Group_7_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4469:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4470:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4470:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4471:2: ( ';' )?
            {
             before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_1_4()); 
            // InternalComponentDefinition.g:4472:2: ( ';' )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==16) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalComponentDefinition.g:4472:3: ';'
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
    // InternalComponentDefinition.g:4481:1: rule__OperationModeBinding__Group__0 : rule__OperationModeBinding__Group__0__Impl rule__OperationModeBinding__Group__1 ;
    public final void rule__OperationModeBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4485:1: ( rule__OperationModeBinding__Group__0__Impl rule__OperationModeBinding__Group__1 )
            // InternalComponentDefinition.g:4486:2: rule__OperationModeBinding__Group__0__Impl rule__OperationModeBinding__Group__1
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
    // InternalComponentDefinition.g:4493:1: rule__OperationModeBinding__Group__0__Impl : ( 'OperationModeBinding' ) ;
    public final void rule__OperationModeBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4497:1: ( ( 'OperationModeBinding' ) )
            // InternalComponentDefinition.g:4498:1: ( 'OperationModeBinding' )
            {
            // InternalComponentDefinition.g:4498:1: ( 'OperationModeBinding' )
            // InternalComponentDefinition.g:4499:2: 'OperationModeBinding'
            {
             before(grammarAccess.getOperationModeBindingAccess().getOperationModeBindingKeyword_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4508:1: rule__OperationModeBinding__Group__1 : rule__OperationModeBinding__Group__1__Impl rule__OperationModeBinding__Group__2 ;
    public final void rule__OperationModeBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4512:1: ( rule__OperationModeBinding__Group__1__Impl rule__OperationModeBinding__Group__2 )
            // InternalComponentDefinition.g:4513:2: rule__OperationModeBinding__Group__1__Impl rule__OperationModeBinding__Group__2
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
    // InternalComponentDefinition.g:4520:1: rule__OperationModeBinding__Group__1__Impl : ( ( rule__OperationModeBinding__ModeAssignment_1 ) ) ;
    public final void rule__OperationModeBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4524:1: ( ( ( rule__OperationModeBinding__ModeAssignment_1 ) ) )
            // InternalComponentDefinition.g:4525:1: ( ( rule__OperationModeBinding__ModeAssignment_1 ) )
            {
            // InternalComponentDefinition.g:4525:1: ( ( rule__OperationModeBinding__ModeAssignment_1 ) )
            // InternalComponentDefinition.g:4526:2: ( rule__OperationModeBinding__ModeAssignment_1 )
            {
             before(grammarAccess.getOperationModeBindingAccess().getModeAssignment_1()); 
            // InternalComponentDefinition.g:4527:2: ( rule__OperationModeBinding__ModeAssignment_1 )
            // InternalComponentDefinition.g:4527:3: rule__OperationModeBinding__ModeAssignment_1
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
    // InternalComponentDefinition.g:4535:1: rule__OperationModeBinding__Group__2 : rule__OperationModeBinding__Group__2__Impl ;
    public final void rule__OperationModeBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4539:1: ( rule__OperationModeBinding__Group__2__Impl )
            // InternalComponentDefinition.g:4540:2: rule__OperationModeBinding__Group__2__Impl
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
    // InternalComponentDefinition.g:4546:1: rule__OperationModeBinding__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__OperationModeBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4550:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4551:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4551:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4552:2: ( ';' )?
            {
             before(grammarAccess.getOperationModeBindingAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:4553:2: ( ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==16) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalComponentDefinition.g:4553:3: ';'
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
    // InternalComponentDefinition.g:4562:1: rule__DefaultTrigger__Group__0 : rule__DefaultTrigger__Group__0__Impl rule__DefaultTrigger__Group__1 ;
    public final void rule__DefaultTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4566:1: ( rule__DefaultTrigger__Group__0__Impl rule__DefaultTrigger__Group__1 )
            // InternalComponentDefinition.g:4567:2: rule__DefaultTrigger__Group__0__Impl rule__DefaultTrigger__Group__1
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
    // InternalComponentDefinition.g:4574:1: rule__DefaultTrigger__Group__0__Impl : ( 'DefaultTrigger' ) ;
    public final void rule__DefaultTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4578:1: ( ( 'DefaultTrigger' ) )
            // InternalComponentDefinition.g:4579:1: ( 'DefaultTrigger' )
            {
            // InternalComponentDefinition.g:4579:1: ( 'DefaultTrigger' )
            // InternalComponentDefinition.g:4580:2: 'DefaultTrigger'
            {
             before(grammarAccess.getDefaultTriggerAccess().getDefaultTriggerKeyword_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4589:1: rule__DefaultTrigger__Group__1 : rule__DefaultTrigger__Group__1__Impl rule__DefaultTrigger__Group__2 ;
    public final void rule__DefaultTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4593:1: ( rule__DefaultTrigger__Group__1__Impl rule__DefaultTrigger__Group__2 )
            // InternalComponentDefinition.g:4594:2: rule__DefaultTrigger__Group__1__Impl rule__DefaultTrigger__Group__2
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
    // InternalComponentDefinition.g:4601:1: rule__DefaultTrigger__Group__1__Impl : ( ( rule__DefaultTrigger__Alternatives_1 ) ) ;
    public final void rule__DefaultTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4605:1: ( ( ( rule__DefaultTrigger__Alternatives_1 ) ) )
            // InternalComponentDefinition.g:4606:1: ( ( rule__DefaultTrigger__Alternatives_1 ) )
            {
            // InternalComponentDefinition.g:4606:1: ( ( rule__DefaultTrigger__Alternatives_1 ) )
            // InternalComponentDefinition.g:4607:2: ( rule__DefaultTrigger__Alternatives_1 )
            {
             before(grammarAccess.getDefaultTriggerAccess().getAlternatives_1()); 
            // InternalComponentDefinition.g:4608:2: ( rule__DefaultTrigger__Alternatives_1 )
            // InternalComponentDefinition.g:4608:3: rule__DefaultTrigger__Alternatives_1
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
    // InternalComponentDefinition.g:4616:1: rule__DefaultTrigger__Group__2 : rule__DefaultTrigger__Group__2__Impl ;
    public final void rule__DefaultTrigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4620:1: ( rule__DefaultTrigger__Group__2__Impl )
            // InternalComponentDefinition.g:4621:2: rule__DefaultTrigger__Group__2__Impl
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
    // InternalComponentDefinition.g:4627:1: rule__DefaultTrigger__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__DefaultTrigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4631:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4632:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4632:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4633:2: ( ';' )?
            {
             before(grammarAccess.getDefaultTriggerAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:4634:2: ( ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==16) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalComponentDefinition.g:4634:3: ';'
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
    // InternalComponentDefinition.g:4643:1: rule__DefaultInputTrigger__Group__0 : rule__DefaultInputTrigger__Group__0__Impl rule__DefaultInputTrigger__Group__1 ;
    public final void rule__DefaultInputTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4647:1: ( rule__DefaultInputTrigger__Group__0__Impl rule__DefaultInputTrigger__Group__1 )
            // InternalComponentDefinition.g:4648:2: rule__DefaultInputTrigger__Group__0__Impl rule__DefaultInputTrigger__Group__1
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
    // InternalComponentDefinition.g:4655:1: rule__DefaultInputTrigger__Group__0__Impl : ( 'InputPortTrigger' ) ;
    public final void rule__DefaultInputTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4659:1: ( ( 'InputPortTrigger' ) )
            // InternalComponentDefinition.g:4660:1: ( 'InputPortTrigger' )
            {
            // InternalComponentDefinition.g:4660:1: ( 'InputPortTrigger' )
            // InternalComponentDefinition.g:4661:2: 'InputPortTrigger'
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getInputPortTriggerKeyword_0()); 
            match(input,44,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4670:1: rule__DefaultInputTrigger__Group__1 : rule__DefaultInputTrigger__Group__1__Impl rule__DefaultInputTrigger__Group__2 ;
    public final void rule__DefaultInputTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4674:1: ( rule__DefaultInputTrigger__Group__1__Impl rule__DefaultInputTrigger__Group__2 )
            // InternalComponentDefinition.g:4675:2: rule__DefaultInputTrigger__Group__1__Impl rule__DefaultInputTrigger__Group__2
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
    // InternalComponentDefinition.g:4682:1: rule__DefaultInputTrigger__Group__1__Impl : ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) ) ;
    public final void rule__DefaultInputTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4686:1: ( ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) ) )
            // InternalComponentDefinition.g:4687:1: ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) )
            {
            // InternalComponentDefinition.g:4687:1: ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) )
            // InternalComponentDefinition.g:4688:2: ( rule__DefaultInputTrigger__InputLinkAssignment_1 )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getInputLinkAssignment_1()); 
            // InternalComponentDefinition.g:4689:2: ( rule__DefaultInputTrigger__InputLinkAssignment_1 )
            // InternalComponentDefinition.g:4689:3: rule__DefaultInputTrigger__InputLinkAssignment_1
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
    // InternalComponentDefinition.g:4697:1: rule__DefaultInputTrigger__Group__2 : rule__DefaultInputTrigger__Group__2__Impl ;
    public final void rule__DefaultInputTrigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4701:1: ( rule__DefaultInputTrigger__Group__2__Impl )
            // InternalComponentDefinition.g:4702:2: rule__DefaultInputTrigger__Group__2__Impl
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
    // InternalComponentDefinition.g:4708:1: rule__DefaultInputTrigger__Group__2__Impl : ( ( rule__DefaultInputTrigger__Group_2__0 )? ) ;
    public final void rule__DefaultInputTrigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4712:1: ( ( ( rule__DefaultInputTrigger__Group_2__0 )? ) )
            // InternalComponentDefinition.g:4713:1: ( ( rule__DefaultInputTrigger__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:4713:1: ( ( rule__DefaultInputTrigger__Group_2__0 )? )
            // InternalComponentDefinition.g:4714:2: ( rule__DefaultInputTrigger__Group_2__0 )?
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getGroup_2()); 
            // InternalComponentDefinition.g:4715:2: ( rule__DefaultInputTrigger__Group_2__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==45) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalComponentDefinition.g:4715:3: rule__DefaultInputTrigger__Group_2__0
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
    // InternalComponentDefinition.g:4724:1: rule__DefaultInputTrigger__Group_2__0 : rule__DefaultInputTrigger__Group_2__0__Impl rule__DefaultInputTrigger__Group_2__1 ;
    public final void rule__DefaultInputTrigger__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4728:1: ( rule__DefaultInputTrigger__Group_2__0__Impl rule__DefaultInputTrigger__Group_2__1 )
            // InternalComponentDefinition.g:4729:2: rule__DefaultInputTrigger__Group_2__0__Impl rule__DefaultInputTrigger__Group_2__1
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
    // InternalComponentDefinition.g:4736:1: rule__DefaultInputTrigger__Group_2__0__Impl : ( 'prescale' ) ;
    public final void rule__DefaultInputTrigger__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4740:1: ( ( 'prescale' ) )
            // InternalComponentDefinition.g:4741:1: ( 'prescale' )
            {
            // InternalComponentDefinition.g:4741:1: ( 'prescale' )
            // InternalComponentDefinition.g:4742:2: 'prescale'
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getPrescaleKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4751:1: rule__DefaultInputTrigger__Group_2__1 : rule__DefaultInputTrigger__Group_2__1__Impl ;
    public final void rule__DefaultInputTrigger__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4755:1: ( rule__DefaultInputTrigger__Group_2__1__Impl )
            // InternalComponentDefinition.g:4756:2: rule__DefaultInputTrigger__Group_2__1__Impl
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
    // InternalComponentDefinition.g:4762:1: rule__DefaultInputTrigger__Group_2__1__Impl : ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) ) ;
    public final void rule__DefaultInputTrigger__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4766:1: ( ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:4767:1: ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:4767:1: ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) )
            // InternalComponentDefinition.g:4768:2: ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getPrescaleAssignment_2_1()); 
            // InternalComponentDefinition.g:4769:2: ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 )
            // InternalComponentDefinition.g:4769:3: rule__DefaultInputTrigger__PrescaleAssignment_2_1
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
    // InternalComponentDefinition.g:4778:1: rule__DefaultPeriodicTimer__Group__0 : rule__DefaultPeriodicTimer__Group__0__Impl rule__DefaultPeriodicTimer__Group__1 ;
    public final void rule__DefaultPeriodicTimer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4782:1: ( rule__DefaultPeriodicTimer__Group__0__Impl rule__DefaultPeriodicTimer__Group__1 )
            // InternalComponentDefinition.g:4783:2: rule__DefaultPeriodicTimer__Group__0__Impl rule__DefaultPeriodicTimer__Group__1
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
    // InternalComponentDefinition.g:4790:1: rule__DefaultPeriodicTimer__Group__0__Impl : ( 'PeriodicTimer' ) ;
    public final void rule__DefaultPeriodicTimer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4794:1: ( ( 'PeriodicTimer' ) )
            // InternalComponentDefinition.g:4795:1: ( 'PeriodicTimer' )
            {
            // InternalComponentDefinition.g:4795:1: ( 'PeriodicTimer' )
            // InternalComponentDefinition.g:4796:2: 'PeriodicTimer'
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicTimerKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4805:1: rule__DefaultPeriodicTimer__Group__1 : rule__DefaultPeriodicTimer__Group__1__Impl rule__DefaultPeriodicTimer__Group__2 ;
    public final void rule__DefaultPeriodicTimer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4809:1: ( rule__DefaultPeriodicTimer__Group__1__Impl rule__DefaultPeriodicTimer__Group__2 )
            // InternalComponentDefinition.g:4810:2: rule__DefaultPeriodicTimer__Group__1__Impl rule__DefaultPeriodicTimer__Group__2
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
    // InternalComponentDefinition.g:4817:1: rule__DefaultPeriodicTimer__Group__1__Impl : ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) ) ;
    public final void rule__DefaultPeriodicTimer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4821:1: ( ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) ) )
            // InternalComponentDefinition.g:4822:1: ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) )
            {
            // InternalComponentDefinition.g:4822:1: ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) )
            // InternalComponentDefinition.g:4823:2: ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 )
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqAssignment_1()); 
            // InternalComponentDefinition.g:4824:2: ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 )
            // InternalComponentDefinition.g:4824:3: rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1
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
    // InternalComponentDefinition.g:4832:1: rule__DefaultPeriodicTimer__Group__2 : rule__DefaultPeriodicTimer__Group__2__Impl ;
    public final void rule__DefaultPeriodicTimer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4836:1: ( rule__DefaultPeriodicTimer__Group__2__Impl )
            // InternalComponentDefinition.g:4837:2: rule__DefaultPeriodicTimer__Group__2__Impl
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
    // InternalComponentDefinition.g:4843:1: rule__DefaultPeriodicTimer__Group__2__Impl : ( 'Hz' ) ;
    public final void rule__DefaultPeriodicTimer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4847:1: ( ( 'Hz' ) )
            // InternalComponentDefinition.g:4848:1: ( 'Hz' )
            {
            // InternalComponentDefinition.g:4848:1: ( 'Hz' )
            // InternalComponentDefinition.g:4849:2: 'Hz'
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getHzKeyword_2()); 
            match(input,40,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4859:1: rule__DefaultObservedElementTrigger__Group__0 : rule__DefaultObservedElementTrigger__Group__0__Impl rule__DefaultObservedElementTrigger__Group__1 ;
    public final void rule__DefaultObservedElementTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4863:1: ( rule__DefaultObservedElementTrigger__Group__0__Impl rule__DefaultObservedElementTrigger__Group__1 )
            // InternalComponentDefinition.g:4864:2: rule__DefaultObservedElementTrigger__Group__0__Impl rule__DefaultObservedElementTrigger__Group__1
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
    // InternalComponentDefinition.g:4871:1: rule__DefaultObservedElementTrigger__Group__0__Impl : ( 'ObservedElement' ) ;
    public final void rule__DefaultObservedElementTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4875:1: ( ( 'ObservedElement' ) )
            // InternalComponentDefinition.g:4876:1: ( 'ObservedElement' )
            {
            // InternalComponentDefinition.g:4876:1: ( 'ObservedElement' )
            // InternalComponentDefinition.g:4877:2: 'ObservedElement'
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getObservedElementKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4886:1: rule__DefaultObservedElementTrigger__Group__1 : rule__DefaultObservedElementTrigger__Group__1__Impl ;
    public final void rule__DefaultObservedElementTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4890:1: ( rule__DefaultObservedElementTrigger__Group__1__Impl )
            // InternalComponentDefinition.g:4891:2: rule__DefaultObservedElementTrigger__Group__1__Impl
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
    // InternalComponentDefinition.g:4897:1: rule__DefaultObservedElementTrigger__Group__1__Impl : ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) ) ;
    public final void rule__DefaultObservedElementTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4901:1: ( ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) ) )
            // InternalComponentDefinition.g:4902:1: ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) )
            {
            // InternalComponentDefinition.g:4902:1: ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) )
            // InternalComponentDefinition.g:4903:2: ( rule__DefaultObservedElementTrigger__ElementAssignment_1 )
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getElementAssignment_1()); 
            // InternalComponentDefinition.g:4904:2: ( rule__DefaultObservedElementTrigger__ElementAssignment_1 )
            // InternalComponentDefinition.g:4904:3: rule__DefaultObservedElementTrigger__ElementAssignment_1
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
    // InternalComponentDefinition.g:4913:1: rule__OpcUaDeviceClient__Group__0 : rule__OpcUaDeviceClient__Group__0__Impl rule__OpcUaDeviceClient__Group__1 ;
    public final void rule__OpcUaDeviceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4917:1: ( rule__OpcUaDeviceClient__Group__0__Impl rule__OpcUaDeviceClient__Group__1 )
            // InternalComponentDefinition.g:4918:2: rule__OpcUaDeviceClient__Group__0__Impl rule__OpcUaDeviceClient__Group__1
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
    // InternalComponentDefinition.g:4925:1: rule__OpcUaDeviceClient__Group__0__Impl : ( 'OpcUaDeviceClient' ) ;
    public final void rule__OpcUaDeviceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4929:1: ( ( 'OpcUaDeviceClient' ) )
            // InternalComponentDefinition.g:4930:1: ( 'OpcUaDeviceClient' )
            {
            // InternalComponentDefinition.g:4930:1: ( 'OpcUaDeviceClient' )
            // InternalComponentDefinition.g:4931:2: 'OpcUaDeviceClient'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getOpcUaDeviceClientKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4940:1: rule__OpcUaDeviceClient__Group__1 : rule__OpcUaDeviceClient__Group__1__Impl rule__OpcUaDeviceClient__Group__2 ;
    public final void rule__OpcUaDeviceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4944:1: ( rule__OpcUaDeviceClient__Group__1__Impl rule__OpcUaDeviceClient__Group__2 )
            // InternalComponentDefinition.g:4945:2: rule__OpcUaDeviceClient__Group__1__Impl rule__OpcUaDeviceClient__Group__2
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
    // InternalComponentDefinition.g:4952:1: rule__OpcUaDeviceClient__Group__1__Impl : ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) ) ;
    public final void rule__OpcUaDeviceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4956:1: ( ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:4957:1: ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:4957:1: ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) )
            // InternalComponentDefinition.g:4958:2: ( rule__OpcUaDeviceClient__NameAssignment_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:4959:2: ( rule__OpcUaDeviceClient__NameAssignment_1 )
            // InternalComponentDefinition.g:4959:3: rule__OpcUaDeviceClient__NameAssignment_1
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
    // InternalComponentDefinition.g:4967:1: rule__OpcUaDeviceClient__Group__2 : rule__OpcUaDeviceClient__Group__2__Impl rule__OpcUaDeviceClient__Group__3 ;
    public final void rule__OpcUaDeviceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4971:1: ( rule__OpcUaDeviceClient__Group__2__Impl rule__OpcUaDeviceClient__Group__3 )
            // InternalComponentDefinition.g:4972:2: rule__OpcUaDeviceClient__Group__2__Impl rule__OpcUaDeviceClient__Group__3
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
    // InternalComponentDefinition.g:4979:1: rule__OpcUaDeviceClient__Group__2__Impl : ( ( rule__OpcUaDeviceClient__UnorderedGroup_2 ) ) ;
    public final void rule__OpcUaDeviceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4983:1: ( ( ( rule__OpcUaDeviceClient__UnorderedGroup_2 ) ) )
            // InternalComponentDefinition.g:4984:1: ( ( rule__OpcUaDeviceClient__UnorderedGroup_2 ) )
            {
            // InternalComponentDefinition.g:4984:1: ( ( rule__OpcUaDeviceClient__UnorderedGroup_2 ) )
            // InternalComponentDefinition.g:4985:2: ( rule__OpcUaDeviceClient__UnorderedGroup_2 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2()); 
            // InternalComponentDefinition.g:4986:2: ( rule__OpcUaDeviceClient__UnorderedGroup_2 )
            // InternalComponentDefinition.g:4986:3: rule__OpcUaDeviceClient__UnorderedGroup_2
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
    // InternalComponentDefinition.g:4994:1: rule__OpcUaDeviceClient__Group__3 : rule__OpcUaDeviceClient__Group__3__Impl ;
    public final void rule__OpcUaDeviceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4998:1: ( rule__OpcUaDeviceClient__Group__3__Impl )
            // InternalComponentDefinition.g:4999:2: rule__OpcUaDeviceClient__Group__3__Impl
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
    // InternalComponentDefinition.g:5005:1: rule__OpcUaDeviceClient__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaDeviceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5009:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:5010:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:5010:1: ( ( ';' )? )
            // InternalComponentDefinition.g:5011:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getSemicolonKeyword_3()); 
            // InternalComponentDefinition.g:5012:2: ( ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==16) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalComponentDefinition.g:5012:3: ';'
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
    // InternalComponentDefinition.g:5021:1: rule__OpcUaDeviceClient__Group_2_0__0 : rule__OpcUaDeviceClient__Group_2_0__0__Impl rule__OpcUaDeviceClient__Group_2_0__1 ;
    public final void rule__OpcUaDeviceClient__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5025:1: ( rule__OpcUaDeviceClient__Group_2_0__0__Impl rule__OpcUaDeviceClient__Group_2_0__1 )
            // InternalComponentDefinition.g:5026:2: rule__OpcUaDeviceClient__Group_2_0__0__Impl rule__OpcUaDeviceClient__Group_2_0__1
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
    // InternalComponentDefinition.g:5033:1: rule__OpcUaDeviceClient__Group_2_0__0__Impl : ( 'deviceURI' ) ;
    public final void rule__OpcUaDeviceClient__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5037:1: ( ( 'deviceURI' ) )
            // InternalComponentDefinition.g:5038:1: ( 'deviceURI' )
            {
            // InternalComponentDefinition.g:5038:1: ( 'deviceURI' )
            // InternalComponentDefinition.g:5039:2: 'deviceURI'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIKeyword_2_0_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5048:1: rule__OpcUaDeviceClient__Group_2_0__1 : rule__OpcUaDeviceClient__Group_2_0__1__Impl ;
    public final void rule__OpcUaDeviceClient__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5052:1: ( rule__OpcUaDeviceClient__Group_2_0__1__Impl )
            // InternalComponentDefinition.g:5053:2: rule__OpcUaDeviceClient__Group_2_0__1__Impl
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
    // InternalComponentDefinition.g:5059:1: rule__OpcUaDeviceClient__Group_2_0__1__Impl : ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 ) ) ;
    public final void rule__OpcUaDeviceClient__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5063:1: ( ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 ) ) )
            // InternalComponentDefinition.g:5064:1: ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 ) )
            {
            // InternalComponentDefinition.g:5064:1: ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 ) )
            // InternalComponentDefinition.g:5065:2: ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIAssignment_2_0_1()); 
            // InternalComponentDefinition.g:5066:2: ( rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 )
            // InternalComponentDefinition.g:5066:3: rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1
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
    // InternalComponentDefinition.g:5075:1: rule__OpcUaDeviceClient__Group_2_1__0 : rule__OpcUaDeviceClient__Group_2_1__0__Impl rule__OpcUaDeviceClient__Group_2_1__1 ;
    public final void rule__OpcUaDeviceClient__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5079:1: ( rule__OpcUaDeviceClient__Group_2_1__0__Impl rule__OpcUaDeviceClient__Group_2_1__1 )
            // InternalComponentDefinition.g:5080:2: rule__OpcUaDeviceClient__Group_2_1__0__Impl rule__OpcUaDeviceClient__Group_2_1__1
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
    // InternalComponentDefinition.g:5087:1: rule__OpcUaDeviceClient__Group_2_1__0__Impl : ( 'opcuaXmlFile' ) ;
    public final void rule__OpcUaDeviceClient__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5091:1: ( ( 'opcuaXmlFile' ) )
            // InternalComponentDefinition.g:5092:1: ( 'opcuaXmlFile' )
            {
            // InternalComponentDefinition.g:5092:1: ( 'opcuaXmlFile' )
            // InternalComponentDefinition.g:5093:2: 'opcuaXmlFile'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileKeyword_2_1_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5102:1: rule__OpcUaDeviceClient__Group_2_1__1 : rule__OpcUaDeviceClient__Group_2_1__1__Impl ;
    public final void rule__OpcUaDeviceClient__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5106:1: ( rule__OpcUaDeviceClient__Group_2_1__1__Impl )
            // InternalComponentDefinition.g:5107:2: rule__OpcUaDeviceClient__Group_2_1__1__Impl
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
    // InternalComponentDefinition.g:5113:1: rule__OpcUaDeviceClient__Group_2_1__1__Impl : ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 ) ) ;
    public final void rule__OpcUaDeviceClient__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5117:1: ( ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 ) ) )
            // InternalComponentDefinition.g:5118:1: ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 ) )
            {
            // InternalComponentDefinition.g:5118:1: ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 ) )
            // InternalComponentDefinition.g:5119:2: ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileAssignment_2_1_1()); 
            // InternalComponentDefinition.g:5120:2: ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 )
            // InternalComponentDefinition.g:5120:3: rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1
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


    // $ANTLR start "rule__OpcUaStatusServer__Group__0"
    // InternalComponentDefinition.g:5129:1: rule__OpcUaStatusServer__Group__0 : rule__OpcUaStatusServer__Group__0__Impl rule__OpcUaStatusServer__Group__1 ;
    public final void rule__OpcUaStatusServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5133:1: ( rule__OpcUaStatusServer__Group__0__Impl rule__OpcUaStatusServer__Group__1 )
            // InternalComponentDefinition.g:5134:2: rule__OpcUaStatusServer__Group__0__Impl rule__OpcUaStatusServer__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__OpcUaStatusServer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaStatusServer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__Group__0"


    // $ANTLR start "rule__OpcUaStatusServer__Group__0__Impl"
    // InternalComponentDefinition.g:5141:1: rule__OpcUaStatusServer__Group__0__Impl : ( 'OpcUaStatusServer' ) ;
    public final void rule__OpcUaStatusServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5145:1: ( ( 'OpcUaStatusServer' ) )
            // InternalComponentDefinition.g:5146:1: ( 'OpcUaStatusServer' )
            {
            // InternalComponentDefinition.g:5146:1: ( 'OpcUaStatusServer' )
            // InternalComponentDefinition.g:5147:2: 'OpcUaStatusServer'
            {
             before(grammarAccess.getOpcUaStatusServerAccess().getOpcUaStatusServerKeyword_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getOpcUaStatusServerAccess().getOpcUaStatusServerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__Group__0__Impl"


    // $ANTLR start "rule__OpcUaStatusServer__Group__1"
    // InternalComponentDefinition.g:5156:1: rule__OpcUaStatusServer__Group__1 : rule__OpcUaStatusServer__Group__1__Impl rule__OpcUaStatusServer__Group__2 ;
    public final void rule__OpcUaStatusServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5160:1: ( rule__OpcUaStatusServer__Group__1__Impl rule__OpcUaStatusServer__Group__2 )
            // InternalComponentDefinition.g:5161:2: rule__OpcUaStatusServer__Group__1__Impl rule__OpcUaStatusServer__Group__2
            {
            pushFollow(FOLLOW_37);
            rule__OpcUaStatusServer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaStatusServer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__Group__1"


    // $ANTLR start "rule__OpcUaStatusServer__Group__1__Impl"
    // InternalComponentDefinition.g:5168:1: rule__OpcUaStatusServer__Group__1__Impl : ( ( rule__OpcUaStatusServer__NameAssignment_1 ) ) ;
    public final void rule__OpcUaStatusServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5172:1: ( ( ( rule__OpcUaStatusServer__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:5173:1: ( ( rule__OpcUaStatusServer__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5173:1: ( ( rule__OpcUaStatusServer__NameAssignment_1 ) )
            // InternalComponentDefinition.g:5174:2: ( rule__OpcUaStatusServer__NameAssignment_1 )
            {
             before(grammarAccess.getOpcUaStatusServerAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:5175:2: ( rule__OpcUaStatusServer__NameAssignment_1 )
            // InternalComponentDefinition.g:5175:3: rule__OpcUaStatusServer__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaStatusServer__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaStatusServerAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__Group__1__Impl"


    // $ANTLR start "rule__OpcUaStatusServer__Group__2"
    // InternalComponentDefinition.g:5183:1: rule__OpcUaStatusServer__Group__2 : rule__OpcUaStatusServer__Group__2__Impl rule__OpcUaStatusServer__Group__3 ;
    public final void rule__OpcUaStatusServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5187:1: ( rule__OpcUaStatusServer__Group__2__Impl rule__OpcUaStatusServer__Group__3 )
            // InternalComponentDefinition.g:5188:2: rule__OpcUaStatusServer__Group__2__Impl rule__OpcUaStatusServer__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__OpcUaStatusServer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaStatusServer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__Group__2"


    // $ANTLR start "rule__OpcUaStatusServer__Group__2__Impl"
    // InternalComponentDefinition.g:5195:1: rule__OpcUaStatusServer__Group__2__Impl : ( 'dataProviderPort' ) ;
    public final void rule__OpcUaStatusServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5199:1: ( ( 'dataProviderPort' ) )
            // InternalComponentDefinition.g:5200:1: ( 'dataProviderPort' )
            {
            // InternalComponentDefinition.g:5200:1: ( 'dataProviderPort' )
            // InternalComponentDefinition.g:5201:2: 'dataProviderPort'
            {
             before(grammarAccess.getOpcUaStatusServerAccess().getDataProviderPortKeyword_2()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getOpcUaStatusServerAccess().getDataProviderPortKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__Group__2__Impl"


    // $ANTLR start "rule__OpcUaStatusServer__Group__3"
    // InternalComponentDefinition.g:5210:1: rule__OpcUaStatusServer__Group__3 : rule__OpcUaStatusServer__Group__3__Impl rule__OpcUaStatusServer__Group__4 ;
    public final void rule__OpcUaStatusServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5214:1: ( rule__OpcUaStatusServer__Group__3__Impl rule__OpcUaStatusServer__Group__4 )
            // InternalComponentDefinition.g:5215:2: rule__OpcUaStatusServer__Group__3__Impl rule__OpcUaStatusServer__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__OpcUaStatusServer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaStatusServer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__Group__3"


    // $ANTLR start "rule__OpcUaStatusServer__Group__3__Impl"
    // InternalComponentDefinition.g:5222:1: rule__OpcUaStatusServer__Group__3__Impl : ( ( rule__OpcUaStatusServer__OutPortAssignment_3 ) ) ;
    public final void rule__OpcUaStatusServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5226:1: ( ( ( rule__OpcUaStatusServer__OutPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:5227:1: ( ( rule__OpcUaStatusServer__OutPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:5227:1: ( ( rule__OpcUaStatusServer__OutPortAssignment_3 ) )
            // InternalComponentDefinition.g:5228:2: ( rule__OpcUaStatusServer__OutPortAssignment_3 )
            {
             before(grammarAccess.getOpcUaStatusServerAccess().getOutPortAssignment_3()); 
            // InternalComponentDefinition.g:5229:2: ( rule__OpcUaStatusServer__OutPortAssignment_3 )
            // InternalComponentDefinition.g:5229:3: rule__OpcUaStatusServer__OutPortAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaStatusServer__OutPortAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaStatusServerAccess().getOutPortAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__Group__3__Impl"


    // $ANTLR start "rule__OpcUaStatusServer__Group__4"
    // InternalComponentDefinition.g:5237:1: rule__OpcUaStatusServer__Group__4 : rule__OpcUaStatusServer__Group__4__Impl ;
    public final void rule__OpcUaStatusServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5241:1: ( rule__OpcUaStatusServer__Group__4__Impl )
            // InternalComponentDefinition.g:5242:2: rule__OpcUaStatusServer__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaStatusServer__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__Group__4"


    // $ANTLR start "rule__OpcUaStatusServer__Group__4__Impl"
    // InternalComponentDefinition.g:5248:1: rule__OpcUaStatusServer__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaStatusServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5252:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:5253:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:5253:1: ( ( ';' )? )
            // InternalComponentDefinition.g:5254:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaStatusServerAccess().getSemicolonKeyword_4()); 
            // InternalComponentDefinition.g:5255:2: ( ';' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==16) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalComponentDefinition.g:5255:3: ';'
                    {
                    match(input,16,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOpcUaStatusServerAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__Group__4__Impl"


    // $ANTLR start "rule__CoordinationSlavePort__Group__0"
    // InternalComponentDefinition.g:5264:1: rule__CoordinationSlavePort__Group__0 : rule__CoordinationSlavePort__Group__0__Impl rule__CoordinationSlavePort__Group__1 ;
    public final void rule__CoordinationSlavePort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5268:1: ( rule__CoordinationSlavePort__Group__0__Impl rule__CoordinationSlavePort__Group__1 )
            // InternalComponentDefinition.g:5269:2: rule__CoordinationSlavePort__Group__0__Impl rule__CoordinationSlavePort__Group__1
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
    // InternalComponentDefinition.g:5276:1: rule__CoordinationSlavePort__Group__0__Impl : ( 'CoordinationSlavePort' ) ;
    public final void rule__CoordinationSlavePort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5280:1: ( ( 'CoordinationSlavePort' ) )
            // InternalComponentDefinition.g:5281:1: ( 'CoordinationSlavePort' )
            {
            // InternalComponentDefinition.g:5281:1: ( 'CoordinationSlavePort' )
            // InternalComponentDefinition.g:5282:2: 'CoordinationSlavePort'
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getCoordinationSlavePortKeyword_0()); 
            match(input,53,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5291:1: rule__CoordinationSlavePort__Group__1 : rule__CoordinationSlavePort__Group__1__Impl rule__CoordinationSlavePort__Group__2 ;
    public final void rule__CoordinationSlavePort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5295:1: ( rule__CoordinationSlavePort__Group__1__Impl rule__CoordinationSlavePort__Group__2 )
            // InternalComponentDefinition.g:5296:2: rule__CoordinationSlavePort__Group__1__Impl rule__CoordinationSlavePort__Group__2
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
    // InternalComponentDefinition.g:5303:1: rule__CoordinationSlavePort__Group__1__Impl : ( ( rule__CoordinationSlavePort__NameAssignment_1 ) ) ;
    public final void rule__CoordinationSlavePort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5307:1: ( ( ( rule__CoordinationSlavePort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:5308:1: ( ( rule__CoordinationSlavePort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5308:1: ( ( rule__CoordinationSlavePort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:5309:2: ( rule__CoordinationSlavePort__NameAssignment_1 )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:5310:2: ( rule__CoordinationSlavePort__NameAssignment_1 )
            // InternalComponentDefinition.g:5310:3: rule__CoordinationSlavePort__NameAssignment_1
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
    // InternalComponentDefinition.g:5318:1: rule__CoordinationSlavePort__Group__2 : rule__CoordinationSlavePort__Group__2__Impl rule__CoordinationSlavePort__Group__3 ;
    public final void rule__CoordinationSlavePort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5322:1: ( rule__CoordinationSlavePort__Group__2__Impl rule__CoordinationSlavePort__Group__3 )
            // InternalComponentDefinition.g:5323:2: rule__CoordinationSlavePort__Group__2__Impl rule__CoordinationSlavePort__Group__3
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
    // InternalComponentDefinition.g:5330:1: rule__CoordinationSlavePort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__CoordinationSlavePort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5334:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:5335:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:5335:1: ( 'implements' )
            // InternalComponentDefinition.g:5336:2: 'implements'
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
    // InternalComponentDefinition.g:5345:1: rule__CoordinationSlavePort__Group__3 : rule__CoordinationSlavePort__Group__3__Impl rule__CoordinationSlavePort__Group__4 ;
    public final void rule__CoordinationSlavePort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5349:1: ( rule__CoordinationSlavePort__Group__3__Impl rule__CoordinationSlavePort__Group__4 )
            // InternalComponentDefinition.g:5350:2: rule__CoordinationSlavePort__Group__3__Impl rule__CoordinationSlavePort__Group__4
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
    // InternalComponentDefinition.g:5357:1: rule__CoordinationSlavePort__Group__3__Impl : ( ( rule__CoordinationSlavePort__ServiceAssignment_3 ) ) ;
    public final void rule__CoordinationSlavePort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5361:1: ( ( ( rule__CoordinationSlavePort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:5362:1: ( ( rule__CoordinationSlavePort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:5362:1: ( ( rule__CoordinationSlavePort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:5363:2: ( rule__CoordinationSlavePort__ServiceAssignment_3 )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:5364:2: ( rule__CoordinationSlavePort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:5364:3: rule__CoordinationSlavePort__ServiceAssignment_3
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
    // InternalComponentDefinition.g:5372:1: rule__CoordinationSlavePort__Group__4 : rule__CoordinationSlavePort__Group__4__Impl rule__CoordinationSlavePort__Group__5 ;
    public final void rule__CoordinationSlavePort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5376:1: ( rule__CoordinationSlavePort__Group__4__Impl rule__CoordinationSlavePort__Group__5 )
            // InternalComponentDefinition.g:5377:2: rule__CoordinationSlavePort__Group__4__Impl rule__CoordinationSlavePort__Group__5
            {
            pushFollow(FOLLOW_38);
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
    // InternalComponentDefinition.g:5384:1: rule__CoordinationSlavePort__Group__4__Impl : ( '{' ) ;
    public final void rule__CoordinationSlavePort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5388:1: ( ( '{' ) )
            // InternalComponentDefinition.g:5389:1: ( '{' )
            {
            // InternalComponentDefinition.g:5389:1: ( '{' )
            // InternalComponentDefinition.g:5390:2: '{'
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
    // InternalComponentDefinition.g:5399:1: rule__CoordinationSlavePort__Group__5 : rule__CoordinationSlavePort__Group__5__Impl rule__CoordinationSlavePort__Group__6 ;
    public final void rule__CoordinationSlavePort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5403:1: ( rule__CoordinationSlavePort__Group__5__Impl rule__CoordinationSlavePort__Group__6 )
            // InternalComponentDefinition.g:5404:2: rule__CoordinationSlavePort__Group__5__Impl rule__CoordinationSlavePort__Group__6
            {
            pushFollow(FOLLOW_38);
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
    // InternalComponentDefinition.g:5411:1: rule__CoordinationSlavePort__Group__5__Impl : ( ( rule__CoordinationSlavePort__ElementsAssignment_5 )* ) ;
    public final void rule__CoordinationSlavePort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5415:1: ( ( ( rule__CoordinationSlavePort__ElementsAssignment_5 )* ) )
            // InternalComponentDefinition.g:5416:1: ( ( rule__CoordinationSlavePort__ElementsAssignment_5 )* )
            {
            // InternalComponentDefinition.g:5416:1: ( ( rule__CoordinationSlavePort__ElementsAssignment_5 )* )
            // InternalComponentDefinition.g:5417:2: ( rule__CoordinationSlavePort__ElementsAssignment_5 )*
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getElementsAssignment_5()); 
            // InternalComponentDefinition.g:5418:2: ( rule__CoordinationSlavePort__ElementsAssignment_5 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=54 && LA41_0<=55)||LA41_0==60||LA41_0==72) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalComponentDefinition.g:5418:3: rule__CoordinationSlavePort__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_39);
            	    rule__CoordinationSlavePort__ElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop41;
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
    // InternalComponentDefinition.g:5426:1: rule__CoordinationSlavePort__Group__6 : rule__CoordinationSlavePort__Group__6__Impl ;
    public final void rule__CoordinationSlavePort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5430:1: ( rule__CoordinationSlavePort__Group__6__Impl )
            // InternalComponentDefinition.g:5431:2: rule__CoordinationSlavePort__Group__6__Impl
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
    // InternalComponentDefinition.g:5437:1: rule__CoordinationSlavePort__Group__6__Impl : ( '}' ) ;
    public final void rule__CoordinationSlavePort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5441:1: ( ( '}' ) )
            // InternalComponentDefinition.g:5442:1: ( '}' )
            {
            // InternalComponentDefinition.g:5442:1: ( '}' )
            // InternalComponentDefinition.g:5443:2: '}'
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


    // $ANTLR start "rule__CommunicationServiceUsageRealization__Group__0"
    // InternalComponentDefinition.g:5453:1: rule__CommunicationServiceUsageRealization__Group__0 : rule__CommunicationServiceUsageRealization__Group__0__Impl rule__CommunicationServiceUsageRealization__Group__1 ;
    public final void rule__CommunicationServiceUsageRealization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5457:1: ( rule__CommunicationServiceUsageRealization__Group__0__Impl rule__CommunicationServiceUsageRealization__Group__1 )
            // InternalComponentDefinition.g:5458:2: rule__CommunicationServiceUsageRealization__Group__0__Impl rule__CommunicationServiceUsageRealization__Group__1
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
    // InternalComponentDefinition.g:5465:1: rule__CommunicationServiceUsageRealization__Group__0__Impl : ( 'with' ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5469:1: ( ( 'with' ) )
            // InternalComponentDefinition.g:5470:1: ( 'with' )
            {
            // InternalComponentDefinition.g:5470:1: ( 'with' )
            // InternalComponentDefinition.g:5471:2: 'with'
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getWithKeyword_0()); 
            match(input,54,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5480:1: rule__CommunicationServiceUsageRealization__Group__1 : rule__CommunicationServiceUsageRealization__Group__1__Impl rule__CommunicationServiceUsageRealization__Group__2 ;
    public final void rule__CommunicationServiceUsageRealization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5484:1: ( rule__CommunicationServiceUsageRealization__Group__1__Impl rule__CommunicationServiceUsageRealization__Group__2 )
            // InternalComponentDefinition.g:5485:2: rule__CommunicationServiceUsageRealization__Group__1__Impl rule__CommunicationServiceUsageRealization__Group__2
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
    // InternalComponentDefinition.g:5492:1: rule__CommunicationServiceUsageRealization__Group__1__Impl : ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5496:1: ( ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) ) )
            // InternalComponentDefinition.g:5497:1: ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5497:1: ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) )
            // InternalComponentDefinition.g:5498:2: ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageAssignment_1()); 
            // InternalComponentDefinition.g:5499:2: ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 )
            // InternalComponentDefinition.g:5499:3: rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1
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
    // InternalComponentDefinition.g:5507:1: rule__CommunicationServiceUsageRealization__Group__2 : rule__CommunicationServiceUsageRealization__Group__2__Impl rule__CommunicationServiceUsageRealization__Group__3 ;
    public final void rule__CommunicationServiceUsageRealization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5511:1: ( rule__CommunicationServiceUsageRealization__Group__2__Impl rule__CommunicationServiceUsageRealization__Group__3 )
            // InternalComponentDefinition.g:5512:2: rule__CommunicationServiceUsageRealization__Group__2__Impl rule__CommunicationServiceUsageRealization__Group__3
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
    // InternalComponentDefinition.g:5519:1: rule__CommunicationServiceUsageRealization__Group__2__Impl : ( 'realizedBy' ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5523:1: ( ( 'realizedBy' ) )
            // InternalComponentDefinition.g:5524:1: ( 'realizedBy' )
            {
            // InternalComponentDefinition.g:5524:1: ( 'realizedBy' )
            // InternalComponentDefinition.g:5525:2: 'realizedBy'
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
    // InternalComponentDefinition.g:5534:1: rule__CommunicationServiceUsageRealization__Group__3 : rule__CommunicationServiceUsageRealization__Group__3__Impl ;
    public final void rule__CommunicationServiceUsageRealization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5538:1: ( rule__CommunicationServiceUsageRealization__Group__3__Impl )
            // InternalComponentDefinition.g:5539:2: rule__CommunicationServiceUsageRealization__Group__3__Impl
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
    // InternalComponentDefinition.g:5545:1: rule__CommunicationServiceUsageRealization__Group__3__Impl : ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5549:1: ( ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:5550:1: ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:5550:1: ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) )
            // InternalComponentDefinition.g:5551:2: ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortAssignment_3()); 
            // InternalComponentDefinition.g:5552:2: ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 )
            // InternalComponentDefinition.g:5552:3: rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3
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
    // InternalComponentDefinition.g:5561:1: rule__PublicOperationMode__Group__0 : rule__PublicOperationMode__Group__0__Impl rule__PublicOperationMode__Group__1 ;
    public final void rule__PublicOperationMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5565:1: ( rule__PublicOperationMode__Group__0__Impl rule__PublicOperationMode__Group__1 )
            // InternalComponentDefinition.g:5566:2: rule__PublicOperationMode__Group__0__Impl rule__PublicOperationMode__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalComponentDefinition.g:5573:1: rule__PublicOperationMode__Group__0__Impl : ( () ) ;
    public final void rule__PublicOperationMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5577:1: ( ( () ) )
            // InternalComponentDefinition.g:5578:1: ( () )
            {
            // InternalComponentDefinition.g:5578:1: ( () )
            // InternalComponentDefinition.g:5579:2: ()
            {
             before(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeAction_0()); 
            // InternalComponentDefinition.g:5580:2: ()
            // InternalComponentDefinition.g:5580:3: 
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
    // InternalComponentDefinition.g:5588:1: rule__PublicOperationMode__Group__1 : rule__PublicOperationMode__Group__1__Impl rule__PublicOperationMode__Group__2 ;
    public final void rule__PublicOperationMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5592:1: ( rule__PublicOperationMode__Group__1__Impl rule__PublicOperationMode__Group__2 )
            // InternalComponentDefinition.g:5593:2: rule__PublicOperationMode__Group__1__Impl rule__PublicOperationMode__Group__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalComponentDefinition.g:5600:1: rule__PublicOperationMode__Group__1__Impl : ( ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )? ) ;
    public final void rule__PublicOperationMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5604:1: ( ( ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )? ) )
            // InternalComponentDefinition.g:5605:1: ( ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )? )
            {
            // InternalComponentDefinition.g:5605:1: ( ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )? )
            // InternalComponentDefinition.g:5606:2: ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )?
            {
             before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitAssignment_1()); 
            // InternalComponentDefinition.g:5607:2: ( rule__PublicOperationMode__IsDefaultInitAssignment_1 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==72) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalComponentDefinition.g:5607:3: rule__PublicOperationMode__IsDefaultInitAssignment_1
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
    // InternalComponentDefinition.g:5615:1: rule__PublicOperationMode__Group__2 : rule__PublicOperationMode__Group__2__Impl rule__PublicOperationMode__Group__3 ;
    public final void rule__PublicOperationMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5619:1: ( rule__PublicOperationMode__Group__2__Impl rule__PublicOperationMode__Group__3 )
            // InternalComponentDefinition.g:5620:2: rule__PublicOperationMode__Group__2__Impl rule__PublicOperationMode__Group__3
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
    // InternalComponentDefinition.g:5627:1: rule__PublicOperationMode__Group__2__Impl : ( 'PublicOperationMode' ) ;
    public final void rule__PublicOperationMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5631:1: ( ( 'PublicOperationMode' ) )
            // InternalComponentDefinition.g:5632:1: ( 'PublicOperationMode' )
            {
            // InternalComponentDefinition.g:5632:1: ( 'PublicOperationMode' )
            // InternalComponentDefinition.g:5633:2: 'PublicOperationMode'
            {
             before(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeKeyword_2()); 
            match(input,55,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5642:1: rule__PublicOperationMode__Group__3 : rule__PublicOperationMode__Group__3__Impl rule__PublicOperationMode__Group__4 ;
    public final void rule__PublicOperationMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5646:1: ( rule__PublicOperationMode__Group__3__Impl rule__PublicOperationMode__Group__4 )
            // InternalComponentDefinition.g:5647:2: rule__PublicOperationMode__Group__3__Impl rule__PublicOperationMode__Group__4
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
    // InternalComponentDefinition.g:5654:1: rule__PublicOperationMode__Group__3__Impl : ( ( rule__PublicOperationMode__ModeAssignment_3 ) ) ;
    public final void rule__PublicOperationMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5658:1: ( ( ( rule__PublicOperationMode__ModeAssignment_3 ) ) )
            // InternalComponentDefinition.g:5659:1: ( ( rule__PublicOperationMode__ModeAssignment_3 ) )
            {
            // InternalComponentDefinition.g:5659:1: ( ( rule__PublicOperationMode__ModeAssignment_3 ) )
            // InternalComponentDefinition.g:5660:2: ( rule__PublicOperationMode__ModeAssignment_3 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getModeAssignment_3()); 
            // InternalComponentDefinition.g:5661:2: ( rule__PublicOperationMode__ModeAssignment_3 )
            // InternalComponentDefinition.g:5661:3: rule__PublicOperationMode__ModeAssignment_3
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
    // InternalComponentDefinition.g:5669:1: rule__PublicOperationMode__Group__4 : rule__PublicOperationMode__Group__4__Impl rule__PublicOperationMode__Group__5 ;
    public final void rule__PublicOperationMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5673:1: ( rule__PublicOperationMode__Group__4__Impl rule__PublicOperationMode__Group__5 )
            // InternalComponentDefinition.g:5674:2: rule__PublicOperationMode__Group__4__Impl rule__PublicOperationMode__Group__5
            {
            pushFollow(FOLLOW_41);
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
    // InternalComponentDefinition.g:5681:1: rule__PublicOperationMode__Group__4__Impl : ( '{' ) ;
    public final void rule__PublicOperationMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5685:1: ( ( '{' ) )
            // InternalComponentDefinition.g:5686:1: ( '{' )
            {
            // InternalComponentDefinition.g:5686:1: ( '{' )
            // InternalComponentDefinition.g:5687:2: '{'
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
    // InternalComponentDefinition.g:5696:1: rule__PublicOperationMode__Group__5 : rule__PublicOperationMode__Group__5__Impl rule__PublicOperationMode__Group__6 ;
    public final void rule__PublicOperationMode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5700:1: ( rule__PublicOperationMode__Group__5__Impl rule__PublicOperationMode__Group__6 )
            // InternalComponentDefinition.g:5701:2: rule__PublicOperationMode__Group__5__Impl rule__PublicOperationMode__Group__6
            {
            pushFollow(FOLLOW_41);
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
    // InternalComponentDefinition.g:5708:1: rule__PublicOperationMode__Group__5__Impl : ( ( rule__PublicOperationMode__Group_5__0 )? ) ;
    public final void rule__PublicOperationMode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5712:1: ( ( ( rule__PublicOperationMode__Group_5__0 )? ) )
            // InternalComponentDefinition.g:5713:1: ( ( rule__PublicOperationMode__Group_5__0 )? )
            {
            // InternalComponentDefinition.g:5713:1: ( ( rule__PublicOperationMode__Group_5__0 )? )
            // InternalComponentDefinition.g:5714:2: ( rule__PublicOperationMode__Group_5__0 )?
            {
             before(grammarAccess.getPublicOperationModeAccess().getGroup_5()); 
            // InternalComponentDefinition.g:5715:2: ( rule__PublicOperationMode__Group_5__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==56) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalComponentDefinition.g:5715:3: rule__PublicOperationMode__Group_5__0
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
    // InternalComponentDefinition.g:5723:1: rule__PublicOperationMode__Group__6 : rule__PublicOperationMode__Group__6__Impl ;
    public final void rule__PublicOperationMode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5727:1: ( rule__PublicOperationMode__Group__6__Impl )
            // InternalComponentDefinition.g:5728:2: rule__PublicOperationMode__Group__6__Impl
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
    // InternalComponentDefinition.g:5734:1: rule__PublicOperationMode__Group__6__Impl : ( '}' ) ;
    public final void rule__PublicOperationMode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5738:1: ( ( '}' ) )
            // InternalComponentDefinition.g:5739:1: ( '}' )
            {
            // InternalComponentDefinition.g:5739:1: ( '}' )
            // InternalComponentDefinition.g:5740:2: '}'
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
    // InternalComponentDefinition.g:5750:1: rule__PublicOperationMode__Group_5__0 : rule__PublicOperationMode__Group_5__0__Impl rule__PublicOperationMode__Group_5__1 ;
    public final void rule__PublicOperationMode__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5754:1: ( rule__PublicOperationMode__Group_5__0__Impl rule__PublicOperationMode__Group_5__1 )
            // InternalComponentDefinition.g:5755:2: rule__PublicOperationMode__Group_5__0__Impl rule__PublicOperationMode__Group_5__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalComponentDefinition.g:5762:1: rule__PublicOperationMode__Group_5__0__Impl : ( 'activates' ) ;
    public final void rule__PublicOperationMode__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5766:1: ( ( 'activates' ) )
            // InternalComponentDefinition.g:5767:1: ( 'activates' )
            {
            // InternalComponentDefinition.g:5767:1: ( 'activates' )
            // InternalComponentDefinition.g:5768:2: 'activates'
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesKeyword_5_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5777:1: rule__PublicOperationMode__Group_5__1 : rule__PublicOperationMode__Group_5__1__Impl rule__PublicOperationMode__Group_5__2 ;
    public final void rule__PublicOperationMode__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5781:1: ( rule__PublicOperationMode__Group_5__1__Impl rule__PublicOperationMode__Group_5__2 )
            // InternalComponentDefinition.g:5782:2: rule__PublicOperationMode__Group_5__1__Impl rule__PublicOperationMode__Group_5__2
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
    // InternalComponentDefinition.g:5789:1: rule__PublicOperationMode__Group_5__1__Impl : ( '(' ) ;
    public final void rule__PublicOperationMode__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5793:1: ( ( '(' ) )
            // InternalComponentDefinition.g:5794:1: ( '(' )
            {
            // InternalComponentDefinition.g:5794:1: ( '(' )
            // InternalComponentDefinition.g:5795:2: '('
            {
             before(grammarAccess.getPublicOperationModeAccess().getLeftParenthesisKeyword_5_1()); 
            match(input,57,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5804:1: rule__PublicOperationMode__Group_5__2 : rule__PublicOperationMode__Group_5__2__Impl rule__PublicOperationMode__Group_5__3 ;
    public final void rule__PublicOperationMode__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5808:1: ( rule__PublicOperationMode__Group_5__2__Impl rule__PublicOperationMode__Group_5__3 )
            // InternalComponentDefinition.g:5809:2: rule__PublicOperationMode__Group_5__2__Impl rule__PublicOperationMode__Group_5__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalComponentDefinition.g:5816:1: rule__PublicOperationMode__Group_5__2__Impl : ( ( rule__PublicOperationMode__ActivatesAssignment_5_2 ) ) ;
    public final void rule__PublicOperationMode__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5820:1: ( ( ( rule__PublicOperationMode__ActivatesAssignment_5_2 ) ) )
            // InternalComponentDefinition.g:5821:1: ( ( rule__PublicOperationMode__ActivatesAssignment_5_2 ) )
            {
            // InternalComponentDefinition.g:5821:1: ( ( rule__PublicOperationMode__ActivatesAssignment_5_2 ) )
            // InternalComponentDefinition.g:5822:2: ( rule__PublicOperationMode__ActivatesAssignment_5_2 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_5_2()); 
            // InternalComponentDefinition.g:5823:2: ( rule__PublicOperationMode__ActivatesAssignment_5_2 )
            // InternalComponentDefinition.g:5823:3: rule__PublicOperationMode__ActivatesAssignment_5_2
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
    // InternalComponentDefinition.g:5831:1: rule__PublicOperationMode__Group_5__3 : rule__PublicOperationMode__Group_5__3__Impl rule__PublicOperationMode__Group_5__4 ;
    public final void rule__PublicOperationMode__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5835:1: ( rule__PublicOperationMode__Group_5__3__Impl rule__PublicOperationMode__Group_5__4 )
            // InternalComponentDefinition.g:5836:2: rule__PublicOperationMode__Group_5__3__Impl rule__PublicOperationMode__Group_5__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalComponentDefinition.g:5843:1: rule__PublicOperationMode__Group_5__3__Impl : ( ( rule__PublicOperationMode__Group_5_3__0 )* ) ;
    public final void rule__PublicOperationMode__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5847:1: ( ( ( rule__PublicOperationMode__Group_5_3__0 )* ) )
            // InternalComponentDefinition.g:5848:1: ( ( rule__PublicOperationMode__Group_5_3__0 )* )
            {
            // InternalComponentDefinition.g:5848:1: ( ( rule__PublicOperationMode__Group_5_3__0 )* )
            // InternalComponentDefinition.g:5849:2: ( rule__PublicOperationMode__Group_5_3__0 )*
            {
             before(grammarAccess.getPublicOperationModeAccess().getGroup_5_3()); 
            // InternalComponentDefinition.g:5850:2: ( rule__PublicOperationMode__Group_5_3__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==59) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalComponentDefinition.g:5850:3: rule__PublicOperationMode__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__PublicOperationMode__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalComponentDefinition.g:5858:1: rule__PublicOperationMode__Group_5__4 : rule__PublicOperationMode__Group_5__4__Impl ;
    public final void rule__PublicOperationMode__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5862:1: ( rule__PublicOperationMode__Group_5__4__Impl )
            // InternalComponentDefinition.g:5863:2: rule__PublicOperationMode__Group_5__4__Impl
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
    // InternalComponentDefinition.g:5869:1: rule__PublicOperationMode__Group_5__4__Impl : ( ')' ) ;
    public final void rule__PublicOperationMode__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5873:1: ( ( ')' ) )
            // InternalComponentDefinition.g:5874:1: ( ')' )
            {
            // InternalComponentDefinition.g:5874:1: ( ')' )
            // InternalComponentDefinition.g:5875:2: ')'
            {
             before(grammarAccess.getPublicOperationModeAccess().getRightParenthesisKeyword_5_4()); 
            match(input,58,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5885:1: rule__PublicOperationMode__Group_5_3__0 : rule__PublicOperationMode__Group_5_3__0__Impl rule__PublicOperationMode__Group_5_3__1 ;
    public final void rule__PublicOperationMode__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5889:1: ( rule__PublicOperationMode__Group_5_3__0__Impl rule__PublicOperationMode__Group_5_3__1 )
            // InternalComponentDefinition.g:5890:2: rule__PublicOperationMode__Group_5_3__0__Impl rule__PublicOperationMode__Group_5_3__1
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
    // InternalComponentDefinition.g:5897:1: rule__PublicOperationMode__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__PublicOperationMode__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5901:1: ( ( ',' ) )
            // InternalComponentDefinition.g:5902:1: ( ',' )
            {
            // InternalComponentDefinition.g:5902:1: ( ',' )
            // InternalComponentDefinition.g:5903:2: ','
            {
             before(grammarAccess.getPublicOperationModeAccess().getCommaKeyword_5_3_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5912:1: rule__PublicOperationMode__Group_5_3__1 : rule__PublicOperationMode__Group_5_3__1__Impl ;
    public final void rule__PublicOperationMode__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5916:1: ( rule__PublicOperationMode__Group_5_3__1__Impl )
            // InternalComponentDefinition.g:5917:2: rule__PublicOperationMode__Group_5_3__1__Impl
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
    // InternalComponentDefinition.g:5923:1: rule__PublicOperationMode__Group_5_3__1__Impl : ( ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 ) ) ;
    public final void rule__PublicOperationMode__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5927:1: ( ( ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 ) ) )
            // InternalComponentDefinition.g:5928:1: ( ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 ) )
            {
            // InternalComponentDefinition.g:5928:1: ( ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 ) )
            // InternalComponentDefinition.g:5929:2: ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_5_3_1()); 
            // InternalComponentDefinition.g:5930:2: ( rule__PublicOperationMode__ActivatesAssignment_5_3_1 )
            // InternalComponentDefinition.g:5930:3: rule__PublicOperationMode__ActivatesAssignment_5_3_1
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
    // InternalComponentDefinition.g:5939:1: rule__PrivateOperationMode__Group__0 : rule__PrivateOperationMode__Group__0__Impl rule__PrivateOperationMode__Group__1 ;
    public final void rule__PrivateOperationMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5943:1: ( rule__PrivateOperationMode__Group__0__Impl rule__PrivateOperationMode__Group__1 )
            // InternalComponentDefinition.g:5944:2: rule__PrivateOperationMode__Group__0__Impl rule__PrivateOperationMode__Group__1
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
    // InternalComponentDefinition.g:5951:1: rule__PrivateOperationMode__Group__0__Impl : ( 'PrivateOperationMode' ) ;
    public final void rule__PrivateOperationMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5955:1: ( ( 'PrivateOperationMode' ) )
            // InternalComponentDefinition.g:5956:1: ( 'PrivateOperationMode' )
            {
            // InternalComponentDefinition.g:5956:1: ( 'PrivateOperationMode' )
            // InternalComponentDefinition.g:5957:2: 'PrivateOperationMode'
            {
             before(grammarAccess.getPrivateOperationModeAccess().getPrivateOperationModeKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5966:1: rule__PrivateOperationMode__Group__1 : rule__PrivateOperationMode__Group__1__Impl rule__PrivateOperationMode__Group__2 ;
    public final void rule__PrivateOperationMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5970:1: ( rule__PrivateOperationMode__Group__1__Impl rule__PrivateOperationMode__Group__2 )
            // InternalComponentDefinition.g:5971:2: rule__PrivateOperationMode__Group__1__Impl rule__PrivateOperationMode__Group__2
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
    // InternalComponentDefinition.g:5978:1: rule__PrivateOperationMode__Group__1__Impl : ( ( rule__PrivateOperationMode__NameAssignment_1 ) ) ;
    public final void rule__PrivateOperationMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5982:1: ( ( ( rule__PrivateOperationMode__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:5983:1: ( ( rule__PrivateOperationMode__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5983:1: ( ( rule__PrivateOperationMode__NameAssignment_1 ) )
            // InternalComponentDefinition.g:5984:2: ( rule__PrivateOperationMode__NameAssignment_1 )
            {
             before(grammarAccess.getPrivateOperationModeAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:5985:2: ( rule__PrivateOperationMode__NameAssignment_1 )
            // InternalComponentDefinition.g:5985:3: rule__PrivateOperationMode__NameAssignment_1
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
    // InternalComponentDefinition.g:5993:1: rule__PrivateOperationMode__Group__2 : rule__PrivateOperationMode__Group__2__Impl ;
    public final void rule__PrivateOperationMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5997:1: ( rule__PrivateOperationMode__Group__2__Impl )
            // InternalComponentDefinition.g:5998:2: rule__PrivateOperationMode__Group__2__Impl
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
    // InternalComponentDefinition.g:6004:1: rule__PrivateOperationMode__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__PrivateOperationMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6008:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:6009:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:6009:1: ( ( ';' )? )
            // InternalComponentDefinition.g:6010:2: ( ';' )?
            {
             before(grammarAccess.getPrivateOperationModeAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:6011:2: ( ';' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==16) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalComponentDefinition.g:6011:3: ';'
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
    // InternalComponentDefinition.g:6020:1: rule__CoordinationMasterPort__Group__0 : rule__CoordinationMasterPort__Group__0__Impl rule__CoordinationMasterPort__Group__1 ;
    public final void rule__CoordinationMasterPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6024:1: ( rule__CoordinationMasterPort__Group__0__Impl rule__CoordinationMasterPort__Group__1 )
            // InternalComponentDefinition.g:6025:2: rule__CoordinationMasterPort__Group__0__Impl rule__CoordinationMasterPort__Group__1
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
    // InternalComponentDefinition.g:6032:1: rule__CoordinationMasterPort__Group__0__Impl : ( 'CoordinationMasterPort' ) ;
    public final void rule__CoordinationMasterPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6036:1: ( ( 'CoordinationMasterPort' ) )
            // InternalComponentDefinition.g:6037:1: ( 'CoordinationMasterPort' )
            {
            // InternalComponentDefinition.g:6037:1: ( 'CoordinationMasterPort' )
            // InternalComponentDefinition.g:6038:2: 'CoordinationMasterPort'
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getCoordinationMasterPortKeyword_0()); 
            match(input,61,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6047:1: rule__CoordinationMasterPort__Group__1 : rule__CoordinationMasterPort__Group__1__Impl rule__CoordinationMasterPort__Group__2 ;
    public final void rule__CoordinationMasterPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6051:1: ( rule__CoordinationMasterPort__Group__1__Impl rule__CoordinationMasterPort__Group__2 )
            // InternalComponentDefinition.g:6052:2: rule__CoordinationMasterPort__Group__1__Impl rule__CoordinationMasterPort__Group__2
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
    // InternalComponentDefinition.g:6059:1: rule__CoordinationMasterPort__Group__1__Impl : ( ( rule__CoordinationMasterPort__NameAssignment_1 ) ) ;
    public final void rule__CoordinationMasterPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6063:1: ( ( ( rule__CoordinationMasterPort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:6064:1: ( ( rule__CoordinationMasterPort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:6064:1: ( ( rule__CoordinationMasterPort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:6065:2: ( rule__CoordinationMasterPort__NameAssignment_1 )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:6066:2: ( rule__CoordinationMasterPort__NameAssignment_1 )
            // InternalComponentDefinition.g:6066:3: rule__CoordinationMasterPort__NameAssignment_1
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
    // InternalComponentDefinition.g:6074:1: rule__CoordinationMasterPort__Group__2 : rule__CoordinationMasterPort__Group__2__Impl rule__CoordinationMasterPort__Group__3 ;
    public final void rule__CoordinationMasterPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6078:1: ( rule__CoordinationMasterPort__Group__2__Impl rule__CoordinationMasterPort__Group__3 )
            // InternalComponentDefinition.g:6079:2: rule__CoordinationMasterPort__Group__2__Impl rule__CoordinationMasterPort__Group__3
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
    // InternalComponentDefinition.g:6086:1: rule__CoordinationMasterPort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__CoordinationMasterPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6090:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:6091:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:6091:1: ( 'implements' )
            // InternalComponentDefinition.g:6092:2: 'implements'
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
    // InternalComponentDefinition.g:6101:1: rule__CoordinationMasterPort__Group__3 : rule__CoordinationMasterPort__Group__3__Impl rule__CoordinationMasterPort__Group__4 ;
    public final void rule__CoordinationMasterPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6105:1: ( rule__CoordinationMasterPort__Group__3__Impl rule__CoordinationMasterPort__Group__4 )
            // InternalComponentDefinition.g:6106:2: rule__CoordinationMasterPort__Group__3__Impl rule__CoordinationMasterPort__Group__4
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
    // InternalComponentDefinition.g:6113:1: rule__CoordinationMasterPort__Group__3__Impl : ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) ) ;
    public final void rule__CoordinationMasterPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6117:1: ( ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:6118:1: ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:6118:1: ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:6119:2: ( rule__CoordinationMasterPort__ServiceAssignment_3 )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:6120:2: ( rule__CoordinationMasterPort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:6120:3: rule__CoordinationMasterPort__ServiceAssignment_3
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
    // InternalComponentDefinition.g:6128:1: rule__CoordinationMasterPort__Group__4 : rule__CoordinationMasterPort__Group__4__Impl ;
    public final void rule__CoordinationMasterPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6132:1: ( rule__CoordinationMasterPort__Group__4__Impl )
            // InternalComponentDefinition.g:6133:2: rule__CoordinationMasterPort__Group__4__Impl
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
    // InternalComponentDefinition.g:6139:1: rule__CoordinationMasterPort__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__CoordinationMasterPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6143:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:6144:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:6144:1: ( ( ';' )? )
            // InternalComponentDefinition.g:6145:2: ( ';' )?
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getSemicolonKeyword_4()); 
            // InternalComponentDefinition.g:6146:2: ( ';' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==16) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalComponentDefinition.g:6146:3: ';'
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
    // InternalComponentDefinition.g:6155:1: rule__ComponentParametersRef__Group__0 : rule__ComponentParametersRef__Group__0__Impl rule__ComponentParametersRef__Group__1 ;
    public final void rule__ComponentParametersRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6159:1: ( rule__ComponentParametersRef__Group__0__Impl rule__ComponentParametersRef__Group__1 )
            // InternalComponentDefinition.g:6160:2: rule__ComponentParametersRef__Group__0__Impl rule__ComponentParametersRef__Group__1
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
    // InternalComponentDefinition.g:6167:1: rule__ComponentParametersRef__Group__0__Impl : ( 'ComponentParameters' ) ;
    public final void rule__ComponentParametersRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6171:1: ( ( 'ComponentParameters' ) )
            // InternalComponentDefinition.g:6172:1: ( 'ComponentParameters' )
            {
            // InternalComponentDefinition.g:6172:1: ( 'ComponentParameters' )
            // InternalComponentDefinition.g:6173:2: 'ComponentParameters'
            {
             before(grammarAccess.getComponentParametersRefAccess().getComponentParametersKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6182:1: rule__ComponentParametersRef__Group__1 : rule__ComponentParametersRef__Group__1__Impl rule__ComponentParametersRef__Group__2 ;
    public final void rule__ComponentParametersRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6186:1: ( rule__ComponentParametersRef__Group__1__Impl rule__ComponentParametersRef__Group__2 )
            // InternalComponentDefinition.g:6187:2: rule__ComponentParametersRef__Group__1__Impl rule__ComponentParametersRef__Group__2
            {
            pushFollow(FOLLOW_45);
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
    // InternalComponentDefinition.g:6194:1: rule__ComponentParametersRef__Group__1__Impl : ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) ) ;
    public final void rule__ComponentParametersRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6198:1: ( ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) ) )
            // InternalComponentDefinition.g:6199:1: ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) )
            {
            // InternalComponentDefinition.g:6199:1: ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) )
            // InternalComponentDefinition.g:6200:2: ( rule__ComponentParametersRef__ParameterAssignment_1 )
            {
             before(grammarAccess.getComponentParametersRefAccess().getParameterAssignment_1()); 
            // InternalComponentDefinition.g:6201:2: ( rule__ComponentParametersRef__ParameterAssignment_1 )
            // InternalComponentDefinition.g:6201:3: rule__ComponentParametersRef__ParameterAssignment_1
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
    // InternalComponentDefinition.g:6209:1: rule__ComponentParametersRef__Group__2 : rule__ComponentParametersRef__Group__2__Impl rule__ComponentParametersRef__Group__3 ;
    public final void rule__ComponentParametersRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6213:1: ( rule__ComponentParametersRef__Group__2__Impl rule__ComponentParametersRef__Group__3 )
            // InternalComponentDefinition.g:6214:2: rule__ComponentParametersRef__Group__2__Impl rule__ComponentParametersRef__Group__3
            {
            pushFollow(FOLLOW_45);
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
    // InternalComponentDefinition.g:6221:1: rule__ComponentParametersRef__Group__2__Impl : ( ( rule__ComponentParametersRef__Group_2__0 )? ) ;
    public final void rule__ComponentParametersRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6225:1: ( ( ( rule__ComponentParametersRef__Group_2__0 )? ) )
            // InternalComponentDefinition.g:6226:1: ( ( rule__ComponentParametersRef__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:6226:1: ( ( rule__ComponentParametersRef__Group_2__0 )? )
            // InternalComponentDefinition.g:6227:2: ( rule__ComponentParametersRef__Group_2__0 )?
            {
             before(grammarAccess.getComponentParametersRefAccess().getGroup_2()); 
            // InternalComponentDefinition.g:6228:2: ( rule__ComponentParametersRef__Group_2__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==63) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalComponentDefinition.g:6228:3: rule__ComponentParametersRef__Group_2__0
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
    // InternalComponentDefinition.g:6236:1: rule__ComponentParametersRef__Group__3 : rule__ComponentParametersRef__Group__3__Impl ;
    public final void rule__ComponentParametersRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6240:1: ( rule__ComponentParametersRef__Group__3__Impl )
            // InternalComponentDefinition.g:6241:2: rule__ComponentParametersRef__Group__3__Impl
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
    // InternalComponentDefinition.g:6247:1: rule__ComponentParametersRef__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__ComponentParametersRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6251:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:6252:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:6252:1: ( ( ';' )? )
            // InternalComponentDefinition.g:6253:2: ( ';' )?
            {
             before(grammarAccess.getComponentParametersRefAccess().getSemicolonKeyword_3()); 
            // InternalComponentDefinition.g:6254:2: ( ';' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==16) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalComponentDefinition.g:6254:3: ';'
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
    // InternalComponentDefinition.g:6263:1: rule__ComponentParametersRef__Group_2__0 : rule__ComponentParametersRef__Group_2__0__Impl rule__ComponentParametersRef__Group_2__1 ;
    public final void rule__ComponentParametersRef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6267:1: ( rule__ComponentParametersRef__Group_2__0__Impl rule__ComponentParametersRef__Group_2__1 )
            // InternalComponentDefinition.g:6268:2: rule__ComponentParametersRef__Group_2__0__Impl rule__ComponentParametersRef__Group_2__1
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
    // InternalComponentDefinition.g:6275:1: rule__ComponentParametersRef__Group_2__0__Impl : ( 'slave' ) ;
    public final void rule__ComponentParametersRef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6279:1: ( ( 'slave' ) )
            // InternalComponentDefinition.g:6280:1: ( 'slave' )
            {
            // InternalComponentDefinition.g:6280:1: ( 'slave' )
            // InternalComponentDefinition.g:6281:2: 'slave'
            {
             before(grammarAccess.getComponentParametersRefAccess().getSlaveKeyword_2_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6290:1: rule__ComponentParametersRef__Group_2__1 : rule__ComponentParametersRef__Group_2__1__Impl ;
    public final void rule__ComponentParametersRef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6294:1: ( rule__ComponentParametersRef__Group_2__1__Impl )
            // InternalComponentDefinition.g:6295:2: rule__ComponentParametersRef__Group_2__1__Impl
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
    // InternalComponentDefinition.g:6301:1: rule__ComponentParametersRef__Group_2__1__Impl : ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) ) ;
    public final void rule__ComponentParametersRef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6305:1: ( ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:6306:1: ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:6306:1: ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) )
            // InternalComponentDefinition.g:6307:2: ( rule__ComponentParametersRef__SlaveAssignment_2_1 )
            {
             before(grammarAccess.getComponentParametersRefAccess().getSlaveAssignment_2_1()); 
            // InternalComponentDefinition.g:6308:2: ( rule__ComponentParametersRef__SlaveAssignment_2_1 )
            // InternalComponentDefinition.g:6308:3: rule__ComponentParametersRef__SlaveAssignment_2_1
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
    // InternalComponentDefinition.g:6317:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6321:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalComponentDefinition.g:6322:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalComponentDefinition.g:6329:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6333:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:6334:1: ( RULE_ID )
            {
            // InternalComponentDefinition.g:6334:1: ( RULE_ID )
            // InternalComponentDefinition.g:6335:2: RULE_ID
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
    // InternalComponentDefinition.g:6344:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6348:1: ( rule__FQN__Group__1__Impl )
            // InternalComponentDefinition.g:6349:2: rule__FQN__Group__1__Impl
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
    // InternalComponentDefinition.g:6355:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6359:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalComponentDefinition.g:6360:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalComponentDefinition.g:6360:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalComponentDefinition.g:6361:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalComponentDefinition.g:6362:2: ( rule__FQN__Group_1__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==64) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalComponentDefinition.g:6362:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalComponentDefinition.g:6371:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6375:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalComponentDefinition.g:6376:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalComponentDefinition.g:6383:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6387:1: ( ( '.' ) )
            // InternalComponentDefinition.g:6388:1: ( '.' )
            {
            // InternalComponentDefinition.g:6388:1: ( '.' )
            // InternalComponentDefinition.g:6389:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,64,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6398:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6402:1: ( rule__FQN__Group_1__1__Impl )
            // InternalComponentDefinition.g:6403:2: rule__FQN__Group_1__1__Impl
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
    // InternalComponentDefinition.g:6409:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6413:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:6414:1: ( RULE_ID )
            {
            // InternalComponentDefinition.g:6414:1: ( RULE_ID )
            // InternalComponentDefinition.g:6415:2: RULE_ID
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
    // InternalComponentDefinition.g:6425:1: rule__FQNW__Group__0 : rule__FQNW__Group__0__Impl rule__FQNW__Group__1 ;
    public final void rule__FQNW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6429:1: ( rule__FQNW__Group__0__Impl rule__FQNW__Group__1 )
            // InternalComponentDefinition.g:6430:2: rule__FQNW__Group__0__Impl rule__FQNW__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalComponentDefinition.g:6437:1: rule__FQNW__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6441:1: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:6442:1: ( ruleFQN )
            {
            // InternalComponentDefinition.g:6442:1: ( ruleFQN )
            // InternalComponentDefinition.g:6443:2: ruleFQN
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
    // InternalComponentDefinition.g:6452:1: rule__FQNW__Group__1 : rule__FQNW__Group__1__Impl ;
    public final void rule__FQNW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6456:1: ( rule__FQNW__Group__1__Impl )
            // InternalComponentDefinition.g:6457:2: rule__FQNW__Group__1__Impl
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
    // InternalComponentDefinition.g:6463:1: rule__FQNW__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6467:1: ( ( ( '.*' )? ) )
            // InternalComponentDefinition.g:6468:1: ( ( '.*' )? )
            {
            // InternalComponentDefinition.g:6468:1: ( ( '.*' )? )
            // InternalComponentDefinition.g:6469:2: ( '.*' )?
            {
             before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); 
            // InternalComponentDefinition.g:6470:2: ( '.*' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==65) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalComponentDefinition.g:6470:3: '.*'
                    {
                    match(input,65,FOLLOW_2); 

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
    // InternalComponentDefinition.g:6479:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6483:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalComponentDefinition.g:6484:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalComponentDefinition.g:6491:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6495:1: ( ( ( '-' )? ) )
            // InternalComponentDefinition.g:6496:1: ( ( '-' )? )
            {
            // InternalComponentDefinition.g:6496:1: ( ( '-' )? )
            // InternalComponentDefinition.g:6497:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalComponentDefinition.g:6498:2: ( '-' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==66) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalComponentDefinition.g:6498:3: '-'
                    {
                    match(input,66,FOLLOW_2); 

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
    // InternalComponentDefinition.g:6506:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6510:1: ( rule__EInt__Group__1__Impl )
            // InternalComponentDefinition.g:6511:2: rule__EInt__Group__1__Impl
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
    // InternalComponentDefinition.g:6517:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6521:1: ( ( RULE_INT ) )
            // InternalComponentDefinition.g:6522:1: ( RULE_INT )
            {
            // InternalComponentDefinition.g:6522:1: ( RULE_INT )
            // InternalComponentDefinition.g:6523:2: RULE_INT
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
    // InternalComponentDefinition.g:6533:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6537:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalComponentDefinition.g:6538:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
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
    // InternalComponentDefinition.g:6545:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6549:1: ( ( ( '-' )? ) )
            // InternalComponentDefinition.g:6550:1: ( ( '-' )? )
            {
            // InternalComponentDefinition.g:6550:1: ( ( '-' )? )
            // InternalComponentDefinition.g:6551:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalComponentDefinition.g:6552:2: ( '-' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==66) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalComponentDefinition.g:6552:3: '-'
                    {
                    match(input,66,FOLLOW_2); 

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
    // InternalComponentDefinition.g:6560:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6564:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalComponentDefinition.g:6565:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
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
    // InternalComponentDefinition.g:6572:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6576:1: ( ( ( RULE_INT )? ) )
            // InternalComponentDefinition.g:6577:1: ( ( RULE_INT )? )
            {
            // InternalComponentDefinition.g:6577:1: ( ( RULE_INT )? )
            // InternalComponentDefinition.g:6578:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalComponentDefinition.g:6579:2: ( RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_INT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalComponentDefinition.g:6579:3: RULE_INT
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
    // InternalComponentDefinition.g:6587:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6591:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalComponentDefinition.g:6592:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_49);
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
    // InternalComponentDefinition.g:6599:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6603:1: ( ( '.' ) )
            // InternalComponentDefinition.g:6604:1: ( '.' )
            {
            // InternalComponentDefinition.g:6604:1: ( '.' )
            // InternalComponentDefinition.g:6605:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,64,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6614:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6618:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalComponentDefinition.g:6619:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_50);
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
    // InternalComponentDefinition.g:6626:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6630:1: ( ( RULE_INT ) )
            // InternalComponentDefinition.g:6631:1: ( RULE_INT )
            {
            // InternalComponentDefinition.g:6631:1: ( RULE_INT )
            // InternalComponentDefinition.g:6632:2: RULE_INT
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
    // InternalComponentDefinition.g:6641:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6645:1: ( rule__EDouble__Group__4__Impl )
            // InternalComponentDefinition.g:6646:2: rule__EDouble__Group__4__Impl
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
    // InternalComponentDefinition.g:6652:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6656:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalComponentDefinition.g:6657:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalComponentDefinition.g:6657:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalComponentDefinition.g:6658:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalComponentDefinition.g:6659:2: ( rule__EDouble__Group_4__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=11 && LA54_0<=12)) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalComponentDefinition.g:6659:3: rule__EDouble__Group_4__0
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
    // InternalComponentDefinition.g:6668:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6672:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalComponentDefinition.g:6673:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
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
    // InternalComponentDefinition.g:6680:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6684:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalComponentDefinition.g:6685:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalComponentDefinition.g:6685:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalComponentDefinition.g:6686:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalComponentDefinition.g:6687:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalComponentDefinition.g:6687:3: rule__EDouble__Alternatives_4_0
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
    // InternalComponentDefinition.g:6695:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6699:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalComponentDefinition.g:6700:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
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
    // InternalComponentDefinition.g:6707:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6711:1: ( ( ( '-' )? ) )
            // InternalComponentDefinition.g:6712:1: ( ( '-' )? )
            {
            // InternalComponentDefinition.g:6712:1: ( ( '-' )? )
            // InternalComponentDefinition.g:6713:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalComponentDefinition.g:6714:2: ( '-' )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==66) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalComponentDefinition.g:6714:3: '-'
                    {
                    match(input,66,FOLLOW_2); 

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
    // InternalComponentDefinition.g:6722:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6726:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalComponentDefinition.g:6727:2: rule__EDouble__Group_4__2__Impl
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
    // InternalComponentDefinition.g:6733:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6737:1: ( ( RULE_INT ) )
            // InternalComponentDefinition.g:6738:1: ( RULE_INT )
            {
            // InternalComponentDefinition.g:6738:1: ( RULE_INT )
            // InternalComponentDefinition.g:6739:2: RULE_INT
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
    // InternalComponentDefinition.g:6749:1: rule__ACE_SmartSoft__Group__0 : rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 ;
    public final void rule__ACE_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6753:1: ( rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 )
            // InternalComponentDefinition.g:6754:2: rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_51);
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
    // InternalComponentDefinition.g:6761:1: rule__ACE_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__ACE_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6765:1: ( ( () ) )
            // InternalComponentDefinition.g:6766:1: ( () )
            {
            // InternalComponentDefinition.g:6766:1: ( () )
            // InternalComponentDefinition.g:6767:2: ()
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); 
            // InternalComponentDefinition.g:6768:2: ()
            // InternalComponentDefinition.g:6768:3: 
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
    // InternalComponentDefinition.g:6776:1: rule__ACE_SmartSoft__Group__1 : rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 ;
    public final void rule__ACE_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6780:1: ( rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 )
            // InternalComponentDefinition.g:6781:2: rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalComponentDefinition.g:6788:1: rule__ACE_SmartSoft__Group__1__Impl : ( 'ACE_SmartSoft' ) ;
    public final void rule__ACE_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6792:1: ( ( 'ACE_SmartSoft' ) )
            // InternalComponentDefinition.g:6793:1: ( 'ACE_SmartSoft' )
            {
            // InternalComponentDefinition.g:6793:1: ( 'ACE_SmartSoft' )
            // InternalComponentDefinition.g:6794:2: 'ACE_SmartSoft'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); 
            match(input,67,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6803:1: rule__ACE_SmartSoft__Group__2 : rule__ACE_SmartSoft__Group__2__Impl ;
    public final void rule__ACE_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6807:1: ( rule__ACE_SmartSoft__Group__2__Impl )
            // InternalComponentDefinition.g:6808:2: rule__ACE_SmartSoft__Group__2__Impl
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
    // InternalComponentDefinition.g:6814:1: rule__ACE_SmartSoft__Group__2__Impl : ( ( rule__ACE_SmartSoft__Group_2__0 )? ) ;
    public final void rule__ACE_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6818:1: ( ( ( rule__ACE_SmartSoft__Group_2__0 )? ) )
            // InternalComponentDefinition.g:6819:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:6819:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            // InternalComponentDefinition.g:6820:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); 
            // InternalComponentDefinition.g:6821:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==68) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalComponentDefinition.g:6821:3: rule__ACE_SmartSoft__Group_2__0
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
    // InternalComponentDefinition.g:6830:1: rule__ACE_SmartSoft__Group_2__0 : rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 ;
    public final void rule__ACE_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6834:1: ( rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 )
            // InternalComponentDefinition.g:6835:2: rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1
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
    // InternalComponentDefinition.g:6842:1: rule__ACE_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__ACE_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6846:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:6847:1: ( 'description' )
            {
            // InternalComponentDefinition.g:6847:1: ( 'description' )
            // InternalComponentDefinition.g:6848:2: 'description'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6857:1: rule__ACE_SmartSoft__Group_2__1 : rule__ACE_SmartSoft__Group_2__1__Impl ;
    public final void rule__ACE_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6861:1: ( rule__ACE_SmartSoft__Group_2__1__Impl )
            // InternalComponentDefinition.g:6862:2: rule__ACE_SmartSoft__Group_2__1__Impl
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
    // InternalComponentDefinition.g:6868:1: rule__ACE_SmartSoft__Group_2__1__Impl : ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__ACE_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6872:1: ( ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:6873:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:6873:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:6874:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:6875:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:6875:3: rule__ACE_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentDefinition.g:6884:1: rule__OpcUa_SeRoNet__Group__0 : rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 ;
    public final void rule__OpcUa_SeRoNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6888:1: ( rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 )
            // InternalComponentDefinition.g:6889:2: rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalComponentDefinition.g:6896:1: rule__OpcUa_SeRoNet__Group__0__Impl : ( () ) ;
    public final void rule__OpcUa_SeRoNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6900:1: ( ( () ) )
            // InternalComponentDefinition.g:6901:1: ( () )
            {
            // InternalComponentDefinition.g:6901:1: ( () )
            // InternalComponentDefinition.g:6902:2: ()
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); 
            // InternalComponentDefinition.g:6903:2: ()
            // InternalComponentDefinition.g:6903:3: 
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
    // InternalComponentDefinition.g:6911:1: rule__OpcUa_SeRoNet__Group__1 : rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 ;
    public final void rule__OpcUa_SeRoNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6915:1: ( rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 )
            // InternalComponentDefinition.g:6916:2: rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalComponentDefinition.g:6923:1: rule__OpcUa_SeRoNet__Group__1__Impl : ( 'OpcUa_SeRoNet' ) ;
    public final void rule__OpcUa_SeRoNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6927:1: ( ( 'OpcUa_SeRoNet' ) )
            // InternalComponentDefinition.g:6928:1: ( 'OpcUa_SeRoNet' )
            {
            // InternalComponentDefinition.g:6928:1: ( 'OpcUa_SeRoNet' )
            // InternalComponentDefinition.g:6929:2: 'OpcUa_SeRoNet'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); 
            match(input,69,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6938:1: rule__OpcUa_SeRoNet__Group__2 : rule__OpcUa_SeRoNet__Group__2__Impl ;
    public final void rule__OpcUa_SeRoNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6942:1: ( rule__OpcUa_SeRoNet__Group__2__Impl )
            // InternalComponentDefinition.g:6943:2: rule__OpcUa_SeRoNet__Group__2__Impl
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
    // InternalComponentDefinition.g:6949:1: rule__OpcUa_SeRoNet__Group__2__Impl : ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) ;
    public final void rule__OpcUa_SeRoNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6953:1: ( ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) )
            // InternalComponentDefinition.g:6954:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:6954:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            // InternalComponentDefinition.g:6955:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); 
            // InternalComponentDefinition.g:6956:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==68) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalComponentDefinition.g:6956:3: rule__OpcUa_SeRoNet__Group_2__0
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
    // InternalComponentDefinition.g:6965:1: rule__OpcUa_SeRoNet__Group_2__0 : rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 ;
    public final void rule__OpcUa_SeRoNet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6969:1: ( rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 )
            // InternalComponentDefinition.g:6970:2: rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1
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
    // InternalComponentDefinition.g:6977:1: rule__OpcUa_SeRoNet__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6981:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:6982:1: ( 'description' )
            {
            // InternalComponentDefinition.g:6982:1: ( 'description' )
            // InternalComponentDefinition.g:6983:2: 'description'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6992:1: rule__OpcUa_SeRoNet__Group_2__1 : rule__OpcUa_SeRoNet__Group_2__1__Impl ;
    public final void rule__OpcUa_SeRoNet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6996:1: ( rule__OpcUa_SeRoNet__Group_2__1__Impl )
            // InternalComponentDefinition.g:6997:2: rule__OpcUa_SeRoNet__Group_2__1__Impl
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
    // InternalComponentDefinition.g:7003:1: rule__OpcUa_SeRoNet__Group_2__1__Impl : ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7007:1: ( ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:7008:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:7008:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:7009:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:7010:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:7010:3: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1
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
    // InternalComponentDefinition.g:7019:1: rule__CORBA_SmartSoft__Group__0 : rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 ;
    public final void rule__CORBA_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7023:1: ( rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 )
            // InternalComponentDefinition.g:7024:2: rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_54);
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
    // InternalComponentDefinition.g:7031:1: rule__CORBA_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__CORBA_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7035:1: ( ( () ) )
            // InternalComponentDefinition.g:7036:1: ( () )
            {
            // InternalComponentDefinition.g:7036:1: ( () )
            // InternalComponentDefinition.g:7037:2: ()
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); 
            // InternalComponentDefinition.g:7038:2: ()
            // InternalComponentDefinition.g:7038:3: 
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
    // InternalComponentDefinition.g:7046:1: rule__CORBA_SmartSoft__Group__1 : rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 ;
    public final void rule__CORBA_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7050:1: ( rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 )
            // InternalComponentDefinition.g:7051:2: rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalComponentDefinition.g:7058:1: rule__CORBA_SmartSoft__Group__1__Impl : ( 'CORBA_SmartSoft' ) ;
    public final void rule__CORBA_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7062:1: ( ( 'CORBA_SmartSoft' ) )
            // InternalComponentDefinition.g:7063:1: ( 'CORBA_SmartSoft' )
            {
            // InternalComponentDefinition.g:7063:1: ( 'CORBA_SmartSoft' )
            // InternalComponentDefinition.g:7064:2: 'CORBA_SmartSoft'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); 
            match(input,70,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7073:1: rule__CORBA_SmartSoft__Group__2 : rule__CORBA_SmartSoft__Group__2__Impl ;
    public final void rule__CORBA_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7077:1: ( rule__CORBA_SmartSoft__Group__2__Impl )
            // InternalComponentDefinition.g:7078:2: rule__CORBA_SmartSoft__Group__2__Impl
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
    // InternalComponentDefinition.g:7084:1: rule__CORBA_SmartSoft__Group__2__Impl : ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) ;
    public final void rule__CORBA_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7088:1: ( ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) )
            // InternalComponentDefinition.g:7089:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:7089:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            // InternalComponentDefinition.g:7090:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); 
            // InternalComponentDefinition.g:7091:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==68) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalComponentDefinition.g:7091:3: rule__CORBA_SmartSoft__Group_2__0
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
    // InternalComponentDefinition.g:7100:1: rule__CORBA_SmartSoft__Group_2__0 : rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 ;
    public final void rule__CORBA_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7104:1: ( rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 )
            // InternalComponentDefinition.g:7105:2: rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1
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
    // InternalComponentDefinition.g:7112:1: rule__CORBA_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__CORBA_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7116:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:7117:1: ( 'description' )
            {
            // InternalComponentDefinition.g:7117:1: ( 'description' )
            // InternalComponentDefinition.g:7118:2: 'description'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7127:1: rule__CORBA_SmartSoft__Group_2__1 : rule__CORBA_SmartSoft__Group_2__1__Impl ;
    public final void rule__CORBA_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7131:1: ( rule__CORBA_SmartSoft__Group_2__1__Impl )
            // InternalComponentDefinition.g:7132:2: rule__CORBA_SmartSoft__Group_2__1__Impl
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
    // InternalComponentDefinition.g:7138:1: rule__CORBA_SmartSoft__Group_2__1__Impl : ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__CORBA_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7142:1: ( ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:7143:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:7143:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:7144:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:7145:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:7145:3: rule__CORBA_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentDefinition.g:7154:1: rule__DDS_SmartSoft__Group__0 : rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 ;
    public final void rule__DDS_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7158:1: ( rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 )
            // InternalComponentDefinition.g:7159:2: rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1
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
    // InternalComponentDefinition.g:7166:1: rule__DDS_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__DDS_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7170:1: ( ( () ) )
            // InternalComponentDefinition.g:7171:1: ( () )
            {
            // InternalComponentDefinition.g:7171:1: ( () )
            // InternalComponentDefinition.g:7172:2: ()
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); 
            // InternalComponentDefinition.g:7173:2: ()
            // InternalComponentDefinition.g:7173:3: 
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
    // InternalComponentDefinition.g:7181:1: rule__DDS_SmartSoft__Group__1 : rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 ;
    public final void rule__DDS_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7185:1: ( rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 )
            // InternalComponentDefinition.g:7186:2: rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalComponentDefinition.g:7193:1: rule__DDS_SmartSoft__Group__1__Impl : ( 'DDS_SmartSoft' ) ;
    public final void rule__DDS_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7197:1: ( ( 'DDS_SmartSoft' ) )
            // InternalComponentDefinition.g:7198:1: ( 'DDS_SmartSoft' )
            {
            // InternalComponentDefinition.g:7198:1: ( 'DDS_SmartSoft' )
            // InternalComponentDefinition.g:7199:2: 'DDS_SmartSoft'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); 
            match(input,71,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7208:1: rule__DDS_SmartSoft__Group__2 : rule__DDS_SmartSoft__Group__2__Impl ;
    public final void rule__DDS_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7212:1: ( rule__DDS_SmartSoft__Group__2__Impl )
            // InternalComponentDefinition.g:7213:2: rule__DDS_SmartSoft__Group__2__Impl
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
    // InternalComponentDefinition.g:7219:1: rule__DDS_SmartSoft__Group__2__Impl : ( ( rule__DDS_SmartSoft__Group_2__0 )? ) ;
    public final void rule__DDS_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7223:1: ( ( ( rule__DDS_SmartSoft__Group_2__0 )? ) )
            // InternalComponentDefinition.g:7224:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:7224:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            // InternalComponentDefinition.g:7225:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); 
            // InternalComponentDefinition.g:7226:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==68) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalComponentDefinition.g:7226:3: rule__DDS_SmartSoft__Group_2__0
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
    // InternalComponentDefinition.g:7235:1: rule__DDS_SmartSoft__Group_2__0 : rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 ;
    public final void rule__DDS_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7239:1: ( rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 )
            // InternalComponentDefinition.g:7240:2: rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1
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
    // InternalComponentDefinition.g:7247:1: rule__DDS_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__DDS_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7251:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:7252:1: ( 'description' )
            {
            // InternalComponentDefinition.g:7252:1: ( 'description' )
            // InternalComponentDefinition.g:7253:2: 'description'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,68,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7262:1: rule__DDS_SmartSoft__Group_2__1 : rule__DDS_SmartSoft__Group_2__1__Impl ;
    public final void rule__DDS_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7266:1: ( rule__DDS_SmartSoft__Group_2__1__Impl )
            // InternalComponentDefinition.g:7267:2: rule__DDS_SmartSoft__Group_2__1__Impl
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
    // InternalComponentDefinition.g:7273:1: rule__DDS_SmartSoft__Group_2__1__Impl : ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__DDS_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7277:1: ( ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:7278:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:7278:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:7279:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:7280:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:7280:3: rule__DDS_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentDefinition.g:7289:1: rule__InputLinkExtension__UnorderedGroup_4 : ( rule__InputLinkExtension__UnorderedGroup_4__0 )? ;
    public final void rule__InputLinkExtension__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
        	
        try {
            // InternalComponentDefinition.g:7294:1: ( ( rule__InputLinkExtension__UnorderedGroup_4__0 )? )
            // InternalComponentDefinition.g:7295:2: ( rule__InputLinkExtension__UnorderedGroup_4__0 )?
            {
            // InternalComponentDefinition.g:7295:2: ( rule__InputLinkExtension__UnorderedGroup_4__0 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( LA60_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt60=1;
            }
            else if ( LA60_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt60=1;
            }
            else if ( LA60_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalComponentDefinition.g:7295:2: rule__InputLinkExtension__UnorderedGroup_4__0
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
    // InternalComponentDefinition.g:7303:1: rule__InputLinkExtension__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) ) ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDefinition.g:7308:1: ( ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) ) )
            // InternalComponentDefinition.g:7309:3: ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) )
            {
            // InternalComponentDefinition.g:7309:3: ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) )
            int alt61=3;
            int LA61_0 = input.LA(1);

            if ( LA61_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt61=1;
            }
            else if ( LA61_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt61=2;
            }
            else if ( LA61_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt61=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalComponentDefinition.g:7310:3: ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7310:3: ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) )
                    // InternalComponentDefinition.g:7311:4: {...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__InputLinkExtension__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalComponentDefinition.g:7311:114: ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) )
                    // InternalComponentDefinition.g:7312:5: ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7318:5: ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) )
                    // InternalComponentDefinition.g:7319:6: ( rule__InputLinkExtension__OptionalAssignment_4_0 )
                    {
                     before(grammarAccess.getInputLinkExtensionAccess().getOptionalAssignment_4_0()); 
                    // InternalComponentDefinition.g:7320:6: ( rule__InputLinkExtension__OptionalAssignment_4_0 )
                    // InternalComponentDefinition.g:7320:7: rule__InputLinkExtension__OptionalAssignment_4_0
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
                    // InternalComponentDefinition.g:7325:3: ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7325:3: ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) )
                    // InternalComponentDefinition.g:7326:4: {...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__InputLinkExtension__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalComponentDefinition.g:7326:114: ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) )
                    // InternalComponentDefinition.g:7327:5: ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7333:5: ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) )
                    // InternalComponentDefinition.g:7334:6: ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 )
                    {
                     before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkAssignment_4_1()); 
                    // InternalComponentDefinition.g:7335:6: ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 )
                    // InternalComponentDefinition.g:7335:7: rule__InputLinkExtension__OversamplingOkAssignment_4_1
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
                    // InternalComponentDefinition.g:7340:3: ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7340:3: ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) )
                    // InternalComponentDefinition.g:7341:4: {...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__InputLinkExtension__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalComponentDefinition.g:7341:114: ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) )
                    // InternalComponentDefinition.g:7342:5: ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7348:5: ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) )
                    // InternalComponentDefinition.g:7349:6: ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 )
                    {
                     before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkAssignment_4_2()); 
                    // InternalComponentDefinition.g:7350:6: ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 )
                    // InternalComponentDefinition.g:7350:7: rule__InputLinkExtension__UndersamplingOkAssignment_4_2
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
    // InternalComponentDefinition.g:7363:1: rule__InputLinkExtension__UnorderedGroup_4__0 : rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__1 )? ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7367:1: ( rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__1 )? )
            // InternalComponentDefinition.g:7368:2: rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_55);
            rule__InputLinkExtension__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:7369:2: ( rule__InputLinkExtension__UnorderedGroup_4__1 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( LA62_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt62=1;
            }
            else if ( LA62_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt62=1;
            }
            else if ( LA62_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalComponentDefinition.g:7369:2: rule__InputLinkExtension__UnorderedGroup_4__1
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
    // InternalComponentDefinition.g:7375:1: rule__InputLinkExtension__UnorderedGroup_4__1 : rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__2 )? ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7379:1: ( rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__2 )? )
            // InternalComponentDefinition.g:7380:2: rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_55);
            rule__InputLinkExtension__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:7381:2: ( rule__InputLinkExtension__UnorderedGroup_4__2 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( LA63_0 == 74 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt63=1;
            }
            else if ( LA63_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt63=1;
            }
            else if ( LA63_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalComponentDefinition.g:7381:2: rule__InputLinkExtension__UnorderedGroup_4__2
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
    // InternalComponentDefinition.g:7387:1: rule__InputLinkExtension__UnorderedGroup_4__2 : rule__InputLinkExtension__UnorderedGroup_4__Impl ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7391:1: ( rule__InputLinkExtension__UnorderedGroup_4__Impl )
            // InternalComponentDefinition.g:7392:2: rule__InputLinkExtension__UnorderedGroup_4__Impl
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
    // InternalComponentDefinition.g:7399:1: rule__ActivationConstraints__UnorderedGroup_7 : ( rule__ActivationConstraints__UnorderedGroup_7__0 )? ;
    public final void rule__ActivationConstraints__UnorderedGroup_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
        	
        try {
            // InternalComponentDefinition.g:7404:1: ( ( rule__ActivationConstraints__UnorderedGroup_7__0 )? )
            // InternalComponentDefinition.g:7405:2: ( rule__ActivationConstraints__UnorderedGroup_7__0 )?
            {
            // InternalComponentDefinition.g:7405:2: ( rule__ActivationConstraints__UnorderedGroup_7__0 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( LA64_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                alt64=1;
            }
            else if ( LA64_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalComponentDefinition.g:7405:2: rule__ActivationConstraints__UnorderedGroup_7__0
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
    // InternalComponentDefinition.g:7413:1: rule__ActivationConstraints__UnorderedGroup_7__Impl : ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) ) ;
    public final void rule__ActivationConstraints__UnorderedGroup_7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDefinition.g:7418:1: ( ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) ) )
            // InternalComponentDefinition.g:7419:3: ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) )
            {
            // InternalComponentDefinition.g:7419:3: ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( LA65_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                alt65=1;
            }
            else if ( LA65_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalComponentDefinition.g:7420:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7420:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) )
                    // InternalComponentDefinition.g:7421:4: {...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ActivationConstraints__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0)");
                    }
                    // InternalComponentDefinition.g:7421:117: ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) )
                    // InternalComponentDefinition.g:7422:5: ( ( rule__ActivationConstraints__Group_7_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7428:5: ( ( rule__ActivationConstraints__Group_7_0__0 ) )
                    // InternalComponentDefinition.g:7429:6: ( rule__ActivationConstraints__Group_7_0__0 )
                    {
                     before(grammarAccess.getActivationConstraintsAccess().getGroup_7_0()); 
                    // InternalComponentDefinition.g:7430:6: ( rule__ActivationConstraints__Group_7_0__0 )
                    // InternalComponentDefinition.g:7430:7: rule__ActivationConstraints__Group_7_0__0
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
                    // InternalComponentDefinition.g:7435:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7435:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) )
                    // InternalComponentDefinition.g:7436:4: {...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ActivationConstraints__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1)");
                    }
                    // InternalComponentDefinition.g:7436:117: ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) )
                    // InternalComponentDefinition.g:7437:5: ( ( rule__ActivationConstraints__Group_7_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7443:5: ( ( rule__ActivationConstraints__Group_7_1__0 ) )
                    // InternalComponentDefinition.g:7444:6: ( rule__ActivationConstraints__Group_7_1__0 )
                    {
                     before(grammarAccess.getActivationConstraintsAccess().getGroup_7_1()); 
                    // InternalComponentDefinition.g:7445:6: ( rule__ActivationConstraints__Group_7_1__0 )
                    // InternalComponentDefinition.g:7445:7: rule__ActivationConstraints__Group_7_1__0
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
    // InternalComponentDefinition.g:7458:1: rule__ActivationConstraints__UnorderedGroup_7__0 : rule__ActivationConstraints__UnorderedGroup_7__Impl ( rule__ActivationConstraints__UnorderedGroup_7__1 )? ;
    public final void rule__ActivationConstraints__UnorderedGroup_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7462:1: ( rule__ActivationConstraints__UnorderedGroup_7__Impl ( rule__ActivationConstraints__UnorderedGroup_7__1 )? )
            // InternalComponentDefinition.g:7463:2: rule__ActivationConstraints__UnorderedGroup_7__Impl ( rule__ActivationConstraints__UnorderedGroup_7__1 )?
            {
            pushFollow(FOLLOW_56);
            rule__ActivationConstraints__UnorderedGroup_7__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:7464:2: ( rule__ActivationConstraints__UnorderedGroup_7__1 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( LA66_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                alt66=1;
            }
            else if ( LA66_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalComponentDefinition.g:7464:2: rule__ActivationConstraints__UnorderedGroup_7__1
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
    // InternalComponentDefinition.g:7470:1: rule__ActivationConstraints__UnorderedGroup_7__1 : rule__ActivationConstraints__UnorderedGroup_7__Impl ;
    public final void rule__ActivationConstraints__UnorderedGroup_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7474:1: ( rule__ActivationConstraints__UnorderedGroup_7__Impl )
            // InternalComponentDefinition.g:7475:2: rule__ActivationConstraints__UnorderedGroup_7__Impl
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
    // InternalComponentDefinition.g:7482:1: rule__OpcUaDeviceClient__UnorderedGroup_2 : rule__OpcUaDeviceClient__UnorderedGroup_2__0 {...}?;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2());
        	
        try {
            // InternalComponentDefinition.g:7487:1: ( rule__OpcUaDeviceClient__UnorderedGroup_2__0 {...}?)
            // InternalComponentDefinition.g:7488:2: rule__OpcUaDeviceClient__UnorderedGroup_2__0 {...}?
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
    // InternalComponentDefinition.g:7496:1: rule__OpcUaDeviceClient__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDefinition.g:7501:1: ( ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) ) ) )
            // InternalComponentDefinition.g:7502:3: ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) ) )
            {
            // InternalComponentDefinition.g:7502:3: ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( LA67_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0) ) {
                alt67=1;
            }
            else if ( LA67_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalComponentDefinition.g:7503:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7503:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) ) )
                    // InternalComponentDefinition.g:7504:4: {...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__OpcUaDeviceClient__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalComponentDefinition.g:7504:113: ( ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) ) )
                    // InternalComponentDefinition.g:7505:5: ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7511:5: ( ( rule__OpcUaDeviceClient__Group_2_0__0 ) )
                    // InternalComponentDefinition.g:7512:6: ( rule__OpcUaDeviceClient__Group_2_0__0 )
                    {
                     before(grammarAccess.getOpcUaDeviceClientAccess().getGroup_2_0()); 
                    // InternalComponentDefinition.g:7513:6: ( rule__OpcUaDeviceClient__Group_2_0__0 )
                    // InternalComponentDefinition.g:7513:7: rule__OpcUaDeviceClient__Group_2_0__0
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
                    // InternalComponentDefinition.g:7518:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:7518:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) ) )
                    // InternalComponentDefinition.g:7519:4: {...}? => ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__OpcUaDeviceClient__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalComponentDefinition.g:7519:113: ( ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) ) )
                    // InternalComponentDefinition.g:7520:5: ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:7526:5: ( ( rule__OpcUaDeviceClient__Group_2_1__0 ) )
                    // InternalComponentDefinition.g:7527:6: ( rule__OpcUaDeviceClient__Group_2_1__0 )
                    {
                     before(grammarAccess.getOpcUaDeviceClientAccess().getGroup_2_1()); 
                    // InternalComponentDefinition.g:7528:6: ( rule__OpcUaDeviceClient__Group_2_1__0 )
                    // InternalComponentDefinition.g:7528:7: rule__OpcUaDeviceClient__Group_2_1__0
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
    // InternalComponentDefinition.g:7541:1: rule__OpcUaDeviceClient__UnorderedGroup_2__0 : rule__OpcUaDeviceClient__UnorderedGroup_2__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_2__1 )? ;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7545:1: ( rule__OpcUaDeviceClient__UnorderedGroup_2__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_2__1 )? )
            // InternalComponentDefinition.g:7546:2: rule__OpcUaDeviceClient__UnorderedGroup_2__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_57);
            rule__OpcUaDeviceClient__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:7547:2: ( rule__OpcUaDeviceClient__UnorderedGroup_2__1 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( LA68_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 0) ) {
                alt68=1;
            }
            else if ( LA68_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_2(), 1) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalComponentDefinition.g:7547:2: rule__OpcUaDeviceClient__UnorderedGroup_2__1
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
    // InternalComponentDefinition.g:7553:1: rule__OpcUaDeviceClient__UnorderedGroup_2__1 : rule__OpcUaDeviceClient__UnorderedGroup_2__Impl ;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7557:1: ( rule__OpcUaDeviceClient__UnorderedGroup_2__Impl )
            // InternalComponentDefinition.g:7558:2: rule__OpcUaDeviceClient__UnorderedGroup_2__Impl
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
    // InternalComponentDefinition.g:7565:1: rule__ComponentDefModel__ImportsAssignment_1 : ( ruleServiceRepoImport ) ;
    public final void rule__ComponentDefModel__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7569:1: ( ( ruleServiceRepoImport ) )
            // InternalComponentDefinition.g:7570:2: ( ruleServiceRepoImport )
            {
            // InternalComponentDefinition.g:7570:2: ( ruleServiceRepoImport )
            // InternalComponentDefinition.g:7571:3: ruleServiceRepoImport
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
    // InternalComponentDefinition.g:7580:1: rule__ComponentDefModel__ComponentAssignment_2 : ( ruleComponentDefinition ) ;
    public final void rule__ComponentDefModel__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7584:1: ( ( ruleComponentDefinition ) )
            // InternalComponentDefinition.g:7585:2: ( ruleComponentDefinition )
            {
            // InternalComponentDefinition.g:7585:2: ( ruleComponentDefinition )
            // InternalComponentDefinition.g:7586:3: ruleComponentDefinition
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
    // InternalComponentDefinition.g:7595:1: rule__ServiceRepoImport__ImportedNamespaceAssignment_1 : ( ruleFQNW ) ;
    public final void rule__ServiceRepoImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7599:1: ( ( ruleFQNW ) )
            // InternalComponentDefinition.g:7600:2: ( ruleFQNW )
            {
            // InternalComponentDefinition.g:7600:2: ( ruleFQNW )
            // InternalComponentDefinition.g:7601:3: ruleFQNW
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
    // InternalComponentDefinition.g:7610:1: rule__ComponentDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7614:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:7615:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:7615:2: ( RULE_ID )
            // InternalComponentDefinition.g:7616:3: RULE_ID
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
    // InternalComponentDefinition.g:7625:1: rule__ComponentDefinition__LogoAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__ComponentDefinition__LogoAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7629:1: ( ( RULE_STRING ) )
            // InternalComponentDefinition.g:7630:2: ( RULE_STRING )
            {
            // InternalComponentDefinition.g:7630:2: ( RULE_STRING )
            // InternalComponentDefinition.g:7631:3: RULE_STRING
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
    // InternalComponentDefinition.g:7640:1: rule__ComponentDefinition__ElementsAssignment_4 : ( ruleAbstractComponentElement ) ;
    public final void rule__ComponentDefinition__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7644:1: ( ( ruleAbstractComponentElement ) )
            // InternalComponentDefinition.g:7645:2: ( ruleAbstractComponentElement )
            {
            // InternalComponentDefinition.g:7645:2: ( ruleAbstractComponentElement )
            // InternalComponentDefinition.g:7646:3: ruleAbstractComponentElement
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
    // InternalComponentDefinition.g:7655:1: rule__RequestPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RequestPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7659:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:7660:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:7660:2: ( RULE_ID )
            // InternalComponentDefinition.g:7661:3: RULE_ID
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
    // InternalComponentDefinition.g:7670:1: rule__RequestPort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__RequestPort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7674:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:7675:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:7675:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:7676:3: ( ruleFQN )
            {
             before(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0()); 
            // InternalComponentDefinition.g:7677:3: ( ruleFQN )
            // InternalComponentDefinition.g:7678:4: ruleFQN
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
    // InternalComponentDefinition.g:7689:1: rule__RequestPort__ExtensionsAssignment_5 : ( ruleComponentPortExtension ) ;
    public final void rule__RequestPort__ExtensionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7693:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:7694:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:7694:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:7695:3: ruleComponentPortExtension
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
    // InternalComponentDefinition.g:7704:1: rule__OutputPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OutputPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7708:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:7709:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:7709:2: ( RULE_ID )
            // InternalComponentDefinition.g:7710:3: RULE_ID
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
    // InternalComponentDefinition.g:7719:1: rule__OutputPort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__OutputPort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7723:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:7724:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:7724:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:7725:3: ( ruleFQN )
            {
             before(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0()); 
            // InternalComponentDefinition.g:7726:3: ( ruleFQN )
            // InternalComponentDefinition.g:7727:4: ruleFQN
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
    // InternalComponentDefinition.g:7738:1: rule__OutputPort__ActivityAssignment_5 : ( ( ruleFQN ) ) ;
    public final void rule__OutputPort__ActivityAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7742:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:7743:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:7743:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:7744:3: ( ruleFQN )
            {
             before(grammarAccess.getOutputPortAccess().getActivityActivityCrossReference_5_0()); 
            // InternalComponentDefinition.g:7745:3: ( ruleFQN )
            // InternalComponentDefinition.g:7746:4: ruleFQN
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
    // InternalComponentDefinition.g:7757:1: rule__OutputPort__ExtensionsAssignment_7 : ( ruleComponentPortExtension ) ;
    public final void rule__OutputPort__ExtensionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7761:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:7762:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:7762:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:7763:3: ruleComponentPortExtension
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
    // InternalComponentDefinition.g:7772:1: rule__AnswerPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AnswerPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7776:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:7777:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:7777:2: ( RULE_ID )
            // InternalComponentDefinition.g:7778:3: RULE_ID
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
    // InternalComponentDefinition.g:7787:1: rule__AnswerPort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__AnswerPort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7791:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:7792:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:7792:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:7793:3: ( ruleFQN )
            {
             before(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceCrossReference_3_0()); 
            // InternalComponentDefinition.g:7794:3: ( ruleFQN )
            // InternalComponentDefinition.g:7795:4: ruleFQN
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
    // InternalComponentDefinition.g:7806:1: rule__AnswerPort__ExtensionsAssignment_5 : ( ruleComponentPortExtension ) ;
    public final void rule__AnswerPort__ExtensionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7810:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:7811:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:7811:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:7812:3: ruleComponentPortExtension
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
    // InternalComponentDefinition.g:7821:1: rule__InputPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InputPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7825:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:7826:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:7826:2: ( RULE_ID )
            // InternalComponentDefinition.g:7827:3: RULE_ID
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
    // InternalComponentDefinition.g:7836:1: rule__InputPort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__InputPort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7840:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:7841:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:7841:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:7842:3: ( ruleFQN )
            {
             before(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceCrossReference_3_0()); 
            // InternalComponentDefinition.g:7843:3: ( ruleFQN )
            // InternalComponentDefinition.g:7844:4: ruleFQN
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
    // InternalComponentDefinition.g:7855:1: rule__InputPort__ExtensionsAssignment_5 : ( ruleComponentPortExtension ) ;
    public final void rule__InputPort__ExtensionsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7859:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:7860:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:7860:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:7861:3: ruleComponentPortExtension
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
    // InternalComponentDefinition.g:7870:1: rule__SupportedMiddleware__DefaultAssignment_1 : ( ( 'default' ) ) ;
    public final void rule__SupportedMiddleware__DefaultAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7874:1: ( ( ( 'default' ) ) )
            // InternalComponentDefinition.g:7875:2: ( ( 'default' ) )
            {
            // InternalComponentDefinition.g:7875:2: ( ( 'default' ) )
            // InternalComponentDefinition.g:7876:3: ( 'default' )
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); 
            // InternalComponentDefinition.g:7877:3: ( 'default' )
            // InternalComponentDefinition.g:7878:4: 'default'
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7889:1: rule__SupportedMiddleware__MiddlewareAssignment_2 : ( ruleRoboticMiddleware ) ;
    public final void rule__SupportedMiddleware__MiddlewareAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7893:1: ( ( ruleRoboticMiddleware ) )
            // InternalComponentDefinition.g:7894:2: ( ruleRoboticMiddleware )
            {
            // InternalComponentDefinition.g:7894:2: ( ruleRoboticMiddleware )
            // InternalComponentDefinition.g:7895:3: ruleRoboticMiddleware
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
    // InternalComponentDefinition.g:7904:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7908:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:7909:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:7909:2: ( RULE_ID )
            // InternalComponentDefinition.g:7910:3: RULE_ID
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
    // InternalComponentDefinition.g:7919:1: rule__Activity__LinksAssignment_3 : ( ruleAbstractComponentLink ) ;
    public final void rule__Activity__LinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7923:1: ( ( ruleAbstractComponentLink ) )
            // InternalComponentDefinition.g:7924:2: ( ruleAbstractComponentLink )
            {
            // InternalComponentDefinition.g:7924:2: ( ruleAbstractComponentLink )
            // InternalComponentDefinition.g:7925:3: ruleAbstractComponentLink
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
    // InternalComponentDefinition.g:7934:1: rule__Activity__ExtensionsAssignment_4 : ( ruleActivityExtension ) ;
    public final void rule__Activity__ExtensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7938:1: ( ( ruleActivityExtension ) )
            // InternalComponentDefinition.g:7939:2: ( ruleActivityExtension )
            {
            // InternalComponentDefinition.g:7939:2: ( ruleActivityExtension )
            // InternalComponentDefinition.g:7940:3: ruleActivityExtension
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
    // InternalComponentDefinition.g:7949:1: rule__InputHandler__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InputHandler__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7953:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:7954:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:7954:2: ( RULE_ID )
            // InternalComponentDefinition.g:7955:3: RULE_ID
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
    // InternalComponentDefinition.g:7964:1: rule__InputHandler__InputPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__InputHandler__InputPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7968:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:7969:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:7969:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:7970:3: ( ruleFQN )
            {
             before(grammarAccess.getInputHandlerAccess().getInputPortInputPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:7971:3: ( ruleFQN )
            // InternalComponentDefinition.g:7972:4: ruleFQN
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
    // InternalComponentDefinition.g:7983:1: rule__InputHandler__ActiveQueueAssignment_4 : ( ( 'activeQueue' ) ) ;
    public final void rule__InputHandler__ActiveQueueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7987:1: ( ( ( 'activeQueue' ) ) )
            // InternalComponentDefinition.g:7988:2: ( ( 'activeQueue' ) )
            {
            // InternalComponentDefinition.g:7988:2: ( ( 'activeQueue' ) )
            // InternalComponentDefinition.g:7989:3: ( 'activeQueue' )
            {
             before(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            // InternalComponentDefinition.g:7990:3: ( 'activeQueue' )
            // InternalComponentDefinition.g:7991:4: 'activeQueue'
            {
             before(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalComponentDefinition.g:8002:1: rule__InputHandler__LinksAssignment_6 : ( ruleAbstractComponentLink ) ;
    public final void rule__InputHandler__LinksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8006:1: ( ( ruleAbstractComponentLink ) )
            // InternalComponentDefinition.g:8007:2: ( ruleAbstractComponentLink )
            {
            // InternalComponentDefinition.g:8007:2: ( ruleAbstractComponentLink )
            // InternalComponentDefinition.g:8008:3: ruleAbstractComponentLink
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
    // InternalComponentDefinition.g:8017:1: rule__RequestHandler__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RequestHandler__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8021:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8022:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8022:2: ( RULE_ID )
            // InternalComponentDefinition.g:8023:3: RULE_ID
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
    // InternalComponentDefinition.g:8032:1: rule__RequestHandler__AnswerPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__RequestHandler__AnswerPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8036:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8037:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8037:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8038:3: ( ruleFQN )
            {
             before(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:8039:3: ( ruleFQN )
            // InternalComponentDefinition.g:8040:4: ruleFQN
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
    // InternalComponentDefinition.g:8051:1: rule__RequestHandler__ActiveQueueAssignment_4 : ( ( 'activeQueue' ) ) ;
    public final void rule__RequestHandler__ActiveQueueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8055:1: ( ( ( 'activeQueue' ) ) )
            // InternalComponentDefinition.g:8056:2: ( ( 'activeQueue' ) )
            {
            // InternalComponentDefinition.g:8056:2: ( ( 'activeQueue' ) )
            // InternalComponentDefinition.g:8057:3: ( 'activeQueue' )
            {
             before(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            // InternalComponentDefinition.g:8058:3: ( 'activeQueue' )
            // InternalComponentDefinition.g:8059:4: 'activeQueue'
            {
             before(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalComponentDefinition.g:8070:1: rule__RequestHandler__LinksAssignment_6 : ( ruleAbstractComponentLink ) ;
    public final void rule__RequestHandler__LinksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8074:1: ( ( ruleAbstractComponentLink ) )
            // InternalComponentDefinition.g:8075:2: ( ruleAbstractComponentLink )
            {
            // InternalComponentDefinition.g:8075:2: ( ruleAbstractComponentLink )
            // InternalComponentDefinition.g:8076:3: ruleAbstractComponentLink
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
    // InternalComponentDefinition.g:8085:1: rule__RequestPortLink__RequestPortAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__RequestPortLink__RequestPortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8089:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8090:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8090:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8091:3: ( ruleFQN )
            {
             before(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortCrossReference_1_0()); 
            // InternalComponentDefinition.g:8092:3: ( ruleFQN )
            // InternalComponentDefinition.g:8093:4: ruleFQN
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
    // InternalComponentDefinition.g:8104:1: rule__OpcUaClientLink__ClientAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__OpcUaClientLink__ClientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8108:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8109:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8109:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8110:3: ( ruleFQN )
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientCrossReference_1_0()); 
            // InternalComponentDefinition.g:8111:3: ( ruleFQN )
            // InternalComponentDefinition.g:8112:4: ruleFQN
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


    // $ANTLR start "rule__ComponentSubNodeObserver__SubjectAssignment_1"
    // InternalComponentDefinition.g:8123:1: rule__ComponentSubNodeObserver__SubjectAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentSubNodeObserver__SubjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8127:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8128:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8128:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8129:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeCrossReference_1_0()); 
            // InternalComponentDefinition.g:8130:3: ( ruleFQN )
            // InternalComponentDefinition.g:8131:4: ruleFQN
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
    // InternalComponentDefinition.g:8142:1: rule__InputLinkExtension__InputPortAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__InputLinkExtension__InputPortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8146:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8147:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8147:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8148:3: ( ruleFQN )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortCrossReference_2_0()); 
            // InternalComponentDefinition.g:8149:3: ( ruleFQN )
            // InternalComponentDefinition.g:8150:4: ruleFQN
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
    // InternalComponentDefinition.g:8161:1: rule__InputLinkExtension__OptionalAssignment_4_0 : ( ( 'optional' ) ) ;
    public final void rule__InputLinkExtension__OptionalAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8165:1: ( ( ( 'optional' ) ) )
            // InternalComponentDefinition.g:8166:2: ( ( 'optional' ) )
            {
            // InternalComponentDefinition.g:8166:2: ( ( 'optional' ) )
            // InternalComponentDefinition.g:8167:3: ( 'optional' )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); 
            // InternalComponentDefinition.g:8168:3: ( 'optional' )
            // InternalComponentDefinition.g:8169:4: 'optional'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); 
            match(input,74,FOLLOW_2); 
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
    // InternalComponentDefinition.g:8180:1: rule__InputLinkExtension__OversamplingOkAssignment_4_1 : ( ( 'oversamplingOk' ) ) ;
    public final void rule__InputLinkExtension__OversamplingOkAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8184:1: ( ( ( 'oversamplingOk' ) ) )
            // InternalComponentDefinition.g:8185:2: ( ( 'oversamplingOk' ) )
            {
            // InternalComponentDefinition.g:8185:2: ( ( 'oversamplingOk' ) )
            // InternalComponentDefinition.g:8186:3: ( 'oversamplingOk' )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); 
            // InternalComponentDefinition.g:8187:3: ( 'oversamplingOk' )
            // InternalComponentDefinition.g:8188:4: 'oversamplingOk'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); 
            match(input,75,FOLLOW_2); 
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
    // InternalComponentDefinition.g:8199:1: rule__InputLinkExtension__UndersamplingOkAssignment_4_2 : ( ( 'undersamplingOk' ) ) ;
    public final void rule__InputLinkExtension__UndersamplingOkAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8203:1: ( ( ( 'undersamplingOk' ) ) )
            // InternalComponentDefinition.g:8204:2: ( ( 'undersamplingOk' ) )
            {
            // InternalComponentDefinition.g:8204:2: ( ( 'undersamplingOk' ) )
            // InternalComponentDefinition.g:8205:3: ( 'undersamplingOk' )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); 
            // InternalComponentDefinition.g:8206:3: ( 'undersamplingOk' )
            // InternalComponentDefinition.g:8207:4: 'undersamplingOk'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); 
            match(input,76,FOLLOW_2); 
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
    // InternalComponentDefinition.g:8218:1: rule__ActivationConstraints__ConfigurableAssignment_5 : ( ruleEBoolean ) ;
    public final void rule__ActivationConstraints__ConfigurableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8222:1: ( ( ruleEBoolean ) )
            // InternalComponentDefinition.g:8223:2: ( ruleEBoolean )
            {
            // InternalComponentDefinition.g:8223:2: ( ruleEBoolean )
            // InternalComponentDefinition.g:8224:3: ruleEBoolean
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
    // InternalComponentDefinition.g:8233:1: rule__ActivationConstraints__MinActFreqAssignment_7_0_2 : ( ruleEDouble ) ;
    public final void rule__ActivationConstraints__MinActFreqAssignment_7_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8237:1: ( ( ruleEDouble ) )
            // InternalComponentDefinition.g:8238:2: ( ruleEDouble )
            {
            // InternalComponentDefinition.g:8238:2: ( ruleEDouble )
            // InternalComponentDefinition.g:8239:3: ruleEDouble
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
    // InternalComponentDefinition.g:8248:1: rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 : ( ruleEDouble ) ;
    public final void rule__ActivationConstraints__MaxActFreqAssignment_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8252:1: ( ( ruleEDouble ) )
            // InternalComponentDefinition.g:8253:2: ( ruleEDouble )
            {
            // InternalComponentDefinition.g:8253:2: ( ruleEDouble )
            // InternalComponentDefinition.g:8254:3: ruleEDouble
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
    // InternalComponentDefinition.g:8263:1: rule__OperationModeBinding__ModeAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__OperationModeBinding__ModeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8267:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8268:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8268:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8269:3: ( ruleFQN )
            {
             before(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeCrossReference_1_0()); 
            // InternalComponentDefinition.g:8270:3: ( ruleFQN )
            // InternalComponentDefinition.g:8271:4: ruleFQN
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
    // InternalComponentDefinition.g:8282:1: rule__DefaultInputTrigger__InputLinkAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DefaultInputTrigger__InputLinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8286:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8287:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8287:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8288:3: ( ruleFQN )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionCrossReference_1_0()); 
            // InternalComponentDefinition.g:8289:3: ( ruleFQN )
            // InternalComponentDefinition.g:8290:4: ruleFQN
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
    // InternalComponentDefinition.g:8301:1: rule__DefaultInputTrigger__PrescaleAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__DefaultInputTrigger__PrescaleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8305:1: ( ( ruleEInt ) )
            // InternalComponentDefinition.g:8306:2: ( ruleEInt )
            {
            // InternalComponentDefinition.g:8306:2: ( ruleEInt )
            // InternalComponentDefinition.g:8307:3: ruleEInt
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
    // InternalComponentDefinition.g:8316:1: rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 : ( ruleEDouble ) ;
    public final void rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8320:1: ( ( ruleEDouble ) )
            // InternalComponentDefinition.g:8321:2: ( ruleEDouble )
            {
            // InternalComponentDefinition.g:8321:2: ( ruleEDouble )
            // InternalComponentDefinition.g:8322:3: ruleEDouble
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
    // InternalComponentDefinition.g:8331:1: rule__DefaultObservedElementTrigger__ElementAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DefaultObservedElementTrigger__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8335:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8336:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8336:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8337:3: ( ruleFQN )
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeCrossReference_1_0()); 
            // InternalComponentDefinition.g:8338:3: ( ruleFQN )
            // InternalComponentDefinition.g:8339:4: ruleFQN
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
    // InternalComponentDefinition.g:8350:1: rule__OpcUaDeviceClient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OpcUaDeviceClient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8354:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8355:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8355:2: ( RULE_ID )
            // InternalComponentDefinition.g:8356:3: RULE_ID
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
    // InternalComponentDefinition.g:8365:1: rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1 : ( ruleEString ) ;
    public final void rule__OpcUaDeviceClient__DeviceURIAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8369:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:8370:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:8370:2: ( ruleEString )
            // InternalComponentDefinition.g:8371:3: ruleEString
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
    // InternalComponentDefinition.g:8380:1: rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1 : ( ruleEString ) ;
    public final void rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8384:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:8385:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:8385:2: ( ruleEString )
            // InternalComponentDefinition.g:8386:3: ruleEString
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


    // $ANTLR start "rule__OpcUaStatusServer__NameAssignment_1"
    // InternalComponentDefinition.g:8395:1: rule__OpcUaStatusServer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OpcUaStatusServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8399:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8400:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8400:2: ( RULE_ID )
            // InternalComponentDefinition.g:8401:3: RULE_ID
            {
             before(grammarAccess.getOpcUaStatusServerAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOpcUaStatusServerAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__NameAssignment_1"


    // $ANTLR start "rule__OpcUaStatusServer__OutPortAssignment_3"
    // InternalComponentDefinition.g:8410:1: rule__OpcUaStatusServer__OutPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__OpcUaStatusServer__OutPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8414:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8415:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8415:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8416:3: ( ruleFQN )
            {
             before(grammarAccess.getOpcUaStatusServerAccess().getOutPortOutputPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:8417:3: ( ruleFQN )
            // InternalComponentDefinition.g:8418:4: ruleFQN
            {
             before(grammarAccess.getOpcUaStatusServerAccess().getOutPortOutputPortFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOpcUaStatusServerAccess().getOutPortOutputPortFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getOpcUaStatusServerAccess().getOutPortOutputPortCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaStatusServer__OutPortAssignment_3"


    // $ANTLR start "rule__CoordinationSlavePort__NameAssignment_1"
    // InternalComponentDefinition.g:8429:1: rule__CoordinationSlavePort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoordinationSlavePort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8433:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8434:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8434:2: ( RULE_ID )
            // InternalComponentDefinition.g:8435:3: RULE_ID
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
    // InternalComponentDefinition.g:8444:1: rule__CoordinationSlavePort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CoordinationSlavePort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8448:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8449:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8449:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8450:3: ( ruleFQN )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0()); 
            // InternalComponentDefinition.g:8451:3: ( ruleFQN )
            // InternalComponentDefinition.g:8452:4: ruleFQN
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
    // InternalComponentDefinition.g:8463:1: rule__CoordinationSlavePort__ElementsAssignment_5 : ( ruleAbstractCoordinationElement ) ;
    public final void rule__CoordinationSlavePort__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8467:1: ( ( ruleAbstractCoordinationElement ) )
            // InternalComponentDefinition.g:8468:2: ( ruleAbstractCoordinationElement )
            {
            // InternalComponentDefinition.g:8468:2: ( ruleAbstractCoordinationElement )
            // InternalComponentDefinition.g:8469:3: ruleAbstractCoordinationElement
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


    // $ANTLR start "rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1"
    // InternalComponentDefinition.g:8478:1: rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8482:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8483:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8483:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8484:3: ( ruleFQN )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageCrossReference_1_0()); 
            // InternalComponentDefinition.g:8485:3: ( ruleFQN )
            // InternalComponentDefinition.g:8486:4: ruleFQN
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
    // InternalComponentDefinition.g:8497:1: rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8501:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8502:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8502:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8503:3: ( ruleFQN )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:8504:3: ( ruleFQN )
            // InternalComponentDefinition.g:8505:4: ruleFQN
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
    // InternalComponentDefinition.g:8516:1: rule__PublicOperationMode__IsDefaultInitAssignment_1 : ( ( 'default' ) ) ;
    public final void rule__PublicOperationMode__IsDefaultInitAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8520:1: ( ( ( 'default' ) ) )
            // InternalComponentDefinition.g:8521:2: ( ( 'default' ) )
            {
            // InternalComponentDefinition.g:8521:2: ( ( 'default' ) )
            // InternalComponentDefinition.g:8522:3: ( 'default' )
            {
             before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0()); 
            // InternalComponentDefinition.g:8523:3: ( 'default' )
            // InternalComponentDefinition.g:8524:4: 'default'
            {
             before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_1_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalComponentDefinition.g:8535:1: rule__PublicOperationMode__ModeAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__PublicOperationMode__ModeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8539:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8540:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8540:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8541:3: ( ruleFQN )
            {
             before(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionCrossReference_3_0()); 
            // InternalComponentDefinition.g:8542:3: ( ruleFQN )
            // InternalComponentDefinition.g:8543:4: ruleFQN
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
    // InternalComponentDefinition.g:8554:1: rule__PublicOperationMode__ActivatesAssignment_5_2 : ( ( RULE_ID ) ) ;
    public final void rule__PublicOperationMode__ActivatesAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8558:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDefinition.g:8559:2: ( ( RULE_ID ) )
            {
            // InternalComponentDefinition.g:8559:2: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8560:3: ( RULE_ID )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_2_0()); 
            // InternalComponentDefinition.g:8561:3: ( RULE_ID )
            // InternalComponentDefinition.g:8562:4: RULE_ID
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
    // InternalComponentDefinition.g:8573:1: rule__PublicOperationMode__ActivatesAssignment_5_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PublicOperationMode__ActivatesAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8577:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDefinition.g:8578:2: ( ( RULE_ID ) )
            {
            // InternalComponentDefinition.g:8578:2: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8579:3: ( RULE_ID )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_5_3_1_0()); 
            // InternalComponentDefinition.g:8580:3: ( RULE_ID )
            // InternalComponentDefinition.g:8581:4: RULE_ID
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
    // InternalComponentDefinition.g:8592:1: rule__PrivateOperationMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrivateOperationMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8596:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8597:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8597:2: ( RULE_ID )
            // InternalComponentDefinition.g:8598:3: RULE_ID
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
    // InternalComponentDefinition.g:8607:1: rule__CoordinationMasterPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoordinationMasterPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8611:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8612:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8612:2: ( RULE_ID )
            // InternalComponentDefinition.g:8613:3: RULE_ID
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
    // InternalComponentDefinition.g:8622:1: rule__CoordinationMasterPort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CoordinationMasterPort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8626:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8627:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8627:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8628:3: ( ruleFQN )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0()); 
            // InternalComponentDefinition.g:8629:3: ( ruleFQN )
            // InternalComponentDefinition.g:8630:4: ruleFQN
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
    // InternalComponentDefinition.g:8641:1: rule__ComponentParametersRef__ParameterAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentParametersRef__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8645:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8646:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8646:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8647:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterCrossReference_1_0()); 
            // InternalComponentDefinition.g:8648:3: ( ruleFQN )
            // InternalComponentDefinition.g:8649:4: ruleFQN
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
    // InternalComponentDefinition.g:8660:1: rule__ComponentParametersRef__SlaveAssignment_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentParametersRef__SlaveAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8664:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8665:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8665:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8666:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortCrossReference_2_1_0()); 
            // InternalComponentDefinition.g:8667:3: ( ruleFQN )
            // InternalComponentDefinition.g:8668:4: ruleFQN
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
    // InternalComponentDefinition.g:8679:1: rule__ACE_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ACE_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8683:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:8684:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:8684:2: ( ruleEString )
            // InternalComponentDefinition.g:8685:3: ruleEString
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
    // InternalComponentDefinition.g:8694:1: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpcUa_SeRoNet__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8698:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:8699:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:8699:2: ( ruleEString )
            // InternalComponentDefinition.g:8700:3: ruleEString
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
    // InternalComponentDefinition.g:8709:1: rule__CORBA_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CORBA_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8713:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:8714:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:8714:2: ( ruleEString )
            // InternalComponentDefinition.g:8715:3: ruleEString
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
    // InternalComponentDefinition.g:8724:1: rule__DDS_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DDS_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8728:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:8729:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:8729:2: ( ruleEString )
            // InternalComponentDefinition.g:8730:3: ruleEString
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x60290000B6A80000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x60290000B6A00002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000008080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E8L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000C1F00080000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000F00000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000C1000000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000040000L,0x0000000000000200L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000F00080000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001C00L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000028000010000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000005L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000D00000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000004L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x10C0000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x10C0000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0080000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0100000000080000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0C00000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x8000000000010000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001C00L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000028000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0006000000000002L});

}
