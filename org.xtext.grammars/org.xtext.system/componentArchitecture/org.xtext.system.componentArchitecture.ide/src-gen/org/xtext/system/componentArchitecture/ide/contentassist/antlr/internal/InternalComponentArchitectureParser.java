package org.xtext.system.componentArchitecture.ide.contentassist.antlr.internal;

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
import org.xtext.system.componentArchitecture.services.ComponentArchitectureGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalComponentArchitectureParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SystemComponentArchitecture'", "'{'", "'}'", "'usingActivityArchitecture'", "'Connection'", "'->'", "';'", "'useMiddleware'", "'ComponentInstance'", "'instantiates'", "'ParameterStructInstance'", "'Activity'", "'configuration'", "'InputHandler'", "'OpcUaDeviceClientInstance'", "'deviceURI'", "'RequiredService'", "'ProvidedService'", "'.'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalComponentArchitectureParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalComponentArchitectureParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalComponentArchitectureParser.tokenNames; }
    public String getGrammarFileName() { return "InternalComponentArchitecture.g"; }


    	private ComponentArchitectureGrammarAccess grammarAccess;

    	public void setGrammarAccess(ComponentArchitectureGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystemComponentArchitecture"
    // InternalComponentArchitecture.g:94:1: entryRuleSystemComponentArchitecture : ruleSystemComponentArchitecture EOF ;
    public final void entryRuleSystemComponentArchitecture() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:95:1: ( ruleSystemComponentArchitecture EOF )
            // InternalComponentArchitecture.g:96:1: ruleSystemComponentArchitecture EOF
            {
             before(grammarAccess.getSystemComponentArchitectureRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemComponentArchitecture();

            state._fsp--;

             after(grammarAccess.getSystemComponentArchitectureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemComponentArchitecture"


    // $ANTLR start "ruleSystemComponentArchitecture"
    // InternalComponentArchitecture.g:103:1: ruleSystemComponentArchitecture : ( ( rule__SystemComponentArchitecture__Group__0 ) ) ;
    public final void ruleSystemComponentArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:107:2: ( ( ( rule__SystemComponentArchitecture__Group__0 ) ) )
            // InternalComponentArchitecture.g:108:2: ( ( rule__SystemComponentArchitecture__Group__0 ) )
            {
            // InternalComponentArchitecture.g:108:2: ( ( rule__SystemComponentArchitecture__Group__0 ) )
            // InternalComponentArchitecture.g:109:3: ( rule__SystemComponentArchitecture__Group__0 )
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getGroup()); 
            // InternalComponentArchitecture.g:110:3: ( rule__SystemComponentArchitecture__Group__0 )
            // InternalComponentArchitecture.g:110:4: rule__SystemComponentArchitecture__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemComponentArchitectureAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemComponentArchitecture"


    // $ANTLR start "entryRuleConnection"
    // InternalComponentArchitecture.g:119:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:120:1: ( ruleConnection EOF )
            // InternalComponentArchitecture.g:121:1: ruleConnection EOF
            {
             before(grammarAccess.getConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConnection"


    // $ANTLR start "ruleConnection"
    // InternalComponentArchitecture.g:128:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:132:2: ( ( ( rule__Connection__Group__0 ) ) )
            // InternalComponentArchitecture.g:133:2: ( ( rule__Connection__Group__0 ) )
            {
            // InternalComponentArchitecture.g:133:2: ( ( rule__Connection__Group__0 ) )
            // InternalComponentArchitecture.g:134:3: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // InternalComponentArchitecture.g:135:3: ( rule__Connection__Group__0 )
            // InternalComponentArchitecture.g:135:4: rule__Connection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConnection"


    // $ANTLR start "entryRuleComponentInstance"
    // InternalComponentArchitecture.g:144:1: entryRuleComponentInstance : ruleComponentInstance EOF ;
    public final void entryRuleComponentInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:145:1: ( ruleComponentInstance EOF )
            // InternalComponentArchitecture.g:146:1: ruleComponentInstance EOF
            {
             before(grammarAccess.getComponentInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getComponentInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentInstance"


    // $ANTLR start "ruleComponentInstance"
    // InternalComponentArchitecture.g:153:1: ruleComponentInstance : ( ( rule__ComponentInstance__Group__0 ) ) ;
    public final void ruleComponentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:157:2: ( ( ( rule__ComponentInstance__Group__0 ) ) )
            // InternalComponentArchitecture.g:158:2: ( ( rule__ComponentInstance__Group__0 ) )
            {
            // InternalComponentArchitecture.g:158:2: ( ( rule__ComponentInstance__Group__0 ) )
            // InternalComponentArchitecture.g:159:3: ( rule__ComponentInstance__Group__0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getGroup()); 
            // InternalComponentArchitecture.g:160:3: ( rule__ComponentInstance__Group__0 )
            // InternalComponentArchitecture.g:160:4: rule__ComponentInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInstance"


    // $ANTLR start "entryRuleComponentInstanceExtension"
    // InternalComponentArchitecture.g:169:1: entryRuleComponentInstanceExtension : ruleComponentInstanceExtension EOF ;
    public final void entryRuleComponentInstanceExtension() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:170:1: ( ruleComponentInstanceExtension EOF )
            // InternalComponentArchitecture.g:171:1: ruleComponentInstanceExtension EOF
            {
             before(grammarAccess.getComponentInstanceExtensionRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentInstanceExtension();

            state._fsp--;

             after(grammarAccess.getComponentInstanceExtensionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentInstanceExtension"


    // $ANTLR start "ruleComponentInstanceExtension"
    // InternalComponentArchitecture.g:178:1: ruleComponentInstanceExtension : ( ( rule__ComponentInstanceExtension__Alternatives ) ) ;
    public final void ruleComponentInstanceExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:182:2: ( ( ( rule__ComponentInstanceExtension__Alternatives ) ) )
            // InternalComponentArchitecture.g:183:2: ( ( rule__ComponentInstanceExtension__Alternatives ) )
            {
            // InternalComponentArchitecture.g:183:2: ( ( rule__ComponentInstanceExtension__Alternatives ) )
            // InternalComponentArchitecture.g:184:3: ( rule__ComponentInstanceExtension__Alternatives )
            {
             before(grammarAccess.getComponentInstanceExtensionAccess().getAlternatives()); 
            // InternalComponentArchitecture.g:185:3: ( rule__ComponentInstanceExtension__Alternatives )
            // InternalComponentArchitecture.g:185:4: rule__ComponentInstanceExtension__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstanceExtension__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceExtensionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInstanceExtension"


    // $ANTLR start "entryRuleParameterStructInstance"
    // InternalComponentArchitecture.g:194:1: entryRuleParameterStructInstance : ruleParameterStructInstance EOF ;
    public final void entryRuleParameterStructInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:195:1: ( ruleParameterStructInstance EOF )
            // InternalComponentArchitecture.g:196:1: ruleParameterStructInstance EOF
            {
             before(grammarAccess.getParameterStructInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterStructInstance();

            state._fsp--;

             after(grammarAccess.getParameterStructInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterStructInstance"


    // $ANTLR start "ruleParameterStructInstance"
    // InternalComponentArchitecture.g:203:1: ruleParameterStructInstance : ( ( rule__ParameterStructInstance__Group__0 ) ) ;
    public final void ruleParameterStructInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:207:2: ( ( ( rule__ParameterStructInstance__Group__0 ) ) )
            // InternalComponentArchitecture.g:208:2: ( ( rule__ParameterStructInstance__Group__0 ) )
            {
            // InternalComponentArchitecture.g:208:2: ( ( rule__ParameterStructInstance__Group__0 ) )
            // InternalComponentArchitecture.g:209:3: ( rule__ParameterStructInstance__Group__0 )
            {
             before(grammarAccess.getParameterStructInstanceAccess().getGroup()); 
            // InternalComponentArchitecture.g:210:3: ( rule__ParameterStructInstance__Group__0 )
            // InternalComponentArchitecture.g:210:4: rule__ParameterStructInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterStructInstance"


    // $ANTLR start "entryRuleActivityConfigurationMapping"
    // InternalComponentArchitecture.g:219:1: entryRuleActivityConfigurationMapping : ruleActivityConfigurationMapping EOF ;
    public final void entryRuleActivityConfigurationMapping() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:220:1: ( ruleActivityConfigurationMapping EOF )
            // InternalComponentArchitecture.g:221:1: ruleActivityConfigurationMapping EOF
            {
             before(grammarAccess.getActivityConfigurationMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleActivityConfigurationMapping();

            state._fsp--;

             after(grammarAccess.getActivityConfigurationMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleActivityConfigurationMapping"


    // $ANTLR start "ruleActivityConfigurationMapping"
    // InternalComponentArchitecture.g:228:1: ruleActivityConfigurationMapping : ( ( rule__ActivityConfigurationMapping__Group__0 ) ) ;
    public final void ruleActivityConfigurationMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:232:2: ( ( ( rule__ActivityConfigurationMapping__Group__0 ) ) )
            // InternalComponentArchitecture.g:233:2: ( ( rule__ActivityConfigurationMapping__Group__0 ) )
            {
            // InternalComponentArchitecture.g:233:2: ( ( rule__ActivityConfigurationMapping__Group__0 ) )
            // InternalComponentArchitecture.g:234:3: ( rule__ActivityConfigurationMapping__Group__0 )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getGroup()); 
            // InternalComponentArchitecture.g:235:3: ( rule__ActivityConfigurationMapping__Group__0 )
            // InternalComponentArchitecture.g:235:4: rule__ActivityConfigurationMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ActivityConfigurationMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getActivityConfigurationMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleActivityConfigurationMapping"


    // $ANTLR start "entryRuleInputHandlerConfigurationMapping"
    // InternalComponentArchitecture.g:244:1: entryRuleInputHandlerConfigurationMapping : ruleInputHandlerConfigurationMapping EOF ;
    public final void entryRuleInputHandlerConfigurationMapping() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:245:1: ( ruleInputHandlerConfigurationMapping EOF )
            // InternalComponentArchitecture.g:246:1: ruleInputHandlerConfigurationMapping EOF
            {
             before(grammarAccess.getInputHandlerConfigurationMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleInputHandlerConfigurationMapping();

            state._fsp--;

             after(grammarAccess.getInputHandlerConfigurationMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInputHandlerConfigurationMapping"


    // $ANTLR start "ruleInputHandlerConfigurationMapping"
    // InternalComponentArchitecture.g:253:1: ruleInputHandlerConfigurationMapping : ( ( rule__InputHandlerConfigurationMapping__Group__0 ) ) ;
    public final void ruleInputHandlerConfigurationMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:257:2: ( ( ( rule__InputHandlerConfigurationMapping__Group__0 ) ) )
            // InternalComponentArchitecture.g:258:2: ( ( rule__InputHandlerConfigurationMapping__Group__0 ) )
            {
            // InternalComponentArchitecture.g:258:2: ( ( rule__InputHandlerConfigurationMapping__Group__0 ) )
            // InternalComponentArchitecture.g:259:3: ( rule__InputHandlerConfigurationMapping__Group__0 )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getGroup()); 
            // InternalComponentArchitecture.g:260:3: ( rule__InputHandlerConfigurationMapping__Group__0 )
            // InternalComponentArchitecture.g:260:4: rule__InputHandlerConfigurationMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__InputHandlerConfigurationMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getInputHandlerConfigurationMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInputHandlerConfigurationMapping"


    // $ANTLR start "entryRuleOpcUaDeviceClientInstance"
    // InternalComponentArchitecture.g:269:1: entryRuleOpcUaDeviceClientInstance : ruleOpcUaDeviceClientInstance EOF ;
    public final void entryRuleOpcUaDeviceClientInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:270:1: ( ruleOpcUaDeviceClientInstance EOF )
            // InternalComponentArchitecture.g:271:1: ruleOpcUaDeviceClientInstance EOF
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleOpcUaDeviceClientInstance();

            state._fsp--;

             after(grammarAccess.getOpcUaDeviceClientInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpcUaDeviceClientInstance"


    // $ANTLR start "ruleOpcUaDeviceClientInstance"
    // InternalComponentArchitecture.g:278:1: ruleOpcUaDeviceClientInstance : ( ( rule__OpcUaDeviceClientInstance__Group__0 ) ) ;
    public final void ruleOpcUaDeviceClientInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:282:2: ( ( ( rule__OpcUaDeviceClientInstance__Group__0 ) ) )
            // InternalComponentArchitecture.g:283:2: ( ( rule__OpcUaDeviceClientInstance__Group__0 ) )
            {
            // InternalComponentArchitecture.g:283:2: ( ( rule__OpcUaDeviceClientInstance__Group__0 ) )
            // InternalComponentArchitecture.g:284:3: ( rule__OpcUaDeviceClientInstance__Group__0 )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getGroup()); 
            // InternalComponentArchitecture.g:285:3: ( rule__OpcUaDeviceClientInstance__Group__0 )
            // InternalComponentArchitecture.g:285:4: rule__OpcUaDeviceClientInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClientInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpcUaDeviceClientInstance"


    // $ANTLR start "entryRuleServiceInstance"
    // InternalComponentArchitecture.g:294:1: entryRuleServiceInstance : ruleServiceInstance EOF ;
    public final void entryRuleServiceInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:295:1: ( ruleServiceInstance EOF )
            // InternalComponentArchitecture.g:296:1: ruleServiceInstance EOF
            {
             before(grammarAccess.getServiceInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceInstance();

            state._fsp--;

             after(grammarAccess.getServiceInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceInstance"


    // $ANTLR start "ruleServiceInstance"
    // InternalComponentArchitecture.g:303:1: ruleServiceInstance : ( ( rule__ServiceInstance__Alternatives ) ) ;
    public final void ruleServiceInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:307:2: ( ( ( rule__ServiceInstance__Alternatives ) ) )
            // InternalComponentArchitecture.g:308:2: ( ( rule__ServiceInstance__Alternatives ) )
            {
            // InternalComponentArchitecture.g:308:2: ( ( rule__ServiceInstance__Alternatives ) )
            // InternalComponentArchitecture.g:309:3: ( rule__ServiceInstance__Alternatives )
            {
             before(grammarAccess.getServiceInstanceAccess().getAlternatives()); 
            // InternalComponentArchitecture.g:310:3: ( rule__ServiceInstance__Alternatives )
            // InternalComponentArchitecture.g:310:4: rule__ServiceInstance__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ServiceInstance__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getServiceInstanceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceInstance"


    // $ANTLR start "entryRuleRequiredService"
    // InternalComponentArchitecture.g:319:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:320:1: ( ruleRequiredService EOF )
            // InternalComponentArchitecture.g:321:1: ruleRequiredService EOF
            {
             before(grammarAccess.getRequiredServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleRequiredService();

            state._fsp--;

             after(grammarAccess.getRequiredServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequiredService"


    // $ANTLR start "ruleRequiredService"
    // InternalComponentArchitecture.g:328:1: ruleRequiredService : ( ( rule__RequiredService__Group__0 ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:332:2: ( ( ( rule__RequiredService__Group__0 ) ) )
            // InternalComponentArchitecture.g:333:2: ( ( rule__RequiredService__Group__0 ) )
            {
            // InternalComponentArchitecture.g:333:2: ( ( rule__RequiredService__Group__0 ) )
            // InternalComponentArchitecture.g:334:3: ( rule__RequiredService__Group__0 )
            {
             before(grammarAccess.getRequiredServiceAccess().getGroup()); 
            // InternalComponentArchitecture.g:335:3: ( rule__RequiredService__Group__0 )
            // InternalComponentArchitecture.g:335:4: rule__RequiredService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequiredServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequiredService"


    // $ANTLR start "entryRuleProvidedService"
    // InternalComponentArchitecture.g:344:1: entryRuleProvidedService : ruleProvidedService EOF ;
    public final void entryRuleProvidedService() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:345:1: ( ruleProvidedService EOF )
            // InternalComponentArchitecture.g:346:1: ruleProvidedService EOF
            {
             before(grammarAccess.getProvidedServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleProvidedService();

            state._fsp--;

             after(grammarAccess.getProvidedServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProvidedService"


    // $ANTLR start "ruleProvidedService"
    // InternalComponentArchitecture.g:353:1: ruleProvidedService : ( ( rule__ProvidedService__Group__0 ) ) ;
    public final void ruleProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:357:2: ( ( ( rule__ProvidedService__Group__0 ) ) )
            // InternalComponentArchitecture.g:358:2: ( ( rule__ProvidedService__Group__0 ) )
            {
            // InternalComponentArchitecture.g:358:2: ( ( rule__ProvidedService__Group__0 ) )
            // InternalComponentArchitecture.g:359:3: ( rule__ProvidedService__Group__0 )
            {
             before(grammarAccess.getProvidedServiceAccess().getGroup()); 
            // InternalComponentArchitecture.g:360:3: ( rule__ProvidedService__Group__0 )
            // InternalComponentArchitecture.g:360:4: rule__ProvidedService__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedService__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProvidedServiceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProvidedService"


    // $ANTLR start "entryRuleRoboticMiddleware"
    // InternalComponentArchitecture.g:369:1: entryRuleRoboticMiddleware : ruleRoboticMiddleware EOF ;
    public final void entryRuleRoboticMiddleware() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:370:1: ( ruleRoboticMiddleware EOF )
            // InternalComponentArchitecture.g:371:1: ruleRoboticMiddleware EOF
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
    // InternalComponentArchitecture.g:378:1: ruleRoboticMiddleware : ( ( rule__RoboticMiddleware__Alternatives ) ) ;
    public final void ruleRoboticMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:382:2: ( ( ( rule__RoboticMiddleware__Alternatives ) ) )
            // InternalComponentArchitecture.g:383:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            {
            // InternalComponentArchitecture.g:383:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            // InternalComponentArchitecture.g:384:3: ( rule__RoboticMiddleware__Alternatives )
            {
             before(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); 
            // InternalComponentArchitecture.g:385:3: ( rule__RoboticMiddleware__Alternatives )
            // InternalComponentArchitecture.g:385:4: rule__RoboticMiddleware__Alternatives
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
    // InternalComponentArchitecture.g:394:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:395:1: ( ruleFQN EOF )
            // InternalComponentArchitecture.g:396:1: ruleFQN EOF
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
    // InternalComponentArchitecture.g:403:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:407:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalComponentArchitecture.g:408:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalComponentArchitecture.g:408:2: ( ( rule__FQN__Group__0 ) )
            // InternalComponentArchitecture.g:409:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalComponentArchitecture.g:410:3: ( rule__FQN__Group__0 )
            // InternalComponentArchitecture.g:410:4: rule__FQN__Group__0
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


    // $ANTLR start "entryRuleEString"
    // InternalComponentArchitecture.g:419:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:420:1: ( ruleEString EOF )
            // InternalComponentArchitecture.g:421:1: ruleEString EOF
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
    // InternalComponentArchitecture.g:428:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:432:2: ( ( RULE_STRING ) )
            // InternalComponentArchitecture.g:433:2: ( RULE_STRING )
            {
            // InternalComponentArchitecture.g:433:2: ( RULE_STRING )
            // InternalComponentArchitecture.g:434:3: RULE_STRING
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


    // $ANTLR start "entryRuleACE_SmartSoft"
    // InternalComponentArchitecture.g:444:1: entryRuleACE_SmartSoft : ruleACE_SmartSoft EOF ;
    public final void entryRuleACE_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:445:1: ( ruleACE_SmartSoft EOF )
            // InternalComponentArchitecture.g:446:1: ruleACE_SmartSoft EOF
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
    // InternalComponentArchitecture.g:453:1: ruleACE_SmartSoft : ( ( rule__ACE_SmartSoft__Group__0 ) ) ;
    public final void ruleACE_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:457:2: ( ( ( rule__ACE_SmartSoft__Group__0 ) ) )
            // InternalComponentArchitecture.g:458:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            {
            // InternalComponentArchitecture.g:458:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            // InternalComponentArchitecture.g:459:3: ( rule__ACE_SmartSoft__Group__0 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup()); 
            // InternalComponentArchitecture.g:460:3: ( rule__ACE_SmartSoft__Group__0 )
            // InternalComponentArchitecture.g:460:4: rule__ACE_SmartSoft__Group__0
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
    // InternalComponentArchitecture.g:469:1: entryRuleOpcUa_SeRoNet : ruleOpcUa_SeRoNet EOF ;
    public final void entryRuleOpcUa_SeRoNet() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:470:1: ( ruleOpcUa_SeRoNet EOF )
            // InternalComponentArchitecture.g:471:1: ruleOpcUa_SeRoNet EOF
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
    // InternalComponentArchitecture.g:478:1: ruleOpcUa_SeRoNet : ( ( rule__OpcUa_SeRoNet__Group__0 ) ) ;
    public final void ruleOpcUa_SeRoNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:482:2: ( ( ( rule__OpcUa_SeRoNet__Group__0 ) ) )
            // InternalComponentArchitecture.g:483:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            {
            // InternalComponentArchitecture.g:483:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            // InternalComponentArchitecture.g:484:3: ( rule__OpcUa_SeRoNet__Group__0 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); 
            // InternalComponentArchitecture.g:485:3: ( rule__OpcUa_SeRoNet__Group__0 )
            // InternalComponentArchitecture.g:485:4: rule__OpcUa_SeRoNet__Group__0
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
    // InternalComponentArchitecture.g:494:1: entryRuleCORBA_SmartSoft : ruleCORBA_SmartSoft EOF ;
    public final void entryRuleCORBA_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:495:1: ( ruleCORBA_SmartSoft EOF )
            // InternalComponentArchitecture.g:496:1: ruleCORBA_SmartSoft EOF
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
    // InternalComponentArchitecture.g:503:1: ruleCORBA_SmartSoft : ( ( rule__CORBA_SmartSoft__Group__0 ) ) ;
    public final void ruleCORBA_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:507:2: ( ( ( rule__CORBA_SmartSoft__Group__0 ) ) )
            // InternalComponentArchitecture.g:508:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            {
            // InternalComponentArchitecture.g:508:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            // InternalComponentArchitecture.g:509:3: ( rule__CORBA_SmartSoft__Group__0 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); 
            // InternalComponentArchitecture.g:510:3: ( rule__CORBA_SmartSoft__Group__0 )
            // InternalComponentArchitecture.g:510:4: rule__CORBA_SmartSoft__Group__0
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
    // InternalComponentArchitecture.g:519:1: entryRuleDDS_SmartSoft : ruleDDS_SmartSoft EOF ;
    public final void entryRuleDDS_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:520:1: ( ruleDDS_SmartSoft EOF )
            // InternalComponentArchitecture.g:521:1: ruleDDS_SmartSoft EOF
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
    // InternalComponentArchitecture.g:528:1: ruleDDS_SmartSoft : ( ( rule__DDS_SmartSoft__Group__0 ) ) ;
    public final void ruleDDS_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:532:2: ( ( ( rule__DDS_SmartSoft__Group__0 ) ) )
            // InternalComponentArchitecture.g:533:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            {
            // InternalComponentArchitecture.g:533:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            // InternalComponentArchitecture.g:534:3: ( rule__DDS_SmartSoft__Group__0 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup()); 
            // InternalComponentArchitecture.g:535:3: ( rule__DDS_SmartSoft__Group__0 )
            // InternalComponentArchitecture.g:535:4: rule__DDS_SmartSoft__Group__0
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


    // $ANTLR start "rule__ComponentInstanceExtension__Alternatives"
    // InternalComponentArchitecture.g:543:1: rule__ComponentInstanceExtension__Alternatives : ( ( ruleParameterStructInstance ) | ( ruleActivityConfigurationMapping ) | ( ruleInputHandlerConfigurationMapping ) | ( ruleOpcUaDeviceClientInstance ) );
    public final void rule__ComponentInstanceExtension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:547:1: ( ( ruleParameterStructInstance ) | ( ruleActivityConfigurationMapping ) | ( ruleInputHandlerConfigurationMapping ) | ( ruleOpcUaDeviceClientInstance ) )
            int alt1=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt1=1;
                }
                break;
            case 22:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalComponentArchitecture.g:548:2: ( ruleParameterStructInstance )
                    {
                    // InternalComponentArchitecture.g:548:2: ( ruleParameterStructInstance )
                    // InternalComponentArchitecture.g:549:3: ruleParameterStructInstance
                    {
                     before(grammarAccess.getComponentInstanceExtensionAccess().getParameterStructInstanceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleParameterStructInstance();

                    state._fsp--;

                     after(grammarAccess.getComponentInstanceExtensionAccess().getParameterStructInstanceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentArchitecture.g:554:2: ( ruleActivityConfigurationMapping )
                    {
                    // InternalComponentArchitecture.g:554:2: ( ruleActivityConfigurationMapping )
                    // InternalComponentArchitecture.g:555:3: ruleActivityConfigurationMapping
                    {
                     before(grammarAccess.getComponentInstanceExtensionAccess().getActivityConfigurationMappingParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleActivityConfigurationMapping();

                    state._fsp--;

                     after(grammarAccess.getComponentInstanceExtensionAccess().getActivityConfigurationMappingParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalComponentArchitecture.g:560:2: ( ruleInputHandlerConfigurationMapping )
                    {
                    // InternalComponentArchitecture.g:560:2: ( ruleInputHandlerConfigurationMapping )
                    // InternalComponentArchitecture.g:561:3: ruleInputHandlerConfigurationMapping
                    {
                     before(grammarAccess.getComponentInstanceExtensionAccess().getInputHandlerConfigurationMappingParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleInputHandlerConfigurationMapping();

                    state._fsp--;

                     after(grammarAccess.getComponentInstanceExtensionAccess().getInputHandlerConfigurationMappingParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalComponentArchitecture.g:566:2: ( ruleOpcUaDeviceClientInstance )
                    {
                    // InternalComponentArchitecture.g:566:2: ( ruleOpcUaDeviceClientInstance )
                    // InternalComponentArchitecture.g:567:3: ruleOpcUaDeviceClientInstance
                    {
                     before(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaDeviceClientInstanceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOpcUaDeviceClientInstance();

                    state._fsp--;

                     after(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaDeviceClientInstanceParserRuleCall_3()); 

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
    // $ANTLR end "rule__ComponentInstanceExtension__Alternatives"


    // $ANTLR start "rule__ServiceInstance__Alternatives"
    // InternalComponentArchitecture.g:576:1: rule__ServiceInstance__Alternatives : ( ( ruleRequiredService ) | ( ruleProvidedService ) );
    public final void rule__ServiceInstance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:580:1: ( ( ruleRequiredService ) | ( ruleProvidedService ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==27) ) {
                alt2=1;
            }
            else if ( (LA2_0==28) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalComponentArchitecture.g:581:2: ( ruleRequiredService )
                    {
                    // InternalComponentArchitecture.g:581:2: ( ruleRequiredService )
                    // InternalComponentArchitecture.g:582:3: ruleRequiredService
                    {
                     before(grammarAccess.getServiceInstanceAccess().getRequiredServiceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRequiredService();

                    state._fsp--;

                     after(grammarAccess.getServiceInstanceAccess().getRequiredServiceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentArchitecture.g:587:2: ( ruleProvidedService )
                    {
                    // InternalComponentArchitecture.g:587:2: ( ruleProvidedService )
                    // InternalComponentArchitecture.g:588:3: ruleProvidedService
                    {
                     before(grammarAccess.getServiceInstanceAccess().getProvidedServiceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleProvidedService();

                    state._fsp--;

                     after(grammarAccess.getServiceInstanceAccess().getProvidedServiceParserRuleCall_1()); 

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
    // $ANTLR end "rule__ServiceInstance__Alternatives"


    // $ANTLR start "rule__RoboticMiddleware__Alternatives"
    // InternalComponentArchitecture.g:597:1: rule__RoboticMiddleware__Alternatives : ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) );
    public final void rule__RoboticMiddleware__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:601:1: ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt3=1;
                }
                break;
            case 32:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            case 34:
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
                    // InternalComponentArchitecture.g:602:2: ( ruleACE_SmartSoft )
                    {
                    // InternalComponentArchitecture.g:602:2: ( ruleACE_SmartSoft )
                    // InternalComponentArchitecture.g:603:3: ruleACE_SmartSoft
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
                    // InternalComponentArchitecture.g:608:2: ( ruleOpcUa_SeRoNet )
                    {
                    // InternalComponentArchitecture.g:608:2: ( ruleOpcUa_SeRoNet )
                    // InternalComponentArchitecture.g:609:3: ruleOpcUa_SeRoNet
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
                    // InternalComponentArchitecture.g:614:2: ( ruleCORBA_SmartSoft )
                    {
                    // InternalComponentArchitecture.g:614:2: ( ruleCORBA_SmartSoft )
                    // InternalComponentArchitecture.g:615:3: ruleCORBA_SmartSoft
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
                    // InternalComponentArchitecture.g:620:2: ( ruleDDS_SmartSoft )
                    {
                    // InternalComponentArchitecture.g:620:2: ( ruleDDS_SmartSoft )
                    // InternalComponentArchitecture.g:621:3: ruleDDS_SmartSoft
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


    // $ANTLR start "rule__SystemComponentArchitecture__Group__0"
    // InternalComponentArchitecture.g:630:1: rule__SystemComponentArchitecture__Group__0 : rule__SystemComponentArchitecture__Group__0__Impl rule__SystemComponentArchitecture__Group__1 ;
    public final void rule__SystemComponentArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:634:1: ( rule__SystemComponentArchitecture__Group__0__Impl rule__SystemComponentArchitecture__Group__1 )
            // InternalComponentArchitecture.g:635:2: rule__SystemComponentArchitecture__Group__0__Impl rule__SystemComponentArchitecture__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SystemComponentArchitecture__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__0"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__0__Impl"
    // InternalComponentArchitecture.g:642:1: rule__SystemComponentArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__SystemComponentArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:646:1: ( ( () ) )
            // InternalComponentArchitecture.g:647:1: ( () )
            {
            // InternalComponentArchitecture.g:647:1: ( () )
            // InternalComponentArchitecture.g:648:2: ()
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureAction_0()); 
            // InternalComponentArchitecture.g:649:2: ()
            // InternalComponentArchitecture.g:649:3: 
            {
            }

             after(grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__0__Impl"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__1"
    // InternalComponentArchitecture.g:657:1: rule__SystemComponentArchitecture__Group__1 : rule__SystemComponentArchitecture__Group__1__Impl rule__SystemComponentArchitecture__Group__2 ;
    public final void rule__SystemComponentArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:661:1: ( rule__SystemComponentArchitecture__Group__1__Impl rule__SystemComponentArchitecture__Group__2 )
            // InternalComponentArchitecture.g:662:2: rule__SystemComponentArchitecture__Group__1__Impl rule__SystemComponentArchitecture__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SystemComponentArchitecture__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__1"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__1__Impl"
    // InternalComponentArchitecture.g:669:1: rule__SystemComponentArchitecture__Group__1__Impl : ( 'SystemComponentArchitecture' ) ;
    public final void rule__SystemComponentArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:673:1: ( ( 'SystemComponentArchitecture' ) )
            // InternalComponentArchitecture.g:674:1: ( 'SystemComponentArchitecture' )
            {
            // InternalComponentArchitecture.g:674:1: ( 'SystemComponentArchitecture' )
            // InternalComponentArchitecture.g:675:2: 'SystemComponentArchitecture'
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__1__Impl"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__2"
    // InternalComponentArchitecture.g:684:1: rule__SystemComponentArchitecture__Group__2 : rule__SystemComponentArchitecture__Group__2__Impl rule__SystemComponentArchitecture__Group__3 ;
    public final void rule__SystemComponentArchitecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:688:1: ( rule__SystemComponentArchitecture__Group__2__Impl rule__SystemComponentArchitecture__Group__3 )
            // InternalComponentArchitecture.g:689:2: rule__SystemComponentArchitecture__Group__2__Impl rule__SystemComponentArchitecture__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SystemComponentArchitecture__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__2"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__2__Impl"
    // InternalComponentArchitecture.g:696:1: rule__SystemComponentArchitecture__Group__2__Impl : ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) ) ;
    public final void rule__SystemComponentArchitecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:700:1: ( ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) ) )
            // InternalComponentArchitecture.g:701:1: ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) )
            {
            // InternalComponentArchitecture.g:701:1: ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) )
            // InternalComponentArchitecture.g:702:2: ( rule__SystemComponentArchitecture__NameAssignment_2 )
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getNameAssignment_2()); 
            // InternalComponentArchitecture.g:703:2: ( rule__SystemComponentArchitecture__NameAssignment_2 )
            // InternalComponentArchitecture.g:703:3: rule__SystemComponentArchitecture__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemComponentArchitectureAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__2__Impl"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__3"
    // InternalComponentArchitecture.g:711:1: rule__SystemComponentArchitecture__Group__3 : rule__SystemComponentArchitecture__Group__3__Impl rule__SystemComponentArchitecture__Group__4 ;
    public final void rule__SystemComponentArchitecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:715:1: ( rule__SystemComponentArchitecture__Group__3__Impl rule__SystemComponentArchitecture__Group__4 )
            // InternalComponentArchitecture.g:716:2: rule__SystemComponentArchitecture__Group__3__Impl rule__SystemComponentArchitecture__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__SystemComponentArchitecture__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__3"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__3__Impl"
    // InternalComponentArchitecture.g:723:1: rule__SystemComponentArchitecture__Group__3__Impl : ( ( rule__SystemComponentArchitecture__Group_3__0 )? ) ;
    public final void rule__SystemComponentArchitecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:727:1: ( ( ( rule__SystemComponentArchitecture__Group_3__0 )? ) )
            // InternalComponentArchitecture.g:728:1: ( ( rule__SystemComponentArchitecture__Group_3__0 )? )
            {
            // InternalComponentArchitecture.g:728:1: ( ( rule__SystemComponentArchitecture__Group_3__0 )? )
            // InternalComponentArchitecture.g:729:2: ( rule__SystemComponentArchitecture__Group_3__0 )?
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getGroup_3()); 
            // InternalComponentArchitecture.g:730:2: ( rule__SystemComponentArchitecture__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalComponentArchitecture.g:730:3: rule__SystemComponentArchitecture__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SystemComponentArchitecture__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSystemComponentArchitectureAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__3__Impl"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__4"
    // InternalComponentArchitecture.g:738:1: rule__SystemComponentArchitecture__Group__4 : rule__SystemComponentArchitecture__Group__4__Impl rule__SystemComponentArchitecture__Group__5 ;
    public final void rule__SystemComponentArchitecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:742:1: ( rule__SystemComponentArchitecture__Group__4__Impl rule__SystemComponentArchitecture__Group__5 )
            // InternalComponentArchitecture.g:743:2: rule__SystemComponentArchitecture__Group__4__Impl rule__SystemComponentArchitecture__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SystemComponentArchitecture__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__4"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__4__Impl"
    // InternalComponentArchitecture.g:750:1: rule__SystemComponentArchitecture__Group__4__Impl : ( '{' ) ;
    public final void rule__SystemComponentArchitecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:754:1: ( ( '{' ) )
            // InternalComponentArchitecture.g:755:1: ( '{' )
            {
            // InternalComponentArchitecture.g:755:1: ( '{' )
            // InternalComponentArchitecture.g:756:2: '{'
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getSystemComponentArchitectureAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__4__Impl"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__5"
    // InternalComponentArchitecture.g:765:1: rule__SystemComponentArchitecture__Group__5 : rule__SystemComponentArchitecture__Group__5__Impl rule__SystemComponentArchitecture__Group__6 ;
    public final void rule__SystemComponentArchitecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:769:1: ( rule__SystemComponentArchitecture__Group__5__Impl rule__SystemComponentArchitecture__Group__6 )
            // InternalComponentArchitecture.g:770:2: rule__SystemComponentArchitecture__Group__5__Impl rule__SystemComponentArchitecture__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__SystemComponentArchitecture__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__5"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__5__Impl"
    // InternalComponentArchitecture.g:777:1: rule__SystemComponentArchitecture__Group__5__Impl : ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* ) ;
    public final void rule__SystemComponentArchitecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:781:1: ( ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* ) )
            // InternalComponentArchitecture.g:782:1: ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* )
            {
            // InternalComponentArchitecture.g:782:1: ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* )
            // InternalComponentArchitecture.g:783:2: ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getComponentsAssignment_5()); 
            // InternalComponentArchitecture.g:784:2: ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==19) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalComponentArchitecture.g:784:3: rule__SystemComponentArchitecture__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SystemComponentArchitecture__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getSystemComponentArchitectureAccess().getComponentsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__5__Impl"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__6"
    // InternalComponentArchitecture.g:792:1: rule__SystemComponentArchitecture__Group__6 : rule__SystemComponentArchitecture__Group__6__Impl rule__SystemComponentArchitecture__Group__7 ;
    public final void rule__SystemComponentArchitecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:796:1: ( rule__SystemComponentArchitecture__Group__6__Impl rule__SystemComponentArchitecture__Group__7 )
            // InternalComponentArchitecture.g:797:2: rule__SystemComponentArchitecture__Group__6__Impl rule__SystemComponentArchitecture__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__SystemComponentArchitecture__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__6"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__6__Impl"
    // InternalComponentArchitecture.g:804:1: rule__SystemComponentArchitecture__Group__6__Impl : ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* ) ;
    public final void rule__SystemComponentArchitecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:808:1: ( ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* ) )
            // InternalComponentArchitecture.g:809:1: ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* )
            {
            // InternalComponentArchitecture.g:809:1: ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* )
            // InternalComponentArchitecture.g:810:2: ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )*
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsAssignment_6()); 
            // InternalComponentArchitecture.g:811:2: ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==15) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponentArchitecture.g:811:3: rule__SystemComponentArchitecture__ConnectionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SystemComponentArchitecture__ConnectionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__6__Impl"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__7"
    // InternalComponentArchitecture.g:819:1: rule__SystemComponentArchitecture__Group__7 : rule__SystemComponentArchitecture__Group__7__Impl ;
    public final void rule__SystemComponentArchitecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:823:1: ( rule__SystemComponentArchitecture__Group__7__Impl )
            // InternalComponentArchitecture.g:824:2: rule__SystemComponentArchitecture__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__7"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__7__Impl"
    // InternalComponentArchitecture.g:830:1: rule__SystemComponentArchitecture__Group__7__Impl : ( '}' ) ;
    public final void rule__SystemComponentArchitecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:834:1: ( ( '}' ) )
            // InternalComponentArchitecture.g:835:1: ( '}' )
            {
            // InternalComponentArchitecture.g:835:1: ( '}' )
            // InternalComponentArchitecture.g:836:2: '}'
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSystemComponentArchitectureAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__7__Impl"


    // $ANTLR start "rule__SystemComponentArchitecture__Group_3__0"
    // InternalComponentArchitecture.g:846:1: rule__SystemComponentArchitecture__Group_3__0 : rule__SystemComponentArchitecture__Group_3__0__Impl rule__SystemComponentArchitecture__Group_3__1 ;
    public final void rule__SystemComponentArchitecture__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:850:1: ( rule__SystemComponentArchitecture__Group_3__0__Impl rule__SystemComponentArchitecture__Group_3__1 )
            // InternalComponentArchitecture.g:851:2: rule__SystemComponentArchitecture__Group_3__0__Impl rule__SystemComponentArchitecture__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__SystemComponentArchitecture__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group_3__0"


    // $ANTLR start "rule__SystemComponentArchitecture__Group_3__0__Impl"
    // InternalComponentArchitecture.g:858:1: rule__SystemComponentArchitecture__Group_3__0__Impl : ( 'usingActivityArchitecture' ) ;
    public final void rule__SystemComponentArchitecture__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:862:1: ( ( 'usingActivityArchitecture' ) )
            // InternalComponentArchitecture.g:863:1: ( 'usingActivityArchitecture' )
            {
            // InternalComponentArchitecture.g:863:1: ( 'usingActivityArchitecture' )
            // InternalComponentArchitecture.g:864:2: 'usingActivityArchitecture'
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getUsingActivityArchitectureKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSystemComponentArchitectureAccess().getUsingActivityArchitectureKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group_3__0__Impl"


    // $ANTLR start "rule__SystemComponentArchitecture__Group_3__1"
    // InternalComponentArchitecture.g:873:1: rule__SystemComponentArchitecture__Group_3__1 : rule__SystemComponentArchitecture__Group_3__1__Impl ;
    public final void rule__SystemComponentArchitecture__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:877:1: ( rule__SystemComponentArchitecture__Group_3__1__Impl )
            // InternalComponentArchitecture.g:878:2: rule__SystemComponentArchitecture__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group_3__1"


    // $ANTLR start "rule__SystemComponentArchitecture__Group_3__1__Impl"
    // InternalComponentArchitecture.g:884:1: rule__SystemComponentArchitecture__Group_3__1__Impl : ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) ) ;
    public final void rule__SystemComponentArchitecture__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:888:1: ( ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) ) )
            // InternalComponentArchitecture.g:889:1: ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) )
            {
            // InternalComponentArchitecture.g:889:1: ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) )
            // InternalComponentArchitecture.g:890:2: ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 )
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchAssignment_3_1()); 
            // InternalComponentArchitecture.g:891:2: ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 )
            // InternalComponentArchitecture.g:891:3: rule__SystemComponentArchitecture__ActivityArchAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__ActivityArchAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group_3__1__Impl"


    // $ANTLR start "rule__Connection__Group__0"
    // InternalComponentArchitecture.g:900:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:904:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // InternalComponentArchitecture.g:905:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Connection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0"


    // $ANTLR start "rule__Connection__Group__0__Impl"
    // InternalComponentArchitecture.g:912:1: rule__Connection__Group__0__Impl : ( 'Connection' ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:916:1: ( ( 'Connection' ) )
            // InternalComponentArchitecture.g:917:1: ( 'Connection' )
            {
            // InternalComponentArchitecture.g:917:1: ( 'Connection' )
            // InternalComponentArchitecture.g:918:2: 'Connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__0__Impl"


    // $ANTLR start "rule__Connection__Group__1"
    // InternalComponentArchitecture.g:927:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:931:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // InternalComponentArchitecture.g:932:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__Connection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1"


    // $ANTLR start "rule__Connection__Group__1__Impl"
    // InternalComponentArchitecture.g:939:1: rule__Connection__Group__1__Impl : ( ( rule__Connection__FromAssignment_1 ) ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:943:1: ( ( ( rule__Connection__FromAssignment_1 ) ) )
            // InternalComponentArchitecture.g:944:1: ( ( rule__Connection__FromAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:944:1: ( ( rule__Connection__FromAssignment_1 ) )
            // InternalComponentArchitecture.g:945:2: ( rule__Connection__FromAssignment_1 )
            {
             before(grammarAccess.getConnectionAccess().getFromAssignment_1()); 
            // InternalComponentArchitecture.g:946:2: ( rule__Connection__FromAssignment_1 )
            // InternalComponentArchitecture.g:946:3: rule__Connection__FromAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Connection__FromAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getFromAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__1__Impl"


    // $ANTLR start "rule__Connection__Group__2"
    // InternalComponentArchitecture.g:954:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:958:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // InternalComponentArchitecture.g:959:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Connection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2"


    // $ANTLR start "rule__Connection__Group__2__Impl"
    // InternalComponentArchitecture.g:966:1: rule__Connection__Group__2__Impl : ( '->' ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:970:1: ( ( '->' ) )
            // InternalComponentArchitecture.g:971:1: ( '->' )
            {
            // InternalComponentArchitecture.g:971:1: ( '->' )
            // InternalComponentArchitecture.g:972:2: '->'
            {
             before(grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__2__Impl"


    // $ANTLR start "rule__Connection__Group__3"
    // InternalComponentArchitecture.g:981:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:985:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // InternalComponentArchitecture.g:986:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Connection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3"


    // $ANTLR start "rule__Connection__Group__3__Impl"
    // InternalComponentArchitecture.g:993:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__ToAssignment_3 ) ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:997:1: ( ( ( rule__Connection__ToAssignment_3 ) ) )
            // InternalComponentArchitecture.g:998:1: ( ( rule__Connection__ToAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:998:1: ( ( rule__Connection__ToAssignment_3 ) )
            // InternalComponentArchitecture.g:999:2: ( rule__Connection__ToAssignment_3 )
            {
             before(grammarAccess.getConnectionAccess().getToAssignment_3()); 
            // InternalComponentArchitecture.g:1000:2: ( rule__Connection__ToAssignment_3 )
            // InternalComponentArchitecture.g:1000:3: rule__Connection__ToAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Connection__ToAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getToAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__3__Impl"


    // $ANTLR start "rule__Connection__Group__4"
    // InternalComponentArchitecture.g:1008:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1012:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // InternalComponentArchitecture.g:1013:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Connection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4"


    // $ANTLR start "rule__Connection__Group__4__Impl"
    // InternalComponentArchitecture.g:1020:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__Group_4__0 )? ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1024:1: ( ( ( rule__Connection__Group_4__0 )? ) )
            // InternalComponentArchitecture.g:1025:1: ( ( rule__Connection__Group_4__0 )? )
            {
            // InternalComponentArchitecture.g:1025:1: ( ( rule__Connection__Group_4__0 )? )
            // InternalComponentArchitecture.g:1026:2: ( rule__Connection__Group_4__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_4()); 
            // InternalComponentArchitecture.g:1027:2: ( rule__Connection__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalComponentArchitecture.g:1027:3: rule__Connection__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Connection__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__4__Impl"


    // $ANTLR start "rule__Connection__Group__5"
    // InternalComponentArchitecture.g:1035:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1039:1: ( rule__Connection__Group__5__Impl )
            // InternalComponentArchitecture.g:1040:2: rule__Connection__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5"


    // $ANTLR start "rule__Connection__Group__5__Impl"
    // InternalComponentArchitecture.g:1046:1: rule__Connection__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1050:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1051:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1051:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1052:2: ( ';' )?
            {
             before(grammarAccess.getConnectionAccess().getSemicolonKeyword_5()); 
            // InternalComponentArchitecture.g:1053:2: ( ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalComponentArchitecture.g:1053:3: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getConnectionAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group__5__Impl"


    // $ANTLR start "rule__Connection__Group_4__0"
    // InternalComponentArchitecture.g:1062:1: rule__Connection__Group_4__0 : rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 ;
    public final void rule__Connection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1066:1: ( rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 )
            // InternalComponentArchitecture.g:1067:2: rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Connection__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Connection__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__0"


    // $ANTLR start "rule__Connection__Group_4__0__Impl"
    // InternalComponentArchitecture.g:1074:1: rule__Connection__Group_4__0__Impl : ( 'useMiddleware' ) ;
    public final void rule__Connection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1078:1: ( ( 'useMiddleware' ) )
            // InternalComponentArchitecture.g:1079:1: ( 'useMiddleware' )
            {
            // InternalComponentArchitecture.g:1079:1: ( 'useMiddleware' )
            // InternalComponentArchitecture.g:1080:2: 'useMiddleware'
            {
             before(grammarAccess.getConnectionAccess().getUseMiddlewareKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getConnectionAccess().getUseMiddlewareKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__0__Impl"


    // $ANTLR start "rule__Connection__Group_4__1"
    // InternalComponentArchitecture.g:1089:1: rule__Connection__Group_4__1 : rule__Connection__Group_4__1__Impl ;
    public final void rule__Connection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1093:1: ( rule__Connection__Group_4__1__Impl )
            // InternalComponentArchitecture.g:1094:2: rule__Connection__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Connection__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__1"


    // $ANTLR start "rule__Connection__Group_4__1__Impl"
    // InternalComponentArchitecture.g:1100:1: rule__Connection__Group_4__1__Impl : ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) ) ;
    public final void rule__Connection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1104:1: ( ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) ) )
            // InternalComponentArchitecture.g:1105:1: ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) )
            {
            // InternalComponentArchitecture.g:1105:1: ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) )
            // InternalComponentArchitecture.g:1106:2: ( rule__Connection__MiddlewareSelectionAssignment_4_1 )
            {
             before(grammarAccess.getConnectionAccess().getMiddlewareSelectionAssignment_4_1()); 
            // InternalComponentArchitecture.g:1107:2: ( rule__Connection__MiddlewareSelectionAssignment_4_1 )
            // InternalComponentArchitecture.g:1107:3: rule__Connection__MiddlewareSelectionAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Connection__MiddlewareSelectionAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConnectionAccess().getMiddlewareSelectionAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__Group_4__1__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__0"
    // InternalComponentArchitecture.g:1116:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1120:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalComponentArchitecture.g:1121:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__0"


    // $ANTLR start "rule__ComponentInstance__Group__0__Impl"
    // InternalComponentArchitecture.g:1128:1: rule__ComponentInstance__Group__0__Impl : ( 'ComponentInstance' ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1132:1: ( ( 'ComponentInstance' ) )
            // InternalComponentArchitecture.g:1133:1: ( 'ComponentInstance' )
            {
            // InternalComponentArchitecture.g:1133:1: ( 'ComponentInstance' )
            // InternalComponentArchitecture.g:1134:2: 'ComponentInstance'
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentInstanceKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getComponentInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__0__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__1"
    // InternalComponentArchitecture.g:1143:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1147:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalComponentArchitecture.g:1148:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ComponentInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__1"


    // $ANTLR start "rule__ComponentInstance__Group__1__Impl"
    // InternalComponentArchitecture.g:1155:1: rule__ComponentInstance__Group__1__Impl : ( ( rule__ComponentInstance__NameAssignment_1 ) ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1159:1: ( ( ( rule__ComponentInstance__NameAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1160:1: ( ( rule__ComponentInstance__NameAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1160:1: ( ( rule__ComponentInstance__NameAssignment_1 ) )
            // InternalComponentArchitecture.g:1161:2: ( rule__ComponentInstance__NameAssignment_1 )
            {
             before(grammarAccess.getComponentInstanceAccess().getNameAssignment_1()); 
            // InternalComponentArchitecture.g:1162:2: ( rule__ComponentInstance__NameAssignment_1 )
            // InternalComponentArchitecture.g:1162:3: rule__ComponentInstance__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__1__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__2"
    // InternalComponentArchitecture.g:1170:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1174:1: ( rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 )
            // InternalComponentArchitecture.g:1175:2: rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ComponentInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__2"


    // $ANTLR start "rule__ComponentInstance__Group__2__Impl"
    // InternalComponentArchitecture.g:1182:1: rule__ComponentInstance__Group__2__Impl : ( 'instantiates' ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1186:1: ( ( 'instantiates' ) )
            // InternalComponentArchitecture.g:1187:1: ( 'instantiates' )
            {
            // InternalComponentArchitecture.g:1187:1: ( 'instantiates' )
            // InternalComponentArchitecture.g:1188:2: 'instantiates'
            {
             before(grammarAccess.getComponentInstanceAccess().getInstantiatesKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getInstantiatesKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__2__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__3"
    // InternalComponentArchitecture.g:1197:1: rule__ComponentInstance__Group__3 : rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4 ;
    public final void rule__ComponentInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1201:1: ( rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4 )
            // InternalComponentArchitecture.g:1202:2: rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4
            {
            pushFollow(FOLLOW_13);
            rule__ComponentInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__3"


    // $ANTLR start "rule__ComponentInstance__Group__3__Impl"
    // InternalComponentArchitecture.g:1209:1: rule__ComponentInstance__Group__3__Impl : ( ( rule__ComponentInstance__ComponentAssignment_3 ) ) ;
    public final void rule__ComponentInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1213:1: ( ( ( rule__ComponentInstance__ComponentAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1214:1: ( ( rule__ComponentInstance__ComponentAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1214:1: ( ( rule__ComponentInstance__ComponentAssignment_3 ) )
            // InternalComponentArchitecture.g:1215:2: ( rule__ComponentInstance__ComponentAssignment_3 )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentAssignment_3()); 
            // InternalComponentArchitecture.g:1216:2: ( rule__ComponentInstance__ComponentAssignment_3 )
            // InternalComponentArchitecture.g:1216:3: rule__ComponentInstance__ComponentAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__ComponentAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getComponentInstanceAccess().getComponentAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__3__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__4"
    // InternalComponentArchitecture.g:1224:1: rule__ComponentInstance__Group__4 : rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5 ;
    public final void rule__ComponentInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1228:1: ( rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5 )
            // InternalComponentArchitecture.g:1229:2: rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ComponentInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__4"


    // $ANTLR start "rule__ComponentInstance__Group__4__Impl"
    // InternalComponentArchitecture.g:1236:1: rule__ComponentInstance__Group__4__Impl : ( '{' ) ;
    public final void rule__ComponentInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1240:1: ( ( '{' ) )
            // InternalComponentArchitecture.g:1241:1: ( '{' )
            {
            // InternalComponentArchitecture.g:1241:1: ( '{' )
            // InternalComponentArchitecture.g:1242:2: '{'
            {
             before(grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__4__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__5"
    // InternalComponentArchitecture.g:1251:1: rule__ComponentInstance__Group__5 : rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6 ;
    public final void rule__ComponentInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1255:1: ( rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6 )
            // InternalComponentArchitecture.g:1256:2: rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__ComponentInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__5"


    // $ANTLR start "rule__ComponentInstance__Group__5__Impl"
    // InternalComponentArchitecture.g:1263:1: rule__ComponentInstance__Group__5__Impl : ( ( rule__ComponentInstance__PortsAssignment_5 )* ) ;
    public final void rule__ComponentInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1267:1: ( ( ( rule__ComponentInstance__PortsAssignment_5 )* ) )
            // InternalComponentArchitecture.g:1268:1: ( ( rule__ComponentInstance__PortsAssignment_5 )* )
            {
            // InternalComponentArchitecture.g:1268:1: ( ( rule__ComponentInstance__PortsAssignment_5 )* )
            // InternalComponentArchitecture.g:1269:2: ( rule__ComponentInstance__PortsAssignment_5 )*
            {
             before(grammarAccess.getComponentInstanceAccess().getPortsAssignment_5()); 
            // InternalComponentArchitecture.g:1270:2: ( rule__ComponentInstance__PortsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=27 && LA9_0<=28)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalComponentArchitecture.g:1270:3: rule__ComponentInstance__PortsAssignment_5
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ComponentInstance__PortsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getComponentInstanceAccess().getPortsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__5__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__6"
    // InternalComponentArchitecture.g:1278:1: rule__ComponentInstance__Group__6 : rule__ComponentInstance__Group__6__Impl rule__ComponentInstance__Group__7 ;
    public final void rule__ComponentInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1282:1: ( rule__ComponentInstance__Group__6__Impl rule__ComponentInstance__Group__7 )
            // InternalComponentArchitecture.g:1283:2: rule__ComponentInstance__Group__6__Impl rule__ComponentInstance__Group__7
            {
            pushFollow(FOLLOW_14);
            rule__ComponentInstance__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__6"


    // $ANTLR start "rule__ComponentInstance__Group__6__Impl"
    // InternalComponentArchitecture.g:1290:1: rule__ComponentInstance__Group__6__Impl : ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* ) ;
    public final void rule__ComponentInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1294:1: ( ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* ) )
            // InternalComponentArchitecture.g:1295:1: ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* )
            {
            // InternalComponentArchitecture.g:1295:1: ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* )
            // InternalComponentArchitecture.g:1296:2: ( rule__ComponentInstance__ExtensionsAssignment_6 )*
            {
             before(grammarAccess.getComponentInstanceAccess().getExtensionsAssignment_6()); 
            // InternalComponentArchitecture.g:1297:2: ( rule__ComponentInstance__ExtensionsAssignment_6 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=21 && LA10_0<=22)||(LA10_0>=24 && LA10_0<=25)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalComponentArchitecture.g:1297:3: rule__ComponentInstance__ExtensionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ComponentInstance__ExtensionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentInstanceAccess().getExtensionsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__6__Impl"


    // $ANTLR start "rule__ComponentInstance__Group__7"
    // InternalComponentArchitecture.g:1305:1: rule__ComponentInstance__Group__7 : rule__ComponentInstance__Group__7__Impl ;
    public final void rule__ComponentInstance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1309:1: ( rule__ComponentInstance__Group__7__Impl )
            // InternalComponentArchitecture.g:1310:2: rule__ComponentInstance__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInstance__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__7"


    // $ANTLR start "rule__ComponentInstance__Group__7__Impl"
    // InternalComponentArchitecture.g:1316:1: rule__ComponentInstance__Group__7__Impl : ( '}' ) ;
    public final void rule__ComponentInstance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1320:1: ( ( '}' ) )
            // InternalComponentArchitecture.g:1321:1: ( '}' )
            {
            // InternalComponentArchitecture.g:1321:1: ( '}' )
            // InternalComponentArchitecture.g:1322:2: '}'
            {
             before(grammarAccess.getComponentInstanceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__Group__7__Impl"


    // $ANTLR start "rule__ParameterStructInstance__Group__0"
    // InternalComponentArchitecture.g:1332:1: rule__ParameterStructInstance__Group__0 : rule__ParameterStructInstance__Group__0__Impl rule__ParameterStructInstance__Group__1 ;
    public final void rule__ParameterStructInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1336:1: ( rule__ParameterStructInstance__Group__0__Impl rule__ParameterStructInstance__Group__1 )
            // InternalComponentArchitecture.g:1337:2: rule__ParameterStructInstance__Group__0__Impl rule__ParameterStructInstance__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ParameterStructInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructInstance__Group__0"


    // $ANTLR start "rule__ParameterStructInstance__Group__0__Impl"
    // InternalComponentArchitecture.g:1344:1: rule__ParameterStructInstance__Group__0__Impl : ( 'ParameterStructInstance' ) ;
    public final void rule__ParameterStructInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1348:1: ( ( 'ParameterStructInstance' ) )
            // InternalComponentArchitecture.g:1349:1: ( 'ParameterStructInstance' )
            {
            // InternalComponentArchitecture.g:1349:1: ( 'ParameterStructInstance' )
            // InternalComponentArchitecture.g:1350:2: 'ParameterStructInstance'
            {
             before(grammarAccess.getParameterStructInstanceAccess().getParameterStructInstanceKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getParameterStructInstanceAccess().getParameterStructInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructInstance__Group__0__Impl"


    // $ANTLR start "rule__ParameterStructInstance__Group__1"
    // InternalComponentArchitecture.g:1359:1: rule__ParameterStructInstance__Group__1 : rule__ParameterStructInstance__Group__1__Impl rule__ParameterStructInstance__Group__2 ;
    public final void rule__ParameterStructInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1363:1: ( rule__ParameterStructInstance__Group__1__Impl rule__ParameterStructInstance__Group__2 )
            // InternalComponentArchitecture.g:1364:2: rule__ParameterStructInstance__Group__1__Impl rule__ParameterStructInstance__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ParameterStructInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterStructInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructInstance__Group__1"


    // $ANTLR start "rule__ParameterStructInstance__Group__1__Impl"
    // InternalComponentArchitecture.g:1371:1: rule__ParameterStructInstance__Group__1__Impl : ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) ) ;
    public final void rule__ParameterStructInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1375:1: ( ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1376:1: ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1376:1: ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) )
            // InternalComponentArchitecture.g:1377:2: ( rule__ParameterStructInstance__ParameterAssignment_1 )
            {
             before(grammarAccess.getParameterStructInstanceAccess().getParameterAssignment_1()); 
            // InternalComponentArchitecture.g:1378:2: ( rule__ParameterStructInstance__ParameterAssignment_1 )
            // InternalComponentArchitecture.g:1378:3: rule__ParameterStructInstance__ParameterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructInstance__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterStructInstanceAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructInstance__Group__1__Impl"


    // $ANTLR start "rule__ParameterStructInstance__Group__2"
    // InternalComponentArchitecture.g:1386:1: rule__ParameterStructInstance__Group__2 : rule__ParameterStructInstance__Group__2__Impl ;
    public final void rule__ParameterStructInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1390:1: ( rule__ParameterStructInstance__Group__2__Impl )
            // InternalComponentArchitecture.g:1391:2: rule__ParameterStructInstance__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterStructInstance__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructInstance__Group__2"


    // $ANTLR start "rule__ParameterStructInstance__Group__2__Impl"
    // InternalComponentArchitecture.g:1397:1: rule__ParameterStructInstance__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ParameterStructInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1401:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1402:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1402:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1403:2: ( ';' )?
            {
             before(grammarAccess.getParameterStructInstanceAccess().getSemicolonKeyword_2()); 
            // InternalComponentArchitecture.g:1404:2: ( ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalComponentArchitecture.g:1404:3: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getParameterStructInstanceAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructInstance__Group__2__Impl"


    // $ANTLR start "rule__ActivityConfigurationMapping__Group__0"
    // InternalComponentArchitecture.g:1413:1: rule__ActivityConfigurationMapping__Group__0 : rule__ActivityConfigurationMapping__Group__0__Impl rule__ActivityConfigurationMapping__Group__1 ;
    public final void rule__ActivityConfigurationMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1417:1: ( rule__ActivityConfigurationMapping__Group__0__Impl rule__ActivityConfigurationMapping__Group__1 )
            // InternalComponentArchitecture.g:1418:2: rule__ActivityConfigurationMapping__Group__0__Impl rule__ActivityConfigurationMapping__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ActivityConfigurationMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityConfigurationMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__Group__0"


    // $ANTLR start "rule__ActivityConfigurationMapping__Group__0__Impl"
    // InternalComponentArchitecture.g:1425:1: rule__ActivityConfigurationMapping__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__ActivityConfigurationMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1429:1: ( ( 'Activity' ) )
            // InternalComponentArchitecture.g:1430:1: ( 'Activity' )
            {
            // InternalComponentArchitecture.g:1430:1: ( 'Activity' )
            // InternalComponentArchitecture.g:1431:2: 'Activity'
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getActivityKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getActivityConfigurationMappingAccess().getActivityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__Group__0__Impl"


    // $ANTLR start "rule__ActivityConfigurationMapping__Group__1"
    // InternalComponentArchitecture.g:1440:1: rule__ActivityConfigurationMapping__Group__1 : rule__ActivityConfigurationMapping__Group__1__Impl rule__ActivityConfigurationMapping__Group__2 ;
    public final void rule__ActivityConfigurationMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1444:1: ( rule__ActivityConfigurationMapping__Group__1__Impl rule__ActivityConfigurationMapping__Group__2 )
            // InternalComponentArchitecture.g:1445:2: rule__ActivityConfigurationMapping__Group__1__Impl rule__ActivityConfigurationMapping__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ActivityConfigurationMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityConfigurationMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__Group__1"


    // $ANTLR start "rule__ActivityConfigurationMapping__Group__1__Impl"
    // InternalComponentArchitecture.g:1452:1: rule__ActivityConfigurationMapping__Group__1__Impl : ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) ) ;
    public final void rule__ActivityConfigurationMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1456:1: ( ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1457:1: ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1457:1: ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) )
            // InternalComponentArchitecture.g:1458:2: ( rule__ActivityConfigurationMapping__ActivityAssignment_1 )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getActivityAssignment_1()); 
            // InternalComponentArchitecture.g:1459:2: ( rule__ActivityConfigurationMapping__ActivityAssignment_1 )
            // InternalComponentArchitecture.g:1459:3: rule__ActivityConfigurationMapping__ActivityAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ActivityConfigurationMapping__ActivityAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getActivityConfigurationMappingAccess().getActivityAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__Group__1__Impl"


    // $ANTLR start "rule__ActivityConfigurationMapping__Group__2"
    // InternalComponentArchitecture.g:1467:1: rule__ActivityConfigurationMapping__Group__2 : rule__ActivityConfigurationMapping__Group__2__Impl rule__ActivityConfigurationMapping__Group__3 ;
    public final void rule__ActivityConfigurationMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1471:1: ( rule__ActivityConfigurationMapping__Group__2__Impl rule__ActivityConfigurationMapping__Group__3 )
            // InternalComponentArchitecture.g:1472:2: rule__ActivityConfigurationMapping__Group__2__Impl rule__ActivityConfigurationMapping__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__ActivityConfigurationMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityConfigurationMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__Group__2"


    // $ANTLR start "rule__ActivityConfigurationMapping__Group__2__Impl"
    // InternalComponentArchitecture.g:1479:1: rule__ActivityConfigurationMapping__Group__2__Impl : ( 'configuration' ) ;
    public final void rule__ActivityConfigurationMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1483:1: ( ( 'configuration' ) )
            // InternalComponentArchitecture.g:1484:1: ( 'configuration' )
            {
            // InternalComponentArchitecture.g:1484:1: ( 'configuration' )
            // InternalComponentArchitecture.g:1485:2: 'configuration'
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getConfigurationKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getActivityConfigurationMappingAccess().getConfigurationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__Group__2__Impl"


    // $ANTLR start "rule__ActivityConfigurationMapping__Group__3"
    // InternalComponentArchitecture.g:1494:1: rule__ActivityConfigurationMapping__Group__3 : rule__ActivityConfigurationMapping__Group__3__Impl rule__ActivityConfigurationMapping__Group__4 ;
    public final void rule__ActivityConfigurationMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1498:1: ( rule__ActivityConfigurationMapping__Group__3__Impl rule__ActivityConfigurationMapping__Group__4 )
            // InternalComponentArchitecture.g:1499:2: rule__ActivityConfigurationMapping__Group__3__Impl rule__ActivityConfigurationMapping__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__ActivityConfigurationMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ActivityConfigurationMapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__Group__3"


    // $ANTLR start "rule__ActivityConfigurationMapping__Group__3__Impl"
    // InternalComponentArchitecture.g:1506:1: rule__ActivityConfigurationMapping__Group__3__Impl : ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) ) ;
    public final void rule__ActivityConfigurationMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1510:1: ( ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1511:1: ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1511:1: ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) )
            // InternalComponentArchitecture.g:1512:2: ( rule__ActivityConfigurationMapping__ConfigAssignment_3 )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getConfigAssignment_3()); 
            // InternalComponentArchitecture.g:1513:2: ( rule__ActivityConfigurationMapping__ConfigAssignment_3 )
            // InternalComponentArchitecture.g:1513:3: rule__ActivityConfigurationMapping__ConfigAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ActivityConfigurationMapping__ConfigAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getActivityConfigurationMappingAccess().getConfigAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__Group__3__Impl"


    // $ANTLR start "rule__ActivityConfigurationMapping__Group__4"
    // InternalComponentArchitecture.g:1521:1: rule__ActivityConfigurationMapping__Group__4 : rule__ActivityConfigurationMapping__Group__4__Impl ;
    public final void rule__ActivityConfigurationMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1525:1: ( rule__ActivityConfigurationMapping__Group__4__Impl )
            // InternalComponentArchitecture.g:1526:2: rule__ActivityConfigurationMapping__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ActivityConfigurationMapping__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__Group__4"


    // $ANTLR start "rule__ActivityConfigurationMapping__Group__4__Impl"
    // InternalComponentArchitecture.g:1532:1: rule__ActivityConfigurationMapping__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__ActivityConfigurationMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1536:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1537:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1537:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1538:2: ( ';' )?
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getSemicolonKeyword_4()); 
            // InternalComponentArchitecture.g:1539:2: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalComponentArchitecture.g:1539:3: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getActivityConfigurationMappingAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__Group__4__Impl"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__Group__0"
    // InternalComponentArchitecture.g:1548:1: rule__InputHandlerConfigurationMapping__Group__0 : rule__InputHandlerConfigurationMapping__Group__0__Impl rule__InputHandlerConfigurationMapping__Group__1 ;
    public final void rule__InputHandlerConfigurationMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1552:1: ( rule__InputHandlerConfigurationMapping__Group__0__Impl rule__InputHandlerConfigurationMapping__Group__1 )
            // InternalComponentArchitecture.g:1553:2: rule__InputHandlerConfigurationMapping__Group__0__Impl rule__InputHandlerConfigurationMapping__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__InputHandlerConfigurationMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerConfigurationMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__Group__0"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__Group__0__Impl"
    // InternalComponentArchitecture.g:1560:1: rule__InputHandlerConfigurationMapping__Group__0__Impl : ( 'InputHandler' ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1564:1: ( ( 'InputHandler' ) )
            // InternalComponentArchitecture.g:1565:1: ( 'InputHandler' )
            {
            // InternalComponentArchitecture.g:1565:1: ( 'InputHandler' )
            // InternalComponentArchitecture.g:1566:2: 'InputHandler'
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getInputHandlerKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getInputHandlerConfigurationMappingAccess().getInputHandlerKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__Group__0__Impl"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__Group__1"
    // InternalComponentArchitecture.g:1575:1: rule__InputHandlerConfigurationMapping__Group__1 : rule__InputHandlerConfigurationMapping__Group__1__Impl rule__InputHandlerConfigurationMapping__Group__2 ;
    public final void rule__InputHandlerConfigurationMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1579:1: ( rule__InputHandlerConfigurationMapping__Group__1__Impl rule__InputHandlerConfigurationMapping__Group__2 )
            // InternalComponentArchitecture.g:1580:2: rule__InputHandlerConfigurationMapping__Group__1__Impl rule__InputHandlerConfigurationMapping__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__InputHandlerConfigurationMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerConfigurationMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__Group__1"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__Group__1__Impl"
    // InternalComponentArchitecture.g:1587:1: rule__InputHandlerConfigurationMapping__Group__1__Impl : ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1591:1: ( ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1592:1: ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1592:1: ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) )
            // InternalComponentArchitecture.g:1593:2: ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerAssignment_1()); 
            // InternalComponentArchitecture.g:1594:2: ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 )
            // InternalComponentArchitecture.g:1594:3: rule__InputHandlerConfigurationMapping__HandlerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__InputHandlerConfigurationMapping__HandlerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__Group__1__Impl"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__Group__2"
    // InternalComponentArchitecture.g:1602:1: rule__InputHandlerConfigurationMapping__Group__2 : rule__InputHandlerConfigurationMapping__Group__2__Impl rule__InputHandlerConfigurationMapping__Group__3 ;
    public final void rule__InputHandlerConfigurationMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1606:1: ( rule__InputHandlerConfigurationMapping__Group__2__Impl rule__InputHandlerConfigurationMapping__Group__3 )
            // InternalComponentArchitecture.g:1607:2: rule__InputHandlerConfigurationMapping__Group__2__Impl rule__InputHandlerConfigurationMapping__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__InputHandlerConfigurationMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerConfigurationMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__Group__2"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__Group__2__Impl"
    // InternalComponentArchitecture.g:1614:1: rule__InputHandlerConfigurationMapping__Group__2__Impl : ( 'configuration' ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1618:1: ( ( 'configuration' ) )
            // InternalComponentArchitecture.g:1619:1: ( 'configuration' )
            {
            // InternalComponentArchitecture.g:1619:1: ( 'configuration' )
            // InternalComponentArchitecture.g:1620:2: 'configuration'
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigurationKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigurationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__Group__2__Impl"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__Group__3"
    // InternalComponentArchitecture.g:1629:1: rule__InputHandlerConfigurationMapping__Group__3 : rule__InputHandlerConfigurationMapping__Group__3__Impl rule__InputHandlerConfigurationMapping__Group__4 ;
    public final void rule__InputHandlerConfigurationMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1633:1: ( rule__InputHandlerConfigurationMapping__Group__3__Impl rule__InputHandlerConfigurationMapping__Group__4 )
            // InternalComponentArchitecture.g:1634:2: rule__InputHandlerConfigurationMapping__Group__3__Impl rule__InputHandlerConfigurationMapping__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__InputHandlerConfigurationMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__InputHandlerConfigurationMapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__Group__3"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__Group__3__Impl"
    // InternalComponentArchitecture.g:1641:1: rule__InputHandlerConfigurationMapping__Group__3__Impl : ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1645:1: ( ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1646:1: ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1646:1: ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) )
            // InternalComponentArchitecture.g:1647:2: ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigAssignment_3()); 
            // InternalComponentArchitecture.g:1648:2: ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 )
            // InternalComponentArchitecture.g:1648:3: rule__InputHandlerConfigurationMapping__ConfigAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__InputHandlerConfigurationMapping__ConfigAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__Group__3__Impl"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__Group__4"
    // InternalComponentArchitecture.g:1656:1: rule__InputHandlerConfigurationMapping__Group__4 : rule__InputHandlerConfigurationMapping__Group__4__Impl ;
    public final void rule__InputHandlerConfigurationMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1660:1: ( rule__InputHandlerConfigurationMapping__Group__4__Impl )
            // InternalComponentArchitecture.g:1661:2: rule__InputHandlerConfigurationMapping__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__InputHandlerConfigurationMapping__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__Group__4"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__Group__4__Impl"
    // InternalComponentArchitecture.g:1667:1: rule__InputHandlerConfigurationMapping__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1671:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1672:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1672:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1673:2: ( ';' )?
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getSemicolonKeyword_4()); 
            // InternalComponentArchitecture.g:1674:2: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentArchitecture.g:1674:3: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getInputHandlerConfigurationMappingAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__Group__4__Impl"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__Group__0"
    // InternalComponentArchitecture.g:1683:1: rule__OpcUaDeviceClientInstance__Group__0 : rule__OpcUaDeviceClientInstance__Group__0__Impl rule__OpcUaDeviceClientInstance__Group__1 ;
    public final void rule__OpcUaDeviceClientInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1687:1: ( rule__OpcUaDeviceClientInstance__Group__0__Impl rule__OpcUaDeviceClientInstance__Group__1 )
            // InternalComponentArchitecture.g:1688:2: rule__OpcUaDeviceClientInstance__Group__0__Impl rule__OpcUaDeviceClientInstance__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OpcUaDeviceClientInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClientInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__Group__0"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__Group__0__Impl"
    // InternalComponentArchitecture.g:1695:1: rule__OpcUaDeviceClientInstance__Group__0__Impl : ( 'OpcUaDeviceClientInstance' ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1699:1: ( ( 'OpcUaDeviceClientInstance' ) )
            // InternalComponentArchitecture.g:1700:1: ( 'OpcUaDeviceClientInstance' )
            {
            // InternalComponentArchitecture.g:1700:1: ( 'OpcUaDeviceClientInstance' )
            // InternalComponentArchitecture.g:1701:2: 'OpcUaDeviceClientInstance'
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getOpcUaDeviceClientInstanceKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getOpcUaDeviceClientInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__Group__0__Impl"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__Group__1"
    // InternalComponentArchitecture.g:1710:1: rule__OpcUaDeviceClientInstance__Group__1 : rule__OpcUaDeviceClientInstance__Group__1__Impl rule__OpcUaDeviceClientInstance__Group__2 ;
    public final void rule__OpcUaDeviceClientInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1714:1: ( rule__OpcUaDeviceClientInstance__Group__1__Impl rule__OpcUaDeviceClientInstance__Group__2 )
            // InternalComponentArchitecture.g:1715:2: rule__OpcUaDeviceClientInstance__Group__1__Impl rule__OpcUaDeviceClientInstance__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__OpcUaDeviceClientInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClientInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__Group__1"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__Group__1__Impl"
    // InternalComponentArchitecture.g:1722:1: rule__OpcUaDeviceClientInstance__Group__1__Impl : ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1726:1: ( ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1727:1: ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1727:1: ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) )
            // InternalComponentArchitecture.g:1728:2: ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientAssignment_1()); 
            // InternalComponentArchitecture.g:1729:2: ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 )
            // InternalComponentArchitecture.g:1729:3: rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__Group__1__Impl"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__Group__2"
    // InternalComponentArchitecture.g:1737:1: rule__OpcUaDeviceClientInstance__Group__2 : rule__OpcUaDeviceClientInstance__Group__2__Impl rule__OpcUaDeviceClientInstance__Group__3 ;
    public final void rule__OpcUaDeviceClientInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1741:1: ( rule__OpcUaDeviceClientInstance__Group__2__Impl rule__OpcUaDeviceClientInstance__Group__3 )
            // InternalComponentArchitecture.g:1742:2: rule__OpcUaDeviceClientInstance__Group__2__Impl rule__OpcUaDeviceClientInstance__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__OpcUaDeviceClientInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClientInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__Group__2"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__Group__2__Impl"
    // InternalComponentArchitecture.g:1749:1: rule__OpcUaDeviceClientInstance__Group__2__Impl : ( 'deviceURI' ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1753:1: ( ( 'deviceURI' ) )
            // InternalComponentArchitecture.g:1754:1: ( 'deviceURI' )
            {
            // InternalComponentArchitecture.g:1754:1: ( 'deviceURI' )
            // InternalComponentArchitecture.g:1755:2: 'deviceURI'
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIKeyword_2()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__Group__2__Impl"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__Group__3"
    // InternalComponentArchitecture.g:1764:1: rule__OpcUaDeviceClientInstance__Group__3 : rule__OpcUaDeviceClientInstance__Group__3__Impl rule__OpcUaDeviceClientInstance__Group__4 ;
    public final void rule__OpcUaDeviceClientInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1768:1: ( rule__OpcUaDeviceClientInstance__Group__3__Impl rule__OpcUaDeviceClientInstance__Group__4 )
            // InternalComponentArchitecture.g:1769:2: rule__OpcUaDeviceClientInstance__Group__3__Impl rule__OpcUaDeviceClientInstance__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__OpcUaDeviceClientInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClientInstance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__Group__3"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__Group__3__Impl"
    // InternalComponentArchitecture.g:1776:1: rule__OpcUaDeviceClientInstance__Group__3__Impl : ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1780:1: ( ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1781:1: ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1781:1: ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) )
            // InternalComponentArchitecture.g:1782:2: ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIAssignment_3()); 
            // InternalComponentArchitecture.g:1783:2: ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 )
            // InternalComponentArchitecture.g:1783:3: rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__Group__3__Impl"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__Group__4"
    // InternalComponentArchitecture.g:1791:1: rule__OpcUaDeviceClientInstance__Group__4 : rule__OpcUaDeviceClientInstance__Group__4__Impl ;
    public final void rule__OpcUaDeviceClientInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1795:1: ( rule__OpcUaDeviceClientInstance__Group__4__Impl )
            // InternalComponentArchitecture.g:1796:2: rule__OpcUaDeviceClientInstance__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaDeviceClientInstance__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__Group__4"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__Group__4__Impl"
    // InternalComponentArchitecture.g:1802:1: rule__OpcUaDeviceClientInstance__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1806:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1807:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1807:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1808:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getSemicolonKeyword_4()); 
            // InternalComponentArchitecture.g:1809:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentArchitecture.g:1809:3: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__Group__4__Impl"


    // $ANTLR start "rule__RequiredService__Group__0"
    // InternalComponentArchitecture.g:1818:1: rule__RequiredService__Group__0 : rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 ;
    public final void rule__RequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1822:1: ( rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 )
            // InternalComponentArchitecture.g:1823:2: rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__RequiredService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__0"


    // $ANTLR start "rule__RequiredService__Group__0__Impl"
    // InternalComponentArchitecture.g:1830:1: rule__RequiredService__Group__0__Impl : ( 'RequiredService' ) ;
    public final void rule__RequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1834:1: ( ( 'RequiredService' ) )
            // InternalComponentArchitecture.g:1835:1: ( 'RequiredService' )
            {
            // InternalComponentArchitecture.g:1835:1: ( 'RequiredService' )
            // InternalComponentArchitecture.g:1836:2: 'RequiredService'
            {
             before(grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__0__Impl"


    // $ANTLR start "rule__RequiredService__Group__1"
    // InternalComponentArchitecture.g:1845:1: rule__RequiredService__Group__1 : rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 ;
    public final void rule__RequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1849:1: ( rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 )
            // InternalComponentArchitecture.g:1850:2: rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__RequiredService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__1"


    // $ANTLR start "rule__RequiredService__Group__1__Impl"
    // InternalComponentArchitecture.g:1857:1: rule__RequiredService__Group__1__Impl : ( ( rule__RequiredService__PortAssignment_1 ) ) ;
    public final void rule__RequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1861:1: ( ( ( rule__RequiredService__PortAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1862:1: ( ( rule__RequiredService__PortAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1862:1: ( ( rule__RequiredService__PortAssignment_1 ) )
            // InternalComponentArchitecture.g:1863:2: ( rule__RequiredService__PortAssignment_1 )
            {
             before(grammarAccess.getRequiredServiceAccess().getPortAssignment_1()); 
            // InternalComponentArchitecture.g:1864:2: ( rule__RequiredService__PortAssignment_1 )
            // InternalComponentArchitecture.g:1864:3: rule__RequiredService__PortAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__PortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRequiredServiceAccess().getPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__1__Impl"


    // $ANTLR start "rule__RequiredService__Group__2"
    // InternalComponentArchitecture.g:1872:1: rule__RequiredService__Group__2 : rule__RequiredService__Group__2__Impl ;
    public final void rule__RequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1876:1: ( rule__RequiredService__Group__2__Impl )
            // InternalComponentArchitecture.g:1877:2: rule__RequiredService__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__RequiredService__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__2"


    // $ANTLR start "rule__RequiredService__Group__2__Impl"
    // InternalComponentArchitecture.g:1883:1: rule__RequiredService__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__RequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1887:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1888:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1888:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1889:2: ( ';' )?
            {
             before(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_2()); 
            // InternalComponentArchitecture.g:1890:2: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentArchitecture.g:1890:3: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__Group__2__Impl"


    // $ANTLR start "rule__ProvidedService__Group__0"
    // InternalComponentArchitecture.g:1899:1: rule__ProvidedService__Group__0 : rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1 ;
    public final void rule__ProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1903:1: ( rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1 )
            // InternalComponentArchitecture.g:1904:2: rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ProvidedService__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedService__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__0"


    // $ANTLR start "rule__ProvidedService__Group__0__Impl"
    // InternalComponentArchitecture.g:1911:1: rule__ProvidedService__Group__0__Impl : ( 'ProvidedService' ) ;
    public final void rule__ProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1915:1: ( ( 'ProvidedService' ) )
            // InternalComponentArchitecture.g:1916:1: ( 'ProvidedService' )
            {
            // InternalComponentArchitecture.g:1916:1: ( 'ProvidedService' )
            // InternalComponentArchitecture.g:1917:2: 'ProvidedService'
            {
             before(grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__0__Impl"


    // $ANTLR start "rule__ProvidedService__Group__1"
    // InternalComponentArchitecture.g:1926:1: rule__ProvidedService__Group__1 : rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2 ;
    public final void rule__ProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1930:1: ( rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2 )
            // InternalComponentArchitecture.g:1931:2: rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__ProvidedService__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ProvidedService__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__1"


    // $ANTLR start "rule__ProvidedService__Group__1__Impl"
    // InternalComponentArchitecture.g:1938:1: rule__ProvidedService__Group__1__Impl : ( ( rule__ProvidedService__PortAssignment_1 ) ) ;
    public final void rule__ProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1942:1: ( ( ( rule__ProvidedService__PortAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1943:1: ( ( rule__ProvidedService__PortAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1943:1: ( ( rule__ProvidedService__PortAssignment_1 ) )
            // InternalComponentArchitecture.g:1944:2: ( rule__ProvidedService__PortAssignment_1 )
            {
             before(grammarAccess.getProvidedServiceAccess().getPortAssignment_1()); 
            // InternalComponentArchitecture.g:1945:2: ( rule__ProvidedService__PortAssignment_1 )
            // InternalComponentArchitecture.g:1945:3: rule__ProvidedService__PortAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedService__PortAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProvidedServiceAccess().getPortAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__1__Impl"


    // $ANTLR start "rule__ProvidedService__Group__2"
    // InternalComponentArchitecture.g:1953:1: rule__ProvidedService__Group__2 : rule__ProvidedService__Group__2__Impl ;
    public final void rule__ProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1957:1: ( rule__ProvidedService__Group__2__Impl )
            // InternalComponentArchitecture.g:1958:2: rule__ProvidedService__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ProvidedService__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__2"


    // $ANTLR start "rule__ProvidedService__Group__2__Impl"
    // InternalComponentArchitecture.g:1964:1: rule__ProvidedService__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1968:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1969:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1969:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1970:2: ( ';' )?
            {
             before(grammarAccess.getProvidedServiceAccess().getSemicolonKeyword_2()); 
            // InternalComponentArchitecture.g:1971:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentArchitecture.g:1971:3: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getProvidedServiceAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__Group__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalComponentArchitecture.g:1980:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1984:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalComponentArchitecture.g:1985:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentArchitecture.g:1992:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1996:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:1997:1: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:1997:1: ( RULE_ID )
            // InternalComponentArchitecture.g:1998:2: RULE_ID
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
    // InternalComponentArchitecture.g:2007:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2011:1: ( rule__FQN__Group__1__Impl )
            // InternalComponentArchitecture.g:2012:2: rule__FQN__Group__1__Impl
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
    // InternalComponentArchitecture.g:2018:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2022:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalComponentArchitecture.g:2023:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalComponentArchitecture.g:2023:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalComponentArchitecture.g:2024:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalComponentArchitecture.g:2025:2: ( rule__FQN__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==29) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalComponentArchitecture.g:2025:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_22);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
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
    // InternalComponentArchitecture.g:2034:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2038:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalComponentArchitecture.g:2039:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalComponentArchitecture.g:2046:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2050:1: ( ( '.' ) )
            // InternalComponentArchitecture.g:2051:1: ( '.' )
            {
            // InternalComponentArchitecture.g:2051:1: ( '.' )
            // InternalComponentArchitecture.g:2052:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2061:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2065:1: ( rule__FQN__Group_1__1__Impl )
            // InternalComponentArchitecture.g:2066:2: rule__FQN__Group_1__1__Impl
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
    // InternalComponentArchitecture.g:2072:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2076:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:2077:1: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:2077:1: ( RULE_ID )
            // InternalComponentArchitecture.g:2078:2: RULE_ID
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


    // $ANTLR start "rule__ACE_SmartSoft__Group__0"
    // InternalComponentArchitecture.g:2088:1: rule__ACE_SmartSoft__Group__0 : rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 ;
    public final void rule__ACE_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2092:1: ( rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 )
            // InternalComponentArchitecture.g:2093:2: rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalComponentArchitecture.g:2100:1: rule__ACE_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__ACE_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2104:1: ( ( () ) )
            // InternalComponentArchitecture.g:2105:1: ( () )
            {
            // InternalComponentArchitecture.g:2105:1: ( () )
            // InternalComponentArchitecture.g:2106:2: ()
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); 
            // InternalComponentArchitecture.g:2107:2: ()
            // InternalComponentArchitecture.g:2107:3: 
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
    // InternalComponentArchitecture.g:2115:1: rule__ACE_SmartSoft__Group__1 : rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 ;
    public final void rule__ACE_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2119:1: ( rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 )
            // InternalComponentArchitecture.g:2120:2: rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalComponentArchitecture.g:2127:1: rule__ACE_SmartSoft__Group__1__Impl : ( 'ACE_SmartSoft' ) ;
    public final void rule__ACE_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2131:1: ( ( 'ACE_SmartSoft' ) )
            // InternalComponentArchitecture.g:2132:1: ( 'ACE_SmartSoft' )
            {
            // InternalComponentArchitecture.g:2132:1: ( 'ACE_SmartSoft' )
            // InternalComponentArchitecture.g:2133:2: 'ACE_SmartSoft'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); 
            match(input,30,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2142:1: rule__ACE_SmartSoft__Group__2 : rule__ACE_SmartSoft__Group__2__Impl ;
    public final void rule__ACE_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2146:1: ( rule__ACE_SmartSoft__Group__2__Impl )
            // InternalComponentArchitecture.g:2147:2: rule__ACE_SmartSoft__Group__2__Impl
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
    // InternalComponentArchitecture.g:2153:1: rule__ACE_SmartSoft__Group__2__Impl : ( ( rule__ACE_SmartSoft__Group_2__0 )? ) ;
    public final void rule__ACE_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2157:1: ( ( ( rule__ACE_SmartSoft__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:2158:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:2158:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            // InternalComponentArchitecture.g:2159:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:2160:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==31) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentArchitecture.g:2160:3: rule__ACE_SmartSoft__Group_2__0
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
    // InternalComponentArchitecture.g:2169:1: rule__ACE_SmartSoft__Group_2__0 : rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 ;
    public final void rule__ACE_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2173:1: ( rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 )
            // InternalComponentArchitecture.g:2174:2: rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentArchitecture.g:2181:1: rule__ACE_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__ACE_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2185:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:2186:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:2186:1: ( 'description' )
            // InternalComponentArchitecture.g:2187:2: 'description'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2196:1: rule__ACE_SmartSoft__Group_2__1 : rule__ACE_SmartSoft__Group_2__1__Impl ;
    public final void rule__ACE_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2200:1: ( rule__ACE_SmartSoft__Group_2__1__Impl )
            // InternalComponentArchitecture.g:2201:2: rule__ACE_SmartSoft__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:2207:1: rule__ACE_SmartSoft__Group_2__1__Impl : ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__ACE_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2211:1: ( ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:2212:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:2212:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:2213:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:2214:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:2214:3: rule__ACE_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentArchitecture.g:2223:1: rule__OpcUa_SeRoNet__Group__0 : rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 ;
    public final void rule__OpcUa_SeRoNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2227:1: ( rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 )
            // InternalComponentArchitecture.g:2228:2: rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1
            {
            pushFollow(FOLLOW_25);
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
    // InternalComponentArchitecture.g:2235:1: rule__OpcUa_SeRoNet__Group__0__Impl : ( () ) ;
    public final void rule__OpcUa_SeRoNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2239:1: ( ( () ) )
            // InternalComponentArchitecture.g:2240:1: ( () )
            {
            // InternalComponentArchitecture.g:2240:1: ( () )
            // InternalComponentArchitecture.g:2241:2: ()
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); 
            // InternalComponentArchitecture.g:2242:2: ()
            // InternalComponentArchitecture.g:2242:3: 
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
    // InternalComponentArchitecture.g:2250:1: rule__OpcUa_SeRoNet__Group__1 : rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 ;
    public final void rule__OpcUa_SeRoNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2254:1: ( rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 )
            // InternalComponentArchitecture.g:2255:2: rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalComponentArchitecture.g:2262:1: rule__OpcUa_SeRoNet__Group__1__Impl : ( 'OpcUa_SeRoNet' ) ;
    public final void rule__OpcUa_SeRoNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2266:1: ( ( 'OpcUa_SeRoNet' ) )
            // InternalComponentArchitecture.g:2267:1: ( 'OpcUa_SeRoNet' )
            {
            // InternalComponentArchitecture.g:2267:1: ( 'OpcUa_SeRoNet' )
            // InternalComponentArchitecture.g:2268:2: 'OpcUa_SeRoNet'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); 
            match(input,32,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2277:1: rule__OpcUa_SeRoNet__Group__2 : rule__OpcUa_SeRoNet__Group__2__Impl ;
    public final void rule__OpcUa_SeRoNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2281:1: ( rule__OpcUa_SeRoNet__Group__2__Impl )
            // InternalComponentArchitecture.g:2282:2: rule__OpcUa_SeRoNet__Group__2__Impl
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
    // InternalComponentArchitecture.g:2288:1: rule__OpcUa_SeRoNet__Group__2__Impl : ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) ;
    public final void rule__OpcUa_SeRoNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2292:1: ( ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:2293:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:2293:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            // InternalComponentArchitecture.g:2294:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:2295:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==31) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentArchitecture.g:2295:3: rule__OpcUa_SeRoNet__Group_2__0
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
    // InternalComponentArchitecture.g:2304:1: rule__OpcUa_SeRoNet__Group_2__0 : rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 ;
    public final void rule__OpcUa_SeRoNet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2308:1: ( rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 )
            // InternalComponentArchitecture.g:2309:2: rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentArchitecture.g:2316:1: rule__OpcUa_SeRoNet__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2320:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:2321:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:2321:1: ( 'description' )
            // InternalComponentArchitecture.g:2322:2: 'description'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2331:1: rule__OpcUa_SeRoNet__Group_2__1 : rule__OpcUa_SeRoNet__Group_2__1__Impl ;
    public final void rule__OpcUa_SeRoNet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2335:1: ( rule__OpcUa_SeRoNet__Group_2__1__Impl )
            // InternalComponentArchitecture.g:2336:2: rule__OpcUa_SeRoNet__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:2342:1: rule__OpcUa_SeRoNet__Group_2__1__Impl : ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2346:1: ( ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:2347:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:2347:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:2348:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:2349:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:2349:3: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1
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
    // InternalComponentArchitecture.g:2358:1: rule__CORBA_SmartSoft__Group__0 : rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 ;
    public final void rule__CORBA_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2362:1: ( rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 )
            // InternalComponentArchitecture.g:2363:2: rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalComponentArchitecture.g:2370:1: rule__CORBA_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__CORBA_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2374:1: ( ( () ) )
            // InternalComponentArchitecture.g:2375:1: ( () )
            {
            // InternalComponentArchitecture.g:2375:1: ( () )
            // InternalComponentArchitecture.g:2376:2: ()
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); 
            // InternalComponentArchitecture.g:2377:2: ()
            // InternalComponentArchitecture.g:2377:3: 
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
    // InternalComponentArchitecture.g:2385:1: rule__CORBA_SmartSoft__Group__1 : rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 ;
    public final void rule__CORBA_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2389:1: ( rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 )
            // InternalComponentArchitecture.g:2390:2: rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalComponentArchitecture.g:2397:1: rule__CORBA_SmartSoft__Group__1__Impl : ( 'CORBA_SmartSoft' ) ;
    public final void rule__CORBA_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2401:1: ( ( 'CORBA_SmartSoft' ) )
            // InternalComponentArchitecture.g:2402:1: ( 'CORBA_SmartSoft' )
            {
            // InternalComponentArchitecture.g:2402:1: ( 'CORBA_SmartSoft' )
            // InternalComponentArchitecture.g:2403:2: 'CORBA_SmartSoft'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); 
            match(input,33,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2412:1: rule__CORBA_SmartSoft__Group__2 : rule__CORBA_SmartSoft__Group__2__Impl ;
    public final void rule__CORBA_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2416:1: ( rule__CORBA_SmartSoft__Group__2__Impl )
            // InternalComponentArchitecture.g:2417:2: rule__CORBA_SmartSoft__Group__2__Impl
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
    // InternalComponentArchitecture.g:2423:1: rule__CORBA_SmartSoft__Group__2__Impl : ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) ;
    public final void rule__CORBA_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2427:1: ( ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:2428:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:2428:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            // InternalComponentArchitecture.g:2429:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:2430:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentArchitecture.g:2430:3: rule__CORBA_SmartSoft__Group_2__0
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
    // InternalComponentArchitecture.g:2439:1: rule__CORBA_SmartSoft__Group_2__0 : rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 ;
    public final void rule__CORBA_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2443:1: ( rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 )
            // InternalComponentArchitecture.g:2444:2: rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentArchitecture.g:2451:1: rule__CORBA_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__CORBA_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2455:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:2456:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:2456:1: ( 'description' )
            // InternalComponentArchitecture.g:2457:2: 'description'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2466:1: rule__CORBA_SmartSoft__Group_2__1 : rule__CORBA_SmartSoft__Group_2__1__Impl ;
    public final void rule__CORBA_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2470:1: ( rule__CORBA_SmartSoft__Group_2__1__Impl )
            // InternalComponentArchitecture.g:2471:2: rule__CORBA_SmartSoft__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:2477:1: rule__CORBA_SmartSoft__Group_2__1__Impl : ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__CORBA_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2481:1: ( ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:2482:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:2482:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:2483:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:2484:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:2484:3: rule__CORBA_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentArchitecture.g:2493:1: rule__DDS_SmartSoft__Group__0 : rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 ;
    public final void rule__DDS_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2497:1: ( rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 )
            // InternalComponentArchitecture.g:2498:2: rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentArchitecture.g:2505:1: rule__DDS_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__DDS_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2509:1: ( ( () ) )
            // InternalComponentArchitecture.g:2510:1: ( () )
            {
            // InternalComponentArchitecture.g:2510:1: ( () )
            // InternalComponentArchitecture.g:2511:2: ()
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); 
            // InternalComponentArchitecture.g:2512:2: ()
            // InternalComponentArchitecture.g:2512:3: 
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
    // InternalComponentArchitecture.g:2520:1: rule__DDS_SmartSoft__Group__1 : rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 ;
    public final void rule__DDS_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2524:1: ( rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 )
            // InternalComponentArchitecture.g:2525:2: rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalComponentArchitecture.g:2532:1: rule__DDS_SmartSoft__Group__1__Impl : ( 'DDS_SmartSoft' ) ;
    public final void rule__DDS_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2536:1: ( ( 'DDS_SmartSoft' ) )
            // InternalComponentArchitecture.g:2537:1: ( 'DDS_SmartSoft' )
            {
            // InternalComponentArchitecture.g:2537:1: ( 'DDS_SmartSoft' )
            // InternalComponentArchitecture.g:2538:2: 'DDS_SmartSoft'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2547:1: rule__DDS_SmartSoft__Group__2 : rule__DDS_SmartSoft__Group__2__Impl ;
    public final void rule__DDS_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2551:1: ( rule__DDS_SmartSoft__Group__2__Impl )
            // InternalComponentArchitecture.g:2552:2: rule__DDS_SmartSoft__Group__2__Impl
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
    // InternalComponentArchitecture.g:2558:1: rule__DDS_SmartSoft__Group__2__Impl : ( ( rule__DDS_SmartSoft__Group_2__0 )? ) ;
    public final void rule__DDS_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2562:1: ( ( ( rule__DDS_SmartSoft__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:2563:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:2563:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            // InternalComponentArchitecture.g:2564:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:2565:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==31) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalComponentArchitecture.g:2565:3: rule__DDS_SmartSoft__Group_2__0
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
    // InternalComponentArchitecture.g:2574:1: rule__DDS_SmartSoft__Group_2__0 : rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 ;
    public final void rule__DDS_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2578:1: ( rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 )
            // InternalComponentArchitecture.g:2579:2: rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentArchitecture.g:2586:1: rule__DDS_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__DDS_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2590:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:2591:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:2591:1: ( 'description' )
            // InternalComponentArchitecture.g:2592:2: 'description'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2601:1: rule__DDS_SmartSoft__Group_2__1 : rule__DDS_SmartSoft__Group_2__1__Impl ;
    public final void rule__DDS_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2605:1: ( rule__DDS_SmartSoft__Group_2__1__Impl )
            // InternalComponentArchitecture.g:2606:2: rule__DDS_SmartSoft__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:2612:1: rule__DDS_SmartSoft__Group_2__1__Impl : ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__DDS_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2616:1: ( ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:2617:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:2617:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:2618:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:2619:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:2619:3: rule__DDS_SmartSoft__DescriptionAssignment_2_1
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


    // $ANTLR start "rule__SystemComponentArchitecture__NameAssignment_2"
    // InternalComponentArchitecture.g:2628:1: rule__SystemComponentArchitecture__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SystemComponentArchitecture__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2632:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:2633:2: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:2633:2: ( RULE_ID )
            // InternalComponentArchitecture.g:2634:3: RULE_ID
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemComponentArchitectureAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__NameAssignment_2"


    // $ANTLR start "rule__SystemComponentArchitecture__ActivityArchAssignment_3_1"
    // InternalComponentArchitecture.g:2643:1: rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__SystemComponentArchitecture__ActivityArchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2647:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:2648:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:2648:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:2649:3: ( ruleFQN )
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelCrossReference_3_1_0()); 
            // InternalComponentArchitecture.g:2650:3: ( ruleFQN )
            // InternalComponentArchitecture.g:2651:4: ruleFQN
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelFQNParserRuleCall_3_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelFQNParserRuleCall_3_1_0_1()); 

            }

             after(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelCrossReference_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__ActivityArchAssignment_3_1"


    // $ANTLR start "rule__SystemComponentArchitecture__ComponentsAssignment_5"
    // InternalComponentArchitecture.g:2662:1: rule__SystemComponentArchitecture__ComponentsAssignment_5 : ( ruleComponentInstance ) ;
    public final void rule__SystemComponentArchitecture__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2666:1: ( ( ruleComponentInstance ) )
            // InternalComponentArchitecture.g:2667:2: ( ruleComponentInstance )
            {
            // InternalComponentArchitecture.g:2667:2: ( ruleComponentInstance )
            // InternalComponentArchitecture.g:2668:3: ruleComponentInstance
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getComponentsComponentInstanceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInstance();

            state._fsp--;

             after(grammarAccess.getSystemComponentArchitectureAccess().getComponentsComponentInstanceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__ComponentsAssignment_5"


    // $ANTLR start "rule__SystemComponentArchitecture__ConnectionsAssignment_6"
    // InternalComponentArchitecture.g:2677:1: rule__SystemComponentArchitecture__ConnectionsAssignment_6 : ( ruleConnection ) ;
    public final void rule__SystemComponentArchitecture__ConnectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2681:1: ( ( ruleConnection ) )
            // InternalComponentArchitecture.g:2682:2: ( ruleConnection )
            {
            // InternalComponentArchitecture.g:2682:2: ( ruleConnection )
            // InternalComponentArchitecture.g:2683:3: ruleConnection
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsConnectionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleConnection();

            state._fsp--;

             after(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsConnectionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__ConnectionsAssignment_6"


    // $ANTLR start "rule__Connection__FromAssignment_1"
    // InternalComponentArchitecture.g:2692:1: rule__Connection__FromAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Connection__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2696:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:2697:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:2697:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:2698:3: ( ruleFQN )
            {
             before(grammarAccess.getConnectionAccess().getFromRequiredServiceCrossReference_1_0()); 
            // InternalComponentArchitecture.g:2699:3: ( ruleFQN )
            // InternalComponentArchitecture.g:2700:4: ruleFQN
            {
             before(grammarAccess.getConnectionAccess().getFromRequiredServiceFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getFromRequiredServiceFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getFromRequiredServiceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__FromAssignment_1"


    // $ANTLR start "rule__Connection__ToAssignment_3"
    // InternalComponentArchitecture.g:2711:1: rule__Connection__ToAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Connection__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2715:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:2716:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:2716:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:2717:3: ( ruleFQN )
            {
             before(grammarAccess.getConnectionAccess().getToProvidedServiceCrossReference_3_0()); 
            // InternalComponentArchitecture.g:2718:3: ( ruleFQN )
            // InternalComponentArchitecture.g:2719:4: ruleFQN
            {
             before(grammarAccess.getConnectionAccess().getToProvidedServiceFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getToProvidedServiceFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getConnectionAccess().getToProvidedServiceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__ToAssignment_3"


    // $ANTLR start "rule__Connection__MiddlewareSelectionAssignment_4_1"
    // InternalComponentArchitecture.g:2730:1: rule__Connection__MiddlewareSelectionAssignment_4_1 : ( ruleRoboticMiddleware ) ;
    public final void rule__Connection__MiddlewareSelectionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2734:1: ( ( ruleRoboticMiddleware ) )
            // InternalComponentArchitecture.g:2735:2: ( ruleRoboticMiddleware )
            {
            // InternalComponentArchitecture.g:2735:2: ( ruleRoboticMiddleware )
            // InternalComponentArchitecture.g:2736:3: ruleRoboticMiddleware
            {
             before(grammarAccess.getConnectionAccess().getMiddlewareSelectionRoboticMiddlewareParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoboticMiddleware();

            state._fsp--;

             after(grammarAccess.getConnectionAccess().getMiddlewareSelectionRoboticMiddlewareParserRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Connection__MiddlewareSelectionAssignment_4_1"


    // $ANTLR start "rule__ComponentInstance__NameAssignment_1"
    // InternalComponentArchitecture.g:2745:1: rule__ComponentInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2749:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:2750:2: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:2750:2: ( RULE_ID )
            // InternalComponentArchitecture.g:2751:3: RULE_ID
            {
             before(grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getComponentInstanceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__NameAssignment_1"


    // $ANTLR start "rule__ComponentInstance__ComponentAssignment_3"
    // InternalComponentArchitecture.g:2760:1: rule__ComponentInstance__ComponentAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentInstance__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2764:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:2765:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:2765:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:2766:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionCrossReference_3_0()); 
            // InternalComponentArchitecture.g:2767:3: ( ruleFQN )
            // InternalComponentArchitecture.g:2768:4: ruleFQN
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__ComponentAssignment_3"


    // $ANTLR start "rule__ComponentInstance__PortsAssignment_5"
    // InternalComponentArchitecture.g:2779:1: rule__ComponentInstance__PortsAssignment_5 : ( ruleServiceInstance ) ;
    public final void rule__ComponentInstance__PortsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2783:1: ( ( ruleServiceInstance ) )
            // InternalComponentArchitecture.g:2784:2: ( ruleServiceInstance )
            {
            // InternalComponentArchitecture.g:2784:2: ( ruleServiceInstance )
            // InternalComponentArchitecture.g:2785:3: ruleServiceInstance
            {
             before(grammarAccess.getComponentInstanceAccess().getPortsServiceInstanceParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceInstance();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getPortsServiceInstanceParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__PortsAssignment_5"


    // $ANTLR start "rule__ComponentInstance__ExtensionsAssignment_6"
    // InternalComponentArchitecture.g:2794:1: rule__ComponentInstance__ExtensionsAssignment_6 : ( ruleComponentInstanceExtension ) ;
    public final void rule__ComponentInstance__ExtensionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2798:1: ( ( ruleComponentInstanceExtension ) )
            // InternalComponentArchitecture.g:2799:2: ( ruleComponentInstanceExtension )
            {
            // InternalComponentArchitecture.g:2799:2: ( ruleComponentInstanceExtension )
            // InternalComponentArchitecture.g:2800:3: ruleComponentInstanceExtension
            {
             before(grammarAccess.getComponentInstanceAccess().getExtensionsComponentInstanceExtensionParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentInstanceExtension();

            state._fsp--;

             after(grammarAccess.getComponentInstanceAccess().getExtensionsComponentInstanceExtensionParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInstance__ExtensionsAssignment_6"


    // $ANTLR start "rule__ParameterStructInstance__ParameterAssignment_1"
    // InternalComponentArchitecture.g:2809:1: rule__ParameterStructInstance__ParameterAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterStructInstance__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2813:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:2814:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:2814:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:2815:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceCrossReference_1_0()); 
            // InternalComponentArchitecture.g:2816:3: ( ruleFQN )
            // InternalComponentArchitecture.g:2817:4: ruleFQN
            {
             before(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterStructInstance__ParameterAssignment_1"


    // $ANTLR start "rule__ActivityConfigurationMapping__ActivityAssignment_1"
    // InternalComponentArchitecture.g:2828:1: rule__ActivityConfigurationMapping__ActivityAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ActivityConfigurationMapping__ActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2832:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:2833:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:2833:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:2834:3: ( ruleFQN )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityCrossReference_1_0()); 
            // InternalComponentArchitecture.g:2835:3: ( ruleFQN )
            // InternalComponentArchitecture.g:2836:4: ruleFQN
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__ActivityAssignment_1"


    // $ANTLR start "rule__ActivityConfigurationMapping__ConfigAssignment_3"
    // InternalComponentArchitecture.g:2847:1: rule__ActivityConfigurationMapping__ConfigAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__ActivityConfigurationMapping__ConfigAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2851:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:2852:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:2852:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:2853:3: ( ruleFQN )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeCrossReference_3_0()); 
            // InternalComponentArchitecture.g:2854:3: ( ruleFQN )
            // InternalComponentArchitecture.g:2855:4: ruleFQN
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ActivityConfigurationMapping__ConfigAssignment_3"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__HandlerAssignment_1"
    // InternalComponentArchitecture.g:2866:1: rule__InputHandlerConfigurationMapping__HandlerAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__InputHandlerConfigurationMapping__HandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2870:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:2871:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:2871:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:2872:3: ( ruleFQN )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerCrossReference_1_0()); 
            // InternalComponentArchitecture.g:2873:3: ( ruleFQN )
            // InternalComponentArchitecture.g:2874:4: ruleFQN
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__HandlerAssignment_1"


    // $ANTLR start "rule__InputHandlerConfigurationMapping__ConfigAssignment_3"
    // InternalComponentArchitecture.g:2885:1: rule__InputHandlerConfigurationMapping__ConfigAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__InputHandlerConfigurationMapping__ConfigAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2889:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:2890:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:2890:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:2891:3: ( ruleFQN )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeCrossReference_3_0()); 
            // InternalComponentArchitecture.g:2892:3: ( ruleFQN )
            // InternalComponentArchitecture.g:2893:4: ruleFQN
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__InputHandlerConfigurationMapping__ConfigAssignment_3"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1"
    // InternalComponentArchitecture.g:2904:1: rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2908:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:2909:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:2909:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:2910:3: ( ruleFQN )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientCrossReference_1_0()); 
            // InternalComponentArchitecture.g:2911:3: ( ruleFQN )
            // InternalComponentArchitecture.g:2912:4: ruleFQN
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1"


    // $ANTLR start "rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3"
    // InternalComponentArchitecture.g:2923:1: rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 : ( ruleEString ) ;
    public final void rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2927:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:2928:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:2928:2: ( ruleEString )
            // InternalComponentArchitecture.g:2929:3: ruleEString
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3"


    // $ANTLR start "rule__RequiredService__PortAssignment_1"
    // InternalComponentArchitecture.g:2938:1: rule__RequiredService__PortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2942:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:2943:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:2943:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:2944:3: ( RULE_ID )
            {
             before(grammarAccess.getRequiredServiceAccess().getPortComponentPortCrossReference_1_0()); 
            // InternalComponentArchitecture.g:2945:3: ( RULE_ID )
            // InternalComponentArchitecture.g:2946:4: RULE_ID
            {
             before(grammarAccess.getRequiredServiceAccess().getPortComponentPortIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequiredServiceAccess().getPortComponentPortIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getRequiredServiceAccess().getPortComponentPortCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RequiredService__PortAssignment_1"


    // $ANTLR start "rule__ProvidedService__PortAssignment_1"
    // InternalComponentArchitecture.g:2957:1: rule__ProvidedService__PortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedService__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2961:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:2962:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:2962:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:2963:3: ( RULE_ID )
            {
             before(grammarAccess.getProvidedServiceAccess().getPortComponentPortCrossReference_1_0()); 
            // InternalComponentArchitecture.g:2964:3: ( RULE_ID )
            // InternalComponentArchitecture.g:2965:4: RULE_ID
            {
             before(grammarAccess.getProvidedServiceAccess().getPortComponentPortIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getProvidedServiceAccess().getPortComponentPortIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getProvidedServiceAccess().getPortComponentPortCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProvidedService__PortAssignment_1"


    // $ANTLR start "rule__ACE_SmartSoft__DescriptionAssignment_2_1"
    // InternalComponentArchitecture.g:2976:1: rule__ACE_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ACE_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2980:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:2981:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:2981:2: ( ruleEString )
            // InternalComponentArchitecture.g:2982:3: ruleEString
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
    // InternalComponentArchitecture.g:2991:1: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpcUa_SeRoNet__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2995:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:2996:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:2996:2: ( ruleEString )
            // InternalComponentArchitecture.g:2997:3: ruleEString
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
    // InternalComponentArchitecture.g:3006:1: rule__CORBA_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CORBA_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3010:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:3011:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:3011:2: ( ruleEString )
            // InternalComponentArchitecture.g:3012:3: ruleEString
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
    // InternalComponentArchitecture.g:3021:1: rule__DDS_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DDS_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3025:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:3026:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:3026:2: ( ruleEString )
            // InternalComponentArchitecture.g:3027:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000005000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000008A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000740000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000000001B602000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000018000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003600002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});

}