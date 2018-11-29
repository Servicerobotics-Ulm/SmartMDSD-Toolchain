package org.xtext.system.systemParameter.ide.contentassist.antlr.internal;

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
import org.xtext.system.systemParameter.services.SystemParameterGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSystemParameterParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'E'", "'e'", "'*'", "'Int8'", "'Int16'", "'Int32'", "'Int64'", "'UInt8'", "'UInt16'", "'UInt32'", "'UInt64'", "'Float'", "'Double'", "'String'", "'Boolean'", "'SystemParameterModel'", "'extendsSystem'", "'{'", "'}'", "'ComponentParameterInstance'", "'refinesParamStruct'", "'ParameterRefinement'", "'='", "';'", "'.'", "'-'", "'InlineEnumeration'", "'['", "']'", "','"
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
    public static final int RULE_ID=6;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
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
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__42=42;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalSystemParameterParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSystemParameterParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSystemParameterParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSystemParameter.g"; }


    	private SystemParameterGrammarAccess grammarAccess;

    	public void setGrammarAccess(SystemParameterGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleSystemParamModel"
    // InternalSystemParameter.g:94:1: entryRuleSystemParamModel : ruleSystemParamModel EOF ;
    public final void entryRuleSystemParamModel() throws RecognitionException {
        try {
            // InternalSystemParameter.g:95:1: ( ruleSystemParamModel EOF )
            // InternalSystemParameter.g:96:1: ruleSystemParamModel EOF
            {
             before(grammarAccess.getSystemParamModelRule()); 
            pushFollow(FOLLOW_1);
            ruleSystemParamModel();

            state._fsp--;

             after(grammarAccess.getSystemParamModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSystemParamModel"


    // $ANTLR start "ruleSystemParamModel"
    // InternalSystemParameter.g:103:1: ruleSystemParamModel : ( ( rule__SystemParamModel__Group__0 ) ) ;
    public final void ruleSystemParamModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:107:2: ( ( ( rule__SystemParamModel__Group__0 ) ) )
            // InternalSystemParameter.g:108:2: ( ( rule__SystemParamModel__Group__0 ) )
            {
            // InternalSystemParameter.g:108:2: ( ( rule__SystemParamModel__Group__0 ) )
            // InternalSystemParameter.g:109:3: ( rule__SystemParamModel__Group__0 )
            {
             before(grammarAccess.getSystemParamModelAccess().getGroup()); 
            // InternalSystemParameter.g:110:3: ( rule__SystemParamModel__Group__0 )
            // InternalSystemParameter.g:110:4: rule__SystemParamModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SystemParamModel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSystemParamModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSystemParamModel"


    // $ANTLR start "entryRuleComponentParameterInstance"
    // InternalSystemParameter.g:119:1: entryRuleComponentParameterInstance : ruleComponentParameterInstance EOF ;
    public final void entryRuleComponentParameterInstance() throws RecognitionException {
        try {
            // InternalSystemParameter.g:120:1: ( ruleComponentParameterInstance EOF )
            // InternalSystemParameter.g:121:1: ruleComponentParameterInstance EOF
            {
             before(grammarAccess.getComponentParameterInstanceRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentParameterInstance();

            state._fsp--;

             after(grammarAccess.getComponentParameterInstanceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentParameterInstance"


    // $ANTLR start "ruleComponentParameterInstance"
    // InternalSystemParameter.g:128:1: ruleComponentParameterInstance : ( ( rule__ComponentParameterInstance__Group__0 ) ) ;
    public final void ruleComponentParameterInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:132:2: ( ( ( rule__ComponentParameterInstance__Group__0 ) ) )
            // InternalSystemParameter.g:133:2: ( ( rule__ComponentParameterInstance__Group__0 ) )
            {
            // InternalSystemParameter.g:133:2: ( ( rule__ComponentParameterInstance__Group__0 ) )
            // InternalSystemParameter.g:134:3: ( rule__ComponentParameterInstance__Group__0 )
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getGroup()); 
            // InternalSystemParameter.g:135:3: ( rule__ComponentParameterInstance__Group__0 )
            // InternalSystemParameter.g:135:4: rule__ComponentParameterInstance__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentParameterInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentParameterInstanceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentParameterInstance"


    // $ANTLR start "entryRuleParameterRefinement"
    // InternalSystemParameter.g:144:1: entryRuleParameterRefinement : ruleParameterRefinement EOF ;
    public final void entryRuleParameterRefinement() throws RecognitionException {
        try {
            // InternalSystemParameter.g:145:1: ( ruleParameterRefinement EOF )
            // InternalSystemParameter.g:146:1: ruleParameterRefinement EOF
            {
             before(grammarAccess.getParameterRefinementRule()); 
            pushFollow(FOLLOW_1);
            ruleParameterRefinement();

            state._fsp--;

             after(grammarAccess.getParameterRefinementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterRefinement"


    // $ANTLR start "ruleParameterRefinement"
    // InternalSystemParameter.g:153:1: ruleParameterRefinement : ( ( rule__ParameterRefinement__Group__0 ) ) ;
    public final void ruleParameterRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:157:2: ( ( ( rule__ParameterRefinement__Group__0 ) ) )
            // InternalSystemParameter.g:158:2: ( ( rule__ParameterRefinement__Group__0 ) )
            {
            // InternalSystemParameter.g:158:2: ( ( rule__ParameterRefinement__Group__0 ) )
            // InternalSystemParameter.g:159:3: ( rule__ParameterRefinement__Group__0 )
            {
             before(grammarAccess.getParameterRefinementAccess().getGroup()); 
            // InternalSystemParameter.g:160:3: ( rule__ParameterRefinement__Group__0 )
            // InternalSystemParameter.g:160:4: rule__ParameterRefinement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParameterRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterRefinement"


    // $ANTLR start "entryRuleAttributeRefinement"
    // InternalSystemParameter.g:169:1: entryRuleAttributeRefinement : ruleAttributeRefinement EOF ;
    public final void entryRuleAttributeRefinement() throws RecognitionException {
        try {
            // InternalSystemParameter.g:170:1: ( ruleAttributeRefinement EOF )
            // InternalSystemParameter.g:171:1: ruleAttributeRefinement EOF
            {
             before(grammarAccess.getAttributeRefinementRule()); 
            pushFollow(FOLLOW_1);
            ruleAttributeRefinement();

            state._fsp--;

             after(grammarAccess.getAttributeRefinementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeRefinement"


    // $ANTLR start "ruleAttributeRefinement"
    // InternalSystemParameter.g:178:1: ruleAttributeRefinement : ( ( rule__AttributeRefinement__Group__0 ) ) ;
    public final void ruleAttributeRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:182:2: ( ( ( rule__AttributeRefinement__Group__0 ) ) )
            // InternalSystemParameter.g:183:2: ( ( rule__AttributeRefinement__Group__0 ) )
            {
            // InternalSystemParameter.g:183:2: ( ( rule__AttributeRefinement__Group__0 ) )
            // InternalSystemParameter.g:184:3: ( rule__AttributeRefinement__Group__0 )
            {
             before(grammarAccess.getAttributeRefinementAccess().getGroup()); 
            // InternalSystemParameter.g:185:3: ( rule__AttributeRefinement__Group__0 )
            // InternalSystemParameter.g:185:4: rule__AttributeRefinement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeRefinement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRefinementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeRefinement"


    // $ANTLR start "entryRuleFQN"
    // InternalSystemParameter.g:194:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalSystemParameter.g:195:1: ( ruleFQN EOF )
            // InternalSystemParameter.g:196:1: ruleFQN EOF
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
    // InternalSystemParameter.g:203:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:207:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalSystemParameter.g:208:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalSystemParameter.g:208:2: ( ( rule__FQN__Group__0 ) )
            // InternalSystemParameter.g:209:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalSystemParameter.g:210:3: ( rule__FQN__Group__0 )
            // InternalSystemParameter.g:210:4: rule__FQN__Group__0
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
    // InternalSystemParameter.g:219:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalSystemParameter.g:220:1: ( ruleEBoolean EOF )
            // InternalSystemParameter.g:221:1: ruleEBoolean EOF
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
    // InternalSystemParameter.g:228:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:232:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalSystemParameter.g:233:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalSystemParameter.g:233:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalSystemParameter.g:234:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalSystemParameter.g:235:3: ( rule__EBoolean__Alternatives )
            // InternalSystemParameter.g:235:4: rule__EBoolean__Alternatives
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
    // InternalSystemParameter.g:244:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalSystemParameter.g:245:1: ( ruleEString EOF )
            // InternalSystemParameter.g:246:1: ruleEString EOF
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
    // InternalSystemParameter.g:253:1: ruleEString : ( RULE_STRING ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:257:2: ( ( RULE_STRING ) )
            // InternalSystemParameter.g:258:2: ( RULE_STRING )
            {
            // InternalSystemParameter.g:258:2: ( RULE_STRING )
            // InternalSystemParameter.g:259:3: RULE_STRING
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
    // InternalSystemParameter.g:269:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalSystemParameter.g:270:1: ( ruleEInt EOF )
            // InternalSystemParameter.g:271:1: ruleEInt EOF
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
    // InternalSystemParameter.g:278:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:282:2: ( ( ( rule__EInt__Group__0 ) ) )
            // InternalSystemParameter.g:283:2: ( ( rule__EInt__Group__0 ) )
            {
            // InternalSystemParameter.g:283:2: ( ( rule__EInt__Group__0 ) )
            // InternalSystemParameter.g:284:3: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // InternalSystemParameter.g:285:3: ( rule__EInt__Group__0 )
            // InternalSystemParameter.g:285:4: rule__EInt__Group__0
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
    // InternalSystemParameter.g:294:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalSystemParameter.g:295:1: ( ruleEDouble EOF )
            // InternalSystemParameter.g:296:1: ruleEDouble EOF
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
    // InternalSystemParameter.g:303:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:307:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalSystemParameter.g:308:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalSystemParameter.g:308:2: ( ( rule__EDouble__Group__0 ) )
            // InternalSystemParameter.g:309:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalSystemParameter.g:310:3: ( rule__EDouble__Group__0 )
            // InternalSystemParameter.g:310:4: rule__EDouble__Group__0
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
    // InternalSystemParameter.g:319:1: entryRuleEnumerationElement : ruleEnumerationElement EOF ;
    public final void entryRuleEnumerationElement() throws RecognitionException {
        try {
            // InternalSystemParameter.g:320:1: ( ruleEnumerationElement EOF )
            // InternalSystemParameter.g:321:1: ruleEnumerationElement EOF
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
    // InternalSystemParameter.g:328:1: ruleEnumerationElement : ( ( rule__EnumerationElement__Group__0 ) ) ;
    public final void ruleEnumerationElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:332:2: ( ( ( rule__EnumerationElement__Group__0 ) ) )
            // InternalSystemParameter.g:333:2: ( ( rule__EnumerationElement__Group__0 ) )
            {
            // InternalSystemParameter.g:333:2: ( ( rule__EnumerationElement__Group__0 ) )
            // InternalSystemParameter.g:334:3: ( rule__EnumerationElement__Group__0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup()); 
            // InternalSystemParameter.g:335:3: ( rule__EnumerationElement__Group__0 )
            // InternalSystemParameter.g:335:4: rule__EnumerationElement__Group__0
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
    // InternalSystemParameter.g:344:1: entryRuleAbstractAttributeType : ruleAbstractAttributeType EOF ;
    public final void entryRuleAbstractAttributeType() throws RecognitionException {
        try {
            // InternalSystemParameter.g:345:1: ( ruleAbstractAttributeType EOF )
            // InternalSystemParameter.g:346:1: ruleAbstractAttributeType EOF
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
    // InternalSystemParameter.g:353:1: ruleAbstractAttributeType : ( ( rule__AbstractAttributeType__Alternatives ) ) ;
    public final void ruleAbstractAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:357:2: ( ( ( rule__AbstractAttributeType__Alternatives ) ) )
            // InternalSystemParameter.g:358:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            {
            // InternalSystemParameter.g:358:2: ( ( rule__AbstractAttributeType__Alternatives ) )
            // InternalSystemParameter.g:359:3: ( rule__AbstractAttributeType__Alternatives )
            {
             before(grammarAccess.getAbstractAttributeTypeAccess().getAlternatives()); 
            // InternalSystemParameter.g:360:3: ( rule__AbstractAttributeType__Alternatives )
            // InternalSystemParameter.g:360:4: rule__AbstractAttributeType__Alternatives
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
    // InternalSystemParameter.g:369:1: entryRuleInlineEnumerationType : ruleInlineEnumerationType EOF ;
    public final void entryRuleInlineEnumerationType() throws RecognitionException {
        try {
            // InternalSystemParameter.g:370:1: ( ruleInlineEnumerationType EOF )
            // InternalSystemParameter.g:371:1: ruleInlineEnumerationType EOF
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
    // InternalSystemParameter.g:378:1: ruleInlineEnumerationType : ( ( rule__InlineEnumerationType__Group__0 ) ) ;
    public final void ruleInlineEnumerationType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:382:2: ( ( ( rule__InlineEnumerationType__Group__0 ) ) )
            // InternalSystemParameter.g:383:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            {
            // InternalSystemParameter.g:383:2: ( ( rule__InlineEnumerationType__Group__0 ) )
            // InternalSystemParameter.g:384:3: ( rule__InlineEnumerationType__Group__0 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getGroup()); 
            // InternalSystemParameter.g:385:3: ( rule__InlineEnumerationType__Group__0 )
            // InternalSystemParameter.g:385:4: rule__InlineEnumerationType__Group__0
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
    // InternalSystemParameter.g:394:1: entryRuleArrayType : ruleArrayType EOF ;
    public final void entryRuleArrayType() throws RecognitionException {
        try {
            // InternalSystemParameter.g:395:1: ( ruleArrayType EOF )
            // InternalSystemParameter.g:396:1: ruleArrayType EOF
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
    // InternalSystemParameter.g:403:1: ruleArrayType : ( ( rule__ArrayType__Group__0 ) ) ;
    public final void ruleArrayType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:407:2: ( ( ( rule__ArrayType__Group__0 ) ) )
            // InternalSystemParameter.g:408:2: ( ( rule__ArrayType__Group__0 ) )
            {
            // InternalSystemParameter.g:408:2: ( ( rule__ArrayType__Group__0 ) )
            // InternalSystemParameter.g:409:3: ( rule__ArrayType__Group__0 )
            {
             before(grammarAccess.getArrayTypeAccess().getGroup()); 
            // InternalSystemParameter.g:410:3: ( rule__ArrayType__Group__0 )
            // InternalSystemParameter.g:410:4: rule__ArrayType__Group__0
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
    // InternalSystemParameter.g:419:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalSystemParameter.g:420:1: ( ruleCardinality EOF )
            // InternalSystemParameter.g:421:1: ruleCardinality EOF
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
    // InternalSystemParameter.g:428:1: ruleCardinality : ( ( rule__Cardinality__Alternatives ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:432:2: ( ( ( rule__Cardinality__Alternatives ) ) )
            // InternalSystemParameter.g:433:2: ( ( rule__Cardinality__Alternatives ) )
            {
            // InternalSystemParameter.g:433:2: ( ( rule__Cardinality__Alternatives ) )
            // InternalSystemParameter.g:434:3: ( rule__Cardinality__Alternatives )
            {
             before(grammarAccess.getCardinalityAccess().getAlternatives()); 
            // InternalSystemParameter.g:435:3: ( rule__Cardinality__Alternatives )
            // InternalSystemParameter.g:435:4: rule__Cardinality__Alternatives
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
    // InternalSystemParameter.g:444:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalSystemParameter.g:445:1: ( rulePrimitiveType EOF )
            // InternalSystemParameter.g:446:1: rulePrimitiveType EOF
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
    // InternalSystemParameter.g:453:1: rulePrimitiveType : ( ( rule__PrimitiveType__Group__0 ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:457:2: ( ( ( rule__PrimitiveType__Group__0 ) ) )
            // InternalSystemParameter.g:458:2: ( ( rule__PrimitiveType__Group__0 ) )
            {
            // InternalSystemParameter.g:458:2: ( ( rule__PrimitiveType__Group__0 ) )
            // InternalSystemParameter.g:459:3: ( rule__PrimitiveType__Group__0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getGroup()); 
            // InternalSystemParameter.g:460:3: ( rule__PrimitiveType__Group__0 )
            // InternalSystemParameter.g:460:4: rule__PrimitiveType__Group__0
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
    // InternalSystemParameter.g:469:1: entryRuleAbstractValue : ruleAbstractValue EOF ;
    public final void entryRuleAbstractValue() throws RecognitionException {
        try {
            // InternalSystemParameter.g:470:1: ( ruleAbstractValue EOF )
            // InternalSystemParameter.g:471:1: ruleAbstractValue EOF
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
    // InternalSystemParameter.g:478:1: ruleAbstractValue : ( ( rule__AbstractValue__Alternatives ) ) ;
    public final void ruleAbstractValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:482:2: ( ( ( rule__AbstractValue__Alternatives ) ) )
            // InternalSystemParameter.g:483:2: ( ( rule__AbstractValue__Alternatives ) )
            {
            // InternalSystemParameter.g:483:2: ( ( rule__AbstractValue__Alternatives ) )
            // InternalSystemParameter.g:484:3: ( rule__AbstractValue__Alternatives )
            {
             before(grammarAccess.getAbstractValueAccess().getAlternatives()); 
            // InternalSystemParameter.g:485:3: ( rule__AbstractValue__Alternatives )
            // InternalSystemParameter.g:485:4: rule__AbstractValue__Alternatives
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
    // InternalSystemParameter.g:494:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalSystemParameter.g:495:1: ( ruleArrayValue EOF )
            // InternalSystemParameter.g:496:1: ruleArrayValue EOF
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
    // InternalSystemParameter.g:503:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:507:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalSystemParameter.g:508:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalSystemParameter.g:508:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalSystemParameter.g:509:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalSystemParameter.g:510:3: ( rule__ArrayValue__Group__0 )
            // InternalSystemParameter.g:510:4: rule__ArrayValue__Group__0
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
    // InternalSystemParameter.g:519:1: entryRuleSingleValue : ruleSingleValue EOF ;
    public final void entryRuleSingleValue() throws RecognitionException {
        try {
            // InternalSystemParameter.g:520:1: ( ruleSingleValue EOF )
            // InternalSystemParameter.g:521:1: ruleSingleValue EOF
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
    // InternalSystemParameter.g:528:1: ruleSingleValue : ( ( rule__SingleValue__Alternatives ) ) ;
    public final void ruleSingleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:532:2: ( ( ( rule__SingleValue__Alternatives ) ) )
            // InternalSystemParameter.g:533:2: ( ( rule__SingleValue__Alternatives ) )
            {
            // InternalSystemParameter.g:533:2: ( ( rule__SingleValue__Alternatives ) )
            // InternalSystemParameter.g:534:3: ( rule__SingleValue__Alternatives )
            {
             before(grammarAccess.getSingleValueAccess().getAlternatives()); 
            // InternalSystemParameter.g:535:3: ( rule__SingleValue__Alternatives )
            // InternalSystemParameter.g:535:4: rule__SingleValue__Alternatives
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


    // $ANTLR start "rulePRIMITIVE_TYPE_NAME"
    // InternalSystemParameter.g:544:1: rulePRIMITIVE_TYPE_NAME : ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) ;
    public final void rulePRIMITIVE_TYPE_NAME() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:548:1: ( ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) ) )
            // InternalSystemParameter.g:549:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            {
            // InternalSystemParameter.g:549:2: ( ( rule__PRIMITIVE_TYPE_NAME__Alternatives ) )
            // InternalSystemParameter.g:550:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            {
             before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getAlternatives()); 
            // InternalSystemParameter.g:551:3: ( rule__PRIMITIVE_TYPE_NAME__Alternatives )
            // InternalSystemParameter.g:551:4: rule__PRIMITIVE_TYPE_NAME__Alternatives
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
    // InternalSystemParameter.g:559:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:563:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalSystemParameter.g:564:2: ( 'true' )
                    {
                    // InternalSystemParameter.g:564:2: ( 'true' )
                    // InternalSystemParameter.g:565:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:570:2: ( 'false' )
                    {
                    // InternalSystemParameter.g:570:2: ( 'false' )
                    // InternalSystemParameter.g:571:3: 'false'
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
    // InternalSystemParameter.g:580:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:584:1: ( ( 'E' ) | ( 'e' ) )
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
                    // InternalSystemParameter.g:585:2: ( 'E' )
                    {
                    // InternalSystemParameter.g:585:2: ( 'E' )
                    // InternalSystemParameter.g:586:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:591:2: ( 'e' )
                    {
                    // InternalSystemParameter.g:591:2: ( 'e' )
                    // InternalSystemParameter.g:592:3: 'e'
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
    // InternalSystemParameter.g:601:1: rule__AbstractAttributeType__Alternatives : ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) );
    public final void rule__AbstractAttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:605:1: ( ( rulePrimitiveType ) | ( ruleInlineEnumerationType ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>=16 && LA3_0<=27)) ) {
                alt3=1;
            }
            else if ( (LA3_0==39) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalSystemParameter.g:606:2: ( rulePrimitiveType )
                    {
                    // InternalSystemParameter.g:606:2: ( rulePrimitiveType )
                    // InternalSystemParameter.g:607:3: rulePrimitiveType
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
                    // InternalSystemParameter.g:612:2: ( ruleInlineEnumerationType )
                    {
                    // InternalSystemParameter.g:612:2: ( ruleInlineEnumerationType )
                    // InternalSystemParameter.g:613:3: ruleInlineEnumerationType
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
    // InternalSystemParameter.g:622:1: rule__Cardinality__Alternatives : ( ( RULE_INT ) | ( '*' ) );
    public final void rule__Cardinality__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:626:1: ( ( RULE_INT ) | ( '*' ) )
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
                    // InternalSystemParameter.g:627:2: ( RULE_INT )
                    {
                    // InternalSystemParameter.g:627:2: ( RULE_INT )
                    // InternalSystemParameter.g:628:3: RULE_INT
                    {
                     before(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getCardinalityAccess().getINTTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:633:2: ( '*' )
                    {
                    // InternalSystemParameter.g:633:2: ( '*' )
                    // InternalSystemParameter.g:634:3: '*'
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
    // InternalSystemParameter.g:643:1: rule__AbstractValue__Alternatives : ( ( ruleSingleValue ) | ( ruleArrayValue ) );
    public final void rule__AbstractValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:647:1: ( ( ruleSingleValue ) | ( ruleArrayValue ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)||(LA5_0>=11 && LA5_0<=12)||(LA5_0>=37 && LA5_0<=38)) ) {
                alt5=1;
            }
            else if ( (LA5_0==40) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalSystemParameter.g:648:2: ( ruleSingleValue )
                    {
                    // InternalSystemParameter.g:648:2: ( ruleSingleValue )
                    // InternalSystemParameter.g:649:3: ruleSingleValue
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
                    // InternalSystemParameter.g:654:2: ( ruleArrayValue )
                    {
                    // InternalSystemParameter.g:654:2: ( ruleArrayValue )
                    // InternalSystemParameter.g:655:3: ruleArrayValue
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
    // InternalSystemParameter.g:664:1: rule__SingleValue__Alternatives : ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) );
    public final void rule__SingleValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:668:1: ( ( ( rule__SingleValue__Group_0__0 ) ) | ( ( rule__SingleValue__Group_1__0 ) ) | ( ( rule__SingleValue__Group_2__0 ) ) | ( ( rule__SingleValue__Group_3__0 ) ) | ( ( rule__SingleValue__Group_4__0 ) ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 38:
                {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==RULE_INT) ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2==EOF||LA6_2==RULE_ID||LA6_2==31||LA6_2==36||(LA6_2>=41 && LA6_2<=42)) ) {
                        alt6=1;
                    }
                    else if ( (LA6_2==37) ) {
                        alt6=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA6_1==37) ) {
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

                if ( (LA6_2==EOF||LA6_2==RULE_ID||LA6_2==31||LA6_2==36||(LA6_2>=41 && LA6_2<=42)) ) {
                    alt6=1;
                }
                else if ( (LA6_2==37) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 37:
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
                    // InternalSystemParameter.g:669:2: ( ( rule__SingleValue__Group_0__0 ) )
                    {
                    // InternalSystemParameter.g:669:2: ( ( rule__SingleValue__Group_0__0 ) )
                    // InternalSystemParameter.g:670:3: ( rule__SingleValue__Group_0__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_0()); 
                    // InternalSystemParameter.g:671:3: ( rule__SingleValue__Group_0__0 )
                    // InternalSystemParameter.g:671:4: rule__SingleValue__Group_0__0
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
                    // InternalSystemParameter.g:675:2: ( ( rule__SingleValue__Group_1__0 ) )
                    {
                    // InternalSystemParameter.g:675:2: ( ( rule__SingleValue__Group_1__0 ) )
                    // InternalSystemParameter.g:676:3: ( rule__SingleValue__Group_1__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_1()); 
                    // InternalSystemParameter.g:677:3: ( rule__SingleValue__Group_1__0 )
                    // InternalSystemParameter.g:677:4: rule__SingleValue__Group_1__0
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
                    // InternalSystemParameter.g:681:2: ( ( rule__SingleValue__Group_2__0 ) )
                    {
                    // InternalSystemParameter.g:681:2: ( ( rule__SingleValue__Group_2__0 ) )
                    // InternalSystemParameter.g:682:3: ( rule__SingleValue__Group_2__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_2()); 
                    // InternalSystemParameter.g:683:3: ( rule__SingleValue__Group_2__0 )
                    // InternalSystemParameter.g:683:4: rule__SingleValue__Group_2__0
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
                    // InternalSystemParameter.g:687:2: ( ( rule__SingleValue__Group_3__0 ) )
                    {
                    // InternalSystemParameter.g:687:2: ( ( rule__SingleValue__Group_3__0 ) )
                    // InternalSystemParameter.g:688:3: ( rule__SingleValue__Group_3__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_3()); 
                    // InternalSystemParameter.g:689:3: ( rule__SingleValue__Group_3__0 )
                    // InternalSystemParameter.g:689:4: rule__SingleValue__Group_3__0
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
                    // InternalSystemParameter.g:693:2: ( ( rule__SingleValue__Group_4__0 ) )
                    {
                    // InternalSystemParameter.g:693:2: ( ( rule__SingleValue__Group_4__0 ) )
                    // InternalSystemParameter.g:694:3: ( rule__SingleValue__Group_4__0 )
                    {
                     before(grammarAccess.getSingleValueAccess().getGroup_4()); 
                    // InternalSystemParameter.g:695:3: ( rule__SingleValue__Group_4__0 )
                    // InternalSystemParameter.g:695:4: rule__SingleValue__Group_4__0
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


    // $ANTLR start "rule__PRIMITIVE_TYPE_NAME__Alternatives"
    // InternalSystemParameter.g:703:1: rule__PRIMITIVE_TYPE_NAME__Alternatives : ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) );
    public final void rule__PRIMITIVE_TYPE_NAME__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:707:1: ( ( ( 'Int8' ) ) | ( ( 'Int16' ) ) | ( ( 'Int32' ) ) | ( ( 'Int64' ) ) | ( ( 'UInt8' ) ) | ( ( 'UInt16' ) ) | ( ( 'UInt32' ) ) | ( ( 'UInt64' ) ) | ( ( 'Float' ) ) | ( ( 'Double' ) ) | ( ( 'String' ) ) | ( ( 'Boolean' ) ) )
            int alt7=12;
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
            case 19:
                {
                alt7=4;
                }
                break;
            case 20:
                {
                alt7=5;
                }
                break;
            case 21:
                {
                alt7=6;
                }
                break;
            case 22:
                {
                alt7=7;
                }
                break;
            case 23:
                {
                alt7=8;
                }
                break;
            case 24:
                {
                alt7=9;
                }
                break;
            case 25:
                {
                alt7=10;
                }
                break;
            case 26:
                {
                alt7=11;
                }
                break;
            case 27:
                {
                alt7=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalSystemParameter.g:708:2: ( ( 'Int8' ) )
                    {
                    // InternalSystemParameter.g:708:2: ( ( 'Int8' ) )
                    // InternalSystemParameter.g:709:3: ( 'Int8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 
                    // InternalSystemParameter.g:710:3: ( 'Int8' )
                    // InternalSystemParameter.g:710:4: 'Int8'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt8EnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalSystemParameter.g:714:2: ( ( 'Int16' ) )
                    {
                    // InternalSystemParameter.g:714:2: ( ( 'Int16' ) )
                    // InternalSystemParameter.g:715:3: ( 'Int16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 
                    // InternalSystemParameter.g:716:3: ( 'Int16' )
                    // InternalSystemParameter.g:716:4: 'Int16'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt16EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalSystemParameter.g:720:2: ( ( 'Int32' ) )
                    {
                    // InternalSystemParameter.g:720:2: ( ( 'Int32' ) )
                    // InternalSystemParameter.g:721:3: ( 'Int32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 
                    // InternalSystemParameter.g:722:3: ( 'Int32' )
                    // InternalSystemParameter.g:722:4: 'Int32'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt32EnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalSystemParameter.g:726:2: ( ( 'Int64' ) )
                    {
                    // InternalSystemParameter.g:726:2: ( ( 'Int64' ) )
                    // InternalSystemParameter.g:727:3: ( 'Int64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 
                    // InternalSystemParameter.g:728:3: ( 'Int64' )
                    // InternalSystemParameter.g:728:4: 'Int64'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getInt64EnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalSystemParameter.g:732:2: ( ( 'UInt8' ) )
                    {
                    // InternalSystemParameter.g:732:2: ( ( 'UInt8' ) )
                    // InternalSystemParameter.g:733:3: ( 'UInt8' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 
                    // InternalSystemParameter.g:734:3: ( 'UInt8' )
                    // InternalSystemParameter.g:734:4: 'UInt8'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt8EnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalSystemParameter.g:738:2: ( ( 'UInt16' ) )
                    {
                    // InternalSystemParameter.g:738:2: ( ( 'UInt16' ) )
                    // InternalSystemParameter.g:739:3: ( 'UInt16' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 
                    // InternalSystemParameter.g:740:3: ( 'UInt16' )
                    // InternalSystemParameter.g:740:4: 'UInt16'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt16EnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalSystemParameter.g:744:2: ( ( 'UInt32' ) )
                    {
                    // InternalSystemParameter.g:744:2: ( ( 'UInt32' ) )
                    // InternalSystemParameter.g:745:3: ( 'UInt32' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 
                    // InternalSystemParameter.g:746:3: ( 'UInt32' )
                    // InternalSystemParameter.g:746:4: 'UInt32'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt32EnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalSystemParameter.g:750:2: ( ( 'UInt64' ) )
                    {
                    // InternalSystemParameter.g:750:2: ( ( 'UInt64' ) )
                    // InternalSystemParameter.g:751:3: ( 'UInt64' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 
                    // InternalSystemParameter.g:752:3: ( 'UInt64' )
                    // InternalSystemParameter.g:752:4: 'UInt64'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getUInt64EnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalSystemParameter.g:756:2: ( ( 'Float' ) )
                    {
                    // InternalSystemParameter.g:756:2: ( ( 'Float' ) )
                    // InternalSystemParameter.g:757:3: ( 'Float' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 
                    // InternalSystemParameter.g:758:3: ( 'Float' )
                    // InternalSystemParameter.g:758:4: 'Float'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getFloatEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalSystemParameter.g:762:2: ( ( 'Double' ) )
                    {
                    // InternalSystemParameter.g:762:2: ( ( 'Double' ) )
                    // InternalSystemParameter.g:763:3: ( 'Double' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 
                    // InternalSystemParameter.g:764:3: ( 'Double' )
                    // InternalSystemParameter.g:764:4: 'Double'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getDoubleEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalSystemParameter.g:768:2: ( ( 'String' ) )
                    {
                    // InternalSystemParameter.g:768:2: ( ( 'String' ) )
                    // InternalSystemParameter.g:769:3: ( 'String' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 
                    // InternalSystemParameter.g:770:3: ( 'String' )
                    // InternalSystemParameter.g:770:4: 'String'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getStringEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalSystemParameter.g:774:2: ( ( 'Boolean' ) )
                    {
                    // InternalSystemParameter.g:774:2: ( ( 'Boolean' ) )
                    // InternalSystemParameter.g:775:3: ( 'Boolean' )
                    {
                     before(grammarAccess.getPRIMITIVE_TYPE_NAMEAccess().getBooleanEnumLiteralDeclaration_11()); 
                    // InternalSystemParameter.g:776:3: ( 'Boolean' )
                    // InternalSystemParameter.g:776:4: 'Boolean'
                    {
                    match(input,27,FOLLOW_2); 

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


    // $ANTLR start "rule__SystemParamModel__Group__0"
    // InternalSystemParameter.g:784:1: rule__SystemParamModel__Group__0 : rule__SystemParamModel__Group__0__Impl rule__SystemParamModel__Group__1 ;
    public final void rule__SystemParamModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:788:1: ( rule__SystemParamModel__Group__0__Impl rule__SystemParamModel__Group__1 )
            // InternalSystemParameter.g:789:2: rule__SystemParamModel__Group__0__Impl rule__SystemParamModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__SystemParamModel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemParamModel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__0"


    // $ANTLR start "rule__SystemParamModel__Group__0__Impl"
    // InternalSystemParameter.g:796:1: rule__SystemParamModel__Group__0__Impl : ( () ) ;
    public final void rule__SystemParamModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:800:1: ( ( () ) )
            // InternalSystemParameter.g:801:1: ( () )
            {
            // InternalSystemParameter.g:801:1: ( () )
            // InternalSystemParameter.g:802:2: ()
            {
             before(grammarAccess.getSystemParamModelAccess().getSystemParamModelAction_0()); 
            // InternalSystemParameter.g:803:2: ()
            // InternalSystemParameter.g:803:3: 
            {
            }

             after(grammarAccess.getSystemParamModelAccess().getSystemParamModelAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__0__Impl"


    // $ANTLR start "rule__SystemParamModel__Group__1"
    // InternalSystemParameter.g:811:1: rule__SystemParamModel__Group__1 : rule__SystemParamModel__Group__1__Impl rule__SystemParamModel__Group__2 ;
    public final void rule__SystemParamModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:815:1: ( rule__SystemParamModel__Group__1__Impl rule__SystemParamModel__Group__2 )
            // InternalSystemParameter.g:816:2: rule__SystemParamModel__Group__1__Impl rule__SystemParamModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__SystemParamModel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemParamModel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__1"


    // $ANTLR start "rule__SystemParamModel__Group__1__Impl"
    // InternalSystemParameter.g:823:1: rule__SystemParamModel__Group__1__Impl : ( 'SystemParameterModel' ) ;
    public final void rule__SystemParamModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:827:1: ( ( 'SystemParameterModel' ) )
            // InternalSystemParameter.g:828:1: ( 'SystemParameterModel' )
            {
            // InternalSystemParameter.g:828:1: ( 'SystemParameterModel' )
            // InternalSystemParameter.g:829:2: 'SystemParameterModel'
            {
             before(grammarAccess.getSystemParamModelAccess().getSystemParameterModelKeyword_1()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSystemParamModelAccess().getSystemParameterModelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__1__Impl"


    // $ANTLR start "rule__SystemParamModel__Group__2"
    // InternalSystemParameter.g:838:1: rule__SystemParamModel__Group__2 : rule__SystemParamModel__Group__2__Impl rule__SystemParamModel__Group__3 ;
    public final void rule__SystemParamModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:842:1: ( rule__SystemParamModel__Group__2__Impl rule__SystemParamModel__Group__3 )
            // InternalSystemParameter.g:843:2: rule__SystemParamModel__Group__2__Impl rule__SystemParamModel__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__SystemParamModel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemParamModel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__2"


    // $ANTLR start "rule__SystemParamModel__Group__2__Impl"
    // InternalSystemParameter.g:850:1: rule__SystemParamModel__Group__2__Impl : ( ( rule__SystemParamModel__NameAssignment_2 ) ) ;
    public final void rule__SystemParamModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:854:1: ( ( ( rule__SystemParamModel__NameAssignment_2 ) ) )
            // InternalSystemParameter.g:855:1: ( ( rule__SystemParamModel__NameAssignment_2 ) )
            {
            // InternalSystemParameter.g:855:1: ( ( rule__SystemParamModel__NameAssignment_2 ) )
            // InternalSystemParameter.g:856:2: ( rule__SystemParamModel__NameAssignment_2 )
            {
             before(grammarAccess.getSystemParamModelAccess().getNameAssignment_2()); 
            // InternalSystemParameter.g:857:2: ( rule__SystemParamModel__NameAssignment_2 )
            // InternalSystemParameter.g:857:3: rule__SystemParamModel__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SystemParamModel__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSystemParamModelAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__2__Impl"


    // $ANTLR start "rule__SystemParamModel__Group__3"
    // InternalSystemParameter.g:865:1: rule__SystemParamModel__Group__3 : rule__SystemParamModel__Group__3__Impl rule__SystemParamModel__Group__4 ;
    public final void rule__SystemParamModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:869:1: ( rule__SystemParamModel__Group__3__Impl rule__SystemParamModel__Group__4 )
            // InternalSystemParameter.g:870:2: rule__SystemParamModel__Group__3__Impl rule__SystemParamModel__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__SystemParamModel__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemParamModel__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__3"


    // $ANTLR start "rule__SystemParamModel__Group__3__Impl"
    // InternalSystemParameter.g:877:1: rule__SystemParamModel__Group__3__Impl : ( 'extendsSystem' ) ;
    public final void rule__SystemParamModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:881:1: ( ( 'extendsSystem' ) )
            // InternalSystemParameter.g:882:1: ( 'extendsSystem' )
            {
            // InternalSystemParameter.g:882:1: ( 'extendsSystem' )
            // InternalSystemParameter.g:883:2: 'extendsSystem'
            {
             before(grammarAccess.getSystemParamModelAccess().getExtendsSystemKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSystemParamModelAccess().getExtendsSystemKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__3__Impl"


    // $ANTLR start "rule__SystemParamModel__Group__4"
    // InternalSystemParameter.g:892:1: rule__SystemParamModel__Group__4 : rule__SystemParamModel__Group__4__Impl rule__SystemParamModel__Group__5 ;
    public final void rule__SystemParamModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:896:1: ( rule__SystemParamModel__Group__4__Impl rule__SystemParamModel__Group__5 )
            // InternalSystemParameter.g:897:2: rule__SystemParamModel__Group__4__Impl rule__SystemParamModel__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__SystemParamModel__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemParamModel__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__4"


    // $ANTLR start "rule__SystemParamModel__Group__4__Impl"
    // InternalSystemParameter.g:904:1: rule__SystemParamModel__Group__4__Impl : ( ( rule__SystemParamModel__SystemAssignment_4 ) ) ;
    public final void rule__SystemParamModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:908:1: ( ( ( rule__SystemParamModel__SystemAssignment_4 ) ) )
            // InternalSystemParameter.g:909:1: ( ( rule__SystemParamModel__SystemAssignment_4 ) )
            {
            // InternalSystemParameter.g:909:1: ( ( rule__SystemParamModel__SystemAssignment_4 ) )
            // InternalSystemParameter.g:910:2: ( rule__SystemParamModel__SystemAssignment_4 )
            {
             before(grammarAccess.getSystemParamModelAccess().getSystemAssignment_4()); 
            // InternalSystemParameter.g:911:2: ( rule__SystemParamModel__SystemAssignment_4 )
            // InternalSystemParameter.g:911:3: rule__SystemParamModel__SystemAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SystemParamModel__SystemAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSystemParamModelAccess().getSystemAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__4__Impl"


    // $ANTLR start "rule__SystemParamModel__Group__5"
    // InternalSystemParameter.g:919:1: rule__SystemParamModel__Group__5 : rule__SystemParamModel__Group__5__Impl rule__SystemParamModel__Group__6 ;
    public final void rule__SystemParamModel__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:923:1: ( rule__SystemParamModel__Group__5__Impl rule__SystemParamModel__Group__6 )
            // InternalSystemParameter.g:924:2: rule__SystemParamModel__Group__5__Impl rule__SystemParamModel__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__SystemParamModel__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemParamModel__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__5"


    // $ANTLR start "rule__SystemParamModel__Group__5__Impl"
    // InternalSystemParameter.g:931:1: rule__SystemParamModel__Group__5__Impl : ( '{' ) ;
    public final void rule__SystemParamModel__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:935:1: ( ( '{' ) )
            // InternalSystemParameter.g:936:1: ( '{' )
            {
            // InternalSystemParameter.g:936:1: ( '{' )
            // InternalSystemParameter.g:937:2: '{'
            {
             before(grammarAccess.getSystemParamModelAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSystemParamModelAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__5__Impl"


    // $ANTLR start "rule__SystemParamModel__Group__6"
    // InternalSystemParameter.g:946:1: rule__SystemParamModel__Group__6 : rule__SystemParamModel__Group__6__Impl rule__SystemParamModel__Group__7 ;
    public final void rule__SystemParamModel__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:950:1: ( rule__SystemParamModel__Group__6__Impl rule__SystemParamModel__Group__7 )
            // InternalSystemParameter.g:951:2: rule__SystemParamModel__Group__6__Impl rule__SystemParamModel__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__SystemParamModel__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SystemParamModel__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__6"


    // $ANTLR start "rule__SystemParamModel__Group__6__Impl"
    // InternalSystemParameter.g:958:1: rule__SystemParamModel__Group__6__Impl : ( ( rule__SystemParamModel__ComponentsAssignment_6 )* ) ;
    public final void rule__SystemParamModel__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:962:1: ( ( ( rule__SystemParamModel__ComponentsAssignment_6 )* ) )
            // InternalSystemParameter.g:963:1: ( ( rule__SystemParamModel__ComponentsAssignment_6 )* )
            {
            // InternalSystemParameter.g:963:1: ( ( rule__SystemParamModel__ComponentsAssignment_6 )* )
            // InternalSystemParameter.g:964:2: ( rule__SystemParamModel__ComponentsAssignment_6 )*
            {
             before(grammarAccess.getSystemParamModelAccess().getComponentsAssignment_6()); 
            // InternalSystemParameter.g:965:2: ( rule__SystemParamModel__ComponentsAssignment_6 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==32) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalSystemParameter.g:965:3: rule__SystemParamModel__ComponentsAssignment_6
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__SystemParamModel__ComponentsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getSystemParamModelAccess().getComponentsAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__6__Impl"


    // $ANTLR start "rule__SystemParamModel__Group__7"
    // InternalSystemParameter.g:973:1: rule__SystemParamModel__Group__7 : rule__SystemParamModel__Group__7__Impl ;
    public final void rule__SystemParamModel__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:977:1: ( rule__SystemParamModel__Group__7__Impl )
            // InternalSystemParameter.g:978:2: rule__SystemParamModel__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SystemParamModel__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__7"


    // $ANTLR start "rule__SystemParamModel__Group__7__Impl"
    // InternalSystemParameter.g:984:1: rule__SystemParamModel__Group__7__Impl : ( '}' ) ;
    public final void rule__SystemParamModel__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:988:1: ( ( '}' ) )
            // InternalSystemParameter.g:989:1: ( '}' )
            {
            // InternalSystemParameter.g:989:1: ( '}' )
            // InternalSystemParameter.g:990:2: '}'
            {
             before(grammarAccess.getSystemParamModelAccess().getRightCurlyBracketKeyword_7()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getSystemParamModelAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__Group__7__Impl"


    // $ANTLR start "rule__ComponentParameterInstance__Group__0"
    // InternalSystemParameter.g:1000:1: rule__ComponentParameterInstance__Group__0 : rule__ComponentParameterInstance__Group__0__Impl rule__ComponentParameterInstance__Group__1 ;
    public final void rule__ComponentParameterInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1004:1: ( rule__ComponentParameterInstance__Group__0__Impl rule__ComponentParameterInstance__Group__1 )
            // InternalSystemParameter.g:1005:2: rule__ComponentParameterInstance__Group__0__Impl rule__ComponentParameterInstance__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ComponentParameterInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentParameterInstance__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__0"


    // $ANTLR start "rule__ComponentParameterInstance__Group__0__Impl"
    // InternalSystemParameter.g:1012:1: rule__ComponentParameterInstance__Group__0__Impl : ( 'ComponentParameterInstance' ) ;
    public final void rule__ComponentParameterInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1016:1: ( ( 'ComponentParameterInstance' ) )
            // InternalSystemParameter.g:1017:1: ( 'ComponentParameterInstance' )
            {
            // InternalSystemParameter.g:1017:1: ( 'ComponentParameterInstance' )
            // InternalSystemParameter.g:1018:2: 'ComponentParameterInstance'
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentParameterInstanceKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getComponentParameterInstanceAccess().getComponentParameterInstanceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__0__Impl"


    // $ANTLR start "rule__ComponentParameterInstance__Group__1"
    // InternalSystemParameter.g:1027:1: rule__ComponentParameterInstance__Group__1 : rule__ComponentParameterInstance__Group__1__Impl rule__ComponentParameterInstance__Group__2 ;
    public final void rule__ComponentParameterInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1031:1: ( rule__ComponentParameterInstance__Group__1__Impl rule__ComponentParameterInstance__Group__2 )
            // InternalSystemParameter.g:1032:2: rule__ComponentParameterInstance__Group__1__Impl rule__ComponentParameterInstance__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__ComponentParameterInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentParameterInstance__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__1"


    // $ANTLR start "rule__ComponentParameterInstance__Group__1__Impl"
    // InternalSystemParameter.g:1039:1: rule__ComponentParameterInstance__Group__1__Impl : ( ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 ) ) ;
    public final void rule__ComponentParameterInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1043:1: ( ( ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 ) ) )
            // InternalSystemParameter.g:1044:1: ( ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 ) )
            {
            // InternalSystemParameter.g:1044:1: ( ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 ) )
            // InternalSystemParameter.g:1045:2: ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 )
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentInstanceAssignment_1()); 
            // InternalSystemParameter.g:1046:2: ( rule__ComponentParameterInstance__ComponentInstanceAssignment_1 )
            // InternalSystemParameter.g:1046:3: rule__ComponentParameterInstance__ComponentInstanceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentParameterInstance__ComponentInstanceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentParameterInstanceAccess().getComponentInstanceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__1__Impl"


    // $ANTLR start "rule__ComponentParameterInstance__Group__2"
    // InternalSystemParameter.g:1054:1: rule__ComponentParameterInstance__Group__2 : rule__ComponentParameterInstance__Group__2__Impl rule__ComponentParameterInstance__Group__3 ;
    public final void rule__ComponentParameterInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1058:1: ( rule__ComponentParameterInstance__Group__2__Impl rule__ComponentParameterInstance__Group__3 )
            // InternalSystemParameter.g:1059:2: rule__ComponentParameterInstance__Group__2__Impl rule__ComponentParameterInstance__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__ComponentParameterInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentParameterInstance__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__2"


    // $ANTLR start "rule__ComponentParameterInstance__Group__2__Impl"
    // InternalSystemParameter.g:1066:1: rule__ComponentParameterInstance__Group__2__Impl : ( ( rule__ComponentParameterInstance__Group_2__0 )? ) ;
    public final void rule__ComponentParameterInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1070:1: ( ( ( rule__ComponentParameterInstance__Group_2__0 )? ) )
            // InternalSystemParameter.g:1071:1: ( ( rule__ComponentParameterInstance__Group_2__0 )? )
            {
            // InternalSystemParameter.g:1071:1: ( ( rule__ComponentParameterInstance__Group_2__0 )? )
            // InternalSystemParameter.g:1072:2: ( rule__ComponentParameterInstance__Group_2__0 )?
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getGroup_2()); 
            // InternalSystemParameter.g:1073:2: ( rule__ComponentParameterInstance__Group_2__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==33) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSystemParameter.g:1073:3: rule__ComponentParameterInstance__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentParameterInstance__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentParameterInstanceAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__2__Impl"


    // $ANTLR start "rule__ComponentParameterInstance__Group__3"
    // InternalSystemParameter.g:1081:1: rule__ComponentParameterInstance__Group__3 : rule__ComponentParameterInstance__Group__3__Impl rule__ComponentParameterInstance__Group__4 ;
    public final void rule__ComponentParameterInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1085:1: ( rule__ComponentParameterInstance__Group__3__Impl rule__ComponentParameterInstance__Group__4 )
            // InternalSystemParameter.g:1086:2: rule__ComponentParameterInstance__Group__3__Impl rule__ComponentParameterInstance__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__ComponentParameterInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentParameterInstance__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__3"


    // $ANTLR start "rule__ComponentParameterInstance__Group__3__Impl"
    // InternalSystemParameter.g:1093:1: rule__ComponentParameterInstance__Group__3__Impl : ( '{' ) ;
    public final void rule__ComponentParameterInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1097:1: ( ( '{' ) )
            // InternalSystemParameter.g:1098:1: ( '{' )
            {
            // InternalSystemParameter.g:1098:1: ( '{' )
            // InternalSystemParameter.g:1099:2: '{'
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComponentParameterInstanceAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__3__Impl"


    // $ANTLR start "rule__ComponentParameterInstance__Group__4"
    // InternalSystemParameter.g:1108:1: rule__ComponentParameterInstance__Group__4 : rule__ComponentParameterInstance__Group__4__Impl rule__ComponentParameterInstance__Group__5 ;
    public final void rule__ComponentParameterInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1112:1: ( rule__ComponentParameterInstance__Group__4__Impl rule__ComponentParameterInstance__Group__5 )
            // InternalSystemParameter.g:1113:2: rule__ComponentParameterInstance__Group__4__Impl rule__ComponentParameterInstance__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__ComponentParameterInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentParameterInstance__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__4"


    // $ANTLR start "rule__ComponentParameterInstance__Group__4__Impl"
    // InternalSystemParameter.g:1120:1: rule__ComponentParameterInstance__Group__4__Impl : ( ( rule__ComponentParameterInstance__ParametersAssignment_4 )* ) ;
    public final void rule__ComponentParameterInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1124:1: ( ( ( rule__ComponentParameterInstance__ParametersAssignment_4 )* ) )
            // InternalSystemParameter.g:1125:1: ( ( rule__ComponentParameterInstance__ParametersAssignment_4 )* )
            {
            // InternalSystemParameter.g:1125:1: ( ( rule__ComponentParameterInstance__ParametersAssignment_4 )* )
            // InternalSystemParameter.g:1126:2: ( rule__ComponentParameterInstance__ParametersAssignment_4 )*
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getParametersAssignment_4()); 
            // InternalSystemParameter.g:1127:2: ( rule__ComponentParameterInstance__ParametersAssignment_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==34) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalSystemParameter.g:1127:3: rule__ComponentParameterInstance__ParametersAssignment_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ComponentParameterInstance__ParametersAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getComponentParameterInstanceAccess().getParametersAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__4__Impl"


    // $ANTLR start "rule__ComponentParameterInstance__Group__5"
    // InternalSystemParameter.g:1135:1: rule__ComponentParameterInstance__Group__5 : rule__ComponentParameterInstance__Group__5__Impl ;
    public final void rule__ComponentParameterInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1139:1: ( rule__ComponentParameterInstance__Group__5__Impl )
            // InternalSystemParameter.g:1140:2: rule__ComponentParameterInstance__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentParameterInstance__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__5"


    // $ANTLR start "rule__ComponentParameterInstance__Group__5__Impl"
    // InternalSystemParameter.g:1146:1: rule__ComponentParameterInstance__Group__5__Impl : ( '}' ) ;
    public final void rule__ComponentParameterInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1150:1: ( ( '}' ) )
            // InternalSystemParameter.g:1151:1: ( '}' )
            {
            // InternalSystemParameter.g:1151:1: ( '}' )
            // InternalSystemParameter.g:1152:2: '}'
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getComponentParameterInstanceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group__5__Impl"


    // $ANTLR start "rule__ComponentParameterInstance__Group_2__0"
    // InternalSystemParameter.g:1162:1: rule__ComponentParameterInstance__Group_2__0 : rule__ComponentParameterInstance__Group_2__0__Impl rule__ComponentParameterInstance__Group_2__1 ;
    public final void rule__ComponentParameterInstance__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1166:1: ( rule__ComponentParameterInstance__Group_2__0__Impl rule__ComponentParameterInstance__Group_2__1 )
            // InternalSystemParameter.g:1167:2: rule__ComponentParameterInstance__Group_2__0__Impl rule__ComponentParameterInstance__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__ComponentParameterInstance__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentParameterInstance__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group_2__0"


    // $ANTLR start "rule__ComponentParameterInstance__Group_2__0__Impl"
    // InternalSystemParameter.g:1174:1: rule__ComponentParameterInstance__Group_2__0__Impl : ( 'refinesParamStruct' ) ;
    public final void rule__ComponentParameterInstance__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1178:1: ( ( 'refinesParamStruct' ) )
            // InternalSystemParameter.g:1179:1: ( 'refinesParamStruct' )
            {
            // InternalSystemParameter.g:1179:1: ( 'refinesParamStruct' )
            // InternalSystemParameter.g:1180:2: 'refinesParamStruct'
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getRefinesParamStructKeyword_2_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getComponentParameterInstanceAccess().getRefinesParamStructKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group_2__0__Impl"


    // $ANTLR start "rule__ComponentParameterInstance__Group_2__1"
    // InternalSystemParameter.g:1189:1: rule__ComponentParameterInstance__Group_2__1 : rule__ComponentParameterInstance__Group_2__1__Impl ;
    public final void rule__ComponentParameterInstance__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1193:1: ( rule__ComponentParameterInstance__Group_2__1__Impl )
            // InternalSystemParameter.g:1194:2: rule__ComponentParameterInstance__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentParameterInstance__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group_2__1"


    // $ANTLR start "rule__ComponentParameterInstance__Group_2__1__Impl"
    // InternalSystemParameter.g:1200:1: rule__ComponentParameterInstance__Group_2__1__Impl : ( ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 ) ) ;
    public final void rule__ComponentParameterInstance__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1204:1: ( ( ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 ) ) )
            // InternalSystemParameter.g:1205:1: ( ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 ) )
            {
            // InternalSystemParameter.g:1205:1: ( ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 ) )
            // InternalSystemParameter.g:1206:2: ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 )
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentParamAssignment_2_1()); 
            // InternalSystemParameter.g:1207:2: ( rule__ComponentParameterInstance__ComponentParamAssignment_2_1 )
            // InternalSystemParameter.g:1207:3: rule__ComponentParameterInstance__ComponentParamAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentParameterInstance__ComponentParamAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentParameterInstanceAccess().getComponentParamAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__Group_2__1__Impl"


    // $ANTLR start "rule__ParameterRefinement__Group__0"
    // InternalSystemParameter.g:1216:1: rule__ParameterRefinement__Group__0 : rule__ParameterRefinement__Group__0__Impl rule__ParameterRefinement__Group__1 ;
    public final void rule__ParameterRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1220:1: ( rule__ParameterRefinement__Group__0__Impl rule__ParameterRefinement__Group__1 )
            // InternalSystemParameter.g:1221:2: rule__ParameterRefinement__Group__0__Impl rule__ParameterRefinement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__ParameterRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__0"


    // $ANTLR start "rule__ParameterRefinement__Group__0__Impl"
    // InternalSystemParameter.g:1228:1: rule__ParameterRefinement__Group__0__Impl : ( 'ParameterRefinement' ) ;
    public final void rule__ParameterRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1232:1: ( ( 'ParameterRefinement' ) )
            // InternalSystemParameter.g:1233:1: ( 'ParameterRefinement' )
            {
            // InternalSystemParameter.g:1233:1: ( 'ParameterRefinement' )
            // InternalSystemParameter.g:1234:2: 'ParameterRefinement'
            {
             before(grammarAccess.getParameterRefinementAccess().getParameterRefinementKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getParameterRefinementAccess().getParameterRefinementKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__0__Impl"


    // $ANTLR start "rule__ParameterRefinement__Group__1"
    // InternalSystemParameter.g:1243:1: rule__ParameterRefinement__Group__1 : rule__ParameterRefinement__Group__1__Impl rule__ParameterRefinement__Group__2 ;
    public final void rule__ParameterRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1247:1: ( rule__ParameterRefinement__Group__1__Impl rule__ParameterRefinement__Group__2 )
            // InternalSystemParameter.g:1248:2: rule__ParameterRefinement__Group__1__Impl rule__ParameterRefinement__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__ParameterRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__1"


    // $ANTLR start "rule__ParameterRefinement__Group__1__Impl"
    // InternalSystemParameter.g:1255:1: rule__ParameterRefinement__Group__1__Impl : ( ( rule__ParameterRefinement__ParameterAssignment_1 ) ) ;
    public final void rule__ParameterRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1259:1: ( ( ( rule__ParameterRefinement__ParameterAssignment_1 ) ) )
            // InternalSystemParameter.g:1260:1: ( ( rule__ParameterRefinement__ParameterAssignment_1 ) )
            {
            // InternalSystemParameter.g:1260:1: ( ( rule__ParameterRefinement__ParameterAssignment_1 ) )
            // InternalSystemParameter.g:1261:2: ( rule__ParameterRefinement__ParameterAssignment_1 )
            {
             before(grammarAccess.getParameterRefinementAccess().getParameterAssignment_1()); 
            // InternalSystemParameter.g:1262:2: ( rule__ParameterRefinement__ParameterAssignment_1 )
            // InternalSystemParameter.g:1262:3: rule__ParameterRefinement__ParameterAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterRefinement__ParameterAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParameterRefinementAccess().getParameterAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__1__Impl"


    // $ANTLR start "rule__ParameterRefinement__Group__2"
    // InternalSystemParameter.g:1270:1: rule__ParameterRefinement__Group__2 : rule__ParameterRefinement__Group__2__Impl rule__ParameterRefinement__Group__3 ;
    public final void rule__ParameterRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1274:1: ( rule__ParameterRefinement__Group__2__Impl rule__ParameterRefinement__Group__3 )
            // InternalSystemParameter.g:1275:2: rule__ParameterRefinement__Group__2__Impl rule__ParameterRefinement__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ParameterRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterRefinement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__2"


    // $ANTLR start "rule__ParameterRefinement__Group__2__Impl"
    // InternalSystemParameter.g:1282:1: rule__ParameterRefinement__Group__2__Impl : ( '{' ) ;
    public final void rule__ParameterRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1286:1: ( ( '{' ) )
            // InternalSystemParameter.g:1287:1: ( '{' )
            {
            // InternalSystemParameter.g:1287:1: ( '{' )
            // InternalSystemParameter.g:1288:2: '{'
            {
             before(grammarAccess.getParameterRefinementAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getParameterRefinementAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__2__Impl"


    // $ANTLR start "rule__ParameterRefinement__Group__3"
    // InternalSystemParameter.g:1297:1: rule__ParameterRefinement__Group__3 : rule__ParameterRefinement__Group__3__Impl rule__ParameterRefinement__Group__4 ;
    public final void rule__ParameterRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1301:1: ( rule__ParameterRefinement__Group__3__Impl rule__ParameterRefinement__Group__4 )
            // InternalSystemParameter.g:1302:2: rule__ParameterRefinement__Group__3__Impl rule__ParameterRefinement__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__ParameterRefinement__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ParameterRefinement__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__3"


    // $ANTLR start "rule__ParameterRefinement__Group__3__Impl"
    // InternalSystemParameter.g:1309:1: rule__ParameterRefinement__Group__3__Impl : ( ( rule__ParameterRefinement__AttributesAssignment_3 )* ) ;
    public final void rule__ParameterRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1313:1: ( ( ( rule__ParameterRefinement__AttributesAssignment_3 )* ) )
            // InternalSystemParameter.g:1314:1: ( ( rule__ParameterRefinement__AttributesAssignment_3 )* )
            {
            // InternalSystemParameter.g:1314:1: ( ( rule__ParameterRefinement__AttributesAssignment_3 )* )
            // InternalSystemParameter.g:1315:2: ( rule__ParameterRefinement__AttributesAssignment_3 )*
            {
             before(grammarAccess.getParameterRefinementAccess().getAttributesAssignment_3()); 
            // InternalSystemParameter.g:1316:2: ( rule__ParameterRefinement__AttributesAssignment_3 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSystemParameter.g:1316:3: rule__ParameterRefinement__AttributesAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ParameterRefinement__AttributesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getParameterRefinementAccess().getAttributesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__3__Impl"


    // $ANTLR start "rule__ParameterRefinement__Group__4"
    // InternalSystemParameter.g:1324:1: rule__ParameterRefinement__Group__4 : rule__ParameterRefinement__Group__4__Impl ;
    public final void rule__ParameterRefinement__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1328:1: ( rule__ParameterRefinement__Group__4__Impl )
            // InternalSystemParameter.g:1329:2: rule__ParameterRefinement__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterRefinement__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__4"


    // $ANTLR start "rule__ParameterRefinement__Group__4__Impl"
    // InternalSystemParameter.g:1335:1: rule__ParameterRefinement__Group__4__Impl : ( '}' ) ;
    public final void rule__ParameterRefinement__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1339:1: ( ( '}' ) )
            // InternalSystemParameter.g:1340:1: ( '}' )
            {
            // InternalSystemParameter.g:1340:1: ( '}' )
            // InternalSystemParameter.g:1341:2: '}'
            {
             before(grammarAccess.getParameterRefinementAccess().getRightCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getParameterRefinementAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__Group__4__Impl"


    // $ANTLR start "rule__AttributeRefinement__Group__0"
    // InternalSystemParameter.g:1351:1: rule__AttributeRefinement__Group__0 : rule__AttributeRefinement__Group__0__Impl rule__AttributeRefinement__Group__1 ;
    public final void rule__AttributeRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1355:1: ( rule__AttributeRefinement__Group__0__Impl rule__AttributeRefinement__Group__1 )
            // InternalSystemParameter.g:1356:2: rule__AttributeRefinement__Group__0__Impl rule__AttributeRefinement__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__AttributeRefinement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeRefinement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__Group__0"


    // $ANTLR start "rule__AttributeRefinement__Group__0__Impl"
    // InternalSystemParameter.g:1363:1: rule__AttributeRefinement__Group__0__Impl : ( ( rule__AttributeRefinement__AttributeAssignment_0 ) ) ;
    public final void rule__AttributeRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1367:1: ( ( ( rule__AttributeRefinement__AttributeAssignment_0 ) ) )
            // InternalSystemParameter.g:1368:1: ( ( rule__AttributeRefinement__AttributeAssignment_0 ) )
            {
            // InternalSystemParameter.g:1368:1: ( ( rule__AttributeRefinement__AttributeAssignment_0 ) )
            // InternalSystemParameter.g:1369:2: ( rule__AttributeRefinement__AttributeAssignment_0 )
            {
             before(grammarAccess.getAttributeRefinementAccess().getAttributeAssignment_0()); 
            // InternalSystemParameter.g:1370:2: ( rule__AttributeRefinement__AttributeAssignment_0 )
            // InternalSystemParameter.g:1370:3: rule__AttributeRefinement__AttributeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AttributeRefinement__AttributeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRefinementAccess().getAttributeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__Group__0__Impl"


    // $ANTLR start "rule__AttributeRefinement__Group__1"
    // InternalSystemParameter.g:1378:1: rule__AttributeRefinement__Group__1 : rule__AttributeRefinement__Group__1__Impl rule__AttributeRefinement__Group__2 ;
    public final void rule__AttributeRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1382:1: ( rule__AttributeRefinement__Group__1__Impl rule__AttributeRefinement__Group__2 )
            // InternalSystemParameter.g:1383:2: rule__AttributeRefinement__Group__1__Impl rule__AttributeRefinement__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__AttributeRefinement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeRefinement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__Group__1"


    // $ANTLR start "rule__AttributeRefinement__Group__1__Impl"
    // InternalSystemParameter.g:1390:1: rule__AttributeRefinement__Group__1__Impl : ( '=' ) ;
    public final void rule__AttributeRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1394:1: ( ( '=' ) )
            // InternalSystemParameter.g:1395:1: ( '=' )
            {
            // InternalSystemParameter.g:1395:1: ( '=' )
            // InternalSystemParameter.g:1396:2: '='
            {
             before(grammarAccess.getAttributeRefinementAccess().getEqualsSignKeyword_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAttributeRefinementAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__Group__1__Impl"


    // $ANTLR start "rule__AttributeRefinement__Group__2"
    // InternalSystemParameter.g:1405:1: rule__AttributeRefinement__Group__2 : rule__AttributeRefinement__Group__2__Impl rule__AttributeRefinement__Group__3 ;
    public final void rule__AttributeRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1409:1: ( rule__AttributeRefinement__Group__2__Impl rule__AttributeRefinement__Group__3 )
            // InternalSystemParameter.g:1410:2: rule__AttributeRefinement__Group__2__Impl rule__AttributeRefinement__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__AttributeRefinement__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AttributeRefinement__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__Group__2"


    // $ANTLR start "rule__AttributeRefinement__Group__2__Impl"
    // InternalSystemParameter.g:1417:1: rule__AttributeRefinement__Group__2__Impl : ( ( rule__AttributeRefinement__ValueAssignment_2 ) ) ;
    public final void rule__AttributeRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1421:1: ( ( ( rule__AttributeRefinement__ValueAssignment_2 ) ) )
            // InternalSystemParameter.g:1422:1: ( ( rule__AttributeRefinement__ValueAssignment_2 ) )
            {
            // InternalSystemParameter.g:1422:1: ( ( rule__AttributeRefinement__ValueAssignment_2 ) )
            // InternalSystemParameter.g:1423:2: ( rule__AttributeRefinement__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeRefinementAccess().getValueAssignment_2()); 
            // InternalSystemParameter.g:1424:2: ( rule__AttributeRefinement__ValueAssignment_2 )
            // InternalSystemParameter.g:1424:3: rule__AttributeRefinement__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__AttributeRefinement__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeRefinementAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__Group__2__Impl"


    // $ANTLR start "rule__AttributeRefinement__Group__3"
    // InternalSystemParameter.g:1432:1: rule__AttributeRefinement__Group__3 : rule__AttributeRefinement__Group__3__Impl ;
    public final void rule__AttributeRefinement__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1436:1: ( rule__AttributeRefinement__Group__3__Impl )
            // InternalSystemParameter.g:1437:2: rule__AttributeRefinement__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AttributeRefinement__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__Group__3"


    // $ANTLR start "rule__AttributeRefinement__Group__3__Impl"
    // InternalSystemParameter.g:1443:1: rule__AttributeRefinement__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__AttributeRefinement__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1447:1: ( ( ( ';' )? ) )
            // InternalSystemParameter.g:1448:1: ( ( ';' )? )
            {
            // InternalSystemParameter.g:1448:1: ( ( ';' )? )
            // InternalSystemParameter.g:1449:2: ( ';' )?
            {
             before(grammarAccess.getAttributeRefinementAccess().getSemicolonKeyword_3()); 
            // InternalSystemParameter.g:1450:2: ( ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==36) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalSystemParameter.g:1450:3: ';'
                    {
                    match(input,36,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeRefinementAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__Group__3__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalSystemParameter.g:1459:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1463:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalSystemParameter.g:1464:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalSystemParameter.g:1471:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1475:1: ( ( RULE_ID ) )
            // InternalSystemParameter.g:1476:1: ( RULE_ID )
            {
            // InternalSystemParameter.g:1476:1: ( RULE_ID )
            // InternalSystemParameter.g:1477:2: RULE_ID
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
    // InternalSystemParameter.g:1486:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1490:1: ( rule__FQN__Group__1__Impl )
            // InternalSystemParameter.g:1491:2: rule__FQN__Group__1__Impl
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
    // InternalSystemParameter.g:1497:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1501:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalSystemParameter.g:1502:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalSystemParameter.g:1502:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalSystemParameter.g:1503:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalSystemParameter.g:1504:2: ( rule__FQN__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==37) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalSystemParameter.g:1504:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalSystemParameter.g:1513:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1517:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalSystemParameter.g:1518:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
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
    // InternalSystemParameter.g:1525:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1529:1: ( ( '.' ) )
            // InternalSystemParameter.g:1530:1: ( '.' )
            {
            // InternalSystemParameter.g:1530:1: ( '.' )
            // InternalSystemParameter.g:1531:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSystemParameter.g:1540:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1544:1: ( rule__FQN__Group_1__1__Impl )
            // InternalSystemParameter.g:1545:2: rule__FQN__Group_1__1__Impl
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
    // InternalSystemParameter.g:1551:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1555:1: ( ( RULE_ID ) )
            // InternalSystemParameter.g:1556:1: ( RULE_ID )
            {
            // InternalSystemParameter.g:1556:1: ( RULE_ID )
            // InternalSystemParameter.g:1557:2: RULE_ID
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
    // InternalSystemParameter.g:1567:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1571:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // InternalSystemParameter.g:1572:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
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
    // InternalSystemParameter.g:1579:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1583:1: ( ( ( '-' )? ) )
            // InternalSystemParameter.g:1584:1: ( ( '-' )? )
            {
            // InternalSystemParameter.g:1584:1: ( ( '-' )? )
            // InternalSystemParameter.g:1585:2: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // InternalSystemParameter.g:1586:2: ( '-' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalSystemParameter.g:1586:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

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
    // InternalSystemParameter.g:1594:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1598:1: ( rule__EInt__Group__1__Impl )
            // InternalSystemParameter.g:1599:2: rule__EInt__Group__1__Impl
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
    // InternalSystemParameter.g:1605:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1609:1: ( ( RULE_INT ) )
            // InternalSystemParameter.g:1610:1: ( RULE_INT )
            {
            // InternalSystemParameter.g:1610:1: ( RULE_INT )
            // InternalSystemParameter.g:1611:2: RULE_INT
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
    // InternalSystemParameter.g:1621:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1625:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalSystemParameter.g:1626:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSystemParameter.g:1633:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1637:1: ( ( ( '-' )? ) )
            // InternalSystemParameter.g:1638:1: ( ( '-' )? )
            {
            // InternalSystemParameter.g:1638:1: ( ( '-' )? )
            // InternalSystemParameter.g:1639:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalSystemParameter.g:1640:2: ( '-' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalSystemParameter.g:1640:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

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
    // InternalSystemParameter.g:1648:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1652:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalSystemParameter.g:1653:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalSystemParameter.g:1660:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1664:1: ( ( ( RULE_INT )? ) )
            // InternalSystemParameter.g:1665:1: ( ( RULE_INT )? )
            {
            // InternalSystemParameter.g:1665:1: ( ( RULE_INT )? )
            // InternalSystemParameter.g:1666:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalSystemParameter.g:1667:2: ( RULE_INT )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_INT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSystemParameter.g:1667:3: RULE_INT
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
    // InternalSystemParameter.g:1675:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1679:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalSystemParameter.g:1680:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalSystemParameter.g:1687:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1691:1: ( ( '.' ) )
            // InternalSystemParameter.g:1692:1: ( '.' )
            {
            // InternalSystemParameter.g:1692:1: ( '.' )
            // InternalSystemParameter.g:1693:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,37,FOLLOW_2); 
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
    // InternalSystemParameter.g:1702:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1706:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalSystemParameter.g:1707:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_22);
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
    // InternalSystemParameter.g:1714:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1718:1: ( ( RULE_INT ) )
            // InternalSystemParameter.g:1719:1: ( RULE_INT )
            {
            // InternalSystemParameter.g:1719:1: ( RULE_INT )
            // InternalSystemParameter.g:1720:2: RULE_INT
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
    // InternalSystemParameter.g:1729:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1733:1: ( rule__EDouble__Group__4__Impl )
            // InternalSystemParameter.g:1734:2: rule__EDouble__Group__4__Impl
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
    // InternalSystemParameter.g:1740:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1744:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalSystemParameter.g:1745:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalSystemParameter.g:1745:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalSystemParameter.g:1746:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalSystemParameter.g:1747:2: ( rule__EDouble__Group_4__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=13 && LA17_0<=14)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalSystemParameter.g:1747:3: rule__EDouble__Group_4__0
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
    // InternalSystemParameter.g:1756:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1760:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalSystemParameter.g:1761:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSystemParameter.g:1768:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1772:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalSystemParameter.g:1773:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalSystemParameter.g:1773:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalSystemParameter.g:1774:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalSystemParameter.g:1775:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalSystemParameter.g:1775:3: rule__EDouble__Alternatives_4_0
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
    // InternalSystemParameter.g:1783:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1787:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalSystemParameter.g:1788:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_19);
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
    // InternalSystemParameter.g:1795:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1799:1: ( ( ( '-' )? ) )
            // InternalSystemParameter.g:1800:1: ( ( '-' )? )
            {
            // InternalSystemParameter.g:1800:1: ( ( '-' )? )
            // InternalSystemParameter.g:1801:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalSystemParameter.g:1802:2: ( '-' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalSystemParameter.g:1802:3: '-'
                    {
                    match(input,38,FOLLOW_2); 

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
    // InternalSystemParameter.g:1810:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1814:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalSystemParameter.g:1815:2: rule__EDouble__Group_4__2__Impl
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
    // InternalSystemParameter.g:1821:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1825:1: ( ( RULE_INT ) )
            // InternalSystemParameter.g:1826:1: ( RULE_INT )
            {
            // InternalSystemParameter.g:1826:1: ( RULE_INT )
            // InternalSystemParameter.g:1827:2: RULE_INT
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
    // InternalSystemParameter.g:1837:1: rule__EnumerationElement__Group__0 : rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 ;
    public final void rule__EnumerationElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1841:1: ( rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1 )
            // InternalSystemParameter.g:1842:2: rule__EnumerationElement__Group__0__Impl rule__EnumerationElement__Group__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalSystemParameter.g:1849:1: rule__EnumerationElement__Group__0__Impl : ( ( rule__EnumerationElement__NameAssignment_0 ) ) ;
    public final void rule__EnumerationElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1853:1: ( ( ( rule__EnumerationElement__NameAssignment_0 ) ) )
            // InternalSystemParameter.g:1854:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            {
            // InternalSystemParameter.g:1854:1: ( ( rule__EnumerationElement__NameAssignment_0 ) )
            // InternalSystemParameter.g:1855:2: ( rule__EnumerationElement__NameAssignment_0 )
            {
             before(grammarAccess.getEnumerationElementAccess().getNameAssignment_0()); 
            // InternalSystemParameter.g:1856:2: ( rule__EnumerationElement__NameAssignment_0 )
            // InternalSystemParameter.g:1856:3: rule__EnumerationElement__NameAssignment_0
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
    // InternalSystemParameter.g:1864:1: rule__EnumerationElement__Group__1 : rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 ;
    public final void rule__EnumerationElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1868:1: ( rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2 )
            // InternalSystemParameter.g:1869:2: rule__EnumerationElement__Group__1__Impl rule__EnumerationElement__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalSystemParameter.g:1876:1: rule__EnumerationElement__Group__1__Impl : ( ( rule__EnumerationElement__Group_1__0 )? ) ;
    public final void rule__EnumerationElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1880:1: ( ( ( rule__EnumerationElement__Group_1__0 )? ) )
            // InternalSystemParameter.g:1881:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            {
            // InternalSystemParameter.g:1881:1: ( ( rule__EnumerationElement__Group_1__0 )? )
            // InternalSystemParameter.g:1882:2: ( rule__EnumerationElement__Group_1__0 )?
            {
             before(grammarAccess.getEnumerationElementAccess().getGroup_1()); 
            // InternalSystemParameter.g:1883:2: ( rule__EnumerationElement__Group_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSystemParameter.g:1883:3: rule__EnumerationElement__Group_1__0
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
    // InternalSystemParameter.g:1891:1: rule__EnumerationElement__Group__2 : rule__EnumerationElement__Group__2__Impl ;
    public final void rule__EnumerationElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1895:1: ( rule__EnumerationElement__Group__2__Impl )
            // InternalSystemParameter.g:1896:2: rule__EnumerationElement__Group__2__Impl
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
    // InternalSystemParameter.g:1902:1: rule__EnumerationElement__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__EnumerationElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1906:1: ( ( ( ';' )? ) )
            // InternalSystemParameter.g:1907:1: ( ( ';' )? )
            {
            // InternalSystemParameter.g:1907:1: ( ( ';' )? )
            // InternalSystemParameter.g:1908:2: ( ';' )?
            {
             before(grammarAccess.getEnumerationElementAccess().getSemicolonKeyword_2()); 
            // InternalSystemParameter.g:1909:2: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalSystemParameter.g:1909:3: ';'
                    {
                    match(input,36,FOLLOW_2); 

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
    // InternalSystemParameter.g:1918:1: rule__EnumerationElement__Group_1__0 : rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 ;
    public final void rule__EnumerationElement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1922:1: ( rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1 )
            // InternalSystemParameter.g:1923:2: rule__EnumerationElement__Group_1__0__Impl rule__EnumerationElement__Group_1__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSystemParameter.g:1930:1: rule__EnumerationElement__Group_1__0__Impl : ( '=' ) ;
    public final void rule__EnumerationElement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1934:1: ( ( '=' ) )
            // InternalSystemParameter.g:1935:1: ( '=' )
            {
            // InternalSystemParameter.g:1935:1: ( '=' )
            // InternalSystemParameter.g:1936:2: '='
            {
             before(grammarAccess.getEnumerationElementAccess().getEqualsSignKeyword_1_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalSystemParameter.g:1945:1: rule__EnumerationElement__Group_1__1 : rule__EnumerationElement__Group_1__1__Impl ;
    public final void rule__EnumerationElement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1949:1: ( rule__EnumerationElement__Group_1__1__Impl )
            // InternalSystemParameter.g:1950:2: rule__EnumerationElement__Group_1__1__Impl
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
    // InternalSystemParameter.g:1956:1: rule__EnumerationElement__Group_1__1__Impl : ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) ;
    public final void rule__EnumerationElement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1960:1: ( ( ( rule__EnumerationElement__ValueAssignment_1_1 ) ) )
            // InternalSystemParameter.g:1961:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            {
            // InternalSystemParameter.g:1961:1: ( ( rule__EnumerationElement__ValueAssignment_1_1 ) )
            // InternalSystemParameter.g:1962:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            {
             before(grammarAccess.getEnumerationElementAccess().getValueAssignment_1_1()); 
            // InternalSystemParameter.g:1963:2: ( rule__EnumerationElement__ValueAssignment_1_1 )
            // InternalSystemParameter.g:1963:3: rule__EnumerationElement__ValueAssignment_1_1
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
    // InternalSystemParameter.g:1972:1: rule__InlineEnumerationType__Group__0 : rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 ;
    public final void rule__InlineEnumerationType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1976:1: ( rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1 )
            // InternalSystemParameter.g:1977:2: rule__InlineEnumerationType__Group__0__Impl rule__InlineEnumerationType__Group__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalSystemParameter.g:1984:1: rule__InlineEnumerationType__Group__0__Impl : ( 'InlineEnumeration' ) ;
    public final void rule__InlineEnumerationType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:1988:1: ( ( 'InlineEnumeration' ) )
            // InternalSystemParameter.g:1989:1: ( 'InlineEnumeration' )
            {
            // InternalSystemParameter.g:1989:1: ( 'InlineEnumeration' )
            // InternalSystemParameter.g:1990:2: 'InlineEnumeration'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getInlineEnumerationKeyword_0()); 
            match(input,39,FOLLOW_2); 
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
    // InternalSystemParameter.g:1999:1: rule__InlineEnumerationType__Group__1 : rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 ;
    public final void rule__InlineEnumerationType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2003:1: ( rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2 )
            // InternalSystemParameter.g:2004:2: rule__InlineEnumerationType__Group__1__Impl rule__InlineEnumerationType__Group__2
            {
            pushFollow(FOLLOW_24);
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
    // InternalSystemParameter.g:2011:1: rule__InlineEnumerationType__Group__1__Impl : ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) ;
    public final void rule__InlineEnumerationType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2015:1: ( ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? ) )
            // InternalSystemParameter.g:2016:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            {
            // InternalSystemParameter.g:2016:1: ( ( rule__InlineEnumerationType__ArrayAssignment_1 )? )
            // InternalSystemParameter.g:2017:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getArrayAssignment_1()); 
            // InternalSystemParameter.g:2018:2: ( rule__InlineEnumerationType__ArrayAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==40) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalSystemParameter.g:2018:3: rule__InlineEnumerationType__ArrayAssignment_1
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
    // InternalSystemParameter.g:2026:1: rule__InlineEnumerationType__Group__2 : rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 ;
    public final void rule__InlineEnumerationType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2030:1: ( rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3 )
            // InternalSystemParameter.g:2031:2: rule__InlineEnumerationType__Group__2__Impl rule__InlineEnumerationType__Group__3
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
    // InternalSystemParameter.g:2038:1: rule__InlineEnumerationType__Group__2__Impl : ( '{' ) ;
    public final void rule__InlineEnumerationType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2042:1: ( ( '{' ) )
            // InternalSystemParameter.g:2043:1: ( '{' )
            {
            // InternalSystemParameter.g:2043:1: ( '{' )
            // InternalSystemParameter.g:2044:2: '{'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,30,FOLLOW_2); 
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
    // InternalSystemParameter.g:2053:1: rule__InlineEnumerationType__Group__3 : rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 ;
    public final void rule__InlineEnumerationType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2057:1: ( rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4 )
            // InternalSystemParameter.g:2058:2: rule__InlineEnumerationType__Group__3__Impl rule__InlineEnumerationType__Group__4
            {
            pushFollow(FOLLOW_25);
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
    // InternalSystemParameter.g:2065:1: rule__InlineEnumerationType__Group__3__Impl : ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) ;
    public final void rule__InlineEnumerationType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2069:1: ( ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) ) )
            // InternalSystemParameter.g:2070:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            {
            // InternalSystemParameter.g:2070:1: ( ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* ) )
            // InternalSystemParameter.g:2071:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) ) ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            {
            // InternalSystemParameter.g:2071:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 ) )
            // InternalSystemParameter.g:2072:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalSystemParameter.g:2073:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )
            // InternalSystemParameter.g:2073:4: rule__InlineEnumerationType__EnumsAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__InlineEnumerationType__EnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 

            }

            // InternalSystemParameter.g:2076:2: ( ( rule__InlineEnumerationType__EnumsAssignment_3 )* )
            // InternalSystemParameter.g:2077:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getEnumsAssignment_3()); 
            // InternalSystemParameter.g:2078:3: ( rule__InlineEnumerationType__EnumsAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_ID) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalSystemParameter.g:2078:4: rule__InlineEnumerationType__EnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__InlineEnumerationType__EnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
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
    // InternalSystemParameter.g:2087:1: rule__InlineEnumerationType__Group__4 : rule__InlineEnumerationType__Group__4__Impl ;
    public final void rule__InlineEnumerationType__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2091:1: ( rule__InlineEnumerationType__Group__4__Impl )
            // InternalSystemParameter.g:2092:2: rule__InlineEnumerationType__Group__4__Impl
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
    // InternalSystemParameter.g:2098:1: rule__InlineEnumerationType__Group__4__Impl : ( '}' ) ;
    public final void rule__InlineEnumerationType__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2102:1: ( ( '}' ) )
            // InternalSystemParameter.g:2103:1: ( '}' )
            {
            // InternalSystemParameter.g:2103:1: ( '}' )
            // InternalSystemParameter.g:2104:2: '}'
            {
             before(grammarAccess.getInlineEnumerationTypeAccess().getRightCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_2); 
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
    // InternalSystemParameter.g:2114:1: rule__ArrayType__Group__0 : rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 ;
    public final void rule__ArrayType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2118:1: ( rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1 )
            // InternalSystemParameter.g:2119:2: rule__ArrayType__Group__0__Impl rule__ArrayType__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSystemParameter.g:2126:1: rule__ArrayType__Group__0__Impl : ( () ) ;
    public final void rule__ArrayType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2130:1: ( ( () ) )
            // InternalSystemParameter.g:2131:1: ( () )
            {
            // InternalSystemParameter.g:2131:1: ( () )
            // InternalSystemParameter.g:2132:2: ()
            {
             before(grammarAccess.getArrayTypeAccess().getArrayTypeAction_0()); 
            // InternalSystemParameter.g:2133:2: ()
            // InternalSystemParameter.g:2133:3: 
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
    // InternalSystemParameter.g:2141:1: rule__ArrayType__Group__1 : rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 ;
    public final void rule__ArrayType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2145:1: ( rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2 )
            // InternalSystemParameter.g:2146:2: rule__ArrayType__Group__1__Impl rule__ArrayType__Group__2
            {
            pushFollow(FOLLOW_27);
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
    // InternalSystemParameter.g:2153:1: rule__ArrayType__Group__1__Impl : ( '[' ) ;
    public final void rule__ArrayType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2157:1: ( ( '[' ) )
            // InternalSystemParameter.g:2158:1: ( '[' )
            {
            // InternalSystemParameter.g:2158:1: ( '[' )
            // InternalSystemParameter.g:2159:2: '['
            {
             before(grammarAccess.getArrayTypeAccess().getLeftSquareBracketKeyword_1()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSystemParameter.g:2168:1: rule__ArrayType__Group__2 : rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 ;
    public final void rule__ArrayType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2172:1: ( rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3 )
            // InternalSystemParameter.g:2173:2: rule__ArrayType__Group__2__Impl rule__ArrayType__Group__3
            {
            pushFollow(FOLLOW_27);
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
    // InternalSystemParameter.g:2180:1: rule__ArrayType__Group__2__Impl : ( ( rule__ArrayType__LengthAssignment_2 )? ) ;
    public final void rule__ArrayType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2184:1: ( ( ( rule__ArrayType__LengthAssignment_2 )? ) )
            // InternalSystemParameter.g:2185:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            {
            // InternalSystemParameter.g:2185:1: ( ( rule__ArrayType__LengthAssignment_2 )? )
            // InternalSystemParameter.g:2186:2: ( rule__ArrayType__LengthAssignment_2 )?
            {
             before(grammarAccess.getArrayTypeAccess().getLengthAssignment_2()); 
            // InternalSystemParameter.g:2187:2: ( rule__ArrayType__LengthAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_INT||LA23_0==15) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalSystemParameter.g:2187:3: rule__ArrayType__LengthAssignment_2
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
    // InternalSystemParameter.g:2195:1: rule__ArrayType__Group__3 : rule__ArrayType__Group__3__Impl ;
    public final void rule__ArrayType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2199:1: ( rule__ArrayType__Group__3__Impl )
            // InternalSystemParameter.g:2200:2: rule__ArrayType__Group__3__Impl
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
    // InternalSystemParameter.g:2206:1: rule__ArrayType__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2210:1: ( ( ']' ) )
            // InternalSystemParameter.g:2211:1: ( ']' )
            {
            // InternalSystemParameter.g:2211:1: ( ']' )
            // InternalSystemParameter.g:2212:2: ']'
            {
             before(grammarAccess.getArrayTypeAccess().getRightSquareBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSystemParameter.g:2222:1: rule__PrimitiveType__Group__0 : rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 ;
    public final void rule__PrimitiveType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2226:1: ( rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1 )
            // InternalSystemParameter.g:2227:2: rule__PrimitiveType__Group__0__Impl rule__PrimitiveType__Group__1
            {
            pushFollow(FOLLOW_26);
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
    // InternalSystemParameter.g:2234:1: rule__PrimitiveType__Group__0__Impl : ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) ;
    public final void rule__PrimitiveType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2238:1: ( ( ( rule__PrimitiveType__TypeNameAssignment_0 ) ) )
            // InternalSystemParameter.g:2239:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            {
            // InternalSystemParameter.g:2239:1: ( ( rule__PrimitiveType__TypeNameAssignment_0 ) )
            // InternalSystemParameter.g:2240:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getTypeNameAssignment_0()); 
            // InternalSystemParameter.g:2241:2: ( rule__PrimitiveType__TypeNameAssignment_0 )
            // InternalSystemParameter.g:2241:3: rule__PrimitiveType__TypeNameAssignment_0
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
    // InternalSystemParameter.g:2249:1: rule__PrimitiveType__Group__1 : rule__PrimitiveType__Group__1__Impl ;
    public final void rule__PrimitiveType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2253:1: ( rule__PrimitiveType__Group__1__Impl )
            // InternalSystemParameter.g:2254:2: rule__PrimitiveType__Group__1__Impl
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
    // InternalSystemParameter.g:2260:1: rule__PrimitiveType__Group__1__Impl : ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) ;
    public final void rule__PrimitiveType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2264:1: ( ( ( rule__PrimitiveType__ArrayAssignment_1 )? ) )
            // InternalSystemParameter.g:2265:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            {
            // InternalSystemParameter.g:2265:1: ( ( rule__PrimitiveType__ArrayAssignment_1 )? )
            // InternalSystemParameter.g:2266:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getPrimitiveTypeAccess().getArrayAssignment_1()); 
            // InternalSystemParameter.g:2267:2: ( rule__PrimitiveType__ArrayAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSystemParameter.g:2267:3: rule__PrimitiveType__ArrayAssignment_1
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
    // InternalSystemParameter.g:2276:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2280:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalSystemParameter.g:2281:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSystemParameter.g:2288:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2292:1: ( ( '[' ) )
            // InternalSystemParameter.g:2293:1: ( '[' )
            {
            // InternalSystemParameter.g:2293:1: ( '[' )
            // InternalSystemParameter.g:2294:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,40,FOLLOW_2); 
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
    // InternalSystemParameter.g:2303:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2307:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalSystemParameter.g:2308:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_29);
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
    // InternalSystemParameter.g:2315:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_1 ) ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2319:1: ( ( ( rule__ArrayValue__ValuesAssignment_1 ) ) )
            // InternalSystemParameter.g:2320:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            {
            // InternalSystemParameter.g:2320:1: ( ( rule__ArrayValue__ValuesAssignment_1 ) )
            // InternalSystemParameter.g:2321:2: ( rule__ArrayValue__ValuesAssignment_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_1()); 
            // InternalSystemParameter.g:2322:2: ( rule__ArrayValue__ValuesAssignment_1 )
            // InternalSystemParameter.g:2322:3: rule__ArrayValue__ValuesAssignment_1
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
    // InternalSystemParameter.g:2330:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2334:1: ( rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3 )
            // InternalSystemParameter.g:2335:2: rule__ArrayValue__Group__2__Impl rule__ArrayValue__Group__3
            {
            pushFollow(FOLLOW_29);
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
    // InternalSystemParameter.g:2342:1: rule__ArrayValue__Group__2__Impl : ( ( rule__ArrayValue__Group_2__0 )* ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2346:1: ( ( ( rule__ArrayValue__Group_2__0 )* ) )
            // InternalSystemParameter.g:2347:1: ( ( rule__ArrayValue__Group_2__0 )* )
            {
            // InternalSystemParameter.g:2347:1: ( ( rule__ArrayValue__Group_2__0 )* )
            // InternalSystemParameter.g:2348:2: ( rule__ArrayValue__Group_2__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_2()); 
            // InternalSystemParameter.g:2349:2: ( rule__ArrayValue__Group_2__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==42) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalSystemParameter.g:2349:3: rule__ArrayValue__Group_2__0
            	    {
            	    pushFollow(FOLLOW_30);
            	    rule__ArrayValue__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalSystemParameter.g:2357:1: rule__ArrayValue__Group__3 : rule__ArrayValue__Group__3__Impl ;
    public final void rule__ArrayValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2361:1: ( rule__ArrayValue__Group__3__Impl )
            // InternalSystemParameter.g:2362:2: rule__ArrayValue__Group__3__Impl
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
    // InternalSystemParameter.g:2368:1: rule__ArrayValue__Group__3__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2372:1: ( ( ']' ) )
            // InternalSystemParameter.g:2373:1: ( ']' )
            {
            // InternalSystemParameter.g:2373:1: ( ']' )
            // InternalSystemParameter.g:2374:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_3()); 
            match(input,41,FOLLOW_2); 
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
    // InternalSystemParameter.g:2384:1: rule__ArrayValue__Group_2__0 : rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 ;
    public final void rule__ArrayValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2388:1: ( rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1 )
            // InternalSystemParameter.g:2389:2: rule__ArrayValue__Group_2__0__Impl rule__ArrayValue__Group_2__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSystemParameter.g:2396:1: rule__ArrayValue__Group_2__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2400:1: ( ( ',' ) )
            // InternalSystemParameter.g:2401:1: ( ',' )
            {
            // InternalSystemParameter.g:2401:1: ( ',' )
            // InternalSystemParameter.g:2402:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_2_0()); 
            match(input,42,FOLLOW_2); 
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
    // InternalSystemParameter.g:2411:1: rule__ArrayValue__Group_2__1 : rule__ArrayValue__Group_2__1__Impl ;
    public final void rule__ArrayValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2415:1: ( rule__ArrayValue__Group_2__1__Impl )
            // InternalSystemParameter.g:2416:2: rule__ArrayValue__Group_2__1__Impl
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
    // InternalSystemParameter.g:2422:1: rule__ArrayValue__Group_2__1__Impl : ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) ;
    public final void rule__ArrayValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2426:1: ( ( ( rule__ArrayValue__ValuesAssignment_2_1 ) ) )
            // InternalSystemParameter.g:2427:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            {
            // InternalSystemParameter.g:2427:1: ( ( rule__ArrayValue__ValuesAssignment_2_1 ) )
            // InternalSystemParameter.g:2428:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            {
             before(grammarAccess.getArrayValueAccess().getValuesAssignment_2_1()); 
            // InternalSystemParameter.g:2429:2: ( rule__ArrayValue__ValuesAssignment_2_1 )
            // InternalSystemParameter.g:2429:3: rule__ArrayValue__ValuesAssignment_2_1
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
    // InternalSystemParameter.g:2438:1: rule__SingleValue__Group_0__0 : rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 ;
    public final void rule__SingleValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2442:1: ( rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1 )
            // InternalSystemParameter.g:2443:2: rule__SingleValue__Group_0__0__Impl rule__SingleValue__Group_0__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalSystemParameter.g:2450:1: rule__SingleValue__Group_0__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2454:1: ( ( () ) )
            // InternalSystemParameter.g:2455:1: ( () )
            {
            // InternalSystemParameter.g:2455:1: ( () )
            // InternalSystemParameter.g:2456:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getIntValueAction_0_0()); 
            // InternalSystemParameter.g:2457:2: ()
            // InternalSystemParameter.g:2457:3: 
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
    // InternalSystemParameter.g:2465:1: rule__SingleValue__Group_0__1 : rule__SingleValue__Group_0__1__Impl ;
    public final void rule__SingleValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2469:1: ( rule__SingleValue__Group_0__1__Impl )
            // InternalSystemParameter.g:2470:2: rule__SingleValue__Group_0__1__Impl
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
    // InternalSystemParameter.g:2476:1: rule__SingleValue__Group_0__1__Impl : ( ( rule__SingleValue__ValueAssignment_0_1 ) ) ;
    public final void rule__SingleValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2480:1: ( ( ( rule__SingleValue__ValueAssignment_0_1 ) ) )
            // InternalSystemParameter.g:2481:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            {
            // InternalSystemParameter.g:2481:1: ( ( rule__SingleValue__ValueAssignment_0_1 ) )
            // InternalSystemParameter.g:2482:2: ( rule__SingleValue__ValueAssignment_0_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_0_1()); 
            // InternalSystemParameter.g:2483:2: ( rule__SingleValue__ValueAssignment_0_1 )
            // InternalSystemParameter.g:2483:3: rule__SingleValue__ValueAssignment_0_1
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
    // InternalSystemParameter.g:2492:1: rule__SingleValue__Group_1__0 : rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 ;
    public final void rule__SingleValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2496:1: ( rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1 )
            // InternalSystemParameter.g:2497:2: rule__SingleValue__Group_1__0__Impl rule__SingleValue__Group_1__1
            {
            pushFollow(FOLLOW_20);
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
    // InternalSystemParameter.g:2504:1: rule__SingleValue__Group_1__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2508:1: ( ( () ) )
            // InternalSystemParameter.g:2509:1: ( () )
            {
            // InternalSystemParameter.g:2509:1: ( () )
            // InternalSystemParameter.g:2510:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getFloatingPointValueAction_1_0()); 
            // InternalSystemParameter.g:2511:2: ()
            // InternalSystemParameter.g:2511:3: 
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
    // InternalSystemParameter.g:2519:1: rule__SingleValue__Group_1__1 : rule__SingleValue__Group_1__1__Impl ;
    public final void rule__SingleValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2523:1: ( rule__SingleValue__Group_1__1__Impl )
            // InternalSystemParameter.g:2524:2: rule__SingleValue__Group_1__1__Impl
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
    // InternalSystemParameter.g:2530:1: rule__SingleValue__Group_1__1__Impl : ( ( rule__SingleValue__ValueAssignment_1_1 ) ) ;
    public final void rule__SingleValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2534:1: ( ( ( rule__SingleValue__ValueAssignment_1_1 ) ) )
            // InternalSystemParameter.g:2535:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            {
            // InternalSystemParameter.g:2535:1: ( ( rule__SingleValue__ValueAssignment_1_1 ) )
            // InternalSystemParameter.g:2536:2: ( rule__SingleValue__ValueAssignment_1_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_1_1()); 
            // InternalSystemParameter.g:2537:2: ( rule__SingleValue__ValueAssignment_1_1 )
            // InternalSystemParameter.g:2537:3: rule__SingleValue__ValueAssignment_1_1
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
    // InternalSystemParameter.g:2546:1: rule__SingleValue__Group_2__0 : rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 ;
    public final void rule__SingleValue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2550:1: ( rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1 )
            // InternalSystemParameter.g:2551:2: rule__SingleValue__Group_2__0__Impl rule__SingleValue__Group_2__1
            {
            pushFollow(FOLLOW_31);
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
    // InternalSystemParameter.g:2558:1: rule__SingleValue__Group_2__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2562:1: ( ( () ) )
            // InternalSystemParameter.g:2563:1: ( () )
            {
            // InternalSystemParameter.g:2563:1: ( () )
            // InternalSystemParameter.g:2564:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getStringValueAction_2_0()); 
            // InternalSystemParameter.g:2565:2: ()
            // InternalSystemParameter.g:2565:3: 
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
    // InternalSystemParameter.g:2573:1: rule__SingleValue__Group_2__1 : rule__SingleValue__Group_2__1__Impl ;
    public final void rule__SingleValue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2577:1: ( rule__SingleValue__Group_2__1__Impl )
            // InternalSystemParameter.g:2578:2: rule__SingleValue__Group_2__1__Impl
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
    // InternalSystemParameter.g:2584:1: rule__SingleValue__Group_2__1__Impl : ( ( rule__SingleValue__ValueAssignment_2_1 ) ) ;
    public final void rule__SingleValue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2588:1: ( ( ( rule__SingleValue__ValueAssignment_2_1 ) ) )
            // InternalSystemParameter.g:2589:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            {
            // InternalSystemParameter.g:2589:1: ( ( rule__SingleValue__ValueAssignment_2_1 ) )
            // InternalSystemParameter.g:2590:2: ( rule__SingleValue__ValueAssignment_2_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_2_1()); 
            // InternalSystemParameter.g:2591:2: ( rule__SingleValue__ValueAssignment_2_1 )
            // InternalSystemParameter.g:2591:3: rule__SingleValue__ValueAssignment_2_1
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
    // InternalSystemParameter.g:2600:1: rule__SingleValue__Group_3__0 : rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 ;
    public final void rule__SingleValue__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2604:1: ( rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1 )
            // InternalSystemParameter.g:2605:2: rule__SingleValue__Group_3__0__Impl rule__SingleValue__Group_3__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalSystemParameter.g:2612:1: rule__SingleValue__Group_3__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2616:1: ( ( () ) )
            // InternalSystemParameter.g:2617:1: ( () )
            {
            // InternalSystemParameter.g:2617:1: ( () )
            // InternalSystemParameter.g:2618:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getBoolValueAction_3_0()); 
            // InternalSystemParameter.g:2619:2: ()
            // InternalSystemParameter.g:2619:3: 
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
    // InternalSystemParameter.g:2627:1: rule__SingleValue__Group_3__1 : rule__SingleValue__Group_3__1__Impl ;
    public final void rule__SingleValue__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2631:1: ( rule__SingleValue__Group_3__1__Impl )
            // InternalSystemParameter.g:2632:2: rule__SingleValue__Group_3__1__Impl
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
    // InternalSystemParameter.g:2638:1: rule__SingleValue__Group_3__1__Impl : ( ( rule__SingleValue__ValueAssignment_3_1 ) ) ;
    public final void rule__SingleValue__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2642:1: ( ( ( rule__SingleValue__ValueAssignment_3_1 ) ) )
            // InternalSystemParameter.g:2643:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            {
            // InternalSystemParameter.g:2643:1: ( ( rule__SingleValue__ValueAssignment_3_1 ) )
            // InternalSystemParameter.g:2644:2: ( rule__SingleValue__ValueAssignment_3_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_3_1()); 
            // InternalSystemParameter.g:2645:2: ( rule__SingleValue__ValueAssignment_3_1 )
            // InternalSystemParameter.g:2645:3: rule__SingleValue__ValueAssignment_3_1
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
    // InternalSystemParameter.g:2654:1: rule__SingleValue__Group_4__0 : rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 ;
    public final void rule__SingleValue__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2658:1: ( rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1 )
            // InternalSystemParameter.g:2659:2: rule__SingleValue__Group_4__0__Impl rule__SingleValue__Group_4__1
            {
            pushFollow(FOLLOW_28);
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
    // InternalSystemParameter.g:2666:1: rule__SingleValue__Group_4__0__Impl : ( () ) ;
    public final void rule__SingleValue__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2670:1: ( ( () ) )
            // InternalSystemParameter.g:2671:1: ( () )
            {
            // InternalSystemParameter.g:2671:1: ( () )
            // InternalSystemParameter.g:2672:2: ()
            {
             before(grammarAccess.getSingleValueAccess().getEnumerationValueAction_4_0()); 
            // InternalSystemParameter.g:2673:2: ()
            // InternalSystemParameter.g:2673:3: 
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
    // InternalSystemParameter.g:2681:1: rule__SingleValue__Group_4__1 : rule__SingleValue__Group_4__1__Impl ;
    public final void rule__SingleValue__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2685:1: ( rule__SingleValue__Group_4__1__Impl )
            // InternalSystemParameter.g:2686:2: rule__SingleValue__Group_4__1__Impl
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
    // InternalSystemParameter.g:2692:1: rule__SingleValue__Group_4__1__Impl : ( ( rule__SingleValue__ValueAssignment_4_1 ) ) ;
    public final void rule__SingleValue__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2696:1: ( ( ( rule__SingleValue__ValueAssignment_4_1 ) ) )
            // InternalSystemParameter.g:2697:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            {
            // InternalSystemParameter.g:2697:1: ( ( rule__SingleValue__ValueAssignment_4_1 ) )
            // InternalSystemParameter.g:2698:2: ( rule__SingleValue__ValueAssignment_4_1 )
            {
             before(grammarAccess.getSingleValueAccess().getValueAssignment_4_1()); 
            // InternalSystemParameter.g:2699:2: ( rule__SingleValue__ValueAssignment_4_1 )
            // InternalSystemParameter.g:2699:3: rule__SingleValue__ValueAssignment_4_1
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


    // $ANTLR start "rule__SystemParamModel__NameAssignment_2"
    // InternalSystemParameter.g:2708:1: rule__SystemParamModel__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__SystemParamModel__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2712:1: ( ( RULE_ID ) )
            // InternalSystemParameter.g:2713:2: ( RULE_ID )
            {
            // InternalSystemParameter.g:2713:2: ( RULE_ID )
            // InternalSystemParameter.g:2714:3: RULE_ID
            {
             before(grammarAccess.getSystemParamModelAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSystemParamModelAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__NameAssignment_2"


    // $ANTLR start "rule__SystemParamModel__SystemAssignment_4"
    // InternalSystemParameter.g:2723:1: rule__SystemParamModel__SystemAssignment_4 : ( ( ruleFQN ) ) ;
    public final void rule__SystemParamModel__SystemAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2727:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:2728:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:2728:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:2729:3: ( ruleFQN )
            {
             before(grammarAccess.getSystemParamModelAccess().getSystemSystemComponentArchitectureCrossReference_4_0()); 
            // InternalSystemParameter.g:2730:3: ( ruleFQN )
            // InternalSystemParameter.g:2731:4: ruleFQN
            {
             before(grammarAccess.getSystemParamModelAccess().getSystemSystemComponentArchitectureFQNParserRuleCall_4_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getSystemParamModelAccess().getSystemSystemComponentArchitectureFQNParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getSystemParamModelAccess().getSystemSystemComponentArchitectureCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__SystemAssignment_4"


    // $ANTLR start "rule__SystemParamModel__ComponentsAssignment_6"
    // InternalSystemParameter.g:2742:1: rule__SystemParamModel__ComponentsAssignment_6 : ( ruleComponentParameterInstance ) ;
    public final void rule__SystemParamModel__ComponentsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2746:1: ( ( ruleComponentParameterInstance ) )
            // InternalSystemParameter.g:2747:2: ( ruleComponentParameterInstance )
            {
            // InternalSystemParameter.g:2747:2: ( ruleComponentParameterInstance )
            // InternalSystemParameter.g:2748:3: ruleComponentParameterInstance
            {
             before(grammarAccess.getSystemParamModelAccess().getComponentsComponentParameterInstanceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentParameterInstance();

            state._fsp--;

             after(grammarAccess.getSystemParamModelAccess().getComponentsComponentParameterInstanceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SystemParamModel__ComponentsAssignment_6"


    // $ANTLR start "rule__ComponentParameterInstance__ComponentInstanceAssignment_1"
    // InternalSystemParameter.g:2757:1: rule__ComponentParameterInstance__ComponentInstanceAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentParameterInstance__ComponentInstanceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2761:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:2762:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:2762:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:2763:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentInstanceComponentInstanceCrossReference_1_0()); 
            // InternalSystemParameter.g:2764:3: ( ruleFQN )
            // InternalSystemParameter.g:2765:4: ruleFQN
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentInstanceComponentInstanceFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentParameterInstanceAccess().getComponentInstanceComponentInstanceFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentParameterInstanceAccess().getComponentInstanceComponentInstanceCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__ComponentInstanceAssignment_1"


    // $ANTLR start "rule__ComponentParameterInstance__ComponentParamAssignment_2_1"
    // InternalSystemParameter.g:2776:1: rule__ComponentParameterInstance__ComponentParamAssignment_2_1 : ( ( ruleFQN ) ) ;
    public final void rule__ComponentParameterInstance__ComponentParamAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2780:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:2781:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:2781:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:2782:3: ( ruleFQN )
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentParamComponentParameterCrossReference_2_1_0()); 
            // InternalSystemParameter.g:2783:3: ( ruleFQN )
            // InternalSystemParameter.g:2784:4: ruleFQN
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getComponentParamComponentParameterFQNParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getComponentParameterInstanceAccess().getComponentParamComponentParameterFQNParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getComponentParameterInstanceAccess().getComponentParamComponentParameterCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__ComponentParamAssignment_2_1"


    // $ANTLR start "rule__ComponentParameterInstance__ParametersAssignment_4"
    // InternalSystemParameter.g:2795:1: rule__ComponentParameterInstance__ParametersAssignment_4 : ( ruleParameterRefinement ) ;
    public final void rule__ComponentParameterInstance__ParametersAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2799:1: ( ( ruleParameterRefinement ) )
            // InternalSystemParameter.g:2800:2: ( ruleParameterRefinement )
            {
            // InternalSystemParameter.g:2800:2: ( ruleParameterRefinement )
            // InternalSystemParameter.g:2801:3: ruleParameterRefinement
            {
             before(grammarAccess.getComponentParameterInstanceAccess().getParametersParameterRefinementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleParameterRefinement();

            state._fsp--;

             after(grammarAccess.getComponentParameterInstanceAccess().getParametersParameterRefinementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentParameterInstance__ParametersAssignment_4"


    // $ANTLR start "rule__ParameterRefinement__ParameterAssignment_1"
    // InternalSystemParameter.g:2810:1: rule__ParameterRefinement__ParameterAssignment_1 : ( ( ruleFQN ) ) ;
    public final void rule__ParameterRefinement__ParameterAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2814:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:2815:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:2815:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:2816:3: ( ruleFQN )
            {
             before(grammarAccess.getParameterRefinementAccess().getParameterComponentParameterBaseCrossReference_1_0()); 
            // InternalSystemParameter.g:2817:3: ( ruleFQN )
            // InternalSystemParameter.g:2818:4: ruleFQN
            {
             before(grammarAccess.getParameterRefinementAccess().getParameterComponentParameterBaseFQNParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getParameterRefinementAccess().getParameterComponentParameterBaseFQNParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getParameterRefinementAccess().getParameterComponentParameterBaseCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__ParameterAssignment_1"


    // $ANTLR start "rule__ParameterRefinement__AttributesAssignment_3"
    // InternalSystemParameter.g:2829:1: rule__ParameterRefinement__AttributesAssignment_3 : ( ruleAttributeRefinement ) ;
    public final void rule__ParameterRefinement__AttributesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2833:1: ( ( ruleAttributeRefinement ) )
            // InternalSystemParameter.g:2834:2: ( ruleAttributeRefinement )
            {
            // InternalSystemParameter.g:2834:2: ( ruleAttributeRefinement )
            // InternalSystemParameter.g:2835:3: ruleAttributeRefinement
            {
             before(grammarAccess.getParameterRefinementAccess().getAttributesAttributeRefinementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAttributeRefinement();

            state._fsp--;

             after(grammarAccess.getParameterRefinementAccess().getAttributesAttributeRefinementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterRefinement__AttributesAssignment_3"


    // $ANTLR start "rule__AttributeRefinement__AttributeAssignment_0"
    // InternalSystemParameter.g:2844:1: rule__AttributeRefinement__AttributeAssignment_0 : ( ( ruleFQN ) ) ;
    public final void rule__AttributeRefinement__AttributeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2848:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:2849:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:2849:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:2850:3: ( ruleFQN )
            {
             before(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionCrossReference_0_0()); 
            // InternalSystemParameter.g:2851:3: ( ruleFQN )
            // InternalSystemParameter.g:2852:4: ruleFQN
            {
             before(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionFQNParserRuleCall_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionFQNParserRuleCall_0_0_1()); 

            }

             after(grammarAccess.getAttributeRefinementAccess().getAttributeAttributeDefinitionCrossReference_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__AttributeAssignment_0"


    // $ANTLR start "rule__AttributeRefinement__ValueAssignment_2"
    // InternalSystemParameter.g:2863:1: rule__AttributeRefinement__ValueAssignment_2 : ( ruleAbstractValue ) ;
    public final void rule__AttributeRefinement__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2867:1: ( ( ruleAbstractValue ) )
            // InternalSystemParameter.g:2868:2: ( ruleAbstractValue )
            {
            // InternalSystemParameter.g:2868:2: ( ruleAbstractValue )
            // InternalSystemParameter.g:2869:3: ruleAbstractValue
            {
             before(grammarAccess.getAttributeRefinementAccess().getValueAbstractValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAbstractValue();

            state._fsp--;

             after(grammarAccess.getAttributeRefinementAccess().getValueAbstractValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeRefinement__ValueAssignment_2"


    // $ANTLR start "rule__EnumerationElement__NameAssignment_0"
    // InternalSystemParameter.g:2878:1: rule__EnumerationElement__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EnumerationElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2882:1: ( ( RULE_ID ) )
            // InternalSystemParameter.g:2883:2: ( RULE_ID )
            {
            // InternalSystemParameter.g:2883:2: ( RULE_ID )
            // InternalSystemParameter.g:2884:3: RULE_ID
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
    // InternalSystemParameter.g:2893:1: rule__EnumerationElement__ValueAssignment_1_1 : ( ruleEInt ) ;
    public final void rule__EnumerationElement__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2897:1: ( ( ruleEInt ) )
            // InternalSystemParameter.g:2898:2: ( ruleEInt )
            {
            // InternalSystemParameter.g:2898:2: ( ruleEInt )
            // InternalSystemParameter.g:2899:3: ruleEInt
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
    // InternalSystemParameter.g:2908:1: rule__InlineEnumerationType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__InlineEnumerationType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2912:1: ( ( ruleArrayType ) )
            // InternalSystemParameter.g:2913:2: ( ruleArrayType )
            {
            // InternalSystemParameter.g:2913:2: ( ruleArrayType )
            // InternalSystemParameter.g:2914:3: ruleArrayType
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
    // InternalSystemParameter.g:2923:1: rule__InlineEnumerationType__EnumsAssignment_3 : ( ruleEnumerationElement ) ;
    public final void rule__InlineEnumerationType__EnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2927:1: ( ( ruleEnumerationElement ) )
            // InternalSystemParameter.g:2928:2: ( ruleEnumerationElement )
            {
            // InternalSystemParameter.g:2928:2: ( ruleEnumerationElement )
            // InternalSystemParameter.g:2929:3: ruleEnumerationElement
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
    // InternalSystemParameter.g:2938:1: rule__ArrayType__LengthAssignment_2 : ( ruleCardinality ) ;
    public final void rule__ArrayType__LengthAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2942:1: ( ( ruleCardinality ) )
            // InternalSystemParameter.g:2943:2: ( ruleCardinality )
            {
            // InternalSystemParameter.g:2943:2: ( ruleCardinality )
            // InternalSystemParameter.g:2944:3: ruleCardinality
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
    // InternalSystemParameter.g:2953:1: rule__PrimitiveType__TypeNameAssignment_0 : ( rulePRIMITIVE_TYPE_NAME ) ;
    public final void rule__PrimitiveType__TypeNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2957:1: ( ( rulePRIMITIVE_TYPE_NAME ) )
            // InternalSystemParameter.g:2958:2: ( rulePRIMITIVE_TYPE_NAME )
            {
            // InternalSystemParameter.g:2958:2: ( rulePRIMITIVE_TYPE_NAME )
            // InternalSystemParameter.g:2959:3: rulePRIMITIVE_TYPE_NAME
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
    // InternalSystemParameter.g:2968:1: rule__PrimitiveType__ArrayAssignment_1 : ( ruleArrayType ) ;
    public final void rule__PrimitiveType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2972:1: ( ( ruleArrayType ) )
            // InternalSystemParameter.g:2973:2: ( ruleArrayType )
            {
            // InternalSystemParameter.g:2973:2: ( ruleArrayType )
            // InternalSystemParameter.g:2974:3: ruleArrayType
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
    // InternalSystemParameter.g:2983:1: rule__ArrayValue__ValuesAssignment_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:2987:1: ( ( ruleSingleValue ) )
            // InternalSystemParameter.g:2988:2: ( ruleSingleValue )
            {
            // InternalSystemParameter.g:2988:2: ( ruleSingleValue )
            // InternalSystemParameter.g:2989:3: ruleSingleValue
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
    // InternalSystemParameter.g:2998:1: rule__ArrayValue__ValuesAssignment_2_1 : ( ruleSingleValue ) ;
    public final void rule__ArrayValue__ValuesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3002:1: ( ( ruleSingleValue ) )
            // InternalSystemParameter.g:3003:2: ( ruleSingleValue )
            {
            // InternalSystemParameter.g:3003:2: ( ruleSingleValue )
            // InternalSystemParameter.g:3004:3: ruleSingleValue
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
    // InternalSystemParameter.g:3013:1: rule__SingleValue__ValueAssignment_0_1 : ( ruleEInt ) ;
    public final void rule__SingleValue__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3017:1: ( ( ruleEInt ) )
            // InternalSystemParameter.g:3018:2: ( ruleEInt )
            {
            // InternalSystemParameter.g:3018:2: ( ruleEInt )
            // InternalSystemParameter.g:3019:3: ruleEInt
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
    // InternalSystemParameter.g:3028:1: rule__SingleValue__ValueAssignment_1_1 : ( ruleEDouble ) ;
    public final void rule__SingleValue__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3032:1: ( ( ruleEDouble ) )
            // InternalSystemParameter.g:3033:2: ( ruleEDouble )
            {
            // InternalSystemParameter.g:3033:2: ( ruleEDouble )
            // InternalSystemParameter.g:3034:3: ruleEDouble
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
    // InternalSystemParameter.g:3043:1: rule__SingleValue__ValueAssignment_2_1 : ( ruleEString ) ;
    public final void rule__SingleValue__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3047:1: ( ( ruleEString ) )
            // InternalSystemParameter.g:3048:2: ( ruleEString )
            {
            // InternalSystemParameter.g:3048:2: ( ruleEString )
            // InternalSystemParameter.g:3049:3: ruleEString
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
    // InternalSystemParameter.g:3058:1: rule__SingleValue__ValueAssignment_3_1 : ( ruleEBoolean ) ;
    public final void rule__SingleValue__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3062:1: ( ( ruleEBoolean ) )
            // InternalSystemParameter.g:3063:2: ( ruleEBoolean )
            {
            // InternalSystemParameter.g:3063:2: ( ruleEBoolean )
            // InternalSystemParameter.g:3064:3: ruleEBoolean
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
    // InternalSystemParameter.g:3073:1: rule__SingleValue__ValueAssignment_4_1 : ( ( ruleFQN ) ) ;
    public final void rule__SingleValue__ValueAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSystemParameter.g:3077:1: ( ( ( ruleFQN ) ) )
            // InternalSystemParameter.g:3078:2: ( ( ruleFQN ) )
            {
            // InternalSystemParameter.g:3078:2: ( ( ruleFQN ) )
            // InternalSystemParameter.g:3079:3: ( ruleFQN )
            {
             before(grammarAccess.getSingleValueAccess().getValueEnumerationElementCrossReference_4_1_0()); 
            // InternalSystemParameter.g:3080:3: ( ruleFQN )
            // InternalSystemParameter.g:3081:4: ruleFQN
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
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000480000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000080000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000016000001870L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000006000000020L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000008020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000006000001870L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000001800L});

}