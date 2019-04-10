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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SystemComponentArchitecture'", "'{'", "'}'", "'usingActivityArchitecture'", "'Connection'", "'->'", "';'", "'useMiddleware'", "'ComponentInstance'", "'instantiates'", "'ParameterStructInstance'", "'Activity'", "'configuration'", "'InputHandler'", "'OpcUaDeviceClientInstance'", "'deviceURI'", "'OpcUaReadServerInstance'", "'portNumber'", "'RequiredService'", "'ProvidedService'", "'CoordinationModuleMapping'", "'moduleInstance'", "'realizedby'", "'interfaceInstance'", "'BehaviorTaskRef'", "'.'", "'-'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
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


    // $ANTLR start "entryRuleSystemExtension"
    // InternalComponentArchitecture.g:119:1: entryRuleSystemExtension : ruleSystemExtension EOF ;
    public final void entryRuleSystemExtension() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:120:1: ( ruleSystemExtension EOF )
            // InternalComponentArchitecture.g:121:1: ruleSystemExtension EOF
            {
             before(grammarAccess.getSystemExtensionRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemExtension();

            state._fsp--;

             after(grammarAccess.getSystemExtensionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemExtension"


    // $ANTLR start "ruleSystemExtension"
    // InternalComponentArchitecture.g:128:1: ruleSystemExtension : ( ( rule__SystemExtension__Alternatives ) ) ;
    public final void ruleSystemExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:132:2: ( ( ( rule__SystemExtension__Alternatives ) ) )
            // InternalComponentArchitecture.g:133:2: ( ( rule__SystemExtension__Alternatives ) )
            {
            // InternalComponentArchitecture.g:133:2: ( ( rule__SystemExtension__Alternatives ) )
            // InternalComponentArchitecture.g:134:3: ( rule__SystemExtension__Alternatives )
            {
             before(grammarAccess.getSystemExtensionAccess().getAlternatives()); 
            // InternalComponentArchitecture.g:135:3: ( rule__SystemExtension__Alternatives )
            // InternalComponentArchitecture.g:135:4: rule__SystemExtension__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SystemExtension__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSystemExtensionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemExtension"


    // $ANTLR start "entryRuleConnection"
    // InternalComponentArchitecture.g:144:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:145:1: ( ruleConnection EOF )
            // InternalComponentArchitecture.g:146:1: ruleConnection EOF
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
    // InternalComponentArchitecture.g:153:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:157:2: ( ( ( rule__Connection__Group__0 ) ) )
            // InternalComponentArchitecture.g:158:2: ( ( rule__Connection__Group__0 ) )
            {
            // InternalComponentArchitecture.g:158:2: ( ( rule__Connection__Group__0 ) )
            // InternalComponentArchitecture.g:159:3: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // InternalComponentArchitecture.g:160:3: ( rule__Connection__Group__0 )
            // InternalComponentArchitecture.g:160:4: rule__Connection__Group__0
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
    // InternalComponentArchitecture.g:169:1: entryRuleComponentInstance : ruleComponentInstance EOF ;
    public final void entryRuleComponentInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:170:1: ( ruleComponentInstance EOF )
            // InternalComponentArchitecture.g:171:1: ruleComponentInstance EOF
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
    // InternalComponentArchitecture.g:178:1: ruleComponentInstance : ( ( rule__ComponentInstance__Group__0 ) ) ;
    public final void ruleComponentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:182:2: ( ( ( rule__ComponentInstance__Group__0 ) ) )
            // InternalComponentArchitecture.g:183:2: ( ( rule__ComponentInstance__Group__0 ) )
            {
            // InternalComponentArchitecture.g:183:2: ( ( rule__ComponentInstance__Group__0 ) )
            // InternalComponentArchitecture.g:184:3: ( rule__ComponentInstance__Group__0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getGroup()); 
            // InternalComponentArchitecture.g:185:3: ( rule__ComponentInstance__Group__0 )
            // InternalComponentArchitecture.g:185:4: rule__ComponentInstance__Group__0
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
    // InternalComponentArchitecture.g:194:1: entryRuleComponentInstanceExtension : ruleComponentInstanceExtension EOF ;
    public final void entryRuleComponentInstanceExtension() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:195:1: ( ruleComponentInstanceExtension EOF )
            // InternalComponentArchitecture.g:196:1: ruleComponentInstanceExtension EOF
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
    // InternalComponentArchitecture.g:203:1: ruleComponentInstanceExtension : ( ( rule__ComponentInstanceExtension__Alternatives ) ) ;
    public final void ruleComponentInstanceExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:207:2: ( ( ( rule__ComponentInstanceExtension__Alternatives ) ) )
            // InternalComponentArchitecture.g:208:2: ( ( rule__ComponentInstanceExtension__Alternatives ) )
            {
            // InternalComponentArchitecture.g:208:2: ( ( rule__ComponentInstanceExtension__Alternatives ) )
            // InternalComponentArchitecture.g:209:3: ( rule__ComponentInstanceExtension__Alternatives )
            {
             before(grammarAccess.getComponentInstanceExtensionAccess().getAlternatives()); 
            // InternalComponentArchitecture.g:210:3: ( rule__ComponentInstanceExtension__Alternatives )
            // InternalComponentArchitecture.g:210:4: rule__ComponentInstanceExtension__Alternatives
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
    // InternalComponentArchitecture.g:219:1: entryRuleParameterStructInstance : ruleParameterStructInstance EOF ;
    public final void entryRuleParameterStructInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:220:1: ( ruleParameterStructInstance EOF )
            // InternalComponentArchitecture.g:221:1: ruleParameterStructInstance EOF
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
    // InternalComponentArchitecture.g:228:1: ruleParameterStructInstance : ( ( rule__ParameterStructInstance__Group__0 ) ) ;
    public final void ruleParameterStructInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:232:2: ( ( ( rule__ParameterStructInstance__Group__0 ) ) )
            // InternalComponentArchitecture.g:233:2: ( ( rule__ParameterStructInstance__Group__0 ) )
            {
            // InternalComponentArchitecture.g:233:2: ( ( rule__ParameterStructInstance__Group__0 ) )
            // InternalComponentArchitecture.g:234:3: ( rule__ParameterStructInstance__Group__0 )
            {
             before(grammarAccess.getParameterStructInstanceAccess().getGroup()); 
            // InternalComponentArchitecture.g:235:3: ( rule__ParameterStructInstance__Group__0 )
            // InternalComponentArchitecture.g:235:4: rule__ParameterStructInstance__Group__0
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
    // InternalComponentArchitecture.g:244:1: entryRuleActivityConfigurationMapping : ruleActivityConfigurationMapping EOF ;
    public final void entryRuleActivityConfigurationMapping() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:245:1: ( ruleActivityConfigurationMapping EOF )
            // InternalComponentArchitecture.g:246:1: ruleActivityConfigurationMapping EOF
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
    // InternalComponentArchitecture.g:253:1: ruleActivityConfigurationMapping : ( ( rule__ActivityConfigurationMapping__Group__0 ) ) ;
    public final void ruleActivityConfigurationMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:257:2: ( ( ( rule__ActivityConfigurationMapping__Group__0 ) ) )
            // InternalComponentArchitecture.g:258:2: ( ( rule__ActivityConfigurationMapping__Group__0 ) )
            {
            // InternalComponentArchitecture.g:258:2: ( ( rule__ActivityConfigurationMapping__Group__0 ) )
            // InternalComponentArchitecture.g:259:3: ( rule__ActivityConfigurationMapping__Group__0 )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getGroup()); 
            // InternalComponentArchitecture.g:260:3: ( rule__ActivityConfigurationMapping__Group__0 )
            // InternalComponentArchitecture.g:260:4: rule__ActivityConfigurationMapping__Group__0
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
    // InternalComponentArchitecture.g:269:1: entryRuleInputHandlerConfigurationMapping : ruleInputHandlerConfigurationMapping EOF ;
    public final void entryRuleInputHandlerConfigurationMapping() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:270:1: ( ruleInputHandlerConfigurationMapping EOF )
            // InternalComponentArchitecture.g:271:1: ruleInputHandlerConfigurationMapping EOF
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
    // InternalComponentArchitecture.g:278:1: ruleInputHandlerConfigurationMapping : ( ( rule__InputHandlerConfigurationMapping__Group__0 ) ) ;
    public final void ruleInputHandlerConfigurationMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:282:2: ( ( ( rule__InputHandlerConfigurationMapping__Group__0 ) ) )
            // InternalComponentArchitecture.g:283:2: ( ( rule__InputHandlerConfigurationMapping__Group__0 ) )
            {
            // InternalComponentArchitecture.g:283:2: ( ( rule__InputHandlerConfigurationMapping__Group__0 ) )
            // InternalComponentArchitecture.g:284:3: ( rule__InputHandlerConfigurationMapping__Group__0 )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getGroup()); 
            // InternalComponentArchitecture.g:285:3: ( rule__InputHandlerConfigurationMapping__Group__0 )
            // InternalComponentArchitecture.g:285:4: rule__InputHandlerConfigurationMapping__Group__0
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
    // InternalComponentArchitecture.g:294:1: entryRuleOpcUaDeviceClientInstance : ruleOpcUaDeviceClientInstance EOF ;
    public final void entryRuleOpcUaDeviceClientInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:295:1: ( ruleOpcUaDeviceClientInstance EOF )
            // InternalComponentArchitecture.g:296:1: ruleOpcUaDeviceClientInstance EOF
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
    // InternalComponentArchitecture.g:303:1: ruleOpcUaDeviceClientInstance : ( ( rule__OpcUaDeviceClientInstance__Group__0 ) ) ;
    public final void ruleOpcUaDeviceClientInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:307:2: ( ( ( rule__OpcUaDeviceClientInstance__Group__0 ) ) )
            // InternalComponentArchitecture.g:308:2: ( ( rule__OpcUaDeviceClientInstance__Group__0 ) )
            {
            // InternalComponentArchitecture.g:308:2: ( ( rule__OpcUaDeviceClientInstance__Group__0 ) )
            // InternalComponentArchitecture.g:309:3: ( rule__OpcUaDeviceClientInstance__Group__0 )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getGroup()); 
            // InternalComponentArchitecture.g:310:3: ( rule__OpcUaDeviceClientInstance__Group__0 )
            // InternalComponentArchitecture.g:310:4: rule__OpcUaDeviceClientInstance__Group__0
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


    // $ANTLR start "entryRuleOpcUaReadServerInstance"
    // InternalComponentArchitecture.g:319:1: entryRuleOpcUaReadServerInstance : ruleOpcUaReadServerInstance EOF ;
    public final void entryRuleOpcUaReadServerInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:320:1: ( ruleOpcUaReadServerInstance EOF )
            // InternalComponentArchitecture.g:321:1: ruleOpcUaReadServerInstance EOF
            {
             before(grammarAccess.getOpcUaReadServerInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleOpcUaReadServerInstance();

            state._fsp--;

             after(grammarAccess.getOpcUaReadServerInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOpcUaReadServerInstance"


    // $ANTLR start "ruleOpcUaReadServerInstance"
    // InternalComponentArchitecture.g:328:1: ruleOpcUaReadServerInstance : ( ( rule__OpcUaReadServerInstance__Group__0 ) ) ;
    public final void ruleOpcUaReadServerInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:332:2: ( ( ( rule__OpcUaReadServerInstance__Group__0 ) ) )
            // InternalComponentArchitecture.g:333:2: ( ( rule__OpcUaReadServerInstance__Group__0 ) )
            {
            // InternalComponentArchitecture.g:333:2: ( ( rule__OpcUaReadServerInstance__Group__0 ) )
            // InternalComponentArchitecture.g:334:3: ( rule__OpcUaReadServerInstance__Group__0 )
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup()); 
            // InternalComponentArchitecture.g:335:3: ( rule__OpcUaReadServerInstance__Group__0 )
            // InternalComponentArchitecture.g:335:4: rule__OpcUaReadServerInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaReadServerInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOpcUaReadServerInstance"


    // $ANTLR start "entryRuleServiceInstance"
    // InternalComponentArchitecture.g:344:1: entryRuleServiceInstance : ruleServiceInstance EOF ;
    public final void entryRuleServiceInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:345:1: ( ruleServiceInstance EOF )
            // InternalComponentArchitecture.g:346:1: ruleServiceInstance EOF
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
    // InternalComponentArchitecture.g:353:1: ruleServiceInstance : ( ( rule__ServiceInstance__Alternatives ) ) ;
    public final void ruleServiceInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:357:2: ( ( ( rule__ServiceInstance__Alternatives ) ) )
            // InternalComponentArchitecture.g:358:2: ( ( rule__ServiceInstance__Alternatives ) )
            {
            // InternalComponentArchitecture.g:358:2: ( ( rule__ServiceInstance__Alternatives ) )
            // InternalComponentArchitecture.g:359:3: ( rule__ServiceInstance__Alternatives )
            {
             before(grammarAccess.getServiceInstanceAccess().getAlternatives()); 
            // InternalComponentArchitecture.g:360:3: ( rule__ServiceInstance__Alternatives )
            // InternalComponentArchitecture.g:360:4: rule__ServiceInstance__Alternatives
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
    // InternalComponentArchitecture.g:369:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:370:1: ( ruleRequiredService EOF )
            // InternalComponentArchitecture.g:371:1: ruleRequiredService EOF
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
    // InternalComponentArchitecture.g:378:1: ruleRequiredService : ( ( rule__RequiredService__Group__0 ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:382:2: ( ( ( rule__RequiredService__Group__0 ) ) )
            // InternalComponentArchitecture.g:383:2: ( ( rule__RequiredService__Group__0 ) )
            {
            // InternalComponentArchitecture.g:383:2: ( ( rule__RequiredService__Group__0 ) )
            // InternalComponentArchitecture.g:384:3: ( rule__RequiredService__Group__0 )
            {
             before(grammarAccess.getRequiredServiceAccess().getGroup()); 
            // InternalComponentArchitecture.g:385:3: ( rule__RequiredService__Group__0 )
            // InternalComponentArchitecture.g:385:4: rule__RequiredService__Group__0
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
    // InternalComponentArchitecture.g:394:1: entryRuleProvidedService : ruleProvidedService EOF ;
    public final void entryRuleProvidedService() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:395:1: ( ruleProvidedService EOF )
            // InternalComponentArchitecture.g:396:1: ruleProvidedService EOF
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
    // InternalComponentArchitecture.g:403:1: ruleProvidedService : ( ( rule__ProvidedService__Group__0 ) ) ;
    public final void ruleProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:407:2: ( ( ( rule__ProvidedService__Group__0 ) ) )
            // InternalComponentArchitecture.g:408:2: ( ( rule__ProvidedService__Group__0 ) )
            {
            // InternalComponentArchitecture.g:408:2: ( ( rule__ProvidedService__Group__0 ) )
            // InternalComponentArchitecture.g:409:3: ( rule__ProvidedService__Group__0 )
            {
             before(grammarAccess.getProvidedServiceAccess().getGroup()); 
            // InternalComponentArchitecture.g:410:3: ( rule__ProvidedService__Group__0 )
            // InternalComponentArchitecture.g:410:4: rule__ProvidedService__Group__0
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


    // $ANTLR start "entryRuleCoordinationModuleMapping"
    // InternalComponentArchitecture.g:419:1: entryRuleCoordinationModuleMapping : ruleCoordinationModuleMapping EOF ;
    public final void entryRuleCoordinationModuleMapping() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:420:1: ( ruleCoordinationModuleMapping EOF )
            // InternalComponentArchitecture.g:421:1: ruleCoordinationModuleMapping EOF
            {
             before(grammarAccess.getCoordinationModuleMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinationModuleMapping();

            state._fsp--;

             after(grammarAccess.getCoordinationModuleMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinationModuleMapping"


    // $ANTLR start "ruleCoordinationModuleMapping"
    // InternalComponentArchitecture.g:428:1: ruleCoordinationModuleMapping : ( ( rule__CoordinationModuleMapping__Group__0 ) ) ;
    public final void ruleCoordinationModuleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:432:2: ( ( ( rule__CoordinationModuleMapping__Group__0 ) ) )
            // InternalComponentArchitecture.g:433:2: ( ( rule__CoordinationModuleMapping__Group__0 ) )
            {
            // InternalComponentArchitecture.g:433:2: ( ( rule__CoordinationModuleMapping__Group__0 ) )
            // InternalComponentArchitecture.g:434:3: ( rule__CoordinationModuleMapping__Group__0 )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getGroup()); 
            // InternalComponentArchitecture.g:435:3: ( rule__CoordinationModuleMapping__Group__0 )
            // InternalComponentArchitecture.g:435:4: rule__CoordinationModuleMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationModuleMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinationModuleMapping"


    // $ANTLR start "entryRuleCoordinationInterfaceComponentInstanceMapping"
    // InternalComponentArchitecture.g:444:1: entryRuleCoordinationInterfaceComponentInstanceMapping : ruleCoordinationInterfaceComponentInstanceMapping EOF ;
    public final void entryRuleCoordinationInterfaceComponentInstanceMapping() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:445:1: ( ruleCoordinationInterfaceComponentInstanceMapping EOF )
            // InternalComponentArchitecture.g:446:1: ruleCoordinationInterfaceComponentInstanceMapping EOF
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleCoordinationInterfaceComponentInstanceMapping();

            state._fsp--;

             after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCoordinationInterfaceComponentInstanceMapping"


    // $ANTLR start "ruleCoordinationInterfaceComponentInstanceMapping"
    // InternalComponentArchitecture.g:453:1: ruleCoordinationInterfaceComponentInstanceMapping : ( ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 ) ) ;
    public final void ruleCoordinationInterfaceComponentInstanceMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:457:2: ( ( ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 ) ) )
            // InternalComponentArchitecture.g:458:2: ( ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 ) )
            {
            // InternalComponentArchitecture.g:458:2: ( ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 ) )
            // InternalComponentArchitecture.g:459:3: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 )
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getGroup()); 
            // InternalComponentArchitecture.g:460:3: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 )
            // InternalComponentArchitecture.g:460:4: rule__CoordinationInterfaceComponentInstanceMapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationInterfaceComponentInstanceMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCoordinationInterfaceComponentInstanceMapping"


    // $ANTLR start "entryRuleTaskRealizationModelRef"
    // InternalComponentArchitecture.g:469:1: entryRuleTaskRealizationModelRef : ruleTaskRealizationModelRef EOF ;
    public final void entryRuleTaskRealizationModelRef() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:470:1: ( ruleTaskRealizationModelRef EOF )
            // InternalComponentArchitecture.g:471:1: ruleTaskRealizationModelRef EOF
            {
             before(grammarAccess.getTaskRealizationModelRefRule()); 
            pushFollow(FOLLOW_1);
            ruleTaskRealizationModelRef();

            state._fsp--;

             after(grammarAccess.getTaskRealizationModelRefRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTaskRealizationModelRef"


    // $ANTLR start "ruleTaskRealizationModelRef"
    // InternalComponentArchitecture.g:478:1: ruleTaskRealizationModelRef : ( ( rule__TaskRealizationModelRef__Group__0 ) ) ;
    public final void ruleTaskRealizationModelRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:482:2: ( ( ( rule__TaskRealizationModelRef__Group__0 ) ) )
            // InternalComponentArchitecture.g:483:2: ( ( rule__TaskRealizationModelRef__Group__0 ) )
            {
            // InternalComponentArchitecture.g:483:2: ( ( rule__TaskRealizationModelRef__Group__0 ) )
            // InternalComponentArchitecture.g:484:3: ( rule__TaskRealizationModelRef__Group__0 )
            {
             before(grammarAccess.getTaskRealizationModelRefAccess().getGroup()); 
            // InternalComponentArchitecture.g:485:3: ( rule__TaskRealizationModelRef__Group__0 )
            // InternalComponentArchitecture.g:485:4: rule__TaskRealizationModelRef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TaskRealizationModelRef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskRealizationModelRefAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTaskRealizationModelRef"


    // $ANTLR start "entryRuleRoboticMiddleware"
    // InternalComponentArchitecture.g:494:1: entryRuleRoboticMiddleware : ruleRoboticMiddleware EOF ;
    public final void entryRuleRoboticMiddleware() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:495:1: ( ruleRoboticMiddleware EOF )
            // InternalComponentArchitecture.g:496:1: ruleRoboticMiddleware EOF
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
    // InternalComponentArchitecture.g:503:1: ruleRoboticMiddleware : ( ( rule__RoboticMiddleware__Alternatives ) ) ;
    public final void ruleRoboticMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:507:2: ( ( ( rule__RoboticMiddleware__Alternatives ) ) )
            // InternalComponentArchitecture.g:508:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            {
            // InternalComponentArchitecture.g:508:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            // InternalComponentArchitecture.g:509:3: ( rule__RoboticMiddleware__Alternatives )
            {
             before(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); 
            // InternalComponentArchitecture.g:510:3: ( rule__RoboticMiddleware__Alternatives )
            // InternalComponentArchitecture.g:510:4: rule__RoboticMiddleware__Alternatives
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
    // InternalComponentArchitecture.g:519:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:520:1: ( ruleFQN EOF )
            // InternalComponentArchitecture.g:521:1: ruleFQN EOF
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
    // InternalComponentArchitecture.g:528:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:532:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalComponentArchitecture.g:533:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalComponentArchitecture.g:533:2: ( ( rule__FQN__Group__0 ) )
            // InternalComponentArchitecture.g:534:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalComponentArchitecture.g:535:3: ( rule__FQN__Group__0 )
            // InternalComponentArchitecture.g:535:4: rule__FQN__Group__0
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
    // InternalComponentArchitecture.g:544:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:545:1: ( ruleEString EOF )
            // InternalComponentArchitecture.g:546:1: ruleEString EOF
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
    // InternalComponentArchitecture.g:553:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:557:2: ( ( RULE_STRING ) )
            // InternalComponentArchitecture.g:558:2: ( RULE_STRING )
            {
            // InternalComponentArchitecture.g:558:2: ( RULE_STRING )
            // InternalComponentArchitecture.g:559:3: RULE_STRING
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
    // InternalComponentArchitecture.g:569:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:570:1: ( ruleEInt EOF )
            // InternalComponentArchitecture.g:571:1: ruleEInt EOF
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
    // InternalComponentArchitecture.g:578:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:582:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalComponentArchitecture.g:583:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalComponentArchitecture.g:583:2: ( ( rule__EInt__Group__0 ) )
            // InternalComponentArchitecture.g:584:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalComponentArchitecture.g:585:3: ( rule__EInt__Group__0 )
            // InternalComponentArchitecture.g:585:4: rule__EInt__Group__0
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


    // $ANTLR start "entryRuleACE_SmartSoft"
    // InternalComponentArchitecture.g:594:1: entryRuleACE_SmartSoft : ruleACE_SmartSoft EOF ;
    public final void entryRuleACE_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:595:1: ( ruleACE_SmartSoft EOF )
            // InternalComponentArchitecture.g:596:1: ruleACE_SmartSoft EOF
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
    // InternalComponentArchitecture.g:603:1: ruleACE_SmartSoft : ( ( rule__ACE_SmartSoft__Group__0 ) ) ;
    public final void ruleACE_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:607:2: ( ( ( rule__ACE_SmartSoft__Group__0 ) ) )
            // InternalComponentArchitecture.g:608:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            {
            // InternalComponentArchitecture.g:608:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            // InternalComponentArchitecture.g:609:3: ( rule__ACE_SmartSoft__Group__0 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup()); 
            // InternalComponentArchitecture.g:610:3: ( rule__ACE_SmartSoft__Group__0 )
            // InternalComponentArchitecture.g:610:4: rule__ACE_SmartSoft__Group__0
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
    // InternalComponentArchitecture.g:619:1: entryRuleOpcUa_SeRoNet : ruleOpcUa_SeRoNet EOF ;
    public final void entryRuleOpcUa_SeRoNet() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:620:1: ( ruleOpcUa_SeRoNet EOF )
            // InternalComponentArchitecture.g:621:1: ruleOpcUa_SeRoNet EOF
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
    // InternalComponentArchitecture.g:628:1: ruleOpcUa_SeRoNet : ( ( rule__OpcUa_SeRoNet__Group__0 ) ) ;
    public final void ruleOpcUa_SeRoNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:632:2: ( ( ( rule__OpcUa_SeRoNet__Group__0 ) ) )
            // InternalComponentArchitecture.g:633:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            {
            // InternalComponentArchitecture.g:633:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            // InternalComponentArchitecture.g:634:3: ( rule__OpcUa_SeRoNet__Group__0 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); 
            // InternalComponentArchitecture.g:635:3: ( rule__OpcUa_SeRoNet__Group__0 )
            // InternalComponentArchitecture.g:635:4: rule__OpcUa_SeRoNet__Group__0
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
    // InternalComponentArchitecture.g:644:1: entryRuleCORBA_SmartSoft : ruleCORBA_SmartSoft EOF ;
    public final void entryRuleCORBA_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:645:1: ( ruleCORBA_SmartSoft EOF )
            // InternalComponentArchitecture.g:646:1: ruleCORBA_SmartSoft EOF
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
    // InternalComponentArchitecture.g:653:1: ruleCORBA_SmartSoft : ( ( rule__CORBA_SmartSoft__Group__0 ) ) ;
    public final void ruleCORBA_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:657:2: ( ( ( rule__CORBA_SmartSoft__Group__0 ) ) )
            // InternalComponentArchitecture.g:658:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            {
            // InternalComponentArchitecture.g:658:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            // InternalComponentArchitecture.g:659:3: ( rule__CORBA_SmartSoft__Group__0 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); 
            // InternalComponentArchitecture.g:660:3: ( rule__CORBA_SmartSoft__Group__0 )
            // InternalComponentArchitecture.g:660:4: rule__CORBA_SmartSoft__Group__0
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
    // InternalComponentArchitecture.g:669:1: entryRuleDDS_SmartSoft : ruleDDS_SmartSoft EOF ;
    public final void entryRuleDDS_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:670:1: ( ruleDDS_SmartSoft EOF )
            // InternalComponentArchitecture.g:671:1: ruleDDS_SmartSoft EOF
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
    // InternalComponentArchitecture.g:678:1: ruleDDS_SmartSoft : ( ( rule__DDS_SmartSoft__Group__0 ) ) ;
    public final void ruleDDS_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:682:2: ( ( ( rule__DDS_SmartSoft__Group__0 ) ) )
            // InternalComponentArchitecture.g:683:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            {
            // InternalComponentArchitecture.g:683:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            // InternalComponentArchitecture.g:684:3: ( rule__DDS_SmartSoft__Group__0 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup()); 
            // InternalComponentArchitecture.g:685:3: ( rule__DDS_SmartSoft__Group__0 )
            // InternalComponentArchitecture.g:685:4: rule__DDS_SmartSoft__Group__0
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


    // $ANTLR start "rule__SystemExtension__Alternatives"
    // InternalComponentArchitecture.g:693:1: rule__SystemExtension__Alternatives : ( ( ruleCoordinationModuleMapping ) | ( ruleTaskRealizationModelRef ) );
    public final void rule__SystemExtension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:697:1: ( ( ruleCoordinationModuleMapping ) | ( ruleTaskRealizationModelRef ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==31) ) {
                alt1=1;
            }
            else if ( (LA1_0==35) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentArchitecture.g:698:2: ( ruleCoordinationModuleMapping )
                    {
                    // InternalComponentArchitecture.g:698:2: ( ruleCoordinationModuleMapping )
                    // InternalComponentArchitecture.g:699:3: ruleCoordinationModuleMapping
                    {
                     before(grammarAccess.getSystemExtensionAccess().getCoordinationModuleMappingParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleCoordinationModuleMapping();

                    state._fsp--;

                     after(grammarAccess.getSystemExtensionAccess().getCoordinationModuleMappingParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalComponentArchitecture.g:704:2: ( ruleTaskRealizationModelRef )
                    {
                    // InternalComponentArchitecture.g:704:2: ( ruleTaskRealizationModelRef )
                    // InternalComponentArchitecture.g:705:3: ruleTaskRealizationModelRef
                    {
                     before(grammarAccess.getSystemExtensionAccess().getTaskRealizationModelRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleTaskRealizationModelRef();

                    state._fsp--;

                     after(grammarAccess.getSystemExtensionAccess().getTaskRealizationModelRefParserRuleCall_1()); 

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
    // $ANTLR end "rule__SystemExtension__Alternatives"


    // $ANTLR start "rule__ComponentInstanceExtension__Alternatives"
    // InternalComponentArchitecture.g:714:1: rule__ComponentInstanceExtension__Alternatives : ( ( ruleParameterStructInstance ) | ( ruleActivityConfigurationMapping ) | ( ruleInputHandlerConfigurationMapping ) | ( ruleOpcUaDeviceClientInstance ) | ( ruleOpcUaReadServerInstance ) );
    public final void rule__ComponentInstanceExtension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:718:1: ( ( ruleParameterStructInstance ) | ( ruleActivityConfigurationMapping ) | ( ruleInputHandlerConfigurationMapping ) | ( ruleOpcUaDeviceClientInstance ) | ( ruleOpcUaReadServerInstance ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 25:
                {
                alt2=4;
                }
                break;
            case 27:
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
                    // InternalComponentArchitecture.g:719:2: ( ruleParameterStructInstance )
                    {
                    // InternalComponentArchitecture.g:719:2: ( ruleParameterStructInstance )
                    // InternalComponentArchitecture.g:720:3: ruleParameterStructInstance
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
                    // InternalComponentArchitecture.g:725:2: ( ruleActivityConfigurationMapping )
                    {
                    // InternalComponentArchitecture.g:725:2: ( ruleActivityConfigurationMapping )
                    // InternalComponentArchitecture.g:726:3: ruleActivityConfigurationMapping
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
                    // InternalComponentArchitecture.g:731:2: ( ruleInputHandlerConfigurationMapping )
                    {
                    // InternalComponentArchitecture.g:731:2: ( ruleInputHandlerConfigurationMapping )
                    // InternalComponentArchitecture.g:732:3: ruleInputHandlerConfigurationMapping
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
                    // InternalComponentArchitecture.g:737:2: ( ruleOpcUaDeviceClientInstance )
                    {
                    // InternalComponentArchitecture.g:737:2: ( ruleOpcUaDeviceClientInstance )
                    // InternalComponentArchitecture.g:738:3: ruleOpcUaDeviceClientInstance
                    {
                     before(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaDeviceClientInstanceParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleOpcUaDeviceClientInstance();

                    state._fsp--;

                     after(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaDeviceClientInstanceParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalComponentArchitecture.g:743:2: ( ruleOpcUaReadServerInstance )
                    {
                    // InternalComponentArchitecture.g:743:2: ( ruleOpcUaReadServerInstance )
                    // InternalComponentArchitecture.g:744:3: ruleOpcUaReadServerInstance
                    {
                     before(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaReadServerInstanceParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleOpcUaReadServerInstance();

                    state._fsp--;

                     after(grammarAccess.getComponentInstanceExtensionAccess().getOpcUaReadServerInstanceParserRuleCall_4()); 

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
    // InternalComponentArchitecture.g:753:1: rule__ServiceInstance__Alternatives : ( ( ruleRequiredService ) | ( ruleProvidedService ) );
    public final void rule__ServiceInstance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:757:1: ( ( ruleRequiredService ) | ( ruleProvidedService ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==29) ) {
                alt3=1;
            }
            else if ( (LA3_0==30) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentArchitecture.g:758:2: ( ruleRequiredService )
                    {
                    // InternalComponentArchitecture.g:758:2: ( ruleRequiredService )
                    // InternalComponentArchitecture.g:759:3: ruleRequiredService
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
                    // InternalComponentArchitecture.g:764:2: ( ruleProvidedService )
                    {
                    // InternalComponentArchitecture.g:764:2: ( ruleProvidedService )
                    // InternalComponentArchitecture.g:765:3: ruleProvidedService
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
    // InternalComponentArchitecture.g:774:1: rule__RoboticMiddleware__Alternatives : ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) );
    public final void rule__RoboticMiddleware__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:778:1: ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt4=1;
                }
                break;
            case 40:
                {
                alt4=2;
                }
                break;
            case 41:
                {
                alt4=3;
                }
                break;
            case 42:
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
                    // InternalComponentArchitecture.g:779:2: ( ruleACE_SmartSoft )
                    {
                    // InternalComponentArchitecture.g:779:2: ( ruleACE_SmartSoft )
                    // InternalComponentArchitecture.g:780:3: ruleACE_SmartSoft
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
                    // InternalComponentArchitecture.g:785:2: ( ruleOpcUa_SeRoNet )
                    {
                    // InternalComponentArchitecture.g:785:2: ( ruleOpcUa_SeRoNet )
                    // InternalComponentArchitecture.g:786:3: ruleOpcUa_SeRoNet
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
                    // InternalComponentArchitecture.g:791:2: ( ruleCORBA_SmartSoft )
                    {
                    // InternalComponentArchitecture.g:791:2: ( ruleCORBA_SmartSoft )
                    // InternalComponentArchitecture.g:792:3: ruleCORBA_SmartSoft
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
                    // InternalComponentArchitecture.g:797:2: ( ruleDDS_SmartSoft )
                    {
                    // InternalComponentArchitecture.g:797:2: ( ruleDDS_SmartSoft )
                    // InternalComponentArchitecture.g:798:3: ruleDDS_SmartSoft
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
    // InternalComponentArchitecture.g:807:1: rule__SystemComponentArchitecture__Group__0 : rule__SystemComponentArchitecture__Group__0__Impl rule__SystemComponentArchitecture__Group__1 ;
    public final void rule__SystemComponentArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:811:1: ( rule__SystemComponentArchitecture__Group__0__Impl rule__SystemComponentArchitecture__Group__1 )
            // InternalComponentArchitecture.g:812:2: rule__SystemComponentArchitecture__Group__0__Impl rule__SystemComponentArchitecture__Group__1
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
    // InternalComponentArchitecture.g:819:1: rule__SystemComponentArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__SystemComponentArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:823:1: ( ( () ) )
            // InternalComponentArchitecture.g:824:1: ( () )
            {
            // InternalComponentArchitecture.g:824:1: ( () )
            // InternalComponentArchitecture.g:825:2: ()
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureAction_0()); 
            // InternalComponentArchitecture.g:826:2: ()
            // InternalComponentArchitecture.g:826:3: 
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
    // InternalComponentArchitecture.g:834:1: rule__SystemComponentArchitecture__Group__1 : rule__SystemComponentArchitecture__Group__1__Impl rule__SystemComponentArchitecture__Group__2 ;
    public final void rule__SystemComponentArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:838:1: ( rule__SystemComponentArchitecture__Group__1__Impl rule__SystemComponentArchitecture__Group__2 )
            // InternalComponentArchitecture.g:839:2: rule__SystemComponentArchitecture__Group__1__Impl rule__SystemComponentArchitecture__Group__2
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
    // InternalComponentArchitecture.g:846:1: rule__SystemComponentArchitecture__Group__1__Impl : ( 'SystemComponentArchitecture' ) ;
    public final void rule__SystemComponentArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:850:1: ( ( 'SystemComponentArchitecture' ) )
            // InternalComponentArchitecture.g:851:1: ( 'SystemComponentArchitecture' )
            {
            // InternalComponentArchitecture.g:851:1: ( 'SystemComponentArchitecture' )
            // InternalComponentArchitecture.g:852:2: 'SystemComponentArchitecture'
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
    // InternalComponentArchitecture.g:861:1: rule__SystemComponentArchitecture__Group__2 : rule__SystemComponentArchitecture__Group__2__Impl rule__SystemComponentArchitecture__Group__3 ;
    public final void rule__SystemComponentArchitecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:865:1: ( rule__SystemComponentArchitecture__Group__2__Impl rule__SystemComponentArchitecture__Group__3 )
            // InternalComponentArchitecture.g:866:2: rule__SystemComponentArchitecture__Group__2__Impl rule__SystemComponentArchitecture__Group__3
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
    // InternalComponentArchitecture.g:873:1: rule__SystemComponentArchitecture__Group__2__Impl : ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) ) ;
    public final void rule__SystemComponentArchitecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:877:1: ( ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) ) )
            // InternalComponentArchitecture.g:878:1: ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) )
            {
            // InternalComponentArchitecture.g:878:1: ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) )
            // InternalComponentArchitecture.g:879:2: ( rule__SystemComponentArchitecture__NameAssignment_2 )
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getNameAssignment_2()); 
            // InternalComponentArchitecture.g:880:2: ( rule__SystemComponentArchitecture__NameAssignment_2 )
            // InternalComponentArchitecture.g:880:3: rule__SystemComponentArchitecture__NameAssignment_2
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
    // InternalComponentArchitecture.g:888:1: rule__SystemComponentArchitecture__Group__3 : rule__SystemComponentArchitecture__Group__3__Impl rule__SystemComponentArchitecture__Group__4 ;
    public final void rule__SystemComponentArchitecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:892:1: ( rule__SystemComponentArchitecture__Group__3__Impl rule__SystemComponentArchitecture__Group__4 )
            // InternalComponentArchitecture.g:893:2: rule__SystemComponentArchitecture__Group__3__Impl rule__SystemComponentArchitecture__Group__4
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
    // InternalComponentArchitecture.g:900:1: rule__SystemComponentArchitecture__Group__3__Impl : ( ( rule__SystemComponentArchitecture__Group_3__0 )? ) ;
    public final void rule__SystemComponentArchitecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:904:1: ( ( ( rule__SystemComponentArchitecture__Group_3__0 )? ) )
            // InternalComponentArchitecture.g:905:1: ( ( rule__SystemComponentArchitecture__Group_3__0 )? )
            {
            // InternalComponentArchitecture.g:905:1: ( ( rule__SystemComponentArchitecture__Group_3__0 )? )
            // InternalComponentArchitecture.g:906:2: ( rule__SystemComponentArchitecture__Group_3__0 )?
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getGroup_3()); 
            // InternalComponentArchitecture.g:907:2: ( rule__SystemComponentArchitecture__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==14) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentArchitecture.g:907:3: rule__SystemComponentArchitecture__Group_3__0
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
    // InternalComponentArchitecture.g:915:1: rule__SystemComponentArchitecture__Group__4 : rule__SystemComponentArchitecture__Group__4__Impl rule__SystemComponentArchitecture__Group__5 ;
    public final void rule__SystemComponentArchitecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:919:1: ( rule__SystemComponentArchitecture__Group__4__Impl rule__SystemComponentArchitecture__Group__5 )
            // InternalComponentArchitecture.g:920:2: rule__SystemComponentArchitecture__Group__4__Impl rule__SystemComponentArchitecture__Group__5
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
    // InternalComponentArchitecture.g:927:1: rule__SystemComponentArchitecture__Group__4__Impl : ( '{' ) ;
    public final void rule__SystemComponentArchitecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:931:1: ( ( '{' ) )
            // InternalComponentArchitecture.g:932:1: ( '{' )
            {
            // InternalComponentArchitecture.g:932:1: ( '{' )
            // InternalComponentArchitecture.g:933:2: '{'
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
    // InternalComponentArchitecture.g:942:1: rule__SystemComponentArchitecture__Group__5 : rule__SystemComponentArchitecture__Group__5__Impl rule__SystemComponentArchitecture__Group__6 ;
    public final void rule__SystemComponentArchitecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:946:1: ( rule__SystemComponentArchitecture__Group__5__Impl rule__SystemComponentArchitecture__Group__6 )
            // InternalComponentArchitecture.g:947:2: rule__SystemComponentArchitecture__Group__5__Impl rule__SystemComponentArchitecture__Group__6
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
    // InternalComponentArchitecture.g:954:1: rule__SystemComponentArchitecture__Group__5__Impl : ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* ) ;
    public final void rule__SystemComponentArchitecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:958:1: ( ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* ) )
            // InternalComponentArchitecture.g:959:1: ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* )
            {
            // InternalComponentArchitecture.g:959:1: ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* )
            // InternalComponentArchitecture.g:960:2: ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getComponentsAssignment_5()); 
            // InternalComponentArchitecture.g:961:2: ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponentArchitecture.g:961:3: rule__SystemComponentArchitecture__ComponentsAssignment_5
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__SystemComponentArchitecture__ComponentsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
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
    // InternalComponentArchitecture.g:969:1: rule__SystemComponentArchitecture__Group__6 : rule__SystemComponentArchitecture__Group__6__Impl rule__SystemComponentArchitecture__Group__7 ;
    public final void rule__SystemComponentArchitecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:973:1: ( rule__SystemComponentArchitecture__Group__6__Impl rule__SystemComponentArchitecture__Group__7 )
            // InternalComponentArchitecture.g:974:2: rule__SystemComponentArchitecture__Group__6__Impl rule__SystemComponentArchitecture__Group__7
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
    // InternalComponentArchitecture.g:981:1: rule__SystemComponentArchitecture__Group__6__Impl : ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* ) ;
    public final void rule__SystemComponentArchitecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:985:1: ( ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* ) )
            // InternalComponentArchitecture.g:986:1: ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* )
            {
            // InternalComponentArchitecture.g:986:1: ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* )
            // InternalComponentArchitecture.g:987:2: ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )*
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsAssignment_6()); 
            // InternalComponentArchitecture.g:988:2: ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==15) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComponentArchitecture.g:988:3: rule__SystemComponentArchitecture__ConnectionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SystemComponentArchitecture__ConnectionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // InternalComponentArchitecture.g:996:1: rule__SystemComponentArchitecture__Group__7 : rule__SystemComponentArchitecture__Group__7__Impl rule__SystemComponentArchitecture__Group__8 ;
    public final void rule__SystemComponentArchitecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1000:1: ( rule__SystemComponentArchitecture__Group__7__Impl rule__SystemComponentArchitecture__Group__8 )
            // InternalComponentArchitecture.g:1001:2: rule__SystemComponentArchitecture__Group__7__Impl rule__SystemComponentArchitecture__Group__8
            {
            pushFollow(FOLLOW_6);
            rule__SystemComponentArchitecture__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group__8();

            state._fsp--;


            }

        }
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
    // InternalComponentArchitecture.g:1008:1: rule__SystemComponentArchitecture__Group__7__Impl : ( ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )* ) ;
    public final void rule__SystemComponentArchitecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1012:1: ( ( ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )* ) )
            // InternalComponentArchitecture.g:1013:1: ( ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )* )
            {
            // InternalComponentArchitecture.g:1013:1: ( ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )* )
            // InternalComponentArchitecture.g:1014:2: ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )*
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsAssignment_7()); 
            // InternalComponentArchitecture.g:1015:2: ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==31||LA8_0==35) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalComponentArchitecture.g:1015:3: rule__SystemComponentArchitecture__ExtensionsAssignment_7
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SystemComponentArchitecture__ExtensionsAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsAssignment_7()); 

            }


            }

        }
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


    // $ANTLR start "rule__SystemComponentArchitecture__Group__8"
    // InternalComponentArchitecture.g:1023:1: rule__SystemComponentArchitecture__Group__8 : rule__SystemComponentArchitecture__Group__8__Impl ;
    public final void rule__SystemComponentArchitecture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1027:1: ( rule__SystemComponentArchitecture__Group__8__Impl )
            // InternalComponentArchitecture.g:1028:2: rule__SystemComponentArchitecture__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemComponentArchitecture__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__8"


    // $ANTLR start "rule__SystemComponentArchitecture__Group__8__Impl"
    // InternalComponentArchitecture.g:1034:1: rule__SystemComponentArchitecture__Group__8__Impl : ( '}' ) ;
    public final void rule__SystemComponentArchitecture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1038:1: ( ( '}' ) )
            // InternalComponentArchitecture.g:1039:1: ( '}' )
            {
            // InternalComponentArchitecture.g:1039:1: ( '}' )
            // InternalComponentArchitecture.g:1040:2: '}'
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSystemComponentArchitectureAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__Group__8__Impl"


    // $ANTLR start "rule__SystemComponentArchitecture__Group_3__0"
    // InternalComponentArchitecture.g:1050:1: rule__SystemComponentArchitecture__Group_3__0 : rule__SystemComponentArchitecture__Group_3__0__Impl rule__SystemComponentArchitecture__Group_3__1 ;
    public final void rule__SystemComponentArchitecture__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1054:1: ( rule__SystemComponentArchitecture__Group_3__0__Impl rule__SystemComponentArchitecture__Group_3__1 )
            // InternalComponentArchitecture.g:1055:2: rule__SystemComponentArchitecture__Group_3__0__Impl rule__SystemComponentArchitecture__Group_3__1
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
    // InternalComponentArchitecture.g:1062:1: rule__SystemComponentArchitecture__Group_3__0__Impl : ( 'usingActivityArchitecture' ) ;
    public final void rule__SystemComponentArchitecture__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1066:1: ( ( 'usingActivityArchitecture' ) )
            // InternalComponentArchitecture.g:1067:1: ( 'usingActivityArchitecture' )
            {
            // InternalComponentArchitecture.g:1067:1: ( 'usingActivityArchitecture' )
            // InternalComponentArchitecture.g:1068:2: 'usingActivityArchitecture'
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
    // InternalComponentArchitecture.g:1077:1: rule__SystemComponentArchitecture__Group_3__1 : rule__SystemComponentArchitecture__Group_3__1__Impl ;
    public final void rule__SystemComponentArchitecture__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1081:1: ( rule__SystemComponentArchitecture__Group_3__1__Impl )
            // InternalComponentArchitecture.g:1082:2: rule__SystemComponentArchitecture__Group_3__1__Impl
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
    // InternalComponentArchitecture.g:1088:1: rule__SystemComponentArchitecture__Group_3__1__Impl : ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) ) ;
    public final void rule__SystemComponentArchitecture__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1092:1: ( ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) ) )
            // InternalComponentArchitecture.g:1093:1: ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) )
            {
            // InternalComponentArchitecture.g:1093:1: ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) )
            // InternalComponentArchitecture.g:1094:2: ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 )
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchAssignment_3_1()); 
            // InternalComponentArchitecture.g:1095:2: ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 )
            // InternalComponentArchitecture.g:1095:3: rule__SystemComponentArchitecture__ActivityArchAssignment_3_1
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
    // InternalComponentArchitecture.g:1104:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1108:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // InternalComponentArchitecture.g:1109:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
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
    // InternalComponentArchitecture.g:1116:1: rule__Connection__Group__0__Impl : ( 'Connection' ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1120:1: ( ( 'Connection' ) )
            // InternalComponentArchitecture.g:1121:1: ( 'Connection' )
            {
            // InternalComponentArchitecture.g:1121:1: ( 'Connection' )
            // InternalComponentArchitecture.g:1122:2: 'Connection'
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
    // InternalComponentArchitecture.g:1131:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1135:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // InternalComponentArchitecture.g:1136:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
            {
            pushFollow(FOLLOW_10);
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
    // InternalComponentArchitecture.g:1143:1: rule__Connection__Group__1__Impl : ( ( rule__Connection__FromAssignment_1 ) ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1147:1: ( ( ( rule__Connection__FromAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1148:1: ( ( rule__Connection__FromAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1148:1: ( ( rule__Connection__FromAssignment_1 ) )
            // InternalComponentArchitecture.g:1149:2: ( rule__Connection__FromAssignment_1 )
            {
             before(grammarAccess.getConnectionAccess().getFromAssignment_1()); 
            // InternalComponentArchitecture.g:1150:2: ( rule__Connection__FromAssignment_1 )
            // InternalComponentArchitecture.g:1150:3: rule__Connection__FromAssignment_1
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
    // InternalComponentArchitecture.g:1158:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1162:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // InternalComponentArchitecture.g:1163:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
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
    // InternalComponentArchitecture.g:1170:1: rule__Connection__Group__2__Impl : ( '->' ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1174:1: ( ( '->' ) )
            // InternalComponentArchitecture.g:1175:1: ( '->' )
            {
            // InternalComponentArchitecture.g:1175:1: ( '->' )
            // InternalComponentArchitecture.g:1176:2: '->'
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
    // InternalComponentArchitecture.g:1185:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1189:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // InternalComponentArchitecture.g:1190:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentArchitecture.g:1197:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__ToAssignment_3 ) ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1201:1: ( ( ( rule__Connection__ToAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1202:1: ( ( rule__Connection__ToAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1202:1: ( ( rule__Connection__ToAssignment_3 ) )
            // InternalComponentArchitecture.g:1203:2: ( rule__Connection__ToAssignment_3 )
            {
             before(grammarAccess.getConnectionAccess().getToAssignment_3()); 
            // InternalComponentArchitecture.g:1204:2: ( rule__Connection__ToAssignment_3 )
            // InternalComponentArchitecture.g:1204:3: rule__Connection__ToAssignment_3
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
    // InternalComponentArchitecture.g:1212:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1216:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // InternalComponentArchitecture.g:1217:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
            {
            pushFollow(FOLLOW_11);
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
    // InternalComponentArchitecture.g:1224:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__Group_4__0 )? ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1228:1: ( ( ( rule__Connection__Group_4__0 )? ) )
            // InternalComponentArchitecture.g:1229:1: ( ( rule__Connection__Group_4__0 )? )
            {
            // InternalComponentArchitecture.g:1229:1: ( ( rule__Connection__Group_4__0 )? )
            // InternalComponentArchitecture.g:1230:2: ( rule__Connection__Group_4__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_4()); 
            // InternalComponentArchitecture.g:1231:2: ( rule__Connection__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentArchitecture.g:1231:3: rule__Connection__Group_4__0
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
    // InternalComponentArchitecture.g:1239:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1243:1: ( rule__Connection__Group__5__Impl )
            // InternalComponentArchitecture.g:1244:2: rule__Connection__Group__5__Impl
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
    // InternalComponentArchitecture.g:1250:1: rule__Connection__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1254:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1255:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1255:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1256:2: ( ';' )?
            {
             before(grammarAccess.getConnectionAccess().getSemicolonKeyword_5()); 
            // InternalComponentArchitecture.g:1257:2: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentArchitecture.g:1257:3: ';'
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
    // InternalComponentArchitecture.g:1266:1: rule__Connection__Group_4__0 : rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 ;
    public final void rule__Connection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1270:1: ( rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 )
            // InternalComponentArchitecture.g:1271:2: rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentArchitecture.g:1278:1: rule__Connection__Group_4__0__Impl : ( 'useMiddleware' ) ;
    public final void rule__Connection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1282:1: ( ( 'useMiddleware' ) )
            // InternalComponentArchitecture.g:1283:1: ( 'useMiddleware' )
            {
            // InternalComponentArchitecture.g:1283:1: ( 'useMiddleware' )
            // InternalComponentArchitecture.g:1284:2: 'useMiddleware'
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
    // InternalComponentArchitecture.g:1293:1: rule__Connection__Group_4__1 : rule__Connection__Group_4__1__Impl ;
    public final void rule__Connection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1297:1: ( rule__Connection__Group_4__1__Impl )
            // InternalComponentArchitecture.g:1298:2: rule__Connection__Group_4__1__Impl
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
    // InternalComponentArchitecture.g:1304:1: rule__Connection__Group_4__1__Impl : ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) ) ;
    public final void rule__Connection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1308:1: ( ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) ) )
            // InternalComponentArchitecture.g:1309:1: ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) )
            {
            // InternalComponentArchitecture.g:1309:1: ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) )
            // InternalComponentArchitecture.g:1310:2: ( rule__Connection__MiddlewareSelectionAssignment_4_1 )
            {
             before(grammarAccess.getConnectionAccess().getMiddlewareSelectionAssignment_4_1()); 
            // InternalComponentArchitecture.g:1311:2: ( rule__Connection__MiddlewareSelectionAssignment_4_1 )
            // InternalComponentArchitecture.g:1311:3: rule__Connection__MiddlewareSelectionAssignment_4_1
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
    // InternalComponentArchitecture.g:1320:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1324:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalComponentArchitecture.g:1325:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
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
    // InternalComponentArchitecture.g:1332:1: rule__ComponentInstance__Group__0__Impl : ( 'ComponentInstance' ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1336:1: ( ( 'ComponentInstance' ) )
            // InternalComponentArchitecture.g:1337:1: ( 'ComponentInstance' )
            {
            // InternalComponentArchitecture.g:1337:1: ( 'ComponentInstance' )
            // InternalComponentArchitecture.g:1338:2: 'ComponentInstance'
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
    // InternalComponentArchitecture.g:1347:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1351:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalComponentArchitecture.g:1352:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalComponentArchitecture.g:1359:1: rule__ComponentInstance__Group__1__Impl : ( ( rule__ComponentInstance__NameAssignment_1 ) ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1363:1: ( ( ( rule__ComponentInstance__NameAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1364:1: ( ( rule__ComponentInstance__NameAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1364:1: ( ( rule__ComponentInstance__NameAssignment_1 ) )
            // InternalComponentArchitecture.g:1365:2: ( rule__ComponentInstance__NameAssignment_1 )
            {
             before(grammarAccess.getComponentInstanceAccess().getNameAssignment_1()); 
            // InternalComponentArchitecture.g:1366:2: ( rule__ComponentInstance__NameAssignment_1 )
            // InternalComponentArchitecture.g:1366:3: rule__ComponentInstance__NameAssignment_1
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
    // InternalComponentArchitecture.g:1374:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1378:1: ( rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 )
            // InternalComponentArchitecture.g:1379:2: rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3
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
    // InternalComponentArchitecture.g:1386:1: rule__ComponentInstance__Group__2__Impl : ( 'instantiates' ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1390:1: ( ( 'instantiates' ) )
            // InternalComponentArchitecture.g:1391:1: ( 'instantiates' )
            {
            // InternalComponentArchitecture.g:1391:1: ( 'instantiates' )
            // InternalComponentArchitecture.g:1392:2: 'instantiates'
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
    // InternalComponentArchitecture.g:1401:1: rule__ComponentInstance__Group__3 : rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4 ;
    public final void rule__ComponentInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1405:1: ( rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4 )
            // InternalComponentArchitecture.g:1406:2: rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalComponentArchitecture.g:1413:1: rule__ComponentInstance__Group__3__Impl : ( ( rule__ComponentInstance__ComponentAssignment_3 ) ) ;
    public final void rule__ComponentInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1417:1: ( ( ( rule__ComponentInstance__ComponentAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1418:1: ( ( rule__ComponentInstance__ComponentAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1418:1: ( ( rule__ComponentInstance__ComponentAssignment_3 ) )
            // InternalComponentArchitecture.g:1419:2: ( rule__ComponentInstance__ComponentAssignment_3 )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentAssignment_3()); 
            // InternalComponentArchitecture.g:1420:2: ( rule__ComponentInstance__ComponentAssignment_3 )
            // InternalComponentArchitecture.g:1420:3: rule__ComponentInstance__ComponentAssignment_3
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
    // InternalComponentArchitecture.g:1428:1: rule__ComponentInstance__Group__4 : rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5 ;
    public final void rule__ComponentInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1432:1: ( rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5 )
            // InternalComponentArchitecture.g:1433:2: rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentArchitecture.g:1440:1: rule__ComponentInstance__Group__4__Impl : ( '{' ) ;
    public final void rule__ComponentInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1444:1: ( ( '{' ) )
            // InternalComponentArchitecture.g:1445:1: ( '{' )
            {
            // InternalComponentArchitecture.g:1445:1: ( '{' )
            // InternalComponentArchitecture.g:1446:2: '{'
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
    // InternalComponentArchitecture.g:1455:1: rule__ComponentInstance__Group__5 : rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6 ;
    public final void rule__ComponentInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1459:1: ( rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6 )
            // InternalComponentArchitecture.g:1460:2: rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentArchitecture.g:1467:1: rule__ComponentInstance__Group__5__Impl : ( ( rule__ComponentInstance__PortsAssignment_5 )* ) ;
    public final void rule__ComponentInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1471:1: ( ( ( rule__ComponentInstance__PortsAssignment_5 )* ) )
            // InternalComponentArchitecture.g:1472:1: ( ( rule__ComponentInstance__PortsAssignment_5 )* )
            {
            // InternalComponentArchitecture.g:1472:1: ( ( rule__ComponentInstance__PortsAssignment_5 )* )
            // InternalComponentArchitecture.g:1473:2: ( rule__ComponentInstance__PortsAssignment_5 )*
            {
             before(grammarAccess.getComponentInstanceAccess().getPortsAssignment_5()); 
            // InternalComponentArchitecture.g:1474:2: ( rule__ComponentInstance__PortsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=29 && LA11_0<=30)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentArchitecture.g:1474:3: rule__ComponentInstance__PortsAssignment_5
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__ComponentInstance__PortsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalComponentArchitecture.g:1482:1: rule__ComponentInstance__Group__6 : rule__ComponentInstance__Group__6__Impl rule__ComponentInstance__Group__7 ;
    public final void rule__ComponentInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1486:1: ( rule__ComponentInstance__Group__6__Impl rule__ComponentInstance__Group__7 )
            // InternalComponentArchitecture.g:1487:2: rule__ComponentInstance__Group__6__Impl rule__ComponentInstance__Group__7
            {
            pushFollow(FOLLOW_15);
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
    // InternalComponentArchitecture.g:1494:1: rule__ComponentInstance__Group__6__Impl : ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* ) ;
    public final void rule__ComponentInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1498:1: ( ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* ) )
            // InternalComponentArchitecture.g:1499:1: ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* )
            {
            // InternalComponentArchitecture.g:1499:1: ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* )
            // InternalComponentArchitecture.g:1500:2: ( rule__ComponentInstance__ExtensionsAssignment_6 )*
            {
             before(grammarAccess.getComponentInstanceAccess().getExtensionsAssignment_6()); 
            // InternalComponentArchitecture.g:1501:2: ( rule__ComponentInstance__ExtensionsAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=21 && LA12_0<=22)||(LA12_0>=24 && LA12_0<=25)||LA12_0==27) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentArchitecture.g:1501:3: rule__ComponentInstance__ExtensionsAssignment_6
            	    {
            	    pushFollow(FOLLOW_17);
            	    rule__ComponentInstance__ExtensionsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalComponentArchitecture.g:1509:1: rule__ComponentInstance__Group__7 : rule__ComponentInstance__Group__7__Impl ;
    public final void rule__ComponentInstance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1513:1: ( rule__ComponentInstance__Group__7__Impl )
            // InternalComponentArchitecture.g:1514:2: rule__ComponentInstance__Group__7__Impl
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
    // InternalComponentArchitecture.g:1520:1: rule__ComponentInstance__Group__7__Impl : ( '}' ) ;
    public final void rule__ComponentInstance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1524:1: ( ( '}' ) )
            // InternalComponentArchitecture.g:1525:1: ( '}' )
            {
            // InternalComponentArchitecture.g:1525:1: ( '}' )
            // InternalComponentArchitecture.g:1526:2: '}'
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
    // InternalComponentArchitecture.g:1536:1: rule__ParameterStructInstance__Group__0 : rule__ParameterStructInstance__Group__0__Impl rule__ParameterStructInstance__Group__1 ;
    public final void rule__ParameterStructInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1540:1: ( rule__ParameterStructInstance__Group__0__Impl rule__ParameterStructInstance__Group__1 )
            // InternalComponentArchitecture.g:1541:2: rule__ParameterStructInstance__Group__0__Impl rule__ParameterStructInstance__Group__1
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
    // InternalComponentArchitecture.g:1548:1: rule__ParameterStructInstance__Group__0__Impl : ( 'ParameterStructInstance' ) ;
    public final void rule__ParameterStructInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1552:1: ( ( 'ParameterStructInstance' ) )
            // InternalComponentArchitecture.g:1553:1: ( 'ParameterStructInstance' )
            {
            // InternalComponentArchitecture.g:1553:1: ( 'ParameterStructInstance' )
            // InternalComponentArchitecture.g:1554:2: 'ParameterStructInstance'
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
    // InternalComponentArchitecture.g:1563:1: rule__ParameterStructInstance__Group__1 : rule__ParameterStructInstance__Group__1__Impl rule__ParameterStructInstance__Group__2 ;
    public final void rule__ParameterStructInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1567:1: ( rule__ParameterStructInstance__Group__1__Impl rule__ParameterStructInstance__Group__2 )
            // InternalComponentArchitecture.g:1568:2: rule__ParameterStructInstance__Group__1__Impl rule__ParameterStructInstance__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentArchitecture.g:1575:1: rule__ParameterStructInstance__Group__1__Impl : ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) ) ;
    public final void rule__ParameterStructInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1579:1: ( ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1580:1: ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1580:1: ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) )
            // InternalComponentArchitecture.g:1581:2: ( rule__ParameterStructInstance__ParameterAssignment_1 )
            {
             before(grammarAccess.getParameterStructInstanceAccess().getParameterAssignment_1()); 
            // InternalComponentArchitecture.g:1582:2: ( rule__ParameterStructInstance__ParameterAssignment_1 )
            // InternalComponentArchitecture.g:1582:3: rule__ParameterStructInstance__ParameterAssignment_1
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
    // InternalComponentArchitecture.g:1590:1: rule__ParameterStructInstance__Group__2 : rule__ParameterStructInstance__Group__2__Impl ;
    public final void rule__ParameterStructInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1594:1: ( rule__ParameterStructInstance__Group__2__Impl )
            // InternalComponentArchitecture.g:1595:2: rule__ParameterStructInstance__Group__2__Impl
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
    // InternalComponentArchitecture.g:1601:1: rule__ParameterStructInstance__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ParameterStructInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1605:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1606:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1606:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1607:2: ( ';' )?
            {
             before(grammarAccess.getParameterStructInstanceAccess().getSemicolonKeyword_2()); 
            // InternalComponentArchitecture.g:1608:2: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentArchitecture.g:1608:3: ';'
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
    // InternalComponentArchitecture.g:1617:1: rule__ActivityConfigurationMapping__Group__0 : rule__ActivityConfigurationMapping__Group__0__Impl rule__ActivityConfigurationMapping__Group__1 ;
    public final void rule__ActivityConfigurationMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1621:1: ( rule__ActivityConfigurationMapping__Group__0__Impl rule__ActivityConfigurationMapping__Group__1 )
            // InternalComponentArchitecture.g:1622:2: rule__ActivityConfigurationMapping__Group__0__Impl rule__ActivityConfigurationMapping__Group__1
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
    // InternalComponentArchitecture.g:1629:1: rule__ActivityConfigurationMapping__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__ActivityConfigurationMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1633:1: ( ( 'Activity' ) )
            // InternalComponentArchitecture.g:1634:1: ( 'Activity' )
            {
            // InternalComponentArchitecture.g:1634:1: ( 'Activity' )
            // InternalComponentArchitecture.g:1635:2: 'Activity'
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
    // InternalComponentArchitecture.g:1644:1: rule__ActivityConfigurationMapping__Group__1 : rule__ActivityConfigurationMapping__Group__1__Impl rule__ActivityConfigurationMapping__Group__2 ;
    public final void rule__ActivityConfigurationMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1648:1: ( rule__ActivityConfigurationMapping__Group__1__Impl rule__ActivityConfigurationMapping__Group__2 )
            // InternalComponentArchitecture.g:1649:2: rule__ActivityConfigurationMapping__Group__1__Impl rule__ActivityConfigurationMapping__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentArchitecture.g:1656:1: rule__ActivityConfigurationMapping__Group__1__Impl : ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) ) ;
    public final void rule__ActivityConfigurationMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1660:1: ( ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1661:1: ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1661:1: ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) )
            // InternalComponentArchitecture.g:1662:2: ( rule__ActivityConfigurationMapping__ActivityAssignment_1 )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getActivityAssignment_1()); 
            // InternalComponentArchitecture.g:1663:2: ( rule__ActivityConfigurationMapping__ActivityAssignment_1 )
            // InternalComponentArchitecture.g:1663:3: rule__ActivityConfigurationMapping__ActivityAssignment_1
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
    // InternalComponentArchitecture.g:1671:1: rule__ActivityConfigurationMapping__Group__2 : rule__ActivityConfigurationMapping__Group__2__Impl rule__ActivityConfigurationMapping__Group__3 ;
    public final void rule__ActivityConfigurationMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1675:1: ( rule__ActivityConfigurationMapping__Group__2__Impl rule__ActivityConfigurationMapping__Group__3 )
            // InternalComponentArchitecture.g:1676:2: rule__ActivityConfigurationMapping__Group__2__Impl rule__ActivityConfigurationMapping__Group__3
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
    // InternalComponentArchitecture.g:1683:1: rule__ActivityConfigurationMapping__Group__2__Impl : ( 'configuration' ) ;
    public final void rule__ActivityConfigurationMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1687:1: ( ( 'configuration' ) )
            // InternalComponentArchitecture.g:1688:1: ( 'configuration' )
            {
            // InternalComponentArchitecture.g:1688:1: ( 'configuration' )
            // InternalComponentArchitecture.g:1689:2: 'configuration'
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
    // InternalComponentArchitecture.g:1698:1: rule__ActivityConfigurationMapping__Group__3 : rule__ActivityConfigurationMapping__Group__3__Impl rule__ActivityConfigurationMapping__Group__4 ;
    public final void rule__ActivityConfigurationMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1702:1: ( rule__ActivityConfigurationMapping__Group__3__Impl rule__ActivityConfigurationMapping__Group__4 )
            // InternalComponentArchitecture.g:1703:2: rule__ActivityConfigurationMapping__Group__3__Impl rule__ActivityConfigurationMapping__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentArchitecture.g:1710:1: rule__ActivityConfigurationMapping__Group__3__Impl : ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) ) ;
    public final void rule__ActivityConfigurationMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1714:1: ( ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1715:1: ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1715:1: ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) )
            // InternalComponentArchitecture.g:1716:2: ( rule__ActivityConfigurationMapping__ConfigAssignment_3 )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getConfigAssignment_3()); 
            // InternalComponentArchitecture.g:1717:2: ( rule__ActivityConfigurationMapping__ConfigAssignment_3 )
            // InternalComponentArchitecture.g:1717:3: rule__ActivityConfigurationMapping__ConfigAssignment_3
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
    // InternalComponentArchitecture.g:1725:1: rule__ActivityConfigurationMapping__Group__4 : rule__ActivityConfigurationMapping__Group__4__Impl ;
    public final void rule__ActivityConfigurationMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1729:1: ( rule__ActivityConfigurationMapping__Group__4__Impl )
            // InternalComponentArchitecture.g:1730:2: rule__ActivityConfigurationMapping__Group__4__Impl
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
    // InternalComponentArchitecture.g:1736:1: rule__ActivityConfigurationMapping__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__ActivityConfigurationMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1740:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1741:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1741:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1742:2: ( ';' )?
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getSemicolonKeyword_4()); 
            // InternalComponentArchitecture.g:1743:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==17) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentArchitecture.g:1743:3: ';'
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
    // InternalComponentArchitecture.g:1752:1: rule__InputHandlerConfigurationMapping__Group__0 : rule__InputHandlerConfigurationMapping__Group__0__Impl rule__InputHandlerConfigurationMapping__Group__1 ;
    public final void rule__InputHandlerConfigurationMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1756:1: ( rule__InputHandlerConfigurationMapping__Group__0__Impl rule__InputHandlerConfigurationMapping__Group__1 )
            // InternalComponentArchitecture.g:1757:2: rule__InputHandlerConfigurationMapping__Group__0__Impl rule__InputHandlerConfigurationMapping__Group__1
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
    // InternalComponentArchitecture.g:1764:1: rule__InputHandlerConfigurationMapping__Group__0__Impl : ( 'InputHandler' ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1768:1: ( ( 'InputHandler' ) )
            // InternalComponentArchitecture.g:1769:1: ( 'InputHandler' )
            {
            // InternalComponentArchitecture.g:1769:1: ( 'InputHandler' )
            // InternalComponentArchitecture.g:1770:2: 'InputHandler'
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
    // InternalComponentArchitecture.g:1779:1: rule__InputHandlerConfigurationMapping__Group__1 : rule__InputHandlerConfigurationMapping__Group__1__Impl rule__InputHandlerConfigurationMapping__Group__2 ;
    public final void rule__InputHandlerConfigurationMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1783:1: ( rule__InputHandlerConfigurationMapping__Group__1__Impl rule__InputHandlerConfigurationMapping__Group__2 )
            // InternalComponentArchitecture.g:1784:2: rule__InputHandlerConfigurationMapping__Group__1__Impl rule__InputHandlerConfigurationMapping__Group__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalComponentArchitecture.g:1791:1: rule__InputHandlerConfigurationMapping__Group__1__Impl : ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1795:1: ( ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1796:1: ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1796:1: ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) )
            // InternalComponentArchitecture.g:1797:2: ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerAssignment_1()); 
            // InternalComponentArchitecture.g:1798:2: ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 )
            // InternalComponentArchitecture.g:1798:3: rule__InputHandlerConfigurationMapping__HandlerAssignment_1
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
    // InternalComponentArchitecture.g:1806:1: rule__InputHandlerConfigurationMapping__Group__2 : rule__InputHandlerConfigurationMapping__Group__2__Impl rule__InputHandlerConfigurationMapping__Group__3 ;
    public final void rule__InputHandlerConfigurationMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1810:1: ( rule__InputHandlerConfigurationMapping__Group__2__Impl rule__InputHandlerConfigurationMapping__Group__3 )
            // InternalComponentArchitecture.g:1811:2: rule__InputHandlerConfigurationMapping__Group__2__Impl rule__InputHandlerConfigurationMapping__Group__3
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
    // InternalComponentArchitecture.g:1818:1: rule__InputHandlerConfigurationMapping__Group__2__Impl : ( 'configuration' ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1822:1: ( ( 'configuration' ) )
            // InternalComponentArchitecture.g:1823:1: ( 'configuration' )
            {
            // InternalComponentArchitecture.g:1823:1: ( 'configuration' )
            // InternalComponentArchitecture.g:1824:2: 'configuration'
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
    // InternalComponentArchitecture.g:1833:1: rule__InputHandlerConfigurationMapping__Group__3 : rule__InputHandlerConfigurationMapping__Group__3__Impl rule__InputHandlerConfigurationMapping__Group__4 ;
    public final void rule__InputHandlerConfigurationMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1837:1: ( rule__InputHandlerConfigurationMapping__Group__3__Impl rule__InputHandlerConfigurationMapping__Group__4 )
            // InternalComponentArchitecture.g:1838:2: rule__InputHandlerConfigurationMapping__Group__3__Impl rule__InputHandlerConfigurationMapping__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentArchitecture.g:1845:1: rule__InputHandlerConfigurationMapping__Group__3__Impl : ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1849:1: ( ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1850:1: ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1850:1: ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) )
            // InternalComponentArchitecture.g:1851:2: ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigAssignment_3()); 
            // InternalComponentArchitecture.g:1852:2: ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 )
            // InternalComponentArchitecture.g:1852:3: rule__InputHandlerConfigurationMapping__ConfigAssignment_3
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
    // InternalComponentArchitecture.g:1860:1: rule__InputHandlerConfigurationMapping__Group__4 : rule__InputHandlerConfigurationMapping__Group__4__Impl ;
    public final void rule__InputHandlerConfigurationMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1864:1: ( rule__InputHandlerConfigurationMapping__Group__4__Impl )
            // InternalComponentArchitecture.g:1865:2: rule__InputHandlerConfigurationMapping__Group__4__Impl
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
    // InternalComponentArchitecture.g:1871:1: rule__InputHandlerConfigurationMapping__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1875:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1876:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1876:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1877:2: ( ';' )?
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getSemicolonKeyword_4()); 
            // InternalComponentArchitecture.g:1878:2: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==17) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentArchitecture.g:1878:3: ';'
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
    // InternalComponentArchitecture.g:1887:1: rule__OpcUaDeviceClientInstance__Group__0 : rule__OpcUaDeviceClientInstance__Group__0__Impl rule__OpcUaDeviceClientInstance__Group__1 ;
    public final void rule__OpcUaDeviceClientInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1891:1: ( rule__OpcUaDeviceClientInstance__Group__0__Impl rule__OpcUaDeviceClientInstance__Group__1 )
            // InternalComponentArchitecture.g:1892:2: rule__OpcUaDeviceClientInstance__Group__0__Impl rule__OpcUaDeviceClientInstance__Group__1
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
    // InternalComponentArchitecture.g:1899:1: rule__OpcUaDeviceClientInstance__Group__0__Impl : ( 'OpcUaDeviceClientInstance' ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1903:1: ( ( 'OpcUaDeviceClientInstance' ) )
            // InternalComponentArchitecture.g:1904:1: ( 'OpcUaDeviceClientInstance' )
            {
            // InternalComponentArchitecture.g:1904:1: ( 'OpcUaDeviceClientInstance' )
            // InternalComponentArchitecture.g:1905:2: 'OpcUaDeviceClientInstance'
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
    // InternalComponentArchitecture.g:1914:1: rule__OpcUaDeviceClientInstance__Group__1 : rule__OpcUaDeviceClientInstance__Group__1__Impl rule__OpcUaDeviceClientInstance__Group__2 ;
    public final void rule__OpcUaDeviceClientInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1918:1: ( rule__OpcUaDeviceClientInstance__Group__1__Impl rule__OpcUaDeviceClientInstance__Group__2 )
            // InternalComponentArchitecture.g:1919:2: rule__OpcUaDeviceClientInstance__Group__1__Impl rule__OpcUaDeviceClientInstance__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalComponentArchitecture.g:1926:1: rule__OpcUaDeviceClientInstance__Group__1__Impl : ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1930:1: ( ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1931:1: ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1931:1: ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) )
            // InternalComponentArchitecture.g:1932:2: ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientAssignment_1()); 
            // InternalComponentArchitecture.g:1933:2: ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 )
            // InternalComponentArchitecture.g:1933:3: rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1
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
    // InternalComponentArchitecture.g:1941:1: rule__OpcUaDeviceClientInstance__Group__2 : rule__OpcUaDeviceClientInstance__Group__2__Impl rule__OpcUaDeviceClientInstance__Group__3 ;
    public final void rule__OpcUaDeviceClientInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1945:1: ( rule__OpcUaDeviceClientInstance__Group__2__Impl rule__OpcUaDeviceClientInstance__Group__3 )
            // InternalComponentArchitecture.g:1946:2: rule__OpcUaDeviceClientInstance__Group__2__Impl rule__OpcUaDeviceClientInstance__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentArchitecture.g:1953:1: rule__OpcUaDeviceClientInstance__Group__2__Impl : ( 'deviceURI' ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1957:1: ( ( 'deviceURI' ) )
            // InternalComponentArchitecture.g:1958:1: ( 'deviceURI' )
            {
            // InternalComponentArchitecture.g:1958:1: ( 'deviceURI' )
            // InternalComponentArchitecture.g:1959:2: 'deviceURI'
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
    // InternalComponentArchitecture.g:1968:1: rule__OpcUaDeviceClientInstance__Group__3 : rule__OpcUaDeviceClientInstance__Group__3__Impl rule__OpcUaDeviceClientInstance__Group__4 ;
    public final void rule__OpcUaDeviceClientInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1972:1: ( rule__OpcUaDeviceClientInstance__Group__3__Impl rule__OpcUaDeviceClientInstance__Group__4 )
            // InternalComponentArchitecture.g:1973:2: rule__OpcUaDeviceClientInstance__Group__3__Impl rule__OpcUaDeviceClientInstance__Group__4
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentArchitecture.g:1980:1: rule__OpcUaDeviceClientInstance__Group__3__Impl : ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1984:1: ( ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1985:1: ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1985:1: ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) )
            // InternalComponentArchitecture.g:1986:2: ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIAssignment_3()); 
            // InternalComponentArchitecture.g:1987:2: ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 )
            // InternalComponentArchitecture.g:1987:3: rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3
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
    // InternalComponentArchitecture.g:1995:1: rule__OpcUaDeviceClientInstance__Group__4 : rule__OpcUaDeviceClientInstance__Group__4__Impl ;
    public final void rule__OpcUaDeviceClientInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1999:1: ( rule__OpcUaDeviceClientInstance__Group__4__Impl )
            // InternalComponentArchitecture.g:2000:2: rule__OpcUaDeviceClientInstance__Group__4__Impl
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
    // InternalComponentArchitecture.g:2006:1: rule__OpcUaDeviceClientInstance__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2010:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:2011:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:2011:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:2012:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getSemicolonKeyword_4()); 
            // InternalComponentArchitecture.g:2013:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==17) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentArchitecture.g:2013:3: ';'
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


    // $ANTLR start "rule__OpcUaReadServerInstance__Group__0"
    // InternalComponentArchitecture.g:2022:1: rule__OpcUaReadServerInstance__Group__0 : rule__OpcUaReadServerInstance__Group__0__Impl rule__OpcUaReadServerInstance__Group__1 ;
    public final void rule__OpcUaReadServerInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2026:1: ( rule__OpcUaReadServerInstance__Group__0__Impl rule__OpcUaReadServerInstance__Group__1 )
            // InternalComponentArchitecture.g:2027:2: rule__OpcUaReadServerInstance__Group__0__Impl rule__OpcUaReadServerInstance__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__OpcUaReadServerInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaReadServerInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group__0"


    // $ANTLR start "rule__OpcUaReadServerInstance__Group__0__Impl"
    // InternalComponentArchitecture.g:2034:1: rule__OpcUaReadServerInstance__Group__0__Impl : ( 'OpcUaReadServerInstance' ) ;
    public final void rule__OpcUaReadServerInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2038:1: ( ( 'OpcUaReadServerInstance' ) )
            // InternalComponentArchitecture.g:2039:1: ( 'OpcUaReadServerInstance' )
            {
            // InternalComponentArchitecture.g:2039:1: ( 'OpcUaReadServerInstance' )
            // InternalComponentArchitecture.g:2040:2: 'OpcUaReadServerInstance'
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getOpcUaReadServerInstanceKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getOpcUaReadServerInstanceAccess().getOpcUaReadServerInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group__0__Impl"


    // $ANTLR start "rule__OpcUaReadServerInstance__Group__1"
    // InternalComponentArchitecture.g:2049:1: rule__OpcUaReadServerInstance__Group__1 : rule__OpcUaReadServerInstance__Group__1__Impl rule__OpcUaReadServerInstance__Group__2 ;
    public final void rule__OpcUaReadServerInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2053:1: ( rule__OpcUaReadServerInstance__Group__1__Impl rule__OpcUaReadServerInstance__Group__2 )
            // InternalComponentArchitecture.g:2054:2: rule__OpcUaReadServerInstance__Group__1__Impl rule__OpcUaReadServerInstance__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__OpcUaReadServerInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaReadServerInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group__1"


    // $ANTLR start "rule__OpcUaReadServerInstance__Group__1__Impl"
    // InternalComponentArchitecture.g:2061:1: rule__OpcUaReadServerInstance__Group__1__Impl : ( ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 ) ) ;
    public final void rule__OpcUaReadServerInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2065:1: ( ( ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 ) ) )
            // InternalComponentArchitecture.g:2066:1: ( ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:2066:1: ( ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 ) )
            // InternalComponentArchitecture.g:2067:2: ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 )
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerAssignment_1()); 
            // InternalComponentArchitecture.g:2068:2: ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 )
            // InternalComponentArchitecture.g:2068:3: rule__OpcUaReadServerInstance__ReadServerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaReadServerInstance__ReadServerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group__1__Impl"


    // $ANTLR start "rule__OpcUaReadServerInstance__Group__2"
    // InternalComponentArchitecture.g:2076:1: rule__OpcUaReadServerInstance__Group__2 : rule__OpcUaReadServerInstance__Group__2__Impl rule__OpcUaReadServerInstance__Group__3 ;
    public final void rule__OpcUaReadServerInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2080:1: ( rule__OpcUaReadServerInstance__Group__2__Impl rule__OpcUaReadServerInstance__Group__3 )
            // InternalComponentArchitecture.g:2081:2: rule__OpcUaReadServerInstance__Group__2__Impl rule__OpcUaReadServerInstance__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__OpcUaReadServerInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaReadServerInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group__2"


    // $ANTLR start "rule__OpcUaReadServerInstance__Group__2__Impl"
    // InternalComponentArchitecture.g:2088:1: rule__OpcUaReadServerInstance__Group__2__Impl : ( ( rule__OpcUaReadServerInstance__Group_2__0 )? ) ;
    public final void rule__OpcUaReadServerInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2092:1: ( ( ( rule__OpcUaReadServerInstance__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:2093:1: ( ( rule__OpcUaReadServerInstance__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:2093:1: ( ( rule__OpcUaReadServerInstance__Group_2__0 )? )
            // InternalComponentArchitecture.g:2094:2: ( rule__OpcUaReadServerInstance__Group_2__0 )?
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:2095:2: ( rule__OpcUaReadServerInstance__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentArchitecture.g:2095:3: rule__OpcUaReadServerInstance__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__OpcUaReadServerInstance__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group__2__Impl"


    // $ANTLR start "rule__OpcUaReadServerInstance__Group__3"
    // InternalComponentArchitecture.g:2103:1: rule__OpcUaReadServerInstance__Group__3 : rule__OpcUaReadServerInstance__Group__3__Impl ;
    public final void rule__OpcUaReadServerInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2107:1: ( rule__OpcUaReadServerInstance__Group__3__Impl )
            // InternalComponentArchitecture.g:2108:2: rule__OpcUaReadServerInstance__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaReadServerInstance__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group__3"


    // $ANTLR start "rule__OpcUaReadServerInstance__Group__3__Impl"
    // InternalComponentArchitecture.g:2114:1: rule__OpcUaReadServerInstance__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaReadServerInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2118:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:2119:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:2119:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:2120:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getSemicolonKeyword_3()); 
            // InternalComponentArchitecture.g:2121:2: ( ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==17) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentArchitecture.g:2121:3: ';'
                    {
                    match(input,17,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getOpcUaReadServerInstanceAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group__3__Impl"


    // $ANTLR start "rule__OpcUaReadServerInstance__Group_2__0"
    // InternalComponentArchitecture.g:2130:1: rule__OpcUaReadServerInstance__Group_2__0 : rule__OpcUaReadServerInstance__Group_2__0__Impl rule__OpcUaReadServerInstance__Group_2__1 ;
    public final void rule__OpcUaReadServerInstance__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2134:1: ( rule__OpcUaReadServerInstance__Group_2__0__Impl rule__OpcUaReadServerInstance__Group_2__1 )
            // InternalComponentArchitecture.g:2135:2: rule__OpcUaReadServerInstance__Group_2__0__Impl rule__OpcUaReadServerInstance__Group_2__1
            {
            pushFollow(FOLLOW_23);
            rule__OpcUaReadServerInstance__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__OpcUaReadServerInstance__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group_2__0"


    // $ANTLR start "rule__OpcUaReadServerInstance__Group_2__0__Impl"
    // InternalComponentArchitecture.g:2142:1: rule__OpcUaReadServerInstance__Group_2__0__Impl : ( 'portNumber' ) ;
    public final void rule__OpcUaReadServerInstance__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2146:1: ( ( 'portNumber' ) )
            // InternalComponentArchitecture.g:2147:1: ( 'portNumber' )
            {
            // InternalComponentArchitecture.g:2147:1: ( 'portNumber' )
            // InternalComponentArchitecture.g:2148:2: 'portNumber'
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group_2__0__Impl"


    // $ANTLR start "rule__OpcUaReadServerInstance__Group_2__1"
    // InternalComponentArchitecture.g:2157:1: rule__OpcUaReadServerInstance__Group_2__1 : rule__OpcUaReadServerInstance__Group_2__1__Impl ;
    public final void rule__OpcUaReadServerInstance__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2161:1: ( rule__OpcUaReadServerInstance__Group_2__1__Impl )
            // InternalComponentArchitecture.g:2162:2: rule__OpcUaReadServerInstance__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaReadServerInstance__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group_2__1"


    // $ANTLR start "rule__OpcUaReadServerInstance__Group_2__1__Impl"
    // InternalComponentArchitecture.g:2168:1: rule__OpcUaReadServerInstance__Group_2__1__Impl : ( ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 ) ) ;
    public final void rule__OpcUaReadServerInstance__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2172:1: ( ( ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:2173:1: ( ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:2173:1: ( ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 ) )
            // InternalComponentArchitecture.g:2174:2: ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 )
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberAssignment_2_1()); 
            // InternalComponentArchitecture.g:2175:2: ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 )
            // InternalComponentArchitecture.g:2175:3: rule__OpcUaReadServerInstance__PortNumberAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__OpcUaReadServerInstance__PortNumberAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__Group_2__1__Impl"


    // $ANTLR start "rule__RequiredService__Group__0"
    // InternalComponentArchitecture.g:2184:1: rule__RequiredService__Group__0 : rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 ;
    public final void rule__RequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2188:1: ( rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 )
            // InternalComponentArchitecture.g:2189:2: rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1
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
    // InternalComponentArchitecture.g:2196:1: rule__RequiredService__Group__0__Impl : ( 'RequiredService' ) ;
    public final void rule__RequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2200:1: ( ( 'RequiredService' ) )
            // InternalComponentArchitecture.g:2201:1: ( 'RequiredService' )
            {
            // InternalComponentArchitecture.g:2201:1: ( 'RequiredService' )
            // InternalComponentArchitecture.g:2202:2: 'RequiredService'
            {
             before(grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2211:1: rule__RequiredService__Group__1 : rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 ;
    public final void rule__RequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2215:1: ( rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 )
            // InternalComponentArchitecture.g:2216:2: rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentArchitecture.g:2223:1: rule__RequiredService__Group__1__Impl : ( ( rule__RequiredService__PortAssignment_1 ) ) ;
    public final void rule__RequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2227:1: ( ( ( rule__RequiredService__PortAssignment_1 ) ) )
            // InternalComponentArchitecture.g:2228:1: ( ( rule__RequiredService__PortAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:2228:1: ( ( rule__RequiredService__PortAssignment_1 ) )
            // InternalComponentArchitecture.g:2229:2: ( rule__RequiredService__PortAssignment_1 )
            {
             before(grammarAccess.getRequiredServiceAccess().getPortAssignment_1()); 
            // InternalComponentArchitecture.g:2230:2: ( rule__RequiredService__PortAssignment_1 )
            // InternalComponentArchitecture.g:2230:3: rule__RequiredService__PortAssignment_1
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
    // InternalComponentArchitecture.g:2238:1: rule__RequiredService__Group__2 : rule__RequiredService__Group__2__Impl ;
    public final void rule__RequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2242:1: ( rule__RequiredService__Group__2__Impl )
            // InternalComponentArchitecture.g:2243:2: rule__RequiredService__Group__2__Impl
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
    // InternalComponentArchitecture.g:2249:1: rule__RequiredService__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__RequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2253:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:2254:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:2254:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:2255:2: ( ';' )?
            {
             before(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_2()); 
            // InternalComponentArchitecture.g:2256:2: ( ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==17) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentArchitecture.g:2256:3: ';'
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
    // InternalComponentArchitecture.g:2265:1: rule__ProvidedService__Group__0 : rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1 ;
    public final void rule__ProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2269:1: ( rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1 )
            // InternalComponentArchitecture.g:2270:2: rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1
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
    // InternalComponentArchitecture.g:2277:1: rule__ProvidedService__Group__0__Impl : ( 'ProvidedService' ) ;
    public final void rule__ProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2281:1: ( ( 'ProvidedService' ) )
            // InternalComponentArchitecture.g:2282:1: ( 'ProvidedService' )
            {
            // InternalComponentArchitecture.g:2282:1: ( 'ProvidedService' )
            // InternalComponentArchitecture.g:2283:2: 'ProvidedService'
            {
             before(grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2292:1: rule__ProvidedService__Group__1 : rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2 ;
    public final void rule__ProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2296:1: ( rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2 )
            // InternalComponentArchitecture.g:2297:2: rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2
            {
            pushFollow(FOLLOW_18);
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
    // InternalComponentArchitecture.g:2304:1: rule__ProvidedService__Group__1__Impl : ( ( rule__ProvidedService__PortAssignment_1 ) ) ;
    public final void rule__ProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2308:1: ( ( ( rule__ProvidedService__PortAssignment_1 ) ) )
            // InternalComponentArchitecture.g:2309:1: ( ( rule__ProvidedService__PortAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:2309:1: ( ( rule__ProvidedService__PortAssignment_1 ) )
            // InternalComponentArchitecture.g:2310:2: ( rule__ProvidedService__PortAssignment_1 )
            {
             before(grammarAccess.getProvidedServiceAccess().getPortAssignment_1()); 
            // InternalComponentArchitecture.g:2311:2: ( rule__ProvidedService__PortAssignment_1 )
            // InternalComponentArchitecture.g:2311:3: rule__ProvidedService__PortAssignment_1
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
    // InternalComponentArchitecture.g:2319:1: rule__ProvidedService__Group__2 : rule__ProvidedService__Group__2__Impl ;
    public final void rule__ProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2323:1: ( rule__ProvidedService__Group__2__Impl )
            // InternalComponentArchitecture.g:2324:2: rule__ProvidedService__Group__2__Impl
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
    // InternalComponentArchitecture.g:2330:1: rule__ProvidedService__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2334:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:2335:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:2335:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:2336:2: ( ';' )?
            {
             before(grammarAccess.getProvidedServiceAccess().getSemicolonKeyword_2()); 
            // InternalComponentArchitecture.g:2337:2: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentArchitecture.g:2337:3: ';'
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


    // $ANTLR start "rule__CoordinationModuleMapping__Group__0"
    // InternalComponentArchitecture.g:2346:1: rule__CoordinationModuleMapping__Group__0 : rule__CoordinationModuleMapping__Group__0__Impl rule__CoordinationModuleMapping__Group__1 ;
    public final void rule__CoordinationModuleMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2350:1: ( rule__CoordinationModuleMapping__Group__0__Impl rule__CoordinationModuleMapping__Group__1 )
            // InternalComponentArchitecture.g:2351:2: rule__CoordinationModuleMapping__Group__0__Impl rule__CoordinationModuleMapping__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__CoordinationModuleMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__0"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__0__Impl"
    // InternalComponentArchitecture.g:2358:1: rule__CoordinationModuleMapping__Group__0__Impl : ( 'CoordinationModuleMapping' ) ;
    public final void rule__CoordinationModuleMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2362:1: ( ( 'CoordinationModuleMapping' ) )
            // InternalComponentArchitecture.g:2363:1: ( 'CoordinationModuleMapping' )
            {
            // InternalComponentArchitecture.g:2363:1: ( 'CoordinationModuleMapping' )
            // InternalComponentArchitecture.g:2364:2: 'CoordinationModuleMapping'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordinationModuleMappingKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleMappingAccess().getCoordinationModuleMappingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__0__Impl"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__1"
    // InternalComponentArchitecture.g:2373:1: rule__CoordinationModuleMapping__Group__1 : rule__CoordinationModuleMapping__Group__1__Impl rule__CoordinationModuleMapping__Group__2 ;
    public final void rule__CoordinationModuleMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2377:1: ( rule__CoordinationModuleMapping__Group__1__Impl rule__CoordinationModuleMapping__Group__2 )
            // InternalComponentArchitecture.g:2378:2: rule__CoordinationModuleMapping__Group__1__Impl rule__CoordinationModuleMapping__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__CoordinationModuleMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__1"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__1__Impl"
    // InternalComponentArchitecture.g:2385:1: rule__CoordinationModuleMapping__Group__1__Impl : ( '{' ) ;
    public final void rule__CoordinationModuleMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2389:1: ( ( '{' ) )
            // InternalComponentArchitecture.g:2390:1: ( '{' )
            {
            // InternalComponentArchitecture.g:2390:1: ( '{' )
            // InternalComponentArchitecture.g:2391:2: '{'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__1__Impl"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__2"
    // InternalComponentArchitecture.g:2400:1: rule__CoordinationModuleMapping__Group__2 : rule__CoordinationModuleMapping__Group__2__Impl rule__CoordinationModuleMapping__Group__3 ;
    public final void rule__CoordinationModuleMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2404:1: ( rule__CoordinationModuleMapping__Group__2__Impl rule__CoordinationModuleMapping__Group__3 )
            // InternalComponentArchitecture.g:2405:2: rule__CoordinationModuleMapping__Group__2__Impl rule__CoordinationModuleMapping__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CoordinationModuleMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__2"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__2__Impl"
    // InternalComponentArchitecture.g:2412:1: rule__CoordinationModuleMapping__Group__2__Impl : ( 'moduleInstance' ) ;
    public final void rule__CoordinationModuleMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2416:1: ( ( 'moduleInstance' ) )
            // InternalComponentArchitecture.g:2417:1: ( 'moduleInstance' )
            {
            // InternalComponentArchitecture.g:2417:1: ( 'moduleInstance' )
            // InternalComponentArchitecture.g:2418:2: 'moduleInstance'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getModuleInstanceKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleMappingAccess().getModuleInstanceKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__2__Impl"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__3"
    // InternalComponentArchitecture.g:2427:1: rule__CoordinationModuleMapping__Group__3 : rule__CoordinationModuleMapping__Group__3__Impl rule__CoordinationModuleMapping__Group__4 ;
    public final void rule__CoordinationModuleMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2431:1: ( rule__CoordinationModuleMapping__Group__3__Impl rule__CoordinationModuleMapping__Group__4 )
            // InternalComponentArchitecture.g:2432:2: rule__CoordinationModuleMapping__Group__3__Impl rule__CoordinationModuleMapping__Group__4
            {
            pushFollow(FOLLOW_25);
            rule__CoordinationModuleMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__3"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__3__Impl"
    // InternalComponentArchitecture.g:2439:1: rule__CoordinationModuleMapping__Group__3__Impl : ( ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 ) ) ;
    public final void rule__CoordinationModuleMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2443:1: ( ( ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 ) ) )
            // InternalComponentArchitecture.g:2444:1: ( ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:2444:1: ( ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 ) )
            // InternalComponentArchitecture.g:2445:2: ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAssignment_3()); 
            // InternalComponentArchitecture.g:2446:2: ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 )
            // InternalComponentArchitecture.g:2446:3: rule__CoordinationModuleMapping__CoordModuleInstAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__CoordModuleInstAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__3__Impl"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__4"
    // InternalComponentArchitecture.g:2454:1: rule__CoordinationModuleMapping__Group__4 : rule__CoordinationModuleMapping__Group__4__Impl rule__CoordinationModuleMapping__Group__5 ;
    public final void rule__CoordinationModuleMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2458:1: ( rule__CoordinationModuleMapping__Group__4__Impl rule__CoordinationModuleMapping__Group__5 )
            // InternalComponentArchitecture.g:2459:2: rule__CoordinationModuleMapping__Group__4__Impl rule__CoordinationModuleMapping__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__CoordinationModuleMapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__4"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__4__Impl"
    // InternalComponentArchitecture.g:2466:1: rule__CoordinationModuleMapping__Group__4__Impl : ( 'realizedby' ) ;
    public final void rule__CoordinationModuleMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2470:1: ( ( 'realizedby' ) )
            // InternalComponentArchitecture.g:2471:1: ( 'realizedby' )
            {
            // InternalComponentArchitecture.g:2471:1: ( 'realizedby' )
            // InternalComponentArchitecture.g:2472:2: 'realizedby'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getRealizedbyKeyword_4()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleMappingAccess().getRealizedbyKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__4__Impl"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__5"
    // InternalComponentArchitecture.g:2481:1: rule__CoordinationModuleMapping__Group__5 : rule__CoordinationModuleMapping__Group__5__Impl rule__CoordinationModuleMapping__Group__6 ;
    public final void rule__CoordinationModuleMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2485:1: ( rule__CoordinationModuleMapping__Group__5__Impl rule__CoordinationModuleMapping__Group__6 )
            // InternalComponentArchitecture.g:2486:2: rule__CoordinationModuleMapping__Group__5__Impl rule__CoordinationModuleMapping__Group__6
            {
            pushFollow(FOLLOW_14);
            rule__CoordinationModuleMapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__5"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__5__Impl"
    // InternalComponentArchitecture.g:2493:1: rule__CoordinationModuleMapping__Group__5__Impl : ( ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 ) ) ;
    public final void rule__CoordinationModuleMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2497:1: ( ( ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 ) ) )
            // InternalComponentArchitecture.g:2498:1: ( ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 ) )
            {
            // InternalComponentArchitecture.g:2498:1: ( ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 ) )
            // InternalComponentArchitecture.g:2499:2: ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealAssignment_5()); 
            // InternalComponentArchitecture.g:2500:2: ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 )
            // InternalComponentArchitecture.g:2500:3: rule__CoordinationModuleMapping__CoordModRealAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__CoordModRealAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__5__Impl"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__6"
    // InternalComponentArchitecture.g:2508:1: rule__CoordinationModuleMapping__Group__6 : rule__CoordinationModuleMapping__Group__6__Impl rule__CoordinationModuleMapping__Group__7 ;
    public final void rule__CoordinationModuleMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2512:1: ( rule__CoordinationModuleMapping__Group__6__Impl rule__CoordinationModuleMapping__Group__7 )
            // InternalComponentArchitecture.g:2513:2: rule__CoordinationModuleMapping__Group__6__Impl rule__CoordinationModuleMapping__Group__7
            {
            pushFollow(FOLLOW_26);
            rule__CoordinationModuleMapping__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__6"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__6__Impl"
    // InternalComponentArchitecture.g:2520:1: rule__CoordinationModuleMapping__Group__6__Impl : ( '{' ) ;
    public final void rule__CoordinationModuleMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2524:1: ( ( '{' ) )
            // InternalComponentArchitecture.g:2525:1: ( '{' )
            {
            // InternalComponentArchitecture.g:2525:1: ( '{' )
            // InternalComponentArchitecture.g:2526:2: '{'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__6__Impl"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__7"
    // InternalComponentArchitecture.g:2535:1: rule__CoordinationModuleMapping__Group__7 : rule__CoordinationModuleMapping__Group__7__Impl rule__CoordinationModuleMapping__Group__8 ;
    public final void rule__CoordinationModuleMapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2539:1: ( rule__CoordinationModuleMapping__Group__7__Impl rule__CoordinationModuleMapping__Group__8 )
            // InternalComponentArchitecture.g:2540:2: rule__CoordinationModuleMapping__Group__7__Impl rule__CoordinationModuleMapping__Group__8
            {
            pushFollow(FOLLOW_27);
            rule__CoordinationModuleMapping__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__7"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__7__Impl"
    // InternalComponentArchitecture.g:2547:1: rule__CoordinationModuleMapping__Group__7__Impl : ( ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) ) ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* ) ) ;
    public final void rule__CoordinationModuleMapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2551:1: ( ( ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) ) ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* ) ) )
            // InternalComponentArchitecture.g:2552:1: ( ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) ) ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* ) )
            {
            // InternalComponentArchitecture.g:2552:1: ( ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) ) ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* ) )
            // InternalComponentArchitecture.g:2553:2: ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) ) ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* )
            {
            // InternalComponentArchitecture.g:2553:2: ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) )
            // InternalComponentArchitecture.g:2554:3: ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7()); 
            // InternalComponentArchitecture.g:2555:3: ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )
            // InternalComponentArchitecture.g:2555:4: rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7
            {
            pushFollow(FOLLOW_28);
            rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7()); 

            }

            // InternalComponentArchitecture.g:2558:2: ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* )
            // InternalComponentArchitecture.g:2559:3: ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )*
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7()); 
            // InternalComponentArchitecture.g:2560:3: ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==34) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComponentArchitecture.g:2560:4: rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7()); 

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
    // $ANTLR end "rule__CoordinationModuleMapping__Group__7__Impl"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__8"
    // InternalComponentArchitecture.g:2569:1: rule__CoordinationModuleMapping__Group__8 : rule__CoordinationModuleMapping__Group__8__Impl rule__CoordinationModuleMapping__Group__9 ;
    public final void rule__CoordinationModuleMapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2573:1: ( rule__CoordinationModuleMapping__Group__8__Impl rule__CoordinationModuleMapping__Group__9 )
            // InternalComponentArchitecture.g:2574:2: rule__CoordinationModuleMapping__Group__8__Impl rule__CoordinationModuleMapping__Group__9
            {
            pushFollow(FOLLOW_27);
            rule__CoordinationModuleMapping__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__8"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__8__Impl"
    // InternalComponentArchitecture.g:2581:1: rule__CoordinationModuleMapping__Group__8__Impl : ( '}' ) ;
    public final void rule__CoordinationModuleMapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2585:1: ( ( '}' ) )
            // InternalComponentArchitecture.g:2586:1: ( '}' )
            {
            // InternalComponentArchitecture.g:2586:1: ( '}' )
            // InternalComponentArchitecture.g:2587:2: '}'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_8()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__8__Impl"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__9"
    // InternalComponentArchitecture.g:2596:1: rule__CoordinationModuleMapping__Group__9 : rule__CoordinationModuleMapping__Group__9__Impl ;
    public final void rule__CoordinationModuleMapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2600:1: ( rule__CoordinationModuleMapping__Group__9__Impl )
            // InternalComponentArchitecture.g:2601:2: rule__CoordinationModuleMapping__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationModuleMapping__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__9"


    // $ANTLR start "rule__CoordinationModuleMapping__Group__9__Impl"
    // InternalComponentArchitecture.g:2607:1: rule__CoordinationModuleMapping__Group__9__Impl : ( '}' ) ;
    public final void rule__CoordinationModuleMapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2611:1: ( ( '}' ) )
            // InternalComponentArchitecture.g:2612:1: ( '}' )
            {
            // InternalComponentArchitecture.g:2612:1: ( '}' )
            // InternalComponentArchitecture.g:2613:2: '}'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_9()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__Group__9__Impl"


    // $ANTLR start "rule__CoordinationInterfaceComponentInstanceMapping__Group__0"
    // InternalComponentArchitecture.g:2623:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__0 : rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__1 ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2627:1: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__1 )
            // InternalComponentArchitecture.g:2628:2: rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationInterfaceComponentInstanceMapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationInterfaceComponentInstanceMapping__Group__0"


    // $ANTLR start "rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl"
    // InternalComponentArchitecture.g:2635:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl : ( 'interfaceInstance' ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2639:1: ( ( 'interfaceInstance' ) )
            // InternalComponentArchitecture.g:2640:1: ( 'interfaceInstance' )
            {
            // InternalComponentArchitecture.g:2640:1: ( 'interfaceInstance' )
            // InternalComponentArchitecture.g:2641:2: 'interfaceInstance'
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getInterfaceInstanceKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getInterfaceInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl"


    // $ANTLR start "rule__CoordinationInterfaceComponentInstanceMapping__Group__1"
    // InternalComponentArchitecture.g:2650:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__1 : rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__2 ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2654:1: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__2 )
            // InternalComponentArchitecture.g:2655:2: rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__2
            {
            pushFollow(FOLLOW_25);
            rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationInterfaceComponentInstanceMapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationInterfaceComponentInstanceMapping__Group__1"


    // $ANTLR start "rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl"
    // InternalComponentArchitecture.g:2662:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl : ( ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 ) ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2666:1: ( ( ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 ) ) )
            // InternalComponentArchitecture.g:2667:1: ( ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:2667:1: ( ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 ) )
            // InternalComponentArchitecture.g:2668:2: ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 )
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstAssignment_1()); 
            // InternalComponentArchitecture.g:2669:2: ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 )
            // InternalComponentArchitecture.g:2669:3: rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl"


    // $ANTLR start "rule__CoordinationInterfaceComponentInstanceMapping__Group__2"
    // InternalComponentArchitecture.g:2677:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__2 : rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__3 ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2681:1: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__3 )
            // InternalComponentArchitecture.g:2682:2: rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CoordinationInterfaceComponentInstanceMapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationInterfaceComponentInstanceMapping__Group__2"


    // $ANTLR start "rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl"
    // InternalComponentArchitecture.g:2689:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl : ( 'realizedby' ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2693:1: ( ( 'realizedby' ) )
            // InternalComponentArchitecture.g:2694:1: ( 'realizedby' )
            {
            // InternalComponentArchitecture.g:2694:1: ( 'realizedby' )
            // InternalComponentArchitecture.g:2695:2: 'realizedby'
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getRealizedbyKeyword_2()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getRealizedbyKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl"


    // $ANTLR start "rule__CoordinationInterfaceComponentInstanceMapping__Group__3"
    // InternalComponentArchitecture.g:2704:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__3 : rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2708:1: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl )
            // InternalComponentArchitecture.g:2709:2: rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationInterfaceComponentInstanceMapping__Group__3"


    // $ANTLR start "rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl"
    // InternalComponentArchitecture.g:2715:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl : ( ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 ) ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2719:1: ( ( ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 ) ) )
            // InternalComponentArchitecture.g:2720:1: ( ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:2720:1: ( ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 ) )
            // InternalComponentArchitecture.g:2721:2: ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 )
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstAssignment_3()); 
            // InternalComponentArchitecture.g:2722:2: ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 )
            // InternalComponentArchitecture.g:2722:3: rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl"


    // $ANTLR start "rule__TaskRealizationModelRef__Group__0"
    // InternalComponentArchitecture.g:2731:1: rule__TaskRealizationModelRef__Group__0 : rule__TaskRealizationModelRef__Group__0__Impl rule__TaskRealizationModelRef__Group__1 ;
    public final void rule__TaskRealizationModelRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2735:1: ( rule__TaskRealizationModelRef__Group__0__Impl rule__TaskRealizationModelRef__Group__1 )
            // InternalComponentArchitecture.g:2736:2: rule__TaskRealizationModelRef__Group__0__Impl rule__TaskRealizationModelRef__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__TaskRealizationModelRef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TaskRealizationModelRef__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModelRef__Group__0"


    // $ANTLR start "rule__TaskRealizationModelRef__Group__0__Impl"
    // InternalComponentArchitecture.g:2743:1: rule__TaskRealizationModelRef__Group__0__Impl : ( 'BehaviorTaskRef' ) ;
    public final void rule__TaskRealizationModelRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2747:1: ( ( 'BehaviorTaskRef' ) )
            // InternalComponentArchitecture.g:2748:1: ( 'BehaviorTaskRef' )
            {
            // InternalComponentArchitecture.g:2748:1: ( 'BehaviorTaskRef' )
            // InternalComponentArchitecture.g:2749:2: 'BehaviorTaskRef'
            {
             before(grammarAccess.getTaskRealizationModelRefAccess().getBehaviorTaskRefKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getTaskRealizationModelRefAccess().getBehaviorTaskRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModelRef__Group__0__Impl"


    // $ANTLR start "rule__TaskRealizationModelRef__Group__1"
    // InternalComponentArchitecture.g:2758:1: rule__TaskRealizationModelRef__Group__1 : rule__TaskRealizationModelRef__Group__1__Impl ;
    public final void rule__TaskRealizationModelRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2762:1: ( rule__TaskRealizationModelRef__Group__1__Impl )
            // InternalComponentArchitecture.g:2763:2: rule__TaskRealizationModelRef__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TaskRealizationModelRef__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModelRef__Group__1"


    // $ANTLR start "rule__TaskRealizationModelRef__Group__1__Impl"
    // InternalComponentArchitecture.g:2769:1: rule__TaskRealizationModelRef__Group__1__Impl : ( ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 ) ) ;
    public final void rule__TaskRealizationModelRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2773:1: ( ( ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 ) ) )
            // InternalComponentArchitecture.g:2774:1: ( ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:2774:1: ( ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 ) )
            // InternalComponentArchitecture.g:2775:2: ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 )
            {
             before(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefAssignment_1()); 
            // InternalComponentArchitecture.g:2776:2: ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 )
            // InternalComponentArchitecture.g:2776:3: rule__TaskRealizationModelRef__TaskModelRefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TaskRealizationModelRef__TaskModelRefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModelRef__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalComponentArchitecture.g:2785:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2789:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalComponentArchitecture.g:2790:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalComponentArchitecture.g:2797:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2801:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:2802:1: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:2802:1: ( RULE_ID )
            // InternalComponentArchitecture.g:2803:2: RULE_ID
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
    // InternalComponentArchitecture.g:2812:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2816:1: ( rule__FQN__Group__1__Impl )
            // InternalComponentArchitecture.g:2817:2: rule__FQN__Group__1__Impl
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
    // InternalComponentArchitecture.g:2823:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2827:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalComponentArchitecture.g:2828:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalComponentArchitecture.g:2828:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalComponentArchitecture.g:2829:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalComponentArchitecture.g:2830:2: ( rule__FQN__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalComponentArchitecture.g:2830:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalComponentArchitecture.g:2839:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2843:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalComponentArchitecture.g:2844:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalComponentArchitecture.g:2851:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2855:1: ( ( '.' ) )
            // InternalComponentArchitecture.g:2856:1: ( '.' )
            {
            // InternalComponentArchitecture.g:2856:1: ( '.' )
            // InternalComponentArchitecture.g:2857:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2866:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2870:1: ( rule__FQN__Group_1__1__Impl )
            // InternalComponentArchitecture.g:2871:2: rule__FQN__Group_1__1__Impl
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
    // InternalComponentArchitecture.g:2877:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2881:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:2882:1: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:2882:1: ( RULE_ID )
            // InternalComponentArchitecture.g:2883:2: RULE_ID
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
    // InternalComponentArchitecture.g:2893:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2897:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalComponentArchitecture.g:2898:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalComponentArchitecture.g:2905:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2909:1: ( ( ( '-' )? ) )
            // InternalComponentArchitecture.g:2910:1: ( ( '-' )? )
            {
            // InternalComponentArchitecture.g:2910:1: ( ( '-' )? )
            // InternalComponentArchitecture.g:2911:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalComponentArchitecture.g:2912:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentArchitecture.g:2912:3: '-'
                    {
                    match(input,37,FOLLOW_2); 

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
    // InternalComponentArchitecture.g:2920:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2924:1: ( rule__EInt__Group__1__Impl )
            // InternalComponentArchitecture.g:2925:2: rule__EInt__Group__1__Impl
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
    // InternalComponentArchitecture.g:2931:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2935:1: ( ( RULE_INT ) )
            // InternalComponentArchitecture.g:2936:1: ( RULE_INT )
            {
            // InternalComponentArchitecture.g:2936:1: ( RULE_INT )
            // InternalComponentArchitecture.g:2937:2: RULE_INT
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


    // $ANTLR start "rule__ACE_SmartSoft__Group__0"
    // InternalComponentArchitecture.g:2947:1: rule__ACE_SmartSoft__Group__0 : rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 ;
    public final void rule__ACE_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2951:1: ( rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 )
            // InternalComponentArchitecture.g:2952:2: rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalComponentArchitecture.g:2959:1: rule__ACE_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__ACE_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2963:1: ( ( () ) )
            // InternalComponentArchitecture.g:2964:1: ( () )
            {
            // InternalComponentArchitecture.g:2964:1: ( () )
            // InternalComponentArchitecture.g:2965:2: ()
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); 
            // InternalComponentArchitecture.g:2966:2: ()
            // InternalComponentArchitecture.g:2966:3: 
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
    // InternalComponentArchitecture.g:2974:1: rule__ACE_SmartSoft__Group__1 : rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 ;
    public final void rule__ACE_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2978:1: ( rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 )
            // InternalComponentArchitecture.g:2979:2: rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalComponentArchitecture.g:2986:1: rule__ACE_SmartSoft__Group__1__Impl : ( 'ACE_SmartSoft' ) ;
    public final void rule__ACE_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2990:1: ( ( 'ACE_SmartSoft' ) )
            // InternalComponentArchitecture.g:2991:1: ( 'ACE_SmartSoft' )
            {
            // InternalComponentArchitecture.g:2991:1: ( 'ACE_SmartSoft' )
            // InternalComponentArchitecture.g:2992:2: 'ACE_SmartSoft'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3001:1: rule__ACE_SmartSoft__Group__2 : rule__ACE_SmartSoft__Group__2__Impl ;
    public final void rule__ACE_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3005:1: ( rule__ACE_SmartSoft__Group__2__Impl )
            // InternalComponentArchitecture.g:3006:2: rule__ACE_SmartSoft__Group__2__Impl
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
    // InternalComponentArchitecture.g:3012:1: rule__ACE_SmartSoft__Group__2__Impl : ( ( rule__ACE_SmartSoft__Group_2__0 )? ) ;
    public final void rule__ACE_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3016:1: ( ( ( rule__ACE_SmartSoft__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:3017:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:3017:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            // InternalComponentArchitecture.g:3018:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:3019:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==39) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentArchitecture.g:3019:3: rule__ACE_SmartSoft__Group_2__0
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
    // InternalComponentArchitecture.g:3028:1: rule__ACE_SmartSoft__Group_2__0 : rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 ;
    public final void rule__ACE_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3032:1: ( rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 )
            // InternalComponentArchitecture.g:3033:2: rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentArchitecture.g:3040:1: rule__ACE_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__ACE_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3044:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:3045:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:3045:1: ( 'description' )
            // InternalComponentArchitecture.g:3046:2: 'description'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3055:1: rule__ACE_SmartSoft__Group_2__1 : rule__ACE_SmartSoft__Group_2__1__Impl ;
    public final void rule__ACE_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3059:1: ( rule__ACE_SmartSoft__Group_2__1__Impl )
            // InternalComponentArchitecture.g:3060:2: rule__ACE_SmartSoft__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:3066:1: rule__ACE_SmartSoft__Group_2__1__Impl : ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__ACE_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3070:1: ( ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:3071:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:3071:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:3072:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:3073:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:3073:3: rule__ACE_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentArchitecture.g:3082:1: rule__OpcUa_SeRoNet__Group__0 : rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 ;
    public final void rule__OpcUa_SeRoNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3086:1: ( rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 )
            // InternalComponentArchitecture.g:3087:2: rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalComponentArchitecture.g:3094:1: rule__OpcUa_SeRoNet__Group__0__Impl : ( () ) ;
    public final void rule__OpcUa_SeRoNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3098:1: ( ( () ) )
            // InternalComponentArchitecture.g:3099:1: ( () )
            {
            // InternalComponentArchitecture.g:3099:1: ( () )
            // InternalComponentArchitecture.g:3100:2: ()
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); 
            // InternalComponentArchitecture.g:3101:2: ()
            // InternalComponentArchitecture.g:3101:3: 
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
    // InternalComponentArchitecture.g:3109:1: rule__OpcUa_SeRoNet__Group__1 : rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 ;
    public final void rule__OpcUa_SeRoNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3113:1: ( rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 )
            // InternalComponentArchitecture.g:3114:2: rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalComponentArchitecture.g:3121:1: rule__OpcUa_SeRoNet__Group__1__Impl : ( 'OpcUa_SeRoNet' ) ;
    public final void rule__OpcUa_SeRoNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3125:1: ( ( 'OpcUa_SeRoNet' ) )
            // InternalComponentArchitecture.g:3126:1: ( 'OpcUa_SeRoNet' )
            {
            // InternalComponentArchitecture.g:3126:1: ( 'OpcUa_SeRoNet' )
            // InternalComponentArchitecture.g:3127:2: 'OpcUa_SeRoNet'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3136:1: rule__OpcUa_SeRoNet__Group__2 : rule__OpcUa_SeRoNet__Group__2__Impl ;
    public final void rule__OpcUa_SeRoNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3140:1: ( rule__OpcUa_SeRoNet__Group__2__Impl )
            // InternalComponentArchitecture.g:3141:2: rule__OpcUa_SeRoNet__Group__2__Impl
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
    // InternalComponentArchitecture.g:3147:1: rule__OpcUa_SeRoNet__Group__2__Impl : ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) ;
    public final void rule__OpcUa_SeRoNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3151:1: ( ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:3152:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:3152:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            // InternalComponentArchitecture.g:3153:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:3154:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentArchitecture.g:3154:3: rule__OpcUa_SeRoNet__Group_2__0
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
    // InternalComponentArchitecture.g:3163:1: rule__OpcUa_SeRoNet__Group_2__0 : rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 ;
    public final void rule__OpcUa_SeRoNet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3167:1: ( rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 )
            // InternalComponentArchitecture.g:3168:2: rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentArchitecture.g:3175:1: rule__OpcUa_SeRoNet__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3179:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:3180:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:3180:1: ( 'description' )
            // InternalComponentArchitecture.g:3181:2: 'description'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3190:1: rule__OpcUa_SeRoNet__Group_2__1 : rule__OpcUa_SeRoNet__Group_2__1__Impl ;
    public final void rule__OpcUa_SeRoNet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3194:1: ( rule__OpcUa_SeRoNet__Group_2__1__Impl )
            // InternalComponentArchitecture.g:3195:2: rule__OpcUa_SeRoNet__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:3201:1: rule__OpcUa_SeRoNet__Group_2__1__Impl : ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3205:1: ( ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:3206:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:3206:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:3207:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:3208:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:3208:3: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1
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
    // InternalComponentArchitecture.g:3217:1: rule__CORBA_SmartSoft__Group__0 : rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 ;
    public final void rule__CORBA_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3221:1: ( rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 )
            // InternalComponentArchitecture.g:3222:2: rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalComponentArchitecture.g:3229:1: rule__CORBA_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__CORBA_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3233:1: ( ( () ) )
            // InternalComponentArchitecture.g:3234:1: ( () )
            {
            // InternalComponentArchitecture.g:3234:1: ( () )
            // InternalComponentArchitecture.g:3235:2: ()
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); 
            // InternalComponentArchitecture.g:3236:2: ()
            // InternalComponentArchitecture.g:3236:3: 
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
    // InternalComponentArchitecture.g:3244:1: rule__CORBA_SmartSoft__Group__1 : rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 ;
    public final void rule__CORBA_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3248:1: ( rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 )
            // InternalComponentArchitecture.g:3249:2: rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalComponentArchitecture.g:3256:1: rule__CORBA_SmartSoft__Group__1__Impl : ( 'CORBA_SmartSoft' ) ;
    public final void rule__CORBA_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3260:1: ( ( 'CORBA_SmartSoft' ) )
            // InternalComponentArchitecture.g:3261:1: ( 'CORBA_SmartSoft' )
            {
            // InternalComponentArchitecture.g:3261:1: ( 'CORBA_SmartSoft' )
            // InternalComponentArchitecture.g:3262:2: 'CORBA_SmartSoft'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3271:1: rule__CORBA_SmartSoft__Group__2 : rule__CORBA_SmartSoft__Group__2__Impl ;
    public final void rule__CORBA_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3275:1: ( rule__CORBA_SmartSoft__Group__2__Impl )
            // InternalComponentArchitecture.g:3276:2: rule__CORBA_SmartSoft__Group__2__Impl
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
    // InternalComponentArchitecture.g:3282:1: rule__CORBA_SmartSoft__Group__2__Impl : ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) ;
    public final void rule__CORBA_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3286:1: ( ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:3287:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:3287:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            // InternalComponentArchitecture.g:3288:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:3289:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentArchitecture.g:3289:3: rule__CORBA_SmartSoft__Group_2__0
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
    // InternalComponentArchitecture.g:3298:1: rule__CORBA_SmartSoft__Group_2__0 : rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 ;
    public final void rule__CORBA_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3302:1: ( rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 )
            // InternalComponentArchitecture.g:3303:2: rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentArchitecture.g:3310:1: rule__CORBA_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__CORBA_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3314:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:3315:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:3315:1: ( 'description' )
            // InternalComponentArchitecture.g:3316:2: 'description'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3325:1: rule__CORBA_SmartSoft__Group_2__1 : rule__CORBA_SmartSoft__Group_2__1__Impl ;
    public final void rule__CORBA_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3329:1: ( rule__CORBA_SmartSoft__Group_2__1__Impl )
            // InternalComponentArchitecture.g:3330:2: rule__CORBA_SmartSoft__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:3336:1: rule__CORBA_SmartSoft__Group_2__1__Impl : ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__CORBA_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3340:1: ( ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:3341:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:3341:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:3342:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:3343:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:3343:3: rule__CORBA_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentArchitecture.g:3352:1: rule__DDS_SmartSoft__Group__0 : rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 ;
    public final void rule__DDS_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3356:1: ( rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 )
            // InternalComponentArchitecture.g:3357:2: rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalComponentArchitecture.g:3364:1: rule__DDS_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__DDS_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3368:1: ( ( () ) )
            // InternalComponentArchitecture.g:3369:1: ( () )
            {
            // InternalComponentArchitecture.g:3369:1: ( () )
            // InternalComponentArchitecture.g:3370:2: ()
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); 
            // InternalComponentArchitecture.g:3371:2: ()
            // InternalComponentArchitecture.g:3371:3: 
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
    // InternalComponentArchitecture.g:3379:1: rule__DDS_SmartSoft__Group__1 : rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 ;
    public final void rule__DDS_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3383:1: ( rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 )
            // InternalComponentArchitecture.g:3384:2: rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_32);
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
    // InternalComponentArchitecture.g:3391:1: rule__DDS_SmartSoft__Group__1__Impl : ( 'DDS_SmartSoft' ) ;
    public final void rule__DDS_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3395:1: ( ( 'DDS_SmartSoft' ) )
            // InternalComponentArchitecture.g:3396:1: ( 'DDS_SmartSoft' )
            {
            // InternalComponentArchitecture.g:3396:1: ( 'DDS_SmartSoft' )
            // InternalComponentArchitecture.g:3397:2: 'DDS_SmartSoft'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3406:1: rule__DDS_SmartSoft__Group__2 : rule__DDS_SmartSoft__Group__2__Impl ;
    public final void rule__DDS_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3410:1: ( rule__DDS_SmartSoft__Group__2__Impl )
            // InternalComponentArchitecture.g:3411:2: rule__DDS_SmartSoft__Group__2__Impl
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
    // InternalComponentArchitecture.g:3417:1: rule__DDS_SmartSoft__Group__2__Impl : ( ( rule__DDS_SmartSoft__Group_2__0 )? ) ;
    public final void rule__DDS_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3421:1: ( ( ( rule__DDS_SmartSoft__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:3422:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:3422:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            // InternalComponentArchitecture.g:3423:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:3424:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==39) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentArchitecture.g:3424:3: rule__DDS_SmartSoft__Group_2__0
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
    // InternalComponentArchitecture.g:3433:1: rule__DDS_SmartSoft__Group_2__0 : rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 ;
    public final void rule__DDS_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3437:1: ( rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 )
            // InternalComponentArchitecture.g:3438:2: rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalComponentArchitecture.g:3445:1: rule__DDS_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__DDS_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3449:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:3450:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:3450:1: ( 'description' )
            // InternalComponentArchitecture.g:3451:2: 'description'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3460:1: rule__DDS_SmartSoft__Group_2__1 : rule__DDS_SmartSoft__Group_2__1__Impl ;
    public final void rule__DDS_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3464:1: ( rule__DDS_SmartSoft__Group_2__1__Impl )
            // InternalComponentArchitecture.g:3465:2: rule__DDS_SmartSoft__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:3471:1: rule__DDS_SmartSoft__Group_2__1__Impl : ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__DDS_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3475:1: ( ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:3476:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:3476:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:3477:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:3478:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:3478:3: rule__DDS_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentArchitecture.g:3487:1: rule__SystemComponentArchitecture__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SystemComponentArchitecture__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3491:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3492:2: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:3492:2: ( RULE_ID )
            // InternalComponentArchitecture.g:3493:3: RULE_ID
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
    // InternalComponentArchitecture.g:3502:1: rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__SystemComponentArchitecture__ActivityArchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3506:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3507:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3507:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3508:3: ( ruleFQN )
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelCrossReference_3_1_0()); 
            // InternalComponentArchitecture.g:3509:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3510:4: ruleFQN
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
    // InternalComponentArchitecture.g:3521:1: rule__SystemComponentArchitecture__ComponentsAssignment_5 : ( ruleComponentInstance ) ;
    public final void rule__SystemComponentArchitecture__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3525:1: ( ( ruleComponentInstance ) )
            // InternalComponentArchitecture.g:3526:2: ( ruleComponentInstance )
            {
            // InternalComponentArchitecture.g:3526:2: ( ruleComponentInstance )
            // InternalComponentArchitecture.g:3527:3: ruleComponentInstance
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
    // InternalComponentArchitecture.g:3536:1: rule__SystemComponentArchitecture__ConnectionsAssignment_6 : ( ruleConnection ) ;
    public final void rule__SystemComponentArchitecture__ConnectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3540:1: ( ( ruleConnection ) )
            // InternalComponentArchitecture.g:3541:2: ( ruleConnection )
            {
            // InternalComponentArchitecture.g:3541:2: ( ruleConnection )
            // InternalComponentArchitecture.g:3542:3: ruleConnection
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


    // $ANTLR start "rule__SystemComponentArchitecture__ExtensionsAssignment_7"
    // InternalComponentArchitecture.g:3551:1: rule__SystemComponentArchitecture__ExtensionsAssignment_7 : ( ruleSystemExtension ) ;
    public final void rule__SystemComponentArchitecture__ExtensionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3555:1: ( ( ruleSystemExtension ) )
            // InternalComponentArchitecture.g:3556:2: ( ruleSystemExtension )
            {
            // InternalComponentArchitecture.g:3556:2: ( ruleSystemExtension )
            // InternalComponentArchitecture.g:3557:3: ruleSystemExtension
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsSystemExtensionParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleSystemExtension();

            state._fsp--;

             after(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsSystemExtensionParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemComponentArchitecture__ExtensionsAssignment_7"


    // $ANTLR start "rule__Connection__FromAssignment_1"
    // InternalComponentArchitecture.g:3566:1: rule__Connection__FromAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Connection__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3570:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3571:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3571:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3572:3: ( ruleFQN )
            {
             before(grammarAccess.getConnectionAccess().getFromRequiredServiceCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3573:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3574:4: ruleFQN
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
    // InternalComponentArchitecture.g:3585:1: rule__Connection__ToAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Connection__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3589:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3590:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3590:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3591:3: ( ruleFQN )
            {
             before(grammarAccess.getConnectionAccess().getToProvidedServiceCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3592:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3593:4: ruleFQN
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
    // InternalComponentArchitecture.g:3604:1: rule__Connection__MiddlewareSelectionAssignment_4_1 : ( ruleRoboticMiddleware ) ;
    public final void rule__Connection__MiddlewareSelectionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3608:1: ( ( ruleRoboticMiddleware ) )
            // InternalComponentArchitecture.g:3609:2: ( ruleRoboticMiddleware )
            {
            // InternalComponentArchitecture.g:3609:2: ( ruleRoboticMiddleware )
            // InternalComponentArchitecture.g:3610:3: ruleRoboticMiddleware
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
    // InternalComponentArchitecture.g:3619:1: rule__ComponentInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3623:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3624:2: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:3624:2: ( RULE_ID )
            // InternalComponentArchitecture.g:3625:3: RULE_ID
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
    // InternalComponentArchitecture.g:3634:1: rule__ComponentInstance__ComponentAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentInstance__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3638:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3639:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3639:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3640:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3641:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3642:4: ruleFQN
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
    // InternalComponentArchitecture.g:3653:1: rule__ComponentInstance__PortsAssignment_5 : ( ruleServiceInstance ) ;
    public final void rule__ComponentInstance__PortsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3657:1: ( ( ruleServiceInstance ) )
            // InternalComponentArchitecture.g:3658:2: ( ruleServiceInstance )
            {
            // InternalComponentArchitecture.g:3658:2: ( ruleServiceInstance )
            // InternalComponentArchitecture.g:3659:3: ruleServiceInstance
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
    // InternalComponentArchitecture.g:3668:1: rule__ComponentInstance__ExtensionsAssignment_6 : ( ruleComponentInstanceExtension ) ;
    public final void rule__ComponentInstance__ExtensionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3672:1: ( ( ruleComponentInstanceExtension ) )
            // InternalComponentArchitecture.g:3673:2: ( ruleComponentInstanceExtension )
            {
            // InternalComponentArchitecture.g:3673:2: ( ruleComponentInstanceExtension )
            // InternalComponentArchitecture.g:3674:3: ruleComponentInstanceExtension
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
    // InternalComponentArchitecture.g:3683:1: rule__ParameterStructInstance__ParameterAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterStructInstance__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3687:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3688:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3688:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3689:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3690:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3691:4: ruleFQN
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
    // InternalComponentArchitecture.g:3702:1: rule__ActivityConfigurationMapping__ActivityAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ActivityConfigurationMapping__ActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3706:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3707:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3707:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3708:3: ( ruleFQN )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3709:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3710:4: ruleFQN
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
    // InternalComponentArchitecture.g:3721:1: rule__ActivityConfigurationMapping__ConfigAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__ActivityConfigurationMapping__ConfigAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3725:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3726:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3726:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3727:3: ( ruleFQN )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3728:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3729:4: ruleFQN
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
    // InternalComponentArchitecture.g:3740:1: rule__InputHandlerConfigurationMapping__HandlerAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__InputHandlerConfigurationMapping__HandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3744:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3745:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3745:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3746:3: ( ruleFQN )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3747:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3748:4: ruleFQN
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
    // InternalComponentArchitecture.g:3759:1: rule__InputHandlerConfigurationMapping__ConfigAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__InputHandlerConfigurationMapping__ConfigAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3763:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3764:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3764:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3765:3: ( ruleFQN )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3766:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3767:4: ruleFQN
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
    // InternalComponentArchitecture.g:3778:1: rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3782:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3783:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3783:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3784:3: ( ruleFQN )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3785:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3786:4: ruleFQN
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
    // InternalComponentArchitecture.g:3797:1: rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 : ( ruleEString ) ;
    public final void rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3801:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:3802:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:3802:2: ( ruleEString )
            // InternalComponentArchitecture.g:3803:3: ruleEString
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


    // $ANTLR start "rule__OpcUaReadServerInstance__ReadServerAssignment_1"
    // InternalComponentArchitecture.g:3812:1: rule__OpcUaReadServerInstance__ReadServerAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__OpcUaReadServerInstance__ReadServerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3816:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3817:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3817:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3818:3: ( ruleFQN )
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerOpcUaReadServerCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3819:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3820:4: ruleFQN
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerOpcUaReadServerFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerOpcUaReadServerFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerOpcUaReadServerCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__ReadServerAssignment_1"


    // $ANTLR start "rule__OpcUaReadServerInstance__PortNumberAssignment_2_1"
    // InternalComponentArchitecture.g:3831:1: rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__OpcUaReadServerInstance__PortNumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3835:1: ( ( ruleEInt ) )
            // InternalComponentArchitecture.g:3836:2: ( ruleEInt )
            {
            // InternalComponentArchitecture.g:3836:2: ( ruleEInt )
            // InternalComponentArchitecture.g:3837:3: ruleEInt
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberEIntParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberEIntParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OpcUaReadServerInstance__PortNumberAssignment_2_1"


    // $ANTLR start "rule__RequiredService__PortAssignment_1"
    // InternalComponentArchitecture.g:3846:1: rule__RequiredService__PortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3850:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:3851:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:3851:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3852:3: ( RULE_ID )
            {
             before(grammarAccess.getRequiredServiceAccess().getPortComponentPortCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3853:3: ( RULE_ID )
            // InternalComponentArchitecture.g:3854:4: RULE_ID
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
    // InternalComponentArchitecture.g:3865:1: rule__ProvidedService__PortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedService__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3869:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:3870:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:3870:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3871:3: ( RULE_ID )
            {
             before(grammarAccess.getProvidedServiceAccess().getPortComponentPortCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3872:3: ( RULE_ID )
            // InternalComponentArchitecture.g:3873:4: RULE_ID
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


    // $ANTLR start "rule__CoordinationModuleMapping__CoordModuleInstAssignment_3"
    // InternalComponentArchitecture.g:3884:1: rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CoordinationModuleMapping__CoordModuleInstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3888:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3889:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3889:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3890:3: ( ruleFQN )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAbstractCoordinationModuleInstanceCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3891:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3892:4: ruleFQN
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAbstractCoordinationModuleInstanceFQNParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAbstractCoordinationModuleInstanceFQNParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAbstractCoordinationModuleInstanceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__CoordModuleInstAssignment_3"


    // $ANTLR start "rule__CoordinationModuleMapping__CoordModRealAssignment_5"
    // InternalComponentArchitecture.g:3903:1: rule__CoordinationModuleMapping__CoordModRealAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__CoordinationModuleMapping__CoordModRealAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3907:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:3908:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:3908:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3909:3: ( RULE_ID )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealCoordinationModuleRealizationCrossReference_5_0()); 
            // InternalComponentArchitecture.g:3910:3: ( RULE_ID )
            // InternalComponentArchitecture.g:3911:4: RULE_ID
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealCoordinationModuleRealizationIDTerminalRuleCall_5_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealCoordinationModuleRealizationIDTerminalRuleCall_5_0_1()); 

            }

             after(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealCoordinationModuleRealizationCrossReference_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__CoordModRealAssignment_5"


    // $ANTLR start "rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7"
    // InternalComponentArchitecture.g:3922:1: rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 : ( ruleCoordinationInterfaceComponentInstanceMapping ) ;
    public final void rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3926:1: ( ( ruleCoordinationInterfaceComponentInstanceMapping ) )
            // InternalComponentArchitecture.g:3927:2: ( ruleCoordinationInterfaceComponentInstanceMapping )
            {
            // InternalComponentArchitecture.g:3927:2: ( ruleCoordinationInterfaceComponentInstanceMapping )
            // InternalComponentArchitecture.g:3928:3: ruleCoordinationInterfaceComponentInstanceMapping
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingCoordinationInterfaceComponentInstanceMappingParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleCoordinationInterfaceComponentInstanceMapping();

            state._fsp--;

             after(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingCoordinationInterfaceComponentInstanceMappingParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7"


    // $ANTLR start "rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1"
    // InternalComponentArchitecture.g:3937:1: rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3941:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:3942:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:3942:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3943:3: ( RULE_ID )
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3944:3: ( RULE_ID )
            // InternalComponentArchitecture.g:3945:4: RULE_ID
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1"


    // $ANTLR start "rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3"
    // InternalComponentArchitecture.g:3956:1: rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3960:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:3961:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:3961:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3962:3: ( RULE_ID )
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3963:3: ( RULE_ID )
            // InternalComponentArchitecture.g:3964:4: RULE_ID
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3"


    // $ANTLR start "rule__TaskRealizationModelRef__TaskModelRefAssignment_1"
    // InternalComponentArchitecture.g:3975:1: rule__TaskRealizationModelRef__TaskModelRefAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__TaskRealizationModelRef__TaskModelRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3979:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3980:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3980:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3981:3: ( ruleFQN )
            {
             before(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3982:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3983:4: ruleFQN
            {
             before(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TaskRealizationModelRef__TaskModelRefAssignment_1"


    // $ANTLR start "rule__ACE_SmartSoft__DescriptionAssignment_2_1"
    // InternalComponentArchitecture.g:3994:1: rule__ACE_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ACE_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3998:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:3999:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:3999:2: ( ruleEString )
            // InternalComponentArchitecture.g:4000:3: ruleEString
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
    // InternalComponentArchitecture.g:4009:1: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpcUa_SeRoNet__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:4013:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:4014:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:4014:2: ( ruleEString )
            // InternalComponentArchitecture.g:4015:3: ruleEString
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
    // InternalComponentArchitecture.g:4024:1: rule__CORBA_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CORBA_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:4028:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:4029:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:4029:2: ( ruleEString )
            // InternalComponentArchitecture.g:4030:3: ruleEString
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
    // InternalComponentArchitecture.g:4039:1: rule__DDS_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DDS_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:4043:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:4044:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:4044:2: ( ruleEString )
            // InternalComponentArchitecture.g:4045:3: ruleEString
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
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000088008A000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000880000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000074000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000006B602000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000B600002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000020000000000L});

}