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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_DOCU_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'SystemComponentArchitecture'", "'{'", "'}'", "'usingActivityArchitecture'", "'Connection'", "'->'", "';'", "'useMiddleware'", "'ComponentInstance'", "'instantiates'", "'ParameterStructInstance'", "'Activity'", "'configuration'", "'InputHandler'", "'OpcUaDeviceClientInstance'", "'deviceURI'", "'OpcUaReadServerInstance'", "'portNumber'", "'RequiredService'", "'ProvidedService'", "'CoordinationModuleMapping'", "'moduleInstance'", "'realizedby'", "'interfaceInstance'", "'BehaviorTaskRef'", "'.'", "'-'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int RULE_ML_DOCUMENTATION=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int RULE_DOCU_COMMENT=11;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=10;
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
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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
    // InternalComponentArchitecture.g:68:1: entryRuleSystemComponentArchitecture : ruleSystemComponentArchitecture EOF ;
    public final void entryRuleSystemComponentArchitecture() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:69:1: ( ruleSystemComponentArchitecture EOF )
            // InternalComponentArchitecture.g:70:1: ruleSystemComponentArchitecture EOF
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
    // InternalComponentArchitecture.g:77:1: ruleSystemComponentArchitecture : ( ( rule__SystemComponentArchitecture__Group__0 ) ) ;
    public final void ruleSystemComponentArchitecture() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:81:2: ( ( ( rule__SystemComponentArchitecture__Group__0 ) ) )
            // InternalComponentArchitecture.g:82:2: ( ( rule__SystemComponentArchitecture__Group__0 ) )
            {
            // InternalComponentArchitecture.g:82:2: ( ( rule__SystemComponentArchitecture__Group__0 ) )
            // InternalComponentArchitecture.g:83:3: ( rule__SystemComponentArchitecture__Group__0 )
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getGroup()); 
            // InternalComponentArchitecture.g:84:3: ( rule__SystemComponentArchitecture__Group__0 )
            // InternalComponentArchitecture.g:84:4: rule__SystemComponentArchitecture__Group__0
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
    // InternalComponentArchitecture.g:93:1: entryRuleSystemExtension : ruleSystemExtension EOF ;
    public final void entryRuleSystemExtension() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:94:1: ( ruleSystemExtension EOF )
            // InternalComponentArchitecture.g:95:1: ruleSystemExtension EOF
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
    // InternalComponentArchitecture.g:102:1: ruleSystemExtension : ( ( rule__SystemExtension__Alternatives ) ) ;
    public final void ruleSystemExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:106:2: ( ( ( rule__SystemExtension__Alternatives ) ) )
            // InternalComponentArchitecture.g:107:2: ( ( rule__SystemExtension__Alternatives ) )
            {
            // InternalComponentArchitecture.g:107:2: ( ( rule__SystemExtension__Alternatives ) )
            // InternalComponentArchitecture.g:108:3: ( rule__SystemExtension__Alternatives )
            {
             before(grammarAccess.getSystemExtensionAccess().getAlternatives()); 
            // InternalComponentArchitecture.g:109:3: ( rule__SystemExtension__Alternatives )
            // InternalComponentArchitecture.g:109:4: rule__SystemExtension__Alternatives
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
    // InternalComponentArchitecture.g:118:1: entryRuleConnection : ruleConnection EOF ;
    public final void entryRuleConnection() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:119:1: ( ruleConnection EOF )
            // InternalComponentArchitecture.g:120:1: ruleConnection EOF
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
    // InternalComponentArchitecture.g:127:1: ruleConnection : ( ( rule__Connection__Group__0 ) ) ;
    public final void ruleConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:131:2: ( ( ( rule__Connection__Group__0 ) ) )
            // InternalComponentArchitecture.g:132:2: ( ( rule__Connection__Group__0 ) )
            {
            // InternalComponentArchitecture.g:132:2: ( ( rule__Connection__Group__0 ) )
            // InternalComponentArchitecture.g:133:3: ( rule__Connection__Group__0 )
            {
             before(grammarAccess.getConnectionAccess().getGroup()); 
            // InternalComponentArchitecture.g:134:3: ( rule__Connection__Group__0 )
            // InternalComponentArchitecture.g:134:4: rule__Connection__Group__0
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
    // InternalComponentArchitecture.g:143:1: entryRuleComponentInstance : ruleComponentInstance EOF ;
    public final void entryRuleComponentInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:144:1: ( ruleComponentInstance EOF )
            // InternalComponentArchitecture.g:145:1: ruleComponentInstance EOF
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
    // InternalComponentArchitecture.g:152:1: ruleComponentInstance : ( ( rule__ComponentInstance__Group__0 ) ) ;
    public final void ruleComponentInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:156:2: ( ( ( rule__ComponentInstance__Group__0 ) ) )
            // InternalComponentArchitecture.g:157:2: ( ( rule__ComponentInstance__Group__0 ) )
            {
            // InternalComponentArchitecture.g:157:2: ( ( rule__ComponentInstance__Group__0 ) )
            // InternalComponentArchitecture.g:158:3: ( rule__ComponentInstance__Group__0 )
            {
             before(grammarAccess.getComponentInstanceAccess().getGroup()); 
            // InternalComponentArchitecture.g:159:3: ( rule__ComponentInstance__Group__0 )
            // InternalComponentArchitecture.g:159:4: rule__ComponentInstance__Group__0
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
    // InternalComponentArchitecture.g:168:1: entryRuleComponentInstanceExtension : ruleComponentInstanceExtension EOF ;
    public final void entryRuleComponentInstanceExtension() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:169:1: ( ruleComponentInstanceExtension EOF )
            // InternalComponentArchitecture.g:170:1: ruleComponentInstanceExtension EOF
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
    // InternalComponentArchitecture.g:177:1: ruleComponentInstanceExtension : ( ( rule__ComponentInstanceExtension__Alternatives ) ) ;
    public final void ruleComponentInstanceExtension() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:181:2: ( ( ( rule__ComponentInstanceExtension__Alternatives ) ) )
            // InternalComponentArchitecture.g:182:2: ( ( rule__ComponentInstanceExtension__Alternatives ) )
            {
            // InternalComponentArchitecture.g:182:2: ( ( rule__ComponentInstanceExtension__Alternatives ) )
            // InternalComponentArchitecture.g:183:3: ( rule__ComponentInstanceExtension__Alternatives )
            {
             before(grammarAccess.getComponentInstanceExtensionAccess().getAlternatives()); 
            // InternalComponentArchitecture.g:184:3: ( rule__ComponentInstanceExtension__Alternatives )
            // InternalComponentArchitecture.g:184:4: rule__ComponentInstanceExtension__Alternatives
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
    // InternalComponentArchitecture.g:193:1: entryRuleParameterStructInstance : ruleParameterStructInstance EOF ;
    public final void entryRuleParameterStructInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:194:1: ( ruleParameterStructInstance EOF )
            // InternalComponentArchitecture.g:195:1: ruleParameterStructInstance EOF
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
    // InternalComponentArchitecture.g:202:1: ruleParameterStructInstance : ( ( rule__ParameterStructInstance__Group__0 ) ) ;
    public final void ruleParameterStructInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:206:2: ( ( ( rule__ParameterStructInstance__Group__0 ) ) )
            // InternalComponentArchitecture.g:207:2: ( ( rule__ParameterStructInstance__Group__0 ) )
            {
            // InternalComponentArchitecture.g:207:2: ( ( rule__ParameterStructInstance__Group__0 ) )
            // InternalComponentArchitecture.g:208:3: ( rule__ParameterStructInstance__Group__0 )
            {
             before(grammarAccess.getParameterStructInstanceAccess().getGroup()); 
            // InternalComponentArchitecture.g:209:3: ( rule__ParameterStructInstance__Group__0 )
            // InternalComponentArchitecture.g:209:4: rule__ParameterStructInstance__Group__0
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
    // InternalComponentArchitecture.g:218:1: entryRuleActivityConfigurationMapping : ruleActivityConfigurationMapping EOF ;
    public final void entryRuleActivityConfigurationMapping() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:219:1: ( ruleActivityConfigurationMapping EOF )
            // InternalComponentArchitecture.g:220:1: ruleActivityConfigurationMapping EOF
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
    // InternalComponentArchitecture.g:227:1: ruleActivityConfigurationMapping : ( ( rule__ActivityConfigurationMapping__Group__0 ) ) ;
    public final void ruleActivityConfigurationMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:231:2: ( ( ( rule__ActivityConfigurationMapping__Group__0 ) ) )
            // InternalComponentArchitecture.g:232:2: ( ( rule__ActivityConfigurationMapping__Group__0 ) )
            {
            // InternalComponentArchitecture.g:232:2: ( ( rule__ActivityConfigurationMapping__Group__0 ) )
            // InternalComponentArchitecture.g:233:3: ( rule__ActivityConfigurationMapping__Group__0 )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getGroup()); 
            // InternalComponentArchitecture.g:234:3: ( rule__ActivityConfigurationMapping__Group__0 )
            // InternalComponentArchitecture.g:234:4: rule__ActivityConfigurationMapping__Group__0
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
    // InternalComponentArchitecture.g:243:1: entryRuleInputHandlerConfigurationMapping : ruleInputHandlerConfigurationMapping EOF ;
    public final void entryRuleInputHandlerConfigurationMapping() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:244:1: ( ruleInputHandlerConfigurationMapping EOF )
            // InternalComponentArchitecture.g:245:1: ruleInputHandlerConfigurationMapping EOF
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
    // InternalComponentArchitecture.g:252:1: ruleInputHandlerConfigurationMapping : ( ( rule__InputHandlerConfigurationMapping__Group__0 ) ) ;
    public final void ruleInputHandlerConfigurationMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:256:2: ( ( ( rule__InputHandlerConfigurationMapping__Group__0 ) ) )
            // InternalComponentArchitecture.g:257:2: ( ( rule__InputHandlerConfigurationMapping__Group__0 ) )
            {
            // InternalComponentArchitecture.g:257:2: ( ( rule__InputHandlerConfigurationMapping__Group__0 ) )
            // InternalComponentArchitecture.g:258:3: ( rule__InputHandlerConfigurationMapping__Group__0 )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getGroup()); 
            // InternalComponentArchitecture.g:259:3: ( rule__InputHandlerConfigurationMapping__Group__0 )
            // InternalComponentArchitecture.g:259:4: rule__InputHandlerConfigurationMapping__Group__0
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
    // InternalComponentArchitecture.g:268:1: entryRuleOpcUaDeviceClientInstance : ruleOpcUaDeviceClientInstance EOF ;
    public final void entryRuleOpcUaDeviceClientInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:269:1: ( ruleOpcUaDeviceClientInstance EOF )
            // InternalComponentArchitecture.g:270:1: ruleOpcUaDeviceClientInstance EOF
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
    // InternalComponentArchitecture.g:277:1: ruleOpcUaDeviceClientInstance : ( ( rule__OpcUaDeviceClientInstance__Group__0 ) ) ;
    public final void ruleOpcUaDeviceClientInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:281:2: ( ( ( rule__OpcUaDeviceClientInstance__Group__0 ) ) )
            // InternalComponentArchitecture.g:282:2: ( ( rule__OpcUaDeviceClientInstance__Group__0 ) )
            {
            // InternalComponentArchitecture.g:282:2: ( ( rule__OpcUaDeviceClientInstance__Group__0 ) )
            // InternalComponentArchitecture.g:283:3: ( rule__OpcUaDeviceClientInstance__Group__0 )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getGroup()); 
            // InternalComponentArchitecture.g:284:3: ( rule__OpcUaDeviceClientInstance__Group__0 )
            // InternalComponentArchitecture.g:284:4: rule__OpcUaDeviceClientInstance__Group__0
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
    // InternalComponentArchitecture.g:293:1: entryRuleOpcUaReadServerInstance : ruleOpcUaReadServerInstance EOF ;
    public final void entryRuleOpcUaReadServerInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:294:1: ( ruleOpcUaReadServerInstance EOF )
            // InternalComponentArchitecture.g:295:1: ruleOpcUaReadServerInstance EOF
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
    // InternalComponentArchitecture.g:302:1: ruleOpcUaReadServerInstance : ( ( rule__OpcUaReadServerInstance__Group__0 ) ) ;
    public final void ruleOpcUaReadServerInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:306:2: ( ( ( rule__OpcUaReadServerInstance__Group__0 ) ) )
            // InternalComponentArchitecture.g:307:2: ( ( rule__OpcUaReadServerInstance__Group__0 ) )
            {
            // InternalComponentArchitecture.g:307:2: ( ( rule__OpcUaReadServerInstance__Group__0 ) )
            // InternalComponentArchitecture.g:308:3: ( rule__OpcUaReadServerInstance__Group__0 )
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup()); 
            // InternalComponentArchitecture.g:309:3: ( rule__OpcUaReadServerInstance__Group__0 )
            // InternalComponentArchitecture.g:309:4: rule__OpcUaReadServerInstance__Group__0
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
    // InternalComponentArchitecture.g:318:1: entryRuleServiceInstance : ruleServiceInstance EOF ;
    public final void entryRuleServiceInstance() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:319:1: ( ruleServiceInstance EOF )
            // InternalComponentArchitecture.g:320:1: ruleServiceInstance EOF
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
    // InternalComponentArchitecture.g:327:1: ruleServiceInstance : ( ( rule__ServiceInstance__Alternatives ) ) ;
    public final void ruleServiceInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:331:2: ( ( ( rule__ServiceInstance__Alternatives ) ) )
            // InternalComponentArchitecture.g:332:2: ( ( rule__ServiceInstance__Alternatives ) )
            {
            // InternalComponentArchitecture.g:332:2: ( ( rule__ServiceInstance__Alternatives ) )
            // InternalComponentArchitecture.g:333:3: ( rule__ServiceInstance__Alternatives )
            {
             before(grammarAccess.getServiceInstanceAccess().getAlternatives()); 
            // InternalComponentArchitecture.g:334:3: ( rule__ServiceInstance__Alternatives )
            // InternalComponentArchitecture.g:334:4: rule__ServiceInstance__Alternatives
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
    // InternalComponentArchitecture.g:343:1: entryRuleRequiredService : ruleRequiredService EOF ;
    public final void entryRuleRequiredService() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:344:1: ( ruleRequiredService EOF )
            // InternalComponentArchitecture.g:345:1: ruleRequiredService EOF
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
    // InternalComponentArchitecture.g:352:1: ruleRequiredService : ( ( rule__RequiredService__Group__0 ) ) ;
    public final void ruleRequiredService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:356:2: ( ( ( rule__RequiredService__Group__0 ) ) )
            // InternalComponentArchitecture.g:357:2: ( ( rule__RequiredService__Group__0 ) )
            {
            // InternalComponentArchitecture.g:357:2: ( ( rule__RequiredService__Group__0 ) )
            // InternalComponentArchitecture.g:358:3: ( rule__RequiredService__Group__0 )
            {
             before(grammarAccess.getRequiredServiceAccess().getGroup()); 
            // InternalComponentArchitecture.g:359:3: ( rule__RequiredService__Group__0 )
            // InternalComponentArchitecture.g:359:4: rule__RequiredService__Group__0
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
    // InternalComponentArchitecture.g:368:1: entryRuleProvidedService : ruleProvidedService EOF ;
    public final void entryRuleProvidedService() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:369:1: ( ruleProvidedService EOF )
            // InternalComponentArchitecture.g:370:1: ruleProvidedService EOF
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
    // InternalComponentArchitecture.g:377:1: ruleProvidedService : ( ( rule__ProvidedService__Group__0 ) ) ;
    public final void ruleProvidedService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:381:2: ( ( ( rule__ProvidedService__Group__0 ) ) )
            // InternalComponentArchitecture.g:382:2: ( ( rule__ProvidedService__Group__0 ) )
            {
            // InternalComponentArchitecture.g:382:2: ( ( rule__ProvidedService__Group__0 ) )
            // InternalComponentArchitecture.g:383:3: ( rule__ProvidedService__Group__0 )
            {
             before(grammarAccess.getProvidedServiceAccess().getGroup()); 
            // InternalComponentArchitecture.g:384:3: ( rule__ProvidedService__Group__0 )
            // InternalComponentArchitecture.g:384:4: rule__ProvidedService__Group__0
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
    // InternalComponentArchitecture.g:393:1: entryRuleCoordinationModuleMapping : ruleCoordinationModuleMapping EOF ;
    public final void entryRuleCoordinationModuleMapping() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:394:1: ( ruleCoordinationModuleMapping EOF )
            // InternalComponentArchitecture.g:395:1: ruleCoordinationModuleMapping EOF
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
    // InternalComponentArchitecture.g:402:1: ruleCoordinationModuleMapping : ( ( rule__CoordinationModuleMapping__Group__0 ) ) ;
    public final void ruleCoordinationModuleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:406:2: ( ( ( rule__CoordinationModuleMapping__Group__0 ) ) )
            // InternalComponentArchitecture.g:407:2: ( ( rule__CoordinationModuleMapping__Group__0 ) )
            {
            // InternalComponentArchitecture.g:407:2: ( ( rule__CoordinationModuleMapping__Group__0 ) )
            // InternalComponentArchitecture.g:408:3: ( rule__CoordinationModuleMapping__Group__0 )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getGroup()); 
            // InternalComponentArchitecture.g:409:3: ( rule__CoordinationModuleMapping__Group__0 )
            // InternalComponentArchitecture.g:409:4: rule__CoordinationModuleMapping__Group__0
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
    // InternalComponentArchitecture.g:418:1: entryRuleCoordinationInterfaceComponentInstanceMapping : ruleCoordinationInterfaceComponentInstanceMapping EOF ;
    public final void entryRuleCoordinationInterfaceComponentInstanceMapping() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:419:1: ( ruleCoordinationInterfaceComponentInstanceMapping EOF )
            // InternalComponentArchitecture.g:420:1: ruleCoordinationInterfaceComponentInstanceMapping EOF
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
    // InternalComponentArchitecture.g:427:1: ruleCoordinationInterfaceComponentInstanceMapping : ( ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 ) ) ;
    public final void ruleCoordinationInterfaceComponentInstanceMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:431:2: ( ( ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 ) ) )
            // InternalComponentArchitecture.g:432:2: ( ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 ) )
            {
            // InternalComponentArchitecture.g:432:2: ( ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 ) )
            // InternalComponentArchitecture.g:433:3: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 )
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getGroup()); 
            // InternalComponentArchitecture.g:434:3: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0 )
            // InternalComponentArchitecture.g:434:4: rule__CoordinationInterfaceComponentInstanceMapping__Group__0
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
    // InternalComponentArchitecture.g:443:1: entryRuleTaskRealizationModelRef : ruleTaskRealizationModelRef EOF ;
    public final void entryRuleTaskRealizationModelRef() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:444:1: ( ruleTaskRealizationModelRef EOF )
            // InternalComponentArchitecture.g:445:1: ruleTaskRealizationModelRef EOF
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
    // InternalComponentArchitecture.g:452:1: ruleTaskRealizationModelRef : ( ( rule__TaskRealizationModelRef__Group__0 ) ) ;
    public final void ruleTaskRealizationModelRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:456:2: ( ( ( rule__TaskRealizationModelRef__Group__0 ) ) )
            // InternalComponentArchitecture.g:457:2: ( ( rule__TaskRealizationModelRef__Group__0 ) )
            {
            // InternalComponentArchitecture.g:457:2: ( ( rule__TaskRealizationModelRef__Group__0 ) )
            // InternalComponentArchitecture.g:458:3: ( rule__TaskRealizationModelRef__Group__0 )
            {
             before(grammarAccess.getTaskRealizationModelRefAccess().getGroup()); 
            // InternalComponentArchitecture.g:459:3: ( rule__TaskRealizationModelRef__Group__0 )
            // InternalComponentArchitecture.g:459:4: rule__TaskRealizationModelRef__Group__0
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
    // InternalComponentArchitecture.g:468:1: entryRuleRoboticMiddleware : ruleRoboticMiddleware EOF ;
    public final void entryRuleRoboticMiddleware() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:469:1: ( ruleRoboticMiddleware EOF )
            // InternalComponentArchitecture.g:470:1: ruleRoboticMiddleware EOF
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
    // InternalComponentArchitecture.g:477:1: ruleRoboticMiddleware : ( ( rule__RoboticMiddleware__Alternatives ) ) ;
    public final void ruleRoboticMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:481:2: ( ( ( rule__RoboticMiddleware__Alternatives ) ) )
            // InternalComponentArchitecture.g:482:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            {
            // InternalComponentArchitecture.g:482:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            // InternalComponentArchitecture.g:483:3: ( rule__RoboticMiddleware__Alternatives )
            {
             before(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); 
            // InternalComponentArchitecture.g:484:3: ( rule__RoboticMiddleware__Alternatives )
            // InternalComponentArchitecture.g:484:4: rule__RoboticMiddleware__Alternatives
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
    // InternalComponentArchitecture.g:493:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:494:1: ( ruleFQN EOF )
            // InternalComponentArchitecture.g:495:1: ruleFQN EOF
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
    // InternalComponentArchitecture.g:502:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:506:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalComponentArchitecture.g:507:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalComponentArchitecture.g:507:2: ( ( rule__FQN__Group__0 ) )
            // InternalComponentArchitecture.g:508:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalComponentArchitecture.g:509:3: ( rule__FQN__Group__0 )
            // InternalComponentArchitecture.g:509:4: rule__FQN__Group__0
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
    // InternalComponentArchitecture.g:518:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:519:1: ( ruleEString EOF )
            // InternalComponentArchitecture.g:520:1: ruleEString EOF
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
    // InternalComponentArchitecture.g:527:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:531:2: ( ( RULE_STRING ) )
            // InternalComponentArchitecture.g:532:2: ( RULE_STRING )
            {
            // InternalComponentArchitecture.g:532:2: ( RULE_STRING )
            // InternalComponentArchitecture.g:533:3: RULE_STRING
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
    // InternalComponentArchitecture.g:543:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:544:1: ( ruleEInt EOF )
            // InternalComponentArchitecture.g:545:1: ruleEInt EOF
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
    // InternalComponentArchitecture.g:552:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:556:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalComponentArchitecture.g:557:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalComponentArchitecture.g:557:2: ( ( rule__EInt__Group__0 ) )
            // InternalComponentArchitecture.g:558:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalComponentArchitecture.g:559:3: ( rule__EInt__Group__0 )
            // InternalComponentArchitecture.g:559:4: rule__EInt__Group__0
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
    // InternalComponentArchitecture.g:568:1: entryRuleACE_SmartSoft : ruleACE_SmartSoft EOF ;
    public final void entryRuleACE_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:569:1: ( ruleACE_SmartSoft EOF )
            // InternalComponentArchitecture.g:570:1: ruleACE_SmartSoft EOF
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
    // InternalComponentArchitecture.g:577:1: ruleACE_SmartSoft : ( ( rule__ACE_SmartSoft__Group__0 ) ) ;
    public final void ruleACE_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:581:2: ( ( ( rule__ACE_SmartSoft__Group__0 ) ) )
            // InternalComponentArchitecture.g:582:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            {
            // InternalComponentArchitecture.g:582:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            // InternalComponentArchitecture.g:583:3: ( rule__ACE_SmartSoft__Group__0 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup()); 
            // InternalComponentArchitecture.g:584:3: ( rule__ACE_SmartSoft__Group__0 )
            // InternalComponentArchitecture.g:584:4: rule__ACE_SmartSoft__Group__0
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
    // InternalComponentArchitecture.g:593:1: entryRuleOpcUa_SeRoNet : ruleOpcUa_SeRoNet EOF ;
    public final void entryRuleOpcUa_SeRoNet() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:594:1: ( ruleOpcUa_SeRoNet EOF )
            // InternalComponentArchitecture.g:595:1: ruleOpcUa_SeRoNet EOF
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
    // InternalComponentArchitecture.g:602:1: ruleOpcUa_SeRoNet : ( ( rule__OpcUa_SeRoNet__Group__0 ) ) ;
    public final void ruleOpcUa_SeRoNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:606:2: ( ( ( rule__OpcUa_SeRoNet__Group__0 ) ) )
            // InternalComponentArchitecture.g:607:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            {
            // InternalComponentArchitecture.g:607:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            // InternalComponentArchitecture.g:608:3: ( rule__OpcUa_SeRoNet__Group__0 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); 
            // InternalComponentArchitecture.g:609:3: ( rule__OpcUa_SeRoNet__Group__0 )
            // InternalComponentArchitecture.g:609:4: rule__OpcUa_SeRoNet__Group__0
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
    // InternalComponentArchitecture.g:618:1: entryRuleCORBA_SmartSoft : ruleCORBA_SmartSoft EOF ;
    public final void entryRuleCORBA_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:619:1: ( ruleCORBA_SmartSoft EOF )
            // InternalComponentArchitecture.g:620:1: ruleCORBA_SmartSoft EOF
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
    // InternalComponentArchitecture.g:627:1: ruleCORBA_SmartSoft : ( ( rule__CORBA_SmartSoft__Group__0 ) ) ;
    public final void ruleCORBA_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:631:2: ( ( ( rule__CORBA_SmartSoft__Group__0 ) ) )
            // InternalComponentArchitecture.g:632:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            {
            // InternalComponentArchitecture.g:632:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            // InternalComponentArchitecture.g:633:3: ( rule__CORBA_SmartSoft__Group__0 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); 
            // InternalComponentArchitecture.g:634:3: ( rule__CORBA_SmartSoft__Group__0 )
            // InternalComponentArchitecture.g:634:4: rule__CORBA_SmartSoft__Group__0
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
    // InternalComponentArchitecture.g:643:1: entryRuleDDS_SmartSoft : ruleDDS_SmartSoft EOF ;
    public final void entryRuleDDS_SmartSoft() throws RecognitionException {
        try {
            // InternalComponentArchitecture.g:644:1: ( ruleDDS_SmartSoft EOF )
            // InternalComponentArchitecture.g:645:1: ruleDDS_SmartSoft EOF
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
    // InternalComponentArchitecture.g:652:1: ruleDDS_SmartSoft : ( ( rule__DDS_SmartSoft__Group__0 ) ) ;
    public final void ruleDDS_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:656:2: ( ( ( rule__DDS_SmartSoft__Group__0 ) ) )
            // InternalComponentArchitecture.g:657:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            {
            // InternalComponentArchitecture.g:657:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            // InternalComponentArchitecture.g:658:3: ( rule__DDS_SmartSoft__Group__0 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup()); 
            // InternalComponentArchitecture.g:659:3: ( rule__DDS_SmartSoft__Group__0 )
            // InternalComponentArchitecture.g:659:4: rule__DDS_SmartSoft__Group__0
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
    // InternalComponentArchitecture.g:667:1: rule__SystemExtension__Alternatives : ( ( ruleCoordinationModuleMapping ) | ( ruleTaskRealizationModelRef ) );
    public final void rule__SystemExtension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:671:1: ( ( ruleCoordinationModuleMapping ) | ( ruleTaskRealizationModelRef ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34) ) {
                alt1=1;
            }
            else if ( (LA1_0==38) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalComponentArchitecture.g:672:2: ( ruleCoordinationModuleMapping )
                    {
                    // InternalComponentArchitecture.g:672:2: ( ruleCoordinationModuleMapping )
                    // InternalComponentArchitecture.g:673:3: ruleCoordinationModuleMapping
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
                    // InternalComponentArchitecture.g:678:2: ( ruleTaskRealizationModelRef )
                    {
                    // InternalComponentArchitecture.g:678:2: ( ruleTaskRealizationModelRef )
                    // InternalComponentArchitecture.g:679:3: ruleTaskRealizationModelRef
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
    // InternalComponentArchitecture.g:688:1: rule__ComponentInstanceExtension__Alternatives : ( ( ruleParameterStructInstance ) | ( ruleActivityConfigurationMapping ) | ( ruleInputHandlerConfigurationMapping ) | ( ruleOpcUaDeviceClientInstance ) | ( ruleOpcUaReadServerInstance ) );
    public final void rule__ComponentInstanceExtension__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:692:1: ( ( ruleParameterStructInstance ) | ( ruleActivityConfigurationMapping ) | ( ruleInputHandlerConfigurationMapping ) | ( ruleOpcUaDeviceClientInstance ) | ( ruleOpcUaReadServerInstance ) )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 27:
                {
                alt2=3;
                }
                break;
            case 28:
                {
                alt2=4;
                }
                break;
            case 30:
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
                    // InternalComponentArchitecture.g:693:2: ( ruleParameterStructInstance )
                    {
                    // InternalComponentArchitecture.g:693:2: ( ruleParameterStructInstance )
                    // InternalComponentArchitecture.g:694:3: ruleParameterStructInstance
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
                    // InternalComponentArchitecture.g:699:2: ( ruleActivityConfigurationMapping )
                    {
                    // InternalComponentArchitecture.g:699:2: ( ruleActivityConfigurationMapping )
                    // InternalComponentArchitecture.g:700:3: ruleActivityConfigurationMapping
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
                    // InternalComponentArchitecture.g:705:2: ( ruleInputHandlerConfigurationMapping )
                    {
                    // InternalComponentArchitecture.g:705:2: ( ruleInputHandlerConfigurationMapping )
                    // InternalComponentArchitecture.g:706:3: ruleInputHandlerConfigurationMapping
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
                    // InternalComponentArchitecture.g:711:2: ( ruleOpcUaDeviceClientInstance )
                    {
                    // InternalComponentArchitecture.g:711:2: ( ruleOpcUaDeviceClientInstance )
                    // InternalComponentArchitecture.g:712:3: ruleOpcUaDeviceClientInstance
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
                    // InternalComponentArchitecture.g:717:2: ( ruleOpcUaReadServerInstance )
                    {
                    // InternalComponentArchitecture.g:717:2: ( ruleOpcUaReadServerInstance )
                    // InternalComponentArchitecture.g:718:3: ruleOpcUaReadServerInstance
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
    // InternalComponentArchitecture.g:727:1: rule__ServiceInstance__Alternatives : ( ( ruleRequiredService ) | ( ruleProvidedService ) );
    public final void rule__ServiceInstance__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:731:1: ( ( ruleRequiredService ) | ( ruleProvidedService ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==32) ) {
                alt3=1;
            }
            else if ( (LA3_0==33) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalComponentArchitecture.g:732:2: ( ruleRequiredService )
                    {
                    // InternalComponentArchitecture.g:732:2: ( ruleRequiredService )
                    // InternalComponentArchitecture.g:733:3: ruleRequiredService
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
                    // InternalComponentArchitecture.g:738:2: ( ruleProvidedService )
                    {
                    // InternalComponentArchitecture.g:738:2: ( ruleProvidedService )
                    // InternalComponentArchitecture.g:739:3: ruleProvidedService
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
    // InternalComponentArchitecture.g:748:1: rule__RoboticMiddleware__Alternatives : ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) );
    public final void rule__RoboticMiddleware__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:752:1: ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt4=1;
                }
                break;
            case 43:
                {
                alt4=2;
                }
                break;
            case 44:
                {
                alt4=3;
                }
                break;
            case 45:
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
                    // InternalComponentArchitecture.g:753:2: ( ruleACE_SmartSoft )
                    {
                    // InternalComponentArchitecture.g:753:2: ( ruleACE_SmartSoft )
                    // InternalComponentArchitecture.g:754:3: ruleACE_SmartSoft
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
                    // InternalComponentArchitecture.g:759:2: ( ruleOpcUa_SeRoNet )
                    {
                    // InternalComponentArchitecture.g:759:2: ( ruleOpcUa_SeRoNet )
                    // InternalComponentArchitecture.g:760:3: ruleOpcUa_SeRoNet
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
                    // InternalComponentArchitecture.g:765:2: ( ruleCORBA_SmartSoft )
                    {
                    // InternalComponentArchitecture.g:765:2: ( ruleCORBA_SmartSoft )
                    // InternalComponentArchitecture.g:766:3: ruleCORBA_SmartSoft
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
                    // InternalComponentArchitecture.g:771:2: ( ruleDDS_SmartSoft )
                    {
                    // InternalComponentArchitecture.g:771:2: ( ruleDDS_SmartSoft )
                    // InternalComponentArchitecture.g:772:3: ruleDDS_SmartSoft
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
    // InternalComponentArchitecture.g:781:1: rule__SystemComponentArchitecture__Group__0 : rule__SystemComponentArchitecture__Group__0__Impl rule__SystemComponentArchitecture__Group__1 ;
    public final void rule__SystemComponentArchitecture__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:785:1: ( rule__SystemComponentArchitecture__Group__0__Impl rule__SystemComponentArchitecture__Group__1 )
            // InternalComponentArchitecture.g:786:2: rule__SystemComponentArchitecture__Group__0__Impl rule__SystemComponentArchitecture__Group__1
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
    // InternalComponentArchitecture.g:793:1: rule__SystemComponentArchitecture__Group__0__Impl : ( () ) ;
    public final void rule__SystemComponentArchitecture__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:797:1: ( ( () ) )
            // InternalComponentArchitecture.g:798:1: ( () )
            {
            // InternalComponentArchitecture.g:798:1: ( () )
            // InternalComponentArchitecture.g:799:2: ()
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureAction_0()); 
            // InternalComponentArchitecture.g:800:2: ()
            // InternalComponentArchitecture.g:800:3: 
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
    // InternalComponentArchitecture.g:808:1: rule__SystemComponentArchitecture__Group__1 : rule__SystemComponentArchitecture__Group__1__Impl rule__SystemComponentArchitecture__Group__2 ;
    public final void rule__SystemComponentArchitecture__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:812:1: ( rule__SystemComponentArchitecture__Group__1__Impl rule__SystemComponentArchitecture__Group__2 )
            // InternalComponentArchitecture.g:813:2: rule__SystemComponentArchitecture__Group__1__Impl rule__SystemComponentArchitecture__Group__2
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
    // InternalComponentArchitecture.g:820:1: rule__SystemComponentArchitecture__Group__1__Impl : ( 'SystemComponentArchitecture' ) ;
    public final void rule__SystemComponentArchitecture__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:824:1: ( ( 'SystemComponentArchitecture' ) )
            // InternalComponentArchitecture.g:825:1: ( 'SystemComponentArchitecture' )
            {
            // InternalComponentArchitecture.g:825:1: ( 'SystemComponentArchitecture' )
            // InternalComponentArchitecture.g:826:2: 'SystemComponentArchitecture'
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getSystemComponentArchitectureKeyword_1()); 
            match(input,14,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:835:1: rule__SystemComponentArchitecture__Group__2 : rule__SystemComponentArchitecture__Group__2__Impl rule__SystemComponentArchitecture__Group__3 ;
    public final void rule__SystemComponentArchitecture__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:839:1: ( rule__SystemComponentArchitecture__Group__2__Impl rule__SystemComponentArchitecture__Group__3 )
            // InternalComponentArchitecture.g:840:2: rule__SystemComponentArchitecture__Group__2__Impl rule__SystemComponentArchitecture__Group__3
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
    // InternalComponentArchitecture.g:847:1: rule__SystemComponentArchitecture__Group__2__Impl : ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) ) ;
    public final void rule__SystemComponentArchitecture__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:851:1: ( ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) ) )
            // InternalComponentArchitecture.g:852:1: ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) )
            {
            // InternalComponentArchitecture.g:852:1: ( ( rule__SystemComponentArchitecture__NameAssignment_2 ) )
            // InternalComponentArchitecture.g:853:2: ( rule__SystemComponentArchitecture__NameAssignment_2 )
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getNameAssignment_2()); 
            // InternalComponentArchitecture.g:854:2: ( rule__SystemComponentArchitecture__NameAssignment_2 )
            // InternalComponentArchitecture.g:854:3: rule__SystemComponentArchitecture__NameAssignment_2
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
    // InternalComponentArchitecture.g:862:1: rule__SystemComponentArchitecture__Group__3 : rule__SystemComponentArchitecture__Group__3__Impl rule__SystemComponentArchitecture__Group__4 ;
    public final void rule__SystemComponentArchitecture__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:866:1: ( rule__SystemComponentArchitecture__Group__3__Impl rule__SystemComponentArchitecture__Group__4 )
            // InternalComponentArchitecture.g:867:2: rule__SystemComponentArchitecture__Group__3__Impl rule__SystemComponentArchitecture__Group__4
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
    // InternalComponentArchitecture.g:874:1: rule__SystemComponentArchitecture__Group__3__Impl : ( ( rule__SystemComponentArchitecture__Group_3__0 )? ) ;
    public final void rule__SystemComponentArchitecture__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:878:1: ( ( ( rule__SystemComponentArchitecture__Group_3__0 )? ) )
            // InternalComponentArchitecture.g:879:1: ( ( rule__SystemComponentArchitecture__Group_3__0 )? )
            {
            // InternalComponentArchitecture.g:879:1: ( ( rule__SystemComponentArchitecture__Group_3__0 )? )
            // InternalComponentArchitecture.g:880:2: ( rule__SystemComponentArchitecture__Group_3__0 )?
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getGroup_3()); 
            // InternalComponentArchitecture.g:881:2: ( rule__SystemComponentArchitecture__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalComponentArchitecture.g:881:3: rule__SystemComponentArchitecture__Group_3__0
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
    // InternalComponentArchitecture.g:889:1: rule__SystemComponentArchitecture__Group__4 : rule__SystemComponentArchitecture__Group__4__Impl rule__SystemComponentArchitecture__Group__5 ;
    public final void rule__SystemComponentArchitecture__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:893:1: ( rule__SystemComponentArchitecture__Group__4__Impl rule__SystemComponentArchitecture__Group__5 )
            // InternalComponentArchitecture.g:894:2: rule__SystemComponentArchitecture__Group__4__Impl rule__SystemComponentArchitecture__Group__5
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
    // InternalComponentArchitecture.g:901:1: rule__SystemComponentArchitecture__Group__4__Impl : ( '{' ) ;
    public final void rule__SystemComponentArchitecture__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:905:1: ( ( '{' ) )
            // InternalComponentArchitecture.g:906:1: ( '{' )
            {
            // InternalComponentArchitecture.g:906:1: ( '{' )
            // InternalComponentArchitecture.g:907:2: '{'
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:916:1: rule__SystemComponentArchitecture__Group__5 : rule__SystemComponentArchitecture__Group__5__Impl rule__SystemComponentArchitecture__Group__6 ;
    public final void rule__SystemComponentArchitecture__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:920:1: ( rule__SystemComponentArchitecture__Group__5__Impl rule__SystemComponentArchitecture__Group__6 )
            // InternalComponentArchitecture.g:921:2: rule__SystemComponentArchitecture__Group__5__Impl rule__SystemComponentArchitecture__Group__6
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
    // InternalComponentArchitecture.g:928:1: rule__SystemComponentArchitecture__Group__5__Impl : ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* ) ;
    public final void rule__SystemComponentArchitecture__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:932:1: ( ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* ) )
            // InternalComponentArchitecture.g:933:1: ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* )
            {
            // InternalComponentArchitecture.g:933:1: ( ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )* )
            // InternalComponentArchitecture.g:934:2: ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )*
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getComponentsAssignment_5()); 
            // InternalComponentArchitecture.g:935:2: ( rule__SystemComponentArchitecture__ComponentsAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalComponentArchitecture.g:935:3: rule__SystemComponentArchitecture__ComponentsAssignment_5
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
    // InternalComponentArchitecture.g:943:1: rule__SystemComponentArchitecture__Group__6 : rule__SystemComponentArchitecture__Group__6__Impl rule__SystemComponentArchitecture__Group__7 ;
    public final void rule__SystemComponentArchitecture__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:947:1: ( rule__SystemComponentArchitecture__Group__6__Impl rule__SystemComponentArchitecture__Group__7 )
            // InternalComponentArchitecture.g:948:2: rule__SystemComponentArchitecture__Group__6__Impl rule__SystemComponentArchitecture__Group__7
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
    // InternalComponentArchitecture.g:955:1: rule__SystemComponentArchitecture__Group__6__Impl : ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* ) ;
    public final void rule__SystemComponentArchitecture__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:959:1: ( ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* ) )
            // InternalComponentArchitecture.g:960:1: ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* )
            {
            // InternalComponentArchitecture.g:960:1: ( ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )* )
            // InternalComponentArchitecture.g:961:2: ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )*
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getConnectionsAssignment_6()); 
            // InternalComponentArchitecture.g:962:2: ( rule__SystemComponentArchitecture__ConnectionsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalComponentArchitecture.g:962:3: rule__SystemComponentArchitecture__ConnectionsAssignment_6
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
    // InternalComponentArchitecture.g:970:1: rule__SystemComponentArchitecture__Group__7 : rule__SystemComponentArchitecture__Group__7__Impl rule__SystemComponentArchitecture__Group__8 ;
    public final void rule__SystemComponentArchitecture__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:974:1: ( rule__SystemComponentArchitecture__Group__7__Impl rule__SystemComponentArchitecture__Group__8 )
            // InternalComponentArchitecture.g:975:2: rule__SystemComponentArchitecture__Group__7__Impl rule__SystemComponentArchitecture__Group__8
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
    // InternalComponentArchitecture.g:982:1: rule__SystemComponentArchitecture__Group__7__Impl : ( ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )* ) ;
    public final void rule__SystemComponentArchitecture__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:986:1: ( ( ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )* ) )
            // InternalComponentArchitecture.g:987:1: ( ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )* )
            {
            // InternalComponentArchitecture.g:987:1: ( ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )* )
            // InternalComponentArchitecture.g:988:2: ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )*
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getExtensionsAssignment_7()); 
            // InternalComponentArchitecture.g:989:2: ( rule__SystemComponentArchitecture__ExtensionsAssignment_7 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==34||LA8_0==38) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalComponentArchitecture.g:989:3: rule__SystemComponentArchitecture__ExtensionsAssignment_7
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
    // InternalComponentArchitecture.g:997:1: rule__SystemComponentArchitecture__Group__8 : rule__SystemComponentArchitecture__Group__8__Impl ;
    public final void rule__SystemComponentArchitecture__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1001:1: ( rule__SystemComponentArchitecture__Group__8__Impl )
            // InternalComponentArchitecture.g:1002:2: rule__SystemComponentArchitecture__Group__8__Impl
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
    // InternalComponentArchitecture.g:1008:1: rule__SystemComponentArchitecture__Group__8__Impl : ( '}' ) ;
    public final void rule__SystemComponentArchitecture__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1012:1: ( ( '}' ) )
            // InternalComponentArchitecture.g:1013:1: ( '}' )
            {
            // InternalComponentArchitecture.g:1013:1: ( '}' )
            // InternalComponentArchitecture.g:1014:2: '}'
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1024:1: rule__SystemComponentArchitecture__Group_3__0 : rule__SystemComponentArchitecture__Group_3__0__Impl rule__SystemComponentArchitecture__Group_3__1 ;
    public final void rule__SystemComponentArchitecture__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1028:1: ( rule__SystemComponentArchitecture__Group_3__0__Impl rule__SystemComponentArchitecture__Group_3__1 )
            // InternalComponentArchitecture.g:1029:2: rule__SystemComponentArchitecture__Group_3__0__Impl rule__SystemComponentArchitecture__Group_3__1
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
    // InternalComponentArchitecture.g:1036:1: rule__SystemComponentArchitecture__Group_3__0__Impl : ( 'usingActivityArchitecture' ) ;
    public final void rule__SystemComponentArchitecture__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1040:1: ( ( 'usingActivityArchitecture' ) )
            // InternalComponentArchitecture.g:1041:1: ( 'usingActivityArchitecture' )
            {
            // InternalComponentArchitecture.g:1041:1: ( 'usingActivityArchitecture' )
            // InternalComponentArchitecture.g:1042:2: 'usingActivityArchitecture'
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getUsingActivityArchitectureKeyword_3_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1051:1: rule__SystemComponentArchitecture__Group_3__1 : rule__SystemComponentArchitecture__Group_3__1__Impl ;
    public final void rule__SystemComponentArchitecture__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1055:1: ( rule__SystemComponentArchitecture__Group_3__1__Impl )
            // InternalComponentArchitecture.g:1056:2: rule__SystemComponentArchitecture__Group_3__1__Impl
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
    // InternalComponentArchitecture.g:1062:1: rule__SystemComponentArchitecture__Group_3__1__Impl : ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) ) ;
    public final void rule__SystemComponentArchitecture__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1066:1: ( ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) ) )
            // InternalComponentArchitecture.g:1067:1: ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) )
            {
            // InternalComponentArchitecture.g:1067:1: ( ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 ) )
            // InternalComponentArchitecture.g:1068:2: ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 )
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchAssignment_3_1()); 
            // InternalComponentArchitecture.g:1069:2: ( rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 )
            // InternalComponentArchitecture.g:1069:3: rule__SystemComponentArchitecture__ActivityArchAssignment_3_1
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
    // InternalComponentArchitecture.g:1078:1: rule__Connection__Group__0 : rule__Connection__Group__0__Impl rule__Connection__Group__1 ;
    public final void rule__Connection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1082:1: ( rule__Connection__Group__0__Impl rule__Connection__Group__1 )
            // InternalComponentArchitecture.g:1083:2: rule__Connection__Group__0__Impl rule__Connection__Group__1
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
    // InternalComponentArchitecture.g:1090:1: rule__Connection__Group__0__Impl : ( 'Connection' ) ;
    public final void rule__Connection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1094:1: ( ( 'Connection' ) )
            // InternalComponentArchitecture.g:1095:1: ( 'Connection' )
            {
            // InternalComponentArchitecture.g:1095:1: ( 'Connection' )
            // InternalComponentArchitecture.g:1096:2: 'Connection'
            {
             before(grammarAccess.getConnectionAccess().getConnectionKeyword_0()); 
            match(input,18,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1105:1: rule__Connection__Group__1 : rule__Connection__Group__1__Impl rule__Connection__Group__2 ;
    public final void rule__Connection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1109:1: ( rule__Connection__Group__1__Impl rule__Connection__Group__2 )
            // InternalComponentArchitecture.g:1110:2: rule__Connection__Group__1__Impl rule__Connection__Group__2
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
    // InternalComponentArchitecture.g:1117:1: rule__Connection__Group__1__Impl : ( ( rule__Connection__FromAssignment_1 ) ) ;
    public final void rule__Connection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1121:1: ( ( ( rule__Connection__FromAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1122:1: ( ( rule__Connection__FromAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1122:1: ( ( rule__Connection__FromAssignment_1 ) )
            // InternalComponentArchitecture.g:1123:2: ( rule__Connection__FromAssignment_1 )
            {
             before(grammarAccess.getConnectionAccess().getFromAssignment_1()); 
            // InternalComponentArchitecture.g:1124:2: ( rule__Connection__FromAssignment_1 )
            // InternalComponentArchitecture.g:1124:3: rule__Connection__FromAssignment_1
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
    // InternalComponentArchitecture.g:1132:1: rule__Connection__Group__2 : rule__Connection__Group__2__Impl rule__Connection__Group__3 ;
    public final void rule__Connection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1136:1: ( rule__Connection__Group__2__Impl rule__Connection__Group__3 )
            // InternalComponentArchitecture.g:1137:2: rule__Connection__Group__2__Impl rule__Connection__Group__3
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
    // InternalComponentArchitecture.g:1144:1: rule__Connection__Group__2__Impl : ( '->' ) ;
    public final void rule__Connection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1148:1: ( ( '->' ) )
            // InternalComponentArchitecture.g:1149:1: ( '->' )
            {
            // InternalComponentArchitecture.g:1149:1: ( '->' )
            // InternalComponentArchitecture.g:1150:2: '->'
            {
             before(grammarAccess.getConnectionAccess().getHyphenMinusGreaterThanSignKeyword_2()); 
            match(input,19,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1159:1: rule__Connection__Group__3 : rule__Connection__Group__3__Impl rule__Connection__Group__4 ;
    public final void rule__Connection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1163:1: ( rule__Connection__Group__3__Impl rule__Connection__Group__4 )
            // InternalComponentArchitecture.g:1164:2: rule__Connection__Group__3__Impl rule__Connection__Group__4
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
    // InternalComponentArchitecture.g:1171:1: rule__Connection__Group__3__Impl : ( ( rule__Connection__ToAssignment_3 ) ) ;
    public final void rule__Connection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1175:1: ( ( ( rule__Connection__ToAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1176:1: ( ( rule__Connection__ToAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1176:1: ( ( rule__Connection__ToAssignment_3 ) )
            // InternalComponentArchitecture.g:1177:2: ( rule__Connection__ToAssignment_3 )
            {
             before(grammarAccess.getConnectionAccess().getToAssignment_3()); 
            // InternalComponentArchitecture.g:1178:2: ( rule__Connection__ToAssignment_3 )
            // InternalComponentArchitecture.g:1178:3: rule__Connection__ToAssignment_3
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
    // InternalComponentArchitecture.g:1186:1: rule__Connection__Group__4 : rule__Connection__Group__4__Impl rule__Connection__Group__5 ;
    public final void rule__Connection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1190:1: ( rule__Connection__Group__4__Impl rule__Connection__Group__5 )
            // InternalComponentArchitecture.g:1191:2: rule__Connection__Group__4__Impl rule__Connection__Group__5
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
    // InternalComponentArchitecture.g:1198:1: rule__Connection__Group__4__Impl : ( ( rule__Connection__Group_4__0 )? ) ;
    public final void rule__Connection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1202:1: ( ( ( rule__Connection__Group_4__0 )? ) )
            // InternalComponentArchitecture.g:1203:1: ( ( rule__Connection__Group_4__0 )? )
            {
            // InternalComponentArchitecture.g:1203:1: ( ( rule__Connection__Group_4__0 )? )
            // InternalComponentArchitecture.g:1204:2: ( rule__Connection__Group_4__0 )?
            {
             before(grammarAccess.getConnectionAccess().getGroup_4()); 
            // InternalComponentArchitecture.g:1205:2: ( rule__Connection__Group_4__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalComponentArchitecture.g:1205:3: rule__Connection__Group_4__0
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
    // InternalComponentArchitecture.g:1213:1: rule__Connection__Group__5 : rule__Connection__Group__5__Impl ;
    public final void rule__Connection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1217:1: ( rule__Connection__Group__5__Impl )
            // InternalComponentArchitecture.g:1218:2: rule__Connection__Group__5__Impl
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
    // InternalComponentArchitecture.g:1224:1: rule__Connection__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__Connection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1228:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1229:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1229:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1230:2: ( ';' )?
            {
             before(grammarAccess.getConnectionAccess().getSemicolonKeyword_5()); 
            // InternalComponentArchitecture.g:1231:2: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalComponentArchitecture.g:1231:3: ';'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalComponentArchitecture.g:1240:1: rule__Connection__Group_4__0 : rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 ;
    public final void rule__Connection__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1244:1: ( rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1 )
            // InternalComponentArchitecture.g:1245:2: rule__Connection__Group_4__0__Impl rule__Connection__Group_4__1
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
    // InternalComponentArchitecture.g:1252:1: rule__Connection__Group_4__0__Impl : ( 'useMiddleware' ) ;
    public final void rule__Connection__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1256:1: ( ( 'useMiddleware' ) )
            // InternalComponentArchitecture.g:1257:1: ( 'useMiddleware' )
            {
            // InternalComponentArchitecture.g:1257:1: ( 'useMiddleware' )
            // InternalComponentArchitecture.g:1258:2: 'useMiddleware'
            {
             before(grammarAccess.getConnectionAccess().getUseMiddlewareKeyword_4_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1267:1: rule__Connection__Group_4__1 : rule__Connection__Group_4__1__Impl ;
    public final void rule__Connection__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1271:1: ( rule__Connection__Group_4__1__Impl )
            // InternalComponentArchitecture.g:1272:2: rule__Connection__Group_4__1__Impl
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
    // InternalComponentArchitecture.g:1278:1: rule__Connection__Group_4__1__Impl : ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) ) ;
    public final void rule__Connection__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1282:1: ( ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) ) )
            // InternalComponentArchitecture.g:1283:1: ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) )
            {
            // InternalComponentArchitecture.g:1283:1: ( ( rule__Connection__MiddlewareSelectionAssignment_4_1 ) )
            // InternalComponentArchitecture.g:1284:2: ( rule__Connection__MiddlewareSelectionAssignment_4_1 )
            {
             before(grammarAccess.getConnectionAccess().getMiddlewareSelectionAssignment_4_1()); 
            // InternalComponentArchitecture.g:1285:2: ( rule__Connection__MiddlewareSelectionAssignment_4_1 )
            // InternalComponentArchitecture.g:1285:3: rule__Connection__MiddlewareSelectionAssignment_4_1
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
    // InternalComponentArchitecture.g:1294:1: rule__ComponentInstance__Group__0 : rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 ;
    public final void rule__ComponentInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1298:1: ( rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1 )
            // InternalComponentArchitecture.g:1299:2: rule__ComponentInstance__Group__0__Impl rule__ComponentInstance__Group__1
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
    // InternalComponentArchitecture.g:1306:1: rule__ComponentInstance__Group__0__Impl : ( 'ComponentInstance' ) ;
    public final void rule__ComponentInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1310:1: ( ( 'ComponentInstance' ) )
            // InternalComponentArchitecture.g:1311:1: ( 'ComponentInstance' )
            {
            // InternalComponentArchitecture.g:1311:1: ( 'ComponentInstance' )
            // InternalComponentArchitecture.g:1312:2: 'ComponentInstance'
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentInstanceKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1321:1: rule__ComponentInstance__Group__1 : rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 ;
    public final void rule__ComponentInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1325:1: ( rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2 )
            // InternalComponentArchitecture.g:1326:2: rule__ComponentInstance__Group__1__Impl rule__ComponentInstance__Group__2
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
    // InternalComponentArchitecture.g:1333:1: rule__ComponentInstance__Group__1__Impl : ( ( rule__ComponentInstance__NameAssignment_1 ) ) ;
    public final void rule__ComponentInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1337:1: ( ( ( rule__ComponentInstance__NameAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1338:1: ( ( rule__ComponentInstance__NameAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1338:1: ( ( rule__ComponentInstance__NameAssignment_1 ) )
            // InternalComponentArchitecture.g:1339:2: ( rule__ComponentInstance__NameAssignment_1 )
            {
             before(grammarAccess.getComponentInstanceAccess().getNameAssignment_1()); 
            // InternalComponentArchitecture.g:1340:2: ( rule__ComponentInstance__NameAssignment_1 )
            // InternalComponentArchitecture.g:1340:3: rule__ComponentInstance__NameAssignment_1
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
    // InternalComponentArchitecture.g:1348:1: rule__ComponentInstance__Group__2 : rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 ;
    public final void rule__ComponentInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1352:1: ( rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3 )
            // InternalComponentArchitecture.g:1353:2: rule__ComponentInstance__Group__2__Impl rule__ComponentInstance__Group__3
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
    // InternalComponentArchitecture.g:1360:1: rule__ComponentInstance__Group__2__Impl : ( 'instantiates' ) ;
    public final void rule__ComponentInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1364:1: ( ( 'instantiates' ) )
            // InternalComponentArchitecture.g:1365:1: ( 'instantiates' )
            {
            // InternalComponentArchitecture.g:1365:1: ( 'instantiates' )
            // InternalComponentArchitecture.g:1366:2: 'instantiates'
            {
             before(grammarAccess.getComponentInstanceAccess().getInstantiatesKeyword_2()); 
            match(input,23,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1375:1: rule__ComponentInstance__Group__3 : rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4 ;
    public final void rule__ComponentInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1379:1: ( rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4 )
            // InternalComponentArchitecture.g:1380:2: rule__ComponentInstance__Group__3__Impl rule__ComponentInstance__Group__4
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
    // InternalComponentArchitecture.g:1387:1: rule__ComponentInstance__Group__3__Impl : ( ( rule__ComponentInstance__ComponentAssignment_3 ) ) ;
    public final void rule__ComponentInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1391:1: ( ( ( rule__ComponentInstance__ComponentAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1392:1: ( ( rule__ComponentInstance__ComponentAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1392:1: ( ( rule__ComponentInstance__ComponentAssignment_3 ) )
            // InternalComponentArchitecture.g:1393:2: ( rule__ComponentInstance__ComponentAssignment_3 )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentAssignment_3()); 
            // InternalComponentArchitecture.g:1394:2: ( rule__ComponentInstance__ComponentAssignment_3 )
            // InternalComponentArchitecture.g:1394:3: rule__ComponentInstance__ComponentAssignment_3
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
    // InternalComponentArchitecture.g:1402:1: rule__ComponentInstance__Group__4 : rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5 ;
    public final void rule__ComponentInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1406:1: ( rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5 )
            // InternalComponentArchitecture.g:1407:2: rule__ComponentInstance__Group__4__Impl rule__ComponentInstance__Group__5
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
    // InternalComponentArchitecture.g:1414:1: rule__ComponentInstance__Group__4__Impl : ( '{' ) ;
    public final void rule__ComponentInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1418:1: ( ( '{' ) )
            // InternalComponentArchitecture.g:1419:1: ( '{' )
            {
            // InternalComponentArchitecture.g:1419:1: ( '{' )
            // InternalComponentArchitecture.g:1420:2: '{'
            {
             before(grammarAccess.getComponentInstanceAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,15,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1429:1: rule__ComponentInstance__Group__5 : rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6 ;
    public final void rule__ComponentInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1433:1: ( rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6 )
            // InternalComponentArchitecture.g:1434:2: rule__ComponentInstance__Group__5__Impl rule__ComponentInstance__Group__6
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
    // InternalComponentArchitecture.g:1441:1: rule__ComponentInstance__Group__5__Impl : ( ( rule__ComponentInstance__PortsAssignment_5 )* ) ;
    public final void rule__ComponentInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1445:1: ( ( ( rule__ComponentInstance__PortsAssignment_5 )* ) )
            // InternalComponentArchitecture.g:1446:1: ( ( rule__ComponentInstance__PortsAssignment_5 )* )
            {
            // InternalComponentArchitecture.g:1446:1: ( ( rule__ComponentInstance__PortsAssignment_5 )* )
            // InternalComponentArchitecture.g:1447:2: ( rule__ComponentInstance__PortsAssignment_5 )*
            {
             before(grammarAccess.getComponentInstanceAccess().getPortsAssignment_5()); 
            // InternalComponentArchitecture.g:1448:2: ( rule__ComponentInstance__PortsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=32 && LA11_0<=33)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalComponentArchitecture.g:1448:3: rule__ComponentInstance__PortsAssignment_5
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
    // InternalComponentArchitecture.g:1456:1: rule__ComponentInstance__Group__6 : rule__ComponentInstance__Group__6__Impl rule__ComponentInstance__Group__7 ;
    public final void rule__ComponentInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1460:1: ( rule__ComponentInstance__Group__6__Impl rule__ComponentInstance__Group__7 )
            // InternalComponentArchitecture.g:1461:2: rule__ComponentInstance__Group__6__Impl rule__ComponentInstance__Group__7
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
    // InternalComponentArchitecture.g:1468:1: rule__ComponentInstance__Group__6__Impl : ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* ) ;
    public final void rule__ComponentInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1472:1: ( ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* ) )
            // InternalComponentArchitecture.g:1473:1: ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* )
            {
            // InternalComponentArchitecture.g:1473:1: ( ( rule__ComponentInstance__ExtensionsAssignment_6 )* )
            // InternalComponentArchitecture.g:1474:2: ( rule__ComponentInstance__ExtensionsAssignment_6 )*
            {
             before(grammarAccess.getComponentInstanceAccess().getExtensionsAssignment_6()); 
            // InternalComponentArchitecture.g:1475:2: ( rule__ComponentInstance__ExtensionsAssignment_6 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=24 && LA12_0<=25)||(LA12_0>=27 && LA12_0<=28)||LA12_0==30) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalComponentArchitecture.g:1475:3: rule__ComponentInstance__ExtensionsAssignment_6
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
    // InternalComponentArchitecture.g:1483:1: rule__ComponentInstance__Group__7 : rule__ComponentInstance__Group__7__Impl ;
    public final void rule__ComponentInstance__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1487:1: ( rule__ComponentInstance__Group__7__Impl )
            // InternalComponentArchitecture.g:1488:2: rule__ComponentInstance__Group__7__Impl
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
    // InternalComponentArchitecture.g:1494:1: rule__ComponentInstance__Group__7__Impl : ( '}' ) ;
    public final void rule__ComponentInstance__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1498:1: ( ( '}' ) )
            // InternalComponentArchitecture.g:1499:1: ( '}' )
            {
            // InternalComponentArchitecture.g:1499:1: ( '}' )
            // InternalComponentArchitecture.g:1500:2: '}'
            {
             before(grammarAccess.getComponentInstanceAccess().getRightCurlyBracketKeyword_7()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1510:1: rule__ParameterStructInstance__Group__0 : rule__ParameterStructInstance__Group__0__Impl rule__ParameterStructInstance__Group__1 ;
    public final void rule__ParameterStructInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1514:1: ( rule__ParameterStructInstance__Group__0__Impl rule__ParameterStructInstance__Group__1 )
            // InternalComponentArchitecture.g:1515:2: rule__ParameterStructInstance__Group__0__Impl rule__ParameterStructInstance__Group__1
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
    // InternalComponentArchitecture.g:1522:1: rule__ParameterStructInstance__Group__0__Impl : ( 'ParameterStructInstance' ) ;
    public final void rule__ParameterStructInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1526:1: ( ( 'ParameterStructInstance' ) )
            // InternalComponentArchitecture.g:1527:1: ( 'ParameterStructInstance' )
            {
            // InternalComponentArchitecture.g:1527:1: ( 'ParameterStructInstance' )
            // InternalComponentArchitecture.g:1528:2: 'ParameterStructInstance'
            {
             before(grammarAccess.getParameterStructInstanceAccess().getParameterStructInstanceKeyword_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1537:1: rule__ParameterStructInstance__Group__1 : rule__ParameterStructInstance__Group__1__Impl rule__ParameterStructInstance__Group__2 ;
    public final void rule__ParameterStructInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1541:1: ( rule__ParameterStructInstance__Group__1__Impl rule__ParameterStructInstance__Group__2 )
            // InternalComponentArchitecture.g:1542:2: rule__ParameterStructInstance__Group__1__Impl rule__ParameterStructInstance__Group__2
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
    // InternalComponentArchitecture.g:1549:1: rule__ParameterStructInstance__Group__1__Impl : ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) ) ;
    public final void rule__ParameterStructInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1553:1: ( ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1554:1: ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1554:1: ( ( rule__ParameterStructInstance__ParameterAssignment_1 ) )
            // InternalComponentArchitecture.g:1555:2: ( rule__ParameterStructInstance__ParameterAssignment_1 )
            {
             before(grammarAccess.getParameterStructInstanceAccess().getParameterAssignment_1()); 
            // InternalComponentArchitecture.g:1556:2: ( rule__ParameterStructInstance__ParameterAssignment_1 )
            // InternalComponentArchitecture.g:1556:3: rule__ParameterStructInstance__ParameterAssignment_1
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
    // InternalComponentArchitecture.g:1564:1: rule__ParameterStructInstance__Group__2 : rule__ParameterStructInstance__Group__2__Impl ;
    public final void rule__ParameterStructInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1568:1: ( rule__ParameterStructInstance__Group__2__Impl )
            // InternalComponentArchitecture.g:1569:2: rule__ParameterStructInstance__Group__2__Impl
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
    // InternalComponentArchitecture.g:1575:1: rule__ParameterStructInstance__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ParameterStructInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1579:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1580:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1580:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1581:2: ( ';' )?
            {
             before(grammarAccess.getParameterStructInstanceAccess().getSemicolonKeyword_2()); 
            // InternalComponentArchitecture.g:1582:2: ( ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalComponentArchitecture.g:1582:3: ';'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalComponentArchitecture.g:1591:1: rule__ActivityConfigurationMapping__Group__0 : rule__ActivityConfigurationMapping__Group__0__Impl rule__ActivityConfigurationMapping__Group__1 ;
    public final void rule__ActivityConfigurationMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1595:1: ( rule__ActivityConfigurationMapping__Group__0__Impl rule__ActivityConfigurationMapping__Group__1 )
            // InternalComponentArchitecture.g:1596:2: rule__ActivityConfigurationMapping__Group__0__Impl rule__ActivityConfigurationMapping__Group__1
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
    // InternalComponentArchitecture.g:1603:1: rule__ActivityConfigurationMapping__Group__0__Impl : ( 'Activity' ) ;
    public final void rule__ActivityConfigurationMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1607:1: ( ( 'Activity' ) )
            // InternalComponentArchitecture.g:1608:1: ( 'Activity' )
            {
            // InternalComponentArchitecture.g:1608:1: ( 'Activity' )
            // InternalComponentArchitecture.g:1609:2: 'Activity'
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getActivityKeyword_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1618:1: rule__ActivityConfigurationMapping__Group__1 : rule__ActivityConfigurationMapping__Group__1__Impl rule__ActivityConfigurationMapping__Group__2 ;
    public final void rule__ActivityConfigurationMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1622:1: ( rule__ActivityConfigurationMapping__Group__1__Impl rule__ActivityConfigurationMapping__Group__2 )
            // InternalComponentArchitecture.g:1623:2: rule__ActivityConfigurationMapping__Group__1__Impl rule__ActivityConfigurationMapping__Group__2
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
    // InternalComponentArchitecture.g:1630:1: rule__ActivityConfigurationMapping__Group__1__Impl : ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) ) ;
    public final void rule__ActivityConfigurationMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1634:1: ( ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1635:1: ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1635:1: ( ( rule__ActivityConfigurationMapping__ActivityAssignment_1 ) )
            // InternalComponentArchitecture.g:1636:2: ( rule__ActivityConfigurationMapping__ActivityAssignment_1 )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getActivityAssignment_1()); 
            // InternalComponentArchitecture.g:1637:2: ( rule__ActivityConfigurationMapping__ActivityAssignment_1 )
            // InternalComponentArchitecture.g:1637:3: rule__ActivityConfigurationMapping__ActivityAssignment_1
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
    // InternalComponentArchitecture.g:1645:1: rule__ActivityConfigurationMapping__Group__2 : rule__ActivityConfigurationMapping__Group__2__Impl rule__ActivityConfigurationMapping__Group__3 ;
    public final void rule__ActivityConfigurationMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1649:1: ( rule__ActivityConfigurationMapping__Group__2__Impl rule__ActivityConfigurationMapping__Group__3 )
            // InternalComponentArchitecture.g:1650:2: rule__ActivityConfigurationMapping__Group__2__Impl rule__ActivityConfigurationMapping__Group__3
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
    // InternalComponentArchitecture.g:1657:1: rule__ActivityConfigurationMapping__Group__2__Impl : ( 'configuration' ) ;
    public final void rule__ActivityConfigurationMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1661:1: ( ( 'configuration' ) )
            // InternalComponentArchitecture.g:1662:1: ( 'configuration' )
            {
            // InternalComponentArchitecture.g:1662:1: ( 'configuration' )
            // InternalComponentArchitecture.g:1663:2: 'configuration'
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getConfigurationKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1672:1: rule__ActivityConfigurationMapping__Group__3 : rule__ActivityConfigurationMapping__Group__3__Impl rule__ActivityConfigurationMapping__Group__4 ;
    public final void rule__ActivityConfigurationMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1676:1: ( rule__ActivityConfigurationMapping__Group__3__Impl rule__ActivityConfigurationMapping__Group__4 )
            // InternalComponentArchitecture.g:1677:2: rule__ActivityConfigurationMapping__Group__3__Impl rule__ActivityConfigurationMapping__Group__4
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
    // InternalComponentArchitecture.g:1684:1: rule__ActivityConfigurationMapping__Group__3__Impl : ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) ) ;
    public final void rule__ActivityConfigurationMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1688:1: ( ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1689:1: ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1689:1: ( ( rule__ActivityConfigurationMapping__ConfigAssignment_3 ) )
            // InternalComponentArchitecture.g:1690:2: ( rule__ActivityConfigurationMapping__ConfigAssignment_3 )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getConfigAssignment_3()); 
            // InternalComponentArchitecture.g:1691:2: ( rule__ActivityConfigurationMapping__ConfigAssignment_3 )
            // InternalComponentArchitecture.g:1691:3: rule__ActivityConfigurationMapping__ConfigAssignment_3
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
    // InternalComponentArchitecture.g:1699:1: rule__ActivityConfigurationMapping__Group__4 : rule__ActivityConfigurationMapping__Group__4__Impl ;
    public final void rule__ActivityConfigurationMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1703:1: ( rule__ActivityConfigurationMapping__Group__4__Impl )
            // InternalComponentArchitecture.g:1704:2: rule__ActivityConfigurationMapping__Group__4__Impl
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
    // InternalComponentArchitecture.g:1710:1: rule__ActivityConfigurationMapping__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__ActivityConfigurationMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1714:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1715:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1715:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1716:2: ( ';' )?
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getSemicolonKeyword_4()); 
            // InternalComponentArchitecture.g:1717:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalComponentArchitecture.g:1717:3: ';'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalComponentArchitecture.g:1726:1: rule__InputHandlerConfigurationMapping__Group__0 : rule__InputHandlerConfigurationMapping__Group__0__Impl rule__InputHandlerConfigurationMapping__Group__1 ;
    public final void rule__InputHandlerConfigurationMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1730:1: ( rule__InputHandlerConfigurationMapping__Group__0__Impl rule__InputHandlerConfigurationMapping__Group__1 )
            // InternalComponentArchitecture.g:1731:2: rule__InputHandlerConfigurationMapping__Group__0__Impl rule__InputHandlerConfigurationMapping__Group__1
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
    // InternalComponentArchitecture.g:1738:1: rule__InputHandlerConfigurationMapping__Group__0__Impl : ( 'InputHandler' ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1742:1: ( ( 'InputHandler' ) )
            // InternalComponentArchitecture.g:1743:1: ( 'InputHandler' )
            {
            // InternalComponentArchitecture.g:1743:1: ( 'InputHandler' )
            // InternalComponentArchitecture.g:1744:2: 'InputHandler'
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getInputHandlerKeyword_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1753:1: rule__InputHandlerConfigurationMapping__Group__1 : rule__InputHandlerConfigurationMapping__Group__1__Impl rule__InputHandlerConfigurationMapping__Group__2 ;
    public final void rule__InputHandlerConfigurationMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1757:1: ( rule__InputHandlerConfigurationMapping__Group__1__Impl rule__InputHandlerConfigurationMapping__Group__2 )
            // InternalComponentArchitecture.g:1758:2: rule__InputHandlerConfigurationMapping__Group__1__Impl rule__InputHandlerConfigurationMapping__Group__2
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
    // InternalComponentArchitecture.g:1765:1: rule__InputHandlerConfigurationMapping__Group__1__Impl : ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1769:1: ( ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1770:1: ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1770:1: ( ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 ) )
            // InternalComponentArchitecture.g:1771:2: ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerAssignment_1()); 
            // InternalComponentArchitecture.g:1772:2: ( rule__InputHandlerConfigurationMapping__HandlerAssignment_1 )
            // InternalComponentArchitecture.g:1772:3: rule__InputHandlerConfigurationMapping__HandlerAssignment_1
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
    // InternalComponentArchitecture.g:1780:1: rule__InputHandlerConfigurationMapping__Group__2 : rule__InputHandlerConfigurationMapping__Group__2__Impl rule__InputHandlerConfigurationMapping__Group__3 ;
    public final void rule__InputHandlerConfigurationMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1784:1: ( rule__InputHandlerConfigurationMapping__Group__2__Impl rule__InputHandlerConfigurationMapping__Group__3 )
            // InternalComponentArchitecture.g:1785:2: rule__InputHandlerConfigurationMapping__Group__2__Impl rule__InputHandlerConfigurationMapping__Group__3
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
    // InternalComponentArchitecture.g:1792:1: rule__InputHandlerConfigurationMapping__Group__2__Impl : ( 'configuration' ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1796:1: ( ( 'configuration' ) )
            // InternalComponentArchitecture.g:1797:1: ( 'configuration' )
            {
            // InternalComponentArchitecture.g:1797:1: ( 'configuration' )
            // InternalComponentArchitecture.g:1798:2: 'configuration'
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigurationKeyword_2()); 
            match(input,26,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1807:1: rule__InputHandlerConfigurationMapping__Group__3 : rule__InputHandlerConfigurationMapping__Group__3__Impl rule__InputHandlerConfigurationMapping__Group__4 ;
    public final void rule__InputHandlerConfigurationMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1811:1: ( rule__InputHandlerConfigurationMapping__Group__3__Impl rule__InputHandlerConfigurationMapping__Group__4 )
            // InternalComponentArchitecture.g:1812:2: rule__InputHandlerConfigurationMapping__Group__3__Impl rule__InputHandlerConfigurationMapping__Group__4
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
    // InternalComponentArchitecture.g:1819:1: rule__InputHandlerConfigurationMapping__Group__3__Impl : ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1823:1: ( ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1824:1: ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1824:1: ( ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 ) )
            // InternalComponentArchitecture.g:1825:2: ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigAssignment_3()); 
            // InternalComponentArchitecture.g:1826:2: ( rule__InputHandlerConfigurationMapping__ConfigAssignment_3 )
            // InternalComponentArchitecture.g:1826:3: rule__InputHandlerConfigurationMapping__ConfigAssignment_3
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
    // InternalComponentArchitecture.g:1834:1: rule__InputHandlerConfigurationMapping__Group__4 : rule__InputHandlerConfigurationMapping__Group__4__Impl ;
    public final void rule__InputHandlerConfigurationMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1838:1: ( rule__InputHandlerConfigurationMapping__Group__4__Impl )
            // InternalComponentArchitecture.g:1839:2: rule__InputHandlerConfigurationMapping__Group__4__Impl
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
    // InternalComponentArchitecture.g:1845:1: rule__InputHandlerConfigurationMapping__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__InputHandlerConfigurationMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1849:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1850:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1850:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1851:2: ( ';' )?
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getSemicolonKeyword_4()); 
            // InternalComponentArchitecture.g:1852:2: ( ';' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==20) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalComponentArchitecture.g:1852:3: ';'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalComponentArchitecture.g:1861:1: rule__OpcUaDeviceClientInstance__Group__0 : rule__OpcUaDeviceClientInstance__Group__0__Impl rule__OpcUaDeviceClientInstance__Group__1 ;
    public final void rule__OpcUaDeviceClientInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1865:1: ( rule__OpcUaDeviceClientInstance__Group__0__Impl rule__OpcUaDeviceClientInstance__Group__1 )
            // InternalComponentArchitecture.g:1866:2: rule__OpcUaDeviceClientInstance__Group__0__Impl rule__OpcUaDeviceClientInstance__Group__1
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
    // InternalComponentArchitecture.g:1873:1: rule__OpcUaDeviceClientInstance__Group__0__Impl : ( 'OpcUaDeviceClientInstance' ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1877:1: ( ( 'OpcUaDeviceClientInstance' ) )
            // InternalComponentArchitecture.g:1878:1: ( 'OpcUaDeviceClientInstance' )
            {
            // InternalComponentArchitecture.g:1878:1: ( 'OpcUaDeviceClientInstance' )
            // InternalComponentArchitecture.g:1879:2: 'OpcUaDeviceClientInstance'
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getOpcUaDeviceClientInstanceKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1888:1: rule__OpcUaDeviceClientInstance__Group__1 : rule__OpcUaDeviceClientInstance__Group__1__Impl rule__OpcUaDeviceClientInstance__Group__2 ;
    public final void rule__OpcUaDeviceClientInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1892:1: ( rule__OpcUaDeviceClientInstance__Group__1__Impl rule__OpcUaDeviceClientInstance__Group__2 )
            // InternalComponentArchitecture.g:1893:2: rule__OpcUaDeviceClientInstance__Group__1__Impl rule__OpcUaDeviceClientInstance__Group__2
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
    // InternalComponentArchitecture.g:1900:1: rule__OpcUaDeviceClientInstance__Group__1__Impl : ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1904:1: ( ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) ) )
            // InternalComponentArchitecture.g:1905:1: ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:1905:1: ( ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 ) )
            // InternalComponentArchitecture.g:1906:2: ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientAssignment_1()); 
            // InternalComponentArchitecture.g:1907:2: ( rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 )
            // InternalComponentArchitecture.g:1907:3: rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1
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
    // InternalComponentArchitecture.g:1915:1: rule__OpcUaDeviceClientInstance__Group__2 : rule__OpcUaDeviceClientInstance__Group__2__Impl rule__OpcUaDeviceClientInstance__Group__3 ;
    public final void rule__OpcUaDeviceClientInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1919:1: ( rule__OpcUaDeviceClientInstance__Group__2__Impl rule__OpcUaDeviceClientInstance__Group__3 )
            // InternalComponentArchitecture.g:1920:2: rule__OpcUaDeviceClientInstance__Group__2__Impl rule__OpcUaDeviceClientInstance__Group__3
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
    // InternalComponentArchitecture.g:1927:1: rule__OpcUaDeviceClientInstance__Group__2__Impl : ( 'deviceURI' ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1931:1: ( ( 'deviceURI' ) )
            // InternalComponentArchitecture.g:1932:1: ( 'deviceURI' )
            {
            // InternalComponentArchitecture.g:1932:1: ( 'deviceURI' )
            // InternalComponentArchitecture.g:1933:2: 'deviceURI'
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIKeyword_2()); 
            match(input,29,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:1942:1: rule__OpcUaDeviceClientInstance__Group__3 : rule__OpcUaDeviceClientInstance__Group__3__Impl rule__OpcUaDeviceClientInstance__Group__4 ;
    public final void rule__OpcUaDeviceClientInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1946:1: ( rule__OpcUaDeviceClientInstance__Group__3__Impl rule__OpcUaDeviceClientInstance__Group__4 )
            // InternalComponentArchitecture.g:1947:2: rule__OpcUaDeviceClientInstance__Group__3__Impl rule__OpcUaDeviceClientInstance__Group__4
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
    // InternalComponentArchitecture.g:1954:1: rule__OpcUaDeviceClientInstance__Group__3__Impl : ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1958:1: ( ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) ) )
            // InternalComponentArchitecture.g:1959:1: ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:1959:1: ( ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 ) )
            // InternalComponentArchitecture.g:1960:2: ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceURIAssignment_3()); 
            // InternalComponentArchitecture.g:1961:2: ( rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 )
            // InternalComponentArchitecture.g:1961:3: rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3
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
    // InternalComponentArchitecture.g:1969:1: rule__OpcUaDeviceClientInstance__Group__4 : rule__OpcUaDeviceClientInstance__Group__4__Impl ;
    public final void rule__OpcUaDeviceClientInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1973:1: ( rule__OpcUaDeviceClientInstance__Group__4__Impl )
            // InternalComponentArchitecture.g:1974:2: rule__OpcUaDeviceClientInstance__Group__4__Impl
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
    // InternalComponentArchitecture.g:1980:1: rule__OpcUaDeviceClientInstance__Group__4__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaDeviceClientInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:1984:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:1985:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:1985:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:1986:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getSemicolonKeyword_4()); 
            // InternalComponentArchitecture.g:1987:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalComponentArchitecture.g:1987:3: ';'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalComponentArchitecture.g:1996:1: rule__OpcUaReadServerInstance__Group__0 : rule__OpcUaReadServerInstance__Group__0__Impl rule__OpcUaReadServerInstance__Group__1 ;
    public final void rule__OpcUaReadServerInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2000:1: ( rule__OpcUaReadServerInstance__Group__0__Impl rule__OpcUaReadServerInstance__Group__1 )
            // InternalComponentArchitecture.g:2001:2: rule__OpcUaReadServerInstance__Group__0__Impl rule__OpcUaReadServerInstance__Group__1
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
    // InternalComponentArchitecture.g:2008:1: rule__OpcUaReadServerInstance__Group__0__Impl : ( 'OpcUaReadServerInstance' ) ;
    public final void rule__OpcUaReadServerInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2012:1: ( ( 'OpcUaReadServerInstance' ) )
            // InternalComponentArchitecture.g:2013:1: ( 'OpcUaReadServerInstance' )
            {
            // InternalComponentArchitecture.g:2013:1: ( 'OpcUaReadServerInstance' )
            // InternalComponentArchitecture.g:2014:2: 'OpcUaReadServerInstance'
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getOpcUaReadServerInstanceKeyword_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2023:1: rule__OpcUaReadServerInstance__Group__1 : rule__OpcUaReadServerInstance__Group__1__Impl rule__OpcUaReadServerInstance__Group__2 ;
    public final void rule__OpcUaReadServerInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2027:1: ( rule__OpcUaReadServerInstance__Group__1__Impl rule__OpcUaReadServerInstance__Group__2 )
            // InternalComponentArchitecture.g:2028:2: rule__OpcUaReadServerInstance__Group__1__Impl rule__OpcUaReadServerInstance__Group__2
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
    // InternalComponentArchitecture.g:2035:1: rule__OpcUaReadServerInstance__Group__1__Impl : ( ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 ) ) ;
    public final void rule__OpcUaReadServerInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2039:1: ( ( ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 ) ) )
            // InternalComponentArchitecture.g:2040:1: ( ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:2040:1: ( ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 ) )
            // InternalComponentArchitecture.g:2041:2: ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 )
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerAssignment_1()); 
            // InternalComponentArchitecture.g:2042:2: ( rule__OpcUaReadServerInstance__ReadServerAssignment_1 )
            // InternalComponentArchitecture.g:2042:3: rule__OpcUaReadServerInstance__ReadServerAssignment_1
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
    // InternalComponentArchitecture.g:2050:1: rule__OpcUaReadServerInstance__Group__2 : rule__OpcUaReadServerInstance__Group__2__Impl rule__OpcUaReadServerInstance__Group__3 ;
    public final void rule__OpcUaReadServerInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2054:1: ( rule__OpcUaReadServerInstance__Group__2__Impl rule__OpcUaReadServerInstance__Group__3 )
            // InternalComponentArchitecture.g:2055:2: rule__OpcUaReadServerInstance__Group__2__Impl rule__OpcUaReadServerInstance__Group__3
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
    // InternalComponentArchitecture.g:2062:1: rule__OpcUaReadServerInstance__Group__2__Impl : ( ( rule__OpcUaReadServerInstance__Group_2__0 )? ) ;
    public final void rule__OpcUaReadServerInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2066:1: ( ( ( rule__OpcUaReadServerInstance__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:2067:1: ( ( rule__OpcUaReadServerInstance__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:2067:1: ( ( rule__OpcUaReadServerInstance__Group_2__0 )? )
            // InternalComponentArchitecture.g:2068:2: ( rule__OpcUaReadServerInstance__Group_2__0 )?
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:2069:2: ( rule__OpcUaReadServerInstance__Group_2__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==31) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalComponentArchitecture.g:2069:3: rule__OpcUaReadServerInstance__Group_2__0
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
    // InternalComponentArchitecture.g:2077:1: rule__OpcUaReadServerInstance__Group__3 : rule__OpcUaReadServerInstance__Group__3__Impl ;
    public final void rule__OpcUaReadServerInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2081:1: ( rule__OpcUaReadServerInstance__Group__3__Impl )
            // InternalComponentArchitecture.g:2082:2: rule__OpcUaReadServerInstance__Group__3__Impl
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
    // InternalComponentArchitecture.g:2088:1: rule__OpcUaReadServerInstance__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__OpcUaReadServerInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2092:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:2093:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:2093:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:2094:2: ( ';' )?
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getSemicolonKeyword_3()); 
            // InternalComponentArchitecture.g:2095:2: ( ';' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalComponentArchitecture.g:2095:3: ';'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalComponentArchitecture.g:2104:1: rule__OpcUaReadServerInstance__Group_2__0 : rule__OpcUaReadServerInstance__Group_2__0__Impl rule__OpcUaReadServerInstance__Group_2__1 ;
    public final void rule__OpcUaReadServerInstance__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2108:1: ( rule__OpcUaReadServerInstance__Group_2__0__Impl rule__OpcUaReadServerInstance__Group_2__1 )
            // InternalComponentArchitecture.g:2109:2: rule__OpcUaReadServerInstance__Group_2__0__Impl rule__OpcUaReadServerInstance__Group_2__1
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
    // InternalComponentArchitecture.g:2116:1: rule__OpcUaReadServerInstance__Group_2__0__Impl : ( 'portNumber' ) ;
    public final void rule__OpcUaReadServerInstance__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2120:1: ( ( 'portNumber' ) )
            // InternalComponentArchitecture.g:2121:1: ( 'portNumber' )
            {
            // InternalComponentArchitecture.g:2121:1: ( 'portNumber' )
            // InternalComponentArchitecture.g:2122:2: 'portNumber'
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2131:1: rule__OpcUaReadServerInstance__Group_2__1 : rule__OpcUaReadServerInstance__Group_2__1__Impl ;
    public final void rule__OpcUaReadServerInstance__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2135:1: ( rule__OpcUaReadServerInstance__Group_2__1__Impl )
            // InternalComponentArchitecture.g:2136:2: rule__OpcUaReadServerInstance__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:2142:1: rule__OpcUaReadServerInstance__Group_2__1__Impl : ( ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 ) ) ;
    public final void rule__OpcUaReadServerInstance__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2146:1: ( ( ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:2147:1: ( ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:2147:1: ( ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 ) )
            // InternalComponentArchitecture.g:2148:2: ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 )
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getPortNumberAssignment_2_1()); 
            // InternalComponentArchitecture.g:2149:2: ( rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 )
            // InternalComponentArchitecture.g:2149:3: rule__OpcUaReadServerInstance__PortNumberAssignment_2_1
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
    // InternalComponentArchitecture.g:2158:1: rule__RequiredService__Group__0 : rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 ;
    public final void rule__RequiredService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2162:1: ( rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1 )
            // InternalComponentArchitecture.g:2163:2: rule__RequiredService__Group__0__Impl rule__RequiredService__Group__1
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
    // InternalComponentArchitecture.g:2170:1: rule__RequiredService__Group__0__Impl : ( 'RequiredService' ) ;
    public final void rule__RequiredService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2174:1: ( ( 'RequiredService' ) )
            // InternalComponentArchitecture.g:2175:1: ( 'RequiredService' )
            {
            // InternalComponentArchitecture.g:2175:1: ( 'RequiredService' )
            // InternalComponentArchitecture.g:2176:2: 'RequiredService'
            {
             before(grammarAccess.getRequiredServiceAccess().getRequiredServiceKeyword_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2185:1: rule__RequiredService__Group__1 : rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 ;
    public final void rule__RequiredService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2189:1: ( rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2 )
            // InternalComponentArchitecture.g:2190:2: rule__RequiredService__Group__1__Impl rule__RequiredService__Group__2
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
    // InternalComponentArchitecture.g:2197:1: rule__RequiredService__Group__1__Impl : ( ( rule__RequiredService__PortAssignment_1 ) ) ;
    public final void rule__RequiredService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2201:1: ( ( ( rule__RequiredService__PortAssignment_1 ) ) )
            // InternalComponentArchitecture.g:2202:1: ( ( rule__RequiredService__PortAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:2202:1: ( ( rule__RequiredService__PortAssignment_1 ) )
            // InternalComponentArchitecture.g:2203:2: ( rule__RequiredService__PortAssignment_1 )
            {
             before(grammarAccess.getRequiredServiceAccess().getPortAssignment_1()); 
            // InternalComponentArchitecture.g:2204:2: ( rule__RequiredService__PortAssignment_1 )
            // InternalComponentArchitecture.g:2204:3: rule__RequiredService__PortAssignment_1
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
    // InternalComponentArchitecture.g:2212:1: rule__RequiredService__Group__2 : rule__RequiredService__Group__2__Impl ;
    public final void rule__RequiredService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2216:1: ( rule__RequiredService__Group__2__Impl )
            // InternalComponentArchitecture.g:2217:2: rule__RequiredService__Group__2__Impl
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
    // InternalComponentArchitecture.g:2223:1: rule__RequiredService__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__RequiredService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2227:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:2228:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:2228:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:2229:2: ( ';' )?
            {
             before(grammarAccess.getRequiredServiceAccess().getSemicolonKeyword_2()); 
            // InternalComponentArchitecture.g:2230:2: ( ';' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalComponentArchitecture.g:2230:3: ';'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalComponentArchitecture.g:2239:1: rule__ProvidedService__Group__0 : rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1 ;
    public final void rule__ProvidedService__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2243:1: ( rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1 )
            // InternalComponentArchitecture.g:2244:2: rule__ProvidedService__Group__0__Impl rule__ProvidedService__Group__1
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
    // InternalComponentArchitecture.g:2251:1: rule__ProvidedService__Group__0__Impl : ( 'ProvidedService' ) ;
    public final void rule__ProvidedService__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2255:1: ( ( 'ProvidedService' ) )
            // InternalComponentArchitecture.g:2256:1: ( 'ProvidedService' )
            {
            // InternalComponentArchitecture.g:2256:1: ( 'ProvidedService' )
            // InternalComponentArchitecture.g:2257:2: 'ProvidedService'
            {
             before(grammarAccess.getProvidedServiceAccess().getProvidedServiceKeyword_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2266:1: rule__ProvidedService__Group__1 : rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2 ;
    public final void rule__ProvidedService__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2270:1: ( rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2 )
            // InternalComponentArchitecture.g:2271:2: rule__ProvidedService__Group__1__Impl rule__ProvidedService__Group__2
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
    // InternalComponentArchitecture.g:2278:1: rule__ProvidedService__Group__1__Impl : ( ( rule__ProvidedService__PortAssignment_1 ) ) ;
    public final void rule__ProvidedService__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2282:1: ( ( ( rule__ProvidedService__PortAssignment_1 ) ) )
            // InternalComponentArchitecture.g:2283:1: ( ( rule__ProvidedService__PortAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:2283:1: ( ( rule__ProvidedService__PortAssignment_1 ) )
            // InternalComponentArchitecture.g:2284:2: ( rule__ProvidedService__PortAssignment_1 )
            {
             before(grammarAccess.getProvidedServiceAccess().getPortAssignment_1()); 
            // InternalComponentArchitecture.g:2285:2: ( rule__ProvidedService__PortAssignment_1 )
            // InternalComponentArchitecture.g:2285:3: rule__ProvidedService__PortAssignment_1
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
    // InternalComponentArchitecture.g:2293:1: rule__ProvidedService__Group__2 : rule__ProvidedService__Group__2__Impl ;
    public final void rule__ProvidedService__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2297:1: ( rule__ProvidedService__Group__2__Impl )
            // InternalComponentArchitecture.g:2298:2: rule__ProvidedService__Group__2__Impl
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
    // InternalComponentArchitecture.g:2304:1: rule__ProvidedService__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__ProvidedService__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2308:1: ( ( ( ';' )? ) )
            // InternalComponentArchitecture.g:2309:1: ( ( ';' )? )
            {
            // InternalComponentArchitecture.g:2309:1: ( ( ';' )? )
            // InternalComponentArchitecture.g:2310:2: ( ';' )?
            {
             before(grammarAccess.getProvidedServiceAccess().getSemicolonKeyword_2()); 
            // InternalComponentArchitecture.g:2311:2: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalComponentArchitecture.g:2311:3: ';'
                    {
                    match(input,20,FOLLOW_2); 

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
    // InternalComponentArchitecture.g:2320:1: rule__CoordinationModuleMapping__Group__0 : rule__CoordinationModuleMapping__Group__0__Impl rule__CoordinationModuleMapping__Group__1 ;
    public final void rule__CoordinationModuleMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2324:1: ( rule__CoordinationModuleMapping__Group__0__Impl rule__CoordinationModuleMapping__Group__1 )
            // InternalComponentArchitecture.g:2325:2: rule__CoordinationModuleMapping__Group__0__Impl rule__CoordinationModuleMapping__Group__1
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
    // InternalComponentArchitecture.g:2332:1: rule__CoordinationModuleMapping__Group__0__Impl : ( 'CoordinationModuleMapping' ) ;
    public final void rule__CoordinationModuleMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2336:1: ( ( 'CoordinationModuleMapping' ) )
            // InternalComponentArchitecture.g:2337:1: ( 'CoordinationModuleMapping' )
            {
            // InternalComponentArchitecture.g:2337:1: ( 'CoordinationModuleMapping' )
            // InternalComponentArchitecture.g:2338:2: 'CoordinationModuleMapping'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordinationModuleMappingKeyword_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2347:1: rule__CoordinationModuleMapping__Group__1 : rule__CoordinationModuleMapping__Group__1__Impl rule__CoordinationModuleMapping__Group__2 ;
    public final void rule__CoordinationModuleMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2351:1: ( rule__CoordinationModuleMapping__Group__1__Impl rule__CoordinationModuleMapping__Group__2 )
            // InternalComponentArchitecture.g:2352:2: rule__CoordinationModuleMapping__Group__1__Impl rule__CoordinationModuleMapping__Group__2
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
    // InternalComponentArchitecture.g:2359:1: rule__CoordinationModuleMapping__Group__1__Impl : ( '{' ) ;
    public final void rule__CoordinationModuleMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2363:1: ( ( '{' ) )
            // InternalComponentArchitecture.g:2364:1: ( '{' )
            {
            // InternalComponentArchitecture.g:2364:1: ( '{' )
            // InternalComponentArchitecture.g:2365:2: '{'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2374:1: rule__CoordinationModuleMapping__Group__2 : rule__CoordinationModuleMapping__Group__2__Impl rule__CoordinationModuleMapping__Group__3 ;
    public final void rule__CoordinationModuleMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2378:1: ( rule__CoordinationModuleMapping__Group__2__Impl rule__CoordinationModuleMapping__Group__3 )
            // InternalComponentArchitecture.g:2379:2: rule__CoordinationModuleMapping__Group__2__Impl rule__CoordinationModuleMapping__Group__3
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
    // InternalComponentArchitecture.g:2386:1: rule__CoordinationModuleMapping__Group__2__Impl : ( 'moduleInstance' ) ;
    public final void rule__CoordinationModuleMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2390:1: ( ( 'moduleInstance' ) )
            // InternalComponentArchitecture.g:2391:1: ( 'moduleInstance' )
            {
            // InternalComponentArchitecture.g:2391:1: ( 'moduleInstance' )
            // InternalComponentArchitecture.g:2392:2: 'moduleInstance'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getModuleInstanceKeyword_2()); 
            match(input,35,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2401:1: rule__CoordinationModuleMapping__Group__3 : rule__CoordinationModuleMapping__Group__3__Impl rule__CoordinationModuleMapping__Group__4 ;
    public final void rule__CoordinationModuleMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2405:1: ( rule__CoordinationModuleMapping__Group__3__Impl rule__CoordinationModuleMapping__Group__4 )
            // InternalComponentArchitecture.g:2406:2: rule__CoordinationModuleMapping__Group__3__Impl rule__CoordinationModuleMapping__Group__4
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
    // InternalComponentArchitecture.g:2413:1: rule__CoordinationModuleMapping__Group__3__Impl : ( ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 ) ) ;
    public final void rule__CoordinationModuleMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2417:1: ( ( ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 ) ) )
            // InternalComponentArchitecture.g:2418:1: ( ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:2418:1: ( ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 ) )
            // InternalComponentArchitecture.g:2419:2: ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAssignment_3()); 
            // InternalComponentArchitecture.g:2420:2: ( rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 )
            // InternalComponentArchitecture.g:2420:3: rule__CoordinationModuleMapping__CoordModuleInstAssignment_3
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
    // InternalComponentArchitecture.g:2428:1: rule__CoordinationModuleMapping__Group__4 : rule__CoordinationModuleMapping__Group__4__Impl rule__CoordinationModuleMapping__Group__5 ;
    public final void rule__CoordinationModuleMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2432:1: ( rule__CoordinationModuleMapping__Group__4__Impl rule__CoordinationModuleMapping__Group__5 )
            // InternalComponentArchitecture.g:2433:2: rule__CoordinationModuleMapping__Group__4__Impl rule__CoordinationModuleMapping__Group__5
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
    // InternalComponentArchitecture.g:2440:1: rule__CoordinationModuleMapping__Group__4__Impl : ( 'realizedby' ) ;
    public final void rule__CoordinationModuleMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2444:1: ( ( 'realizedby' ) )
            // InternalComponentArchitecture.g:2445:1: ( 'realizedby' )
            {
            // InternalComponentArchitecture.g:2445:1: ( 'realizedby' )
            // InternalComponentArchitecture.g:2446:2: 'realizedby'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getRealizedbyKeyword_4()); 
            match(input,36,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2455:1: rule__CoordinationModuleMapping__Group__5 : rule__CoordinationModuleMapping__Group__5__Impl rule__CoordinationModuleMapping__Group__6 ;
    public final void rule__CoordinationModuleMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2459:1: ( rule__CoordinationModuleMapping__Group__5__Impl rule__CoordinationModuleMapping__Group__6 )
            // InternalComponentArchitecture.g:2460:2: rule__CoordinationModuleMapping__Group__5__Impl rule__CoordinationModuleMapping__Group__6
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
    // InternalComponentArchitecture.g:2467:1: rule__CoordinationModuleMapping__Group__5__Impl : ( ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 ) ) ;
    public final void rule__CoordinationModuleMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2471:1: ( ( ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 ) ) )
            // InternalComponentArchitecture.g:2472:1: ( ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 ) )
            {
            // InternalComponentArchitecture.g:2472:1: ( ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 ) )
            // InternalComponentArchitecture.g:2473:2: ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealAssignment_5()); 
            // InternalComponentArchitecture.g:2474:2: ( rule__CoordinationModuleMapping__CoordModRealAssignment_5 )
            // InternalComponentArchitecture.g:2474:3: rule__CoordinationModuleMapping__CoordModRealAssignment_5
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
    // InternalComponentArchitecture.g:2482:1: rule__CoordinationModuleMapping__Group__6 : rule__CoordinationModuleMapping__Group__6__Impl rule__CoordinationModuleMapping__Group__7 ;
    public final void rule__CoordinationModuleMapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2486:1: ( rule__CoordinationModuleMapping__Group__6__Impl rule__CoordinationModuleMapping__Group__7 )
            // InternalComponentArchitecture.g:2487:2: rule__CoordinationModuleMapping__Group__6__Impl rule__CoordinationModuleMapping__Group__7
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
    // InternalComponentArchitecture.g:2494:1: rule__CoordinationModuleMapping__Group__6__Impl : ( '{' ) ;
    public final void rule__CoordinationModuleMapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2498:1: ( ( '{' ) )
            // InternalComponentArchitecture.g:2499:1: ( '{' )
            {
            // InternalComponentArchitecture.g:2499:1: ( '{' )
            // InternalComponentArchitecture.g:2500:2: '{'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getLeftCurlyBracketKeyword_6()); 
            match(input,15,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2509:1: rule__CoordinationModuleMapping__Group__7 : rule__CoordinationModuleMapping__Group__7__Impl rule__CoordinationModuleMapping__Group__8 ;
    public final void rule__CoordinationModuleMapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2513:1: ( rule__CoordinationModuleMapping__Group__7__Impl rule__CoordinationModuleMapping__Group__8 )
            // InternalComponentArchitecture.g:2514:2: rule__CoordinationModuleMapping__Group__7__Impl rule__CoordinationModuleMapping__Group__8
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
    // InternalComponentArchitecture.g:2521:1: rule__CoordinationModuleMapping__Group__7__Impl : ( ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) ) ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* ) ) ;
    public final void rule__CoordinationModuleMapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2525:1: ( ( ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) ) ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* ) ) )
            // InternalComponentArchitecture.g:2526:1: ( ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) ) ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* ) )
            {
            // InternalComponentArchitecture.g:2526:1: ( ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) ) ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* ) )
            // InternalComponentArchitecture.g:2527:2: ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) ) ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* )
            {
            // InternalComponentArchitecture.g:2527:2: ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 ) )
            // InternalComponentArchitecture.g:2528:3: ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7()); 
            // InternalComponentArchitecture.g:2529:3: ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )
            // InternalComponentArchitecture.g:2529:4: rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7
            {
            pushFollow(FOLLOW_28);
            rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7()); 

            }

            // InternalComponentArchitecture.g:2532:2: ( ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )* )
            // InternalComponentArchitecture.g:2533:3: ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )*
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordInterCompInstMappingAssignment_7()); 
            // InternalComponentArchitecture.g:2534:3: ( rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalComponentArchitecture.g:2534:4: rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7
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
    // InternalComponentArchitecture.g:2543:1: rule__CoordinationModuleMapping__Group__8 : rule__CoordinationModuleMapping__Group__8__Impl rule__CoordinationModuleMapping__Group__9 ;
    public final void rule__CoordinationModuleMapping__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2547:1: ( rule__CoordinationModuleMapping__Group__8__Impl rule__CoordinationModuleMapping__Group__9 )
            // InternalComponentArchitecture.g:2548:2: rule__CoordinationModuleMapping__Group__8__Impl rule__CoordinationModuleMapping__Group__9
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
    // InternalComponentArchitecture.g:2555:1: rule__CoordinationModuleMapping__Group__8__Impl : ( '}' ) ;
    public final void rule__CoordinationModuleMapping__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2559:1: ( ( '}' ) )
            // InternalComponentArchitecture.g:2560:1: ( '}' )
            {
            // InternalComponentArchitecture.g:2560:1: ( '}' )
            // InternalComponentArchitecture.g:2561:2: '}'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_8()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2570:1: rule__CoordinationModuleMapping__Group__9 : rule__CoordinationModuleMapping__Group__9__Impl ;
    public final void rule__CoordinationModuleMapping__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2574:1: ( rule__CoordinationModuleMapping__Group__9__Impl )
            // InternalComponentArchitecture.g:2575:2: rule__CoordinationModuleMapping__Group__9__Impl
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
    // InternalComponentArchitecture.g:2581:1: rule__CoordinationModuleMapping__Group__9__Impl : ( '}' ) ;
    public final void rule__CoordinationModuleMapping__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2585:1: ( ( '}' ) )
            // InternalComponentArchitecture.g:2586:1: ( '}' )
            {
            // InternalComponentArchitecture.g:2586:1: ( '}' )
            // InternalComponentArchitecture.g:2587:2: '}'
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getRightCurlyBracketKeyword_9()); 
            match(input,16,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2597:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__0 : rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__1 ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2601:1: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__1 )
            // InternalComponentArchitecture.g:2602:2: rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__1
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
    // InternalComponentArchitecture.g:2609:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl : ( 'interfaceInstance' ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2613:1: ( ( 'interfaceInstance' ) )
            // InternalComponentArchitecture.g:2614:1: ( 'interfaceInstance' )
            {
            // InternalComponentArchitecture.g:2614:1: ( 'interfaceInstance' )
            // InternalComponentArchitecture.g:2615:2: 'interfaceInstance'
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getInterfaceInstanceKeyword_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2624:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__1 : rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__2 ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2628:1: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__2 )
            // InternalComponentArchitecture.g:2629:2: rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__2
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
    // InternalComponentArchitecture.g:2636:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl : ( ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 ) ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2640:1: ( ( ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 ) ) )
            // InternalComponentArchitecture.g:2641:1: ( ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:2641:1: ( ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 ) )
            // InternalComponentArchitecture.g:2642:2: ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 )
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstAssignment_1()); 
            // InternalComponentArchitecture.g:2643:2: ( rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 )
            // InternalComponentArchitecture.g:2643:3: rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1
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
    // InternalComponentArchitecture.g:2651:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__2 : rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__3 ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2655:1: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__3 )
            // InternalComponentArchitecture.g:2656:2: rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl rule__CoordinationInterfaceComponentInstanceMapping__Group__3
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
    // InternalComponentArchitecture.g:2663:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl : ( 'realizedby' ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2667:1: ( ( 'realizedby' ) )
            // InternalComponentArchitecture.g:2668:1: ( 'realizedby' )
            {
            // InternalComponentArchitecture.g:2668:1: ( 'realizedby' )
            // InternalComponentArchitecture.g:2669:2: 'realizedby'
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getRealizedbyKeyword_2()); 
            match(input,36,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2678:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__3 : rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2682:1: ( rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl )
            // InternalComponentArchitecture.g:2683:2: rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl
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
    // InternalComponentArchitecture.g:2689:1: rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl : ( ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 ) ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2693:1: ( ( ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 ) ) )
            // InternalComponentArchitecture.g:2694:1: ( ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 ) )
            {
            // InternalComponentArchitecture.g:2694:1: ( ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 ) )
            // InternalComponentArchitecture.g:2695:2: ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 )
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstAssignment_3()); 
            // InternalComponentArchitecture.g:2696:2: ( rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 )
            // InternalComponentArchitecture.g:2696:3: rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3
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
    // InternalComponentArchitecture.g:2705:1: rule__TaskRealizationModelRef__Group__0 : rule__TaskRealizationModelRef__Group__0__Impl rule__TaskRealizationModelRef__Group__1 ;
    public final void rule__TaskRealizationModelRef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2709:1: ( rule__TaskRealizationModelRef__Group__0__Impl rule__TaskRealizationModelRef__Group__1 )
            // InternalComponentArchitecture.g:2710:2: rule__TaskRealizationModelRef__Group__0__Impl rule__TaskRealizationModelRef__Group__1
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
    // InternalComponentArchitecture.g:2717:1: rule__TaskRealizationModelRef__Group__0__Impl : ( 'BehaviorTaskRef' ) ;
    public final void rule__TaskRealizationModelRef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2721:1: ( ( 'BehaviorTaskRef' ) )
            // InternalComponentArchitecture.g:2722:1: ( 'BehaviorTaskRef' )
            {
            // InternalComponentArchitecture.g:2722:1: ( 'BehaviorTaskRef' )
            // InternalComponentArchitecture.g:2723:2: 'BehaviorTaskRef'
            {
             before(grammarAccess.getTaskRealizationModelRefAccess().getBehaviorTaskRefKeyword_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2732:1: rule__TaskRealizationModelRef__Group__1 : rule__TaskRealizationModelRef__Group__1__Impl ;
    public final void rule__TaskRealizationModelRef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2736:1: ( rule__TaskRealizationModelRef__Group__1__Impl )
            // InternalComponentArchitecture.g:2737:2: rule__TaskRealizationModelRef__Group__1__Impl
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
    // InternalComponentArchitecture.g:2743:1: rule__TaskRealizationModelRef__Group__1__Impl : ( ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 ) ) ;
    public final void rule__TaskRealizationModelRef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2747:1: ( ( ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 ) ) )
            // InternalComponentArchitecture.g:2748:1: ( ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 ) )
            {
            // InternalComponentArchitecture.g:2748:1: ( ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 ) )
            // InternalComponentArchitecture.g:2749:2: ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 )
            {
             before(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefAssignment_1()); 
            // InternalComponentArchitecture.g:2750:2: ( rule__TaskRealizationModelRef__TaskModelRefAssignment_1 )
            // InternalComponentArchitecture.g:2750:3: rule__TaskRealizationModelRef__TaskModelRefAssignment_1
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
    // InternalComponentArchitecture.g:2759:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2763:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalComponentArchitecture.g:2764:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalComponentArchitecture.g:2771:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2775:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:2776:1: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:2776:1: ( RULE_ID )
            // InternalComponentArchitecture.g:2777:2: RULE_ID
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
    // InternalComponentArchitecture.g:2786:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2790:1: ( rule__FQN__Group__1__Impl )
            // InternalComponentArchitecture.g:2791:2: rule__FQN__Group__1__Impl
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
    // InternalComponentArchitecture.g:2797:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2801:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalComponentArchitecture.g:2802:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalComponentArchitecture.g:2802:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalComponentArchitecture.g:2803:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalComponentArchitecture.g:2804:2: ( rule__FQN__Group_1__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalComponentArchitecture.g:2804:3: rule__FQN__Group_1__0
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
    // InternalComponentArchitecture.g:2813:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2817:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalComponentArchitecture.g:2818:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalComponentArchitecture.g:2825:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2829:1: ( ( '.' ) )
            // InternalComponentArchitecture.g:2830:1: ( '.' )
            {
            // InternalComponentArchitecture.g:2830:1: ( '.' )
            // InternalComponentArchitecture.g:2831:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2840:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2844:1: ( rule__FQN__Group_1__1__Impl )
            // InternalComponentArchitecture.g:2845:2: rule__FQN__Group_1__1__Impl
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
    // InternalComponentArchitecture.g:2851:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2855:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:2856:1: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:2856:1: ( RULE_ID )
            // InternalComponentArchitecture.g:2857:2: RULE_ID
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
    // InternalComponentArchitecture.g:2867:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2871:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalComponentArchitecture.g:2872:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalComponentArchitecture.g:2879:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2883:1: ( ( ( '-' )? ) )
            // InternalComponentArchitecture.g:2884:1: ( ( '-' )? )
            {
            // InternalComponentArchitecture.g:2884:1: ( ( '-' )? )
            // InternalComponentArchitecture.g:2885:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalComponentArchitecture.g:2886:2: ( '-' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==40) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalComponentArchitecture.g:2886:3: '-'
                    {
                    match(input,40,FOLLOW_2); 

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
    // InternalComponentArchitecture.g:2894:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2898:1: ( rule__EInt__Group__1__Impl )
            // InternalComponentArchitecture.g:2899:2: rule__EInt__Group__1__Impl
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
    // InternalComponentArchitecture.g:2905:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2909:1: ( ( RULE_INT ) )
            // InternalComponentArchitecture.g:2910:1: ( RULE_INT )
            {
            // InternalComponentArchitecture.g:2910:1: ( RULE_INT )
            // InternalComponentArchitecture.g:2911:2: RULE_INT
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
    // InternalComponentArchitecture.g:2921:1: rule__ACE_SmartSoft__Group__0 : rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 ;
    public final void rule__ACE_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2925:1: ( rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 )
            // InternalComponentArchitecture.g:2926:2: rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1
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
    // InternalComponentArchitecture.g:2933:1: rule__ACE_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__ACE_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2937:1: ( ( () ) )
            // InternalComponentArchitecture.g:2938:1: ( () )
            {
            // InternalComponentArchitecture.g:2938:1: ( () )
            // InternalComponentArchitecture.g:2939:2: ()
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); 
            // InternalComponentArchitecture.g:2940:2: ()
            // InternalComponentArchitecture.g:2940:3: 
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
    // InternalComponentArchitecture.g:2948:1: rule__ACE_SmartSoft__Group__1 : rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 ;
    public final void rule__ACE_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2952:1: ( rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 )
            // InternalComponentArchitecture.g:2953:2: rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2
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
    // InternalComponentArchitecture.g:2960:1: rule__ACE_SmartSoft__Group__1__Impl : ( 'ACE_SmartSoft' ) ;
    public final void rule__ACE_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2964:1: ( ( 'ACE_SmartSoft' ) )
            // InternalComponentArchitecture.g:2965:1: ( 'ACE_SmartSoft' )
            {
            // InternalComponentArchitecture.g:2965:1: ( 'ACE_SmartSoft' )
            // InternalComponentArchitecture.g:2966:2: 'ACE_SmartSoft'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:2975:1: rule__ACE_SmartSoft__Group__2 : rule__ACE_SmartSoft__Group__2__Impl ;
    public final void rule__ACE_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2979:1: ( rule__ACE_SmartSoft__Group__2__Impl )
            // InternalComponentArchitecture.g:2980:2: rule__ACE_SmartSoft__Group__2__Impl
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
    // InternalComponentArchitecture.g:2986:1: rule__ACE_SmartSoft__Group__2__Impl : ( ( rule__ACE_SmartSoft__Group_2__0 )? ) ;
    public final void rule__ACE_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:2990:1: ( ( ( rule__ACE_SmartSoft__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:2991:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:2991:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            // InternalComponentArchitecture.g:2992:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:2993:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==42) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalComponentArchitecture.g:2993:3: rule__ACE_SmartSoft__Group_2__0
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
    // InternalComponentArchitecture.g:3002:1: rule__ACE_SmartSoft__Group_2__0 : rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 ;
    public final void rule__ACE_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3006:1: ( rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 )
            // InternalComponentArchitecture.g:3007:2: rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1
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
    // InternalComponentArchitecture.g:3014:1: rule__ACE_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__ACE_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3018:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:3019:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:3019:1: ( 'description' )
            // InternalComponentArchitecture.g:3020:2: 'description'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3029:1: rule__ACE_SmartSoft__Group_2__1 : rule__ACE_SmartSoft__Group_2__1__Impl ;
    public final void rule__ACE_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3033:1: ( rule__ACE_SmartSoft__Group_2__1__Impl )
            // InternalComponentArchitecture.g:3034:2: rule__ACE_SmartSoft__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:3040:1: rule__ACE_SmartSoft__Group_2__1__Impl : ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__ACE_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3044:1: ( ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:3045:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:3045:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:3046:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:3047:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:3047:3: rule__ACE_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentArchitecture.g:3056:1: rule__OpcUa_SeRoNet__Group__0 : rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 ;
    public final void rule__OpcUa_SeRoNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3060:1: ( rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 )
            // InternalComponentArchitecture.g:3061:2: rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1
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
    // InternalComponentArchitecture.g:3068:1: rule__OpcUa_SeRoNet__Group__0__Impl : ( () ) ;
    public final void rule__OpcUa_SeRoNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3072:1: ( ( () ) )
            // InternalComponentArchitecture.g:3073:1: ( () )
            {
            // InternalComponentArchitecture.g:3073:1: ( () )
            // InternalComponentArchitecture.g:3074:2: ()
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); 
            // InternalComponentArchitecture.g:3075:2: ()
            // InternalComponentArchitecture.g:3075:3: 
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
    // InternalComponentArchitecture.g:3083:1: rule__OpcUa_SeRoNet__Group__1 : rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 ;
    public final void rule__OpcUa_SeRoNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3087:1: ( rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 )
            // InternalComponentArchitecture.g:3088:2: rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2
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
    // InternalComponentArchitecture.g:3095:1: rule__OpcUa_SeRoNet__Group__1__Impl : ( 'OpcUa_SeRoNet' ) ;
    public final void rule__OpcUa_SeRoNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3099:1: ( ( 'OpcUa_SeRoNet' ) )
            // InternalComponentArchitecture.g:3100:1: ( 'OpcUa_SeRoNet' )
            {
            // InternalComponentArchitecture.g:3100:1: ( 'OpcUa_SeRoNet' )
            // InternalComponentArchitecture.g:3101:2: 'OpcUa_SeRoNet'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); 
            match(input,43,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3110:1: rule__OpcUa_SeRoNet__Group__2 : rule__OpcUa_SeRoNet__Group__2__Impl ;
    public final void rule__OpcUa_SeRoNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3114:1: ( rule__OpcUa_SeRoNet__Group__2__Impl )
            // InternalComponentArchitecture.g:3115:2: rule__OpcUa_SeRoNet__Group__2__Impl
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
    // InternalComponentArchitecture.g:3121:1: rule__OpcUa_SeRoNet__Group__2__Impl : ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) ;
    public final void rule__OpcUa_SeRoNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3125:1: ( ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:3126:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:3126:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            // InternalComponentArchitecture.g:3127:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:3128:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==42) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalComponentArchitecture.g:3128:3: rule__OpcUa_SeRoNet__Group_2__0
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
    // InternalComponentArchitecture.g:3137:1: rule__OpcUa_SeRoNet__Group_2__0 : rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 ;
    public final void rule__OpcUa_SeRoNet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3141:1: ( rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 )
            // InternalComponentArchitecture.g:3142:2: rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1
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
    // InternalComponentArchitecture.g:3149:1: rule__OpcUa_SeRoNet__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3153:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:3154:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:3154:1: ( 'description' )
            // InternalComponentArchitecture.g:3155:2: 'description'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3164:1: rule__OpcUa_SeRoNet__Group_2__1 : rule__OpcUa_SeRoNet__Group_2__1__Impl ;
    public final void rule__OpcUa_SeRoNet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3168:1: ( rule__OpcUa_SeRoNet__Group_2__1__Impl )
            // InternalComponentArchitecture.g:3169:2: rule__OpcUa_SeRoNet__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:3175:1: rule__OpcUa_SeRoNet__Group_2__1__Impl : ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3179:1: ( ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:3180:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:3180:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:3181:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:3182:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:3182:3: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1
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
    // InternalComponentArchitecture.g:3191:1: rule__CORBA_SmartSoft__Group__0 : rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 ;
    public final void rule__CORBA_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3195:1: ( rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 )
            // InternalComponentArchitecture.g:3196:2: rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1
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
    // InternalComponentArchitecture.g:3203:1: rule__CORBA_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__CORBA_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3207:1: ( ( () ) )
            // InternalComponentArchitecture.g:3208:1: ( () )
            {
            // InternalComponentArchitecture.g:3208:1: ( () )
            // InternalComponentArchitecture.g:3209:2: ()
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); 
            // InternalComponentArchitecture.g:3210:2: ()
            // InternalComponentArchitecture.g:3210:3: 
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
    // InternalComponentArchitecture.g:3218:1: rule__CORBA_SmartSoft__Group__1 : rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 ;
    public final void rule__CORBA_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3222:1: ( rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 )
            // InternalComponentArchitecture.g:3223:2: rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2
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
    // InternalComponentArchitecture.g:3230:1: rule__CORBA_SmartSoft__Group__1__Impl : ( 'CORBA_SmartSoft' ) ;
    public final void rule__CORBA_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3234:1: ( ( 'CORBA_SmartSoft' ) )
            // InternalComponentArchitecture.g:3235:1: ( 'CORBA_SmartSoft' )
            {
            // InternalComponentArchitecture.g:3235:1: ( 'CORBA_SmartSoft' )
            // InternalComponentArchitecture.g:3236:2: 'CORBA_SmartSoft'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); 
            match(input,44,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3245:1: rule__CORBA_SmartSoft__Group__2 : rule__CORBA_SmartSoft__Group__2__Impl ;
    public final void rule__CORBA_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3249:1: ( rule__CORBA_SmartSoft__Group__2__Impl )
            // InternalComponentArchitecture.g:3250:2: rule__CORBA_SmartSoft__Group__2__Impl
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
    // InternalComponentArchitecture.g:3256:1: rule__CORBA_SmartSoft__Group__2__Impl : ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) ;
    public final void rule__CORBA_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3260:1: ( ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:3261:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:3261:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            // InternalComponentArchitecture.g:3262:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:3263:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==42) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalComponentArchitecture.g:3263:3: rule__CORBA_SmartSoft__Group_2__0
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
    // InternalComponentArchitecture.g:3272:1: rule__CORBA_SmartSoft__Group_2__0 : rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 ;
    public final void rule__CORBA_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3276:1: ( rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 )
            // InternalComponentArchitecture.g:3277:2: rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1
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
    // InternalComponentArchitecture.g:3284:1: rule__CORBA_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__CORBA_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3288:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:3289:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:3289:1: ( 'description' )
            // InternalComponentArchitecture.g:3290:2: 'description'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3299:1: rule__CORBA_SmartSoft__Group_2__1 : rule__CORBA_SmartSoft__Group_2__1__Impl ;
    public final void rule__CORBA_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3303:1: ( rule__CORBA_SmartSoft__Group_2__1__Impl )
            // InternalComponentArchitecture.g:3304:2: rule__CORBA_SmartSoft__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:3310:1: rule__CORBA_SmartSoft__Group_2__1__Impl : ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__CORBA_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3314:1: ( ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:3315:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:3315:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:3316:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:3317:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:3317:3: rule__CORBA_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentArchitecture.g:3326:1: rule__DDS_SmartSoft__Group__0 : rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 ;
    public final void rule__DDS_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3330:1: ( rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 )
            // InternalComponentArchitecture.g:3331:2: rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1
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
    // InternalComponentArchitecture.g:3338:1: rule__DDS_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__DDS_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3342:1: ( ( () ) )
            // InternalComponentArchitecture.g:3343:1: ( () )
            {
            // InternalComponentArchitecture.g:3343:1: ( () )
            // InternalComponentArchitecture.g:3344:2: ()
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); 
            // InternalComponentArchitecture.g:3345:2: ()
            // InternalComponentArchitecture.g:3345:3: 
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
    // InternalComponentArchitecture.g:3353:1: rule__DDS_SmartSoft__Group__1 : rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 ;
    public final void rule__DDS_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3357:1: ( rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 )
            // InternalComponentArchitecture.g:3358:2: rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2
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
    // InternalComponentArchitecture.g:3365:1: rule__DDS_SmartSoft__Group__1__Impl : ( 'DDS_SmartSoft' ) ;
    public final void rule__DDS_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3369:1: ( ( 'DDS_SmartSoft' ) )
            // InternalComponentArchitecture.g:3370:1: ( 'DDS_SmartSoft' )
            {
            // InternalComponentArchitecture.g:3370:1: ( 'DDS_SmartSoft' )
            // InternalComponentArchitecture.g:3371:2: 'DDS_SmartSoft'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); 
            match(input,45,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3380:1: rule__DDS_SmartSoft__Group__2 : rule__DDS_SmartSoft__Group__2__Impl ;
    public final void rule__DDS_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3384:1: ( rule__DDS_SmartSoft__Group__2__Impl )
            // InternalComponentArchitecture.g:3385:2: rule__DDS_SmartSoft__Group__2__Impl
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
    // InternalComponentArchitecture.g:3391:1: rule__DDS_SmartSoft__Group__2__Impl : ( ( rule__DDS_SmartSoft__Group_2__0 )? ) ;
    public final void rule__DDS_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3395:1: ( ( ( rule__DDS_SmartSoft__Group_2__0 )? ) )
            // InternalComponentArchitecture.g:3396:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            {
            // InternalComponentArchitecture.g:3396:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            // InternalComponentArchitecture.g:3397:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); 
            // InternalComponentArchitecture.g:3398:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==42) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalComponentArchitecture.g:3398:3: rule__DDS_SmartSoft__Group_2__0
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
    // InternalComponentArchitecture.g:3407:1: rule__DDS_SmartSoft__Group_2__0 : rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 ;
    public final void rule__DDS_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3411:1: ( rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 )
            // InternalComponentArchitecture.g:3412:2: rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1
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
    // InternalComponentArchitecture.g:3419:1: rule__DDS_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__DDS_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3423:1: ( ( 'description' ) )
            // InternalComponentArchitecture.g:3424:1: ( 'description' )
            {
            // InternalComponentArchitecture.g:3424:1: ( 'description' )
            // InternalComponentArchitecture.g:3425:2: 'description'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalComponentArchitecture.g:3434:1: rule__DDS_SmartSoft__Group_2__1 : rule__DDS_SmartSoft__Group_2__1__Impl ;
    public final void rule__DDS_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3438:1: ( rule__DDS_SmartSoft__Group_2__1__Impl )
            // InternalComponentArchitecture.g:3439:2: rule__DDS_SmartSoft__Group_2__1__Impl
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
    // InternalComponentArchitecture.g:3445:1: rule__DDS_SmartSoft__Group_2__1__Impl : ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__DDS_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3449:1: ( ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalComponentArchitecture.g:3450:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalComponentArchitecture.g:3450:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalComponentArchitecture.g:3451:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalComponentArchitecture.g:3452:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            // InternalComponentArchitecture.g:3452:3: rule__DDS_SmartSoft__DescriptionAssignment_2_1
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
    // InternalComponentArchitecture.g:3461:1: rule__SystemComponentArchitecture__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SystemComponentArchitecture__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3465:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3466:2: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:3466:2: ( RULE_ID )
            // InternalComponentArchitecture.g:3467:3: RULE_ID
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
    // InternalComponentArchitecture.g:3476:1: rule__SystemComponentArchitecture__ActivityArchAssignment_3_1 : ( ( ruleFQN ) ) ;
    public final void rule__SystemComponentArchitecture__ActivityArchAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3480:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3481:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3481:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3482:3: ( ruleFQN )
            {
             before(grammarAccess.getSystemComponentArchitectureAccess().getActivityArchActivityArchitectureModelCrossReference_3_1_0()); 
            // InternalComponentArchitecture.g:3483:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3484:4: ruleFQN
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
    // InternalComponentArchitecture.g:3495:1: rule__SystemComponentArchitecture__ComponentsAssignment_5 : ( ruleComponentInstance ) ;
    public final void rule__SystemComponentArchitecture__ComponentsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3499:1: ( ( ruleComponentInstance ) )
            // InternalComponentArchitecture.g:3500:2: ( ruleComponentInstance )
            {
            // InternalComponentArchitecture.g:3500:2: ( ruleComponentInstance )
            // InternalComponentArchitecture.g:3501:3: ruleComponentInstance
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
    // InternalComponentArchitecture.g:3510:1: rule__SystemComponentArchitecture__ConnectionsAssignment_6 : ( ruleConnection ) ;
    public final void rule__SystemComponentArchitecture__ConnectionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3514:1: ( ( ruleConnection ) )
            // InternalComponentArchitecture.g:3515:2: ( ruleConnection )
            {
            // InternalComponentArchitecture.g:3515:2: ( ruleConnection )
            // InternalComponentArchitecture.g:3516:3: ruleConnection
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
    // InternalComponentArchitecture.g:3525:1: rule__SystemComponentArchitecture__ExtensionsAssignment_7 : ( ruleSystemExtension ) ;
    public final void rule__SystemComponentArchitecture__ExtensionsAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3529:1: ( ( ruleSystemExtension ) )
            // InternalComponentArchitecture.g:3530:2: ( ruleSystemExtension )
            {
            // InternalComponentArchitecture.g:3530:2: ( ruleSystemExtension )
            // InternalComponentArchitecture.g:3531:3: ruleSystemExtension
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
    // InternalComponentArchitecture.g:3540:1: rule__Connection__FromAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__Connection__FromAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3544:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3545:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3545:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3546:3: ( ruleFQN )
            {
             before(grammarAccess.getConnectionAccess().getFromRequiredServiceCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3547:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3548:4: ruleFQN
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
    // InternalComponentArchitecture.g:3559:1: rule__Connection__ToAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__Connection__ToAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3563:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3564:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3564:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3565:3: ( ruleFQN )
            {
             before(grammarAccess.getConnectionAccess().getToProvidedServiceCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3566:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3567:4: ruleFQN
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
    // InternalComponentArchitecture.g:3578:1: rule__Connection__MiddlewareSelectionAssignment_4_1 : ( ruleRoboticMiddleware ) ;
    public final void rule__Connection__MiddlewareSelectionAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3582:1: ( ( ruleRoboticMiddleware ) )
            // InternalComponentArchitecture.g:3583:2: ( ruleRoboticMiddleware )
            {
            // InternalComponentArchitecture.g:3583:2: ( ruleRoboticMiddleware )
            // InternalComponentArchitecture.g:3584:3: ruleRoboticMiddleware
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
    // InternalComponentArchitecture.g:3593:1: rule__ComponentInstance__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComponentInstance__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3597:1: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3598:2: ( RULE_ID )
            {
            // InternalComponentArchitecture.g:3598:2: ( RULE_ID )
            // InternalComponentArchitecture.g:3599:3: RULE_ID
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
    // InternalComponentArchitecture.g:3608:1: rule__ComponentInstance__ComponentAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentInstance__ComponentAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3612:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3613:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3613:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3614:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentInstanceAccess().getComponentComponentDefinitionCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3615:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3616:4: ruleFQN
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
    // InternalComponentArchitecture.g:3627:1: rule__ComponentInstance__PortsAssignment_5 : ( ruleServiceInstance ) ;
    public final void rule__ComponentInstance__PortsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3631:1: ( ( ruleServiceInstance ) )
            // InternalComponentArchitecture.g:3632:2: ( ruleServiceInstance )
            {
            // InternalComponentArchitecture.g:3632:2: ( ruleServiceInstance )
            // InternalComponentArchitecture.g:3633:3: ruleServiceInstance
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
    // InternalComponentArchitecture.g:3642:1: rule__ComponentInstance__ExtensionsAssignment_6 : ( ruleComponentInstanceExtension ) ;
    public final void rule__ComponentInstance__ExtensionsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3646:1: ( ( ruleComponentInstanceExtension ) )
            // InternalComponentArchitecture.g:3647:2: ( ruleComponentInstanceExtension )
            {
            // InternalComponentArchitecture.g:3647:2: ( ruleComponentInstanceExtension )
            // InternalComponentArchitecture.g:3648:3: ruleComponentInstanceExtension
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
    // InternalComponentArchitecture.g:3657:1: rule__ParameterStructInstance__ParameterAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterStructInstance__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3661:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3662:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3662:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3663:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterStructInstanceAccess().getParameterComponentParameterInstanceCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3664:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3665:4: ruleFQN
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
    // InternalComponentArchitecture.g:3676:1: rule__ActivityConfigurationMapping__ActivityAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ActivityConfigurationMapping__ActivityAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3680:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3681:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3681:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3682:3: ( ruleFQN )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getActivityActivityCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3683:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3684:4: ruleFQN
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
    // InternalComponentArchitecture.g:3695:1: rule__ActivityConfigurationMapping__ConfigAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__ActivityConfigurationMapping__ConfigAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3699:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3700:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3700:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3701:3: ( ruleFQN )
            {
             before(grammarAccess.getActivityConfigurationMappingAccess().getConfigActivityNodeCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3702:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3703:4: ruleFQN
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
    // InternalComponentArchitecture.g:3714:1: rule__InputHandlerConfigurationMapping__HandlerAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__InputHandlerConfigurationMapping__HandlerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3718:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3719:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3719:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3720:3: ( ruleFQN )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getHandlerInputHandlerCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3721:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3722:4: ruleFQN
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
    // InternalComponentArchitecture.g:3733:1: rule__InputHandlerConfigurationMapping__ConfigAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__InputHandlerConfigurationMapping__ConfigAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3737:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3738:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3738:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3739:3: ( ruleFQN )
            {
             before(grammarAccess.getInputHandlerConfigurationMappingAccess().getConfigInputHandlerNodeCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3740:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3741:4: ruleFQN
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
    // InternalComponentArchitecture.g:3752:1: rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__OpcUaDeviceClientInstance__DeviceClientAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3756:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3757:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3757:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3758:3: ( ruleFQN )
            {
             before(grammarAccess.getOpcUaDeviceClientInstanceAccess().getDeviceClientOpcUaDeviceClientCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3759:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3760:4: ruleFQN
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
    // InternalComponentArchitecture.g:3771:1: rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3 : ( ruleEString ) ;
    public final void rule__OpcUaDeviceClientInstance__DeviceURIAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3775:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:3776:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:3776:2: ( ruleEString )
            // InternalComponentArchitecture.g:3777:3: ruleEString
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
    // InternalComponentArchitecture.g:3786:1: rule__OpcUaReadServerInstance__ReadServerAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__OpcUaReadServerInstance__ReadServerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3790:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3791:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3791:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3792:3: ( ruleFQN )
            {
             before(grammarAccess.getOpcUaReadServerInstanceAccess().getReadServerOpcUaReadServerCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3793:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3794:4: ruleFQN
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
    // InternalComponentArchitecture.g:3805:1: rule__OpcUaReadServerInstance__PortNumberAssignment_2_1 : ( ruleEInt ) ;
    public final void rule__OpcUaReadServerInstance__PortNumberAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3809:1: ( ( ruleEInt ) )
            // InternalComponentArchitecture.g:3810:2: ( ruleEInt )
            {
            // InternalComponentArchitecture.g:3810:2: ( ruleEInt )
            // InternalComponentArchitecture.g:3811:3: ruleEInt
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
    // InternalComponentArchitecture.g:3820:1: rule__RequiredService__PortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__RequiredService__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3824:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:3825:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:3825:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3826:3: ( RULE_ID )
            {
             before(grammarAccess.getRequiredServiceAccess().getPortComponentPortCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3827:3: ( RULE_ID )
            // InternalComponentArchitecture.g:3828:4: RULE_ID
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
    // InternalComponentArchitecture.g:3839:1: rule__ProvidedService__PortAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__ProvidedService__PortAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3843:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:3844:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:3844:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3845:3: ( RULE_ID )
            {
             before(grammarAccess.getProvidedServiceAccess().getPortComponentPortCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3846:3: ( RULE_ID )
            // InternalComponentArchitecture.g:3847:4: RULE_ID
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
    // InternalComponentArchitecture.g:3858:1: rule__CoordinationModuleMapping__CoordModuleInstAssignment_3 : ( ( ruleFQN ) ) ;
    public final void rule__CoordinationModuleMapping__CoordModuleInstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3862:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3863:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3863:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3864:3: ( ruleFQN )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModuleInstAbstractCoordinationModuleInstanceCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3865:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3866:4: ruleFQN
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
    // InternalComponentArchitecture.g:3877:1: rule__CoordinationModuleMapping__CoordModRealAssignment_5 : ( ( RULE_ID ) ) ;
    public final void rule__CoordinationModuleMapping__CoordModRealAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3881:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:3882:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:3882:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3883:3: ( RULE_ID )
            {
             before(grammarAccess.getCoordinationModuleMappingAccess().getCoordModRealCoordinationModuleRealizationCrossReference_5_0()); 
            // InternalComponentArchitecture.g:3884:3: ( RULE_ID )
            // InternalComponentArchitecture.g:3885:4: RULE_ID
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
    // InternalComponentArchitecture.g:3896:1: rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7 : ( ruleCoordinationInterfaceComponentInstanceMapping ) ;
    public final void rule__CoordinationModuleMapping__CoordInterCompInstMappingAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3900:1: ( ( ruleCoordinationInterfaceComponentInstanceMapping ) )
            // InternalComponentArchitecture.g:3901:2: ( ruleCoordinationInterfaceComponentInstanceMapping )
            {
            // InternalComponentArchitecture.g:3901:2: ( ruleCoordinationInterfaceComponentInstanceMapping )
            // InternalComponentArchitecture.g:3902:3: ruleCoordinationInterfaceComponentInstanceMapping
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
    // InternalComponentArchitecture.g:3911:1: rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__CoordInterInstAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3915:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:3916:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:3916:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3917:3: ( RULE_ID )
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCoordInterInstCoordinationInterfaceInstanceCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3918:3: ( RULE_ID )
            // InternalComponentArchitecture.g:3919:4: RULE_ID
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
    // InternalComponentArchitecture.g:3930:1: rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__CoordinationInterfaceComponentInstanceMapping__CompInstAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3934:1: ( ( ( RULE_ID ) ) )
            // InternalComponentArchitecture.g:3935:2: ( ( RULE_ID ) )
            {
            // InternalComponentArchitecture.g:3935:2: ( ( RULE_ID ) )
            // InternalComponentArchitecture.g:3936:3: ( RULE_ID )
            {
             before(grammarAccess.getCoordinationInterfaceComponentInstanceMappingAccess().getCompInstComponentInstanceCrossReference_3_0()); 
            // InternalComponentArchitecture.g:3937:3: ( RULE_ID )
            // InternalComponentArchitecture.g:3938:4: RULE_ID
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
    // InternalComponentArchitecture.g:3949:1: rule__TaskRealizationModelRef__TaskModelRefAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__TaskRealizationModelRef__TaskModelRefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3953:1: ( ( ( ruleFQN ) ) )
            // InternalComponentArchitecture.g:3954:2: ( ( ruleFQN ) )
            {
            // InternalComponentArchitecture.g:3954:2: ( ( ruleFQN ) )
            // InternalComponentArchitecture.g:3955:3: ( ruleFQN )
            {
             before(grammarAccess.getTaskRealizationModelRefAccess().getTaskModelRefTaskRealizationModelCrossReference_1_0()); 
            // InternalComponentArchitecture.g:3956:3: ( ruleFQN )
            // InternalComponentArchitecture.g:3957:4: ruleFQN
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
    // InternalComponentArchitecture.g:3968:1: rule__ACE_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ACE_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3972:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:3973:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:3973:2: ( ruleEString )
            // InternalComponentArchitecture.g:3974:3: ruleEString
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
    // InternalComponentArchitecture.g:3983:1: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpcUa_SeRoNet__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:3987:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:3988:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:3988:2: ( ruleEString )
            // InternalComponentArchitecture.g:3989:3: ruleEString
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
    // InternalComponentArchitecture.g:3998:1: rule__CORBA_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CORBA_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:4002:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:4003:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:4003:2: ( ruleEString )
            // InternalComponentArchitecture.g:4004:3: ruleEString
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
    // InternalComponentArchitecture.g:4013:1: rule__DDS_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DDS_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalComponentArchitecture.g:4017:1: ( ( ruleEString ) )
            // InternalComponentArchitecture.g:4018:2: ( ruleEString )
            {
            // InternalComponentArchitecture.g:4018:2: ( ruleEString )
            // InternalComponentArchitecture.g:4019:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000028000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000004400450000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004400000002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00003A0000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000035B010000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000005B000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000010000000040L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});

}