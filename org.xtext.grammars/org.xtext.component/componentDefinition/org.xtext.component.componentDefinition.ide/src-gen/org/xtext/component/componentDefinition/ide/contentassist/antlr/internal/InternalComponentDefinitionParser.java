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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_DOCU_COMMENT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'true'", "'false'", "'#import'", "';'", "'ComponentDefinition'", "'{'", "'}'", "'logo'", "'RequestPort'", "'implements'", "'OutputPort'", "'realizedBy'", "'AnswerPort'", "'InputPort'", "'SupportedMiddleware'", "'Activity'", "'InputHandler'", "'triggeredFrom'", "'RequestHandler'", "'RequestPortLink'", "'OpcUaClientLink'", "'MixedPortROSLink'", "'Observe'", "'InputPortLink'", "'ActivationConstraints'", "'configurable'", "'='", "'minActFreq'", "'Hz'", "'maxActFreq'", "'OperationModeBinding'", "'DefaultTrigger'", "'InputPortTrigger'", "'prescale'", "'PeriodicTimer'", "'ObservedElement'", "'OpcUaDeviceClient'", "'deviceURI'", "'rootObjectPath'", "'opcuaXmlFile'", "'OpcUaReadServer'", "'dataProviderPort'", "'portNumber'", "'MixedPortROS'", "'MixedPortYARP'", "'CoordinationSlavePort'", "'SkillRealizationsRef'", "'with'", "'PublicOperationMode'", "'activates'", "'('", "')'", "','", "'PrivateOperationMode'", "'CoordinationMasterPort'", "'ComponentParameters'", "'slave'", "'.'", "'.*'", "'-'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'", "'default'", "'activeQueue'", "'optional'", "'oversamplingOk'", "'undersamplingOk'", "'autoConnect'"
    };
    public static final int T__50=50;
    public static final int RULE_ML_DOCUMENTATION=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
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
    public static final int RULE_DOCU_COMMENT=7;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=11;
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
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
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
    // InternalComponentDefinition.g:68:1: entryRuleComponentDefModel : ruleComponentDefModel EOF ;
    public final void entryRuleComponentDefModel() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:69:1: ( ruleComponentDefModel EOF )
            // InternalComponentDefinition.g:70:1: ruleComponentDefModel EOF
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
    // InternalComponentDefinition.g:77:1: ruleComponentDefModel : ( ( rule__ComponentDefModel__Group__0 ) ) ;
    public final void ruleComponentDefModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:81:2: ( ( ( rule__ComponentDefModel__Group__0 ) ) )
            // InternalComponentDefinition.g:82:2: ( ( rule__ComponentDefModel__Group__0 ) )
            {
            // InternalComponentDefinition.g:82:2: ( ( rule__ComponentDefModel__Group__0 ) )
            // InternalComponentDefinition.g:83:3: ( rule__ComponentDefModel__Group__0 )
            {
             before(grammarAccess.getComponentDefModelAccess().getGroup()); 
            // InternalComponentDefinition.g:84:3: ( rule__ComponentDefModel__Group__0 )
            // InternalComponentDefinition.g:84:4: rule__ComponentDefModel__Group__0
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
    // InternalComponentDefinition.g:93:1: entryRuleServiceRepoImport : ruleServiceRepoImport EOF ;
    public final void entryRuleServiceRepoImport() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:94:1: ( ruleServiceRepoImport EOF )
            // InternalComponentDefinition.g:95:1: ruleServiceRepoImport EOF
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
    // InternalComponentDefinition.g:102:1: ruleServiceRepoImport : ( ( rule__ServiceRepoImport__Group__0 ) ) ;
    public final void ruleServiceRepoImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:106:2: ( ( ( rule__ServiceRepoImport__Group__0 ) ) )
            // InternalComponentDefinition.g:107:2: ( ( rule__ServiceRepoImport__Group__0 ) )
            {
            // InternalComponentDefinition.g:107:2: ( ( rule__ServiceRepoImport__Group__0 ) )
            // InternalComponentDefinition.g:108:3: ( rule__ServiceRepoImport__Group__0 )
            {
             before(grammarAccess.getServiceRepoImportAccess().getGroup()); 
            // InternalComponentDefinition.g:109:3: ( rule__ServiceRepoImport__Group__0 )
            // InternalComponentDefinition.g:109:4: rule__ServiceRepoImport__Group__0
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
    // InternalComponentDefinition.g:118:1: entryRuleComponentDefinition : ruleComponentDefinition EOF ;
    public final void entryRuleComponentDefinition() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:119:1: ( ruleComponentDefinition EOF )
            // InternalComponentDefinition.g:120:1: ruleComponentDefinition EOF
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
    // InternalComponentDefinition.g:127:1: ruleComponentDefinition : ( ( rule__ComponentDefinition__Group__0 ) ) ;
    public final void ruleComponentDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:131:2: ( ( ( rule__ComponentDefinition__Group__0 ) ) )
            // InternalComponentDefinition.g:132:2: ( ( rule__ComponentDefinition__Group__0 ) )
            {
            // InternalComponentDefinition.g:132:2: ( ( rule__ComponentDefinition__Group__0 ) )
            // InternalComponentDefinition.g:133:3: ( rule__ComponentDefinition__Group__0 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getGroup()); 
            // InternalComponentDefinition.g:134:3: ( rule__ComponentDefinition__Group__0 )
            // InternalComponentDefinition.g:134:4: rule__ComponentDefinition__Group__0
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
    // InternalComponentDefinition.g:143:1: entryRuleAbstractComponentElement : ruleAbstractComponentElement EOF ;
    public final void entryRuleAbstractComponentElement() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:144:1: ( ruleAbstractComponentElement EOF )
            // InternalComponentDefinition.g:145:1: ruleAbstractComponentElement EOF
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
    // InternalComponentDefinition.g:152:1: ruleAbstractComponentElement : ( ( rule__AbstractComponentElement__Alternatives ) ) ;
    public final void ruleAbstractComponentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:156:2: ( ( ( rule__AbstractComponentElement__Alternatives ) ) )
            // InternalComponentDefinition.g:157:2: ( ( rule__AbstractComponentElement__Alternatives ) )
            {
            // InternalComponentDefinition.g:157:2: ( ( rule__AbstractComponentElement__Alternatives ) )
            // InternalComponentDefinition.g:158:3: ( rule__AbstractComponentElement__Alternatives )
            {
             before(grammarAccess.getAbstractComponentElementAccess().getAlternatives()); 
            // InternalComponentDefinition.g:159:3: ( rule__AbstractComponentElement__Alternatives )
            // InternalComponentDefinition.g:159:4: rule__AbstractComponentElement__Alternatives
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
    // InternalComponentDefinition.g:168:1: entryRuleDerivedComponentElement : ruleDerivedComponentElement EOF ;
    public final void entryRuleDerivedComponentElement() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:169:1: ( ruleDerivedComponentElement EOF )
            // InternalComponentDefinition.g:170:1: ruleDerivedComponentElement EOF
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
    // InternalComponentDefinition.g:177:1: ruleDerivedComponentElement : ( ( rule__DerivedComponentElement__Alternatives ) ) ;
    public final void ruleDerivedComponentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:181:2: ( ( ( rule__DerivedComponentElement__Alternatives ) ) )
            // InternalComponentDefinition.g:182:2: ( ( rule__DerivedComponentElement__Alternatives ) )
            {
            // InternalComponentDefinition.g:182:2: ( ( rule__DerivedComponentElement__Alternatives ) )
            // InternalComponentDefinition.g:183:3: ( rule__DerivedComponentElement__Alternatives )
            {
             before(grammarAccess.getDerivedComponentElementAccess().getAlternatives()); 
            // InternalComponentDefinition.g:184:3: ( rule__DerivedComponentElement__Alternatives )
            // InternalComponentDefinition.g:184:4: rule__DerivedComponentElement__Alternatives
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
    // InternalComponentDefinition.g:193:1: entryRuleNamedComponentElement : ruleNamedComponentElement EOF ;
    public final void entryRuleNamedComponentElement() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:194:1: ( ruleNamedComponentElement EOF )
            // InternalComponentDefinition.g:195:1: ruleNamedComponentElement EOF
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
    // InternalComponentDefinition.g:202:1: ruleNamedComponentElement : ( ( rule__NamedComponentElement__Alternatives ) ) ;
    public final void ruleNamedComponentElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:206:2: ( ( ( rule__NamedComponentElement__Alternatives ) ) )
            // InternalComponentDefinition.g:207:2: ( ( rule__NamedComponentElement__Alternatives ) )
            {
            // InternalComponentDefinition.g:207:2: ( ( rule__NamedComponentElement__Alternatives ) )
            // InternalComponentDefinition.g:208:3: ( rule__NamedComponentElement__Alternatives )
            {
             before(grammarAccess.getNamedComponentElementAccess().getAlternatives()); 
            // InternalComponentDefinition.g:209:3: ( rule__NamedComponentElement__Alternatives )
            // InternalComponentDefinition.g:209:4: rule__NamedComponentElement__Alternatives
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
    // InternalComponentDefinition.g:218:1: entryRuleComponentSubNode : ruleComponentSubNode EOF ;
    public final void entryRuleComponentSubNode() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:219:1: ( ruleComponentSubNode EOF )
            // InternalComponentDefinition.g:220:1: ruleComponentSubNode EOF
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
    // InternalComponentDefinition.g:227:1: ruleComponentSubNode : ( ( rule__ComponentSubNode__Alternatives ) ) ;
    public final void ruleComponentSubNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:231:2: ( ( ( rule__ComponentSubNode__Alternatives ) ) )
            // InternalComponentDefinition.g:232:2: ( ( rule__ComponentSubNode__Alternatives ) )
            {
            // InternalComponentDefinition.g:232:2: ( ( rule__ComponentSubNode__Alternatives ) )
            // InternalComponentDefinition.g:233:3: ( rule__ComponentSubNode__Alternatives )
            {
             before(grammarAccess.getComponentSubNodeAccess().getAlternatives()); 
            // InternalComponentDefinition.g:234:3: ( rule__ComponentSubNode__Alternatives )
            // InternalComponentDefinition.g:234:4: rule__ComponentSubNode__Alternatives
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
    // InternalComponentDefinition.g:243:1: entryRuleComponentPort : ruleComponentPort EOF ;
    public final void entryRuleComponentPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:244:1: ( ruleComponentPort EOF )
            // InternalComponentDefinition.g:245:1: ruleComponentPort EOF
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
    // InternalComponentDefinition.g:252:1: ruleComponentPort : ( ( rule__ComponentPort__Alternatives ) ) ;
    public final void ruleComponentPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:256:2: ( ( ( rule__ComponentPort__Alternatives ) ) )
            // InternalComponentDefinition.g:257:2: ( ( rule__ComponentPort__Alternatives ) )
            {
            // InternalComponentDefinition.g:257:2: ( ( rule__ComponentPort__Alternatives ) )
            // InternalComponentDefinition.g:258:3: ( rule__ComponentPort__Alternatives )
            {
             before(grammarAccess.getComponentPortAccess().getAlternatives()); 
            // InternalComponentDefinition.g:259:3: ( rule__ComponentPort__Alternatives )
            // InternalComponentDefinition.g:259:4: rule__ComponentPort__Alternatives
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
    // InternalComponentDefinition.g:268:1: entryRuleRequestPort : ruleRequestPort EOF ;
    public final void entryRuleRequestPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:269:1: ( ruleRequestPort EOF )
            // InternalComponentDefinition.g:270:1: ruleRequestPort EOF
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
    // InternalComponentDefinition.g:277:1: ruleRequestPort : ( ( rule__RequestPort__Group__0 ) ) ;
    public final void ruleRequestPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:281:2: ( ( ( rule__RequestPort__Group__0 ) ) )
            // InternalComponentDefinition.g:282:2: ( ( rule__RequestPort__Group__0 ) )
            {
            // InternalComponentDefinition.g:282:2: ( ( rule__RequestPort__Group__0 ) )
            // InternalComponentDefinition.g:283:3: ( rule__RequestPort__Group__0 )
            {
             before(grammarAccess.getRequestPortAccess().getGroup()); 
            // InternalComponentDefinition.g:284:3: ( rule__RequestPort__Group__0 )
            // InternalComponentDefinition.g:284:4: rule__RequestPort__Group__0
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
    // InternalComponentDefinition.g:293:1: entryRuleOutputPort : ruleOutputPort EOF ;
    public final void entryRuleOutputPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:294:1: ( ruleOutputPort EOF )
            // InternalComponentDefinition.g:295:1: ruleOutputPort EOF
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
    // InternalComponentDefinition.g:302:1: ruleOutputPort : ( ( rule__OutputPort__Group__0 ) ) ;
    public final void ruleOutputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:306:2: ( ( ( rule__OutputPort__Group__0 ) ) )
            // InternalComponentDefinition.g:307:2: ( ( rule__OutputPort__Group__0 ) )
            {
            // InternalComponentDefinition.g:307:2: ( ( rule__OutputPort__Group__0 ) )
            // InternalComponentDefinition.g:308:3: ( rule__OutputPort__Group__0 )
            {
             before(grammarAccess.getOutputPortAccess().getGroup()); 
            // InternalComponentDefinition.g:309:3: ( rule__OutputPort__Group__0 )
            // InternalComponentDefinition.g:309:4: rule__OutputPort__Group__0
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
    // InternalComponentDefinition.g:318:1: entryRuleAnswerPort : ruleAnswerPort EOF ;
    public final void entryRuleAnswerPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:319:1: ( ruleAnswerPort EOF )
            // InternalComponentDefinition.g:320:1: ruleAnswerPort EOF
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
    // InternalComponentDefinition.g:327:1: ruleAnswerPort : ( ( rule__AnswerPort__Group__0 ) ) ;
    public final void ruleAnswerPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:331:2: ( ( ( rule__AnswerPort__Group__0 ) ) )
            // InternalComponentDefinition.g:332:2: ( ( rule__AnswerPort__Group__0 ) )
            {
            // InternalComponentDefinition.g:332:2: ( ( rule__AnswerPort__Group__0 ) )
            // InternalComponentDefinition.g:333:3: ( rule__AnswerPort__Group__0 )
            {
             before(grammarAccess.getAnswerPortAccess().getGroup()); 
            // InternalComponentDefinition.g:334:3: ( rule__AnswerPort__Group__0 )
            // InternalComponentDefinition.g:334:4: rule__AnswerPort__Group__0
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
    // InternalComponentDefinition.g:343:1: entryRuleInputPort : ruleInputPort EOF ;
    public final void entryRuleInputPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:344:1: ( ruleInputPort EOF )
            // InternalComponentDefinition.g:345:1: ruleInputPort EOF
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
    // InternalComponentDefinition.g:352:1: ruleInputPort : ( ( rule__InputPort__Group__0 ) ) ;
    public final void ruleInputPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:356:2: ( ( ( rule__InputPort__Group__0 ) ) )
            // InternalComponentDefinition.g:357:2: ( ( rule__InputPort__Group__0 ) )
            {
            // InternalComponentDefinition.g:357:2: ( ( rule__InputPort__Group__0 ) )
            // InternalComponentDefinition.g:358:3: ( rule__InputPort__Group__0 )
            {
             before(grammarAccess.getInputPortAccess().getGroup()); 
            // InternalComponentDefinition.g:359:3: ( rule__InputPort__Group__0 )
            // InternalComponentDefinition.g:359:4: rule__InputPort__Group__0
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
    // InternalComponentDefinition.g:368:1: entryRuleComponentPortExtension : ruleComponentPortExtension EOF ;
    public final void entryRuleComponentPortExtension() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:369:1: ( ruleComponentPortExtension EOF )
            // InternalComponentDefinition.g:370:1: ruleComponentPortExtension EOF
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
    // InternalComponentDefinition.g:377:1: ruleComponentPortExtension : ( ruleSupportedMiddleware ) ;
    public final void ruleComponentPortExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:381:2: ( ( ruleSupportedMiddleware ) )
            // InternalComponentDefinition.g:382:2: ( ruleSupportedMiddleware )
            {
            // InternalComponentDefinition.g:382:2: ( ruleSupportedMiddleware )
            // InternalComponentDefinition.g:383:3: ruleSupportedMiddleware
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
    // InternalComponentDefinition.g:393:1: entryRuleSupportedMiddleware : ruleSupportedMiddleware EOF ;
    public final void entryRuleSupportedMiddleware() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:394:1: ( ruleSupportedMiddleware EOF )
            // InternalComponentDefinition.g:395:1: ruleSupportedMiddleware EOF
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
    // InternalComponentDefinition.g:402:1: ruleSupportedMiddleware : ( ( rule__SupportedMiddleware__Group__0 ) ) ;
    public final void ruleSupportedMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:406:2: ( ( ( rule__SupportedMiddleware__Group__0 ) ) )
            // InternalComponentDefinition.g:407:2: ( ( rule__SupportedMiddleware__Group__0 ) )
            {
            // InternalComponentDefinition.g:407:2: ( ( rule__SupportedMiddleware__Group__0 ) )
            // InternalComponentDefinition.g:408:3: ( rule__SupportedMiddleware__Group__0 )
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getGroup()); 
            // InternalComponentDefinition.g:409:3: ( rule__SupportedMiddleware__Group__0 )
            // InternalComponentDefinition.g:409:4: rule__SupportedMiddleware__Group__0
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
    // InternalComponentDefinition.g:418:1: entryRuleActivity : ruleActivity EOF ;
    public final void entryRuleActivity() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:419:1: ( ruleActivity EOF )
            // InternalComponentDefinition.g:420:1: ruleActivity EOF
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
    // InternalComponentDefinition.g:427:1: ruleActivity : ( ( rule__Activity__Group__0 ) ) ;
    public final void ruleActivity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:431:2: ( ( ( rule__Activity__Group__0 ) ) )
            // InternalComponentDefinition.g:432:2: ( ( rule__Activity__Group__0 ) )
            {
            // InternalComponentDefinition.g:432:2: ( ( rule__Activity__Group__0 ) )
            // InternalComponentDefinition.g:433:3: ( rule__Activity__Group__0 )
            {
             before(grammarAccess.getActivityAccess().getGroup()); 
            // InternalComponentDefinition.g:434:3: ( rule__Activity__Group__0 )
            // InternalComponentDefinition.g:434:4: rule__Activity__Group__0
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
    // InternalComponentDefinition.g:443:1: entryRuleInputHandler : ruleInputHandler EOF ;
    public final void entryRuleInputHandler() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:444:1: ( ruleInputHandler EOF )
            // InternalComponentDefinition.g:445:1: ruleInputHandler EOF
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
    // InternalComponentDefinition.g:452:1: ruleInputHandler : ( ( rule__InputHandler__Group__0 ) ) ;
    public final void ruleInputHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:456:2: ( ( ( rule__InputHandler__Group__0 ) ) )
            // InternalComponentDefinition.g:457:2: ( ( rule__InputHandler__Group__0 ) )
            {
            // InternalComponentDefinition.g:457:2: ( ( rule__InputHandler__Group__0 ) )
            // InternalComponentDefinition.g:458:3: ( rule__InputHandler__Group__0 )
            {
             before(grammarAccess.getInputHandlerAccess().getGroup()); 
            // InternalComponentDefinition.g:459:3: ( rule__InputHandler__Group__0 )
            // InternalComponentDefinition.g:459:4: rule__InputHandler__Group__0
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
    // InternalComponentDefinition.g:468:1: entryRuleRequestHandler : ruleRequestHandler EOF ;
    public final void entryRuleRequestHandler() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:469:1: ( ruleRequestHandler EOF )
            // InternalComponentDefinition.g:470:1: ruleRequestHandler EOF
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
    // InternalComponentDefinition.g:477:1: ruleRequestHandler : ( ( rule__RequestHandler__Group__0 ) ) ;
    public final void ruleRequestHandler() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:481:2: ( ( ( rule__RequestHandler__Group__0 ) ) )
            // InternalComponentDefinition.g:482:2: ( ( rule__RequestHandler__Group__0 ) )
            {
            // InternalComponentDefinition.g:482:2: ( ( rule__RequestHandler__Group__0 ) )
            // InternalComponentDefinition.g:483:3: ( rule__RequestHandler__Group__0 )
            {
             before(grammarAccess.getRequestHandlerAccess().getGroup()); 
            // InternalComponentDefinition.g:484:3: ( rule__RequestHandler__Group__0 )
            // InternalComponentDefinition.g:484:4: rule__RequestHandler__Group__0
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
    // InternalComponentDefinition.g:493:1: entryRuleAbstractComponentLink : ruleAbstractComponentLink EOF ;
    public final void entryRuleAbstractComponentLink() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:494:1: ( ruleAbstractComponentLink EOF )
            // InternalComponentDefinition.g:495:1: ruleAbstractComponentLink EOF
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
    // InternalComponentDefinition.g:502:1: ruleAbstractComponentLink : ( ( rule__AbstractComponentLink__Alternatives ) ) ;
    public final void ruleAbstractComponentLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:506:2: ( ( ( rule__AbstractComponentLink__Alternatives ) ) )
            // InternalComponentDefinition.g:507:2: ( ( rule__AbstractComponentLink__Alternatives ) )
            {
            // InternalComponentDefinition.g:507:2: ( ( rule__AbstractComponentLink__Alternatives ) )
            // InternalComponentDefinition.g:508:3: ( rule__AbstractComponentLink__Alternatives )
            {
             before(grammarAccess.getAbstractComponentLinkAccess().getAlternatives()); 
            // InternalComponentDefinition.g:509:3: ( rule__AbstractComponentLink__Alternatives )
            // InternalComponentDefinition.g:509:4: rule__AbstractComponentLink__Alternatives
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
    // InternalComponentDefinition.g:518:1: entryRuleRequestPortLink : ruleRequestPortLink EOF ;
    public final void entryRuleRequestPortLink() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:519:1: ( ruleRequestPortLink EOF )
            // InternalComponentDefinition.g:520:1: ruleRequestPortLink EOF
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
    // InternalComponentDefinition.g:527:1: ruleRequestPortLink : ( ( rule__RequestPortLink__Group__0 ) ) ;
    public final void ruleRequestPortLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:531:2: ( ( ( rule__RequestPortLink__Group__0 ) ) )
            // InternalComponentDefinition.g:532:2: ( ( rule__RequestPortLink__Group__0 ) )
            {
            // InternalComponentDefinition.g:532:2: ( ( rule__RequestPortLink__Group__0 ) )
            // InternalComponentDefinition.g:533:3: ( rule__RequestPortLink__Group__0 )
            {
             before(grammarAccess.getRequestPortLinkAccess().getGroup()); 
            // InternalComponentDefinition.g:534:3: ( rule__RequestPortLink__Group__0 )
            // InternalComponentDefinition.g:534:4: rule__RequestPortLink__Group__0
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
    // InternalComponentDefinition.g:543:1: entryRuleOpcUaClientLink : ruleOpcUaClientLink EOF ;
    public final void entryRuleOpcUaClientLink() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:544:1: ( ruleOpcUaClientLink EOF )
            // InternalComponentDefinition.g:545:1: ruleOpcUaClientLink EOF
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
    // InternalComponentDefinition.g:552:1: ruleOpcUaClientLink : ( ( rule__OpcUaClientLink__Group__0 ) ) ;
    public final void ruleOpcUaClientLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:556:2: ( ( ( rule__OpcUaClientLink__Group__0 ) ) )
            // InternalComponentDefinition.g:557:2: ( ( rule__OpcUaClientLink__Group__0 ) )
            {
            // InternalComponentDefinition.g:557:2: ( ( rule__OpcUaClientLink__Group__0 ) )
            // InternalComponentDefinition.g:558:3: ( rule__OpcUaClientLink__Group__0 )
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getGroup()); 
            // InternalComponentDefinition.g:559:3: ( rule__OpcUaClientLink__Group__0 )
            // InternalComponentDefinition.g:559:4: rule__OpcUaClientLink__Group__0
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
    // InternalComponentDefinition.g:568:1: entryRuleMixedPortROSLink : ruleMixedPortROSLink EOF ;
    public final void entryRuleMixedPortROSLink() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:569:1: ( ruleMixedPortROSLink EOF )
            // InternalComponentDefinition.g:570:1: ruleMixedPortROSLink EOF
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
    // InternalComponentDefinition.g:577:1: ruleMixedPortROSLink : ( ( rule__MixedPortROSLink__Group__0 ) ) ;
    public final void ruleMixedPortROSLink() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:581:2: ( ( ( rule__MixedPortROSLink__Group__0 ) ) )
            // InternalComponentDefinition.g:582:2: ( ( rule__MixedPortROSLink__Group__0 ) )
            {
            // InternalComponentDefinition.g:582:2: ( ( rule__MixedPortROSLink__Group__0 ) )
            // InternalComponentDefinition.g:583:3: ( rule__MixedPortROSLink__Group__0 )
            {
             before(grammarAccess.getMixedPortROSLinkAccess().getGroup()); 
            // InternalComponentDefinition.g:584:3: ( rule__MixedPortROSLink__Group__0 )
            // InternalComponentDefinition.g:584:4: rule__MixedPortROSLink__Group__0
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
    // InternalComponentDefinition.g:593:1: entryRuleComponentSubNodeObserver : ruleComponentSubNodeObserver EOF ;
    public final void entryRuleComponentSubNodeObserver() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:594:1: ( ruleComponentSubNodeObserver EOF )
            // InternalComponentDefinition.g:595:1: ruleComponentSubNodeObserver EOF
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
    // InternalComponentDefinition.g:602:1: ruleComponentSubNodeObserver : ( ( rule__ComponentSubNodeObserver__Group__0 ) ) ;
    public final void ruleComponentSubNodeObserver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:606:2: ( ( ( rule__ComponentSubNodeObserver__Group__0 ) ) )
            // InternalComponentDefinition.g:607:2: ( ( rule__ComponentSubNodeObserver__Group__0 ) )
            {
            // InternalComponentDefinition.g:607:2: ( ( rule__ComponentSubNodeObserver__Group__0 ) )
            // InternalComponentDefinition.g:608:3: ( rule__ComponentSubNodeObserver__Group__0 )
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getGroup()); 
            // InternalComponentDefinition.g:609:3: ( rule__ComponentSubNodeObserver__Group__0 )
            // InternalComponentDefinition.g:609:4: rule__ComponentSubNodeObserver__Group__0
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
    // InternalComponentDefinition.g:618:1: entryRuleInputLinkExtension : ruleInputLinkExtension EOF ;
    public final void entryRuleInputLinkExtension() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:619:1: ( ruleInputLinkExtension EOF )
            // InternalComponentDefinition.g:620:1: ruleInputLinkExtension EOF
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
    // InternalComponentDefinition.g:627:1: ruleInputLinkExtension : ( ( rule__InputLinkExtension__Group__0 ) ) ;
    public final void ruleInputLinkExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:631:2: ( ( ( rule__InputLinkExtension__Group__0 ) ) )
            // InternalComponentDefinition.g:632:2: ( ( rule__InputLinkExtension__Group__0 ) )
            {
            // InternalComponentDefinition.g:632:2: ( ( rule__InputLinkExtension__Group__0 ) )
            // InternalComponentDefinition.g:633:3: ( rule__InputLinkExtension__Group__0 )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getGroup()); 
            // InternalComponentDefinition.g:634:3: ( rule__InputLinkExtension__Group__0 )
            // InternalComponentDefinition.g:634:4: rule__InputLinkExtension__Group__0
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
    // InternalComponentDefinition.g:643:1: entryRuleActivityExtension : ruleActivityExtension EOF ;
    public final void entryRuleActivityExtension() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:644:1: ( ruleActivityExtension EOF )
            // InternalComponentDefinition.g:645:1: ruleActivityExtension EOF
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
    // InternalComponentDefinition.g:652:1: ruleActivityExtension : ( ( rule__ActivityExtension__Alternatives ) ) ;
    public final void ruleActivityExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:656:2: ( ( ( rule__ActivityExtension__Alternatives ) ) )
            // InternalComponentDefinition.g:657:2: ( ( rule__ActivityExtension__Alternatives ) )
            {
            // InternalComponentDefinition.g:657:2: ( ( rule__ActivityExtension__Alternatives ) )
            // InternalComponentDefinition.g:658:3: ( rule__ActivityExtension__Alternatives )
            {
             before(grammarAccess.getActivityExtensionAccess().getAlternatives()); 
            // InternalComponentDefinition.g:659:3: ( rule__ActivityExtension__Alternatives )
            // InternalComponentDefinition.g:659:4: rule__ActivityExtension__Alternatives
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
    // InternalComponentDefinition.g:668:1: entryRuleActivationConstraints : ruleActivationConstraints EOF ;
    public final void entryRuleActivationConstraints() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:669:1: ( ruleActivationConstraints EOF )
            // InternalComponentDefinition.g:670:1: ruleActivationConstraints EOF
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
    // InternalComponentDefinition.g:677:1: ruleActivationConstraints : ( ( rule__ActivationConstraints__Group__0 ) ) ;
    public final void ruleActivationConstraints() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:681:2: ( ( ( rule__ActivationConstraints__Group__0 ) ) )
            // InternalComponentDefinition.g:682:2: ( ( rule__ActivationConstraints__Group__0 ) )
            {
            // InternalComponentDefinition.g:682:2: ( ( rule__ActivationConstraints__Group__0 ) )
            // InternalComponentDefinition.g:683:3: ( rule__ActivationConstraints__Group__0 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getGroup()); 
            // InternalComponentDefinition.g:684:3: ( rule__ActivationConstraints__Group__0 )
            // InternalComponentDefinition.g:684:4: rule__ActivationConstraints__Group__0
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
    // InternalComponentDefinition.g:693:1: entryRuleOperationModeBinding : ruleOperationModeBinding EOF ;
    public final void entryRuleOperationModeBinding() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:694:1: ( ruleOperationModeBinding EOF )
            // InternalComponentDefinition.g:695:1: ruleOperationModeBinding EOF
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
    // InternalComponentDefinition.g:702:1: ruleOperationModeBinding : ( ( rule__OperationModeBinding__Group__0 ) ) ;
    public final void ruleOperationModeBinding() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:706:2: ( ( ( rule__OperationModeBinding__Group__0 ) ) )
            // InternalComponentDefinition.g:707:2: ( ( rule__OperationModeBinding__Group__0 ) )
            {
            // InternalComponentDefinition.g:707:2: ( ( rule__OperationModeBinding__Group__0 ) )
            // InternalComponentDefinition.g:708:3: ( rule__OperationModeBinding__Group__0 )
            {
             before(grammarAccess.getOperationModeBindingAccess().getGroup()); 
            // InternalComponentDefinition.g:709:3: ( rule__OperationModeBinding__Group__0 )
            // InternalComponentDefinition.g:709:4: rule__OperationModeBinding__Group__0
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
    // InternalComponentDefinition.g:718:1: entryRuleDefaultTrigger : ruleDefaultTrigger EOF ;
    public final void entryRuleDefaultTrigger() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:719:1: ( ruleDefaultTrigger EOF )
            // InternalComponentDefinition.g:720:1: ruleDefaultTrigger EOF
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
    // InternalComponentDefinition.g:727:1: ruleDefaultTrigger : ( ( rule__DefaultTrigger__Group__0 ) ) ;
    public final void ruleDefaultTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:731:2: ( ( ( rule__DefaultTrigger__Group__0 ) ) )
            // InternalComponentDefinition.g:732:2: ( ( rule__DefaultTrigger__Group__0 ) )
            {
            // InternalComponentDefinition.g:732:2: ( ( rule__DefaultTrigger__Group__0 ) )
            // InternalComponentDefinition.g:733:3: ( rule__DefaultTrigger__Group__0 )
            {
             before(grammarAccess.getDefaultTriggerAccess().getGroup()); 
            // InternalComponentDefinition.g:734:3: ( rule__DefaultTrigger__Group__0 )
            // InternalComponentDefinition.g:734:4: rule__DefaultTrigger__Group__0
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
    // InternalComponentDefinition.g:743:1: entryRuleDefaultInputTrigger : ruleDefaultInputTrigger EOF ;
    public final void entryRuleDefaultInputTrigger() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:744:1: ( ruleDefaultInputTrigger EOF )
            // InternalComponentDefinition.g:745:1: ruleDefaultInputTrigger EOF
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
    // InternalComponentDefinition.g:752:1: ruleDefaultInputTrigger : ( ( rule__DefaultInputTrigger__Group__0 ) ) ;
    public final void ruleDefaultInputTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:756:2: ( ( ( rule__DefaultInputTrigger__Group__0 ) ) )
            // InternalComponentDefinition.g:757:2: ( ( rule__DefaultInputTrigger__Group__0 ) )
            {
            // InternalComponentDefinition.g:757:2: ( ( rule__DefaultInputTrigger__Group__0 ) )
            // InternalComponentDefinition.g:758:3: ( rule__DefaultInputTrigger__Group__0 )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getGroup()); 
            // InternalComponentDefinition.g:759:3: ( rule__DefaultInputTrigger__Group__0 )
            // InternalComponentDefinition.g:759:4: rule__DefaultInputTrigger__Group__0
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
    // InternalComponentDefinition.g:768:1: entryRuleDefaultPeriodicTimer : ruleDefaultPeriodicTimer EOF ;
    public final void entryRuleDefaultPeriodicTimer() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:769:1: ( ruleDefaultPeriodicTimer EOF )
            // InternalComponentDefinition.g:770:1: ruleDefaultPeriodicTimer EOF
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
    // InternalComponentDefinition.g:777:1: ruleDefaultPeriodicTimer : ( ( rule__DefaultPeriodicTimer__Group__0 ) ) ;
    public final void ruleDefaultPeriodicTimer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:781:2: ( ( ( rule__DefaultPeriodicTimer__Group__0 ) ) )
            // InternalComponentDefinition.g:782:2: ( ( rule__DefaultPeriodicTimer__Group__0 ) )
            {
            // InternalComponentDefinition.g:782:2: ( ( rule__DefaultPeriodicTimer__Group__0 ) )
            // InternalComponentDefinition.g:783:3: ( rule__DefaultPeriodicTimer__Group__0 )
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getGroup()); 
            // InternalComponentDefinition.g:784:3: ( rule__DefaultPeriodicTimer__Group__0 )
            // InternalComponentDefinition.g:784:4: rule__DefaultPeriodicTimer__Group__0
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
    // InternalComponentDefinition.g:793:1: entryRuleDefaultObservedElementTrigger : ruleDefaultObservedElementTrigger EOF ;
    public final void entryRuleDefaultObservedElementTrigger() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:794:1: ( ruleDefaultObservedElementTrigger EOF )
            // InternalComponentDefinition.g:795:1: ruleDefaultObservedElementTrigger EOF
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
    // InternalComponentDefinition.g:802:1: ruleDefaultObservedElementTrigger : ( ( rule__DefaultObservedElementTrigger__Group__0 ) ) ;
    public final void ruleDefaultObservedElementTrigger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:806:2: ( ( ( rule__DefaultObservedElementTrigger__Group__0 ) ) )
            // InternalComponentDefinition.g:807:2: ( ( rule__DefaultObservedElementTrigger__Group__0 ) )
            {
            // InternalComponentDefinition.g:807:2: ( ( rule__DefaultObservedElementTrigger__Group__0 ) )
            // InternalComponentDefinition.g:808:3: ( rule__DefaultObservedElementTrigger__Group__0 )
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getGroup()); 
            // InternalComponentDefinition.g:809:3: ( rule__DefaultObservedElementTrigger__Group__0 )
            // InternalComponentDefinition.g:809:4: rule__DefaultObservedElementTrigger__Group__0
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
    // InternalComponentDefinition.g:818:1: entryRulePlainOpcUaPort : rulePlainOpcUaPort EOF ;
    public final void entryRulePlainOpcUaPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:819:1: ( rulePlainOpcUaPort EOF )
            // InternalComponentDefinition.g:820:1: rulePlainOpcUaPort EOF
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
    // InternalComponentDefinition.g:827:1: rulePlainOpcUaPort : ( ( rule__PlainOpcUaPort__Alternatives ) ) ;
    public final void rulePlainOpcUaPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:831:2: ( ( ( rule__PlainOpcUaPort__Alternatives ) ) )
            // InternalComponentDefinition.g:832:2: ( ( rule__PlainOpcUaPort__Alternatives ) )
            {
            // InternalComponentDefinition.g:832:2: ( ( rule__PlainOpcUaPort__Alternatives ) )
            // InternalComponentDefinition.g:833:3: ( rule__PlainOpcUaPort__Alternatives )
            {
             before(grammarAccess.getPlainOpcUaPortAccess().getAlternatives()); 
            // InternalComponentDefinition.g:834:3: ( rule__PlainOpcUaPort__Alternatives )
            // InternalComponentDefinition.g:834:4: rule__PlainOpcUaPort__Alternatives
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
    // InternalComponentDefinition.g:843:1: entryRuleOpcUaDeviceClient : ruleOpcUaDeviceClient EOF ;
    public final void entryRuleOpcUaDeviceClient() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:844:1: ( ruleOpcUaDeviceClient EOF )
            // InternalComponentDefinition.g:845:1: ruleOpcUaDeviceClient EOF
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
    // InternalComponentDefinition.g:852:1: ruleOpcUaDeviceClient : ( ( rule__OpcUaDeviceClient__Group__0 ) ) ;
    public final void ruleOpcUaDeviceClient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:856:2: ( ( ( rule__OpcUaDeviceClient__Group__0 ) ) )
            // InternalComponentDefinition.g:857:2: ( ( rule__OpcUaDeviceClient__Group__0 ) )
            {
            // InternalComponentDefinition.g:857:2: ( ( rule__OpcUaDeviceClient__Group__0 ) )
            // InternalComponentDefinition.g:858:3: ( rule__OpcUaDeviceClient__Group__0 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getGroup()); 
            // InternalComponentDefinition.g:859:3: ( rule__OpcUaDeviceClient__Group__0 )
            // InternalComponentDefinition.g:859:4: rule__OpcUaDeviceClient__Group__0
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
    // InternalComponentDefinition.g:868:1: entryRuleOpcUaReadServer : ruleOpcUaReadServer EOF ;
    public final void entryRuleOpcUaReadServer() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:869:1: ( ruleOpcUaReadServer EOF )
            // InternalComponentDefinition.g:870:1: ruleOpcUaReadServer EOF
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
    // InternalComponentDefinition.g:877:1: ruleOpcUaReadServer : ( ( rule__OpcUaReadServer__Group__0 ) ) ;
    public final void ruleOpcUaReadServer() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:881:2: ( ( ( rule__OpcUaReadServer__Group__0 ) ) )
            // InternalComponentDefinition.g:882:2: ( ( rule__OpcUaReadServer__Group__0 ) )
            {
            // InternalComponentDefinition.g:882:2: ( ( rule__OpcUaReadServer__Group__0 ) )
            // InternalComponentDefinition.g:883:3: ( rule__OpcUaReadServer__Group__0 )
            {
             before(grammarAccess.getOpcUaReadServerAccess().getGroup()); 
            // InternalComponentDefinition.g:884:3: ( rule__OpcUaReadServer__Group__0 )
            // InternalComponentDefinition.g:884:4: rule__OpcUaReadServer__Group__0
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
    // InternalComponentDefinition.g:893:1: entryRuleMixedPortROS : ruleMixedPortROS EOF ;
    public final void entryRuleMixedPortROS() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:894:1: ( ruleMixedPortROS EOF )
            // InternalComponentDefinition.g:895:1: ruleMixedPortROS EOF
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
    // InternalComponentDefinition.g:902:1: ruleMixedPortROS : ( ( rule__MixedPortROS__Group__0 ) ) ;
    public final void ruleMixedPortROS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:906:2: ( ( ( rule__MixedPortROS__Group__0 ) ) )
            // InternalComponentDefinition.g:907:2: ( ( rule__MixedPortROS__Group__0 ) )
            {
            // InternalComponentDefinition.g:907:2: ( ( rule__MixedPortROS__Group__0 ) )
            // InternalComponentDefinition.g:908:3: ( rule__MixedPortROS__Group__0 )
            {
             before(grammarAccess.getMixedPortROSAccess().getGroup()); 
            // InternalComponentDefinition.g:909:3: ( rule__MixedPortROS__Group__0 )
            // InternalComponentDefinition.g:909:4: rule__MixedPortROS__Group__0
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
    // InternalComponentDefinition.g:918:1: entryRuleMixedPortYARP : ruleMixedPortYARP EOF ;
    public final void entryRuleMixedPortYARP() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:919:1: ( ruleMixedPortYARP EOF )
            // InternalComponentDefinition.g:920:1: ruleMixedPortYARP EOF
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
    // InternalComponentDefinition.g:927:1: ruleMixedPortYARP : ( ( rule__MixedPortYARP__Group__0 ) ) ;
    public final void ruleMixedPortYARP() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:931:2: ( ( ( rule__MixedPortYARP__Group__0 ) ) )
            // InternalComponentDefinition.g:932:2: ( ( rule__MixedPortYARP__Group__0 ) )
            {
            // InternalComponentDefinition.g:932:2: ( ( rule__MixedPortYARP__Group__0 ) )
            // InternalComponentDefinition.g:933:3: ( rule__MixedPortYARP__Group__0 )
            {
             before(grammarAccess.getMixedPortYARPAccess().getGroup()); 
            // InternalComponentDefinition.g:934:3: ( rule__MixedPortYARP__Group__0 )
            // InternalComponentDefinition.g:934:4: rule__MixedPortYARP__Group__0
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
    // InternalComponentDefinition.g:943:1: entryRuleCoordinationSlavePort : ruleCoordinationSlavePort EOF ;
    public final void entryRuleCoordinationSlavePort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:944:1: ( ruleCoordinationSlavePort EOF )
            // InternalComponentDefinition.g:945:1: ruleCoordinationSlavePort EOF
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
    // InternalComponentDefinition.g:952:1: ruleCoordinationSlavePort : ( ( rule__CoordinationSlavePort__Group__0 ) ) ;
    public final void ruleCoordinationSlavePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:956:2: ( ( ( rule__CoordinationSlavePort__Group__0 ) ) )
            // InternalComponentDefinition.g:957:2: ( ( rule__CoordinationSlavePort__Group__0 ) )
            {
            // InternalComponentDefinition.g:957:2: ( ( rule__CoordinationSlavePort__Group__0 ) )
            // InternalComponentDefinition.g:958:3: ( rule__CoordinationSlavePort__Group__0 )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getGroup()); 
            // InternalComponentDefinition.g:959:3: ( rule__CoordinationSlavePort__Group__0 )
            // InternalComponentDefinition.g:959:4: rule__CoordinationSlavePort__Group__0
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
    // InternalComponentDefinition.g:968:1: entryRuleAbstractCoordinationElement : ruleAbstractCoordinationElement EOF ;
    public final void entryRuleAbstractCoordinationElement() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:969:1: ( ruleAbstractCoordinationElement EOF )
            // InternalComponentDefinition.g:970:1: ruleAbstractCoordinationElement EOF
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
    // InternalComponentDefinition.g:977:1: ruleAbstractCoordinationElement : ( ( rule__AbstractCoordinationElement__Alternatives ) ) ;
    public final void ruleAbstractCoordinationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:981:2: ( ( ( rule__AbstractCoordinationElement__Alternatives ) ) )
            // InternalComponentDefinition.g:982:2: ( ( rule__AbstractCoordinationElement__Alternatives ) )
            {
            // InternalComponentDefinition.g:982:2: ( ( rule__AbstractCoordinationElement__Alternatives ) )
            // InternalComponentDefinition.g:983:3: ( rule__AbstractCoordinationElement__Alternatives )
            {
             before(grammarAccess.getAbstractCoordinationElementAccess().getAlternatives()); 
            // InternalComponentDefinition.g:984:3: ( rule__AbstractCoordinationElement__Alternatives )
            // InternalComponentDefinition.g:984:4: rule__AbstractCoordinationElement__Alternatives
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
    // InternalComponentDefinition.g:993:1: entryRuleSkillRealizationsRef : ruleSkillRealizationsRef EOF ;
    public final void entryRuleSkillRealizationsRef() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:994:1: ( ruleSkillRealizationsRef EOF )
            // InternalComponentDefinition.g:995:1: ruleSkillRealizationsRef EOF
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
    // InternalComponentDefinition.g:1002:1: ruleSkillRealizationsRef : ( ( rule__SkillRealizationsRef__Group__0 ) ) ;
    public final void ruleSkillRealizationsRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1006:2: ( ( ( rule__SkillRealizationsRef__Group__0 ) ) )
            // InternalComponentDefinition.g:1007:2: ( ( rule__SkillRealizationsRef__Group__0 ) )
            {
            // InternalComponentDefinition.g:1007:2: ( ( rule__SkillRealizationsRef__Group__0 ) )
            // InternalComponentDefinition.g:1008:3: ( rule__SkillRealizationsRef__Group__0 )
            {
             before(grammarAccess.getSkillRealizationsRefAccess().getGroup()); 
            // InternalComponentDefinition.g:1009:3: ( rule__SkillRealizationsRef__Group__0 )
            // InternalComponentDefinition.g:1009:4: rule__SkillRealizationsRef__Group__0
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
    // InternalComponentDefinition.g:1018:1: entryRuleCommunicationServiceUsageRealization : ruleCommunicationServiceUsageRealization EOF ;
    public final void entryRuleCommunicationServiceUsageRealization() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1019:1: ( ruleCommunicationServiceUsageRealization EOF )
            // InternalComponentDefinition.g:1020:1: ruleCommunicationServiceUsageRealization EOF
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
    // InternalComponentDefinition.g:1027:1: ruleCommunicationServiceUsageRealization : ( ( rule__CommunicationServiceUsageRealization__Group__0 ) ) ;
    public final void ruleCommunicationServiceUsageRealization() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1031:2: ( ( ( rule__CommunicationServiceUsageRealization__Group__0 ) ) )
            // InternalComponentDefinition.g:1032:2: ( ( rule__CommunicationServiceUsageRealization__Group__0 ) )
            {
            // InternalComponentDefinition.g:1032:2: ( ( rule__CommunicationServiceUsageRealization__Group__0 ) )
            // InternalComponentDefinition.g:1033:3: ( rule__CommunicationServiceUsageRealization__Group__0 )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getGroup()); 
            // InternalComponentDefinition.g:1034:3: ( rule__CommunicationServiceUsageRealization__Group__0 )
            // InternalComponentDefinition.g:1034:4: rule__CommunicationServiceUsageRealization__Group__0
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
    // InternalComponentDefinition.g:1043:1: entryRulePublicOperationMode : rulePublicOperationMode EOF ;
    public final void entryRulePublicOperationMode() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1044:1: ( rulePublicOperationMode EOF )
            // InternalComponentDefinition.g:1045:1: rulePublicOperationMode EOF
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
    // InternalComponentDefinition.g:1052:1: rulePublicOperationMode : ( ( rule__PublicOperationMode__Group__0 ) ) ;
    public final void rulePublicOperationMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1056:2: ( ( ( rule__PublicOperationMode__Group__0 ) ) )
            // InternalComponentDefinition.g:1057:2: ( ( rule__PublicOperationMode__Group__0 ) )
            {
            // InternalComponentDefinition.g:1057:2: ( ( rule__PublicOperationMode__Group__0 ) )
            // InternalComponentDefinition.g:1058:3: ( rule__PublicOperationMode__Group__0 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getGroup()); 
            // InternalComponentDefinition.g:1059:3: ( rule__PublicOperationMode__Group__0 )
            // InternalComponentDefinition.g:1059:4: rule__PublicOperationMode__Group__0
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
    // InternalComponentDefinition.g:1068:1: entryRulePrivateOperationMode : rulePrivateOperationMode EOF ;
    public final void entryRulePrivateOperationMode() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1069:1: ( rulePrivateOperationMode EOF )
            // InternalComponentDefinition.g:1070:1: rulePrivateOperationMode EOF
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
    // InternalComponentDefinition.g:1077:1: rulePrivateOperationMode : ( ( rule__PrivateOperationMode__Group__0 ) ) ;
    public final void rulePrivateOperationMode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1081:2: ( ( ( rule__PrivateOperationMode__Group__0 ) ) )
            // InternalComponentDefinition.g:1082:2: ( ( rule__PrivateOperationMode__Group__0 ) )
            {
            // InternalComponentDefinition.g:1082:2: ( ( rule__PrivateOperationMode__Group__0 ) )
            // InternalComponentDefinition.g:1083:3: ( rule__PrivateOperationMode__Group__0 )
            {
             before(grammarAccess.getPrivateOperationModeAccess().getGroup()); 
            // InternalComponentDefinition.g:1084:3: ( rule__PrivateOperationMode__Group__0 )
            // InternalComponentDefinition.g:1084:4: rule__PrivateOperationMode__Group__0
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
    // InternalComponentDefinition.g:1093:1: entryRuleCoordinationMasterPort : ruleCoordinationMasterPort EOF ;
    public final void entryRuleCoordinationMasterPort() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1094:1: ( ruleCoordinationMasterPort EOF )
            // InternalComponentDefinition.g:1095:1: ruleCoordinationMasterPort EOF
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
    // InternalComponentDefinition.g:1102:1: ruleCoordinationMasterPort : ( ( rule__CoordinationMasterPort__Group__0 ) ) ;
    public final void ruleCoordinationMasterPort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1106:2: ( ( ( rule__CoordinationMasterPort__Group__0 ) ) )
            // InternalComponentDefinition.g:1107:2: ( ( rule__CoordinationMasterPort__Group__0 ) )
            {
            // InternalComponentDefinition.g:1107:2: ( ( rule__CoordinationMasterPort__Group__0 ) )
            // InternalComponentDefinition.g:1108:3: ( rule__CoordinationMasterPort__Group__0 )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getGroup()); 
            // InternalComponentDefinition.g:1109:3: ( rule__CoordinationMasterPort__Group__0 )
            // InternalComponentDefinition.g:1109:4: rule__CoordinationMasterPort__Group__0
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
    // InternalComponentDefinition.g:1118:1: entryRuleComponentParametersRef : ruleComponentParametersRef EOF ;
    public final void entryRuleComponentParametersRef() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1119:1: ( ruleComponentParametersRef EOF )
            // InternalComponentDefinition.g:1120:1: ruleComponentParametersRef EOF
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
    // InternalComponentDefinition.g:1127:1: ruleComponentParametersRef : ( ( rule__ComponentParametersRef__Group__0 ) ) ;
    public final void ruleComponentParametersRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1131:2: ( ( ( rule__ComponentParametersRef__Group__0 ) ) )
            // InternalComponentDefinition.g:1132:2: ( ( rule__ComponentParametersRef__Group__0 ) )
            {
            // InternalComponentDefinition.g:1132:2: ( ( rule__ComponentParametersRef__Group__0 ) )
            // InternalComponentDefinition.g:1133:3: ( rule__ComponentParametersRef__Group__0 )
            {
             before(grammarAccess.getComponentParametersRefAccess().getGroup()); 
            // InternalComponentDefinition.g:1134:3: ( rule__ComponentParametersRef__Group__0 )
            // InternalComponentDefinition.g:1134:4: rule__ComponentParametersRef__Group__0
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
    // InternalComponentDefinition.g:1143:1: entryRuleRoboticMiddleware : ruleRoboticMiddleware EOF ;
    public final void entryRuleRoboticMiddleware() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1144:1: ( ruleRoboticMiddleware EOF )
            // InternalComponentDefinition.g:1145:1: ruleRoboticMiddleware EOF
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
    // InternalComponentDefinition.g:1152:1: ruleRoboticMiddleware : ( ( rule__RoboticMiddleware__Alternatives ) ) ;
    public final void ruleRoboticMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1156:2: ( ( ( rule__RoboticMiddleware__Alternatives ) ) )
            // InternalComponentDefinition.g:1157:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            {
            // InternalComponentDefinition.g:1157:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            // InternalComponentDefinition.g:1158:3: ( rule__RoboticMiddleware__Alternatives )
            {
             before(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); 
            // InternalComponentDefinition.g:1159:3: ( rule__RoboticMiddleware__Alternatives )
            // InternalComponentDefinition.g:1159:4: rule__RoboticMiddleware__Alternatives
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
    // InternalComponentDefinition.g:1168:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1169:1: ( ruleFQN EOF )
            // InternalComponentDefinition.g:1170:1: ruleFQN EOF
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
    // InternalComponentDefinition.g:1177:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1181:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalComponentDefinition.g:1182:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalComponentDefinition.g:1182:2: ( ( rule__FQN__Group__0 ) )
            // InternalComponentDefinition.g:1183:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalComponentDefinition.g:1184:3: ( rule__FQN__Group__0 )
            // InternalComponentDefinition.g:1184:4: rule__FQN__Group__0
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
    // InternalComponentDefinition.g:1193:1: entryRuleFQNW : ruleFQNW EOF ;
    public final void entryRuleFQNW() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1194:1: ( ruleFQNW EOF )
            // InternalComponentDefinition.g:1195:1: ruleFQNW EOF
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
    // InternalComponentDefinition.g:1202:1: ruleFQNW : ( ( rule__FQNW__Group__0 ) ) ;
    public final void ruleFQNW() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1206:2: ( ( ( rule__FQNW__Group__0 ) ) )
            // InternalComponentDefinition.g:1207:2: ( ( rule__FQNW__Group__0 ) )
            {
            // InternalComponentDefinition.g:1207:2: ( ( rule__FQNW__Group__0 ) )
            // InternalComponentDefinition.g:1208:3: ( rule__FQNW__Group__0 )
            {
             before(grammarAccess.getFQNWAccess().getGroup()); 
            // InternalComponentDefinition.g:1209:3: ( rule__FQNW__Group__0 )
            // InternalComponentDefinition.g:1209:4: rule__FQNW__Group__0
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
    // InternalComponentDefinition.g:1218:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1219:1: ( ruleEString EOF )
            // InternalComponentDefinition.g:1220:1: ruleEString EOF
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
    // InternalComponentDefinition.g:1227:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1231:2: ( ( RULE_STRING ) )
            // InternalComponentDefinition.g:1232:2: ( RULE_STRING )
            {
            // InternalComponentDefinition.g:1232:2: ( RULE_STRING )
            // InternalComponentDefinition.g:1233:3: RULE_STRING
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
    // InternalComponentDefinition.g:1243:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1244:1: ( ruleEInt EOF )
            // InternalComponentDefinition.g:1245:1: ruleEInt EOF
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
    // InternalComponentDefinition.g:1252:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1256:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalComponentDefinition.g:1257:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalComponentDefinition.g:1257:2: ( ( rule__EInt__Group__0 ) )
            // InternalComponentDefinition.g:1258:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalComponentDefinition.g:1259:3: ( rule__EInt__Group__0 )
            // InternalComponentDefinition.g:1259:4: rule__EInt__Group__0
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
    // InternalComponentDefinition.g:1268:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1269:1: ( ruleEDouble EOF )
            // InternalComponentDefinition.g:1270:1: ruleEDouble EOF
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
    // InternalComponentDefinition.g:1277:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1281:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalComponentDefinition.g:1282:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalComponentDefinition.g:1282:2: ( ( rule__EDouble__Group__0 ) )
            // InternalComponentDefinition.g:1283:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalComponentDefinition.g:1284:3: ( rule__EDouble__Group__0 )
            // InternalComponentDefinition.g:1284:4: rule__EDouble__Group__0
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
    // InternalComponentDefinition.g:1293:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1294:1: ( ruleEBoolean EOF )
            // InternalComponentDefinition.g:1295:1: ruleEBoolean EOF
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
    // InternalComponentDefinition.g:1302:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1306:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalComponentDefinition.g:1307:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalComponentDefinition.g:1307:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalComponentDefinition.g:1308:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalComponentDefinition.g:1309:3: ( rule__EBoolean__Alternatives )
            // InternalComponentDefinition.g:1309:4: rule__EBoolean__Alternatives
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
    // InternalComponentDefinition.g:1318:1: entryRuleACE_SmartSoft : ruleACE_SmartSoft EOF ;
    public final void entryRuleACE_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1319:1: ( ruleACE_SmartSoft EOF )
            // InternalComponentDefinition.g:1320:1: ruleACE_SmartSoft EOF
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
    // InternalComponentDefinition.g:1327:1: ruleACE_SmartSoft : ( ( rule__ACE_SmartSoft__Group__0 ) ) ;
    public final void ruleACE_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1331:2: ( ( ( rule__ACE_SmartSoft__Group__0 ) ) )
            // InternalComponentDefinition.g:1332:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            {
            // InternalComponentDefinition.g:1332:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            // InternalComponentDefinition.g:1333:3: ( rule__ACE_SmartSoft__Group__0 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup()); 
            // InternalComponentDefinition.g:1334:3: ( rule__ACE_SmartSoft__Group__0 )
            // InternalComponentDefinition.g:1334:4: rule__ACE_SmartSoft__Group__0
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
    // InternalComponentDefinition.g:1343:1: entryRuleOpcUa_SeRoNet : ruleOpcUa_SeRoNet EOF ;
    public final void entryRuleOpcUa_SeRoNet() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1344:1: ( ruleOpcUa_SeRoNet EOF )
            // InternalComponentDefinition.g:1345:1: ruleOpcUa_SeRoNet EOF
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
    // InternalComponentDefinition.g:1352:1: ruleOpcUa_SeRoNet : ( ( rule__OpcUa_SeRoNet__Group__0 ) ) ;
    public final void ruleOpcUa_SeRoNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1356:2: ( ( ( rule__OpcUa_SeRoNet__Group__0 ) ) )
            // InternalComponentDefinition.g:1357:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            {
            // InternalComponentDefinition.g:1357:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            // InternalComponentDefinition.g:1358:3: ( rule__OpcUa_SeRoNet__Group__0 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); 
            // InternalComponentDefinition.g:1359:3: ( rule__OpcUa_SeRoNet__Group__0 )
            // InternalComponentDefinition.g:1359:4: rule__OpcUa_SeRoNet__Group__0
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
    // InternalComponentDefinition.g:1368:1: entryRuleCORBA_SmartSoft : ruleCORBA_SmartSoft EOF ;
    public final void entryRuleCORBA_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1369:1: ( ruleCORBA_SmartSoft EOF )
            // InternalComponentDefinition.g:1370:1: ruleCORBA_SmartSoft EOF
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
    // InternalComponentDefinition.g:1377:1: ruleCORBA_SmartSoft : ( ( rule__CORBA_SmartSoft__Group__0 ) ) ;
    public final void ruleCORBA_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1381:2: ( ( ( rule__CORBA_SmartSoft__Group__0 ) ) )
            // InternalComponentDefinition.g:1382:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            {
            // InternalComponentDefinition.g:1382:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            // InternalComponentDefinition.g:1383:3: ( rule__CORBA_SmartSoft__Group__0 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); 
            // InternalComponentDefinition.g:1384:3: ( rule__CORBA_SmartSoft__Group__0 )
            // InternalComponentDefinition.g:1384:4: rule__CORBA_SmartSoft__Group__0
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
    // InternalComponentDefinition.g:1393:1: entryRuleDDS_SmartSoft : ruleDDS_SmartSoft EOF ;
    public final void entryRuleDDS_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentDefinition.g:1394:1: ( ruleDDS_SmartSoft EOF )
            // InternalComponentDefinition.g:1395:1: ruleDDS_SmartSoft EOF
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
    // InternalComponentDefinition.g:1402:1: ruleDDS_SmartSoft : ( ( rule__DDS_SmartSoft__Group__0 ) ) ;
    public final void ruleDDS_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1406:2: ( ( ( rule__DDS_SmartSoft__Group__0 ) ) )
            // InternalComponentDefinition.g:1407:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            {
            // InternalComponentDefinition.g:1407:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            // InternalComponentDefinition.g:1408:3: ( rule__DDS_SmartSoft__Group__0 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup()); 
            // InternalComponentDefinition.g:1409:3: ( rule__DDS_SmartSoft__Group__0 )
            // InternalComponentDefinition.g:1409:4: rule__DDS_SmartSoft__Group__0
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
    // InternalComponentDefinition.g:1417:1: rule__AbstractComponentElement__Alternatives : ( ( ruleNamedComponentElement ) | ( ruleDerivedComponentElement ) | ( rulePlainOpcUaPort ) );
    public final void rule__AbstractComponentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1421:1: ( ( ruleNamedComponentElement ) | ( ruleDerivedComponentElement ) | ( rulePlainOpcUaPort ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
            case 24:
            case 26:
            case 28:
            case 29:
            case 31:
            case 32:
            case 34:
            case 61:
            case 70:
                {
                alt1=1;
                }
                break;
            case 59:
            case 60:
            case 71:
                {
                alt1=2;
                }
                break;
            case 52:
            case 56:
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
                    // InternalComponentDefinition.g:1422:2: ( ruleNamedComponentElement )
                    {
                    // InternalComponentDefinition.g:1422:2: ( ruleNamedComponentElement )
                    // InternalComponentDefinition.g:1423:3: ruleNamedComponentElement
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
                    // InternalComponentDefinition.g:1428:2: ( ruleDerivedComponentElement )
                    {
                    // InternalComponentDefinition.g:1428:2: ( ruleDerivedComponentElement )
                    // InternalComponentDefinition.g:1429:3: ruleDerivedComponentElement
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
                    // InternalComponentDefinition.g:1434:2: ( rulePlainOpcUaPort )
                    {
                    // InternalComponentDefinition.g:1434:2: ( rulePlainOpcUaPort )
                    // InternalComponentDefinition.g:1435:3: rulePlainOpcUaPort
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
    // InternalComponentDefinition.g:1444:1: rule__DerivedComponentElement__Alternatives : ( ( ruleComponentParametersRef ) | ( ruleMixedPortROS ) | ( ruleMixedPortYARP ) );
    public final void rule__DerivedComponentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1448:1: ( ( ruleComponentParametersRef ) | ( ruleMixedPortROS ) | ( ruleMixedPortYARP ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt2=1;
                }
                break;
            case 59:
                {
                alt2=2;
                }
                break;
            case 60:
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
                    // InternalComponentDefinition.g:1449:2: ( ruleComponentParametersRef )
                    {
                    // InternalComponentDefinition.g:1449:2: ( ruleComponentParametersRef )
                    // InternalComponentDefinition.g:1450:3: ruleComponentParametersRef
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
                    // InternalComponentDefinition.g:1455:2: ( ruleMixedPortROS )
                    {
                    // InternalComponentDefinition.g:1455:2: ( ruleMixedPortROS )
                    // InternalComponentDefinition.g:1456:3: ruleMixedPortROS
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
                    // InternalComponentDefinition.g:1461:2: ( ruleMixedPortYARP )
                    {
                    // InternalComponentDefinition.g:1461:2: ( ruleMixedPortYARP )
                    // InternalComponentDefinition.g:1462:3: ruleMixedPortYARP
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
    // InternalComponentDefinition.g:1471:1: rule__NamedComponentElement__Alternatives : ( ( ruleComponentSubNode ) | ( ruleComponentPort ) | ( ruleCoordinationSlavePort ) | ( ruleCoordinationMasterPort ) );
    public final void rule__NamedComponentElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1475:1: ( ( ruleComponentSubNode ) | ( ruleComponentPort ) | ( ruleCoordinationSlavePort ) | ( ruleCoordinationMasterPort ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 31:
            case 32:
            case 34:
                {
                alt3=1;
                }
                break;
            case RULE_DOCU_COMMENT:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==61) ) {
                    alt3=3;
                }
                else if ( (LA3_2==24||LA3_2==26||(LA3_2>=28 && LA3_2<=29)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 24:
            case 26:
            case 28:
            case 29:
                {
                alt3=2;
                }
                break;
            case 61:
                {
                alt3=3;
                }
                break;
            case 70:
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
                    // InternalComponentDefinition.g:1476:2: ( ruleComponentSubNode )
                    {
                    // InternalComponentDefinition.g:1476:2: ( ruleComponentSubNode )
                    // InternalComponentDefinition.g:1477:3: ruleComponentSubNode
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
                    // InternalComponentDefinition.g:1482:2: ( ruleComponentPort )
                    {
                    // InternalComponentDefinition.g:1482:2: ( ruleComponentPort )
                    // InternalComponentDefinition.g:1483:3: ruleComponentPort
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
                    // InternalComponentDefinition.g:1488:2: ( ruleCoordinationSlavePort )
                    {
                    // InternalComponentDefinition.g:1488:2: ( ruleCoordinationSlavePort )
                    // InternalComponentDefinition.g:1489:3: ruleCoordinationSlavePort
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
                    // InternalComponentDefinition.g:1494:2: ( ruleCoordinationMasterPort )
                    {
                    // InternalComponentDefinition.g:1494:2: ( ruleCoordinationMasterPort )
                    // InternalComponentDefinition.g:1495:3: ruleCoordinationMasterPort
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
    // InternalComponentDefinition.g:1504:1: rule__ComponentSubNode__Alternatives : ( ( ruleActivity ) | ( ruleInputHandler ) | ( ruleRequestHandler ) );
    public final void rule__ComponentSubNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1508:1: ( ( ruleActivity ) | ( ruleInputHandler ) | ( ruleRequestHandler ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 34:
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
                    // InternalComponentDefinition.g:1509:2: ( ruleActivity )
                    {
                    // InternalComponentDefinition.g:1509:2: ( ruleActivity )
                    // InternalComponentDefinition.g:1510:3: ruleActivity
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
                    // InternalComponentDefinition.g:1515:2: ( ruleInputHandler )
                    {
                    // InternalComponentDefinition.g:1515:2: ( ruleInputHandler )
                    // InternalComponentDefinition.g:1516:3: ruleInputHandler
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
                    // InternalComponentDefinition.g:1521:2: ( ruleRequestHandler )
                    {
                    // InternalComponentDefinition.g:1521:2: ( ruleRequestHandler )
                    // InternalComponentDefinition.g:1522:3: ruleRequestHandler
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
    // InternalComponentDefinition.g:1531:1: rule__ComponentPort__Alternatives : ( ( ruleInputPort ) | ( ruleAnswerPort ) | ( ruleOutputPort ) | ( ruleRequestPort ) );
    public final void rule__ComponentPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1535:1: ( ( ruleInputPort ) | ( ruleAnswerPort ) | ( ruleOutputPort ) | ( ruleRequestPort ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
                {
                switch ( input.LA(2) ) {
                case 29:
                    {
                    alt5=1;
                    }
                    break;
                case 26:
                    {
                    alt5=3;
                    }
                    break;
                case 28:
                    {
                    alt5=2;
                    }
                    break;
                case 24:
                    {
                    alt5=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }

                }
                break;
            case 29:
                {
                alt5=1;
                }
                break;
            case 28:
                {
                alt5=2;
                }
                break;
            case 26:
                {
                alt5=3;
                }
                break;
            case 24:
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
                    // InternalComponentDefinition.g:1536:2: ( ruleInputPort )
                    {
                    // InternalComponentDefinition.g:1536:2: ( ruleInputPort )
                    // InternalComponentDefinition.g:1537:3: ruleInputPort
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
                    // InternalComponentDefinition.g:1542:2: ( ruleAnswerPort )
                    {
                    // InternalComponentDefinition.g:1542:2: ( ruleAnswerPort )
                    // InternalComponentDefinition.g:1543:3: ruleAnswerPort
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
                    // InternalComponentDefinition.g:1548:2: ( ruleOutputPort )
                    {
                    // InternalComponentDefinition.g:1548:2: ( ruleOutputPort )
                    // InternalComponentDefinition.g:1549:3: ruleOutputPort
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
                    // InternalComponentDefinition.g:1554:2: ( ruleRequestPort )
                    {
                    // InternalComponentDefinition.g:1554:2: ( ruleRequestPort )
                    // InternalComponentDefinition.g:1555:3: ruleRequestPort
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
    // InternalComponentDefinition.g:1564:1: rule__AbstractComponentLink__Alternatives : ( ( ruleComponentSubNodeObserver ) | ( ruleRequestPortLink ) | ( ruleInputLinkExtension ) | ( ruleOpcUaClientLink ) | ( ruleMixedPortROSLink ) );
    public final void rule__AbstractComponentLink__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1568:1: ( ( ruleComponentSubNodeObserver ) | ( ruleRequestPortLink ) | ( ruleInputLinkExtension ) | ( ruleOpcUaClientLink ) | ( ruleMixedPortROSLink ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt6=1;
                }
                break;
            case 35:
                {
                alt6=2;
                }
                break;
            case 39:
                {
                alt6=3;
                }
                break;
            case 36:
                {
                alt6=4;
                }
                break;
            case 37:
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
                    // InternalComponentDefinition.g:1569:2: ( ruleComponentSubNodeObserver )
                    {
                    // InternalComponentDefinition.g:1569:2: ( ruleComponentSubNodeObserver )
                    // InternalComponentDefinition.g:1570:3: ruleComponentSubNodeObserver
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
                    // InternalComponentDefinition.g:1575:2: ( ruleRequestPortLink )
                    {
                    // InternalComponentDefinition.g:1575:2: ( ruleRequestPortLink )
                    // InternalComponentDefinition.g:1576:3: ruleRequestPortLink
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
                    // InternalComponentDefinition.g:1581:2: ( ruleInputLinkExtension )
                    {
                    // InternalComponentDefinition.g:1581:2: ( ruleInputLinkExtension )
                    // InternalComponentDefinition.g:1582:3: ruleInputLinkExtension
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
                    // InternalComponentDefinition.g:1587:2: ( ruleOpcUaClientLink )
                    {
                    // InternalComponentDefinition.g:1587:2: ( ruleOpcUaClientLink )
                    // InternalComponentDefinition.g:1588:3: ruleOpcUaClientLink
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
                    // InternalComponentDefinition.g:1593:2: ( ruleMixedPortROSLink )
                    {
                    // InternalComponentDefinition.g:1593:2: ( ruleMixedPortROSLink )
                    // InternalComponentDefinition.g:1594:3: ruleMixedPortROSLink
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
    // InternalComponentDefinition.g:1603:1: rule__ActivityExtension__Alternatives : ( ( ruleActivationConstraints ) | ( ruleOperationModeBinding ) | ( ruleDefaultTrigger ) );
    public final void rule__ActivityExtension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1607:1: ( ( ruleActivationConstraints ) | ( ruleOperationModeBinding ) | ( ruleDefaultTrigger ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 40:
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
                    // InternalComponentDefinition.g:1608:2: ( ruleActivationConstraints )
                    {
                    // InternalComponentDefinition.g:1608:2: ( ruleActivationConstraints )
                    // InternalComponentDefinition.g:1609:3: ruleActivationConstraints
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
                    // InternalComponentDefinition.g:1614:2: ( ruleOperationModeBinding )
                    {
                    // InternalComponentDefinition.g:1614:2: ( ruleOperationModeBinding )
                    // InternalComponentDefinition.g:1615:3: ruleOperationModeBinding
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
                    // InternalComponentDefinition.g:1620:2: ( ruleDefaultTrigger )
                    {
                    // InternalComponentDefinition.g:1620:2: ( ruleDefaultTrigger )
                    // InternalComponentDefinition.g:1621:3: ruleDefaultTrigger
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
    // InternalComponentDefinition.g:1630:1: rule__DefaultTrigger__Alternatives_1 : ( ( ruleDefaultInputTrigger ) | ( ruleDefaultPeriodicTimer ) | ( ruleDefaultObservedElementTrigger ) );
    public final void rule__DefaultTrigger__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1634:1: ( ( ruleDefaultInputTrigger ) | ( ruleDefaultPeriodicTimer ) | ( ruleDefaultObservedElementTrigger ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt8=1;
                }
                break;
            case 50:
                {
                alt8=2;
                }
                break;
            case 51:
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
                    // InternalComponentDefinition.g:1635:2: ( ruleDefaultInputTrigger )
                    {
                    // InternalComponentDefinition.g:1635:2: ( ruleDefaultInputTrigger )
                    // InternalComponentDefinition.g:1636:3: ruleDefaultInputTrigger
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
                    // InternalComponentDefinition.g:1641:2: ( ruleDefaultPeriodicTimer )
                    {
                    // InternalComponentDefinition.g:1641:2: ( ruleDefaultPeriodicTimer )
                    // InternalComponentDefinition.g:1642:3: ruleDefaultPeriodicTimer
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
                    // InternalComponentDefinition.g:1647:2: ( ruleDefaultObservedElementTrigger )
                    {
                    // InternalComponentDefinition.g:1647:2: ( ruleDefaultObservedElementTrigger )
                    // InternalComponentDefinition.g:1648:3: ruleDefaultObservedElementTrigger
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
    // InternalComponentDefinition.g:1657:1: rule__PlainOpcUaPort__Alternatives : ( ( ruleOpcUaDeviceClient ) | ( ruleOpcUaReadServer ) );
    public final void rule__PlainOpcUaPort__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1661:1: ( ( ruleOpcUaDeviceClient ) | ( ruleOpcUaReadServer ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==52) ) {
                alt9=1;
            }
            else if ( (LA9_0==56) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentDefinition.g:1662:2: ( ruleOpcUaDeviceClient )
                    {
                    // InternalComponentDefinition.g:1662:2: ( ruleOpcUaDeviceClient )
                    // InternalComponentDefinition.g:1663:3: ruleOpcUaDeviceClient
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
                    // InternalComponentDefinition.g:1668:2: ( ruleOpcUaReadServer )
                    {
                    // InternalComponentDefinition.g:1668:2: ( ruleOpcUaReadServer )
                    // InternalComponentDefinition.g:1669:3: ruleOpcUaReadServer
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
    // InternalComponentDefinition.g:1678:1: rule__AbstractCoordinationElement__Alternatives : ( ( rulePublicOperationMode ) | ( rulePrivateOperationMode ) | ( ruleCommunicationServiceUsageRealization ) | ( ruleSkillRealizationsRef ) );
    public final void rule__AbstractCoordinationElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1682:1: ( ( rulePublicOperationMode ) | ( rulePrivateOperationMode ) | ( ruleCommunicationServiceUsageRealization ) | ( ruleSkillRealizationsRef ) )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_DOCU_COMMENT:
            case 64:
            case 81:
                {
                alt10=1;
                }
                break;
            case 69:
                {
                alt10=2;
                }
                break;
            case 63:
                {
                alt10=3;
                }
                break;
            case 62:
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
                    // InternalComponentDefinition.g:1683:2: ( rulePublicOperationMode )
                    {
                    // InternalComponentDefinition.g:1683:2: ( rulePublicOperationMode )
                    // InternalComponentDefinition.g:1684:3: rulePublicOperationMode
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
                    // InternalComponentDefinition.g:1689:2: ( rulePrivateOperationMode )
                    {
                    // InternalComponentDefinition.g:1689:2: ( rulePrivateOperationMode )
                    // InternalComponentDefinition.g:1690:3: rulePrivateOperationMode
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
                    // InternalComponentDefinition.g:1695:2: ( ruleCommunicationServiceUsageRealization )
                    {
                    // InternalComponentDefinition.g:1695:2: ( ruleCommunicationServiceUsageRealization )
                    // InternalComponentDefinition.g:1696:3: ruleCommunicationServiceUsageRealization
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
                    // InternalComponentDefinition.g:1701:2: ( ruleSkillRealizationsRef )
                    {
                    // InternalComponentDefinition.g:1701:2: ( ruleSkillRealizationsRef )
                    // InternalComponentDefinition.g:1702:3: ruleSkillRealizationsRef
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
    // InternalComponentDefinition.g:1711:1: rule__RoboticMiddleware__Alternatives : ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) );
    public final void rule__RoboticMiddleware__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1715:1: ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 76:
                {
                alt11=1;
                }
                break;
            case 78:
                {
                alt11=2;
                }
                break;
            case 79:
                {
                alt11=3;
                }
                break;
            case 80:
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
                    // InternalComponentDefinition.g:1716:2: ( ruleACE_SmartSoft )
                    {
                    // InternalComponentDefinition.g:1716:2: ( ruleACE_SmartSoft )
                    // InternalComponentDefinition.g:1717:3: ruleACE_SmartSoft
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
                    // InternalComponentDefinition.g:1722:2: ( ruleOpcUa_SeRoNet )
                    {
                    // InternalComponentDefinition.g:1722:2: ( ruleOpcUa_SeRoNet )
                    // InternalComponentDefinition.g:1723:3: ruleOpcUa_SeRoNet
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
                    // InternalComponentDefinition.g:1728:2: ( ruleCORBA_SmartSoft )
                    {
                    // InternalComponentDefinition.g:1728:2: ( ruleCORBA_SmartSoft )
                    // InternalComponentDefinition.g:1729:3: ruleCORBA_SmartSoft
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
                    // InternalComponentDefinition.g:1734:2: ( ruleDDS_SmartSoft )
                    {
                    // InternalComponentDefinition.g:1734:2: ( ruleDDS_SmartSoft )
                    // InternalComponentDefinition.g:1735:3: ruleDDS_SmartSoft
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
    // InternalComponentDefinition.g:1744:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1748:1: ( ( 'E' ) | ( 'e' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            else if ( (LA12_0==15) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentDefinition.g:1749:2: ( 'E' )
                    {
                    // InternalComponentDefinition.g:1749:2: ( 'E' )
                    // InternalComponentDefinition.g:1750:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1755:2: ( 'e' )
                    {
                    // InternalComponentDefinition.g:1755:2: ( 'e' )
                    // InternalComponentDefinition.g:1756:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,15,FOLLOW_2); 
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
    // InternalComponentDefinition.g:1765:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1769:1: ( ( 'true' ) | ( 'false' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            else if ( (LA13_0==17) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentDefinition.g:1770:2: ( 'true' )
                    {
                    // InternalComponentDefinition.g:1770:2: ( 'true' )
                    // InternalComponentDefinition.g:1771:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,16,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:1776:2: ( 'false' )
                    {
                    // InternalComponentDefinition.g:1776:2: ( 'false' )
                    // InternalComponentDefinition.g:1777:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,17,FOLLOW_2); 
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
    // InternalComponentDefinition.g:1786:1: rule__ComponentDefModel__Group__0 : rule__ComponentDefModel__Group__0__Impl rule__ComponentDefModel__Group__1 ;
    public final void rule__ComponentDefModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1790:1: ( rule__ComponentDefModel__Group__0__Impl rule__ComponentDefModel__Group__1 )
            // InternalComponentDefinition.g:1791:2: rule__ComponentDefModel__Group__0__Impl rule__ComponentDefModel__Group__1
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
    // InternalComponentDefinition.g:1798:1: rule__ComponentDefModel__Group__0__Impl : ( () ) ;
    public final void rule__ComponentDefModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1802:1: ( ( () ) )
            // InternalComponentDefinition.g:1803:1: ( () )
            {
            // InternalComponentDefinition.g:1803:1: ( () )
            // InternalComponentDefinition.g:1804:2: ()
            {
             before(grammarAccess.getComponentDefModelAccess().getComponentDefModelAction_0()); 
            // InternalComponentDefinition.g:1805:2: ()
            // InternalComponentDefinition.g:1805:3: 
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
    // InternalComponentDefinition.g:1813:1: rule__ComponentDefModel__Group__1 : rule__ComponentDefModel__Group__1__Impl rule__ComponentDefModel__Group__2 ;
    public final void rule__ComponentDefModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1817:1: ( rule__ComponentDefModel__Group__1__Impl rule__ComponentDefModel__Group__2 )
            // InternalComponentDefinition.g:1818:2: rule__ComponentDefModel__Group__1__Impl rule__ComponentDefModel__Group__2
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
    // InternalComponentDefinition.g:1825:1: rule__ComponentDefModel__Group__1__Impl : ( ( rule__ComponentDefModel__ImportsAssignment_1 )* ) ;
    public final void rule__ComponentDefModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1829:1: ( ( ( rule__ComponentDefModel__ImportsAssignment_1 )* ) )
            // InternalComponentDefinition.g:1830:1: ( ( rule__ComponentDefModel__ImportsAssignment_1 )* )
            {
            // InternalComponentDefinition.g:1830:1: ( ( rule__ComponentDefModel__ImportsAssignment_1 )* )
            // InternalComponentDefinition.g:1831:2: ( rule__ComponentDefModel__ImportsAssignment_1 )*
            {
             before(grammarAccess.getComponentDefModelAccess().getImportsAssignment_1()); 
            // InternalComponentDefinition.g:1832:2: ( rule__ComponentDefModel__ImportsAssignment_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalComponentDefinition.g:1832:3: rule__ComponentDefModel__ImportsAssignment_1
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
    // InternalComponentDefinition.g:1840:1: rule__ComponentDefModel__Group__2 : rule__ComponentDefModel__Group__2__Impl ;
    public final void rule__ComponentDefModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1844:1: ( rule__ComponentDefModel__Group__2__Impl )
            // InternalComponentDefinition.g:1845:2: rule__ComponentDefModel__Group__2__Impl
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
    // InternalComponentDefinition.g:1851:1: rule__ComponentDefModel__Group__2__Impl : ( ( rule__ComponentDefModel__ComponentAssignment_2 )? ) ;
    public final void rule__ComponentDefModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1855:1: ( ( ( rule__ComponentDefModel__ComponentAssignment_2 )? ) )
            // InternalComponentDefinition.g:1856:1: ( ( rule__ComponentDefModel__ComponentAssignment_2 )? )
            {
            // InternalComponentDefinition.g:1856:1: ( ( rule__ComponentDefModel__ComponentAssignment_2 )? )
            // InternalComponentDefinition.g:1857:2: ( rule__ComponentDefModel__ComponentAssignment_2 )?
            {
             before(grammarAccess.getComponentDefModelAccess().getComponentAssignment_2()); 
            // InternalComponentDefinition.g:1858:2: ( rule__ComponentDefModel__ComponentAssignment_2 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DOCU_COMMENT||LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentDefinition.g:1858:3: rule__ComponentDefModel__ComponentAssignment_2
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
    // InternalComponentDefinition.g:1867:1: rule__ServiceRepoImport__Group__0 : rule__ServiceRepoImport__Group__0__Impl rule__ServiceRepoImport__Group__1 ;
    public final void rule__ServiceRepoImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1871:1: ( rule__ServiceRepoImport__Group__0__Impl rule__ServiceRepoImport__Group__1 )
            // InternalComponentDefinition.g:1872:2: rule__ServiceRepoImport__Group__0__Impl rule__ServiceRepoImport__Group__1
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
    // InternalComponentDefinition.g:1879:1: rule__ServiceRepoImport__Group__0__Impl : ( '#import' ) ;
    public final void rule__ServiceRepoImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1883:1: ( ( '#import' ) )
            // InternalComponentDefinition.g:1884:1: ( '#import' )
            {
            // InternalComponentDefinition.g:1884:1: ( '#import' )
            // InternalComponentDefinition.g:1885:2: '#import'
            {
             before(grammarAccess.getServiceRepoImportAccess().getImportKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalComponentDefinition.g:1894:1: rule__ServiceRepoImport__Group__1 : rule__ServiceRepoImport__Group__1__Impl rule__ServiceRepoImport__Group__2 ;
    public final void rule__ServiceRepoImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1898:1: ( rule__ServiceRepoImport__Group__1__Impl rule__ServiceRepoImport__Group__2 )
            // InternalComponentDefinition.g:1899:2: rule__ServiceRepoImport__Group__1__Impl rule__ServiceRepoImport__Group__2
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
    // InternalComponentDefinition.g:1906:1: rule__ServiceRepoImport__Group__1__Impl : ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__ServiceRepoImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1910:1: ( ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalComponentDefinition.g:1911:1: ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalComponentDefinition.g:1911:1: ( ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 ) )
            // InternalComponentDefinition.g:1912:2: ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getServiceRepoImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalComponentDefinition.g:1913:2: ( rule__ServiceRepoImport__ImportedNamespaceAssignment_1 )
            // InternalComponentDefinition.g:1913:3: rule__ServiceRepoImport__ImportedNamespaceAssignment_1
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
    // InternalComponentDefinition.g:1921:1: rule__ServiceRepoImport__Group__2 : rule__ServiceRepoImport__Group__2__Impl ;
    public final void rule__ServiceRepoImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1925:1: ( rule__ServiceRepoImport__Group__2__Impl )
            // InternalComponentDefinition.g:1926:2: rule__ServiceRepoImport__Group__2__Impl
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
    // InternalComponentDefinition.g:1932:1: rule__ServiceRepoImport__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ServiceRepoImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1936:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:1937:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:1937:1: ( ( ';' )? )
            // InternalComponentDefinition.g:1938:2: ( ';' )?
            {
             before(grammarAccess.getServiceRepoImportAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:1939:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentDefinition.g:1939:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:1948:1: rule__ComponentDefinition__Group__0 : rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 ;
    public final void rule__ComponentDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1952:1: ( rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1 )
            // InternalComponentDefinition.g:1953:2: rule__ComponentDefinition__Group__0__Impl rule__ComponentDefinition__Group__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalComponentDefinition.g:1960:1: rule__ComponentDefinition__Group__0__Impl : ( ( rule__ComponentDefinition__DocumentationAssignment_0 )? ) ;
    public final void rule__ComponentDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1964:1: ( ( ( rule__ComponentDefinition__DocumentationAssignment_0 )? ) )
            // InternalComponentDefinition.g:1965:1: ( ( rule__ComponentDefinition__DocumentationAssignment_0 )? )
            {
            // InternalComponentDefinition.g:1965:1: ( ( rule__ComponentDefinition__DocumentationAssignment_0 )? )
            // InternalComponentDefinition.g:1966:2: ( rule__ComponentDefinition__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getComponentDefinitionAccess().getDocumentationAssignment_0()); 
            // InternalComponentDefinition.g:1967:2: ( rule__ComponentDefinition__DocumentationAssignment_0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_DOCU_COMMENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentDefinition.g:1967:3: rule__ComponentDefinition__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDefinition__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentDefinitionAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:1975:1: rule__ComponentDefinition__Group__1 : rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 ;
    public final void rule__ComponentDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1979:1: ( rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2 )
            // InternalComponentDefinition.g:1980:2: rule__ComponentDefinition__Group__1__Impl rule__ComponentDefinition__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:1987:1: rule__ComponentDefinition__Group__1__Impl : ( 'ComponentDefinition' ) ;
    public final void rule__ComponentDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:1991:1: ( ( 'ComponentDefinition' ) )
            // InternalComponentDefinition.g:1992:1: ( 'ComponentDefinition' )
            {
            // InternalComponentDefinition.g:1992:1: ( 'ComponentDefinition' )
            // InternalComponentDefinition.g:1993:2: 'ComponentDefinition'
            {
             before(grammarAccess.getComponentDefinitionAccess().getComponentDefinitionKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getComponentDefinitionKeyword_1()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2002:1: rule__ComponentDefinition__Group__2 : rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3 ;
    public final void rule__ComponentDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2006:1: ( rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3 )
            // InternalComponentDefinition.g:2007:2: rule__ComponentDefinition__Group__2__Impl rule__ComponentDefinition__Group__3
            {
            pushFollow(FOLLOW_8);
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
    // InternalComponentDefinition.g:2014:1: rule__ComponentDefinition__Group__2__Impl : ( ( rule__ComponentDefinition__NameAssignment_2 ) ) ;
    public final void rule__ComponentDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2018:1: ( ( ( rule__ComponentDefinition__NameAssignment_2 ) ) )
            // InternalComponentDefinition.g:2019:1: ( ( rule__ComponentDefinition__NameAssignment_2 ) )
            {
            // InternalComponentDefinition.g:2019:1: ( ( rule__ComponentDefinition__NameAssignment_2 ) )
            // InternalComponentDefinition.g:2020:2: ( rule__ComponentDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getNameAssignment_2()); 
            // InternalComponentDefinition.g:2021:2: ( rule__ComponentDefinition__NameAssignment_2 )
            // InternalComponentDefinition.g:2021:3: rule__ComponentDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getComponentDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2029:1: rule__ComponentDefinition__Group__3 : rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4 ;
    public final void rule__ComponentDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2033:1: ( rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4 )
            // InternalComponentDefinition.g:2034:2: rule__ComponentDefinition__Group__3__Impl rule__ComponentDefinition__Group__4
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
    // InternalComponentDefinition.g:2041:1: rule__ComponentDefinition__Group__3__Impl : ( ( rule__ComponentDefinition__Group_3__0 )? ) ;
    public final void rule__ComponentDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2045:1: ( ( ( rule__ComponentDefinition__Group_3__0 )? ) )
            // InternalComponentDefinition.g:2046:1: ( ( rule__ComponentDefinition__Group_3__0 )? )
            {
            // InternalComponentDefinition.g:2046:1: ( ( rule__ComponentDefinition__Group_3__0 )? )
            // InternalComponentDefinition.g:2047:2: ( rule__ComponentDefinition__Group_3__0 )?
            {
             before(grammarAccess.getComponentDefinitionAccess().getGroup_3()); 
            // InternalComponentDefinition.g:2048:2: ( rule__ComponentDefinition__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==23) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentDefinition.g:2048:3: rule__ComponentDefinition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentDefinition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentDefinitionAccess().getGroup_3()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2056:1: rule__ComponentDefinition__Group__4 : rule__ComponentDefinition__Group__4__Impl rule__ComponentDefinition__Group__5 ;
    public final void rule__ComponentDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2060:1: ( rule__ComponentDefinition__Group__4__Impl rule__ComponentDefinition__Group__5 )
            // InternalComponentDefinition.g:2061:2: rule__ComponentDefinition__Group__4__Impl rule__ComponentDefinition__Group__5
            {
            pushFollow(FOLLOW_9);
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
    // InternalComponentDefinition.g:2068:1: rule__ComponentDefinition__Group__4__Impl : ( '{' ) ;
    public final void rule__ComponentDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2072:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2073:1: ( '{' )
            {
            // InternalComponentDefinition.g:2073:1: ( '{' )
            // InternalComponentDefinition.g:2074:2: '{'
            {
             before(grammarAccess.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2083:1: rule__ComponentDefinition__Group__5 : rule__ComponentDefinition__Group__5__Impl rule__ComponentDefinition__Group__6 ;
    public final void rule__ComponentDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2087:1: ( rule__ComponentDefinition__Group__5__Impl rule__ComponentDefinition__Group__6 )
            // InternalComponentDefinition.g:2088:2: rule__ComponentDefinition__Group__5__Impl rule__ComponentDefinition__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__ComponentDefinition__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__6();

            state._fsp--;


            }

        }
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
    // InternalComponentDefinition.g:2095:1: rule__ComponentDefinition__Group__5__Impl : ( ( rule__ComponentDefinition__ElementsAssignment_5 )* ) ;
    public final void rule__ComponentDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2099:1: ( ( ( rule__ComponentDefinition__ElementsAssignment_5 )* ) )
            // InternalComponentDefinition.g:2100:1: ( ( rule__ComponentDefinition__ElementsAssignment_5 )* )
            {
            // InternalComponentDefinition.g:2100:1: ( ( rule__ComponentDefinition__ElementsAssignment_5 )* )
            // InternalComponentDefinition.g:2101:2: ( rule__ComponentDefinition__ElementsAssignment_5 )*
            {
             before(grammarAccess.getComponentDefinitionAccess().getElementsAssignment_5()); 
            // InternalComponentDefinition.g:2102:2: ( rule__ComponentDefinition__ElementsAssignment_5 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_DOCU_COMMENT||LA19_0==24||LA19_0==26||(LA19_0>=28 && LA19_0<=29)||(LA19_0>=31 && LA19_0<=32)||LA19_0==34||LA19_0==52||LA19_0==56||(LA19_0>=59 && LA19_0<=61)||(LA19_0>=70 && LA19_0<=71)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalComponentDefinition.g:2102:3: rule__ComponentDefinition__ElementsAssignment_5
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__ComponentDefinition__ElementsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getComponentDefinitionAccess().getElementsAssignment_5()); 

            }


            }

        }
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


    // $ANTLR start "rule__ComponentDefinition__Group__6"
    // InternalComponentDefinition.g:2110:1: rule__ComponentDefinition__Group__6 : rule__ComponentDefinition__Group__6__Impl ;
    public final void rule__ComponentDefinition__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2114:1: ( rule__ComponentDefinition__Group__6__Impl )
            // InternalComponentDefinition.g:2115:2: rule__ComponentDefinition__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__6"


    // $ANTLR start "rule__ComponentDefinition__Group__6__Impl"
    // InternalComponentDefinition.g:2121:1: rule__ComponentDefinition__Group__6__Impl : ( '}' ) ;
    public final void rule__ComponentDefinition__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2125:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2126:1: ( '}' )
            {
            // InternalComponentDefinition.g:2126:1: ( '}' )
            // InternalComponentDefinition.g:2127:2: '}'
            {
             before(grammarAccess.getComponentDefinitionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group__6__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group_3__0"
    // InternalComponentDefinition.g:2137:1: rule__ComponentDefinition__Group_3__0 : rule__ComponentDefinition__Group_3__0__Impl rule__ComponentDefinition__Group_3__1 ;
    public final void rule__ComponentDefinition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2141:1: ( rule__ComponentDefinition__Group_3__0__Impl rule__ComponentDefinition__Group_3__1 )
            // InternalComponentDefinition.g:2142:2: rule__ComponentDefinition__Group_3__0__Impl rule__ComponentDefinition__Group_3__1
            {
            pushFollow(FOLLOW_11);
            rule__ComponentDefinition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group_3__0"


    // $ANTLR start "rule__ComponentDefinition__Group_3__0__Impl"
    // InternalComponentDefinition.g:2149:1: rule__ComponentDefinition__Group_3__0__Impl : ( 'logo' ) ;
    public final void rule__ComponentDefinition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2153:1: ( ( 'logo' ) )
            // InternalComponentDefinition.g:2154:1: ( 'logo' )
            {
            // InternalComponentDefinition.g:2154:1: ( 'logo' )
            // InternalComponentDefinition.g:2155:2: 'logo'
            {
             before(grammarAccess.getComponentDefinitionAccess().getLogoKeyword_3_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getLogoKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group_3__0__Impl"


    // $ANTLR start "rule__ComponentDefinition__Group_3__1"
    // InternalComponentDefinition.g:2164:1: rule__ComponentDefinition__Group_3__1 : rule__ComponentDefinition__Group_3__1__Impl ;
    public final void rule__ComponentDefinition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2168:1: ( rule__ComponentDefinition__Group_3__1__Impl )
            // InternalComponentDefinition.g:2169:2: rule__ComponentDefinition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group_3__1"


    // $ANTLR start "rule__ComponentDefinition__Group_3__1__Impl"
    // InternalComponentDefinition.g:2175:1: rule__ComponentDefinition__Group_3__1__Impl : ( ( rule__ComponentDefinition__LogoAssignment_3_1 ) ) ;
    public final void rule__ComponentDefinition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2179:1: ( ( ( rule__ComponentDefinition__LogoAssignment_3_1 ) ) )
            // InternalComponentDefinition.g:2180:1: ( ( rule__ComponentDefinition__LogoAssignment_3_1 ) )
            {
            // InternalComponentDefinition.g:2180:1: ( ( rule__ComponentDefinition__LogoAssignment_3_1 ) )
            // InternalComponentDefinition.g:2181:2: ( rule__ComponentDefinition__LogoAssignment_3_1 )
            {
             before(grammarAccess.getComponentDefinitionAccess().getLogoAssignment_3_1()); 
            // InternalComponentDefinition.g:2182:2: ( rule__ComponentDefinition__LogoAssignment_3_1 )
            // InternalComponentDefinition.g:2182:3: rule__ComponentDefinition__LogoAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentDefinition__LogoAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentDefinitionAccess().getLogoAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__Group_3__1__Impl"


    // $ANTLR start "rule__RequestPort__Group__0"
    // InternalComponentDefinition.g:2191:1: rule__RequestPort__Group__0 : rule__RequestPort__Group__0__Impl rule__RequestPort__Group__1 ;
    public final void rule__RequestPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2195:1: ( rule__RequestPort__Group__0__Impl rule__RequestPort__Group__1 )
            // InternalComponentDefinition.g:2196:2: rule__RequestPort__Group__0__Impl rule__RequestPort__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentDefinition.g:2203:1: rule__RequestPort__Group__0__Impl : ( ( rule__RequestPort__DocumentationAssignment_0 )? ) ;
    public final void rule__RequestPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2207:1: ( ( ( rule__RequestPort__DocumentationAssignment_0 )? ) )
            // InternalComponentDefinition.g:2208:1: ( ( rule__RequestPort__DocumentationAssignment_0 )? )
            {
            // InternalComponentDefinition.g:2208:1: ( ( rule__RequestPort__DocumentationAssignment_0 )? )
            // InternalComponentDefinition.g:2209:2: ( rule__RequestPort__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getRequestPortAccess().getDocumentationAssignment_0()); 
            // InternalComponentDefinition.g:2210:2: ( rule__RequestPort__DocumentationAssignment_0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_DOCU_COMMENT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentDefinition.g:2210:3: rule__RequestPort__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__RequestPort__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestPortAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2218:1: rule__RequestPort__Group__1 : rule__RequestPort__Group__1__Impl rule__RequestPort__Group__2 ;
    public final void rule__RequestPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2222:1: ( rule__RequestPort__Group__1__Impl rule__RequestPort__Group__2 )
            // InternalComponentDefinition.g:2223:2: rule__RequestPort__Group__1__Impl rule__RequestPort__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:2230:1: rule__RequestPort__Group__1__Impl : ( 'RequestPort' ) ;
    public final void rule__RequestPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2234:1: ( ( 'RequestPort' ) )
            // InternalComponentDefinition.g:2235:1: ( 'RequestPort' )
            {
            // InternalComponentDefinition.g:2235:1: ( 'RequestPort' )
            // InternalComponentDefinition.g:2236:2: 'RequestPort'
            {
             before(grammarAccess.getRequestPortAccess().getRequestPortKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getRequestPortAccess().getRequestPortKeyword_1()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2245:1: rule__RequestPort__Group__2 : rule__RequestPort__Group__2__Impl rule__RequestPort__Group__3 ;
    public final void rule__RequestPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2249:1: ( rule__RequestPort__Group__2__Impl rule__RequestPort__Group__3 )
            // InternalComponentDefinition.g:2250:2: rule__RequestPort__Group__2__Impl rule__RequestPort__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentDefinition.g:2257:1: rule__RequestPort__Group__2__Impl : ( ( rule__RequestPort__NameAssignment_2 ) ) ;
    public final void rule__RequestPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2261:1: ( ( ( rule__RequestPort__NameAssignment_2 ) ) )
            // InternalComponentDefinition.g:2262:1: ( ( rule__RequestPort__NameAssignment_2 ) )
            {
            // InternalComponentDefinition.g:2262:1: ( ( rule__RequestPort__NameAssignment_2 ) )
            // InternalComponentDefinition.g:2263:2: ( rule__RequestPort__NameAssignment_2 )
            {
             before(grammarAccess.getRequestPortAccess().getNameAssignment_2()); 
            // InternalComponentDefinition.g:2264:2: ( rule__RequestPort__NameAssignment_2 )
            // InternalComponentDefinition.g:2264:3: rule__RequestPort__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__RequestPort__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRequestPortAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2272:1: rule__RequestPort__Group__3 : rule__RequestPort__Group__3__Impl rule__RequestPort__Group__4 ;
    public final void rule__RequestPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2276:1: ( rule__RequestPort__Group__3__Impl rule__RequestPort__Group__4 )
            // InternalComponentDefinition.g:2277:2: rule__RequestPort__Group__3__Impl rule__RequestPort__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:2284:1: rule__RequestPort__Group__3__Impl : ( 'implements' ) ;
    public final void rule__RequestPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2288:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2289:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2289:1: ( 'implements' )
            // InternalComponentDefinition.g:2290:2: 'implements'
            {
             before(grammarAccess.getRequestPortAccess().getImplementsKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getRequestPortAccess().getImplementsKeyword_3()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2299:1: rule__RequestPort__Group__4 : rule__RequestPort__Group__4__Impl rule__RequestPort__Group__5 ;
    public final void rule__RequestPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2303:1: ( rule__RequestPort__Group__4__Impl rule__RequestPort__Group__5 )
            // InternalComponentDefinition.g:2304:2: rule__RequestPort__Group__4__Impl rule__RequestPort__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentDefinition.g:2311:1: rule__RequestPort__Group__4__Impl : ( ( rule__RequestPort__ServiceAssignment_4 ) ) ;
    public final void rule__RequestPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2315:1: ( ( ( rule__RequestPort__ServiceAssignment_4 ) ) )
            // InternalComponentDefinition.g:2316:1: ( ( rule__RequestPort__ServiceAssignment_4 ) )
            {
            // InternalComponentDefinition.g:2316:1: ( ( rule__RequestPort__ServiceAssignment_4 ) )
            // InternalComponentDefinition.g:2317:2: ( rule__RequestPort__ServiceAssignment_4 )
            {
             before(grammarAccess.getRequestPortAccess().getServiceAssignment_4()); 
            // InternalComponentDefinition.g:2318:2: ( rule__RequestPort__ServiceAssignment_4 )
            // InternalComponentDefinition.g:2318:3: rule__RequestPort__ServiceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__RequestPort__ServiceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRequestPortAccess().getServiceAssignment_4()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2326:1: rule__RequestPort__Group__5 : rule__RequestPort__Group__5__Impl rule__RequestPort__Group__6 ;
    public final void rule__RequestPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2330:1: ( rule__RequestPort__Group__5__Impl rule__RequestPort__Group__6 )
            // InternalComponentDefinition.g:2331:2: rule__RequestPort__Group__5__Impl rule__RequestPort__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentDefinition.g:2338:1: rule__RequestPort__Group__5__Impl : ( '{' ) ;
    public final void rule__RequestPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2342:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2343:1: ( '{' )
            {
            // InternalComponentDefinition.g:2343:1: ( '{' )
            // InternalComponentDefinition.g:2344:2: '{'
            {
             before(grammarAccess.getRequestPortAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getRequestPortAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2353:1: rule__RequestPort__Group__6 : rule__RequestPort__Group__6__Impl rule__RequestPort__Group__7 ;
    public final void rule__RequestPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2357:1: ( rule__RequestPort__Group__6__Impl rule__RequestPort__Group__7 )
            // InternalComponentDefinition.g:2358:2: rule__RequestPort__Group__6__Impl rule__RequestPort__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__RequestPort__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequestPort__Group__7();

            state._fsp--;


            }

        }
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
    // InternalComponentDefinition.g:2365:1: rule__RequestPort__Group__6__Impl : ( ( rule__RequestPort__ExtensionsAssignment_6 )* ) ;
    public final void rule__RequestPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2369:1: ( ( ( rule__RequestPort__ExtensionsAssignment_6 )* ) )
            // InternalComponentDefinition.g:2370:1: ( ( rule__RequestPort__ExtensionsAssignment_6 )* )
            {
            // InternalComponentDefinition.g:2370:1: ( ( rule__RequestPort__ExtensionsAssignment_6 )* )
            // InternalComponentDefinition.g:2371:2: ( rule__RequestPort__ExtensionsAssignment_6 )*
            {
             before(grammarAccess.getRequestPortAccess().getExtensionsAssignment_6()); 
            // InternalComponentDefinition.g:2372:2: ( rule__RequestPort__ExtensionsAssignment_6 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==30) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComponentDefinition.g:2372:3: rule__RequestPort__ExtensionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__RequestPort__ExtensionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getRequestPortAccess().getExtensionsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__RequestPort__Group__7"
    // InternalComponentDefinition.g:2380:1: rule__RequestPort__Group__7 : rule__RequestPort__Group__7__Impl ;
    public final void rule__RequestPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2384:1: ( rule__RequestPort__Group__7__Impl )
            // InternalComponentDefinition.g:2385:2: rule__RequestPort__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequestPort__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__7"


    // $ANTLR start "rule__RequestPort__Group__7__Impl"
    // InternalComponentDefinition.g:2391:1: rule__RequestPort__Group__7__Impl : ( '}' ) ;
    public final void rule__RequestPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2395:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2396:1: ( '}' )
            {
            // InternalComponentDefinition.g:2396:1: ( '}' )
            // InternalComponentDefinition.g:2397:2: '}'
            {
             before(grammarAccess.getRequestPortAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getRequestPortAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__Group__7__Impl"


    // $ANTLR start "rule__OutputPort__Group__0"
    // InternalComponentDefinition.g:2407:1: rule__OutputPort__Group__0 : rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 ;
    public final void rule__OutputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2411:1: ( rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1 )
            // InternalComponentDefinition.g:2412:2: rule__OutputPort__Group__0__Impl rule__OutputPort__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalComponentDefinition.g:2419:1: rule__OutputPort__Group__0__Impl : ( ( rule__OutputPort__DocumentationAssignment_0 )? ) ;
    public final void rule__OutputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2423:1: ( ( ( rule__OutputPort__DocumentationAssignment_0 )? ) )
            // InternalComponentDefinition.g:2424:1: ( ( rule__OutputPort__DocumentationAssignment_0 )? )
            {
            // InternalComponentDefinition.g:2424:1: ( ( rule__OutputPort__DocumentationAssignment_0 )? )
            // InternalComponentDefinition.g:2425:2: ( rule__OutputPort__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getOutputPortAccess().getDocumentationAssignment_0()); 
            // InternalComponentDefinition.g:2426:2: ( rule__OutputPort__DocumentationAssignment_0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_DOCU_COMMENT) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalComponentDefinition.g:2426:3: rule__OutputPort__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OutputPort__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOutputPortAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2434:1: rule__OutputPort__Group__1 : rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 ;
    public final void rule__OutputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2438:1: ( rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2 )
            // InternalComponentDefinition.g:2439:2: rule__OutputPort__Group__1__Impl rule__OutputPort__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:2446:1: rule__OutputPort__Group__1__Impl : ( 'OutputPort' ) ;
    public final void rule__OutputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2450:1: ( ( 'OutputPort' ) )
            // InternalComponentDefinition.g:2451:1: ( 'OutputPort' )
            {
            // InternalComponentDefinition.g:2451:1: ( 'OutputPort' )
            // InternalComponentDefinition.g:2452:2: 'OutputPort'
            {
             before(grammarAccess.getOutputPortAccess().getOutputPortKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getOutputPortKeyword_1()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2461:1: rule__OutputPort__Group__2 : rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 ;
    public final void rule__OutputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2465:1: ( rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3 )
            // InternalComponentDefinition.g:2466:2: rule__OutputPort__Group__2__Impl rule__OutputPort__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentDefinition.g:2473:1: rule__OutputPort__Group__2__Impl : ( ( rule__OutputPort__NameAssignment_2 ) ) ;
    public final void rule__OutputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2477:1: ( ( ( rule__OutputPort__NameAssignment_2 ) ) )
            // InternalComponentDefinition.g:2478:1: ( ( rule__OutputPort__NameAssignment_2 ) )
            {
            // InternalComponentDefinition.g:2478:1: ( ( rule__OutputPort__NameAssignment_2 ) )
            // InternalComponentDefinition.g:2479:2: ( rule__OutputPort__NameAssignment_2 )
            {
             before(grammarAccess.getOutputPortAccess().getNameAssignment_2()); 
            // InternalComponentDefinition.g:2480:2: ( rule__OutputPort__NameAssignment_2 )
            // InternalComponentDefinition.g:2480:3: rule__OutputPort__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2488:1: rule__OutputPort__Group__3 : rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 ;
    public final void rule__OutputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2492:1: ( rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4 )
            // InternalComponentDefinition.g:2493:2: rule__OutputPort__Group__3__Impl rule__OutputPort__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:2500:1: rule__OutputPort__Group__3__Impl : ( 'implements' ) ;
    public final void rule__OutputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2504:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2505:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2505:1: ( 'implements' )
            // InternalComponentDefinition.g:2506:2: 'implements'
            {
             before(grammarAccess.getOutputPortAccess().getImplementsKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getImplementsKeyword_3()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2515:1: rule__OutputPort__Group__4 : rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 ;
    public final void rule__OutputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2519:1: ( rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5 )
            // InternalComponentDefinition.g:2520:2: rule__OutputPort__Group__4__Impl rule__OutputPort__Group__5
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentDefinition.g:2527:1: rule__OutputPort__Group__4__Impl : ( ( rule__OutputPort__ServiceAssignment_4 ) ) ;
    public final void rule__OutputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2531:1: ( ( ( rule__OutputPort__ServiceAssignment_4 ) ) )
            // InternalComponentDefinition.g:2532:1: ( ( rule__OutputPort__ServiceAssignment_4 ) )
            {
            // InternalComponentDefinition.g:2532:1: ( ( rule__OutputPort__ServiceAssignment_4 ) )
            // InternalComponentDefinition.g:2533:2: ( rule__OutputPort__ServiceAssignment_4 )
            {
             before(grammarAccess.getOutputPortAccess().getServiceAssignment_4()); 
            // InternalComponentDefinition.g:2534:2: ( rule__OutputPort__ServiceAssignment_4 )
            // InternalComponentDefinition.g:2534:3: rule__OutputPort__ServiceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__ServiceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getServiceAssignment_4()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2542:1: rule__OutputPort__Group__5 : rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6 ;
    public final void rule__OutputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2546:1: ( rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6 )
            // InternalComponentDefinition.g:2547:2: rule__OutputPort__Group__5__Impl rule__OutputPort__Group__6
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:2554:1: rule__OutputPort__Group__5__Impl : ( 'realizedBy' ) ;
    public final void rule__OutputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2558:1: ( ( 'realizedBy' ) )
            // InternalComponentDefinition.g:2559:1: ( 'realizedBy' )
            {
            // InternalComponentDefinition.g:2559:1: ( 'realizedBy' )
            // InternalComponentDefinition.g:2560:2: 'realizedBy'
            {
             before(grammarAccess.getOutputPortAccess().getRealizedByKeyword_5()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getRealizedByKeyword_5()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2569:1: rule__OutputPort__Group__6 : rule__OutputPort__Group__6__Impl rule__OutputPort__Group__7 ;
    public final void rule__OutputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2573:1: ( rule__OutputPort__Group__6__Impl rule__OutputPort__Group__7 )
            // InternalComponentDefinition.g:2574:2: rule__OutputPort__Group__6__Impl rule__OutputPort__Group__7
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentDefinition.g:2581:1: rule__OutputPort__Group__6__Impl : ( ( rule__OutputPort__ActivityAssignment_6 ) ) ;
    public final void rule__OutputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2585:1: ( ( ( rule__OutputPort__ActivityAssignment_6 ) ) )
            // InternalComponentDefinition.g:2586:1: ( ( rule__OutputPort__ActivityAssignment_6 ) )
            {
            // InternalComponentDefinition.g:2586:1: ( ( rule__OutputPort__ActivityAssignment_6 ) )
            // InternalComponentDefinition.g:2587:2: ( rule__OutputPort__ActivityAssignment_6 )
            {
             before(grammarAccess.getOutputPortAccess().getActivityAssignment_6()); 
            // InternalComponentDefinition.g:2588:2: ( rule__OutputPort__ActivityAssignment_6 )
            // InternalComponentDefinition.g:2588:3: rule__OutputPort__ActivityAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__ActivityAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getOutputPortAccess().getActivityAssignment_6()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2596:1: rule__OutputPort__Group__7 : rule__OutputPort__Group__7__Impl rule__OutputPort__Group__8 ;
    public final void rule__OutputPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2600:1: ( rule__OutputPort__Group__7__Impl rule__OutputPort__Group__8 )
            // InternalComponentDefinition.g:2601:2: rule__OutputPort__Group__7__Impl rule__OutputPort__Group__8
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentDefinition.g:2608:1: rule__OutputPort__Group__7__Impl : ( '{' ) ;
    public final void rule__OutputPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2612:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2613:1: ( '{' )
            {
            // InternalComponentDefinition.g:2613:1: ( '{' )
            // InternalComponentDefinition.g:2614:2: '{'
            {
             before(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2623:1: rule__OutputPort__Group__8 : rule__OutputPort__Group__8__Impl rule__OutputPort__Group__9 ;
    public final void rule__OutputPort__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2627:1: ( rule__OutputPort__Group__8__Impl rule__OutputPort__Group__9 )
            // InternalComponentDefinition.g:2628:2: rule__OutputPort__Group__8__Impl rule__OutputPort__Group__9
            {
            pushFollow(FOLLOW_15);
            rule__OutputPort__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__9();

            state._fsp--;


            }

        }
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
    // InternalComponentDefinition.g:2635:1: rule__OutputPort__Group__8__Impl : ( ( rule__OutputPort__ExtensionsAssignment_8 )* ) ;
    public final void rule__OutputPort__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2639:1: ( ( ( rule__OutputPort__ExtensionsAssignment_8 )* ) )
            // InternalComponentDefinition.g:2640:1: ( ( rule__OutputPort__ExtensionsAssignment_8 )* )
            {
            // InternalComponentDefinition.g:2640:1: ( ( rule__OutputPort__ExtensionsAssignment_8 )* )
            // InternalComponentDefinition.g:2641:2: ( rule__OutputPort__ExtensionsAssignment_8 )*
            {
             before(grammarAccess.getOutputPortAccess().getExtensionsAssignment_8()); 
            // InternalComponentDefinition.g:2642:2: ( rule__OutputPort__ExtensionsAssignment_8 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==30) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalComponentDefinition.g:2642:3: rule__OutputPort__ExtensionsAssignment_8
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__OutputPort__ExtensionsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getOutputPortAccess().getExtensionsAssignment_8()); 

            }


            }

        }
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


    // $ANTLR start "rule__OutputPort__Group__9"
    // InternalComponentDefinition.g:2650:1: rule__OutputPort__Group__9 : rule__OutputPort__Group__9__Impl ;
    public final void rule__OutputPort__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2654:1: ( rule__OutputPort__Group__9__Impl )
            // InternalComponentDefinition.g:2655:2: rule__OutputPort__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OutputPort__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__9"


    // $ANTLR start "rule__OutputPort__Group__9__Impl"
    // InternalComponentDefinition.g:2661:1: rule__OutputPort__Group__9__Impl : ( '}' ) ;
    public final void rule__OutputPort__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2665:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2666:1: ( '}' )
            {
            // InternalComponentDefinition.g:2666:1: ( '}' )
            // InternalComponentDefinition.g:2667:2: '}'
            {
             before(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_9()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__Group__9__Impl"


    // $ANTLR start "rule__AnswerPort__Group__0"
    // InternalComponentDefinition.g:2677:1: rule__AnswerPort__Group__0 : rule__AnswerPort__Group__0__Impl rule__AnswerPort__Group__1 ;
    public final void rule__AnswerPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2681:1: ( rule__AnswerPort__Group__0__Impl rule__AnswerPort__Group__1 )
            // InternalComponentDefinition.g:2682:2: rule__AnswerPort__Group__0__Impl rule__AnswerPort__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentDefinition.g:2689:1: rule__AnswerPort__Group__0__Impl : ( ( rule__AnswerPort__DocumentationAssignment_0 )? ) ;
    public final void rule__AnswerPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2693:1: ( ( ( rule__AnswerPort__DocumentationAssignment_0 )? ) )
            // InternalComponentDefinition.g:2694:1: ( ( rule__AnswerPort__DocumentationAssignment_0 )? )
            {
            // InternalComponentDefinition.g:2694:1: ( ( rule__AnswerPort__DocumentationAssignment_0 )? )
            // InternalComponentDefinition.g:2695:2: ( rule__AnswerPort__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getAnswerPortAccess().getDocumentationAssignment_0()); 
            // InternalComponentDefinition.g:2696:2: ( rule__AnswerPort__DocumentationAssignment_0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_DOCU_COMMENT) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentDefinition.g:2696:3: rule__AnswerPort__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AnswerPort__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAnswerPortAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2704:1: rule__AnswerPort__Group__1 : rule__AnswerPort__Group__1__Impl rule__AnswerPort__Group__2 ;
    public final void rule__AnswerPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2708:1: ( rule__AnswerPort__Group__1__Impl rule__AnswerPort__Group__2 )
            // InternalComponentDefinition.g:2709:2: rule__AnswerPort__Group__1__Impl rule__AnswerPort__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:2716:1: rule__AnswerPort__Group__1__Impl : ( 'AnswerPort' ) ;
    public final void rule__AnswerPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2720:1: ( ( 'AnswerPort' ) )
            // InternalComponentDefinition.g:2721:1: ( 'AnswerPort' )
            {
            // InternalComponentDefinition.g:2721:1: ( 'AnswerPort' )
            // InternalComponentDefinition.g:2722:2: 'AnswerPort'
            {
             before(grammarAccess.getAnswerPortAccess().getAnswerPortKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getAnswerPortAccess().getAnswerPortKeyword_1()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2731:1: rule__AnswerPort__Group__2 : rule__AnswerPort__Group__2__Impl rule__AnswerPort__Group__3 ;
    public final void rule__AnswerPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2735:1: ( rule__AnswerPort__Group__2__Impl rule__AnswerPort__Group__3 )
            // InternalComponentDefinition.g:2736:2: rule__AnswerPort__Group__2__Impl rule__AnswerPort__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentDefinition.g:2743:1: rule__AnswerPort__Group__2__Impl : ( ( rule__AnswerPort__NameAssignment_2 ) ) ;
    public final void rule__AnswerPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2747:1: ( ( ( rule__AnswerPort__NameAssignment_2 ) ) )
            // InternalComponentDefinition.g:2748:1: ( ( rule__AnswerPort__NameAssignment_2 ) )
            {
            // InternalComponentDefinition.g:2748:1: ( ( rule__AnswerPort__NameAssignment_2 ) )
            // InternalComponentDefinition.g:2749:2: ( rule__AnswerPort__NameAssignment_2 )
            {
             before(grammarAccess.getAnswerPortAccess().getNameAssignment_2()); 
            // InternalComponentDefinition.g:2750:2: ( rule__AnswerPort__NameAssignment_2 )
            // InternalComponentDefinition.g:2750:3: rule__AnswerPort__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AnswerPort__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAnswerPortAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2758:1: rule__AnswerPort__Group__3 : rule__AnswerPort__Group__3__Impl rule__AnswerPort__Group__4 ;
    public final void rule__AnswerPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2762:1: ( rule__AnswerPort__Group__3__Impl rule__AnswerPort__Group__4 )
            // InternalComponentDefinition.g:2763:2: rule__AnswerPort__Group__3__Impl rule__AnswerPort__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:2770:1: rule__AnswerPort__Group__3__Impl : ( 'implements' ) ;
    public final void rule__AnswerPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2774:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2775:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2775:1: ( 'implements' )
            // InternalComponentDefinition.g:2776:2: 'implements'
            {
             before(grammarAccess.getAnswerPortAccess().getImplementsKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAnswerPortAccess().getImplementsKeyword_3()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2785:1: rule__AnswerPort__Group__4 : rule__AnswerPort__Group__4__Impl rule__AnswerPort__Group__5 ;
    public final void rule__AnswerPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2789:1: ( rule__AnswerPort__Group__4__Impl rule__AnswerPort__Group__5 )
            // InternalComponentDefinition.g:2790:2: rule__AnswerPort__Group__4__Impl rule__AnswerPort__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentDefinition.g:2797:1: rule__AnswerPort__Group__4__Impl : ( ( rule__AnswerPort__ServiceAssignment_4 ) ) ;
    public final void rule__AnswerPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2801:1: ( ( ( rule__AnswerPort__ServiceAssignment_4 ) ) )
            // InternalComponentDefinition.g:2802:1: ( ( rule__AnswerPort__ServiceAssignment_4 ) )
            {
            // InternalComponentDefinition.g:2802:1: ( ( rule__AnswerPort__ServiceAssignment_4 ) )
            // InternalComponentDefinition.g:2803:2: ( rule__AnswerPort__ServiceAssignment_4 )
            {
             before(grammarAccess.getAnswerPortAccess().getServiceAssignment_4()); 
            // InternalComponentDefinition.g:2804:2: ( rule__AnswerPort__ServiceAssignment_4 )
            // InternalComponentDefinition.g:2804:3: rule__AnswerPort__ServiceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__AnswerPort__ServiceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAnswerPortAccess().getServiceAssignment_4()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2812:1: rule__AnswerPort__Group__5 : rule__AnswerPort__Group__5__Impl rule__AnswerPort__Group__6 ;
    public final void rule__AnswerPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2816:1: ( rule__AnswerPort__Group__5__Impl rule__AnswerPort__Group__6 )
            // InternalComponentDefinition.g:2817:2: rule__AnswerPort__Group__5__Impl rule__AnswerPort__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentDefinition.g:2824:1: rule__AnswerPort__Group__5__Impl : ( '{' ) ;
    public final void rule__AnswerPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2828:1: ( ( '{' ) )
            // InternalComponentDefinition.g:2829:1: ( '{' )
            {
            // InternalComponentDefinition.g:2829:1: ( '{' )
            // InternalComponentDefinition.g:2830:2: '{'
            {
             before(grammarAccess.getAnswerPortAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAnswerPortAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2839:1: rule__AnswerPort__Group__6 : rule__AnswerPort__Group__6__Impl rule__AnswerPort__Group__7 ;
    public final void rule__AnswerPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2843:1: ( rule__AnswerPort__Group__6__Impl rule__AnswerPort__Group__7 )
            // InternalComponentDefinition.g:2844:2: rule__AnswerPort__Group__6__Impl rule__AnswerPort__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__AnswerPort__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AnswerPort__Group__7();

            state._fsp--;


            }

        }
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
    // InternalComponentDefinition.g:2851:1: rule__AnswerPort__Group__6__Impl : ( ( rule__AnswerPort__ExtensionsAssignment_6 )* ) ;
    public final void rule__AnswerPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2855:1: ( ( ( rule__AnswerPort__ExtensionsAssignment_6 )* ) )
            // InternalComponentDefinition.g:2856:1: ( ( rule__AnswerPort__ExtensionsAssignment_6 )* )
            {
            // InternalComponentDefinition.g:2856:1: ( ( rule__AnswerPort__ExtensionsAssignment_6 )* )
            // InternalComponentDefinition.g:2857:2: ( rule__AnswerPort__ExtensionsAssignment_6 )*
            {
             before(grammarAccess.getAnswerPortAccess().getExtensionsAssignment_6()); 
            // InternalComponentDefinition.g:2858:2: ( rule__AnswerPort__ExtensionsAssignment_6 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==30) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalComponentDefinition.g:2858:3: rule__AnswerPort__ExtensionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__AnswerPort__ExtensionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getAnswerPortAccess().getExtensionsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__AnswerPort__Group__7"
    // InternalComponentDefinition.g:2866:1: rule__AnswerPort__Group__7 : rule__AnswerPort__Group__7__Impl ;
    public final void rule__AnswerPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2870:1: ( rule__AnswerPort__Group__7__Impl )
            // InternalComponentDefinition.g:2871:2: rule__AnswerPort__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AnswerPort__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__7"


    // $ANTLR start "rule__AnswerPort__Group__7__Impl"
    // InternalComponentDefinition.g:2877:1: rule__AnswerPort__Group__7__Impl : ( '}' ) ;
    public final void rule__AnswerPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2881:1: ( ( '}' ) )
            // InternalComponentDefinition.g:2882:1: ( '}' )
            {
            // InternalComponentDefinition.g:2882:1: ( '}' )
            // InternalComponentDefinition.g:2883:2: '}'
            {
             before(grammarAccess.getAnswerPortAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAnswerPortAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__Group__7__Impl"


    // $ANTLR start "rule__InputPort__Group__0"
    // InternalComponentDefinition.g:2893:1: rule__InputPort__Group__0 : rule__InputPort__Group__0__Impl rule__InputPort__Group__1 ;
    public final void rule__InputPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2897:1: ( rule__InputPort__Group__0__Impl rule__InputPort__Group__1 )
            // InternalComponentDefinition.g:2898:2: rule__InputPort__Group__0__Impl rule__InputPort__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentDefinition.g:2905:1: rule__InputPort__Group__0__Impl : ( ( rule__InputPort__DocumentationAssignment_0 )? ) ;
    public final void rule__InputPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2909:1: ( ( ( rule__InputPort__DocumentationAssignment_0 )? ) )
            // InternalComponentDefinition.g:2910:1: ( ( rule__InputPort__DocumentationAssignment_0 )? )
            {
            // InternalComponentDefinition.g:2910:1: ( ( rule__InputPort__DocumentationAssignment_0 )? )
            // InternalComponentDefinition.g:2911:2: ( rule__InputPort__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getInputPortAccess().getDocumentationAssignment_0()); 
            // InternalComponentDefinition.g:2912:2: ( rule__InputPort__DocumentationAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_DOCU_COMMENT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentDefinition.g:2912:3: rule__InputPort__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__InputPort__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getInputPortAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2920:1: rule__InputPort__Group__1 : rule__InputPort__Group__1__Impl rule__InputPort__Group__2 ;
    public final void rule__InputPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2924:1: ( rule__InputPort__Group__1__Impl rule__InputPort__Group__2 )
            // InternalComponentDefinition.g:2925:2: rule__InputPort__Group__1__Impl rule__InputPort__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:2932:1: rule__InputPort__Group__1__Impl : ( 'InputPort' ) ;
    public final void rule__InputPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2936:1: ( ( 'InputPort' ) )
            // InternalComponentDefinition.g:2937:1: ( 'InputPort' )
            {
            // InternalComponentDefinition.g:2937:1: ( 'InputPort' )
            // InternalComponentDefinition.g:2938:2: 'InputPort'
            {
             before(grammarAccess.getInputPortAccess().getInputPortKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getInputPortKeyword_1()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2947:1: rule__InputPort__Group__2 : rule__InputPort__Group__2__Impl rule__InputPort__Group__3 ;
    public final void rule__InputPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2951:1: ( rule__InputPort__Group__2__Impl rule__InputPort__Group__3 )
            // InternalComponentDefinition.g:2952:2: rule__InputPort__Group__2__Impl rule__InputPort__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentDefinition.g:2959:1: rule__InputPort__Group__2__Impl : ( ( rule__InputPort__NameAssignment_2 ) ) ;
    public final void rule__InputPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2963:1: ( ( ( rule__InputPort__NameAssignment_2 ) ) )
            // InternalComponentDefinition.g:2964:1: ( ( rule__InputPort__NameAssignment_2 ) )
            {
            // InternalComponentDefinition.g:2964:1: ( ( rule__InputPort__NameAssignment_2 ) )
            // InternalComponentDefinition.g:2965:2: ( rule__InputPort__NameAssignment_2 )
            {
             before(grammarAccess.getInputPortAccess().getNameAssignment_2()); 
            // InternalComponentDefinition.g:2966:2: ( rule__InputPort__NameAssignment_2 )
            // InternalComponentDefinition.g:2966:3: rule__InputPort__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:2974:1: rule__InputPort__Group__3 : rule__InputPort__Group__3__Impl rule__InputPort__Group__4 ;
    public final void rule__InputPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2978:1: ( rule__InputPort__Group__3__Impl rule__InputPort__Group__4 )
            // InternalComponentDefinition.g:2979:2: rule__InputPort__Group__3__Impl rule__InputPort__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:2986:1: rule__InputPort__Group__3__Impl : ( 'implements' ) ;
    public final void rule__InputPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:2990:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:2991:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:2991:1: ( 'implements' )
            // InternalComponentDefinition.g:2992:2: 'implements'
            {
             before(grammarAccess.getInputPortAccess().getImplementsKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getImplementsKeyword_3()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:3001:1: rule__InputPort__Group__4 : rule__InputPort__Group__4__Impl rule__InputPort__Group__5 ;
    public final void rule__InputPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3005:1: ( rule__InputPort__Group__4__Impl rule__InputPort__Group__5 )
            // InternalComponentDefinition.g:3006:2: rule__InputPort__Group__4__Impl rule__InputPort__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentDefinition.g:3013:1: rule__InputPort__Group__4__Impl : ( ( rule__InputPort__ServiceAssignment_4 ) ) ;
    public final void rule__InputPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3017:1: ( ( ( rule__InputPort__ServiceAssignment_4 ) ) )
            // InternalComponentDefinition.g:3018:1: ( ( rule__InputPort__ServiceAssignment_4 ) )
            {
            // InternalComponentDefinition.g:3018:1: ( ( rule__InputPort__ServiceAssignment_4 ) )
            // InternalComponentDefinition.g:3019:2: ( rule__InputPort__ServiceAssignment_4 )
            {
             before(grammarAccess.getInputPortAccess().getServiceAssignment_4()); 
            // InternalComponentDefinition.g:3020:2: ( rule__InputPort__ServiceAssignment_4 )
            // InternalComponentDefinition.g:3020:3: rule__InputPort__ServiceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__ServiceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getInputPortAccess().getServiceAssignment_4()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:3028:1: rule__InputPort__Group__5 : rule__InputPort__Group__5__Impl rule__InputPort__Group__6 ;
    public final void rule__InputPort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3032:1: ( rule__InputPort__Group__5__Impl rule__InputPort__Group__6 )
            // InternalComponentDefinition.g:3033:2: rule__InputPort__Group__5__Impl rule__InputPort__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentDefinition.g:3040:1: rule__InputPort__Group__5__Impl : ( '{' ) ;
    public final void rule__InputPort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3044:1: ( ( '{' ) )
            // InternalComponentDefinition.g:3045:1: ( '{' )
            {
            // InternalComponentDefinition.g:3045:1: ( '{' )
            // InternalComponentDefinition.g:3046:2: '{'
            {
             before(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:3055:1: rule__InputPort__Group__6 : rule__InputPort__Group__6__Impl rule__InputPort__Group__7 ;
    public final void rule__InputPort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3059:1: ( rule__InputPort__Group__6__Impl rule__InputPort__Group__7 )
            // InternalComponentDefinition.g:3060:2: rule__InputPort__Group__6__Impl rule__InputPort__Group__7
            {
            pushFollow(FOLLOW_15);
            rule__InputPort__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputPort__Group__7();

            state._fsp--;


            }

        }
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
    // InternalComponentDefinition.g:3067:1: rule__InputPort__Group__6__Impl : ( ( rule__InputPort__ExtensionsAssignment_6 )* ) ;
    public final void rule__InputPort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3071:1: ( ( ( rule__InputPort__ExtensionsAssignment_6 )* ) )
            // InternalComponentDefinition.g:3072:1: ( ( rule__InputPort__ExtensionsAssignment_6 )* )
            {
            // InternalComponentDefinition.g:3072:1: ( ( rule__InputPort__ExtensionsAssignment_6 )* )
            // InternalComponentDefinition.g:3073:2: ( rule__InputPort__ExtensionsAssignment_6 )*
            {
             before(grammarAccess.getInputPortAccess().getExtensionsAssignment_6()); 
            // InternalComponentDefinition.g:3074:2: ( rule__InputPort__ExtensionsAssignment_6 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalComponentDefinition.g:3074:3: rule__InputPort__ExtensionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__InputPort__ExtensionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getInputPortAccess().getExtensionsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__InputPort__Group__7"
    // InternalComponentDefinition.g:3082:1: rule__InputPort__Group__7 : rule__InputPort__Group__7__Impl ;
    public final void rule__InputPort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3086:1: ( rule__InputPort__Group__7__Impl )
            // InternalComponentDefinition.g:3087:2: rule__InputPort__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputPort__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__7"


    // $ANTLR start "rule__InputPort__Group__7__Impl"
    // InternalComponentDefinition.g:3093:1: rule__InputPort__Group__7__Impl : ( '}' ) ;
    public final void rule__InputPort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3097:1: ( ( '}' ) )
            // InternalComponentDefinition.g:3098:1: ( '}' )
            {
            // InternalComponentDefinition.g:3098:1: ( '}' )
            // InternalComponentDefinition.g:3099:2: '}'
            {
             before(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__Group__7__Impl"


    // $ANTLR start "rule__SupportedMiddleware__Group__0"
    // InternalComponentDefinition.g:3109:1: rule__SupportedMiddleware__Group__0 : rule__SupportedMiddleware__Group__0__Impl rule__SupportedMiddleware__Group__1 ;
    public final void rule__SupportedMiddleware__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3113:1: ( rule__SupportedMiddleware__Group__0__Impl rule__SupportedMiddleware__Group__1 )
            // InternalComponentDefinition.g:3114:2: rule__SupportedMiddleware__Group__0__Impl rule__SupportedMiddleware__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentDefinition.g:3121:1: rule__SupportedMiddleware__Group__0__Impl : ( 'SupportedMiddleware' ) ;
    public final void rule__SupportedMiddleware__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3125:1: ( ( 'SupportedMiddleware' ) )
            // InternalComponentDefinition.g:3126:1: ( 'SupportedMiddleware' )
            {
            // InternalComponentDefinition.g:3126:1: ( 'SupportedMiddleware' )
            // InternalComponentDefinition.g:3127:2: 'SupportedMiddleware'
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getSupportedMiddlewareKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3136:1: rule__SupportedMiddleware__Group__1 : rule__SupportedMiddleware__Group__1__Impl rule__SupportedMiddleware__Group__2 ;
    public final void rule__SupportedMiddleware__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3140:1: ( rule__SupportedMiddleware__Group__1__Impl rule__SupportedMiddleware__Group__2 )
            // InternalComponentDefinition.g:3141:2: rule__SupportedMiddleware__Group__1__Impl rule__SupportedMiddleware__Group__2
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentDefinition.g:3148:1: rule__SupportedMiddleware__Group__1__Impl : ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? ) ;
    public final void rule__SupportedMiddleware__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3152:1: ( ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? ) )
            // InternalComponentDefinition.g:3153:1: ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? )
            {
            // InternalComponentDefinition.g:3153:1: ( ( rule__SupportedMiddleware__DefaultAssignment_1 )? )
            // InternalComponentDefinition.g:3154:2: ( rule__SupportedMiddleware__DefaultAssignment_1 )?
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getDefaultAssignment_1()); 
            // InternalComponentDefinition.g:3155:2: ( rule__SupportedMiddleware__DefaultAssignment_1 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==81) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalComponentDefinition.g:3155:3: rule__SupportedMiddleware__DefaultAssignment_1
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
    // InternalComponentDefinition.g:3163:1: rule__SupportedMiddleware__Group__2 : rule__SupportedMiddleware__Group__2__Impl rule__SupportedMiddleware__Group__3 ;
    public final void rule__SupportedMiddleware__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3167:1: ( rule__SupportedMiddleware__Group__2__Impl rule__SupportedMiddleware__Group__3 )
            // InternalComponentDefinition.g:3168:2: rule__SupportedMiddleware__Group__2__Impl rule__SupportedMiddleware__Group__3
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
    // InternalComponentDefinition.g:3175:1: rule__SupportedMiddleware__Group__2__Impl : ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) ) ;
    public final void rule__SupportedMiddleware__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3179:1: ( ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) ) )
            // InternalComponentDefinition.g:3180:1: ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) )
            {
            // InternalComponentDefinition.g:3180:1: ( ( rule__SupportedMiddleware__MiddlewareAssignment_2 ) )
            // InternalComponentDefinition.g:3181:2: ( rule__SupportedMiddleware__MiddlewareAssignment_2 )
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getMiddlewareAssignment_2()); 
            // InternalComponentDefinition.g:3182:2: ( rule__SupportedMiddleware__MiddlewareAssignment_2 )
            // InternalComponentDefinition.g:3182:3: rule__SupportedMiddleware__MiddlewareAssignment_2
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
    // InternalComponentDefinition.g:3190:1: rule__SupportedMiddleware__Group__3 : rule__SupportedMiddleware__Group__3__Impl ;
    public final void rule__SupportedMiddleware__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3194:1: ( rule__SupportedMiddleware__Group__3__Impl )
            // InternalComponentDefinition.g:3195:2: rule__SupportedMiddleware__Group__3__Impl
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
    // InternalComponentDefinition.g:3201:1: rule__SupportedMiddleware__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__SupportedMiddleware__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3205:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:3206:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:3206:1: ( ( ';' )? )
            // InternalComponentDefinition.g:3207:2: ( ';' )?
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getSemicolonKeyword_3()); 
            // InternalComponentDefinition.g:3208:2: ( ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalComponentDefinition.g:3208:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:3217:1: rule__Activity__Group__0 : rule__Activity__Group__0__Impl rule__Activity__Group__1 ;
    public final void rule__Activity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3221:1: ( rule__Activity__Group__0__Impl rule__Activity__Group__1 )
            // InternalComponentDefinition.g:3222:2: rule__Activity__Group__0__Impl rule__Activity__Group__1
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
    // InternalComponentDefinition.g:3229:1: rule__Activity__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__Activity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3233:1: ( ( 'Activity' ) )
            // InternalComponentDefinition.g:3234:1: ( 'Activity' )
            {
            // InternalComponentDefinition.g:3234:1: ( 'Activity' )
            // InternalComponentDefinition.g:3235:2: 'Activity'
            {
             before(grammarAccess.getActivityAccess().getActivityKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3244:1: rule__Activity__Group__1 : rule__Activity__Group__1__Impl rule__Activity__Group__2 ;
    public final void rule__Activity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3248:1: ( rule__Activity__Group__1__Impl rule__Activity__Group__2 )
            // InternalComponentDefinition.g:3249:2: rule__Activity__Group__1__Impl rule__Activity__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentDefinition.g:3256:1: rule__Activity__Group__1__Impl : ( ( rule__Activity__NameAssignment_1 ) ) ;
    public final void rule__Activity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3260:1: ( ( ( rule__Activity__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:3261:1: ( ( rule__Activity__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3261:1: ( ( rule__Activity__NameAssignment_1 ) )
            // InternalComponentDefinition.g:3262:2: ( rule__Activity__NameAssignment_1 )
            {
             before(grammarAccess.getActivityAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:3263:2: ( rule__Activity__NameAssignment_1 )
            // InternalComponentDefinition.g:3263:3: rule__Activity__NameAssignment_1
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
    // InternalComponentDefinition.g:3271:1: rule__Activity__Group__2 : rule__Activity__Group__2__Impl rule__Activity__Group__3 ;
    public final void rule__Activity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3275:1: ( rule__Activity__Group__2__Impl rule__Activity__Group__3 )
            // InternalComponentDefinition.g:3276:2: rule__Activity__Group__2__Impl rule__Activity__Group__3
            {
            pushFollow(FOLLOW_22);
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
    // InternalComponentDefinition.g:3283:1: rule__Activity__Group__2__Impl : ( '{' ) ;
    public final void rule__Activity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3287:1: ( ( '{' ) )
            // InternalComponentDefinition.g:3288:1: ( '{' )
            {
            // InternalComponentDefinition.g:3288:1: ( '{' )
            // InternalComponentDefinition.g:3289:2: '{'
            {
             before(grammarAccess.getActivityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3298:1: rule__Activity__Group__3 : rule__Activity__Group__3__Impl rule__Activity__Group__4 ;
    public final void rule__Activity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3302:1: ( rule__Activity__Group__3__Impl rule__Activity__Group__4 )
            // InternalComponentDefinition.g:3303:2: rule__Activity__Group__3__Impl rule__Activity__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalComponentDefinition.g:3310:1: rule__Activity__Group__3__Impl : ( ( rule__Activity__LinksAssignment_3 )* ) ;
    public final void rule__Activity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3314:1: ( ( ( rule__Activity__LinksAssignment_3 )* ) )
            // InternalComponentDefinition.g:3315:1: ( ( rule__Activity__LinksAssignment_3 )* )
            {
            // InternalComponentDefinition.g:3315:1: ( ( rule__Activity__LinksAssignment_3 )* )
            // InternalComponentDefinition.g:3316:2: ( rule__Activity__LinksAssignment_3 )*
            {
             before(grammarAccess.getActivityAccess().getLinksAssignment_3()); 
            // InternalComponentDefinition.g:3317:2: ( rule__Activity__LinksAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=35 && LA30_0<=39)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalComponentDefinition.g:3317:3: rule__Activity__LinksAssignment_3
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__Activity__LinksAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // InternalComponentDefinition.g:3325:1: rule__Activity__Group__4 : rule__Activity__Group__4__Impl rule__Activity__Group__5 ;
    public final void rule__Activity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3329:1: ( rule__Activity__Group__4__Impl rule__Activity__Group__5 )
            // InternalComponentDefinition.g:3330:2: rule__Activity__Group__4__Impl rule__Activity__Group__5
            {
            pushFollow(FOLLOW_22);
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
    // InternalComponentDefinition.g:3337:1: rule__Activity__Group__4__Impl : ( ( rule__Activity__ExtensionsAssignment_4 )* ) ;
    public final void rule__Activity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3341:1: ( ( ( rule__Activity__ExtensionsAssignment_4 )* ) )
            // InternalComponentDefinition.g:3342:1: ( ( rule__Activity__ExtensionsAssignment_4 )* )
            {
            // InternalComponentDefinition.g:3342:1: ( ( rule__Activity__ExtensionsAssignment_4 )* )
            // InternalComponentDefinition.g:3343:2: ( rule__Activity__ExtensionsAssignment_4 )*
            {
             before(grammarAccess.getActivityAccess().getExtensionsAssignment_4()); 
            // InternalComponentDefinition.g:3344:2: ( rule__Activity__ExtensionsAssignment_4 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==40||(LA31_0>=46 && LA31_0<=47)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalComponentDefinition.g:3344:3: rule__Activity__ExtensionsAssignment_4
            	    {
            	    pushFollow(FOLLOW_24);
            	    rule__Activity__ExtensionsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // InternalComponentDefinition.g:3352:1: rule__Activity__Group__5 : rule__Activity__Group__5__Impl ;
    public final void rule__Activity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3356:1: ( rule__Activity__Group__5__Impl )
            // InternalComponentDefinition.g:3357:2: rule__Activity__Group__5__Impl
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
    // InternalComponentDefinition.g:3363:1: rule__Activity__Group__5__Impl : ( '}' ) ;
    public final void rule__Activity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3367:1: ( ( '}' ) )
            // InternalComponentDefinition.g:3368:1: ( '}' )
            {
            // InternalComponentDefinition.g:3368:1: ( '}' )
            // InternalComponentDefinition.g:3369:2: '}'
            {
             before(grammarAccess.getActivityAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3379:1: rule__InputHandler__Group__0 : rule__InputHandler__Group__0__Impl rule__InputHandler__Group__1 ;
    public final void rule__InputHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3383:1: ( rule__InputHandler__Group__0__Impl rule__InputHandler__Group__1 )
            // InternalComponentDefinition.g:3384:2: rule__InputHandler__Group__0__Impl rule__InputHandler__Group__1
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
    // InternalComponentDefinition.g:3391:1: rule__InputHandler__Group__0__Impl : ( 'InputHandler' ) ;
    public final void rule__InputHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3395:1: ( ( 'InputHandler' ) )
            // InternalComponentDefinition.g:3396:1: ( 'InputHandler' )
            {
            // InternalComponentDefinition.g:3396:1: ( 'InputHandler' )
            // InternalComponentDefinition.g:3397:2: 'InputHandler'
            {
             before(grammarAccess.getInputHandlerAccess().getInputHandlerKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3406:1: rule__InputHandler__Group__1 : rule__InputHandler__Group__1__Impl rule__InputHandler__Group__2 ;
    public final void rule__InputHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3410:1: ( rule__InputHandler__Group__1__Impl rule__InputHandler__Group__2 )
            // InternalComponentDefinition.g:3411:2: rule__InputHandler__Group__1__Impl rule__InputHandler__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalComponentDefinition.g:3418:1: rule__InputHandler__Group__1__Impl : ( ( rule__InputHandler__NameAssignment_1 ) ) ;
    public final void rule__InputHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3422:1: ( ( ( rule__InputHandler__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:3423:1: ( ( rule__InputHandler__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3423:1: ( ( rule__InputHandler__NameAssignment_1 ) )
            // InternalComponentDefinition.g:3424:2: ( rule__InputHandler__NameAssignment_1 )
            {
             before(grammarAccess.getInputHandlerAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:3425:2: ( rule__InputHandler__NameAssignment_1 )
            // InternalComponentDefinition.g:3425:3: rule__InputHandler__NameAssignment_1
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
    // InternalComponentDefinition.g:3433:1: rule__InputHandler__Group__2 : rule__InputHandler__Group__2__Impl rule__InputHandler__Group__3 ;
    public final void rule__InputHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3437:1: ( rule__InputHandler__Group__2__Impl rule__InputHandler__Group__3 )
            // InternalComponentDefinition.g:3438:2: rule__InputHandler__Group__2__Impl rule__InputHandler__Group__3
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
    // InternalComponentDefinition.g:3445:1: rule__InputHandler__Group__2__Impl : ( 'triggeredFrom' ) ;
    public final void rule__InputHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3449:1: ( ( 'triggeredFrom' ) )
            // InternalComponentDefinition.g:3450:1: ( 'triggeredFrom' )
            {
            // InternalComponentDefinition.g:3450:1: ( 'triggeredFrom' )
            // InternalComponentDefinition.g:3451:2: 'triggeredFrom'
            {
             before(grammarAccess.getInputHandlerAccess().getTriggeredFromKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3460:1: rule__InputHandler__Group__3 : rule__InputHandler__Group__3__Impl rule__InputHandler__Group__4 ;
    public final void rule__InputHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3464:1: ( rule__InputHandler__Group__3__Impl rule__InputHandler__Group__4 )
            // InternalComponentDefinition.g:3465:2: rule__InputHandler__Group__3__Impl rule__InputHandler__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalComponentDefinition.g:3472:1: rule__InputHandler__Group__3__Impl : ( ( rule__InputHandler__InputPortAssignment_3 ) ) ;
    public final void rule__InputHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3476:1: ( ( ( rule__InputHandler__InputPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:3477:1: ( ( rule__InputHandler__InputPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:3477:1: ( ( rule__InputHandler__InputPortAssignment_3 ) )
            // InternalComponentDefinition.g:3478:2: ( rule__InputHandler__InputPortAssignment_3 )
            {
             before(grammarAccess.getInputHandlerAccess().getInputPortAssignment_3()); 
            // InternalComponentDefinition.g:3479:2: ( rule__InputHandler__InputPortAssignment_3 )
            // InternalComponentDefinition.g:3479:3: rule__InputHandler__InputPortAssignment_3
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
    // InternalComponentDefinition.g:3487:1: rule__InputHandler__Group__4 : rule__InputHandler__Group__4__Impl rule__InputHandler__Group__5 ;
    public final void rule__InputHandler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3491:1: ( rule__InputHandler__Group__4__Impl rule__InputHandler__Group__5 )
            // InternalComponentDefinition.g:3492:2: rule__InputHandler__Group__4__Impl rule__InputHandler__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalComponentDefinition.g:3499:1: rule__InputHandler__Group__4__Impl : ( ( rule__InputHandler__ActiveQueueAssignment_4 )? ) ;
    public final void rule__InputHandler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3503:1: ( ( ( rule__InputHandler__ActiveQueueAssignment_4 )? ) )
            // InternalComponentDefinition.g:3504:1: ( ( rule__InputHandler__ActiveQueueAssignment_4 )? )
            {
            // InternalComponentDefinition.g:3504:1: ( ( rule__InputHandler__ActiveQueueAssignment_4 )? )
            // InternalComponentDefinition.g:3505:2: ( rule__InputHandler__ActiveQueueAssignment_4 )?
            {
             before(grammarAccess.getInputHandlerAccess().getActiveQueueAssignment_4()); 
            // InternalComponentDefinition.g:3506:2: ( rule__InputHandler__ActiveQueueAssignment_4 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==82) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalComponentDefinition.g:3506:3: rule__InputHandler__ActiveQueueAssignment_4
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
    // InternalComponentDefinition.g:3514:1: rule__InputHandler__Group__5 : rule__InputHandler__Group__5__Impl rule__InputHandler__Group__6 ;
    public final void rule__InputHandler__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3518:1: ( rule__InputHandler__Group__5__Impl rule__InputHandler__Group__6 )
            // InternalComponentDefinition.g:3519:2: rule__InputHandler__Group__5__Impl rule__InputHandler__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalComponentDefinition.g:3526:1: rule__InputHandler__Group__5__Impl : ( '{' ) ;
    public final void rule__InputHandler__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3530:1: ( ( '{' ) )
            // InternalComponentDefinition.g:3531:1: ( '{' )
            {
            // InternalComponentDefinition.g:3531:1: ( '{' )
            // InternalComponentDefinition.g:3532:2: '{'
            {
             before(grammarAccess.getInputHandlerAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3541:1: rule__InputHandler__Group__6 : rule__InputHandler__Group__6__Impl rule__InputHandler__Group__7 ;
    public final void rule__InputHandler__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3545:1: ( rule__InputHandler__Group__6__Impl rule__InputHandler__Group__7 )
            // InternalComponentDefinition.g:3546:2: rule__InputHandler__Group__6__Impl rule__InputHandler__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalComponentDefinition.g:3553:1: rule__InputHandler__Group__6__Impl : ( ( rule__InputHandler__LinksAssignment_6 )* ) ;
    public final void rule__InputHandler__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3557:1: ( ( ( rule__InputHandler__LinksAssignment_6 )* ) )
            // InternalComponentDefinition.g:3558:1: ( ( rule__InputHandler__LinksAssignment_6 )* )
            {
            // InternalComponentDefinition.g:3558:1: ( ( rule__InputHandler__LinksAssignment_6 )* )
            // InternalComponentDefinition.g:3559:2: ( rule__InputHandler__LinksAssignment_6 )*
            {
             before(grammarAccess.getInputHandlerAccess().getLinksAssignment_6()); 
            // InternalComponentDefinition.g:3560:2: ( rule__InputHandler__LinksAssignment_6 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=35 && LA33_0<=39)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalComponentDefinition.g:3560:3: rule__InputHandler__LinksAssignment_6
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__InputHandler__LinksAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalComponentDefinition.g:3568:1: rule__InputHandler__Group__7 : rule__InputHandler__Group__7__Impl ;
    public final void rule__InputHandler__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3572:1: ( rule__InputHandler__Group__7__Impl )
            // InternalComponentDefinition.g:3573:2: rule__InputHandler__Group__7__Impl
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
    // InternalComponentDefinition.g:3579:1: rule__InputHandler__Group__7__Impl : ( '}' ) ;
    public final void rule__InputHandler__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3583:1: ( ( '}' ) )
            // InternalComponentDefinition.g:3584:1: ( '}' )
            {
            // InternalComponentDefinition.g:3584:1: ( '}' )
            // InternalComponentDefinition.g:3585:2: '}'
            {
             before(grammarAccess.getInputHandlerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3595:1: rule__RequestHandler__Group__0 : rule__RequestHandler__Group__0__Impl rule__RequestHandler__Group__1 ;
    public final void rule__RequestHandler__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3599:1: ( rule__RequestHandler__Group__0__Impl rule__RequestHandler__Group__1 )
            // InternalComponentDefinition.g:3600:2: rule__RequestHandler__Group__0__Impl rule__RequestHandler__Group__1
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
    // InternalComponentDefinition.g:3607:1: rule__RequestHandler__Group__0__Impl : ( 'RequestHandler' ) ;
    public final void rule__RequestHandler__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3611:1: ( ( 'RequestHandler' ) )
            // InternalComponentDefinition.g:3612:1: ( 'RequestHandler' )
            {
            // InternalComponentDefinition.g:3612:1: ( 'RequestHandler' )
            // InternalComponentDefinition.g:3613:2: 'RequestHandler'
            {
             before(grammarAccess.getRequestHandlerAccess().getRequestHandlerKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3622:1: rule__RequestHandler__Group__1 : rule__RequestHandler__Group__1__Impl rule__RequestHandler__Group__2 ;
    public final void rule__RequestHandler__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3626:1: ( rule__RequestHandler__Group__1__Impl rule__RequestHandler__Group__2 )
            // InternalComponentDefinition.g:3627:2: rule__RequestHandler__Group__1__Impl rule__RequestHandler__Group__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalComponentDefinition.g:3634:1: rule__RequestHandler__Group__1__Impl : ( ( rule__RequestHandler__NameAssignment_1 ) ) ;
    public final void rule__RequestHandler__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3638:1: ( ( ( rule__RequestHandler__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:3639:1: ( ( rule__RequestHandler__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3639:1: ( ( rule__RequestHandler__NameAssignment_1 ) )
            // InternalComponentDefinition.g:3640:2: ( rule__RequestHandler__NameAssignment_1 )
            {
             before(grammarAccess.getRequestHandlerAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:3641:2: ( rule__RequestHandler__NameAssignment_1 )
            // InternalComponentDefinition.g:3641:3: rule__RequestHandler__NameAssignment_1
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
    // InternalComponentDefinition.g:3649:1: rule__RequestHandler__Group__2 : rule__RequestHandler__Group__2__Impl rule__RequestHandler__Group__3 ;
    public final void rule__RequestHandler__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3653:1: ( rule__RequestHandler__Group__2__Impl rule__RequestHandler__Group__3 )
            // InternalComponentDefinition.g:3654:2: rule__RequestHandler__Group__2__Impl rule__RequestHandler__Group__3
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
    // InternalComponentDefinition.g:3661:1: rule__RequestHandler__Group__2__Impl : ( 'triggeredFrom' ) ;
    public final void rule__RequestHandler__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3665:1: ( ( 'triggeredFrom' ) )
            // InternalComponentDefinition.g:3666:1: ( 'triggeredFrom' )
            {
            // InternalComponentDefinition.g:3666:1: ( 'triggeredFrom' )
            // InternalComponentDefinition.g:3667:2: 'triggeredFrom'
            {
             before(grammarAccess.getRequestHandlerAccess().getTriggeredFromKeyword_2()); 
            match(input,33,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3676:1: rule__RequestHandler__Group__3 : rule__RequestHandler__Group__3__Impl rule__RequestHandler__Group__4 ;
    public final void rule__RequestHandler__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3680:1: ( rule__RequestHandler__Group__3__Impl rule__RequestHandler__Group__4 )
            // InternalComponentDefinition.g:3681:2: rule__RequestHandler__Group__3__Impl rule__RequestHandler__Group__4
            {
            pushFollow(FOLLOW_26);
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
    // InternalComponentDefinition.g:3688:1: rule__RequestHandler__Group__3__Impl : ( ( rule__RequestHandler__AnswerPortAssignment_3 ) ) ;
    public final void rule__RequestHandler__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3692:1: ( ( ( rule__RequestHandler__AnswerPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:3693:1: ( ( rule__RequestHandler__AnswerPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:3693:1: ( ( rule__RequestHandler__AnswerPortAssignment_3 ) )
            // InternalComponentDefinition.g:3694:2: ( rule__RequestHandler__AnswerPortAssignment_3 )
            {
             before(grammarAccess.getRequestHandlerAccess().getAnswerPortAssignment_3()); 
            // InternalComponentDefinition.g:3695:2: ( rule__RequestHandler__AnswerPortAssignment_3 )
            // InternalComponentDefinition.g:3695:3: rule__RequestHandler__AnswerPortAssignment_3
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
    // InternalComponentDefinition.g:3703:1: rule__RequestHandler__Group__4 : rule__RequestHandler__Group__4__Impl rule__RequestHandler__Group__5 ;
    public final void rule__RequestHandler__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3707:1: ( rule__RequestHandler__Group__4__Impl rule__RequestHandler__Group__5 )
            // InternalComponentDefinition.g:3708:2: rule__RequestHandler__Group__4__Impl rule__RequestHandler__Group__5
            {
            pushFollow(FOLLOW_26);
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
    // InternalComponentDefinition.g:3715:1: rule__RequestHandler__Group__4__Impl : ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? ) ;
    public final void rule__RequestHandler__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3719:1: ( ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? ) )
            // InternalComponentDefinition.g:3720:1: ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? )
            {
            // InternalComponentDefinition.g:3720:1: ( ( rule__RequestHandler__ActiveQueueAssignment_4 )? )
            // InternalComponentDefinition.g:3721:2: ( rule__RequestHandler__ActiveQueueAssignment_4 )?
            {
             before(grammarAccess.getRequestHandlerAccess().getActiveQueueAssignment_4()); 
            // InternalComponentDefinition.g:3722:2: ( rule__RequestHandler__ActiveQueueAssignment_4 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==82) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalComponentDefinition.g:3722:3: rule__RequestHandler__ActiveQueueAssignment_4
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
    // InternalComponentDefinition.g:3730:1: rule__RequestHandler__Group__5 : rule__RequestHandler__Group__5__Impl rule__RequestHandler__Group__6 ;
    public final void rule__RequestHandler__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3734:1: ( rule__RequestHandler__Group__5__Impl rule__RequestHandler__Group__6 )
            // InternalComponentDefinition.g:3735:2: rule__RequestHandler__Group__5__Impl rule__RequestHandler__Group__6
            {
            pushFollow(FOLLOW_27);
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
    // InternalComponentDefinition.g:3742:1: rule__RequestHandler__Group__5__Impl : ( '{' ) ;
    public final void rule__RequestHandler__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3746:1: ( ( '{' ) )
            // InternalComponentDefinition.g:3747:1: ( '{' )
            {
            // InternalComponentDefinition.g:3747:1: ( '{' )
            // InternalComponentDefinition.g:3748:2: '{'
            {
             before(grammarAccess.getRequestHandlerAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3757:1: rule__RequestHandler__Group__6 : rule__RequestHandler__Group__6__Impl rule__RequestHandler__Group__7 ;
    public final void rule__RequestHandler__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3761:1: ( rule__RequestHandler__Group__6__Impl rule__RequestHandler__Group__7 )
            // InternalComponentDefinition.g:3762:2: rule__RequestHandler__Group__6__Impl rule__RequestHandler__Group__7
            {
            pushFollow(FOLLOW_27);
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
    // InternalComponentDefinition.g:3769:1: rule__RequestHandler__Group__6__Impl : ( ( rule__RequestHandler__LinksAssignment_6 )* ) ;
    public final void rule__RequestHandler__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3773:1: ( ( ( rule__RequestHandler__LinksAssignment_6 )* ) )
            // InternalComponentDefinition.g:3774:1: ( ( rule__RequestHandler__LinksAssignment_6 )* )
            {
            // InternalComponentDefinition.g:3774:1: ( ( rule__RequestHandler__LinksAssignment_6 )* )
            // InternalComponentDefinition.g:3775:2: ( rule__RequestHandler__LinksAssignment_6 )*
            {
             before(grammarAccess.getRequestHandlerAccess().getLinksAssignment_6()); 
            // InternalComponentDefinition.g:3776:2: ( rule__RequestHandler__LinksAssignment_6 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=35 && LA35_0<=39)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalComponentDefinition.g:3776:3: rule__RequestHandler__LinksAssignment_6
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__RequestHandler__LinksAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalComponentDefinition.g:3784:1: rule__RequestHandler__Group__7 : rule__RequestHandler__Group__7__Impl ;
    public final void rule__RequestHandler__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3788:1: ( rule__RequestHandler__Group__7__Impl )
            // InternalComponentDefinition.g:3789:2: rule__RequestHandler__Group__7__Impl
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
    // InternalComponentDefinition.g:3795:1: rule__RequestHandler__Group__7__Impl : ( '}' ) ;
    public final void rule__RequestHandler__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3799:1: ( ( '}' ) )
            // InternalComponentDefinition.g:3800:1: ( '}' )
            {
            // InternalComponentDefinition.g:3800:1: ( '}' )
            // InternalComponentDefinition.g:3801:2: '}'
            {
             before(grammarAccess.getRequestHandlerAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3811:1: rule__RequestPortLink__Group__0 : rule__RequestPortLink__Group__0__Impl rule__RequestPortLink__Group__1 ;
    public final void rule__RequestPortLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3815:1: ( rule__RequestPortLink__Group__0__Impl rule__RequestPortLink__Group__1 )
            // InternalComponentDefinition.g:3816:2: rule__RequestPortLink__Group__0__Impl rule__RequestPortLink__Group__1
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
    // InternalComponentDefinition.g:3823:1: rule__RequestPortLink__Group__0__Impl : ( 'RequestPortLink' ) ;
    public final void rule__RequestPortLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3827:1: ( ( 'RequestPortLink' ) )
            // InternalComponentDefinition.g:3828:1: ( 'RequestPortLink' )
            {
            // InternalComponentDefinition.g:3828:1: ( 'RequestPortLink' )
            // InternalComponentDefinition.g:3829:2: 'RequestPortLink'
            {
             before(grammarAccess.getRequestPortLinkAccess().getRequestPortLinkKeyword_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3838:1: rule__RequestPortLink__Group__1 : rule__RequestPortLink__Group__1__Impl rule__RequestPortLink__Group__2 ;
    public final void rule__RequestPortLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3842:1: ( rule__RequestPortLink__Group__1__Impl rule__RequestPortLink__Group__2 )
            // InternalComponentDefinition.g:3843:2: rule__RequestPortLink__Group__1__Impl rule__RequestPortLink__Group__2
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
    // InternalComponentDefinition.g:3850:1: rule__RequestPortLink__Group__1__Impl : ( ( rule__RequestPortLink__RequestPortAssignment_1 ) ) ;
    public final void rule__RequestPortLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3854:1: ( ( ( rule__RequestPortLink__RequestPortAssignment_1 ) ) )
            // InternalComponentDefinition.g:3855:1: ( ( rule__RequestPortLink__RequestPortAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3855:1: ( ( rule__RequestPortLink__RequestPortAssignment_1 ) )
            // InternalComponentDefinition.g:3856:2: ( rule__RequestPortLink__RequestPortAssignment_1 )
            {
             before(grammarAccess.getRequestPortLinkAccess().getRequestPortAssignment_1()); 
            // InternalComponentDefinition.g:3857:2: ( rule__RequestPortLink__RequestPortAssignment_1 )
            // InternalComponentDefinition.g:3857:3: rule__RequestPortLink__RequestPortAssignment_1
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
    // InternalComponentDefinition.g:3865:1: rule__RequestPortLink__Group__2 : rule__RequestPortLink__Group__2__Impl ;
    public final void rule__RequestPortLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3869:1: ( rule__RequestPortLink__Group__2__Impl )
            // InternalComponentDefinition.g:3870:2: rule__RequestPortLink__Group__2__Impl
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
    // InternalComponentDefinition.g:3876:1: rule__RequestPortLink__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__RequestPortLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3880:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:3881:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:3881:1: ( ( ';' )? )
            // InternalComponentDefinition.g:3882:2: ( ';' )?
            {
             before(grammarAccess.getRequestPortLinkAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:3883:2: ( ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==19) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalComponentDefinition.g:3883:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:3892:1: rule__OpcUaClientLink__Group__0 : rule__OpcUaClientLink__Group__0__Impl rule__OpcUaClientLink__Group__1 ;
    public final void rule__OpcUaClientLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3896:1: ( rule__OpcUaClientLink__Group__0__Impl rule__OpcUaClientLink__Group__1 )
            // InternalComponentDefinition.g:3897:2: rule__OpcUaClientLink__Group__0__Impl rule__OpcUaClientLink__Group__1
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
    // InternalComponentDefinition.g:3904:1: rule__OpcUaClientLink__Group__0__Impl : ( 'OpcUaClientLink' ) ;
    public final void rule__OpcUaClientLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3908:1: ( ( 'OpcUaClientLink' ) )
            // InternalComponentDefinition.g:3909:1: ( 'OpcUaClientLink' )
            {
            // InternalComponentDefinition.g:3909:1: ( 'OpcUaClientLink' )
            // InternalComponentDefinition.g:3910:2: 'OpcUaClientLink'
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getOpcUaClientLinkKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalComponentDefinition.g:3919:1: rule__OpcUaClientLink__Group__1 : rule__OpcUaClientLink__Group__1__Impl rule__OpcUaClientLink__Group__2 ;
    public final void rule__OpcUaClientLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3923:1: ( rule__OpcUaClientLink__Group__1__Impl rule__OpcUaClientLink__Group__2 )
            // InternalComponentDefinition.g:3924:2: rule__OpcUaClientLink__Group__1__Impl rule__OpcUaClientLink__Group__2
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
    // InternalComponentDefinition.g:3931:1: rule__OpcUaClientLink__Group__1__Impl : ( ( rule__OpcUaClientLink__ClientAssignment_1 ) ) ;
    public final void rule__OpcUaClientLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3935:1: ( ( ( rule__OpcUaClientLink__ClientAssignment_1 ) ) )
            // InternalComponentDefinition.g:3936:1: ( ( rule__OpcUaClientLink__ClientAssignment_1 ) )
            {
            // InternalComponentDefinition.g:3936:1: ( ( rule__OpcUaClientLink__ClientAssignment_1 ) )
            // InternalComponentDefinition.g:3937:2: ( rule__OpcUaClientLink__ClientAssignment_1 )
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getClientAssignment_1()); 
            // InternalComponentDefinition.g:3938:2: ( rule__OpcUaClientLink__ClientAssignment_1 )
            // InternalComponentDefinition.g:3938:3: rule__OpcUaClientLink__ClientAssignment_1
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
    // InternalComponentDefinition.g:3946:1: rule__OpcUaClientLink__Group__2 : rule__OpcUaClientLink__Group__2__Impl ;
    public final void rule__OpcUaClientLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3950:1: ( rule__OpcUaClientLink__Group__2__Impl )
            // InternalComponentDefinition.g:3951:2: rule__OpcUaClientLink__Group__2__Impl
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
    // InternalComponentDefinition.g:3957:1: rule__OpcUaClientLink__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaClientLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3961:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:3962:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:3962:1: ( ( ';' )? )
            // InternalComponentDefinition.g:3963:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:3964:2: ( ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==19) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalComponentDefinition.g:3964:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:3973:1: rule__MixedPortROSLink__Group__0 : rule__MixedPortROSLink__Group__0__Impl rule__MixedPortROSLink__Group__1 ;
    public final void rule__MixedPortROSLink__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3977:1: ( rule__MixedPortROSLink__Group__0__Impl rule__MixedPortROSLink__Group__1 )
            // InternalComponentDefinition.g:3978:2: rule__MixedPortROSLink__Group__0__Impl rule__MixedPortROSLink__Group__1
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
    // InternalComponentDefinition.g:3985:1: rule__MixedPortROSLink__Group__0__Impl : ( 'MixedPortROSLink' ) ;
    public final void rule__MixedPortROSLink__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:3989:1: ( ( 'MixedPortROSLink' ) )
            // InternalComponentDefinition.g:3990:1: ( 'MixedPortROSLink' )
            {
            // InternalComponentDefinition.g:3990:1: ( 'MixedPortROSLink' )
            // InternalComponentDefinition.g:3991:2: 'MixedPortROSLink'
            {
             before(grammarAccess.getMixedPortROSLinkAccess().getMixedPortROSLinkKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4000:1: rule__MixedPortROSLink__Group__1 : rule__MixedPortROSLink__Group__1__Impl rule__MixedPortROSLink__Group__2 ;
    public final void rule__MixedPortROSLink__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4004:1: ( rule__MixedPortROSLink__Group__1__Impl rule__MixedPortROSLink__Group__2 )
            // InternalComponentDefinition.g:4005:2: rule__MixedPortROSLink__Group__1__Impl rule__MixedPortROSLink__Group__2
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
    // InternalComponentDefinition.g:4012:1: rule__MixedPortROSLink__Group__1__Impl : ( ( rule__MixedPortROSLink__MixedportrosAssignment_1 ) ) ;
    public final void rule__MixedPortROSLink__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4016:1: ( ( ( rule__MixedPortROSLink__MixedportrosAssignment_1 ) ) )
            // InternalComponentDefinition.g:4017:1: ( ( rule__MixedPortROSLink__MixedportrosAssignment_1 ) )
            {
            // InternalComponentDefinition.g:4017:1: ( ( rule__MixedPortROSLink__MixedportrosAssignment_1 ) )
            // InternalComponentDefinition.g:4018:2: ( rule__MixedPortROSLink__MixedportrosAssignment_1 )
            {
             before(grammarAccess.getMixedPortROSLinkAccess().getMixedportrosAssignment_1()); 
            // InternalComponentDefinition.g:4019:2: ( rule__MixedPortROSLink__MixedportrosAssignment_1 )
            // InternalComponentDefinition.g:4019:3: rule__MixedPortROSLink__MixedportrosAssignment_1
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
    // InternalComponentDefinition.g:4027:1: rule__MixedPortROSLink__Group__2 : rule__MixedPortROSLink__Group__2__Impl ;
    public final void rule__MixedPortROSLink__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4031:1: ( rule__MixedPortROSLink__Group__2__Impl )
            // InternalComponentDefinition.g:4032:2: rule__MixedPortROSLink__Group__2__Impl
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
    // InternalComponentDefinition.g:4038:1: rule__MixedPortROSLink__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__MixedPortROSLink__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4042:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4043:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4043:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4044:2: ( ';' )?
            {
             before(grammarAccess.getMixedPortROSLinkAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:4045:2: ( ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==19) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalComponentDefinition.g:4045:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:4054:1: rule__ComponentSubNodeObserver__Group__0 : rule__ComponentSubNodeObserver__Group__0__Impl rule__ComponentSubNodeObserver__Group__1 ;
    public final void rule__ComponentSubNodeObserver__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4058:1: ( rule__ComponentSubNodeObserver__Group__0__Impl rule__ComponentSubNodeObserver__Group__1 )
            // InternalComponentDefinition.g:4059:2: rule__ComponentSubNodeObserver__Group__0__Impl rule__ComponentSubNodeObserver__Group__1
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
    // InternalComponentDefinition.g:4066:1: rule__ComponentSubNodeObserver__Group__0__Impl : ( 'Observe' ) ;
    public final void rule__ComponentSubNodeObserver__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4070:1: ( ( 'Observe' ) )
            // InternalComponentDefinition.g:4071:1: ( 'Observe' )
            {
            // InternalComponentDefinition.g:4071:1: ( 'Observe' )
            // InternalComponentDefinition.g:4072:2: 'Observe'
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getObserveKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4081:1: rule__ComponentSubNodeObserver__Group__1 : rule__ComponentSubNodeObserver__Group__1__Impl rule__ComponentSubNodeObserver__Group__2 ;
    public final void rule__ComponentSubNodeObserver__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4085:1: ( rule__ComponentSubNodeObserver__Group__1__Impl rule__ComponentSubNodeObserver__Group__2 )
            // InternalComponentDefinition.g:4086:2: rule__ComponentSubNodeObserver__Group__1__Impl rule__ComponentSubNodeObserver__Group__2
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
    // InternalComponentDefinition.g:4093:1: rule__ComponentSubNodeObserver__Group__1__Impl : ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) ) ;
    public final void rule__ComponentSubNodeObserver__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4097:1: ( ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) ) )
            // InternalComponentDefinition.g:4098:1: ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) )
            {
            // InternalComponentDefinition.g:4098:1: ( ( rule__ComponentSubNodeObserver__SubjectAssignment_1 ) )
            // InternalComponentDefinition.g:4099:2: ( rule__ComponentSubNodeObserver__SubjectAssignment_1 )
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getSubjectAssignment_1()); 
            // InternalComponentDefinition.g:4100:2: ( rule__ComponentSubNodeObserver__SubjectAssignment_1 )
            // InternalComponentDefinition.g:4100:3: rule__ComponentSubNodeObserver__SubjectAssignment_1
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
    // InternalComponentDefinition.g:4108:1: rule__ComponentSubNodeObserver__Group__2 : rule__ComponentSubNodeObserver__Group__2__Impl ;
    public final void rule__ComponentSubNodeObserver__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4112:1: ( rule__ComponentSubNodeObserver__Group__2__Impl )
            // InternalComponentDefinition.g:4113:2: rule__ComponentSubNodeObserver__Group__2__Impl
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
    // InternalComponentDefinition.g:4119:1: rule__ComponentSubNodeObserver__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ComponentSubNodeObserver__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4123:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4124:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4124:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4125:2: ( ';' )?
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:4126:2: ( ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==19) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalComponentDefinition.g:4126:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:4135:1: rule__InputLinkExtension__Group__0 : rule__InputLinkExtension__Group__0__Impl rule__InputLinkExtension__Group__1 ;
    public final void rule__InputLinkExtension__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4139:1: ( rule__InputLinkExtension__Group__0__Impl rule__InputLinkExtension__Group__1 )
            // InternalComponentDefinition.g:4140:2: rule__InputLinkExtension__Group__0__Impl rule__InputLinkExtension__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalComponentDefinition.g:4147:1: rule__InputLinkExtension__Group__0__Impl : ( () ) ;
    public final void rule__InputLinkExtension__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4151:1: ( ( () ) )
            // InternalComponentDefinition.g:4152:1: ( () )
            {
            // InternalComponentDefinition.g:4152:1: ( () )
            // InternalComponentDefinition.g:4153:2: ()
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputLinkExtensionAction_0()); 
            // InternalComponentDefinition.g:4154:2: ()
            // InternalComponentDefinition.g:4154:3: 
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
    // InternalComponentDefinition.g:4162:1: rule__InputLinkExtension__Group__1 : rule__InputLinkExtension__Group__1__Impl rule__InputLinkExtension__Group__2 ;
    public final void rule__InputLinkExtension__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4166:1: ( rule__InputLinkExtension__Group__1__Impl rule__InputLinkExtension__Group__2 )
            // InternalComponentDefinition.g:4167:2: rule__InputLinkExtension__Group__1__Impl rule__InputLinkExtension__Group__2
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
    // InternalComponentDefinition.g:4174:1: rule__InputLinkExtension__Group__1__Impl : ( 'InputPortLink' ) ;
    public final void rule__InputLinkExtension__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4178:1: ( ( 'InputPortLink' ) )
            // InternalComponentDefinition.g:4179:1: ( 'InputPortLink' )
            {
            // InternalComponentDefinition.g:4179:1: ( 'InputPortLink' )
            // InternalComponentDefinition.g:4180:2: 'InputPortLink'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputPortLinkKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4189:1: rule__InputLinkExtension__Group__2 : rule__InputLinkExtension__Group__2__Impl rule__InputLinkExtension__Group__3 ;
    public final void rule__InputLinkExtension__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4193:1: ( rule__InputLinkExtension__Group__2__Impl rule__InputLinkExtension__Group__3 )
            // InternalComponentDefinition.g:4194:2: rule__InputLinkExtension__Group__2__Impl rule__InputLinkExtension__Group__3
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentDefinition.g:4201:1: rule__InputLinkExtension__Group__2__Impl : ( ( rule__InputLinkExtension__InputPortAssignment_2 ) ) ;
    public final void rule__InputLinkExtension__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4205:1: ( ( ( rule__InputLinkExtension__InputPortAssignment_2 ) ) )
            // InternalComponentDefinition.g:4206:1: ( ( rule__InputLinkExtension__InputPortAssignment_2 ) )
            {
            // InternalComponentDefinition.g:4206:1: ( ( rule__InputLinkExtension__InputPortAssignment_2 ) )
            // InternalComponentDefinition.g:4207:2: ( rule__InputLinkExtension__InputPortAssignment_2 )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputPortAssignment_2()); 
            // InternalComponentDefinition.g:4208:2: ( rule__InputLinkExtension__InputPortAssignment_2 )
            // InternalComponentDefinition.g:4208:3: rule__InputLinkExtension__InputPortAssignment_2
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
    // InternalComponentDefinition.g:4216:1: rule__InputLinkExtension__Group__3 : rule__InputLinkExtension__Group__3__Impl rule__InputLinkExtension__Group__4 ;
    public final void rule__InputLinkExtension__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4220:1: ( rule__InputLinkExtension__Group__3__Impl rule__InputLinkExtension__Group__4 )
            // InternalComponentDefinition.g:4221:2: rule__InputLinkExtension__Group__3__Impl rule__InputLinkExtension__Group__4
            {
            pushFollow(FOLLOW_29);
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
    // InternalComponentDefinition.g:4228:1: rule__InputLinkExtension__Group__3__Impl : ( '{' ) ;
    public final void rule__InputLinkExtension__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4232:1: ( ( '{' ) )
            // InternalComponentDefinition.g:4233:1: ( '{' )
            {
            // InternalComponentDefinition.g:4233:1: ( '{' )
            // InternalComponentDefinition.g:4234:2: '{'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,21,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4243:1: rule__InputLinkExtension__Group__4 : rule__InputLinkExtension__Group__4__Impl rule__InputLinkExtension__Group__5 ;
    public final void rule__InputLinkExtension__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4247:1: ( rule__InputLinkExtension__Group__4__Impl rule__InputLinkExtension__Group__5 )
            // InternalComponentDefinition.g:4248:2: rule__InputLinkExtension__Group__4__Impl rule__InputLinkExtension__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalComponentDefinition.g:4255:1: rule__InputLinkExtension__Group__4__Impl : ( ( rule__InputLinkExtension__UnorderedGroup_4 ) ) ;
    public final void rule__InputLinkExtension__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4259:1: ( ( ( rule__InputLinkExtension__UnorderedGroup_4 ) ) )
            // InternalComponentDefinition.g:4260:1: ( ( rule__InputLinkExtension__UnorderedGroup_4 ) )
            {
            // InternalComponentDefinition.g:4260:1: ( ( rule__InputLinkExtension__UnorderedGroup_4 ) )
            // InternalComponentDefinition.g:4261:2: ( rule__InputLinkExtension__UnorderedGroup_4 )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4()); 
            // InternalComponentDefinition.g:4262:2: ( rule__InputLinkExtension__UnorderedGroup_4 )
            // InternalComponentDefinition.g:4262:3: rule__InputLinkExtension__UnorderedGroup_4
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
    // InternalComponentDefinition.g:4270:1: rule__InputLinkExtension__Group__5 : rule__InputLinkExtension__Group__5__Impl ;
    public final void rule__InputLinkExtension__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4274:1: ( rule__InputLinkExtension__Group__5__Impl )
            // InternalComponentDefinition.g:4275:2: rule__InputLinkExtension__Group__5__Impl
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
    // InternalComponentDefinition.g:4281:1: rule__InputLinkExtension__Group__5__Impl : ( '}' ) ;
    public final void rule__InputLinkExtension__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4285:1: ( ( '}' ) )
            // InternalComponentDefinition.g:4286:1: ( '}' )
            {
            // InternalComponentDefinition.g:4286:1: ( '}' )
            // InternalComponentDefinition.g:4287:2: '}'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4297:1: rule__ActivationConstraints__Group__0 : rule__ActivationConstraints__Group__0__Impl rule__ActivationConstraints__Group__1 ;
    public final void rule__ActivationConstraints__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4301:1: ( rule__ActivationConstraints__Group__0__Impl rule__ActivationConstraints__Group__1 )
            // InternalComponentDefinition.g:4302:2: rule__ActivationConstraints__Group__0__Impl rule__ActivationConstraints__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalComponentDefinition.g:4309:1: rule__ActivationConstraints__Group__0__Impl : ( () ) ;
    public final void rule__ActivationConstraints__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4313:1: ( ( () ) )
            // InternalComponentDefinition.g:4314:1: ( () )
            {
            // InternalComponentDefinition.g:4314:1: ( () )
            // InternalComponentDefinition.g:4315:2: ()
            {
             before(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsAction_0()); 
            // InternalComponentDefinition.g:4316:2: ()
            // InternalComponentDefinition.g:4316:3: 
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
    // InternalComponentDefinition.g:4324:1: rule__ActivationConstraints__Group__1 : rule__ActivationConstraints__Group__1__Impl rule__ActivationConstraints__Group__2 ;
    public final void rule__ActivationConstraints__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4328:1: ( rule__ActivationConstraints__Group__1__Impl rule__ActivationConstraints__Group__2 )
            // InternalComponentDefinition.g:4329:2: rule__ActivationConstraints__Group__1__Impl rule__ActivationConstraints__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentDefinition.g:4336:1: rule__ActivationConstraints__Group__1__Impl : ( 'ActivationConstraints' ) ;
    public final void rule__ActivationConstraints__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4340:1: ( ( 'ActivationConstraints' ) )
            // InternalComponentDefinition.g:4341:1: ( 'ActivationConstraints' )
            {
            // InternalComponentDefinition.g:4341:1: ( 'ActivationConstraints' )
            // InternalComponentDefinition.g:4342:2: 'ActivationConstraints'
            {
             before(grammarAccess.getActivationConstraintsAccess().getActivationConstraintsKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4351:1: rule__ActivationConstraints__Group__2 : rule__ActivationConstraints__Group__2__Impl rule__ActivationConstraints__Group__3 ;
    public final void rule__ActivationConstraints__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4355:1: ( rule__ActivationConstraints__Group__2__Impl rule__ActivationConstraints__Group__3 )
            // InternalComponentDefinition.g:4356:2: rule__ActivationConstraints__Group__2__Impl rule__ActivationConstraints__Group__3
            {
            pushFollow(FOLLOW_32);
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
    // InternalComponentDefinition.g:4363:1: rule__ActivationConstraints__Group__2__Impl : ( '{' ) ;
    public final void rule__ActivationConstraints__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4367:1: ( ( '{' ) )
            // InternalComponentDefinition.g:4368:1: ( '{' )
            {
            // InternalComponentDefinition.g:4368:1: ( '{' )
            // InternalComponentDefinition.g:4369:2: '{'
            {
             before(grammarAccess.getActivationConstraintsAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4378:1: rule__ActivationConstraints__Group__3 : rule__ActivationConstraints__Group__3__Impl rule__ActivationConstraints__Group__4 ;
    public final void rule__ActivationConstraints__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4382:1: ( rule__ActivationConstraints__Group__3__Impl rule__ActivationConstraints__Group__4 )
            // InternalComponentDefinition.g:4383:2: rule__ActivationConstraints__Group__3__Impl rule__ActivationConstraints__Group__4
            {
            pushFollow(FOLLOW_33);
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
    // InternalComponentDefinition.g:4390:1: rule__ActivationConstraints__Group__3__Impl : ( 'configurable' ) ;
    public final void rule__ActivationConstraints__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4394:1: ( ( 'configurable' ) )
            // InternalComponentDefinition.g:4395:1: ( 'configurable' )
            {
            // InternalComponentDefinition.g:4395:1: ( 'configurable' )
            // InternalComponentDefinition.g:4396:2: 'configurable'
            {
             before(grammarAccess.getActivationConstraintsAccess().getConfigurableKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4405:1: rule__ActivationConstraints__Group__4 : rule__ActivationConstraints__Group__4__Impl rule__ActivationConstraints__Group__5 ;
    public final void rule__ActivationConstraints__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4409:1: ( rule__ActivationConstraints__Group__4__Impl rule__ActivationConstraints__Group__5 )
            // InternalComponentDefinition.g:4410:2: rule__ActivationConstraints__Group__4__Impl rule__ActivationConstraints__Group__5
            {
            pushFollow(FOLLOW_34);
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
    // InternalComponentDefinition.g:4417:1: rule__ActivationConstraints__Group__4__Impl : ( '=' ) ;
    public final void rule__ActivationConstraints__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4421:1: ( ( '=' ) )
            // InternalComponentDefinition.g:4422:1: ( '=' )
            {
            // InternalComponentDefinition.g:4422:1: ( '=' )
            // InternalComponentDefinition.g:4423:2: '='
            {
             before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_4()); 
            match(input,42,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4432:1: rule__ActivationConstraints__Group__5 : rule__ActivationConstraints__Group__5__Impl rule__ActivationConstraints__Group__6 ;
    public final void rule__ActivationConstraints__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4436:1: ( rule__ActivationConstraints__Group__5__Impl rule__ActivationConstraints__Group__6 )
            // InternalComponentDefinition.g:4437:2: rule__ActivationConstraints__Group__5__Impl rule__ActivationConstraints__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalComponentDefinition.g:4444:1: rule__ActivationConstraints__Group__5__Impl : ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) ) ;
    public final void rule__ActivationConstraints__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4448:1: ( ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) ) )
            // InternalComponentDefinition.g:4449:1: ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) )
            {
            // InternalComponentDefinition.g:4449:1: ( ( rule__ActivationConstraints__ConfigurableAssignment_5 ) )
            // InternalComponentDefinition.g:4450:2: ( rule__ActivationConstraints__ConfigurableAssignment_5 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getConfigurableAssignment_5()); 
            // InternalComponentDefinition.g:4451:2: ( rule__ActivationConstraints__ConfigurableAssignment_5 )
            // InternalComponentDefinition.g:4451:3: rule__ActivationConstraints__ConfigurableAssignment_5
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
    // InternalComponentDefinition.g:4459:1: rule__ActivationConstraints__Group__6 : rule__ActivationConstraints__Group__6__Impl rule__ActivationConstraints__Group__7 ;
    public final void rule__ActivationConstraints__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4463:1: ( rule__ActivationConstraints__Group__6__Impl rule__ActivationConstraints__Group__7 )
            // InternalComponentDefinition.g:4464:2: rule__ActivationConstraints__Group__6__Impl rule__ActivationConstraints__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalComponentDefinition.g:4471:1: rule__ActivationConstraints__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__ActivationConstraints__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4475:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4476:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4476:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4477:2: ( ';' )?
            {
             before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_6()); 
            // InternalComponentDefinition.g:4478:2: ( ';' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==19) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalComponentDefinition.g:4478:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:4486:1: rule__ActivationConstraints__Group__7 : rule__ActivationConstraints__Group__7__Impl rule__ActivationConstraints__Group__8 ;
    public final void rule__ActivationConstraints__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4490:1: ( rule__ActivationConstraints__Group__7__Impl rule__ActivationConstraints__Group__8 )
            // InternalComponentDefinition.g:4491:2: rule__ActivationConstraints__Group__7__Impl rule__ActivationConstraints__Group__8
            {
            pushFollow(FOLLOW_30);
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
    // InternalComponentDefinition.g:4498:1: rule__ActivationConstraints__Group__7__Impl : ( ( rule__ActivationConstraints__UnorderedGroup_7 ) ) ;
    public final void rule__ActivationConstraints__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4502:1: ( ( ( rule__ActivationConstraints__UnorderedGroup_7 ) ) )
            // InternalComponentDefinition.g:4503:1: ( ( rule__ActivationConstraints__UnorderedGroup_7 ) )
            {
            // InternalComponentDefinition.g:4503:1: ( ( rule__ActivationConstraints__UnorderedGroup_7 ) )
            // InternalComponentDefinition.g:4504:2: ( rule__ActivationConstraints__UnorderedGroup_7 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7()); 
            // InternalComponentDefinition.g:4505:2: ( rule__ActivationConstraints__UnorderedGroup_7 )
            // InternalComponentDefinition.g:4505:3: rule__ActivationConstraints__UnorderedGroup_7
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
    // InternalComponentDefinition.g:4513:1: rule__ActivationConstraints__Group__8 : rule__ActivationConstraints__Group__8__Impl ;
    public final void rule__ActivationConstraints__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4517:1: ( rule__ActivationConstraints__Group__8__Impl )
            // InternalComponentDefinition.g:4518:2: rule__ActivationConstraints__Group__8__Impl
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
    // InternalComponentDefinition.g:4524:1: rule__ActivationConstraints__Group__8__Impl : ( '}' ) ;
    public final void rule__ActivationConstraints__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4528:1: ( ( '}' ) )
            // InternalComponentDefinition.g:4529:1: ( '}' )
            {
            // InternalComponentDefinition.g:4529:1: ( '}' )
            // InternalComponentDefinition.g:4530:2: '}'
            {
             before(grammarAccess.getActivationConstraintsAccess().getRightCurlyBracketKeyword_8()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4540:1: rule__ActivationConstraints__Group_7_0__0 : rule__ActivationConstraints__Group_7_0__0__Impl rule__ActivationConstraints__Group_7_0__1 ;
    public final void rule__ActivationConstraints__Group_7_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4544:1: ( rule__ActivationConstraints__Group_7_0__0__Impl rule__ActivationConstraints__Group_7_0__1 )
            // InternalComponentDefinition.g:4545:2: rule__ActivationConstraints__Group_7_0__0__Impl rule__ActivationConstraints__Group_7_0__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalComponentDefinition.g:4552:1: rule__ActivationConstraints__Group_7_0__0__Impl : ( 'minActFreq' ) ;
    public final void rule__ActivationConstraints__Group_7_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4556:1: ( ( 'minActFreq' ) )
            // InternalComponentDefinition.g:4557:1: ( 'minActFreq' )
            {
            // InternalComponentDefinition.g:4557:1: ( 'minActFreq' )
            // InternalComponentDefinition.g:4558:2: 'minActFreq'
            {
             before(grammarAccess.getActivationConstraintsAccess().getMinActFreqKeyword_7_0_0()); 
            match(input,43,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4567:1: rule__ActivationConstraints__Group_7_0__1 : rule__ActivationConstraints__Group_7_0__1__Impl rule__ActivationConstraints__Group_7_0__2 ;
    public final void rule__ActivationConstraints__Group_7_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4571:1: ( rule__ActivationConstraints__Group_7_0__1__Impl rule__ActivationConstraints__Group_7_0__2 )
            // InternalComponentDefinition.g:4572:2: rule__ActivationConstraints__Group_7_0__1__Impl rule__ActivationConstraints__Group_7_0__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalComponentDefinition.g:4579:1: rule__ActivationConstraints__Group_7_0__1__Impl : ( '=' ) ;
    public final void rule__ActivationConstraints__Group_7_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4583:1: ( ( '=' ) )
            // InternalComponentDefinition.g:4584:1: ( '=' )
            {
            // InternalComponentDefinition.g:4584:1: ( '=' )
            // InternalComponentDefinition.g:4585:2: '='
            {
             before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_0_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4594:1: rule__ActivationConstraints__Group_7_0__2 : rule__ActivationConstraints__Group_7_0__2__Impl rule__ActivationConstraints__Group_7_0__3 ;
    public final void rule__ActivationConstraints__Group_7_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4598:1: ( rule__ActivationConstraints__Group_7_0__2__Impl rule__ActivationConstraints__Group_7_0__3 )
            // InternalComponentDefinition.g:4599:2: rule__ActivationConstraints__Group_7_0__2__Impl rule__ActivationConstraints__Group_7_0__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalComponentDefinition.g:4606:1: rule__ActivationConstraints__Group_7_0__2__Impl : ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) ) ;
    public final void rule__ActivationConstraints__Group_7_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4610:1: ( ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) ) )
            // InternalComponentDefinition.g:4611:1: ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) )
            {
            // InternalComponentDefinition.g:4611:1: ( ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 ) )
            // InternalComponentDefinition.g:4612:2: ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getMinActFreqAssignment_7_0_2()); 
            // InternalComponentDefinition.g:4613:2: ( rule__ActivationConstraints__MinActFreqAssignment_7_0_2 )
            // InternalComponentDefinition.g:4613:3: rule__ActivationConstraints__MinActFreqAssignment_7_0_2
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
    // InternalComponentDefinition.g:4621:1: rule__ActivationConstraints__Group_7_0__3 : rule__ActivationConstraints__Group_7_0__3__Impl rule__ActivationConstraints__Group_7_0__4 ;
    public final void rule__ActivationConstraints__Group_7_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4625:1: ( rule__ActivationConstraints__Group_7_0__3__Impl rule__ActivationConstraints__Group_7_0__4 )
            // InternalComponentDefinition.g:4626:2: rule__ActivationConstraints__Group_7_0__3__Impl rule__ActivationConstraints__Group_7_0__4
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
    // InternalComponentDefinition.g:4633:1: rule__ActivationConstraints__Group_7_0__3__Impl : ( 'Hz' ) ;
    public final void rule__ActivationConstraints__Group_7_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4637:1: ( ( 'Hz' ) )
            // InternalComponentDefinition.g:4638:1: ( 'Hz' )
            {
            // InternalComponentDefinition.g:4638:1: ( 'Hz' )
            // InternalComponentDefinition.g:4639:2: 'Hz'
            {
             before(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_0_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4648:1: rule__ActivationConstraints__Group_7_0__4 : rule__ActivationConstraints__Group_7_0__4__Impl ;
    public final void rule__ActivationConstraints__Group_7_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4652:1: ( rule__ActivationConstraints__Group_7_0__4__Impl )
            // InternalComponentDefinition.g:4653:2: rule__ActivationConstraints__Group_7_0__4__Impl
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
    // InternalComponentDefinition.g:4659:1: rule__ActivationConstraints__Group_7_0__4__Impl : ( ( ';' )? ) ;
    public final void rule__ActivationConstraints__Group_7_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4663:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4664:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4664:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4665:2: ( ';' )?
            {
             before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_0_4()); 
            // InternalComponentDefinition.g:4666:2: ( ';' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==19) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalComponentDefinition.g:4666:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:4675:1: rule__ActivationConstraints__Group_7_1__0 : rule__ActivationConstraints__Group_7_1__0__Impl rule__ActivationConstraints__Group_7_1__1 ;
    public final void rule__ActivationConstraints__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4679:1: ( rule__ActivationConstraints__Group_7_1__0__Impl rule__ActivationConstraints__Group_7_1__1 )
            // InternalComponentDefinition.g:4680:2: rule__ActivationConstraints__Group_7_1__0__Impl rule__ActivationConstraints__Group_7_1__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalComponentDefinition.g:4687:1: rule__ActivationConstraints__Group_7_1__0__Impl : ( 'maxActFreq' ) ;
    public final void rule__ActivationConstraints__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4691:1: ( ( 'maxActFreq' ) )
            // InternalComponentDefinition.g:4692:1: ( 'maxActFreq' )
            {
            // InternalComponentDefinition.g:4692:1: ( 'maxActFreq' )
            // InternalComponentDefinition.g:4693:2: 'maxActFreq'
            {
             before(grammarAccess.getActivationConstraintsAccess().getMaxActFreqKeyword_7_1_0()); 
            match(input,45,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4702:1: rule__ActivationConstraints__Group_7_1__1 : rule__ActivationConstraints__Group_7_1__1__Impl rule__ActivationConstraints__Group_7_1__2 ;
    public final void rule__ActivationConstraints__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4706:1: ( rule__ActivationConstraints__Group_7_1__1__Impl rule__ActivationConstraints__Group_7_1__2 )
            // InternalComponentDefinition.g:4707:2: rule__ActivationConstraints__Group_7_1__1__Impl rule__ActivationConstraints__Group_7_1__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalComponentDefinition.g:4714:1: rule__ActivationConstraints__Group_7_1__1__Impl : ( '=' ) ;
    public final void rule__ActivationConstraints__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4718:1: ( ( '=' ) )
            // InternalComponentDefinition.g:4719:1: ( '=' )
            {
            // InternalComponentDefinition.g:4719:1: ( '=' )
            // InternalComponentDefinition.g:4720:2: '='
            {
             before(grammarAccess.getActivationConstraintsAccess().getEqualsSignKeyword_7_1_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4729:1: rule__ActivationConstraints__Group_7_1__2 : rule__ActivationConstraints__Group_7_1__2__Impl rule__ActivationConstraints__Group_7_1__3 ;
    public final void rule__ActivationConstraints__Group_7_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4733:1: ( rule__ActivationConstraints__Group_7_1__2__Impl rule__ActivationConstraints__Group_7_1__3 )
            // InternalComponentDefinition.g:4734:2: rule__ActivationConstraints__Group_7_1__2__Impl rule__ActivationConstraints__Group_7_1__3
            {
            pushFollow(FOLLOW_37);
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
    // InternalComponentDefinition.g:4741:1: rule__ActivationConstraints__Group_7_1__2__Impl : ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) ) ;
    public final void rule__ActivationConstraints__Group_7_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4745:1: ( ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) ) )
            // InternalComponentDefinition.g:4746:1: ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) )
            {
            // InternalComponentDefinition.g:4746:1: ( ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 ) )
            // InternalComponentDefinition.g:4747:2: ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 )
            {
             before(grammarAccess.getActivationConstraintsAccess().getMaxActFreqAssignment_7_1_2()); 
            // InternalComponentDefinition.g:4748:2: ( rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 )
            // InternalComponentDefinition.g:4748:3: rule__ActivationConstraints__MaxActFreqAssignment_7_1_2
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
    // InternalComponentDefinition.g:4756:1: rule__ActivationConstraints__Group_7_1__3 : rule__ActivationConstraints__Group_7_1__3__Impl rule__ActivationConstraints__Group_7_1__4 ;
    public final void rule__ActivationConstraints__Group_7_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4760:1: ( rule__ActivationConstraints__Group_7_1__3__Impl rule__ActivationConstraints__Group_7_1__4 )
            // InternalComponentDefinition.g:4761:2: rule__ActivationConstraints__Group_7_1__3__Impl rule__ActivationConstraints__Group_7_1__4
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
    // InternalComponentDefinition.g:4768:1: rule__ActivationConstraints__Group_7_1__3__Impl : ( 'Hz' ) ;
    public final void rule__ActivationConstraints__Group_7_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4772:1: ( ( 'Hz' ) )
            // InternalComponentDefinition.g:4773:1: ( 'Hz' )
            {
            // InternalComponentDefinition.g:4773:1: ( 'Hz' )
            // InternalComponentDefinition.g:4774:2: 'Hz'
            {
             before(grammarAccess.getActivationConstraintsAccess().getHzKeyword_7_1_3()); 
            match(input,44,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4783:1: rule__ActivationConstraints__Group_7_1__4 : rule__ActivationConstraints__Group_7_1__4__Impl ;
    public final void rule__ActivationConstraints__Group_7_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4787:1: ( rule__ActivationConstraints__Group_7_1__4__Impl )
            // InternalComponentDefinition.g:4788:2: rule__ActivationConstraints__Group_7_1__4__Impl
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
    // InternalComponentDefinition.g:4794:1: rule__ActivationConstraints__Group_7_1__4__Impl : ( ( ';' )? ) ;
    public final void rule__ActivationConstraints__Group_7_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4798:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4799:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4799:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4800:2: ( ';' )?
            {
             before(grammarAccess.getActivationConstraintsAccess().getSemicolonKeyword_7_1_4()); 
            // InternalComponentDefinition.g:4801:2: ( ';' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==19) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalComponentDefinition.g:4801:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:4810:1: rule__OperationModeBinding__Group__0 : rule__OperationModeBinding__Group__0__Impl rule__OperationModeBinding__Group__1 ;
    public final void rule__OperationModeBinding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4814:1: ( rule__OperationModeBinding__Group__0__Impl rule__OperationModeBinding__Group__1 )
            // InternalComponentDefinition.g:4815:2: rule__OperationModeBinding__Group__0__Impl rule__OperationModeBinding__Group__1
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
    // InternalComponentDefinition.g:4822:1: rule__OperationModeBinding__Group__0__Impl : ( 'OperationModeBinding' ) ;
    public final void rule__OperationModeBinding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4826:1: ( ( 'OperationModeBinding' ) )
            // InternalComponentDefinition.g:4827:1: ( 'OperationModeBinding' )
            {
            // InternalComponentDefinition.g:4827:1: ( 'OperationModeBinding' )
            // InternalComponentDefinition.g:4828:2: 'OperationModeBinding'
            {
             before(grammarAccess.getOperationModeBindingAccess().getOperationModeBindingKeyword_0()); 
            match(input,46,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4837:1: rule__OperationModeBinding__Group__1 : rule__OperationModeBinding__Group__1__Impl rule__OperationModeBinding__Group__2 ;
    public final void rule__OperationModeBinding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4841:1: ( rule__OperationModeBinding__Group__1__Impl rule__OperationModeBinding__Group__2 )
            // InternalComponentDefinition.g:4842:2: rule__OperationModeBinding__Group__1__Impl rule__OperationModeBinding__Group__2
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
    // InternalComponentDefinition.g:4849:1: rule__OperationModeBinding__Group__1__Impl : ( ( rule__OperationModeBinding__ModeAssignment_1 ) ) ;
    public final void rule__OperationModeBinding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4853:1: ( ( ( rule__OperationModeBinding__ModeAssignment_1 ) ) )
            // InternalComponentDefinition.g:4854:1: ( ( rule__OperationModeBinding__ModeAssignment_1 ) )
            {
            // InternalComponentDefinition.g:4854:1: ( ( rule__OperationModeBinding__ModeAssignment_1 ) )
            // InternalComponentDefinition.g:4855:2: ( rule__OperationModeBinding__ModeAssignment_1 )
            {
             before(grammarAccess.getOperationModeBindingAccess().getModeAssignment_1()); 
            // InternalComponentDefinition.g:4856:2: ( rule__OperationModeBinding__ModeAssignment_1 )
            // InternalComponentDefinition.g:4856:3: rule__OperationModeBinding__ModeAssignment_1
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
    // InternalComponentDefinition.g:4864:1: rule__OperationModeBinding__Group__2 : rule__OperationModeBinding__Group__2__Impl ;
    public final void rule__OperationModeBinding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4868:1: ( rule__OperationModeBinding__Group__2__Impl )
            // InternalComponentDefinition.g:4869:2: rule__OperationModeBinding__Group__2__Impl
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
    // InternalComponentDefinition.g:4875:1: rule__OperationModeBinding__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__OperationModeBinding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4879:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4880:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4880:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4881:2: ( ';' )?
            {
             before(grammarAccess.getOperationModeBindingAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:4882:2: ( ';' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==19) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalComponentDefinition.g:4882:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:4891:1: rule__DefaultTrigger__Group__0 : rule__DefaultTrigger__Group__0__Impl rule__DefaultTrigger__Group__1 ;
    public final void rule__DefaultTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4895:1: ( rule__DefaultTrigger__Group__0__Impl rule__DefaultTrigger__Group__1 )
            // InternalComponentDefinition.g:4896:2: rule__DefaultTrigger__Group__0__Impl rule__DefaultTrigger__Group__1
            {
            pushFollow(FOLLOW_38);
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
    // InternalComponentDefinition.g:4903:1: rule__DefaultTrigger__Group__0__Impl : ( 'DefaultTrigger' ) ;
    public final void rule__DefaultTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4907:1: ( ( 'DefaultTrigger' ) )
            // InternalComponentDefinition.g:4908:1: ( 'DefaultTrigger' )
            {
            // InternalComponentDefinition.g:4908:1: ( 'DefaultTrigger' )
            // InternalComponentDefinition.g:4909:2: 'DefaultTrigger'
            {
             before(grammarAccess.getDefaultTriggerAccess().getDefaultTriggerKeyword_0()); 
            match(input,47,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4918:1: rule__DefaultTrigger__Group__1 : rule__DefaultTrigger__Group__1__Impl rule__DefaultTrigger__Group__2 ;
    public final void rule__DefaultTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4922:1: ( rule__DefaultTrigger__Group__1__Impl rule__DefaultTrigger__Group__2 )
            // InternalComponentDefinition.g:4923:2: rule__DefaultTrigger__Group__1__Impl rule__DefaultTrigger__Group__2
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
    // InternalComponentDefinition.g:4930:1: rule__DefaultTrigger__Group__1__Impl : ( ( rule__DefaultTrigger__Alternatives_1 ) ) ;
    public final void rule__DefaultTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4934:1: ( ( ( rule__DefaultTrigger__Alternatives_1 ) ) )
            // InternalComponentDefinition.g:4935:1: ( ( rule__DefaultTrigger__Alternatives_1 ) )
            {
            // InternalComponentDefinition.g:4935:1: ( ( rule__DefaultTrigger__Alternatives_1 ) )
            // InternalComponentDefinition.g:4936:2: ( rule__DefaultTrigger__Alternatives_1 )
            {
             before(grammarAccess.getDefaultTriggerAccess().getAlternatives_1()); 
            // InternalComponentDefinition.g:4937:2: ( rule__DefaultTrigger__Alternatives_1 )
            // InternalComponentDefinition.g:4937:3: rule__DefaultTrigger__Alternatives_1
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
    // InternalComponentDefinition.g:4945:1: rule__DefaultTrigger__Group__2 : rule__DefaultTrigger__Group__2__Impl ;
    public final void rule__DefaultTrigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4949:1: ( rule__DefaultTrigger__Group__2__Impl )
            // InternalComponentDefinition.g:4950:2: rule__DefaultTrigger__Group__2__Impl
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
    // InternalComponentDefinition.g:4956:1: rule__DefaultTrigger__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__DefaultTrigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4960:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:4961:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:4961:1: ( ( ';' )? )
            // InternalComponentDefinition.g:4962:2: ( ';' )?
            {
             before(grammarAccess.getDefaultTriggerAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:4963:2: ( ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==19) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalComponentDefinition.g:4963:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:4972:1: rule__DefaultInputTrigger__Group__0 : rule__DefaultInputTrigger__Group__0__Impl rule__DefaultInputTrigger__Group__1 ;
    public final void rule__DefaultInputTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4976:1: ( rule__DefaultInputTrigger__Group__0__Impl rule__DefaultInputTrigger__Group__1 )
            // InternalComponentDefinition.g:4977:2: rule__DefaultInputTrigger__Group__0__Impl rule__DefaultInputTrigger__Group__1
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
    // InternalComponentDefinition.g:4984:1: rule__DefaultInputTrigger__Group__0__Impl : ( 'InputPortTrigger' ) ;
    public final void rule__DefaultInputTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:4988:1: ( ( 'InputPortTrigger' ) )
            // InternalComponentDefinition.g:4989:1: ( 'InputPortTrigger' )
            {
            // InternalComponentDefinition.g:4989:1: ( 'InputPortTrigger' )
            // InternalComponentDefinition.g:4990:2: 'InputPortTrigger'
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getInputPortTriggerKeyword_0()); 
            match(input,48,FOLLOW_2); 
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
    // InternalComponentDefinition.g:4999:1: rule__DefaultInputTrigger__Group__1 : rule__DefaultInputTrigger__Group__1__Impl rule__DefaultInputTrigger__Group__2 ;
    public final void rule__DefaultInputTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5003:1: ( rule__DefaultInputTrigger__Group__1__Impl rule__DefaultInputTrigger__Group__2 )
            // InternalComponentDefinition.g:5004:2: rule__DefaultInputTrigger__Group__1__Impl rule__DefaultInputTrigger__Group__2
            {
            pushFollow(FOLLOW_39);
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
    // InternalComponentDefinition.g:5011:1: rule__DefaultInputTrigger__Group__1__Impl : ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) ) ;
    public final void rule__DefaultInputTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5015:1: ( ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) ) )
            // InternalComponentDefinition.g:5016:1: ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5016:1: ( ( rule__DefaultInputTrigger__InputLinkAssignment_1 ) )
            // InternalComponentDefinition.g:5017:2: ( rule__DefaultInputTrigger__InputLinkAssignment_1 )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getInputLinkAssignment_1()); 
            // InternalComponentDefinition.g:5018:2: ( rule__DefaultInputTrigger__InputLinkAssignment_1 )
            // InternalComponentDefinition.g:5018:3: rule__DefaultInputTrigger__InputLinkAssignment_1
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
    // InternalComponentDefinition.g:5026:1: rule__DefaultInputTrigger__Group__2 : rule__DefaultInputTrigger__Group__2__Impl ;
    public final void rule__DefaultInputTrigger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5030:1: ( rule__DefaultInputTrigger__Group__2__Impl )
            // InternalComponentDefinition.g:5031:2: rule__DefaultInputTrigger__Group__2__Impl
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
    // InternalComponentDefinition.g:5037:1: rule__DefaultInputTrigger__Group__2__Impl : ( ( rule__DefaultInputTrigger__Group_2__0 )? ) ;
    public final void rule__DefaultInputTrigger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5041:1: ( ( ( rule__DefaultInputTrigger__Group_2__0 )? ) )
            // InternalComponentDefinition.g:5042:1: ( ( rule__DefaultInputTrigger__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:5042:1: ( ( rule__DefaultInputTrigger__Group_2__0 )? )
            // InternalComponentDefinition.g:5043:2: ( rule__DefaultInputTrigger__Group_2__0 )?
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getGroup_2()); 
            // InternalComponentDefinition.g:5044:2: ( rule__DefaultInputTrigger__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==49) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalComponentDefinition.g:5044:3: rule__DefaultInputTrigger__Group_2__0
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
    // InternalComponentDefinition.g:5053:1: rule__DefaultInputTrigger__Group_2__0 : rule__DefaultInputTrigger__Group_2__0__Impl rule__DefaultInputTrigger__Group_2__1 ;
    public final void rule__DefaultInputTrigger__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5057:1: ( rule__DefaultInputTrigger__Group_2__0__Impl rule__DefaultInputTrigger__Group_2__1 )
            // InternalComponentDefinition.g:5058:2: rule__DefaultInputTrigger__Group_2__0__Impl rule__DefaultInputTrigger__Group_2__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalComponentDefinition.g:5065:1: rule__DefaultInputTrigger__Group_2__0__Impl : ( 'prescale' ) ;
    public final void rule__DefaultInputTrigger__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5069:1: ( ( 'prescale' ) )
            // InternalComponentDefinition.g:5070:1: ( 'prescale' )
            {
            // InternalComponentDefinition.g:5070:1: ( 'prescale' )
            // InternalComponentDefinition.g:5071:2: 'prescale'
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getPrescaleKeyword_2_0()); 
            match(input,49,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5080:1: rule__DefaultInputTrigger__Group_2__1 : rule__DefaultInputTrigger__Group_2__1__Impl ;
    public final void rule__DefaultInputTrigger__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5084:1: ( rule__DefaultInputTrigger__Group_2__1__Impl )
            // InternalComponentDefinition.g:5085:2: rule__DefaultInputTrigger__Group_2__1__Impl
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
    // InternalComponentDefinition.g:5091:1: rule__DefaultInputTrigger__Group_2__1__Impl : ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) ) ;
    public final void rule__DefaultInputTrigger__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5095:1: ( ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:5096:1: ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:5096:1: ( ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 ) )
            // InternalComponentDefinition.g:5097:2: ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getPrescaleAssignment_2_1()); 
            // InternalComponentDefinition.g:5098:2: ( rule__DefaultInputTrigger__PrescaleAssignment_2_1 )
            // InternalComponentDefinition.g:5098:3: rule__DefaultInputTrigger__PrescaleAssignment_2_1
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
    // InternalComponentDefinition.g:5107:1: rule__DefaultPeriodicTimer__Group__0 : rule__DefaultPeriodicTimer__Group__0__Impl rule__DefaultPeriodicTimer__Group__1 ;
    public final void rule__DefaultPeriodicTimer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5111:1: ( rule__DefaultPeriodicTimer__Group__0__Impl rule__DefaultPeriodicTimer__Group__1 )
            // InternalComponentDefinition.g:5112:2: rule__DefaultPeriodicTimer__Group__0__Impl rule__DefaultPeriodicTimer__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalComponentDefinition.g:5119:1: rule__DefaultPeriodicTimer__Group__0__Impl : ( 'PeriodicTimer' ) ;
    public final void rule__DefaultPeriodicTimer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5123:1: ( ( 'PeriodicTimer' ) )
            // InternalComponentDefinition.g:5124:1: ( 'PeriodicTimer' )
            {
            // InternalComponentDefinition.g:5124:1: ( 'PeriodicTimer' )
            // InternalComponentDefinition.g:5125:2: 'PeriodicTimer'
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicTimerKeyword_0()); 
            match(input,50,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5134:1: rule__DefaultPeriodicTimer__Group__1 : rule__DefaultPeriodicTimer__Group__1__Impl rule__DefaultPeriodicTimer__Group__2 ;
    public final void rule__DefaultPeriodicTimer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5138:1: ( rule__DefaultPeriodicTimer__Group__1__Impl rule__DefaultPeriodicTimer__Group__2 )
            // InternalComponentDefinition.g:5139:2: rule__DefaultPeriodicTimer__Group__1__Impl rule__DefaultPeriodicTimer__Group__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalComponentDefinition.g:5146:1: rule__DefaultPeriodicTimer__Group__1__Impl : ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) ) ;
    public final void rule__DefaultPeriodicTimer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5150:1: ( ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) ) )
            // InternalComponentDefinition.g:5151:1: ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5151:1: ( ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 ) )
            // InternalComponentDefinition.g:5152:2: ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 )
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getPeriodicActFreqAssignment_1()); 
            // InternalComponentDefinition.g:5153:2: ( rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 )
            // InternalComponentDefinition.g:5153:3: rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1
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
    // InternalComponentDefinition.g:5161:1: rule__DefaultPeriodicTimer__Group__2 : rule__DefaultPeriodicTimer__Group__2__Impl ;
    public final void rule__DefaultPeriodicTimer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5165:1: ( rule__DefaultPeriodicTimer__Group__2__Impl )
            // InternalComponentDefinition.g:5166:2: rule__DefaultPeriodicTimer__Group__2__Impl
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
    // InternalComponentDefinition.g:5172:1: rule__DefaultPeriodicTimer__Group__2__Impl : ( 'Hz' ) ;
    public final void rule__DefaultPeriodicTimer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5176:1: ( ( 'Hz' ) )
            // InternalComponentDefinition.g:5177:1: ( 'Hz' )
            {
            // InternalComponentDefinition.g:5177:1: ( 'Hz' )
            // InternalComponentDefinition.g:5178:2: 'Hz'
            {
             before(grammarAccess.getDefaultPeriodicTimerAccess().getHzKeyword_2()); 
            match(input,44,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5188:1: rule__DefaultObservedElementTrigger__Group__0 : rule__DefaultObservedElementTrigger__Group__0__Impl rule__DefaultObservedElementTrigger__Group__1 ;
    public final void rule__DefaultObservedElementTrigger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5192:1: ( rule__DefaultObservedElementTrigger__Group__0__Impl rule__DefaultObservedElementTrigger__Group__1 )
            // InternalComponentDefinition.g:5193:2: rule__DefaultObservedElementTrigger__Group__0__Impl rule__DefaultObservedElementTrigger__Group__1
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
    // InternalComponentDefinition.g:5200:1: rule__DefaultObservedElementTrigger__Group__0__Impl : ( 'ObservedElement' ) ;
    public final void rule__DefaultObservedElementTrigger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5204:1: ( ( 'ObservedElement' ) )
            // InternalComponentDefinition.g:5205:1: ( 'ObservedElement' )
            {
            // InternalComponentDefinition.g:5205:1: ( 'ObservedElement' )
            // InternalComponentDefinition.g:5206:2: 'ObservedElement'
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getObservedElementKeyword_0()); 
            match(input,51,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5215:1: rule__DefaultObservedElementTrigger__Group__1 : rule__DefaultObservedElementTrigger__Group__1__Impl ;
    public final void rule__DefaultObservedElementTrigger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5219:1: ( rule__DefaultObservedElementTrigger__Group__1__Impl )
            // InternalComponentDefinition.g:5220:2: rule__DefaultObservedElementTrigger__Group__1__Impl
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
    // InternalComponentDefinition.g:5226:1: rule__DefaultObservedElementTrigger__Group__1__Impl : ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) ) ;
    public final void rule__DefaultObservedElementTrigger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5230:1: ( ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) ) )
            // InternalComponentDefinition.g:5231:1: ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5231:1: ( ( rule__DefaultObservedElementTrigger__ElementAssignment_1 ) )
            // InternalComponentDefinition.g:5232:2: ( rule__DefaultObservedElementTrigger__ElementAssignment_1 )
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getElementAssignment_1()); 
            // InternalComponentDefinition.g:5233:2: ( rule__DefaultObservedElementTrigger__ElementAssignment_1 )
            // InternalComponentDefinition.g:5233:3: rule__DefaultObservedElementTrigger__ElementAssignment_1
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
    // InternalComponentDefinition.g:5242:1: rule__OpcUaDeviceClient__Group__0 : rule__OpcUaDeviceClient__Group__0__Impl rule__OpcUaDeviceClient__Group__1 ;
    public final void rule__OpcUaDeviceClient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5246:1: ( rule__OpcUaDeviceClient__Group__0__Impl rule__OpcUaDeviceClient__Group__1 )
            // InternalComponentDefinition.g:5247:2: rule__OpcUaDeviceClient__Group__0__Impl rule__OpcUaDeviceClient__Group__1
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
    // InternalComponentDefinition.g:5254:1: rule__OpcUaDeviceClient__Group__0__Impl : ( 'OpcUaDeviceClient' ) ;
    public final void rule__OpcUaDeviceClient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5258:1: ( ( 'OpcUaDeviceClient' ) )
            // InternalComponentDefinition.g:5259:1: ( 'OpcUaDeviceClient' )
            {
            // InternalComponentDefinition.g:5259:1: ( 'OpcUaDeviceClient' )
            // InternalComponentDefinition.g:5260:2: 'OpcUaDeviceClient'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getOpcUaDeviceClientKeyword_0()); 
            match(input,52,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5269:1: rule__OpcUaDeviceClient__Group__1 : rule__OpcUaDeviceClient__Group__1__Impl rule__OpcUaDeviceClient__Group__2 ;
    public final void rule__OpcUaDeviceClient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5273:1: ( rule__OpcUaDeviceClient__Group__1__Impl rule__OpcUaDeviceClient__Group__2 )
            // InternalComponentDefinition.g:5274:2: rule__OpcUaDeviceClient__Group__1__Impl rule__OpcUaDeviceClient__Group__2
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentDefinition.g:5281:1: rule__OpcUaDeviceClient__Group__1__Impl : ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) ) ;
    public final void rule__OpcUaDeviceClient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5285:1: ( ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:5286:1: ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5286:1: ( ( rule__OpcUaDeviceClient__NameAssignment_1 ) )
            // InternalComponentDefinition.g:5287:2: ( rule__OpcUaDeviceClient__NameAssignment_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:5288:2: ( rule__OpcUaDeviceClient__NameAssignment_1 )
            // InternalComponentDefinition.g:5288:3: rule__OpcUaDeviceClient__NameAssignment_1
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
    // InternalComponentDefinition.g:5296:1: rule__OpcUaDeviceClient__Group__2 : rule__OpcUaDeviceClient__Group__2__Impl rule__OpcUaDeviceClient__Group__3 ;
    public final void rule__OpcUaDeviceClient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5300:1: ( rule__OpcUaDeviceClient__Group__2__Impl rule__OpcUaDeviceClient__Group__3 )
            // InternalComponentDefinition.g:5301:2: rule__OpcUaDeviceClient__Group__2__Impl rule__OpcUaDeviceClient__Group__3
            {
            pushFollow(FOLLOW_41);
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
    // InternalComponentDefinition.g:5308:1: rule__OpcUaDeviceClient__Group__2__Impl : ( '{' ) ;
    public final void rule__OpcUaDeviceClient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5312:1: ( ( '{' ) )
            // InternalComponentDefinition.g:5313:1: ( '{' )
            {
            // InternalComponentDefinition.g:5313:1: ( '{' )
            // InternalComponentDefinition.g:5314:2: '{'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:5323:1: rule__OpcUaDeviceClient__Group__3 : rule__OpcUaDeviceClient__Group__3__Impl rule__OpcUaDeviceClient__Group__4 ;
    public final void rule__OpcUaDeviceClient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5327:1: ( rule__OpcUaDeviceClient__Group__3__Impl rule__OpcUaDeviceClient__Group__4 )
            // InternalComponentDefinition.g:5328:2: rule__OpcUaDeviceClient__Group__3__Impl rule__OpcUaDeviceClient__Group__4
            {
            pushFollow(FOLLOW_30);
            rule__OpcUaDeviceClient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group__4();

            state._fsp--;


            }

        }
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
    // InternalComponentDefinition.g:5335:1: rule__OpcUaDeviceClient__Group__3__Impl : ( ( rule__OpcUaDeviceClient__UnorderedGroup_3 ) ) ;
    public final void rule__OpcUaDeviceClient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5339:1: ( ( ( rule__OpcUaDeviceClient__UnorderedGroup_3 ) ) )
            // InternalComponentDefinition.g:5340:1: ( ( rule__OpcUaDeviceClient__UnorderedGroup_3 ) )
            {
            // InternalComponentDefinition.g:5340:1: ( ( rule__OpcUaDeviceClient__UnorderedGroup_3 ) )
            // InternalComponentDefinition.g:5341:2: ( rule__OpcUaDeviceClient__UnorderedGroup_3 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3()); 
            // InternalComponentDefinition.g:5342:2: ( rule__OpcUaDeviceClient__UnorderedGroup_3 )
            // InternalComponentDefinition.g:5342:3: rule__OpcUaDeviceClient__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__OpcUaDeviceClient__Group__4"
    // InternalComponentDefinition.g:5350:1: rule__OpcUaDeviceClient__Group__4 : rule__OpcUaDeviceClient__Group__4__Impl ;
    public final void rule__OpcUaDeviceClient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5354:1: ( rule__OpcUaDeviceClient__Group__4__Impl )
            // InternalComponentDefinition.g:5355:2: rule__OpcUaDeviceClient__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group__4"


    // $ANTLR start "rule__OpcUaDeviceClient__Group__4__Impl"
    // InternalComponentDefinition.g:5361:1: rule__OpcUaDeviceClient__Group__4__Impl : ( '}' ) ;
    public final void rule__OpcUaDeviceClient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5365:1: ( ( '}' ) )
            // InternalComponentDefinition.g:5366:1: ( '}' )
            {
            // InternalComponentDefinition.g:5366:1: ( '}' )
            // InternalComponentDefinition.g:5367:2: '}'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getRightCurlyBracketKeyword_4()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group__4__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_0__0"
    // InternalComponentDefinition.g:5377:1: rule__OpcUaDeviceClient__Group_3_0__0 : rule__OpcUaDeviceClient__Group_3_0__0__Impl rule__OpcUaDeviceClient__Group_3_0__1 ;
    public final void rule__OpcUaDeviceClient__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5381:1: ( rule__OpcUaDeviceClient__Group_3_0__0__Impl rule__OpcUaDeviceClient__Group_3_0__1 )
            // InternalComponentDefinition.g:5382:2: rule__OpcUaDeviceClient__Group_3_0__0__Impl rule__OpcUaDeviceClient__Group_3_0__1
            {
            pushFollow(FOLLOW_11);
            rule__OpcUaDeviceClient__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_0__0"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_0__0__Impl"
    // InternalComponentDefinition.g:5389:1: rule__OpcUaDeviceClient__Group_3_0__0__Impl : ( 'deviceURI' ) ;
    public final void rule__OpcUaDeviceClient__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5393:1: ( ( 'deviceURI' ) )
            // InternalComponentDefinition.g:5394:1: ( 'deviceURI' )
            {
            // InternalComponentDefinition.g:5394:1: ( 'deviceURI' )
            // InternalComponentDefinition.g:5395:2: 'deviceURI'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIKeyword_3_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_0__0__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_0__1"
    // InternalComponentDefinition.g:5404:1: rule__OpcUaDeviceClient__Group_3_0__1 : rule__OpcUaDeviceClient__Group_3_0__1__Impl ;
    public final void rule__OpcUaDeviceClient__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5408:1: ( rule__OpcUaDeviceClient__Group_3_0__1__Impl )
            // InternalComponentDefinition.g:5409:2: rule__OpcUaDeviceClient__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_0__1"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_0__1__Impl"
    // InternalComponentDefinition.g:5415:1: rule__OpcUaDeviceClient__Group_3_0__1__Impl : ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1 ) ) ;
    public final void rule__OpcUaDeviceClient__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5419:1: ( ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1 ) ) )
            // InternalComponentDefinition.g:5420:1: ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1 ) )
            {
            // InternalComponentDefinition.g:5420:1: ( ( rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1 ) )
            // InternalComponentDefinition.g:5421:2: ( rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIAssignment_3_0_1()); 
            // InternalComponentDefinition.g:5422:2: ( rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1 )
            // InternalComponentDefinition.g:5422:3: rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_0__1__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_2__0"
    // InternalComponentDefinition.g:5431:1: rule__OpcUaDeviceClient__Group_3_2__0 : rule__OpcUaDeviceClient__Group_3_2__0__Impl rule__OpcUaDeviceClient__Group_3_2__1 ;
    public final void rule__OpcUaDeviceClient__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5435:1: ( rule__OpcUaDeviceClient__Group_3_2__0__Impl rule__OpcUaDeviceClient__Group_3_2__1 )
            // InternalComponentDefinition.g:5436:2: rule__OpcUaDeviceClient__Group_3_2__0__Impl rule__OpcUaDeviceClient__Group_3_2__1
            {
            pushFollow(FOLLOW_11);
            rule__OpcUaDeviceClient__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_2__0"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_2__0__Impl"
    // InternalComponentDefinition.g:5443:1: rule__OpcUaDeviceClient__Group_3_2__0__Impl : ( 'rootObjectPath' ) ;
    public final void rule__OpcUaDeviceClient__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5447:1: ( ( 'rootObjectPath' ) )
            // InternalComponentDefinition.g:5448:1: ( 'rootObjectPath' )
            {
            // InternalComponentDefinition.g:5448:1: ( 'rootObjectPath' )
            // InternalComponentDefinition.g:5449:2: 'rootObjectPath'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getRootObjectPathKeyword_3_2_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientAccess().getRootObjectPathKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_2__0__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_2__1"
    // InternalComponentDefinition.g:5458:1: rule__OpcUaDeviceClient__Group_3_2__1 : rule__OpcUaDeviceClient__Group_3_2__1__Impl ;
    public final void rule__OpcUaDeviceClient__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5462:1: ( rule__OpcUaDeviceClient__Group_3_2__1__Impl )
            // InternalComponentDefinition.g:5463:2: rule__OpcUaDeviceClient__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_2__1"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_2__1__Impl"
    // InternalComponentDefinition.g:5469:1: rule__OpcUaDeviceClient__Group_3_2__1__Impl : ( ( rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1 ) ) ;
    public final void rule__OpcUaDeviceClient__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5473:1: ( ( ( rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1 ) ) )
            // InternalComponentDefinition.g:5474:1: ( ( rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1 ) )
            {
            // InternalComponentDefinition.g:5474:1: ( ( rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1 ) )
            // InternalComponentDefinition.g:5475:2: ( rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getRootObjectPathAssignment_3_2_1()); 
            // InternalComponentDefinition.g:5476:2: ( rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1 )
            // InternalComponentDefinition.g:5476:3: rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientAccess().getRootObjectPathAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_2__1__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_3__0"
    // InternalComponentDefinition.g:5485:1: rule__OpcUaDeviceClient__Group_3_3__0 : rule__OpcUaDeviceClient__Group_3_3__0__Impl rule__OpcUaDeviceClient__Group_3_3__1 ;
    public final void rule__OpcUaDeviceClient__Group_3_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5489:1: ( rule__OpcUaDeviceClient__Group_3_3__0__Impl rule__OpcUaDeviceClient__Group_3_3__1 )
            // InternalComponentDefinition.g:5490:2: rule__OpcUaDeviceClient__Group_3_3__0__Impl rule__OpcUaDeviceClient__Group_3_3__1
            {
            pushFollow(FOLLOW_11);
            rule__OpcUaDeviceClient__Group_3_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group_3_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_3__0"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_3__0__Impl"
    // InternalComponentDefinition.g:5497:1: rule__OpcUaDeviceClient__Group_3_3__0__Impl : ( 'opcuaXmlFile' ) ;
    public final void rule__OpcUaDeviceClient__Group_3_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5501:1: ( ( 'opcuaXmlFile' ) )
            // InternalComponentDefinition.g:5502:1: ( 'opcuaXmlFile' )
            {
            // InternalComponentDefinition.g:5502:1: ( 'opcuaXmlFile' )
            // InternalComponentDefinition.g:5503:2: 'opcuaXmlFile'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileKeyword_3_3_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileKeyword_3_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_3__0__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_3__1"
    // InternalComponentDefinition.g:5512:1: rule__OpcUaDeviceClient__Group_3_3__1 : rule__OpcUaDeviceClient__Group_3_3__1__Impl ;
    public final void rule__OpcUaDeviceClient__Group_3_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5516:1: ( rule__OpcUaDeviceClient__Group_3_3__1__Impl )
            // InternalComponentDefinition.g:5517:2: rule__OpcUaDeviceClient__Group_3_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__Group_3_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_3__1"


    // $ANTLR start "rule__OpcUaDeviceClient__Group_3_3__1__Impl"
    // InternalComponentDefinition.g:5523:1: rule__OpcUaDeviceClient__Group_3_3__1__Impl : ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1 ) ) ;
    public final void rule__OpcUaDeviceClient__Group_3_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5527:1: ( ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1 ) ) )
            // InternalComponentDefinition.g:5528:1: ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1 ) )
            {
            // InternalComponentDefinition.g:5528:1: ( ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1 ) )
            // InternalComponentDefinition.g:5529:2: ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileAssignment_3_3_1()); 
            // InternalComponentDefinition.g:5530:2: ( rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1 )
            // InternalComponentDefinition.g:5530:3: rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileAssignment_3_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__Group_3_3__1__Impl"


    // $ANTLR start "rule__OpcUaReadServer__Group__0"
    // InternalComponentDefinition.g:5539:1: rule__OpcUaReadServer__Group__0 : rule__OpcUaReadServer__Group__0__Impl rule__OpcUaReadServer__Group__1 ;
    public final void rule__OpcUaReadServer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5543:1: ( rule__OpcUaReadServer__Group__0__Impl rule__OpcUaReadServer__Group__1 )
            // InternalComponentDefinition.g:5544:2: rule__OpcUaReadServer__Group__0__Impl rule__OpcUaReadServer__Group__1
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
    // InternalComponentDefinition.g:5551:1: rule__OpcUaReadServer__Group__0__Impl : ( 'OpcUaReadServer' ) ;
    public final void rule__OpcUaReadServer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5555:1: ( ( 'OpcUaReadServer' ) )
            // InternalComponentDefinition.g:5556:1: ( 'OpcUaReadServer' )
            {
            // InternalComponentDefinition.g:5556:1: ( 'OpcUaReadServer' )
            // InternalComponentDefinition.g:5557:2: 'OpcUaReadServer'
            {
             before(grammarAccess.getOpcUaReadServerAccess().getOpcUaReadServerKeyword_0()); 
            match(input,56,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5566:1: rule__OpcUaReadServer__Group__1 : rule__OpcUaReadServer__Group__1__Impl rule__OpcUaReadServer__Group__2 ;
    public final void rule__OpcUaReadServer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5570:1: ( rule__OpcUaReadServer__Group__1__Impl rule__OpcUaReadServer__Group__2 )
            // InternalComponentDefinition.g:5571:2: rule__OpcUaReadServer__Group__1__Impl rule__OpcUaReadServer__Group__2
            {
            pushFollow(FOLLOW_42);
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
    // InternalComponentDefinition.g:5578:1: rule__OpcUaReadServer__Group__1__Impl : ( ( rule__OpcUaReadServer__NameAssignment_1 ) ) ;
    public final void rule__OpcUaReadServer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5582:1: ( ( ( rule__OpcUaReadServer__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:5583:1: ( ( rule__OpcUaReadServer__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5583:1: ( ( rule__OpcUaReadServer__NameAssignment_1 ) )
            // InternalComponentDefinition.g:5584:2: ( rule__OpcUaReadServer__NameAssignment_1 )
            {
             before(grammarAccess.getOpcUaReadServerAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:5585:2: ( rule__OpcUaReadServer__NameAssignment_1 )
            // InternalComponentDefinition.g:5585:3: rule__OpcUaReadServer__NameAssignment_1
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
    // InternalComponentDefinition.g:5593:1: rule__OpcUaReadServer__Group__2 : rule__OpcUaReadServer__Group__2__Impl rule__OpcUaReadServer__Group__3 ;
    public final void rule__OpcUaReadServer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5597:1: ( rule__OpcUaReadServer__Group__2__Impl rule__OpcUaReadServer__Group__3 )
            // InternalComponentDefinition.g:5598:2: rule__OpcUaReadServer__Group__2__Impl rule__OpcUaReadServer__Group__3
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
    // InternalComponentDefinition.g:5605:1: rule__OpcUaReadServer__Group__2__Impl : ( 'dataProviderPort' ) ;
    public final void rule__OpcUaReadServer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5609:1: ( ( 'dataProviderPort' ) )
            // InternalComponentDefinition.g:5610:1: ( 'dataProviderPort' )
            {
            // InternalComponentDefinition.g:5610:1: ( 'dataProviderPort' )
            // InternalComponentDefinition.g:5611:2: 'dataProviderPort'
            {
             before(grammarAccess.getOpcUaReadServerAccess().getDataProviderPortKeyword_2()); 
            match(input,57,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5620:1: rule__OpcUaReadServer__Group__3 : rule__OpcUaReadServer__Group__3__Impl rule__OpcUaReadServer__Group__4 ;
    public final void rule__OpcUaReadServer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5624:1: ( rule__OpcUaReadServer__Group__3__Impl rule__OpcUaReadServer__Group__4 )
            // InternalComponentDefinition.g:5625:2: rule__OpcUaReadServer__Group__3__Impl rule__OpcUaReadServer__Group__4
            {
            pushFollow(FOLLOW_43);
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
    // InternalComponentDefinition.g:5632:1: rule__OpcUaReadServer__Group__3__Impl : ( ( rule__OpcUaReadServer__OutPortAssignment_3 ) ) ;
    public final void rule__OpcUaReadServer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5636:1: ( ( ( rule__OpcUaReadServer__OutPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:5637:1: ( ( rule__OpcUaReadServer__OutPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:5637:1: ( ( rule__OpcUaReadServer__OutPortAssignment_3 ) )
            // InternalComponentDefinition.g:5638:2: ( rule__OpcUaReadServer__OutPortAssignment_3 )
            {
             before(grammarAccess.getOpcUaReadServerAccess().getOutPortAssignment_3()); 
            // InternalComponentDefinition.g:5639:2: ( rule__OpcUaReadServer__OutPortAssignment_3 )
            // InternalComponentDefinition.g:5639:3: rule__OpcUaReadServer__OutPortAssignment_3
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
    // InternalComponentDefinition.g:5647:1: rule__OpcUaReadServer__Group__4 : rule__OpcUaReadServer__Group__4__Impl rule__OpcUaReadServer__Group__5 ;
    public final void rule__OpcUaReadServer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5651:1: ( rule__OpcUaReadServer__Group__4__Impl rule__OpcUaReadServer__Group__5 )
            // InternalComponentDefinition.g:5652:2: rule__OpcUaReadServer__Group__4__Impl rule__OpcUaReadServer__Group__5
            {
            pushFollow(FOLLOW_43);
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
    // InternalComponentDefinition.g:5659:1: rule__OpcUaReadServer__Group__4__Impl : ( ( rule__OpcUaReadServer__Group_4__0 )? ) ;
    public final void rule__OpcUaReadServer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5663:1: ( ( ( rule__OpcUaReadServer__Group_4__0 )? ) )
            // InternalComponentDefinition.g:5664:1: ( ( rule__OpcUaReadServer__Group_4__0 )? )
            {
            // InternalComponentDefinition.g:5664:1: ( ( rule__OpcUaReadServer__Group_4__0 )? )
            // InternalComponentDefinition.g:5665:2: ( rule__OpcUaReadServer__Group_4__0 )?
            {
             before(grammarAccess.getOpcUaReadServerAccess().getGroup_4()); 
            // InternalComponentDefinition.g:5666:2: ( rule__OpcUaReadServer__Group_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==58) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalComponentDefinition.g:5666:3: rule__OpcUaReadServer__Group_4__0
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
    // InternalComponentDefinition.g:5674:1: rule__OpcUaReadServer__Group__5 : rule__OpcUaReadServer__Group__5__Impl ;
    public final void rule__OpcUaReadServer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5678:1: ( rule__OpcUaReadServer__Group__5__Impl )
            // InternalComponentDefinition.g:5679:2: rule__OpcUaReadServer__Group__5__Impl
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
    // InternalComponentDefinition.g:5685:1: rule__OpcUaReadServer__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaReadServer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5689:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:5690:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:5690:1: ( ( ';' )? )
            // InternalComponentDefinition.g:5691:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaReadServerAccess().getSemicolonKeyword_5()); 
            // InternalComponentDefinition.g:5692:2: ( ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==19) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalComponentDefinition.g:5692:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:5701:1: rule__OpcUaReadServer__Group_4__0 : rule__OpcUaReadServer__Group_4__0__Impl rule__OpcUaReadServer__Group_4__1 ;
    public final void rule__OpcUaReadServer__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5705:1: ( rule__OpcUaReadServer__Group_4__0__Impl rule__OpcUaReadServer__Group_4__1 )
            // InternalComponentDefinition.g:5706:2: rule__OpcUaReadServer__Group_4__0__Impl rule__OpcUaReadServer__Group_4__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalComponentDefinition.g:5713:1: rule__OpcUaReadServer__Group_4__0__Impl : ( 'portNumber' ) ;
    public final void rule__OpcUaReadServer__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5717:1: ( ( 'portNumber' ) )
            // InternalComponentDefinition.g:5718:1: ( 'portNumber' )
            {
            // InternalComponentDefinition.g:5718:1: ( 'portNumber' )
            // InternalComponentDefinition.g:5719:2: 'portNumber'
            {
             before(grammarAccess.getOpcUaReadServerAccess().getPortNumberKeyword_4_0()); 
            match(input,58,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5728:1: rule__OpcUaReadServer__Group_4__1 : rule__OpcUaReadServer__Group_4__1__Impl ;
    public final void rule__OpcUaReadServer__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5732:1: ( rule__OpcUaReadServer__Group_4__1__Impl )
            // InternalComponentDefinition.g:5733:2: rule__OpcUaReadServer__Group_4__1__Impl
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
    // InternalComponentDefinition.g:5739:1: rule__OpcUaReadServer__Group_4__1__Impl : ( ( rule__OpcUaReadServer__PortNumberAssignment_4_1 ) ) ;
    public final void rule__OpcUaReadServer__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5743:1: ( ( ( rule__OpcUaReadServer__PortNumberAssignment_4_1 ) ) )
            // InternalComponentDefinition.g:5744:1: ( ( rule__OpcUaReadServer__PortNumberAssignment_4_1 ) )
            {
            // InternalComponentDefinition.g:5744:1: ( ( rule__OpcUaReadServer__PortNumberAssignment_4_1 ) )
            // InternalComponentDefinition.g:5745:2: ( rule__OpcUaReadServer__PortNumberAssignment_4_1 )
            {
             before(grammarAccess.getOpcUaReadServerAccess().getPortNumberAssignment_4_1()); 
            // InternalComponentDefinition.g:5746:2: ( rule__OpcUaReadServer__PortNumberAssignment_4_1 )
            // InternalComponentDefinition.g:5746:3: rule__OpcUaReadServer__PortNumberAssignment_4_1
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
    // InternalComponentDefinition.g:5755:1: rule__MixedPortROS__Group__0 : rule__MixedPortROS__Group__0__Impl rule__MixedPortROS__Group__1 ;
    public final void rule__MixedPortROS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5759:1: ( rule__MixedPortROS__Group__0__Impl rule__MixedPortROS__Group__1 )
            // InternalComponentDefinition.g:5760:2: rule__MixedPortROS__Group__0__Impl rule__MixedPortROS__Group__1
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
    // InternalComponentDefinition.g:5767:1: rule__MixedPortROS__Group__0__Impl : ( 'MixedPortROS' ) ;
    public final void rule__MixedPortROS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5771:1: ( ( 'MixedPortROS' ) )
            // InternalComponentDefinition.g:5772:1: ( 'MixedPortROS' )
            {
            // InternalComponentDefinition.g:5772:1: ( 'MixedPortROS' )
            // InternalComponentDefinition.g:5773:2: 'MixedPortROS'
            {
             before(grammarAccess.getMixedPortROSAccess().getMixedPortROSKeyword_0()); 
            match(input,59,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5782:1: rule__MixedPortROS__Group__1 : rule__MixedPortROS__Group__1__Impl rule__MixedPortROS__Group__2 ;
    public final void rule__MixedPortROS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5786:1: ( rule__MixedPortROS__Group__1__Impl rule__MixedPortROS__Group__2 )
            // InternalComponentDefinition.g:5787:2: rule__MixedPortROS__Group__1__Impl rule__MixedPortROS__Group__2
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
    // InternalComponentDefinition.g:5794:1: rule__MixedPortROS__Group__1__Impl : ( ( rule__MixedPortROS__PortAssignment_1 ) ) ;
    public final void rule__MixedPortROS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5798:1: ( ( ( rule__MixedPortROS__PortAssignment_1 ) ) )
            // InternalComponentDefinition.g:5799:1: ( ( rule__MixedPortROS__PortAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5799:1: ( ( rule__MixedPortROS__PortAssignment_1 ) )
            // InternalComponentDefinition.g:5800:2: ( rule__MixedPortROS__PortAssignment_1 )
            {
             before(grammarAccess.getMixedPortROSAccess().getPortAssignment_1()); 
            // InternalComponentDefinition.g:5801:2: ( rule__MixedPortROS__PortAssignment_1 )
            // InternalComponentDefinition.g:5801:3: rule__MixedPortROS__PortAssignment_1
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
    // InternalComponentDefinition.g:5809:1: rule__MixedPortROS__Group__2 : rule__MixedPortROS__Group__2__Impl ;
    public final void rule__MixedPortROS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5813:1: ( rule__MixedPortROS__Group__2__Impl )
            // InternalComponentDefinition.g:5814:2: rule__MixedPortROS__Group__2__Impl
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
    // InternalComponentDefinition.g:5820:1: rule__MixedPortROS__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__MixedPortROS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5824:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:5825:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:5825:1: ( ( ';' )? )
            // InternalComponentDefinition.g:5826:2: ( ';' )?
            {
             before(grammarAccess.getMixedPortROSAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:5827:2: ( ';' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==19) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalComponentDefinition.g:5827:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:5836:1: rule__MixedPortYARP__Group__0 : rule__MixedPortYARP__Group__0__Impl rule__MixedPortYARP__Group__1 ;
    public final void rule__MixedPortYARP__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5840:1: ( rule__MixedPortYARP__Group__0__Impl rule__MixedPortYARP__Group__1 )
            // InternalComponentDefinition.g:5841:2: rule__MixedPortYARP__Group__0__Impl rule__MixedPortYARP__Group__1
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
    // InternalComponentDefinition.g:5848:1: rule__MixedPortYARP__Group__0__Impl : ( 'MixedPortYARP' ) ;
    public final void rule__MixedPortYARP__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5852:1: ( ( 'MixedPortYARP' ) )
            // InternalComponentDefinition.g:5853:1: ( 'MixedPortYARP' )
            {
            // InternalComponentDefinition.g:5853:1: ( 'MixedPortYARP' )
            // InternalComponentDefinition.g:5854:2: 'MixedPortYARP'
            {
             before(grammarAccess.getMixedPortYARPAccess().getMixedPortYARPKeyword_0()); 
            match(input,60,FOLLOW_2); 
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
    // InternalComponentDefinition.g:5863:1: rule__MixedPortYARP__Group__1 : rule__MixedPortYARP__Group__1__Impl rule__MixedPortYARP__Group__2 ;
    public final void rule__MixedPortYARP__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5867:1: ( rule__MixedPortYARP__Group__1__Impl rule__MixedPortYARP__Group__2 )
            // InternalComponentDefinition.g:5868:2: rule__MixedPortYARP__Group__1__Impl rule__MixedPortYARP__Group__2
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
    // InternalComponentDefinition.g:5875:1: rule__MixedPortYARP__Group__1__Impl : ( ( rule__MixedPortYARP__PortAssignment_1 ) ) ;
    public final void rule__MixedPortYARP__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5879:1: ( ( ( rule__MixedPortYARP__PortAssignment_1 ) ) )
            // InternalComponentDefinition.g:5880:1: ( ( rule__MixedPortYARP__PortAssignment_1 ) )
            {
            // InternalComponentDefinition.g:5880:1: ( ( rule__MixedPortYARP__PortAssignment_1 ) )
            // InternalComponentDefinition.g:5881:2: ( rule__MixedPortYARP__PortAssignment_1 )
            {
             before(grammarAccess.getMixedPortYARPAccess().getPortAssignment_1()); 
            // InternalComponentDefinition.g:5882:2: ( rule__MixedPortYARP__PortAssignment_1 )
            // InternalComponentDefinition.g:5882:3: rule__MixedPortYARP__PortAssignment_1
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
    // InternalComponentDefinition.g:5890:1: rule__MixedPortYARP__Group__2 : rule__MixedPortYARP__Group__2__Impl ;
    public final void rule__MixedPortYARP__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5894:1: ( rule__MixedPortYARP__Group__2__Impl )
            // InternalComponentDefinition.g:5895:2: rule__MixedPortYARP__Group__2__Impl
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
    // InternalComponentDefinition.g:5901:1: rule__MixedPortYARP__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__MixedPortYARP__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5905:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:5906:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:5906:1: ( ( ';' )? )
            // InternalComponentDefinition.g:5907:2: ( ';' )?
            {
             before(grammarAccess.getMixedPortYARPAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:5908:2: ( ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==19) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalComponentDefinition.g:5908:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:5917:1: rule__CoordinationSlavePort__Group__0 : rule__CoordinationSlavePort__Group__0__Impl rule__CoordinationSlavePort__Group__1 ;
    public final void rule__CoordinationSlavePort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5921:1: ( rule__CoordinationSlavePort__Group__0__Impl rule__CoordinationSlavePort__Group__1 )
            // InternalComponentDefinition.g:5922:2: rule__CoordinationSlavePort__Group__0__Impl rule__CoordinationSlavePort__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalComponentDefinition.g:5929:1: rule__CoordinationSlavePort__Group__0__Impl : ( ( rule__CoordinationSlavePort__DocumentationAssignment_0 )? ) ;
    public final void rule__CoordinationSlavePort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5933:1: ( ( ( rule__CoordinationSlavePort__DocumentationAssignment_0 )? ) )
            // InternalComponentDefinition.g:5934:1: ( ( rule__CoordinationSlavePort__DocumentationAssignment_0 )? )
            {
            // InternalComponentDefinition.g:5934:1: ( ( rule__CoordinationSlavePort__DocumentationAssignment_0 )? )
            // InternalComponentDefinition.g:5935:2: ( rule__CoordinationSlavePort__DocumentationAssignment_0 )?
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getDocumentationAssignment_0()); 
            // InternalComponentDefinition.g:5936:2: ( rule__CoordinationSlavePort__DocumentationAssignment_0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_DOCU_COMMENT) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalComponentDefinition.g:5936:3: rule__CoordinationSlavePort__DocumentationAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CoordinationSlavePort__DocumentationAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCoordinationSlavePortAccess().getDocumentationAssignment_0()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:5944:1: rule__CoordinationSlavePort__Group__1 : rule__CoordinationSlavePort__Group__1__Impl rule__CoordinationSlavePort__Group__2 ;
    public final void rule__CoordinationSlavePort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5948:1: ( rule__CoordinationSlavePort__Group__1__Impl rule__CoordinationSlavePort__Group__2 )
            // InternalComponentDefinition.g:5949:2: rule__CoordinationSlavePort__Group__1__Impl rule__CoordinationSlavePort__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:5956:1: rule__CoordinationSlavePort__Group__1__Impl : ( 'CoordinationSlavePort' ) ;
    public final void rule__CoordinationSlavePort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5960:1: ( ( 'CoordinationSlavePort' ) )
            // InternalComponentDefinition.g:5961:1: ( 'CoordinationSlavePort' )
            {
            // InternalComponentDefinition.g:5961:1: ( 'CoordinationSlavePort' )
            // InternalComponentDefinition.g:5962:2: 'CoordinationSlavePort'
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getCoordinationSlavePortKeyword_1()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortAccess().getCoordinationSlavePortKeyword_1()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:5971:1: rule__CoordinationSlavePort__Group__2 : rule__CoordinationSlavePort__Group__2__Impl rule__CoordinationSlavePort__Group__3 ;
    public final void rule__CoordinationSlavePort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5975:1: ( rule__CoordinationSlavePort__Group__2__Impl rule__CoordinationSlavePort__Group__3 )
            // InternalComponentDefinition.g:5976:2: rule__CoordinationSlavePort__Group__2__Impl rule__CoordinationSlavePort__Group__3
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentDefinition.g:5983:1: rule__CoordinationSlavePort__Group__2__Impl : ( ( rule__CoordinationSlavePort__NameAssignment_2 ) ) ;
    public final void rule__CoordinationSlavePort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:5987:1: ( ( ( rule__CoordinationSlavePort__NameAssignment_2 ) ) )
            // InternalComponentDefinition.g:5988:1: ( ( rule__CoordinationSlavePort__NameAssignment_2 ) )
            {
            // InternalComponentDefinition.g:5988:1: ( ( rule__CoordinationSlavePort__NameAssignment_2 ) )
            // InternalComponentDefinition.g:5989:2: ( rule__CoordinationSlavePort__NameAssignment_2 )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getNameAssignment_2()); 
            // InternalComponentDefinition.g:5990:2: ( rule__CoordinationSlavePort__NameAssignment_2 )
            // InternalComponentDefinition.g:5990:3: rule__CoordinationSlavePort__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortAccess().getNameAssignment_2()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:5998:1: rule__CoordinationSlavePort__Group__3 : rule__CoordinationSlavePort__Group__3__Impl rule__CoordinationSlavePort__Group__4 ;
    public final void rule__CoordinationSlavePort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6002:1: ( rule__CoordinationSlavePort__Group__3__Impl rule__CoordinationSlavePort__Group__4 )
            // InternalComponentDefinition.g:6003:2: rule__CoordinationSlavePort__Group__3__Impl rule__CoordinationSlavePort__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:6010:1: rule__CoordinationSlavePort__Group__3__Impl : ( 'implements' ) ;
    public final void rule__CoordinationSlavePort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6014:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:6015:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:6015:1: ( 'implements' )
            // InternalComponentDefinition.g:6016:2: 'implements'
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getImplementsKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortAccess().getImplementsKeyword_3()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:6025:1: rule__CoordinationSlavePort__Group__4 : rule__CoordinationSlavePort__Group__4__Impl rule__CoordinationSlavePort__Group__5 ;
    public final void rule__CoordinationSlavePort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6029:1: ( rule__CoordinationSlavePort__Group__4__Impl rule__CoordinationSlavePort__Group__5 )
            // InternalComponentDefinition.g:6030:2: rule__CoordinationSlavePort__Group__4__Impl rule__CoordinationSlavePort__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentDefinition.g:6037:1: rule__CoordinationSlavePort__Group__4__Impl : ( ( rule__CoordinationSlavePort__ServiceAssignment_4 ) ) ;
    public final void rule__CoordinationSlavePort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6041:1: ( ( ( rule__CoordinationSlavePort__ServiceAssignment_4 ) ) )
            // InternalComponentDefinition.g:6042:1: ( ( rule__CoordinationSlavePort__ServiceAssignment_4 ) )
            {
            // InternalComponentDefinition.g:6042:1: ( ( rule__CoordinationSlavePort__ServiceAssignment_4 ) )
            // InternalComponentDefinition.g:6043:2: ( rule__CoordinationSlavePort__ServiceAssignment_4 )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getServiceAssignment_4()); 
            // InternalComponentDefinition.g:6044:2: ( rule__CoordinationSlavePort__ServiceAssignment_4 )
            // InternalComponentDefinition.g:6044:3: rule__CoordinationSlavePort__ServiceAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__ServiceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationSlavePortAccess().getServiceAssignment_4()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:6052:1: rule__CoordinationSlavePort__Group__5 : rule__CoordinationSlavePort__Group__5__Impl rule__CoordinationSlavePort__Group__6 ;
    public final void rule__CoordinationSlavePort__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6056:1: ( rule__CoordinationSlavePort__Group__5__Impl rule__CoordinationSlavePort__Group__6 )
            // InternalComponentDefinition.g:6057:2: rule__CoordinationSlavePort__Group__5__Impl rule__CoordinationSlavePort__Group__6
            {
            pushFollow(FOLLOW_45);
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
    // InternalComponentDefinition.g:6064:1: rule__CoordinationSlavePort__Group__5__Impl : ( '{' ) ;
    public final void rule__CoordinationSlavePort__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6068:1: ( ( '{' ) )
            // InternalComponentDefinition.g:6069:1: ( '{' )
            {
            // InternalComponentDefinition.g:6069:1: ( '{' )
            // InternalComponentDefinition.g:6070:2: '{'
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:6079:1: rule__CoordinationSlavePort__Group__6 : rule__CoordinationSlavePort__Group__6__Impl rule__CoordinationSlavePort__Group__7 ;
    public final void rule__CoordinationSlavePort__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6083:1: ( rule__CoordinationSlavePort__Group__6__Impl rule__CoordinationSlavePort__Group__7 )
            // InternalComponentDefinition.g:6084:2: rule__CoordinationSlavePort__Group__6__Impl rule__CoordinationSlavePort__Group__7
            {
            pushFollow(FOLLOW_45);
            rule__CoordinationSlavePort__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__Group__7();

            state._fsp--;


            }

        }
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
    // InternalComponentDefinition.g:6091:1: rule__CoordinationSlavePort__Group__6__Impl : ( ( rule__CoordinationSlavePort__ElementsAssignment_6 )* ) ;
    public final void rule__CoordinationSlavePort__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6095:1: ( ( ( rule__CoordinationSlavePort__ElementsAssignment_6 )* ) )
            // InternalComponentDefinition.g:6096:1: ( ( rule__CoordinationSlavePort__ElementsAssignment_6 )* )
            {
            // InternalComponentDefinition.g:6096:1: ( ( rule__CoordinationSlavePort__ElementsAssignment_6 )* )
            // InternalComponentDefinition.g:6097:2: ( rule__CoordinationSlavePort__ElementsAssignment_6 )*
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getElementsAssignment_6()); 
            // InternalComponentDefinition.g:6098:2: ( rule__CoordinationSlavePort__ElementsAssignment_6 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==RULE_DOCU_COMMENT||(LA51_0>=62 && LA51_0<=64)||LA51_0==69||LA51_0==81) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalComponentDefinition.g:6098:3: rule__CoordinationSlavePort__ElementsAssignment_6
            	    {
            	    pushFollow(FOLLOW_46);
            	    rule__CoordinationSlavePort__ElementsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

             after(grammarAccess.getCoordinationSlavePortAccess().getElementsAssignment_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__CoordinationSlavePort__Group__7"
    // InternalComponentDefinition.g:6106:1: rule__CoordinationSlavePort__Group__7 : rule__CoordinationSlavePort__Group__7__Impl ;
    public final void rule__CoordinationSlavePort__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6110:1: ( rule__CoordinationSlavePort__Group__7__Impl )
            // InternalComponentDefinition.g:6111:2: rule__CoordinationSlavePort__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationSlavePort__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__7"


    // $ANTLR start "rule__CoordinationSlavePort__Group__7__Impl"
    // InternalComponentDefinition.g:6117:1: rule__CoordinationSlavePort__Group__7__Impl : ( '}' ) ;
    public final void rule__CoordinationSlavePort__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6121:1: ( ( '}' ) )
            // InternalComponentDefinition.g:6122:1: ( '}' )
            {
            // InternalComponentDefinition.g:6122:1: ( '}' )
            // InternalComponentDefinition.g:6123:2: '}'
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__Group__7__Impl"


    // $ANTLR start "rule__SkillRealizationsRef__Group__0"
    // InternalComponentDefinition.g:6133:1: rule__SkillRealizationsRef__Group__0 : rule__SkillRealizationsRef__Group__0__Impl rule__SkillRealizationsRef__Group__1 ;
    public final void rule__SkillRealizationsRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6137:1: ( rule__SkillRealizationsRef__Group__0__Impl rule__SkillRealizationsRef__Group__1 )
            // InternalComponentDefinition.g:6138:2: rule__SkillRealizationsRef__Group__0__Impl rule__SkillRealizationsRef__Group__1
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
    // InternalComponentDefinition.g:6145:1: rule__SkillRealizationsRef__Group__0__Impl : ( 'SkillRealizationsRef' ) ;
    public final void rule__SkillRealizationsRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6149:1: ( ( 'SkillRealizationsRef' ) )
            // InternalComponentDefinition.g:6150:1: ( 'SkillRealizationsRef' )
            {
            // InternalComponentDefinition.g:6150:1: ( 'SkillRealizationsRef' )
            // InternalComponentDefinition.g:6151:2: 'SkillRealizationsRef'
            {
             before(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationsRefKeyword_0()); 
            match(input,62,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6160:1: rule__SkillRealizationsRef__Group__1 : rule__SkillRealizationsRef__Group__1__Impl rule__SkillRealizationsRef__Group__2 ;
    public final void rule__SkillRealizationsRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6164:1: ( rule__SkillRealizationsRef__Group__1__Impl rule__SkillRealizationsRef__Group__2 )
            // InternalComponentDefinition.g:6165:2: rule__SkillRealizationsRef__Group__1__Impl rule__SkillRealizationsRef__Group__2
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
    // InternalComponentDefinition.g:6172:1: rule__SkillRealizationsRef__Group__1__Impl : ( ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 ) ) ;
    public final void rule__SkillRealizationsRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6176:1: ( ( ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 ) ) )
            // InternalComponentDefinition.g:6177:1: ( ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 ) )
            {
            // InternalComponentDefinition.g:6177:1: ( ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 ) )
            // InternalComponentDefinition.g:6178:2: ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 )
            {
             before(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefAssignment_1()); 
            // InternalComponentDefinition.g:6179:2: ( rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 )
            // InternalComponentDefinition.g:6179:3: rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1
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
    // InternalComponentDefinition.g:6187:1: rule__SkillRealizationsRef__Group__2 : rule__SkillRealizationsRef__Group__2__Impl ;
    public final void rule__SkillRealizationsRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6191:1: ( rule__SkillRealizationsRef__Group__2__Impl )
            // InternalComponentDefinition.g:6192:2: rule__SkillRealizationsRef__Group__2__Impl
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
    // InternalComponentDefinition.g:6198:1: rule__SkillRealizationsRef__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__SkillRealizationsRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6202:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:6203:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:6203:1: ( ( ';' )? )
            // InternalComponentDefinition.g:6204:2: ( ';' )?
            {
             before(grammarAccess.getSkillRealizationsRefAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:6205:2: ( ';' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==19) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalComponentDefinition.g:6205:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:6214:1: rule__CommunicationServiceUsageRealization__Group__0 : rule__CommunicationServiceUsageRealization__Group__0__Impl rule__CommunicationServiceUsageRealization__Group__1 ;
    public final void rule__CommunicationServiceUsageRealization__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6218:1: ( rule__CommunicationServiceUsageRealization__Group__0__Impl rule__CommunicationServiceUsageRealization__Group__1 )
            // InternalComponentDefinition.g:6219:2: rule__CommunicationServiceUsageRealization__Group__0__Impl rule__CommunicationServiceUsageRealization__Group__1
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
    // InternalComponentDefinition.g:6226:1: rule__CommunicationServiceUsageRealization__Group__0__Impl : ( 'with' ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6230:1: ( ( 'with' ) )
            // InternalComponentDefinition.g:6231:1: ( 'with' )
            {
            // InternalComponentDefinition.g:6231:1: ( 'with' )
            // InternalComponentDefinition.g:6232:2: 'with'
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getWithKeyword_0()); 
            match(input,63,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6241:1: rule__CommunicationServiceUsageRealization__Group__1 : rule__CommunicationServiceUsageRealization__Group__1__Impl rule__CommunicationServiceUsageRealization__Group__2 ;
    public final void rule__CommunicationServiceUsageRealization__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6245:1: ( rule__CommunicationServiceUsageRealization__Group__1__Impl rule__CommunicationServiceUsageRealization__Group__2 )
            // InternalComponentDefinition.g:6246:2: rule__CommunicationServiceUsageRealization__Group__1__Impl rule__CommunicationServiceUsageRealization__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentDefinition.g:6253:1: rule__CommunicationServiceUsageRealization__Group__1__Impl : ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6257:1: ( ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) ) )
            // InternalComponentDefinition.g:6258:1: ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) )
            {
            // InternalComponentDefinition.g:6258:1: ( ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 ) )
            // InternalComponentDefinition.g:6259:2: ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageAssignment_1()); 
            // InternalComponentDefinition.g:6260:2: ( rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 )
            // InternalComponentDefinition.g:6260:3: rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1
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
    // InternalComponentDefinition.g:6268:1: rule__CommunicationServiceUsageRealization__Group__2 : rule__CommunicationServiceUsageRealization__Group__2__Impl rule__CommunicationServiceUsageRealization__Group__3 ;
    public final void rule__CommunicationServiceUsageRealization__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6272:1: ( rule__CommunicationServiceUsageRealization__Group__2__Impl rule__CommunicationServiceUsageRealization__Group__3 )
            // InternalComponentDefinition.g:6273:2: rule__CommunicationServiceUsageRealization__Group__2__Impl rule__CommunicationServiceUsageRealization__Group__3
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
    // InternalComponentDefinition.g:6280:1: rule__CommunicationServiceUsageRealization__Group__2__Impl : ( 'realizedBy' ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6284:1: ( ( 'realizedBy' ) )
            // InternalComponentDefinition.g:6285:1: ( 'realizedBy' )
            {
            // InternalComponentDefinition.g:6285:1: ( 'realizedBy' )
            // InternalComponentDefinition.g:6286:2: 'realizedBy'
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getRealizedByKeyword_2()); 
            match(input,27,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6295:1: rule__CommunicationServiceUsageRealization__Group__3 : rule__CommunicationServiceUsageRealization__Group__3__Impl ;
    public final void rule__CommunicationServiceUsageRealization__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6299:1: ( rule__CommunicationServiceUsageRealization__Group__3__Impl )
            // InternalComponentDefinition.g:6300:2: rule__CommunicationServiceUsageRealization__Group__3__Impl
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
    // InternalComponentDefinition.g:6306:1: rule__CommunicationServiceUsageRealization__Group__3__Impl : ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) ) ;
    public final void rule__CommunicationServiceUsageRealization__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6310:1: ( ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) ) )
            // InternalComponentDefinition.g:6311:1: ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) )
            {
            // InternalComponentDefinition.g:6311:1: ( ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 ) )
            // InternalComponentDefinition.g:6312:2: ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortAssignment_3()); 
            // InternalComponentDefinition.g:6313:2: ( rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 )
            // InternalComponentDefinition.g:6313:3: rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3
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
    // InternalComponentDefinition.g:6322:1: rule__PublicOperationMode__Group__0 : rule__PublicOperationMode__Group__0__Impl rule__PublicOperationMode__Group__1 ;
    public final void rule__PublicOperationMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6326:1: ( rule__PublicOperationMode__Group__0__Impl rule__PublicOperationMode__Group__1 )
            // InternalComponentDefinition.g:6327:2: rule__PublicOperationMode__Group__0__Impl rule__PublicOperationMode__Group__1
            {
            pushFollow(FOLLOW_47);
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
    // InternalComponentDefinition.g:6334:1: rule__PublicOperationMode__Group__0__Impl : ( () ) ;
    public final void rule__PublicOperationMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6338:1: ( ( () ) )
            // InternalComponentDefinition.g:6339:1: ( () )
            {
            // InternalComponentDefinition.g:6339:1: ( () )
            // InternalComponentDefinition.g:6340:2: ()
            {
             before(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeAction_0()); 
            // InternalComponentDefinition.g:6341:2: ()
            // InternalComponentDefinition.g:6341:3: 
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
    // InternalComponentDefinition.g:6349:1: rule__PublicOperationMode__Group__1 : rule__PublicOperationMode__Group__1__Impl rule__PublicOperationMode__Group__2 ;
    public final void rule__PublicOperationMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6353:1: ( rule__PublicOperationMode__Group__1__Impl rule__PublicOperationMode__Group__2 )
            // InternalComponentDefinition.g:6354:2: rule__PublicOperationMode__Group__1__Impl rule__PublicOperationMode__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalComponentDefinition.g:6361:1: rule__PublicOperationMode__Group__1__Impl : ( ( rule__PublicOperationMode__DocumentationAssignment_1 )? ) ;
    public final void rule__PublicOperationMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6365:1: ( ( ( rule__PublicOperationMode__DocumentationAssignment_1 )? ) )
            // InternalComponentDefinition.g:6366:1: ( ( rule__PublicOperationMode__DocumentationAssignment_1 )? )
            {
            // InternalComponentDefinition.g:6366:1: ( ( rule__PublicOperationMode__DocumentationAssignment_1 )? )
            // InternalComponentDefinition.g:6367:2: ( rule__PublicOperationMode__DocumentationAssignment_1 )?
            {
             before(grammarAccess.getPublicOperationModeAccess().getDocumentationAssignment_1()); 
            // InternalComponentDefinition.g:6368:2: ( rule__PublicOperationMode__DocumentationAssignment_1 )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_DOCU_COMMENT) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalComponentDefinition.g:6368:3: rule__PublicOperationMode__DocumentationAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PublicOperationMode__DocumentationAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublicOperationModeAccess().getDocumentationAssignment_1()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:6376:1: rule__PublicOperationMode__Group__2 : rule__PublicOperationMode__Group__2__Impl rule__PublicOperationMode__Group__3 ;
    public final void rule__PublicOperationMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6380:1: ( rule__PublicOperationMode__Group__2__Impl rule__PublicOperationMode__Group__3 )
            // InternalComponentDefinition.g:6381:2: rule__PublicOperationMode__Group__2__Impl rule__PublicOperationMode__Group__3
            {
            pushFollow(FOLLOW_47);
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
    // InternalComponentDefinition.g:6388:1: rule__PublicOperationMode__Group__2__Impl : ( ( rule__PublicOperationMode__IsDefaultInitAssignment_2 )? ) ;
    public final void rule__PublicOperationMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6392:1: ( ( ( rule__PublicOperationMode__IsDefaultInitAssignment_2 )? ) )
            // InternalComponentDefinition.g:6393:1: ( ( rule__PublicOperationMode__IsDefaultInitAssignment_2 )? )
            {
            // InternalComponentDefinition.g:6393:1: ( ( rule__PublicOperationMode__IsDefaultInitAssignment_2 )? )
            // InternalComponentDefinition.g:6394:2: ( rule__PublicOperationMode__IsDefaultInitAssignment_2 )?
            {
             before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitAssignment_2()); 
            // InternalComponentDefinition.g:6395:2: ( rule__PublicOperationMode__IsDefaultInitAssignment_2 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==81) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalComponentDefinition.g:6395:3: rule__PublicOperationMode__IsDefaultInitAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__PublicOperationMode__IsDefaultInitAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitAssignment_2()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:6403:1: rule__PublicOperationMode__Group__3 : rule__PublicOperationMode__Group__3__Impl rule__PublicOperationMode__Group__4 ;
    public final void rule__PublicOperationMode__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6407:1: ( rule__PublicOperationMode__Group__3__Impl rule__PublicOperationMode__Group__4 )
            // InternalComponentDefinition.g:6408:2: rule__PublicOperationMode__Group__3__Impl rule__PublicOperationMode__Group__4
            {
            pushFollow(FOLLOW_5);
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
    // InternalComponentDefinition.g:6415:1: rule__PublicOperationMode__Group__3__Impl : ( 'PublicOperationMode' ) ;
    public final void rule__PublicOperationMode__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6419:1: ( ( 'PublicOperationMode' ) )
            // InternalComponentDefinition.g:6420:1: ( 'PublicOperationMode' )
            {
            // InternalComponentDefinition.g:6420:1: ( 'PublicOperationMode' )
            // InternalComponentDefinition.g:6421:2: 'PublicOperationMode'
            {
             before(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeKeyword_3()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getPublicOperationModeKeyword_3()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:6430:1: rule__PublicOperationMode__Group__4 : rule__PublicOperationMode__Group__4__Impl rule__PublicOperationMode__Group__5 ;
    public final void rule__PublicOperationMode__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6434:1: ( rule__PublicOperationMode__Group__4__Impl rule__PublicOperationMode__Group__5 )
            // InternalComponentDefinition.g:6435:2: rule__PublicOperationMode__Group__4__Impl rule__PublicOperationMode__Group__5
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentDefinition.g:6442:1: rule__PublicOperationMode__Group__4__Impl : ( ( rule__PublicOperationMode__ModeAssignment_4 ) ) ;
    public final void rule__PublicOperationMode__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6446:1: ( ( ( rule__PublicOperationMode__ModeAssignment_4 ) ) )
            // InternalComponentDefinition.g:6447:1: ( ( rule__PublicOperationMode__ModeAssignment_4 ) )
            {
            // InternalComponentDefinition.g:6447:1: ( ( rule__PublicOperationMode__ModeAssignment_4 ) )
            // InternalComponentDefinition.g:6448:2: ( rule__PublicOperationMode__ModeAssignment_4 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getModeAssignment_4()); 
            // InternalComponentDefinition.g:6449:2: ( rule__PublicOperationMode__ModeAssignment_4 )
            // InternalComponentDefinition.g:6449:3: rule__PublicOperationMode__ModeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__ModeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPublicOperationModeAccess().getModeAssignment_4()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:6457:1: rule__PublicOperationMode__Group__5 : rule__PublicOperationMode__Group__5__Impl rule__PublicOperationMode__Group__6 ;
    public final void rule__PublicOperationMode__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6461:1: ( rule__PublicOperationMode__Group__5__Impl rule__PublicOperationMode__Group__6 )
            // InternalComponentDefinition.g:6462:2: rule__PublicOperationMode__Group__5__Impl rule__PublicOperationMode__Group__6
            {
            pushFollow(FOLLOW_48);
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
    // InternalComponentDefinition.g:6469:1: rule__PublicOperationMode__Group__5__Impl : ( '{' ) ;
    public final void rule__PublicOperationMode__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6473:1: ( ( '{' ) )
            // InternalComponentDefinition.g:6474:1: ( '{' )
            {
            // InternalComponentDefinition.g:6474:1: ( '{' )
            // InternalComponentDefinition.g:6475:2: '{'
            {
             before(grammarAccess.getPublicOperationModeAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
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
    // InternalComponentDefinition.g:6484:1: rule__PublicOperationMode__Group__6 : rule__PublicOperationMode__Group__6__Impl rule__PublicOperationMode__Group__7 ;
    public final void rule__PublicOperationMode__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6488:1: ( rule__PublicOperationMode__Group__6__Impl rule__PublicOperationMode__Group__7 )
            // InternalComponentDefinition.g:6489:2: rule__PublicOperationMode__Group__6__Impl rule__PublicOperationMode__Group__7
            {
            pushFollow(FOLLOW_48);
            rule__PublicOperationMode__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group__7();

            state._fsp--;


            }

        }
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
    // InternalComponentDefinition.g:6496:1: rule__PublicOperationMode__Group__6__Impl : ( ( rule__PublicOperationMode__Group_6__0 )? ) ;
    public final void rule__PublicOperationMode__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6500:1: ( ( ( rule__PublicOperationMode__Group_6__0 )? ) )
            // InternalComponentDefinition.g:6501:1: ( ( rule__PublicOperationMode__Group_6__0 )? )
            {
            // InternalComponentDefinition.g:6501:1: ( ( rule__PublicOperationMode__Group_6__0 )? )
            // InternalComponentDefinition.g:6502:2: ( rule__PublicOperationMode__Group_6__0 )?
            {
             before(grammarAccess.getPublicOperationModeAccess().getGroup_6()); 
            // InternalComponentDefinition.g:6503:2: ( rule__PublicOperationMode__Group_6__0 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==65) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalComponentDefinition.g:6503:3: rule__PublicOperationMode__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PublicOperationMode__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPublicOperationModeAccess().getGroup_6()); 

            }


            }

        }
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


    // $ANTLR start "rule__PublicOperationMode__Group__7"
    // InternalComponentDefinition.g:6511:1: rule__PublicOperationMode__Group__7 : rule__PublicOperationMode__Group__7__Impl ;
    public final void rule__PublicOperationMode__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6515:1: ( rule__PublicOperationMode__Group__7__Impl )
            // InternalComponentDefinition.g:6516:2: rule__PublicOperationMode__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__7"


    // $ANTLR start "rule__PublicOperationMode__Group__7__Impl"
    // InternalComponentDefinition.g:6522:1: rule__PublicOperationMode__Group__7__Impl : ( '}' ) ;
    public final void rule__PublicOperationMode__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6526:1: ( ( '}' ) )
            // InternalComponentDefinition.g:6527:1: ( '}' )
            {
            // InternalComponentDefinition.g:6527:1: ( '}' )
            // InternalComponentDefinition.g:6528:2: '}'
            {
             before(grammarAccess.getPublicOperationModeAccess().getRightCurlyBracketKeyword_7()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group__7__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_6__0"
    // InternalComponentDefinition.g:6538:1: rule__PublicOperationMode__Group_6__0 : rule__PublicOperationMode__Group_6__0__Impl rule__PublicOperationMode__Group_6__1 ;
    public final void rule__PublicOperationMode__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6542:1: ( rule__PublicOperationMode__Group_6__0__Impl rule__PublicOperationMode__Group_6__1 )
            // InternalComponentDefinition.g:6543:2: rule__PublicOperationMode__Group_6__0__Impl rule__PublicOperationMode__Group_6__1
            {
            pushFollow(FOLLOW_49);
            rule__PublicOperationMode__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6__0"


    // $ANTLR start "rule__PublicOperationMode__Group_6__0__Impl"
    // InternalComponentDefinition.g:6550:1: rule__PublicOperationMode__Group_6__0__Impl : ( 'activates' ) ;
    public final void rule__PublicOperationMode__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6554:1: ( ( 'activates' ) )
            // InternalComponentDefinition.g:6555:1: ( 'activates' )
            {
            // InternalComponentDefinition.g:6555:1: ( 'activates' )
            // InternalComponentDefinition.g:6556:2: 'activates'
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesKeyword_6_0()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getActivatesKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6__0__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_6__1"
    // InternalComponentDefinition.g:6565:1: rule__PublicOperationMode__Group_6__1 : rule__PublicOperationMode__Group_6__1__Impl rule__PublicOperationMode__Group_6__2 ;
    public final void rule__PublicOperationMode__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6569:1: ( rule__PublicOperationMode__Group_6__1__Impl rule__PublicOperationMode__Group_6__2 )
            // InternalComponentDefinition.g:6570:2: rule__PublicOperationMode__Group_6__1__Impl rule__PublicOperationMode__Group_6__2
            {
            pushFollow(FOLLOW_5);
            rule__PublicOperationMode__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6__1"


    // $ANTLR start "rule__PublicOperationMode__Group_6__1__Impl"
    // InternalComponentDefinition.g:6577:1: rule__PublicOperationMode__Group_6__1__Impl : ( '(' ) ;
    public final void rule__PublicOperationMode__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6581:1: ( ( '(' ) )
            // InternalComponentDefinition.g:6582:1: ( '(' )
            {
            // InternalComponentDefinition.g:6582:1: ( '(' )
            // InternalComponentDefinition.g:6583:2: '('
            {
             before(grammarAccess.getPublicOperationModeAccess().getLeftParenthesisKeyword_6_1()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getLeftParenthesisKeyword_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6__1__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_6__2"
    // InternalComponentDefinition.g:6592:1: rule__PublicOperationMode__Group_6__2 : rule__PublicOperationMode__Group_6__2__Impl rule__PublicOperationMode__Group_6__3 ;
    public final void rule__PublicOperationMode__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6596:1: ( rule__PublicOperationMode__Group_6__2__Impl rule__PublicOperationMode__Group_6__3 )
            // InternalComponentDefinition.g:6597:2: rule__PublicOperationMode__Group_6__2__Impl rule__PublicOperationMode__Group_6__3
            {
            pushFollow(FOLLOW_50);
            rule__PublicOperationMode__Group_6__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_6__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6__2"


    // $ANTLR start "rule__PublicOperationMode__Group_6__2__Impl"
    // InternalComponentDefinition.g:6604:1: rule__PublicOperationMode__Group_6__2__Impl : ( ( rule__PublicOperationMode__ActivatesAssignment_6_2 ) ) ;
    public final void rule__PublicOperationMode__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6608:1: ( ( ( rule__PublicOperationMode__ActivatesAssignment_6_2 ) ) )
            // InternalComponentDefinition.g:6609:1: ( ( rule__PublicOperationMode__ActivatesAssignment_6_2 ) )
            {
            // InternalComponentDefinition.g:6609:1: ( ( rule__PublicOperationMode__ActivatesAssignment_6_2 ) )
            // InternalComponentDefinition.g:6610:2: ( rule__PublicOperationMode__ActivatesAssignment_6_2 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_6_2()); 
            // InternalComponentDefinition.g:6611:2: ( rule__PublicOperationMode__ActivatesAssignment_6_2 )
            // InternalComponentDefinition.g:6611:3: rule__PublicOperationMode__ActivatesAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__ActivatesAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6__2__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_6__3"
    // InternalComponentDefinition.g:6619:1: rule__PublicOperationMode__Group_6__3 : rule__PublicOperationMode__Group_6__3__Impl rule__PublicOperationMode__Group_6__4 ;
    public final void rule__PublicOperationMode__Group_6__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6623:1: ( rule__PublicOperationMode__Group_6__3__Impl rule__PublicOperationMode__Group_6__4 )
            // InternalComponentDefinition.g:6624:2: rule__PublicOperationMode__Group_6__3__Impl rule__PublicOperationMode__Group_6__4
            {
            pushFollow(FOLLOW_50);
            rule__PublicOperationMode__Group_6__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_6__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6__3"


    // $ANTLR start "rule__PublicOperationMode__Group_6__3__Impl"
    // InternalComponentDefinition.g:6631:1: rule__PublicOperationMode__Group_6__3__Impl : ( ( rule__PublicOperationMode__Group_6_3__0 )* ) ;
    public final void rule__PublicOperationMode__Group_6__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6635:1: ( ( ( rule__PublicOperationMode__Group_6_3__0 )* ) )
            // InternalComponentDefinition.g:6636:1: ( ( rule__PublicOperationMode__Group_6_3__0 )* )
            {
            // InternalComponentDefinition.g:6636:1: ( ( rule__PublicOperationMode__Group_6_3__0 )* )
            // InternalComponentDefinition.g:6637:2: ( rule__PublicOperationMode__Group_6_3__0 )*
            {
             before(grammarAccess.getPublicOperationModeAccess().getGroup_6_3()); 
            // InternalComponentDefinition.g:6638:2: ( rule__PublicOperationMode__Group_6_3__0 )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==68) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalComponentDefinition.g:6638:3: rule__PublicOperationMode__Group_6_3__0
            	    {
            	    pushFollow(FOLLOW_51);
            	    rule__PublicOperationMode__Group_6_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

             after(grammarAccess.getPublicOperationModeAccess().getGroup_6_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6__3__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_6__4"
    // InternalComponentDefinition.g:6646:1: rule__PublicOperationMode__Group_6__4 : rule__PublicOperationMode__Group_6__4__Impl ;
    public final void rule__PublicOperationMode__Group_6__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6650:1: ( rule__PublicOperationMode__Group_6__4__Impl )
            // InternalComponentDefinition.g:6651:2: rule__PublicOperationMode__Group_6__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_6__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6__4"


    // $ANTLR start "rule__PublicOperationMode__Group_6__4__Impl"
    // InternalComponentDefinition.g:6657:1: rule__PublicOperationMode__Group_6__4__Impl : ( ')' ) ;
    public final void rule__PublicOperationMode__Group_6__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6661:1: ( ( ')' ) )
            // InternalComponentDefinition.g:6662:1: ( ')' )
            {
            // InternalComponentDefinition.g:6662:1: ( ')' )
            // InternalComponentDefinition.g:6663:2: ')'
            {
             before(grammarAccess.getPublicOperationModeAccess().getRightParenthesisKeyword_6_4()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getRightParenthesisKeyword_6_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6__4__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_6_3__0"
    // InternalComponentDefinition.g:6673:1: rule__PublicOperationMode__Group_6_3__0 : rule__PublicOperationMode__Group_6_3__0__Impl rule__PublicOperationMode__Group_6_3__1 ;
    public final void rule__PublicOperationMode__Group_6_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6677:1: ( rule__PublicOperationMode__Group_6_3__0__Impl rule__PublicOperationMode__Group_6_3__1 )
            // InternalComponentDefinition.g:6678:2: rule__PublicOperationMode__Group_6_3__0__Impl rule__PublicOperationMode__Group_6_3__1
            {
            pushFollow(FOLLOW_5);
            rule__PublicOperationMode__Group_6_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_6_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6_3__0"


    // $ANTLR start "rule__PublicOperationMode__Group_6_3__0__Impl"
    // InternalComponentDefinition.g:6685:1: rule__PublicOperationMode__Group_6_3__0__Impl : ( ',' ) ;
    public final void rule__PublicOperationMode__Group_6_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6689:1: ( ( ',' ) )
            // InternalComponentDefinition.g:6690:1: ( ',' )
            {
            // InternalComponentDefinition.g:6690:1: ( ',' )
            // InternalComponentDefinition.g:6691:2: ','
            {
             before(grammarAccess.getPublicOperationModeAccess().getCommaKeyword_6_3_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getCommaKeyword_6_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6_3__0__Impl"


    // $ANTLR start "rule__PublicOperationMode__Group_6_3__1"
    // InternalComponentDefinition.g:6700:1: rule__PublicOperationMode__Group_6_3__1 : rule__PublicOperationMode__Group_6_3__1__Impl ;
    public final void rule__PublicOperationMode__Group_6_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6704:1: ( rule__PublicOperationMode__Group_6_3__1__Impl )
            // InternalComponentDefinition.g:6705:2: rule__PublicOperationMode__Group_6_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__Group_6_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6_3__1"


    // $ANTLR start "rule__PublicOperationMode__Group_6_3__1__Impl"
    // InternalComponentDefinition.g:6711:1: rule__PublicOperationMode__Group_6_3__1__Impl : ( ( rule__PublicOperationMode__ActivatesAssignment_6_3_1 ) ) ;
    public final void rule__PublicOperationMode__Group_6_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6715:1: ( ( ( rule__PublicOperationMode__ActivatesAssignment_6_3_1 ) ) )
            // InternalComponentDefinition.g:6716:1: ( ( rule__PublicOperationMode__ActivatesAssignment_6_3_1 ) )
            {
            // InternalComponentDefinition.g:6716:1: ( ( rule__PublicOperationMode__ActivatesAssignment_6_3_1 ) )
            // InternalComponentDefinition.g:6717:2: ( rule__PublicOperationMode__ActivatesAssignment_6_3_1 )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_6_3_1()); 
            // InternalComponentDefinition.g:6718:2: ( rule__PublicOperationMode__ActivatesAssignment_6_3_1 )
            // InternalComponentDefinition.g:6718:3: rule__PublicOperationMode__ActivatesAssignment_6_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PublicOperationMode__ActivatesAssignment_6_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPublicOperationModeAccess().getActivatesAssignment_6_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__Group_6_3__1__Impl"


    // $ANTLR start "rule__PrivateOperationMode__Group__0"
    // InternalComponentDefinition.g:6727:1: rule__PrivateOperationMode__Group__0 : rule__PrivateOperationMode__Group__0__Impl rule__PrivateOperationMode__Group__1 ;
    public final void rule__PrivateOperationMode__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6731:1: ( rule__PrivateOperationMode__Group__0__Impl rule__PrivateOperationMode__Group__1 )
            // InternalComponentDefinition.g:6732:2: rule__PrivateOperationMode__Group__0__Impl rule__PrivateOperationMode__Group__1
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
    // InternalComponentDefinition.g:6739:1: rule__PrivateOperationMode__Group__0__Impl : ( 'PrivateOperationMode' ) ;
    public final void rule__PrivateOperationMode__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6743:1: ( ( 'PrivateOperationMode' ) )
            // InternalComponentDefinition.g:6744:1: ( 'PrivateOperationMode' )
            {
            // InternalComponentDefinition.g:6744:1: ( 'PrivateOperationMode' )
            // InternalComponentDefinition.g:6745:2: 'PrivateOperationMode'
            {
             before(grammarAccess.getPrivateOperationModeAccess().getPrivateOperationModeKeyword_0()); 
            match(input,69,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6754:1: rule__PrivateOperationMode__Group__1 : rule__PrivateOperationMode__Group__1__Impl rule__PrivateOperationMode__Group__2 ;
    public final void rule__PrivateOperationMode__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6758:1: ( rule__PrivateOperationMode__Group__1__Impl rule__PrivateOperationMode__Group__2 )
            // InternalComponentDefinition.g:6759:2: rule__PrivateOperationMode__Group__1__Impl rule__PrivateOperationMode__Group__2
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
    // InternalComponentDefinition.g:6766:1: rule__PrivateOperationMode__Group__1__Impl : ( ( rule__PrivateOperationMode__NameAssignment_1 ) ) ;
    public final void rule__PrivateOperationMode__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6770:1: ( ( ( rule__PrivateOperationMode__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:6771:1: ( ( rule__PrivateOperationMode__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:6771:1: ( ( rule__PrivateOperationMode__NameAssignment_1 ) )
            // InternalComponentDefinition.g:6772:2: ( rule__PrivateOperationMode__NameAssignment_1 )
            {
             before(grammarAccess.getPrivateOperationModeAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:6773:2: ( rule__PrivateOperationMode__NameAssignment_1 )
            // InternalComponentDefinition.g:6773:3: rule__PrivateOperationMode__NameAssignment_1
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
    // InternalComponentDefinition.g:6781:1: rule__PrivateOperationMode__Group__2 : rule__PrivateOperationMode__Group__2__Impl ;
    public final void rule__PrivateOperationMode__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6785:1: ( rule__PrivateOperationMode__Group__2__Impl )
            // InternalComponentDefinition.g:6786:2: rule__PrivateOperationMode__Group__2__Impl
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
    // InternalComponentDefinition.g:6792:1: rule__PrivateOperationMode__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__PrivateOperationMode__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6796:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:6797:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:6797:1: ( ( ';' )? )
            // InternalComponentDefinition.g:6798:2: ( ';' )?
            {
             before(grammarAccess.getPrivateOperationModeAccess().getSemicolonKeyword_2()); 
            // InternalComponentDefinition.g:6799:2: ( ';' )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==19) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalComponentDefinition.g:6799:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:6808:1: rule__CoordinationMasterPort__Group__0 : rule__CoordinationMasterPort__Group__0__Impl rule__CoordinationMasterPort__Group__1 ;
    public final void rule__CoordinationMasterPort__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6812:1: ( rule__CoordinationMasterPort__Group__0__Impl rule__CoordinationMasterPort__Group__1 )
            // InternalComponentDefinition.g:6813:2: rule__CoordinationMasterPort__Group__0__Impl rule__CoordinationMasterPort__Group__1
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
    // InternalComponentDefinition.g:6820:1: rule__CoordinationMasterPort__Group__0__Impl : ( 'CoordinationMasterPort' ) ;
    public final void rule__CoordinationMasterPort__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6824:1: ( ( 'CoordinationMasterPort' ) )
            // InternalComponentDefinition.g:6825:1: ( 'CoordinationMasterPort' )
            {
            // InternalComponentDefinition.g:6825:1: ( 'CoordinationMasterPort' )
            // InternalComponentDefinition.g:6826:2: 'CoordinationMasterPort'
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getCoordinationMasterPortKeyword_0()); 
            match(input,70,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6835:1: rule__CoordinationMasterPort__Group__1 : rule__CoordinationMasterPort__Group__1__Impl rule__CoordinationMasterPort__Group__2 ;
    public final void rule__CoordinationMasterPort__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6839:1: ( rule__CoordinationMasterPort__Group__1__Impl rule__CoordinationMasterPort__Group__2 )
            // InternalComponentDefinition.g:6840:2: rule__CoordinationMasterPort__Group__1__Impl rule__CoordinationMasterPort__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentDefinition.g:6847:1: rule__CoordinationMasterPort__Group__1__Impl : ( ( rule__CoordinationMasterPort__NameAssignment_1 ) ) ;
    public final void rule__CoordinationMasterPort__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6851:1: ( ( ( rule__CoordinationMasterPort__NameAssignment_1 ) ) )
            // InternalComponentDefinition.g:6852:1: ( ( rule__CoordinationMasterPort__NameAssignment_1 ) )
            {
            // InternalComponentDefinition.g:6852:1: ( ( rule__CoordinationMasterPort__NameAssignment_1 ) )
            // InternalComponentDefinition.g:6853:2: ( rule__CoordinationMasterPort__NameAssignment_1 )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getNameAssignment_1()); 
            // InternalComponentDefinition.g:6854:2: ( rule__CoordinationMasterPort__NameAssignment_1 )
            // InternalComponentDefinition.g:6854:3: rule__CoordinationMasterPort__NameAssignment_1
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
    // InternalComponentDefinition.g:6862:1: rule__CoordinationMasterPort__Group__2 : rule__CoordinationMasterPort__Group__2__Impl rule__CoordinationMasterPort__Group__3 ;
    public final void rule__CoordinationMasterPort__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6866:1: ( rule__CoordinationMasterPort__Group__2__Impl rule__CoordinationMasterPort__Group__3 )
            // InternalComponentDefinition.g:6867:2: rule__CoordinationMasterPort__Group__2__Impl rule__CoordinationMasterPort__Group__3
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
    // InternalComponentDefinition.g:6874:1: rule__CoordinationMasterPort__Group__2__Impl : ( 'implements' ) ;
    public final void rule__CoordinationMasterPort__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6878:1: ( ( 'implements' ) )
            // InternalComponentDefinition.g:6879:1: ( 'implements' )
            {
            // InternalComponentDefinition.g:6879:1: ( 'implements' )
            // InternalComponentDefinition.g:6880:2: 'implements'
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getImplementsKeyword_2()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6889:1: rule__CoordinationMasterPort__Group__3 : rule__CoordinationMasterPort__Group__3__Impl rule__CoordinationMasterPort__Group__4 ;
    public final void rule__CoordinationMasterPort__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6893:1: ( rule__CoordinationMasterPort__Group__3__Impl rule__CoordinationMasterPort__Group__4 )
            // InternalComponentDefinition.g:6894:2: rule__CoordinationMasterPort__Group__3__Impl rule__CoordinationMasterPort__Group__4
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
    // InternalComponentDefinition.g:6901:1: rule__CoordinationMasterPort__Group__3__Impl : ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) ) ;
    public final void rule__CoordinationMasterPort__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6905:1: ( ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) ) )
            // InternalComponentDefinition.g:6906:1: ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) )
            {
            // InternalComponentDefinition.g:6906:1: ( ( rule__CoordinationMasterPort__ServiceAssignment_3 ) )
            // InternalComponentDefinition.g:6907:2: ( rule__CoordinationMasterPort__ServiceAssignment_3 )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getServiceAssignment_3()); 
            // InternalComponentDefinition.g:6908:2: ( rule__CoordinationMasterPort__ServiceAssignment_3 )
            // InternalComponentDefinition.g:6908:3: rule__CoordinationMasterPort__ServiceAssignment_3
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
    // InternalComponentDefinition.g:6916:1: rule__CoordinationMasterPort__Group__4 : rule__CoordinationMasterPort__Group__4__Impl ;
    public final void rule__CoordinationMasterPort__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6920:1: ( rule__CoordinationMasterPort__Group__4__Impl )
            // InternalComponentDefinition.g:6921:2: rule__CoordinationMasterPort__Group__4__Impl
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
    // InternalComponentDefinition.g:6927:1: rule__CoordinationMasterPort__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__CoordinationMasterPort__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6931:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:6932:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:6932:1: ( ( ';' )? )
            // InternalComponentDefinition.g:6933:2: ( ';' )?
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getSemicolonKeyword_4()); 
            // InternalComponentDefinition.g:6934:2: ( ';' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==19) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalComponentDefinition.g:6934:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:6943:1: rule__ComponentParametersRef__Group__0 : rule__ComponentParametersRef__Group__0__Impl rule__ComponentParametersRef__Group__1 ;
    public final void rule__ComponentParametersRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6947:1: ( rule__ComponentParametersRef__Group__0__Impl rule__ComponentParametersRef__Group__1 )
            // InternalComponentDefinition.g:6948:2: rule__ComponentParametersRef__Group__0__Impl rule__ComponentParametersRef__Group__1
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
    // InternalComponentDefinition.g:6955:1: rule__ComponentParametersRef__Group__0__Impl : ( 'ComponentParameters' ) ;
    public final void rule__ComponentParametersRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6959:1: ( ( 'ComponentParameters' ) )
            // InternalComponentDefinition.g:6960:1: ( 'ComponentParameters' )
            {
            // InternalComponentDefinition.g:6960:1: ( 'ComponentParameters' )
            // InternalComponentDefinition.g:6961:2: 'ComponentParameters'
            {
             before(grammarAccess.getComponentParametersRefAccess().getComponentParametersKeyword_0()); 
            match(input,71,FOLLOW_2); 
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
    // InternalComponentDefinition.g:6970:1: rule__ComponentParametersRef__Group__1 : rule__ComponentParametersRef__Group__1__Impl rule__ComponentParametersRef__Group__2 ;
    public final void rule__ComponentParametersRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6974:1: ( rule__ComponentParametersRef__Group__1__Impl rule__ComponentParametersRef__Group__2 )
            // InternalComponentDefinition.g:6975:2: rule__ComponentParametersRef__Group__1__Impl rule__ComponentParametersRef__Group__2
            {
            pushFollow(FOLLOW_52);
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
    // InternalComponentDefinition.g:6982:1: rule__ComponentParametersRef__Group__1__Impl : ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) ) ;
    public final void rule__ComponentParametersRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:6986:1: ( ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) ) )
            // InternalComponentDefinition.g:6987:1: ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) )
            {
            // InternalComponentDefinition.g:6987:1: ( ( rule__ComponentParametersRef__ParameterAssignment_1 ) )
            // InternalComponentDefinition.g:6988:2: ( rule__ComponentParametersRef__ParameterAssignment_1 )
            {
             before(grammarAccess.getComponentParametersRefAccess().getParameterAssignment_1()); 
            // InternalComponentDefinition.g:6989:2: ( rule__ComponentParametersRef__ParameterAssignment_1 )
            // InternalComponentDefinition.g:6989:3: rule__ComponentParametersRef__ParameterAssignment_1
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
    // InternalComponentDefinition.g:6997:1: rule__ComponentParametersRef__Group__2 : rule__ComponentParametersRef__Group__2__Impl rule__ComponentParametersRef__Group__3 ;
    public final void rule__ComponentParametersRef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7001:1: ( rule__ComponentParametersRef__Group__2__Impl rule__ComponentParametersRef__Group__3 )
            // InternalComponentDefinition.g:7002:2: rule__ComponentParametersRef__Group__2__Impl rule__ComponentParametersRef__Group__3
            {
            pushFollow(FOLLOW_52);
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
    // InternalComponentDefinition.g:7009:1: rule__ComponentParametersRef__Group__2__Impl : ( ( rule__ComponentParametersRef__Group_2__0 )? ) ;
    public final void rule__ComponentParametersRef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7013:1: ( ( ( rule__ComponentParametersRef__Group_2__0 )? ) )
            // InternalComponentDefinition.g:7014:1: ( ( rule__ComponentParametersRef__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:7014:1: ( ( rule__ComponentParametersRef__Group_2__0 )? )
            // InternalComponentDefinition.g:7015:2: ( rule__ComponentParametersRef__Group_2__0 )?
            {
             before(grammarAccess.getComponentParametersRefAccess().getGroup_2()); 
            // InternalComponentDefinition.g:7016:2: ( rule__ComponentParametersRef__Group_2__0 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==72) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalComponentDefinition.g:7016:3: rule__ComponentParametersRef__Group_2__0
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
    // InternalComponentDefinition.g:7024:1: rule__ComponentParametersRef__Group__3 : rule__ComponentParametersRef__Group__3__Impl ;
    public final void rule__ComponentParametersRef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7028:1: ( rule__ComponentParametersRef__Group__3__Impl )
            // InternalComponentDefinition.g:7029:2: rule__ComponentParametersRef__Group__3__Impl
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
    // InternalComponentDefinition.g:7035:1: rule__ComponentParametersRef__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__ComponentParametersRef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7039:1: ( ( ( ';' )? ) )
            // InternalComponentDefinition.g:7040:1: ( ( ';' )? )
            {
            // InternalComponentDefinition.g:7040:1: ( ( ';' )? )
            // InternalComponentDefinition.g:7041:2: ( ';' )?
            {
             before(grammarAccess.getComponentParametersRefAccess().getSemicolonKeyword_3()); 
            // InternalComponentDefinition.g:7042:2: ( ';' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==19) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalComponentDefinition.g:7042:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalComponentDefinition.g:7051:1: rule__ComponentParametersRef__Group_2__0 : rule__ComponentParametersRef__Group_2__0__Impl rule__ComponentParametersRef__Group_2__1 ;
    public final void rule__ComponentParametersRef__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7055:1: ( rule__ComponentParametersRef__Group_2__0__Impl rule__ComponentParametersRef__Group_2__1 )
            // InternalComponentDefinition.g:7056:2: rule__ComponentParametersRef__Group_2__0__Impl rule__ComponentParametersRef__Group_2__1
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
    // InternalComponentDefinition.g:7063:1: rule__ComponentParametersRef__Group_2__0__Impl : ( 'slave' ) ;
    public final void rule__ComponentParametersRef__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7067:1: ( ( 'slave' ) )
            // InternalComponentDefinition.g:7068:1: ( 'slave' )
            {
            // InternalComponentDefinition.g:7068:1: ( 'slave' )
            // InternalComponentDefinition.g:7069:2: 'slave'
            {
             before(grammarAccess.getComponentParametersRefAccess().getSlaveKeyword_2_0()); 
            match(input,72,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7078:1: rule__ComponentParametersRef__Group_2__1 : rule__ComponentParametersRef__Group_2__1__Impl ;
    public final void rule__ComponentParametersRef__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7082:1: ( rule__ComponentParametersRef__Group_2__1__Impl )
            // InternalComponentDefinition.g:7083:2: rule__ComponentParametersRef__Group_2__1__Impl
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
    // InternalComponentDefinition.g:7089:1: rule__ComponentParametersRef__Group_2__1__Impl : ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) ) ;
    public final void rule__ComponentParametersRef__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7093:1: ( ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:7094:1: ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:7094:1: ( ( rule__ComponentParametersRef__SlaveAssignment_2_1 ) )
            // InternalComponentDefinition.g:7095:2: ( rule__ComponentParametersRef__SlaveAssignment_2_1 )
            {
             before(grammarAccess.getComponentParametersRefAccess().getSlaveAssignment_2_1()); 
            // InternalComponentDefinition.g:7096:2: ( rule__ComponentParametersRef__SlaveAssignment_2_1 )
            // InternalComponentDefinition.g:7096:3: rule__ComponentParametersRef__SlaveAssignment_2_1
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
    // InternalComponentDefinition.g:7105:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7109:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalComponentDefinition.g:7110:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_53);
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
    // InternalComponentDefinition.g:7117:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7121:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:7122:1: ( RULE_ID )
            {
            // InternalComponentDefinition.g:7122:1: ( RULE_ID )
            // InternalComponentDefinition.g:7123:2: RULE_ID
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
    // InternalComponentDefinition.g:7132:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7136:1: ( rule__FQN__Group__1__Impl )
            // InternalComponentDefinition.g:7137:2: rule__FQN__Group__1__Impl
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
    // InternalComponentDefinition.g:7143:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7147:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalComponentDefinition.g:7148:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalComponentDefinition.g:7148:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalComponentDefinition.g:7149:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalComponentDefinition.g:7150:2: ( rule__FQN__Group_1__0 )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==73) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalComponentDefinition.g:7150:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_54);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
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
    // InternalComponentDefinition.g:7159:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7163:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalComponentDefinition.g:7164:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalComponentDefinition.g:7171:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7175:1: ( ( '.' ) )
            // InternalComponentDefinition.g:7176:1: ( '.' )
            {
            // InternalComponentDefinition.g:7176:1: ( '.' )
            // InternalComponentDefinition.g:7177:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,73,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7186:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7190:1: ( rule__FQN__Group_1__1__Impl )
            // InternalComponentDefinition.g:7191:2: rule__FQN__Group_1__1__Impl
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
    // InternalComponentDefinition.g:7197:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7201:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:7202:1: ( RULE_ID )
            {
            // InternalComponentDefinition.g:7202:1: ( RULE_ID )
            // InternalComponentDefinition.g:7203:2: RULE_ID
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
    // InternalComponentDefinition.g:7213:1: rule__FQNW__Group__0 : rule__FQNW__Group__0__Impl rule__FQNW__Group__1 ;
    public final void rule__FQNW__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7217:1: ( rule__FQNW__Group__0__Impl rule__FQNW__Group__1 )
            // InternalComponentDefinition.g:7218:2: rule__FQNW__Group__0__Impl rule__FQNW__Group__1
            {
            pushFollow(FOLLOW_55);
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
    // InternalComponentDefinition.g:7225:1: rule__FQNW__Group__0__Impl : ( ruleFQN ) ;
    public final void rule__FQNW__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7229:1: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:7230:1: ( ruleFQN )
            {
            // InternalComponentDefinition.g:7230:1: ( ruleFQN )
            // InternalComponentDefinition.g:7231:2: ruleFQN
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
    // InternalComponentDefinition.g:7240:1: rule__FQNW__Group__1 : rule__FQNW__Group__1__Impl ;
    public final void rule__FQNW__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7244:1: ( rule__FQNW__Group__1__Impl )
            // InternalComponentDefinition.g:7245:2: rule__FQNW__Group__1__Impl
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
    // InternalComponentDefinition.g:7251:1: rule__FQNW__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__FQNW__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7255:1: ( ( ( '.*' )? ) )
            // InternalComponentDefinition.g:7256:1: ( ( '.*' )? )
            {
            // InternalComponentDefinition.g:7256:1: ( ( '.*' )? )
            // InternalComponentDefinition.g:7257:2: ( '.*' )?
            {
             before(grammarAccess.getFQNWAccess().getFullStopAsteriskKeyword_1()); 
            // InternalComponentDefinition.g:7258:2: ( '.*' )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==74) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalComponentDefinition.g:7258:3: '.*'
                    {
                    match(input,74,FOLLOW_2); 

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
    // InternalComponentDefinition.g:7267:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7271:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalComponentDefinition.g:7272:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalComponentDefinition.g:7279:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7283:1: ( ( ( '-' )? ) )
            // InternalComponentDefinition.g:7284:1: ( ( '-' )? )
            {
            // InternalComponentDefinition.g:7284:1: ( ( '-' )? )
            // InternalComponentDefinition.g:7285:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalComponentDefinition.g:7286:2: ( '-' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==75) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalComponentDefinition.g:7286:3: '-'
                    {
                    match(input,75,FOLLOW_2); 

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
    // InternalComponentDefinition.g:7294:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7298:1: ( rule__EInt__Group__1__Impl )
            // InternalComponentDefinition.g:7299:2: rule__EInt__Group__1__Impl
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
    // InternalComponentDefinition.g:7305:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7309:1: ( ( RULE_INT ) )
            // InternalComponentDefinition.g:7310:1: ( RULE_INT )
            {
            // InternalComponentDefinition.g:7310:1: ( RULE_INT )
            // InternalComponentDefinition.g:7311:2: RULE_INT
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
    // InternalComponentDefinition.g:7321:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7325:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalComponentDefinition.g:7326:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalComponentDefinition.g:7333:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7337:1: ( ( ( '-' )? ) )
            // InternalComponentDefinition.g:7338:1: ( ( '-' )? )
            {
            // InternalComponentDefinition.g:7338:1: ( ( '-' )? )
            // InternalComponentDefinition.g:7339:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalComponentDefinition.g:7340:2: ( '-' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==75) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalComponentDefinition.g:7340:3: '-'
                    {
                    match(input,75,FOLLOW_2); 

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
    // InternalComponentDefinition.g:7348:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7352:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalComponentDefinition.g:7353:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_36);
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
    // InternalComponentDefinition.g:7360:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7364:1: ( ( ( RULE_INT )? ) )
            // InternalComponentDefinition.g:7365:1: ( ( RULE_INT )? )
            {
            // InternalComponentDefinition.g:7365:1: ( ( RULE_INT )? )
            // InternalComponentDefinition.g:7366:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalComponentDefinition.g:7367:2: ( RULE_INT )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_INT) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalComponentDefinition.g:7367:3: RULE_INT
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
    // InternalComponentDefinition.g:7375:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7379:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalComponentDefinition.g:7380:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_56);
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
    // InternalComponentDefinition.g:7387:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7391:1: ( ( '.' ) )
            // InternalComponentDefinition.g:7392:1: ( '.' )
            {
            // InternalComponentDefinition.g:7392:1: ( '.' )
            // InternalComponentDefinition.g:7393:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,73,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7402:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7406:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalComponentDefinition.g:7407:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_57);
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
    // InternalComponentDefinition.g:7414:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7418:1: ( ( RULE_INT ) )
            // InternalComponentDefinition.g:7419:1: ( RULE_INT )
            {
            // InternalComponentDefinition.g:7419:1: ( RULE_INT )
            // InternalComponentDefinition.g:7420:2: RULE_INT
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
    // InternalComponentDefinition.g:7429:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7433:1: ( rule__EDouble__Group__4__Impl )
            // InternalComponentDefinition.g:7434:2: rule__EDouble__Group__4__Impl
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
    // InternalComponentDefinition.g:7440:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7444:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalComponentDefinition.g:7445:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalComponentDefinition.g:7445:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalComponentDefinition.g:7446:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalComponentDefinition.g:7447:2: ( rule__EDouble__Group_4__0 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0>=14 && LA66_0<=15)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalComponentDefinition.g:7447:3: rule__EDouble__Group_4__0
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
    // InternalComponentDefinition.g:7456:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7460:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalComponentDefinition.g:7461:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalComponentDefinition.g:7468:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7472:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalComponentDefinition.g:7473:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalComponentDefinition.g:7473:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalComponentDefinition.g:7474:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalComponentDefinition.g:7475:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalComponentDefinition.g:7475:3: rule__EDouble__Alternatives_4_0
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
    // InternalComponentDefinition.g:7483:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7487:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalComponentDefinition.g:7488:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_40);
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
    // InternalComponentDefinition.g:7495:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7499:1: ( ( ( '-' )? ) )
            // InternalComponentDefinition.g:7500:1: ( ( '-' )? )
            {
            // InternalComponentDefinition.g:7500:1: ( ( '-' )? )
            // InternalComponentDefinition.g:7501:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalComponentDefinition.g:7502:2: ( '-' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==75) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalComponentDefinition.g:7502:3: '-'
                    {
                    match(input,75,FOLLOW_2); 

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
    // InternalComponentDefinition.g:7510:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7514:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalComponentDefinition.g:7515:2: rule__EDouble__Group_4__2__Impl
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
    // InternalComponentDefinition.g:7521:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7525:1: ( ( RULE_INT ) )
            // InternalComponentDefinition.g:7526:1: ( RULE_INT )
            {
            // InternalComponentDefinition.g:7526:1: ( RULE_INT )
            // InternalComponentDefinition.g:7527:2: RULE_INT
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
    // InternalComponentDefinition.g:7537:1: rule__ACE_SmartSoft__Group__0 : rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 ;
    public final void rule__ACE_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7541:1: ( rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 )
            // InternalComponentDefinition.g:7542:2: rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_58);
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
    // InternalComponentDefinition.g:7549:1: rule__ACE_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__ACE_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7553:1: ( ( () ) )
            // InternalComponentDefinition.g:7554:1: ( () )
            {
            // InternalComponentDefinition.g:7554:1: ( () )
            // InternalComponentDefinition.g:7555:2: ()
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); 
            // InternalComponentDefinition.g:7556:2: ()
            // InternalComponentDefinition.g:7556:3: 
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
    // InternalComponentDefinition.g:7564:1: rule__ACE_SmartSoft__Group__1 : rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 ;
    public final void rule__ACE_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7568:1: ( rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 )
            // InternalComponentDefinition.g:7569:2: rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_59);
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
    // InternalComponentDefinition.g:7576:1: rule__ACE_SmartSoft__Group__1__Impl : ( 'ACE_SmartSoft' ) ;
    public final void rule__ACE_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7580:1: ( ( 'ACE_SmartSoft' ) )
            // InternalComponentDefinition.g:7581:1: ( 'ACE_SmartSoft' )
            {
            // InternalComponentDefinition.g:7581:1: ( 'ACE_SmartSoft' )
            // InternalComponentDefinition.g:7582:2: 'ACE_SmartSoft'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); 
            match(input,76,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7591:1: rule__ACE_SmartSoft__Group__2 : rule__ACE_SmartSoft__Group__2__Impl ;
    public final void rule__ACE_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7595:1: ( rule__ACE_SmartSoft__Group__2__Impl )
            // InternalComponentDefinition.g:7596:2: rule__ACE_SmartSoft__Group__2__Impl
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
    // InternalComponentDefinition.g:7602:1: rule__ACE_SmartSoft__Group__2__Impl : ( ( rule__ACE_SmartSoft__Group_2__0 )? ) ;
    public final void rule__ACE_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7606:1: ( ( ( rule__ACE_SmartSoft__Group_2__0 )? ) )
            // InternalComponentDefinition.g:7607:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:7607:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            // InternalComponentDefinition.g:7608:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); 
            // InternalComponentDefinition.g:7609:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==77) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalComponentDefinition.g:7609:3: rule__ACE_SmartSoft__Group_2__0
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
    // InternalComponentDefinition.g:7618:1: rule__ACE_SmartSoft__Group_2__0 : rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 ;
    public final void rule__ACE_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7622:1: ( rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 )
            // InternalComponentDefinition.g:7623:2: rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDefinition.g:7630:1: rule__ACE_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__ACE_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7634:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:7635:1: ( 'description' )
            {
            // InternalComponentDefinition.g:7635:1: ( 'description' )
            // InternalComponentDefinition.g:7636:2: 'description'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7645:1: rule__ACE_SmartSoft__Group_2__1 : rule__ACE_SmartSoft__Group_2__1__Impl ;
    public final void rule__ACE_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7649:1: ( rule__ACE_SmartSoft__Group_2__1__Impl )
            // InternalComponentDefinition.g:7650:2: rule__ACE_SmartSoft__Group_2__1__Impl
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
    // InternalComponentDefinition.g:7656:1: rule__ACE_SmartSoft__Group_2__1__Impl : ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__ACE_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7660:1: ( ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:7661:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:7661:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:7662:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:7663:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:7663:3: rule__ACE_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentDefinition.g:7672:1: rule__OpcUa_SeRoNet__Group__0 : rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 ;
    public final void rule__OpcUa_SeRoNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7676:1: ( rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 )
            // InternalComponentDefinition.g:7677:2: rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1
            {
            pushFollow(FOLLOW_60);
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
    // InternalComponentDefinition.g:7684:1: rule__OpcUa_SeRoNet__Group__0__Impl : ( () ) ;
    public final void rule__OpcUa_SeRoNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7688:1: ( ( () ) )
            // InternalComponentDefinition.g:7689:1: ( () )
            {
            // InternalComponentDefinition.g:7689:1: ( () )
            // InternalComponentDefinition.g:7690:2: ()
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); 
            // InternalComponentDefinition.g:7691:2: ()
            // InternalComponentDefinition.g:7691:3: 
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
    // InternalComponentDefinition.g:7699:1: rule__OpcUa_SeRoNet__Group__1 : rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 ;
    public final void rule__OpcUa_SeRoNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7703:1: ( rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 )
            // InternalComponentDefinition.g:7704:2: rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2
            {
            pushFollow(FOLLOW_59);
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
    // InternalComponentDefinition.g:7711:1: rule__OpcUa_SeRoNet__Group__1__Impl : ( 'OpcUa_SeRoNet' ) ;
    public final void rule__OpcUa_SeRoNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7715:1: ( ( 'OpcUa_SeRoNet' ) )
            // InternalComponentDefinition.g:7716:1: ( 'OpcUa_SeRoNet' )
            {
            // InternalComponentDefinition.g:7716:1: ( 'OpcUa_SeRoNet' )
            // InternalComponentDefinition.g:7717:2: 'OpcUa_SeRoNet'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); 
            match(input,78,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7726:1: rule__OpcUa_SeRoNet__Group__2 : rule__OpcUa_SeRoNet__Group__2__Impl ;
    public final void rule__OpcUa_SeRoNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7730:1: ( rule__OpcUa_SeRoNet__Group__2__Impl )
            // InternalComponentDefinition.g:7731:2: rule__OpcUa_SeRoNet__Group__2__Impl
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
    // InternalComponentDefinition.g:7737:1: rule__OpcUa_SeRoNet__Group__2__Impl : ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) ;
    public final void rule__OpcUa_SeRoNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7741:1: ( ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) )
            // InternalComponentDefinition.g:7742:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:7742:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            // InternalComponentDefinition.g:7743:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); 
            // InternalComponentDefinition.g:7744:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==77) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalComponentDefinition.g:7744:3: rule__OpcUa_SeRoNet__Group_2__0
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
    // InternalComponentDefinition.g:7753:1: rule__OpcUa_SeRoNet__Group_2__0 : rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 ;
    public final void rule__OpcUa_SeRoNet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7757:1: ( rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 )
            // InternalComponentDefinition.g:7758:2: rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDefinition.g:7765:1: rule__OpcUa_SeRoNet__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7769:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:7770:1: ( 'description' )
            {
            // InternalComponentDefinition.g:7770:1: ( 'description' )
            // InternalComponentDefinition.g:7771:2: 'description'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7780:1: rule__OpcUa_SeRoNet__Group_2__1 : rule__OpcUa_SeRoNet__Group_2__1__Impl ;
    public final void rule__OpcUa_SeRoNet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7784:1: ( rule__OpcUa_SeRoNet__Group_2__1__Impl )
            // InternalComponentDefinition.g:7785:2: rule__OpcUa_SeRoNet__Group_2__1__Impl
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
    // InternalComponentDefinition.g:7791:1: rule__OpcUa_SeRoNet__Group_2__1__Impl : ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7795:1: ( ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:7796:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:7796:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:7797:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:7798:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:7798:3: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1
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
    // InternalComponentDefinition.g:7807:1: rule__CORBA_SmartSoft__Group__0 : rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 ;
    public final void rule__CORBA_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7811:1: ( rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 )
            // InternalComponentDefinition.g:7812:2: rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_61);
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
    // InternalComponentDefinition.g:7819:1: rule__CORBA_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__CORBA_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7823:1: ( ( () ) )
            // InternalComponentDefinition.g:7824:1: ( () )
            {
            // InternalComponentDefinition.g:7824:1: ( () )
            // InternalComponentDefinition.g:7825:2: ()
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); 
            // InternalComponentDefinition.g:7826:2: ()
            // InternalComponentDefinition.g:7826:3: 
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
    // InternalComponentDefinition.g:7834:1: rule__CORBA_SmartSoft__Group__1 : rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 ;
    public final void rule__CORBA_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7838:1: ( rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 )
            // InternalComponentDefinition.g:7839:2: rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_59);
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
    // InternalComponentDefinition.g:7846:1: rule__CORBA_SmartSoft__Group__1__Impl : ( 'CORBA_SmartSoft' ) ;
    public final void rule__CORBA_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7850:1: ( ( 'CORBA_SmartSoft' ) )
            // InternalComponentDefinition.g:7851:1: ( 'CORBA_SmartSoft' )
            {
            // InternalComponentDefinition.g:7851:1: ( 'CORBA_SmartSoft' )
            // InternalComponentDefinition.g:7852:2: 'CORBA_SmartSoft'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); 
            match(input,79,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7861:1: rule__CORBA_SmartSoft__Group__2 : rule__CORBA_SmartSoft__Group__2__Impl ;
    public final void rule__CORBA_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7865:1: ( rule__CORBA_SmartSoft__Group__2__Impl )
            // InternalComponentDefinition.g:7866:2: rule__CORBA_SmartSoft__Group__2__Impl
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
    // InternalComponentDefinition.g:7872:1: rule__CORBA_SmartSoft__Group__2__Impl : ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) ;
    public final void rule__CORBA_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7876:1: ( ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) )
            // InternalComponentDefinition.g:7877:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:7877:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            // InternalComponentDefinition.g:7878:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); 
            // InternalComponentDefinition.g:7879:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==77) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalComponentDefinition.g:7879:3: rule__CORBA_SmartSoft__Group_2__0
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
    // InternalComponentDefinition.g:7888:1: rule__CORBA_SmartSoft__Group_2__0 : rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 ;
    public final void rule__CORBA_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7892:1: ( rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 )
            // InternalComponentDefinition.g:7893:2: rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDefinition.g:7900:1: rule__CORBA_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__CORBA_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7904:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:7905:1: ( 'description' )
            {
            // InternalComponentDefinition.g:7905:1: ( 'description' )
            // InternalComponentDefinition.g:7906:2: 'description'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7915:1: rule__CORBA_SmartSoft__Group_2__1 : rule__CORBA_SmartSoft__Group_2__1__Impl ;
    public final void rule__CORBA_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7919:1: ( rule__CORBA_SmartSoft__Group_2__1__Impl )
            // InternalComponentDefinition.g:7920:2: rule__CORBA_SmartSoft__Group_2__1__Impl
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
    // InternalComponentDefinition.g:7926:1: rule__CORBA_SmartSoft__Group_2__1__Impl : ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__CORBA_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7930:1: ( ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:7931:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:7931:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:7932:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:7933:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:7933:3: rule__CORBA_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentDefinition.g:7942:1: rule__DDS_SmartSoft__Group__0 : rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 ;
    public final void rule__DDS_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7946:1: ( rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 )
            // InternalComponentDefinition.g:7947:2: rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentDefinition.g:7954:1: rule__DDS_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__DDS_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7958:1: ( ( () ) )
            // InternalComponentDefinition.g:7959:1: ( () )
            {
            // InternalComponentDefinition.g:7959:1: ( () )
            // InternalComponentDefinition.g:7960:2: ()
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); 
            // InternalComponentDefinition.g:7961:2: ()
            // InternalComponentDefinition.g:7961:3: 
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
    // InternalComponentDefinition.g:7969:1: rule__DDS_SmartSoft__Group__1 : rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 ;
    public final void rule__DDS_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7973:1: ( rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 )
            // InternalComponentDefinition.g:7974:2: rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_59);
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
    // InternalComponentDefinition.g:7981:1: rule__DDS_SmartSoft__Group__1__Impl : ( 'DDS_SmartSoft' ) ;
    public final void rule__DDS_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:7985:1: ( ( 'DDS_SmartSoft' ) )
            // InternalComponentDefinition.g:7986:1: ( 'DDS_SmartSoft' )
            {
            // InternalComponentDefinition.g:7986:1: ( 'DDS_SmartSoft' )
            // InternalComponentDefinition.g:7987:2: 'DDS_SmartSoft'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); 
            match(input,80,FOLLOW_2); 
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
    // InternalComponentDefinition.g:7996:1: rule__DDS_SmartSoft__Group__2 : rule__DDS_SmartSoft__Group__2__Impl ;
    public final void rule__DDS_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8000:1: ( rule__DDS_SmartSoft__Group__2__Impl )
            // InternalComponentDefinition.g:8001:2: rule__DDS_SmartSoft__Group__2__Impl
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
    // InternalComponentDefinition.g:8007:1: rule__DDS_SmartSoft__Group__2__Impl : ( ( rule__DDS_SmartSoft__Group_2__0 )? ) ;
    public final void rule__DDS_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8011:1: ( ( ( rule__DDS_SmartSoft__Group_2__0 )? ) )
            // InternalComponentDefinition.g:8012:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentDefinition.g:8012:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            // InternalComponentDefinition.g:8013:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); 
            // InternalComponentDefinition.g:8014:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==77) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalComponentDefinition.g:8014:3: rule__DDS_SmartSoft__Group_2__0
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
    // InternalComponentDefinition.g:8023:1: rule__DDS_SmartSoft__Group_2__0 : rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 ;
    public final void rule__DDS_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8027:1: ( rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 )
            // InternalComponentDefinition.g:8028:2: rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentDefinition.g:8035:1: rule__DDS_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__DDS_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8039:1: ( ( 'description' ) )
            // InternalComponentDefinition.g:8040:1: ( 'description' )
            {
            // InternalComponentDefinition.g:8040:1: ( 'description' )
            // InternalComponentDefinition.g:8041:2: 'description'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,77,FOLLOW_2); 
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
    // InternalComponentDefinition.g:8050:1: rule__DDS_SmartSoft__Group_2__1 : rule__DDS_SmartSoft__Group_2__1__Impl ;
    public final void rule__DDS_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8054:1: ( rule__DDS_SmartSoft__Group_2__1__Impl )
            // InternalComponentDefinition.g:8055:2: rule__DDS_SmartSoft__Group_2__1__Impl
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
    // InternalComponentDefinition.g:8061:1: rule__DDS_SmartSoft__Group_2__1__Impl : ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__DDS_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8065:1: ( ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentDefinition.g:8066:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentDefinition.g:8066:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentDefinition.g:8067:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentDefinition.g:8068:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentDefinition.g:8068:3: rule__DDS_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentDefinition.g:8077:1: rule__InputLinkExtension__UnorderedGroup_4 : ( rule__InputLinkExtension__UnorderedGroup_4__0 )? ;
    public final void rule__InputLinkExtension__UnorderedGroup_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4());
        	
        try {
            // InternalComponentDefinition.g:8082:1: ( ( rule__InputLinkExtension__UnorderedGroup_4__0 )? )
            // InternalComponentDefinition.g:8083:2: ( rule__InputLinkExtension__UnorderedGroup_4__0 )?
            {
            // InternalComponentDefinition.g:8083:2: ( rule__InputLinkExtension__UnorderedGroup_4__0 )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( LA72_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt72=1;
            }
            else if ( LA72_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt72=1;
            }
            else if ( LA72_0 == 85 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalComponentDefinition.g:8083:2: rule__InputLinkExtension__UnorderedGroup_4__0
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
    // InternalComponentDefinition.g:8091:1: rule__InputLinkExtension__UnorderedGroup_4__Impl : ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) ) ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDefinition.g:8096:1: ( ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) ) )
            // InternalComponentDefinition.g:8097:3: ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) )
            {
            // InternalComponentDefinition.g:8097:3: ( ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) ) | ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) ) )
            int alt73=3;
            int LA73_0 = input.LA(1);

            if ( LA73_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt73=1;
            }
            else if ( LA73_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt73=2;
            }
            else if ( LA73_0 == 85 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt73=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalComponentDefinition.g:8098:3: ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:8098:3: ({...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) ) )
                    // InternalComponentDefinition.g:8099:4: {...}? => ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                        throw new FailedPredicateException(input, "rule__InputLinkExtension__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0)");
                    }
                    // InternalComponentDefinition.g:8099:114: ( ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) ) )
                    // InternalComponentDefinition.g:8100:5: ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:8106:5: ( ( rule__InputLinkExtension__OptionalAssignment_4_0 ) )
                    // InternalComponentDefinition.g:8107:6: ( rule__InputLinkExtension__OptionalAssignment_4_0 )
                    {
                     before(grammarAccess.getInputLinkExtensionAccess().getOptionalAssignment_4_0()); 
                    // InternalComponentDefinition.g:8108:6: ( rule__InputLinkExtension__OptionalAssignment_4_0 )
                    // InternalComponentDefinition.g:8108:7: rule__InputLinkExtension__OptionalAssignment_4_0
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
                    // InternalComponentDefinition.g:8113:3: ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) )
                    {
                    // InternalComponentDefinition.g:8113:3: ({...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) ) )
                    // InternalComponentDefinition.g:8114:4: {...}? => ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                        throw new FailedPredicateException(input, "rule__InputLinkExtension__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1)");
                    }
                    // InternalComponentDefinition.g:8114:114: ( ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) ) )
                    // InternalComponentDefinition.g:8115:5: ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:8121:5: ( ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 ) )
                    // InternalComponentDefinition.g:8122:6: ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 )
                    {
                     before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkAssignment_4_1()); 
                    // InternalComponentDefinition.g:8123:6: ( rule__InputLinkExtension__OversamplingOkAssignment_4_1 )
                    // InternalComponentDefinition.g:8123:7: rule__InputLinkExtension__OversamplingOkAssignment_4_1
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
                    // InternalComponentDefinition.g:8128:3: ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) )
                    {
                    // InternalComponentDefinition.g:8128:3: ({...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) ) )
                    // InternalComponentDefinition.g:8129:4: {...}? => ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                        throw new FailedPredicateException(input, "rule__InputLinkExtension__UnorderedGroup_4__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2)");
                    }
                    // InternalComponentDefinition.g:8129:114: ( ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) ) )
                    // InternalComponentDefinition.g:8130:5: ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:8136:5: ( ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 ) )
                    // InternalComponentDefinition.g:8137:6: ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 )
                    {
                     before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkAssignment_4_2()); 
                    // InternalComponentDefinition.g:8138:6: ( rule__InputLinkExtension__UndersamplingOkAssignment_4_2 )
                    // InternalComponentDefinition.g:8138:7: rule__InputLinkExtension__UndersamplingOkAssignment_4_2
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
    // InternalComponentDefinition.g:8151:1: rule__InputLinkExtension__UnorderedGroup_4__0 : rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__1 )? ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8155:1: ( rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__1 )? )
            // InternalComponentDefinition.g:8156:2: rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__1 )?
            {
            pushFollow(FOLLOW_62);
            rule__InputLinkExtension__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:8157:2: ( rule__InputLinkExtension__UnorderedGroup_4__1 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( LA74_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt74=1;
            }
            else if ( LA74_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt74=1;
            }
            else if ( LA74_0 == 85 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalComponentDefinition.g:8157:2: rule__InputLinkExtension__UnorderedGroup_4__1
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
    // InternalComponentDefinition.g:8163:1: rule__InputLinkExtension__UnorderedGroup_4__1 : rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__2 )? ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8167:1: ( rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__2 )? )
            // InternalComponentDefinition.g:8168:2: rule__InputLinkExtension__UnorderedGroup_4__Impl ( rule__InputLinkExtension__UnorderedGroup_4__2 )?
            {
            pushFollow(FOLLOW_62);
            rule__InputLinkExtension__UnorderedGroup_4__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:8169:2: ( rule__InputLinkExtension__UnorderedGroup_4__2 )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( LA75_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 0) ) {
                alt75=1;
            }
            else if ( LA75_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 1) ) {
                alt75=1;
            }
            else if ( LA75_0 == 85 && getUnorderedGroupHelper().canSelect(grammarAccess.getInputLinkExtensionAccess().getUnorderedGroup_4(), 2) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // InternalComponentDefinition.g:8169:2: rule__InputLinkExtension__UnorderedGroup_4__2
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
    // InternalComponentDefinition.g:8175:1: rule__InputLinkExtension__UnorderedGroup_4__2 : rule__InputLinkExtension__UnorderedGroup_4__Impl ;
    public final void rule__InputLinkExtension__UnorderedGroup_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8179:1: ( rule__InputLinkExtension__UnorderedGroup_4__Impl )
            // InternalComponentDefinition.g:8180:2: rule__InputLinkExtension__UnorderedGroup_4__Impl
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
    // InternalComponentDefinition.g:8187:1: rule__ActivationConstraints__UnorderedGroup_7 : ( rule__ActivationConstraints__UnorderedGroup_7__0 )? ;
    public final void rule__ActivationConstraints__UnorderedGroup_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7());
        	
        try {
            // InternalComponentDefinition.g:8192:1: ( ( rule__ActivationConstraints__UnorderedGroup_7__0 )? )
            // InternalComponentDefinition.g:8193:2: ( rule__ActivationConstraints__UnorderedGroup_7__0 )?
            {
            // InternalComponentDefinition.g:8193:2: ( rule__ActivationConstraints__UnorderedGroup_7__0 )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( LA76_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                alt76=1;
            }
            else if ( LA76_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalComponentDefinition.g:8193:2: rule__ActivationConstraints__UnorderedGroup_7__0
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
    // InternalComponentDefinition.g:8201:1: rule__ActivationConstraints__UnorderedGroup_7__Impl : ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) ) ;
    public final void rule__ActivationConstraints__UnorderedGroup_7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDefinition.g:8206:1: ( ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) ) )
            // InternalComponentDefinition.g:8207:3: ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) )
            {
            // InternalComponentDefinition.g:8207:3: ( ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) ) | ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) ) )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( LA77_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                alt77=1;
            }
            else if ( LA77_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalComponentDefinition.g:8208:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:8208:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) ) )
                    // InternalComponentDefinition.g:8209:4: {...}? => ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                        throw new FailedPredicateException(input, "rule__ActivationConstraints__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0)");
                    }
                    // InternalComponentDefinition.g:8209:117: ( ( ( rule__ActivationConstraints__Group_7_0__0 ) ) )
                    // InternalComponentDefinition.g:8210:5: ( ( rule__ActivationConstraints__Group_7_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:8216:5: ( ( rule__ActivationConstraints__Group_7_0__0 ) )
                    // InternalComponentDefinition.g:8217:6: ( rule__ActivationConstraints__Group_7_0__0 )
                    {
                     before(grammarAccess.getActivationConstraintsAccess().getGroup_7_0()); 
                    // InternalComponentDefinition.g:8218:6: ( rule__ActivationConstraints__Group_7_0__0 )
                    // InternalComponentDefinition.g:8218:7: rule__ActivationConstraints__Group_7_0__0
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
                    // InternalComponentDefinition.g:8223:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:8223:3: ({...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) ) )
                    // InternalComponentDefinition.g:8224:4: {...}? => ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                        throw new FailedPredicateException(input, "rule__ActivationConstraints__UnorderedGroup_7__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1)");
                    }
                    // InternalComponentDefinition.g:8224:117: ( ( ( rule__ActivationConstraints__Group_7_1__0 ) ) )
                    // InternalComponentDefinition.g:8225:5: ( ( rule__ActivationConstraints__Group_7_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:8231:5: ( ( rule__ActivationConstraints__Group_7_1__0 ) )
                    // InternalComponentDefinition.g:8232:6: ( rule__ActivationConstraints__Group_7_1__0 )
                    {
                     before(grammarAccess.getActivationConstraintsAccess().getGroup_7_1()); 
                    // InternalComponentDefinition.g:8233:6: ( rule__ActivationConstraints__Group_7_1__0 )
                    // InternalComponentDefinition.g:8233:7: rule__ActivationConstraints__Group_7_1__0
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
    // InternalComponentDefinition.g:8246:1: rule__ActivationConstraints__UnorderedGroup_7__0 : rule__ActivationConstraints__UnorderedGroup_7__Impl ( rule__ActivationConstraints__UnorderedGroup_7__1 )? ;
    public final void rule__ActivationConstraints__UnorderedGroup_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8250:1: ( rule__ActivationConstraints__UnorderedGroup_7__Impl ( rule__ActivationConstraints__UnorderedGroup_7__1 )? )
            // InternalComponentDefinition.g:8251:2: rule__ActivationConstraints__UnorderedGroup_7__Impl ( rule__ActivationConstraints__UnorderedGroup_7__1 )?
            {
            pushFollow(FOLLOW_63);
            rule__ActivationConstraints__UnorderedGroup_7__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:8252:2: ( rule__ActivationConstraints__UnorderedGroup_7__1 )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( LA78_0 == 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 0) ) {
                alt78=1;
            }
            else if ( LA78_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getActivationConstraintsAccess().getUnorderedGroup_7(), 1) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // InternalComponentDefinition.g:8252:2: rule__ActivationConstraints__UnorderedGroup_7__1
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
    // InternalComponentDefinition.g:8258:1: rule__ActivationConstraints__UnorderedGroup_7__1 : rule__ActivationConstraints__UnorderedGroup_7__Impl ;
    public final void rule__ActivationConstraints__UnorderedGroup_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8262:1: ( rule__ActivationConstraints__UnorderedGroup_7__Impl )
            // InternalComponentDefinition.g:8263:2: rule__ActivationConstraints__UnorderedGroup_7__Impl
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


    // $ANTLR start "rule__OpcUaDeviceClient__UnorderedGroup_3"
    // InternalComponentDefinition.g:8270:1: rule__OpcUaDeviceClient__UnorderedGroup_3 : rule__OpcUaDeviceClient__UnorderedGroup_3__0 {...}?;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3());
        	
        try {
            // InternalComponentDefinition.g:8275:1: ( rule__OpcUaDeviceClient__UnorderedGroup_3__0 {...}?)
            // InternalComponentDefinition.g:8276:2: rule__OpcUaDeviceClient__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__OpcUaDeviceClient__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__UnorderedGroup_3"


    // $ANTLR start "rule__OpcUaDeviceClient__UnorderedGroup_3__Impl"
    // InternalComponentDefinition.g:8284:1: rule__OpcUaDeviceClient__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_3__0 ) ) ) ) ) ;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalComponentDefinition.g:8289:1: ( ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_3__0 ) ) ) ) ) )
            // InternalComponentDefinition.g:8290:3: ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_3__0 ) ) ) ) )
            {
            // InternalComponentDefinition.g:8290:3: ( ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_2__0 ) ) ) ) | ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_3__0 ) ) ) ) )
            int alt79=4;
            int LA79_0 = input.LA(1);

            if ( LA79_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 0) ) {
                alt79=1;
            }
            else if ( LA79_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 1) ) {
                alt79=2;
            }
            else if ( LA79_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 2) ) {
                alt79=3;
            }
            else if ( LA79_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 3) ) {
                alt79=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalComponentDefinition.g:8291:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_0__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:8291:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_0__0 ) ) ) )
                    // InternalComponentDefinition.g:8292:4: {...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__OpcUaDeviceClient__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalComponentDefinition.g:8292:113: ( ( ( rule__OpcUaDeviceClient__Group_3_0__0 ) ) )
                    // InternalComponentDefinition.g:8293:5: ( ( rule__OpcUaDeviceClient__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:8299:5: ( ( rule__OpcUaDeviceClient__Group_3_0__0 ) )
                    // InternalComponentDefinition.g:8300:6: ( rule__OpcUaDeviceClient__Group_3_0__0 )
                    {
                     before(grammarAccess.getOpcUaDeviceClientAccess().getGroup_3_0()); 
                    // InternalComponentDefinition.g:8301:6: ( rule__OpcUaDeviceClient__Group_3_0__0 )
                    // InternalComponentDefinition.g:8301:7: rule__OpcUaDeviceClient__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaDeviceClient__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpcUaDeviceClientAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalComponentDefinition.g:8306:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 ) ) ) )
                    {
                    // InternalComponentDefinition.g:8306:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 ) ) ) )
                    // InternalComponentDefinition.g:8307:4: {...}? => ( ( ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__OpcUaDeviceClient__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalComponentDefinition.g:8307:113: ( ( ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 ) ) )
                    // InternalComponentDefinition.g:8308:5: ( ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:8314:5: ( ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 ) )
                    // InternalComponentDefinition.g:8315:6: ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 )
                    {
                     before(grammarAccess.getOpcUaDeviceClientAccess().getAutoConnectAssignment_3_1()); 
                    // InternalComponentDefinition.g:8316:6: ( rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 )
                    // InternalComponentDefinition.g:8316:7: rule__OpcUaDeviceClient__AutoConnectAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaDeviceClient__AutoConnectAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpcUaDeviceClientAccess().getAutoConnectAssignment_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalComponentDefinition.g:8321:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_2__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:8321:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_2__0 ) ) ) )
                    // InternalComponentDefinition.g:8322:4: {...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__OpcUaDeviceClient__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalComponentDefinition.g:8322:113: ( ( ( rule__OpcUaDeviceClient__Group_3_2__0 ) ) )
                    // InternalComponentDefinition.g:8323:5: ( ( rule__OpcUaDeviceClient__Group_3_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 2);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:8329:5: ( ( rule__OpcUaDeviceClient__Group_3_2__0 ) )
                    // InternalComponentDefinition.g:8330:6: ( rule__OpcUaDeviceClient__Group_3_2__0 )
                    {
                     before(grammarAccess.getOpcUaDeviceClientAccess().getGroup_3_2()); 
                    // InternalComponentDefinition.g:8331:6: ( rule__OpcUaDeviceClient__Group_3_2__0 )
                    // InternalComponentDefinition.g:8331:7: rule__OpcUaDeviceClient__Group_3_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaDeviceClient__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpcUaDeviceClientAccess().getGroup_3_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalComponentDefinition.g:8336:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_3__0 ) ) ) )
                    {
                    // InternalComponentDefinition.g:8336:3: ({...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_3__0 ) ) ) )
                    // InternalComponentDefinition.g:8337:4: {...}? => ( ( ( rule__OpcUaDeviceClient__Group_3_3__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 3) ) {
                        throw new FailedPredicateException(input, "rule__OpcUaDeviceClient__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalComponentDefinition.g:8337:113: ( ( ( rule__OpcUaDeviceClient__Group_3_3__0 ) ) )
                    // InternalComponentDefinition.g:8338:5: ( ( rule__OpcUaDeviceClient__Group_3_3__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 3);
                    				

                    					selected = true;
                    				
                    // InternalComponentDefinition.g:8344:5: ( ( rule__OpcUaDeviceClient__Group_3_3__0 ) )
                    // InternalComponentDefinition.g:8345:6: ( rule__OpcUaDeviceClient__Group_3_3__0 )
                    {
                     before(grammarAccess.getOpcUaDeviceClientAccess().getGroup_3_3()); 
                    // InternalComponentDefinition.g:8346:6: ( rule__OpcUaDeviceClient__Group_3_3__0 )
                    // InternalComponentDefinition.g:8346:7: rule__OpcUaDeviceClient__Group_3_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaDeviceClient__Group_3_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getOpcUaDeviceClientAccess().getGroup_3_3()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__OpcUaDeviceClient__UnorderedGroup_3__0"
    // InternalComponentDefinition.g:8359:1: rule__OpcUaDeviceClient__UnorderedGroup_3__0 : rule__OpcUaDeviceClient__UnorderedGroup_3__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_3__1 )? ;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8363:1: ( rule__OpcUaDeviceClient__UnorderedGroup_3__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_3__1 )? )
            // InternalComponentDefinition.g:8364:2: rule__OpcUaDeviceClient__UnorderedGroup_3__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_64);
            rule__OpcUaDeviceClient__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:8365:2: ( rule__OpcUaDeviceClient__UnorderedGroup_3__1 )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( LA80_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 0) ) {
                alt80=1;
            }
            else if ( LA80_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 1) ) {
                alt80=1;
            }
            else if ( LA80_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 2) ) {
                alt80=1;
            }
            else if ( LA80_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 3) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalComponentDefinition.g:8365:2: rule__OpcUaDeviceClient__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaDeviceClient__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__OpcUaDeviceClient__UnorderedGroup_3__0"


    // $ANTLR start "rule__OpcUaDeviceClient__UnorderedGroup_3__1"
    // InternalComponentDefinition.g:8371:1: rule__OpcUaDeviceClient__UnorderedGroup_3__1 : rule__OpcUaDeviceClient__UnorderedGroup_3__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_3__2 )? ;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8375:1: ( rule__OpcUaDeviceClient__UnorderedGroup_3__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_3__2 )? )
            // InternalComponentDefinition.g:8376:2: rule__OpcUaDeviceClient__UnorderedGroup_3__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_64);
            rule__OpcUaDeviceClient__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:8377:2: ( rule__OpcUaDeviceClient__UnorderedGroup_3__2 )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( LA81_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 0) ) {
                alt81=1;
            }
            else if ( LA81_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 1) ) {
                alt81=1;
            }
            else if ( LA81_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 2) ) {
                alt81=1;
            }
            else if ( LA81_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 3) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalComponentDefinition.g:8377:2: rule__OpcUaDeviceClient__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaDeviceClient__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__OpcUaDeviceClient__UnorderedGroup_3__1"


    // $ANTLR start "rule__OpcUaDeviceClient__UnorderedGroup_3__2"
    // InternalComponentDefinition.g:8383:1: rule__OpcUaDeviceClient__UnorderedGroup_3__2 : rule__OpcUaDeviceClient__UnorderedGroup_3__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_3__3 )? ;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8387:1: ( rule__OpcUaDeviceClient__UnorderedGroup_3__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_3__3 )? )
            // InternalComponentDefinition.g:8388:2: rule__OpcUaDeviceClient__UnorderedGroup_3__Impl ( rule__OpcUaDeviceClient__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_64);
            rule__OpcUaDeviceClient__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalComponentDefinition.g:8389:2: ( rule__OpcUaDeviceClient__UnorderedGroup_3__3 )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( LA82_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 0) ) {
                alt82=1;
            }
            else if ( LA82_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 1) ) {
                alt82=1;
            }
            else if ( LA82_0 == 54 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 2) ) {
                alt82=1;
            }
            else if ( LA82_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getOpcUaDeviceClientAccess().getUnorderedGroup_3(), 3) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalComponentDefinition.g:8389:2: rule__OpcUaDeviceClient__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaDeviceClient__UnorderedGroup_3__3();

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
    // $ANTLR end "rule__OpcUaDeviceClient__UnorderedGroup_3__2"


    // $ANTLR start "rule__OpcUaDeviceClient__UnorderedGroup_3__3"
    // InternalComponentDefinition.g:8395:1: rule__OpcUaDeviceClient__UnorderedGroup_3__3 : rule__OpcUaDeviceClient__UnorderedGroup_3__Impl ;
    public final void rule__OpcUaDeviceClient__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8399:1: ( rule__OpcUaDeviceClient__UnorderedGroup_3__Impl )
            // InternalComponentDefinition.g:8400:2: rule__OpcUaDeviceClient__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClient__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__UnorderedGroup_3__3"


    // $ANTLR start "rule__ComponentDefModel__ImportsAssignment_1"
    // InternalComponentDefinition.g:8407:1: rule__ComponentDefModel__ImportsAssignment_1 : ( ruleServiceRepoImport ) ;
    public final void rule__ComponentDefModel__ImportsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8411:1: ( ( ruleServiceRepoImport ) )
            // InternalComponentDefinition.g:8412:2: ( ruleServiceRepoImport )
            {
            // InternalComponentDefinition.g:8412:2: ( ruleServiceRepoImport )
            // InternalComponentDefinition.g:8413:3: ruleServiceRepoImport
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
    // InternalComponentDefinition.g:8422:1: rule__ComponentDefModel__ComponentAssignment_2 : ( ruleComponentDefinition ) ;
    public final void rule__ComponentDefModel__ComponentAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8426:1: ( ( ruleComponentDefinition ) )
            // InternalComponentDefinition.g:8427:2: ( ruleComponentDefinition )
            {
            // InternalComponentDefinition.g:8427:2: ( ruleComponentDefinition )
            // InternalComponentDefinition.g:8428:3: ruleComponentDefinition
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
    // InternalComponentDefinition.g:8437:1: rule__ServiceRepoImport__ImportedNamespaceAssignment_1 : ( ruleFQNW ) ;
    public final void rule__ServiceRepoImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8441:1: ( ( ruleFQNW ) )
            // InternalComponentDefinition.g:8442:2: ( ruleFQNW )
            {
            // InternalComponentDefinition.g:8442:2: ( ruleFQNW )
            // InternalComponentDefinition.g:8443:3: ruleFQNW
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


    // $ANTLR start "rule__ComponentDefinition__DocumentationAssignment_0"
    // InternalComponentDefinition.g:8452:1: rule__ComponentDefinition__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__ComponentDefinition__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8456:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalComponentDefinition.g:8457:2: ( RULE_DOCU_COMMENT )
            {
            // InternalComponentDefinition.g:8457:2: ( RULE_DOCU_COMMENT )
            // InternalComponentDefinition.g:8458:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getComponentDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__DocumentationAssignment_0"


    // $ANTLR start "rule__ComponentDefinition__NameAssignment_2"
    // InternalComponentDefinition.g:8467:1: rule__ComponentDefinition__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__ComponentDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8471:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8472:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8472:2: ( RULE_ID )
            // InternalComponentDefinition.g:8473:3: RULE_ID
            {
             before(grammarAccess.getComponentDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__NameAssignment_2"


    // $ANTLR start "rule__ComponentDefinition__LogoAssignment_3_1"
    // InternalComponentDefinition.g:8482:1: rule__ComponentDefinition__LogoAssignment_3_1 : ( RULE_STRING ) ;
    public final void rule__ComponentDefinition__LogoAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8486:1: ( ( RULE_STRING ) )
            // InternalComponentDefinition.g:8487:2: ( RULE_STRING )
            {
            // InternalComponentDefinition.g:8487:2: ( RULE_STRING )
            // InternalComponentDefinition.g:8488:3: RULE_STRING
            {
             before(grammarAccess.getComponentDefinitionAccess().getLogoSTRINGTerminalRuleCall_3_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getComponentDefinitionAccess().getLogoSTRINGTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__LogoAssignment_3_1"


    // $ANTLR start "rule__ComponentDefinition__ElementsAssignment_5"
    // InternalComponentDefinition.g:8497:1: rule__ComponentDefinition__ElementsAssignment_5 : ( ruleAbstractComponentElement ) ;
    public final void rule__ComponentDefinition__ElementsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8501:1: ( ( ruleAbstractComponentElement ) )
            // InternalComponentDefinition.g:8502:2: ( ruleAbstractComponentElement )
            {
            // InternalComponentDefinition.g:8502:2: ( ruleAbstractComponentElement )
            // InternalComponentDefinition.g:8503:3: ruleAbstractComponentElement
            {
             before(grammarAccess.getComponentDefinitionAccess().getElementsAbstractComponentElementParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractComponentElement();

            state._fsp--;

             after(grammarAccess.getComponentDefinitionAccess().getElementsAbstractComponentElementParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentDefinition__ElementsAssignment_5"


    // $ANTLR start "rule__RequestPort__DocumentationAssignment_0"
    // InternalComponentDefinition.g:8512:1: rule__RequestPort__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__RequestPort__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8516:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalComponentDefinition.g:8517:2: ( RULE_DOCU_COMMENT )
            {
            // InternalComponentDefinition.g:8517:2: ( RULE_DOCU_COMMENT )
            // InternalComponentDefinition.g:8518:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getRequestPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getRequestPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__DocumentationAssignment_0"


    // $ANTLR start "rule__RequestPort__NameAssignment_2"
    // InternalComponentDefinition.g:8527:1: rule__RequestPort__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__RequestPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8531:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8532:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8532:2: ( RULE_ID )
            // InternalComponentDefinition.g:8533:3: RULE_ID
            {
             before(grammarAccess.getRequestPortAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequestPortAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__NameAssignment_2"


    // $ANTLR start "rule__RequestPort__ServiceAssignment_4"
    // InternalComponentDefinition.g:8542:1: rule__RequestPort__ServiceAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__RequestPort__ServiceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8546:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8547:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8547:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8548:3: ( ruleFQN )
            {
             before(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceCrossReference_4_0()); 
            // InternalComponentDefinition.g:8549:3: ( ruleFQN )
            // InternalComponentDefinition.g:8550:4: ruleFQN
            {
             before(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRequestPortAccess().getServiceTwoWayCommunicationServiceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__ServiceAssignment_4"


    // $ANTLR start "rule__RequestPort__ExtensionsAssignment_6"
    // InternalComponentDefinition.g:8561:1: rule__RequestPort__ExtensionsAssignment_6 : ( ruleComponentPortExtension ) ;
    public final void rule__RequestPort__ExtensionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8565:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:8566:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:8566:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:8567:3: ruleComponentPortExtension
            {
             before(grammarAccess.getRequestPortAccess().getExtensionsComponentPortExtensionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentPortExtension();

            state._fsp--;

             after(grammarAccess.getRequestPortAccess().getExtensionsComponentPortExtensionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequestPort__ExtensionsAssignment_6"


    // $ANTLR start "rule__OutputPort__DocumentationAssignment_0"
    // InternalComponentDefinition.g:8576:1: rule__OutputPort__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__OutputPort__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8580:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalComponentDefinition.g:8581:2: ( RULE_DOCU_COMMENT )
            {
            // InternalComponentDefinition.g:8581:2: ( RULE_DOCU_COMMENT )
            // InternalComponentDefinition.g:8582:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getOutputPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__DocumentationAssignment_0"


    // $ANTLR start "rule__OutputPort__NameAssignment_2"
    // InternalComponentDefinition.g:8591:1: rule__OutputPort__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__OutputPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8595:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8596:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8596:2: ( RULE_ID )
            // InternalComponentDefinition.g:8597:3: RULE_ID
            {
             before(grammarAccess.getOutputPortAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getOutputPortAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__NameAssignment_2"


    // $ANTLR start "rule__OutputPort__ServiceAssignment_4"
    // InternalComponentDefinition.g:8606:1: rule__OutputPort__ServiceAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__OutputPort__ServiceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8610:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8611:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8611:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8612:3: ( ruleFQN )
            {
             before(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceCrossReference_4_0()); 
            // InternalComponentDefinition.g:8613:3: ( ruleFQN )
            // InternalComponentDefinition.g:8614:4: ruleFQN
            {
             before(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getOutputPortAccess().getServiceOneWayCommunicationServiceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__ServiceAssignment_4"


    // $ANTLR start "rule__OutputPort__ActivityAssignment_6"
    // InternalComponentDefinition.g:8625:1: rule__OutputPort__ActivityAssignment_6 : ( ( ruleFQN ) ) ;
    public final void rule__OutputPort__ActivityAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8629:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8630:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8630:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8631:3: ( ruleFQN )
            {
             before(grammarAccess.getOutputPortAccess().getActivityActivityCrossReference_6_0()); 
            // InternalComponentDefinition.g:8632:3: ( ruleFQN )
            // InternalComponentDefinition.g:8633:4: ruleFQN
            {
             before(grammarAccess.getOutputPortAccess().getActivityActivityFQNParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getActivityActivityFQNParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getOutputPortAccess().getActivityActivityCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__ActivityAssignment_6"


    // $ANTLR start "rule__OutputPort__ExtensionsAssignment_8"
    // InternalComponentDefinition.g:8644:1: rule__OutputPort__ExtensionsAssignment_8 : ( ruleComponentPortExtension ) ;
    public final void rule__OutputPort__ExtensionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8648:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:8649:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:8649:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:8650:3: ruleComponentPortExtension
            {
             before(grammarAccess.getOutputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentPortExtension();

            state._fsp--;

             after(grammarAccess.getOutputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OutputPort__ExtensionsAssignment_8"


    // $ANTLR start "rule__AnswerPort__DocumentationAssignment_0"
    // InternalComponentDefinition.g:8659:1: rule__AnswerPort__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__AnswerPort__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8663:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalComponentDefinition.g:8664:2: ( RULE_DOCU_COMMENT )
            {
            // InternalComponentDefinition.g:8664:2: ( RULE_DOCU_COMMENT )
            // InternalComponentDefinition.g:8665:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getAnswerPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getAnswerPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__DocumentationAssignment_0"


    // $ANTLR start "rule__AnswerPort__NameAssignment_2"
    // InternalComponentDefinition.g:8674:1: rule__AnswerPort__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__AnswerPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8678:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8679:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8679:2: ( RULE_ID )
            // InternalComponentDefinition.g:8680:3: RULE_ID
            {
             before(grammarAccess.getAnswerPortAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAnswerPortAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__NameAssignment_2"


    // $ANTLR start "rule__AnswerPort__ServiceAssignment_4"
    // InternalComponentDefinition.g:8689:1: rule__AnswerPort__ServiceAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__AnswerPort__ServiceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8693:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8694:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8694:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8695:3: ( ruleFQN )
            {
             before(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceCrossReference_4_0()); 
            // InternalComponentDefinition.g:8696:3: ( ruleFQN )
            // InternalComponentDefinition.g:8697:4: ruleFQN
            {
             before(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getAnswerPortAccess().getServiceTwoWayCommunicationServiceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__ServiceAssignment_4"


    // $ANTLR start "rule__AnswerPort__ExtensionsAssignment_6"
    // InternalComponentDefinition.g:8708:1: rule__AnswerPort__ExtensionsAssignment_6 : ( ruleComponentPortExtension ) ;
    public final void rule__AnswerPort__ExtensionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8712:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:8713:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:8713:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:8714:3: ruleComponentPortExtension
            {
             before(grammarAccess.getAnswerPortAccess().getExtensionsComponentPortExtensionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentPortExtension();

            state._fsp--;

             after(grammarAccess.getAnswerPortAccess().getExtensionsComponentPortExtensionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AnswerPort__ExtensionsAssignment_6"


    // $ANTLR start "rule__InputPort__DocumentationAssignment_0"
    // InternalComponentDefinition.g:8723:1: rule__InputPort__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__InputPort__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8727:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalComponentDefinition.g:8728:2: ( RULE_DOCU_COMMENT )
            {
            // InternalComponentDefinition.g:8728:2: ( RULE_DOCU_COMMENT )
            // InternalComponentDefinition.g:8729:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getInputPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__DocumentationAssignment_0"


    // $ANTLR start "rule__InputPort__NameAssignment_2"
    // InternalComponentDefinition.g:8738:1: rule__InputPort__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__InputPort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8742:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8743:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8743:2: ( RULE_ID )
            // InternalComponentDefinition.g:8744:3: RULE_ID
            {
             before(grammarAccess.getInputPortAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getInputPortAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__NameAssignment_2"


    // $ANTLR start "rule__InputPort__ServiceAssignment_4"
    // InternalComponentDefinition.g:8753:1: rule__InputPort__ServiceAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__InputPort__ServiceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8757:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8758:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8758:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8759:3: ( ruleFQN )
            {
             before(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceCrossReference_4_0()); 
            // InternalComponentDefinition.g:8760:3: ( ruleFQN )
            // InternalComponentDefinition.g:8761:4: ruleFQN
            {
             before(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getInputPortAccess().getServiceOneWayCommunicationServiceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__ServiceAssignment_4"


    // $ANTLR start "rule__InputPort__ExtensionsAssignment_6"
    // InternalComponentDefinition.g:8772:1: rule__InputPort__ExtensionsAssignment_6 : ( ruleComponentPortExtension ) ;
    public final void rule__InputPort__ExtensionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8776:1: ( ( ruleComponentPortExtension ) )
            // InternalComponentDefinition.g:8777:2: ( ruleComponentPortExtension )
            {
            // InternalComponentDefinition.g:8777:2: ( ruleComponentPortExtension )
            // InternalComponentDefinition.g:8778:3: ruleComponentPortExtension
            {
             before(grammarAccess.getInputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentPortExtension();

            state._fsp--;

             after(grammarAccess.getInputPortAccess().getExtensionsComponentPortExtensionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputPort__ExtensionsAssignment_6"


    // $ANTLR start "rule__SupportedMiddleware__DefaultAssignment_1"
    // InternalComponentDefinition.g:8787:1: rule__SupportedMiddleware__DefaultAssignment_1 : ( ( 'default' ) ) ;
    public final void rule__SupportedMiddleware__DefaultAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8791:1: ( ( ( 'default' ) ) )
            // InternalComponentDefinition.g:8792:2: ( ( 'default' ) )
            {
            // InternalComponentDefinition.g:8792:2: ( ( 'default' ) )
            // InternalComponentDefinition.g:8793:3: ( 'default' )
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); 
            // InternalComponentDefinition.g:8794:3: ( 'default' )
            // InternalComponentDefinition.g:8795:4: 'default'
            {
             before(grammarAccess.getSupportedMiddlewareAccess().getDefaultDefaultKeyword_1_0()); 
            match(input,81,FOLLOW_2); 
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
    // InternalComponentDefinition.g:8806:1: rule__SupportedMiddleware__MiddlewareAssignment_2 : ( ruleRoboticMiddleware ) ;
    public final void rule__SupportedMiddleware__MiddlewareAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8810:1: ( ( ruleRoboticMiddleware ) )
            // InternalComponentDefinition.g:8811:2: ( ruleRoboticMiddleware )
            {
            // InternalComponentDefinition.g:8811:2: ( ruleRoboticMiddleware )
            // InternalComponentDefinition.g:8812:3: ruleRoboticMiddleware
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
    // InternalComponentDefinition.g:8821:1: rule__Activity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Activity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8825:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8826:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8826:2: ( RULE_ID )
            // InternalComponentDefinition.g:8827:3: RULE_ID
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
    // InternalComponentDefinition.g:8836:1: rule__Activity__LinksAssignment_3 : ( ruleAbstractComponentLink ) ;
    public final void rule__Activity__LinksAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8840:1: ( ( ruleAbstractComponentLink ) )
            // InternalComponentDefinition.g:8841:2: ( ruleAbstractComponentLink )
            {
            // InternalComponentDefinition.g:8841:2: ( ruleAbstractComponentLink )
            // InternalComponentDefinition.g:8842:3: ruleAbstractComponentLink
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
    // InternalComponentDefinition.g:8851:1: rule__Activity__ExtensionsAssignment_4 : ( ruleActivityExtension ) ;
    public final void rule__Activity__ExtensionsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8855:1: ( ( ruleActivityExtension ) )
            // InternalComponentDefinition.g:8856:2: ( ruleActivityExtension )
            {
            // InternalComponentDefinition.g:8856:2: ( ruleActivityExtension )
            // InternalComponentDefinition.g:8857:3: ruleActivityExtension
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
    // InternalComponentDefinition.g:8866:1: rule__InputHandler__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__InputHandler__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8870:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8871:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8871:2: ( RULE_ID )
            // InternalComponentDefinition.g:8872:3: RULE_ID
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
    // InternalComponentDefinition.g:8881:1: rule__InputHandler__InputPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__InputHandler__InputPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8885:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8886:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8886:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8887:3: ( ruleFQN )
            {
             before(grammarAccess.getInputHandlerAccess().getInputPortInputPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:8888:3: ( ruleFQN )
            // InternalComponentDefinition.g:8889:4: ruleFQN
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
    // InternalComponentDefinition.g:8900:1: rule__InputHandler__ActiveQueueAssignment_4 : ( ( 'activeQueue' ) ) ;
    public final void rule__InputHandler__ActiveQueueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8904:1: ( ( ( 'activeQueue' ) ) )
            // InternalComponentDefinition.g:8905:2: ( ( 'activeQueue' ) )
            {
            // InternalComponentDefinition.g:8905:2: ( ( 'activeQueue' ) )
            // InternalComponentDefinition.g:8906:3: ( 'activeQueue' )
            {
             before(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            // InternalComponentDefinition.g:8907:3: ( 'activeQueue' )
            // InternalComponentDefinition.g:8908:4: 'activeQueue'
            {
             before(grammarAccess.getInputHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalComponentDefinition.g:8919:1: rule__InputHandler__LinksAssignment_6 : ( ruleAbstractComponentLink ) ;
    public final void rule__InputHandler__LinksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8923:1: ( ( ruleAbstractComponentLink ) )
            // InternalComponentDefinition.g:8924:2: ( ruleAbstractComponentLink )
            {
            // InternalComponentDefinition.g:8924:2: ( ruleAbstractComponentLink )
            // InternalComponentDefinition.g:8925:3: ruleAbstractComponentLink
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
    // InternalComponentDefinition.g:8934:1: rule__RequestHandler__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__RequestHandler__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8938:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:8939:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:8939:2: ( RULE_ID )
            // InternalComponentDefinition.g:8940:3: RULE_ID
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
    // InternalComponentDefinition.g:8949:1: rule__RequestHandler__AnswerPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__RequestHandler__AnswerPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8953:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:8954:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:8954:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:8955:3: ( ruleFQN )
            {
             before(grammarAccess.getRequestHandlerAccess().getAnswerPortAnswerPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:8956:3: ( ruleFQN )
            // InternalComponentDefinition.g:8957:4: ruleFQN
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
    // InternalComponentDefinition.g:8968:1: rule__RequestHandler__ActiveQueueAssignment_4 : ( ( 'activeQueue' ) ) ;
    public final void rule__RequestHandler__ActiveQueueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8972:1: ( ( ( 'activeQueue' ) ) )
            // InternalComponentDefinition.g:8973:2: ( ( 'activeQueue' ) )
            {
            // InternalComponentDefinition.g:8973:2: ( ( 'activeQueue' ) )
            // InternalComponentDefinition.g:8974:3: ( 'activeQueue' )
            {
             before(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            // InternalComponentDefinition.g:8975:3: ( 'activeQueue' )
            // InternalComponentDefinition.g:8976:4: 'activeQueue'
            {
             before(grammarAccess.getRequestHandlerAccess().getActiveQueueActiveQueueKeyword_4_0()); 
            match(input,82,FOLLOW_2); 
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
    // InternalComponentDefinition.g:8987:1: rule__RequestHandler__LinksAssignment_6 : ( ruleAbstractComponentLink ) ;
    public final void rule__RequestHandler__LinksAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:8991:1: ( ( ruleAbstractComponentLink ) )
            // InternalComponentDefinition.g:8992:2: ( ruleAbstractComponentLink )
            {
            // InternalComponentDefinition.g:8992:2: ( ruleAbstractComponentLink )
            // InternalComponentDefinition.g:8993:3: ruleAbstractComponentLink
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
    // InternalComponentDefinition.g:9002:1: rule__RequestPortLink__RequestPortAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__RequestPortLink__RequestPortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9006:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9007:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9007:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9008:3: ( ruleFQN )
            {
             before(grammarAccess.getRequestPortLinkAccess().getRequestPortRequestPortCrossReference_1_0()); 
            // InternalComponentDefinition.g:9009:3: ( ruleFQN )
            // InternalComponentDefinition.g:9010:4: ruleFQN
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
    // InternalComponentDefinition.g:9021:1: rule__OpcUaClientLink__ClientAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__OpcUaClientLink__ClientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9025:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9026:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9026:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9027:3: ( ruleFQN )
            {
             before(grammarAccess.getOpcUaClientLinkAccess().getClientOpcUaDeviceClientCrossReference_1_0()); 
            // InternalComponentDefinition.g:9028:3: ( ruleFQN )
            // InternalComponentDefinition.g:9029:4: ruleFQN
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
    // InternalComponentDefinition.g:9040:1: rule__MixedPortROSLink__MixedportrosAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__MixedPortROSLink__MixedportrosAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9044:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9045:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9045:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9046:3: ( ruleFQN )
            {
             before(grammarAccess.getMixedPortROSLinkAccess().getMixedportrosMixedPortROSCrossReference_1_0()); 
            // InternalComponentDefinition.g:9047:3: ( ruleFQN )
            // InternalComponentDefinition.g:9048:4: ruleFQN
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
    // InternalComponentDefinition.g:9059:1: rule__ComponentSubNodeObserver__SubjectAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentSubNodeObserver__SubjectAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9063:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9064:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9064:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9065:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentSubNodeObserverAccess().getSubjectComponentSubNodeCrossReference_1_0()); 
            // InternalComponentDefinition.g:9066:3: ( ruleFQN )
            // InternalComponentDefinition.g:9067:4: ruleFQN
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
    // InternalComponentDefinition.g:9078:1: rule__InputLinkExtension__InputPortAssignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__InputLinkExtension__InputPortAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9082:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9083:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9083:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9084:3: ( ruleFQN )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getInputPortInputPortCrossReference_2_0()); 
            // InternalComponentDefinition.g:9085:3: ( ruleFQN )
            // InternalComponentDefinition.g:9086:4: ruleFQN
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
    // InternalComponentDefinition.g:9097:1: rule__InputLinkExtension__OptionalAssignment_4_0 : ( ( 'optional' ) ) ;
    public final void rule__InputLinkExtension__OptionalAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9101:1: ( ( ( 'optional' ) ) )
            // InternalComponentDefinition.g:9102:2: ( ( 'optional' ) )
            {
            // InternalComponentDefinition.g:9102:2: ( ( 'optional' ) )
            // InternalComponentDefinition.g:9103:3: ( 'optional' )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); 
            // InternalComponentDefinition.g:9104:3: ( 'optional' )
            // InternalComponentDefinition.g:9105:4: 'optional'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOptionalOptionalKeyword_4_0_0()); 
            match(input,83,FOLLOW_2); 
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
    // InternalComponentDefinition.g:9116:1: rule__InputLinkExtension__OversamplingOkAssignment_4_1 : ( ( 'oversamplingOk' ) ) ;
    public final void rule__InputLinkExtension__OversamplingOkAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9120:1: ( ( ( 'oversamplingOk' ) ) )
            // InternalComponentDefinition.g:9121:2: ( ( 'oversamplingOk' ) )
            {
            // InternalComponentDefinition.g:9121:2: ( ( 'oversamplingOk' ) )
            // InternalComponentDefinition.g:9122:3: ( 'oversamplingOk' )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); 
            // InternalComponentDefinition.g:9123:3: ( 'oversamplingOk' )
            // InternalComponentDefinition.g:9124:4: 'oversamplingOk'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getOversamplingOkOversamplingOkKeyword_4_1_0()); 
            match(input,84,FOLLOW_2); 
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
    // InternalComponentDefinition.g:9135:1: rule__InputLinkExtension__UndersamplingOkAssignment_4_2 : ( ( 'undersamplingOk' ) ) ;
    public final void rule__InputLinkExtension__UndersamplingOkAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9139:1: ( ( ( 'undersamplingOk' ) ) )
            // InternalComponentDefinition.g:9140:2: ( ( 'undersamplingOk' ) )
            {
            // InternalComponentDefinition.g:9140:2: ( ( 'undersamplingOk' ) )
            // InternalComponentDefinition.g:9141:3: ( 'undersamplingOk' )
            {
             before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); 
            // InternalComponentDefinition.g:9142:3: ( 'undersamplingOk' )
            // InternalComponentDefinition.g:9143:4: 'undersamplingOk'
            {
             before(grammarAccess.getInputLinkExtensionAccess().getUndersamplingOkUndersamplingOkKeyword_4_2_0()); 
            match(input,85,FOLLOW_2); 
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
    // InternalComponentDefinition.g:9154:1: rule__ActivationConstraints__ConfigurableAssignment_5 : ( ruleEBoolean ) ;
    public final void rule__ActivationConstraints__ConfigurableAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9158:1: ( ( ruleEBoolean ) )
            // InternalComponentDefinition.g:9159:2: ( ruleEBoolean )
            {
            // InternalComponentDefinition.g:9159:2: ( ruleEBoolean )
            // InternalComponentDefinition.g:9160:3: ruleEBoolean
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
    // InternalComponentDefinition.g:9169:1: rule__ActivationConstraints__MinActFreqAssignment_7_0_2 : ( ruleEDouble ) ;
    public final void rule__ActivationConstraints__MinActFreqAssignment_7_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9173:1: ( ( ruleEDouble ) )
            // InternalComponentDefinition.g:9174:2: ( ruleEDouble )
            {
            // InternalComponentDefinition.g:9174:2: ( ruleEDouble )
            // InternalComponentDefinition.g:9175:3: ruleEDouble
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
    // InternalComponentDefinition.g:9184:1: rule__ActivationConstraints__MaxActFreqAssignment_7_1_2 : ( ruleEDouble ) ;
    public final void rule__ActivationConstraints__MaxActFreqAssignment_7_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9188:1: ( ( ruleEDouble ) )
            // InternalComponentDefinition.g:9189:2: ( ruleEDouble )
            {
            // InternalComponentDefinition.g:9189:2: ( ruleEDouble )
            // InternalComponentDefinition.g:9190:3: ruleEDouble
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
    // InternalComponentDefinition.g:9199:1: rule__OperationModeBinding__ModeAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__OperationModeBinding__ModeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9203:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9204:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9204:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9205:3: ( ruleFQN )
            {
             before(grammarAccess.getOperationModeBindingAccess().getModePrivateOperationModeCrossReference_1_0()); 
            // InternalComponentDefinition.g:9206:3: ( ruleFQN )
            // InternalComponentDefinition.g:9207:4: ruleFQN
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
    // InternalComponentDefinition.g:9218:1: rule__DefaultInputTrigger__InputLinkAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DefaultInputTrigger__InputLinkAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9222:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9223:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9223:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9224:3: ( ruleFQN )
            {
             before(grammarAccess.getDefaultInputTriggerAccess().getInputLinkInputLinkExtensionCrossReference_1_0()); 
            // InternalComponentDefinition.g:9225:3: ( ruleFQN )
            // InternalComponentDefinition.g:9226:4: ruleFQN
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
    // InternalComponentDefinition.g:9237:1: rule__DefaultInputTrigger__PrescaleAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__DefaultInputTrigger__PrescaleAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9241:1: ( ( ruleEInt ) )
            // InternalComponentDefinition.g:9242:2: ( ruleEInt )
            {
            // InternalComponentDefinition.g:9242:2: ( ruleEInt )
            // InternalComponentDefinition.g:9243:3: ruleEInt
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
    // InternalComponentDefinition.g:9252:1: rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1 : ( ruleEDouble ) ;
    public final void rule__DefaultPeriodicTimer__PeriodicActFreqAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9256:1: ( ( ruleEDouble ) )
            // InternalComponentDefinition.g:9257:2: ( ruleEDouble )
            {
            // InternalComponentDefinition.g:9257:2: ( ruleEDouble )
            // InternalComponentDefinition.g:9258:3: ruleEDouble
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
    // InternalComponentDefinition.g:9267:1: rule__DefaultObservedElementTrigger__ElementAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__DefaultObservedElementTrigger__ElementAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9271:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9272:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9272:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9273:3: ( ruleFQN )
            {
             before(grammarAccess.getDefaultObservedElementTriggerAccess().getElementComponentSubNodeCrossReference_1_0()); 
            // InternalComponentDefinition.g:9274:3: ( ruleFQN )
            // InternalComponentDefinition.g:9275:4: ruleFQN
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
    // InternalComponentDefinition.g:9286:1: rule__OpcUaDeviceClient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OpcUaDeviceClient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9290:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9291:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:9291:2: ( RULE_ID )
            // InternalComponentDefinition.g:9292:3: RULE_ID
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


    // $ANTLR start "rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1"
    // InternalComponentDefinition.g:9301:1: rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1 : ( ruleEString ) ;
    public final void rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9305:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:9306:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:9306:2: ( ruleEString )
            // InternalComponentDefinition.g:9307:3: ruleEString
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIEStringParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpcUaDeviceClientAccess().getDeviceURIEStringParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__DeviceURIAssignment_3_0_1"


    // $ANTLR start "rule__OpcUaDeviceClient__AutoConnectAssignment_3_1"
    // InternalComponentDefinition.g:9316:1: rule__OpcUaDeviceClient__AutoConnectAssignment_3_1 : ( ( 'autoConnect' ) ) ;
    public final void rule__OpcUaDeviceClient__AutoConnectAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9320:1: ( ( ( 'autoConnect' ) ) )
            // InternalComponentDefinition.g:9321:2: ( ( 'autoConnect' ) )
            {
            // InternalComponentDefinition.g:9321:2: ( ( 'autoConnect' ) )
            // InternalComponentDefinition.g:9322:3: ( 'autoConnect' )
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getAutoConnectAutoConnectKeyword_3_1_0()); 
            // InternalComponentDefinition.g:9323:3: ( 'autoConnect' )
            // InternalComponentDefinition.g:9324:4: 'autoConnect'
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getAutoConnectAutoConnectKeyword_3_1_0()); 
            match(input,86,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientAccess().getAutoConnectAutoConnectKeyword_3_1_0()); 

            }

             after(grammarAccess.getOpcUaDeviceClientAccess().getAutoConnectAutoConnectKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__AutoConnectAssignment_3_1"


    // $ANTLR start "rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1"
    // InternalComponentDefinition.g:9335:1: rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1 : ( ruleEString ) ;
    public final void rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9339:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:9340:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:9340:2: ( ruleEString )
            // InternalComponentDefinition.g:9341:3: ruleEString
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getRootObjectPathEStringParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpcUaDeviceClientAccess().getRootObjectPathEStringParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__RootObjectPathAssignment_3_2_1"


    // $ANTLR start "rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1"
    // InternalComponentDefinition.g:9350:1: rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1 : ( ruleEString ) ;
    public final void rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9354:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:9355:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:9355:2: ( ruleEString )
            // InternalComponentDefinition.g:9356:3: ruleEString
            {
             before(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileEStringParserRuleCall_3_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpcUaDeviceClientAccess().getOpcuaXmlFileEStringParserRuleCall_3_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClient__OpcuaXmlFileAssignment_3_3_1"


    // $ANTLR start "rule__OpcUaReadServer__NameAssignment_1"
    // InternalComponentDefinition.g:9365:1: rule__OpcUaReadServer__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__OpcUaReadServer__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9369:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9370:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:9370:2: ( RULE_ID )
            // InternalComponentDefinition.g:9371:3: RULE_ID
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
    // InternalComponentDefinition.g:9380:1: rule__OpcUaReadServer__OutPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__OpcUaReadServer__OutPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9384:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9385:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9385:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9386:3: ( ruleFQN )
            {
             before(grammarAccess.getOpcUaReadServerAccess().getOutPortOutputPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:9387:3: ( ruleFQN )
            // InternalComponentDefinition.g:9388:4: ruleFQN
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
    // InternalComponentDefinition.g:9399:1: rule__OpcUaReadServer__PortNumberAssignment_4_1 : ( ruleEInt ) ;
    public final void rule__OpcUaReadServer__PortNumberAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9403:1: ( ( ruleEInt ) )
            // InternalComponentDefinition.g:9404:2: ( ruleEInt )
            {
            // InternalComponentDefinition.g:9404:2: ( ruleEInt )
            // InternalComponentDefinition.g:9405:3: ruleEInt
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
    // InternalComponentDefinition.g:9414:1: rule__MixedPortROS__PortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MixedPortROS__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9418:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDefinition.g:9419:2: ( ( RULE_ID ) )
            {
            // InternalComponentDefinition.g:9419:2: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9420:3: ( RULE_ID )
            {
             before(grammarAccess.getMixedPortROSAccess().getPortMixedPortROSBaseCrossReference_1_0()); 
            // InternalComponentDefinition.g:9421:3: ( RULE_ID )
            // InternalComponentDefinition.g:9422:4: RULE_ID
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
    // InternalComponentDefinition.g:9433:1: rule__MixedPortYARP__PortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MixedPortYARP__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9437:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDefinition.g:9438:2: ( ( RULE_ID ) )
            {
            // InternalComponentDefinition.g:9438:2: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9439:3: ( RULE_ID )
            {
             before(grammarAccess.getMixedPortYARPAccess().getPortMixedPortYARPBaseCrossReference_1_0()); 
            // InternalComponentDefinition.g:9440:3: ( RULE_ID )
            // InternalComponentDefinition.g:9441:4: RULE_ID
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


    // $ANTLR start "rule__CoordinationSlavePort__DocumentationAssignment_0"
    // InternalComponentDefinition.g:9452:1: rule__CoordinationSlavePort__DocumentationAssignment_0 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__CoordinationSlavePort__DocumentationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9456:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalComponentDefinition.g:9457:2: ( RULE_DOCU_COMMENT )
            {
            // InternalComponentDefinition.g:9457:2: ( RULE_DOCU_COMMENT )
            // InternalComponentDefinition.g:9458:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__DocumentationAssignment_0"


    // $ANTLR start "rule__CoordinationSlavePort__NameAssignment_2"
    // InternalComponentDefinition.g:9467:1: rule__CoordinationSlavePort__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__CoordinationSlavePort__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9471:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9472:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:9472:2: ( RULE_ID )
            // InternalComponentDefinition.g:9473:3: RULE_ID
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoordinationSlavePortAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__NameAssignment_2"


    // $ANTLR start "rule__CoordinationSlavePort__ServiceAssignment_4"
    // InternalComponentDefinition.g:9482:1: rule__CoordinationSlavePort__ServiceAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__CoordinationSlavePort__ServiceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9486:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9487:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9487:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9488:3: ( ruleFQN )
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionCrossReference_4_0()); 
            // InternalComponentDefinition.g:9489:3: ( ruleFQN )
            // InternalComponentDefinition.g:9490:4: ruleFQN
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getCoordinationSlavePortAccess().getServiceCoordinationServiceDefinitionCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__ServiceAssignment_4"


    // $ANTLR start "rule__CoordinationSlavePort__ElementsAssignment_6"
    // InternalComponentDefinition.g:9501:1: rule__CoordinationSlavePort__ElementsAssignment_6 : ( ruleAbstractCoordinationElement ) ;
    public final void rule__CoordinationSlavePort__ElementsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9505:1: ( ( ruleAbstractCoordinationElement ) )
            // InternalComponentDefinition.g:9506:2: ( ruleAbstractCoordinationElement )
            {
            // InternalComponentDefinition.g:9506:2: ( ruleAbstractCoordinationElement )
            // InternalComponentDefinition.g:9507:3: ruleAbstractCoordinationElement
            {
             before(grammarAccess.getCoordinationSlavePortAccess().getElementsAbstractCoordinationElementParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractCoordinationElement();

            state._fsp--;

             after(grammarAccess.getCoordinationSlavePortAccess().getElementsAbstractCoordinationElementParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationSlavePort__ElementsAssignment_6"


    // $ANTLR start "rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1"
    // InternalComponentDefinition.g:9516:1: rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__SkillRealizationsRef__SkillRealizationCoordModuleRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9520:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9521:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9521:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9522:3: ( ruleFQN )
            {
             before(grammarAccess.getSkillRealizationsRefAccess().getSkillRealizationCoordModuleRefCoordinationModuleRealizationCrossReference_1_0()); 
            // InternalComponentDefinition.g:9523:3: ( ruleFQN )
            // InternalComponentDefinition.g:9524:4: ruleFQN
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
    // InternalComponentDefinition.g:9535:1: rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__CommunicationServiceUsageRealization__ServiceUsageAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9539:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9540:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9540:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9541:3: ( ruleFQN )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getServiceUsageCommunicationServiceUsageCrossReference_1_0()); 
            // InternalComponentDefinition.g:9542:3: ( ruleFQN )
            // InternalComponentDefinition.g:9543:4: ruleFQN
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
    // InternalComponentDefinition.g:9554:1: rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CommunicationServiceUsageRealization__ComponentPortAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9558:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9559:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9559:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9560:3: ( ruleFQN )
            {
             before(grammarAccess.getCommunicationServiceUsageRealizationAccess().getComponentPortComponentPortCrossReference_3_0()); 
            // InternalComponentDefinition.g:9561:3: ( ruleFQN )
            // InternalComponentDefinition.g:9562:4: ruleFQN
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


    // $ANTLR start "rule__PublicOperationMode__DocumentationAssignment_1"
    // InternalComponentDefinition.g:9573:1: rule__PublicOperationMode__DocumentationAssignment_1 : ( RULE_DOCU_COMMENT ) ;
    public final void rule__PublicOperationMode__DocumentationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9577:1: ( ( RULE_DOCU_COMMENT ) )
            // InternalComponentDefinition.g:9578:2: ( RULE_DOCU_COMMENT )
            {
            // InternalComponentDefinition.g:9578:2: ( RULE_DOCU_COMMENT )
            // InternalComponentDefinition.g:9579:3: RULE_DOCU_COMMENT
            {
             before(grammarAccess.getPublicOperationModeAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_1_0()); 
            match(input,RULE_DOCU_COMMENT,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getDocumentationDOCU_COMMENTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__DocumentationAssignment_1"


    // $ANTLR start "rule__PublicOperationMode__IsDefaultInitAssignment_2"
    // InternalComponentDefinition.g:9588:1: rule__PublicOperationMode__IsDefaultInitAssignment_2 : ( ( 'default' ) ) ;
    public final void rule__PublicOperationMode__IsDefaultInitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9592:1: ( ( ( 'default' ) ) )
            // InternalComponentDefinition.g:9593:2: ( ( 'default' ) )
            {
            // InternalComponentDefinition.g:9593:2: ( ( 'default' ) )
            // InternalComponentDefinition.g:9594:3: ( 'default' )
            {
             before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_2_0()); 
            // InternalComponentDefinition.g:9595:3: ( 'default' )
            // InternalComponentDefinition.g:9596:4: 'default'
            {
             before(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_2_0()); 
            match(input,81,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_2_0()); 

            }

             after(grammarAccess.getPublicOperationModeAccess().getIsDefaultInitDefaultKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__IsDefaultInitAssignment_2"


    // $ANTLR start "rule__PublicOperationMode__ModeAssignment_4"
    // InternalComponentDefinition.g:9607:1: rule__PublicOperationMode__ModeAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__PublicOperationMode__ModeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9611:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9612:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9612:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9613:3: ( ruleFQN )
            {
             before(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionCrossReference_4_0()); 
            // InternalComponentDefinition.g:9614:3: ( ruleFQN )
            // InternalComponentDefinition.g:9615:4: ruleFQN
            {
             before(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getPublicOperationModeAccess().getModeComponentModeDefinitionCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__ModeAssignment_4"


    // $ANTLR start "rule__PublicOperationMode__ActivatesAssignment_6_2"
    // InternalComponentDefinition.g:9626:1: rule__PublicOperationMode__ActivatesAssignment_6_2 : ( ( RULE_ID ) ) ;
    public final void rule__PublicOperationMode__ActivatesAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9630:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDefinition.g:9631:2: ( ( RULE_ID ) )
            {
            // InternalComponentDefinition.g:9631:2: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9632:3: ( RULE_ID )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_6_2_0()); 
            // InternalComponentDefinition.g:9633:3: ( RULE_ID )
            // InternalComponentDefinition.g:9634:4: RULE_ID
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_6_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_6_2_0_1()); 

            }

             after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__ActivatesAssignment_6_2"


    // $ANTLR start "rule__PublicOperationMode__ActivatesAssignment_6_3_1"
    // InternalComponentDefinition.g:9645:1: rule__PublicOperationMode__ActivatesAssignment_6_3_1 : ( ( RULE_ID ) ) ;
    public final void rule__PublicOperationMode__ActivatesAssignment_6_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9649:1: ( ( ( RULE_ID ) ) )
            // InternalComponentDefinition.g:9650:2: ( ( RULE_ID ) )
            {
            // InternalComponentDefinition.g:9650:2: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9651:3: ( RULE_ID )
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_6_3_1_0()); 
            // InternalComponentDefinition.g:9652:3: ( RULE_ID )
            // InternalComponentDefinition.g:9653:4: RULE_ID
            {
             before(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_6_3_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeIDTerminalRuleCall_6_3_1_0_1()); 

            }

             after(grammarAccess.getPublicOperationModeAccess().getActivatesPrivateOperationModeCrossReference_6_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PublicOperationMode__ActivatesAssignment_6_3_1"


    // $ANTLR start "rule__PrivateOperationMode__NameAssignment_1"
    // InternalComponentDefinition.g:9664:1: rule__PrivateOperationMode__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PrivateOperationMode__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9668:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9669:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:9669:2: ( RULE_ID )
            // InternalComponentDefinition.g:9670:3: RULE_ID
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
    // InternalComponentDefinition.g:9679:1: rule__CoordinationMasterPort__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CoordinationMasterPort__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9683:1: ( ( RULE_ID ) )
            // InternalComponentDefinition.g:9684:2: ( RULE_ID )
            {
            // InternalComponentDefinition.g:9684:2: ( RULE_ID )
            // InternalComponentDefinition.g:9685:3: RULE_ID
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
    // InternalComponentDefinition.g:9694:1: rule__CoordinationMasterPort__ServiceAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CoordinationMasterPort__ServiceAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9698:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9699:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9699:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9700:3: ( ruleFQN )
            {
             before(grammarAccess.getCoordinationMasterPortAccess().getServiceCoordinationServiceDefinitionCrossReference_3_0()); 
            // InternalComponentDefinition.g:9701:3: ( ruleFQN )
            // InternalComponentDefinition.g:9702:4: ruleFQN
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
    // InternalComponentDefinition.g:9713:1: rule__ComponentParametersRef__ParameterAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentParametersRef__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9717:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9718:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9718:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9719:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentParametersRefAccess().getParameterComponentParameterCrossReference_1_0()); 
            // InternalComponentDefinition.g:9720:3: ( ruleFQN )
            // InternalComponentDefinition.g:9721:4: ruleFQN
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
    // InternalComponentDefinition.g:9732:1: rule__ComponentParametersRef__SlaveAssignment_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentParametersRef__SlaveAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9736:1: ( ( ( ruleFQN ) ) )
            // InternalComponentDefinition.g:9737:2: ( ( ruleFQN ) )
            {
            // InternalComponentDefinition.g:9737:2: ( ( ruleFQN ) )
            // InternalComponentDefinition.g:9738:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentParametersRefAccess().getSlaveCoordinationSlavePortCrossReference_2_1_0()); 
            // InternalComponentDefinition.g:9739:3: ( ruleFQN )
            // InternalComponentDefinition.g:9740:4: ruleFQN
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
    // InternalComponentDefinition.g:9751:1: rule__ACE_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ACE_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9755:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:9756:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:9756:2: ( ruleEString )
            // InternalComponentDefinition.g:9757:3: ruleEString
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
    // InternalComponentDefinition.g:9766:1: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpcUa_SeRoNet__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9770:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:9771:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:9771:2: ( ruleEString )
            // InternalComponentDefinition.g:9772:3: ruleEString
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
    // InternalComponentDefinition.g:9781:1: rule__CORBA_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CORBA_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9785:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:9786:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:9786:2: ( ruleEString )
            // InternalComponentDefinition.g:9787:3: ruleEString
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
    // InternalComponentDefinition.g:9796:1: rule__DDS_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DDS_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentDefinition.g:9800:1: ( ( ruleEString ) )
            // InternalComponentDefinition.g:9801:2: ( ruleEString )
            {
            // InternalComponentDefinition.g:9801:2: ( ruleEString )
            // InternalComponentDefinition.g:9802:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000140080L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x39100005B5400080L,0x00000000000000C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x39100005B5000082L,0x00000000000000C0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000035000080L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000080L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000080L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x000000000003D000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000C1F800400000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000F800000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000C10000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000200000L,0x0000000000040000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000F800400000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000000000380000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000280000080000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000A00L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000D000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L,0x0000000000000800L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x00E0000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0400000000080000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2000000000000080L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0xC000000000400080L,0x0000000000020021L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xC000000000000082L,0x0000000000020021L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000080L,0x0000000000020001L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000080000L,0x0000000000000100L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000002L,0x0000000000380000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000280000000002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x00E0000000000002L,0x0000000000400000L});

}
