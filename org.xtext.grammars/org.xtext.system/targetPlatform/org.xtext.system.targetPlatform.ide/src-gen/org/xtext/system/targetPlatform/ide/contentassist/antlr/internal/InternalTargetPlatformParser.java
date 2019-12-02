package org.xtext.system.targetPlatform.ide.contentassist.antlr.internal;

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
import org.xtext.system.targetPlatform.services.TargetPlatformGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTargetPlatformParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_ML_DOCUMENTATION", "RULE_SL_COMMENT", "RULE_SL_DOCUMENTATION", "RULE_DOCU_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TargetPlatformModel'", "'{'", "'}'", "'NetworkConnection'", "'<->'", "'kind'", "'TargetPlatformDefinition'", "'Windows'", "';'", "'Linux'", "'MacOS'", "'NetworkInterface'", "'HostAddress'", "':'", "'Kind'", "'CPU'", "'CoresTally'", "'LoginAccount'", "'FullName'", "'Email'", "'TargetMiddleware'", "'.'", "'-'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int RULE_ML_DOCUMENTATION=8;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int RULE_SL_DOCUMENTATION=10;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalTargetPlatformParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTargetPlatformParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTargetPlatformParser.tokenNames; }
    public String getGrammarFileName() { return "InternalTargetPlatform.g"; }


    	private TargetPlatformGrammarAccess grammarAccess;

    	public void setGrammarAccess(TargetPlatformGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleTargetPlatformModel"
    // InternalTargetPlatform.g:68:1: entryRuleTargetPlatformModel : ruleTargetPlatformModel EOF ;
    public final void entryRuleTargetPlatformModel() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:69:1: ( ruleTargetPlatformModel EOF )
            // InternalTargetPlatform.g:70:1: ruleTargetPlatformModel EOF
            {
             before(grammarAccess.getTargetPlatformModelRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetPlatformModel();

            state._fsp--;

             after(grammarAccess.getTargetPlatformModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTargetPlatformModel"


    // $ANTLR start "ruleTargetPlatformModel"
    // InternalTargetPlatform.g:77:1: ruleTargetPlatformModel : ( ( rule__TargetPlatformModel__Group__0 ) ) ;
    public final void ruleTargetPlatformModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:81:2: ( ( ( rule__TargetPlatformModel__Group__0 ) ) )
            // InternalTargetPlatform.g:82:2: ( ( rule__TargetPlatformModel__Group__0 ) )
            {
            // InternalTargetPlatform.g:82:2: ( ( rule__TargetPlatformModel__Group__0 ) )
            // InternalTargetPlatform.g:83:3: ( rule__TargetPlatformModel__Group__0 )
            {
             before(grammarAccess.getTargetPlatformModelAccess().getGroup()); 
            // InternalTargetPlatform.g:84:3: ( rule__TargetPlatformModel__Group__0 )
            // InternalTargetPlatform.g:84:4: rule__TargetPlatformModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetPlatformModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetPlatformModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetPlatformModel"


    // $ANTLR start "entryRuleAbstractTPElement"
    // InternalTargetPlatform.g:93:1: entryRuleAbstractTPElement : ruleAbstractTPElement EOF ;
    public final void entryRuleAbstractTPElement() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:94:1: ( ruleAbstractTPElement EOF )
            // InternalTargetPlatform.g:95:1: ruleAbstractTPElement EOF
            {
             before(grammarAccess.getAbstractTPElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractTPElement();

            state._fsp--;

             after(grammarAccess.getAbstractTPElementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractTPElement"


    // $ANTLR start "ruleAbstractTPElement"
    // InternalTargetPlatform.g:102:1: ruleAbstractTPElement : ( ( rule__AbstractTPElement__Alternatives ) ) ;
    public final void ruleAbstractTPElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:106:2: ( ( ( rule__AbstractTPElement__Alternatives ) ) )
            // InternalTargetPlatform.g:107:2: ( ( rule__AbstractTPElement__Alternatives ) )
            {
            // InternalTargetPlatform.g:107:2: ( ( rule__AbstractTPElement__Alternatives ) )
            // InternalTargetPlatform.g:108:3: ( rule__AbstractTPElement__Alternatives )
            {
             before(grammarAccess.getAbstractTPElementAccess().getAlternatives()); 
            // InternalTargetPlatform.g:109:3: ( rule__AbstractTPElement__Alternatives )
            // InternalTargetPlatform.g:109:4: rule__AbstractTPElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractTPElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTPElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractTPElement"


    // $ANTLR start "entryRuleNetworkConnection"
    // InternalTargetPlatform.g:118:1: entryRuleNetworkConnection : ruleNetworkConnection EOF ;
    public final void entryRuleNetworkConnection() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:119:1: ( ruleNetworkConnection EOF )
            // InternalTargetPlatform.g:120:1: ruleNetworkConnection EOF
            {
             before(grammarAccess.getNetworkConnectionRule()); 
            pushFollow(FOLLOW_1);
            ruleNetworkConnection();

            state._fsp--;

             after(grammarAccess.getNetworkConnectionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNetworkConnection"


    // $ANTLR start "ruleNetworkConnection"
    // InternalTargetPlatform.g:127:1: ruleNetworkConnection : ( ( rule__NetworkConnection__Group__0 ) ) ;
    public final void ruleNetworkConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:131:2: ( ( ( rule__NetworkConnection__Group__0 ) ) )
            // InternalTargetPlatform.g:132:2: ( ( rule__NetworkConnection__Group__0 ) )
            {
            // InternalTargetPlatform.g:132:2: ( ( rule__NetworkConnection__Group__0 ) )
            // InternalTargetPlatform.g:133:3: ( rule__NetworkConnection__Group__0 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup()); 
            // InternalTargetPlatform.g:134:3: ( rule__NetworkConnection__Group__0 )
            // InternalTargetPlatform.g:134:4: rule__NetworkConnection__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetworkConnection"


    // $ANTLR start "entryRuleTargetPlatformDefinition"
    // InternalTargetPlatform.g:143:1: entryRuleTargetPlatformDefinition : ruleTargetPlatformDefinition EOF ;
    public final void entryRuleTargetPlatformDefinition() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:144:1: ( ruleTargetPlatformDefinition EOF )
            // InternalTargetPlatform.g:145:1: ruleTargetPlatformDefinition EOF
            {
             before(grammarAccess.getTargetPlatformDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetPlatformDefinition();

            state._fsp--;

             after(grammarAccess.getTargetPlatformDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTargetPlatformDefinition"


    // $ANTLR start "ruleTargetPlatformDefinition"
    // InternalTargetPlatform.g:152:1: ruleTargetPlatformDefinition : ( ( rule__TargetPlatformDefinition__Group__0 ) ) ;
    public final void ruleTargetPlatformDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:156:2: ( ( ( rule__TargetPlatformDefinition__Group__0 ) ) )
            // InternalTargetPlatform.g:157:2: ( ( rule__TargetPlatformDefinition__Group__0 ) )
            {
            // InternalTargetPlatform.g:157:2: ( ( rule__TargetPlatformDefinition__Group__0 ) )
            // InternalTargetPlatform.g:158:3: ( rule__TargetPlatformDefinition__Group__0 )
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getGroup()); 
            // InternalTargetPlatform.g:159:3: ( rule__TargetPlatformDefinition__Group__0 )
            // InternalTargetPlatform.g:159:4: rule__TargetPlatformDefinition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetPlatformDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetPlatformDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetPlatformDefinition"


    // $ANTLR start "entryRuleOperatingSystem"
    // InternalTargetPlatform.g:168:1: entryRuleOperatingSystem : ruleOperatingSystem EOF ;
    public final void entryRuleOperatingSystem() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:169:1: ( ruleOperatingSystem EOF )
            // InternalTargetPlatform.g:170:1: ruleOperatingSystem EOF
            {
             before(grammarAccess.getOperatingSystemRule()); 
            pushFollow(FOLLOW_1);
            ruleOperatingSystem();

            state._fsp--;

             after(grammarAccess.getOperatingSystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperatingSystem"


    // $ANTLR start "ruleOperatingSystem"
    // InternalTargetPlatform.g:177:1: ruleOperatingSystem : ( ( rule__OperatingSystem__Alternatives ) ) ;
    public final void ruleOperatingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:181:2: ( ( ( rule__OperatingSystem__Alternatives ) ) )
            // InternalTargetPlatform.g:182:2: ( ( rule__OperatingSystem__Alternatives ) )
            {
            // InternalTargetPlatform.g:182:2: ( ( rule__OperatingSystem__Alternatives ) )
            // InternalTargetPlatform.g:183:3: ( rule__OperatingSystem__Alternatives )
            {
             before(grammarAccess.getOperatingSystemAccess().getAlternatives()); 
            // InternalTargetPlatform.g:184:3: ( rule__OperatingSystem__Alternatives )
            // InternalTargetPlatform.g:184:4: rule__OperatingSystem__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__OperatingSystem__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperatingSystemAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperatingSystem"


    // $ANTLR start "entryRuleWindows"
    // InternalTargetPlatform.g:193:1: entryRuleWindows : ruleWindows EOF ;
    public final void entryRuleWindows() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:194:1: ( ruleWindows EOF )
            // InternalTargetPlatform.g:195:1: ruleWindows EOF
            {
             before(grammarAccess.getWindowsRule()); 
            pushFollow(FOLLOW_1);
            ruleWindows();

            state._fsp--;

             after(grammarAccess.getWindowsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWindows"


    // $ANTLR start "ruleWindows"
    // InternalTargetPlatform.g:202:1: ruleWindows : ( ( rule__Windows__Group__0 ) ) ;
    public final void ruleWindows() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:206:2: ( ( ( rule__Windows__Group__0 ) ) )
            // InternalTargetPlatform.g:207:2: ( ( rule__Windows__Group__0 ) )
            {
            // InternalTargetPlatform.g:207:2: ( ( rule__Windows__Group__0 ) )
            // InternalTargetPlatform.g:208:3: ( rule__Windows__Group__0 )
            {
             before(grammarAccess.getWindowsAccess().getGroup()); 
            // InternalTargetPlatform.g:209:3: ( rule__Windows__Group__0 )
            // InternalTargetPlatform.g:209:4: rule__Windows__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Windows__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWindowsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWindows"


    // $ANTLR start "entryRuleLinux"
    // InternalTargetPlatform.g:218:1: entryRuleLinux : ruleLinux EOF ;
    public final void entryRuleLinux() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:219:1: ( ruleLinux EOF )
            // InternalTargetPlatform.g:220:1: ruleLinux EOF
            {
             before(grammarAccess.getLinuxRule()); 
            pushFollow(FOLLOW_1);
            ruleLinux();

            state._fsp--;

             after(grammarAccess.getLinuxRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLinux"


    // $ANTLR start "ruleLinux"
    // InternalTargetPlatform.g:227:1: ruleLinux : ( ( rule__Linux__Group__0 ) ) ;
    public final void ruleLinux() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:231:2: ( ( ( rule__Linux__Group__0 ) ) )
            // InternalTargetPlatform.g:232:2: ( ( rule__Linux__Group__0 ) )
            {
            // InternalTargetPlatform.g:232:2: ( ( rule__Linux__Group__0 ) )
            // InternalTargetPlatform.g:233:3: ( rule__Linux__Group__0 )
            {
             before(grammarAccess.getLinuxAccess().getGroup()); 
            // InternalTargetPlatform.g:234:3: ( rule__Linux__Group__0 )
            // InternalTargetPlatform.g:234:4: rule__Linux__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Linux__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLinuxAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLinux"


    // $ANTLR start "entryRuleMacOS"
    // InternalTargetPlatform.g:243:1: entryRuleMacOS : ruleMacOS EOF ;
    public final void entryRuleMacOS() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:244:1: ( ruleMacOS EOF )
            // InternalTargetPlatform.g:245:1: ruleMacOS EOF
            {
             before(grammarAccess.getMacOSRule()); 
            pushFollow(FOLLOW_1);
            ruleMacOS();

            state._fsp--;

             after(grammarAccess.getMacOSRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMacOS"


    // $ANTLR start "ruleMacOS"
    // InternalTargetPlatform.g:252:1: ruleMacOS : ( ( rule__MacOS__Group__0 ) ) ;
    public final void ruleMacOS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:256:2: ( ( ( rule__MacOS__Group__0 ) ) )
            // InternalTargetPlatform.g:257:2: ( ( rule__MacOS__Group__0 ) )
            {
            // InternalTargetPlatform.g:257:2: ( ( rule__MacOS__Group__0 ) )
            // InternalTargetPlatform.g:258:3: ( rule__MacOS__Group__0 )
            {
             before(grammarAccess.getMacOSAccess().getGroup()); 
            // InternalTargetPlatform.g:259:3: ( rule__MacOS__Group__0 )
            // InternalTargetPlatform.g:259:4: rule__MacOS__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MacOS__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMacOSAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMacOS"


    // $ANTLR start "entryRuleAbstractTPSubNode"
    // InternalTargetPlatform.g:268:1: entryRuleAbstractTPSubNode : ruleAbstractTPSubNode EOF ;
    public final void entryRuleAbstractTPSubNode() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:269:1: ( ruleAbstractTPSubNode EOF )
            // InternalTargetPlatform.g:270:1: ruleAbstractTPSubNode EOF
            {
             before(grammarAccess.getAbstractTPSubNodeRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractTPSubNode();

            state._fsp--;

             after(grammarAccess.getAbstractTPSubNodeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAbstractTPSubNode"


    // $ANTLR start "ruleAbstractTPSubNode"
    // InternalTargetPlatform.g:277:1: ruleAbstractTPSubNode : ( ( rule__AbstractTPSubNode__Alternatives ) ) ;
    public final void ruleAbstractTPSubNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:281:2: ( ( ( rule__AbstractTPSubNode__Alternatives ) ) )
            // InternalTargetPlatform.g:282:2: ( ( rule__AbstractTPSubNode__Alternatives ) )
            {
            // InternalTargetPlatform.g:282:2: ( ( rule__AbstractTPSubNode__Alternatives ) )
            // InternalTargetPlatform.g:283:3: ( rule__AbstractTPSubNode__Alternatives )
            {
             before(grammarAccess.getAbstractTPSubNodeAccess().getAlternatives()); 
            // InternalTargetPlatform.g:284:3: ( rule__AbstractTPSubNode__Alternatives )
            // InternalTargetPlatform.g:284:4: rule__AbstractTPSubNode__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractTPSubNode__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractTPSubNodeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAbstractTPSubNode"


    // $ANTLR start "entryRuleNetworkInterface"
    // InternalTargetPlatform.g:293:1: entryRuleNetworkInterface : ruleNetworkInterface EOF ;
    public final void entryRuleNetworkInterface() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:294:1: ( ruleNetworkInterface EOF )
            // InternalTargetPlatform.g:295:1: ruleNetworkInterface EOF
            {
             before(grammarAccess.getNetworkInterfaceRule()); 
            pushFollow(FOLLOW_1);
            ruleNetworkInterface();

            state._fsp--;

             after(grammarAccess.getNetworkInterfaceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNetworkInterface"


    // $ANTLR start "ruleNetworkInterface"
    // InternalTargetPlatform.g:302:1: ruleNetworkInterface : ( ( rule__NetworkInterface__Group__0 ) ) ;
    public final void ruleNetworkInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:306:2: ( ( ( rule__NetworkInterface__Group__0 ) ) )
            // InternalTargetPlatform.g:307:2: ( ( rule__NetworkInterface__Group__0 ) )
            {
            // InternalTargetPlatform.g:307:2: ( ( rule__NetworkInterface__Group__0 ) )
            // InternalTargetPlatform.g:308:3: ( rule__NetworkInterface__Group__0 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getGroup()); 
            // InternalTargetPlatform.g:309:3: ( rule__NetworkInterface__Group__0 )
            // InternalTargetPlatform.g:309:4: rule__NetworkInterface__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNetworkInterfaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNetworkInterface"


    // $ANTLR start "entryRuleCPU"
    // InternalTargetPlatform.g:318:1: entryRuleCPU : ruleCPU EOF ;
    public final void entryRuleCPU() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:319:1: ( ruleCPU EOF )
            // InternalTargetPlatform.g:320:1: ruleCPU EOF
            {
             before(grammarAccess.getCPURule()); 
            pushFollow(FOLLOW_1);
            ruleCPU();

            state._fsp--;

             after(grammarAccess.getCPURule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCPU"


    // $ANTLR start "ruleCPU"
    // InternalTargetPlatform.g:327:1: ruleCPU : ( ( rule__CPU__Group__0 ) ) ;
    public final void ruleCPU() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:331:2: ( ( ( rule__CPU__Group__0 ) ) )
            // InternalTargetPlatform.g:332:2: ( ( rule__CPU__Group__0 ) )
            {
            // InternalTargetPlatform.g:332:2: ( ( rule__CPU__Group__0 ) )
            // InternalTargetPlatform.g:333:3: ( rule__CPU__Group__0 )
            {
             before(grammarAccess.getCPUAccess().getGroup()); 
            // InternalTargetPlatform.g:334:3: ( rule__CPU__Group__0 )
            // InternalTargetPlatform.g:334:4: rule__CPU__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CPU__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCPUAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCPU"


    // $ANTLR start "entryRuleLoginAccount"
    // InternalTargetPlatform.g:343:1: entryRuleLoginAccount : ruleLoginAccount EOF ;
    public final void entryRuleLoginAccount() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:344:1: ( ruleLoginAccount EOF )
            // InternalTargetPlatform.g:345:1: ruleLoginAccount EOF
            {
             before(grammarAccess.getLoginAccountRule()); 
            pushFollow(FOLLOW_1);
            ruleLoginAccount();

            state._fsp--;

             after(grammarAccess.getLoginAccountRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLoginAccount"


    // $ANTLR start "ruleLoginAccount"
    // InternalTargetPlatform.g:352:1: ruleLoginAccount : ( ( rule__LoginAccount__Group__0 ) ) ;
    public final void ruleLoginAccount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:356:2: ( ( ( rule__LoginAccount__Group__0 ) ) )
            // InternalTargetPlatform.g:357:2: ( ( rule__LoginAccount__Group__0 ) )
            {
            // InternalTargetPlatform.g:357:2: ( ( rule__LoginAccount__Group__0 ) )
            // InternalTargetPlatform.g:358:3: ( rule__LoginAccount__Group__0 )
            {
             before(grammarAccess.getLoginAccountAccess().getGroup()); 
            // InternalTargetPlatform.g:359:3: ( rule__LoginAccount__Group__0 )
            // InternalTargetPlatform.g:359:4: rule__LoginAccount__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LoginAccount__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccountAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLoginAccount"


    // $ANTLR start "entryRuleTargetMiddleware"
    // InternalTargetPlatform.g:368:1: entryRuleTargetMiddleware : ruleTargetMiddleware EOF ;
    public final void entryRuleTargetMiddleware() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:369:1: ( ruleTargetMiddleware EOF )
            // InternalTargetPlatform.g:370:1: ruleTargetMiddleware EOF
            {
             before(grammarAccess.getTargetMiddlewareRule()); 
            pushFollow(FOLLOW_1);
            ruleTargetMiddleware();

            state._fsp--;

             after(grammarAccess.getTargetMiddlewareRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTargetMiddleware"


    // $ANTLR start "ruleTargetMiddleware"
    // InternalTargetPlatform.g:377:1: ruleTargetMiddleware : ( ( rule__TargetMiddleware__Group__0 ) ) ;
    public final void ruleTargetMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:381:2: ( ( ( rule__TargetMiddleware__Group__0 ) ) )
            // InternalTargetPlatform.g:382:2: ( ( rule__TargetMiddleware__Group__0 ) )
            {
            // InternalTargetPlatform.g:382:2: ( ( rule__TargetMiddleware__Group__0 ) )
            // InternalTargetPlatform.g:383:3: ( rule__TargetMiddleware__Group__0 )
            {
             before(grammarAccess.getTargetMiddlewareAccess().getGroup()); 
            // InternalTargetPlatform.g:384:3: ( rule__TargetMiddleware__Group__0 )
            // InternalTargetPlatform.g:384:4: rule__TargetMiddleware__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TargetMiddleware__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTargetMiddlewareAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTargetMiddleware"


    // $ANTLR start "entryRuleRoboticMiddleware"
    // InternalTargetPlatform.g:393:1: entryRuleRoboticMiddleware : ruleRoboticMiddleware EOF ;
    public final void entryRuleRoboticMiddleware() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:394:1: ( ruleRoboticMiddleware EOF )
            // InternalTargetPlatform.g:395:1: ruleRoboticMiddleware EOF
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
    // InternalTargetPlatform.g:402:1: ruleRoboticMiddleware : ( ( rule__RoboticMiddleware__Alternatives ) ) ;
    public final void ruleRoboticMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:406:2: ( ( ( rule__RoboticMiddleware__Alternatives ) ) )
            // InternalTargetPlatform.g:407:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            {
            // InternalTargetPlatform.g:407:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            // InternalTargetPlatform.g:408:3: ( rule__RoboticMiddleware__Alternatives )
            {
             before(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); 
            // InternalTargetPlatform.g:409:3: ( rule__RoboticMiddleware__Alternatives )
            // InternalTargetPlatform.g:409:4: rule__RoboticMiddleware__Alternatives
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
    // InternalTargetPlatform.g:418:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:419:1: ( ruleFQN EOF )
            // InternalTargetPlatform.g:420:1: ruleFQN EOF
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
    // InternalTargetPlatform.g:427:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:431:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalTargetPlatform.g:432:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalTargetPlatform.g:432:2: ( ( rule__FQN__Group__0 ) )
            // InternalTargetPlatform.g:433:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalTargetPlatform.g:434:3: ( rule__FQN__Group__0 )
            // InternalTargetPlatform.g:434:4: rule__FQN__Group__0
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
    // InternalTargetPlatform.g:443:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:444:1: ( ruleEString EOF )
            // InternalTargetPlatform.g:445:1: ruleEString EOF
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
    // InternalTargetPlatform.g:452:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:456:2: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:457:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:457:2: ( RULE_STRING )
            // InternalTargetPlatform.g:458:3: RULE_STRING
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
    // InternalTargetPlatform.g:468:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:469:1: ( ruleEInt EOF )
            // InternalTargetPlatform.g:470:1: ruleEInt EOF
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
    // InternalTargetPlatform.g:477:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:481:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTargetPlatform.g:482:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTargetPlatform.g:482:2: ( ( rule__EInt__Group__0 ) )
            // InternalTargetPlatform.g:483:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTargetPlatform.g:484:3: ( rule__EInt__Group__0 )
            // InternalTargetPlatform.g:484:4: rule__EInt__Group__0
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
    // InternalTargetPlatform.g:493:1: entryRuleACE_SmartSoft : ruleACE_SmartSoft EOF ;
    public final void entryRuleACE_SmartSoft() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:494:1: ( ruleACE_SmartSoft EOF )
            // InternalTargetPlatform.g:495:1: ruleACE_SmartSoft EOF
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
    // InternalTargetPlatform.g:502:1: ruleACE_SmartSoft : ( ( rule__ACE_SmartSoft__Group__0 ) ) ;
    public final void ruleACE_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:506:2: ( ( ( rule__ACE_SmartSoft__Group__0 ) ) )
            // InternalTargetPlatform.g:507:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            {
            // InternalTargetPlatform.g:507:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            // InternalTargetPlatform.g:508:3: ( rule__ACE_SmartSoft__Group__0 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup()); 
            // InternalTargetPlatform.g:509:3: ( rule__ACE_SmartSoft__Group__0 )
            // InternalTargetPlatform.g:509:4: rule__ACE_SmartSoft__Group__0
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
    // InternalTargetPlatform.g:518:1: entryRuleOpcUa_SeRoNet : ruleOpcUa_SeRoNet EOF ;
    public final void entryRuleOpcUa_SeRoNet() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:519:1: ( ruleOpcUa_SeRoNet EOF )
            // InternalTargetPlatform.g:520:1: ruleOpcUa_SeRoNet EOF
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
    // InternalTargetPlatform.g:527:1: ruleOpcUa_SeRoNet : ( ( rule__OpcUa_SeRoNet__Group__0 ) ) ;
    public final void ruleOpcUa_SeRoNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:531:2: ( ( ( rule__OpcUa_SeRoNet__Group__0 ) ) )
            // InternalTargetPlatform.g:532:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            {
            // InternalTargetPlatform.g:532:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            // InternalTargetPlatform.g:533:3: ( rule__OpcUa_SeRoNet__Group__0 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); 
            // InternalTargetPlatform.g:534:3: ( rule__OpcUa_SeRoNet__Group__0 )
            // InternalTargetPlatform.g:534:4: rule__OpcUa_SeRoNet__Group__0
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
    // InternalTargetPlatform.g:543:1: entryRuleCORBA_SmartSoft : ruleCORBA_SmartSoft EOF ;
    public final void entryRuleCORBA_SmartSoft() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:544:1: ( ruleCORBA_SmartSoft EOF )
            // InternalTargetPlatform.g:545:1: ruleCORBA_SmartSoft EOF
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
    // InternalTargetPlatform.g:552:1: ruleCORBA_SmartSoft : ( ( rule__CORBA_SmartSoft__Group__0 ) ) ;
    public final void ruleCORBA_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:556:2: ( ( ( rule__CORBA_SmartSoft__Group__0 ) ) )
            // InternalTargetPlatform.g:557:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            {
            // InternalTargetPlatform.g:557:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            // InternalTargetPlatform.g:558:3: ( rule__CORBA_SmartSoft__Group__0 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); 
            // InternalTargetPlatform.g:559:3: ( rule__CORBA_SmartSoft__Group__0 )
            // InternalTargetPlatform.g:559:4: rule__CORBA_SmartSoft__Group__0
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
    // InternalTargetPlatform.g:568:1: entryRuleDDS_SmartSoft : ruleDDS_SmartSoft EOF ;
    public final void entryRuleDDS_SmartSoft() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:569:1: ( ruleDDS_SmartSoft EOF )
            // InternalTargetPlatform.g:570:1: ruleDDS_SmartSoft EOF
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
    // InternalTargetPlatform.g:577:1: ruleDDS_SmartSoft : ( ( rule__DDS_SmartSoft__Group__0 ) ) ;
    public final void ruleDDS_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:581:2: ( ( ( rule__DDS_SmartSoft__Group__0 ) ) )
            // InternalTargetPlatform.g:582:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            {
            // InternalTargetPlatform.g:582:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            // InternalTargetPlatform.g:583:3: ( rule__DDS_SmartSoft__Group__0 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup()); 
            // InternalTargetPlatform.g:584:3: ( rule__DDS_SmartSoft__Group__0 )
            // InternalTargetPlatform.g:584:4: rule__DDS_SmartSoft__Group__0
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


    // $ANTLR start "rule__AbstractTPElement__Alternatives"
    // InternalTargetPlatform.g:592:1: rule__AbstractTPElement__Alternatives : ( ( ruleTargetPlatformDefinition ) | ( ruleNetworkConnection ) );
    public final void rule__AbstractTPElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:596:1: ( ( ruleTargetPlatformDefinition ) | ( ruleNetworkConnection ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==20) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTargetPlatform.g:597:2: ( ruleTargetPlatformDefinition )
                    {
                    // InternalTargetPlatform.g:597:2: ( ruleTargetPlatformDefinition )
                    // InternalTargetPlatform.g:598:3: ruleTargetPlatformDefinition
                    {
                     before(grammarAccess.getAbstractTPElementAccess().getTargetPlatformDefinitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleTargetPlatformDefinition();

                    state._fsp--;

                     after(grammarAccess.getAbstractTPElementAccess().getTargetPlatformDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTargetPlatform.g:603:2: ( ruleNetworkConnection )
                    {
                    // InternalTargetPlatform.g:603:2: ( ruleNetworkConnection )
                    // InternalTargetPlatform.g:604:3: ruleNetworkConnection
                    {
                     before(grammarAccess.getAbstractTPElementAccess().getNetworkConnectionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNetworkConnection();

                    state._fsp--;

                     after(grammarAccess.getAbstractTPElementAccess().getNetworkConnectionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractTPElement__Alternatives"


    // $ANTLR start "rule__OperatingSystem__Alternatives"
    // InternalTargetPlatform.g:613:1: rule__OperatingSystem__Alternatives : ( ( ruleWindows ) | ( ruleLinux ) | ( ruleMacOS ) );
    public final void rule__OperatingSystem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:617:1: ( ( ruleWindows ) | ( ruleLinux ) | ( ruleMacOS ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 23:
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
                    // InternalTargetPlatform.g:618:2: ( ruleWindows )
                    {
                    // InternalTargetPlatform.g:618:2: ( ruleWindows )
                    // InternalTargetPlatform.g:619:3: ruleWindows
                    {
                     before(grammarAccess.getOperatingSystemAccess().getWindowsParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleWindows();

                    state._fsp--;

                     after(grammarAccess.getOperatingSystemAccess().getWindowsParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTargetPlatform.g:624:2: ( ruleLinux )
                    {
                    // InternalTargetPlatform.g:624:2: ( ruleLinux )
                    // InternalTargetPlatform.g:625:3: ruleLinux
                    {
                     before(grammarAccess.getOperatingSystemAccess().getLinuxParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLinux();

                    state._fsp--;

                     after(grammarAccess.getOperatingSystemAccess().getLinuxParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTargetPlatform.g:630:2: ( ruleMacOS )
                    {
                    // InternalTargetPlatform.g:630:2: ( ruleMacOS )
                    // InternalTargetPlatform.g:631:3: ruleMacOS
                    {
                     before(grammarAccess.getOperatingSystemAccess().getMacOSParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMacOS();

                    state._fsp--;

                     after(grammarAccess.getOperatingSystemAccess().getMacOSParserRuleCall_2()); 

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
    // $ANTLR end "rule__OperatingSystem__Alternatives"


    // $ANTLR start "rule__AbstractTPSubNode__Alternatives"
    // InternalTargetPlatform.g:640:1: rule__AbstractTPSubNode__Alternatives : ( ( ruleNetworkInterface ) | ( ruleCPU ) | ( ruleLoginAccount ) | ( ruleTargetMiddleware ) );
    public final void rule__AbstractTPSubNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:644:1: ( ( ruleNetworkInterface ) | ( ruleCPU ) | ( ruleLoginAccount ) | ( ruleTargetMiddleware ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 25:
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
                    // InternalTargetPlatform.g:645:2: ( ruleNetworkInterface )
                    {
                    // InternalTargetPlatform.g:645:2: ( ruleNetworkInterface )
                    // InternalTargetPlatform.g:646:3: ruleNetworkInterface
                    {
                     before(grammarAccess.getAbstractTPSubNodeAccess().getNetworkInterfaceParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNetworkInterface();

                    state._fsp--;

                     after(grammarAccess.getAbstractTPSubNodeAccess().getNetworkInterfaceParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalTargetPlatform.g:651:2: ( ruleCPU )
                    {
                    // InternalTargetPlatform.g:651:2: ( ruleCPU )
                    // InternalTargetPlatform.g:652:3: ruleCPU
                    {
                     before(grammarAccess.getAbstractTPSubNodeAccess().getCPUParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleCPU();

                    state._fsp--;

                     after(grammarAccess.getAbstractTPSubNodeAccess().getCPUParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalTargetPlatform.g:657:2: ( ruleLoginAccount )
                    {
                    // InternalTargetPlatform.g:657:2: ( ruleLoginAccount )
                    // InternalTargetPlatform.g:658:3: ruleLoginAccount
                    {
                     before(grammarAccess.getAbstractTPSubNodeAccess().getLoginAccountParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleLoginAccount();

                    state._fsp--;

                     after(grammarAccess.getAbstractTPSubNodeAccess().getLoginAccountParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalTargetPlatform.g:663:2: ( ruleTargetMiddleware )
                    {
                    // InternalTargetPlatform.g:663:2: ( ruleTargetMiddleware )
                    // InternalTargetPlatform.g:664:3: ruleTargetMiddleware
                    {
                     before(grammarAccess.getAbstractTPSubNodeAccess().getTargetMiddlewareParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleTargetMiddleware();

                    state._fsp--;

                     after(grammarAccess.getAbstractTPSubNodeAccess().getTargetMiddlewareParserRuleCall_3()); 

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
    // $ANTLR end "rule__AbstractTPSubNode__Alternatives"


    // $ANTLR start "rule__RoboticMiddleware__Alternatives"
    // InternalTargetPlatform.g:673:1: rule__RoboticMiddleware__Alternatives : ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) );
    public final void rule__RoboticMiddleware__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:677:1: ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt4=1;
                }
                break;
            case 39:
                {
                alt4=2;
                }
                break;
            case 40:
                {
                alt4=3;
                }
                break;
            case 41:
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
                    // InternalTargetPlatform.g:678:2: ( ruleACE_SmartSoft )
                    {
                    // InternalTargetPlatform.g:678:2: ( ruleACE_SmartSoft )
                    // InternalTargetPlatform.g:679:3: ruleACE_SmartSoft
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
                    // InternalTargetPlatform.g:684:2: ( ruleOpcUa_SeRoNet )
                    {
                    // InternalTargetPlatform.g:684:2: ( ruleOpcUa_SeRoNet )
                    // InternalTargetPlatform.g:685:3: ruleOpcUa_SeRoNet
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
                    // InternalTargetPlatform.g:690:2: ( ruleCORBA_SmartSoft )
                    {
                    // InternalTargetPlatform.g:690:2: ( ruleCORBA_SmartSoft )
                    // InternalTargetPlatform.g:691:3: ruleCORBA_SmartSoft
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
                    // InternalTargetPlatform.g:696:2: ( ruleDDS_SmartSoft )
                    {
                    // InternalTargetPlatform.g:696:2: ( ruleDDS_SmartSoft )
                    // InternalTargetPlatform.g:697:3: ruleDDS_SmartSoft
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


    // $ANTLR start "rule__TargetPlatformModel__Group__0"
    // InternalTargetPlatform.g:706:1: rule__TargetPlatformModel__Group__0 : rule__TargetPlatformModel__Group__0__Impl rule__TargetPlatformModel__Group__1 ;
    public final void rule__TargetPlatformModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:710:1: ( rule__TargetPlatformModel__Group__0__Impl rule__TargetPlatformModel__Group__1 )
            // InternalTargetPlatform.g:711:2: rule__TargetPlatformModel__Group__0__Impl rule__TargetPlatformModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TargetPlatformModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetPlatformModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__Group__0"


    // $ANTLR start "rule__TargetPlatformModel__Group__0__Impl"
    // InternalTargetPlatform.g:718:1: rule__TargetPlatformModel__Group__0__Impl : ( 'TargetPlatformModel' ) ;
    public final void rule__TargetPlatformModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:722:1: ( ( 'TargetPlatformModel' ) )
            // InternalTargetPlatform.g:723:1: ( 'TargetPlatformModel' )
            {
            // InternalTargetPlatform.g:723:1: ( 'TargetPlatformModel' )
            // InternalTargetPlatform.g:724:2: 'TargetPlatformModel'
            {
             before(grammarAccess.getTargetPlatformModelAccess().getTargetPlatformModelKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTargetPlatformModelAccess().getTargetPlatformModelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__Group__0__Impl"


    // $ANTLR start "rule__TargetPlatformModel__Group__1"
    // InternalTargetPlatform.g:733:1: rule__TargetPlatformModel__Group__1 : rule__TargetPlatformModel__Group__1__Impl rule__TargetPlatformModel__Group__2 ;
    public final void rule__TargetPlatformModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:737:1: ( rule__TargetPlatformModel__Group__1__Impl rule__TargetPlatformModel__Group__2 )
            // InternalTargetPlatform.g:738:2: rule__TargetPlatformModel__Group__1__Impl rule__TargetPlatformModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TargetPlatformModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetPlatformModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__Group__1"


    // $ANTLR start "rule__TargetPlatformModel__Group__1__Impl"
    // InternalTargetPlatform.g:745:1: rule__TargetPlatformModel__Group__1__Impl : ( ( rule__TargetPlatformModel__NameAssignment_1 ) ) ;
    public final void rule__TargetPlatformModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:749:1: ( ( ( rule__TargetPlatformModel__NameAssignment_1 ) ) )
            // InternalTargetPlatform.g:750:1: ( ( rule__TargetPlatformModel__NameAssignment_1 ) )
            {
            // InternalTargetPlatform.g:750:1: ( ( rule__TargetPlatformModel__NameAssignment_1 ) )
            // InternalTargetPlatform.g:751:2: ( rule__TargetPlatformModel__NameAssignment_1 )
            {
             before(grammarAccess.getTargetPlatformModelAccess().getNameAssignment_1()); 
            // InternalTargetPlatform.g:752:2: ( rule__TargetPlatformModel__NameAssignment_1 )
            // InternalTargetPlatform.g:752:3: rule__TargetPlatformModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetPlatformModel__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetPlatformModelAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__Group__1__Impl"


    // $ANTLR start "rule__TargetPlatformModel__Group__2"
    // InternalTargetPlatform.g:760:1: rule__TargetPlatformModel__Group__2 : rule__TargetPlatformModel__Group__2__Impl rule__TargetPlatformModel__Group__3 ;
    public final void rule__TargetPlatformModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:764:1: ( rule__TargetPlatformModel__Group__2__Impl rule__TargetPlatformModel__Group__3 )
            // InternalTargetPlatform.g:765:2: rule__TargetPlatformModel__Group__2__Impl rule__TargetPlatformModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__TargetPlatformModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetPlatformModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__Group__2"


    // $ANTLR start "rule__TargetPlatformModel__Group__2__Impl"
    // InternalTargetPlatform.g:772:1: rule__TargetPlatformModel__Group__2__Impl : ( '{' ) ;
    public final void rule__TargetPlatformModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:776:1: ( ( '{' ) )
            // InternalTargetPlatform.g:777:1: ( '{' )
            {
            // InternalTargetPlatform.g:777:1: ( '{' )
            // InternalTargetPlatform.g:778:2: '{'
            {
             before(grammarAccess.getTargetPlatformModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTargetPlatformModelAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__Group__2__Impl"


    // $ANTLR start "rule__TargetPlatformModel__Group__3"
    // InternalTargetPlatform.g:787:1: rule__TargetPlatformModel__Group__3 : rule__TargetPlatformModel__Group__3__Impl rule__TargetPlatformModel__Group__4 ;
    public final void rule__TargetPlatformModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:791:1: ( rule__TargetPlatformModel__Group__3__Impl rule__TargetPlatformModel__Group__4 )
            // InternalTargetPlatform.g:792:2: rule__TargetPlatformModel__Group__3__Impl rule__TargetPlatformModel__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__TargetPlatformModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetPlatformModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__Group__3"


    // $ANTLR start "rule__TargetPlatformModel__Group__3__Impl"
    // InternalTargetPlatform.g:799:1: rule__TargetPlatformModel__Group__3__Impl : ( ( rule__TargetPlatformModel__ElementsAssignment_3 )* ) ;
    public final void rule__TargetPlatformModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:803:1: ( ( ( rule__TargetPlatformModel__ElementsAssignment_3 )* ) )
            // InternalTargetPlatform.g:804:1: ( ( rule__TargetPlatformModel__ElementsAssignment_3 )* )
            {
            // InternalTargetPlatform.g:804:1: ( ( rule__TargetPlatformModel__ElementsAssignment_3 )* )
            // InternalTargetPlatform.g:805:2: ( rule__TargetPlatformModel__ElementsAssignment_3 )*
            {
             before(grammarAccess.getTargetPlatformModelAccess().getElementsAssignment_3()); 
            // InternalTargetPlatform.g:806:2: ( rule__TargetPlatformModel__ElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==17||LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTargetPlatform.g:806:3: rule__TargetPlatformModel__ElementsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__TargetPlatformModel__ElementsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTargetPlatformModelAccess().getElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__Group__3__Impl"


    // $ANTLR start "rule__TargetPlatformModel__Group__4"
    // InternalTargetPlatform.g:814:1: rule__TargetPlatformModel__Group__4 : rule__TargetPlatformModel__Group__4__Impl ;
    public final void rule__TargetPlatformModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:818:1: ( rule__TargetPlatformModel__Group__4__Impl )
            // InternalTargetPlatform.g:819:2: rule__TargetPlatformModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetPlatformModel__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__Group__4"


    // $ANTLR start "rule__TargetPlatformModel__Group__4__Impl"
    // InternalTargetPlatform.g:825:1: rule__TargetPlatformModel__Group__4__Impl : ( '}' ) ;
    public final void rule__TargetPlatformModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:829:1: ( ( '}' ) )
            // InternalTargetPlatform.g:830:1: ( '}' )
            {
            // InternalTargetPlatform.g:830:1: ( '}' )
            // InternalTargetPlatform.g:831:2: '}'
            {
             before(grammarAccess.getTargetPlatformModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTargetPlatformModelAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__Group__4__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__0"
    // InternalTargetPlatform.g:841:1: rule__NetworkConnection__Group__0 : rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 ;
    public final void rule__NetworkConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:845:1: ( rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 )
            // InternalTargetPlatform.g:846:2: rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__NetworkConnection__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__0"


    // $ANTLR start "rule__NetworkConnection__Group__0__Impl"
    // InternalTargetPlatform.g:853:1: rule__NetworkConnection__Group__0__Impl : ( 'NetworkConnection' ) ;
    public final void rule__NetworkConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:857:1: ( ( 'NetworkConnection' ) )
            // InternalTargetPlatform.g:858:1: ( 'NetworkConnection' )
            {
            // InternalTargetPlatform.g:858:1: ( 'NetworkConnection' )
            // InternalTargetPlatform.g:859:2: 'NetworkConnection'
            {
             before(grammarAccess.getNetworkConnectionAccess().getNetworkConnectionKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getNetworkConnectionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__0__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__1"
    // InternalTargetPlatform.g:868:1: rule__NetworkConnection__Group__1 : rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 ;
    public final void rule__NetworkConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:872:1: ( rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 )
            // InternalTargetPlatform.g:873:2: rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__NetworkConnection__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__1"


    // $ANTLR start "rule__NetworkConnection__Group__1__Impl"
    // InternalTargetPlatform.g:880:1: rule__NetworkConnection__Group__1__Impl : ( '{' ) ;
    public final void rule__NetworkConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:884:1: ( ( '{' ) )
            // InternalTargetPlatform.g:885:1: ( '{' )
            {
            // InternalTargetPlatform.g:885:1: ( '{' )
            // InternalTargetPlatform.g:886:2: '{'
            {
             before(grammarAccess.getNetworkConnectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__1__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__2"
    // InternalTargetPlatform.g:895:1: rule__NetworkConnection__Group__2 : rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 ;
    public final void rule__NetworkConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:899:1: ( rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 )
            // InternalTargetPlatform.g:900:2: rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__NetworkConnection__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__2"


    // $ANTLR start "rule__NetworkConnection__Group__2__Impl"
    // InternalTargetPlatform.g:907:1: rule__NetworkConnection__Group__2__Impl : ( ( rule__NetworkConnection__Endpoint1Assignment_2 ) ) ;
    public final void rule__NetworkConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:911:1: ( ( ( rule__NetworkConnection__Endpoint1Assignment_2 ) ) )
            // InternalTargetPlatform.g:912:1: ( ( rule__NetworkConnection__Endpoint1Assignment_2 ) )
            {
            // InternalTargetPlatform.g:912:1: ( ( rule__NetworkConnection__Endpoint1Assignment_2 ) )
            // InternalTargetPlatform.g:913:2: ( rule__NetworkConnection__Endpoint1Assignment_2 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getEndpoint1Assignment_2()); 
            // InternalTargetPlatform.g:914:2: ( rule__NetworkConnection__Endpoint1Assignment_2 )
            // InternalTargetPlatform.g:914:3: rule__NetworkConnection__Endpoint1Assignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Endpoint1Assignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getEndpoint1Assignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__2__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__3"
    // InternalTargetPlatform.g:922:1: rule__NetworkConnection__Group__3 : rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 ;
    public final void rule__NetworkConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:926:1: ( rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 )
            // InternalTargetPlatform.g:927:2: rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__NetworkConnection__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__3"


    // $ANTLR start "rule__NetworkConnection__Group__3__Impl"
    // InternalTargetPlatform.g:934:1: rule__NetworkConnection__Group__3__Impl : ( '<->' ) ;
    public final void rule__NetworkConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:938:1: ( ( '<->' ) )
            // InternalTargetPlatform.g:939:1: ( '<->' )
            {
            // InternalTargetPlatform.g:939:1: ( '<->' )
            // InternalTargetPlatform.g:940:2: '<->'
            {
             before(grammarAccess.getNetworkConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__3__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__4"
    // InternalTargetPlatform.g:949:1: rule__NetworkConnection__Group__4 : rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 ;
    public final void rule__NetworkConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:953:1: ( rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 )
            // InternalTargetPlatform.g:954:2: rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__NetworkConnection__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__4"


    // $ANTLR start "rule__NetworkConnection__Group__4__Impl"
    // InternalTargetPlatform.g:961:1: rule__NetworkConnection__Group__4__Impl : ( ( rule__NetworkConnection__Endpoint2Assignment_4 ) ) ;
    public final void rule__NetworkConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:965:1: ( ( ( rule__NetworkConnection__Endpoint2Assignment_4 ) ) )
            // InternalTargetPlatform.g:966:1: ( ( rule__NetworkConnection__Endpoint2Assignment_4 ) )
            {
            // InternalTargetPlatform.g:966:1: ( ( rule__NetworkConnection__Endpoint2Assignment_4 ) )
            // InternalTargetPlatform.g:967:2: ( rule__NetworkConnection__Endpoint2Assignment_4 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getEndpoint2Assignment_4()); 
            // InternalTargetPlatform.g:968:2: ( rule__NetworkConnection__Endpoint2Assignment_4 )
            // InternalTargetPlatform.g:968:3: rule__NetworkConnection__Endpoint2Assignment_4
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Endpoint2Assignment_4();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getEndpoint2Assignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__4__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__5"
    // InternalTargetPlatform.g:976:1: rule__NetworkConnection__Group__5 : rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 ;
    public final void rule__NetworkConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:980:1: ( rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 )
            // InternalTargetPlatform.g:981:2: rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__NetworkConnection__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__5"


    // $ANTLR start "rule__NetworkConnection__Group__5__Impl"
    // InternalTargetPlatform.g:988:1: rule__NetworkConnection__Group__5__Impl : ( ( rule__NetworkConnection__Group_5__0 )? ) ;
    public final void rule__NetworkConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:992:1: ( ( ( rule__NetworkConnection__Group_5__0 )? ) )
            // InternalTargetPlatform.g:993:1: ( ( rule__NetworkConnection__Group_5__0 )? )
            {
            // InternalTargetPlatform.g:993:1: ( ( rule__NetworkConnection__Group_5__0 )? )
            // InternalTargetPlatform.g:994:2: ( rule__NetworkConnection__Group_5__0 )?
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup_5()); 
            // InternalTargetPlatform.g:995:2: ( rule__NetworkConnection__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==19) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTargetPlatform.g:995:3: rule__NetworkConnection__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkConnection__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNetworkConnectionAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__5__Impl"


    // $ANTLR start "rule__NetworkConnection__Group__6"
    // InternalTargetPlatform.g:1003:1: rule__NetworkConnection__Group__6 : rule__NetworkConnection__Group__6__Impl ;
    public final void rule__NetworkConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1007:1: ( rule__NetworkConnection__Group__6__Impl )
            // InternalTargetPlatform.g:1008:2: rule__NetworkConnection__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__6"


    // $ANTLR start "rule__NetworkConnection__Group__6__Impl"
    // InternalTargetPlatform.g:1014:1: rule__NetworkConnection__Group__6__Impl : ( '}' ) ;
    public final void rule__NetworkConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1018:1: ( ( '}' ) )
            // InternalTargetPlatform.g:1019:1: ( '}' )
            {
            // InternalTargetPlatform.g:1019:1: ( '}' )
            // InternalTargetPlatform.g:1020:2: '}'
            {
             before(grammarAccess.getNetworkConnectionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group__6__Impl"


    // $ANTLR start "rule__NetworkConnection__Group_5__0"
    // InternalTargetPlatform.g:1030:1: rule__NetworkConnection__Group_5__0 : rule__NetworkConnection__Group_5__0__Impl rule__NetworkConnection__Group_5__1 ;
    public final void rule__NetworkConnection__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1034:1: ( rule__NetworkConnection__Group_5__0__Impl rule__NetworkConnection__Group_5__1 )
            // InternalTargetPlatform.g:1035:2: rule__NetworkConnection__Group_5__0__Impl rule__NetworkConnection__Group_5__1
            {
            pushFollow(FOLLOW_9);
            rule__NetworkConnection__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_5__0"


    // $ANTLR start "rule__NetworkConnection__Group_5__0__Impl"
    // InternalTargetPlatform.g:1042:1: rule__NetworkConnection__Group_5__0__Impl : ( 'kind' ) ;
    public final void rule__NetworkConnection__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1046:1: ( ( 'kind' ) )
            // InternalTargetPlatform.g:1047:1: ( 'kind' )
            {
            // InternalTargetPlatform.g:1047:1: ( 'kind' )
            // InternalTargetPlatform.g:1048:2: 'kind'
            {
             before(grammarAccess.getNetworkConnectionAccess().getKindKeyword_5_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getNetworkConnectionAccess().getKindKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_5__0__Impl"


    // $ANTLR start "rule__NetworkConnection__Group_5__1"
    // InternalTargetPlatform.g:1057:1: rule__NetworkConnection__Group_5__1 : rule__NetworkConnection__Group_5__1__Impl ;
    public final void rule__NetworkConnection__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1061:1: ( rule__NetworkConnection__Group_5__1__Impl )
            // InternalTargetPlatform.g:1062:2: rule__NetworkConnection__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConnection__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_5__1"


    // $ANTLR start "rule__NetworkConnection__Group_5__1__Impl"
    // InternalTargetPlatform.g:1068:1: rule__NetworkConnection__Group_5__1__Impl : ( ( rule__NetworkConnection__KindAssignment_5_1 ) ) ;
    public final void rule__NetworkConnection__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1072:1: ( ( ( rule__NetworkConnection__KindAssignment_5_1 ) ) )
            // InternalTargetPlatform.g:1073:1: ( ( rule__NetworkConnection__KindAssignment_5_1 ) )
            {
            // InternalTargetPlatform.g:1073:1: ( ( rule__NetworkConnection__KindAssignment_5_1 ) )
            // InternalTargetPlatform.g:1074:2: ( rule__NetworkConnection__KindAssignment_5_1 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getKindAssignment_5_1()); 
            // InternalTargetPlatform.g:1075:2: ( rule__NetworkConnection__KindAssignment_5_1 )
            // InternalTargetPlatform.g:1075:3: rule__NetworkConnection__KindAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkConnection__KindAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkConnectionAccess().getKindAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Group_5__1__Impl"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__0"
    // InternalTargetPlatform.g:1084:1: rule__TargetPlatformDefinition__Group__0 : rule__TargetPlatformDefinition__Group__0__Impl rule__TargetPlatformDefinition__Group__1 ;
    public final void rule__TargetPlatformDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1088:1: ( rule__TargetPlatformDefinition__Group__0__Impl rule__TargetPlatformDefinition__Group__1 )
            // InternalTargetPlatform.g:1089:2: rule__TargetPlatformDefinition__Group__0__Impl rule__TargetPlatformDefinition__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TargetPlatformDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetPlatformDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__0"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__0__Impl"
    // InternalTargetPlatform.g:1096:1: rule__TargetPlatformDefinition__Group__0__Impl : ( 'TargetPlatformDefinition' ) ;
    public final void rule__TargetPlatformDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1100:1: ( ( 'TargetPlatformDefinition' ) )
            // InternalTargetPlatform.g:1101:1: ( 'TargetPlatformDefinition' )
            {
            // InternalTargetPlatform.g:1101:1: ( 'TargetPlatformDefinition' )
            // InternalTargetPlatform.g:1102:2: 'TargetPlatformDefinition'
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getTargetPlatformDefinitionKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTargetPlatformDefinitionAccess().getTargetPlatformDefinitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__0__Impl"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__1"
    // InternalTargetPlatform.g:1111:1: rule__TargetPlatformDefinition__Group__1 : rule__TargetPlatformDefinition__Group__1__Impl rule__TargetPlatformDefinition__Group__2 ;
    public final void rule__TargetPlatformDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1115:1: ( rule__TargetPlatformDefinition__Group__1__Impl rule__TargetPlatformDefinition__Group__2 )
            // InternalTargetPlatform.g:1116:2: rule__TargetPlatformDefinition__Group__1__Impl rule__TargetPlatformDefinition__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__TargetPlatformDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetPlatformDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__1"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__1__Impl"
    // InternalTargetPlatform.g:1123:1: rule__TargetPlatformDefinition__Group__1__Impl : ( ( rule__TargetPlatformDefinition__NameAssignment_1 ) ) ;
    public final void rule__TargetPlatformDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1127:1: ( ( ( rule__TargetPlatformDefinition__NameAssignment_1 ) ) )
            // InternalTargetPlatform.g:1128:1: ( ( rule__TargetPlatformDefinition__NameAssignment_1 ) )
            {
            // InternalTargetPlatform.g:1128:1: ( ( rule__TargetPlatformDefinition__NameAssignment_1 ) )
            // InternalTargetPlatform.g:1129:2: ( rule__TargetPlatformDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getNameAssignment_1()); 
            // InternalTargetPlatform.g:1130:2: ( rule__TargetPlatformDefinition__NameAssignment_1 )
            // InternalTargetPlatform.g:1130:3: rule__TargetPlatformDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetPlatformDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetPlatformDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__1__Impl"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__2"
    // InternalTargetPlatform.g:1138:1: rule__TargetPlatformDefinition__Group__2 : rule__TargetPlatformDefinition__Group__2__Impl rule__TargetPlatformDefinition__Group__3 ;
    public final void rule__TargetPlatformDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1142:1: ( rule__TargetPlatformDefinition__Group__2__Impl rule__TargetPlatformDefinition__Group__3 )
            // InternalTargetPlatform.g:1143:2: rule__TargetPlatformDefinition__Group__2__Impl rule__TargetPlatformDefinition__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__TargetPlatformDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetPlatformDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__2"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__2__Impl"
    // InternalTargetPlatform.g:1150:1: rule__TargetPlatformDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__TargetPlatformDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1154:1: ( ( '{' ) )
            // InternalTargetPlatform.g:1155:1: ( '{' )
            {
            // InternalTargetPlatform.g:1155:1: ( '{' )
            // InternalTargetPlatform.g:1156:2: '{'
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTargetPlatformDefinitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__2__Impl"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__3"
    // InternalTargetPlatform.g:1165:1: rule__TargetPlatformDefinition__Group__3 : rule__TargetPlatformDefinition__Group__3__Impl rule__TargetPlatformDefinition__Group__4 ;
    public final void rule__TargetPlatformDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1169:1: ( rule__TargetPlatformDefinition__Group__3__Impl rule__TargetPlatformDefinition__Group__4 )
            // InternalTargetPlatform.g:1170:2: rule__TargetPlatformDefinition__Group__3__Impl rule__TargetPlatformDefinition__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__TargetPlatformDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetPlatformDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__3"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__3__Impl"
    // InternalTargetPlatform.g:1177:1: rule__TargetPlatformDefinition__Group__3__Impl : ( ( rule__TargetPlatformDefinition__OsAssignment_3 )? ) ;
    public final void rule__TargetPlatformDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1181:1: ( ( ( rule__TargetPlatformDefinition__OsAssignment_3 )? ) )
            // InternalTargetPlatform.g:1182:1: ( ( rule__TargetPlatformDefinition__OsAssignment_3 )? )
            {
            // InternalTargetPlatform.g:1182:1: ( ( rule__TargetPlatformDefinition__OsAssignment_3 )? )
            // InternalTargetPlatform.g:1183:2: ( rule__TargetPlatformDefinition__OsAssignment_3 )?
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getOsAssignment_3()); 
            // InternalTargetPlatform.g:1184:2: ( rule__TargetPlatformDefinition__OsAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21||(LA7_0>=23 && LA7_0<=24)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTargetPlatform.g:1184:3: rule__TargetPlatformDefinition__OsAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__TargetPlatformDefinition__OsAssignment_3();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTargetPlatformDefinitionAccess().getOsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__3__Impl"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__4"
    // InternalTargetPlatform.g:1192:1: rule__TargetPlatformDefinition__Group__4 : rule__TargetPlatformDefinition__Group__4__Impl rule__TargetPlatformDefinition__Group__5 ;
    public final void rule__TargetPlatformDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1196:1: ( rule__TargetPlatformDefinition__Group__4__Impl rule__TargetPlatformDefinition__Group__5 )
            // InternalTargetPlatform.g:1197:2: rule__TargetPlatformDefinition__Group__4__Impl rule__TargetPlatformDefinition__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__TargetPlatformDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetPlatformDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__4"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__4__Impl"
    // InternalTargetPlatform.g:1204:1: rule__TargetPlatformDefinition__Group__4__Impl : ( ( rule__TargetPlatformDefinition__ElementsAssignment_4 )* ) ;
    public final void rule__TargetPlatformDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1208:1: ( ( ( rule__TargetPlatformDefinition__ElementsAssignment_4 )* ) )
            // InternalTargetPlatform.g:1209:1: ( ( rule__TargetPlatformDefinition__ElementsAssignment_4 )* )
            {
            // InternalTargetPlatform.g:1209:1: ( ( rule__TargetPlatformDefinition__ElementsAssignment_4 )* )
            // InternalTargetPlatform.g:1210:2: ( rule__TargetPlatformDefinition__ElementsAssignment_4 )*
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAssignment_4()); 
            // InternalTargetPlatform.g:1211:2: ( rule__TargetPlatformDefinition__ElementsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25||LA8_0==29||LA8_0==31||LA8_0==34) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTargetPlatform.g:1211:3: rule__TargetPlatformDefinition__ElementsAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TargetPlatformDefinition__ElementsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__4__Impl"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__5"
    // InternalTargetPlatform.g:1219:1: rule__TargetPlatformDefinition__Group__5 : rule__TargetPlatformDefinition__Group__5__Impl ;
    public final void rule__TargetPlatformDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1223:1: ( rule__TargetPlatformDefinition__Group__5__Impl )
            // InternalTargetPlatform.g:1224:2: rule__TargetPlatformDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetPlatformDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__5"


    // $ANTLR start "rule__TargetPlatformDefinition__Group__5__Impl"
    // InternalTargetPlatform.g:1230:1: rule__TargetPlatformDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__TargetPlatformDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1234:1: ( ( '}' ) )
            // InternalTargetPlatform.g:1235:1: ( '}' )
            {
            // InternalTargetPlatform.g:1235:1: ( '}' )
            // InternalTargetPlatform.g:1236:2: '}'
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTargetPlatformDefinitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__Group__5__Impl"


    // $ANTLR start "rule__Windows__Group__0"
    // InternalTargetPlatform.g:1246:1: rule__Windows__Group__0 : rule__Windows__Group__0__Impl rule__Windows__Group__1 ;
    public final void rule__Windows__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1250:1: ( rule__Windows__Group__0__Impl rule__Windows__Group__1 )
            // InternalTargetPlatform.g:1251:2: rule__Windows__Group__0__Impl rule__Windows__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Windows__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Windows__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Windows__Group__0"


    // $ANTLR start "rule__Windows__Group__0__Impl"
    // InternalTargetPlatform.g:1258:1: rule__Windows__Group__0__Impl : ( () ) ;
    public final void rule__Windows__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1262:1: ( ( () ) )
            // InternalTargetPlatform.g:1263:1: ( () )
            {
            // InternalTargetPlatform.g:1263:1: ( () )
            // InternalTargetPlatform.g:1264:2: ()
            {
             before(grammarAccess.getWindowsAccess().getWindowsAction_0()); 
            // InternalTargetPlatform.g:1265:2: ()
            // InternalTargetPlatform.g:1265:3: 
            {
            }

             after(grammarAccess.getWindowsAccess().getWindowsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Windows__Group__0__Impl"


    // $ANTLR start "rule__Windows__Group__1"
    // InternalTargetPlatform.g:1273:1: rule__Windows__Group__1 : rule__Windows__Group__1__Impl rule__Windows__Group__2 ;
    public final void rule__Windows__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1277:1: ( rule__Windows__Group__1__Impl rule__Windows__Group__2 )
            // InternalTargetPlatform.g:1278:2: rule__Windows__Group__1__Impl rule__Windows__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Windows__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Windows__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Windows__Group__1"


    // $ANTLR start "rule__Windows__Group__1__Impl"
    // InternalTargetPlatform.g:1285:1: rule__Windows__Group__1__Impl : ( 'Windows' ) ;
    public final void rule__Windows__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1289:1: ( ( 'Windows' ) )
            // InternalTargetPlatform.g:1290:1: ( 'Windows' )
            {
            // InternalTargetPlatform.g:1290:1: ( 'Windows' )
            // InternalTargetPlatform.g:1291:2: 'Windows'
            {
             before(grammarAccess.getWindowsAccess().getWindowsKeyword_1()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getWindowsAccess().getWindowsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Windows__Group__1__Impl"


    // $ANTLR start "rule__Windows__Group__2"
    // InternalTargetPlatform.g:1300:1: rule__Windows__Group__2 : rule__Windows__Group__2__Impl rule__Windows__Group__3 ;
    public final void rule__Windows__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1304:1: ( rule__Windows__Group__2__Impl rule__Windows__Group__3 )
            // InternalTargetPlatform.g:1305:2: rule__Windows__Group__2__Impl rule__Windows__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Windows__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Windows__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Windows__Group__2"


    // $ANTLR start "rule__Windows__Group__2__Impl"
    // InternalTargetPlatform.g:1312:1: rule__Windows__Group__2__Impl : ( ( rule__Windows__KindAssignment_2 )? ) ;
    public final void rule__Windows__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1316:1: ( ( ( rule__Windows__KindAssignment_2 )? ) )
            // InternalTargetPlatform.g:1317:1: ( ( rule__Windows__KindAssignment_2 )? )
            {
            // InternalTargetPlatform.g:1317:1: ( ( rule__Windows__KindAssignment_2 )? )
            // InternalTargetPlatform.g:1318:2: ( rule__Windows__KindAssignment_2 )?
            {
             before(grammarAccess.getWindowsAccess().getKindAssignment_2()); 
            // InternalTargetPlatform.g:1319:2: ( rule__Windows__KindAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTargetPlatform.g:1319:3: rule__Windows__KindAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Windows__KindAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWindowsAccess().getKindAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Windows__Group__2__Impl"


    // $ANTLR start "rule__Windows__Group__3"
    // InternalTargetPlatform.g:1327:1: rule__Windows__Group__3 : rule__Windows__Group__3__Impl ;
    public final void rule__Windows__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1331:1: ( rule__Windows__Group__3__Impl )
            // InternalTargetPlatform.g:1332:2: rule__Windows__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Windows__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Windows__Group__3"


    // $ANTLR start "rule__Windows__Group__3__Impl"
    // InternalTargetPlatform.g:1338:1: rule__Windows__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Windows__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1342:1: ( ( ( ';' )? ) )
            // InternalTargetPlatform.g:1343:1: ( ( ';' )? )
            {
            // InternalTargetPlatform.g:1343:1: ( ( ';' )? )
            // InternalTargetPlatform.g:1344:2: ( ';' )?
            {
             before(grammarAccess.getWindowsAccess().getSemicolonKeyword_3()); 
            // InternalTargetPlatform.g:1345:2: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==22) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTargetPlatform.g:1345:3: ';'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getWindowsAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Windows__Group__3__Impl"


    // $ANTLR start "rule__Linux__Group__0"
    // InternalTargetPlatform.g:1354:1: rule__Linux__Group__0 : rule__Linux__Group__0__Impl rule__Linux__Group__1 ;
    public final void rule__Linux__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1358:1: ( rule__Linux__Group__0__Impl rule__Linux__Group__1 )
            // InternalTargetPlatform.g:1359:2: rule__Linux__Group__0__Impl rule__Linux__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Linux__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linux__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linux__Group__0"


    // $ANTLR start "rule__Linux__Group__0__Impl"
    // InternalTargetPlatform.g:1366:1: rule__Linux__Group__0__Impl : ( () ) ;
    public final void rule__Linux__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1370:1: ( ( () ) )
            // InternalTargetPlatform.g:1371:1: ( () )
            {
            // InternalTargetPlatform.g:1371:1: ( () )
            // InternalTargetPlatform.g:1372:2: ()
            {
             before(grammarAccess.getLinuxAccess().getLinuxAction_0()); 
            // InternalTargetPlatform.g:1373:2: ()
            // InternalTargetPlatform.g:1373:3: 
            {
            }

             after(grammarAccess.getLinuxAccess().getLinuxAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linux__Group__0__Impl"


    // $ANTLR start "rule__Linux__Group__1"
    // InternalTargetPlatform.g:1381:1: rule__Linux__Group__1 : rule__Linux__Group__1__Impl rule__Linux__Group__2 ;
    public final void rule__Linux__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1385:1: ( rule__Linux__Group__1__Impl rule__Linux__Group__2 )
            // InternalTargetPlatform.g:1386:2: rule__Linux__Group__1__Impl rule__Linux__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Linux__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linux__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linux__Group__1"


    // $ANTLR start "rule__Linux__Group__1__Impl"
    // InternalTargetPlatform.g:1393:1: rule__Linux__Group__1__Impl : ( 'Linux' ) ;
    public final void rule__Linux__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1397:1: ( ( 'Linux' ) )
            // InternalTargetPlatform.g:1398:1: ( 'Linux' )
            {
            // InternalTargetPlatform.g:1398:1: ( 'Linux' )
            // InternalTargetPlatform.g:1399:2: 'Linux'
            {
             before(grammarAccess.getLinuxAccess().getLinuxKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLinuxAccess().getLinuxKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linux__Group__1__Impl"


    // $ANTLR start "rule__Linux__Group__2"
    // InternalTargetPlatform.g:1408:1: rule__Linux__Group__2 : rule__Linux__Group__2__Impl rule__Linux__Group__3 ;
    public final void rule__Linux__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1412:1: ( rule__Linux__Group__2__Impl rule__Linux__Group__3 )
            // InternalTargetPlatform.g:1413:2: rule__Linux__Group__2__Impl rule__Linux__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Linux__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Linux__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linux__Group__2"


    // $ANTLR start "rule__Linux__Group__2__Impl"
    // InternalTargetPlatform.g:1420:1: rule__Linux__Group__2__Impl : ( ( rule__Linux__KindAssignment_2 )? ) ;
    public final void rule__Linux__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1424:1: ( ( ( rule__Linux__KindAssignment_2 )? ) )
            // InternalTargetPlatform.g:1425:1: ( ( rule__Linux__KindAssignment_2 )? )
            {
            // InternalTargetPlatform.g:1425:1: ( ( rule__Linux__KindAssignment_2 )? )
            // InternalTargetPlatform.g:1426:2: ( rule__Linux__KindAssignment_2 )?
            {
             before(grammarAccess.getLinuxAccess().getKindAssignment_2()); 
            // InternalTargetPlatform.g:1427:2: ( rule__Linux__KindAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTargetPlatform.g:1427:3: rule__Linux__KindAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Linux__KindAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLinuxAccess().getKindAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linux__Group__2__Impl"


    // $ANTLR start "rule__Linux__Group__3"
    // InternalTargetPlatform.g:1435:1: rule__Linux__Group__3 : rule__Linux__Group__3__Impl ;
    public final void rule__Linux__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1439:1: ( rule__Linux__Group__3__Impl )
            // InternalTargetPlatform.g:1440:2: rule__Linux__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Linux__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linux__Group__3"


    // $ANTLR start "rule__Linux__Group__3__Impl"
    // InternalTargetPlatform.g:1446:1: rule__Linux__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Linux__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1450:1: ( ( ( ';' )? ) )
            // InternalTargetPlatform.g:1451:1: ( ( ';' )? )
            {
            // InternalTargetPlatform.g:1451:1: ( ( ';' )? )
            // InternalTargetPlatform.g:1452:2: ( ';' )?
            {
             before(grammarAccess.getLinuxAccess().getSemicolonKeyword_3()); 
            // InternalTargetPlatform.g:1453:2: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTargetPlatform.g:1453:3: ';'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getLinuxAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linux__Group__3__Impl"


    // $ANTLR start "rule__MacOS__Group__0"
    // InternalTargetPlatform.g:1462:1: rule__MacOS__Group__0 : rule__MacOS__Group__0__Impl rule__MacOS__Group__1 ;
    public final void rule__MacOS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1466:1: ( rule__MacOS__Group__0__Impl rule__MacOS__Group__1 )
            // InternalTargetPlatform.g:1467:2: rule__MacOS__Group__0__Impl rule__MacOS__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__MacOS__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacOS__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOS__Group__0"


    // $ANTLR start "rule__MacOS__Group__0__Impl"
    // InternalTargetPlatform.g:1474:1: rule__MacOS__Group__0__Impl : ( () ) ;
    public final void rule__MacOS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1478:1: ( ( () ) )
            // InternalTargetPlatform.g:1479:1: ( () )
            {
            // InternalTargetPlatform.g:1479:1: ( () )
            // InternalTargetPlatform.g:1480:2: ()
            {
             before(grammarAccess.getMacOSAccess().getMacOSAction_0()); 
            // InternalTargetPlatform.g:1481:2: ()
            // InternalTargetPlatform.g:1481:3: 
            {
            }

             after(grammarAccess.getMacOSAccess().getMacOSAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOS__Group__0__Impl"


    // $ANTLR start "rule__MacOS__Group__1"
    // InternalTargetPlatform.g:1489:1: rule__MacOS__Group__1 : rule__MacOS__Group__1__Impl rule__MacOS__Group__2 ;
    public final void rule__MacOS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1493:1: ( rule__MacOS__Group__1__Impl rule__MacOS__Group__2 )
            // InternalTargetPlatform.g:1494:2: rule__MacOS__Group__1__Impl rule__MacOS__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__MacOS__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacOS__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOS__Group__1"


    // $ANTLR start "rule__MacOS__Group__1__Impl"
    // InternalTargetPlatform.g:1501:1: rule__MacOS__Group__1__Impl : ( 'MacOS' ) ;
    public final void rule__MacOS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1505:1: ( ( 'MacOS' ) )
            // InternalTargetPlatform.g:1506:1: ( 'MacOS' )
            {
            // InternalTargetPlatform.g:1506:1: ( 'MacOS' )
            // InternalTargetPlatform.g:1507:2: 'MacOS'
            {
             before(grammarAccess.getMacOSAccess().getMacOSKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMacOSAccess().getMacOSKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOS__Group__1__Impl"


    // $ANTLR start "rule__MacOS__Group__2"
    // InternalTargetPlatform.g:1516:1: rule__MacOS__Group__2 : rule__MacOS__Group__2__Impl rule__MacOS__Group__3 ;
    public final void rule__MacOS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1520:1: ( rule__MacOS__Group__2__Impl rule__MacOS__Group__3 )
            // InternalTargetPlatform.g:1521:2: rule__MacOS__Group__2__Impl rule__MacOS__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__MacOS__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MacOS__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOS__Group__2"


    // $ANTLR start "rule__MacOS__Group__2__Impl"
    // InternalTargetPlatform.g:1528:1: rule__MacOS__Group__2__Impl : ( ( rule__MacOS__KindAssignment_2 )? ) ;
    public final void rule__MacOS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1532:1: ( ( ( rule__MacOS__KindAssignment_2 )? ) )
            // InternalTargetPlatform.g:1533:1: ( ( rule__MacOS__KindAssignment_2 )? )
            {
            // InternalTargetPlatform.g:1533:1: ( ( rule__MacOS__KindAssignment_2 )? )
            // InternalTargetPlatform.g:1534:2: ( rule__MacOS__KindAssignment_2 )?
            {
             before(grammarAccess.getMacOSAccess().getKindAssignment_2()); 
            // InternalTargetPlatform.g:1535:2: ( rule__MacOS__KindAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTargetPlatform.g:1535:3: rule__MacOS__KindAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MacOS__KindAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMacOSAccess().getKindAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOS__Group__2__Impl"


    // $ANTLR start "rule__MacOS__Group__3"
    // InternalTargetPlatform.g:1543:1: rule__MacOS__Group__3 : rule__MacOS__Group__3__Impl ;
    public final void rule__MacOS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1547:1: ( rule__MacOS__Group__3__Impl )
            // InternalTargetPlatform.g:1548:2: rule__MacOS__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MacOS__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOS__Group__3"


    // $ANTLR start "rule__MacOS__Group__3__Impl"
    // InternalTargetPlatform.g:1554:1: rule__MacOS__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__MacOS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1558:1: ( ( ( ';' )? ) )
            // InternalTargetPlatform.g:1559:1: ( ( ';' )? )
            {
            // InternalTargetPlatform.g:1559:1: ( ( ';' )? )
            // InternalTargetPlatform.g:1560:2: ( ';' )?
            {
             before(grammarAccess.getMacOSAccess().getSemicolonKeyword_3()); 
            // InternalTargetPlatform.g:1561:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==22) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTargetPlatform.g:1561:3: ';'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getMacOSAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOS__Group__3__Impl"


    // $ANTLR start "rule__NetworkInterface__Group__0"
    // InternalTargetPlatform.g:1570:1: rule__NetworkInterface__Group__0 : rule__NetworkInterface__Group__0__Impl rule__NetworkInterface__Group__1 ;
    public final void rule__NetworkInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1574:1: ( rule__NetworkInterface__Group__0__Impl rule__NetworkInterface__Group__1 )
            // InternalTargetPlatform.g:1575:2: rule__NetworkInterface__Group__0__Impl rule__NetworkInterface__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__NetworkInterface__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group__0"


    // $ANTLR start "rule__NetworkInterface__Group__0__Impl"
    // InternalTargetPlatform.g:1582:1: rule__NetworkInterface__Group__0__Impl : ( 'NetworkInterface' ) ;
    public final void rule__NetworkInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1586:1: ( ( 'NetworkInterface' ) )
            // InternalTargetPlatform.g:1587:1: ( 'NetworkInterface' )
            {
            // InternalTargetPlatform.g:1587:1: ( 'NetworkInterface' )
            // InternalTargetPlatform.g:1588:2: 'NetworkInterface'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getNetworkInterfaceKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNetworkInterfaceAccess().getNetworkInterfaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group__0__Impl"


    // $ANTLR start "rule__NetworkInterface__Group__1"
    // InternalTargetPlatform.g:1597:1: rule__NetworkInterface__Group__1 : rule__NetworkInterface__Group__1__Impl rule__NetworkInterface__Group__2 ;
    public final void rule__NetworkInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1601:1: ( rule__NetworkInterface__Group__1__Impl rule__NetworkInterface__Group__2 )
            // InternalTargetPlatform.g:1602:2: rule__NetworkInterface__Group__1__Impl rule__NetworkInterface__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__NetworkInterface__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group__1"


    // $ANTLR start "rule__NetworkInterface__Group__1__Impl"
    // InternalTargetPlatform.g:1609:1: rule__NetworkInterface__Group__1__Impl : ( ( rule__NetworkInterface__NameAssignment_1 ) ) ;
    public final void rule__NetworkInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1613:1: ( ( ( rule__NetworkInterface__NameAssignment_1 ) ) )
            // InternalTargetPlatform.g:1614:1: ( ( rule__NetworkInterface__NameAssignment_1 ) )
            {
            // InternalTargetPlatform.g:1614:1: ( ( rule__NetworkInterface__NameAssignment_1 ) )
            // InternalTargetPlatform.g:1615:2: ( rule__NetworkInterface__NameAssignment_1 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getNameAssignment_1()); 
            // InternalTargetPlatform.g:1616:2: ( rule__NetworkInterface__NameAssignment_1 )
            // InternalTargetPlatform.g:1616:3: rule__NetworkInterface__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkInterfaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group__1__Impl"


    // $ANTLR start "rule__NetworkInterface__Group__2"
    // InternalTargetPlatform.g:1624:1: rule__NetworkInterface__Group__2 : rule__NetworkInterface__Group__2__Impl rule__NetworkInterface__Group__3 ;
    public final void rule__NetworkInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1628:1: ( rule__NetworkInterface__Group__2__Impl rule__NetworkInterface__Group__3 )
            // InternalTargetPlatform.g:1629:2: rule__NetworkInterface__Group__2__Impl rule__NetworkInterface__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__NetworkInterface__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group__2"


    // $ANTLR start "rule__NetworkInterface__Group__2__Impl"
    // InternalTargetPlatform.g:1636:1: rule__NetworkInterface__Group__2__Impl : ( '{' ) ;
    public final void rule__NetworkInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1640:1: ( ( '{' ) )
            // InternalTargetPlatform.g:1641:1: ( '{' )
            {
            // InternalTargetPlatform.g:1641:1: ( '{' )
            // InternalTargetPlatform.g:1642:2: '{'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getNetworkInterfaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group__2__Impl"


    // $ANTLR start "rule__NetworkInterface__Group__3"
    // InternalTargetPlatform.g:1651:1: rule__NetworkInterface__Group__3 : rule__NetworkInterface__Group__3__Impl rule__NetworkInterface__Group__4 ;
    public final void rule__NetworkInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1655:1: ( rule__NetworkInterface__Group__3__Impl rule__NetworkInterface__Group__4 )
            // InternalTargetPlatform.g:1656:2: rule__NetworkInterface__Group__3__Impl rule__NetworkInterface__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__NetworkInterface__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group__3"


    // $ANTLR start "rule__NetworkInterface__Group__3__Impl"
    // InternalTargetPlatform.g:1663:1: rule__NetworkInterface__Group__3__Impl : ( ( rule__NetworkInterface__UnorderedGroup_3 ) ) ;
    public final void rule__NetworkInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1667:1: ( ( ( rule__NetworkInterface__UnorderedGroup_3 ) ) )
            // InternalTargetPlatform.g:1668:1: ( ( rule__NetworkInterface__UnorderedGroup_3 ) )
            {
            // InternalTargetPlatform.g:1668:1: ( ( rule__NetworkInterface__UnorderedGroup_3 ) )
            // InternalTargetPlatform.g:1669:2: ( rule__NetworkInterface__UnorderedGroup_3 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3()); 
            // InternalTargetPlatform.g:1670:2: ( rule__NetworkInterface__UnorderedGroup_3 )
            // InternalTargetPlatform.g:1670:3: rule__NetworkInterface__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group__3__Impl"


    // $ANTLR start "rule__NetworkInterface__Group__4"
    // InternalTargetPlatform.g:1678:1: rule__NetworkInterface__Group__4 : rule__NetworkInterface__Group__4__Impl ;
    public final void rule__NetworkInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1682:1: ( rule__NetworkInterface__Group__4__Impl )
            // InternalTargetPlatform.g:1683:2: rule__NetworkInterface__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group__4"


    // $ANTLR start "rule__NetworkInterface__Group__4__Impl"
    // InternalTargetPlatform.g:1689:1: rule__NetworkInterface__Group__4__Impl : ( '}' ) ;
    public final void rule__NetworkInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1693:1: ( ( '}' ) )
            // InternalTargetPlatform.g:1694:1: ( '}' )
            {
            // InternalTargetPlatform.g:1694:1: ( '}' )
            // InternalTargetPlatform.g:1695:2: '}'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getNetworkInterfaceAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group__4__Impl"


    // $ANTLR start "rule__NetworkInterface__Group_3_0__0"
    // InternalTargetPlatform.g:1705:1: rule__NetworkInterface__Group_3_0__0 : rule__NetworkInterface__Group_3_0__0__Impl rule__NetworkInterface__Group_3_0__1 ;
    public final void rule__NetworkInterface__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1709:1: ( rule__NetworkInterface__Group_3_0__0__Impl rule__NetworkInterface__Group_3_0__1 )
            // InternalTargetPlatform.g:1710:2: rule__NetworkInterface__Group_3_0__0__Impl rule__NetworkInterface__Group_3_0__1
            {
            pushFollow(FOLLOW_9);
            rule__NetworkInterface__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_0__0"


    // $ANTLR start "rule__NetworkInterface__Group_3_0__0__Impl"
    // InternalTargetPlatform.g:1717:1: rule__NetworkInterface__Group_3_0__0__Impl : ( 'HostAddress' ) ;
    public final void rule__NetworkInterface__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1721:1: ( ( 'HostAddress' ) )
            // InternalTargetPlatform.g:1722:1: ( 'HostAddress' )
            {
            // InternalTargetPlatform.g:1722:1: ( 'HostAddress' )
            // InternalTargetPlatform.g:1723:2: 'HostAddress'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getHostAddressKeyword_3_0_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getNetworkInterfaceAccess().getHostAddressKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_0__0__Impl"


    // $ANTLR start "rule__NetworkInterface__Group_3_0__1"
    // InternalTargetPlatform.g:1732:1: rule__NetworkInterface__Group_3_0__1 : rule__NetworkInterface__Group_3_0__1__Impl rule__NetworkInterface__Group_3_0__2 ;
    public final void rule__NetworkInterface__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1736:1: ( rule__NetworkInterface__Group_3_0__1__Impl rule__NetworkInterface__Group_3_0__2 )
            // InternalTargetPlatform.g:1737:2: rule__NetworkInterface__Group_3_0__1__Impl rule__NetworkInterface__Group_3_0__2
            {
            pushFollow(FOLLOW_18);
            rule__NetworkInterface__Group_3_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group_3_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_0__1"


    // $ANTLR start "rule__NetworkInterface__Group_3_0__1__Impl"
    // InternalTargetPlatform.g:1744:1: rule__NetworkInterface__Group_3_0__1__Impl : ( ( rule__NetworkInterface__HostAddressAssignment_3_0_1 ) ) ;
    public final void rule__NetworkInterface__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1748:1: ( ( ( rule__NetworkInterface__HostAddressAssignment_3_0_1 ) ) )
            // InternalTargetPlatform.g:1749:1: ( ( rule__NetworkInterface__HostAddressAssignment_3_0_1 ) )
            {
            // InternalTargetPlatform.g:1749:1: ( ( rule__NetworkInterface__HostAddressAssignment_3_0_1 ) )
            // InternalTargetPlatform.g:1750:2: ( rule__NetworkInterface__HostAddressAssignment_3_0_1 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getHostAddressAssignment_3_0_1()); 
            // InternalTargetPlatform.g:1751:2: ( rule__NetworkInterface__HostAddressAssignment_3_0_1 )
            // InternalTargetPlatform.g:1751:3: rule__NetworkInterface__HostAddressAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__HostAddressAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkInterfaceAccess().getHostAddressAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_0__1__Impl"


    // $ANTLR start "rule__NetworkInterface__Group_3_0__2"
    // InternalTargetPlatform.g:1759:1: rule__NetworkInterface__Group_3_0__2 : rule__NetworkInterface__Group_3_0__2__Impl ;
    public final void rule__NetworkInterface__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1763:1: ( rule__NetworkInterface__Group_3_0__2__Impl )
            // InternalTargetPlatform.g:1764:2: rule__NetworkInterface__Group_3_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group_3_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_0__2"


    // $ANTLR start "rule__NetworkInterface__Group_3_0__2__Impl"
    // InternalTargetPlatform.g:1770:1: rule__NetworkInterface__Group_3_0__2__Impl : ( ( rule__NetworkInterface__Group_3_0_2__0 )? ) ;
    public final void rule__NetworkInterface__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1774:1: ( ( ( rule__NetworkInterface__Group_3_0_2__0 )? ) )
            // InternalTargetPlatform.g:1775:1: ( ( rule__NetworkInterface__Group_3_0_2__0 )? )
            {
            // InternalTargetPlatform.g:1775:1: ( ( rule__NetworkInterface__Group_3_0_2__0 )? )
            // InternalTargetPlatform.g:1776:2: ( rule__NetworkInterface__Group_3_0_2__0 )?
            {
             before(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0_2()); 
            // InternalTargetPlatform.g:1777:2: ( rule__NetworkInterface__Group_3_0_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTargetPlatform.g:1777:3: rule__NetworkInterface__Group_3_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkInterface__Group_3_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_0__2__Impl"


    // $ANTLR start "rule__NetworkInterface__Group_3_0_2__0"
    // InternalTargetPlatform.g:1786:1: rule__NetworkInterface__Group_3_0_2__0 : rule__NetworkInterface__Group_3_0_2__0__Impl rule__NetworkInterface__Group_3_0_2__1 ;
    public final void rule__NetworkInterface__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1790:1: ( rule__NetworkInterface__Group_3_0_2__0__Impl rule__NetworkInterface__Group_3_0_2__1 )
            // InternalTargetPlatform.g:1791:2: rule__NetworkInterface__Group_3_0_2__0__Impl rule__NetworkInterface__Group_3_0_2__1
            {
            pushFollow(FOLLOW_19);
            rule__NetworkInterface__Group_3_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group_3_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_0_2__0"


    // $ANTLR start "rule__NetworkInterface__Group_3_0_2__0__Impl"
    // InternalTargetPlatform.g:1798:1: rule__NetworkInterface__Group_3_0_2__0__Impl : ( ':' ) ;
    public final void rule__NetworkInterface__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1802:1: ( ( ':' ) )
            // InternalTargetPlatform.g:1803:1: ( ':' )
            {
            // InternalTargetPlatform.g:1803:1: ( ':' )
            // InternalTargetPlatform.g:1804:2: ':'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getColonKeyword_3_0_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getNetworkInterfaceAccess().getColonKeyword_3_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_0_2__0__Impl"


    // $ANTLR start "rule__NetworkInterface__Group_3_0_2__1"
    // InternalTargetPlatform.g:1813:1: rule__NetworkInterface__Group_3_0_2__1 : rule__NetworkInterface__Group_3_0_2__1__Impl ;
    public final void rule__NetworkInterface__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1817:1: ( rule__NetworkInterface__Group_3_0_2__1__Impl )
            // InternalTargetPlatform.g:1818:2: rule__NetworkInterface__Group_3_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group_3_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_0_2__1"


    // $ANTLR start "rule__NetworkInterface__Group_3_0_2__1__Impl"
    // InternalTargetPlatform.g:1824:1: rule__NetworkInterface__Group_3_0_2__1__Impl : ( ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 ) ) ;
    public final void rule__NetworkInterface__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1828:1: ( ( ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 ) ) )
            // InternalTargetPlatform.g:1829:1: ( ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 ) )
            {
            // InternalTargetPlatform.g:1829:1: ( ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 ) )
            // InternalTargetPlatform.g:1830:2: ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getPortNrAssignment_3_0_2_1()); 
            // InternalTargetPlatform.g:1831:2: ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 )
            // InternalTargetPlatform.g:1831:3: rule__NetworkInterface__PortNrAssignment_3_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__PortNrAssignment_3_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkInterfaceAccess().getPortNrAssignment_3_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_0_2__1__Impl"


    // $ANTLR start "rule__NetworkInterface__Group_3_1__0"
    // InternalTargetPlatform.g:1840:1: rule__NetworkInterface__Group_3_1__0 : rule__NetworkInterface__Group_3_1__0__Impl rule__NetworkInterface__Group_3_1__1 ;
    public final void rule__NetworkInterface__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1844:1: ( rule__NetworkInterface__Group_3_1__0__Impl rule__NetworkInterface__Group_3_1__1 )
            // InternalTargetPlatform.g:1845:2: rule__NetworkInterface__Group_3_1__0__Impl rule__NetworkInterface__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
            rule__NetworkInterface__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_1__0"


    // $ANTLR start "rule__NetworkInterface__Group_3_1__0__Impl"
    // InternalTargetPlatform.g:1852:1: rule__NetworkInterface__Group_3_1__0__Impl : ( 'Kind' ) ;
    public final void rule__NetworkInterface__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1856:1: ( ( 'Kind' ) )
            // InternalTargetPlatform.g:1857:1: ( 'Kind' )
            {
            // InternalTargetPlatform.g:1857:1: ( 'Kind' )
            // InternalTargetPlatform.g:1858:2: 'Kind'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getKindKeyword_3_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getNetworkInterfaceAccess().getKindKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_1__0__Impl"


    // $ANTLR start "rule__NetworkInterface__Group_3_1__1"
    // InternalTargetPlatform.g:1867:1: rule__NetworkInterface__Group_3_1__1 : rule__NetworkInterface__Group_3_1__1__Impl ;
    public final void rule__NetworkInterface__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1871:1: ( rule__NetworkInterface__Group_3_1__1__Impl )
            // InternalTargetPlatform.g:1872:2: rule__NetworkInterface__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_1__1"


    // $ANTLR start "rule__NetworkInterface__Group_3_1__1__Impl"
    // InternalTargetPlatform.g:1878:1: rule__NetworkInterface__Group_3_1__1__Impl : ( ( rule__NetworkInterface__KindAssignment_3_1_1 ) ) ;
    public final void rule__NetworkInterface__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1882:1: ( ( ( rule__NetworkInterface__KindAssignment_3_1_1 ) ) )
            // InternalTargetPlatform.g:1883:1: ( ( rule__NetworkInterface__KindAssignment_3_1_1 ) )
            {
            // InternalTargetPlatform.g:1883:1: ( ( rule__NetworkInterface__KindAssignment_3_1_1 ) )
            // InternalTargetPlatform.g:1884:2: ( rule__NetworkInterface__KindAssignment_3_1_1 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getKindAssignment_3_1_1()); 
            // InternalTargetPlatform.g:1885:2: ( rule__NetworkInterface__KindAssignment_3_1_1 )
            // InternalTargetPlatform.g:1885:3: rule__NetworkInterface__KindAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__KindAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getNetworkInterfaceAccess().getKindAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__Group_3_1__1__Impl"


    // $ANTLR start "rule__CPU__Group__0"
    // InternalTargetPlatform.g:1894:1: rule__CPU__Group__0 : rule__CPU__Group__0__Impl rule__CPU__Group__1 ;
    public final void rule__CPU__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1898:1: ( rule__CPU__Group__0__Impl rule__CPU__Group__1 )
            // InternalTargetPlatform.g:1899:2: rule__CPU__Group__0__Impl rule__CPU__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__CPU__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPU__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group__0"


    // $ANTLR start "rule__CPU__Group__0__Impl"
    // InternalTargetPlatform.g:1906:1: rule__CPU__Group__0__Impl : ( 'CPU' ) ;
    public final void rule__CPU__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1910:1: ( ( 'CPU' ) )
            // InternalTargetPlatform.g:1911:1: ( 'CPU' )
            {
            // InternalTargetPlatform.g:1911:1: ( 'CPU' )
            // InternalTargetPlatform.g:1912:2: 'CPU'
            {
             before(grammarAccess.getCPUAccess().getCPUKeyword_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getCPUAccess().getCPUKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group__0__Impl"


    // $ANTLR start "rule__CPU__Group__1"
    // InternalTargetPlatform.g:1921:1: rule__CPU__Group__1 : rule__CPU__Group__1__Impl rule__CPU__Group__2 ;
    public final void rule__CPU__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1925:1: ( rule__CPU__Group__1__Impl rule__CPU__Group__2 )
            // InternalTargetPlatform.g:1926:2: rule__CPU__Group__1__Impl rule__CPU__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__CPU__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPU__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group__1"


    // $ANTLR start "rule__CPU__Group__1__Impl"
    // InternalTargetPlatform.g:1933:1: rule__CPU__Group__1__Impl : ( ( rule__CPU__NameAssignment_1 ) ) ;
    public final void rule__CPU__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1937:1: ( ( ( rule__CPU__NameAssignment_1 ) ) )
            // InternalTargetPlatform.g:1938:1: ( ( rule__CPU__NameAssignment_1 ) )
            {
            // InternalTargetPlatform.g:1938:1: ( ( rule__CPU__NameAssignment_1 ) )
            // InternalTargetPlatform.g:1939:2: ( rule__CPU__NameAssignment_1 )
            {
             before(grammarAccess.getCPUAccess().getNameAssignment_1()); 
            // InternalTargetPlatform.g:1940:2: ( rule__CPU__NameAssignment_1 )
            // InternalTargetPlatform.g:1940:3: rule__CPU__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__CPU__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCPUAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group__1__Impl"


    // $ANTLR start "rule__CPU__Group__2"
    // InternalTargetPlatform.g:1948:1: rule__CPU__Group__2 : rule__CPU__Group__2__Impl rule__CPU__Group__3 ;
    public final void rule__CPU__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1952:1: ( rule__CPU__Group__2__Impl rule__CPU__Group__3 )
            // InternalTargetPlatform.g:1953:2: rule__CPU__Group__2__Impl rule__CPU__Group__3
            {
            pushFollow(FOLLOW_20);
            rule__CPU__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPU__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group__2"


    // $ANTLR start "rule__CPU__Group__2__Impl"
    // InternalTargetPlatform.g:1960:1: rule__CPU__Group__2__Impl : ( '{' ) ;
    public final void rule__CPU__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1964:1: ( ( '{' ) )
            // InternalTargetPlatform.g:1965:1: ( '{' )
            {
            // InternalTargetPlatform.g:1965:1: ( '{' )
            // InternalTargetPlatform.g:1966:2: '{'
            {
             before(grammarAccess.getCPUAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCPUAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group__2__Impl"


    // $ANTLR start "rule__CPU__Group__3"
    // InternalTargetPlatform.g:1975:1: rule__CPU__Group__3 : rule__CPU__Group__3__Impl rule__CPU__Group__4 ;
    public final void rule__CPU__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1979:1: ( rule__CPU__Group__3__Impl rule__CPU__Group__4 )
            // InternalTargetPlatform.g:1980:2: rule__CPU__Group__3__Impl rule__CPU__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__CPU__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPU__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group__3"


    // $ANTLR start "rule__CPU__Group__3__Impl"
    // InternalTargetPlatform.g:1987:1: rule__CPU__Group__3__Impl : ( ( rule__CPU__UnorderedGroup_3 ) ) ;
    public final void rule__CPU__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1991:1: ( ( ( rule__CPU__UnorderedGroup_3 ) ) )
            // InternalTargetPlatform.g:1992:1: ( ( rule__CPU__UnorderedGroup_3 ) )
            {
            // InternalTargetPlatform.g:1992:1: ( ( rule__CPU__UnorderedGroup_3 ) )
            // InternalTargetPlatform.g:1993:2: ( rule__CPU__UnorderedGroup_3 )
            {
             before(grammarAccess.getCPUAccess().getUnorderedGroup_3()); 
            // InternalTargetPlatform.g:1994:2: ( rule__CPU__UnorderedGroup_3 )
            // InternalTargetPlatform.g:1994:3: rule__CPU__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__CPU__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getCPUAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group__3__Impl"


    // $ANTLR start "rule__CPU__Group__4"
    // InternalTargetPlatform.g:2002:1: rule__CPU__Group__4 : rule__CPU__Group__4__Impl ;
    public final void rule__CPU__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2006:1: ( rule__CPU__Group__4__Impl )
            // InternalTargetPlatform.g:2007:2: rule__CPU__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CPU__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group__4"


    // $ANTLR start "rule__CPU__Group__4__Impl"
    // InternalTargetPlatform.g:2013:1: rule__CPU__Group__4__Impl : ( '}' ) ;
    public final void rule__CPU__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2017:1: ( ( '}' ) )
            // InternalTargetPlatform.g:2018:1: ( '}' )
            {
            // InternalTargetPlatform.g:2018:1: ( '}' )
            // InternalTargetPlatform.g:2019:2: '}'
            {
             before(grammarAccess.getCPUAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCPUAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group__4__Impl"


    // $ANTLR start "rule__CPU__Group_3_0__0"
    // InternalTargetPlatform.g:2029:1: rule__CPU__Group_3_0__0 : rule__CPU__Group_3_0__0__Impl rule__CPU__Group_3_0__1 ;
    public final void rule__CPU__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2033:1: ( rule__CPU__Group_3_0__0__Impl rule__CPU__Group_3_0__1 )
            // InternalTargetPlatform.g:2034:2: rule__CPU__Group_3_0__0__Impl rule__CPU__Group_3_0__1
            {
            pushFollow(FOLLOW_9);
            rule__CPU__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPU__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group_3_0__0"


    // $ANTLR start "rule__CPU__Group_3_0__0__Impl"
    // InternalTargetPlatform.g:2041:1: rule__CPU__Group_3_0__0__Impl : ( 'Kind' ) ;
    public final void rule__CPU__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2045:1: ( ( 'Kind' ) )
            // InternalTargetPlatform.g:2046:1: ( 'Kind' )
            {
            // InternalTargetPlatform.g:2046:1: ( 'Kind' )
            // InternalTargetPlatform.g:2047:2: 'Kind'
            {
             before(grammarAccess.getCPUAccess().getKindKeyword_3_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getCPUAccess().getKindKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group_3_0__0__Impl"


    // $ANTLR start "rule__CPU__Group_3_0__1"
    // InternalTargetPlatform.g:2056:1: rule__CPU__Group_3_0__1 : rule__CPU__Group_3_0__1__Impl ;
    public final void rule__CPU__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2060:1: ( rule__CPU__Group_3_0__1__Impl )
            // InternalTargetPlatform.g:2061:2: rule__CPU__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CPU__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group_3_0__1"


    // $ANTLR start "rule__CPU__Group_3_0__1__Impl"
    // InternalTargetPlatform.g:2067:1: rule__CPU__Group_3_0__1__Impl : ( ( rule__CPU__KindAssignment_3_0_1 ) ) ;
    public final void rule__CPU__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2071:1: ( ( ( rule__CPU__KindAssignment_3_0_1 ) ) )
            // InternalTargetPlatform.g:2072:1: ( ( rule__CPU__KindAssignment_3_0_1 ) )
            {
            // InternalTargetPlatform.g:2072:1: ( ( rule__CPU__KindAssignment_3_0_1 ) )
            // InternalTargetPlatform.g:2073:2: ( rule__CPU__KindAssignment_3_0_1 )
            {
             before(grammarAccess.getCPUAccess().getKindAssignment_3_0_1()); 
            // InternalTargetPlatform.g:2074:2: ( rule__CPU__KindAssignment_3_0_1 )
            // InternalTargetPlatform.g:2074:3: rule__CPU__KindAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__CPU__KindAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getCPUAccess().getKindAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group_3_0__1__Impl"


    // $ANTLR start "rule__CPU__Group_3_1__0"
    // InternalTargetPlatform.g:2083:1: rule__CPU__Group_3_1__0 : rule__CPU__Group_3_1__0__Impl rule__CPU__Group_3_1__1 ;
    public final void rule__CPU__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2087:1: ( rule__CPU__Group_3_1__0__Impl rule__CPU__Group_3_1__1 )
            // InternalTargetPlatform.g:2088:2: rule__CPU__Group_3_1__0__Impl rule__CPU__Group_3_1__1
            {
            pushFollow(FOLLOW_19);
            rule__CPU__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CPU__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group_3_1__0"


    // $ANTLR start "rule__CPU__Group_3_1__0__Impl"
    // InternalTargetPlatform.g:2095:1: rule__CPU__Group_3_1__0__Impl : ( 'CoresTally' ) ;
    public final void rule__CPU__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2099:1: ( ( 'CoresTally' ) )
            // InternalTargetPlatform.g:2100:1: ( 'CoresTally' )
            {
            // InternalTargetPlatform.g:2100:1: ( 'CoresTally' )
            // InternalTargetPlatform.g:2101:2: 'CoresTally'
            {
             before(grammarAccess.getCPUAccess().getCoresTallyKeyword_3_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getCPUAccess().getCoresTallyKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group_3_1__0__Impl"


    // $ANTLR start "rule__CPU__Group_3_1__1"
    // InternalTargetPlatform.g:2110:1: rule__CPU__Group_3_1__1 : rule__CPU__Group_3_1__1__Impl ;
    public final void rule__CPU__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2114:1: ( rule__CPU__Group_3_1__1__Impl )
            // InternalTargetPlatform.g:2115:2: rule__CPU__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CPU__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group_3_1__1"


    // $ANTLR start "rule__CPU__Group_3_1__1__Impl"
    // InternalTargetPlatform.g:2121:1: rule__CPU__Group_3_1__1__Impl : ( ( rule__CPU__CoresTallyAssignment_3_1_1 ) ) ;
    public final void rule__CPU__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2125:1: ( ( ( rule__CPU__CoresTallyAssignment_3_1_1 ) ) )
            // InternalTargetPlatform.g:2126:1: ( ( rule__CPU__CoresTallyAssignment_3_1_1 ) )
            {
            // InternalTargetPlatform.g:2126:1: ( ( rule__CPU__CoresTallyAssignment_3_1_1 ) )
            // InternalTargetPlatform.g:2127:2: ( rule__CPU__CoresTallyAssignment_3_1_1 )
            {
             before(grammarAccess.getCPUAccess().getCoresTallyAssignment_3_1_1()); 
            // InternalTargetPlatform.g:2128:2: ( rule__CPU__CoresTallyAssignment_3_1_1 )
            // InternalTargetPlatform.g:2128:3: rule__CPU__CoresTallyAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__CPU__CoresTallyAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getCPUAccess().getCoresTallyAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__Group_3_1__1__Impl"


    // $ANTLR start "rule__LoginAccount__Group__0"
    // InternalTargetPlatform.g:2137:1: rule__LoginAccount__Group__0 : rule__LoginAccount__Group__0__Impl rule__LoginAccount__Group__1 ;
    public final void rule__LoginAccount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2141:1: ( rule__LoginAccount__Group__0__Impl rule__LoginAccount__Group__1 )
            // InternalTargetPlatform.g:2142:2: rule__LoginAccount__Group__0__Impl rule__LoginAccount__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LoginAccount__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoginAccount__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group__0"


    // $ANTLR start "rule__LoginAccount__Group__0__Impl"
    // InternalTargetPlatform.g:2149:1: rule__LoginAccount__Group__0__Impl : ( 'LoginAccount' ) ;
    public final void rule__LoginAccount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2153:1: ( ( 'LoginAccount' ) )
            // InternalTargetPlatform.g:2154:1: ( 'LoginAccount' )
            {
            // InternalTargetPlatform.g:2154:1: ( 'LoginAccount' )
            // InternalTargetPlatform.g:2155:2: 'LoginAccount'
            {
             before(grammarAccess.getLoginAccountAccess().getLoginAccountKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLoginAccountAccess().getLoginAccountKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group__0__Impl"


    // $ANTLR start "rule__LoginAccount__Group__1"
    // InternalTargetPlatform.g:2164:1: rule__LoginAccount__Group__1 : rule__LoginAccount__Group__1__Impl rule__LoginAccount__Group__2 ;
    public final void rule__LoginAccount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2168:1: ( rule__LoginAccount__Group__1__Impl rule__LoginAccount__Group__2 )
            // InternalTargetPlatform.g:2169:2: rule__LoginAccount__Group__1__Impl rule__LoginAccount__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__LoginAccount__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoginAccount__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group__1"


    // $ANTLR start "rule__LoginAccount__Group__1__Impl"
    // InternalTargetPlatform.g:2176:1: rule__LoginAccount__Group__1__Impl : ( ( rule__LoginAccount__NameAssignment_1 ) ) ;
    public final void rule__LoginAccount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2180:1: ( ( ( rule__LoginAccount__NameAssignment_1 ) ) )
            // InternalTargetPlatform.g:2181:1: ( ( rule__LoginAccount__NameAssignment_1 ) )
            {
            // InternalTargetPlatform.g:2181:1: ( ( rule__LoginAccount__NameAssignment_1 ) )
            // InternalTargetPlatform.g:2182:2: ( rule__LoginAccount__NameAssignment_1 )
            {
             before(grammarAccess.getLoginAccountAccess().getNameAssignment_1()); 
            // InternalTargetPlatform.g:2183:2: ( rule__LoginAccount__NameAssignment_1 )
            // InternalTargetPlatform.g:2183:3: rule__LoginAccount__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LoginAccount__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccountAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group__1__Impl"


    // $ANTLR start "rule__LoginAccount__Group__2"
    // InternalTargetPlatform.g:2191:1: rule__LoginAccount__Group__2 : rule__LoginAccount__Group__2__Impl rule__LoginAccount__Group__3 ;
    public final void rule__LoginAccount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2195:1: ( rule__LoginAccount__Group__2__Impl rule__LoginAccount__Group__3 )
            // InternalTargetPlatform.g:2196:2: rule__LoginAccount__Group__2__Impl rule__LoginAccount__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__LoginAccount__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoginAccount__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group__2"


    // $ANTLR start "rule__LoginAccount__Group__2__Impl"
    // InternalTargetPlatform.g:2203:1: rule__LoginAccount__Group__2__Impl : ( '{' ) ;
    public final void rule__LoginAccount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2207:1: ( ( '{' ) )
            // InternalTargetPlatform.g:2208:1: ( '{' )
            {
            // InternalTargetPlatform.g:2208:1: ( '{' )
            // InternalTargetPlatform.g:2209:2: '{'
            {
             before(grammarAccess.getLoginAccountAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLoginAccountAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group__2__Impl"


    // $ANTLR start "rule__LoginAccount__Group__3"
    // InternalTargetPlatform.g:2218:1: rule__LoginAccount__Group__3 : rule__LoginAccount__Group__3__Impl rule__LoginAccount__Group__4 ;
    public final void rule__LoginAccount__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2222:1: ( rule__LoginAccount__Group__3__Impl rule__LoginAccount__Group__4 )
            // InternalTargetPlatform.g:2223:2: rule__LoginAccount__Group__3__Impl rule__LoginAccount__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__LoginAccount__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoginAccount__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group__3"


    // $ANTLR start "rule__LoginAccount__Group__3__Impl"
    // InternalTargetPlatform.g:2230:1: rule__LoginAccount__Group__3__Impl : ( ( rule__LoginAccount__UnorderedGroup_3 ) ) ;
    public final void rule__LoginAccount__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2234:1: ( ( ( rule__LoginAccount__UnorderedGroup_3 ) ) )
            // InternalTargetPlatform.g:2235:1: ( ( rule__LoginAccount__UnorderedGroup_3 ) )
            {
            // InternalTargetPlatform.g:2235:1: ( ( rule__LoginAccount__UnorderedGroup_3 ) )
            // InternalTargetPlatform.g:2236:2: ( rule__LoginAccount__UnorderedGroup_3 )
            {
             before(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3()); 
            // InternalTargetPlatform.g:2237:2: ( rule__LoginAccount__UnorderedGroup_3 )
            // InternalTargetPlatform.g:2237:3: rule__LoginAccount__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__LoginAccount__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group__3__Impl"


    // $ANTLR start "rule__LoginAccount__Group__4"
    // InternalTargetPlatform.g:2245:1: rule__LoginAccount__Group__4 : rule__LoginAccount__Group__4__Impl ;
    public final void rule__LoginAccount__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2249:1: ( rule__LoginAccount__Group__4__Impl )
            // InternalTargetPlatform.g:2250:2: rule__LoginAccount__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoginAccount__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group__4"


    // $ANTLR start "rule__LoginAccount__Group__4__Impl"
    // InternalTargetPlatform.g:2256:1: rule__LoginAccount__Group__4__Impl : ( '}' ) ;
    public final void rule__LoginAccount__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2260:1: ( ( '}' ) )
            // InternalTargetPlatform.g:2261:1: ( '}' )
            {
            // InternalTargetPlatform.g:2261:1: ( '}' )
            // InternalTargetPlatform.g:2262:2: '}'
            {
             before(grammarAccess.getLoginAccountAccess().getRightCurlyBracketKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLoginAccountAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group__4__Impl"


    // $ANTLR start "rule__LoginAccount__Group_3_0__0"
    // InternalTargetPlatform.g:2272:1: rule__LoginAccount__Group_3_0__0 : rule__LoginAccount__Group_3_0__0__Impl rule__LoginAccount__Group_3_0__1 ;
    public final void rule__LoginAccount__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2276:1: ( rule__LoginAccount__Group_3_0__0__Impl rule__LoginAccount__Group_3_0__1 )
            // InternalTargetPlatform.g:2277:2: rule__LoginAccount__Group_3_0__0__Impl rule__LoginAccount__Group_3_0__1
            {
            pushFollow(FOLLOW_9);
            rule__LoginAccount__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoginAccount__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group_3_0__0"


    // $ANTLR start "rule__LoginAccount__Group_3_0__0__Impl"
    // InternalTargetPlatform.g:2284:1: rule__LoginAccount__Group_3_0__0__Impl : ( 'FullName' ) ;
    public final void rule__LoginAccount__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2288:1: ( ( 'FullName' ) )
            // InternalTargetPlatform.g:2289:1: ( 'FullName' )
            {
            // InternalTargetPlatform.g:2289:1: ( 'FullName' )
            // InternalTargetPlatform.g:2290:2: 'FullName'
            {
             before(grammarAccess.getLoginAccountAccess().getFullNameKeyword_3_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLoginAccountAccess().getFullNameKeyword_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group_3_0__0__Impl"


    // $ANTLR start "rule__LoginAccount__Group_3_0__1"
    // InternalTargetPlatform.g:2299:1: rule__LoginAccount__Group_3_0__1 : rule__LoginAccount__Group_3_0__1__Impl ;
    public final void rule__LoginAccount__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2303:1: ( rule__LoginAccount__Group_3_0__1__Impl )
            // InternalTargetPlatform.g:2304:2: rule__LoginAccount__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoginAccount__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group_3_0__1"


    // $ANTLR start "rule__LoginAccount__Group_3_0__1__Impl"
    // InternalTargetPlatform.g:2310:1: rule__LoginAccount__Group_3_0__1__Impl : ( ( rule__LoginAccount__FullnameAssignment_3_0_1 ) ) ;
    public final void rule__LoginAccount__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2314:1: ( ( ( rule__LoginAccount__FullnameAssignment_3_0_1 ) ) )
            // InternalTargetPlatform.g:2315:1: ( ( rule__LoginAccount__FullnameAssignment_3_0_1 ) )
            {
            // InternalTargetPlatform.g:2315:1: ( ( rule__LoginAccount__FullnameAssignment_3_0_1 ) )
            // InternalTargetPlatform.g:2316:2: ( rule__LoginAccount__FullnameAssignment_3_0_1 )
            {
             before(grammarAccess.getLoginAccountAccess().getFullnameAssignment_3_0_1()); 
            // InternalTargetPlatform.g:2317:2: ( rule__LoginAccount__FullnameAssignment_3_0_1 )
            // InternalTargetPlatform.g:2317:3: rule__LoginAccount__FullnameAssignment_3_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LoginAccount__FullnameAssignment_3_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccountAccess().getFullnameAssignment_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group_3_0__1__Impl"


    // $ANTLR start "rule__LoginAccount__Group_3_1__0"
    // InternalTargetPlatform.g:2326:1: rule__LoginAccount__Group_3_1__0 : rule__LoginAccount__Group_3_1__0__Impl rule__LoginAccount__Group_3_1__1 ;
    public final void rule__LoginAccount__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2330:1: ( rule__LoginAccount__Group_3_1__0__Impl rule__LoginAccount__Group_3_1__1 )
            // InternalTargetPlatform.g:2331:2: rule__LoginAccount__Group_3_1__0__Impl rule__LoginAccount__Group_3_1__1
            {
            pushFollow(FOLLOW_9);
            rule__LoginAccount__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LoginAccount__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group_3_1__0"


    // $ANTLR start "rule__LoginAccount__Group_3_1__0__Impl"
    // InternalTargetPlatform.g:2338:1: rule__LoginAccount__Group_3_1__0__Impl : ( 'Email' ) ;
    public final void rule__LoginAccount__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2342:1: ( ( 'Email' ) )
            // InternalTargetPlatform.g:2343:1: ( 'Email' )
            {
            // InternalTargetPlatform.g:2343:1: ( 'Email' )
            // InternalTargetPlatform.g:2344:2: 'Email'
            {
             before(grammarAccess.getLoginAccountAccess().getEmailKeyword_3_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getLoginAccountAccess().getEmailKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group_3_1__0__Impl"


    // $ANTLR start "rule__LoginAccount__Group_3_1__1"
    // InternalTargetPlatform.g:2353:1: rule__LoginAccount__Group_3_1__1 : rule__LoginAccount__Group_3_1__1__Impl ;
    public final void rule__LoginAccount__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2357:1: ( rule__LoginAccount__Group_3_1__1__Impl )
            // InternalTargetPlatform.g:2358:2: rule__LoginAccount__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoginAccount__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group_3_1__1"


    // $ANTLR start "rule__LoginAccount__Group_3_1__1__Impl"
    // InternalTargetPlatform.g:2364:1: rule__LoginAccount__Group_3_1__1__Impl : ( ( rule__LoginAccount__EmailAssignment_3_1_1 ) ) ;
    public final void rule__LoginAccount__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2368:1: ( ( ( rule__LoginAccount__EmailAssignment_3_1_1 ) ) )
            // InternalTargetPlatform.g:2369:1: ( ( rule__LoginAccount__EmailAssignment_3_1_1 ) )
            {
            // InternalTargetPlatform.g:2369:1: ( ( rule__LoginAccount__EmailAssignment_3_1_1 ) )
            // InternalTargetPlatform.g:2370:2: ( rule__LoginAccount__EmailAssignment_3_1_1 )
            {
             before(grammarAccess.getLoginAccountAccess().getEmailAssignment_3_1_1()); 
            // InternalTargetPlatform.g:2371:2: ( rule__LoginAccount__EmailAssignment_3_1_1 )
            // InternalTargetPlatform.g:2371:3: rule__LoginAccount__EmailAssignment_3_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LoginAccount__EmailAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLoginAccountAccess().getEmailAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__Group_3_1__1__Impl"


    // $ANTLR start "rule__TargetMiddleware__Group__0"
    // InternalTargetPlatform.g:2380:1: rule__TargetMiddleware__Group__0 : rule__TargetMiddleware__Group__0__Impl rule__TargetMiddleware__Group__1 ;
    public final void rule__TargetMiddleware__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2384:1: ( rule__TargetMiddleware__Group__0__Impl rule__TargetMiddleware__Group__1 )
            // InternalTargetPlatform.g:2385:2: rule__TargetMiddleware__Group__0__Impl rule__TargetMiddleware__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__TargetMiddleware__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetMiddleware__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMiddleware__Group__0"


    // $ANTLR start "rule__TargetMiddleware__Group__0__Impl"
    // InternalTargetPlatform.g:2392:1: rule__TargetMiddleware__Group__0__Impl : ( 'TargetMiddleware' ) ;
    public final void rule__TargetMiddleware__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2396:1: ( ( 'TargetMiddleware' ) )
            // InternalTargetPlatform.g:2397:1: ( 'TargetMiddleware' )
            {
            // InternalTargetPlatform.g:2397:1: ( 'TargetMiddleware' )
            // InternalTargetPlatform.g:2398:2: 'TargetMiddleware'
            {
             before(grammarAccess.getTargetMiddlewareAccess().getTargetMiddlewareKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getTargetMiddlewareAccess().getTargetMiddlewareKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMiddleware__Group__0__Impl"


    // $ANTLR start "rule__TargetMiddleware__Group__1"
    // InternalTargetPlatform.g:2407:1: rule__TargetMiddleware__Group__1 : rule__TargetMiddleware__Group__1__Impl rule__TargetMiddleware__Group__2 ;
    public final void rule__TargetMiddleware__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2411:1: ( rule__TargetMiddleware__Group__1__Impl rule__TargetMiddleware__Group__2 )
            // InternalTargetPlatform.g:2412:2: rule__TargetMiddleware__Group__1__Impl rule__TargetMiddleware__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__TargetMiddleware__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TargetMiddleware__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMiddleware__Group__1"


    // $ANTLR start "rule__TargetMiddleware__Group__1__Impl"
    // InternalTargetPlatform.g:2419:1: rule__TargetMiddleware__Group__1__Impl : ( ( rule__TargetMiddleware__MiddlewareAssignment_1 ) ) ;
    public final void rule__TargetMiddleware__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2423:1: ( ( ( rule__TargetMiddleware__MiddlewareAssignment_1 ) ) )
            // InternalTargetPlatform.g:2424:1: ( ( rule__TargetMiddleware__MiddlewareAssignment_1 ) )
            {
            // InternalTargetPlatform.g:2424:1: ( ( rule__TargetMiddleware__MiddlewareAssignment_1 ) )
            // InternalTargetPlatform.g:2425:2: ( rule__TargetMiddleware__MiddlewareAssignment_1 )
            {
             before(grammarAccess.getTargetMiddlewareAccess().getMiddlewareAssignment_1()); 
            // InternalTargetPlatform.g:2426:2: ( rule__TargetMiddleware__MiddlewareAssignment_1 )
            // InternalTargetPlatform.g:2426:3: rule__TargetMiddleware__MiddlewareAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TargetMiddleware__MiddlewareAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTargetMiddlewareAccess().getMiddlewareAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMiddleware__Group__1__Impl"


    // $ANTLR start "rule__TargetMiddleware__Group__2"
    // InternalTargetPlatform.g:2434:1: rule__TargetMiddleware__Group__2 : rule__TargetMiddleware__Group__2__Impl ;
    public final void rule__TargetMiddleware__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2438:1: ( rule__TargetMiddleware__Group__2__Impl )
            // InternalTargetPlatform.g:2439:2: rule__TargetMiddleware__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TargetMiddleware__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMiddleware__Group__2"


    // $ANTLR start "rule__TargetMiddleware__Group__2__Impl"
    // InternalTargetPlatform.g:2445:1: rule__TargetMiddleware__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__TargetMiddleware__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2449:1: ( ( ( ';' )? ) )
            // InternalTargetPlatform.g:2450:1: ( ( ';' )? )
            {
            // InternalTargetPlatform.g:2450:1: ( ( ';' )? )
            // InternalTargetPlatform.g:2451:2: ( ';' )?
            {
             before(grammarAccess.getTargetMiddlewareAccess().getSemicolonKeyword_2()); 
            // InternalTargetPlatform.g:2452:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTargetPlatform.g:2452:3: ';'
                    {
                    match(input,22,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getTargetMiddlewareAccess().getSemicolonKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMiddleware__Group__2__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalTargetPlatform.g:2461:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2465:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalTargetPlatform.g:2466:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalTargetPlatform.g:2473:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2477:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:2478:1: ( RULE_ID )
            {
            // InternalTargetPlatform.g:2478:1: ( RULE_ID )
            // InternalTargetPlatform.g:2479:2: RULE_ID
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
    // InternalTargetPlatform.g:2488:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2492:1: ( rule__FQN__Group__1__Impl )
            // InternalTargetPlatform.g:2493:2: rule__FQN__Group__1__Impl
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
    // InternalTargetPlatform.g:2499:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2503:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalTargetPlatform.g:2504:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalTargetPlatform.g:2504:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalTargetPlatform.g:2505:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalTargetPlatform.g:2506:2: ( rule__FQN__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==35) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTargetPlatform.g:2506:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_25);
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
    // InternalTargetPlatform.g:2515:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2519:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalTargetPlatform.g:2520:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalTargetPlatform.g:2527:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2531:1: ( ( '.' ) )
            // InternalTargetPlatform.g:2532:1: ( '.' )
            {
            // InternalTargetPlatform.g:2532:1: ( '.' )
            // InternalTargetPlatform.g:2533:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2542:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2546:1: ( rule__FQN__Group_1__1__Impl )
            // InternalTargetPlatform.g:2547:2: rule__FQN__Group_1__1__Impl
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
    // InternalTargetPlatform.g:2553:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2557:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:2558:1: ( RULE_ID )
            {
            // InternalTargetPlatform.g:2558:1: ( RULE_ID )
            // InternalTargetPlatform.g:2559:2: RULE_ID
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
    // InternalTargetPlatform.g:2569:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2573:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTargetPlatform.g:2574:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalTargetPlatform.g:2581:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2585:1: ( ( ( '-' )? ) )
            // InternalTargetPlatform.g:2586:1: ( ( '-' )? )
            {
            // InternalTargetPlatform.g:2586:1: ( ( '-' )? )
            // InternalTargetPlatform.g:2587:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTargetPlatform.g:2588:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTargetPlatform.g:2588:3: '-'
                    {
                    match(input,36,FOLLOW_2); 

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
    // InternalTargetPlatform.g:2596:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2600:1: ( rule__EInt__Group__1__Impl )
            // InternalTargetPlatform.g:2601:2: rule__EInt__Group__1__Impl
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
    // InternalTargetPlatform.g:2607:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2611:1: ( ( RULE_INT ) )
            // InternalTargetPlatform.g:2612:1: ( RULE_INT )
            {
            // InternalTargetPlatform.g:2612:1: ( RULE_INT )
            // InternalTargetPlatform.g:2613:2: RULE_INT
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
    // InternalTargetPlatform.g:2623:1: rule__ACE_SmartSoft__Group__0 : rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 ;
    public final void rule__ACE_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2627:1: ( rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 )
            // InternalTargetPlatform.g:2628:2: rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalTargetPlatform.g:2635:1: rule__ACE_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__ACE_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2639:1: ( ( () ) )
            // InternalTargetPlatform.g:2640:1: ( () )
            {
            // InternalTargetPlatform.g:2640:1: ( () )
            // InternalTargetPlatform.g:2641:2: ()
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); 
            // InternalTargetPlatform.g:2642:2: ()
            // InternalTargetPlatform.g:2642:3: 
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
    // InternalTargetPlatform.g:2650:1: rule__ACE_SmartSoft__Group__1 : rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 ;
    public final void rule__ACE_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2654:1: ( rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 )
            // InternalTargetPlatform.g:2655:2: rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTargetPlatform.g:2662:1: rule__ACE_SmartSoft__Group__1__Impl : ( 'ACE_SmartSoft' ) ;
    public final void rule__ACE_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2666:1: ( ( 'ACE_SmartSoft' ) )
            // InternalTargetPlatform.g:2667:1: ( 'ACE_SmartSoft' )
            {
            // InternalTargetPlatform.g:2667:1: ( 'ACE_SmartSoft' )
            // InternalTargetPlatform.g:2668:2: 'ACE_SmartSoft'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2677:1: rule__ACE_SmartSoft__Group__2 : rule__ACE_SmartSoft__Group__2__Impl ;
    public final void rule__ACE_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2681:1: ( rule__ACE_SmartSoft__Group__2__Impl )
            // InternalTargetPlatform.g:2682:2: rule__ACE_SmartSoft__Group__2__Impl
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
    // InternalTargetPlatform.g:2688:1: rule__ACE_SmartSoft__Group__2__Impl : ( ( rule__ACE_SmartSoft__Group_2__0 )? ) ;
    public final void rule__ACE_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2692:1: ( ( ( rule__ACE_SmartSoft__Group_2__0 )? ) )
            // InternalTargetPlatform.g:2693:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            {
            // InternalTargetPlatform.g:2693:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            // InternalTargetPlatform.g:2694:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); 
            // InternalTargetPlatform.g:2695:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTargetPlatform.g:2695:3: rule__ACE_SmartSoft__Group_2__0
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
    // InternalTargetPlatform.g:2704:1: rule__ACE_SmartSoft__Group_2__0 : rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 ;
    public final void rule__ACE_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2708:1: ( rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 )
            // InternalTargetPlatform.g:2709:2: rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetPlatform.g:2716:1: rule__ACE_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__ACE_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2720:1: ( ( 'description' ) )
            // InternalTargetPlatform.g:2721:1: ( 'description' )
            {
            // InternalTargetPlatform.g:2721:1: ( 'description' )
            // InternalTargetPlatform.g:2722:2: 'description'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2731:1: rule__ACE_SmartSoft__Group_2__1 : rule__ACE_SmartSoft__Group_2__1__Impl ;
    public final void rule__ACE_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2735:1: ( rule__ACE_SmartSoft__Group_2__1__Impl )
            // InternalTargetPlatform.g:2736:2: rule__ACE_SmartSoft__Group_2__1__Impl
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
    // InternalTargetPlatform.g:2742:1: rule__ACE_SmartSoft__Group_2__1__Impl : ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__ACE_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2746:1: ( ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalTargetPlatform.g:2747:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalTargetPlatform.g:2747:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalTargetPlatform.g:2748:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalTargetPlatform.g:2749:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            // InternalTargetPlatform.g:2749:3: rule__ACE_SmartSoft__DescriptionAssignment_2_1
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
    // InternalTargetPlatform.g:2758:1: rule__OpcUa_SeRoNet__Group__0 : rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 ;
    public final void rule__OpcUa_SeRoNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2762:1: ( rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 )
            // InternalTargetPlatform.g:2763:2: rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalTargetPlatform.g:2770:1: rule__OpcUa_SeRoNet__Group__0__Impl : ( () ) ;
    public final void rule__OpcUa_SeRoNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2774:1: ( ( () ) )
            // InternalTargetPlatform.g:2775:1: ( () )
            {
            // InternalTargetPlatform.g:2775:1: ( () )
            // InternalTargetPlatform.g:2776:2: ()
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); 
            // InternalTargetPlatform.g:2777:2: ()
            // InternalTargetPlatform.g:2777:3: 
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
    // InternalTargetPlatform.g:2785:1: rule__OpcUa_SeRoNet__Group__1 : rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 ;
    public final void rule__OpcUa_SeRoNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2789:1: ( rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 )
            // InternalTargetPlatform.g:2790:2: rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTargetPlatform.g:2797:1: rule__OpcUa_SeRoNet__Group__1__Impl : ( 'OpcUa_SeRoNet' ) ;
    public final void rule__OpcUa_SeRoNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2801:1: ( ( 'OpcUa_SeRoNet' ) )
            // InternalTargetPlatform.g:2802:1: ( 'OpcUa_SeRoNet' )
            {
            // InternalTargetPlatform.g:2802:1: ( 'OpcUa_SeRoNet' )
            // InternalTargetPlatform.g:2803:2: 'OpcUa_SeRoNet'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); 
            match(input,39,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2812:1: rule__OpcUa_SeRoNet__Group__2 : rule__OpcUa_SeRoNet__Group__2__Impl ;
    public final void rule__OpcUa_SeRoNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2816:1: ( rule__OpcUa_SeRoNet__Group__2__Impl )
            // InternalTargetPlatform.g:2817:2: rule__OpcUa_SeRoNet__Group__2__Impl
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
    // InternalTargetPlatform.g:2823:1: rule__OpcUa_SeRoNet__Group__2__Impl : ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) ;
    public final void rule__OpcUa_SeRoNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2827:1: ( ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) )
            // InternalTargetPlatform.g:2828:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            {
            // InternalTargetPlatform.g:2828:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            // InternalTargetPlatform.g:2829:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); 
            // InternalTargetPlatform.g:2830:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==38) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTargetPlatform.g:2830:3: rule__OpcUa_SeRoNet__Group_2__0
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
    // InternalTargetPlatform.g:2839:1: rule__OpcUa_SeRoNet__Group_2__0 : rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 ;
    public final void rule__OpcUa_SeRoNet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2843:1: ( rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 )
            // InternalTargetPlatform.g:2844:2: rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetPlatform.g:2851:1: rule__OpcUa_SeRoNet__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2855:1: ( ( 'description' ) )
            // InternalTargetPlatform.g:2856:1: ( 'description' )
            {
            // InternalTargetPlatform.g:2856:1: ( 'description' )
            // InternalTargetPlatform.g:2857:2: 'description'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2866:1: rule__OpcUa_SeRoNet__Group_2__1 : rule__OpcUa_SeRoNet__Group_2__1__Impl ;
    public final void rule__OpcUa_SeRoNet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2870:1: ( rule__OpcUa_SeRoNet__Group_2__1__Impl )
            // InternalTargetPlatform.g:2871:2: rule__OpcUa_SeRoNet__Group_2__1__Impl
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
    // InternalTargetPlatform.g:2877:1: rule__OpcUa_SeRoNet__Group_2__1__Impl : ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2881:1: ( ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) )
            // InternalTargetPlatform.g:2882:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            {
            // InternalTargetPlatform.g:2882:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            // InternalTargetPlatform.g:2883:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); 
            // InternalTargetPlatform.g:2884:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            // InternalTargetPlatform.g:2884:3: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1
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
    // InternalTargetPlatform.g:2893:1: rule__CORBA_SmartSoft__Group__0 : rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 ;
    public final void rule__CORBA_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2897:1: ( rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 )
            // InternalTargetPlatform.g:2898:2: rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalTargetPlatform.g:2905:1: rule__CORBA_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__CORBA_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2909:1: ( ( () ) )
            // InternalTargetPlatform.g:2910:1: ( () )
            {
            // InternalTargetPlatform.g:2910:1: ( () )
            // InternalTargetPlatform.g:2911:2: ()
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); 
            // InternalTargetPlatform.g:2912:2: ()
            // InternalTargetPlatform.g:2912:3: 
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
    // InternalTargetPlatform.g:2920:1: rule__CORBA_SmartSoft__Group__1 : rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 ;
    public final void rule__CORBA_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2924:1: ( rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 )
            // InternalTargetPlatform.g:2925:2: rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTargetPlatform.g:2932:1: rule__CORBA_SmartSoft__Group__1__Impl : ( 'CORBA_SmartSoft' ) ;
    public final void rule__CORBA_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2936:1: ( ( 'CORBA_SmartSoft' ) )
            // InternalTargetPlatform.g:2937:1: ( 'CORBA_SmartSoft' )
            {
            // InternalTargetPlatform.g:2937:1: ( 'CORBA_SmartSoft' )
            // InternalTargetPlatform.g:2938:2: 'CORBA_SmartSoft'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2947:1: rule__CORBA_SmartSoft__Group__2 : rule__CORBA_SmartSoft__Group__2__Impl ;
    public final void rule__CORBA_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2951:1: ( rule__CORBA_SmartSoft__Group__2__Impl )
            // InternalTargetPlatform.g:2952:2: rule__CORBA_SmartSoft__Group__2__Impl
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
    // InternalTargetPlatform.g:2958:1: rule__CORBA_SmartSoft__Group__2__Impl : ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) ;
    public final void rule__CORBA_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2962:1: ( ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) )
            // InternalTargetPlatform.g:2963:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            {
            // InternalTargetPlatform.g:2963:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            // InternalTargetPlatform.g:2964:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); 
            // InternalTargetPlatform.g:2965:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==38) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTargetPlatform.g:2965:3: rule__CORBA_SmartSoft__Group_2__0
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
    // InternalTargetPlatform.g:2974:1: rule__CORBA_SmartSoft__Group_2__0 : rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 ;
    public final void rule__CORBA_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2978:1: ( rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 )
            // InternalTargetPlatform.g:2979:2: rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetPlatform.g:2986:1: rule__CORBA_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__CORBA_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2990:1: ( ( 'description' ) )
            // InternalTargetPlatform.g:2991:1: ( 'description' )
            {
            // InternalTargetPlatform.g:2991:1: ( 'description' )
            // InternalTargetPlatform.g:2992:2: 'description'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTargetPlatform.g:3001:1: rule__CORBA_SmartSoft__Group_2__1 : rule__CORBA_SmartSoft__Group_2__1__Impl ;
    public final void rule__CORBA_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3005:1: ( rule__CORBA_SmartSoft__Group_2__1__Impl )
            // InternalTargetPlatform.g:3006:2: rule__CORBA_SmartSoft__Group_2__1__Impl
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
    // InternalTargetPlatform.g:3012:1: rule__CORBA_SmartSoft__Group_2__1__Impl : ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__CORBA_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3016:1: ( ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalTargetPlatform.g:3017:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalTargetPlatform.g:3017:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalTargetPlatform.g:3018:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalTargetPlatform.g:3019:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            // InternalTargetPlatform.g:3019:3: rule__CORBA_SmartSoft__DescriptionAssignment_2_1
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
    // InternalTargetPlatform.g:3028:1: rule__DDS_SmartSoft__Group__0 : rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 ;
    public final void rule__DDS_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3032:1: ( rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 )
            // InternalTargetPlatform.g:3033:2: rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalTargetPlatform.g:3040:1: rule__DDS_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__DDS_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3044:1: ( ( () ) )
            // InternalTargetPlatform.g:3045:1: ( () )
            {
            // InternalTargetPlatform.g:3045:1: ( () )
            // InternalTargetPlatform.g:3046:2: ()
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); 
            // InternalTargetPlatform.g:3047:2: ()
            // InternalTargetPlatform.g:3047:3: 
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
    // InternalTargetPlatform.g:3055:1: rule__DDS_SmartSoft__Group__1 : rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 ;
    public final void rule__DDS_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3059:1: ( rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 )
            // InternalTargetPlatform.g:3060:2: rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalTargetPlatform.g:3067:1: rule__DDS_SmartSoft__Group__1__Impl : ( 'DDS_SmartSoft' ) ;
    public final void rule__DDS_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3071:1: ( ( 'DDS_SmartSoft' ) )
            // InternalTargetPlatform.g:3072:1: ( 'DDS_SmartSoft' )
            {
            // InternalTargetPlatform.g:3072:1: ( 'DDS_SmartSoft' )
            // InternalTargetPlatform.g:3073:2: 'DDS_SmartSoft'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalTargetPlatform.g:3082:1: rule__DDS_SmartSoft__Group__2 : rule__DDS_SmartSoft__Group__2__Impl ;
    public final void rule__DDS_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3086:1: ( rule__DDS_SmartSoft__Group__2__Impl )
            // InternalTargetPlatform.g:3087:2: rule__DDS_SmartSoft__Group__2__Impl
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
    // InternalTargetPlatform.g:3093:1: rule__DDS_SmartSoft__Group__2__Impl : ( ( rule__DDS_SmartSoft__Group_2__0 )? ) ;
    public final void rule__DDS_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3097:1: ( ( ( rule__DDS_SmartSoft__Group_2__0 )? ) )
            // InternalTargetPlatform.g:3098:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            {
            // InternalTargetPlatform.g:3098:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            // InternalTargetPlatform.g:3099:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); 
            // InternalTargetPlatform.g:3100:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==38) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTargetPlatform.g:3100:3: rule__DDS_SmartSoft__Group_2__0
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
    // InternalTargetPlatform.g:3109:1: rule__DDS_SmartSoft__Group_2__0 : rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 ;
    public final void rule__DDS_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3113:1: ( rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 )
            // InternalTargetPlatform.g:3114:2: rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1
            {
            pushFollow(FOLLOW_9);
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
    // InternalTargetPlatform.g:3121:1: rule__DDS_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__DDS_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3125:1: ( ( 'description' ) )
            // InternalTargetPlatform.g:3126:1: ( 'description' )
            {
            // InternalTargetPlatform.g:3126:1: ( 'description' )
            // InternalTargetPlatform.g:3127:2: 'description'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTargetPlatform.g:3136:1: rule__DDS_SmartSoft__Group_2__1 : rule__DDS_SmartSoft__Group_2__1__Impl ;
    public final void rule__DDS_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3140:1: ( rule__DDS_SmartSoft__Group_2__1__Impl )
            // InternalTargetPlatform.g:3141:2: rule__DDS_SmartSoft__Group_2__1__Impl
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
    // InternalTargetPlatform.g:3147:1: rule__DDS_SmartSoft__Group_2__1__Impl : ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__DDS_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3151:1: ( ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalTargetPlatform.g:3152:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalTargetPlatform.g:3152:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalTargetPlatform.g:3153:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalTargetPlatform.g:3154:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            // InternalTargetPlatform.g:3154:3: rule__DDS_SmartSoft__DescriptionAssignment_2_1
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


    // $ANTLR start "rule__NetworkInterface__UnorderedGroup_3"
    // InternalTargetPlatform.g:3163:1: rule__NetworkInterface__UnorderedGroup_3 : rule__NetworkInterface__UnorderedGroup_3__0 {...}?;
    public final void rule__NetworkInterface__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
        	
        try {
            // InternalTargetPlatform.g:3168:1: ( rule__NetworkInterface__UnorderedGroup_3__0 {...}?)
            // InternalTargetPlatform.g:3169:2: rule__NetworkInterface__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__NetworkInterface__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__UnorderedGroup_3"


    // $ANTLR start "rule__NetworkInterface__UnorderedGroup_3__Impl"
    // InternalTargetPlatform.g:3177:1: rule__NetworkInterface__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__NetworkInterface__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTargetPlatform.g:3182:1: ( ( ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) ) ) )
            // InternalTargetPlatform.g:3183:3: ( ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) ) )
            {
            // InternalTargetPlatform.g:3183:3: ( ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalTargetPlatform.g:3184:3: ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3184:3: ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) )
                    // InternalTargetPlatform.g:3185:4: {...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__NetworkInterface__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalTargetPlatform.g:3185:112: ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) )
                    // InternalTargetPlatform.g:3186:5: ( ( rule__NetworkInterface__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3192:5: ( ( rule__NetworkInterface__Group_3_0__0 ) )
                    // InternalTargetPlatform.g:3193:6: ( rule__NetworkInterface__Group_3_0__0 )
                    {
                     before(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0()); 
                    // InternalTargetPlatform.g:3194:6: ( rule__NetworkInterface__Group_3_0__0 )
                    // InternalTargetPlatform.g:3194:7: rule__NetworkInterface__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkInterface__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetPlatform.g:3199:3: ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3199:3: ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) )
                    // InternalTargetPlatform.g:3200:4: {...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__NetworkInterface__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalTargetPlatform.g:3200:112: ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) )
                    // InternalTargetPlatform.g:3201:5: ( ( rule__NetworkInterface__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3207:5: ( ( rule__NetworkInterface__Group_3_1__0 ) )
                    // InternalTargetPlatform.g:3208:6: ( rule__NetworkInterface__Group_3_1__0 )
                    {
                     before(grammarAccess.getNetworkInterfaceAccess().getGroup_3_1()); 
                    // InternalTargetPlatform.g:3209:6: ( rule__NetworkInterface__Group_3_1__0 )
                    // InternalTargetPlatform.g:3209:7: rule__NetworkInterface__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkInterface__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getNetworkInterfaceAccess().getGroup_3_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__NetworkInterface__UnorderedGroup_3__0"
    // InternalTargetPlatform.g:3222:1: rule__NetworkInterface__UnorderedGroup_3__0 : rule__NetworkInterface__UnorderedGroup_3__Impl ( rule__NetworkInterface__UnorderedGroup_3__1 )? ;
    public final void rule__NetworkInterface__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3226:1: ( rule__NetworkInterface__UnorderedGroup_3__Impl ( rule__NetworkInterface__UnorderedGroup_3__1 )? )
            // InternalTargetPlatform.g:3227:2: rule__NetworkInterface__UnorderedGroup_3__Impl ( rule__NetworkInterface__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_30);
            rule__NetworkInterface__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTargetPlatform.g:3228:2: ( rule__NetworkInterface__UnorderedGroup_3__1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 26 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTargetPlatform.g:3228:2: rule__NetworkInterface__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__NetworkInterface__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__NetworkInterface__UnorderedGroup_3__0"


    // $ANTLR start "rule__NetworkInterface__UnorderedGroup_3__1"
    // InternalTargetPlatform.g:3234:1: rule__NetworkInterface__UnorderedGroup_3__1 : rule__NetworkInterface__UnorderedGroup_3__Impl ;
    public final void rule__NetworkInterface__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3238:1: ( rule__NetworkInterface__UnorderedGroup_3__Impl )
            // InternalTargetPlatform.g:3239:2: rule__NetworkInterface__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NetworkInterface__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__UnorderedGroup_3__1"


    // $ANTLR start "rule__CPU__UnorderedGroup_3"
    // InternalTargetPlatform.g:3246:1: rule__CPU__UnorderedGroup_3 : rule__CPU__UnorderedGroup_3__0 {...}?;
    public final void rule__CPU__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCPUAccess().getUnorderedGroup_3());
        	
        try {
            // InternalTargetPlatform.g:3251:1: ( rule__CPU__UnorderedGroup_3__0 {...}?)
            // InternalTargetPlatform.g:3252:2: rule__CPU__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_2);
            rule__CPU__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getCPUAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__CPU__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getCPUAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getCPUAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__UnorderedGroup_3"


    // $ANTLR start "rule__CPU__UnorderedGroup_3__Impl"
    // InternalTargetPlatform.g:3260:1: rule__CPU__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__CPU__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTargetPlatform.g:3265:1: ( ( ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) ) ) )
            // InternalTargetPlatform.g:3266:3: ( ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) ) )
            {
            // InternalTargetPlatform.g:3266:3: ( ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalTargetPlatform.g:3267:3: ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3267:3: ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) )
                    // InternalTargetPlatform.g:3268:4: {...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__CPU__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalTargetPlatform.g:3268:99: ( ( ( rule__CPU__Group_3_0__0 ) ) )
                    // InternalTargetPlatform.g:3269:5: ( ( rule__CPU__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3275:5: ( ( rule__CPU__Group_3_0__0 ) )
                    // InternalTargetPlatform.g:3276:6: ( rule__CPU__Group_3_0__0 )
                    {
                     before(grammarAccess.getCPUAccess().getGroup_3_0()); 
                    // InternalTargetPlatform.g:3277:6: ( rule__CPU__Group_3_0__0 )
                    // InternalTargetPlatform.g:3277:7: rule__CPU__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CPU__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCPUAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetPlatform.g:3282:3: ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3282:3: ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) )
                    // InternalTargetPlatform.g:3283:4: {...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__CPU__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalTargetPlatform.g:3283:99: ( ( ( rule__CPU__Group_3_1__0 ) ) )
                    // InternalTargetPlatform.g:3284:5: ( ( rule__CPU__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3290:5: ( ( rule__CPU__Group_3_1__0 ) )
                    // InternalTargetPlatform.g:3291:6: ( rule__CPU__Group_3_1__0 )
                    {
                     before(grammarAccess.getCPUAccess().getGroup_3_1()); 
                    // InternalTargetPlatform.g:3292:6: ( rule__CPU__Group_3_1__0 )
                    // InternalTargetPlatform.g:3292:7: rule__CPU__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__CPU__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getCPUAccess().getGroup_3_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getCPUAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__CPU__UnorderedGroup_3__0"
    // InternalTargetPlatform.g:3305:1: rule__CPU__UnorderedGroup_3__0 : rule__CPU__UnorderedGroup_3__Impl ( rule__CPU__UnorderedGroup_3__1 )? ;
    public final void rule__CPU__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3309:1: ( rule__CPU__UnorderedGroup_3__Impl ( rule__CPU__UnorderedGroup_3__1 )? )
            // InternalTargetPlatform.g:3310:2: rule__CPU__UnorderedGroup_3__Impl ( rule__CPU__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_31);
            rule__CPU__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTargetPlatform.g:3311:2: ( rule__CPU__UnorderedGroup_3__1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTargetPlatform.g:3311:2: rule__CPU__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__CPU__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__CPU__UnorderedGroup_3__0"


    // $ANTLR start "rule__CPU__UnorderedGroup_3__1"
    // InternalTargetPlatform.g:3317:1: rule__CPU__UnorderedGroup_3__1 : rule__CPU__UnorderedGroup_3__Impl ;
    public final void rule__CPU__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3321:1: ( rule__CPU__UnorderedGroup_3__Impl )
            // InternalTargetPlatform.g:3322:2: rule__CPU__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CPU__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__UnorderedGroup_3__1"


    // $ANTLR start "rule__LoginAccount__UnorderedGroup_3"
    // InternalTargetPlatform.g:3329:1: rule__LoginAccount__UnorderedGroup_3 : ( rule__LoginAccount__UnorderedGroup_3__0 )? ;
    public final void rule__LoginAccount__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
        	
        try {
            // InternalTargetPlatform.g:3334:1: ( ( rule__LoginAccount__UnorderedGroup_3__0 )? )
            // InternalTargetPlatform.g:3335:2: ( rule__LoginAccount__UnorderedGroup_3__0 )?
            {
            // InternalTargetPlatform.g:3335:2: ( rule__LoginAccount__UnorderedGroup_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTargetPlatform.g:3335:2: rule__LoginAccount__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoginAccount__UnorderedGroup_3__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__UnorderedGroup_3"


    // $ANTLR start "rule__LoginAccount__UnorderedGroup_3__Impl"
    // InternalTargetPlatform.g:3343:1: rule__LoginAccount__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__LoginAccount__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTargetPlatform.g:3348:1: ( ( ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) ) ) )
            // InternalTargetPlatform.g:3349:3: ( ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) ) )
            {
            // InternalTargetPlatform.g:3349:3: ( ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalTargetPlatform.g:3350:3: ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3350:3: ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) )
                    // InternalTargetPlatform.g:3351:4: {...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__LoginAccount__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalTargetPlatform.g:3351:108: ( ( ( rule__LoginAccount__Group_3_0__0 ) ) )
                    // InternalTargetPlatform.g:3352:5: ( ( rule__LoginAccount__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3358:5: ( ( rule__LoginAccount__Group_3_0__0 ) )
                    // InternalTargetPlatform.g:3359:6: ( rule__LoginAccount__Group_3_0__0 )
                    {
                     before(grammarAccess.getLoginAccountAccess().getGroup_3_0()); 
                    // InternalTargetPlatform.g:3360:6: ( rule__LoginAccount__Group_3_0__0 )
                    // InternalTargetPlatform.g:3360:7: rule__LoginAccount__Group_3_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoginAccount__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLoginAccountAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalTargetPlatform.g:3365:3: ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3365:3: ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) )
                    // InternalTargetPlatform.g:3366:4: {...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__LoginAccount__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalTargetPlatform.g:3366:108: ( ( ( rule__LoginAccount__Group_3_1__0 ) ) )
                    // InternalTargetPlatform.g:3367:5: ( ( rule__LoginAccount__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3373:5: ( ( rule__LoginAccount__Group_3_1__0 ) )
                    // InternalTargetPlatform.g:3374:6: ( rule__LoginAccount__Group_3_1__0 )
                    {
                     before(grammarAccess.getLoginAccountAccess().getGroup_3_1()); 
                    // InternalTargetPlatform.g:3375:6: ( rule__LoginAccount__Group_3_1__0 )
                    // InternalTargetPlatform.g:3375:7: rule__LoginAccount__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoginAccount__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLoginAccountAccess().getGroup_3_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__LoginAccount__UnorderedGroup_3__0"
    // InternalTargetPlatform.g:3388:1: rule__LoginAccount__UnorderedGroup_3__0 : rule__LoginAccount__UnorderedGroup_3__Impl ( rule__LoginAccount__UnorderedGroup_3__1 )? ;
    public final void rule__LoginAccount__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3392:1: ( rule__LoginAccount__UnorderedGroup_3__Impl ( rule__LoginAccount__UnorderedGroup_3__1 )? )
            // InternalTargetPlatform.g:3393:2: rule__LoginAccount__UnorderedGroup_3__Impl ( rule__LoginAccount__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_32);
            rule__LoginAccount__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTargetPlatform.g:3394:2: ( rule__LoginAccount__UnorderedGroup_3__1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTargetPlatform.g:3394:2: rule__LoginAccount__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LoginAccount__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__LoginAccount__UnorderedGroup_3__0"


    // $ANTLR start "rule__LoginAccount__UnorderedGroup_3__1"
    // InternalTargetPlatform.g:3400:1: rule__LoginAccount__UnorderedGroup_3__1 : rule__LoginAccount__UnorderedGroup_3__Impl ;
    public final void rule__LoginAccount__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3404:1: ( rule__LoginAccount__UnorderedGroup_3__Impl )
            // InternalTargetPlatform.g:3405:2: rule__LoginAccount__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LoginAccount__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__UnorderedGroup_3__1"


    // $ANTLR start "rule__TargetPlatformModel__NameAssignment_1"
    // InternalTargetPlatform.g:3412:1: rule__TargetPlatformModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TargetPlatformModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3416:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:3417:2: ( RULE_ID )
            {
            // InternalTargetPlatform.g:3417:2: ( RULE_ID )
            // InternalTargetPlatform.g:3418:3: RULE_ID
            {
             before(grammarAccess.getTargetPlatformModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetPlatformModelAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__NameAssignment_1"


    // $ANTLR start "rule__TargetPlatformModel__ElementsAssignment_3"
    // InternalTargetPlatform.g:3427:1: rule__TargetPlatformModel__ElementsAssignment_3 : ( ruleAbstractTPElement ) ;
    public final void rule__TargetPlatformModel__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3431:1: ( ( ruleAbstractTPElement ) )
            // InternalTargetPlatform.g:3432:2: ( ruleAbstractTPElement )
            {
            // InternalTargetPlatform.g:3432:2: ( ruleAbstractTPElement )
            // InternalTargetPlatform.g:3433:3: ruleAbstractTPElement
            {
             before(grammarAccess.getTargetPlatformModelAccess().getElementsAbstractTPElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTPElement();

            state._fsp--;

             after(grammarAccess.getTargetPlatformModelAccess().getElementsAbstractTPElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformModel__ElementsAssignment_3"


    // $ANTLR start "rule__NetworkConnection__Endpoint1Assignment_2"
    // InternalTargetPlatform.g:3442:1: rule__NetworkConnection__Endpoint1Assignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__NetworkConnection__Endpoint1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3446:1: ( ( ( ruleFQN ) ) )
            // InternalTargetPlatform.g:3447:2: ( ( ruleFQN ) )
            {
            // InternalTargetPlatform.g:3447:2: ( ( ruleFQN ) )
            // InternalTargetPlatform.g:3448:3: ( ruleFQN )
            {
             before(grammarAccess.getNetworkConnectionAccess().getEndpoint1NetworkInterfaceCrossReference_2_0()); 
            // InternalTargetPlatform.g:3449:3: ( ruleFQN )
            // InternalTargetPlatform.g:3450:4: ruleFQN
            {
             before(grammarAccess.getNetworkConnectionAccess().getEndpoint1NetworkInterfaceFQNParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getNetworkConnectionAccess().getEndpoint1NetworkInterfaceFQNParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getNetworkConnectionAccess().getEndpoint1NetworkInterfaceCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Endpoint1Assignment_2"


    // $ANTLR start "rule__NetworkConnection__Endpoint2Assignment_4"
    // InternalTargetPlatform.g:3461:1: rule__NetworkConnection__Endpoint2Assignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__NetworkConnection__Endpoint2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3465:1: ( ( ( ruleFQN ) ) )
            // InternalTargetPlatform.g:3466:2: ( ( ruleFQN ) )
            {
            // InternalTargetPlatform.g:3466:2: ( ( ruleFQN ) )
            // InternalTargetPlatform.g:3467:3: ( ruleFQN )
            {
             before(grammarAccess.getNetworkConnectionAccess().getEndpoint2NetworkInterfaceCrossReference_4_0()); 
            // InternalTargetPlatform.g:3468:3: ( ruleFQN )
            // InternalTargetPlatform.g:3469:4: ruleFQN
            {
             before(grammarAccess.getNetworkConnectionAccess().getEndpoint2NetworkInterfaceFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getNetworkConnectionAccess().getEndpoint2NetworkInterfaceFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getNetworkConnectionAccess().getEndpoint2NetworkInterfaceCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__Endpoint2Assignment_4"


    // $ANTLR start "rule__NetworkConnection__KindAssignment_5_1"
    // InternalTargetPlatform.g:3480:1: rule__NetworkConnection__KindAssignment_5_1 : ( ruleEString ) ;
    public final void rule__NetworkConnection__KindAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3484:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3485:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3485:2: ( ruleEString )
            // InternalTargetPlatform.g:3486:3: ruleEString
            {
             before(grammarAccess.getNetworkConnectionAccess().getKindEStringParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkConnectionAccess().getKindEStringParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkConnection__KindAssignment_5_1"


    // $ANTLR start "rule__TargetPlatformDefinition__NameAssignment_1"
    // InternalTargetPlatform.g:3495:1: rule__TargetPlatformDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TargetPlatformDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3499:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:3500:2: ( RULE_ID )
            {
            // InternalTargetPlatform.g:3500:2: ( RULE_ID )
            // InternalTargetPlatform.g:3501:3: RULE_ID
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTargetPlatformDefinitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__NameAssignment_1"


    // $ANTLR start "rule__TargetPlatformDefinition__OsAssignment_3"
    // InternalTargetPlatform.g:3510:1: rule__TargetPlatformDefinition__OsAssignment_3 : ( ruleOperatingSystem ) ;
    public final void rule__TargetPlatformDefinition__OsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3514:1: ( ( ruleOperatingSystem ) )
            // InternalTargetPlatform.g:3515:2: ( ruleOperatingSystem )
            {
            // InternalTargetPlatform.g:3515:2: ( ruleOperatingSystem )
            // InternalTargetPlatform.g:3516:3: ruleOperatingSystem
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getOsOperatingSystemParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleOperatingSystem();

            state._fsp--;

             after(grammarAccess.getTargetPlatformDefinitionAccess().getOsOperatingSystemParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__OsAssignment_3"


    // $ANTLR start "rule__TargetPlatformDefinition__ElementsAssignment_4"
    // InternalTargetPlatform.g:3525:1: rule__TargetPlatformDefinition__ElementsAssignment_4 : ( ruleAbstractTPSubNode ) ;
    public final void rule__TargetPlatformDefinition__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3529:1: ( ( ruleAbstractTPSubNode ) )
            // InternalTargetPlatform.g:3530:2: ( ruleAbstractTPSubNode )
            {
            // InternalTargetPlatform.g:3530:2: ( ruleAbstractTPSubNode )
            // InternalTargetPlatform.g:3531:3: ruleAbstractTPSubNode
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAbstractTPSubNodeParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractTPSubNode();

            state._fsp--;

             after(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAbstractTPSubNodeParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetPlatformDefinition__ElementsAssignment_4"


    // $ANTLR start "rule__Windows__KindAssignment_2"
    // InternalTargetPlatform.g:3540:1: rule__Windows__KindAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Windows__KindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3544:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3545:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3545:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3546:3: RULE_STRING
            {
             before(grammarAccess.getWindowsAccess().getKindSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getWindowsAccess().getKindSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Windows__KindAssignment_2"


    // $ANTLR start "rule__Linux__KindAssignment_2"
    // InternalTargetPlatform.g:3555:1: rule__Linux__KindAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Linux__KindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3559:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3560:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3560:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3561:3: RULE_STRING
            {
             before(grammarAccess.getLinuxAccess().getKindSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLinuxAccess().getKindSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Linux__KindAssignment_2"


    // $ANTLR start "rule__MacOS__KindAssignment_2"
    // InternalTargetPlatform.g:3570:1: rule__MacOS__KindAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MacOS__KindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3574:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3575:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3575:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3576:3: RULE_STRING
            {
             before(grammarAccess.getMacOSAccess().getKindSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMacOSAccess().getKindSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MacOS__KindAssignment_2"


    // $ANTLR start "rule__NetworkInterface__NameAssignment_1"
    // InternalTargetPlatform.g:3585:1: rule__NetworkInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NetworkInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3589:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:3590:2: ( RULE_ID )
            {
            // InternalTargetPlatform.g:3590:2: ( RULE_ID )
            // InternalTargetPlatform.g:3591:3: RULE_ID
            {
             before(grammarAccess.getNetworkInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getNetworkInterfaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__NameAssignment_1"


    // $ANTLR start "rule__NetworkInterface__HostAddressAssignment_3_0_1"
    // InternalTargetPlatform.g:3600:1: rule__NetworkInterface__HostAddressAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__NetworkInterface__HostAddressAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3604:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3605:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3605:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3606:3: RULE_STRING
            {
             before(grammarAccess.getNetworkInterfaceAccess().getHostAddressSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNetworkInterfaceAccess().getHostAddressSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__HostAddressAssignment_3_0_1"


    // $ANTLR start "rule__NetworkInterface__PortNrAssignment_3_0_2_1"
    // InternalTargetPlatform.g:3615:1: rule__NetworkInterface__PortNrAssignment_3_0_2_1 : ( ruleEInt ) ;
    public final void rule__NetworkInterface__PortNrAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3619:1: ( ( ruleEInt ) )
            // InternalTargetPlatform.g:3620:2: ( ruleEInt )
            {
            // InternalTargetPlatform.g:3620:2: ( ruleEInt )
            // InternalTargetPlatform.g:3621:3: ruleEInt
            {
             before(grammarAccess.getNetworkInterfaceAccess().getPortNrEIntParserRuleCall_3_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getNetworkInterfaceAccess().getPortNrEIntParserRuleCall_3_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__PortNrAssignment_3_0_2_1"


    // $ANTLR start "rule__NetworkInterface__KindAssignment_3_1_1"
    // InternalTargetPlatform.g:3630:1: rule__NetworkInterface__KindAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__NetworkInterface__KindAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3634:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3635:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3635:2: ( ruleEString )
            // InternalTargetPlatform.g:3636:3: ruleEString
            {
             before(grammarAccess.getNetworkInterfaceAccess().getKindEStringParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getNetworkInterfaceAccess().getKindEStringParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NetworkInterface__KindAssignment_3_1_1"


    // $ANTLR start "rule__CPU__NameAssignment_1"
    // InternalTargetPlatform.g:3645:1: rule__CPU__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CPU__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3649:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:3650:2: ( RULE_ID )
            {
            // InternalTargetPlatform.g:3650:2: ( RULE_ID )
            // InternalTargetPlatform.g:3651:3: RULE_ID
            {
             before(grammarAccess.getCPUAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCPUAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__NameAssignment_1"


    // $ANTLR start "rule__CPU__KindAssignment_3_0_1"
    // InternalTargetPlatform.g:3660:1: rule__CPU__KindAssignment_3_0_1 : ( ruleEString ) ;
    public final void rule__CPU__KindAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3664:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3665:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3665:2: ( ruleEString )
            // InternalTargetPlatform.g:3666:3: ruleEString
            {
             before(grammarAccess.getCPUAccess().getKindEStringParserRuleCall_3_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCPUAccess().getKindEStringParserRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__KindAssignment_3_0_1"


    // $ANTLR start "rule__CPU__CoresTallyAssignment_3_1_1"
    // InternalTargetPlatform.g:3675:1: rule__CPU__CoresTallyAssignment_3_1_1 : ( ruleEInt ) ;
    public final void rule__CPU__CoresTallyAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3679:1: ( ( ruleEInt ) )
            // InternalTargetPlatform.g:3680:2: ( ruleEInt )
            {
            // InternalTargetPlatform.g:3680:2: ( ruleEInt )
            // InternalTargetPlatform.g:3681:3: ruleEInt
            {
             before(grammarAccess.getCPUAccess().getCoresTallyEIntParserRuleCall_3_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getCPUAccess().getCoresTallyEIntParserRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CPU__CoresTallyAssignment_3_1_1"


    // $ANTLR start "rule__LoginAccount__NameAssignment_1"
    // InternalTargetPlatform.g:3690:1: rule__LoginAccount__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LoginAccount__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3694:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:3695:2: ( RULE_ID )
            {
            // InternalTargetPlatform.g:3695:2: ( RULE_ID )
            // InternalTargetPlatform.g:3696:3: RULE_ID
            {
             before(grammarAccess.getLoginAccountAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLoginAccountAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__NameAssignment_1"


    // $ANTLR start "rule__LoginAccount__FullnameAssignment_3_0_1"
    // InternalTargetPlatform.g:3705:1: rule__LoginAccount__FullnameAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__LoginAccount__FullnameAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3709:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3710:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3710:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3711:3: RULE_STRING
            {
             before(grammarAccess.getLoginAccountAccess().getFullnameSTRINGTerminalRuleCall_3_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoginAccountAccess().getFullnameSTRINGTerminalRuleCall_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__FullnameAssignment_3_0_1"


    // $ANTLR start "rule__LoginAccount__EmailAssignment_3_1_1"
    // InternalTargetPlatform.g:3720:1: rule__LoginAccount__EmailAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__LoginAccount__EmailAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3724:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3725:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3725:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3726:3: RULE_STRING
            {
             before(grammarAccess.getLoginAccountAccess().getEmailSTRINGTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLoginAccountAccess().getEmailSTRINGTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LoginAccount__EmailAssignment_3_1_1"


    // $ANTLR start "rule__TargetMiddleware__MiddlewareAssignment_1"
    // InternalTargetPlatform.g:3735:1: rule__TargetMiddleware__MiddlewareAssignment_1 : ( ruleRoboticMiddleware ) ;
    public final void rule__TargetMiddleware__MiddlewareAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3739:1: ( ( ruleRoboticMiddleware ) )
            // InternalTargetPlatform.g:3740:2: ( ruleRoboticMiddleware )
            {
            // InternalTargetPlatform.g:3740:2: ( ruleRoboticMiddleware )
            // InternalTargetPlatform.g:3741:3: ruleRoboticMiddleware
            {
             before(grammarAccess.getTargetMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRoboticMiddleware();

            state._fsp--;

             after(grammarAccess.getTargetMiddlewareAccess().getMiddlewareRoboticMiddlewareParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TargetMiddleware__MiddlewareAssignment_1"


    // $ANTLR start "rule__ACE_SmartSoft__DescriptionAssignment_2_1"
    // InternalTargetPlatform.g:3750:1: rule__ACE_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ACE_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3754:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3755:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3755:2: ( ruleEString )
            // InternalTargetPlatform.g:3756:3: ruleEString
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
    // InternalTargetPlatform.g:3765:1: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpcUa_SeRoNet__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3769:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3770:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3770:2: ( ruleEString )
            // InternalTargetPlatform.g:3771:3: ruleEString
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
    // InternalTargetPlatform.g:3780:1: rule__CORBA_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CORBA_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3784:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3785:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3785:2: ( ruleEString )
            // InternalTargetPlatform.g:3786:3: ruleEString
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
    // InternalTargetPlatform.g:3795:1: rule__DDS_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DDS_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3799:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3800:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3800:2: ( ruleEString )
            // InternalTargetPlatform.g:3801:3: ruleEString
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000130000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000120002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000004A3A10000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x00000004A2000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000003A000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000014000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000050000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000300000002L});

}
