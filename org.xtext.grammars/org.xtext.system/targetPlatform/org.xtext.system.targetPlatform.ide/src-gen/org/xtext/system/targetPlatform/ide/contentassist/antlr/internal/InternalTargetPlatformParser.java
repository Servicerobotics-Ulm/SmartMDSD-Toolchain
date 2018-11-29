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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'TargetPlatformModel'", "'{'", "'}'", "'NetworkConnection'", "'<->'", "'kind'", "'TargetPlatformDefinition'", "'Windows'", "';'", "'Linux'", "'MacOS'", "'NetworkInterface'", "'HostAddress'", "':'", "'Kind'", "'CPU'", "'CoresTally'", "'LoginAccount'", "'FullName'", "'Email'", "'TargetMiddleware'", "'.'", "'-'", "'ACE_SmartSoft'", "'description'", "'OpcUa_SeRoNet'", "'CORBA_SmartSoft'", "'DDS_SmartSoft'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
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
    // InternalTargetPlatform.g:94:1: entryRuleTargetPlatformModel : ruleTargetPlatformModel EOF ;
    public final void entryRuleTargetPlatformModel() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:95:1: ( ruleTargetPlatformModel EOF )
            // InternalTargetPlatform.g:96:1: ruleTargetPlatformModel EOF
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
    // InternalTargetPlatform.g:103:1: ruleTargetPlatformModel : ( ( rule__TargetPlatformModel__Group__0 ) ) ;
    public final void ruleTargetPlatformModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:107:2: ( ( ( rule__TargetPlatformModel__Group__0 ) ) )
            // InternalTargetPlatform.g:108:2: ( ( rule__TargetPlatformModel__Group__0 ) )
            {
            // InternalTargetPlatform.g:108:2: ( ( rule__TargetPlatformModel__Group__0 ) )
            // InternalTargetPlatform.g:109:3: ( rule__TargetPlatformModel__Group__0 )
            {
             before(grammarAccess.getTargetPlatformModelAccess().getGroup()); 
            // InternalTargetPlatform.g:110:3: ( rule__TargetPlatformModel__Group__0 )
            // InternalTargetPlatform.g:110:4: rule__TargetPlatformModel__Group__0
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
    // InternalTargetPlatform.g:119:1: entryRuleAbstractTPElement : ruleAbstractTPElement EOF ;
    public final void entryRuleAbstractTPElement() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:120:1: ( ruleAbstractTPElement EOF )
            // InternalTargetPlatform.g:121:1: ruleAbstractTPElement EOF
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
    // InternalTargetPlatform.g:128:1: ruleAbstractTPElement : ( ( rule__AbstractTPElement__Alternatives ) ) ;
    public final void ruleAbstractTPElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:132:2: ( ( ( rule__AbstractTPElement__Alternatives ) ) )
            // InternalTargetPlatform.g:133:2: ( ( rule__AbstractTPElement__Alternatives ) )
            {
            // InternalTargetPlatform.g:133:2: ( ( rule__AbstractTPElement__Alternatives ) )
            // InternalTargetPlatform.g:134:3: ( rule__AbstractTPElement__Alternatives )
            {
             before(grammarAccess.getAbstractTPElementAccess().getAlternatives()); 
            // InternalTargetPlatform.g:135:3: ( rule__AbstractTPElement__Alternatives )
            // InternalTargetPlatform.g:135:4: rule__AbstractTPElement__Alternatives
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
    // InternalTargetPlatform.g:144:1: entryRuleNetworkConnection : ruleNetworkConnection EOF ;
    public final void entryRuleNetworkConnection() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:145:1: ( ruleNetworkConnection EOF )
            // InternalTargetPlatform.g:146:1: ruleNetworkConnection EOF
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
    // InternalTargetPlatform.g:153:1: ruleNetworkConnection : ( ( rule__NetworkConnection__Group__0 ) ) ;
    public final void ruleNetworkConnection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:157:2: ( ( ( rule__NetworkConnection__Group__0 ) ) )
            // InternalTargetPlatform.g:158:2: ( ( rule__NetworkConnection__Group__0 ) )
            {
            // InternalTargetPlatform.g:158:2: ( ( rule__NetworkConnection__Group__0 ) )
            // InternalTargetPlatform.g:159:3: ( rule__NetworkConnection__Group__0 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup()); 
            // InternalTargetPlatform.g:160:3: ( rule__NetworkConnection__Group__0 )
            // InternalTargetPlatform.g:160:4: rule__NetworkConnection__Group__0
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
    // InternalTargetPlatform.g:169:1: entryRuleTargetPlatformDefinition : ruleTargetPlatformDefinition EOF ;
    public final void entryRuleTargetPlatformDefinition() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:170:1: ( ruleTargetPlatformDefinition EOF )
            // InternalTargetPlatform.g:171:1: ruleTargetPlatformDefinition EOF
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
    // InternalTargetPlatform.g:178:1: ruleTargetPlatformDefinition : ( ( rule__TargetPlatformDefinition__Group__0 ) ) ;
    public final void ruleTargetPlatformDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:182:2: ( ( ( rule__TargetPlatformDefinition__Group__0 ) ) )
            // InternalTargetPlatform.g:183:2: ( ( rule__TargetPlatformDefinition__Group__0 ) )
            {
            // InternalTargetPlatform.g:183:2: ( ( rule__TargetPlatformDefinition__Group__0 ) )
            // InternalTargetPlatform.g:184:3: ( rule__TargetPlatformDefinition__Group__0 )
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getGroup()); 
            // InternalTargetPlatform.g:185:3: ( rule__TargetPlatformDefinition__Group__0 )
            // InternalTargetPlatform.g:185:4: rule__TargetPlatformDefinition__Group__0
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
    // InternalTargetPlatform.g:194:1: entryRuleOperatingSystem : ruleOperatingSystem EOF ;
    public final void entryRuleOperatingSystem() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:195:1: ( ruleOperatingSystem EOF )
            // InternalTargetPlatform.g:196:1: ruleOperatingSystem EOF
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
    // InternalTargetPlatform.g:203:1: ruleOperatingSystem : ( ( rule__OperatingSystem__Alternatives ) ) ;
    public final void ruleOperatingSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:207:2: ( ( ( rule__OperatingSystem__Alternatives ) ) )
            // InternalTargetPlatform.g:208:2: ( ( rule__OperatingSystem__Alternatives ) )
            {
            // InternalTargetPlatform.g:208:2: ( ( rule__OperatingSystem__Alternatives ) )
            // InternalTargetPlatform.g:209:3: ( rule__OperatingSystem__Alternatives )
            {
             before(grammarAccess.getOperatingSystemAccess().getAlternatives()); 
            // InternalTargetPlatform.g:210:3: ( rule__OperatingSystem__Alternatives )
            // InternalTargetPlatform.g:210:4: rule__OperatingSystem__Alternatives
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
    // InternalTargetPlatform.g:219:1: entryRuleWindows : ruleWindows EOF ;
    public final void entryRuleWindows() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:220:1: ( ruleWindows EOF )
            // InternalTargetPlatform.g:221:1: ruleWindows EOF
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
    // InternalTargetPlatform.g:228:1: ruleWindows : ( ( rule__Windows__Group__0 ) ) ;
    public final void ruleWindows() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:232:2: ( ( ( rule__Windows__Group__0 ) ) )
            // InternalTargetPlatform.g:233:2: ( ( rule__Windows__Group__0 ) )
            {
            // InternalTargetPlatform.g:233:2: ( ( rule__Windows__Group__0 ) )
            // InternalTargetPlatform.g:234:3: ( rule__Windows__Group__0 )
            {
             before(grammarAccess.getWindowsAccess().getGroup()); 
            // InternalTargetPlatform.g:235:3: ( rule__Windows__Group__0 )
            // InternalTargetPlatform.g:235:4: rule__Windows__Group__0
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
    // InternalTargetPlatform.g:244:1: entryRuleLinux : ruleLinux EOF ;
    public final void entryRuleLinux() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:245:1: ( ruleLinux EOF )
            // InternalTargetPlatform.g:246:1: ruleLinux EOF
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
    // InternalTargetPlatform.g:253:1: ruleLinux : ( ( rule__Linux__Group__0 ) ) ;
    public final void ruleLinux() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:257:2: ( ( ( rule__Linux__Group__0 ) ) )
            // InternalTargetPlatform.g:258:2: ( ( rule__Linux__Group__0 ) )
            {
            // InternalTargetPlatform.g:258:2: ( ( rule__Linux__Group__0 ) )
            // InternalTargetPlatform.g:259:3: ( rule__Linux__Group__0 )
            {
             before(grammarAccess.getLinuxAccess().getGroup()); 
            // InternalTargetPlatform.g:260:3: ( rule__Linux__Group__0 )
            // InternalTargetPlatform.g:260:4: rule__Linux__Group__0
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
    // InternalTargetPlatform.g:269:1: entryRuleMacOS : ruleMacOS EOF ;
    public final void entryRuleMacOS() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:270:1: ( ruleMacOS EOF )
            // InternalTargetPlatform.g:271:1: ruleMacOS EOF
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
    // InternalTargetPlatform.g:278:1: ruleMacOS : ( ( rule__MacOS__Group__0 ) ) ;
    public final void ruleMacOS() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:282:2: ( ( ( rule__MacOS__Group__0 ) ) )
            // InternalTargetPlatform.g:283:2: ( ( rule__MacOS__Group__0 ) )
            {
            // InternalTargetPlatform.g:283:2: ( ( rule__MacOS__Group__0 ) )
            // InternalTargetPlatform.g:284:3: ( rule__MacOS__Group__0 )
            {
             before(grammarAccess.getMacOSAccess().getGroup()); 
            // InternalTargetPlatform.g:285:3: ( rule__MacOS__Group__0 )
            // InternalTargetPlatform.g:285:4: rule__MacOS__Group__0
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
    // InternalTargetPlatform.g:294:1: entryRuleAbstractTPSubNode : ruleAbstractTPSubNode EOF ;
    public final void entryRuleAbstractTPSubNode() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:295:1: ( ruleAbstractTPSubNode EOF )
            // InternalTargetPlatform.g:296:1: ruleAbstractTPSubNode EOF
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
    // InternalTargetPlatform.g:303:1: ruleAbstractTPSubNode : ( ( rule__AbstractTPSubNode__Alternatives ) ) ;
    public final void ruleAbstractTPSubNode() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:307:2: ( ( ( rule__AbstractTPSubNode__Alternatives ) ) )
            // InternalTargetPlatform.g:308:2: ( ( rule__AbstractTPSubNode__Alternatives ) )
            {
            // InternalTargetPlatform.g:308:2: ( ( rule__AbstractTPSubNode__Alternatives ) )
            // InternalTargetPlatform.g:309:3: ( rule__AbstractTPSubNode__Alternatives )
            {
             before(grammarAccess.getAbstractTPSubNodeAccess().getAlternatives()); 
            // InternalTargetPlatform.g:310:3: ( rule__AbstractTPSubNode__Alternatives )
            // InternalTargetPlatform.g:310:4: rule__AbstractTPSubNode__Alternatives
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
    // InternalTargetPlatform.g:319:1: entryRuleNetworkInterface : ruleNetworkInterface EOF ;
    public final void entryRuleNetworkInterface() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:320:1: ( ruleNetworkInterface EOF )
            // InternalTargetPlatform.g:321:1: ruleNetworkInterface EOF
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
    // InternalTargetPlatform.g:328:1: ruleNetworkInterface : ( ( rule__NetworkInterface__Group__0 ) ) ;
    public final void ruleNetworkInterface() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:332:2: ( ( ( rule__NetworkInterface__Group__0 ) ) )
            // InternalTargetPlatform.g:333:2: ( ( rule__NetworkInterface__Group__0 ) )
            {
            // InternalTargetPlatform.g:333:2: ( ( rule__NetworkInterface__Group__0 ) )
            // InternalTargetPlatform.g:334:3: ( rule__NetworkInterface__Group__0 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getGroup()); 
            // InternalTargetPlatform.g:335:3: ( rule__NetworkInterface__Group__0 )
            // InternalTargetPlatform.g:335:4: rule__NetworkInterface__Group__0
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
    // InternalTargetPlatform.g:344:1: entryRuleCPU : ruleCPU EOF ;
    public final void entryRuleCPU() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:345:1: ( ruleCPU EOF )
            // InternalTargetPlatform.g:346:1: ruleCPU EOF
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
    // InternalTargetPlatform.g:353:1: ruleCPU : ( ( rule__CPU__Group__0 ) ) ;
    public final void ruleCPU() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:357:2: ( ( ( rule__CPU__Group__0 ) ) )
            // InternalTargetPlatform.g:358:2: ( ( rule__CPU__Group__0 ) )
            {
            // InternalTargetPlatform.g:358:2: ( ( rule__CPU__Group__0 ) )
            // InternalTargetPlatform.g:359:3: ( rule__CPU__Group__0 )
            {
             before(grammarAccess.getCPUAccess().getGroup()); 
            // InternalTargetPlatform.g:360:3: ( rule__CPU__Group__0 )
            // InternalTargetPlatform.g:360:4: rule__CPU__Group__0
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
    // InternalTargetPlatform.g:369:1: entryRuleLoginAccount : ruleLoginAccount EOF ;
    public final void entryRuleLoginAccount() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:370:1: ( ruleLoginAccount EOF )
            // InternalTargetPlatform.g:371:1: ruleLoginAccount EOF
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
    // InternalTargetPlatform.g:378:1: ruleLoginAccount : ( ( rule__LoginAccount__Group__0 ) ) ;
    public final void ruleLoginAccount() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:382:2: ( ( ( rule__LoginAccount__Group__0 ) ) )
            // InternalTargetPlatform.g:383:2: ( ( rule__LoginAccount__Group__0 ) )
            {
            // InternalTargetPlatform.g:383:2: ( ( rule__LoginAccount__Group__0 ) )
            // InternalTargetPlatform.g:384:3: ( rule__LoginAccount__Group__0 )
            {
             before(grammarAccess.getLoginAccountAccess().getGroup()); 
            // InternalTargetPlatform.g:385:3: ( rule__LoginAccount__Group__0 )
            // InternalTargetPlatform.g:385:4: rule__LoginAccount__Group__0
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
    // InternalTargetPlatform.g:394:1: entryRuleTargetMiddleware : ruleTargetMiddleware EOF ;
    public final void entryRuleTargetMiddleware() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:395:1: ( ruleTargetMiddleware EOF )
            // InternalTargetPlatform.g:396:1: ruleTargetMiddleware EOF
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
    // InternalTargetPlatform.g:403:1: ruleTargetMiddleware : ( ( rule__TargetMiddleware__Group__0 ) ) ;
    public final void ruleTargetMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:407:2: ( ( ( rule__TargetMiddleware__Group__0 ) ) )
            // InternalTargetPlatform.g:408:2: ( ( rule__TargetMiddleware__Group__0 ) )
            {
            // InternalTargetPlatform.g:408:2: ( ( rule__TargetMiddleware__Group__0 ) )
            // InternalTargetPlatform.g:409:3: ( rule__TargetMiddleware__Group__0 )
            {
             before(grammarAccess.getTargetMiddlewareAccess().getGroup()); 
            // InternalTargetPlatform.g:410:3: ( rule__TargetMiddleware__Group__0 )
            // InternalTargetPlatform.g:410:4: rule__TargetMiddleware__Group__0
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
    // InternalTargetPlatform.g:419:1: entryRuleRoboticMiddleware : ruleRoboticMiddleware EOF ;
    public final void entryRuleRoboticMiddleware() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:420:1: ( ruleRoboticMiddleware EOF )
            // InternalTargetPlatform.g:421:1: ruleRoboticMiddleware EOF
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
    // InternalTargetPlatform.g:428:1: ruleRoboticMiddleware : ( ( rule__RoboticMiddleware__Alternatives ) ) ;
    public final void ruleRoboticMiddleware() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:432:2: ( ( ( rule__RoboticMiddleware__Alternatives ) ) )
            // InternalTargetPlatform.g:433:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            {
            // InternalTargetPlatform.g:433:2: ( ( rule__RoboticMiddleware__Alternatives ) )
            // InternalTargetPlatform.g:434:3: ( rule__RoboticMiddleware__Alternatives )
            {
             before(grammarAccess.getRoboticMiddlewareAccess().getAlternatives()); 
            // InternalTargetPlatform.g:435:3: ( rule__RoboticMiddleware__Alternatives )
            // InternalTargetPlatform.g:435:4: rule__RoboticMiddleware__Alternatives
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
    // InternalTargetPlatform.g:444:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:445:1: ( ruleFQN EOF )
            // InternalTargetPlatform.g:446:1: ruleFQN EOF
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
    // InternalTargetPlatform.g:453:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:457:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalTargetPlatform.g:458:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalTargetPlatform.g:458:2: ( ( rule__FQN__Group__0 ) )
            // InternalTargetPlatform.g:459:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalTargetPlatform.g:460:3: ( rule__FQN__Group__0 )
            // InternalTargetPlatform.g:460:4: rule__FQN__Group__0
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
    // InternalTargetPlatform.g:469:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:470:1: ( ruleEString EOF )
            // InternalTargetPlatform.g:471:1: ruleEString EOF
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
    // InternalTargetPlatform.g:478:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:482:2: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:483:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:483:2: ( RULE_STRING )
            // InternalTargetPlatform.g:484:3: RULE_STRING
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
    // InternalTargetPlatform.g:494:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:495:1: ( ruleEInt EOF )
            // InternalTargetPlatform.g:496:1: ruleEInt EOF
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
    // InternalTargetPlatform.g:503:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:507:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalTargetPlatform.g:508:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalTargetPlatform.g:508:2: ( ( rule__EInt__Group__0 ) )
            // InternalTargetPlatform.g:509:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalTargetPlatform.g:510:3: ( rule__EInt__Group__0 )
            // InternalTargetPlatform.g:510:4: rule__EInt__Group__0
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
    // InternalTargetPlatform.g:519:1: entryRuleACE_SmartSoft : ruleACE_SmartSoft EOF ;
    public final void entryRuleACE_SmartSoft() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:520:1: ( ruleACE_SmartSoft EOF )
            // InternalTargetPlatform.g:521:1: ruleACE_SmartSoft EOF
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
    // InternalTargetPlatform.g:528:1: ruleACE_SmartSoft : ( ( rule__ACE_SmartSoft__Group__0 ) ) ;
    public final void ruleACE_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:532:2: ( ( ( rule__ACE_SmartSoft__Group__0 ) ) )
            // InternalTargetPlatform.g:533:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            {
            // InternalTargetPlatform.g:533:2: ( ( rule__ACE_SmartSoft__Group__0 ) )
            // InternalTargetPlatform.g:534:3: ( rule__ACE_SmartSoft__Group__0 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup()); 
            // InternalTargetPlatform.g:535:3: ( rule__ACE_SmartSoft__Group__0 )
            // InternalTargetPlatform.g:535:4: rule__ACE_SmartSoft__Group__0
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
    // InternalTargetPlatform.g:544:1: entryRuleOpcUa_SeRoNet : ruleOpcUa_SeRoNet EOF ;
    public final void entryRuleOpcUa_SeRoNet() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:545:1: ( ruleOpcUa_SeRoNet EOF )
            // InternalTargetPlatform.g:546:1: ruleOpcUa_SeRoNet EOF
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
    // InternalTargetPlatform.g:553:1: ruleOpcUa_SeRoNet : ( ( rule__OpcUa_SeRoNet__Group__0 ) ) ;
    public final void ruleOpcUa_SeRoNet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:557:2: ( ( ( rule__OpcUa_SeRoNet__Group__0 ) ) )
            // InternalTargetPlatform.g:558:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            {
            // InternalTargetPlatform.g:558:2: ( ( rule__OpcUa_SeRoNet__Group__0 ) )
            // InternalTargetPlatform.g:559:3: ( rule__OpcUa_SeRoNet__Group__0 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup()); 
            // InternalTargetPlatform.g:560:3: ( rule__OpcUa_SeRoNet__Group__0 )
            // InternalTargetPlatform.g:560:4: rule__OpcUa_SeRoNet__Group__0
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
    // InternalTargetPlatform.g:569:1: entryRuleCORBA_SmartSoft : ruleCORBA_SmartSoft EOF ;
    public final void entryRuleCORBA_SmartSoft() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:570:1: ( ruleCORBA_SmartSoft EOF )
            // InternalTargetPlatform.g:571:1: ruleCORBA_SmartSoft EOF
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
    // InternalTargetPlatform.g:578:1: ruleCORBA_SmartSoft : ( ( rule__CORBA_SmartSoft__Group__0 ) ) ;
    public final void ruleCORBA_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:582:2: ( ( ( rule__CORBA_SmartSoft__Group__0 ) ) )
            // InternalTargetPlatform.g:583:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            {
            // InternalTargetPlatform.g:583:2: ( ( rule__CORBA_SmartSoft__Group__0 ) )
            // InternalTargetPlatform.g:584:3: ( rule__CORBA_SmartSoft__Group__0 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup()); 
            // InternalTargetPlatform.g:585:3: ( rule__CORBA_SmartSoft__Group__0 )
            // InternalTargetPlatform.g:585:4: rule__CORBA_SmartSoft__Group__0
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
    // InternalTargetPlatform.g:594:1: entryRuleDDS_SmartSoft : ruleDDS_SmartSoft EOF ;
    public final void entryRuleDDS_SmartSoft() throws RecognitionException {
        try {
            // InternalTargetPlatform.g:595:1: ( ruleDDS_SmartSoft EOF )
            // InternalTargetPlatform.g:596:1: ruleDDS_SmartSoft EOF
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
    // InternalTargetPlatform.g:603:1: ruleDDS_SmartSoft : ( ( rule__DDS_SmartSoft__Group__0 ) ) ;
    public final void ruleDDS_SmartSoft() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:607:2: ( ( ( rule__DDS_SmartSoft__Group__0 ) ) )
            // InternalTargetPlatform.g:608:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            {
            // InternalTargetPlatform.g:608:2: ( ( rule__DDS_SmartSoft__Group__0 ) )
            // InternalTargetPlatform.g:609:3: ( rule__DDS_SmartSoft__Group__0 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup()); 
            // InternalTargetPlatform.g:610:3: ( rule__DDS_SmartSoft__Group__0 )
            // InternalTargetPlatform.g:610:4: rule__DDS_SmartSoft__Group__0
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
    // InternalTargetPlatform.g:618:1: rule__AbstractTPElement__Alternatives : ( ( ruleTargetPlatformDefinition ) | ( ruleNetworkConnection ) );
    public final void rule__AbstractTPElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:622:1: ( ( ruleTargetPlatformDefinition ) | ( ruleNetworkConnection ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==17) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalTargetPlatform.g:623:2: ( ruleTargetPlatformDefinition )
                    {
                    // InternalTargetPlatform.g:623:2: ( ruleTargetPlatformDefinition )
                    // InternalTargetPlatform.g:624:3: ruleTargetPlatformDefinition
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
                    // InternalTargetPlatform.g:629:2: ( ruleNetworkConnection )
                    {
                    // InternalTargetPlatform.g:629:2: ( ruleNetworkConnection )
                    // InternalTargetPlatform.g:630:3: ruleNetworkConnection
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
    // InternalTargetPlatform.g:639:1: rule__OperatingSystem__Alternatives : ( ( ruleWindows ) | ( ruleLinux ) | ( ruleMacOS ) );
    public final void rule__OperatingSystem__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:643:1: ( ( ruleWindows ) | ( ruleLinux ) | ( ruleMacOS ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 20:
                {
                alt2=2;
                }
                break;
            case 21:
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
                    // InternalTargetPlatform.g:644:2: ( ruleWindows )
                    {
                    // InternalTargetPlatform.g:644:2: ( ruleWindows )
                    // InternalTargetPlatform.g:645:3: ruleWindows
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
                    // InternalTargetPlatform.g:650:2: ( ruleLinux )
                    {
                    // InternalTargetPlatform.g:650:2: ( ruleLinux )
                    // InternalTargetPlatform.g:651:3: ruleLinux
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
                    // InternalTargetPlatform.g:656:2: ( ruleMacOS )
                    {
                    // InternalTargetPlatform.g:656:2: ( ruleMacOS )
                    // InternalTargetPlatform.g:657:3: ruleMacOS
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
    // InternalTargetPlatform.g:666:1: rule__AbstractTPSubNode__Alternatives : ( ( ruleNetworkInterface ) | ( ruleCPU ) | ( ruleLoginAccount ) | ( ruleTargetMiddleware ) );
    public final void rule__AbstractTPSubNode__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:670:1: ( ( ruleNetworkInterface ) | ( ruleCPU ) | ( ruleLoginAccount ) | ( ruleTargetMiddleware ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt3=1;
                }
                break;
            case 26:
                {
                alt3=2;
                }
                break;
            case 28:
                {
                alt3=3;
                }
                break;
            case 31:
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
                    // InternalTargetPlatform.g:671:2: ( ruleNetworkInterface )
                    {
                    // InternalTargetPlatform.g:671:2: ( ruleNetworkInterface )
                    // InternalTargetPlatform.g:672:3: ruleNetworkInterface
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
                    // InternalTargetPlatform.g:677:2: ( ruleCPU )
                    {
                    // InternalTargetPlatform.g:677:2: ( ruleCPU )
                    // InternalTargetPlatform.g:678:3: ruleCPU
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
                    // InternalTargetPlatform.g:683:2: ( ruleLoginAccount )
                    {
                    // InternalTargetPlatform.g:683:2: ( ruleLoginAccount )
                    // InternalTargetPlatform.g:684:3: ruleLoginAccount
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
                    // InternalTargetPlatform.g:689:2: ( ruleTargetMiddleware )
                    {
                    // InternalTargetPlatform.g:689:2: ( ruleTargetMiddleware )
                    // InternalTargetPlatform.g:690:3: ruleTargetMiddleware
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
    // InternalTargetPlatform.g:699:1: rule__RoboticMiddleware__Alternatives : ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) );
    public final void rule__RoboticMiddleware__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:703:1: ( ( ruleACE_SmartSoft ) | ( ruleOpcUa_SeRoNet ) | ( ruleCORBA_SmartSoft ) | ( ruleDDS_SmartSoft ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt4=1;
                }
                break;
            case 36:
                {
                alt4=2;
                }
                break;
            case 37:
                {
                alt4=3;
                }
                break;
            case 38:
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
                    // InternalTargetPlatform.g:704:2: ( ruleACE_SmartSoft )
                    {
                    // InternalTargetPlatform.g:704:2: ( ruleACE_SmartSoft )
                    // InternalTargetPlatform.g:705:3: ruleACE_SmartSoft
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
                    // InternalTargetPlatform.g:710:2: ( ruleOpcUa_SeRoNet )
                    {
                    // InternalTargetPlatform.g:710:2: ( ruleOpcUa_SeRoNet )
                    // InternalTargetPlatform.g:711:3: ruleOpcUa_SeRoNet
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
                    // InternalTargetPlatform.g:716:2: ( ruleCORBA_SmartSoft )
                    {
                    // InternalTargetPlatform.g:716:2: ( ruleCORBA_SmartSoft )
                    // InternalTargetPlatform.g:717:3: ruleCORBA_SmartSoft
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
                    // InternalTargetPlatform.g:722:2: ( ruleDDS_SmartSoft )
                    {
                    // InternalTargetPlatform.g:722:2: ( ruleDDS_SmartSoft )
                    // InternalTargetPlatform.g:723:3: ruleDDS_SmartSoft
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
    // InternalTargetPlatform.g:732:1: rule__TargetPlatformModel__Group__0 : rule__TargetPlatformModel__Group__0__Impl rule__TargetPlatformModel__Group__1 ;
    public final void rule__TargetPlatformModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:736:1: ( rule__TargetPlatformModel__Group__0__Impl rule__TargetPlatformModel__Group__1 )
            // InternalTargetPlatform.g:737:2: rule__TargetPlatformModel__Group__0__Impl rule__TargetPlatformModel__Group__1
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
    // InternalTargetPlatform.g:744:1: rule__TargetPlatformModel__Group__0__Impl : ( 'TargetPlatformModel' ) ;
    public final void rule__TargetPlatformModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:748:1: ( ( 'TargetPlatformModel' ) )
            // InternalTargetPlatform.g:749:1: ( 'TargetPlatformModel' )
            {
            // InternalTargetPlatform.g:749:1: ( 'TargetPlatformModel' )
            // InternalTargetPlatform.g:750:2: 'TargetPlatformModel'
            {
             before(grammarAccess.getTargetPlatformModelAccess().getTargetPlatformModelKeyword_0()); 
            match(input,11,FOLLOW_2); 
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
    // InternalTargetPlatform.g:759:1: rule__TargetPlatformModel__Group__1 : rule__TargetPlatformModel__Group__1__Impl rule__TargetPlatformModel__Group__2 ;
    public final void rule__TargetPlatformModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:763:1: ( rule__TargetPlatformModel__Group__1__Impl rule__TargetPlatformModel__Group__2 )
            // InternalTargetPlatform.g:764:2: rule__TargetPlatformModel__Group__1__Impl rule__TargetPlatformModel__Group__2
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
    // InternalTargetPlatform.g:771:1: rule__TargetPlatformModel__Group__1__Impl : ( ( rule__TargetPlatformModel__NameAssignment_1 ) ) ;
    public final void rule__TargetPlatformModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:775:1: ( ( ( rule__TargetPlatformModel__NameAssignment_1 ) ) )
            // InternalTargetPlatform.g:776:1: ( ( rule__TargetPlatformModel__NameAssignment_1 ) )
            {
            // InternalTargetPlatform.g:776:1: ( ( rule__TargetPlatformModel__NameAssignment_1 ) )
            // InternalTargetPlatform.g:777:2: ( rule__TargetPlatformModel__NameAssignment_1 )
            {
             before(grammarAccess.getTargetPlatformModelAccess().getNameAssignment_1()); 
            // InternalTargetPlatform.g:778:2: ( rule__TargetPlatformModel__NameAssignment_1 )
            // InternalTargetPlatform.g:778:3: rule__TargetPlatformModel__NameAssignment_1
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
    // InternalTargetPlatform.g:786:1: rule__TargetPlatformModel__Group__2 : rule__TargetPlatformModel__Group__2__Impl rule__TargetPlatformModel__Group__3 ;
    public final void rule__TargetPlatformModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:790:1: ( rule__TargetPlatformModel__Group__2__Impl rule__TargetPlatformModel__Group__3 )
            // InternalTargetPlatform.g:791:2: rule__TargetPlatformModel__Group__2__Impl rule__TargetPlatformModel__Group__3
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
    // InternalTargetPlatform.g:798:1: rule__TargetPlatformModel__Group__2__Impl : ( '{' ) ;
    public final void rule__TargetPlatformModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:802:1: ( ( '{' ) )
            // InternalTargetPlatform.g:803:1: ( '{' )
            {
            // InternalTargetPlatform.g:803:1: ( '{' )
            // InternalTargetPlatform.g:804:2: '{'
            {
             before(grammarAccess.getTargetPlatformModelAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalTargetPlatform.g:813:1: rule__TargetPlatformModel__Group__3 : rule__TargetPlatformModel__Group__3__Impl rule__TargetPlatformModel__Group__4 ;
    public final void rule__TargetPlatformModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:817:1: ( rule__TargetPlatformModel__Group__3__Impl rule__TargetPlatformModel__Group__4 )
            // InternalTargetPlatform.g:818:2: rule__TargetPlatformModel__Group__3__Impl rule__TargetPlatformModel__Group__4
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
    // InternalTargetPlatform.g:825:1: rule__TargetPlatformModel__Group__3__Impl : ( ( rule__TargetPlatformModel__ElementsAssignment_3 )* ) ;
    public final void rule__TargetPlatformModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:829:1: ( ( ( rule__TargetPlatformModel__ElementsAssignment_3 )* ) )
            // InternalTargetPlatform.g:830:1: ( ( rule__TargetPlatformModel__ElementsAssignment_3 )* )
            {
            // InternalTargetPlatform.g:830:1: ( ( rule__TargetPlatformModel__ElementsAssignment_3 )* )
            // InternalTargetPlatform.g:831:2: ( rule__TargetPlatformModel__ElementsAssignment_3 )*
            {
             before(grammarAccess.getTargetPlatformModelAccess().getElementsAssignment_3()); 
            // InternalTargetPlatform.g:832:2: ( rule__TargetPlatformModel__ElementsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14||LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalTargetPlatform.g:832:3: rule__TargetPlatformModel__ElementsAssignment_3
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
    // InternalTargetPlatform.g:840:1: rule__TargetPlatformModel__Group__4 : rule__TargetPlatformModel__Group__4__Impl ;
    public final void rule__TargetPlatformModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:844:1: ( rule__TargetPlatformModel__Group__4__Impl )
            // InternalTargetPlatform.g:845:2: rule__TargetPlatformModel__Group__4__Impl
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
    // InternalTargetPlatform.g:851:1: rule__TargetPlatformModel__Group__4__Impl : ( '}' ) ;
    public final void rule__TargetPlatformModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:855:1: ( ( '}' ) )
            // InternalTargetPlatform.g:856:1: ( '}' )
            {
            // InternalTargetPlatform.g:856:1: ( '}' )
            // InternalTargetPlatform.g:857:2: '}'
            {
             before(grammarAccess.getTargetPlatformModelAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalTargetPlatform.g:867:1: rule__NetworkConnection__Group__0 : rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 ;
    public final void rule__NetworkConnection__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:871:1: ( rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1 )
            // InternalTargetPlatform.g:872:2: rule__NetworkConnection__Group__0__Impl rule__NetworkConnection__Group__1
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
    // InternalTargetPlatform.g:879:1: rule__NetworkConnection__Group__0__Impl : ( 'NetworkConnection' ) ;
    public final void rule__NetworkConnection__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:883:1: ( ( 'NetworkConnection' ) )
            // InternalTargetPlatform.g:884:1: ( 'NetworkConnection' )
            {
            // InternalTargetPlatform.g:884:1: ( 'NetworkConnection' )
            // InternalTargetPlatform.g:885:2: 'NetworkConnection'
            {
             before(grammarAccess.getNetworkConnectionAccess().getNetworkConnectionKeyword_0()); 
            match(input,14,FOLLOW_2); 
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
    // InternalTargetPlatform.g:894:1: rule__NetworkConnection__Group__1 : rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 ;
    public final void rule__NetworkConnection__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:898:1: ( rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2 )
            // InternalTargetPlatform.g:899:2: rule__NetworkConnection__Group__1__Impl rule__NetworkConnection__Group__2
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
    // InternalTargetPlatform.g:906:1: rule__NetworkConnection__Group__1__Impl : ( '{' ) ;
    public final void rule__NetworkConnection__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:910:1: ( ( '{' ) )
            // InternalTargetPlatform.g:911:1: ( '{' )
            {
            // InternalTargetPlatform.g:911:1: ( '{' )
            // InternalTargetPlatform.g:912:2: '{'
            {
             before(grammarAccess.getNetworkConnectionAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,12,FOLLOW_2); 
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
    // InternalTargetPlatform.g:921:1: rule__NetworkConnection__Group__2 : rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 ;
    public final void rule__NetworkConnection__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:925:1: ( rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3 )
            // InternalTargetPlatform.g:926:2: rule__NetworkConnection__Group__2__Impl rule__NetworkConnection__Group__3
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
    // InternalTargetPlatform.g:933:1: rule__NetworkConnection__Group__2__Impl : ( ( rule__NetworkConnection__Endpoint1Assignment_2 ) ) ;
    public final void rule__NetworkConnection__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:937:1: ( ( ( rule__NetworkConnection__Endpoint1Assignment_2 ) ) )
            // InternalTargetPlatform.g:938:1: ( ( rule__NetworkConnection__Endpoint1Assignment_2 ) )
            {
            // InternalTargetPlatform.g:938:1: ( ( rule__NetworkConnection__Endpoint1Assignment_2 ) )
            // InternalTargetPlatform.g:939:2: ( rule__NetworkConnection__Endpoint1Assignment_2 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getEndpoint1Assignment_2()); 
            // InternalTargetPlatform.g:940:2: ( rule__NetworkConnection__Endpoint1Assignment_2 )
            // InternalTargetPlatform.g:940:3: rule__NetworkConnection__Endpoint1Assignment_2
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
    // InternalTargetPlatform.g:948:1: rule__NetworkConnection__Group__3 : rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 ;
    public final void rule__NetworkConnection__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:952:1: ( rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4 )
            // InternalTargetPlatform.g:953:2: rule__NetworkConnection__Group__3__Impl rule__NetworkConnection__Group__4
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
    // InternalTargetPlatform.g:960:1: rule__NetworkConnection__Group__3__Impl : ( '<->' ) ;
    public final void rule__NetworkConnection__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:964:1: ( ( '<->' ) )
            // InternalTargetPlatform.g:965:1: ( '<->' )
            {
            // InternalTargetPlatform.g:965:1: ( '<->' )
            // InternalTargetPlatform.g:966:2: '<->'
            {
             before(grammarAccess.getNetworkConnectionAccess().getLessThanSignHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,15,FOLLOW_2); 
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
    // InternalTargetPlatform.g:975:1: rule__NetworkConnection__Group__4 : rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 ;
    public final void rule__NetworkConnection__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:979:1: ( rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5 )
            // InternalTargetPlatform.g:980:2: rule__NetworkConnection__Group__4__Impl rule__NetworkConnection__Group__5
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
    // InternalTargetPlatform.g:987:1: rule__NetworkConnection__Group__4__Impl : ( ( rule__NetworkConnection__Endpoint2Assignment_4 ) ) ;
    public final void rule__NetworkConnection__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:991:1: ( ( ( rule__NetworkConnection__Endpoint2Assignment_4 ) ) )
            // InternalTargetPlatform.g:992:1: ( ( rule__NetworkConnection__Endpoint2Assignment_4 ) )
            {
            // InternalTargetPlatform.g:992:1: ( ( rule__NetworkConnection__Endpoint2Assignment_4 ) )
            // InternalTargetPlatform.g:993:2: ( rule__NetworkConnection__Endpoint2Assignment_4 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getEndpoint2Assignment_4()); 
            // InternalTargetPlatform.g:994:2: ( rule__NetworkConnection__Endpoint2Assignment_4 )
            // InternalTargetPlatform.g:994:3: rule__NetworkConnection__Endpoint2Assignment_4
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
    // InternalTargetPlatform.g:1002:1: rule__NetworkConnection__Group__5 : rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 ;
    public final void rule__NetworkConnection__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1006:1: ( rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6 )
            // InternalTargetPlatform.g:1007:2: rule__NetworkConnection__Group__5__Impl rule__NetworkConnection__Group__6
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
    // InternalTargetPlatform.g:1014:1: rule__NetworkConnection__Group__5__Impl : ( ( rule__NetworkConnection__Group_5__0 )? ) ;
    public final void rule__NetworkConnection__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1018:1: ( ( ( rule__NetworkConnection__Group_5__0 )? ) )
            // InternalTargetPlatform.g:1019:1: ( ( rule__NetworkConnection__Group_5__0 )? )
            {
            // InternalTargetPlatform.g:1019:1: ( ( rule__NetworkConnection__Group_5__0 )? )
            // InternalTargetPlatform.g:1020:2: ( rule__NetworkConnection__Group_5__0 )?
            {
             before(grammarAccess.getNetworkConnectionAccess().getGroup_5()); 
            // InternalTargetPlatform.g:1021:2: ( rule__NetworkConnection__Group_5__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==16) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalTargetPlatform.g:1021:3: rule__NetworkConnection__Group_5__0
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
    // InternalTargetPlatform.g:1029:1: rule__NetworkConnection__Group__6 : rule__NetworkConnection__Group__6__Impl ;
    public final void rule__NetworkConnection__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1033:1: ( rule__NetworkConnection__Group__6__Impl )
            // InternalTargetPlatform.g:1034:2: rule__NetworkConnection__Group__6__Impl
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
    // InternalTargetPlatform.g:1040:1: rule__NetworkConnection__Group__6__Impl : ( '}' ) ;
    public final void rule__NetworkConnection__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1044:1: ( ( '}' ) )
            // InternalTargetPlatform.g:1045:1: ( '}' )
            {
            // InternalTargetPlatform.g:1045:1: ( '}' )
            // InternalTargetPlatform.g:1046:2: '}'
            {
             before(grammarAccess.getNetworkConnectionAccess().getRightCurlyBracketKeyword_6()); 
            match(input,13,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1056:1: rule__NetworkConnection__Group_5__0 : rule__NetworkConnection__Group_5__0__Impl rule__NetworkConnection__Group_5__1 ;
    public final void rule__NetworkConnection__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1060:1: ( rule__NetworkConnection__Group_5__0__Impl rule__NetworkConnection__Group_5__1 )
            // InternalTargetPlatform.g:1061:2: rule__NetworkConnection__Group_5__0__Impl rule__NetworkConnection__Group_5__1
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
    // InternalTargetPlatform.g:1068:1: rule__NetworkConnection__Group_5__0__Impl : ( 'kind' ) ;
    public final void rule__NetworkConnection__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1072:1: ( ( 'kind' ) )
            // InternalTargetPlatform.g:1073:1: ( 'kind' )
            {
            // InternalTargetPlatform.g:1073:1: ( 'kind' )
            // InternalTargetPlatform.g:1074:2: 'kind'
            {
             before(grammarAccess.getNetworkConnectionAccess().getKindKeyword_5_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1083:1: rule__NetworkConnection__Group_5__1 : rule__NetworkConnection__Group_5__1__Impl ;
    public final void rule__NetworkConnection__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1087:1: ( rule__NetworkConnection__Group_5__1__Impl )
            // InternalTargetPlatform.g:1088:2: rule__NetworkConnection__Group_5__1__Impl
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
    // InternalTargetPlatform.g:1094:1: rule__NetworkConnection__Group_5__1__Impl : ( ( rule__NetworkConnection__KindAssignment_5_1 ) ) ;
    public final void rule__NetworkConnection__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1098:1: ( ( ( rule__NetworkConnection__KindAssignment_5_1 ) ) )
            // InternalTargetPlatform.g:1099:1: ( ( rule__NetworkConnection__KindAssignment_5_1 ) )
            {
            // InternalTargetPlatform.g:1099:1: ( ( rule__NetworkConnection__KindAssignment_5_1 ) )
            // InternalTargetPlatform.g:1100:2: ( rule__NetworkConnection__KindAssignment_5_1 )
            {
             before(grammarAccess.getNetworkConnectionAccess().getKindAssignment_5_1()); 
            // InternalTargetPlatform.g:1101:2: ( rule__NetworkConnection__KindAssignment_5_1 )
            // InternalTargetPlatform.g:1101:3: rule__NetworkConnection__KindAssignment_5_1
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
    // InternalTargetPlatform.g:1110:1: rule__TargetPlatformDefinition__Group__0 : rule__TargetPlatformDefinition__Group__0__Impl rule__TargetPlatformDefinition__Group__1 ;
    public final void rule__TargetPlatformDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1114:1: ( rule__TargetPlatformDefinition__Group__0__Impl rule__TargetPlatformDefinition__Group__1 )
            // InternalTargetPlatform.g:1115:2: rule__TargetPlatformDefinition__Group__0__Impl rule__TargetPlatformDefinition__Group__1
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
    // InternalTargetPlatform.g:1122:1: rule__TargetPlatformDefinition__Group__0__Impl : ( 'TargetPlatformDefinition' ) ;
    public final void rule__TargetPlatformDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1126:1: ( ( 'TargetPlatformDefinition' ) )
            // InternalTargetPlatform.g:1127:1: ( 'TargetPlatformDefinition' )
            {
            // InternalTargetPlatform.g:1127:1: ( 'TargetPlatformDefinition' )
            // InternalTargetPlatform.g:1128:2: 'TargetPlatformDefinition'
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getTargetPlatformDefinitionKeyword_0()); 
            match(input,17,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1137:1: rule__TargetPlatformDefinition__Group__1 : rule__TargetPlatformDefinition__Group__1__Impl rule__TargetPlatformDefinition__Group__2 ;
    public final void rule__TargetPlatformDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1141:1: ( rule__TargetPlatformDefinition__Group__1__Impl rule__TargetPlatformDefinition__Group__2 )
            // InternalTargetPlatform.g:1142:2: rule__TargetPlatformDefinition__Group__1__Impl rule__TargetPlatformDefinition__Group__2
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
    // InternalTargetPlatform.g:1149:1: rule__TargetPlatformDefinition__Group__1__Impl : ( ( rule__TargetPlatformDefinition__NameAssignment_1 ) ) ;
    public final void rule__TargetPlatformDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1153:1: ( ( ( rule__TargetPlatformDefinition__NameAssignment_1 ) ) )
            // InternalTargetPlatform.g:1154:1: ( ( rule__TargetPlatformDefinition__NameAssignment_1 ) )
            {
            // InternalTargetPlatform.g:1154:1: ( ( rule__TargetPlatformDefinition__NameAssignment_1 ) )
            // InternalTargetPlatform.g:1155:2: ( rule__TargetPlatformDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getNameAssignment_1()); 
            // InternalTargetPlatform.g:1156:2: ( rule__TargetPlatformDefinition__NameAssignment_1 )
            // InternalTargetPlatform.g:1156:3: rule__TargetPlatformDefinition__NameAssignment_1
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
    // InternalTargetPlatform.g:1164:1: rule__TargetPlatformDefinition__Group__2 : rule__TargetPlatformDefinition__Group__2__Impl rule__TargetPlatformDefinition__Group__3 ;
    public final void rule__TargetPlatformDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1168:1: ( rule__TargetPlatformDefinition__Group__2__Impl rule__TargetPlatformDefinition__Group__3 )
            // InternalTargetPlatform.g:1169:2: rule__TargetPlatformDefinition__Group__2__Impl rule__TargetPlatformDefinition__Group__3
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
    // InternalTargetPlatform.g:1176:1: rule__TargetPlatformDefinition__Group__2__Impl : ( '{' ) ;
    public final void rule__TargetPlatformDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1180:1: ( ( '{' ) )
            // InternalTargetPlatform.g:1181:1: ( '{' )
            {
            // InternalTargetPlatform.g:1181:1: ( '{' )
            // InternalTargetPlatform.g:1182:2: '{'
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1191:1: rule__TargetPlatformDefinition__Group__3 : rule__TargetPlatformDefinition__Group__3__Impl rule__TargetPlatformDefinition__Group__4 ;
    public final void rule__TargetPlatformDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1195:1: ( rule__TargetPlatformDefinition__Group__3__Impl rule__TargetPlatformDefinition__Group__4 )
            // InternalTargetPlatform.g:1196:2: rule__TargetPlatformDefinition__Group__3__Impl rule__TargetPlatformDefinition__Group__4
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
    // InternalTargetPlatform.g:1203:1: rule__TargetPlatformDefinition__Group__3__Impl : ( ( rule__TargetPlatformDefinition__OsAssignment_3 )? ) ;
    public final void rule__TargetPlatformDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1207:1: ( ( ( rule__TargetPlatformDefinition__OsAssignment_3 )? ) )
            // InternalTargetPlatform.g:1208:1: ( ( rule__TargetPlatformDefinition__OsAssignment_3 )? )
            {
            // InternalTargetPlatform.g:1208:1: ( ( rule__TargetPlatformDefinition__OsAssignment_3 )? )
            // InternalTargetPlatform.g:1209:2: ( rule__TargetPlatformDefinition__OsAssignment_3 )?
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getOsAssignment_3()); 
            // InternalTargetPlatform.g:1210:2: ( rule__TargetPlatformDefinition__OsAssignment_3 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18||(LA7_0>=20 && LA7_0<=21)) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalTargetPlatform.g:1210:3: rule__TargetPlatformDefinition__OsAssignment_3
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
    // InternalTargetPlatform.g:1218:1: rule__TargetPlatformDefinition__Group__4 : rule__TargetPlatformDefinition__Group__4__Impl rule__TargetPlatformDefinition__Group__5 ;
    public final void rule__TargetPlatformDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1222:1: ( rule__TargetPlatformDefinition__Group__4__Impl rule__TargetPlatformDefinition__Group__5 )
            // InternalTargetPlatform.g:1223:2: rule__TargetPlatformDefinition__Group__4__Impl rule__TargetPlatformDefinition__Group__5
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
    // InternalTargetPlatform.g:1230:1: rule__TargetPlatformDefinition__Group__4__Impl : ( ( rule__TargetPlatformDefinition__ElementsAssignment_4 )* ) ;
    public final void rule__TargetPlatformDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1234:1: ( ( ( rule__TargetPlatformDefinition__ElementsAssignment_4 )* ) )
            // InternalTargetPlatform.g:1235:1: ( ( rule__TargetPlatformDefinition__ElementsAssignment_4 )* )
            {
            // InternalTargetPlatform.g:1235:1: ( ( rule__TargetPlatformDefinition__ElementsAssignment_4 )* )
            // InternalTargetPlatform.g:1236:2: ( rule__TargetPlatformDefinition__ElementsAssignment_4 )*
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getElementsAssignment_4()); 
            // InternalTargetPlatform.g:1237:2: ( rule__TargetPlatformDefinition__ElementsAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22||LA8_0==26||LA8_0==28||LA8_0==31) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalTargetPlatform.g:1237:3: rule__TargetPlatformDefinition__ElementsAssignment_4
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
    // InternalTargetPlatform.g:1245:1: rule__TargetPlatformDefinition__Group__5 : rule__TargetPlatformDefinition__Group__5__Impl ;
    public final void rule__TargetPlatformDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1249:1: ( rule__TargetPlatformDefinition__Group__5__Impl )
            // InternalTargetPlatform.g:1250:2: rule__TargetPlatformDefinition__Group__5__Impl
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
    // InternalTargetPlatform.g:1256:1: rule__TargetPlatformDefinition__Group__5__Impl : ( '}' ) ;
    public final void rule__TargetPlatformDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1260:1: ( ( '}' ) )
            // InternalTargetPlatform.g:1261:1: ( '}' )
            {
            // InternalTargetPlatform.g:1261:1: ( '}' )
            // InternalTargetPlatform.g:1262:2: '}'
            {
             before(grammarAccess.getTargetPlatformDefinitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1272:1: rule__Windows__Group__0 : rule__Windows__Group__0__Impl rule__Windows__Group__1 ;
    public final void rule__Windows__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1276:1: ( rule__Windows__Group__0__Impl rule__Windows__Group__1 )
            // InternalTargetPlatform.g:1277:2: rule__Windows__Group__0__Impl rule__Windows__Group__1
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
    // InternalTargetPlatform.g:1284:1: rule__Windows__Group__0__Impl : ( () ) ;
    public final void rule__Windows__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1288:1: ( ( () ) )
            // InternalTargetPlatform.g:1289:1: ( () )
            {
            // InternalTargetPlatform.g:1289:1: ( () )
            // InternalTargetPlatform.g:1290:2: ()
            {
             before(grammarAccess.getWindowsAccess().getWindowsAction_0()); 
            // InternalTargetPlatform.g:1291:2: ()
            // InternalTargetPlatform.g:1291:3: 
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
    // InternalTargetPlatform.g:1299:1: rule__Windows__Group__1 : rule__Windows__Group__1__Impl rule__Windows__Group__2 ;
    public final void rule__Windows__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1303:1: ( rule__Windows__Group__1__Impl rule__Windows__Group__2 )
            // InternalTargetPlatform.g:1304:2: rule__Windows__Group__1__Impl rule__Windows__Group__2
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
    // InternalTargetPlatform.g:1311:1: rule__Windows__Group__1__Impl : ( 'Windows' ) ;
    public final void rule__Windows__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1315:1: ( ( 'Windows' ) )
            // InternalTargetPlatform.g:1316:1: ( 'Windows' )
            {
            // InternalTargetPlatform.g:1316:1: ( 'Windows' )
            // InternalTargetPlatform.g:1317:2: 'Windows'
            {
             before(grammarAccess.getWindowsAccess().getWindowsKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1326:1: rule__Windows__Group__2 : rule__Windows__Group__2__Impl rule__Windows__Group__3 ;
    public final void rule__Windows__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1330:1: ( rule__Windows__Group__2__Impl rule__Windows__Group__3 )
            // InternalTargetPlatform.g:1331:2: rule__Windows__Group__2__Impl rule__Windows__Group__3
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
    // InternalTargetPlatform.g:1338:1: rule__Windows__Group__2__Impl : ( ( rule__Windows__KindAssignment_2 )? ) ;
    public final void rule__Windows__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1342:1: ( ( ( rule__Windows__KindAssignment_2 )? ) )
            // InternalTargetPlatform.g:1343:1: ( ( rule__Windows__KindAssignment_2 )? )
            {
            // InternalTargetPlatform.g:1343:1: ( ( rule__Windows__KindAssignment_2 )? )
            // InternalTargetPlatform.g:1344:2: ( rule__Windows__KindAssignment_2 )?
            {
             before(grammarAccess.getWindowsAccess().getKindAssignment_2()); 
            // InternalTargetPlatform.g:1345:2: ( rule__Windows__KindAssignment_2 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalTargetPlatform.g:1345:3: rule__Windows__KindAssignment_2
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
    // InternalTargetPlatform.g:1353:1: rule__Windows__Group__3 : rule__Windows__Group__3__Impl ;
    public final void rule__Windows__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1357:1: ( rule__Windows__Group__3__Impl )
            // InternalTargetPlatform.g:1358:2: rule__Windows__Group__3__Impl
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
    // InternalTargetPlatform.g:1364:1: rule__Windows__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Windows__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1368:1: ( ( ( ';' )? ) )
            // InternalTargetPlatform.g:1369:1: ( ( ';' )? )
            {
            // InternalTargetPlatform.g:1369:1: ( ( ';' )? )
            // InternalTargetPlatform.g:1370:2: ( ';' )?
            {
             before(grammarAccess.getWindowsAccess().getSemicolonKeyword_3()); 
            // InternalTargetPlatform.g:1371:2: ( ';' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalTargetPlatform.g:1371:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalTargetPlatform.g:1380:1: rule__Linux__Group__0 : rule__Linux__Group__0__Impl rule__Linux__Group__1 ;
    public final void rule__Linux__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1384:1: ( rule__Linux__Group__0__Impl rule__Linux__Group__1 )
            // InternalTargetPlatform.g:1385:2: rule__Linux__Group__0__Impl rule__Linux__Group__1
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
    // InternalTargetPlatform.g:1392:1: rule__Linux__Group__0__Impl : ( () ) ;
    public final void rule__Linux__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1396:1: ( ( () ) )
            // InternalTargetPlatform.g:1397:1: ( () )
            {
            // InternalTargetPlatform.g:1397:1: ( () )
            // InternalTargetPlatform.g:1398:2: ()
            {
             before(grammarAccess.getLinuxAccess().getLinuxAction_0()); 
            // InternalTargetPlatform.g:1399:2: ()
            // InternalTargetPlatform.g:1399:3: 
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
    // InternalTargetPlatform.g:1407:1: rule__Linux__Group__1 : rule__Linux__Group__1__Impl rule__Linux__Group__2 ;
    public final void rule__Linux__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1411:1: ( rule__Linux__Group__1__Impl rule__Linux__Group__2 )
            // InternalTargetPlatform.g:1412:2: rule__Linux__Group__1__Impl rule__Linux__Group__2
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
    // InternalTargetPlatform.g:1419:1: rule__Linux__Group__1__Impl : ( 'Linux' ) ;
    public final void rule__Linux__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1423:1: ( ( 'Linux' ) )
            // InternalTargetPlatform.g:1424:1: ( 'Linux' )
            {
            // InternalTargetPlatform.g:1424:1: ( 'Linux' )
            // InternalTargetPlatform.g:1425:2: 'Linux'
            {
             before(grammarAccess.getLinuxAccess().getLinuxKeyword_1()); 
            match(input,20,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1434:1: rule__Linux__Group__2 : rule__Linux__Group__2__Impl rule__Linux__Group__3 ;
    public final void rule__Linux__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1438:1: ( rule__Linux__Group__2__Impl rule__Linux__Group__3 )
            // InternalTargetPlatform.g:1439:2: rule__Linux__Group__2__Impl rule__Linux__Group__3
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
    // InternalTargetPlatform.g:1446:1: rule__Linux__Group__2__Impl : ( ( rule__Linux__KindAssignment_2 )? ) ;
    public final void rule__Linux__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1450:1: ( ( ( rule__Linux__KindAssignment_2 )? ) )
            // InternalTargetPlatform.g:1451:1: ( ( rule__Linux__KindAssignment_2 )? )
            {
            // InternalTargetPlatform.g:1451:1: ( ( rule__Linux__KindAssignment_2 )? )
            // InternalTargetPlatform.g:1452:2: ( rule__Linux__KindAssignment_2 )?
            {
             before(grammarAccess.getLinuxAccess().getKindAssignment_2()); 
            // InternalTargetPlatform.g:1453:2: ( rule__Linux__KindAssignment_2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalTargetPlatform.g:1453:3: rule__Linux__KindAssignment_2
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
    // InternalTargetPlatform.g:1461:1: rule__Linux__Group__3 : rule__Linux__Group__3__Impl ;
    public final void rule__Linux__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1465:1: ( rule__Linux__Group__3__Impl )
            // InternalTargetPlatform.g:1466:2: rule__Linux__Group__3__Impl
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
    // InternalTargetPlatform.g:1472:1: rule__Linux__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__Linux__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1476:1: ( ( ( ';' )? ) )
            // InternalTargetPlatform.g:1477:1: ( ( ';' )? )
            {
            // InternalTargetPlatform.g:1477:1: ( ( ';' )? )
            // InternalTargetPlatform.g:1478:2: ( ';' )?
            {
             before(grammarAccess.getLinuxAccess().getSemicolonKeyword_3()); 
            // InternalTargetPlatform.g:1479:2: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalTargetPlatform.g:1479:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalTargetPlatform.g:1488:1: rule__MacOS__Group__0 : rule__MacOS__Group__0__Impl rule__MacOS__Group__1 ;
    public final void rule__MacOS__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1492:1: ( rule__MacOS__Group__0__Impl rule__MacOS__Group__1 )
            // InternalTargetPlatform.g:1493:2: rule__MacOS__Group__0__Impl rule__MacOS__Group__1
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
    // InternalTargetPlatform.g:1500:1: rule__MacOS__Group__0__Impl : ( () ) ;
    public final void rule__MacOS__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1504:1: ( ( () ) )
            // InternalTargetPlatform.g:1505:1: ( () )
            {
            // InternalTargetPlatform.g:1505:1: ( () )
            // InternalTargetPlatform.g:1506:2: ()
            {
             before(grammarAccess.getMacOSAccess().getMacOSAction_0()); 
            // InternalTargetPlatform.g:1507:2: ()
            // InternalTargetPlatform.g:1507:3: 
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
    // InternalTargetPlatform.g:1515:1: rule__MacOS__Group__1 : rule__MacOS__Group__1__Impl rule__MacOS__Group__2 ;
    public final void rule__MacOS__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1519:1: ( rule__MacOS__Group__1__Impl rule__MacOS__Group__2 )
            // InternalTargetPlatform.g:1520:2: rule__MacOS__Group__1__Impl rule__MacOS__Group__2
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
    // InternalTargetPlatform.g:1527:1: rule__MacOS__Group__1__Impl : ( 'MacOS' ) ;
    public final void rule__MacOS__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1531:1: ( ( 'MacOS' ) )
            // InternalTargetPlatform.g:1532:1: ( 'MacOS' )
            {
            // InternalTargetPlatform.g:1532:1: ( 'MacOS' )
            // InternalTargetPlatform.g:1533:2: 'MacOS'
            {
             before(grammarAccess.getMacOSAccess().getMacOSKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1542:1: rule__MacOS__Group__2 : rule__MacOS__Group__2__Impl rule__MacOS__Group__3 ;
    public final void rule__MacOS__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1546:1: ( rule__MacOS__Group__2__Impl rule__MacOS__Group__3 )
            // InternalTargetPlatform.g:1547:2: rule__MacOS__Group__2__Impl rule__MacOS__Group__3
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
    // InternalTargetPlatform.g:1554:1: rule__MacOS__Group__2__Impl : ( ( rule__MacOS__KindAssignment_2 )? ) ;
    public final void rule__MacOS__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1558:1: ( ( ( rule__MacOS__KindAssignment_2 )? ) )
            // InternalTargetPlatform.g:1559:1: ( ( rule__MacOS__KindAssignment_2 )? )
            {
            // InternalTargetPlatform.g:1559:1: ( ( rule__MacOS__KindAssignment_2 )? )
            // InternalTargetPlatform.g:1560:2: ( rule__MacOS__KindAssignment_2 )?
            {
             before(grammarAccess.getMacOSAccess().getKindAssignment_2()); 
            // InternalTargetPlatform.g:1561:2: ( rule__MacOS__KindAssignment_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalTargetPlatform.g:1561:3: rule__MacOS__KindAssignment_2
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
    // InternalTargetPlatform.g:1569:1: rule__MacOS__Group__3 : rule__MacOS__Group__3__Impl ;
    public final void rule__MacOS__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1573:1: ( rule__MacOS__Group__3__Impl )
            // InternalTargetPlatform.g:1574:2: rule__MacOS__Group__3__Impl
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
    // InternalTargetPlatform.g:1580:1: rule__MacOS__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__MacOS__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1584:1: ( ( ( ';' )? ) )
            // InternalTargetPlatform.g:1585:1: ( ( ';' )? )
            {
            // InternalTargetPlatform.g:1585:1: ( ( ';' )? )
            // InternalTargetPlatform.g:1586:2: ( ';' )?
            {
             before(grammarAccess.getMacOSAccess().getSemicolonKeyword_3()); 
            // InternalTargetPlatform.g:1587:2: ( ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==19) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalTargetPlatform.g:1587:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalTargetPlatform.g:1596:1: rule__NetworkInterface__Group__0 : rule__NetworkInterface__Group__0__Impl rule__NetworkInterface__Group__1 ;
    public final void rule__NetworkInterface__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1600:1: ( rule__NetworkInterface__Group__0__Impl rule__NetworkInterface__Group__1 )
            // InternalTargetPlatform.g:1601:2: rule__NetworkInterface__Group__0__Impl rule__NetworkInterface__Group__1
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
    // InternalTargetPlatform.g:1608:1: rule__NetworkInterface__Group__0__Impl : ( 'NetworkInterface' ) ;
    public final void rule__NetworkInterface__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1612:1: ( ( 'NetworkInterface' ) )
            // InternalTargetPlatform.g:1613:1: ( 'NetworkInterface' )
            {
            // InternalTargetPlatform.g:1613:1: ( 'NetworkInterface' )
            // InternalTargetPlatform.g:1614:2: 'NetworkInterface'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getNetworkInterfaceKeyword_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1623:1: rule__NetworkInterface__Group__1 : rule__NetworkInterface__Group__1__Impl rule__NetworkInterface__Group__2 ;
    public final void rule__NetworkInterface__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1627:1: ( rule__NetworkInterface__Group__1__Impl rule__NetworkInterface__Group__2 )
            // InternalTargetPlatform.g:1628:2: rule__NetworkInterface__Group__1__Impl rule__NetworkInterface__Group__2
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
    // InternalTargetPlatform.g:1635:1: rule__NetworkInterface__Group__1__Impl : ( ( rule__NetworkInterface__NameAssignment_1 ) ) ;
    public final void rule__NetworkInterface__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1639:1: ( ( ( rule__NetworkInterface__NameAssignment_1 ) ) )
            // InternalTargetPlatform.g:1640:1: ( ( rule__NetworkInterface__NameAssignment_1 ) )
            {
            // InternalTargetPlatform.g:1640:1: ( ( rule__NetworkInterface__NameAssignment_1 ) )
            // InternalTargetPlatform.g:1641:2: ( rule__NetworkInterface__NameAssignment_1 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getNameAssignment_1()); 
            // InternalTargetPlatform.g:1642:2: ( rule__NetworkInterface__NameAssignment_1 )
            // InternalTargetPlatform.g:1642:3: rule__NetworkInterface__NameAssignment_1
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
    // InternalTargetPlatform.g:1650:1: rule__NetworkInterface__Group__2 : rule__NetworkInterface__Group__2__Impl rule__NetworkInterface__Group__3 ;
    public final void rule__NetworkInterface__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1654:1: ( rule__NetworkInterface__Group__2__Impl rule__NetworkInterface__Group__3 )
            // InternalTargetPlatform.g:1655:2: rule__NetworkInterface__Group__2__Impl rule__NetworkInterface__Group__3
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
    // InternalTargetPlatform.g:1662:1: rule__NetworkInterface__Group__2__Impl : ( '{' ) ;
    public final void rule__NetworkInterface__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1666:1: ( ( '{' ) )
            // InternalTargetPlatform.g:1667:1: ( '{' )
            {
            // InternalTargetPlatform.g:1667:1: ( '{' )
            // InternalTargetPlatform.g:1668:2: '{'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1677:1: rule__NetworkInterface__Group__3 : rule__NetworkInterface__Group__3__Impl rule__NetworkInterface__Group__4 ;
    public final void rule__NetworkInterface__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1681:1: ( rule__NetworkInterface__Group__3__Impl rule__NetworkInterface__Group__4 )
            // InternalTargetPlatform.g:1682:2: rule__NetworkInterface__Group__3__Impl rule__NetworkInterface__Group__4
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
    // InternalTargetPlatform.g:1689:1: rule__NetworkInterface__Group__3__Impl : ( ( rule__NetworkInterface__UnorderedGroup_3 ) ) ;
    public final void rule__NetworkInterface__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1693:1: ( ( ( rule__NetworkInterface__UnorderedGroup_3 ) ) )
            // InternalTargetPlatform.g:1694:1: ( ( rule__NetworkInterface__UnorderedGroup_3 ) )
            {
            // InternalTargetPlatform.g:1694:1: ( ( rule__NetworkInterface__UnorderedGroup_3 ) )
            // InternalTargetPlatform.g:1695:2: ( rule__NetworkInterface__UnorderedGroup_3 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3()); 
            // InternalTargetPlatform.g:1696:2: ( rule__NetworkInterface__UnorderedGroup_3 )
            // InternalTargetPlatform.g:1696:3: rule__NetworkInterface__UnorderedGroup_3
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
    // InternalTargetPlatform.g:1704:1: rule__NetworkInterface__Group__4 : rule__NetworkInterface__Group__4__Impl ;
    public final void rule__NetworkInterface__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1708:1: ( rule__NetworkInterface__Group__4__Impl )
            // InternalTargetPlatform.g:1709:2: rule__NetworkInterface__Group__4__Impl
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
    // InternalTargetPlatform.g:1715:1: rule__NetworkInterface__Group__4__Impl : ( '}' ) ;
    public final void rule__NetworkInterface__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1719:1: ( ( '}' ) )
            // InternalTargetPlatform.g:1720:1: ( '}' )
            {
            // InternalTargetPlatform.g:1720:1: ( '}' )
            // InternalTargetPlatform.g:1721:2: '}'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1731:1: rule__NetworkInterface__Group_3_0__0 : rule__NetworkInterface__Group_3_0__0__Impl rule__NetworkInterface__Group_3_0__1 ;
    public final void rule__NetworkInterface__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1735:1: ( rule__NetworkInterface__Group_3_0__0__Impl rule__NetworkInterface__Group_3_0__1 )
            // InternalTargetPlatform.g:1736:2: rule__NetworkInterface__Group_3_0__0__Impl rule__NetworkInterface__Group_3_0__1
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
    // InternalTargetPlatform.g:1743:1: rule__NetworkInterface__Group_3_0__0__Impl : ( 'HostAddress' ) ;
    public final void rule__NetworkInterface__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1747:1: ( ( 'HostAddress' ) )
            // InternalTargetPlatform.g:1748:1: ( 'HostAddress' )
            {
            // InternalTargetPlatform.g:1748:1: ( 'HostAddress' )
            // InternalTargetPlatform.g:1749:2: 'HostAddress'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getHostAddressKeyword_3_0_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1758:1: rule__NetworkInterface__Group_3_0__1 : rule__NetworkInterface__Group_3_0__1__Impl rule__NetworkInterface__Group_3_0__2 ;
    public final void rule__NetworkInterface__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1762:1: ( rule__NetworkInterface__Group_3_0__1__Impl rule__NetworkInterface__Group_3_0__2 )
            // InternalTargetPlatform.g:1763:2: rule__NetworkInterface__Group_3_0__1__Impl rule__NetworkInterface__Group_3_0__2
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
    // InternalTargetPlatform.g:1770:1: rule__NetworkInterface__Group_3_0__1__Impl : ( ( rule__NetworkInterface__HostAddressAssignment_3_0_1 ) ) ;
    public final void rule__NetworkInterface__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1774:1: ( ( ( rule__NetworkInterface__HostAddressAssignment_3_0_1 ) ) )
            // InternalTargetPlatform.g:1775:1: ( ( rule__NetworkInterface__HostAddressAssignment_3_0_1 ) )
            {
            // InternalTargetPlatform.g:1775:1: ( ( rule__NetworkInterface__HostAddressAssignment_3_0_1 ) )
            // InternalTargetPlatform.g:1776:2: ( rule__NetworkInterface__HostAddressAssignment_3_0_1 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getHostAddressAssignment_3_0_1()); 
            // InternalTargetPlatform.g:1777:2: ( rule__NetworkInterface__HostAddressAssignment_3_0_1 )
            // InternalTargetPlatform.g:1777:3: rule__NetworkInterface__HostAddressAssignment_3_0_1
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
    // InternalTargetPlatform.g:1785:1: rule__NetworkInterface__Group_3_0__2 : rule__NetworkInterface__Group_3_0__2__Impl ;
    public final void rule__NetworkInterface__Group_3_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1789:1: ( rule__NetworkInterface__Group_3_0__2__Impl )
            // InternalTargetPlatform.g:1790:2: rule__NetworkInterface__Group_3_0__2__Impl
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
    // InternalTargetPlatform.g:1796:1: rule__NetworkInterface__Group_3_0__2__Impl : ( ( rule__NetworkInterface__Group_3_0_2__0 )? ) ;
    public final void rule__NetworkInterface__Group_3_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1800:1: ( ( ( rule__NetworkInterface__Group_3_0_2__0 )? ) )
            // InternalTargetPlatform.g:1801:1: ( ( rule__NetworkInterface__Group_3_0_2__0 )? )
            {
            // InternalTargetPlatform.g:1801:1: ( ( rule__NetworkInterface__Group_3_0_2__0 )? )
            // InternalTargetPlatform.g:1802:2: ( rule__NetworkInterface__Group_3_0_2__0 )?
            {
             before(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0_2()); 
            // InternalTargetPlatform.g:1803:2: ( rule__NetworkInterface__Group_3_0_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalTargetPlatform.g:1803:3: rule__NetworkInterface__Group_3_0_2__0
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
    // InternalTargetPlatform.g:1812:1: rule__NetworkInterface__Group_3_0_2__0 : rule__NetworkInterface__Group_3_0_2__0__Impl rule__NetworkInterface__Group_3_0_2__1 ;
    public final void rule__NetworkInterface__Group_3_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1816:1: ( rule__NetworkInterface__Group_3_0_2__0__Impl rule__NetworkInterface__Group_3_0_2__1 )
            // InternalTargetPlatform.g:1817:2: rule__NetworkInterface__Group_3_0_2__0__Impl rule__NetworkInterface__Group_3_0_2__1
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
    // InternalTargetPlatform.g:1824:1: rule__NetworkInterface__Group_3_0_2__0__Impl : ( ':' ) ;
    public final void rule__NetworkInterface__Group_3_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1828:1: ( ( ':' ) )
            // InternalTargetPlatform.g:1829:1: ( ':' )
            {
            // InternalTargetPlatform.g:1829:1: ( ':' )
            // InternalTargetPlatform.g:1830:2: ':'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getColonKeyword_3_0_2_0()); 
            match(input,24,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1839:1: rule__NetworkInterface__Group_3_0_2__1 : rule__NetworkInterface__Group_3_0_2__1__Impl ;
    public final void rule__NetworkInterface__Group_3_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1843:1: ( rule__NetworkInterface__Group_3_0_2__1__Impl )
            // InternalTargetPlatform.g:1844:2: rule__NetworkInterface__Group_3_0_2__1__Impl
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
    // InternalTargetPlatform.g:1850:1: rule__NetworkInterface__Group_3_0_2__1__Impl : ( ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 ) ) ;
    public final void rule__NetworkInterface__Group_3_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1854:1: ( ( ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 ) ) )
            // InternalTargetPlatform.g:1855:1: ( ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 ) )
            {
            // InternalTargetPlatform.g:1855:1: ( ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 ) )
            // InternalTargetPlatform.g:1856:2: ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getPortNrAssignment_3_0_2_1()); 
            // InternalTargetPlatform.g:1857:2: ( rule__NetworkInterface__PortNrAssignment_3_0_2_1 )
            // InternalTargetPlatform.g:1857:3: rule__NetworkInterface__PortNrAssignment_3_0_2_1
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
    // InternalTargetPlatform.g:1866:1: rule__NetworkInterface__Group_3_1__0 : rule__NetworkInterface__Group_3_1__0__Impl rule__NetworkInterface__Group_3_1__1 ;
    public final void rule__NetworkInterface__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1870:1: ( rule__NetworkInterface__Group_3_1__0__Impl rule__NetworkInterface__Group_3_1__1 )
            // InternalTargetPlatform.g:1871:2: rule__NetworkInterface__Group_3_1__0__Impl rule__NetworkInterface__Group_3_1__1
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
    // InternalTargetPlatform.g:1878:1: rule__NetworkInterface__Group_3_1__0__Impl : ( 'Kind' ) ;
    public final void rule__NetworkInterface__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1882:1: ( ( 'Kind' ) )
            // InternalTargetPlatform.g:1883:1: ( 'Kind' )
            {
            // InternalTargetPlatform.g:1883:1: ( 'Kind' )
            // InternalTargetPlatform.g:1884:2: 'Kind'
            {
             before(grammarAccess.getNetworkInterfaceAccess().getKindKeyword_3_1_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1893:1: rule__NetworkInterface__Group_3_1__1 : rule__NetworkInterface__Group_3_1__1__Impl ;
    public final void rule__NetworkInterface__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1897:1: ( rule__NetworkInterface__Group_3_1__1__Impl )
            // InternalTargetPlatform.g:1898:2: rule__NetworkInterface__Group_3_1__1__Impl
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
    // InternalTargetPlatform.g:1904:1: rule__NetworkInterface__Group_3_1__1__Impl : ( ( rule__NetworkInterface__KindAssignment_3_1_1 ) ) ;
    public final void rule__NetworkInterface__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1908:1: ( ( ( rule__NetworkInterface__KindAssignment_3_1_1 ) ) )
            // InternalTargetPlatform.g:1909:1: ( ( rule__NetworkInterface__KindAssignment_3_1_1 ) )
            {
            // InternalTargetPlatform.g:1909:1: ( ( rule__NetworkInterface__KindAssignment_3_1_1 ) )
            // InternalTargetPlatform.g:1910:2: ( rule__NetworkInterface__KindAssignment_3_1_1 )
            {
             before(grammarAccess.getNetworkInterfaceAccess().getKindAssignment_3_1_1()); 
            // InternalTargetPlatform.g:1911:2: ( rule__NetworkInterface__KindAssignment_3_1_1 )
            // InternalTargetPlatform.g:1911:3: rule__NetworkInterface__KindAssignment_3_1_1
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
    // InternalTargetPlatform.g:1920:1: rule__CPU__Group__0 : rule__CPU__Group__0__Impl rule__CPU__Group__1 ;
    public final void rule__CPU__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1924:1: ( rule__CPU__Group__0__Impl rule__CPU__Group__1 )
            // InternalTargetPlatform.g:1925:2: rule__CPU__Group__0__Impl rule__CPU__Group__1
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
    // InternalTargetPlatform.g:1932:1: rule__CPU__Group__0__Impl : ( 'CPU' ) ;
    public final void rule__CPU__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1936:1: ( ( 'CPU' ) )
            // InternalTargetPlatform.g:1937:1: ( 'CPU' )
            {
            // InternalTargetPlatform.g:1937:1: ( 'CPU' )
            // InternalTargetPlatform.g:1938:2: 'CPU'
            {
             before(grammarAccess.getCPUAccess().getCPUKeyword_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalTargetPlatform.g:1947:1: rule__CPU__Group__1 : rule__CPU__Group__1__Impl rule__CPU__Group__2 ;
    public final void rule__CPU__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1951:1: ( rule__CPU__Group__1__Impl rule__CPU__Group__2 )
            // InternalTargetPlatform.g:1952:2: rule__CPU__Group__1__Impl rule__CPU__Group__2
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
    // InternalTargetPlatform.g:1959:1: rule__CPU__Group__1__Impl : ( ( rule__CPU__NameAssignment_1 ) ) ;
    public final void rule__CPU__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1963:1: ( ( ( rule__CPU__NameAssignment_1 ) ) )
            // InternalTargetPlatform.g:1964:1: ( ( rule__CPU__NameAssignment_1 ) )
            {
            // InternalTargetPlatform.g:1964:1: ( ( rule__CPU__NameAssignment_1 ) )
            // InternalTargetPlatform.g:1965:2: ( rule__CPU__NameAssignment_1 )
            {
             before(grammarAccess.getCPUAccess().getNameAssignment_1()); 
            // InternalTargetPlatform.g:1966:2: ( rule__CPU__NameAssignment_1 )
            // InternalTargetPlatform.g:1966:3: rule__CPU__NameAssignment_1
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
    // InternalTargetPlatform.g:1974:1: rule__CPU__Group__2 : rule__CPU__Group__2__Impl rule__CPU__Group__3 ;
    public final void rule__CPU__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1978:1: ( rule__CPU__Group__2__Impl rule__CPU__Group__3 )
            // InternalTargetPlatform.g:1979:2: rule__CPU__Group__2__Impl rule__CPU__Group__3
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
    // InternalTargetPlatform.g:1986:1: rule__CPU__Group__2__Impl : ( '{' ) ;
    public final void rule__CPU__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:1990:1: ( ( '{' ) )
            // InternalTargetPlatform.g:1991:1: ( '{' )
            {
            // InternalTargetPlatform.g:1991:1: ( '{' )
            // InternalTargetPlatform.g:1992:2: '{'
            {
             before(grammarAccess.getCPUAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2001:1: rule__CPU__Group__3 : rule__CPU__Group__3__Impl rule__CPU__Group__4 ;
    public final void rule__CPU__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2005:1: ( rule__CPU__Group__3__Impl rule__CPU__Group__4 )
            // InternalTargetPlatform.g:2006:2: rule__CPU__Group__3__Impl rule__CPU__Group__4
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
    // InternalTargetPlatform.g:2013:1: rule__CPU__Group__3__Impl : ( ( rule__CPU__UnorderedGroup_3 ) ) ;
    public final void rule__CPU__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2017:1: ( ( ( rule__CPU__UnorderedGroup_3 ) ) )
            // InternalTargetPlatform.g:2018:1: ( ( rule__CPU__UnorderedGroup_3 ) )
            {
            // InternalTargetPlatform.g:2018:1: ( ( rule__CPU__UnorderedGroup_3 ) )
            // InternalTargetPlatform.g:2019:2: ( rule__CPU__UnorderedGroup_3 )
            {
             before(grammarAccess.getCPUAccess().getUnorderedGroup_3()); 
            // InternalTargetPlatform.g:2020:2: ( rule__CPU__UnorderedGroup_3 )
            // InternalTargetPlatform.g:2020:3: rule__CPU__UnorderedGroup_3
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
    // InternalTargetPlatform.g:2028:1: rule__CPU__Group__4 : rule__CPU__Group__4__Impl ;
    public final void rule__CPU__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2032:1: ( rule__CPU__Group__4__Impl )
            // InternalTargetPlatform.g:2033:2: rule__CPU__Group__4__Impl
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
    // InternalTargetPlatform.g:2039:1: rule__CPU__Group__4__Impl : ( '}' ) ;
    public final void rule__CPU__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2043:1: ( ( '}' ) )
            // InternalTargetPlatform.g:2044:1: ( '}' )
            {
            // InternalTargetPlatform.g:2044:1: ( '}' )
            // InternalTargetPlatform.g:2045:2: '}'
            {
             before(grammarAccess.getCPUAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2055:1: rule__CPU__Group_3_0__0 : rule__CPU__Group_3_0__0__Impl rule__CPU__Group_3_0__1 ;
    public final void rule__CPU__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2059:1: ( rule__CPU__Group_3_0__0__Impl rule__CPU__Group_3_0__1 )
            // InternalTargetPlatform.g:2060:2: rule__CPU__Group_3_0__0__Impl rule__CPU__Group_3_0__1
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
    // InternalTargetPlatform.g:2067:1: rule__CPU__Group_3_0__0__Impl : ( 'Kind' ) ;
    public final void rule__CPU__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2071:1: ( ( 'Kind' ) )
            // InternalTargetPlatform.g:2072:1: ( 'Kind' )
            {
            // InternalTargetPlatform.g:2072:1: ( 'Kind' )
            // InternalTargetPlatform.g:2073:2: 'Kind'
            {
             before(grammarAccess.getCPUAccess().getKindKeyword_3_0_0()); 
            match(input,25,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2082:1: rule__CPU__Group_3_0__1 : rule__CPU__Group_3_0__1__Impl ;
    public final void rule__CPU__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2086:1: ( rule__CPU__Group_3_0__1__Impl )
            // InternalTargetPlatform.g:2087:2: rule__CPU__Group_3_0__1__Impl
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
    // InternalTargetPlatform.g:2093:1: rule__CPU__Group_3_0__1__Impl : ( ( rule__CPU__KindAssignment_3_0_1 ) ) ;
    public final void rule__CPU__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2097:1: ( ( ( rule__CPU__KindAssignment_3_0_1 ) ) )
            // InternalTargetPlatform.g:2098:1: ( ( rule__CPU__KindAssignment_3_0_1 ) )
            {
            // InternalTargetPlatform.g:2098:1: ( ( rule__CPU__KindAssignment_3_0_1 ) )
            // InternalTargetPlatform.g:2099:2: ( rule__CPU__KindAssignment_3_0_1 )
            {
             before(grammarAccess.getCPUAccess().getKindAssignment_3_0_1()); 
            // InternalTargetPlatform.g:2100:2: ( rule__CPU__KindAssignment_3_0_1 )
            // InternalTargetPlatform.g:2100:3: rule__CPU__KindAssignment_3_0_1
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
    // InternalTargetPlatform.g:2109:1: rule__CPU__Group_3_1__0 : rule__CPU__Group_3_1__0__Impl rule__CPU__Group_3_1__1 ;
    public final void rule__CPU__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2113:1: ( rule__CPU__Group_3_1__0__Impl rule__CPU__Group_3_1__1 )
            // InternalTargetPlatform.g:2114:2: rule__CPU__Group_3_1__0__Impl rule__CPU__Group_3_1__1
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
    // InternalTargetPlatform.g:2121:1: rule__CPU__Group_3_1__0__Impl : ( 'CoresTally' ) ;
    public final void rule__CPU__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2125:1: ( ( 'CoresTally' ) )
            // InternalTargetPlatform.g:2126:1: ( 'CoresTally' )
            {
            // InternalTargetPlatform.g:2126:1: ( 'CoresTally' )
            // InternalTargetPlatform.g:2127:2: 'CoresTally'
            {
             before(grammarAccess.getCPUAccess().getCoresTallyKeyword_3_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2136:1: rule__CPU__Group_3_1__1 : rule__CPU__Group_3_1__1__Impl ;
    public final void rule__CPU__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2140:1: ( rule__CPU__Group_3_1__1__Impl )
            // InternalTargetPlatform.g:2141:2: rule__CPU__Group_3_1__1__Impl
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
    // InternalTargetPlatform.g:2147:1: rule__CPU__Group_3_1__1__Impl : ( ( rule__CPU__CoresTallyAssignment_3_1_1 ) ) ;
    public final void rule__CPU__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2151:1: ( ( ( rule__CPU__CoresTallyAssignment_3_1_1 ) ) )
            // InternalTargetPlatform.g:2152:1: ( ( rule__CPU__CoresTallyAssignment_3_1_1 ) )
            {
            // InternalTargetPlatform.g:2152:1: ( ( rule__CPU__CoresTallyAssignment_3_1_1 ) )
            // InternalTargetPlatform.g:2153:2: ( rule__CPU__CoresTallyAssignment_3_1_1 )
            {
             before(grammarAccess.getCPUAccess().getCoresTallyAssignment_3_1_1()); 
            // InternalTargetPlatform.g:2154:2: ( rule__CPU__CoresTallyAssignment_3_1_1 )
            // InternalTargetPlatform.g:2154:3: rule__CPU__CoresTallyAssignment_3_1_1
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
    // InternalTargetPlatform.g:2163:1: rule__LoginAccount__Group__0 : rule__LoginAccount__Group__0__Impl rule__LoginAccount__Group__1 ;
    public final void rule__LoginAccount__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2167:1: ( rule__LoginAccount__Group__0__Impl rule__LoginAccount__Group__1 )
            // InternalTargetPlatform.g:2168:2: rule__LoginAccount__Group__0__Impl rule__LoginAccount__Group__1
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
    // InternalTargetPlatform.g:2175:1: rule__LoginAccount__Group__0__Impl : ( 'LoginAccount' ) ;
    public final void rule__LoginAccount__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2179:1: ( ( 'LoginAccount' ) )
            // InternalTargetPlatform.g:2180:1: ( 'LoginAccount' )
            {
            // InternalTargetPlatform.g:2180:1: ( 'LoginAccount' )
            // InternalTargetPlatform.g:2181:2: 'LoginAccount'
            {
             before(grammarAccess.getLoginAccountAccess().getLoginAccountKeyword_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2190:1: rule__LoginAccount__Group__1 : rule__LoginAccount__Group__1__Impl rule__LoginAccount__Group__2 ;
    public final void rule__LoginAccount__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2194:1: ( rule__LoginAccount__Group__1__Impl rule__LoginAccount__Group__2 )
            // InternalTargetPlatform.g:2195:2: rule__LoginAccount__Group__1__Impl rule__LoginAccount__Group__2
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
    // InternalTargetPlatform.g:2202:1: rule__LoginAccount__Group__1__Impl : ( ( rule__LoginAccount__NameAssignment_1 ) ) ;
    public final void rule__LoginAccount__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2206:1: ( ( ( rule__LoginAccount__NameAssignment_1 ) ) )
            // InternalTargetPlatform.g:2207:1: ( ( rule__LoginAccount__NameAssignment_1 ) )
            {
            // InternalTargetPlatform.g:2207:1: ( ( rule__LoginAccount__NameAssignment_1 ) )
            // InternalTargetPlatform.g:2208:2: ( rule__LoginAccount__NameAssignment_1 )
            {
             before(grammarAccess.getLoginAccountAccess().getNameAssignment_1()); 
            // InternalTargetPlatform.g:2209:2: ( rule__LoginAccount__NameAssignment_1 )
            // InternalTargetPlatform.g:2209:3: rule__LoginAccount__NameAssignment_1
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
    // InternalTargetPlatform.g:2217:1: rule__LoginAccount__Group__2 : rule__LoginAccount__Group__2__Impl rule__LoginAccount__Group__3 ;
    public final void rule__LoginAccount__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2221:1: ( rule__LoginAccount__Group__2__Impl rule__LoginAccount__Group__3 )
            // InternalTargetPlatform.g:2222:2: rule__LoginAccount__Group__2__Impl rule__LoginAccount__Group__3
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
    // InternalTargetPlatform.g:2229:1: rule__LoginAccount__Group__2__Impl : ( '{' ) ;
    public final void rule__LoginAccount__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2233:1: ( ( '{' ) )
            // InternalTargetPlatform.g:2234:1: ( '{' )
            {
            // InternalTargetPlatform.g:2234:1: ( '{' )
            // InternalTargetPlatform.g:2235:2: '{'
            {
             before(grammarAccess.getLoginAccountAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2244:1: rule__LoginAccount__Group__3 : rule__LoginAccount__Group__3__Impl rule__LoginAccount__Group__4 ;
    public final void rule__LoginAccount__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2248:1: ( rule__LoginAccount__Group__3__Impl rule__LoginAccount__Group__4 )
            // InternalTargetPlatform.g:2249:2: rule__LoginAccount__Group__3__Impl rule__LoginAccount__Group__4
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
    // InternalTargetPlatform.g:2256:1: rule__LoginAccount__Group__3__Impl : ( ( rule__LoginAccount__UnorderedGroup_3 ) ) ;
    public final void rule__LoginAccount__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2260:1: ( ( ( rule__LoginAccount__UnorderedGroup_3 ) ) )
            // InternalTargetPlatform.g:2261:1: ( ( rule__LoginAccount__UnorderedGroup_3 ) )
            {
            // InternalTargetPlatform.g:2261:1: ( ( rule__LoginAccount__UnorderedGroup_3 ) )
            // InternalTargetPlatform.g:2262:2: ( rule__LoginAccount__UnorderedGroup_3 )
            {
             before(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3()); 
            // InternalTargetPlatform.g:2263:2: ( rule__LoginAccount__UnorderedGroup_3 )
            // InternalTargetPlatform.g:2263:3: rule__LoginAccount__UnorderedGroup_3
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
    // InternalTargetPlatform.g:2271:1: rule__LoginAccount__Group__4 : rule__LoginAccount__Group__4__Impl ;
    public final void rule__LoginAccount__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2275:1: ( rule__LoginAccount__Group__4__Impl )
            // InternalTargetPlatform.g:2276:2: rule__LoginAccount__Group__4__Impl
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
    // InternalTargetPlatform.g:2282:1: rule__LoginAccount__Group__4__Impl : ( '}' ) ;
    public final void rule__LoginAccount__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2286:1: ( ( '}' ) )
            // InternalTargetPlatform.g:2287:1: ( '}' )
            {
            // InternalTargetPlatform.g:2287:1: ( '}' )
            // InternalTargetPlatform.g:2288:2: '}'
            {
             before(grammarAccess.getLoginAccountAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2298:1: rule__LoginAccount__Group_3_0__0 : rule__LoginAccount__Group_3_0__0__Impl rule__LoginAccount__Group_3_0__1 ;
    public final void rule__LoginAccount__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2302:1: ( rule__LoginAccount__Group_3_0__0__Impl rule__LoginAccount__Group_3_0__1 )
            // InternalTargetPlatform.g:2303:2: rule__LoginAccount__Group_3_0__0__Impl rule__LoginAccount__Group_3_0__1
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
    // InternalTargetPlatform.g:2310:1: rule__LoginAccount__Group_3_0__0__Impl : ( 'FullName' ) ;
    public final void rule__LoginAccount__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2314:1: ( ( 'FullName' ) )
            // InternalTargetPlatform.g:2315:1: ( 'FullName' )
            {
            // InternalTargetPlatform.g:2315:1: ( 'FullName' )
            // InternalTargetPlatform.g:2316:2: 'FullName'
            {
             before(grammarAccess.getLoginAccountAccess().getFullNameKeyword_3_0_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2325:1: rule__LoginAccount__Group_3_0__1 : rule__LoginAccount__Group_3_0__1__Impl ;
    public final void rule__LoginAccount__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2329:1: ( rule__LoginAccount__Group_3_0__1__Impl )
            // InternalTargetPlatform.g:2330:2: rule__LoginAccount__Group_3_0__1__Impl
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
    // InternalTargetPlatform.g:2336:1: rule__LoginAccount__Group_3_0__1__Impl : ( ( rule__LoginAccount__FullnameAssignment_3_0_1 ) ) ;
    public final void rule__LoginAccount__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2340:1: ( ( ( rule__LoginAccount__FullnameAssignment_3_0_1 ) ) )
            // InternalTargetPlatform.g:2341:1: ( ( rule__LoginAccount__FullnameAssignment_3_0_1 ) )
            {
            // InternalTargetPlatform.g:2341:1: ( ( rule__LoginAccount__FullnameAssignment_3_0_1 ) )
            // InternalTargetPlatform.g:2342:2: ( rule__LoginAccount__FullnameAssignment_3_0_1 )
            {
             before(grammarAccess.getLoginAccountAccess().getFullnameAssignment_3_0_1()); 
            // InternalTargetPlatform.g:2343:2: ( rule__LoginAccount__FullnameAssignment_3_0_1 )
            // InternalTargetPlatform.g:2343:3: rule__LoginAccount__FullnameAssignment_3_0_1
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
    // InternalTargetPlatform.g:2352:1: rule__LoginAccount__Group_3_1__0 : rule__LoginAccount__Group_3_1__0__Impl rule__LoginAccount__Group_3_1__1 ;
    public final void rule__LoginAccount__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2356:1: ( rule__LoginAccount__Group_3_1__0__Impl rule__LoginAccount__Group_3_1__1 )
            // InternalTargetPlatform.g:2357:2: rule__LoginAccount__Group_3_1__0__Impl rule__LoginAccount__Group_3_1__1
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
    // InternalTargetPlatform.g:2364:1: rule__LoginAccount__Group_3_1__0__Impl : ( 'Email' ) ;
    public final void rule__LoginAccount__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2368:1: ( ( 'Email' ) )
            // InternalTargetPlatform.g:2369:1: ( 'Email' )
            {
            // InternalTargetPlatform.g:2369:1: ( 'Email' )
            // InternalTargetPlatform.g:2370:2: 'Email'
            {
             before(grammarAccess.getLoginAccountAccess().getEmailKeyword_3_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2379:1: rule__LoginAccount__Group_3_1__1 : rule__LoginAccount__Group_3_1__1__Impl ;
    public final void rule__LoginAccount__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2383:1: ( rule__LoginAccount__Group_3_1__1__Impl )
            // InternalTargetPlatform.g:2384:2: rule__LoginAccount__Group_3_1__1__Impl
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
    // InternalTargetPlatform.g:2390:1: rule__LoginAccount__Group_3_1__1__Impl : ( ( rule__LoginAccount__EmailAssignment_3_1_1 ) ) ;
    public final void rule__LoginAccount__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2394:1: ( ( ( rule__LoginAccount__EmailAssignment_3_1_1 ) ) )
            // InternalTargetPlatform.g:2395:1: ( ( rule__LoginAccount__EmailAssignment_3_1_1 ) )
            {
            // InternalTargetPlatform.g:2395:1: ( ( rule__LoginAccount__EmailAssignment_3_1_1 ) )
            // InternalTargetPlatform.g:2396:2: ( rule__LoginAccount__EmailAssignment_3_1_1 )
            {
             before(grammarAccess.getLoginAccountAccess().getEmailAssignment_3_1_1()); 
            // InternalTargetPlatform.g:2397:2: ( rule__LoginAccount__EmailAssignment_3_1_1 )
            // InternalTargetPlatform.g:2397:3: rule__LoginAccount__EmailAssignment_3_1_1
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
    // InternalTargetPlatform.g:2406:1: rule__TargetMiddleware__Group__0 : rule__TargetMiddleware__Group__0__Impl rule__TargetMiddleware__Group__1 ;
    public final void rule__TargetMiddleware__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2410:1: ( rule__TargetMiddleware__Group__0__Impl rule__TargetMiddleware__Group__1 )
            // InternalTargetPlatform.g:2411:2: rule__TargetMiddleware__Group__0__Impl rule__TargetMiddleware__Group__1
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
    // InternalTargetPlatform.g:2418:1: rule__TargetMiddleware__Group__0__Impl : ( 'TargetMiddleware' ) ;
    public final void rule__TargetMiddleware__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2422:1: ( ( 'TargetMiddleware' ) )
            // InternalTargetPlatform.g:2423:1: ( 'TargetMiddleware' )
            {
            // InternalTargetPlatform.g:2423:1: ( 'TargetMiddleware' )
            // InternalTargetPlatform.g:2424:2: 'TargetMiddleware'
            {
             before(grammarAccess.getTargetMiddlewareAccess().getTargetMiddlewareKeyword_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2433:1: rule__TargetMiddleware__Group__1 : rule__TargetMiddleware__Group__1__Impl rule__TargetMiddleware__Group__2 ;
    public final void rule__TargetMiddleware__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2437:1: ( rule__TargetMiddleware__Group__1__Impl rule__TargetMiddleware__Group__2 )
            // InternalTargetPlatform.g:2438:2: rule__TargetMiddleware__Group__1__Impl rule__TargetMiddleware__Group__2
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
    // InternalTargetPlatform.g:2445:1: rule__TargetMiddleware__Group__1__Impl : ( ( rule__TargetMiddleware__MiddlewareAssignment_1 ) ) ;
    public final void rule__TargetMiddleware__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2449:1: ( ( ( rule__TargetMiddleware__MiddlewareAssignment_1 ) ) )
            // InternalTargetPlatform.g:2450:1: ( ( rule__TargetMiddleware__MiddlewareAssignment_1 ) )
            {
            // InternalTargetPlatform.g:2450:1: ( ( rule__TargetMiddleware__MiddlewareAssignment_1 ) )
            // InternalTargetPlatform.g:2451:2: ( rule__TargetMiddleware__MiddlewareAssignment_1 )
            {
             before(grammarAccess.getTargetMiddlewareAccess().getMiddlewareAssignment_1()); 
            // InternalTargetPlatform.g:2452:2: ( rule__TargetMiddleware__MiddlewareAssignment_1 )
            // InternalTargetPlatform.g:2452:3: rule__TargetMiddleware__MiddlewareAssignment_1
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
    // InternalTargetPlatform.g:2460:1: rule__TargetMiddleware__Group__2 : rule__TargetMiddleware__Group__2__Impl ;
    public final void rule__TargetMiddleware__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2464:1: ( rule__TargetMiddleware__Group__2__Impl )
            // InternalTargetPlatform.g:2465:2: rule__TargetMiddleware__Group__2__Impl
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
    // InternalTargetPlatform.g:2471:1: rule__TargetMiddleware__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__TargetMiddleware__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2475:1: ( ( ( ';' )? ) )
            // InternalTargetPlatform.g:2476:1: ( ( ';' )? )
            {
            // InternalTargetPlatform.g:2476:1: ( ( ';' )? )
            // InternalTargetPlatform.g:2477:2: ( ';' )?
            {
             before(grammarAccess.getTargetMiddlewareAccess().getSemicolonKeyword_2()); 
            // InternalTargetPlatform.g:2478:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==19) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalTargetPlatform.g:2478:3: ';'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalTargetPlatform.g:2487:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2491:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalTargetPlatform.g:2492:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
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
    // InternalTargetPlatform.g:2499:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2503:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:2504:1: ( RULE_ID )
            {
            // InternalTargetPlatform.g:2504:1: ( RULE_ID )
            // InternalTargetPlatform.g:2505:2: RULE_ID
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
    // InternalTargetPlatform.g:2514:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2518:1: ( rule__FQN__Group__1__Impl )
            // InternalTargetPlatform.g:2519:2: rule__FQN__Group__1__Impl
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
    // InternalTargetPlatform.g:2525:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2529:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalTargetPlatform.g:2530:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalTargetPlatform.g:2530:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalTargetPlatform.g:2531:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalTargetPlatform.g:2532:2: ( rule__FQN__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==32) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalTargetPlatform.g:2532:3: rule__FQN__Group_1__0
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
    // InternalTargetPlatform.g:2541:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2545:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalTargetPlatform.g:2546:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalTargetPlatform.g:2553:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2557:1: ( ( '.' ) )
            // InternalTargetPlatform.g:2558:1: ( '.' )
            {
            // InternalTargetPlatform.g:2558:1: ( '.' )
            // InternalTargetPlatform.g:2559:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2568:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2572:1: ( rule__FQN__Group_1__1__Impl )
            // InternalTargetPlatform.g:2573:2: rule__FQN__Group_1__1__Impl
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
    // InternalTargetPlatform.g:2579:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2583:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:2584:1: ( RULE_ID )
            {
            // InternalTargetPlatform.g:2584:1: ( RULE_ID )
            // InternalTargetPlatform.g:2585:2: RULE_ID
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
    // InternalTargetPlatform.g:2595:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2599:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalTargetPlatform.g:2600:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalTargetPlatform.g:2607:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2611:1: ( ( ( '-' )? ) )
            // InternalTargetPlatform.g:2612:1: ( ( '-' )? )
            {
            // InternalTargetPlatform.g:2612:1: ( ( '-' )? )
            // InternalTargetPlatform.g:2613:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalTargetPlatform.g:2614:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalTargetPlatform.g:2614:3: '-'
                    {
                    match(input,33,FOLLOW_2); 

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
    // InternalTargetPlatform.g:2622:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2626:1: ( rule__EInt__Group__1__Impl )
            // InternalTargetPlatform.g:2627:2: rule__EInt__Group__1__Impl
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
    // InternalTargetPlatform.g:2633:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2637:1: ( ( RULE_INT ) )
            // InternalTargetPlatform.g:2638:1: ( RULE_INT )
            {
            // InternalTargetPlatform.g:2638:1: ( RULE_INT )
            // InternalTargetPlatform.g:2639:2: RULE_INT
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
    // InternalTargetPlatform.g:2649:1: rule__ACE_SmartSoft__Group__0 : rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 ;
    public final void rule__ACE_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2653:1: ( rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1 )
            // InternalTargetPlatform.g:2654:2: rule__ACE_SmartSoft__Group__0__Impl rule__ACE_SmartSoft__Group__1
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
    // InternalTargetPlatform.g:2661:1: rule__ACE_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__ACE_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2665:1: ( ( () ) )
            // InternalTargetPlatform.g:2666:1: ( () )
            {
            // InternalTargetPlatform.g:2666:1: ( () )
            // InternalTargetPlatform.g:2667:2: ()
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftAction_0()); 
            // InternalTargetPlatform.g:2668:2: ()
            // InternalTargetPlatform.g:2668:3: 
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
    // InternalTargetPlatform.g:2676:1: rule__ACE_SmartSoft__Group__1 : rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 ;
    public final void rule__ACE_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2680:1: ( rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2 )
            // InternalTargetPlatform.g:2681:2: rule__ACE_SmartSoft__Group__1__Impl rule__ACE_SmartSoft__Group__2
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
    // InternalTargetPlatform.g:2688:1: rule__ACE_SmartSoft__Group__1__Impl : ( 'ACE_SmartSoft' ) ;
    public final void rule__ACE_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2692:1: ( ( 'ACE_SmartSoft' ) )
            // InternalTargetPlatform.g:2693:1: ( 'ACE_SmartSoft' )
            {
            // InternalTargetPlatform.g:2693:1: ( 'ACE_SmartSoft' )
            // InternalTargetPlatform.g:2694:2: 'ACE_SmartSoft'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getACE_SmartSoftKeyword_1()); 
            match(input,34,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2703:1: rule__ACE_SmartSoft__Group__2 : rule__ACE_SmartSoft__Group__2__Impl ;
    public final void rule__ACE_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2707:1: ( rule__ACE_SmartSoft__Group__2__Impl )
            // InternalTargetPlatform.g:2708:2: rule__ACE_SmartSoft__Group__2__Impl
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
    // InternalTargetPlatform.g:2714:1: rule__ACE_SmartSoft__Group__2__Impl : ( ( rule__ACE_SmartSoft__Group_2__0 )? ) ;
    public final void rule__ACE_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2718:1: ( ( ( rule__ACE_SmartSoft__Group_2__0 )? ) )
            // InternalTargetPlatform.g:2719:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            {
            // InternalTargetPlatform.g:2719:1: ( ( rule__ACE_SmartSoft__Group_2__0 )? )
            // InternalTargetPlatform.g:2720:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getACE_SmartSoftAccess().getGroup_2()); 
            // InternalTargetPlatform.g:2721:2: ( rule__ACE_SmartSoft__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalTargetPlatform.g:2721:3: rule__ACE_SmartSoft__Group_2__0
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
    // InternalTargetPlatform.g:2730:1: rule__ACE_SmartSoft__Group_2__0 : rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 ;
    public final void rule__ACE_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2734:1: ( rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1 )
            // InternalTargetPlatform.g:2735:2: rule__ACE_SmartSoft__Group_2__0__Impl rule__ACE_SmartSoft__Group_2__1
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
    // InternalTargetPlatform.g:2742:1: rule__ACE_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__ACE_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2746:1: ( ( 'description' ) )
            // InternalTargetPlatform.g:2747:1: ( 'description' )
            {
            // InternalTargetPlatform.g:2747:1: ( 'description' )
            // InternalTargetPlatform.g:2748:2: 'description'
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2757:1: rule__ACE_SmartSoft__Group_2__1 : rule__ACE_SmartSoft__Group_2__1__Impl ;
    public final void rule__ACE_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2761:1: ( rule__ACE_SmartSoft__Group_2__1__Impl )
            // InternalTargetPlatform.g:2762:2: rule__ACE_SmartSoft__Group_2__1__Impl
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
    // InternalTargetPlatform.g:2768:1: rule__ACE_SmartSoft__Group_2__1__Impl : ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__ACE_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2772:1: ( ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalTargetPlatform.g:2773:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalTargetPlatform.g:2773:1: ( ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalTargetPlatform.g:2774:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getACE_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalTargetPlatform.g:2775:2: ( rule__ACE_SmartSoft__DescriptionAssignment_2_1 )
            // InternalTargetPlatform.g:2775:3: rule__ACE_SmartSoft__DescriptionAssignment_2_1
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
    // InternalTargetPlatform.g:2784:1: rule__OpcUa_SeRoNet__Group__0 : rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 ;
    public final void rule__OpcUa_SeRoNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2788:1: ( rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1 )
            // InternalTargetPlatform.g:2789:2: rule__OpcUa_SeRoNet__Group__0__Impl rule__OpcUa_SeRoNet__Group__1
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
    // InternalTargetPlatform.g:2796:1: rule__OpcUa_SeRoNet__Group__0__Impl : ( () ) ;
    public final void rule__OpcUa_SeRoNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2800:1: ( ( () ) )
            // InternalTargetPlatform.g:2801:1: ( () )
            {
            // InternalTargetPlatform.g:2801:1: ( () )
            // InternalTargetPlatform.g:2802:2: ()
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetAction_0()); 
            // InternalTargetPlatform.g:2803:2: ()
            // InternalTargetPlatform.g:2803:3: 
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
    // InternalTargetPlatform.g:2811:1: rule__OpcUa_SeRoNet__Group__1 : rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 ;
    public final void rule__OpcUa_SeRoNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2815:1: ( rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2 )
            // InternalTargetPlatform.g:2816:2: rule__OpcUa_SeRoNet__Group__1__Impl rule__OpcUa_SeRoNet__Group__2
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
    // InternalTargetPlatform.g:2823:1: rule__OpcUa_SeRoNet__Group__1__Impl : ( 'OpcUa_SeRoNet' ) ;
    public final void rule__OpcUa_SeRoNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2827:1: ( ( 'OpcUa_SeRoNet' ) )
            // InternalTargetPlatform.g:2828:1: ( 'OpcUa_SeRoNet' )
            {
            // InternalTargetPlatform.g:2828:1: ( 'OpcUa_SeRoNet' )
            // InternalTargetPlatform.g:2829:2: 'OpcUa_SeRoNet'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getOpcUa_SeRoNetKeyword_1()); 
            match(input,36,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2838:1: rule__OpcUa_SeRoNet__Group__2 : rule__OpcUa_SeRoNet__Group__2__Impl ;
    public final void rule__OpcUa_SeRoNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2842:1: ( rule__OpcUa_SeRoNet__Group__2__Impl )
            // InternalTargetPlatform.g:2843:2: rule__OpcUa_SeRoNet__Group__2__Impl
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
    // InternalTargetPlatform.g:2849:1: rule__OpcUa_SeRoNet__Group__2__Impl : ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) ;
    public final void rule__OpcUa_SeRoNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2853:1: ( ( ( rule__OpcUa_SeRoNet__Group_2__0 )? ) )
            // InternalTargetPlatform.g:2854:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            {
            // InternalTargetPlatform.g:2854:1: ( ( rule__OpcUa_SeRoNet__Group_2__0 )? )
            // InternalTargetPlatform.g:2855:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getGroup_2()); 
            // InternalTargetPlatform.g:2856:2: ( rule__OpcUa_SeRoNet__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalTargetPlatform.g:2856:3: rule__OpcUa_SeRoNet__Group_2__0
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
    // InternalTargetPlatform.g:2865:1: rule__OpcUa_SeRoNet__Group_2__0 : rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 ;
    public final void rule__OpcUa_SeRoNet__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2869:1: ( rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1 )
            // InternalTargetPlatform.g:2870:2: rule__OpcUa_SeRoNet__Group_2__0__Impl rule__OpcUa_SeRoNet__Group_2__1
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
    // InternalTargetPlatform.g:2877:1: rule__OpcUa_SeRoNet__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2881:1: ( ( 'description' ) )
            // InternalTargetPlatform.g:2882:1: ( 'description' )
            {
            // InternalTargetPlatform.g:2882:1: ( 'description' )
            // InternalTargetPlatform.g:2883:2: 'description'
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2892:1: rule__OpcUa_SeRoNet__Group_2__1 : rule__OpcUa_SeRoNet__Group_2__1__Impl ;
    public final void rule__OpcUa_SeRoNet__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2896:1: ( rule__OpcUa_SeRoNet__Group_2__1__Impl )
            // InternalTargetPlatform.g:2897:2: rule__OpcUa_SeRoNet__Group_2__1__Impl
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
    // InternalTargetPlatform.g:2903:1: rule__OpcUa_SeRoNet__Group_2__1__Impl : ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) ;
    public final void rule__OpcUa_SeRoNet__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2907:1: ( ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) ) )
            // InternalTargetPlatform.g:2908:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            {
            // InternalTargetPlatform.g:2908:1: ( ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 ) )
            // InternalTargetPlatform.g:2909:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getOpcUa_SeRoNetAccess().getDescriptionAssignment_2_1()); 
            // InternalTargetPlatform.g:2910:2: ( rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 )
            // InternalTargetPlatform.g:2910:3: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1
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
    // InternalTargetPlatform.g:2919:1: rule__CORBA_SmartSoft__Group__0 : rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 ;
    public final void rule__CORBA_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2923:1: ( rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1 )
            // InternalTargetPlatform.g:2924:2: rule__CORBA_SmartSoft__Group__0__Impl rule__CORBA_SmartSoft__Group__1
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
    // InternalTargetPlatform.g:2931:1: rule__CORBA_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__CORBA_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2935:1: ( ( () ) )
            // InternalTargetPlatform.g:2936:1: ( () )
            {
            // InternalTargetPlatform.g:2936:1: ( () )
            // InternalTargetPlatform.g:2937:2: ()
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftAction_0()); 
            // InternalTargetPlatform.g:2938:2: ()
            // InternalTargetPlatform.g:2938:3: 
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
    // InternalTargetPlatform.g:2946:1: rule__CORBA_SmartSoft__Group__1 : rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 ;
    public final void rule__CORBA_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2950:1: ( rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2 )
            // InternalTargetPlatform.g:2951:2: rule__CORBA_SmartSoft__Group__1__Impl rule__CORBA_SmartSoft__Group__2
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
    // InternalTargetPlatform.g:2958:1: rule__CORBA_SmartSoft__Group__1__Impl : ( 'CORBA_SmartSoft' ) ;
    public final void rule__CORBA_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2962:1: ( ( 'CORBA_SmartSoft' ) )
            // InternalTargetPlatform.g:2963:1: ( 'CORBA_SmartSoft' )
            {
            // InternalTargetPlatform.g:2963:1: ( 'CORBA_SmartSoft' )
            // InternalTargetPlatform.g:2964:2: 'CORBA_SmartSoft'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getCORBA_SmartSoftKeyword_1()); 
            match(input,37,FOLLOW_2); 
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
    // InternalTargetPlatform.g:2973:1: rule__CORBA_SmartSoft__Group__2 : rule__CORBA_SmartSoft__Group__2__Impl ;
    public final void rule__CORBA_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2977:1: ( rule__CORBA_SmartSoft__Group__2__Impl )
            // InternalTargetPlatform.g:2978:2: rule__CORBA_SmartSoft__Group__2__Impl
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
    // InternalTargetPlatform.g:2984:1: rule__CORBA_SmartSoft__Group__2__Impl : ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) ;
    public final void rule__CORBA_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:2988:1: ( ( ( rule__CORBA_SmartSoft__Group_2__0 )? ) )
            // InternalTargetPlatform.g:2989:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            {
            // InternalTargetPlatform.g:2989:1: ( ( rule__CORBA_SmartSoft__Group_2__0 )? )
            // InternalTargetPlatform.g:2990:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getGroup_2()); 
            // InternalTargetPlatform.g:2991:2: ( rule__CORBA_SmartSoft__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalTargetPlatform.g:2991:3: rule__CORBA_SmartSoft__Group_2__0
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
    // InternalTargetPlatform.g:3000:1: rule__CORBA_SmartSoft__Group_2__0 : rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 ;
    public final void rule__CORBA_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3004:1: ( rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1 )
            // InternalTargetPlatform.g:3005:2: rule__CORBA_SmartSoft__Group_2__0__Impl rule__CORBA_SmartSoft__Group_2__1
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
    // InternalTargetPlatform.g:3012:1: rule__CORBA_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__CORBA_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3016:1: ( ( 'description' ) )
            // InternalTargetPlatform.g:3017:1: ( 'description' )
            {
            // InternalTargetPlatform.g:3017:1: ( 'description' )
            // InternalTargetPlatform.g:3018:2: 'description'
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTargetPlatform.g:3027:1: rule__CORBA_SmartSoft__Group_2__1 : rule__CORBA_SmartSoft__Group_2__1__Impl ;
    public final void rule__CORBA_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3031:1: ( rule__CORBA_SmartSoft__Group_2__1__Impl )
            // InternalTargetPlatform.g:3032:2: rule__CORBA_SmartSoft__Group_2__1__Impl
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
    // InternalTargetPlatform.g:3038:1: rule__CORBA_SmartSoft__Group_2__1__Impl : ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__CORBA_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3042:1: ( ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalTargetPlatform.g:3043:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalTargetPlatform.g:3043:1: ( ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalTargetPlatform.g:3044:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getCORBA_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalTargetPlatform.g:3045:2: ( rule__CORBA_SmartSoft__DescriptionAssignment_2_1 )
            // InternalTargetPlatform.g:3045:3: rule__CORBA_SmartSoft__DescriptionAssignment_2_1
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
    // InternalTargetPlatform.g:3054:1: rule__DDS_SmartSoft__Group__0 : rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 ;
    public final void rule__DDS_SmartSoft__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3058:1: ( rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1 )
            // InternalTargetPlatform.g:3059:2: rule__DDS_SmartSoft__Group__0__Impl rule__DDS_SmartSoft__Group__1
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
    // InternalTargetPlatform.g:3066:1: rule__DDS_SmartSoft__Group__0__Impl : ( () ) ;
    public final void rule__DDS_SmartSoft__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3070:1: ( ( () ) )
            // InternalTargetPlatform.g:3071:1: ( () )
            {
            // InternalTargetPlatform.g:3071:1: ( () )
            // InternalTargetPlatform.g:3072:2: ()
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftAction_0()); 
            // InternalTargetPlatform.g:3073:2: ()
            // InternalTargetPlatform.g:3073:3: 
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
    // InternalTargetPlatform.g:3081:1: rule__DDS_SmartSoft__Group__1 : rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 ;
    public final void rule__DDS_SmartSoft__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3085:1: ( rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2 )
            // InternalTargetPlatform.g:3086:2: rule__DDS_SmartSoft__Group__1__Impl rule__DDS_SmartSoft__Group__2
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
    // InternalTargetPlatform.g:3093:1: rule__DDS_SmartSoft__Group__1__Impl : ( 'DDS_SmartSoft' ) ;
    public final void rule__DDS_SmartSoft__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3097:1: ( ( 'DDS_SmartSoft' ) )
            // InternalTargetPlatform.g:3098:1: ( 'DDS_SmartSoft' )
            {
            // InternalTargetPlatform.g:3098:1: ( 'DDS_SmartSoft' )
            // InternalTargetPlatform.g:3099:2: 'DDS_SmartSoft'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDDS_SmartSoftKeyword_1()); 
            match(input,38,FOLLOW_2); 
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
    // InternalTargetPlatform.g:3108:1: rule__DDS_SmartSoft__Group__2 : rule__DDS_SmartSoft__Group__2__Impl ;
    public final void rule__DDS_SmartSoft__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3112:1: ( rule__DDS_SmartSoft__Group__2__Impl )
            // InternalTargetPlatform.g:3113:2: rule__DDS_SmartSoft__Group__2__Impl
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
    // InternalTargetPlatform.g:3119:1: rule__DDS_SmartSoft__Group__2__Impl : ( ( rule__DDS_SmartSoft__Group_2__0 )? ) ;
    public final void rule__DDS_SmartSoft__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3123:1: ( ( ( rule__DDS_SmartSoft__Group_2__0 )? ) )
            // InternalTargetPlatform.g:3124:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            {
            // InternalTargetPlatform.g:3124:1: ( ( rule__DDS_SmartSoft__Group_2__0 )? )
            // InternalTargetPlatform.g:3125:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getGroup_2()); 
            // InternalTargetPlatform.g:3126:2: ( rule__DDS_SmartSoft__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalTargetPlatform.g:3126:3: rule__DDS_SmartSoft__Group_2__0
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
    // InternalTargetPlatform.g:3135:1: rule__DDS_SmartSoft__Group_2__0 : rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 ;
    public final void rule__DDS_SmartSoft__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3139:1: ( rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1 )
            // InternalTargetPlatform.g:3140:2: rule__DDS_SmartSoft__Group_2__0__Impl rule__DDS_SmartSoft__Group_2__1
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
    // InternalTargetPlatform.g:3147:1: rule__DDS_SmartSoft__Group_2__0__Impl : ( 'description' ) ;
    public final void rule__DDS_SmartSoft__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3151:1: ( ( 'description' ) )
            // InternalTargetPlatform.g:3152:1: ( 'description' )
            {
            // InternalTargetPlatform.g:3152:1: ( 'description' )
            // InternalTargetPlatform.g:3153:2: 'description'
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionKeyword_2_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalTargetPlatform.g:3162:1: rule__DDS_SmartSoft__Group_2__1 : rule__DDS_SmartSoft__Group_2__1__Impl ;
    public final void rule__DDS_SmartSoft__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3166:1: ( rule__DDS_SmartSoft__Group_2__1__Impl )
            // InternalTargetPlatform.g:3167:2: rule__DDS_SmartSoft__Group_2__1__Impl
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
    // InternalTargetPlatform.g:3173:1: rule__DDS_SmartSoft__Group_2__1__Impl : ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) ;
    public final void rule__DDS_SmartSoft__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3177:1: ( ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) ) )
            // InternalTargetPlatform.g:3178:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            {
            // InternalTargetPlatform.g:3178:1: ( ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 ) )
            // InternalTargetPlatform.g:3179:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            {
             before(grammarAccess.getDDS_SmartSoftAccess().getDescriptionAssignment_2_1()); 
            // InternalTargetPlatform.g:3180:2: ( rule__DDS_SmartSoft__DescriptionAssignment_2_1 )
            // InternalTargetPlatform.g:3180:3: rule__DDS_SmartSoft__DescriptionAssignment_2_1
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
    // InternalTargetPlatform.g:3189:1: rule__NetworkInterface__UnorderedGroup_3 : rule__NetworkInterface__UnorderedGroup_3__0 {...}?;
    public final void rule__NetworkInterface__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3());
        	
        try {
            // InternalTargetPlatform.g:3194:1: ( rule__NetworkInterface__UnorderedGroup_3__0 {...}?)
            // InternalTargetPlatform.g:3195:2: rule__NetworkInterface__UnorderedGroup_3__0 {...}?
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
    // InternalTargetPlatform.g:3203:1: rule__NetworkInterface__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__NetworkInterface__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTargetPlatform.g:3208:1: ( ( ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) ) ) )
            // InternalTargetPlatform.g:3209:3: ( ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) ) )
            {
            // InternalTargetPlatform.g:3209:3: ( ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( LA23_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0) ) {
                alt23=1;
            }
            else if ( LA23_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalTargetPlatform.g:3210:3: ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3210:3: ({...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) ) )
                    // InternalTargetPlatform.g:3211:4: {...}? => ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__NetworkInterface__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalTargetPlatform.g:3211:112: ( ( ( rule__NetworkInterface__Group_3_0__0 ) ) )
                    // InternalTargetPlatform.g:3212:5: ( ( rule__NetworkInterface__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3218:5: ( ( rule__NetworkInterface__Group_3_0__0 ) )
                    // InternalTargetPlatform.g:3219:6: ( rule__NetworkInterface__Group_3_0__0 )
                    {
                     before(grammarAccess.getNetworkInterfaceAccess().getGroup_3_0()); 
                    // InternalTargetPlatform.g:3220:6: ( rule__NetworkInterface__Group_3_0__0 )
                    // InternalTargetPlatform.g:3220:7: rule__NetworkInterface__Group_3_0__0
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
                    // InternalTargetPlatform.g:3225:3: ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3225:3: ({...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) ) )
                    // InternalTargetPlatform.g:3226:4: {...}? => ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__NetworkInterface__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalTargetPlatform.g:3226:112: ( ( ( rule__NetworkInterface__Group_3_1__0 ) ) )
                    // InternalTargetPlatform.g:3227:5: ( ( rule__NetworkInterface__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3233:5: ( ( rule__NetworkInterface__Group_3_1__0 ) )
                    // InternalTargetPlatform.g:3234:6: ( rule__NetworkInterface__Group_3_1__0 )
                    {
                     before(grammarAccess.getNetworkInterfaceAccess().getGroup_3_1()); 
                    // InternalTargetPlatform.g:3235:6: ( rule__NetworkInterface__Group_3_1__0 )
                    // InternalTargetPlatform.g:3235:7: rule__NetworkInterface__Group_3_1__0
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
    // InternalTargetPlatform.g:3248:1: rule__NetworkInterface__UnorderedGroup_3__0 : rule__NetworkInterface__UnorderedGroup_3__Impl ( rule__NetworkInterface__UnorderedGroup_3__1 )? ;
    public final void rule__NetworkInterface__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3252:1: ( rule__NetworkInterface__UnorderedGroup_3__Impl ( rule__NetworkInterface__UnorderedGroup_3__1 )? )
            // InternalTargetPlatform.g:3253:2: rule__NetworkInterface__UnorderedGroup_3__Impl ( rule__NetworkInterface__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_30);
            rule__NetworkInterface__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTargetPlatform.g:3254:2: ( rule__NetworkInterface__UnorderedGroup_3__1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( LA24_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 0) ) {
                alt24=1;
            }
            else if ( LA24_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getNetworkInterfaceAccess().getUnorderedGroup_3(), 1) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalTargetPlatform.g:3254:2: rule__NetworkInterface__UnorderedGroup_3__1
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
    // InternalTargetPlatform.g:3260:1: rule__NetworkInterface__UnorderedGroup_3__1 : rule__NetworkInterface__UnorderedGroup_3__Impl ;
    public final void rule__NetworkInterface__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3264:1: ( rule__NetworkInterface__UnorderedGroup_3__Impl )
            // InternalTargetPlatform.g:3265:2: rule__NetworkInterface__UnorderedGroup_3__Impl
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
    // InternalTargetPlatform.g:3272:1: rule__CPU__UnorderedGroup_3 : rule__CPU__UnorderedGroup_3__0 {...}?;
    public final void rule__CPU__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getCPUAccess().getUnorderedGroup_3());
        	
        try {
            // InternalTargetPlatform.g:3277:1: ( rule__CPU__UnorderedGroup_3__0 {...}?)
            // InternalTargetPlatform.g:3278:2: rule__CPU__UnorderedGroup_3__0 {...}?
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
    // InternalTargetPlatform.g:3286:1: rule__CPU__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__CPU__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTargetPlatform.g:3291:1: ( ( ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) ) ) )
            // InternalTargetPlatform.g:3292:3: ( ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) ) )
            {
            // InternalTargetPlatform.g:3292:3: ( ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( LA25_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0) ) {
                alt25=1;
            }
            else if ( LA25_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalTargetPlatform.g:3293:3: ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3293:3: ({...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) ) )
                    // InternalTargetPlatform.g:3294:4: {...}? => ( ( ( rule__CPU__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__CPU__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalTargetPlatform.g:3294:99: ( ( ( rule__CPU__Group_3_0__0 ) ) )
                    // InternalTargetPlatform.g:3295:5: ( ( rule__CPU__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3301:5: ( ( rule__CPU__Group_3_0__0 ) )
                    // InternalTargetPlatform.g:3302:6: ( rule__CPU__Group_3_0__0 )
                    {
                     before(grammarAccess.getCPUAccess().getGroup_3_0()); 
                    // InternalTargetPlatform.g:3303:6: ( rule__CPU__Group_3_0__0 )
                    // InternalTargetPlatform.g:3303:7: rule__CPU__Group_3_0__0
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
                    // InternalTargetPlatform.g:3308:3: ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3308:3: ({...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) ) )
                    // InternalTargetPlatform.g:3309:4: {...}? => ( ( ( rule__CPU__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__CPU__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalTargetPlatform.g:3309:99: ( ( ( rule__CPU__Group_3_1__0 ) ) )
                    // InternalTargetPlatform.g:3310:5: ( ( rule__CPU__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3316:5: ( ( rule__CPU__Group_3_1__0 ) )
                    // InternalTargetPlatform.g:3317:6: ( rule__CPU__Group_3_1__0 )
                    {
                     before(grammarAccess.getCPUAccess().getGroup_3_1()); 
                    // InternalTargetPlatform.g:3318:6: ( rule__CPU__Group_3_1__0 )
                    // InternalTargetPlatform.g:3318:7: rule__CPU__Group_3_1__0
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
    // InternalTargetPlatform.g:3331:1: rule__CPU__UnorderedGroup_3__0 : rule__CPU__UnorderedGroup_3__Impl ( rule__CPU__UnorderedGroup_3__1 )? ;
    public final void rule__CPU__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3335:1: ( rule__CPU__UnorderedGroup_3__Impl ( rule__CPU__UnorderedGroup_3__1 )? )
            // InternalTargetPlatform.g:3336:2: rule__CPU__UnorderedGroup_3__Impl ( rule__CPU__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_31);
            rule__CPU__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTargetPlatform.g:3337:2: ( rule__CPU__UnorderedGroup_3__1 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( LA26_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 0) ) {
                alt26=1;
            }
            else if ( LA26_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getCPUAccess().getUnorderedGroup_3(), 1) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalTargetPlatform.g:3337:2: rule__CPU__UnorderedGroup_3__1
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
    // InternalTargetPlatform.g:3343:1: rule__CPU__UnorderedGroup_3__1 : rule__CPU__UnorderedGroup_3__Impl ;
    public final void rule__CPU__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3347:1: ( rule__CPU__UnorderedGroup_3__Impl )
            // InternalTargetPlatform.g:3348:2: rule__CPU__UnorderedGroup_3__Impl
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
    // InternalTargetPlatform.g:3355:1: rule__LoginAccount__UnorderedGroup_3 : ( rule__LoginAccount__UnorderedGroup_3__0 )? ;
    public final void rule__LoginAccount__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3());
        	
        try {
            // InternalTargetPlatform.g:3360:1: ( ( rule__LoginAccount__UnorderedGroup_3__0 )? )
            // InternalTargetPlatform.g:3361:2: ( rule__LoginAccount__UnorderedGroup_3__0 )?
            {
            // InternalTargetPlatform.g:3361:2: ( rule__LoginAccount__UnorderedGroup_3__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( LA27_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0) ) {
                alt27=1;
            }
            else if ( LA27_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalTargetPlatform.g:3361:2: rule__LoginAccount__UnorderedGroup_3__0
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
    // InternalTargetPlatform.g:3369:1: rule__LoginAccount__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) ) ) ;
    public final void rule__LoginAccount__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalTargetPlatform.g:3374:1: ( ( ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) ) ) )
            // InternalTargetPlatform.g:3375:3: ( ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) ) )
            {
            // InternalTargetPlatform.g:3375:3: ( ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) ) )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( LA28_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0) ) {
                alt28=1;
            }
            else if ( LA28_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1) ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalTargetPlatform.g:3376:3: ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3376:3: ({...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) ) )
                    // InternalTargetPlatform.g:3377:4: {...}? => ( ( ( rule__LoginAccount__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__LoginAccount__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalTargetPlatform.g:3377:108: ( ( ( rule__LoginAccount__Group_3_0__0 ) ) )
                    // InternalTargetPlatform.g:3378:5: ( ( rule__LoginAccount__Group_3_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3384:5: ( ( rule__LoginAccount__Group_3_0__0 ) )
                    // InternalTargetPlatform.g:3385:6: ( rule__LoginAccount__Group_3_0__0 )
                    {
                     before(grammarAccess.getLoginAccountAccess().getGroup_3_0()); 
                    // InternalTargetPlatform.g:3386:6: ( rule__LoginAccount__Group_3_0__0 )
                    // InternalTargetPlatform.g:3386:7: rule__LoginAccount__Group_3_0__0
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
                    // InternalTargetPlatform.g:3391:3: ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) )
                    {
                    // InternalTargetPlatform.g:3391:3: ({...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) ) )
                    // InternalTargetPlatform.g:3392:4: {...}? => ( ( ( rule__LoginAccount__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__LoginAccount__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalTargetPlatform.g:3392:108: ( ( ( rule__LoginAccount__Group_3_1__0 ) ) )
                    // InternalTargetPlatform.g:3393:5: ( ( rule__LoginAccount__Group_3_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1);
                    				

                    					selected = true;
                    				
                    // InternalTargetPlatform.g:3399:5: ( ( rule__LoginAccount__Group_3_1__0 ) )
                    // InternalTargetPlatform.g:3400:6: ( rule__LoginAccount__Group_3_1__0 )
                    {
                     before(grammarAccess.getLoginAccountAccess().getGroup_3_1()); 
                    // InternalTargetPlatform.g:3401:6: ( rule__LoginAccount__Group_3_1__0 )
                    // InternalTargetPlatform.g:3401:7: rule__LoginAccount__Group_3_1__0
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
    // InternalTargetPlatform.g:3414:1: rule__LoginAccount__UnorderedGroup_3__0 : rule__LoginAccount__UnorderedGroup_3__Impl ( rule__LoginAccount__UnorderedGroup_3__1 )? ;
    public final void rule__LoginAccount__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3418:1: ( rule__LoginAccount__UnorderedGroup_3__Impl ( rule__LoginAccount__UnorderedGroup_3__1 )? )
            // InternalTargetPlatform.g:3419:2: rule__LoginAccount__UnorderedGroup_3__Impl ( rule__LoginAccount__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_32);
            rule__LoginAccount__UnorderedGroup_3__Impl();

            state._fsp--;

            // InternalTargetPlatform.g:3420:2: ( rule__LoginAccount__UnorderedGroup_3__1 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( LA29_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 0) ) {
                alt29=1;
            }
            else if ( LA29_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getLoginAccountAccess().getUnorderedGroup_3(), 1) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalTargetPlatform.g:3420:2: rule__LoginAccount__UnorderedGroup_3__1
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
    // InternalTargetPlatform.g:3426:1: rule__LoginAccount__UnorderedGroup_3__1 : rule__LoginAccount__UnorderedGroup_3__Impl ;
    public final void rule__LoginAccount__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3430:1: ( rule__LoginAccount__UnorderedGroup_3__Impl )
            // InternalTargetPlatform.g:3431:2: rule__LoginAccount__UnorderedGroup_3__Impl
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
    // InternalTargetPlatform.g:3438:1: rule__TargetPlatformModel__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TargetPlatformModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3442:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:3443:2: ( RULE_ID )
            {
            // InternalTargetPlatform.g:3443:2: ( RULE_ID )
            // InternalTargetPlatform.g:3444:3: RULE_ID
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
    // InternalTargetPlatform.g:3453:1: rule__TargetPlatformModel__ElementsAssignment_3 : ( ruleAbstractTPElement ) ;
    public final void rule__TargetPlatformModel__ElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3457:1: ( ( ruleAbstractTPElement ) )
            // InternalTargetPlatform.g:3458:2: ( ruleAbstractTPElement )
            {
            // InternalTargetPlatform.g:3458:2: ( ruleAbstractTPElement )
            // InternalTargetPlatform.g:3459:3: ruleAbstractTPElement
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
    // InternalTargetPlatform.g:3468:1: rule__NetworkConnection__Endpoint1Assignment_2 : ( ( ruleFQN ) ) ;
    public final void rule__NetworkConnection__Endpoint1Assignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3472:1: ( ( ( ruleFQN ) ) )
            // InternalTargetPlatform.g:3473:2: ( ( ruleFQN ) )
            {
            // InternalTargetPlatform.g:3473:2: ( ( ruleFQN ) )
            // InternalTargetPlatform.g:3474:3: ( ruleFQN )
            {
             before(grammarAccess.getNetworkConnectionAccess().getEndpoint1NetworkInterfaceCrossReference_2_0()); 
            // InternalTargetPlatform.g:3475:3: ( ruleFQN )
            // InternalTargetPlatform.g:3476:4: ruleFQN
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
    // InternalTargetPlatform.g:3487:1: rule__NetworkConnection__Endpoint2Assignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__NetworkConnection__Endpoint2Assignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3491:1: ( ( ( ruleFQN ) ) )
            // InternalTargetPlatform.g:3492:2: ( ( ruleFQN ) )
            {
            // InternalTargetPlatform.g:3492:2: ( ( ruleFQN ) )
            // InternalTargetPlatform.g:3493:3: ( ruleFQN )
            {
             before(grammarAccess.getNetworkConnectionAccess().getEndpoint2NetworkInterfaceCrossReference_4_0()); 
            // InternalTargetPlatform.g:3494:3: ( ruleFQN )
            // InternalTargetPlatform.g:3495:4: ruleFQN
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
    // InternalTargetPlatform.g:3506:1: rule__NetworkConnection__KindAssignment_5_1 : ( ruleEString ) ;
    public final void rule__NetworkConnection__KindAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3510:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3511:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3511:2: ( ruleEString )
            // InternalTargetPlatform.g:3512:3: ruleEString
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
    // InternalTargetPlatform.g:3521:1: rule__TargetPlatformDefinition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TargetPlatformDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3525:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:3526:2: ( RULE_ID )
            {
            // InternalTargetPlatform.g:3526:2: ( RULE_ID )
            // InternalTargetPlatform.g:3527:3: RULE_ID
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
    // InternalTargetPlatform.g:3536:1: rule__TargetPlatformDefinition__OsAssignment_3 : ( ruleOperatingSystem ) ;
    public final void rule__TargetPlatformDefinition__OsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3540:1: ( ( ruleOperatingSystem ) )
            // InternalTargetPlatform.g:3541:2: ( ruleOperatingSystem )
            {
            // InternalTargetPlatform.g:3541:2: ( ruleOperatingSystem )
            // InternalTargetPlatform.g:3542:3: ruleOperatingSystem
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
    // InternalTargetPlatform.g:3551:1: rule__TargetPlatformDefinition__ElementsAssignment_4 : ( ruleAbstractTPSubNode ) ;
    public final void rule__TargetPlatformDefinition__ElementsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3555:1: ( ( ruleAbstractTPSubNode ) )
            // InternalTargetPlatform.g:3556:2: ( ruleAbstractTPSubNode )
            {
            // InternalTargetPlatform.g:3556:2: ( ruleAbstractTPSubNode )
            // InternalTargetPlatform.g:3557:3: ruleAbstractTPSubNode
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
    // InternalTargetPlatform.g:3566:1: rule__Windows__KindAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Windows__KindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3570:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3571:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3571:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3572:3: RULE_STRING
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
    // InternalTargetPlatform.g:3581:1: rule__Linux__KindAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Linux__KindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3585:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3586:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3586:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3587:3: RULE_STRING
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
    // InternalTargetPlatform.g:3596:1: rule__MacOS__KindAssignment_2 : ( RULE_STRING ) ;
    public final void rule__MacOS__KindAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3600:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3601:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3601:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3602:3: RULE_STRING
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
    // InternalTargetPlatform.g:3611:1: rule__NetworkInterface__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__NetworkInterface__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3615:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:3616:2: ( RULE_ID )
            {
            // InternalTargetPlatform.g:3616:2: ( RULE_ID )
            // InternalTargetPlatform.g:3617:3: RULE_ID
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
    // InternalTargetPlatform.g:3626:1: rule__NetworkInterface__HostAddressAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__NetworkInterface__HostAddressAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3630:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3631:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3631:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3632:3: RULE_STRING
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
    // InternalTargetPlatform.g:3641:1: rule__NetworkInterface__PortNrAssignment_3_0_2_1 : ( ruleEInt ) ;
    public final void rule__NetworkInterface__PortNrAssignment_3_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3645:1: ( ( ruleEInt ) )
            // InternalTargetPlatform.g:3646:2: ( ruleEInt )
            {
            // InternalTargetPlatform.g:3646:2: ( ruleEInt )
            // InternalTargetPlatform.g:3647:3: ruleEInt
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
    // InternalTargetPlatform.g:3656:1: rule__NetworkInterface__KindAssignment_3_1_1 : ( ruleEString ) ;
    public final void rule__NetworkInterface__KindAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3660:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3661:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3661:2: ( ruleEString )
            // InternalTargetPlatform.g:3662:3: ruleEString
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
    // InternalTargetPlatform.g:3671:1: rule__CPU__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__CPU__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3675:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:3676:2: ( RULE_ID )
            {
            // InternalTargetPlatform.g:3676:2: ( RULE_ID )
            // InternalTargetPlatform.g:3677:3: RULE_ID
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
    // InternalTargetPlatform.g:3686:1: rule__CPU__KindAssignment_3_0_1 : ( ruleEString ) ;
    public final void rule__CPU__KindAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3690:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3691:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3691:2: ( ruleEString )
            // InternalTargetPlatform.g:3692:3: ruleEString
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
    // InternalTargetPlatform.g:3701:1: rule__CPU__CoresTallyAssignment_3_1_1 : ( ruleEInt ) ;
    public final void rule__CPU__CoresTallyAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3705:1: ( ( ruleEInt ) )
            // InternalTargetPlatform.g:3706:2: ( ruleEInt )
            {
            // InternalTargetPlatform.g:3706:2: ( ruleEInt )
            // InternalTargetPlatform.g:3707:3: ruleEInt
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
    // InternalTargetPlatform.g:3716:1: rule__LoginAccount__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LoginAccount__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3720:1: ( ( RULE_ID ) )
            // InternalTargetPlatform.g:3721:2: ( RULE_ID )
            {
            // InternalTargetPlatform.g:3721:2: ( RULE_ID )
            // InternalTargetPlatform.g:3722:3: RULE_ID
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
    // InternalTargetPlatform.g:3731:1: rule__LoginAccount__FullnameAssignment_3_0_1 : ( RULE_STRING ) ;
    public final void rule__LoginAccount__FullnameAssignment_3_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3735:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3736:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3736:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3737:3: RULE_STRING
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
    // InternalTargetPlatform.g:3746:1: rule__LoginAccount__EmailAssignment_3_1_1 : ( RULE_STRING ) ;
    public final void rule__LoginAccount__EmailAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3750:1: ( ( RULE_STRING ) )
            // InternalTargetPlatform.g:3751:2: ( RULE_STRING )
            {
            // InternalTargetPlatform.g:3751:2: ( RULE_STRING )
            // InternalTargetPlatform.g:3752:3: RULE_STRING
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
    // InternalTargetPlatform.g:3761:1: rule__TargetMiddleware__MiddlewareAssignment_1 : ( ruleRoboticMiddleware ) ;
    public final void rule__TargetMiddleware__MiddlewareAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3765:1: ( ( ruleRoboticMiddleware ) )
            // InternalTargetPlatform.g:3766:2: ( ruleRoboticMiddleware )
            {
            // InternalTargetPlatform.g:3766:2: ( ruleRoboticMiddleware )
            // InternalTargetPlatform.g:3767:3: ruleRoboticMiddleware
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
    // InternalTargetPlatform.g:3776:1: rule__ACE_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__ACE_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3780:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3781:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3781:2: ( ruleEString )
            // InternalTargetPlatform.g:3782:3: ruleEString
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
    // InternalTargetPlatform.g:3791:1: rule__OpcUa_SeRoNet__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__OpcUa_SeRoNet__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3795:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3796:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3796:2: ( ruleEString )
            // InternalTargetPlatform.g:3797:3: ruleEString
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
    // InternalTargetPlatform.g:3806:1: rule__CORBA_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__CORBA_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3810:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3811:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3811:2: ( ruleEString )
            // InternalTargetPlatform.g:3812:3: ruleEString
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
    // InternalTargetPlatform.g:3821:1: rule__DDS_SmartSoft__DescriptionAssignment_2_1 : ( ruleEString ) ;
    public final void rule__DDS_SmartSoft__DescriptionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalTargetPlatform.g:3825:1: ( ( ruleEString ) )
            // InternalTargetPlatform.g:3826:2: ( ruleEString )
            {
            // InternalTargetPlatform.g:3826:2: ( ruleEString )
            // InternalTargetPlatform.g:3827:3: ruleEString
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000026000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000024002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000094742000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000094400002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000340000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000200000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x000000000A000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000007400000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000A000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000060000002L});

}
